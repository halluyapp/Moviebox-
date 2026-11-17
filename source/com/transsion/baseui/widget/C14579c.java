package com.transsion.baseui.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.style.ImageSpan;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.baseui.widget.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C14579c extends ImageSpan {

    /* JADX INFO: renamed from: a */
    private final int f51205a;

    /* JADX INFO: renamed from: b */
    private final WeakReference f51206b;

    /* JADX INFO: renamed from: c */
    private final WeakReference f51207c;

    /* JADX INFO: renamed from: d */
    private Animatable f51208d;

    /* JADX INFO: renamed from: e */
    private Rect f51209e;

    /* JADX INFO: renamed from: f */
    private final Handler f51210f;

    /* JADX INFO: renamed from: g */
    private Runnable f51211g;

    /* JADX INFO: renamed from: h */
    private boolean f51212h;

    /* JADX INFO: renamed from: i */
    private final a f51213i;

    /* JADX INFO: renamed from: j */
    private ViewTreeObserver f51214j;

    /* JADX INFO: renamed from: k */
    private final ViewTreeObserver.OnPreDrawListener f51215k;

    /* JADX INFO: renamed from: com.transsion.baseui.widget.c$a */
    public static final class a implements Drawable.Callback {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TextView f51217b;

        a(TextView textView) {
            this.f51217b = textView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:12:0x001c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:13:0x001e  */
        /* JADX INFO: renamed from: b */
        public static final void m65749b(C14579c c14579c, TextView textView) {
            Unit unit;
            if (c14579c.f51212h) {
                c14579c.f51211g = null;
                return;
            }
            Rect rect = c14579c.f51209e;
            if (rect != null) {
                if (textView != null) {
                    textView.invalidate(rect);
                    unit = Unit.f75682a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    if (textView != null) {
                        textView.invalidate();
                        Unit unit2 = Unit.f75682a;
                    }
                }
            } else if (textView != null) {
                textView.invalidate();
                Unit unit3 = Unit.f75682a;
            }
            c14579c.f51211g = null;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable who) {
            Intrinsics.m97802h(who, "who");
            if (C14579c.this.f51212h) {
                return;
            }
            Runnable runnable = C14579c.this.f51211g;
            if (runnable != null) {
                C14579c.this.f51210f.removeCallbacks(runnable);
            }
            final C14579c c14579c = C14579c.this;
            final TextView textView = this.f51217b;
            c14579c.f51211g = new Runnable() { // from class: com.transsion.baseui.widget.b
                @Override // java.lang.Runnable
                public final void run() {
                    C14579c.a.m65749b(c14579c, textView);
                }
            };
            Handler handler = C14579c.this.f51210f;
            Runnable runnable2 = C14579c.this.f51211g;
            Intrinsics.m97799e(runnable2);
            handler.postDelayed(runnable2, 16L);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable who, Runnable what, long j11) {
            Intrinsics.m97802h(who, "who");
            Intrinsics.m97802h(what, "what");
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable who, Runnable what) {
            Intrinsics.m97802h(who, "who");
            Intrinsics.m97802h(what, "what");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C14579c(Drawable drawable, final TextView textView, int i11, int i12) {
        super(drawable, i11);
        Intrinsics.m97802h(drawable, "drawable");
        this.f51205a = i12;
        this.f51206b = textView != null ? new WeakReference(textView) : null;
        this.f51207c = new WeakReference(drawable);
        this.f51210f = new Handler(Looper.getMainLooper());
        a aVar = new a(textView);
        this.f51213i = aVar;
        this.f51215k = new ViewTreeObserver.OnPreDrawListener() { // from class: com.transsion.baseui.widget.a
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return C14579c.m65741i(this.f51201a, textView);
            }
        };
        if (drawable instanceof Animatable) {
            this.f51208d = (Animatable) drawable;
            drawable.setCallback(aVar);
            m65743l();
            m65742j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    private final void m65739g(Drawable drawable) {
        if (drawable instanceof Animatable) {
            if (!Intrinsics.m97797c(drawable.getCallback(), this.f51213i)) {
                drawable.setCallback(this.f51213i);
            }
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                return;
            }
            animatable.start();
        }
    }

    /* JADX INFO: renamed from: h */
    private final TextView m65740h() {
        WeakReference weakReference = this.f51206b;
        if (weakReference != null) {
            return (TextView) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static final boolean m65741i(C14579c c14579c, TextView textView) {
        Drawable drawable = (Drawable) c14579c.f51207c.get();
        if (!(drawable instanceof Animatable) || ((Animatable) drawable).isRunning() || c14579c.f51212h || textView == null || textView.getVisibility() != 0 || !textView.isShown()) {
            return true;
        }
        c14579c.m65739g(drawable);
        return true;
    }

    /* JADX INFO: renamed from: j */
    private final void m65742j() {
        ViewTreeObserver viewTreeObserver;
        TextView textViewM65740h = m65740h();
        if (textViewM65740h == null || (viewTreeObserver = textViewM65740h.getViewTreeObserver()) == null) {
            return;
        }
        if (!viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            this.f51214j = viewTreeObserver;
            viewTreeObserver.addOnPreDrawListener(this.f51215k);
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m65743l() {
        TextView textViewM65740h;
        TextView textViewM65740h2;
        Object obj = (Drawable) this.f51207c.get();
        if ((obj instanceof Animatable) && (textViewM65740h = m65740h()) != null && textViewM65740h.getVisibility() == 0 && (textViewM65740h2 = m65740h()) != null && textViewM65740h2.isShown()) {
            Animatable animatable = (Animatable) obj;
            if (animatable.isRunning()) {
                return;
            }
            animatable.start();
        }
    }

    /* JADX INFO: renamed from: n */
    private final void m65744n() {
        ViewTreeObserver viewTreeObserver = this.f51214j;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                viewTreeObserver = null;
            }
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnPreDrawListener(this.f51215k);
            }
        }
        this.f51214j = null;
    }

    /* JADX INFO: renamed from: o */
    private final void m65745o(float f11, int i11, int i12, int i13, Paint paint, Drawable drawable) {
        int iHeight;
        int verticalAlignment = getVerticalAlignment();
        if (verticalAlignment == 0) {
            iHeight = i13 - drawable.getBounds().bottom;
        } else if (verticalAlignment != 1) {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i14 = fontMetricsInt.descent;
            iHeight = ((i12 + i14) - ((i14 - fontMetricsInt.ascent) / 2)) - (drawable.getBounds().height() / 2);
        } else {
            iHeight = (i12 - drawable.getBounds().bottom) + paint.getFontMetricsInt().descent;
        }
        int i15 = (int) f11;
        this.f51209e = new Rect(i15, iHeight, drawable.getBounds().width() + i15, drawable.getBounds().height() + iHeight);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:32:0x0090  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int i11, int i12, float f11, int i13, int i14, int i15, Paint paint) {
        int iHeight;
        Animatable animatable;
        TextView textViewM65740h;
        Intrinsics.m97802h(canvas, "canvas");
        Intrinsics.m97802h(text, "text");
        Intrinsics.m97802h(paint, "paint");
        Drawable drawable = (Drawable) this.f51207c.get();
        if (drawable == 0) {
            return;
        }
        if (this.f51212h) {
            m65745o(f11, i13, i14, i15, paint, drawable);
            return;
        }
        m65745o(f11, i13, i14, i15, paint, drawable);
        if (drawable instanceof Animatable) {
            TextView textViewM65740h2 = m65740h();
            boolean z11 = textViewM65740h2 != null && textViewM65740h2.getVisibility() == 0 && (textViewM65740h = m65740h()) != null && textViewM65740h.isShown();
            if (z11 && !Intrinsics.m97797c(drawable.getCallback(), this.f51213i)) {
                drawable.setCallback(this.f51213i);
            }
            if (z11) {
                Animatable animatable2 = (Animatable) drawable;
                if (!animatable2.isRunning()) {
                    animatable2.start();
                } else if (!z11) {
                    animatable = (Animatable) drawable;
                    if (animatable.isRunning()) {
                        animatable.stop();
                    }
                }
            } else if (!z11) {
                animatable = (Animatable) drawable;
                if (animatable.isRunning()) {
                    animatable.stop();
                }
            }
        }
        canvas.save();
        int verticalAlignment = getVerticalAlignment();
        if (verticalAlignment == 0) {
            iHeight = i15 - drawable.getBounds().bottom;
        } else if (verticalAlignment != 1) {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i16 = fontMetricsInt.descent;
            iHeight = ((i14 + i16) - ((i16 - fontMetricsInt.ascent) / 2)) - (drawable.getBounds().height() / 2);
        } else {
            iHeight = (i14 - drawable.getBounds().bottom) + paint.getFontMetricsInt().descent;
        }
        canvas.translate(f11, iHeight);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.m97802h(paint, "paint");
        Intrinsics.m97802h(text, "text");
        Drawable drawable = (Drawable) this.f51207c.get();
        if (drawable == null) {
            return 0;
        }
        Rect bounds = drawable.getBounds();
        Intrinsics.m97801g(bounds, "getBounds(...)");
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int verticalAlignment = getVerticalAlignment();
            if (verticalAlignment == 0 || verticalAlignment == 1) {
                fontMetricsInt.ascent = fontMetricsInt2.ascent;
                fontMetricsInt.descent = fontMetricsInt2.descent;
                fontMetricsInt.top = fontMetricsInt2.top;
                fontMetricsInt.bottom = fontMetricsInt2.bottom;
            } else {
                int iHeight = bounds.height() / 2;
                int i13 = (fontMetricsInt2.descent - fontMetricsInt2.ascent) / 4;
                int i14 = (-iHeight) - i13;
                fontMetricsInt.ascent = i14;
                fontMetricsInt.top = i14;
                int i15 = iHeight - i13;
                fontMetricsInt.bottom = i15;
                fontMetricsInt.descent = i15;
            }
        }
        return bounds.right + this.f51205a;
    }

    /* JADX INFO: renamed from: k */
    public final void m65746k() {
        this.f51212h = false;
        Drawable drawable = (Drawable) this.f51207c.get();
        if (drawable != null && !Intrinsics.m97797c(drawable.getCallback(), this.f51213i)) {
            drawable.setCallback(this.f51213i);
        }
        m65743l();
        m65742j();
    }

    /* JADX INFO: renamed from: m */
    public final void m65747m() {
        this.f51212h = true;
        Runnable runnable = this.f51211g;
        if (runnable != null) {
            this.f51210f.removeCallbacks(runnable);
            this.f51211g = null;
        }
        m65744n();
        Animatable animatable = this.f51208d;
        if (animatable != null) {
            animatable.stop();
        }
        Drawable drawable = (Drawable) this.f51207c.get();
        if (drawable == null || !Intrinsics.m97797c(drawable.getCallback(), this.f51213i)) {
            return;
        }
        drawable.setCallback(null);
    }
}
