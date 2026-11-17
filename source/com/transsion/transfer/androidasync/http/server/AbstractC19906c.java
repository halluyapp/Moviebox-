package com.transsion.transfer.androidasync.http.server;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.transsion.transfer.androidasync.C19944t;
import com.transsion.transfer.androidasync.C19955v;
import com.transsion.transfer.androidasync.InterfaceC19931j;
import com.transsion.transfer.androidasync.InterfaceC19937p;
import com.transsion.transfer.androidasync.http.Headers;
import com.transsion.transfer.androidasync.http.HttpUtil;
import com.transsion.transfer.androidasync.http.Protocol;
import java.io.IOException;
import java.util.HashMap;
import p439gv.InterfaceC23677a;
import p439gv.InterfaceC23680d;
import p468hv.InterfaceC23899a;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.server.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC19906c extends C19944t implements InterfaceC19905b, InterfaceC23677a {

    /* JADX INFO: renamed from: g */
    private String f63466g;

    /* JADX INFO: renamed from: i */
    InterfaceC19931j f63468i;

    /* JADX INFO: renamed from: m */
    String f63472m;

    /* JADX INFO: renamed from: n */
    InterfaceC23899a f63473n;

    /* JADX INFO: renamed from: h */
    private Headers f63467h = new Headers();

    /* JADX INFO: renamed from: j */
    private HashMap f63469j = new HashMap();

    /* JADX INFO: renamed from: k */
    private InterfaceC23677a f63470k = new a();

    /* JADX INFO: renamed from: l */
    C19955v.a f63471l = new b();

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.server.c$a */
    class a implements InterfaceC23677a {
        a() {
        }

        @Override // p439gv.InterfaceC23677a
        /* JADX INFO: renamed from: g */
        public void mo82442g(Exception exc) {
            AbstractC19906c.this.mo82442g(exc);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.server.c$b */
    class b implements C19955v.a {
        b() {
        }

        @Override // com.transsion.transfer.androidasync.C19955v.a
        /* JADX INFO: renamed from: a */
        public void mo82767a(String str) {
            if (AbstractC19906c.this.f63466g == null) {
                AbstractC19906c.this.f63466g = str;
                if (AbstractC19906c.this.f63466g.contains("HTTP/")) {
                    return;
                }
                AbstractC19906c.this.m82800W();
                AbstractC19906c.this.f63468i.mo82426v(new InterfaceC23680d.a());
                AbstractC19906c.this.mo82624M(new IOException("data/header received was not not http"));
                return;
            }
            if (!"\r".equals(str)) {
                AbstractC19906c.this.f63467h.m82634b(str);
                return;
            }
            AbstractC19906c abstractC19906c = AbstractC19906c.this;
            InterfaceC19937p interfaceC19937pM82643c = HttpUtil.m82643c(abstractC19906c.f63468i, Protocol.HTTP_1_1, abstractC19906c.f63467h, true);
            AbstractC19906c abstractC19906c2 = AbstractC19906c.this;
            abstractC19906c2.f63473n = abstractC19906c2.mo82784U(abstractC19906c2.f63467h);
            AbstractC19906c abstractC19906c3 = AbstractC19906c.this;
            if (abstractC19906c3.f63473n == null) {
                abstractC19906c3.f63473n = HttpUtil.m82642b(interfaceC19937pM82643c, abstractC19906c3.f63470k, AbstractC19906c.this.f63467h);
                AbstractC19906c abstractC19906c4 = AbstractC19906c.this;
                if (abstractC19906c4.f63473n == null) {
                    abstractC19906c4.f63473n = abstractC19906c4.mo82786X(abstractC19906c4.f63467h);
                    AbstractC19906c abstractC19906c5 = AbstractC19906c.this;
                    if (abstractC19906c5.f63473n == null) {
                        abstractC19906c5.f63473n = new C19922s(abstractC19906c5.f63467h.m82635c(HttpHeaders.CONTENT_TYPE));
                    }
                }
            }
            AbstractC19906c abstractC19906c6 = AbstractC19906c.this;
            abstractC19906c6.f63473n.mo82845w(interfaceC19937pM82643c, abstractC19906c6.f63470k);
            AbstractC19906c.this.mo82785V();
        }
    }

    @Override // com.transsion.transfer.androidasync.http.server.InterfaceC19905b
    /* JADX INFO: renamed from: B */
    public String mo82792B() {
        return this.f63472m;
    }

    @Override // com.transsion.transfer.androidasync.http.server.InterfaceC19905b
    /* JADX INFO: renamed from: C */
    public InterfaceC23899a mo82793C() {
        return this.f63473n;
    }

    @Override // com.transsion.transfer.androidasync.AbstractC19938q, com.transsion.transfer.androidasync.InterfaceC19937p
    /* JADX INFO: renamed from: I */
    public InterfaceC23680d mo82412I() {
        return this.f63468i.mo82412I();
    }

    /* JADX INFO: renamed from: T */
    public String m82799T() {
        return this.f63466g;
    }

    /* JADX INFO: renamed from: U */
    protected InterfaceC23899a mo82784U(Headers headers) {
        return null;
    }

    /* JADX INFO: renamed from: V */
    protected abstract void mo82785V();

    /* JADX INFO: renamed from: W */
    protected void m82800W() {
        System.out.println("not http!");
    }

    /* JADX INFO: renamed from: X */
    protected InterfaceC23899a mo82786X(Headers headers) {
        return null;
    }

    /* JADX INFO: renamed from: Y */
    void m82801Y(InterfaceC19931j interfaceC19931j) {
        this.f63468i = interfaceC19931j;
        C19955v c19955v = new C19955v();
        this.f63468i.mo82426v(c19955v);
        c19955v.m82897a(this.f63471l);
        this.f63468i.mo82428x(new InterfaceC23677a.a());
    }

    /* JADX INFO: renamed from: g */
    public void mo82442g(Exception exc) {
        mo82624M(exc);
    }

    @Override // com.transsion.transfer.androidasync.http.server.InterfaceC19905b
    public Headers getHeaders() {
        return this.f63467h;
    }

    @Override // com.transsion.transfer.androidasync.http.server.InterfaceC19905b
    public InterfaceC19931j getSocket() {
        return this.f63468i;
    }

    @Override // com.transsion.transfer.androidasync.C19944t, com.transsion.transfer.androidasync.InterfaceC19937p
    public boolean isPaused() {
        return this.f63468i.isPaused();
    }

    @Override // com.transsion.transfer.androidasync.C19944t, com.transsion.transfer.androidasync.InterfaceC19937p
    public void pause() {
        this.f63468i.pause();
    }

    @Override // com.transsion.transfer.androidasync.C19944t, com.transsion.transfer.androidasync.InterfaceC19937p
    public void resume() {
        this.f63468i.resume();
    }

    public String toString() {
        Headers headers = this.f63467h;
        return headers == null ? super.toString() : headers.m82639g(this.f63466g);
    }

    @Override // com.transsion.transfer.androidasync.AbstractC19938q, com.transsion.transfer.androidasync.InterfaceC19937p
    /* JADX INFO: renamed from: v */
    public void mo82426v(InterfaceC23680d interfaceC23680d) {
        this.f63468i.mo82426v(interfaceC23680d);
    }
}
