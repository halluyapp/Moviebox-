package com.transsion.postdetail.layer.local;

import com.transsion.p285ad.bidding.base.AbsAdBidding;
import com.transsion.p285ad.bidding.interstitial.BiddingInterstitialManager;
import com.transsion.p285ad.strategy.C14058c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.layer.local.LocalBackAdHelper$show$1", m97637f = "LocalBackAdHelper.kt", m97638l = {140}, m97639m = "invokeSuspend")
final class LocalBackAdHelper$show$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $genre;
    int label;
    final /* synthetic */ LocalBackAdHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocalBackAdHelper$show$1(LocalBackAdHelper localBackAdHelper, String str, Continuation<? super LocalBackAdHelper$show$1> continuation) {
        super(2, continuation);
        this.this$0 = localBackAdHelper;
        this.$genre = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalBackAdHelper$show$1(this.this$0, this.$genre, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((LocalBackAdHelper$show$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            BiddingInterstitialManager biddingInterstitialManager = this.this$0.f56455f;
            if (biddingInterstitialManager != null) {
                biddingInterstitialManager.mo62775U();
            }
            this.this$0.f56455f = new BiddingInterstitialManager();
            BiddingInterstitialManager biddingInterstitialManager2 = this.this$0.f56455f;
            if (biddingInterstitialManager2 != null) {
                biddingInterstitialManager2.m62830L0(this.this$0.f56450a);
            }
            BiddingInterstitialManager biddingInterstitialManager3 = this.this$0.f56455f;
            if (biddingInterstitialManager3 != null) {
                biddingInterstitialManager3.m62829K0(this.this$0.m73157n());
            }
            BiddingInterstitialManager biddingInterstitialManager4 = this.this$0.f56455f;
            if (biddingInterstitialManager4 != null) {
                biddingInterstitialManager4.m62828J0(C14058c.f49742a.m63681a(this.$genre));
            }
            BiddingInterstitialManager biddingInterstitialManager5 = this.this$0.f56455f;
            if (biddingInterstitialManager5 != null) {
                this.label = 1;
                if (AbsAdBidding.m62816t0(biddingInterstitialManager5, 0, false, this, 3, null) == objF) {
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
