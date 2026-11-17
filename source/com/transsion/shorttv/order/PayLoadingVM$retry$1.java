package com.transsion.shorttv.order;

import android.os.SystemClock;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractC25207u0;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.order.PayLoadingVM$retry$1", m97637f = "PayLoadingVM.kt", m97638l = {Sdk$SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m97639m = "invokeSuspend")
final class PayLoadingVM$retry$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isDebug;
    final /* synthetic */ String $projectName;
    final /* synthetic */ long $startTime;
    final /* synthetic */ String $tradingOrderId;
    int label;
    final /* synthetic */ PayLoadingVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayLoadingVM$retry$1(PayLoadingVM payLoadingVM, long j11, String str, String str2, boolean z11, Continuation<? super PayLoadingVM$retry$1> continuation) {
        super(2, continuation);
        this.this$0 = payLoadingVM;
        this.$startTime = j11;
        this.$tradingOrderId = str;
        this.$projectName = str2;
        this.$isDebug = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PayLoadingVM$retry$1(this.this$0, this.$startTime, this.$tradingOrderId, this.$projectName, this.$isDebug, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((PayLoadingVM$retry$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            PayLoadingVM payLoadingVM = this.this$0;
            payLoadingVM.f60867c = RangesKt.m97936f(payLoadingVM.f60866b - (SystemClock.elapsedRealtime() - this.$startTime), 0L);
            long j11 = this.this$0.f60867c;
            this.label = 1;
            if (AbstractC25207u0.m99223a(j11, this) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        this.this$0.m79393i(this.$tradingOrderId, this.$projectName, this.$isDebug);
        return Unit.f75682a;
    }
}
