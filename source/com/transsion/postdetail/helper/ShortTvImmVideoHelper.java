package com.transsion.postdetail.helper;

import android.content.Context;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import androidx.asynclayoutinflater.view.AsyncLayoutInflater;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3187b0;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.moviedetailapi.bean.Video;
import com.transsion.player.orplayer.ORPlayerPreloadManager;
import com.transsion.postdetail.R$layout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTvImmVideoHelper {

    /* JADX INFO: renamed from: k */
    public static final C16767a f56366k = new C16767a(null);

    /* JADX INFO: renamed from: l */
    private static final Lazy f56367l = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.helper.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShortTvImmVideoHelper.m73036r();
        }
    });

    /* JADX INFO: renamed from: b */
    private int f56369b;

    /* JADX INFO: renamed from: e */
    private boolean f56372e;

    /* JADX INFO: renamed from: f */
    private boolean f56373f;

    /* JADX INFO: renamed from: i */
    private List f56376i;

    /* JADX INFO: renamed from: j */
    private boolean f56377j;

    /* JADX INFO: renamed from: a */
    private final List f56368a = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final Map f56370c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    private final Lazy f56371d = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.helper.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShortTvImmVideoHelper.m73025B();
        }
    });

    /* JADX INFO: renamed from: g */
    private List f56374g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private List f56375h = new ArrayList();

    /* JADX INFO: renamed from: com.transsion.postdetail.helper.ShortTvImmVideoHelper$a */
    public static final class C16767a {
        private C16767a() {
        }

        public /* synthetic */ C16767a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ShortTvImmVideoHelper m73053a() {
            return (ShortTvImmVideoHelper) ShortTvImmVideoHelper.f56367l.getValue();
        }
    }

    public ShortTvImmVideoHelper() {
        this.f56372e = true;
        this.f56373f = true;
        C14496b c14496b = C14496b.f50966a;
        this.f56372e = c14496b.m65344b().getBoolean("k_imm_video_guide", true);
        this.f56373f = c14496b.m65344b().getBoolean("k_short_tv_guide", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C3187b0 m73025B() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m73035q(FragmentActivity fragmentActivity, ShortTvImmVideoHelper shortTvImmVideoHelper) {
        View decorView;
        WindowInsets rootWindowInsets;
        if (fragmentActivity.isFinishing()) {
            return;
        }
        Window window = fragmentActivity.getWindow();
        Insets mandatorySystemGestureInsets = (window == null || (decorView = window.getDecorView()) == null || (rootWindowInsets = decorView.getRootWindowInsets()) == null) ? null : rootWindowInsets.getMandatorySystemGestureInsets();
        if (mandatorySystemGestureInsets == null || mandatorySystemGestureInsets.bottom > AbstractC5776a0.m27313a(40.0f)) {
            C26866a.a.m104898f(C26866a.f81698a, "ImmVideoHelper", "is open navigation bar 2", false, 4, null);
            return;
        }
        int i11 = mandatorySystemGestureInsets.bottom;
        shortTvImmVideoHelper.f56369b = i11;
        C26866a.a.m104898f(C26866a.f81698a, "ImmVideoHelper", "on get navigation gesture height = " + i11, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final ShortTvImmVideoHelper m73036r() {
        return new ShortTvImmVideoHelper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final void m73037u(Video video) {
        String url;
        if (video == null || (url = video.getUrl()) == null) {
            return;
        }
        ORPlayerPreloadManager.f55908i.m72403a().m72401j(url, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final void m73038w(ShortTvImmVideoHelper shortTvImmVideoHelper, View view, int i11, ViewGroup viewGroup) {
        Intrinsics.m97802h(view, "view");
        C26866a.a.m104898f(C26866a.f81698a, "ShortTvImmVideoPlayer", "for you preloadItemViews completion, " + view, false, 4, null);
        if (shortTvImmVideoHelper.f56377j) {
            return;
        }
        shortTvImmVideoHelper.f56374g.add(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m73039x(ShortTvImmVideoHelper shortTvImmVideoHelper, View view, int i11, ViewGroup viewGroup) {
        Intrinsics.m97802h(view, "view");
        C26866a.a.m104898f(C26866a.f81698a, "ShortTvImmVideoPlayer", "detail preloadItemViews completion, " + view, false, 4, null);
        if (shortTvImmVideoHelper.f56377j) {
            return;
        }
        shortTvImmVideoHelper.f56375h.add(view);
    }

    /* JADX INFO: renamed from: A */
    public final void m73040A() {
        C26866a.a.m104908v(C26866a.f81698a, "ImmVideoPlayer", "-- setVideoGuideShown", false, 4, null);
        this.f56372e = false;
        C14496b.f50966a.m65344b().putBoolean("k_imm_video_guide", false);
    }

    /* JADX INFO: renamed from: j */
    public final void m73041j() {
        this.f56368a.clear();
    }

    /* JADX INFO: renamed from: k */
    public final List m73042k() {
        return this.f56368a;
    }

    /* JADX INFO: renamed from: l */
    public final List m73043l() {
        return this.f56374g;
    }

    /* JADX INFO: renamed from: m */
    public final int m73044m() {
        return this.f56369b;
    }

    /* JADX INFO: renamed from: n */
    public final C3187b0 m73045n() {
        return (C3187b0) this.f56371d.getValue();
    }

    /* JADX INFO: renamed from: o */
    public final Map m73046o() {
        return this.f56370c;
    }

    /* JADX INFO: renamed from: p */
    public final void m73047p(final FragmentActivity activity) {
        Intrinsics.m97802h(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            this.f56369b = 0;
            return;
        }
        if (AbstractC5781d.m27349a() > 50) {
            C26866a.a.m104898f(C26866a.f81698a, "ImmVideoHelper", "is open navigation bar", false, 4, null);
            this.f56369b = 0;
            return;
        }
        Window window = activity.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        if (decorView != null) {
            decorView.post(new Runnable() { // from class: com.transsion.postdetail.helper.i
                @Override // java.lang.Runnable
                public final void run() {
                    ShortTvImmVideoHelper.m73035q(activity, this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m73048s() {
        return this.f56372e;
    }

    /* JADX INFO: renamed from: t */
    public final void m73049t() {
        List list = (List) m73045n().m14847f();
        if ((list != null ? list.size() : 0) > 0) {
            return;
        }
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new ShortTvImmVideoHelper$loadCache$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: v */
    public final void m73050v(Context context) {
        Intrinsics.m97802h(context, "context");
        this.f56377j = false;
        for (int i11 = 0; i11 < 2; i11++) {
            new AsyncLayoutInflater(context).m2259a(R$layout.item_short_tv_immersion_video, null, new AsyncLayoutInflater.InterfaceC0514d() { // from class: com.transsion.postdetail.helper.j
                @Override // androidx.asynclayoutinflater.view.AsyncLayoutInflater.InterfaceC0514d
                /* JADX INFO: renamed from: a */
                public final void mo2260a(View view, int i12, ViewGroup viewGroup) {
                    ShortTvImmVideoHelper.m73038w(this.f56389a, view, i12, viewGroup);
                }
            });
        }
        for (int i12 = 0; i12 < 2; i12++) {
            new AsyncLayoutInflater(context).m2259a(com.transsion.shorttv.R$layout.short_tv_item_video, null, new AsyncLayoutInflater.InterfaceC0514d() { // from class: com.transsion.postdetail.helper.k
                @Override // androidx.asynclayoutinflater.view.AsyncLayoutInflater.InterfaceC0514d
                /* JADX INFO: renamed from: a */
                public final void mo2260a(View view, int i13, ViewGroup viewGroup) {
                    ShortTvImmVideoHelper.m73039x(this.f56390a, view, i13, viewGroup);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m73051y() {
        this.f56377j = true;
        this.f56374g.clear();
        this.f56375h.clear();
    }

    /* JADX INFO: renamed from: z */
    public final void m73052z(List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty() || Intrinsics.m97797c(list, m73045n().m14847f())) {
            return;
        }
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new ShortTvImmVideoHelper$saveCache$1(list, this, null), 3, null);
    }
}
