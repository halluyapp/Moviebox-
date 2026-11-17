package com.transsion.home.p294tv.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.os.AbstractC2411d;
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
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5806y;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.noober.background.view.BLConstraintLayout;
import com.p282tn.lib.view.NoNetworkBigView;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.base.report.athena.BrowseType;
import com.transsion.base.report.athena.ClickType;
import com.transsion.baseui.fragment.LazyFragment;
import com.transsion.home.R$drawable;
import com.transsion.home.R$layout;
import com.transsion.home.R$string;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.BaseHomeSubFragment;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.home.p294tv.TVChannelHomeViewModel;
import com.transsion.home.p294tv.TvCountrySelectDialog;
import com.transsion.home.p294tv.adapter.C15449f;
import com.transsion.home.p294tv.bean.CountryItem;
import com.transsion.home.p294tv.bean.ImageInfo;
import com.transsion.home.p294tv.bean.StreamItem;
import com.transsion.home.p294tv.bean.TvChannelItem;
import com.transsion.home.p294tv.bean.TvChannelLoadMoreResult;
import com.transsion.home.p294tv.bean.TvChannelRefreshResult;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p462hj.C23860f;
import p550kj.C24655b;
import p550kj.C24662i;
import p552kl.C24666a0;
import p579ll.C25646b;
import p579ll.InterfaceC25645a;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000£\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006*\u0001[\b\u0007\u0018\u0000 _2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u0019\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u0017\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010\u0004J\u000f\u0010,\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010\u0004J\u000f\u0010-\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010\u0004J\u000f\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010\u0004J\u000f\u0010/\u001a\u00020\tH\u0016¢\u0006\u0004\b/\u0010\u0004J\u000f\u00100\u001a\u00020\tH\u0016¢\u0006\u0004\b0\u0010\u0004J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u0011\u00104\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b4\u0010*R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR$\u0010G\u001a\u0012\u0012\u0004\u0012\u00020\u00110Cj\b\u0012\u0004\u0012\u00020\u0011`D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001c\u0010L\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010O\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010R\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006`"}, m97100d2 = {"Lcom/transsion/home/tv/fragment/TVChannelHomeFragment;", "Lcom/transsion/baseui/fragment/LazyFragment;", "Lkl/a0;", "<init>", "()V", "Lcom/transsion/home/tv/bean/TvChannelItem;", WebConstants.FIELD_ITEM, "", RequestParameters.POSITION, "", "P0", "(Lcom/transsion/home/tv/bean/TvChannelItem;I)V", "R0", "", "showEmpty", "W0", "(Z)V", "", "timezone", "U0", "(Ljava/lang/String;)V", "V0", "initExposureHelper", "Landroidx/fragment/app/FragmentActivity;", "Q0", "()Landroidx/fragment/app/FragmentActivity;", "X0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "lazyLoadData", "Landroid/view/LayoutInflater;", "inflater", "C0", "(Landroid/view/LayoutInflater;)Lkl/a0;", "getPageStateLayoutTitle", "()Ljava/lang/String;", "isShowPageStateLayoutTitle", "()Z", "Landroid/view/View;", "getNoNetworkView", "()Landroid/view/View;", "initViewData", "initViewModel", "initListener", "retryLoadData", "onPause", "onDestroyView", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "getLoadingView", "Lcom/transsion/home/tv/TVChannelHomeViewModel;", "a", "Lkotlin/Lazy;", "D0", "()Lcom/transsion/home/tv/TVChannelHomeViewModel;", "viewModel", "Lcom/transsion/home/tv/adapter/f;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/home/tv/adapter/f;", "channelAdapter", "Lll/b;", "c", "Lll/b;", "exposureHelper", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/util/HashSet;", "exposedChannelIds", "", "Lcom/transsion/home/tv/bean/CountryItem;", "e", "Ljava/util/List;", "countryList", "f", "Z", "pendingScrollToTopAfterCountryChange", "g", "Ljava/lang/String;", "currentTimezone", "", "h", "J", "loadStartTime", "Landroid/os/Handler;", "i", "Landroid/os/Handler;", "timeHandler", "com/transsion/home/tv/fragment/TVChannelHomeFragment$timeUpdateRunnable$1", "j", "Lcom/transsion/home/tv/fragment/TVChannelHomeFragment$timeUpdateRunnable$1;", "timeUpdateRunnable", CampaignEx.JSON_KEY_AD_K, "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class TVChannelHomeFragment extends LazyFragment<C24666a0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l */
    public static final int f53446l = 8;

    /* JADX INFO: renamed from: m */
    private static final Map f53447m;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C15449f channelAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C25646b exposureHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final HashSet exposedChannelIds;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private List countryList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean pendingScrollToTopAfterCountryChange;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String currentTimezone;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long loadStartTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Handler timeHandler;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final TVChannelHomeFragment$timeUpdateRunnable$1 timeUpdateRunnable;

    /* JADX INFO: renamed from: com.transsion.home.tv.fragment.TVChannelHomeFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m68665a(int i11) {
            String str = (String) TVChannelHomeFragment.f53447m.get(Integer.valueOf(i11));
            return str == null ? "tv_channel" : str;
        }

        /* JADX INFO: renamed from: b */
        public final TVChannelHomeFragment m68666b(int i11) {
            TVChannelHomeFragment tVChannelHomeFragment = new TVChannelHomeFragment();
            tVChannelHomeFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("tab_id", Integer.valueOf(i11))));
            return tVChannelHomeFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.tv.fragment.TVChannelHomeFragment$b */
    public static final class C15474b implements InterfaceC25645a {
        C15474b() {
        }

        @Override // p579ll.InterfaceC25645a
        /* JADX INFO: renamed from: a */
        public void mo67486a(int i11, long j11, View view) {
            List<Object> data;
            OperateItem operateItem;
            TvChannelItem tvChannelItem;
            List<StreamItem> streams;
            StreamItem streamItem;
            String url;
            String url2;
            List<StreamItem> streams2;
            StreamItem streamItem2;
            C15449f c15449f = TVChannelHomeFragment.this.channelAdapter;
            if (c15449f == null || (data = c15449f.getData()) == null || (operateItem = (OperateItem) CollectionsKt.m97362l0(data, i11)) == null || !Intrinsics.m97797c(operateItem.getType(), PostItemType.TV_CHANNEL_ITEM.getValue()) || (tvChannelItem = operateItem.getTvChannelItem()) == null || (streams = tvChannelItem.getStreams()) == null || (streamItem = streams.get(0)) == null || (url = streamItem.getUrl()) == null || TVChannelHomeFragment.this.exposedChannelIds.contains(url)) {
                return;
            }
            TVChannelHomeFragment.this.exposedChannelIds.add(url);
            HashMap map = new HashMap();
            TvChannelItem tvChannelItem2 = operateItem.getTvChannelItem();
            if (tvChannelItem2 == null || (streams2 = tvChannelItem2.getStreams()) == null || (streamItem2 = streams2.get(0)) == null || (url2 = streamItem2.getUrl()) == null) {
                url2 = "";
            }
            map.put("content_id", url2);
            String title = operateItem.getTitle();
            map.put("opt_title", title != null ? title : "");
            map.put(RequestParameters.POSITION, String.valueOf(i11));
            C24662i.f75350a.m96873E("tv_channel", map, BrowseType.CONTENT);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.tv.fragment.TVChannelHomeFragment$c */
    static final class C15475c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f53459a;

        C15475c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f53459a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f53459a;
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
            this.f53459a.invoke(obj);
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Integer.valueOf(HomeTabId.TVChannel.getValue()), "tv_channel");
        linkedHashMap.put(Integer.valueOf(HomeTabId.UGC_TVChannel.getValue()), "ugc_tv_channel");
        f53447m = linkedHashMap;
    }

    public TVChannelHomeFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.home.tv.fragment.TVChannelHomeFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.viewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(TVChannelHomeViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.home.tv.fragment.TVChannelHomeFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.home.tv.fragment.TVChannelHomeFragment$special$$inlined$viewModels$default$3
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
        this.exposedChannelIds = new HashSet();
        this.countryList = CollectionsKt.m97506l();
        this.loadStartTime = -1L;
        this.timeHandler = new Handler(Looper.getMainLooper());
        this.timeUpdateRunnable = new TVChannelHomeFragment$timeUpdateRunnable$1(this);
    }

    /* JADX INFO: renamed from: D0 */
    private final TVChannelHomeViewModel m68627D0() {
        return (TVChannelHomeViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final void m68628E0(TVChannelHomeFragment tVChannelHomeFragment, View view) {
        HashMap map = new HashMap();
        map.put("module_name", "country_select");
        map.put(NativeComponentConstants.KEY_COMPONENT_TYPE, RewardPlus.ICON);
        C24662i.f75350a.m96882q("tv_channel", map, ClickType.FEATURE);
        tVChannelHomeFragment.m68641R0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final void m68629F0(TVChannelHomeFragment tVChannelHomeFragment) {
        tVChannelHomeFragment.m68627D0().m68547x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final Unit m68630G0(TVChannelHomeFragment tVChannelHomeFragment, TvChannelItem item, int i11) {
        Intrinsics.m97802h(item, "item");
        tVChannelHomeFragment.m68639P0(item, i11);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H0 */
    public static final Unit m68631H0(TVChannelHomeFragment tVChannelHomeFragment, int i11) {
        C25646b c25646b;
        RecyclerView recyclerView;
        C24666a0 c24666a0 = (C24666a0) tVChannelHomeFragment.getMViewBinding();
        RecyclerView.AbstractC4214m layoutManager = (c24666a0 == null || (recyclerView = c24666a0.f75364g) == null) ? null : recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null && (c25646b = tVChannelHomeFragment.exposureHelper) != null) {
            c25646b.m100944h(linearLayoutManager, i11, true);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final String m68632I0(TVChannelHomeFragment tVChannelHomeFragment) {
        return tVChannelHomeFragment.m68627D0().m68540n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final void m68633J0(TVChannelHomeFragment tVChannelHomeFragment) {
        tVChannelHomeFragment.m68627D0().m68546u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K0 */
    public static final Unit m68634K0(final TVChannelHomeFragment tVChannelHomeFragment, TvChannelRefreshResult tvChannelRefreshResult) {
        C24666a0 c24666a0;
        C15449f c15449f;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        if (tVChannelHomeFragment.m68640Q0() != null && (c24666a0 = (C24666a0) tVChannelHomeFragment.getMViewBinding()) != null && (c15449f = tVChannelHomeFragment.channelAdapter) != null) {
            tVChannelHomeFragment.showContentView();
            c24666a0.f75365h.setRefreshing(false);
            if (tvChannelRefreshResult == null) {
                if (c15449f.m36186h0().m108666r()) {
                    c15449f.m36186h0().m108669v();
                }
                tVChannelHomeFragment.m68646W0(c15449f.getItemCount() == 0);
                return Unit.f75682a;
            }
            C25646b c25646b = tVChannelHomeFragment.exposureHelper;
            if (c25646b != null) {
                c25646b.m100943e();
            }
            c15449f.mo36201n1(tvChannelRefreshResult.getList());
            if (tVChannelHomeFragment.pendingScrollToTopAfterCountryChange) {
                C24666a0 c24666a1 = (C24666a0) tVChannelHomeFragment.getMViewBinding();
                if (c24666a1 != null && (recyclerView2 = c24666a1.f75364g) != null) {
                    recyclerView2.scrollToPosition(0);
                }
                tVChannelHomeFragment.pendingScrollToTopAfterCountryChange = false;
            }
            tVChannelHomeFragment.m68646W0(c15449f.getItemCount() == 0);
            if (tvChannelRefreshResult.getHasMore()) {
                c15449f.m36186h0().m108667s();
            } else {
                C27941f.m108652u(c15449f.m36186h0(), false, 1, null);
            }
            C24666a0 c24666a2 = (C24666a0) tVChannelHomeFragment.getMViewBinding();
            if (c24666a2 != null && (recyclerView = c24666a2.f75364g) != null) {
                recyclerView.post(new Runnable() { // from class: com.transsion.home.tv.fragment.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        TVChannelHomeFragment.m68635L0(this.f53491a);
                    }
                });
            }
            return Unit.f75682a;
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L0 */
    public static final void m68635L0(TVChannelHomeFragment tVChannelHomeFragment) {
        C25646b c25646b;
        RecyclerView recyclerView;
        C24666a0 c24666a0 = (C24666a0) tVChannelHomeFragment.getMViewBinding();
        RecyclerView.AbstractC4214m layoutManager = (c24666a0 == null || (recyclerView = c24666a0.f75364g) == null) ? null : recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (c25646b = tVChannelHomeFragment.exposureHelper) == null) {
            return;
        }
        c25646b.m100945i(linearLayoutManager, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final Unit m68636M0(TVChannelHomeFragment tVChannelHomeFragment, TvChannelLoadMoreResult tvChannelLoadMoreResult) {
        C15449f c15449f;
        if (tVChannelHomeFragment.m68640Q0() != null && (c15449f = tVChannelHomeFragment.channelAdapter) != null) {
            if (tvChannelLoadMoreResult == null) {
                if (c15449f.m36186h0().m108666r()) {
                    c15449f.m36186h0().m108669v();
                }
                return Unit.f75682a;
            }
            c15449f.mo36208q(tvChannelLoadMoreResult.getAppendList());
            if (c15449f.m36186h0().m108666r()) {
                c15449f.m36186h0().m108667s();
            }
            if (!tvChannelLoadMoreResult.getHasMore()) {
                C27941f.m108652u(c15449f.m36186h0(), false, 1, null);
            }
            tVChannelHomeFragment.m68646W0(c15449f.getItemCount() == 0);
            return Unit.f75682a;
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final Unit m68637N0(TVChannelHomeFragment tVChannelHomeFragment, List list) {
        HashMap mapM96844g;
        Intrinsics.m97799e(list);
        tVChannelHomeFragment.countryList = list;
        if (list.isEmpty()) {
            return Unit.f75682a;
        }
        C24655b logViewConfig = tVChannelHomeFragment.getLogViewConfig();
        if (logViewConfig != null && !logViewConfig.m96846i()) {
            C24655b logViewConfig2 = tVChannelHomeFragment.getLogViewConfig();
            if (logViewConfig2 != null) {
                logViewConfig2.m96848k(true);
            }
            C24655b logViewConfig3 = tVChannelHomeFragment.getLogViewConfig();
            if (logViewConfig3 != null && (mapM96844g = logViewConfig3.m96844g()) != null) {
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O0 */
    public static final Unit m68638O0(TVChannelHomeFragment tVChannelHomeFragment, CountryItem countryItem) {
        C24666a0 c24666a0;
        ImageInfo countryFlagImage;
        if (tVChannelHomeFragment.m68640Q0() != null && (c24666a0 = (C24666a0) tVChannelHomeFragment.getMViewBinding()) != null) {
            TextView textView = c24666a0.f75367j;
            String countryName = countryItem != null ? countryItem.getCountryName() : null;
            if (countryName == null) {
                countryName = "";
            }
            textView.setText(countryName);
            String url = (countryItem == null || (countryFlagImage = countryItem.getCountryFlagImage()) == null) ? null : countryFlagImage.getUrl();
            if (url == null) {
                url = "";
            }
            if (TextUtils.isEmpty(url)) {
                c24666a0.f75362e.setImageResource(R$drawable.ic_tv_country_flag_default);
            } else {
                C23860f.a aVar = C23860f.f72909a;
                Context context = c24666a0.getRoot().getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94470i = aVar.m94457m(context).m94468g(url).m94473l(url).m94470i(R$drawable.ic_tv_country_flag_default);
                ShapeableImageView ivCountryFlag = c24666a0.f75362e;
                Intrinsics.m97801g(ivCountryFlag, "ivCountryFlag");
                bVarM94470i.m94465d(ivCountryFlag);
            }
            String timezone = countryItem != null ? countryItem.getTimezone() : null;
            if (timezone == null || timezone.length() == 0) {
                tVChannelHomeFragment.m68645V0();
                c24666a0.f75369l.setText("");
            } else {
                tVChannelHomeFragment.m68644U0(timezone);
            }
            return Unit.f75682a;
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: P0 */
    private final void m68639P0(TvChannelItem item, int position) {
        String url;
        StreamItem streamItem;
        FragmentActivity fragmentActivityM68640Q0 = m68640Q0();
        if (fragmentActivityM68640Q0 == null) {
            return;
        }
        HashMap map = new HashMap();
        List<StreamItem> streams = item.getStreams();
        if (streams == null || (streamItem = streams.get(0)) == null || (url = streamItem.getUrl()) == null) {
            url = "";
        }
        map.put("content_id", url);
        String title = item.getTitle();
        map.put("opt_title", title != null ? title : "");
        map.put(RequestParameters.POSITION, String.valueOf(position));
        C24662i.f75350a.m96882q("tv_channel", map, ClickType.CONTENT);
        if (TextUtils.isEmpty(item.getChannelId())) {
            C28951b.f88586a.m111455e("This page is unavailable");
        } else {
            Navigator.m61845x(TheRouter.m61773c("/home/tv_live_detail").m61857K(TmcStartParams.KEY_CHANNEL_ID, item.getChannelId()).m61857K("countryCode", item.getCountryCode()), fragmentActivityM68640Q0, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    private final FragmentActivity m68640Q0() {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            return null;
        }
        return activity;
    }

    /* JADX INFO: renamed from: R0 */
    private final void m68641R0() {
        if (this.countryList.isEmpty()) {
            return;
        }
        Fragment parentFragment = getParentFragment();
        BaseHomeSubFragment baseHomeSubFragment = parentFragment instanceof BaseHomeSubFragment ? (BaseHomeSubFragment) parentFragment : null;
        int iM27487c = AbstractC5806y.m27487c() - (baseHomeSubFragment != null ? baseHomeSubFragment.m68103h0() : 0);
        CountryItem countryItem = (CountryItem) m68627D0().m68543q().m14847f();
        TvCountrySelectDialog tvCountrySelectDialogM68569a = TvCountrySelectDialog.INSTANCE.m68569a(this.countryList, iM27487c, countryItem != null ? countryItem.getCountryCode() : null);
        tvCountrySelectDialogM68569a.m68567x0(new Function1() { // from class: com.transsion.home.tv.fragment.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TVChannelHomeFragment.m68642S0(this.f53493a, (CountryItem) obj);
            }
        });
        tvCountrySelectDialogM68569a.m68568y0(new Function0() { // from class: com.transsion.home.tv.fragment.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TVChannelHomeFragment.m68643T0();
            }
        });
        tvCountrySelectDialogM68569a.m65437l0(this, "tv_country_select");
        HashMap map = new HashMap();
        map.put("dialog_name", "country_select");
        C24662i.f75350a.m96884s("tv_channel", "dialog_show", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final Unit m68642S0(TVChannelHomeFragment tVChannelHomeFragment, CountryItem country) {
        Intrinsics.m97802h(country, "country");
        tVChannelHomeFragment.pendingScrollToTopAfterCountryChange = true;
        tVChannelHomeFragment.m68627D0().m68538B(country);
        HashMap map = new HashMap();
        String countryName = country.getCountryName();
        if (countryName == null) {
            countryName = "";
        }
        map.put("module_name", countryName);
        map.put("dialog_name", "country_select");
        C24662i.f75350a.m96882q("tv_channel", map, ClickType.FEATURE);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final Unit m68643T0() {
        HashMap map = new HashMap();
        map.put("module_name", "close");
        map.put("dialog_name", "country_select");
        C24662i.f75350a.m96882q("tv_channel", map, ClickType.FEATURE);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: U0 */
    private final void m68644U0(String timezone) {
        this.timeHandler.removeCallbacks(this.timeUpdateRunnable);
        this.currentTimezone = timezone;
        this.timeUpdateRunnable.run();
    }

    /* JADX INFO: renamed from: V0 */
    private final void m68645V0() {
        this.timeHandler.removeCallbacks(this.timeUpdateRunnable);
        this.currentTimezone = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W0 */
    private final void m68646W0(boolean showEmpty) {
        C24666a0 c24666a0 = (C24666a0) getMViewBinding();
        if (c24666a0 == null) {
            return;
        }
        c24666a0.f75359b.setVisibility(showEmpty ? 0 : 8);
        c24666a0.f75364g.setVisibility(showEmpty ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X0 */
    public final void m68647X0() {
        FragmentActivity fragmentActivityM68640Q0;
        C24666a0 c24666a0;
        String str = this.currentTimezone;
        if (str == null || (fragmentActivityM68640Q0 = m68640Q0()) == null || (c24666a0 = (C24666a0) getMViewBinding()) == null) {
            return;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm a", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(str));
            c24666a0.f75369l.setText(fragmentActivityM68640Q0.getString(R$string.home_tv_local_time, simpleDateFormat.format(new Date())));
        } catch (Exception e11) {
            C26866a.f81698a.m104915i("TVChannelHomeFragment", "updateLocalTime error: " + e11.getMessage(), false);
        }
    }

    private final void initExposureHelper() {
        if (this.exposureHelper != null) {
            return;
        }
        C25646b c25646b = new C25646b(0.6f, new C15474b(), false, 4, null);
        this.exposureHelper = c25646b;
        c25646b.m100946l(2);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public C24666a0 getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C24666a0 c24666a0M96894c = C24666a0.m96894c(inflater);
        Intrinsics.m97801g(c24666a0M96894c, "inflate(...)");
        return c24666a0M96894c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getLoadingView() {
        return LayoutInflater.from(requireContext()).inflate(R$layout.default_tv_live_home_skeleton_drawing_layout, (ViewGroup) getFlStateView(), false);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getNoNetworkView() {
        View noNetworkView = super.getNoNetworkView();
        NoNetworkBigView noNetworkBigView = noNetworkView instanceof NoNetworkBigView ? (NoNetworkBigView) noNetworkView : null;
        if (noNetworkBigView != null) {
            NoNetworkBigView.showTitle$default(noNetworkBigView, false, null, 2, null);
        }
        return noNetworkView;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        SwipeRefreshLayout swipeRefreshLayout;
        BLConstraintLayout bLConstraintLayout;
        C24666a0 c24666a0 = (C24666a0) getMViewBinding();
        if (c24666a0 != null && (bLConstraintLayout = c24666a0.f75360c) != null) {
            bLConstraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.tv.fragment.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TVChannelHomeFragment.m68628E0(this.f53488a, view);
                }
            });
        }
        C24666a0 c24666a1 = (C24666a0) getMViewBinding();
        if (c24666a1 == null || (swipeRefreshLayout = c24666a1.f75365h) == null) {
            return;
        }
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: com.transsion.home.tv.fragment.e
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
            /* JADX INFO: renamed from: a */
            public final void mo21823a() {
                TVChannelHomeFragment.m68629F0(this.f53496a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        Fragment parentFragment = getParentFragment();
        BaseHomeSubFragment baseHomeSubFragment = parentFragment instanceof BaseHomeSubFragment ? (BaseHomeSubFragment) parentFragment : null;
        if (baseHomeSubFragment == null) {
            C26866a.f81698a.m104915i("TVChannelHomeFragment", "initViewData hostFragment is null", true);
            return;
        }
        Bundle arguments = getArguments();
        C15449f c15449f = new C15449f(baseHomeSubFragment, new Function2() { // from class: com.transsion.home.tv.fragment.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TVChannelHomeFragment.m68630G0(this.f53498a, (TvChannelItem) obj, ((Integer) obj2).intValue());
            }
        }, arguments != null ? arguments.getInt("tab_id") : baseHomeSubFragment.getMTabId(), false, 0, new Function1() { // from class: com.transsion.home.tv.fragment.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TVChannelHomeFragment.m68631H0(this.f53500a, ((Integer) obj).intValue());
            }
        }, null, new Function0() { // from class: com.transsion.home.tv.fragment.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TVChannelHomeFragment.m68632I0(this.f53501a);
            }
        }, 88, null);
        this.channelAdapter = c15449f;
        C24666a0 c24666a0 = (C24666a0) getMViewBinding();
        if (c24666a0 != null && (recyclerView3 = c24666a0.f75364g) != null) {
            recyclerView3.setLayoutManager(new NpaLinearLayoutManager(recyclerView3.getContext()));
            recyclerView3.setItemAnimator(null);
            recyclerView3.setAdapter(c15449f);
        }
        initExposureHelper();
        C25646b c25646b = this.exposureHelper;
        if (c25646b != null) {
            C24666a0 c24666a1 = (C24666a0) getMViewBinding();
            if (c24666a1 != null && (recyclerView2 = c24666a1.f75364g) != null) {
                recyclerView2.removeOnScrollListener(c25646b);
            }
            C24666a0 c24666a2 = (C24666a0) getMViewBinding();
            if (c24666a2 != null && (recyclerView = c24666a2.f75364g) != null) {
                recyclerView.addOnScrollListener(c25646b);
            }
        }
        c15449f.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.home.tv.fragment.i
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                TVChannelHomeFragment.m68633J0(this.f53502a);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m68627D0().m68539m().m14851j(getViewLifecycleOwner(), new C15475c(new Function1() { // from class: com.transsion.home.tv.fragment.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TVChannelHomeFragment.m68637N0(this.f53503a, (List) obj);
            }
        }));
        m68627D0().m68543q().m14851j(getViewLifecycleOwner(), new C15475c(new Function1() { // from class: com.transsion.home.tv.fragment.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TVChannelHomeFragment.m68638O0(this.f53504a, (CountryItem) obj);
            }
        }));
        m68627D0().m68542p().m14851j(getViewLifecycleOwner(), new C15475c(new Function1() { // from class: com.transsion.home.tv.fragment.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TVChannelHomeFragment.m68634K0(this.f53505a, (TvChannelRefreshResult) obj);
            }
        }));
        m68627D0().m68541o().m14851j(getViewLifecycleOwner(), new C15475c(new Function1() { // from class: com.transsion.home.tv.fragment.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TVChannelHomeFragment.m68636M0(this.f53506a, (TvChannelLoadMoreResult) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isShowPageStateLayoutTitle() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadData() {
        showLoadingView();
        m68627D0().m68545t();
        this.loadStartTime = System.currentTimeMillis();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("tv_channel", false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.transsion.baseui.fragment.LazyFragment, com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        m68645V0();
        C25646b c25646b = this.exposureHelper;
        if (c25646b != null) {
            c25646b.m100943e();
        }
        this.channelAdapter = null;
        this.exposureHelper = null;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C25646b c25646b = this.exposureHelper;
        if (c25646b != null) {
            c25646b.m100943e();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        m68627D0().m68545t();
    }
}
