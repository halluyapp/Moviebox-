package com.transsion.search_pugc.fragment.suggest;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.search_pugc.C18670g;
import com.transsion.search_pugc.bean.SearchSuggestItem;
import com.transsion.search_pugc.bean.UGCSearchSuggestData;
import com.transsion.search_pugc.fragment.BaseSearchMainFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.HashMap;
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
import lr.C25674c;
import p550kj.C24655b;
import p646oh.C26224a;
import p765s6.InterfaceC27566d;
import p881wq.C28425j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002$(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\n\u001a\u00020\t2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u0015\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010)\u001a\u0004\b<\u0010=¨\u0006@"}, m97100d2 = {"Lcom/transsion/search_pugc/fragment/suggest/SearchSuggestFragment;", "Lcom/transsion/search_pugc/fragment/BaseSearchMainFragment;", "Lwq/j;", "<init>", "()V", "", "Lcom/transsion/search_pugc/bean/SearchSuggestItem;", "newList", "oldList", "", "i0", "(Ljava/util/List;Ljava/util/List;)Z", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Landroid/view/LayoutInflater;", "inflater", "k0", "(Landroid/view/LayoutInflater;)Lwq/j;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "initListener", "lazyLoadData", "Lcom/transsion/search_pugc/fragment/suggest/SearchSuggestFragment$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "q0", "(Lcom/transsion/search_pugc/fragment/suggest/SearchSuggestFragment$b;)V", "", "keyWord", "o0", "(Ljava/lang/String;)V", "a", "Lcom/transsion/search_pugc/fragment/suggest/SearchSuggestFragment$b;", "mClickListener", "Llr/c;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "j0", "()Llr/c;", "mViewModel", "Lcom/transsion/search_pugc/fragment/suggest/e;", "c", "Lcom/transsion/search_pugc/fragment/suggest/e;", "mAdapter", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/String;", "mKeyWord", "e", "mOps", "Loh/a;", "f", "Loh/a;", "exposeUtil", "Lcom/transsion/search_pugc/g;", "g", "getSearchReporter", "()Lcom/transsion/search_pugc/g;", "searchReporter", "h", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class SearchSuggestFragment extends BaseSearchMainFragment<C28425j> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private InterfaceC18661b mClickListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C18669e mAdapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String mOps;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mViewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.search_pugc.fragment.suggest.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchSuggestFragment.m78475n0();
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String mKeyWord = "";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C26224a exposeUtil = new C26224a();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy searchReporter = LazyKt.m97097b(new Function0() { // from class: com.transsion.search_pugc.fragment.suggest.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchSuggestFragment.m78476p0(this.f60277a);
        }
    });

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.suggest.SearchSuggestFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SearchSuggestFragment m78480a() {
            return new SearchSuggestFragment();
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.suggest.SearchSuggestFragment$b */
    public interface InterfaceC18661b {
        /* JADX INFO: renamed from: a */
        void mo78294a(SearchSuggestItem searchSuggestItem, int i11, String str, String str2);
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.suggest.SearchSuggestFragment$c */
    public static final class C18662c implements C26224a.b {
        C18662c() {
        }

        @Override // p646oh.C26224a.b
        /* JADX INFO: renamed from: a */
        public int mo77931a() {
            List<Object> data;
            C18669e c18669e = SearchSuggestFragment.this.mAdapter;
            if (c18669e == null || (data = c18669e.getData()) == null) {
                return 0;
            }
            return data.size();
        }

        @Override // p646oh.C26224a.b
        public void onItemViewVisible(boolean z11, int i11) {
            List<Object> data;
            C18669e c18669e = SearchSuggestFragment.this.mAdapter;
            SearchSuggestFragment.this.getSearchReporter().m78492A((c18669e == null || (data = c18669e.getData()) == null) ? null : (SearchSuggestItem) CollectionsKt.m97362l0(data, i11), Integer.valueOf(i11), SearchSuggestFragment.this.mKeyWord, SearchSuggestFragment.this.mOps);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.suggest.SearchSuggestFragment$d */
    public static final class C18663d extends DiffUtil.AbstractC4174e {
        C18663d() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(SearchSuggestItem oldItem, SearchSuggestItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return oldItem.hashCode() == newItem.hashCode();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(SearchSuggestItem oldItem, SearchSuggestItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return oldItem.hashCode() == newItem.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.suggest.SearchSuggestFragment$e */
    static final class C18664e implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f60275a;

        C18664e(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f60275a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f60275a;
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
            this.f60275a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C18670g getSearchReporter() {
        return (C18670g) this.searchReporter.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    private final boolean m78471i0(List newList, List oldList) {
        return false;
    }

    /* JADX INFO: renamed from: j0 */
    private final C25674c m78472j0() {
        return (C25674c) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final Unit m78473l0(SearchSuggestFragment searchSuggestFragment, UGCSearchSuggestData uGCSearchSuggestData) {
        List<SearchSuggestItem> items;
        searchSuggestFragment.getSearchReporter().m78501i(searchSuggestFragment.getLogViewConfig());
        if (uGCSearchSuggestData == null || (items = uGCSearchSuggestData.getItems()) == null || items.isEmpty()) {
            return Unit.f75682a;
        }
        C24655b logViewConfig = searchSuggestFragment.getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        searchSuggestFragment.mOps = uGCSearchSuggestData.getOps();
        C18669e c18669e = searchSuggestFragment.mAdapter;
        if (c18669e != null) {
            c18669e.m78484R1(searchSuggestFragment.mKeyWord);
        }
        List<SearchSuggestItem> items2 = uGCSearchSuggestData.getItems();
        C18669e c18669e2 = searchSuggestFragment.mAdapter;
        if (searchSuggestFragment.m78471i0(items2, c18669e2 != null ? c18669e2.getData() : null)) {
            C18669e c18669e3 = searchSuggestFragment.mAdapter;
            if (c18669e3 != null) {
                c18669e3.notifyDataSetChanged();
            }
        } else {
            searchSuggestFragment.exposeUtil.m102684l();
            C18669e c18669e4 = searchSuggestFragment.mAdapter;
            if (c18669e4 != null) {
                c18669e4.mo36201n1(uGCSearchSuggestData.getItems());
            }
            searchSuggestFragment.exposeUtil.m102683k();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final void m78474m0(SearchSuggestFragment searchSuggestFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        String word;
        List<Object> data;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        C18669e c18669e = searchSuggestFragment.mAdapter;
        SearchSuggestItem searchSuggestItem = (c18669e == null || (data = c18669e.getData()) == null) ? null : (SearchSuggestItem) CollectionsKt.m97362l0(data, i11);
        if (searchSuggestItem == null || (word = searchSuggestItem.getWord()) == null) {
            word = searchSuggestFragment.mKeyWord;
        }
        searchSuggestFragment.mKeyWord = word;
        searchSuggestFragment.getSearchReporter().m78493B(searchSuggestItem, i11, searchSuggestFragment.mKeyWord, searchSuggestFragment.mOps);
        InterfaceC18661b interfaceC18661b = searchSuggestFragment.mClickListener;
        if (interfaceC18661b != null) {
            String str = searchSuggestFragment.mKeyWord;
            String str2 = searchSuggestFragment.mOps;
            if (str2 == null) {
                str2 = "";
            }
            interfaceC18661b.mo78294a(searchSuggestItem, i11, str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C25674c m78475n0() {
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return new C25674c(applicationM27275a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C18670g m78476p0(SearchSuggestFragment searchSuggestFragment) {
        return C18670g.f60281h.m78520a(searchSuggestFragment.getContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initListener() {
        C26224a c26224a = this.exposeUtil;
        C28425j c28425j = (C28425j) getMViewBinding();
        c26224a.m102685n(c28425j != null ? c28425j.f87203b : null, new C18662c());
        m78472j0().m101032m().m14851j(this, new C18664e(new Function1() { // from class: com.transsion.search_pugc.fragment.suggest.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchSuggestFragment.m78473l0(this.f60278a, (UGCSearchSuggestData) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        RecyclerView recyclerView;
        Intrinsics.m97802h(view, "view");
        C28425j c28425j = (C28425j) getMViewBinding();
        if (c28425j != null && (recyclerView = c28425j.f87203b) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            C18669e c18669e = new C18669e();
            c18669e.m36158R0(new C18663d());
            this.mAdapter = c18669e;
            recyclerView.setAdapter(c18669e);
            C18669e c18669e2 = this.mAdapter;
            if (c18669e2 != null) {
                c18669e2.m36227w1(new InterfaceC27566d() { // from class: com.transsion.search_pugc.fragment.suggest.a
                    @Override // p765s6.InterfaceC27566d
                    /* JADX INFO: renamed from: a */
                    public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                        SearchSuggestFragment.m78474m0(this.f60276a, baseQuickAdapter, view2, i11);
                    }
                });
            }
        }
        getSearchReporter().m78502j(getLogViewConfig());
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public C28425j getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28425j c28425jM109832c = C28425j.m109832c(inflater);
        Intrinsics.m97801g(c28425jM109832c, "inflate(...)");
        return c28425jM109832c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        return getSearchReporter().m78500g("/ugc_search/search_suggest");
    }

    /* JADX INFO: renamed from: o0 */
    public final void m78478o0(String keyWord) {
        HashMap mapM96844g;
        Intrinsics.m97802h(keyWord, "keyWord");
        this.mKeyWord = keyWord;
        m78472j0().m101029j(keyWord, 10, getSearchReporter().m78499f());
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig == null || (mapM96844g = logViewConfig.m96844g()) == null) {
            return;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m78479q0(InterfaceC18661b listener) {
        Intrinsics.m97802h(listener, "listener");
        this.mClickListener = listener;
    }
}
