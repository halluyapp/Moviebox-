package com.transsion.search.fragment.group;

import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3233y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.KeyboardUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$mipmap;
import com.p282tn.lib.widget.R$string;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baselib.p291db.video.VideoDetailPlayBean;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.push.PushConstants;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search.SearchManager;
import com.transsion.search.bean.Pager;
import com.transsion.search.bean.PagerEntity;
import com.transsion.search.bean.SearchGroupEntity;
import com.transsion.search.bean.SearchSubject;
import com.transsion.search.bean.SearchWorkEntity;
import com.transsion.search.fragment.group.adapter.C18407c;
import com.transsion.search.viewmodel.SearchViewModel;
import com.transsion.search.viewmodel.SearchWorkViewModel;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import hk.C23862a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import p465hp.C23889b;
import p550kj.C24655b;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p818uq.C28032a;
import p881wq.C28420e;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0004J5\u0010\u001d\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u0005H\u0016¢\u0006\u0004\b)\u0010\u0004J\u000f\u0010*\u001a\u00020\u0005H\u0016¢\u0006\u0004\b*\u0010\u0004J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010DR\u0016\u0010I\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010DR\u0016\u0010L\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006N"}, m97100d2 = {"Lcom/transsion/search/fragment/group/SearchUploadWorkFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lwq/e;", "<init>", "()V", "", "initHistory", "t0", "", "clear", "resetContent", "(Z)V", "I0", "searchJob", "initViewModel", "Landroid/view/View;", "emptyView", "()Landroid/view/View;", "showHistory", "L0", PushConstants.PUSH_SERVICE_TYPE_SHOW, "J0", "K0", "", "group_id", "subject_id", "opt", "", RequestParameters.POSITION, "reportClick", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Landroid/view/LayoutInflater;", "inflater", "w0", "(Landroid/view/LayoutInflater;)Lwq/e;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "initView", "lazyLoadData", "onDestroyView", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "a", "Z", "isRefreshing", "Lcom/transsion/search/fragment/group/g0;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/search/fragment/group/g0;", "mSearchWorkAdapter", "Lcom/transsion/search/fragment/group/adapter/c;", "c", "Lcom/transsion/search/fragment/group/adapter/c;", "mHistoryAdapter", "Lcom/transsion/search/viewmodel/SearchWorkViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lkotlin/Lazy;", "v0", "()Lcom/transsion/search/viewmodel/SearchWorkViewModel;", "mViewModel", "Lcom/transsion/search/viewmodel/SearchViewModel;", "e", "Lcom/transsion/search/viewmodel/SearchViewModel;", "mSearchViewModel", "f", "I", "mType", "g", "page", "h", "perPage", "i", "Ljava/lang/String;", "mKeyword", "j", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SearchUploadWorkFragment extends BaseFragment<C28420e> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isRefreshing;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C18419g0 mSearchWorkAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C18407c mHistoryAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private SearchViewModel mSearchViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int mType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int page;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int perPage;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String mKeyword;

    /* JADX INFO: renamed from: com.transsion.search.fragment.group.SearchUploadWorkFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SearchUploadWorkFragment m77781a(int i11) {
            SearchUploadWorkFragment searchUploadWorkFragment = new SearchUploadWorkFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(NativeComponentConstants.KEY_COMPONENT_TYPE, i11);
            searchUploadWorkFragment.setArguments(bundle);
            return searchUploadWorkFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.group.SearchUploadWorkFragment$b */
    public static final class C18398b implements InterfaceC27288n {
        C18398b() {
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected() {
            InterfaceC27288n.a.m106338a(this);
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
            C27941f c27941fM36186h0;
            List<Object> data;
            Intrinsics.m97802h(network, "network");
            Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
            C18419g0 c18419g0 = SearchUploadWorkFragment.this.mSearchWorkAdapter;
            if (c18419g0 != null && (data = c18419g0.getData()) != null && data.isEmpty()) {
                SearchUploadWorkFragment.this.searchJob();
                return;
            }
            C18419g0 c18419g1 = SearchUploadWorkFragment.this.mSearchWorkAdapter;
            if (c18419g1 == null || (c27941fM36186h0 = c18419g1.m36186h0()) == null) {
                return;
            }
            c27941fM36186h0.m108670w();
        }

        @Override // p743rh.InterfaceC27288n
        public void onDisconnected() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.group.SearchUploadWorkFragment$c */
    public static final class C18399c implements TextWatcher {
        C18399c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if ((editable != null ? editable.length() : 0) == 0) {
                SearchUploadWorkFragment.this.resetContent(true);
            }
            SearchUploadWorkFragment.this.mKeyword = StringsKt.m98155n1(String.valueOf(editable)).toString();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            SearchUploadWorkFragment.this.m77752J0(true);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.group.SearchUploadWorkFragment$d */
    public static final class C18400d implements TextView.OnEditorActionListener {
        C18400d() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
            if (i11 != 0 && i11 != 3) {
                return false;
            }
            SearchUploadWorkFragment.this.mKeyword = StringsKt.m98155n1(String.valueOf(textView != null ? textView.getText() : null)).toString();
            SearchUploadWorkFragment.this.searchJob();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.group.SearchUploadWorkFragment$e */
    public static final class C18401e extends RecyclerView.AbstractC4219r {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C28420e f59761b;

        C18401e(C28420e c28420e) {
            this.f59761b = c28420e;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            FragmentActivity activity;
            Intrinsics.m97802h(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i11);
            if (i11 != 1 || (activity = SearchUploadWorkFragment.this.getActivity()) == null) {
                return;
            }
            C28420e c28420e = this.f59761b;
            if (KeyboardUtils.m27133g(activity)) {
                KeyboardUtils.m27131e(c28420e.f87172c);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.group.SearchUploadWorkFragment$f */
    static final class C18402f implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59762a;

        C18402f(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59762a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59762a;
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
            this.f59762a.invoke(obj);
        }
    }

    public SearchUploadWorkFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.search.fragment.group.SearchUploadWorkFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.mViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(SearchWorkViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.search.fragment.group.SearchUploadWorkFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.search.fragment.group.SearchUploadWorkFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                Object objInvoke = function0.invoke();
                InterfaceC3208m interfaceC3208m = objInvoke instanceof InterfaceC3208m ? (InterfaceC3208m) objInvoke : null;
                C3227v0.c defaultViewModelProviderFactory = interfaceC3208m != null ? interfaceC3208m.getDefaultViewModelProviderFactory() : null;
                if (defaultViewModelProviderFactory == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.m97801g(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.page = 1;
        this.perPage = 10;
        this.mKeyword = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final Unit m77743A0(SearchUploadWorkFragment searchUploadWorkFragment, SearchWorkEntity searchWorkEntity) {
        ArrayList arrayList;
        Pager pager;
        HashMap mapM96844g;
        List<Object> data;
        ProgressBar progressBar;
        Pager pager2;
        Pager pager3;
        Pager pager4;
        List<SearchSubject> items;
        Boolean boolValueOf = null;
        if (searchWorkEntity == null || (items = searchWorkEntity.getItems()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : items) {
                if (!((SearchSubject) obj).isJumpBrowser()) {
                    arrayList.add(obj);
                }
            }
        }
        boolean hasMore = (searchWorkEntity == null || (pager4 = searchWorkEntity.getPager()) == null) ? false : pager4.getHasMore();
        searchUploadWorkFragment.page = (searchWorkEntity == null || (pager3 = searchWorkEntity.getPager()) == null) ? 1 : pager3.getNextPage();
        searchUploadWorkFragment.perPage = (searchWorkEntity == null || (pager2 = searchWorkEntity.getPager()) == null) ? 10 : pager2.getPerPage();
        C28420e mViewBinding = searchUploadWorkFragment.getMViewBinding();
        if (mViewBinding != null && (progressBar = mViewBinding.f87175f) != null) {
            AbstractC26006c.m102054g(progressBar);
        }
        C18419g0 c18419g0 = searchUploadWorkFragment.mSearchWorkAdapter;
        if (c18419g0 != null) {
            c18419g0.m36186h0().m108667s();
            C18419g0 c18419g1 = searchUploadWorkFragment.mSearchWorkAdapter;
            if (c18419g1 != null && (data = c18419g1.getData()) != null) {
                boolValueOf = Boolean.valueOf(data.isEmpty());
            }
            if ((arrayList == null || arrayList.isEmpty()) && Intrinsics.m97797c(boolValueOf, Boolean.TRUE) && (searchUploadWorkFragment.page == 1 || (searchWorkEntity != null && (pager = searchWorkEntity.getPager()) != null && pager.getPage() == 1))) {
                c18419g0.mo36210q1(new ArrayList());
                c18419g0.m36171Y0(searchUploadWorkFragment.emptyView());
                searchUploadWorkFragment.m77754L0(false);
                c18419g0.m36233z1(true);
            }
            if (arrayList == null || arrayList.isEmpty()) {
                c18419g0.m36186h0().m108668t(false);
            } else {
                if (searchUploadWorkFragment.isRefreshing) {
                    searchUploadWorkFragment.isRefreshing = false;
                    C18419g0 c18419g2 = searchUploadWorkFragment.mSearchWorkAdapter;
                    if (c18419g2 != null) {
                        c18419g2.mo36201n1(arrayList);
                    }
                } else {
                    C18419g0 c18419g3 = searchUploadWorkFragment.mSearchWorkAdapter;
                    if (c18419g3 != null) {
                        c18419g3.mo36208q(arrayList);
                    }
                }
                C24655b logViewConfig = searchUploadWorkFragment.getLogViewConfig();
                if (logViewConfig != null) {
                    logViewConfig.m96848k(true);
                }
                C24655b logViewConfig2 = searchUploadWorkFragment.getLogViewConfig();
                if (logViewConfig2 != null && (mapM96844g = logViewConfig2.m96844g()) != null) {
                    mapM96844g.put(NativeComponentConstants.KEY_COMPONENT_TYPE, String.valueOf(searchUploadWorkFragment.mType));
                }
                searchUploadWorkFragment.m77754L0(false);
            }
            if (!hasMore) {
                c18419g0.m36186h0().m108668t(false);
            }
            if (searchWorkEntity == null) {
                c18419g0.m36186h0().m108669v();
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final void m77744B0(View view, boolean z11) {
        view.dispatchWindowFocusChanged(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final void m77745C0(SearchUploadWorkFragment searchUploadWorkFragment, View view) {
        searchUploadWorkFragment.searchJob();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final void m77746D0(SearchUploadWorkFragment searchUploadWorkFragment, View view) {
        searchUploadWorkFragment.resetContent(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final void m77747E0(SearchUploadWorkFragment searchUploadWorkFragment, View view) {
        searchUploadWorkFragment.m77751I0();
        FragmentActivity activity = searchUploadWorkFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final void m77748F0(final SearchUploadWorkFragment searchUploadWorkFragment) {
        RecyclerView recyclerView;
        if (C27287m.f83003a.m106330e()) {
            SearchViewModel searchViewModel = searchUploadWorkFragment.mSearchViewModel;
            if (searchViewModel != null) {
                searchViewModel.m78075D(searchUploadWorkFragment.page, searchUploadWorkFragment.perPage, searchUploadWorkFragment.mKeyword);
                return;
            }
            return;
        }
        C28951b.f88586a.m111454d(R$string.no_network_toast);
        C28420e mViewBinding = searchUploadWorkFragment.getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f87177h) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: com.transsion.search.fragment.group.u
            @Override // java.lang.Runnable
            public final void run() {
                SearchUploadWorkFragment.m77749G0(this.f59794a);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final void m77749G0(SearchUploadWorkFragment searchUploadWorkFragment) {
        C27941f c27941fM36186h0;
        C18419g0 c18419g0 = searchUploadWorkFragment.mSearchWorkAdapter;
        if (c18419g0 == null || (c27941fM36186h0 = c18419g0.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final void m77750H0(SearchUploadWorkFragment searchUploadWorkFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List<Object> data;
        SearchSubject searchSubject;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "view");
        C18419g0 c18419g0 = searchUploadWorkFragment.mSearchWorkAdapter;
        if (c18419g0 == null || (data = c18419g0.getData()) == null || (searchSubject = (SearchSubject) data.get(i11)) == null) {
            return;
        }
        searchUploadWorkFragment.reportClick("", searchSubject.getSubjectId(), searchSubject.getOps(), i11);
        C23889b c23889b = new C23889b();
        c23889b.m94631o(3);
        c23889b.m94630n(1);
        c23889b.m94635s(searchSubject);
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23889b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, c23889b, 0L);
        FragmentActivity activity = searchUploadWorkFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: I0 */
    private final void m77751I0() {
        C28032a c28032a = new C28032a();
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C28032a.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, c28032a, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public final void m77752J0(boolean show) {
        C28420e mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            if (show) {
                TextView searchTV = mViewBinding.f87178i;
                Intrinsics.m97801g(searchTV, "searchTV");
                AbstractC26006c.m102058k(searchTV);
                AppCompatImageView clearIV = mViewBinding.f87171b;
                Intrinsics.m97801g(clearIV, "clearIV");
                AbstractC26006c.m102054g(clearIV);
                return;
            }
            TextView searchTV2 = mViewBinding.f87178i;
            Intrinsics.m97801g(searchTV2, "searchTV");
            AbstractC26006c.m102054g(searchTV2);
            AppCompatImageView clearIV2 = mViewBinding.f87171b;
            Intrinsics.m97801g(clearIV2, "clearIV");
            AbstractC26006c.m102058k(clearIV2);
        }
    }

    /* JADX INFO: renamed from: K0 */
    private final void m77753K0() {
        C28951b.f88586a.m111454d(R$string.no_network_toast);
        m77754L0(false);
        C18419g0 c18419g0 = this.mSearchWorkAdapter;
        if (c18419g0 != null) {
            c18419g0.m36171Y0(emptyView());
        }
        C18419g0 c18419g1 = this.mSearchWorkAdapter;
        if (c18419g1 != null) {
            c18419g1.mo36210q1(new ArrayList());
        }
    }

    /* JADX INFO: renamed from: L0 */
    private final void m77754L0(boolean showHistory) {
        C28420e mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            TextView recentTV = mViewBinding.f87176g;
            Intrinsics.m97801g(recentTV, "recentTV");
            recentTV.setVisibility(showHistory ? 0 : 8);
            if (!showHistory) {
                mViewBinding.f87177h.setAdapter(this.mSearchWorkAdapter);
                return;
            }
            mViewBinding.f87177h.setAdapter(this.mHistoryAdapter);
            C18407c c18407c = this.mHistoryAdapter;
            if (c18407c != null) {
                c18407c.mo36201n1((Collection) m77776v0().m78103h().m14847f());
            }
        }
    }

    private final View emptyView() {
        EditText editText;
        Editable text = null;
        View viewInflate = getLayoutInflater().inflate(R$layout.view_search_manager_empty, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_empty_tips);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.iv_tips);
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewInflate.findViewById(R$id.tv_retry);
        if (C27287m.f83003a.m106330e()) {
            C28420e mViewBinding = getMViewBinding();
            if (mViewBinding != null && (editText = mViewBinding.f87172c) != null) {
                text = editText.getText();
            }
            String strValueOf = String.valueOf(text);
            textView.setText(getString(com.transsion.search.R$string.user_works_empty) + " \"" + strValueOf + "\"");
            appCompatTextView.setVisibility(8);
            imageView.setImageResource(R$mipmap.ic_no_content);
        } else {
            textView.setText(com.transsion.baseui.R$string.base_network_fail);
            imageView.setImageResource(R$mipmap.ic_no_network);
            appCompatTextView.setVisibility(0);
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search.fragment.group.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchUploadWorkFragment.m77773s0(this.f59772a, view);
                }
            });
        }
        Intrinsics.m97799e(viewInflate);
        return viewInflate;
    }

    private final void initHistory() {
        final C18407c c18407c = new C18407c(new ArrayList());
        c18407c.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.search.fragment.group.v
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                SearchUploadWorkFragment.m77777x0(this.f59795a, c18407c);
            }
        });
        c18407c.m36227w1(new InterfaceC27566d() { // from class: com.transsion.search.fragment.group.w
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                SearchUploadWorkFragment.m77778y0(this.f59797a, baseQuickAdapter, view, i11);
            }
        });
        this.mHistoryAdapter = c18407c;
    }

    private final void initViewModel() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        SearchViewModel searchViewModel = (SearchViewModel) new C3227v0(fragmentActivityRequireActivity).m14969a(SearchViewModel.class);
        searchViewModel.m78080o().m14851j(getViewLifecycleOwner(), new C18402f(new Function1() { // from class: com.transsion.search.fragment.group.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchUploadWorkFragment.m77779z0(this.f59773a, (SearchGroupEntity) obj);
            }
        }));
        searchViewModel.m78082q().m14851j(getViewLifecycleOwner(), new C18402f(new Function1() { // from class: com.transsion.search.fragment.group.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchUploadWorkFragment.m77743A0(this.f59775a, (SearchWorkEntity) obj);
            }
        }));
        this.mSearchViewModel = searchViewModel;
    }

    private final void reportClick(String group_id, String subject_id, String opt, int position) {
        HashMap map = new HashMap();
        if (group_id == null) {
            group_id = "";
        }
        map.put("group_id", group_id);
        if (subject_id == null) {
            subject_id = "";
        }
        map.put("subject_id", subject_id);
        map.put("sequence", String.valueOf(position));
        if (opt == null) {
            opt = "";
        }
        map.put("ops", opt);
        C14450a.f50860a.m65143f("searchresult", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetContent(boolean clear) {
        EditText editText;
        if (!clear) {
            C28420e mViewBinding = getMViewBinding();
            if (mViewBinding != null && (editText = mViewBinding.f87172c) != null) {
                editText.setText("");
            }
            this.mKeyword = "";
        }
        C18419g0 c18419g0 = this.mSearchWorkAdapter;
        if (c18419g0 != null) {
            c18419g0.mo36210q1(new ArrayList());
        }
        C18419g0 c18419g1 = this.mSearchWorkAdapter;
        if (c18419g1 != null) {
            c18419g1.m36139H0();
        }
        C28420e mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null) {
            boolean z11 = true;
            m77754L0(true);
            TextView recentTV = mViewBinding2.f87176g;
            Intrinsics.m97801g(recentTV, "recentTV");
            C18407c c18407c = this.mHistoryAdapter;
            List<Object> data = c18407c != null ? c18407c.getData() : null;
            if (data != null && !data.isEmpty()) {
                z11 = false;
            }
            recentTV.setVisibility(z11 ? 8 : 0);
            KeyboardUtils.m27135i(mViewBinding2.f87172c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m77773s0(SearchUploadWorkFragment searchUploadWorkFragment, View view) {
        searchUploadWorkFragment.searchJob();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void searchJob() {
        ProgressBar progressBar;
        if (TextUtils.isEmpty(this.mKeyword)) {
            C13806h c13806h = C13806h.f49015a;
            c13806h.m62318e(16);
            c13806h.m62325l(getString(com.transsion.search.R$string.tips_movie));
            return;
        }
        this.isRefreshing = true;
        SearchManager.f59668f.m77605a().m77601g(this.mKeyword);
        C28420e mViewBinding = getMViewBinding();
        EditText editText = mViewBinding != null ? mViewBinding.f87172c : null;
        Intrinsics.m97799e(editText);
        KeyboardUtils.m27131e(editText);
        if (!C27287m.f83003a.m106330e()) {
            m77753K0();
            return;
        }
        C28420e mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (progressBar = mViewBinding2.f87175f) != null) {
            AbstractC26006c.m102058k(progressBar);
        }
        m77752J0(false);
        this.page = 1;
        SearchViewModel searchViewModel = this.mSearchViewModel;
        if (searchViewModel != null) {
            searchViewModel.m78075D(1, this.perPage, this.mKeyword);
        }
        HashMap map = new HashMap();
        map.put("module_name", "search");
        map.put(MBridgeConstans.KEY_WORD, this.mKeyword);
        map.put(NativeComponentConstants.KEY_COMPONENT_TYPE, String.valueOf(this.mType));
        C14450a.f50860a.m65143f("searchpage", map);
    }

    /* JADX INFO: renamed from: t0 */
    private final void m77774t0() {
        m77776v0().m78105k(true);
        m77776v0().m78103h().m14851j(this, new C18402f(new Function1() { // from class: com.transsion.search.fragment.group.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchUploadWorkFragment.m77775u0(this.f59793a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final Unit m77775u0(SearchUploadWorkFragment searchUploadWorkFragment, List list) {
        C28420e mViewBinding;
        TextView textView;
        List list2 = list;
        if ((list2 == null || list2.isEmpty()) && (mViewBinding = searchUploadWorkFragment.getMViewBinding()) != null && (textView = mViewBinding.f87176g) != null) {
            AbstractC26006c.m102054g(textView);
        }
        C18407c c18407c = searchUploadWorkFragment.mHistoryAdapter;
        if (c18407c != null) {
            c18407c.mo36201n1(list2);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: v0 */
    private final SearchWorkViewModel m77776v0() {
        return (SearchWorkViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m77777x0(SearchUploadWorkFragment searchUploadWorkFragment, C18407c c18407c) {
        if (searchUploadWorkFragment.m77776v0().m78102g()) {
            SearchWorkViewModel.m78100l(searchUploadWorkFragment.m77776v0(), false, 1, null);
        } else {
            c18407c.m36186h0().m108668t(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m77778y0(SearchUploadWorkFragment searchUploadWorkFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List<Object> data;
        VideoDetailPlayBean videoDetailPlayBean;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "view");
        C18407c c18407c = searchUploadWorkFragment.mHistoryAdapter;
        if (c18407c == null || (data = c18407c.getData()) == null || (videoDetailPlayBean = (VideoDetailPlayBean) data.get(i11)) == null) {
            return;
        }
        searchUploadWorkFragment.reportClick("", videoDetailPlayBean.getSubjectId(), "", i11);
        C23889b c23889b = new C23889b();
        c23889b.m94631o(3);
        c23889b.m94630n(1);
        C23889b c23889bM94636t = c23889b.m94636t(videoDetailPlayBean.getSubjectId(), videoDetailPlayBean.getSubjectType(), videoDetailPlayBean.getTitle(), videoDetailPlayBean.getCoverUrl(), videoDetailPlayBean.getThumbnail());
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23889b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        Intrinsics.m97799e(c23889bM94636t);
        flowEventBus.postEvent(name, c23889bM94636t, 0L);
        FragmentActivity activity = searchUploadWorkFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final Unit m77779z0(SearchUploadWorkFragment searchUploadWorkFragment, SearchGroupEntity searchGroupEntity) {
        ProgressBar progressBar;
        PagerEntity pager;
        PagerEntity pager2;
        String nextPage;
        Integer numV;
        searchUploadWorkFragment.page = (searchGroupEntity == null || (pager2 = searchGroupEntity.getPager()) == null || (nextPage = pager2.getNextPage()) == null || (numV = StringsKt.m98216v(nextPage)) == null) ? 1 : numV.intValue();
        searchUploadWorkFragment.perPage = (searchGroupEntity == null || (pager = searchGroupEntity.getPager()) == null) ? 10 : pager.getPerPage();
        C28420e mViewBinding = searchUploadWorkFragment.getMViewBinding();
        if (mViewBinding != null && (progressBar = mViewBinding.f87175f) != null) {
            AbstractC26006c.m102054g(progressBar);
        }
        return Unit.f75682a;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        setNetListener(new C18398b());
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        m77774t0();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        return new C24655b("searchpage", false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ProgressBar progressBar;
        C28420e mViewBinding = getMViewBinding();
        if (mViewBinding != null && (progressBar = mViewBinding.f87175f) != null) {
            AbstractC26006c.m102054g(progressBar);
        }
        super.onDestroyView();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        this.mType = arguments != null ? arguments.getInt(NativeComponentConstants.KEY_COMPONENT_TYPE) : 1;
        C18419g0 c18419g0 = new C18419g0(new ArrayList());
        c18419g0.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.search.fragment.group.x
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                SearchUploadWorkFragment.m77748F0(this.f59798a);
            }
        });
        c18419g0.m36227w1(new InterfaceC27566d() { // from class: com.transsion.search.fragment.group.y
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                SearchUploadWorkFragment.m77750H0(this.f59799a, baseQuickAdapter, view2, i11);
            }
        });
        this.mSearchWorkAdapter = c18419g0;
        initHistory();
        C28420e mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            mViewBinding.f87177h.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            mViewBinding.f87177h.setAdapter(this.mHistoryAdapter);
            RecyclerView recyclerView = mViewBinding.f87177h;
            C18419g0 c18419g1 = this.mSearchWorkAdapter;
            recyclerView.addOnScrollListener(new C23862a(c18419g1 != null ? c18419g1.m36186h0() : null));
            RecyclerView recyclerView2 = mViewBinding.f87177h;
            C18407c c18407c = this.mHistoryAdapter;
            recyclerView2.addOnScrollListener(new C23862a(c18407c != null ? c18407c.m36186h0() : null));
            initViewModel();
            mViewBinding.f87172c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.transsion.search.fragment.group.z
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z11) {
                    SearchUploadWorkFragment.m77744B0(view2, z11);
                }
            });
            mViewBinding.f87178i.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search.fragment.group.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SearchUploadWorkFragment.m77745C0(this.f59764a, view2);
                }
            });
            mViewBinding.f87172c.addTextChangedListener(new C18399c());
            mViewBinding.f87172c.setOnEditorActionListener(new C18400d());
            mViewBinding.f87171b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search.fragment.group.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SearchUploadWorkFragment.m77746D0(this.f59768a, view2);
                }
            });
            ProgressBar loadView = mViewBinding.f87175f;
            Intrinsics.m97801g(loadView, "loadView");
            AbstractC26006c.m102054g(loadView);
            mViewBinding.f87173d.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search.fragment.group.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SearchUploadWorkFragment.m77747E0(this.f59770a, view2);
                }
            });
            mViewBinding.f87172c.requestFocus();
            KeyboardUtils.m27135i(mViewBinding.f87172c);
            C24655b logViewConfig = getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96848k(true);
            }
            mViewBinding.f87177h.addOnScrollListener(new C18401e(mViewBinding));
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public C28420e getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28420e c28420eM109812c = C28420e.m109812c(inflater);
        Intrinsics.m97801g(c28420eM109812c, "inflate(...)");
        return c28420eM109812c;
    }
}
