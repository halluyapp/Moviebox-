package com.transsion.transfer.androidasync.http;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.transsion.transfer.androidasync.AsyncServer;
import com.transsion.transfer.androidasync.ByteBufferList;
import com.transsion.transfer.androidasync.C19944t;
import com.transsion.transfer.androidasync.InterfaceC19931j;
import com.transsion.transfer.androidasync.InterfaceC19937p;
import com.transsion.transfer.androidasync.InterfaceC19940s;
import java.nio.charset.Charset;
import p439gv.InterfaceC23677a;
import p439gv.InterfaceC23680d;
import p468hv.InterfaceC23899a;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.l */
/* JADX INFO: loaded from: classes6.dex */
abstract class AbstractC19894l extends C19944t implements InterfaceC19937p, InterfaceC19893k, InterfaceC19889g.i {

    /* JADX INFO: renamed from: h */
    private C19892j f63400h;

    /* JADX INFO: renamed from: i */
    private InterfaceC19931j f63401i;

    /* JADX INFO: renamed from: j */
    protected Headers f63402j;

    /* JADX INFO: renamed from: l */
    int f63404l;

    /* JADX INFO: renamed from: m */
    String f63405m;

    /* JADX INFO: renamed from: n */
    String f63406n;

    /* JADX INFO: renamed from: p */
    InterfaceC19940s f63408p;

    /* JADX INFO: renamed from: g */
    private InterfaceC23677a f63399g = new b();

    /* JADX INFO: renamed from: k */
    boolean f63403k = false;

    /* JADX INFO: renamed from: o */
    private boolean f63407o = true;

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.l$a */
    class a implements InterfaceC23677a {
        a() {
        }

