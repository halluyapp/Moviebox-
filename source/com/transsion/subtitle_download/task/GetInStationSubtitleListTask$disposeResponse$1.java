package com.transsion.subtitle_download.task;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@DebugMetadata(m97636c = "com.transsion.subtitle_download.task.GetInStationSubtitleListTask", m97637f = "GetInStationSubtitleListTask.kt", m97638l = {Sdk$SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 226, 232, 254, Sdk$SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 333}, m97639m = "disposeResponse")
final class GetInStationSubtitleListTask$disposeResponse$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetInStationSubtitleListTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetInStationSubtitleListTask$disposeResponse$1(GetInStationSubtitleListTask getInStationSubtitleListTask, Continuation<? super GetInStationSubtitleListTask$disposeResponse$1> continuation) {
        super(continuation);
        this.this$0 = getInStationSubtitleListTask;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m82303g(null, null, null, null, null, 0, 0, 0, null, null, null, this);
    }
}
