package com.transsion.shorttv_pugc.p317ui.fragment.download;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.AbstractC2397b;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.Fragment;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5780c0;
import com.blankj.utilcode.util.AbstractC5790i;
import com.blankj.utilcode.util.AbstractC5806y;
import com.blankj.utilcode.util.NetworkUtils;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.google.android.flexbox.C9902d;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.noober.background.view.BLImageView;
import com.noober.background.view.BLView;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.p285ad.bidding.interstitial.BiddingInterstitialManager;
import com.transsion.p285ad.bidding.video.BiddingVideoManager;
import com.transsion.shorttv.R$color;
import com.transsion.shorttv.R$drawable;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv_pugc.base.widget.DefaultView;
import com.transsion.shorttv_pugc.bean.Cover;
import com.transsion.shorttv_pugc.bean.DownloadItem;
import com.transsion.shorttv_pugc.bean.DownloadListBean;
import com.transsion.shorttv_pugc.bean.ShortTVFavInfo;
import com.transsion.shorttv_pugc.bean.ShortTvInnerPlayBean;
import com.transsion.shorttv_pugc.bean.Subject;
import com.transsion.shorttv_pugc.p317ui.adapter.C19357q;
import com.transsion.shorttv_pugc.p317ui.adapter.ShortTvDownloadEpListAdapter;
import com.transsion.shorttv_pugc.p317ui.widget.ShortTvDownloadInfoExtendView;
import com.transsion.shorttv_pugc.utils.C19523b;
import com.transsion.shorttv_pugc.utils.C19529h;
import com.transsion.shorttv_pugc.viewmodel.ShortTvDownloadViewModel;
import com.transsion.web.api.WebConstants;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import ht.AbstractC23896b;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p550kj.C24655b;
import p558kt.C25429b;
import p623nt.C26102c;
import p718qs.C27125a;
import p743rh.C27287m;
import p920xt.InterfaceC28661f;
import p920xt.InterfaceC28663h;
import p925xy.C28673c;
import pg.C26866a;
import pt.C26950b;
import rs.C27334d;
import tt.C27850c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u009c\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u009d\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u0004J\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b#\u0010!J\u0017\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0005H\u0002¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010)\u001a\u00020\u0005H\u0002¢\u0006\u0004\b)\u0010\u0004J\u000f\u0010*\u001a\u00020\u0005H\u0002¢\u0006\u0004\b*\u0010\u0004J\u0017\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u000fH\u0002¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00052\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00052\u0006\u00106\u001a\u00020$H\u0002¢\u0006\u0004\b7\u0010'J\u0019\u0010:\u001a\u00020\u00052\b\u00109\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00052\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b<\u00105J/\u0010B\u001a\u00020\u00052\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=2\u0006\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020$H\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0005H\u0002¢\u0006\u0004\bD\u0010\u0004J\u000f\u0010E\u001a\u00020\u0005H\u0002¢\u0006\u0004\bE\u0010\u0004J\u000f\u0010F\u001a\u00020\u0005H\u0002¢\u0006\u0004\bF\u0010\u0004J\u000f\u0010G\u001a\u00020\u0005H\u0002¢\u0006\u0004\bG\u0010\u0004J\u000f\u0010H\u001a\u00020\u001eH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u001eH\u0002¢\u0006\u0004\bJ\u0010IJ)\u0010O\u001a\u00020\u001e2\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u000f2\b\b\u0002\u0010N\u001a\u00020\u0012H\u0002¢\u0006\u0004\bO\u0010PJ\u0011\u0010Q\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\bQ\u0010IJ\u000f\u0010R\u001a\u00020\u0005H\u0002¢\u0006\u0004\bR\u0010\u0004J\u0017\u0010T\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u0012H\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u0012H\u0002¢\u0006\u0004\bV\u0010UJ\u000f\u0010W\u001a\u00020\u0012H\u0002¢\u0006\u0004\bW\u0010\u0014J\u0017\u0010Y\u001a\u00020\u00052\u0006\u0010X\u001a\u00020\u0012H\u0002¢\u0006\u0004\bY\u0010UJ\u0017\u0010Z\u001a\u00020\u00052\u0006\u0010X\u001a\u00020\u0012H\u0002¢\u0006\u0004\bZ\u0010UJ\u0017\u0010[\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b[\u0010.R\u0014\u0010^\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010]R\u001b\u0010f\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0016\u0010i\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010o\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010]R\u0016\u0010q\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010]R \u0010u\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020>0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR \u0010w\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020>0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010tR\u0016\u0010y\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010]R\u0016\u0010{\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010]R\u0016\u0010}\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010]R\u0017\u0010\u0080\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0082\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u007fR\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010\u007fR\u001a\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010\u007fR\u001a\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010\u007fR\u0018\u0010\u008e\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010hR\u0018\u0010\u0090\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010hR\u0018\u0010\u0092\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010]R\u0018\u0010\u0094\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010\u007fR\u0017\u0010\u0095\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010hR\"\u0010\u0099\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001a\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001¨\u0006\u009e\u0001"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/ui/fragment/download/ShortTVDownloadReFragment;", "Lcom/transsion/shorttv_pugc/ui/fragment/download/ShortTvDownloadReBaseFragment;", "Lrs/d;", "<init>", "()V", "", "initViewData", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "S0", "(Landroid/view/LayoutInflater;)Lrs/d;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "", "isAudioShowNoNetworkLayout", "()Z", "isMonitorNetworkState", "initViewModel", "initListener", "retryLoadData", TmcConstants.NAVIGATION_ON_START, "onDestroy", "t1", "initHistory", "initView", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "n1", "(Landroid/view/View;)V", "l1", "q1", "", RequestParameters.POSITION, "m1", "(I)V", "K0", "loadData", "C1", "", "totalSize", "p1", "(J)V", NativeComponentConstants.KEY_COMPONENT_TYPE, "r1", "(Ljava/lang/String;)V", "Lcom/transsion/shorttv_pugc/bean/DownloadListBean;", "listBean", "D1", "(Lcom/transsion/shorttv_pugc/bean/DownloadListBean;)V", "totalEpisode", "I0", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "k1", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "J0", "", "Lcom/transsion/shorttv_pugc/bean/DownloadItem;", "list", "start", TtmlNode.END, "E1", "(Ljava/util/List;II)V", "showNotNetError", "B1", "showLoading", "A1", "Q0", "()Landroid/view/View;", "P0", "Landroid/content/Context;", "context", "desText", "showRightBtn", "M0", "(Landroid/content/Context;Ljava/lang/String;Z)Landroid/view/View;", "L0", "o1", "selectAll", "u1", "(Z)V", "w1", "i1", "isSelected", "y1", "x1", "j1", "m", "I", "padding", "n", "itemHeight", "Lcom/transsion/shorttv_pugc/utils/b;", "o", "Lkotlin/Lazy;", "R0", "()Lcom/transsion/shorttv_pugc/utils/b;", "shortTVReporter", TtmlNode.TAG_P, "Z", "isContentDataRequested", "Lcom/transsion/shorttv_pugc/ui/adapter/ShortTvDownloadEpListAdapter;", CampaignEx.JSON_KEY_AD_Q, "Lcom/transsion/shorttv_pugc/ui/adapter/ShortTvDownloadEpListAdapter;", "shortTVEpAdapter", CampaignEx.JSON_KEY_AD_R, "curUnlockAllCount", "s", "perUnlockCount", "", "t", "Ljava/util/Map;", "unlockDownloadLst", TmcStartParams.KEY_URL_SHORT, "inDownloadStatusMap", "v", "startPosition", "w", "endPosition", "x", "curDownloadTabPosition", "y", "Ljava/lang/String;", "pageFrom", "z", "lastPageFrom", "Lcom/transsion/shorttv_pugc/bean/Subject;", "A", "Lcom/transsion/shorttv_pugc/bean/Subject;", "subject", "B", "subjectId", "C", "ops", "D", "moduleName", "E", "scroll2Download", "F", "isSelectAll", "G", "unableSize", "H", "formatSize", "isRequestingData", "Lkotlin/Function0;", "J", "Lkotlin/jvm/functions/Function0;", "selectAllCallback", "K", "Lcom/transsion/shorttv_pugc/bean/DownloadListBean;", "L", "a", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public class ShortTVDownloadReFragment extends ShortTvDownloadReBaseFragment<C27334d> {

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private Subject subject;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private String subjectId;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private String ops;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private String moduleName;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean scroll2Download;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean isSelectAll;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private int unableSize;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean isRequestingData;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private Function0 selectAllCallback;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private DownloadListBean listBean;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean isContentDataRequested;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private ShortTvDownloadEpListAdapter shortTVEpAdapter;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private int curUnlockAllCount;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private int perUnlockCount;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private int curDownloadTabPosition;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int padding = AbstractC5776a0.m27313a(12.0f);

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int itemHeight = (AbstractC5806y.m27489e() - AbstractC5776a0.m27313a(24.0f)) / 5;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final Lazy shortTVReporter = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShortTVDownloadReFragment.m81151z1();
        }
    });

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final Map unlockDownloadLst = new LinkedHashMap();

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final Map inDownloadStatusMap = new LinkedHashMap();

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private int startPosition = 1;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private int endPosition = 1;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private String pageFrom = "";

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private String lastPageFrom = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private String formatSize = "";

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.download.ShortTVDownloadReFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ShortTVDownloadReFragment m81153a(String str, String str2, Subject subject, String str3, String str4, boolean z11) {
            ShortTVDownloadReFragment shortTVDownloadReFragment = new ShortTVDownloadReFragment();
            shortTVDownloadReFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a(WebConstants.PAGE_FROM, str), TuplesKt.m97108a("last_page_from", str2), TuplesKt.m97108a("subject", subject), TuplesKt.m97108a("ops", str3), TuplesKt.m97108a("module_name", str4), TuplesKt.m97108a("download_scroll_to_download", Boolean.valueOf(z11))));
            return shortTVDownloadReFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.download.ShortTVDownloadReFragment$b */
    public static final class C19413b implements TabLayout.OnTabSelectedListener {
        C19413b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            ShortTVDownloadReFragment.this.m81121k1(tab);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.download.ShortTVDownloadReFragment$c */
    public static final class C19414c extends RecyclerView.AbstractC4219r {
        C19414c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            C27334d c27334d;
            TabLayout tabLayout;
            TabLayout.Tab tabAt;
            Intrinsics.m97802h(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i11, i12);
            RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            int iFindFirstVisibleItemPosition = ((gridLayoutManager != null ? gridLayoutManager.findFirstVisibleItemPosition() : 0) + 24) / 25;
            if (iFindFirstVisibleItemPosition == ShortTVDownloadReFragment.this.curDownloadTabPosition || (c27334d = (C27334d) ShortTVDownloadReFragment.this.getMViewBinding()) == null || (tabLayout = c27334d.f83125t) == null || (tabAt = tabLayout.getTabAt(iFindFirstVisibleItemPosition)) == null) {
                return;
            }
            tabAt.select();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.download.ShortTVDownloadReFragment$d */
    static final class C19415d implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f62235a;

        C19415d(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f62235a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f62235a;
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
            this.f62235a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.download.ShortTVDownloadReFragment$initHistory$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.shorttv_pugc.ui.fragment.download.ShortTVDownloadReFragment$initHistory$1", m97637f = "ShortTVDownloadReFragment.kt", m97638l = {194, 196}, m97639m = "invokeSuspend")
    static final class C194161 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C194161(Continuation<? super C194161> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ShortTVDownloadReFragment.this.new C194161(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C194161) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x005c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ShortTVDownloadReFragment shortTVDownloadReFragment;
            ShortTvInnerPlayBean shortTvInnerPlayBean;
            AbstractC24917a2 abstractC24917a2M99269c;
            ShortTVDownloadReFragment$initHistory$1$1$1 shortTVDownloadReFragment$initHistory$1$1$1;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                String str = ShortTVDownloadReFragment.this.subjectId;
                if (str != null) {
                    shortTVDownloadReFragment = ShortTVDownloadReFragment.this;
                    InterfaceC28661f interfaceC28661fM81403O = shortTVDownloadReFragment.m81166g0().m81403O();
                    if (interfaceC28661fM81403O != null) {
                        this.L$0 = shortTVDownloadReFragment;
                        this.label = 1;
                        obj = interfaceC28661fM81403O.mo73796c(str, this);
                        if (obj == objF) {
                            return objF;
                        }
                        shortTvInnerPlayBean = (ShortTvInnerPlayBean) obj;
                    } else {
                        shortTvInnerPlayBean = null;
                    }
                    abstractC24917a2M99269c = C25220y0.m99269c();
                    shortTVDownloadReFragment$initHistory$1$1$1 = new ShortTVDownloadReFragment$initHistory$1$1$1(shortTVDownloadReFragment, shortTvInnerPlayBean, null);
                    this.L$0 = null;
                    this.label = 2;
                    if (AbstractC25088i.m98910g(abstractC24917a2M99269c, shortTVDownloadReFragment$initHistory$1$1$1, this) == objF) {
                        return objF;
                    }
                }
            } else if (i11 == 1) {
                shortTVDownloadReFragment = (ShortTVDownloadReFragment) this.L$0;
                ResultKt.m97107b(obj);
                shortTvInnerPlayBean = (ShortTvInnerPlayBean) obj;
                abstractC24917a2M99269c = C25220y0.m99269c();
                shortTVDownloadReFragment$initHistory$1$1$1 = new ShortTVDownloadReFragment$initHistory$1$1$1(shortTVDownloadReFragment, shortTvInnerPlayBean, null);
                this.L$0 = null;
                this.label = 2;
                if (AbstractC25088i.m98910g(abstractC24917a2M99269c, shortTVDownloadReFragment$initHistory$1$1$1, this) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: A1 */
    private final void m81079A1() {
        FrameLayout frameLayout;
        C27334d c27334d = (C27334d) getMViewBinding();
        if (c27334d == null || (frameLayout = c27334d.f83113h) == null) {
            return;
        }
        frameLayout.removeAllViews();
        frameLayout.setVisibility(8);
    }

    /* JADX INFO: renamed from: B1 */
    private final void m81081B1() {
        FrameLayout frameLayout;
        C27334d c27334d = (C27334d) getMViewBinding();
        if (c27334d == null || (frameLayout = c27334d.f83113h) == null) {
            return;
        }
        frameLayout.removeAllViews();
        frameLayout.setVisibility(0);
        frameLayout.addView(m81098P0());
    }

    /* JADX INFO: renamed from: C1 */
    private final void m81083C1() {
        C3187b0 c3187b0M81359e;
        C3187b0 c3187b0M81367n;
        C3187b0 c3187b0M81361h;
        List data;
        if (!C27287m.f83003a.m106330e()) {
            C26950b.f81855a.m105091d(R$string.short_tv_no_network_toast);
            return;
        }
        C26866a.a aVar = C26866a.f81698a;
        String tag = getTAG();
        Intrinsics.m97801g(tag, "<get-TAG>(...)");
        C26866a.a.m104898f(aVar, tag, "showWatchAd", false, 4, null);
        ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter = this.shortTVEpAdapter;
        int size = ((shortTvDownloadEpListAdapter == null || (data = shortTvDownloadEpListAdapter.getData()) == null) ? 0 : data.size()) - this.curUnlockAllCount;
        int i11 = this.perUnlockCount;
        String string = size <= i11 ? Utils.m27275a().getString(R$string.download_short_tv_watch_ad_all) : String.valueOf(i11);
        Intrinsics.m97799e(string);
        ShortTvDownloadViewModel shortTvDownloadViewModelM81167h0 = getViewModel();
        if (shortTvDownloadViewModelM81167h0 != null && (c3187b0M81361h = shortTvDownloadViewModelM81167h0.m81361h()) != null) {
            c3187b0M81361h.mo14858q(string);
        }
        ShortTvDownloadViewModel shortTvDownloadViewModelM81167h1 = getViewModel();
        if (shortTvDownloadViewModelM81167h1 != null && (c3187b0M81367n = shortTvDownloadViewModelM81167h1.m81367n()) != null) {
            c3187b0M81367n.mo14858q(this.subjectId);
        }
        ShortTvDownloadViewModel shortTvDownloadViewModelM81167h2 = getViewModel();
        if (shortTvDownloadViewModelM81167h2 != null && (c3187b0M81359e = shortTvDownloadViewModelM81167h2.m81359e()) != null) {
            c3187b0M81359e.mo14858q("download_short_tv_ad");
        }
        C19523b.m81324d(m81100R0(), this.subjectId, "dialog_minitv_download_unlock", null, 4, null);
    }

    /* JADX INFO: renamed from: D1 */
    private final void m81085D1(DownloadListBean listBean) {
        List data;
        String subjectId;
        ShortTvDownloadInfoExtendView shortTvDownloadInfoExtendView;
        BLImageView bLImageView;
        AppCompatTextView appCompatTextView;
        ShapeableImageView shapeableImageView;
        String thumbnail;
        String url;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        Subject subject;
        this.listBean = listBean;
        if (this.isContentDataRequested) {
            return;
        }
        Integer totalEpisode = listBean.getTotalEpisode();
        if (totalEpisode != null && totalEpisode.intValue() == 0) {
            return;
        }
        int i11 = this.curUnlockAllCount;
        Integer totalEpisode2 = listBean.getTotalEpisode();
        if (i11 > (totalEpisode2 != null ? totalEpisode2.intValue() : 1)) {
            Integer totalEpisode3 = listBean.getTotalEpisode();
            this.curUnlockAllCount = totalEpisode3 != null ? totalEpisode3.intValue() : 1;
        }
        if (this.subject == null) {
            this.subject = new Subject(listBean.getSubjectId(), Integer.valueOf(listBean.getSubjectType()), listBean.getSubjectTitle(), null, null, null, listBean.getDescription(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, false, null, -72, 4194303, null);
        }
        Subject subject2 = this.subject;
        if ((subject2 != null ? subject2.getShortTVFavInfo() : null) == null && (subject = this.subject) != null) {
            ShortTVFavInfo shortTVFavInfo = listBean.getShortTVFavInfo();
            String favoriteNum = shortTVFavInfo != null ? shortTVFavInfo.getFavoriteNum() : null;
            ShortTVFavInfo shortTVFavInfo2 = listBean.getShortTVFavInfo();
            boolean hasFavorite = shortTVFavInfo2 != null ? shortTVFavInfo2.getHasFavorite() : false;
            ShortTVFavInfo shortTVFavInfo3 = listBean.getShortTVFavInfo();
            subject.setShortTVFavInfo(new ShortTVFavInfo(favoriteNum, hasFavorite, shortTVFavInfo3 != null ? shortTVFavInfo3.getFavoriteTime() : null));
        }
        this.isContentDataRequested = true;
        C27334d c27334d = (C27334d) getMViewBinding();
        if (c27334d != null && (appCompatTextView3 = c27334d.f83101D) != null) {
            appCompatTextView3.setText(listBean.getSubjectTitle());
        }
        C27334d c27334d2 = (C27334d) getMViewBinding();
        if (c27334d2 != null && (appCompatTextView2 = c27334d2.f83100C) != null) {
            appCompatTextView2.setText(listBean.getSubjectTitle());
        }
        C27334d c27334d3 = (C27334d) getMViewBinding();
        if (c27334d3 != null && (shapeableImageView = c27334d3.f83118m) != null) {
            C25429b.a aVar = C25429b.f76999a;
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            Cover cover = listBean.getCover();
            String str = (cover == null || (url = cover.getUrl()) == null) ? "" : url;
            int i12 = R$color.short_tv_module_04;
            int width = shapeableImageView.getWidth();
            int height = shapeableImageView.getHeight();
            Cover cover2 = listBean.getCover();
            aVar.m99979i(contextRequireContext, shapeableImageView, str, (32448 & 8) != 0 ? R$color.image_skeleton : i12, (32448 & 16) != 0 ? aVar.m99977c() : width, (32448 & 32) != 0 ? aVar.m99976b() : height, (32448 & 64) != 0 ? 0 : 0, (32448 & 128) != 0, (32448 & 256) != 0 ? "" : (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) ? "" : thumbnail, (32448 & 512) != 0, (32448 & 1024) != 0, (32448 & 2048) != 0 ? false : false, (32448 & 4096) != 0 ? false : false, (32448 & 8192) != 0 ? false : false, (32448 & 16384) != 0 ? 25 : 0);
        }
        m81092J0(listBean);
        String genre = listBean.getGenre();
        if (genre != null && genre.length() != 0) {
            StringBuffer stringBuffer = new StringBuffer();
            String releaseDate = listBean.getReleaseDate();
            if (releaseDate != null && releaseDate.length() > 0) {
                Date dateM27346l = AbstractC5780c0.m27346l(listBean.getReleaseDate(), "yyyy-MM-dd");
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(dateM27346l);
                stringBuffer.append(String.valueOf(calendar.get(1)));
            }
            String genre2 = listBean.getGenre();
            if (genre2 != null && genre2.length() > 0) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append(" • ");
                }
                String genre3 = listBean.getGenre();
                stringBuffer.append(genre3 != null ? StringsKt.m98236Q(genre3, "，", " • ", false, 4, null) : null);
            }
            String countryName = listBean.getCountryName();
            if (countryName != null && countryName.length() > 0) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append(" • ");
                }
                stringBuffer.append(listBean.getCountryName());
            }
            C27334d c27334d4 = (C27334d) getMViewBinding();
            if (c27334d4 != null && (appCompatTextView = c27334d4.f83130y) != null) {
                appCompatTextView.setText(stringBuffer);
            }
        }
        C27334d c27334d5 = (C27334d) getMViewBinding();
        if (c27334d5 != null && (bLImageView = c27334d5.f83119n) != null) {
            ShortTVFavInfo shortTVFavInfo4 = listBean.getShortTVFavInfo();
            bLImageView.setSelected(shortTVFavInfo4 != null ? shortTVFavInfo4.getHasFavorite() : false);
        }
        C27334d c27334d6 = (C27334d) getMViewBinding();
        if (c27334d6 != null && (shortTvDownloadInfoExtendView = c27334d6.f83114i) != null) {
            String description = listBean.getDescription();
            if (description == null) {
                description = "";
            }
            shortTvDownloadInfoExtendView.showData(description);
        }
        Subject subject3 = this.subject;
        int totalEpisode4 = subject3 != null ? subject3.getTotalEpisode() : 0;
        Integer totalEpisode5 = listBean.getTotalEpisode();
        int iMax = Math.max(totalEpisode4, totalEpisode5 != null ? totalEpisode5.intValue() : 0);
        if (iMax > 0) {
            m81091I0(iMax);
            int i13 = 0;
            while (i13 < iMax) {
                ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter = this.shortTVEpAdapter;
                if (shortTvDownloadEpListAdapter != null && (data = shortTvDownloadEpListAdapter.getData()) != null) {
                    Subject subject4 = this.subject;
                    data.add(new C27850c((subject4 == null || (subjectId = subject4.getSubjectId()) == null) ? "" : subjectId, i13, i13 < this.curUnlockAllCount, false, this.inDownloadStatusMap.containsKey(Integer.valueOf(i13)), 8, null));
                }
                i13++;
            }
            ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter2 = this.shortTVEpAdapter;
            if (shortTvDownloadEpListAdapter2 != null) {
                shortTvDownloadEpListAdapter2.notifyItemRangeChanged(0, iMax);
            }
        }
    }

    /* JADX INFO: renamed from: E1 */
    private final void m81087E1(List list, int start, int end) {
    }

    /* JADX INFO: renamed from: I0 */
    private final void m81091I0(int totalEpisode) {
        TabLayout tabLayout;
        TabLayout tabLayout2;
        TabLayout tabLayout3;
        int i11 = (totalEpisode + 24) / 25;
        if (i11 <= 1) {
            C27334d c27334d = (C27334d) getMViewBinding();
            if (c27334d == null || (tabLayout3 = c27334d.f83125t) == null) {
                return;
            }
            AbstractC23896b.m94640b(tabLayout3);
            return;
        }
        C27334d c27334d2 = (C27334d) getMViewBinding();
        if (c27334d2 != null && (tabLayout2 = c27334d2.f83125t) != null) {
            tabLayout2.removeAllTabs();
            tabLayout2.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C19413b());
        }
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 * 25;
            int i14 = i13 + 1;
            int iH = RangesKt.m97938h(i13 + 25, totalEpisode);
            C27334d c27334d3 = (C27334d) getMViewBinding();
            if (c27334d3 != null && (tabLayout = c27334d3.f83125t) != null) {
                tabLayout.addTab(tabLayout.newTab().setText(i14 + "-" + iH));
            }
        }
    }

    /* JADX INFO: renamed from: J0 */
    private final void m81092J0(DownloadListBean listBean) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        List<String> tags = listBean.getTags();
        if (tags == null || tags.isEmpty()) {
            C27334d c27334d = (C27334d) getMViewBinding();
            if (c27334d == null || (recyclerView = c27334d.f83124s) == null) {
                return;
            }
            AbstractC23896b.m94640b(recyclerView);
            return;
        }
        List<String> tags2 = listBean.getTags();
        Intrinsics.m97799e(tags2);
        C19357q c19357q = new C19357q(tags2);
        C27334d c27334d2 = (C27334d) getMViewBinding();
        if (c27334d2 == null || (recyclerView2 = c27334d2.f83124s) == null) {
            return;
        }
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView2.getContext());
        flexboxLayoutManager.m44837c0(0);
        flexboxLayoutManager.m44838d0(1);
        flexboxLayoutManager.m44839e0(0);
        recyclerView2.setLayoutManager(flexboxLayoutManager);
        C9902d c9902d = new C9902d(recyclerView2.getContext());
        c9902d.m44968l(3);
        c9902d.m44967i(AbstractC2397b.getDrawable(Utils.m27275a(), R$drawable.short_tv_space_tag_decoration));
        recyclerView2.addItemDecoration(c9902d);
        recyclerView2.setAdapter(c19357q);
    }

    /* JADX INFO: renamed from: K0 */
    private final void m81093K0() {
        AppCompatTextView appCompatTextView;
        AppCompatImageView appCompatImageView;
        C3187b0 c3187b0M81365l;
        Map map;
        ShortTvDownloadViewModel shortTvDownloadViewModelM81167h0 = getViewModel();
        int size = (shortTvDownloadViewModelM81167h0 == null || (c3187b0M81365l = shortTvDownloadViewModelM81167h0.m81365l()) == null || (map = (Map) c3187b0M81365l.m14847f()) == null) ? 0 : map.size();
        C26866a.a aVar = C26866a.f81698a;
        String tag = getTAG();
        Intrinsics.m97801g(tag, "<get-TAG>(...)");
        C26866a.a.m104898f(aVar, tag, "checkSelectAll, selectedCount: " + size + ", curUnlockCount:" + this.curUnlockAllCount + ", downloadize:" + this.inDownloadStatusMap.size(), false, 4, null);
        this.isSelectAll = size == this.curUnlockAllCount - this.inDownloadStatusMap.size();
        C27334d c27334d = (C27334d) getMViewBinding();
        if (c27334d != null && (appCompatImageView = c27334d.f83116k) != null) {
            appCompatImageView.setSelected(this.isSelectAll);
        }
        C27334d c27334d2 = (C27334d) getMViewBinding();
        if (c27334d2 == null || (appCompatTextView = c27334d2.f83128w) == null) {
            return;
        }
        appCompatTextView.setVisibility(size > 0 ? 0 : 8);
        appCompatTextView.setText(Utils.m27275a().getString(R$string.short_tv_download_ep_selected_count, String.valueOf(size)));
    }

    /* JADX INFO: renamed from: L0 */
    private final View m81094L0() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(requireContext());
        int i11 = R$layout.short_tv_layout_download_loading;
        C27334d c27334d = (C27334d) getMViewBinding();
        return layoutInflaterFrom.inflate(i11, (ViewGroup) (c27334d != null ? c27334d.f83113h : null), false);
    }

    /* JADX INFO: renamed from: M0 */
    private final View m81095M0(Context context, String desText, boolean showRightBtn) {
        final DefaultView defaultView = new DefaultView(context, DefaultView.ModelStyle.MODEL_STYLE_NIGHT);
        defaultView.setStyle(DefaultView.DefaultViewStyle.STYLE_DES_BTN);
        defaultView.setDescText(desText);
        defaultView.setDescTextColor(-1);
        defaultView.setStyle(DefaultView.DefaultViewStyle.STYLE_NO_IMAGE);
        defaultView.setBtnVisibility(showRightBtn ? 0 : 8);
        String string = context.getString(R$string.short_tv_go_to_setting);
        Intrinsics.m97801g(string, "getString(...)");
        defaultView.setBtnText(string);
        defaultView.setTipOperationVisibility(8);
        defaultView.setBtnBg(AbstractC2397b.getDrawable(Utils.m27275a(), R$drawable.short_tv_download_empty_btn_bg));
        defaultView.setBtnTextColor(-1);
        defaultView.setBackgroundColor(0);
        defaultView.setBtnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTVDownloadReFragment.m81096N0(view);
            }
        });
        defaultView.setLeftBtnVisibility(0);
        String string2 = context.getString(R$string.short_tv_Retry);
        Intrinsics.m97801g(string2, "getString(...)");
        defaultView.setLeftBtnText(string2);
        defaultView.setLeftBtnBg(AbstractC2397b.getDrawable(Utils.m27275a(), R$drawable.short_tv_download_empty_btn_bg));
        defaultView.setLeftBtnTextColor(-1);
        defaultView.setLeftBtnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTVDownloadReFragment.m81097O0(this.f62253a, defaultView, view);
            }
        });
        defaultView.setTitleViewVisibility(8);
        int iM27313a = AbstractC5776a0.m27313a(16.0f);
        defaultView.setPadding(iM27313a, AbstractC5776a0.m27313a(110.0f), iM27313a, 0);
        defaultView.setVisibility(0);
        return defaultView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final void m81096N0(View view) {
        NetworkUtils.m27175v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final void m81097O0(ShortTVDownloadReFragment shortTVDownloadReFragment, DefaultView defaultView, View view) {
        shortTVDownloadReFragment.showLoading();
        shortTVDownloadReFragment.loadData();
        defaultView.setVisibility(8);
    }

    /* JADX INFO: renamed from: P0 */
    private final View m81098P0() {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        String string = Utils.m27275a().getString(R$string.short_tv_error_load_failed);
        Intrinsics.m97801g(string, "getString(...)");
        return m81095M0(contextRequireContext, string, false);
    }

    /* JADX INFO: renamed from: Q0 */
    private final View m81099Q0() {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        String string = Utils.m27275a().getString(R$string.short_tv_no_network_title);
        Intrinsics.m97801g(string, "getString(...)");
        return m81095M0(contextRequireContext, string, true);
    }

    /* JADX INFO: renamed from: R0 */
    private final C19523b m81100R0() {
        return (C19523b) this.shortTVReporter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final void m81101T0(ShortTVDownloadReFragment shortTVDownloadReFragment, View view) {
        shortTVDownloadReFragment.m81165f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final void m81102U0(ShortTVDownloadReFragment shortTVDownloadReFragment, View view) {
        Intrinsics.m97799e(view);
        shortTVDownloadReFragment.m81127n1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final void m81103V0(ShortTVDownloadReFragment shortTVDownloadReFragment, View view) {
        Intrinsics.m97799e(view);
        shortTVDownloadReFragment.m81123l1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final void m81104W0(ShortTVDownloadReFragment shortTVDownloadReFragment, View view) {
        Intrinsics.m97799e(view);
        shortTVDownloadReFragment.m81133q1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final void m81105X0(ShortTVDownloadReFragment shortTVDownloadReFragment, View view) {
        shortTVDownloadReFragment.m81129o1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final void m81106Y0(ShortTVDownloadReFragment shortTVDownloadReFragment, View view) {
        shortTVDownloadReFragment.m81129o1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final void m81107Z0(ShortTVDownloadReFragment shortTVDownloadReFragment, View view) {
        C3187b0 c3187b0M81366m;
        Long l11;
        C3187b0 c3187b0M81365l;
        FrameLayout frameLayout;
        if (C26102c.f79666a.m102236a(view.getId(), 500L)) {
            return;
        }
        if (!C27287m.f83003a.m106330e()) {
            C26950b.f81855a.m105091d(R$string.short_tv_no_network_toast);
            return;
        }
        C27334d c27334d = (C27334d) shortTVDownloadReFragment.getMViewBinding();
        if (c27334d != null && (frameLayout = c27334d.f83112g) != null && frameLayout.getVisibility() == 0) {
            C26866a.f81698a.m104918p("Download", new String[]{"DownloadReDetectorGroupMainFragment --> onDownload() --> 当前正在全选中"}, true);
            return;
        }
        ShortTvDownloadViewModel shortTvDownloadViewModelM81167h0 = shortTVDownloadReFragment.getViewModel();
        Map map = (shortTvDownloadViewModelM81167h0 == null || (c3187b0M81365l = shortTvDownloadViewModelM81167h0.m81365l()) == null) ? null : (Map) c3187b0M81365l.m14847f();
        if (map == null || map.isEmpty()) {
            C26950b.f81855a.m105092e(Utils.m27275a().getString(R$string.download_short_tv_unselected_toast));
        } else {
            ShortTvDownloadViewModel shortTvDownloadViewModelM81167h1 = shortTVDownloadReFragment.getViewModel();
            shortTVDownloadReFragment.m81119j1((shortTvDownloadViewModelM81167h1 == null || (c3187b0M81366m = shortTvDownloadViewModelM81167h1.m81366m()) == null || (l11 = (Long) c3187b0M81366m.m14847f()) == null) ? 0L : l11.longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final Unit m81108a1(ShortTVDownloadReFragment shortTVDownloadReFragment, int i11) {
        shortTVDownloadReFragment.m81125m1(i11);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final Unit m81109b1(ShortTVDownloadReFragment shortTVDownloadReFragment, DownloadListBean downloadListBean) {
        List data;
        shortTVDownloadReFragment.m81079A1();
        if (downloadListBean == null) {
            ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter = shortTVDownloadReFragment.shortTVEpAdapter;
            if (shortTvDownloadEpListAdapter != null && (data = shortTvDownloadEpListAdapter.getData()) != null && data.size() == 0) {
                shortTVDownloadReFragment.m81081B1();
            }
            return Unit.f75682a;
        }
        C26866a.a aVar = C26866a.f81698a;
        String tag = shortTVDownloadReFragment.getTAG();
        Intrinsics.m97801g(tag, "<get-TAG>(...)");
        List<DownloadItem> items = downloadListBean.getItems();
        C26866a.a.m104898f(aVar, tag, "get data from  net, size = " + (items != null ? Integer.valueOf(items.size()) : null), false, 4, null);
        Integer totalEpisode = downloadListBean.getTotalEpisode();
        if (totalEpisode != null && totalEpisode.intValue() == 0) {
            Subject subject = shortTVDownloadReFragment.subject;
            downloadListBean.setTotalEpisode(Integer.valueOf(subject != null ? subject.getTotalEpisode() : 0));
        }
        shortTVDownloadReFragment.m81085D1(downloadListBean);
        shortTVDownloadReFragment.m81087E1(downloadListBean.getItems(), downloadListBean.getStartPosition(), downloadListBean.getEndPosition());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final Unit m81110c1(ShortTVDownloadReFragment shortTVDownloadReFragment, Subject subject) {
        if (subject != null) {
            shortTVDownloadReFragment.subject = subject;
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final Unit m81111d1(ShortTVDownloadReFragment shortTVDownloadReFragment, Map map) {
        shortTVDownloadReFragment.m81093K0();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final Unit m81112e1(ShortTVDownloadReFragment shortTVDownloadReFragment, Long l11) {
        Intrinsics.m97799e(l11);
        shortTVDownloadReFragment.m81131p1(l11.longValue());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final Unit m81113f1(ShortTVDownloadReFragment shortTVDownloadReFragment, String str) {
        Intrinsics.m97799e(str);
        shortTVDownloadReFragment.m81135r1(str);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final Unit m81114g1(Integer num) {
        int i11;
        if (num != null && num.intValue() == 0) {
            i11 = R$string.short_tv_error_load_failed;
        } else {
            i11 = (num != null && num.intValue() == 2) ? R$string.short_tv_favorite_remove_toast : R$string.short_tv_favorite_toast;
        }
        C26950b.f81855a.m105091d(i11);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final Unit m81115h1(ShortTVDownloadReFragment shortTVDownloadReFragment, C28673c value) {
        BLImageView bLImageView;
        ShortTVFavInfo shortTVFavInfo;
        Intrinsics.m97802h(value, "value");
        try {
            if (!TextUtils.equals(value.m110505c(), shortTVDownloadReFragment.subjectId)) {
                return Unit.f75682a;
            }
            Subject subject = shortTVDownloadReFragment.subject;
            if (subject != null && (shortTVFavInfo = subject.getShortTVFavInfo()) != null) {
                shortTVFavInfo.setFavoriteNum(value.m110504b());
                shortTVFavInfo.setHasFavorite(value.m110503a());
            }
            C27334d c27334d = (C27334d) shortTVDownloadReFragment.getMViewBinding();
            if (c27334d != null && (bLImageView = c27334d.f83119n) != null) {
                bLImageView.setSelected(value.m110503a());
            }
            return Unit.f75682a;
        } catch (Exception unused) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail", false, 2, null);
        }
    }

    /* JADX INFO: renamed from: i1 */
    private final boolean m81117i1() {
        return this.unableSize < this.curUnlockAllCount;
    }

    private final void initHistory() {
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new C194161(null), 3, null);
    }

    private final void initView() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        AppBarLayout appBarLayout;
        AppCompatTextView appCompatTextView;
        C27334d c27334d = (C27334d) getMViewBinding();
        if (c27334d != null && (appCompatTextView = c27334d.f83100C) != null) {
            Subject subject = this.subject;
            appCompatTextView.setText(subject != null ? subject.getTitle() : null);
        }
        C27334d c27334d2 = (C27334d) getMViewBinding();
        if (c27334d2 != null && (appBarLayout = c27334d2.f83107b) != null) {
            appBarLayout.setExpanded(!this.scroll2Download);
        }
        C27334d c27334d3 = (C27334d) getMViewBinding();
        if (c27334d3 != null && (recyclerView2 = c27334d3.f83123r) != null) {
            int i11 = this.padding;
            recyclerView2.setPadding(i11, 0, i11, 0);
            recyclerView2.setLayoutManager(new GridLayoutManager(recyclerView2.getContext(), 5, 1, false));
            recyclerView2.addOnScrollListener(new C19414c());
        }
        ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter = new ShortTvDownloadEpListAdapter();
        shortTvDownloadEpListAdapter.m80794l(new Function1() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTVDownloadReFragment.m81108a1(this.f62261a, ((Integer) obj).intValue());
            }
        });
        this.shortTVEpAdapter = shortTvDownloadEpListAdapter;
        C27334d c27334d4 = (C27334d) getMViewBinding();
        if (c27334d4 == null || (recyclerView = c27334d4.f83123r) == null) {
            return;
        }
        recyclerView.setAdapter(this.shortTVEpAdapter);
    }

    /* JADX INFO: renamed from: j1 */
    private final void m81119j1(long totalSize) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public final void m81121k1(TabLayout.Tab tab) {
        RecyclerView recyclerView;
        C27334d c27334d;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        if (tab == null || !tab.isSelected()) {
            return;
        }
        this.curDownloadTabPosition = tab.getPosition();
        int position = tab.getPosition() * 25;
        C27334d c27334d2 = (C27334d) getMViewBinding();
        RecyclerView.AbstractC4214m layoutManager = (c27334d2 == null || (recyclerView3 = c27334d2.f83123r) == null) ? null : recyclerView3.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            int iFindFirstCompletelyVisibleItemPosition = ((position - gridLayoutManager.findFirstCompletelyVisibleItemPosition()) / 5) * this.itemHeight;
            C27334d c27334d3 = (C27334d) getMViewBinding();
            if (c27334d3 == null || (recyclerView = c27334d3.f83123r) == null || !recyclerView.canScrollVertically(iFindFirstCompletelyVisibleItemPosition) || (c27334d = (C27334d) getMViewBinding()) == null || (recyclerView2 = c27334d.f83123r) == null) {
                return;
            }
            recyclerView2.scrollBy(0, iFindFirstCompletelyVisibleItemPosition);
        }
    }

    /* JADX INFO: renamed from: l1 */
    private final void m81123l1(View view) {
        ShortTVFavInfo shortTVFavInfo;
        if (C26102c.f79666a.m102236a(view.getId(), 500L)) {
            return;
        }
        if (!C27287m.f83003a.m106330e()) {
            C26950b.f81855a.m105091d(R$string.short_tv_no_network_toast);
            return;
        }
        C19523b c19523bM81100R0 = m81100R0();
        String str = this.subjectId;
        Subject subject = this.subject;
        c19523bM81100R0.m81329e(str, "", (subject == null || (shortTVFavInfo = subject.getShortTVFavInfo()) == null) ? false : shortTVFavInfo.getHasFavorite(), "minitv_download");
        ShortTvDownloadViewModel shortTvDownloadViewModelM81167h0 = getViewModel();
        if (shortTvDownloadViewModelM81167h0 != null) {
            shortTvDownloadViewModelM81167h0.m81358d(this.subject);
        }
    }

    private final void loadData() {
        String subjectId;
        if (!C27287m.f83003a.m106330e()) {
            showNotNetError();
            return;
        }
        C26866a.a aVar = C26866a.f81698a;
        String tag = getTAG();
        Intrinsics.m97801g(tag, "<get-TAG>(...)");
        C26866a.a.m104898f(aVar, tag, "loadData ,  startPosition:" + this.startPosition + ", endPosition:" + this.endPosition, false, 4, null);
        this.isRequestingData = true;
        ShortTvDownloadViewModel shortTvDownloadViewModelM81167h0 = getViewModel();
        if (shortTvDownloadViewModelM81167h0 != null) {
            Subject subject = this.subject;
            if (subject == null || (subjectId = subject.getSubjectId()) == null) {
                subjectId = "";
            }
            shortTvDownloadViewModelM81167h0.m81360g(subjectId, this.startPosition, this.endPosition);
        }
    }

    /* JADX INFO: renamed from: m1 */
    private final void m81125m1(int position) {
        C3187b0 c3187b0M81366m;
        C3187b0 c3187b0M81366m2;
        C3187b0 c3187b0M81366m3;
        Long l11;
        Long size;
        ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter = this.shortTVEpAdapter;
        Intrinsics.m97799e(shortTvDownloadEpListAdapter);
        List data = shortTvDownloadEpListAdapter.getData();
        if (position >= data.size()) {
            return;
        }
        C27850c c27850c = (C27850c) data.get(position);
        if (c27850c.m108248b()) {
            return;
        }
        if (!c27850c.m108249c()) {
            if (position == this.curUnlockAllCount) {
                m81083C1();
                return;
            } else {
                C26950b.f81855a.m105091d(R$string.short_tv_unlock_in_order);
                return;
            }
        }
        ShortTvDownloadViewModel shortTvDownloadViewModelM81167h0 = getViewModel();
        if (shortTvDownloadViewModelM81167h0 != null) {
            shortTvDownloadViewModelM81167h0.m81369q(c27850c);
        }
        DownloadItem downloadItem = (DownloadItem) this.unlockDownloadLst.get(Integer.valueOf(position));
        long jLongValue = 0;
        long jLongValue2 = (downloadItem == null || (size = downloadItem.getSize()) == null) ? 0L : size.longValue();
        ShortTvDownloadViewModel shortTvDownloadViewModelM81167h1 = getViewModel();
        if (shortTvDownloadViewModelM81167h1 != null && (c3187b0M81366m3 = shortTvDownloadViewModelM81167h1.m81366m()) != null && (l11 = (Long) c3187b0M81366m3.m14847f()) != null) {
            jLongValue = l11.longValue();
        }
        if (c27850c.m108250d()) {
            c27850c.m108252f(false);
            ShortTvDownloadViewModel shortTvDownloadViewModelM81167h2 = getViewModel();
            if (shortTvDownloadViewModelM81167h2 != null && (c3187b0M81366m2 = shortTvDownloadViewModelM81167h2.m81366m()) != null) {
                c3187b0M81366m2.mo14858q(Long.valueOf(jLongValue - jLongValue2));
            }
        } else {
            c27850c.m108252f(true);
            ShortTvDownloadViewModel shortTvDownloadViewModelM81167h3 = getViewModel();
            if (shortTvDownloadViewModelM81167h3 != null && (c3187b0M81366m = shortTvDownloadViewModelM81167h3.m81366m()) != null) {
                c3187b0M81366m.mo14858q(Long.valueOf(jLongValue + jLongValue2));
            }
        }
        ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter2 = this.shortTVEpAdapter;
        if (shortTvDownloadEpListAdapter2 != null) {
            shortTvDownloadEpListAdapter2.notifyItemChanged(position, c27850c);
        }
    }

    /* JADX INFO: renamed from: n1 */
    private final void m81127n1(View view) {
        if (C26102c.f79666a.m102236a(view.getId(), 500L)) {
            return;
        }
        Navigator navigatorM61773c = TheRouter.m61773c(C27125a.f82236a.m105544b());
        Subject subject = this.subject;
        Navigator.m61845x(navigatorM61773c.m61857K("id", subject != null ? subject.getSubjectId() : null), requireContext(), null, 2, null);
        m81165f0();
    }

    /* JADX INFO: renamed from: o1 */
    private final void m81129o1() {
        AppCompatImageView appCompatImageView;
        if (C26102c.f79666a.m102236a(-912345, 1000L)) {
            return;
        }
        if (!m81117i1()) {
            C26950b.f81855a.m105091d(R$string.short_tv_download_no_options_toast);
            return;
        }
        C27334d c27334d = (C27334d) getMViewBinding();
        if (c27334d == null || (appCompatImageView = c27334d.f83116k) == null) {
            return;
        }
        boolean z11 = !appCompatImageView.isSelected();
        this.isSelectAll = z11;
        m81141u1(z11);
    }

    /* JADX INFO: renamed from: p1 */
    private final void m81131p1(long totalSize) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        if (totalSize <= 0) {
            C27334d c27334d = (C27334d) getMViewBinding();
            if (c27334d == null || (appCompatTextView2 = c27334d.f83127v) == null) {
                return;
            }
            appCompatTextView2.setText(Utils.m27275a().getString(R$string.short_tv_download));
            return;
        }
        C26866a.a aVar = C26866a.f81698a;
        String tag = getTAG();
        Intrinsics.m97801g(tag, "<get-TAG>(...)");
        C26866a.a.m104908v(aVar, tag, "observe totalSize:" + totalSize, false, 4, null);
        String strM27408b = AbstractC5790i.m27408b(totalSize, 1);
        Intrinsics.m97801g(strM27408b, "byte2FitMemorySize(...)");
        this.formatSize = strM27408b;
        C27334d c27334d2 = (C27334d) getMViewBinding();
        if (c27334d2 == null || (appCompatTextView = c27334d2.f83127v) == null) {
            return;
        }
        appCompatTextView.setText(Utils.m27275a().getString(R$string.short_tv_download) + " · " + this.formatSize);
    }

    /* JADX INFO: renamed from: q1 */
    private final void m81133q1(View view) {
        if (C26102c.f79666a.m102236a(view.getId(), 500L)) {
            return;
        }
        C19523b.m81325g(m81100R0(), this.subjectId, null, 2, null);
        InterfaceC28663h interfaceC28663hM81404P = m81166g0().m81404P();
        if (interfaceC28663hM81404P != null) {
            String str = this.subjectId;
            Subject subject = this.subject;
            interfaceC28663hM81404P.mo73816a(this, str, subject != null ? subject.getTitle() : null, this.pageFrom);
        }
    }

    /* JADX INFO: renamed from: r1 */
    private final void m81135r1(String type) {
        C3187b0 c3187b0M81365l;
        List data;
        List data2;
        List data3;
        C3187b0 c3187b0M81365l2;
        List data4;
        List data5;
        List data6;
        int iHashCode = type.hashCode();
        if (iHashCode != -1747705881) {
            if (iHashCode != 229859771) {
                if (iHashCode != 298697238) {
                    return;
                }
                type.equals("ad_cancel");
                return;
            } else if (!type.equals("ad_load_fail")) {
                return;
            }
        } else if (!type.equals("ad_success")) {
            return;
        }
        int i11 = this.endPosition;
        this.startPosition = i11 + 1;
        int i12 = i11 + this.perUnlockCount;
        this.endPosition = i12;
        ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter = this.shortTVEpAdapter;
        if (i12 > ((shortTvDownloadEpListAdapter == null || (data6 = shortTvDownloadEpListAdapter.getData()) == null) ? 0 : data6.size())) {
            ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter2 = this.shortTVEpAdapter;
            this.endPosition = (shortTvDownloadEpListAdapter2 == null || (data5 = shortTvDownloadEpListAdapter2.getData()) == null) ? 0 : data5.size();
        }
        C26866a.a aVar = C26866a.f81698a;
        String tag = getTAG();
        Intrinsics.m97801g(tag, "<get-TAG>(...)");
        C26866a.a.m104898f(aVar, tag, "广告解锁成功 , 请求新数据， start：" + this.startPosition + ", end:" + this.endPosition, false, 4, null);
        C19529h c19529h = C19529h.f62465a;
        String str = this.subjectId;
        if (str == null) {
            str = "";
        }
        c19529h.m81350k(str, this.endPosition);
        ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter3 = this.shortTVEpAdapter;
        final String string = ((shortTvDownloadEpListAdapter3 == null || (data4 = shortTvDownloadEpListAdapter3.getData()) == null) ? 0 : data4.size()) - this.curUnlockAllCount <= this.perUnlockCount ? Utils.m27275a().getString(R$string.download_short_tv_watch_ad_all) : String.valueOf((this.endPosition - this.startPosition) + 1);
        Intrinsics.m97799e(string);
        new Handler().postDelayed(new Runnable() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.h
            @Override // java.lang.Runnable
            public final void run() {
                ShortTVDownloadReFragment.m81137s1(string);
            }
        }, 400L);
        StringBuilder sb2 = new StringBuilder();
        int i13 = this.startPosition;
        int i14 = this.endPosition;
        if (i13 <= i14) {
            while (true) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(i13);
                if (i13 == i14) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        C19523b c19523bM81100R0 = m81100R0();
        Subject subject = this.subject;
        String string2 = sb2.toString();
        Intrinsics.m97801g(string2, "toString(...)");
        C19523b.m81326i(c19523bM81100R0, subject, type, string2, null, 8, null);
        int i15 = this.curUnlockAllCount;
        int i16 = this.endPosition;
        if (i15 < i16) {
            this.curUnlockAllCount = i16;
            ShortTvDownloadViewModel shortTvDownloadViewModelM81167h0 = getViewModel();
            Map linkedHashMap = (shortTvDownloadViewModelM81167h0 == null || (c3187b0M81365l2 = shortTvDownloadViewModelM81167h0.m81365l()) == null) ? null : (Map) c3187b0M81365l2.m14847f();
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter4 = this.shortTVEpAdapter;
            int size = (shortTvDownloadEpListAdapter4 == null || (data3 = shortTvDownloadEpListAdapter4.getData()) == null) ? 0 : data3.size();
            int i17 = this.endPosition;
            if (size >= i17) {
                for (int i18 = this.startPosition - 1; i18 < i17; i18++) {
                    ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter5 = this.shortTVEpAdapter;
                    if (i18 < ((shortTvDownloadEpListAdapter5 == null || (data2 = shortTvDownloadEpListAdapter5.getData()) == null) ? 0 : data2.size())) {
                        ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter6 = this.shortTVEpAdapter;
                        C27850c c27850c = (shortTvDownloadEpListAdapter6 == null || (data = shortTvDownloadEpListAdapter6.getData()) == null) ? null : (C27850c) data.get(i18);
                        if (c27850c != null) {
                            if (this.isSelectAll) {
                                c27850c.m108252f(true);
                                linkedHashMap.put(Integer.valueOf(i18), c27850c);
                            }
                            c27850c.m108251e(true);
                            ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter7 = this.shortTVEpAdapter;
                            if (shortTvDownloadEpListAdapter7 != null) {
                                shortTvDownloadEpListAdapter7.notifyItemChanged(i18, c27850c);
                            }
                        }
                    }
                }
            }
            ShortTvDownloadViewModel shortTvDownloadViewModelM81167h1 = getViewModel();
            if (shortTvDownloadViewModelM81167h1 != null && (c3187b0M81365l = shortTvDownloadViewModelM81167h1.m81365l()) != null) {
                c3187b0M81365l.mo14858q(linkedHashMap);
            }
        }
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final void m81137s1(String str) {
        C26950b.f81855a.m105092e(Utils.m27275a().getString(R$string.download_short_tv_unlock_success_toast, str));
    }

    private final void showLoading() {
        FrameLayout frameLayout;
        C27334d c27334d = (C27334d) getMViewBinding();
        if (c27334d == null || (frameLayout = c27334d.f83113h) == null) {
            return;
        }
        frameLayout.removeAllViews();
        frameLayout.setVisibility(0);
        frameLayout.addView(m81094L0());
    }

    private final void showNotNetError() {
        FrameLayout frameLayout;
        C27334d c27334d = (C27334d) getMViewBinding();
        if (c27334d == null || (frameLayout = c27334d.f83113h) == null) {
            return;
        }
        frameLayout.removeAllViews();
        frameLayout.setVisibility(0);
        frameLayout.addView(m81099Q0());
    }

    /* JADX INFO: renamed from: t1 */
    private final void m81139t1() {
        BiddingInterstitialManager.Companion.m63105b(BiddingInterstitialManager.f49491t, "ShortTvInterstitialScene", null, 2, null);
        BiddingVideoManager.Companion.m63266b(BiddingVideoManager.f49576t, "ShortTvVideoScene", null, 2, null);
    }

    /* JADX INFO: renamed from: u1 */
    private final void m81141u1(final boolean selectAll) {
        FrameLayout frameLayout;
        C26866a.a aVar = C26866a.f81698a;
        String tag = getTAG();
        Intrinsics.m97801g(tag, "<get-TAG>(...)");
        C26866a.a.m104898f(aVar, tag, "selectAll click, selectAll = " + selectAll + " ", false, 4, null);
        this.isSelectAll = selectAll;
        if (!this.isRequestingData) {
            m81145w1(selectAll);
            return;
        }
        C27334d c27334d = (C27334d) getMViewBinding();
        if (c27334d != null && (frameLayout = c27334d.f83112g) != null) {
            AbstractC23896b.m94642d(frameLayout);
        }
        this.selectAllCallback = new Function0() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTVDownloadReFragment.m81143v1(this.f62251a, selectAll);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public static final Unit m81143v1(ShortTVDownloadReFragment shortTVDownloadReFragment, boolean z11) {
        shortTVDownloadReFragment.m81145w1(z11);
        shortTVDownloadReFragment.selectAllCallback = null;
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: w1 */
    private final void m81145w1(boolean selectAll) {
        if (this.curUnlockAllCount > 30) {
            m81149y1(selectAll);
        } else {
            m81147x1(selectAll);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private final void m81147x1(boolean isSelected) {
        C3187b0 c3187b0M81366m;
        C3187b0 c3187b0M81365l;
        DownloadItem downloadItem;
        Long size;
        List data;
        List data2;
        C3187b0 c3187b0M81365l2;
        ShortTvDownloadViewModel shortTvDownloadViewModelM81167h0 = getViewModel();
        Map linkedHashMap = (shortTvDownloadViewModelM81167h0 == null || (c3187b0M81365l2 = shortTvDownloadViewModelM81167h0.m81365l()) == null) ? null : (Map) c3187b0M81365l2.m14847f();
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.clear();
        int i11 = this.curUnlockAllCount;
        long jLongValue = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter = this.shortTVEpAdapter;
            if (i12 < ((shortTvDownloadEpListAdapter == null || (data2 = shortTvDownloadEpListAdapter.getData()) == null) ? 0 : data2.size())) {
                ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter2 = this.shortTVEpAdapter;
                C27850c c27850c = (shortTvDownloadEpListAdapter2 == null || (data = shortTvDownloadEpListAdapter2.getData()) == null) ? null : (C27850c) data.get(i12);
                if (this.unlockDownloadLst.containsKey(Integer.valueOf(i12)) && (((downloadItem = (DownloadItem) this.unlockDownloadLst.get(Integer.valueOf(i12))) == null || !downloadItem.isUnable()) && c27850c != null)) {
                    c27850c.m108252f(isSelected);
                    if (isSelected) {
                        jLongValue += (downloadItem == null || (size = downloadItem.getSize()) == null) ? 0L : size.longValue();
                        linkedHashMap.put(Integer.valueOf(i12), c27850c);
                    } else {
                        linkedHashMap.remove(Integer.valueOf(i12));
                    }
                }
            }
        }
        ShortTvDownloadViewModel shortTvDownloadViewModelM81167h1 = getViewModel();
        if (shortTvDownloadViewModelM81167h1 != null && (c3187b0M81365l = shortTvDownloadViewModelM81167h1.m81365l()) != null) {
            c3187b0M81365l.mo14858q(linkedHashMap);
        }
        ShortTvDownloadViewModel shortTvDownloadViewModelM81167h2 = getViewModel();
        if (shortTvDownloadViewModelM81167h2 != null && (c3187b0M81366m = shortTvDownloadViewModelM81167h2.m81366m()) != null) {
            c3187b0M81366m.mo14858q(Long.valueOf(jLongValue));
        }
        ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter3 = this.shortTVEpAdapter;
        if (shortTvDownloadEpListAdapter3 != null) {
            shortTvDownloadEpListAdapter3.notifyItemRangeChanged(0, this.curUnlockAllCount);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.util.LinkedHashMap] */
    /* JADX INFO: renamed from: y1 */
    private final void m81149y1(boolean isSelected) {
        C3187b0 c3187b0M81365l;
        FrameLayout frameLayout;
        C27334d c27334d = (C27334d) getMViewBinding();
        if (c27334d != null && (frameLayout = c27334d.f83112g) != null) {
            AbstractC23896b.m94642d(frameLayout);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ShortTvDownloadViewModel shortTvDownloadViewModelM81167h0 = getViewModel();
        T t11 = (shortTvDownloadViewModelM81167h0 == null || (c3187b0M81365l = shortTvDownloadViewModelM81167h0.m81365l()) == null) ? 0 : (Map) c3187b0M81365l.m14847f();
        objectRef.element = t11;
        if (t11 == 0) {
            objectRef.element = new LinkedHashMap();
        }
        ((Map) objectRef.element).clear();
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new ShortTVDownloadReFragment$selectAllWithSizeMoreThan30$1(this, isSelected, objectRef, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public static final C19523b m81151z1() {
        return new C19523b();
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public C27334d getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C27334d c27334dM106436c = C27334d.m106436c(inflater);
        Intrinsics.m97801g(c27334dM106436c, "inflate(...)");
        return c27334dM106436c;
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void initListener() {
        LinearLayoutCompat linearLayoutCompat;
        AppCompatImageView appCompatImageView;
        AppCompatTextView appCompatTextView;
        BLImageView bLImageView;
        BLImageView bLImageView2;
        BLView bLView;
        ImageView imageView;
        C27334d c27334d = (C27334d) getMViewBinding();
        if (c27334d != null && (imageView = c27334d.f83117l) != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShortTVDownloadReFragment.m81101T0(this.f62262a, view);
                }
            });
        }
        C27334d c27334d2 = (C27334d) getMViewBinding();
        if (c27334d2 != null && (bLView = c27334d2.f83104G) != null) {
            bLView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShortTVDownloadReFragment.m81102U0(this.f62244a, view);
                }
            });
        }
        C27334d c27334d3 = (C27334d) getMViewBinding();
        if (c27334d3 != null && (bLImageView2 = c27334d3.f83119n) != null) {
            bLImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShortTVDownloadReFragment.m81103V0(this.f62245a, view);
                }
            });
        }
        C27334d c27334d4 = (C27334d) getMViewBinding();
        if (c27334d4 != null && (bLImageView = c27334d4.f83120o) != null) {
            bLImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShortTVDownloadReFragment.m81104W0(this.f62246a, view);
                }
            });
        }
        C27334d c27334d5 = (C27334d) getMViewBinding();
        if (c27334d5 != null && (appCompatTextView = c27334d5.f83098A) != null) {
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShortTVDownloadReFragment.m81105X0(this.f62247a, view);
                }
            });
        }
        C27334d c27334d6 = (C27334d) getMViewBinding();
        if (c27334d6 != null && (appCompatImageView = c27334d6.f83116k) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShortTVDownloadReFragment.m81106Y0(this.f62248a, view);
                }
            });
        }
        C27334d c27334d7 = (C27334d) getMViewBinding();
        if (c27334d7 == null || (linearLayoutCompat = c27334d7.f83109d) == null) {
            return;
        }
        linearLayoutCompat.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTVDownloadReFragment.m81107Z0(this.f62249a, view);
            }
        });
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void initViewData() {
        initView();
        m81139t1();
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void initViewModel() {
        C3187b0 c3187b0M81364k;
        C3187b0 c3187b0M81362i;
        C3187b0 c3187b0M81363j;
        C3187b0 c3187b0M81368o;
        C3187b0 c3187b0M81366m;
        C3187b0 c3187b0M81365l;
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            ShortTvDownloadViewModel shortTvDownloadViewModelM81167h0 = getViewModel();
            if (shortTvDownloadViewModelM81167h0 != null && (c3187b0M81365l = shortTvDownloadViewModelM81167h0.m81365l()) != null) {
                c3187b0M81365l.m14851j(parentFragment, new C19415d(new Function1() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTVDownloadReFragment.m81111d1(this.f62255a, (Map) obj);
                    }
                }));
            }
            ShortTvDownloadViewModel shortTvDownloadViewModelM81167h1 = getViewModel();
            if (shortTvDownloadViewModelM81167h1 != null && (c3187b0M81366m = shortTvDownloadViewModelM81167h1.m81366m()) != null) {
                c3187b0M81366m.m14851j(parentFragment, new C19415d(new Function1() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTVDownloadReFragment.m81112e1(this.f62256a, (Long) obj);
                    }
                }));
            }
            ShortTvDownloadViewModel shortTvDownloadViewModelM81167h2 = getViewModel();
            if (shortTvDownloadViewModelM81167h2 != null && (c3187b0M81368o = shortTvDownloadViewModelM81167h2.m81368o()) != null) {
                c3187b0M81368o.m14851j(parentFragment, new C19415d(new Function1() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTVDownloadReFragment.m81113f1(this.f62257a, (String) obj);
                    }
                }));
            }
            ShortTvDownloadViewModel shortTvDownloadViewModelM81167h3 = getViewModel();
            if (shortTvDownloadViewModelM81167h3 != null && (c3187b0M81363j = shortTvDownloadViewModelM81167h3.m81363j()) != null) {
                c3187b0M81363j.m14851j(parentFragment, new C19415d(new Function1() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTVDownloadReFragment.m81114g1((Integer) obj);
                    }
                }));
            }
        }
        Context context = getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        Function1 function1 = new Function1() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTVDownloadReFragment.m81115h1(this.f62258a, (C28673c) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C28673c.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent((AppCompatActivity) context, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
        Fragment parentFragment2 = getParentFragment();
        if (parentFragment2 != null && getViewModel() != null) {
            ShortTvDownloadViewModel shortTvDownloadViewModelM81167h4 = getViewModel();
            if (shortTvDownloadViewModelM81167h4 != null && (c3187b0M81362i = shortTvDownloadViewModelM81167h4.m81362i()) != null) {
                c3187b0M81362i.m14851j(parentFragment2, new C19415d(new Function1() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTVDownloadReFragment.m81109b1(this.f62259a, (DownloadListBean) obj);
                    }
                }));
            }
            ShortTvDownloadViewModel shortTvDownloadViewModelM81167h5 = getViewModel();
            if (shortTvDownloadViewModelM81167h5 != null && (c3187b0M81364k = shortTvDownloadViewModelM81167h5.m81364k()) != null) {
                c3187b0M81364k.m14851j(parentFragment2, new C19415d(new Function1() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTVDownloadReFragment.m81110c1(this.f62260a, (Subject) obj);
                    }
                }));
            }
        }
        C26866a.a aVar = C26866a.f81698a;
        String tag = getTAG();
        Intrinsics.m97801g(tag, "<get-TAG>(...)");
        C26866a.a.m104898f(aVar, tag, "initViewModel ,loadData", false, 4, null);
        showLoading();
        loadData();
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public boolean isMonitorNetworkState() {
        return true;
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        String string;
        String string2;
        String string3;
        String string4;
        HashMap mapM96844g;
        HashMap mapM96844g2;
        HashMap mapM96844g3;
        HashMap mapM96844g4;
        HashMap mapM96844g5;
        String subjectId;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString(WebConstants.PAGE_FROM)) == null) {
            string = "";
        }
        this.pageFrom = string;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("last_page_from")) == null) {
            string2 = "";
        }
        this.lastPageFrom = string2;
        Bundle arguments3 = getArguments();
        this.subject = (Subject) (arguments3 != null ? arguments3.getSerializable("subject") : null);
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (string3 = arguments4.getString("ops")) == null) {
            string3 = "";
        }
        this.ops = string3;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (string4 = arguments5.getString("module_name")) == null) {
            string4 = "";
        }
        this.moduleName = string4;
        Bundle arguments6 = getArguments();
        this.scroll2Download = arguments6 != null ? arguments6.getBoolean("download_scroll_to_download") : false;
        Subject subject = this.subject;
        this.subjectId = subject != null ? subject.getSubjectId() : null;
        C19529h c19529h = C19529h.f62465a;
        Subject subject2 = this.subject;
        if (subject2 != null && (subjectId = subject2.getSubjectId()) != null) {
            str = subjectId;
        }
        this.curUnlockAllCount = c19529h.m81346e(str);
        this.perUnlockCount = c19529h.m81349h();
        int i11 = this.curUnlockAllCount;
        if (i11 > 20) {
            i11 = 20;
        }
        this.endPosition = i11;
        C26866a.a aVar = C26866a.f81698a;
        String tag = getTAG();
        Intrinsics.m97801g(tag, "<get-TAG>(...)");
        C26866a.a.m104898f(aVar, tag, "ShortTv download init subjectId:" + this.subjectId + ", curUnlockAllCount:" + this.curUnlockAllCount + ", perUnlockCount:" + this.perUnlockCount, false, 4, null);
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (mapM96844g5 = logViewConfig.m96844g()) != null) {
            mapM96844g5.put(WebConstants.PAGE_FROM, this.pageFrom);
        }
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 != null && (mapM96844g4 = logViewConfig2.m96844g()) != null) {
            mapM96844g4.put("last_page_from", this.lastPageFrom);
        }
        C24655b logViewConfig3 = getLogViewConfig();
        if (logViewConfig3 != null && (mapM96844g3 = logViewConfig3.m96844g()) != null) {
            Subject subject3 = this.subject;
            mapM96844g3.put("subject_id", subject3 != null ? subject3.getSubjectId() : null);
        }
        C24655b logViewConfig4 = getLogViewConfig();
        if (logViewConfig4 != null && (mapM96844g2 = logViewConfig4.m96844g()) != null) {
            mapM96844g2.put("ops", this.ops);
        }
        C24655b logViewConfig5 = getLogViewConfig();
        if (logViewConfig5 != null && (mapM96844g = logViewConfig5.m96844g()) != null) {
            mapM96844g.put(NativeComponentConstants.KEY_COMPONENT_TYPE, "2");
        }
        C19523b.m81324d(m81100R0(), this.subjectId, "dialog_minitv_download", null, 4, null);
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        initHistory();
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void retryLoadData() {
        List data;
        ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter = this.shortTVEpAdapter;
        if (shortTvDownloadEpListAdapter == null || (data = shortTvDownloadEpListAdapter.getData()) == null || data.size() != 0) {
            return;
        }
        showLoading();
        loadData();
    }
}
