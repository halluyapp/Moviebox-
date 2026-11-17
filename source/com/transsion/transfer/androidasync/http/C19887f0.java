package com.transsion.transfer.androidasync.http;

import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.cloud.tmc.miniapp.prepare.steps.PrepareException;
import com.transsion.api.gateway.utils.EncoderUtil;
import com.transsion.transfer.androidasync.AsyncServer;
import com.transsion.transfer.androidasync.ByteBufferList;
import com.transsion.transfer.androidasync.C19809a0;
import com.transsion.transfer.androidasync.C19935n;
import com.transsion.transfer.androidasync.InterfaceC19931j;
import com.transsion.transfer.androidasync.InterfaceC19937p;
import com.transsion.transfer.androidasync.http.server.InterfaceC19905b;
import com.transsion.transfer.androidasync.http.server.InterfaceC19907d;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.LinkedList;
import java.util.UUID;
import okhttp3.internal.p651ws.WebSocketProtocol;
import p439gv.InterfaceC23677a;
import p439gv.InterfaceC23680d;
import p439gv.InterfaceC23686j;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.f0 */
/* JADX INFO: loaded from: classes6.dex */
public class C19887f0 implements InterfaceC19875b0 {

    /* JADX INFO: renamed from: a */
    private LinkedList f63360a;

    /* JADX INFO: renamed from: b */
    private InterfaceC19931j f63361b;

    /* JADX INFO: renamed from: c */
    C19935n f63362c;

    /* JADX INFO: renamed from: d */
    String f63363d;

    /* JADX INFO: renamed from: e */
    HybiParser f63364e;

    /* JADX INFO: renamed from: f */
    InterfaceC23677a f63365f;

    /* JADX INFO: renamed from: g */
    private InterfaceC19875b0.c f63366g;

    /* JADX INFO: renamed from: h */
    private InterfaceC23680d f63367h;

    /* JADX INFO: renamed from: i */
    private InterfaceC19875b0.b f63368i;

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.f0$a */
    class a extends HybiParser {
        a(InterfaceC19937p interfaceC19937p) {
            super(interfaceC19937p);
        }

        @Override // com.transsion.transfer.androidasync.http.HybiParser
        /* JADX INFO: renamed from: A */
        protected void mo82674A(String str) {
            C19887f0.m82710l(C19887f0.this);
        }

        @Override // com.transsion.transfer.androidasync.http.HybiParser
        /* JADX INFO: renamed from: B */
        protected void mo82675B(String str) {
            if (C19887f0.this.f63368i != null) {
                C19887f0.this.f63368i.mo82698a(str);
            }
        }

        @Override // com.transsion.transfer.androidasync.http.HybiParser
        /* JADX INFO: renamed from: H */
        protected void mo82678H(Exception exc) {
            InterfaceC23677a interfaceC23677a = C19887f0.this.f63365f;
            if (interfaceC23677a != null) {
                interfaceC23677a.mo82442g(exc);
            }
        }

        @Override // com.transsion.transfer.androidasync.http.HybiParser
        /* JADX INFO: renamed from: J */
        protected void mo82679J(byte[] bArr) {
            C19887f0.this.f63362c.mo82419m(new ByteBufferList(bArr));
        }

        @Override // com.transsion.transfer.androidasync.http.HybiParser
        /* JADX INFO: renamed from: x */
        protected void mo82684x(int i11, String str) {
            C19887f0.this.f63361b.close();
        }

        @Override // com.transsion.transfer.androidasync.http.HybiParser
        /* JADX INFO: renamed from: y */
        protected void mo82685y(String str) {
            if (C19887f0.this.f63366g != null) {
                C19887f0.this.f63366g.mo82699a(str);
            }
        }

        @Override // com.transsion.transfer.androidasync.http.HybiParser
        /* JADX INFO: renamed from: z */
        protected void mo82686z(byte[] bArr) {
            C19887f0.this.m82716y(new ByteBufferList(bArr));
        }
    }

