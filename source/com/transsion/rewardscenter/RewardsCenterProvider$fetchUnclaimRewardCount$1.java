package com.transsion.rewardscenter;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.rewardscenter.utils.AbstractC18019n;
import com.transsion.rewardscenterapi.MineLotteryInfo;
import com.transsion.rewardscenterapi.PriceInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p952yp.InterfaceC28992a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.rewardscenter.RewardsCenterProvider$fetchUnclaimRewardCount$1", m97637f = "RewardsCenterProvider.kt", m97638l = {Sdk$SDKMetric.SDKMetricType.AD_BACKGROUND_BEFORE_IMPRESSION_VALUE}, m97639m = "invokeSuspend")
final class RewardsCenterProvider$fetchUnclaimRewardCount$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RewardsCenterProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardsCenterProvider$fetchUnclaimRewardCount$1(RewardsCenterProvider rewardsCenterProvider, Continuation<? super RewardsCenterProvider$fetchUnclaimRewardCount$1> continuation) {
        super(2, continuation);
        this.this$0 = rewardsCenterProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RewardsCenterProvider$fetchUnclaimRewardCount$1 rewardsCenterProvider$fetchUnclaimRewardCount$1 = new RewardsCenterProvider$fetchUnclaimRewardCount$1(this.this$0, continuation);
        rewardsCenterProvider$fetchUnclaimRewardCount$1.L$0 = obj;
        return rewardsCenterProvider$fetchUnclaimRewardCount$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((RewardsCenterProvider$fetchUnclaimRewardCount$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        List<PriceInfo> priceItems;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                RewardsCenterProvider rewardsCenterProvider = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                InterfaceC28992a interfaceC28992aM76081h = rewardsCenterProvider.m76081h();
                this.label = 1;
                obj = InterfaceC28992a.a.m111529e(interfaceC28992aM76081h, null, this, 1, null);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            objM112707constructorimpl = Result.m112707constructorimpl((BaseDto) obj);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        RewardsCenterProvider rewardsCenterProvider2 = this.this$0;
        if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
            BaseDto baseDto = (BaseDto) objM112707constructorimpl;
            if (AbstractC18019n.m76640a(baseDto)) {
                MineLotteryInfo mineLotteryInfo = (MineLotteryInfo) baseDto.getData();
                int size = (mineLotteryInfo == null || (priceItems = mineLotteryInfo.getPriceItems()) == null) ? 0 : priceItems.size();
                rewardsCenterProvider2.f58632b.mo14855n(Boxing.m97634d(size));
                C26866a.a.m104898f(C26866a.f81698a, "RewardsCenter", "fetchUnclaimRewardCount: " + size, false, 4, null);
            }
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.a.m104898f(C26866a.f81698a, "RewardsCenter", "fetchUnclaimRewardCount error: " + thM112710exceptionOrNullimpl.getMessage(), false, 4, null);
        }
        return Unit.f75682a;
    }
}
