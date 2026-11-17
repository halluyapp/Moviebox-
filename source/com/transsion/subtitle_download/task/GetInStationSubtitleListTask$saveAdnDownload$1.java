package com.transsion.subtitle_download.task;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@DebugMetadata(m97636c = "com.transsion.subtitle_download.task.GetInStationSubtitleListTask", m97637f = "GetInStationSubtitleListTask.kt", m97638l = {394}, m97639m = "saveAdnDownload")
final class GetInStationSubtitleListTask$saveAdnDownload$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetInStationSubtitleListTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetInStationSubtitleListTask$saveAdnDownload$1(GetInStationSubtitleListTask getInStationSubtitleListTask, Continuation<? super GetInStationSubtitleListTask$saveAdnDownload$1> continuation) {
        super(continuation);
        this.this$0 = getInStationSubtitleListTask;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m82308o(null, null, null, 0, 0, 0, null, false, null, null, null, this);
    }
}
