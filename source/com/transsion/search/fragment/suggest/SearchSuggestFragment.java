package com.transsion.search.fragment.suggest;

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
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.search.bean.SearchSuggestEntity;
import com.transsion.search.bean.SuggestEntity;
import com.transsion.search.fragment.BaseSearchMainFragment;
import com.transsion.search.viewmodel.SearchViewModel;
import com.transsion.search.widget.C18541d;
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
import kotlin.jvm.internal.SourceDebugExtension;
import p550kj.C24655b;
import p646oh.C26224a;
import p765s6.InterfaceC27566d;
import p881wq.C28425j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002$(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\n\u001a\u00020\t2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u0015\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006;"}, m97100d2 = {"Lcom/transsion/search/fragment/suggest/SearchSuggestFragment;", "Lcom/transsion/search/fragment/BaseSearchMainFragment;", "Lwq/j;", "<init>", "()V", "", "Lcom/transsion/search/bean/SuggestEntity;", "newList", "oldList", "", "h0", "(Ljava/util/List;Ljava/util/List;)Z", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Landroid/view/LayoutInflater;", "inflater", "j0", "(Landroid/view/LayoutInflater;)Lwq/j;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "initListener", "lazyLoadData", "Lcom/transsion/search/fragment/suggest/SearchSuggestFragment$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "o0", "(Lcom/transsion/search/fragment/suggest/SearchSuggestFragment$b;)V", "", "keyWord", "n0", "(Ljava/lang/String;)V", "a", "Lcom/transsion/search/fragment/suggest/SearchSuggestFragment$b;", "mClickListener", "Lcom/transsion/search/viewmodel/SearchViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "i0", "()Lcom/transsion/search/viewmodel/SearchViewModel;", "mViewModel", "Lcom/transsion/search/fragment/suggest/d;", "c", "Lcom/transsion/search/fragment/suggest/d;", "mAdapter", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/String;", "mKeyWord", "e", "mOps", "Loh/a;", "f", "Loh/a;", "exposeUtil", "g", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SearchSuggestFragment extends BaseSearchMainFragment<C28425j> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private InterfaceC18489b mClickListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C18496d mAdapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String mOps;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mViewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.search.fragment.suggest.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchSuggestFragment.m77926m0();
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String mKeyWord = "";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C26224a exposeUtil = new C26224a();

    /* JADX INFO: renamed from: com.transsion.search.fragment.suggest.SearchSuggestFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SearchSuggestFragment m77930a() {
            return new SearchSuggestFragment();
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.suggest.SearchSuggestFragment$b */
    public interface InterfaceC18489b {
        /* JADX INFO: renamed from: a */
        void mo77719a(SuggestEntity suggestEntity, int i11, String str, String str2);
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.suggest.SearchSuggestFragment$c */
    public static final class C18490c implements C26224a.b {
        C18490c() {
        }

        @Override // p646oh.C26224a.b
        /* JADX INFO: renamed from: a */
        public int mo77931a() {
            List<Object> data;
            C18496d c18496d = SearchSuggestFragment.this.mAdapter;
            if (c18496d == null || (data = c18496d.getData()) == null) {
                return 0;
            }
            return data.size();
        }

        @Override // p646oh.C26224a.b
        public void onItemViewVisible(boolean z11, int i11) {
            List<Object> data;
            C18496d c18496d = SearchSuggestFragment.this.mAdapter;
            C18541d.f60046a.m78142v((c18496d == null || (data = c18496d.getData()) == null) ? null : (SuggestEntity) CollectionsKt.m97362l0(data, i11), Integer.valueOf(i11), SearchSuggestFragment.this.mKeyWord, SearchSuggestFragment.this.mOps, SearchSuggestFragment.this.m77923i0().m78084s());
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.suggest.SearchSuggestFragment$d */
    public static final class C18491d extends DiffUtil.AbstractC4174e {
        C18491d() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(SuggestEntity oldItem, SuggestEntity newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return oldItem.hashCode() == newItem.hashCode();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(SuggestEntity oldItem, SuggestEntity newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return oldItem.hashCode() == newItem.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.suggest.SearchSuggestFragment$e */
    static final class C18492e implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59913a;

        C18492e(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59913a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59913a;
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
            this.f59913a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: h0 */
    private final boolean m77922h0(List newList, List oldList) {
        SuggestEntity suggestEntity;
        Subject subject;
        int size = oldList != null ? oldList.size() : 0;
        int size2 = newList != null ? newList.size() : 0;
        if (size2 <= 0 || size != size2) {
            return false;
        }
        if (newList != null) {
            int i11 = 0;
            for (Object obj : newList) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                SuggestEntity suggestEntity2 = (SuggestEntity) obj;
                Integer type = suggestEntity2.getType();
                if (type != null && type.intValue() == 1) {
                    Subject subject2 = suggestEntity2.getSubject();
                    if (!Intrinsics.m97797c(subject2 != null ? subject2.getSubjectId() : null, (oldList == null || (suggestEntity = (SuggestEntity) oldList.get(i11)) == null || (subject = suggestEntity.getSubject()) == null) ? null : subject.getSubjectId())) {
                        return false;
                    }
                }
                Integer type2 = suggestEntity2.getType();
                if (type2 == null || type2.intValue() != 1) {
                    int iHashCode = suggestEntity2.hashCode();
                    SuggestEntity suggestEntity3 = oldList != null ? (SuggestEntity) oldList.get(i11) : null;
                    if (iHashCode != (suggestEntity3 != null ? suggestEntity3.hashCode() : 0)) {
                        return false;
                    }
                }
                i11 = i12;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public final SearchViewModel m77923i0() {
        return (SearchViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final Unit m77924k0(SearchSuggestFragment searchSuggestFragment, String str) {
        List<SuggestEntity> items;
        SearchSuggestEntity searchSuggestEntity = searchSuggestFragment.m77923i0().m78086u().get(str);
        if (searchSuggestEntity != null && ((items = searchSuggestEntity.getItems()) == null || !items.isEmpty())) {
            String ops = searchSuggestEntity.getOps();
            if (ops == null) {
                ops = "";
            }
            searchSuggestFragment.mOps = ops;
            C18496d c18496d = searchSuggestFragment.mAdapter;
            if (c18496d != null) {
                c18496d.m77935R1(searchSuggestFragment.mKeyWord);
            }
            List<SuggestEntity> items2 = searchSuggestEntity.getItems();
            C18496d c18496d2 = searchSuggestFragment.mAdapter;
            if (searchSuggestFragment.m77922h0(items2, c18496d2 != null ? c18496d2.getData() : null)) {
                C18496d c18496d3 = searchSuggestFragment.mAdapter;
                if (c18496d3 != null) {
                    c18496d3.notifyDataSetChanged();
                }
            } else {
                searchSuggestFragment.exposeUtil.m102684l();
                C18496d c18496d4 = searchSuggestFragment.mAdapter;
                if (c18496d4 != null) {
                    c18496d4.mo36201n1(searchSuggestEntity.getItems());
                }
                searchSuggestFragment.exposeUtil.m102683k();
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final void m77925l0(SearchSuggestFragment searchSuggestFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List<Object> data;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        C18496d c18496d = searchSuggestFragment.mAdapter;
        SuggestEntity suggestEntity = (c18496d == null || (data = c18496d.getData()) == null) ? null : (SuggestEntity) data.get(i11);
        C18541d.f60046a.m78143w(suggestEntity, i11, searchSuggestFragment.mKeyWord, searchSuggestFragment.mOps, searchSuggestFragment.m77923i0().m78084s());
        InterfaceC18489b interfaceC18489b = searchSuggestFragment.mClickListener;
        if (interfaceC18489b != null) {
            String str = searchSuggestFragment.mKeyWord;
            String str2 = searchSuggestFragment.mOps;
            if (str2 == null) {
                str2 = "";
            }
            interfaceC18489b.mo77719a(suggestEntity, i11, str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final SearchViewModel m77926m0() {
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return new SearchViewModel(applicationM27275a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initListener() {
        C26224a c26224a = this.exposeUtil;
        C28425j c28425j = (C28425j) getMViewBinding();
        c26224a.m102685n(c28425j != null ? c28425j.f87203b : null, new C18490c());
        m77923i0().m78085t().m14851j(this, new C18492e(new Function1() { // from class: com.transsion.search.fragment.suggest.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchSuggestFragment.m77924k0(this.f59914a, (String) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        RecyclerView recyclerView;
        Intrinsics.m97802h(view, "view");
        C28425j c28425j = (C28425j) getMViewBinding();
        if (c28425j == null || (recyclerView = c28425j.f87203b) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        C18496d c18496d = new C18496d();
        c18496d.m36158R0(new C18491d());
        this.mAdapter = c18496d;
        recyclerView.setAdapter(c18496d);
        C18496d c18496d2 = this.mAdapter;
        if (c18496d2 != null) {
            c18496d2.m36227w1(new InterfaceC27566d() { // from class: com.transsion.search.fragment.suggest.c
                @Override // p765s6.InterfaceC27566d
                /* JADX INFO: renamed from: a */
                public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                    SearchSuggestFragment.m77925l0(this.f59915a, baseQuickAdapter, view2, i11);
                }
            });
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public C28425j getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28425j c28425jM109832c = C28425j.m109832c(inflater);
        Intrinsics.m97801g(c28425jM109832c, "inflate(...)");
        return c28425jM109832c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    /* JADX INFO: renamed from: n0 */
    public final void m77928n0(String keyWord) {
        HashMap mapM96844g;
        Intrinsics.m97802h(keyWord, "keyWord");
        this.mKeyWord = keyWord;
        m77923i0().m78081p(keyWord);
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig == null || (mapM96844g = logViewConfig.m96844g()) == null) {
            return;
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        C24655b c24655b = new C24655b("search_suggest", false, 2, null);
        c24655b.m96849l(true);
        c24655b.m96844g().put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
        c24655b.m96844g().put("sug_source", m77923i0().m78084s());
        return c24655b;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m77929o0(InterfaceC18489b listener) {
        Intrinsics.m97802h(listener, "listener");
        this.mClickListener = listener;
    }
}
