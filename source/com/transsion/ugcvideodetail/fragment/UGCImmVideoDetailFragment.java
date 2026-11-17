package com.transsion.ugcvideodetail.fragment;

import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.pager.PagerLayoutManager;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayBean;
import com.transsion.baselib.report.C14486e;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.player.config.RenderType;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.PlayError;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.player.shorttv.preload.C16656c;
import com.transsion.ugcvideodetail.adapter.C20143a;
import com.transsion.ugcvideodetail.api.bean.UGCImmVideo;
import com.transsion.ugcvideodetail.api.bean.UGCImmVideoContent;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.ugcvideodetail.hepler.C20311b;
import com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel;
import com.transsion.ugcvideodetail.widget.UGCImmVideoItemView;
import com.transsion.ugcvideodetail.widget.UGCImmVideoLoadMoreView;
import com.transsion.videofloat.manager.C21106a0;
import com.transsnet.downloader.manager.C21851p;
import com.transsnet.downloader.manager.InterfaceC21842g;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fo.C23403e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import p550kj.C24655b;
import p550kj.C24662i;
import p654oo.C26372e;
import p654oo.InterfaceC26373f;
import p683po.C26906c;
import p683po.C26907d;
import p723qx.InterfaceC27135b;
import p743rh.C27287m;
import p765s6.InterfaceC27568f;
import p765s6.InterfaceC27569g;
import p801u6.C27941f;
import p801u6.C27942g;
import p885wv.C28446f;
import p885wv.C28453m;
import pg.C26866a;
import py.AbstractC26961d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\b\u0006\n\u0002\b\u0006*\u0004¼\u0001Â\u0001\u0018\u0000 Æ\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001SB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0013\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\u0019\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u0005J\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u0005J\u0017\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\u0005J\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\u0005J\u000f\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u0010\u0005J\u000f\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010\u0005J\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\u0005J\u000f\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u0010\u0005J\u000f\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u0010\u0005J\u000f\u00104\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u0010\u0005J\r\u00105\u001a\u00020\u0006¢\u0006\u0004\b5\u0010\u0005J\u001f\u0010:\u001a\u00020\u00062\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0019\u0010>\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b>\u0010?J\u0019\u0010A\u001a\u00020\u00062\b\u0010@\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\bA\u0010BJ!\u0010E\u001a\u00020\u00062\u0006\u0010D\u001a\u00020C2\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\bE\u0010FJ\u0019\u0010G\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\bG\u0010?J\u000f\u0010H\u001a\u00020\u0006H\u0016¢\u0006\u0004\bH\u0010\u0005J\r\u0010I\u001a\u00020\u0006¢\u0006\u0004\bI\u0010\u0005J\r\u0010J\u001a\u00020\u0006¢\u0006\u0004\bJ\u0010\u0005J\u000f\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0006H\u0016¢\u0006\u0004\bN\u0010\u0005J\u000f\u0010O\u001a\u00020\u0006H\u0016¢\u0006\u0004\bO\u0010\u0005J\u0017\u0010Q\u001a\u00020\u00062\b\u0010P\u001a\u0004\u0018\u00010%¢\u0006\u0004\bQ\u0010BR\u001b\u0010W\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010T\u001a\u0004\bZ\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R$\u0010c\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010^\u001a\u0004\ba\u0010'\"\u0004\bb\u0010BR\u0018\u0010e\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010^R\u0018\u0010h\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010j\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010^R\u0018\u0010l\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010^R\u0016\u0010o\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010q\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010^R\u0018\u0010s\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010^R\"\u0010w\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010^\u001a\u0004\bu\u0010'\"\u0004\bv\u0010BR$\u0010{\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010^\u001a\u0004\by\u0010'\"\u0004\bz\u0010BR$\u0010\u007f\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010^\u001a\u0004\b}\u0010'\"\u0004\b~\u0010BR(\u0010\u0083\u0001\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010^\u001a\u0005\b\u0081\u0001\u0010'\"\u0005\b\u0082\u0001\u0010BR\u0018\u0010\u0085\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010nR\u001c\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001c\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001c\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001c\u0010¡\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001a\u0010£\u0001\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¢\u0001\u0010^R'\u0010¨\u0001\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b¤\u0001\u0010n\u001a\u0005\b¥\u0001\u0010)\"\u0006\b¦\u0001\u0010§\u0001R\u001a\u0010¬\u0001\u001a\u00030©\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R!\u0010±\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010®\u00010\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R \u0010³\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010°\u0001R!\u0010¶\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010´\u00010\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010°\u0001R\u001f\u0010¹\u0001\u001a\n\u0012\u0005\u0012\u00030·\u00010\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010°\u0001R\u001a\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0018\u0010¿\u0001\u001a\u00030¼\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u001a\u0010Á\u0001\u001a\u00030©\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010«\u0001R\u0018\u0010Å\u0001\u001a\u00030Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001¨\u0006Ç\u0001"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/fragment/UGCImmVideoDetailFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lwv/f;", "Lcom/transsion/player/orplayer/f;", "<init>", "()V", "", "O0", "initAdapter", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "video", "g1", "(Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;)V", "", "Lcom/transsion/ugcvideodetail/api/bean/UGCImmVideo;", "newList", "", "isLoadDown", "hasMore", "R0", "(Ljava/util/List;ZZ)V", "B0", "T0", "U0", "e1", "x0", "y0", "Lcom/transsion/baselib/db/download/DownloadBean;", "bean", "f1", "(Lcom/transsion/baselib/db/download/DownloadBean;)V", "Z0", "V0", "Landroid/view/LayoutInflater;", "inflater", "J0", "(Landroid/view/LayoutInflater;)Lwv/f;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "isAudioShowNoNetworkLayout", "()Z", "receiveArguments", "initViewData", "Landroidx/appcompat/widget/AppCompatImageView;", "L0", "()Landroidx/appcompat/widget/AppCompatImageView;", "initViewModel", "initListener", "retryLoadData", "onStop", "onPause", "onResume", "Y0", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onConnected", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "Lfo/e;", "mediaSource", "onCompletion", "(Lfo/e;)V", "uuid", "onMediaItemTransition", "(Ljava/lang/String;)V", "Lcom/transsion/player/orplayer/PlayError;", "errorInfo", "onPlayError", "(Lcom/transsion/player/orplayer/PlayError;Lfo/e;)V", "onPrepare", "onDestroyView", "hideLoading", "startLoading", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "logResume", "logPause", "ugcVideoId", "c1", "Lcom/transsion/ugcvideodetail/viewmodel/UGCImmVideoDetailViewModel;", "a", "Lkotlin/Lazy;", "D0", "()Lcom/transsion/ugcvideodetail/viewmodel/UGCImmVideoDetailViewModel;", "detailViewModel", "Lcom/transsnet/downloader/manager/g;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "E0", "()Lcom/transsnet/downloader/manager/g;", "downloadManager", "c", "Ljava/lang/String;", "ops", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "C0", "setCollectionId", "collectionId", "e", "firstUgcVideoId", "f", "Lcom/transsion/ugcvideodetail/api/bean/UGCImmVideo;", "firstUgcVideo", "g", "ugcVideoType", "h", "subjectId", "i", "Z", "withoutHistory", "j", "tabId", CampaignEx.JSON_KEY_AD_K, "fromOptId", "l", "I0", "setTrackId", "trackId", "m", "H0", "setPreviousTrackId", "previousTrackId", "n", "G0", "setPreviousPageVideoId", "previousPageVideoId", "o", "F0", "setLastPageFrom", "lastPageFrom", TtmlNode.TAG_P, "isNewPlayer", "Loo/f;", CampaignEx.JSON_KEY_AD_Q, "Loo/f;", "orPlayer", "Lcom/transsion/player/ui/ORPlayerView;", CampaignEx.JSON_KEY_AD_R, "Lcom/transsion/player/ui/ORPlayerView;", "orPlayerView", "Lcom/transsion/ugcvideodetail/adapter/a;", "s", "Lcom/transsion/ugcvideodetail/adapter/a;", "detailAdapter", "Lcom/tn/lib/pager/PagerLayoutManager;", "t", "Lcom/tn/lib/pager/PagerLayoutManager;", "pagerLayoutManager", "Lcom/transsion/ugcvideodetail/hepler/b;", TmcStartParams.KEY_URL_SHORT, "Lcom/transsion/ugcvideodetail/hepler/b;", "pagerChangeControl", "Landroid/os/Handler;", "v", "Landroid/os/Handler;", "downloadPopHandler", "Ljava/lang/Runnable;", "w", "Ljava/lang/Runnable;", "downloadPopHideRunnable", "x", "downloadingUgcVideoId", "y", "isClickPause$UGCVideoDetail_psRelease", "b1", "(Z)V", "isClickPause", "", "z", "J", "pageLoadStartTime", "Landroidx/lifecycle/c0;", "Lcom/transsion/baselib/db/video/UGCVideoDetailPlayBean;", "A", "Landroidx/lifecycle/c0;", "historyObserver", "B", "detailObserver", "Lcom/transsion/ugcvideodetail/api/bean/UGCImmVideoContent;", "C", "listObserver", "", "D", "playingEpObserver", "E", "Lcom/transsion/player/orplayer/PlayError;", "com/transsion/ugcvideodetail/fragment/UGCImmVideoDetailFragment$c", "F", "Lcom/transsion/ugcvideodetail/fragment/UGCImmVideoDetailFragment$c;", "loadingHandler", "G", "resumeTimeStamp", "com/transsion/ugcvideodetail/fragment/UGCImmVideoDetailFragment$b", "H", "Lcom/transsion/ugcvideodetail/fragment/UGCImmVideoDetailFragment$b;", "downloadListener", "I", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCImmVideoDetailFragment extends PageStatusFragment<C28446f> implements InterfaceC16633f {

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final InterfaceC3189c0 historyObserver;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final InterfaceC3189c0 detailObserver;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final InterfaceC3189c0 listObserver;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final InterfaceC3189c0 playingEpObserver;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private PlayError errorInfo;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final HandlerC20176c loadingHandler;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private long resumeTimeStamp;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C20175b downloadListener;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy detailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(UGCImmVideoDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.ugcvideodetail.fragment.UGCImmVideoDetailFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.ugcvideodetail.fragment.UGCImmVideoDetailFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy downloadManager = LazyKt.m97097b(new Function0() { // from class: com.transsion.ugcvideodetail.fragment.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UGCImmVideoDetailFragment.m83677A0();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String ops;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String collectionId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String firstUgcVideoId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private UGCImmVideo firstUgcVideo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String ugcVideoType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String subjectId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean withoutHistory;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String tabId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String fromOptId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String trackId;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private String previousTrackId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private String previousPageVideoId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private String lastPageFrom;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean isNewPlayer;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private InterfaceC26373f orPlayer;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private ORPlayerView orPlayerView;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private C20143a detailAdapter;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private PagerLayoutManager pagerLayoutManager;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private C20311b pagerChangeControl;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final Handler downloadPopHandler;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private Runnable downloadPopHideRunnable;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private String downloadingUgcVideoId;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean isClickPause;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private long pageLoadStartTime;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCImmVideoDetailFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final UGCImmVideoDetailFragment m83727a() {
            return new UGCImmVideoDetailFragment();
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCImmVideoDetailFragment$b */
    public static final class C20175b extends AbstractC26961d {
        C20175b() {
        }

        @Override // py.AbstractC26961d
        /* JADX INFO: renamed from: h */
        public void mo74222h(DownloadBean bean, int i11) {
            C20143a c20143a;
            List<Object> data;
            Intrinsics.m97802h(bean, "bean");
            C20143a c20143a2 = UGCImmVideoDetailFragment.this.detailAdapter;
            int i12 = -1;
            if (c20143a2 != null && (data = c20143a2.getData()) != null) {
                Iterator<Object> it = data.iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    UGCVideo ugcVideo = ((UGCImmVideo) it.next()).getUgcVideo();
                    if (Intrinsics.m97797c(ugcVideo != null ? ugcVideo.getUgcVideoId() : null, bean.getUgcVideoId())) {
                        i12 = i13;
                        break;
                    }
                    i13++;
                }
            }
            if (i12 >= 0 && (c20143a = UGCImmVideoDetailFragment.this.detailAdapter) != null) {
                c20143a.notifyItemChanged(i12, Integer.valueOf(i11));
            }
            UGCImmVideoDetailFragment.this.m83698f1(bean);
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCImmVideoDetailFragment$c */
    public static final class HandlerC20176c extends Handler {

        /* JADX INFO: renamed from: a */
        private final int f64121a;

        /* JADX INFO: renamed from: b */
        private final long f64122b;

        HandlerC20176c(Looper looper) {
            super(looper);
            this.f64121a = 1;
            this.f64122b = 300L;
        }

        /* JADX INFO: renamed from: a */
        public final long m83728a() {
            return this.f64122b;
        }

        /* JADX INFO: renamed from: b */
        public final int m83729b() {
            return this.f64121a;
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            C28446f mViewBinding;
            ProgressBar progressBar;
            Intrinsics.m97802h(msg, "msg");
            super.handleMessage(msg);
            if (msg.what != this.f64121a || (mViewBinding = UGCImmVideoDetailFragment.this.getMViewBinding()) == null || (progressBar = mViewBinding.f87289e) == null) {
                return;
            }
            AbstractC26006c.m102058k(progressBar);
        }
    }

    public UGCImmVideoDetailFragment() {
        String string = UUID.randomUUID().toString();
        Intrinsics.m97801g(string, "toString(...)");
        this.trackId = string;
        this.isNewPlayer = true;
        this.downloadPopHandler = new Handler(Looper.getMainLooper());
        this.historyObserver = new InterfaceC3189c0() { // from class: com.transsion.ugcvideodetail.fragment.d
            @Override // androidx.p1004lifecycle.InterfaceC3189c0
            public final void onChanged(Object obj) {
                UGCImmVideoDetailFragment.m83681K0(this.f64256a, (UGCVideoDetailPlayBean) obj);
            }
        };
        this.detailObserver = new InterfaceC3189c0() { // from class: com.transsion.ugcvideodetail.fragment.e
            @Override // androidx.p1004lifecycle.InterfaceC3189c0
            public final void onChanged(Object obj) {
                UGCImmVideoDetailFragment.m83716z0(this.f64259a, (UGCImmVideo) obj);
            }
        };
        this.listObserver = new InterfaceC3189c0() { // from class: com.transsion.ugcvideodetail.fragment.f
            @Override // androidx.p1004lifecycle.InterfaceC3189c0
            public final void onChanged(Object obj) {
                UGCImmVideoDetailFragment.m83688S0(this.f64263a, (UGCImmVideoContent) obj);
            }
        };
        this.playingEpObserver = new InterfaceC3189c0() { // from class: com.transsion.ugcvideodetail.fragment.g
            @Override // androidx.p1004lifecycle.InterfaceC3189c0
            public final void onChanged(Object obj) {
                UGCImmVideoDetailFragment.m83692W0(this.f64267a, ((Integer) obj).intValue());
            }
        };
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.m97799e(looperMyLooper);
        this.loadingHandler = new HandlerC20176c(looperMyLooper);
        this.downloadListener = new C20175b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final InterfaceC21842g m83677A0() {
        return C21851p.f67672a.m88759a(Utils.m27275a());
    }

    /* JADX INFO: renamed from: B0 */
    private final void m83678B0() {
        String str;
        startLoading();
        if (!C27287m.f83003a.m106330e()) {
            String str2 = this.firstUgcVideoId;
            if (str2 != null) {
                if (StringsKt.m98160q0(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    m83679D0().m84198T0(str2, this.collectionId);
                    return;
                }
            }
            String str3 = this.subjectId;
            if (str3 != null) {
                if (StringsKt.m98160q0(str3)) {
                    str3 = null;
                }
                if (str3 != null) {
                    hideLoading();
                    PageStatusFragment.showErrorView$default(this, false, 1, null);
                    return;
                }
                return;
            }
            return;
        }
        String str4 = this.collectionId;
        if (str4 == null || str4.length() == 0 || this.withoutHistory) {
            C26866a.a.m104898f(C26866a.f81698a, "UGCImmVideoDetail", "firstLoadData---1 withoutHistory:" + this.withoutHistory, false, 4, null);
            m83689T0();
            if (this.withoutHistory || (str = this.firstUgcVideoId) == null) {
                return;
            }
            m83679D0().m84204Z0(str, false);
            return;
        }
        String str5 = this.firstUgcVideoId;
        if (str5 != null) {
            if (StringsKt.m98160q0(str5)) {
                str5 = null;
            }
            if (str5 != null) {
                m83679D0().m84204Z0(str5, true);
                return;
            }
        }
        String str6 = this.subjectId;
        if (str6 != null) {
            String str7 = StringsKt.m98160q0(str6) ? null : str6;
            if (str7 != null) {
                m83679D0().m84190K0(str7);
            }
        }
    }

    /* JADX INFO: renamed from: D0 */
    private final UGCImmVideoDetailViewModel m83679D0() {
        return (UGCImmVideoDetailViewModel) this.detailViewModel.getValue();
    }

    /* JADX INFO: renamed from: E0 */
    private final InterfaceC21842g m83680E0() {
        return (InterfaceC21842g) this.downloadManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final void m83681K0(UGCImmVideoDetailFragment uGCImmVideoDetailFragment, UGCVideoDetailPlayBean uGCVideoDetailPlayBean) {
        C26866a.a.m104898f(C26866a.f81698a, "UGCImmVideoDetail", "historyObserver: " + uGCVideoDetailPlayBean + ", withoutHistory=" + uGCImmVideoDetailFragment.withoutHistory + "， shouldRequestDetail:" + uGCImmVideoDetailFragment.m83679D0().m84199U0(), false, 4, null);
        if (uGCVideoDetailPlayBean != null && !uGCImmVideoDetailFragment.withoutHistory) {
            uGCImmVideoDetailFragment.firstUgcVideoId = uGCVideoDetailPlayBean.getUgcVideoId();
            uGCImmVideoDetailFragment.m83679D0().m84259D().mo14858q(uGCImmVideoDetailFragment.firstUgcVideoId);
        }
        if (uGCImmVideoDetailFragment.m83679D0().m84199U0()) {
            uGCImmVideoDetailFragment.m83689T0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final void m83682M0(UGCImmVideoDetailFragment uGCImmVideoDetailFragment) {
        uGCImmVideoDetailFragment.m83690U0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final void m83683N0(UGCImmVideoDetailFragment uGCImmVideoDetailFragment) {
        if (C27287m.f83003a.m106330e()) {
            uGCImmVideoDetailFragment.m83697e1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O0 */
    private final void m83684O0() {
        C26372e c26372e;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        this.orPlayerView = new ORPlayerView(fragmentActivityRequireActivity, RenderType.TEXTURE_VIEW);
        InterfaceC16634g interfaceC16634gM86578b = C21106a0.f66016a.m86578b("ImmVideo" + this.firstUgcVideoId);
        int i11 = 1;
        boolean z11 = interfaceC16634gM86578b == null;
        this.isNewPlayer = z11;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "UGCImmVideoDetail", "initOrPlayer isNewPlayer:" + z11, false, 4, null);
        C16656c c16656c = null;
        Object[] objArr = 0;
        if (interfaceC16634gM86578b != null) {
            c26372e = interfaceC16634gM86578b instanceof C26372e ? (C26372e) interfaceC16634gM86578b : null;
            if (c26372e != null) {
                ORPlayerView oRPlayerView = this.orPlayerView;
                c26372e.setTextureView(oRPlayerView != null ? oRPlayerView.getTextureView() : null);
            } else {
                c26372e = null;
            }
        } else {
            c26372e = new C26372e(c16656c, i11, objArr == true ? 1 : 0);
            ORPlayerView oRPlayerView2 = this.orPlayerView;
            c26372e.setTextureView(oRPlayerView2 != null ? oRPlayerView2.getTextureView() : null);
        }
        this.orPlayer = c26372e;
        InterfaceC27135b.b.m105599a(InterfaceC27135b.f82245a.m105597c(), false, 1, null);
        C14496b c14496b = C14496b.f50966a;
        boolean z12 = c14496b.m65344b().getBoolean("KEY_UGC_IMM_VIDEO_AUTO_PLAY", false);
        float f11 = c14496b.m65344b().getFloat("KEY_UGC_IMM_VIDEO_SPEED", 1.0f);
        InterfaceC26373f interfaceC26373f = this.orPlayer;
        if (interfaceC26373f != null) {
            interfaceC26373f.addPlayerListener(this);
        }
        InterfaceC26373f interfaceC26373f2 = this.orPlayer;
        if (interfaceC26373f2 != null) {
            interfaceC26373f2.setLooping(!z12);
        }
        InterfaceC26373f interfaceC26373f3 = this.orPlayer;
        if (interfaceC26373f3 != null) {
            interfaceC26373f3.setSpeed(f11);
        }
        C26866a.a.m104898f(aVar, "UGCImmVideoDetail", "initOrPlayer speed:" + f11 + ", autoPlay:" + z12, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final void m83685P0(UGCImmVideoDetailFragment uGCImmVideoDetailFragment, View view) {
        C24662i.f75350a.m96881p("/ugc_video/immersive_detail", MapsKt.m97577l(TuplesKt.m97108a("dialog_name", "download_view"), TuplesKt.m97108a("module_name", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)));
        uGCImmVideoDetailFragment.m83691V0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final void m83686Q0(UGCImmVideoDetailFragment uGCImmVideoDetailFragment, View view) {
        FragmentActivity activity = uGCImmVideoDetailFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x0132  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX INFO: renamed from: R0 */
    private final void m83687R0(List newList, boolean isLoadDown, boolean hasMore) {
        int iVideoUGCPosition;
        UGCVideo ugcVideo;
        UGCVideo ugcVideo2;
        Object next;
        Pair pairM97108a;
        ?? r11;
        C20143a c20143a = this.detailAdapter;
        if (c20143a == null) {
            return;
        }
        List<Object> data = c20143a.getData();
        if (data.isEmpty()) {
            c20143a.mo36201n1(CollectionsKt.m97343U0(newList));
            C27941f c27941fM36186h0 = isLoadDown ? c20143a.m36186h0() : null;
            if (c27941fM36186h0 == null) {
                c20143a.m36203o0().m108678e(false);
                return;
            } else if (hasMore) {
                c27941fM36186h0.m108667s();
                return;
            } else {
                c27941fM36186h0.m108668t(true);
                c27941fM36186h0.m108673z(false);
                return;
            }
        }
        List<Object> list = data;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UGCVideo ugcVideo3 = ((UGCImmVideo) it.next()).getUgcVideo();
            Integer numValueOf = ugcVideo3 != null ? Integer.valueOf(ugcVideo3.videoUGCPosition()) : null;
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
        }
        Set setW0 = CollectionsKt.m97345W0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = newList.iterator();
        while (true) {
            iVideoUGCPosition = -1;
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            UGCImmVideo uGCImmVideo = (UGCImmVideo) next2;
            UGCVideo ugcVideo4 = uGCImmVideo.getUgcVideo();
            if ((ugcVideo4 != null ? ugcVideo4.videoUGCPosition() : -1) > 0) {
                Set set = setW0;
                UGCVideo ugcVideo5 = uGCImmVideo.getUgcVideo();
                if (CollectionsKt.m97352b0(set, ugcVideo5 != null ? Integer.valueOf(ugcVideo5.videoUGCPosition()) : null)) {
                    r11 = false;
                } else {
                    r11 = true;
                }
            } else {
                r11 = false;
            }
            if (r11 != false) {
                arrayList2.add(next2);
            }
        }
        List listI0 = CollectionsKt.m97331I0(arrayList2, new Comparator() { // from class: com.transsion.ugcvideodetail.fragment.UGCImmVideoDetailFragment$insertCollectionList$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                UGCVideo ugcVideo6 = ((UGCImmVideo) t11).getUgcVideo();
                Integer numValueOf2 = Integer.valueOf(ugcVideo6 != null ? ugcVideo6.videoUGCPosition() : -1);
                UGCVideo ugcVideo7 = ((UGCImmVideo) t12).getUgcVideo();
                return ComparisonsKt.m97603d(numValueOf2, Integer.valueOf(ugcVideo7 != null ? ugcVideo7.videoUGCPosition() : -1));
            }
        });
        if (listI0.isEmpty()) {
            C27941f c27941fM36186h1 = isLoadDown ? c20143a.m36186h0() : null;
            if (c27941fM36186h1 == null) {
                c20143a.m36203o0().m108678e(false);
                return;
            } else if (hasMore) {
                c27941fM36186h1.m108667s();
                return;
            } else {
                c27941fM36186h1.m108668t(true);
                c27941fM36186h1.m108673z(false);
                return;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            UGCVideo ugcVideo6 = ((UGCImmVideo) obj).getUgcVideo();
            if (ugcVideo6 != null) {
                Integer numValueOf2 = Integer.valueOf(ugcVideo6.videoUGCPosition());
                if ((numValueOf2.intValue() > 0) == false) {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    pairM97108a = TuplesKt.m97108a(Integer.valueOf(numValueOf2.intValue()), Integer.valueOf(i11));
                } else {
                    pairM97108a = null;
                }
            } else {
                pairM97108a = null;
            }
            if (pairM97108a != null) {
                arrayList3.add(pairM97108a);
            }
            i11 = i12;
        }
        Map mapS = MapsKt.m97584s(arrayList3);
        List<UGCImmVideo> list2 = listI0;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.m97516v(list2, 10));
        for (UGCImmVideo uGCImmVideo2 : list2) {
            UGCVideo ugcVideo7 = uGCImmVideo2.getUgcVideo();
            int iVideoUGCPosition2 = ugcVideo7 != null ? ugcVideo7.videoUGCPosition() : -1;
            Iterator it3 = mapS.entrySet().iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while ((((Number) ((Map.Entry) next).getKey()).intValue() >= iVideoUGCPosition2) == false);
            Map.Entry entry = (Map.Entry) next;
            arrayList4.add(TuplesKt.m97108a(uGCImmVideo2, Integer.valueOf(entry != null ? ((Number) entry.getValue()).intValue() : data.size())));
        }
        for (Pair pair : CollectionsKt.m97326D0(arrayList4)) {
            c20143a.mo36199n(((Number) pair.component2()).intValue(), (UGCImmVideo) pair.component1());
        }
        C27941f c27941fM36186h2 = c20143a.m36186h0();
        if (!isLoadDown) {
            c27941fM36186h2 = null;
        }
        if (c27941fM36186h2 == null) {
            c20143a.m36203o0().m108678e(false);
        } else if (hasMore) {
            c27941fM36186h2.m108667s();
        } else {
            C27941f.m108652u(c27941fM36186h2, false, 1, null);
            c27941fM36186h2.m108673z(false);
        }
        UGCImmVideo uGCImmVideo3 = (UGCImmVideo) CollectionsKt.m97361k0(c20143a.getData());
        if (uGCImmVideo3 != null && (ugcVideo2 = uGCImmVideo3.getUgcVideo()) != null) {
            Integer numValueOf3 = Integer.valueOf(ugcVideo2.videoUGCPosition());
            if ((numValueOf3.intValue() > 1 ? numValueOf3 : null) != null) {
                c20143a.m36203o0().m108677d(true);
            }
        }
        C26866a.a aVar = C26866a.f81698a;
        int size = listI0.size();
        int size2 = c20143a.getData().size();
        UGCImmVideo uGCImmVideo4 = (UGCImmVideo) CollectionsKt.m97361k0(c20143a.getData());
        if (uGCImmVideo4 != null && (ugcVideo = uGCImmVideo4.getUgcVideo()) != null) {
            iVideoUGCPosition = ugcVideo.videoUGCPosition();
        }
        C26866a.a.m104898f(aVar, "UGCImmVideoDetail", "insertCollectionList: inserted=" + size + ", adapterSize=" + size2 + ", firstPosition=" + iVideoUGCPosition, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final void m83688S0(UGCImmVideoDetailFragment uGCImmVideoDetailFragment, UGCImmVideoContent uGCImmVideoContent) {
        C27941f c27941fM36186h0;
        Map mapMo102959a;
        List<Object> data;
        UGCImmVideo uGCImmVideo;
        UGCVideo ugcVideo;
        UGCVideo ugcVideo2;
        List<UGCImmVideo> list = uGCImmVideoContent != null ? uGCImmVideoContent.getList() : null;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "UGCImmVideoDetail", "listObserver: " + (list != null ? Integer.valueOf(list.size()) : null), false, 4, null);
        List<UGCImmVideo> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        boolean zM84203Y0 = uGCImmVideoDetailFragment.m83679D0().m84203Y0();
        boolean zIsLoadDown = uGCImmVideoContent.isLoadDown();
        UGCImmVideo uGCImmVideo2 = (UGCImmVideo) CollectionsKt.m97361k0(list);
        int iVideoUGCPosition = (uGCImmVideo2 == null || (ugcVideo2 = uGCImmVideo2.getUgcVideo()) == null) ? -1 : ugcVideo2.videoUGCPosition();
        C20143a c20143a = uGCImmVideoDetailFragment.detailAdapter;
        C26866a.a.m104898f(aVar, "UGCImmVideoDetail", "listObserver, isCollection: " + zM84203Y0 + ", isLoadDown:" + zIsLoadDown + ", firstPosition:" + iVideoUGCPosition + ", adapterFirstPosition:" + ((c20143a == null || (data = c20143a.getData()) == null || (uGCImmVideo = (UGCImmVideo) CollectionsKt.m97361k0(data)) == null || (ugcVideo = uGCImmVideo.getUgcVideo()) == null) ? -1 : ugcVideo.videoUGCPosition()) + " ", false, 4, null);
        if (zM84203Y0) {
            boolean zIsLoadDown2 = uGCImmVideoContent.isLoadDown();
            Pager pager = uGCImmVideoContent.getPager();
            uGCImmVideoDetailFragment.m83687R0(list, zIsLoadDown2, pager != null ? Intrinsics.m97797c(pager.getHasMore(), Boolean.TRUE) : false);
        } else {
            C20143a c20143a2 = uGCImmVideoDetailFragment.detailAdapter;
            if (c20143a2 != null && (c27941fM36186h0 = c20143a2.m36186h0()) != null) {
                Pager pager2 = uGCImmVideoContent.getPager();
                if (pager2 != null ? Intrinsics.m97797c(pager2.getHasMore(), Boolean.TRUE) : false) {
                    c27941fM36186h0.m108667s();
                } else {
                    c27941fM36186h0.m108668t(true);
                    c27941fM36186h0.m108673z(false);
                }
            }
            C20143a c20143a3 = uGCImmVideoDetailFragment.detailAdapter;
            if (c20143a3 != null) {
                c20143a3.mo36208q(list2);
            }
        }
        for (UGCImmVideo uGCImmVideo3 : list) {
            C23403e mediaSource = uGCImmVideo3.toMediaSource();
            if (mediaSource != null) {
                InterfaceC26373f interfaceC26373f = uGCImmVideoDetailFragment.orPlayer;
                boolean zContainsKey = (interfaceC26373f == null || (mapMo102959a = interfaceC26373f.mo102959a()) == null) ? false : mapMo102959a.containsKey(mediaSource.m92929e());
                C26866a.a aVar2 = C26866a.f81698a;
                UGCVideo ugcVideo3 = uGCImmVideo3.getUgcVideo();
                C26866a.a.m104898f(aVar2, "UGCImmVideoDetail", "listAddDataSource----isCollection:" + zM84203Y0 + " ,inPlayerList:" + zContainsKey + ", Position:" + (ugcVideo3 != null ? ugcVideo3.videoUGCPosition() : -1), false, 4, null);
                if (uGCImmVideoDetailFragment.isNewPlayer || !zContainsKey) {
                    InterfaceC26373f interfaceC26373f2 = uGCImmVideoDetailFragment.orPlayer;
                    if (interfaceC26373f2 != null) {
                        interfaceC26373f2.addDataSource(mediaSource);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: T0 */
    private final void m83689T0() {
        String str = this.firstUgcVideoId;
        if (str != null) {
            if (StringsKt.m98160q0(str)) {
                str = null;
            }
            if (str != null) {
                m83679D0().m84189J0(str, this.collectionId);
                return;
            }
        }
        String str2 = this.subjectId;
        if (str2 != null) {
            String str3 = StringsKt.m98160q0(str2) ? null : str2;
            if (str3 != null) {
                m83679D0().m84190K0(str3);
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    private final void m83690U0() {
        List<Object> data;
        UGCImmVideo uGCImmVideo;
        UGCVideo ugcVideo;
        String str = this.collectionId;
        int iVideoUGCPosition = 0;
        if (str == null || str.length() == 0) {
            C26866a.a.m104898f(C26866a.f81698a, "UGCImmVideoDetail", "loadMoreData, getImmVideoRecommentList, ugcVideoId:" + this.firstUgcVideoId, false, 4, null);
            m83679D0().m84197S0(false, this.firstUgcVideoId);
            return;
        }
        C20143a c20143a = this.detailAdapter;
        if (c20143a != null && (data = c20143a.getData()) != null && (uGCImmVideo = (UGCImmVideo) CollectionsKt.m97372v0(data)) != null && (ugcVideo = uGCImmVideo.getUgcVideo()) != null) {
            iVideoUGCPosition = ugcVideo.videoUGCPosition();
        }
        int i11 = iVideoUGCPosition + 1;
        int i12 = iVideoUGCPosition + 9;
        C26866a.a.m104898f(C26866a.f81698a, "UGCImmVideoDetail", "loadMoreData, startPosition:" + i11 + ", endPosition:" + i12, false, 4, null);
        UGCImmVideoDetailViewModel uGCImmVideoDetailViewModelM83679D0 = m83679D0();
        String str2 = this.collectionId;
        Intrinsics.m97799e(str2);
        UGCImmVideoDetailViewModel.m84170Q0(uGCImmVideoDetailViewModelM83679D0, str2, i11, i12, true, false, 16, null);
    }

    /* JADX INFO: renamed from: V0 */
    private final void m83691V0() {
        Navigator.m61845x(TheRouter.m61773c("/download/ugc_my_downloads").m61852F("main_tab_index", 0), requireContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final void m83692W0(final UGCImmVideoDetailFragment uGCImmVideoDetailFragment, int i11) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        List<Object> data;
        C20143a c20143a = uGCImmVideoDetailFragment.detailAdapter;
        final int i12 = -1;
        if (c20143a != null && (data = c20143a.getData()) != null) {
            Iterator<Object> it = data.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                UGCVideo ugcVideo = ((UGCImmVideo) it.next()).getUgcVideo();
                if (ugcVideo != null && ugcVideo.videoUGCPosition() == i11) {
                    i12 = i13;
                    break;
                }
                i13++;
            }
        }
        if (i12 < 0) {
            return;
        }
        C26866a.a.m104905r(C26866a.f81698a, "UGCImmVideoDetail", new String[]{"scrollToPosition:" + i12 + ", ep:" + i11}, false, 4, null);
        try {
            Result.Companion companion = Result.INSTANCE;
            C28446f mViewBinding = uGCImmVideoDetailFragment.getMViewBinding();
            if (mViewBinding != null && (recyclerView2 = mViewBinding.f87290f) != null) {
                recyclerView2.scrollToPosition(i12);
            }
            C28446f mViewBinding2 = uGCImmVideoDetailFragment.getMViewBinding();
            Result.m112707constructorimpl((mViewBinding2 == null || (recyclerView = mViewBinding2.f87290f) == null) ? null : Boolean.valueOf(recyclerView.post(new Runnable() { // from class: com.transsion.ugcvideodetail.fragment.l
                @Override // java.lang.Runnable
                public final void run() {
                    UGCImmVideoDetailFragment.m83693X0(this.f64287a, i12);
                }
            })));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final void m83693X0(UGCImmVideoDetailFragment uGCImmVideoDetailFragment, int i11) {
        PagerLayoutManager pagerLayoutManager = uGCImmVideoDetailFragment.pagerLayoutManager;
        if (pagerLayoutManager != null) {
            View viewM61974U = pagerLayoutManager.m61974U();
            C26866a.a aVar = C26866a.f81698a;
            C26866a.a.m104905r(aVar, "UGCImmVideoDetail", new String[]{"post   itemView:" + viewM61974U}, false, 4, null);
            if (viewM61974U != null) {
                C26866a.a.m104905r(aVar, "UGCImmVideoDetail", new String[]{"post   itemView: 22222"}, false, 4, null);
                C20311b c20311b = uGCImmVideoDetailFragment.pagerChangeControl;
                if (c20311b != null) {
                    c20311b.mo84072d(i11, true, viewM61974U);
                    return;
                }
                return;
            }
            int childCount = pagerLayoutManager.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = pagerLayoutManager.getChildAt(i12);
                if (childAt != null && pagerLayoutManager.getPosition(childAt) == i11) {
                    C20311b c20311b2 = uGCImmVideoDetailFragment.pagerChangeControl;
                    if (c20311b2 != null) {
                        c20311b2.mo84072d(i11, true, childAt);
                    }
                    C26866a.a.m104905r(C26866a.f81698a, "UGCImmVideoDetail", new String[]{"post   itemView: 11111"}, false, 4, null);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m83694Z0() {
        Runnable runnable = this.downloadPopHideRunnable;
        if (runnable != null) {
            this.downloadPopHandler.removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: com.transsion.ugcvideodetail.fragment.c
            @Override // java.lang.Runnable
            public final void run() {
                UGCImmVideoDetailFragment.m83695a1(this.f64253a);
            }
        };
        this.downloadPopHideRunnable = runnable2;
        Handler handler = this.downloadPopHandler;
        Intrinsics.m97799e(runnable2);
        handler.postDelayed(runnable2, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final void m83695a1(UGCImmVideoDetailFragment uGCImmVideoDetailFragment) {
        C28453m c28453m;
        FrameLayout root;
        C28446f mViewBinding = uGCImmVideoDetailFragment.getMViewBinding();
        if (mViewBinding == null || (c28453m = mViewBinding.f87288d) == null || (root = c28453m.getRoot()) == null) {
            return;
        }
        AbstractC26006c.m102054g(root);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final Unit m83696d1(UGCImmVideoDetailFragment uGCImmVideoDetailFragment, DownloadBean downloadBean) {
        uGCImmVideoDetailFragment.m83698f1(downloadBean);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: e1 */
    private final void m83697e1() {
        C27942g c27942gM36203o0;
        C27942g c27942gM36203o1;
        List<Object> data;
        UGCImmVideo uGCImmVideo;
        UGCVideo ugcVideo;
        C20143a c20143a = this.detailAdapter;
        int iVideoUGCPosition = (c20143a == null || (data = c20143a.getData()) == null || (uGCImmVideo = (UGCImmVideo) CollectionsKt.m97372v0(data)) == null || (ugcVideo = uGCImmVideo.getUgcVideo()) == null) ? 1 : ugcVideo.videoUGCPosition();
        if (iVideoUGCPosition <= 1) {
            C20143a c20143a2 = this.detailAdapter;
            if (c20143a2 == null || (c27942gM36203o1 = c20143a2.m36203o0()) == null) {
                return;
            }
            c27942gM36203o1.m108677d(false);
            return;
        }
        C20143a c20143a3 = this.detailAdapter;
        if (c20143a3 != null && (c27942gM36203o0 = c20143a3.m36203o0()) != null) {
            c27942gM36203o0.m108678e(true);
        }
        int iMax = Math.max(iVideoUGCPosition - 9, 1);
        C26866a.a.m104898f(C26866a.f81698a, "UGCImmVideoDetail", "upFetchData, firstPosition:" + iVideoUGCPosition + ", startPosition:" + iMax, false, 4, null);
        UGCImmVideoDetailViewModel uGCImmVideoDetailViewModelM83679D0 = m83679D0();
        String str = this.collectionId;
        Intrinsics.m97799e(str);
        UGCImmVideoDetailViewModel.m84170Q0(uGCImmVideoDetailViewModelM83679D0, str, iMax, iVideoUGCPosition + (-1), false, false, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public final void m83698f1(DownloadBean bean) {
        String resourceId;
        C28453m c28453m;
        AppCompatTextView appCompatTextView;
        String str = this.downloadingUgcVideoId;
        if (str == null) {
            return;
        }
        if (bean == null || (resourceId = bean.getUgcVideoId()) == null) {
            resourceId = bean != null ? bean.getResourceId() : null;
            if (resourceId == null) {
                return;
            }
        }
        if (Intrinsics.m97797c(resourceId, str)) {
            long jM = bean != null ? RangesKt.m97943m(bean.getProgress(), 0L, 100L) : 0L;
            C28446f mViewBinding = getMViewBinding();
            if (mViewBinding == null || (c28453m = mViewBinding.f87288d) == null || (appCompatTextView = c28453m.f87361c) == null) {
                return;
            }
            appCompatTextView.setText(jM + "%");
        }
    }

    /* JADX INFO: renamed from: g1 */
    private final void m83699g1(UGCVideo video) {
        C24655b logViewConfig;
        HashMap mapM96844g;
        HashMap mapM96844g2;
        C24655b logViewConfig2;
        HashMap mapM96844g3;
        C24655b logViewConfig3;
        HashMap mapM96844g4;
        HashMap mapM96844g5;
        HashMap mapM96844g6;
        HashMap mapM96844g7;
        HashMap mapM96844g8;
        String collectionId;
        HashMap mapM96844g9;
        C24655b logViewConfig4 = getLogViewConfig();
        if (logViewConfig4 != null) {
            String ops = video.getOps();
            if (ops == null) {
                ops = this.ops;
            }
            logViewConfig4.m96851n(ops);
        }
        C24655b logViewConfig5 = getLogViewConfig();
        if (logViewConfig5 != null && (mapM96844g9 = logViewConfig5.m96844g()) != null) {
            String ugcVideoId = video.getUgcVideoId();
            if (ugcVideoId == null) {
                ugcVideoId = "";
            }
        }
        C24655b logViewConfig6 = getLogViewConfig();
        if (logViewConfig6 != null && (mapM96844g8 = logViewConfig6.m96844g()) != null) {
            UGCVideoBelongToCollection belongToCollection = video.getBelongToCollection();
            if ((belongToCollection == null || (collectionId = belongToCollection.getCollectionId()) == null) && (collectionId = this.collectionId) == null) {
                collectionId = "";
            }
        }
        C24655b logViewConfig7 = getLogViewConfig();
        if (logViewConfig7 != null && (mapM96844g7 = logViewConfig7.m96844g()) != null) {
            String subjectId = video.getSubjectId();
        }
        C24655b logViewConfig8 = getLogViewConfig();
        if (logViewConfig8 != null && (mapM96844g6 = logViewConfig8.m96844g()) != null) {
        }
        C24655b logViewConfig9 = getLogViewConfig();
        if (logViewConfig9 != null && (mapM96844g5 = logViewConfig9.m96844g()) != null) {
            String str = this.collectionId;
        }
        m83715y0();
        String str2 = this.fromOptId;
        if (str2 != null && (logViewConfig3 = getLogViewConfig()) != null && (mapM96844g4 = logViewConfig3.m96844g()) != null) {
        }
        String str3 = this.previousPageVideoId;
        if (str3 != null && (logViewConfig2 = getLogViewConfig()) != null && (mapM96844g3 = logViewConfig2.m96844g()) != null) {
        }
        C24655b logViewConfig10 = getLogViewConfig();
        if (logViewConfig10 != null && (mapM96844g2 = logViewConfig10.m96844g()) != null) {
        }
        String str4 = this.previousTrackId;
        if (str4 != null && (logViewConfig = getLogViewConfig()) != null && (mapM96844g = logViewConfig.m96844g()) != null) {
        }
        C24655b logViewConfig11 = getLogViewConfig();
        if (logViewConfig11 != null) {
            logViewConfig11.m96848k(true);
        }
    }

    private final void initAdapter() {
        C20143a c20143a = new C20143a(this, this.trackId, this.previousTrackId, this.previousPageVideoId);
        c20143a.m36186h0().m108655C(new UGCImmVideoLoadMoreView());
        c20143a.m36186h0().m108673z(true);
        c20143a.m36186h0().m108657E(3);
        c20143a.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.ugcvideodetail.fragment.j
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                UGCImmVideoDetailFragment.m83682M0(this.f64280a);
            }
        });
        c20143a.m36203o0().m108677d(false);
        c20143a.m36203o0().m108676c(2);
        c20143a.m36203o0().m108675b(new InterfaceC27569g() { // from class: com.transsion.ugcvideodetail.fragment.k
            @Override // p765s6.InterfaceC27569g
            /* JADX INFO: renamed from: a */
            public final void mo81168a() {
                UGCImmVideoDetailFragment.m83683N0(this.f64283a);
            }
        });
        this.detailAdapter = c20143a;
    }

    /* JADX INFO: renamed from: x0 */
    private final void m83714x0() {
        UGCVideo ugcVideo;
        UGCImmVideo uGCImmVideo = (UGCImmVideo) m83679D0().m84191L0().m14847f();
        C20143a c20143a = this.detailAdapter;
        if (c20143a != null) {
            int iM36184g0 = c20143a.m36184g0(uGCImmVideo) + 1;
            C20143a c20143a2 = this.detailAdapter;
            if (iM36184g0 >= (c20143a2 != null ? c20143a2.getItemCount() : 0)) {
                return;
            }
            C26866a.a.m104898f(C26866a.f81698a, "UGCImmVideoDetail", "autoPlayNext", false, 4, null);
            C20143a c20143a3 = this.detailAdapter;
            UGCImmVideo uGCImmVideo2 = c20143a3 != null ? (UGCImmVideo) c20143a3.m36182f0(iM36184g0) : null;
            if (uGCImmVideo2 == null || (ugcVideo = uGCImmVideo2.getUgcVideo()) == null) {
                return;
            }
            m83679D0().m84194O0().mo14858q(Integer.valueOf(ugcVideo.videoUGCPosition()));
        }
    }

    /* JADX INFO: renamed from: y0 */
    private final void m83715y0() {
        HashMap mapM96844g;
        if (this.pageLoadStartTime > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.pageLoadStartTime;
            C24655b logViewConfig = getLogViewConfig();
            if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
            }
            C26866a.a.m104898f(C26866a.f81698a, "UGCImmVideoDetail", "load_duration: " + jCurrentTimeMillis + " ms", false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m83716z0(UGCImmVideoDetailFragment uGCImmVideoDetailFragment, UGCImmVideo uGCImmVideo) {
        UGCVideo ugcVideo;
        UGCVideoBelongToCollection belongToCollection;
        InterfaceC26373f interfaceC26373f;
        Map mapMo102959a;
        C20143a c20143a;
        C27942g c27942gM36203o0;
        UGCVideoBelongToCollection belongToCollection2;
        Integer videoNum;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "UGCImmVideoDetail", "detailObserver: " + uGCImmVideo, false, 4, null);
        if (uGCImmVideo != null) {
            UGCVideo ugcVideo2 = uGCImmVideo.getUgcVideo();
            String ugcVideoId = ugcVideo2 != null ? ugcVideo2.getUgcVideoId() : null;
            UGCVideo ugcVideo3 = uGCImmVideo.getUgcVideo();
            String ops = ugcVideo3 != null ? ugcVideo3.getOps() : null;
            if ((ops == null || ops.length() == 0) && (ugcVideo = uGCImmVideo.getUgcVideo()) != null) {
                ugcVideo.setOps(uGCImmVideoDetailFragment.ops);
            }
            uGCImmVideoDetailFragment.firstUgcVideo = uGCImmVideo;
            UGCVideo ugcVideo4 = uGCImmVideo.getUgcVideo();
            uGCImmVideoDetailFragment.firstUgcVideoId = ugcVideoId;
            uGCImmVideoDetailFragment.m83679D0().m84259D().mo14858q(uGCImmVideoDetailFragment.firstUgcVideoId);
            String str = uGCImmVideoDetailFragment.collectionId;
            if (str == null || str.length() == 0) {
                UGCVideo ugcVideo5 = uGCImmVideo.getUgcVideo();
                uGCImmVideoDetailFragment.collectionId = (ugcVideo5 == null || (belongToCollection = ugcVideo5.getBelongToCollection()) == null) ? null : belongToCollection.getCollectionId();
                uGCImmVideoDetailFragment.m83679D0().m84257B().mo14858q(uGCImmVideoDetailFragment.collectionId);
            }
            UGCVideo ugcVideo6 = uGCImmVideo.getUgcVideo();
            boolean zContainsKey = false;
            if (((ugcVideo6 == null || (belongToCollection2 = ugcVideo6.getBelongToCollection()) == null || (videoNum = belongToCollection2.getVideoNum()) == null) ? 0 : videoNum.intValue()) <= 1) {
                uGCImmVideoDetailFragment.collectionId = null;
            }
            String str2 = uGCImmVideoDetailFragment.collectionId;
            if (!(str2 == null || str2.length() == 0)) {
                if ((ugcVideo4 != null ? ugcVideo4.videoUGCPosition() : 1) > 1 && (c20143a = uGCImmVideoDetailFragment.detailAdapter) != null && (c27942gM36203o0 = c20143a.m36203o0()) != null) {
                    c27942gM36203o0.m108677d(true);
                }
            }
            UGCImmVideoDetailViewModel uGCImmVideoDetailViewModelM83679D0 = uGCImmVideoDetailFragment.m83679D0();
            String str3 = uGCImmVideoDetailFragment.collectionId;
            uGCImmVideoDetailViewModelM83679D0.m84205b1(!(str3 == null || str3.length() == 0));
            C20143a c20143a2 = uGCImmVideoDetailFragment.detailAdapter;
            if (c20143a2 != null) {
                c20143a2.mo36205p(uGCImmVideo);
            }
            UGCVideo ugcVideo7 = uGCImmVideo.getUgcVideo();
            if (ugcVideo7 != null) {
                uGCImmVideoDetailFragment.m83699g1(ugcVideo7);
            }
            C23403e mediaSource = uGCImmVideo.toMediaSource();
            if (mediaSource != null) {
                InterfaceC26373f interfaceC26373f2 = uGCImmVideoDetailFragment.orPlayer;
                if (interfaceC26373f2 != null && (mapMo102959a = interfaceC26373f2.mo102959a()) != null) {
                    zContainsKey = mapMo102959a.containsKey(mediaSource.m92929e());
                }
                boolean z11 = zContainsKey;
                C26866a.a.m104898f(aVar, "UGCImmVideoDetail", "detailAddDataSource---- ,inPlayerList:" + z11, false, 4, null);
                if ((uGCImmVideoDetailFragment.isNewPlayer || !z11) && (interfaceC26373f = uGCImmVideoDetailFragment.orPlayer) != null) {
                    interfaceC26373f.addDataSource(mediaSource);
                }
                InterfaceC26373f interfaceC26373f3 = uGCImmVideoDetailFragment.orPlayer;
                if (interfaceC26373f3 != null) {
                    interfaceC26373f3.prepare();
                }
                InterfaceC26373f interfaceC26373f4 = uGCImmVideoDetailFragment.orPlayer;
                if (interfaceC26373f4 != null) {
                    interfaceC26373f4.play();
                }
            }
        }
    }

    /* JADX INFO: renamed from: C0, reason: from getter */
    public final String getCollectionId() {
        return this.collectionId;
    }

    /* JADX INFO: renamed from: F0, reason: from getter */
    public final String getLastPageFrom() {
        return this.lastPageFrom;
    }

    /* JADX INFO: renamed from: G0, reason: from getter */
    public final String getPreviousPageVideoId() {
        return this.previousPageVideoId;
    }

    /* JADX INFO: renamed from: H0, reason: from getter */
    public final String getPreviousTrackId() {
        return this.previousTrackId;
    }

    /* JADX INFO: renamed from: I0, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public C28446f getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28446f c28446fM109895c = C28446f.m109895c(inflater);
        Intrinsics.m97801g(c28446fM109895c, "inflate(...)");
        return c28446fM109895c;
    }

    /* JADX INFO: renamed from: L0 */
    public final AppCompatImageView m83723L0() {
        C28446f mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            return mViewBinding.f87287c;
        }
        return null;
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m83724Y0() {
        InterfaceC26373f interfaceC26373f = this.orPlayer;
        if (interfaceC26373f != null) {
            interfaceC26373f.release();
        }
        C20311b c20311b = this.pagerChangeControl;
        if (c20311b != null) {
            c20311b.m84074g();
        }
        m83680E0().mo88686q(this.downloadListener);
        Runnable runnable = this.downloadPopHideRunnable;
        if (runnable != null) {
            this.downloadPopHandler.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: renamed from: b1 */
    public final void m83725b1(boolean z11) {
        this.isClickPause = z11;
    }

    /* JADX INFO: renamed from: c1 */
    public final void m83726c1(String ugcVideoId) {
        C28453m c28453m;
        if (ugcVideoId == null || ugcVideoId.length() == 0) {
            return;
        }
        this.downloadingUgcVideoId = ugcVideoId;
        C28446f mViewBinding = getMViewBinding();
        if (mViewBinding == null || (c28453m = mViewBinding.f87288d) == null) {
            return;
        }
        FrameLayout root = c28453m.getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        AbstractC26006c.m102058k(root);
        c28453m.f87361c.setText("0%");
        m83680E0().mo88688s(ugcVideoId, new Function1() { // from class: com.transsion.ugcvideodetail.fragment.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UGCImmVideoDetailFragment.m83696d1(this.f64250a, (DownloadBean) obj);
            }
        });
        m83694Z0();
        C24662i.f75350a.m96883r("/ugc_video/immersive_detail", MapsKt.m97551f(TuplesKt.m97108a("dialog_name", "download_view")));
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d c26907d) {
        InterfaceC16633f.a.m72423a(this, z11, i11, i12, c26907d);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    public final void hideLoading() {
        ProgressBar progressBar;
        C28446f mViewBinding = getMViewBinding();
        if (mViewBinding != null && (progressBar = mViewBinding.f87289e) != null) {
            AbstractC26006c.m102054g(progressBar);
        }
        HandlerC20176c handlerC20176c = this.loadingHandler;
        handlerC20176c.removeMessages(handlerC20176c.m83729b());
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        m83680E0().mo88675g(this.downloadListener);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void initPlayer() {
        InterfaceC16633f.a.m72424b(this);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        AppCompatImageView appCompatImageView;
        FrameLayout frameLayout;
        C28453m c28453m;
        FrameLayout root;
        C28453m c28453m2;
        FrameLayout root2;
        C28453m c28453m3;
        FrameLayout root3;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        this.pageLoadStartTime = System.currentTimeMillis();
        initAdapter();
        m83684O0();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        PagerLayoutManager pagerLayoutManager = new PagerLayoutManager(fragmentActivityRequireActivity);
        pagerLayoutManager.m61976Y(true);
        this.pagerLayoutManager = pagerLayoutManager;
        C20311b c20311b = new C20311b(this, this.detailAdapter, this.orPlayer, this.orPlayerView, this.pagerLayoutManager);
        this.pagerChangeControl = c20311b;
        PagerLayoutManager pagerLayoutManager2 = this.pagerLayoutManager;
        if (pagerLayoutManager2 != null) {
            pagerLayoutManager2.m61977Z(c20311b);
        }
        C28446f mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView2 = mViewBinding.f87290f) != null) {
            recyclerView2.setLayoutManager(this.pagerLayoutManager);
        }
        C28446f mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (recyclerView = mViewBinding2.f87290f) != null) {
            recyclerView.setAdapter(this.detailAdapter);
        }
        C28446f mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (c28453m3 = mViewBinding3.f87288d) != null && (root3 = c28453m3.getRoot()) != null) {
            AbstractC26006c.m102054g(root3);
        }
        C28446f mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (c28453m2 = mViewBinding4.f87288d) != null && (root2 = c28453m2.getRoot()) != null) {
            AbstractC26006c.m102052e(root2);
        }
        C28446f mViewBinding5 = getMViewBinding();
        if (mViewBinding5 != null && (c28453m = mViewBinding5.f87288d) != null && (root = c28453m.getRoot()) != null) {
            root.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.fragment.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UGCImmVideoDetailFragment.m83685P0(this.f64273a, view);
                }
            });
        }
        C28446f mViewBinding6 = getMViewBinding();
        if (mViewBinding6 != null && (frameLayout = mViewBinding6.f87286b) != null) {
            AbstractC26006c.m102052e(frameLayout);
        }
        C28446f mViewBinding7 = getMViewBinding();
        if (mViewBinding7 == null || (appCompatImageView = mViewBinding7.f87287c) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.fragment.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCImmVideoDetailFragment.m83686Q0(this.f64277a, view);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m83679D0().m84259D().mo14858q(this.firstUgcVideoId);
        m83679D0().m84257B().mo14858q(this.collectionId);
        m83679D0().m84264J().m14851j(this, this.historyObserver);
        m83679D0().m84188I0().m14851j(this, this.detailObserver);
        m83679D0().m84196R0().m14851j(this, this.listObserver);
        m83679D0().m84194O0().m14851j(this, this.playingEpObserver);
        m83679D0().m84207d1(this.ops);
        m83679D0().m84287j0(this.trackId);
        m83679D0().m84285h0(this.previousTrackId);
        m83679D0().m84284g0(this.previousPageVideoId);
        m83678B0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void logPause() {
        super.logPause();
        if (this.resumeTimeStamp != 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.resumeTimeStamp;
            C26866a.a.m104905r(C26866a.f81698a, "Report", new String[]{"UGCImmVideoDetail fb log duration:" + jElapsedRealtime}, false, 4, null);
            C14486e.f50941a.m65288n("UGCImmVideoDetailFragment", Long.valueOf(jElapsedRealtime), getContext());
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void logResume() {
        super.logResume();
        this.resumeTimeStamp = SystemClock.elapsedRealtime();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("/ugc_video/immersive_detail", false, 2, null);
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
        if (C14496b.f50966a.m65344b().getBoolean("KEY_UGC_IMM_VIDEO_AUTO_PLAY", false)) {
            m83714x0();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, p743rh.InterfaceC27288n
    public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
        InterfaceC26373f interfaceC26373f;
        UGCImmVideoItemView uGCImmVideoItemViewM84073f;
        Intrinsics.m97802h(network, "network");
        Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
        super.onConnected(network, networkCapabilities);
        C26866a.a.m104898f(C26866a.f81698a, "UGCImmVideoDetail", "onConnected", false, 4, null);
        m83689T0();
        C20311b c20311b = this.pagerChangeControl;
        if (c20311b != null && (uGCImmVideoItemViewM84073f = c20311b.m84073f()) != null) {
            uGCImmVideoItemViewM84073f.onNetConnect();
        }
        if (this.errorInfo == null || (interfaceC26373f = this.orPlayer) == null) {
            return;
        }
        interfaceC26373f.prepare();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
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

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onMediaItemTransition(String uuid) {
        UGCImmVideoItemView uGCImmVideoItemViewM84073f;
        C23403e mediaSource;
        UGCImmVideo uGCImmVideo = this.firstUgcVideo;
        if (Intrinsics.m97797c(uuid, (uGCImmVideo == null || (mediaSource = uGCImmVideo.toMediaSource()) == null) ? null : mediaSource.m92929e())) {
            C26866a.a.m104905r(C26866a.f81698a, "UGCImmVideoDetail", new String[]{"onMediaItemTransition ：" + uuid + ",是当前视频，跳过"}, false, 4, null);
            return;
        }
        boolean z11 = C14496b.f50966a.m65344b().getBoolean("KEY_UGC_IMM_VIDEO_AUTO_PLAY", false);
        C26866a.a.m104898f(C26866a.f81698a, "UGCImmVideoDetail", "onMediaItemTransition autoPlay:" + z11 + ", uuid：" + uuid, false, 4, null);
        if (z11) {
            m83714x0();
            C20311b c20311b = this.pagerChangeControl;
            if (c20311b == null || (uGCImmVideoItemViewM84073f = c20311b.m84073f()) == null) {
                return;
            }
            uGCImmVideoItemViewM84073f.onItemViewMediaItemTransition();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        UGCImmVideoItemView uGCImmVideoItemViewM84073f;
        super.onPause();
        C20311b c20311b = this.pagerChangeControl;
        if (c20311b == null || (uGCImmVideoItemViewM84073f = c20311b.m84073f()) == null) {
            return;
        }
        uGCImmVideoItemViewM84073f.onPagePause();
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

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        UGCImmVideoItemView uGCImmVideoItemViewM84073f;
        super.onResume();
        C20311b c20311b = this.pagerChangeControl;
        if (c20311b == null || (uGCImmVideoItemViewM84073f = c20311b.m84073f()) == null) {
            return;
        }
        uGCImmVideoItemViewM84073f.onPageResume();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onSetDataSource() {
        InterfaceC16633f.a.m72413B(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        UGCImmVideoItemView uGCImmVideoItemViewM84073f;
        super.onStop();
        C20311b c20311b = this.pagerChangeControl;
        if (c20311b == null || (uGCImmVideoItemViewM84073f = c20311b.m84073f()) == null) {
            return;
        }
        uGCImmVideoItemViewM84073f.onPageStop();
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
        InterfaceC16633f.a.m72417F(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoSizeChanged(int i11, int i12) {
        InterfaceC16633f.a.m72419H(this, i11, i12);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoStart(C23403e c23403e) {
        InterfaceC16633f.a.m72420I(this, c23403e);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        super.receiveArguments();
        this.lastPageFrom = C24662i.f75350a.m96877i();
        Bundle arguments = getArguments();
        this.firstUgcVideoId = arguments != null ? arguments.getString("id") : null;
        Bundle arguments2 = getArguments();
        this.collectionId = arguments2 != null ? arguments2.getString("collection_id") : null;
        Bundle arguments3 = getArguments();
        this.subjectId = arguments3 != null ? arguments3.getString("subject_id") : null;
        Bundle arguments4 = getArguments();
        this.ugcVideoType = arguments4 != null ? arguments4.getString("ugcCategory") : null;
        Bundle arguments5 = getArguments();
        this.ops = arguments5 != null ? arguments5.getString("ops") : null;
        Bundle arguments6 = getArguments();
        this.previousPageVideoId = arguments6 != null ? arguments6.getString("parent_video_id") : null;
        Bundle arguments7 = getArguments();
        this.tabId = arguments7 != null ? arguments7.getString("tab_id") : null;
        Bundle arguments8 = getArguments();
        this.withoutHistory = arguments8 != null ? arguments8.getBoolean("ugc_without_history", false) : false;
        Bundle arguments9 = getArguments();
        this.fromOptId = arguments9 != null ? arguments9.getString("from_opt_id") : null;
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96847j(this.lastPageFrom);
        }
        C26866a.a.m104898f(C26866a.f81698a, "UGCImmVideoDetail", "receiveArguments: collectionId:" + this.collectionId + ", ugcVideoId=" + this.firstUgcVideoId + ", previousPageVideoId=" + this.previousPageVideoId, false, 4, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void setOnSeekCompleteListener() {
        InterfaceC16633f.a.m72422K(this);
    }

    public final void startLoading() {
        HandlerC20176c handlerC20176c = this.loadingHandler;
        if (handlerC20176c.hasMessages(handlerC20176c.m83729b())) {
            return;
        }
        HandlerC20176c handlerC20176c2 = this.loadingHandler;
        handlerC20176c2.sendEmptyMessageDelayed(handlerC20176c2.m83729b(), this.loadingHandler.m83728a());
    }
}
