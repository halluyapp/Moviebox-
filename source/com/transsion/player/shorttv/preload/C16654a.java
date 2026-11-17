package com.transsion.player.shorttv.preload;

import androidx.collection.AbstractC0585s;
import androidx.compose.foundation.AbstractC0690e;
import androidx.media3.exoplayer.offline.DownloadRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.player.shorttv.preload.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C16654a {

    /* JADX INFO: renamed from: a */
    private final String f56001a;

    /* JADX INFO: renamed from: b */
    private final String f56002b;

    /* JADX INFO: renamed from: c */
    private final DownloadRequest f56003c;

    /* JADX INFO: renamed from: d */
    private long f56004d;

    /* JADX INFO: renamed from: e */
    private long f56005e;

    /* JADX INFO: renamed from: f */
    private long f56006f;

    /* JADX INFO: renamed from: g */
    private final boolean f56007g;

    public C16654a(String id2, String url, DownloadRequest request, long j11, long j12, long j13, boolean z11) {
        Intrinsics.m97802h(id2, "id");
        Intrinsics.m97802h(url, "url");
        Intrinsics.m97802h(request, "request");
        this.f56001a = id2;
        this.f56002b = url;
        this.f56003c = request;
        this.f56004d = j11;
        this.f56005e = j12;
        this.f56006f = j13;
        this.f56007g = z11;
    }

    /* JADX INFO: renamed from: a */
    public final long m72540a() {
        return this.f56004d;
    }

    /* JADX INFO: renamed from: b */
    public final long m72541b() {
        return this.f56005e;
    }

    /* JADX INFO: renamed from: c */
    public final String m72542c() {
        return this.f56001a;
    }

    /* JADX INFO: renamed from: d */
    public final long m72543d() {
        return this.f56006f;
    }

    /* JADX INFO: renamed from: e */
    public final DownloadRequest m72544e() {
        return this.f56003c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16654a)) {
            return false;
        }
        C16654a c16654a = (C16654a) obj;
        return Intrinsics.m97797c(this.f56001a, c16654a.f56001a) && Intrinsics.m97797c(this.f56002b, c16654a.f56002b) && Intrinsics.m97797c(this.f56003c, c16654a.f56003c) && this.f56004d == c16654a.f56004d && this.f56005e == c16654a.f56005e && this.f56006f == c16654a.f56006f && this.f56007g == c16654a.f56007g;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m72545f() {
        return this.f56007g;
    }

    /* JADX INFO: renamed from: g */
    public final void m72546g(long j11) {
        this.f56004d = j11;
    }

    /* JADX INFO: renamed from: h */
    public final void m72547h(long j11) {
        this.f56005e = j11;
    }

    public int hashCode() {
        return (((((((((((this.f56001a.hashCode() * 31) + this.f56002b.hashCode()) * 31) + this.f56003c.hashCode()) * 31) + AbstractC0585s.m2633a(this.f56004d)) * 31) + AbstractC0585s.m2633a(this.f56005e)) * 31) + AbstractC0585s.m2633a(this.f56006f)) * 31) + AbstractC0690e.m3114a(this.f56007g);
    }

    /* JADX INFO: renamed from: i */
    public final void m72548i(long j11) {
        this.f56006f = j11;
    }

    public String toString() {
        return "VideoDownloadBean(id=" + this.f56001a + ", url=" + this.f56002b + ", request=" + this.f56003c + ", contentLength=" + this.f56004d + ", downloadLength=" + this.f56005e + ", maxLength=" + this.f56006f + ", isAdd=" + this.f56007g + ")";
    }
}
