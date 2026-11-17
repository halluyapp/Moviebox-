package com.transsion.postdetail.shorttv.factory;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@DebugMetadata(m97636c = "com.transsion.postdetail.shorttv.factory.ShortTvDownloadProvider", m97637f = "ShortTvDownloadProvider.kt", m97638l = {185}, m97639m = "getDownloadSubject")
final class ShortTvDownloadProvider$getDownloadSubject$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ShortTvDownloadProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvDownloadProvider$getDownloadSubject$1(ShortTvDownloadProvider shortTvDownloadProvider, Continuation<? super ShortTvDownloadProvider$getDownloadSubject$1> continuation) {
        super(continuation);
        this.this$0 = shortTvDownloadProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo73644j(null, this);
    }
}