    public C19887f0(InterfaceC19905b interfaceC19905b, InterfaceC19907d interfaceC19907d) {
        this(interfaceC19905b.getSocket());
        String strM82715w = m82715w(interfaceC19905b.getHeaders().m82635c("Sec-WebSocket-Key") + WebSocketProtocol.ACCEPT_MAGIC);
        interfaceC19905b.getHeaders().m82635c("Origin");
        interfaceC19907d.mo82804c(101);
        interfaceC19907d.getHeaders().m82638f("Upgrade", "WebSocket");
        interfaceC19907d.getHeaders().m82638f("Connection", "Upgrade");
        interfaceC19907d.getHeaders().m82638f("Sec-WebSocket-Accept", strM82715w);
        String strM82635c = interfaceC19905b.getHeaders().m82635c("Sec-WebSocket-Protocol");
        if (!TextUtils.isEmpty(strM82635c)) {
            interfaceC19907d.getHeaders().m82638f("Sec-WebSocket-Protocol", strM82635c);
        }
        interfaceC19907d.mo82806u();
        m82705N(false, false);
    }

    public C19887f0(InterfaceC19931j interfaceC19931j) {
        this.f63361b = interfaceC19931j;
        this.f63362c = new C19935n(interfaceC19931j);
    }

    /* JADX INFO: renamed from: E */
    public static void m82700E(C19892j c19892j, String... strArr) {
        Headers headersM82739h = c19892j.m82739h();
        String strEncodeToString = Base64.encodeToString(m82706O(UUID.randomUUID()), 2);
        headersM82739h.m82638f("Sec-WebSocket-Version", PrepareException.ERROR_WARMUP_DOWNLOAD_EXCEPTION);
        headersM82739h.m82638f("Sec-WebSocket-Key", strEncodeToString);
        headersM82739h.m82638f("Sec-WebSocket-Extensions", "x-webkit-deflate-frame");
        headersM82739h.m82638f("Connection", "Upgrade");
        headersM82739h.m82638f("Upgrade", "websocket");
        if (strArr != null) {
            for (String str : strArr) {
                headersM82739h.m82633a("Sec-WebSocket-Protocol", str);
            }
        }
        headersM82739h.m82638f("Pragma", "no-cache");
        headersM82739h.m82638f(HttpHeaders.CACHE_CONTROL, "no-cache");
        if (TextUtils.isEmpty(c19892j.m82739h().m82635c("User-Agent"))) {
            c19892j.m82739h().m82638f("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/27.0.1453.15 Safari/537.36");
        }
    }

