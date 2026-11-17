package com.transsion.rewardscenter.model;

import com.therouter.TheRouter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p710qk.InterfaceC27087f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.rewardscenter.model.RewardsCenterModel$drawTask$1", m97637f = "RewardsCenterModel.kt", m97638l = {167}, m97639m = "invokeSuspend")
final class RewardsCenterModel$drawTask$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $orderId;
    final /* synthetic */ boolean $showToast;
    int label;
    final /* synthetic */ RewardsCenterModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardsCenterModel$drawTask$1(RewardsCenterModel rewardsCenterModel, String str, boolean z11, Continuation<? super RewardsCenterModel$drawTask$1> continuation) {
        super(2, continuation);
        this.this$0 = rewardsCenterModel;
        this.$orderId = str;
        this.$showToast = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RewardsCenterModel$drawTask$1(this.this$0, this.$orderId, this.$showToast, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((RewardsCenterModel$drawTask$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC27087f interfaceC27087f = (InterfaceC27087f) TheRouter.m61774d(InterfaceC27087f.class, new Object[0]);
            if (interfaceC27087f != null) {
                String strM76113k = this.this$0.m76113k();
                if (strM76113k == null) {
                    strM76113k = "";
                }
                String str = this.$orderId;
                String str2 = str != null ? str : "";
                boolean z11 = this.$showToast;
                this.label = 1;
                if (interfaceC27087f.mo66157b(strM76113k, str2, z11, this) == objF) {
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
