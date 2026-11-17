package com.transsion.postdetail.p306ui.fragment.preload;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@DebugMetadata(m97636c = "com.transsion.postdetail.ui.fragment.preload.ShortTvVideoImmersiveDataLoader$loadDataFromService$1$4", m97637f = "ShortTvVideoImmersiveDataLoader.kt", m97638l = {46}, m97639m = "emit")
final class ShortTvVideoImmersiveDataLoader$loadDataFromService$1$4$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ShortTvVideoImmersiveDataLoader$loadDataFromService$1.C172164 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvVideoImmersiveDataLoader$loadDataFromService$1$4$emit$1(ShortTvVideoImmersiveDataLoader$loadDataFromService$1.C172164 c172164, Continuation<? super ShortTvVideoImmersiveDataLoader$loadDataFromService$1$4$emit$1> continuation) {
        super(continuation);
        this.this$0 = c172164;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
