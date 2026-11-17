package com.transsion.transfer.androidasync.http.server;

import com.transsion.transfer.androidasync.ByteBufferList;
import com.transsion.transfer.androidasync.C19944t;
import com.transsion.transfer.androidasync.InterfaceC19937p;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.server.p */
/* JADX INFO: loaded from: classes6.dex */
public class C19919p extends C19944t {

    /* JADX INFO: renamed from: g */
    private byte[] f63516g;

    /* JADX INFO: renamed from: h */
    int f63517h = 2;

    @Override // com.transsion.transfer.androidasync.C19944t, p439gv.InterfaceC23680d
    /* JADX INFO: renamed from: F */
    public void mo82444F(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
        if (this.f63517h > 0) {
            ByteBuffer byteBufferM82491t = ByteBufferList.m82491t(this.f63516g.length);
            byteBufferM82491t.put(this.f63516g, 0, this.f63517h);
            byteBufferM82491t.flip();
            byteBufferList.m82500c(byteBufferM82491t);
            this.f63517h = 0;
        }
        int iM82494C = byteBufferList.m82494C();
        byte[] bArr = new byte[iM82494C];
        byteBufferList.m82504h(bArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < iM82494C) {
            int i13 = this.f63517h;
            if (i13 >= 0) {
                byte b11 = bArr[i11];
                byte[] bArr2 = this.f63516g;
                if (b11 == bArr2[i13]) {
                    int i14 = i13 + 1;
                    this.f63517h = i14;
                    if (i14 == bArr2.length) {
                        this.f63517h = -1;
                    }
                } else if (i13 > 0) {
                    i11 -= i13;
                    this.f63517h = 0;
                }
            } else if (i13 == -1) {
                byte b12 = bArr[i11];
                if (b12 == 13) {
                    this.f63517h = -4;
                    int length = (i11 - i12) - this.f63516g.length;
                    if (i12 != 0 || length != 0) {
                        ByteBuffer byteBufferPut = ByteBufferList.m82491t(length).put(bArr, i12, length);
                        byteBufferPut.flip();
                        ByteBufferList byteBufferList2 = new ByteBufferList();
                        byteBufferList2.m82498a(byteBufferPut);
                        super.mo82444F(this, byteBufferList2);
                    }
                    mo82840S();
                } else {
                    if (b12 != 45) {
                        mo82624M(new MimeEncodingException("Invalid multipart/form-data. Expected \r or -"));
                        return;
                    }
                    this.f63517h = -2;
                }
            } else if (i13 == -2) {
                if (bArr[i11] != 45) {
                    mo82624M(new MimeEncodingException("Invalid multipart/form-data. Expected -"));
                    return;
                }
                this.f63517h = -3;
            } else if (i13 == -3) {
                if (bArr[i11] != 13) {
                    mo82624M(new MimeEncodingException("Invalid multipart/form-data. Expected \r"));
                    return;
                }
                this.f63517h = -4;
                int i15 = i11 - i12;
                ByteBuffer byteBufferPut2 = ByteBufferList.m82491t((i15 - this.f63516g.length) - 2).put(bArr, i12, (i15 - this.f63516g.length) - 2);
                byteBufferPut2.flip();
                ByteBufferList byteBufferList3 = new ByteBufferList();
                byteBufferList3.m82498a(byteBufferPut2);
                super.mo82444F(this, byteBufferList3);
                mo82839R();
            } else if (i13 != -4) {
                mo82624M(new MimeEncodingException("Invalid multipart/form-data. Unknown state?"));
            } else if (bArr[i11] == 10) {
                i12 = i11 + 1;
                this.f63517h = 0;
            } else {
                mo82624M(new MimeEncodingException("Invalid multipart/form-data. Expected \n"));
            }
            i11++;
        }
        if (i12 < iM82494C) {
            int iMax = (iM82494C - i12) - Math.max(this.f63517h, 0);
            ByteBuffer byteBufferPut3 = ByteBufferList.m82491t(iMax).put(bArr, i12, iMax);
            byteBufferPut3.flip();
            ByteBufferList byteBufferList4 = new ByteBufferList();
            byteBufferList4.m82498a(byteBufferPut3);
            super.mo82444F(this, byteBufferList4);
        }
    }

    /* JADX INFO: renamed from: O */
    public String m82836O() {
        byte[] bArr = this.f63516g;
        if (bArr == null) {
            return null;
        }
        return new String(bArr, 4, bArr.length - 4);
    }

    /* JADX INFO: renamed from: P */
    public String m82837P() {
        return m82838Q() + "--\r\n";
    }

    /* JADX INFO: renamed from: Q */
    public String m82838Q() {
        byte[] bArr = this.f63516g;
        return new String(bArr, 2, bArr.length - 2);
    }

    /* JADX INFO: renamed from: R */
    protected void mo82839R() {
    }

    /* JADX INFO: renamed from: S */
    protected void mo82840S() {
    }

    /* JADX INFO: renamed from: T */
    public void m82841T(String str) {
        this.f63516g = ("\r\n--" + str).getBytes();
    }
}
