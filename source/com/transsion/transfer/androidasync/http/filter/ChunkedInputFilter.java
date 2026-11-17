package com.transsion.transfer.androidasync.http.filter;

import com.transsion.transfer.androidasync.ByteBufferList;
import com.transsion.transfer.androidasync.C19809a0;
import com.transsion.transfer.androidasync.C19944t;
import com.transsion.transfer.androidasync.InterfaceC19937p;

/* JADX INFO: loaded from: classes6.dex */
public class ChunkedInputFilter extends C19944t {

    /* JADX INFO: renamed from: g */
    private int f63370g = 0;

    /* JADX INFO: renamed from: h */
    private int f63371h = 0;

    /* JADX INFO: renamed from: i */
    private State f63372i = State.CHUNK_LEN;

    /* JADX INFO: renamed from: j */
    ByteBufferList f63373j = new ByteBufferList();

    private enum State {
        CHUNK_LEN,
        CHUNK_LEN_CR,
        CHUNK_LEN_CRLF,
        CHUNK,
        CHUNK_CR,
        CHUNK_CRLF,
        COMPLETE,
        ERROR
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.filter.ChunkedInputFilter$a */
    static /* synthetic */ class C19888a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f63374a;

        static {
            int[] iArr = new int[State.values().length];
            f63374a = iArr;
            try {
                iArr[State.CHUNK_LEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63374a[State.CHUNK_LEN_CR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63374a[State.CHUNK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63374a[State.CHUNK_CR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63374a[State.CHUNK_CRLF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63374a[State.COMPLETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: O */
    private boolean m82718O(char c11, char c12) {
        if (c11 == c12) {
            return true;
        }
        this.f63372i = State.ERROR;
        mo82624M(new ChunkedDataException(c12 + " was expected, got " + c11));
        return false;
    }

    /* JADX INFO: renamed from: P */
    private boolean m82719P(char c11) {
        return m82718O(c11, '\r');
    }

    /* JADX INFO: renamed from: Q */
    private boolean m82720Q(char c11) {
        return m82718O(c11, '\n');
    }

    @Override // com.transsion.transfer.androidasync.C19944t, p439gv.InterfaceC23680d
    /* JADX INFO: renamed from: F */
    public void mo82444F(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
        if (this.f63372i == State.ERROR) {
            byteBufferList.m82493B();
            return;
        }
        while (byteBufferList.m82494C() > 0) {
            try {
                switch (C19888a.f63374a[this.f63372i.ordinal()]) {
                    case 1:
                        char cM82509m = byteBufferList.m82509m();
                        if (cM82509m == '\r') {
                            this.f63372i = State.CHUNK_LEN_CR;
                        } else {
                            int i11 = this.f63370g * 16;
                            this.f63370g = i11;
                            if (cM82509m >= 'a' && cM82509m <= 'f') {
                                this.f63370g = i11 + (cM82509m - 'W');
                            } else if (cM82509m >= '0' && cM82509m <= '9') {
                                this.f63370g = i11 + (cM82509m - '0');
                            } else {
                                if (cM82509m < 'A' || cM82509m > 'F') {
                                    mo82624M(new ChunkedDataException("invalid chunk length: " + cM82509m));
                                    return;
                                }
                                this.f63370g = i11 + (cM82509m - '7');
                            }
                        }
                        this.f63371h = this.f63370g;
                        continue;
                    case 2:
                        if (m82720Q(byteBufferList.m82509m())) {
                            this.f63372i = State.CHUNK;
                            continue;
                        } else {
                            return;
                        }
                        break;
                    case 3:
                        int iMin = Math.min(this.f63371h, byteBufferList.m82494C());
                        int i12 = this.f63371h - iMin;
                        this.f63371h = i12;
                        if (i12 == 0) {
                            this.f63372i = State.CHUNK_CR;
                        }
                        if (iMin != 0) {
                            byteBufferList.m82503g(this.f63373j, iMin);
                            C19809a0.m82520a(this, this.f63373j);
                            continue;
                        }
                        break;
                    case 4:
                        if (m82719P(byteBufferList.m82509m())) {
                            this.f63372i = State.CHUNK_CRLF;
                            continue;
                        } else {
                            return;
                        }
                        break;
                    case 5:
                        if (m82720Q(byteBufferList.m82509m())) {
                            if (this.f63370g > 0) {
                                this.f63372i = State.CHUNK_LEN;
                            } else {
                                this.f63372i = State.COMPLETE;
                                mo82624M(null);
                            }
                            this.f63370g = 0;
                            continue;
                        } else {
                            return;
                        }
                        break;
                    case 6:
                        return;
                    default:
                        continue;
                }
            } catch (Exception e11) {
                mo82624M(e11);
                return;
            }
            mo82624M(e11);
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.transsion.transfer.androidasync.AbstractC19938q
    /* JADX INFO: renamed from: M */
    public void mo82624M(Exception exc) {
        if (exc == null && this.f63372i != State.COMPLETE) {
            exc = new ChunkedDataException("chunked input ended before final chunk");
        }
        super.mo82624M(exc);
    }
}
