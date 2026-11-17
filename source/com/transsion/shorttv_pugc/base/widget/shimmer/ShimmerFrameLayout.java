package com.transsion.shorttv_pugc.base.widget.shimmer;

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
import com.transsion.shorttv.R$styleable;

/* JADX INFO: loaded from: classes6.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private final Paint f61860a;

    /* JADX INFO: renamed from: b */
    private final C19266b f61861b;

    /* JADX INFO: renamed from: c */
    private boolean f61862c;

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.f61860a = new Paint();
        this.f61861b = new C19266b();
        this.f61862c = true;
        m80652a(context, null);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61860a = new Paint();
        this.f61861b = new C19266b();
        this.f61862c = true;
        m80652a(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f61860a = new Paint();
        this.f61861b = new C19266b();
        this.f61862c = true;
        m80652a(context, attributeSet);
    }

    @TargetApi(21)
    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.f61860a = new Paint();
        this.f61861b = new C19266b();
        this.f61862c = true;
        m80652a(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    private void m80652a(Context context, AttributeSet attributeSet) {
        setLayerType(1, null);
        setWillNotDraw(false);
        this.f61861b.setCallback(this);
        if (attributeSet == null) {
            setShimmer(new C19265a.a().m80661a());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShortTvShimmerFrameLayout, 0, 0);
        try {
            setShimmer(((typedArrayObtainStyledAttributes.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_colored) && typedArrayObtainStyledAttributes.getBoolean(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_colored, false)) ? new C19265a.c() : new C19265a.a()).mo80662c(typedArrayObtainStyledAttributes).m80661a());
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f61862c) {
            this.f61861b.draw(canvas);
        }
    }

    public void hideShimmer() {
        stopShimmer();
        this.f61862c = false;
        invalidate();
    }

    public boolean isShimmerStarted() {
        return this.f61861b.m80687a();
    }

    public boolean isShimmerVisible() {
        return this.f61862c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f61862c && getVisibility() == 0) {
            this.f61861b.m80688b();
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
        this.f61861b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        if (i11 != 0) {
            stopShimmer();
        } else if (this.f61862c && isAttachedToWindow()) {
            this.f61861b.m80688b();
        }
    }

    public ShimmerFrameLayout setShimmer(@Nullable C19265a c19265a) {
        this.f61861b.m80689d(c19265a);
        if (c19265a == null || !c19265a.f61880o) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.f61860a);
        }
        return this;
    }

    public void setShimmerListener(Animator.AnimatorListener animatorListener) {
        this.f61861b.m80690e(animatorListener);
    }

    public void showShimmer(boolean z11) {
        this.f61862c = true;
        if (z11) {
            startShimmer();
        }
        invalidate();
    }

    public void startShimmer() {
        this.f61861b.m80691f();
    }

    public void startShimmer(int i11, AnimatorListenerAdapter animatorListenerAdapter) {
        this.f61861b.m80692g(i11, animatorListenerAdapter);
    }

    public void stopShimmer() {
        this.f61861b.m80693h();
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f61861b;
    }
}
