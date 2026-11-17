package com.transsion.postdetail.helper;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3187b0;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.Video;
import com.transsion.player.orplayer.ORPlayerPreloadManager;
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
public final class ImmVideoHelper {

    /* JADX INFO: renamed from: h */
    public static final C16766a f56352h = new C16766a(null);

    /* JADX INFO: renamed from: i */
    private static final Lazy f56353i = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.helper.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ImmVideoHelper.m72994m();
        }
    });

    /* JADX INFO: renamed from: b */
    private int f56355b;

    /* JADX INFO: renamed from: e */
    private boolean f56358e;

    /* JADX INFO: renamed from: f */
    private boolean f56359f;

    /* JADX INFO: renamed from: g */
    private boolean f56360g;

    /* JADX INFO: renamed from: a */
    private final List f56354a = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final Map f56356c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    private final Lazy f56357d = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.helper.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ImmVideoHelper.m72996v();
        }
    });

    /* JADX INFO: renamed from: com.transsion.postdetail.helper.ImmVideoHelper$a */
    public static final class C16766a {
        private C16766a() {
        }

        public /* synthetic */ C16766a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ImmVideoHelper m73010a() {
            return (ImmVideoHelper) ImmVideoHelper.f56353i.getValue();
        }
    }

    public ImmVideoHelper() {
        this.f56358e = true;
        this.f56359f = true;
        this.f56360g = true;
        C14496b c14496b = C14496b.f50966a;
        this.f56358e = c14496b.m65344b().getBoolean("k_imm_video_guide", true);
        this.f56360g = c14496b.m65344b().getBoolean("k_short_tv_guide", true);
        this.f56359f = c14496b.m65344b().getBoolean("k_imm_video_guide_from_trending", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m72993l(FragmentActivity fragmentActivity, ImmVideoHelper immVideoHelper) {
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
        immVideoHelper.f56355b = i11;
        C26866a.a.m104898f(C26866a.f81698a, "ImmVideoHelper", "on get navigation gesture height = " + i11, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final ImmVideoHelper m72994m() {
        return new ImmVideoHelper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final void m72995q(List list) {
        String url;
        if (list == null || !(!list.isEmpty()) || (url = ((Video) list.get(0)).getUrl()) == null) {
            return;
        }
        ORPlayerPreloadManager.f55908i.m72403a().m72401j(url, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C3187b0 m72996v() {
        return new C3187b0();
    }

    /* JADX INFO: renamed from: f */
    public final void m72997f() {
        this.f56354a.clear();
    }

    /* JADX INFO: renamed from: g */
    public final List m72998g() {
        return this.f56354a;
    }

    /* JADX INFO: renamed from: h */
    public final int m72999h() {
        return this.f56355b;
    }

    /* JADX INFO: renamed from: i */
    public final C3187b0 m73000i() {
        return (C3187b0) this.f56357d.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final Map m73001j() {
        return this.f56356c;
    }

    /* JADX INFO: renamed from: k */
    public final void m73002k(final FragmentActivity activity) {
        Intrinsics.m97802h(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            this.f56355b = 0;
            return;
        }
        if (AbstractC5781d.m27349a() > 50) {
            C26866a.a.m104898f(C26866a.f81698a, "ImmVideoHelper", "is open navigation bar", false, 4, null);
            this.f56355b = 0;
            return;
        }
        Window window = activity.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        if (decorView != null) {
            decorView.post(new Runnable() { // from class: com.transsion.postdetail.helper.d
                @Override // java.lang.Runnable
                public final void run() {
                    ImmVideoHelper.m72993l(activity, this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m73003n() {
        return this.f56358e;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m73004o() {
        return this.f56359f;
    }

    /* JADX INFO: renamed from: p */
    public final void m73005p() {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new ImmVideoHelper$loadCache$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m73006r(List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new ImmVideoHelper$saveCache$1(list, this, null), 3, null);
    }

    /* JADX INFO: renamed from: s */
    public final void m73007s(PostSubjectItem data) {
        List<Video> video;
        Intrinsics.m97802h(data, "data");
        Media media = data.getMedia();
        if (media == null || (video = media.getVideo()) == null || !(!video.isEmpty())) {
            return;
        }
        m72997f();
        this.f56354a.add(PostSubjectItem.INSTANCE.m70985a(data));
    }

    /* JADX INFO: renamed from: t */
    public final void m73008t() {
        C26866a.a.m104908v(C26866a.f81698a, "ImmVideoPlayer", "-- setVideoGuideShown", false, 4, null);
        this.f56358e = false;
        C14496b.f50966a.m65344b().putBoolean("k_imm_video_guide", false);
    }

    /* JADX INFO: renamed from: u */
    public final void m73009u() {
        C26866a.a.m104908v(C26866a.f81698a, "ImmVideoPlayer", "-- setVideoGuideShownFromTrending", false, 4, null);
        this.f56359f = false;
        C14496b.f50966a.m65344b().putBoolean("k_imm_video_guide_from_trending", false);
    }
}
