package com.transsion.player.longvideo.helper;

import android.animation.Animator;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.tencent.mmkv.MMKV;
import com.transsion.postdetail.p306ui.view.VideoDoubleClickBackgroundView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p582lo.C25654c;

/* JADX INFO: renamed from: com.transsion.player.longvideo.helper.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C16453i implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: b */
    public static final a f55536b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final Lazy f55537c = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.helper.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C16453i.m71814c();
        }
    });

    /* JADX INFO: renamed from: a */
    private final C25654c f55538a;

    /* JADX INFO: renamed from: com.transsion.player.longvideo.helper.i$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C16453i(C25654c bind) {
        Intrinsics.m97802h(bind, "bind");
        this.f55538a = bind;
        bind.f77841b.addAnimatorListener(this);
        bind.f77842c.addAnimatorListener(this);
    }

    /* JADX INFO: renamed from: b */
    private final void m71813b() {
        C25654c c25654c = this.f55538a;
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
    /* JADX INFO: renamed from: c */
    public static final MMKV m71814c() {
        MMKV mmkvM61551I = MMKV.m61551I("kv_video_double");
        Intrinsics.m97801g(mmkvM61551I, "mmkvWithID(...)");
        return mmkvM61551I;
    }

    /* JADX INFO: renamed from: d */
    public final void m71815d(boolean z11) {
        boolean z12;
        C25654c c25654c = this.f55538a;
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
        m71813b();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        Intrinsics.m97802h(animation, "animation");
        m71813b();
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
