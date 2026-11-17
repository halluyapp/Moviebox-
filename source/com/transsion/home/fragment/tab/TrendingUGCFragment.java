package com.transsion.home.fragment.tab;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.view.AbstractC13772o;
import com.p282tn.lib.view.DefaultView;
import com.p282tn.lib.view.NoNetworkBigView;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.p282tn.lib.widget.R$mipmap;
import com.p282tn.lib.widget.R$string;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.baseui.util.AbstractC14556b;
import com.transsion.home.adapter.operateUGC.C14863b;
import com.transsion.home.adapter.trending.provider.C15034e;
import com.transsion.home.bean.MainOperateData;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.bean.TrendingRespData;
import com.transsion.home.bean.TrendingRespItem;
import com.transsion.home.preload.AbstractC15429c;
import com.transsion.home.viewmodel.HomePreferencesViewModel;
import com.transsion.home.viewmodel.TrendingUGCViewModel;
import com.transsion.home.viewmodel.preload.PreloadTrendingData;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.startup.pref.consume.AppStartDotState;
import com.transsion.startup.pref.consume.AppStartReport;
import com.transsion.web.api.WebConstants;
import com.transsion.wrapperad.view.secondfloor.CustomSwipeRefreshLayout;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import hk.C23862a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
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
import kotlin.ranges.RangesKt;
import mg.C25831h;
import ng.AbstractC26006c;
import p550kj.C24655b;
import p552kl.C24690m0;
import p552kl.C24704z;
import p579ll.C25646b;
import p579ll.C25648d;
import p579ll.InterfaceC25645a;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p842vl.AbstractC28126h;
import p842vl.C28121c;
import p877wm.C28406e;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u0083\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0084\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0019\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010\u0004J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0005H\u0002¢\u0006\u0004\b%\u0010\u0004J\u0017\u0010&\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b&\u0010$J\u000f\u0010'\u001a\u00020\u0005H\u0002¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010\u0011J\u000f\u0010)\u001a\u00020\u0005H\u0002¢\u0006\u0004\b)\u0010\u0004J\u000f\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00022\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J!\u00106\u001a\u00020\u00052\u0006\u00105\u001a\u00020\"2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0005H\u0016¢\u0006\u0004\b8\u0010\u0004J\u0017\u0010:\u001a\u00020\u00052\u0006\u00109\u001a\u00020-H\u0016¢\u0006\u0004\b:\u00100J!\u0010;\u001a\u00020\u00052\u0006\u00105\u001a\u00020\"2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b;\u00107J\u000f\u0010<\u001a\u00020\u0005H\u0016¢\u0006\u0004\b<\u0010\u0004J\u000f\u0010=\u001a\u00020\u0005H\u0016¢\u0006\u0004\b=\u0010\u0004J\u000f\u0010>\u001a\u00020\u0005H\u0016¢\u0006\u0004\b>\u0010\u0004J\u0017\u0010@\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u000fH\u0016¢\u0006\u0004\b@\u0010\u001aJ\u000f\u0010A\u001a\u00020\u0005H\u0016¢\u0006\u0004\bA\u0010\u0004J\u000f\u0010B\u001a\u00020\u0005H\u0016¢\u0006\u0004\bB\u0010\u0004J\u000f\u0010C\u001a\u00020\u0005H\u0016¢\u0006\u0004\bC\u0010\u0004J\u000f\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u0005¢\u0006\u0004\bG\u0010\u0004J\u0011\u0010I\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010N\u001a\u00020\u00052\u0006\u0010K\u001a\u00020*2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010R\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020PH\u0017¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u0005H\u0016¢\u0006\u0004\bT\u0010\u0004J\u000f\u0010U\u001a\u00020\u0005H\u0016¢\u0006\u0004\bU\u0010\u0004R\u0018\u0010Y\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010e\u001a\u00020b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010i\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010l\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010p\u001a\u00020m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010t\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u001b\u0010z\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u001e\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020|\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006\u0085\u0001"}, m97100d2 = {"Lcom/transsion/home/fragment/tab/TrendingUGCFragment;", "Lcom/transsion/home/fragment/tab/BaseHomeSubFragment;", "Lkl/z;", "<init>", "()V", "", "f1", "T0", "initViewModel", "r1", "Lcom/transsion/home/bean/TrendingRespData;", "baseBean", "z1", "(Lcom/transsion/home/bean/TrendingRespData;)V", "S0", "", "d1", "()Z", "", "Y0", "()F", "alpha", "w1", "(F)V", "showProgress", "p1", "(Z)V", "initExposureHelper", "", "getPageName", "()Ljava/lang/String;", "x1", "Landroid/content/Context;", "context", "Landroid/view/View;", "V0", "(Landroid/content/Context;)Landroid/view/View;", "showEmpty", "getEmptyView", "o1", "c1", "v1", "", "a1", "()I", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "b1", "(Landroid/view/LayoutInflater;)Lkl/z;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "c0", "outState", "onSaveInstanceState", "onViewCreated", "lazyLoadData", "onResume", "onPause", "hidden", "onHiddenChanged", "logResume", "p0", "onDestroy", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "t1", "Landroidx/recyclerview/widget/RecyclerView;", "f0", "()Landroidx/recyclerview/widget/RecyclerView;", "lastAdPosition", "Lcom/transsion/ad/bidding/nativead/BiddingNativeManager;", "wrapperNativeManager", "l0", "(ILcom/transsion/ad/bidding/nativead/BiddingNativeManager;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "startLoading", "hideLoading", "Lll/b;", "g", "Lll/b;", "exposureHelper", "Landroid/os/Handler;", "h", "Landroid/os/Handler;", "mHandler", "Lll/d;", "i", "Lll/d;", "postListReport", "Lcom/transsion/home/adapter/operateUGC/b;", "j", "Lcom/transsion/home/adapter/operateUGC/b;", "mainAdapter", "Lcom/transsion/home/viewmodel/TrendingUGCViewModel;", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/home/viewmodel/TrendingUGCViewModel;", "viewModel", "l", "I", "headerBgHeight", "", "m", "J", "loadStartTime", "Lcom/transsion/home/bean/MainOperateData;", "n", "Lcom/transsion/home/bean/MainOperateData;", "operatingResp", "Lcom/transsion/home/viewmodel/HomePreferencesViewModel;", "o", "Lkotlin/Lazy;", "Z0", "()Lcom/transsion/home/viewmodel/HomePreferencesViewModel;", "homePreferencesViewModel", "", "Lcom/transsion/home/bean/OperateItem;", TtmlNode.TAG_P, "Ljava/util/List;", "preferencesBlockList", CampaignEx.JSON_KEY_AD_Q, "Landroid/view/View;", "mNoNetworkView", CampaignEx.JSON_KEY_AD_R, "a", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class TrendingUGCFragment extends BaseHomeSubFragment<C24704z> {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: s */
    public static final int f53188s = 8;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C25646b exposureHelper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private C25648d postListReport;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private C14863b mainAdapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private TrendingUGCViewModel viewModel;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int headerBgHeight;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private MainOperateData operatingResp;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private List preferencesBlockList;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private View mNoNetworkView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private long loadStartTime = -1;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final Lazy homePreferencesViewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.fragment.tab.i2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TrendingUGCFragment.m68432e1(this.f53268a);
        }
    });

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.TrendingUGCFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final TrendingUGCFragment m68464a(int i11, String str) {
            Bundle bundle = new Bundle();
            bundle.putInt("tab_id", i11);
            bundle.putString(WebConstants.TAB_CODE, str);
            C26866a.f81698a.m104912c("TrendingUGCFragment", "create trending fragment", true);
            TrendingUGCFragment trendingUGCFragment = new TrendingUGCFragment();
            trendingUGCFragment.setArguments(bundle);
            return trendingUGCFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.TrendingUGCFragment$b */
    public static final class C15327b extends RecyclerView.AbstractC4219r {
        C15327b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            if (TrendingUGCFragment.this.m68431d1()) {
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                TrendingUGCFragment trendingUGCFragment = TrendingUGCFragment.this;
                trendingUGCFragment.m68455w1(RangesKt.m97937g((iComputeVerticalScrollOffset * 1.0f) / trendingUGCFragment.headerBgHeight, 1.0f));
                if (!TrendingUGCFragment.this.getMIsWhite() && TrendingUGCFragment.this.m68427Y0() < 0.7f) {
                    TrendingUGCFragment.this.m68100b0(true);
                } else {
                    if (!TrendingUGCFragment.this.getMIsWhite() || TrendingUGCFragment.this.m68427Y0() < 0.7f) {
                        return;
                    }
                    TrendingUGCFragment.this.m68100b0(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.TrendingUGCFragment$c */
    public static final class C15328c implements InterfaceC25645a {
        C15328c() {
        }

        @Override // p579ll.InterfaceC25645a
        /* JADX INFO: renamed from: a */
        public void mo67486a(int i11, long j11, View view) {
            try {
                C14863b c14863b = TrendingUGCFragment.this.mainAdapter;
                C14863b c14863b2 = null;
                if (c14863b == null) {
                    Intrinsics.m97819y("mainAdapter");
                    c14863b = null;
                }
                OperateItem operateItem = (OperateItem) c14863b.getData().get(i11);
                if (Intrinsics.m97797c(operateItem.getType(), PostItemType.UGC_SINGLE_IMAGE.getValue())) {
                    C28121c.f86299a.m109215e(i11, j11, operateItem);
                    return;
                }
                C25648d c25648d = TrendingUGCFragment.this.postListReport;
                if (c25648d != null) {
                    C14863b c14863b3 = TrendingUGCFragment.this.mainAdapter;
                    if (c14863b3 == null) {
                        Intrinsics.m97819y("mainAdapter");
                    } else {
                        c14863b2 = c14863b3;
                    }
                    c25648d.m100949a((OperateItem) CollectionsKt.m97362l0(c14863b2.getData(), i11), i11, j11);
                }
            } catch (Exception e11) {
                String message = e11.getMessage();
                if (message != null) {
                    C26866a.a.m104898f(C26866a.f81698a, "reportExposure", message, false, 4, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.TrendingUGCFragment$d */
    public static final class C15329d extends DiffUtil.AbstractC4174e {
        C15329d() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(OperateItem oldItem, OperateItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            Subject feedsSubject = oldItem.getFeedsSubject();
            String strValueOf = String.valueOf(feedsSubject != null ? feedsSubject.getSubjectId() : null);
            Subject feedsSubject2 = newItem.getFeedsSubject();
            return Intrinsics.m97797c(strValueOf, String.valueOf(feedsSubject2 != null ? feedsSubject2.getSubjectId() : null));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(OperateItem oldItem, OperateItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getType(), newItem.getType());
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.TrendingUGCFragment$e */
    public static final class C15330e extends GridLayoutManager.AbstractC4187c {

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f53203f;

        C15330e(int i11) {
            this.f53203f = i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC4187c
        /* JADX INFO: renamed from: f */
        public int mo20742f(int i11) {
            C14863b c14863b = TrendingUGCFragment.this.mainAdapter;
            if (c14863b == null) {
                Intrinsics.m97819y("mainAdapter");
                c14863b = null;
            }
            String type = ((OperateItem) c14863b.getItem(i11)).getType();
            if (!Intrinsics.m97797c(type, PostItemType.PREFERENCES.getValue()) && Intrinsics.m97797c(type, PostItemType.TRENDING_FEES_GRID.getValue())) {
                return 1;
            }
            return this.f53203f;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.TrendingUGCFragment$f */
    public static final class C15331f implements InterfaceC27288n {
        C15331f() {
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected() {
            InterfaceC27288n.a.m106338a(this);
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
            C3187b0 c3187b0M69038E;
            Intrinsics.m97802h(network, "network");
            Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
            TrendingUGCFragment.this.m68453v1();
            if (TrendingUGCFragment.this.isResumed()) {
                C14863b c14863b = TrendingUGCFragment.this.mainAdapter;
                TrendingRespData trendingRespData = null;
                if (c14863b == null) {
                    Intrinsics.m97819y("mainAdapter");
                    c14863b = null;
                }
                if (!c14863b.getData().isEmpty()) {
                    TrendingUGCViewModel trendingUGCViewModel = TrendingUGCFragment.this.viewModel;
                    if (trendingUGCViewModel != null && (c3187b0M69038E = trendingUGCViewModel.m69038E()) != null) {
                        trendingRespData = (TrendingRespData) c3187b0M69038E.m14847f();
                    }
                    if (trendingRespData != null) {
                        return;
                    }
                }
                C26866a.a.m104898f(C26866a.f81698a, "TrendingFragment", "onConnected", false, 4, null);
                TrendingUGCFragment.this.m68443p1(false);
            }
        }

        @Override // p743rh.InterfaceC27288n
        public void onDisconnected() {
            TrendingUGCFragment.this.m68442o1();
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.TrendingUGCFragment$g */
    public static final class ViewTreeObserverOnPreDrawListenerC15332g implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC15332g() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            RecyclerView recyclerView;
            ViewTreeObserver viewTreeObserver;
            Unit unit;
            TrendingUGCFragment trendingUGCFragment = TrendingUGCFragment.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                FragmentActivity activity = trendingUGCFragment.getActivity();
                if (activity != null) {
                    activity.reportFullyDrawn();
                    unit = Unit.f75682a;
                } else {
                    unit = null;
                }
                Result.m112707constructorimpl(unit);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            C24704z c24704z = (C24704z) TrendingUGCFragment.this.getMViewBinding();
            if (c24704z == null || (recyclerView = c24704z.f75602d) == null || (viewTreeObserver = recyclerView.getViewTreeObserver()) == null) {
                return true;
            }
            viewTreeObserver.removeOnPreDrawListener(this);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.TrendingUGCFragment$h */
    static final class C15333h implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f53206a;

        C15333h(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f53206a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f53206a;
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
            this.f53206a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public static final void m68402A1(TrendingUGCFragment trendingUGCFragment) {
        C14863b c14863b = trendingUGCFragment.mainAdapter;
        if (c14863b == null) {
            Intrinsics.m97819y("mainAdapter");
            c14863b = null;
        }
        c14863b.m36186h0().m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public static final void m68404B1(TrendingUGCFragment trendingUGCFragment, List list) {
        if (trendingUGCFragment.getContext() == null) {
            return;
        }
        C14863b c14863b = null;
        if (list.isEmpty()) {
            C14863b c14863b2 = trendingUGCFragment.mainAdapter;
            if (c14863b2 == null) {
                Intrinsics.m97819y("mainAdapter");
                c14863b2 = null;
            }
            C27941f.m108652u(c14863b2.m36186h0(), false, 1, null);
            return;
        }
        C14863b c14863b3 = trendingUGCFragment.mainAdapter;
        if (c14863b3 == null) {
            Intrinsics.m97819y("mainAdapter");
            c14863b3 = null;
        }
        if (c14863b3.m36186h0().m108666r()) {
            C14863b c14863b4 = trendingUGCFragment.mainAdapter;
            if (c14863b4 == null) {
                Intrinsics.m97819y("mainAdapter");
            } else {
                c14863b = c14863b4;
            }
            c14863b.m36186h0().m108667s();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S0 */
    private final void m68421S0() {
        RecyclerView recyclerView;
        C24704z c24704z = (C24704z) getMViewBinding();
        if (c24704z == null || (recyclerView = c24704z.f75602d) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new C15327b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T0 */
    private final void m68422T0() {
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        RecyclerView recyclerView;
        CustomSwipeRefreshLayout customSwipeRefreshLayout2;
        CustomSwipeRefreshLayout customSwipeRefreshLayout3;
        C24704z c24704z = (C24704z) getMViewBinding();
        ViewGroup.LayoutParams layoutParams = (c24704z == null || (customSwipeRefreshLayout3 = c24704z.f75603e) == null) ? null : customSwipeRefreshLayout3.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (m68431d1()) {
            layoutParams2.topMargin = 0;
            C24704z c24704z2 = (C24704z) getMViewBinding();
            if (c24704z2 != null && (customSwipeRefreshLayout2 = c24704z2.f75603e) != null) {
                int i11 = this.headerBgHeight;
                customSwipeRefreshLayout2.setProgressViewOffset(false, i11, AbstractC5776a0.m27313a(50.0f) + i11);
            }
            m68455w1(0.0f);
            m68100b0(true);
            return;
        }
        layoutParams2.topMargin = this.headerBgHeight;
        C24704z c24704z3 = (C24704z) getMViewBinding();
        if (c24704z3 != null && (recyclerView = c24704z3.f75602d) != null) {
            recyclerView.setPadding(0, AbstractC5776a0.m27313a(12.0f), 0, AbstractC5776a0.m27313a(56.0f));
        }
        C24704z c24704z4 = (C24704z) getMViewBinding();
        if (c24704z4 != null && (customSwipeRefreshLayout = c24704z4.f75603e) != null) {
            customSwipeRefreshLayout.setProgressViewOffset(false, 0, AbstractC5776a0.m27313a(50.0f));
        }
        m68455w1(1.0f);
        m68100b0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final void m68423U0(TrendingUGCFragment trendingUGCFragment, DefaultView defaultView, View view) {
        m68444q1(trendingUGCFragment, false, 1, null);
        defaultView.setVisibility(8);
    }

    /* JADX INFO: renamed from: V0 */
    private final View m68424V0(Context context) {
        NoNetworkBigView noNetworkBigView = new NoNetworkBigView(context);
        this.mNoNetworkView = noNetworkBigView;
        noNetworkBigView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        NoNetworkBigView.showTitle$default(noNetworkBigView, false, null, 2, null);
        noNetworkBigView.retry(new Function0() { // from class: com.transsion.home.fragment.tab.c2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrendingUGCFragment.m68425W0(this.f53226a);
            }
        });
        noNetworkBigView.goToSetting(new Function0() { // from class: com.transsion.home.fragment.tab.d2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrendingUGCFragment.m68426X0(this.f53231a);
            }
        });
        AbstractC13772o.m62233a(getPageName());
        return noNetworkBigView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final Unit m68425W0(TrendingUGCFragment trendingUGCFragment) {
        m68444q1(trendingUGCFragment, false, 1, null);
        AbstractC13772o.m62234b(trendingUGCFragment.getPageName());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final Unit m68426X0(TrendingUGCFragment trendingUGCFragment) {
        AbstractC13772o.m62235c(trendingUGCFragment.getPageName());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y0 */
    public final float m68427Y0() {
        View view;
        C24704z c24704z = (C24704z) getMViewBinding();
        if (c24704z == null || (view = c24704z.f75604f) == null) {
            return 0.0f;
        }
        return view.getAlpha();
    }

    /* JADX INFO: renamed from: Z0 */
    private final HomePreferencesViewModel m68428Z0() {
        return (HomePreferencesViewModel) this.homePreferencesViewModel.getValue();
    }

    /* JADX INFO: renamed from: a1 */
    private final int m68429a1() {
        C14863b c14863b = this.mainAdapter;
        if (c14863b == null) {
            Intrinsics.m97819y("mainAdapter");
            c14863b = null;
        }
        int i11 = 0;
        for (Object obj : c14863b.getData()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            if (Intrinsics.m97797c(((OperateItem) obj).getType(), PostItemType.NO_NETWORK.getValue())) {
                return i11;
            }
            i11 = i12;
        }
        return -1;
    }

    /* JADX INFO: renamed from: c1 */
    private final boolean m68430c1() {
        C14863b c14863b = this.mainAdapter;
        if (c14863b == null) {
            Intrinsics.m97819y("mainAdapter");
            c14863b = null;
        }
        Iterator<T> it = c14863b.getData().iterator();
        while (it.hasNext()) {
            if (Intrinsics.m97797c(((OperateItem) it.next()).getType(), PostItemType.NO_NETWORK.getValue())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public final boolean m68431d1() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final HomePreferencesViewModel m68432e1(TrendingUGCFragment trendingUGCFragment) {
        Fragment fragmentRequireParentFragment = trendingUGCFragment.requireParentFragment();
        Intrinsics.m97801g(fragmentRequireParentFragment, "requireParentFragment(...)");
        return (HomePreferencesViewModel) new C3227v0(fragmentRequireParentFragment).m14969a(HomePreferencesViewModel.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f1 */
    private final void m68433f1() {
        int i11;
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C24704z c24704z;
        RecyclerView recyclerView3;
        Context context = getContext();
        boolean z11 = context != null && AbstractC14556b.m65670a(context);
        if (z11) {
            i11 = AbstractC5806y.m27489e() > AbstractC5806y.m27487c() ? 4 : 3;
        } else {
            i11 = 2;
        }
        C14863b c14863b = new C14863b(i11, this.exposureHelper, z11, this.viewModel, this);
        c14863b.m36186h0().m108673z(true);
        c14863b.m36186h0().m108672y(true);
        c14863b.m36186h0().m108657E(4);
        c14863b.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.home.fragment.tab.j2
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                TrendingUGCFragment.m68435h1(this.f53274a);
            }
        });
        c14863b.m36158R0(new C15329d());
        c14863b.m66777U1(new Function0() { // from class: com.transsion.home.fragment.tab.k2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrendingUGCFragment.m68436i1(this.f53280a);
            }
        });
        this.mainAdapter = c14863b;
        NpaGridLayoutManager npaGridLayoutManager = new NpaGridLayoutManager(requireContext(), i11);
        C15330e c15330e = new C15330e(i11);
        c15330e.m20751i(true);
        npaGridLayoutManager.m20740d0(c15330e);
        initExposureHelper();
        C25646b c25646b = this.exposureHelper;
        if (c25646b != null && (c24704z = (C24704z) getMViewBinding()) != null && (recyclerView3 = c24704z.f75602d) != null) {
            recyclerView3.addOnScrollListener(c25646b);
        }
        C24704z c24704z2 = (C24704z) getMViewBinding();
        C14863b c14863b2 = null;
        if (c24704z2 != null && (recyclerView2 = c24704z2.f75602d) != null) {
            recyclerView2.setLayoutManager(npaGridLayoutManager);
            npaGridLayoutManager.setInitialPrefetchItemCount(6);
            C25831h c25831h = new C25831h(AbstractC5776a0.m27313a(12.0f), i11);
            c25831h.m101484d(AbstractC5776a0.m27313a(8.0f));
            recyclerView2.addItemDecoration(c25831h);
            recyclerView2.setItemAnimator(null);
            C14863b c14863b3 = this.mainAdapter;
            if (c14863b3 == null) {
                Intrinsics.m97819y("mainAdapter");
                c14863b3 = null;
            }
            recyclerView2.setAdapter(c14863b3);
            C14863b c14863b4 = this.mainAdapter;
            if (c14863b4 == null) {
                Intrinsics.m97819y("mainAdapter");
                c14863b4 = null;
            }
            recyclerView2.addOnScrollListener(new C23862a(c14863b4.m36186h0()));
        }
        C14863b c14863b5 = this.mainAdapter;
        if (c14863b5 == null) {
            Intrinsics.m97819y("mainAdapter");
            c14863b5 = null;
        }
        C15034e c15034eM66775S1 = c14863b5.getPreferencesProvider();
        HomePreferencesViewModel homePreferencesViewModelM68428Z0 = m68428Z0();
        C14863b c14863b6 = this.mainAdapter;
        if (c14863b6 == null) {
            Intrinsics.m97819y("mainAdapter");
        } else {
            c14863b2 = c14863b6;
        }
        int mTabId = getMTabId();
        String mTabCode = getMTabCode();
        if (mTabCode == null) {
            mTabCode = "";
        }
        HomePreferencesUiHelperKt.m68120j(c15034eM66775S1, homePreferencesViewModelM68428Z0, c14863b2, mTabId, mTabCode);
        C24704z c24704z3 = (C24704z) getMViewBinding();
        if (c24704z3 != null && (recyclerView = c24704z3.f75602d) != null) {
            HomePreferencesUiHelperKt.m68118h(this, recyclerView, npaGridLayoutManager, m68428Z0(), new Function0() { // from class: com.transsion.home.fragment.tab.l2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(TrendingUGCFragment.m68437j1(this.f53284a));
                }
            });
        }
        C24704z c24704z4 = (C24704z) getMViewBinding();
        if (c24704z4 == null || (customSwipeRefreshLayout = c24704z4.f75603e) == null) {
            return;
        }
        customSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: com.transsion.home.fragment.tab.m2
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
            /* JADX INFO: renamed from: a */
            public final void mo21823a() {
                TrendingUGCFragment.m68434g1(this.f53288a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final void m68434g1(TrendingUGCFragment trendingUGCFragment) {
        trendingUGCFragment.mo67722c0();
    }

    private final View getEmptyView(Context context) {
        final DefaultView defaultView = new DefaultView(context);
        defaultView.setDefaultImageViewVisibility(0);
        defaultView.setDefaultImage(R$mipmap.ic_no_content);
        String string = context.getString(R$string.no_content);
        Intrinsics.m97801g(string, "getString(...)");
        defaultView.setDescText(string);
        defaultView.setStyle(DefaultView.DefaultViewStyle.STYLE_IMAGE_DESC_BTN);
        defaultView.setBtnVisibility(0);
        String string2 = context.getString(com.transsion.baseui.R$string.retry_text);
        Intrinsics.m97801g(string2, "getString(...)");
        defaultView.setBtnText(string2);
        defaultView.setBtnClickListener(new View.OnClickListener() { // from class: com.transsion.home.fragment.tab.z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrendingUGCFragment.m68423U0(this.f53332a, defaultView, view);
            }
        });
        defaultView.setVisibility(0);
        return defaultView;
    }

    private final String getPageName() {
        return "UgcTrending";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final void m68435h1(TrendingUGCFragment trendingUGCFragment) {
        TrendingUGCViewModel trendingUGCViewModel = trendingUGCFragment.viewModel;
        if (trendingUGCViewModel != null) {
            trendingUGCViewModel.m69040J();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final Unit m68436i1(TrendingUGCFragment trendingUGCFragment) {
        if (C27287m.f83003a.m106330e()) {
            trendingUGCFragment.m68453v1();
        }
        return Unit.f75682a;
    }

    private final void initExposureHelper() {
        this.postListReport = new C25648d(getPageName());
        C25646b c25646b = new C25646b(0.6f, new C15328c(), false, 4, null);
        this.exposureHelper = c25646b;
        c25646b.m100946l(2);
    }

    private final void initViewModel() {
        C3187b0 c3187b0M69038E;
        C3187b0 c3187b0M69045z;
        C3187b0 c3187b0M69044y;
        final Function1 function1 = new Function1() { // from class: com.transsion.home.fragment.tab.e2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrendingUGCFragment.m68438k1(this.f53237a, ((Boolean) obj).booleanValue());
            }
        };
        C26866a.a aVar = C26866a.f81698a;
        PreloadTrendingData.C15566a c15566a = PreloadTrendingData.f53717n;
        C26866a.a.m104898f(aVar, "lgx", "preObserve fragment:" + this + " " + c15566a.m69164a().m69155J() + "  " + c15566a.m69164a().m69156K(), false, 4, null);
        TrendingUGCViewModel trendingUGCViewModel = this.viewModel;
        if (trendingUGCViewModel != null && (c3187b0M69044y = trendingUGCViewModel.m69044y()) != null) {
            c3187b0M69044y.m14851j(this, new C15333h(new Function1() { // from class: com.transsion.home.fragment.tab.f2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TrendingUGCFragment.m68439l1(this.f53246a, function1, (MainOperateData) obj);
                }
            }));
        }
        TrendingUGCViewModel trendingUGCViewModel2 = this.viewModel;
        if (trendingUGCViewModel2 != null && (c3187b0M69045z = trendingUGCViewModel2.m69045z()) != null) {
            c3187b0M69045z.m14851j(this, new C15333h(new Function1() { // from class: com.transsion.home.fragment.tab.g2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TrendingUGCFragment.m68440m1(this.f53254a, function1, (MainOperateData) obj);
                }
            }));
        }
        TrendingUGCViewModel trendingUGCViewModel3 = this.viewModel;
        if (trendingUGCViewModel3 == null || (c3187b0M69038E = trendingUGCViewModel3.m69038E()) == null) {
            return;
        }
        c3187b0M69038E.m14851j(this, new C15333h(new Function1() { // from class: com.transsion.home.fragment.tab.h2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrendingUGCFragment.m68441n1(this.f53264a, (TrendingRespData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final int m68437j1(TrendingUGCFragment trendingUGCFragment) {
        C14863b c14863b = trendingUGCFragment.mainAdapter;
        if (c14863b == null) {
            Intrinsics.m97819y("mainAdapter");
            c14863b = null;
        }
        return c14863b.getData().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k1 */
    public static final Unit m68438k1(TrendingUGCFragment trendingUGCFragment, boolean z11) {
        List arrayList;
        HashMap mapM96844g;
        C24704z c24704z;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        List<OperateItem> items;
        TrendingUGCViewModel trendingUGCViewModel;
        Integer groupPos;
        C24655b logViewConfig = trendingUGCFragment.getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        MainOperateData mainOperateData = trendingUGCFragment.operatingResp;
        boolean z12 = false;
        if (((mainOperateData == null || (groupPos = mainOperateData.getGroupPos()) == null) ? 0 : groupPos.intValue()) > 0 && (trendingUGCViewModel = trendingUGCFragment.viewModel) != null) {
            trendingUGCViewModel.m69042u(z11);
        }
        MainOperateData mainOperateData2 = trendingUGCFragment.operatingResp;
        if (mainOperateData2 == null || (items = mainOperateData2.getItems()) == null || (arrayList = CollectionsKt.m97343U0(items)) == null) {
            arrayList = new ArrayList();
        }
        MainOperateData mainOperateData3 = trendingUGCFragment.operatingResp;
        C14863b c14863b = null;
        AbstractC28126h.m109236c(arrayList, mainOperateData3 != null ? mainOperateData3.getOps() : null);
        String mTabCode = trendingUGCFragment.getMTabCode();
        List listM68124n = HomePreferencesUiHelperKt.m68124n(arrayList);
        trendingUGCFragment.preferencesBlockList = listM68124n;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "TrendingUGCFragment", "HomePrefs-UGC buildBlocks, tab=" + mTabCode + ", rawSize=" + arrayList.size() + ", blockSize=" + listM68124n.size(), false, 4, null);
        if (!(mTabCode == null || mTabCode.length() == 0) && !listM68124n.isEmpty()) {
            trendingUGCFragment.m68428Z0().m68939E(mTabCode, listM68124n);
            List listM68944t = trendingUGCFragment.m68428Z0().m68944t(mTabCode, listM68124n);
            C26866a.a.m104898f(aVar, "TrendingUGCFragment", "HomePrefs-UGC initialInsert, tab=" + mTabCode + "， size:" + listM68944t.size(), false, 4, null);
            if (!listM68944t.isEmpty()) {
                HomePreferencesUiHelperKt.m68117g(arrayList, listM68124n, listM68944t);
            }
            trendingUGCFragment.m68446r1();
        }
        C14863b c14863b2 = trendingUGCFragment.mainAdapter;
        if (c14863b2 == null) {
            Intrinsics.m97819y("mainAdapter");
        } else {
            c14863b = c14863b2;
        }
        c14863b.mo36201n1(arrayList);
        trendingUGCFragment.hideLoading();
        C24704z c24704z2 = (C24704z) trendingUGCFragment.getMViewBinding();
        if (((c24704z2 == null || (recyclerView2 = c24704z2.f75602d) == null) ? 0 : recyclerView2.computeVerticalScrollOffset()) > 10 && (c24704z = (C24704z) trendingUGCFragment.getMViewBinding()) != null && (recyclerView = c24704z.f75602d) != null) {
            recyclerView.scrollBy(0, 1);
        }
        if (!z11) {
            AbstractC15429c.m68505b(arrayList);
        }
        C24655b logViewConfig2 = trendingUGCFragment.getLogViewConfig();
        if (logViewConfig2 != null && !logViewConfig2.m96846i()) {
            z12 = true;
        }
        if (z12) {
            C24655b logViewConfig3 = trendingUGCFragment.getLogViewConfig();
            if (logViewConfig3 != null) {
                logViewConfig3.m96848k(true);
            }
            String strValueOf = trendingUGCFragment.loadStartTime > 0 ? String.valueOf(System.currentTimeMillis() - trendingUGCFragment.loadStartTime) : "0";
            C24655b logViewConfig4 = trendingUGCFragment.getLogViewConfig();
            if (logViewConfig4 != null && (mapM96844g = logViewConfig4.m96844g()) != null) {
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final Unit m68439l1(TrendingUGCFragment trendingUGCFragment, Function1 function1, MainOperateData mainOperateData) {
        HashMap mapM96844g;
        List<OperateItem> items;
        C24655b logViewConfig = trendingUGCFragment.getLogViewConfig();
        if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
            mapM96844g.put("enterCache", String.valueOf((mainOperateData == null || (items = mainOperateData.getItems()) == null) ? null : Integer.valueOf(items.size())));
        }
        C14863b c14863b = trendingUGCFragment.mainAdapter;
        if (c14863b == null) {
            Intrinsics.m97819y("mainAdapter");
            c14863b = null;
        }
        if (c14863b.getData().size() == 0) {
            List<OperateItem> items2 = mainOperateData != null ? mainOperateData.getItems() : null;
            if (items2 != null && !items2.isEmpty()) {
                trendingUGCFragment.operatingResp = mainOperateData;
                function1.invoke(Boolean.TRUE);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m1 */
    public static final Unit m68440m1(TrendingUGCFragment trendingUGCFragment, Function1 function1, MainOperateData mainOperateData) {
        List<OperateItem> items;
        C24704z c24704z;
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        HashMap mapM96844g;
        List<OperateItem> items2;
        List<OperateItem> items3;
        List<OperateItem> items4;
        List<OperateItem> items5;
        MainOperateData mainOperateData2 = (MainOperateData) PreloadTrendingData.f53717n.m69164a().m69155J().m14847f();
        C26866a.f81698a.m104912c("PreloadTrending", "operating preload cache " + ((mainOperateData2 == null || (items5 = mainOperateData2.getItems()) == null) ? null : Integer.valueOf(items5.size())) + "  net:" + ((mainOperateData == null || (items4 = mainOperateData.getItems()) == null) ? null : Integer.valueOf(items4.size())), true);
        C24655b logViewConfig = trendingUGCFragment.getLogViewConfig();
        if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
            mapM96844g.put("enterNet", "cache:" + ((mainOperateData2 == null || (items3 = mainOperateData2.getItems()) == null) ? null : Integer.valueOf(items3.size())) + " net:" + ((mainOperateData == null || (items2 = mainOperateData.getItems()) == null) ? null : Integer.valueOf(items2.size())));
        }
        List<OperateItem> items6 = mainOperateData != null ? mainOperateData.getItems() : null;
        if (items6 != null && !items6.isEmpty()) {
            trendingUGCFragment.operatingResp = mainOperateData;
        } else if (trendingUGCFragment.operatingResp == null) {
            trendingUGCFragment.operatingResp = mainOperateData2;
        }
        C14863b c14863b = trendingUGCFragment.mainAdapter;
        if (c14863b == null) {
            Intrinsics.m97819y("mainAdapter");
            c14863b = null;
        }
        if (c14863b.getData().size() > 0 && ((c24704z = (C24704z) trendingUGCFragment.getMViewBinding()) == null || (customSwipeRefreshLayout = c24704z.f75603e) == null || !customSwipeRefreshLayout.isRefreshing())) {
            List<OperateItem> items7 = mainOperateData != null ? mainOperateData.getItems() : null;
            if (items7 == null || items7.isEmpty()) {
                return Unit.f75682a;
            }
        }
        MainOperateData mainOperateData3 = trendingUGCFragment.operatingResp;
        if (mainOperateData3 == null || (items = mainOperateData3.getItems()) == null || !(!items.isEmpty())) {
            TrendingUGCViewModel trendingUGCViewModel = trendingUGCFragment.viewModel;
            if (trendingUGCViewModel != null) {
                trendingUGCViewModel.m69040J();
            }
        } else {
            function1.invoke(Boolean.FALSE);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final Unit m68441n1(TrendingUGCFragment trendingUGCFragment, TrendingRespData trendingRespData) {
        trendingUGCFragment.m68461z1(trendingRespData);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public final void m68442o1() {
        int iM69043x;
        if (m68430c1()) {
            return;
        }
        TrendingUGCViewModel trendingUGCViewModel = this.viewModel;
        if (trendingUGCViewModel != null) {
            C14863b c14863b = this.mainAdapter;
            if (c14863b == null) {
                Intrinsics.m97819y("mainAdapter");
                c14863b = null;
            }
            iM69043x = trendingUGCViewModel.m69043x(c14863b.getData());
        } else {
            iM69043x = 2;
        }
        if (iM69043x >= 0) {
            C14863b c14863b2 = this.mainAdapter;
            if (c14863b2 == null) {
                Intrinsics.m97819y("mainAdapter");
                c14863b2 = null;
            }
            if (iM69043x < c14863b2.getData().size()) {
                C14863b c14863b3 = this.mainAdapter;
                if (c14863b3 == null) {
                    Intrinsics.m97819y("mainAdapter");
                    c14863b3 = null;
                }
                c14863b3.getData().add(iM69043x, new OperateItem(null, PostItemType.NO_NETWORK.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741821, null));
                C14863b c14863b4 = this.mainAdapter;
                if (c14863b4 == null) {
                    Intrinsics.m97819y("mainAdapter");
                    c14863b4 = null;
                }
                c14863b4.notifyItemInserted(iM69043x);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public final void m68443p1(boolean showProgress) {
        if (showProgress) {
            C14863b c14863b = this.mainAdapter;
            if (c14863b == null) {
                Intrinsics.m97819y("mainAdapter");
                c14863b = null;
            }
            if (c14863b.getData().size() <= 2) {
                startLoading();
            }
        }
        TrendingUGCViewModel trendingUGCViewModel = this.viewModel;
        if (trendingUGCViewModel != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            trendingUGCViewModel.m69035A(contextRequireContext);
        }
    }

    /* JADX INFO: renamed from: q1 */
    static /* synthetic */ void m68444q1(TrendingUGCFragment trendingUGCFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        trendingUGCFragment.m68443p1(z11);
    }

    /* JADX INFO: renamed from: r1 */
    private final void m68446r1() {
        m68428Z0().m68945u().m14851j(getViewLifecycleOwner(), new C15333h(new Function1() { // from class: com.transsion.home.fragment.tab.a2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrendingUGCFragment.m68448s1(this.f53212a, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final Unit m68448s1(TrendingUGCFragment trendingUGCFragment, Pair pair) {
        List list;
        String str = (String) pair.component1();
        List list2 = (List) pair.component2();
        if (!Intrinsics.m97797c(str, trendingUGCFragment.getMTabCode()) || (list = list2) == null || list.isEmpty()) {
            return Unit.f75682a;
        }
        List list3 = trendingUGCFragment.preferencesBlockList;
        if (list3 == null) {
            return Unit.f75682a;
        }
        C14863b c14863b = trendingUGCFragment.mainAdapter;
        C14863b c14863b2 = null;
        if (c14863b == null) {
            Intrinsics.m97819y("mainAdapter");
            c14863b = null;
        }
        List listU0 = CollectionsKt.m97343U0(c14863b.getData());
        HomePreferencesUiHelperKt.m68117g(listU0, list3, list2);
        C14863b c14863b3 = trendingUGCFragment.mainAdapter;
        if (c14863b3 == null) {
            Intrinsics.m97819y("mainAdapter");
        } else {
            c14863b2 = c14863b3;
        }
        c14863b2.mo36201n1(listU0);
        return Unit.f75682a;
    }

    private final void showEmpty() {
        hideLoading();
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        View emptyView = getEmptyView(contextRequireContext);
        C14863b c14863b = this.mainAdapter;
        if (c14863b == null) {
            Intrinsics.m97819y("mainAdapter");
            c14863b = null;
        }
        c14863b.m36171Y0(emptyView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u1 */
    public static final void m68451u1(TrendingUGCFragment trendingUGCFragment) {
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        C24704z c24704z = (C24704z) trendingUGCFragment.getMViewBinding();
        if (c24704z != null && (customSwipeRefreshLayout = c24704z.f75603e) != null) {
            customSwipeRefreshLayout.setRefreshing(true);
        }
        trendingUGCFragment.mo67722c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public final void m68453v1() {
        int iM68429a1 = m68429a1();
        if (iM68429a1 >= 0) {
            C14863b c14863b = this.mainAdapter;
            C14863b c14863b2 = null;
            if (c14863b == null) {
                Intrinsics.m97819y("mainAdapter");
                c14863b = null;
            }
            if (iM68429a1 < c14863b.getData().size()) {
                C14863b c14863b3 = this.mainAdapter;
                if (c14863b3 == null) {
                    Intrinsics.m97819y("mainAdapter");
                    c14863b3 = null;
                }
                c14863b3.getData().remove(iM68429a1);
                C14863b c14863b4 = this.mainAdapter;
                if (c14863b4 == null) {
                    Intrinsics.m97819y("mainAdapter");
                } else {
                    c14863b2 = c14863b4;
                }
                c14863b2.notifyItemRemoved(iM68429a1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w1 */
    public final void m68455w1(float alpha) {
        View view;
        C24704z c24704z = (C24704z) getMViewBinding();
        if (c24704z == null || (view = c24704z.f75604f) == null) {
            return;
        }
        view.setAlpha(alpha);
    }

    /* JADX INFO: renamed from: x1 */
    private final void m68457x1() {
        this.mHandler.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.tab.b2
            @Override // java.lang.Runnable
            public final void run() {
                TrendingUGCFragment.m68459y1(this.f53218a);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public static final void m68459y1(TrendingUGCFragment trendingUGCFragment) {
        if (trendingUGCFragment.isDetached() || !trendingUGCFragment.isAdded() || trendingUGCFragment.getContext() == null) {
            return;
        }
        trendingUGCFragment.hideLoading();
        Context contextRequireContext = trendingUGCFragment.requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        View viewM68424V0 = trendingUGCFragment.m68424V0(contextRequireContext);
        C14863b c14863b = trendingUGCFragment.mainAdapter;
        if (c14863b == null) {
            Intrinsics.m97819y("mainAdapter");
            c14863b = null;
        }
        c14863b.m36171Y0(viewM68424V0);
    }

    /* JADX INFO: renamed from: z1 */
    private final void m68461z1(TrendingRespData baseBean) {
        List<OperateItem> list;
        C14863b c14863b = null;
        if (baseBean == null) {
            m68457x1();
            C14863b c14863b2 = this.mainAdapter;
            if (c14863b2 == null) {
                Intrinsics.m97819y("mainAdapter");
                c14863b2 = null;
            }
            if (c14863b2.m36186h0().m108666r()) {
                C14863b c14863b3 = this.mainAdapter;
                if (c14863b3 == null) {
                    Intrinsics.m97819y("mainAdapter");
                } else {
                    c14863b = c14863b3;
                }
                c14863b.m36186h0().m108669v();
                return;
            }
            return;
        }
        hideLoading();
        C26866a.a aVar = C26866a.f81698a;
        List<TrendingRespItem> items = baseBean.getItems();
        C26866a.a.m104898f(aVar, "TrendingFragment", "updateTrendingList subjectBean " + (items != null ? Integer.valueOf(items.size()) : null), false, 4, null);
        final List<OperateItem> transferData = baseBean.getTransferData();
        C14863b c14863b4 = this.mainAdapter;
        if (c14863b4 == null) {
            Intrinsics.m97819y("mainAdapter");
            c14863b4 = null;
        }
        if (c14863b4.getData().size() == 0 && ((list = transferData) == null || list.isEmpty())) {
            showEmpty();
            return;
        }
        if (transferData == null) {
            this.mHandler.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.tab.x1
                @Override // java.lang.Runnable
                public final void run() {
                    TrendingUGCFragment.m68402A1(this.f53323a);
                }
            }, 200L);
            return;
        }
        C14863b c14863b5 = this.mainAdapter;
        if (c14863b5 == null) {
            Intrinsics.m97819y("mainAdapter");
        } else {
            c14863b = c14863b5;
        }
        c14863b.mo36208q(transferData);
        AbstractC15429c.m68504a(getContext(), transferData);
        this.mHandler.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.tab.y1
            @Override // java.lang.Runnable
            public final void run() {
                TrendingUGCFragment.m68404B1(this.f53326a, transferData);
            }
        }, 200L);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C24704z getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C24704z c24704zM97029c = C24704z.m97029c(inflater);
        Intrinsics.m97801g(c24704zM97029c, "inflate(...)");
        return c24704zM97029c;
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: c0 */
    public void mo67722c0() {
        super.mo67722c0();
        TrendingUGCViewModel trendingUGCViewModel = this.viewModel;
        if (trendingUGCViewModel != null) {
            trendingUGCViewModel.m69039I();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: f0 */
    public RecyclerView mo67723f0() {
        C24704z c24704z = (C24704z) getMViewBinding();
        if (c24704z != null) {
            return c24704z.f75602d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void hideLoading() {
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        C24704z c24704z;
        CustomSwipeRefreshLayout customSwipeRefreshLayout2;
        CustomSwipeRefreshLayout customSwipeRefreshLayout3;
        C24690m0 c24690m0;
        ConstraintLayout constraintLayout;
        C24704z c24704z2 = (C24704z) getMViewBinding();
        if (c24704z2 != null && (c24690m0 = c24704z2.f75601c) != null && (constraintLayout = c24690m0.f75513h) != null) {
            AbstractC26006c.m102054g(constraintLayout);
        }
        C24704z c24704z3 = (C24704z) getMViewBinding();
        if (c24704z3 != null && (customSwipeRefreshLayout3 = c24704z3.f75603e) != null) {
            customSwipeRefreshLayout3.setEnabled(true);
        }
        C24704z c24704z4 = (C24704z) getMViewBinding();
        if (c24704z4 == null || (customSwipeRefreshLayout = c24704z4.f75603e) == null || !customSwipeRefreshLayout.isRefreshing() || (c24704z = (C24704z) getMViewBinding()) == null || (customSwipeRefreshLayout2 = c24704z.f75603e) == null) {
            return;
        }
        customSwipeRefreshLayout2.setRefreshing(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment, com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        View view2;
        ViewGroup.LayoutParams layoutParams;
        RecyclerView recyclerView;
        ViewTreeObserver viewTreeObserver;
        Intrinsics.m97802h(view, "view");
        super.initView(view, savedInstanceState);
        m68433f1();
        AppStartReport appStartReport = AppStartReport.f62550a;
        appStartReport.m81548l("trending_list");
        initViewModel();
        appStartReport.m81548l("trending_vm");
        setNetListener(new C15331f());
        C24704z c24704z = (C24704z) getMViewBinding();
        if (c24704z != null && (recyclerView = c24704z.f75602d) != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC15332g());
        }
        m68421S0();
        this.headerBgHeight = m68103h0();
        C24704z c24704z2 = (C24704z) getMViewBinding();
        if (c24704z2 != null && (view2 = c24704z2.f75604f) != null && (layoutParams = view2.getLayoutParams()) != null) {
            layoutParams.height = this.headerBgHeight;
        }
        m68422T0();
        if (savedInstanceState != null && savedInstanceState.getBoolean("operate_items", false)) {
            TrendingUGCViewModel trendingUGCViewModel = this.viewModel;
            C14863b c14863b = null;
            List listM69037D = trendingUGCViewModel != null ? trendingUGCViewModel.m69037D() : null;
            C14863b c14863b2 = this.mainAdapter;
            if (c14863b2 == null) {
                Intrinsics.m97819y("mainAdapter");
            } else {
                c14863b = c14863b2;
            }
            c14863b.mo36201n1(listM69037D);
        }
        appStartReport.m81548l("trending_view_init");
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: l0 */
    public void mo67725l0(int lastAdPosition, BiddingNativeManager wrapperNativeManager) {
        Intrinsics.m97802h(wrapperNativeManager, "wrapperNativeManager");
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        C14863b c14863b = this.mainAdapter;
        if (c14863b == null) {
            Intrinsics.m97819y("mainAdapter");
            c14863b = null;
        }
        if (c14863b.getData().isEmpty()) {
            this.loadStartTime = System.currentTimeMillis();
            C26866a.a aVar = C26866a.f81698a;
            C14863b c14863b2 = this.mainAdapter;
            if (c14863b2 == null) {
                Intrinsics.m97819y("mainAdapter");
                c14863b2 = null;
            }
            boolean zIsEmpty = c14863b2.getData().isEmpty();
            C14863b c14863b3 = this.mainAdapter;
            if (c14863b3 == null) {
                Intrinsics.m97819y("mainAdapter");
                c14863b3 = null;
            }
            aVar.m104912c("PreloadTrending", "lazyLoadData " + zIsEmpty + " " + c14863b3.getData().size(), true);
            m68444q1(this, false, 1, null);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void logResume() {
        super.logResume();
        C28406e.f87111a.m109772h();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        return new C24655b(getPageName(), false, 2, null);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.m97802h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Context context = getContext();
        if (context == null || !AbstractC14556b.m65670a(context)) {
            return;
        }
        C14863b c14863b = this.mainAdapter;
        if (c14863b == null) {
            Intrinsics.m97819y("mainAdapter");
            c14863b = null;
        }
        c14863b.notifyDataSetChanged();
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment, com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        AppStartReport.f62550a.m81545f(new AppStartDotState(AppStartDotState.TRENDING_CREATE, 0L, 2, null));
        super.onCreate(savedInstanceState);
        TrendingUGCViewModel.C15543a c15543a = TrendingUGCViewModel.f53672l;
        Application application = requireActivity().getApplication();
        Intrinsics.m97801g(application, "getApplication(...)");
        this.viewModel = c15543a.m69046a(application);
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mHandler.removeCallbacksAndMessages(null);
        C28121c.f86299a.m109212a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed()) {
            if (hidden) {
                logPause();
                C25646b c25646b = this.exposureHelper;
                if (c25646b != null) {
                    c25646b.m100943e();
                }
            } else {
                logResume();
            }
        }
        AbstractC14517k.m65410h(null, this, hidden, null, 9, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C25646b c25646b = this.exposureHelper;
        if (c25646b != null) {
            c25646b.m100943e();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C26866a.a aVar = C26866a.f81698a;
        View view = this.mNoNetworkView;
        C26866a.a.m104898f(aVar, "TrendingFragment", "visible = " + (view != null ? Integer.valueOf(view.getVisibility()) : null) + "  " + this, false, 4, null);
        View view2 = this.mNoNetworkView;
        if (view2 != null && view2.getVisibility() == 0 && C27287m.f83003a.m106330e()) {
            C14863b c14863b = this.mainAdapter;
            if (c14863b == null) {
                Intrinsics.m97819y("mainAdapter");
                c14863b = null;
            }
            if (c14863b.getData().size() < 2) {
                m68444q1(this, false, 1, null);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.m97802h(outState, "outState");
        super.onSaveInstanceState(outState);
        C14863b c14863b = this.mainAdapter;
        C14863b c14863b2 = null;
        if (c14863b == null) {
            Intrinsics.m97819y("mainAdapter");
            c14863b = null;
        }
        if (c14863b.getData().size() > 0) {
            TrendingUGCViewModel trendingUGCViewModel = this.viewModel;
            if (trendingUGCViewModel != null) {
                C14863b c14863b3 = this.mainAdapter;
                if (c14863b3 == null) {
                    Intrinsics.m97819y("mainAdapter");
                } else {
                    c14863b2 = c14863b3;
                }
                trendingUGCViewModel.m69041N(c14863b2.getData());
            }
            outState.putBoolean("operate_items", true);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AppStartReport.f62550a.m81545f(new AppStartDotState(AppStartDotState.TRENDING_RENDER, 0L, 2, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: p0 */
    public void mo68108p0() {
        RecyclerView recyclerView;
        C24704z c24704z = (C24704z) getMViewBinding();
        if (c24704z == null || (recyclerView = c24704z.f75602d) == null) {
            return;
        }
        recyclerView.smoothScrollToPosition(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void startLoading() {
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        C24690m0 c24690m0;
        ConstraintLayout constraintLayout;
        C24704z c24704z = (C24704z) getMViewBinding();
        if (c24704z != null && (c24690m0 = c24704z.f75601c) != null && (constraintLayout = c24690m0.f75513h) != null) {
            AbstractC26006c.m102058k(constraintLayout);
        }
        C24704z c24704z2 = (C24704z) getMViewBinding();
        if (c24704z2 == null || (customSwipeRefreshLayout = c24704z2.f75603e) == null) {
            return;
        }
        customSwipeRefreshLayout.setEnabled(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t1 */
    public final void m68463t1() {
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        RecyclerView recyclerView;
        if (isAdded()) {
            C24704z c24704z = (C24704z) getMViewBinding();
            if (c24704z != null && (recyclerView = c24704z.f75602d) != null) {
                recyclerView.scrollToPosition(0);
            }
            C24704z c24704z2 = (C24704z) getMViewBinding();
            if (c24704z2 == null || (customSwipeRefreshLayout = c24704z2.f75603e) == null) {
                return;
            }
            customSwipeRefreshLayout.post(new Runnable() { // from class: com.transsion.home.fragment.tab.w1
                @Override // java.lang.Runnable
                public final void run() {
                    TrendingUGCFragment.m68451u1(this.f53320a);
                }
            });
        }
    }
}
