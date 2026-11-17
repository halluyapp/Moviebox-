package com.transsion.transfer.androidasync;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import p439gv.InterfaceC23680d;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.w */
/* JADX INFO: loaded from: classes6.dex */
public class C19956w implements InterfaceC23680d {

    /* JADX INFO: renamed from: n */
    static Hashtable f63598n = new Hashtable();

    /* JADX INFO: renamed from: i */
    InterfaceC19937p f63607i;

    /* JADX INFO: renamed from: a */
    private l f63599a = new a(0);

    /* JADX INFO: renamed from: b */
    private l f63600b = new b(1);

    /* JADX INFO: renamed from: c */
    private l f63601c = new c(2);

    /* JADX INFO: renamed from: d */
    private l f63602d = new d(4);

    /* JADX INFO: renamed from: e */
    private l f63603e = new e(8);

    /* JADX INFO: renamed from: f */
    private j f63604f = new f();

    /* JADX INFO: renamed from: g */
    private j f63605g = new g();

    /* JADX INFO: renamed from: h */
    private j f63606h = new h();

    /* JADX INFO: renamed from: j */
    private LinkedList f63608j = new LinkedList();

    /* JADX INFO: renamed from: k */
    private ArrayList f63609k = new ArrayList();

    /* JADX INFO: renamed from: l */
    ByteOrder f63610l = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: m */
    ByteBufferList f63611m = new ByteBufferList();

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.w$a */
    class a extends l {
        a(int i11) {
            super(i11);
        }

        @Override // com.transsion.transfer.androidasync.C19956w.l
        /* JADX INFO: renamed from: a */
        public l mo82901a(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
            C19956w.this.f63609k.add(null);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.w$b */
    class b extends l {
        b(int i11) {
            super(i11);
        }

        @Override // com.transsion.transfer.androidasync.C19956w.l
        /* JADX INFO: renamed from: a */
        public l mo82901a(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
            C19956w.this.f63609k.add(Byte.valueOf(byteBufferList.m82501e()));
            return null;
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.w$c */
    class c extends l {
        c(int i11) {
            super(i11);
        }

        @Override // com.transsion.transfer.androidasync.C19956w.l
        /* JADX INFO: renamed from: a */
        public l mo82901a(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
            C19956w.this.f63609k.add(Short.valueOf(byteBufferList.m82512q()));
            return null;
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.w$d */
    class d extends l {
        d(int i11) {
            super(i11);
        }

        @Override // com.transsion.transfer.androidasync.C19956w.l
        /* JADX INFO: renamed from: a */
        public l mo82901a(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
            C19956w.this.f63609k.add(Integer.valueOf(byteBufferList.m82510n()));
            return null;
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.w$e */
    class e extends l {
        e(int i11) {
            super(i11);
        }

        @Override // com.transsion.transfer.androidasync.C19956w.l
        /* JADX INFO: renamed from: a */
        public l mo82901a(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
            C19956w.this.f63609k.add(Long.valueOf(byteBufferList.m82511o()));
            return null;
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.w$f */
    class f implements j {
        f() {
        }

        @Override // com.transsion.transfer.androidasync.C19956w.j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo82902a(byte[] bArr) {
            C19956w.this.f63609k.add(bArr);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.w$g */
    class g implements j {
        g() {
        }

        @Override // com.transsion.transfer.androidasync.C19956w.j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo82902a(ByteBufferList byteBufferList) {
            C19956w.this.f63609k.add(byteBufferList);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.w$h */
    class h implements j {
        h() {
        }

        @Override // com.transsion.transfer.androidasync.C19956w.j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo82902a(byte[] bArr) {
            C19956w.this.f63609k.add(new String(bArr));
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.w$i */
    static class i extends l {

        /* JADX INFO: renamed from: b */
        j f63620b;

        public i(int i11, j jVar) {
            super(i11);
            if (i11 <= 0) {
                throw new IllegalArgumentException("length should be > 0");
            }
            this.f63620b = jVar;
        }

        @Override // com.transsion.transfer.androidasync.C19956w.l
        /* JADX INFO: renamed from: a */
        public l mo82901a(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
            byte[] bArr = new byte[this.f63623a];
            byteBufferList.m82504h(bArr);
            this.f63620b.mo82902a(bArr);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.w$j */
    public interface j {
        /* JADX INFO: renamed from: a */
        void mo82902a(Object obj);
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.w$k */
    static class k extends l {

        /* JADX INFO: renamed from: b */
        byte f63621b;

        /* JADX INFO: renamed from: c */
        InterfaceC23680d f63622c;

        public k(byte b11, InterfaceC23680d interfaceC23680d) {
            super(1);
            this.f63621b = b11;
            this.f63622c = interfaceC23680d;
        }

        @Override // com.transsion.transfer.androidasync.C19956w.l
        /* JADX INFO: renamed from: a */
        public l mo82901a(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
            ByteBufferList byteBufferList2 = new ByteBufferList();
            boolean z11 = true;
            while (byteBufferList.m82496E() > 0) {
                ByteBuffer byteBufferM82495D = byteBufferList.m82495D();
                byteBufferM82495D.mark();
                int i11 = 0;
                while (byteBufferM82495D.remaining() > 0) {
                    z11 = byteBufferM82495D.get() == this.f63621b;
                    if (z11) {
                        break;
                    }
                    i11++;
                }
                byteBufferM82495D.reset();
                if (z11) {
                    byteBufferList.m82500c(byteBufferM82495D);
                    byteBufferList.m82503g(byteBufferList2, i11);
                    byteBufferList.m82501e();
                    break;
                }
                byteBufferList2.m82498a(byteBufferM82495D);
            }
            this.f63622c.mo82444F(interfaceC19937p, byteBufferList2);
            if (z11) {
                return null;
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.w$l */
    static abstract class l {

        /* JADX INFO: renamed from: a */
        int f63623a;

        public l(int i11) {
            this.f63623a = i11;
        }

        /* JADX INFO: renamed from: a */
        public abstract l mo82901a(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList);
    }

    public C19956w(InterfaceC19937p interfaceC19937p) {
        this.f63607i = interfaceC19937p;
        interfaceC19937p.mo82426v(this);
    }

    @Override // p439gv.InterfaceC23680d
    /* JADX INFO: renamed from: F */
    public void mo82444F(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
        byteBufferList.m82502f(this.f63611m);
        while (this.f63608j.size() > 0 && this.f63611m.m82494C() >= ((l) this.f63608j.peek()).f63623a) {
            this.f63611m.m82515u(this.f63610l);
            l lVarMo82901a = ((l) this.f63608j.poll()).mo82901a(interfaceC19937p, this.f63611m);
            if (lVarMo82901a != null) {
                this.f63608j.addFirst(lVarMo82901a);
            }
        }
        if (this.f63608j.size() == 0) {
            this.f63611m.m82502f(byteBufferList);
        }
    }

    /* JADX INFO: renamed from: b */
    public C19956w m82899b(int i11, j jVar) {
        this.f63608j.add(new i(i11, jVar));
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C19956w m82900c(byte b11, InterfaceC23680d interfaceC23680d) {
        this.f63608j.add(new k(b11, interfaceC23680d));
        return this;
    }
}
