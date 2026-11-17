package com.transsion.transfer.androidasync;

import p439gv.InterfaceC23677a;
import p439gv.InterfaceC23686j;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.n */
/* JADX INFO: loaded from: classes6.dex */
public class C19935n implements InterfaceC19940s {

    /* JADX INFO: renamed from: a */
    InterfaceC19940s f63562a;

    /* JADX INFO: renamed from: b */
    boolean f63563b;

    /* JADX INFO: renamed from: d */
    InterfaceC23686j f63565d;

    /* JADX INFO: renamed from: f */
    boolean f63567f;

    /* JADX INFO: renamed from: c */
    final ByteBufferList f63564c = new ByteBufferList();

    /* JADX INFO: renamed from: e */
    int f63566e = Integer.MAX_VALUE;

    public C19935n(InterfaceC19940s interfaceC19940s) {
        m82872n(interfaceC19940s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public void m82867r() {
        boolean zM82514s;
        InterfaceC23686j interfaceC23686j;
        if (this.f63563b) {
            return;
        }
        synchronized (this.f63564c) {
            this.f63562a.mo82419m(this.f63564c);
            zM82514s = this.f63564c.m82514s();
        }
        if (zM82514s && this.f63567f) {
            this.f63562a.mo82414d();
        }
        if (!zM82514s || (interfaceC23686j = this.f63565d) == null) {
            return;
        }
        interfaceC23686j.mo82443a();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: a */
    public AsyncServer mo82413a() {
        return this.f63562a.mo82413a();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: d */
    public void mo82414d() {
        if (mo82413a().m82481o() != Thread.currentThread()) {
            mo82413a().m82472D(new Runnable() { // from class: com.transsion.transfer.androidasync.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f63561a.mo82414d();
                }
            });
            return;
        }
        synchronized (this.f63564c) {
            try {
                if (this.f63564c.m82513r()) {
                    this.f63567f = true;
                } else {
                    this.f63562a.mo82414d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m82868g(boolean z11) {
        this.f63563b = z11;
        if (z11) {
            return;
        }
        m82867r();
    }

    /* JADX INFO: renamed from: h */
    public boolean m82869h() {
        return this.f63564c.m82513r() || this.f63563b;
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: i */
    public void mo82416i(InterfaceC23686j interfaceC23686j) {
        this.f63565d = interfaceC23686j;
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: j */
    public InterfaceC23686j mo82417j() {
        return this.f63565d;
    }

    /* JADX INFO: renamed from: k */
    protected void mo82870k(ByteBufferList byteBufferList) {
    }

    /* JADX INFO: renamed from: l */
    public int m82871l() {
        return this.f63564c.m82494C();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: m */
    public void mo82419m(ByteBufferList byteBufferList) {
        if (mo82413a().m82481o() == Thread.currentThread()) {
            mo82870k(byteBufferList);
            if (!m82869h()) {
                this.f63562a.mo82419m(byteBufferList);
            }
            synchronized (this.f63564c) {
                byteBufferList.m82502f(this.f63564c);
            }
            return;
        }
        synchronized (this.f63564c) {
            try {
                if (this.f63564c.m82494C() >= this.f63566e) {
                    return;
                }
                mo82870k(byteBufferList);
                byteBufferList.m82502f(this.f63564c);
                mo82413a().m82472D(new Runnable() { // from class: com.transsion.transfer.androidasync.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f63560a.m82867r();
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m82872n(InterfaceC19940s interfaceC19940s) {
        this.f63562a = interfaceC19940s;
        interfaceC19940s.mo82416i(new InterfaceC23686j() { // from class: com.transsion.transfer.androidasync.k
            @Override // p439gv.InterfaceC23686j
            /* JADX INFO: renamed from: a */
            public final void mo82443a() {
                this.f63559a.m82867r();
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m82873o(int i11) {
        this.f63566e = i11;
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: q */
    public void mo82422q(InterfaceC23677a interfaceC23677a) {
        this.f63562a.mo82422q(interfaceC23677a);
    }
}
