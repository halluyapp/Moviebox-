package com.transsion.transfer.androidasync;

import android.os.Looper;
import com.transsion.transfer.androidasync.util.ArrayDeque;
import com.transsion.transfer.androidasync.util.C19952c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes6.dex */
public class ByteBufferList {

    /* JADX INFO: renamed from: d */
    static PriorityQueue f63186d = new PriorityQueue(8, new Reclaimer());

    /* JADX INFO: renamed from: e */
    private static int f63187e = 1048576;

    /* JADX INFO: renamed from: f */
    public static int f63188f = 262144;

    /* JADX INFO: renamed from: g */
    static int f63189g = 0;

    /* JADX INFO: renamed from: h */
    static int f63190h = 0;

    /* JADX INFO: renamed from: i */
    private static final Object f63191i = new Object();

    /* JADX INFO: renamed from: j */
    public static final ByteBuffer f63192j = ByteBuffer.allocate(0);

    /* JADX INFO: renamed from: a */
    ArrayDeque f63193a = new ArrayDeque();

    /* JADX INFO: renamed from: b */
    ByteOrder f63194b = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: c */
    private int f63195c = 0;

    static class Reclaimer implements Comparator<ByteBuffer> {
        Reclaimer() {
        }

        @Override // java.util.Comparator
        public int compare(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            if (byteBuffer.capacity() == byteBuffer2.capacity()) {
                return 0;
            }
            return byteBuffer.capacity() > byteBuffer2.capacity() ? 1 : -1;
        }
    }

    public ByteBufferList() {
    }

    public ByteBufferList(byte[] bArr) {
        m82498a(ByteBuffer.wrap(bArr));
    }

    public ByteBufferList(ByteBuffer... byteBufferArr) {
        m82499b(byteBufferArr);
    }

