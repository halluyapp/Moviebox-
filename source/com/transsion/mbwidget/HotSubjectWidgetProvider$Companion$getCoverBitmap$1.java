package com.transsion.mbwidget;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.p278ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@DebugMetadata(m97636c = "com.transsion.mbwidget.HotSubjectWidgetProvider$Companion", m97637f = "HotSubjectWidgetProvider.kt", m97638l = {PsExtractor.AUDIO_STREAM}, m97639m = "getCoverBitmap")
final class HotSubjectWidgetProvider$Companion$getCoverBitmap$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HotSubjectWidgetProvider.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotSubjectWidgetProvider$Companion$getCoverBitmap$1(HotSubjectWidgetProvider.Companion companion, Continuation<? super HotSubjectWidgetProvider$Companion$getCoverBitmap$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m69601d(null, 0, this);
    }
}
