package com.transsion.shorttv.p313ad.common;

import android.content.Context;
import com.cloud.sdk.commonutil.util.AbstractC8394e;
import com.transsion.p285ad.bidding.base.AbsAdBidding;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.shorttv.p313ad.AdLoadState;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import p988zr.C29238a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.ad.common.STCommonNativeAdHelper$loadAd$1", m97637f = "STCommonNativeAdHelper.kt", m97638l = {134}, m97639m = "invokeSuspend")
final class STCommonNativeAdHelper$loadAd$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Boolean, Unit> $callback;
    int label;
    final /* synthetic */ STCommonNativeAdHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    STCommonNativeAdHelper$loadAd$1(STCommonNativeAdHelper sTCommonNativeAdHelper, Function1<? super Boolean, Unit> function1, Continuation<? super STCommonNativeAdHelper$loadAd$1> continuation) {
        super(2, continuation);
        this.this$0 = sTCommonNativeAdHelper;
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new STCommonNativeAdHelper$loadAd$1(this.this$0, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((STCommonNativeAdHelper$loadAd$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        STCommonNativeAdHelper sTCommonNativeAdHelper;
        Unit unit;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                STCommonNativeAdHelper sTCommonNativeAdHelper2 = this.this$0;
                Function1<Boolean, Unit> function1 = this.$callback;
                Result.Companion companion = Result.INSTANCE;
                sTCommonNativeAdHelper2.m78914m(3);
                C29238a.f89219a.m112118b(sTCommonNativeAdHelper2.m78915o(), "trigger load ad", sTCommonNativeAdHelper2.m78916p());
                sTCommonNativeAdHelper2.f60521i = AdLoadState.LOADING;
                sTCommonNativeAdHelper2.f60517e = function1;
                sTCommonNativeAdHelper2.f60515c = new BiddingNativeManager();
                BiddingNativeManager biddingNativeManager = sTCommonNativeAdHelper2.f60515c;
                if (biddingNativeManager != null) {
                    biddingNativeManager.m62830L0(sTCommonNativeAdHelper2.m78916p());
                }
                BiddingNativeManager biddingNativeManager2 = sTCommonNativeAdHelper2.f60515c;
                unit = null;
                if (biddingNativeManager2 != null) {
                    biddingNativeManager2.m62828J0(null);
                }
                BiddingNativeManager biddingNativeManager3 = sTCommonNativeAdHelper2.f60515c;
                if (biddingNativeManager3 != null) {
                    Context contextM39334a = AbstractC8394e.m39334a();
                    Intrinsics.m97801g(contextM39334a, "getContext(...)");
                    biddingNativeManager3.m62827I0(contextM39334a);
                }
                BiddingNativeManager biddingNativeManager4 = sTCommonNativeAdHelper2.f60515c;
                if (biddingNativeManager4 != null) {
                    biddingNativeManager4.m62829K0(sTCommonNativeAdHelper2.f60522j);
                }
                BiddingNativeManager biddingNativeManager5 = sTCommonNativeAdHelper2.f60515c;
                if (biddingNativeManager5 != null) {
                    this.label = 1;
                    if (AbsAdBidding.m62816t0(biddingNativeManager5, 0, false, this, 3, null) == objF) {
                        return objF;
                    }
                }
                objM112707constructorimpl = Result.m112707constructorimpl(unit);
                sTCommonNativeAdHelper = this.this$0;
                if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null) {
                    sTCommonNativeAdHelper.f60521i = AdLoadState.IDLE;
                }
                return Unit.f75682a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            unit = Unit.f75682a;
            objM112707constructorimpl = Result.m112707constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        sTCommonNativeAdHelper = this.this$0;
        if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null) {
            sTCommonNativeAdHelper.f60521i = AdLoadState.IDLE;
        }
        return Unit.f75682a;
    }
}
