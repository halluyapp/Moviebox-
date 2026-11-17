package com.transsion.home.fragment.filter;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import p912xl.C28609a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* synthetic */ class FilterFragment$initFilter$1 extends FunctionReferenceImpl implements Function1<C28609a, Unit> {
    FilterFragment$initFilter$1(Object obj) {
        super(1, obj, FilterFragment.class, "reportClick", "reportClick(Lcom/transsion/home/view/filter/item/FilterItem;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C28609a) obj);
        return Unit.f75682a;
    }

    public final void invoke(C28609a p11) {
        Intrinsics.m97802h(p11, "p0");
        ((FilterFragment) this.receiver).m67717y1(p11);
    }
}
