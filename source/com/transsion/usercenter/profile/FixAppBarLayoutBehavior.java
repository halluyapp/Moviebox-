package com.transsion.usercenter.profile;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.transsion.usercenter.R$id;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
public class FixAppBarLayoutBehavior extends AppBarLayout.Behavior {

    /* JADX INFO: renamed from: A */
    private View f65091A;

    /* JADX INFO: renamed from: B */
    private InterfaceC20627d f65092B;

    /* JADX INFO: renamed from: C */
    private int f65093C;

    /* JADX INFO: renamed from: D */
    private int f65094D;

    /* JADX INFO: renamed from: E */
    private boolean f65095E;

    /* JADX INFO: renamed from: F */
    private VelocityTracker f65096F;

    /* JADX INFO: renamed from: G */
    private int f65097G;

    /* JADX INFO: renamed from: H */
    private RecyclerView f65098H;

    /* JADX INFO: renamed from: q */
    private boolean f65099q;

    /* JADX INFO: renamed from: r */
    private boolean f65100r;

    /* JADX INFO: renamed from: s */
    private float f65101s;

    /* JADX INFO: renamed from: t */
    private float f65102t;

    /* JADX INFO: renamed from: u */
    private int f65103u;

    /* JADX INFO: renamed from: v */
    private int f65104v;

    /* JADX INFO: renamed from: w */
    private int f65105w;

    /* JADX INFO: renamed from: x */
    private int[] f65106x;

    /* JADX INFO: renamed from: y */
    private View f65107y;

