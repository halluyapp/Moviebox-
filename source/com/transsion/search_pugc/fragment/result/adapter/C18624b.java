package com.transsion.search_pugc.fragment.result.adapter;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.search_pugc.C18670g;
import com.transsion.search_pugc.bean.SearchResultItem;
import com.transsion.search_pugc.bean.SearchTab;
import com.transsion.search_pugc.fragment.result.provider.C18642c;
import com.transsion.search_pugc.fragment.result.provider.C18643d;
import com.transsion.search_pugc.fragment.result.provider.C18650k;
import com.transsion.search_pugc.fragment.result.provider.C18651l;
import com.transsion.search_pugc.fragment.result.provider.C18658s;
import com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t;
import com.transsion.search_pugc.fragment.result.provider.ResultVerticalRankType2Provider;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fr.C23422a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;
import p840vj.C28117b;

/* JADX INFO: renamed from: com.transsion.search_pugc.fragment.result.adapter.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B-\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010 J\u001f\u0010\"\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010 J\u001f\u0010#\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010 R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, m97100d2 = {"Lcom/transsion/search_pugc/fragment/result/adapter/b;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/search_pugc/bean/SearchResultItem;", "Lu6/i;", "Lcom/transsion/search_pugc/fragment/result/provider/t;", "Lvj/b;", "exposureHelper", "", "keyword", "Lcom/transsion/search_pugc/bean/SearchTab;", "searchTab", "Lfr/a;", "secondTab", "<init>", "(Lvj/b;Ljava/lang/String;Lcom/transsion/search_pugc/bean/SearchTab;Lfr/a;)V", "", "data", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "", "B0", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", WebConstants.FIELD_ITEM, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "(Lcom/transsion/search_pugc/bean/SearchResultItem;I)V", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "ugcVideo", "c", "(Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;I)V", "Q1", "e", "a", "G", "Lvj/b;", "H", "Ljava/lang/String;", "I", "Lcom/transsion/search_pugc/bean/SearchTab;", "J", "Lfr/a;", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C18624b extends BaseProviderMultiAdapter<SearchResultItem> implements InterfaceC27944i, InterfaceC18659t {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C28117b exposureHelper;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final String keyword;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final SearchTab searchTab;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private C23422a secondTab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18624b(C28117b c28117b, String str, SearchTab searchTab, C23422a secondTab) {
        super(null, 1, null);
        Intrinsics.m97802h(secondTab, "secondTab");
        this.exposureHelper = c28117b;
        this.keyword = str;
        this.searchTab = searchTab;
        this.secondTab = secondTab;
        mo36107F1(new C18658s(this));
        mo36107F1(new C18650k(this));
        mo36107F1(new C18643d(this));
        mo36107F1(new C18642c(this));
        mo36107F1(new ResultVerticalRankType2Provider(this));
        mo36107F1(new C18651l());
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
    protected int mo36112N1(List<? extends SearchResultItem> data, int position) {
        Intrinsics.m97802h(data, "data");
        return data.get(position).getSearchType().ordinal();
    }

    /* JADX INFO: renamed from: Q1 */
    public void m78411Q1(UGCVideo ugcVideo, int position) {
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        if (this.searchTab == null) {
            return;
        }
        C18670g.f60281h.m78520a(getContext()).m78517y(ugcVideo, position, this.keyword, this.searchTab, this.secondTab.m92990a());
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: a */
    public void mo78412a(UGCVideo ugcVideo, int position) {
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        if (this.searchTab == null) {
            return;
        }
        C18670g.f60281h.m78520a(getContext()).m78504l(ugcVideo, position, this.keyword, this.searchTab, this.secondTab.m92990a());
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: c */
    public void mo78413c(UGCVideo ugcVideo, int position) {
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        if (this.searchTab == null) {
            return;
        }
        C18670g.f60281h.m78520a(getContext()).m78513u(ugcVideo, position, this.keyword, this.searchTab, this.secondTab.m92990a());
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: d */
    public void mo78414d(SearchResultItem item, int position) {
        Intrinsics.m97802h(item, "item");
        if (this.searchTab == null) {
            return;
        }
        C18670g.f60281h.m78520a(getContext()).m78515w(item, position, this.keyword, this.searchTab, this.secondTab.m92990a());
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: e */
    public void mo78415e(UGCVideo ugcVideo, int position) {
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        if (this.searchTab == null) {
            return;
        }
        C18670g.f60281h.m78520a(getContext()).m78503k(ugcVideo, position, this.keyword, this.searchTab, this.secondTab.m92990a());
    }
}
