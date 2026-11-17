package com.transsion.player.shorttv.preload;

import android.content.Context;
import android.util.Log;
import androidx.media3.exoplayer.offline.C3790c;
import androidx.media3.exoplayer.offline.DownloadManager;
import androidx.media3.exoplayer.scheduler.Requirements;
import fo.C23403e;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p464ho.AbstractC23874a;

/* JADX INFO: renamed from: com.transsion.player.shorttv.preload.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C16660g {

    /* JADX INFO: renamed from: g */
    public static final a f56016g = new a(null);

    /* JADX INFO: renamed from: a */
    private final Context f56017a;

    /* JADX INFO: renamed from: b */
    private final List f56018b;

    /* JADX INFO: renamed from: c */
    private int f56019c;

    /* JADX INFO: renamed from: d */
    private String f56020d;

    /* JADX INFO: renamed from: e */
    private final b f56021e;

    /* JADX INFO: renamed from: f */
    private final ConcurrentHashMap f56022f;

    /* JADX INFO: renamed from: com.transsion.player.shorttv.preload.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.shorttv.preload.g$b */
    public static final class b implements DownloadManager.InterfaceC3777d {
        b() {
        }

        @Override // androidx.media3.exoplayer.offline.DownloadManager.InterfaceC3777d
        /* JADX INFO: renamed from: a */
        public void mo18322a(DownloadManager downloadManager, boolean z11) {
            Intrinsics.m97802h(downloadManager, "downloadManager");
        }

        @Override // androidx.media3.exoplayer.offline.DownloadManager.InterfaceC3777d
        /* JADX INFO: renamed from: b */
        public void mo18323b(DownloadManager downloadManager, C3790c download) {
            Intrinsics.m97802h(downloadManager, "downloadManager");
            Intrinsics.m97802h(download, "download");
        }

        @Override // androidx.media3.exoplayer.offline.DownloadManager.InterfaceC3777d
        /* JADX INFO: renamed from: c */
        public void mo18324c(DownloadManager downloadManager, boolean z11) {
            Intrinsics.m97802h(downloadManager, "downloadManager");
        }

        @Override // androidx.media3.exoplayer.offline.DownloadManager.InterfaceC3777d
        /* JADX INFO: renamed from: d */
        public void mo18325d(DownloadManager downloadManager) {
            Intrinsics.m97802h(downloadManager, "downloadManager");
            Log.e("VideoPreloadHelper", "onIdle:");
            C16660g.this.m72564m();
        }

        @Override // androidx.media3.exoplayer.offline.DownloadManager.InterfaceC3777d
        /* JADX INFO: renamed from: e */
        public void mo18326e(DownloadManager downloadManager, Requirements requirements, int i11) {
            Intrinsics.m97802h(downloadManager, "downloadManager");
            Intrinsics.m97802h(requirements, "requirements");
        }

        @Override // androidx.media3.exoplayer.offline.DownloadManager.InterfaceC3777d
        /* JADX INFO: renamed from: f */
        public void mo18327f(DownloadManager downloadManager, C3790c download, Exception exc) {
            Intrinsics.m97802h(downloadManager, "downloadManager");
            Intrinsics.m97802h(download, "download");
            Log.e("VideoPreloadHelper", "onDownloadChanged:  download.requestId:" + download.f13171a.f13101id + "     bytesDownloaded:" + download.m18422a() + "  contentLength:" + download.f13175e + "  percentDownloaded:" + download.m18423b());
            C16654a c16654a = (C16654a) C16660g.this.f56022f.get(download.f13171a.f13101id);
            if (c16654a != null) {
                c16654a.m72547h(download.m18422a());
                c16654a.m72546g(download.f13175e);
            }
            if (Intrinsics.m97797c(download.f13171a.f13101id, C16660g.this.f56020d)) {
                int i11 = download.f13172b;
                if (i11 == 1 || i11 == 3 || i11 == 4) {
                    C16660g.this.f56020d = null;
                    C16660g.this.m72564m();
                }
            }
        }

        @Override // androidx.media3.exoplayer.offline.DownloadManager.InterfaceC3777d
        /* JADX INFO: renamed from: g */
        public void mo18328g(DownloadManager downloadManager) {
            Intrinsics.m97802h(downloadManager, "downloadManager");
        }
    }

    public C16660g(Context context) {
        Intrinsics.m97802h(context, "context");
        this.f56017a = context;
        this.f56018b = new CopyOnWriteArrayList();
        b bVar = new b();
        this.f56021e = bVar;
        this.f56022f = new ConcurrentHashMap();
        AbstractC23874a.m94501h(context).m18278d(bVar);
    }

    /* JADX INFO: renamed from: i */
    private final void m72556i(int i11) {
        C23403e c23403e;
        if (i11 < 0 || i11 >= this.f56018b.size() || (c23403e = (C23403e) this.f56018b.get(i11)) == null) {
            return;
        }
        Log.e("VideoPreloadHelper", "checkToPause   position:" + i11 + "  shortTVItem:" + c23403e);
        C16670q.f56031a.m72593D(c23403e.m92931g());
    }

    /* JADX INFO: renamed from: j */
    private final void m72557j(int i11) {
        final C23403e c23403e;
        if (i11 < 0 || i11 >= this.f56018b.size() || (c23403e = (C23403e) this.f56018b.get(i11)) == null) {
            return;
        }
        C16670q.f56031a.m72600z(new Runnable() { // from class: com.transsion.player.shorttv.preload.f
            @Override // java.lang.Runnable
            public final void run() {
                C16660g.m72558k(c23403e, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m72558k(C23403e c23403e, C16660g c16660g) {
        c16660g.f56022f.put(c23403e.m92931g(), C16670q.f56031a.m72598w(c23403e));
    }

    /* JADX INFO: renamed from: l */
    private final C16654a m72559l(int i11, C23403e c23403e) {
        C16654a c16654a = (C16654a) this.f56022f.get(c23403e.m92931g());
        if (c16654a != null) {
            Log.e("VideoPreloadHelper", "createDownloadRequest [from map] position:" + i11 + "  shortTVItem:" + c23403e);
            return c16654a;
        }
        String strM92931g = c23403e.m92931g();
        C16654a c16654aM72595n = C16670q.f56031a.m72595n(c23403e);
        this.f56022f.put(strM92931g, c16654aM72595n);
        Log.e("VideoPreloadHelper", "createDownloadRequest [from new] position:" + i11 + "  shortTVItem:" + c23403e);
        return c16654aM72595n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m72560n(C16660g c16660g, int i11) {
        int size = c16660g.f56018b.size();
        Log.e("VideoPreloadHelper", "loadNext， position:" + i11 + "   size:" + size);
        int iH = RangesKt.m97938h(i11 + 6, size);
        for (int i12 = i11 + 1; i12 < iH; i12++) {
            C23403e c23403e = (C23403e) c16660g.f56018b.get(i12);
            if (c23403e != null) {
                C16654a c16654aM72559l = c16660g.m72559l(i12, c23403e);
                c16654aM72559l.m72548i(307200L);
                if (c16654aM72559l.m72541b() < c16654aM72559l.m72543d()) {
                    Log.e("VideoPreloadHelper", "非当前选中  下载大小 downloadLength:" + c16654aM72559l.m72541b() + "  index:" + i12);
                    c16660g.f56020d = c16654aM72559l.m72542c();
                    C16670q.f56031a.m72596s(c16654aM72559l);
                    return;
                }
                c16654aM72559l.m72541b();
                c16654aM72559l.m72540a();
                Log.e("VideoPreloadHelper", "非当前选中  下载大小 downloadLength:" + c16654aM72559l.m72541b() + " 大于最小下载，跳过 index:" + i12);
            }
        }
        Log.e("VideoPreloadHelper", "不用全量下载");
    }

    /* JADX INFO: renamed from: f */
    public final void m72561f(int i11, C23403e mediaSource) {
        Intrinsics.m97802h(mediaSource, "mediaSource");
        if (i11 <= this.f56018b.size()) {
            this.f56018b.add(i11, mediaSource);
        }
        m72564m();
    }

    /* JADX INFO: renamed from: g */
    public final void m72562g(C23403e mediaSource) {
        Intrinsics.m97802h(mediaSource, "mediaSource");
        this.f56018b.add(mediaSource);
        m72564m();
    }

    /* JADX INFO: renamed from: h */
    public final void m72563h(int i11) {
        Log.e("VideoPreloadHelper", "changeSelect  position:" + i11);
        if (this.f56019c == i11) {
            return;
        }
        this.f56020d = null;
        this.f56019c = i11;
        m72556i(i11);
        m72557j(this.f56019c + 1);
    }

    /* JADX INFO: renamed from: m */
    public final void m72564m() {
        final int i11 = this.f56019c;
        if (i11 >= 0 && this.f56020d == null) {
            C16670q.f56031a.m72600z(new Runnable() { // from class: com.transsion.player.shorttv.preload.e
                @Override // java.lang.Runnable
                public final void run() {
                    C16660g.m72560n(this.f56012a, i11);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m72565o() {
        m72556i(this.f56019c);
        this.f56019c = -1;
    }

    /* JADX INFO: renamed from: p */
    public final void m72566p() {
        AbstractC23874a.m94501h(this.f56017a).m18290w(this.f56021e);
        m72565o();
    }

    /* JADX INFO: renamed from: q */
    public final void m72567q(String key) {
        Intrinsics.m97802h(key, "key");
        this.f56022f.remove(key);
        C16670q.f56031a.m72599x(key);
    }
}
