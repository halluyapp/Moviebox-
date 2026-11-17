package com.transsion.shorttv.p315ui.dialog;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import rs.C27362r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* synthetic */ class ShortTvAlertDialog$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C27362r> {
    public static final ShortTvAlertDialog$bindingInflater$1 INSTANCE = new ShortTvAlertDialog$bindingInflater$1();

    ShortTvAlertDialog$bindingInflater$1() {
        super(3, C27362r.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/transsion/shorttv/databinding/ShortTvDialogAlertBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
    }

    public final C27362r invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
        Intrinsics.m97802h(p11, "p0");
        return C27362r.m106501c(p11, viewGroup, z11);
    }
}
