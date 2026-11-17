package com.transsion.subroom.activity;

import com.transsion.wrapperad.view.secondfloor.SecondFloorArcCoverView;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25207u0;
import kotlinx.coroutines.InterfaceC25149n0;
import ng.AbstractC26006c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.subroom.activity.SecondFloorHelper$onAction$4", m97637f = "SecondFloorHelper.kt", m97638l = {248}, m97639m = "invokeSuspend")
final class SecondFloorHelper$onAction$4 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SecondFloorHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SecondFloorHelper$onAction$4(SecondFloorHelper secondFloorHelper, Continuation<? super SecondFloorHelper$onAction$4> continuation) {
        super(2, continuation);
        this.this$0 = secondFloorHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecondFloorHelper$onAction$4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SecondFloorHelper$onAction$4) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            this.label = 1;
            if (AbstractC25207u0.m99223a(500L, this) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        SecondFloorArcCoverView arcCover = this.this$0.f62627a.f71447b;
        Intrinsics.m97801g(arcCover, "arcCover");
        AbstractC26006c.m102054g(arcCover);
        SecondFloorHelper.m81691H(this.this$0, false, 1, null);
        return Unit.f75682a;
    }
}
