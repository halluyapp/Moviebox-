package com.transsion.usercenter.laboratory;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@DebugMetadata(m97636c = "com.transsion.usercenter.laboratory.LaboratoryActivity", m97637f = "LaboratoryActivity.kt", m97638l = {113}, m97639m = "restartApp")
final class LaboratoryActivity$restartApp$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LaboratoryActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LaboratoryActivity$restartApp$1(LaboratoryActivity laboratoryActivity, Continuation<? super LaboratoryActivity$restartApp$1> continuation) {
        super(continuation);
        this.this$0 = laboratoryActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m84904M0(null, this);
    }
}
