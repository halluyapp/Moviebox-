package com.transsion.transfer.androidasync.http;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.transsion.transfer.androidasync.AsyncSSLException;
import com.transsion.transfer.androidasync.AsyncServer;
import com.transsion.transfer.androidasync.ByteBufferList;
import com.transsion.transfer.androidasync.InterfaceC19931j;
import com.transsion.transfer.androidasync.InterfaceC19937p;
import com.transsion.transfer.androidasync.future.C19840w;
import com.transsion.transfer.androidasync.future.InterfaceC19818a;
import com.transsion.transfer.androidasync.future.InterfaceC19824g;
import com.transsion.transfer.androidasync.future.InterfaceFutureC19823f;
import com.transsion.transfer.androidasync.stream.AbstractC19943a;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import p439gv.InterfaceC23677a;
import p439gv.InterfaceC23678b;
import p439gv.InterfaceC23680d;
import p496iv.InterfaceC24229a;
import p496iv.InterfaceC24230b;
import p560kv.C25447f;
import p560kv.InterfaceC25442a;

/* JADX INFO: loaded from: classes6.dex */
public class AsyncHttpClient {

    /* JADX INFO: renamed from: f */
    private static AsyncHttpClient f63261f;

    /* JADX INFO: renamed from: a */
    final List f63262a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b */
    C19896n f63263b;

    /* JADX INFO: renamed from: c */
    C19923t f63264c;

    /* JADX INFO: renamed from: d */
    C19925v f63265d;

    /* JADX INFO: renamed from: e */
    AsyncServer f63266e;

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.AsyncHttpClient$a */
    class C19849a implements InterfaceC23678b {

        /* JADX INFO: renamed from: a */
        boolean f63267a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C19892j f63268b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C19856h f63269c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC24229a f63270d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC19889g.g f63271e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f63272f;

        C19849a(C19892j c19892j, C19856h c19856h, InterfaceC24229a interfaceC24229a, InterfaceC19889g.g gVar, int i11) {
            this.f63268b = c19892j;
            this.f63269c = c19856h;
            this.f63270d = interfaceC24229a;
            this.f63271e = gVar;
            this.f63272f = i11;
        }

