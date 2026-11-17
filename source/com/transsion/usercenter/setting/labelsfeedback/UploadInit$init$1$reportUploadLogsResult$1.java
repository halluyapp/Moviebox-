package com.transsion.usercenter.setting.labelsfeedback;

import ax.InterfaceC4715a;
import com.google.gson.JsonObject;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.upload.bean.LoggerBean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import okhttp3.RequestBody;
import p411fh.C23367b;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.usercenter.setting.labelsfeedback.UploadInit$init$1$reportUploadLogsResult$1", m97637f = "UploadInit.kt", m97638l = {73}, m97639m = "invokeSuspend")
final class UploadInit$init$1$reportUploadLogsResult$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<LoggerBean, Unit> $callback;
    final /* synthetic */ JsonObject $json;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UploadInit$init$1$reportUploadLogsResult$1(JsonObject jsonObject, Function1<? super LoggerBean, Unit> function1, Continuation<? super UploadInit$init$1$reportUploadLogsResult$1> continuation) {
        super(2, continuation);
        this.$json = jsonObject;
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UploadInit$init$1$reportUploadLogsResult$1(this.$json, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UploadInit$init$1$reportUploadLogsResult$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Function1<LoggerBean, Unit> function1;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            C23367b.a aVar = C23367b.f71265a;
            String string = this.$json.toString();
            Intrinsics.m97801g(string, "toString(...)");
            RequestBody requestBodyM92796a = aVar.m92796a(string);
            if (requestBodyM92796a != null) {
                Function1<LoggerBean, Unit> function2 = this.$callback;
                InterfaceC4715a interfaceC4715aM85759f = UploadInit.f65492a.m85759f();
                this.L$0 = function2;
                this.label = 1;
                Object objM22792b = InterfaceC4715a.a.m22792b(interfaceC4715aM85759f, null, requestBodyM92796a, this, 1, null);
                if (objM22792b == objF) {
                    return objF;
                }
                function1 = function2;
                obj = objM22792b;
            }
            return Unit.f75682a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        function1 = (Function1) this.L$0;
        ResultKt.m97107b(obj);
        BaseDto baseDto = (BaseDto) obj;
        C26866a.a.m104898f(C26866a.f81698a, "UploadLoggerManager", "reportUploadLogsResult code=" + baseDto.getCode(), false, 4, null);
        function1.invoke(baseDto.getData());
        return Unit.f75682a;
    }
}
