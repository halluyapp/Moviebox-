package com.transsion.publish.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.transsion.publish.R$styleable;

/* JADX INFO: loaded from: classes6.dex */
public class CircleProgressBar extends View {

    /* JADX INFO: renamed from: a */
    private Paint f58292a;

    /* JADX INFO: renamed from: b */
    private Paint f58293b;

    /* JADX INFO: renamed from: c */
    private int f58294c;

    /* JADX INFO: renamed from: d */
    private int f58295d;

    /* JADX INFO: renamed from: e */
    private float f58296e;

    /* JADX INFO: renamed from: f */
    private float f58297f;

    /* JADX INFO: renamed from: g */
    private int f58298g;

    /* JADX INFO: renamed from: h */
    private int f58299h;

    /* JADX INFO: renamed from: i */
    private int f58300i;

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f58298g = 100;
        this.f58300i = 0;
        m75620a(context, attributeSet);
        m75621b();
    }

    /* JADX INFO: renamed from: a */
    private void m75620a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.CircleProgressbar, 0, 0);
        this.f58296e = typedArrayObtainStyledAttributes.getDimension(R$styleable.CircleProgressbar_ra, 80.0f);
        this.f58297f = typedArrayObtainStyledAttributes.getDimension(R$styleable.CircleProgressbar_strokesWidth, 10.0f);
        this.f58294c = typedArrayObtainStyledAttributes.getColor(R$styleable.CircleProgressbar_ringsColor, 16711680);
        this.f58295d = typedArrayObtainStyledAttributes.getColor(R$styleable.CircleProgressbar_textsColor, 16777215);
    }

    /* JADX INFO: renamed from: b */
    private void m75621b() {
        Paint paint = new Paint();
        this.f58292a = paint;
        paint.setAntiAlias(true);
        this.f58292a.setDither(true);
        this.f58292a.setColor(this.f58294c);
        this.f58292a.setStyle(Paint.Style.STROKE);
        this.f58292a.setStrokeCap(Paint.Cap.ROUND);
        this.f58292a.setStrokeWidth(this.f58297f);
        Paint paint2 = new Paint();
        this.f58293b = paint2;
        paint2.setAntiAlias(true);
        this.f58293b.setStyle(Paint.Style.FILL);
        this.f58293b.setColor(this.f58295d);
        this.f58293b.setTextSize(this.f58296e / 2.0f);
        this.f58293b.getFontMetrics();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f58299h >= 0) {
            RectF rectF = new RectF((getWidth() / 2) - this.f58296e, (getHeight() / 2) - this.f58296e, (getWidth() / 2) + this.f58296e, (getHeight() / 2) + this.f58296e);
            canvas.drawArc(rectF, 0.0f, 0.0f, false, this.f58292a);
            canvas.drawArc(rectF, -90.0f, (this.f58299h / this.f58298g) * 360.0f, false, this.f58292a);
        }
    }

    public void setProgress(int i11) {
        this.f58299h = i11;
        postInvalidate();
    }

    public void setRingColor(int i11) {
        this.f58294c = i11;
        this.f58292a.setColor(i11);
        postInvalidate();
    }
}
