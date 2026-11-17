package com.transsion.transfer.androidasync.http.server;

import android.util.Log;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.transsion.transfer.androidasync.AsyncServer;
import com.transsion.transfer.androidasync.ByteBufferList;
import com.transsion.transfer.androidasync.C19809a0;
import com.transsion.transfer.androidasync.InterfaceC19930i;
import com.transsion.transfer.androidasync.InterfaceC19931j;
import com.transsion.transfer.androidasync.InterfaceC19937p;
import com.transsion.transfer.androidasync.http.Headers;
import com.transsion.transfer.androidasync.http.HttpUtil;
import com.transsion.transfer.androidasync.http.InterfaceC19875b0;
import com.transsion.transfer.androidasync.http.Multimap;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import p439gv.InterfaceC23677a;
import p439gv.InterfaceC23680d;
import p439gv.InterfaceC23682f;
import p439gv.InterfaceC23685i;
import p468hv.InterfaceC23899a;

/* JADX INFO: loaded from: classes6.dex */
public class AsyncHttpServer extends C19917n {

    /* JADX INFO: renamed from: h */
    private static Hashtable f63444h;

    /* JADX INFO: renamed from: e */
    ArrayList f63445e = new ArrayList();

    /* JADX INFO: renamed from: f */
    InterfaceC23682f f63446f = new C199021();

    /* JADX INFO: renamed from: g */
    InterfaceC23677a f63447g;

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.server.AsyncHttpServer$1 */
    class C199021 implements InterfaceC23682f {

        /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.server.AsyncHttpServer$1$1, reason: invalid class name */
        class AnonymousClass1 extends C19917n.a {

            /* JADX INFO: renamed from: A */
            final InterfaceC23685i f63449A;

            /* JADX INFO: renamed from: B */
            final /* synthetic */ InterfaceC19931j f63450B;

            /* JADX INFO: renamed from: q */
            C19917n.a f63452q;

            /* JADX INFO: renamed from: r */
            InterfaceC19920q f63453r;

            /* JADX INFO: renamed from: s */
            String f63454s;

            /* JADX INFO: renamed from: t */
            String f63455t;

            /* JADX INFO: renamed from: u */
            boolean f63456u;

            /* JADX INFO: renamed from: v */
            boolean f63457v;

            /* JADX INFO: renamed from: w */
            AbstractC19914k f63458w;

            /* JADX INFO: renamed from: x */
            boolean f63459x;

            /* JADX INFO: renamed from: y */
            boolean f63460y;

            /* JADX INFO: renamed from: z */
            final Runnable f63461z;

            /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.server.AsyncHttpServer$1$1$a */
            class a implements InterfaceC23685i {
                a() {
                }
            }

            /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.server.AsyncHttpServer$1$1$b */
            class b implements InterfaceC23677a {
                b() {
                }

                @Override // p439gv.InterfaceC23677a
                /* JADX INFO: renamed from: g */
                public void mo82442g(Exception exc) {
                    AnonymousClass1.this.resume();
                    if (exc != null) {
                        AnonymousClass1.this.mo82624M(exc);
                        return;
                    }
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    anonymousClass1.f63459x = true;
                    anonymousClass1.mo82785V();
                }
            }

            /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.server.AsyncHttpServer$1$1$c */
            class c extends AbstractC19914k {
                c(InterfaceC19931j interfaceC19931j, AbstractC19906c abstractC19906c) {
                    super(interfaceC19931j, abstractC19906c);
                }

                @Override // com.transsion.transfer.androidasync.http.server.AbstractC19914k
                /* JADX INFO: renamed from: C */
                protected void mo82789C() {
                    AnonymousClass1.this.f63456u = true;
                    super.mo82789C();
                    this.f63490d.mo82428x(null);
                    AsyncHttpServer.this.m82776r(m82823r(), AnonymousClass1.this.f63458w);
                    AnonymousClass1.this.m82783b0();
                }

                @Override // com.transsion.transfer.androidasync.http.server.AbstractC19914k
                /* JADX INFO: renamed from: E */
                protected void mo82790E(Exception exc) {
                    super.mo82790E(exc);
                    if (exc != null) {
                        AnonymousClass1.this.f63450B.mo82426v(new InterfaceC23680d.a());
                        AnonymousClass1.this.f63450B.mo82428x(new InterfaceC23677a.a());
                        AnonymousClass1.this.f63450B.close();
                    }
                }
            }

