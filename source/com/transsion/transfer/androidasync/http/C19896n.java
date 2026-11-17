package com.transsion.transfer.androidasync.http;

import android.net.Uri;
import android.text.TextUtils;
import com.transsion.transfer.androidasync.AsyncSSLSocketWrapper;
import com.transsion.transfer.androidasync.C19809a0;
import com.transsion.transfer.androidasync.C19955v;
import com.transsion.transfer.androidasync.InterfaceC19808a;
import com.transsion.transfer.androidasync.InterfaceC19931j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import p439gv.InterfaceC23677a;
import p439gv.InterfaceC23678b;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.n */
/* JADX INFO: loaded from: classes6.dex */
public class C19896n extends C19923t {

    /* JADX INFO: renamed from: j */
    protected SSLContext f63412j;

    /* JADX INFO: renamed from: k */
    protected TrustManager[] f63413k;

    /* JADX INFO: renamed from: l */
    protected HostnameVerifier f63414l;

    /* JADX INFO: renamed from: m */
    protected List f63415m;

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.n$a */
    class a implements AsyncSSLSocketWrapper.InterfaceC19794g {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC23678b f63416a;

        a(InterfaceC23678b interfaceC23678b) {
            this.f63416a = interfaceC23678b;
        }

        @Override // com.transsion.transfer.androidasync.AsyncSSLSocketWrapper.InterfaceC19794g
        /* JADX INFO: renamed from: a */
        public void mo82445a(Exception exc, InterfaceC19808a interfaceC19808a) {
            this.f63416a.mo82619a(exc, interfaceC19808a);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.n$b */
    class b implements InterfaceC23678b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC23678b f63418a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f63419b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC19889g.a f63420c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Uri f63421d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f63422e;

        /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.n$b$a */
        class a implements InterfaceC23677a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC19931j f63424a;

            /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.n$b$a$a, reason: collision with other inner class name */
            class C29457a implements C19955v.a {

                /* JADX INFO: renamed from: a */
                String f63426a;

                C29457a() {
                }

                @Override // com.transsion.transfer.androidasync.C19955v.a
                /* JADX INFO: renamed from: a */
                public void mo82767a(String str) {
                    b.this.f63420c.f63384b.m82751u(str);
                    if (this.f63426a != null) {
                        if (TextUtils.isEmpty(str.trim())) {
                            a.this.f63424a.mo82426v(null);
                            a.this.f63424a.mo82428x(null);
                            a aVar = a.this;
                            b bVar = b.this;
                            C19896n.this.m82765E(aVar.f63424a, bVar.f63420c, bVar.f63421d, bVar.f63422e, bVar.f63418a);
                            return;
                        }
                        return;
                    }
                    String strTrim = str.trim();
                    this.f63426a = strTrim;
                    if (strTrim.matches("HTTP/1.\\d 2\\d\\d .*")) {
                        return;
                    }
                    a.this.f63424a.mo82426v(null);
                    a.this.f63424a.mo82428x(null);
                    b.this.f63418a.mo82619a(new IOException("non 2xx status line: " + this.f63426a), a.this.f63424a);
                }
            }

            /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.n$b$a$b, reason: collision with other inner class name */
            class C29458b implements InterfaceC23677a {
                C29458b() {
                }

                @Override // p439gv.InterfaceC23677a
                /* JADX INFO: renamed from: g */
                public void mo82442g(Exception exc) {
                    if (!a.this.f63424a.isOpen() && exc == null) {
                        exc = new IOException("socket closed before proxy connect response");
                    }
                    a aVar = a.this;
                    b.this.f63418a.mo82619a(exc, aVar.f63424a);
                }
            }

            a(InterfaceC19931j interfaceC19931j) {
                this.f63424a = interfaceC19931j;
            }

            @Override // p439gv.InterfaceC23677a
            /* JADX INFO: renamed from: g */
            public void mo82442g(Exception exc) {
                if (exc != null) {
                    b.this.f63418a.mo82619a(exc, this.f63424a);
                    return;
                }
                C19955v c19955v = new C19955v();
                c19955v.m82897a(new C29457a());
                this.f63424a.mo82426v(c19955v);
                this.f63424a.mo82428x(new C29458b());
            }
        }

