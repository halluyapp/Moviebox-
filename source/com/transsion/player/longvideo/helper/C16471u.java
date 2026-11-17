package com.transsion.player.longvideo.helper;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ck.AbstractC5114k;
import com.blankj.utilcode.util.AbstractC5796o;
import com.cloud.tmc.miniutils.constant.TimeConstants;
import com.noober.background.view.BLLinearLayout;
import com.noober.background.view.BLTextView;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.p299mb.config.manager.ConfigBean;
import fk.AbstractC23384a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import mo.C25894a;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p582lo.C25656e;
import p582lo.C25657f;
import p582lo.C25661j;
import p913xm.C28615f;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.player.longvideo.helper.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C16471u {

    /* JADX INFO: renamed from: l */
    public static final a f55559l = new a(null);

    /* JADX INFO: renamed from: a */
    private final C25661j f55560a;

    /* JADX INFO: renamed from: b */
    private final Function0 f55561b;

    /* JADX INFO: renamed from: c */
    private C16439b f55562c;

    /* JADX INFO: renamed from: d */
    private C25656e f55563d;

    /* JADX INFO: renamed from: e */
    private boolean f55564e;

    /* JADX INFO: renamed from: f */
    private boolean f55565f;

    /* JADX INFO: renamed from: g */
    private boolean f55566g;

    /* JADX INFO: renamed from: h */
    private final Handler f55567h;

    /* JADX INFO: renamed from: i */
    private final Handler f55568i;

    /* JADX INFO: renamed from: j */
    private final Handler f55569j;

    /* JADX INFO: renamed from: k */
    private final Lazy f55570k;

    /* JADX INFO: renamed from: com.transsion.player.longvideo.helper.u$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C16471u(C25661j viewBinding, Function0 continuePlaCallback) {
        String value;
        Object objM112707constructorimpl;
        Intrinsics.m97802h(viewBinding, "viewBinding");
        Intrinsics.m97802h(continuePlaCallback, "continuePlaCallback");
        this.f55560a = viewBinding;
        this.f55561b = continuePlaCallback;
        this.f55567h = new Handler(Looper.getMainLooper());
        this.f55568i = new Handler(Looper.getMainLooper());
        this.f55569j = new Handler(Looper.getMainLooper());
        this.f55570k = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.helper.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(C16471u.m71823A());
            }
        });
        ConfigBean configBeanM110355d = C28615f.m110355d(C28615f.f87796c.m110363a(), "sa_data_operator_config", false, 2, null);
        if (configBeanM110355d != null && (value = configBeanM110355d.getValue()) != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                this.f55562c = (C16439b) AbstractC5796o.m27441d(value, C16439b.class);
                objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            Result.m112706boximpl(objM112707constructorimpl);
        }
        C16439b c16439b = this.f55562c;
        if (c16439b != null) {
            C25657f c25657f = this.f55560a.f77908o.f77945s;
            c25657f.f77859e.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.helper.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C16471u.m71849y(this.f55554a, view);
                }
            });
            c25657f.f77857c.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.helper.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C16471u.m71850z(this.f55555a, view);
                }
            });
            String strM71796l = c16439b.m71796l();
            if (strM71796l != null) {
                c25657f.f77861g.setText(strM71796l);
            }
            String strM71795k = c16439b.m71795k();
            if (strM71795k != null) {
                c25657f.f77860f.setText(strM71795k);
            }
            String strM71785a = c16439b.m71785a();
            if (strM71785a != null) {
                c25657f.f77858d.setText(strM71785a);
            }
            String strM71786b = c16439b.m71786b();
            if (strM71786b != null) {
                C23860f.a aVar = C23860f.f72909a;
                Context context = c25657f.f77856b.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94464c = aVar.m94457m(context).m94468g(strM71786b).m94474m(AbstractC23384a.m92908b(16)).m94464c(AbstractC23384a.m92908b(16));
                AppCompatImageView ivMore = c25657f.f77856b;
                Intrinsics.m97801g(ivMore, "ivMore");
                bVarM94464c.m94465d(ivMore);
            }
            C25657f c25657f2 = this.f55560a.f77909p.f77965m;
            c25657f2.f77859e.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.helper.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C16471u.m71847w(this.f55556a, view);
                }
            });
            c25657f2.f77857c.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.helper.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C16471u.m71848x(this.f55557a, view);
                }
            });
            String strM71796l2 = c16439b.m71796l();
            if (strM71796l2 != null) {
                c25657f2.f77861g.setText(strM71796l2);
            }
            String strM71795k2 = c16439b.m71795k();
            if (strM71795k2 != null) {
                c25657f2.f77860f.setText(strM71795k2);
            }
            String strM71785a2 = c16439b.m71785a();
            if (strM71785a2 != null) {
                c25657f2.f77858d.setText(strM71785a2);
            }
            String strM71786b2 = c16439b.m71786b();
            if (strM71786b2 != null) {
                C23860f.a aVar2 = C23860f.f72909a;
                Context context2 = c25657f2.f77856b.getContext();
                Intrinsics.m97801g(context2, "getContext(...)");
                C23860f.b bVarM94464c2 = aVar2.m94457m(context2).m94468g(strM71786b2).m94474m(AbstractC23384a.m92908b(16)).m94464c(AbstractC23384a.m92908b(16));
                AppCompatImageView ivMore2 = c25657f2.f77856b;
                Intrinsics.m97801g(ivMore2, "ivMore");
                bVarM94464c2.m94465d(ivMore2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final long m71823A() {
        String value;
        Long lX;
        ConfigBean configBeanM110355d = C28615f.m110355d(C28615f.f87796c.m110363a(), "sa_data_switch", false, 2, null);
        if (configBeanM110355d == null || (value = configBeanM110355d.getValue()) == null || (lX = StringsKt.m98218x(value)) == null) {
            return 720L;
        }
        return lX.longValue();
    }

    /* JADX INFO: renamed from: B */
    private final void m71824B() {
        String strM71792h;
        m71845t();
        C26866a.a aVar = C26866a.f81698a;
        C16439b c16439b = this.f55562c;
        C26866a.a.m104898f(aVar, "LongVodMobileData", "onOperatorClick link:" + (c16439b != null ? c16439b.m71792h() : null), false, 4, null);
        C16439b c16439b2 = this.f55562c;
        if (c16439b2 != null && (strM71792h = c16439b2.m71792h()) != null) {
            AbstractC5114k.m23925h(strM71792h, null, 1, null);
        }
        C14496b.f50966a.m65344b().putLong("key_video_operator_last_open_time", System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: F */
    private final void m71825F(boolean z11) {
        try {
            Result.Companion companion = Result.INSTANCE;
            C26866a.a.m104898f(C26866a.f81698a, "LongVodMobileData", "showOperatorLayout", false, 4, null);
            if (z11) {
                BLLinearLayout root = this.f55560a.f77908o.f77945s.getRoot();
                Intrinsics.m97801g(root, "getRoot(...)");
                AbstractC26006c.m102058k(root);
            } else {
                BLLinearLayout root2 = this.f55560a.f77909p.f77965m.getRoot();
                Intrinsics.m97801g(root2, "getRoot(...)");
                AbstractC26006c.m102058k(root2);
            }
            C16439b c16439b = this.f55562c;
            int iM71794j = c16439b != null ? c16439b.m71794j() : 10;
            this.f55569j.removeCallbacksAndMessages(null);
            Result.m112707constructorimpl(Boolean.valueOf(this.f55569j.postDelayed(new Runnable() { // from class: com.transsion.player.longvideo.helper.t
                @Override // java.lang.Runnable
                public final void run() {
                    C16471u.m71826G(this.f55558a);
                }
            }, ((long) iM71794j) * 1000)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final void m71826G(C16471u c16471u) {
        try {
            Result.Companion companion = Result.INSTANCE;
            c16471u.m71845t();
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m71837k() {
        ConstraintLayout root;
        C25656e c25656e = this.f55563d;
        if (c25656e != null && (root = c25656e.getRoot()) != null && root.getVisibility() == 0) {
            C26866a.a.m104908v(C26866a.f81698a, "LongVodMobileData", "checkFullscreenPageShowOperator, mobile ui show~~", false, 4, null);
            return;
        }
        if (this.f55565f) {
            C26866a.a.m104908v(C26866a.f81698a, "LongVodMobileData", "checkFullscreenPageShowOperator shown return", false, 4, null);
            return;
        }
        if (!m71846u()) {
            C26866a.a.m104908v(C26866a.f81698a, "LongVodMobileData", "checkFullscreenPageShowOperator intercept--", false, 4, null);
            return;
        }
        this.f55565f = true;
        C16439b c16439b = this.f55562c;
        int iM71788d = c16439b != null ? c16439b.m71788d() : 3;
        C26866a.a.m104908v(C26866a.f81698a, "LongVodMobileData", "checkFullscreenPageShowOperator delay show:" + iM71788d + "s", false, 4, null);
        this.f55567h.postDelayed(new Runnable() { // from class: com.transsion.player.longvideo.helper.l
            @Override // java.lang.Runnable
            public final void run() {
                C16471u.m71838l(this.f55546a);
            }
        }, ((long) iM71788d) * 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m71838l(C16471u c16471u) {
        c16471u.m71825F(true);
    }

    /* JADX INFO: renamed from: m */
    private final void m71839m() {
        if (this.f55566g) {
            return;
        }
        if (this.f55564e) {
            C26866a.a.m104908v(C26866a.f81698a, "LongVodMobileData", "checkMiddlePageShowOperator shown return", false, 4, null);
            return;
        }
        if (!m71846u()) {
            C26866a.a.m104908v(C26866a.f81698a, "LongVodMobileData", "checkMiddlePageShowOperator config--", false, 4, null);
            return;
        }
        this.f55564e = true;
        C16439b c16439b = this.f55562c;
        int iM71793i = c16439b != null ? c16439b.m71793i() : 3;
        C26866a.a.m104908v(C26866a.f81698a, "LongVodMobileData", "checkMiddlePageShowOperator delay show:" + iM71793i + "s", false, 4, null);
        this.f55568i.postDelayed(new Runnable() { // from class: com.transsion.player.longvideo.helper.k
            @Override // java.lang.Runnable
            public final void run() {
                C16471u.m71840n(this.f55544a);
            }
        }, ((long) iM71793i) * 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m71840n(C16471u c16471u) {
        c16471u.m71825F(false);
    }

    /* JADX INFO: renamed from: o */
    private final void m71841o() {
        if (this.f55566g) {
            m71837k();
        } else {
            m71839m();
        }
    }

    /* JADX INFO: renamed from: p */
    private final long m71842p() {
        return ((Number) this.f55570k.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final void m71843r(C16471u c16471u, View view) {
        C26866a.a.m104898f(C26866a.f81698a, "LongVodMobileData", "click-- play with mobile data", false, 4, null);
        C25894a.f79115a.m101696c(true);
        c16471u.f55561b.invoke();
        c16471u.m71841o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m71844s(C16471u c16471u, View view) {
        C26866a.a.m104898f(C26866a.f81698a, "LongVodMobileData", "click-- page openDeeplink", false, 4, null);
        c16471u.m71824B();
    }

    /* JADX INFO: renamed from: t */
    private final void m71845t() {
        C26866a.a.m104898f(C26866a.f81698a, "LongVodMobileData", "hideOperatorLayout", false, 4, null);
        BLLinearLayout root = this.f55560a.f77908o.f77945s.getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        AbstractC26006c.m102054g(root);
        BLLinearLayout root2 = this.f55560a.f77909p.f77965m.getRoot();
        Intrinsics.m97801g(root2, "getRoot(...)");
        AbstractC26006c.m102054g(root2);
    }

    /* JADX INFO: renamed from: u */
    private final boolean m71846u() {
        C16439b c16439b = this.f55562c;
        if (c16439b != null) {
            String strM71792h = c16439b != null ? c16439b.m71792h() : null;
            if (strM71792h != null && strM71792h.length() != 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - C14496b.f50966a.m65344b().getLong("key_video_operator_last_open_time", 0L);
                C16439b c16439b2 = this.f55562c;
                boolean z11 = jCurrentTimeMillis >= ((long) ((c16439b2 != null ? c16439b2.m71787c() : 0) * TimeConstants.HOUR));
                C26866a.f81698a.m104912c("LongVodMobileData", "isShowDataOperator time :" + z11, true);
                return z11;
            }
        }
        C26866a.a.m104898f(C26866a.f81698a, "LongVodMobileData", "isShowDataOperator config is null", false, 4, null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final void m71847w(C16471u c16471u, View view) {
        c16471u.m71845t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m71848x(C16471u c16471u, View view) {
        C26866a.a.m104898f(C26866a.f81698a, "LongVodMobileData", "click-- float openDeeplink", false, 4, null);
        c16471u.m71824B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m71849y(C16471u c16471u, View view) {
        c16471u.m71845t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final void m71850z(C16471u c16471u, View view) {
        C26866a.a.m104898f(C26866a.f81698a, "LongVodMobileData", "click-- float openDeeplink", false, 4, null);
        c16471u.m71824B();
    }

    /* JADX INFO: renamed from: C */
    public final void m71851C(boolean z11) {
        this.f55566g = z11;
        m71845t();
        if (z11) {
            this.f55568i.removeCallbacksAndMessages(null);
            C26866a.a.m104908v(C26866a.f81698a, "LongVodMobileData", "onScreenChange enter full", false, 4, null);
            m71837k();
        } else {
            this.f55567h.removeCallbacksAndMessages(null);
            C26866a.a.m104908v(C26866a.f81698a, "LongVodMobileData", "onScreenChange exit full to middle page", false, 4, null);
            m71839m();
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m71852D() {
        C26866a.a.m104898f(C26866a.f81698a, "LongVodMobileData", "onVideoStart", false, 4, null);
        m71841o();
    }

    /* JADX INFO: renamed from: E */
    public final void m71853E() {
        ConstraintLayout root;
        C25656e c25656e = this.f55563d;
        if (c25656e == null || (root = c25656e.getRoot()) == null) {
            return;
        }
        AbstractC26006c.m102054g(root);
    }

    /* JADX INFO: renamed from: q */
    public final void m71854q() {
        BLTextView bLTextView;
        BLTextView bLTextView2;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        C25656e c25656e;
        AppCompatTextView appCompatTextView3;
        BLTextView bLTextView3;
        AppCompatTextView appCompatTextView4;
        ConstraintLayout root;
        C26866a.a aVar = C26866a.f81698a;
        aVar.m104912c("LongVodMobileData", "onPrepare2PlayVideo, is mobile , pause video. show layout", true);
        if (this.f55563d == null) {
            this.f55563d = C25656e.m100986a(this.f55560a.f77891D.inflate());
        }
        C14496b.f50966a.m65344b().putLong("key_mobile_data_switch_time", System.currentTimeMillis());
        C25656e c25656e2 = this.f55563d;
        if (c25656e2 != null && (root = c25656e2.getRoot()) != null) {
            AbstractC26006c.m102058k(root);
        }
        C25656e c25656e3 = this.f55563d;
        if (c25656e3 != null) {
            if (c25656e3 != null && (appCompatTextView4 = c25656e3.f77853d) != null) {
                AbstractC26006c.m102054g(appCompatTextView4);
            }
            C25656e c25656e4 = this.f55563d;
            if (c25656e4 != null && (bLTextView3 = c25656e4.f77851b) != null) {
                AbstractC26006c.m102054g(bLTextView3);
            }
            if (m71846u()) {
                C26866a.a.m104898f(aVar, "LongVodMobileData", "mobile data layout, show operator ui--------", false, 4, null);
                C16439b c16439b = this.f55562c;
                if (c16439b != null) {
                    String strM71791g = c16439b.m71791g();
                    if (strM71791g != null && (c25656e = this.f55563d) != null && (appCompatTextView3 = c25656e.f77854e) != null) {
                        appCompatTextView3.setText(strM71791g);
                    }
                    String strM71790f = c16439b.m71790f();
                    if (strM71790f != null) {
                        C25656e c25656e5 = this.f55563d;
                        if (c25656e5 != null && (appCompatTextView2 = c25656e5.f77853d) != null) {
                            appCompatTextView2.setText(strM71790f);
                        }
                        C25656e c25656e6 = this.f55563d;
                        if (c25656e6 != null && (appCompatTextView = c25656e6.f77853d) != null) {
                            AbstractC26006c.m102058k(appCompatTextView);
                        }
                    }
                    String strM71789e = c16439b.m71789e();
                    if (strM71789e != null) {
                        C25656e c25656e7 = this.f55563d;
                        if (c25656e7 != null && (bLTextView2 = c25656e7.f77851b) != null) {
                            bLTextView2.setText(strM71789e);
                        }
                        C25656e c25656e8 = this.f55563d;
                        if (c25656e8 != null && (bLTextView = c25656e8.f77851b) != null) {
                            AbstractC26006c.m102058k(bLTextView);
                        }
                    }
                }
            }
            c25656e3.f77852c.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.helper.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C16471u.m71843r(this.f55548a, view);
                }
            });
            BLTextView longVdTvOperator = c25656e3.f77851b;
            Intrinsics.m97801g(longVdTvOperator, "longVdTvOperator");
            longVdTvOperator.setVisibility(m71846u() ? 0 : 8);
            c25656e3.f77851b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.helper.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C16471u.m71844s(this.f55550a, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m71855v() {
        long j11 = 60;
        return System.currentTimeMillis() - C14496b.f50966a.m65344b().getLong("key_mobile_data_switch_time", 0L) >= ((m71842p() * j11) * j11) * ((long) 1000);
    }
}
