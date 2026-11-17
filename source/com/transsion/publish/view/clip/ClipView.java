package com.transsion.publish.view.clip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.AbstractC2397b;
import com.transsion.publish.R$color;
import p655op.C26375b;

/* JADX INFO: loaded from: classes6.dex */
public class ClipView extends View {
    public static final int BORDERDISTANCE = 0;
    public static final int CIRCLE_ZOOM = 3;
    public static final int CIRCULAR = 0;
    public static final int RECTANGULAR = 1;
    public static int TYPE_START = 0;
    public static int mHorizontalPadding = 16;

    /* JADX INFO: renamed from: a */
    private Paint f58392a;

    /* JADX INFO: renamed from: b */
    private Context f58393b;

    /* JADX INFO: renamed from: c */
    private int f58394c;

    /* JADX INFO: renamed from: d */
    private int f58395d;

    /* JADX INFO: renamed from: e */
    private int f58396e;

    /* JADX INFO: renamed from: f */
    private int f58397f;

    /* JADX INFO: renamed from: g */
    private int f58398g;

    /* JADX INFO: renamed from: h */
    private int f58399h;

    /* JADX INFO: renamed from: i */
    private boolean f58400i;
    public int innerCircle;

    /* JADX INFO: renamed from: j */
    private boolean f58401j;

    /* JADX INFO: renamed from: k */
    private boolean f58402k;

    public ClipView(Context context) {
        this(context, null);
        this.f58393b = context;
    }

    public ClipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f58393b = context;
    }

    public ClipView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.innerCircle = getWidth() / 3;
        this.f58400i = true;
        this.f58401j = true;
        this.f58402k = true;
        this.f58392a = new Paint();
        this.f58393b = context;
    }

    public static int dip2px(Context context, float f11) {
        return (int) ((f11 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public int cropHeight() {
        return this.f58395d;
    }

    public int cropWidth() {
        return this.f58394c;
    }

    public int getInnerCircle() {
        return this.innerCircle;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i11;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        int i12 = this.f58394c;
        if (i12 <= 0 || (i11 = this.f58395d) <= 0 || width <= 0 || height <= 0) {
            if (TYPE_START == 0) {
                this.innerCircle = width / 3;
                this.f58392a.setColor(0);
                this.f58392a.setDither(true);
                this.f58392a.setAntiAlias(true);
                this.f58392a.setStyle(Paint.Style.STROKE);
                int i13 = width / 2;
                float f11 = i13;
                int i14 = height / 2;
                float f12 = i14;
                canvas.drawCircle(f11, f12, i13 - mHorizontalPadding, this.f58392a);
                this.f58392a.setColor(AbstractC2397b.getColor(getContext(), R$color.cl31_50_p));
                this.f58392a.setStrokeWidth(height);
                canvas.drawCircle(f11, f12, (i13 - mHorizontalPadding) + i14, this.f58392a);
                return;
            }
            this.f58392a.setColor(AbstractC2397b.getColor(getContext(), R$color.cl31_50_p));
            float f13 = width;
            float f14 = (height - width) / 2;
            canvas.drawRect(0.0f, 0.0f, f13, f14, this.f58392a);
            float f15 = (height + width) / 2;
            canvas.drawRect(0.0f, f15, f13, height, this.f58392a);
            canvas.drawRect(0.0f, f14, 0.0f, f15, this.f58392a);
            canvas.drawRect(width, f14, f13, f15, this.f58392a);
            this.f58392a.setColor(-1);
            this.f58392a.setStrokeWidth(2.0f);
            float f16 = width;
            canvas.drawLine(0.0f, f14, f16, f14, this.f58392a);
            canvas.drawLine(0.0f, f15, f16, f15, this.f58392a);
            canvas.drawLine(0.0f, f14, 0.0f, f15, this.f58392a);
            canvas.drawLine(f16, f14, f16, f15, this.f58392a);
            return;
        }
        if (this.f58400i) {
            int[] iArrM102979a = this.f58402k ? C26375b.m102979a(this.f58393b, i12, i11, width, height) : C26375b.m102980b(this.f58393b, i12, i11, width, height, 1.0f);
            this.f58394c = iArrM102979a[0];
            this.f58395d = iArrM102979a[1];
        }
        int i15 = (width - this.f58394c) / 2;
        int i16 = (height - this.f58395d) / 2;
        this.f58392a.setColor(AbstractC2397b.getColor(getContext(), R$color.cl31_50_p));
        float f17 = width;
        float f18 = i16;
        canvas.drawRect(0.0f, 0.0f, f17, f18, this.f58392a);
        canvas.drawRect(0.0f, this.f58395d + i16, f17, height, this.f58392a);
        canvas.drawRect(0.0f, f18, i15, this.f58395d + i16, this.f58392a);
        canvas.drawRect(this.f58394c + i15, f18, f17, this.f58395d + i16, this.f58392a);
        this.f58392a.setColor(AbstractC2397b.getColor(getContext(), com.p282tn.lib.widget.R$color.white));
        this.f58392a.setStrokeWidth(1);
        this.f58396e = i15;
        this.f58397f = i16;
        int i17 = this.f58394c + i15;
        this.f58398g = i17;
        if (this.f58402k) {
            this.f58399h = this.f58395d + i16;
        } else {
            this.f58399h = this.f58395d - (i16 != 0 ? i16 : 1);
        }
        if (this.f58401j) {
            canvas.drawLine(i15, i16, i17, i16, this.f58392a);
            float f19 = this.f58396e;
            int i18 = this.f58399h;
            canvas.drawLine(f19, i18, this.f58398g, i18, this.f58392a);
            int i19 = this.f58396e;
            canvas.drawLine(i19, this.f58397f, i19, this.f58399h, this.f58392a);
            int i20 = this.f58398g;
            canvas.drawLine(i20, this.f58397f, i20, this.f58399h, this.f58392a);
        }
    }

    public Rect rect() {
        return new Rect(this.f58396e, this.f58397f, this.f58398g, this.f58399h);
    }

    public void setFullScreen(boolean z11) {
        this.f58402k = z11;
    }

    public void setNeedDivider(boolean z11) {
        this.f58401j = z11;
    }

    public void setSizeNeedChange(boolean z11) {
        this.f58400i = z11;
        invalidate();
    }

    public void setStart(int i11) {
        TYPE_START = i11;
    }

    public void setStartWH(int i11, int i12) {
        this.f58394c = i11;
        this.f58395d = i12;
    }
}
