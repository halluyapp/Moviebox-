package com.transsion.transfer.androidasync.http;

import android.net.Uri;
import android.util.Log;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.cloud.tmc.kernel.utils.UrlUtils;
import com.transsion.transfer.androidasync.AsyncSSLException;
import java.util.Locale;
import p468hv.InterfaceC23899a;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.j */
/* JADX INFO: loaded from: classes6.dex */
public class C19892j {

    /* JADX INFO: renamed from: a */
    private String f63386a;

    /* JADX INFO: renamed from: b */
    private String f63387b;

    /* JADX INFO: renamed from: c */
    Uri f63388c;

    /* JADX INFO: renamed from: d */
    private Headers f63389d;

    /* JADX INFO: renamed from: e */
    private boolean f63390e;

    /* JADX INFO: renamed from: f */
    private InterfaceC23899a f63391f;

    /* JADX INFO: renamed from: g */
    int f63392g;

    /* JADX INFO: renamed from: h */
    String f63393h;

    /* JADX INFO: renamed from: i */
    int f63394i;

    /* JADX INFO: renamed from: j */
    String f63395j;

    /* JADX INFO: renamed from: k */
    int f63396k;

    /* JADX INFO: renamed from: l */
    long f63397l;

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.j$a */
    class a implements InterfaceC19928y {
        a() {
        }

        public String toString() {
            C19892j c19892j = C19892j.this;
            if (c19892j.f63393h != null) {
                return String.format(Locale.ENGLISH, "%s %s %s", c19892j.f63387b, C19892j.this.m82746p(), C19892j.this.f63386a);
            }
            String strM82741k = c19892j.m82741k();
            if (strM82741k == null || strM82741k.length() == 0) {
                strM82741k = "/";
            }
            String encodedQuery = C19892j.this.m82746p().getEncodedQuery();
            if (encodedQuery != null && encodedQuery.length() != 0) {
                strM82741k = strM82741k + UrlUtils.QUESTION_MARK + encodedQuery;
            }
            return String.format(Locale.ENGLISH, "%s %s %s", C19892j.this.f63387b, strM82741k, C19892j.this.f63386a);
        }
    }

    public C19892j(Uri uri, String str) {
        this(uri, str, null);
    }

    public C19892j(Uri uri, String str, Headers headers) {
        this.f63386a = "HTTP/1.1";
        this.f63389d = new Headers();
        this.f63390e = true;
        this.f63392g = 5000;
        this.f63394i = -1;
        this.f63387b = str;
        this.f63388c = uri;
        if (headers == null) {
            this.f63389d = new Headers();
        } else {
            this.f63389d = headers;
        }
        if (headers == null) {
            m82734x(this.f63389d, uri);
        }
    }

    /* JADX INFO: renamed from: f */
    protected static String m82732f() {
        String property = System.getProperty("http.agent");
        if (property != null) {
            return property;
        }
        return "Java" + System.getProperty("java.version");
    }

    /* JADX INFO: renamed from: i */
    private String m82733i(String str) {
        return String.format(Locale.ENGLISH, "(%d ms) %s: %s", Long.valueOf(this.f63397l != 0 ? System.currentTimeMillis() - this.f63397l : 0L), m82746p(), str);
    }

    /* JADX INFO: renamed from: x */
    public static void m82734x(Headers headers, Uri uri) {
        if (uri != null) {
            String host = uri.getHost();
            if (uri.getPort() != -1) {
                host = host + ":" + uri.getPort();
            }
            if (host != null) {
                headers.m82638f(HttpHeaders.HOST, host);
            }
        }
        headers.m82638f("User-Agent", m82732f());
        headers.m82638f("Accept-Encoding", "gzip, deflate");
        headers.m82638f("Connection", "keep-alive");
        headers.m82638f("Accept", "*/*");
    }

    /* JADX INFO: renamed from: c */
    public C19892j m82735c(String str, String str2) {
        m82739h().m82633a(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public void m82736d(String str, int i11) {
        this.f63393h = str;
        this.f63394i = i11;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC23899a m82737e() {
        return this.f63391f;
    }

    /* JADX INFO: renamed from: g */
    public boolean m82738g() {
        return this.f63390e;
    }

    /* JADX INFO: renamed from: h */
    public Headers m82739h() {
        return this.f63389d;
    }

    /* JADX INFO: renamed from: j */
    public String m82740j() {
        return this.f63387b;
    }

    /* JADX INFO: renamed from: k */
    public String m82741k() {
        return m82746p().getEncodedPath();
    }

    /* JADX INFO: renamed from: l */
    public String m82742l() {
        return this.f63393h;
    }

    /* JADX INFO: renamed from: m */
    public int m82743m() {
        return this.f63394i;
    }

    /* JADX INFO: renamed from: n */
    public InterfaceC19928y m82744n() {
        return new a();
    }

    /* JADX INFO: renamed from: o */
    public int m82745o() {
        return this.f63392g;
    }

    /* JADX INFO: renamed from: p */
    public Uri m82746p() {
        return this.f63388c;
    }

    /* JADX INFO: renamed from: q */
    public boolean m82747q() {
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void m82748r(String str) {
        if (this.f63395j != null && this.f63396k <= 3) {
            m82733i(str);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m82749s(String str, Exception exc) {
        String str2 = this.f63395j;
        if (str2 != null && this.f63396k <= 6) {
            Log.e(str2, m82733i(str));
            Log.e(this.f63395j, exc.getMessage(), exc);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m82750t(String str) {
        if (this.f63395j != null && this.f63396k <= 4) {
            m82733i(str);
        }
    }

    public String toString() {
        Headers headers = this.f63389d;
        return headers == null ? super.toString() : headers.m82639g(this.f63388c.toString());
    }

    /* JADX INFO: renamed from: u */
    public void m82751u(String str) {
        String str2 = this.f63395j;
        if (str2 != null && this.f63396k <= 2) {
            Log.v(str2, m82733i(str));
        }
    }

    /* JADX INFO: renamed from: v */
    public void m82752v(AsyncSSLException asyncSSLException) {
    }

    /* JADX INFO: renamed from: w */
    public void m82753w(InterfaceC23899a interfaceC23899a) {
        this.f63391f = interfaceC23899a;
    }

    /* JADX INFO: renamed from: y */
    public C19892j m82754y(int i11) {
        this.f63392g = i11;
        return this;
    }
}
