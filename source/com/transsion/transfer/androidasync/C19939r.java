package com.transsion.transfer.androidasync;

import p439gv.InterfaceC23680d;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.r */
/* JADX INFO: loaded from: classes6.dex */
public class C19939r implements InterfaceC23680d {

    /* JADX INFO: renamed from: a */
    InterfaceC23680d f63572a;

    /* JADX INFO: renamed from: b */
    int f63573b;

    /* JADX INFO: renamed from: c */
    ByteBufferList f63574c = new ByteBufferList();

    /* JADX INFO: renamed from: a */
    private boolean m82881a(InterfaceC19937p interfaceC19937p) {
        if (this.f63573b > this.f63574c.m82494C()) {
            return false;
        }
        InterfaceC23680d interfaceC23680d = this.f63572a;
        this.f63572a = null;
        interfaceC23680d.mo82444F(interfaceC19937p, this.f63574c);
        return true;
    }

    @Override // p439gv.InterfaceC23680d
    /* JADX INFO: renamed from: F */
    public void mo82444F(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
        do {
            byteBufferList.m82503g(this.f63574c, Math.min(byteBufferList.m82494C(), this.f63573b - this.f63574c.m82494C()));
            byteBufferList.m82494C();
            if (!m82881a(interfaceC19937p)) {
                break;
            }
        } while (this.f63572a != null);
        byteBufferList.m82494C();
    }

    /* JADX INFO: renamed from: b */
    public void m82882b(int i11, InterfaceC23680d interfaceC23680d) {
        this.f63573b = i11;
        this.f63572a = interfaceC23680d;
        this.f63574c.m82493B();
    }
}
