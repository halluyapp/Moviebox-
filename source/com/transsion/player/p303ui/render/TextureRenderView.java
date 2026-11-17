package com.transsion.player.p303ui.render;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.player.config.RenderType;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p714qo.C27109a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB%\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\fB-\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\rH\u0014¢\u0006\u0004\b&\u0010\u0017R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, m97100d2 = {"Lcom/transsion/player/ui/render/TextureRenderView;", "Landroid/view/TextureView;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/transsion/player/config/RenderType;", "renderType", "(Landroid/content/Context;Lcom/transsion/player/config/RenderType;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/transsion/player/config/RenderType;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/transsion/player/config/RenderType;)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "videoWidth", "videoHeight", "", "setVideoSize", "(II)V", "degree", "setVideoRotation", "(I)V", "Lcom/transsion/player/ui/render/RenderScaleMode;", "scaleType", "setScaleType", "(Lcom/transsion/player/ui/render/RenderScaleMode;)V", "Landroid/graphics/Bitmap;", "doScreenShot", "()Landroid/graphics/Bitmap;", "release", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Lqo/a;", "a", "Lqo/a;", "mMeasureHelper", "Landroid/graphics/SurfaceTexture;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroid/graphics/SurfaceTexture;", "mSurfaceTexture", "Landroid/view/Surface;", "c", "Landroid/view/Surface;", "mSurface", "LibPlayer_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class TextureRenderView extends TextureView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27109a mMeasureHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private SurfaceTexture mSurfaceTexture;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Surface mSurface;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextureRenderView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureRenderView(Context context, AttributeSet attributeSet, int i11, RenderType renderType) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.mMeasureHelper = new C27109a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextureRenderView(Context context, AttributeSet attributeSet, RenderType renderType) {
        this(context, attributeSet, 0, renderType);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextureRenderView(Context context, RenderType renderType) {
        this(context, null, renderType);
        Intrinsics.m97802h(context, "context");
    }

    public Bitmap doScreenShot() {
        return getBitmap();
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int[] iArrM105493a = this.mMeasureHelper.m105493a(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(iArrM105493a[0], iArrM105493a[1]);
    }

    public void release() {
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public void setScaleType(RenderScaleMode scaleType) {
        Intrinsics.m97802h(scaleType, "scaleType");
        this.mMeasureHelper.m105494b(scaleType);
        requestLayout();
    }

    public void setVideoRotation(int degree) {
        this.mMeasureHelper.m105495c(degree);
        setRotation(degree);
    }

    public void setVideoSize(int videoWidth, int videoHeight) {
        if (videoWidth <= 0 || videoHeight <= 0) {
            return;
        }
        this.mMeasureHelper.m105496d(videoWidth, videoHeight);
        requestLayout();
    }
}
