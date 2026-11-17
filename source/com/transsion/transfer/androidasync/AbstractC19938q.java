package com.transsion.transfer.androidasync;

import p439gv.InterfaceC23677a;
import p439gv.InterfaceC23680d;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.q */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC19938q implements InterfaceC19937p {

    /* JADX INFO: renamed from: a */
    private boolean f63569a;

    /* JADX INFO: renamed from: b */
    InterfaceC23677a f63570b;

    /* JADX INFO: renamed from: c */
    InterfaceC23680d f63571c;

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    /* JADX INFO: renamed from: I */
    public InterfaceC23680d mo82412I() {
        return this.f63571c;
    }

    /* JADX INFO: renamed from: L */
    public final InterfaceC23677a m82880L() {
        return this.f63570b;
    }

    /* JADX INFO: renamed from: M */
    protected void mo82624M(Exception exc) {
        if (this.f63569a) {
            return;
        }
        this.f63569a = true;
        if (m82880L() != null) {
            m82880L().mo82442g(exc);
        }
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    /* JADX INFO: renamed from: s */
    public String mo82424s() {
        return null;
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    /* JADX INFO: renamed from: v */
    public void mo82426v(InterfaceC23680d interfaceC23680d) {
        this.f63571c = interfaceC23680d;
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    /* JADX INFO: renamed from: x */
    public final void mo82428x(InterfaceC23677a interfaceC23677a) {
        this.f63570b = interfaceC23677a;
    }
}
