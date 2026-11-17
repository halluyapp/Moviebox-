package com.transsion.baseui.dialog;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.collection.AbstractC0585s;
import androidx.compose.foundation.AbstractC0690e;
import androidx.core.app.NotificationCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5806y;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.google.android.material.card.MaterialCardView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baseui.R$style;
import com.transsion.baseui.dialog.BaseSwipeDismissDialog;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001:\u0002|}B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0016J3\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\u0003J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020 H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020 H\u0002¢\u0006\u0004\b(\u0010&J\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\u0003J\u000f\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010\u0003J\u000f\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010\u0003J\u0019\u0010/\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u0019\u00102\u001a\u0002012\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b2\u00103J!\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u0010\u0003J\u0017\u00108\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b8\u0010\bJ\u000f\u00109\u001a\u00020\u0006H\u0004¢\u0006\u0004\b9\u0010\u0003J\u000f\u0010:\u001a\u00020\u0010H\u0014¢\u0006\u0004\b:\u0010\u001fJ\u000f\u0010<\u001a\u00020;H\u0014¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020>H\u0014¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020;H\u0014¢\u0006\u0004\bB\u0010=J\u000f\u0010C\u001a\u00020;H\u0014¢\u0006\u0004\bC\u0010=J\u000f\u0010D\u001a\u00020 H\u0014¢\u0006\u0004\bD\u0010\"J\u000f\u0010E\u001a\u00020;H\u0014¢\u0006\u0004\bE\u0010=J\u000f\u0010F\u001a\u00020;H\u0014¢\u0006\u0004\bF\u0010=J\u000f\u0010G\u001a\u00020;H\u0014¢\u0006\u0004\bG\u0010=J\u0011\u0010H\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\bH\u0010IJ\u0011\u0010J\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\bJ\u0010IJ\u001f\u0010M\u001a\u00020\u00062\u0006\u0010K\u001a\u00020 2\u0006\u0010L\u001a\u00020 H\u0014¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020;H\u0014¢\u0006\u0004\bO\u0010=J\u000f\u0010P\u001a\u00020\u0006H\u0016¢\u0006\u0004\bP\u0010\u0003J\u000f\u0010Q\u001a\u00020\u0006H\u0016¢\u0006\u0004\bQ\u0010\u0003R\u0018\u0010T\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010X\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010\\\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010_\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010b\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010aR\u0016\u0010g\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u001e\u0010o\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u001b\u0010s\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010=R\u001a\u0010y\u001a\u00020t8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u0016\u0010{\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010^¨\u0006~"}, m97100d2 = {"Lcom/transsion/baseui/dialog/BaseSwipeDismissDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "Landroid/view/Window;", "window", "", "O0", "(Landroid/view/Window;)V", "Landroid/view/View;", "root", "l1", "(Landroid/view/View;)Landroid/view/View;", "P0", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "g1", "(Landroid/view/MotionEvent;Landroid/view/View;)Z", "p1", "target", "m1", "(Landroid/view/View;)V", "scrollView", "o1", "disallowParentIntercept", "captureOnDown", "requireNestedScrollAtTop", "e1", "(Landroid/view/MotionEvent;ZZZ)Z", "K0", "()Z", "", "M0", "()F", "k1", "currentRawY", "d1", "(F)V", "velocityY", "c1", "B0", "D0", "L0", "q1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", TmcConstants.NAVIGATION_ON_START, "N0", "F0", "f1", "", "V0", "()I", "Landroidx/core/view/WindowInsetsCompat;", "insets", "h1", "(Landroidx/core/view/WindowInsetsCompat;)V", "S0", "R0", "W0", "a1", "T0", "Y0", "Z0", "()Landroid/view/View;", "i1", "translationY", NotificationCompat.CATEGORY_PROGRESS, "j1", "(FF)V", "U0", "dismissAllowingStateLoss", "onDestroyView", "c", "Landroid/view/View;", "swipeTargetView", "Landroid/view/GestureDetector;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/VelocityTracker;", "e", "Landroid/view/VelocityTracker;", "velocityTracker", "f", "Z", "isDragging", "g", "F", "dragStartY", "h", "currentTranslationY", "i", "I", "activeTouchPointerId", "Landroid/animation/ValueAnimator;", "j", "Landroid/animation/ValueAnimator;", "currentAnimator", "Lkotlin/Function0;", CampaignEx.JSON_KEY_AD_K, "Lkotlin/jvm/functions/Function0;", "onSwipeDismissListener", "l", "Lkotlin/Lazy;", "b1", "touchSlop", "Lcom/transsion/baseui/dialog/BaseSwipeDismissDialog$a;", "m", "Lcom/transsion/baseui/dialog/BaseSwipeDismissDialog$a;", "X0", "()Lcom/transsion/baseui/dialog/BaseSwipeDismissDialog$a;", "swipeConfig", "n", "outsideDismissTapConfigured", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "BaseUI_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public abstract class BaseSwipeDismissDialog extends BaseDialog {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private View swipeTargetView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private GestureDetector gestureDetector;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private VelocityTracker velocityTracker;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isDragging;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float dragStartY;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float currentTranslationY;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private ValueAnimator currentAnimator;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private Function0 onSwipeDismissListener;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean outsideDismissTapConfigured;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int activeTouchPointerId = -1;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final Lazy touchSlop = LazyKt.m97097b(new Function0() { // from class: ek.l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(BaseSwipeDismissDialog.m65485s1(this.f70668a));
        }
    });

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C14518a swipeConfig = new C14518a(0.0f, 0.0f, 0, 0, 0.0f, false, 63, null);

    /* JADX INFO: renamed from: com.transsion.baseui.dialog.BaseSwipeDismissDialog$a */
    public static final class C14518a {

        /* JADX INFO: renamed from: a */
        private final float f51027a;

        /* JADX INFO: renamed from: b */
        private final float f51028b;

        /* JADX INFO: renamed from: c */
        private final long f51029c;

        /* JADX INFO: renamed from: d */
        private final long f51030d;

        /* JADX INFO: renamed from: e */
        private final float f51031e;

        /* JADX INFO: renamed from: f */
        private final boolean f51032f;

        public C14518a() {
            this(0.0f, 0.0f, 0L, 0L, 0.0f, false, 63, null);
        }

        public C14518a(float f11, float f12, long j11, long j12, float f13, boolean z11) {
            this.f51027a = f11;
            this.f51028b = f12;
            this.f51029c = j11;
            this.f51030d = j12;
            this.f51031e = f13;
            this.f51032f = z11;
        }

        public /* synthetic */ C14518a(float f11, float f12, long j11, long j12, float f13, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 200.0f : f11, (i11 & 2) != 0 ? 800.0f : f12, (i11 & 4) != 0 ? 250L : j11, (i11 & 8) != 0 ? 200L : j12, (i11 & 16) != 0 ? 0.6f : f13, (i11 & 32) != 0 ? false : z11);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m65509a() {
            return this.f51032f;
        }

        /* JADX INFO: renamed from: b */
        public final long m65510b() {
            return this.f51030d;
        }

        /* JADX INFO: renamed from: c */
        public final float m65511c() {
            return this.f51027a;
        }

        /* JADX INFO: renamed from: d */
        public final float m65512d() {
            return this.f51028b;
        }

        /* JADX INFO: renamed from: e */
        public final long m65513e() {
            return this.f51029c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14518a)) {
                return false;
            }
            C14518a c14518a = (C14518a) obj;
            return Float.compare(this.f51027a, c14518a.f51027a) == 0 && Float.compare(this.f51028b, c14518a.f51028b) == 0 && this.f51029c == c14518a.f51029c && this.f51030d == c14518a.f51030d && Float.compare(this.f51031e, c14518a.f51031e) == 0 && this.f51032f == c14518a.f51032f;
        }

        public int hashCode() {
            return (((((((((Float.floatToIntBits(this.f51027a) * 31) + Float.floatToIntBits(this.f51028b)) * 31) + AbstractC0585s.m2633a(this.f51029c)) * 31) + AbstractC0585s.m2633a(this.f51030d)) * 31) + Float.floatToIntBits(this.f51031e)) * 31) + AbstractC0690e.m3114a(this.f51032f);
        }

        public String toString() {
            return "SwipeConfig(dismissThreshold=" + this.f51027a + ", dismissVelocity=" + this.f51028b + ", restoreDuration=" + this.f51029c + ", dismissDuration=" + this.f51030d + ", minAlpha=" + this.f51031e + ", dimWithContent=" + this.f51032f + ")";
        }
    }

    /* JADX INFO: renamed from: com.transsion.baseui.dialog.BaseSwipeDismissDialog$b */
    private final class C14519b extends GestureDetector.SimpleOnGestureListener {
        public C14519b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent e11, float f11, float f12) {
            Intrinsics.m97802h(e11, "e2");
            if (!BaseSwipeDismissDialog.this.isDragging || f12 <= BaseSwipeDismissDialog.this.getSwipeConfig().m65512d()) {
                return false;
            }
            BaseSwipeDismissDialog.this.m65452B0();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.transsion.baseui.dialog.BaseSwipeDismissDialog$c */
    public static final class C14520c implements Animator.AnimatorListener {
        public C14520c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Window window;
            Function0 function0 = BaseSwipeDismissDialog.this.onSwipeDismissListener;
            if (function0 != null) {
                function0.invoke();
            }
            Dialog dialog = BaseSwipeDismissDialog.this.getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setWindowAnimations(0);
            }
            BaseSwipeDismissDialog.this.dismissAllowingStateLoss();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.transsion.baseui.dialog.BaseSwipeDismissDialog$d */
    public static final class C14521d implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f51035a;

        public C14521d(View view) {
            this.f51035a = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f51035a.setTranslationY(0.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.transsion.baseui.dialog.BaseSwipeDismissDialog$e */
    public static final class C14522e extends RecyclerView.C4224w {
        C14522e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.C4224w, androidx.recyclerview.widget.RecyclerView.InterfaceC4218q
        /* JADX INFO: renamed from: b */
        public boolean mo20704b(RecyclerView recyclerView, MotionEvent event) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            Intrinsics.m97802h(event, "event");
            return BaseSwipeDismissDialog.this.m65469e1(event, true, false, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public final void m65452B0() {
        final View view = this.swipeTargetView;
        if (view == null) {
            dismissAllowingStateLoss();
            return;
        }
        m65461L0();
        final float translationY = view.getTranslationY();
        final float height = view.getHeight();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(getSwipeConfig().m65510b());
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ek.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseSwipeDismissDialog.m65453C0(view, translationY, height, valueAnimator);
            }
        });
        Intrinsics.m97799e(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new C14520c());
        valueAnimatorOfFloat.start();
        this.currentAnimator = valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final void m65453C0(View view, float f11, float f12, ValueAnimator animator) {
        Intrinsics.m97802h(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.m97800f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setTranslationY(f11 + ((f12 - f11) * ((Float) animatedValue).floatValue()));
    }

    /* JADX INFO: renamed from: D0 */
    private final void m65454D0() {
        final View view = this.swipeTargetView;
        if (view == null) {
            return;
        }
        m65461L0();
        final float translationY = view.getTranslationY();
        if (translationY == 0.0f) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(getSwipeConfig().m65513e());
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ek.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseSwipeDismissDialog.m65455E0(view, translationY, valueAnimator);
            }
        });
        Intrinsics.m97799e(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new C14521d(view));
        valueAnimatorOfFloat.start();
        this.currentAnimator = valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final void m65455E0(View view, float f11, ValueAnimator animator) {
        Intrinsics.m97802h(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.m97800f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setTranslationY(f11 * (1.0f - ((Float) animatedValue).floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    /* JADX INFO: renamed from: G0 */
    public static final Unit m65456G0(BaseSwipeDismissDialog baseSwipeDismissDialog, FrameLayout frameLayout, float f11, View view) {
        Integer numValueOf;
        int iIntValue;
        Window window;
        View decorView;
        Dialog dialog = baseSwipeDismissDialog.getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(decorView.getHeight());
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
        }
        Integer numValueOf2 = Integer.valueOf(frameLayout.getHeight());
        Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = num != null ? num.intValue() : AbstractC5806y.m27487c();
        }
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) (iIntValue * f11), 80));
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final void m65457H0(Function0 function0, BaseSwipeDismissDialog baseSwipeDismissDialog) {
        function0.invoke();
        baseSwipeDismissDialog.m65464P0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final void m65458I0(Function0 function0, BaseSwipeDismissDialog baseSwipeDismissDialog) {
        function0.invoke();
        baseSwipeDismissDialog.m65464P0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final void m65459J0(BaseSwipeDismissDialog baseSwipeDismissDialog) {
        baseSwipeDismissDialog.m65464P0();
    }

    /* JADX INFO: renamed from: K0 */
    private final boolean m65460K0() {
        View viewM65503Z0 = m65503Z0();
        if (viewM65503Z0 instanceof RecyclerView) {
            return !((RecyclerView) viewM65503Z0).canScrollVertically(-1);
        }
        return true;
    }

    /* JADX INFO: renamed from: L0 */
    private final void m65461L0() {
        ValueAnimator valueAnimator = this.currentAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.currentAnimator = null;
    }

    /* JADX INFO: renamed from: M0 */
    private final float m65462M0() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000);
        }
        VelocityTracker velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            return velocityTracker2.getYVelocity();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: O0 */
    private final void m65463O0(Window window) {
        ViewGroup.LayoutParams layoutParams;
        window.setLayout(-1, -1);
        View decorView = window.getDecorView();
        Intrinsics.m97801g(decorView, "getDecorView(...)");
        decorView.setPadding(0, 0, 0, 0);
        if (decorView instanceof ViewGroup) {
            ((ViewGroup) decorView).setClipToPadding(false);
            View viewFindViewById = decorView.findViewById(R.id.content);
            if (viewFindViewById != null) {
                viewFindViewById.setPadding(0, 0, 0, 0);
            }
            if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
                layoutParams.height = -1;
            }
        }
        View view = getView();
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
        } else {
            layoutParams2 = null;
        }
        view.setLayoutParams(layoutParams2);
        view.setPadding(0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: P0 */
    private final void m65464P0() {
        View view;
        if (this.outsideDismissTapConfigured || !m65505f1()) {
            return;
        }
        int iM65499V0 = m65499V0();
        if (iM65499V0 != 0) {
            View view2 = getView();
            view = view2 != null ? view2.findViewById(iM65499V0) : null;
        } else {
            view = getView();
        }
        if (view == null) {
            return;
        }
        view.setClickable(true);
        view.setOnTouchListener(new View.OnTouchListener() { // from class: ek.t
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                return BaseSwipeDismissDialog.m65465Q0(this.f70682a, view3, motionEvent);
            }
        });
        this.outsideDismissTapConfigured = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final boolean m65465Q0(BaseSwipeDismissDialog baseSwipeDismissDialog, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 1) {
            return false;
        }
        Intrinsics.m97799e(motionEvent);
        Intrinsics.m97799e(view);
        if (!baseSwipeDismissDialog.m65470g1(motionEvent, view)) {
            return false;
        }
        baseSwipeDismissDialog.dismissAllowingStateLoss();
        return true;
    }

    /* JADX INFO: renamed from: b1 */
    private final int m65466b1() {
        return ((Number) this.touchSlop.getValue()).intValue();
    }

    /* JADX INFO: renamed from: c1 */
    private final void m65467c1(float velocityY) {
        if (this.currentTranslationY > getSwipeConfig().m65511c() || (this.currentTranslationY > m65466b1() && velocityY > getSwipeConfig().m65512d())) {
            m65452B0();
        } else {
            m65454D0();
        }
    }

    /* JADX INFO: renamed from: d1 */
    private final void m65468d1(float currentRawY) {
        View view;
        Dialog dialog;
        Window window;
        float f11 = currentRawY - this.dragStartY;
        if (f11 >= 0.0f && (view = this.swipeTargetView) != null) {
            this.currentTranslationY = f11;
            view.setTranslationY(f11);
            float fK = RangesKt.m97941k(this.currentTranslationY / (view.getHeight() * 0.5f), 0.0f, 1.0f);
            if (getSwipeConfig().m65509a() && (dialog = getDialog()) != null && (window = dialog.getWindow()) != null) {
                window.setDimAmount((1.0f - fK) * 0.5f);
            }
            m65508j1(this.currentTranslationY, fK);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public final boolean m65469e1(MotionEvent event, boolean disallowParentIntercept, boolean captureOnDown, boolean requireNestedScrollAtTop) {
        View view;
        ViewParent parent;
        ValueAnimator valueAnimator = this.currentAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.activeTouchPointerId = event.getPointerId(0);
            this.dragStartY = event.getRawY();
            this.isDragging = false;
            VelocityTracker velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.velocityTracker = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(event);
            }
            return captureOnDown;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                VelocityTracker velocityTracker2 = this.velocityTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(event);
                }
                float rawY = event.getRawY() - this.dragStartY;
                if (!this.isDragging) {
                    if (rawY <= m65466b1()) {
                        return false;
                    }
                    if (requireNestedScrollAtTop && !m65460K0()) {
                        return false;
                    }
                    this.isDragging = true;
                    m65461L0();
                    if (disallowParentIntercept && (view = this.swipeTargetView) != null && (parent = view.getParent()) != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
                if (!this.isDragging) {
                    return false;
                }
                m65468d1(event.getRawY());
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return false;
                }
                int actionIndex = event.getActionIndex();
                if (event.getPointerId(actionIndex) == this.activeTouchPointerId) {
                    int i11 = actionIndex != 0 ? 0 : 1;
                    if (i11 < event.getPointerCount()) {
                        this.activeTouchPointerId = event.getPointerId(i11);
                        this.dragStartY = event.getY(i11) + (event.getRawY() - event.getY());
                    }
                }
                VelocityTracker velocityTracker3 = this.velocityTracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(event);
                }
                return this.isDragging;
            }
        }
        VelocityTracker velocityTracker4 = this.velocityTracker;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(event);
        }
        if (!this.isDragging) {
            m65471k1();
            return false;
        }
        this.isDragging = false;
        m65467c1(m65462M0());
        m65471k1();
        return true;
    }

    /* JADX INFO: renamed from: g1 */
    private final boolean m65470g1(MotionEvent event, View root) {
        int iM65495R0 = m65495R0();
        View viewFindViewById = iM65495R0 != 0 ? root.findViewById(iM65495R0) : this.swipeTargetView;
        if (viewFindViewById == null) {
            return true;
        }
        return event.getY() < ((float) viewFindViewById.getTop()) + viewFindViewById.getTranslationY();
    }

    /* JADX INFO: renamed from: k1 */
    private final void m65471k1() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.velocityTracker = null;
    }

    /* JADX INFO: renamed from: l1 */
    private final View m65472l1(View root) {
        View viewFindViewById;
        View viewFindViewById2;
        int iM65504a1 = m65504a1();
        if (iM65504a1 != 0 && (viewFindViewById2 = root.findViewById(iM65504a1)) != null) {
            return viewFindViewById2;
        }
        int iM65496S0 = m65496S0();
        return (iM65496S0 == 0 || (viewFindViewById = root.findViewById(iM65496S0)) == null) ? root : viewFindViewById;
    }

    /* JADX INFO: renamed from: m1 */
    private final void m65473m1(View target) {
        target.setOnTouchListener(new View.OnTouchListener() { // from class: ek.s
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return BaseSwipeDismissDialog.m65475n1(this.f70681a, view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final boolean m65475n1(BaseSwipeDismissDialog baseSwipeDismissDialog, View view, MotionEvent motionEvent) {
        Intrinsics.m97799e(motionEvent);
        return baseSwipeDismissDialog.m65469e1(motionEvent, true, true, false);
    }

    /* JADX INFO: renamed from: o1 */
    private final void m65477o1(View scrollView) {
        if (scrollView instanceof RecyclerView) {
            ((RecyclerView) scrollView).addOnItemTouchListener(new C14522e());
        }
    }

    /* JADX INFO: renamed from: p1 */
    private final void m65479p1() {
        View view;
        View viewFindViewById;
        this.gestureDetector = new GestureDetector(requireContext(), new C14519b());
        int iM65502Y0 = m65502Y0();
        if (iM65502Y0 != 0 && (view = getView()) != null && (viewFindViewById = view.findViewById(iM65502Y0)) != null) {
            m65473m1(viewFindViewById);
        }
        View viewM65503Z0 = m65503Z0();
        if (viewM65503Z0 != null) {
            m65477o1(viewM65503Z0);
        }
        View viewM65507i1 = m65507i1();
        if (viewM65507i1 == null || iM65502Y0 != 0) {
            return;
        }
        m65473m1(viewM65507i1);
    }

    /* JADX INFO: renamed from: q1 */
    private final void m65481q1() {
        View view = getView();
        if (view == null) {
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(view, new OnApplyWindowInsetsListener() { // from class: ek.r
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                return BaseSwipeDismissDialog.m65483r1(this.f70680a, view2, windowInsetsCompat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public static final WindowInsetsCompat m65483r1(BaseSwipeDismissDialog baseSwipeDismissDialog, View v11, WindowInsetsCompat insets) {
        Intrinsics.m97802h(v11, "v");
        Intrinsics.m97802h(insets, "insets");
        v11.setPadding(v11.getPaddingLeft(), v11.getPaddingTop(), v11.getPaddingRight(), 0);
        baseSwipeDismissDialog.m65506h1(insets);
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final int m65485s1(BaseSwipeDismissDialog baseSwipeDismissDialog) {
        return ViewConfiguration.get(baseSwipeDismissDialog.requireContext()).getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: F0 */
    protected final void m65493F0() {
        final View viewFindViewById;
        Window window;
        int iM65495R0 = m65495R0();
        if (iM65495R0 == 0) {
            View view = getView();
            if (view != null) {
                view.post(new Runnable() { // from class: ek.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseSwipeDismissDialog.m65459J0(this.f70671a);
                    }
                });
                return;
            }
            return;
        }
        View view2 = getView();
        if (view2 == null || (viewFindViewById = view2.findViewById(iM65495R0)) == null) {
            return;
        }
        ViewParent parent = viewFindViewById.getParent();
        View decorView = null;
        final FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setBackgroundColor(0);
        final float fM65500W0 = m65500W0();
        final Function0 function0 = new Function0() { // from class: ek.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseSwipeDismissDialog.m65456G0(this.f70672a, frameLayout, fM65500W0, viewFindViewById);
            }
        };
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        if (decorView != null && decorView.getHeight() > 0) {
            function0.invoke();
            m65464P0();
        } else if (decorView != null) {
            decorView.post(new Runnable() { // from class: ek.p
                @Override // java.lang.Runnable
                public final void run() {
                    BaseSwipeDismissDialog.m65457H0(function0, this);
                }
            });
        } else {
            frameLayout.post(new Runnable() { // from class: ek.q
                @Override // java.lang.Runnable
                public final void run() {
                    BaseSwipeDismissDialog.m65458I0(function0, this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: N0 */
    protected void m65494N0(Window window) {
        Intrinsics.m97802h(window, "window");
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(201326592);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(m65498U0());
        if (Build.VERSION.SDK_INT >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
    }

    /* JADX INFO: renamed from: R0 */
    protected int m65495R0() {
        return 0;
    }

    /* JADX INFO: renamed from: S0 */
    protected int m65496S0() {
        return 0;
    }

    /* JADX INFO: renamed from: T0 */
    protected int m65497T0() {
        return m65496S0();
    }

    /* JADX INFO: renamed from: U0 */
    protected int m65498U0() {
        return Color.parseColor("#000000");
    }

    /* JADX INFO: renamed from: V0 */
    protected int m65499V0() {
        return 0;
    }

    /* JADX INFO: renamed from: W0 */
    protected float m65500W0() {
        return 0.75f;
    }

    /* JADX INFO: renamed from: X0, reason: from getter */
    protected C14518a getSwipeConfig() {
        return this.swipeConfig;
    }

    /* JADX INFO: renamed from: Y0 */
    protected int m65502Y0() {
        return 0;
    }

    /* JADX INFO: renamed from: Z0 */
    protected View m65503Z0() {
        return null;
    }

    /* JADX INFO: renamed from: a1 */
    protected int m65504a1() {
        int iM65495R0 = m65495R0();
        return iM65495R0 != 0 ? iM65495R0 : m65496S0();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(0);
        }
        super.dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: f1 */
    protected boolean m65505f1() {
        return true;
    }

    /* JADX INFO: renamed from: h1 */
    protected void m65506h1(WindowInsetsCompat insets) {
        View viewFindViewById;
        Intrinsics.m97802h(insets, "insets");
        int iM65497T0 = m65497T0();
        if (iM65497T0 != 0) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(iM65497T0) : null;
        } else {
            viewFindViewById = this.swipeTargetView;
        }
        if (viewFindViewById == null) {
            return;
        }
        int i11 = insets.getInsets(WindowInsetsCompat.Type.ime()).f88818d;
        int i12 = insets.getInsets(WindowInsetsCompat.Type.navigationBars()).f88818d;
        if (i11 <= 0) {
            i11 = i12;
        }
        viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight(), i11);
    }

    /* JADX INFO: renamed from: i1 */
    protected View m65507i1() {
        return null;
    }

    /* JADX INFO: renamed from: j1 */
    protected void m65508j1(float translationY, float progress) {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.SwipeDismissDialogTheme);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.m97801g(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.setCanceledOnTouchOutside(m65505f1());
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setDimAmount(0.5f);
            window.setWindowAnimations(R$style.BaseBottomDialogAnimation);
            window.setGravity(MaterialCardView.CHECKED_ICON_GRAVITY_TOP_START);
            window.setLayout(-1, -1);
            window.setSoftInputMode(48);
            window.setBackgroundDrawable(null);
            m65494N0(window);
        }
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view;
        this.outsideDismissTapConfigured = false;
        int iM65499V0 = m65499V0();
        if (iM65499V0 != 0) {
            View view2 = getView();
            view = view2 != null ? view2.findViewById(iM65499V0) : null;
        } else {
            view = getView();
        }
        if (view != null) {
            view.setOnTouchListener(null);
        }
        m65461L0();
        m65471k1();
        this.gestureDetector = null;
        this.swipeTargetView = null;
        super.onDestroyView();
    }

    @Override // com.transsion.baseui.dialog.BaseDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            m65494N0(window);
            m65463O0(window);
        }
        m65493F0();
        View view = getView();
        if (view != null) {
            ViewCompat.requestApplyInsets(view);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.swipeTargetView = m65472l1(view);
        m65479p1();
        m65481q1();
    }
}
