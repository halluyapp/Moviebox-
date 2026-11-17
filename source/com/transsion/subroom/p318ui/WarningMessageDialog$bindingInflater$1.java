package com.transsion.subroom.p318ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import p418fu.C23433c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* synthetic */ class WarningMessageDialog$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C23433c> {
    public static final WarningMessageDialog$bindingInflater$1 INSTANCE = new WarningMessageDialog$bindingInflater$1();

    WarningMessageDialog$bindingInflater$1() {
        super(3, C23433c.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/transsion/subroom/databinding/DialogWarningMessageBinding;", 0);
    }

    public final C23433c invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
        Intrinsics.m97802h(p11, "p0");
        return C23433c.m93033c(p11, viewGroup, z11);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
    }
}
