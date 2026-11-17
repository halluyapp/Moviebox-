package com.transsion.baseui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.dynamicanimation.animation.AbstractC3027b;
import androidx.dynamicanimation.animation.C3029d;
import com.blankj.utilcode.util.AbstractC5786f0;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.noober.background.view.BLTextView;
import com.transsion.baseui.R$anim;
import com.transsion.baseui.R$drawable;
import com.transsion.baseui.R$layout;
import com.transsion.baseui.R$mipmap;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import dk.C22994g;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p424g.AbstractC23455a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0018¢\u0006\u0004\b!\u0010\"R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u0010?\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0016\u0010B\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006C"}, m97100d2 = {"Lcom/transsion/baseui/widget/ResourcesRequestView;", "Landroid/widget/FrameLayout;", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "res", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "()V", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroid/view/animation/Animation;", "p0", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "onAnimationStart", "onAnimationRepeat", "count", "", "animated", "setCount", "(IZ)V", "", CampaignEx.JSON_KEY_TITLE, "set", "(Ljava/lang/String;)V", "isGray", "setGray", "(Z)V", "Ldk/g;", "a", "Ldk/g;", "getMViewBinding", "()Ldk/g;", "setMViewBinding", "(Ldk/g;)V", "mViewBinding", "Landroid/view/animation/Animation;", "showTextAnim", "Landroidx/dynamicanimation/animation/d;", "c", "Landroidx/dynamicanimation/animation/d;", "springAnimation", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "numTextView", "Lcom/transsion/baseui/widget/DrawableCenterTextView;", "f", "Lcom/transsion/baseui/widget/DrawableCenterTextView;", "getIvCenterView", "()Lcom/transsion/baseui/widget/DrawableCenterTextView;", "setIvCenterView", "(Lcom/transsion/baseui/widget/DrawableCenterTextView;)V", "ivCenterView", "g", "Z", "isDirectionLtr", "BaseUI_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class ResourcesRequestView extends FrameLayout implements Animation.AnimationListener {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C22994g mViewBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Animation showTextAnim;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C3029d springAnimation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Handler handler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private TextView numTextView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private DrawableCenterTextView ivCenterView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean isDirectionLtr;

    /* JADX INFO: renamed from: com.transsion.baseui.widget.ResourcesRequestView$a */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC14576a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC14576a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C22994g mViewBinding;
            TextView textView;
            C22994g mViewBinding2;
            TextView textView2;
            DrawableCenterTextView drawableCenterTextView;
            ViewTreeObserver viewTreeObserver;
            C22994g mViewBinding3 = ResourcesRequestView.this.getMViewBinding();
            if (mViewBinding3 != null && (drawableCenterTextView = mViewBinding3.f70213e) != null && (viewTreeObserver = drawableCenterTextView.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            C22994g mViewBinding4 = ResourcesRequestView.this.getMViewBinding();
            DrawableCenterTextView drawableCenterTextView2 = mViewBinding4 != null ? mViewBinding4.f70213e : null;
            if (drawableCenterTextView2 == null || drawableCenterTextView2.getMeasuredWidth() == 0) {
                return;
            }
            TextPaint paint = drawableCenterTextView2.getPaint();
            Intrinsics.m97799e(paint);
            float fMeasureText = paint.measureText(drawableCenterTextView2.getText().toString());
            int compoundDrawablePadding = drawableCenterTextView2.getCompoundDrawablePadding();
            Drawable[] compoundDrawables = drawableCenterTextView2.getCompoundDrawables();
            Intrinsics.m97801g(compoundDrawables, "getCompoundDrawables(...)");
            if (ResourcesRequestView.this.isDirectionLtr) {
                Drawable drawable = compoundDrawables[0];
                if (drawable == null || (mViewBinding2 = ResourcesRequestView.this.getMViewBinding()) == null || (textView2 = mViewBinding2.f70214f) == null) {
                    return;
                }
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int i11 = (int) (compoundDrawablePadding + intrinsicWidth + fMeasureText);
                ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
                ((ViewGroup.MarginLayoutParams) c2308b).rightMargin = ((drawableCenterTextView2.getMeasuredWidth() / 2) + (i11 / 2)) - (intrinsicWidth / 3);
                textView2.setLayoutParams(c2308b);
                return;
            }
            Drawable drawable2 = compoundDrawables[2];
            if (drawable2 == null || (mViewBinding = ResourcesRequestView.this.getMViewBinding()) == null || (textView = mViewBinding.f70214f) == null) {
                return;
            }
            int intrinsicWidth2 = drawable2.getIntrinsicWidth();
            int i12 = (int) (compoundDrawablePadding + intrinsicWidth2 + fMeasureText);
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            Intrinsics.m97800f(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C2308b c2308b2 = (ConstraintLayout.C2308b) layoutParams2;
            ((ViewGroup.MarginLayoutParams) c2308b2).leftMargin = ((drawableCenterTextView2.getMeasuredWidth() / 2) + (i12 / 2)) - (intrinsicWidth2 / 3);
            textView.setLayoutParams(c2308b2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResourcesRequestView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResourcesRequestView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourcesRequestView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.handler = new Handler(Looper.getMainLooper());
        this.isDirectionLtr = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0;
        m65730b();
    }

    /* JADX INFO: renamed from: b */
    private final void m65730b() {
        DrawableCenterTextView drawableCenterTextView;
        ViewTreeObserver viewTreeObserver;
        Context context;
        int i11;
        View.inflate(getContext(), R$layout.resources_request, this);
        C22994g c22994gM91574a = C22994g.m91574a(this);
        this.mViewBinding = c22994gM91574a;
        this.ivCenterView = c22994gM91574a != null ? c22994gM91574a.f70213e : null;
        this.numTextView = c22994gM91574a != null ? c22994gM91574a.f70214f : null;
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R$anim.num_text_enter);
        this.showTextAnim = animationLoadAnimation;
        if (animationLoadAnimation == null) {
            Intrinsics.m97819y("showTextAnim");
            animationLoadAnimation = null;
        }
        animationLoadAnimation.setDuration(200L);
        Animation animation = this.showTextAnim;
        if (animation == null) {
            Intrinsics.m97819y("showTextAnim");
            animation = null;
        }
        animation.setAnimationListener(this);
        TextView textView = this.numTextView;
        if (textView != null) {
            AbstractC26006c.m102055h(textView);
        }
        C22994g c22994g = this.mViewBinding;
        C3029d c3029d = new C3029d(c22994g != null ? c22994g.f70214f : null, AbstractC3027b.f9364n, 0.0f);
        c3029d.m14118n().m14125d(0.75f);
        c3029d.m14118n().m14127f(200.0f);
        this.springAnimation = c3029d;
        TextView textView2 = this.numTextView;
        if (textView2 != null) {
            if (this.isDirectionLtr) {
                context = textView2.getContext();
                i11 = R$drawable.bg_num_text_6dp_bottom_right;
            } else {
                context = textView2.getContext();
                i11 = R$drawable.bg_num_text_6dp_bottom_left;
            }
            textView2.setBackground(AbstractC23455a.m93074b(context, i11));
        }
        C22994g c22994g2 = this.mViewBinding;
        if (c22994g2 == null || (drawableCenterTextView = c22994g2.f70213e) == null || (viewTreeObserver = drawableCenterTextView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC14576a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m65731c(ResourcesRequestView resourcesRequestView) {
        if (resourcesRequestView.isDirectionLtr) {
            DrawableCenterTextView drawableCenterTextView = resourcesRequestView.ivCenterView;
            if (drawableCenterTextView != null) {
                drawableCenterTextView.setCompoundDrawablesWithIntrinsicBounds(R$mipmap.ic_alert, 0, 0, 0);
            }
        } else {
            DrawableCenterTextView drawableCenterTextView2 = resourcesRequestView.ivCenterView;
            if (drawableCenterTextView2 != null) {
                drawableCenterTextView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R$mipmap.ic_alert, 0);
            }
        }
        C3029d c3029d = resourcesRequestView.springAnimation;
        C3029d c3029d2 = null;
        if (c3029d == null) {
            Intrinsics.m97819y("springAnimation");
            c3029d = null;
        }
        c3029d.m14116l(0.0f);
        C3029d c3029d3 = resourcesRequestView.springAnimation;
        if (c3029d3 == null) {
            Intrinsics.m97819y("springAnimation");
        } else {
            c3029d2 = c3029d3;
        }
        c3029d2.mo14083i();
    }

    /* JADX INFO: renamed from: d */
    private final void m65732d() {
        BLTextView bLTextView;
        TextView textView;
        C22994g c22994g = this.mViewBinding;
        if (c22994g != null && (textView = c22994g.f70210b) != null) {
            AbstractC26006c.m102054g(textView);
        }
        C22994g c22994g2 = this.mViewBinding;
        if (c22994g2 == null || (bLTextView = c22994g2.f70211c) == null) {
            return;
        }
        AbstractC26006c.m102058k(bLTextView);
    }

    public static /* synthetic */ void setCount$default(ResourcesRequestView resourcesRequestView, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        resourcesRequestView.setCount(i11, z11);
    }

    public final DrawableCenterTextView getIvCenterView() {
        return this.ivCenterView;
    }

    public final C22994g getMViewBinding() {
        return this.mViewBinding;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation p11) {
        C3029d c3029d = this.springAnimation;
        C3029d c3029d2 = null;
        if (c3029d == null) {
            Intrinsics.m97819y("springAnimation");
            c3029d = null;
        }
        c3029d.m14116l(1.0f);
        C3029d c3029d3 = this.springAnimation;
        if (c3029d3 == null) {
            Intrinsics.m97819y("springAnimation");
        } else {
            c3029d2 = c3029d3;
        }
        c3029d2.mo14083i();
        this.handler.postDelayed(new Runnable() { // from class: com.transsion.baseui.widget.h
            @Override // java.lang.Runnable
            public final void run() {
                ResourcesRequestView.m65731c(this.f51245a);
            }
        }, 100L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation p11) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation p11) {
        TextView textView = this.numTextView;
        if (textView != null) {
            AbstractC26006c.m102058k(textView);
        }
        AbstractC5786f0.m27402b(100L);
        if (this.isDirectionLtr) {
            DrawableCenterTextView drawableCenterTextView = this.ivCenterView;
            if (drawableCenterTextView != null) {
                drawableCenterTextView.setCompoundDrawablesWithIntrinsicBounds(R$mipmap.ic_alert_highlight, 0, 0, 0);
                return;
            }
            return;
        }
        DrawableCenterTextView drawableCenterTextView2 = this.ivCenterView;
        if (drawableCenterTextView2 != null) {
            drawableCenterTextView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R$mipmap.ic_alert_highlight, 0);
        }
    }

    public final void set(String title) {
        TextView textView;
        Intrinsics.m97802h(title, "title");
        C22994g c22994g = this.mViewBinding;
        if (c22994g == null || (textView = c22994g.f70212d) == null) {
            return;
        }
        textView.setText(title);
    }

    public final void setCount(int count, boolean animated) {
        TextView textView = this.numTextView;
        if (textView != null) {
            textView.setText("+" + count);
        }
        if (animated) {
            TextView textView2 = this.numTextView;
            if (textView2 != null) {
                Animation animation = this.showTextAnim;
                if (animation == null) {
                    Intrinsics.m97819y("showTextAnim");
                    animation = null;
                }
                textView2.startAnimation(animation);
            }
            m65732d();
            return;
        }
        if (count == 0) {
            TextView textView3 = this.numTextView;
            if (textView3 != null) {
                AbstractC26006c.m102055h(textView3);
                return;
            }
            return;
        }
        TextView textView4 = this.numTextView;
        if (textView4 != null) {
            AbstractC26006c.m102058k(textView4);
        }
    }

    public final void setGray(boolean isGray) {
    }

    public final void setIvCenterView(DrawableCenterTextView drawableCenterTextView) {
        this.ivCenterView = drawableCenterTextView;
    }

    public final void setMViewBinding(C22994g c22994g) {
        this.mViewBinding = c22994g;
    }
}
