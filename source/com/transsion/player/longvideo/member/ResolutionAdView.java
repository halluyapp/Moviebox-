package com.transsion.player.longvideo.member;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.cardview.widget.CardView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.hisavana.common.bean.TAdErrorCode;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.memberapi.AdModule;
import com.transsion.p285ad.bidding.base.AbsAdBidding;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import p461hi.AbstractC23854a;
import p582lo.C25666o;
import p710qk.InterfaceC27088g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001B\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\n2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\fR$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010'R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, m97100d2 = {"Lcom/transsion/player/longvideo/member/ResolutionAdView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "l", "()V", "m", "onDestroy", "Lqk/g;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lqk/g;)V", "Lkotlin/Function1;", "", "callback", "setAdCallback", "(Lkotlin/jvm/functions/Function1;)V", "", "genre", "setGenre", "(Ljava/lang/String;)V", "Lcom/transsion/memberapi/AdModule;", "adModule", "setAdModule", "(Lcom/transsion/memberapi/AdModule;)V", "loadAd", "j", "Lkotlin/jvm/functions/Function1;", "adCallback", CampaignEx.JSON_KEY_AD_K, "Lqk/g;", "Ljava/lang/String;", "Lcom/transsion/memberapi/AdModule;", "Llo/o;", "n", "Llo/o;", "binding", "Ljava/util/concurrent/atomic/AtomicBoolean;", "o", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isLoading", "Lcom/transsion/player/longvideo/member/e;", TtmlNode.TAG_P, "Lcom/transsion/player/longvideo/member/e;", "viewBinder", "Lcom/transsion/ad/bidding/base/BiddingIntermediateMaterialBean;", CampaignEx.JSON_KEY_AD_Q, "Lcom/transsion/ad/bidding/base/BiddingIntermediateMaterialBean;", "maxEcpmObject", "Landroid/animation/ObjectAnimator;", CampaignEx.JSON_KEY_AD_R, "Lkotlin/Lazy;", "getRefreshAnimator", "()Landroid/animation/ObjectAnimator;", "refreshAnimator", "Lcom/transsion/ad/bidding/nativead/BiddingNativeManager;", "s", "Lcom/transsion/ad/bidding/nativead/BiddingNativeManager;", "nativeManager", "com/transsion/player/longvideo/member/ResolutionAdView$a", "t", "Lcom/transsion/player/longvideo/member/ResolutionAdView$a;", "nativeListener", "LongVideo_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class ResolutionAdView extends CardView {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private Function1 adCallback;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private InterfaceC27088g listener;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String genre;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private AdModule adModule;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C25666o binding;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private AtomicBoolean isLoading;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C16490e viewBinder;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private BiddingIntermediateMaterialBean maxEcpmObject;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Lazy refreshAnimator;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private BiddingNativeManager nativeManager;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final C16481a nativeListener;

    /* JADX INFO: renamed from: com.transsion.player.longvideo.member.ResolutionAdView$a */
    public static final class C16481a extends AbstractC23854a {
        C16481a() {
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: i */
        public void mo62846i(TAdErrorCode tAdErrorCode) {
            super.mo62846i(tAdErrorCode);
            ResolutionAdView.this.isLoading.set(false);
            ResolutionAdView.this.m71886m();
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: j */
        public void mo62778j(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
            super.mo62778j(biddingIntermediateMaterialBean);
            ResolutionAdView.this.maxEcpmObject = biddingIntermediateMaterialBean;
            ResolutionAdView.this.binding.f77984h.bindNativeView(ResolutionAdView.this.nativeManager, ResolutionAdView.this.viewBinder, biddingIntermediateMaterialBean);
            ResolutionAdView.this.isLoading.set(false);
            ResolutionAdView.this.m71886m();
            Function1 function1 = ResolutionAdView.this.adCallback;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: l */
        public void mo62849l(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
            super.mo62849l(biddingIntermediateMaterialBean);
            InterfaceC27088g interfaceC27088g = ResolutionAdView.this.listener;
            if (interfaceC27088g != null) {
                interfaceC27088g.onSuccess();
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.member.ResolutionAdView$loadAd$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.player.longvideo.member.ResolutionAdView$loadAd$1", m97637f = "ResolutionAdView.kt", m97638l = {161}, m97639m = "invokeSuspend")
    static final class C164821 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        int label;

        C164821(Continuation<? super C164821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ResolutionAdView.this.new C164821(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C164821) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                BiddingNativeManager biddingNativeManager = ResolutionAdView.this.nativeManager;
                if (biddingNativeManager != null) {
                    this.label = 1;
                    if (AbsAdBidding.m62816t0(biddingNativeManager, 0, false, this, 3, null) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ResolutionAdView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ResolutionAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ResolutionAdView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        C25666o c25666oM101011c = C25666o.m101011c(LayoutInflater.from(context), this, true);
        Intrinsics.m97801g(c25666oM101011c, "inflate(...)");
        this.binding = c25666oM101011c;
        c25666oM101011c.f77982f.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.member.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResolutionAdView.m71880g(this.f55621a, view);
            }
        });
        c25666oM101011c.f77983g.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.member.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResolutionAdView.m71881h(this.f55622a, view);
            }
        });
        c25666oM101011c.f77985i.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.member.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResolutionAdView.m71882i(this.f55623a, view);
            }
        });
        c25666oM101011c.f77986j.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.member.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResolutionAdView.m71883j(this.f55624a, view);
            }
        });
        this.isLoading = new AtomicBoolean(false);
        this.viewBinder = new C16490e(context);
        this.refreshAnimator = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.member.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ResolutionAdView.m71884k(this.f55625a);
            }
        });
        this.nativeListener = new C16481a();
    }

    public /* synthetic */ ResolutionAdView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final void m71880g(ResolutionAdView resolutionAdView, View view) {
        resolutionAdView.loadAd();
    }

    private final ObjectAnimator getRefreshAnimator() {
        Object value = this.refreshAnimator.getValue();
        Intrinsics.m97801g(value, "getValue(...)");
        return (ObjectAnimator) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m71881h(ResolutionAdView resolutionAdView, View view) {
        resolutionAdView.loadAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m71882i(ResolutionAdView resolutionAdView, View view) {
        NativeWrapperAdView.simulatingClick$default(resolutionAdView.binding.f77984h, resolutionAdView.maxEcpmObject, resolutionAdView.viewBinder, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m71883j(ResolutionAdView resolutionAdView, View view) {
        NativeWrapperAdView.simulatingClick$default(resolutionAdView.binding.f77984h, resolutionAdView.maxEcpmObject, resolutionAdView.viewBinder, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final ObjectAnimator m71884k(ResolutionAdView resolutionAdView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(resolutionAdView.binding.f77978b, "rotation", 0.0f, 360.0f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setRepeatCount(-1);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: l */
    private final void m71885l() {
        if (getRefreshAnimator().isRunning()) {
            return;
        }
        getRefreshAnimator().start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final void m71886m() {
        getRefreshAnimator().cancel();
        this.binding.f77978b.setRotation(0.0f);
    }

    /* JADX WARN: Unreachable blocks removed: 13, instructions: 36 */
    public final void loadAd() {
    }

    public final void onDestroy() {
        getRefreshAnimator().cancel();
        BiddingNativeManager biddingNativeManager = this.nativeManager;
        if (biddingNativeManager != null) {
            biddingNativeManager.mo62775U();
        }
    }

    public final void setAdCallback(Function1<? super Boolean, Unit> callback) {
        Intrinsics.m97802h(callback, "callback");
        this.adCallback = callback;
    }

    public final void setAdModule(AdModule adModule) {
        this.adModule = adModule;
        String adStyle = adModule != null ? adModule.getAdStyle() : null;
        if (Intrinsics.m97797c(adStyle, "THREE_IN_ONE_AD_BUTTON_STYLE_VERTICAL")) {
            this.binding.f77981e.setVisibility(0);
        } else if (Intrinsics.m97797c(adStyle, "THREE_IN_ONE_AD_BUTTON_STYLE_SMALL")) {
            this.binding.f77980d.setVisibility(0);
        }
    }

    public final void setGenre(String genre) {
        this.genre = genre;
    }

    public final void setListener(InterfaceC27088g listener) {
        this.listener = listener;
    }
}