        @Override // p439gv.InterfaceC23678b
        /* JADX INFO: renamed from: a */
        public void mo82619a(Exception exc, InterfaceC19931j interfaceC19931j) {
            if (this.f63267a && interfaceC19931j != null) {
                interfaceC19931j.mo82426v(new InterfaceC23680d.a());
                interfaceC19931j.mo82428x(new InterfaceC23677a.a());
                interfaceC19931j.close();
                throw new AssertionError("double connect callback");
            }
            this.f63267a = true;
            this.f63268b.m82751u("socket connected");
            if (this.f63269c.isCancelled()) {
                if (interfaceC19931j != null) {
                    interfaceC19931j.close();
                    return;
                }
                return;
            }
            C19856h c19856h = this.f63269c;
            if (c19856h.f63301h != null) {
                c19856h.f63300g.cancel();
            }
            if (exc != null) {
                AsyncHttpClient.this.m82588H(this.f63269c, exc, null, this.f63268b, this.f63270d);
                return;
            }
            InterfaceC19889g.g gVar = this.f63271e;
            gVar.f63379f = interfaceC19931j;
            C19856h c19856h2 = this.f63269c;
            c19856h2.f63299f = interfaceC19931j;
            AsyncHttpClient.this.m82607u(this.f63268b, this.f63272f, c19856h2, this.f63270d, gVar);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.AsyncHttpClient$b */
    class C19850b extends AbstractC19894l {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ C19856h f63274q;

        /* JADX INFO: renamed from: r */
        final /* synthetic */ C19892j f63275r;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ InterfaceC24229a f63276s;

        /* JADX INFO: renamed from: t */
        final /* synthetic */ InterfaceC19889g.g f63277t;

        /* JADX INFO: renamed from: u */
        final /* synthetic */ int f63278u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C19850b(C19892j c19892j, C19856h c19856h, C19892j c19892j2, InterfaceC24229a interfaceC24229a, InterfaceC19889g.g gVar, int i11) {
            super(c19892j);
            this.f63274q = c19856h;
            this.f63275r = c19892j2;
            this.f63276s = interfaceC24229a;
            this.f63277t = gVar;
            this.f63278u = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: W */
        public /* synthetic */ void m82622W(C19892j c19892j, int i11, C19856h c19856h, InterfaceC24229a interfaceC24229a) {
            AsyncHttpClient.this.m82605r(c19892j, i11, c19856h, interfaceC24229a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: X */
        public /* synthetic */ void m82623X(C19892j c19892j, int i11, C19856h c19856h, InterfaceC24229a interfaceC24229a) {
            AsyncHttpClient.this.m82605r(c19892j, i11 + 1, c19856h, interfaceC24229a);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.transsion.transfer.androidasync.http.AbstractC19894l, com.transsion.transfer.androidasync.AbstractC19938q
        /* JADX INFO: renamed from: M */
        public void mo82624M(Exception exc) {
            if (exc != null) {
                this.f63275r.m82749s("exception during response", exc);
            }
            if (this.f63274q.isCancelled()) {
                return;
            }
            if (exc instanceof AsyncSSLException) {
                this.f63275r.m82749s("SSL Exception", exc);
                AsyncSSLException asyncSSLException = (AsyncSSLException) exc;
                this.f63275r.m82752v(asyncSSLException);
                if (asyncSSLException.getIgnore()) {
                    return;
                }
            }
            InterfaceC19931j interfaceC19931jSocket = socket();
            if (interfaceC19931jSocket == null) {
                return;
            }
            super.mo82624M(exc);
            if ((!interfaceC19931jSocket.isOpen() || exc != null) && mo82724e() == null && exc != null) {
                AsyncHttpClient.this.m82588H(this.f63274q, exc, null, this.f63275r, this.f63276s);
            }
            this.f63277t.f63385k = exc;
            Iterator it = AsyncHttpClient.this.f63262a.iterator();
            while (it.hasNext()) {
                ((InterfaceC19889g) it.next()).mo82688b(this.f63277t);
            }
        }

        @Override // com.transsion.transfer.androidasync.C19944t
        /* JADX INFO: renamed from: N */
        public void mo82625N(InterfaceC19937p interfaceC19937p) {
            this.f63277t.f63378j = interfaceC19937p;
            Iterator it = AsyncHttpClient.this.f63262a.iterator();
            while (it.hasNext()) {
                ((InterfaceC19889g) it.next()).mo82690d(this.f63277t);
            }
            super.mo82625N(this.f63277t.f63378j);
            Iterator it2 = AsyncHttpClient.this.f63262a.iterator();
            while (it2.hasNext()) {
                final C19892j c19892jMo82694h = ((InterfaceC19889g) it2.next()).mo82694h(this.f63277t);
                if (c19892jMo82694h != null) {
                    C19892j c19892j = this.f63275r;
                    c19892jMo82694h.f63397l = c19892j.f63397l;
                    c19892jMo82694h.f63396k = c19892j.f63396k;
                    c19892jMo82694h.f63395j = c19892j.f63395j;
                    c19892jMo82694h.f63393h = c19892j.f63393h;
                    c19892jMo82694h.f63394i = c19892j.f63394i;
                    AsyncHttpClient.m82589I(c19892jMo82694h);
                    this.f63275r.m82750t("Response intercepted by middleware");
                    c19892jMo82694h.m82750t("Request initiated by middleware intercept by middleware");
                    AsyncServer asyncServer = AsyncHttpClient.this.f63266e;
                    final int i11 = this.f63278u;
                    final C19856h c19856h = this.f63274q;
                    final InterfaceC24229a interfaceC24229a = this.f63276s;
                    asyncServer.m82472D(new Runnable() { // from class: com.transsion.transfer.androidasync.http.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f63346a.m82622W(c19892jMo82694h, i11, c19856h, interfaceC24229a);
                        }
                    });
                    mo82426v(new InterfaceC23680d.a());
                    return;
                }
            }
            Headers headers = this.f63402j;
            int iMo82722b = mo82722b();
            if ((iMo82722b != 301 && iMo82722b != 302 && iMo82722b != 307) || !this.f63275r.m82738g()) {
                this.f63275r.m82751u("Final (post cache response) headers:\n" + toString());
                AsyncHttpClient.this.m82588H(this.f63274q, null, this, this.f63275r, this.f63276s);
                return;
            }
            String strM82635c = headers.m82635c(HttpHeaders.LOCATION);
            try {
                Uri uri = Uri.parse(strM82635c);
                if (uri.getScheme() == null) {
                    uri = Uri.parse(new URL(new URL(this.f63275r.m82746p().toString()), strM82635c).toString());
                }
                final C19892j c19892j2 = new C19892j(uri, this.f63275r.m82740j().equals("HEAD") ? "HEAD" : "GET");
                C19892j c19892j3 = this.f63275r;
                c19892j2.f63397l = c19892j3.f63397l;
                c19892j2.f63396k = c19892j3.f63396k;
                c19892j2.f63395j = c19892j3.f63395j;
                c19892j2.f63393h = c19892j3.f63393h;
                c19892j2.f63394i = c19892j3.f63394i;
                AsyncHttpClient.m82589I(c19892j2);
                AsyncHttpClient.m82604o(this.f63275r, c19892j2, "User-Agent");
                AsyncHttpClient.m82604o(this.f63275r, c19892j2, "Range");
                this.f63275r.m82750t("Redirecting");
                c19892j2.m82750t("Redirected");
                AsyncServer asyncServer2 = AsyncHttpClient.this.f63266e;
                final int i12 = this.f63278u;
                final C19856h c19856h2 = this.f63274q;
                final InterfaceC24229a interfaceC24229a2 = this.f63276s;
                asyncServer2.m82472D(new Runnable() { // from class: com.transsion.transfer.androidasync.http.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f63353a.m82623X(c19892j2, i12, c19856h2, interfaceC24229a2);
                    }
                });
                mo82426v(new InterfaceC23680d.a());
            } catch (Exception e11) {
                AsyncHttpClient.this.m82588H(this.f63274q, e11, this, this.f63275r, this.f63276s);
            }
        }

        @Override // com.transsion.transfer.androidasync.http.AbstractC19894l
        /* JADX INFO: renamed from: P */
        protected void mo82626P() {
            super.mo82626P();
            if (this.f63274q.isCancelled()) {
                return;
            }
            C19856h c19856h = this.f63274q;
            if (c19856h.f63301h != null) {
                c19856h.f63300g.cancel();
            }
            this.f63275r.m82751u("Received headers:\n" + toString());
            Iterator it = AsyncHttpClient.this.f63262a.iterator();
            while (it.hasNext()) {
                ((InterfaceC19889g) it.next()).mo82693g(this.f63277t);
            }
        }

        @Override // com.transsion.transfer.androidasync.http.AbstractC19894l
        /* JADX INFO: renamed from: R */
        protected void mo82627R(Exception exc) {
            if (exc != null) {
                AsyncHttpClient.this.m82588H(this.f63274q, exc, null, this.f63275r, this.f63276s);
                return;
            }
            this.f63275r.m82751u("request completed");
            if (this.f63274q.isCancelled()) {
                return;
            }
            C19856h c19856h = this.f63274q;
            if (c19856h.f63301h != null && this.f63402j == null) {
                c19856h.f63300g.cancel();
                C19856h c19856h2 = this.f63274q;
                c19856h2.f63300g = AsyncHttpClient.this.f63266e.m82473E(c19856h2.f63301h, AsyncHttpClient.m82609y(this.f63275r));
            }
            Iterator it = AsyncHttpClient.this.f63262a.iterator();
            while (it.hasNext()) {
                ((InterfaceC19889g) it.next()).mo82689c(this.f63277t);
            }
        }

        @Override // com.transsion.transfer.androidasync.http.InterfaceC19893k
        /* JADX INFO: renamed from: z */
        public InterfaceC19931j mo82628z() {
            this.f63275r.m82748r("Detaching socket");
            InterfaceC19931j interfaceC19931jSocket = socket();
            if (interfaceC19931jSocket == null) {
                return null;
            }
            interfaceC19931jSocket.mo82416i(null);
            interfaceC19931jSocket.mo82422q(null);
            interfaceC19931jSocket.mo82428x(null);
            interfaceC19931jSocket.mo82426v(null);
            m82758S(null);
            return interfaceC19931jSocket;
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.AsyncHttpClient$c */
    class C19851c implements InterfaceC23677a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC19894l f63280a;

        C19851c(AbstractC19894l abstractC19894l) {
            this.f63280a = abstractC19894l;
        }

        @Override // p439gv.InterfaceC23677a
        /* JADX INFO: renamed from: g */
        public void mo82442g(Exception exc) {
            if (exc != null) {
                this.f63280a.mo82624M(exc);
            } else {
                this.f63280a.m82757Q();
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.AsyncHttpClient$d */
    class C19852d implements InterfaceC23677a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC19894l f63282a;

        C19852d(AbstractC19894l abstractC19894l) {
            this.f63282a = abstractC19894l;
        }

        @Override // p439gv.InterfaceC23677a
        /* JADX INFO: renamed from: g */
        public void mo82442g(Exception exc) {
            if (exc != null) {
                this.f63282a.mo82624M(exc);
            } else {
                this.f63282a.mo82626P();
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.AsyncHttpClient$e */
    class C19853e extends C19840w {

        /* JADX INFO: renamed from: f */
        final /* synthetic */ C19856h f63284f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ OutputStream f63285g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ File f63286h;

        C19853e(C19856h c19856h, OutputStream outputStream, File file) {
            this.f63284f = c19856h;
            this.f63285g = outputStream;
            this.f63286h = file;
        }

        @Override // com.transsion.transfer.androidasync.future.C19831n
        public void cancelCleanup() {
            try {
                ((InterfaceC19893k) this.f63284f.get()).mo82426v(new InterfaceC23680d.a());
                ((InterfaceC19893k) this.f63284f.get()).close();
            } catch (Exception unused) {
            }
            try {
                this.f63285g.close();
            } catch (Exception unused2) {
            }
            this.f63286h.delete();
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.AsyncHttpClient$f */
    class C19854f implements InterfaceC24229a {

        /* JADX INFO: renamed from: a */
        long f63288a = 0;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ OutputStream f63289b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ File f63290c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ AbstractC19855g f63291d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C19840w f63292e;

        /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.AsyncHttpClient$f$a */
        class a extends AbstractC19943a {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ InterfaceC19893k f63294b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ long f63295c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(OutputStream outputStream, InterfaceC19893k interfaceC19893k, long j11) {
                super(outputStream);
                this.f63294b = interfaceC19893k;
                this.f63295c = j11;
            }

            @Override // com.transsion.transfer.androidasync.stream.AbstractC19943a, p439gv.InterfaceC23680d
            /* JADX INFO: renamed from: F */
            public void mo82444F(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
                C19854f.this.f63288a += (long) byteBufferList.m82494C();
                super.mo82444F(interfaceC19937p, byteBufferList);
                C19854f c19854f = C19854f.this;
                AsyncHttpClient.this.m82583C(c19854f.f63291d, this.f63294b, c19854f.f63288a, this.f63295c);
            }
        }

        /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.AsyncHttpClient$f$b */
        class b implements InterfaceC23677a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC19893k f63297a;

            b(InterfaceC19893k interfaceC19893k) {
                this.f63297a = interfaceC19893k;
            }

            @Override // p439gv.InterfaceC23677a
            /* JADX INFO: renamed from: g */
            public void mo82442g(Exception e11) {
                try {
                    C19854f.this.f63289b.close();
                } catch (IOException e12) {
                    e11 = e12;
                }
                Exception exc = e11;
                if (exc == null) {
                    C19854f c19854f = C19854f.this;
                    AsyncHttpClient.this.m82585E(c19854f.f63291d, c19854f.f63292e, this.f63297a, null, c19854f.f63290c);
                } else {
                    C19854f.this.f63290c.delete();
                    C19854f c19854f2 = C19854f.this;
                    AsyncHttpClient.this.m82585E(c19854f2.f63291d, c19854f2.f63292e, this.f63297a, exc, null);
                }
            }
        }

        C19854f(OutputStream outputStream, File file, AbstractC19855g abstractC19855g, C19840w c19840w) {
            this.f63289b = outputStream;
            this.f63290c = file;
            this.f63291d = abstractC19855g;
            this.f63292e = c19840w;
        }

        @Override // p496iv.InterfaceC24229a
        /* JADX INFO: renamed from: a */
        public void mo82629a(Exception exc, InterfaceC19893k interfaceC19893k) {
            if (exc != null) {
                try {
                    this.f63289b.close();
                } catch (IOException unused) {
                }
                this.f63290c.delete();
                AsyncHttpClient.this.m82585E(this.f63291d, this.f63292e, interfaceC19893k, exc, null);
            } else {
                AsyncHttpClient.this.m82582B(this.f63291d, interfaceC19893k);
                interfaceC19893k.mo82426v(new a(this.f63289b, interfaceC19893k, HttpUtil.m82641a(interfaceC19893k.mo82724e())));
                interfaceC19893k.mo82428x(new b(interfaceC19893k));
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.AsyncHttpClient$g */
    public static abstract class AbstractC19855g extends AbstractC19857i {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.AsyncHttpClient$h */
    class C19856h extends C19840w {

        /* JADX INFO: renamed from: f */
        public InterfaceC19931j f63299f;

        /* JADX INFO: renamed from: g */
        public InterfaceC19818a f63300g;

        /* JADX INFO: renamed from: h */
        public Runnable f63301h;

        private C19856h() {
        }

        @Override // com.transsion.transfer.androidasync.future.C19840w, com.transsion.transfer.androidasync.future.C19831n, com.transsion.transfer.androidasync.future.InterfaceC19818a
        public boolean cancel() {
            if (!super.cancel()) {
                return false;
            }
            InterfaceC19931j interfaceC19931j = this.f63299f;
            if (interfaceC19931j != null) {
                interfaceC19931j.mo82426v(new InterfaceC23680d.a());
                this.f63299f.close();
            }
            InterfaceC19818a interfaceC19818a = this.f63300g;
            if (interfaceC19818a == null) {
                return true;
            }
            interfaceC19818a.cancel();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.AsyncHttpClient$i */
    public static abstract class AbstractC19857i implements InterfaceC24230b {
        @Override // p496iv.InterfaceC24230b
        /* JADX INFO: renamed from: a */
        public void mo82630a(InterfaceC19893k interfaceC19893k, long j11, long j12) {
        }

        @Override // p496iv.InterfaceC24230b
        /* JADX INFO: renamed from: b */
        public void mo82631b(InterfaceC19893k interfaceC19893k) {
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.AsyncHttpClient$j */
    public static abstract class AbstractC19858j extends AbstractC19857i {
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.AsyncHttpClient$k */
    public interface InterfaceC19859k {
        /* JADX INFO: renamed from: a */
        void mo82632a(Exception exc, InterfaceC19875b0 interfaceC19875b0);
    }

    public AsyncHttpClient(AsyncServer asyncServer) {
        this.f63266e = asyncServer;
        C19923t c19923t = new C19923t(this);
        this.f63264c = c19923t;
        m82618z(c19923t);
        C19896n c19896n = new C19896n(this);
        this.f63263b = c19896n;
        m82618z(c19896n);
        C19925v c19925v = new C19925v();
        this.f63265d = c19925v;
        m82618z(c19925v);
        this.f63263b.m82761A(new C19929z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void m82585E(final InterfaceC24230b interfaceC24230b, final C19840w c19840w, final InterfaceC19893k interfaceC19893k, final Exception exc, final Object obj) {
        this.f63266e.m82472D(new Runnable() { // from class: com.transsion.transfer.androidasync.http.AsyncHttpClient.7
            @Override // java.lang.Runnable
            public void run() {
                AsyncHttpClient.this.m82584D(interfaceC24230b, c19840w, interfaceC19893k, exc, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public void m82582B(InterfaceC24230b interfaceC24230b, InterfaceC19893k interfaceC19893k) {
        if (interfaceC24230b != null) {
            interfaceC24230b.mo82631b(interfaceC19893k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public void m82583C(InterfaceC24230b interfaceC24230b, InterfaceC19893k interfaceC19893k, long j11, long j12) {
        if (interfaceC24230b != null) {
            interfaceC24230b.mo82630a(interfaceC19893k, j11, j12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public void m82584D(InterfaceC24230b interfaceC24230b, C19840w c19840w, InterfaceC19893k interfaceC19893k, Exception exc, Object obj) {
        if ((exc != null ? c19840w.m82575G(exc) : c19840w.m82577J(obj)) && interfaceC24230b != null) {
            interfaceC24230b.mo83175c(exc, interfaceC19893k, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m82586F(final InterfaceC24230b interfaceC24230b, final C19840w c19840w, InterfaceC25442a interfaceC25442a, Exception exc, final InterfaceC19893k interfaceC19893k) {
        if (exc != null) {
            m82585E(interfaceC24230b, c19840w, interfaceC19893k, exc, null);
            return;
        }
        m82582B(interfaceC24230b, interfaceC19893k);
        InterfaceFutureC19823f interfaceFutureC19823fMo100029a = interfaceC25442a.mo100029a(interfaceC19893k);
        interfaceFutureC19823fMo100029a.mo82539f(new InterfaceC19824g() { // from class: com.transsion.transfer.androidasync.http.b
            @Override // com.transsion.transfer.androidasync.future.InterfaceC19824g
            /* JADX INFO: renamed from: a */
            public final void mo82486a(Exception exc2, Object obj) {
                this.f63337a.m82585E(interfaceC24230b, c19840w, interfaceC19893k, exc2, obj);
            }
        });
        c19840w.setParent(interfaceFutureC19823fMo100029a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m82587G(C19840w c19840w, InterfaceC19859k interfaceC19859k, C19892j c19892j, Exception exc, InterfaceC19893k interfaceC19893k) {
        if (exc != null) {
            if (!c19840w.m82575G(exc) || interfaceC19859k == null) {
                return;
            }
            interfaceC19859k.mo82632a(exc, null);
            return;
        }
        InterfaceC19875b0 interfaceC19875b0M82701F = C19887f0.m82701F(c19892j.m82739h(), interfaceC19893k);
        if (interfaceC19875b0M82701F == null) {
            exc = new WebSocketHandshakeException("Unable to complete websocket handshake");
            interfaceC19893k.close();
            if (!c19840w.m82575G(exc)) {
                return;
            }
        } else if (!c19840w.m82577J(interfaceC19875b0M82701F)) {
            return;
        }
        if (interfaceC19859k != null) {
            interfaceC19859k.mo82632a(exc, interfaceC19875b0M82701F);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public void m82588H(C19856h c19856h, Exception exc, AbstractC19894l abstractC19894l, C19892j c19892j, InterfaceC24229a interfaceC24229a) {
        boolean zM82577J;
        c19856h.f63300g.cancel();
        if (exc != null) {
            c19892j.m82749s("Connection error", exc);
            zM82577J = c19856h.m82575G(exc);
        } else {
            c19892j.m82748r("Connection successful");
            zM82577J = c19856h.m82577J(abstractC19894l);
        }
        if (zM82577J) {
            interfaceC24229a.mo82629a(exc, abstractC19894l);
        } else if (abstractC19894l != null) {
            abstractC19894l.mo82426v(new InterfaceC23680d.a());
            abstractC19894l.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static void m82589I(C19892j c19892j) {
        if (c19892j.f63393h != null) {
            return;
        }
        try {
            List<Proxy> listSelect = ProxySelector.getDefault().select(URI.create(c19892j.m82746p().toString()));
            if (listSelect.isEmpty()) {
                return;
            }
            Proxy proxy = listSelect.get(0);
            if (proxy.type() == Proxy.Type.HTTP && (proxy.address() instanceof InetSocketAddress)) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                c19892j.m82736d(inetSocketAddress.getHostString(), inetSocketAddress.getPort());
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static void m82604o(C19892j c19892j, C19892j c19892j2, String str) {
        String strM82635c = c19892j.m82739h().m82635c(str);
        if (TextUtils.isEmpty(strM82635c)) {
            return;
        }
        c19892j2.m82739h().m82638f(str, strM82635c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public void m82605r(final C19892j c19892j, final int i11, final C19856h c19856h, final InterfaceC24229a interfaceC24229a) {
        if (this.f63266e.m82484t()) {
            m82606s(c19892j, i11, c19856h, interfaceC24229a);
        } else {
            this.f63266e.m82472D(new Runnable() { // from class: com.transsion.transfer.androidasync.http.AsyncHttpClient.1
                @Override // java.lang.Runnable
                public void run() {
                    AsyncHttpClient.this.m82606s(c19892j, i11, c19856h, interfaceC24229a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m82606s(final C19892j c19892j, int i11, final C19856h c19856h, final InterfaceC24229a interfaceC24229a) {
        if (i11 > 15) {
            m82588H(c19856h, new RedirectLimitExceededException("too many redirects"), null, c19892j, interfaceC24229a);
            return;
        }
        c19892j.m82746p();
        final InterfaceC19889g.g gVar = new InterfaceC19889g.g();
        c19892j.f63397l = System.currentTimeMillis();
        gVar.f63384b = c19892j;
        c19892j.m82748r("Executing request.");
        Iterator it = this.f63262a.iterator();
        while (it.hasNext()) {
            ((InterfaceC19889g) it.next()).mo82687a(gVar);
        }
        if (c19892j.m82745o() > 0) {
            Runnable runnable = new Runnable() { // from class: com.transsion.transfer.androidasync.http.AsyncHttpClient.2
                @Override // java.lang.Runnable
                public void run() {
                    InterfaceC19818a interfaceC19818a = gVar.f63376d;
                    if (interfaceC19818a != null) {
                        interfaceC19818a.cancel();
                        InterfaceC19931j interfaceC19931j = gVar.f63379f;
                        if (interfaceC19931j != null) {
                            interfaceC19931j.close();
                        }
                    }
                    AsyncHttpClient.this.m82588H(c19856h, new TimeoutException(), null, c19892j, interfaceC24229a);
                }
            };
            c19856h.f63301h = runnable;
            c19856h.f63300g = this.f63266e.m82473E(runnable, m82609y(c19892j));
        }
        gVar.f63375c = new C19849a(c19892j, c19856h, interfaceC24229a, gVar, i11);
        m82589I(c19892j);
        if (c19892j.m82737e() != null && c19892j.m82739h().m82635c(HttpHeaders.CONTENT_TYPE) == null) {
            c19892j.m82739h().m82638f(HttpHeaders.CONTENT_TYPE, c19892j.m82737e().mo82844k());
        }
        Iterator it2 = this.f63262a.iterator();
        while (it2.hasNext()) {
            InterfaceC19818a interfaceC19818aMo82691e = ((InterfaceC19889g) it2.next()).mo82691e(gVar);
            if (interfaceC19818aMo82691e != null) {
                gVar.f63376d = interfaceC19818aMo82691e;
                c19856h.setParent(interfaceC19818aMo82691e);
                return;
            }
        }
        m82588H(c19856h, new IllegalArgumentException("invalid uri=" + c19892j.m82746p() + " middlewares=" + this.f63262a), null, c19892j, interfaceC24229a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m82607u(C19892j c19892j, int i11, C19856h c19856h, InterfaceC24229a interfaceC24229a, InterfaceC19889g.g gVar) {
        C19850b c19850b = new C19850b(c19892j, c19856h, c19892j, interfaceC24229a, gVar, i11);
        gVar.f63381h = new C19851c(c19850b);
        gVar.f63382i = new C19852d(c19850b);
        gVar.f63380g = c19850b;
        c19850b.m82758S(gVar.f63379f);
        Iterator it = this.f63262a.iterator();
        while (it.hasNext() && !((InterfaceC19889g) it.next()).mo82692f(gVar)) {
        }
    }

    /* JADX INFO: renamed from: w */
    public static AsyncHttpClient m82608w() {
        if (f63261f == null) {
            f63261f = new AsyncHttpClient(AsyncServer.m82463r());
        }
        return f63261f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static long m82609y(C19892j c19892j) {
        return c19892j.m82745o();
    }

    /* JADX INFO: renamed from: J */
    public InterfaceFutureC19823f m82610J(C19892j c19892j, String str, InterfaceC19859k interfaceC19859k) {
        return m82611K(c19892j, str != null ? new String[]{str} : null, interfaceC19859k);
    }

    /* JADX INFO: renamed from: K */
    public InterfaceFutureC19823f m82611K(final C19892j c19892j, String[] strArr, final InterfaceC19859k interfaceC19859k) {
        C19887f0.m82700E(c19892j, strArr);
        final C19840w c19840w = new C19840w();
        c19840w.setParent(m82613p(c19892j, new InterfaceC24229a() { // from class: com.transsion.transfer.androidasync.http.c
            @Override // p496iv.InterfaceC24229a
            /* JADX INFO: renamed from: a */
            public final void mo82629a(Exception exc, InterfaceC19893k interfaceC19893k) {
                AsyncHttpClient.m82587G(c19840w, interfaceC19859k, c19892j, exc, interfaceC19893k);
            }
        }));
        return c19840w;
    }

    /* JADX INFO: renamed from: L */
    public InterfaceFutureC19823f m82612L(String str, String str2, InterfaceC19859k interfaceC19859k) {
        return m82610J(new C19890h(str.replace("ws://", "http://").replace("wss://", "https://")), str2, interfaceC19859k);
    }

    /* JADX INFO: renamed from: p */
    public InterfaceFutureC19823f m82613p(C19892j c19892j, InterfaceC24229a interfaceC24229a) {
        C19856h c19856h = new C19856h();
        m82605r(c19892j, 0, c19856h, interfaceC24229a);
        return c19856h;
    }

    /* JADX INFO: renamed from: q */
    public C19840w m82614q(C19892j c19892j, final InterfaceC25442a interfaceC25442a, final InterfaceC24230b interfaceC24230b) {
        C19856h c19856h = new C19856h();
        final C19840w c19840w = new C19840w();
        m82605r(c19892j, 0, c19856h, new InterfaceC24229a() { // from class: com.transsion.transfer.androidasync.http.a
            @Override // p496iv.InterfaceC24229a
            /* JADX INFO: renamed from: a */
            public final void mo82629a(Exception exc, InterfaceC19893k interfaceC19893k) {
                this.f63333a.m82586F(interfaceC24230b, c19840w, interfaceC25442a, exc, interfaceC19893k);
            }
        });
        c19840w.setParent(c19856h);
        return c19840w;
    }

    /* JADX INFO: renamed from: t */
    public InterfaceFutureC19823f m82615t(C19892j c19892j, String str, AbstractC19855g abstractC19855g) {
        File file = new File(str);
        file.getParentFile().mkdirs();
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 8192);
            C19856h c19856h = new C19856h();
            C19853e c19853e = new C19853e(c19856h, bufferedOutputStream, file);
            c19853e.setParent(c19856h);
            m82605r(c19892j, 0, c19856h, new C19854f(bufferedOutputStream, file, abstractC19855g, c19853e));
            return c19853e;
        } catch (FileNotFoundException e11) {
            C19840w c19840w = new C19840w();
            c19840w.m82575G(e11);
            return c19840w;
        }
    }

    /* JADX INFO: renamed from: v */
    public InterfaceFutureC19823f m82616v(C19892j c19892j, AbstractC19858j abstractC19858j) {
        return m82614q(c19892j, new C25447f(), abstractC19858j);
    }

    /* JADX INFO: renamed from: x */
    public AsyncServer m82617x() {
        return this.f63266e;
    }

    /* JADX INFO: renamed from: z */
    public void m82618z(InterfaceC19889g interfaceC19889g) {
        this.f63262a.add(0, interfaceC19889g);
    }
}
