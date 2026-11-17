package com.transsion.postdetail.layer.local;

import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsnet.downloader.manager.DownloadEsHelper;
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
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.layer.local.LocalVideoMiddleLayer$bindMovieDetail$1", m97637f = "LocalVideoMiddleLayer.kt", m97638l = {502}, m97639m = "invokeSuspend")
final class LocalVideoMiddleLayer$bindMovieDetail$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Subject $subject;
    int label;
    final /* synthetic */ LocalVideoMiddleLayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocalVideoMiddleLayer$bindMovieDetail$1(LocalVideoMiddleLayer localVideoMiddleLayer, Subject subject, Continuation<? super LocalVideoMiddleLayer$bindMovieDetail$1> continuation) {
        super(2, continuation);
        this.this$0 = localVideoMiddleLayer;
        this.$subject = subject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalVideoMiddleLayer$bindMovieDetail$1(this.this$0, this.$subject, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((LocalVideoMiddleLayer$bindMovieDetail$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String resourceId;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            DownloadBean downloadBeanM73361S0 = this.this$0.m73361S0();
            if (downloadBeanM73361S0 != null && (resourceId = downloadBeanM73361S0.getResourceId()) != null) {
                Subject subject = this.$subject;
                DownloadEsHelper downloadEsHelperM88598a = DownloadEsHelper.f67591m.m88598a();
                this.label = 1;
                if (downloadEsHelperM88598a.m88579g0(resourceId, subject, this) == objF) {
                    return objF;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        return Unit.f75682a;
    }
}
