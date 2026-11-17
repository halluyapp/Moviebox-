package com.transsion.videodetail;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
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
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import co.InterfaceC5146a;
import com.avery.subtitle.widget.SimpleSubtitleView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.AbstractC5790i;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.view.bubbleview.BubbleTextView;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.base.image.blurhash.C14291e;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baselib.p291db.video.VideoDetailPlayBean;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.activity.BaseMusicFloatActivity;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.util.AbstractC14556b;
import com.transsion.baseui.widget.GradientTextView;
import com.transsion.bean.GameInfoType;
import com.transsion.core.utils.C14752e;
import com.transsion.moviedetail.activity.MovieDetailActivity;
import com.transsion.moviedetail.fragment.ResourceDetectorEmptyFragment;
import com.transsion.moviedetail.fragment.ResourceDetectorFamilyModeFragment;
import com.transsion.moviedetail.fragment.RestrictTipsDialog;
import com.transsion.moviedetail.viewmodel.MovieDetailViewModel;
import com.transsion.moviedetailapi.DownloadItem;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.DubsInfo;
import com.transsion.moviedetailapi.bean.ResourceDetectors;
import com.transsion.moviedetailapi.bean.ResourcesSeasonList;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.SubjectGameInfo;
import com.transsion.moviedetailapi.bean.Trailer;
import com.transsion.p285ad.strategy.C14058c;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.player.longvideo.constants.LongVodPageType;
import com.transsion.player.longvideo.p302ui.LongVodPlayerView;
import com.transsion.player.longvideo.p302ui.LongVodUiType;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.p1003enum.PlayMimeType;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.postdetail.shorttv.widget.ShortTVHistoryView;
import com.transsion.push.PushConstants;
import com.transsion.usercenter.setting.labelsfeedback.model.FbTvData;
import com.transsion.videodetail.bean.VideoDetailMediaSource;
import com.transsion.videodetail.bean.VideoDetailStream;
import com.transsion.videodetail.bean.VideoDetailStreamList;
import com.transsion.videodetail.util.StreamFloatManager;
import com.transsion.videofloat.bean.FloatActionType;
import com.transsion.videofloat.bean.FloatPlayType;
import com.transsion.wrapperad.view.cardpage.NativeCardPageAdHelper;
import com.transsion.wrapperad.view.cardpage.NativeCardPageView;
import com.transsnet.downloader.DownloadManagerApi;
import com.transsnet.downloader.viewmodel.C22169k0;
import com.transsnet.downloader.widget.DownloadView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jo.InterfaceC24450a;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import mo.C25894a;
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
import p586lx.C25756i;
import p586lx.C25757j;
import p710qk.InterfaceC27083b;
import p710qk.InterfaceC27084c;
import p723qx.C27136c;
import p723qx.InterfaceC27135b;
import p723qx.InterfaceC27138e;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import p755rx.C27425a;
import p824ux.InterfaceC28047a;
import p913xm.C28615f;
import p914xn.C28623e;
import p914xn.C28625g;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000¤\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0002í\u0001\u0018\u0000 ÿ\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0085\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0019\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u0005J)\u0010 \u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\u0005J\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\u0005J\u0019\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+J%\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\u001eH\u0002¢\u0006\u0004\b0\u00101J\u0019\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u000eH\u0002¢\u0006\u0004\b7\u0010\u0011J\u000f\u00108\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u0010\u0005J\u000f\u00109\u001a\u00020\u0006H\u0002¢\u0006\u0004\b9\u0010\u0005J\u000f\u0010:\u001a\u00020\u0006H\u0002¢\u0006\u0004\b:\u0010\u0005J\u000f\u0010;\u001a\u00020\u0006H\u0002¢\u0006\u0004\b;\u0010\u0005J\u000f\u0010<\u001a\u00020\u0006H\u0002¢\u0006\u0004\b<\u0010\u0005J\u000f\u0010=\u001a\u00020\u000eH\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0006H\u0002¢\u0006\u0004\b?\u0010\u0005J\u000f\u0010@\u001a\u00020\u0006H\u0002¢\u0006\u0004\b@\u0010\u0005J\u000f\u0010A\u001a\u00020\u0006H\u0002¢\u0006\u0004\bA\u0010\u0005J\u000f\u0010B\u001a\u00020\u0006H\u0002¢\u0006\u0004\bB\u0010\u0005J\u000f\u0010C\u001a\u00020\u0006H\u0002¢\u0006\u0004\bC\u0010\u0005J\u0019\u0010F\u001a\u00020\u00062\b\b\u0002\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0006H\u0002¢\u0006\u0004\bH\u0010\u0005J\u000f\u0010I\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010\u0005J\u0017\u0010L\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u0011\u0010O\u001a\u0004\u0018\u00010NH\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0006H\u0002¢\u0006\u0004\bQ\u0010\u0005J\u0017\u0010T\u001a\u00020\u00062\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0006H\u0002¢\u0006\u0004\bV\u0010\u0005J\u0017\u0010W\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bW\u0010\u0016J\u0017\u0010Z\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bZ\u0010[J\u0019\u0010^\u001a\u00020\u00062\b\u0010]\u001a\u0004\u0018\u00010\\H\u0002¢\u0006\u0004\b^\u0010_J\u0019\u0010b\u001a\u00020\u00062\b\u0010a\u001a\u0004\u0018\u00010`H\u0016¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\u0006H\u0016¢\u0006\u0004\bd\u0010\u0005J\u0017\u0010g\u001a\u00020\u00022\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\\H\u0016¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\u000eH\u0016¢\u0006\u0004\bk\u0010>J\u000f\u0010l\u001a\u00020\u0006H\u0016¢\u0006\u0004\bl\u0010\u0005J\u000f\u0010m\u001a\u00020\u0006H\u0016¢\u0006\u0004\bm\u0010\u0005J\u000f\u0010n\u001a\u00020\u0006H\u0016¢\u0006\u0004\bn\u0010\u0005J\u000f\u0010o\u001a\u00020\u0006H\u0016¢\u0006\u0004\bo\u0010\u0005J\u000f\u0010q\u001a\u00020pH\u0016¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020\u0006H\u0016¢\u0006\u0004\bs\u0010\u0005J\u0011\u0010u\u001a\u0004\u0018\u00010tH\u0016¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020\u0006H\u0016¢\u0006\u0004\bw\u0010\u0005J\u000f\u0010x\u001a\u00020\u0006H\u0016¢\u0006\u0004\bx\u0010\u0005J\u000f\u0010y\u001a\u00020\u0006H\u0016¢\u0006\u0004\by\u0010\u0005J\r\u0010z\u001a\u00020\u0006¢\u0006\u0004\bz\u0010\u0005J\u0017\u0010|\u001a\u00020\u00062\u0006\u0010{\u001a\u00020\u000eH\u0016¢\u0006\u0004\b|\u0010\u0011J\u000f\u0010}\u001a\u00020\u0006H\u0016¢\u0006\u0004\b}\u0010\u0005J\u000f\u0010~\u001a\u00020\u0006H\u0016¢\u0006\u0004\b~\u0010\u0005J\u000f\u0010\u007f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u007f\u0010\u0005J$\u0010\u0082\u0001\u001a\u00020\u00062\u0010\u0010\u0081\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0080\u0001H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R!\u0010\u0094\u0001\u001a\u00030\u008f\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R!\u0010\u0099\u0001\u001a\u00030\u0095\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0091\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R!\u0010\u009e\u0001\u001a\u00030\u009a\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u0091\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R#\u0010£\u0001\u001a\u0005\u0018\u00010\u009f\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b \u0001\u0010\u0091\u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R\u001b\u0010¦\u0001\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u001b\u0010¨\u0001\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¥\u0001R\u0019\u0010«\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001b\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010¥\u0001R\u0019\u0010¯\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010ª\u0001R\u0019\u0010±\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010ª\u0001R\u001b\u0010³\u0001\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010¥\u0001R(\u0010¹\u0001\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0005\b¸\u0001\u0010GR\u0019\u0010»\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010µ\u0001R\u0019\u0010½\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010µ\u0001R\u0019\u0010¿\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010µ\u0001R\u001b\u0010Á\u0001\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010¥\u0001R\u0019\u0010Ã\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010ª\u0001R\u001b\u0010Æ\u0001\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0019\u0010È\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010ª\u0001R\u001c\u0010Ì\u0001\u001a\u0005\u0018\u00010É\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R#\u0010Ñ\u0001\u001a\u0005\u0018\u00010Í\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÎ\u0001\u0010\u0091\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u0019\u0010Ô\u0001\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u0019\u0010×\u0001\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R\"\u0010Ú\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u0019\u0010Ü\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010ª\u0001R\u0019\u0010Þ\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010ª\u0001R\u001c\u0010â\u0001\u001a\u0005\u0018\u00010ß\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u0019\u0010ä\u0001\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bã\u0001\u0010Ó\u0001R\u0019\u0010æ\u0001\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010Ó\u0001R\u0019\u0010è\u0001\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bç\u0001\u0010Ó\u0001R\u0019\u0010ê\u0001\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0001\u0010Ó\u0001R\u0019\u0010ë\u0001\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010Ó\u0001R\u0019\u0010ì\u0001\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ó\u0001R\u0018\u0010ð\u0001\u001a\u00030í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u001a\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R \u0010ö\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010(0ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bô\u0001\u0010õ\u0001R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010ø\u0001R\u001c\u0010ü\u0001\u001a\u0005\u0018\u00010ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R\u0019\u0010þ\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bý\u0001\u0010ª\u0001¨\u0006\u0080\u0002"}, m97100d2 = {"Lcom/transsion/videodetail/StreamDetailFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Llx/i;", "Lco/a;", "<init>", "()V", "", "b2", "r1", "Lcom/transsion/videodetail/bean/VideoDetailMediaSource;", "episodeMedia", "f1", "(Lcom/transsion/videodetail/bean/VideoDetailMediaSource;)V", "Z0", "", "isAudioTracksChange", "P1", "(Z)V", "n2", "Lcom/transsion/moviedetailapi/bean/Subject;", "movieDetailBean", "t2", "(Lcom/transsion/moviedetailapi/bean/Subject;)V", "u1", "r2", "subject", "e2", "B1", "Lcom/transsion/baselib/db/video/VideoDetailPlayBean;", ShortTVHistoryView.TYPE_HISTORY, "", "episodeMediaList", "m1", "(Lcom/transsion/baselib/db/video/VideoDetailPlayBean;Ljava/util/List;)Lcom/transsion/videodetail/bean/VideoDetailMediaSource;", "a1", "l2", "Lko/a;", "bean", "V1", "(Lko/a;)V", "Lcom/transsion/videodetail/bean/VideoDetailStreamList;", "videoDetailStreamList", "X1", "(Lcom/transsion/videodetail/bean/VideoDetailStreamList;)V", "Lcom/transsion/videodetail/bean/VideoDetailStream;", "videoDetailStream", "", "Lko/c;", "q1", "(Ljava/util/List;)Ljava/util/List;", "stream", "Lcom/transsion/player/enum/PlayMimeType;", "k1", "(Lcom/transsion/videodetail/bean/VideoDetailStream;)Lcom/transsion/player/enum/PlayMimeType;", PushConstants.PUSH_SERVICE_TYPE_SHOW, "S1", "T1", "showLoading", "d1", "k2", "e1", "X0", "()Z", "s1", "Y0", "c1", "o2", "w1", "", "visible", "p2", "(I)V", "b1", "E1", "Lcom/transsion/videofloat/bean/FloatActionType;", "actionType", "g2", "(Lcom/transsion/videofloat/bean/FloatActionType;)Z", "Lrx/a;", "h1", "()Lrx/a;", "y1", "Lcom/transsion/player/longvideo/ui/LongVodUiType;", "uiType", "U1", "(Lcom/transsion/player/longvideo/ui/LongVodUiType;)V", "j2", "C1", "", "tsLayoutDone", "a2", "(J)V", "", "genre", "O1", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "receiveArguments", "Landroid/view/LayoutInflater;", "inflater", "p1", "(Landroid/view/LayoutInflater;)Llx/i;", "getPageStateLayoutTitle", "()Ljava/lang/String;", "isRegisteDeviceKeyMonitor", "initViewData", "initViewModel", "initListener", "retryLoadData", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "loadDefaultData", "Landroid/view/View;", "getLoadingView", "()Landroid/view/View;", "onResume", "onPause", "onStop", "Z1", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "onHomeClick", "onRecentClick", "onDestroy", "Lkotlin/Function0;", "callback", "S", "(Lkotlin/jvm/functions/Function0;)V", "Ljo/a;", "a", "Ljo/a;", "playerControl", "Lxn/e;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lxn/e;", "bottomRecHelper", "c", "Lcom/transsion/moviedetailapi/bean/Subject;", "mMovieDetailBean", "Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lkotlin/Lazy;", "l1", "()Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "movieDetailViewModel", "Lcom/transsion/videodetail/VideoDetailViewModel;", "e", "o1", "()Lcom/transsion/videodetail/VideoDetailViewModel;", "videoDetailViewModel", "Lcom/transsnet/downloader/viewmodel/k0;", "f", "g1", "()Lcom/transsnet/downloader/viewmodel/k0;", "downloadViewModel", "Lhp/a;", "g", "n1", "()Lhp/a;", "publishedApi", "h", "Ljava/lang/String;", "mSubjectId", "i", "ops", "j", "Z", "netResultSuccess", CampaignEx.JSON_KEY_AD_K, "moduleName", "l", "autoDownload", "m", "autoPlay", "n", "autoPlayResourceId", "o", "I", "getPreloadId", "()I", "setPreloadId", "preloadId", TtmlNode.TAG_P, "curSeason", CampaignEx.JSON_KEY_AD_Q, "targetSeason", CampaignEx.JSON_KEY_AD_R, "targetEp", "s", "lastPageFrom", "t", "hasClickedActivityTip", TmcStartParams.KEY_URL_SHORT, "Landroid/view/View;", "gameResView", "v", "isGameResInit", "Lel/a;", "w", "Lel/a;", "palmPayApi", "Ldn/b;", "x", "j1", "()Ldn/b;", "memberProvider", "y", "J", "curAudioTrackPlayProgress", "z", "Lcom/transsion/player/longvideo/ui/LongVodUiType;", "curPlayerUiType", "A", "Lkotlin/jvm/functions/Function0;", "backPressedCallback", "B", "hasResource", "C", "isInterceptDialogShow", "Lcom/transsion/wrapperad/view/cardpage/NativeCardPageAdHelper;", "D", "Lcom/transsion/wrapperad/view/cardpage/NativeCardPageAdHelper;", "adHelper", "E", "tsEnter", "F", "tsRequestStart", "G", "tsCallback", "H", "tsInitStart", "tsInitDone", "tsAddView", "com/transsion/videodetail/StreamDetailFragment$d", "K", "Lcom/transsion/videodetail/StreamDetailFragment$d;", "networkStatusChangedListener", "L", "Lcom/transsion/videodetail/bean/VideoDetailStreamList;", "Landroidx/lifecycle/c0;", "M", "Landroidx/lifecycle/c0;", "playInfoObserver", "N", "Lcom/transsion/baselib/db/video/VideoDetailPlayBean;", "Llx/j;", "O", "Llx/j;", "loadingViewBinding", "P", "showNetErr", "Q", "VideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class StreamDetailFragment extends PageStatusFragment<C25756i> implements InterfaceC5146a {

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private Function0 backPressedCallback;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean isInterceptDialogShow;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private NativeCardPageAdHelper adHelper;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private long tsEnter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private long tsRequestStart;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private long tsCallback;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private long tsInitStart;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private long tsInitDone;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private long tsAddView;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private VideoDetailStreamList videoDetailStreamList;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private VideoDetailPlayBean history;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private C25757j loadingViewBinding;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private boolean showNetErr;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private InterfaceC24450a playerControl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C28623e bottomRecHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Subject mMovieDetailBean;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String mSubjectId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String ops;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean netResultSuccess;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String moduleName;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean autoDownload;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean autoPlay;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private String autoPlayResourceId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int preloadId;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int targetSeason;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private int targetEp;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private String lastPageFrom;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean hasClickedActivityTip;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private View gameResView;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean isGameResInit;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private long curAudioTrackPlayProgress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy movieDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(MovieDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.videodetail.StreamDetailFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.videodetail.StreamDetailFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Lazy videoDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(VideoDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.videodetail.StreamDetailFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.videodetail.StreamDetailFragment$special$$inlined$activityViewModels$default$4
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

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Lazy downloadViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(C22169k0.class), new Function0<C3231x0>() { // from class: com.transsion.videodetail.StreamDetailFragment$special$$inlined$activityViewModels$default$5
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.videodetail.StreamDetailFragment$special$$inlined$activityViewModels$default$6
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

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy publishedApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.videodetail.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StreamDetailFragment.m85956Y1();
        }
    });

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int curSeason = 1;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private InterfaceC23181a palmPayApi = (InterfaceC23181a) TheRouter.m61774d(InterfaceC23181a.class, new Object[0]);

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final Lazy memberProvider = LazyKt.m97097b(new Function0() { // from class: com.transsion.videodetail.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StreamDetailFragment.m85942R1();
        }
    });

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private LongVodUiType curPlayerUiType = LongVodUiType.MIDDLE;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean hasResource = true;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C20892d networkStatusChangedListener = new C20892d();

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC3189c0 playInfoObserver = new InterfaceC3189c0() { // from class: com.transsion.videodetail.k
        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final void onChanged(Object obj) {
            StreamDetailFragment.m85952W1(this.f65783a, (VideoDetailStreamList) obj);
        }
    };

    /* JADX INFO: renamed from: com.transsion.videodetail.StreamDetailFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final StreamDetailFragment m86022a() {
            return new StreamDetailFragment();
        }
    }

    /* JADX INFO: renamed from: com.transsion.videodetail.StreamDetailFragment$b */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC20890b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC20890b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            BubbleTextView bubbleTextView;
            ViewTreeObserver viewTreeObserver;
            C25756i mViewBinding = StreamDetailFragment.this.getMViewBinding();
            if (mViewBinding != null && (bubbleTextView = mViewBinding.f78571b) != null && (viewTreeObserver = bubbleTextView.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            C25756i mViewBinding2 = StreamDetailFragment.this.getMViewBinding();
            BubbleTextView bubbleTextView2 = mViewBinding2 != null ? mViewBinding2.f78571b : null;
            if (bubbleTextView2 == null || bubbleTextView2.getMeasuredWidth() == 0) {
                return;
            }
            float measuredWidth = (bubbleTextView2.getMeasuredWidth() / 2) - (AbstractC5776a0.m27313a(16.0f) / 2);
            bubbleTextView2.setArrowPosition(measuredWidth);
            C26866a.a.m104898f(C26866a.f81698a, "videoDetail", "activity tip width: " + bubbleTextView2.getMeasuredWidth() + ", arrowPosition: " + measuredWidth, false, 4, null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.videodetail.StreamDetailFragment$c */
    public static final class C20891c extends AbstractC0256u {
        C20891c() {
            super(true);
        }

        @Override // androidx.activity.AbstractC0256u
        public void handleOnBackPressed() {
            Function0 function0 = StreamDetailFragment.this.backPressedCallback;
            if (function0 == null || !((Boolean) function0.invoke()).booleanValue()) {
                if (StreamDetailFragment.this.playerControl != null) {
                    InterfaceC24450a interfaceC24450a = StreamDetailFragment.this.playerControl;
                    if (interfaceC24450a != null) {
                        interfaceC24450a.onBackPressed();
                        return;
                    }
                    return;
                }
                FragmentActivity activity = StreamDetailFragment.this.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.videodetail.StreamDetailFragment$d */
    public static final class C20892d implements InterfaceC27288n {
        C20892d() {
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected() {
            InterfaceC27288n.a.m106338a(this);
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
            Intrinsics.m97802h(network, "network");
            Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
            StreamDetailFragment.this.m85966e1();
            VideoDetailMediaSource videoDetailMediaSource = (VideoDetailMediaSource) StreamDetailFragment.this.m85992o1().m86129x().m14847f();
            if (videoDetailMediaSource != null) {
                StreamDetailFragment streamDetailFragment = StreamDetailFragment.this;
                VideoDetailStreamList videoDetailStreamList = (VideoDetailStreamList) streamDetailFragment.m85992o1().m86128w().m14847f();
                if (videoDetailStreamList != null && videoDetailMediaSource.getSe() == videoDetailStreamList.getSe() && videoDetailMediaSource.getEp() == videoDetailStreamList.getEp()) {
                    return;
                }
                streamDetailFragment.m85968f1(videoDetailMediaSource);
            }
        }

        @Override // p743rh.InterfaceC27288n
        public void onDisconnected() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.videodetail.StreamDetailFragment$e */
    static final class C20893e implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65661a;

        C20893e(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65661a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65661a;
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
            this.f65661a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.videodetail.StreamDetailFragment$f */
    public static final class C20894f implements InterfaceC28047a {
        C20894f() {
        }

        @Override // p824ux.InterfaceC28047a
        /* JADX INFO: renamed from: a */
        public boolean mo70368a(C27425a c27425a) {
            return StreamFloatManager.f65956b.m86496r(c27425a);
        }

        @Override // p824ux.InterfaceC28047a
        /* JADX INFO: renamed from: b */
        public void mo70369b(C27425a c27425a) {
            StreamFloatManager streamFloatManager = StreamFloatManager.f65956b;
            streamFloatManager.m86494p();
            streamFloatManager.m86497t(c27425a);
        }

        @Override // p824ux.InterfaceC28047a
        /* JADX INFO: renamed from: c */
        public void mo70370c(C27425a c27425a) {
            InterfaceC28047a.a.m109026a(this, c27425a);
            StreamFloatManager.f65956b.m86495q(c27425a);
        }
    }

    /* JADX INFO: renamed from: com.transsion.videodetail.StreamDetailFragment$g */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC20895g implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ LongVodPlayerView f65662a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ StreamDetailFragment f65663b;

        ViewTreeObserverOnGlobalLayoutListenerC20895g(LongVodPlayerView longVodPlayerView, StreamDetailFragment streamDetailFragment) {
            this.f65662a = longVodPlayerView;
            this.f65663b = streamDetailFragment;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f65662a.getWidth() == 0 || this.f65662a.getHeight() == 0) {
                return;
            }
            this.f65662a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f65663b.m85959a2(SystemClock.elapsedRealtime());
        }
    }

    /* JADX INFO: renamed from: com.transsion.videodetail.StreamDetailFragment$h */
    public static final class C20896h implements InterfaceC24450a.b {
        C20896h() {
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: a */
        public void mo70371a() {
            StreamDetailFragment.this.m85958a1();
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: b */
        public boolean mo70372b() {
            if (StreamDetailFragment.this.showNetErr && C27287m.f83003a.m106330e()) {
                StreamDetailFragment streamDetailFragment = StreamDetailFragment.this;
                streamDetailFragment.m85968f1((VideoDetailMediaSource) streamDetailFragment.m85992o1().m86129x().m14847f());
            }
            return StreamDetailFragment.this.showNetErr;
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: c */
        public boolean mo70373c(FloatActionType actionType) {
            Intrinsics.m97802h(actionType, "actionType");
            return StreamDetailFragment.this.m85971g2(actionType);
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: d */
        public void mo70374d(LongVodUiType uiType) {
            Intrinsics.m97802h(uiType, "uiType");
            StreamDetailFragment.this.curPlayerUiType = uiType;
            StreamDetailFragment.this.m85948U1(uiType);
            C28623e c28623e = StreamDetailFragment.this.bottomRecHelper;
            if (c28623e != null) {
                c28623e.m110393x(uiType != LongVodUiType.MIDDLE);
            }
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: e */
        public View mo70375e() {
            return StreamDetailFragment.this.gameResView;
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: f */
        public void mo70376f(boolean z11) {
            AppCompatImageView appCompatImageView;
            C25756i mViewBinding = StreamDetailFragment.this.getMViewBinding();
            if (mViewBinding == null || (appCompatImageView = mViewBinding.f78579j) == null) {
                return;
            }
            appCompatImageView.setVisibility(z11 ? 0 : 8);
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: g */
        public void mo70377g(C24715a c24715a) {
            StreamDetailFragment.this.m85950V1(c24715a);
        }

        @Override // jo.InterfaceC24450a.b
        public void onCompletion() {
            StreamDetailFragment.this.m85958a1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public static final void m85908A1(StreamDetailFragment streamDetailFragment, View view) {
        InterfaceC24450a interfaceC24450a = streamDetailFragment.playerControl;
        if (interfaceC24450a != null) {
            if (interfaceC24450a != null) {
                interfaceC24450a.onBackPressed();
            }
        } else {
            FragmentActivity activity = streamDetailFragment.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* JADX INFO: renamed from: B1 */
    private final void m85910B1() {
        ResourcesSeasonList resourcesSeasonList;
        if (this.mSubjectId == null || (resourcesSeasonList = (ResourcesSeasonList) m85992o1().m86130y().m14847f()) == null) {
            return;
        }
        if (resourcesSeasonList.isNoSource()) {
            C26866a.a.m104898f(C26866a.f81698a, "videoDetail", "checkPlayInfo 没有资源", false, 4, null);
            return;
        }
        if (resourcesSeasonList.isSeries()) {
            C26866a.a.m104898f(C26866a.f81698a, "videoDetail", "checkPlayInfo 是剧集，获取记录决定哪集", false, 4, null);
            List list = (List) m85992o1().m86124s().m14847f();
            if (list == null) {
                return;
            }
            VideoDetailPlayBean videoDetailPlayBean = (VideoDetailPlayBean) m85992o1().m86126u().m14847f();
            this.history = videoDetailPlayBean;
            m85992o1().m86119B(m85986m1(videoDetailPlayBean, list));
            return;
        }
        if (resourcesSeasonList.isMovie()) {
            C26866a.a.m104898f(C26866a.f81698a, "videoDetail", "checkPlayInfo 是电影", false, 4, null);
            List list2 = (List) m85992o1().m86124s().m14847f();
            if (list2 == null) {
                return;
            }
            this.history = (VideoDetailPlayBean) m85992o1().m86126u().m14847f();
            m85992o1().m86119B((VideoDetailMediaSource) CollectionsKt.m97361k0(list2));
        }
    }

    /* JADX INFO: renamed from: C1 */
    private final void m85912C1(Subject movieDetailBean) {
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
            value = Utils.m27275a().getString(com.transsion.moviedetail.R$string.movie_detail_restrict_tips);
        }
        final RestrictTipsDialog restrictTipsDialogM70471a = RestrictTipsDialog.INSTANCE.m70471a(value, "stream_detail", movieDetailBean.getSubjectId());
        restrictTipsDialogM70471a.m65437l0(this, "RestrictTipsDialog");
        restrictTipsDialogM70471a.m70470y0(new Function1() { // from class: com.transsion.videodetail.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StreamDetailFragment.m85914D1(restrictTipsDialogM70471a, this, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public static final Unit m85914D1(RestrictTipsDialog restrictTipsDialog, StreamDetailFragment streamDetailFragment, boolean z11) {
        if (z11) {
            InterfaceC24450a interfaceC24450a = streamDetailFragment.playerControl;
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

    /* JADX INFO: renamed from: E1 */
    private final void m85916E1() {
        ConstraintLayout root;
        C25756i mViewBinding = getMViewBinding();
        if (mViewBinding == null || (root = mViewBinding.getRoot()) == null) {
            return;
        }
        root.post(new Runnable() { // from class: com.transsion.videodetail.d
            @Override // java.lang.Runnable
            public final void run() {
                StreamDetailFragment.m85918F1(this.f65758a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public static final void m85918F1(StreamDetailFragment streamDetailFragment) {
        Subject subject;
        String subjectId;
        String ops;
        FragmentActivity activity = streamDetailFragment.getActivity();
        if (activity == null || (subject = streamDetailFragment.mMovieDetailBean) == null || (subjectId = subject.getSubjectId()) == null) {
            return;
        }
        InterfaceC27135b interfaceC27135bM105597c = InterfaceC27135b.f82245a.m105597c();
        Subject subject2 = streamDetailFragment.mMovieDetailBean;
        interfaceC27135bM105597c.mo86624e(activity, subjectId, null, "stream_detail", (subject2 == null || (ops = subject2.getOps()) == null) ? streamDetailFragment.ops : ops);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public static final Unit m85920G1(StreamDetailFragment streamDetailFragment, VideoDetailMediaSource videoDetailMediaSource) {
        C26866a.a.m104908v(C26866a.f81698a, "VideoDetailEpisode", "--------PlayingEpisodeMediaLiveDat:observe", false, 4, null);
        streamDetailFragment.m85968f1(videoDetailMediaSource);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H1 */
    public static final Unit m85922H1(StreamDetailFragment streamDetailFragment, VideoDetailPlayBean videoDetailPlayBean) {
        Subject subject;
        String str = streamDetailFragment.ops;
        if (str == null || str.length() == 0) {
            streamDetailFragment.ops = videoDetailPlayBean != null ? videoDetailPlayBean.getOps() : null;
        }
        Subject subject2 = streamDetailFragment.mMovieDetailBean;
        String ops = subject2 != null ? subject2.getOps() : null;
        if ((ops == null || ops.length() == 0) && (subject = streamDetailFragment.mMovieDetailBean) != null) {
            subject.setOps(videoDetailPlayBean != null ? videoDetailPlayBean.getOps() : null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public static final Unit m85924I1(StreamDetailFragment streamDetailFragment, DubsInfo dubsInfo) {
        InterfaceC24450a interfaceC24450a = streamDetailFragment.playerControl;
        streamDetailFragment.curAudioTrackPlayProgress = interfaceC24450a != null ? interfaceC24450a.currentPosition() : 0L;
        streamDetailFragment.mSubjectId = dubsInfo.getSubjectId();
        streamDetailFragment.mMovieDetailBean = null;
        streamDetailFragment.videoDetailStreamList = null;
        streamDetailFragment.m85992o1().m86120C();
        MovieDetailViewModel movieDetailViewModelM85983l1 = streamDetailFragment.m85983l1();
        int i11 = streamDetailFragment.preloadId;
        String str = streamDetailFragment.mSubjectId;
        if (str == null) {
            str = "";
        }
        movieDetailViewModelM85983l1.m70918S(i11, str, Integer.valueOf(streamDetailFragment.curSeason));
        streamDetailFragment.m85938P1(true);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J1 */
    public static final Unit m85926J1(StreamDetailFragment streamDetailFragment, Boolean bool) {
        C26866a.a.m104898f(C26866a.f81698a, "videoDetail", "isShowDownloadInterceptDialog --> " + bool, false, 4, null);
        Intrinsics.m97799e(bool);
        boolean zBooleanValue = bool.booleanValue();
        streamDetailFragment.isInterceptDialogShow = zBooleanValue;
        if (zBooleanValue) {
            InterfaceC24450a interfaceC24450a = streamDetailFragment.playerControl;
            if (interfaceC24450a != null) {
                interfaceC24450a.onViewPause();
            }
        } else {
            streamDetailFragment.onResume();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K1 */
    public static final Unit m85928K1(StreamDetailFragment streamDetailFragment, Pair pair) {
        HashMap mapM96844g;
        HashMap mapM96844g2;
        HashMap mapM96844g3;
        Subject subject = (Subject) pair.getSecond();
        C26866a.f81698a.m104912c("videoDetail", "get movie detail data==" + pair, true);
        if (subject == null) {
            if (Intrinsics.m97797c(pair.getFirst(), "404")) {
                C13806h.f49015a.m62324k(com.transsion.moviedetail.R$string.movie_lost_content);
                AbstractC25136k.m99058d(AbstractC3226v.m14968a(streamDetailFragment), null, null, new StreamDetailFragment$initViewModel$1$1$1(streamDetailFragment, null), 3, null);
            }
            if (C27287m.f83003a.m106330e()) {
                PageStatusFragment.showEmptyView$default(streamDetailFragment, false, 1, null);
            } else {
                PageStatusFragment.showNoNetworkView$default(streamDetailFragment, false, 1, null);
            }
        } else {
            if (subject.getIsRefreshViewOnly()) {
                streamDetailFragment.m86007t2(subject);
                return Unit.f75682a;
            }
            streamDetailFragment.tsCallback = SystemClock.elapsedRealtime();
            MovieDetailViewModel movieDetailViewModelM85983l1 = streamDetailFragment.m85983l1();
            String subjectId = subject.getSubjectId();
            Integer subjectType = subject.getSubjectType();
            Context context = streamDetailFragment.getContext();
            MovieDetailViewModel.m70906u(movieDetailViewModelM85983l1, subjectId, subjectType, 0, context != null && AbstractC14556b.m65670a(context), 4, null);
            streamDetailFragment.showContentView();
            streamDetailFragment.netResultSuccess = true;
            streamDetailFragment.m86007t2(subject);
            streamDetailFragment.m86001r2();
            streamDetailFragment.m86000r1();
            streamDetailFragment.m85990n2();
            C24655b logViewConfig = streamDetailFragment.getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96848k(true);
            }
            C24655b logViewConfig2 = streamDetailFragment.getLogViewConfig();
            if (logViewConfig2 != null) {
                logViewConfig2.m96851n(streamDetailFragment.ops);
            }
            C24655b logViewConfig3 = streamDetailFragment.getLogViewConfig();
            if (logViewConfig3 != null && (mapM96844g3 = logViewConfig3.m96844g()) != null) {
                String subjectId2 = subject.getSubjectId();
                if (subjectId2 == null) {
                    subjectId2 = "";
                }
                mapM96844g3.put("subject_id", subjectId2);
            }
            C24655b logViewConfig4 = streamDetailFragment.getLogViewConfig();
            if (logViewConfig4 != null && (mapM96844g2 = logViewConfig4.m96844g()) != null) {
                mapM96844g2.put("has_resource", String.valueOf(subject.getHasResource()));
            }
            C24655b logViewConfig5 = streamDetailFragment.getLogViewConfig();
            if (logViewConfig5 != null && (mapM96844g = logViewConfig5.m96844g()) != null) {
                mapM96844g.put("module_name", streamDetailFragment.moduleName);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public static final Unit m85930L1(StreamDetailFragment streamDetailFragment, Integer num) {
        int i11 = streamDetailFragment.curSeason;
        if (num != null && i11 == num.intValue()) {
            return Unit.f75682a;
        }
        Intrinsics.m97799e(num);
        streamDetailFragment.curSeason = num.intValue();
        String str = streamDetailFragment.mSubjectId;
        if (str != null) {
            streamDetailFragment.m85983l1().m70909D(str, Integer.valueOf(streamDetailFragment.curSeason), true);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public static final Unit m85932M1(StreamDetailFragment streamDetailFragment, ResourcesSeasonList resourcesSeasonList) {
        streamDetailFragment.m86001r2();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N1 */
    public static final Unit m85934N1(StreamDetailFragment streamDetailFragment, List list) {
        streamDetailFragment.m85910B1();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: O1 */
    private final void m85936O1(String genre) {
        NativeCardPageView nativeCardPageView;
        NativeCardPageAdHelper nativeCardPageAdHelperM86951G;
        NativeCardPageAdHelper nativeCardPageAdHelperM86950F;
        C25756i mViewBinding = getMViewBinding();
        if (mViewBinding == null || (nativeCardPageView = mViewBinding.f78583n) == null) {
            return;
        }
        AbstractC26006c.m102054g(nativeCardPageView);
        NativeCardPageAdHelper nativeCardPageAdHelper = this.adHelper;
        if (nativeCardPageAdHelper == null || (nativeCardPageAdHelperM86951G = nativeCardPageAdHelper.m86951G("StreamingMediaContentScene")) == null || (nativeCardPageAdHelperM86950F = nativeCardPageAdHelperM86951G.m86950F(C14058c.f49742a.m63681a(genre))) == null) {
            return;
        }
        nativeCardPageAdHelperM86950F.m86953u(nativeCardPageView);
    }

    /* JADX INFO: renamed from: P1 */
    private final void m85938P1(boolean isAudioTracksChange) {
        HashMap mapM96844g;
        MovieDetailActivity.INSTANCE.m70152a("videoDetail start load data ....");
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
            String str = this.mSubjectId;
            if (str == null) {
                str = "";
            }
            mapM96844g.put("subject_id", str);
        }
        Bundle arguments = getArguments();
        this.ops = arguments != null ? arguments.getString("ops") : null;
        if (C27287m.f83003a.m106330e()) {
            if (!isAudioTracksChange) {
                showLoadingView();
            }
            String str2 = this.mSubjectId;
            if (str2 != null) {
                this.tsRequestStart = SystemClock.elapsedRealtime();
                MovieDetailViewModel.m70874E(m85983l1(), str2, Integer.valueOf(this.curSeason), false, 4, null);
                m85992o1().m86123r(str2);
                m85992o1().m86122q(str2);
            }
        }
    }

    /* JADX INFO: renamed from: Q1 */
    static /* synthetic */ void m85940Q1(StreamDetailFragment streamDetailFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        streamDetailFragment.m85938P1(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R1 */
    public static final InterfaceC22998b m85942R1() {
        return (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
    }

    /* JADX INFO: renamed from: S1 */
    private final void m85944S1(boolean show) {
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
            InterfaceC22998b interfaceC22998bM85977j1 = m85977j1();
            if (interfaceC22998bM85977j1 != null) {
                interfaceC22998bM85977j1.mo69854h();
                return;
            }
            return;
        }
        InterfaceC22998b interfaceC22998bM85977j2 = m85977j1();
        if (interfaceC22998bM85977j2 != null) {
            interfaceC22998bM85977j2.mo69866t();
        }
    }

    /* JADX INFO: renamed from: T1 */
    private final void m85946T1() {
        InterfaceC24450a interfaceC24450a = this.playerControl;
        if (interfaceC24450a != null) {
            interfaceC24450a.onPageDestroy();
        }
        C27287m.f83003a.m106337m(this.networkStatusChangedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public final void m85948U1(LongVodUiType uiType) {
        if (this.gameResView == null || uiType != LongVodUiType.MIDDLE) {
            return;
        }
        m85978j2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public final void m85950V1(C24715a bean) {
        Navigator navigatorM61857K = TheRouter.m61773c("/profile/user_center_labels_feedback").m61857K("feedback_from_page", "SUBJECT_PLAY").m61857K("subject_id", this.mSubjectId);
        Subject subject = this.mMovieDetailBean;
        if (subject != null && subject.getType() == 3 && bean != null) {
            navigatorM61857K.m61855I("TV_DATA", new FbTvData(bean.m97059o(), bean.m97056l(), bean.m97049e()));
        }
        Navigator.m61845x(navigatorM61857K, requireContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W1 */
    public static final void m85952W1(StreamDetailFragment streamDetailFragment, VideoDetailStreamList videoDetailStreamList) {
        C26866a.f81698a.m104912c("videoDetail", "playInfoObserver  playInfo==" + videoDetailStreamList, true);
        streamDetailFragment.m86000r1();
        if (videoDetailStreamList != null || C27287m.f83003a.m106330e()) {
            streamDetailFragment.m85966e1();
        } else {
            streamDetailFragment.m85981k2();
        }
    }

    /* JADX INFO: renamed from: X0 */
    private final boolean m85953X0() {
        InterfaceC23181a interfaceC23181a;
        if (this.hasClickedActivityTip || (interfaceC23181a = this.palmPayApi) == null) {
            return false;
        }
        return interfaceC23181a.mo66561g();
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:58:0x0132  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0144  */
    /* JADX WARN: Code duplicated, block: B:65:0x014a  */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x00f4, please report this as an issue */
    /* JADX INFO: renamed from: X1 */
    private final void m85954X1(VideoDetailStreamList videoDetailStreamList) {
        List<VideoDetailStream> list;
        long j11;
        VideoDetailPlayBean videoDetailPlayBean;
        VideoDetailPlayBean videoDetailPlayBean2;
        VideoDetailPlayBean videoDetailPlayBean3;
        VideoDetailMediaSource videoDetailMediaSource;
        int ep2;
        int se2;
        String str;
        Subject subject;
        List<DubsInfo> listL;
        String averageHueLight;
        String thumbnail;
        String url;
        Subject subject2 = this.mMovieDetailBean;
        if (subject2 == null || !subject2.isFamilyModeIntercept()) {
            C26866a.a aVar = C26866a.f81698a;
            aVar.m104912c("videoDetail", "playStream   videoDetailStreamList:" + videoDetailStreamList + "  mSubjectId:" + this.mSubjectId + "  mMovieDetailBean:" + this.mMovieDetailBean, true);
            List<VideoDetailStream> streams = videoDetailStreamList != null ? videoDetailStreamList.getStreams() : null;
            if (videoDetailStreamList == null || (list = streams) == null || list.isEmpty()) {
                C26866a.a.m104901l(aVar, "videoDetail", "空返回", false, 4, null);
                return;
            }
            VideoDetailMediaSource videoDetailMediaSource2 = (VideoDetailMediaSource) m85992o1().m86129x().m14847f();
            if (videoDetailMediaSource2 != null && videoDetailMediaSource2.getEp() == videoDetailStreamList.getEp() && videoDetailMediaSource2.getSe() == videoDetailStreamList.getSe()) {
                long progress = this.curAudioTrackPlayProgress;
                if (progress <= 0) {
                    VideoDetailPlayBean videoDetailPlayBean4 = this.history;
                    if (videoDetailPlayBean4 != null && videoDetailPlayBean4 != null && videoDetailStreamList.getSe() == videoDetailPlayBean4.getSe() && (videoDetailPlayBean = this.history) != null && videoDetailStreamList.getEp() == videoDetailPlayBean.getEp()) {
                        if ((this.targetSeason > 0 && (videoDetailPlayBean3 = this.history) != null && videoDetailPlayBean3.getSe() == this.targetSeason) || this.targetSeason <= 0) {
                            m85992o1().m86121n();
                            videoDetailPlayBean2 = this.history;
                            if (videoDetailPlayBean2 != null) {
                                progress = videoDetailPlayBean2.getProgress();
                                C26866a.a.m104908v(aVar, "videoDetail", "playStream， history，seekTo:" + progress + " ", false, 4, null);
                            }
                            PlayMimeType playMimeTypeM85980k1 = m85980k1((VideoDetailStream) CollectionsKt.m97361k0(streams));
                            videoDetailMediaSource = (VideoDetailMediaSource) m85992o1().m86129x().m14847f();
                            if (videoDetailMediaSource != null) {
                                ep2 = videoDetailMediaSource.getEp();
                            } else {
                                ep2 = 0;
                            }
                            if (videoDetailMediaSource != null) {
                                se2 = videoDetailMediaSource.getSe();
                            } else {
                                se2 = 0;
                            }
                            str = this.mSubjectId;
                            if (str != null) {
                            }
                        }
                        VideoDetailPlayBean videoDetailPlayBean5 = this.history;
                        if ((videoDetailPlayBean5 != null ? videoDetailPlayBean5.getSe() : 0) <= 0) {
                            m85992o1().m86121n();
                            videoDetailPlayBean2 = this.history;
                            if (videoDetailPlayBean2 != null) {
                                progress = videoDetailPlayBean2.getProgress();
                                C26866a.a.m104908v(aVar, "videoDetail", "playStream， history，seekTo:" + progress + " ", false, 4, null);
                            }
                            PlayMimeType playMimeTypeM85980k2 = m85980k1((VideoDetailStream) CollectionsKt.m97361k0(streams));
                            videoDetailMediaSource = (VideoDetailMediaSource) m85992o1().m86129x().m14847f();
                            if (videoDetailMediaSource != null) {
                                ep2 = videoDetailMediaSource.getEp();
                            } else {
                                ep2 = 0;
                            }
                            if (videoDetailMediaSource != null) {
                                se2 = videoDetailMediaSource.getSe();
                            } else {
                                se2 = 0;
                            }
                            str = this.mSubjectId;
                            if (str != null || (subject = this.mMovieDetailBean) == null) {
                            }
                            String title = subject.getTitle();
                            String str2 = title == null ? "" : title;
                            String title2 = videoDetailStreamList.getTitle();
                            String str3 = this.lastPageFrom;
                            String str4 = str3 == null ? "" : str3;
                            List listM85997q1 = m85997q1(streams);
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
                            Subject subject3 = this.mMovieDetailBean;
                            String ops = subject3 != null ? subject3.getOps() : null;
                            Subject subject4 = this.mMovieDetailBean;
                            C24715a c24715a = new C24715a(str, playMimeTypeM85980k2, j11, ep2, se2, str2, title2, str4, "stream_detail", listM85997q1, str5, str6, str7, iIntValue, Integer.valueOf(iIntValue2), false, subject4 != null ? subject4.getTitle() : null, ops, 32768, null);
                            c24715a.m97070z(this.mMovieDetailBean);
                            List listM97045a = c24715a.m97045a();
                            Subject subject5 = this.mMovieDetailBean;
                            if (subject5 == null || (listL = subject5.getDubs()) == null) {
                                listL = CollectionsKt.m97506l();
                            }
                            listM97045a.addAll(listL);
                            aVar.m104912c("videoDetail", "playStream  addDataSource:" + c24715a + "  playerControl:" + this.playerControl, true);
                            m85984l2();
                            InterfaceC24450a interfaceC24450a = this.playerControl;
                            if (interfaceC24450a != null) {
                                interfaceC24450a.setDataSource(c24715a);
                                return;
                            }
                            return;
                        }
                    }
                    j11 = 0;
                    PlayMimeType playMimeTypeM85980k3 = m85980k1((VideoDetailStream) CollectionsKt.m97361k0(streams));
                    videoDetailMediaSource = (VideoDetailMediaSource) m85992o1().m86129x().m14847f();
                    if (videoDetailMediaSource != null) {
                        ep2 = videoDetailMediaSource.getEp();
                    } else {
                        ep2 = 0;
                    }
                    if (videoDetailMediaSource != null) {
                        se2 = videoDetailMediaSource.getSe();
                    } else {
                        se2 = 0;
                    }
                    str = this.mSubjectId;
                    if (str != null) {
                    }
                }
                this.curAudioTrackPlayProgress = 0L;
                C26866a.a.m104908v(aVar, "videoDetail", "playStream， AudioTrack，seekTo:" + progress + " ", false, 4, null);
                j11 = progress;
                PlayMimeType playMimeTypeM85980k4 = m85980k1((VideoDetailStream) CollectionsKt.m97361k0(streams));
                videoDetailMediaSource = (VideoDetailMediaSource) m85992o1().m86129x().m14847f();
                if (videoDetailMediaSource != null) {
                    ep2 = videoDetailMediaSource.getEp();
                } else {
                    ep2 = 0;
                }
                if (videoDetailMediaSource != null) {
                    se2 = videoDetailMediaSource.getSe();
                } else {
                    se2 = 0;
                }
                str = this.mSubjectId;
                if (str != null) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: Y0 */
    private final void m85955Y0() {
        BubbleTextView bubbleTextView;
        ViewTreeObserver viewTreeObserver;
        C25756i mViewBinding = getMViewBinding();
        if (mViewBinding == null || (bubbleTextView = mViewBinding.f78571b) == null || (viewTreeObserver = bubbleTextView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC20890b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public static final InterfaceC23888a m85956Y1() {
        return (InterfaceC23888a) TheRouter.m61774d(InterfaceC23888a.class, new Object[0]);
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m85957Z0() {
        ResourcesSeasonList resourcesSeasonList = (ResourcesSeasonList) m85992o1().m86130y().m14847f();
        if (resourcesSeasonList == null) {
            return;
        }
        boolean z11 = false;
        if (resourcesSeasonList.isSeries()) {
            C26866a.a.m104898f(C26866a.f81698a, "videoDetail", "checkHasNext 是剧集，判断下一集还是完成 ", false, 4, null);
            List listL = (List) m85992o1().m86124s().m14847f();
            if (listL == null) {
                listL = CollectionsKt.m97506l();
            }
            VideoDetailMediaSource videoDetailMediaSource = (VideoDetailMediaSource) m85992o1().m86129x().m14847f();
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public final void m85958a1() {
        ResourcesSeasonList resourcesSeasonList = (ResourcesSeasonList) m85992o1().m86130y().m14847f();
        if (resourcesSeasonList == null) {
            return;
        }
        if (resourcesSeasonList.isNoSource()) {
            C26866a.a.m104898f(C26866a.f81698a, "videoDetail", "checkPlayNextOrReplay 没有资源", false, 4, null);
            return;
        }
        if (!resourcesSeasonList.isSeries()) {
            if (resourcesSeasonList.isMovie()) {
                C26866a.a.m104898f(C26866a.f81698a, "videoDetail", "checkPlayInfo 是电影", false, 4, null);
                InterfaceC24450a interfaceC24450a = this.playerControl;
                if (interfaceC24450a != null) {
                    interfaceC24450a.showReplay();
                    return;
                }
                return;
            }
            return;
        }
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "videoDetail", "checkPlayNextOrReplay 是剧集，判断下一集还是完成 ", false, 4, null);
        List list = (List) m85992o1().m86124s().m14847f();
        if (list == null) {
            return;
        }
        VideoDetailMediaSource videoDetailMediaSource = (VideoDetailMediaSource) m85992o1().m86129x().m14847f();
        if (videoDetailMediaSource == null) {
            m85992o1().m86119B((VideoDetailMediaSource) CollectionsKt.m97361k0(list));
            return;
        }
        int iIndexOf = list.indexOf(videoDetailMediaSource);
        if (iIndexOf >= list.size() - 1) {
            C26866a.a.m104898f(aVar, "videoDetail", "checkPlayInfo 是剧集完成播放", false, 4, null);
            InterfaceC24450a interfaceC24450a2 = this.playerControl;
            if (interfaceC24450a2 != null) {
                interfaceC24450a2.showReplay();
                return;
            }
            return;
        }
        C26866a.a.m104898f(aVar, "videoDetail", "checkPlayInfo 自动播放下一集，currentIndex：" + iIndexOf, false, 4, null);
        m85992o1().m86119B((VideoDetailMediaSource) CollectionsKt.m97362l0(list, iIndexOf + 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public final void m85959a2(long tsLayoutDone) {
        if (this.tsEnter == 0) {
            return;
        }
        HashMap map = new HashMap();
        String str = this.mSubjectId;
        if (str == null) {
            str = "";
        }
        map.put("subject_id", str);
        map.put("t_request", String.valueOf(this.tsRequestStart - this.tsEnter));
        map.put("t_callback", String.valueOf(this.tsCallback - this.tsEnter));
        map.put("t_init_start", String.valueOf(this.tsInitStart - this.tsEnter));
        map.put("t_init_done", String.valueOf(this.tsInitDone - this.tsEnter));
        map.put("t_add_view", String.valueOf(this.tsAddView - this.tsEnter));
        map.put("t_layout_done", String.valueOf(tsLayoutDone - this.tsEnter));
        C24662i.f75350a.m96884s("stream_detail", "app_perf", map);
    }

    /* JADX INFO: renamed from: b1 */
    private final void m85960b1() {
        ResourceDetectors resourceDetector;
        if (getContext() == null) {
            return;
        }
        Subject subject = this.mMovieDetailBean;
        String str = "";
        if (subject != null && (resourceDetector = subject.getResourceDetector()) != null) {
            String resourceLink = resourceDetector.getResourceLink();
            str = resourceLink != null ? resourceLink : "";
            resourceDetector.getResourceId();
            resourceDetector.isMultiResolution();
        }
        String str2 = str;
        Subject subject2 = this.mMovieDetailBean;
        String ops = null;
        if (subject2 != null) {
            Integer subjectType = subject2.getSubjectType();
            int value = SubjectType.SHORT_TV.getValue();
            if (subjectType != null && subjectType.intValue() == value) {
                DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
                Context context = getContext();
                Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                String str3 = this.ops;
                if (str3 == null || str3.length() == 0) {
                    Subject subject3 = this.mMovieDetailBean;
                    if (subject3 != null) {
                        ops = subject3.getOps();
                    }
                } else {
                    ops = this.ops;
                }
                downloadManagerApiM87093a.m87086d0(fragmentActivity, "subjectdetail", (384 & 4) != 0 ? "" : "", ops, (384 & 16) != 0 ? null : "download_subject", (384 & 32) != 0 ? false : true, (384 & 64) != 0 ? null : this.mMovieDetailBean, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? Boolean.FALSE : null);
                return;
            }
        }
        VideoDetailMediaSource videoDetailMediaSource = (VideoDetailMediaSource) m85992o1().m86129x().m14847f();
        int ep2 = (videoDetailMediaSource == null || videoDetailMediaSource.getSe() != this.curSeason) ? 0 : videoDetailMediaSource.getEp();
        DownloadManagerApi downloadManagerApiM87093a2 = DownloadManagerApi.f66480j.m87093a();
        Context context2 = getContext();
        Intrinsics.m97800f(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity2 = (FragmentActivity) context2;
        Subject subject4 = this.mMovieDetailBean;
        String str4 = this.ops;
        if (str4 == null || str4.length() == 0) {
            Subject subject5 = this.mMovieDetailBean;
            if (subject5 != null) {
                ops = subject5.getOps();
            }
        } else {
            ops = this.ops;
        }
        DownloadManagerApi.m87025N(downloadManagerApiM87093a2, fragmentActivity2, subject4, "subjectdetail", "", ops, str2, String.valueOf(ep2), this.moduleName, null, true, this.curSeason, false, 256, null);
    }

    /* JADX INFO: renamed from: b2 */
    private final void m85961b2() {
        GradientTextView gradientTextView;
        AppCompatImageView appCompatImageView;
        final Subject subject = this.mMovieDetailBean;
        if (subject != null) {
            C25756i mViewBinding = getMViewBinding();
            if (mViewBinding != null && (appCompatImageView = mViewBinding.f78580k) != null) {
                appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StreamDetailFragment.m85963c2(this.f65789a, subject, view);
                    }
                });
            }
            C25756i mViewBinding2 = getMViewBinding();
            if (mViewBinding2 == null || (gradientTextView = mViewBinding2.f78588s) == null) {
                return;
            }
            gradientTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StreamDetailFragment.m85965d2(this.f65935a, subject, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c1 */
    private final void m85962c1() {
        BubbleTextView bubbleTextView;
        this.hasClickedActivityTip = true;
        C25756i mViewBinding = getMViewBinding();
        if (mViewBinding == null || (bubbleTextView = mViewBinding.f78571b) == null) {
            return;
        }
        AbstractC26006c.m102054g(bubbleTextView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public static final void m85963c2(StreamDetailFragment streamDetailFragment, Subject subject, View view) {
        String url;
        InterfaceC23888a interfaceC23888aM85989n1 = streamDetailFragment.m85989n1();
        if (interfaceC23888aM85989n1 != null) {
            Context context = view.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            String str = streamDetailFragment.mSubjectId;
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
            interfaceC23888aM85989n1.mo75361e(context, str, url, title, description, 3);
        }
        C14450a.f50860a.m65145h("subjectdetail", "post", (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
    }

    /* JADX INFO: renamed from: d1 */
    private final void m85964d1() {
        LinearLayout root;
        ViewParent parent;
        C25757j c25757j = this.loadingViewBinding;
        if (c25757j == null || (root = c25757j.getRoot()) == null || (parent = root.getParent()) == null || !(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).removeView(root);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public static final void m85965d2(StreamDetailFragment streamDetailFragment, Subject subject, View view) {
        String url;
        InterfaceC23888a interfaceC23888aM85989n1 = streamDetailFragment.m85989n1();
        if (interfaceC23888aM85989n1 != null) {
            Context context = view.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            String str = streamDetailFragment.mSubjectId;
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
            interfaceC23888aM85989n1.mo75361e(context, str, url, title, description, 3);
        }
        C14450a.f50860a.m65145h("subjectdetail", "post", (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public final void m85966e1() {
        InterfaceC24450a interfaceC24450a = this.playerControl;
        if (interfaceC24450a != null) {
            interfaceC24450a.removeNoNetError();
        }
        this.showNetErr = false;
    }

    /* JADX INFO: renamed from: e2 */
    private final void m85967e2(Subject subject) {
        Cover stills;
        FrameLayout frameLayout;
        C26866a.a.m104901l(C26866a.f81698a, "videoDetail", "展示作品大图或者预告片", false, 4, null);
        if (subject != null) {
            Trailer trailer = subject.getTrailer();
            if ((trailer == null || (stills = trailer.getCover()) == null) && (stills = subject.getStills()) == null) {
                stills = subject.getCover();
            }
            if (stills != null) {
                int iM66409f = C14752e.m66409f();
                C25756i mViewBinding = getMViewBinding();
                if (mViewBinding == null || (frameLayout = mViewBinding.f78577h) == null) {
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
                    C14291e.m64747d(C14291e.f50565a, thumbnail == null ? "" : thumbnail, 0, 0, new Function1() { // from class: com.transsion.videodetail.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return StreamDetailFragment.m85969f2(this.f65939a, (BitmapDrawable) obj);
                        }
                    }, 6, null);
                    Context context = imageView.getContext();
                    Intrinsics.m97801g(context, "getContext(...)");
                    aVar.m94457m(context).m94468g(strM94447e).m94470i(com.p282tn.lib.widget.R$color.transparent).m94465d(imageView);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public final void m85968f1(VideoDetailMediaSource episodeMedia) {
        if (episodeMedia == null) {
            return;
        }
        VideoDetailStreamList videoDetailStreamList = (VideoDetailStreamList) m85992o1().m86128w().m14847f();
        if (videoDetailStreamList != null && videoDetailStreamList.getSe() == episodeMedia.getSe() && videoDetailStreamList.getEp() == episodeMedia.getEp()) {
            return;
        }
        InterfaceC24450a interfaceC24450a = this.playerControl;
        if (interfaceC24450a != null) {
            interfaceC24450a.reset();
        }
        showLoading();
        m85992o1().m86127v(episodeMedia);
        m85957Z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2 */
    public static final Unit m85969f2(StreamDetailFragment streamDetailFragment, BitmapDrawable drawable) {
        FrameLayout frameLayout;
        Intrinsics.m97802h(drawable, "drawable");
        C25756i mViewBinding = streamDetailFragment.getMViewBinding();
        if (mViewBinding != null && (frameLayout = mViewBinding.f78577h) != null) {
            frameLayout.setBackground(drawable);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: g1 */
    private final C22169k0 m85970g1() {
        return (C22169k0) this.downloadViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public final boolean m85971g2(final FloatActionType actionType) {
        final FragmentActivity activity;
        ConstraintLayout root;
        Integer subjectType;
        Subject subject = this.mMovieDetailBean;
        if (((subject == null || (subjectType = subject.getSubjectType()) == null) ? SubjectType.MOVIE.getValue() : subjectType.intValue()) != SubjectType.MUSIC.getValue() && (activity = getActivity()) != null && !activity.isDestroyed() && !activity.isFinishing()) {
            FloatActionType floatActionType = FloatActionType.ICON;
            if (actionType != floatActionType && !C14496b.f50966a.m65344b().getBoolean("k_pip_enable", true)) {
                C26866a.f81698a.m104912c("VideoFloat", "设置页pip开关被关闭了", true);
                return false;
            }
            final C27425a c27425aM85972h1 = m85972h1();
            if (c27425aM85972h1 != null) {
                if (actionType != floatActionType && !c27425aM85972h1.m106622f().isPlaying()) {
                    C26866a.f81698a.m104912c("VideoFloat-pip", "stream 视频暂停，无需触发画中画", true);
                    return false;
                }
                InterfaceC27138e.a aVar = InterfaceC27138e.f82251a;
                if (aVar.m105606b().mo86568c()) {
                    InterfaceC24450a interfaceC24450a = this.playerControl;
                    if (interfaceC24450a != null) {
                        interfaceC24450a.hideBottomController(true);
                    }
                    C26866a.f81698a.m104912c("VideoFloat-pip", "stream 当前可用画中画，使用画中画播放", true);
                    if (Build.VERSION.SDK_INT < 31 || actionType != FloatActionType.HOME) {
                        aVar.m105606b().mo86574i(activity, c27425aM85972h1, actionType, this.curPlayerUiType == LongVodUiType.LAND);
                    } else {
                        C25756i mViewBinding = getMViewBinding();
                        if (mViewBinding != null && (root = mViewBinding.getRoot()) != null) {
                            root.postDelayed(new Runnable() { // from class: com.transsion.videodetail.e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    StreamDetailFragment.m85973h2(activity, c27425aM85972h1, actionType, this);
                                }
                            }, 1000L);
                        }
                    }
                    return true;
                }
                InterfaceC27135b.f82245a.m105597c().mo86626g(activity, c27425aM85972h1, actionType == floatActionType, this.curPlayerUiType == LongVodUiType.LAND, new Function1() { // from class: com.transsion.videodetail.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return StreamDetailFragment.m85975i2(this.f65767a, activity, ((Boolean) obj).booleanValue());
                    }
                }, new C20894f());
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01f3  */
    /* JADX INFO: renamed from: h1 */
    private final C27425a m85972h1() {
        List list;
        String str;
        String ops;
        String subjectId;
        String averageHueLight;
        String thumbnail;
        String url;
        VideoDetailStreamList videoDetailStreamList = (VideoDetailStreamList) m85992o1().m86128w().m14847f();
        if (videoDetailStreamList == null || (list = (List) m85992o1().m86124s().m14847f()) == null) {
            return null;
        }
        InterfaceC24450a interfaceC24450a = this.playerControl;
        InterfaceC16634g player = interfaceC24450a != null ? interfaceC24450a.getPlayer() : null;
        InterfaceC24450a interfaceC24450a2 = this.playerControl;
        ORPlayerView orPlayerView = interfaceC24450a2 != null ? interfaceC24450a2.getOrPlayerView() : null;
        InterfaceC24450a interfaceC24450a3 = this.playerControl;
        SimpleSubtitleView subtitleView = interfaceC24450a3 != null ? interfaceC24450a3.getSubtitleView() : null;
        InterfaceC24450a interfaceC24450a4 = this.playerControl;
        ViewGroup subtitleViewGroup = interfaceC24450a4 != null ? interfaceC24450a4.getSubtitleViewGroup() : null;
        if (orPlayerView == null || player == null || this.mMovieDetailBean == null || subtitleView == null) {
            return null;
        }
        PlayMimeType playMimeTypeM85980k1 = m85980k1((VideoDetailStream) CollectionsKt.m97361k0(videoDetailStreamList.getStreams()));
        Subject subject = this.mMovieDetailBean;
        Intrinsics.m97799e(subject);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        String strM101694a = "";
        while (true) {
            int iIntValue = 1;
            if (!it.hasNext()) {
                break;
            }
            VideoDetailMediaSource videoDetailMediaSource = (VideoDetailMediaSource) it.next();
            String subjectId2 = subject.getSubjectId();
            if (subjectId2 == null) {
                subjectId2 = "";
            }
            int ep2 = videoDetailMediaSource.getEp();
            int se2 = videoDetailMediaSource.getSe();
            String title = subject.getTitle();
            String str2 = title == null ? "" : title;
            String str3 = this.lastPageFrom;
            String str4 = str3 == null ? "" : str3;
            List listM85997q1 = m85997q1(videoDetailMediaSource.getStreams());
            Cover cover = subject.getCover();
            String str5 = (cover == null || (url = cover.getUrl()) == null) ? "" : url;
            Cover cover2 = subject.getCover();
            String str6 = (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) ? "" : thumbnail;
            Cover cover3 = subject.getCover();
            String str7 = (cover3 == null || (averageHueLight = cover3.getAverageHueLight()) == null) ? "" : averageHueLight;
            Integer durationSeconds = subject.getDurationSeconds();
            int iIntValue2 = durationSeconds != null ? durationSeconds.intValue() : 0;
            Integer subjectType = subject.getSubjectType();
            if (subjectType != null) {
                iIntValue = subjectType.intValue();
            }
            ArrayList arrayList2 = arrayList;
            C24715a c24715a = new C24715a(subjectId2, playMimeTypeM85980k1, 0L, ep2, se2, str2, null, str4, "stream_detail", listM85997q1, str5, str6, str7, iIntValue2, Integer.valueOf(iIntValue), false, subject.getTitle(), subject.getOps(), 32832, null);
            strM101694a = C25894a.f79115a.m101694a(c24715a);
            c24715a.m97070z(this.mMovieDetailBean);
            arrayList2.add(c24715a);
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = arrayList;
        C26866a.a aVar = C26866a.f81698a;
        Subject subject2 = this.mMovieDetailBean;
        String title2 = subject2 != null ? subject2.getTitle() : null;
        aVar.m104912c("VideoFloat", "stream-----showFloat, title:" + title2 + ",se:" + videoDetailStreamList.getSe() + ",ep:" + videoDetailStreamList.getEp(), true);
        StreamFloatManager.f65956b.m86498v(arrayList3);
        InterfaceC24450a interfaceC24450a5 = this.playerControl;
        C24717c playingStream = interfaceC24450a5 != null ? interfaceC24450a5.getPlayingStream() : null;
        FloatPlayType floatPlayType = FloatPlayType.STREAM;
        Subject subject3 = this.mMovieDetailBean;
        String str8 = (subject3 == null || (subjectId = subject3.getSubjectId()) == null) ? "" : subjectId;
        int se3 = videoDetailStreamList.getSe();
        int ep3 = videoDetailStreamList.getEp();
        String str9 = strM101694a;
        C27425a c27425a = new C27425a(orPlayerView, player, subtitleViewGroup, floatPlayType, str8, se3, ep3, playingStream != null ? playingStream.m97081e() : null, "stream_detail");
        c27425a.m106614I(playMimeTypeM85980k1);
        Subject subject4 = this.mMovieDetailBean;
        c27425a.m106615J(subject4 != null ? subject4.getSubjectType() : null);
        c27425a.m106608C(str9);
        Subject subject5 = this.mMovieDetailBean;
        if (subject5 == null || (ops = subject5.getOps()) == null) {
            str = this.ops;
        } else {
            str = ops.length() > 0 ? ops : null;
            if (str == null) {
                str = this.ops;
            }
        }
        c27425a.m106606A(str);
        c27425a.m106607B(this.lastPageFrom);
        return c27425a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public static final void m85973h2(FragmentActivity fragmentActivity, C27425a c27425a, FloatActionType floatActionType, StreamDetailFragment streamDetailFragment) {
        InterfaceC27138e.f82251a.m105606b().mo86574i(fragmentActivity, c27425a, floatActionType, streamDetailFragment.curPlayerUiType == LongVodUiType.LAND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final void m85974i1(StreamDetailFragment streamDetailFragment, View view) {
        streamDetailFragment.requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public static final Unit m85975i2(StreamDetailFragment streamDetailFragment, FragmentActivity fragmentActivity, boolean z11) {
        InterfaceC24450a interfaceC24450a;
        if (z11 && (interfaceC24450a = streamDetailFragment.playerControl) != null) {
            interfaceC24450a.exitFullScreen();
        }
        InterfaceC24450a interfaceC24450a2 = streamDetailFragment.playerControl;
        if (interfaceC24450a2 != null) {
            interfaceC24450a2.setFloatIsShow(z11);
        }
        if (z11) {
            fragmentActivity.finish();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: j1 */
    private final InterfaceC22998b m85977j1() {
        return (InterfaceC22998b) this.memberProvider.getValue();
    }

    /* JADX INFO: renamed from: j2 */
    private final void m85978j2() {
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
        C25756i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (frameLayout3 = mViewBinding.f78578i) != null) {
            AbstractC26006c.m102058k(frameLayout3);
        }
        C25756i mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (frameLayout2 = mViewBinding2.f78578i) != null) {
            frameLayout2.removeAllViews();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C25756i mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (frameLayout = mViewBinding3.f78578i) == null) {
            return;
        }
        frameLayout.addView(this.gameResView, layoutParams);
    }

    /* JADX INFO: renamed from: k1 */
    private final PlayMimeType m85980k1(VideoDetailStream stream) {
        String upperCase;
        String format;
        if (stream == null || (format = stream.getFormat()) == null) {
            upperCase = null;
        } else {
            upperCase = format.toUpperCase(Locale.ROOT);
            Intrinsics.m97801g(upperCase, "toUpperCase(...)");
        }
        if (Intrinsics.m97797c(upperCase, "DASH")) {
            return PlayMimeType.DASH;
        }
        return Intrinsics.m97797c(upperCase, "HLS") ? PlayMimeType.HLS : PlayMimeType.DEFAULT;
    }

    /* JADX INFO: renamed from: k2 */
    private final void m85981k2() {
        InterfaceC24450a interfaceC24450a = this.playerControl;
        if (interfaceC24450a != null) {
            interfaceC24450a.showNoNetError();
        }
        this.showNetErr = true;
    }

    /* JADX INFO: renamed from: l1 */
    private final MovieDetailViewModel m85983l1() {
        return (MovieDetailViewModel) this.movieDetailViewModel.getValue();
    }

    /* JADX INFO: renamed from: l2 */
    private final void m85984l2() {
        Context context;
        List<DubsInfo> listL;
        Integer subjectType;
        if (this.playerControl == null && (context = getContext()) != null) {
            Subject subject = this.mMovieDetailBean;
            LongVodPageType longVodPageType = ((subject == null || (subjectType = subject.getSubjectType()) == null) ? SubjectType.MOVIE.getValue() : subjectType.intValue()) == SubjectType.MUSIC.getValue() ? LongVodPageType.MUSIC : LongVodPageType.STREAM;
            C25756i mViewBinding = getMViewBinding();
            if (mViewBinding != null) {
                this.tsInitStart = SystemClock.elapsedRealtime();
                LongVodPlayerView longVodPlayerView = new LongVodPlayerView(context);
                String strName = longVodPageType.name();
                Subject subject2 = this.mMovieDetailBean;
                String str = strName + (subject2 != null ? subject2.getSubjectId() : null);
                FrameLayout frameLayout = mViewBinding.f78576g;
                LinearLayoutCompat linearLayoutCompat = mViewBinding.f78581l.f77877f;
                Subject subject3 = this.mMovieDetailBean;
                if (subject3 == null || (listL = subject3.getDubs()) == null) {
                    listL = CollectionsKt.m97506l();
                }
                InterfaceC24450a.a.m95941a(longVodPlayerView, "stream_detail", longVodPageType, str, frameLayout, linearLayoutCompat, listL, null, 64, null);
                Subject subject4 = this.mMovieDetailBean;
                longVodPlayerView.initAdHelper(subject4 != null ? subject4.getGenre() : null);
                longVodPlayerView.setFeedBackVisible(true);
                longVodPlayerView.setAudioSelectCallback(new Function1() { // from class: com.transsion.videodetail.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return StreamDetailFragment.m85987m2(this.f65942a, (DubsInfo) obj);
                    }
                });
                this.tsInitDone = SystemClock.elapsedRealtime();
                this.tsAddView = SystemClock.elapsedRealtime();
                mViewBinding.f78577h.addView(longVodPlayerView);
                this.playerControl = longVodPlayerView;
                longVodPlayerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC20895g(longVodPlayerView, this));
            }
            Subject subject5 = this.mMovieDetailBean;
            if (subject5 != null) {
                m85912C1(subject5);
            }
            InterfaceC24450a interfaceC24450a = this.playerControl;
            if (interfaceC24450a != null) {
                interfaceC24450a.setCallback(new C20896h());
            }
        }
    }

    /* JADX INFO: renamed from: m1 */
    private final VideoDetailMediaSource m85986m1(VideoDetailPlayBean history, List episodeMediaList) {
        Object obj = null;
        if (history == null) {
            C26866a.a.m104898f(C26866a.f81698a, "videoDetail", "getPlayingItem 无历史记录，se:" + this.targetSeason, false, 4, null);
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
        if (se2 == i11 || i11 <= 0 || history.getSe() <= 0) {
            this.curSeason = history.getSe();
            C26866a.a.m104898f(C26866a.f81698a, "videoDetail", "getPlayingItem 有历史记录，不指定季使用历史记录，se:" + history.getSe() + ", ep:" + history.getEp(), false, 4, null);
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
        C26866a.a.m104898f(C26866a.f81698a, "videoDetail", "getPlayingItem 有历史记录，指定季，history se:" + history.getSe() + ", ep:" + history.getEp() + "， target se:" + this.targetSeason + ", targetEp:" + this.targetEp, false, 4, null);
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
    /* JADX INFO: renamed from: m2 */
    public static final Unit m85987m2(StreamDetailFragment streamDetailFragment, DubsInfo info) {
        Integer numValueOf;
        List<DubsInfo> dubs;
        Intrinsics.m97802h(info, "info");
        C26866a.a.m104899g(C26866a.f81698a, "AudioSelectCallback " + info, false, 2, null);
        Subject subject = streamDetailFragment.mMovieDetailBean;
        if (subject == null || (dubs = subject.getDubs()) == null) {
            numValueOf = null;
        } else {
            Iterator<DubsInfo> it = dubs.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (Intrinsics.m97797c(it.next().getLanCode(), info.getLanCode())) {
                    break;
                }
                i11++;
            }
            numValueOf = Integer.valueOf(i11);
        }
        if ((numValueOf != null && numValueOf.intValue() == -1) || info.getSubjectId() == null) {
            C26866a.a.m104899g(C26866a.f81698a, "AudioSelectCallback info can't find in dubs", false, 2, null);
        } else {
            streamDetailFragment.m85983l1().m70916P().mo14858q(info);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: n1 */
    private final InterfaceC23888a m85989n1() {
        return (InterfaceC23888a) this.publishedApi.getValue();
    }

    /* JADX INFO: renamed from: n2 */
    private final void m85990n2() {
        new C28625g(this, R$id.subjectDetailLayout, this.mMovieDetailBean, "stream_detail", this.moduleName, false, false, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public final VideoDetailViewModel m85992o1() {
        return (VideoDetailViewModel) this.videoDetailViewModel.getValue();
    }

    /* JADX INFO: renamed from: o2 */
    private final void m85993o2() {
        BubbleTextView bubbleTextView;
        C25756i mViewBinding;
        DownloadView downloadView;
        C25756i mViewBinding2;
        DownloadView downloadView2;
        BubbleTextView bubbleTextView2;
        if (!m85953X0() || (mViewBinding = getMViewBinding()) == null || (downloadView = mViewBinding.f78573d) == null || downloadView.getVisibility() != 0 || (mViewBinding2 = getMViewBinding()) == null || (downloadView2 = mViewBinding2.f78573d) == null || downloadView2.getCom.cloud.tmc.kernel.minicover.NativeComponentConstants.KEY_COMPONENT_TYPE java.lang.String() != 0) {
            C25756i mViewBinding3 = getMViewBinding();
            if (mViewBinding3 == null || (bubbleTextView = mViewBinding3.f78571b) == null) {
                return;
            }
            AbstractC26006c.m102054g(bubbleTextView);
            return;
        }
        C25756i mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (bubbleTextView2 = mViewBinding4.f78571b) != null) {
            AbstractC26006c.m102058k(bubbleTextView2);
        }
        m85955Y0();
    }

    /* JADX INFO: renamed from: p2 */
    private final void m85995p2(int visible) {
        HashMap mapM96844g;
        ResourceDetectors resourceDetector;
        DownloadView downloadView;
        C25756i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (downloadView = mViewBinding.f78573d) != null) {
            downloadView.setVisibility(visible);
        }
        Subject subject = this.mMovieDetailBean;
        if (subject != null && (resourceDetector = subject.getResourceDetector()) != null) {
            resourceDetector.getResourceId();
            resourceDetector.isMultiResolution();
        }
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
        }
        m85993o2();
    }

    /* JADX INFO: renamed from: q1 */
    private final List m85997q1(List videoDetailStream) {
        ArrayList arrayList = new ArrayList();
        if (videoDetailStream != null) {
            Iterator it = videoDetailStream.iterator();
            while (it.hasNext()) {
                VideoDetailStream videoDetailStream2 = (VideoDetailStream) it.next();
                arrayList.add(new C24717c(m85980k1(videoDetailStream2), videoDetailStream2.getId(), videoDetailStream2.getUrl(), videoDetailStream2.getResolutions(), videoDetailStream2.getSize(), videoDetailStream2.getDuration(), videoDetailStream2.getSignCookie(), null, 128, null));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q2 */
    static /* synthetic */ void m85998q2(StreamDetailFragment streamDetailFragment, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        streamDetailFragment.m85995p2(i11);
    }

    /* JADX INFO: renamed from: r1 */
    private final void m86000r1() {
        if (this.mMovieDetailBean == null) {
            C26866a.a.m104898f(C26866a.f81698a, "videoDetail", "PlayInfoLive  mMovieDetailBean==null", false, 4, null);
            return;
        }
        VideoDetailStreamList videoDetailStreamList = (VideoDetailStreamList) m85992o1().m86128w().m14847f();
        if (videoDetailStreamList == null) {
            C26866a.a.m104898f(C26866a.f81698a, "videoDetail", "PlayInfoLive playInfo==null", false, 4, null);
            return;
        }
        VideoDetailMediaSource videoDetailMediaSource = (VideoDetailMediaSource) m85992o1().m86129x().m14847f();
        if (videoDetailMediaSource == null) {
            C26866a.a.m104898f(C26866a.f81698a, "videoDetail", "PlayInfoLive media==null", false, 4, null);
            return;
        }
        if (Intrinsics.m97797c(videoDetailStreamList, this.videoDetailStreamList)) {
            C26866a.a.m104898f(C26866a.f81698a, "videoDetail", "PlayInfoLive data:" + videoDetailStreamList + "  media:" + videoDetailMediaSource + "  重复播放数据，不处理", false, 4, null);
            return;
        }
        if (videoDetailMediaSource.getEp() == videoDetailStreamList.getEp() && videoDetailMediaSource.getSe() == videoDetailStreamList.getSe()) {
            this.videoDetailStreamList = videoDetailStreamList;
            m85964d1();
            m85954X1(videoDetailStreamList);
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "videoDetail", "PlayInfoLive data:" + videoDetailStreamList + "  media:" + videoDetailMediaSource + "  不相同，不播放", false, 4, null);
    }

    /* JADX INFO: renamed from: r2 */
    private final void m86001r2() {
        Subject subject;
        ResourcesSeasonList resourcesSeasonList = (ResourcesSeasonList) m85992o1().m86130y().m14847f();
        if (resourcesSeasonList == null || (subject = this.mMovieDetailBean) == null) {
            return;
        }
        if (subject != null && subject.isFamilyModeIntercept()) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
            AbstractC3168w abstractC3168wM14557p = childFragmentManager.m14557p();
            Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
            ResourceDetectorFamilyModeFragment resourceDetectorFamilyModeFragment = new ResourceDetectorFamilyModeFragment();
            resourceDetectorFamilyModeFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("data_key_resource_detectors", this.mMovieDetailBean)));
            abstractC3168wM14557p.m14813s(R$id.resourceDetectorGroup, resourceDetectorFamilyModeFragment);
            abstractC3168wM14557p.mo14671j();
            m85995p2(8);
            return;
        }
        this.hasResource = !resourcesSeasonList.isNoSource();
        if (resourcesSeasonList.isNoSource()) {
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.m97801g(childFragmentManager2, "getChildFragmentManager(...)");
            AbstractC3168w abstractC3168wM14557p2 = childFragmentManager2.m14557p();
            Intrinsics.m97801g(abstractC3168wM14557p2, "beginTransaction()");
            ResourceDetectorEmptyFragment resourceDetectorEmptyFragment = new ResourceDetectorEmptyFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("data_key_resource_detectors", this.mMovieDetailBean);
            resourceDetectorEmptyFragment.setArguments(bundle);
            abstractC3168wM14557p2.m14813s(R$id.resourceDetectorGroup, resourceDetectorEmptyFragment);
            abstractC3168wM14557p2.mo14671j();
            m85995p2(8);
        } else {
            FragmentManager childFragmentManager3 = getChildFragmentManager();
            Intrinsics.m97801g(childFragmentManager3, "getChildFragmentManager(...)");
            AbstractC3168w abstractC3168wM14557p3 = childFragmentManager3.m14557p();
            Intrinsics.m97801g(abstractC3168wM14557p3, "beginTransaction()");
            VideoEpisodeFragment videoEpisodeFragment = new VideoEpisodeFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("data_key_resource_detectors", this.mMovieDetailBean);
            bundle2.putString("ops", this.ops);
            bundle2.putBoolean("auto_play", this.autoPlay);
            bundle2.putString("auto_play_resource_id", this.autoPlayResourceId);
            bundle2.putString("module_name", this.moduleName);
            bundle2.putInt("season", this.curSeason);
            videoEpisodeFragment.setArguments(bundle2);
            abstractC3168wM14557p3.m14813s(R$id.resourceDetectorGroup, videoEpisodeFragment);
            videoEpisodeFragment.m86174P0(new Function1() { // from class: com.transsion.videodetail.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return StreamDetailFragment.m86004s2(this.f65786a, (DubsInfo) obj);
                }
            });
            abstractC3168wM14557p3.mo14671j();
            m85998q2(this, 0, 1, null);
        }
        if (!resourcesSeasonList.isNoSource()) {
            m85984l2();
            return;
        }
        m85967e2(this.mMovieDetailBean);
        FragmentActivity activity = getActivity();
        BaseMusicFloatActivity baseMusicFloatActivity = activity instanceof BaseMusicFloatActivity ? (BaseMusicFloatActivity) activity : null;
        if (baseMusicFloatActivity != null) {
            baseMusicFloatActivity.showMusicFloating();
        }
    }

    /* JADX INFO: renamed from: s1 */
    private final void m86003s1() {
        BubbleTextView bubbleTextView;
        BubbleTextView bubbleTextView2;
        BubbleTextView bubbleTextView3;
        C25756i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (bubbleTextView3 = mViewBinding.f78571b) != null) {
            bubbleTextView3.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StreamDetailFragment.m86006t1(this.f65748a, view);
                }
            });
        }
        C25756i mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (bubbleTextView2 = mViewBinding2.f78571b) != null) {
            AbstractC26006c.m102058k(bubbleTextView2);
        }
        m85955Y0();
        C25756i mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (bubbleTextView = mViewBinding3.f78571b) == null) {
            return;
        }
        AbstractC26006c.m102054g(bubbleTextView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public static final Unit m86004s2(StreamDetailFragment streamDetailFragment, DubsInfo info) {
        Integer numValueOf;
        List<DubsInfo> dubs;
        Intrinsics.m97802h(info, "info");
        C26866a.a.m104899g(C26866a.f81698a, "AudioSelectCallback " + info, false, 2, null);
        Subject subject = streamDetailFragment.mMovieDetailBean;
        if (subject == null || (dubs = subject.getDubs()) == null) {
            numValueOf = null;
        } else {
            Iterator<DubsInfo> it = dubs.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (Intrinsics.m97797c(it.next().getLanCode(), info.getLanCode())) {
                    break;
                }
                i11++;
            }
            numValueOf = Integer.valueOf(i11);
        }
        if ((numValueOf != null && numValueOf.intValue() == -1) || info.getSubjectId() == null) {
            C26866a.a.m104899g(C26866a.f81698a, "AudioSelectCallback info can't find in dubs", false, 2, null);
        } else {
            streamDetailFragment.m85983l1().m70916P().mo14858q(info);
        }
        return Unit.f75682a;
    }

    private final void showLoading() {
        LinearLayout root;
        C25756i mViewBinding;
        FrameLayout frameLayout;
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (this.loadingViewBinding == null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            C25756i mViewBinding2 = getMViewBinding();
            this.loadingViewBinding = C25757j.m101299c(layoutInflaterFrom, mViewBinding2 != null ? mViewBinding2.f78577h : null, false);
        }
        C25757j c25757j = this.loadingViewBinding;
        if (c25757j == null || (root = c25757j.getRoot()) == null) {
            return;
        }
        if (root.getParent() == null && (mViewBinding = getMViewBinding()) != null && (frameLayout = mViewBinding.f78577h) != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            layoutParams.bottomMargin = AbstractC5790i.m27411e(20.0f);
            Unit unit = Unit.f75682a;
            frameLayout.addView(root, layoutParams);
        }
        AbstractC26006c.m102058k(root);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final void m86006t1(StreamDetailFragment streamDetailFragment, View view) {
        C26866a.a.m104898f(C26866a.f81698a, "videoDetail", "Click activity tip", false, 4, null);
        streamDetailFragment.hasClickedActivityTip = true;
        Intrinsics.m97799e(view);
        AbstractC26006c.m102054g(view);
    }

    /* JADX INFO: renamed from: t2 */
    private final void m86007t2(Subject movieDetailBean) {
        Subject subject;
        View view;
        View view2;
        FrameLayout frameLayout;
        this.mMovieDetailBean = movieDetailBean;
        m85936O1(movieDetailBean != null ? movieDetailBean.getGenre() : null);
        if (!this.isGameResInit) {
            m86017y1();
            m85944S1(true);
        }
        Subject subject2 = this.mMovieDetailBean;
        String ops = subject2 != null ? subject2.getOps() : null;
        if ((ops == null || ops.length() == 0) && (subject = this.mMovieDetailBean) != null) {
            subject.setOps(this.ops);
        }
        ResourcesSeasonList resourcesSeasonList = (ResourcesSeasonList) m85992o1().m86130y().m14847f();
        Subject subject3 = this.mMovieDetailBean;
        if (subject3 != null && subject3.isFamilyModeIntercept()) {
            C25756i mViewBinding = getMViewBinding();
            if (mViewBinding != null && (frameLayout = mViewBinding.f78577h) != null) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
                ((ViewGroup.MarginLayoutParams) c2308b).height = AbstractC23384a.m92908b(48);
                frameLayout.setLayoutParams(c2308b);
            }
            C25756i mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (view2 = mViewBinding2.f78589t) != null) {
                AbstractC26006c.m102054g(view2);
            }
            C25756i mViewBinding3 = getMViewBinding();
            if (mViewBinding3 != null && (view = mViewBinding3.f78590u) != null) {
                view.setBackgroundResource(com.p282tn.lib.widget.R$color.bg_01);
            }
        } else if (resourcesSeasonList != null && resourcesSeasonList.isNoSource()) {
            m85967e2(this.mMovieDetailBean);
        }
        m86009u1();
        m85961b2();
    }

    /* JADX INFO: renamed from: u1 */
    private final void m86009u1() {
        Subject subject = this.mMovieDetailBean;
        C25756i mViewBinding = getMViewBinding();
        MagicIndicator magicIndicator = mViewBinding != null ? mViewBinding.f78582m : null;
        C25756i mViewBinding2 = getMViewBinding();
        this.bottomRecHelper = new C28623e(this, subject, magicIndicator, mViewBinding2 != null ? mViewBinding2.f78584o : null, "stream_detail", false, false, new Function1() { // from class: com.transsion.videodetail.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StreamDetailFragment.m86011v1(this.f65945a, ((Integer) obj).intValue());
            }
        }, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public static final Unit m86011v1(StreamDetailFragment streamDetailFragment, int i11) {
        DownloadView downloadView;
        GradientTextView gradientTextView;
        Subject subject;
        DownloadView downloadView2;
        if (!streamDetailFragment.hasResource || ((subject = streamDetailFragment.mMovieDetailBean) != null && subject.isFamilyModeIntercept())) {
            C25756i mViewBinding = streamDetailFragment.getMViewBinding();
            if (mViewBinding != null && (downloadView = mViewBinding.f78573d) != null) {
                AbstractC26006c.m102054g(downloadView);
            }
        } else {
            C25756i mViewBinding2 = streamDetailFragment.getMViewBinding();
            if (mViewBinding2 != null && (downloadView2 = mViewBinding2.f78573d) != null) {
                downloadView2.setVisibility(i11 != 1 ? 0 : 8);
            }
        }
        C25756i mViewBinding3 = streamDetailFragment.getMViewBinding();
        if (mViewBinding3 != null && (gradientTextView = mViewBinding3.f78588s) != null) {
            gradientTextView.setVisibility(i11 == 1 ? 0 : 8);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: w1 */
    private final void m86013w1() {
        DownloadView downloadView;
        DownloadView downloadView2;
        C25756i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (downloadView2 = mViewBinding.f78573d) != null) {
            DownloadView.setAttrs$default(downloadView2, null, Float.valueOf(C14752e.m66410g(16.0f)), null, 5, null);
        }
        C25756i mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (downloadView = mViewBinding2.f78573d) == null) {
            return;
        }
        downloadView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StreamDetailFragment.m86015x1(this.f65771a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static final void m86015x1(StreamDetailFragment streamDetailFragment, View view) {
        ResourceDetectors resourceDetector;
        List<DownloadItem> resolutionList;
        Subject subject;
        ResourceDetectors resourceDetector2;
        ResourceDetectors resourceDetector3;
        List<DownloadItem> resolutionList2;
        Subject subject2 = streamDetailFragment.mMovieDetailBean;
        if (subject2 != null && (resourceDetector = subject2.getResourceDetector()) != null && (resolutionList = resourceDetector.getResolutionList()) != null && (!resolutionList.isEmpty())) {
            Subject subject3 = streamDetailFragment.mMovieDetailBean;
            Integer numValueOf = (subject3 == null || (resourceDetector3 = subject3.getResourceDetector()) == null || (resolutionList2 = resourceDetector3.getResolutionList()) == null) ? null : Integer.valueOf(resolutionList2.size());
            Intrinsics.m97799e(numValueOf);
            if (numValueOf.intValue() > 1 && (subject = streamDetailFragment.mMovieDetailBean) != null && (resourceDetector2 = subject.getResourceDetector()) != null) {
                resourceDetector2.setType(1);
            }
        }
        streamDetailFragment.m85960b1();
        streamDetailFragment.m85962c1();
    }

    /* JADX INFO: renamed from: y1 */
    private final void m86017y1() {
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
                interfaceC27083b.mo65960a(context, "stream_detail", gameInfoType, str, new Function1() { // from class: com.transsion.videodetail.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return StreamDetailFragment.m86019z1(this.f65948a, (View) obj);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public static final Unit m86019z1(StreamDetailFragment streamDetailFragment, View view) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        streamDetailFragment.gameResView = view;
        if (view == null) {
            C25756i mViewBinding = streamDetailFragment.getMViewBinding();
            if (mViewBinding != null && (frameLayout2 = mViewBinding.f78578i) != null) {
                AbstractC26006c.m102054g(frameLayout2);
            }
            C25756i mViewBinding2 = streamDetailFragment.getMViewBinding();
            if (mViewBinding2 != null && (frameLayout = mViewBinding2.f78578i) != null) {
                frameLayout.removeAllViews();
            }
        } else {
            streamDetailFragment.m85978j2();
        }
        return Unit.f75682a;
    }

    @Override // co.InterfaceC5146a
    /* JADX INFO: renamed from: S */
    public void mo24053S(Function0 callback) {
        this.backPressedCallback = callback;
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m86020Z1() {
        InterfaceC24450a interfaceC24450a;
        C27136c c27136c = C27136c.f82250a;
        InterfaceC24450a interfaceC24450a2 = this.playerControl;
        if (c27136c.m105602c(interfaceC24450a2 != null ? interfaceC24450a2.getPlayer() : null) || (interfaceC24450a = this.playerControl) == null) {
            return;
        }
        interfaceC24450a.release();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getLoadingView() {
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R$layout.default_movie_detail_skeleton_drawing_layout, (ViewGroup) getFlStateView(), false);
        ((AppCompatImageView) viewInflate.findViewById(R$id.ivBack)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StreamDetailFragment.m85974i1(this.f65774a, view);
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
        C25756i mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            mViewBinding.f78579j.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StreamDetailFragment.m85908A1(this.f65739a, view);
                }
            });
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        View view;
        C25756i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (view = mViewBinding.f78590u) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
            ((ViewGroup.MarginLayoutParams) c2308b).height = AbstractC5781d.m27351c();
            view.setLayoutParams(c2308b);
        }
        requireActivity().getOnBackPressedDispatcher().m942i(this, new C20891c());
        m86003s1();
        m86013w1();
        m85916E1();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        MovieDetailViewModel movieDetailViewModelM85983l1 = m85983l1();
        movieDetailViewModelM85983l1.m70910F().m14851j(this, new C20893e(new Function1() { // from class: com.transsion.videodetail.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StreamDetailFragment.m85928K1(this.f65755a, (Pair) obj);
            }
        }));
        movieDetailViewModelM85983l1.m70914K().m14851j(this, new C20893e(new Function1() { // from class: com.transsion.videodetail.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StreamDetailFragment.m85930L1(this.f65932a, (Integer) obj);
            }
        }));
        m85992o1().m86130y().m14851j(this, new C20893e(new Function1() { // from class: com.transsion.videodetail.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StreamDetailFragment.m85932M1(this.f65954a, (ResourcesSeasonList) obj);
            }
        }));
        m85992o1().m86124s().m14851j(this, new C20893e(new Function1() { // from class: com.transsion.videodetail.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StreamDetailFragment.m85934N1(this.f65964a, (List) obj);
            }
        }));
        m85992o1().m86129x().m14851j(this, new C20893e(new Function1() { // from class: com.transsion.videodetail.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StreamDetailFragment.m85920G1(this.f65966a, (VideoDetailMediaSource) obj);
            }
        }));
        m85992o1().m86126u().m14851j(this, new C20893e(new Function1() { // from class: com.transsion.videodetail.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StreamDetailFragment.m85922H1(this.f65968a, (VideoDetailPlayBean) obj);
            }
        }));
        m85983l1().m70916P().m14851j(this, new C20893e(new Function1() { // from class: com.transsion.videodetail.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StreamDetailFragment.m85924I1(this.f65971a, (DubsInfo) obj);
            }
        }));
        m85970g1().m89793c().m14851j(this, new C20893e(new Function1() { // from class: com.transsion.videodetail.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StreamDetailFragment.m85926J1(this.f65973a, (Boolean) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isRegisteDeviceKeyMonitor() {
        return true;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void loadDefaultData() {
        m85940Q1(this, false, 1, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("stream_detail", false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MovieDetailActivity.INSTANCE.m70152a("videoDetail------- onCreate ------");
        C27287m.f83003a.m106336l(this.networkStatusChangedListener);
        this.adHelper = new NativeCardPageAdHelper(AbstractC3226v.m14968a(this));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m85946T1();
        setMViewBinding(null);
        NativeCardPageAdHelper nativeCardPageAdHelper = this.adHelper;
        if (nativeCardPageAdHelper != null) {
            nativeCardPageAdHelper.m86956x();
        }
        this.adHelper = null;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, com.transsion.baselib.utils.DeviceKeyMonitor.InterfaceC14502b
    public void onHomeClick() {
        super.onHomeClick();
        C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "StreamDetail onHomeClick", false, 4, null);
        m85971g2(FloatActionType.HOME);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C27136c c27136c = C27136c.f82250a;
        InterfaceC24450a interfaceC24450a = this.playerControl;
        if (!c27136c.m105602c(interfaceC24450a != null ? interfaceC24450a.getPlayer() : null)) {
            m85992o1().m86128w().mo14856o(this.playInfoObserver);
        }
        m85944S1(false);
        NativeCardPageAdHelper nativeCardPageAdHelper = this.adHelper;
        if (nativeCardPageAdHelper != null) {
            nativeCardPageAdHelper.m86949C();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        InterfaceC24450a interfaceC24450a;
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
        if (isInPictureInPictureMode) {
            FragmentActivity activity = getActivity();
            if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
            C27425a c27425aM85972h1 = m85972h1();
            if (c27425aM85972h1 != null && Build.VERSION.SDK_INT >= 31) {
                C26866a.a.m104898f(C26866a.f81698a, "VideoFloat-pip", "onPictureInPictureModeChanged stream--- updateData==2", false, 4, null);
                InterfaceC27138e.f82251a.m105606b().mo86572g(activity, c27425aM85972h1);
            }
        }
        InterfaceC27138e.f82251a.m105606b().onPipModeChanged(isInPictureInPictureMode);
        InterfaceC24450a interfaceC24450a2 = this.playerControl;
        if (interfaceC24450a2 != null) {
            interfaceC24450a2.onPipModeChanged(isInPictureInPictureMode);
        }
        if (isInPictureInPictureMode || (interfaceC24450a = this.playerControl) == null) {
            return;
        }
        interfaceC24450a.exitFullScreen();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, com.transsion.baselib.utils.DeviceKeyMonitor.InterfaceC14502b
    public void onRecentClick() {
        super.onRecentClick();
        C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "StreamDetail onRecentClick", false, 4, null);
        m85971g2(FloatActionType.HOME);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C26866a.a.m104898f(C26866a.f81698a, "videoDetail", "onResume isInterceptDialogShow --> " + this.isInterceptDialogShow, false, 4, null);
        if (this.isInterceptDialogShow) {
            return;
        }
        InterfaceC24450a interfaceC24450a = this.playerControl;
        if (interfaceC24450a != null) {
            interfaceC24450a.onViewResume();
        }
        m85992o1().m86128w().m14852k(this.playInfoObserver);
        m85944S1(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        InterfaceC24450a interfaceC24450a;
        super.onStop();
        InterfaceC24450a interfaceC24450a2 = this.playerControl;
        if (interfaceC24450a2 != null) {
            interfaceC24450a2.onSaveHistory();
        }
        C27136c c27136c = C27136c.f82250a;
        InterfaceC24450a interfaceC24450a3 = this.playerControl;
        if (c27136c.m105602c(interfaceC24450a3 != null ? interfaceC24450a3.getPlayer() : null) || (interfaceC24450a = this.playerControl) == null) {
            return;
        }
        interfaceC24450a.onViewPause();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public C25756i getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25756i c25756iM101295c = C25756i.m101295c(inflater);
        Intrinsics.m97801g(c25756iM101295c, "inflate(...)");
        return c25756iM101295c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        Bundle arguments = getArguments();
        Long lValueOf = arguments != null ? Long.valueOf(arguments.getLong("ts_enter", 0L)) : null;
        if (lValueOf != null && lValueOf.longValue() == 0) {
            lValueOf = null;
        }
        this.tsEnter = lValueOf != null ? lValueOf.longValue() : SystemClock.elapsedRealtime();
        this.lastPageFrom = C24662i.f75350a.m96877i();
        Bundle arguments2 = getArguments();
        this.ops = arguments2 != null ? arguments2.getString("ops") : null;
        Bundle arguments3 = getArguments();
        this.mSubjectId = arguments3 != null ? arguments3.getString("id") : null;
        Bundle arguments4 = getArguments();
        this.autoDownload = arguments4 != null ? arguments4.getBoolean("auto_download") : false;
        Bundle arguments5 = getArguments();
        this.autoPlay = arguments5 != null ? arguments5.getBoolean("auto_play") : false;
        Bundle arguments6 = getArguments();
        this.autoPlayResourceId = arguments6 != null ? arguments6.getString("auto_play_resource_id") : null;
        Bundle arguments7 = getArguments();
        this.preloadId = arguments7 != null ? arguments7.getInt("yy_preload_id") : 0;
        Bundle arguments8 = getArguments();
        this.moduleName = arguments8 != null ? arguments8.getString("module_name") : null;
        Bundle arguments9 = getArguments();
        this.targetSeason = arguments9 != null ? arguments9.getInt("season") : 0;
        Bundle arguments10 = getArguments();
        this.targetEp = arguments10 != null ? arguments10.getInt("episode") : 0;
        int i11 = this.targetSeason;
        if (i11 <= 0) {
            i11 = 1;
        }
        this.curSeason = i11;
        MovieDetailViewModel movieDetailViewModelM85983l1 = m85983l1();
        int i12 = this.preloadId;
        String str = this.mSubjectId;
        if (str == null) {
            str = "";
        }
        movieDetailViewModelM85983l1.m70918S(i12, str, Integer.valueOf(this.curSeason));
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96847j(this.lastPageFrom);
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        if (this.mMovieDetailBean == null) {
            loadDefaultData();
        }
    }
}
