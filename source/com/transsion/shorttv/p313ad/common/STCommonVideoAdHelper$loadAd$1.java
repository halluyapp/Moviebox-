package com.transsion.shorttv.p313ad.common;

import com.transsion.p285ad.bidding.base.AbsAdBidding;
import com.transsion.p285ad.bidding.video.BiddingVideoManager;
import com.transsion.shorttv.p313ad.AdLoadState;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.InterfaceC25149n0;
import p988zr.C29238a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.ad.common.STCommonVideoAdHelper$loadAd$1", m97637f = "STCommonVideoAdHelper.kt", m97638l = {Sdk$SDKError.Reason.ASSET_WRITE_ERROR_VALUE}, m97639m = "invokeSuspend")
final class STCommonVideoAdHelper$loadAd$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<Boolean, String, String, Unit> $loadCallback;
    int label;
    final /* synthetic */ STCommonVideoAdHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    STCommonVideoAdHelper$loadAd$1(STCommonVideoAdHelper sTCommonVideoAdHelper, Function3<? super Boolean, ? super String, ? super String, Unit> function3, Continuation<? super STCommonVideoAdHelper$loadAd$1> continuation) {
        super(2, continuation);
        this.this$0 = sTCommonVideoAdHelper;
        this.$loadCallback = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new STCommonVideoAdHelper$loadAd$1(this.this$0, this.$loadCallback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((STCommonVideoAdHelper$loadAd$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        STCommonVideoAdHelper sTCommonVideoAdHelper;
        Unit unit;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                STCommonVideoAdHelper sTCommonVideoAdHelper2 = this.this$0;
                Function3<Boolean, String, String, Unit> function3 = this.$loadCallback;
                Result.Companion companion = Result.INSTANCE;
                sTCommonVideoAdHelper2.m78938p(3);
                C29238a.f89219a.m112118b(sTCommonVideoAdHelper2.m78939r(), "trigger load ad", sTCommonVideoAdHelper2.m78940s());
                sTCommonVideoAdHelper2.f60532i = AdLoadState.LOADING;
                sTCommonVideoAdHelper2.f60533j = false;
                sTCommonVideoAdHelper2.f60528e = function3;
                sTCommonVideoAdHelper2.f60526c = new BiddingVideoManager();
                BiddingVideoManager biddingVideoManager = sTCommonVideoAdHelper2.f60526c;
                if (biddingVideoManager != null) {
                    biddingVideoManager.m62830L0(sTCommonVideoAdHelper2.m78940s());
                }
                BiddingVideoManager biddingVideoManager2 = sTCommonVideoAdHelper2.f60526c;
                if (biddingVideoManager2 != null) {
                    biddingVideoManager2.m62829K0(sTCommonVideoAdHelper2.f60534k);
                }
                BiddingVideoManager biddingVideoManager3 = sTCommonVideoAdHelper2.f60526c;
                if (biddingVideoManager3 != null) {
                    this.label = 1;
                    if (AbsAdBidding.m62816t0(biddingVideoManager3, 0, false, this, 3, null) == objF) {
                        return objF;
                    }
                } else {
                    unit = null;
                }
                objM112707constructorimpl = Result.m112707constructorimpl(unit);
                sTCommonVideoAdHelper = this.this$0;
                if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null) {
                    sTCommonVideoAdHelper.f60532i = AdLoadState.IDLE;
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
        sTCommonVideoAdHelper = this.this$0;
        if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null) {
            sTCommonVideoAdHelper.f60532i = AdLoadState.IDLE;
        }
        return Unit.f75682a;
    }
}
