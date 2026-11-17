package com.transsion.player.orplayer;

import com.aliyun.loader.MediaLoader;
import com.aliyun.player.AliPlayerGlobalSettings;
import com.blankj.utilcode.util.Utils;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import ro.C27311e;

/* JADX INFO: loaded from: classes6.dex */
public final class ORPlayerPreloadManager implements MediaLoader.OnLoadStatusListener {

    /* JADX INFO: renamed from: i */
    public static final C16626a f55908i = new C16626a(null);

    /* JADX INFO: renamed from: j */
    private static final Lazy f55909j = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.orplayer.y
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ORPlayerPreloadManager.m72393d();
        }
    });

    /* JADX INFO: renamed from: a */
    private final String f55910a = "ORPlayerPreload";

    /* JADX INFO: renamed from: b */
    private final long f55911b = 4000;

    /* JADX INFO: renamed from: c */
    private long f55912c = 4000;

    /* JADX INFO: renamed from: d */
    private String f55913d = "";

    /* JADX INFO: renamed from: e */
    private final CopyOnWriteArrayList f55914e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f */
    private final CopyOnWriteArrayList f55915f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g */
    private final CopyOnWriteArrayList f55916g = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: h */
    private long f55917h;

    /* JADX INFO: renamed from: com.transsion.player.orplayer.ORPlayerPreloadManager$a */
    public static final class C16626a {
        private C16626a() {
        }

        public /* synthetic */ C16626a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ORPlayerPreloadManager m72403a() {
            return (ORPlayerPreloadManager) ORPlayerPreloadManager.f55909j.getValue();
        }
    }

    public ORPlayerPreloadManager() {
        MediaLoader.getInstance().setOnLoadStatusListener(this);
        File externalCacheDir = Utils.m27275a().getExternalCacheDir();
        String absolutePath = externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null;
        String str = absolutePath + File.separator + "video_cache";
        try {
            Result.Companion companion = Result.INSTANCE;
            AliPlayerGlobalSettings.enableLocalCache(true, 0, str);
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final ORPlayerPreloadManager m72393d() {
        return new ORPlayerPreloadManager();
    }

    /* JADX INFO: renamed from: l */
    private final void m72394l(String str) {
        this.f55917h = System.currentTimeMillis();
        C27311e.m106397b(C27311e.f83046a, this.f55910a, "startPreload, url = " + str, false, 4, null);
        MediaLoader.getInstance().load(str, this.f55912c);
    }

    /* JADX INFO: renamed from: c */
    public final void m72395c() {
        C27311e.m106397b(C27311e.f83046a, this.f55910a, "cancelAll", false, 4, null);
        this.f55913d = "";
        this.f55916g.clear();
        this.f55914e.clear();
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new ORPlayerPreloadManager$cancelAll$1(null), 3, null);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m72396e(String url) {
        Intrinsics.m97802h(url, "url");
        return this.f55915f.contains(url);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m72397f(String url) {
        Intrinsics.m97802h(url, "url");
        return (this.f55913d.length() > 0 && Intrinsics.m97797c(url, this.f55913d)) || this.f55916g.contains(url);
    }

    /* JADX INFO: renamed from: g */
    public final void m72398g(String url) {
        Intrinsics.m97802h(url, "url");
        if (!m72397f(url)) {
            C27311e.m106397b(C27311e.f83046a, this.f55910a, "pause, but not contains, PausedContains =  " + this.f55914e.contains(url) + ", url = " + url, false, 4, null);
            return;
        }
        C27311e.m106397b(C27311e.f83046a, this.f55910a, "pause, url = " + url, false, 4, null);
        this.f55914e.add(url);
        if (!Intrinsics.m97797c(this.f55913d, url)) {
            if (this.f55916g.contains(url)) {
                this.f55916g.remove(url);
                return;
            }
            return;
        }
        this.f55913d = "";
        MediaLoader.getInstance().pause(url);
        if (this.f55916g.isEmpty()) {
            return;
        }
        Object objI0 = CollectionsKt.m97359i0(this.f55916g);
        Intrinsics.m97801g(objI0, "first(...)");
        String str = (String) objI0;
        this.f55913d = str;
        m72394l(str);
        this.f55916g.remove(this.f55913d);
    }

    /* JADX INFO: renamed from: h */
    public final void m72399h() {
        C27311e.m106397b(C27311e.f83046a, this.f55910a, "pauseAll, paused size = " + this.f55914e.size() + ", urlsCache size = " + this.f55916g.size() + ", curUrl = " + this.f55913d + " ", false, 4, null);
        if (this.f55913d.length() > 0) {
            MediaLoader.getInstance().pause(this.f55913d);
            this.f55914e.add(this.f55913d);
            this.f55913d = "";
        }
        if (this.f55916g.isEmpty()) {
            return;
        }
        this.f55914e.addAll(this.f55916g);
        this.f55916g.clear();
    }

    /* JADX INFO: renamed from: i */
    public final void m72400i(String url) {
        Intrinsics.m97802h(url, "url");
        m72401j(url, this.f55911b);
    }

    /* JADX INFO: renamed from: j */
    public final void m72401j(String url, long j11) {
        Intrinsics.m97802h(url, "url");
        if (j11 > 0) {
            this.f55912c = j11;
        }
        if (m72397f(url)) {
            C27311e.m106397b(C27311e.f83046a, this.f55910a, "start preload, contains return~ url = " + url, false, 4, null);
            return;
        }
        if (this.f55914e.contains(url)) {
            C27311e.m106397b(C27311e.f83046a, this.f55910a, "start preload, pause contains resume~ url = " + url, false, 4, null);
            if (this.f55913d.length() > 0) {
                this.f55916g.add(url);
            } else {
                this.f55913d = url;
                MediaLoader.getInstance().resume(url);
            }
            this.f55914e.remove(url);
            return;
        }
        if (this.f55915f.contains(url)) {
            C27311e.m106397b(C27311e.f83046a, this.f55910a, "is preloaded, return, url = " + url, false, 4, null);
            return;
        }
        if (this.f55913d.length() <= 0) {
            this.f55913d = url;
            m72394l(url);
            return;
        }
        if (System.currentTimeMillis() - this.f55917h <= 5000) {
            C27311e.m106397b(C27311e.f83046a, this.f55910a, "start preload, add to cache, url = " + url, false, 4, null);
            this.f55916g.add(url);
            return;
        }
        C27311e.m106400i(C27311e.f83046a, this.f55910a, "last is more than 5 sec, preload new url", false, 4, null);
        if (this.f55916g.isEmpty()) {
            this.f55913d = url;
            m72394l(url);
            return;
        }
        Object objI0 = CollectionsKt.m97359i0(this.f55916g);
        Intrinsics.m97801g(objI0, "first(...)");
        String str = (String) objI0;
        this.f55913d = str;
        m72394l(str);
        this.f55916g.remove(this.f55913d);
        this.f55916g.add(url);
    }

    /* JADX INFO: renamed from: k */
    public final void m72402k() {
        C27311e.m106397b(C27311e.f83046a, this.f55910a, "resumeAll, paused size = " + this.f55914e.size() + ", urlsCache size = " + this.f55916g.size() + ", curUrl = " + this.f55913d + " ", false, 4, null);
        if (this.f55913d.length() > 0) {
            return;
        }
        if (!this.f55914e.isEmpty()) {
            Iterator it = this.f55914e.iterator();
            Intrinsics.m97801g(it, "iterator(...)");
            while (it.hasNext()) {
                String str = (String) it.next();
                if (this.f55913d.length() > 0) {
                    this.f55916g.add(str);
                } else {
                    Intrinsics.m97799e(str);
                    this.f55913d = str;
                    MediaLoader.getInstance().resume(str);
                }
            }
        }
        this.f55914e.clear();
    }

    @Override // com.aliyun.loader.MediaLoader.OnLoadStatusListener
    public void onCanceled(String str) {
    }

    @Override // com.aliyun.loader.MediaLoader.OnLoadStatusListener
    public void onCompleted(String str) {
        C27311e.m106400i(C27311e.f83046a, this.f55910a, "preload complete, url = " + str, false, 4, null);
        this.f55914e.remove(str);
        if (this.f55916g.isEmpty()) {
            this.f55913d = "";
        } else {
            Object objI0 = CollectionsKt.m97359i0(this.f55916g);
            Intrinsics.m97801g(objI0, "first(...)");
            String str2 = (String) objI0;
            this.f55913d = str2;
            m72394l(str2);
            this.f55916g.remove(this.f55913d);
        }
        if (str != null) {
            this.f55915f.add(str);
        }
    }

    @Override // com.aliyun.loader.MediaLoader.OnLoadStatusListener
    public void onError(String str, int i11, String str2) {
        C27311e.m106397b(C27311e.f83046a, this.f55910a, "preload error, " + (i11 == -300 ? "is preloaded code" : "errorCode") + " = " + i11 + ", errorMsg= " + str2 + ", url = " + str, false, 4, null);
        if (!this.f55916g.isEmpty()) {
            Object objI0 = CollectionsKt.m97359i0(this.f55916g);
            Intrinsics.m97801g(objI0, "first(...)");
            String str3 = (String) objI0;
            this.f55913d = str3;
            m72394l(str3);
            this.f55916g.remove(this.f55913d);
        }
        this.f55914e.remove(str);
        if (i11 == -300) {
            this.f55915f.add(str);
        }
    }
}