    /* JADX INFO: renamed from: z */
    private ViewPager2 f65108z;

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.FixAppBarLayoutBehavior$a */
    class C20624a extends AppBarLayout.Behavior.AbstractC9949a {
        C20624a() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.AbstractC9948c
        /* JADX INFO: renamed from: a */
        public boolean mo45088a(AppBarLayout appBarLayout) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.FixAppBarLayoutBehavior$b */
    class C20625b extends ViewPager2.OnPageChangeCallback {
        C20625b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            super.onPageSelected(i11);
            View childAt = FixAppBarLayoutBehavior.this.f65108z.getChildAt(i11);
            if (childAt != null) {
                FixAppBarLayoutBehavior.this.m85123F0(childAt);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.FixAppBarLayoutBehavior$c */
    class C20626c implements Animator.AnimatorListener {
        C20626c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FixAppBarLayoutBehavior.this.f65100r = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.FixAppBarLayoutBehavior$d */
    public interface InterfaceC20627d {
        /* JADX INFO: renamed from: a */
        void mo85139a(float f11, boolean z11);
    }

    public FixAppBarLayoutBehavior() {
        this.f65100r = false;
        this.f65106x = null;
        this.f65093C = -1;
        this.f65094D = -1;
        this.f65095E = false;
        m85130R0();
    }

    public FixAppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f65100r = false;
        this.f65106x = null;
        this.f65093C = -1;
        this.f65094D = -1;
        this.f65095E = false;
        m85130R0();
    }

    /* JADX INFO: renamed from: D0 */
    private void m85121D0() {
        ViewPager2 viewPager2 = this.f65108z;
        if (viewPager2 != null) {
            viewPager2.registerOnPageChangeCallback(new C20625b());
        }
    }

    /* JADX INFO: renamed from: E0 */
    private boolean m85122E0() {
        RecyclerView.AbstractC4214m layoutManager;
        RecyclerView recyclerView = this.f65098H;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return true;
        }
        View viewFindViewByPosition = layoutManager.findViewByPosition(0);
        return viewFindViewByPosition != null && viewFindViewByPosition.getTop() >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public void m85123F0(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt instanceof RecyclerView) {
                    this.f65098H = (RecyclerView) childAt;
                }
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    private boolean m85124H0() {
        return this.f65107y != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m85125I0(AppBarLayout appBarLayout, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f65107y.setScaleX(fFloatValue);
        this.f65107y.setScaleY(fFloatValue);
        m85127O0(appBarLayout, (int) ((1.0f - valueAnimator.getAnimatedFraction()) * this.f65103u));
        if (this.f65092B != null) {
            this.f65092B.mo85139a(Math.min((fFloatValue - 1.0f) / 0.3f, 1.0f), true);
        }
    }

    /* JADX INFO: renamed from: M0 */
    private boolean m85126M0(AppBarLayout appBarLayout, MotionEvent motionEvent) {
        float yVelocity;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f65094D < 0) {
            this.f65094D = ViewConfiguration.get(appBarLayout.getContext()).getScaledTouchSlop();
        }
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f65096F;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.f65096F.computeCurrentVelocity(1000);
                    yVelocity = this.f65096F.getYVelocity(this.f65093C);
                } else {
                    yVelocity = 0.0f;
                }
                this.f65099q = yVelocity <= 100.0f;
                m85128P0(appBarLayout);
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f65093C);
                if (iFindPointerIndex < 0) {
                    C26866a.f81698a.m104915i("FixAppBarLayoutBehavior", "Error processing scroll; pointer index for id " + this.f65093C + " not found. Did any MotionEvents get skipped?", false);
                } else {
                    int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    int i11 = this.f65097G - y11;
                    if (!this.f65095E) {
                        int iAbs = Math.abs(i11);
                        int i12 = this.f65094D;
                        if (iAbs > i12) {
                            this.f65095E = true;
                            i11 = i11 > 0 ? i11 - i12 : i11 + i12;
                        }
                    }
                    if (this.f65095E) {
                        this.f65097G = y11;
                        if (m85133G0(y11)) {
                            return m85129Q0(appBarLayout, appBarLayout, i11);
                        }
                        if (m85122E0()) {
                            return m85129Q0(appBarLayout, appBarLayout, i11);
                        }
                    }
                }
            } else if (actionMasked == 3) {
            }
            this.f65095E = false;
            this.f65093C = -1;
            VelocityTracker velocityTracker2 = this.f65096F;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f65096F = null;
            }
        } else {
            this.f65093C = motionEvent.getPointerId(0);
            this.f65097G = (int) (motionEvent.getY() + 0.5f);
            if (this.f65096F == null) {
                this.f65096F = VelocityTracker.obtain();
            }
        }
        VelocityTracker velocityTracker3 = this.f65096F;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX INFO: renamed from: O0 */
    private void m85127O0(ViewGroup viewGroup, int i11) {
        int childCount = viewGroup.getChildCount();
        int[] iArr = this.f65106x;
        if (iArr == null || iArr.length != childCount) {
            this.f65106x = new int[childCount];
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = viewGroup.getChildAt(i12);
                if (childAt != null) {
                    this.f65106x[i12] = childAt.getTop();
                } else {
                    this.f65106x[i12] = -1;
                }
            }
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = viewGroup.getChildAt(i13);
            if (childAt2.getId() != R$id.toolbar) {
                if (childAt2.getId() == R$id.collapsing) {
                    m85127O0((ViewGroup) childAt2, i11);
                } else if (this.f65106x[i13] >= 0) {
                    childAt2.getMeasuredHeight();
                    childAt2.setTranslationY(i11);
                }
            }
        }
        ViewPager2 viewPager2 = this.f65108z;
        if (viewPager2 != null) {
            viewPager2.setTranslationY(i11);
        }
    }

    /* JADX INFO: renamed from: P0 */
    private void m85128P0(final AppBarLayout appBarLayout) {
        if (!m85124H0() || this.f65100r || this.f65102t <= 0.0f) {
            return;
        }
        this.f65100r = true;
        this.f65102t = 0.0f;
        if (this.f65099q) {
            ValueAnimator duration = ValueAnimator.ofFloat(this.f65101s, 1.0f).setDuration(300L);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.transsion.usercenter.profile.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f65167a.m85125I0(appBarLayout, valueAnimator);
                }
            });
            duration.addListener(new C20626c());
            duration.start();
            return;
        }
        this.f65107y.setScaleX(1.0f);
        this.f65107y.setScaleY(1.0f);
        m85127O0(appBarLayout, 0);
        this.f65100r = false;
        InterfaceC20627d interfaceC20627d = this.f65092B;
        if (interfaceC20627d != null) {
            interfaceC20627d.mo85139a(0.0f, true);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    private boolean m85129Q0(AppBarLayout appBarLayout, View view, int i11) {
        if (this.f65100r || !m85124H0() || ((i11 >= 0 || appBarLayout.getBottom() < this.f65104v) && (i11 <= 0 || appBarLayout.getBottom() <= this.f65104v))) {
            return false;
        }
        float f11 = this.f65102t + (-i11);
        this.f65102t = f11;
        float fMin = Math.min(f11, 500.0f);
        this.f65102t = fMin;
        float fMax = Math.max(1.0f, (fMin / 500.0f) + 1.0f);
        this.f65101s = fMax;
        this.f65103u = (int) ((this.f65105w / 2) * (fMax - 1.0f));
        this.f65107y.setScaleX(fMax);
        this.f65107y.setScaleY(this.f65101s);
        m85127O0(appBarLayout, this.f65103u);
        view.setScrollY(0);
        if (this.f65092B == null) {
            return true;
        }
        this.f65092B.mo85139a(Math.min((this.f65101s - 1.0f) / 0.3f, 1.0f), false);
        return true;
    }

    /* JADX INFO: renamed from: R0 */
    private void m85130R0() {
        mo45083u0(new C20624a());
    }

    /* JADX INFO: renamed from: T0 */
    private void m85131T0(int i11, AppBarLayout appBarLayout, View view, int i12) {
        if (i12 == 1) {
            int iMo45089E = mo45089E();
            if ((i11 >= 0 || iMo45089E != 0) && (i11 <= 0 || iMo45089E != (-appBarLayout.getTotalScrollRange()))) {
                return;
            }
            ViewCompat.stopNestedScroll(view, 1);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m85133G0(int i11) {
        View view = this.f65091A;
        return view == null || i11 < view.getTop();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    @Override // com.google.android.material.appbar.AppBarLayout.Behavior, com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2319c
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean mo11390k(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int iFindPointerIndex;
        C26866a.f81698a.m104912c("FixAppBarLayoutBehavior", "---onInterceptTouchEvent isOnInterceptTouchEvent: " + super.mo11390k(coordinatorLayout, appBarLayout, motionEvent), false);
        if (!m85124H0()) {
            return super.mo11390k(coordinatorLayout, appBarLayout, motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f65094D < 0) {
            this.f65094D = ViewConfiguration.get(appBarLayout.getContext()).getScaledTouchSlop();
        }
        if (actionMasked == 0) {
            this.f65095E = false;
            if (coordinatorLayout.isPointInChildBounds(appBarLayout, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.f65093C = motionEvent.getPointerId(0);
                this.f65097G = (int) (motionEvent.getY() + 0.5f);
                if (this.f65096F == null) {
                    this.f65096F = VelocityTracker.obtain();
                }
            }
        } else if (actionMasked == 1) {
            this.f65095E = false;
            this.f65093C = -1;
            velocityTracker = this.f65096F;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f65096F = null;
            }
        } else if (actionMasked == 2) {
            int i11 = this.f65093C;
            if (i11 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i11)) >= 0) {
                int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                if (Math.abs(this.f65097G - y11) > this.f65094D) {
                    this.f65095E = true;
                    this.f65097G = y11;
                    return true;
                }
            }
        } else if (actionMasked == 3) {
            this.f65095E = false;
            this.f65093C = -1;
            velocityTracker = this.f65096F;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f65096F = null;
            }
        }
        VelocityTracker velocityTracker2 = this.f65096F;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return super.mo11390k(coordinatorLayout, appBarLayout, motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2319c
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public boolean mo11394o(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, float f11, float f12) {
        if (f12 > 100.0f) {
            this.f65099q = false;
        }
        return super.mo11394o(coordinatorLayout, appBarLayout, view, f11, f12);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2319c
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public void mo11398s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i11, int i12, int i13, int i14, int i15) {
        super.mo11398s(coordinatorLayout, appBarLayout, view, i11, i12, i13, i14, i15);
        m85131T0(i14, appBarLayout, view, i15);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.Behavior, com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2319c
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public boolean mo11379D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, MotionEvent motionEvent) {
        C26866a.f81698a.m104912c("FixAppBarLayoutBehavior", appBarLayout.getScrollY() + "   onTouchEvent " + motionEvent.toString(), false);
        if (m85124H0() && m85126M0(appBarLayout, motionEvent)) {
            return true;
        }
        return super.mo11379D(coordinatorLayout, appBarLayout, motionEvent);
    }

    /* JADX INFO: renamed from: S0 */
    public void m85138S0(InterfaceC20627d interfaceC20627d) {
        this.f65092B = interfaceC20627d;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.C9970i, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2319c
    /* JADX INFO: renamed from: k0 */
    public boolean mo11391l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i11) {
        boolean zMo11391l = super.mo11391l(coordinatorLayout, appBarLayout, i11);
        if (this.f65107y == null) {
            View viewFindViewWithTag = coordinatorLayout.findViewWithTag("largeScale");
            this.f65107y = viewFindViewWithTag;
            if (viewFindViewWithTag != null) {
                appBarLayout.setClipChildren(false);
                this.f65105w = this.f65107y.getHeight();
            }
        }
        if (this.f65108z == null) {
            this.f65108z = (ViewPager2) coordinatorLayout.findViewWithTag("viewPager");
            m85121D0();
        }
        if (this.f65091A == null) {
            this.f65091A = coordinatorLayout.findViewWithTag("emptyView");
        }
        this.f65104v = appBarLayout.getHeight();
        this.f65106x = null;
        return zMo11391l;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2319c
    /* JADX INFO: renamed from: m0 */
    public void mo11396q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i11, int i12, int[] iArr, int i13) {
        if (m85122E0() && m85129Q0(appBarLayout, view, i12)) {
            return;
        }
        super.mo11396q(coordinatorLayout, appBarLayout, view, i11, i12, iArr, i13);
        m85131T0(i12, appBarLayout, view, i13);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2319c
    /* JADX INFO: renamed from: q0 */
    public boolean mo11376A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i11, int i12) {
        this.f65099q = true;
        return super.mo11376A(coordinatorLayout, appBarLayout, view, view2, i11, i12);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2319c
    /* JADX INFO: renamed from: r0 */
    public void mo11378C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i11) {
        if (m85124H0()) {
            m85128P0(appBarLayout);
        }
        super.mo11378C(coordinatorLayout, appBarLayout, view, i11);
    }
}
