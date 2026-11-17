package com.transsion.home.fragment.home;

import android.app.Application;
import android.content.Intent;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3233y0;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import ck.AbstractC5114k;
import ck.C5110g;
import ck.C5117n;
import ck.C5118o;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.Utils;
import com.cloud.config.utils.XLogUtil;
import com.cloud.tmc.integration.constants.IntegrationConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.widget.TnTextView;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baselib.report.C14486e;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.baseui.widget.BlurredSectorView;
import com.transsion.baseui.widget.magicindicator.ORCommonNavigator;
import com.transsion.edcation.CourseManager;
import com.transsion.home.R$drawable;
import com.transsion.home.bean.AppTab;
import com.transsion.home.bean.BottomTabItem;
import com.transsion.home.bean.GradeGroup;
import com.transsion.home.bean.GradeItem;
import com.transsion.home.bean.HomePreferencesConfig;
import com.transsion.home.bean.HomePreferencesRefreshType;
import com.transsion.home.bean.HomeTabItem;
import com.transsion.home.fragment.dialog.CategoryDiscoverDialog;
import com.transsion.home.fragment.dialog.GradeSelectDialog;
import com.transsion.home.fragment.dialog.HomePreferencesEnterPopDialog;
import com.transsion.home.fragment.tab.BaseHomeSubFragment;
import com.transsion.home.fragment.tab.EmptyFragment;
import com.transsion.home.fragment.tab.MovieFragment;
import com.transsion.home.fragment.tab.SubShortTvFragment;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.home.fragment.tab.TopRoomFragment;
import com.transsion.home.fragment.tab.TrendingFragment;
import com.transsion.home.fragment.tab.TrendingUGCFragment;
import com.transsion.home.fragment.tab.TvChannelTabFragment;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.home.p1000enum.HomeTabType;
import com.transsion.home.viewmodel.HomePreferencesViewModel;
import com.transsion.home.viewmodel.preload.PreloadTrendingData;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.startup.pref.consume.AppStartReport;
import com.transsion.web.api.WebConstants;
import com.transsion.web.fragment.WebFragmentV2;
import com.transsnet.downloader.util.DownloadSDCardUtil;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k00.InterfaceC24549a;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import ng.AbstractC26006c;
import p550kj.C24662i;
import p552kl.C24696r;
import p723qx.InterfaceC27135b;
import p743rh.InterfaceC27288n;
import p842vl.C28121c;
import p842vl.C28123e;
import p910xj.C28607a;
import p913xm.C28615f;
import p983zl.C29191a;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u009e\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001jB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0004J!\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u000bJ\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u0019\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u0004J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010\u0004J\u0015\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u001a¢\u0006\u0004\b(\u0010\u001dJ\r\u0010)\u001a\u00020\t¢\u0006\u0004\b)\u0010\u0004J\u001d\u0010,\u001a\u00020\t2\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\f¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0007H\u0016¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u001a¢\u0006\u0004\b1\u00102J\u001d\u00105\u001a\u00020\t2\u0006\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020\u001a¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\t¢\u0006\u0004\b7\u0010\u0004J\u0015\u00109\u001a\b\u0012\u0004\u0012\u00020\"08H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\t2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\t2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b?\u0010>J\u000f\u0010@\u001a\u00020\tH\u0002¢\u0006\u0004\b@\u0010\u0004J\u000f\u0010A\u001a\u00020\tH\u0002¢\u0006\u0004\bA\u0010\u0004J\u000f\u0010B\u001a\u00020\tH\u0002¢\u0006\u0004\bB\u0010\u0004J\u000f\u0010C\u001a\u00020\tH\u0002¢\u0006\u0004\bC\u0010\u0004J\u0019\u0010E\u001a\u00020\t2\b\u0010D\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\bE\u0010FJ\u0019\u0010I\u001a\u00020\t2\b\u0010H\u001a\u0004\u0018\u00010GH\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\tH\u0002¢\u0006\u0004\bK\u0010\u0004J\u000f\u0010L\u001a\u00020\u001aH\u0002¢\u0006\u0004\bL\u00102J\u000f\u0010M\u001a\u00020\tH\u0002¢\u0006\u0004\bM\u0010\u0004J\u0017\u0010P\u001a\u00020O2\u0006\u0010N\u001a\u00020\fH\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\tH\u0002¢\u0006\u0004\bR\u0010\u0004J\u001f\u0010T\u001a\u00020\f2\u0006\u0010S\u001a\u00020\"2\u0006\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\tH\u0002¢\u0006\u0004\bV\u0010\u0004J\u000f\u0010W\u001a\u00020\tH\u0002¢\u0006\u0004\bW\u0010\u0004J\u001f\u0010Y\u001a\u00020\t2\u0006\u0010N\u001a\u00020\f2\u0006\u0010X\u001a\u00020\u001aH\u0002¢\u0006\u0004\bY\u0010ZJ\u001b\u0010^\u001a\u0004\u0018\u00010]2\b\u0010\\\u001a\u0004\u0018\u00010[H\u0002¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\tH\u0002¢\u0006\u0004\b`\u0010\u0004J\u0017\u0010b\u001a\u00020\t2\u0006\u0010a\u001a\u00020\fH\u0002¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\tH\u0002¢\u0006\u0004\bd\u0010\u0004J\u000f\u0010e\u001a\u00020\tH\u0002¢\u0006\u0004\be\u0010\u0004J\u0019\u0010h\u001a\u00020\t2\b\u0010g\u001a\u0004\u0018\u00010fH\u0002¢\u0006\u0004\bh\u0010iR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010n\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u001c\u0010r\u001a\b\u0012\u0002\b\u0003\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u001b\u0010x\u001a\u00020s8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u0016\u0010{\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010}\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010zR\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010zR\u0018\u0010\u0088\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010mR\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008d\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010mR\u0018\u0010\u008f\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010mR\u0018\u0010\u0091\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010zR\u001a\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001c\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006\u009f\u0001"}, m97100d2 = {"Lcom/transsion/home/fragment/home/HomeFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lkl/r;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "I0", "()I", "Landroid/view/LayoutInflater;", "inflater", "K0", "(Landroid/view/LayoutInflater;)Lkl/r;", "c1", "initData", "lazyLoadData", "Landroid/content/Intent;", "intent", "newIntent", "(Landroid/content/Intent;)V", "", "hidden", "onHiddenChanged", "(Z)V", "logPause", "logResume", "onResume", "onPause", "", "J0", "()Ljava/lang/String;", "onDestroyView", "onDestroy", "isWhite", "D0", "v1", "tabCode", "tabId", "u1", "(Ljava/lang/String;I)V", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "Y0", "()Z", "pageTabName", "isRefresh", "b1", "(Ljava/lang/String;Z)V", "x1", "", "L0", "()Ljava/util/List;", "Lcom/transsion/home/bean/HomePreferencesConfig;", XLogUtil.TAG, "N0", "(Lcom/transsion/home/bean/HomePreferencesConfig;)V", "n1", "g1", "X0", "R0", "y1", AppMeasurementSdk.ConditionalUserProperty.VALUE, "s1", "(Ljava/lang/String;)V", "Lcom/transsion/home/bean/AppTab;", "appTab", "z1", "(Lcom/transsion/home/bean/AppTab;)V", "Z0", "w1", "initViewPager", RequestParameters.POSITION, "Landroidx/fragment/app/Fragment;", "E0", "(I)Landroidx/fragment/app/Fragment;", "B0", "code", "H0", "(Ljava/lang/String;I)I", "e1", "k1", "smoothScroll", "d1", "(IZ)V", "", "navigator", "Landroid/widget/HorizontalScrollView;", "G0", "(Ljava/lang/Object;)Landroid/widget/HorizontalScrollView;", "l1", "scrollX", "O0", "(I)V", "q1", "a1", "Lcom/transsion/home/bean/HomeTabItem;", "tabItem", "M0", "(Lcom/transsion/home/bean/HomeTabItem;)V", "a", "Lcom/transsion/home/bean/AppTab;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "I", "mSelectTabIndex", "Lcom/transsion/home/fragment/tab/BaseHomeSubFragment;", "c", "Lcom/transsion/home/fragment/tab/BaseHomeSubFragment;", "trendingFragment", "Lcom/transsion/home/viewmodel/HomePreferencesViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lkotlin/Lazy;", "F0", "()Lcom/transsion/home/viewmodel/HomePreferencesViewModel;", "homePreferencesViewModel", "e", "Z", "viewPagerInitialized", "f", "lazyLoadAttempted", "Lcom/transsion/home/fragment/home/HomeSearchViewManager;", "g", "Lcom/transsion/home/fragment/home/HomeSearchViewManager;", "mHomeSearchViewManager", "h", "Landroid/os/Bundle;", "mSavedInstanceState", "i", "isHandlingRedirect", "j", "lastValidPosition", CampaignEx.JSON_KEY_AD_K, "Landroid/widget/HorizontalScrollView;", "cachedScrollView", "l", "lastTopTabScrollX", "m", "scrollStartSelectIndex", "n", "isTopTabScrolling", "", "o", "J", "resumeTimeStamp", "Landroid/os/Handler;", TtmlNode.TAG_P, "Landroid/os/Handler;", "scrollStopHandler", "Ljava/lang/Runnable;", CampaignEx.JSON_KEY_AD_Q, "Ljava/lang/Runnable;", "scrollStopRunnable", CampaignEx.JSON_KEY_AD_R, "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class HomeFragment extends BaseFragment<C24696r> {

    /* JADX INFO: renamed from: s */
    public static final int f52921s = 8;

    /* JADX INFO: renamed from: t */
    private static int f52922t;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private AppTab appTab;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mSelectTabIndex = f52922t;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private BaseHomeSubFragment trendingFragment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy homePreferencesViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean viewPagerInitialized;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean lazyLoadAttempted;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private HomeSearchViewManager mHomeSearchViewManager;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Bundle mSavedInstanceState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isHandlingRedirect;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int lastValidPosition;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private HorizontalScrollView cachedScrollView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int lastTopTabScrollX;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int scrollStartSelectIndex;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isTopTabScrolling;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private long resumeTimeStamp;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Handler scrollStopHandler;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private Runnable scrollStopRunnable;

    /* JADX INFO: renamed from: com.transsion.home.fragment.home.HomeFragment$b */
    public /* synthetic */ class C15227b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52940a;

        static {
            int[] iArr = new int[HomeTabType.values().length];
            try {
                iArr[HomeTabType.SUB_OPERATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeTabType.SUBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeTabType.H5TAB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeTabType.TRENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HomeTabType.SHORT_TV_TAB.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HomeTabType.SUB_ROOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HomeTabType.TV_CHANNEL_TAB.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f52940a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.home.HomeFragment$c */
    public static final class C15228c extends ViewPager2.OnPageChangeCallback {
        C15228c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final void m67944b(HomeFragment homeFragment, int i11) {
            MagicIndicator magicIndicator;
            C24696r mViewBinding = homeFragment.getMViewBinding();
            if (mViewBinding != null && (magicIndicator = mViewBinding.f75554k) != null) {
                magicIndicator.onPageSelected(i11);
            }
            homeFragment.m67891d1(i11, false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i11) {
            MagicIndicator magicIndicator;
            super.onPageScrollStateChanged(i11);
            C24696r mViewBinding = HomeFragment.this.getMViewBinding();
            if (mViewBinding == null || (magicIndicator = mViewBinding.f75554k) == null) {
                return;
            }
            magicIndicator.onPageScrollStateChanged(i11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            MagicIndicator magicIndicator;
            super.onPageScrolled(i11, f11, i12);
            C24696r mViewBinding = HomeFragment.this.getMViewBinding();
            if (mViewBinding == null || (magicIndicator = mViewBinding.f75554k) == null) {
                return;
            }
            magicIndicator.onPageScrolled(i11, f11, i12);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(final int i11) {
            MagicIndicator magicIndicator;
            String name;
            List<HomeTabItem> homeTabs;
            List<HomeTabItem> homeTabs2;
            super.onPageSelected(i11);
            if (HomeFragment.this.isHandlingRedirect || i11 < 0 || HomeFragment.this.mSelectTabIndex == i11) {
                return;
            }
            AppTab appTab = HomeFragment.this.appTab;
            HomeTabItem homeTabItem = (appTab == null || (homeTabs2 = appTab.getHomeTabs()) == null) ? null : homeTabs2.get(i11);
            if (homeTabItem == null || !homeTabItem.isOpenLandPage()) {
                HomeFragment.this.lastValidPosition = i11;
                C24696r mViewBinding = HomeFragment.this.getMViewBinding();
                if (mViewBinding != null && (magicIndicator = mViewBinding.f75554k) != null) {
                    final HomeFragment homeFragment = HomeFragment.this;
                    magicIndicator.post(new Runnable() { // from class: com.transsion.home.fragment.home.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            HomeFragment.C15228c.m67944b(homeFragment, i11);
                        }
                    });
                }
            } else {
                HomeFragment.this.isHandlingRedirect = true;
                AbstractC5114k.m23925h(homeTabItem.getUrl(), null, 1, null);
            }
            AppTab appTab2 = HomeFragment.this.appTab;
            HomeTabItem homeTabItem2 = (appTab2 == null || (homeTabs = appTab2.getHomeTabs()) == null) ? null : homeTabs.get(i11);
            C14450a c14450a = C14450a.f50860a;
            String strM67935J0 = HomeFragment.this.m67935J0();
            if (homeTabItem2 == null || (name = homeTabItem2.getName()) == null) {
                name = "";
            }
            c14450a.m65150n(strM67935J0, name);
            HomeFragment.this.mSelectTabIndex = i11;
            HomeFragment homeFragment2 = HomeFragment.this;
            homeFragment2.m67938b1(homeFragment2.m67935J0(), false);
            if (HomeFragment.this.isAdded()) {
                Fragment fragmentM14547k0 = HomeFragment.this.getChildFragmentManager().m14547k0("f" + HomeFragment.this.mSelectTabIndex);
                if (fragmentM14547k0 instanceof BaseHomeSubFragment) {
                    ((BaseHomeSubFragment) fragmentM14547k0).m68107o0();
                } else {
                    HomeFragment.this.m67933D0(false);
                }
            }
            if (Intrinsics.m97797c(homeTabItem2 != null ? homeTabItem2.getTabCode() : null, "Education") && HomeFragment.this.isAdded() && !HomeFragment.this.isDetached() && !HomeFragment.this.isRemoving()) {
                CourseManager courseManager = CourseManager.f51684a;
                FragmentManager supportFragmentManager = HomeFragment.this.requireActivity().getSupportFragmentManager();
                Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
                courseManager.m66447g(supportFragmentManager);
            }
            HomeFragment.this.m67942x1();
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.home.HomeFragment$d */
    public static final class C15229d extends FragmentStateAdapter {
        C15229d() {
            super(HomeFragment.this);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment createFragment(int i11) {
            return HomeFragment.this.m67868E0(i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<HomeTabItem> homeTabs;
            AppTab appTab = HomeFragment.this.appTab;
            if (appTab == null || (homeTabs = appTab.getHomeTabs()) == null) {
                return 0;
            }
            return homeTabs.size();
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.home.HomeFragment$e */
    static final class C15230e implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f52943a;

        C15230e(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f52943a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f52943a;
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
            this.f52943a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.home.HomeFragment$f */
    public static final class C15231f implements InterfaceC27288n {
        C15231f() {
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected() {
            InterfaceC27288n.a.m106338a(this);
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
            Intrinsics.m97802h(network, "network");
            Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
            HomeSearchViewManager homeSearchViewManager = HomeFragment.this.mHomeSearchViewManager;
            if (homeSearchViewManager != null) {
                homeSearchViewManager.m67980I(network, networkCapabilities);
            }
        }

        @Override // p743rh.InterfaceC27288n
        public void onDisconnected() {
        }
    }

    public HomeFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.home.fragment.home.HomeFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.homePreferencesViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(HomePreferencesViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.home.fragment.home.HomeFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.home.fragment.home.HomeFragment$special$$inlined$viewModels$default$3
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
        this.scrollStartSelectIndex = -1;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX INFO: renamed from: B0 */
    private final void m67866B0() {
        int i11;
        int i12;
        ViewPager2 viewPager2;
        MagicIndicator magicIndicator;
        ViewPager2 viewPager3;
        List<HomeTabItem> homeTabs;
        List<HomeTabItem> homeTabs2;
        BottomTabItem homeBottomTab;
        ViewPager2 viewPager4;
        C24696r mViewBinding = getMViewBinding();
        if (mViewBinding != null && (viewPager4 = mViewBinding.f75562s) != null) {
            viewPager4.registerOnPageChangeCallback(new C15228c());
        }
        AppTab appTab = this.appTab;
        String defaultSubTabCode = (appTab == null || (homeBottomTab = appTab.getHomeBottomTab()) == null) ? null : homeBottomTab.getDefaultSubTabCode();
        AppTab appTab2 = this.appTab;
        if (appTab2 == null || (homeTabs2 = appTab2.getHomeTabs()) == null) {
            i11 = -1;
            i12 = -1;
        } else {
            int i13 = 0;
            i11 = -1;
            i12 = -1;
            for (Object obj : homeTabs2) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    CollectionsKt.m97515u();
                }
                HomeTabItem homeTabItem = (HomeTabItem) obj;
                if (defaultSubTabCode != null) {
                    if (Intrinsics.m97797c(defaultSubTabCode, homeTabItem != null ? homeTabItem.getTabCode() : null)) {
                        i12 = i13;
                    }
                }
                if (Intrinsics.m97797c(homeTabItem != null ? homeTabItem.getType() : null, HomeTabType.TRENDING.getValue())) {
                    i11 = i13;
                }
                if (homeTabItem != null ? Intrinsics.m97797c(homeTabItem.isEducationTab(), Boolean.TRUE) : false) {
                    HomeTabId.INSTANCE.m67533a(homeTabItem.getTabId());
                }
                i13 = i14;
            }
        }
        if (i12 >= 0) {
            i11 = i12;
        }
        f52922t = i11;
        Bundle bundle = this.mSavedInstanceState;
        int i15 = bundle != null ? bundle.getInt("current_tab", -1) : -1;
        if (i15 < 0) {
            i15 = f52922t;
        } else {
            AppTab appTab3 = this.appTab;
            if (i15 >= ((appTab3 == null || (homeTabs = appTab3.getHomeTabs()) == null) ? 0 : homeTabs.size())) {
                i15 = f52922t;
            }
        }
        this.mSelectTabIndex = i15;
        C24696r mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (viewPager3 = mViewBinding2.f75562s) != null) {
            viewPager3.setCurrentItem(this.mSelectTabIndex, false);
        }
        C24696r mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (magicIndicator = mViewBinding3.f75554k) != null) {
            magicIndicator.post(new Runnable() { // from class: com.transsion.home.fragment.home.c
                @Override // java.lang.Runnable
                public final void run() {
                    HomeFragment.m67867C0(this.f52968a);
                }
            });
        }
        C24696r mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (viewPager2 = mViewBinding4.f75562s) != null) {
            viewPager2.setOffscreenPageLimit(1);
        }
        m67942x1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final void m67867C0(HomeFragment homeFragment) {
        MagicIndicator magicIndicator;
        C24696r mViewBinding = homeFragment.getMViewBinding();
        if (mViewBinding != null && (magicIndicator = mViewBinding.f75554k) != null) {
            magicIndicator.onPageSelected(homeFragment.mSelectTabIndex);
        }
        homeFragment.m67938b1(homeFragment.m67935J0(), true);
        homeFragment.m67907l1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public final Fragment m67868E0(int position) {
        Integer tabId;
        Integer tabId2;
        Integer tabId3;
        Integer tabId4;
        Integer tabId5;
        int iIntValue;
        Integer tabId6;
        Integer tabId7;
        List<HomeTabItem> homeTabs;
        int iIntValue2 = 1;
        AppTab appTab = this.appTab;
        HomeTabItem homeTabItem = (appTab == null || (homeTabs = appTab.getHomeTabs()) == null) ? null : homeTabs.get(position);
        C26866a.a aVar = C26866a.f81698a;
        aVar.m104912c("HomeFragment", "getFragment: " + (homeTabItem != null ? homeTabItem.getType() : null) + "&position:" + position + "&tabCode:" + (homeTabItem != null ? homeTabItem.getTabCode() : null) + "&displayType:" + (homeTabItem != null ? homeTabItem.getDisplayType() : null), true);
        HomeTabType.Companion companion = HomeTabType.INSTANCE;
        if (companion.m67540a(homeTabItem != null ? homeTabItem.getType() : null) == HomeTabType.SUB_NOVEL) {
            C28607a c28607a = C28607a.f87785a;
            Application applicationM27275a = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a, "getApp(...)");
            c28607a.m110337d(applicationM27275a);
        }
        if (homeTabItem != null && homeTabItem.isOpenLandPage()) {
            C26866a.a.m104898f(aVar, "HomeFragment", "getFragment isOpenLandPage", false, 4, null);
            return new EmptyFragment();
        }
        HomeTabType homeTabTypeM67540a = companion.m67540a(homeTabItem != null ? homeTabItem.getType() : null);
        switch (homeTabTypeM67540a == null ? -1 : C15227b.f52940a[homeTabTypeM67540a.ordinal()]) {
            case 1:
                SubTabFragment.Companion c15309a = SubTabFragment.INSTANCE;
                if (homeTabItem != null && (tabId = homeTabItem.getTabId()) != null) {
                    iIntValue2 = tabId.intValue();
                }
                return c15309a.m68283b(iIntValue2, homeTabItem != null ? homeTabItem.getTabCode() : null);
            case 2:
                MovieFragment.Companion companion2 = MovieFragment.INSTANCE;
                if (homeTabItem != null && (tabId2 = homeTabItem.getTabId()) != null) {
                    iIntValue2 = tabId2.intValue();
                }
                return MovieFragment.Companion.m68202b(companion2, iIntValue2, false, null, homeTabItem != null ? homeTabItem.getTabCode() : null, 6, null);
            case 3:
                WebFragmentV2 webFragmentV2M86707b = WebFragmentV2.INSTANCE.m86707b();
                Pair pairM97108a = TuplesKt.m97108a("url", homeTabItem != null ? homeTabItem.getUrl() : null);
                Boolean bool = Boolean.TRUE;
                webFragmentV2M86707b.setArguments(AbstractC2411d.m11891b(pairM97108a, TuplesKt.m97108a(WebConstants.FIELD_TOOL_BAR_HIDDEN, bool), TuplesKt.m97108a(WebConstants.TAB_CODE, homeTabItem != null ? homeTabItem.getTabCode() : null), TuplesKt.m97108a(WebConstants.NEED_HEADER, bool), TuplesKt.m97108a("nested_scroll_intercept", bool), TuplesKt.m97108a(WebConstants.HEADER_BG, Integer.valueOf(R$drawable.home_title_gradient_bg))));
                return webFragmentV2M86707b;
            case 4:
                C5110g c5110g = C5110g.f17601a;
                if ((c5110g.m23911b() && (this.trendingFragment instanceof TrendingFragment)) || (!c5110g.m23911b() && (this.trendingFragment instanceof TrendingUGCFragment))) {
                    this.trendingFragment = null;
                }
                BaseHomeSubFragment baseHomeSubFragment = this.trendingFragment;
                if (baseHomeSubFragment != null) {
                    return baseHomeSubFragment;
                }
                if (c5110g.m23911b()) {
                    TrendingUGCFragment.Companion c15326a = TrendingUGCFragment.INSTANCE;
                    if (homeTabItem != null && (tabId4 = homeTabItem.getTabId()) != null) {
                        iIntValue2 = tabId4.intValue();
                    }
                    TrendingUGCFragment trendingUGCFragmentM68464a = c15326a.m68464a(iIntValue2, homeTabItem != null ? homeTabItem.getTabCode() : null);
                    this.trendingFragment = trendingUGCFragmentM68464a;
                    return trendingUGCFragmentM68464a;
                }
                TrendingFragment.Companion c15315a = TrendingFragment.INSTANCE;
                if (homeTabItem != null && (tabId3 = homeTabItem.getTabId()) != null) {
                    iIntValue2 = tabId3.intValue();
                }
                TrendingFragment trendingFragmentM68393a = c15315a.m68393a(iIntValue2, homeTabItem != null ? homeTabItem.getTabCode() : null);
                this.trendingFragment = trendingFragmentM68393a;
                return trendingFragmentM68393a;
            case 5:
                return SubShortTvFragment.INSTANCE.m68222a((homeTabItem == null || (tabId5 = homeTabItem.getTabId()) == null) ? 13 : tabId5.intValue());
            case 6:
                return new TopRoomFragment();
            case 7:
                TvChannelTabFragment.Companion c15334a = TvChannelTabFragment.INSTANCE;
                if (homeTabItem == null || (tabId6 = homeTabItem.getTabId()) == null) {
                    iIntValue = C5110g.f17601a.m23911b() ? 1033 : 42;
                } else {
                    iIntValue = tabId6.intValue();
                }
                return c15334a.m68468a(iIntValue);
            default:
                MovieFragment.Companion companion3 = MovieFragment.INSTANCE;
                if (homeTabItem != null && (tabId7 = homeTabItem.getTabId()) != null) {
                    iIntValue2 = tabId7.intValue();
                }
                return MovieFragment.Companion.m68202b(companion3, iIntValue2, false, null, homeTabItem != null ? homeTabItem.getTabCode() : null, 6, null);
        }
    }

    /* JADX INFO: renamed from: F0 */
    private final HomePreferencesViewModel m67869F0() {
        return (HomePreferencesViewModel) this.homePreferencesViewModel.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    /* JADX INFO: renamed from: G0 */
    private final HorizontalScrollView m67870G0(Object navigator) {
        HorizontalScrollView horizontalScrollView;
        LinearLayout titleContainer;
        boolean z11 = navigator instanceof CommonNavigator;
        if (z11) {
            try {
                Field declaredField = CommonNavigator.class.getDeclaredField("a");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(navigator);
                if (obj instanceof HorizontalScrollView) {
                    horizontalScrollView = (HorizontalScrollView) obj;
                } else {
                    horizontalScrollView = null;
                }
            } catch (Exception e11) {
                C26866a.a.m104898f(C26866a.f81698a, "HomeFragment", "setupTopTabScrollListener: failed to get scrollView from CommonNavigator, " + e11.getMessage(), false, 4, null);
            }
        } else if (navigator instanceof ORCommonNavigator) {
            try {
                Field declaredField2 = ORCommonNavigator.class.getDeclaredField("a");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(navigator);
                if (obj2 instanceof HorizontalScrollView) {
                    horizontalScrollView = (HorizontalScrollView) obj2;
                } else {
                    horizontalScrollView = null;
                }
            } catch (Exception e12) {
                C26866a.a.m104898f(C26866a.f81698a, "HomeFragment", "setupTopTabScrollListener: failed to get scrollView from ORCommonNavigator, " + e12.getMessage(), false, 4, null);
            }
        } else {
            horizontalScrollView = null;
        }
        if (horizontalScrollView != null) {
            return horizontalScrollView;
        }
        if (z11) {
            titleContainer = ((CommonNavigator) navigator).getTitleContainer();
        } else {
            titleContainer = navigator instanceof ORCommonNavigator ? ((ORCommonNavigator) navigator).getTitleContainer() : null;
        }
        ViewParent parent = titleContainer != null ? titleContainer.getParent() : null;
        while (parent != null && !(parent instanceof HorizontalScrollView)) {
            parent = parent.getParent();
        }
        return parent instanceof HorizontalScrollView ? (HorizontalScrollView) parent : null;
    }

    /* JADX INFO: renamed from: H0 */
    private final int m67871H0(String code, int tabId) {
        List<HomeTabItem> homeTabs;
        AppTab appTab;
        List<HomeTabItem> homeTabs2;
        Integer tabId2;
        int i11 = 0;
        if (tabId >= 0 && (appTab = this.appTab) != null && (homeTabs2 = appTab.getHomeTabs()) != null) {
            int i12 = 0;
            for (Object obj : homeTabs2) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.m97515u();
                }
                HomeTabItem homeTabItem = (HomeTabItem) obj;
                if (homeTabItem != null && (tabId2 = homeTabItem.getTabId()) != null && tabId2.intValue() == tabId) {
                    return i12;
                }
                i12 = i13;
            }
        }
        AppTab appTab2 = this.appTab;
        if (appTab2 != null && (homeTabs = appTab2.getHomeTabs()) != null) {
            for (Object obj2 : homeTabs) {
                int i14 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                HomeTabItem homeTabItem2 = (HomeTabItem) obj2;
                if (Intrinsics.m97797c(homeTabItem2 != null ? homeTabItem2.getTabCode() : null, code)) {
                    return i11;
                }
                i11 = i14;
            }
        }
        return f52922t;
    }

    /* JADX INFO: renamed from: L0 */
    private final List m67872L0() {
        String name;
        List<HomeTabItem> homeTabs;
        ArrayList arrayList = new ArrayList();
        C24696r mViewBinding = getMViewBinding();
        MagicIndicator magicIndicator = mViewBinding != null ? mViewBinding.f75554k : null;
        InterfaceC24549a navigator = magicIndicator != null ? magicIndicator.getNavigator() : null;
        if (this.appTab != null && navigator != null) {
            LinearLayout titleContainer = navigator instanceof CommonNavigator ? ((CommonNavigator) navigator).getTitleContainer() : navigator instanceof ORCommonNavigator ? ((ORCommonNavigator) navigator).getTitleContainer() : null;
            if (titleContainer == null) {
                return arrayList;
            }
            HorizontalScrollView horizontalScrollViewM67870G0 = this.cachedScrollView;
            if (horizontalScrollViewM67870G0 == null) {
                horizontalScrollViewM67870G0 = m67870G0(navigator);
            }
            int scrollX = horizontalScrollViewM67870G0 != null ? horizontalScrollViewM67870G0.getScrollX() : 0;
            int width = horizontalScrollViewM67870G0 != null ? horizontalScrollViewM67870G0.getWidth() : titleContainer.getMeasuredWidth();
            int childCount = titleContainer.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = titleContainer.getChildAt(i11);
                AppTab appTab = this.appTab;
                HomeTabItem homeTabItem = (appTab == null || (homeTabs = appTab.getHomeTabs()) == null) ? null : (HomeTabItem) CollectionsKt.m97362l0(homeTabs, i11);
                int left = childAt.getLeft() - scrollX;
                int right = childAt.getRight() - scrollX;
                if (left < width && right > 0 && homeTabItem != null && (name = homeTabItem.getName()) != null) {
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a0 A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x0011, B:9:0x0016, B:11:0x001c, B:13:0x0024, B:17:0x002d, B:22:0x003c, B:25:0x0044, B:27:0x004a, B:29:0x0056, B:31:0x005a, B:33:0x0060, B:36:0x0068, B:39:0x007e, B:41:0x0092, B:43:0x0096, B:45:0x00bd, B:44:0x00a0, B:20:0x0038), top: B:52:0x0003 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x00a0, please report this as an issue */
    /* JADX INFO: renamed from: M0 */
    private final void m67873M0(HomeTabItem tabItem) {
        Object objM112707constructorimpl;
        Integer numValueOf;
        ViewPager2 viewPager2;
        ViewPager2 viewPager3;
        RecyclerView.Adapter adapter;
        List<HomeTabItem> homeTabs;
        if (tabItem == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            AppTab appTab = this.appTab;
            Unit unit = null;
            if (appTab == null || (homeTabs = appTab.getHomeTabs()) == null) {
                numValueOf = null;
            } else {
                Iterator<HomeTabItem> it = homeTabs.iterator();
                int i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    HomeTabItem next = it.next();
                    if (Intrinsics.m97797c(next != null ? next.getTabId() : null, tabItem.getTabId())) {
                        break;
                    } else {
                        i11++;
                    }
                }
                numValueOf = Integer.valueOf(i11);
            }
            if (numValueOf == null || numValueOf.intValue() < 0) {
                C26866a.a.m104898f(C26866a.f81698a, "HomeFragment", "Category not found in current tabs: " + tabItem, false, 4, null);
                unit = Unit.f75682a;
            } else {
                int iIntValue = numValueOf.intValue();
                C24696r mViewBinding = getMViewBinding();
                if (iIntValue < ((mViewBinding == null || (viewPager3 = mViewBinding.f75562s) == null || (adapter = viewPager3.getAdapter()) == null) ? 0 : adapter.getItemCount())) {
                    HashMap map = new HashMap();
                    map.put("dialog_name", "home_switch_tab");
                    String name = tabItem.getName();
                    if (name == null) {
                        name = "";
                    }
                    map.put("module_name", name);
                    C24662i.f75350a.m96881p(m67935J0(), map);
                    C24696r mViewBinding2 = getMViewBinding();
                    if (mViewBinding2 != null && (viewPager2 = mViewBinding2.f75562s) != null) {
                        viewPager2.setCurrentItem(numValueOf.intValue(), false);
                        unit = Unit.f75682a;
                    }
                } else {
                    C26866a.a.m104898f(C26866a.f81698a, "HomeFragment", "Category not found in current tabs: " + tabItem, false, 4, null);
                    unit = Unit.f75682a;
                }
            }
            objM112707constructorimpl = Result.m112707constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.a.m104898f(C26866a.f81698a, "HomeFragment", "handleCategorySelection: failed to find tab, " + thM112710exceptionOrNullimpl.getMessage(), false, 4, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    /* JADX INFO: renamed from: N0 */
    private final void m67874N0(HomePreferencesConfig config) {
        HomeTabItem homeTabItem;
        ViewPager2 viewPager2;
        String refreshType = config.getRefreshType();
        if (Intrinsics.m97797c(refreshType, HomePreferencesRefreshType.ALL_TOP_TAB.getValue())) {
            String tabCode = config.getTabCode();
            Integer tabId = config.getTabId();
            if (m67871H0(tabCode, tabId != null ? tabId.intValue() : -1) < 0) {
                return;
            }
            C26866a.a.m104898f(C26866a.f81698a, "HomePreferences", "refresh all tab----2", false, 4, null);
            m67939c1();
            C29191a c29191a = new C29191a();
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = C29191a.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.postEvent(name, c29191a, 0L);
            return;
        }
        if (!Intrinsics.m97797c(refreshType, HomePreferencesRefreshType.CUR_PAGE.getValue())) {
            Intrinsics.m97797c(refreshType, HomePreferencesRefreshType.NO_REFRESH.getValue());
            return;
        }
        AppTab appTab = this.appTab;
        List<HomeTabItem> homeTabs = appTab != null ? appTab.getHomeTabs() : null;
        int iM67871H0 = this.mSelectTabIndex;
        if (iM67871H0 < 0) {
            homeTabItem = null;
        } else {
            if (iM67871H0 >= (homeTabs != null ? homeTabs.size() : 0) || homeTabs == null) {
                homeTabItem = null;
            } else {
                homeTabItem = homeTabs.get(iM67871H0);
            }
        }
        boolean zH = StringsKt.m98227H(homeTabItem != null ? homeTabItem.getTabCode() : null, config.getTabCode(), true);
        if (!zH) {
            String tabCode2 = config.getTabCode();
            Integer tabId2 = config.getTabId();
            iM67871H0 = m67871H0(tabCode2, tabId2 != null ? tabId2.intValue() : -1);
        }
        if (iM67871H0 < 0) {
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "HomePreferences", "refresh cur page----2", false, 4, null);
        if (!zH) {
            C24696r mViewBinding = getMViewBinding();
            if (mViewBinding != null && (viewPager2 = mViewBinding.f75562s) != null) {
                viewPager2.setCurrentItem(iM67871H0, false);
            }
            this.mSelectTabIndex = iM67871H0;
        }
        m67939c1();
        Fragment fragmentM14547k0 = getChildFragmentManager().m14547k0("f" + iM67871H0);
        if (fragmentM14547k0 instanceof BaseHomeSubFragment) {
            ((BaseHomeSubFragment) fragmentM14547k0).mo67722c0();
        }
    }

    /* JADX INFO: renamed from: O0 */
    private final void m67875O0(int scrollX) {
        Handler handler;
        if (scrollX != this.lastTopTabScrollX) {
            if (!this.isTopTabScrolling) {
                this.scrollStartSelectIndex = this.mSelectTabIndex;
                this.isTopTabScrolling = true;
            }
            Runnable runnable = this.scrollStopRunnable;
            if (runnable != null && (handler = this.scrollStopHandler) != null) {
                handler.removeCallbacks(runnable);
            }
            this.scrollStopRunnable = new Runnable() { // from class: com.transsion.home.fragment.home.i
                @Override // java.lang.Runnable
                public final void run() {
                    HomeFragment.m67876P0(this.f52978a);
                }
            };
            Handler handler2 = new Handler(Looper.getMainLooper());
            this.scrollStopHandler = handler2;
            Runnable runnable2 = this.scrollStopRunnable;
            if (runnable2 != null) {
                handler2.postDelayed(runnable2, 100L);
            }
        } else if (this.isTopTabScrolling) {
            this.isTopTabScrolling = false;
            this.scrollStartSelectIndex = this.mSelectTabIndex;
        }
        this.lastTopTabScrollX = scrollX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final void m67876P0(HomeFragment homeFragment) {
        homeFragment.isTopTabScrolling = false;
        String strM67935J0 = homeFragment.m67935J0();
        if (strM67935J0.length() > 0) {
            homeFragment.m67938b1(strM67935J0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final Unit m67877Q0(HomeFragment homeFragment, C5117n value) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        ViewPager2 viewPager2;
        Intrinsics.m97802h(value, "value");
        String strM23938a = value.m23938a();
        boolean z11 = strM23938a == null || strM23938a.length() == 0;
        C24696r mViewBinding = homeFragment.getMViewBinding();
        if (mViewBinding != null && (viewPager2 = mViewBinding.f75562s) != null) {
            viewPager2.setUserInputEnabled(z11);
        }
        if (z11) {
            HomeSearchViewManager homeSearchViewManager = homeFragment.mHomeSearchViewManager;
            if (homeSearchViewManager != null) {
                homeSearchViewManager.m67977C(homeFragment.appTab);
            }
        } else {
            HomeSearchViewManager homeSearchViewManager2 = homeFragment.mHomeSearchViewManager;
            if (homeSearchViewManager2 != null) {
                homeSearchViewManager2.m67985n();
            }
            HomeSearchViewManager homeSearchViewManager3 = homeFragment.mHomeSearchViewManager;
            if (homeSearchViewManager3 != null) {
                homeSearchViewManager3.m67977C(homeFragment.appTab);
            }
            C24696r mViewBinding2 = homeFragment.getMViewBinding();
            if (mViewBinding2 != null && (appCompatImageView2 = mViewBinding2.f75552i) != null) {
                AbstractC26006c.m102054g(appCompatImageView2);
            }
            C24696r mViewBinding3 = homeFragment.getMViewBinding();
            if (mViewBinding3 != null && (appCompatImageView = mViewBinding3.f75551h) != null) {
                AbstractC26006c.m102054g(appCompatImageView);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: R0 */
    private final void m67878R0() {
        PreloadTrendingData.C15566a c15566a = PreloadTrendingData.f53717n;
        AppTab appTab = (AppTab) c15566a.m69164a().m69150C().m14847f();
        this.appTab = appTab;
        C26866a.a.m104898f(C26866a.f81698a, "HomeFragment", "homeTabFromCache = " + appTab, false, 4, null);
        if (this.appTab == null) {
            c15566a.m69164a().m69150C().m14851j(getViewLifecycleOwner(), new C15230e(new Function1() { // from class: com.transsion.home.fragment.home.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeFragment.m67879S0(this.f52987a, (AppTab) obj);
                }
            }));
        }
        c15566a.m69164a().m69151D().m14857p(this);
        c15566a.m69164a().m69151D().m14851j(getViewLifecycleOwner(), new C15230e(new Function1() { // from class: com.transsion.home.fragment.home.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeFragment.m67880T0(this.f52988a, (AppTab) obj);
            }
        }));
        m67930y1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final Unit m67879S0(HomeFragment homeFragment, AppTab appTab) {
        C26866a.a.m104898f(C26866a.f81698a, "HomeFragment", "homeTabFromCache2 = " + appTab, false, 4, null);
        if (homeFragment.isAdded()) {
            homeFragment.m67932z1(appTab);
            homeFragment.m67885Z0();
        }
        PreloadTrendingData.f53717n.m69164a().m69150C().m14857p(homeFragment);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final Unit m67880T0(final HomeFragment homeFragment, final AppTab appTab) {
        C26866a.a.m104898f(C26866a.f81698a, "HomeFragment", "LanguageRestart homeTabFromNet2 = " + appTab, false, 4, null);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.transsion.home.fragment.home.f
            @Override // java.lang.Runnable
            public final void run() {
                HomeFragment.m67881U0(this.f52973a, appTab);
            }
        }, 100L);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final void m67881U0(HomeFragment homeFragment, AppTab appTab) {
        if (homeFragment.isAdded()) {
            homeFragment.m67932z1(appTab);
            homeFragment.m67885Z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final Unit m67882V0(HomeFragment homeFragment, HomePreferencesConfig homePreferencesConfig) {
        Intrinsics.m97799e(homePreferencesConfig);
        homeFragment.m67874N0(homePreferencesConfig);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final Unit m67883W0(HomeFragment homeFragment, HomePreferencesConfig homePreferencesConfig) {
        Intrinsics.m97799e(homePreferencesConfig);
        homeFragment.m67911n1(homePreferencesConfig);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: X0 */
    private final void m67884X0() {
        try {
            Field declaredField = ViewPager2.class.getDeclaredField("mRecyclerView");
            Intrinsics.m97801g(declaredField, "getDeclaredField(...)");
            declaredField.setAccessible(true);
            C24696r mViewBinding = getMViewBinding();
            Object obj = declaredField.get(mViewBinding != null ? mViewBinding.f75562s : null);
            Intrinsics.m97800f(obj, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) obj;
            Field declaredField2 = RecyclerView.class.getDeclaredField("mTouchSlop");
            Intrinsics.m97801g(declaredField2, "getDeclaredField(...)");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(recyclerView);
            Intrinsics.m97800f(obj2, "null cannot be cast to non-null type kotlin.Int");
            declaredField2.set(recyclerView, Integer.valueOf(((Integer) obj2).intValue() * 2));
            C26866a.a.m104898f(C26866a.f81698a, "invoke", "testOver", false, 4, null);
        } catch (Exception e11) {
            C26866a.a.m104898f(C26866a.f81698a, "invoke", "Exception " + e11.getMessage(), false, 4, null);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m67885Z0() {
        if (this.lazyLoadAttempted) {
            m67927w1();
        }
    }

    /* JADX INFO: renamed from: a1 */
    private final void m67887a1() {
        List<HomeTabItem> homeTabs;
        AppTab appTab = this.appTab;
        if (appTab == null || (homeTabs = appTab.getHomeTabs()) == null) {
            return;
        }
        Iterator<HomeTabItem> it = homeTabs.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            HomeTabItem next = it.next();
            if (next != null) {
                Integer tabId = next.getTabId();
                int value = HomeTabId.UGC_Kids_Education.getValue();
                if (tabId != null && tabId.intValue() == value) {
                    break;
                }
            }
            i11++;
        }
        if (i11 < 0) {
            return;
        }
        Fragment fragmentM14547k0 = getChildFragmentManager().m14547k0("f" + i11);
        if (fragmentM14547k0 instanceof BaseHomeSubFragment) {
            ((BaseHomeSubFragment) fragmentM14547k0).mo67722c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public final void m67891d1(int position, boolean smoothScroll) {
        Object objM112707constructorimpl;
        C24696r mViewBinding;
        MagicIndicator magicIndicator;
        InterfaceC24549a navigator;
        LinearLayout titleContainer;
        String value;
        Boolean boolM1;
        try {
            Result.Companion companion = Result.INSTANCE;
            ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("home_tab_menu_show", true);
            if (!((configBeanM110360c == null || (value = configBeanM110360c.getValue()) == null || (boolM1 = StringsKt.m98153m1(value)) == null) ? false : boolM1.booleanValue()) || (mViewBinding = getMViewBinding()) == null || (magicIndicator = mViewBinding.f75554k) == null || (navigator = magicIndicator.getNavigator()) == null) {
                return;
            }
            if (navigator instanceof CommonNavigator) {
                titleContainer = ((CommonNavigator) navigator).getTitleContainer();
            } else {
                titleContainer = navigator instanceof ORCommonNavigator ? ((ORCommonNavigator) navigator).getTitleContainer() : null;
            }
            if (titleContainer != null && position >= 0 && position < titleContainer.getChildCount()) {
                HorizontalScrollView horizontalScrollViewM67870G0 = this.cachedScrollView;
                if (horizontalScrollViewM67870G0 == null) {
                    horizontalScrollViewM67870G0 = m67870G0(navigator);
                    this.cachedScrollView = horizontalScrollViewM67870G0;
                    if (horizontalScrollViewM67870G0 == null) {
                        return;
                    }
                }
                View childAt = titleContainer.getChildAt(position);
                int left = (childAt.getLeft() + (childAt.getWidth() / 2)) - (horizontalScrollViewM67870G0.getWidth() / 2);
                int iE = RangesKt.m97935e(titleContainer.getWidth() - horizontalScrollViewM67870G0.getWidth(), 0);
                if (left < 0) {
                    left = 0;
                } else if (left > iE) {
                    left = iE;
                }
                if (smoothScroll) {
                    horizontalScrollViewM67870G0.smoothScrollTo(left, 0);
                } else {
                    horizontalScrollViewM67870G0.scrollTo(left, 0);
                }
                objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
            }
            return;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.a.m104898f(C26866a.f81698a, "HomeFragment", "scrollTopTabToPosition: failed to scroll top tab, " + thM112710exceptionOrNullimpl.getMessage(), false, 4, null);
        }
    }

    /* JADX INFO: renamed from: e1 */
    private final void m67893e1() {
        ConstraintLayout constraintLayoutM96999b;
        final int i11 = this.lastValidPosition;
        C24696r mViewBinding = getMViewBinding();
        if (mViewBinding == null || (constraintLayoutM96999b = mViewBinding.getRoot()) == null) {
            return;
        }
        constraintLayoutM96999b.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.home.r
            @Override // java.lang.Runnable
            public final void run() {
                HomeFragment.m67895f1(this.f52989a, i11);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final void m67895f1(HomeFragment homeFragment, int i11) {
        ViewPager2 viewPager2;
        MagicIndicator magicIndicator;
        if (homeFragment.isAdded()) {
            C24696r mViewBinding = homeFragment.getMViewBinding();
            if (mViewBinding != null && (magicIndicator = mViewBinding.f75554k) != null) {
                magicIndicator.onPageSelected(i11);
            }
            C24696r mViewBinding2 = homeFragment.getMViewBinding();
            if (mViewBinding2 != null && (viewPager2 = mViewBinding2.f75562s) != null) {
                viewPager2.setCurrentItem(i11, false);
            }
            homeFragment.isHandlingRedirect = false;
            homeFragment.mSelectTabIndex = i11;
            homeFragment.m67933D0(false);
        }
    }

    /* JADX INFO: renamed from: g1 */
    private final void m67897g1() {
        AppCompatImageButton appCompatImageButton;
        ConstraintLayout constraintLayout;
        m67884X0();
        m67905k1();
        C24696r mViewBinding = getMViewBinding();
        if (mViewBinding != null && (constraintLayout = mViewBinding.f75548e) != null) {
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.fragment.home.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.m67903j1(this.f52981a, view);
                }
            });
        }
        C24696r mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (appCompatImageButton = mViewBinding2.f75545b) == null) {
            return;
        }
        appCompatImageButton.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.fragment.home.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.m67899h1(this.f52982a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final void m67899h1(final HomeFragment homeFragment, View view) {
        Object objM112707constructorimpl;
        ViewPager2 viewPager2;
        C14450a.f50860a.m65150n(homeFragment.m67935J0(), "home_top_tab_more_menu");
        C26866a.a.m104898f(C26866a.f81698a, "HomeFragment", "Menu button clicked, showing category discover dialog", false, 4, null);
        try {
            Result.Companion companion = Result.INSTANCE;
            CategoryDiscoverDialog categoryDiscoverDialogM67570a = CategoryDiscoverDialog.INSTANCE.m67570a();
            AppTab appTab = homeFragment.appTab;
            categoryDiscoverDialogM67570a.m67564s0(appTab != null ? appTab.getHomeTabs() : null);
            C24696r mViewBinding = homeFragment.getMViewBinding();
            categoryDiscoverDialogM67570a.m67563r0((mViewBinding == null || (viewPager2 = mViewBinding.f75562s) == null) ? 0 : viewPager2.getCurrentItem());
            categoryDiscoverDialogM67570a.m67562q0(new Function1() { // from class: com.transsion.home.fragment.home.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeFragment.m67901i1(this.f52975a, (HomeTabItem) obj);
                }
            });
            categoryDiscoverDialogM67570a.m65437l0(homeFragment, "category_discover");
            HashMap map = new HashMap();
            map.put("dialog_name", "home_switch_tab");
            C24662i.f75350a.m96884s(homeFragment.m67935J0(), "dialog_show", map);
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.a.m104898f(C26866a.f81698a, "HomeFragment", "Failed to show category discover dialog: " + thM112710exceptionOrNullimpl.getMessage(), false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final Unit m67901i1(HomeFragment homeFragment, HomeTabItem homeTabItem) {
        C26866a.a.m104898f(C26866a.f81698a, "HomeFragment", "Selected category: " + homeTabItem, false, 4, null);
        homeFragment.m67873M0(homeTabItem);
        return Unit.f75682a;
    }

    private final void initViewPager() {
        ViewPager2 viewPager2;
        ViewPager2 viewPager3;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "HomeFragment", "initViewPager", false, 4, null);
        if (isAdded()) {
            C24696r mViewBinding = getMViewBinding();
            if (mViewBinding != null && (viewPager3 = mViewBinding.f75562s) != null) {
                viewPager3.setUserInputEnabled(!C5118o.f17608a.m23948i());
            }
            C26866a.a.m104898f(aVar, "HomeFragment", "initViewPager fragment count " + getChildFragmentManager().m14574y0().size(), false, 4, null);
            C24696r mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (viewPager2 = mViewBinding2.f75562s) != null) {
                viewPager2.setAdapter(new C15229d());
            }
            m67866B0();
            AppStartReport.f62550a.m81548l("home_vp_ready");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final void m67903j1(HomeFragment homeFragment, View view) {
        homeFragment.m67917q1();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("module_name", "grade_select");
        C14450a.f50860a.m65146i(homeFragment.m67935J0(), linkedHashMap);
    }

    /* JADX INFO: renamed from: k1 */
    private final void m67905k1() {
        setNetListener(new C15231f());
    }

    /* JADX INFO: renamed from: l1 */
    private final void m67907l1() {
        MagicIndicator magicIndicator;
        InterfaceC24549a navigator;
        C24696r mViewBinding = getMViewBinding();
        if (mViewBinding == null || (magicIndicator = mViewBinding.f75554k) == null || (navigator = magicIndicator.getNavigator()) == null) {
            return;
        }
        final HorizontalScrollView horizontalScrollViewM67870G0 = m67870G0(navigator);
        this.cachedScrollView = horizontalScrollViewM67870G0;
        if (horizontalScrollViewM67870G0 == null) {
            C26866a.a.m104898f(C26866a.f81698a, "HomeFragment", "setupTopTabScrollListener: scrollView is null, cannot setup scroll listener", false, 4, null);
            return;
        }
        this.lastTopTabScrollX = horizontalScrollViewM67870G0.getScrollX();
        this.scrollStartSelectIndex = this.mSelectTabIndex;
        horizontalScrollViewM67870G0.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.transsion.home.fragment.home.h
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                HomeFragment.m67909m1(horizontalScrollViewM67870G0, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final void m67909m1(HorizontalScrollView horizontalScrollView, HomeFragment homeFragment) {
        homeFragment.m67875O0(horizontalScrollView.getScrollX());
    }

    /* JADX INFO: renamed from: n1 */
    private final void m67911n1(final HomePreferencesConfig config) {
        Object objM112707constructorimpl;
        FragmentActivity activity = getActivity();
        if (activity == null || !activity.isDestroyed()) {
            FragmentActivity activity2 = getActivity();
            if (activity2 == null || !activity2.isFinishing()) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    HomePreferencesEnterPopDialog homePreferencesEnterPopDialogM67620a = HomePreferencesEnterPopDialog.INSTANCE.m67620a();
                    homePreferencesEnterPopDialogM67620a.m67617t0(config);
                    C28121c.f86299a.m109224n(config);
                    m67869F0().m68938D(config);
                    homePreferencesEnterPopDialogM67620a.m67618u0(new Function1() { // from class: com.transsion.home.fragment.home.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeFragment.m67913o1(this.f52983a, config, (List) obj);
                        }
                    });
                    homePreferencesEnterPopDialogM67620a.m67619v0(new Function0() { // from class: com.transsion.home.fragment.home.o
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeFragment.m67915p1(this.f52985a, config);
                        }
                    });
                    homePreferencesEnterPopDialogM67620a.m65437l0(this, "HomePreferencesEnterPopDialog");
                    objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
                }
                Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                if (thM112710exceptionOrNullimpl != null) {
                    C26866a.a.m104901l(C26866a.f81698a, "HomeFragment", "showEnterPopDialog error: " + thM112710exceptionOrNullimpl.getMessage(), false, 4, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final Unit m67913o1(HomeFragment homeFragment, HomePreferencesConfig homePreferencesConfig, List selected) {
        Intrinsics.m97802h(selected, "selected");
        homeFragment.m67869F0().m68936B(homePreferencesConfig);
        homeFragment.m67869F0().m68941L(homePreferencesConfig, selected);
        C28121c.f86299a.m109223m(homePreferencesConfig, selected);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final Unit m67915p1(HomeFragment homeFragment, HomePreferencesConfig homePreferencesConfig) {
        homeFragment.m67869F0().m68937C(homePreferencesConfig);
        C28121c.f86299a.m109225o(homePreferencesConfig);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: q1 */
    private final void m67917q1() {
        List<GradeGroup> arrayList;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (activity.isDestroyed() || activity.isFinishing()) {
                activity = null;
            }
            if (activity == null) {
                return;
            }
            GradeSelectDialog gradeSelectDialog = new GradeSelectDialog();
            AppTab appTab = this.appTab;
            if (appTab == null || (arrayList = appTab.getHomeGradeList()) == null) {
                arrayList = new ArrayList<>();
            }
            gradeSelectDialog.m67582x0(arrayList, m67935J0());
            gradeSelectDialog.m67584z0(C5118o.f17608a.m23945e());
            gradeSelectDialog.m67583y0(new Function1() { // from class: com.transsion.home.fragment.home.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeFragment.m67919r1(this.f52970a, (GradeItem) obj);
                }
            });
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
            gradeSelectDialog.show(supportFragmentManager, "GradeSelectDialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public static final Unit m67919r1(HomeFragment homeFragment, GradeItem gradeItem) {
        String name;
        String grade;
        TnTextView tnTextView;
        String name2;
        String str = "";
        if (gradeItem == null || (name = gradeItem.getName()) == null) {
            name = "";
        }
        if (gradeItem == null || (grade = gradeItem.getGrade()) == null) {
            grade = "";
        }
        C5118o c5118o = C5118o.f17608a;
        c5118o.m23951m(name);
        c5118o.m23950l(grade);
        C28123e c28123e = C28123e.f86305a;
        c28123e.m109233b().putString("selected_grade_name", name);
        c28123e.m109233b().putString("selected_grade", grade);
        C24696r mViewBinding = homeFragment.getMViewBinding();
        if (mViewBinding != null && (tnTextView = mViewBinding.f75558o) != null) {
            if (gradeItem != null && (name2 = gradeItem.getName()) != null) {
                str = name2;
            }
            tnTextView.setText(str);
        }
        C26866a.a.m104898f(C26866a.f81698a, "HomeFragment", "Grade selected: " + (gradeItem != null ? gradeItem.getName() : null) + ", saved: " + name, false, 4, null);
        homeFragment.m67887a1();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public final void m67921s1(String value) {
        C24696r mViewBinding;
        AppCompatImageButton appCompatImageButton;
        AppCompatImageButton appCompatImageButton2;
        Boolean boolM1;
        boolean zBooleanValue = (value == null || (boolM1 = StringsKt.m98153m1(value)) == null) ? false : boolM1.booleanValue();
        C24696r mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (appCompatImageButton2 = mViewBinding2.f75545b) != null) {
            appCompatImageButton2.setVisibility(zBooleanValue ? 0 : 8);
        }
        C26866a.a.m104898f(C26866a.f81698a, "HomeFragment", "Menu button visibility: " + zBooleanValue, false, 4, null);
        if (!zBooleanValue || (mViewBinding = getMViewBinding()) == null || (appCompatImageButton = mViewBinding.f75545b) == null) {
            return;
        }
        appCompatImageButton.post(new Runnable() { // from class: com.transsion.home.fragment.home.e
            @Override // java.lang.Runnable
            public final void run() {
                HomeFragment.m67923t1(this.f52972a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final void m67923t1(HomeFragment homeFragment) {
        C14450a.f50860a.m65149m(homeFragment.m67935J0(), CollectionsKt.m97499e("home_top_tab_more_menu"), false);
    }

    /* JADX INFO: renamed from: w1 */
    private final boolean m67927w1() {
        List<HomeTabItem> homeTabs;
        if (this.viewPagerInitialized) {
            return false;
        }
        if (!isAdded() || getMViewBinding() == null) {
            C26866a.a.m104898f(C26866a.f81698a, "HomeFragment", "tryLazyInitViewPager skip, not attached", false, 4, null);
            return false;
        }
        AppTab appTab = this.appTab;
        int size = (appTab == null || (homeTabs = appTab.getHomeTabs()) == null) ? 0 : homeTabs.size();
        if (size <= 0) {
            C26866a.a.m104898f(C26866a.f81698a, "HomeFragment", "tryLazyInitViewPager skip, tabSize=" + size, false, 4, null);
            return false;
        }
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "HomeFragment", "tryLazyInitViewPager initViewPager tabSize=" + size, false, 4, null);
        initViewPager();
        if (!isAdded()) {
            return false;
        }
        this.viewPagerInitialized = true;
        C26866a.a.m104898f(aVar, "HomeFragment", "tryLazyInitViewPager done", false, 4, null);
        return true;
    }

    /* JADX INFO: renamed from: y1 */
    private final void m67930y1() {
        ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("home_tab_menu_show", true);
        String value = configBeanM110360c != null ? configBeanM110360c.getValue() : null;
        m67921s1(value);
        if (value == null || value.length() == 0) {
            AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new HomeFragment$updateMenuButtonVisibility$1(this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: z1 */
    private final void m67932z1(AppTab appTab) {
        List<HomeTabItem> homeTabs;
        List<HomeTabItem> homeTabs2;
        HomeTabItem homeTabItem;
        HomeTabItem homeTabItem2;
        if (appTab != null) {
            List<HomeTabItem> homeTabs3 = appTab.getHomeTabs();
            if ((homeTabs3 != null ? homeTabs3.size() : 0) > 0) {
                String version = appTab.getVersion();
                AppTab appTab2 = this.appTab;
                if (Intrinsics.m97797c(version, appTab2 != null ? appTab2.getVersion() : null)) {
                    List<HomeTabItem> homeTabs4 = appTab.getHomeTabs();
                    String name = (homeTabs4 == null || (homeTabItem2 = homeTabs4.get(0)) == null) ? null : homeTabItem2.getName();
                    AppTab appTab3 = this.appTab;
                    if (Intrinsics.m97797c(name, (appTab3 == null || (homeTabs2 = appTab3.getHomeTabs()) == null || (homeTabItem = homeTabs2.get(0)) == null) ? null : homeTabItem.getName())) {
                        List<HomeTabItem> homeTabs5 = appTab.getHomeTabs();
                        Integer numValueOf = homeTabs5 != null ? Integer.valueOf(homeTabs5.size()) : null;
                        AppTab appTab4 = this.appTab;
                        if (Intrinsics.m97797c(numValueOf, (appTab4 == null || (homeTabs = appTab4.getHomeTabs()) == null) ? null : Integer.valueOf(homeTabs.size()))) {
                            return;
                        }
                    }
                }
                this.appTab = appTab;
                this.trendingFragment = null;
                HomeSearchViewManager homeSearchViewManager = this.mHomeSearchViewManager;
                if (homeSearchViewManager != null) {
                    homeSearchViewManager.m67983O(appTab);
                }
                if (this.viewPagerInitialized) {
                    this.trendingFragment = null;
                    initViewPager();
                }
            }
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m67933D0(boolean isWhite) {
        FragmentActivity activity = getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        if (baseActivity != null) {
            baseActivity.changeStatusFontColor(isWhite, true);
        }
        HomeSearchViewManager homeSearchViewManager = this.mHomeSearchViewManager;
        if (homeSearchViewManager != null) {
            homeSearchViewManager.m67984l(isWhite);
        }
    }

    /* JADX INFO: renamed from: I0, reason: from getter */
    public final int getMSelectTabIndex() {
        return this.mSelectTabIndex;
    }

    /* JADX INFO: renamed from: J0 */
    public final String m67935J0() {
        HomeTabItem homeTabItem;
        String tabCode;
        AppTab appTab = this.appTab;
        List<HomeTabItem> homeTabs = appTab != null ? appTab.getHomeTabs() : null;
        int i11 = this.mSelectTabIndex;
        if (i11 >= 0) {
            return (i11 >= (homeTabs != null ? homeTabs.size() : 0) || homeTabs == null || (homeTabItem = homeTabs.get(this.mSelectTabIndex)) == null || (tabCode = homeTabItem.getTabCode()) == null) ? "" : tabCode;
        }
        return "";
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public C24696r getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C24696r c24696rM96997c = C24696r.m96997c(inflater);
        Intrinsics.m97801g(c24696rM96997c, "inflate(...)");
        return c24696rM96997c;
    }

    /* JADX INFO: renamed from: Y0 */
    public final boolean m67937Y0() {
        Fragment fragmentM14547k0 = getChildFragmentManager().m14547k0("f" + this.mSelectTabIndex);
        return (fragmentM14547k0 instanceof WebFragmentV2) && ((WebFragmentV2) fragmentM14547k0).m86705h1();
    }

    /* JADX INFO: renamed from: b1 */
    public final void m67938b1(String pageTabName, boolean isRefresh) {
        Intrinsics.m97802h(pageTabName, "pageTabName");
        C14450a.f50860a.m65149m(pageTabName, m67872L0(), isRefresh);
    }

    /* JADX INFO: renamed from: c1 */
    public final void m67939c1() {
        Fragment fragmentM14547k0 = getChildFragmentManager().m14547k0("f" + this.mSelectTabIndex);
        if (fragmentM14547k0 instanceof BaseHomeSubFragment) {
            ((BaseHomeSubFragment) fragmentM14547k0).mo68108p0();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initData(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        DownloadSDCardUtil.f68073a.m89321c();
        InterfaceC27135b.f82245a.m105597c().mo86623d();
        Function1 function1 = new Function1() { // from class: com.transsion.home.fragment.home.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeFragment.m67877Q0(this.f52966a, (C5117n) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C5117n.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        C24696r mViewBinding;
        BlurredSectorView blurredSectorView;
        Intrinsics.m97802h(view, "view");
        AbstractC3226v.m14968a(this);
        this.mSavedInstanceState = savedInstanceState;
        m67878R0();
        m67897g1();
        C24696r mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null) {
            HomeSearchViewManager homeSearchViewManager = new HomeSearchViewManager(mViewBinding2, this);
            this.mHomeSearchViewManager = homeSearchViewManager;
            homeSearchViewManager.m67977C(this.appTab);
        }
        C28123e c28123e = C28123e.f86305a;
        String string = c28123e.m109233b().getString("selected_grade_name", "All");
        if (string != null && string.length() != 0) {
            C5118o.f17608a.m23951m(string);
        }
        String string2 = c28123e.m109233b().getString("selected_grade", "UN_GRADE");
        if (string2 != null && string2.length() != 0) {
            C5118o.f17608a.m23950l(string2);
        }
        m67942x1();
        AppStartReport.f62550a.m81548l("home_init_view");
        if (Build.VERSION.SDK_INT <= 23 && (mViewBinding = getMViewBinding()) != null && (blurredSectorView = mViewBinding.f75557n) != null) {
            blurredSectorView.setVisibility(8);
        }
        if (C5118o.f17608a.m23948i()) {
            return;
        }
        m67869F0().m68935A();
        m67869F0().m68948x().m14851j(getViewLifecycleOwner(), new C15230e(new Function1() { // from class: com.transsion.home.fragment.home.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeFragment.m67882V0(this.f52979a, (HomePreferencesConfig) obj);
            }
        }));
        m67869F0().m68943s().m14851j(getViewLifecycleOwner(), new C15230e(new Function1() { // from class: com.transsion.home.fragment.home.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeFragment.m67883W0(this.f52980a, (HomePreferencesConfig) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        this.lazyLoadAttempted = true;
        m67927w1();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void logPause() {
        super.logPause();
        if (this.resumeTimeStamp != 0) {
            C14486e.f50941a.m65288n(IntegrationConstants.NAVIGATION_BAR_HOME_ACTION_DEFAULT, Long.valueOf(SystemClock.elapsedRealtime() - this.resumeTimeStamp), getContext());
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void logResume() {
        super.logResume();
        this.resumeTimeStamp = SystemClock.elapsedRealtime();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void newIntent(Intent intent) {
        String stringExtra;
        ViewPager2 viewPager2;
        super.newIntent(intent);
        try {
            if (!isAdded()) {
                setArguments(intent != null ? intent.getExtras() : null);
                return;
            }
            if (intent == null || (stringExtra = intent.getStringExtra("topTab")) == null) {
                stringExtra = "Trending";
            }
            this.mSelectTabIndex = m67871H0(stringExtra, intent != null ? intent.getIntExtra("secondTabIndex", -1) : -1);
            C24696r mViewBinding = getMViewBinding();
            if (mViewBinding == null || (viewPager2 = mViewBinding.f75562s) == null) {
                return;
            }
            viewPager2.setCurrentItem(this.mSelectTabIndex);
        } catch (Exception e11) {
            C26866a.a.m104898f(C26866a.f81698a, "HomeFragment", "error= " + e11.getMessage(), false, 4, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        DownloadSDCardUtil.f68073a.m89323e();
        PreloadTrendingData.f53717n.m69164a().m69151D().m14857p(this);
        HomeSearchViewManager homeSearchViewManager = this.mHomeSearchViewManager;
        if (homeSearchViewManager != null) {
            homeSearchViewManager.m67981L();
        }
        HomeSearchViewManager homeSearchViewManager2 = this.mHomeSearchViewManager;
        if (homeSearchViewManager2 != null) {
            homeSearchViewManager2.m67985n();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.trendingFragment = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed()) {
            if (hidden) {
                logPause();
                HomeSearchViewManager homeSearchViewManager = this.mHomeSearchViewManager;
                if (homeSearchViewManager != null) {
                    homeSearchViewManager.m67981L();
                }
            } else {
                logResume();
                HomeSearchViewManager homeSearchViewManager2 = this.mHomeSearchViewManager;
                if (homeSearchViewManager2 != null) {
                    homeSearchViewManager2.m67982M(true);
                }
                HomeSearchViewManager homeSearchViewManager3 = this.mHomeSearchViewManager;
                if (homeSearchViewManager3 != null) {
                    homeSearchViewManager3.m67979G();
                }
            }
        }
        AbstractC14517k.m65410h(null, this, hidden, null, 9, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AbstractC14517k.m65414l(null, this, null, 5, null);
        C26866a.f81698a.m104913d("onPause fragment count " + getChildFragmentManager().m14574y0().size(), true);
        HomeSearchViewManager homeSearchViewManager = this.mHomeSearchViewManager;
        if (homeSearchViewManager != null) {
            homeSearchViewManager.m67981L();
        }
        if (this.isHandlingRedirect) {
            m67893e1();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AbstractC14517k.m65418p(null, this, "visible=" + isVisible() + " fragment:" + this, 1, null);
        HomeSearchViewManager homeSearchViewManager = this.mHomeSearchViewManager;
        if (homeSearchViewManager != null) {
            homeSearchViewManager.m67982M(true);
        }
        Bundle bundle = this.mSavedInstanceState;
        Integer numValueOf = bundle != null ? Integer.valueOf(bundle.getInt("saved_search_color", 2)) : null;
        if ((numValueOf != null && numValueOf.intValue() == 0) || (numValueOf != null && numValueOf.intValue() == 1)) {
            Fragment fragmentM14547k0 = getChildFragmentManager().m14547k0("f" + this.mSelectTabIndex);
            if (fragmentM14547k0 instanceof BaseHomeSubFragment) {
                ((BaseHomeSubFragment) fragmentM14547k0).m68100b0(numValueOf != null && numValueOf.intValue() == 1);
            } else {
                m67933D0(numValueOf != null && numValueOf.intValue() == 1);
            }
            this.mSavedInstanceState = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.m97802h(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt("current_tab", this.mSelectTabIndex);
        HomeSearchViewManager homeSearchViewManager = this.mHomeSearchViewManager;
        int i11 = 0;
        if (homeSearchViewManager != null && homeSearchViewManager.m67978D()) {
            i11 = 1;
        }
        outState.putInt("saved_search_color", i11);
    }

    /* JADX INFO: renamed from: u1 */
    public final void m67940u1(String tabCode, int tabId) {
        ViewPager2 viewPager2;
        Intrinsics.m97802h(tabCode, "tabCode");
        int iM67871H0 = m67871H0(tabCode, tabId);
        C24696r mViewBinding = getMViewBinding();
        if (mViewBinding == null || (viewPager2 = mViewBinding.f75562s) == null) {
            return;
        }
        viewPager2.setCurrentItem(iM67871H0, false);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m67941v1() {
        ViewPager2 viewPager2;
        BaseHomeSubFragment baseHomeSubFragment = this.trendingFragment;
        if (baseHomeSubFragment instanceof TrendingFragment) {
            Intrinsics.m97800f(baseHomeSubFragment, "null cannot be cast to non-null type com.transsion.home.fragment.tab.TrendingFragment");
            ((TrendingFragment) baseHomeSubFragment).m68391g2();
        } else if (baseHomeSubFragment instanceof TrendingUGCFragment) {
            Intrinsics.m97800f(baseHomeSubFragment, "null cannot be cast to non-null type com.transsion.home.fragment.tab.TrendingUGCFragment");
            ((TrendingUGCFragment) baseHomeSubFragment).m68463t1();
        }
        C24696r mViewBinding = getMViewBinding();
        if (mViewBinding == null || (viewPager2 = mViewBinding.f75562s) == null) {
            return;
        }
        viewPager2.setCurrentItem(f52922t, false);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m67942x1() {
        C24696r mViewBinding;
        TnTextView tnTextView;
        AppCompatImageView appCompatImageView;
        ConstraintLayout constraintLayout;
        List<HomeTabItem> homeTabs;
        AppTab appTab = this.appTab;
        HomeTabItem homeTabItem = (appTab == null || (homeTabs = appTab.getHomeTabs()) == null) ? null : (HomeTabItem) CollectionsKt.m97362l0(homeTabs, this.mSelectTabIndex);
        boolean zM67539h = HomeTabId.INSTANCE.m67539h(homeTabItem != null ? homeTabItem.getTabId() : null, false);
        C5118o c5118o = C5118o.f17608a;
        boolean z11 = c5118o.m23948i() && zM67539h;
        C24696r mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (constraintLayout = mViewBinding2.f75548e) != null) {
            constraintLayout.setVisibility(z11 ? 0 : 8);
        }
        C24696r mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (appCompatImageView = mViewBinding3.f75550g) != null) {
            appCompatImageView.setVisibility(z11 ? 8 : 0);
        }
        if (!z11 || (mViewBinding = getMViewBinding()) == null || (tnTextView = mViewBinding.f75558o) == null) {
            return;
        }
        tnTextView.setText(c5118o.m23946f());
    }
}