    /* JADX INFO: renamed from: A */
    public static void m82488A(ByteBuffer byteBuffer) {
        PriorityQueue priorityQueueM82490p;
        if (byteBuffer == null || byteBuffer.isDirect() || byteBuffer.arrayOffset() != 0 || byteBuffer.array().length != byteBuffer.capacity() || byteBuffer.capacity() < 8192 || byteBuffer.capacity() > f63188f || (priorityQueueM82490p = m82490p()) == null) {
            return;
        }
        synchronized (f63191i) {
            while (f63189g > f63187e && priorityQueueM82490p.size() > 0 && ((ByteBuffer) priorityQueueM82490p.peek()).capacity() < byteBuffer.capacity()) {
                try {
                    f63189g -= ((ByteBuffer) priorityQueueM82490p.remove()).capacity();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (f63189g > f63187e) {
                return;
            }
            byteBuffer.position(0);
            byteBuffer.limit(byteBuffer.capacity());
            f63189g += byteBuffer.capacity();
            priorityQueueM82490p.add(byteBuffer);
            f63190h = Math.max(f63190h, byteBuffer.capacity());
        }
    }

    /* JADX INFO: renamed from: d */
    private void m82489d(int i11) {
        if (m82494C() >= 0) {
            this.f63195c += i11;
        }
    }

    /* JADX INFO: renamed from: p */
    private static PriorityQueue m82490p() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null || Thread.currentThread() != mainLooper.getThread()) {
            return f63186d;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static ByteBuffer m82491t(int i11) {
        PriorityQueue priorityQueueM82490p;
        ByteBuffer byteBuffer;
        if (i11 <= f63190h && (priorityQueueM82490p = m82490p()) != null) {
            synchronized (f63191i) {
                do {
                    try {
                        if (priorityQueueM82490p.size() > 0) {
                            byteBuffer = (ByteBuffer) priorityQueueM82490p.remove();
                            if (priorityQueueM82490p.size() == 0) {
                                f63190h = 0;
                            }
                            f63189g -= byteBuffer.capacity();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } while (byteBuffer.capacity() < i11);
                return byteBuffer;
            }
        }
        return ByteBuffer.allocate(Math.max(8192, i11));
    }

    /* JADX INFO: renamed from: x */
    private ByteBuffer m82492x(int i11) {
        ByteBuffer byteBuffer;
        if (m82494C() < i11) {
            throw new IllegalArgumentException("count : " + m82494C() + "/" + i11);
        }
        ByteBuffer byteBuffer2 = (ByteBuffer) this.f63193a.peek();
        while (byteBuffer2 != null && !byteBuffer2.hasRemaining()) {
            m82488A((ByteBuffer) this.f63193a.remove());
            byteBuffer2 = (ByteBuffer) this.f63193a.peek();
        }
        if (byteBuffer2 == null) {
            return f63192j;
        }
        if (byteBuffer2.remaining() >= i11) {
            return byteBuffer2.order(this.f63194b);
        }
        ByteBuffer byteBufferM82491t = m82491t(i11);
        byteBufferM82491t.limit(i11);
        byte[] bArrArray = byteBufferM82491t.array();
        int i12 = 0;
        loop1: while (true) {
            byteBuffer = null;
            do {
                if (i12 >= i11) {
                    break loop1;
                }
                byteBuffer = (ByteBuffer) this.f63193a.remove();
                int iMin = Math.min(i11 - i12, byteBuffer.remaining());
                byteBuffer.get(bArrArray, i12, iMin);
                i12 += iMin;
            } while (byteBuffer.remaining() != 0);
            m82488A(byteBuffer);
        }
        if (byteBuffer != null && byteBuffer.remaining() > 0) {
            this.f63193a.addFirst(byteBuffer);
        }
        this.f63193a.addFirst(byteBufferM82491t);
        return byteBufferM82491t.order(this.f63194b);
    }

    /* JADX INFO: renamed from: B */
    public void m82493B() {
        while (this.f63193a.size() > 0) {
            m82488A((ByteBuffer) this.f63193a.remove());
        }
        this.f63195c = 0;
    }

    /* JADX INFO: renamed from: C */
    public int m82494C() {
        return this.f63195c;
    }

    /* JADX INFO: renamed from: D */
    public ByteBuffer m82495D() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f63193a.remove();
        this.f63195c -= byteBuffer.remaining();
        return byteBuffer;
    }

    /* JADX INFO: renamed from: E */
    public int m82496E() {
        return this.f63193a.size();
    }

    /* JADX INFO: renamed from: F */
    public void m82497F() {
        m82492x(0);
    }

    /* JADX INFO: renamed from: a */
    public ByteBufferList m82498a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 0) {
            m82488A(byteBuffer);
            return this;
        }
        m82489d(byteBuffer.remaining());
        if (this.f63193a.size() > 0) {
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f63193a.getLast();
            if (byteBuffer2.capacity() - byteBuffer2.limit() >= byteBuffer.remaining()) {
                byteBuffer2.mark();
                byteBuffer2.position(byteBuffer2.limit());
                byteBuffer2.limit(byteBuffer2.capacity());
                byteBuffer2.put(byteBuffer);
                byteBuffer2.limit(byteBuffer2.position());
                byteBuffer2.reset();
                m82488A(byteBuffer);
                m82497F();
                return this;
            }
        }
        this.f63193a.add(byteBuffer);
        m82497F();
        return this;
    }

    /* JADX INFO: renamed from: b */
    public ByteBufferList m82499b(ByteBuffer... byteBufferArr) {
        for (ByteBuffer byteBuffer : byteBufferArr) {
            m82498a(byteBuffer);
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m82500c(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 0) {
            m82488A(byteBuffer);
            return;
        }
        m82489d(byteBuffer.remaining());
        if (this.f63193a.size() > 0) {
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f63193a.getFirst();
            if (byteBuffer2.position() >= byteBuffer.remaining()) {
                byteBuffer2.position(byteBuffer2.position() - byteBuffer.remaining());
                byteBuffer2.mark();
                byteBuffer2.put(byteBuffer);
                byteBuffer2.reset();
                m82488A(byteBuffer);
                return;
            }
        }
        this.f63193a.addFirst(byteBuffer);
    }

    /* JADX INFO: renamed from: e */
    public byte m82501e() {
        byte b11 = m82492x(1).get();
        this.f63195c--;
        return b11;
    }

    /* JADX INFO: renamed from: f */
    public void m82502f(ByteBufferList byteBufferList) {
        m82503g(byteBufferList, m82494C());
    }

    /* JADX INFO: renamed from: g */
    public void m82503g(ByteBufferList byteBufferList, int i11) {
        if (m82494C() < i11) {
            throw new IllegalArgumentException("length");
        }
        int i12 = 0;
        while (i12 < i11) {
            ByteBuffer byteBuffer = (ByteBuffer) this.f63193a.remove();
            int iRemaining = byteBuffer.remaining();
            if (iRemaining == 0) {
                m82488A(byteBuffer);
            } else {
                int i13 = iRemaining + i12;
                if (i13 > i11) {
                    int i14 = i11 - i12;
                    ByteBuffer byteBufferM82491t = m82491t(i14);
                    byteBufferM82491t.limit(i14);
                    byteBuffer.get(byteBufferM82491t.array(), 0, i14);
                    byteBufferList.m82498a(byteBufferM82491t);
                    this.f63193a.addFirst(byteBuffer);
                    break;
                }
                byteBufferList.m82498a(byteBuffer);
                i12 = i13;
            }
        }
        this.f63195c -= i11;
    }

    /* JADX INFO: renamed from: h */
    public void m82504h(byte[] bArr) {
        m82505i(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: i */
    public void m82505i(byte[] bArr, int i11, int i12) {
        if (m82494C() < i12) {
            throw new IllegalArgumentException("length");
        }
        int i13 = i12;
        while (i13 > 0) {
            ByteBuffer byteBuffer = (ByteBuffer) this.f63193a.peek();
            int iMin = Math.min(byteBuffer.remaining(), i13);
            if (bArr != null) {
                byteBuffer.get(bArr, i11, iMin);
            } else {
                byteBuffer.position(byteBuffer.position() + iMin);
            }
            i13 -= iMin;
            i11 += iMin;
            if (byteBuffer.remaining() == 0) {
                m82488A(byteBuffer);
            }
        }
        this.f63195c -= i12;
    }

    /* JADX INFO: renamed from: j */
    public ByteBuffer m82506j() {
        if (m82494C() == 0) {
            return f63192j;
        }
        m82492x(m82494C());
        return m82495D();
    }

    /* JADX INFO: renamed from: k */
    public ByteBuffer[] m82507k() {
        ByteBuffer[] byteBufferArr = (ByteBuffer[]) this.f63193a.toArray(new ByteBuffer[this.f63193a.size()]);
        this.f63193a.clear();
        this.f63195c = 0;
        return byteBufferArr;
    }

    /* JADX INFO: renamed from: l */
    public byte[] m82508l() {
        byte[] bArr = new byte[m82494C()];
        m82504h(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: m */
    public char m82509m() {
        char c11 = (char) m82492x(1).get();
        this.f63195c--;
        return c11;
    }

    /* JADX INFO: renamed from: n */
    public int m82510n() {
        int i11 = m82492x(4).getInt();
        this.f63195c -= 4;
        return i11;
    }

    /* JADX INFO: renamed from: o */
    public long m82511o() {
        long j11 = m82492x(8).getLong();
        this.f63195c -= 8;
        return j11;
    }

    /* JADX INFO: renamed from: q */
    public short m82512q() {
        short s11 = m82492x(2).getShort();
        this.f63195c -= 2;
        return s11;
    }

    /* JADX INFO: renamed from: r */
    public boolean m82513r() {
        return m82494C() > 0;
    }

    /* JADX INFO: renamed from: s */
    public boolean m82514s() {
        return this.f63195c == 0;
    }

    /* JADX INFO: renamed from: u */
    public ByteBufferList m82515u(ByteOrder byteOrder) {
        this.f63194b = byteOrder;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public String m82516v() {
        return m82517w(null);
    }

    /* JADX INFO: renamed from: w */
    public String m82517w(Charset charset) {
        byte[] bArrArray;
        int iRemaining;
        int i11;
        if (charset == null) {
            charset = C19952c.f63592b;
        }
        StringBuilder sb2 = new StringBuilder();
        for (ByteBuffer byteBuffer : this.f63193a) {
            if (byteBuffer.isDirect()) {
                bArrArray = new byte[byteBuffer.remaining()];
                iRemaining = byteBuffer.remaining();
                byteBuffer.get(bArrArray);
                i11 = 0;
            } else {
                bArrArray = byteBuffer.array();
                int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                iRemaining = byteBuffer.remaining();
                i11 = iArrayOffset;
            }
            sb2.append(new String(bArrArray, i11, iRemaining, charset));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: y */
    public String m82518y() {
        return m82519z(null);
    }

    /* JADX INFO: renamed from: z */
    public String m82519z(Charset charset) {
        String strM82517w = m82517w(charset);
        m82493B();
        return strM82517w;
    }
}
