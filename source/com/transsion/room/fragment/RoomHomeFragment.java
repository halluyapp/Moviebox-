package com.transsion.room.fragment;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.AbstractC2397b;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.Lifecycle;
import androidx.p1005savedstate.InterfaceC4393e;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5775a;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.util.networkinfo.NetworkType;
import com.p282tn.lib.view.RoomCacheAnimationView;
import com.p282tn.lib.view.RoomCacheStatus;
import com.p282tn.lib.view.bubbleview.BubbleTextView;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$string;
import com.therouter.TheRouter;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.widget.GradientTextView;
import com.transsion.baseui.widget.NestedSwipeRefreshLayout;
import com.transsion.moviedetailapi.bean.RoomBean;
import com.transsion.moviedetailapi.bean.RoomItem;
import com.transsion.moviedetailapi.bean.RoomTabBean;
import com.transsion.moviedetailapi.bean.RoomTabItem;
import com.transsion.moviedetailapi.bean.RoomTabType;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.publish.bean.PublishResult;
import com.transsion.publish.view.UploadView;
import com.transsion.room.activity.RoomHomeActivity;
import com.transsion.room.api.RoomHomeCacheEvent;
import com.transsion.room.api.RoomHomeParentType;
import com.transsion.room.api.RoomHomeRefreshCacheEvent;
import com.transsion.room.api.RoomTabId;
import com.transsion.room.dialog.RequestCacheRoomDialog;
import com.transsion.room.view.RoomHomeTabTitleView;
import com.transsion.room.viewmodel.RoomViewModel;
import com.transsion.room.widget.CommunityRoomsView;
import com.transsion.usercenter.setting.labelsfeedback.AbstractC20825a;
import com.transsion.web.api.WebConstants;
import com.transsion.web.fragment.WebFragmentV2;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.JoinRoomEvent;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gp.InterfaceC23624b;
import gp.InterfaceC23625c;
import gq.C23655q;
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
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C25220y0;
import net.lucode.hackware.magicindicator.MagicIndicator;
import ng.AbstractC26006c;
import p415fq.C23420k;
import p415fq.InterfaceC23416g;
import p465hp.InterfaceC23888a;
import p550kj.C24655b;
import p550kj.C24662i;
import p743rh.C27287m;
import p913xm.C28615f;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 |2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001}B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\u0006J\u000f\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010\u0006J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010\u0006J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b*\u0010\u001bJ\u0019\u0010,\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0007H\u0016¢\u0006\u0004\b.\u0010\u0006J\u000f\u0010/\u001a\u00020\u0007H\u0016¢\u0006\u0004\b/\u0010\u0006J\u000f\u00100\u001a\u00020\u0007H\u0016¢\u0006\u0004\b0\u0010\u0006J\u000f\u00101\u001a\u00020\u0007H\u0016¢\u0006\u0004\b1\u0010\u0006J\u000f\u00102\u001a\u00020\u0007H\u0016¢\u0006\u0004\b2\u0010\u0006J\u000f\u00103\u001a\u00020\u0007H\u0016¢\u0006\u0004\b3\u0010\u0006J\u0017\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J-\u0010=\u001a\u00020\u00072\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u0002042\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00030;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00072\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u0011\u0010G\u001a\u0004\u0018\u00010FH\u0016¢\u0006\u0004\bG\u0010HJ\u0011\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bJ\u0010KJ\u0015\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00030;H\u0016¢\u0006\u0004\bL\u0010MJ\u0019\u0010O\u001a\u0004\u0018\u00010N2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u000204H\u0016¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0007H\u0016¢\u0006\u0004\bS\u0010\u0006J\u000f\u0010T\u001a\u00020\u0007H\u0016¢\u0006\u0004\bT\u0010\u0006J\u000f\u0010U\u001a\u00020\u0007H\u0016¢\u0006\u0004\bU\u0010\u0006R\u001b\u0010[\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010`\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R$\u0010d\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0006\u0012\u0004\u0018\u00010N0a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010g\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010j\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010l\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010iR\u0018\u0010n\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010iR\u0018\u0010p\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010iR\u0019\u0010v\u001a\u0004\u0018\u00010q8\u0006¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u001d\u0010{\u001a\u0004\u0018\u00010w8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010X\u001a\u0004\by\u0010z¨\u0006~"}, m97100d2 = {"Lcom/transsion/room/fragment/RoomHomeFragment;", "Lcom/transsion/room/fragment/RoomBaseFragment;", "Lgq/q;", "Lcom/transsion/moviedetailapi/bean/RoomTabItem;", "Lfq/g;", "<init>", "()V", "", "r1", "b1", "c1", "", "W0", "()Z", "T0", "m1", "w1", "loadData", "z1", "k1", "i1", "Landroid/content/Context;", "context", "A1", "(Landroid/content/Context;)V", "isTabClick", "t1", "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "X0", "(Landroid/view/LayoutInflater;)Lgq/q;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "lazyLoadData", "lazyLoadWithoutNet", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewData", "e", "pageFrom", "z", "(Ljava/lang/String;)V", "initViewModel", "initListener", TmcConstants.NAVIGATION_ON_START, "retryLoadData", "onResume", "q1", "", RequestParameters.POSITION, "v0", "(I)V", "Lcom/transsion/room/view/RoomHomeTabTitleView;", "tabView", "index", "", "tabList", "x0", "(Lcom/transsion/room/view/RoomHomeTabTitleView;ILjava/util/List;)V", "Lcom/transsion/publish/bean/PublishResult;", "eventBean", "u1", "(Lcom/transsion/publish/bean/PublishResult;)V", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Landroidx/viewpager2/widget/ViewPager2;", "z0", "()Landroidx/viewpager2/widget/ViewPager2;", "Lnet/lucode/hackware/magicindicator/MagicIndicator;", "u0", "()Lnet/lucode/hackware/magicindicator/MagicIndicator;", "y0", "()Ljava/util/List;", "Landroidx/fragment/app/Fragment;", "m0", "(I)Landroidx/fragment/app/Fragment;", "B", "()I", TmcStartParams.KEY_URL_SHORT, "G", "P", "Lcom/transsion/room/viewmodel/RoomViewModel;", "g", "Lkotlin/Lazy;", "V0", "()Lcom/transsion/room/viewmodel/RoomViewModel;", "mRoomViewModel", "h", "Lcom/transsion/publish/bean/PublishResult;", "i", "Landroidx/fragment/app/Fragment;", "mExploreFragment", "", "j", "Ljava/util/Map;", "mRefreshViewMap", CampaignEx.JSON_KEY_AD_K, "I", "mExplorePosition", "l", "Ljava/lang/String;", "insertPostId", "m", "insertPostOps", "n", "parentTypeName", "o", "cache", "Lcom/transsion/mb/config/manager/ConfigBean;", TtmlNode.TAG_P, "Lcom/transsion/mb/config/manager/ConfigBean;", "getRoomCacheOpen", "()Lcom/transsion/mb/config/manager/ConfigBean;", "roomCacheOpen", "Lhp/a;", CampaignEx.JSON_KEY_AD_Q, "U0", "()Lhp/a;", "mPublishedApi", CampaignEx.JSON_KEY_AD_R, "a", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class RoomHomeFragment extends RoomBaseFragment<C23655q, RoomTabItem> implements InterfaceC23416g {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: s */
    private static final String f59175s = "net_without_wifi_image_tab";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private PublishResult eventBean;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private Fragment mExploreFragment;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int mExplorePosition;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String insertPostId;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private String insertPostOps;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private String parentTypeName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy mRoomViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(RoomViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.room.fragment.RoomHomeFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.room.fragment.RoomHomeFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3227v0.c invoke() {
            C3227v0.c defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.m97801g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private Map mRefreshViewMap = new LinkedHashMap();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private String cache = C14496b.f50966a.m65344b().getString("room_cache_data", "");

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final ConfigBean roomCacheOpen = C28615f.f87796c.m110363a().m110360c("room_cache_open", true);

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final Lazy mPublishedApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.fragment.z0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RoomHomeFragment.m76952h1();
        }
    });

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomHomeFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ RoomHomeFragment m76978b(Companion companion, RoomHomeParentType roomHomeParentType, String str, String str2, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str = null;
            }
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            return companion.m76979a(roomHomeParentType, str, str2);
        }

        /* JADX INFO: renamed from: a */
        public final RoomHomeFragment m76979a(RoomHomeParentType parentType, String str, String str2) {
            Intrinsics.m97802h(parentType, "parentType");
            RoomHomeFragment roomHomeFragment = new RoomHomeFragment();
            roomHomeFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("post_id", str), TuplesKt.m97108a("ops", str2), TuplesKt.m97108a("parent_type", parentType.name())));
            return roomHomeFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomHomeFragment$b */
    public /* synthetic */ class C18075b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f59187a;

        static {
            int[] iArr = new int[NetworkType.values().length];
            try {
                iArr[NetworkType.NETWORK_2G.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkType.NETWORK_3G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkType.NETWORK_4G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NetworkType.NETWORK_5G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f59187a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomHomeFragment$c */
    public static final class C18076c extends ViewPager2.OnPageChangeCallback {
        C18076c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i11) {
            super.onPageScrollStateChanged(i11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            super.onPageScrolled(i11, f11, i12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            RoomCacheAnimationView roomCacheAnimationView;
            super.onPageSelected(i11);
            C23655q c23655q = (C23655q) RoomHomeFragment.this.getMViewBinding();
            if (c23655q == null || (roomCacheAnimationView = c23655q.f72294d) == null) {
                return;
            }
            roomCacheAnimationView.setVisibility(i11 == RoomHomeFragment.this.mExplorePosition && RoomHomeFragment.this.m76942W0() ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomHomeFragment$d */
    static final class C18077d implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59189a;

        C18077d(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59189a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59189a;
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
            this.f59189a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomHomeFragment$e */
    public static final class CountDownTimerC18078e extends CountDownTimer {
        CountDownTimerC18078e() {
            super(5000L, 1000L);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.CountDownTimer
        public void onFinish() {
            BubbleTextView bubbleTextView;
            C23655q c23655q = (C23655q) RoomHomeFragment.this.getMViewBinding();
            if (c23655q == null || (bubbleTextView = c23655q.f72292b) == null) {
                return;
            }
            AbstractC26006c.m102054g(bubbleTextView);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j11) {
        }
    }

    /* JADX INFO: renamed from: A1 */
    private final void m76920A1(Context context) {
        UploadView uploadView = new UploadView(context);
        uploadView.setPageName("room_home");
        if (!uploadView.getIsShow()) {
            uploadView.setVisibility(0);
            uploadView.setAlpha(1.0f);
            Activity activityM27311b = AbstractC5775a.m27311b();
            if (activityM27311b == null || activityM27311b.isFinishing() || activityM27311b.isDestroyed()) {
                activityM27311b = AbstractC5775a.m27311b();
            }
            if (activityM27311b == null || activityM27311b.isFinishing() || activityM27311b.isDestroyed()) {
                return;
            } else {
                uploadView.show(activityM27311b);
            }
        }
        uploadView.showFloatView(this.eventBean);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T0 */
    private final void m76939T0() {
        RoomCacheAnimationView roomCacheAnimationView;
        RoomCacheAnimationView roomCacheAnimationView2;
        String string = C14496b.f50966a.m65344b().getString("room_cache_data", "");
        this.cache = string;
        if (string == null || string.length() == 0) {
            C23655q c23655q = (C23655q) getMViewBinding();
            if (c23655q == null || (roomCacheAnimationView = c23655q.f72294d) == null) {
                return;
            }
            roomCacheAnimationView.setStatus(RoomCacheStatus.START);
            return;
        }
        C23655q c23655q2 = (C23655q) getMViewBinding();
        if (c23655q2 == null || (roomCacheAnimationView2 = c23655q2.f72294d) == null) {
            return;
        }
        roomCacheAnimationView2.setStatus(RoomCacheStatus.END);
    }

    /* JADX INFO: renamed from: U0 */
    private final InterfaceC23888a m76940U0() {
        return (InterfaceC23888a) this.mPublishedApi.getValue();
    }

    /* JADX INFO: renamed from: V0 */
    private final RoomViewModel m76941V0() {
        return (RoomViewModel) this.mRoomViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public final boolean m76942W0() {
        ConfigBean configBean = this.roomCacheOpen;
        String value = configBean != null ? configBean.getValue() : null;
        if (value != null && value.length() != 0) {
            ConfigBean configBean2 = this.roomCacheOpen;
            if (Intrinsics.m97797c(configBean2 != null ? configBean2.getValue() : null, "true")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final void m76943Y0(RoomHomeFragment roomHomeFragment, View view) {
        roomHomeFragment.m76974q1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final void m76944Z0(RoomHomeFragment roomHomeFragment, View view) {
        roomHomeFragment.m76974q1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final void m76945a1(RoomHomeFragment roomHomeFragment, View view) {
        String string = C14496b.f50966a.m65344b().getString("room_cache_data", "");
        if (string == null || string.length() == 0) {
            roomHomeFragment.m76965w1();
            return;
        }
        InterfaceC23624b interfaceC23624bM76776q0 = roomHomeFragment.m76776q0();
        if (interfaceC23624bM76776q0 != null) {
            interfaceC23624bM76776q0.mo93481n(roomHomeFragment.mExploreFragment);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b1 */
    private final void m76946b1() {
        RoomCacheAnimationView roomCacheAnimationView;
        RoomCacheAnimationView roomCacheAnimationView2;
        m76947c1();
        String str = this.cache;
        if (str == null || str.length() == 0) {
            C23655q c23655q = (C23655q) getMViewBinding();
            if (c23655q == null || (roomCacheAnimationView = c23655q.f72294d) == null) {
                return;
            }
            roomCacheAnimationView.setStatus(RoomCacheStatus.START);
            return;
        }
        C23655q c23655q2 = (C23655q) getMViewBinding();
        if (c23655q2 == null || (roomCacheAnimationView2 = c23655q2.f72294d) == null) {
            return;
        }
        roomCacheAnimationView2.setStatus(RoomCacheStatus.END);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c1 */
    private final void m76947c1() {
        RoomCacheAnimationView roomCacheAnimationView;
        RoomCacheAnimationView roomCacheAnimationView2;
        ConfigBean configBean = this.roomCacheOpen;
        String value = configBean != null ? configBean.getValue() : null;
        if (value != null && value.length() != 0) {
            ConfigBean configBean2 = this.roomCacheOpen;
            if (Intrinsics.m97797c(configBean2 != null ? configBean2.getValue() : null, "true")) {
                C23655q c23655q = (C23655q) getMViewBinding();
                if (c23655q == null || (roomCacheAnimationView2 = c23655q.f72294d) == null) {
                    return;
                }
                AbstractC26006c.m102058k(roomCacheAnimationView2);
                return;
            }
        }
        C23655q c23655q2 = (C23655q) getMViewBinding();
        if (c23655q2 == null || (roomCacheAnimationView = c23655q2.f72294d) == null) {
            return;
        }
        AbstractC26006c.m102054g(roomCacheAnimationView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final void m76948d1(RoomHomeFragment roomHomeFragment) {
        roomHomeFragment.m76961r1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e1 */
    public static final void m76949e1(RoomHomeFragment roomHomeFragment, AppBarLayout appBarLayout, int i11) {
        NestedSwipeRefreshLayout nestedSwipeRefreshLayout;
        C23655q c23655q = (C23655q) roomHomeFragment.getMViewBinding();
        if (c23655q == null || (nestedSwipeRefreshLayout = c23655q.f72297g) == null) {
            return;
        }
        nestedSwipeRefreshLayout.setEnabled(i11 >= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final Unit m76950f1(RoomHomeFragment roomHomeFragment, RoomTabBean roomTabBean) {
        List<RoomTabItem> items;
        List<RoomTabItem> items2;
        List<RoomTabItem> items3;
        String value;
        List<RoomTabItem> items4;
        NetworkType networkTypeM106328c = C27287m.f83003a.m106328c();
        int i11 = -1;
        int i12 = networkTypeM106328c == null ? -1 : C18075b.f59187a[networkTypeM106328c.ordinal()];
        int i13 = 0;
        if (i12 == 1 || i12 == 2 || i12 == 3 || i12 == 4) {
            ConfigBean configBeanM110355d = C28615f.m110355d(C28615f.f87796c.m110363a(), f59175s, false, 2, null);
            if ((configBeanM110355d == null || (value = configBeanM110355d.getValue()) == null) ? false : Boolean.parseBoolean(value)) {
                if (roomTabBean != null && (items3 = roomTabBean.getItems()) != null) {
                    Iterator<RoomTabItem> it = items3.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.m97797c(it.next().getTabId(), "images")) {
                            i11 = i13;
                            break;
                        }
                        i13++;
                    }
                    i13 = i11;
                } else if (roomTabBean != null && (items2 = roomTabBean.getItems()) != null) {
                    Iterator<RoomTabItem> it2 = items2.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.m97797c(it2.next().getTabId(), roomTabBean.getDefTabId())) {
                            i11 = i13;
                            break;
                        }
                        i13++;
                    }
                    i13 = i11;
                }
            } else if (roomTabBean != null && (items = roomTabBean.getItems()) != null) {
                Iterator<RoomTabItem> it3 = items.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.m97797c(it3.next().getTabId(), roomTabBean.getDefTabId())) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                }
                i13 = i11;
            }
        } else if (roomTabBean != null && (items4 = roomTabBean.getItems()) != null) {
            Iterator<RoomTabItem> it4 = items4.iterator();
            while (it4.hasNext()) {
                if (Intrinsics.m97797c(it4.next().getTabId(), roomTabBean.getDefTabId())) {
                    i11 = i13;
                    break;
                }
                i13++;
            }
            i13 = i11;
        }
        roomHomeFragment.m76781w0(i13);
        roomHomeFragment.initViewPager();
        roomHomeFragment.m76778s0();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g1 */
    public static final Unit m76951g1(RoomHomeFragment roomHomeFragment, RoomBean roomBean) {
        C23655q c23655q;
        CommunityRoomsView communityRoomsView;
        CommunityRoomsView communityRoomsView2;
        CommunityRoomsView communityRoomsView3;
        CommunityRoomsView communityRoomsView4;
        List<RoomItem> items = roomBean != null ? roomBean.getItems() : null;
        if (items != null && !items.isEmpty()) {
            C23655q c23655q2 = (C23655q) roomHomeFragment.getMViewBinding();
            if ((c23655q2 == null || (communityRoomsView4 = c23655q2.f72300j) == null || communityRoomsView4.getVisibility() != 0) && (c23655q = (C23655q) roomHomeFragment.getMViewBinding()) != null && (communityRoomsView = c23655q.f72300j) != null) {
                AbstractC26006c.m102058k(communityRoomsView);
            }
            C23655q c23655q3 = (C23655q) roomHomeFragment.getMViewBinding();
            if (c23655q3 != null && (communityRoomsView3 = c23655q3.f72300j) != null) {
                List<RoomItem> items2 = roomBean != null ? roomBean.getItems() : null;
                Intrinsics.m97799e(items2);
                communityRoomsView3.setList(items2);
            }
            C23655q c23655q4 = (C23655q) roomHomeFragment.getMViewBinding();
            if (c23655q4 != null && (communityRoomsView2 = c23655q4.f72300j) != null) {
                communityRoomsView2.setReportName("room_home", "room_home_community");
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final InterfaceC23888a m76952h1() {
        return (InterfaceC23888a) TheRouter.m61774d(InterfaceC23888a.class, new Object[0]);
    }

    /* JADX INFO: renamed from: i1 */
    private final void m76953i1() {
        Object context = getContext();
        if (context instanceof ComponentActivity) {
            Function1 function1 = new Function1() { // from class: com.transsion.room.fragment.q0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RoomHomeFragment.m76954j1(this.f59284a, (PublishResult) obj);
                }
            };
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = PublishResult.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.observeEvent((InterfaceC3224u) context, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final Unit m76954j1(RoomHomeFragment roomHomeFragment, PublishResult it) {
        Intrinsics.m97802h(it, "it");
        roomHomeFragment.m76976u1(it);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: k1 */
    private final void m76955k1() {
        Function1 function1 = new Function1() { // from class: com.transsion.room.fragment.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomHomeFragment.m76956l1(this.f59293a, (JoinRoomEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = JoinRoomEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l1 */
    public static final Unit m76956l1(RoomHomeFragment roomHomeFragment, JoinRoomEvent value) {
        CommunityRoomsView communityRoomsView;
        List<RoomItem> dataList;
        Object next;
        Context context;
        Intrinsics.m97802h(value, "value");
        if (value.getJoin()) {
            Context context2 = roomHomeFragment.getContext();
            if (context2 != null) {
                RoomViewModel.m77447u(roomHomeFragment.m76941V0(), context2, null, 0, 6, null);
            }
        } else {
            C23655q c23655q = (C23655q) roomHomeFragment.getMViewBinding();
            if (c23655q != null && (communityRoomsView = c23655q.f72300j) != null && (dataList = communityRoomsView.getDataList()) != null) {
                Iterator<T> it = dataList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.m97797c(((RoomItem) next).getGroupId(), value.getGroupId()));
                if (((RoomItem) next) != null && (context = roomHomeFragment.getContext()) != null) {
                    RoomViewModel.m77447u(roomHomeFragment.m76941V0(), context, null, 0, 6, null);
                }
            }
        }
        return Unit.f75682a;
    }

    private final void loadData() {
        Context context = getContext();
        if (context != null) {
            RoomViewModel.m77447u(m76941V0(), context, null, 0, 6, null);
        }
    }

    /* JADX INFO: renamed from: m1 */
    private final void m76957m1() {
        Function1 function1 = new Function1() { // from class: com.transsion.room.fragment.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomHomeFragment.m76958n1(this.f59287a, (RoomHomeCacheEvent) obj);
            }
        };
        AppScopeVMlProvider appScopeVMlProvider = AppScopeVMlProvider.INSTANCE;
        FlowEventBus flowEventBus = (FlowEventBus) appScopeVMlProvider.getApplicationScopeViewModel(FlowEventBus.class);
        String name = RoomHomeCacheEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        Lifecycle.State state = Lifecycle.State.CREATED;
        flowEventBus.observeEvent(this, name, state, C25220y0.m99269c().mo98454r(), false, function1);
        Function1 function2 = new Function1() { // from class: com.transsion.room.fragment.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomHomeFragment.m76959o1((RoomHomeRefreshCacheEvent) obj);
            }
        };
        FlowEventBus flowEventBus2 = (FlowEventBus) appScopeVMlProvider.getApplicationScopeViewModel(FlowEventBus.class);
        String name2 = RoomHomeRefreshCacheEvent.class.getName();
        Intrinsics.m97801g(name2, "getName(...)");
        flowEventBus2.observeEvent(this, name2, state, C25220y0.m99269c().mo98454r(), false, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n1 */
    public static final Unit m76958n1(RoomHomeFragment roomHomeFragment, RoomHomeCacheEvent it) {
        RoomCacheAnimationView roomCacheAnimationView;
        Intrinsics.m97802h(it, "it");
        C23655q c23655q = (C23655q) roomHomeFragment.getMViewBinding();
        if (c23655q != null && (roomCacheAnimationView = c23655q.f72294d) != null) {
            roomCacheAnimationView.setStatus(RoomCacheStatus.END);
        }
        roomHomeFragment.cache = C14496b.f50966a.m65344b().getString("room_cache_data", "");
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final Unit m76959o1(RoomHomeRefreshCacheEvent it) {
        Intrinsics.m97802h(it, "it");
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final void m76960p1(RoomHomeFragment roomHomeFragment) {
        ViewPager2 viewPager2Mo76784z0 = roomHomeFragment.mo76784z0();
        if (viewPager2Mo76784z0 != null) {
            viewPager2Mo76784z0.setCurrentItem(roomHomeFragment.m76774o0(), false);
        }
        C23420k.f71413a.m92987q(false);
    }

    /* JADX INFO: renamed from: r1 */
    private final void m76961r1() {
        loadData();
        m76939T0();
        InterfaceC4393e interfaceC4393e = (Fragment) this.mRefreshViewMap.get(Integer.valueOf(getMSelectTabIndex()));
        if (interfaceC4393e != null) {
            InterfaceC23625c interfaceC23625c = interfaceC4393e instanceof InterfaceC23625c ? (InterfaceC23625c) interfaceC4393e : null;
            if (interfaceC23625c != null) {
                interfaceC23625c.doRefresh(new Function0() { // from class: com.transsion.room.fragment.e1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RoomHomeFragment.m76962s1(this.f59250a);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s1 */
    public static final Unit m76962s1(RoomHomeFragment roomHomeFragment) {
        NestedSwipeRefreshLayout nestedSwipeRefreshLayout;
        C23655q c23655q;
        NestedSwipeRefreshLayout nestedSwipeRefreshLayout2;
        C23655q c23655q2 = (C23655q) roomHomeFragment.getMViewBinding();
        if (c23655q2 != null && (nestedSwipeRefreshLayout = c23655q2.f72297g) != null && nestedSwipeRefreshLayout.isRefreshing() && (c23655q = (C23655q) roomHomeFragment.getMViewBinding()) != null && (nestedSwipeRefreshLayout2 = c23655q.f72297g) != null) {
            nestedSwipeRefreshLayout2.setRefreshing(false);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: t1 */
    private final void m76963t1(boolean isTabClick) {
        String str;
        List<RoomTabItem> items;
        RoomTabItem roomTabItem;
        String tabId;
        Map mapM = MapsKt.m97578m(TuplesKt.m97108a("opt_type", isTabClick ? "tab_refresh" : "feed_error"));
        try {
            Result.Companion companion = Result.INSTANCE;
            RoomTabBean roomTabBean = (RoomTabBean) m76941V0().m77454G().m14847f();
            if (roomTabBean == null || (items = roomTabBean.getItems()) == null || (roomTabItem = items.get(getMSelectTabIndex())) == null || (tabId = roomTabItem.getTabId()) == null) {
                str = null;
            } else {
                str = (String) mapM.put("subpage_name", "room_home_" + tabId);
            }
            Result.m112707constructorimpl(str);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        C24662i.f75350a.m96881p("room_home", mapM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public static final void m76964v1(RoomHomeFragment roomHomeFragment) {
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        roomHomeFragment.m76920A1(applicationM27275a);
    }

    /* JADX INFO: renamed from: w1 */
    private final void m76965w1() {
        RequestCacheRoomDialog requestCacheRoomDialogM76764a = RequestCacheRoomDialog.INSTANCE.m76764a();
        requestCacheRoomDialogM76764a.m76763t0(new Function0() { // from class: com.transsion.room.fragment.u0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomHomeFragment.m76966x1(this.f59296a);
            }
        });
        Dialog dialog = requestCacheRoomDialogM76764a.getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
        requestCacheRoomDialogM76764a.m65435j0(new DialogInterface.OnDismissListener() { // from class: com.transsion.room.fragment.v0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                RoomHomeFragment.m76967y1(dialogInterface);
            }
        });
        requestCacheRoomDialogM76764a.m65436k0(getContext(), "room_cache_dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public static final Unit m76966x1(RoomHomeFragment roomHomeFragment) {
        C23655q c23655q;
        RoomCacheAnimationView roomCacheAnimationView;
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.no_network_toast);
            return Unit.f75682a;
        }
        InterfaceC23624b interfaceC23624bM76776q0 = roomHomeFragment.m76776q0();
        if (interfaceC23624bM76776q0 != null) {
            interfaceC23624bM76776q0.mo93474g(roomHomeFragment.mExploreFragment, false);
        }
        String str = roomHomeFragment.cache;
        if ((str == null || str.length() == 0) && (c23655q = (C23655q) roomHomeFragment.getMViewBinding()) != null && (roomCacheAnimationView = c23655q.f72294d) != null) {
            roomCacheAnimationView.setStatus(RoomCacheStatus.LOADING);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public static final void m76967y1(DialogInterface dialogInterface) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z1 */
    private final void m76968z1() {
        BubbleTextView bubbleTextView;
        C14496b c14496b = C14496b.f50966a;
        if (c14496b.m65344b().getBoolean("show_room_cache_guide", false) || !m76942W0()) {
            return;
        }
        CountDownTimerC18078e countDownTimerC18078e = new CountDownTimerC18078e();
        C23655q c23655q = (C23655q) getMViewBinding();
        if (c23655q != null && (bubbleTextView = c23655q.f72292b) != null) {
            AbstractC26006c.m102058k(bubbleTextView);
        }
        C23655q c23655q2 = (C23655q) getMViewBinding();
        if (c23655q2 == null || c23655q2.f72292b == null) {
            return;
        }
        countDownTimerC18078e.start();
        c14496b.m65344b().putBoolean("show_room_cache_guide", true);
    }

    @Override // p415fq.InterfaceC23416g
    /* JADX INFO: renamed from: B */
    public int mo76969B() {
        return getMSelectTabIndex();
    }

    @Override // p415fq.InterfaceC23416g
    /* JADX INFO: renamed from: G */
    public void mo76970G() {
        m76939T0();
    }

    @Override // p415fq.InterfaceC23416g
    /* JADX INFO: renamed from: P */
    public void mo76971P() {
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public C23655q getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23655q c23655qM93570c = C23655q.m93570c(inflater);
        Intrinsics.m97801g(c23655qM93570c, "inflate(...)");
        return c23655qM93570c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p415fq.InterfaceC23416g
    /* JADX INFO: renamed from: e */
    public void mo76973e(boolean isTabClick) {
        NestedSwipeRefreshLayout nestedSwipeRefreshLayout;
        AppBarLayout appBarLayout;
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.no_network_toast);
            return;
        }
        m76963t1(isTabClick);
        C23655q c23655q = (C23655q) getMViewBinding();
        if (c23655q != null && (appBarLayout = c23655q.f72293c) != null) {
            appBarLayout.setExpanded(true);
        }
        C23655q c23655q2 = (C23655q) getMViewBinding();
        if (c23655q2 != null && (nestedSwipeRefreshLayout = c23655q2.f72297g) != null) {
            nestedSwipeRefreshLayout.setRefreshing(true);
        }
        m76961r1();
    }

    @Override // com.transsion.room.fragment.RoomBaseFragment, com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        ViewPager2 viewPager2;
        RoomCacheAnimationView roomCacheAnimationView;
        GradientTextView gradientTextView;
        AppCompatImageView appCompatImageView;
        C23655q c23655q = (C23655q) getMViewBinding();
        if (c23655q != null && (appCompatImageView = c23655q.f72295e) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.fragment.p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RoomHomeFragment.m76943Y0(this.f59281a, view);
                }
            });
        }
        C23655q c23655q2 = (C23655q) getMViewBinding();
        if (c23655q2 != null && (gradientTextView = c23655q2.f72299i) != null) {
            gradientTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.fragment.x0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RoomHomeFragment.m76944Z0(this.f59304a, view);
                }
            });
        }
        C23655q c23655q3 = (C23655q) getMViewBinding();
        if (c23655q3 != null && (roomCacheAnimationView = c23655q3.f72294d) != null) {
            roomCacheAnimationView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.fragment.y0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RoomHomeFragment.m76945a1(this.f59308a, view);
                }
            });
        }
        C23655q c23655q4 = (C23655q) getMViewBinding();
        if (c23655q4 == null || (viewPager2 = c23655q4.f72301k) == null) {
            return;
        }
        viewPager2.registerOnPageChangeCallback(new C18076c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.room.fragment.RoomBaseFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        AppCompatImageView appCompatImageView;
        AppBarLayout appBarLayout;
        NestedSwipeRefreshLayout nestedSwipeRefreshLayout;
        C23655q c23655q = (C23655q) getMViewBinding();
        if (c23655q != null && (nestedSwipeRefreshLayout = c23655q.f72297g) != null) {
            nestedSwipeRefreshLayout.setProgressBackgroundColorSchemeColor(AbstractC2397b.getColor(nestedSwipeRefreshLayout.getContext(), R$color.bg_01));
            nestedSwipeRefreshLayout.setColorSchemeColors(AbstractC2397b.getColor(nestedSwipeRefreshLayout.getContext(), R$color.main_gradient_center), AbstractC2397b.getColor(nestedSwipeRefreshLayout.getContext(), R$color.main_gradient_start));
            nestedSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: com.transsion.room.fragment.a1
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
                /* JADX INFO: renamed from: a */
                public final void mo21823a() {
                    RoomHomeFragment.m76948d1(this.f59237a);
                }
            });
        }
        C23655q c23655q2 = (C23655q) getMViewBinding();
        if (c23655q2 != null && (appBarLayout = c23655q2.f72293c) != null) {
            appBarLayout.addOnOffsetChangedListener(new AppBarLayout.InterfaceC9956g() { // from class: com.transsion.room.fragment.b1
                @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC9951b
                public final void onOffsetChanged(AppBarLayout appBarLayout2, int i11) {
                    RoomHomeFragment.m76949e1(this.f59240a, appBarLayout2, i11);
                }
            });
        }
        C23655q c23655q3 = (C23655q) getMViewBinding();
        if (c23655q3 != null && (appCompatImageView = c23655q3.f72295e) != null && !(getActivity() instanceof RoomHomeActivity)) {
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = AbstractC20825a.m85772b(104);
            appCompatImageView.setLayoutParams(marginLayoutParams);
        }
        m76946b1();
    }

    @Override // com.transsion.room.fragment.RoomBaseFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        super.initViewModel();
        m76941V0().m77459v().m14851j(this, new C18077d(new Function1() { // from class: com.transsion.room.fragment.c1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomHomeFragment.m76951g1(this.f59243a, (RoomBean) obj);
            }
        }));
        m76941V0().m77454G().m14851j(this, new C18077d(new Function1() { // from class: com.transsion.room.fragment.d1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomHomeFragment.m76950f1(this.f59246a, (RoomTabBean) obj);
            }
        }));
        m76953i1();
        m76955k1();
        m76957m1();
    }

    @Override // com.transsion.room.fragment.RoomBaseFragment, com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadData() {
        m76941V0().m77455H();
        loadData();
    }

    @Override // com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadWithoutNet() {
        m76941V0().m77455H();
        loadData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.room.fragment.RoomBaseFragment
    /* JADX INFO: renamed from: m0 */
    public Fragment mo76772m0(int position) {
        List<RoomTabItem> items;
        RoomTabItem roomTabItem;
        Fragment fragmentMo93470c;
        C23655q c23655q;
        C23655q c23655q2;
        RoomCacheAnimationView roomCacheAnimationView;
        RoomCacheAnimationView roomCacheAnimationView2;
        try {
            RoomTabBean roomTabBean = (RoomTabBean) m76941V0().m77454G().m14847f();
            if (roomTabBean != null && (items = roomTabBean.getItems()) != null && (roomTabItem = items.get(position)) != null) {
                String tabId = roomTabItem.getTabId();
                if (Intrinsics.m97797c(tabId, RoomTabId.EXPLORE.getValue())) {
                    InterfaceC23624b interfaceC23624bM76776q0 = m76776q0();
                    fragmentMo93470c = interfaceC23624bM76776q0 != null ? interfaceC23624bM76776q0.mo93471d(this.parentTypeName, this.insertPostId, this.insertPostOps) : null;
                    this.mExplorePosition = position;
                    if (getMSelectTabIndex() == position && (((c23655q = (C23655q) getMViewBinding()) == null || (roomCacheAnimationView2 = c23655q.f72294d) == null || roomCacheAnimationView2.getVisibility() != 0) && m76942W0() && (c23655q2 = (C23655q) getMViewBinding()) != null && (roomCacheAnimationView = c23655q2.f72294d) != null)) {
                        AbstractC26006c.m102058k(roomCacheAnimationView);
                    }
                    this.mExploreFragment = fragmentMo93470c;
                    this.mRefreshViewMap.put(Integer.valueOf(position), fragmentMo93470c);
                } else if (Intrinsics.m97797c(tabId, RoomTabId.NEARBY.getValue())) {
                    InterfaceC23624b interfaceC23624bM76776q1 = m76776q0();
                    fragmentMo93470c = interfaceC23624bM76776q1 != null ? interfaceC23624bM76776q1.mo93479l(this.parentTypeName) : null;
                    this.mRefreshViewMap.put(Integer.valueOf(position), fragmentMo93470c);
                } else if (Intrinsics.m97797c(tabId, RoomTabId.DISCOVER.getValue())) {
                    InterfaceC23624b interfaceC23624bM76776q2 = m76776q0();
                    fragmentMo93470c = interfaceC23624bM76776q2 != null ? interfaceC23624bM76776q2.mo93469b(this.parentTypeName, roomTabItem, position) : null;
                    this.mRefreshViewMap.put(Integer.valueOf(position), fragmentMo93470c);
                } else if (Intrinsics.m97797c(roomTabItem.getType(), RoomTabType.H5.getValue())) {
                    WebFragmentV2 webFragmentV2M86707b = WebFragmentV2.INSTANCE.m86707b();
                    Pair pairM97108a = TuplesKt.m97108a("url", roomTabItem.getUrl());
                    Boolean bool = Boolean.TRUE;
                    webFragmentV2M86707b.setArguments(AbstractC2411d.m11891b(pairM97108a, TuplesKt.m97108a(WebConstants.FIELD_STATUS_BAR_HIDDEN, bool), TuplesKt.m97108a(WebConstants.FIELD_TOOL_BAR_HIDDEN, bool)));
                    fragmentMo93470c = webFragmentV2M86707b;
                } else {
                    InterfaceC23624b interfaceC23624bM76776q3 = m76776q0();
                    fragmentMo93470c = interfaceC23624bM76776q3 != null ? interfaceC23624bM76776q3.mo93470c(this.parentTypeName, roomTabItem, position) : null;
                    this.mRefreshViewMap.put(Integer.valueOf(position), fragmentMo93470c);
                }
                if (fragmentMo93470c != null) {
                    return fragmentMo93470c;
                }
            }
            InterfaceC23624b interfaceC23624bM76776q4 = m76776q0();
            Fragment fragmentMo93471d = interfaceC23624bM76776q4 != null ? interfaceC23624bM76776q4.mo93471d(this.parentTypeName, this.insertPostId, this.insertPostOps) : null;
            this.mExploreFragment = fragmentMo93471d;
            return fragmentMo93471d;
        } catch (Throwable unused) {
            InterfaceC23624b interfaceC23624bM76776q5 = m76776q0();
            Fragment fragmentMo93471d2 = interfaceC23624bM76776q5 != null ? interfaceC23624bM76776q5.mo93471d(this.parentTypeName, this.insertPostId, this.insertPostOps) : null;
            this.mExploreFragment = fragmentMo93471d2;
            return fragmentMo93471d2;
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("room_home", false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.insertPostId = arguments != null ? arguments.getString("post_id") : null;
        Bundle arguments2 = getArguments();
        this.insertPostOps = arguments2 != null ? arguments2.getString("ops") : null;
        Bundle arguments3 = getArguments();
        this.parentTypeName = arguments3 != null ? arguments3.getString("parent_type") : null;
    }

    @Override // com.transsion.baseui.fragment.LazyFragment, com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        ViewPager2 viewPager2Mo76784z0;
        super.onResume();
        m76968z1();
        m76947c1();
        if (!C23420k.f71413a.m92978f() || (viewPager2Mo76784z0 = mo76784z0()) == null) {
            return;
        }
        viewPager2Mo76784z0.postDelayed(new Runnable() { // from class: com.transsion.room.fragment.f1
            @Override // java.lang.Runnable
            public final void run() {
                RoomHomeFragment.m76960p1(this.f59252a);
            }
        }, 200L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    /* JADX INFO: renamed from: q1 */
    public void m76974q1() {
        InterfaceC23888a interfaceC23888aM76940U0;
        Context context = getContext();
        if (context == null || (interfaceC23888aM76940U0 = m76940U0()) == null) {
            return;
        }
        interfaceC23888aM76940U0.mo75358b(context);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        loadData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p415fq.InterfaceC23416g
    /* JADX INFO: renamed from: u */
    public void mo76975u() {
        RoomCacheAnimationView roomCacheAnimationView;
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.no_network_toast);
            return;
        }
        C23655q c23655q = (C23655q) getMViewBinding();
        if (c23655q != null && (roomCacheAnimationView = c23655q.f72294d) != null) {
            roomCacheAnimationView.setStatus(RoomCacheStatus.LOADING);
        }
        InterfaceC23624b interfaceC23624bM76776q0 = m76776q0();
        if (interfaceC23624bM76776q0 != null) {
            interfaceC23624bM76776q0.mo93474g(this.mExploreFragment, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.room.fragment.RoomBaseFragment
    /* JADX INFO: renamed from: u0 */
    public MagicIndicator mo76779u0() {
        C23655q c23655q = (C23655q) getMViewBinding();
        if (c23655q != null) {
            return c23655q.f72296f;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u1 */
    public final void m76976u1(PublishResult eventBean) {
        C23655q c23655q;
        AppCompatImageView appCompatImageView;
        this.eventBean = eventBean;
        Integer numValueOf = eventBean != null ? Integer.valueOf(eventBean.getState()) : null;
        if (numValueOf == null || numValueOf.intValue() != 0 || (c23655q = (C23655q) getMViewBinding()) == null || (appCompatImageView = c23655q.f72295e) == null) {
            return;
        }
        appCompatImageView.postDelayed(new Runnable() { // from class: com.transsion.room.fragment.w0
            @Override // java.lang.Runnable
            public final void run() {
                RoomHomeFragment.m76964v1(this.f59301a);
            }
        }, 1500L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.room.fragment.RoomBaseFragment
    /* JADX INFO: renamed from: v0 */
    public void mo76780v0(int position) {
        NestedSwipeRefreshLayout nestedSwipeRefreshLayout;
        C23655q c23655q = (C23655q) getMViewBinding();
        if (c23655q == null || (nestedSwipeRefreshLayout = c23655q.f72297g) == null) {
            return;
        }
        nestedSwipeRefreshLayout.setEnabled(this.mRefreshViewMap.containsKey(Integer.valueOf(position)));
    }

    @Override // com.transsion.room.fragment.RoomBaseFragment
    /* JADX INFO: renamed from: x0 */
    public void mo76782x0(RoomHomeTabTitleView tabView, int index, List tabList) {
        Intrinsics.m97802h(tabView, "tabView");
        Intrinsics.m97802h(tabList, "tabList");
        RoomTabItem roomTabItem = (RoomTabItem) tabList.get(index);
        tabView.setTitle(roomTabItem.getName());
        tabView.setBadge(roomTabItem);
    }

    @Override // com.transsion.room.fragment.RoomBaseFragment
    /* JADX INFO: renamed from: y0 */
    public List getMTabs() {
        List<RoomTabItem> items;
        ArrayList arrayList = new ArrayList();
        RoomTabBean roomTabBean = (RoomTabBean) m76941V0().m77454G().m14847f();
        if (roomTabBean != null && (items = roomTabBean.getItems()) != null) {
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                arrayList.add((RoomTabItem) it.next());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p415fq.InterfaceC23416g
    /* JADX INFO: renamed from: z */
    public void mo76977z(String pageFrom) {
        ViewPager2 viewPager2;
        HashMap mapM96844g;
        HashMap mapM96844g2;
        if (pageFrom != null && pageFrom.length() != 0) {
            C24655b logViewConfig = getLogViewConfig();
            if (logViewConfig != null && (mapM96844g2 = logViewConfig.m96844g()) != null) {
            }
            String str = getActivity() instanceof RoomHomeActivity ? "sub_page" : "main";
            C24655b logViewConfig2 = getLogViewConfig();
            if (logViewConfig2 != null && (mapM96844g = logViewConfig2.m96844g()) != null) {
            }
        }
        C23655q c23655q = (C23655q) getMViewBinding();
        if (c23655q == null || (viewPager2 = c23655q.f72301k) == null) {
            return;
        }
        viewPager2.setCurrentItem(m76773n0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.room.fragment.RoomBaseFragment
    /* JADX INFO: renamed from: z0 */
    public ViewPager2 mo76784z0() {
        C23655q c23655q = (C23655q) getMViewBinding();
        if (c23655q != null) {
            return c23655q.f72301k;
        }
        return null;
    }
}
