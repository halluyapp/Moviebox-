package com.transsion.search_pugc.fragment.result;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.widget.R$mipmap;
import com.transsion.baseui.R$string;
import com.transsion.baseui.widget.ResourcesRequestView;
import com.transsion.publish.model.PostEntity;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search_pugc.C18670g;
import com.transsion.search_pugc.bean.SearchResultItem;
import com.transsion.search_pugc.bean.SearchTab;
import com.transsion.search_pugc.bean.SecondTab;
import com.transsion.search_pugc.bean.UGCPager;
import com.transsion.search_pugc.bean.UGCSearchResultData;
import com.transsion.search_pugc.constant.AbstractC18568a;
import com.transsion.search_pugc.fragment.BaseSearchMainFragment;
import com.transsion.search_pugc.fragment.result.adapter.C18624b;
import com.transsion.search_pugc.fragment.result.adapter.C18625c;
import com.transsion.search_pugc.widget.NoInterceptRecyclerView;
import com.transsion.ugcvideodetail.api.bean.UGCCollection;
import com.transsion.ugcvideodetail.api.bean.UGCVerticalRank;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fr.C23422a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import mg.C25829f;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p840vj.C28117b;
import p840vj.InterfaceC28116a;
import p881wq.C28423h;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 W2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u0004R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\u0005048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010M\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010(\u001a\u0004\bT\u0010U¨\u0006X"}, m97100d2 = {"Lcom/transsion/search_pugc/fragment/result/SearchResultTabFragment;", "Lcom/transsion/search_pugc/fragment/BaseSearchMainFragment;", "Lwq/h;", "<init>", "()V", "Lcom/transsion/search_pugc/bean/SearchResultItem;", "it", "", RequestParameters.POSITION, "", "z0", "(Lcom/transsion/search_pugc/bean/SearchResultItem;I)V", "q0", "Landroid/view/View;", "x0", "()Landroid/view/View;", "Landroid/view/LayoutInflater;", "inflater", "o0", "(Landroid/view/LayoutInflater;)Lwq/h;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "", "hidden", "onHiddenChanged", "(Z)V", "startLoading", "hideLoading", "lazyLoadData", "Lcom/transsion/search_pugc/fragment/result/adapter/b;", "a", "Lcom/transsion/search_pugc/fragment/result/adapter/b;", "mainAdapter", "Lcom/transsion/search_pugc/fragment/result/SearchResultViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "p0", "()Lcom/transsion/search_pugc/fragment/result/SearchResultViewModel;", "viewModel", "", "c", "Ljava/lang/String;", "keyword", "Lcom/transsion/search_pugc/bean/SearchTab;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/search_pugc/bean/SearchTab;", "tabItem", "", "e", "Ljava/util/List;", "items", "Lvj/b;", "f", "Lvj/b;", "exposureHelper", "Lcom/transsion/search_pugc/bean/SecondTab;", "g", "Lcom/transsion/search_pugc/bean/SecondTab;", "curSecondTab", "Lcom/transsion/search_pugc/bean/UGCSearchResultData;", "h", "Lcom/transsion/search_pugc/bean/UGCSearchResultData;", "searchResultData", "Lcom/transsion/baseui/widget/ResourcesRequestView;", "i", "Lcom/transsion/baseui/widget/ResourcesRequestView;", "requestView", "j", "Ljava/lang/Integer;", "requestMovieCount", CampaignEx.JSON_KEY_AD_K, "Z", "isLoadMoreEnd", "Lfr/a;", "l", "Lfr/a;", "secondTabRef", "Lcom/transsion/search_pugc/g;", "m", "getSearchReporter", "()Lcom/transsion/search_pugc/g;", "searchReporter", "n", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class SearchResultTabFragment extends BaseSearchMainFragment<C28423h> {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C18624b mainAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String keyword;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private SearchTab tabItem;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private C28117b exposureHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private SecondTab curSecondTab;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private UGCSearchResultData searchResultData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private ResourcesRequestView requestView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private Integer requestMovieCount;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean isLoadMoreEnd;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy viewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.search_pugc.fragment.result.l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchResultTabFragment.m78368B0(this.f60223a);
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private List items = CollectionsKt.m97506l();

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C23422a secondTabRef = new C23422a(null, 1, null);

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Lazy searchReporter = LazyKt.m97097b(new Function0() { // from class: com.transsion.search_pugc.fragment.result.m
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchResultTabFragment.m78367A0(this.f60224a);
        }
    });

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.result.SearchResultTabFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SearchResultTabFragment m78395a(String str, UGCSearchResultData uGCSearchResultData, SearchTab searchTab, String str2, String str3) {
            SearchResultTabFragment searchResultTabFragment = new SearchResultTabFragment();
            Bundle bundle = new Bundle();
            bundle.putString("keyword", str);
            bundle.putParcelable("tabItem", searchTab);
            bundle.putParcelable("searchData", uGCSearchResultData);
            bundle.putString("searchFrom", str2);
            bundle.putString("form_ugc_video_id", str3);
            searchResultTabFragment.setArguments(bundle);
            return searchResultTabFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.result.SearchResultTabFragment$b */
    public static final class C18619b implements InterfaceC28116a {
        C18619b() {
        }

        @Override // p840vj.InterfaceC28116a
        /* JADX INFO: renamed from: a */
        public void mo65894a(int i11, long j11, View view) {
            C18624b c18624b;
            List<Object> data;
            SearchResultItem searchResultItem;
            List<Object> data2;
            C18624b c18624b2 = SearchResultTabFragment.this.mainAdapter;
            if (i11 >= ((c18624b2 == null || (data2 = c18624b2.getData()) == null) ? 0 : data2.size()) || (c18624b = SearchResultTabFragment.this.mainAdapter) == null || (data = c18624b.getData()) == null || (searchResultItem = (SearchResultItem) data.get(i11)) == null) {
                return;
            }
            SearchResultTabFragment.this.getSearchReporter().m78514v(searchResultItem, i11, j11, SearchResultTabFragment.this.keyword, SearchResultTabFragment.this.tabItem, SearchResultTabFragment.this.secondTabRef.m92990a());
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.result.SearchResultTabFragment$c */
    static final class C18620c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f60197a;

        C18620c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f60197a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f60197a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3189c0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.m97797c(mo6065a(), ((FunctionAdapter) obj).mo6065a());
            }
            return false;
        }

        public final int hashCode() {
            return mo6065a().hashCode();
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f60197a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C18670g m78367A0(SearchResultTabFragment searchResultTabFragment) {
        return C18670g.f60281h.m78520a(searchResultTabFragment.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final SearchResultViewModel m78368B0(SearchResultTabFragment searchResultTabFragment) {
        return (SearchResultViewModel) new C3227v0(searchResultTabFragment).m14969a(SearchResultViewModel.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C18670g getSearchReporter() {
        return (C18670g) this.searchReporter.getValue();
    }

    /* JADX INFO: renamed from: p0 */
    private final SearchResultViewModel m78383p0() {
        return (SearchResultViewModel) this.viewModel.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    private final void m78384q0() {
        RecyclerView recyclerView;
        C28117b c28117b = new C28117b(0.6f, new C18619b(), false, 4, null);
        c28117b.m109199n(2);
        C28423h c28423h = (C28423h) getMViewBinding();
        if (c28423h != null && (recyclerView = c28423h.f87189b) != null) {
            recyclerView.addOnScrollListener(c28117b);
        }
        this.exposureHelper = c28117b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final Unit m78385r0(SearchResultTabFragment searchResultTabFragment, PostEntity postEntity) {
        C26866a.a.m104899g(C26866a.f81698a, "Post request succeed " + postEntity + ", " + (postEntity != null ? postEntity.getCount() : null), false, 2, null);
        if (postEntity != null && searchResultTabFragment.requestMovieCount == null) {
            int count = postEntity.getCount();
            if (count == null) {
                count = 0;
            }
            searchResultTabFragment.requestMovieCount = count;
            ResourcesRequestView resourcesRequestView = searchResultTabFragment.requestView;
            if (resourcesRequestView != null) {
                Integer count2 = postEntity.getCount();
                resourcesRequestView.setCount(count2 != null ? count2.intValue() : 0, false);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m78386s0(SearchResultTabFragment searchResultTabFragment, C18625c c18625c, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List<SecondTab> secondTabs;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        UGCSearchResultData uGCSearchResultData = searchResultTabFragment.searchResultData;
        SecondTab secondTab = (uGCSearchResultData == null || (secondTabs = uGCSearchResultData.getSecondTabs()) == null) ? null : secondTabs.get(i11);
        if (Intrinsics.m97797c(searchResultTabFragment.curSecondTab, secondTab)) {
            searchResultTabFragment.curSecondTab = null;
            searchResultTabFragment.secondTabRef.m92991b(null);
            c18625c.m78419E1(null);
            searchResultTabFragment.startLoading();
            searchResultTabFragment.m78383p0().m78410q(1);
            SearchResultViewModel searchResultViewModelM78383p0 = searchResultTabFragment.m78383p0();
            String str = searchResultTabFragment.keyword;
            String str2 = str == null ? "" : str;
            SearchTab searchTab = searchResultTabFragment.tabItem;
            searchResultViewModelM78383p0.m78408m(str2, searchTab != null ? searchTab.getTabId() : null, searchResultTabFragment.getSearchReporter().m78499f(), false, null);
        } else {
            searchResultTabFragment.curSecondTab = secondTab;
            searchResultTabFragment.secondTabRef.m92991b(secondTab);
            c18625c.m78419E1(secondTab);
            searchResultTabFragment.startLoading();
            searchResultTabFragment.m78383p0().m78410q(1);
            SearchResultViewModel searchResultViewModelM78383p1 = searchResultTabFragment.m78383p0();
            String str3 = searchResultTabFragment.keyword;
            String str4 = str3 == null ? "" : str3;
            SearchTab searchTab2 = searchResultTabFragment.tabItem;
            searchResultViewModelM78383p1.m78408m(str4, searchTab2 != null ? searchTab2.getTabId() : null, searchResultTabFragment.getSearchReporter().m78499f(), false, secondTab);
        }
        C28117b c28117b = searchResultTabFragment.exposureHelper;
        if (c28117b != null) {
            c28117b.m109196g();
        }
        C18670g searchReporter = searchResultTabFragment.getSearchReporter();
        String str5 = searchResultTabFragment.keyword;
        SearchTab searchTab3 = searchResultTabFragment.tabItem;
        UGCSearchResultData uGCSearchResultData2 = searchResultTabFragment.searchResultData;
        searchReporter.m78518z(str5, searchTab3, secondTab, uGCSearchResultData2 != null ? uGCSearchResultData2.getOps() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final void m78387t0(SearchResultTabFragment searchResultTabFragment) {
        SearchResultViewModel searchResultViewModelM78383p0 = searchResultTabFragment.m78383p0();
        String str = searchResultTabFragment.keyword;
        if (str == null) {
            str = "";
        }
        SearchTab searchTab = searchResultTabFragment.tabItem;
        searchResultViewModelM78383p0.m78408m(str, searchTab != null ? searchTab.getTabId() : null, searchResultTabFragment.getSearchReporter().m78499f(), true, searchResultTabFragment.curSecondTab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m78388u0(SearchResultTabFragment searchResultTabFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        SearchResultItem searchResultItem;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        C18624b c18624b = searchResultTabFragment.mainAdapter;
        if (c18624b == null || (searchResultItem = (SearchResultItem) c18624b.getItem(i11)) == null) {
            return;
        }
        searchResultTabFragment.m78393z0(searchResultItem, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final Unit m78389v0(SearchResultTabFragment searchResultTabFragment, UGCSearchResultData uGCSearchResultData) {
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        List<Object> data;
        String tabId = uGCSearchResultData != null ? uGCSearchResultData.getTabId() : null;
        SearchTab searchTab = searchResultTabFragment.tabItem;
        if (Intrinsics.m97797c(tabId, searchTab != null ? searchTab.getTabId() : null)) {
            Intrinsics.m97799e(uGCSearchResultData);
            if (uGCSearchResultData.getItems().isEmpty()) {
                C18624b c18624b = searchResultTabFragment.mainAdapter;
                if (c18624b != null && (data = c18624b.getData()) != null) {
                    data.clear();
                }
                C18624b c18624b2 = searchResultTabFragment.mainAdapter;
                if (c18624b2 != null) {
                    c18624b2.notifyDataSetChanged();
                }
                C18624b c18624b3 = searchResultTabFragment.mainAdapter;
                if (c18624b3 != null) {
                    c18624b3.m36171Y0(searchResultTabFragment.m78391x0());
                }
            } else {
                C18624b c18624b4 = searchResultTabFragment.mainAdapter;
                if (c18624b4 != null) {
                    c18624b4.mo36201n1(uGCSearchResultData.getItems());
                }
                UGCPager pager = uGCSearchResultData.getPager();
                if (pager == null || pager.getHasMore()) {
                    C18624b c18624b5 = searchResultTabFragment.mainAdapter;
                    if (c18624b5 != null && (c27941fM36186h0 = c18624b5.m36186h0()) != null) {
                        c27941fM36186h0.m108667s();
                    }
                } else {
                    C18624b c18624b6 = searchResultTabFragment.mainAdapter;
                    if (c18624b6 != null && (c27941fM36186h1 = c18624b6.m36186h0()) != null) {
                        C27941f.m108652u(c27941fM36186h1, false, 1, null);
                    }
                    searchResultTabFragment.isLoadMoreEnd = true;
                }
            }
            searchResultTabFragment.hideLoading();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final Unit m78390w0(SearchResultTabFragment searchResultTabFragment, UGCSearchResultData uGCSearchResultData) {
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        C27941f c27941fM36186h2;
        String tabId = uGCSearchResultData != null ? uGCSearchResultData.getTabId() : null;
        SearchTab searchTab = searchResultTabFragment.tabItem;
        if (Intrinsics.m97797c(tabId, searchTab != null ? searchTab.getTabId() : null)) {
            Intrinsics.m97799e(uGCSearchResultData);
            if (uGCSearchResultData.getItems().isEmpty()) {
                C18624b c18624b = searchResultTabFragment.mainAdapter;
                if (c18624b != null && (c27941fM36186h2 = c18624b.m36186h0()) != null) {
                    C27941f.m108652u(c27941fM36186h2, false, 1, null);
                }
            } else {
                C18624b c18624b2 = searchResultTabFragment.mainAdapter;
                if (c18624b2 != null) {
                    c18624b2.mo36208q(uGCSearchResultData.getItems());
                }
                UGCPager pager = uGCSearchResultData.getPager();
                if (pager == null || pager.getHasMore()) {
                    C18624b c18624b3 = searchResultTabFragment.mainAdapter;
                    if (c18624b3 != null && (c27941fM36186h0 = c18624b3.m36186h0()) != null) {
                        c27941fM36186h0.m108667s();
                    }
                } else {
                    C18624b c18624b4 = searchResultTabFragment.mainAdapter;
                    if (c18624b4 != null && (c27941fM36186h1 = c18624b4.m36186h0()) != null) {
                        C27941f.m108652u(c27941fM36186h1, false, 1, null);
                    }
                }
            }
        }
        searchResultTabFragment.hideLoading();
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x0 */
    private final View m78391x0() {
        LayoutInflater layoutInflater = getLayoutInflater();
        int i11 = R$layout.view_search_no_network;
        C28423h c28423h = (C28423h) getMViewBinding();
        View viewInflate = layoutInflater.inflate(i11, (ViewGroup) (c28423h != null ? c28423h.f87189b : null), false);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_empty_tips);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.iv_tips);
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewInflate.findViewById(R$id.tv_retry);
        textView.setText(R$string.base_net_err);
        imageView.setImageResource(R$mipmap.ic_no_network);
        appCompatTextView.setVisibility(0);
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search_pugc.fragment.result.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchResultTabFragment.m78392y0(this.f60225a, view);
            }
        });
        Intrinsics.m97799e(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m78392y0(SearchResultTabFragment searchResultTabFragment, View view) {
        searchResultTabFragment.lazyLoadData();
    }

    /* JADX INFO: renamed from: z0 */
    private final void m78393z0(SearchResultItem it, int position) {
        List<UGCVideo> videos;
        UGCVideo uGCVideo;
        String topicType = it.getTopicType();
        if (topicType != null) {
            switch (topicType.hashCode()) {
                case -1989652851:
                    if (topicType.equals("UGC_VIDEO")) {
                        UGCVideo video = it.getVideo();
                        if (video != null) {
                            AbstractC18568a.m78235h(video, false, 1, null);
                        }
                        C18624b c18624b = this.mainAdapter;
                        if (c18624b != null) {
                            c18624b.mo78414d(it, position);
                        }
                        break;
                    }
                    break;
                case 511113132:
                    if (topicType.equals("UGC_COLLECTION")) {
                        UGCCollection collection = it.getCollection();
                        if (collection != null && (videos = collection.getVideos()) != null && (uGCVideo = (UGCVideo) CollectionsKt.m97361k0(videos)) != null) {
                            AbstractC18568a.m78235h(uGCVideo, false, 1, null);
                        }
                        C18624b c18624b2 = this.mainAdapter;
                        if (c18624b2 != null) {
                            c18624b2.mo78414d(it, position);
                        }
                        break;
                    }
                    break;
                case 932115657:
                    topicType.equals("HASH_TAG");
                    break;
                case 2033770325:
                    if (topicType.equals("VERTICAL_RANK")) {
                        UGCVerticalRank verticalRank = it.getVerticalRank();
                        if (verticalRank != null) {
                            UGCSearchResultData uGCSearchResultData = this.searchResultData;
                            AbstractC18568a.m78233f(verticalRank, uGCSearchResultData != null ? uGCSearchResultData.getOps() : null);
                        }
                        C18624b c18624b3 = this.mainAdapter;
                        if (c18624b3 != null) {
                            c18624b3.mo78414d(it, position);
                        }
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void hideLoading() {
        RecyclerView recyclerView;
        ProgressBar progressBar;
        C28423h c28423h = (C28423h) getMViewBinding();
        if (c28423h != null && (progressBar = c28423h.f87191d) != null) {
            progressBar.setVisibility(4);
        }
        C28423h c28423h2 = (C28423h) getMViewBinding();
        if (c28423h2 == null || (recyclerView = c28423h2.f87189b) == null) {
            return;
        }
        recyclerView.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        List<SearchResultItem> listL;
        RecyclerView recyclerView;
        C27941f c27941fM36186h0;
        C18624b c18624b;
        C28423h c28423h;
        NoInterceptRecyclerView noInterceptRecyclerView;
        List<SecondTab> secondTabs;
        UGCSearchResultData uGCSearchResultDataM78364m0;
        Intrinsics.m97802h(view, "view");
        Bundle arguments = getArguments();
        this.keyword = arguments != null ? arguments.getString("keyword") : null;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("form_ugc_video_id") : null;
        Bundle arguments3 = getArguments();
        this.tabItem = arguments3 != null ? (SearchTab) arguments3.getParcelable("tabItem") : null;
        Bundle arguments4 = getArguments();
        UGCSearchResultData uGCSearchResultData = arguments4 != null ? (UGCSearchResultData) arguments4.getParcelable("searchData") : null;
        this.searchResultData = uGCSearchResultData;
        if (uGCSearchResultData == null) {
            Fragment parentFragment = getParentFragment();
            SearchResultFragment searchResultFragment = parentFragment instanceof SearchResultFragment ? (SearchResultFragment) parentFragment : null;
            if (searchResultFragment != null) {
                SearchTab searchTab = this.tabItem;
                uGCSearchResultDataM78364m0 = searchResultFragment.m78364m0(searchTab != null ? searchTab.getTabId() : null);
            } else {
                uGCSearchResultDataM78364m0 = null;
            }
            this.searchResultData = uGCSearchResultDataM78364m0;
        }
        UGCSearchResultData uGCSearchResultData2 = this.searchResultData;
        if (uGCSearchResultData2 == null || (listL = uGCSearchResultData2.getItems()) == null) {
            listL = CollectionsKt.m97506l();
        }
        this.items = listL;
        m78383p0().m78409p(string);
        UGCSearchResultData uGCSearchResultData3 = this.searchResultData;
        List<SecondTab> secondTabs2 = uGCSearchResultData3 != null ? uGCSearchResultData3.getSecondTabs() : null;
        if (secondTabs2 != null && !secondTabs2.isEmpty() && (c28423h = (C28423h) getMViewBinding()) != null && (noInterceptRecyclerView = c28423h.f87190c) != null) {
            noInterceptRecyclerView.setLayoutManager(new LinearLayoutManager(noInterceptRecyclerView.getContext(), 0, false));
            final C18625c c18625c = new C18625c(this.curSecondTab);
            UGCSearchResultData uGCSearchResultData4 = this.searchResultData;
            c18625c.mo36201n1((uGCSearchResultData4 == null || (secondTabs = uGCSearchResultData4.getSecondTabs()) == null) ? new ArrayList<>() : secondTabs);
            noInterceptRecyclerView.setAdapter(c18625c);
            c18625c.m36227w1(new InterfaceC27566d() { // from class: com.transsion.search_pugc.fragment.result.f
                @Override // p765s6.InterfaceC27566d
                /* JADX INFO: renamed from: a */
                public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                    SearchResultTabFragment.m78386s0(this.f60216a, c18625c, baseQuickAdapter, view2, i11);
                }
            });
        }
        C28423h c28423h2 = (C28423h) getMViewBinding();
        if (c28423h2 != null && (recyclerView = c28423h2.f87189b) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            UGCSearchResultData uGCSearchResultData5 = this.searchResultData;
            List<SecondTab> secondTabs3 = uGCSearchResultData5 != null ? uGCSearchResultData5.getSecondTabs() : null;
            if (secondTabs3 == null || secondTabs3.isEmpty()) {
                recyclerView.addItemDecoration(new C25829f(0.0f, 1.0f, 6.0f, 1, null));
            }
            C18624b c18624b2 = new C18624b(null, this.keyword, this.tabItem, this.secondTabRef);
            this.mainAdapter = c18624b2;
            recyclerView.setAdapter(c18624b2);
            if (!this.items.isEmpty() && (c18624b = this.mainAdapter) != null) {
                c18624b.mo36201n1(this.items);
            }
            C18624b c18624b3 = this.mainAdapter;
            if (c18624b3 != null && (c27941fM36186h0 = c18624b3.m36186h0()) != null) {
                c27941fM36186h0.m108656D(new InterfaceC27568f() { // from class: com.transsion.search_pugc.fragment.result.g
                    @Override // p765s6.InterfaceC27568f
                    /* JADX INFO: renamed from: a */
                    public final void mo63874a() {
                        SearchResultTabFragment.m78387t0(this.f60218a);
                    }
                });
            }
        }
        C18624b c18624b4 = this.mainAdapter;
        if (c18624b4 != null) {
            c18624b4.m36227w1(new InterfaceC27566d() { // from class: com.transsion.search_pugc.fragment.result.h
                @Override // p765s6.InterfaceC27566d
                /* JADX INFO: renamed from: a */
                public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                    SearchResultTabFragment.m78388u0(this.f60219a, baseQuickAdapter, view2, i11);
                }
            });
        }
        m78383p0().m78407l().m14851j(getViewLifecycleOwner(), new C18620c(new Function1() { // from class: com.transsion.search_pugc.fragment.result.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchResultTabFragment.m78389v0(this.f60220a, (UGCSearchResultData) obj);
            }
        }));
        m78383p0().m78406k().m14851j(getViewLifecycleOwner(), new C18620c(new Function1() { // from class: com.transsion.search_pugc.fragment.result.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchResultTabFragment.m78390w0(this.f60221a, (UGCSearchResultData) obj);
            }
        }));
        m78383p0().m78404h().m14851j(this, new C18620c(new Function1() { // from class: com.transsion.search_pugc.fragment.result.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchResultTabFragment.m78385r0(this.f60222a, (PostEntity) obj);
            }
        }));
        m78384q0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        C27941f c27941fM36186h0;
        UGCPager pager;
        C27941f c27941fM36186h1;
        NoInterceptRecyclerView noInterceptRecyclerView;
        int size = this.items.size();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lazyLoadData size: ");
        sb2.append(size);
        UGCSearchResultData uGCSearchResultData = this.searchResultData;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("lazyLoadData searchResultData: ");
        sb3.append(uGCSearchResultData);
        C28423h c28423h = (C28423h) getMViewBinding();
        if (c28423h != null && (noInterceptRecyclerView = c28423h.f87190c) != null) {
            UGCSearchResultData uGCSearchResultData2 = this.searchResultData;
            List<SecondTab> secondTabs = uGCSearchResultData2 != null ? uGCSearchResultData2.getSecondTabs() : null;
            noInterceptRecyclerView.setVisibility((secondTabs == null || secondTabs.isEmpty()) ? 8 : 0);
        }
        if (this.items.isEmpty()) {
            startLoading();
            SearchResultViewModel searchResultViewModelM78383p0 = m78383p0();
            String str = this.keyword;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            SearchTab searchTab = this.tabItem;
            SearchResultViewModel.m78401n(searchResultViewModelM78383p0, str2, searchTab != null ? searchTab.getTabId() : null, getSearchReporter().m78499f(), false, this.curSecondTab, 8, null);
            return;
        }
        C18624b c18624b = this.mainAdapter;
        if (c18624b != null) {
            c18624b.mo36201n1(this.items);
        }
        UGCSearchResultData uGCSearchResultData3 = this.searchResultData;
        if (uGCSearchResultData3 == null || (pager = uGCSearchResultData3.getPager()) == null || pager.getHasMore()) {
            C18624b c18624b2 = this.mainAdapter;
            if (c18624b2 != null && (c27941fM36186h0 = c18624b2.m36186h0()) != null) {
                c27941fM36186h0.m108667s();
            }
            m78383p0().m78410q(2);
            return;
        }
        C18624b c18624b3 = this.mainAdapter;
        if (c18624b3 == null || (c27941fM36186h1 = c18624b3.m36186h0()) == null) {
            return;
        }
        c27941fM36186h1.m108668t(true);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public C28423h getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28423h c28423hM109824c = C28423h.m109824c(inflater);
        Intrinsics.m97801g(c28423hM109824c, "inflate(...)");
        return c28423hM109824c;
    }

    @Override // com.transsion.search_pugc.fragment.BaseSearchMainFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        C28117b c28117b;
        super.onHiddenChanged(hidden);
        if (!hidden || (c28117b = this.exposureHelper) == null) {
            return;
        }
        c28117b.m109195f();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C28117b c28117b = this.exposureHelper;
        if (c28117b != null) {
            c28117b.m109195f();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        C18624b c18624b;
        C27941f c27941fM36186h0;
        super.onResume();
        if (!this.isLoadMoreEnd || (c18624b = this.mainAdapter) == null || (c27941fM36186h0 = c18624b.m36186h0()) == null) {
            return;
        }
        C27941f.m108652u(c27941fM36186h0, false, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void startLoading() {
        NoInterceptRecyclerView noInterceptRecyclerView;
        RecyclerView recyclerView;
        ProgressBar progressBar;
        C28423h c28423h = (C28423h) getMViewBinding();
        if (c28423h != null && (progressBar = c28423h.f87191d) != null) {
            progressBar.setVisibility(0);
        }
        C28423h c28423h2 = (C28423h) getMViewBinding();
        if (c28423h2 != null && (recyclerView = c28423h2.f87189b) != null) {
            recyclerView.setVisibility(4);
        }
        C28423h c28423h3 = (C28423h) getMViewBinding();
        if (c28423h3 == null || (noInterceptRecyclerView = c28423h3.f87190c) == null) {
            return;
        }
        noInterceptRecyclerView.setEnabled(false);
    }
}
