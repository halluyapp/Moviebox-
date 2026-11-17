package com.transsion.rewardscenter.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.widget.R$mipmap;
import com.transsion.push.PushConstants;
import com.transsion.rewardscenter.view.PrizeFlowView;
import com.transsion.rewardscenterapi.PrizeFlow;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p462hj.C23860f;
import p986zp.C29217f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001$B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\f¢\u0006\u0004\b!\u0010\u0010J\u000f\u0010\"\u001a\u00020\fH\u0014¢\u0006\u0004\b\"\u0010\u0010J\u000f\u0010#\u001a\u00020\fH\u0014¢\u0006\u0004\b#\u0010\u0010R\u0014\u0010&\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010*\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010+\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010%R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00150\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010,R\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00101R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010<¨\u0006@"}, m97100d2 = {"Lcom/transsion/rewardscenter/view/PrizeFlowView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "root", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "(Landroid/view/View;)V", "g", "()V", CampaignEx.JSON_KEY_AD_K, "h", "Lzp/f;", "binding", "Lcom/transsion/rewardscenterapi/PrizeFlow;", "flow", "e", "(Lzp/f;Lcom/transsion/rewardscenterapi/PrizeFlow;)V", "", "name", "f", "(Ljava/lang/String;)Ljava/lang/String;", "", "flows", "setPrizeFlows", "(Ljava/util/List;)V", PushConstants.PROVIDER_FIELD_DESTROY, "onAttachedToWindow", "onDetachedFromWindow", "a", "Lzp/f;", "bindingA", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "bindingB", "c", "current", "next", "Ljava/util/List;", "prizeFlows", "I", "currentIndex", "", "Z", "isRunning", "Landroid/view/animation/DecelerateInterpolator;", "Landroid/view/animation/DecelerateInterpolator;", "interpolator", "Landroid/os/Handler;", "i", "Landroid/os/Handler;", "handler", "Ljava/lang/Runnable;", "j", "Ljava/lang/Runnable;", "ticker", "startRunnable", "Companion", "RewardsCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class PrizeFlowView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C29217f bindingA;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C29217f bindingB;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C29217f current;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C29217f next;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private List prizeFlows;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int currentIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean isRunning;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final DecelerateInterpolator interpolator;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Handler handler;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Runnable ticker;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Runnable startRunnable;
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrizeFlowView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrizeFlowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrizeFlowView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        C29217f c29217fM112094c = C29217f.m112094c(LayoutInflater.from(context));
        Intrinsics.m97801g(c29217fM112094c, "inflate(...)");
        this.bindingA = c29217fM112094c;
        C29217f c29217fM112094c2 = C29217f.m112094c(LayoutInflater.from(context));
        Intrinsics.m97801g(c29217fM112094c2, "inflate(...)");
        this.bindingB = c29217fM112094c2;
        this.current = c29217fM112094c;
        this.next = c29217fM112094c2;
        this.prizeFlows = CollectionsKt.m97506l();
        this.interpolator = new DecelerateInterpolator();
        this.handler = new Handler(Looper.getMainLooper());
        this.ticker = new Runnable() { // from class: bq.a
            @Override // java.lang.Runnable
            public final void run() {
                PrizeFlowView.m76658l(this.f17256a);
            }
        };
        this.startRunnable = new Runnable() { // from class: bq.b
            @Override // java.lang.Runnable
            public final void run() {
                PrizeFlowView.m76656j(this.f17257a);
            }
        };
        setClipChildren(true);
    }

    public /* synthetic */ PrizeFlowView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: d */
    private final void m76650d(View root) {
        ViewParent parent = root.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(root);
        }
        addView(root, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: e */
    private final void m76651e(C29217f binding, PrizeFlow flow) {
        binding.f89163d.setText(m76652f(flow.getUserName()));
        binding.f89162c.setText(flow.getPrizeName());
        C23860f.a aVar = C23860f.f72909a;
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        C23860f.b bVarM94470i = aVar.m94457m(context).m94468g(flow.getAvatar()).m94470i(R$mipmap.profile_default_avatar);
        ShapeableImageView ivAvatar = binding.f89161b;
        Intrinsics.m97801g(ivAvatar, "ivAvatar");
        bVarM94470i.m94465d(ivAvatar);
    }

    /* JADX INFO: renamed from: f */
    private final String m76652f(String name) {
        if (name == null || name.length() == 0) {
            return "";
        }
        if (name.length() <= 3) {
            return name;
        }
        return StringsKt.m98249y1(name, 2) + StringsKt.m98232M("*", Math.min(name.length() - 3, 6)) + StringsKt.m98247w1(name);
    }

    /* JADX INFO: renamed from: g */
    private final void m76653g() {
        this.isRunning = true;
        this.handler.postDelayed(this.ticker, 3000L);
    }

    /* JADX INFO: renamed from: h */
    private final void m76654h() {
        final float height = getHeight();
        this.current.getRoot().animate().translationY(-height).setDuration(400L).setInterpolator(this.interpolator).start();
        this.next.getRoot().animate().translationY(0.0f).setDuration(400L).setInterpolator(this.interpolator).withEndAction(new Runnable() { // from class: bq.c
            @Override // java.lang.Runnable
            public final void run() {
                PrizeFlowView.m76655i(this.f17258a, height);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m76655i(PrizeFlowView prizeFlowView, float f11) {
        if (prizeFlowView.isRunning) {
            int size = (prizeFlowView.currentIndex + 1) % prizeFlowView.prizeFlows.size();
            prizeFlowView.currentIndex = size;
            C29217f c29217f = prizeFlowView.current;
            List list = prizeFlowView.prizeFlows;
            prizeFlowView.m76651e(c29217f, (PrizeFlow) list.get((size + 1) % list.size()));
            prizeFlowView.current.getRoot().setTranslationY(f11);
            C29217f c29217f2 = prizeFlowView.current;
            prizeFlowView.current = prizeFlowView.next;
            prizeFlowView.next = c29217f2;
            prizeFlowView.m76653g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m76656j(PrizeFlowView prizeFlowView) {
        C29217f c29217f = prizeFlowView.bindingA;
        prizeFlowView.current = c29217f;
        prizeFlowView.next = prizeFlowView.bindingB;
        prizeFlowView.m76651e(c29217f, (PrizeFlow) prizeFlowView.prizeFlows.get(prizeFlowView.currentIndex));
        prizeFlowView.current.getRoot().setTranslationY(0.0f);
        if (prizeFlowView.prizeFlows.size() >= 2) {
            C29217f c29217f2 = prizeFlowView.next;
            List list = prizeFlowView.prizeFlows;
            prizeFlowView.m76651e(c29217f2, (PrizeFlow) list.get((prizeFlowView.currentIndex + 1) % list.size()));
            prizeFlowView.next.getRoot().setTranslationY(prizeFlowView.getMeasuredHeight());
            prizeFlowView.m76653g();
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m76657k() {
        this.isRunning = false;
        removeCallbacks(this.startRunnable);
        this.handler.removeCallbacks(this.ticker);
        this.bindingA.getRoot().animate().cancel();
        this.bindingB.getRoot().animate().cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m76658l(PrizeFlowView prizeFlowView) {
        prizeFlowView.m76654h();
    }

    public final void destroy() {
        m76657k();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.prizeFlows.isEmpty() || this.isRunning) {
            return;
        }
        post(this.startRunnable);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m76657k();
    }

    public final void setPrizeFlows(List<PrizeFlow> flows) {
        Intrinsics.m97802h(flows, "flows");
        if (flows.isEmpty()) {
            return;
        }
        m76657k();
        this.prizeFlows = flows;
        this.currentIndex = 0;
        removeAllViews();
        ConstraintLayout root = this.bindingA.getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        m76650d(root);
        if (flows.size() >= 2) {
            ConstraintLayout root2 = this.bindingB.getRoot();
            Intrinsics.m97801g(root2, "getRoot(...)");
            m76650d(root2);
        }
        post(this.startRunnable);
    }
}
