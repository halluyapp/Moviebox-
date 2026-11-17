package com.transsion.transfer.androidasync;

import com.transsion.transfer.androidasync.util.C19950a;
import java.nio.ByteBuffer;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.AbstractVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import p439gv.InterfaceC23677a;
import p439gv.InterfaceC23680d;
import p439gv.InterfaceC23686j;

/* JADX INFO: loaded from: classes6.dex */
public class AsyncSSLSocketWrapper implements InterfaceC19931j, InterfaceC19937p, InterfaceC19808a {

    /* JADX INFO: renamed from: v */
    static SSLContext f63129v;

    /* JADX INFO: renamed from: w */
    static SSLContext f63130w;

    /* JADX INFO: renamed from: x */
    static TrustManager[] f63131x;

    /* JADX INFO: renamed from: y */
    static HostnameVerifier f63132y;

    /* JADX INFO: renamed from: a */
    InterfaceC19931j f63133a;

    /* JADX INFO: renamed from: b */
    C19935n f63134b;

    /* JADX INFO: renamed from: c */
    boolean f63135c;

    /* JADX INFO: renamed from: d */
    SSLEngine f63136d;

    /* JADX INFO: renamed from: e */
    boolean f63137e;

    /* JADX INFO: renamed from: f */
    private int f63138f;

    /* JADX INFO: renamed from: g */
    private String f63139g;

    /* JADX INFO: renamed from: h */
    private boolean f63140h;

    /* JADX INFO: renamed from: i */
    HostnameVerifier f63141i;

    /* JADX INFO: renamed from: j */
    InterfaceC19794g f63142j;

    /* JADX INFO: renamed from: k */
    X509Certificate[] f63143k;

    /* JADX INFO: renamed from: l */
    InterfaceC23686j f63144l;

    /* JADX INFO: renamed from: m */
    InterfaceC23680d f63145m;

    /* JADX INFO: renamed from: n */
    TrustManager[] f63146n;

    /* JADX INFO: renamed from: o */
    boolean f63147o;

    /* JADX INFO: renamed from: p */
    boolean f63148p;

    /* JADX INFO: renamed from: q */
    Exception f63149q;

    /* JADX INFO: renamed from: r */
    final ByteBufferList f63150r = new ByteBufferList();

    /* JADX INFO: renamed from: s */
    final InterfaceC23680d f63151s;

    /* JADX INFO: renamed from: t */
    ByteBufferList f63152t;

