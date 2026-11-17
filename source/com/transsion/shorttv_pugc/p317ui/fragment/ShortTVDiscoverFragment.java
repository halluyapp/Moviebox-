package com.transsion.shorttv_pugc.p317ui.fragment;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.gyf.immersionbar.ImmersionBar;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.p278ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.p285ad.bidding.nativead.BiddingListManager;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.shorttv.R$color;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv.base.widget.SafeRecyclerView;
import com.transsion.shorttv.p315ui.widget.ShortTVBannerView;
import com.transsion.shorttv_pugc.base.fragment.PageStatusFragment;
import com.transsion.shorttv_pugc.base.widget.AbstractC19262j;
import com.transsion.shorttv_pugc.base.widget.NpaGridLayoutManager;
import com.transsion.shorttv_pugc.base.widget.StateView;
import com.transsion.shorttv_pugc.bean.BannerData;
import com.transsion.shorttv_pugc.bean.Image;
import com.transsion.shorttv_pugc.bean.Pager;
import com.transsion.shorttv_pugc.bean.ShortTVRespData;
import com.transsion.shorttv_pugc.bean.ShortTvItemType;
import com.transsion.shorttv_pugc.bean.Subject;
import com.transsion.shorttv_pugc.p317ui.adapter.ShortTVBannerAdapter;
import com.transsion.shorttv_pugc.p317ui.adapter.ShortTVTrendingAdapter;
import com.transsion.shorttv_pugc.p317ui.widget.ShortTVDiscoverHeaderView;
import com.transsion.shorttv_pugc.p317ui.widget.ShortTVFavoriteView;
import com.transsion.shorttv_pugc.p317ui.widget.ShortTvLoadMoreView;
import com.transsion.shorttv_pugc.utils.C19522a;
import com.transsion.shorttv_pugc.viewmodel.ShortTvViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gt.C23673b;
import gt.InterfaceC23672a;
import ht.AbstractC23895a;
import java.util.ArrayList;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p550kj.C24655b;
import p623nt.AbstractC26100a;
import p623nt.C26105f;
import p743rh.C27287m;
import p765s6.InterfaceC27564b;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p849vt.C28224a;
import p920xt.InterfaceC28664i;
import p990zt.C29244b;
import pg.C26866a;
import pt.C26950b;
import rs.C27361q0;
import rs.C27370x;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u0019\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0004J\u0019\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u000f\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u0004J\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010\u0004J\u001f\u0010'\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000bH\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0005H\u0002¢\u0006\u0004\b)\u0010\u0004J\u0017\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0005H\u0016¢\u0006\u0004\b1\u0010\u0004J\u000f\u00102\u001a\u00020\u0005H\u0016¢\u0006\u0004\b2\u0010\u0004J\u000f\u00103\u001a\u00020\u0005H\u0016¢\u0006\u0004\b3\u0010\u0004J\u000f\u00104\u001a\u00020\u0005H\u0016¢\u0006\u0004\b4\u0010\u0004J\u000f\u00105\u001a\u00020\u0005H\u0016¢\u0006\u0004\b5\u0010\u0004J\u000f\u00106\u001a\u00020\u0005H\u0016¢\u0006\u0004\b6\u0010\u0004J/\u0010:\u001a\u00020\u00052\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020$\u0018\u0001072\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0005H\u0016¢\u0006\u0004\b<\u0010\u0004J\u0017\u0010?\u001a\u00020>2\u0006\u0010=\u001a\u00020\u000bH\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u001eH\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020>H\u0016¢\u0006\u0004\bC\u0010DJ\u0011\u0010E\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\bE\u0010DJ\u000f\u0010F\u001a\u00020\u001eH\u0016¢\u0006\u0004\bF\u0010BJ\u0017\u0010H\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u000bH\u0016¢\u0006\u0004\bH\u0010\u000eJ\u000f\u0010I\u001a\u00020\u0005H\u0016¢\u0006\u0004\bI\u0010\u0004J\u000f\u0010J\u001a\u00020\u0005H\u0016¢\u0006\u0004\bJ\u0010\u0004J\u000f\u0010K\u001a\u00020.H\u0016¢\u0006\u0004\bK\u00100J\u000f\u0010L\u001a\u00020.H\u0016¢\u0006\u0004\bL\u00100J\u000f\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0005H\u0016¢\u0006\u0004\bP\u0010\u0004R\"\u0010U\u001a\n Q*\u0004\u0018\u00010.0.8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u00100R$\u0010]\u001a\u0004\u0018\u00010V8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010b\u001a\u00020.8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b^\u0010S\u001a\u0004\b_\u00100\"\u0004\b`\u0010aR$\u0010j\u001a\u0004\u0018\u00010c8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001b\u0010p\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u0018\u0010t\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\"\u0010w\u001a\u00020\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010\u0010\"\u0004\bx\u0010\u000eR\"\u0010z\u001a\u00020\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\by\u0010v\u001a\u0004\bz\u0010\u0010\"\u0004\b{\u0010\u000eR\u0016\u0010~\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R&\u0010\u0083\u0001\u001a\u000f\u0012\u0004\u0012\u00020.\u0012\u0005\u0012\u00030\u0080\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R \u0010\u0090\u0001\u001a\u00030\u008c\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008d\u0001\u0010m\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0092\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010}R\u001a\u0010\u0096\u0001\u001a\u00030\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u0098\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010vR\u0016\u0010\u009a\u0001\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010}RI\u0010¤\u0001\u001a\"\u0012\u0015\u0012\u00130\u000b¢\u0006\u000e\b\u009c\u0001\u0012\t\b\u009d\u0001\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u009b\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R\u001c\u0010¨\u0001\u001a\u0005\u0018\u00010¥\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R&\u0010¬\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b©\u0001\u0010v\u001a\u0005\bª\u0001\u0010\u0010\"\u0005\b«\u0001\u0010\u000eR\u0018\u0010®\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u00ad\u0001\u0010}R\u0018\u0010²\u0001\u001a\u00030¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001c\u0010¶\u0001\u001a\u0005\u0018\u00010³\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001¨\u0006·\u0001"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/ui/fragment/ShortTVDiscoverFragment;", "Lcom/transsion/shorttv_pugc/base/fragment/PageStatusFragment;", "Lrs/x;", "<init>", "()V", "", "L0", "Lcom/transsion/shorttv_pugc/bean/ShortTVRespData;", "data", "f1", "(Lcom/transsion/shorttv_pugc/bean/ShortTVRespData;)V", "", "isBanner", "B0", "(Z)V", "J0", "()Z", "c1", "y0", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "A0", "(Landroidx/recyclerview/widget/RecyclerView;)V", "loadMore", "isRefresh", "W0", "V0", "x0", "d1", "X0", "", "dy", "Y0", "(I)V", "showLoading", "hideLoading", "Lcom/transsion/shorttv_pugc/bean/Subject;", "subject", "isDownloadView", "Z0", "(Lcom/transsion/shorttv_pugc/bean/Subject;Z)V", "initAd", "Landroid/view/LayoutInflater;", "inflater", "I0", "(Landroid/view/LayoutInflater;)Lrs/x;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewData", "initViewModel", TmcConstants.NAVIGATION_ON_START, "initListener", "retryLoadData", "b1", "", "list", "hasMore", "h1", "(Ljava/util/List;ZZ)V", "g1", "isShowTitleLayout", "Landroid/view/View;", "getEmptyView", "(Z)Landroid/view/View;", "getScreenType", "()I", "getNoNetworkView", "()Landroid/view/View;", "getLoadingView", "G0", "hidden", "onHiddenChanged", "onResume", "onPause", "getPageName", "E0", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "onDestroy", "kotlin.jvm.PlatformType", "i", "Ljava/lang/String;", "getTAG", "TAG", "Lcom/transsion/shorttv_pugc/ui/adapter/ShortTVTrendingAdapter;", "j", "Lcom/transsion/shorttv_pugc/ui/adapter/ShortTVTrendingAdapter;", "F0", "()Lcom/transsion/shorttv_pugc/ui/adapter/ShortTVTrendingAdapter;", "setListAdapter", "(Lcom/transsion/shorttv_pugc/ui/adapter/ShortTVTrendingAdapter;)V", "listAdapter", CampaignEx.JSON_KEY_AD_K, "getNextPage", "setNextPage", "(Ljava/lang/String;)V", "nextPage", "Lcom/transsion/shorttv_pugc/viewmodel/ShortTvViewModel;", "l", "Lcom/transsion/shorttv_pugc/viewmodel/ShortTvViewModel;", "getViewModel", "()Lcom/transsion/shorttv_pugc/viewmodel/ShortTvViewModel;", "setViewModel", "(Lcom/transsion/shorttv_pugc/viewmodel/ShortTvViewModel;)V", "viewModel", "Lzt/b;", "m", "Lkotlin/Lazy;", "H0", "()Lzt/b;", "recReport", "Lcom/transsion/shorttv_pugc/ui/widget/ShortTVFavoriteView;", "n", "Lcom/transsion/shorttv_pugc/ui/widget/ShortTVFavoriteView;", "favoriteHeaderView", "o", "Z", "isFirstStart", "setFirstStart", TtmlNode.TAG_P, "isFirstPageChange", "setFirstPageChange", CampaignEx.JSON_KEY_AD_Q, "I", "tabId", "", "Landroid/view/ViewGroup;", CampaignEx.JSON_KEY_AD_R, "Ljava/util/Map;", "headerViewList", "Lrs/q0;", "s", "Lrs/q0;", "bannerBinding", "Lcom/transsion/shorttv_pugc/ui/adapter/ShortTVBannerAdapter;", "t", "Lcom/transsion/shorttv_pugc/ui/adapter/ShortTVBannerAdapter;", "bannerAdapter", "Lcom/transsion/shorttv_pugc/utils/a;", TmcStartParams.KEY_URL_SHORT, "C0", "()Lcom/transsion/shorttv_pugc/utils/a;", "bannerDotHelper", "v", "bannerCurPosition", "", "w", "J", "bannerBrowseTime", "x", "hasAddedBanner", "y", "statusBarHeight", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "z", "Lkotlin/jvm/functions/Function1;", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/recyclerview/widget/RecyclerView$r;", "A", "Landroidx/recyclerview/widget/RecyclerView$r;", "subTabScrollListener", "B", "getHasSlideOutBanner", "e1", "hasSlideOutBanner", "C", "mDy", "Lgt/b;", "D", "Lgt/b;", "exposureHelper", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "E", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "v3ListManager", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public class ShortTVDiscoverFragment extends PageStatusFragment<C27370x> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private RecyclerView.AbstractC4219r subTabScrollListener;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean hasSlideOutBanner;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private int mDy;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private BiddingListManager v3ListManager;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private ShortTVTrendingAdapter listAdapter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private ShortTvViewModel viewModel;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private ShortTVFavoriteView favoriteHeaderView;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private C27361q0 bannerBinding;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private ShortTVBannerAdapter bannerAdapter;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private long bannerBrowseTime;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean hasAddedBanner;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private Function1 listener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String TAG = getClass().getSimpleName();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String nextPage = "1";

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Lazy recReport = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.ui.fragment.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShortTVDiscoverFragment.m80949a1();
        }
    });

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean isFirstStart = true;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean isFirstPageChange = true;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int tabId = 13;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Map headerViewList = new LinkedHashMap();

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final Lazy bannerDotHelper = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.ui.fragment.l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShortTVDiscoverFragment.m80973z0(this.f62279a);
        }
    });

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private int bannerCurPosition = -1;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final int statusBarHeight = AbstractC5781d.m27351c();

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final C23673b exposureHelper = new C23673b(0.6f, new C19375b(), false, 4, null);

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShortTVDiscoverFragment$a */
    public static final class C19374a extends RecyclerView.AbstractC4219r {
        C19374a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            if (i12 > 0) {
                ShortTVDiscoverFragment.this.m80927A0(recyclerView);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShortTVDiscoverFragment$b */
    public static final class C19375b implements InterfaceC23672a {
        C19375b() {
        }

        @Override // gt.InterfaceC23672a
        /* JADX INFO: renamed from: a */
        public void mo80863a(int i11, long j11, View view) {
            List<Object> data;
            List<Object> data2;
            ShortTVTrendingAdapter listAdapter = ShortTVDiscoverFragment.this.getListAdapter();
            if (((listAdapter == null || (data2 = listAdapter.getData()) == null) ? 0 : data2.size()) <= i11) {
                return;
            }
            ShortTVTrendingAdapter listAdapter2 = ShortTVDiscoverFragment.this.getListAdapter();
            Subject subject = (listAdapter2 == null || (data = listAdapter2.getData()) == null) ? null : (Subject) data.get(i11);
            if (subject != null) {
                ShortTVDiscoverFragment.this.m80931H0().m112128a(ShortTVDiscoverFragment.this.getPageName(), subject, i11, j11, ShortTVDiscoverFragment.this.m80974E0());
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShortTVDiscoverFragment$c */
    public static final class C19376c extends DiffUtil.AbstractC4174e {
        C19376c() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(Subject oldItem, Subject newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getSubjectId(), newItem.getSubjectId());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(Subject oldItem, Subject newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return oldItem.hashCode() == newItem.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShortTVDiscoverFragment$d */
    public static final class C19377d extends GridLayoutManager.AbstractC4187c {

        /* JADX INFO: renamed from: f */
        final /* synthetic */ SafeRecyclerView f62133f;

        C19377d(SafeRecyclerView safeRecyclerView) {
            this.f62133f = safeRecyclerView;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x003e  */
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC4187c
        /* JADX INFO: renamed from: f */
        public int mo20742f(int i11) {
            BiddingNativeManager nonAdDelegate;
            List<Object> data;
            boolean z11 = false;
            if (i11 >= 0) {
                ShortTVTrendingAdapter listAdapter = ShortTVDiscoverFragment.this.getListAdapter();
                if (i11 < ((listAdapter == null || (data = listAdapter.getData()) == null) ? 0 : data.size())) {
                    ShortTVTrendingAdapter listAdapter2 = ShortTVDiscoverFragment.this.getListAdapter();
                    if (listAdapter2 == null) {
                        nonAdDelegate = null;
                    } else {
                        ShortTVTrendingAdapter listAdapter3 = ShortTVDiscoverFragment.this.getListAdapter();
                        Subject subject = (Subject) listAdapter2.getItem(i11 - (listAdapter3 != null ? listAdapter3.m36174a0() : 0));
                        if (subject != null) {
                            nonAdDelegate = subject.getNonAdDelegate();
                        } else {
                            nonAdDelegate = null;
                        }
                    }
                    if (nonAdDelegate != null) {
                        z11 = true;
                    }
                }
            }
            Context context = this.f62133f.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            return (!AbstractC26100a.m102231a(context) || z11) ? 2 : 1;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShortTVDiscoverFragment$e */
    public static final class C19378e extends RecyclerView.AbstractC4213l {
        C19378e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(outRect, "outRect");
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (parent.getAdapter() != null) {
                if (childAdapterPosition == 0) {
                    outRect.top = AbstractC5776a0.m27313a(0.0f);
                } else {
                    outRect.top = AbstractC5776a0.m27313a(16.0f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShortTVDiscoverFragment$f */
    public static final class C19379f extends RecyclerView.AbstractC4219r {

        /* JADX INFO: renamed from: a */
        private int f62134a;

        C19379f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            C27370x c27370x;
            SafeRecyclerView safeRecyclerView;
            Intrinsics.m97802h(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i11);
            if (i11 != 0 || (c27370x = (C27370x) ShortTVDiscoverFragment.this.getMViewBinding()) == null || (safeRecyclerView = c27370x.f83349b) == null || safeRecyclerView.canScrollVertically(-1)) {
                return;
            }
            ShortTVDiscoverFragment shortTVDiscoverFragment = ShortTVDiscoverFragment.this;
            shortTVDiscoverFragment.m80928B0(shortTVDiscoverFragment.m80932J0());
            ShortTVDiscoverFragment.this.m80979e1(false);
            this.f62134a = 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            ShortTVDiscoverFragment.this.m80947Y0(i12);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShortTVDiscoverFragment$g */
    static final class C19380g implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f62136a;

        C19380g(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f62136a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f62136a;
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
            this.f62136a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public final void m80927A0(RecyclerView recyclerView) {
        ShortTVTrendingAdapter shortTVTrendingAdapter;
        LinearLayout linearLayoutM36172Z;
        RecyclerView.AbstractC4214m layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (!(layoutManager instanceof LinearLayoutManager) || ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition() != 0 || (shortTVTrendingAdapter = this.listAdapter) == null || (linearLayoutM36172Z = shortTVTrendingAdapter.m36172Z()) == null) {
            return;
        }
        int childCount = linearLayoutM36172Z.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayoutM36172Z.getChildAt(i11);
            if ((childAt instanceof ShortTVDiscoverHeaderView) && childAt.getVisibility() == 0) {
                ((ShortTVDiscoverHeaderView) childAt).clearExposureCache();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public final void m80928B0(boolean isBanner) {
        int color;
        View view;
        if (isBanner && m80932J0()) {
            ImmersionBar immersionBarWith = ImmersionBar.with(this);
            color = 0;
            immersionBarWith.statusBarDarkFont(false);
            immersionBarWith.init();
        } else {
            color = AbstractC2397b.getColor(requireContext(), R$color.short_tv_bg_02);
            ImmersionBar immersionBarWith2 = ImmersionBar.with(this);
            immersionBarWith2.statusBarDarkFont(!C26105f.f79669a.m102241a());
            immersionBarWith2.init();
        }
        C27370x c27370x = (C27370x) getMViewBinding();
        if (c27370x == null || (view = c27370x.f83354g) == null) {
            return;
        }
        view.setBackgroundColor(color);
    }

    /* JADX INFO: renamed from: C0 */
    private final C19522a m80929C0() {
        return (C19522a) this.bannerDotHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final Unit m80930D0(ShortTVDiscoverFragment shortTVDiscoverFragment) {
        String strM96843f;
        shortTVDiscoverFragment.retryLoadData();
        C24655b logViewConfig = shortTVDiscoverFragment.getLogViewConfig();
        if (logViewConfig != null && (strM96843f = logViewConfig.m96843f()) != null) {
            AbstractC19262j.m80650b(strM96843f);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public final C29244b m80931H0() {
        return (C29244b) this.recReport.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public final boolean m80932J0() {
        ShortTVBannerAdapter shortTVBannerAdapter = this.bannerAdapter;
        if (shortTVBannerAdapter == null) {
            return false;
        }
        Intrinsics.m97799e(shortTVBannerAdapter);
        return shortTVBannerAdapter.getData().size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final Unit m80933K0(ShortTVDiscoverFragment shortTVDiscoverFragment, int i11, BiddingNativeManager wrapperNativeManager) {
        List<Object> data;
        Intrinsics.m97802h(wrapperNativeManager, "wrapperNativeManager");
        if (wrapperNativeManager != null) {
            Subject subject = new Subject(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, false, null, -1, 4194303, null);
            subject.setNonAdDelegate(wrapperNativeManager);
            ShortTVTrendingAdapter shortTVTrendingAdapter = shortTVDiscoverFragment.listAdapter;
            int size = (shortTVTrendingAdapter == null || (data = shortTVTrendingAdapter.getData()) == null) ? 0 : data.size();
            Context context = shortTVDiscoverFragment.getContext();
            int i12 = (context == null || !AbstractC26100a.m102231a(context) || i11 % 2 == 0) ? i11 : i11 - 1;
            if (i12 <= size) {
                ShortTVTrendingAdapter shortTVTrendingAdapter2 = shortTVDiscoverFragment.listAdapter;
                if (shortTVTrendingAdapter2 != null) {
                    shortTVTrendingAdapter2.mo36199n(i12, subject);
                }
            } else {
                ShortTVTrendingAdapter shortTVTrendingAdapter3 = shortTVDiscoverFragment.listAdapter;
                if (shortTVTrendingAdapter3 != null) {
                    shortTVTrendingAdapter3.mo36199n(size, subject);
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: L0 */
    private final void m80934L0() {
        final SwipeRefreshLayout swipeRefreshLayout;
        SafeRecyclerView safeRecyclerView;
        final boolean z11 = true;
        ShortTVTrendingAdapter shortTVTrendingAdapter = new ShortTVTrendingAdapter(getPageName(), true);
        shortTVTrendingAdapter.m36186h0().m108655C(new ShortTvLoadMoreView());
        shortTVTrendingAdapter.m36186h0().m108673z(true);
        shortTVTrendingAdapter.m36186h0().m108672y(true);
        shortTVTrendingAdapter.m36186h0().m108657E(3);
        shortTVTrendingAdapter.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.shorttv_pugc.ui.fragment.a
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                ShortTVDiscoverFragment.m80936N0(this.f62197a);
            }
        });
        shortTVTrendingAdapter.m36158R0(new C19376c());
        shortTVTrendingAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.shorttv_pugc.ui.fragment.e
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ShortTVDiscoverFragment.m80937O0(this.f62265a, baseQuickAdapter, view, i11);
            }
        });
        shortTVTrendingAdapter.m36193l(R$id.btn_download);
        shortTVTrendingAdapter.m36216s1(new InterfaceC27564b() { // from class: com.transsion.shorttv_pugc.ui.fragment.f
            @Override // p765s6.InterfaceC27564b
            /* JADX INFO: renamed from: a */
            public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ShortTVDiscoverFragment.m80938P0(this.f62267a, z11, baseQuickAdapter, view, i11);
            }
        });
        this.listAdapter = shortTVTrendingAdapter;
        C27370x c27370x = (C27370x) getMViewBinding();
        if (c27370x != null && (safeRecyclerView = c27370x.f83349b) != null) {
            NpaGridLayoutManager npaGridLayoutManager = new NpaGridLayoutManager(safeRecyclerView.getContext(), 2);
            npaGridLayoutManager.m20740d0(new C19377d(safeRecyclerView));
            safeRecyclerView.setLayoutManager(npaGridLayoutManager);
            safeRecyclerView.setAdapter(this.listAdapter);
            safeRecyclerView.addOnScrollListener(this.exposureHelper);
            m80972y0();
            safeRecyclerView.addItemDecoration(new C19378e());
        }
        C27370x c27370x2 = (C27370x) getMViewBinding();
        if (c27370x2 == null || (swipeRefreshLayout = c27370x2.f83350c) == null) {
            return;
        }
        int iM27313a = AbstractC5776a0.m27313a(30.0f);
        int i11 = this.statusBarHeight + iM27313a;
        swipeRefreshLayout.setProgressViewOffset(false, i11, (iM27313a * 2) + i11);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: com.transsion.shorttv_pugc.ui.fragment.g
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
            /* JADX INFO: renamed from: a */
            public final void mo21823a() {
                ShortTVDiscoverFragment.m80935M0(swipeRefreshLayout, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final void m80935M0(SwipeRefreshLayout swipeRefreshLayout, ShortTVDiscoverFragment shortTVDiscoverFragment) {
        if (C27287m.f83003a.m106330e()) {
            shortTVDiscoverFragment.m80978b1();
        } else {
            C26950b.f81855a.m105091d(R$string.short_tv_no_network_toast);
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final void m80936N0(ShortTVDiscoverFragment shortTVDiscoverFragment) {
        shortTVDiscoverFragment.loadMore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final void m80937O0(ShortTVDiscoverFragment shortTVDiscoverFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        if (item instanceof Subject) {
            Subject subject = (Subject) item;
            shortTVDiscoverFragment.m80931H0().m112129b(shortTVDiscoverFragment.getPageName(), subject, i11, shortTVDiscoverFragment.m80974E0());
            shortTVDiscoverFragment.m80948Z0(subject, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final void m80938P0(ShortTVDiscoverFragment shortTVDiscoverFragment, boolean z11, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        if (item instanceof Subject) {
            Subject subject = (Subject) item;
            shortTVDiscoverFragment.m80931H0().m112129b(shortTVDiscoverFragment.getPageName(), subject, i11, shortTVDiscoverFragment.m80974E0());
            shortTVDiscoverFragment.m80948Z0(subject, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final void m80939Q0(ShortTVDiscoverFragment shortTVDiscoverFragment) {
        SafeRecyclerView safeRecyclerView;
        if (shortTVDiscoverFragment.isAdded()) {
            C27370x c27370x = (C27370x) shortTVDiscoverFragment.getMViewBinding();
            int iComputeVerticalScrollOffset = (c27370x == null || (safeRecyclerView = c27370x.f83349b) == null) ? 0 : safeRecyclerView.computeVerticalScrollOffset();
            shortTVDiscoverFragment.mDy = 0;
            shortTVDiscoverFragment.m80947Y0(iComputeVerticalScrollOffset);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final Unit m80940R0(ShortTVDiscoverFragment shortTVDiscoverFragment, ShortTVRespData shortTVRespData) {
        shortTVDiscoverFragment.hideLoading();
        shortTVDiscoverFragment.m80953f1(shortTVRespData);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX INFO: renamed from: S0 */
    public static final Unit m80941S0(ShortTVDiscoverFragment shortTVDiscoverFragment, ShortTVRespData shortTVRespData) {
        if ((shortTVRespData != null ? shortTVRespData.getItems() : null) != null) {
            List<Subject> items = shortTVRespData.getItems();
            Intrinsics.m97799e(items);
            if (items.isEmpty()) {
                C26866a.a aVar = C26866a.f81698a;
                String TAG = shortTVDiscoverFragment.TAG;
                Intrinsics.m97801g(TAG, "TAG");
                C26866a.a.m104910z(aVar, TAG, "addHeaderView, has no Favorite", false, 4, null);
                shortTVDiscoverFragment.m80951d1();
            } else {
                C26866a.a aVar2 = C26866a.f81698a;
                String TAG2 = shortTVDiscoverFragment.TAG;
                Intrinsics.m97801g(TAG2, "TAG");
                C26866a.a.m104898f(aVar2, TAG2, "addHeaderView, has Favorite", false, 4, null);
                shortTVDiscoverFragment.m80971x0();
            }
        } else {
            C26866a.a aVar3 = C26866a.f81698a;
            String TAG3 = shortTVDiscoverFragment.TAG;
            Intrinsics.m97801g(TAG3, "TAG");
            C26866a.a.m104910z(aVar3, TAG3, "addHeaderView, has no Favorite", false, 4, null);
            shortTVDiscoverFragment.m80951d1();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final void m80942T0(ShortTVDiscoverFragment shortTVDiscoverFragment) {
        C27941f c27941fM36186h0;
        ShortTVTrendingAdapter shortTVTrendingAdapter = shortTVDiscoverFragment.listAdapter;
        if (((shortTVTrendingAdapter == null || (c27941fM36186h0 = shortTVTrendingAdapter.m36186h0()) == null) ? null : c27941fM36186h0.m108661i()) == LoadMoreStatus.End) {
            return;
        }
        C26866a.a aVar = C26866a.f81698a;
        String TAG = shortTVDiscoverFragment.TAG;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "load more， loadData", false, 4, null);
        shortTVDiscoverFragment.m80945W0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final void m80943U0(ShortTVDiscoverFragment shortTVDiscoverFragment) {
        C27941f c27941fM36186h0;
        ShortTVTrendingAdapter shortTVTrendingAdapter = shortTVDiscoverFragment.listAdapter;
        if (shortTVTrendingAdapter == null || (c27941fM36186h0 = shortTVTrendingAdapter.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: renamed from: V0 */
    private final void m80944V0() {
        ShortTvViewModel shortTvViewModel = this.viewModel;
        if (shortTvViewModel != null) {
            shortTvViewModel.m81396H(this.tabId);
        }
    }

    /* JADX INFO: renamed from: W0 */
    private final void m80945W0(boolean isRefresh) {
        ShortTvViewModel shortTvViewModel = this.viewModel;
        if (shortTvViewModel != null) {
            shortTvViewModel.m81399K(this.nextPage, 8, isRefresh);
        }
    }

    /* JADX INFO: renamed from: X0 */
    private final void m80946X0() {
        List data;
        BannerData bannerData;
        List data2;
        int i11 = this.bannerCurPosition;
        if (i11 >= 0) {
            ShortTVBannerAdapter shortTVBannerAdapter = this.bannerAdapter;
            if (i11 >= ((shortTVBannerAdapter == null || (data2 = shortTVBannerAdapter.getData()) == null) ? 0 : data2.size())) {
                return;
            }
            long jCurrentTimeMillis = this.bannerBrowseTime > 0 ? System.currentTimeMillis() - this.bannerBrowseTime : 0L;
            ShortTVBannerAdapter shortTVBannerAdapter2 = this.bannerAdapter;
            if (shortTVBannerAdapter2 == null || (data = shortTVBannerAdapter2.getData()) == null || (bannerData = (BannerData) data.get(this.bannerCurPosition)) == null) {
                return;
            }
            C19522a c19522aM80929C0 = m80929C0();
            String pageName = getPageName();
            String value = ShortTvItemType.BANNER.getValue();
            String subjectId = bannerData.getSubjectId();
            Boolean hasResource = bannerData.getHasResource();
            String deepLink = bannerData.getDeepLink();
            Integer numValueOf = Integer.valueOf(this.bannerCurPosition);
            Image image = bannerData.getImage();
            c19522aM80929C0.m81321a((4144 & 1) != 0 ? null : pageName, (4144 & 2) != 0 ? null : "opt", (4144 & 4) != 0 ? null : value, (4144 & 8) != 0 ? null : subjectId, (4144 & 16) != 0 ? null : null, (4144 & 32) != 0 ? null : null, (4144 & 64) != 0 ? null : hasResource, (4144 & 128) != 0 ? null : deepLink, (4144 & 256) != 0 ? null : numValueOf, (4144 & 512) != 0 ? null : image != null ? image.getUrl() : null, (4144 & 1024) != 0 ? 0L : jCurrentTimeMillis, (4144 & 2048) != 0 ? Boolean.FALSE : Boolean.valueOf(bannerData.getBuiltIn()), (4144 & 4096) == 0 ? null : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public final void m80947Y0(int dy2) {
        if (dy2 == 0) {
            this.mDy = 0;
        } else {
            this.mDy += dy2;
        }
        if (Math.abs(this.mDy) > ((AbstractC5806y.m27489e() * 9) / 16) / 2) {
            if (this.hasSlideOutBanner) {
                return;
            }
            m80928B0(false);
            this.hasSlideOutBanner = true;
            return;
        }
        if (this.hasSlideOutBanner) {
            m80928B0(true);
            this.hasSlideOutBanner = false;
        }
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m80948Z0(Subject subject, boolean isDownloadView) {
        Context context = getContext();
        if (context != null) {
            C28224a.f86828a.m109403a((FragmentActivity) context, getPageName(), subject.getOps(), (PsExtractor.AUDIO_STREAM & 8) != 0 ? null : "download_subject", (PsExtractor.AUDIO_STREAM & 16) != 0 ? false : isDownloadView, (PsExtractor.AUDIO_STREAM & 32) != 0 ? null : subject, (PsExtractor.AUDIO_STREAM & 64) != 0 ? null : null, (PsExtractor.AUDIO_STREAM & 128) != 0 ? Boolean.FALSE : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final C29244b m80949a1() {
        return new C29244b();
    }

    /* JADX INFO: renamed from: c1 */
    private final void m80950c1(boolean isBanner) {
        Space space;
        View view;
        Space space2;
        View view2;
        if (isBanner) {
            C27370x c27370x = (C27370x) getMViewBinding();
            if (c27370x != null && (view2 = c27370x.f83353f) != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
                ((ViewGroup.MarginLayoutParams) c2308b).height = 0;
                view2.setLayoutParams(c2308b);
            }
            C27370x c27370x2 = (C27370x) getMViewBinding();
            if (c27370x2 == null || (space2 = c27370x2.f83352e) == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = space2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b2 = (ConstraintLayout.C2308b) layoutParams2;
            ((ViewGroup.MarginLayoutParams) c2308b2).height = AbstractC23895a.m94638a(90);
            space2.setLayoutParams(c2308b2);
            return;
        }
        C27370x c27370x3 = (C27370x) getMViewBinding();
        if (c27370x3 != null && (view = c27370x3.f83353f) != null) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b3 = (ConstraintLayout.C2308b) layoutParams3;
            ((ViewGroup.MarginLayoutParams) c2308b3).height = this.statusBarHeight + AbstractC23895a.m94638a(44);
            view.setLayoutParams(c2308b3);
        }
        C27370x c27370x4 = (C27370x) getMViewBinding();
        if (c27370x4 == null || (space = c27370x4.f83352e) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams4 = space.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.C2308b c2308b4 = (ConstraintLayout.C2308b) layoutParams4;
        ((ViewGroup.MarginLayoutParams) c2308b4).height = AbstractC23895a.m94638a(10);
        space.setLayoutParams(c2308b4);
    }

    /* JADX INFO: renamed from: d1 */
    private final void m80951d1() {
        ShortTVFavoriteView shortTVFavoriteView = this.favoriteHeaderView;
        if (shortTVFavoriteView == null) {
            return;
        }
        ShortTVTrendingAdapter shortTVTrendingAdapter = this.listAdapter;
        if (shortTVTrendingAdapter != null) {
            Intrinsics.m97799e(shortTVFavoriteView);
            shortTVTrendingAdapter.m36143J0(shortTVFavoriteView);
        }
        this.favoriteHeaderView = null;
    }

    /* JADX INFO: renamed from: f1 */
    private final void m80953f1(ShortTVRespData data) {
        String nextPage;
        Boolean hasMore;
        C27941f c27941fM36186h0;
        ShortTVTrendingAdapter shortTVTrendingAdapter;
        C27941f c27941fM36186h1;
        ShortTVTrendingAdapter shortTVTrendingAdapter2;
        List<Object> data2;
        if (data == null) {
            if (this.bannerBinding == null && this.headerViewList.isEmpty() && (shortTVTrendingAdapter2 = this.listAdapter) != null && (data2 = shortTVTrendingAdapter2.getData()) != null && data2.isEmpty()) {
                m80980g1();
                return;
            }
            ShortTVTrendingAdapter shortTVTrendingAdapter3 = this.listAdapter;
            if (shortTVTrendingAdapter3 == null || (c27941fM36186h0 = shortTVTrendingAdapter3.m36186h0()) == null || !c27941fM36186h0.m108666r() || (shortTVTrendingAdapter = this.listAdapter) == null || (c27941fM36186h1 = shortTVTrendingAdapter.m36186h0()) == null) {
                return;
            }
            c27941fM36186h1.m108669v();
            return;
        }
        Pager pager = data.getPager();
        if (pager == null || (nextPage = pager.getNextPage()) == null) {
            nextPage = "1";
        }
        this.nextPage = nextPage;
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.TAG;
        Intrinsics.m97801g(TAG, "TAG");
        String str = this.nextPage;
        List<Subject> items = data.getItems();
        Integer numValueOf = items != null ? Integer.valueOf(items.size()) : null;
        Pager pager2 = data.getPager();
        C26866a.a.m104898f(aVar, TAG, "updateTreadingList,nextPage :" + str + ", size:" + numValueOf + ", hasMore:" + (pager2 != null ? pager2.getHasMore() : null), false, 4, null);
        List<Subject> items2 = data.getItems();
        boolean zIsRefresh = data.isRefresh();
        Pager pager3 = data.getPager();
        m80981h1(items2, zIsRefresh, (pager3 == null || (hasMore = pager3.getHasMore()) == null) ? false : hasMore.booleanValue());
    }

    private final void hideLoading() {
        showContentView();
    }

    private final void initAd() {
        BiddingListManager biddingListManager = new BiddingListManager();
        C27370x c27370x = (C27370x) getMViewBinding();
        biddingListManager.m63184F(c27370x != null ? c27370x.f83349b : null);
        biddingListManager.m63179A(AbstractC3226v.m14968a(this));
        biddingListManager.m63185G("ShortTvDiscoverMostTrendingScene");
        biddingListManager.m63192z(new Function2() { // from class: com.transsion.shorttv_pugc.ui.fragment.m
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ShortTVDiscoverFragment.m80933K0(this.f62280a, ((Integer) obj).intValue(), (BiddingNativeManager) obj2);
            }
        });
        this.v3ListManager = biddingListManager;
    }

    private final void loadMore() {
        SafeRecyclerView safeRecyclerView;
        SafeRecyclerView safeRecyclerView2;
        C27941f c27941fM36186h0;
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.TAG;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "loadMore", false, 4, null);
        if (!C27287m.f83003a.m106330e()) {
            C26950b.f81855a.m105091d(R$string.short_tv_no_network_toast);
            C27370x c27370x = (C27370x) getMViewBinding();
            if (c27370x == null || (safeRecyclerView = c27370x.f83349b) == null) {
                return;
            }
            safeRecyclerView.postDelayed(new Runnable() { // from class: com.transsion.shorttv_pugc.ui.fragment.c
                @Override // java.lang.Runnable
                public final void run() {
                    ShortTVDiscoverFragment.m80943U0(this.f62202a);
                }
            }, 500L);
            return;
        }
        ShortTVTrendingAdapter shortTVTrendingAdapter = this.listAdapter;
        if (shortTVTrendingAdapter != null && (c27941fM36186h0 = shortTVTrendingAdapter.m36186h0()) != null) {
            c27941fM36186h0.m108670w();
        }
        C27370x c27370x2 = (C27370x) getMViewBinding();
        if (c27370x2 == null || (safeRecyclerView2 = c27370x2.f83349b) == null) {
            return;
        }
        safeRecyclerView2.postDelayed(new Runnable() { // from class: com.transsion.shorttv_pugc.ui.fragment.b
            @Override // java.lang.Runnable
            public final void run() {
                ShortTVDiscoverFragment.m80942T0(this.f62199a);
            }
        }, 300L);
    }

    private final void showLoading() {
        showLoadingView();
    }

    /* JADX INFO: renamed from: x0 */
    private final void m80971x0() {
        Context context;
        if (this.favoriteHeaderView == null && (context = getContext()) != null) {
            ShortTVFavoriteView shortTVFavoriteView = new ShortTVFavoriteView(this, "collection", m80931H0(), context);
            this.favoriteHeaderView = shortTVFavoriteView;
            if (this.hasAddedBanner) {
                ShortTVTrendingAdapter shortTVTrendingAdapter = this.listAdapter;
                if (shortTVTrendingAdapter != null) {
                    Intrinsics.m97799e(shortTVFavoriteView);
                    BaseQuickAdapter.m36130y(shortTVTrendingAdapter, shortTVFavoriteView, 2, 0, 4, null);
                    return;
                }
                return;
            }
            ShortTVTrendingAdapter shortTVTrendingAdapter2 = this.listAdapter;
            if (shortTVTrendingAdapter2 != null) {
                Intrinsics.m97799e(shortTVFavoriteView);
                BaseQuickAdapter.m36130y(shortTVTrendingAdapter2, shortTVFavoriteView, 1, 0, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    private final void m80972y0() {
        SafeRecyclerView safeRecyclerView;
        C27370x c27370x = (C27370x) getMViewBinding();
        if (c27370x == null || (safeRecyclerView = c27370x.f83349b) == null) {
            return;
        }
        safeRecyclerView.addOnScrollListener(new C19374a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C19522a m80973z0(ShortTVDiscoverFragment shortTVDiscoverFragment) {
        return new C19522a(shortTVDiscoverFragment.getPageName());
    }

    /* JADX INFO: renamed from: E0 */
    public String m80974E0() {
        return "most_trending";
    }

    /* JADX INFO: renamed from: F0, reason: from getter */
    protected final ShortTVTrendingAdapter getListAdapter() {
        return this.listAdapter;
    }

    /* JADX INFO: renamed from: G0 */
    public int m80976G0() {
        return R$layout.pugc_short_tv_layout_skeleton_drawing_discover;
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public C27370x getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C27370x c27370xM106522c = C27370x.m106522c(inflater);
        Intrinsics.m97801g(c27370xM106522c, "inflate(...)");
        return c27370xM106522c;
    }

    /* JADX INFO: renamed from: b1 */
    public void m80978b1() {
        m80944V0();
        this.nextPage = "1";
    }

    /* JADX INFO: renamed from: e1 */
    public final void m80979e1(boolean z11) {
        this.hasSlideOutBanner = z11;
    }

    /* JADX INFO: renamed from: g1 */
    public void m80980g1() {
        if (C27287m.f83003a.m106330e()) {
            PageStatusFragment.m80504c0(this, false, 1, null);
        } else {
            showNoNetworkView(false);
        }
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public View getEmptyView(boolean isShowTitleLayout) {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        StateView stateView = new StateView(contextRequireContext);
        stateView.retry(new Function0() { // from class: com.transsion.shorttv_pugc.ui.fragment.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTVDiscoverFragment.m80930D0(this.f62204a);
            }
        });
        stateView.showData(4, getScreenType(), false, getPageStateLayoutTitle(), getEmptyDescText());
        return stateView;
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public View getLoadingView() {
        View viewInflate = LayoutInflater.from(requireContext()).inflate(m80976G0(), (ViewGroup) getFlStateView(), false);
        View viewFindViewById = viewInflate.findViewById(R$id.v_bar_space);
        if (this.subTabScrollListener != null) {
            View viewFindViewById2 = viewInflate.findViewById(R$id.v_title);
            Intrinsics.m97801g(viewFindViewById2, "findViewById(...)");
            ViewGroup.LayoutParams layoutParams = viewFindViewById2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
            ((ViewGroup.MarginLayoutParams) c2308b).topMargin = AbstractC5776a0.m27313a(10.0f);
            viewFindViewById2.setLayoutParams(c2308b);
            int iM27313a = this.statusBarHeight + AbstractC5776a0.m27313a(32.0f);
            Intrinsics.m97799e(viewFindViewById);
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b2 = (ConstraintLayout.C2308b) layoutParams2;
            ((ViewGroup.MarginLayoutParams) c2308b2).height = iM27313a;
            viewFindViewById.setLayoutParams(c2308b2);
        } else {
            Intrinsics.m97799e(viewFindViewById);
            ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b3 = (ConstraintLayout.C2308b) layoutParams3;
            ((ViewGroup.MarginLayoutParams) c2308b3).height = this.statusBarHeight;
            viewFindViewById.setLayoutParams(c2308b3);
        }
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public View getNoNetworkView() {
        View noNetworkView;
        InterfaceC28664i interfaceC28664iM81406R;
        ShortTvViewModel shortTvViewModel = this.viewModel;
        if (shortTvViewModel == null || (interfaceC28664iM81406R = shortTvViewModel.m81406R()) == null) {
            noNetworkView = super.getNoNetworkView();
        } else {
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            noNetworkView = interfaceC28664iM81406R.mo73821a(contextRequireContext);
            if (noNetworkView == null) {
                noNetworkView = super.getNoNetworkView();
            }
        }
        noNetworkView.setPadding(noNetworkView.getPaddingStart(), noNetworkView.getPaddingTop() + this.statusBarHeight + AbstractC5776a0.m27313a(35.0f), noNetworkView.getPaddingEnd(), noNetworkView.getPaddingBottom());
        return noNetworkView;
    }

    public String getPageName() {
        return "minitv_explore";
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public int getScreenType() {
        return 4;
    }

    /* JADX INFO: renamed from: h1 */
    public void m80981h1(List list, boolean isRefresh, boolean hasMore) {
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        ShortTVTrendingAdapter shortTVTrendingAdapter;
        C27941f c27941fM36186h2;
        SwipeRefreshLayout swipeRefreshLayout;
        C27370x c27370x;
        SwipeRefreshLayout swipeRefreshLayout2;
        List<Object> data;
        List<Object> listL;
        C27941f c27941fM36186h3;
        SwipeRefreshLayout swipeRefreshLayout3;
        C27941f c27941fM36186h4;
        ShortTVTrendingAdapter shortTVTrendingAdapter2;
        C27941f c27941fM36186h5;
        SwipeRefreshLayout swipeRefreshLayout4;
        C27370x c27370x2;
        SwipeRefreshLayout swipeRefreshLayout5;
        List<Object> data2;
        Subject subject;
        SwipeRefreshLayout swipeRefreshLayout6;
        C27370x c27370x3 = (C27370x) getMViewBinding();
        if (c27370x3 != null && (swipeRefreshLayout6 = c27370x3.f83350c) != null) {
            swipeRefreshLayout6.setEnabled(true);
        }
        if (isRefresh) {
            BiddingListManager biddingListManager = this.v3ListManager;
            if (biddingListManager != null) {
                biddingListManager.m63191y();
            }
            if (list != null && (subject = (Subject) CollectionsKt.m97361k0(list)) != null) {
                subject.setShowTitle(true);
            }
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            if (isRefresh) {
                C24655b logViewConfig = getLogViewConfig();
                if (logViewConfig != null) {
                    logViewConfig.m96848k(true);
                }
                ShortTVTrendingAdapter shortTVTrendingAdapter3 = this.listAdapter;
                if (shortTVTrendingAdapter3 != null) {
                    shortTVTrendingAdapter3.mo36201n1(list2);
                }
            }
            ShortTVTrendingAdapter shortTVTrendingAdapter4 = this.listAdapter;
            if (shortTVTrendingAdapter4 == null || (data = shortTVTrendingAdapter4.getData()) == null || !data.isEmpty()) {
                if (hasMore) {
                    ShortTVTrendingAdapter shortTVTrendingAdapter5 = this.listAdapter;
                    if (shortTVTrendingAdapter5 != null && (c27941fM36186h1 = shortTVTrendingAdapter5.m36186h0()) != null && c27941fM36186h1.m108666r() && (shortTVTrendingAdapter = this.listAdapter) != null && (c27941fM36186h2 = shortTVTrendingAdapter.m36186h0()) != null) {
                        c27941fM36186h2.m108667s();
                    }
                } else {
                    ShortTVTrendingAdapter shortTVTrendingAdapter6 = this.listAdapter;
                    if (shortTVTrendingAdapter6 != null && (c27941fM36186h0 = shortTVTrendingAdapter6.m36186h0()) != null) {
                        C27941f.m108652u(c27941fM36186h0, false, 1, null);
                    }
                }
            } else if (isRefresh) {
                Intrinsics.m97797c(getPageName(), "minitv_explore");
            }
            C27370x c27370x4 = (C27370x) getMViewBinding();
            if (c27370x4 == null || (swipeRefreshLayout = c27370x4.f83350c) == null || !swipeRefreshLayout.isRefreshing() || (c27370x = (C27370x) getMViewBinding()) == null || (swipeRefreshLayout2 = c27370x.f83350c) == null) {
                return;
            }
            swipeRefreshLayout2.setRefreshing(false);
            return;
        }
        ShortTVTrendingAdapter shortTVTrendingAdapter7 = this.listAdapter;
        if ((shortTVTrendingAdapter7 == null || (data2 = shortTVTrendingAdapter7.getData()) == null || !data2.isEmpty()) && !isRefresh) {
            ShortTVTrendingAdapter shortTVTrendingAdapter8 = this.listAdapter;
            if (shortTVTrendingAdapter8 == null || (listL = shortTVTrendingAdapter8.getData()) == null) {
                listL = CollectionsKt.m97506l();
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!listL.contains((Subject) obj)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                C26866a.a aVar = C26866a.f81698a;
                String TAG = this.TAG;
                Intrinsics.m97801g(TAG, "TAG");
                C26866a.a.m104898f(aVar, TAG, "updateList 全部去重了", false, 4, null);
                return;
            }
            ShortTVTrendingAdapter shortTVTrendingAdapter9 = this.listAdapter;
            if (shortTVTrendingAdapter9 != null) {
                shortTVTrendingAdapter9.mo36208q(arrayList);
            }
        } else {
            C27370x c27370x5 = (C27370x) getMViewBinding();
            if (c27370x5 != null && (swipeRefreshLayout4 = c27370x5.f83350c) != null && swipeRefreshLayout4.isRefreshing() && (c27370x2 = (C27370x) getMViewBinding()) != null && (swipeRefreshLayout5 = c27370x2.f83350c) != null) {
                swipeRefreshLayout5.setRefreshing(false);
            }
            C24655b logViewConfig2 = getLogViewConfig();
            if (logViewConfig2 != null) {
                logViewConfig2.m96848k(true);
            }
            ShortTVTrendingAdapter shortTVTrendingAdapter10 = this.listAdapter;
            if (shortTVTrendingAdapter10 != null) {
                shortTVTrendingAdapter10.mo36201n1(list2);
            }
        }
        if (hasMore) {
            ShortTVTrendingAdapter shortTVTrendingAdapter11 = this.listAdapter;
            if (shortTVTrendingAdapter11 != null && (c27941fM36186h4 = shortTVTrendingAdapter11.m36186h0()) != null && c27941fM36186h4.m108666r() && (shortTVTrendingAdapter2 = this.listAdapter) != null && (c27941fM36186h5 = shortTVTrendingAdapter2.m36186h0()) != null) {
                c27941fM36186h5.m108667s();
            }
        } else {
            ShortTVTrendingAdapter shortTVTrendingAdapter12 = this.listAdapter;
            if (shortTVTrendingAdapter12 != null && (c27941fM36186h3 = shortTVTrendingAdapter12.m36186h0()) != null) {
                C27941f.m108652u(c27941fM36186h3, false, 1, null);
            }
        }
        if (m80932J0() || this.subTabScrollListener != null) {
            return;
        }
        m80928B0(false);
        Function1 function1 = this.listener;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        m80950c1(false);
        C27370x c27370x6 = (C27370x) getMViewBinding();
        if (c27370x6 == null || (swipeRefreshLayout3 = c27370x6.f83350c) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = swipeRefreshLayout3.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
        c2308b.setMargins(0, AbstractC5776a0.m27313a(80.0f), 0, 0);
        swipeRefreshLayout3.setLayoutParams(c2308b);
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void initListener() {
        SafeRecyclerView safeRecyclerView;
        SafeRecyclerView safeRecyclerView2;
        SafeRecyclerView safeRecyclerView3;
        if (this.subTabScrollListener != null) {
            C27370x c27370x = (C27370x) getMViewBinding();
            if (c27370x != null && (safeRecyclerView3 = c27370x.f83349b) != null) {
                RecyclerView.AbstractC4219r abstractC4219r = this.subTabScrollListener;
                Intrinsics.m97799e(abstractC4219r);
                safeRecyclerView3.addOnScrollListener(abstractC4219r);
            }
        } else {
            C27370x c27370x2 = (C27370x) getMViewBinding();
            if (c27370x2 != null && (safeRecyclerView = c27370x2.f83349b) != null) {
                safeRecyclerView.addOnScrollListener(new C19379f());
            }
        }
        C27370x c27370x3 = (C27370x) getMViewBinding();
        if (c27370x3 == null || (safeRecyclerView2 = c27370x3.f83349b) == null) {
            return;
        }
        safeRecyclerView2.post(new Runnable() { // from class: com.transsion.shorttv_pugc.ui.fragment.j
            @Override // java.lang.Runnable
            public final void run() {
                ShortTVDiscoverFragment.m80939Q0(this.f62278a);
            }
        });
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void initViewData() {
        View view;
        Bundle arguments = getArguments();
        this.tabId = arguments != null ? arguments.getInt("tab_id") : 13;
        C27370x c27370x = (C27370x) getMViewBinding();
        if (c27370x != null && (view = c27370x.f83353f) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
            ((ViewGroup.MarginLayoutParams) c2308b).height = this.statusBarHeight;
            view.setLayoutParams(c2308b);
        }
        m80934L0();
        initAd();
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void initViewModel() {
        ShortTvViewModel shortTvViewModel;
        C3187b0 c3187b0M81435x;
        C3187b0 c3187b0M81408T;
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.TAG;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "initViewModel " + this, false, 4, null);
        ShortTvViewModel shortTvViewModel2 = (ShortTvViewModel) new C3227v0(this).m14969a(ShortTvViewModel.class);
        this.viewModel = shortTvViewModel2;
        if (shortTvViewModel2 != null && (c3187b0M81408T = shortTvViewModel2.m81408T()) != null) {
            c3187b0M81408T.m14851j(this, new C19380g(new Function1() { // from class: com.transsion.shorttv_pugc.ui.fragment.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShortTVDiscoverFragment.m80940R0(this.f62274a, (ShortTVRespData) obj);
                }
            }));
        }
        ShortTvViewModel shortTvViewModel3 = this.viewModel;
        if (shortTvViewModel3 != null && (c3187b0M81435x = shortTvViewModel3.m81435x()) != null) {
            c3187b0M81435x.m14851j(this, new C19380g(new Function1() { // from class: com.transsion.shorttv_pugc.ui.fragment.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShortTVDiscoverFragment.m80941S0(this.f62277a, (ShortTVRespData) obj);
                }
            }));
        }
        showLoading();
        Context context = getContext();
        if (context != null && (shortTvViewModel = this.viewModel) != null) {
            shortTvViewModel.m81411W(context);
        }
        m80978b1();
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b(getPageName(), false, 2, null);
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BiddingListManager biddingListManager = this.v3ListManager;
        if (biddingListManager != null) {
            biddingListManager.m63187o();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed() && hidden) {
            this.exposureHelper.m93623e();
            C27370x c27370x = (C27370x) getMViewBinding();
            m80927A0(c27370x != null ? c27370x.f83349b : null);
        }
        if (isResumed()) {
            if (hidden) {
                logPause();
            } else {
                logResume();
            }
        }
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        ShortTVBannerView shortTVBannerView;
        ShortTVBannerView shortTVBannerView2;
        super.onPause();
        m80946X0();
        this.exposureHelper.m93623e();
        C27370x c27370x = (C27370x) getMViewBinding();
        m80927A0(c27370x != null ? c27370x.f83349b : null);
        C27361q0 c27361q0 = this.bannerBinding;
        if (c27361q0 == null || (shortTVBannerView = c27361q0.f83300b) == null || !shortTVBannerView.isAttachedToWindow()) {
            return;
        }
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.TAG;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "onPause banner stopTurning", false, 4, null);
        C27361q0 c27361q1 = this.bannerBinding;
        if (c27361q1 == null || (shortTVBannerView2 = c27361q1.f83300b) == null) {
            return;
        }
        shortTVBannerView2.stopTurning();
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        ShortTVBannerView shortTVBannerView;
        ShortTVBannerView shortTVBannerView2;
        super.onResume();
        this.bannerBrowseTime = System.currentTimeMillis();
        C27361q0 c27361q0 = this.bannerBinding;
        if (c27361q0 == null || (shortTVBannerView = c27361q0.f83300b) == null || !shortTVBannerView.isAttachedToWindow()) {
            return;
        }
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.TAG;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "onResume banner startTurning", false, 4, null);
        C27361q0 c27361q1 = this.bannerBinding;
        if (c27361q1 == null || (shortTVBannerView2 = c27361q1.f83300b) == null) {
            return;
        }
        shortTVBannerView2.startTurning();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (isVisible() && this.isFirstStart) {
            this.isFirstStart = false;
        }
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void retryLoadData() {
        List<Object> data;
        ShortTVTrendingAdapter shortTVTrendingAdapter = this.listAdapter;
        if (shortTVTrendingAdapter != null && (data = shortTVTrendingAdapter.getData()) != null && data.size() == 0) {
            showLoading();
            m80978b1();
            return;
        }
        ShortTVTrendingAdapter shortTVTrendingAdapter2 = this.listAdapter;
        if (shortTVTrendingAdapter2 == null || shortTVTrendingAdapter2.m36186h0().m108661i() != LoadMoreStatus.Fail) {
            return;
        }
        shortTVTrendingAdapter2.m36186h0().m108670w();
    }
}
