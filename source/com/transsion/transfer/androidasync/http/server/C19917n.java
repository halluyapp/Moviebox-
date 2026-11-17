package com.transsion.transfer.androidasync.http.server;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.cloud.tmc.integration.utils.share.config.ShareConstant;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.transsion.transfer.androidasync.http.C19887f0;
import com.transsion.transfer.androidasync.http.InterfaceC19875b0;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.server.n */
/* JADX INFO: loaded from: classes6.dex */
public class C19917n implements InterfaceC19921r {

    /* JADX INFO: renamed from: c */
    static Hashtable f63502c;

    /* JADX INFO: renamed from: d */
    static Hashtable f63503d;

    /* JADX INFO: renamed from: a */
    final ArrayList f63504a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private b f63505b = new b();

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.server.n$a */
    abstract class a extends AbstractC19906c {

        /* JADX INFO: renamed from: o */
        Matcher f63506o;

        a() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.server.n$b */
    class b implements InterfaceC19920q, InterfaceC19921r {
        b() {
        }

        @Override // com.transsion.transfer.androidasync.http.server.InterfaceC19921r
        /* JADX INFO: renamed from: a */
        public d mo82830a(String str, String str2) {
            return C19917n.this.mo82830a(str, str2);
        }

        @Override // com.transsion.transfer.androidasync.http.server.InterfaceC19920q
        /* JADX INFO: renamed from: b */
        public void mo82825b(InterfaceC19905b interfaceC19905b, InterfaceC19907d interfaceC19907d) {
            d dVarMo82830a = mo82830a(interfaceC19905b.mo82792B(), interfaceC19905b.getPath());
            if (dVarMo82830a != null) {
                dVarMo82830a.f63515d.mo82825b(interfaceC19905b, interfaceC19907d);
            } else {
                interfaceC19907d.mo82804c(TTAdConstant.DEEPLINK_FALLBACK_CODE);
                interfaceC19907d.mo82414d();
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.server.n$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        String f63509a;

        /* JADX INFO: renamed from: b */
        Pattern f63510b;

        /* JADX INFO: renamed from: c */
        InterfaceC19920q f63511c;

        private c() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.server.n$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final String f63512a;

        /* JADX INFO: renamed from: b */
        public final String f63513b;

        /* JADX INFO: renamed from: c */
        public final Matcher f63514c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC19920q f63515d;

        private d(String str, String str2, Matcher matcher, InterfaceC19920q interfaceC19920q, InterfaceC19904a interfaceC19904a) {
            this.f63512a = str;
            this.f63513b = str2;
            this.f63514c = matcher;
            this.f63515d = interfaceC19920q;
        }
    }

    static {
        Hashtable hashtable = new Hashtable();
        f63502c = hashtable;
        hashtable.put("js", "application/javascript");
        f63502c.put("json", "application/json");
        f63502c.put("png", "image/png");
        f63502c.put("jpg", "image/jpeg");
        f63502c.put("jpeg", "image/jpeg");
        f63502c.put("html", "text/html");
        f63502c.put("css", "text/css");
        f63502c.put("mp4", MimeTypes.VIDEO_MP4);
        f63502c.put("mov", "video/quicktime");
        f63502c.put("wmv", "video/x-ms-wmv");
        f63502c.put("txt", ShareConstant.SHARE_TYPE_TEXT);
        f63503d = new Hashtable();
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC19875b0 m82827e(String str, InterfaceC19905b interfaceC19905b, InterfaceC19907d interfaceC19907d) {
        String strM82635c = interfaceC19905b.getHeaders().m82635c("Connection");
        boolean z11 = false;
        if (strM82635c != null) {
            for (String str2 : strM82635c.split(",")) {
                if ("Upgrade".equalsIgnoreCase(str2.trim())) {
                    z11 = true;
                    break;
                }
            }
        }
        if ("websocket".equalsIgnoreCase(interfaceC19905b.getHeaders().m82635c("Upgrade")) && z11 && TextUtils.equals(str, interfaceC19905b.getHeaders().m82635c("Sec-WebSocket-Protocol"))) {
            return new C19887f0(interfaceC19905b, interfaceC19907d);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static String m82828g(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf == -1) {
            return null;
        }
        String str2 = (String) f63502c.get(str.substring(iLastIndexOf + 1));
        if (str2 != null) {
            return str2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m82829h(String str, AsyncHttpServer.InterfaceC19903a interfaceC19903a, InterfaceC19905b interfaceC19905b, InterfaceC19907d interfaceC19907d) {
        InterfaceC19875b0 interfaceC19875b0M82827e = m82827e(str, interfaceC19905b, interfaceC19907d);
        if (interfaceC19875b0M82827e != null) {
            interfaceC19903a.mo82791a(interfaceC19875b0M82827e, interfaceC19905b);
        } else {
            interfaceC19907d.mo82804c(TTAdConstant.DEEPLINK_FALLBACK_CODE);
            interfaceC19907d.mo82414d();
        }
    }

    @Override // com.transsion.transfer.androidasync.http.server.InterfaceC19921r
    /* JADX INFO: renamed from: a */
    public d mo82830a(String str, String str2) {
        synchronized (this.f63504a) {
            try {
                for (c cVar : this.f63504a) {
                    if (TextUtils.equals(str, cVar.f63509a) || cVar.f63509a == null) {
                        Matcher matcher = cVar.f63510b.matcher(str2);
                        if (matcher.matches()) {
                            InterfaceC19920q interfaceC19920q = cVar.f63511c;
                            if (interfaceC19920q instanceof InterfaceC19921r) {
                                return ((InterfaceC19921r) cVar.f63511c).mo82830a(str, matcher.group(1));
                            }
                            return new d(str, str2, matcher, interfaceC19920q, null);
                        }
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m82831c(String str, String str2, InterfaceC19920q interfaceC19920q) {
        m82832d(str, str2, interfaceC19920q, null);
    }

    /* JADX INFO: renamed from: d */
    public void m82832d(String str, String str2, InterfaceC19920q interfaceC19920q, InterfaceC19904a interfaceC19904a) {
        c cVar = new c();
        cVar.f63510b = Pattern.compile("^" + str2);
        cVar.f63511c = interfaceC19920q;
        cVar.f63509a = str;
        synchronized (this.f63504a) {
            this.f63504a.add(cVar);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m82833f(String str, InterfaceC19920q interfaceC19920q) {
        m82831c("GET", str, interfaceC19920q);
    }

    /* JADX INFO: renamed from: i */
    public void m82834i(String str, InterfaceC19920q interfaceC19920q) {
        m82831c("POST", str, interfaceC19920q);
    }

    /* JADX INFO: renamed from: j */
    public void m82835j(String str, final String str2, final AsyncHttpServer.InterfaceC19903a interfaceC19903a) {
        m82833f(str, new InterfaceC19920q() { // from class: com.transsion.transfer.androidasync.http.server.l
            @Override // com.transsion.transfer.androidasync.http.server.InterfaceC19920q
            /* JADX INFO: renamed from: b */
            public final void mo82825b(InterfaceC19905b interfaceC19905b, InterfaceC19907d interfaceC19907d) {
                C19917n.m82829h(str2, interfaceC19903a, interfaceC19905b, interfaceC19907d);
            }
        });
    }
}
