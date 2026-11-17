package com.transsion.publish.view.clip;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes6.dex */
public class ClipImageView extends BaseClipImageView implements ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener {
    public static float SCALE_MAX = 4.0f;

    /* JADX INFO: renamed from: t */
    private static float f58372t = 2.0f;

    /* JADX INFO: renamed from: d */
    private float f58373d;

    /* JADX INFO: renamed from: e */
    private boolean f58374e;

    /* JADX INFO: renamed from: f */
    private final float[] f58375f;

    /* JADX INFO: renamed from: g */
    private ScaleGestureDetector f58376g;

    /* JADX INFO: renamed from: h */
    private final Matrix f58377h;

    /* JADX INFO: renamed from: i */
    private GestureDetector f58378i;

    /* JADX INFO: renamed from: j */
    private boolean f58379j;

    /* JADX INFO: renamed from: k */
    private int f58380k;

    /* JADX INFO: renamed from: l */
    private float f58381l;

    /* JADX INFO: renamed from: m */
    private float f58382m;

    /* JADX INFO: renamed from: n */
    private boolean f58383n;

    /* JADX INFO: renamed from: o */
    private int f58384o;

    /* JADX INFO: renamed from: p */
    private int f58385p;

    /* JADX INFO: renamed from: q */
    private int f58386q;

    /* JADX INFO: renamed from: r */
    private int f58387r;

    /* JADX INFO: renamed from: s */
    private int f58388s;

    private class AutoScaleRunnable implements Runnable {
        static final float BIGGER = 1.07f;
        static final float SMALLER = 0.93f;
        private float mTargetScale;
        private float tmpScale;

        /* JADX INFO: renamed from: x */
        private float f58389x;

        /* JADX INFO: renamed from: y */
        private float f58390y;

        public AutoScaleRunnable(float f11, float f12, float f13) {
            this.mTargetScale = f11;
            this.f58389x = f12;
            this.f58390y = f13;
            if (ClipImageView.this.getScale() < this.mTargetScale) {
                this.tmpScale = BIGGER;
            } else {
                this.tmpScale = SMALLER;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Matrix matrix = ClipImageView.this.f58377h;
            float f11 = this.tmpScale;
            matrix.postScale(f11, f11, this.f58389x, this.f58390y);
            ClipImageView.this.m75685g();
            ClipImageView clipImageView = ClipImageView.this;
            clipImageView.setImageMatrix(clipImageView.f58377h);
            float scale = ClipImageView.this.getScale();
            float f12 = this.tmpScale;
            if ((f12 > 1.0f && scale < this.mTargetScale) || (f12 < 1.0f && this.mTargetScale < scale)) {
                ClipImageView.this.postDelayed(this, 16L);
                return;
            }
            float f13 = this.mTargetScale / scale;
            ClipImageView.this.f58377h.postScale(f13, f13, this.f58389x, this.f58390y);
            ClipImageView.this.m75685g();
            ClipImageView clipImageView2 = ClipImageView.this;
            clipImageView2.setImageMatrix(clipImageView2.f58377h);
            ClipImageView.this.f58379j = false;
        }
    }

    /* JADX INFO: renamed from: com.transsion.publish.view.clip.ClipImageView$a */
    class C17709a extends GestureDetector.SimpleOnGestureListener {
        C17709a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (ClipImageView.this.f58379j) {
                return true;
            }
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (ClipImageView.this.getScale() < ClipImageView.f58372t) {
                ClipImageView clipImageView = ClipImageView.this;
                clipImageView.postDelayed(clipImageView.new AutoScaleRunnable(ClipImageView.f58372t, x11, y11), 16L);
                ClipImageView.this.f58379j = true;
            } else {
                ClipImageView clipImageView2 = ClipImageView.this;
                clipImageView2.postDelayed(clipImageView2.new AutoScaleRunnable(clipImageView2.f58373d, x11, y11), 16L);
                ClipImageView.this.f58379j = true;
            }
            return true;
        }
    }

    public ClipImageView(Context context) {
        this(context, null);
    }

    public ClipImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f58373d = 1.0f;
        this.f58374e = true;
        this.f58375f = new float[9];
        this.f58376g = null;
        this.f58377h = new Matrix();
        this.f58385p = 16;
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f58378i = new GestureDetector(context, new C17709a());
        this.f58376g = new ScaleGestureDetector(context, this);
        setOnTouchListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m75685g() {
        float f11;
        RectF matrixRectF = getMatrixRectF();
        int width = getWidth();
        int height = getHeight();
        double dWidth = ((double) matrixRectF.width()) + 0.01d;
        int i11 = this.f58385p;
        float f12 = 0.0f;
        if (dWidth >= width - (i11 * 2)) {
            float f13 = matrixRectF.left;
            f11 = f13 > ((float) i11) ? (-f13) + i11 : 0.0f;
            float f14 = matrixRectF.right;
            if (f14 < width - i11) {
                f11 = (width - i11) - f14;
            }
        } else {
            f11 = 0.0f;
        }
        double dHeight = ((double) matrixRectF.height()) + 0.01d;
        int i12 = this.f58388s;
        if (dHeight >= height - (i12 * 2)) {
            float f15 = matrixRectF.top;
            f12 = f15 > ((float) i12) ? (-f15) + i12 : 0.0f;
            float f16 = matrixRectF.bottom;
            if (f16 < height - i12) {
                f12 = (height - i12) - f16;
            }
        }
        this.f58377h.postTranslate(f11, f12);
    }

