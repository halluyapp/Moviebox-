package com.transsion.transfer.androidasync.http.server;

import com.transsion.transfer.androidasync.C19809a0;
import com.transsion.transfer.androidasync.InterfaceC19937p;
import com.transsion.transfer.androidasync.InterfaceC19940s;
import com.transsion.transfer.androidasync.http.C19892j;
import p439gv.InterfaceC23677a;
import p439gv.InterfaceC23680d;
import p468hv.InterfaceC23899a;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.server.s */
/* JADX INFO: loaded from: classes6.dex */
public class C19922s implements InterfaceC23899a {

    /* JADX INFO: renamed from: a */
    int f63518a = -1;

    /* JADX INFO: renamed from: b */
    private String f63519b;

    /* JADX INFO: renamed from: c */
    InterfaceC19937p f63520c;

    public C19922s(String str) {
        this.f63519b = str;
    }

    @Override // p468hv.InterfaceC23899a
    /* JADX INFO: renamed from: E */
    public void mo82842E(C19892j c19892j, InterfaceC19940s interfaceC19940s, InterfaceC23677a interfaceC23677a) {
        C19809a0.m82522c(this.f63520c, interfaceC19940s, interfaceC23677a);
        if (this.f63520c.isPaused()) {
            this.f63520c.resume();
        }
    }

    @Override // p468hv.InterfaceC23899a
    /* JADX INFO: renamed from: K */
    public boolean mo82843K() {
        return false;
    }

    @Override // p468hv.InterfaceC23899a
    /* JADX INFO: renamed from: k */
    public String mo82844k() {
        return this.f63519b;
    }

    @Override // p468hv.InterfaceC23899a
    public int length() {
        return this.f63518a;
    }

    @Override // p468hv.InterfaceC23899a
    /* JADX INFO: renamed from: w */
    public void mo82845w(InterfaceC19937p interfaceC19937p, InterfaceC23677a interfaceC23677a) {
        this.f63520c = interfaceC19937p;
        interfaceC19937p.mo82428x(interfaceC23677a);
        interfaceC19937p.mo82426v(new InterfaceC23680d.a());
    }
}
