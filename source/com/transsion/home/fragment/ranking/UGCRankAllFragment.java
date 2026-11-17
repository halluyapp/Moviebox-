package com.transsion.home.fragment.ranking;

import android.content.Context;
import android.graphics.Color;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.AbstractC13772o;
import com.p282tn.lib.view.NoNetworkBigView;
import com.p282tn.lib.view.StateView;
import com.p282tn.lib.view.TitleLayout;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.p282tn.lib.widget.R$color;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.gslb.Utils;
import com.transsion.home.R$id;
import com.transsion.home.adapter.C14840f;
import com.transsion.home.bean.CategoryType;
import com.transsion.home.bean.UGCRankAllData;
import com.transsion.home.fragment.film.UGCFilmListFragment;
import com.transsion.home.fragment.ranking.UGCRankAllFragment;
import com.transsion.home.viewmodel.UGCRankingViewModel;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.ugcvideodetail.api.bean.UGCCollection;
import com.transsion.ugcvideodetail.api.bean.UGCContent;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
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
import p462hj.C23860f;
import p550kj.C24655b;
import p552kl.C24672d0;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import p747rl.C27300a;
import p765s6.InterfaceC27566d;
import pg.C26866a;
import sh.C27621h;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00109R\u0016\u0010F\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00109R\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010L\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u00103¨\u0006N"}, m97100d2 = {"Lcom/transsion/home/fragment/ranking/UGCRankAllFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lkl/d0;", "<init>", "()V", "Lcom/transsion/moviedetailapi/bean/Cover;", "cover", "", "s0", "(Lcom/transsion/moviedetailapi/bean/Cover;)V", "o0", "t0", "v0", "Landroid/view/View;", "getNoNetworkView", "()Landroid/view/View;", "j0", "", "getPageName", "()Ljava/lang/String;", "Lcom/transsion/home/bean/CategoryType;", "category", "", RequestParameters.POSITION, "u0", "(Lcom/transsion/home/bean/CategoryType;I)V", "Landroid/view/LayoutInflater;", "inflater", "n0", "(Landroid/view/LayoutInflater;)Lkl/d0;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "startLoading", "hideLoading", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Lcom/transsion/home/viewmodel/UGCRankingViewModel;", "a", "Lcom/transsion/home/viewmodel/UGCRankingViewModel;", "viewModel", "Lcom/transsion/home/fragment/film/UGCFilmListFragment;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/home/fragment/film/UGCFilmListFragment;", "listFragment", "", "c", "Z", "hasRenderFirst", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroid/view/View;", "errorView", "e", "Ljava/lang/String;", "tabId", "Lcom/transsion/home/adapter/f;", "f", "Lcom/transsion/home/adapter/f;", "categoryAdapter", "Lrl/a;", "g", "Lrl/a;", "headerMaskManager", "h", "videoType", "i", "fromOptId", "", "j", "J", "firstLoadStartTimeMillis", CampaignEx.JSON_KEY_AD_K, "hasRecordedFirstLoadDuration", "l", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCRankAllFragment extends BaseFragment<C24672d0> {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m */
    public static final int f53064m = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private UGCRankingViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private UGCFilmListFragment listFragment;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean hasRenderFirst;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private View errorView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private C14840f categoryAdapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C27300a headerMaskManager;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private long firstLoadStartTimeMillis;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean hasRecordedFirstLoadDuration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String tabId = "0";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String videoType = "";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String fromOptId = "";

    /* JADX INFO: renamed from: com.transsion.home.fragment.ranking.UGCRankAllFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final UGCRankAllFragment m68087a(String str, String str2, String str3, String str4) {
            Bundle bundle = new Bundle();
            bundle.putString("category", str);
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString("tabId", str2);
            if (str3 == null) {
                str3 = "";
            }
            bundle.putString("videoType", str3);
            if (str4 == null) {
                str4 = "";
            }
            bundle.putString("fromOptId", str4);
            UGCRankAllFragment uGCRankAllFragment = new UGCRankAllFragment();
            uGCRankAllFragment.setArguments(bundle);
            return uGCRankAllFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.ranking.UGCRankAllFragment$b */
    public static final class C15291b implements InterfaceC27288n {
        C15291b() {
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected() {
            InterfaceC27288n.a.m106338a(this);
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
            View view;
            C24672d0 mViewBinding;
            RecyclerView recyclerView;
            FrameLayout frameLayout;
            Intrinsics.m97802h(network, "network");
            Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
            if (UGCRankAllFragment.this.isResumed() && (view = UGCRankAllFragment.this.errorView) != null && AbstractC26006c.m102056i(view)) {
                C26866a.a.m104898f(C26866a.f81698a, "UGCRankAllFragment", "noNetWorkListener: network connected, hide error and reload", false, 4, null);
                C24672d0 mViewBinding2 = UGCRankAllFragment.this.getMViewBinding();
                if (mViewBinding2 != null && (frameLayout = mViewBinding2.f75405e) != null) {
                    AbstractC26006c.m102054g(frameLayout);
                }
                if (UGCRankAllFragment.this.hasRenderFirst && (mViewBinding = UGCRankAllFragment.this.getMViewBinding()) != null && (recyclerView = mViewBinding.f75404d) != null) {
                    AbstractC26006c.m102058k(recyclerView);
                }
                UGCRankAllFragment.this.lazyLoadData();
            }
        }

        @Override // p743rh.InterfaceC27288n
        public void onDisconnected() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.ranking.UGCRankAllFragment$c */
    static final class C15292c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f53077a;

        C15292c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f53077a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f53077a;
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
            this.f53077a.invoke(obj);
        }
    }

    private final View getNoNetworkView() {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        final NoNetworkBigView noNetworkBigView = new NoNetworkBigView(contextRequireContext);
        noNetworkBigView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        NoNetworkBigView.showTitle$default(noNetworkBigView, false, null, 2, null);
        noNetworkBigView.retry(new Function0() { // from class: pl.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UGCRankAllFragment.m68075l0(noNetworkBigView, this);
            }
        });
        noNetworkBigView.goToSetting(new Function0() { // from class: pl.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UGCRankAllFragment.m68076m0(this.f81759a);
            }
        });
        AbstractC13772o.m62233a(getPageName());
        return noNetworkBigView;
    }

    private final String getPageName() {
        return "/home/ugc_ranking";
    }

    /* JADX INFO: renamed from: j0 */
    private final View m68073j0() {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        StateView stateView = new StateView(contextRequireContext);
        stateView.showData(3, 1, false, "", "");
        stateView.retry(new Function0() { // from class: pl.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UGCRankAllFragment.m68074k0(this.f81756a);
            }
        });
        return stateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final Unit m68074k0(UGCRankAllFragment uGCRankAllFragment) {
        uGCRankAllFragment.lazyLoadData();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final Unit m68075l0(NoNetworkBigView noNetworkBigView, UGCRankAllFragment uGCRankAllFragment) {
        AbstractC26006c.m102054g(noNetworkBigView);
        uGCRankAllFragment.lazyLoadData();
        AbstractC13772o.m62234b(uGCRankAllFragment.getPageName());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final Unit m68076m0(UGCRankAllFragment uGCRankAllFragment) {
        AbstractC13772o.m62235c(uGCRankAllFragment.getPageName());
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: o0 */
    private final void m68077o0() {
        RecyclerView recyclerView;
        C26866a.a.m104898f(C26866a.f81698a, "UGCRankAllFragment", "initCategoryRecyclerView: start", false, 4, null);
        C24672d0 mViewBinding = getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f75404d) == null) {
            return;
        }
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(null);
        final C14840f c14840f = new C14840f();
        c14840f.m36227w1(new InterfaceC27566d() { // from class: pl.c
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                UGCRankAllFragment.m68078p0(this.f81753a, c14840f, baseQuickAdapter, view, i11);
            }
        });
        this.categoryAdapter = c14840f;
        recyclerView.setAdapter(c14840f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final void m68078p0(UGCRankAllFragment uGCRankAllFragment, C14840f c14840f, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "UGCRankAllFragment", "category clicked: position=" + i11, false, 4, null);
        Object item = adapter.getItem(i11);
        if (item instanceof CategoryType) {
            C14840f c14840f2 = adapter instanceof C14840f ? (C14840f) adapter : null;
            if (i11 == (c14840f2 != null ? c14840f2.getCurrentSelectedPosition() : -1)) {
                C26866a.a.m104898f(aVar, "UGCRankAllFragment", "category clicked same as selected: position=" + i11, false, 4, null);
                uGCRankAllFragment.m68083u0((CategoryType) item, i11);
                return;
            }
            c14840f.m66727E1(i11);
            UGCFilmListFragment uGCFilmListFragment = uGCRankAllFragment.listFragment;
            if (uGCFilmListFragment != null) {
                uGCFilmListFragment.startLoading();
            }
            UGCRankingViewModel uGCRankingViewModel = uGCRankAllFragment.viewModel;
            if (uGCRankingViewModel != null) {
                uGCRankingViewModel.m69107l(((CategoryType) item).getType(), uGCRankAllFragment.tabId);
            }
            uGCRankAllFragment.m68083u0((CategoryType) item, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final Unit m68079q0(UGCRankAllFragment uGCRankAllFragment, UGCRankAllData uGCRankAllData) {
        String url;
        List<UGCContent> items;
        UGCContent uGCContent;
        UGCCollection collection;
        Cover cover;
        List<UGCContent> items2;
        UGCContent uGCContent2;
        UGCCollection collection2;
        List<UGCContent> items3;
        UGCContent uGCContent3;
        UGCVideo video;
        Cover cover2;
        HashMap mapM96844g;
        CategoryType categoryTypeM66725C1;
        String name;
        View view;
        ImageView imageView;
        List<UGCContent> items4;
        UGCContent uGCContent4;
        UGCVideo video2;
        Cover cover3;
        String name2;
        CategoryType categoryTypeM66725C2;
        List<CategoryType> categoryList;
        RecyclerView recyclerView;
        FrameLayout frameLayout;
        List<CategoryType> categoryList2;
        List<UGCContent> items5;
        HashMap mapM96844g2;
        String ops;
        HashMap mapM96844g3;
        if (!uGCRankAllFragment.hasRecordedFirstLoadDuration && uGCRankAllFragment.firstLoadStartTimeMillis > 0 && !uGCRankAllFragment.hasRenderFirst) {
            long jCurrentTimeMillis = System.currentTimeMillis() - uGCRankAllFragment.firstLoadStartTimeMillis;
            C24655b logViewConfig = uGCRankAllFragment.getLogViewConfig();
            if (logViewConfig != null && (mapM96844g3 = logViewConfig.m96844g()) != null) {
                mapM96844g3.put("load_duration", String.valueOf(jCurrentTimeMillis));
            }
            uGCRankAllFragment.hasRecordedFirstLoadDuration = true;
        }
        C24655b logViewConfig2 = uGCRankAllFragment.getLogViewConfig();
        String str = "";
        if (logViewConfig2 != null && (mapM96844g2 = logViewConfig2.m96844g()) != null) {
            if (uGCRankAllData == null || (ops = uGCRankAllData.getOps()) == null) {
                ops = "";
            }
            mapM96844g2.put("ops", ops);
        }
        C26866a.a aVar = C26866a.f81698a;
        Cover cover4 = null;
        Integer numValueOf = (uGCRankAllData == null || (items5 = uGCRankAllData.getItems()) == null) ? null : Integer.valueOf(items5.size());
        C26866a.a.m104898f(aVar, "UGCRankAllFragment", "rankAllLiveData: data received, items size=" + numValueOf + ", hasRenderFirst=" + uGCRankAllFragment.hasRenderFirst, false, 4, null);
        if (uGCRankAllFragment.hasRenderFirst) {
            UGCFilmListFragment uGCFilmListFragment = uGCRankAllFragment.listFragment;
            if (uGCFilmListFragment != null) {
                uGCFilmListFragment.hideLoading();
            }
        } else {
            uGCRankAllFragment.hideLoading();
        }
        if (((uGCRankAllData == null || (categoryList2 = uGCRankAllData.getCategoryList()) == null) ? 0 : categoryList2.size()) <= 0) {
            C26866a.a.m104910z(aVar, "UGCRankAllFragment", "rankAllLiveData: no items, show error", false, 4, null);
            uGCRankAllFragment.m68084v0();
            return Unit.f75682a;
        }
        C24672d0 mViewBinding = uGCRankAllFragment.getMViewBinding();
        if (mViewBinding != null && (frameLayout = mViewBinding.f75405e) != null) {
            AbstractC26006c.m102054g(frameLayout);
        }
        C24672d0 mViewBinding2 = uGCRankAllFragment.getMViewBinding();
        if (mViewBinding2 != null && (recyclerView = mViewBinding2.f75404d) != null) {
            AbstractC26006c.m102058k(recyclerView);
        }
        if (!uGCRankAllFragment.hasRenderFirst) {
            C26866a.a.m104898f(aVar, "UGCRankAllFragment", "rankAllLiveData: first render, setup category list", false, 4, null);
            C14840f c14840f = uGCRankAllFragment.categoryAdapter;
            if (c14840f != null) {
                c14840f.mo36201n1(uGCRankAllData != null ? uGCRankAllData.getCategoryList() : null);
            }
            if (uGCRankAllData != null && (categoryList = uGCRankAllData.getCategoryList()) != null) {
                int i11 = 0;
                for (Object obj : categoryList) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.m97515u();
                    }
                    CategoryType categoryType = (CategoryType) obj;
                    if (Intrinsics.m97797c(categoryType.getType(), uGCRankAllData.getCurrentCategoryType())) {
                        C14840f c14840f2 = uGCRankAllFragment.categoryAdapter;
                        if (c14840f2 != null) {
                            c14840f2.m66727E1(i11);
                        }
                        C26866a.a.m104898f(C26866a.f81698a, "UGCRankAllFragment", "rankAllLiveData: set initial selected position=" + i11 + ", category=" + categoryType.getType(), false, 4, null);
                    }
                    i11 = i12;
                }
            }
            uGCRankAllFragment.hasRenderFirst = true;
        }
        UGCFilmListFragment uGCFilmListFragment2 = uGCRankAllFragment.listFragment;
        if (uGCFilmListFragment2 != null) {
            C14840f c14840f3 = uGCRankAllFragment.categoryAdapter;
            if (c14840f3 == null || (categoryTypeM66725C2 = c14840f3.m66725C1()) == null || (name2 = categoryTypeM66725C2.getName()) == null) {
                name2 = "";
            }
            uGCFilmListFragment2.m67648L0(uGCRankAllData, name2);
        }
        if (uGCRankAllData == null || (items4 = uGCRankAllData.getItems()) == null || (uGCContent4 = (UGCContent) CollectionsKt.m97361k0(items4)) == null || (video2 = uGCContent4.getVideo()) == null || (cover3 = video2.getCover()) == null || (url = cover3.getUrl()) == null) {
            url = (uGCRankAllData == null || (items = uGCRankAllData.getItems()) == null || (uGCContent = (UGCContent) CollectionsKt.m97361k0(items)) == null || (collection = uGCContent.getCollection()) == null || (cover = collection.getCover()) == null) ? null : cover.getUrl();
            if (url == null) {
                url = "";
            }
        }
        if (url.length() == 0) {
            C24672d0 mViewBinding3 = uGCRankAllFragment.getMViewBinding();
            if (mViewBinding3 != null && (imageView = mViewBinding3.f75407g) != null) {
                imageView.setBackgroundColor(uGCRankAllFragment.getResources().getColor(R$color.gray_dark_10));
            }
            C24672d0 mViewBinding4 = uGCRankAllFragment.getMViewBinding();
            if (mViewBinding4 != null && (view = mViewBinding4.f75402b) != null) {
                view.setBackgroundColor(uGCRankAllFragment.getResources().getColor(R$color.gray_dark_10));
            }
        } else {
            if (uGCRankAllData != null && (items3 = uGCRankAllData.getItems()) != null && (uGCContent3 = (UGCContent) CollectionsKt.m97361k0(items3)) != null && (video = uGCContent3.getVideo()) != null && (cover2 = video.getCover()) != null) {
                cover4 = cover2;
            } else if (uGCRankAllData != null && (items2 = uGCRankAllData.getItems()) != null && (uGCContent2 = (UGCContent) CollectionsKt.m97361k0(items2)) != null && (collection2 = uGCContent2.getCollection()) != null) {
                cover4 = collection2.getCover();
            }
            uGCRankAllFragment.m68081s0(cover4);
        }
        UGCFilmListFragment uGCFilmListFragment3 = uGCRankAllFragment.listFragment;
        if (uGCFilmListFragment3 != null) {
            uGCRankAllFragment.getChildFragmentManager().m14557p().mo14681y(uGCFilmListFragment3).mo14673l();
        }
        C24655b logViewConfig3 = uGCRankAllFragment.getLogViewConfig();
        if (logViewConfig3 != null) {
            logViewConfig3.m96848k(true);
        }
        C24655b logViewConfig4 = uGCRankAllFragment.getLogViewConfig();
        if (logViewConfig4 != null && (mapM96844g = logViewConfig4.m96844g()) != null) {
            C14840f c14840f4 = uGCRankAllFragment.categoryAdapter;
            if (c14840f4 != null && (categoryTypeM66725C1 = c14840f4.m66725C1()) != null && (name = categoryTypeM66725C1.getName()) != null) {
                str = name;
            }
            mapM96844g.put("rank_category", str);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final void m68080r0(UGCRankAllFragment uGCRankAllFragment, View view) {
        FragmentActivity activity = uGCRankAllFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: s0 */
    private final void m68081s0(Cover cover) {
        String averageHueDark;
        Object objM112707constructorimpl;
        ImageView imageView;
        String url;
        String thumbnail;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        C24672d0 mViewBinding = getMViewBinding();
        String str = "";
        if (mViewBinding != null && (imageView = mViewBinding.f75407g) != null) {
            C23860f.b bVarM94457m = C23860f.f72909a.m94457m(activity);
            if (cover == null || (url = cover.getUrl()) == null) {
                url = "";
            }
            C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
            if (cover == null || (thumbnail = cover.getThumbnail()) == null) {
                thumbnail = "";
            }
            bVarM94468g.m94473l(thumbnail).m94465d(imageView);
        }
        if (cover == null || (averageHueDark = cover.getAverageHueDark()) == null) {
            return;
        }
        Unit unit = null;
        if (StringsKt.m98132c0(averageHueDark, Utils.SEPARATOR, false, 2, null)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                String averageHueDark2 = cover.getAverageHueDark();
                if (averageHueDark2 != null) {
                    str = averageHueDark2;
                }
                int color = Color.parseColor(str);
                C27300a c27300a = this.headerMaskManager;
                if (c27300a != null) {
                    c27300a.m106380a(Integer.valueOf(color));
                    unit = Unit.f75682a;
                }
                objM112707constructorimpl = Result.m112707constructorimpl(unit);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null) {
                C26866a.a.m104901l(C26866a.f81698a, "UGCRankAllFragment", "initRecyclerView: parseColor failed, use default color", false, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    private final void m68082t0() {
        setNetListener(new C15291b());
    }

    /* JADX INFO: renamed from: u0 */
    private final void m68083u0(CategoryType category, int position) {
        String name;
        C3187b0 c3187b0M69106k;
        UGCRankAllData uGCRankAllData;
        List<UGCContent> items;
        UGCContent uGCContent;
        UGCVideo video;
        String ops;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("module_name", "rec_list");
        String str = "";
        if (category == null || (name = category.getName()) == null) {
            name = "";
        }
        linkedHashMap.put("rank_category", name);
        linkedHashMap.put("belong_to_collection_id", "");
        linkedHashMap.put("refer_subject_id", "");
        UGCRankingViewModel uGCRankingViewModel = this.viewModel;
        if (uGCRankingViewModel != null && (c3187b0M69106k = uGCRankingViewModel.m69106k()) != null && (uGCRankAllData = (UGCRankAllData) c3187b0M69106k.m14847f()) != null && (items = uGCRankAllData.getItems()) != null && (uGCContent = (UGCContent) CollectionsKt.m97361k0(items)) != null && (video = uGCContent.getVideo()) != null && (ops = video.getOps()) != null) {
            str = ops;
        }
        linkedHashMap.put("ops", str);
        C14450a.f50860a.m65143f(getPageName(), linkedHashMap);
    }

    /* JADX INFO: renamed from: v0 */
    private final void m68084v0() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: pl.d
            @Override // java.lang.Runnable
            public final void run() {
                UGCRankAllFragment.m68085w0(this.f81755a);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m68085w0(UGCRankAllFragment uGCRankAllFragment) {
        C24672d0 mViewBinding;
        RecyclerView recyclerView;
        FrameLayout frameLayout;
        if (uGCRankAllFragment.isDetached() || !uGCRankAllFragment.isAdded() || uGCRankAllFragment.getContext() == null) {
            return;
        }
        View viewM68073j0 = C27287m.f83003a.m106330e() ? uGCRankAllFragment.m68073j0() : uGCRankAllFragment.getNoNetworkView();
        C26866a.a.m104898f(C26866a.f81698a, "UGCRankAllFragment", "showError: show error in outer container, hasRenderFirst=" + uGCRankAllFragment.hasRenderFirst, false, 4, null);
        C24672d0 mViewBinding2 = uGCRankAllFragment.getMViewBinding();
        if (mViewBinding2 != null && (frameLayout = mViewBinding2.f75405e) != null) {
            frameLayout.removeAllViews();
            frameLayout.addView(viewM68073j0);
            frameLayout.setVisibility(0);
        }
        if (uGCRankAllFragment.hasRenderFirst && (mViewBinding = uGCRankAllFragment.getMViewBinding()) != null && (recyclerView = mViewBinding.f75404d) != null) {
            AbstractC26006c.m102054g(recyclerView);
        }
        UGCFilmListFragment uGCFilmListFragment = uGCRankAllFragment.listFragment;
        if (uGCFilmListFragment != null) {
            uGCRankAllFragment.getChildFragmentManager().m14557p().mo14676p(uGCFilmListFragment).mo14673l();
        }
        uGCRankAllFragment.errorView = viewM68073j0;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void hideLoading() {
        ConstraintLayout constraintLayout;
        C24672d0 mViewBinding = getMViewBinding();
        if (mViewBinding == null || (constraintLayout = mViewBinding.f75408h) == null) {
            return;
        }
        AbstractC26006c.m102055h(constraintLayout);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        String string;
        C3187b0 c3187b0M69106k;
        C3187b0 c3187b0M69106k2;
        String string2;
        TitleLayout titleLayout;
        Intrinsics.m97802h(view, "view");
        C24672d0 mViewBinding = getMViewBinding();
        if (mViewBinding != null && (titleLayout = mViewBinding.f75409i) != null) {
            titleLayout.setLeftOnclick(new View.OnClickListener() { // from class: pl.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    UGCRankAllFragment.m68080r0(this.f81751a, view2);
                }
            });
            C27621h c27621h = C27621h.f84745a;
            Context context = titleLayout.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            titleLayout.setPadding(0, c27621h.m107454d(context), 0, 0);
        }
        C24672d0 mViewBinding2 = getMViewBinding();
        ImageView imageView = mViewBinding2 != null ? mViewBinding2.f75407g : null;
        C24672d0 mViewBinding3 = getMViewBinding();
        this.headerMaskManager = new C27300a(imageView, mViewBinding3 != null ? mViewBinding3.f75402b : null);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("videoType", "")) == null) {
            string = "";
        }
        this.videoType = string;
        Bundle arguments2 = getArguments();
        String str = (arguments2 == null || (string2 = arguments2.getString("fromOptId", "")) == null) ? "" : string2;
        this.fromOptId = str;
        UGCFilmListFragment uGCFilmListFragmentM67651a = UGCFilmListFragment.INSTANCE.m67651a(this.tabId, "", "", true, this.videoType, str);
        this.listFragment = uGCFilmListFragmentM67651a;
        if (uGCFilmListFragmentM67651a != null) {
            getChildFragmentManager().m14557p().m14806c(R$id.ranking_list_container, uGCFilmListFragmentM67651a, "ranking_list_fragment").mo14673l();
        }
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "UGCRankAllFragment", "initView: listFragment dynamically added to container", false, 4, null);
        UGCRankingViewModel uGCRankingViewModel = this.viewModel;
        if (uGCRankingViewModel != null) {
            UGCFilmListFragment uGCFilmListFragment = this.listFragment;
            if (uGCFilmListFragment != null) {
                uGCFilmListFragment.m67647H0(uGCRankingViewModel);
            }
            C26866a.a.m104898f(aVar, "UGCRankAllFragment", "initView: setupRankingViewModel completed", false, 4, null);
        }
        UGCRankingViewModel uGCRankingViewModel2 = this.viewModel;
        if (uGCRankingViewModel2 != null && (c3187b0M69106k2 = uGCRankingViewModel2.m69106k()) != null) {
            c3187b0M69106k2.m14857p(this);
        }
        UGCRankingViewModel uGCRankingViewModel3 = this.viewModel;
        if (uGCRankingViewModel3 != null && (c3187b0M69106k = uGCRankingViewModel3.m69106k()) != null) {
            c3187b0M69106k.m14851j(this, new C15292c(new Function1() { // from class: pl.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UGCRankAllFragment.m68079q0(this.f81752a, (UGCRankAllData) obj);
                }
            }));
        }
        m68082t0();
        m68077o0();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        String string;
        if (this.hasRenderFirst) {
            UGCFilmListFragment uGCFilmListFragment = this.listFragment;
            if (uGCFilmListFragment != null) {
                uGCFilmListFragment.startLoading();
            }
        } else {
            startLoading();
        }
        Bundle arguments = getArguments();
        String str = "0";
        if (arguments != null && (string = arguments.getString("tabId", "0")) != null) {
            str = string;
        }
        this.tabId = str;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("category") : null;
        C26866a.a.m104898f(C26866a.f81698a, "UGCRankAllFragment", "lazyLoadData: start loading, category=" + string2 + ", tabId=" + this.tabId, false, 4, null);
        if (!this.hasRecordedFirstLoadDuration && this.firstLoadStartTimeMillis == 0) {
            this.firstLoadStartTimeMillis = System.currentTimeMillis();
        }
        UGCRankingViewModel uGCRankingViewModel = this.viewModel;
        if (uGCRankingViewModel != null) {
            uGCRankingViewModel.m69107l(string2, this.tabId);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public C24672d0 getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.viewModel = (UGCRankingViewModel) new C3227v0(activity).m14969a(UGCRankingViewModel.class);
        }
        C24672d0 c24672d0M96918c = C24672d0.m96918c(inflater);
        Intrinsics.m97801g(c24672d0M96918c, "inflate(...)");
        return c24672d0M96918c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        return new C24655b(getPageName(), false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void startLoading() {
        FrameLayout frameLayout;
        ConstraintLayout constraintLayout;
        C24672d0 mViewBinding = getMViewBinding();
        if (mViewBinding != null && (constraintLayout = mViewBinding.f75408h) != null) {
            AbstractC26006c.m102058k(constraintLayout);
        }
        C24672d0 mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (frameLayout = mViewBinding2.f75405e) == null) {
            return;
        }
        AbstractC26006c.m102054g(frameLayout);
    }
}