    private RectF getMatrixRectF() {
        Matrix matrix = this.f58377h;
        RectF rectF = new RectF();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            matrix.mapRect(rectF);
        }
        return rectF;
    }

    /* JADX INFO: renamed from: h */
    private boolean m75686h(float f11, float f12) {
        return Math.sqrt((double) ((f11 * f11) + (f12 * f12))) >= ((double) this.f58380k);
    }

    public Bitmap clip() {
        return clip(null);
    }

    public Bitmap clip(Rect rect) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        draw(new Canvas(bitmapCreateBitmap));
        if (rect == null) {
            return Bitmap.createBitmap(bitmapCreateBitmap, this.f58385p, this.f58388s, getWidth() - (this.f58385p * 2), getWidth() - (this.f58385p * 2));
        }
        return (rect.width() <= 0 || rect.height() <= 0) ? bitmapCreateBitmap : Bitmap.createBitmap(bitmapCreateBitmap, rect.left, rect.top, rect.width(), rect.height());
    }

    public final float getScale() {
        this.f58377h.getValues(this.f58375f);
        return this.f58375f[0];
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Drawable drawable;
        if (!this.f58374e || (drawable = getDrawable()) == null) {
            return;
        }
        if (this.f58386q == 0) {
            this.f58388s = (getHeight() - (getWidth() - (this.f58385p * 2))) / 2;
        } else {
            this.f58385p = (getWidth() - this.f58386q) / 2;
            this.f58388s = (getHeight() - this.f58387r) / 2;
        }
        float width = getWidth();
        float height = getHeight();
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        float fMax = Math.max((getWidth() - (this.f58385p * 2)) / intrinsicWidth, (getHeight() - (this.f58388s * 2)) / intrinsicHeight);
        this.f58373d = fMax;
        f58372t = fMax * 2.0f;
        SCALE_MAX = 4.0f * fMax;
        this.f58377h.postTranslate((width - intrinsicWidth) / 2.0f, (height - intrinsicHeight) / 2.0f);
        this.f58377h.postScale(fMax, fMax, getWidth() / 2, getHeight() / 2);
        setImageMatrix(this.f58377h);
        this.f58374e = false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scale = getScale();
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (getDrawable() == null) {
            return true;
        }
        float f11 = SCALE_MAX;
        if ((scale < f11 && scaleFactor > 1.0f) || (scale > this.f58373d && scaleFactor < 1.0f)) {
            float f12 = scaleFactor * scale;
            float f13 = this.f58373d;
            if (f12 < f13) {
                scaleFactor = f13 / scale;
            }
            if (scaleFactor * scale > f11) {
                scaleFactor = f11 / scale;
            }
            this.f58377h.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            m75685g();
            setImageMatrix(this.f58377h);
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f58378i.onTouchEvent(motionEvent)) {
            return true;
        }
        this.f58376g.onTouchEvent(motionEvent);
        int pointerCount = motionEvent.getPointerCount();
        float x11 = 0.0f;
        float y11 = 0.0f;
        for (int i11 = 0; i11 < pointerCount; i11++) {
            x11 += motionEvent.getX(i11);
            y11 += motionEvent.getY(i11);
        }
        float f11 = pointerCount;
        float f12 = x11 / f11;
        float f13 = y11 / f11;
        if (pointerCount != this.f58384o) {
            this.f58383n = false;
            this.f58381l = f12;
            this.f58382m = f13;
        }
        this.f58384o = pointerCount;
        int action = motionEvent.getAction();
        if (action == 1) {
            this.f58384o = 0;
        } else if (action == 2) {
            float f14 = f12 - this.f58381l;
            float f15 = f13 - this.f58382m;
            if (!this.f58383n) {
                this.f58383n = m75686h(f14, f15);
            }
            if (this.f58383n && getDrawable() != null) {
                RectF matrixRectF = getMatrixRectF();
                if (matrixRectF.width() <= getWidth() - (this.f58385p * 2)) {
                    f14 = 0.0f;
                }
                this.f58377h.postTranslate(f14, matrixRectF.height() > ((float) (getHeight() - (this.f58388s * 2))) ? f15 : 0.0f);
                m75685g();
                setImageMatrix(this.f58377h);
            }
            this.f58381l = f12;
            this.f58382m = f13;
        } else if (action == 3) {
            this.f58384o = 0;
        }
        return true;
    }

    public void setCropWH(int i11, int i12) {
        this.f58386q = i11;
        this.f58387r = i12;
    }
}
