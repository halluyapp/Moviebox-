package com.transsion.audio.view;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes5.dex */
public abstract class FloatingMagnetView extends FrameLayout {
    public static final int MARGIN_EDGE = 13;

    /* JADX INFO: renamed from: a */
    protected MoveAnimator f50516a;

    /* JADX INFO: renamed from: b */
    protected int f50517b;

    /* JADX INFO: renamed from: c */
    private int f50518c;

    /* JADX INFO: renamed from: d */
    private boolean f50519d;

    /* JADX INFO: renamed from: e */
    private float f50520e;

    /* JADX INFO: renamed from: f */
    float f50521f;

    /* JADX INFO: renamed from: g */
    float f50522g;

    protected class MoveAnimator implements Runnable {
        private float destinationX;
        private float destinationY;
        private final Handler handler = new Handler(Looper.getMainLooper());
        private long startingTime;

        protected MoveAnimator() {
        }

        private void stop() {
            this.handler.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (FloatingMagnetView.this.getRootView() == null || FloatingMagnetView.this.getRootView().getParent() == null) {
                return;
            }
            float fMin = Math.min(1.0f, (System.currentTimeMillis() - this.startingTime) / 400.0f);
            FloatingMagnetView.this.m64654g((this.destinationX - FloatingMagnetView.this.getX()) * fMin, (this.destinationY - FloatingMagnetView.this.getY()) * fMin);
            if (fMin < 1.0f) {
                this.handler.post(this);
            }
        }

        void start(float f11, float f12) {
            this.destinationX = f11;
            this.destinationY = f12;
            this.startingTime = System.currentTimeMillis();
            this.handler.post(this);
        }
    }

    protected FloatingMagnetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected FloatingMagnetView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f50519d = true;
        this.f50521f = 0.0f;
        this.f50522g = 0.0f;
        m64651d();
    }

    /* JADX INFO: renamed from: c */
    private void m64650c() {
        this.f50520e = 0.0f;
    }

    /* JADX INFO: renamed from: d */
    private void m64651d() {
        this.f50516a = new MoveAnimator();
        setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m64652e(boolean z11) {
        m64656i();
        m64655h(this.f50519d, z11);
    }

    /* JADX INFO: renamed from: f */
    private void m64653f(boolean z11) {
        if (z11) {
            this.f50520e = getY();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m64654g(float f11, float f12) {
        setX(getX() + f11);
        setY(getY() + f12);
    }

    /* JADX INFO: renamed from: h */
    private void m64655h(boolean z11, boolean z12) {
        float f11 = z11 ? 13.0f : this.f50517b - 13;
        float y11 = getY();
        if (!z12) {
            float f12 = this.f50520e;
            if (f12 != 0.0f) {
                m64650c();
                y11 = f12;
            }
        }
        this.f50516a.start(f11, Math.min(Math.max(0.0f, y11), this.f50518c - getHeight()));
    }

    /* JADX INFO: renamed from: i */
    private void m64656i() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            this.f50517b = viewGroup.getWidth() - getWidth();
            this.f50518c = viewGroup.getHeight();
        }
    }

    abstract void attach(Context context);

    abstract void expanded();

    abstract boolean isPackUp();

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getParent() != null) {
            final boolean z11 = configuration.orientation == 2;
            m64653f(z11);
            ((ViewGroup) getParent()).post(new Runnable() { // from class: com.transsion.audio.view.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50525a.m64652e(z11);
                }
            });
        }
    }

    abstract void onProgress(int i11);

    abstract void onSlideTheLeft();

    abstract void onStateChanged(int i11);

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f50521f = motionEvent.getRawX();
        } else if (action == 2) {
            float rawX = motionEvent.getRawX();
            this.f50522g = rawX;
            float f11 = this.f50521f;
            if (rawX < f11 && Math.abs(rawX - f11) > 50.0f) {
                onSlideTheLeft();
                return true;
            }
        } else if ((action == 1 || action == 3) && Math.abs(motionEvent.getRawX() - this.f50521f) < 10.0f) {
            onViewClick();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    abstract void onViewClick();

    abstract void packUp();

    abstract void packUpAnimation();

    abstract void prepare();

    abstract void setOnOptionListener(EnFloatingView.InterfaceC14262f interfaceC14262f);
}
