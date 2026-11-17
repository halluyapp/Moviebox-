package com.transsion.shorttv.p315ui.widget;

import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.view.View;
import com.transsion.shorttv.utils.C19165h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p356ds.AbstractC23048b;
import p848vs.InterfaceC28213d;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.shorttv.ui.widget.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C19110c {

    /* JADX INFO: renamed from: f */
    public static final a f61485f = new a(null);

    /* JADX INFO: renamed from: a */
    private final View f61486a;

    /* JADX INFO: renamed from: b */
    private final b f61487b;

    /* JADX INFO: renamed from: c */
    private final Handler f61488c;

    /* JADX INFO: renamed from: d */
    private final Runnable f61489d;

    /* JADX INFO: renamed from: e */
    private final Runnable f61490e;

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.widget.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.widget.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        InterfaceC28213d mo80198a();

        /* JADX INFO: renamed from: b */
        String mo80199b();

        /* JADX INFO: renamed from: c */
        boolean mo80200c();

        /* JADX INFO: renamed from: d */
        void mo80201d();
    }

    public C19110c(View bubbleView, b conditionProvider) {
        Intrinsics.m97802h(bubbleView, "bubbleView");
        Intrinsics.m97802h(conditionProvider, "conditionProvider");
        this.f61486a = bubbleView;
        this.f61487b = conditionProvider;
        this.f61488c = new Handler(Looper.getMainLooper());
        this.f61489d = new Runnable() { // from class: com.transsion.shorttv.ui.widget.a
            @Override // java.lang.Runnable
            public final void run() {
                C19110c.m80210k(this.f61481a);
            }
        };
        this.f61490e = new Runnable() { // from class: com.transsion.shorttv.ui.widget.b
            @Override // java.lang.Runnable
            public final void run() {
                C19110c.m80208g(this.f61483a);
            }
        };
    }

    /* JADX INFO: renamed from: e */
    private final long m80207e() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } catch (Exception e11) {
            C26866a.a.m104901l(C26866a.f81698a, "DownloadGuideBubble", "getAvailableStorageBytes error: " + e11.getMessage(), false, 4, null);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final void m80208g(C19110c c19110c) {
        c19110c.m80214f();
    }

    /* JADX INFO: renamed from: j */
    private final void m80209j() {
        this.f61487b.mo80201d();
        C26866a.a.m104898f(C26866a.f81698a, "DownloadGuideBubble", "showBubble: UI restored, showing bubble", false, 4, null);
        AbstractC23048b.m91694e(this.f61486a);
        this.f61488c.removeCallbacks(this.f61490e);
        this.f61488c.postDelayed(this.f61490e, 6000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m80210k(C19110c c19110c) {
        c19110c.m80211l();
    }

    /* JADX INFO: renamed from: l */
    private final void m80211l() {
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "DownloadGuideBubble", "tryShowBubble: checking conditions...", false, 4, null);
        if (!this.f61487b.mo80200c()) {
            C26866a.a.m104898f(aVar, "DownloadGuideBubble", "tryShowBubble: SKIP - not buffering", false, 4, null);
            return;
        }
        C19165h c19165h = C19165h.f61575a;
        if (!c19165h.m80240c()) {
            C26866a.a.m104898f(aVar, "DownloadGuideBubble", "tryShowBubble: SKIP - fatigue control (shown within 3 days)", false, 4, null);
            return;
        }
        long jM80207e = m80207e();
        if (jM80207e < 524288000) {
            long j11 = 1024;
            C26866a.a.m104898f(aVar, "DownloadGuideBubble", "tryShowBubble: SKIP - storage insufficient (" + ((jM80207e / j11) / j11) + "MB < 500MB)", false, 4, null);
            return;
        }
        String strMo80199b = this.f61487b.mo80199b();
        InterfaceC28213d interfaceC28213dMo80198a = this.f61487b.mo80198a();
        if ((interfaceC28213dMo80198a != null ? interfaceC28213dMo80198a.mo73640f(strMo80199b) : null) == null) {
            C26866a.a.m104898f(aVar, "DownloadGuideBubble", "tryShowBubble: ALL conditions met, showing bubble!", false, 4, null);
            c19165h.m80243f();
            m80209j();
        } else {
            C26866a.a.m104898f(aVar, "DownloadGuideBubble", "tryShowBubble: SKIP - video already in download list (resourceId=" + strMo80199b + ")", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m80212c() {
        this.f61488c.removeCallbacksAndMessages(null);
        C26866a.a.m104898f(C26866a.f81698a, "DownloadGuideBubble", "destroy: all callbacks cleared", false, 4, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m80213d() {
        this.f61488c.removeCallbacks(this.f61489d);
        m80214f();
        C26866a.a.m104898f(C26866a.f81698a, "DownloadGuideBubble", "dismiss: timer cancelled + bubble hidden", false, 4, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m80214f() {
        this.f61488c.removeCallbacks(this.f61490e);
        if (this.f61486a.getVisibility() == 0) {
            C26866a.a.m104898f(C26866a.f81698a, "DownloadGuideBubble", "hide: bubble hidden", false, 4, null);
        }
        AbstractC23048b.m91691b(this.f61486a);
    }

    /* JADX INFO: renamed from: h */
    public final void m80215h() {
        this.f61488c.removeCallbacks(this.f61489d);
        C26866a.a.m104898f(C26866a.f81698a, "DownloadGuideBubble", "onBufferingEnd: timer cancelled", false, 4, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m80216i() {
        this.f61488c.removeCallbacks(this.f61489d);
        this.f61488c.postDelayed(this.f61489d, 5000L);
        C26866a.a.m104898f(C26866a.f81698a, "DownloadGuideBubble", "onBufferingStart: timer started (5000ms)", false, 4, null);
    }
}
