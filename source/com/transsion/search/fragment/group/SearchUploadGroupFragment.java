package com.transsion.search.fragment.group;

import android.annotation.SuppressLint;
import android.content.Context;
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
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5789h;
import com.blankj.utilcode.util.AbstractC5796o;
import com.blankj.utilcode.util.KeyboardUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.p282tn.lib.widget.R$mipmap;
import com.p282tn.lib.widget.dialog.TRDialog;
import com.p282tn.lib.widget.dialog.TRDialogListener;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.R$color;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.publish.api.GroupBean;
import com.transsion.search.InterfaceC18354a;
import com.transsion.search.R$drawable;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search.R$string;
import com.transsion.search.SearchManager;
import com.transsion.search.adapter.C18362b;
import com.transsion.search.bean.Pager;
import com.transsion.search.bean.PagerEntity;
import com.transsion.search.bean.SearchGroupEntity;
import com.transsion.search.bean.SearchSubject;
import com.transsion.search.bean.SearchWorkEntity;
import com.transsion.search.dialog.CheckTipsDialog;
import com.transsion.search.fragment.group.adapter.C18405a;
import com.transsion.search.fragment.group.adapter.C18406b;
import com.transsion.search.viewmodel.SearchViewModel;
import com.transsnet.downloader.DownloadManagerApi;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import hk.C23862a;
import java.util.ArrayList;
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
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import p465hp.C23889b;
import p550kj.C24655b;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import p765s6.InterfaceC27564b;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p818uq.C28032a;
import p881wq.C28419d;
import p917xq.InterfaceC28630a;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001SB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0005J5\u0010\u001d\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010\u0005J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010\u0005J\u0017\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b/\u0010.J\u0011\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00170>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\u0016\u0010G\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u0016\u0010H\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P¨\u0006T"}, m97100d2 = {"Lcom/transsion/search/fragment/group/SearchUploadGroupFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lwq/d;", "Lcom/tn/lib/widget/dialog/TRDialogListener;", "<init>", "()V", "", "clear", "", "resetContent", "(Z)V", "postFinsh", "Lcom/transsion/publish/api/GroupBean;", "groupBean", "postGroup", "(Lcom/transsion/publish/api/GroupBean;)V", "searchJob", "initViewModel", "Landroid/view/View;", "emptyView", "()Landroid/view/View;", "clearTipsDialog", "showCheckDialog", "", "group_id", "subject_id", "opt", "", RequestParameters.POSITION, "reportClick", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Landroid/view/LayoutInflater;", "inflater", "getViewBinding", "(Landroid/view/LayoutInflater;)Lwq/d;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "initView", "lazyLoadData", "onDestroyView", "Lcom/tn/lib/widget/dialog/TRDialog;", "dialog", "onLeftButtonClick", "(Lcom/tn/lib/widget/dialog/TRDialog;)V", "onRightButtonClick", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "isRefreshing", "Z", "Lcom/transsion/search/fragment/group/adapter/a;", "mSearchGroupAdapter", "Lcom/transsion/search/fragment/group/adapter/a;", "Lcom/transsion/search/fragment/group/adapter/b;", "mSearchKeywordAdapter", "Lcom/transsion/search/fragment/group/adapter/b;", "Lcom/transsion/search/adapter/b;", "mSearchWorkAdapter", "Lcom/transsion/search/adapter/b;", "", "mHistoryList", "Ljava/util/List;", "Lcom/transsion/search/viewmodel/SearchViewModel;", "mSearchViewModel", "Lcom/transsion/search/viewmodel/SearchViewModel;", "mType", "I", "page", "perPage", "mKeyword", "Ljava/lang/String;", "selectGroup", "Lcom/transsion/publish/api/GroupBean;", "Lcom/transsion/search/dialog/CheckTipsDialog;", "mCheckTipsDialog$delegate", "Lkotlin/Lazy;", "getMCheckTipsDialog", "()Lcom/transsion/search/dialog/CheckTipsDialog;", "mCheckTipsDialog", "Companion", "a", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SearchUploadGroupFragment extends BaseFragment<C28419d> implements TRDialogListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private boolean isRefreshing;
    private C18405a mSearchGroupAdapter;
    private C18406b mSearchKeywordAdapter;
    private SearchViewModel mSearchViewModel;
    private C18362b mSearchWorkAdapter;
    private int mType;
    private GroupBean selectGroup;
    private List<String> mHistoryList = new ArrayList();
    private int page = 1;
    private int perPage = 10;
    private String mKeyword = "";

    /* JADX INFO: renamed from: mCheckTipsDialog$delegate, reason: from kotlin metadata */
    private final Lazy mCheckTipsDialog = LazyKt.m97097b(new Function0() { // from class: com.transsion.search.fragment.group.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchUploadGroupFragment.mCheckTipsDialog_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.transsion.search.fragment.group.SearchUploadGroupFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SearchUploadGroupFragment m77738a(int i11) {
            SearchUploadGroupFragment searchUploadGroupFragment = new SearchUploadGroupFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(NativeComponentConstants.KEY_COMPONENT_TYPE, i11);
            searchUploadGroupFragment.setArguments(bundle);
            return searchUploadGroupFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.group.SearchUploadGroupFragment$b */
    public static final class C18390b implements InterfaceC27288n {
        C18390b() {
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected() {
            InterfaceC27288n.a.m106338a(this);
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
            C27941f c27941fM36186h0;
            C27941f c27941fM36186h1;
            List<Object> data;
            List<Object> data2;
            Intrinsics.m97802h(network, "network");
            Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
            C18362b c18362b = SearchUploadGroupFragment.this.mSearchWorkAdapter;
            if (c18362b == null || (data2 = c18362b.getData()) == null || !data2.isEmpty()) {
                C18362b c18362b2 = SearchUploadGroupFragment.this.mSearchWorkAdapter;
                if (c18362b2 != null && (c27941fM36186h0 = c18362b2.m36186h0()) != null) {
                    c27941fM36186h0.m108670w();
                }
            } else {
                SearchUploadGroupFragment.this.searchJob();
            }
            C18405a c18405a = SearchUploadGroupFragment.this.mSearchGroupAdapter;
            if (c18405a != null && (data = c18405a.getData()) != null && data.isEmpty()) {
                SearchUploadGroupFragment.this.searchJob();
                return;
            }
            C18405a c18405a2 = SearchUploadGroupFragment.this.mSearchGroupAdapter;
            if (c18405a2 == null || (c27941fM36186h1 = c18405a2.m36186h0()) == null) {
                return;
            }
            c27941fM36186h1.m108670w();
        }

        @Override // p743rh.InterfaceC27288n
        public void onDisconnected() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.group.SearchUploadGroupFragment$c */
    public static final class C18391c implements TextView.OnEditorActionListener {
        C18391c() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
            if (i11 != 0 && i11 != 3) {
                return false;
            }
            SearchUploadGroupFragment.this.mKeyword = String.valueOf(textView != null ? textView.getText() : null);
            SearchUploadGroupFragment.this.searchJob();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.group.SearchUploadGroupFragment$d */
    public static final class C18392d implements InterfaceC28630a {
        C18392d() {
        }

        @Override // p917xq.InterfaceC28630a
        /* JADX INFO: renamed from: a */
        public void mo77739a() {
            String groupId;
            SearchViewModel searchViewModel;
            GroupBean groupBean = SearchUploadGroupFragment.this.selectGroup;
            if (groupBean == null || (groupId = groupBean.getGroupId()) == null || (searchViewModel = SearchUploadGroupFragment.this.mSearchViewModel) == null) {
                return;
            }
            searchViewModel.m78088y(groupId);
        }

        @Override // p917xq.InterfaceC28630a
        /* JADX INFO: renamed from: b */
        public void mo77740b() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.group.SearchUploadGroupFragment$e */
    public static final class C18393e extends RecyclerView.AbstractC4219r {
        C18393e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            FragmentActivity activity;
            C28419d mViewBinding;
            EditText editText;
            Intrinsics.m97802h(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i11);
            if (i11 != 1 || (activity = SearchUploadGroupFragment.this.getActivity()) == null) {
                return;
            }
            SearchUploadGroupFragment searchUploadGroupFragment = SearchUploadGroupFragment.this;
            if (!KeyboardUtils.m27133g(activity) || (mViewBinding = searchUploadGroupFragment.getMViewBinding()) == null || (editText = mViewBinding.f87161b) == null) {
                return;
            }
            KeyboardUtils.m27131e(editText);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.group.SearchUploadGroupFragment$f */
    public static final class C18394f implements InterfaceC18354a {
        C18394f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final void m77742c(List list, SearchUploadGroupFragment searchUploadGroupFragment) {
            RelativeLayout relativeLayout;
            List list2 = list;
            if (list2.isEmpty()) {
                C28419d mViewBinding = searchUploadGroupFragment.getMViewBinding();
                if (mViewBinding == null || (relativeLayout = mViewBinding.f87166g) == null) {
                    return;
                }
                relativeLayout.setVisibility(8);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list2);
            CollectionsKt.m97544Y(arrayList);
            searchUploadGroupFragment.mHistoryList = arrayList;
            C18406b c18406b = searchUploadGroupFragment.mSearchKeywordAdapter;
            if (c18406b != null) {
                c18406b.mo36210q1(arrayList);
            }
        }

        @Override // com.transsion.search.InterfaceC18354a
        /* JADX INFO: renamed from: a */
        public void mo77606a(final List list) {
            Intrinsics.m97802h(list, "list");
            FragmentActivity activity = SearchUploadGroupFragment.this.getActivity();
            if (activity != null) {
                final SearchUploadGroupFragment searchUploadGroupFragment = SearchUploadGroupFragment.this;
                activity.runOnUiThread(new Runnable() { // from class: com.transsion.search.fragment.group.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchUploadGroupFragment.C18394f.m77742c(list, searchUploadGroupFragment);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.group.SearchUploadGroupFragment$g */
    public static final class C18395g implements TextWatcher {
        C18395g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AppCompatImageView appCompatImageView;
            AppCompatImageView appCompatImageView2;
            if ((editable != null ? editable.length() : 0) > 0) {
                C28419d mViewBinding = SearchUploadGroupFragment.this.getMViewBinding();
                if (mViewBinding != null && (appCompatImageView2 = mViewBinding.f87163d) != null) {
                    appCompatImageView2.setVisibility(0);
                }
            } else {
                C28419d mViewBinding2 = SearchUploadGroupFragment.this.getMViewBinding();
                if (mViewBinding2 != null && (appCompatImageView = mViewBinding2.f87163d) != null) {
                    appCompatImageView.setVisibility(8);
                }
                SearchUploadGroupFragment.this.resetContent(true);
            }
            SearchUploadGroupFragment.this.mKeyword = String.valueOf(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            TextView textView;
            C28419d mViewBinding = SearchUploadGroupFragment.this.getMViewBinding();
            if (mViewBinding == null || (textView = mViewBinding.f87169j) == null) {
                return;
            }
            AbstractC26006c.m102058k(textView);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.group.SearchUploadGroupFragment$h */
    static final class C18396h implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59746a;

        C18396h(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59746a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59746a;
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
            this.f59746a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearTipsDialog() {
        try {
            TRDialog.C13786a c13786a = new TRDialog.C13786a();
            String string = getString(R$string.search_clear_title);
            Intrinsics.m97801g(string, "getString(...)");
            TRDialog.C13786a c13786aM62292k = c13786a.m62292k(string);
            String string2 = getString(R$string.search_clear_des);
            Intrinsics.m97801g(string2, "getString(...)");
            TRDialog.C13786a c13786aM62288g = c13786aM62292k.m62288g(string2);
            String string3 = getString(R$string.search_clear_cancel);
            Intrinsics.m97801g(string3, "getString(...)");
            TRDialog.C13786a c13786aM62286e = c13786aM62288g.m62286e(string3);
            String string4 = getString(R$string.search_clear_clear);
            Intrinsics.m97801g(string4, "getString(...)");
            c13786aM62286e.m62291j(string4).m62289h(R$drawable.btn_bg_dialog_edit_selector).m62284c(R$drawable.btn_bg_dialog_edit_selector).m62290i(AbstractC5789h.m27406a(R$color.base_color_black)).m62287f(this).m62282a().m62248d0(this, "clear_tips");
        } catch (Exception unused) {
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
            C28419d mViewBinding = getMViewBinding();
            if (mViewBinding != null && (editText = mViewBinding.f87161b) != null) {
                text = editText.getText();
            }
            String strValueOf = String.valueOf(text);
            textView.setText(getString(R$string.user_works_empty) + " \"" + strValueOf + "\"");
            appCompatTextView.setVisibility(8);
            imageView.setImageResource(R$mipmap.ic_no_content);
        } else {
            textView.setText(com.transsion.baseui.R$string.base_net_err);
            imageView.setImageResource(R$mipmap.ic_no_network);
            appCompatTextView.setVisibility(0);
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search.fragment.group.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f59771a.searchJob();
                }
            });
        }
        Intrinsics.m97799e(viewInflate);
        return viewInflate;
    }

    private final CheckTipsDialog getMCheckTipsDialog() {
        return (CheckTipsDialog) this.mCheckTipsDialog.getValue();
    }

    @SuppressLint({"InflateParams"})
    private final void initViewModel() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        SearchViewModel searchViewModel = (SearchViewModel) new C3227v0(fragmentActivityRequireActivity).m14969a(SearchViewModel.class);
        searchViewModel.m78080o().m14851j(getViewLifecycleOwner(), new C18396h(new Function1() { // from class: com.transsion.search.fragment.group.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchUploadGroupFragment.initViewModel$lambda$28$lambda$24(this.f59774a, (SearchGroupEntity) obj);
            }
        }));
        searchViewModel.m78082q().m14851j(getViewLifecycleOwner(), new C18396h(new Function1() { // from class: com.transsion.search.fragment.group.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchUploadGroupFragment.initViewModel$lambda$28$lambda$26(this.f59776a, (SearchWorkEntity) obj);
            }
        }));
        searchViewModel.m78079m().m14851j(getViewLifecycleOwner(), new C18396h(new Function1() { // from class: com.transsion.search.fragment.group.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchUploadGroupFragment.initViewModel$lambda$28$lambda$27(this.f59779a, (String) obj);
            }
        }));
        this.mSearchViewModel = searchViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initViewModel$lambda$28$lambda$24(SearchUploadGroupFragment searchUploadGroupFragment, SearchGroupEntity searchGroupEntity) {
        List<Object> data;
        RecyclerView recyclerView;
        RelativeLayout relativeLayout;
        RecyclerView recyclerView2;
        ProgressBar progressBar;
        PagerEntity pager;
        PagerEntity pager2;
        String nextPage;
        Integer numV;
        PagerEntity pager3;
        RecyclerView.Adapter adapter = null;
        List<GroupBean> items = searchGroupEntity != null ? searchGroupEntity.getItems() : null;
        boolean hasMore = (searchGroupEntity == null || (pager3 = searchGroupEntity.getPager()) == null) ? false : pager3.getHasMore();
        searchUploadGroupFragment.page = (searchGroupEntity == null || (pager2 = searchGroupEntity.getPager()) == null || (nextPage = pager2.getNextPage()) == null || (numV = StringsKt.m98216v(nextPage)) == null) ? 1 : numV.intValue();
        searchUploadGroupFragment.perPage = (searchGroupEntity == null || (pager = searchGroupEntity.getPager()) == null) ? 10 : pager.getPerPage();
        C28419d mViewBinding = searchUploadGroupFragment.getMViewBinding();
        if (mViewBinding != null && (progressBar = mViewBinding.f87165f) != null) {
            AbstractC26006c.m102054g(progressBar);
        }
        C18405a c18405a = searchUploadGroupFragment.mSearchGroupAdapter;
        if (c18405a != null) {
            c18405a.m36186h0().m108667s();
            List<GroupBean> list = items;
            if (list == null || list.isEmpty()) {
                C18405a c18405a2 = searchUploadGroupFragment.mSearchGroupAdapter;
                if (c18405a2 != null) {
                    c18405a2.mo36210q1(new ArrayList());
                }
                c18405a.m36171Y0(searchUploadGroupFragment.emptyView());
                c18405a.m36233z1(true);
            }
            C28419d mViewBinding2 = searchUploadGroupFragment.getMViewBinding();
            if (mViewBinding2 != null && (recyclerView2 = mViewBinding2.f87167h) != null) {
                adapter = recyclerView2.getAdapter();
            }
            if (adapter instanceof C18406b) {
                C28419d mViewBinding3 = searchUploadGroupFragment.getMViewBinding();
                if (mViewBinding3 != null && (relativeLayout = mViewBinding3.f87166g) != null) {
                    relativeLayout.setVisibility(8);
                }
                C28419d mViewBinding4 = searchUploadGroupFragment.getMViewBinding();
                if (mViewBinding4 != null && (recyclerView = mViewBinding4.f87167h) != null) {
                    recyclerView.setAdapter(searchUploadGroupFragment.mSearchGroupAdapter);
                }
            }
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : items) {
                    GroupBean groupBean = (GroupBean) obj;
                    C18405a c18405a3 = searchUploadGroupFragment.mSearchGroupAdapter;
                    if (c18405a3 != null && (data = c18405a3.getData()) != null && !data.contains(groupBean)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    c18405a.m36186h0().m108668t(false);
                } else if (searchUploadGroupFragment.isRefreshing) {
                    searchUploadGroupFragment.isRefreshing = false;
                    C18405a c18405a4 = searchUploadGroupFragment.mSearchGroupAdapter;
                    if (c18405a4 != null) {
                        c18405a4.mo36201n1(arrayList);
                    }
                } else {
                    C18405a c18405a5 = searchUploadGroupFragment.mSearchGroupAdapter;
                    if (c18405a5 != null) {
                        c18405a5.mo36208q(arrayList);
                    }
                }
            }
            if (!hasMore) {
                c18405a.m36186h0().m108668t(false);
            }
            if (searchGroupEntity == null) {
                c18405a.m36186h0().m108669v();
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initViewModel$lambda$28$lambda$26(SearchUploadGroupFragment searchUploadGroupFragment, SearchWorkEntity searchWorkEntity) {
        Pager pager;
        HashMap mapM96844g;
        RecyclerView recyclerView;
        RelativeLayout relativeLayout;
        RecyclerView recyclerView2;
        List<Object> data;
        ProgressBar progressBar;
        Pager pager2;
        Pager pager3;
        Pager pager4;
        RecyclerView.Adapter adapter = null;
        List<SearchSubject> items = searchWorkEntity != null ? searchWorkEntity.getItems() : null;
        boolean hasMore = (searchWorkEntity == null || (pager4 = searchWorkEntity.getPager()) == null) ? false : pager4.getHasMore();
        searchUploadGroupFragment.page = (searchWorkEntity == null || (pager3 = searchWorkEntity.getPager()) == null) ? 1 : pager3.getNextPage();
        searchUploadGroupFragment.perPage = (searchWorkEntity == null || (pager2 = searchWorkEntity.getPager()) == null) ? 10 : pager2.getPerPage();
        C28419d mViewBinding = searchUploadGroupFragment.getMViewBinding();
        if (mViewBinding != null && (progressBar = mViewBinding.f87165f) != null) {
            AbstractC26006c.m102054g(progressBar);
        }
        C18362b c18362b = searchUploadGroupFragment.mSearchWorkAdapter;
        if (c18362b != null) {
            c18362b.m36186h0().m108667s();
            C18362b c18362b2 = searchUploadGroupFragment.mSearchWorkAdapter;
            Boolean boolValueOf = (c18362b2 == null || (data = c18362b2.getData()) == null) ? null : Boolean.valueOf(data.isEmpty());
            List<SearchSubject> list = items;
            if ((list == null || list.isEmpty()) && Intrinsics.m97797c(boolValueOf, Boolean.TRUE) && (searchUploadGroupFragment.page == 1 || (searchWorkEntity != null && (pager = searchWorkEntity.getPager()) != null && pager.getPage() == 1))) {
                C18362b c18362b3 = searchUploadGroupFragment.mSearchWorkAdapter;
                if (c18362b3 != null) {
                    c18362b3.mo36210q1(new ArrayList());
                }
                c18362b.m36171Y0(searchUploadGroupFragment.emptyView());
                c18362b.m36233z1(true);
            }
            C28419d mViewBinding2 = searchUploadGroupFragment.getMViewBinding();
            if (mViewBinding2 != null && (recyclerView2 = mViewBinding2.f87167h) != null) {
                adapter = recyclerView2.getAdapter();
            }
            if (adapter instanceof C18406b) {
                C28419d mViewBinding3 = searchUploadGroupFragment.getMViewBinding();
                if (mViewBinding3 != null && (relativeLayout = mViewBinding3.f87166g) != null) {
                    relativeLayout.setVisibility(8);
                }
                C28419d mViewBinding4 = searchUploadGroupFragment.getMViewBinding();
                if (mViewBinding4 != null && (recyclerView = mViewBinding4.f87167h) != null) {
                    recyclerView.setAdapter(searchUploadGroupFragment.mSearchWorkAdapter);
                }
            }
            if (list == null || list.isEmpty()) {
                c18362b.m36186h0().m108668t(false);
            } else {
                if (searchUploadGroupFragment.isRefreshing) {
                    searchUploadGroupFragment.isRefreshing = false;
                    C18362b c18362b4 = searchUploadGroupFragment.mSearchWorkAdapter;
                    if (c18362b4 != null) {
                        c18362b4.mo36201n1(list);
                    }
                } else {
                    C18362b c18362b5 = searchUploadGroupFragment.mSearchWorkAdapter;
                    if (c18362b5 != null) {
                        c18362b5.mo36208q(list);
                    }
                }
                C24655b logViewConfig = searchUploadGroupFragment.getLogViewConfig();
                if (logViewConfig != null) {
                    logViewConfig.m96848k(true);
                }
                C24655b logViewConfig2 = searchUploadGroupFragment.getLogViewConfig();
                if (logViewConfig2 != null && (mapM96844g = logViewConfig2.m96844g()) != null) {
                    mapM96844g.put(NativeComponentConstants.KEY_COMPONENT_TYPE, String.valueOf(searchUploadGroupFragment.mType));
                }
            }
            if (!hasMore) {
                c18362b.m36186h0().m108668t(false);
            }
            if (searchWorkEntity == null) {
                c18362b.m36186h0().m108669v();
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initViewModel$lambda$28$lambda$27(SearchUploadGroupFragment searchUploadGroupFragment, String str) {
        if (!TextUtils.isEmpty(str) && searchUploadGroupFragment.selectGroup != null) {
            searchUploadGroupFragment.postFinsh();
            searchUploadGroupFragment.postGroup(searchUploadGroupFragment.selectGroup);
            FragmentActivity activity = searchUploadGroupFragment.getActivity();
            if (activity != null) {
                activity.finish();
            }
            return Unit.f75682a;
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckTipsDialog mCheckTipsDialog_delegate$lambda$0() {
        return CheckTipsDialog.INSTANCE.m77671a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$10$lambda$7(final SearchUploadGroupFragment searchUploadGroupFragment) {
        RecyclerView recyclerView;
        if (C27287m.f83003a.m106330e()) {
            SearchViewModel searchViewModel = searchUploadGroupFragment.mSearchViewModel;
            if (searchViewModel != null) {
                searchViewModel.m78074C(searchUploadGroupFragment.page, searchUploadGroupFragment.perPage, searchUploadGroupFragment.mKeyword);
                return;
            }
            return;
        }
        C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
        C28419d mViewBinding = searchUploadGroupFragment.getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f87167h) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: com.transsion.search.fragment.group.a
            @Override // java.lang.Runnable
            public final void run() {
                SearchUploadGroupFragment.onViewCreated$lambda$10$lambda$7$lambda$6(this.f59763a);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$10$lambda$7$lambda$6(SearchUploadGroupFragment searchUploadGroupFragment) {
        C27941f c27941fM36186h0;
        C18362b c18362b = searchUploadGroupFragment.mSearchWorkAdapter;
        if (c18362b == null || (c27941fM36186h0 = c18362b.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$10$lambda$9(SearchUploadGroupFragment searchUploadGroupFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List<Object> data;
        GroupBean groupBean;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "view");
        C18405a c18405a = searchUploadGroupFragment.mSearchGroupAdapter;
        if (c18405a == null || (data = c18405a.getData()) == null || (groupBean = (GroupBean) data.get(i11)) == null) {
            return;
        }
        searchUploadGroupFragment.selectGroup = groupBean;
        searchUploadGroupFragment.reportClick(groupBean.getGroupId(), "", groupBean.getOps(), i11);
        searchUploadGroupFragment.postFinsh();
        searchUploadGroupFragment.postGroup(searchUploadGroupFragment.selectGroup);
        FragmentActivity activity = searchUploadGroupFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$14(SearchUploadGroupFragment searchUploadGroupFragment, BaseQuickAdapter adapter, View view, int i11) {
        ProgressBar progressBar;
        EditText editText;
        EditText editText2;
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (view.getId() == R$id.tv_keyword) {
            FragmentActivity activity = searchUploadGroupFragment.getActivity();
            if (activity != null) {
                KeyboardUtils.m27130d(activity);
            }
            C18406b c18406b = searchUploadGroupFragment.mSearchKeywordAdapter;
            searchUploadGroupFragment.mKeyword = String.valueOf(c18406b != null ? (String) c18406b.getItem(i11) : null);
            C28419d mViewBinding = searchUploadGroupFragment.getMViewBinding();
            if (mViewBinding != null && (editText2 = mViewBinding.f87161b) != null) {
                editText2.setText(searchUploadGroupFragment.mKeyword);
            }
            int length = searchUploadGroupFragment.mKeyword.length();
            C28419d mViewBinding2 = searchUploadGroupFragment.getMViewBinding();
            if (mViewBinding2 != null && (editText = mViewBinding2.f87161b) != null) {
                editText.setSelection(length);
            }
            C28419d mViewBinding3 = searchUploadGroupFragment.getMViewBinding();
            if (mViewBinding3 != null && (progressBar = mViewBinding3.f87165f) != null) {
                progressBar.setVisibility(0);
            }
            int i12 = searchUploadGroupFragment.mType;
            if (i12 == 1 || i12 == 2 || i12 == 3) {
                searchUploadGroupFragment.page = 1;
                searchUploadGroupFragment.searchJob();
            }
            SearchManager.f59668f.m77605a().m77601g(searchUploadGroupFragment.mKeyword);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$15(SearchUploadGroupFragment searchUploadGroupFragment, View view) {
        TextView textView;
        C28419d mViewBinding = searchUploadGroupFragment.getMViewBinding();
        if (mViewBinding == null || (textView = mViewBinding.f87169j) == null) {
            return;
        }
        AbstractC26006c.m102058k(textView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x003d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    public static final void onViewCreated$lambda$16(SearchUploadGroupFragment searchUploadGroupFragment, View view, boolean z11) {
        HashMap mapM96844g;
        C18362b c18362b;
        List<Object> data;
        C28419d mViewBinding;
        C18406b c18406b;
        RelativeLayout relativeLayout;
        List<Object> data2;
        RelativeLayout relativeLayout2;
        view.dispatchWindowFocusChanged(z11);
        if (z11) {
            int i11 = searchUploadGroupFragment.mType;
            if (i11 == 1) {
                c18362b = searchUploadGroupFragment.mSearchWorkAdapter;
                if (c18362b != null && (data = c18362b.getData()) != null && data.isEmpty()) {
                    mViewBinding = searchUploadGroupFragment.getMViewBinding();
                    if (mViewBinding != null && (relativeLayout = mViewBinding.f87166g) != null) {
                        relativeLayout.setVisibility(0);
                    }
                    c18406b = searchUploadGroupFragment.mSearchKeywordAdapter;
                    if (c18406b != null) {
                        c18406b.mo36210q1(searchUploadGroupFragment.mHistoryList);
                    }
                }
            } else if (i11 == 2) {
                C18405a c18405a = searchUploadGroupFragment.mSearchGroupAdapter;
                if (c18405a != null && (data2 = c18405a.getData()) != null && data2.isEmpty()) {
                    C28419d mViewBinding2 = searchUploadGroupFragment.getMViewBinding();
                    if (mViewBinding2 != null && (relativeLayout2 = mViewBinding2.f87166g) != null) {
                        relativeLayout2.setVisibility(0);
                    }
                    C18406b c18406b2 = searchUploadGroupFragment.mSearchKeywordAdapter;
                    if (c18406b2 != null) {
                        c18406b2.mo36210q1(searchUploadGroupFragment.mHistoryList);
                    }
                }
            } else if (i11 == 3) {
                c18362b = searchUploadGroupFragment.mSearchWorkAdapter;
                if (c18362b != null) {
                    mViewBinding = searchUploadGroupFragment.getMViewBinding();
                    if (mViewBinding != null) {
                        relativeLayout.setVisibility(0);
                    }
                    c18406b = searchUploadGroupFragment.mSearchKeywordAdapter;
                    if (c18406b != null) {
                        c18406b.mo36210q1(searchUploadGroupFragment.mHistoryList);
                    }
                }
            }
        }
        String strM27447j = AbstractC5796o.m27447j(searchUploadGroupFragment.mHistoryList);
        C24655b logViewConfig = searchUploadGroupFragment.getLogViewConfig();
        if (logViewConfig == null || (mapM96844g = logViewConfig.m96844g()) == null) {
            return;
        }
        mapM96844g.put("keyword", strM27447j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$19(SearchUploadGroupFragment searchUploadGroupFragment, View view) {
        searchUploadGroupFragment.postFinsh();
        FragmentActivity activity = searchUploadGroupFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5$lambda$2(final SearchUploadGroupFragment searchUploadGroupFragment) {
        RecyclerView recyclerView;
        if (C27287m.f83003a.m106330e()) {
            SearchViewModel searchViewModel = searchUploadGroupFragment.mSearchViewModel;
            if (searchViewModel != null) {
                searchViewModel.m78075D(searchUploadGroupFragment.page, searchUploadGroupFragment.perPage, searchUploadGroupFragment.mKeyword);
                return;
            }
            return;
        }
        C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
        C28419d mViewBinding = searchUploadGroupFragment.getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f87167h) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: com.transsion.search.fragment.group.i
            @Override // java.lang.Runnable
            public final void run() {
                SearchUploadGroupFragment.onViewCreated$lambda$5$lambda$2$lambda$1(this.f59780a);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5$lambda$2$lambda$1(SearchUploadGroupFragment searchUploadGroupFragment) {
        C27941f c27941fM36186h0;
        C18362b c18362b = searchUploadGroupFragment.mSearchWorkAdapter;
        if (c18362b == null || (c27941fM36186h0 = c18362b.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5$lambda$4(SearchUploadGroupFragment searchUploadGroupFragment, C18362b c18362b, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List<Object> data;
        SearchSubject searchSubject;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "view");
        C18362b c18362b2 = searchUploadGroupFragment.mSearchWorkAdapter;
        if (c18362b2 == null || (data = c18362b2.getData()) == null || (searchSubject = (SearchSubject) data.get(i11)) == null) {
            return;
        }
        searchUploadGroupFragment.reportClick("", searchSubject.getSubjectId(), searchSubject.getOps(), i11);
        if (searchUploadGroupFragment.mType == 3) {
            Integer subjectType = searchSubject.getSubjectType();
            int value = SubjectType.SHORT_TV.getValue();
            if (subjectType == null || subjectType.intValue() != value) {
                Navigator navigatorM61773c = TheRouter.m61773c("/movie/detail");
                Integer subjectType2 = searchSubject.getSubjectType();
                Navigator.m61845x(navigatorM61773c.m61852F("subject_type", subjectType2 != null ? subjectType2.intValue() : SubjectType.MOVIE.getValue()).m61857K("id", searchSubject.getSubjectId()).m61857K("ops", searchSubject.getOps()), searchUploadGroupFragment.requireContext(), null, 2, null);
                return;
            } else {
                DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
                Context context = c18362b.getContext();
                Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                downloadManagerApiM87093a.m87086d0((FragmentActivity) context, "searchpage", (384 & 4) != 0 ? "" : "", searchSubject.getOps(), (384 & 16) != 0 ? null : "download_subject", (384 & 32) != 0 ? false : false, (384 & 64) != 0 ? null : searchSubject, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? Boolean.FALSE : null);
                return;
            }
        }
        C23889b c23889b = new C23889b();
        c23889b.m94631o(3);
        c23889b.m94630n(1);
        c23889b.m94635s(searchSubject);
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23889b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, c23889b, 0L);
        FragmentActivity activity = searchUploadGroupFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private final void postFinsh() {
        C28032a c28032a = new C28032a();
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C28032a.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, c28032a, 0L);
    }

    private final void postGroup(GroupBean groupBean) {
        C23889b c23889b = new C23889b();
        c23889b.m94631o(6);
        c23889b.m94630n(1);
        c23889b.m94629m(groupBean);
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23889b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, c23889b, 0L);
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
    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    /* JADX WARN: Code duplicated, block: B:24:0x003a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:30:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    public final void resetContent(boolean clear) {
        C18362b c18362b;
        C18362b c18362b2;
        ArrayList arrayList;
        C18406b c18406b;
        C28419d mViewBinding;
        C28419d mViewBinding2;
        RelativeLayout relativeLayout;
        C28419d mViewBinding3;
        RelativeLayout relativeLayout2;
        RecyclerView recyclerView;
        EditText editText;
        EditText editText2;
        if (!clear) {
            C28419d mViewBinding4 = getMViewBinding();
            if (mViewBinding4 != null && (editText2 = mViewBinding4.f87161b) != null) {
                editText2.setText("");
            }
            this.mKeyword = "";
        }
        int i11 = this.mType;
        if (i11 == 1) {
            c18362b = this.mSearchWorkAdapter;
            if (c18362b != null) {
                c18362b.mo36210q1(new ArrayList());
            }
            c18362b2 = this.mSearchWorkAdapter;
            if (c18362b2 != null) {
                c18362b2.m36139H0();
            }
            arrayList = new ArrayList();
            arrayList.addAll(SearchManager.f59668f.m77605a().m77603l());
            CollectionsKt.m97544Y(arrayList);
            this.mHistoryList = arrayList;
            c18406b = this.mSearchKeywordAdapter;
            if (c18406b != null) {
                c18406b.mo36210q1(arrayList);
            }
            mViewBinding = getMViewBinding();
            if (mViewBinding != null && (recyclerView = mViewBinding.f87167h) != null) {
                recyclerView.setAdapter(this.mSearchKeywordAdapter);
            }
            if (arrayList.isEmpty()) {
                mViewBinding2 = getMViewBinding();
                if (mViewBinding2 != null && (relativeLayout = mViewBinding2.f87166g) != null) {
                    relativeLayout.setVisibility(8);
                }
            } else {
                mViewBinding3 = getMViewBinding();
                if (mViewBinding3 != null && (relativeLayout2 = mViewBinding3.f87166g) != null) {
                    relativeLayout2.setVisibility(0);
                }
            }
        } else if (i11 == 2) {
            C18405a c18405a = this.mSearchGroupAdapter;
            if (c18405a != null) {
                c18405a.mo36210q1(new ArrayList());
            }
            C18362b c18362b3 = this.mSearchWorkAdapter;
            if (c18362b3 != null) {
                c18362b3.m36139H0();
            }
        } else if (i11 == 3) {
            c18362b = this.mSearchWorkAdapter;
            if (c18362b != null) {
                c18362b.mo36210q1(new ArrayList());
            }
            c18362b2 = this.mSearchWorkAdapter;
            if (c18362b2 != null) {
                c18362b2.m36139H0();
            }
            arrayList = new ArrayList();
            arrayList.addAll(SearchManager.f59668f.m77605a().m77603l());
            CollectionsKt.m97544Y(arrayList);
            this.mHistoryList = arrayList;
            c18406b = this.mSearchKeywordAdapter;
            if (c18406b != null) {
                c18406b.mo36210q1(arrayList);
            }
            mViewBinding = getMViewBinding();
            if (mViewBinding != null) {
                recyclerView.setAdapter(this.mSearchKeywordAdapter);
            }
            if (arrayList.isEmpty()) {
                mViewBinding3 = getMViewBinding();
                if (mViewBinding3 != null) {
                    relativeLayout2.setVisibility(0);
                }
            } else {
                mViewBinding2 = getMViewBinding();
                if (mViewBinding2 != null) {
                    relativeLayout.setVisibility(8);
                }
            }
        }
        C28419d mViewBinding5 = getMViewBinding();
        if (mViewBinding5 == null || (editText = mViewBinding5.f87161b) == null) {
            return;
        }
        KeyboardUtils.m27135i(editText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:51:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ca  */
    public final void searchJob() {
        SearchViewModel searchViewModel;
        TextView textView;
        ProgressBar progressBar;
        if (TextUtils.isEmpty(this.mKeyword)) {
            if (this.mType == 2) {
                C13806h c13806h = C13806h.f49015a;
                c13806h.m62318e(16);
                c13806h.m62325l(getString(R$string.tips_room));
                return;
            } else {
                C13806h c13806h2 = C13806h.f49015a;
                c13806h2.m62318e(16);
                c13806h2.m62325l(getString(R$string.tips_movie));
                return;
            }
        }
        this.isRefreshing = true;
        SearchManager.f59668f.m77605a().m77601g(this.mKeyword);
        C28419d mViewBinding = getMViewBinding();
        EditText editText = mViewBinding != null ? mViewBinding.f87161b : null;
        Intrinsics.m97799e(editText);
        KeyboardUtils.m27131e(editText);
        if (!C27287m.f83003a.m106330e()) {
            int i11 = this.mType;
            if (i11 != 1) {
                if (i11 == 2) {
                    C18405a c18405a = this.mSearchGroupAdapter;
                    if (c18405a != null) {
                        c18405a.m36171Y0(emptyView());
                    }
                    C18405a c18405a2 = this.mSearchGroupAdapter;
                    if (c18405a2 != null) {
                        c18405a2.mo36210q1(new ArrayList());
                        return;
                    }
                    return;
                }
                if (i11 != 3) {
                    return;
                }
            }
            C18362b c18362b = this.mSearchWorkAdapter;
            if (c18362b != null) {
                c18362b.m36171Y0(emptyView());
            }
            C18362b c18362b2 = this.mSearchWorkAdapter;
            if (c18362b2 != null) {
                c18362b2.mo36210q1(new ArrayList());
                return;
            }
            return;
        }
        C28419d mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (progressBar = mViewBinding2.f87165f) != null) {
            AbstractC26006c.m102058k(progressBar);
        }
        C28419d mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (textView = mViewBinding3.f87169j) != null) {
            AbstractC26006c.m102054g(textView);
        }
        int i12 = this.mType;
        if (i12 == 1) {
            this.page = 1;
            searchViewModel = this.mSearchViewModel;
            if (searchViewModel != null) {
                searchViewModel.m78075D(1, this.perPage, this.mKeyword);
            }
        } else if (i12 == 2) {
            this.page = 1;
            SearchViewModel searchViewModel2 = this.mSearchViewModel;
            if (searchViewModel2 != null) {
                searchViewModel2.m78074C(1, this.perPage, this.mKeyword);
            }
        } else if (i12 == 3) {
            this.page = 1;
            searchViewModel = this.mSearchViewModel;
            if (searchViewModel != null) {
                searchViewModel.m78075D(1, this.perPage, this.mKeyword);
            }
        }
        HashMap map = new HashMap();
        map.put("module_name", "search");
        map.put(MBridgeConstans.KEY_WORD, this.mKeyword);
        map.put(NativeComponentConstants.KEY_COMPONENT_TYPE, String.valueOf(this.mType));
        C14450a.f50860a.m65143f("searchpage", map);
    }

    private final void showCheckDialog() {
        getMCheckTipsDialog().m65437l0(this, "mCheckTipsDialog");
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C28419d getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28419d c28419dM109808c = C28419d.m109808c(inflater);
        Intrinsics.m97801g(c28419dM109808c, "inflate(...)");
        return c28419dM109808c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        setNetListener(new C18390b());
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        return new C24655b("searchpage", false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ProgressBar progressBar;
        C28419d mViewBinding = getMViewBinding();
        if (mViewBinding != null && (progressBar = mViewBinding.f87165f) != null) {
            AbstractC26006c.m102054g(progressBar);
        }
        super.onDestroyView();
    }

    @Override // com.p282tn.lib.widget.dialog.TRDialogListener
    public void onLeftButtonClick(TRDialog dialog) {
        Intrinsics.m97802h(dialog, "dialog");
    }

    @Override // com.p282tn.lib.widget.dialog.TRDialogListener
    public void onRightButtonClick(TRDialog dialog) {
        RelativeLayout relativeLayout;
        Intrinsics.m97802h(dialog, "dialog");
        if (TextUtils.equals(dialog.getTag(), "clear_tips")) {
            SearchManager.f59668f.m77605a().m77602j();
            C28419d mViewBinding = getMViewBinding();
            if (mViewBinding != null && (relativeLayout = mViewBinding.f87166g) != null) {
                relativeLayout.setVisibility(8);
            }
            C18406b c18406b = this.mSearchKeywordAdapter;
            if (c18406b != null) {
                c18406b.mo36210q1(new ArrayList());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        C28419d mViewBinding;
        C28419d mViewBinding2;
        C28419d mViewBinding3;
        RecyclerView recyclerView;
        C18362b c18362b;
        C27941f c27941fM36186h0;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        EditText editText;
        EditText editText2;
        ImageView imageView;
        ProgressBar progressBar;
        AppCompatImageView appCompatImageView;
        EditText editText3;
        EditText editText4;
        TextView textView;
        EditText editText5;
        EditText editText6;
        RecyclerView recyclerView5;
        RecyclerView recyclerView6;
        TextView textView2;
        RecyclerView recyclerView7;
        EditText editText7;
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        int i11 = 1;
        int i12 = arguments != null ? arguments.getInt(NativeComponentConstants.KEY_COMPONENT_TYPE) : 1;
        this.mType = i12;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i13 = 0;
        if (i12 == 1) {
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            final C18362b c18362b2 = new C18362b(contextRequireContext, new ArrayList());
            c18362b2.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.search.fragment.group.j
                @Override // p765s6.InterfaceC27568f
                /* JADX INFO: renamed from: a */
                public final void mo63874a() {
                    SearchUploadGroupFragment.onViewCreated$lambda$5$lambda$2(this.f59781a);
                }
            });
            c18362b2.m36227w1(new InterfaceC27566d() { // from class: com.transsion.search.fragment.group.l
                @Override // p765s6.InterfaceC27566d
                /* JADX INFO: renamed from: a */
                public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view2, int i14) {
                    SearchUploadGroupFragment.onViewCreated$lambda$5$lambda$4(this.f59783a, c18362b2, baseQuickAdapter, view2, i14);
                }
            });
            this.mSearchWorkAdapter = c18362b2;
            mViewBinding = getMViewBinding();
            if (mViewBinding != null && (recyclerView3 = mViewBinding.f87167h) != null) {
                recyclerView3.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            }
            mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (recyclerView2 = mViewBinding2.f87167h) != null) {
                recyclerView2.setAdapter(this.mSearchWorkAdapter);
            }
            mViewBinding3 = getMViewBinding();
            if (mViewBinding3 != null && (recyclerView = mViewBinding3.f87167h) != null) {
                c18362b = this.mSearchWorkAdapter;
                if (c18362b != null) {
                    c27941fM36186h0 = c18362b.m36186h0();
                } else {
                    c27941fM36186h0 = null;
                }
                recyclerView.addOnScrollListener(new C23862a(c27941fM36186h0));
            }
        } else if (i12 == 2) {
            C28419d mViewBinding4 = getMViewBinding();
            if (mViewBinding4 != null && (editText7 = mViewBinding4.f87161b) != null) {
                editText7.setHint(R$string.search_hint_input_group);
            }
            C18405a c18405a = new C18405a(i13, i11, defaultConstructorMarker);
            c18405a.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.search.fragment.group.m
                @Override // p765s6.InterfaceC27568f
                /* JADX INFO: renamed from: a */
                public final void mo63874a() {
                    SearchUploadGroupFragment.onViewCreated$lambda$10$lambda$7(this.f59785a);
                }
            });
            c18405a.m36227w1(new InterfaceC27566d() { // from class: com.transsion.search.fragment.group.n
                @Override // p765s6.InterfaceC27566d
                /* JADX INFO: renamed from: a */
                public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view2, int i14) {
                    SearchUploadGroupFragment.onViewCreated$lambda$10$lambda$9(this.f59786a, baseQuickAdapter, view2, i14);
                }
            });
            this.mSearchGroupAdapter = c18405a;
            C28419d mViewBinding5 = getMViewBinding();
            if (mViewBinding5 != null && (recyclerView7 = mViewBinding5.f87167h) != null) {
                C18405a c18405a2 = this.mSearchGroupAdapter;
                recyclerView7.addOnScrollListener(new C23862a(c18405a2 != null ? c18405a2.m36186h0() : null));
            }
        } else if (i12 == 3) {
            Context contextRequireContext2 = requireContext();
            Intrinsics.m97801g(contextRequireContext2, "requireContext(...)");
            final C18362b c18362b3 = new C18362b(contextRequireContext2, new ArrayList());
            c18362b3.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.search.fragment.group.j
                @Override // p765s6.InterfaceC27568f
                /* JADX INFO: renamed from: a */
                public final void mo63874a() {
                    SearchUploadGroupFragment.onViewCreated$lambda$5$lambda$2(this.f59781a);
                }
            });
            c18362b3.m36227w1(new InterfaceC27566d() { // from class: com.transsion.search.fragment.group.l
                @Override // p765s6.InterfaceC27566d
                /* JADX INFO: renamed from: a */
                public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view2, int i14) {
                    SearchUploadGroupFragment.onViewCreated$lambda$5$lambda$4(this.f59783a, c18362b3, baseQuickAdapter, view2, i14);
                }
            });
            this.mSearchWorkAdapter = c18362b3;
            mViewBinding = getMViewBinding();
            if (mViewBinding != null) {
                recyclerView3.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            }
            mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null) {
                recyclerView2.setAdapter(this.mSearchWorkAdapter);
            }
            mViewBinding3 = getMViewBinding();
            if (mViewBinding3 != null) {
                c18362b = this.mSearchWorkAdapter;
                if (c18362b != null) {
                    c27941fM36186h0 = c18362b.m36186h0();
                } else {
                    c27941fM36186h0 = null;
                }
                recyclerView.addOnScrollListener(new C23862a(c27941fM36186h0));
            }
        }
        C28419d mViewBinding6 = getMViewBinding();
        if (mViewBinding6 != null && (textView2 = mViewBinding6.f87168i) != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search.fragment.group.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f59787a.clearTipsDialog();
                }
            });
        }
        C18406b c18406b = new C18406b(i13, i11, defaultConstructorMarker);
        this.mSearchKeywordAdapter = c18406b;
        c18406b.m36193l(R$id.tv_keyword);
        C18406b c18406b2 = this.mSearchKeywordAdapter;
        if (c18406b2 != null) {
            c18406b2.m36216s1(new InterfaceC27564b() { // from class: com.transsion.search.fragment.group.p
                @Override // p765s6.InterfaceC27564b
                /* JADX INFO: renamed from: a */
                public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view2, int i14) {
                    SearchUploadGroupFragment.onViewCreated$lambda$14(this.f59788a, baseQuickAdapter, view2, i14);
                }
            });
        }
        C28419d mViewBinding7 = getMViewBinding();
        if (mViewBinding7 != null && (recyclerView6 = mViewBinding7.f87167h) != null) {
            recyclerView6.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        }
        C28419d mViewBinding8 = getMViewBinding();
        if (mViewBinding8 != null && (recyclerView5 = mViewBinding8.f87167h) != null) {
            recyclerView5.setAdapter(this.mSearchKeywordAdapter);
        }
        SearchManager.f59668f.m77605a().m77604m(this.mType, new C18394f());
        initViewModel();
        C28419d mViewBinding9 = getMViewBinding();
        if (mViewBinding9 != null && (editText6 = mViewBinding9.f87161b) != null) {
            editText6.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search.fragment.group.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SearchUploadGroupFragment.onViewCreated$lambda$15(this.f59789a, view2);
                }
            });
        }
        C28419d mViewBinding10 = getMViewBinding();
        if (mViewBinding10 != null && (editText5 = mViewBinding10.f87161b) != null) {
            editText5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.transsion.search.fragment.group.r
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z11) {
                    SearchUploadGroupFragment.onViewCreated$lambda$16(this.f59790a, view2, z11);
                }
            });
        }
        C28419d mViewBinding11 = getMViewBinding();
        if (mViewBinding11 != null && (textView = mViewBinding11.f87169j) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search.fragment.group.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f59767a.searchJob();
                }
            });
        }
        C28419d mViewBinding12 = getMViewBinding();
        if (mViewBinding12 != null && (editText4 = mViewBinding12.f87161b) != null) {
            editText4.addTextChangedListener(new C18395g());
        }
        C28419d mViewBinding13 = getMViewBinding();
        if (mViewBinding13 != null && (editText3 = mViewBinding13.f87161b) != null) {
            editText3.setOnEditorActionListener(new C18391c());
        }
        C28419d mViewBinding14 = getMViewBinding();
        if (mViewBinding14 != null && (appCompatImageView = mViewBinding14.f87163d) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search.fragment.group.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f59769a.resetContent(false);
                }
            });
        }
        C28419d mViewBinding15 = getMViewBinding();
        if (mViewBinding15 != null && (progressBar = mViewBinding15.f87165f) != null) {
            AbstractC26006c.m102054g(progressBar);
        }
        getMCheckTipsDialog().m77670s0(new C18392d());
        C28419d mViewBinding16 = getMViewBinding();
        if (mViewBinding16 != null && (imageView = mViewBinding16.f87162c) != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search.fragment.group.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SearchUploadGroupFragment.onViewCreated$lambda$19(this.f59782a, view2);
                }
            });
        }
        C28419d mViewBinding17 = getMViewBinding();
        if (mViewBinding17 != null && (editText2 = mViewBinding17.f87161b) != null) {
            editText2.requestFocus();
        }
        C28419d mViewBinding18 = getMViewBinding();
        if (mViewBinding18 != null && (editText = mViewBinding18.f87161b) != null) {
            KeyboardUtils.m27135i(editText);
        }
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        C28419d mViewBinding19 = getMViewBinding();
        if (mViewBinding19 == null || (recyclerView4 = mViewBinding19.f87167h) == null) {
            return;
        }
        recyclerView4.addOnScrollListener(new C18393e());
    }
}
