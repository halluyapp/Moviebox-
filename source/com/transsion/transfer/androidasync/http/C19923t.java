package com.transsion.transfer.androidasync.http;

import android.net.Uri;
import com.transsion.transfer.androidasync.ByteBufferList;
import com.transsion.transfer.androidasync.InterfaceC19931j;
import com.transsion.transfer.androidasync.InterfaceC19937p;
import com.transsion.transfer.androidasync.future.C19829l;
import com.transsion.transfer.androidasync.future.C19831n;
import com.transsion.transfer.androidasync.future.C19840w;
import com.transsion.transfer.androidasync.future.InterfaceC19818a;
import com.transsion.transfer.androidasync.future.InterfaceC19821d;
import com.transsion.transfer.androidasync.future.InterfaceC19824g;
import com.transsion.transfer.androidasync.future.InterfaceC19843z;
import com.transsion.transfer.androidasync.future.InterfaceFutureC19823f;
import com.transsion.transfer.androidasync.util.ArrayDeque;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Hashtable;
import java.util.Locale;
import p439gv.InterfaceC23677a;
import p439gv.InterfaceC23678b;
import p439gv.InterfaceC23680d;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.t */
/* JADX INFO: loaded from: classes6.dex */
public class C19923t extends C19873a0 {

    /* JADX INFO: renamed from: a */
    String f63521a;

    /* JADX INFO: renamed from: b */
    int f63522b;

    /* JADX INFO: renamed from: c */
    int f63523c;

    /* JADX INFO: renamed from: d */
    protected AsyncHttpClient f63524d;

    /* JADX INFO: renamed from: e */
    boolean f63525e;

    /* JADX INFO: renamed from: f */
    String f63526f;

    /* JADX INFO: renamed from: g */
    int f63527g;

    /* JADX INFO: renamed from: h */
    Hashtable f63528h;

    /* JADX INFO: renamed from: i */
    int f63529i;

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.t$a */
    class a implements InterfaceC23677a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ArrayDeque f63530a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ e f63531b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f63532c;

        a(ArrayDeque arrayDeque, e eVar, String str) {
            this.f63530a = arrayDeque;
            this.f63531b = eVar;
            this.f63532c = str;
        }