            /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.server.AsyncHttpServer$1$1$d */
            class d extends InterfaceC23680d.a {
                d() {
                }

                @Override // p439gv.InterfaceC23680d.a, p439gv.InterfaceC23680d
                /* JADX INFO: renamed from: F */
                public void mo82444F(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
                    super.mo82444F(interfaceC19937p, byteBufferList);
                    AnonymousClass1.this.f63468i.close();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InterfaceC19931j interfaceC19931j) {
                super();
                this.f63450B = interfaceC19931j;
                this.f63452q = this;
                this.f63461z = new Runnable() { // from class: com.transsion.transfer.androidasync.http.server.AsyncHttpServer.1.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                    }
                };
                this.f63449A = new a();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: b0 */
            public void m82783b0() {
                if (this.f63457v && this.f63456u && !AsyncHttpServer.this.m82772n(this.f63458w)) {
                    if (AsyncHttpServer.this.m82771m(this.f63452q, this.f63458w)) {
                        C199021.this.mo82780t(this.f63450B);
                    } else {
                        this.f63450B.close();
                    }
                }
            }

            @Override // com.transsion.transfer.androidasync.http.server.AbstractC19906c
            /* JADX INFO: renamed from: U */
            protected InterfaceC23899a mo82784U(Headers headers) {
                String[] strArrSplit = m82799T().split(" ");
                String str = strArrSplit[1];
                this.f63454s = str;
                String strDecode = URLDecoder.decode(str.split("\\?")[0]);
                this.f63455t = strDecode;
                String str2 = strArrSplit[0];
                this.f63472m = str2;
                C19917n.d dVarMo82830a = AsyncHttpServer.this.mo82830a(str2, strDecode);
                if (dVarMo82830a == null) {
                    return null;
                }
                this.f63506o = dVarMo82830a.f63514c;
                this.f63453r = dVarMo82830a.f63515d;
                return null;
            }

            @Override // com.transsion.transfer.androidasync.http.server.AbstractC19906c
            /* JADX INFO: renamed from: V */
            protected void mo82785V() {
                Headers headers = getHeaders();
                if (!this.f63459x && "100-continue".equals(headers.m82635c("Expect"))) {
                    pause();
                    C19809a0.m82527h(this.f63468i, "HTTP/1.1 100 Continue\r\n\r\n".getBytes(), new b());
                    return;
                }
                c cVar = new c(this.f63450B, this);
                this.f63458w = cVar;
                boolean zM82775q = AsyncHttpServer.this.m82775q(this, cVar);
                this.f63460y = zM82775q;
                if (zM82775q) {
                    return;
                }
                if (this.f63453r == null) {
                    this.f63458w.mo82804c(TTAdConstant.DEEPLINK_FALLBACK_CODE);
                    this.f63458w.mo82414d();
                } else if (!mo82793C().mo82843K() || this.f63457v) {
                    m82787c0();
                }
            }

            @Override // com.transsion.transfer.androidasync.http.server.AbstractC19906c
            /* JADX INFO: renamed from: X */
            protected InterfaceC23899a mo82786X(Headers headers) {
                return AsyncHttpServer.this.m82777s(headers);
            }

            /* JADX INFO: renamed from: c0 */
            void m82787c0() {
                AsyncHttpServer.this.m82774p(this.f63453r, this, this.f63458w);
            }

            @Override // com.transsion.transfer.androidasync.http.server.AbstractC19906c, p439gv.InterfaceC23677a
            /* JADX INFO: renamed from: g */
            public void mo82442g(Exception exc) {
                if (AsyncHttpServer.this.m82772n(this.f63458w)) {
                    return;
                }
                this.f63457v = true;
                super.mo82442g(exc);
                this.f63468i.mo82426v(new d());
                if (exc != null) {
                    this.f63468i.close();
                    return;
                }
                m82783b0();
                if (!mo82793C().mo82843K() || this.f63460y) {
                    return;
                }
                m82787c0();
            }

            @Override // com.transsion.transfer.androidasync.http.server.InterfaceC19905b
            public String getPath() {
                return this.f63455t;
            }

            @Override // com.transsion.transfer.androidasync.http.server.InterfaceC19905b
            /* JADX INFO: renamed from: h */
            public Multimap mo82788h() {
                String[] strArrSplit = this.f63454s.split("\\?", 2);
                return strArrSplit.length < 2 ? new Multimap() : Multimap.parseQuery(strArrSplit[1]);
            }
        }

        C199021() {
        }

