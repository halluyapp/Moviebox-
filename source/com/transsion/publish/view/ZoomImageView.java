package com.transsion.publish.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes6.dex */
public class ZoomImageView extends AppCompatImageView implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: d */
    private boolean f58352d;

    /* JADX INFO: renamed from: e */
    private float f58353e;

    /* JADX INFO: renamed from: f */
    private float f58354f;

    /* JADX INFO: renamed from: g */
    private float f58355g;

    /* JADX INFO: renamed from: h */
    private Matrix f58356h;

    /* JADX INFO: renamed from: i */
    private ScaleGestureDetector f58357i;

    /* JADX INFO: renamed from: j */
    private GestureDetector f58358j;

    /* JADX INFO: renamed from: k */
    private boolean f58359k;

    /* JADX INFO: renamed from: l */
    private ValueAnimator f58360l;

    /* JADX INFO: renamed from: m */
    private OverScroller f58361m;

    /* JADX INFO: renamed from: n */
    private int f58362n;

    /* JADX INFO: renamed from: o */
    private int f58363o;

    /* JADX INFO: renamed from: p */
    private ValueAnimator f58364p;

    /* JADX INFO: renamed from: q */
    private View.OnClickListener f58365q;

    /* JADX INFO: renamed from: com.transsion.publish.view.ZoomImageView$a */
    class C17706a extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        C17706a() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            ZoomImageView.this.scale(scaleGestureDetector);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            ZoomImageView.this.scaleEnd(scaleGestureDetector);
        }
    }

    /* JADX INFO: renamed from: com.transsion.publish.view.ZoomImageView$b */
    class C17707b extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: com.transsion.publish.view.ZoomImageView$b$a */
        class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (ZoomImageView.this.f58361m.computeScrollOffset()) {
                    int currX = ZoomImageView.this.f58361m.getCurrX();
                    int i11 = currX - ZoomImageView.this.f58362n;
                    ZoomImageView.this.f58362n = currX;
                    int currY = ZoomImageView.this.f58361m.getCurrY();
                    int i12 = currY - ZoomImageView.this.f58363o;
                    ZoomImageView.this.f58363o = currY;
                    if (i11 == 0 || i12 == 0) {
                        return;
                    }
                    ZoomImageView.this.m75676p(i11, i12);
                }
            }
        }

        C17707b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            ZoomImageView.this.m75675o(motionEvent.getX(), motionEvent.getY());
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
            ZoomImageView.this.f58362n = (int) motionEvent2.getX();
            ZoomImageView.this.f58363o = (int) motionEvent2.getY();
            RectF matrixRectF = ZoomImageView.this.getMatrixRectF();
            if (matrixRectF == null) {
                return false;
            }
            int i11 = ZoomImageView.this.f58362n;
            int i12 = ZoomImageView.this.f58363o;
            int iRound = Math.round(f11);
            int iRound2 = Math.round(f12);
            int iRound3 = Math.round(matrixRectF.width());
            int iRound4 = Math.round(matrixRectF.height());
            if (i11 != iRound3 || i12 != iRound4) {
                ZoomImageView.this.f58361m.fling(i11, i12, iRound, iRound2, 0, iRound3, 0, iRound4, iRound3, iRound4);
            }
            if (ZoomImageView.this.f58364p != null && ZoomImageView.this.f58364p.isStarted()) {
                ZoomImageView.this.f58364p.end();
            }
            ZoomImageView.this.f58364p = ValueAnimator.ofFloat(0.0f, 1.0f);
            ZoomImageView.this.f58364p.setDuration(500L);
            ZoomImageView.this.f58364p.addUpdateListener(new a());
            ZoomImageView.this.f58364p.start();
            return super.onFling(motionEvent, motionEvent2, f11, f12);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
            ZoomImageView.this.m75676p(-f11, -f12);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (ZoomImageView.this.f58365q == null) {
                return true;
            }
            ZoomImageView.this.f58365q.onClick(ZoomImageView.this);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.transsion.publish.view.ZoomImageView$c */
    class C17708c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f58369a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f58370b;

        C17708c(float f11, float f12) {
            this.f58369a = f11;
            this.f58370b = f12;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() / ZoomImageView.this.getScale();
            ZoomImageView.this.f58356h.postScale(fFloatValue, fFloatValue, this.f58369a, this.f58370b);
            ZoomImageView zoomImageView = ZoomImageView.this;
            zoomImageView.setImageMatrix(zoomImageView.f58356h);
            ZoomImageView.this.m75677q();
        }
    }

    public ZoomImageView(Context context) {
        this(context, null);
    }

    public ZoomImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ZoomImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f58352d = true;
        this.f58359k = false;
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f58361m = new OverScroller(context);
        this.f58356h = new Matrix();
        this.f58357i = new ScaleGestureDetector(context, new C17706a());
        this.f58358j = new GestureDetector(context, new C17707b());
    }

    private float getDoubleDrowScale() {
        float scale = getScale();
        if (Math.abs(this.f58353e - scale) < 0.05f) {
            scale = this.f58353e;
        }
        if (Math.abs(this.f58355g - scale) < 0.05f) {
            scale = this.f58355g;
        }
        if (Math.abs(this.f58354f - scale) < 0.05f) {
            scale = this.f58354f;
        }
        float f11 = this.f58355g;
        if (scale == f11) {
            return this.f58359k ? this.f58354f : this.f58353e;
        }
        this.f58359k = scale < f11;
        return f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getMatrixRectF() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        RectF rectF = new RectF(0.0f, 0.0f, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        getImageMatrix().mapRect(rectF);
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getScale() {
        float[] fArr = new float[9];
        this.f58356h.getValues(fArr);
        return fArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public void m75675o(float f11, float f12) {
        ValueAnimator valueAnimator = this.f58360l;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            m75678r(getDoubleDrowScale(), f11, f12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m75676p(float f11, float f12) {
        if (getDrawable() == null) {
            return;
        }
        RectF matrixRectF = getMatrixRectF();
        if (matrixRectF.width() <= getWidth()) {
            f11 = 0.0f;
        }
        if (matrixRectF.height() <= getHeight()) {
            f12 = 0.0f;
        }
        if (f11 == 0.0f && f12 == 0.0f) {
            return;
        }
        this.f58356h.postTranslate(f11, f12);
        setImageMatrix(this.f58356h);
        m75677q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x002f A[PHI: r1
      0x002f: PHI (r1v4 float) = (r1v1 float), (r1v9 float) binds: [B:14:0x003d, B:8:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: q */
    public void m75677q() {
        float f11;
        float f12;
        RectF matrixRectF = getMatrixRectF();
        if (matrixRectF == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float fWidth = matrixRectF.width();
        float fHeight = matrixRectF.height();
        float f13 = matrixRectF.left;
        float f14 = matrixRectF.right;
        float f15 = matrixRectF.top;
        float f16 = matrixRectF.bottom;
        float f17 = 0.0f;
        if (f13 > 0.0f) {
            f11 = width;
            if (fWidth > f11) {
                f12 = -f13;
            } else {
                f12 = ((f11 * 1.0f) / 2.0f) - (((fWidth * 1.0f) / 2.0f) + f13);
            }
        } else {
            f11 = width;
            if (f14 >= f11) {
                f12 = 0.0f;
            } else if (fWidth > f11) {
                f12 = f11 - f14;
            } else {
                f12 = ((f11 * 1.0f) / 2.0f) - (((fWidth * 1.0f) / 2.0f) + f13);
            }
        }
        if (f15 > 0.0f) {
            float f18 = height;
            f17 = fHeight > f18 ? -f15 : ((f18 * 1.0f) / 2.0f) - (f15 + ((fHeight * 1.0f) / 2.0f));
        } else {
            float f19 = height;
            if (f16 < f19) {
                f17 = fHeight > f19 ? f19 - f16 : ((f19 * 1.0f) / 2.0f) - (f15 + ((fHeight * 1.0f) / 2.0f));
            }
        }
        this.f58356h.postTranslate(f12, f17);
        setImageMatrix(this.f58356h);
    }

    /* JADX INFO: renamed from: r */
    private void m75678r(float f11, float f12, float f13) {
        ValueAnimator valueAnimator = this.f58360l;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getScale(), f11);
            this.f58360l = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(300L);
            this.f58360l.setInterpolator(new AccelerateInterpolator());
            this.f58360l.addUpdateListener(new C17708c(f12, f13));
            this.f58360l.start();
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i11) {
        RectF matrixRectF = getMatrixRectF();
        if (matrixRectF == null || matrixRectF.isEmpty()) {
            return false;
        }
        if (i11 > 0) {
            return matrixRectF.right >= ((float) (getWidth() + 1));
        }
        return matrixRectF.left <= -1.0f;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i11) {
        RectF matrixRectF = getMatrixRectF();
        if (matrixRectF == null || matrixRectF.isEmpty()) {
            return false;
        }
        if (i11 > 0) {
            return matrixRectF.bottom >= ((float) (getHeight() + 1));
        }
        return matrixRectF.top <= -1.0f;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (this.f58352d) {
            int width = getWidth();
            int height = getHeight();
            Drawable drawable = getDrawable();
            if (drawable == null) {
                return;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float fMin = (intrinsicWidth <= width || intrinsicHeight > height) ? 1.0f : (width * 1.0f) / intrinsicWidth;
            if (intrinsicWidth <= width && intrinsicHeight > height) {
                fMin = (height * 1.0f) / intrinsicHeight;
            }
            if ((intrinsicWidth <= width && intrinsicHeight <= height) || (intrinsicWidth >= width && intrinsicHeight >= height)) {
                fMin = Math.min((width * 1.0f) / intrinsicWidth, (height * 1.0f) / intrinsicHeight);
            }
            this.f58353e = fMin;
            this.f58355g = fMin * 2.0f;
            this.f58354f = fMin * 4.0f;
            float f11 = (width * 1.0f) / 2.0f;
            float f12 = (height * 1.0f) / 2.0f;
            this.f58356h.postTranslate(f11 - (intrinsicWidth / 2), f12 - (intrinsicHeight / 2));
            Matrix matrix = this.f58356h;
            float f13 = this.f58353e;
            matrix.postScale(f13, f13, f11, f12);
            setImageMatrix(this.f58356h);
            this.f58352d = false;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f58358j.onTouchEvent(motionEvent) | this.f58357i.onTouchEvent(motionEvent);
    }

    public void scale(ScaleGestureDetector scaleGestureDetector) {
        if (getDrawable() == null) {
            return;
        }
        getScale();
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        this.f58356h.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        setImageMatrix(this.f58356h);
        m75677q();
    }

    public void scaleEnd(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor() * getScale();
        float f11 = this.f58353e;
        if (scaleFactor < f11) {
            m75678r(f11, getWidth() / 2, getHeight() / 2);
            return;
        }
        float f12 = this.f58354f;
        if (scaleFactor > f12) {
            m75678r(f12, getWidth() / 2, getHeight() / 2);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f58365q = onClickListener;
    }
}
