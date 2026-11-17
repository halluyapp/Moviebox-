package com.transsion.search_pugc.fragment.result.provider;

import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.search.R$id;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "<anonymous>", "(Lkotlinx/coroutines/n0;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.search_pugc.fragment.result.provider.ResultVerticalRankType2Provider$convert$2", m97637f = "ResultVerticalRankType2Provider.kt", m97638l = {}, m97639m = "invokeSuspend")
final class ResultVerticalRankType2Provider$convert$2 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super BaseViewHolder>, Object> {
    final /* synthetic */ BaseViewHolder $helper;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResultVerticalRankType2Provider$convert$2(BaseViewHolder baseViewHolder, Continuation<? super ResultVerticalRankType2Provider$convert$2> continuation) {
        super(2, continuation);
        this.$helper = baseViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResultVerticalRankType2Provider$convert$2(this.$helper, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super BaseViewHolder> continuation) {
        return ((ResultVerticalRankType2Provider$convert$2) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        return this.$helper.setVisible(R$id.iv_cover1, false);
    }
}
