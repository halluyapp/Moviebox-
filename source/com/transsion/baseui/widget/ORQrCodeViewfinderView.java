package com.transsion.baseui.widget;

import af.C0105q;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.core.view.InputDeviceCompat;
import com.google.zxing.C11762k;
import com.journeyapps.barcodescanner.CameraPreview;
import com.journeyapps.barcodescanner.ViewfinderView;
import com.transsion.baseui.R$styleable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ORQrCodeViewfinderView extends ViewfinderView {
    public static final long INT_ANIMATION_DELAY = 12;
    public Paint mBitmapPaint;
    public int mLineColor;
    public float mLineDepth;
    public float mLineRate;
    public LinearGradient mLinearGradient;
    public float[] mPositions;
    public float mScanFrameHeight;
    public float mScanFrameWidth;
    public int[] mScanLineColor;
    public float mScanLineDepth;
    public float mScanLineDy;
    public int mScanLinePosition;

    public ORQrCodeViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLineRate = 0.1f;
        this.mLineDepth = m65726b(4);
        this.mScanLinePosition = 0;
        this.mScanLineDepth = m65726b(4);
        this.mScanLineDy = m65726b(3);
        this.mPositions = new float[]{0.0f, 0.5f, 1.0f};
        this.mScanLineColor = new int[]{0, InputDeviceCompat.SOURCE_ANY, 0};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ORQrCodeViewfinderView);
        this.mLineColor = typedArrayObtainStyledAttributes.getColor(R$styleable.ORQrCodeViewfinderView_lineColor, InputDeviceCompat.SOURCE_ANY);
        this.mScanLineColor[1] = typedArrayObtainStyledAttributes.getColor(R$styleable.ORQrCodeViewfinderView_cornerColor, InputDeviceCompat.SOURCE_ANY);
        this.mScanFrameWidth = typedArrayObtainStyledAttributes.getDimension(R$styleable.ORQrCodeViewfinderView_scanFrameWidth, m65726b(160));
        this.mScanFrameHeight = typedArrayObtainStyledAttributes.getDimension(R$styleable.ORQrCodeViewfinderView_scanFrameHeight, m65726b(160));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.mBitmapPaint = paint;
        paint.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: b */
    private int m65726b(int i11) {
        return (int) ((i11 * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // com.journeyapps.barcodescanner.ViewfinderView
    /* JADX INFO: renamed from: a */
    protected void mo53682a() {
        CameraPreview cameraPreview = this.f40750k;
        if (cameraPreview == null) {
            return;
        }
        cameraPreview.setFramingRectSize(new C0105q((int) this.mScanFrameWidth, (int) this.mScanFrameHeight));
        Rect framingRect = this.f40750k.getFramingRect();
        C0105q previewSize = this.f40750k.getPreviewSize();
        if (framingRect == null || previewSize == null) {
            return;
        }
        this.f40751l = framingRect;
        this.f40752m = previewSize;
    }

    @Override // com.journeyapps.barcodescanner.ViewfinderView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        mo53682a();
        Rect rect = this.f40751l;
        if (rect == null || this.f40752m == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        this.f40740a.setColor(this.f40741b != null ? this.f40743d : this.f40742c);
        float f11 = width;
        canvas.drawRect(0.0f, 0.0f, f11, rect.top, this.f40740a);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, this.f40740a);
        canvas.drawRect(rect.right + 1, rect.top, f11, rect.bottom + 1, this.f40740a);
        canvas.drawRect(0.0f, rect.bottom + 1, f11, height, this.f40740a);
        this.f40740a.setColor(this.mLineColor);
        int i11 = rect.left;
        canvas.drawRect(i11, rect.top, i11 + (rect.width() * this.mLineRate), rect.top + this.mLineDepth, this.f40740a);
        int i12 = rect.left;
        int i13 = rect.top;
        canvas.drawRect(i12, i13, this.mLineDepth + i12, i13 + (rect.height() * this.mLineRate), this.f40740a);
        float fWidth = rect.right - (rect.width() * this.mLineRate);
        int i14 = rect.top;
        canvas.drawRect(fWidth, i14, rect.right, i14 + this.mLineDepth, this.f40740a);
        int i15 = rect.right;
        float f12 = i15 - this.mLineDepth;
        int i16 = rect.top;
        canvas.drawRect(f12, i16, i15, i16 + (rect.height() * this.mLineRate), this.f40740a);
        int i17 = rect.left;
        canvas.drawRect(i17, rect.bottom - this.mLineDepth, i17 + (rect.width() * this.mLineRate), rect.bottom, this.f40740a);
        canvas.drawRect(rect.left, rect.bottom - (rect.height() * this.mLineRate), rect.left + this.mLineDepth, rect.bottom, this.f40740a);
        float fWidth2 = rect.right - (rect.width() * this.mLineRate);
        int i18 = rect.bottom;
        canvas.drawRect(fWidth2, i18 - this.mLineDepth, rect.right, i18, this.f40740a);
        canvas.drawRect(rect.right - this.mLineDepth, rect.bottom - (rect.height() * this.mLineRate), rect.right, rect.bottom, this.f40740a);
        if (this.f40741b != null) {
            this.f40740a.setAlpha(160);
            canvas.drawBitmap(this.f40741b, (Rect) null, rect, this.f40740a);
        } else {
            int i19 = (int) (this.mScanLinePosition + this.mScanLineDy);
            this.mScanLinePosition = i19;
            if (i19 >= rect.height()) {
                this.mScanLinePosition = 0;
            }
            float f13 = rect.left;
            int i20 = rect.top;
            int i21 = this.mScanLinePosition;
            LinearGradient linearGradient = new LinearGradient(f13, i20 + i21, rect.right, i20 + i21, this.mScanLineColor, this.mPositions, Shader.TileMode.CLAMP);
            this.mLinearGradient = linearGradient;
            this.f40740a.setShader(linearGradient);
            float f14 = rect.left;
            int i22 = rect.top;
            int i23 = this.mScanLinePosition;
            canvas.drawRect(f14, i22 + i23, rect.right, i22 + i23 + this.mScanLineDepth, this.f40740a);
            this.f40740a.setShader(null);
            float width2 = getWidth() / this.f40752m.f368a;
            float height2 = getHeight() / this.f40752m.f369b;
            if (!this.f40749j.isEmpty()) {
                this.f40740a.setAlpha(80);
                this.f40740a.setColor(this.f40745f);
                for (C11762k c11762k : this.f40749j) {
                    canvas.drawCircle((int) (c11762k.m52137c() * width2), (int) (c11762k.m52138d() * height2), 3.0f, this.f40740a);
                }
                this.f40749j.clear();
            }
            if (!this.f40748i.isEmpty()) {
                this.f40740a.setAlpha(160);
                this.f40740a.setColor(this.f40745f);
                for (C11762k c11762k2 : this.f40748i) {
                    canvas.drawCircle((int) (c11762k2.m52137c() * width2), (int) (c11762k2.m52138d() * height2), 6.0f, this.f40740a);
                }
                List list = this.f40748i;
                List list2 = this.f40749j;
                this.f40748i = list2;
                this.f40749j = list;
                list2.clear();
            }
        }
        postInvalidateDelayed(12L, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
    }
}
