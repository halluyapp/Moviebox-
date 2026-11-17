package com.transsion.subroom.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import com.cloud.hisavana.sdk.common.util.C8113l0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.p285ad.scene.C14047a;
import com.transsion.p285ad.scene.C14050d;
import com.transsion.wrapperad.view.secondfloor.CustomSwipeRefreshLayout;
import com.transsion.wrapperad.view.secondfloor.SecondFloorArcCoverView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25143l2;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.InterfaceC25204t1;
import li.C25639b;
import ng.AbstractC26006c;
import p418fu.C23431a;

/* JADX INFO: loaded from: classes6.dex */
public final class SecondFloorHelper {

    /* JADX INFO: renamed from: A */
    private Function0 f62626A;

    /* JADX INFO: renamed from: a */
    private C23431a f62627a;

    /* JADX INFO: renamed from: b */
    private final long f62628b;

    /* JADX INFO: renamed from: c */
    private final long f62629c;

    /* JADX INFO: renamed from: d */
    private final String f62630d;

    /* JADX INFO: renamed from: e */
    private final Lazy f62631e;

    /* JADX INFO: renamed from: f */
    private final Lazy f62632f;

    /* JADX INFO: renamed from: g */
    private final Lazy f62633g;

    /* JADX INFO: renamed from: h */
    private AnimatorSet f62634h;

    /* JADX INFO: renamed from: i */
    private AnimatorSet f62635i;

    /* JADX INFO: renamed from: j */
    private Function1 f62636j;

    /* JADX INFO: renamed from: k */
    private String f62637k;

    /* JADX INFO: renamed from: l */
    private final InterfaceC25149n0 f62638l;

    /* JADX INFO: renamed from: m */
    private InterfaceC25204t1 f62639m;

    /* JADX INFO: renamed from: n */
    private InterfaceC25204t1 f62640n;

    /* JADX INFO: renamed from: o */
    private InterfaceC25204t1 f62641o;

    /* JADX INFO: renamed from: p */
    private InterfaceC25204t1 f62642p;

    /* JADX INFO: renamed from: q */
    private boolean f62643q;

    /* JADX INFO: renamed from: r */
    private boolean f62644r;

    /* JADX INFO: renamed from: s */
    private boolean f62645s;

    /* JADX INFO: renamed from: t */
    private boolean f62646t;

    /* JADX INFO: renamed from: u */
    private boolean f62647u;

    /* JADX INFO: renamed from: v */
    private boolean f62648v;

    /* JADX INFO: renamed from: w */
    private boolean f62649w;

    /* JADX INFO: renamed from: x */
    private final String f62650x;

    /* JADX INFO: renamed from: y */
    private int f62651y;

    /* JADX INFO: renamed from: z */
    private final Lazy f62652z;

    /* JADX INFO: renamed from: com.transsion.subroom.activity.SecondFloorHelper$a */
    public static final class C19596a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f62654b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f62655c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f62656d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ boolean f62657e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ boolean f62658f;

        C19596a(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
            this.f62654b = z11;
            this.f62655c = z12;
            this.f62656d = z13;
            this.f62657e = z14;
            this.f62658f = z15;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.m97802h(animation, "animation");
            super.onAnimationCancel(animation);
            SecondFloorHelper.this.f62648v = false;
            SecondFloorHelper.this.m81698P(this.f62654b, this.f62655c, this.f62656d, this.f62657e, this.f62658f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.m97802h(animation, "animation");
            super.onAnimationEnd(animation);
            SecondFloorHelper.this.f62648v = false;
            SecondFloorHelper.this.m81698P(this.f62654b, this.f62655c, this.f62656d, this.f62657e, this.f62658f);
        }
    }

