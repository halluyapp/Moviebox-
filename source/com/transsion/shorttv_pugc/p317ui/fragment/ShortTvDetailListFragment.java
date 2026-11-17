package com.transsion.shorttv_pugc.p317ui.fragment;

import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.cloud.tmc.miniapp.utils.toast.ToastStrategy;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.player.config.RenderType;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.PlayError;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.shorttv.R$mipmap;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv_pugc.AbstractC19215a;
import com.transsion.shorttv_pugc.ShorttvModel;
import com.transsion.shorttv_pugc.base.fragment.PageStatusFragment;
import com.transsion.shorttv_pugc.base.pager.PagerLayoutManager;
import com.transsion.shorttv_pugc.base.util.DeviceKeyMonitor;
import com.transsion.shorttv_pugc.base.widget.DefaultView;
import com.transsion.shorttv_pugc.base.widget.toast.core.C19276h;
import com.transsion.shorttv_pugc.bean.ShortTvInnerPlayBean;
import com.transsion.shorttv_pugc.p317ui.adapter.C19322e;
import com.transsion.shorttv_pugc.p317ui.dialog.ShortTvEpisodeListDialog;
import com.transsion.shorttv_pugc.p317ui.widget.C19516u;
import com.transsion.shorttv_pugc.p317ui.widget.InterfaceC19486a;
import com.transsion.shorttv_pugc.p317ui.widget.ShortTvLoadMoreView;
import com.transsion.shorttv_pugc.utils.C19526e;
import com.transsion.shorttv_pugc.utils.ShortTvExtKt;
import com.transsion.shorttv_pugc.viewmodel.ShortTvViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fo.C23403e;
import gt.C23673b;
import gt.InterfaceC23672a;
import ht.AbstractC23896b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.InterfaceC25149n0;
import p550kj.C24655b;
import p550kj.C24662i;
import p654oo.C26372e;
import p654oo.InterfaceC26373f;
import p683po.C26906c;
import p683po.C26907d;
import p765s6.InterfaceC27568f;
import p765s6.InterfaceC27569g;
import p920xt.InterfaceC28658c;
import p920xt.InterfaceC28659d;
import p920xt.InterfaceC28660e;
import p920xt.InterfaceC28665j;
import p990zt.C29243a;
import pg.C26866a;
import rs.C27333c0;
import tt.C27851d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002¢\u0001\u0018\u0000 f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002µ\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0005J\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0005J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u0005J\r\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u0005J\r\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\u0005J\u0017\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010\u0005J\u001f\u00103\u001a\u00020\u00062\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010\u0005J\u000f\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u0010\u0005J\u000f\u00107\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u0010\u0005J\u0015\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0014¢\u0006\u0004\b9\u0010\u0017J\r\u0010:\u001a\u00020\u0006¢\u0006\u0004\b:\u0010\u0005J\r\u0010;\u001a\u00020\u0006¢\u0006\u0004\b;\u0010\u0005J\u000f\u0010<\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010\u0005J\u000f\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010\u0005J\u0017\u0010?\u001a\u00020\u00062\u0006\u0010>\u001a\u00020'H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0006H\u0016¢\u0006\u0004\bA\u0010\u0005J\u000f\u0010B\u001a\u00020\u0006H\u0016¢\u0006\u0004\bB\u0010\u0005J\r\u0010C\u001a\u00020\u0006¢\u0006\u0004\bC\u0010\u0005J\u0019\u0010F\u001a\u00020\u00062\b\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bF\u0010GJ\u0019\u0010I\u001a\u00020\u00062\b\u0010H\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\bI\u0010JJ!\u0010M\u001a\u00020\u00062\u0006\u0010L\u001a\u00020K2\b\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bM\u0010NJ\u0019\u0010O\u001a\u00020\u00062\b\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bO\u0010GJ\u000f\u0010P\u001a\u00020\u0006H\u0016¢\u0006\u0004\bP\u0010\u0005J\u000f\u0010Q\u001a\u00020\u0006H\u0016¢\u0006\u0004\bQ\u0010\u0005J\u0011\u0010S\u001a\u0004\u0018\u00010RH\u0016¢\u0006\u0004\bS\u0010TJ\r\u0010U\u001a\u00020$¢\u0006\u0004\bU\u0010&J\u0019\u0010V\u001a\u00020\u00062\b\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bV\u0010GJ\u0019\u0010W\u001a\u00020\u00062\b\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bW\u0010GJ\u0017\u0010Y\u001a\u00020\u00062\u0006\u0010X\u001a\u00020'H\u0016¢\u0006\u0004\bY\u0010@J\u000f\u0010Z\u001a\u00020\u0006H\u0016¢\u0006\u0004\bZ\u0010\u0005J\u0017\u0010\\\u001a\u00020\u00062\u0006\u0010[\u001a\u00020'H\u0016¢\u0006\u0004\b\\\u0010@R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010c\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010g\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010j\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010l\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010iR\u0018\u0010n\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010iR\u0018\u0010p\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010iR\u0018\u0010r\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010iR\u0016\u0010t\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010iR\u0016\u0010v\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010bR\u001b\u0010|\u001a\u00020w8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001c\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001c\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0016\u0010\u0092\u0001\u001a\u00020$8\u0002X\u0082D¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010iR\u0018\u0010\u0094\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010iR\u0019\u0010\u0097\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R&\u0010\u009b\u0001\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010b\u001a\u0005\b\u0099\u0001\u0010)\"\u0005\b\u009a\u0001\u0010@R\u001c\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010¡\u0001\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010fR\u0018\u0010¥\u0001\u001a\u00030¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R(\u0010«\u0001\u001a\u00020d8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b¦\u0001\u0010f\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R\u001a\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0018\u0010±\u0001\u001a\u00030®\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010´\u0001\u001a\u00030²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010³\u0001¨\u0006¶\u0001"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/ui/fragment/ShortTvDetailListFragment;", "Lcom/transsion/shorttv_pugc/base/fragment/PageStatusFragment;", "Lrs/c0;", "Lcom/transsion/player/orplayer/f;", "<init>", "()V", "", "initView", "E0", "initAdapter", "showEmpty", "Landroid/content/Context;", "context", "Landroid/view/View;", "getEmptyView", "(Landroid/content/Context;)Landroid/view/View;", "loadData", "J0", "M0", "v0", "", "toPosition", "scrollToPosition", "(I)V", "C0", "R0", "Ltt/d;", "x0", "()Ltt/d;", "Q0", "K0", "S0", "Landroid/view/LayoutInflater;", "inflater", "y0", "(Landroid/view/LayoutInflater;)Lrs/c0;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "", "isAudioShowNoNetworkLayout", "()Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "initViewData", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onConnected", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "initViewModel", "initListener", "retryLoadData", "ep", "N0", "hideLoading", "startLoading", "onResume", "onPause", "hidden", "onHiddenChanged", "(Z)V", "logPause", "logResume", "L0", "Lfo/e;", "mediaSource", "onCompletion", "(Lfo/e;)V", "uuid", "onMediaItemTransition", "(Ljava/lang/String;)V", "Lcom/transsion/player/orplayer/PlayError;", "errorInfo", "onPlayError", "(Lcom/transsion/player/orplayer/PlayError;Lfo/e;)V", "onPrepare", "onDestroyView", "onDestroy", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "getPageName", "onVideoPause", "onVideoStart", "videoPlaying", "T0", "onStop", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Lcom/transsion/shorttv_pugc/ui/dialog/ShortTvEpisodeListDialog;", "i", "Lcom/transsion/shorttv_pugc/ui/dialog/ShortTvEpisodeListDialog;", "shortListDialog", "j", "Z", "isNewPlayer", "", CampaignEx.JSON_KEY_AD_K, "J", "lastShowNetWorkErrToastTime", "l", "Ljava/lang/String;", "ugcVideoId", "m", "subjectId", "n", "collectionId", "o", "fromOptId", TtmlNode.TAG_P, "ops", CampaignEx.JSON_KEY_AD_Q, "mItemType", CampaignEx.JSON_KEY_AD_R, "ugcWithoutHistory", "Lcom/transsion/shorttv_pugc/viewmodel/ShortTvViewModel;", "s", "Lkotlin/Lazy;", "z0", "()Lcom/transsion/shorttv_pugc/viewmodel/ShortTvViewModel;", "viewModel", "Lcom/transsion/shorttv_pugc/base/pager/PagerLayoutManager;", "t", "Lcom/transsion/shorttv_pugc/base/pager/PagerLayoutManager;", "mPagerLayoutManager", "Lcom/transsion/shorttv_pugc/ui/widget/u;", TmcStartParams.KEY_URL_SHORT, "Lcom/transsion/shorttv_pugc/ui/widget/u;", "mPagerChangeControl", "Lcom/transsion/shorttv_pugc/ui/adapter/e;", "v", "Lcom/transsion/shorttv_pugc/ui/adapter/e;", "mAdapter", "Loo/f;", "w", "Loo/f;", "mOrPlayer", "Lcom/transsion/player/ui/ORPlayerView;", "x", "Lcom/transsion/player/ui/ORPlayerView;", "mOrPlayerView", "y", "loggerTag", "z", "lastPageFrom", "A", "I", "lastEp", "B", "isClickPause$shortTvLib_release", "P0", "isClickPause", "Lcom/transsion/shorttv_pugc/base/util/DeviceKeyMonitor;", "C", "Lcom/transsion/shorttv_pugc/base/util/DeviceKeyMonitor;", "deviceKeyMonitor", "D", "pageStartTime", "com/transsion/shorttv_pugc/ui/fragment/ShortTvDetailListFragment$d", "E", "Lcom/transsion/shorttv_pugc/ui/fragment/ShortTvDetailListFragment$d;", "loadingHandler", "F", "getResumeTimeStamp", "()J", "setResumeTimeStamp", "(J)V", "resumeTimeStamp", "G", "Lcom/transsion/player/orplayer/PlayError;", "Lxt/j;", "H", "Lxt/j;", "downloadListener", "Lgt/b;", "Lgt/b;", "exposureHelper", "a", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTvDetailListFragment extends PageStatusFragment<C27333c0> implements InterfaceC16633f {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private int lastEp;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean isClickPause;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private DeviceKeyMonitor deviceKeyMonitor;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final HandlerC19392d loadingHandler;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private long resumeTimeStamp;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private PlayError errorInfo;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC28665j downloadListener;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C23673b exposureHelper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private ShortTvEpisodeListDialog shortListDialog;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private long lastShowNetWorkErrToastTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String ugcVideoId;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private String subjectId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private String collectionId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private String fromOptId;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private String ops;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean ugcWithoutHistory;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private PagerLayoutManager mPagerLayoutManager;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private C19516u mPagerChangeControl;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private C19322e mAdapter;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private InterfaceC26373f mOrPlayer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private ORPlayerView mOrPlayerView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isNewPlayer = true;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private String mItemType = "";

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final Lazy viewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(ShortTvViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.shorttv_pugc.ui.fragment.ShortTvDetailListFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.shorttv_pugc.ui.fragment.ShortTvDetailListFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String loggerTag = "ShortTvListFragment";

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private String lastPageFrom = "";

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private long pageStartTime = System.currentTimeMillis();

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShortTvDetailListFragment$b */
    public static final class C19390b implements InterfaceC23672a {
        C19390b() {
        }

        @Override // gt.InterfaceC23672a
        /* JADX INFO: renamed from: a */
        public void mo80863a(int i11, long j11, View view) {
            List<Object> data;
            C19322e c19322e = ShortTvDetailListFragment.this.mAdapter;
            if (c19322e == null || (data = c19322e.getData()) == null) {
                return;
            }
            ShortTvDetailListFragment shortTvDetailListFragment = ShortTvDetailListFragment.this;
            if (data.size() < i11) {
                return;
            }
            C29243a c29243a = C29243a.f89221a;
            ShorttvModel.UGCVideo uGCVideo = (ShorttvModel.UGCVideo) CollectionsKt.m97362l0(data, i11);
            String str = shortTvDetailListFragment.ops;
            if (str == null) {
                str = "";
            }
            c29243a.m112127d(j11, uGCVideo, "", str);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShortTvDetailListFragment$c */
    public static final class C19391c extends DiffUtil.AbstractC4174e {
        C19391c() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(ShorttvModel.UGCVideo oldItem, ShorttvModel.UGCVideo newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return oldItem.getEp() == newItem.getEp();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(ShorttvModel.UGCVideo oldItem, ShorttvModel.UGCVideo newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return oldItem.getEp() == newItem.getEp();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShortTvDetailListFragment$d */
    public static final class HandlerC19392d extends Handler {

        /* JADX INFO: renamed from: a */
        private final int f62175a;

        /* JADX INFO: renamed from: b */
        private final long f62176b;

        HandlerC19392d(Looper looper) {
            super(looper);
            this.f62175a = 1;
            this.f62176b = 300L;
        }

        /* JADX INFO: renamed from: a */
        public final long m81052a() {
            return this.f62176b;
        }

        /* JADX INFO: renamed from: b */
        public final int m81053b() {
            return this.f62175a;
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            C27333c0 c27333c0;
            ProgressBar progressBar;
            Intrinsics.m97802h(msg, "msg");
            super.handleMessage(msg);
            if (msg.what != this.f62175a || (c27333c0 = (C27333c0) ShortTvDetailListFragment.this.getMViewBinding()) == null || (progressBar = c27333c0.f83096b) == null) {
                return;
            }
            AbstractC23896b.m94642d(progressBar);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShortTvDetailListFragment$e */
    public static final class C19393e implements DeviceKeyMonitor.InterfaceC19245b {
        C19393e() {
        }

        @Override // com.transsion.shorttv_pugc.base.util.DeviceKeyMonitor.InterfaceC19245b
        public void onHomeClick() {
            ShortTvDetailListFragment.this.m81021R0();
        }

        @Override // com.transsion.shorttv_pugc.base.util.DeviceKeyMonitor.InterfaceC19245b
        public void onRecentClick() {
            ShortTvDetailListFragment.this.m81021R0();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShortTvDetailListFragment$f */
    static final class C19394f implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f62180a;

        C19394f(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f62180a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f62180a;
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
            this.f62180a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShortTvDetailListFragment$loadData$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.shorttv_pugc.ui.fragment.ShortTvDetailListFragment$loadData$1", m97637f = "ShortTvDetailListFragment.kt", m97638l = {477}, m97639m = "invokeSuspend")
    static final class C193951 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        int label;

        C193951(Continuation<? super C193951> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ShortTvDetailListFragment.this.new C193951(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C193951) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                ShortTvViewModel shortTvViewModelM81041z0 = ShortTvDetailListFragment.this.m81041z0();
                String str = ShortTvDetailListFragment.this.collectionId;
                Intrinsics.m97799e(str);
                shortTvViewModelM81041z0.m81418e0(str);
                ShortTvViewModel shortTvViewModelM81041z1 = ShortTvDetailListFragment.this.m81041z0();
                String str2 = ShortTvDetailListFragment.this.ugcVideoId;
                this.label = 1;
                obj = shortTvViewModelM81041z1.m81391C(str2, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            ShortTvInnerPlayBean shortTvInnerPlayBean = (ShortTvInnerPlayBean) obj;
            int iMax = Math.max(1, (shortTvInnerPlayBean != null ? shortTvInnerPlayBean.getPosition() : 1) - 2);
            ShortTvViewModel shortTvViewModelM81041z2 = ShortTvDetailListFragment.this.m81041z0();
            String str3 = ShortTvDetailListFragment.this.collectionId;
            Intrinsics.m97799e(str3);
            shortTvViewModelM81041z2.m81414Z(str3, iMax, iMax + 10);
            return Unit.f75682a;
        }
    }

    public ShortTvDetailListFragment() {
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.m97799e(looperMyLooper);
        this.loadingHandler = new HandlerC19392d(looperMyLooper);
        this.downloadListener = new InterfaceC28665j() { // from class: com.transsion.shorttv_pugc.ui.fragment.ShortTvDetailListFragment$downloadListener$1
            @Override // p920xt.InterfaceC28665j
            /* JADX INFO: renamed from: a */
            public void mo81054a(String str, int i11) {
                if (Intrinsics.m97797c(str, this.f62178a.ugcVideoId)) {
                    AbstractC25136k.m99058d(AbstractC3226v.m14968a(this.f62178a), null, null, new ShortTvDetailListFragment$downloadListener$1$onDownloadSuccess$1(this.f62178a, str, null), 3, null);
                }
            }
        };
        this.exposureHelper = new C23673b(0.6f, new C19390b(), false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final void m81009A0(ShortTvDetailListFragment shortTvDetailListFragment) {
        shortTvDetailListFragment.loadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final void m81010B0(ShortTvDetailListFragment shortTvDetailListFragment) {
        shortTvDetailListFragment.m81018J0();
    }

    /* JADX INFO: renamed from: C0 */
    private final void m81011C0() {
        FrameLayout root;
        C27333c0 c27333c0 = (C27333c0) getMViewBinding();
        if (c27333c0 == null || (root = c27333c0.getRoot()) == null) {
            return;
        }
        root.post(new Runnable() { // from class: com.transsion.shorttv_pugc.ui.fragment.a0
            @Override // java.lang.Runnable
            public final void run() {
                ShortTvDetailListFragment.m81012D0(this.f62198a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final void m81012D0(ShortTvDetailListFragment shortTvDetailListFragment) {
        InterfaceC28660e interfaceC28660eM81402N;
        FragmentActivity activity = shortTvDetailListFragment.getActivity();
        if (activity == null || (interfaceC28660eM81402N = shortTvDetailListFragment.m81041z0().m81402N()) == null) {
            return;
        }
        String str = shortTvDetailListFragment.ugcVideoId;
        if (str == null) {
            str = "";
        }
        interfaceC28660eM81402N.mo73803b(activity, str, shortTvDetailListFragment.getPageName(), shortTvDetailListFragment.ops);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v5, types: [oo.e] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.transsion.player.shorttv.preload.c, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.SurfaceView] */
    /* JADX WARN: Type inference failed for: r1v4, types: [oo.f] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX INFO: renamed from: E0 */
    private final void m81013E0() {
        InterfaceC28660e interfaceC28660eM81402N;
        InterfaceC26373f interfaceC26373f;
        ?? r11;
        C26372e c26372e;
        C26372e c26372e2;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        this.mOrPlayerView = new ORPlayerView(fragmentActivityRequireActivity, RenderType.SURFACE_VIEW);
        InterfaceC28660e interfaceC28660eM81402N2 = m81041z0().m81402N();
        ?? r12 = 0;
        SurfaceView surface = null;
        ?? r13 = 0;
        InterfaceC16634g interfaceC16634gMo73805d = interfaceC28660eM81402N2 != null ? interfaceC28660eM81402N2.mo73805d(this.ugcVideoId) : null;
        int i11 = 1;
        boolean z11 = interfaceC16634gMo73805d == null;
        this.isNewPlayer = z11;
        C26866a.a.m104898f(C26866a.f81698a, this.loggerTag, "initOrPlayer isNewPlayer:" + z11 + ", mSubjectId:" + this.ugcVideoId + "}", false, 4, null);
        if (interfaceC16634gMo73805d != null) {
            if (interfaceC16634gMo73805d instanceof C26372e) {
                c26372e2 = (C26372e) interfaceC16634gMo73805d;
            } else {
                c26372e = null;
            }
            if (c26372e != null) {
                ORPlayerView oRPlayerView = this.mOrPlayerView;
                if (oRPlayerView != null) {
                    c26372e = c26372e2;
                    surface = oRPlayerView.getSurface();
                }
                c26372e = c26372e2;
                c26372e.setSurfaceView(surface);
                r11 = c26372e;
            }
            c26372e = c26372e2;
            this.mOrPlayer = r13;
            interfaceC28660eM81402N = m81041z0().m81402N();
            if (interfaceC28660eM81402N != null) {
                interfaceC28660eM81402N.mo73804c();
            }
            interfaceC26373f = this.mOrPlayer;
            if (interfaceC26373f != null) {
                interfaceC26373f.addPlayerListener(this);
            }
        }
        ?? c26372e3 = new C26372e(r12, i11, r12);
        ORPlayerView oRPlayerView2 = this.mOrPlayerView;
        c26372e3.setSurfaceView(oRPlayerView2 != null ? oRPlayerView2.getSurface() : 0);
        r11 = c26372e3;
        r13 = r11;
        c26372e = c26372e2;
        this.mOrPlayer = r13;
        interfaceC28660eM81402N = m81041z0().m81402N();
        if (interfaceC28660eM81402N != null) {
            interfaceC28660eM81402N.mo73804c();
        }
        interfaceC26373f = this.mOrPlayer;
        if (interfaceC26373f != null) {
            interfaceC26373f.addPlayerListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final void m81014F0(ShortTvDetailListFragment shortTvDetailListFragment) {
        shortTvDetailListFragment.m81042K0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:59:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fe  */
    /* JADX INFO: renamed from: G0 */
    public static final Unit m81015G0(ShortTvDetailListFragment shortTvDetailListFragment, ShorttvModel.UGCVideo uGCVideo) {
        C24655b logViewConfig;
        String strM92929e;
        C24655b logViewConfig2 = shortTvDetailListFragment.getLogViewConfig();
        if (logViewConfig2 != null) {
            logViewConfig2.m96844g().put("load_duration", String.valueOf(System.currentTimeMillis() - shortTvDetailListFragment.pageStartTime));
        }
        if (uGCVideo == null) {
            logViewConfig = shortTvDetailListFragment.getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96848k(false);
            }
            shortTvDetailListFragment.showEmpty();
        } else {
            C24655b logViewConfig3 = shortTvDetailListFragment.getLogViewConfig();
            if (logViewConfig3 != null) {
                logViewConfig3.m96848k(true);
            }
            String str = shortTvDetailListFragment.collectionId;
            Unit unit = null;
            if (str != null && str.length() != 0) {
                int iMax = Math.max(1, uGCVideo.getEp() - 2);
                int i11 = iMax + 10;
                ShortTvViewModel shortTvViewModelM81041z0 = shortTvDetailListFragment.m81041z0();
                ShorttvModel.UGCVideoCollection belongToCollection = uGCVideo.getBelongToCollection();
                shortTvViewModelM81041z0.m81418e0(belongToCollection != null ? belongToCollection.getCollectionId() : null);
                ShortTvViewModel.m81370a0(shortTvDetailListFragment.m81041z0(), null, iMax, i11, 1, null);
            }
            C24655b logViewConfig4 = shortTvDetailListFragment.getLogViewConfig();
            if (logViewConfig4 != null) {
                HashMap mapM96844g = logViewConfig4.m96844g();
                String collectionId = shortTvDetailListFragment.collectionId;
                if (collectionId == null) {
                    ShorttvModel.UGCVideoCollection belongToCollection2 = uGCVideo.getBelongToCollection();
                    collectionId = belongToCollection2 != null ? belongToCollection2.getCollectionId() : null;
                }
                mapM96844g.put("belong_to_collection_id", collectionId);
            }
            C24655b logViewConfig5 = shortTvDetailListFragment.getLogViewConfig();
            if (logViewConfig5 != null) {
                logViewConfig5.m96844g().put("refer_subject_id", uGCVideo.getSubjectId());
            }
            if (shortTvDetailListFragment.m81041z0().m81426p().isEmpty()) {
                shortTvDetailListFragment.showEmpty();
                return Unit.f75682a;
            }
            C19322e c19322e = shortTvDetailListFragment.mAdapter;
            if (c19322e != null) {
                c19322e.mo36201n1(shortTvDetailListFragment.m81041z0().m81426p());
            }
            C19322e c19322e2 = shortTvDetailListFragment.mAdapter;
            if (c19322e2 != null) {
                c19322e2.notifyDataSetChanged();
            }
            shortTvDetailListFragment.hideLoading();
            C23403e c23403eM80424a = AbstractC19215a.m80424a(uGCVideo);
            if (c23403eM80424a != null && (strM92929e = c23403eM80424a.m92929e()) != null) {
                InterfaceC26373f interfaceC26373f = shortTvDetailListFragment.mOrPlayer;
                if (interfaceC26373f != null) {
                    interfaceC26373f.addDataSource(c23403eM80424a);
                }
                InterfaceC26373f interfaceC26373f2 = shortTvDetailListFragment.mOrPlayer;
                if (interfaceC26373f2 != null) {
                    interfaceC26373f2.prepare();
                }
                InterfaceC26373f interfaceC26373f3 = shortTvDetailListFragment.mOrPlayer;
                if (interfaceC26373f3 != null) {
                    ShortTvInnerPlayBean shortTvInnerPlayBean = (ShortTvInnerPlayBean) shortTvDetailListFragment.m81041z0().m81392D().m14847f();
                    interfaceC26373f3.seekTo(strM92929e, shortTvInnerPlayBean != null ? shortTvInnerPlayBean.getProgress() : 0L);
                    unit = Unit.f75682a;
                }
            }
            if (unit == null) {
                logViewConfig = shortTvDetailListFragment.getLogViewConfig();
                if (logViewConfig != null) {
                    logViewConfig.m96848k(false);
                }
                shortTvDetailListFragment.showEmpty();
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final Unit m81016H0(ShortTvDetailListFragment shortTvDetailListFragment, Pair pair) {
        C19322e c19322e;
        List<Object> data;
        List<ShorttvModel.UGCVideo> listM81302e;
        InterfaceC26373f interfaceC26373f;
        shortTvDetailListFragment.hideLoading();
        List list = (List) pair.getSecond();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C23403e c23403eM80424a = AbstractC19215a.m80424a((ShorttvModel.UGCVideo) it.next());
                if (c23403eM80424a != null && c23403eM80424a.m92929e() != null && (interfaceC26373f = shortTvDetailListFragment.mOrPlayer) != null) {
                    interfaceC26373f.addDataSource(c23403eM80424a);
                }
            }
        }
        List list2 = (List) pair.getSecond();
        if (list2 != null && !list2.isEmpty() && (c19322e = shortTvDetailListFragment.mAdapter) != null && (data = c19322e.getData()) != null && (listM81302e = ShortTvExtKt.m81302e(data, list2)) != null) {
            for (ShorttvModel.UGCVideo uGCVideo : listM81302e) {
                C19322e c19322e2 = shortTvDetailListFragment.mAdapter;
                if (c19322e2 != null) {
                    c19322e2.notifyItemChanged(ShortTvExtKt.m81301d(uGCVideo.getEp()));
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final Unit m81017I0(ShortTvDetailListFragment shortTvDetailListFragment, Integer num) {
        Intrinsics.m97799e(num);
        shortTvDetailListFragment.m81044N0(num.intValue());
        if (shortTvDetailListFragment.lastEp != 0) {
            if (num.intValue() >= shortTvDetailListFragment.lastEp) {
                int iM81395G = shortTvDetailListFragment.m81041z0().m81395G();
                if (num.intValue() + 3 >= iM81395G) {
                    ShortTvViewModel.m81370a0(shortTvDetailListFragment.m81041z0(), null, iM81395G, iM81395G + 5, 1, null);
                }
            } else {
                int iM81394F = shortTvDetailListFragment.m81041z0().m81394F();
                if (iM81394F > 1) {
                    ShortTvViewModel.m81370a0(shortTvDetailListFragment.m81041z0(), null, iM81394F - 6, iM81394F - 1, 1, null);
                }
            }
        }
        shortTvDetailListFragment.lastEp = num.intValue();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: J0 */
    private final void m81018J0() {
        int iIntValue;
        String strM81429r = m81041z0().m81429r();
        if (strM81429r != null) {
            ShorttvModel.UGCVideo uGCVideo = (ShorttvModel.UGCVideo) CollectionsKt.m97361k0(m81041z0().m81437z());
            if (uGCVideo != null) {
                iIntValue = uGCVideo.getEp();
            } else {
                Integer num = (Integer) m81041z0().m81430s().m14847f();
                iIntValue = num != null ? num.intValue() : 1;
            }
            m81041z0().m81414Z(strM81429r, Math.max(iIntValue - 10, 1), iIntValue);
        }
    }

    /* JADX INFO: renamed from: M0 */
    private final void m81019M0() {
        C19516u c19516u = this.mPagerChangeControl;
        long jM81295h = c19516u != null ? c19516u.m81295h() : 0L;
        ShorttvModel.UGCVideo uGCVideoM81431t = m81041z0().m81431t();
        if (uGCVideoM81431t == null) {
            return;
        }
        InterfaceC26373f interfaceC26373f = this.mOrPlayer;
        uGCVideoM81431t.setDurationMillis(interfaceC26373f != null ? interfaceC26373f.getDuration() : 0L);
        m81041z0().m81415b0(uGCVideoM81431t, jM81295h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final void m81020O0(ShortTvDetailListFragment shortTvDetailListFragment, int i11) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        PagerLayoutManager pagerLayoutManager = shortTvDetailListFragment.mPagerLayoutManager;
        if (pagerLayoutManager != null) {
            View viewM80575T = pagerLayoutManager.m80575T();
            Log.e(shortTvDetailListFragment.loggerTag, "post   itemView:" + viewM80575T);
            if (viewM80575T != null) {
                Log.e(shortTvDetailListFragment.loggerTag, "post   itemView: 22222");
                C19516u c19516u = shortTvDetailListFragment.mPagerChangeControl;
                if (c19516u != null) {
                    c19516u.mo81292d(i11, true, viewM80575T);
                }
                C27333c0 c27333c0 = (C27333c0) shortTvDetailListFragment.getMViewBinding();
                if (c27333c0 == null || (recyclerView = c27333c0.f83097c) == null) {
                    return;
                }
                recyclerView.requestLayout();
                return;
            }
            int childCount = pagerLayoutManager.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = pagerLayoutManager.getChildAt(i12);
                if (childAt != null && pagerLayoutManager.getPosition(childAt) == i11) {
                    C19516u c19516u2 = shortTvDetailListFragment.mPagerChangeControl;
                    if (c19516u2 != null) {
                        c19516u2.mo81292d(i11, true, childAt);
                    }
                    C27333c0 c27333c1 = (C27333c0) shortTvDetailListFragment.getMViewBinding();
                    if (c27333c1 != null && (recyclerView2 = c27333c1.f83097c) != null) {
                        recyclerView2.requestLayout();
                    }
                    Log.e(shortTvDetailListFragment.loggerTag, "post   itemView: 11111");
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public final void m81021R0() {
        C27851d c27851dM81040x0;
        InterfaceC28660e interfaceC28660eM81402N;
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        if (this.isClickPause) {
            C26866a.f81698a.m104912c("video_float", "shottv 视频暂停，无需触发画中画", true);
        } else {
            if (this.mOrPlayer == null || this.mOrPlayerView == null || (c27851dM81040x0 = m81040x0()) == null || (interfaceC28660eM81402N = m81041z0().m81402N()) == null) {
                return;
            }
            interfaceC28660eM81402N.mo73808g(activity, c27851dM81040x0);
        }
    }

    private final View getEmptyView(Context context) {
        final DefaultView defaultView = new DefaultView(context, DefaultView.ModelStyle.MODEL_STYLE_NIGHT);
        defaultView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        defaultView.setGravity(17);
        defaultView.setDefaultImageViewVisibility(0);
        defaultView.setDefaultImage(R$mipmap.short_tv_ic_no_content);
        String string = context.getString(R$string.short_tv_no_content);
        Intrinsics.m97801g(string, "getString(...)");
        defaultView.setDescText(string);
        defaultView.setStyle(DefaultView.DefaultViewStyle.STYLE_IMAGE_DESC_BTN);
        defaultView.setBtnVisibility(0);
        String string2 = context.getString(R$string.short_tv_Retry);
        Intrinsics.m97801g(string2, "getString(...)");
        defaultView.setBtnText(string2);
        defaultView.setBtnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.ui.fragment.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTvDetailListFragment.m81039w0(this.f62290a, defaultView, view);
            }
        });
        defaultView.setVisibility(0);
        return defaultView;
    }

    private final void initAdapter() {
        C19322e c19322e = new C19322e(new ArrayList(), this, false, this.ugcVideoId, this.mItemType, false, 32, null);
        c19322e.m36186h0().m108655C(new ShortTvLoadMoreView());
        c19322e.m36186h0().m108673z(false);
        c19322e.m36186h0().m108672y(false);
        c19322e.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.shorttv_pugc.ui.fragment.y
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                ShortTvDetailListFragment.m81009A0(this.f62292a);
            }
        });
        c19322e.m36203o0().m108677d(true);
        c19322e.m36203o0().m108676c(2);
        c19322e.m36203o0().m108675b(new InterfaceC27569g() { // from class: com.transsion.shorttv_pugc.ui.fragment.z
            @Override // p765s6.InterfaceC27569g
            /* JADX INFO: renamed from: a */
            public final void mo81168a() {
                ShortTvDetailListFragment.m81010B0(this.f62293a);
            }
        });
        c19322e.m36158R0(new C19391c());
        this.mAdapter = c19322e;
    }

    private final void initView() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        initAdapter();
        m81013E0();
        m81011C0();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        this.mPagerLayoutManager = new PagerLayoutManager(fragmentActivityRequireActivity);
        C19516u c19516u = new C19516u(this, this.mAdapter, this.mOrPlayer, this.mOrPlayerView, this.mPagerLayoutManager);
        this.mPagerChangeControl = c19516u;
        PagerLayoutManager pagerLayoutManager = this.mPagerLayoutManager;
        if (pagerLayoutManager != null) {
            pagerLayoutManager.m80577X(c19516u);
        }
        C27333c0 c27333c0 = (C27333c0) getMViewBinding();
        if (c27333c0 != null && (recyclerView4 = c27333c0.f83097c) != null) {
            recyclerView4.setLayoutManager(this.mPagerLayoutManager);
        }
        C27333c0 c27333c1 = (C27333c0) getMViewBinding();
        if (c27333c1 != null && (recyclerView3 = c27333c1.f83097c) != null) {
            recyclerView3.setAdapter(this.mAdapter);
        }
        C27333c0 c27333c2 = (C27333c0) getMViewBinding();
        if (c27333c2 != null && (recyclerView2 = c27333c2.f83097c) != null) {
            recyclerView2.addOnScrollListener(this.exposureHelper);
        }
        C27333c0 c27333c3 = (C27333c0) getMViewBinding();
        if (c27333c3 != null && (recyclerView = c27333c3.f83097c) != null) {
            recyclerView.post(new Runnable() { // from class: com.transsion.shorttv_pugc.ui.fragment.t
                @Override // java.lang.Runnable
                public final void run() {
                    ShortTvDetailListFragment.m81014F0(this.f62286a);
                }
            });
        }
        C19526e c19526eM81339a = C19526e.f62461c.m81339a();
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity2, "requireActivity(...)");
        c19526eM81339a.m81338e(fragmentActivityRequireActivity2);
    }

    private final void loadData() {
        if (m81041z0().m81389A().m14847f() == null) {
            m81041z0().m81413Y(this.ugcVideoId, this.subjectId, this.collectionId);
            String str = this.collectionId;
            if (str == null || str.length() == 0) {
                return;
            }
            AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new C193951(null), 3, null);
            return;
        }
        String strM81429r = m81041z0().m81429r();
        if (strM81429r != null) {
            Integer num = (Integer) m81041z0().m81430s().m14847f();
            int iMax = Math.max(1, num != null ? num.intValue() : 1);
            m81041z0().m81414Z(strM81429r, iMax, iMax + 10);
        }
    }

    private final void scrollToPosition(final int toPosition) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        this.isNewPlayer = true;
        C27333c0 c27333c0 = (C27333c0) getMViewBinding();
        if (c27333c0 != null && (recyclerView2 = c27333c0.f83097c) != null) {
            recyclerView2.scrollToPosition(toPosition);
        }
        C27333c0 c27333c1 = (C27333c0) getMViewBinding();
        if (c27333c1 == null || (recyclerView = c27333c1.f83097c) == null) {
            return;
        }
        recyclerView.post(new Runnable() { // from class: com.transsion.shorttv_pugc.ui.fragment.b0
            @Override // java.lang.Runnable
            public final void run() {
                ShortTvDetailListFragment.m81020O0(this.f62200a, toPosition);
            }
        });
    }

    private final void showEmpty() {
        C19322e c19322e;
        List<Object> data;
        hideLoading();
        C19322e c19322e2 = this.mAdapter;
        if (c19322e2 == null || (data = c19322e2.getData()) == null || !(!data.isEmpty())) {
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            View emptyView = getEmptyView(contextRequireContext);
            if (emptyView == null || (c19322e = this.mAdapter) == null) {
                return;
            }
            c19322e.m36171Y0(emptyView);
        }
    }

    /* JADX INFO: renamed from: v0 */
    private final void m81038v0() {
        Integer num = (Integer) m81041z0().m81430s().m14847f();
        if (num != null) {
            int iIntValue = num.intValue();
            int i11 = iIntValue + 1;
            C19322e c19322e = this.mAdapter;
            if ((c19322e != null ? C19322e.m80807R1(c19322e, i11, false, 2, null) : null) != null) {
                m81041z0().m81416c0(i11);
                C26866a.a.m104898f(C26866a.f81698a, this.loggerTag, "autoPlayNext  currentEp:" + iIntValue + "  nextEp:" + i11, false, 4, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m81039w0(ShortTvDetailListFragment shortTvDetailListFragment, DefaultView defaultView, View view) {
        shortTvDetailListFragment.loadData();
        defaultView.setVisibility(8);
    }

    /* JADX INFO: renamed from: x0 */
    private final C27851d m81040x0() {
        String ugcVideoId;
        Integer num = (Integer) m81041z0().m81430s().m14847f();
        if (num != null) {
            int iIntValue = num.intValue();
            List<ShorttvModel.UGCVideo> listM81426p = m81041z0().m81426p();
            if (this.mOrPlayer != null && this.mOrPlayerView != null) {
                ArrayList arrayList = new ArrayList();
                ShorttvModel.UGCVideo uGCVideo = null;
                for (ShorttvModel.UGCVideo uGCVideo2 : listM81426p) {
                    if (uGCVideo2.getEp() == iIntValue) {
                        uGCVideo = uGCVideo2;
                    }
                    arrayList.add(uGCVideo2);
                }
                ORPlayerView oRPlayerView = this.mOrPlayerView;
                Intrinsics.m97799e(oRPlayerView);
                InterfaceC26373f interfaceC26373f = this.mOrPlayer;
                Intrinsics.m97799e(interfaceC26373f);
                if (uGCVideo == null || (ugcVideoId = uGCVideo.getUgcVideoId()) == null) {
                    ugcVideoId = "";
                }
                return new C27851d(oRPlayerView, interfaceC26373f, ugcVideoId, uGCVideo != null ? uGCVideo.getEp() : 1, getPageName(), uGCVideo != null ? uGCVideo.getOps() : null, this.lastPageFrom, arrayList, uGCVideo);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public final ShortTvViewModel m81041z0() {
        return (ShortTvViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: K0 */
    public final void m81042K0() {
        if (this.shortListDialog == null) {
            ShortTvEpisodeListDialog shortTvEpisodeListDialog = new ShortTvEpisodeListDialog(this.ops);
            this.shortListDialog = shortTvEpisodeListDialog;
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
            shortTvEpisodeListDialog.show(childFragmentManager, "preload");
            ShortTvEpisodeListDialog shortTvEpisodeListDialog2 = this.shortListDialog;
            if (shortTvEpisodeListDialog2 != null) {
                shortTvEpisodeListDialog2.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m81043L0() {
        InterfaceC28660e interfaceC28660eM81402N = m81041z0().m81402N();
        if (interfaceC28660eM81402N != null && interfaceC28660eM81402N.mo73807f(this.mOrPlayer)) {
            InterfaceC28660e interfaceC28660eM81402N2 = m81041z0().m81402N();
            if (interfaceC28660eM81402N2 != null && interfaceC28660eM81402N2.mo73806e(this.mOrPlayer)) {
                C26866a.f81698a.m104912c(this.loggerTag, " 播放器在缓存中，这里不能release", true);
                return;
            }
            InterfaceC26373f interfaceC26373f = this.mOrPlayer;
            if (interfaceC26373f != null) {
                interfaceC26373f.stop();
            }
            InterfaceC26373f interfaceC26373f2 = this.mOrPlayer;
            if (interfaceC26373f2 != null) {
                interfaceC26373f2.release();
            }
        }
        C26866a.a.m104898f(C26866a.f81698a, this.loggerTag, "onDestroy  removePlayerListener", false, 4, null);
        InterfaceC26373f interfaceC26373f3 = this.mOrPlayer;
        if (interfaceC26373f3 != null) {
            interfaceC26373f3.removePlayerListener(this);
        }
        InterfaceC28658c interfaceC28658cM81400L = m81041z0().m81400L();
        if (interfaceC28658cM81400L != null) {
            interfaceC28658cM81400L.mo73791c();
        }
        DeviceKeyMonitor deviceKeyMonitor = this.deviceKeyMonitor;
        if (deviceKeyMonitor != null) {
            deviceKeyMonitor.m80579b();
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m81044N0(int ep2) {
        C19516u c19516u = this.mPagerChangeControl;
        if (c19516u != null) {
            int iM81294g = c19516u.m81294g();
            if (iM81294g == ShortTvExtKt.m81301d(ep2)) {
                C26866a.a aVar = C26866a.f81698a;
                String str = this.loggerTag;
                C19516u c19516u2 = this.mPagerChangeControl;
                C26866a.a.m104898f(aVar, str, "scrollToEpisode current:" + (c19516u2 != null ? Integer.valueOf(c19516u2.m81294g()) : null) + " == " + ep2, false, 4, null);
                return;
            }
            if (ep2 >= 0 && ep2 <= m81041z0().m81426p().size()) {
                if (iM81294g >= m81041z0().m81426p().size()) {
                    return;
                }
                C19516u c19516u3 = this.mPagerChangeControl;
                if (c19516u3 != null) {
                    c19516u3.m81297k(true);
                }
                scrollToPosition(ShortTvExtKt.m81301d(ep2));
                return;
            }
            C26866a.a aVar2 = C26866a.f81698a;
            String str2 = this.loggerTag;
            C19516u c19516u4 = this.mPagerChangeControl;
            C26866a.a.m104898f(aVar2, str2, "scrollToEpisode current:" + (c19516u4 != null ? Integer.valueOf(c19516u4.m81294g()) : null) + " over bounds", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m81045P0(boolean z11) {
        this.isClickPause = z11;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m81046Q0() {
        if (this.shortListDialog == null) {
            this.shortListDialog = new ShortTvEpisodeListDialog(this.ops);
        }
        ShortTvEpisodeListDialog shortTvEpisodeListDialog = this.shortListDialog;
        if (shortTvEpisodeListDialog != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
            shortTvEpisodeListDialog.show(childFragmentManager, "immComment");
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final void m81047S0() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastShowNetWorkErrToastTime > ToastStrategy.LONG_DURATION_TIMEOUT) {
            this.lastShowNetWorkErrToastTime = jCurrentTimeMillis;
            C19276h.f61921a.m80719h(R$string.short_tv_no_network_toast);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public void m81048T0(boolean videoPlaying) {
        try {
            Result.Companion companion = Result.INSTANCE;
            FragmentActivity activity = getActivity();
            if (activity != null && !activity.isDestroyed() && !activity.isFinishing()) {
                InterfaceC28660e interfaceC28660eM81402N = m81041z0().m81402N();
                Unit unit = null;
                if (interfaceC28660eM81402N != null) {
                    ORPlayerView oRPlayerView = this.mOrPlayerView;
                    ViewParent parent = oRPlayerView != null ? oRPlayerView.getParent() : null;
                    interfaceC28660eM81402N.mo73802a(activity, true, videoPlaying, parent instanceof ViewGroup ? (ViewGroup) parent : null);
                    unit = Unit.f75682a;
                }
                Result.m112707constructorimpl(unit);
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d c26907d) {
        InterfaceC16633f.a.m72423a(this, z11, i11, i12, c26907d);
    }

    public final String getPageName() {
        return "/ugc_shorts/detail";
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    public final void hideLoading() {
        ProgressBar progressBar;
        C27333c0 c27333c0 = (C27333c0) getMViewBinding();
        if (c27333c0 != null && (progressBar = c27333c0.f83096b) != null) {
            AbstractC23896b.m94640b(progressBar);
        }
        HandlerC19392d handlerC19392d = this.loadingHandler;
        handlerC19392d.removeMessages(handlerC19392d.m81053b());
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void initListener() {
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void initPlayer() {
        InterfaceC16633f.a.m72424b(this);
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void initViewData() {
        initView();
        startLoading();
        loadData();
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void initViewModel() {
        m81041z0().m81389A().m14851j(getViewLifecycleOwner(), new C19394f(new Function1() { // from class: com.transsion.shorttv_pugc.ui.fragment.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvDetailListFragment.m81015G0(this.f62287a, (ShorttvModel.UGCVideo) obj);
            }
        }));
        m81041z0().m81432u().m14851j(getViewLifecycleOwner(), new C19394f(new Function1() { // from class: com.transsion.shorttv_pugc.ui.fragment.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvDetailListFragment.m81016H0(this.f62288a, (Pair) obj);
            }
        }));
        m81041z0().m81430s().m14851j(this, new C19394f(new Function1() { // from class: com.transsion.shorttv_pugc.ui.fragment.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvDetailListFragment.m81017I0(this.f62289a, (Integer) obj);
            }
        }));
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void logPause() {
        super.logPause();
        if (this.resumeTimeStamp != 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.resumeTimeStamp;
            InterfaceC28659d interfaceC28659dM81401M = m81041z0().m81401M();
            if (interfaceC28659dM81401M != null) {
                interfaceC28659dM81401M.mo73798a(getPageName(), Long.valueOf(jElapsedRealtime), getContext());
            }
        }
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void logResume() {
        super.logResume();
        this.resumeTimeStamp = SystemClock.elapsedRealtime();
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("/ugc_shorts/detail", false, 2, null);
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
    public void onCompletion(C23403e mediaSource) {
        InterfaceC16633f.a.m72427e(this, mediaSource);
        m81038v0();
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment, p743rh.InterfaceC27288n
    public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
        InterfaceC26373f interfaceC26373f;
        Intrinsics.m97802h(network, "network");
        Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
        super.onConnected(network, networkCapabilities);
        Log.e(this.loggerTag, "onConnected");
        String strM81429r = m81041z0().m81429r();
        if (strM81429r == null || strM81429r.length() == 0) {
            loadData();
        }
        C19516u c19516u = this.mPagerChangeControl;
        if (c19516u != null) {
            c19516u.m81296i();
        }
        if (this.errorInfo == null || (interfaceC26373f = this.mOrPlayer) == null) {
            return;
        }
        interfaceC26373f.prepare();
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        HashMap mapM96844g;
        super.onCreate(savedInstanceState);
        this.lastPageFrom = C24662i.f75350a.m96877i();
        Bundle arguments = getArguments();
        this.ugcVideoId = arguments != null ? arguments.getString("id") : null;
        Bundle arguments2 = getArguments();
        this.subjectId = arguments2 != null ? arguments2.getString("subjectId") : null;
        Bundle arguments3 = getArguments();
        this.collectionId = arguments3 != null ? arguments3.getString("collectionId") : null;
        Bundle arguments4 = getArguments();
        this.fromOptId = arguments4 != null ? arguments4.getString("fromOptId") : null;
        Bundle arguments5 = getArguments();
        this.ops = arguments5 != null ? arguments5.getString("ops") : null;
        Bundle arguments6 = getArguments();
        this.ugcWithoutHistory = arguments6 != null ? arguments6.getBoolean("ugc_without_history") : false;
        m81041z0().m81420g0(this.ops);
        m81041z0().m81421h0(this.ugcWithoutHistory);
        String str = this.ugcVideoId;
        if (str == null || str.length() == 0) {
            requireActivity().finish();
        }
        InterfaceC28658c interfaceC28658cM81400L = m81041z0().m81400L();
        if (interfaceC28658cM81400L != null) {
            interfaceC28658cM81400L.mo73789a(this.downloadListener);
        }
        Context context = getContext();
        if (context != null) {
            this.deviceKeyMonitor = new DeviceKeyMonitor(context, new C19393e());
        }
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
            mapM96844g.put("belong_to_collection_id", this.collectionId);
            mapM96844g.put("content_id", this.ugcVideoId);
            mapM96844g.put("ops", this.ops);
            mapM96844g.put("content_type", "ugc_video");
        }
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 != null) {
            logViewConfig2.m96851n(this.ops);
        }
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        DeviceKeyMonitor deviceKeyMonitor = this.deviceKeyMonitor;
        if (deviceKeyMonitor != null) {
            deviceKeyMonitor.m80579b();
        }
        super.onDestroy();
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onFocusChange(boolean z11) {
        InterfaceC16633f.a.m72429g(this, z11);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed()) {
            if (hidden) {
                InterfaceC26373f interfaceC26373f = this.mOrPlayer;
                if (interfaceC26373f != null) {
                    interfaceC26373f.pause();
                }
                logPause();
                return;
            }
            InterfaceC26373f interfaceC26373f2 = this.mOrPlayer;
            if (interfaceC26373f2 != null) {
                interfaceC26373f2.play();
            }
            logResume();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onIsPlayingChanged(boolean z11) {
        InterfaceC16633f.a.m72430h(this, z11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingBegin(C23403e c23403e) {
        InterfaceC16633f.a.m72431i(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingEnd(C23403e c23403e) {
        InterfaceC16633f.a.m72433k(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingProgress(int i11, float f11, C23403e c23403e) {
        InterfaceC16633f.a.m72435m(this, i11, f11, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoopingStart() {
        InterfaceC16633f.a.m72437o(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onMediaItemTransition(String uuid) {
        List<Object> arrayList;
        View viewM81293f;
        ShorttvModel.UGCVideo uGCVideo;
        this.isNewPlayer = true;
        Integer num = (Integer) m81041z0().m81430s().m14847f();
        if (num != null) {
            int iIntValue = num.intValue();
            C19322e c19322e = this.mAdapter;
            if (c19322e != null) {
                int iM80808T1 = C19322e.m80808T1(c19322e, iIntValue, false, 2, null);
                C19322e c19322e2 = this.mAdapter;
                if (c19322e2 == null || ((ShorttvModel.UGCVideo) c19322e2.m36182f0(iM80808T1)) == null || iM80808T1 == -1) {
                    return;
                }
                C19322e c19322e3 = this.mAdapter;
                if (c19322e3 == null || (arrayList = c19322e3.getData()) == null) {
                    arrayList = new ArrayList<>();
                }
                int i11 = iM80808T1 + 1;
                ShorttvModel.UGCVideo uGCVideo2 = (ShorttvModel.UGCVideo) CollectionsKt.m97362l0(arrayList, i11);
                if (uGCVideo2 == null) {
                    return;
                }
                C26866a.a aVar = C26866a.f81698a;
                C26866a.a.m104898f(aVar, this.loggerTag, "onMediaItemTransition uuid:" + uuid + " nextItem:" + uGCVideo2, false, 4, null);
                if (uGCVideo2.isDataNotComplete()) {
                    InterfaceC26373f interfaceC26373f = this.mOrPlayer;
                    if (interfaceC26373f != null) {
                        interfaceC26373f.pause();
                        return;
                    }
                    return;
                }
                C19322e c19322e4 = this.mAdapter;
                if (c19322e4 != null) {
                    c19322e4.notifyItemInserted(iM80808T1);
                }
                C19516u c19516u = this.mPagerChangeControl;
                if (c19516u == null || (viewM81293f = c19516u.m81293f()) == 0) {
                    return;
                }
                if (viewM81293f instanceof InterfaceC19486a) {
                    InterfaceC16633f interfaceC16633f = (InterfaceC16633f) viewM81293f;
                    String ugcVideoId = uGCVideo2.getUgcVideoId();
                    if (ugcVideoId == null) {
                        ugcVideoId = "";
                    }
                    interfaceC16633f.onMediaItemTransition(ugcVideoId);
                    uGCVideo = uGCVideo2;
                    InterfaceC19486a.a.m81285a((InterfaceC19486a) viewM81293f, uGCVideo2, this, Integer.valueOf(i11), false, null, null, false, false, 128, null);
                    C19516u c19516u2 = this.mPagerChangeControl;
                    if (c19516u2 != null) {
                        c19516u2.mo81292d(i11, false, viewM81293f);
                    }
                    InterfaceC26373f interfaceC26373f2 = this.mOrPlayer;
                    boolean zIsPlaying = interfaceC26373f2 != null ? interfaceC26373f2.isPlaying() : false;
                    C26866a.a.m104898f(aVar, this.loggerTag, "onMediaItemTransition  isPlaying:" + zIsPlaying, false, 4, null);
                    if (zIsPlaying) {
                        interfaceC16633f.onRenderFirstFrame();
                    }
                } else {
                    uGCVideo = uGCVideo2;
                }
                m81041z0().m81416c0(uGCVideo.getEp());
            }
        }
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        m81019M0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        InterfaceC28660e interfaceC28660eM81402N;
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
        C27851d c27851dM81040x0 = m81040x0();
        if (c27851dM81040x0 == null || (interfaceC28660eM81402N = m81041z0().m81402N()) == null) {
            return;
        }
        interfaceC28660eM81402N.mo73809h(isInPictureInPictureMode, getActivity(), c27851dM81040x0);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayError(PlayError errorInfo, C23403e mediaSource) {
        Intrinsics.m97802h(errorInfo, "errorInfo");
        InterfaceC16633f.a.m72439q(this, errorInfo, mediaSource);
        this.errorInfo = errorInfo;
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
    public void onPrepare(C23403e mediaSource) {
        InterfaceC16633f.a.m72445w(this, mediaSource);
        this.errorInfo = null;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onProgress(long j11, C23403e c23403e) {
        InterfaceC16633f.a.m72447y(this, j11, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onRenderFirstFrame() {
        InterfaceC16633f.a.m72412A(this);
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onSetDataSource() {
        InterfaceC16633f.a.m72413B(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
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
    public void onVideoPause(C23403e mediaSource) {
        InterfaceC16633f.a.m72417F(this, mediaSource);
        m81048T0(false);
        hideLoading();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoSizeChanged(int i11, int i12) {
        InterfaceC16633f.a.m72419H(this, i11, i12);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoStart(C23403e mediaSource) {
        InterfaceC16633f.a.m72420I(this, mediaSource);
        m81048T0(true);
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void retryLoadData() {
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void setOnSeekCompleteListener() {
        InterfaceC16633f.a.m72422K(this);
    }

    public final void startLoading() {
        HandlerC19392d handlerC19392d = this.loadingHandler;
        if (handlerC19392d.hasMessages(handlerC19392d.m81053b())) {
            return;
        }
        HandlerC19392d handlerC19392d2 = this.loadingHandler;
        handlerC19392d2.sendEmptyMessageDelayed(handlerC19392d2.m81053b(), this.loadingHandler.m81052a());
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public C27333c0 getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C27333c0 c27333c0M106432c = C27333c0.m106432c(inflater);
        Intrinsics.m97801g(c27333c0M106432c, "inflate(...)");
        return c27333c0M106432c;
    }
}
