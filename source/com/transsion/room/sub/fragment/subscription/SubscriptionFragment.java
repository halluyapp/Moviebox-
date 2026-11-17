package com.transsion.room.sub.fragment.subscription;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baselib.report.C14486e;
import com.transsion.baselib.report.InterfaceC14488g;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.room.sub.adapter.subscription.C18199c;
import com.transsion.room.sub.adapter.subscription.C18207k;
import com.transsion.room.sub.adapter.subscription.InterfaceC18197a;
import com.transsion.room.sub.bean.subscription.ItemTrending;
import com.transsion.room.sub.bean.subscription.PagerTrending;
import com.transsion.room.sub.bean.subscription.SubscriptionFeedBean;
import com.transsion.room.sub.bean.subscription.SubscriptionStatsBean;
import com.transsion.room.sub.bean.subscription.TopicItemTrending;
import com.transsion.room.sub.bean.subscription.UgcTrendingHomeBean;
import com.transsion.room.sub.fragment.subscription.SubscriptionFragment;
import com.transsion.room.sub.view.SubscriptionLoadMoreView;
import com.transsion.room.sub.viewmodel.likes.UgcLikesViewModel;
import com.transsion.room.sub.viewmodel.subscription.C18270a;
import com.transsion.room.sub.viewmodel.subscription.SubscriptionFeedListViewModel;
import com.transsion.room.sub.viewmodel.subscription.SubscriptionViewModel;
import com.transsion.room.sub.viewmodel.subscription.UgcTrendingHomeViewModel;
import com.transsion.share.bean.PostType;
import com.transsion.share.share.InterfaceC18701a;
import com.transsion.share.share.ShareDialogFragment;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.usercenterapi.ReportType;
import com.transsion.web.api.WebConstants;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gq.C23658t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import p441gz.InterfaceC23704a;
import p441gz.InterfaceC23705b;
import p550kj.C24655b;
import p550kj.C24662i;
import p743rh.C27287m;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p840vj.C28117b;
import p840vj.InterfaceC28116a;
import p850vv.AbstractC28228b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u009d\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0003=\u009e\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\u0007J\u000f\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u0007J\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u0007J\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0007J\u001d\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u000b2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010\u0007J\u0019\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u00182\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000bH\u0002¢\u0006\u0004\b*\u0010\u0007J\u000f\u0010+\u001a\u00020\u000bH\u0002¢\u0006\u0004\b+\u0010\u0007J\u0017\u0010.\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020!H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u0010\u0007J\u000f\u00103\u001a\u00020\u000bH\u0016¢\u0006\u0004\b3\u0010\u0007J\u000f\u00104\u001a\u00020\u000bH\u0016¢\u0006\u0004\b4\u0010\u0007J\u000f\u00105\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u0010\u0007J\u000f\u00106\u001a\u00020\u000bH\u0016¢\u0006\u0004\b6\u0010\u0007J\u001f\u00109\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\b2\u0006\u00108\u001a\u00020!H\u0016¢\u0006\u0004\b9\u0010:J\u0019\u0010;\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0018H\u0016¢\u0006\u0004\b=\u0010<J#\u0010?\u001a\u00020\u000b2\b\u00108\u001a\u0004\u0018\u00010!2\b\u0010>\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b?\u0010@J\u0019\u0010A\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\bA\u0010$J\u0019\u0010B\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bB\u0010<J\u0017\u0010E\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u000bH\u0016¢\u0006\u0004\bG\u0010\u0007J\u0017\u0010H\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bH\u0010FJ\u000f\u0010I\u001a\u00020\u000bH\u0016¢\u0006\u0004\bI\u0010\u0007J\u0017\u0010K\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\bH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u000bH\u0016¢\u0006\u0004\bM\u0010\u0007J\u000f\u0010N\u001a\u00020\u000bH\u0016¢\u0006\u0004\bN\u0010\u0007J\u000f\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u000bH\u0016¢\u0006\u0004\bR\u0010\u0007J\u000f\u0010S\u001a\u00020\u000bH\u0016¢\u0006\u0004\bS\u0010\u0007R\u0018\u0010U\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010TR\u0018\u0010Y\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010[\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010XR\u0018\u0010]\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010XR\u0016\u0010a\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010d\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010cR\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010l\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010iR\u0018\u0010o\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010r\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010cR\u0016\u0010v\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010cR\u0016\u0010z\u001a\u00020w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010~\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b;\u0010\u0088\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001c\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\"\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0092\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b9\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u0098\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010cR\u0018\u0010\u009a\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010TR\u0018\u0010\u009c\u0001\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010`¨\u0006\u009f\u0001"}, m97100d2 = {"Lcom/transsion/room/sub/fragment/subscription/SubscriptionFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lgq/t;", "Lcom/transsion/room/sub/adapter/subscription/a;", "Lgz/b;", "Lcom/transsion/baselib/report/g;", "<init>", "()V", "", "S0", "()Z", "", "K0", "E0", "Q0", "V0", "L0", "T0", "", "Lcom/transsion/room/sub/bean/subscription/ItemTrending;", "feedItems", "a1", "(Ljava/util/List;)V", "", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "Z0", "Lcom/transsion/room/sub/adapter/subscription/k;", "N0", "()Lcom/transsion/room/sub/adapter/subscription/k;", "Lcom/transsion/room/sub/adapter/subscription/c;", "F0", "()Lcom/transsion/room/sub/adapter/subscription/c;", "I0", "", "userId", "z0", "(Ljava/lang/String;)V", WebConstants.FIELD_ITEM, "", "bottomFragmentIndex", "C0", "(Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;I)V", "Y0", "y0", "Landroid/view/LayoutInflater;", "inflater", "B0", "(Landroid/view/LayoutInflater;)Lgq/t;", "getPageStateLayoutTitle", "()Ljava/lang/String;", "loadDefaultData", "initViewData", "initViewModel", "initListener", "retryLoadData", "isLike", "ugcVideoId", "v", "(ZLjava/lang/String;)V", "s", "(Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;)V", "a", CampaignEx.JSON_KEY_TITLE, "I", "(Ljava/lang/String;Ljava/lang/String;)V", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "E", "Lcom/transsnet/loginapi/bean/UserInfo;", "user", "onLogin", "(Lcom/transsnet/loginapi/bean/UserInfo;)V", "onLogout", "onUpdateUserInfo", "onPause", "hidden", "onHiddenChanged", "(Z)V", "onResume", "onDestroy", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "logResume", "logPause", "Ljava/lang/String;", "cursorFeed", "pageNext", "c", "Ljava/lang/Boolean;", "isFirstFeedDataRequest", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "hasMoreFeedData", "e", "hasMoreUgcHomeData", "", "f", "J", "firstLoadStartTimeMillis", "g", "Z", "hasFollowings", "h", "isLoginRefresh", "Lvj/b;", "i", "Lvj/b;", "mExposureHelper", "j", "mExposureRecommendHelper", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/room/sub/adapter/subscription/c;", "sFeedAdapter", "l", "Lcom/transsion/room/sub/adapter/subscription/k;", "sFeedTrendingAdapter", "m", "isLoading", "n", "isUgcTrendingHomeLoading", "Lcom/transsion/room/sub/fragment/subscription/SubscriptionFragment$TabType;", "o", "Lcom/transsion/room/sub/fragment/subscription/SubscriptionFragment$TabType;", "mCurrentTab", "Lcom/transsion/room/sub/viewmodel/subscription/SubscriptionViewModel;", TtmlNode.TAG_P, "Lcom/transsion/room/sub/viewmodel/subscription/SubscriptionViewModel;", "viewModel", "Lcom/transsion/room/sub/viewmodel/subscription/SubscriptionFeedListViewModel;", CampaignEx.JSON_KEY_AD_Q, "Lcom/transsion/room/sub/viewmodel/subscription/SubscriptionFeedListViewModel;", "feedListViewModel", "Lcom/transsion/room/sub/viewmodel/likes/UgcLikesViewModel;", CampaignEx.JSON_KEY_AD_R, "Lcom/transsion/room/sub/viewmodel/likes/UgcLikesViewModel;", "ugcLikesViewModel", "Lcom/transsion/room/sub/viewmodel/subscription/UgcTrendingHomeViewModel;", "Lcom/transsion/room/sub/viewmodel/subscription/UgcTrendingHomeViewModel;", "ugcHomeViewModel", "Lcom/transsion/room/sub/viewmodel/subscription/a;", "t", "Lcom/transsion/room/sub/viewmodel/subscription/a;", "subUnsubViewModel", "Lcom/transsion/share/share/ShareDialogFragment;", TmcStartParams.KEY_URL_SHORT, "Lcom/transsion/share/share/ShareDialogFragment;", "shareDialog", "Lgz/a;", "Lkotlin/Lazy;", "getLoginApi", "()Lgz/a;", "loginApi", "w", "isSelf", "x", "pageFrom", "y", "resumeTimeStamp", "z", "TabType", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class SubscriptionFragment extends PageStatusFragment<C23658t> implements InterfaceC18197a, InterfaceC23705b, InterfaceC14488g {

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String cursorFeed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String pageNext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Boolean isFirstFeedDataRequest;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Boolean hasMoreFeedData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Boolean hasMoreUgcHomeData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long firstLoadStartTimeMillis;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean hasFollowings;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isLoginRefresh;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private C28117b mExposureHelper;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private C28117b mExposureRecommendHelper;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private C18199c sFeedAdapter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private C18207k sFeedTrendingAdapter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean isLoading;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isUgcTrendingHomeLoading;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private TabType mCurrentTab;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private SubscriptionViewModel viewModel;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private SubscriptionFeedListViewModel feedListViewModel;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private UgcLikesViewModel ugcLikesViewModel;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private UgcTrendingHomeViewModel ugcHomeViewModel;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private C18270a subUnsubViewModel;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private ShareDialogFragment shareDialog;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final Lazy loginApi;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private boolean isSelf;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private String pageFrom;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private long resumeTimeStamp;

    @Metadata(m97099d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m97100d2 = {"Lcom/transsion/room/sub/fragment/subscription/SubscriptionFragment$TabType;", "", "apiValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getApiValue", "()Ljava/lang/String;", "FOR_U", "LATEST", "HOTTEST", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    public enum TabType {
        FOR_U("ForYou"),
        LATEST("Latest"),
        HOTTEST("New");

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m97650a(values());
        private final String apiValue;

        TabType(String str) {
            this.apiValue = str;
        }

        public static EnumEntries<TabType> getEntries() {
            return $ENTRIES;
        }

        public final String getApiValue() {
            return this.apiValue;
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.sub.fragment.subscription.SubscriptionFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SubscriptionFragment m77316a() {
            Bundle bundle = new Bundle();
            SubscriptionFragment subscriptionFragment = new SubscriptionFragment();
            subscriptionFragment.setArguments(bundle);
            return subscriptionFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.sub.fragment.subscription.SubscriptionFragment$b */
    public static final class C18259b implements InterfaceC28116a {
        C18259b() {
        }

        @Override // p840vj.InterfaceC28116a
        /* JADX INFO: renamed from: a */
        public void mo65894a(int i11, long j11, View view) {
            List<Object> data;
            String ugcVideoId;
            UGCVideoBelongToCollection belongToCollection;
            String collectionId;
            C18199c c18199c = SubscriptionFragment.this.sFeedAdapter;
            if (c18199c == null || (data = c18199c.getData()) == null) {
                return;
            }
            int size = data.size();
            SubscriptionFragment subscriptionFragment = SubscriptionFragment.this;
            if (subscriptionFragment.hasFollowings) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Subscription曝光的位置position: ");
                sb2.append(i11);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Subscription曝光的位置duration: ");
                sb3.append(j11);
                if (i11 >= size) {
                    return;
                }
                C18199c c18199c2 = subscriptionFragment.sFeedAdapter;
                UGCVideo uGCVideo = c18199c2 != null ? (UGCVideo) c18199c2.getItem(i11) : null;
                HashMap map = new HashMap();
                map.put("item_type", "subscription");
                map.put("module_name", WebConstants.FIELD_ITEM);
                map.put("ops", String.valueOf(uGCVideo != null ? uGCVideo.getOps() : null));
                map.put(RequestParameters.POSITION, String.valueOf(i11));
                map.put("refer_subject_id", String.valueOf(uGCVideo != null ? uGCVideo.getSubjectId() : null));
                map.put("content_type", "ugc_video");
                String str = "";
                if (uGCVideo == null || (ugcVideoId = uGCVideo.getUgcVideoId()) == null) {
                    ugcVideoId = "";
                }
                map.put("content_id", ugcVideoId);
                map.put("browse_duration", String.valueOf(j11));
                if (uGCVideo != null && (belongToCollection = uGCVideo.getBelongToCollection()) != null && (collectionId = belongToCollection.getCollectionId()) != null) {
                    str = collectionId;
                }
                map.put("belong_to_collection_id", str);
                C14450a.f50860a.m65142e("/subscription/subscription", map);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.sub.fragment.subscription.SubscriptionFragment$c */
    public static final class C18260c implements InterfaceC28116a {
        C18260c() {
        }

        @Override // p840vj.InterfaceC28116a
        /* JADX INFO: renamed from: a */
        public void mo65894a(int i11, long j11, View view) {
            List<Object> data;
            String ugcVideoId;
            TopicItemTrending content;
            UGCVideo video;
            UGCVideoBelongToCollection belongToCollection;
            String collectionId;
            TopicItemTrending content2;
            UGCVideo video2;
            TopicItemTrending content3;
            UGCVideo video3;
            TopicItemTrending content4;
            UGCVideo video4;
            C18207k c18207k = SubscriptionFragment.this.sFeedTrendingAdapter;
            if (c18207k == null || (data = c18207k.getData()) == null) {
                return;
            }
            int size = data.size();
            SubscriptionFragment subscriptionFragment = SubscriptionFragment.this;
            if (subscriptionFragment.hasFollowings) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Recommend曝光的位置position: ");
            sb2.append(i11);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Recommend曝光的位置duration: ");
            sb3.append(j11);
            if (i11 >= size) {
                return;
            }
            C18207k c18207k2 = subscriptionFragment.sFeedTrendingAdapter;
            String subjectId = null;
            ItemTrending itemTrending = c18207k2 != null ? (ItemTrending) c18207k2.getItem(i11) : null;
            HashMap map = new HashMap();
            map.put("item_type", "recommend");
            map.put("module_name", WebConstants.FIELD_ITEM);
            map.put("ops", String.valueOf((itemTrending == null || (content4 = itemTrending.getContent()) == null || (video4 = content4.getVideo()) == null) ? null : video4.getOps()));
            map.put(RequestParameters.POSITION, String.valueOf(i11));
            if (itemTrending != null && (content3 = itemTrending.getContent()) != null && (video3 = content3.getVideo()) != null) {
                subjectId = video3.getSubjectId();
            }
            map.put("refer_subject_id", String.valueOf(subjectId));
            map.put("content_type", "ugc_video");
            map.put("browse_duration", String.valueOf(j11));
            String str = "";
            if (itemTrending == null || (content2 = itemTrending.getContent()) == null || (video2 = content2.getVideo()) == null || (ugcVideoId = video2.getUgcVideoId()) == null) {
                ugcVideoId = "";
            }
            map.put("content_id", ugcVideoId);
            if (itemTrending != null && (content = itemTrending.getContent()) != null && (video = content.getVideo()) != null && (belongToCollection = video.getBelongToCollection()) != null && (collectionId = belongToCollection.getCollectionId()) != null) {
                str = collectionId;
            }
            map.put("belong_to_collection_id", str);
            C14450a.f50860a.m65142e("/subscription/subscription", map);
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.sub.fragment.subscription.SubscriptionFragment$d */
    public static final class C18261d implements InterfaceC18701a {
        C18261d() {
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: a */
        public void mo70521a(String id2, PostType postType) {
            Intrinsics.m97802h(id2, "id");
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: b */
        public void mo70522b(String str) {
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: c */
        public void mo70523c(String url, String fileName, String fileSize, String fileImage) {
            Intrinsics.m97802h(url, "url");
            Intrinsics.m97802h(fileName, "fileName");
            Intrinsics.m97802h(fileSize, "fileSize");
            Intrinsics.m97802h(fileImage, "fileImage");
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: d */
        public void mo70524d(String id2) {
            Intrinsics.m97802h(id2, "id");
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: e */
        public void mo70525e(String str) {
            InterfaceC18701a.a.m78649c(this, str);
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.sub.fragment.subscription.SubscriptionFragment$e */
    static final class C18262e implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59480a;

        C18262e(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59480a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59480a;
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
            this.f59480a.invoke(obj);
        }
    }

    public SubscriptionFragment() {
        Boolean bool = Boolean.FALSE;
        this.isFirstFeedDataRequest = bool;
        this.hasMoreFeedData = bool;
        this.hasMoreUgcHomeData = bool;
        this.mCurrentTab = TabType.HOTTEST;
        this.loginApi = LazyKt.m97097b(new Function0() { // from class: nq.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubscriptionFragment.m77294X0();
            }
        });
        this.pageFrom = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final Unit m77272A0(SubscriptionFragment subscriptionFragment, SubscriptionStatsBean subscriptionStatsBean) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        if (subscriptionStatsBean == null && !C27287m.f83003a.m106330e()) {
            subscriptionFragment.showNoNetworkView(false);
        }
        Integer followingCount = subscriptionStatsBean != null ? subscriptionStatsBean.getFollowingCount() : null;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "SubscriptionFragment", "followingCount ：" + followingCount, false, 4, null);
        if (followingCount != null) {
            if (followingCount.intValue() > 0) {
                C26866a.a.m104898f(aVar, "SubscriptionFragment", "有订阅，走订阅接口", false, 4, null);
                subscriptionFragment.hasFollowings = true;
                if (subscriptionFragment.isLoginRefresh) {
                    SubscriptionFeedListViewModel subscriptionFeedListViewModel = subscriptionFragment.feedListViewModel;
                    if (subscriptionFeedListViewModel != null) {
                        subscriptionFeedListViewModel.m77356i();
                    }
                } else {
                    subscriptionFragment.isFirstFeedDataRequest = Boolean.TRUE;
                    subscriptionFragment.m77290T0();
                    C23658t mViewBinding = subscriptionFragment.getMViewBinding();
                    if (mViewBinding != null && (recyclerView2 = mViewBinding.f72313c) != null) {
                        recyclerView2.setAdapter(subscriptionFragment.sFeedAdapter);
                    }
                }
            } else {
                C26866a.a.m104898f(aVar, "SubscriptionFragment", "无订阅，走推荐接口", false, 4, null);
                subscriptionFragment.hasFollowings = false;
                if (subscriptionFragment.isLoginRefresh) {
                    UgcTrendingHomeViewModel ugcTrendingHomeViewModel = subscriptionFragment.ugcHomeViewModel;
                    if (ugcTrendingHomeViewModel != null) {
                        ugcTrendingHomeViewModel.m77366i();
                    }
                } else {
                    subscriptionFragment.m77292V0();
                }
                C23658t mViewBinding2 = subscriptionFragment.getMViewBinding();
                if (mViewBinding2 != null && (recyclerView = mViewBinding2.f72313c) != null) {
                    recyclerView.setAdapter(subscriptionFragment.sFeedTrendingAdapter);
                }
            }
            subscriptionFragment.isLoginRefresh = false;
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: C0 */
    private final void m77273C0(UGCVideo item, final int bottomFragmentIndex) {
        if (item != null) {
            AbstractC28228b.m109412a(item, new Function1() { // from class: nq.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SubscriptionFragment.m77274D0(bottomFragmentIndex, (Navigator) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final Navigator m77274D0(int i11, Navigator navigator) {
        Intrinsics.m97802h(navigator, "navigator");
        return navigator.m61852F("ugc_bottom_fragment_selected", i11);
    }

    /* JADX INFO: renamed from: E0 */
    private final void m77275E0() {
        RecyclerView recyclerView;
        if (this.mExposureHelper == null) {
            C28117b c28117b = new C28117b(0.6f, new C18259b(), false, 4, null);
            C23658t mViewBinding = getMViewBinding();
            if (mViewBinding != null && (recyclerView = mViewBinding.f72313c) != null) {
                recyclerView.addOnScrollListener(c28117b);
            }
            this.mExposureHelper = c28117b;
        }
    }

    /* JADX INFO: renamed from: F0 */
    private final C18199c m77276F0() {
        C26866a.a.m104898f(C26866a.f81698a, "SubscriptionFragment", "initFeedAdapter", false, 4, null);
        C18199c c18199c = new C18199c(new ArrayList(), this.mExposureHelper, false);
        c18199c.m36186h0().m108673z(true);
        c18199c.m36186h0().m108672y(true);
        c18199c.m36186h0().m108657E(2);
        c18199c.m36186h0().m108655C(new SubscriptionLoadMoreView());
        c18199c.m36186h0().m108656D(new InterfaceC27568f() { // from class: nq.i
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                SubscriptionFragment.m77277G0(this.f79648a);
            }
        });
        this.sFeedAdapter = c18199c;
        c18199c.m77134Q1(this);
        return this.sFeedAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final void m77277G0(final SubscriptionFragment subscriptionFragment) {
        RecyclerView recyclerView;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "SubscriptionFragment", "initSubscriptionListAdapter: trigger", false, 4, null);
        if (!C27287m.f83003a.m106330e()) {
            C26866a.a.m104910z(aVar, "SubscriptionFragment", "initSubscriptionListAdapter: no network, load more failed", false, 4, null);
            C23658t mViewBinding = subscriptionFragment.getMViewBinding();
            if (mViewBinding == null || (recyclerView = mViewBinding.f72313c) == null) {
                return;
            }
            recyclerView.postDelayed(new Runnable() { // from class: nq.b
                @Override // java.lang.Runnable
                public final void run() {
                    SubscriptionFragment.m77278H0(this.f79641a);
                }
            }, 300L);
            return;
        }
        C26866a.a.m104898f(aVar, "SubscriptionFragment", "initSubscriptionListAdapter: trigger load more", false, 4, null);
        String str = subscriptionFragment.cursorFeed;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sub observe cursorFeed : ");
        sb2.append(str);
        SubscriptionFeedListViewModel subscriptionFeedListViewModel = subscriptionFragment.feedListViewModel;
        if (subscriptionFeedListViewModel != null) {
            subscriptionFeedListViewModel.m77355h(subscriptionFragment.cursorFeed);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final void m77278H0(SubscriptionFragment subscriptionFragment) {
        C27941f c27941fM36186h0;
        C18199c c18199c = subscriptionFragment.sFeedAdapter;
        if (c18199c == null || (c27941fM36186h0 = c18199c.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: renamed from: I0 */
    private final void m77279I0() {
        RecyclerView recyclerView;
        SwipeRefreshLayout swipeRefreshLayout;
        C26866a.a.m104898f(C26866a.f81698a, "Subscription", "initFeedListRecyclerView", false, 4, null);
        C23658t mViewBinding = getMViewBinding();
        if (mViewBinding != null && (swipeRefreshLayout = mViewBinding.f72314d) != null) {
            swipeRefreshLayout.setEnabled(true);
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: nq.e
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
                /* JADX INFO: renamed from: a */
                public final void mo21823a() {
                    SubscriptionFragment.m77280J0(this.f79644a);
                }
            });
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        linearLayoutManager.setInitialPrefetchItemCount(2);
        m77275E0();
        m77281K0();
        C28117b c28117b = this.mExposureHelper;
        if (c28117b != null) {
            c28117b.m109195f();
        }
        C28117b c28117b2 = this.mExposureRecommendHelper;
        if (c28117b2 != null) {
            c28117b2.m109195f();
        }
        C23658t mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (recyclerView = mViewBinding2.f72313c) != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        this.sFeedAdapter = m77276F0();
        this.sFeedTrendingAdapter = m77284N0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final void m77280J0(SubscriptionFragment subscriptionFragment) {
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "SubscriptionFragment", "initRecyclerView: user pull to refresh", false, 4, null);
        if (!subscriptionFragment.hasFollowings) {
            C26866a.a.m104898f(aVar, "SubscriptionFragment", "initRecyclerView: user pull to refresh 没有关注", false, 4, null);
            subscriptionFragment.m77295Y0();
            return;
        }
        C26866a.a.m104898f(aVar, "SubscriptionFragment", "initRecyclerView: user pull to refresh 关注", false, 4, null);
        SubscriptionFeedListViewModel subscriptionFeedListViewModel = subscriptionFragment.feedListViewModel;
        if (subscriptionFeedListViewModel != null) {
            subscriptionFeedListViewModel.m77356i();
        }
    }

    /* JADX INFO: renamed from: K0 */
    private final void m77281K0() {
        RecyclerView recyclerView;
        if (this.mExposureRecommendHelper == null) {
            C28117b c28117b = new C28117b(0.6f, new C18260c(), false, 4, null);
            C23658t mViewBinding = getMViewBinding();
            if (mViewBinding != null && (recyclerView = mViewBinding.f72313c) != null) {
                recyclerView.addOnScrollListener(c28117b);
            }
            this.mExposureRecommendHelper = c28117b;
        }
    }

    /* JADX INFO: renamed from: L0 */
    private final void m77282L0() {
        C3187b0 c3187b0M77352e;
        SubscriptionFeedListViewModel subscriptionFeedListViewModel = this.feedListViewModel;
        if (subscriptionFeedListViewModel == null || (c3187b0M77352e = subscriptionFeedListViewModel.m77352e()) == null) {
            return;
        }
        c3187b0M77352e.m14851j(this, new C18262e(new Function1() { // from class: nq.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubscriptionFragment.m77283M0(this.f79645a, (SubscriptionFeedBean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:112:0x0213  */
    /* JADX INFO: renamed from: M0 */
    public static final Unit m77283M0(SubscriptionFragment subscriptionFragment, SubscriptionFeedBean subscriptionFeedBean) {
        List<UGCVideo> feedItems;
        C27941f c27941fM36186h0;
        SwipeRefreshLayout swipeRefreshLayout;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        List<UGCVideo> feedItems2;
        List<Object> data;
        C23658t mViewBinding;
        RecyclerView recyclerView3;
        List<Object> data2;
        C27941f c27941fM36186h1;
        List<Object> data3;
        C27941f c27941fM36186h2;
        C27941f c27941fM36186h3;
        subscriptionFragment.m77313y0();
        subscriptionFragment.showContentView();
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "SubscriptionFragment", "sub observe start", false, 4, null);
        subscriptionFragment.hasMoreFeedData = subscriptionFeedBean != null ? Boolean.valueOf(subscriptionFeedBean.getHasMore()) : null;
        subscriptionFragment.cursorFeed = subscriptionFeedBean != null ? subscriptionFeedBean.getNextCursor() : null;
        SubscriptionFeedListViewModel subscriptionFeedListViewModel = subscriptionFragment.feedListViewModel;
        Boolean boolValueOf = subscriptionFeedListViewModel != null ? Boolean.valueOf(subscriptionFeedListViewModel.m77354g()) : null;
        C26866a.a.m104898f(aVar, "SubscriptionFragment", "hasMoreFeedData " + subscriptionFragment.hasMoreFeedData, false, 4, null);
        C18199c c18199c = subscriptionFragment.sFeedAdapter;
        if (c18199c != null && (c27941fM36186h2 = c18199c.m36186h0()) != null && c27941fM36186h2.m108666r()) {
            C26866a.a.m104898f(aVar, "SubscriptionFragment", "sub observe loadMoreComplete", false, 4, null);
            C18199c c18199c2 = subscriptionFragment.sFeedAdapter;
            if (c18199c2 != null && (c27941fM36186h3 = c18199c2.m36186h0()) != null) {
                c27941fM36186h3.m108667s();
            }
        }
        if ((subscriptionFeedBean != null ? subscriptionFeedBean.getFeedItems() : null) != null) {
            List<UGCVideo> feedItems3 = subscriptionFeedBean.getFeedItems();
            Integer numValueOf = feedItems3 != null ? Integer.valueOf(feedItems3.size()) : null;
            C18199c c18199c3 = subscriptionFragment.sFeedAdapter;
            Integer numValueOf2 = (c18199c3 == null || (data3 = c18199c3.getData()) == null) ? null : Integer.valueOf(data3.size());
            C26866a.a.m104898f(aVar, "SubscriptionFragment", "subscriptionFeedBean: received " + numValueOf + " items, currentListSize=" + numValueOf2 + ", hasMore=" + subscriptionFeedBean.getHasMore(), false, 4, null);
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.m97797c(boolValueOf, bool) && !Intrinsics.m97797c(subscriptionFragment.hasMoreFeedData, bool)) {
                C26866a.a.m104898f(aVar, "SubscriptionFragment", "subscriptionFeedBean: no more data, load more end", false, 4, null);
                C26866a.a.m104898f(aVar, "SubscriptionFragment", "sub observe loadMoreEnd", false, 4, null);
                C18199c c18199c4 = subscriptionFragment.sFeedAdapter;
                if (c18199c4 != null && (c27941fM36186h1 = c18199c4.m36186h0()) != null) {
                    C27941f.m108652u(c27941fM36186h1, false, 1, null);
                }
            }
            C18199c c18199c5 = subscriptionFragment.sFeedAdapter;
            if (c18199c5 != null && (data2 = c18199c5.getData()) != null && data2.isEmpty() && numValueOf != null && numValueOf.intValue() == 0) {
                C26866a.a.m104898f(aVar, "SubscriptionFragment", "subscriptionFeedBean: empty data", false, 4, null);
            } else if (numValueOf != null && numValueOf.intValue() > 0) {
                if (Intrinsics.m97797c(boolValueOf, bool) && (mViewBinding = subscriptionFragment.getMViewBinding()) != null && (recyclerView3 = mViewBinding.f72313c) != null) {
                    recyclerView3.setAdapter(subscriptionFragment.sFeedAdapter);
                }
                C26866a.a.m104898f(aVar, "SubscriptionFragment", "sub observe updateData", false, 4, null);
                subscriptionFragment.m77296Z0(subscriptionFeedBean.getFeedItems());
                C24655b logViewConfig = subscriptionFragment.getLogViewConfig();
                if (logViewConfig != null) {
                    logViewConfig.m96848k(true);
                }
            }
        }
        C18199c c18199c6 = subscriptionFragment.sFeedAdapter;
        if ((c18199c6 == null || (data = c18199c6.getData()) == null || data.size() != 0) && !Intrinsics.m97797c(boolValueOf, Boolean.TRUE)) {
            C26866a.a.m104898f(aVar, "loadMoreModule", "hasMoreFeedData " + subscriptionFragment.hasMoreFeedData, false, 4, null);
            if ((subscriptionFeedBean != null ? subscriptionFeedBean.getFeedItems() : null) != null && (((feedItems = subscriptionFeedBean.getFeedItems()) == null || feedItems.size() != 0) && Intrinsics.m97797c(subscriptionFragment.hasMoreFeedData, Boolean.FALSE))) {
                C26866a.a.m104898f(aVar, "loadMoreModule", "subscriptionFeedBean: no more data, load more end", false, 4, null);
                C18199c c18199c7 = subscriptionFragment.sFeedAdapter;
                if (c18199c7 != null && (c27941fM36186h0 = c18199c7.m36186h0()) != null) {
                    C27941f.m108652u(c27941fM36186h0, false, 1, null);
                }
            }
        } else {
            if ((subscriptionFeedBean != null ? subscriptionFeedBean.getFeedItems() : null) == null || ((feedItems2 = subscriptionFeedBean.getFeedItems()) != null && feedItems2.size() == 0)) {
                Boolean bool2 = subscriptionFragment.hasMoreFeedData;
                Boolean bool3 = Boolean.FALSE;
                if (Intrinsics.m97797c(bool2, bool3)) {
                    Boolean bool4 = subscriptionFragment.isFirstFeedDataRequest;
                    Boolean bool5 = Boolean.TRUE;
                    if (Intrinsics.m97797c(bool4, bool5) && !Intrinsics.m97797c(boolValueOf, bool5)) {
                        C26866a.a.m104898f(aVar, "SubscriptionFragment", "sub observe loadUgcTrendingHomeData", false, 4, null);
                        C26866a.a.m104898f(aVar, "SubscriptionFragment", "发送推荐接口的请求", false, 4, null);
                        subscriptionFragment.hasFollowings = false;
                        subscriptionFragment.m77292V0();
                        subscriptionFragment.isFirstFeedDataRequest = bool3;
                        C23658t mViewBinding2 = subscriptionFragment.getMViewBinding();
                        if (mViewBinding2 != null && (recyclerView2 = mViewBinding2.f72313c) != null) {
                            recyclerView2.setAdapter(subscriptionFragment.sFeedTrendingAdapter);
                        }
                    } else if (Intrinsics.m97797c(subscriptionFragment.isFirstFeedDataRequest, bool3) && Intrinsics.m97797c(boolValueOf, bool5)) {
                        C26866a.a.m104898f(aVar, "SubscriptionFragment", "sub observe UgcTrending refresh", false, 4, null);
                        subscriptionFragment.hasFollowings = false;
                        UgcTrendingHomeViewModel ugcTrendingHomeViewModel = subscriptionFragment.ugcHomeViewModel;
                        if (ugcTrendingHomeViewModel != null) {
                            ugcTrendingHomeViewModel.m77366i();
                        }
                        C23658t mViewBinding3 = subscriptionFragment.getMViewBinding();
                        if (mViewBinding3 != null && (recyclerView = mViewBinding3.f72313c) != null) {
                            recyclerView.setAdapter(subscriptionFragment.sFeedTrendingAdapter);
                        }
                    }
                } else {
                    C26866a.a.m104898f(aVar, "SubscriptionFragment", "订阅请求有数据，不发送推荐接口的请求", false, 4, null);
                }
            } else {
                C26866a.a.m104898f(aVar, "SubscriptionFragment", "订阅请求有数据，不发送推荐接口的请求", false, 4, null);
            }
        }
        subscriptionFragment.isLoading = false;
        C23658t mViewBinding4 = subscriptionFragment.getMViewBinding();
        if (mViewBinding4 != null && (swipeRefreshLayout = mViewBinding4.f72314d) != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: N0 */
    private final C18207k m77284N0() {
        C18207k c18207k = new C18207k(new ArrayList(), this.mExposureRecommendHelper, false);
        c18207k.m36186h0().m108673z(true);
        c18207k.m36186h0().m108672y(true);
        c18207k.m36186h0().m108657E(2);
        c18207k.m36186h0().m108655C(new SubscriptionLoadMoreView());
        c18207k.m36186h0().m108656D(new InterfaceC27568f() { // from class: nq.h
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                SubscriptionFragment.m77285O0(this.f79647a);
            }
        });
        this.sFeedTrendingAdapter = c18207k;
        c18207k.m77153Q1(this);
        return this.sFeedTrendingAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final void m77285O0(final SubscriptionFragment subscriptionFragment) {
        RecyclerView recyclerView;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "SubscriptionFragment", "initSubscriptionListAdapter: trigger ", false, 4, null);
        if (!C27287m.f83003a.m106330e()) {
            C26866a.a.m104910z(aVar, "SubscriptionFragment", "initSubscriptionListAdapter: no network, load more failed", false, 4, null);
            C23658t mViewBinding = subscriptionFragment.getMViewBinding();
            if (mViewBinding == null || (recyclerView = mViewBinding.f72313c) == null) {
                return;
            }
            recyclerView.postDelayed(new Runnable() { // from class: nq.c
                @Override // java.lang.Runnable
                public final void run() {
                    SubscriptionFragment.m77286P0(this.f79642a);
                }
            }, 300L);
            return;
        }
        C26866a.a.m104898f(aVar, "SubscriptionFragment", "initSubscriptionListAdapter: trigger load more", false, 4, null);
        String str = subscriptionFragment.pageNext;
        Integer numValueOf = str != null ? Integer.valueOf(Integer.parseInt(str)) : null;
        UgcTrendingHomeViewModel ugcTrendingHomeViewModel = subscriptionFragment.ugcHomeViewModel;
        if (ugcTrendingHomeViewModel != null) {
            ugcTrendingHomeViewModel.m77365h(numValueOf);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final void m77286P0(SubscriptionFragment subscriptionFragment) {
        C27941f c27941fM36186h0;
        C18207k c18207k = subscriptionFragment.sFeedTrendingAdapter;
        if (c18207k == null || (c27941fM36186h0 = c18207k.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m77287Q0() {
        C3187b0 c3187b0M77363f;
        UgcTrendingHomeViewModel ugcTrendingHomeViewModel = this.ugcHomeViewModel;
        if (ugcTrendingHomeViewModel == null || (c3187b0M77363f = ugcTrendingHomeViewModel.m77363f()) == null) {
            return;
        }
        c3187b0M77363f.m14851j(this, new C18262e(new Function1() { // from class: nq.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubscriptionFragment.m77288R0(this.f79646a, (UgcTrendingHomeBean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final Unit m77288R0(SubscriptionFragment subscriptionFragment, UgcTrendingHomeBean ugcTrendingHomeBean) {
        C27941f c27941fM36186h0;
        SwipeRefreshLayout swipeRefreshLayout;
        List<Object> data;
        C27941f c27941fM36186h1;
        List<Object> data2;
        C27941f c27941fM36186h2;
        C27941f c27941fM36186h3;
        List<ItemTrending> items;
        PagerTrending pager;
        PagerTrending pager2;
        subscriptionFragment.m77313y0();
        UgcTrendingHomeViewModel ugcTrendingHomeViewModel = subscriptionFragment.ugcHomeViewModel;
        if (ugcTrendingHomeViewModel != null) {
            ugcTrendingHomeViewModel.m77364g();
        }
        subscriptionFragment.showContentView();
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "SubscriptionFragment", "recommend observe loadUgcTrendingHomeData", false, 4, null);
        subscriptionFragment.hasMoreUgcHomeData = (ugcTrendingHomeBean == null || (pager2 = ugcTrendingHomeBean.getPager()) == null) ? null : Boolean.valueOf(pager2.getHasMore());
        subscriptionFragment.pageNext = (ugcTrendingHomeBean == null || (pager = ugcTrendingHomeBean.getPager()) == null) ? null : pager.getNextPage();
        if (ugcTrendingHomeBean != null && (items = ugcTrendingHomeBean.getItems()) != null) {
            items.size();
        }
        C26866a.a.m104898f(aVar, "SubscriptionFragment", "pageNext : " + subscriptionFragment.pageNext, false, 4, null);
        C26866a.a.m104898f(aVar, "SubscriptionFragment", "hasMoreUgcHomeData " + subscriptionFragment.hasMoreUgcHomeData, false, 4, null);
        C18207k c18207k = subscriptionFragment.sFeedTrendingAdapter;
        if (c18207k != null && (c27941fM36186h2 = c18207k.m36186h0()) != null && c27941fM36186h2.m108666r()) {
            C18207k c18207k2 = subscriptionFragment.sFeedTrendingAdapter;
            if (c18207k2 != null && (c27941fM36186h3 = c18207k2.m36186h0()) != null) {
                c27941fM36186h3.m108667s();
            }
            C26866a.a.m104898f(aVar, "SubscriptionFragment", "recommend observe loadMoreComplete", false, 4, null);
        }
        if ((ugcTrendingHomeBean != null ? ugcTrendingHomeBean.getItems() : null) != null) {
            List<ItemTrending> items2 = ugcTrendingHomeBean.getItems();
            Integer numValueOf = items2 != null ? Integer.valueOf(items2.size()) : null;
            C18199c c18199c = subscriptionFragment.sFeedAdapter;
            Integer numValueOf2 = (c18199c == null || (data2 = c18199c.getData()) == null) ? null : Integer.valueOf(data2.size());
            C26866a.a.m104898f(aVar, "SubscriptionFragment", "ugcTrendingHomeData: received " + numValueOf + " items, currentListSize=" + numValueOf2 + ", hasMore=" + ugcTrendingHomeBean.getPager().getHasMore(), false, 4, null);
            if (!Intrinsics.m97797c(subscriptionFragment.hasMoreUgcHomeData, Boolean.TRUE)) {
                C26866a.a.m104898f(aVar, "SubscriptionFragment", "ugcTrendingHomeData: no more data, load more end", false, 4, null);
                C18207k c18207k3 = subscriptionFragment.sFeedTrendingAdapter;
                if (c18207k3 != null && (c27941fM36186h1 = c18207k3.m36186h0()) != null) {
                    C27941f.m108652u(c27941fM36186h1, false, 1, null);
                }
                C26866a.a.m104898f(aVar, "SubscriptionFragment", "recommend observe loadMoreEnd", false, 4, null);
            }
            C18207k c18207k4 = subscriptionFragment.sFeedTrendingAdapter;
            if (c18207k4 == null || (data = c18207k4.getData()) == null || !data.isEmpty() || numValueOf == null || numValueOf.intValue() != 0) {
                C18207k c18207k5 = subscriptionFragment.sFeedTrendingAdapter;
                if (c18207k5 != null && (c27941fM36186h0 = c18207k5.m36186h0()) != null) {
                    c27941fM36186h0.m108667s();
                }
                C26866a.a.m104898f(aVar, "SubscriptionFragment", "recommend observe loadMoreComplete", false, 4, null);
                List<ItemTrending> items3 = ugcTrendingHomeBean.getItems();
                Intrinsics.m97799e(items3);
                subscriptionFragment.m77297a1(items3);
                C24655b logViewConfig = subscriptionFragment.getLogViewConfig();
                if (logViewConfig != null) {
                    logViewConfig.m96848k(true);
                }
            } else {
                C26866a.a.m104898f(aVar, "SubscriptionFragment", "subscriptionFeedBean: empty data", false, 4, null);
                C26866a.a.m104898f(aVar, "SubscriptionFragment", "recommend observe setEmptyView", false, 4, null);
                C18207k c18207k6 = subscriptionFragment.sFeedTrendingAdapter;
                if (c18207k6 != null) {
                    c18207k6.m36171Y0(subscriptionFragment.getEmptyView(false));
                }
            }
            C23658t mViewBinding = subscriptionFragment.getMViewBinding();
            if (mViewBinding != null && (swipeRefreshLayout = mViewBinding.f72314d) != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: S0, reason: from getter */
    private final boolean getIsSelf() {
        return this.isSelf;
    }

    /* JADX INFO: renamed from: T0 */
    private final void m77290T0() {
        ConstraintLayout root;
        C26866a.a.m104898f(C26866a.f81698a, "Subscription", "loadFeedData", false, 4, null);
        if (this.isLoading) {
            return;
        }
        this.isLoading = true;
        SubscriptionFeedListViewModel subscriptionFeedListViewModel = this.feedListViewModel;
        if (subscriptionFeedListViewModel != null) {
            subscriptionFeedListViewModel.m77353f("");
        }
        C23658t mViewBinding = getMViewBinding();
        if (mViewBinding == null || (root = mViewBinding.getRoot()) == null) {
            return;
        }
        root.postDelayed(new Runnable() { // from class: nq.l
            @Override // java.lang.Runnable
            public final void run() {
                SubscriptionFragment.m77291U0(this.f79651a);
            }
        }, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final void m77291U0(SubscriptionFragment subscriptionFragment) {
        SwipeRefreshLayout swipeRefreshLayout;
        C23658t mViewBinding = subscriptionFragment.getMViewBinding();
        if (mViewBinding == null || (swipeRefreshLayout = mViewBinding.f72314d) == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(false);
    }

    /* JADX INFO: renamed from: V0 */
    private final void m77292V0() {
        ConstraintLayout root;
        C26866a.a.m104898f(C26866a.f81698a, "SubscriptionFragment", "loadUgcTrendingHomeData", false, 4, null);
        if (this.isUgcTrendingHomeLoading) {
            return;
        }
        this.isUgcTrendingHomeLoading = true;
        UgcTrendingHomeViewModel ugcTrendingHomeViewModel = this.ugcHomeViewModel;
        if (ugcTrendingHomeViewModel != null) {
            ugcTrendingHomeViewModel.m77362e(1, this.mCurrentTab.getApiValue());
        }
        C23658t mViewBinding = getMViewBinding();
        if (mViewBinding == null || (root = mViewBinding.getRoot()) == null) {
            return;
        }
        root.postDelayed(new Runnable() { // from class: nq.k
            @Override // java.lang.Runnable
            public final void run() {
                SubscriptionFragment.m77293W0(this.f79650a);
            }
        }, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final void m77293W0(SubscriptionFragment subscriptionFragment) {
        SwipeRefreshLayout swipeRefreshLayout;
        C23658t mViewBinding = subscriptionFragment.getMViewBinding();
        if (mViewBinding == null || (swipeRefreshLayout = mViewBinding.f72314d) == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final InterfaceC23704a m77294X0() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: renamed from: Y0 */
    private final void m77295Y0() {
        this.isLoginRefresh = true;
        InterfaceC23704a loginApi = getLoginApi();
        UserInfo userInfoMo90386h = loginApi != null ? loginApi.mo90386h() : null;
        String userId = userInfoMo90386h != null ? userInfoMo90386h.getUserId() : null;
        SubscriptionViewModel subscriptionViewModel = this.viewModel;
        if (subscriptionViewModel != null) {
            subscriptionViewModel.m77359e(String.valueOf(userId));
        }
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m77296Z0(List feedItems) {
        List<Object> data;
        List<Object> data2;
        C18199c c18199c = this.sFeedAdapter;
        int size = 0;
        int size2 = (c18199c == null || (data2 = c18199c.getData()) == null) ? 0 : data2.size();
        SubscriptionFeedListViewModel subscriptionFeedListViewModel = this.feedListViewModel;
        if (Intrinsics.m97797c(subscriptionFeedListViewModel != null ? Boolean.valueOf(subscriptionFeedListViewModel.m77354g()) : null, Boolean.TRUE) || size2 == 0) {
            C18199c c18199c2 = this.sFeedAdapter;
            if (c18199c2 != null) {
                c18199c2.mo36201n1(feedItems);
            }
            C26866a.a.m104898f(C26866a.f81698a, "SubscriptionFragment", "updateData: refresh or first load, replace data. size: " + size2 + " -> " + (feedItems != null ? Integer.valueOf(feedItems.size()) : null), false, 4, null);
            return;
        }
        C18199c c18199c3 = this.sFeedAdapter;
        if (c18199c3 != null) {
            Intrinsics.m97799e(feedItems);
            c18199c3.mo36208q(feedItems);
        }
        C18199c c18199c4 = this.sFeedAdapter;
        if (c18199c4 != null && (data = c18199c4.getData()) != null) {
            size = data.size();
        }
        C26866a.a.m104898f(C26866a.f81698a, "SubscriptionFragment", "updateData: load more, add " + (feedItems != null ? Integer.valueOf(feedItems.size()) : null) + " items, list size: " + size2 + " -> " + size, false, 4, null);
    }

    /* JADX INFO: renamed from: a1 */
    private final void m77297a1(List feedItems) {
        List<Object> data;
        List<Object> data2;
        C18207k c18207k = this.sFeedTrendingAdapter;
        int size = 0;
        int size2 = (c18207k == null || (data2 = c18207k.getData()) == null) ? 0 : data2.size();
        UgcTrendingHomeViewModel ugcTrendingHomeViewModel = this.ugcHomeViewModel;
        if (!Intrinsics.m97797c(ugcTrendingHomeViewModel != null ? Boolean.valueOf(ugcTrendingHomeViewModel.m77364g()) : null, Boolean.TRUE) && size2 != 0) {
            C18207k c18207k2 = this.sFeedTrendingAdapter;
            if (c18207k2 != null) {
                c18207k2.mo36208q(feedItems);
            }
            C18207k c18207k3 = this.sFeedTrendingAdapter;
            if (c18207k3 != null && (data = c18207k3.getData()) != null) {
                size = data.size();
            }
            C26866a.a.m104898f(C26866a.f81698a, "SubscriptionFragment", "updateData: load more, add " + feedItems.size() + " items, list size: " + size2 + " -> " + size, false, 4, null);
            return;
        }
        C18207k c18207k4 = this.sFeedTrendingAdapter;
        if (c18207k4 == null) {
            C26866a.a.m104898f(C26866a.f81698a, "SubscriptionFragment", "FeedTrendingAdapter ==null", false, 4, null);
        } else {
            C26866a.a.m104898f(C26866a.f81698a, "SubscriptionFragment", "FeedTrendingAdapter ==" + c18207k4, false, 4, null);
        }
        C18207k c18207k5 = this.sFeedTrendingAdapter;
        if (c18207k5 != null) {
            c18207k5.mo36201n1(feedItems);
        }
        C26866a.a.m104898f(C26866a.f81698a, "SubscriptionFragment", "updateData: refresh or first load, replace data. size: " + size2 + " -> " + (feedItems != null ? Integer.valueOf(feedItems.size()) : null), false, 4, null);
    }

    private final InterfaceC23704a getLoginApi() {
        return (InterfaceC23704a) this.loginApi.getValue();
    }

    /* JADX INFO: renamed from: y0 */
    private final void m77313y0() {
        HashMap mapM96844g;
        if (this.firstLoadStartTimeMillis > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.firstLoadStartTimeMillis;
            C24655b logViewConfig = getLogViewConfig();
            if (logViewConfig == null || (mapM96844g = logViewConfig.m96844g()) == null) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    private final void m77314z0(String userId) {
        C3187b0 c3187b0M77358d;
        showLoadingView();
        C26866a.a.m104898f(C26866a.f81698a, "SubscriptionFragment", "checkHasFollowings阶段", false, 4, null);
        SubscriptionViewModel subscriptionViewModel = this.viewModel;
        if (subscriptionViewModel != null && (c3187b0M77358d = subscriptionViewModel.m77358d()) != null) {
            c3187b0M77358d.m14851j(this, new C18262e(new Function1() { // from class: nq.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SubscriptionFragment.m77272A0(this.f79643a, (SubscriptionStatsBean) obj);
                }
            }));
        }
        SubscriptionViewModel subscriptionViewModel2 = this.viewModel;
        if (subscriptionViewModel2 != null) {
            subscriptionViewModel2.m77359e(String.valueOf(userId));
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public C23658t getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.viewModel = (SubscriptionViewModel) new C3227v0(activity).m14969a(SubscriptionViewModel.class);
            this.feedListViewModel = (SubscriptionFeedListViewModel) new C3227v0(activity).m14969a(SubscriptionFeedListViewModel.class);
            this.ugcLikesViewModel = (UgcLikesViewModel) new C3227v0(activity).m14969a(UgcLikesViewModel.class);
            this.subUnsubViewModel = (C18270a) new C3227v0(activity).m14969a(C18270a.class);
            this.ugcHomeViewModel = (UgcTrendingHomeViewModel) new C3227v0(activity).m14969a(UgcTrendingHomeViewModel.class);
        }
        C23658t c23658tM93582c = C23658t.m93582c(getLayoutInflater());
        Intrinsics.m97801g(c23658tM93582c, "inflate(...)");
        return c23658tM93582c;
    }

    @Override // com.transsion.room.sub.adapter.subscription.InterfaceC18197a
    /* JADX INFO: renamed from: E */
    public void mo77127E(UGCVideo item) {
        C26866a.a.m104898f(C26866a.f81698a, "SubscriptionFragment", "onClickVideoTrendingDetailItem", false, 4, null);
        if (item != null) {
            AbstractC28228b.m109413b(item, null, 1, null);
        }
    }

    @Override // com.transsion.room.sub.adapter.subscription.InterfaceC18197a
    /* JADX INFO: renamed from: I */
    public void mo77128I(String ugcVideoId, String title) {
        Fragment parentFragment;
        FragmentManager childFragmentManager;
        C26866a.a.m104898f(C26866a.f81698a, "SubscriptionFragment", "onClickShareItem", false, 4, null);
        if (this.shareDialog == null) {
            InterfaceC23704a loginApi = getLoginApi();
            UserInfo userInfoMo90386h = loginApi != null ? loginApi.mo90386h() : null;
            ShareDialogFragment shareDialogFragmentM78645a = ShareDialogFragment.INSTANCE.m78645a(PostType.UGC_VIDEO, ugcVideoId, userInfoMo90386h != null ? userInfoMo90386h.getUserId() : null, ReportType.UFC_VIDEO.getValue(), (3328 & 16) != 0 ? "" : title, (3328 & 32) != 0 ? "" : null, (3328 & 64) != 0 ? false : false, (3328 & 128) != 0 ? false : false, (3328 & 256) != 0 ? false : false, "UGCVideoDetail", (3328 & 1024) != 0 ? "" : title, (3328 & 2048) != 0 ? "" : null);
            this.shareDialog = shareDialogFragmentM78645a;
            if (shareDialogFragmentM78645a != null) {
                shareDialogFragmentM78645a.m78642G0(new C18261d());
            }
            try {
                Fragment parentFragment2 = getParentFragment();
                if (parentFragment2 != null && parentFragment2.isAdded() && (parentFragment = getParentFragment()) != null && (childFragmentManager = parentFragment.getChildFragmentManager()) != null) {
                    childFragmentManager.m14537g0();
                    ShareDialogFragment shareDialogFragment = this.shareDialog;
                    if ((shareDialogFragment != null && shareDialogFragment.isAdded()) || childFragmentManager.m14547k0("share") != null) {
                        return;
                    }
                    ShareDialogFragment shareDialogFragment2 = this.shareDialog;
                    if (shareDialogFragment2 != null) {
                        shareDialogFragment2.show(childFragmentManager, "share");
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        this.shareDialog = null;
    }

    @Override // com.transsion.room.sub.adapter.subscription.InterfaceC18197a
    /* JADX INFO: renamed from: a */
    public void mo77129a(UGCVideo item) {
        Intrinsics.m97802h(item, "item");
        AbstractC28228b.m109413b(item, null, 1, null);
    }

    @Override // com.transsion.room.sub.adapter.subscription.InterfaceC18197a
    /* JADX INFO: renamed from: b */
    public void mo77130b(String userId) {
        C26866a.a.m104898f(C26866a.f81698a, "SubscriptionFragment", "userId111 ：" + userId, false, 4, null);
        Navigator.m61845x(TheRouter.m61773c("/profile/user_profile").m61857K("userId", userId), requireContext(), null, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        boolean z11;
        HashMap mapM96844g;
        UserInfo userInfoMo90386h;
        this.firstLoadStartTimeMillis = System.currentTimeMillis();
        InterfaceC23704a loginApi = getLoginApi();
        String userId = null;
        UserInfo userInfoMo90386h2 = loginApi != null ? loginApi.mo90386h() : null;
        String userId2 = userInfoMo90386h2 != null ? userInfoMo90386h2.getUserId() : null;
        if (userId2 == null || userId2.length() == 0) {
            z11 = true;
        } else {
            String userId3 = userInfoMo90386h2 != null ? userInfoMo90386h2.getUserId() : null;
            InterfaceC23704a loginApi2 = getLoginApi();
            if (loginApi2 != null && (userInfoMo90386h = loginApi2.mo90386h()) != null) {
                userId = userInfoMo90386h.getUserId();
            }
            if (Intrinsics.m97797c(userId3, userId)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        this.isSelf = z11;
        if (getIsSelf()) {
            C26866a.a.m104898f(C26866a.f81698a, "SubscriptionFragment", "isSelf : true", false, 4, null);
            InterfaceC23704a loginApi3 = getLoginApi();
            if (loginApi3 != null) {
                loginApi3.mo90392n(this);
            }
        } else {
            C26866a.a.m104898f(C26866a.f81698a, "SubscriptionFragment", "isSelf : false", false, 4, null);
        }
        m77279I0();
        if (this.pageFrom.length() == 0) {
            this.pageFrom = C24662i.f75350a.m96877i();
        }
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig == null || (mapM96844g = logViewConfig.m96844g()) == null) {
            return;
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m77282L0();
        m77287Q0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void loadDefaultData() {
        C26866a.a.m104898f(C26866a.f81698a, "SubscriptionFragment", "loadDefaultData阶段", false, 4, null);
        InterfaceC23704a loginApi = getLoginApi();
        UserInfo userInfoMo90386h = loginApi != null ? loginApi.mo90386h() : null;
        m77314z0(userInfoMo90386h != null ? userInfoMo90386h.getUserId() : null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void logPause() {
        super.logPause();
        if (this.resumeTimeStamp != 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.resumeTimeStamp;
            C26866a.a.m104905r(C26866a.f81698a, "Report", new String[]{"Subscription fb log duration:" + jElapsedRealtime}, false, 4, null);
            C14486e.f50941a.m65288n("Subscription", Long.valueOf(jElapsedRealtime), getContext());
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void logResume() {
        super.logResume();
        this.resumeTimeStamp = SystemClock.elapsedRealtime();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("/subscription/subscription", false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC23704a loginApi = getLoginApi();
        if (loginApi != null) {
            loginApi.mo90391m(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed()) {
            if (hidden) {
                logPause();
            } else {
                logResume();
            }
        }
    }

    @Override // p441gz.InterfaceC23705b
    public void onLogin(UserInfo user) {
        Intrinsics.m97802h(user, "user");
        InterfaceC23705b.a.m93655a(this, user);
        C26866a.a.m104898f(C26866a.f81698a, "SubscriptionFragment", "onLogin阶段", false, 4, null);
        m77295Y0();
    }

    @Override // p441gz.InterfaceC23705b
    public void onLogout() {
        InterfaceC23705b.a.m93656b(this);
        C26866a.a.m104898f(C26866a.f81698a, "SubscriptionFragment", "onLogout阶段", false, 4, null);
        m77295Y0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // p441gz.InterfaceC23705b
    public void onUpdateUserInfo(UserInfo user) {
        Intrinsics.m97802h(user, "user");
        C26866a.a.m104898f(C26866a.f81698a, "SubscriptionFragment", "onUpdateUserInfo阶段", false, 4, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        C26866a.a.m104898f(C26866a.f81698a, "SubscriptionFragment", "retryLoadData阶段", false, 4, null);
        InterfaceC23704a loginApi = getLoginApi();
        UserInfo userInfoMo90386h = loginApi != null ? loginApi.mo90386h() : null;
        m77314z0(userInfoMo90386h != null ? userInfoMo90386h.getUserId() : null);
    }

    @Override // com.transsion.room.sub.adapter.subscription.InterfaceC18197a
    /* JADX INFO: renamed from: s */
    public void mo77131s(UGCVideo item) {
        C26866a.a.m104898f(C26866a.f81698a, "SubscriptionFragment", "onClickCommentReply", false, 4, null);
        m77273C0(item, 1);
    }

    @Override // com.transsion.room.sub.adapter.subscription.InterfaceC18197a
    /* JADX INFO: renamed from: v */
    public void mo77132v(boolean isLike, String ugcVideoId) {
        Intrinsics.m97802h(ugcVideoId, "ugcVideoId");
        C26866a.a.m104898f(C26866a.f81698a, "SubscriptionFragment", "onClickCommentLike", false, 4, null);
        UgcLikesViewModel ugcLikesViewModel = this.ugcLikesViewModel;
        if (ugcLikesViewModel != null) {
            ugcLikesViewModel.m77341j(ugcVideoId, isLike);
        }
    }
}
