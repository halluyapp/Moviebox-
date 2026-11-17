package com.transsion.home.adapter.suboperate.provider;

import com.transsion.home.adapter.suboperate.adapter.C14941q;
import com.transsion.moviedetailapi.bean.Subject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.adapter.suboperate.provider.SubRankListProvider$registerCourse$1$1$1$1$1", m97637f = "SubRankListProvider.kt", m97638l = {}, m97639m = "invokeSuspend")
final class SubRankListProvider$registerCourse$1$1$1$1$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ Subject $subject;
    int label;
    final /* synthetic */ SubRankListProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubRankListProvider$registerCourse$1$1$1$1$1(SubRankListProvider subRankListProvider, int i11, Subject subject, Continuation<? super SubRankListProvider$registerCourse$1$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = subRankListProvider;
        this.$index = i11;
        this.$subject = subject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubRankListProvider$registerCourse$1$1$1$1$1(this.this$0, this.$index, this.$subject, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SubRankListProvider$registerCourse$1$1$1$1$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        C14941q c14941q = this.this$0.f52294h;
        if (c14941q != null) {
            c14941q.notifyItemChanged(this.$index, this.$subject);
        }
        return Unit.f75682a;
    }
}
