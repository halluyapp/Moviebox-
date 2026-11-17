package com.transsion.shorttv.p315ui.adapter;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.transsion.shorttv.p315ui.adapter.provider.C18928a;
import com.transsion.shorttv.p315ui.adapter.provider.C18929b;
import com.transsion.shorttv.p315ui.adapter.provider.ShortTvListSubjectProvider;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p331ct.C22777a;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: renamed from: com.transsion.shorttv.ui.adapter.h */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m97100d2 = {"Lcom/transsion/shorttv/ui/adapter/h;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lct/a;", "Lu6/i;", "", "pageName", "", "isDownloadBtn", "<init>", "(Ljava/lang/String;Z)V", "", "data", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "Q1", "()I", "G", "Ljava/lang/String;", "R1", "()Ljava/lang/String;", "H", "Z", "S1", "()Z", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class C18909h extends BaseProviderMultiAdapter<C22777a> implements InterfaceC27944i {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final String pageName;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final boolean isDownloadBtn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18909h(String pageName, boolean z11) {
        super(null, 1, null);
        Intrinsics.m97802h(pageName, "pageName");
        this.pageName = pageName;
        this.isDownloadBtn = z11;
        mo36107F1(new C18928a(pageName));
        mo36107F1(new ShortTvListSubjectProvider(pageName, z11));
        mo36107F1(new C18929b());
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends C22777a> data, int position) {
        Intrinsics.m97802h(data, "data");
        C22777a c22777a = (C22777a) CollectionsKt.m97362l0(data, position);
        if (c22777a != null) {
            return c22777a.m90709d();
        }
        return -1;
    }

    /* JADX INFO: renamed from: Q1 */
    public final int m79558Q1() {
        List<Object> data = getData();
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (((C22777a) obj).m90709d() == 0) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    /* JADX INFO: renamed from: R1, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    /* JADX INFO: renamed from: S1, reason: from getter */
    public final boolean getIsDownloadBtn() {
        return this.isDownloadBtn;
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
