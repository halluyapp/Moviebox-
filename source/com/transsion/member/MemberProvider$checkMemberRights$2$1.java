package com.transsion.member;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.memberapi.MemberCheckResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.member.MemberProvider$checkMemberRights$2$1", m97637f = "MemberProvider.kt", m97638l = {}, m97639m = "invokeSuspend")
final class MemberProvider$checkMemberRights$2$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<MemberCheckResult, Unit> $callback;
    final /* synthetic */ BaseDto<MemberCheckResult> $result;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MemberProvider$checkMemberRights$2$1(Function1<? super MemberCheckResult, Unit> function1, BaseDto<MemberCheckResult> baseDto, Continuation<? super MemberProvider$checkMemberRights$2$1> continuation) {
        super(2, continuation);
        this.$callback = function1;
        this.$result = baseDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemberProvider$checkMemberRights$2$1(this.$callback, this.$result, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((MemberProvider$checkMemberRights$2$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        Function1<MemberCheckResult, Unit> function1 = this.$callback;
        BaseDto<MemberCheckResult> baseDto = this.$result;
        function1.invoke(baseDto != null ? baseDto.getData() : null);
        return Unit.f75682a;
    }
}