        @Override // p439gv.InterfaceC23677a
        /* JADX INFO: renamed from: g */
        public void mo82442g(Exception exc) {
            AbstractC19894l.this.mo82627R(exc);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.l$b */
    class b implements InterfaceC23677a {
        b() {
        }

        @Override // p439gv.InterfaceC23677a
        /* JADX INFO: renamed from: g */
        public void mo82442g(Exception exc) {
            if (AbstractC19894l.this.mo82724e() == null) {
                AbstractC19894l.this.mo82624M(new ConnectionClosedException("connection closed before headers received.", exc));
                return;
            }
            if (exc != null) {
                AbstractC19894l abstractC19894l = AbstractC19894l.this;
                if (!abstractC19894l.f63403k) {
                    abstractC19894l.mo82624M(new ConnectionClosedException("connection closed before response completed.", exc));
                    return;
                }
            }
            AbstractC19894l.this.mo82624M(exc);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.l$c */
    class c extends InterfaceC23680d.a {
        c() {
        }

        @Override // p439gv.InterfaceC23680d.a, p439gv.InterfaceC23680d
        /* JADX INFO: renamed from: F */
        public void mo82444F(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
            super.mo82444F(interfaceC19937p, byteBufferList);
            AbstractC19894l.this.f63401i.close();
        }
    }

    public AbstractC19894l(C19892j c19892j) {
        this.f63400h = c19892j;
    }

    /* JADX INFO: renamed from: T */
    private void m82756T() {
        this.f63401i.mo82426v(new c());
    }

    @Override // com.transsion.transfer.androidasync.http.InterfaceC19889g.i
    /* JADX INFO: renamed from: H */
    public InterfaceC19940s mo82721H() {
        return this.f63408p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.transsion.transfer.androidasync.AbstractC19938q
    /* JADX INFO: renamed from: M */
    public void mo82624M(Exception exc) {
        super.mo82624M(exc);
        m82756T();
        this.f63401i.mo82416i(null);
        this.f63401i.mo82422q(null);
        this.f63401i.mo82428x(null);
        this.f63403k = true;
    }

    /* JADX INFO: renamed from: P */
    protected void mo82626P() {
    }

    /* JADX INFO: renamed from: Q */
    protected void m82757Q() {
        InterfaceC23899a interfaceC23899aM82737e = this.f63400h.m82737e();
        if (interfaceC23899aM82737e != null) {
            interfaceC23899aM82737e.mo82842E(this.f63400h, this.f63408p, new a());
        } else {
            mo82627R(null);
        }
    }

    /* JADX INFO: renamed from: R */
    protected abstract void mo82627R(Exception exc);

    /* JADX INFO: renamed from: S */
    void m82758S(InterfaceC19931j interfaceC19931j) {
        this.f63401i = interfaceC19931j;
        if (interfaceC19931j == null) {
            return;
        }
        interfaceC19931j.mo82428x(this.f63399g);
    }

    @Override // com.transsion.transfer.androidasync.C19944t, com.transsion.transfer.androidasync.InterfaceC19937p, com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: a */
    public AsyncServer mo82413a() {
        return this.f63401i.mo82413a();
    }

    @Override // com.transsion.transfer.androidasync.http.InterfaceC19893k, com.transsion.transfer.androidasync.http.InterfaceC19889g.i
    /* JADX INFO: renamed from: b */
    public int mo82722b() {
        return this.f63404l;
    }

    @Override // com.transsion.transfer.androidasync.http.InterfaceC19889g.i
    /* JADX INFO: renamed from: c */
    public InterfaceC19889g.i mo82723c(int i11) {
        this.f63404l = i11;
        return this;
    }

    @Override // com.transsion.transfer.androidasync.C19944t, com.transsion.transfer.androidasync.InterfaceC19937p
    public void close() {
        super.close();
        m82756T();
    }

    @Override // com.transsion.transfer.androidasync.http.InterfaceC19893k, com.transsion.transfer.androidasync.http.InterfaceC19889g.i
    /* JADX INFO: renamed from: e */
    public Headers mo82724e() {
        return this.f63402j;
    }

    @Override // com.transsion.transfer.androidasync.http.InterfaceC19889g.i
    /* JADX INFO: renamed from: f */
    public InterfaceC19889g.i mo82725f(InterfaceC19940s interfaceC19940s) {
        this.f63408p = interfaceC19940s;
        return this;
    }

    @Override // com.transsion.transfer.androidasync.http.InterfaceC19889g.i
    /* JADX INFO: renamed from: l */
    public InterfaceC19889g.i mo82726l(String str) {
        this.f63405m = str;
        return this;
    }

    @Override // com.transsion.transfer.androidasync.http.InterfaceC19889g.i
    /* JADX INFO: renamed from: n */
    public InterfaceC19889g.i mo82727n(InterfaceC19937p interfaceC19937p) {
        mo82625N(interfaceC19937p);
        return this;
    }

    @Override // com.transsion.transfer.androidasync.http.InterfaceC19889g.i
    public String protocol() {
        return this.f63405m;
    }

    @Override // com.transsion.transfer.androidasync.http.InterfaceC19889g.i
    /* JADX INFO: renamed from: r */
    public InterfaceC19889g.i mo82728r(String str) {
        this.f63406n = str;
        return this;
    }

    @Override // com.transsion.transfer.androidasync.C19944t, com.transsion.transfer.androidasync.AbstractC19938q, com.transsion.transfer.androidasync.InterfaceC19937p
    /* JADX INFO: renamed from: s */
    public String mo82424s() {
        String string;
        Multimap semicolonDelimited = Multimap.parseSemicolonDelimited(mo82724e().m82635c(HttpHeaders.CONTENT_TYPE));
        if (semicolonDelimited == null || (string = semicolonDelimited.getString("charset")) == null || !Charset.isSupported(string)) {
            return null;
        }
        return string;
    }

    @Override // com.transsion.transfer.androidasync.http.InterfaceC19889g.i
    public InterfaceC19931j socket() {
        return this.f63401i;
    }

    public String toString() {
        Headers headers = this.f63402j;
        if (headers == null) {
            return super.toString();
        }
        return headers.m82639g(this.f63405m + " " + this.f63404l + " " + this.f63406n);
    }

    @Override // com.transsion.transfer.androidasync.http.InterfaceC19889g.i
    /* JADX INFO: renamed from: y */
    public InterfaceC19889g.i mo82729y(Headers headers) {
        this.f63402j = headers;
        return this;
    }
}