        @Override // p439gv.InterfaceC23677a
        /* JADX INFO: renamed from: g */
        public void mo82442g(Exception exc) {
            AsyncHttpServer.this.m82770t(exc);
        }

        @Override // p439gv.InterfaceC23682f
        /* JADX INFO: renamed from: o */
        public void mo82779o(InterfaceC19930i interfaceC19930i) {
            AsyncHttpServer.this.f63445e.add(interfaceC19930i);
        }

        @Override // p439gv.InterfaceC23682f
        /* JADX INFO: renamed from: t */
        public void mo82780t(InterfaceC19931j interfaceC19931j) {
            new AnonymousClass1(interfaceC19931j).m82801Y(interfaceC19931j);
            interfaceC19931j.resume();
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.server.AsyncHttpServer$a */
    public interface InterfaceC19903a {
        /* JADX INFO: renamed from: a */
        void mo82791a(InterfaceC19875b0 interfaceC19875b0, InterfaceC19905b interfaceC19905b);
    }

    static {
        Hashtable hashtable = new Hashtable();
        f63444h = hashtable;
        hashtable.put(200, "OK");
        f63444h.put(Integer.valueOf(Sdk$SDKError.Reason.AD_CONSUMED_VALUE), "Accepted");
        f63444h.put(Integer.valueOf(Sdk$SDKError.Reason.AD_ALREADY_FAILED_VALUE), "Partial Content");
        f63444h.put(101, "Switching Protocols");
        f63444h.put(Integer.valueOf(Sdk$SDKError.Reason.MRAID_ERROR_VALUE), "Moved Permanently");
        f63444h.put(Integer.valueOf(Sdk$SDKError.Reason.INVALID_IFA_STATUS_VALUE), "Found");
        f63444h.put(Integer.valueOf(Sdk$SDKError.Reason.AD_EXPIRED_VALUE), "Not Modified");
        f63444h.put(400, "Bad Request");
        f63444h.put(401, "Unauthorized");
        f63444h.put(Integer.valueOf(TTAdConstant.DEEPLINK_FALLBACK_CODE), "Not Found");
        f63444h.put(500, "Internal Server Error");
    }

    /* JADX INFO: renamed from: l */
    public static String m82769l(int i11) {
        String str = (String) f63444h.get(Integer.valueOf(i11));
        return str == null ? "Unknown" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m82770t(Exception exc) {
        InterfaceC23677a interfaceC23677a = this.f63447g;
        if (interfaceC23677a != null) {
            interfaceC23677a.mo82442g(exc);
        }
    }

    /* JADX INFO: renamed from: m */
    protected boolean m82771m(InterfaceC19905b interfaceC19905b, InterfaceC19907d interfaceC19907d) {
        return HttpUtil.m82645e(interfaceC19907d.mo82802D(), interfaceC19905b.getHeaders());
    }

    /* JADX INFO: renamed from: n */
    protected boolean m82772n(InterfaceC19907d interfaceC19907d) {
        return interfaceC19907d.mo82803b() == 101;
    }

    /* JADX INFO: renamed from: o */
    public InterfaceC19930i m82773o(AsyncServer asyncServer, int i11) {
        return asyncServer.m82485y(null, i11, this.f63446f);
    }

    /* JADX INFO: renamed from: p */
    protected void m82774p(InterfaceC19920q interfaceC19920q, InterfaceC19905b interfaceC19905b, InterfaceC19907d interfaceC19907d) {
        if (interfaceC19920q != null) {
            try {
                interfaceC19920q.mo82825b(interfaceC19905b, interfaceC19907d);
            } catch (Exception e11) {
                Log.e("AsyncHttpServer", "request callback raised uncaught exception. Catching versus crashing process", e11);
                interfaceC19907d.mo82804c(500);
                interfaceC19907d.mo82414d();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    protected boolean m82775q(InterfaceC19905b interfaceC19905b, InterfaceC19907d interfaceC19907d) {
        return false;
    }

    /* JADX INFO: renamed from: r */
    protected void m82776r(InterfaceC19905b interfaceC19905b, InterfaceC19907d interfaceC19907d) {
    }

    /* JADX INFO: renamed from: s */
    protected InterfaceC23899a m82777s(Headers headers) {
        return new C19922s(headers.m82635c(HttpHeaders.CONTENT_TYPE));
    }

    /* JADX INFO: renamed from: u */
    public void m82778u() {
        ArrayList arrayList = this.f63445e;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC19930i) it.next()).stop();
            }
        }
    }
}
