package com.transsion.usercenter.setting.adapter;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;
import p923xw.C28668a;

/* JADX INFO: renamed from: com.transsion.usercenter.setting.adapter.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000fB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, m97100d2 = {"Lcom/transsion/usercenter/setting/adapter/b;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lxw/a;", "Lu6/i;", "", "dataList", "<init>", "(Ljava/util/List;)V", "", "data", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "G", "a", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C20790b extends BaseProviderMultiAdapter<C28668a> implements InterfaceC27944i {

    /* JADX INFO: renamed from: H */
    public static final int f65438H = 1;

    /* JADX INFO: renamed from: I */
    public static final int f65439I = 2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20790b(List<C28668a> dataList) {
        super(CollectionsKt.m97343U0(dataList));
        Intrinsics.m97802h(dataList, "dataList");
        mo36107F1(new C20789a());
        mo36107F1(new C20791c());
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends C28668a> data, int position) {
        Intrinsics.m97802h(data, "data");
        return position == 0 ? 1 : 2;
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
