package com.transsion.home.adapter.suboperate.provider;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@DebugMetadata(m97636c = "com.transsion.home.adapter.suboperate.provider.SubRankListProvider$registerCourse$1$1", m97637f = "SubRankListProvider.kt", m97638l = {153}, m97639m = "emit")
final class SubRankListProvider$registerCourse$1$1$emit$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubRankListProvider$registerCourse$1.C149521 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubRankListProvider$registerCourse$1$1$emit$1(SubRankListProvider$registerCourse$1.C149521 c149521, Continuation<? super SubRankListProvider$registerCourse$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = c149521;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
