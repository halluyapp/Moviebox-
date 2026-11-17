package com.transsion.member;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.member.bean.RedeemResult;
import com.transsion.memberapi.SkuItem;
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
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.member.MemberViewModel$redeemProduct$1", m97637f = "MemberViewModel.kt", m97638l = {298}, m97639m = "invokeSuspend")
final class MemberViewModel$redeemProduct$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ SkuItem $skuItem;
    int label;
    final /* synthetic */ MemberViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MemberViewModel$redeemProduct$1(MemberViewModel memberViewModel, SkuItem skuItem, Continuation<? super MemberViewModel$redeemProduct$1> continuation) {
        super(2, continuation);
        this.this$0 = memberViewModel;
        this.$skuItem = skuItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemberViewModel$redeemProduct$1(this.this$0, this.$skuItem, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((MemberViewModel$redeemProduct$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            MemberViewModel memberViewModel = this.this$0;
            SkuItem skuItem = this.$skuItem;
            this.label = 1;
            obj = memberViewModel.m69885I(skuItem, this);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        BaseDto baseDto = (BaseDto) obj;
        if (!Intrinsics.m97797c(baseDto != null ? baseDto.getCode() : null, "0") || baseDto.getData() == null) {
            C26866a.a aVar = C26866a.f81698a;
            C26866a.a.m104901l(aVar, "MemberViewModel", "RedeemProduct fail: " + (baseDto != null ? baseDto.getReason() : null) + " " + (baseDto != null ? baseDto.getCode() : null) + " " + (baseDto != null ? baseDto.getMsg() : null), false, 4, null);
            if (Intrinsics.m97797c(baseDto != null ? baseDto.getReason() : null, "EXCHANGE_FAIL")) {
                this.this$0.f54184l.remove(this.$skuItem.getSkuId());
                C26866a.a.m104898f(aVar, "MemberViewModel", "Should remove the orderId for " + this.$skuItem.getSkuId(), false, 4, null);
            }
            this.this$0.f54178f.mo14858q(null);
        } else {
            Object data = baseDto.getData();
            Intrinsics.m97799e(data);
            RedeemResult redeemResult = (RedeemResult) data;
            if (Intrinsics.m97797c(redeemResult.getOrderId(), this.this$0.f54184l.get(this.$skuItem.getSkuId()))) {
                C26866a.a.m104898f(C26866a.f81698a, "MemberViewModel", "RedeemProductSucceed: " + redeemResult.getOrderId() + "}", false, 4, null);
                this.this$0.f54184l.remove(this.$skuItem.getSkuId());
            } else {
                C26866a.a.m104898f(C26866a.f81698a, "MemberViewModel", "RedeemProductSucceed but orderId not match: " + redeemResult.getOrderId() + "}", false, 4, null);
            }
            this.this$0.f54178f.mo14858q(redeemResult);
        }
        return Unit.f75682a;
    }
}
