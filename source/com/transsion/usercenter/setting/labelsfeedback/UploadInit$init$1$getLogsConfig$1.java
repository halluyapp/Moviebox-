package com.transsion.usercenter.setting.labelsfeedback;

import ax.InterfaceC4715a;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.upload.bean.LoggerSwitchBean;
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
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.usercenter.setting.labelsfeedback.UploadInit$init$1$getLogsConfig$1", m97637f = "UploadInit.kt", m97638l = {85}, m97639m = "invokeSuspend")
final class UploadInit$init$1$getLogsConfig$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<LoggerSwitchBean, Unit> $callback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UploadInit$init$1$getLogsConfig$1(Function1<? super LoggerSwitchBean, Unit> function1, Continuation<? super UploadInit$init$1$getLogsConfig$1> continuation) {
        super(2, continuation);
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UploadInit$init$1$getLogsConfig$1(this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UploadInit$init$1$getLogsConfig$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC4715a interfaceC4715aM85759f = UploadInit.f65492a.m85759f();
            this.label = 1;
            obj = InterfaceC4715a.a.m22791a(interfaceC4715aM85759f, null, this, 1, null);
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
        C26866a.a.m104898f(C26866a.f81698a, "UploadLoggerManager", "getLogsConfig code=" + baseDto.getCode(), false, 4, null);
        this.$callback.invoke(baseDto.getData());
        return Unit.f75682a;
    }
}
