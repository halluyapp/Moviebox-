package com.transsion.shorttv.base.widget.shimmer;

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

/* JADX INFO: renamed from: com.transsion.shorttv.base.widget.shimmer.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C18802b extends Drawable {

    /* JADX INFO: renamed from: a */
    private final ValueAnimator.AnimatorUpdateListener f60783a = new a();

    /* JADX INFO: renamed from: b */
    private final Paint f60784b;

    /* JADX INFO: renamed from: c */
    private final Rect f60785c;

    /* JADX INFO: renamed from: d */
    private final Matrix f60786d;

    /* JADX INFO: renamed from: e */
    private ValueAnimator f60787e;

    /* JADX INFO: renamed from: f */
    private C18801a f60788f;

    /* JADX INFO: renamed from: com.transsion.shorttv.base.widget.shimmer.b$a */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C18802b.this.invalidateSelf();
        }
    }

    public C18802b() {
        Paint paint = new Paint();
        this.f60784b = paint;
        this.f60785c = new Rect();
        this.f60786d = new Matrix();
        paint.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: c */
    private float m79257c(float f11, float f12, float f13) {
        return f11 + ((f12 - f11) * f13);
    }

    /* JADX INFO: renamed from: i */
    private void m79258i() {
        C18801a c18801a;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (c18801a = this.f60788f) == null) {
            return;
        }
        int iM79230d = c18801a.m79230d(iWidth);
        int iM79227a = this.f60788f.m79227a(iHeight);
        C18801a c18801a2 = this.f60788f;
        boolean z11 = true;
        if (c18801a2.f60767g != 1) {
            int i11 = c18801a2.f60764d;
            if (i11 != 1 && i11 != 3) {
                z11 = false;
            }
            if (z11) {
                iM79230d = 0;
            }
            if (!z11) {
                iM79227a = 0;
            }
            float f11 = iM79227a;
            C18801a c18801a3 = this.f60788f;
            radialGradient = new LinearGradient(0.0f, 0.0f, iM79230d, f11, c18801a3.f60762b, c18801a3.f60761a, Shader.TileMode.CLAMP);
        } else {
            float f12 = iM79227a / 2.0f;
            float fMax = (float) (((double) Math.max(iM79230d, iM79227a)) / Math.sqrt(2.0d));
            C18801a c18801a4 = this.f60788f;
            radialGradient = new RadialGradient(iM79230d / 2.0f, f12, fMax, c18801a4.f60762b, c18801a4.f60761a, Shader.TileMode.CLAMP);
        }
        this.f60784b.setShader(radialGradient);
    }

    /* JADX INFO: renamed from: j */
    private void m79259j() {
        boolean zIsStarted;
        if (this.f60788f == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f60787e;
        if (valueAnimator != null) {
            zIsStarted = valueAnimator.isStarted();
            this.f60787e.cancel();
            this.f60787e.removeAllUpdateListeners();
        } else {
            zIsStarted = false;
        }
        C18801a c18801a = this.f60788f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (c18801a.f60781u / c18801a.f60780t) + 1.0f);
        this.f60787e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setRepeatMode(this.f60788f.f60779s);
        this.f60787e.setRepeatCount(this.f60788f.f60778r);
        ValueAnimator valueAnimator2 = this.f60787e;
        C18801a c18801a2 = this.f60788f;
        valueAnimator2.setDuration(c18801a2.f60780t + c18801a2.f60781u);
        this.f60787e.addUpdateListener(this.f60783a);
        if (zIsStarted) {
            this.f60787e.start();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m79260a() {
        ValueAnimator valueAnimator = this.f60787e;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    /* JADX INFO: renamed from: b */
    void m79261b() {
        C18801a c18801a;
        ValueAnimator valueAnimator = this.f60787e;
        if (valueAnimator == null || valueAnimator.isStarted() || (c18801a = this.f60788f) == null || !c18801a.f60776p || getCallback() == null) {
            return;
        }
        this.f60787e.start();
    }

    /* JADX INFO: renamed from: d */
    public void m79262d(C18801a c18801a) {
        this.f60788f = c18801a;
        if (c18801a != null) {
            this.f60784b.setXfermode(new PorterDuffXfermode(this.f60788f.f60777q ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        m79258i();
        m79259j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float fM79257c;
        float fM79257c2;
        if (this.f60788f == null || this.f60784b.getShader() == null) {
            return;
        }
        float fTan = (float) Math.tan(Math.toRadians(this.f60788f.f60774n));
        float fHeight = this.f60785c.height() + (this.f60785c.width() * fTan);
        float fWidth = this.f60785c.width() + (fTan * this.f60785c.height());
        ValueAnimator valueAnimator = this.f60787e;
        float f11 = 0.0f;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        int i11 = this.f60788f.f60764d;
        if (i11 != 1) {
            if (i11 == 2) {
                fM79257c2 = m79257c(fWidth, -fWidth, animatedFraction);
            } else if (i11 != 3) {
                fM79257c2 = m79257c(-fWidth, fWidth, animatedFraction);
            } else {
                fM79257c = m79257c(fHeight, -fHeight, animatedFraction);
            }
            f11 = fM79257c2;
            fM79257c = 0.0f;
        } else {
            fM79257c = m79257c(-fHeight, fHeight, animatedFraction);
        }
        this.f60786d.reset();
        this.f60786d.setRotate(this.f60788f.f60774n, this.f60785c.width() / 2.0f, this.f60785c.height() / 2.0f);
        this.f60786d.postTranslate(f11, fM79257c);
        this.f60784b.getShader().setLocalMatrix(this.f60786d);
        canvas.drawRect(this.f60785c, this.f60784b);
    }

    /* JADX INFO: renamed from: e */
    public void m79263e(Animator.AnimatorListener animatorListener) {
        ValueAnimator valueAnimator = this.f60787e;
        if (valueAnimator != null) {
            ArrayList<Animator.AnimatorListener> listeners = valueAnimator.getListeners();
            if (listeners != null && listeners.size() > 0) {
                listeners.clear();
            }
            this.f60787e.addListener(animatorListener);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m79264f() {
        if (this.f60787e == null || m79260a() || getCallback() == null) {
            return;
        }
        this.f60787e.start();
    }

    /* JADX INFO: renamed from: g */
    public void m79265g(int i11, AnimatorListenerAdapter animatorListenerAdapter) {
        C18801a c18801a;
        if (m79260a() || getCallback() == null || (c18801a = this.f60788f) == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f60787e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        } else {
            this.f60787e = ValueAnimator.ofFloat(0.0f, (c18801a.f60781u / c18801a.f60780t) + 1.0f);
        }
        this.f60787e.setRepeatMode(this.f60788f.f60779s);
        this.f60787e.setRepeatCount(i11);
        ValueAnimator valueAnimator2 = this.f60787e;
        C18801a c18801a2 = this.f60788f;
        valueAnimator2.setDuration(c18801a2.f60780t + c18801a2.f60781u);
        this.f60787e.addUpdateListener(this.f60783a);
        if (animatorListenerAdapter != null) {
            this.f60787e.addListener(animatorListenerAdapter);
        }
        this.f60787e.start();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        C18801a c18801a = this.f60788f;
        return (c18801a == null || !(c18801a.f60775o || c18801a.f60777q)) ? -1 : -3;
    }

    /* JADX INFO: renamed from: h */
    public void m79266h() {
        if (this.f60787e == null || !m79260a()) {
            return;
        }
        this.f60787e.end();
        this.f60787e.cancel();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f60785c.set(0, 0, rect.width(), rect.height());
        m79258i();
        m79261b();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
