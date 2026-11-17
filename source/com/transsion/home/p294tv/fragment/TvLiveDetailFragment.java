package com.transsion.home.p294tv.fragment;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.AbstractC0256u;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
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
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.NetworkUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.noober.background.view.BLFrameLayout;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.base.report.athena.BrowseType;
import com.transsion.base.report.athena.ClickType;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.home.R$layout;
import com.transsion.home.p294tv.C15513g;
import com.transsion.home.p294tv.adapter.C15451h;
import com.transsion.home.p294tv.bean.StreamItem;
import com.transsion.home.p294tv.bean.TvChannelItem;
import com.transsion.home.p294tv.bean.TvChannelListDataBean;
import com.transsion.player.longvideo.R$id;
import com.transsion.player.longvideo.R$string;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.PlayError;
import com.transsion.player.p303ui.ORVideoView;
import com.transsion.push.PushConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fo.C23403e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
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
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import no.C26053g0;
import p550kj.C24655b;
import p550kj.C24662i;
import p552kl.C24670c0;
import p579ll.C25646b;
import p579ll.InterfaceC25645a;
import p683po.C26906c;
import p683po.C26907d;
import p743rh.C27287m;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p944yh.C28951b;
import pg.C26866a;
import tl.C27827a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006*\u0002\u008c\u0001\b\u0007\u0018\u0000 \u0090\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001JB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0004J\u0017\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u0004J\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010\u001bJ\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u000f\u0010#\u001a\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\u0018H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0005H\u0002¢\u0006\u0004\b&\u0010\u0004J\u0017\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\u0005H\u0002¢\u0006\u0004\b,\u0010\u0004J\u000f\u0010-\u001a\u00020\u0005H\u0002¢\u0006\u0004\b-\u0010\u0004J\u000f\u0010.\u001a\u00020\u0005H\u0002¢\u0006\u0004\b.\u0010\u0004J\u0017\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u0018H\u0002¢\u0006\u0004\b0\u0010\u001bJ\u0011\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0005H\u0016¢\u0006\u0004\b4\u0010\u0004J\u0017\u00107\u001a\u00020\u00022\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0018H\u0016¢\u0006\u0004\b<\u0010%J\u000f\u0010=\u001a\u00020\u0005H\u0016¢\u0006\u0004\b=\u0010\u0004J\u000f\u0010>\u001a\u00020\u0005H\u0016¢\u0006\u0004\b>\u0010\u0004J\u000f\u0010?\u001a\u00020\u0005H\u0016¢\u0006\u0004\b?\u0010\u0004J\u000f\u0010@\u001a\u00020\u0005H\u0016¢\u0006\u0004\b@\u0010\u0004J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u0011\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0005H\u0016¢\u0006\u0004\bG\u0010\u0004J\u000f\u0010H\u001a\u00020\u0005H\u0016¢\u0006\u0004\bH\u0010\u0004J\u000f\u0010I\u001a\u00020\u0005H\u0016¢\u0006\u0004\bI\u0010\u0004R\u0018\u0010L\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010N\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010KR\u001b\u0010T\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010\\\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R$\u0010a\u001a\u0012\u0012\u0004\u0012\u0002090]j\b\u0012\u0004\u0012\u000209`^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010d\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010k\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010m\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010jR\u0016\u0010o\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010jR\u0016\u0010q\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010jR\u0016\u0010s\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010jR\u0018\u0010u\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010KR\u0018\u0010x\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010{\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010\u007f\u001a\u00020|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0018\u0010\u0081\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010jR\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0088\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001¨\u0006\u0091\u0001"}, m97100d2 = {"Lcom/transsion/home/tv/fragment/TvLiveDetailFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lkl/c0;", "<init>", "()V", "", "loadData", "w1", "y1", "initExposureHelper", "initPlayer", "Lcom/transsion/home/tv/bean/TvChannelItem;", "channel", "p1", "(Lcom/transsion/home/tv/bean/TvChannelItem;)V", "q1", "O0", "P0", "Q0", "r1", "G1", "I1", "h1", "U0", "", "autoHide", "A1", "(Z)V", "W0", "v1", "u1", PushConstants.PUSH_SERVICE_TYPE_SHOW, "F1", "isNoNet", "B1", "Y0", "m1", "()Z", "s1", "Lcom/transsion/player/ui/ORVideoView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "N0", "(Lcom/transsion/player/ui/ORVideoView;)V", "H1", "n1", "o1", "T0", "isHide", "M0", "Landroidx/fragment/app/FragmentActivity;", "t1", "()Landroidx/fragment/app/FragmentActivity;", "receiveArguments", "Landroid/view/LayoutInflater;", "inflater", "R0", "(Landroid/view/LayoutInflater;)Lkl/c0;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "isRegisteDeviceKeyMonitor", "initViewData", "initViewModel", "initListener", "retryLoadData", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Landroid/view/View;", "getLoadingView", "()Landroid/view/View;", "onResume", "onStop", "onDestroyView", "a", "Ljava/lang/String;", TmcStartParams.KEY_CHANNEL_ID, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "countryCode", "Lcom/transsion/home/tv/g;", "c", "Lkotlin/Lazy;", "S0", "()Lcom/transsion/home/tv/g;", "viewModel", "Lcom/transsion/home/tv/adapter/h;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/home/tv/adapter/h;", "channelDetailAdapter", "Lll/b;", "e", "Lll/b;", "exposureHelper", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "f", "Ljava/util/HashSet;", "exposedStreamUrls", "g", "Lcom/transsion/player/ui/ORVideoView;", "playerView", "Ltl/a;", "h", "Ltl/a;", "playDotLayer", "i", "Z", "isFullscreen", "j", "isControlsLocked", CampaignEx.JSON_KEY_AD_K, "isOverlayVisible", "l", "isLockButtonVisible", "m", "isVideoPlaying", "n", "currentChannelName", "o", "Lcom/transsion/home/tv/bean/TvChannelItem;", "currentChannel", TtmlNode.TAG_P, "Landroid/view/View;", "errorLayout", "", CampaignEx.JSON_KEY_AD_Q, "J", "loadStartTime", CampaignEx.JSON_KEY_AD_R, "isFirstPlay", "Landroid/os/Handler;", "s", "Landroid/os/Handler;", "overlayHandler", "Ljava/lang/Runnable;", "t", "Ljava/lang/Runnable;", "hideOverlayRunnable", TmcStartParams.KEY_URL_SHORT, "hideLockButtonRunnable", "com/transsion/home/tv/fragment/TvLiveDetailFragment$d", "v", "Lcom/transsion/home/tv/fragment/TvLiveDetailFragment$d;", "playerListener", "w", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class TvLiveDetailFragment extends PageStatusFragment<C24670c0> {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x */
    public static final int f53461x = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String channelId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String countryCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C15451h channelDetailAdapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private C25646b exposureHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final HashSet exposedStreamUrls;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private ORVideoView playerView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private C27827a playDotLayer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isFullscreen;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isControlsLocked;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean isOverlayVisible;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean isLockButtonVisible;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean isVideoPlaying;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private String currentChannelName;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private TvChannelItem currentChannel;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private View errorLayout;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private long loadStartTime;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean isFirstPlay;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final Handler overlayHandler;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final Runnable hideOverlayRunnable;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final Runnable hideLockButtonRunnable;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final C15479d playerListener;

    /* JADX INFO: renamed from: com.transsion.home.tv.fragment.TvLiveDetailFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final TvLiveDetailFragment m68745a() {
            return new TvLiveDetailFragment();
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.tv.fragment.TvLiveDetailFragment$b */
    public static final class C15477b implements InterfaceC25645a {
        C15477b() {
        }

        @Override // p579ll.InterfaceC25645a
        /* JADX INFO: renamed from: a */
        public void mo67486a(int i11, long j11, View view) {
            List<StreamItem> streams;
            StreamItem streamItem;
            String url;
            TvChannelItem tvChannelItem = (TvChannelItem) CollectionsKt.m97362l0(TvLiveDetailFragment.this.channelDetailAdapter.getData(), i11);
            if (tvChannelItem == null || (streams = tvChannelItem.getStreams()) == null || (streamItem = streams.get(0)) == null || (url = streamItem.getUrl()) == null || TvLiveDetailFragment.this.exposedStreamUrls.contains(url)) {
                return;
            }
            TvLiveDetailFragment.this.exposedStreamUrls.add(url);
            HashMap map = new HashMap();
            map.put("content_id", url);
            map.put(RequestParameters.POSITION, String.valueOf(i11 + 1));
            C24662i.f75350a.m96873E("tv_channel_detail", map, BrowseType.CONTENT);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.tv.fragment.TvLiveDetailFragment$c */
    public static final class C15478c extends AbstractC0256u {
        C15478c() {
            super(true);
        }

        @Override // androidx.activity.AbstractC0256u
        public void handleOnBackPressed() {
            TvLiveDetailFragment.this.m68694T0();
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.tv.fragment.TvLiveDetailFragment$d */
    public static final class C15479d implements InterfaceC16633f {
        C15479d() {
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d c26907d) {
            InterfaceC16633f.a.m72423a(this, z11, i11, i12, c26907d);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void initPlayer() {
            InterfaceC16633f.a.m72424b(this);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onAliyunDecodeErrorChangeSoftwareDecoder(C23403e c23403e) {
            InterfaceC16633f.a.m72425c(this, c23403e);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onBufferedPosition(long j11, C23403e c23403e) {
            InterfaceC16633f.a.m72426d(this, j11, c23403e);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onCompletion(C23403e c23403e) {
            if (TvLiveDetailFragment.this.isAdded()) {
                TvLiveDetailFragment.this.isVideoPlaying = false;
                TvLiveDetailFragment.this.m68678F1(false);
                TvLiveDetailFragment.this.m68668A1(false);
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onFocusChange(boolean z11) {
            InterfaceC16633f.a.m72429g(this, z11);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onIsPlayingChanged(boolean z11) {
            InterfaceC16633f.a.m72430h(this, z11);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onLoadingBegin(C23403e c23403e) {
            if (TvLiveDetailFragment.this.isAdded()) {
                TvLiveDetailFragment.this.isVideoPlaying = false;
                TvLiveDetailFragment.this.m68699Y0();
                TvLiveDetailFragment.this.m68678F1(true);
                TvLiveDetailFragment.this.m68668A1(false);
                C27827a c27827a = TvLiveDetailFragment.this.playDotLayer;
                if (c27827a != null) {
                    c27827a.m108183c();
                }
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onLoadingEnd(C23403e c23403e) {
            if (TvLiveDetailFragment.this.isAdded()) {
                TvLiveDetailFragment.this.m68699Y0();
                TvLiveDetailFragment.this.m68678F1(false);
                C27827a c27827a = TvLiveDetailFragment.this.playDotLayer;
                if (c27827a != null) {
                    c27827a.m108184d();
                }
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onLoadingProgress(int i11, float f11, C23403e c23403e) {
            InterfaceC16633f.a.m72435m(this, i11, f11, c23403e);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onLoopingStart() {
            InterfaceC16633f.a.m72437o(this);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onMediaItemTransition(String str) {
            InterfaceC16633f.a.m72438p(this, str);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onPlayError(PlayError errorInfo, C23403e c23403e) {
            Intrinsics.m97802h(errorInfo, "errorInfo");
            if (TvLiveDetailFragment.this.isAdded()) {
                TvLiveDetailFragment.this.isVideoPlaying = false;
                TvLiveDetailFragment.this.m68678F1(false);
                TvLiveDetailFragment.this.m68668A1(false);
                TvLiveDetailFragment.this.m68670B1(!C27287m.f83003a.m106330e());
                C27827a c27827a = TvLiveDetailFragment.this.playDotLayer;
                if (c27827a != null) {
                    c27827a.m108185e(errorInfo);
                }
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onPlayerRelease(C23403e c23403e) {
            InterfaceC16633f.a.m72442t(this, c23403e);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onPlayerReset() {
            InterfaceC16633f.a.m72444v(this);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onPrepare(C23403e c23403e) {
            InterfaceC16633f.a.m72445w(this, c23403e);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onProgress(long j11, C23403e c23403e) {
            InterfaceC16633f.a.m72447y(this, j11, c23403e);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onRenderFirstFrame() {
            if (TvLiveDetailFragment.this.isAdded()) {
                TvLiveDetailFragment.this.m68699Y0();
                TvLiveDetailFragment.this.m68678F1(false);
                C27827a c27827a = TvLiveDetailFragment.this.playDotLayer;
                if (c27827a != null) {
                    c27827a.m108187g();
                }
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onSetDataSource() {
            InterfaceC16633f.a.m72413B(this);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onTracksAudioBitrateChange(int i11) {
            InterfaceC16633f.a.m72414C(this, i11);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onTracksChange(C26906c c26906c) {
            InterfaceC16633f.a.m72415D(this, c26906c);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onTracksVideoBitrateChange(int i11) {
            InterfaceC16633f.a.m72416E(this, i11);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onVideoPause(C23403e c23403e) {
            if (TvLiveDetailFragment.this.isAdded()) {
                TvLiveDetailFragment.this.isVideoPlaying = false;
                TvLiveDetailFragment.this.m68668A1(false);
                C27827a c27827a = TvLiveDetailFragment.this.playDotLayer;
                if (c27827a != null) {
                    c27827a.m108188h();
                }
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onVideoSizeChanged(int i11, int i12) {
            InterfaceC16633f.a.m72419H(this, i11, i12);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onVideoStart(C23403e c23403e) {
            if (TvLiveDetailFragment.this.isAdded()) {
                TvLiveDetailFragment.this.isVideoPlaying = true;
                TvLiveDetailFragment.this.m68699Y0();
                TvLiveDetailFragment.this.m68678F1(false);
                TvLiveDetailFragment tvLiveDetailFragment = TvLiveDetailFragment.this;
                tvLiveDetailFragment.m68668A1(tvLiveDetailFragment.isFullscreen);
                C27827a c27827a = TvLiveDetailFragment.this.playDotLayer;
                if (c27827a != null) {
                    c27827a.m108189i();
                }
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void setOnSeekCompleteListener() {
            InterfaceC16633f.a.m72422K(this);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.tv.fragment.TvLiveDetailFragment$e */
    static final class C15480e implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f53487a;

        C15480e(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f53487a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f53487a;
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
            this.f53487a.invoke(obj);
        }
    }

    public TvLiveDetailFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.home.tv.fragment.TvLiveDetailFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.viewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(C15513g.class), new Function0<C3231x0>() { // from class: com.transsion.home.tv.fragment.TvLiveDetailFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.home.tv.fragment.TvLiveDetailFragment$special$$inlined$viewModels$default$3
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
        this.channelDetailAdapter = new C15451h();
        this.exposedStreamUrls = new HashSet();
        this.isOverlayVisible = true;
        this.isLockButtonVisible = true;
        this.loadStartTime = -1L;
        this.isFirstPlay = true;
        this.overlayHandler = new Handler(Looper.getMainLooper());
        this.hideOverlayRunnable = new Runnable() { // from class: com.transsion.home.tv.fragment.x
            @Override // java.lang.Runnable
            public final void run() {
                TvLiveDetailFragment.m68698X0(this.f53518a);
            }
        };
        this.hideLockButtonRunnable = new Runnable() { // from class: com.transsion.home.tv.fragment.y
            @Override // java.lang.Runnable
            public final void run() {
                TvLiveDetailFragment.m68696V0(this.f53519a);
            }
        };
        this.playerListener = new C15479d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public final void m68668A1(boolean autoHide) {
        if (this.isControlsLocked) {
            this.isLockButtonVisible = true;
            m68684I1();
            if (autoHide) {
                m68733u1();
                return;
            } else {
                this.overlayHandler.removeCallbacks(this.hideLockButtonRunnable);
                return;
            }
        }
        this.isOverlayVisible = true;
        this.isLockButtonVisible = true;
        m68684I1();
        if (autoHide) {
            m68735v1();
        } else {
            this.overlayHandler.removeCallbacks(this.hideOverlayRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public final void m68670B1(boolean isNoNet) {
        C24670c0 mViewBinding;
        TextView textView;
        TextView textView2;
        if (isAdded()) {
            FragmentActivity activity = getActivity();
            if (activity == null || !activity.isDestroyed()) {
                FragmentActivity activity2 = getActivity();
                if ((activity2 == null || !activity2.isFinishing()) && (mViewBinding = getMViewBinding()) != null) {
                    if (this.errorLayout == null) {
                        final View viewInflate = mViewBinding.f75397s.inflate();
                        ((TextView) viewInflate.findViewById(R$id.tv_fail_right_btn)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.tv.fragment.u
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                TvLiveDetailFragment.m68672C1(this.f53515a, view);
                            }
                        });
                        ((ImageView) viewInflate.findViewById(R$id.iv_fail_back)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.tv.fragment.v
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                TvLiveDetailFragment.m68674D1(this.f53516a, view);
                            }
                        });
                        ((TextView) viewInflate.findViewById(R$id.tv_fail_left_btn)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.tv.fragment.w
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                TvLiveDetailFragment.m68676E1(viewInflate, view);
                            }
                        });
                        this.errorLayout = viewInflate;
                    }
                    View view = this.errorLayout;
                    if (view != null && (textView2 = (TextView) view.findViewById(R$id.tv_fail_title)) != null) {
                        textView2.setText(getString(isNoNet ? R$string.long_vod_load_failed : com.p282tn.lib.widget.R$string.error_load_failed));
                    }
                    View view2 = this.errorLayout;
                    if (view2 != null && (textView = (TextView) view2.findViewById(R$id.tv_fail_left_btn)) != null) {
                        textView.setVisibility(isNoNet ? 0 : 8);
                    }
                    m68678F1(false);
                    this.overlayHandler.removeCallbacks(this.hideOverlayRunnable);
                    this.overlayHandler.removeCallbacks(this.hideLockButtonRunnable);
                    ORVideoView oRVideoView = this.playerView;
                    if (oRVideoView != null) {
                        oRVideoView.pause();
                    }
                    View view3 = this.errorLayout;
                    if (view3 != null) {
                        view3.setVisibility(0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public static final void m68672C1(TvLiveDetailFragment tvLiveDetailFragment, View view) {
        tvLiveDetailFragment.m68729s1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public static final void m68674D1(TvLiveDetailFragment tvLiveDetailFragment, View view) {
        tvLiveDetailFragment.m68694T0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public static final void m68676E1(View view, View view2) {
        try {
            Result.Companion companion = Result.INSTANCE;
            NetworkUtils.m27175v();
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public final void m68678F1(boolean show) {
        ProgressBar progressBar;
        C24670c0 mViewBinding = getMViewBinding();
        if (mViewBinding == null || (progressBar = mViewBinding.f75389k) == null) {
            return;
        }
        progressBar.setVisibility(show ? 0 : 8);
    }

    /* JADX INFO: renamed from: G1 */
    private final void m68680G1() {
        if (this.isFullscreen) {
            boolean z11 = this.isControlsLocked;
            this.isControlsLocked = !z11;
            if (z11) {
                this.isOverlayVisible = true;
                this.isLockButtonVisible = true;
                this.overlayHandler.removeCallbacks(this.hideLockButtonRunnable);
                m68684I1();
                m68735v1();
                return;
            }
            this.isOverlayVisible = false;
            this.isLockButtonVisible = true;
            this.overlayHandler.removeCallbacks(this.hideOverlayRunnable);
            m68733u1();
            m68684I1();
        }
    }

    /* JADX INFO: renamed from: H1 */
    private final void m68682H1(ORVideoView view) {
        view.removePayerListener(this.playerListener);
    }

    /* JADX WARN: Code duplicated, block: B:96:0x0107  */
    /* JADX INFO: renamed from: I1 */
    private final void m68684I1() {
        boolean z11;
        C24670c0 mViewBinding = getMViewBinding();
        if (mViewBinding != null && isAdded()) {
            FragmentActivity activity = getActivity();
            if (activity == null || !activity.isDestroyed()) {
                FragmentActivity activity2 = getActivity();
                if (activity2 == null || !activity2.isFinishing()) {
                    boolean z12 = this.isFullscreen;
                    boolean z13 = !z12 || (!this.isControlsLocked && this.isOverlayVisible);
                    LinearLayout fsControls = mViewBinding.f75383e;
                    Intrinsics.m97801g(fsControls, "fsControls");
                    fsControls.setVisibility(!z12 || (this.isFullscreen && z13) ? 0 : 8);
                    LinearLayout btnHelp = mViewBinding.f75381c;
                    Intrinsics.m97801g(btnHelp, "btnHelp");
                    btnHelp.setVisibility(!z12 || (this.isFullscreen && z13) ? 0 : 8);
                    ImageView ivBack = mViewBinding.f75384f;
                    Intrinsics.m97801g(ivBack, "ivBack");
                    ivBack.setVisibility(z13 ? 0 : 8);
                    View topGradient = mViewBinding.f75393o;
                    Intrinsics.m97801g(topGradient, "topGradient");
                    topGradient.setVisibility(z13 ? 0 : 8);
                    TextView tvChannelName = mViewBinding.f75394p;
                    Intrinsics.m97801g(tvChannelName, "tvChannelName");
                    tvChannelName.setVisibility(this.isFullscreen && z13 ? 0 : 8);
                    mViewBinding.f75394p.setText(this.currentChannelName);
                    boolean z14 = !z12 || this.isOverlayVisible;
                    View bottomGradient = mViewBinding.f75380b;
                    Intrinsics.m97801g(bottomGradient, "bottomGradient");
                    bottomGradient.setVisibility(z14 ? 0 : 8);
                    BLFrameLayout liveBadge = mViewBinding.f75387i;
                    Intrinsics.m97801g(liveBadge, "liveBadge");
                    liveBadge.setVisibility(z14 ? 0 : 8);
                    ImageView ivFullscreen = mViewBinding.f75385g;
                    Intrinsics.m97801g(ivFullscreen, "ivFullscreen");
                    ivFullscreen.setVisibility(!z12 && z14 ? 0 : 8);
                    LinearLayout tapToLockLayout = mViewBinding.f75392n;
                    Intrinsics.m97801g(tapToLockLayout, "tapToLockLayout");
                    if (this.isFullscreen) {
                        z11 = this.isControlsLocked ? this.isLockButtonVisible : this.isOverlayVisible;
                    }
                    tapToLockLayout.setVisibility(z11 ? 0 : 8);
                    mViewBinding.f75396r.setText(getString(this.isControlsLocked ? com.transsion.baseui.R$string.play_tap_unlock : com.transsion.home.R$string.home_tv_fullscreen_tap_to_lock));
                    mViewBinding.f75386h.setSelected(this.isControlsLocked);
                }
            }
        }
    }

    /* JADX INFO: renamed from: M0 */
    private final void m68688M0(boolean isHide) {
        Window window;
        FragmentActivity fragmentActivityM68731t1 = m68731t1();
        if (fragmentActivityM68731t1 == null || (window = fragmentActivityM68731t1.getWindow()) == null) {
            return;
        }
        WindowCompat.setDecorFitsSystemWindows(window, !isHide);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        if (!isHide) {
            windowInsetsControllerCompat.show(WindowInsetsCompat.Type.systemBars());
        } else {
            windowInsetsControllerCompat.hide(WindowInsetsCompat.Type.systemBars());
            windowInsetsControllerCompat.setSystemBarsBehavior(2);
        }
    }

    /* JADX INFO: renamed from: N0 */
    private final void m68689N0(ORVideoView view) {
        view.addPlayerListener(this.playerListener);
    }

    /* JADX INFO: renamed from: O0 */
    private final void m68690O0() {
        this.isFullscreen = true;
        this.isControlsLocked = false;
        this.isOverlayVisible = true;
        this.isLockButtonVisible = true;
        requireActivity().setRequestedOrientation(6);
        m68688M0(true);
        m68692Q0();
        m68668A1(true);
        HashMap map = new HashMap();
        map.put("module_name", "full_screen");
        map.put(NativeComponentConstants.KEY_COMPONENT_TYPE, RewardPlus.ICON);
        C24662i.f75350a.m96882q("tv_channel_detail", map, ClickType.FEATURE);
    }

    /* JADX INFO: renamed from: P0 */
    private final void m68691P0() {
        this.isFullscreen = false;
        this.isControlsLocked = false;
        this.isOverlayVisible = true;
        this.isLockButtonVisible = true;
        requireActivity().setRequestedOrientation(1);
        m68688M0(false);
        m68727r1();
        this.overlayHandler.removeCallbacks(this.hideOverlayRunnable);
        this.overlayHandler.removeCallbacks(this.hideLockButtonRunnable);
        HashMap map = new HashMap();
        map.put("module_name", "back");
        map.put(NativeComponentConstants.KEY_COMPONENT_TYPE, RewardPlus.ICON);
        C24662i.f75350a.m96882q("tv_channel_detail", map, ClickType.FEATURE);
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m68692Q0() {
        C24670c0 mViewBinding = getMViewBinding();
        if (mViewBinding == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = mViewBinding.f75388j.getLayoutParams();
        ConstraintLayout.C2308b c2308b = layoutParams instanceof ConstraintLayout.C2308b ? (ConstraintLayout.C2308b) layoutParams : null;
        if (c2308b == null) {
            return;
        }
        c2308b.f7934I = null;
        c2308b.f7968i = 0;
        c2308b.f7970j = -1;
        c2308b.f7974l = 0;
        mViewBinding.f75388j.setLayoutParams(c2308b);
        RecyclerView rvChannels = mViewBinding.f75390l;
        Intrinsics.m97801g(rvChannels, "rvChannels");
        rvChannels.setVisibility(8);
        View statusBarPlaceholder = mViewBinding.f75391m;
        Intrinsics.m97801g(statusBarPlaceholder, "statusBarPlaceholder");
        statusBarPlaceholder.setVisibility(8);
        m68684I1();
    }

    /* JADX INFO: renamed from: S0 */
    private final C15513g m68693S0() {
        return (C15513g) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public final void m68694T0() {
        if (this.isFullscreen) {
            m68691P0();
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: U0 */
    private final void m68695U0() {
        if (!m68717m1() && this.isFullscreen) {
            if (!this.isControlsLocked) {
                if (this.isOverlayVisible) {
                    m68697W0();
                    return;
                } else {
                    m68668A1(true);
                    return;
                }
            }
            this.isLockButtonVisible = !this.isLockButtonVisible;
            m68684I1();
            if (this.isLockButtonVisible) {
                m68733u1();
            } else {
                this.overlayHandler.removeCallbacks(this.hideLockButtonRunnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final void m68696V0(TvLiveDetailFragment tvLiveDetailFragment) {
        if (tvLiveDetailFragment.isFullscreen && tvLiveDetailFragment.isControlsLocked && tvLiveDetailFragment.isVideoPlaying) {
            tvLiveDetailFragment.isLockButtonVisible = false;
            tvLiveDetailFragment.m68684I1();
        }
    }

    /* JADX INFO: renamed from: W0 */
    private final void m68697W0() {
        if (this.isControlsLocked) {
            return;
        }
        this.isOverlayVisible = false;
        this.isLockButtonVisible = false;
        this.overlayHandler.removeCallbacks(this.hideOverlayRunnable);
        m68684I1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final void m68698X0(TvLiveDetailFragment tvLiveDetailFragment) {
        if (tvLiveDetailFragment.isFullscreen && !tvLiveDetailFragment.isControlsLocked && tvLiveDetailFragment.isVideoPlaying) {
            tvLiveDetailFragment.isOverlayVisible = false;
            tvLiveDetailFragment.m68684I1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public final void m68699Y0() {
        View view = this.errorLayout;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final void m68700Z0(TvLiveDetailFragment tvLiveDetailFragment) {
        String str = tvLiveDetailFragment.countryCode;
        if (str == null) {
            return;
        }
        tvLiveDetailFragment.m68693S0().m68756k(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final void m68701a1(TvLiveDetailFragment tvLiveDetailFragment, View view) {
        tvLiveDetailFragment.m68668A1(tvLiveDetailFragment.isFullscreen);
        tvLiveDetailFragment.m68694T0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final void m68702b1(TvLiveDetailFragment tvLiveDetailFragment, View view) {
        tvLiveDetailFragment.m68668A1(tvLiveDetailFragment.isFullscreen);
        if (tvLiveDetailFragment.isFullscreen) {
            tvLiveDetailFragment.m68691P0();
        } else {
            tvLiveDetailFragment.m68690O0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final void m68703c1(TvLiveDetailFragment tvLiveDetailFragment, View view) {
        tvLiveDetailFragment.m68668A1(tvLiveDetailFragment.isFullscreen);
        tvLiveDetailFragment.m68719n1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final void m68704d1(TvLiveDetailFragment tvLiveDetailFragment, View view) {
        tvLiveDetailFragment.m68668A1(tvLiveDetailFragment.isFullscreen);
        tvLiveDetailFragment.m68721o1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final void m68705e1(TvLiveDetailFragment tvLiveDetailFragment, View view) {
        tvLiveDetailFragment.m68680G1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final ViewGroup m68706f1(TvLiveDetailFragment tvLiveDetailFragment, FragmentActivity fragmentActivity) {
        if (tvLiveDetailFragment.m68731t1() != null) {
            return (ViewGroup) fragmentActivity.findViewById(R.id.content);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final void m68707g1(TvLiveDetailFragment tvLiveDetailFragment, View view) {
        tvLiveDetailFragment.m68695U0();
    }

    /* JADX INFO: renamed from: h1 */
    private final void m68708h1() {
        FrameLayout frameLayout;
        C24670c0 mViewBinding = getMViewBinding();
        if (mViewBinding == null || (frameLayout = mViewBinding.f75388j) == null) {
            return;
        }
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.tv.fragment.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TvLiveDetailFragment.m68709i1(this.f53507a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final void m68709i1(TvLiveDetailFragment tvLiveDetailFragment, View view) {
        tvLiveDetailFragment.m68695U0();
    }

    private final void initExposureHelper() {
        if (this.exposureHelper != null) {
            return;
        }
        C25646b c25646b = new C25646b(0.6f, new C15477b(), false, 4, null);
        c25646b.m100946l(2);
        this.exposureHelper = c25646b;
    }

    private final void initPlayer() {
        FrameLayout frameLayout;
        final FragmentActivity fragmentActivityM68731t1 = m68731t1();
        if (fragmentActivityM68731t1 == null) {
            return;
        }
        C27827a c27827a = new C27827a();
        c27827a.m108182b();
        this.playDotLayer = c27827a;
        ORVideoView oRVideoView = new ORVideoView(fragmentActivityM68731t1);
        oRVideoView.initCreatePlayer(fragmentActivityM68731t1, C26053g0.f79567a.m102149s());
        oRVideoView.setActivityContainerCallback(new Function0() { // from class: com.transsion.home.tv.fragment.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TvLiveDetailFragment.m68706f1(this.f53489a, fragmentActivityM68731t1);
            }
        });
        m68689N0(oRVideoView);
        oRVideoView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.tv.fragment.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TvLiveDetailFragment.m68707g1(this.f53492a, view);
            }
        });
        this.playerView = oRVideoView;
        C24670c0 mViewBinding = getMViewBinding();
        if (mViewBinding != null && (frameLayout = mViewBinding.f75388j) != null) {
            frameLayout.addView(oRVideoView, new ViewGroup.LayoutParams(-1, -1));
        }
        showLoadingView();
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final Unit m68711j1(TvLiveDetailFragment tvLiveDetailFragment, TvChannelItem tvChannelItem) {
        HashMap mapM96844g;
        if (tvLiveDetailFragment.m68731t1() == null) {
            return Unit.f75682a;
        }
        tvLiveDetailFragment.showContentView();
        if (tvChannelItem == null) {
            C28951b.f88586a.m111454d(com.transsion.home.R$string.home_tv_play_error);
            return Unit.f75682a;
        }
        C24655b logViewConfig = tvLiveDetailFragment.getLogViewConfig();
        if (logViewConfig != null && !logViewConfig.m96846i()) {
            C24655b logViewConfig2 = tvLiveDetailFragment.getLogViewConfig();
            if (logViewConfig2 != null) {
                logViewConfig2.m96848k(true);
            }
            C24655b logViewConfig3 = tvLiveDetailFragment.getLogViewConfig();
            if (logViewConfig3 != null && (mapM96844g = logViewConfig3.m96844g()) != null) {
            }
        }
        tvLiveDetailFragment.channelDetailAdapter.m68591H1(tvChannelItem.getChannelId());
        tvLiveDetailFragment.m68723p1(tvChannelItem);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final Unit m68713k1(TvLiveDetailFragment tvLiveDetailFragment, TvChannelListDataBean tvChannelListDataBean) {
        if (tvChannelListDataBean == null) {
            if (tvLiveDetailFragment.channelDetailAdapter.m36186h0().m108666r()) {
                tvLiveDetailFragment.channelDetailAdapter.m36186h0().m108669v();
            }
            return Unit.f75682a;
        }
        List<TvChannelItem> items = tvChannelListDataBean.getItems();
        if (items == null) {
            items = CollectionsKt.m97506l();
        }
        if (tvLiveDetailFragment.m68693S0().m68754i()) {
            tvLiveDetailFragment.channelDetailAdapter.mo36201n1(items);
        } else {
            tvLiveDetailFragment.channelDetailAdapter.mo36208q(items);
        }
        if (tvLiveDetailFragment.channelDetailAdapter.m36186h0().m108666r()) {
            tvLiveDetailFragment.channelDetailAdapter.m36186h0().m108667s();
        }
        if (!tvLiveDetailFragment.m68693S0().m68753h()) {
            C27941f.m108652u(tvLiveDetailFragment.channelDetailAdapter.m36186h0(), false, 1, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final void m68715l1(TvLiveDetailFragment tvLiveDetailFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        String url;
        StreamItem streamItem;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        TvChannelItem tvChannelItem = (TvChannelItem) tvLiveDetailFragment.channelDetailAdapter.getItem(i11);
        String channelId = tvChannelItem.getChannelId();
        if (channelId == null || channelId.length() == 0) {
            C28951b.f88586a.m111454d(com.transsion.home.R$string.home_tv_play_error);
            return;
        }
        if (Intrinsics.m97797c(channelId, tvLiveDetailFragment.channelId)) {
            return;
        }
        HashMap map = new HashMap();
        List<StreamItem> streams = tvChannelItem.getStreams();
        if (streams == null || (streamItem = streams.get(0)) == null || (url = streamItem.getUrl()) == null) {
            url = "";
        }
        map.put("content_id", url);
        map.put(RequestParameters.POSITION, String.valueOf(i11 + 1));
        C24662i.f75350a.m96882q("tv_channel_detail", map, ClickType.CONTENT);
        C26866a.f81698a.m104912c("TvLiveDetailFragment", "switchChannel channelId=" + channelId, false);
        tvLiveDetailFragment.channelId = channelId;
        tvLiveDetailFragment.m68693S0().m68755j(channelId);
    }

    private final void loadData() {
        this.loadStartTime = System.currentTimeMillis();
        String str = this.channelId;
        if (str != null) {
            m68693S0().m68755j(str);
        }
        String str2 = this.countryCode;
        if (str2 != null) {
            m68693S0().m68757l(str2);
        }
    }

    /* JADX INFO: renamed from: m1 */
    private final boolean m68717m1() {
        View view = this.errorLayout;
        return view != null && view.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: n1 */
    private final void m68719n1() {
        Navigator.m61845x(TheRouter.m61773c("/profile/user_center_labels_feedback").m61857K("feedback_from_page", "SUBJECT_PLAY").m61857K("subject_id", this.channelId), requireContext(), null, 2, null);
    }

    /* JADX INFO: renamed from: o1 */
    private final void m68721o1() {
        Navigator.m61845x(TheRouter.m61773c("/profile/watch_option"), requireContext(), null, 2, null);
    }

    /* JADX INFO: renamed from: p1 */
    private final void m68723p1(TvChannelItem channel) {
        C24670c0 mViewBinding;
        TextView textView;
        StreamItem streamItem;
        List<StreamItem> streams = channel.getStreams();
        String url = (streams == null || (streamItem = (StreamItem) CollectionsKt.m97361k0(streams)) == null) ? null : streamItem.getUrl();
        if (url == null || url.length() == 0) {
            C26866a.f81698a.m104921x("TvLiveDetailFragment", "playStream: stream url is empty for channel=" + channel.getChannelId(), true);
            C28951b.f88586a.m111454d(com.transsion.home.R$string.home_tv_play_error);
            return;
        }
        C26866a.f81698a.m104912c("TvLiveDetailFragment", "playStream url=" + url, false);
        if (this.isFirstPlay) {
            this.isFirstPlay = false;
        } else {
            C27827a c27827a = this.playDotLayer;
            if (c27827a != null) {
                c27827a.m108181a();
            }
        }
        C27827a c27827a2 = this.playDotLayer;
        if (c27827a2 != null) {
            c27827a2.m108186f(url);
        }
        this.currentChannelName = channel.getTitle();
        this.currentChannel = channel;
        m68699Y0();
        m68678F1(true);
        m68668A1(false);
        if (this.isFullscreen && (mViewBinding = getMViewBinding()) != null && (textView = mViewBinding.f75394p) != null) {
            textView.setText(this.currentChannelName);
        }
        C23403e c23403e = new C23403e(String.valueOf(url.hashCode()), url, 0, null, null, 28, null);
        c23403e.m92941r(true);
        c23403e.m92939p(true);
        c23403e.m92942s(true);
        ORVideoView oRVideoView = this.playerView;
        if (oRVideoView != null) {
            oRVideoView.setMediaData(c23403e);
            oRVideoView.prepare();
            oRVideoView.play();
        }
    }

    /* JADX INFO: renamed from: q1 */
    private final void m68725q1() {
        C27827a c27827a = this.playDotLayer;
        if (c27827a != null) {
            c27827a.m108181a();
        }
        this.playDotLayer = null;
        ORVideoView oRVideoView = this.playerView;
        if (oRVideoView != null) {
            m68682H1(oRVideoView);
        }
        ORVideoView oRVideoView2 = this.playerView;
        if (oRVideoView2 != null) {
            oRVideoView2.release();
        }
        this.playerView = null;
        this.isVideoPlaying = false;
        this.currentChannel = null;
        this.errorLayout = null;
        m68678F1(false);
        this.overlayHandler.removeCallbacks(this.hideOverlayRunnable);
        this.overlayHandler.removeCallbacks(this.hideLockButtonRunnable);
    }

    /* JADX INFO: renamed from: r1 */
    private final void m68727r1() {
        C24670c0 mViewBinding = getMViewBinding();
        if (mViewBinding == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = mViewBinding.f75388j.getLayoutParams();
        ConstraintLayout.C2308b c2308b = layoutParams instanceof ConstraintLayout.C2308b ? (ConstraintLayout.C2308b) layoutParams : null;
        if (c2308b == null) {
            return;
        }
        c2308b.f7934I = "h,16:9";
        c2308b.f7968i = -1;
        c2308b.f7970j = com.transsion.home.R$id.statusBarPlaceholder;
        c2308b.f7974l = -1;
        mViewBinding.f75388j.setLayoutParams(c2308b);
        RecyclerView rvChannels = mViewBinding.f75390l;
        Intrinsics.m97801g(rvChannels, "rvChannels");
        rvChannels.setVisibility(0);
        View statusBarPlaceholder = mViewBinding.f75391m;
        Intrinsics.m97801g(statusBarPlaceholder, "statusBarPlaceholder");
        statusBarPlaceholder.setVisibility(0);
        m68684I1();
    }

    /* JADX INFO: renamed from: s1 */
    private final void m68729s1() {
        if (C27287m.f83003a.m106330e()) {
            TvChannelItem tvChannelItem = this.currentChannel;
            if (tvChannelItem != null) {
                m68723p1(tvChannelItem);
                return;
            }
            String str = this.channelId;
            if (str == null || str.length() == 0) {
                C28951b.f88586a.m111454d(com.transsion.home.R$string.home_tv_play_error);
            } else {
                m68693S0().m68755j(str);
            }
        }
    }

    /* JADX INFO: renamed from: t1 */
    private final FragmentActivity m68731t1() {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            return null;
        }
        return activity;
    }

    /* JADX INFO: renamed from: u1 */
    private final void m68733u1() {
        this.overlayHandler.removeCallbacks(this.hideLockButtonRunnable);
        if (this.isFullscreen && this.isControlsLocked && this.isVideoPlaying) {
            this.overlayHandler.postDelayed(this.hideLockButtonRunnable, 3000L);
        }
    }

    /* JADX INFO: renamed from: v1 */
    private final void m68735v1() {
        this.overlayHandler.removeCallbacks(this.hideOverlayRunnable);
        if (this.isFullscreen && !this.isControlsLocked && this.isVideoPlaying) {
            this.overlayHandler.postDelayed(this.hideOverlayRunnable, 3000L);
        }
    }

    /* JADX INFO: renamed from: w1 */
    private final void m68737w1() {
        RecyclerView recyclerView;
        initExposureHelper();
        this.channelDetailAdapter.m68590G1(new Function1() { // from class: com.transsion.home.tv.fragment.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TvLiveDetailFragment.m68739x1(this.f53520a, ((Integer) obj).intValue());
            }
        });
        C24670c0 mViewBinding = getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f75390l) == null) {
            return;
        }
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(this.channelDetailAdapter);
        C25646b c25646b = this.exposureHelper;
        if (c25646b != null) {
            recyclerView.removeOnScrollListener(c25646b);
            recyclerView.addOnScrollListener(c25646b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static final Unit m68739x1(TvLiveDetailFragment tvLiveDetailFragment, int i11) {
        C25646b c25646b;
        RecyclerView recyclerView;
        C24670c0 mViewBinding = tvLiveDetailFragment.getMViewBinding();
        RecyclerView.AbstractC4214m layoutManager = (mViewBinding == null || (recyclerView = mViewBinding.f75390l) == null) ? null : recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null && (c25646b = tvLiveDetailFragment.exposureHelper) != null) {
            c25646b.m100944h(linearLayoutManager, i11, true);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: y1 */
    private final void m68741y1() {
        C24670c0 mViewBinding = getMViewBinding();
        if (mViewBinding == null) {
            return;
        }
        final RecyclerView rvChannels = mViewBinding.f75390l;
        Intrinsics.m97801g(rvChannels, "rvChannels");
        final int paddingBottom = rvChannels.getPaddingBottom();
        ViewCompat.setOnApplyWindowInsetsListener(mViewBinding.getRoot(), new OnApplyWindowInsetsListener() { // from class: com.transsion.home.tv.fragment.t
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return TvLiveDetailFragment.m68743z1(rvChannels, paddingBottom, view, windowInsetsCompat);
            }
        });
        ViewCompat.requestApplyInsets(mViewBinding.getRoot());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public static final WindowInsetsCompat m68743z1(RecyclerView recyclerView, int i11, View view, WindowInsetsCompat insets) {
        Intrinsics.m97802h(view, "<unused var>");
        Intrinsics.m97802h(insets, "insets");
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), i11 + insets.getInsets(WindowInsetsCompat.Type.navigationBars()).f88818d);
        return insets;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public C24670c0 getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C24670c0 c24670c0M96910c = C24670c0.m96910c(inflater);
        Intrinsics.m97801g(c24670c0M96910c, "inflate(...)");
        return c24670c0M96910c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getLoadingView() {
        return LayoutInflater.from(requireContext()).inflate(R$layout.default_tv_live_detail_skeleton_drawing_layout, (ViewGroup) getFlStateView(), false);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        C24670c0 mViewBinding = getMViewBinding();
        if (mViewBinding == null) {
            return;
        }
        mViewBinding.f75384f.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.tv.fragment.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TvLiveDetailFragment.m68701a1(this.f53499a, view);
            }
        });
        mViewBinding.f75385g.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.tv.fragment.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TvLiveDetailFragment.m68702b1(this.f53508a, view);
            }
        });
        mViewBinding.f75381c.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.tv.fragment.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TvLiveDetailFragment.m68703c1(this.f53509a, view);
            }
        });
        mViewBinding.f75382d.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.tv.fragment.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TvLiveDetailFragment.m68704d1(this.f53510a, view);
            }
        });
        mViewBinding.f75392n.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.tv.fragment.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TvLiveDetailFragment.m68705e1(this.f53511a, view);
            }
        });
        this.channelDetailAdapter.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.home.tv.fragment.s
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                TvLiveDetailFragment.m68700Z0(this.f53512a);
            }
        });
        requireActivity().getOnBackPressedDispatcher().m942i(this, new C15478c());
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        View view;
        View view2;
        ViewGroup.LayoutParams layoutParams;
        C24670c0 mViewBinding = getMViewBinding();
        if (mViewBinding != null && (view2 = mViewBinding.f75391m) != null && (layoutParams = view2.getLayoutParams()) != null) {
            layoutParams.height = AbstractC5781d.m27351c();
        }
        C24670c0 mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (view = mViewBinding2.f75391m) != null) {
            view.requestLayout();
        }
        m68737w1();
        m68741y1();
        initPlayer();
        m68708h1();
        m68684I1();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m68693S0().m68751e().m14851j(getViewLifecycleOwner(), new C15480e(new Function1() { // from class: com.transsion.home.tv.fragment.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TvLiveDetailFragment.m68711j1(this.f53494a, (TvChannelItem) obj);
            }
        }));
        m68693S0().m68752f().m14851j(getViewLifecycleOwner(), new C15480e(new Function1() { // from class: com.transsion.home.tv.fragment.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TvLiveDetailFragment.m68713k1(this.f53495a, (TvChannelListDataBean) obj);
            }
        }));
        this.channelDetailAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.home.tv.fragment.e0
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                TvLiveDetailFragment.m68715l1(this.f53497a, baseQuickAdapter, view, i11);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isRegisteDeviceKeyMonitor() {
        return true;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("tv_channel_detail", false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (this.isFullscreen) {
            m68691P0();
        } else {
            m68688M0(false);
        }
        super.onDestroyView();
        m68725q1();
        C25646b c25646b = this.exposureHelper;
        if (c25646b != null) {
            c25646b.m100943e();
        }
        this.exposureHelper = null;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        List<StreamItem> streams;
        StreamItem streamItem;
        String url;
        C27827a c27827a;
        super.onResume();
        m68688M0(this.isFullscreen);
        ORVideoView oRVideoView = this.playerView;
        if ((oRVideoView == null || !oRVideoView.isComplete()) && !m68717m1()) {
            ORVideoView oRVideoView2 = this.playerView;
            if (oRVideoView2 != null) {
                oRVideoView2.play();
            }
            TvChannelItem tvChannelItem = this.currentChannel;
            if (tvChannelItem != null && (streams = tvChannelItem.getStreams()) != null && (streamItem = (StreamItem) CollectionsKt.m97361k0(streams)) != null && (url = streamItem.getUrl()) != null && (c27827a = this.playDotLayer) != null) {
                c27827a.m108186f(url);
            }
        }
        if (this.isFullscreen) {
            m68735v1();
            m68733u1();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ORVideoView oRVideoView = this.playerView;
        if (oRVideoView != null) {
            oRVideoView.pause();
        }
        C25646b c25646b = this.exposureHelper;
        if (c25646b != null) {
            c25646b.m100943e();
        }
        this.overlayHandler.removeCallbacks(this.hideOverlayRunnable);
        this.overlayHandler.removeCallbacks(this.hideLockButtonRunnable);
        FragmentActivity activity = getActivity();
        if (activity != null && activity.isFinishing()) {
            m68725q1();
            return;
        }
        C27827a c27827a = this.playDotLayer;
        if (c27827a != null) {
            c27827a.m108181a();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        Bundle arguments = getArguments();
        this.channelId = arguments != null ? arguments.getString(TmcStartParams.KEY_CHANNEL_ID) : null;
        Bundle arguments2 = getArguments();
        this.countryCode = arguments2 != null ? arguments2.getString("countryCode") : null;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        loadData();
    }
}
