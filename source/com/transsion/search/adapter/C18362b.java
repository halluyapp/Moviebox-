package com.transsion.search.adapter;

import android.content.Context;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.transsion.search.bean.SearchSubject;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p789tq.C27841a;
import p789tq.C27844d;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: renamed from: com.transsion.search.adapter.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
@Metadata(m97099d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0011B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m97100d2 = {"Lcom/transsion/search/adapter/b;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/search/bean/SearchSubject;", "Lu6/i;", "Landroid/content/Context;", "context", "", "datas", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "", "data", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "G", "a", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C18362b extends BaseProviderMultiAdapter<SearchSubject> implements InterfaceC27944i {

    /* JADX INFO: renamed from: H */
    public static final int f59708H = 0;

    /* JADX INFO: renamed from: I */
    public static final int f59709I = 1;

    /* JADX INFO: renamed from: J */
    private static String f59710J = "";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18362b(Context context, List<SearchSubject> datas) {
        super(datas);
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(datas, "datas");
        mo36107F1(new C27844d(context));
        mo36107F1(new C27841a());
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends SearchSubject> data, int position) {
        Intrinsics.m97802h(data, "data");
        return data.get(position).getViewType();
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
