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
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.transsion.baseui.R$styleable;

/* JADX INFO: loaded from: classes5.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private final Paint f51281a;

    /* JADX INFO: renamed from: b */
    private final C14591b f51282b;

    /* JADX INFO: renamed from: c */
    private boolean f51283c;

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.f51281a = new Paint();
        this.f51282b = new C14591b();
        this.f51283c = true;
        m65792a(context, null);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51281a = new Paint();
        this.f51282b = new C14591b();
        this.f51283c = true;
        m65792a(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f51281a = new Paint();
        this.f51282b = new C14591b();
        this.f51283c = true;
        m65792a(context, attributeSet);
    }

    @TargetApi(21)
    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.f51281a = new Paint();
        this.f51282b = new C14591b();
        this.f51283c = true;
        m65792a(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    private void m65792a(Context context, AttributeSet attributeSet) {
        setLayerType(1, null);
        setWillNotDraw(false);
        this.f51282b.setCallback(this);
        if (attributeSet == null) {
            setShimmer(new C14590a.a().m65801a());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShimmerFrameLayout, 0, 0);
        try {
            setShimmer(((typedArrayObtainStyledAttributes.hasValue(R$styleable.ShimmerFrameLayout_shimmer_colored) && typedArrayObtainStyledAttributes.getBoolean(R$styleable.ShimmerFrameLayout_shimmer_colored, false)) ? new C14590a.c() : new C14590a.a()).mo65802c(typedArrayObtainStyledAttributes).m65801a());
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f51283c) {
            this.f51282b.draw(canvas);
        }
    }

    public void hideShimmer() {
        stopShimmer();
        this.f51283c = false;
        invalidate();
    }

    public boolean isShimmerStarted() {
        return this.f51282b.m65827a();
    }

    public boolean isShimmerVisible() {
        return this.f51283c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f51283c && getVisibility() == 0) {
            this.f51282b.m65828b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopShimmer();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.f51282b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        if (i11 != 0) {
            stopShimmer();
        } else if (this.f51283c && isAttachedToWindow()) {
            this.f51282b.m65828b();
        }
    }

    public ShimmerFrameLayout setShimmer(@Nullable C14590a c14590a) {
        this.f51282b.m65829d(c14590a);
        if (c14590a == null || !c14590a.f51301o) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.f51281a);
        }
        return this;
    }

    public void setShimmerListener(Animator.AnimatorListener animatorListener) {
        this.f51282b.m65830e(animatorListener);
    }

    public void showShimmer(boolean z11) {
        this.f51283c = true;
        if (z11) {
            startShimmer();
        }
        invalidate();
    }

    public void startShimmer() {
        this.f51282b.m65831f();
    }

    public void startShimmer(int i11, AnimatorListenerAdapter animatorListenerAdapter) {
        this.f51282b.m65832g(i11, animatorListenerAdapter);
    }

    public void stopShimmer() {
        this.f51282b.m65833h();
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f51282b;
    }
}
