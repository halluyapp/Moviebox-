package com.transsion.transfer.androidasync.future;

import com.transsion.transfer.androidasync.C19811c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.future.w */
/* JADX INFO: loaded from: classes6.dex */
public class C19840w extends C19831n implements InterfaceC19820c {

    /* JADX INFO: renamed from: a */
    private C19811c f63253a;

    /* JADX INFO: renamed from: b */
    private Exception f63254b;

    /* JADX INFO: renamed from: c */
    private Object f63255c;

    /* JADX INFO: renamed from: d */
    private boolean f63256d;

    /* JADX INFO: renamed from: e */
    private a f63257e;

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.future.w$a */
    protected interface a {
        /* JADX INFO: renamed from: a */
        void mo82548a(Exception exc, Object obj, b bVar);
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.future.w$b */
    static class b {

        /* JADX INFO: renamed from: a */
        Exception f63258a;

        /* JADX INFO: renamed from: b */
        Object f63259b;

        /* JADX INFO: renamed from: c */
        a f63260c;

        b() {
        }

        /* JADX INFO: renamed from: a */
        void m82580a() {
            while (true) {
                a aVar = this.f63260c;
                if (aVar == null) {
                    return;
                }
                Exception exc = this.f63258a;
                Object obj = this.f63259b;
                this.f63260c = null;
                this.f63258a = null;
                this.f63259b = null;
                aVar.mo82548a(exc, obj, this);
            }
        }
    }

    public C19840w() {
    }

