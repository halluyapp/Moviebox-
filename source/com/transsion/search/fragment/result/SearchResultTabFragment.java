package com.transsion.search.fragment.result;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.p282tn.lib.widget.R$mipmap;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.R$string;
import com.transsion.baseui.widget.DrawableCenterTextView;
import com.transsion.baseui.widget.ResourcesRequestView;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.Staff;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.publish.model.PostEntity;
import com.transsion.pushapi.NoticePermissionFrom;
import com.transsion.search.AbstractC18381f;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search.bean.HotRankItem;
import com.transsion.search.bean.Pager;
import com.transsion.search.bean.SearchResultEntity;
import com.transsion.search.bean.TabItem;
import com.transsion.search.bean.VerticalRank;
import com.transsion.search.fragment.BaseSearchMainFragment;
import com.transsion.search.fragment.result.adapter.C18471a;
import com.transsion.search.fragment.result.adapter.C18472b;
import com.transsion.search.viewmodel.SearchViewModel;
import com.transsion.search.widget.C18541d;
import com.transsion.search_pugc.widget.NoInterceptRecyclerView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import dk.C22994g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import mg.C25825b;
import mg.C25829f;
import p743rh.C27287m;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p840vj.C28117b;
import p840vj.InterfaceC28116a;
import p880wp.C28415e;
import p881wq.C28423h;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 W2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010\u0004J\u0017\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010\u0012J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010\u0004R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00107R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010H\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00107R\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010P\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010S\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010V\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006X"}, m97100d2 = {"Lcom/transsion/search/fragment/result/SearchResultTabFragment;", "Lcom/transsion/search/fragment/BaseSearchMainFragment;", "Lwq/h;", "<init>", "()V", "Lcom/transsion/search/fragment/result/ResultWrapData;", "it", "", RequestParameters.POSITION, "", "G0", "(Lcom/transsion/search/fragment/result/ResultWrapData;I)V", "u0", "t0", "y0", "", "showTab", "H0", "(Z)V", "Landroid/view/View;", "D0", "()Landroid/view/View;", "Landroid/view/LayoutInflater;", "inflater", "r0", "(Landroid/view/LayoutInflater;)Lwq/h;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "hidden", "onHiddenChanged", "hideLoading", "lazyLoadData", "Lcom/transsion/search/fragment/result/adapter/a;", "a", "Lcom/transsion/search/fragment/result/adapter/a;", "mainAdapter", "Lcom/transsion/search/fragment/result/SearchResultViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "s0", "()Lcom/transsion/search/fragment/result/SearchResultViewModel;", "viewModel", "Lcom/transsion/search/viewmodel/SearchViewModel;", "c", "Lcom/transsion/search/viewmodel/SearchViewModel;", "searchViewModel", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/String;", "keyword", "Lcom/transsion/search/bean/TabItem;", "e", "Lcom/transsion/search/bean/TabItem;", "tabItem", "f", "searchFrom", "Lvj/b;", "g", "Lvj/b;", "exposureHelper", "", "h", "J", "lastScrollTime", "i", "currentTabId", "Lcom/transsion/search/bean/SearchResultEntity;", "j", "Lcom/transsion/search/bean/SearchResultEntity;", "extraResultData", "Lcom/transsion/baseui/widget/ResourcesRequestView;", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/baseui/widget/ResourcesRequestView;", "requestView", "l", "Ljava/lang/Integer;", "requestMovieCount", "m", "Z", "isLoadMoreEnd", "n", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class SearchResultTabFragment extends BaseSearchMainFragment<C28423h> {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C18471a mainAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy viewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.search.fragment.result.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchResultTabFragment.m77865I0(this.f59896a);
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private SearchViewModel searchViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String keyword;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private TabItem tabItem;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String searchFrom;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C28117b exposureHelper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long lastScrollTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String currentTabId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private SearchResultEntity extraResultData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private ResourcesRequestView requestView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private Integer requestMovieCount;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean isLoadMoreEnd;

    /* JADX INFO: renamed from: com.transsion.search.fragment.result.SearchResultTabFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SearchResultTabFragment m77892a(String str, TabItem tabItem, SearchResultEntity searchResultEntity, String str2) {
            Bundle bundle = new Bundle();
            bundle.putString("tabKeyword", str);
            bundle.putParcelable("tabItem", tabItem);
            if (searchResultEntity != null) {
                bundle.putParcelable("tabResult", searchResultEntity);
            }
            bundle.putString("searchFrom", str2);
            SearchResultTabFragment searchResultTabFragment = new SearchResultTabFragment();
            searchResultTabFragment.setArguments(bundle);
            return searchResultTabFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.result.SearchResultTabFragment$b */
    public /* synthetic */ class C18464b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f59867a;

        static {
            int[] iArr = new int[ResultType.values().length];
            try {
                iArr[ResultType.SUBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResultType.STAFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ResultType.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ResultType.VERTICAL_RANK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ResultType.MORE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f59867a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.result.SearchResultTabFragment$c */
    public static final class C18465c implements InterfaceC28116a {

        /* JADX INFO: renamed from: com.transsion.search.fragment.result.SearchResultTabFragment$c$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f59869a;

            static {
                int[] iArr = new int[ResultType.values().length];
                try {
                    iArr[ResultType.SUBJECT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ResultType.STAFF.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ResultType.GROUP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ResultType.VERTICAL_RANK.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f59869a = iArr;
            }
        }

        C18465c() {
        }

        @Override // p840vj.InterfaceC28116a
        /* JADX INFO: renamed from: a */
        public void mo65894a(int i11, long j11, View view) {
            String tabId;
            String strM78084s;
            String strM78084s2;
            String strM78084s3;
            String strM78084s4;
            List<Object> data;
            List<Object> data2;
            C18471a c18471a = SearchResultTabFragment.this.mainAdapter;
            if (i11 >= ((c18471a == null || (data2 = c18471a.getData()) == null) ? 0 : data2.size())) {
                return;
            }
            C18471a c18471a2 = SearchResultTabFragment.this.mainAdapter;
            if (c18471a2 == null || (tabId = c18471a2.getTabId()) == null) {
                tabId = SearchResultTabFragment.this.currentTabId;
            }
            String str = tabId;
            C18471a c18471a3 = SearchResultTabFragment.this.mainAdapter;
            ResultWrapData resultWrapData = (c18471a3 == null || (data = c18471a3.getData()) == null) ? null : (ResultWrapData) data.get(i11);
            ResultType type = resultWrapData != null ? resultWrapData.getType() : null;
            int i12 = type == null ? -1 : a.f59869a[type.ordinal()];
            if (i12 == 1) {
                C18541d.a aVar = C18541d.f60046a;
                Subject subject = resultWrapData.getSubject();
                String str2 = SearchResultTabFragment.this.keyword;
                String str3 = SearchResultTabFragment.this.searchFrom;
                SearchViewModel searchViewModel = SearchResultTabFragment.this.searchViewModel;
                aVar.m78140t(subject, i11, j11, str2, str3, str, (searchViewModel == null || (strM78084s = searchViewModel.m78084s()) == null) ? "mb_sug" : strM78084s);
                return;
            }
            if (i12 == 2) {
                C18541d.a aVar2 = C18541d.f60046a;
                Staff staff = resultWrapData.getStaff();
                String str4 = SearchResultTabFragment.this.keyword;
                String str5 = SearchResultTabFragment.this.searchFrom;
                SearchViewModel searchViewModel2 = SearchResultTabFragment.this.searchViewModel;
                aVar2.m78138r(staff, i11, j11, str4, str5, str, (searchViewModel2 == null || (strM78084s2 = searchViewModel2.m78084s()) == null) ? "mb_sug" : strM78084s2);
                return;
            }
            if (i12 == 3) {
                C18541d.a aVar3 = C18541d.f60046a;
                Group groups = resultWrapData.getGroups();
                String str6 = SearchResultTabFragment.this.keyword;
                String str7 = SearchResultTabFragment.this.searchFrom;
                SearchViewModel searchViewModel3 = SearchResultTabFragment.this.searchViewModel;
                aVar3.m78121a(groups, i11, j11, str6, str7, str, (searchViewModel3 == null || (strM78084s3 = searchViewModel3.m78084s()) == null) ? "mb_sug" : strM78084s3);
                return;
            }
            if (i12 != 4) {
                return;
            }
            C18541d.a aVar4 = C18541d.f60046a;
            VerticalRank verticalRank = resultWrapData.getVerticalRank();
            String str8 = SearchResultTabFragment.this.keyword;
            String str9 = SearchResultTabFragment.this.searchFrom;
            SearchViewModel searchViewModel4 = SearchResultTabFragment.this.searchViewModel;
            aVar4.m78130j(verticalRank, i11, j11, str8, str9, str, (searchViewModel4 == null || (strM78084s4 = searchViewModel4.m78084s()) == null) ? "mb_sug" : strM78084s4);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.result.SearchResultTabFragment$d */
    public static final class C18466d extends RecyclerView.AbstractC4219r {
        C18466d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            String strM78084s;
            RecyclerView recyclerView2;
            Intrinsics.m97802h(recyclerView, "recyclerView");
            if (i11 == 0) {
                SearchResultTabFragment.this.lastScrollTime = System.currentTimeMillis();
                return;
            }
            if (i11 != 1) {
                return;
            }
            C28423h c28423h = (C28423h) SearchResultTabFragment.this.getMViewBinding();
            RecyclerView.AbstractC4214m layoutManager = (c28423h == null || (recyclerView2 = c28423h.f87189b) == null) ? null : recyclerView2.getLayoutManager();
            int iFindLastVisibleItemPosition = layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition() : -1;
            C18541d.a aVar = C18541d.f60046a;
            String str = SearchResultTabFragment.this.currentTabId;
            String str2 = SearchResultTabFragment.this.keyword;
            long jCurrentTimeMillis = System.currentTimeMillis() - SearchResultTabFragment.this.lastScrollTime;
            SearchViewModel searchViewModel = SearchResultTabFragment.this.searchViewModel;
            if (searchViewModel == null || (strM78084s = searchViewModel.m78084s()) == null) {
                strM78084s = "mb_sug";
            }
            aVar.m78136p(str, str2, jCurrentTimeMillis, iFindLastVisibleItemPosition, strM78084s);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.result.SearchResultTabFragment$e */
    public static final class C18467e extends GridLayoutManager.AbstractC4187c {
        C18467e() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC4187c
        /* JADX INFO: renamed from: f */
        public int mo20742f(int i11) {
            ResultWrapData resultWrapData;
            C18471a c18471a = SearchResultTabFragment.this.mainAdapter;
            ResultType type = (c18471a == null || (resultWrapData = (ResultWrapData) c18471a.getItem(i11)) == null) ? null : resultWrapData.getType();
            return (type == ResultType.MORE || type == ResultType.TITLE) ? 2 : 1;
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.result.SearchResultTabFragment$f */
    static final class C18468f implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59872a;

        C18468f(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59872a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59872a;
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
            this.f59872a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final void m77857A0(SearchResultTabFragment searchResultTabFragment, C18472b c18472b, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        String tabId;
        String strM78084s;
        List<TabItem> subs;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        TabItem tabItem = searchResultTabFragment.tabItem;
        TabItem tabItem2 = (tabItem == null || (subs = tabItem.getSubs()) == null) ? null : subs.get(i11);
        if (Intrinsics.m97797c(searchResultTabFragment.currentTabId, tabItem2 != null ? tabItem2.getTabId() : null)) {
            return;
        }
        searchResultTabFragment.currentTabId = tabItem2 != null ? tabItem2.getTabId() : null;
        if (tabItem2 == null || (tabId = tabItem2.getTabId()) == null) {
            tabId = "";
        }
        c18472b.m77914C1(tabId);
        searchResultTabFragment.m77864H0(true);
        searchResultTabFragment.m77883s0().m77908r(1);
        SearchResultViewModel searchResultViewModelM77883s0 = searchResultTabFragment.m77883s0();
        String str = searchResultTabFragment.keyword;
        SearchResultViewModel.m77901p(searchResultViewModelM77883s0, str == null ? "" : str, searchResultTabFragment.currentTabId, false, 4, null);
        C28117b c28117b = searchResultTabFragment.exposureHelper;
        if (c28117b != null) {
            c28117b.m109196g();
        }
        C18541d.a aVar = C18541d.f60046a;
        String str2 = searchResultTabFragment.keyword;
        String str3 = searchResultTabFragment.currentTabId;
        SearchViewModel searchViewModel = searchResultTabFragment.searchViewModel;
        if (searchViewModel == null || (strM78084s = searchViewModel.m78084s()) == null) {
            strM78084s = "mb_sug";
        }
        aVar.m78144x(str2, str3, strM78084s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final void m77858B0(SearchResultTabFragment searchResultTabFragment) {
        SearchResultViewModel searchResultViewModelM77883s0 = searchResultTabFragment.m77883s0();
        String str = searchResultTabFragment.keyword;
        if (str == null) {
            str = "";
        }
        String str2 = searchResultTabFragment.currentTabId;
        searchResultViewModelM77883s0.m77907o(str, str2 != null ? str2 : "", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final void m77859C0(SearchResultTabFragment searchResultTabFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        ResultWrapData resultWrapData;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        C18471a c18471a = searchResultTabFragment.mainAdapter;
        if (c18471a == null || (resultWrapData = (ResultWrapData) c18471a.getItem(i11)) == null) {
            return;
        }
        searchResultTabFragment.m77863G0(resultWrapData, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D0 */
    private final View m77860D0() {
        DrawableCenterTextView drawableCenterTextView;
        if (!C27287m.f83003a.m106330e()) {
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
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search.fragment.result.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchResultTabFragment.m77862F0(this.f59904a, view);
                }
            });
            Intrinsics.m97799e(viewInflate);
            return viewInflate;
        }
        LayoutInflater layoutInflater2 = getLayoutInflater();
        int i12 = R$layout.view_search_empty;
        C28423h c28423h2 = (C28423h) getMViewBinding();
        View viewInflate2 = layoutInflater2.inflate(i12, (ViewGroup) (c28423h2 != null ? c28423h2.f87189b : null), false);
        final ResourcesRequestView resourcesRequestView = (ResourcesRequestView) viewInflate2.findViewById(R$id.resources_request);
        this.requestView = resourcesRequestView;
        final String str = this.keyword;
        if (str == null) {
            str = "";
        }
        if (str.length() > 10) {
            String strSubstring = str.substring(0, 10);
            Intrinsics.m97801g(strSubstring, "substring(...)");
            str = strSubstring + "...";
        }
        String string = getString(com.transsion.search.R$string.search_value_no_result, this.keyword);
        Intrinsics.m97801g(string, "getString(...)");
        resourcesRequestView.set(string);
        resourcesRequestView.setGray(true);
        m77883s0().m77906m(str, true);
        this.requestMovieCount = null;
        C22994g mViewBinding = resourcesRequestView.getMViewBinding();
        if (mViewBinding != null && (drawableCenterTextView = mViewBinding.f70213e) != null) {
            drawableCenterTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search.fragment.result.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchResultTabFragment.m77861E0(this.f59901a, str, resourcesRequestView, view);
                }
            });
        }
        Intrinsics.m97799e(viewInflate2);
        return viewInflate2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final void m77861E0(SearchResultTabFragment searchResultTabFragment, String str, ResourcesRequestView resourcesRequestView, View view) {
        C28415e.f87132a.m109794e(searchResultTabFragment, NoticePermissionFrom.DETAIL_NO_RES);
        SearchResultViewModel.m77900n(searchResultTabFragment.m77883s0(), str, false, 2, null);
        Integer num = searchResultTabFragment.requestMovieCount;
        if (num != null) {
            Intrinsics.m97799e(num);
            Integer numValueOf = Integer.valueOf(num.intValue() + 1);
            searchResultTabFragment.requestMovieCount = numValueOf;
            Intrinsics.m97799e(numValueOf);
            ResourcesRequestView.setCount$default(resourcesRequestView, numValueOf.intValue(), false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final void m77862F0(SearchResultTabFragment searchResultTabFragment, View view) {
        searchResultTabFragment.lazyLoadData();
    }

    /* JADX INFO: renamed from: G0 */
    private final void m77863G0(ResultWrapData it, int position) {
        String strM78084s;
        String strM78084s2;
        String strM78084s3;
        String strM78084s4;
        String deeplink;
        int i11 = C18464b.f59867a[it.getType().ordinal()];
        if (i11 == 1) {
            AbstractC18381f.m77674c(it.getSubject(), "search_result");
            C18541d.a aVar = C18541d.f60046a;
            Subject subject = it.getSubject();
            String str = this.keyword;
            String str2 = this.searchFrom;
            String str3 = this.currentTabId;
            SearchViewModel searchViewModel = this.searchViewModel;
            aVar.m78141u(subject, position, str, str2, str3, (searchViewModel == null || (strM78084s = searchViewModel.m78084s()) == null) ? "mb_sug" : strM78084s);
            return;
        }
        if (i11 == 2) {
            Navigator.m61845x(TheRouter.m61773c("/movie/staff").m61856J("staff", it.getStaff()), requireContext(), null, 2, null);
            C18541d.a aVar2 = C18541d.f60046a;
            Staff staff = it.getStaff();
            String str4 = this.keyword;
            String str5 = this.searchFrom;
            String str6 = this.currentTabId;
            SearchViewModel searchViewModel2 = this.searchViewModel;
            aVar2.m78139s(staff, position, str4, str5, str6, (searchViewModel2 == null || (strM78084s2 = searchViewModel2.m78084s()) == null) ? "mb_sug" : strM78084s2);
            return;
        }
        if (i11 == 3) {
            Navigator navigatorM61773c = TheRouter.m61773c("/room/detail");
            Group groups = it.getGroups();
            Navigator.m61845x(navigatorM61773c.m61857K("id", groups != null ? groups.getGroupId() : null), requireContext(), null, 2, null);
            C18541d.a aVar3 = C18541d.f60046a;
            Group groups2 = it.getGroups();
            String str7 = this.keyword;
            String str8 = this.searchFrom;
            String str9 = this.currentTabId;
            SearchViewModel searchViewModel3 = this.searchViewModel;
            aVar3.m78122b(groups2, position, str7, str8, str9, (searchViewModel3 == null || (strM78084s3 = searchViewModel3.m78084s()) == null) ? "mb_sug" : strM78084s3);
            return;
        }
        if (i11 != 4) {
            if (i11 == 5 && (getParentFragment() instanceof SearchResultFragment)) {
                Fragment parentFragment = getParentFragment();
                Intrinsics.m97800f(parentFragment, "null cannot be cast to non-null type com.transsion.search.fragment.result.SearchResultFragment");
                SearchResultFragment searchResultFragment = (SearchResultFragment) parentFragment;
                String moreTabId = it.getMoreTabId();
                if (moreTabId == null) {
                    moreTabId = "";
                }
                searchResultFragment.m77855r0(moreTabId);
                return;
            }
            return;
        }
        VerticalRank verticalRank = it.getVerticalRank();
        if (verticalRank != null && (deeplink = verticalRank.getDeeplink()) != null) {
            AbstractC5114k.m23925h(deeplink, null, 1, null);
        }
        C18541d.a aVar4 = C18541d.f60046a;
        VerticalRank verticalRank2 = it.getVerticalRank();
        String str10 = this.keyword;
        String str11 = this.searchFrom;
        String str12 = this.currentTabId;
        SearchViewModel searchViewModel4 = this.searchViewModel;
        aVar4.m78131k(verticalRank2, position, str10, str11, str12, (searchViewModel4 == null || (strM78084s4 = searchViewModel4.m78084s()) == null) ? "mb_sug" : strM78084s4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H0 */
    private final void m77864H0(boolean showTab) {
        NoInterceptRecyclerView noInterceptRecyclerView;
        RecyclerView recyclerView;
        C28423h c28423h;
        NoInterceptRecyclerView noInterceptRecyclerView2;
        ProgressBar progressBar;
        C28423h c28423h2 = (C28423h) getMViewBinding();
        if (c28423h2 != null && (progressBar = c28423h2.f87191d) != null) {
            progressBar.setVisibility(0);
        }
        if (!showTab && (c28423h = (C28423h) getMViewBinding()) != null && (noInterceptRecyclerView2 = c28423h.f87190c) != null) {
            noInterceptRecyclerView2.setVisibility(8);
        }
        C28423h c28423h3 = (C28423h) getMViewBinding();
        if (c28423h3 != null && (recyclerView = c28423h3.f87189b) != null) {
            recyclerView.setVisibility(4);
        }
        C28423h c28423h4 = (C28423h) getMViewBinding();
        if (c28423h4 == null || (noInterceptRecyclerView = c28423h4.f87190c) == null) {
            return;
        }
        noInterceptRecyclerView.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final SearchResultViewModel m77865I0(SearchResultTabFragment searchResultTabFragment) {
        return (SearchResultViewModel) new C3227v0(searchResultTabFragment).m14969a(SearchResultViewModel.class);
    }

    /* JADX INFO: renamed from: s0 */
    private final SearchResultViewModel m77883s0() {
        return (SearchResultViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: t0 */
    private final void m77884t0() {
        List<TabItem> subs;
        List<TabItem> subs2;
        TabItem tabItem;
        Bundle arguments = getArguments();
        String tabId = null;
        this.keyword = arguments != null ? arguments.getString("tabKeyword") : null;
        Bundle arguments2 = getArguments();
        this.tabItem = arguments2 != null ? (TabItem) arguments2.getParcelable("tabItem") : null;
        Bundle arguments3 = getArguments();
        this.extraResultData = arguments3 != null ? (SearchResultEntity) arguments3.getParcelable("tabResult") : null;
        Bundle arguments4 = getArguments();
        this.searchFrom = arguments4 != null ? arguments4.getString("searchFrom") : null;
        TabItem tabItem2 = this.tabItem;
        if (tabItem2 == null || (subs = tabItem2.getSubs()) == null || !(!subs.isEmpty())) {
            TabItem tabItem3 = this.tabItem;
            if (tabItem3 != null) {
                tabId = tabItem3.getTabId();
            }
        } else {
            TabItem tabItem4 = this.tabItem;
            if (tabItem4 != null && (subs2 = tabItem4.getSubs()) != null && (tabItem = subs2.get(0)) != null) {
                tabId = tabItem.getTabId();
            }
        }
        this.currentTabId = tabId;
    }

    /* JADX INFO: renamed from: u0 */
    private final void m77885u0() {
        m77883s0().m77905k().m14851j(getViewLifecycleOwner(), new C18468f(new Function1() { // from class: com.transsion.search.fragment.result.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchResultTabFragment.m77888x0(this.f59898a, (SearchResultEntity) obj);
            }
        }));
        m77883s0().m77904j().m14851j(getViewLifecycleOwner(), new C18468f(new Function1() { // from class: com.transsion.search.fragment.result.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchResultTabFragment.m77886v0(this.f59899a, (SearchResultEntity) obj);
            }
        }));
        m77883s0().m77903i().m14851j(this, new C18468f(new Function1() { // from class: com.transsion.search.fragment.result.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchResultTabFragment.m77887w0(this.f59900a, (PostEntity) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final Unit m77886v0(SearchResultTabFragment searchResultTabFragment, SearchResultEntity searchResultEntity) {
        C27941f c27941fM36186h0;
        List<ResultWrapData> convertData;
        C27941f c27941fM36186h1;
        C27941f c27941fM36186h2;
        if (Intrinsics.m97797c(searchResultEntity != null ? searchResultEntity.getTabId() : null, searchResultTabFragment.currentTabId)) {
            if ((searchResultEntity != null ? searchResultEntity.getResults() : null) == null) {
                C18471a c18471a = searchResultTabFragment.mainAdapter;
                if (c18471a != null && (c27941fM36186h2 = c18471a.m36186h0()) != null) {
                    c27941fM36186h2.m108669v();
                }
            } else {
                C18471a c18471a2 = searchResultTabFragment.mainAdapter;
                if (c18471a2 != null) {
                    List<ResultWrapData> convertData2 = searchResultEntity.getConvertData();
                    c18471a2.mo36208q(convertData2 != null ? convertData2 : new ArrayList<>());
                }
                if (!searchResultEntity.getPager().getHasMore() || (convertData = searchResultEntity.getConvertData()) == null || convertData.isEmpty()) {
                    C18471a c18471a3 = searchResultTabFragment.mainAdapter;
                    if (c18471a3 != null && (c27941fM36186h0 = c18471a3.m36186h0()) != null) {
                        C27941f.m108652u(c27941fM36186h0, false, 1, null);
                    }
                } else {
                    C18471a c18471a4 = searchResultTabFragment.mainAdapter;
                    if (c18471a4 != null && (c27941fM36186h1 = c18471a4.m36186h0()) != null) {
                        c27941fM36186h1.m108667s();
                    }
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final Unit m77887w0(SearchResultTabFragment searchResultTabFragment, PostEntity postEntity) {
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
    /* JADX WARN: Code duplicated, block: B:41:0x0066  */
    /* JADX INFO: renamed from: x0 */
    public static final Unit m77888x0(SearchResultTabFragment searchResultTabFragment, SearchResultEntity searchResultEntity) {
        C27941f c27941fM36186h0;
        List<ResultWrapData> convertData;
        C18471a c18471a;
        C27941f c27941fM36186h1;
        Pager pager;
        List<ResultWrapData> convertData2;
        C18471a c18471a2 = searchResultTabFragment.mainAdapter;
        if (c18471a2 != null) {
            c18471a2.mo36201n1((searchResultEntity == null || (convertData2 = searchResultEntity.getConvertData()) == null) ? new ArrayList<>() : convertData2);
        }
        C18471a c18471a3 = searchResultTabFragment.mainAdapter;
        if (c18471a3 != null) {
            String str = searchResultTabFragment.currentTabId;
            if (str == null) {
                str = "";
            }
            c18471a3.m77912S1(str);
        }
        List<ResultWrapData> convertData3 = searchResultEntity != null ? searchResultEntity.getConvertData() : null;
        if (convertData3 == null || convertData3.isEmpty()) {
            searchResultTabFragment.requestMovieCount = null;
            C18471a c18471a4 = searchResultTabFragment.mainAdapter;
            if (c18471a4 != null) {
                c18471a4.m36171Y0(searchResultTabFragment.m77860D0());
            }
        }
        if (searchResultEntity == null || (pager = searchResultEntity.getPager()) == null || pager.getHasMore()) {
            if (((searchResultEntity == null || (convertData = searchResultEntity.getConvertData()) == null) ? 0 : convertData.size()) < 10) {
                c18471a = searchResultTabFragment.mainAdapter;
                if (c18471a != null && (c27941fM36186h1 = c18471a.m36186h0()) != null) {
                    C27941f.m108652u(c27941fM36186h1, false, 1, null);
                }
                searchResultTabFragment.isLoadMoreEnd = true;
            } else {
                C18471a c18471a5 = searchResultTabFragment.mainAdapter;
                if (c18471a5 != null && (c27941fM36186h0 = c18471a5.m36186h0()) != null) {
                    c27941fM36186h0.m108667s();
                }
            }
        } else {
            c18471a = searchResultTabFragment.mainAdapter;
            if (c18471a != null) {
                C27941f.m108652u(c27941fM36186h1, false, 1, null);
            }
            searchResultTabFragment.isLoadMoreEnd = true;
        }
        searchResultTabFragment.hideLoading();
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y0 */
    private final void m77889y0() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        C28117b c28117b = new C28117b(0.6f, new C18465c(), false, 4, null);
        c28117b.m109199n(2);
        C28423h c28423h = (C28423h) getMViewBinding();
        if (c28423h != null && (recyclerView3 = c28423h.f87189b) != null) {
            recyclerView3.addOnScrollListener(c28117b);
        }
        this.exposureHelper = c28117b;
        C28423h c28423h2 = (C28423h) getMViewBinding();
        if (c28423h2 != null && (recyclerView2 = c28423h2.f87189b) != null) {
            recyclerView2.addOnScrollListener(new C18466d());
        }
        C28423h c28423h3 = (C28423h) getMViewBinding();
        if (c28423h3 == null || (recyclerView = c28423h3.f87189b) == null) {
            return;
        }
        recyclerView.post(new Runnable() { // from class: com.transsion.search.fragment.result.j
            @Override // java.lang.Runnable
            public final void run() {
                SearchResultTabFragment.m77890z0(this.f59897a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m77890z0(SearchResultTabFragment searchResultTabFragment) {
        if (searchResultTabFragment.lastScrollTime == 0) {
            searchResultTabFragment.lastScrollTime = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void hideLoading() {
        NoInterceptRecyclerView noInterceptRecyclerView;
        RecyclerView recyclerView;
        NoInterceptRecyclerView noInterceptRecyclerView2;
        ProgressBar progressBar;
        C28423h c28423h = (C28423h) getMViewBinding();
        if (c28423h != null && (progressBar = c28423h.f87191d) != null) {
            progressBar.setVisibility(4);
        }
        C28423h c28423h2 = (C28423h) getMViewBinding();
        if (c28423h2 != null && (noInterceptRecyclerView2 = c28423h2.f87190c) != null) {
            noInterceptRecyclerView2.setVisibility(0);
        }
        C28423h c28423h3 = (C28423h) getMViewBinding();
        if (c28423h3 != null && (recyclerView = c28423h3.f87189b) != null) {
            recyclerView.setVisibility(0);
        }
        C28423h c28423h4 = (C28423h) getMViewBinding();
        if (c28423h4 == null || (noInterceptRecyclerView = c28423h4.f87190c) == null) {
            return;
        }
        noInterceptRecyclerView.setEnabled(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        RecyclerView recyclerView;
        String strM78084s;
        C27941f c27941fM36186h0;
        NoInterceptRecyclerView noInterceptRecyclerView;
        List<TabItem> subs;
        Intrinsics.m97802h(view, "view");
        m77884t0();
        C28423h c28423h = (C28423h) getMViewBinding();
        if (c28423h != null && (noInterceptRecyclerView = c28423h.f87190c) != null) {
            noInterceptRecyclerView.setLayoutManager(new LinearLayoutManager(noInterceptRecyclerView.getContext(), 0, false));
            final C18472b c18472b = new C18472b(this.currentTabId);
            TabItem tabItem = this.tabItem;
            c18472b.mo36201n1((tabItem == null || (subs = tabItem.getSubs()) == null) ? new ArrayList<>() : subs);
            noInterceptRecyclerView.setAdapter(c18472b);
            c18472b.m36227w1(new InterfaceC27566d() { // from class: com.transsion.search.fragment.result.f
                @Override // p765s6.InterfaceC27566d
                /* JADX INFO: renamed from: a */
                public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                    SearchResultTabFragment.m77857A0(this.f59892a, c18472b, baseQuickAdapter, view2, i11);
                }
            });
        }
        C28423h c28423h2 = (C28423h) getMViewBinding();
        if (c28423h2 != null && (recyclerView = c28423h2.f87189b) != null) {
            Resources resources = recyclerView.getContext().getResources();
            Intrinsics.m97801g(resources, "getResources(...)");
            if (AbstractC18381f.m77676e(resources)) {
                NpaGridLayoutManager npaGridLayoutManager = new NpaGridLayoutManager(recyclerView.getContext(), 2);
                npaGridLayoutManager.m20740d0(new C18467e());
                recyclerView.setLayoutManager(npaGridLayoutManager);
                recyclerView.addItemDecoration(new C25825b(0, AbstractC5776a0.m27313a(12.0f), 0, 0));
            } else {
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
                if (!Intrinsics.m97797c(this.currentTabId, "All") && !Intrinsics.m97797c(this.currentTabId, HotRankItem.CATE_MOVIE) && recyclerView.getItemDecorationCount() == 0) {
                    recyclerView.addItemDecoration(new C25829f(0.0f, 8.0f, 0.0f, 5, null));
                }
            }
            C28117b c28117b = this.exposureHelper;
            String str = this.keyword;
            String str2 = this.searchFrom;
            String str3 = this.currentTabId;
            SearchViewModel searchViewModel = this.searchViewModel;
            if (searchViewModel == null || (strM78084s = searchViewModel.m78084s()) == null) {
                strM78084s = "mb_sug";
            }
            C18471a c18471a = new C18471a(c28117b, str, str2, str3, strM78084s);
            this.mainAdapter = c18471a;
            recyclerView.setAdapter(c18471a);
            C18471a c18471a2 = this.mainAdapter;
            if (c18471a2 != null && (c27941fM36186h0 = c18471a2.m36186h0()) != null) {
                c27941fM36186h0.m108656D(new InterfaceC27568f() { // from class: com.transsion.search.fragment.result.g
                    @Override // p765s6.InterfaceC27568f
                    /* JADX INFO: renamed from: a */
                    public final void mo63874a() {
                        SearchResultTabFragment.m77858B0(this.f59894a);
                    }
                });
            }
            C18471a c18471a3 = this.mainAdapter;
            if (c18471a3 != null) {
                c18471a3.m36227w1(new InterfaceC27566d() { // from class: com.transsion.search.fragment.result.h
                    @Override // p765s6.InterfaceC27566d
                    /* JADX INFO: renamed from: a */
                    public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                        SearchResultTabFragment.m77859C0(this.f59895a, baseQuickAdapter, view2, i11);
                    }
                });
            }
        }
        m77889y0();
        m77885u0();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        Pager pager;
        C27941f c27941fM36186h0;
        List<ResultWrapData> convertData;
        SearchResultEntity searchResultEntity = this.extraResultData;
        if (searchResultEntity == null) {
            m77864H0(false);
            SearchResultViewModel searchResultViewModelM77883s0 = m77883s0();
            String str = this.keyword;
            if (str == null) {
                str = "";
            }
            String str2 = this.currentTabId;
            if (str2 == null) {
                str2 = "";
            }
            SearchResultViewModel.m77901p(searchResultViewModelM77883s0, str, str2, false, 4, null);
            return;
        }
        C18471a c18471a = this.mainAdapter;
        if (c18471a != null) {
            c18471a.mo36201n1((searchResultEntity == null || (convertData = searchResultEntity.getConvertData()) == null) ? new ArrayList<>() : convertData);
        }
        SearchResultEntity searchResultEntity2 = this.extraResultData;
        if (searchResultEntity2 == null || (pager = searchResultEntity2.getPager()) == null || pager.getHasMore()) {
            m77883s0().m77908r(2);
            return;
        }
        C18471a c18471a2 = this.mainAdapter;
        if (c18471a2 == null || (c27941fM36186h0 = c18471a2.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108668t(true);
    }

    @Override // com.transsion.search.fragment.BaseSearchMainFragment, com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Object objM112707constructorimpl;
        super.onCreate(savedInstanceState);
        try {
            Result.Companion companion = Result.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
            objM112707constructorimpl = Result.m112707constructorimpl((SearchViewModel) new C3227v0(fragmentActivityRequireActivity).m14969a(SearchViewModel.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (Result.m112713isFailureimpl(objM112707constructorimpl)) {
            objM112707constructorimpl = null;
        }
        this.searchViewModel = (SearchViewModel) objM112707constructorimpl;
    }

    @Override // com.transsion.search.fragment.BaseSearchMainFragment, androidx.fragment.app.Fragment
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
        C18471a c18471a;
        C27941f c27941fM36186h0;
        super.onResume();
        if (!this.isLoadMoreEnd || (c18471a = this.mainAdapter) == null || (c27941fM36186h0 = c18471a.m36186h0()) == null) {
            return;
        }
        C27941f.m108652u(c27941fM36186h0, false, 1, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C28423h getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28423h c28423hM109824c = C28423h.m109824c(inflater);
        Intrinsics.m97801g(c28423hM109824c, "inflate(...)");
        return c28423hM109824c;
    }
}
