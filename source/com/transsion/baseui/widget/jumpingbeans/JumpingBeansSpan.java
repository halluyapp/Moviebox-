package com.transsion.baseui.widget.jumpingbeans;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.TextPaint;
import android.text.style.SuperscriptSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
final class JumpingBeansSpan extends SuperscriptSpan implements ValueAnimator.AnimatorUpdateListener {
    private final float animatedRange;
    private final int delay;
    private ValueAnimator jumpAnimator;
    private final int loopDuration;
    private int shift;
    private final WeakReference<TextView> textView;

    /* JADX INFO: renamed from: com.transsion.baseui.widget.jumpingbeans.JumpingBeansSpan$a */
    private static class C14586a implements TimeInterpolator {

        /* JADX INFO: renamed from: a */
        private final float f51248a;

        public C14586a(float f11) {
            this.f51248a = Math.abs(f11);
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float f12 = this.f51248a;
            if (f11 > f12) {
                return 0.0f;
            }
            return (float) Math.sin(((double) (f11 / f12)) * 3.141592653589793d);
        }
    }

    public JumpingBeansSpan(TextView textView, int i11, int i12, int i13, float f11) {
        this.textView = new WeakReference<>(textView);
        this.delay = i13 * i12;
        this.loopDuration = i11;
        this.animatedRange = f11;
    }

    /* JADX INFO: renamed from: a */
    private void m65774a() {
        m65778d();
        Log.w("JumpingBeans", "!!! Remember to call JumpingBeans.stopJumping() when appropriate !!!");
    }

    /* JADX INFO: renamed from: b */
    private void m65775b(float f11) {
        if (this.jumpAnimator != null) {
            return;
        }
        this.shift = 0;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, ((int) f11) / 2);
        this.jumpAnimator = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(this.loopDuration).setStartDelay(this.delay);
        this.jumpAnimator.setInterpolator(new C14586a(this.animatedRange));
        this.jumpAnimator.setRepeatCount(-1);
        this.jumpAnimator.setRepeatMode(1);
        this.jumpAnimator.addUpdateListener(this);
        this.jumpAnimator.start();
    }

    /* JADX INFO: renamed from: c */
    private static boolean m65776c(View view) {
        return view.isAttachedToWindow();
    }

    /* JADX INFO: renamed from: e */
    private void m65777e(ValueAnimator valueAnimator, TextView textView) {
        if (m65776c(textView)) {
            this.shift = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            textView.invalidate();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m65778d() {
        ValueAnimator valueAnimator = this.jumpAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.jumpAnimator.removeAllListeners();
        }
        if (this.textView.get() != null) {
            this.textView.clear();
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        TextView textView = this.textView.get();
        if (textView != null) {
            m65777e(valueAnimator, textView);
        } else {
            m65774a();
        }
    }

    @Override // android.text.style.SuperscriptSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        m65775b(textPaint.ascent());
        textPaint.baselineShift = this.shift;
    }

    @Override // android.text.style.SuperscriptSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        m65775b(textPaint.ascent());
        textPaint.baselineShift = this.shift;
    }
}
