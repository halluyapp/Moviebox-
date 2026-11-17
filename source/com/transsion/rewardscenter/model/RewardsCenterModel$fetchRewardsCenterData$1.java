package com.transsion.rewardscenter.model;

import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.rewardscenter.utils.AbstractC18019n;
import com.transsion.rewardscenterapi.RewardsCenterData;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p952yp.InterfaceC28992a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.rewardscenter.model.RewardsCenterModel$fetchRewardsCenterData$1", m97637f = "RewardsCenterModel.kt", m97638l = {MBSupportMuteAdType.REWARD_VIDEO}, m97639m = "invokeSuspend")
final class RewardsCenterModel$fetchRewardsCenterData$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $callback;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RewardsCenterModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardsCenterModel$fetchRewardsCenterData$1(Function0<Unit> function0, RewardsCenterModel rewardsCenterModel, Continuation<? super RewardsCenterModel$fetchRewardsCenterData$1> continuation) {
        super(2, continuation);
        this.$callback = function0;
        this.this$0 = rewardsCenterModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RewardsCenterModel$fetchRewardsCenterData$1 rewardsCenterModel$fetchRewardsCenterData$1 = new RewardsCenterModel$fetchRewardsCenterData$1(this.$callback, this.this$0, continuation);
        rewardsCenterModel$fetchRewardsCenterData$1.L$0 = obj;
        return rewardsCenterModel$fetchRewardsCenterData$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((RewardsCenterModel$fetchRewardsCenterData$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        Object objM111528d;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                RewardsCenterModel rewardsCenterModel = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                InterfaceC28992a interfaceC28992aM76104s = rewardsCenterModel.m76104s();
                this.label = 1;
                objM111528d = InterfaceC28992a.a.m111528d(interfaceC28992aM76104s, null, this, 1, null);
                if (objM111528d == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
                objM111528d = obj;
            }
            objM112707constructorimpl = Result.m112707constructorimpl((BaseDto) objM111528d);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        RewardsCenterModel rewardsCenterModel2 = this.this$0;
        if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
            BaseDto baseDto = (BaseDto) objM112707constructorimpl;
            if (AbstractC18019n.m76640a(baseDto)) {
                RewardsCenterData rewardsCenterData = (RewardsCenterData) baseDto.getData();
                if (rewardsCenterData != null) {
                    rewardsCenterModel2.m76118p().mo14858q(rewardsCenterData.getLottery());
                    rewardsCenterModel2.m76125x().mo14858q(rewardsCenterData.getUser());
                    rewardsCenterModel2.m76120r().mo14858q(rewardsCenterData.getRedeem());
                    rewardsCenterModel2.m76123v().mo14858q(rewardsCenterData.getTask());
                    rewardsCenterModel2.m76121t().mo14858q(rewardsCenterData.getRule());
                    C26866a.a.m104898f(C26866a.f81698a, "RewardsCenter", "fetchRewardsCenterData onSuccess: " + rewardsCenterData, false, 4, null);
                }
            } else {
                C26866a.a.m104898f(C26866a.f81698a, "RewardsCenter", "fetchRewardsCenterData onFailure: " + baseDto.getCode() + ", " + baseDto.getMsg(), false, 4, null);
            }
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.a.m104898f(C26866a.f81698a, "RewardsCenter", "fetchRewardsCenterData error: " + thM112710exceptionOrNullimpl.getMessage(), false, 4, null);
        }
        Function0<Unit> function0 = this.$callback;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f75682a;
    }
}