        b(InterfaceC23678b interfaceC23678b, boolean z11, InterfaceC19889g.a aVar, Uri uri, int i11) {
            this.f63418a = interfaceC23678b;
            this.f63419b = z11;
            this.f63420c = aVar;
            this.f63421d = uri;
            this.f63422e = i11;
        }

        @Override // p439gv.InterfaceC23678b
        /* JADX INFO: renamed from: a */
        public void mo82619a(Exception exc, InterfaceC19931j interfaceC19931j) {
            if (exc != null) {
                this.f63418a.mo82619a(exc, interfaceC19931j);
                return;
            }
            if (!this.f63419b) {
                C19896n.this.m82765E(interfaceC19931j, this.f63420c, this.f63421d, this.f63422e, this.f63418a);
                return;
            }
            String str = String.format(Locale.ENGLISH, "CONNECT %s:%s HTTP/1.1\r\nHost: %s\r\n\r\n", this.f63421d.getHost(), Integer.valueOf(this.f63422e), this.f63421d.getHost());
            this.f63420c.f63384b.m82751u("Proxying: " + str);
            C19809a0.m82527h(interfaceC19931j, str.getBytes(), new a(interfaceC19931j));
        }
    }

    public C19896n(AsyncHttpClient asyncHttpClient) {
        super(asyncHttpClient, "https", 443);
        this.f63415m = new ArrayList();
    }

    /* JADX INFO: renamed from: A */
    public void m82761A(InterfaceC19895m interfaceC19895m) {
        this.f63415m.add(interfaceC19895m);
    }

    /* JADX INFO: renamed from: B */
    protected SSLEngine m82762B(InterfaceC19889g.a aVar, String str, int i11) {
        SSLContext sSLContextM82764D = m82764D();
        Iterator it = this.f63415m.iterator();
        SSLEngine sSLEngineMo82759a = null;
        while (it.hasNext() && (sSLEngineMo82759a = ((InterfaceC19895m) it.next()).mo82759a(sSLContextM82764D, str, i11)) == null) {
        }
        Iterator it2 = this.f63415m.iterator();
        while (it2.hasNext()) {
            ((InterfaceC19895m) it2.next()).mo82760b(sSLEngineMo82759a, aVar, str, i11);
        }
        return sSLEngineMo82759a;
    }

    /* JADX INFO: renamed from: C */
    protected AsyncSSLSocketWrapper.InterfaceC19794g m82763C(InterfaceC19889g.a aVar, InterfaceC23678b interfaceC23678b) {
        return new a(interfaceC23678b);
    }

    /* JADX INFO: renamed from: D */
    public SSLContext m82764D() {
        SSLContext sSLContext = this.f63412j;
        return sSLContext != null ? sSLContext : AsyncSSLSocketWrapper.m82434o();
    }

    /* JADX INFO: renamed from: E */
    protected void m82765E(InterfaceC19931j interfaceC19931j, InterfaceC19889g.a aVar, Uri uri, int i11, InterfaceC23678b interfaceC23678b) {
        AsyncSSLSocketWrapper.m82436w(interfaceC19931j, uri.getHost(), i11, m82762B(aVar, uri.getHost(), i11), this.f63413k, this.f63414l, true, m82763C(aVar, interfaceC23678b));
    }

    @Override // com.transsion.transfer.androidasync.http.C19923t
    /* JADX INFO: renamed from: z */
    protected InterfaceC23678b mo82766z(InterfaceC19889g.a aVar, Uri uri, int i11, boolean z11, InterfaceC23678b interfaceC23678b) {
        return new b(interfaceC23678b, z11, aVar, uri, i11);
    }
}
