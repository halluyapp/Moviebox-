package com.transsion.shorttv_pugc.base.widget.shimmer;

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

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.shimmer.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C19266b extends Drawable {

    /* JADX INFO: renamed from: a */
    private final ValueAnimator.AnimatorUpdateListener f61888a = new a();

    /* JADX INFO: renamed from: b */
    private final Paint f61889b;

    /* JADX INFO: renamed from: c */
    private final Rect f61890c;

    /* JADX INFO: renamed from: d */
    private final Matrix f61891d;

    /* JADX INFO: renamed from: e */
    private ValueAnimator f61892e;

    /* JADX INFO: renamed from: f */
    private C19265a f61893f;

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.shimmer.b$a */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C19266b.this.invalidateSelf();
        }
    }

    public C19266b() {
        Paint paint = new Paint();
        this.f61889b = paint;
        this.f61890c = new Rect();
        this.f61891d = new Matrix();
        paint.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: c */
    private float m80684c(float f11, float f12, float f13) {
        return f11 + ((f12 - f11) * f13);
    }

    /* JADX INFO: renamed from: i */
    private void m80685i() {
        C19265a c19265a;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (c19265a = this.f61893f) == null) {
            return;
        }
        int iM80657d = c19265a.m80657d(iWidth);
        int iM80654a = this.f61893f.m80654a(iHeight);
        C19265a c19265a2 = this.f61893f;
        boolean z11 = true;
        if (c19265a2.f61872g != 1) {
            int i11 = c19265a2.f61869d;
            if (i11 != 1 && i11 != 3) {
                z11 = false;
            }
            if (z11) {
                iM80657d = 0;
            }
            if (!z11) {
                iM80654a = 0;
            }
            float f11 = iM80654a;
            C19265a c19265a3 = this.f61893f;
            radialGradient = new LinearGradient(0.0f, 0.0f, iM80657d, f11, c19265a3.f61867b, c19265a3.f61866a, Shader.TileMode.CLAMP);
        } else {
            float f12 = iM80654a / 2.0f;
            float fMax = (float) (((double) Math.max(iM80657d, iM80654a)) / Math.sqrt(2.0d));
            C19265a c19265a4 = this.f61893f;
            radialGradient = new RadialGradient(iM80657d / 2.0f, f12, fMax, c19265a4.f61867b, c19265a4.f61866a, Shader.TileMode.CLAMP);
        }
        this.f61889b.setShader(radialGradient);
    }

    /* JADX INFO: renamed from: j */
    private void m80686j() {
        boolean zIsStarted;
        if (this.f61893f == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f61892e;
        if (valueAnimator != null) {
            zIsStarted = valueAnimator.isStarted();
            this.f61892e.cancel();
            this.f61892e.removeAllUpdateListeners();
        } else {
            zIsStarted = false;
        }
        C19265a c19265a = this.f61893f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (c19265a.f61886u / c19265a.f61885t) + 1.0f);
        this.f61892e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setRepeatMode(this.f61893f.f61884s);
        this.f61892e.setRepeatCount(this.f61893f.f61883r);
        ValueAnimator valueAnimator2 = this.f61892e;
        C19265a c19265a2 = this.f61893f;
        valueAnimator2.setDuration(c19265a2.f61885t + c19265a2.f61886u);
        this.f61892e.addUpdateListener(this.f61888a);
        if (zIsStarted) {
            this.f61892e.start();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m80687a() {
        ValueAnimator valueAnimator = this.f61892e;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    /* JADX INFO: renamed from: b */
    void m80688b() {
        C19265a c19265a;
        ValueAnimator valueAnimator = this.f61892e;
        if (valueAnimator == null || valueAnimator.isStarted() || (c19265a = this.f61893f) == null || !c19265a.f61881p || getCallback() == null) {
            return;
        }
        this.f61892e.start();
    }

    /* JADX INFO: renamed from: d */
    public void m80689d(C19265a c19265a) {
        this.f61893f = c19265a;
        if (c19265a != null) {
            this.f61889b.setXfermode(new PorterDuffXfermode(this.f61893f.f61882q ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        m80685i();
        m80686j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float fM80684c;
        float fM80684c2;
        if (this.f61893f == null || this.f61889b.getShader() == null) {
            return;
        }
        float fTan = (float) Math.tan(Math.toRadians(this.f61893f.f61879n));
        float fHeight = this.f61890c.height() + (this.f61890c.width() * fTan);
        float fWidth = this.f61890c.width() + (fTan * this.f61890c.height());
        ValueAnimator valueAnimator = this.f61892e;
        float f11 = 0.0f;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        int i11 = this.f61893f.f61869d;
        if (i11 != 1) {
            if (i11 == 2) {
                fM80684c2 = m80684c(fWidth, -fWidth, animatedFraction);
            } else if (i11 != 3) {
                fM80684c2 = m80684c(-fWidth, fWidth, animatedFraction);
            } else {
                fM80684c = m80684c(fHeight, -fHeight, animatedFraction);
            }
            f11 = fM80684c2;
            fM80684c = 0.0f;
        } else {
            fM80684c = m80684c(-fHeight, fHeight, animatedFraction);
        }
        this.f61891d.reset();
        this.f61891d.setRotate(this.f61893f.f61879n, this.f61890c.width() / 2.0f, this.f61890c.height() / 2.0f);
        this.f61891d.postTranslate(f11, fM80684c);
        this.f61889b.getShader().setLocalMatrix(this.f61891d);
        canvas.drawRect(this.f61890c, this.f61889b);
    }

    /* JADX INFO: renamed from: e */
    public void m80690e(Animator.AnimatorListener animatorListener) {
        ValueAnimator valueAnimator = this.f61892e;
        if (valueAnimator != null) {
            ArrayList<Animator.AnimatorListener> listeners = valueAnimator.getListeners();
            if (listeners != null && listeners.size() > 0) {
                listeners.clear();
            }
            this.f61892e.addListener(animatorListener);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m80691f() {
        if (this.f61892e == null || m80687a() || getCallback() == null) {
            return;
        }
        this.f61892e.start();
    }

    /* JADX INFO: renamed from: g */
    public void m80692g(int i11, AnimatorListenerAdapter animatorListenerAdapter) {
        C19265a c19265a;
        if (m80687a() || getCallback() == null || (c19265a = this.f61893f) == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f61892e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        } else {
            this.f61892e = ValueAnimator.ofFloat(0.0f, (c19265a.f61886u / c19265a.f61885t) + 1.0f);
        }
        this.f61892e.setRepeatMode(this.f61893f.f61884s);
        this.f61892e.setRepeatCount(i11);
        ValueAnimator valueAnimator2 = this.f61892e;
        C19265a c19265a2 = this.f61893f;
        valueAnimator2.setDuration(c19265a2.f61885t + c19265a2.f61886u);
        this.f61892e.addUpdateListener(this.f61888a);
        if (animatorListenerAdapter != null) {
            this.f61892e.addListener(animatorListenerAdapter);
        }
        this.f61892e.start();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        C19265a c19265a = this.f61893f;
        return (c19265a == null || !(c19265a.f61880o || c19265a.f61882q)) ? -1 : -3;
    }

    /* JADX INFO: renamed from: h */
    public void m80693h() {
        if (this.f61892e == null || !m80687a()) {
            return;
        }
        this.f61892e.end();
        this.f61892e.cancel();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f61890c.set(0, 0, rect.width(), rect.height());
        m80685i();
        m80688b();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