    /* JADX INFO: renamed from: F */
    public static InterfaceC19875b0 m82701F(Headers headers, InterfaceC19893k interfaceC19893k) {
        String strM82635c;
        String strM82635c2;
        if (interfaceC19893k == null || interfaceC19893k.mo82722b() != 101 || !"websocket".equalsIgnoreCase(interfaceC19893k.mo82724e().m82635c("Upgrade")) || (strM82635c = interfaceC19893k.mo82724e().m82635c("Sec-WebSocket-Accept")) == null || (strM82635c2 = headers.m82635c("Sec-WebSocket-Key")) == null) {
            return null;
        }
        if (!strM82635c.equalsIgnoreCase(m82715w(strM82635c2 + WebSocketProtocol.ACCEPT_MAGIC).trim())) {
            return null;
        }
        String strM82635c3 = headers.m82635c("Sec-WebSocket-Extensions");
        boolean z11 = strM82635c3 != null && strM82635c3.equals("x-webkit-deflate-frame");
        C19887f0 c19887f0 = new C19887f0(interfaceC19893k.mo82628z());
        c19887f0.f63363d = interfaceC19893k.mo82724e().m82635c("Sec-WebSocket-Protocol");
        c19887f0.m82705N(true, z11);
        return c19887f0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m82702H(String str) {
        this.f63362c.mo82419m(new ByteBufferList(ByteBuffer.wrap(this.f63364e.m82677G(str))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m82703K(byte[] bArr) {
        this.f63362c.mo82419m(new ByteBufferList(this.f63364e.m82683t(bArr)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m82704L(String str) {
        this.f63362c.mo82419m(new ByteBufferList(this.f63364e.m82682s(str)));
    }

    /* JADX INFO: renamed from: N */
    private void m82705N(boolean z11, boolean z12) {
        a aVar = new a(this.f63361b);
        this.f63364e = aVar;
        aVar.m82681L(z11);
        this.f63364e.m82680K(z12);
        if (this.f63361b.isPaused()) {
            this.f63361b.resume();
        }
    }

    /* JADX INFO: renamed from: O */
    private static byte[] m82706O(UUID uuid) {
        byte[] bArr = new byte[16];
        ByteBuffer.wrap(bArr).asLongBuffer().put(new long[]{uuid.getMostSignificantBits(), uuid.getLeastSignificantBits()});
        return bArr;
    }

    /* JADX INFO: renamed from: l */
    static /* bridge */ /* synthetic */ InterfaceC19875b0.a m82710l(C19887f0 c19887f0) {
        c19887f0.getClass();
        return null;
    }

    /* JADX INFO: renamed from: w */
    private static String m82715w(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(EncoderUtil.ALGORITHM_SHA_1);
            messageDigest.update(str.getBytes("iso-8859-1"), 0, str.length());
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m82716y(ByteBufferList byteBufferList) {
        if (this.f63360a == null) {
            C19809a0.m82520a(this, byteBufferList);
            if (byteBufferList.m82494C() > 0) {
                LinkedList linkedList = new LinkedList();
                this.f63360a = linkedList;
                linkedList.add(byteBufferList);
                return;
            }
            return;
        }
        while (!isPaused()) {
            ByteBufferList byteBufferList2 = (ByteBufferList) this.f63360a.remove();
            C19809a0.m82520a(this, byteBufferList2);
            if (byteBufferList2.m82494C() > 0) {
                this.f63360a.add(0, byteBufferList2);
            }
        }
        if (this.f63360a.size() == 0) {
            this.f63360a = null;
        }
    }

    @Override // com.transsion.transfer.androidasync.http.InterfaceC19875b0
    /* JADX INFO: renamed from: A */
    public void mo82695A(final String str) {
        mo82413a().m82472D(new Runnable() { // from class: com.transsion.transfer.androidasync.http.c0
            @Override // java.lang.Runnable
            public final void run() {
                this.f63344a.m82702H(str);
            }
        });
    }

    @Override // com.transsion.transfer.androidasync.http.InterfaceC19875b0
    /* JADX INFO: renamed from: G */
    public void mo82696G(InterfaceC19875b0.b bVar) {
        this.f63368i = bVar;
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    /* JADX INFO: renamed from: I */
    public InterfaceC23680d mo82412I() {
        return this.f63367h;
    }

    @Override // com.transsion.transfer.androidasync.http.InterfaceC19875b0
    /* JADX INFO: renamed from: J */
    public void mo82697J(InterfaceC19875b0.c cVar) {
        this.f63366g = cVar;
    }

    /* JADX INFO: renamed from: M */
    public void m82717M(final byte[] bArr) {
        mo82413a().m82472D(new Runnable() { // from class: com.transsion.transfer.androidasync.http.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f63351a.m82703K(bArr);
            }
        });
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19931j, com.transsion.transfer.androidasync.InterfaceC19937p, com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: a */
    public AsyncServer mo82413a() {
        return this.f63361b.mo82413a();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    public void close() {
        this.f63361b.close();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: d */
    public void mo82414d() {
        this.f63361b.mo82414d();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: i */
    public void mo82416i(InterfaceC23686j interfaceC23686j) {
        this.f63362c.mo82416i(interfaceC23686j);
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    public boolean isOpen() {
        return this.f63361b.isOpen();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    public boolean isPaused() {
        return this.f63361b.isPaused();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: j */
    public InterfaceC23686j mo82417j() {
        return this.f63362c.mo82417j();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: m */
    public void mo82419m(ByteBufferList byteBufferList) {
        m82717M(byteBufferList.m82508l());
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    public void pause() {
        this.f63361b.pause();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: q */
    public void mo82422q(InterfaceC23677a interfaceC23677a) {
        this.f63361b.mo82422q(interfaceC23677a);
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    public void resume() {
        this.f63361b.resume();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    /* JADX INFO: renamed from: s */
    public String mo82424s() {
        return null;
    }

    @Override // com.transsion.transfer.androidasync.http.InterfaceC19875b0
    public void send(final String str) {
        mo82413a().m82472D(new Runnable() { // from class: com.transsion.transfer.androidasync.http.e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f63358a.m82704L(str);
            }
        });
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    /* JADX INFO: renamed from: v */
    public void mo82426v(InterfaceC23680d interfaceC23680d) {
        this.f63367h = interfaceC23680d;
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    /* JADX INFO: renamed from: x */
    public void mo82428x(InterfaceC23677a interfaceC23677a) {
        this.f63365f = interfaceC23677a;
    }
}
