package com.transsion.rewardscenter.task.p308ad;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.content.AbstractC2397b;
import androidx.core.view.GravityCompat;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.transsion.rewardscenter.R$color;
import com.transsion.rewardscenter.R$mipmap;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p986zp.C29221j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\fJ\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\fJ\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u001b¢\u0006\u0004\b$\u0010\u001eJ\u0015\u0010%\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b%\u0010\u001aJ\u0015\u0010&\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b&\u0010\u001eJ\u0017\u0010'\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b'\u0010\"J\u0015\u0010(\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u001b¢\u0006\u0004\b(\u0010\u001eJ\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\b*\u0010\u001aJ\u0015\u0010+\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\b+\u0010\u001aJ\r\u0010,\u001a\u00020\n¢\u0006\u0004\b,\u0010\fJ\r\u0010-\u001a\u00020\n¢\u0006\u0004\b-\u0010\fJ\u000f\u0010.\u001a\u00020\nH\u0014¢\u0006\u0004\b.\u0010\fJ\u0017\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010\u001aR\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R\u0016\u0010;\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00106R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00106R\u0016\u0010?\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00106R#\u0010F\u001a\n A*\u0004\u0018\u00010@0@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006G"}, m97100d2 = {"Lcom/transsion/rewardscenter/task/ad/StageTaskProgressLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "m", "()V", "Landroid/widget/ProgressBar;", "progressBar", "backgroundColor", "progressColor", "n", "(Landroid/widget/ProgressBar;II)V", "Landroid/graphics/drawable/LayerDrawable;", "l", "(II)Landroid/graphics/drawable/LayerDrawable;", "startFirstStageAnimation", "stopFirstStageAnimation", NotificationCompat.CATEGORY_PROGRESS, "setFirstStageProgress", "(I)V", "", MimeTypes.BASE_TYPE_TEXT, "setFirstStageText", "(Ljava/lang/String;)V", "", "defaultIcon", "setFirstStagePointIcon", "(Z)V", "points", "setFirstStagePoints", "setSecondStageProgress", "setSecondStageText", "setSecondStagePointIcon", "setSecondStagePoints", TtmlNode.ATTR_TTS_COLOR, "setTitleTextColor", "setPointTextColor", CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, "reset", "onDetachedFromWindow", "layoutDirection", "onRtlPropertiesChanged", "Lzp/j;", "a", "Lzp/j;", "binding", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "I", "colorBackground", "c", "colorProgress", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "colorCompleted", "e", "colorTitle", "f", "colorPoint", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "g", "Lkotlin/Lazy;", "getAnimator", "()Landroid/animation/ValueAnimator;", "animator", "RewardsCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class StageTaskProgressLayout extends ConstraintLayout {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C29221j binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int colorBackground;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int colorProgress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int colorCompleted;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int colorTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int colorPoint;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy animator;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StageTaskProgressLayout(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StageTaskProgressLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StageTaskProgressLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.colorBackground = AbstractC2397b.getColor(context, R$color.double_progress_bg);
        this.colorProgress = AbstractC2397b.getColor(context, R$color.double_progress_theme);
        this.colorCompleted = AbstractC2397b.getColor(context, com.p282tn.lib.widget.R$color.white_50);
        this.colorTitle = AbstractC2397b.getColor(context, com.p282tn.lib.widget.R$color.gray_light_70);
        this.colorPoint = AbstractC2397b.getColor(context, R$color.task_orange);
        this.animator = LazyKt.m97097b(new Function0() { // from class: com.transsion.rewardscenter.task.ad.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StageTaskProgressLayout.m76298j(this.f58777a);
            }
        });
        this.binding = C29221j.m112106c(LayoutInflater.from(context), this, true);
        m76301m();
    }

    public /* synthetic */ StageTaskProgressLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final ValueAnimator getAnimator() {
        return (ValueAnimator) this.animator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final ValueAnimator m76298j(final StageTaskProgressLayout stageTaskProgressLayout) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(2000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.transsion.rewardscenter.task.ad.f0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StageTaskProgressLayout.m76299k(this.f58778a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m76299k(StageTaskProgressLayout stageTaskProgressLayout, ValueAnimator it) {
        Intrinsics.m97802h(it, "it");
        C29221j c29221j = stageTaskProgressLayout.binding;
        if (c29221j == null) {
            Intrinsics.m97819y("binding");
            c29221j = null;
        }
        ProgressBar progressBar = c29221j.f89186h;
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.m97800f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        progressBar.setProgress((int) (((Float) animatedValue).floatValue() * 100));
    }

    /* JADX INFO: renamed from: l */
    private final LayerDrawable m76300l(int backgroundColor, int progressColor) {
        float fM27313a = AbstractC5776a0.m27313a(2.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(fM27313a);
        gradientDrawable.setColor(backgroundColor);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(fM27313a);
        gradientDrawable2.setColor(progressColor);
        return new LayerDrawable(new Drawable[]{gradientDrawable, new ClipDrawable(gradientDrawable2, GravityCompat.START, 1)});
    }

    /* JADX INFO: renamed from: m */
    private final void m76301m() {
        C29221j c29221j = this.binding;
        C29221j c29221j2 = null;
        if (c29221j == null) {
            Intrinsics.m97819y("binding");
            c29221j = null;
        }
        ProgressBar progress1 = c29221j.f89186h;
        Intrinsics.m97801g(progress1, "progress1");
        m76302n(progress1, this.colorBackground, this.colorProgress);
        C29221j c29221j3 = this.binding;
        if (c29221j3 == null) {
            Intrinsics.m97819y("binding");
        } else {
            c29221j2 = c29221j3;
        }
        ProgressBar progress2 = c29221j2.f89187i;
        Intrinsics.m97801g(progress2, "progress2");
        m76302n(progress2, this.colorBackground, this.colorProgress);
    }

    /* JADX INFO: renamed from: n */
    private final void m76302n(ProgressBar progressBar, int backgroundColor, int progressColor) {
        progressBar.setProgressDrawable(m76300l(backgroundColor, progressColor));
    }

    public static /* synthetic */ void setFirstStagePointIcon$default(StageTaskProgressLayout stageTaskProgressLayout, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        stageTaskProgressLayout.setFirstStagePointIcon(z11);
    }

    public static /* synthetic */ void setSecondStagePointIcon$default(StageTaskProgressLayout stageTaskProgressLayout, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        stageTaskProgressLayout.setSecondStagePointIcon(z11);
    }

    public final void complete() {
        setFirstStagePointIcon$default(this, false, 1, null);
        setSecondStagePointIcon$default(this, false, 1, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getAnimator().cancel();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        super.onRtlPropertiesChanged(layoutDirection);
        float f11 = layoutDirection == 1 ? -1.0f : 1.0f;
        C29221j c29221j = this.binding;
        C29221j c29221j2 = null;
        if (c29221j == null) {
            Intrinsics.m97819y("binding");
            c29221j = null;
        }
        c29221j.f89186h.setScaleX(f11);
        C29221j c29221j3 = this.binding;
        if (c29221j3 == null) {
            Intrinsics.m97819y("binding");
        } else {
            c29221j2 = c29221j3;
        }
        c29221j2.f89187i.setScaleX(f11);
    }

    public final void reset() {
        m76301m();
        setFirstStageProgress(0);
        setSecondStageProgress(0);
        setTitleTextColor(this.colorTitle);
        setPointTextColor(this.colorPoint);
        setFirstStagePointIcon(true);
        setSecondStagePointIcon(true);
    }

    public final void setFirstStagePointIcon(boolean defaultIcon) {
        C29221j c29221j = null;
        if (defaultIcon) {
            C29221j c29221j2 = this.binding;
            if (c29221j2 == null) {
                Intrinsics.m97819y("binding");
            } else {
                c29221j = c29221j2;
            }
            c29221j.f89182d.setImageResource(R$mipmap.ic_points);
            return;
        }
        C29221j c29221j3 = this.binding;
        if (c29221j3 == null) {
            Intrinsics.m97819y("binding");
        } else {
            c29221j = c29221j3;
        }
        c29221j.f89182d.setImageResource(R$mipmap.ic_points_done);
    }

    public final void setFirstStagePoints(String points) {
        Intrinsics.m97802h(points, "points");
        C29221j c29221j = this.binding;
        if (c29221j == null) {
            Intrinsics.m97819y("binding");
            c29221j = null;
        }
        c29221j.f89184f.setText(points);
    }

    public final void setFirstStageProgress(int progress) {
        C29221j c29221j = this.binding;
        if (c29221j == null) {
            Intrinsics.m97819y("binding");
            c29221j = null;
        }
        c29221j.f89186h.setProgress(RangesKt.m97942l(progress, 0, 100));
    }

    public final void setFirstStageText(String text) {
        Intrinsics.m97802h(text, "text");
        C29221j c29221j = this.binding;
        if (c29221j == null) {
            Intrinsics.m97819y("binding");
            c29221j = null;
        }
        c29221j.f89188j.setText(text);
    }

    public final void setPointTextColor(int color) {
        C29221j c29221j = this.binding;
        C29221j c29221j2 = null;
        if (c29221j == null) {
            Intrinsics.m97819y("binding");
            c29221j = null;
        }
        c29221j.f89184f.setTextColor(color);
        C29221j c29221j3 = this.binding;
        if (c29221j3 == null) {
            Intrinsics.m97819y("binding");
        } else {
            c29221j2 = c29221j3;
        }
        c29221j2.f89185g.setTextColor(color);
    }

    public final void setSecondStagePointIcon(boolean defaultIcon) {
        C29221j c29221j = null;
        if (defaultIcon) {
            C29221j c29221j2 = this.binding;
            if (c29221j2 == null) {
                Intrinsics.m97819y("binding");
            } else {
                c29221j = c29221j2;
            }
            c29221j.f89183e.setImageResource(R$mipmap.ic_points);
            return;
        }
        C29221j c29221j3 = this.binding;
        if (c29221j3 == null) {
            Intrinsics.m97819y("binding");
        } else {
            c29221j = c29221j3;
        }
        c29221j.f89183e.setImageResource(R$mipmap.ic_points_done);
    }

    public final void setSecondStagePoints(String points) {
        Intrinsics.m97802h(points, "points");
        C29221j c29221j = this.binding;
        if (c29221j == null) {
            Intrinsics.m97819y("binding");
            c29221j = null;
        }
        c29221j.f89185g.setText(points);
    }

    public final void setSecondStageProgress(int progress) {
        C29221j c29221j = this.binding;
        if (c29221j == null) {
            Intrinsics.m97819y("binding");
            c29221j = null;
        }
        c29221j.f89187i.setProgress(RangesKt.m97942l(progress, 0, 100));
    }

    public final void setSecondStageText(String text) {
        Intrinsics.m97802h(text, "text");
        C29221j c29221j = this.binding;
        if (c29221j == null) {
            Intrinsics.m97819y("binding");
            c29221j = null;
        }
        c29221j.f89189k.setText(text);
    }

    public final void setTitleTextColor(int color) {
        C29221j c29221j = this.binding;
        C29221j c29221j2 = null;
        if (c29221j == null) {
            Intrinsics.m97819y("binding");
            c29221j = null;
        }
        c29221j.f89188j.setTextColor(color);
        C29221j c29221j3 = this.binding;
        if (c29221j3 == null) {
            Intrinsics.m97819y("binding");
        } else {
            c29221j2 = c29221j3;
        }
        c29221j2.f89189k.setTextColor(color);
    }

    public final void startFirstStageAnimation() {
        getAnimator().start();
    }

    public final void stopFirstStageAnimation() {
        getAnimator().cancel();
    }
}