    /* JADX INFO: renamed from: u */
    InterfaceC23677a f63153u;

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.AsyncSSLSocketWrapper$a */
    class C19788a implements X509TrustManager {
        C19788a() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            for (X509Certificate x509Certificate : x509CertificateArr) {
                if (x509Certificate != null && x509Certificate.getCriticalExtensionOIDs() != null) {
                    x509Certificate.getCriticalExtensionOIDs().remove("2.5.29.15");
                }
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.AsyncSSLSocketWrapper$b */
    class C19789b implements X509TrustManager {
        C19789b() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.AsyncSSLSocketWrapper$c */
    class C19790c implements InterfaceC23677a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC19794g f63154a;

        C19790c(InterfaceC19794g interfaceC19794g) {
            this.f63154a = interfaceC19794g;
        }

        @Override // p439gv.InterfaceC23677a
        /* JADX INFO: renamed from: g */
        public void mo82442g(Exception exc) {
            if (exc != null) {
                this.f63154a.mo82445a(exc, null);
            } else {
                this.f63154a.mo82445a(new SSLException("socket closed during handshake"), null);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.AsyncSSLSocketWrapper$d */
    class C19791d implements InterfaceC23686j {
        C19791d() {
        }

        @Override // p439gv.InterfaceC23686j
        /* JADX INFO: renamed from: a */
        public void mo82443a() {
            InterfaceC23686j interfaceC23686j = AsyncSSLSocketWrapper.this.f63144l;
            if (interfaceC23686j != null) {
                interfaceC23686j.mo82443a();
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.AsyncSSLSocketWrapper$e */
    class C19792e implements InterfaceC23677a {
        C19792e() {
        }

        @Override // p439gv.InterfaceC23677a
        /* JADX INFO: renamed from: g */
        public void mo82442g(Exception exc) {
            InterfaceC23677a interfaceC23677a;
            AsyncSSLSocketWrapper asyncSSLSocketWrapper = AsyncSSLSocketWrapper.this;
            if (asyncSSLSocketWrapper.f63148p) {
                return;
            }
            asyncSSLSocketWrapper.f63148p = true;
            asyncSSLSocketWrapper.f63149q = exc;
            if (asyncSSLSocketWrapper.f63150r.m82513r() || (interfaceC23677a = AsyncSSLSocketWrapper.this.f63153u) == null) {
                return;
            }
            interfaceC23677a.mo82442g(exc);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.AsyncSSLSocketWrapper$f */
    class C19793f implements InterfaceC23680d {

        /* JADX INFO: renamed from: a */
        final C19950a f63157a = new C19950a().m82892d(8192);

        /* JADX INFO: renamed from: b */
        final ByteBufferList f63158b = new ByteBufferList();

        C19793f() {
        }

        @Override // p439gv.InterfaceC23680d
        /* JADX INFO: renamed from: F */
        public void mo82444F(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
            AsyncSSLSocketWrapper asyncSSLSocketWrapper = AsyncSSLSocketWrapper.this;
            if (asyncSSLSocketWrapper.f63135c) {
                return;
            }
            try {
                try {
                    asyncSSLSocketWrapper.f63135c = true;
                    byteBufferList.m82502f(this.f63158b);
                    if (this.f63158b.m82513r()) {
                        this.f63158b.m82498a(this.f63158b.m82506j());
                    }
                    ByteBuffer byteBufferM82495D = ByteBufferList.f63192j;
                    while (true) {
                        if (byteBufferM82495D.remaining() == 0 && this.f63158b.m82496E() > 0) {
                            byteBufferM82495D = this.f63158b.m82495D();
                        }
                        int iRemaining = byteBufferM82495D.remaining();
                        int iM82494C = AsyncSSLSocketWrapper.this.f63150r.m82494C();
                        ByteBuffer byteBufferM82889a = this.f63157a.m82889a();
                        SSLEngineResult sSLEngineResultUnwrap = AsyncSSLSocketWrapper.this.f63136d.unwrap(byteBufferM82495D, byteBufferM82889a);
                        AsyncSSLSocketWrapper asyncSSLSocketWrapper2 = AsyncSSLSocketWrapper.this;
                        asyncSSLSocketWrapper2.m82439l(asyncSSLSocketWrapper2.f63150r, byteBufferM82889a);
                        this.f63157a.m82893e(AsyncSSLSocketWrapper.this.f63150r.m82494C() - iM82494C);
                        if (sSLEngineResultUnwrap.getStatus() != SSLEngineResult.Status.BUFFER_OVERFLOW) {
                            if (sSLEngineResultUnwrap.getStatus() != SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                                AsyncSSLSocketWrapper.this.m82435t(sSLEngineResultUnwrap.getHandshakeStatus());
                                if (byteBufferM82495D.remaining() != iRemaining && iM82494C == AsyncSSLSocketWrapper.this.f63150r.m82494C()) {
                                    this.f63158b.m82500c(byteBufferM82495D);
                                    break;
                                }
                            } else {
                                this.f63158b.m82500c(byteBufferM82495D);
                                if (this.f63158b.m82496E() <= 1) {
                                    break;
                                }
                                this.f63158b.m82500c(this.f63158b.m82506j());
                                byteBufferM82495D = ByteBufferList.f63192j;
                            }
                        } else {
                            C19950a c19950a = this.f63157a;
                            c19950a.m82892d(c19950a.m82891c() * 2);
                        }
                        iRemaining = -1;
                        AsyncSSLSocketWrapper.this.m82435t(sSLEngineResultUnwrap.getHandshakeStatus());
                        if (byteBufferM82495D.remaining() != iRemaining) {
                        }
                    }
                    AsyncSSLSocketWrapper.this.m82438E();
                } catch (SSLException e11) {
                    AsyncSSLSocketWrapper.this.m82430F(e11);
                }
            } finally {
                AsyncSSLSocketWrapper.this.f63135c = false;
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.AsyncSSLSocketWrapper$g */
    public interface InterfaceC19794g {
        /* JADX INFO: renamed from: a */
        void mo82445a(Exception exc, InterfaceC19808a interfaceC19808a);
    }

    static {
        try {
            f63129v = SSLContext.getInstance("Default");
        } catch (Exception e11) {
            try {
                f63129v = SSLContext.getInstance("TLS");
                f63129v.init(null, new TrustManager[]{new C19788a()}, null);
            } catch (Exception e12) {
                e11.printStackTrace();
                e12.printStackTrace();
            }
        }
        try {
            f63130w = SSLContext.getInstance("TLS");
            TrustManager[] trustManagerArr = {new C19789b()};
            f63131x = trustManagerArr;
            f63130w.init(null, trustManagerArr, null);
            f63132y = new HostnameVerifier() { // from class: com.transsion.transfer.androidasync.b
                @Override // javax.net.ssl.HostnameVerifier
                public final boolean verify(String str, SSLSession sSLSession) {
                    return AsyncSSLSocketWrapper.m82437y(str, sSLSession);
                }
            };
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    private AsyncSSLSocketWrapper(InterfaceC19931j interfaceC19931j, String str, int i11, SSLEngine sSLEngine, TrustManager[] trustManagerArr, HostnameVerifier hostnameVerifier, boolean z11) {
        C19793f c19793f = new C19793f();
        this.f63151s = c19793f;
        this.f63152t = new ByteBufferList();
        this.f63133a = interfaceC19931j;
        this.f63141i = hostnameVerifier;
        this.f63147o = z11;
        this.f63146n = trustManagerArr;
        this.f63136d = sSLEngine;
        this.f63139g = str;
        this.f63138f = i11;
        sSLEngine.setUseClientMode(z11);
        C19935n c19935n = new C19935n(interfaceC19931j);
        this.f63134b = c19935n;
        c19935n.mo82416i(new C19791d());
        this.f63133a.mo82428x(new C19792e());
        this.f63133a.mo82426v(c19793f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public void m82430F(Exception exc) {
        InterfaceC19794g interfaceC19794g = this.f63142j;
        if (interfaceC19794g == null) {
            InterfaceC23677a interfaceC23677aM82441r = m82441r();
            if (interfaceC23677aM82441r != null) {
                interfaceC23677aM82441r.mo82442g(exc);
                return;
            }
            return;
        }
        this.f63142j = null;
        this.f63133a.mo82426v(new InterfaceC23680d.a());
        this.f63133a.mo82414d();
        this.f63133a.mo82422q(null);
        this.f63133a.close();
        interfaceC19794g.mo82445a(exc, null);
    }

    /* JADX INFO: renamed from: o */
    public static SSLContext m82434o() {
        return f63129v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m82435t(SSLEngineResult.HandshakeStatus handshakeStatus) {
        if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_TASK) {
            this.f63136d.getDelegatedTask().run();
        }
        if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
            mo82419m(this.f63152t);
        }
        if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
            this.f63151s.mo82444F(this, new ByteBufferList());
        }
        try {
            if (this.f63137e) {
                return;
            }
            if (this.f63136d.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING && this.f63136d.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.FINISHED) {
                return;
            }
            if (this.f63147o) {
                boolean z11 = false;
                try {
                    this.f63143k = (X509Certificate[]) this.f63136d.getSession().getPeerCertificates();
                    String str = this.f63139g;
                    if (str != null) {
                        HostnameVerifier hostnameVerifier = this.f63141i;
                        if (hostnameVerifier == null) {
                            new StrictHostnameVerifier().verify(this.f63139g, AbstractVerifier.getCNs(this.f63143k[0]), AbstractVerifier.getDNSSubjectAlts(this.f63143k[0]));
                        } else if (!hostnameVerifier.verify(str, this.f63136d.getSession())) {
                            throw new SSLException("hostname <" + this.f63139g + "> has been denied");
                        }
                    }
                    z11 = true;
                    e = null;
                } catch (SSLException e11) {
                    e = e11;
                }
                this.f63137e = true;
                if (!z11) {
                    AsyncSSLException asyncSSLException = new AsyncSSLException(e);
                    m82430F(asyncSSLException);
                    if (!asyncSSLException.getIgnore()) {
                        throw asyncSSLException;
                    }
                }
            } else {
                this.f63137e = true;
            }
            this.f63142j.mo82445a(null, this);
            this.f63142j = null;
            this.f63133a.mo82422q(null);
            mo82413a().m82472D(new Runnable() { // from class: com.transsion.transfer.androidasync.AsyncSSLSocketWrapper.7
                @Override // java.lang.Runnable
                public void run() {
                    InterfaceC23686j interfaceC23686j = AsyncSSLSocketWrapper.this.f63144l;
                    if (interfaceC23686j != null) {
                        interfaceC23686j.mo82443a();
                    }
                }
            });
            m82438E();
        } catch (Exception e12) {
            m82430F(e12);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m82436w(InterfaceC19931j interfaceC19931j, String str, int i11, SSLEngine sSLEngine, TrustManager[] trustManagerArr, HostnameVerifier hostnameVerifier, boolean z11, InterfaceC19794g interfaceC19794g) {
        AsyncSSLSocketWrapper asyncSSLSocketWrapper = new AsyncSSLSocketWrapper(interfaceC19931j, str, i11, sSLEngine, trustManagerArr, hostnameVerifier, z11);
        asyncSSLSocketWrapper.f63142j = interfaceC19794g;
        interfaceC19931j.mo82422q(new C19790c(interfaceC19794g));
        try {
            asyncSSLSocketWrapper.f63136d.beginHandshake();
            asyncSSLSocketWrapper.m82435t(asyncSSLSocketWrapper.f63136d.getHandshakeStatus());
        } catch (SSLException e11) {
            asyncSSLSocketWrapper.m82430F(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ boolean m82437y(String str, SSLSession sSLSession) {
        return true;
    }

    /* JADX INFO: renamed from: E */
    public void m82438E() {
        InterfaceC23677a interfaceC23677a;
        C19809a0.m82520a(this, this.f63150r);
        if (!this.f63148p || this.f63150r.m82513r() || (interfaceC23677a = this.f63153u) == null) {
            return;
        }
        interfaceC23677a.mo82442g(this.f63149q);
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    /* JADX INFO: renamed from: I */
    public InterfaceC23680d mo82412I() {
        return this.f63145m;
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19931j, com.transsion.transfer.androidasync.InterfaceC19937p, com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: a */
    public AsyncServer mo82413a() {
        return this.f63133a.mo82413a();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    public void close() {
        this.f63133a.close();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: d */
    public void mo82414d() {
        this.f63133a.mo82414d();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: i */
    public void mo82416i(InterfaceC23686j interfaceC23686j) {
        this.f63144l = interfaceC23686j;
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    public boolean isOpen() {
        return this.f63133a.isOpen();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    public boolean isPaused() {
        return this.f63133a.isPaused();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: j */
    public InterfaceC23686j mo82417j() {
        return this.f63144l;
    }

    /* JADX INFO: renamed from: l */
    void m82439l(ByteBufferList byteBufferList, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        if (byteBuffer.hasRemaining()) {
            byteBufferList.m82498a(byteBuffer);
        } else {
            ByteBufferList.m82488A(byteBuffer);
        }
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: m */
    public void mo82419m(ByteBufferList byteBufferList) {
        if (!this.f63140h && this.f63134b.m82871l() <= 0) {
            this.f63140h = true;
            ByteBuffer byteBufferM82491t = ByteBufferList.m82491t(m82440n(byteBufferList.m82494C()));
            SSLEngineResult sSLEngineResultWrap = null;
            do {
                if (!this.f63137e || byteBufferList.m82494C() != 0) {
                    int iM82494C = byteBufferList.m82494C();
                    try {
                        ByteBuffer[] byteBufferArrM82507k = byteBufferList.m82507k();
                        sSLEngineResultWrap = this.f63136d.wrap(byteBufferArrM82507k, byteBufferM82491t);
                        byteBufferList.m82499b(byteBufferArrM82507k);
                        byteBufferM82491t.flip();
                        this.f63152t.m82498a(byteBufferM82491t);
                        if (this.f63152t.m82494C() > 0) {
                            this.f63134b.mo82419m(this.f63152t);
                        }
                        int iCapacity = byteBufferM82491t.capacity();
                        try {
                            if (sSLEngineResultWrap.getStatus() == SSLEngineResult.Status.BUFFER_OVERFLOW) {
                                byteBufferM82491t = ByteBufferList.m82491t(iCapacity * 2);
                                iM82494C = -1;
                            } else {
                                byteBufferM82491t = ByteBufferList.m82491t(m82440n(byteBufferList.m82494C()));
                                m82435t(sSLEngineResultWrap.getHandshakeStatus());
                            }
                        } catch (SSLException e11) {
                            e = e11;
                            byteBufferM82491t = null;
                            m82430F(e);
                        }
                    } catch (SSLException e12) {
                        e = e12;
                    }
                    if (iM82494C == byteBufferList.m82494C() && (sSLEngineResultWrap == null || sSLEngineResultWrap.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NEED_WRAP)) {
                        break;
                    }
                } else {
                    break;
                }
            } while (this.f63134b.m82871l() == 0);
            this.f63140h = false;
            ByteBufferList.m82488A(byteBufferM82491t);
        }
    }

    /* JADX INFO: renamed from: n */
    int m82440n(int i11) {
        int i12 = (i11 * 3) / 2;
        if (i12 == 0) {
            return 8192;
        }
        return i12;
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    public void pause() {
        this.f63133a.pause();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: q */
    public void mo82422q(InterfaceC23677a interfaceC23677a) {
        this.f63133a.mo82422q(interfaceC23677a);
    }

    /* JADX INFO: renamed from: r */
    public InterfaceC23677a m82441r() {
        return this.f63153u;
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    public void resume() {
        this.f63133a.resume();
        m82438E();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    /* JADX INFO: renamed from: s */
    public String mo82424s() {
        return null;
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    /* JADX INFO: renamed from: v */
    public void mo82426v(InterfaceC23680d interfaceC23680d) {
        this.f63145m = interfaceC23680d;
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    /* JADX INFO: renamed from: x */
    public void mo82428x(InterfaceC23677a interfaceC23677a) {
        this.f63153u = interfaceC23677a;
    }
}
