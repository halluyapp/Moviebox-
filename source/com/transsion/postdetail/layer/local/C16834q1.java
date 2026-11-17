package com.transsion.postdetail.layer.local;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.tencent.mmkv.MMKV;
import com.transsion.postdetail.p306ui.view.VideoDoubleClickBackgroundView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p582lo.C25654c;
import p582lo.C25661j;
import p582lo.C25663l;

/* JADX INFO: renamed from: com.transsion.postdetail.layer.local.q1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16834q1 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: b */
    public static final a f56668b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final Lazy f56669c = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.layer.local.k1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C16834q1.m73496d();
        }
    });

    /* JADX INFO: renamed from: a */
    private final C25654c f56670a;

    /* JADX INFO: renamed from: com.transsion.postdetail.layer.local.q1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static final Unit m73503g(View view) {
            C16834q1.f56668b.m73507l(view);
            return Unit.f75682a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final void m73504h(View view, final Function0 function0, View view2) {
            C16834q1.f56668b.m73507l(view);
            view.removeCallbacks(new Runnable() { // from class: com.transsion.postdetail.layer.local.o1
                @Override // java.lang.Runnable
                public final void run() {
                    C16834q1.a.m73505i(function0);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final void m73505i(Function0 function0) {
            function0.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final void m73506j(Function0 function0) {
            function0.invoke();
        }

        /* JADX INFO: renamed from: l */
        private final void m73507l(final View view) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            viewPropertyAnimatorAnimate.setDuration(300L);
            viewPropertyAnimatorAnimate.alpha(0.0f);
            viewPropertyAnimatorAnimate.withEndAction(new Runnable() { // from class: com.transsion.postdetail.layer.local.p1
                @Override // java.lang.Runnable
                public final void run() {
                    C16834q1.a.m73508m(view);
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: m */
        public static final void m73508m(View view) {
            AbstractC26006c.m102054g(view);
        }

        /* JADX INFO: renamed from: f */
        public final void m73509f(C25661j c25661j) {
            final View viewInflate;
            C25663l c25663l;
            ViewStub viewStub;
            if (m73510k().getBoolean("video_show_guide", false)) {
                return;
            }
            if (((c25661j == null || (c25663l = c25661j.f77909p) == null || (viewStub = c25663l.f77968p) == null) ? null : viewStub.getParent()) == null || (viewInflate = c25661j.f77909p.f77968p.inflate()) == null) {
                return;
            }
            C16834q1.f56668b.m73510k().putBoolean("video_show_guide", true);
            final Function0 function0 = new Function0() { // from class: com.transsion.postdetail.layer.local.l1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C16834q1.a.m73503g(viewInflate);
                }
            };
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.layer.local.m1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C16834q1.a.m73504h(viewInflate, function0, view);
                }
            });
            viewInflate.postDelayed(new Runnable() { // from class: com.transsion.postdetail.layer.local.n1
                @Override // java.lang.Runnable
                public final void run() {
                    C16834q1.a.m73506j(function0);
                }
            }, 3000L);
        }

        /* JADX INFO: renamed from: k */
        public final MMKV m73510k() {
            return (MMKV) C16834q1.f56669c.getValue();
        }
    }

    public C16834q1(C25654c bind) {
        Intrinsics.m97802h(bind, "bind");
        this.f56670a = bind;
        bind.f77841b.addAnimatorListener(this);
        bind.f77842c.addAnimatorListener(this);
    }

    /* JADX INFO: renamed from: c */
    private final void m73495c() {
        C25654c c25654c = this.f56670a;
        VideoDoubleClickBackgroundView vDoubleClick = c25654c.f77845f;
        Intrinsics.m97801g(vDoubleClick, "vDoubleClick");
        AbstractC26006c.m102054g(vDoubleClick);
        AppCompatTextView tvDoubleClickLeft = c25654c.f77843d;
        Intrinsics.m97801g(tvDoubleClickLeft, "tvDoubleClickLeft");
        AbstractC26006c.m102054g(tvDoubleClickLeft);
        AppCompatTextView tvDoubleClickRight = c25654c.f77844e;
        Intrinsics.m97801g(tvDoubleClickRight, "tvDoubleClickRight");
        AbstractC26006c.m102054g(tvDoubleClickRight);
        LottieAnimationView lottieDoubleClickLeft = c25654c.f77841b;
        Intrinsics.m97801g(lottieDoubleClickLeft, "lottieDoubleClickLeft");
        AbstractC26006c.m102054g(lottieDoubleClickLeft);
        LottieAnimationView lottieDoubleClickRight = c25654c.f77842c;
        Intrinsics.m97801g(lottieDoubleClickRight, "lottieDoubleClickRight");
        AbstractC26006c.m102054g(lottieDoubleClickRight);
        c25654c.f77841b.pauseAnimation();
        c25654c.f77842c.pauseAnimation();
        ConstraintLayout root = c25654c.getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        AbstractC26006c.m102054g(root);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final MMKV m73496d() {
        MMKV mmkvM61551I = MMKV.m61551I("kv_video_double");
        Intrinsics.m97801g(mmkvM61551I, "mmkvWithID(...)");
        return mmkvM61551I;
    }

    /* JADX INFO: renamed from: e */
    public final void m73497e(boolean z11) {
        boolean z12;
        C25654c c25654c = this.f56670a;
        VideoDoubleClickBackgroundView vDoubleClick = c25654c.f77845f;
        Intrinsics.m97801g(vDoubleClick, "vDoubleClick");
        AbstractC26006c.m102058k(vDoubleClick);
        boolean zM102053f = AbstractC26006c.m102053f();
        if (zM102053f) {
            z12 = z11;
        } else {
            z12 = !z11;
        }
        c25654c.f77845f.setLeftStyle(z12);
        if (z11) {
            if (zM102053f) {
                c25654c.f77842c.setScaleX(-1.0f);
            }
            AppCompatTextView tvDoubleClickRight = c25654c.f77844e;
            Intrinsics.m97801g(tvDoubleClickRight, "tvDoubleClickRight");
            AbstractC26006c.m102058k(tvDoubleClickRight);
            LottieAnimationView lottieDoubleClickRight = c25654c.f77842c;
            Intrinsics.m97801g(lottieDoubleClickRight, "lottieDoubleClickRight");
            AbstractC26006c.m102058k(lottieDoubleClickRight);
            c25654c.f77842c.playAnimation();
        } else {
            if (zM102053f) {
                c25654c.f77841b.setScaleX(-1.0f);
            }
            AppCompatTextView tvDoubleClickLeft = c25654c.f77843d;
            Intrinsics.m97801g(tvDoubleClickLeft, "tvDoubleClickLeft");
            AbstractC26006c.m102058k(tvDoubleClickLeft);
            LottieAnimationView lottieDoubleClickLeft = c25654c.f77841b;
            Intrinsics.m97801g(lottieDoubleClickLeft, "lottieDoubleClickLeft");
            AbstractC26006c.m102058k(lottieDoubleClickLeft);
            c25654c.f77841b.playAnimation();
        }
        ConstraintLayout root = c25654c.getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        AbstractC26006c.m102058k(root);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        Intrinsics.m97802h(animation, "animation");
        m73495c();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        Intrinsics.m97802h(animation, "animation");
        m73495c();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animation) {
        Intrinsics.m97802h(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        Intrinsics.m97802h(animation, "animation");
    }
}
