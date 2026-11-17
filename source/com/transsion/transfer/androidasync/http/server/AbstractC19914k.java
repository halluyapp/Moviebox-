package com.transsion.transfer.androidasync.http.server;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.cloud.tmc.integration.audio.recording.RecorderConstants;
import com.cloud.tmc.kernel.utils.UrlUtils;
import com.transsion.transfer.androidasync.AsyncServer;
import com.transsion.transfer.androidasync.ByteBufferList;
import com.transsion.transfer.androidasync.C19809a0;
import com.transsion.transfer.androidasync.InterfaceC19931j;
import com.transsion.transfer.androidasync.InterfaceC19940s;
import com.transsion.transfer.androidasync.http.Headers;
import com.transsion.transfer.androidasync.http.HttpUtil;
import com.transsion.transfer.androidasync.http.Protocol;
import com.transsion.transfer.androidasync.util.C19953d;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import p439gv.InterfaceC23677a;
import p439gv.InterfaceC23681e;
import p439gv.InterfaceC23686j;
import p529jv.C24470a;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.server.k */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC19914k implements InterfaceC19907d {

    /* JADX INFO: renamed from: c */
    private InterfaceC23681e f63489c;

    /* JADX INFO: renamed from: d */
    InterfaceC19931j f63490d;

    /* JADX INFO: renamed from: e */
    AbstractC19906c f63491e;

    /* JADX INFO: renamed from: g */
    InterfaceC19940s f63493g;

    /* JADX INFO: renamed from: h */
    InterfaceC23686j f63494h;

    /* JADX INFO: renamed from: i */
    boolean f63495i;

    /* JADX INFO: renamed from: j */
    boolean f63496j;

    /* JADX INFO: renamed from: m */
    InterfaceC23677a f63499m;

    /* JADX INFO: renamed from: a */
    private Headers f63487a = new Headers();

    /* JADX INFO: renamed from: b */
    private long f63488b = -1;

    /* JADX INFO: renamed from: f */
    boolean f63492f = false;

    /* JADX INFO: renamed from: k */
    int f63497k = 200;

    /* JADX INFO: renamed from: l */
    String f63498l = "HTTP/1.1";

    AbstractC19914k(InterfaceC19931j interfaceC19931j, AbstractC19906c abstractC19906c) {
        this.f63490d = interfaceC19931j;
        this.f63491e = abstractC19906c;
        if (HttpUtil.m82644d(Protocol.HTTP_1_1, abstractC19906c.getHeaders())) {
            this.f63487a.m82638f("Connection", "Keep-Alive");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m82807B(final InputStream inputStream) {
        C19809a0.m82524e(inputStream, this.f63488b, this, new InterfaceC23677a() { // from class: com.transsion.transfer.androidasync.http.server.j
            @Override // p439gv.InterfaceC23677a
            /* JADX INFO: renamed from: g */
            public final void mo82442g(Exception exc) {
                this.f63485a.m82818z(inputStream, exc);
            }
        }, this.f63489c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m82814v() {
        InterfaceC23686j interfaceC23686jMo82417j = mo82417j();
        if (interfaceC23686jMo82417j != null) {
            interfaceC23686jMo82417j.mo82443a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m82815w(boolean z11, Exception exc) {
        if (exc != null) {
            mo82790E(exc);
            return;
        }
        if (z11) {
            C24470a c24470a = new C24470a(this.f63490d);
            c24470a.m82873o(0);
            this.f63493g = c24470a;
        } else {
            this.f63493g = this.f63490d;
        }
        this.f63493g.mo82422q(this.f63499m);
        this.f63499m = null;
        this.f63493g.mo82416i(this.f63494h);
        this.f63494h = null;
        if (this.f63495i) {
            mo82414d();
        } else {
            mo82413a().m82472D(new Runnable() { // from class: com.transsion.transfer.androidasync.http.server.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f63481a.m82814v();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m82816x(Exception exc) {
        mo82789C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m82817y(ByteBufferList byteBufferList, String str) {
        long jM82494C = byteBufferList.m82494C();
        this.f63488b = jM82494C;
        this.f63487a.m82638f(HttpHeaders.CONTENT_LENGTH, Long.toString(jM82494C));
        if (str != null) {
            this.f63487a.m82638f(HttpHeaders.CONTENT_TYPE, str);
        }
        C19809a0.m82526g(this, byteBufferList, new InterfaceC23677a() { // from class: com.transsion.transfer.androidasync.http.server.h
            @Override // p439gv.InterfaceC23677a
            /* JADX INFO: renamed from: g */
            public final void mo82442g(Exception exc) {
                this.f63482a.m82816x(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m82818z(InputStream inputStream, Exception exc) {
        C19953d.m82894a(inputStream);
        mo82789C();
    }

    /* JADX INFO: renamed from: C */
    protected void mo82789C() {
        this.f63496j = true;
    }

    @Override // com.transsion.transfer.androidasync.http.server.InterfaceC19907d
    /* JADX INFO: renamed from: D */
    public String mo82802D() {
        return this.f63498l;
    }

    /* JADX INFO: renamed from: E */
    protected void mo82790E(Exception exc) {
    }

    /* JADX INFO: renamed from: F */
    public void m82819F(final String str, final ByteBufferList byteBufferList) {
        mo82413a().m82472D(new Runnable() { // from class: com.transsion.transfer.androidasync.http.server.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f63478a.m82817y(byteBufferList, str);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public void m82820H(String str, String str2) {
        try {
            m82821I(str, str2.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e11) {
            throw new AssertionError(e11);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m82821I(String str, byte[] bArr) {
        m82819F(str, new ByteBufferList(bArr));
    }

    /* JADX INFO: renamed from: K */
    public void m82822K(final InputStream inputStream, long j11) {
        long j12;
        long j13 = j11 - 1;
        String strM82635c = this.f63491e.getHeaders().m82635c("Range");
        if (strM82635c != null) {
            String[] strArrSplit = strM82635c.split(UrlUtils.EQUAL_MARK);
            if (strArrSplit.length != 2 || !"bytes".equals(strArrSplit[0])) {
                mo82804c(TTAdConstant.PACKAGE_NAME_CODE);
                mo82414d();
                return;
            }
            String[] strArrSplit2 = strArrSplit[1].split("-");
            try {
                if (strArrSplit2.length > 2) {
                    throw new MalformedRangeException();
                }
                long j14 = !TextUtils.isEmpty(strArrSplit2[0]) ? Long.parseLong(strArrSplit2[0]) : 0L;
                if (strArrSplit2.length == 2 && !TextUtils.isEmpty(strArrSplit2[1])) {
                    j13 = Long.parseLong(strArrSplit2[1]);
                }
                mo82804c(Sdk$SDKError.Reason.AD_ALREADY_FAILED_VALUE);
                getHeaders().m82638f("Content-Range", String.format(Locale.ENGLISH, "bytes %d-%d/%d", Long.valueOf(j14), Long.valueOf(j13), Long.valueOf(j11)));
                j12 = j14;
            } catch (Exception unused) {
                mo82804c(TTAdConstant.PACKAGE_NAME_CODE);
                mo82414d();
                return;
            }
        } else {
            j12 = 0;
        }
        try {
            if (j12 != inputStream.skip(j12)) {
                throw new StreamSkipException("skip failed to skip requested amount");
            }
            long j15 = (j13 - j12) + 1;
            this.f63488b = j15;
            this.f63487a.m82638f(HttpHeaders.CONTENT_LENGTH, String.valueOf(j15));
            this.f63487a.m82638f("Accept-Ranges", "bytes");
            if (this.f63491e.mo82792B().equals("HEAD")) {
                mo82806u();
                mo82789C();
            } else {
                if (this.f63488b != 0) {
                    mo82413a().m82472D(new Runnable() { // from class: com.transsion.transfer.androidasync.http.server.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f63483a.m82807B(inputStream);
                        }
                    });
                    return;
                }
                mo82806u();
                C19953d.m82894a(inputStream);
                mo82789C();
            }
        } catch (Exception unused2) {
            mo82804c(500);
            mo82414d();
        }
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: a */
    public AsyncServer mo82413a() {
        return this.f63490d.mo82413a();
    }

    @Override // com.transsion.transfer.androidasync.http.server.InterfaceC19907d
    /* JADX INFO: renamed from: b */
    public int mo82803b() {
        return this.f63497k;
    }

    @Override // com.transsion.transfer.androidasync.http.server.InterfaceC19907d
    /* JADX INFO: renamed from: c */
    public InterfaceC19907d mo82804c(int i11) {
        this.f63497k = i11;
        return this;
    }

    @Override // com.transsion.transfer.androidasync.http.server.InterfaceC19907d, com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: d */
    public void mo82414d() {
        if (this.f63495i) {
            return;
        }
        this.f63495i = true;
        boolean z11 = this.f63492f;
        if (z11 && this.f63493g == null) {
            return;
        }
        if (!z11) {
            this.f63487a.m82636d("Transfer-Encoding");
        }
        InterfaceC19940s interfaceC19940s = this.f63493g;
        if (interfaceC19940s instanceof C24470a) {
            interfaceC19940s.mo82414d();
            return;
        }
        if (this.f63492f) {
            mo82789C();
        } else if (!this.f63491e.mo82792B().equalsIgnoreCase("HEAD")) {
            m82820H("text/html", "");
        } else {
            mo82806u();
            mo82789C();
        }
    }

    @Override // p439gv.InterfaceC23677a
    /* JADX INFO: renamed from: g */
    public void mo82442g(Exception exc) {
        mo82414d();
    }

    @Override // com.transsion.transfer.androidasync.http.server.InterfaceC19907d
    public Headers getHeaders() {
        return this.f63487a;
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: i */
    public void mo82416i(InterfaceC23686j interfaceC23686j) {
        InterfaceC19940s interfaceC19940s = this.f63493g;
        if (interfaceC19940s != null) {
            interfaceC19940s.mo82416i(interfaceC23686j);
        } else {
            this.f63494h = interfaceC23686j;
        }
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: j */
    public InterfaceC23686j mo82417j() {
        InterfaceC19940s interfaceC19940s = this.f63493g;
        return interfaceC19940s != null ? interfaceC19940s.mo82417j() : this.f63494h;
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: m */
    public void mo82419m(ByteBufferList byteBufferList) {
        InterfaceC19940s interfaceC19940s;
        if (!this.f63492f) {
            m82824s();
        }
        if (byteBufferList.m82494C() == 0 || (interfaceC19940s = this.f63493g) == null) {
            return;
        }
        interfaceC19940s.mo82419m(byteBufferList);
    }

    @Override // com.transsion.transfer.androidasync.http.server.InterfaceC19907d
    /* JADX INFO: renamed from: p */
    public void mo82805p(File file, InterfaceC23681e interfaceC23681e) {
        try {
            this.f63489c = interfaceC23681e;
            if (this.f63487a.m82635c(HttpHeaders.CONTENT_TYPE) == null) {
                this.f63487a.m82638f(HttpHeaders.CONTENT_TYPE, C19917n.m82828g(file.getAbsolutePath()));
            }
            m82822K(new BufferedInputStream(new FileInputStream(file), RecorderConstants.RECORD_ENCODING_BITRATE_64000), file.length());
        } catch (FileNotFoundException unused) {
            mo82804c(TTAdConstant.DEEPLINK_FALLBACK_CODE);
            mo82414d();
        }
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: q */
    public void mo82422q(InterfaceC23677a interfaceC23677a) {
        InterfaceC19940s interfaceC19940s = this.f63493g;
        if (interfaceC19940s != null) {
            interfaceC19940s.mo82422q(interfaceC23677a);
        } else {
            this.f63499m = interfaceC23677a;
        }
    }

    /* JADX INFO: renamed from: r */
    public InterfaceC19905b m82823r() {
        return this.f63491e;
    }

    /* JADX INFO: renamed from: s */
    void m82824s() {
        final boolean z11;
        if (this.f63492f) {
            return;
        }
        this.f63492f = true;
        String strM82635c = this.f63487a.m82635c("Transfer-Encoding");
        if ("".equals(strM82635c)) {
            this.f63487a.m82637e("Transfer-Encoding");
        }
        boolean z12 = ("Chunked".equalsIgnoreCase(strM82635c) || strM82635c == null) && !"close".equalsIgnoreCase(this.f63487a.m82635c("Connection"));
        if (this.f63488b < 0) {
            String strM82635c2 = this.f63487a.m82635c(HttpHeaders.CONTENT_LENGTH);
            if (!TextUtils.isEmpty(strM82635c2)) {
                this.f63488b = Long.valueOf(strM82635c2).longValue();
            }
        }
        if (this.f63488b >= 0 || !z12) {
            z11 = false;
        } else {
            this.f63487a.m82638f("Transfer-Encoding", "Chunked");
            z11 = true;
        }
        C19809a0.m82527h(this.f63490d, this.f63487a.m82639g(String.format(Locale.ENGLISH, "%s %s %s", this.f63498l, Integer.valueOf(this.f63497k), AsyncHttpServer.m82769l(this.f63497k))).getBytes(), new InterfaceC23677a() { // from class: com.transsion.transfer.androidasync.http.server.e
            @Override // p439gv.InterfaceC23677a
            /* JADX INFO: renamed from: g */
            public final void mo82442g(Exception exc) {
                this.f63476a.m82815w(z11, exc);
            }
        });
    }

    @Override // com.transsion.transfer.androidasync.http.server.InterfaceC19907d
    public void send(String str) {
        String strM82635c = this.f63487a.m82635c(HttpHeaders.CONTENT_TYPE);
        if (strM82635c == null) {
            strM82635c = "text/html; charset=utf-8";
        }
        m82820H(strM82635c, str);
    }

    public String toString() {
        return this.f63487a == null ? super.toString() : this.f63487a.m82639g(String.format(Locale.ENGLISH, "%s %s %s", this.f63498l, Integer.valueOf(this.f63497k), AsyncHttpServer.m82769l(this.f63497k)));
    }

    @Override // com.transsion.transfer.androidasync.http.server.InterfaceC19907d
    /* JADX INFO: renamed from: u */
    public void mo82806u() {
        m82824s();
    }
}
