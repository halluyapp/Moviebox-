package com.transsion.baseui.widget.shimmer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.transsion.baseui.widget.shimmer.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C14591b extends Drawable {

    /* JADX INFO: renamed from: a */
    private final ValueAnimator.AnimatorUpdateListener f51309a = new a();

    /* JADX INFO: renamed from: b */
    private final Paint f51310b;

    /* JADX INFO: renamed from: c */
    private final Rect f51311c;

    /* JADX INFO: renamed from: d */
    private final Matrix f51312d;

    /* JADX INFO: renamed from: e */
    private ValueAnimator f51313e;

    /* JADX INFO: renamed from: f */
    private C14590a f51314f;

    /* JADX INFO: renamed from: com.transsion.baseui.widget.shimmer.b$a */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C14591b.this.invalidateSelf();
        }
    }

    public C14591b() {
        Paint paint = new Paint();
        this.f51310b = paint;
        this.f51311c = new Rect();
        this.f51312d = new Matrix();
        paint.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: c */
    private float m65824c(float f11, float f12, float f13) {
        return f11 + ((f12 - f11) * f13);
    }

    /* JADX INFO: renamed from: i */
    private void m65825i() {
        C14590a c14590a;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (c14590a = this.f51314f) == null) {
            return;
        }
        int iM65797d = c14590a.m65797d(iWidth);
        int iM65794a = this.f51314f.m65794a(iHeight);
        C14590a c14590a2 = this.f51314f;
        boolean z11 = true;
        if (c14590a2.f51293g != 1) {
            int i11 = c14590a2.f51290d;
            if (i11 != 1 && i11 != 3) {
                z11 = false;
            }
            if (z11) {
                iM65797d = 0;
            }
            if (!z11) {
                iM65794a = 0;
            }
            float f11 = iM65794a;
            C14590a c14590a3 = this.f51314f;
            radialGradient = new LinearGradient(0.0f, 0.0f, iM65797d, f11, c14590a3.f51288b, c14590a3.f51287a, Shader.TileMode.CLAMP);
        } else {
            float f12 = iM65794a / 2.0f;
            float fMax = (float) (((double) Math.max(iM65797d, iM65794a)) / Math.sqrt(2.0d));
            C14590a c14590a4 = this.f51314f;
            radialGradient = new RadialGradient(iM65797d / 2.0f, f12, fMax, c14590a4.f51288b, c14590a4.f51287a, Shader.TileMode.CLAMP);
        }
        this.f51310b.setShader(radialGradient);
    }

    /* JADX INFO: renamed from: j */
    private void m65826j() {
        boolean zIsStarted;
        if (this.f51314f == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f51313e;
        if (valueAnimator != null) {
            zIsStarted = valueAnimator.isStarted();
            this.f51313e.cancel();
            this.f51313e.removeAllUpdateListeners();
        } else {
            zIsStarted = false;
        }
        C14590a c14590a = this.f51314f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (c14590a.f51307u / c14590a.f51306t) + 1.0f);
        this.f51313e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setRepeatMode(this.f51314f.f51305s);
        this.f51313e.setRepeatCount(this.f51314f.f51304r);
        ValueAnimator valueAnimator2 = this.f51313e;
        C14590a c14590a2 = this.f51314f;
        valueAnimator2.setDuration(c14590a2.f51306t + c14590a2.f51307u);
        this.f51313e.addUpdateListener(this.f51309a);
        if (zIsStarted) {
            this.f51313e.start();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m65827a() {
        ValueAnimator valueAnimator = this.f51313e;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    /* JADX INFO: renamed from: b */
    void m65828b() {
        C14590a c14590a;
        ValueAnimator valueAnimator = this.f51313e;
        if (valueAnimator == null || valueAnimator.isStarted() || (c14590a = this.f51314f) == null || !c14590a.f51302p || getCallback() == null) {
            return;
        }
        this.f51313e.start();
    }

    /* JADX INFO: renamed from: d */
    public void m65829d(C14590a c14590a) {
        this.f51314f = c14590a;
        if (c14590a != null) {
            this.f51310b.setXfermode(new PorterDuffXfermode(this.f51314f.f51303q ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        m65825i();
        m65826j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float fM65824c;
        float fM65824c2;
        if (this.f51314f == null || this.f51310b.getShader() == null) {
            return;
        }
        float fTan = (float) Math.tan(Math.toRadians(this.f51314f.f51300n));
        float fHeight = this.f51311c.height() + (this.f51311c.width() * fTan);
        float fWidth = this.f51311c.width() + (fTan * this.f51311c.height());
        ValueAnimator valueAnimator = this.f51313e;
        float f11 = 0.0f;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        int i11 = this.f51314f.f51290d;
        if (i11 != 1) {
            if (i11 == 2) {
                fM65824c2 = m65824c(fWidth, -fWidth, animatedFraction);
            } else if (i11 != 3) {
                fM65824c2 = m65824c(-fWidth, fWidth, animatedFraction);
            } else {
                fM65824c = m65824c(fHeight, -fHeight, animatedFraction);
            }
            f11 = fM65824c2;
            fM65824c = 0.0f;
        } else {
            fM65824c = m65824c(-fHeight, fHeight, animatedFraction);
        }
        this.f51312d.reset();
        this.f51312d.setRotate(this.f51314f.f51300n, this.f51311c.width() / 2.0f, this.f51311c.height() / 2.0f);
        this.f51312d.postTranslate(f11, fM65824c);
        this.f51310b.getShader().setLocalMatrix(this.f51312d);
        canvas.drawRect(this.f51311c, this.f51310b);
    }

    /* JADX INFO: renamed from: e */
    public void m65830e(Animator.AnimatorListener animatorListener) {
        ValueAnimator valueAnimator = this.f51313e;
        if (valueAnimator != null) {
            ArrayList<Animator.AnimatorListener> listeners = valueAnimator.getListeners();
            if (listeners != null && listeners.size() > 0) {
                listeners.clear();
            }
            this.f51313e.addListener(animatorListener);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m65831f() {
        if (this.f51313e == null || m65827a() || getCallback() == null) {
            return;
        }
        this.f51313e.start();
    }

    /* JADX INFO: renamed from: g */
    public void m65832g(int i11, AnimatorListenerAdapter animatorListenerAdapter) {
        C14590a c14590a;
        if (m65827a() || getCallback() == null || (c14590a = this.f51314f) == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f51313e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        } else {
            this.f51313e = ValueAnimator.ofFloat(0.0f, (c14590a.f51307u / c14590a.f51306t) + 1.0f);
        }
        this.f51313e.setRepeatMode(this.f51314f.f51305s);
        this.f51313e.setRepeatCount(i11);
        ValueAnimator valueAnimator2 = this.f51313e;
        C14590a c14590a2 = this.f51314f;
        valueAnimator2.setDuration(c14590a2.f51306t + c14590a2.f51307u);
        this.f51313e.addUpdateListener(this.f51309a);
        if (animatorListenerAdapter != null) {
            this.f51313e.addListener(animatorListenerAdapter);
        }
        this.f51313e.start();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        C14590a c14590a = this.f51314f;
        return (c14590a == null || !(c14590a.f51301o || c14590a.f51303q)) ? -1 : -3;
    }

    /* JADX INFO: renamed from: h */
    public void m65833h() {
        if (this.f51313e == null || !m65827a()) {
            return;
        }
        this.f51313e.end();
        this.f51313e.cancel();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f51311c.set(0, 0, rect.width(), rect.height());
        m65825i();
        m65828b();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
