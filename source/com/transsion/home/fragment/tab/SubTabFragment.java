package com.transsion.home.fragment.tab;

import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.InterfaceC0248a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.AbstractC2397b;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ck.C5110g;
import ck.C5118o;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.view.AbstractC13772o;
import com.p282tn.lib.view.NoNetworkBigView;
import com.p282tn.lib.view.StateView;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$string;
import com.transsion.baseui.util.AbstractC14556b;
import com.transsion.home.activity.OperateActivity;
import com.transsion.home.adapter.suboperate.SubTabAdapter;
import com.transsion.home.adapter.trending.provider.C15034e;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.bean.SubOperateData;
import com.transsion.home.bean.TrendingRespData;
import com.transsion.home.bean.TrendingRespItem;
import com.transsion.home.fragment.bottom.BottomOpFragment;
import com.transsion.home.fragment.home.HomeFragment;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.home.preload.InterfaceC15427a;
import com.transsion.home.preload.InterfaceC15428b;
import com.transsion.home.viewmodel.HomePreferencesViewModel;
import com.transsion.home.viewmodel.SubTabViewModel;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import mg.C25831h;
import ng.AbstractC26006c;
import p393f.C23282h;
import p550kj.C24655b;
import p552kl.C24690m0;
import p552kl.C24703y;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p842vl.AbstractC28126h;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\b\u0007*\u0001h\b\u0007\u0018\u0000 l2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001mB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\u0004J!\u0010%\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b%\u0010#J\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010)\u001a\u00020\u0005H\u0016¢\u0006\u0004\b)\u0010\u0004J\u000f\u0010*\u001a\u00020\u0005H\u0016¢\u0006\u0004\b*\u0010\u0004J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\r\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020.H\u0016¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u00020\u0005H\u0016¢\u0006\u0004\b2\u0010\u0004J\u0011\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b4\u00105J\u001f\u00109\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u00072\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010H\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010O\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR$\u0010S\u001a\u0010\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u0005\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR$\u0010X\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0U\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010KR\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010a\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010KR\u0016\u0010e\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010KR,\u0010g\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u00050P\u0012\u0004\u0012\u00020\u00050P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010RR\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010j¨\u0006n"}, m97100d2 = {"Lcom/transsion/home/fragment/tab/SubTabFragment;", "Lcom/transsion/home/fragment/tab/BaseHomeSubFragment;", "Lkl/y;", "<init>", "()V", "", "m0", "", "W0", "()I", "p1", "h1", "S0", "", "alpha", "u1", "(F)V", "V0", "()F", "n1", "v1", "Landroid/view/View;", "getNoNetworkView", "()Landroid/view/View;", "T0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "a1", "(Landroid/view/LayoutInflater;)Lkl/y;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "p0", "initData", "onResume", "onDestroyView", "startLoading", "hideLoading", "lazyLoadData", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "", "getPageName", "()Ljava/lang/String;", "g0", "c0", "Landroidx/recyclerview/widget/RecyclerView;", "f0", "()Landroidx/recyclerview/widget/RecyclerView;", "lastAdPosition", "Lcom/transsion/ad/bidding/nativead/BiddingNativeManager;", "wrapperNativeManager", "l0", "(ILcom/transsion/ad/bidding/nativead/BiddingNativeManager;)V", "Lcom/transsion/home/viewmodel/SubTabViewModel;", "g", "Lcom/transsion/home/viewmodel/SubTabViewModel;", "mViewModel", "Lcom/transsion/home/adapter/suboperate/SubTabAdapter;", "h", "Lcom/transsion/home/adapter/suboperate/SubTabAdapter;", "mMainAdapter", "Lcom/transsion/home/viewmodel/HomePreferencesViewModel;", "i", "Lkotlin/Lazy;", "X0", "()Lcom/transsion/home/viewmodel/HomePreferencesViewModel;", "homePreferencesViewModel", "", "j", "Z", "mHasTranslateWindow", CampaignEx.JSON_KEY_AD_K, "I", "mHeaderBgHeight", "Lkotlin/Function1;", "l", "Lkotlin/jvm/functions/Function1;", "mPermissionCallback", "Landroidx/activity/result/b;", "", "m", "Landroidx/activity/result/b;", "mLauncher", "n", "mIsFirstRender", "", "o", "J", "loadStartTime", TtmlNode.TAG_P, "Landroid/view/View;", "mNoNetworkView", CampaignEx.JSON_KEY_AD_Q, "isUGCMode", CampaignEx.JSON_KEY_AD_R, "isViewInitialized", "s", "mOnAppointmentClick", "com/transsion/home/fragment/tab/SubTabFragment$d", "t", "Lcom/transsion/home/fragment/tab/SubTabFragment$d;", "mRecycleScrollListener", TmcStartParams.KEY_URL_SHORT, "a", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SubTabFragment extends BaseHomeSubFragment<C24703y> {

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: v */
    public static final int f53133v = 8;

    /* JADX INFO: renamed from: w */
    private static final Map f53134w;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private SubTabViewModel mViewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private SubTabAdapter mMainAdapter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean mHasTranslateWindow;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int mHeaderBgHeight;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private Function1 mPermissionCallback;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private AbstractC0249b mLauncher;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private View mNoNetworkView;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean isViewInitialized;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Lazy homePreferencesViewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.fragment.tab.n0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SubTabFragment.m68249b1(this.f53290a);
        }
    });

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean mIsFirstRender = true;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private long loadStartTime = -1;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final boolean isUGCMode = C5110g.f17601a.m23911b();

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final Function1 mOnAppointmentClick = new Function1() { // from class: com.transsion.home.fragment.tab.o0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return SubTabFragment.m68263o1(this.f53293a, (Function1) obj);
        }
    };

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final C15312d mRecycleScrollListener = new C15312d();

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.SubTabFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m68282a(int i11) {
            String str = (String) SubTabFragment.f53134w.get(Integer.valueOf(i11));
            return str == null ? "home_sub_operate" : str;
        }

        /* JADX INFO: renamed from: b */
        public final SubTabFragment m68283b(int i11, String str) {
            if (!SubTabFragment.f53134w.containsKey(Integer.valueOf(i11)) && str != null) {
                SubTabFragment.f53134w.put(Integer.valueOf(i11), str);
            }
            Bundle bundle = new Bundle();
            bundle.putInt("tab_id", i11);
            bundle.putString(WebConstants.TAB_CODE, str);
            SubTabFragment subTabFragment = new SubTabFragment();
            subTabFragment.setArguments(bundle);
            return subTabFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.SubTabFragment$b */
    public static final class C15310b extends DiffUtil.AbstractC4174e {
        C15310b() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(OperateItem oldItem, OperateItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            Subject feedsSubject = oldItem.getFeedsSubject();
            String subjectId = feedsSubject != null ? feedsSubject.getSubjectId() : null;
            Subject feedsSubject2 = newItem.getFeedsSubject();
            return Intrinsics.m97797c(subjectId, feedsSubject2 != null ? feedsSubject2.getSubjectId() : null);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(OperateItem oldItem, OperateItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            Subject feedsSubject = oldItem.getFeedsSubject();
            Integer subjectType = feedsSubject != null ? feedsSubject.getSubjectType() : null;
            Subject feedsSubject2 = newItem.getFeedsSubject();
            return Intrinsics.m97797c(subjectType, feedsSubject2 != null ? feedsSubject2.getSubjectType() : null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.SubTabFragment$c */
    public static final class C15311c extends GridLayoutManager.AbstractC4187c {

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f53150f;

        C15311c(int i11) {
            this.f53150f = i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC4187c
        /* JADX INFO: renamed from: f */
        public int mo20742f(int i11) {
            SubTabAdapter subTabAdapter = SubTabFragment.this.mMainAdapter;
            Integer numValueOf = subTabAdapter != null ? Integer.valueOf(subTabAdapter.getItemViewType(i11)) : null;
            int iOrdinal = PostItemType.PREFERENCES.ordinal();
            if (numValueOf != null && numValueOf.intValue() == iOrdinal) {
                return this.f53150f;
            }
            int iOrdinal2 = PostItemType.SUBJECT.ordinal();
            if (numValueOf == null || numValueOf.intValue() != iOrdinal2) {
                int iOrdinal3 = PostItemType.SINGLE_SUBJECT.ordinal();
                if (numValueOf == null || numValueOf.intValue() != iOrdinal3) {
                    int iOrdinal4 = PostItemType.TRENDING_FEES_GRID.ordinal();
                    if (numValueOf == null || numValueOf.intValue() != iOrdinal4) {
                        return this.f53150f;
                    }
                }
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.SubTabFragment$d */
    public static final class C15312d extends RecyclerView.AbstractC4219r {
        C15312d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            if (SubTabFragment.this.mHasTranslateWindow) {
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                SubTabFragment subTabFragment = SubTabFragment.this;
                subTabFragment.m68273u1(RangesKt.m97937g((iComputeVerticalScrollOffset * 1.0f) / subTabFragment.mHeaderBgHeight, 1.0f));
                if (!SubTabFragment.this.getMIsWhite() && SubTabFragment.this.m68244V0() < 0.7f) {
                    SubTabFragment.this.m68100b0(true);
                } else {
                    if (!SubTabFragment.this.getMIsWhite() || SubTabFragment.this.m68244V0() < 0.7f) {
                        return;
                    }
                    SubTabFragment.this.m68100b0(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.SubTabFragment$e */
    public static final class C15313e implements InterfaceC27288n {
        C15313e() {
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected() {
            InterfaceC27288n.a.m106338a(this);
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
            SubTabAdapter subTabAdapter;
            List<Object> data;
            Intrinsics.m97802h(network, "network");
            Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
            if (SubTabFragment.this.isResumed() && (subTabAdapter = SubTabFragment.this.mMainAdapter) != null && (data = subTabAdapter.getData()) != null && data.isEmpty()) {
                SubTabFragment.this.m68262n1();
            }
        }

        @Override // p743rh.InterfaceC27288n
        public void onDisconnected() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.SubTabFragment$f */
    static final class C15314f implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f53153a;

        C15314f(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f53153a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f53153a;
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
            this.f53153a.invoke(obj);
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Integer.valueOf(HomeTabId.Trending.getValue()), "Trending");
        linkedHashMap.put(Integer.valueOf(HomeTabId.UGC_Trending.getValue()), "UgcTrending");
        f53134w = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S0 */
    private final void m68241S0() {
        SwipeRefreshLayout swipeRefreshLayout;
        RecyclerView recyclerView;
        SwipeRefreshLayout swipeRefreshLayout2;
        Guideline guideline;
        View view;
        SwipeRefreshLayout swipeRefreshLayout3;
        RecyclerView recyclerView2;
        SwipeRefreshLayout swipeRefreshLayout4;
        Guideline guideline2;
        Guideline guideline3;
        C24703y c24703y = (C24703y) getMViewBinding();
        ViewGroup.LayoutParams layoutParams = (c24703y == null || (guideline3 = c24703y.f75596d) == null) ? null : guideline3.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
        if (this.mHasTranslateWindow) {
            c2308b.f7952a = 0;
            C24703y c24703y2 = (C24703y) getMViewBinding();
            if (c24703y2 != null && (guideline2 = c24703y2.f75596d) != null) {
                guideline2.setLayoutParams(c2308b);
            }
            C24703y c24703y3 = (C24703y) getMViewBinding();
            if (c24703y3 != null && (swipeRefreshLayout4 = c24703y3.f75598f) != null) {
                swipeRefreshLayout4.invalidate();
            }
            m68273u1(0.0f);
            m68100b0(true);
            C24703y c24703y4 = (C24703y) getMViewBinding();
            if (c24703y4 != null && (recyclerView2 = c24703y4.f75597e) != null) {
                recyclerView2.addOnScrollListener(this.mRecycleScrollListener);
            }
            C24703y c24703y5 = (C24703y) getMViewBinding();
            if (c24703y5 == null || (swipeRefreshLayout3 = c24703y5.f75598f) == null) {
                return;
            }
            int i11 = this.mHeaderBgHeight;
            swipeRefreshLayout3.setProgressViewOffset(false, i11, AbstractC5776a0.m27313a(50.0f) + i11);
            return;
        }
        C24703y c24703y6 = (C24703y) getMViewBinding();
        int height = (c24703y6 == null || (view = c24703y6.f75594b) == null) ? 0 : view.getHeight();
        if (height <= 0) {
            height = this.mHeaderBgHeight;
        }
        c2308b.f7952a = height;
        C24703y c24703y7 = (C24703y) getMViewBinding();
        if (c24703y7 != null && (guideline = c24703y7.f75596d) != null) {
            guideline.setLayoutParams(c2308b);
        }
        C24703y c24703y8 = (C24703y) getMViewBinding();
        if (c24703y8 != null && (swipeRefreshLayout2 = c24703y8.f75598f) != null) {
            swipeRefreshLayout2.invalidate();
        }
        m68273u1(1.0f);
        m68100b0(false);
        C24703y c24703y9 = (C24703y) getMViewBinding();
        if (c24703y9 != null && (recyclerView = c24703y9.f75597e) != null) {
            recyclerView.removeOnScrollListener(this.mRecycleScrollListener);
        }
        C24703y c24703y10 = (C24703y) getMViewBinding();
        if (c24703y10 == null || (swipeRefreshLayout = c24703y10.f75598f) == null) {
            return;
        }
        swipeRefreshLayout.setProgressViewOffset(false, 0, AbstractC5776a0.m27313a(50.0f));
    }

    /* JADX INFO: renamed from: T0 */
    private final View m68242T0() {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        StateView stateView = new StateView(contextRequireContext);
        stateView.showData(3, 1, false, "", "");
        stateView.retry(new Function0() { // from class: com.transsion.home.fragment.tab.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubTabFragment.m68243U0(this.f53251a);
            }
        });
        return stateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final Unit m68243U0(SubTabFragment subTabFragment) {
        subTabFragment.m68262n1();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V0 */
    public final float m68244V0() {
        View view;
        C24703y c24703y = (C24703y) getMViewBinding();
        if (c24703y == null || (view = c24703y.f75594b) == null) {
            return 0.0f;
        }
        return view.getAlpha();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W0 */
    private final int m68245W0() {
        View view;
        View view2;
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof HomeFragment) {
            return m68103h0();
        }
        if (parentFragment instanceof BottomOpFragment) {
            Fragment parentFragment2 = getParentFragment();
            Intrinsics.m97800f(parentFragment2, "null cannot be cast to non-null type com.transsion.home.fragment.bottom.BottomOpFragment");
            return ((BottomOpFragment) parentFragment2).m67550c0();
        }
        if (!(getActivity() instanceof OperateActivity)) {
            C24703y c24703y = (C24703y) getMViewBinding();
            if (c24703y != null && (view = c24703y.f75594b) != null) {
                AbstractC26006c.m102055h(view);
            }
            return 1;
        }
        int color = AbstractC2397b.getColor(requireContext(), R$color.bg_02);
        C24703y c24703y2 = (C24703y) getMViewBinding();
        if (c24703y2 != null && (view2 = c24703y2.f75594b) != null) {
            view2.setBackgroundColor(color);
        }
        FragmentActivity activity = getActivity();
        Intrinsics.m97800f(activity, "null cannot be cast to non-null type com.transsion.home.activity.OperateActivity");
        return ((OperateActivity) activity).m66687b0();
    }

    /* JADX INFO: renamed from: X0 */
    private final HomePreferencesViewModel m68246X0() {
        return (HomePreferencesViewModel) this.homePreferencesViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final Unit m68247Y0(NoNetworkBigView noNetworkBigView, SubTabFragment subTabFragment) {
        AbstractC26006c.m102054g(noNetworkBigView);
        subTabFragment.m68262n1();
        AbstractC13772o.m62234b(subTabFragment.getPageName());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final Unit m68248Z0(SubTabFragment subTabFragment) {
        AbstractC13772o.m62235c(subTabFragment.getPageName());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final HomePreferencesViewModel m68249b1(SubTabFragment subTabFragment) {
        Fragment fragmentRequireParentFragment = subTabFragment.requireParentFragment();
        Intrinsics.m97801g(fragmentRequireParentFragment, "requireParentFragment(...)");
        return (HomePreferencesViewModel) new C3227v0(fragmentRequireParentFragment).m14969a(HomePreferencesViewModel.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c1 */
    public static final Unit m68250c1(SubTabFragment subTabFragment, SubOperateData subOperateData) {
        List arrayList;
        List<OperateItem> items;
        C27941f c27941fM36186h0;
        SwipeRefreshLayout swipeRefreshLayout;
        C24703y c24703y = (C24703y) subTabFragment.getMViewBinding();
        if (c24703y != null && (swipeRefreshLayout = c24703y.f75598f) != null) {
            swipeRefreshLayout.setEnabled(true);
        }
        SubTabAdapter subTabAdapter = subTabFragment.mMainAdapter;
        if (subTabAdapter != null && (c27941fM36186h0 = subTabAdapter.m36186h0()) != null) {
            c27941fM36186h0.m108673z(true);
        }
        if (subOperateData == null || (items = subOperateData.getItems()) == null || (arrayList = CollectionsKt.m97343U0(items)) == null) {
            arrayList = new ArrayList();
        }
        AbstractC28126h.m109236c(arrayList, subOperateData != null ? subOperateData.getOps() : null);
        HomePreferencesUiHelperKt.m68116f(subTabFragment.getMTabCode(), subTabFragment.m68246X0(), arrayList);
        SubTabAdapter subTabAdapter2 = subTabFragment.mMainAdapter;
        if (subTabAdapter2 != null) {
            subTabAdapter2.mo36201n1(arrayList);
        }
        String value = PostItemType.BANNER.getValue();
        OperateItem operateItem = (OperateItem) CollectionsKt.m97362l0(arrayList, 0);
        subTabFragment.mHasTranslateWindow = Intrinsics.m97797c(value, operateItem != null ? operateItem.getType() : null);
        if (subTabFragment.mIsFirstRender) {
            subTabFragment.m68241S0();
            subTabFragment.mIsFirstRender = false;
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final Unit m68251d1(SubTabFragment subTabFragment, Function1 function1, SubOperateData subOperateData) {
        HashMap mapM96844g;
        List<OperateItem> items;
        subTabFragment.hideLoading();
        boolean z11 = false;
        if (((subOperateData == null || (items = subOperateData.getItems()) == null) ? 0 : items.size()) <= 0) {
            subTabFragment.m68275v1();
            return Unit.f75682a;
        }
        C24655b logViewConfig = subTabFragment.getLogViewConfig();
        if (logViewConfig != null && !logViewConfig.m96846i()) {
            z11 = true;
        }
        if (z11) {
            C24655b logViewConfig2 = subTabFragment.getLogViewConfig();
            if (logViewConfig2 != null) {
                logViewConfig2.m96848k(true);
            }
            C24655b logViewConfig3 = subTabFragment.getLogViewConfig();
            if (logViewConfig3 != null && (mapM96844g = logViewConfig3.m96844g()) != null) {
            }
        }
        function1.invoke(subOperateData);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final Unit m68252e1(SubTabFragment subTabFragment, Function1 function1, SubOperateData subOperateData) {
        List<OperateItem> items;
        subTabFragment.hideLoading();
        if (((subOperateData == null || (items = subOperateData.getItems()) == null) ? 0 : items.size()) > 0) {
            subTabFragment.m68106n0();
            function1.invoke(subOperateData);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f1 */
    public static final Unit m68253f1(final SubTabFragment subTabFragment, TrendingRespData trendingRespData) {
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        Pager pager;
        ConstraintLayout constraintLayoutM97027b;
        List<OperateItem> transferData;
        List<TrendingRespItem> items;
        if (((trendingRespData == null || (items = trendingRespData.getItems()) == null) ? 0 : items.size()) > 0) {
            SubTabAdapter subTabAdapter = subTabFragment.mMainAdapter;
            if (subTabAdapter != null) {
                subTabAdapter.mo36208q((trendingRespData == null || (transferData = trendingRespData.getTransferData()) == null) ? new ArrayList<>() : transferData);
            }
            C24703y c24703y = (C24703y) subTabFragment.getMViewBinding();
            if (c24703y != null && (constraintLayoutM97027b = c24703y.getRoot()) != null) {
                constraintLayoutM97027b.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.tab.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SubTabFragment.m68254g1(this.f53234a);
                    }
                }, 300L);
            }
        } else {
            if ((trendingRespData == null || (pager = trendingRespData.getPager()) == null) ? false : Intrinsics.m97797c(pager.getHasMore(), Boolean.FALSE)) {
                SubTabAdapter subTabAdapter2 = subTabFragment.mMainAdapter;
                if (subTabAdapter2 != null && (c27941fM36186h1 = subTabAdapter2.m36186h0()) != null) {
                    C27941f.m108652u(c27941fM36186h1, false, 1, null);
                }
            } else {
                SubTabAdapter subTabAdapter3 = subTabFragment.mMainAdapter;
                if (subTabAdapter3 != null && (c27941fM36186h0 = subTabAdapter3.m36186h0()) != null) {
                    c27941fM36186h0.m108669v();
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final void m68254g1(SubTabFragment subTabFragment) {
        C27941f c27941fM36186h0;
        SubTabAdapter subTabAdapter = subTabFragment.mMainAdapter;
        if (subTabAdapter == null || (c27941fM36186h0 = subTabAdapter.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108667s();
    }

    private final View getNoNetworkView() {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        final NoNetworkBigView noNetworkBigView = new NoNetworkBigView(contextRequireContext);
        noNetworkBigView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        NoNetworkBigView.showTitle$default(noNetworkBigView, false, null, 2, null);
        noNetworkBigView.retry(new Function0() { // from class: com.transsion.home.fragment.tab.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubTabFragment.m68247Y0(noNetworkBigView, this);
            }
        });
        noNetworkBigView.goToSetting(new Function0() { // from class: com.transsion.home.fragment.tab.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubTabFragment.m68248Z0(this.f53266a);
            }
        });
        AbstractC13772o.m62233a(getPageName());
        this.mNoNetworkView = noNetworkBigView;
        Intrinsics.m97799e(noNetworkBigView);
        return noNetworkBigView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: h1 */
    private final void m68255h1() {
        int i11;
        LinearLayoutManager npaLinearLayoutManager;
        RecyclerView recyclerView;
        C15034e c15034eM66897T1;
        RecyclerView recyclerView2;
        FragmentActivity activity;
        Function1 function1 = new Function1() { // from class: com.transsion.home.fragment.tab.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubTabFragment.m68259l1(this.f53295a, ((Integer) obj).intValue());
            }
        };
        FragmentActivity activity2 = getActivity();
        if (activity2 == null || !AbstractC14556b.m65670a(activity2)) {
            i11 = 2;
        } else {
            i11 = AbstractC5806y.m27489e() > AbstractC5806y.m27487c() ? 4 : 3;
        }
        int i12 = i11;
        ArrayList arrayList = new ArrayList();
        Function1 function2 = this.mOnAppointmentClick;
        int iM68102e0 = getMTabId();
        KeyEventDispatcher.Component activity3 = getActivity();
        Intrinsics.m97800f(activity3, "null cannot be cast to non-null type com.transsion.home.preload.MainXMLPreload");
        InterfaceC15428b interfaceC15428bMo66689d = ((InterfaceC15427a) activity3).mo66689d();
        FragmentActivity activity4 = getActivity();
        this.mMainAdapter = new SubTabAdapter(arrayList, function2, this, iM68102e0, interfaceC15428bMo66689d, function1, activity4 != null && AbstractC14556b.m65670a(activity4), i12, this.isUGCMode);
        if (this.isUGCMode || ((activity = getActivity()) != null && AbstractC14556b.m65670a(activity))) {
            NpaGridLayoutManager npaGridLayoutManager = new NpaGridLayoutManager(requireContext(), i12);
            C15311c c15311c = new C15311c(i12);
            c15311c.m20751i(true);
            npaGridLayoutManager.m20740d0(c15311c);
            npaLinearLayoutManager = npaGridLayoutManager;
        } else {
            npaLinearLayoutManager = new NpaLinearLayoutManager(requireContext(), 1, false);
        }
        C24703y c24703y = (C24703y) getMViewBinding();
        if (c24703y != null && (recyclerView2 = c24703y.f75597e) != null) {
            recyclerView2.setAdapter(this.mMainAdapter);
            recyclerView2.setLayoutManager(npaLinearLayoutManager);
            npaLinearLayoutManager.setInitialPrefetchItemCount(6);
            recyclerView2.setItemAnimator(null);
            if (this.isUGCMode) {
                C25831h c25831h = new C25831h(AbstractC5776a0.m27313a(16.0f), i12);
                c25831h.m101484d(AbstractC5776a0.m27313a(8.0f));
                recyclerView2.addItemDecoration(c25831h);
            } else {
                C25831h c25831h2 = new C25831h(AbstractC5776a0.m27313a(12.0f), 1);
                c25831h2.m101484d(AbstractC5776a0.m27313a(6.0f));
                recyclerView2.addItemDecoration(c25831h2);
            }
        }
        SubTabAdapter subTabAdapter = this.mMainAdapter;
        if (subTabAdapter != null && (c15034eM66897T1 = subTabAdapter.getPreferencesProvider()) != null) {
            HomePreferencesViewModel homePreferencesViewModelM68246X0 = m68246X0();
            SubTabAdapter subTabAdapter2 = this.mMainAdapter;
            Intrinsics.m97799e(subTabAdapter2);
            int iM68102e1 = getMTabId();
            String strM68101d0 = getMTabCode();
            if (strM68101d0 == null) {
                strM68101d0 = "";
            }
            HomePreferencesUiHelperKt.m68120j(c15034eM66897T1, homePreferencesViewModelM68246X0, subTabAdapter2, iM68102e1, strM68101d0);
        }
        C24703y c24703y2 = (C24703y) getMViewBinding();
        if (c24703y2 != null && (recyclerView = c24703y2.f75597e) != null) {
            HomePreferencesUiHelperKt.m68118h(this, recyclerView, npaLinearLayoutManager, m68246X0(), new Function0() { // from class: com.transsion.home.fragment.tab.q0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(SubTabFragment.m68256i1(this.f53298a));
                }
            });
        }
        SubTabAdapter subTabAdapter3 = this.mMainAdapter;
        if (subTabAdapter3 != null) {
            subTabAdapter3.m36186h0().m108673z(true);
            subTabAdapter3.m36186h0().m108673z(true);
            subTabAdapter3.m36186h0().m108672y(true);
            subTabAdapter3.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.home.fragment.tab.r0
                @Override // p765s6.InterfaceC27568f
                /* JADX INFO: renamed from: a */
                public final void mo63874a() {
                    SubTabFragment.m68257j1(this.f53302a);
                }
            });
            subTabAdapter3.m36158R0(new C15310b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final int m68256i1(SubTabFragment subTabFragment) {
        List<Object> data;
        SubTabAdapter subTabAdapter = subTabFragment.mMainAdapter;
        if (subTabAdapter == null || (data = subTabAdapter.getData()) == null) {
            return 0;
        }
        return data.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j1 */
    public static final void m68257j1(final SubTabFragment subTabFragment) {
        RecyclerView recyclerView;
        if (C27287m.f83003a.m106330e()) {
            SubTabViewModel subTabViewModel = subTabFragment.mViewModel;
            if (subTabViewModel != null) {
                subTabViewModel.m69004t(subTabFragment.getMTabId(), subTabFragment.getMTabCode(), false);
                return;
            }
            return;
        }
        C28951b.f88586a.m111454d(R$string.no_network_toast);
        C24703y c24703y = (C24703y) subTabFragment.getMViewBinding();
        if (c24703y == null || (recyclerView = c24703y.f75597e) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.tab.c0
            @Override // java.lang.Runnable
            public final void run() {
                SubTabFragment.m68258k1(this.f53223a);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final void m68258k1(SubTabFragment subTabFragment) {
        C27941f c27941fM36186h0;
        SubTabAdapter subTabAdapter = subTabFragment.mMainAdapter;
        if (subTabAdapter == null || (c27941fM36186h0 = subTabAdapter.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final Unit m68259l1(SubTabFragment subTabFragment, int i11) {
        HashMap mapM96844g;
        HashMap mapM96844g2;
        String str;
        Integer numV;
        C24655b logViewConfig = subTabFragment.getLogViewConfig();
        int iIntValue = (logViewConfig == null || (mapM96844g2 = logViewConfig.m96844g()) == null || (str = (String) mapM96844g2.get("scrollPosition")) == null || (numV = StringsKt.m98216v(str)) == null) ? 0 : numV.intValue();
        C24655b logViewConfig2 = subTabFragment.getLogViewConfig();
        if (logViewConfig2 != null && (mapM96844g = logViewConfig2.m96844g()) != null) {
            mapM96844g.put("scrollPosition", String.valueOf(RangesKt.m97935e(iIntValue, i11)));
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: m0 */
    private final void m68260m0() {
        String strM68101d0;
        Fragment parentFragment = getParentFragment();
        HomeFragment homeFragment = parentFragment instanceof HomeFragment ? (HomeFragment) parentFragment : null;
        if ((homeFragment == null || (strM68101d0 = homeFragment.m67935J0()) == null) && (strM68101d0 = getMTabCode()) == null) {
            strM68101d0 = "";
        }
        if (homeFragment != null) {
            homeFragment.m67938b1(strM68101d0, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final void m68261m1(SubTabFragment subTabFragment) {
        subTabFragment.mo67722c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public final void m68262n1() {
        startLoading();
        String strM23945e = C5118o.f17608a.m23945e();
        SubTabViewModel subTabViewModel = this.mViewModel;
        if (subTabViewModel != null) {
            subTabViewModel.m69000n(getMTabId(), false, strM23945e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final Unit m68263o1(SubTabFragment subTabFragment, Function1 callback) {
        Intrinsics.m97802h(callback, "callback");
        subTabFragment.mPermissionCallback = callback;
        AbstractC0249b abstractC0249b = subTabFragment.mLauncher;
        if (abstractC0249b != null) {
            abstractC0249b.m999a(new String[]{"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"});
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: p1 */
    private final void m68264p1() {
        setNetListener(new C15313e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q1 */
    public static final void m68265q1(final SubTabFragment subTabFragment, Map permissions) {
        RecyclerView recyclerView;
        Intrinsics.m97802h(permissions, "permissions");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        Iterator it = permissions.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                booleanRef.element = false;
            }
        }
        C24703y c24703y = (C24703y) subTabFragment.getMViewBinding();
        if (c24703y == null || (recyclerView = c24703y.f75597e) == null) {
            return;
        }
        recyclerView.post(new Runnable() { // from class: com.transsion.home.fragment.tab.f0
            @Override // java.lang.Runnable
            public final void run() {
                SubTabFragment.m68267r1(this.f53243a, booleanRef);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public static final void m68267r1(SubTabFragment subTabFragment, Ref.BooleanRef booleanRef) {
        Function1 function1 = subTabFragment.mPermissionCallback;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(booleanRef.element));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final Unit m68269s1() {
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final Unit m68271t1() {
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u1 */
    public final void m68273u1(float alpha) {
        View view;
        C24703y c24703y = (C24703y) getMViewBinding();
        if (c24703y == null || (view = c24703y.f75594b) == null) {
            return;
        }
        view.setAlpha(alpha);
    }

    /* JADX INFO: renamed from: v1 */
    private final void m68275v1() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.transsion.home.fragment.tab.d0
            @Override // java.lang.Runnable
            public final void run() {
                SubTabFragment.m68277w1(this.f53230a);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w1 */
    public static final void m68277w1(SubTabFragment subTabFragment) {
        SwipeRefreshLayout swipeRefreshLayout;
        if (subTabFragment.isDetached() || !subTabFragment.isAdded() || subTabFragment.getContext() == null) {
            return;
        }
        View viewM68242T0 = C27287m.f83003a.m106330e() ? subTabFragment.m68242T0() : subTabFragment.getNoNetworkView();
        SubTabAdapter subTabAdapter = subTabFragment.mMainAdapter;
        if (subTabAdapter != null) {
            subTabAdapter.m36171Y0(viewM68242T0);
        }
        subTabFragment.m68241S0();
        C24703y c24703y = (C24703y) subTabFragment.getMViewBinding();
        if (c24703y == null || (swipeRefreshLayout = c24703y.f75598f) == null) {
            return;
        }
        swipeRefreshLayout.setEnabled(false);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C24703y getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C24703y c24703yM97025c = C24703y.m97025c(inflater);
        Intrinsics.m97801g(c24703yM97025c, "inflate(...)");
        return c24703yM97025c;
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: c0 */
    public void mo67722c0() {
        String strM23945e = C5118o.f17608a.m23945e();
        SubTabViewModel subTabViewModel = this.mViewModel;
        if (subTabViewModel != null) {
            subTabViewModel.m69000n(getMTabId(), true, strM23945e);
        }
        m68260m0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: f0 */
    public RecyclerView mo67723f0() {
        C24703y c24703y = (C24703y) getMViewBinding();
        if (c24703y != null) {
            return c24703y.f75597e;
        }
        return null;
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: g0 */
    public String mo67724g0() {
        return this.isUGCMode ? "HomeFragmentListGrid2TemplateAd" : "HomeFragmentListLinearTemplateAd";
    }

    public final String getPageName() {
        return INSTANCE.m68282a(getMTabId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void hideLoading() {
        C24690m0 c24690m0;
        ConstraintLayout constraintLayout;
        SwipeRefreshLayout swipeRefreshLayout;
        SwipeRefreshLayout swipeRefreshLayout2;
        C24703y c24703y = (C24703y) getMViewBinding();
        if (c24703y != null && (swipeRefreshLayout = c24703y.f75598f) != null && swipeRefreshLayout.isRefreshing()) {
            C24703y c24703y2 = (C24703y) getMViewBinding();
            if (c24703y2 == null || (swipeRefreshLayout2 = c24703y2.f75598f) == null) {
                return;
            }
            swipeRefreshLayout2.setRefreshing(false);
            return;
        }
        C24703y c24703y3 = (C24703y) getMViewBinding();
        if (c24703y3 == null || (c24690m0 = c24703y3.f75595c) == null || (constraintLayout = c24690m0.f75513h) == null) {
            return;
        }
        AbstractC26006c.m102054g(constraintLayout);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initData(View view, Bundle savedInstanceState) {
        C3187b0 c3187b0M69003s;
        C3187b0 c3187b0M69002q;
        C3187b0 c3187b0M69001p;
        Intrinsics.m97802h(view, "view");
        SubTabAdapter subTabAdapter = this.mMainAdapter;
        if (subTabAdapter != null) {
            HomePreferencesUiHelperKt.m68125o(this, m68246X0(), subTabAdapter);
        }
        final Function1 function1 = new Function1() { // from class: com.transsion.home.fragment.tab.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubTabFragment.m68250c1(this.f53324a, (SubOperateData) obj);
            }
        };
        SubTabViewModel subTabViewModel = this.mViewModel;
        if (subTabViewModel != null && (c3187b0M69001p = subTabViewModel.m69001p()) != null) {
            c3187b0M69001p.m14851j(this, new C15314f(new Function1() { // from class: com.transsion.home.fragment.tab.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SubTabFragment.m68251d1(this.f53270a, function1, (SubOperateData) obj);
                }
            }));
        }
        SubTabViewModel subTabViewModel2 = this.mViewModel;
        if (subTabViewModel2 != null && (c3187b0M69002q = subTabViewModel2.m69002q()) != null) {
            c3187b0M69002q.m14851j(this, new C15314f(new Function1() { // from class: com.transsion.home.fragment.tab.k0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SubTabFragment.m68252e1(this.f53277a, function1, (SubOperateData) obj);
                }
            }));
        }
        SubTabViewModel subTabViewModel3 = this.mViewModel;
        if (subTabViewModel3 == null || (c3187b0M69003s = subTabViewModel3.m69003s()) == null) {
            return;
        }
        c3187b0M69003s.m14851j(this, new C15314f(new Function1() { // from class: com.transsion.home.fragment.tab.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubTabFragment.m68253f1(this.f53282a, (TrendingRespData) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment, com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        SwipeRefreshLayout swipeRefreshLayout;
        View view2;
        ViewGroup.LayoutParams layoutParams;
        Intrinsics.m97802h(view, "view");
        super.initView(view, savedInstanceState);
        SubTabViewModel subTabViewModel = (SubTabViewModel) new C3227v0(this).m14969a(SubTabViewModel.class);
        this.mViewModel = subTabViewModel;
        if (subTabViewModel != null) {
            subTabViewModel.m69005w(this.isUGCMode);
        }
        this.mHeaderBgHeight = m68245W0();
        C24703y c24703y = (C24703y) getMViewBinding();
        if (c24703y != null && (view2 = c24703y.f75594b) != null && (layoutParams = view2.getLayoutParams()) != null) {
            layoutParams.height = this.mHeaderBgHeight;
        }
        C24703y c24703y2 = (C24703y) getMViewBinding();
        if (c24703y2 == null || (swipeRefreshLayout = c24703y2.f75598f) == null) {
            return;
        }
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: com.transsion.home.fragment.tab.m0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
            /* JADX INFO: renamed from: a */
            public final void mo21823a() {
                SubTabFragment.m68261m1(this.f53286a);
            }
        });
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: l0 */
    public void mo67725l0(int lastAdPosition, BiddingNativeManager wrapperNativeManager) {
        List<Object> data;
        Intrinsics.m97802h(wrapperNativeManager, "wrapperNativeManager");
        if (wrapperNativeManager == null || lastAdPosition < 0) {
            return;
        }
        OperateItem operateItem = new OperateItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823, null);
        operateItem.setNonAdDelegate(wrapperNativeManager);
        operateItem.setType(PostItemType.TRENDING_NATIVE_AD.getValue());
        SubTabAdapter subTabAdapter = this.mMainAdapter;
        int size = (subTabAdapter == null || (data = subTabAdapter.getData()) == null) ? 0 : data.size();
        if (lastAdPosition < 0 || lastAdPosition > size) {
            SubTabAdapter subTabAdapter2 = this.mMainAdapter;
            if (subTabAdapter2 != null) {
                subTabAdapter2.mo36205p(operateItem);
                return;
            }
            return;
        }
        SubTabAdapter subTabAdapter3 = this.mMainAdapter;
        if (subTabAdapter3 != null) {
            subTabAdapter3.mo36199n(lastAdPosition, operateItem);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        List<Object> data;
        if (!this.isViewInitialized) {
            this.isViewInitialized = true;
            m68255h1();
            m68264p1();
            C26866a.a.m104898f(C26866a.f81698a, "SubTabFragment", "lazyLoadData() --> View延迟初始化完成", false, 4, null);
        }
        this.loadStartTime = System.currentTimeMillis();
        SubTabAdapter subTabAdapter = this.mMainAdapter;
        if (((subTabAdapter == null || (data = subTabAdapter.getData()) == null) ? 0 : data.size()) <= 0) {
            m68262n1();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        return new C24655b(getPageName(), false, 2, null);
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment, com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        this.mLauncher = registerForActivityResult(new C23282h(), new InterfaceC0248a() { // from class: com.transsion.home.fragment.tab.b0
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                SubTabFragment.m68265q1(this.f53216a, (Map) obj);
            }
        });
        super.onCreate(savedInstanceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        SwipeRefreshLayout swipeRefreshLayout;
        C24703y c24703y = (C24703y) getMViewBinding();
        if (c24703y != null && (swipeRefreshLayout = c24703y.f75598f) != null) {
            swipeRefreshLayout.setOnRefreshListener(null);
        }
        C24703y c24703y2 = (C24703y) getMViewBinding();
        if (c24703y2 != null && (recyclerView2 = c24703y2.f75597e) != null) {
            recyclerView2.removeOnScrollListener(this.mRecycleScrollListener);
        }
        SubTabAdapter subTabAdapter = this.mMainAdapter;
        if (subTabAdapter != null) {
            subTabAdapter.m66898V1(null);
        }
        C24703y c24703y3 = (C24703y) getMViewBinding();
        if (c24703y3 != null && (recyclerView = c24703y3.f75597e) != null) {
            recyclerView.setAdapter(null);
        }
        View view = this.mNoNetworkView;
        NoNetworkBigView noNetworkBigView = view instanceof NoNetworkBigView ? (NoNetworkBigView) view : null;
        if (noNetworkBigView != null) {
            noNetworkBigView.retry(new Function0() { // from class: com.transsion.home.fragment.tab.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SubTabFragment.m68269s1();
                }
            });
            noNetworkBigView.goToSetting(new Function0() { // from class: com.transsion.home.fragment.tab.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SubTabFragment.m68271t1();
                }
            });
        }
        this.mNoNetworkView = null;
        super.onDestroyView();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        HashMap mapM96844g;
        List<Object> data;
        super.onResume();
        SubTabAdapter subTabAdapter = this.mMainAdapter;
        boolean z11 = false;
        if (((subTabAdapter == null || (data = subTabAdapter.getData()) == null) ? 0 : data.size()) <= 0) {
            View view = this.mNoNetworkView;
            if (view != null && view.getVisibility() == 0) {
                z11 = true;
            }
            if (z11 && C27287m.f83003a.m106330e()) {
                C26866a.a aVar = C26866a.f81698a;
                View view2 = this.mNoNetworkView;
                C26866a.a.m104898f(aVar, "SubTabFragment", "loaddata on resume = " + (view2 != null ? Integer.valueOf(view2.getVisibility()) : null) + "  " + this, false, 4, null);
                m68262n1();
            }
        }
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig == null || (mapM96844g = logViewConfig.m96844g()) == null) {
            return;
        }
        mapM96844g.put("scrollPosition", "0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: p0 */
    public void mo68108p0() {
        RecyclerView recyclerView;
        C24703y c24703y = (C24703y) getMViewBinding();
        if (c24703y == null || (recyclerView = c24703y.f75597e) == null) {
            return;
        }
        recyclerView.smoothScrollToPosition(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void startLoading() {
        C24690m0 c24690m0;
        ConstraintLayout constraintLayout;
        C24703y c24703y = (C24703y) getMViewBinding();
        if (c24703y == null || (c24690m0 = c24703y.f75595c) == null || (constraintLayout = c24690m0.f75513h) == null) {
            return;
        }
        AbstractC26006c.m102058k(constraintLayout);
    }
}
