package com.transsion.postdetail.layer.local;

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
import p844vo.C28180y;

/* JADX INFO: renamed from: com.transsion.postdetail.layer.local.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16815k0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: b */
    public static final a f56645b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final Lazy f56646c = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.layer.local.j0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C16815k0.m73491c();
        }
    });

    /* JADX INFO: renamed from: a */
    private final C28180y f56647a;

    /* JADX INFO: renamed from: com.transsion.postdetail.layer.local.k0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C16815k0(C28180y bind) {
        Intrinsics.m97802h(bind, "bind");
        this.f56647a = bind;
        bind.f86747b.addAnimatorListener(this);
        bind.f86748c.addAnimatorListener(this);
    }

    /* JADX INFO: renamed from: b */
    private final void m73490b() {
        C28180y c28180y = this.f56647a;
        VideoDoubleClickBackgroundView vDoubleClick = c28180y.f86751f;
        Intrinsics.m97801g(vDoubleClick, "vDoubleClick");
        AbstractC26006c.m102054g(vDoubleClick);
        AppCompatTextView tvDoubleClickLeft = c28180y.f86749d;
        Intrinsics.m97801g(tvDoubleClickLeft, "tvDoubleClickLeft");
        AbstractC26006c.m102054g(tvDoubleClickLeft);
        AppCompatTextView tvDoubleClickRight = c28180y.f86750e;
        Intrinsics.m97801g(tvDoubleClickRight, "tvDoubleClickRight");
        AbstractC26006c.m102054g(tvDoubleClickRight);
        LottieAnimationView lottieDoubleClickLeft = c28180y.f86747b;
        Intrinsics.m97801g(lottieDoubleClickLeft, "lottieDoubleClickLeft");
        AbstractC26006c.m102054g(lottieDoubleClickLeft);
        LottieAnimationView lottieDoubleClickRight = c28180y.f86748c;
        Intrinsics.m97801g(lottieDoubleClickRight, "lottieDoubleClickRight");
        AbstractC26006c.m102054g(lottieDoubleClickRight);
        c28180y.f86747b.pauseAnimation();
        c28180y.f86748c.pauseAnimation();
        ConstraintLayout root = c28180y.getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        AbstractC26006c.m102054g(root);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final MMKV m73491c() {
        MMKV mmkvM61551I = MMKV.m61551I("kv_video_double");
        Intrinsics.m97801g(mmkvM61551I, "mmkvWithID(...)");
        return mmkvM61551I;
    }

    /* JADX INFO: renamed from: d */
    public final void m73492d(boolean z11) {
        C28180y c28180y = this.f56647a;
        VideoDoubleClickBackgroundView vDoubleClick = c28180y.f86751f;
        Intrinsics.m97801g(vDoubleClick, "vDoubleClick");
        AbstractC26006c.m102058k(vDoubleClick);
        c28180y.f86751f.setLeftStyle(!z11);
        if (z11) {
            AppCompatTextView tvDoubleClickRight = c28180y.f86750e;
            Intrinsics.m97801g(tvDoubleClickRight, "tvDoubleClickRight");
            AbstractC26006c.m102058k(tvDoubleClickRight);
            LottieAnimationView lottieDoubleClickRight = c28180y.f86748c;
            Intrinsics.m97801g(lottieDoubleClickRight, "lottieDoubleClickRight");
            AbstractC26006c.m102058k(lottieDoubleClickRight);
            c28180y.f86748c.playAnimation();
        } else {
            AppCompatTextView tvDoubleClickLeft = c28180y.f86749d;
            Intrinsics.m97801g(tvDoubleClickLeft, "tvDoubleClickLeft");
            AbstractC26006c.m102058k(tvDoubleClickLeft);
            LottieAnimationView lottieDoubleClickLeft = c28180y.f86747b;
            Intrinsics.m97801g(lottieDoubleClickLeft, "lottieDoubleClickLeft");
            AbstractC26006c.m102058k(lottieDoubleClickLeft);
            c28180y.f86747b.playAnimation();
        }
        ConstraintLayout root = c28180y.getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        AbstractC26006c.m102058k(root);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        Intrinsics.m97802h(animation, "animation");
        m73490b();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        Intrinsics.m97802h(animation, "animation");
        m73490b();
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
