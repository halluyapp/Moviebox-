package com.transsion.audio.viewmodel;

import com.transsion.baselib.p291db.audio.AudioBean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p602mj.InterfaceC25866a;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.audio.viewmodel.HistoryListManager$deleteItem$1", m97637f = "HistoryListManager.kt", m97638l = {86}, m97639m = "invokeSuspend")
final class HistoryListManager$deleteItem$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AudioBean $audioItem;
    int label;
    final /* synthetic */ HistoryListManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryListManager$deleteItem$1(HistoryListManager historyListManager, AudioBean audioBean, Continuation<? super HistoryListManager$deleteItem$1> continuation) {
        super(2, continuation);
        this.this$0 = historyListManager;
        this.$audioItem = audioBean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryListManager$deleteItem$1(this.this$0, this.$audioItem, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((HistoryListManager$deleteItem$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC25866a interfaceC25866aM64694q = this.this$0.m64694q();
            if (interfaceC25866aM64694q != null) {
                AudioBean audioBean = this.$audioItem;
                this.label = 1;
                if (interfaceC25866aM64694q.mo101622b(audioBean, this) == objF) {
                    return objF;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        C26866a.a.m104899g(C26866a.f81698a, "audio deleteItem ok", false, 2, null);
        return Unit.f75682a;
    }
}