    public SecondFloorHelper(C23431a viewBinding) {
        Intrinsics.m97802h(viewBinding, "viewBinding");
        this.f62627a = viewBinding;
        this.f62628b = 400L;
        this.f62629c = 500L;
        this.f62630d = "TrendingTwoLevelloftScene";
        this.f62631e = LazyKt.m97097b(new Function0() { // from class: com.transsion.subroom.activity.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(SecondFloorHelper.m81685A(this.f62668a));
            }
        });
        this.f62632f = LazyKt.m97097b(new Function0() { // from class: com.transsion.subroom.activity.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(SecondFloorHelper.m81686B(this.f62670a));
            }
        });
        this.f62633g = LazyKt.m97097b(new Function0() { // from class: com.transsion.subroom.activity.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(SecondFloorHelper.m81699R(this.f62672a));
            }
        });
        this.f62637k = CustomSwipeRefreshLayout.IDLE;
        this.f62638l = AbstractC25153o0.m99079a(C25220y0.m99269c().plus(AbstractC25143l2.m99069b(null, 1, null)));
        this.f62650x = "show_guide";
        this.f62652z = LazyKt.m97097b(new Function0() { // from class: com.transsion.subroom.activity.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(SecondFloorHelper.m81697O(this.f62674a));
            }
        });
        this.f62627a.f71456k.setLoadCallback(new Function1() { // from class: com.transsion.subroom.activity.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SecondFloorHelper.m81711g(this.f62676a, ((Boolean) obj).booleanValue());
            }
        });
        this.f62627a.f71456k.setClickCallback(new Function0() { // from class: com.transsion.subroom.activity.f0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SecondFloorHelper.m81712h(this.f62677a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final float m81685A(SecondFloorHelper secondFloorHelper) {
        return (secondFloorHelper.f62627a.getRoot().getContext().getResources().getDisplayMetrics().widthPixels * 9) / 16.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final float m81686B(SecondFloorHelper secondFloorHelper) {
        return ((secondFloorHelper.f62627a.getRoot().getContext().getResources().getDisplayMetrics().widthPixels * 9) / 16) / 2.0f;
    }

    /* JADX INFO: renamed from: C */
    private final void m81687C() {
        InterfaceC25204t1 interfaceC25204t1 = this.f62640n;
        if (interfaceC25204t1 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
        }
        InterfaceC25204t1 interfaceC25204t2 = this.f62641o;
        if (interfaceC25204t2 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t2, null, 1, null);
        }
        InterfaceC25204t1 interfaceC25204t3 = this.f62642p;
        if (interfaceC25204t3 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t3, null, 1, null);
        }
        InterfaceC25204t1 interfaceC25204t4 = this.f62639m;
        if (interfaceC25204t4 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t4, null, 1, null);
        }
        this.f62640n = null;
        this.f62641o = null;
        this.f62642p = null;
        this.f62639m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final void m81688E() {
        m81710f0();
        m81706d0(this, m81693J(), true, false, false, true, false, 44, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final void m81689F() {
        m81710f0();
        m81706d0(this, m81694K(), true, false, true, false, false, 52, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final void m81690G(boolean z11) {
        if (this.f62627a.f71449d.getTranslationY() <= 0.0f) {
            SecondFloorArcCoverView arcCover = this.f62627a.f71447b;
            Intrinsics.m97801g(arcCover, "arcCover");
            AbstractC26006c.m102054g(arcCover);
        } else {
            if (this.f62648v) {
                return;
            }
            this.f62648v = true;
            m81710f0();
            m81706d0(this, 0.0f, true, true, false, false, z11, 24, null);
            this.f62627a.f71456k.idleTrigger();
        }
    }

    /* JADX INFO: renamed from: H */
    static /* synthetic */ void m81691H(SecondFloorHelper secondFloorHelper, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        secondFloorHelper.m81690G(z11);
    }

    /* JADX INFO: renamed from: I */
    private final void m81692I() {
        m81710f0();
        m81706d0(this, m81693J(), false, false, false, false, false, 62, null);
    }

    /* JADX INFO: renamed from: J */
    private final float m81693J() {
        return ((Number) this.f62631e.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final float m81694K() {
        return ((Number) this.f62632f.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: L */
    private final int m81695L() {
        return ((Number) this.f62652z.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final long m81696M() {
        return ((Number) this.f62633g.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final int m81697O(SecondFloorHelper secondFloorHelper) {
        JsonElement jsonElement;
        JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b(secondFloorHelper.f62630d);
        if (jsonObjectM63626b == null || (jsonElement = jsonObjectM63626b.get("guideShowMax")) == null) {
            return 1;
        }
        return jsonElement.getAsInt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public final void m81698P(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        if (z11) {
            this.f62627a.f71447b.setAlpha(0.0f);
            SecondFloorArcCoverView arcCover = this.f62627a.f71447b;
            Intrinsics.m97801g(arcCover, "arcCover");
            AbstractC26006c.m102054g(arcCover);
        }
        if (z12) {
            m81739Y(CustomSwipeRefreshLayout.IDLE);
            C25639b.f77786a.m100916e(this.f62630d, this.f62647u);
            this.f62647u = false;
            if (z15) {
                m81737W();
            } else if (this.f62646t) {
                this.f62627a.f71456k.resetAd();
                this.f62646t = false;
                m81700V(this, false, true, 1, null);
            }
        }
        if (z13) {
            m81739Y(CustomSwipeRefreshLayout.HOVER_HALF);
        }
        if (z14) {
            m81739Y(CustomSwipeRefreshLayout.HOVER_FULL);
        }
        this.f62635i = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final long m81699R(SecondFloorHelper secondFloorHelper) {
        int iM63587e = C14047a.f49716a.m63587e(secondFloorHelper.f62630d);
        if (iM63587e > 0) {
            return ((long) iM63587e) * 1000;
        }
        return 5000L;
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m81700V(SecondFloorHelper secondFloorHelper, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        secondFloorHelper.m81736U(z11, z12);
    }

    /* JADX INFO: renamed from: c0 */
    private final void m81704c0(float f11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        AnimatorSet animatorSet = this.f62635i;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f62627a.f71449d, "translationY", f11);
        objectAnimatorOfFloat.setDuration(this.f62628b);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f62627a.f71447b, "alpha", z11 ? 0.0f : 1.0f);
        objectAnimatorOfFloat2.setDuration(this.f62628b);
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f62627a.f71447b, "translationY", f11);
        objectAnimatorOfFloat3.setDuration(this.f62628b);
        objectAnimatorOfFloat3.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(objectAnimatorOfFloat, animatorSet2);
        animatorSet3.addListener(new C19596a(z11, z12, z13, z14, z15));
        this.f62635i = animatorSet3;
        animatorSet3.start();
    }

    /* JADX INFO: renamed from: d0 */
    static /* synthetic */ void m81706d0(SecondFloorHelper secondFloorHelper, float f11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i11, Object obj) {
        secondFloorHelper.m81704c0(f11, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12, (i11 & 8) != 0 ? false : z13, (i11 & 16) != 0 ? false : z14, (i11 & 32) == 0 ? z15 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public final void m81708e0() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f62627a.f71449d, "translationY", m81694K());
        objectAnimatorOfFloat.setDuration(this.f62629c);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f62627a.f71447b, "translationY", m81694K());
        objectAnimatorOfFloat2.setDuration(this.f62629c);
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        this.f62627a.f71447b.setAlpha(0.0f);
        SecondFloorArcCoverView arcCover = this.f62627a.f71447b;
        Intrinsics.m97801g(arcCover, "arcCover");
        AbstractC26006c.m102058k(arcCover);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f62627a.f71447b, "alpha", 1.0f);
        objectAnimatorOfFloat3.setDuration(this.f62629c);
        objectAnimatorOfFloat3.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat, animatorSet);
        animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: com.transsion.subroom.activity.SecondFloorHelper$startGuideAnimation$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.m97802h(animation, "animation");
                super.onAnimationEnd(animation);
                this.f62659a.f62634h = null;
                SecondFloorHelper secondFloorHelper = this.f62659a;
                secondFloorHelper.f62639m = AbstractC25136k.m99058d(secondFloorHelper.f62638l, null, null, new SecondFloorHelper$startGuideAnimation$1$1$onAnimationEnd$1(this.f62659a, null), 3, null);
            }
        });
        this.f62634h = animatorSet2;
        animatorSet2.start();
    }

    /* JADX INFO: renamed from: f0 */
    private final void m81710f0() {
        AnimatorSet animatorSet = this.f62634h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f62634h = null;
        AnimatorSet animatorSet2 = this.f62635i;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f62635i = null;
        m81687C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Unit m81711g(SecondFloorHelper secondFloorHelper, boolean z11) {
        if (z11) {
            secondFloorHelper.m81742b0();
        } else {
            if (secondFloorHelper.f62643q) {
                secondFloorHelper.m81737W();
            }
            C25639b.m100912d(C25639b.f77786a, secondFloorHelper.f62630d, false, 2, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Unit m81712h(SecondFloorHelper secondFloorHelper) {
        secondFloorHelper.f62649w = true;
        secondFloorHelper.m81739Y(CustomSwipeRefreshLayout.IDLE);
        m81691H(secondFloorHelper, false, 1, null);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: D */
    public final void m81731D() {
        C25639b.f77786a.m100916e(this.f62630d, false);
        this.f62647u = false;
        AbstractC25153o0.m99082d(this.f62638l, null, 1, null);
        m81710f0();
        this.f62627a.f71456k.destroy();
        this.f62626A = null;
    }

    /* JADX INFO: renamed from: N */
    public final void m81732N() {
        this.f62651y++;
        C14496b.f50966a.m65344b().putInt(this.f62650x, this.f62651y);
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m81733Q() {
        return this.f62627a.f71456k.hasAd();
    }

    /* JADX INFO: renamed from: S */
    public final boolean m81734S() {
        int i11 = m81735T() ? 0 : C14496b.f50966a.m65344b().getInt(this.f62650x, 0);
        this.f62651y = i11;
        boolean z11 = i11 < m81695L();
        if (!z11) {
            C25639b.m100912d(C25639b.f77786a, this.f62630d, false, 2, null);
        }
        return z11;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m81735T() {
        C14496b c14496b = C14496b.f50966a;
        long j11 = c14496b.m65344b().getLong("zero_clock_timestamp_SecondFloorGuide", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z11 = jCurrentTimeMillis - j11 >= 86400000;
        if (z11) {
            c14496b.m65344b().putLong("zero_clock_timestamp_SecondFloorGuide", C8113l0.m37947c(jCurrentTimeMillis));
        }
        return z11;
    }

    /* JADX INFO: renamed from: U */
    public final void m81736U(boolean z11, boolean z12) {
        this.f62643q = z11;
        this.f62627a.f71456k.loadAd(z12);
    }

    /* JADX INFO: renamed from: W */
    public final void m81737W() {
        Function0 function0;
        if (this.f62649w || (function0 = this.f62626A) == null) {
            return;
        }
        function0.invoke();
        this.f62626A = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: X */
    public final void m81738X(String action, float f11, float f12) {
        Intrinsics.m97802h(action, "action");
        switch (action.hashCode()) {
            case -1435393951:
                if (action.equals(CustomSwipeRefreshLayout.SECOND_FLOOR)) {
                    this.f62627a.f71456k.adClick();
                    this.f62646t = true;
                    this.f62642p = AbstractC25136k.m99058d(this.f62638l, null, null, new SecondFloorHelper$onAction$4(this, null), 3, null);
                    break;
                }
                break;
            case -1294619603:
                if (action.equals(CustomSwipeRefreshLayout.IDLE_TRIGGER)) {
                    this.f62627a.f71447b.idleTrigger();
                    break;
                }
                break;
            case -659833836:
                if (action.equals(CustomSwipeRefreshLayout.REFRESH_TRIGGER)) {
                    this.f62627a.f71447b.refreshTrigger();
                    break;
                }
                break;
            case 2715:
                if (action.equals(CustomSwipeRefreshLayout.f66441UP)) {
                    this.f62645s = false;
                    break;
                }
                break;
            case 2104482:
                if (action.equals(CustomSwipeRefreshLayout.DOWN)) {
                    m81710f0();
                    break;
                }
                break;
            case 2242516:
                if (action.equals(CustomSwipeRefreshLayout.IDLE)) {
                    this.f62644r = true;
                    m81691H(this, false, 1, null);
                    C25639b.m100912d(C25639b.f77786a, this.f62630d, false, 2, null);
                    break;
                }
                break;
            case 2372561:
                if (action.equals(CustomSwipeRefreshLayout.MOVE)) {
                    if (!this.f62645s) {
                        C25639b c25639b = C25639b.f77786a;
                        if (c25639b.m100914a(this.f62630d)) {
                            this.f62627a.f71456k.showAd();
                            C25639b.m100913g(c25639b, this.f62630d, null, 2, null);
                            this.f62647u = true;
                            this.f62645s = true;
                        }
                    }
                    this.f62627a.f71449d.setTranslationY(f11);
                    SecondFloorArcCoverView secondFloorArcCoverView = this.f62627a.f71447b;
                    secondFloorArcCoverView.setAbMode(CustomSwipeRefreshLayout.INSTANCE.m86999b());
                    secondFloorArcCoverView.setTranslationY(f11);
                    secondFloorArcCoverView.setAlpha(f12);
                    Intrinsics.m97799e(secondFloorArcCoverView);
                    AbstractC26006c.m102058k(secondFloorArcCoverView);
                    break;
                }
                break;
            case 351156154:
                if (action.equals(CustomSwipeRefreshLayout.SECOND_FLOOR_TRIGGER)) {
                    this.f62627a.f71447b.secondFloorTrigger();
                    break;
                }
                break;
            case 784487378:
                if (action.equals(CustomSwipeRefreshLayout.HOVER_FULL)) {
                    this.f62640n = AbstractC25136k.m99058d(this.f62638l, null, null, new SecondFloorHelper$onAction$3(this, null), 3, null);
                    break;
                }
                break;
            case 784527734:
                if (action.equals(CustomSwipeRefreshLayout.HOVER_HALF)) {
                    this.f62640n = AbstractC25136k.m99058d(this.f62638l, null, null, new SecondFloorHelper$onAction$2(this, null), 3, null);
                    break;
                }
                break;
            case 1803427515:
                if (action.equals(CustomSwipeRefreshLayout.REFRESH)) {
                    this.f62646t = true;
                    m81692I();
                    this.f62627a.f71447b.refreshing();
                    this.f62627a.f71456k.refreshing();
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m81739Y(String state) {
        Intrinsics.m97802h(state, "state");
        this.f62637k = state;
        Function1 function1 = this.f62636j;
        if (function1 != null) {
            function1.invoke(state);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m81740Z(Function0 function0) {
        this.f62626A = function0;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m81741a0(Function1 function1) {
        this.f62636j = function1;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m81742b0() {
        if (this.f62643q) {
            if (!C25639b.f77786a.m100914a(this.f62630d)) {
                m81737W();
                return;
            }
            InterfaceC25204t1 interfaceC25204t1 = this.f62639m;
            if (interfaceC25204t1 != null) {
                InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
            }
            this.f62639m = AbstractC25136k.m99058d(this.f62638l, null, null, new SecondFloorHelper$showGuide$1(this, null), 3, null);
        }
    }
}
