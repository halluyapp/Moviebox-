package com.transsion.postdetail.shorttv;

import com.transsion.p285ad.bidding.base.AbsAdBidding;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.bidding.interstitial.BiddingInterstitialManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.shorttv.ShortTvWatchAdDialog$interstitialListener$1$onBiddingLoad$1", m97637f = "ShortTvWatchAdDialog.kt", m97638l = {142}, m97639m = "invokeSuspend")
final class ShortTvWatchAdDialog$interstitialListener$1$onBiddingLoad$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BiddingIntermediateMaterialBean $maxEcpmObject;
    int label;
    final /* synthetic */ ShortTvWatchAdDialog this$0;

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv.ShortTvWatchAdDialog$interstitialListener$1$onBiddingLoad$1$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.shorttv.ShortTvWatchAdDialog$interstitialListener$1$onBiddingLoad$1$1", m97637f = "ShortTvWatchAdDialog.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C168661 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ BiddingIntermediateMaterialBean $maxEcpmObject;
        int label;
        final /* synthetic */ ShortTvWatchAdDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C168661(ShortTvWatchAdDialog shortTvWatchAdDialog, BiddingIntermediateMaterialBean biddingIntermediateMaterialBean, Continuation<? super C168661> continuation) {
            super(2, continuation);
            this.this$0 = shortTvWatchAdDialog;
            this.$maxEcpmObject = biddingIntermediateMaterialBean;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C168661(this.this$0, this.$maxEcpmObject, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C168661) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            BiddingInterstitialManager biddingInterstitialManager = this.this$0.interstitialManager;
            if (biddingInterstitialManager != null) {
                AbsAdBidding.m62802O0(biddingInterstitialManager, this.this$0.getActivity(), this.$maxEcpmObject, false, 4, null);
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvWatchAdDialog$interstitialListener$1$onBiddingLoad$1(ShortTvWatchAdDialog shortTvWatchAdDialog, BiddingIntermediateMaterialBean biddingIntermediateMaterialBean, Continuation<? super ShortTvWatchAdDialog$interstitialListener$1$onBiddingLoad$1> continuation) {
        super(2, continuation);
        this.this$0 = shortTvWatchAdDialog;
        this.$maxEcpmObject = biddingIntermediateMaterialBean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTvWatchAdDialog$interstitialListener$1$onBiddingLoad$1(this.this$0, this.$maxEcpmObject, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTvWatchAdDialog$interstitialListener$1$onBiddingLoad$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            AbstractC24917a2 abstractC24917a2M99269c = C25220y0.m99269c();
            C168661 c168661 = new C168661(this.this$0, this.$maxEcpmObject, null);
            this.label = 1;
            if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c168661, this) == objF) {
                return objF;
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
