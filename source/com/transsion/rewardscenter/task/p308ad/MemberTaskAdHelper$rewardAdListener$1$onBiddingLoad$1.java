package com.transsion.rewardscenter.task.p308ad;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.transsion.p285ad.bidding.base.AbsAdBidding;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.bidding.video.BiddingVideoManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.rewardscenter.task.ad.MemberTaskAdHelper$rewardAdListener$1$onBiddingLoad$1", m97637f = "MemberTaskAdHelper.kt", m97638l = {}, m97639m = "invokeSuspend")
final class MemberTaskAdHelper$rewardAdListener$1$onBiddingLoad$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BiddingIntermediateMaterialBean $maxEcpmObject;
    int label;
    final /* synthetic */ MemberTaskAdHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MemberTaskAdHelper$rewardAdListener$1$onBiddingLoad$1(MemberTaskAdHelper memberTaskAdHelper, BiddingIntermediateMaterialBean biddingIntermediateMaterialBean, Continuation<? super MemberTaskAdHelper$rewardAdListener$1$onBiddingLoad$1> continuation) {
        super(2, continuation);
        this.this$0 = memberTaskAdHelper;
        this.$maxEcpmObject = biddingIntermediateMaterialBean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemberTaskAdHelper$rewardAdListener$1$onBiddingLoad$1(this.this$0, this.$maxEcpmObject, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((MemberTaskAdHelper$rewardAdListener$1$onBiddingLoad$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        BiddingVideoManager biddingVideoManager = this.this$0.f58737m;
        if (biddingVideoManager != null) {
            Context context = this.this$0.f58731g;
            Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            AbsAdBidding.m62802O0(biddingVideoManager, (AppCompatActivity) context, this.$maxEcpmObject, false, 4, null);
        }
        return Unit.f75682a;
    }
}
