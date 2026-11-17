package com.transsion.search.fragment.result.adapter;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ar.C4699a;
import ar.C4700b;
import ar.C4701c;
import ar.C4702d;
import ar.C4704f;
import ar.C4705g;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.search.fragment.result.ResultWrapData;
import com.transsion.search.widget.C18541d;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;
import p840vj.C28117b;

/* JADX INFO: renamed from: com.transsion.search.fragment.result.adapter.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B9\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010#¨\u0006'"}, m97100d2 = {"Lcom/transsion/search/fragment/result/adapter/a;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/search/fragment/result/ResultWrapData;", "Lu6/i;", "Lvj/b;", "exposureHelper", "", "keyword", "searchFrom", "tabId", "sugSource", "<init>", "(Lvj/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "data", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "", "S1", "(Ljava/lang/String;)V", "Q1", "()Ljava/lang/String;", "Lcom/transsion/moviedetailapi/bean/Subject;", "subject", "R1", "(Lcom/transsion/moviedetailapi/bean/Subject;I)V", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "B0", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "G", "Lvj/b;", "H", "Ljava/lang/String;", "I", "J", "K", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C18471a extends BaseProviderMultiAdapter<ResultWrapData> implements InterfaceC27944i {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C28117b exposureHelper;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final String keyword;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final String searchFrom;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private String tabId;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final String sugSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18471a(C28117b c28117b, String str, String str2, String str3, String sugSource) {
        super(null, 1, null);
        Intrinsics.m97802h(sugSource, "sugSource");
        this.exposureHelper = c28117b;
        this.keyword = str;
        this.searchFrom = str2;
        this.tabId = str3;
        this.sugSource = sugSource;
        mo36107F1(new C4699a());
        mo36107F1(new C4700b());
        mo36107F1(new C4701c());
        mo36107F1(new C4702d());
        mo36107F1(new C4704f());
        mo36107F1(new C4705g());
    }

    public /* synthetic */ C18471a(C28117b c28117b, String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(c28117b, str, str2, str3, (i11 & 16) != 0 ? "mb_sug" : str4);
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter, com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: B0 */
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        C28117b c28117b = this.exposureHelper;
        if (c28117b != null) {
            RecyclerView.AbstractC4214m layoutManager = getRecyclerView().getLayoutManager();
            Intrinsics.m97800f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            C28117b.m109192j(c28117b, (LinearLayoutManager) layoutManager, bindingAdapterPosition, true, false, 8, null);
        }
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends ResultWrapData> data, int position) {
        Intrinsics.m97802h(data, "data");
        return data.get(position).getType().ordinal();
    }

    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final String getTabId() {
        return this.tabId;
    }

    /* JADX INFO: renamed from: R1 */
    public final void m77911R1(Subject subject, int position) {
        C18541d.f60046a.m78141u(subject, position, this.keyword, this.searchFrom, this.tabId, this.sugSource);
    }

    /* JADX INFO: renamed from: S1 */
    public final void m77912S1(String tabId) {
        Intrinsics.m97802h(tabId, "tabId");
        this.tabId = tabId;
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
