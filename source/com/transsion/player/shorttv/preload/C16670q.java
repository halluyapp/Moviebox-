package com.transsion.player.shorttv.preload;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.media3.exoplayer.offline.C3790c;
import androidx.media3.exoplayer.offline.DownloadManager;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.exoplayer.scheduler.Requirements;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.kernel.utils.UrlUtils;
import com.transsion.player.exo.DemoDownloadService;
import fo.C23403e;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p464ho.AbstractC23874a;
import ro.C27310d;
import ro.C27311e;

/* JADX INFO: renamed from: com.transsion.player.shorttv.preload.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C16670q {

    /* JADX INFO: renamed from: a */
    public static final C16670q f56031a;

    /* JADX INFO: renamed from: b */
    private static final ConcurrentHashMap f56032b;

    /* JADX INFO: renamed from: c */
    private static final Lazy f56033c;

    /* JADX INFO: renamed from: d */
    private static final HandlerThread f56034d;

    /* JADX INFO: renamed from: e */
    private static final Handler f56035e;

    /* JADX INFO: renamed from: f */
    private static final long f56036f;

    /* JADX INFO: renamed from: g */
    private static final Function0 f56037g;

    /* JADX INFO: renamed from: h */
    private static final b f56038h;

    /* JADX INFO: renamed from: i */
    private static boolean f56039i;

    /* JADX INFO: renamed from: com.transsion.player.shorttv.preload.q$a */
    public static final class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message msg) {
            Intrinsics.m97802h(msg, "msg");
            try {
                super.dispatchMessage(msg);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.shorttv.preload.q$b */
    public static final class b implements DownloadManager.InterfaceC3777d {
        b() {
        }

        @Override // androidx.media3.exoplayer.offline.DownloadManager.InterfaceC3777d
        /* JADX INFO: renamed from: a */
        public void mo18322a(DownloadManager downloadManager, boolean z11) {
            Intrinsics.m97802h(downloadManager, "downloadManager");
            Log.e("VideoPreloadUtil", "onWaitingForRequirementsChanged:");
        }

        @Override // androidx.media3.exoplayer.offline.DownloadManager.InterfaceC3777d
        /* JADX INFO: renamed from: b */
        public void mo18323b(DownloadManager downloadManager, C3790c download) {
            Intrinsics.m97802h(downloadManager, "downloadManager");
            Intrinsics.m97802h(download, "download");
            Log.e("VideoPreloadUtil", "onDownloadRemoved:");
        }

        @Override // androidx.media3.exoplayer.offline.DownloadManager.InterfaceC3777d
        /* JADX INFO: renamed from: c */
        public void mo18324c(DownloadManager downloadManager, boolean z11) {
            Intrinsics.m97802h(downloadManager, "downloadManager");
            Log.e("VideoPreloadUtil", "onDownloadsPausedChanged:");
        }

        @Override // androidx.media3.exoplayer.offline.DownloadManager.InterfaceC3777d
        /* JADX INFO: renamed from: d */
        public void mo18325d(DownloadManager downloadManager) {
            Intrinsics.m97802h(downloadManager, "downloadManager");
            Log.e("VideoPreloadUtil", "onIdle:");
            C16670q.f56031a.m72569B();
        }

        @Override // androidx.media3.exoplayer.offline.DownloadManager.InterfaceC3777d
        /* JADX INFO: renamed from: e */
        public void mo18326e(DownloadManager downloadManager, Requirements requirements, int i11) {
            Intrinsics.m97802h(downloadManager, "downloadManager");
            Intrinsics.m97802h(requirements, "requirements");
            Log.e("VideoPreloadUtil", "onRequirementsStateChanged:");
        }

        @Override // androidx.media3.exoplayer.offline.DownloadManager.InterfaceC3777d
        /* JADX INFO: renamed from: f */
        public void mo18327f(DownloadManager downloadManager, C3790c download, Exception exc) {
            Intrinsics.m97802h(downloadManager, "downloadManager");
            Intrinsics.m97802h(download, "download");
            Log.e("VideoPreloadUtil", "onDownloadChanged:  download.requestId:" + download.f13171a.f13101id + "     bytesDownloaded:" + download.m18422a() + "  contentLength:" + download.f13175e + "  percentDownloaded:" + download.m18423b());
            C16654a c16654a = (C16654a) C16670q.f56032b.get(download.f13171a.f13101id);
            if (c16654a != null) {
                c16654a.m72547h(download.m18422a());
                c16654a.m72546g(download.f13175e);
                int i11 = download.f13172b;
                if (i11 == 2) {
                    long jM72541b = c16654a.m72541b();
                    long jM72543d = c16654a.m72543d();
                    if (1 <= jM72543d && jM72543d < jM72541b) {
                        C16670q c16670q = C16670q.f56031a;
                        String id2 = c16654a.m72544e().f13101id;
                        Intrinsics.m97801g(id2, "id");
                        c16670q.m72593D(id2);
                    }
                } else if (i11 == 1 || i11 == 3) {
                    C16670q c16670q2 = C16670q.f56031a;
                    String id3 = c16654a.m72544e().f13101id;
                    Intrinsics.m97801g(id3, "id");
                    c16670q2.m72599x(id3);
                }
            }
            C16670q.f56031a.m72568A();
        }

        @Override // androidx.media3.exoplayer.offline.DownloadManager.InterfaceC3777d
        /* JADX INFO: renamed from: g */
        public void mo18328g(DownloadManager downloadManager) {
            Intrinsics.m97802h(downloadManager, "downloadManager");
        }
    }

    static {
        C16670q c16670q = new C16670q();
        f56031a = c16670q;
        f56032b = new ConcurrentHashMap();
        f56033c = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.shorttv.preload.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C16670q.m72585m();
            }
        });
        HandlerThread handlerThread = new HandlerThread("VideoPreloadUtil");
        f56034d = handlerThread;
        f56036f = 100L;
        f56037g = new Function0() { // from class: com.transsion.player.shorttv.preload.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C16670q.m72572F();
            }
        };
        b bVar = new b();
        f56038h = bVar;
        handlerThread.start();
        f56035e = new a(handlerThread.getLooper());
        AbstractC23874a.m94501h(c16670q.m72586o()).m18278d(bVar);
    }

    private C16670q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final void m72568A() {
        if (f56039i) {
            return;
        }
        f56039i = true;
        m72587p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final void m72569B() {
        f56039i = false;
        Handler handler = f56035e;
        final Function0 function0 = f56037g;
        handler.removeCallbacks(new Runnable() { // from class: com.transsion.player.shorttv.preload.k
            @Override // java.lang.Runnable
            public final void run() {
                C16670q.m72570C(function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m72570C(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m72571E(String str) {
        C27311e.m106398d(C27311e.f83046a, "VideoPreloadUtil", "stopPreload   key:" + str, false, 4, null);
        DownloadService.m18362z(f56031a.m72586o(), DemoDownloadService.class, str, 10086, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final Unit m72572F() {
        for (Object obj : AbstractC23874a.m94501h(f56031a.m72586o()).m18279e()) {
            Intrinsics.m97801g(obj, "next(...)");
            C3790c c3790c = (C3790c) obj;
            if (c3790c.f13172b == 2) {
                String str = c3790c.f13171a.f13101id;
                long jM18422a = c3790c.m18422a();
                long j11 = c3790c.f13175e;
                float fM18423b = c3790c.m18423b();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("progress 111:  download.requestId:");
                sb2.append(str);
                sb2.append("     bytesDownloaded:");
                sb2.append(jM18422a);
                sb2.append("  contentLength:");
                sb2.append(j11);
                sb2.append("  percentDownloaded:");
                sb2.append(fM18423b);
                C16654a c16654a = (C16654a) f56032b.get(c3790c.f13171a.f13101id);
                if (c16654a != null) {
                    c16654a.m72547h(c3790c.m18422a());
                    c16654a.m72546g(c3790c.f13175e);
                    long jM72541b = c16654a.m72541b();
                    long jM72543d = c16654a.m72543d();
                    if (1 <= jM72543d && jM72543d < jM72541b) {
                        C16670q c16670q = f56031a;
                        String id2 = c16654a.m72544e().f13101id;
                        Intrinsics.m97801g(id2, "id");
                        c16670q.m72599x(id2);
                    }
                }
            }
        }
        if (f56039i) {
            f56031a.m72587p();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final Application m72585m() {
        return Utils.m27275a();
    }

    /* JADX INFO: renamed from: o */
    private final Context m72586o() {
        Object value = f56033c.getValue();
        Intrinsics.m97801g(value, "getValue(...)");
        return (Context) value;
    }

    /* JADX INFO: renamed from: p */
    private final void m72587p() {
        Handler handler = f56035e;
        final Function0 function0 = f56037g;
        handler.removeCallbacks(new Runnable() { // from class: com.transsion.player.shorttv.preload.n
            @Override // java.lang.Runnable
            public final void run() {
                C16670q.m72588q(function0);
            }
        });
        handler.postDelayed(new Runnable() { // from class: com.transsion.player.shorttv.preload.o
            @Override // java.lang.Runnable
            public final void run() {
                C16670q.m72589r(function0);
            }
        }, f56036f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m72588q(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final void m72589r(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m72590u(C23403e c23403e) {
        C16670q c16670q = f56031a;
        c16670q.m72596s(c16670q.m72595n(c23403e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final void m72591v(C16654a c16654a) {
        Log.e("VideoPreloadUtil", "preloadVideo id:" + c16654a.m72542c() + " downloadLength:" + c16654a.m72541b() + "  maxLength:" + c16654a.m72543d() + " contentLength:" + c16654a.m72540a());
        if (c16654a.m72543d() == -1 || c16654a.m72541b() < c16654a.m72543d()) {
            if (c16654a.m72545f()) {
                DownloadService.m18362z(f56031a.m72586o(), DemoDownloadService.class, c16654a.m72542c(), 0, false);
                Log.e("VideoPreloadUtil", "checkToStart restart  shortTVItem:" + c16654a);
                return;
            }
            DownloadService.m18360x(f56031a.m72586o(), DemoDownloadService.class, c16654a.m72544e(), false);
            Log.e("VideoPreloadUtil", "checkToStart add    shortTVItem:" + c16654a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m72592y(String str) {
        C27311e.m106398d(C27311e.f83046a, "VideoPreloadUtil", "removePreload   key:" + str, false, 4, null);
        DownloadService.m18361y(f56031a.m72586o(), DemoDownloadService.class, str, false);
    }

    /* JADX INFO: renamed from: D */
    public final void m72593D(final String key) {
        Intrinsics.m97802h(key, "key");
        m72600z(new Runnable() { // from class: com.transsion.player.shorttv.preload.m
            @Override // java.lang.Runnable
            public final void run() {
                C16670q.m72571E(key);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final String m72594G(String str) {
        int iO0 = str != null ? StringsKt.m98156o0(str, UrlUtils.QUESTION_MARK, 0, false, 6, null) : -1;
        if (str != null && iO0 >= 0) {
            return C27310d.f83044a.m106396a((String) StringsKt.m98117S0(str, new String[]{UrlUtils.QUESTION_MARK}, false, 0, 6, null).get(0));
        }
        C27310d.a aVar = C27310d.f83044a;
        if (str == null) {
            str = "";
        }
        return aVar.m106396a(str);
    }

    /* JADX INFO: renamed from: n */
    public final C16654a m72595n(C23403e shortTVItem) {
        DownloadRequest downloadRequest;
        Intrinsics.m97802h(shortTVItem, "shortTVItem");
        ConcurrentHashMap concurrentHashMap = f56032b;
        C16654a c16654a = (C16654a) concurrentHashMap.get(shortTVItem.m92931g());
        if (c16654a != null) {
            C27311e.m106397b(C27311e.f83046a, "VideoPreloadUtil", "createDownloadRequest [from map]  shortTVItem:" + shortTVItem, false, 4, null);
            return c16654a;
        }
        C3790c c3790cMo18416h = AbstractC23874a.m94501h(Utils.m27275a()).m18280f().mo18416h(shortTVItem.m92931g());
        if (Intrinsics.m97797c((c3790cMo18416h == null || (downloadRequest = c3790cMo18416h.f13171a) == null) ? null : downloadRequest.f13101id, shortTVItem.m92931g())) {
            C27311e.m106397b(C27311e.f83046a, "VideoPreloadUtil", "createDownloadRequest [from currentDownloads]   shortTVItem:" + shortTVItem, false, 4, null);
            String strM92931g = shortTVItem.m92931g();
            String strM92935k = shortTVItem.m92935k();
            DownloadRequest request = c3790cMo18416h.f13171a;
            Intrinsics.m97801g(request, "request");
            return new C16654a(strM92931g, strM92935k, request, c3790cMo18416h.f13175e, c3790cMo18416h.m18422a(), 307200L, true);
        }
        String strM92931g2 = shortTVItem.m92931g();
        String strM92935k2 = shortTVItem.m92935k();
        DownloadRequest downloadRequestM18333a = new DownloadRequest.C3780b(strM92931g2, Uri.parse(strM92935k2)).m18334b(strM92931g2).m18333a();
        Intrinsics.m97801g(downloadRequestM18333a, "build(...)");
        C16654a c16654a2 = new C16654a(strM92931g2, strM92935k2, downloadRequestM18333a, -1L, 0L, 307200L, false);
        concurrentHashMap.put(strM92931g2, c16654a2);
        C27311e.m106397b(C27311e.f83046a, "VideoPreloadUtil", "createDownloadRequest [from new]  shortTVItem:" + shortTVItem, false, 4, null);
        return c16654a2;
    }

    /* JADX INFO: renamed from: s */
    public final C16654a m72596s(final C16654a shortTVDownloadBean) {
        Intrinsics.m97802h(shortTVDownloadBean, "shortTVDownloadBean");
        m72600z(new Runnable() { // from class: com.transsion.player.shorttv.preload.p
            @Override // java.lang.Runnable
            public final void run() {
                C16670q.m72591v(shortTVDownloadBean);
            }
        });
        return shortTVDownloadBean;
    }

    /* JADX INFO: renamed from: t */
    public final void m72597t(final C23403e shortTVItem) {
        Intrinsics.m97802h(shortTVItem, "shortTVItem");
        m72600z(new Runnable() { // from class: com.transsion.player.shorttv.preload.j
            @Override // java.lang.Runnable
            public final void run() {
                C16670q.m72590u(shortTVItem);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final C16654a m72598w(C23403e shortTVItem) {
        Intrinsics.m97802h(shortTVItem, "shortTVItem");
        C16654a c16654aM72595n = m72595n(shortTVItem);
        m72596s(c16654aM72595n);
        return c16654aM72595n;
    }

    /* JADX INFO: renamed from: x */
    public final void m72599x(final String key) {
        Intrinsics.m97802h(key, "key");
        f56032b.remove(key);
        m72600z(new Runnable() { // from class: com.transsion.player.shorttv.preload.l
            @Override // java.lang.Runnable
            public final void run() {
                C16670q.m72592y(key);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m72600z(Runnable runnable) {
        Intrinsics.m97802h(runnable, "runnable");
        f56035e.post(runnable);
    }
}
