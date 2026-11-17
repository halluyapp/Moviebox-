package com.transsion.postdetail.p306ui.fragment;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* synthetic */ class LocalVideoDetailFragment$screenHelper$2$2 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    LocalVideoDetailFragment$screenHelper$2$2(Object obj) {
        super(1, obj, LocalVideoDetailFragment.class, "autoScreenRotation", "autoScreenRotation(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.f75682a;
    }

    public final void invoke(boolean z11) {
        ((LocalVideoDetailFragment) this.receiver).m74111V1(z11);
    }
}
