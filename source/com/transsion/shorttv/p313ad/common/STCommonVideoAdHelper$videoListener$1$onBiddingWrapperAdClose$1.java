package com.transsion.shorttv.p313ad.common;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.ad.common.STCommonVideoAdHelper$videoListener$1$onBiddingWrapperAdClose$1", m97637f = "STCommonVideoAdHelper.kt", m97638l = {}, m97639m = "invokeSuspend")
final class STCommonVideoAdHelper$videoListener$1$onBiddingWrapperAdClose$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $rewarded;
    int label;
    final /* synthetic */ STCommonVideoAdHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    STCommonVideoAdHelper$videoListener$1$onBiddingWrapperAdClose$1(STCommonVideoAdHelper sTCommonVideoAdHelper, boolean z11, Continuation<? super STCommonVideoAdHelper$videoListener$1$onBiddingWrapperAdClose$1> continuation) {
        super(2, continuation);
        this.this$0 = sTCommonVideoAdHelper;
        this.$rewarded = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new STCommonVideoAdHelper$videoListener$1$onBiddingWrapperAdClose$1(this.this$0, this.$rewarded, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((STCommonVideoAdHelper$videoListener$1$onBiddingWrapperAdClose$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        STCommonVideoAdHelper sTCommonVideoAdHelper = this.this$0;
        boolean z11 = this.$rewarded;
        try {
            Result.Companion companion = Result.INSTANCE;
            Function1 function1 = sTCommonVideoAdHelper.f60530g;
            if (function1 != null) {
                function1.invoke(Boxing.m97631a(z11));
            }
            sTCommonVideoAdHelper.m78938p(4);
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        return Unit.f75682a;
    }
}
