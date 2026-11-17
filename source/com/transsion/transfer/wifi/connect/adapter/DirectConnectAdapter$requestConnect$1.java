package com.transsion.transfer.wifi.connect.adapter;

import com.transsion.transfer.wifi.util.C20136g;
import com.transsion.transfer.wifi.util.C20138i;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC25207u0;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.transfer.wifi.connect.adapter.DirectConnectAdapter$requestConnect$1", m97637f = "DirectConnectAdapter.kt", m97638l = {185}, m97639m = "invokeSuspend")
final class DirectConnectAdapter$requestConnect$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ DirectConnectAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectConnectAdapter$requestConnect$1(DirectConnectAdapter directConnectAdapter, Continuation<? super DirectConnectAdapter$requestConnect$1> continuation) {
        super(2, continuation);
        this.this$0 = directConnectAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DirectConnectAdapter$requestConnect$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((DirectConnectAdapter$requestConnect$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            C20138i.f64000a.m83579d(this.this$0.m83352y(), this.this$0.f63891g, (60 & 4) != 0, (60 & 8) != 0, (60 & 16) != 0, (60 & 32) != 0);
            this.label = 1;
            if (AbstractC25207u0.m99223a(1000L, this) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        C20136g.m83566b(C20136g.f63999a, this.this$0.m83322e() + " --> requestConnect() --> connectRetry = " + this.this$0.f63895k + " --> retryCount = " + this.this$0.f63896l + " --> delay 500", false, 2, null);
        this.this$0.m83351x();
        return Unit.f75682a;
    }
}
