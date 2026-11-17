package com.transsion.member;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@DebugMetadata(m97636c = "com.transsion.member.MemberProvider", m97637f = "MemberProvider.kt", m97638l = {TTAdConstant.DEEPLINK_UNAVAILABLE_CODE, TTAdConstant.VIDEO_INFO_CODE}, m97639m = "checkMemberRights")
final class MemberProvider$checkMemberRights$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MemberProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MemberProvider$checkMemberRights$1(MemberProvider memberProvider, Continuation<? super MemberProvider$checkMemberRights$1> continuation) {
        super(continuation);
        this.this$0 = memberProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo69848b(null, null, null, this);
    }
}
