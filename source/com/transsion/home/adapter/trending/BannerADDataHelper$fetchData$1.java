package com.transsion.home.adapter.trending;

import com.transsion.p285ad.bidding.base.AbsAdBidding;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.p285ad.scene.C14047a;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.adapter.trending.BannerADDataHelper$fetchData$1", m97637f = "BannerADDataHelper.kt", m97638l = {Sdk$SDKMetric.SDKMetricType.AD_VALIDATION_TO_PRESENT_DURATION_MS_VALUE}, m97639m = "invokeSuspend")
final class BannerADDataHelper$fetchData$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;

    BannerADDataHelper$fetchData$1(Continuation<? super BannerADDataHelper$fetchData$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BannerADDataHelper$fetchData$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((BannerADDataHelper$fetchData$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            BannerADDataHelper bannerADDataHelper = BannerADDataHelper.f52406a;
            BannerADDataHelper.f52408c = new BiddingNativeManager();
            BiddingNativeManager biddingNativeManager = BannerADDataHelper.f52408c;
            if (biddingNativeManager != null) {
                biddingNativeManager.m62830L0("TrendingNativeBannerScene");
            }
            BiddingNativeManager biddingNativeManager2 = BannerADDataHelper.f52408c;
            if (biddingNativeManager2 != null) {
                biddingNativeManager2.m62829K0(BannerADDataHelper.f52413h);
            }
            BiddingNativeManager biddingNativeManager3 = BannerADDataHelper.f52408c;
            if (biddingNativeManager3 != null) {
                this.label = 1;
                if (AbsAdBidding.m62816t0(biddingNativeManager3, 0, false, this, 3, null) == objF) {
                    return objF;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        BannerADDataHelper bannerADDataHelper2 = BannerADDataHelper.f52406a;
        BannerADDataHelper.f52407b = C14047a.m63582p(C14047a.f49716a, "TrendingNativeBannerScene", 0, 2, null);
        return Unit.f75682a;
    }
}
