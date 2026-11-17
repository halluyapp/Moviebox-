package com.transsion.baseui.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.AbstractC2397b;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.AbstractC5806y;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.widget.R$color;
import com.transsion.baseui.R$bool;
import com.transsion.baseui.R$id;
import com.transsion.baseui.R$layout;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import dk.C22991d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u000bJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\u0010H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0010H\u0014¢\u0006\u0004\b%\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u0014\u00108\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00103R\u0014\u0010:\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00103R\u0014\u0010<\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00103¨\u0006="}, m97100d2 = {"Lcom/transsion/baseui/widget/NewcomerGuideView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "startWidth", "startHeight", "endWidth", "endHeight", "", "j", "(IIII)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/graphics/Bitmap;", "i", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "targetView", "step", "totalStep", "newBgSpace", "setTargetView", "(Landroid/view/View;III)V", "resId", "setTipsText", "(I)V", TtmlNode.ATTR_TTS_COLOR, "setSetBgColor", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "a", "Ljava/lang/String;", "TAG", "Ldk/d;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ldk/d;", "viewBinding", "Landroid/animation/ValueAnimator;", "c", "Landroid/animation/ValueAnimator;", "bgAnima", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "I", "screenWidth", "e", "screenHeight", "f", "bgSpace", "g", "animaBgSpace", "h", "guideHeight", "BaseUI_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class NewcomerGuideView extends ConstraintLayout {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C22991d viewBinding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private ValueAnimator bgAnima;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int screenWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int screenHeight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int bgSpace;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int animaBgSpace;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int guideHeight;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewcomerGuideView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewcomerGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewcomerGuideView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.TAG = "NewcomerGuide";
        this.screenWidth = AbstractC5806y.m27489e();
        this.screenHeight = AbstractC5806y.m27487c() - AbstractC5781d.m27351c();
        this.bgSpace = AbstractC5776a0.m27313a(16.0f);
        this.animaBgSpace = AbstractC5776a0.m27313a(40.0f);
        this.guideHeight = AbstractC5776a0.m27313a(200.0f);
        View.inflate(context, R$layout.layout_newcomer_guide, this);
        setBackgroundResource(R$color.cl31_70_p);
        C22991d c22991dM91569a = C22991d.m91569a(this);
        Intrinsics.m97801g(c22991dM91569a, "bind(...)");
        this.viewBinding = c22991dM91569a;
    }

    /* JADX INFO: renamed from: i */
    private final Bitmap m65723i(View view) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Intrinsics.m97801g(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        view.draw(canvas);
        canvas.save();
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: j */
    private final void m65724j(final int startWidth, final int startHeight, final int endWidth, final int endHeight) {
        final int color = AbstractC2397b.getColor(getContext(), R$color.cl38_50_p);
        Drawable background = this.viewBinding.f70191f.getBackground();
        Intrinsics.m97800f(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        final GradientDrawable gradientDrawable = (GradientDrawable) background;
        final ViewGroup.LayoutParams layoutParams = this.viewBinding.f70191f.getLayoutParams();
        final int i11 = 0;
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(color), 0);
        this.bgAnima = valueAnimatorOfObject;
        if (valueAnimatorOfObject != null) {
            valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.transsion.baseui.widget.g
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    NewcomerGuideView.m65725k(gradientDrawable, color, i11, layoutParams, startWidth, endWidth, startHeight, endHeight, this, valueAnimator);
                }
            });
        }
        ValueAnimator valueAnimator = this.bgAnima;
        if (valueAnimator != null) {
            valueAnimator.setRepeatCount(-1);
        }
        ValueAnimator valueAnimator2 = this.bgAnima;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration(2000L);
        }
        ValueAnimator valueAnimator3 = this.bgAnima;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m65725k(GradientDrawable gradientDrawable, int i11, int i12, ViewGroup.LayoutParams layoutParams, int i13, int i14, int i15, int i16, NewcomerGuideView newcomerGuideView, ValueAnimator animation) {
        Intrinsics.m97802h(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.m97800f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        gradientDrawable.setColor(iIntValue);
        float f11 = ((i11 - iIntValue) * 1.0f) / (i11 - i12);
        layoutParams.width = i13 + ((int) ((i14 - i13) * f11));
        layoutParams.height = i15 + ((int) ((i16 - i15) * f11));
        newcomerGuideView.viewBinding.f70191f.setLayoutParams(layoutParams);
    }

    public static /* synthetic */ void setTargetView$default(NewcomerGuideView newcomerGuideView, View view, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        newcomerGuideView.setTargetView(view, i11, i12, i13);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ValueAnimator valueAnimator;
        super.onAttachedToWindow();
        ValueAnimator valueAnimator2 = this.bgAnima;
        if (valueAnimator2 == null || valueAnimator2.isStarted() || (valueAnimator = this.bgAnima) == null) {
            return;
        }
        valueAnimator.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.bgAnima;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void setSetBgColor(int color) {
        Drawable background = this.viewBinding.f70192g.getBackground();
        Intrinsics.m97800f(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setColor(color);
    }

    public final void setTargetView(View targetView, int step, int totalStep, int newBgSpace) {
        String str;
        Intrinsics.m97802h(targetView, "targetView");
        int[] iArr = new int[2];
        targetView.getLocationOnScreen(iArr);
        ViewGroup.LayoutParams layoutParams = this.viewBinding.f70188c.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
        ((ViewGroup.MarginLayoutParams) c2308b).height = targetView.getMeasuredHeight();
        ((ViewGroup.MarginLayoutParams) c2308b).width = targetView.getMeasuredWidth();
        c2308b.f7968i = 0;
        Bitmap bitmapM65723i = m65723i(targetView);
        if (bitmapM65723i != null) {
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "setImageBitmap  step = " + step, false, 4, null);
            this.viewBinding.f70188c.setImageBitmap(bitmapM65723i);
        }
        ViewGroup.LayoutParams layoutParams2 = this.viewBinding.f70190e.getLayoutParams();
        Intrinsics.m97800f(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b2 = (ConstraintLayout.C2308b) layoutParams2;
        ViewGroup.LayoutParams layoutParams3 = this.viewBinding.f70187b.getLayoutParams();
        Intrinsics.m97800f(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b3 = (ConstraintLayout.C2308b) layoutParams3;
        ViewGroup.LayoutParams layoutParams4 = this.viewBinding.f70189d.getLayoutParams();
        Intrinsics.m97800f(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b4 = (ConstraintLayout.C2308b) layoutParams4;
        boolean z11 = getContext().getResources().getBoolean(R$bool.is_rtl);
        boolean z12 = !z11;
        char c11 = 1;
        boolean z13 = this.screenWidth / 2 > iArr[0] + (targetView.getMeasuredWidth() / 2);
        if (z11 || !z13) {
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "location end", false, 4, null);
            c2308b.f7994v = 0;
            c2308b2.f7994v = 0;
            c2308b.setMarginEnd(!z11 ? (this.screenWidth - iArr[0]) - targetView.getMeasuredWidth() : iArr[0]);
            c11 = 1;
            ((ViewGroup.MarginLayoutParams) c2308b).topMargin = iArr[1];
        } else {
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "location start", false, 4, null);
            c2308b.f7990t = 0;
            c2308b2.f7990t = 0;
            c2308b.setMarginStart(iArr[0]);
            ((ViewGroup.MarginLayoutParams) c2308b).topMargin = iArr[1];
        }
        if (this.screenHeight - iArr[c11] < this.guideHeight) {
            this.viewBinding.f70187b.setScaleY(-1.0f);
            c2308b3.f7972k = R$id.v_guide_bg;
            c2308b2.f7972k = R$id.iv_guide_line;
            c2308b4.f7972k = R$id.tv_guide_tips;
        } else {
            c2308b3.f7970j = R$id.v_guide_bg;
            c2308b2.f7970j = R$id.iv_guide_line;
            c2308b4.f7970j = R$id.tv_guide_tips;
        }
        this.viewBinding.f70189d.setLayoutParams(c2308b4);
        this.viewBinding.f70187b.setLayoutParams(c2308b3);
        this.viewBinding.f70188c.setLayoutParams(c2308b);
        this.viewBinding.f70190e.setLayoutParams(c2308b2);
        ViewGroup.LayoutParams layoutParams5 = this.viewBinding.f70192g.getLayoutParams();
        Intrinsics.m97800f(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b5 = (ConstraintLayout.C2308b) layoutParams5;
        ((ViewGroup.MarginLayoutParams) c2308b5).height = targetView.getMeasuredHeight() + (newBgSpace > 0 ? newBgSpace : this.bgSpace);
        ((ViewGroup.MarginLayoutParams) c2308b5).width = targetView.getMeasuredWidth() + (newBgSpace > 0 ? newBgSpace : this.bgSpace);
        this.viewBinding.f70192g.setLayoutParams(c2308b5);
        AppCompatImageView ivGuideTarget = this.viewBinding.f70188c;
        Intrinsics.m97801g(ivGuideTarget, "ivGuideTarget");
        AbstractC26006c.m102058k(ivGuideTarget);
        AppCompatImageView ivGuideLine = this.viewBinding.f70187b;
        Intrinsics.m97801g(ivGuideLine, "ivGuideLine");
        AbstractC26006c.m102058k(ivGuideLine);
        AppCompatTextView tvGuideTips = this.viewBinding.f70190e;
        Intrinsics.m97801g(tvGuideTips, "tvGuideTips");
        AbstractC26006c.m102058k(tvGuideTips);
        AppCompatTextView tvGuideButton = this.viewBinding.f70189d;
        Intrinsics.m97801g(tvGuideButton, "tvGuideButton");
        AbstractC26006c.m102058k(tvGuideButton);
        if (step < totalStep) {
            str = "Next " + step + "/" + totalStep;
        } else if (totalStep == 1) {
            str = "Done";
        } else {
            str = "Done " + step + "/" + totalStep;
        }
        String str2 = str;
        if (totalStep > 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(14, true), 0, StringsKt.m98156o0(str2, "/", 0, false, 6, null), 17);
            this.viewBinding.f70189d.setText(spannableStringBuilder);
        } else {
            this.viewBinding.f70189d.setText(str2);
        }
        int i11 = ((ViewGroup.MarginLayoutParams) c2308b5).width;
        int i12 = ((ViewGroup.MarginLayoutParams) c2308b5).height;
        int i13 = this.animaBgSpace;
        m65724j(i11, i12, i11 + i13, i13 + i12);
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "screenWidth = " + this.screenWidth + ", X = " + iArr[0] + ", screenHeight = " + this.screenHeight + ", Y = " + iArr[1] + ", width = " + targetView.getWidth() + ", isLeft = " + z13 + ", ltr = " + z12, false, 4, null);
    }

    public final void setTipsText(int resId) {
        this.viewBinding.f70190e.setText(getContext().getString(resId));
    }
}
