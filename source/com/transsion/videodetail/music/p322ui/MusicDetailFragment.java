package com.transsion.videodetail.music.p322ui;

import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.AbstractC0256u;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import co.InterfaceC5146a;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.AbstractC5790i;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.view.bubbleview.BubbleTextView;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.base.image.blurhash.C14291e;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.music.MusicLikedDbBean;
import com.transsion.baselib.p291db.video.VideoDetailPlayBean;
import com.transsion.baselib.report.C14492k;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.music.MusicFloatManager;
import com.transsion.baseui.util.AbstractC14556b;
import com.transsion.baseui.widget.GradientTextView;
import com.transsion.bean.GameInfoType;
import com.transsion.core.utils.C14752e;
import com.transsion.moviedetail.R$string;
import com.transsion.moviedetail.fragment.ResourceDetectorEmptyFragment;
import com.transsion.moviedetail.fragment.RestrictTipsDialog;
import com.transsion.moviedetail.viewmodel.MovieDetailViewModel;
import com.transsion.moviedetailapi.DownloadItem;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.DubsInfo;
import com.transsion.moviedetailapi.bean.PreVideoAddress;
import com.transsion.moviedetailapi.bean.ResourceDetectors;
import com.transsion.moviedetailapi.bean.ResourcesSeasonList;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.SubjectGameInfo;
import com.transsion.moviedetailapi.bean.Trailer;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.player.longvideo.constants.LongVodPageType;
import com.transsion.player.longvideo.p302ui.LongVodPlayerView;
import com.transsion.player.longvideo.p302ui.LongVodUiType;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.p1003enum.PlayMimeType;
import com.transsion.postdetail.shorttv.widget.ShortTVHistoryView;
import com.transsion.push.PushConstants;
import com.transsion.usercenter.setting.labelsfeedback.model.FbTvData;
import com.transsion.videodetail.R$id;
import com.transsion.videodetail.R$layout;
import com.transsion.videodetail.VideoDetailViewModel;
import com.transsion.videodetail.VideoEpisodeFragment;
import com.transsion.videodetail.bean.VideoDetailMediaSource;
import com.transsion.videodetail.bean.VideoDetailStream;
import com.transsion.videodetail.bean.VideoDetailStreamList;
import com.transsion.videodetail.music.bean.MusicLikedMultiItemEntity;
import com.transsion.videodetail.music.bean.MusicLoopEnum;
import com.transsion.videodetail.music.bean.MusicStateEnum;
import com.transsion.videodetail.music.data.MusicLikedFragmentViewModel;
import com.transsion.videodetail.music.widget.MusicDetailListOperateView;
import com.transsion.videofloat.bean.FloatActionType;
import com.transsnet.downloader.DownloadManagerApi;
import com.transsnet.downloader.widget.DownloadView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import jo.InterfaceC24450a;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25207u0;
import kotlinx.coroutines.InterfaceC25149n0;
import mx.C25917a;
import mx.C25918b;
import mx.C25919c;
import net.lucode.hackware.magicindicator.MagicIndicator;
import ng.AbstractC26006c;
import p352dn.InterfaceC22998b;
import p382el.InterfaceC23181a;
import p462hj.C23860f;
import p465hp.InterfaceC23888a;
import p550kj.C24655b;
import p550kj.C24662i;
import p553ko.C24715a;
import p553ko.C24717c;
import p586lx.C25753f;
import p586lx.C25757j;
import p648oj.InterfaceC26241c;
import p710qk.InterfaceC27083b;
import p710qk.InterfaceC27084c;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import p913xm.C28615f;
import p914xn.C28623e;
import p914xn.C28625g;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000¤\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0002ñ\u0001\u0018\u0000 \u0087\u00022\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002\u0090\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u0019\u0010\u0019\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\u0019\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u0012J\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010\u0012J\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010\u0012J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\fH\u0002¢\u0006\u0004\b1\u0010\u0006J\u0019\u00104\u001a\u00020\f2\b\b\u0002\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\fH\u0002¢\u0006\u0004\b6\u0010\u0006J\u000f\u00107\u001a\u00020\fH\u0002¢\u0006\u0004\b7\u0010\u0006J\u000f\u00108\u001a\u00020\fH\u0002¢\u0006\u0004\b8\u0010\u0006J\u0019\u00109\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b9\u0010*J\u000f\u0010:\u001a\u00020\fH\u0002¢\u0006\u0004\b:\u0010\u0006J\u000f\u0010;\u001a\u00020\fH\u0002¢\u0006\u0004\b;\u0010\u0006J\u000f\u0010<\u001a\u00020\fH\u0002¢\u0006\u0004\b<\u0010\u0006J\u000f\u0010=\u001a\u00020\fH\u0002¢\u0006\u0004\b=\u0010\u0006J\u0017\u0010>\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b>\u0010\u0012J)\u0010D\u001a\u0004\u0018\u00010B2\b\u0010@\u001a\u0004\u0018\u00010?2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0AH\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\fH\u0002¢\u0006\u0004\bF\u0010\u0006J\u0019\u0010I\u001a\u00020\f2\b\u0010H\u001a\u0004\u0018\u00010GH\u0002¢\u0006\u0004\bI\u0010JJ%\u0010M\u001a\b\u0012\u0004\u0012\u00020&0%2\u000e\u0010L\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010AH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020P2\u0006\u0010O\u001a\u00020KH\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\fH\u0002¢\u0006\u0004\bS\u0010\u0006J\u000f\u0010T\u001a\u00020\fH\u0002¢\u0006\u0004\bT\u0010\u0006J\u000f\u0010U\u001a\u00020\fH\u0002¢\u0006\u0004\bU\u0010\u0006J\u000f\u0010V\u001a\u00020\fH\u0002¢\u0006\u0004\bV\u0010\u0006J\u000f\u0010W\u001a\u00020\tH\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\fH\u0002¢\u0006\u0004\bY\u0010\u0006J\u0017\u0010[\u001a\u00020\f2\u0006\u0010Z\u001a\u00020\tH\u0002¢\u0006\u0004\b[\u0010\u0017J\u0017\u0010]\u001a\u00020\f2\u0006\u0010\\\u001a\u00020\tH\u0003¢\u0006\u0004\b]\u0010\u0017J\u000f\u0010^\u001a\u00020\fH\u0003¢\u0006\u0004\b^\u0010\u0006J\u000f\u0010_\u001a\u00020\fH\u0003¢\u0006\u0004\b_\u0010\u0006J\u000f\u0010`\u001a\u00020\fH\u0003¢\u0006\u0004\b`\u0010\u0006J\u0017\u0010c\u001a\u00020\f2\u0006\u0010b\u001a\u00020aH\u0003¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\fH\u0003¢\u0006\u0004\be\u0010\u0006J\u0019\u0010h\u001a\u00020\f2\b\u0010g\u001a\u0004\u0018\u00010fH\u0003¢\u0006\u0004\bh\u0010iJ\u0019\u0010k\u001a\u00020\f2\b\u0010j\u001a\u0004\u0018\u00010BH\u0003¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020\fH\u0003¢\u0006\u0004\bm\u0010\u0006J\u000f\u0010n\u001a\u00020\fH\u0002¢\u0006\u0004\bn\u0010\u0006J\u0019\u0010q\u001a\u00020\f2\b\u0010p\u001a\u0004\u0018\u00010oH\u0016¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020\fH\u0016¢\u0006\u0004\bs\u0010\u0006J\u000f\u0010t\u001a\u00020\fH\u0016¢\u0006\u0004\bt\u0010\u0006J\u000f\u0010u\u001a\u00020\fH\u0016¢\u0006\u0004\bu\u0010\u0006J\u000f\u0010v\u001a\u00020\fH\u0016¢\u0006\u0004\bv\u0010\u0006J\u000f\u0010w\u001a\u00020\fH\u0016¢\u0006\u0004\bw\u0010\u0006J\u0017\u0010z\u001a\u00020\u00022\u0006\u0010y\u001a\u00020xH\u0016¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020\fH\u0016¢\u0006\u0004\b|\u0010\u0006J\u000f\u0010}\u001a\u00020\fH\u0016¢\u0006\u0004\b}\u0010\u0006J\u000f\u0010~\u001a\u00020\fH\u0016¢\u0006\u0004\b~\u0010\u0006J\u000f\u0010\u007f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u007f\u0010\u0006J\u0011\u0010\u0080\u0001\u001a\u00020\fH\u0016¢\u0006\u0005\b\u0080\u0001\u0010\u0006J\u0013\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0011\u0010\u0084\u0001\u001a\u00020\tH\u0016¢\u0006\u0005\b\u0084\u0001\u0010XJ\u0012\u0010\u0085\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0015\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u0001H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001a\u0010\u008b\u0001\u001a\u00020\f2\u0007\u0010\u008a\u0001\u001a\u00020\tH\u0016¢\u0006\u0005\b\u008b\u0001\u0010\u0017J$\u0010\u008e\u0001\u001a\u00020\f2\u0010\u0010\u008d\u0001\u001a\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u008c\u0001H\u0016¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0093\u0001\u001a\u00020\u00078\u0006¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0086\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R!\u0010£\u0001\u001a\u00030\u009e\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R!\u0010¨\u0001\u001a\u00030¤\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¥\u0001\u0010 \u0001\u001a\u0006\b¦\u0001\u0010§\u0001R!\u0010\u00ad\u0001\u001a\u00030©\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bª\u0001\u0010 \u0001\u001a\u0006\b«\u0001\u0010¬\u0001R!\u0010²\u0001\u001a\u00030®\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¯\u0001\u0010 \u0001\u001a\u0006\b°\u0001\u0010±\u0001R\u001b\u0010´\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010\u0091\u0001R\u001b\u0010¶\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010\u0091\u0001R\u0019\u0010¹\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u001b\u0010»\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010\u0091\u0001R\u0019\u0010½\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010¸\u0001R\u0019\u0010¿\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¸\u0001R\u001b\u0010Á\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010\u0091\u0001R(\u0010Ç\u0001\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0005\bÆ\u0001\u00105R\u0019\u0010É\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010Ã\u0001R\u0019\u0010Ë\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ã\u0001R\u0019\u0010Í\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Ã\u0001R\u001b\u0010Ï\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010\u0091\u0001R\u0019\u0010Ñ\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010¸\u0001R\u0019\u0010Ó\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010¸\u0001R\u001c\u0010×\u0001\u001a\u0005\u0018\u00010Ô\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R#\u0010Ü\u0001\u001a\u0005\u0018\u00010Ø\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÙ\u0001\u0010 \u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001R#\u0010á\u0001\u001a\u0005\u0018\u00010Ý\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÞ\u0001\u0010 \u0001\u001a\u0006\bß\u0001\u0010à\u0001R\u001a\u0010å\u0001\u001a\u00030â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R\u001a\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u0019\u0010é\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0001\u0010¸\u0001R\u0019\u0010ë\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bê\u0001\u0010¸\u0001R\u001a\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R\"\u0010ð\u0001\u001a\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u0018\u0010ô\u0001\u001a\u00030ñ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R\u001a\u0010g\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0001\u0010ö\u0001R\u001c\u0010ú\u0001\u001a\u0005\u0018\u00010÷\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R\u0019\u0010û\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010¸\u0001R#\u0010þ\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u000f\n\u0006\bä\u0001\u0010ü\u0001\u0012\u0005\bý\u0001\u0010\u0006R \u0010\u0081\u0002\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u000f\n\u0006\bÿ\u0001\u0010¸\u0001\u0012\u0005\b\u0080\u0002\u0010\u0006R'\u0010\u0086\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010f0\u0082\u00028\u0002X\u0083\u0004¢\u0006\u000f\n\u0006\b\u0083\u0002\u0010\u0084\u0002\u0012\u0005\b\u0085\u0002\u0010\u0006¨\u0006\u0088\u0002"}, m97100d2 = {"Lcom/transsion/videodetail/music/ui/MusicDetailFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Llx/f;", "Lcom/transsion/baselib/report/k$a;", "Lco/a;", "<init>", "()V", "", "subjectId", "", "isAudioTracksChange", "from", "", "R1", "(Ljava/lang/String;ZLjava/lang/String;)V", "Lcom/transsion/moviedetailapi/bean/Subject;", "movieDetailBean", "H2", "(Lcom/transsion/moviedetailapi/bean/Subject;)V", "subject", "p2", "isNoNetwork", "B2", "(Z)V", "x2", "t2", "mMovieDetailBean", "A2", "A1", "m2", "z2", "u2", "h2", "Lcom/transsion/moviedetailapi/bean/Trailer;", "trailer", "i2", "(Lcom/transsion/moviedetailapi/bean/Trailer;)V", "", "Lko/c;", "v1", "(Lcom/transsion/moviedetailapi/bean/Trailer;)Ljava/util/List;", "c2", "(Ljava/lang/String;)V", "Lcom/transsion/baselib/db/download/DownloadBean;", "downloadBean", "f2", "(Lcom/transsion/baselib/db/download/DownloadBean;)V", "u1", "(Lcom/transsion/baselib/db/download/DownloadBean;)Ljava/util/List;", "G2", "", "visible", "E2", "(I)V", "D2", "H1", "a2", "e2", "y1", "C1", "e1", "f1", "K1", "Lcom/transsion/baselib/db/video/VideoDetailPlayBean;", ShortTVHistoryView.TYPE_HISTORY, "", "Lcom/transsion/videodetail/bean/VideoDetailMediaSource;", "episodeMediaList", "q1", "(Lcom/transsion/baselib/db/video/VideoDetailPlayBean;Ljava/util/List;)Lcom/transsion/videodetail/bean/VideoDetailMediaSource;", "d1", "Lko/a;", "bean", "Z1", "(Lko/a;)V", "Lcom/transsion/videodetail/bean/VideoDetailStream;", "videoDetailStream", "w1", "(Ljava/util/List;)Ljava/util/List;", "stream", "Lcom/transsion/player/enum/PlayMimeType;", "o1", "(Lcom/transsion/videodetail/bean/VideoDetailStream;)Lcom/transsion/player/enum/PlayMimeType;", "showLoading", "g1", "w2", "h1", "a1", "()Z", "b1", "proactive", "r2", PushConstants.PUSH_SERVICE_TYPE_SHOW, "X1", "E1", "J1", "s2", "Lcom/transsion/player/longvideo/ui/LongVodUiType;", "uiType", "Y1", "(Lcom/transsion/player/longvideo/ui/LongVodUiType;)V", "x1", "Lcom/transsion/videodetail/bean/VideoDetailStreamList;", "videoDetailStreamList", "g2", "(Lcom/transsion/videodetail/bean/VideoDetailStreamList;)V", "episodeMedia", "j1", "(Lcom/transsion/videodetail/bean/VideoDetailMediaSource;)V", "c1", "l2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "onStop", "onDestroy", "receiveArguments", "Landroid/view/LayoutInflater;", "inflater", "t1", "(Landroid/view/LayoutInflater;)Llx/f;", "initViewData", "initViewModel", "initListener", "loadDefaultData", "retryLoadData", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "isAudioShowNoNetworkLayout", "getPageStateLayoutTitle", "()Ljava/lang/String;", "Landroid/view/View;", "getLoadingView", "()Landroid/view/View;", "isBackground", "onBackgroundStatusChange", "Lkotlin/Function0;", "callback", "S", "(Lkotlin/jvm/functions/Function0;)V", "a", "Ljava/lang/String;", "getFragmentId", "fragmentId", "Ljo/a;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljo/a;", "playerControl", "Lxn/e;", "c", "Lxn/e;", "bottomRecHelper", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/moviedetailapi/bean/Subject;", "Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "e", "Lkotlin/Lazy;", "p1", "()Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "movieDetailViewModel", "Lcom/transsion/videodetail/VideoDetailViewModel;", "f", "s1", "()Lcom/transsion/videodetail/VideoDetailViewModel;", "videoDetailViewModel", "Lcom/transsion/videodetail/music/data/MusicLikedFragmentViewModel;", "g", "m1", "()Lcom/transsion/videodetail/music/data/MusicLikedFragmentViewModel;", "mViewModel", "Loj/c;", "h", "k1", "()Loj/c;", "downloadDao", "i", "mSubjectId", "j", "ops", CampaignEx.JSON_KEY_AD_K, "Z", "netResultSuccess", "l", "moduleName", "m", "autoDownload", "n", "autoPlay", "o", "autoPlayResourceId", TtmlNode.TAG_P, "I", "getPreloadId", "()I", "setPreloadId", "preloadId", CampaignEx.JSON_KEY_AD_Q, "curSeason", CampaignEx.JSON_KEY_AD_R, "targetSeason", "s", "targetEp", "t", "lastPageFrom", TmcStartParams.KEY_URL_SHORT, "isFloatShow", "v", "hasClickedActivityTip", "Lel/a;", "w", "Lel/a;", "palmPayApi", "Ldn/b;", "x", "n1", "()Ldn/b;", "memberProvider", "Lhp/a;", "y", "r1", "()Lhp/a;", "publishedApi", "", "z", "J", "curAudioTrackPlayProgress", "A", "Lcom/transsion/baselib/db/video/VideoDetailPlayBean;", "B", "isMusicLikedFragment", "C", "isMusicFloatViewClick", "D", "Lcom/transsion/baselib/db/download/DownloadBean;", "E", "Lkotlin/jvm/functions/Function0;", "backPressedCallback", "com/transsion/videodetail/music/ui/MusicDetailFragment$e", "F", "Lcom/transsion/videodetail/music/ui/MusicDetailFragment$e;", "networkStatusChangedListener", "G", "Lcom/transsion/videodetail/bean/VideoDetailStreamList;", "Llx/j;", "H", "Llx/j;", "loadingViewBinding", "showNetErr", "Landroid/view/View;", "getGameResView$annotations", "gameResView", "K", "isGameResInit$annotations", "isGameResInit", "Landroidx/lifecycle/c0;", "L", "Landroidx/lifecycle/c0;", "getPlayInfoObserver$annotations", "playInfoObserver", "M", "VideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class MusicDetailFragment extends PageStatusFragment<C25753f> implements C14492k.a, InterfaceC5146a {

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private VideoDetailPlayBean history;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean isMusicLikedFragment;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean isMusicFloatViewClick;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private DownloadBean downloadBean;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private Function0 backPressedCallback;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C20998e networkStatusChangedListener;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private VideoDetailStreamList videoDetailStreamList;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private C25757j loadingViewBinding;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean showNetErr;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private View gameResView;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private boolean isGameResInit;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC3189c0 playInfoObserver;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String fragmentId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private InterfaceC24450a playerControl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C28623e bottomRecHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Subject mMovieDetailBean;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Lazy movieDetailViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Lazy videoDetailViewModel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Lazy downloadDao;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String mSubjectId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String ops;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean netResultSuccess;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String moduleName;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean autoDownload;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean autoPlay;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private String autoPlayResourceId;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int preloadId;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int curSeason;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private int targetSeason;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private int targetEp;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private String lastPageFrom;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private boolean isFloatShow;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean hasClickedActivityTip;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private InterfaceC23181a palmPayApi;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final Lazy memberProvider;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final Lazy publishedApi;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private long curAudioTrackPlayProgress;

    /* JADX INFO: renamed from: com.transsion.videodetail.music.ui.MusicDetailFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final MusicDetailFragment m86402a() {
            return new MusicDetailFragment();
        }
    }

    /* JADX INFO: renamed from: com.transsion.videodetail.music.ui.MusicDetailFragment$b */
    public /* synthetic */ class C20995b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65848a;

        static {
            int[] iArr = new int[MusicLoopEnum.values().length];
            try {
                iArr[MusicLoopEnum.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicLoopEnum.LIST_LOOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MusicLoopEnum.SINGLE_LOOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f65848a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.transsion.videodetail.music.ui.MusicDetailFragment$c */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC20996c implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC20996c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            BubbleTextView bubbleTextView;
            ViewTreeObserver viewTreeObserver;
            C25753f mViewBinding = MusicDetailFragment.this.getMViewBinding();
            if (mViewBinding != null && (bubbleTextView = mViewBinding.f78516b) != null && (viewTreeObserver = bubbleTextView.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            C25753f mViewBinding2 = MusicDetailFragment.this.getMViewBinding();
            BubbleTextView bubbleTextView2 = mViewBinding2 != null ? mViewBinding2.f78516b : null;
            if (bubbleTextView2 == null || bubbleTextView2.getMeasuredWidth() == 0) {
                return;
            }
            float measuredWidth = (bubbleTextView2.getMeasuredWidth() / 2) - (AbstractC5776a0.m27313a(16.0f) / 2);
            bubbleTextView2.setArrowPosition(measuredWidth);
            C26866a.a.m104898f(C26866a.f81698a, "MusicDetailFragment", "activity tip width: " + bubbleTextView2.getMeasuredWidth() + ", arrowPosition: " + measuredWidth, false, 4, null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.videodetail.music.ui.MusicDetailFragment$d */
    public static final class C20997d extends AbstractC0256u {
        C20997d() {
            super(true);
        }

        @Override // androidx.activity.AbstractC0256u
        public void handleOnBackPressed() {
            Function0 function0 = MusicDetailFragment.this.backPressedCallback;
            if (function0 == null || !((Boolean) function0.invoke()).booleanValue()) {
                if (MusicDetailFragment.this.playerControl != null) {
                    InterfaceC24450a interfaceC24450a = MusicDetailFragment.this.playerControl;
                    if (interfaceC24450a != null) {
                        interfaceC24450a.onBackPressed();
                        return;
                    }
                    return;
                }
                FragmentActivity activity = MusicDetailFragment.this.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.videodetail.music.ui.MusicDetailFragment$e */
    public static final class C20998e implements InterfaceC27288n {
        C20998e() {
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected() {
            InterfaceC27288n.a.m106338a(this);
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
            Intrinsics.m97802h(network, "network");
            Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
            MusicDetailFragment.this.m86347h1();
            VideoDetailMediaSource videoDetailMediaSource = (VideoDetailMediaSource) MusicDetailFragment.this.m86379s1().m86129x().m14847f();
            if (videoDetailMediaSource != null) {
                MusicDetailFragment musicDetailFragment = MusicDetailFragment.this;
                VideoDetailStreamList videoDetailStreamList = (VideoDetailStreamList) musicDetailFragment.m86379s1().m86128w().m14847f();
                if (videoDetailStreamList != null && videoDetailMediaSource.getSe() == videoDetailStreamList.getSe() && videoDetailMediaSource.getEp() == videoDetailStreamList.getEp()) {
                    return;
                }
                musicDetailFragment.m86352j1(videoDetailMediaSource);
            }
        }

        @Override // p743rh.InterfaceC27288n
        public void onDisconnected() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.videodetail.music.ui.MusicDetailFragment$f */
    static final class C20999f implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65852a;

        C20999f(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65852a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65852a;
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
            this.f65852a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.videodetail.music.ui.MusicDetailFragment$g */
    public static final class C21000g implements InterfaceC24450a.b {
        C21000g() {
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: a */
        public void mo70371a() {
            MusicDetailFragment.this.m86339d1();
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: b */
        public boolean mo70372b() {
            if (MusicDetailFragment.this.showNetErr && C27287m.f83003a.m106330e()) {
                MusicDetailFragment musicDetailFragment = MusicDetailFragment.this;
                musicDetailFragment.m86352j1((VideoDetailMediaSource) musicDetailFragment.m86379s1().m86129x().m14847f());
            }
            return MusicDetailFragment.this.showNetErr;
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: c */
        public boolean mo70373c(FloatActionType actionType) {
            Intrinsics.m97802h(actionType, "actionType");
            return false;
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: d */
        public void mo70374d(LongVodUiType uiType) {
            MusicDetailListOperateView musicDetailListOperateView;
            Intrinsics.m97802h(uiType, "uiType");
            MusicDetailFragment.this.m86330Y1(uiType);
            C25753f mViewBinding = MusicDetailFragment.this.getMViewBinding();
            if (mViewBinding != null && (musicDetailListOperateView = mViewBinding.f78529o) != null) {
                musicDetailListOperateView.setState(MusicStateEnum.CLOSE);
            }
            C28623e c28623e = MusicDetailFragment.this.bottomRecHelper;
            if (c28623e != null) {
                c28623e.m110393x(uiType != LongVodUiType.MIDDLE);
            }
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: e */
        public View mo70375e() {
            return MusicDetailFragment.this.gameResView;
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: f */
        public void mo70376f(boolean z11) {
            AppCompatImageView appCompatImageView;
            C25753f mViewBinding = MusicDetailFragment.this.getMViewBinding();
            if (mViewBinding == null || (appCompatImageView = mViewBinding.f78525k) == null) {
                return;
            }
            appCompatImageView.setVisibility(z11 ? 0 : 8);
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: g */
        public void mo70377g(C24715a c24715a) {
            MusicDetailFragment.this.m86332Z1(c24715a);
        }

        @Override // jo.InterfaceC24450a.b
        public void onCompletion() {
            MusicDetailFragment.this.m86339d1();
        }
    }

    /* JADX INFO: renamed from: com.transsion.videodetail.music.ui.MusicDetailFragment$retryLoadData$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.videodetail.music.ui.MusicDetailFragment$retryLoadData$1", m97637f = "MusicDetailFragment.kt", m97638l = {437}, m97639m = "invokeSuspend")
    static final class C210011 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        int label;

        C210011(Continuation<? super C210011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MusicDetailFragment.this.new C210011(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C210011) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                this.label = 1;
                if (AbstractC25207u0.m99223a(1000L, this) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            MusicDetailFragment musicDetailFragment = MusicDetailFragment.this;
            musicDetailFragment.m86316R1(musicDetailFragment.mSubjectId, true, "retryLoadData()");
            return Unit.f75682a;
        }
    }

    public MusicDetailFragment() {
        String string = UUID.randomUUID().toString();
        Intrinsics.m97801g(string, "toString(...)");
        this.fragmentId = string;
        this.movieDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(MovieDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.videodetail.music.ui.MusicDetailFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.videodetail.music.ui.MusicDetailFragment$special$$inlined$activityViewModels$default$2
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
        this.videoDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(VideoDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.videodetail.music.ui.MusicDetailFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.videodetail.music.ui.MusicDetailFragment$special$$inlined$activityViewModels$default$4
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
        this.mViewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.videodetail.music.ui.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MusicDetailFragment.m86322U1();
            }
        });
        this.downloadDao = LazyKt.m97097b(new Function0() { // from class: com.transsion.videodetail.music.ui.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MusicDetailFragment.m86349i1();
            }
        });
        this.curSeason = 1;
        this.palmPayApi = (InterfaceC23181a) TheRouter.m61774d(InterfaceC23181a.class, new Object[0]);
        this.memberProvider = LazyKt.m97097b(new Function0() { // from class: com.transsion.videodetail.music.ui.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MusicDetailFragment.m86324V1();
            }
        });
        this.publishedApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.videodetail.music.ui.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MusicDetailFragment.m86353j2();
            }
        });
        this.networkStatusChangedListener = new C20998e();
        this.playInfoObserver = new InterfaceC3189c0() { // from class: com.transsion.videodetail.music.ui.z
            @Override // androidx.p1004lifecycle.InterfaceC3189c0
            public final void onChanged(Object obj) {
                MusicDetailFragment.m86340d2(this.f65925a, (VideoDetailStreamList) obj);
            }
        };
    }

    /* JADX INFO: renamed from: A1 */
    private final void m86274A1() {
        Subject subject = this.mMovieDetailBean;
        C25753f mViewBinding = getMViewBinding();
        MagicIndicator magicIndicator = mViewBinding != null ? mViewBinding.f78528n : null;
        C25753f mViewBinding2 = getMViewBinding();
        this.bottomRecHelper = new C28623e(this, subject, magicIndicator, mViewBinding2 != null ? mViewBinding2.f78530p : null, "music_stream_detail", false, false, new Function1() { // from class: com.transsion.videodetail.music.ui.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MusicDetailFragment.m86277B1(this.f65915a, ((Integer) obj).intValue());
            }
        }, 96, null);
    }

    /* JADX INFO: renamed from: A2 */
    private final void m86275A2(Subject mMovieDetailBean) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public static final Unit m86277B1(MusicDetailFragment musicDetailFragment, int i11) {
        DownloadView downloadView;
        GradientTextView gradientTextView;
        DownloadView downloadView2;
        DownloadView downloadView3;
        C25753f mViewBinding = musicDetailFragment.getMViewBinding();
        if (mViewBinding == null || (downloadView2 = mViewBinding.f78518d) == null || downloadView2.getCom.cloud.tmc.kernel.minicover.NativeComponentConstants.KEY_COMPONENT_TYPE java.lang.String() != 1) {
            C25753f mViewBinding2 = musicDetailFragment.getMViewBinding();
            if (mViewBinding2 != null && (downloadView = mViewBinding2.f78518d) != null) {
                downloadView.setVisibility(i11 != 1 ? 0 : 8);
            }
        } else {
            C25753f mViewBinding3 = musicDetailFragment.getMViewBinding();
            if (mViewBinding3 != null && (downloadView3 = mViewBinding3.f78518d) != null) {
                AbstractC26006c.m102054g(downloadView3);
            }
        }
        C25753f mViewBinding4 = musicDetailFragment.getMViewBinding();
        if (mViewBinding4 != null && (gradientTextView = mViewBinding4.f78535u) != null) {
            gradientTextView.setVisibility(i11 == 1 ? 0 : 8);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: B2 */
    private final void m86278B2(boolean isNoNetwork) {
        new C28625g(this, R$id.subjectDetailLayout, this.mMovieDetailBean, "music_stream_detail", this.moduleName, false, false, 96, null);
    }

    /* JADX INFO: renamed from: C1 */
    private final void m86280C1() {
        DownloadView downloadView;
        DownloadView downloadView2;
        C25753f mViewBinding = getMViewBinding();
        if (mViewBinding != null && (downloadView2 = mViewBinding.f78518d) != null) {
            DownloadView.setAttrs$default(downloadView2, null, Float.valueOf(C14752e.m66410g(16.0f)), null, 5, null);
        }
        C25753f mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (downloadView = mViewBinding2.f78518d) == null) {
            return;
        }
        downloadView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.music.ui.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicDetailFragment.m86283D1(this.f65879a, view);
            }
        });
    }

    /* JADX INFO: renamed from: C2 */
    static /* synthetic */ void m86281C2(MusicDetailFragment musicDetailFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        musicDetailFragment.m86278B2(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public static final void m86283D1(MusicDetailFragment musicDetailFragment, View view) {
        ResourceDetectors resourceDetector;
        List<DownloadItem> resolutionList;
        Subject subject;
        ResourceDetectors resourceDetector2;
        ResourceDetectors resourceDetector3;
        List<DownloadItem> resolutionList2;
        Subject subject2 = musicDetailFragment.mMovieDetailBean;
        if (subject2 != null && (resourceDetector = subject2.getResourceDetector()) != null && (resolutionList = resourceDetector.getResolutionList()) != null && (!resolutionList.isEmpty())) {
            Subject subject3 = musicDetailFragment.mMovieDetailBean;
            Integer numValueOf = (subject3 == null || (resourceDetector3 = subject3.getResourceDetector()) == null || (resolutionList2 = resourceDetector3.getResolutionList()) == null) ? null : Integer.valueOf(resolutionList2.size());
            Intrinsics.m97799e(numValueOf);
            if (numValueOf.intValue() > 1 && (subject = musicDetailFragment.mMovieDetailBean) != null && (resourceDetector2 = subject.getResourceDetector()) != null) {
                resourceDetector2.setType(1);
            }
        }
        musicDetailFragment.m86341e1();
        musicDetailFragment.m86343f1();
    }

    /* JADX INFO: renamed from: D2 */
    private final void m86284D2() {
        BubbleTextView bubbleTextView;
        C25753f mViewBinding;
        DownloadView downloadView;
        C25753f mViewBinding2;
        DownloadView downloadView2;
        BubbleTextView bubbleTextView2;
        if (!m86333a1() || (mViewBinding = getMViewBinding()) == null || (downloadView = mViewBinding.f78518d) == null || downloadView.getVisibility() != 0 || (mViewBinding2 = getMViewBinding()) == null || (downloadView2 = mViewBinding2.f78518d) == null || downloadView2.getCom.cloud.tmc.kernel.minicover.NativeComponentConstants.KEY_COMPONENT_TYPE java.lang.String() != 0) {
            C25753f mViewBinding3 = getMViewBinding();
            if (mViewBinding3 == null || (bubbleTextView = mViewBinding3.f78516b) == null) {
                return;
            }
            AbstractC26006c.m102054g(bubbleTextView);
            return;
        }
        C25753f mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (bubbleTextView2 = mViewBinding4.f78516b) != null) {
            AbstractC26006c.m102058k(bubbleTextView2);
        }
        m86335b1();
    }

    /* JADX INFO: renamed from: E1 */
    private final void m86286E1() {
        String genre;
        InterfaceC27083b interfaceC27083b;
        SubjectGameInfo gameInfo;
        SubjectGameInfo gameInfo2;
        SubjectGameInfo gameInfo3;
        SubjectGameInfo gameInfo4;
        this.isGameResInit = true;
        Subject subject = this.mMovieDetailBean;
        String itemId = null;
        String type = (subject == null || (gameInfo4 = subject.getGameInfo()) == null) ? null : gameInfo4.getType();
        if (type != null && type.length() != 0) {
            Subject subject2 = this.mMovieDetailBean;
            String itemId2 = (subject2 == null || (gameInfo3 = subject2.getGameInfo()) == null) ? null : gameInfo3.getItemId();
            if (itemId2 != null && itemId2.length() != 0) {
                C26866a.a.m104898f(C26866a.f81698a, "GameResLoader", "stream detail game initGameRes", false, 4, null);
                Context context = getContext();
                if (context == null || (interfaceC27083b = (InterfaceC27083b) TheRouter.m61774d(InterfaceC27083b.class, new Object[0])) == null) {
                    return;
                }
                Subject subject3 = this.mMovieDetailBean;
                GameInfoType gameInfoType = (subject3 == null || (gameInfo2 = subject3.getGameInfo()) == null) ? null : gameInfo2.getGameInfoType();
                Intrinsics.m97799e(gameInfoType);
                Subject subject4 = this.mMovieDetailBean;
                if (subject4 != null && (gameInfo = subject4.getGameInfo()) != null) {
                    itemId = gameInfo.getItemId();
                }
                String str = itemId;
                Intrinsics.m97799e(str);
                interfaceC27083b.mo65960a(context, "music_stream_detail", gameInfoType, str, new Function1() { // from class: com.transsion.videodetail.music.ui.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MusicDetailFragment.m86289F1(this.f65905a, (View) obj);
                    }
                });
                return;
            }
        }
        Subject subject5 = this.mMovieDetailBean;
        if (subject5 == null || (genre = subject5.getGenre()) == null) {
            return;
        }
        String lowerCase = genre.toLowerCase(Locale.ROOT);
        Intrinsics.m97801g(lowerCase, "toLowerCase(...)");
        if (lowerCase == null || !StringsKt.m98132c0(lowerCase, "game", false, 2, null)) {
            return;
        }
        C26866a.a.m104901l(C26866a.f81698a, "GameResLoader", "stream detail,  game is null", false, 4, null);
    }

    /* JADX INFO: renamed from: E2 */
    private final void m86287E2(int visible) {
        String str;
        HashMap mapM96844g;
        DownloadView downloadView;
        DownloadView downloadView2;
        DownloadView downloadView3;
        ResourceDetectors resourceDetector;
        DownloadView downloadView4;
        C25753f mViewBinding = getMViewBinding();
        if (mViewBinding != null && (downloadView4 = mViewBinding.f78518d) != null) {
            downloadView4.setVisibility(visible);
        }
        Subject subject = this.mMovieDetailBean;
        boolean z11 = false;
        String str2 = "";
        if (subject != null && (resourceDetector = subject.getResourceDetector()) != null) {
            String resourceId = resourceDetector.getResourceId();
            str2 = resourceId != null ? resourceId : "";
            if (resourceDetector.isMultiResolution()) {
                z11 = true;
            }
        }
        boolean z12 = z11;
        String str3 = str2;
        C25753f mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (downloadView3 = mViewBinding2.f78518d) != null) {
            String str4 = this.mSubjectId;
            Subject subject2 = this.mMovieDetailBean;
            DownloadView.setShowType$default(downloadView3, str4, str3, subject2 != null ? Boolean.valueOf(subject2.isSeries()) : null, z12, 0, 16, null);
        }
        C25753f mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (downloadView = mViewBinding3.f78518d) == null || downloadView.getCom.cloud.tmc.kernel.minicover.NativeComponentConstants.KEY_COMPONENT_TYPE java.lang.String() != 1) {
            str = "download_subject";
        } else {
            C25753f mViewBinding4 = getMViewBinding();
            if (mViewBinding4 != null && (downloadView2 = mViewBinding4.f78518d) != null) {
                downloadView2.setVisibility(8);
            }
            str = "play_subject";
        }
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
        }
        m86284D2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public static final Unit m86289F1(MusicDetailFragment musicDetailFragment, View view) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        musicDetailFragment.gameResView = view;
        if (view == null) {
            C25753f mViewBinding = musicDetailFragment.getMViewBinding();
            if (mViewBinding != null && (frameLayout2 = mViewBinding.f78524j) != null) {
                AbstractC26006c.m102054g(frameLayout2);
            }
            C25753f mViewBinding2 = musicDetailFragment.getMViewBinding();
            if (mViewBinding2 != null && (frameLayout = mViewBinding2.f78524j) != null) {
                frameLayout.removeAllViews();
            }
        } else {
            musicDetailFragment.m86380s2();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: F2 */
    static /* synthetic */ void m86290F2(MusicDetailFragment musicDetailFragment, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        musicDetailFragment.m86287E2(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public static final void m86292G1(MusicDetailFragment musicDetailFragment, View view) {
        FragmentActivity activity = musicDetailFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: G2 */
    private final void m86293G2() {
        ResourcesSeasonList resourcesSeasonList = (ResourcesSeasonList) m86379s1().m86130y().m14847f();
        if (resourcesSeasonList == null || this.mMovieDetailBean == null) {
            return;
        }
        if (resourcesSeasonList.isNoSource()) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
            AbstractC3168w abstractC3168wM14557p = childFragmentManager.m14557p();
            Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
            ResourceDetectorEmptyFragment resourceDetectorEmptyFragment = new ResourceDetectorEmptyFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("data_key_resource_detectors", this.mMovieDetailBean);
            resourceDetectorEmptyFragment.setArguments(bundle);
            abstractC3168wM14557p.m14813s(R$id.resourceDetectorGroup, resourceDetectorEmptyFragment);
            abstractC3168wM14557p.mo14671j();
            m86287E2(8);
            return;
        }
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        Intrinsics.m97801g(childFragmentManager2, "getChildFragmentManager(...)");
        AbstractC3168w abstractC3168wM14557p2 = childFragmentManager2.m14557p();
        Intrinsics.m97801g(abstractC3168wM14557p2, "beginTransaction()");
        VideoEpisodeFragment videoEpisodeFragment = new VideoEpisodeFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("data_key_resource_detectors", this.mMovieDetailBean);
        bundle2.putString("ops", this.ops);
        bundle2.putBoolean("auto_play", this.autoPlay);
        bundle2.putString("auto_play_resource_id", this.autoPlayResourceId);
        bundle2.putString("module_name", this.moduleName);
        bundle2.putInt("season", this.curSeason);
        videoEpisodeFragment.setArguments(bundle2);
        abstractC3168wM14557p2.m14813s(R$id.resourceDetectorGroup, videoEpisodeFragment);
        abstractC3168wM14557p2.mo14671j();
        m86290F2(this, 0, 1, null);
    }

    /* JADX INFO: renamed from: H1 */
    private final void m86295H1() {
        MusicDetailListOperateView musicDetailListOperateView;
        C25917a.f79141a.m101737c(getClassTag() + " --> initMusicLikedOperate() --> isMusicLikedFragment = " + this.isMusicLikedFragment);
        if (this.isMusicLikedFragment) {
            if (this.isMusicFloatViewClick) {
                m86361m1().m86234F(this.mSubjectId, new Function1() { // from class: com.transsion.videodetail.music.ui.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MusicDetailFragment.m86298I1(this.f65885a, ((Boolean) obj).booleanValue());
                    }
                });
                return;
            } else {
                m86334a2();
                C25918b.f79142a.m101739b(true);
                return;
            }
        }
        C25753f mViewBinding = getMViewBinding();
        if (mViewBinding == null || (musicDetailListOperateView = mViewBinding.f78529o) == null) {
            return;
        }
        musicDetailListOperateView.setVisibility(8);
    }

    /* JADX INFO: renamed from: H2 */
    private final void m86296H2(Subject movieDetailBean) {
        Subject subject;
        this.mMovieDetailBean = movieDetailBean;
        String ops = movieDetailBean != null ? movieDetailBean.getOps() : null;
        if ((ops == null || ops.length() == 0) && (subject = this.mMovieDetailBean) != null) {
            subject.setOps(this.ops);
        }
        ResourcesSeasonList resourcesSeasonList = (ResourcesSeasonList) m86379s1().m86130y().m14847f();
        if (resourcesSeasonList == null || !resourcesSeasonList.isNoSource()) {
            m86400z2();
        } else {
            m86371p2(this.mMovieDetailBean);
        }
        m86281C2(this, false, 1, null);
        if (!this.isGameResInit) {
            m86286E1();
            m86328X1(true);
        }
        m86382t2(this.mMovieDetailBean);
        m86275A2(this.mMovieDetailBean);
        m86362m2();
        m86274A1();
        m86293G2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public static final Unit m86298I1(MusicDetailFragment musicDetailFragment, boolean z11) {
        MusicDetailListOperateView musicDetailListOperateView;
        if (z11) {
            musicDetailFragment.m86334a2();
            C25918b.f79142a.m101739b(true);
        } else {
            C25753f mViewBinding = musicDetailFragment.getMViewBinding();
            if (mViewBinding != null && (musicDetailListOperateView = mViewBinding.f78529o) != null) {
                musicDetailListOperateView.setVisibility(8);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: J1 */
    private final void m86300J1() {
        ResourcesSeasonList resourcesSeasonList;
        if (this.mSubjectId == null || (resourcesSeasonList = (ResourcesSeasonList) m86379s1().m86130y().m14847f()) == null) {
            return;
        }
        if (resourcesSeasonList.isNoSource()) {
            C25917a.f79141a.m101735a(getClassTag() + " --> initPlayInfo() --> checkPlayInfo --> 没有资源");
            return;
        }
        if (resourcesSeasonList.isSeries()) {
            C25917a.f79141a.m101735a(getClassTag() + " --> initPlayInfo() --> checkPlayInfo --> 是剧集，获取记录决定哪集");
            List list = (List) m86379s1().m86124s().m14847f();
            if (list == null) {
                return;
            }
            m86379s1().m86119B(m86373q1(this.history, list));
            return;
        }
        if (!resourcesSeasonList.isMovie()) {
            C25917a.f79141a.m101735a(getClassTag() + " --> initPlayInfo() --> checkPlayInfo --> 是什么呢。。。");
            return;
        }
        C25917a.f79141a.m101735a(getClassTag() + " --> initPlayInfo() --> checkPlayInfo --> 是电影");
        List list2 = (List) m86379s1().m86124s().m14847f();
        if (list2 == null) {
            return;
        }
        m86379s1().m86119B((VideoDetailMediaSource) CollectionsKt.m97361k0(list2));
    }

    /* JADX INFO: renamed from: K1 */
    private final void m86302K1(Subject movieDetailBean) {
        String restrictLevel = movieDetailBean.getRestrictLevel();
        if (restrictLevel == null || restrictLevel.length() == 0 || !C14496b.f50966a.m65344b().getBoolean("restrict_tips_dialog_again", true)) {
            return;
        }
        InterfaceC24450a interfaceC24450a = this.playerControl;
        if (interfaceC24450a != null) {
            interfaceC24450a.onHandlePause();
        }
        ConfigBean configBeanM110355d = C28615f.m110355d(C28615f.f87796c.m110363a(), "sa_restrict_tips", false, 2, null);
        String value = configBeanM110355d != null ? configBeanM110355d.getValue() : null;
        if (value == null || value.length() == 0) {
            value = Utils.m27275a().getString(R$string.movie_detail_restrict_tips);
        }
        final RestrictTipsDialog restrictTipsDialogM70471a = RestrictTipsDialog.INSTANCE.m70471a(value, "music_stream_detail", movieDetailBean.getSubjectId());
        restrictTipsDialogM70471a.m65437l0(this, "RestrictTipsDialog");
        restrictTipsDialogM70471a.m70470y0(new Function1() { // from class: com.transsion.videodetail.music.ui.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MusicDetailFragment.m86304L1(restrictTipsDialogM70471a, this, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public static final Unit m86304L1(RestrictTipsDialog restrictTipsDialog, MusicDetailFragment musicDetailFragment, boolean z11) {
        if (z11) {
            InterfaceC24450a interfaceC24450a = musicDetailFragment.playerControl;
            if (interfaceC24450a != null) {
                interfaceC24450a.onHandlePlay();
            }
        } else {
            FragmentActivity activity = restrictTipsDialog.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public static final Unit m86306M1(MusicDetailFragment musicDetailFragment, List list) {
        musicDetailFragment.m86300J1();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N1 */
    public static final Unit m86308N1(MusicDetailFragment musicDetailFragment, Pair pair) {
        HashMap mapM96844g;
        HashMap mapM96844g2;
        CoordinatorLayout coordinatorLayout;
        Subject subject = (Subject) pair.getSecond();
        C25753f mViewBinding = musicDetailFragment.getMViewBinding();
        if (mViewBinding != null && (coordinatorLayout = mViewBinding.f78519e) != null) {
            coordinatorLayout.setVisibility(0);
        }
        if (subject == null) {
            if (Intrinsics.m97797c(pair.getFirst(), "404")) {
                C13806h.f49015a.m62324k(R$string.movie_lost_content);
                AbstractC25136k.m99058d(AbstractC3226v.m14968a(musicDetailFragment), null, null, new MusicDetailFragment$initViewModel$1$1(musicDetailFragment, null), 3, null);
            }
            if (C27287m.f83003a.m106330e()) {
                PageStatusFragment.showEmptyView$default(musicDetailFragment, false, 1, null);
            } else {
                PageStatusFragment.showNoNetworkView$default(musicDetailFragment, false, 1, null);
            }
        } else {
            C25917a.f79141a.m101735a(musicDetailFragment.getClassTag() + " --> initDetailViewModel() --> 获取到数据 --> subjectId = " + subject.getSubjectId() + " --> 刷新UI");
            MovieDetailViewModel movieDetailViewModelM86370p1 = musicDetailFragment.m86370p1();
            String subjectId = subject.getSubjectId();
            Integer subjectType = subject.getSubjectType();
            Context context = musicDetailFragment.getContext();
            MovieDetailViewModel.m70906u(movieDetailViewModelM86370p1, subjectId, subjectType, 0, context != null && AbstractC14556b.m65670a(context), 4, null);
            musicDetailFragment.showContentView();
            musicDetailFragment.netResultSuccess = true;
            musicDetailFragment.m86296H2(subject);
            musicDetailFragment.m86385u2(subject);
            C24655b logViewConfig = musicDetailFragment.getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96848k(true);
            }
            C24655b logViewConfig2 = musicDetailFragment.getLogViewConfig();
            if (logViewConfig2 != null) {
                logViewConfig2.m96851n(musicDetailFragment.ops);
            }
            C24655b logViewConfig3 = musicDetailFragment.getLogViewConfig();
            if (logViewConfig3 != null && (mapM96844g2 = logViewConfig3.m96844g()) != null) {
                String subjectId2 = subject.getSubjectId();
                if (subjectId2 == null) {
                    subjectId2 = "";
                }
                mapM96844g2.put("subject_id", subjectId2);
            }
            C24655b logViewConfig4 = musicDetailFragment.getLogViewConfig();
            if (logViewConfig4 != null && (mapM96844g = logViewConfig4.m96844g()) != null) {
                mapM96844g.put("has_resource", String.valueOf(subject.getHasResource()));
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public static final Unit m86310O1(MusicDetailFragment musicDetailFragment, VideoDetailPlayBean videoDetailPlayBean) {
        Subject subject;
        String str = musicDetailFragment.ops;
        if (str == null || str.length() == 0) {
            musicDetailFragment.ops = videoDetailPlayBean != null ? videoDetailPlayBean.getOps() : null;
        }
        Subject subject2 = musicDetailFragment.mMovieDetailBean;
        String ops = subject2 != null ? subject2.getOps() : null;
        if ((ops == null || ops.length() == 0) && (subject = musicDetailFragment.mMovieDetailBean) != null) {
            subject.setOps(videoDetailPlayBean != null ? videoDetailPlayBean.getOps() : null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P1 */
    public static final Unit m86312P1(MusicDetailFragment musicDetailFragment, Integer num) {
        Intrinsics.m97799e(num);
        musicDetailFragment.curSeason = num.intValue();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q1 */
    public static final Unit m86314Q1(MusicDetailFragment musicDetailFragment, ResourcesSeasonList resourcesSeasonList) {
        musicDetailFragment.m86293G2();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R1 */
    public final void m86316R1(final String subjectId, boolean isAudioTracksChange, String from) {
        C25917a.f79141a.m101735a(getClassTag() + " --> loadData() --> isAudioTracksChange = " + isAudioTracksChange + " --> subjectId = " + subjectId + " --> from = " + from + " --> 开始加载数据");
        if (!C27287m.f83003a.m106330e()) {
            m86361m1().m86233E(subjectId, new Function1() { // from class: com.transsion.videodetail.music.ui.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MusicDetailFragment.m86320T1(this.f65881a, subjectId, (String) obj);
                }
            });
            return;
        }
        if (!isAudioTracksChange) {
            showLoadingView();
        }
        if (subjectId != null) {
            MovieDetailViewModel.m70874E(m86370p1(), subjectId, null, false, 6, null);
            m86379s1().m86123r(subjectId);
        }
    }

    /* JADX INFO: renamed from: S1 */
    static /* synthetic */ void m86318S1(MusicDetailFragment musicDetailFragment, String str, boolean z11, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        musicDetailFragment.m86316R1(str, z11, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T1 */
    public static final Unit m86320T1(MusicDetailFragment musicDetailFragment, String str, String path) {
        CoordinatorLayout coordinatorLayout;
        Intrinsics.m97802h(path, "path");
        if (TextUtils.isEmpty(path)) {
            C25917a.f79141a.m101736b(musicDetailFragment.getClassTag() + " --> loadData() --> 无网络 无下载 --> 加载失败，这种情况需要前置拦截");
        } else {
            C25753f mViewBinding = musicDetailFragment.getMViewBinding();
            if (mViewBinding != null && (coordinatorLayout = mViewBinding.f78519e) != null) {
                coordinatorLayout.setVisibility(8);
            }
            musicDetailFragment.m86338c2(str);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public static final MusicLikedFragmentViewModel m86322U1() {
        return new MusicLikedFragmentViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public static final InterfaceC22998b m86324V1() {
        return (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W1 */
    public static final void m86326W1(MusicDetailFragment musicDetailFragment) {
        Object systemService = Utils.m27275a().getSystemService("keyguard");
        Intrinsics.m97800f(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        if (((KeyguardManager) systemService).isKeyguardLocked()) {
            return;
        }
        C25917a.f79141a.m101735a(musicDetailFragment.getClassTag() + " --> onBackgroundStatusChange() --> 2Background~~");
        musicDetailFragment.m86377r2(false);
    }

    /* JADX INFO: renamed from: X1 */
    private final void m86328X1(boolean show) {
        String genre;
        Subject subject = this.mMovieDetailBean;
        if (subject == null || (genre = subject.getGenre()) == null) {
            return;
        }
        String lowerCase = genre.toLowerCase(Locale.ROOT);
        Intrinsics.m97801g(lowerCase, "toLowerCase(...)");
        if (lowerCase == null || !StringsKt.m98132c0(lowerCase, "game", false, 2, null)) {
            return;
        }
        if (show) {
            InterfaceC22998b interfaceC22998bM86364n1 = m86364n1();
            if (interfaceC22998bM86364n1 != null) {
                interfaceC22998bM86364n1.mo69854h();
                return;
            }
            return;
        }
        InterfaceC22998b interfaceC22998bM86364n2 = m86364n1();
        if (interfaceC22998bM86364n2 != null) {
            interfaceC22998bM86364n2.mo69866t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public final void m86330Y1(LongVodUiType uiType) {
        if (this.gameResView == null || uiType != LongVodUiType.MIDDLE) {
            return;
        }
        m86380s2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public final void m86332Z1(C24715a bean) {
        Navigator navigatorM61857K = TheRouter.m61773c("/profile/user_center_labels_feedback").m61857K("feedback_from_page", "SUBJECT_PLAY").m61857K("subject_id", this.mSubjectId);
        Subject subject = this.mMovieDetailBean;
        if (subject != null && subject.getType() == 3 && bean != null) {
            navigatorM61857K.m61855I("TV_DATA", new FbTvData(bean.m97059o(), bean.m97056l(), bean.m97049e()));
        }
        Navigator.m61845x(navigatorM61857K, requireContext(), null, 2, null);
    }

    /* JADX INFO: renamed from: a1 */
    private final boolean m86333a1() {
        InterfaceC23181a interfaceC23181a;
        if (this.hasClickedActivityTip || (interfaceC23181a = this.palmPayApi) == null) {
            return false;
        }
        return interfaceC23181a.mo66561g();
    }

    /* JADX INFO: renamed from: a2 */
    private final void m86334a2() {
        MusicDetailListOperateView musicDetailListOperateView;
        C25753f mViewBinding = getMViewBinding();
        if (mViewBinding == null || (musicDetailListOperateView = mViewBinding.f78529o) == null) {
            return;
        }
        musicDetailListOperateView.setVisibility(0);
        String str = this.mSubjectId;
        C25753f mViewBinding2 = getMViewBinding();
        FrameLayout frameLayout = mViewBinding2 != null ? mViewBinding2.f78522h : null;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
        musicDetailListOperateView.setContainer(str, frameLayout, childFragmentManager, R$id.flMusicContainer, new Function2() { // from class: com.transsion.videodetail.music.ui.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MusicDetailFragment.m86336b2(this.f65903a, (String) obj, (String) obj2);
            }
        });
        musicDetailListOperateView.setState(MusicStateEnum.OPEN);
    }

    /* JADX INFO: renamed from: b1 */
    private final void m86335b1() {
        BubbleTextView bubbleTextView;
        ViewTreeObserver viewTreeObserver;
        C25753f mViewBinding = getMViewBinding();
        if (mViewBinding == null || (bubbleTextView = mViewBinding.f78516b) == null || (viewTreeObserver = bubbleTextView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC20996c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public static final Unit m86336b2(MusicDetailFragment musicDetailFragment, String str, String str2) {
        C25917a.f79141a.m101735a(musicDetailFragment.getClassTag() + " --> setContainer() --> onItemCLick{} --> subjectId = " + str + " --> path = " + str2 + " --> 重置数据，重新加载");
        if (TextUtils.isEmpty(str)) {
            C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.error_load_failed);
            return Unit.f75682a;
        }
        if (C27287m.f83003a.m106330e() || !TextUtils.isEmpty(str2)) {
            musicDetailFragment.m86342e2(str);
            return Unit.f75682a;
        }
        C28951b.f88586a.m111454d(com.transsion.videodetail.R$string.music_no_network);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: c1 */
    private final void m86337c1() {
        ResourcesSeasonList resourcesSeasonList = (ResourcesSeasonList) m86379s1().m86130y().m14847f();
        if (resourcesSeasonList == null) {
            return;
        }
        boolean z11 = false;
        if (resourcesSeasonList.isSeries()) {
            C26866a.a.m104898f(C26866a.f81698a, "MusicDetailFragment", "checkPlayNextOrReplay 是剧集，判断下一集还是完成 ", false, 4, null);
            List listL = (List) m86379s1().m86124s().m14847f();
            if (listL == null) {
                listL = CollectionsKt.m97506l();
            }
            VideoDetailMediaSource videoDetailMediaSource = (VideoDetailMediaSource) m86379s1().m86129x().m14847f();
            int iIndexOf = videoDetailMediaSource != null ? listL.indexOf(videoDetailMediaSource) : -1;
            if (iIndexOf >= 0 && iIndexOf < listL.size() - 1) {
                z11 = true;
            }
        }
        InterfaceC24450a interfaceC24450a = this.playerControl;
        if (interfaceC24450a != null) {
            interfaceC24450a.hasNextEpisode(z11);
        }
    }

    /* JADX INFO: renamed from: c2 */
    private final void m86338c2(String subjectId) {
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new MusicDetailFragment$playDownloadMusic$1(this, subjectId, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public final void m86339d1() {
        MusicDetailListOperateView musicDetailListOperateView;
        MusicDetailLikedFragment mMusicDetailLikedFragment;
        MusicLikedMultiItemEntity musicLikedMultiItemEntityM86264r0;
        MusicLikedDbBean musicLikedDbBean;
        MusicDetailListOperateView musicDetailListOperateView2;
        MusicDetailLikedFragment mMusicDetailLikedFragment2;
        int i11 = C20995b.f65848a[C25919c.f79144a.m101741b().ordinal()];
        if (i11 == 1) {
            InterfaceC24450a interfaceC24450a = this.playerControl;
            if (interfaceC24450a != null) {
                interfaceC24450a.showReplay();
                return;
            }
            return;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            C25917a.f79141a.m101735a(getClassTag() + " --> checkPlayNextOrReplay() --> playerControl?.replay()");
            InterfaceC24450a interfaceC24450a2 = this.playerControl;
            if (interfaceC24450a2 != null) {
                interfaceC24450a2.replay();
                return;
            }
            return;
        }
        C25753f mViewBinding = getMViewBinding();
        String subjectId = null;
        String strM86268v0 = (mViewBinding == null || (musicDetailListOperateView2 = mViewBinding.f78529o) == null || (mMusicDetailLikedFragment2 = musicDetailListOperateView2.getMMusicDetailLikedFragment()) == null) ? null : mMusicDetailLikedFragment2.m86268v0();
        if (TextUtils.isEmpty(strM86268v0)) {
            C25753f mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (musicDetailListOperateView = mViewBinding2.f78529o) != null && (mMusicDetailLikedFragment = musicDetailListOperateView.getMMusicDetailLikedFragment()) != null && (musicLikedMultiItemEntityM86264r0 = mMusicDetailLikedFragment.m86264r0()) != null && (musicLikedDbBean = musicLikedMultiItemEntityM86264r0.getMusicLikedDbBean()) != null) {
                subjectId = musicLikedDbBean.getSubjectId();
            }
            strM86268v0 = subjectId;
        }
        m86342e2(strM86268v0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public static final void m86340d2(MusicDetailFragment musicDetailFragment, VideoDetailStreamList videoDetailStreamList) {
        C26866a.f81698a.m104912c("MusicDetailFragment", "playInfoObserver  playInfo==" + videoDetailStreamList, true);
        musicDetailFragment.m86393x1();
        if (videoDetailStreamList != null || C27287m.f83003a.m106330e()) {
            musicDetailFragment.m86347h1();
        } else {
            musicDetailFragment.m86391w2();
        }
    }

    /* JADX INFO: renamed from: e1 */
    private final void m86341e1() {
        String str;
        boolean z11;
        String str2;
        String ops;
        String subjectId;
        ResourceDetectors resourceDetector;
        if (getContext() == null) {
            return;
        }
        Subject subject = this.mMovieDetailBean;
        String str3 = "";
        int ep2 = 0;
        if (subject == null || (resourceDetector = subject.getResourceDetector()) == null) {
            str = "";
            z11 = false;
        } else {
            String resourceLink = resourceDetector.getResourceLink();
            if (resourceLink == null) {
                resourceLink = "";
            }
            String resourceId = resourceDetector.getResourceId();
            str3 = resourceId != null ? resourceId : "";
            z11 = resourceDetector.isMultiResolution();
            str = resourceLink;
        }
        DownloadManagerApi.C21276a c21276a = DownloadManagerApi.f66480j;
        DownloadManagerApi downloadManagerApiM87093a = c21276a.m87093a();
        Subject subject2 = this.mMovieDetailBean;
        String ops2 = null;
        String subjectId2 = subject2 != null ? subject2.getSubjectId() : null;
        Subject subject3 = this.mMovieDetailBean;
        if (downloadManagerApiM87093a.m87091w0(subjectId2, str3, subject3 != null && subject3.isSeries(), z11)) {
            Subject subject4 = this.mMovieDetailBean;
            if (subject4 == null || (subjectId = subject4.getSubjectId()) == null) {
                return;
            }
            DownloadManagerApi downloadManagerApiM87093a2 = c21276a.m87093a();
            Context context = getContext();
            Intrinsics.m97799e(context);
            DownloadManagerApi.m87078z0(downloadManagerApiM87093a2, subjectId, context, "music_stream_detail", null, 8, null);
            return;
        }
        Subject subject5 = this.mMovieDetailBean;
        if (subject5 != null) {
            Integer subjectType = subject5.getSubjectType();
            int value = SubjectType.SHORT_TV.getValue();
            if (subjectType != null && subjectType.intValue() == value) {
                DownloadManagerApi downloadManagerApiM87093a3 = c21276a.m87093a();
                Context context2 = getContext();
                Intrinsics.m97800f(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                FragmentActivity fragmentActivity = (FragmentActivity) context2;
                String str4 = this.ops;
                if (str4 == null || str4.length() == 0) {
                    Subject subject6 = this.mMovieDetailBean;
                    if (subject6 != null) {
                        ops2 = subject6.getOps();
                    }
                } else {
                    ops2 = this.ops;
                }
                downloadManagerApiM87093a3.m87086d0(fragmentActivity, "music_stream_detail", (384 & 4) != 0 ? "" : "", ops2, (384 & 16) != 0 ? null : "download_subject", (384 & 32) != 0 ? false : true, (384 & 64) != 0 ? null : this.mMovieDetailBean, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? Boolean.FALSE : null);
                return;
            }
        }
        VideoDetailMediaSource videoDetailMediaSource = (VideoDetailMediaSource) m86379s1().m86129x().m14847f();
        if (videoDetailMediaSource != null && videoDetailMediaSource.getSe() == this.curSeason) {
            ep2 = videoDetailMediaSource.getEp();
        }
        DownloadManagerApi downloadManagerApiM87093a4 = c21276a.m87093a();
        Context context3 = getContext();
        Intrinsics.m97800f(context3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity2 = (FragmentActivity) context3;
        Subject subject7 = this.mMovieDetailBean;
        String str5 = this.ops;
        if (str5 == null || str5.length() == 0) {
            Subject subject8 = this.mMovieDetailBean;
            if (subject8 != null) {
                ops = subject8.getOps();
            } else {
                str2 = null;
            }
            DownloadManagerApi.m87025N(downloadManagerApiM87093a4, fragmentActivity2, subject7, "music_stream_detail", "", str2, str, String.valueOf(ep2), this.moduleName, null, false, this.curSeason, false, 768, null);
        }
        ops = this.ops;
        str2 = ops;
        DownloadManagerApi.m87025N(downloadManagerApiM87093a4, fragmentActivity2, subject7, "music_stream_detail", "", str2, str, String.valueOf(ep2), this.moduleName, null, false, this.curSeason, false, 768, null);
    }

    /* JADX INFO: renamed from: e2 */
    private final void m86342e2(String subjectId) {
        C25917a.f79141a.m101736b(getClassTag() + " --> playNext() --> subjectId = " + subjectId);
        if (TextUtils.isEmpty(subjectId)) {
            C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.error_load_failed);
            return;
        }
        this.mSubjectId = subjectId;
        this.mMovieDetailBean = null;
        this.videoDetailStreamList = null;
        m86379s1().m86120C();
        MovieDetailViewModel movieDetailViewModelM86370p1 = m86370p1();
        int i11 = this.preloadId;
        String str = this.mSubjectId;
        if (str == null) {
            str = "";
        }
        MovieDetailViewModel.m70880T(movieDetailViewModelM86370p1, i11, str, null, 4, null);
        m86316R1(this.mSubjectId, true, "playNext()");
    }

    /* JADX INFO: renamed from: f1 */
    private final void m86343f1() {
        BubbleTextView bubbleTextView;
        this.hasClickedActivityTip = true;
        C25753f mViewBinding = getMViewBinding();
        if (mViewBinding == null || (bubbleTextView = mViewBinding.f78516b) == null) {
            return;
        }
        AbstractC26006c.m102054g(bubbleTextView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2 */
    public final void m86344f2(DownloadBean downloadBean) {
        this.downloadBean = downloadBean;
        m86400z2();
        String str = this.mSubjectId;
        if (str != null) {
            PlayMimeType playMimeType = PlayMimeType.DEFAULT;
            String subjectName = downloadBean.getSubjectName();
            String str2 = subjectName == null ? "" : subjectName;
            String str3 = this.lastPageFrom;
            String str4 = str3 == null ? "" : str3;
            List listM86384u1 = m86384u1(downloadBean);
            String cover = downloadBean.getCover();
            String str5 = cover == null ? "" : cover;
            String thumbnail = downloadBean.getThumbnail();
            String str6 = thumbnail == null ? "" : thumbnail;
            C24715a c24715a = new C24715a(str, playMimeType, 0L, 0, 0, str2, null, str4, "music_stream_detail", listM86384u1, str5, str6, "", 0, Integer.valueOf(downloadBean.getSubjectType()), false, downloadBean.getTitleName(), downloadBean.getOps(), 32832, null);
            c24715a.m97070z(this.mMovieDetailBean);
            C25917a.f79141a.m101735a(getClassTag() + " --> playOfflineMusic() --> 播放本地文件 --> addDataSource = " + c24715a + " -->  playerControl = " + this.playerControl);
            InterfaceC24450a interfaceC24450a = this.playerControl;
            if (interfaceC24450a != null) {
                interfaceC24450a.setDataSource(c24715a);
            }
        }
    }

    /* JADX INFO: renamed from: g1 */
    private final void m86345g1() {
        LinearLayout root;
        ViewParent parent;
        C25757j c25757j = this.loadingViewBinding;
        if (c25757j == null || (root = c25757j.getRoot()) == null || (parent = root.getParent()) == null || !(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).removeView(root);
    }

    /* JADX INFO: renamed from: g2 */
    private final void m86346g2(VideoDetailStreamList videoDetailStreamList) {
        List<VideoDetailStream> list;
        VideoDetailPlayBean videoDetailPlayBean;
        VideoDetailPlayBean videoDetailPlayBean2;
        Subject subject;
        List<DubsInfo> dubs;
        String averageHueLight;
        String thumbnail;
        String url;
        C25917a c25917a = C25917a.f79141a;
        c25917a.m101735a(getClassTag() + " --> playStream() --> videoDetailStreamList = " + videoDetailStreamList + " --> mMovieDetailBean = " + this.mMovieDetailBean);
        List<VideoDetailStream> streams = videoDetailStreamList != null ? videoDetailStreamList.getStreams() : null;
        if (videoDetailStreamList == null || (list = streams) == null || list.isEmpty()) {
            c25917a.m101736b(getClassTag() + " --> playStream() --> 空返回 --> videoDetailStreamList = " + videoDetailStreamList + " --> videoDetailStream = " + streams);
            return;
        }
        VideoDetailMediaSource videoDetailMediaSource = (VideoDetailMediaSource) m86379s1().m86129x().m14847f();
        if (videoDetailMediaSource != null && videoDetailMediaSource.getEp() == videoDetailStreamList.getEp() && videoDetailMediaSource.getSe() == videoDetailStreamList.getSe()) {
            if (this.curAudioTrackPlayProgress > 0) {
                c25917a.m101735a(getClassTag() + " --> playStream() --> 播放历史进度 --> AudioTrack -- seekTo = 0");
            } else {
                VideoDetailPlayBean videoDetailPlayBean3 = this.history;
                if (videoDetailPlayBean3 != null && videoDetailPlayBean3 != null && videoDetailStreamList.getSe() == videoDetailPlayBean3.getSe() && (videoDetailPlayBean = this.history) != null && videoDetailStreamList.getEp() == videoDetailPlayBean.getEp() && ((this.targetSeason > 0 && (videoDetailPlayBean2 = this.history) != null && videoDetailPlayBean2.getSe() == this.targetSeason) || this.targetSeason <= 0)) {
                    m86379s1().m86121n();
                }
            }
            PlayMimeType playMimeTypeM86367o1 = m86367o1((VideoDetailStream) CollectionsKt.m97359i0(streams));
            VideoDetailMediaSource videoDetailMediaSource2 = (VideoDetailMediaSource) m86379s1().m86129x().m14847f();
            int ep2 = videoDetailMediaSource2 != null ? videoDetailMediaSource2.getEp() : 0;
            int se2 = videoDetailMediaSource2 != null ? videoDetailMediaSource2.getSe() : 0;
            String str = this.mSubjectId;
            if (str == null || (subject = this.mMovieDetailBean) == null) {
                return;
            }
            String title = subject.getTitle();
            String str2 = title == null ? "" : title;
            String title2 = videoDetailStreamList.getTitle();
            String str3 = this.lastPageFrom;
            String str4 = str3 == null ? "" : str3;
            List listM86390w1 = m86390w1(streams);
            Cover cover = subject.getCover();
            String str5 = (cover == null || (url = cover.getUrl()) == null) ? "" : url;
            Cover cover2 = subject.getCover();
            String str6 = (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) ? "" : thumbnail;
            Cover cover3 = subject.getCover();
            String str7 = (cover3 == null || (averageHueLight = cover3.getAverageHueLight()) == null) ? "" : averageHueLight;
            Integer durationSeconds = subject.getDurationSeconds();
            int iIntValue = durationSeconds != null ? durationSeconds.intValue() : 0;
            Integer subjectType = subject.getSubjectType();
            int iIntValue2 = subjectType != null ? subjectType.intValue() : 1;
            Subject subject2 = this.mMovieDetailBean;
            String ops = subject2 != null ? subject2.getOps() : null;
            Subject subject3 = this.mMovieDetailBean;
            C24715a c24715a = new C24715a(str, playMimeTypeM86367o1, 0L, ep2, se2, str2, title2, str4, "music_stream_detail", listM86390w1, str5, str6, str7, iIntValue, Integer.valueOf(iIntValue2), false, subject3 != null ? subject3.getTitle() : null, ops, 32768, null);
            c24715a.m97070z(this.mMovieDetailBean);
            Subject subject4 = this.mMovieDetailBean;
            if (subject4 != null && (dubs = subject4.getDubs()) != null) {
                c24715a.m97045a().addAll(dubs);
            }
            m86400z2();
            c25917a.m101735a(getClassTag() + " --> playStream() --> playerControl?.setDataSource(playBean)");
            InterfaceC24450a interfaceC24450a = this.playerControl;
            if (interfaceC24450a != null) {
                interfaceC24450a.setDataSource(c24715a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public final void m86347h1() {
        InterfaceC24450a interfaceC24450a = this.playerControl;
        if (interfaceC24450a != null) {
            interfaceC24450a.removeNoNetError();
        }
        this.showNetErr = false;
    }

    /* JADX INFO: renamed from: h2 */
    private final void m86348h2(Subject subject) {
        Integer durationSeconds = subject.getDurationSeconds();
        Integer numValueOf = Integer.valueOf(durationSeconds != null ? durationSeconds.intValue() : 0);
        ResourceDetectors resourceDetector = subject.getResourceDetector();
        PreVideoAddress preVideoAddress = new PreVideoAddress(0, null, numValueOf, 0, 0, 0L, 0, resourceDetector != null ? resourceDetector.getDownloadUrl() : null, "", 0);
        Cover stills = subject.getStills();
        if (stills == null) {
            stills = subject.getCover();
        }
        Trailer trailer = new Trailer(SubjectType.MUSIC.getValue(), preVideoAddress, stills, null, null, 24, null);
        trailer.setSubjectId(subject.getSubjectId());
        trailer.setMusicName(subject.getTitle());
        m86350i2(trailer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final InterfaceC26241c m86349i1() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64868o1();
    }

    /* JADX INFO: renamed from: i2 */
    private final void m86350i2(Trailer trailer) {
        Subject subject;
        String averageHueLight;
        String thumbnail;
        String url;
        m86400z2();
        String str = this.mSubjectId;
        if (str == null || (subject = this.mMovieDetailBean) == null) {
            return;
        }
        PlayMimeType playMimeType = PlayMimeType.DEFAULT;
        String title = subject.getTitle();
        String str2 = title == null ? "" : title;
        String str3 = this.lastPageFrom;
        String str4 = str3 == null ? "" : str3;
        List listM86387v1 = m86387v1(trailer);
        Cover cover = trailer.getCover();
        String str5 = (cover == null || (url = cover.getUrl()) == null) ? "" : url;
        Cover cover2 = trailer.getCover();
        String str6 = (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) ? "" : thumbnail;
        Cover cover3 = subject.getCover();
        String str7 = (cover3 == null || (averageHueLight = cover3.getAverageHueLight()) == null) ? "" : averageHueLight;
        Integer durationSeconds = subject.getDurationSeconds();
        int iIntValue = durationSeconds != null ? durationSeconds.intValue() : 0;
        Integer subjectType = subject.getSubjectType();
        C24715a c24715a = new C24715a(str, playMimeType, 0L, 0, 0, str2, null, str4, "music_stream_detail", listM86387v1, str5, str6, str7, iIntValue, Integer.valueOf(subjectType != null ? subjectType.intValue() : 1), false, subject.getTitle(), subject.getOps(), 32832, null);
        c24715a.m97070z(this.mMovieDetailBean);
        C25917a.f79141a.m101735a(getClassTag() + " --> playTrailer() --> 当前有网络，没有下载资源 --> 播放流媒体数据 --> addDataSource = " + c24715a + " -->  playerControl = " + this.playerControl);
        InterfaceC24450a interfaceC24450a = this.playerControl;
        if (interfaceC24450a != null) {
            interfaceC24450a.setDataSource(c24715a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public final void m86352j1(VideoDetailMediaSource episodeMedia) {
        if (episodeMedia == null) {
            return;
        }
        VideoDetailStreamList videoDetailStreamList = (VideoDetailStreamList) m86379s1().m86128w().m14847f();
        if (videoDetailStreamList != null && videoDetailStreamList.getSe() == episodeMedia.getSe() && videoDetailStreamList.getEp() == episodeMedia.getEp()) {
            return;
        }
        InterfaceC24450a interfaceC24450a = this.playerControl;
        if (interfaceC24450a != null) {
            interfaceC24450a.reset();
        }
        showLoading();
        m86379s1().m86127v(episodeMedia);
        m86337c1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public static final InterfaceC23888a m86353j2() {
        return (InterfaceC23888a) TheRouter.m61774d(InterfaceC23888a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public final InterfaceC26241c m86355k1() {
        return (InterfaceC26241c) this.downloadDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public static final Unit m86356k2(MusicDetailFragment musicDetailFragment, boolean z11) {
        FragmentActivity activity;
        if (!C27287m.f83003a.m106330e() && musicDetailFragment.isMusicFloatViewClick && !z11 && (activity = musicDetailFragment.getActivity()) != null) {
            activity.finish();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final void m86358l1(MusicDetailFragment musicDetailFragment, View view) {
        musicDetailFragment.requireActivity().finish();
    }

    /* JADX INFO: renamed from: l2 */
    private final void m86359l2() {
        InterfaceC16634g player;
        if (this.downloadBean == null) {
            return;
        }
        InterfaceC24450a interfaceC24450a = this.playerControl;
        long currentPosition = (interfaceC24450a == null || (player = interfaceC24450a.getPlayer()) == null) ? 0L : player.getCurrentPosition();
        if (currentPosition > 0) {
            AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new MusicDetailFragment$saveDownloadHistory$1(this, currentPosition, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: m1 */
    private final MusicLikedFragmentViewModel m86361m1() {
        return (MusicLikedFragmentViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: renamed from: m2 */
    private final void m86362m2() {
        GradientTextView gradientTextView;
        AppCompatImageView appCompatImageView;
        final Subject subject = this.mMovieDetailBean;
        if (subject != null) {
            C25753f mViewBinding = getMViewBinding();
            if (mViewBinding != null && (appCompatImageView = mViewBinding.f78526l) != null) {
                appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.music.ui.q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MusicDetailFragment.m86365n2(this.f65909a, subject, view);
                    }
                });
            }
            C25753f mViewBinding2 = getMViewBinding();
            if (mViewBinding2 == null || (gradientTextView = mViewBinding2.f78535u) == null) {
                return;
            }
            gradientTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.music.ui.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MusicDetailFragment.m86368o2(this.f65912a, subject, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n1 */
    private final InterfaceC22998b m86364n1() {
        return (InterfaceC22998b) this.memberProvider.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public static final void m86365n2(MusicDetailFragment musicDetailFragment, Subject subject, View view) {
        String url;
        InterfaceC23888a interfaceC23888aM86376r1 = musicDetailFragment.m86376r1();
        if (interfaceC23888aM86376r1 != null) {
            Context context = view.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            String str = musicDetailFragment.mSubjectId;
            if (str == null) {
                str = "";
            }
            Cover cover = subject.getCover();
            if (cover == null || (url = cover.getUrl()) == null) {
                url = "";
            }
            String title = subject.getTitle();
            if (title == null) {
                title = "";
            }
            String description = subject.getDescription();
            if (description == null) {
                description = "";
            }
            interfaceC23888aM86376r1.mo75361e(context, str, url, title, description, 3);
        }
        C14450a.f50860a.m65145h("subjectdetail", "post", (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
    }

    /* JADX INFO: renamed from: o1 */
    private final PlayMimeType m86367o1(VideoDetailStream stream) {
        String upperCase = stream.getFormat().toUpperCase(Locale.ROOT);
        Intrinsics.m97801g(upperCase, "toUpperCase(...)");
        if (Intrinsics.m97797c(upperCase, "DASH")) {
            return PlayMimeType.DASH;
        }
        return Intrinsics.m97797c(upperCase, "HLS") ? PlayMimeType.HLS : PlayMimeType.DEFAULT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public static final void m86368o2(MusicDetailFragment musicDetailFragment, Subject subject, View view) {
        String url;
        InterfaceC23888a interfaceC23888aM86376r1 = musicDetailFragment.m86376r1();
        if (interfaceC23888aM86376r1 != null) {
            Context context = view.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            String str = musicDetailFragment.mSubjectId;
            if (str == null) {
                str = "";
            }
            Cover cover = subject.getCover();
            if (cover == null || (url = cover.getUrl()) == null) {
                url = "";
            }
            String title = subject.getTitle();
            if (title == null) {
                title = "";
            }
            String description = subject.getDescription();
            if (description == null) {
                description = "";
            }
            interfaceC23888aM86376r1.mo75361e(context, str, url, title, description, 3);
        }
        C14450a.f50860a.m65145h("subjectdetail", "post", (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
    }

    /* JADX INFO: renamed from: p1 */
    private final MovieDetailViewModel m86370p1() {
        return (MovieDetailViewModel) this.movieDetailViewModel.getValue();
    }

    /* JADX INFO: renamed from: p2 */
    private final void m86371p2(Subject subject) {
        Cover stills;
        FrameLayout frameLayout;
        if (subject != null) {
            Trailer trailer = subject.getTrailer();
            if ((trailer == null || (stills = trailer.getCover()) == null) && (stills = subject.getStills()) == null) {
                stills = subject.getCover();
            }
            if (stills != null) {
                int iM66409f = C14752e.m66409f();
                C25753f mViewBinding = getMViewBinding();
                if (mViewBinding == null || (frameLayout = mViewBinding.f78523i) == null) {
                    return;
                }
                if (frameLayout.getChildCount() == 0) {
                    ImageView imageView = new ImageView(frameLayout.getContext());
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    frameLayout.addView(imageView, new FrameLayout.LayoutParams(iM66409f, (iM66409f * 9) / 16));
                    C23860f.a aVar = C23860f.f72909a;
                    String url = stills.getUrl();
                    String strM94447e = C23860f.a.m94447e(aVar, url == null ? "" : url, iM66409f, false, false, 12, null);
                    String thumbnail = stills.getThumbnail();
                    C14291e.m64747d(C14291e.f50565a, thumbnail == null ? "" : thumbnail, 0, 0, new Function1() { // from class: com.transsion.videodetail.music.ui.v
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MusicDetailFragment.m86374q2(this.f65922a, (BitmapDrawable) obj);
                        }
                    }, 6, null);
                    Context context = imageView.getContext();
                    Intrinsics.m97801g(context, "getContext(...)");
                    aVar.m94457m(context).m94468g(strM94447e).m94470i(R$color.transparent).m94465d(imageView);
                }
            }
        }
    }

    /* JADX INFO: renamed from: q1 */
    private final VideoDetailMediaSource m86373q1(VideoDetailPlayBean history, List episodeMediaList) {
        Object obj = null;
        if (history == null) {
            C26866a.a.m104898f(C26866a.f81698a, "MusicDetailFragment", "getPlayingItem 无历史记录，se:" + this.targetSeason, false, 4, null);
            if (this.targetSeason <= 0) {
                return (VideoDetailMediaSource) CollectionsKt.m97361k0(episodeMediaList);
            }
            for (Object obj2 : episodeMediaList) {
                VideoDetailMediaSource videoDetailMediaSource = (VideoDetailMediaSource) obj2;
                if (videoDetailMediaSource.getSe() == this.targetSeason && videoDetailMediaSource.getEp() == 1) {
                    obj = obj2;
                    break;
                }
            }
            VideoDetailMediaSource videoDetailMediaSource2 = (VideoDetailMediaSource) obj;
            return videoDetailMediaSource2 == null ? (VideoDetailMediaSource) CollectionsKt.m97361k0(episodeMediaList) : videoDetailMediaSource2;
        }
        int se2 = history.getSe();
        int i11 = this.targetSeason;
        if (se2 == i11 || i11 <= 0) {
            this.curSeason = history.getSe();
            C26866a.a.m104898f(C26866a.f81698a, "MusicDetailFragment", "getPlayingItem 有历史记录，不指定季使用历史记录，se:" + history.getSe() + ", ep:" + history.getEp(), false, 4, null);
            for (Object obj3 : episodeMediaList) {
                VideoDetailMediaSource videoDetailMediaSource3 = (VideoDetailMediaSource) obj3;
                if (videoDetailMediaSource3.getSe() == history.getSe() && videoDetailMediaSource3.getEp() == history.getEp()) {
                    obj = obj3;
                    break;
                }
            }
            VideoDetailMediaSource videoDetailMediaSource4 = (VideoDetailMediaSource) obj;
            return videoDetailMediaSource4 == null ? (VideoDetailMediaSource) CollectionsKt.m97361k0(episodeMediaList) : videoDetailMediaSource4;
        }
        C26866a.a.m104898f(C26866a.f81698a, "MusicDetailFragment", "getPlayingItem 有历史记录，指定季，history se:" + history.getSe() + ", ep:" + history.getEp() + "， target se:" + this.targetSeason + ", targetEp:" + this.targetEp, false, 4, null);
        for (Object obj4 : episodeMediaList) {
            VideoDetailMediaSource videoDetailMediaSource5 = (VideoDetailMediaSource) obj4;
            if (videoDetailMediaSource5.getSe() == this.targetSeason) {
                int ep2 = videoDetailMediaSource5.getEp();
                int i12 = this.targetEp;
                if (i12 <= 0) {
                    i12 = 1;
                }
                if (ep2 == i12) {
                    obj = obj4;
                    break;
                }
            }
        }
        VideoDetailMediaSource videoDetailMediaSource6 = (VideoDetailMediaSource) obj;
        return videoDetailMediaSource6 == null ? (VideoDetailMediaSource) CollectionsKt.m97361k0(episodeMediaList) : videoDetailMediaSource6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public static final Unit m86374q2(MusicDetailFragment musicDetailFragment, BitmapDrawable drawable) {
        FrameLayout frameLayout;
        Intrinsics.m97802h(drawable, "drawable");
        C25753f mViewBinding = musicDetailFragment.getMViewBinding();
        if (mViewBinding != null && (frameLayout = mViewBinding.f78523i) != null) {
            frameLayout.setBackground(drawable);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: r1 */
    private final InterfaceC23888a m86376r1() {
        return (InterfaceC23888a) this.publishedApi.getValue();
    }

    /* JADX INFO: renamed from: r2 */
    private final void m86377r2(boolean proactive) {
        Subject subject = this.mMovieDetailBean;
        if (subject == null || subject.getSubjectType() == null) {
            SubjectType.MOVIE.getValue();
        }
        SubjectType.MUSIC.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public final VideoDetailViewModel m86379s1() {
        return (VideoDetailViewModel) this.videoDetailViewModel.getValue();
    }

    /* JADX INFO: renamed from: s2 */
    private final void m86380s2() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        View view = this.gameResView;
        ViewParent parent = view != null ? view.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.gameResView);
        }
        KeyEvent.Callback callback = this.gameResView;
        InterfaceC27084c interfaceC27084c = callback instanceof InterfaceC27084c ? (InterfaceC27084c) callback : null;
        if (interfaceC27084c != null) {
            interfaceC27084c.setPageStyle("detail");
        }
        C25753f mViewBinding = getMViewBinding();
        if (mViewBinding != null && (frameLayout3 = mViewBinding.f78524j) != null) {
            AbstractC26006c.m102058k(frameLayout3);
        }
        C25753f mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (frameLayout2 = mViewBinding2.f78524j) != null) {
            frameLayout2.removeAllViews();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C25753f mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (frameLayout = mViewBinding3.f78524j) == null) {
            return;
        }
        frameLayout.addView(this.gameResView, layoutParams);
    }

    private final void showLoading() {
        LinearLayout root;
        C25753f mViewBinding;
        FrameLayout frameLayout;
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (this.loadingViewBinding == null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            C25753f mViewBinding2 = getMViewBinding();
            this.loadingViewBinding = C25757j.m101299c(layoutInflaterFrom, mViewBinding2 != null ? mViewBinding2.f78523i : null, false);
        }
        C25757j c25757j = this.loadingViewBinding;
        if (c25757j == null || (root = c25757j.getRoot()) == null) {
            return;
        }
        if (root.getParent() == null && (mViewBinding = getMViewBinding()) != null && (frameLayout = mViewBinding.f78523i) != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            layoutParams.bottomMargin = AbstractC5790i.m27411e(20.0f);
            Unit unit = Unit.f75682a;
            frameLayout.addView(root, layoutParams);
        }
        AbstractC26006c.m102058k(root);
    }

    /* JADX INFO: renamed from: t2 */
    private final void m86382t2(Subject subject) {
    }

    /* JADX INFO: renamed from: u1 */
    private final List m86384u1(DownloadBean downloadBean) {
        String string;
        String string2;
        ArrayList arrayList = new ArrayList();
        PlayMimeType playMimeType = PlayMimeType.DEFAULT;
        String resourceId = downloadBean.getResourceId();
        String str = resourceId == null ? "" : resourceId;
        String path = downloadBean.getPath();
        String str2 = path == null ? "" : path;
        Long size = downloadBean.getSize();
        String str3 = (size == null || (string2 = size.toString()) == null) ? "" : string2;
        Long duration = downloadBean.getDuration();
        arrayList.add(new C24717c(playMimeType, str, str2, "", str3, (duration == null || (string = duration.toString()) == null) ? "" : string, "", null, 128, null));
        return arrayList;
    }

    /* JADX INFO: renamed from: u2 */
    private final void m86385u2(final Subject subject) {
        m86361m1().m86233E(subject.getSubjectId(), new Function1() { // from class: com.transsion.videodetail.music.ui.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MusicDetailFragment.m86388v2(this.f65917a, subject, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v1 */
    private final List m86387v1(Trailer trailer) {
        Integer duration;
        String string;
        Long size;
        String string2;
        String url;
        String videoId;
        ArrayList arrayList = new ArrayList();
        PlayMimeType playMimeType = PlayMimeType.DEFAULT;
        PreVideoAddress videoAddress = trailer.getVideoAddress();
        String str = (videoAddress == null || (videoId = videoAddress.getVideoId()) == null) ? "" : videoId;
        PreVideoAddress videoAddress2 = trailer.getVideoAddress();
        String str2 = (videoAddress2 == null || (url = videoAddress2.getUrl()) == null) ? "" : url;
        PreVideoAddress videoAddress3 = trailer.getVideoAddress();
        String str3 = (videoAddress3 == null || (size = videoAddress3.getSize()) == null || (string2 = size.toString()) == null) ? "" : string2;
        PreVideoAddress videoAddress4 = trailer.getVideoAddress();
        arrayList.add(new C24717c(playMimeType, str, str2, "", str3, (videoAddress4 == null || (duration = videoAddress4.getDuration()) == null || (string = duration.toString()) == null) ? "" : string, "", null, 128, null));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public static final Unit m86388v2(MusicDetailFragment musicDetailFragment, Subject subject, String path) {
        Intrinsics.m97802h(path, "path");
        if (TextUtils.isEmpty(path)) {
            musicDetailFragment.m86348h2(subject);
        } else {
            musicDetailFragment.m86338c2(subject.getSubjectId());
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: w1 */
    private final List m86390w1(List videoDetailStream) {
        ArrayList arrayList = new ArrayList();
        if (videoDetailStream != null) {
            Iterator it = videoDetailStream.iterator();
            while (it.hasNext()) {
                VideoDetailStream videoDetailStream2 = (VideoDetailStream) it.next();
                arrayList.add(new C24717c(m86367o1(videoDetailStream2), videoDetailStream2.getId(), videoDetailStream2.getUrl(), videoDetailStream2.getResolutions(), videoDetailStream2.getSize(), videoDetailStream2.getDuration(), videoDetailStream2.getSignCookie(), null, 128, null));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w2 */
    private final void m86391w2() {
        InterfaceC24450a interfaceC24450a = this.playerControl;
        if (interfaceC24450a != null) {
            interfaceC24450a.showNoNetError();
        }
        this.showNetErr = true;
    }

    /* JADX INFO: renamed from: x1 */
    private final void m86393x1() {
        VideoDetailStreamList videoDetailStreamList;
        VideoDetailMediaSource videoDetailMediaSource;
        if (this.mMovieDetailBean == null || (videoDetailStreamList = (VideoDetailStreamList) m86379s1().m86128w().m14847f()) == null || (videoDetailMediaSource = (VideoDetailMediaSource) m86379s1().m86129x().m14847f()) == null || Intrinsics.m97797c(videoDetailStreamList, this.videoDetailStreamList) || videoDetailMediaSource.getEp() != videoDetailStreamList.getEp() || videoDetailMediaSource.getSe() != videoDetailStreamList.getSe()) {
            return;
        }
        this.videoDetailStreamList = videoDetailStreamList;
        m86345g1();
        m86346g2(videoDetailStreamList);
    }

    /* JADX INFO: renamed from: x2 */
    private final void m86394x2() {
        if (C27287m.f83003a.m106330e()) {
            return;
        }
        m86361m1().m86234F(this.mSubjectId, new Function1() { // from class: com.transsion.videodetail.music.ui.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MusicDetailFragment.m86397y2(this.f65877a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: y1 */
    private final void m86396y1() {
        BubbleTextView bubbleTextView;
        BubbleTextView bubbleTextView2;
        BubbleTextView bubbleTextView3;
        C25753f mViewBinding = getMViewBinding();
        if (mViewBinding != null && (bubbleTextView3 = mViewBinding.f78516b) != null) {
            bubbleTextView3.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.music.ui.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MusicDetailFragment.m86399z1(this.f65898a, view);
                }
            });
        }
        C25753f mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (bubbleTextView2 = mViewBinding2.f78516b) != null) {
            AbstractC26006c.m102058k(bubbleTextView2);
        }
        m86335b1();
        C25753f mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (bubbleTextView = mViewBinding3.f78516b) == null) {
            return;
        }
        AbstractC26006c.m102054g(bubbleTextView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public static final Unit m86397y2(MusicDetailFragment musicDetailFragment, boolean z11) {
        C25917a.f79141a.m101735a(musicDetailFragment.getClassTag() + " --> showNoNetworkLayout() --> 当前无网络且是收藏Music");
        musicDetailFragment.m86278B2(true);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public static final void m86399z1(MusicDetailFragment musicDetailFragment, View view) {
        C26866a.a.m104898f(C26866a.f81698a, "MusicDetailFragment", "Click activity tip", false, 4, null);
        musicDetailFragment.hasClickedActivityTip = true;
        Intrinsics.m97799e(view);
        AbstractC26006c.m102054g(view);
    }

    /* JADX INFO: renamed from: z2 */
    private final void m86400z2() {
        Context context;
        Integer subjectType;
        if (this.playerControl == null && (context = getContext()) != null) {
            Subject subject = this.mMovieDetailBean;
            LongVodPageType longVodPageType = ((subject == null || (subjectType = subject.getSubjectType()) == null) ? SubjectType.MOVIE.getValue() : subjectType.intValue()) == SubjectType.MUSIC.getValue() ? LongVodPageType.MUSIC : LongVodPageType.MUSIC;
            C25753f mViewBinding = getMViewBinding();
            if (mViewBinding != null) {
                LongVodPlayerView longVodPlayerView = new LongVodPlayerView(context);
                String strName = longVodPageType.name();
                Subject subject2 = this.mMovieDetailBean;
                InterfaceC24450a.a.m95941a(longVodPlayerView, "music_stream_detail", longVodPageType, strName + (subject2 != null ? subject2.getSubjectId() : null), mViewBinding.f78521g, mViewBinding.f78527m.f77877f, null, null, 96, null);
                longVodPlayerView.setFeedBackVisible(true);
                longVodPlayerView.setFragmentId(this.fragmentId);
                mViewBinding.f78523i.addView(longVodPlayerView);
                longVodPlayerView.setMusicLikedFragment(this.isMusicLikedFragment);
                this.playerControl = longVodPlayerView;
            }
            Subject subject3 = this.mMovieDetailBean;
            if (subject3 != null) {
                m86302K1(subject3);
            }
            InterfaceC24450a interfaceC24450a = this.playerControl;
            if (interfaceC24450a != null) {
                interfaceC24450a.setCallback(new C21000g());
            }
        }
    }

    @Override // co.InterfaceC5146a
    /* JADX INFO: renamed from: S */
    public void mo24053S(Function0 callback) {
        this.backPressedCallback = callback;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getLoadingView() {
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R$layout.default_movie_detail_skeleton_drawing_layout, (ViewGroup) getFlStateView(), false);
        ((AppCompatImageView) viewInflate.findViewById(R$id.ivBack)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.music.ui.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicDetailFragment.m86358l1(this.f65901a, view);
            }
        });
        return viewInflate;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        C14492k.f50955a.m65317g(this);
        requireActivity().getOnBackPressedDispatcher().m942i(this, new C20997d());
        C25753f mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            mViewBinding.f78525k.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.music.ui.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MusicDetailFragment.m86292G1(this.f65883a, view);
                }
            });
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        View view;
        View view2;
        C25753f mViewBinding = getMViewBinding();
        ViewGroup.LayoutParams layoutParams = (mViewBinding == null || (view2 = mViewBinding.f78536v) == null) ? null : view2.getLayoutParams();
        ConstraintLayout.C2308b c2308b = layoutParams instanceof ConstraintLayout.C2308b ? (ConstraintLayout.C2308b) layoutParams : null;
        if (c2308b != null) {
            ((ViewGroup.MarginLayoutParams) c2308b).topMargin = AbstractC5781d.m27351c();
        }
        C25753f mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (view = mViewBinding2.f78536v) != null) {
            view.setLayoutParams(c2308b);
        }
        m86396y1();
        m86280C1();
        m86295H1();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m86370p1().m70910F().m14851j(this, new C20999f(new Function1() { // from class: com.transsion.videodetail.music.ui.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MusicDetailFragment.m86308N1(this.f65887a, (Pair) obj);
            }
        }));
        m86379s1().m86126u().m14851j(this, new C20999f(new Function1() { // from class: com.transsion.videodetail.music.ui.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MusicDetailFragment.m86310O1(this.f65888a, (VideoDetailPlayBean) obj);
            }
        }));
        m86370p1().m70914K().m14851j(this, new C20999f(new Function1() { // from class: com.transsion.videodetail.music.ui.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MusicDetailFragment.m86312P1(this.f65890a, (Integer) obj);
            }
        }));
        m86379s1().m86130y().m14851j(this, new C20999f(new Function1() { // from class: com.transsion.videodetail.music.ui.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MusicDetailFragment.m86314Q1(this.f65892a, (ResourcesSeasonList) obj);
            }
        }));
        m86379s1().m86124s().m14851j(this, new C20999f(new Function1() { // from class: com.transsion.videodetail.music.ui.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MusicDetailFragment.m86306M1(this.f65895a, (List) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void loadDefaultData() {
        super.loadDefaultData();
        m86318S1(this, this.mSubjectId, false, "loadDefaultData()", 2, null);
        m86394x2();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("music_stream_detail", false, 2, null);
    }

    @Override // com.transsion.baselib.report.C14492k.a
    public void onBackgroundStatusChange(boolean isBackground) {
        C25753f mViewBinding;
        FrameLayout frameLayout;
        if (!isBackground || (mViewBinding = getMViewBinding()) == null || (frameLayout = mViewBinding.f78523i) == null) {
            return;
        }
        frameLayout.postDelayed(new Runnable() { // from class: com.transsion.videodetail.music.ui.u
            @Override // java.lang.Runnable
            public final void run() {
                MusicDetailFragment.m86326W1(this.f65920a);
            }
        }, 500L);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C25917a.f79141a.m101735a(getClassTag() + " --> onCreate() --> 音乐详情页");
        C27287m.f83003a.m106336l(this.networkStatusChangedListener);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        InterfaceC24450a interfaceC24450a;
        super.onDestroy();
        MusicFloatManager.C14535a c14535a = MusicFloatManager.f51050h;
        c14535a.m65598b().m65594w().remove(this.fragmentId);
        if (!this.isFloatShow && c14535a.m65598b().m65594w().isEmpty() && (interfaceC24450a = this.playerControl) != null) {
            interfaceC24450a.release();
        }
        InterfaceC24450a interfaceC24450a2 = this.playerControl;
        if (interfaceC24450a2 != null) {
            interfaceC24450a2.onPageDestroy();
        }
        C27287m.f83003a.m106337m(this.networkStatusChangedListener);
        C14492k.f50955a.m65326t(this);
        if (this.isMusicLikedFragment) {
            C25918b.f79142a.m101739b(false);
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        InterfaceC24450a interfaceC24450a;
        super.onPause();
        if (this.isFloatShow || (interfaceC24450a = this.playerControl) == null) {
            return;
        }
        interfaceC24450a.onViewPause();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        InterfaceC24450a interfaceC24450a = this.playerControl;
        if (interfaceC24450a != null) {
            interfaceC24450a.onViewResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        m86359l2();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        HashMap mapM96844g;
        this.lastPageFrom = C24662i.f75350a.m96877i();
        Bundle arguments = getArguments();
        this.ops = arguments != null ? arguments.getString("ops") : null;
        Bundle arguments2 = getArguments();
        this.mSubjectId = arguments2 != null ? arguments2.getString("id") : null;
        Bundle arguments3 = getArguments();
        boolean z11 = false;
        this.autoDownload = arguments3 != null ? arguments3.getBoolean("auto_download") : false;
        Bundle arguments4 = getArguments();
        this.autoPlay = arguments4 != null ? arguments4.getBoolean("auto_play") : false;
        Bundle arguments5 = getArguments();
        this.autoPlayResourceId = arguments5 != null ? arguments5.getString("auto_play_resource_id") : null;
        Bundle arguments6 = getArguments();
        this.preloadId = arguments6 != null ? arguments6.getInt("yy_preload_id") : 0;
        MovieDetailViewModel movieDetailViewModelM86370p1 = m86370p1();
        int i11 = this.preloadId;
        String str = this.mSubjectId;
        MovieDetailViewModel.m70880T(movieDetailViewModelM86370p1, i11, str == null ? "" : str, null, 4, null);
        Bundle arguments7 = getArguments();
        this.moduleName = arguments7 != null ? arguments7.getString("module_name") : null;
        Bundle arguments8 = getArguments();
        this.targetSeason = arguments8 != null ? arguments8.getInt("season") : 0;
        Bundle arguments9 = getArguments();
        this.targetEp = arguments9 != null ? arguments9.getInt("episode") : 0;
        int i12 = this.targetSeason;
        if (i12 <= 0) {
            i12 = 1;
        }
        this.curSeason = i12;
        Bundle arguments10 = getArguments();
        this.isMusicLikedFragment = arguments10 != null && arguments10.getBoolean("is_music_liked_fragment");
        Bundle arguments11 = getArguments();
        if (arguments11 != null && arguments11.getBoolean("is_music_float_view_click")) {
            z11 = true;
        }
        this.isMusicFloatViewClick = z11;
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
            String str2 = this.mSubjectId;
            mapM96844g.put("subject_id", str2 != null ? str2 : "");
        }
        m86361m1().m86234F(this.mSubjectId, new Function1() { // from class: com.transsion.videodetail.music.ui.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MusicDetailFragment.m86356k2(this.f65884a, ((Boolean) obj).booleanValue());
            }
        });
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        if (this.mMovieDetailBean == null) {
            AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new C210011(null), 3, null);
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public C25753f getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25753f c25753fM101283c = C25753f.m101283c(inflater);
        Intrinsics.m97801g(c25753fM101283c, "inflate(...)");
        return c25753fM101283c;
    }
}
