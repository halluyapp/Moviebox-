package com.transsion.postdetail.shorttv_pugc.factory;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@DebugMetadata(m97636c = "com.transsion.postdetail.shorttv_pugc.factory.PugcShortTvDownloadProvider", m97637f = "PugcShortTvDownloadProvider.kt", m97638l = {Sdk$SDKMetric.SDKMetricType.AD_REWARD_USER_VALUE}, m97639m = "getDownloadUGCVideo")
final class PugcShortTvDownloadProvider$getDownloadUGCVideo$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PugcShortTvDownloadProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PugcShortTvDownloadProvider$getDownloadUGCVideo$1(PugcShortTvDownloadProvider pugcShortTvDownloadProvider, Continuation<? super PugcShortTvDownloadProvider$getDownloadUGCVideo$1> continuation) {
        super(continuation);
        this.this$0 = pugcShortTvDownloadProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo73793e(null, this);
    }
}
