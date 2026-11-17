package com.transsion.postdetail.p306ui.fragment;

import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.AbstractC0256u;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3233y0;
import androidx.recyclerview.widget.RecyclerView;
import ch.C5096b;
import com.blankj.utilcode.util.AbstractC5781d;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.view.AbstractC13772o;
import com.p282tn.lib.view.DefaultView;
import com.p282tn.lib.widget.R$mipmap;
import com.p282tn.lib.widget.TnTextView;
import com.therouter.TheRouter;
import com.transsion.baselib.report.C14486e;
import com.transsion.baselib.report.C14489h;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.moviedetailapi.bean.ShortTVItem;
import com.transsion.moviedetailapi.bean.ShortTVRespData;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.Video;
import com.transsion.p285ad.bidding.nativead.BiddingListManager;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.player.config.RenderType;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.postdetail.R$string;
import com.transsion.postdetail.control.C16765a;
import com.transsion.postdetail.control.SubjectVideoPagerChangeControl;
import com.transsion.postdetail.helper.ShortTvImmVideoHelper;
import com.transsion.postdetail.p306ui.adapter.C16988l;
import com.transsion.postdetail.p306ui.fragment.preload.VideoImmersiveDataLoader;
import com.transsion.postdetail.p306ui.view.ImmVideoLoadMoreView;
import com.transsion.postdetail.p306ui.view.ImmVideoNoNetworkView;
import com.transsion.postdetail.viewmodel.C17535x;
import com.transsion.postdetail.viewmodel.ImmVideoRequestEntity;
import com.transsion.shorttv.base.pager.PagerLayoutManager;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import ng.AbstractC26006c;
import p328cp.C22762b;
import p352dn.InterfaceC22998b;
import p352dn.InterfaceC23002f;
import p438go.C23622d;
import p550kj.C24655b;
import p654oo.C26372e;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p843vm.C28135e;
import p844vo.C28174s;
import p888wy.C28465b;
import p944yh.C28951b;
import p946yj.C28958a;
import p946yj.C28959b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0087\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001BB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0005J\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u0005J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\u0005J\u0017\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J!\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b1\u00102J!\u00103\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b3\u00102J\u000f\u00104\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u0010\u0005J\u000f\u00105\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010\u0005J\u000f\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u0010\u0005J\u0017\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0006H\u0016¢\u0006\u0004\b;\u0010\u0005J\u000f\u0010<\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010\u0005J\u000f\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010\u0005J\u0017\u0010?\u001a\u00020\u00062\u0006\u0010>\u001a\u00020)H\u0016¢\u0006\u0004\b?\u0010,J\u000f\u0010@\u001a\u00020\u0006H\u0016¢\u0006\u0004\b@\u0010\u0005R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010F\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010CR\u0016\u0010I\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010L\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR$\u0010R\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010C\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010CR\u0016\u0010V\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010HR\u0016\u0010X\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010KR\u001b\u0010^\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010n\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010r\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010t\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010KR\u0016\u0010v\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010KR\u0016\u0010x\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010KR\u0016\u0010z\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010HR%\u0010\u0082\u0001\u001a\u00020{8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u0088\u0001"}, m97100d2 = {"Lcom/transsion/postdetail/ui/fragment/ShortTvVideoFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lvo/s;", "Ldn/f;", "<init>", "()V", "", "initPlayer", "initAdapter", "initViewModel", "initBack", "observeRemoveVideo", "Lcom/transsion/moviedetailapi/bean/ShortTVRespData;", "subjectBean", "L0", "(Lcom/transsion/moviedetailapi/bean/ShortTVRespData;)V", "showNotNetError", "showEmpty", "Landroid/content/Context;", "context", "Landroid/view/View;", "getEmptyView", "(Landroid/content/Context;)Landroid/view/View;", "getNotNetErrorView", "hideProgress", "showProgress", "loadMore", "loadData", "doLoadData", "", "it", "scrollToPosition", "(I)V", "initAd", "J0", "(Landroid/content/Context;)V", "initNonAd", "Landroid/view/LayoutInflater;", "inflater", "y0", "(Landroid/view/LayoutInflater;)Lvo/s;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "initData", "lazyLoadData", "onResume", "onPause", "", "hidden", "onHiddenChanged", "(Z)V", "logPause", "logResume", "onDestroy", "outState", "onSaveInstanceState", "onMemberStateChange", "", "a", "Ljava/lang/String;", "mPostId", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "mItemType", "c", "I", "mTabId", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Z", "fromComment", "e", "getTran_ops", "()Ljava/lang/String;", "setTran_ops", "(Ljava/lang/String;)V", "tran_ops", "f", "mNextPage", "g", "mPerPage", "h", "videoLoadMore", "Lcom/transsion/postdetail/viewmodel/x;", "i", "Lkotlin/Lazy;", "v0", "()Lcom/transsion/postdetail/viewmodel/x;", "mVideoViewModel", "Lcom/transsion/shorttv/base/pager/PagerLayoutManager;", "j", "Lcom/transsion/shorttv/base/pager/PagerLayoutManager;", "mPagerLayoutManager", "Lcom/transsion/postdetail/control/SubjectVideoPagerChangeControl;", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/postdetail/control/SubjectVideoPagerChangeControl;", "mPagerChangeControl", "Lcom/transsion/postdetail/ui/adapter/l;", "l", "Lcom/transsion/postdetail/ui/adapter/l;", "mAdapter", "Lcom/transsion/player/orplayer/g;", "m", "Lcom/transsion/player/orplayer/g;", "mOrPlayer", "Lcom/transsion/player/ui/ORPlayerView;", "n", "Lcom/transsion/player/ui/ORPlayerView;", "mOrPlayerView", "o", "isLoadingData", TtmlNode.TAG_P, "isFirstLoadMore", CampaignEx.JSON_KEY_AD_Q, "attachToMain", CampaignEx.JSON_KEY_AD_R, "savedCurrentIndex", "", "s", "J", "getResumeTimeStamp", "()J", "setResumeTimeStamp", "(J)V", "resumeTimeStamp", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "t", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "v3ListManager", TmcStartParams.KEY_URL_SHORT, "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTvVideoFragment extends BaseFragment<C28174s> implements InterfaceC23002f {

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mTabId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean fromComment;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String tran_ops;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean videoLoadMore;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Lazy mVideoViewModel;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private PagerLayoutManager mPagerLayoutManager;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private SubjectVideoPagerChangeControl mPagerChangeControl;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private C16988l mAdapter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private InterfaceC16634g mOrPlayer;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private ORPlayerView mOrPlayerView;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean isLoadingData;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean isFirstLoadMore;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean attachToMain;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private int savedCurrentIndex;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private long resumeTimeStamp;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private BiddingListManager v3ListManager;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String mPostId = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String mItemType = "";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String mNextPage = "1";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int mPerPage = 5;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.ShortTvVideoFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ShortTvVideoFragment m74509a(Context context, String str, String str2, Integer num, boolean z11, boolean z12, String str3, boolean z13) {
            String string;
            Intrinsics.m97802h(context, "context");
            ShortTvVideoFragment shortTvVideoFragment = new ShortTvVideoFragment();
            shortTvVideoFragment.m74479J0(context);
            ImmVideoRequestEntity immVideoRequestEntity = new ImmVideoRequestEntity();
            immVideoRequestEntity.setPage("1");
            immVideoRequestEntity.setPerPage(5);
            immVideoRequestEntity.setSessionId(C5096b.f17579a.m23868h());
            Uri uriM65300c = C14489h.f50945a.m65300c();
            if (uriM65300c == null || (string = uriM65300c.toString()) == null) {
                string = "";
            }
            immVideoRequestEntity.setDeepLink(string);
            immVideoRequestEntity.setUserPrefer("");
            immVideoRequestEntity.setLatest_events(new C28958a(C28959b.f88597a.m111468e()));
            immVideoRequestEntity.setPostId("0");
            immVideoRequestEntity.setTabId(num != null ? num.intValue() : 0);
            immVideoRequestEntity.setImmersiveRecType(1);
            shortTvVideoFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("id", str), TuplesKt.m97108a("item_type", str2), TuplesKt.m97108a("tab_id", num), TuplesKt.m97108a("video_load_more", Boolean.valueOf(z11)), TuplesKt.m97108a("from_comment", Boolean.valueOf(z12)), TuplesKt.m97108a("rec_ops", str3), TuplesKt.m97108a("attach_to_main", Boolean.valueOf(z13)), TuplesKt.m97108a("yy_preload_id", Integer.valueOf(C28135e.f86323a.m109268c(new VideoImmersiveDataLoader(immVideoRequestEntity))))));
            return shortTvVideoFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.ShortTvVideoFragment$b */
    public static final class C17077b extends AbstractC0256u {
        C17077b() {
            super(true);
        }

        @Override // androidx.activity.AbstractC0256u
        public void handleOnBackPressed() {
            FragmentActivity activity = ShortTvVideoFragment.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.ShortTvVideoFragment$c */
    public static final class C17078c implements InterfaceC27288n {
        C17078c() {
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected() {
            InterfaceC27288n.a.m106338a(this);
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
            C27941f c27941fM36186h0;
            Intrinsics.m97802h(network, "network");
            Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
            if (((ShortTVRespData) ShortTvVideoFragment.this.m74503v0().m75166l().m14847f()) == null) {
                ShortTvVideoFragment.this.loadData();
                return;
            }
            C16988l c16988l = ShortTvVideoFragment.this.mAdapter;
            if (((c16988l == null || (c27941fM36186h0 = c16988l.m36186h0()) == null) ? null : c27941fM36186h0.m108661i()) == LoadMoreStatus.Fail) {
                ShortTvVideoFragment.this.loadMore();
            }
        }

        @Override // p743rh.InterfaceC27288n
        public void onDisconnected() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.ShortTvVideoFragment$d */
    static final class C17079d implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f57276a;

        C17079d(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f57276a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f57276a;
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
            this.f57276a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.ShortTvVideoFragment$onDestroy$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.ui.fragment.ShortTvVideoFragment$onDestroy$1", m97637f = "ShortTvVideoFragment.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C170801 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        int label;

        C170801(Continuation<? super C170801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ShortTvVideoFragment.this.new C170801(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C170801) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            InterfaceC16634g interfaceC16634g = ShortTvVideoFragment.this.mOrPlayer;
            if (interfaceC16634g != null) {
                interfaceC16634g.stop();
            }
            InterfaceC16634g interfaceC16634g2 = ShortTvVideoFragment.this.mOrPlayer;
            if (interfaceC16634g2 != null) {
                interfaceC16634g2.release();
            }
            return Unit.f75682a;
        }
    }

    public ShortTvVideoFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.postdetail.ui.fragment.ShortTvVideoFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.mVideoViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(C17535x.class), new Function0<C3231x0>() { // from class: com.transsion.postdetail.ui.fragment.ShortTvVideoFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.postdetail.ui.fragment.ShortTvVideoFragment$special$$inlined$viewModels$default$3
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
        this.isFirstLoadMore = true;
        this.savedCurrentIndex = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final void m74470A0(final ShortTvVideoFragment shortTvVideoFragment) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        if (!C27287m.f83003a.m106330e()) {
            C28174s mViewBinding = shortTvVideoFragment.getMViewBinding();
            if (mViewBinding == null || (recyclerView = mViewBinding.f86618d) == null) {
                return;
            }
            recyclerView.postDelayed(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.i5
                @Override // java.lang.Runnable
                public final void run() {
                    ShortTvVideoFragment.m74472C0(this.f57371a);
                }
            }, 500L);
            return;
        }
        if (shortTvVideoFragment.isFirstLoadMore) {
            shortTvVideoFragment.isFirstLoadMore = false;
            shortTvVideoFragment.loadMore();
            return;
        }
        C28174s mViewBinding2 = shortTvVideoFragment.getMViewBinding();
        if (mViewBinding2 == null || (recyclerView2 = mViewBinding2.f86618d) == null) {
            return;
        }
        recyclerView2.postDelayed(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.h5
            @Override // java.lang.Runnable
            public final void run() {
                ShortTvVideoFragment.m74471B0(this.f57364a);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final void m74471B0(ShortTvVideoFragment shortTvVideoFragment) {
        shortTvVideoFragment.loadMore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final void m74472C0(ShortTvVideoFragment shortTvVideoFragment) {
        C27941f c27941fM36186h0;
        shortTvVideoFragment.isLoadingData = false;
        C16988l c16988l = shortTvVideoFragment.mAdapter;
        if (c16988l == null || (c27941fM36186h0 = c16988l.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final void m74473D0(ShortTvVideoFragment shortTvVideoFragment, View view) {
        shortTvVideoFragment.requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final Unit m74474E0(ShortTvVideoFragment shortTvVideoFragment, ShortTVRespData shortTVRespData) {
        C27941f c27941fM36186h0;
        C16988l c16988l;
        C27941f c27941fM36186h1;
        List<Object> data;
        shortTvVideoFragment.isLoadingData = false;
        if (shortTVRespData == null) {
            C16988l c16988l2 = shortTvVideoFragment.mAdapter;
            if (c16988l2 == null || (data = c16988l2.getData()) == null || data.size() != 0) {
                C16988l c16988l3 = shortTvVideoFragment.mAdapter;
                if (c16988l3 != null && (c27941fM36186h0 = c16988l3.m36186h0()) != null && c27941fM36186h0.m108666r() && (c16988l = shortTvVideoFragment.mAdapter) != null && (c27941fM36186h1 = c16988l.m36186h0()) != null) {
                    c27941fM36186h1.m108669v();
                }
            } else if (C27287m.f83003a.m106330e()) {
                shortTvVideoFragment.showEmpty();
            } else {
                shortTvVideoFragment.showNotNetError();
            }
        } else {
            shortTvVideoFragment.m74481L0(shortTVRespData);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final Unit m74475F0(ShortTvVideoFragment shortTvVideoFragment, String str) {
        if (TextUtils.equals("0", str)) {
            C28465b.f87467a.m109954a().m109949e(shortTvVideoFragment.mPostId);
            FragmentActivity activity = shortTvVideoFragment.getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else {
            C28951b.a aVar = C28951b.f88586a;
            FragmentActivity activity2 = shortTvVideoFragment.getActivity();
            aVar.m111455e(activity2 != null ? activity2.getString(R$string.delete_post_failed) : null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final Unit m74476G0(ShortTvVideoFragment shortTvVideoFragment, List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            shortTvVideoFragment.showProgress();
            shortTvVideoFragment.loadData();
        } else {
            shortTvVideoFragment.m74481L0(new ShortTVRespData(CollectionsKt.m97343U0(list2), null, false));
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final Unit m74477H0(final ShortTvVideoFragment shortTvVideoFragment, final Integer num) {
        RecyclerView recyclerView;
        try {
            if (num.intValue() >= 0) {
                SubjectVideoPagerChangeControl subjectVideoPagerChangeControl = shortTvVideoFragment.mPagerChangeControl;
                if (subjectVideoPagerChangeControl != null) {
                    subjectVideoPagerChangeControl.m72969r();
                }
                C16988l c16988l = shortTvVideoFragment.mAdapter;
                if (c16988l != null) {
                    Intrinsics.m97799e(num);
                    c16988l.mo36138G0(num.intValue());
                }
                C28174s mViewBinding = shortTvVideoFragment.getMViewBinding();
                if (mViewBinding != null && (recyclerView = mViewBinding.f86618d) != null) {
                    recyclerView.post(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.j5
                        @Override // java.lang.Runnable
                        public final void run() {
                            ShortTvVideoFragment.m74478I0(this.f57378a, num);
                        }
                    });
                }
            }
        } catch (Throwable unused) {
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final void m74478I0(ShortTvVideoFragment shortTvVideoFragment, Integer num) {
        RecyclerView.AbstractC4203b0 abstractC4203b0FindViewHolderForAdapterPosition;
        RecyclerView recyclerView;
        Integer numValueOf;
        C28174s mViewBinding = shortTvVideoFragment.getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f86618d) == null) {
            abstractC4203b0FindViewHolderForAdapterPosition = null;
        } else {
            C16988l c16988l = shortTvVideoFragment.mAdapter;
            if (c16988l != null) {
                int iM36174a0 = c16988l.m36174a0();
                Intrinsics.m97799e(num);
                numValueOf = Integer.valueOf(iM36174a0 + num.intValue());
            } else {
                numValueOf = num;
            }
            Intrinsics.m97799e(numValueOf);
            abstractC4203b0FindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(numValueOf.intValue());
        }
        SubjectVideoPagerChangeControl subjectVideoPagerChangeControl = shortTvVideoFragment.mPagerChangeControl;
        if (subjectVideoPagerChangeControl != null) {
            Intrinsics.m97799e(num);
            subjectVideoPagerChangeControl.mo72960f(num.intValue(), true, abstractC4203b0FindViewHolderForAdapterPosition != null ? abstractC4203b0FindViewHolderForAdapterPosition.itemView : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public final void m74479J0(Context context) {
        ShortTvImmVideoHelper.f56366k.m73053a().m73050v(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final void m74480K0(ShortTvVideoFragment shortTvVideoFragment, int i11) {
        PagerLayoutManager pagerLayoutManager = shortTvVideoFragment.mPagerLayoutManager;
        if (pagerLayoutManager != null) {
            View viewM79145T = pagerLayoutManager.m79145T();
            if (viewM79145T != null) {
                C26866a.a.m104905r(C26866a.f81698a, "ShortTvImmVideoPlayer", new String[]{"initView2， scrollToPosition ：" + i11}, false, 4, null);
                SubjectVideoPagerChangeControl subjectVideoPagerChangeControl = shortTvVideoFragment.mPagerChangeControl;
                if (subjectVideoPagerChangeControl != null) {
                    subjectVideoPagerChangeControl.mo72960f(i11, true, viewM79145T);
                    return;
                }
                return;
            }
            int childCount = pagerLayoutManager.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = pagerLayoutManager.getChildAt(i12);
                if (childAt != null && pagerLayoutManager.getPosition(childAt) == i11) {
                    C26866a.a.m104905r(C26866a.f81698a, "ShortTvImmVideoPlayer", new String[]{"initView， scrollToPosition ：" + i11}, false, 4, null);
                    SubjectVideoPagerChangeControl subjectVideoPagerChangeControl2 = shortTvVideoFragment.mPagerChangeControl;
                    if (subjectVideoPagerChangeControl2 != null) {
                        subjectVideoPagerChangeControl2.mo72960f(i11, true, childAt);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    private final void m74481L0(ShortTVRespData subjectBean) {
        String nextPage;
        C16988l c16988l;
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        C16988l c16988l2;
        C27941f c27941fM36186h2;
        String url;
        Media video;
        hideProgress();
        Pager pager = subjectBean.getPager();
        if (pager == null || (nextPage = pager.getNextPage()) == null) {
            nextPage = "1";
        }
        this.mNextPage = nextPage;
        List<Subject> items = subjectBean.getItems();
        if (items != null) {
            Iterator<Subject> it = items.iterator();
            while (it.hasNext()) {
                Subject next = it.next();
                ShortTVItem shortTVFirstEp = next.getShortTVFirstEp();
                if (((shortTVFirstEp == null || (video = shortTVFirstEp.getVideo()) == null) ? null : video.getVideoAddress()) != null) {
                    ShortTVItem shortTVFirstEp2 = next.getShortTVFirstEp();
                    Media video2 = shortTVFirstEp2 != null ? shortTVFirstEp2.getVideo() : null;
                    Intrinsics.m97799e(video2);
                    Video videoAddress = video2.getVideoAddress();
                    if (videoAddress == null || (url = videoAddress.getUrl()) == null || url.length() != 0) {
                    }
                }
                it.remove();
            }
            C16988l c16988l3 = this.mAdapter;
            List<Object> data = c16988l3 != null ? c16988l3.getData() : null;
            ArrayList arrayList = new ArrayList();
            if (data == null || !(!data.isEmpty())) {
                arrayList.addAll(items);
            } else {
                Iterator<Subject> it2 = items.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
            }
            SubjectVideoPagerChangeControl subjectVideoPagerChangeControl = this.mPagerChangeControl;
            if (subjectVideoPagerChangeControl != null) {
                subjectVideoPagerChangeControl.mo72961g(arrayList);
            }
            SubjectVideoPagerChangeControl subjectVideoPagerChangeControl2 = this.mPagerChangeControl;
            if (subjectVideoPagerChangeControl2 != null) {
                subjectVideoPagerChangeControl2.m72966o();
            }
            if (this.attachToMain) {
                ShortTvImmVideoHelper shortTvImmVideoHelperM73053a = ShortTvImmVideoHelper.f56366k.m73053a();
                C16988l c16988l4 = this.mAdapter;
                shortTvImmVideoHelperM73053a.m73052z(c16988l4 != null ? c16988l4.getData() : null);
            }
        }
        C16988l c16988l5 = this.mAdapter;
        if (c16988l5 != null && (c27941fM36186h1 = c16988l5.m36186h0()) != null && c27941fM36186h1.m108666r() && (c16988l2 = this.mAdapter) != null && (c27941fM36186h2 = c16988l2.m36186h0()) != null) {
            c27941fM36186h2.m108667s();
        }
        Pager pager2 = subjectBean.getPager();
        if ((pager2 != null ? Intrinsics.m97797c(pager2.getHasMore(), Boolean.FALSE) : false) && (c16988l = this.mAdapter) != null && (c27941fM36186h0 = c16988l.m36186h0()) != null) {
            C27941f.m108652u(c27941fM36186h0, false, 1, null);
        }
        int i11 = this.savedCurrentIndex;
        if (i11 >= 0) {
            scrollToPosition(i11);
            this.savedCurrentIndex = -1;
        }
    }

    private final void doLoadData() {
        if (this.isLoadingData) {
            return;
        }
        this.isLoadingData = true;
        m74503v0().m75165k(this.mPostId, this.mTabId, this.mNextPage, this.mPerPage, 1);
    }

    private final View getEmptyView(Context context) {
        final DefaultView defaultView = new DefaultView(context, DefaultView.ModelStyle.MODEL_STYLE_NIGHT);
        defaultView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        defaultView.setGravity(17);
        defaultView.setDefaultImageViewVisibility(0);
        defaultView.setDefaultImage(R$mipmap.ic_no_content);
        String string = context.getString(com.p282tn.lib.widget.R$string.no_content);
        Intrinsics.m97801g(string, "getString(...)");
        defaultView.setDescText(string);
        defaultView.setStyle(DefaultView.DefaultViewStyle.STYLE_IMAGE_DESC_BTN);
        defaultView.setBtnVisibility(0);
        String string2 = context.getString(com.transsion.baseui.R$string.retry_text);
        Intrinsics.m97801g(string2, "getString(...)");
        defaultView.setBtnText(string2);
        defaultView.setBtnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.fragment.p5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTvVideoFragment.m74502u0(this.f57420a, defaultView, view);
            }
        });
        defaultView.setVisibility(0);
        return defaultView;
    }

    private final View getNotNetErrorView(Context context) {
        final ImmVideoNoNetworkView immVideoNoNetworkView = new ImmVideoNoNetworkView(context);
        AbstractC26006c.m102052e(immVideoNoNetworkView);
        immVideoNoNetworkView.retry(new Function0() { // from class: com.transsion.postdetail.ui.fragment.m5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvVideoFragment.m74504w0(immVideoNoNetworkView, this);
            }
        });
        immVideoNoNetworkView.goToSetting(new Function0() { // from class: com.transsion.postdetail.ui.fragment.n5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvVideoFragment.m74505x0();
            }
        });
        AbstractC13772o.m62233a("shorttv_detail_video");
        return immVideoNoNetworkView;
    }

    private final void hideProgress() {
    }

    private final void initAd() {
        BiddingListManager biddingListManager = new BiddingListManager();
        this.v3ListManager = biddingListManager;
        C28174s mViewBinding = getMViewBinding();
        biddingListManager.m63184F(mViewBinding != null ? mViewBinding.f86618d : null);
        BiddingListManager biddingListManager2 = this.v3ListManager;
        if (biddingListManager2 != null) {
            biddingListManager2.m63179A(AbstractC3226v.m14968a(this));
        }
        BiddingListManager biddingListManager3 = this.v3ListManager;
        if (biddingListManager3 != null) {
            biddingListManager3.m63185G("VideoForYouListScene");
        }
        BiddingListManager biddingListManager4 = this.v3ListManager;
        if (biddingListManager4 != null) {
            biddingListManager4.m63192z(new Function2() { // from class: com.transsion.postdetail.ui.fragment.q5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShortTvVideoFragment.m74506z0(this.f57443a, ((Integer) obj).intValue(), (BiddingNativeManager) obj2);
                }
            });
        }
    }

    private final void initAdapter() {
        C16988l c16988l = new C16988l(new ArrayList(), this, this.mPostId, this.mItemType, this.attachToMain);
        c16988l.m36186h0().m108673z(this.videoLoadMore);
        if (this.videoLoadMore) {
            c16988l.m36186h0().m108655C(new ImmVideoLoadMoreView());
            c16988l.m36186h0().m108673z(true);
            c16988l.m36186h0().m108672y(true);
            c16988l.m36186h0().m108657E(2);
            c16988l.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.postdetail.ui.fragment.s5
                @Override // p765s6.InterfaceC27568f
                /* JADX INFO: renamed from: a */
                public final void mo63874a() {
                    ShortTvVideoFragment.m74470A0(this.f57457a);
                }
            });
        }
        this.mAdapter = c16988l;
    }

    private final void initBack() {
        AppCompatImageView appCompatImageView;
        TnTextView tnTextView;
        AppCompatImageView appCompatImageView2;
        ConstraintLayout constraintLayout;
        C28174s mViewBinding = getMViewBinding();
        ViewGroup.LayoutParams layoutParams = (mViewBinding == null || (constraintLayout = mViewBinding.f86619e) == null) ? null : constraintLayout.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).topMargin = AbstractC5781d.m27351c();
        if (this.mPostId.length() == 0) {
            C28174s mViewBinding2 = getMViewBinding();
            if (mViewBinding2 == null || (appCompatImageView2 = mViewBinding2.f86616b) == null) {
                return;
            }
            AbstractC26006c.m102054g(appCompatImageView2);
            return;
        }
        C28174s mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (tnTextView = mViewBinding3.f86620f) != null) {
            AbstractC26006c.m102054g(tnTextView);
        }
        C28174s mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (appCompatImageView = mViewBinding4.f86616b) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.fragment.r5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShortTvVideoFragment.m74473D0(this.f57450a, view);
                }
            });
        }
        requireActivity().getOnBackPressedDispatcher().m942i(this, new C17077b());
    }

    private final void initNonAd() {
    }

    private final void initPlayer() {
        InterfaceC16634g interfaceC16634gM72449a;
        C22762b c22762b = C22762b.f69089a;
        if (c22762b.m90696b()) {
            interfaceC16634gM72449a = new C26372e(null, 1, null);
            interfaceC16634gM72449a.setLooping(true);
            interfaceC16634gM72449a.prepare();
            interfaceC16634gM72449a.play();
        } else {
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            interfaceC16634gM72449a = new InterfaceC16634g.a(contextRequireContext).m72450b(new C23622d(null, false, 0, 0, 0, 0, 0, 0, 0L, 0, 0, false, true, false, false, false, null, 126975, null)).m72449a();
        }
        this.mOrPlayer = interfaceC16634gM72449a;
        if (c22762b.m90696b()) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
            ORPlayerView oRPlayerView = new ORPlayerView(fragmentActivityRequireActivity, RenderType.SURFACE_VIEW);
            this.mOrPlayerView = oRPlayerView;
            InterfaceC16634g interfaceC16634g = this.mOrPlayer;
            if (interfaceC16634g != null) {
                interfaceC16634g.setSurfaceView(oRPlayerView.getSurface());
            }
        } else {
            FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
            Intrinsics.m97801g(fragmentActivityRequireActivity2, "requireActivity(...)");
            ORPlayerView oRPlayerView2 = new ORPlayerView(fragmentActivityRequireActivity2, RenderType.TEXTURE_VIEW);
            this.mOrPlayerView = oRPlayerView2;
            InterfaceC16634g interfaceC16634g2 = this.mOrPlayer;
            if (interfaceC16634g2 != null) {
                interfaceC16634g2.setTextureView(oRPlayerView2.getTextureView());
            }
        }
        InterfaceC16634g interfaceC16634g3 = this.mOrPlayer;
        if (interfaceC16634g3 != null) {
            interfaceC16634g3.setLooping(true);
        }
    }

    private final void initViewModel() {
        m74503v0().m75166l().m14851j(this, new C17079d(new Function1() { // from class: com.transsion.postdetail.ui.fragment.f5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvVideoFragment.m74474E0(this.f57330a, (ShortTVRespData) obj);
            }
        }));
        m74503v0().m75164j().m14851j(this, new C17079d(new Function1() { // from class: com.transsion.postdetail.ui.fragment.k5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvVideoFragment.m74475F0(this.f57386a, (String) obj);
            }
        }));
        if (this.attachToMain) {
            ShortTvImmVideoHelper.f56366k.m73053a().m73045n().m14851j(this, new C17079d(new Function1() { // from class: com.transsion.postdetail.ui.fragment.l5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShortTvVideoFragment.m74476G0(this.f57392a, (List) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData() {
        doLoadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadMore() {
        loadData();
    }

    private final void observeRemoveVideo() {
        m74503v0().m75168o().m14851j(this, new C17079d(new Function1() { // from class: com.transsion.postdetail.ui.fragment.o5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvVideoFragment.m74477H0(this.f57414a, (Integer) obj);
            }
        }));
    }

    private final void scrollToPosition(final int it) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        List<Object> data;
        C16988l c16988l = this.mAdapter;
        if (((c16988l == null || (data = c16988l.getData()) == null) ? 0 : data.size()) <= it) {
            return;
        }
        C28174s mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView2 = mViewBinding.f86618d) != null) {
            recyclerView2.scrollToPosition(it);
        }
        C28174s mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (recyclerView = mViewBinding2.f86618d) == null) {
            return;
        }
        recyclerView.post(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.g5
            @Override // java.lang.Runnable
            public final void run() {
                ShortTvVideoFragment.m74480K0(this.f57356a, it);
            }
        });
    }

    private final void showEmpty() {
        C16988l c16988l;
        List<Object> data;
        hideProgress();
        C16988l c16988l2 = this.mAdapter;
        if (c16988l2 == null || (data = c16988l2.getData()) == null || !(!data.isEmpty())) {
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            View emptyView = getEmptyView(contextRequireContext);
            if (emptyView == null || (c16988l = this.mAdapter) == null) {
                return;
            }
            c16988l.m36171Y0(emptyView);
        }
    }

    private final void showNotNetError() {
        C16988l c16988l;
        List<Object> data;
        hideProgress();
        C16988l c16988l2 = this.mAdapter;
        if (c16988l2 == null || (data = c16988l2.getData()) == null || !(!data.isEmpty())) {
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            View notNetErrorView = getNotNetErrorView(contextRequireContext);
            if (notNetErrorView == null || (c16988l = this.mAdapter) == null) {
                return;
            }
            c16988l.m36171Y0(notNetErrorView);
        }
    }

    private final void showProgress() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m74502u0(ShortTvVideoFragment shortTvVideoFragment, DefaultView defaultView, View view) {
        shortTvVideoFragment.loadData();
        defaultView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public final C17535x m74503v0() {
        return (C17535x) this.mVideoViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final Unit m74504w0(ImmVideoNoNetworkView immVideoNoNetworkView, ShortTvVideoFragment shortTvVideoFragment) {
        AbstractC26006c.m102054g(immVideoNoNetworkView);
        shortTvVideoFragment.showProgress();
        shortTvVideoFragment.loadData();
        AbstractC13772o.m62234b("shorttv_detail_video");
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final Unit m74505x0() {
        AbstractC13772o.m62235c("shorttv_detail_video");
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final Unit m74506z0(ShortTvVideoFragment shortTvVideoFragment, int i11, BiddingNativeManager current) {
        List<Object> data;
        Intrinsics.m97802h(current, "current");
        if (current != null) {
            Subject subject = new Subject(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, 0, null, null, null, null, null, -1, 67108863, null);
            subject.setNonAdDelegate(current);
            C16988l c16988l = shortTvVideoFragment.mAdapter;
            int size = (c16988l == null || (data = c16988l.getData()) == null) ? 0 : data.size();
            if (i11 <= size) {
                C16988l c16988l2 = shortTvVideoFragment.mAdapter;
                if (c16988l2 != null) {
                    c16988l2.mo36199n(i11, subject);
                }
            } else {
                C16988l c16988l3 = shortTvVideoFragment.mAdapter;
                if (c16988l3 != null) {
                    c16988l3.mo36199n(size, subject);
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initData(View view, Bundle savedInstanceState) {
        List listM73042k;
        String nextPage;
        Intrinsics.m97802h(view, "view");
        setNetListener(new C17078c());
        initViewModel();
        ShortTVRespData shortTVRespDataM75167n = m74503v0().m75167n();
        if (shortTVRespDataM75167n == null) {
            listM73042k = ShortTvImmVideoHelper.f56366k.m73053a().m73042k();
        } else {
            Pager pager = shortTVRespDataM75167n.getPager();
            if (pager == null || (nextPage = pager.getNextPage()) == null) {
                nextPage = "1";
            }
            this.mNextPage = nextPage;
            listM73042k = shortTVRespDataM75167n.getItems();
            if (listM73042k == null) {
                listM73042k = ShortTvImmVideoHelper.f56366k.m73053a().m73042k();
            }
        }
        if (!listM73042k.isEmpty()) {
            SubjectVideoPagerChangeControl subjectVideoPagerChangeControl = this.mPagerChangeControl;
            if (subjectVideoPagerChangeControl != null) {
                subjectVideoPagerChangeControl.mo72961g(listM73042k);
                return;
            }
            return;
        }
        if (this.attachToMain) {
            ShortTvImmVideoHelper.f56366k.m73053a().m73049t();
        } else {
            showProgress();
            loadData();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        RecyclerView recyclerView;
        Intrinsics.m97802h(view, "view");
        int i11 = savedInstanceState != null ? savedInstanceState.getInt("CURRENT_INDEX") : -1;
        this.savedCurrentIndex = i11;
        C26866a.a.m104905r(C26866a.f81698a, "ShortTvImmVideoPlayer", new String[]{"initView， savedCurrentIndex ：" + i11}, false, 4, null);
        initAd();
        initNonAd();
        initAdapter();
        initPlayer();
        initBack();
        observeRemoveVideo();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        this.mPagerLayoutManager = new PagerLayoutManager(fragmentActivityRequireActivity);
        SubjectVideoPagerChangeControl c16765a = C22762b.f69089a.m90696b() ? new C16765a(this, this.mAdapter, this.mOrPlayer, this.mOrPlayerView, this.mPagerLayoutManager) : new SubjectVideoPagerChangeControl(this, this.mAdapter, this.mOrPlayer, this.mOrPlayerView, this.mPagerLayoutManager);
        this.mPagerChangeControl = c16765a;
        PagerLayoutManager pagerLayoutManager = this.mPagerLayoutManager;
        if (pagerLayoutManager != null) {
            pagerLayoutManager.m79147X(c16765a);
        }
        C28174s mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView = mViewBinding.f86618d) != null) {
            recyclerView.setLayoutManager(this.mPagerLayoutManager);
            recyclerView.setAdapter(this.mAdapter);
            recyclerView.setHasFixedSize(true);
        }
        ShortTvImmVideoHelper shortTvImmVideoHelperM73053a = ShortTvImmVideoHelper.f56366k.m73053a();
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity2, "requireActivity(...)");
        shortTvImmVideoHelperM73053a.m73047p(fragmentActivityRequireActivity2);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void logPause() {
        super.logPause();
        if (this.resumeTimeStamp != 0) {
            C14486e.f50941a.m65288n("shorttv_detail_video", Long.valueOf(SystemClock.elapsedRealtime() - this.resumeTimeStamp), getContext());
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void logResume() {
        super.logResume();
        this.resumeTimeStamp = SystemClock.elapsedRealtime();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        return new C24655b("shorttv_detail_video", false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        String string;
        HashMap mapM96844g;
        HashMap mapM96844g2;
        String string2;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("id")) == null) {
            string = "";
        }
        this.mPostId = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("item_type")) != null) {
            str = string2;
        }
        this.mItemType = str;
        Bundle arguments3 = getArguments();
        this.mTabId = arguments3 != null ? arguments3.getInt("tab_id") : 0;
        Bundle arguments4 = getArguments();
        this.videoLoadMore = arguments4 != null ? arguments4.getBoolean("video_load_more", true) : true;
        Bundle arguments5 = getArguments();
        this.fromComment = arguments5 != null ? arguments5.getBoolean("from_comment") : false;
        Bundle arguments6 = getArguments();
        this.tran_ops = arguments6 != null ? arguments6.getString("rec_ops") : null;
        Bundle arguments7 = getArguments();
        this.attachToMain = arguments7 != null ? arguments7.getBoolean("attach_to_main") : false;
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (mapM96844g2 = logViewConfig.m96844g()) != null) {
        }
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 != null && (mapM96844g = logViewConfig2.m96844g()) != null) {
        }
        C17535x c17535xM74503v0 = m74503v0();
        if (c17535xM74503v0 != null) {
            Bundle arguments8 = getArguments();
            c17535xM74503v0.m75169q(arguments8 != null ? Integer.valueOf(arguments8.getInt("yy_preload_id")) : null);
        }
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b != null) {
            interfaceC22998b.mo69862p(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new C170801(null), 3, null);
        ShortTvImmVideoHelper.f56366k.m73053a().m73041j();
        BiddingListManager biddingListManager = this.v3ListManager;
        if (biddingListManager != null) {
            biddingListManager.m63187o();
        }
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b != null) {
            interfaceC22998b.mo69849c(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed()) {
            if (hidden) {
                InterfaceC16634g interfaceC16634g = this.mOrPlayer;
                if (interfaceC16634g != null) {
                    interfaceC16634g.pause();
                }
                logPause();
            } else {
                InterfaceC16634g interfaceC16634g2 = this.mOrPlayer;
                if (interfaceC16634g2 != null) {
                    interfaceC16634g2.play();
                }
                logResume();
            }
            SubjectVideoPagerChangeControl subjectVideoPagerChangeControl = this.mPagerChangeControl;
            if (subjectVideoPagerChangeControl != null) {
                subjectVideoPagerChangeControl.m72967p(hidden);
            }
        }
        AbstractC14517k.m65410h(null, this, hidden, null, 9, null);
    }

    @Override // p352dn.InterfaceC23002f
    public void onMemberStateChange() {
        C26866a.a.m104898f(C26866a.f81698a, "co_mem", "VideoFragment --> onMemberStateChange() --> refresh list", false, 4, null);
        C16988l c16988l = this.mAdapter;
        if (c16988l != null) {
            c16988l.mo36201n1(null);
        }
        loadData();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AbstractC14517k.m65414l(null, this, null, 5, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AbstractC14517k.m65418p(null, this, "visible=" + isVisible(), 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.m97802h(outState, "outState");
        super.onSaveInstanceState(outState);
        SubjectVideoPagerChangeControl subjectVideoPagerChangeControl = this.mPagerChangeControl;
        outState.putInt("CURRENT_INDEX", subjectVideoPagerChangeControl != null ? subjectVideoPagerChangeControl.m72962i() : 0);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public C28174s getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28174s c28174sM109375c = C28174s.m109375c(inflater);
        Intrinsics.m97801g(c28174sM109375c, "inflate(...)");
        return c28174sM109375c;
    }
}
