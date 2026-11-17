package com.transsion.postdetail.p304ad;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p1004lifecycle.LifecycleCoroutineScope;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.cloud.tmc.integration.constants.IntegrationConstants;
import com.google.android.material.card.MaterialCardView;
import com.hisavana.common.bean.TAdErrorCode;
import com.hisavana.common.bean.TAdNativeInfo;
import com.hisavana.mediation.p276ad.TIconView;
import com.hisavana.mediation.p276ad.TMediaView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.p285ad.R$mipmap;
import com.transsion.p285ad.bidding.base.AbstractC13924r;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.p285ad.scene.C14047a;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import com.transsion.push.PushConstants;
import com.transsion.wrapperad.R$id;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25204t1;
import ng.AbstractC26006c;
import p391ey.C23245b;
import p461hi.AbstractC23854a;
import p873wi.C28384q;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001=\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ/\u0010\u0016\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\nR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010$R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006A"}, m97100d2 = {"Lcom/transsion/postdetail/ad/VideoFloatingView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "()V", "j", CampaignEx.JSON_KEY_AD_K, "f", "h", "g", "Landroidx/lifecycle/LifecycleCoroutineScope;", "lifecycleScope", "Landroidx/constraintlayout/widget/ConstraintLayout;", "parentView", "Lkotlin/Function0;", "callback", PushConstants.PUSH_SERVICE_TYPE_SHOW, "(Landroidx/lifecycle/LifecycleCoroutineScope;Landroidx/constraintlayout/widget/ConstraintLayout;Lkotlin/jvm/functions/Function0;)V", IntegrationConstants.NAVIGATION_STYLE_HIDE, "", "a", "Ljava/lang/String;", "sceneId", "Ljava/lang/ref/WeakReference;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/ref/WeakReference;", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "closeImg", "Lkotlin/jvm/functions/Function0;", "showCallback", "e", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Lkotlinx/coroutines/t1;", "Lkotlinx/coroutines/t1;", "delayJob", "", "Lkotlin/Lazy;", "getDisplayDuration", "()J", "displayDuration", "Lcom/transsion/ad/view/native_ad/NativeWrapperAdView;", "Lcom/transsion/ad/view/native_ad/NativeWrapperAdView;", "nativeWrapperAdView", "Lcom/transsion/ad/bidding/base/r;", "i", "Lcom/transsion/ad/bidding/base/r;", "nativeViewBinder", "Lcom/transsion/ad/bidding/base/BiddingIntermediateMaterialBean;", "Lcom/transsion/ad/bidding/base/BiddingIntermediateMaterialBean;", "mMaxEcpmObject", "Lcom/transsion/ad/bidding/nativead/BiddingNativeManager;", "Lcom/transsion/ad/bidding/nativead/BiddingNativeManager;", "adManager", "com/transsion/postdetail/ad/VideoFloatingView$a", "l", "Lcom/transsion/postdetail/ad/VideoFloatingView$a;", "adListener", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class VideoFloatingView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String sceneId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private WeakReference parentView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ImageView closeImg;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Function0 showCallback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private LifecycleCoroutineScope lifecycleScope;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private InterfaceC25204t1 delayJob;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy displayDuration;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final NativeWrapperAdView nativeWrapperAdView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private AbstractC13924r nativeViewBinder;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private BiddingIntermediateMaterialBean mMaxEcpmObject;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private BiddingNativeManager adManager;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C16684a adListener;

    /* JADX INFO: renamed from: com.transsion.postdetail.ad.VideoFloatingView$a */
    public static final class C16684a extends AbstractC23854a {
        C16684a() {
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: i */
        public void mo62846i(TAdErrorCode tAdErrorCode) {
            super.mo62846i(tAdErrorCode);
            VideoFloatingView.this.m72791g();
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: j */
        public void mo62778j(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
            super.mo62778j(biddingIntermediateMaterialBean);
            VideoFloatingView.this.mMaxEcpmObject = biddingIntermediateMaterialBean;
            VideoFloatingView.access$showAd(VideoFloatingView.this);
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: p */
        public void mo62855p(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
            super.mo62855p(biddingIntermediateMaterialBean);
            VideoFloatingView.this.m72791g();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public VideoFloatingView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoFloatingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.m97802h(context, "context");
        this.sceneId = "VideoFloatingNativeScene";
        this.closeImg = new ImageView(context);
        this.displayDuration = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ad.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(VideoFloatingView.m72793i(this.f56176a));
            }
        });
        NativeWrapperAdView nativeWrapperAdView = new NativeWrapperAdView(context, null, 2, null);
        this.nativeWrapperAdView = nativeWrapperAdView;
        this.adListener = new C16684a();
        addView(nativeWrapperAdView, new FrameLayout.LayoutParams(-1, -1));
        m72788d();
    }

    public /* synthetic */ VideoFloatingView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static final /* synthetic */ void access$showAd(VideoFloatingView videoFloatingView) {
    }

    /* JADX INFO: renamed from: d */
    private final void m72788d() {
        this.closeImg.setImageResource(R$mipmap.ad_irregular_close);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC5776a0.m27313a(16.0f), AbstractC5776a0.m27313a(16.0f));
        layoutParams.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_TOP_END;
        this.closeImg.setVisibility(8);
        this.closeImg.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ad.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoFloatingView.m72789e(this.f56178a, view);
            }
        });
        C28384q.f87086a.m109747a(this.closeImg);
        addView(this.closeImg, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m72789e(VideoFloatingView videoFloatingView, View view) {
        videoFloatingView.m72791g();
    }

    /* JADX INFO: renamed from: f */
    private final void m72790f() {
        ConstraintLayout constraintLayout;
        try {
            Result.Companion companion = Result.INSTANCE;
            C28384q.f87086a.m109747a(this);
            int iM27313a = AbstractC5776a0.m27313a(80.0f);
            ConstraintLayout.C2308b c2308b = new ConstraintLayout.C2308b(iM27313a, iM27313a);
            c2308b.f7994v = 0;
            c2308b.f7974l = 0;
            c2308b.setMarginEnd(AbstractC5776a0.m27313a(20.0f));
            ((ViewGroup.MarginLayoutParams) c2308b).bottomMargin = iM27313a;
            setLayoutParams(c2308b);
            WeakReference weakReference = this.parentView;
            if (weakReference != null && (constraintLayout = (ConstraintLayout) weakReference.get()) != null) {
                constraintLayout.addView(this);
            }
            Function0 function0 = this.showCallback;
            if (function0 != null) {
                function0.invoke();
            }
            InterfaceC25204t1 interfaceC25204t1 = this.delayJob;
            if (interfaceC25204t1 != null) {
                InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
            }
            LifecycleCoroutineScope lifecycleCoroutineScope = this.lifecycleScope;
            this.delayJob = lifecycleCoroutineScope != null ? AbstractC25136k.m99058d(lifecycleCoroutineScope, null, null, new VideoFloatingView$addToParent$1$1(this, null), 3, null) : null;
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final void m72791g() {
        InterfaceC25204t1 interfaceC25204t1 = this.delayJob;
        if (interfaceC25204t1 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
        }
        this.parentView = null;
        m72792h();
        AbstractC26006c.m102054g(this.closeImg);
        AbstractC26006c.m102054g(this);
        this.mMaxEcpmObject = null;
        removeAllViews();
        C28384q.f87086a.m109747a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getDisplayDuration() {
        return ((Number) this.displayDuration.getValue()).longValue();
    }

    /* JADX INFO: renamed from: h */
    private final void m72792h() {
        BiddingNativeManager biddingNativeManager = this.adManager;
        if (biddingNativeManager != null) {
            biddingNativeManager.mo62775U();
        }
        this.adManager = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final long m72793i(VideoFloatingView videoFloatingView) {
        return ((long) RangesKt.m97935e(C14047a.f49716a.m63593k(videoFloatingView.sceneId), 30)) * 1000;
    }

    /* JADX INFO: renamed from: j */
    private final void m72794j() {
        m72792h();
        BiddingNativeManager biddingNativeManager = new BiddingNativeManager();
        this.adManager = biddingNativeManager;
        biddingNativeManager.m62830L0(this.sceneId);
        BiddingNativeManager biddingNativeManager2 = this.adManager;
        if (biddingNativeManager2 != null) {
            biddingNativeManager2.m62829K0(this.adListener);
        }
        LifecycleCoroutineScope lifecycleCoroutineScope = this.lifecycleScope;
        if (lifecycleCoroutineScope != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScope, C25220y0.m99268b(), null, new VideoFloatingView$loadAd$1(this, null), 2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        if (r2 == null) goto L22;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m72795k() {
        TAdNativeInfo nativeInfo;
        TAdNativeInfo.Image icon;
        TAdNativeInfo nativeInfo2;
        BiddingNativeManager biddingNativeManager = this.adManager;
        boolean zM63195R0 = biddingNativeManager != null ? biddingNativeManager.m63195R0() : false;
        if (zM63195R0) {
            BiddingIntermediateMaterialBean biddingIntermediateMaterialBean = this.mMaxEcpmObject;
            String url = null;
            if (((biddingIntermediateMaterialBean == null || (nativeInfo2 = biddingIntermediateMaterialBean.getNativeInfo()) == null) ? null : nativeInfo2.getIcon()) != null) {
                BiddingIntermediateMaterialBean biddingIntermediateMaterialBean2 = this.mMaxEcpmObject;
                if (biddingIntermediateMaterialBean2 != null && (nativeInfo = biddingIntermediateMaterialBean2.getNativeInfo()) != null && (icon = nativeInfo.getIcon()) != null) {
                    url = icon.getUrl();
                }
            }
            m72791g();
            return;
        }
        if (this.nativeViewBinder == null) {
            C23245b c23245b = C23245b.f70802a;
            Context context = getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            this.nativeViewBinder = c23245b.m92309a(context, this.sceneId);
        }
        this.nativeWrapperAdView.bindNativeView(this.adManager, this.nativeViewBinder, this.mMaxEcpmObject);
        if (zM63195R0) {
            TMediaView tMediaView = (TMediaView) this.nativeWrapperAdView.findViewById(R$id.ad_media);
            if (tMediaView != null) {
                AbstractC26006c.m102054g(tMediaView);
            }
        } else {
            TIconView tIconView = (TIconView) this.nativeWrapperAdView.findViewById(R$id.ad_icon);
            if (tIconView != null) {
                AbstractC26006c.m102054g(tIconView);
            }
        }
        this.closeImg.postDelayed(new Runnable() { // from class: com.transsion.postdetail.ad.x
            @Override // java.lang.Runnable
            public final void run() {
                VideoFloatingView.m72796l(this.f56177a);
            }
        }, ((long) C14047a.f49716a.m63587e(this.sceneId)) * 1000);
        m72790f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m72796l(VideoFloatingView videoFloatingView) {
        videoFloatingView.closeImg.setVisibility(0);
    }

    public final void hide() {
        m72791g();
    }

    public final void show(LifecycleCoroutineScope lifecycleScope, ConstraintLayout parentView, Function0<Unit> callback) {
        Intrinsics.m97802h(parentView, "parentView");
        this.lifecycleScope = lifecycleScope;
        this.parentView = new WeakReference(parentView);
        this.showCallback = callback;
        if (this.mMaxEcpmObject != null) {
            m72795k();
        } else {
            m72794j();
        }
    }
}
