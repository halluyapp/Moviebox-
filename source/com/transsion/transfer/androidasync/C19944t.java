package com.transsion.transfer.androidasync;

import p439gv.InterfaceC23677a;
import p439gv.InterfaceC23680d;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.t */
/* JADX INFO: loaded from: classes6.dex */
public class C19944t extends AbstractC19938q implements InterfaceC19937p, InterfaceC23680d {

    /* JADX INFO: renamed from: d */
    private InterfaceC19937p f63576d;

    /* JADX INFO: renamed from: e */
    private int f63577e;

    /* JADX INFO: renamed from: f */
    boolean f63578f;

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.t$a */
    class a implements InterfaceC23677a {
        a() {
        }

        @Override // p439gv.InterfaceC23677a
        /* JADX INFO: renamed from: g */
        public void mo82442g(Exception exc) {
            C19944t.this.mo82624M(exc);
        }
    }

    /* JADX INFO: renamed from: F */
    public void mo82444F(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
        if (this.f63578f) {
            byteBufferList.m82493B();
            return;
        }
        if (byteBufferList != null) {
            this.f63577e += byteBufferList.m82494C();
        }
        C19809a0.m82520a(this, byteBufferList);
        if (byteBufferList != null) {
            this.f63577e -= byteBufferList.m82494C();
        }
    }

    /* JADX INFO: renamed from: N */
    public void mo82625N(InterfaceC19937p interfaceC19937p) {
        InterfaceC19937p interfaceC19937p2 = this.f63576d;
        if (interfaceC19937p2 != null) {
            interfaceC19937p2.mo82426v(null);
        }
        this.f63576d = interfaceC19937p;
        interfaceC19937p.mo82426v(this);
        this.f63576d.mo82428x(new a());
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p, com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: a */
    public AsyncServer mo82413a() {
        return this.f63576d.mo82413a();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    public void close() {
        this.f63578f = true;
        InterfaceC19937p interfaceC19937p = this.f63576d;
        if (interfaceC19937p != null) {
            interfaceC19937p.close();
        }
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    public boolean isPaused() {
        return this.f63576d.isPaused();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    public void pause() {
        this.f63576d.pause();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    public void resume() {
        this.f63576d.resume();
    }

    @Override // com.transsion.transfer.androidasync.AbstractC19938q, com.transsion.transfer.androidasync.InterfaceC19937p
    /* JADX INFO: renamed from: s */
    public String mo82424s() {
        InterfaceC19937p interfaceC19937p = this.f63576d;
        if (interfaceC19937p == null) {
            return null;
        }
        return interfaceC19937p.mo82424s();
    }
}
