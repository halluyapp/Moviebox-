package com.transsion.usercenter.setting.labelsfeedback;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m97100d2 = {"<anonymous>", "", "it", ""}, m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@DebugMetadata(m97636c = "com.transsion.usercenter.setting.labelsfeedback.UploadInit$init$1$getTstToken$3", m97637f = "UploadInit.kt", m97638l = {}, m97639m = "invokeSuspend")
final class UploadInit$init$1$getTstToken$3 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $failed;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UploadInit$init$1$getTstToken$3(Function1<? super String, Unit> function1, Continuation<? super UploadInit$init$1$getTstToken$3> continuation) {
        super(2, continuation);
        this.$failed = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UploadInit$init$1$getTstToken$3 uploadInit$init$1$getTstToken$3 = new UploadInit$init$1$getTstToken$3(this.$failed, continuation);
        uploadInit$init$1$getTstToken$3.L$0 = obj;
        return uploadInit$init$1$getTstToken$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th2, Continuation<? super Unit> continuation) {
        return ((UploadInit$init$1$getTstToken$3) create(th2, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        Throwable th2 = (Throwable) this.L$0;
        String message = th2.getMessage();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("failed:");
        sb2.append(message);
        this.$failed.invoke(String.valueOf(th2.getMessage()));
        return Unit.f75682a;
    }
}