        @Override // p439gv.InterfaceC23677a
        /* JADX INFO: renamed from: g */
        public void mo82442g(Exception exc) {
            synchronized (C19923t.this) {
                this.f63530a.remove(this.f63531b);
                C19923t.this.m82857w(this.f63532c);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.t$b */
    class b implements InterfaceC23677a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC19931j f63534a;

        b(InterfaceC19931j interfaceC19931j) {
            this.f63534a = interfaceC19931j;
        }

        @Override // p439gv.InterfaceC23677a
        /* JADX INFO: renamed from: g */
        public void mo82442g(Exception exc) {
            this.f63534a.mo82422q(null);
            this.f63534a.close();
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.t$c */
    class c extends InterfaceC23680d.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC19931j f63536a;

        c(InterfaceC19931j interfaceC19931j) {
            this.f63536a = interfaceC19931j;
        }

        @Override // p439gv.InterfaceC23680d.a, p439gv.InterfaceC23680d
        /* JADX INFO: renamed from: F */
        public void mo82444F(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
            super.mo82444F(interfaceC19937p, byteBufferList);
            byteBufferList.m82493B();
            this.f63536a.mo82422q(null);
            this.f63536a.close();
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.t$d */
    static class d {

        /* JADX INFO: renamed from: a */
        int f63538a;

        /* JADX INFO: renamed from: b */
        ArrayDeque f63539b = new ArrayDeque();

        /* JADX INFO: renamed from: c */
        ArrayDeque f63540c = new ArrayDeque();

        d() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.t$e */
    class e {

        /* JADX INFO: renamed from: a */
        InterfaceC19931j f63541a;

        /* JADX INFO: renamed from: b */
        long f63542b = System.currentTimeMillis();

        public e(InterfaceC19931j interfaceC19931j) {
            this.f63541a = interfaceC19931j;
        }
    }

    public C19923t(AsyncHttpClient asyncHttpClient) {
        this(asyncHttpClient, "http", 80);
    }

    public C19923t(AsyncHttpClient asyncHttpClient, String str, int i11) {
        this.f63523c = 300000;
        this.f63528h = new Hashtable();
        this.f63529i = Integer.MAX_VALUE;
        this.f63524d = asyncHttpClient;
        this.f63521a = str;
        this.f63522b = i11;
    }

    /* JADX INFO: renamed from: o */
    private d m82851o(String str) {
        d dVar = (d) this.f63528h.get(str);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        this.f63528h.put(str, dVar2);
        return dVar2;
    }

    /* JADX INFO: renamed from: q */
    private void m82852q(InterfaceC19931j interfaceC19931j) {
        interfaceC19931j.mo82428x(new b(interfaceC19931j));
        interfaceC19931j.mo82416i(null);
        interfaceC19931j.mo82426v(new c(interfaceC19931j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ InterfaceFutureC19823f m82853s(int i11, InterfaceC19889g.a aVar, InetAddress inetAddress) {
        final C19840w c19840w = new C19840w();
        String str = String.format(Locale.ENGLISH, "%s:%s", inetAddress, Integer.valueOf(i11));
        aVar.f63384b.m82751u("attempting connection to " + str);
        this.f63524d.m82617x().m82480n(new InetSocketAddress(inetAddress, i11), new InterfaceC23678b() { // from class: com.transsion.transfer.androidasync.http.s
            @Override // p439gv.InterfaceC23678b
            /* JADX INFO: renamed from: a */
            public final void mo82619a(Exception exc, InterfaceC19931j interfaceC19931j) {
                c19840w.m82576H(exc, interfaceC19931j);
            }
        });
        return c19840w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public /* synthetic */ InterfaceFutureC19823f m82854t(final int i11, final InterfaceC19889g.a aVar, InetAddress[] inetAddressArr) {
        return C19829l.m82546d(inetAddressArr, new InterfaceC19843z() { // from class: com.transsion.transfer.androidasync.http.r
            @Override // com.transsion.transfer.androidasync.future.InterfaceC19843z
            public final InterfaceFutureC19823f then(Object obj) {
                return this.f63440a.m82853s(i11, aVar, (InetAddress) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m82855u(InterfaceC19889g.a aVar, Uri uri, int i11, Exception exc) {
        mo82766z(aVar, uri, i11, false, aVar.f63375c).mo82619a(exc, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m82856v(InterfaceC19889g.a aVar, Uri uri, int i11, Exception exc, InterfaceC19931j interfaceC19931j) {
        if (interfaceC19931j == null) {
            return;
        }
        if (exc == null) {
            mo82766z(aVar, uri, i11, false, aVar.f63375c).mo82619a(null, interfaceC19931j);
            return;
        }
        aVar.f63384b.m82748r("Recycling extra socket leftover from cancelled operation");
        m82852q(interfaceC19931j);
        m82859y(interfaceC19931j, aVar.f63384b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public void m82857w(String str) {
        d dVar = (d) this.f63528h.get(str);
        if (dVar == null) {
            return;
        }
        while (!dVar.f63540c.isEmpty()) {
            e eVar = (e) dVar.f63540c.peekLast();
            InterfaceC19931j interfaceC19931j = eVar.f63541a;
            if (eVar.f63542b + ((long) this.f63523c) > System.currentTimeMillis()) {
                break;
            }
            dVar.f63540c.pop();
            interfaceC19931j.mo82422q(null);
            interfaceC19931j.close();
        }
        if (dVar.f63538a == 0 && dVar.f63539b.isEmpty() && dVar.f63540c.isEmpty()) {
            this.f63528h.remove(str);
        }
    }

    /* JADX INFO: renamed from: x */
    private void m82858x(C19892j c19892j) {
        Uri uriM82746p = c19892j.m82746p();
        String strM82860n = m82860n(uriM82746p, m82861p(uriM82746p), c19892j.m82742l(), c19892j.m82743m());
        synchronized (this) {
            try {
                d dVar = (d) this.f63528h.get(strM82860n);
                if (dVar == null) {
                    return;
                }
                dVar.f63538a--;
                while (dVar.f63538a < this.f63529i && dVar.f63539b.size() > 0) {
                    InterfaceC19889g.a aVar = (InterfaceC19889g.a) dVar.f63539b.remove();
                    C19831n c19831n = (C19831n) aVar.f63376d;
                    if (!c19831n.isCancelled()) {
                        c19831n.setParent(mo82691e(aVar));
                    }
                }
                m82857w(strM82860n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private void m82859y(InterfaceC19931j interfaceC19931j, C19892j c19892j) {
        ArrayDeque arrayDeque;
        if (interfaceC19931j == null) {
            return;
        }
        Uri uriM82746p = c19892j.m82746p();
        String strM82860n = m82860n(uriM82746p, m82861p(uriM82746p), c19892j.m82742l(), c19892j.m82743m());
        e eVar = new e(interfaceC19931j);
        synchronized (this) {
            arrayDeque = m82851o(strM82860n).f63540c;
            arrayDeque.push(eVar);
        }
        interfaceC19931j.mo82422q(new a(arrayDeque, eVar, strM82860n));
    }

    @Override // com.transsion.transfer.androidasync.http.C19873a0, com.transsion.transfer.androidasync.http.InterfaceC19889g
    /* JADX INFO: renamed from: b */
    public void mo82688b(InterfaceC19889g.g gVar) {
        if (gVar.f63383a.m82895a("socket-owner") != this) {
            return;
        }
        try {
            m82852q(gVar.f63379f);
            if (gVar.f63385k != null || !gVar.f63379f.isOpen()) {
                gVar.f63384b.m82751u("closing out socket (exception)");
                gVar.f63379f.mo82422q(null);
                gVar.f63379f.close();
            } else if (m82862r(gVar)) {
                gVar.f63384b.m82748r("Recycling keep-alive socket");
                m82859y(gVar.f63379f, gVar.f63384b);
            } else {
                gVar.f63384b.m82751u("closing out socket (not keep alive)");
                gVar.f63379f.mo82422q(null);
                gVar.f63379f.close();
            }
        } finally {
            m82858x(gVar.f63384b);
        }
    }

    @Override // com.transsion.transfer.androidasync.http.C19873a0, com.transsion.transfer.androidasync.http.InterfaceC19889g
    /* JADX INFO: renamed from: e */
    public InterfaceC19818a mo82691e(final InterfaceC19889g.a aVar) {
        String host;
        int iM82743m;
        String str;
        final Uri uriM82746p = aVar.f63384b.m82746p();
        final int iM82861p = m82861p(aVar.f63384b.m82746p());
        if (iM82861p == -1) {
            return null;
        }
        aVar.f63383a.m82896b("socket-owner", this);
        d dVarM82851o = m82851o(m82860n(uriM82746p, iM82861p, aVar.f63384b.m82742l(), aVar.f63384b.m82743m()));
        synchronized (this) {
            try {
                int i11 = dVarM82851o.f63538a;
                if (i11 >= this.f63529i) {
                    C19831n c19831n = new C19831n();
                    dVarM82851o.f63539b.add(aVar);
                    return c19831n;
                }
                boolean z11 = true;
                dVarM82851o.f63538a = i11 + 1;
                while (!dVarM82851o.f63540c.isEmpty()) {
                    e eVar = (e) dVarM82851o.f63540c.pop();
                    InterfaceC19931j interfaceC19931j = eVar.f63541a;
                    if (eVar.f63542b + ((long) this.f63523c) < System.currentTimeMillis()) {
                        interfaceC19931j.mo82422q(null);
                        interfaceC19931j.close();
                    } else if (interfaceC19931j.isOpen()) {
                        aVar.f63384b.m82748r("Reusing keep-alive socket");
                        aVar.f63375c.mo82619a(null, interfaceC19931j);
                        C19831n c19831n2 = new C19831n();
                        c19831n2.setComplete();
                        return c19831n2;
                    }
                }
                if (this.f63525e && this.f63526f == null && aVar.f63384b.m82742l() == null) {
                    aVar.f63384b.m82751u("Resolving domain and connecting to all available addresses");
                    C19840w c19840w = new C19840w();
                    c19840w.m82574E(this.f63524d.m82617x().m82482p(uriM82746p.getHost()).mo82537a(new InterfaceC19843z() { // from class: com.transsion.transfer.androidasync.http.o
                        @Override // com.transsion.transfer.androidasync.future.InterfaceC19843z
                        public final InterfaceFutureC19823f then(Object obj) {
                            return this.f63429a.m82854t(iM82861p, aVar, (InetAddress[]) obj);
                        }
                    }).mo82538e(new InterfaceC19821d() { // from class: com.transsion.transfer.androidasync.http.p
                        @Override // com.transsion.transfer.androidasync.future.InterfaceC19821d
                        /* JADX INFO: renamed from: a */
                        public final void mo82535a(Exception exc) {
                            this.f63432a.m82855u(aVar, uriM82746p, iM82861p, exc);
                        }
                    })).mo82539f(new InterfaceC19824g() { // from class: com.transsion.transfer.androidasync.http.q
                        @Override // com.transsion.transfer.androidasync.future.InterfaceC19824g
                        /* JADX INFO: renamed from: a */
                        public final void mo82486a(Exception exc, Object obj) {
                            this.f63436a.m82856v(aVar, uriM82746p, iM82861p, exc, (InterfaceC19931j) obj);
                        }
                    });
                    return c19840w;
                }
                aVar.f63384b.m82748r("Connecting socket");
                if (aVar.f63384b.m82742l() == null && (str = this.f63526f) != null) {
                    aVar.f63384b.m82736d(str, this.f63527g);
                }
                if (aVar.f63384b.m82742l() != null) {
                    host = aVar.f63384b.m82742l();
                    iM82743m = aVar.f63384b.m82743m();
                } else {
                    host = uriM82746p.getHost();
                    z11 = false;
                    iM82743m = iM82861p;
                }
                if (z11) {
                    aVar.f63384b.m82751u("Using proxy: " + host + ":" + iM82743m);
                }
                return this.f63524d.m82617x().m82479m(host, iM82743m, mo82766z(aVar, uriM82746p, iM82861p, z11, aVar.f63375c));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    String m82860n(Uri uri, int i11, String str, int i12) {
        String str2;
        if (str != null) {
            str2 = str + ":" + i12;
        } else {
            str2 = "";
        }
        if (str != null) {
            str2 = str + ":" + i12;
        }
        return uri.getScheme() + "//" + uri.getHost() + ":" + i11 + "?proxy=" + str2;
    }

    /* JADX INFO: renamed from: p */
    public int m82861p(Uri uri) {
        if (uri.getScheme() == null || !uri.getScheme().equals(this.f63521a)) {
            return -1;
        }
        return uri.getPort() == -1 ? this.f63522b : uri.getPort();
    }

    /* JADX INFO: renamed from: r */
    protected boolean m82862r(InterfaceC19889g.g gVar) {
        return HttpUtil.m82645e(gVar.f63380g.protocol(), gVar.f63380g.mo82724e()) && HttpUtil.m82644d(Protocol.HTTP_1_1, gVar.f63384b.m82739h());
    }

    /* JADX INFO: renamed from: z */
    protected InterfaceC23678b mo82766z(InterfaceC19889g.a aVar, Uri uri, int i11, boolean z11, InterfaceC23678b interfaceC23678b) {
        return interfaceC23678b;
    }
}