    public C19840w(Object obj) {
        m82577J(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ InterfaceFutureC19823f m82549A(InterfaceC19842y interfaceC19842y, Object obj) {
        return new C19840w(interfaceC19842y.then(obj));
    }

    /* JADX INFO: renamed from: F */
    private InterfaceFutureC19823f m82550F(InterfaceFutureC19823f interfaceFutureC19823f, b bVar) {
        setParent(interfaceFutureC19823f);
        final C19840w c19840w = new C19840w();
        if (interfaceFutureC19823f instanceof C19840w) {
            ((C19840w) interfaceFutureC19823f).m82573D(bVar, new a() { // from class: com.transsion.transfer.androidasync.future.p
                @Override // com.transsion.transfer.androidasync.future.C19840w.a
                /* JADX INFO: renamed from: a */
                public final void mo82548a(Exception exc, Object obj, C19840w.b bVar2) {
                    this.f63241a.m82567w(c19840w, exc, obj, bVar2);
                }
            });
        } else {
            interfaceFutureC19823f.mo82539f(new InterfaceC19824g() { // from class: com.transsion.transfer.androidasync.future.q
                @Override // com.transsion.transfer.androidasync.future.InterfaceC19824g
                /* JADX INFO: renamed from: a */
                public final void mo82486a(Exception exc, Object obj) {
                    this.f63243a.m82568x(c19840w, exc, obj);
                }
            });
        }
        return c19840w;
    }

    /* JADX INFO: renamed from: I */
    private boolean m82551I(Exception exc, Object obj, b bVar) {
        synchronized (this) {
            try {
                if (!super.setComplete()) {
                    return false;
                }
                this.f63255c = obj;
                this.f63254b = exc;
                m82571B();
                m82562r(bVar, m82563s());
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private boolean m82560n(boolean z11) {
        a aVarM82563s;
        if (!super.cancel()) {
            return false;
        }
        synchronized (this) {
            this.f63254b = new CancellationException();
            m82571B();
            aVarM82563s = m82563s();
            this.f63256d = z11;
        }
        m82562r(null, aVarM82563s);
        return true;
    }

    /* JADX INFO: renamed from: q */
    private Object m82561q() throws ExecutionException {
        if (this.f63254b == null) {
            return this.f63255c;
        }
        throw new ExecutionException(this.f63254b);
    }

    /* JADX INFO: renamed from: r */
    private void m82562r(b bVar, a aVar) {
        boolean z11;
        if (this.f63256d || aVar == null) {
            return;
        }
        if (bVar == null) {
            bVar = new b();
            z11 = true;
        } else {
            z11 = false;
        }
        bVar.f63260c = aVar;
        bVar.f63258a = this.f63254b;
        bVar.f63259b = this.f63255c;
        if (z11) {
            bVar.m82580a();
        }
    }

    /* JADX INFO: renamed from: s */
    private a m82563s() {
        a aVar = this.f63257e;
        this.f63257e = null;
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ InterfaceFutureC19823f m82564t(InterfaceC19821d interfaceC19821d, Exception exc) {
        interfaceC19821d.mo82535a(exc);
        return new C19840w(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m82565u(C19840w c19840w, InterfaceC19822e interfaceC19822e, Exception exc, Object obj, b bVar) {
        if (exc == null) {
            c19840w.m82551I(exc, obj, bVar);
            return;
        }
        try {
            c19840w.m82550F(interfaceC19822e.mo82536a(exc), bVar);
        } catch (Exception e11) {
            c19840w.m82551I(e11, null, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m82567w(C19840w c19840w, Exception exc, Object obj, b bVar) {
        c19840w.m82551I(m82551I(exc, obj, bVar) ? null : new CancellationException(), obj, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m82568x(C19840w c19840w, Exception exc, Object obj) {
        c19840w.m82575G(m82551I(exc, obj, null) ? null : new CancellationException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m82569y(InterfaceC19841x interfaceC19841x, C19840w c19840w, Exception e11, Object obj, b bVar) {
        if (e11 == null) {
            try {
                interfaceC19841x.mo82542a(obj);
            } catch (Exception e12) {
                e11 = e12;
            }
        }
        c19840w.m82551I(e11, obj, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m82570z(C19840w c19840w, InterfaceC19843z interfaceC19843z, Exception exc, Object obj, b bVar) {
        if (exc != null) {
            c19840w.m82551I(exc, null, bVar);
            return;
        }
        try {
            c19840w.m82550F(interfaceC19843z.then(obj), bVar);
        } catch (Exception e11) {
            c19840w.m82551I(e11, null, bVar);
        }
    }

    /* JADX INFO: renamed from: B */
    void m82571B() {
        C19811c c19811c = this.f63253a;
        if (c19811c != null) {
            c19811c.m82531b();
            this.f63253a = null;
        }
    }

    @Override // com.transsion.transfer.androidasync.future.C19831n
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C19840w reset() {
        super.reset();
        this.f63255c = null;
        this.f63254b = null;
        this.f63253a = null;
        this.f63257e = null;
        this.f63256d = false;
        return this;
    }

    /* JADX INFO: renamed from: D */
    void m82573D(b bVar, a aVar) {
        synchronized (this) {
            try {
                this.f63257e = aVar;
                if (isDone() || isCancelled()) {
                    m82562r(bVar, m82563s());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public InterfaceFutureC19823f m82574E(InterfaceFutureC19823f interfaceFutureC19823f) {
        return m82550F(interfaceFutureC19823f, null);
    }

    /* JADX INFO: renamed from: G */
    public boolean m82575G(Exception exc) {
        return m82551I(exc, null, null);
    }

    /* JADX INFO: renamed from: H */
    public boolean m82576H(Exception exc, Object obj) {
        return m82551I(exc, obj, null);
    }

    /* JADX INFO: renamed from: J */
    public boolean m82577J(Object obj) {
        return m82551I(null, obj, null);
    }

    @Override // com.transsion.transfer.androidasync.future.InterfaceFutureC19823f
    /* JADX INFO: renamed from: a */
    public InterfaceFutureC19823f mo82537a(final InterfaceC19843z interfaceC19843z) {
        final C19840w c19840w = new C19840w();
        c19840w.setParent(this);
        m82573D(null, new a() { // from class: com.transsion.transfer.androidasync.future.s
            @Override // com.transsion.transfer.androidasync.future.C19840w.a
            /* JADX INFO: renamed from: a */
            public final void mo82548a(Exception exc, Object obj, C19840w.b bVar) {
                C19840w.m82570z(this.f63246a, interfaceC19843z, exc, obj, bVar);
            }
        });
        return c19840w;
    }

    @Override // com.transsion.transfer.androidasync.future.C19831n, com.transsion.transfer.androidasync.future.InterfaceC19818a
    public boolean cancel() {
        return m82560n(this.f63256d);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        return cancel();
    }

    @Override // com.transsion.transfer.androidasync.future.InterfaceFutureC19823f
    /* JADX INFO: renamed from: e */
    public InterfaceFutureC19823f mo82538e(final InterfaceC19821d interfaceC19821d) {
        return m82579p(new InterfaceC19822e() { // from class: com.transsion.transfer.androidasync.future.t
            @Override // com.transsion.transfer.androidasync.future.InterfaceC19822e
            /* JADX INFO: renamed from: a */
            public final InterfaceFutureC19823f mo82536a(Exception exc) {
                return C19840w.m82564t(interfaceC19821d, exc);
            }
        });
    }

    @Override // com.transsion.transfer.androidasync.future.InterfaceFutureC19823f
    /* JADX INFO: renamed from: f */
    public void mo82539f(final InterfaceC19824g interfaceC19824g) {
        if (interfaceC19824g == null) {
            m82573D(null, null);
        } else {
            m82573D(null, new a() { // from class: com.transsion.transfer.androidasync.future.o
                @Override // com.transsion.transfer.androidasync.future.C19840w.a
                /* JADX INFO: renamed from: a */
                public final void mo82548a(Exception exc, Object obj, C19840w.b bVar) {
                    interfaceC19824g.mo82486a(exc, obj);
                }
            });
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        synchronized (this) {
            if (!isCancelled() && !isDone()) {
                m82578o().m82530a();
                return m82561q();
            }
            return m82561q();
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j11, TimeUnit timeUnit) throws TimeoutException {
        synchronized (this) {
            if (!isCancelled() && !isDone()) {
                C19811c c19811cM82578o = m82578o();
                if (c19811cM82578o.m82532c(j11, timeUnit)) {
                    return m82561q();
                }
                throw new TimeoutException();
            }
            return m82561q();
        }
    }

    @Override // com.transsion.transfer.androidasync.future.InterfaceFutureC19823f
    /* JADX INFO: renamed from: h */
    public InterfaceFutureC19823f mo82540h(final InterfaceC19842y interfaceC19842y) {
        return mo82537a(new InterfaceC19843z() { // from class: com.transsion.transfer.androidasync.future.r
            @Override // com.transsion.transfer.androidasync.future.InterfaceC19843z
            public final InterfaceFutureC19823f then(Object obj) {
                return C19840w.m82549A(interfaceC19842y, obj);
            }
        });
    }

    @Override // com.transsion.transfer.androidasync.future.InterfaceFutureC19823f
    /* JADX INFO: renamed from: j */
    public InterfaceFutureC19823f mo82541j(final InterfaceC19841x interfaceC19841x) {
        final C19840w c19840w = new C19840w();
        c19840w.setParent(this);
        m82573D(null, new a() { // from class: com.transsion.transfer.androidasync.future.v
            @Override // com.transsion.transfer.androidasync.future.C19840w.a
            /* JADX INFO: renamed from: a */
            public final void mo82548a(Exception exc, Object obj, C19840w.b bVar) {
                C19840w.m82569y(interfaceC19841x, c19840w, exc, obj, bVar);
            }
        });
        return c19840w;
    }

    /* JADX INFO: renamed from: o */
    C19811c m82578o() {
        if (this.f63253a == null) {
            this.f63253a = new C19811c();
        }
        return this.f63253a;
    }

    /* JADX INFO: renamed from: p */
    public InterfaceFutureC19823f m82579p(final InterfaceC19822e interfaceC19822e) {
        final C19840w c19840w = new C19840w();
        c19840w.setParent(this);
        m82573D(null, new a() { // from class: com.transsion.transfer.androidasync.future.u
            @Override // com.transsion.transfer.androidasync.future.C19840w.a
            /* JADX INFO: renamed from: a */
            public final void mo82548a(Exception exc, Object obj, C19840w.b bVar) {
                C19840w.m82565u(this.f63249a, interfaceC19822e, exc, obj, bVar);
            }
        });
        return c19840w;
    }

    @Override // com.transsion.transfer.androidasync.future.C19831n
    public boolean setComplete() {
        return m82577J(null);
    }

    @Override // com.transsion.transfer.androidasync.future.C19831n, com.transsion.transfer.androidasync.future.InterfaceC19819b
    public boolean setParent(InterfaceC19818a interfaceC19818a) {
        return super.setParent(interfaceC19818a);
    }
}
