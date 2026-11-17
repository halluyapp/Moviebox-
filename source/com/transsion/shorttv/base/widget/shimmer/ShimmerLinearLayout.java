package com.transsion.shorttv.base.widget.shimmer;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.transsion.shorttv.R$styleable;

/* JADX INFO: loaded from: classes6.dex */
public class ShimmerLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private final Paint f60758a;

    /* JADX INFO: renamed from: b */
    private final C18802b f60759b;

    /* JADX INFO: renamed from: c */
    private boolean f60760c;

    public ShimmerLinearLayout(Context context) {
        super(context);
        this.f60758a = new Paint();
        this.f60759b = new C18802b();
        this.f60760c = true;
        m79226a(context, null);
    }

    public ShimmerLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f60758a = new Paint();
        this.f60759b = new C18802b();
        this.f60760c = true;
        m79226a(context, attributeSet);
    }

    public ShimmerLinearLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f60758a = new Paint();
        this.f60759b = new C18802b();
        this.f60760c = true;
        m79226a(context, attributeSet);
    }

    @TargetApi(21)
    public ShimmerLinearLayout(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.f60758a = new Paint();
        this.f60759b = new C18802b();
        this.f60760c = true;
        m79226a(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    private void m79226a(Context context, AttributeSet attributeSet) {
        setLayerType(1, null);
        setWillNotDraw(false);
        this.f60759b.setCallback(this);
        if (attributeSet == null) {
            setShimmer(new C18801a.a().m79234a());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShortTvShimmerFrameLayout, 0, 0);
        try {
            setShimmer(((typedArrayObtainStyledAttributes.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_colored) && typedArrayObtainStyledAttributes.getBoolean(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_colored, false)) ? new C18801a.c() : new C18801a.a()).mo79235c(typedArrayObtainStyledAttributes).m79234a());
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f60760c) {
            this.f60759b.draw(canvas);
        }
    }

    public void hideShimmer() {
        stopShimmer();
        this.f60760c = false;
        invalidate();
    }

    public boolean isShimmerStarted() {
        return this.f60759b.m79260a();
    }

    public boolean isShimmerVisible() {
        return this.f60760c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f60760c && getVisibility() == 0) {
            this.f60759b.m79261b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopShimmer();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.f60759b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        if (i11 != 0) {
            stopShimmer();
        } else if (this.f60760c && isAttachedToWindow()) {
            this.f60759b.m79261b();
        }
    }

    public ShimmerLinearLayout setShimmer(@Nullable C18801a c18801a) {
        this.f60759b.m79262d(c18801a);
        if (c18801a == null || !c18801a.f60775o) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.f60758a);
        }
        return this;
    }

    public void setShimmerListener(Animator.AnimatorListener animatorListener) {
        this.f60759b.m79263e(animatorListener);
    }

    public void showShimmer(boolean z11) {
        this.f60760c = true;
        if (z11) {
            startShimmer();
        }
        invalidate();
    }

    public void startShimmer() {
        this.f60759b.m79264f();
    }

    public void stopShimmer() {
        this.f60759b.m79266h();
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f60759b;
    }
}
