package com.transsion.baseui.widget.shimmer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsion.baseui.R$styleable;

/* JADX INFO: loaded from: classes5.dex */
public class ShimmerConstraintLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: a */
    private final Paint f51278a;

    /* JADX INFO: renamed from: b */
    private final C14591b f51279b;

    /* JADX INFO: renamed from: c */
    private boolean f51280c;

    public ShimmerConstraintLayout(Context context) {
        super(context);
        this.f51278a = new Paint();
        this.f51279b = new C14591b();
        this.f51280c = true;
        init(context, null);
    }

    public ShimmerConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51278a = new Paint();
        this.f51279b = new C14591b();
        this.f51280c = true;
        init(context, attributeSet);
    }

    public ShimmerConstraintLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f51278a = new Paint();
        this.f51279b = new C14591b();
        this.f51280c = true;
        init(context, attributeSet);
    }

    @TargetApi(21)
    public ShimmerConstraintLayout(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.f51278a = new Paint();
        this.f51279b = new C14591b();
        this.f51280c = true;
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        setLayerType(1, null);
        setWillNotDraw(false);
        this.f51279b.setCallback(this);
        if (attributeSet == null) {
            setShimmer(new C14590a.a().m65801a());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShimmerConstraintLayout, 0, 0);
        try {
            setShimmer(((typedArrayObtainStyledAttributes.hasValue(R$styleable.ShimmerConstraintLayout_shimmer_colored) && typedArrayObtainStyledAttributes.getBoolean(R$styleable.ShimmerConstraintLayout_shimmer_colored, false)) ? new C14590a.c() : new C14590a.a()).mo65802c(typedArrayObtainStyledAttributes).m65801a());
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f51280c) {
            this.f51279b.draw(canvas);
        }
    }

    public void hideShimmer() {
        stopShimmer();
        this.f51280c = false;
        invalidate();
    }

    public boolean isShimmerStarted() {
        return this.f51279b.m65827a();
    }

    public boolean isShimmerVisible() {
        return this.f51280c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f51280c && getVisibility() == 0) {
            this.f51279b.m65828b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopShimmer();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.f51279b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        if (i11 != 0) {
            stopShimmer();
        } else if (this.f51280c && isAttachedToWindow()) {
            this.f51279b.m65828b();
        }
    }

    public ShimmerConstraintLayout setShimmer(@Nullable C14590a c14590a) {
        this.f51279b.m65829d(c14590a);
        if (c14590a == null || !c14590a.f51301o) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.f51278a);
        }
        return this;
    }

    public void setShimmerListener(Animator.AnimatorListener animatorListener) {
        this.f51279b.m65830e(animatorListener);
    }

    public void showShimmer(boolean z11) {
        this.f51280c = true;
        if (z11) {
            startShimmer();
        }
        invalidate();
    }

    public void startShimmer() {
        this.f51279b.m65831f();
    }

    public void startShimmer(int i11, AnimatorListenerAdapter animatorListenerAdapter) {
        this.f51279b.m65832g(i11, animatorListenerAdapter);
    }

    public void stopShimmer() {
        this.f51279b.m65833h();
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f51279b;
    }
}
