package com.transsion.postdetail.p306ui.fragment;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.AbstractC0256u;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.cloud.tmc.kernel.utils.UrlUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.therouter.TheRouter;
import com.transsion.baselib.helper.C14453d;
import com.transsion.baselib.helper.ScreenRotationHelper;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.download.DownloadException;
import com.transsion.baselib.p291db.download.DownloadRange;
import com.transsion.baselib.p291db.video.VideoDetailPlayBean;
import com.transsion.baselib.p291db.video.VideoDetailPlayDao;
import com.transsion.baselib.report.C14482a;
import com.transsion.baselib.report.C14492k;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baselib.utils.PlayMode;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.music.MusicFloatManager;
import com.transsion.baseui.util.AbstractC14556b;
import com.transsion.baseui.util.C14563i;
import com.transsion.moviedetailapi.bean.DubsInfo;
import com.transsion.mpush.core.config.PushMsgSource;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.player.config.RenderType;
import com.transsion.player.mediasession.MediaItem;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.PlayError;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.postdetail.R$array;
import com.transsion.postdetail.R$string;
import com.transsion.postdetail.layer.C16780a;
import com.transsion.postdetail.layer.listener.LayerFlag;
import com.transsion.postdetail.layer.local.C16791c0;
import com.transsion.postdetail.layer.local.C16804g1;
import com.transsion.postdetail.layer.local.C16842u0;
import com.transsion.postdetail.layer.local.LocalUiType;
import com.transsion.postdetail.layer.local.LocalVideoMiddleLayer;
import com.transsion.postdetail.p306ui.dialog.C17006o;
import com.transsion.postdetail.util.AbstractC17443m;
import com.transsion.postdetail.util.AbstractC17450t;
import com.transsion.postdetail.util.C17444n;
import com.transsion.postdetail.util.LocalFloatManager;
import com.transsion.postdetail.util.LocalVideoAdHelper;
import com.transsion.subtitle.InterfaceC19714h;
import com.transsion.subtitle.VideoSubtitleControl;
import com.transsion.videofloat.bean.FloatActionType;
import com.transsion.videofloat.manager.C21106a0;
import com.transsnet.downloader.manager.C21851p;
import com.transsnet.downloader.manager.DownloadEsHelper;
import com.transsnet.downloader.manager.InterfaceC21842g;
import com.transsnet.downloader.util.C22094h;
import com.transsnet.downloader.util.DownloadUtil;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fo.C23403e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import mu.InterfaceC25909a;
import no.C26053g0;
import org.mvel2.ast.ASTNode;
import p415fq.InterfaceC23410a;
import p415fq.InterfaceC23411b;
import p438go.C23622d;
import p550kj.C24655b;
import p550kj.C24662i;
import p648oj.C26238b;
import p683po.C26906c;
import p683po.C26907d;
import p723qx.InterfaceC27135b;
import p723qx.InterfaceC27138e;
import p743rh.C27287m;
import p750rp.InterfaceC27316b;
import p844vo.C28141b0;
import p844vo.C28158k;
import p844vo.C28179x;
import p844vo.C28181z;
import p913xm.C28615f;
import p944yh.C28951b;
import p951yo.InterfaceC28989b;
import p951yo.InterfaceC28990c;
import pg.C26866a;
import py.AbstractC26961d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000Ì\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\n*\u0004¸\u0002À\u0002\u0018\u0000 È\u00022\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002\u009a\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u0019\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010\"2\u0006\u0010%\u001a\u00020\u001aH\u0002¢\u0006\u0004\b&\u0010'J\u0011\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010\u0006J\u000f\u0010/\u001a\u00020\u0007H\u0002¢\u0006\u0004\b/\u0010\u0006J\u0017\u00100\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b0\u0010\u001dJ'\u00103\u001a\u00020\u00072\u0006\u00101\u001a\u00020+2\u0006\u00102\u001a\u00020+2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0007H\u0002¢\u0006\u0004\b5\u0010\u0006J\u000f\u00106\u001a\u00020\u0007H\u0002¢\u0006\u0004\b6\u0010\u0006J\u000f\u00107\u001a\u00020\u0007H\u0002¢\u0006\u0004\b7\u0010\u0006J\u001f\u00109\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u00108\u001a\u00020\u0016H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b;\u0010\u0015J\u0017\u0010=\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u0016H\u0002¢\u0006\u0004\b=\u0010\u0019J\u0015\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0007H\u0002¢\u0006\u0004\bB\u0010\u0006J\u000f\u0010C\u001a\u00020\u0007H\u0002¢\u0006\u0004\bC\u0010\u0006J\u0019\u0010E\u001a\u00020\u00072\b\u0010D\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\bE\u0010\u0015J\u000f\u0010F\u001a\u00020\u0007H\u0002¢\u0006\u0004\bF\u0010\u0006J\u000f\u0010G\u001a\u00020\u0007H\u0002¢\u0006\u0004\bG\u0010\u0006J\u000f\u0010H\u001a\u00020\u0007H\u0002¢\u0006\u0004\bH\u0010\u0006J\u0017\u0010K\u001a\u00020\u00072\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ+\u0010P\u001a\u00020\u00072\b\u0010M\u001a\u0004\u0018\u00010\u00122\u0006\u0010N\u001a\u00020I2\b\b\u0002\u0010O\u001a\u00020\u0016H\u0002¢\u0006\u0004\bP\u0010QJ\u0018\u0010R\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u0007H\u0002¢\u0006\u0004\bT\u0010\u0006J\u000f\u0010U\u001a\u00020\u0007H\u0002¢\u0006\u0004\bU\u0010\u0006J\u000f\u0010V\u001a\u00020\u0007H\u0002¢\u0006\u0004\bV\u0010\u0006J\u000f\u0010W\u001a\u00020\u0007H\u0002¢\u0006\u0004\bW\u0010\u0006J\u000f\u0010X\u001a\u00020\u0016H\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020\u0016H\u0002¢\u0006\u0004\b[\u0010\u0019J\u000f\u0010\\\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\\\u0010\u0006J\u0017\u0010_\u001a\u00020\u00072\u0006\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b_\u0010`J\u0017\u0010c\u001a\u00020\u00022\u0006\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\u0016H\u0016¢\u0006\u0004\be\u0010YJ\u000f\u0010f\u001a\u00020\u001aH\u0016¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\u0007H\u0016¢\u0006\u0004\bh\u0010\u0006J\u000f\u0010i\u001a\u00020\u0007H\u0016¢\u0006\u0004\bi\u0010\u0006J\u000f\u0010j\u001a\u00020\u0007H\u0016¢\u0006\u0004\bj\u0010\u0006J\u000f\u0010k\u001a\u00020\u0007H\u0016¢\u0006\u0004\bk\u0010\u0006J\u000f\u0010l\u001a\u00020\u0016H\u0016¢\u0006\u0004\bl\u0010YJ\u000f\u0010m\u001a\u00020\u0007H\u0016¢\u0006\u0004\bm\u0010\u0006J\u001f\u0010r\u001a\u00020\u00072\u0006\u0010o\u001a\u00020n2\u0006\u0010q\u001a\u00020pH\u0016¢\u0006\u0004\br\u0010sJ\u0017\u0010v\u001a\u00020\u00072\u0006\u0010u\u001a\u00020tH\u0016¢\u0006\u0004\bv\u0010wJ\u000f\u0010x\u001a\u00020\u0007H\u0016¢\u0006\u0004\bx\u0010\u0006J\u000f\u0010y\u001a\u00020\u0007H\u0016¢\u0006\u0004\by\u0010\u0006J\u000f\u0010z\u001a\u00020\u0007H\u0016¢\u0006\u0004\bz\u0010\u0006J\u000f\u0010{\u001a\u00020\u0007H\u0016¢\u0006\u0004\b{\u0010\u0006J\r\u0010|\u001a\u00020\u0007¢\u0006\u0004\b|\u0010\u0006J\"\u0010\u007f\u001a\u00020\u00072\b\u0010}\u001a\u0004\u0018\u00010\u001a2\b\u0010~\u001a\u0004\u0018\u00010\u001a¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u000f\u0010\u0081\u0001\u001a\u00020\u0007¢\u0006\u0005\b\u0081\u0001\u0010\u0006J\"\u0010\u0084\u0001\u001a\u00020\u00072\u0006\u0010J\u001a\u00020I2\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u000f\u0010\u0086\u0001\u001a\u00020\u0007¢\u0006\u0005\b\u0086\u0001\u0010\u0006J\u001a\u0010\u0088\u0001\u001a\u00020\u00072\t\b\u0002\u0010\u0087\u0001\u001a\u00020\u0016¢\u0006\u0005\b\u0088\u0001\u0010\u0019J\u001e\u0010\u008b\u0001\u001a\u00020\u00072\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0016¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0013\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0016¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001a\u0010\u0091\u0001\u001a\u00020\u00072\u0007\u0010\u0090\u0001\u001a\u00020\u0016H\u0016¢\u0006\u0005\b\u0091\u0001\u0010\u0019J\u0011\u0010\u0092\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\b\u0092\u0001\u0010\u0006J\u0011\u0010\u0093\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\b\u0093\u0001\u0010\u0006J\u001a\u0010\u0095\u0001\u001a\u00020\u00072\u0007\u0010\u0094\u0001\u001a\u00020\u0016H\u0016¢\u0006\u0005\b\u0095\u0001\u0010\u0019J\u0018\u0010\u0097\u0001\u001a\u00020\u00072\u0007\u0010\u0096\u0001\u001a\u00020\u0016¢\u0006\u0005\b\u0097\u0001\u0010\u0019J\u000f\u0010\u0098\u0001\u001a\u00020\u0007¢\u0006\u0005\b\u0098\u0001\u0010\u0006J\u000f\u0010\u0099\u0001\u001a\u00020\u0016¢\u0006\u0005\b\u0099\u0001\u0010YR\u0017\u0010\u009c\u0001\u001a\u00020\u001a8\u0002X\u0082D¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001c\u0010 \u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001c\u0010¤\u0001\u001a\u0005\u0018\u00010¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u001c\u0010¨\u0001\u001a\u0005\u0018\u00010¥\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0019\u0010ª\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010\u009b\u0001R\u0019\u0010¬\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010\u009b\u0001R\u0019\u0010®\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u009b\u0001R\u0018\u0010~\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010\u009b\u0001R\u0019\u0010±\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010\u009b\u0001R\u0019\u0010³\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010\u009b\u0001R\u0018\u0010}\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010\u009b\u0001R\u0019\u0010¶\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010\u009b\u0001R\u0019\u0010¹\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0019\u0010»\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010¸\u0001R\u0019\u0010½\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010¸\u0001R\u0018\u0010O\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¸\u0001R\u0019\u0010À\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010¸\u0001R\u001a\u0010D\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R!\u0010È\u0001\u001a\u00030Ã\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u0018\u0010Ë\u0001\u001a\u00030Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R!\u0010Ð\u0001\u001a\u00030Ì\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÍ\u0001\u0010Å\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u0018\u0010N\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R\u001a\u0010Õ\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R\u0019\u0010×\u0001\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010Ò\u0001R\u0018\u00101\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u0018\u00102\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Ù\u0001R\u0019\u0010Ü\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010Ù\u0001R\u0019\u0010Þ\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Ù\u0001R!\u0010ã\u0001\u001a\n\u0012\u0005\u0012\u00030à\u00010ß\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R!\u0010è\u0001\u001a\u00030ä\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bå\u0001\u0010Å\u0001\u001a\u0006\bæ\u0001\u0010ç\u0001R!\u0010í\u0001\u001a\u00030é\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bê\u0001\u0010Å\u0001\u001a\u0006\bë\u0001\u0010ì\u0001R!\u0010ñ\u0001\u001a\u00030î\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÔ\u0001\u0010Å\u0001\u001a\u0006\bï\u0001\u0010ð\u0001R\u0019\u0010ó\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bò\u0001\u0010¸\u0001R\u0019\u0010õ\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bô\u0001\u0010¸\u0001R\u0019\u0010ö\u0001\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010Ò\u0001R\u0019\u0010÷\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010¸\u0001R\u0019\u0010ù\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0001\u0010¸\u0001R\u0019\u0010û\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0001\u0010¸\u0001R\u001a\u0010ÿ\u0001\u001a\u00030ü\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bý\u0001\u0010þ\u0001R\u001c\u0010\u0083\u0002\u001a\u0005\u0018\u00010\u0080\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0002\u0010\u0082\u0002R\u0017\u0010\u0085\u0002\u001a\u00020+8\u0002X\u0082D¢\u0006\b\n\u0006\b\u0084\u0002\u0010Ù\u0001R#\u0010\u008a\u0002\u001a\u0005\u0018\u00010\u0086\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0087\u0002\u0010Å\u0001\u001a\u0006\b\u0088\u0002\u0010\u0089\u0002R*\u0010\u0090\u0002\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008b\u0002\u0010\u008c\u0002\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002\"\u0005\b\u008f\u0002\u0010\rR'\u0010\u0092\u0002\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u0091\u0002\u0010¸\u0001\u001a\u0005\b\u0092\u0002\u0010Y\"\u0005\b\u0093\u0002\u0010\u0019R\u001a\u0010\u0097\u0002\u001a\u00030\u0094\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0002\u0010\u0096\u0002R\u001c\u0010\u009b\u0002\u001a\u0005\u0018\u00010\u0098\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0002\u0010\u009a\u0002R\u0019\u0010\u009d\u0002\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0002\u0010¸\u0001R\u0019\u0010\u009f\u0002\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0002\u0010¸\u0001R!\u0010¤\u0002\u001a\u00030 \u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¡\u0002\u0010Å\u0001\u001a\u0006\b¢\u0002\u0010£\u0002R\u0018\u0010¦\u0002\u001a\u00030Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0002\u0010Ê\u0001R\u001b\u0010¨\u0002\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0002\u0010\u009b\u0001R \u0010«\u0002\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¸\u0001\u0010Å\u0001\u001a\u0006\b©\u0002\u0010ª\u0002R \u0010®\u0002\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¬\u0002\u0010Å\u0001\u001a\u0006\b\u00ad\u0002\u0010ª\u0002R\u0019\u0010°\u0002\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0002\u0010¸\u0001R\u0017\u0010²\u0002\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0002\u0010Ù\u0001R#\u0010·\u0002\u001a\u0005\u0018\u00010³\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b´\u0002\u0010Å\u0001\u001a\u0006\bµ\u0002\u0010¶\u0002R\u0018\u0010»\u0002\u001a\u00030¸\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0002\u0010º\u0002R\u0018\u0010¿\u0002\u001a\u00030¼\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0002\u0010¾\u0002R\u0018\u0010Ã\u0002\u001a\u00030À\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0002\u0010Â\u0002R\u0018\u0010Å\u0002\u001a\u00030¼\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0002\u0010¾\u0002R\u0019\u0010Ç\u0002\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0002\u0010\u008c\u0002¨\u0006É\u0002"}, m97100d2 = {"Lcom/transsion/postdetail/ui/fragment/LocalVideoDetailFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lvo/k;", "Lcom/transsion/player/orplayer/f;", "Lcom/transsion/baselib/report/k$a;", "<init>", "()V", "", "initAd", "initView", "Lcom/transsion/postdetail/layer/local/LocalUiType;", "uiType", "C3", "(Lcom/transsion/postdetail/layer/local/LocalUiType;)V", "y2", "initAudioListener", "Q2", "x2", "Lcom/transsion/baselib/db/download/DownloadBean;", "bean", "N2", "(Lcom/transsion/baselib/db/download/DownloadBean;)V", "", "isSameResource", "D2", "(Z)V", "", "path", "j3", "(Ljava/lang/String;)V", "q3", "Lcom/transsion/player/mediasession/MediaItem;", "i2", "()Lcom/transsion/player/mediasession/MediaItem;", "Landroid/content/Intent;", "d2", "()Landroid/content/Intent;", "pageName", "g2", "(Ljava/lang/String;)Landroid/content/Intent;", "Landroid/app/PendingIntent;", "j2", "()Landroid/app/PendingIntent;", "", "l2", "()I", "E2", "z2", "V2", "videoWidth", "videoHeight", "b3", "(IILjava/lang/String;)V", "B2", "a2", "G2", "isStart", "w3", "(Lcom/transsion/baselib/db/download/DownloadBean;Z)V", "Y2", "isFirst", "A2", "", "Lcom/transsion/moviedetailapi/bean/DubsInfo;", "f2", "()Ljava/util/List;", "F2", "B3", "downloadBean", "k3", "A3", "t2", "E3", "", NotificationCompat.CATEGORY_PROGRESS, "i3", "(J)V", "cvideoBean", "playProgress", "completed", "r3", "(Lcom/transsion/baselib/db/download/DownloadBean;JZ)V", "t3", "(Lcom/transsion/baselib/db/download/DownloadBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a3", "Y1", "O2", "w2", "T2", "()Z", "isPortrait", "V1", "p3", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "r2", "(Landroid/view/LayoutInflater;)Lvo/k;", "isAudioShowNoNetworkLayout", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewModel", "initListener", "retryLoadData", "initViewData", "isRegisteDeviceKeyMonitor", "onDisconnected", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onConnected", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onResume", "onPause", "onStop", "onDestroy", "m3", "subjectId", "resourceId", "W1", "(Ljava/lang/String;Ljava/lang/String;)V", "e3", "", "targetPercent", "v3", "(JF)V", "b2", "fromClicked", "n3", "Lfo/e;", "mediaSource", "onVideoStart", "(Lfo/e;)V", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "onHomeClick", "onRecentClick", "isBackground", "onBackgroundStatusChange", "isLock", "W2", "Z2", "S2", "a", "Ljava/lang/String;", "TAG", "Lcom/transsion/player/orplayer/g;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/player/orplayer/g;", "orPlayer", "Lcom/transsion/player/ui/ORPlayerView;", "c", "Lcom/transsion/player/ui/ORPlayerView;", "orPlayerView", "Lcom/transsion/postdetail/layer/local/c0;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/postdetail/layer/local/c0;", "localVideoDot", "e", "localPath", "f", "url", "g", "proxyUrl", "h", "i", "name", "j", "postId", CampaignEx.JSON_KEY_AD_K, "l", "pageFrom", "m", "Z", "isDownloadingPlay", "n", "isDownloadingPlayStart", "o", "isPrepare", TtmlNode.TAG_P, CampaignEx.JSON_KEY_AD_Q, "isSeries", CampaignEx.JSON_KEY_AD_R, "Lcom/transsion/baselib/db/download/DownloadBean;", "Landroid/os/Handler;", "s", "Lkotlin/Lazy;", "getHandler", "()Landroid/os/Handler;", "handler", "t", "Landroid/os/Handler;", "playingDownloadHandler", "Lcom/transsion/postdetail/layer/a;", TmcStartParams.KEY_URL_SHORT, "h2", "()Lcom/transsion/postdetail/layer/a;", "layerManager", "v", "J", "w", "F", "unplaySeekTargetPercent", "x", "duration", "y", "I", "z", "A", "parentPosition", "B", RequestParameters.POSITION, "", "Lju/a;", "C", "Ljava/util/List;", "subtitleList", "Lcom/transsion/baselib/db/video/VideoDetailPlayDao;", "D", "q2", "()Lcom/transsion/baselib/db/video/VideoDetailPlayDao;", "videoDetailPlayDao", "Lcom/transsnet/downloader/manager/g;", "E", "e2", "()Lcom/transsnet/downloader/manager/g;", "downloadManager", "Lcom/transsion/baselib/helper/ScreenRotationHelper;", "o2", "()Lcom/transsion/baselib/helper/ScreenRotationHelper;", "screenHelper", "G", "isNextPlayTipsShow", "H", "isPlayerNetTimeout", "lastReloadTime", "isReload", "K", "isMusic", "L", "isBgPlaying", "Ljava/util/concurrent/atomic/AtomicInteger;", "M", "Ljava/util/concurrent/atomic/AtomicInteger;", "playErrorCount", "Lcom/transsion/subtitle/VideoSubtitleControl;", "N", "Lcom/transsion/subtitle/VideoSubtitleControl;", "subtitleControl", "O", "sDownloadIngAndPlayTimeout", "Lfq/a;", "P", "c2", "()Lfq/a;", "audioApi", "Q", "Lcom/transsion/postdetail/layer/local/LocalUiType;", "getMUiType", "()Lcom/transsion/postdetail/layer/local/LocalUiType;", "y3", "mUiType", "R", "isPauseState", "z3", "Lcom/transsion/postdetail/util/LocalVideoAdHelper;", "S", "Lcom/transsion/postdetail/util/LocalVideoAdHelper;", "localVideoAdHelper", "Lcom/transsion/player/orplayer/PlayError;", "T", "Lcom/transsion/player/orplayer/PlayError;", "errorInfo", "U", "isNewPlayer", "V", "isFloatShow", "Lcom/transsion/postdetail/ui/dialog/o;", "W", "p2", "()Lcom/transsion/postdetail/ui/dialog/o;", "speedViewModel", "X", "playTimeoutHandler", "Y", "curTimeoutPlayPath", "m2", "()J", "playTimeout", "a0", "n2", "playTimeoutDp", "b0", "isAdShowing", "c0", "statusBarHeight", "Lcom/transsion/postdetail/util/n;", "d0", "k2", "()Lcom/transsion/postdetail/util/n;", "orientationEventListener", "com/transsion/postdetail/ui/fragment/LocalVideoDetailFragment$playerListener$1", "e0", "Lcom/transsion/postdetail/ui/fragment/LocalVideoDetailFragment$playerListener$1;", "playerListener", "Ljava/lang/Runnable;", "f0", "Ljava/lang/Runnable;", "playTimeoutRunnable", "com/transsion/postdetail/ui/fragment/LocalVideoDetailFragment$b", "g0", "Lcom/transsion/postdetail/ui/fragment/LocalVideoDetailFragment$b;", "downloadListener", "h0", "notNetRunnable", "i0", "curUiRotation", "j0", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class LocalVideoDetailFragment extends PageStatusFragment<C28158k> implements InterfaceC16633f, C14492k.a {

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private int parentPosition;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private int position;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private List subtitleList;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final Lazy videoDetailPlayDao;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final Lazy downloadManager;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final Lazy screenHelper;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private boolean isNextPlayTipsShow;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean isPlayerNetTimeout;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private long lastReloadTime;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private boolean isReload;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private boolean isMusic;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private boolean isBgPlaying;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private AtomicInteger playErrorCount;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private VideoSubtitleControl subtitleControl;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final int sDownloadIngAndPlayTimeout;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final Lazy audioApi;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private LocalUiType mUiType;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private boolean isPauseState;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private LocalVideoAdHelper localVideoAdHelper;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private PlayError errorInfo;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private boolean isNewPlayer;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private boolean isFloatShow;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final Lazy speedViewModel;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final Handler playTimeoutHandler;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private String curTimeoutPlayPath;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final Lazy playTimeout;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private final Lazy playTimeoutDp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private InterfaceC16634g orPlayer;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private boolean isAdShowing;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private ORPlayerView orPlayerView;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private final int statusBarHeight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C16791c0 localVideoDot;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private final Lazy orientationEventListener;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    private final LocalVideoDetailFragment$playerListener$1 playerListener;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    private final Runnable playTimeoutRunnable;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    private final C17015b downloadListener;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    private final Runnable notNetRunnable;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    private LocalUiType curUiRotation;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean isDownloadingPlay;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isDownloadingPlayStart;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean isPrepare;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private DownloadBean downloadBean;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final Lazy layerManager;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private long playProgress;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private float unplaySeekTargetPercent;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private long duration;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private int videoWidth;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private int videoHeight;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG = "LocalVideoDetail";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String localPath = "";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String url = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String proxyUrl = "";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String resourceId = "";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String name = "";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String postId = "";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String subjectId = "";

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String pageFrom = "";

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean completed = true;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean isSeries = true;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final Lazy handler = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocalVideoDetailFragment.m74182s2();
        }
    });

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final Handler playingDownloadHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final LocalVideoDetailFragment m74221a(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, String str8, Integer num, Integer num2, Integer num3, Integer num4) {
            LocalVideoDetailFragment localVideoDetailFragment = new LocalVideoDetailFragment();
            localVideoDetailFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("extra_local_path", str), TuplesKt.m97108a("extra_url", str2), TuplesKt.m97108a("extra_proxy_url", str7), TuplesKt.m97108a("extra_name", str3), TuplesKt.m97108a("extra_resource_id", str4), TuplesKt.m97108a("extra_subject_id", str6), TuplesKt.m97108a("extra_post_id", str5), TuplesKt.m97108a("extra_completed", bool), TuplesKt.m97108a("extra_is_series", bool2), TuplesKt.m97108a("extra_page_from", str8), TuplesKt.m97108a("extra_height", num), TuplesKt.m97108a("extra_width", num2), TuplesKt.m97108a("extra_parent_position", num3), TuplesKt.m97108a("extra_position", num4)));
            return localVideoDetailFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment$b */
    public static final class C17015b extends AbstractC26961d {
        C17015b() {
        }

        @Override // py.AbstractC26961d
        /* JADX INFO: renamed from: h */
        public void mo74222h(DownloadBean bean, int i11) {
            C16791c0 c16791c0;
            Intrinsics.m97802h(bean, "bean");
            LocalVideoDetailFragment.this.m74142h2().m73111h(LayerFlag.DOWNLOAD_CALLBACK, bean);
            if (Intrinsics.m97797c(LocalVideoDetailFragment.this.resourceId, bean.getResourceId())) {
                if (bean.getStatus() == 6 && (c16791c0 = LocalVideoDetailFragment.this.localVideoDot) != null) {
                    DownloadException exception = bean.getException();
                    c16791c0.m73420H(1, exception != null ? exception.getMessage() : null);
                }
                if (bean.getSize() != null) {
                    Long size = bean.getSize();
                    if ((size != null ? size.longValue() : 0L) <= 0) {
                        return;
                    }
                    LocalVideoDetailFragment.this.downloadBean = bean;
                    if (bean.getStatus() == 2 || bean.getStatus() == 5) {
                        LocalVideoDetailFragment.this.m74119Y2(bean);
                        LocalVideoDetailFragment.this.m74142h2().m73111h(LayerFlag.DOWNLOAD_SPEED, bean.getStatus() == 5 ? "" : C14563i.f51112a.m65679a(bean.getProgress()));
                        LocalVideoDetailFragment.this.m74198w3(bean, false);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment$c */
    public static final class C17016c implements InterfaceC28989b {
        C17016c() {
        }

        @Override // p951yo.InterfaceC28989b
        /* JADX INFO: renamed from: a */
        public void mo74223a(LocalUiType uiType) {
            Intrinsics.m97802h(uiType, "uiType");
            LocalVideoDetailFragment.this.m74219y3(uiType);
            VideoSubtitleControl videoSubtitleControl = LocalVideoDetailFragment.this.subtitleControl;
            if (videoSubtitleControl != null) {
                videoSubtitleControl.m81880O(AbstractC17450t.m74977c(uiType));
            }
            LocalVideoDetailFragment.this.m74054C3(uiType);
            LocalVideoDetailFragment.this.localVideoAdHelper.m74899z2(uiType, LocalVideoDetailFragment.this.orPlayer);
            C16791c0 c16791c0 = LocalVideoDetailFragment.this.localVideoDot;
            if (c16791c0 != null) {
                c16791c0.m73439l(uiType);
            }
        }

        @Override // p951yo.InterfaceC28989b
        /* JADX INFO: renamed from: b */
        public void mo74224b(DownloadBean downloadBean) {
            C16791c0 c16791c0 = LocalVideoDetailFragment.this.localVideoDot;
            if (c16791c0 != null) {
                c16791c0.m73443p();
            }
            C16791c0 c16791c1 = LocalVideoDetailFragment.this.localVideoDot;
            if (c16791c1 != null) {
                c16791c1.m73434g();
            }
            C16791c0 c16791c2 = LocalVideoDetailFragment.this.localVideoDot;
            if (c16791c2 != null) {
                c16791c2.m73430a();
            }
            C16791c0 c16791c3 = LocalVideoDetailFragment.this.localVideoDot;
            if (c16791c3 != null) {
                c16791c3.m73442o();
            }
        }

        @Override // p951yo.InterfaceC28989b
        /* JADX INFO: renamed from: c */
        public void mo74225c(DownloadBean downloadBean) {
            LocalVideoDetailFragment.this.isFloatShow = true;
        }

        @Override // p951yo.InterfaceC28989b
        /* JADX INFO: renamed from: d */
        public void mo74226d(DownloadBean downloadBean) {
            LocalVideoDetailFragment.this.m74050B3();
            C16791c0 c16791c0 = LocalVideoDetailFragment.this.localVideoDot;
            if (c16791c0 != null) {
                C16791c0.m73410c(c16791c0, false, 1, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment$d */
    public static final class C17017d implements InterfaceC28990c {
        C17017d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final void m74228d(LocalVideoDetailFragment localVideoDetailFragment) {
            if (localVideoDetailFragment.isDownloadingPlayStart) {
                return;
            }
            C26866a.a.m104898f(C26866a.f81698a, localVideoDetailFragment.TAG, "2------ playNextVideo, postDelayed start video", false, 4, null);
            localVideoDetailFragment.m74123a2();
        }

        @Override // p951yo.InterfaceC28990c
        /* JADX INFO: renamed from: a */
        public void mo74229a(DownloadBean bean, boolean z11) {
            Intrinsics.m97802h(bean, "bean");
            C26866a.a aVar = C26866a.f81698a;
            C26866a.a.m104908v(aVar, "LocalVideoMiddle", "onNext", false, 4, null);
            LocalVideoDetailFragment localVideoDetailFragment = LocalVideoDetailFragment.this;
            localVideoDetailFragment.m74179r3(localVideoDetailFragment.downloadBean, LocalVideoDetailFragment.this.playProgress, z11);
            LocalVideoDetailFragment.this.m74134e2().mo88671H();
            LocalVideoDetailFragment.this.m74134e2().mo88682n();
            LocalVideoDetailFragment.this.m74050B3();
            C16791c0 c16791c0 = LocalVideoDetailFragment.this.localVideoDot;
            if (c16791c0 != null) {
                C16791c0.m73410c(c16791c0, false, 1, null);
            }
            C16791c0 c16791c1 = LocalVideoDetailFragment.this.localVideoDot;
            if (c16791c1 != null) {
                c16791c1.m73434g();
            }
            C16791c0 c16791c2 = LocalVideoDetailFragment.this.localVideoDot;
            if (c16791c2 != null) {
                c16791c2.m73430a();
            }
            LocalVideoDetailFragment.this.isReload = false;
            LocalVideoDetailFragment.this.isNextPlayTipsShow = false;
            LocalVideoDetailFragment localVideoDetailFragment2 = LocalVideoDetailFragment.this;
            String name = bean.getName();
            if (name == null) {
                name = "";
            }
            localVideoDetailFragment2.name = name;
            LocalVideoDetailFragment localVideoDetailFragment3 = LocalVideoDetailFragment.this;
            String postId = bean.getPostId();
            if (postId == null) {
                postId = "";
            }
            localVideoDetailFragment3.postId = postId;
            LocalVideoDetailFragment localVideoDetailFragment4 = LocalVideoDetailFragment.this;
            String subjectId = bean.getSubjectId();
            if (subjectId == null) {
                subjectId = "";
            }
            localVideoDetailFragment4.subjectId = subjectId;
            LocalVideoDetailFragment.this.completed = bean.getStatus() == 5;
            LocalVideoDetailFragment localVideoDetailFragment5 = LocalVideoDetailFragment.this;
            localVideoDetailFragment5.isDownloadingPlay = true ^ localVideoDetailFragment5.completed;
            LocalVideoDetailFragment localVideoDetailFragment6 = LocalVideoDetailFragment.this;
            String resourceId = bean.getResourceId();
            if (resourceId == null) {
                resourceId = "";
            }
            localVideoDetailFragment6.resourceId = resourceId;
            LocalVideoDetailFragment.this.url = bean.getUrl();
            LocalVideoDetailFragment localVideoDetailFragment7 = LocalVideoDetailFragment.this;
            String path = bean.getPath();
            localVideoDetailFragment7.localPath = path != null ? path : "";
            if (LocalVideoDetailFragment.this.isDownloadingPlay) {
                LocalVideoDetailFragment.this.m74134e2().mo88679k(bean);
                LocalVideoDetailFragment localVideoDetailFragment8 = LocalVideoDetailFragment.this;
                localVideoDetailFragment8.proxyUrl = localVideoDetailFragment8.m74134e2().mo88676h(bean);
            }
            LocalVideoDetailFragment.this.downloadBean = bean;
            LocalVideoDetailFragment.this.m74061E2();
            LocalVideoDetailFragment.this.subtitleList.clear();
            VideoSubtitleControl videoSubtitleControl = LocalVideoDetailFragment.this.subtitleControl;
            if (videoSubtitleControl != null) {
                videoSubtitleControl.m81885X();
            }
            LocalVideoDetailFragment.this.m74045A2(false);
            C26866a.a.m104898f(aVar, LocalVideoDetailFragment.this.TAG, "playNextVideo, episode = :" + bean.getEpse() + "， isDownloadingPlay = " + LocalVideoDetailFragment.this.isDownloadingPlay, false, 4, null);
            LocalVideoDetailFragment.this.playProgress = 0L;
            LocalVideoDetailFragment.this.isPrepare = false;
            LocalVideoDetailFragment.this.unplaySeekTargetPercent = 0.0f;
        }

        @Override // p951yo.InterfaceC28990c
        /* JADX INFO: renamed from: b */
        public void mo74230b(DownloadBean bean) {
            Intrinsics.m97802h(bean, "bean");
            LocalVideoDetailFragment.this.isDownloadingPlayStart = false;
            Handler handler = LocalVideoDetailFragment.this.playingDownloadHandler;
            final LocalVideoDetailFragment localVideoDetailFragment = LocalVideoDetailFragment.this;
            handler.postDelayed(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.p0
                @Override // java.lang.Runnable
                public final void run() {
                    LocalVideoDetailFragment.C17017d.m74228d(localVideoDetailFragment);
                }
            }, 5000L);
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment$e */
    public static final class C17018e implements InterfaceC25909a {
        C17018e() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment$f */
    public static final class C17019f extends AbstractC0256u {
        C17019f() {
            super(true);
        }

        @Override // androidx.activity.AbstractC0256u
        public void handleOnBackPressed() {
            C26866a.a.m104898f(C26866a.f81698a, LocalVideoDetailFragment.this.TAG, "----------handleOnBackPressed", false, 4, null);
            LocalVideoDetailFragment.this.m74142h2().m73111h(LayerFlag.BACK_PRESSED, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment$g */
    static final class C17020g implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f57172a;

        C17020g(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f57172a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f57172a;
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
            this.f57172a.invoke(obj);
        }
    }

    public LocalVideoDetailFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.layerManager = LazyKt.m97096a(lazyThreadSafetyMode, new Function0() { // from class: com.transsion.postdetail.ui.fragment.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalVideoDetailFragment.m74109U2();
            }
        });
        this.parentPosition = -1;
        this.position = -1;
        this.subtitleList = new ArrayList();
        this.videoDetailPlayDao = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalVideoDetailFragment.m74058D3();
            }
        });
        this.downloadManager = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalVideoDetailFragment.m74115X1();
            }
        });
        this.screenHelper = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.k0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalVideoDetailFragment.m74191u3(this.f57381a);
            }
        });
        this.playErrorCount = new AtomicInteger(0);
        this.sDownloadIngAndPlayTimeout = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;
        this.audioApi = LazyKt.m97096a(lazyThreadSafetyMode, new Function0() { // from class: com.transsion.postdetail.ui.fragment.l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalVideoDetailFragment.m74108U1();
            }
        });
        this.localVideoAdHelper = new LocalVideoAdHelper();
        this.isNewPlayer = true;
        this.speedViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(C17006o.class), new Function0<C3231x0>() { // from class: com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment$special$$inlined$activityViewModels$default$2
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
        this.playTimeoutHandler = new Handler(Looper.getMainLooper());
        this.playTimeout = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(LocalVideoDetailFragment.m74143h3());
            }
        });
        this.playTimeoutDp = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(LocalVideoDetailFragment.m74137f3());
            }
        });
        this.statusBarHeight = AbstractC5781d.m27351c();
        this.orientationEventListener = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalVideoDetailFragment.m74129c3(this.f57409a);
            }
        });
        this.playerListener = new LocalVideoDetailFragment$playerListener$1(this);
        this.playTimeoutRunnable = new Runnable() { // from class: com.transsion.postdetail.ui.fragment.q
            @Override // java.lang.Runnable
            public final void run() {
                LocalVideoDetailFragment.m74140g3(this.f57437a);
            }
        };
        this.downloadListener = new C17015b();
        this.notNetRunnable = new Runnable() { // from class: com.transsion.postdetail.ui.fragment.a0
            @Override // java.lang.Runnable
            public final void run() {
                LocalVideoDetailFragment.m74116X2(this.f57283a);
            }
        };
        this.curUiRotation = LocalUiType.MIDDLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public final void m74045A2(boolean isFirst) {
        String name;
        DownloadBean downloadBean;
        DownloadBean downloadBean2;
        DownloadBean downloadBean3;
        DownloadBean downloadBean4;
        m74134e2().mo88675g(this.downloadListener);
        DownloadBean downloadBeanM88589q = DownloadEsHelper.f67591m.m88598a().m88589q(this.resourceId);
        this.downloadBean = downloadBeanM88589q;
        this.isSeries = downloadBeanM88589q != null ? downloadBeanM88589q.isSeries() : this.isSeries;
        String subjectId = this.subjectId;
        String str = "";
        if (subjectId.length() == 0 && ((downloadBean4 = this.downloadBean) == null || (subjectId = downloadBean4.getSubjectId()) == null)) {
            subjectId = "";
        }
        this.subjectId = subjectId;
        String postId = this.postId;
        if (postId.length() == 0 && ((downloadBean3 = this.downloadBean) == null || (postId = downloadBean3.getPostId()) == null)) {
            postId = "";
        }
        this.postId = postId;
        if (Intrinsics.m97797c(this.pageFrom, PushMsgSource.SOURCE_PUSH) && ((downloadBean = this.downloadBean) == null || ((downloadBean != null && downloadBean.getStatus() == 7) || ((downloadBean2 = this.downloadBean) != null && downloadBean2.getStatus() == 0)))) {
            C28951b.f88586a.m111454d(R$string.video_has_delete_tip);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
        m74142h2().m73111h(LayerFlag.UPDATE_DOWNLOAD_DATA, this.downloadBean, this.pageFrom, Boolean.valueOf(isFirst));
        VideoSubtitleControl videoSubtitleControl = this.subtitleControl;
        if (videoSubtitleControl != null) {
            videoSubtitleControl.m81891h0(this.downloadBean);
        }
        C16791c0 c16791c0 = this.localVideoDot;
        if (c16791c0 != null) {
            c16791c0.m73413A(this.downloadBean, this.pageFrom);
        }
        if (this.isDownloadingPlay) {
            DownloadBean downloadBean5 = this.downloadBean;
            if ((downloadBean5 != null ? downloadBean5.getProgress() : 0L) > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED && !this.isDownloadingPlayStart) {
                C26866a.a.m104898f(C26866a.f81698a, this.TAG, "3--------initDownloadBean, start video", false, 4, null);
                m74123a2();
            }
        }
        m74046A3();
        if (isFirst) {
            C16780a c16780aM74142h2 = m74142h2();
            LayerFlag layerFlag = LayerFlag.REQUEST_FORYOU;
            DownloadBean downloadBean6 = this.downloadBean;
            Boolean boolValueOf = Boolean.valueOf(downloadBean6 == null || !downloadBean6.isInnerRes() || this.subjectId.length() == 0);
            DownloadBean downloadBean7 = this.downloadBean;
            if (downloadBean7 == null || !downloadBean7.isInnerRes() || this.subjectId.length() <= 0) {
                DownloadBean downloadBean8 = this.downloadBean;
                if (downloadBean8 != null && (name = downloadBean8.getName()) != null) {
                    str = name;
                }
            } else {
                str = this.subjectId;
            }
            c16780aM74142h2.m73111h(layerFlag, boolValueOf, str);
            if (this.isSeries) {
                m74142h2().m73111h(LayerFlag.SERIES_INIT, this.subjectId, this.resourceId);
                m74065F2();
            }
        }
        if (this.isDownloadingPlay && !C27287m.f83003a.m106330e()) {
            this.playingDownloadHandler.postDelayed(this.notNetRunnable, 6000L);
        }
        VideoSubtitleControl videoSubtitleControl2 = this.subtitleControl;
        if (videoSubtitleControl2 != null) {
            videoSubtitleControl2.m81894p0(m74136f2());
        }
        this.localVideoAdHelper.m74893D2(this.downloadBean);
    }

    /* JADX INFO: renamed from: A3 */
    private final void m74046A3() {
        DownloadBean downloadBean = this.downloadBean;
        if (downloadBean == null || !downloadBean.isVideo()) {
            return;
        }
        DownloadBean downloadBean2 = this.downloadBean;
        if (downloadBean2 == null || !downloadBean2.isMusic()) {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99267a()), null, null, new LocalVideoDetailFragment$setSubtitle$1(this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: B2 */
    private final void m74049B2() {
        if (this.isDownloadingPlay) {
            this.isReload = false;
            this.isDownloadingPlayStart = false;
            m74134e2().mo88666C();
            this.playingDownloadHandler.postDelayed(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.v
                @Override // java.lang.Runnable
                public final void run() {
                    LocalVideoDetailFragment.m74053C2(this.f57473a);
                }
            }, 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B3 */
    public final void m74050B3() {
        Map mapM73433e;
        Map mapM73433e2;
        VideoSubtitleControl videoSubtitleControl = this.subtitleControl;
        if (videoSubtitleControl != null) {
            C16791c0 c16791c0 = this.localVideoDot;
            if (c16791c0 != null && (mapM73433e2 = c16791c0.m73433e()) != null) {
                mapM73433e2.clear();
            }
            C16791c0 c16791c1 = this.localVideoDot;
            if (c16791c1 == null || (mapM73433e = c16791c1.m73433e()) == null) {
                return;
            }
            mapM73433e.putAll(videoSubtitleControl.m81876F());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C2 */
    public static final void m74053C2(LocalVideoDetailFragment localVideoDetailFragment) {
        if (localVideoDetailFragment.isDownloadingPlayStart) {
            return;
        }
        localVideoDetailFragment.m74123a2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C3 */
    public final void m74054C3(LocalUiType uiType) {
        ImageView imageView;
        C28158k mViewBinding = getMViewBinding();
        ViewGroup.LayoutParams layoutParams = (mViewBinding == null || (imageView = mViewBinding.f86508o) == null) ? null : imageView.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.C2308b) layoutParams)).topMargin = uiType == LocalUiType.LAND ? 0 : this.statusBarHeight;
    }

    /* JADX INFO: renamed from: D2 */
    private final void m74057D2(boolean isSameResource) {
        InterfaceC16634g interfaceC16634g;
        C23403e c23403eCurrentMediaSource;
        C16791c0 c16791c0;
        DownloadBean downloadBean = this.downloadBean;
        boolean zIsMusic = downloadBean != null ? downloadBean.isMusic() : false;
        this.isMusic = zIsMusic;
        if (zIsMusic && (c16791c0 = this.localVideoDot) != null) {
            c16791c0.m73417E("music_play");
        }
        if (!this.isMusic || !isSameResource) {
            this.isBgPlaying = false;
            C23622d c23622d = new C23622d(RenderType.SURFACE_VIEW, false, 1000, 0, 0, 0, 3, 0, 0L, 0, this.sDownloadIngAndPlayTimeout, false, false, false, false, false, null, 129976, null);
            InterfaceC16634g interfaceC16634g2 = this.orPlayer;
            if (interfaceC16634g2 != null) {
                interfaceC16634g2.setPlayerConfig(c23622d);
                return;
            }
            return;
        }
        InterfaceC16634g interfaceC16634g3 = this.orPlayer;
        if (interfaceC16634g3 != null && (c23403eCurrentMediaSource = interfaceC16634g3.currentMediaSource()) != null) {
            MusicFloatManager.C14535a c14535a = MusicFloatManager.f51050h;
            c14535a.m65598b().m65583C(c23403eCurrentMediaSource.m92929e());
            c14535a.m65598b().m65582B(c23403eCurrentMediaSource.m92933i());
        }
        this.isBgPlaying = true;
        InterfaceC16634g interfaceC16634g4 = this.orPlayer;
        if (interfaceC16634g4 == null || interfaceC16634g4.isPlaying() || (interfaceC16634g = this.orPlayer) == null) {
            return;
        }
        interfaceC16634g.play();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D3 */
    public static final VideoDetailPlayDao m74058D3() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64865B1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E2 */
    public final void m74061E2() {
        HashMap mapM96844g;
        HashMap map = new HashMap();
        map.put("resource_id", this.resourceId);
        map.put("subject_id", this.subjectId);
        map.put("post_id", this.postId);
        map.put("url", this.url);
        DownloadBean downloadBean = this.downloadBean;
        map.put("ops", downloadBean != null ? downloadBean.getOps() : null);
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig == null || (mapM96844g = logViewConfig.m96844g()) == null) {
            return;
        }
        mapM96844g.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E3 */
    public final void m74062E3() {
        DownloadBean downloadBean;
        C22094h.f68115a.m89452c("5");
        if (!this.isDownloadingPlay || (downloadBean = this.downloadBean) == null) {
            return;
        }
        DownloadUtil downloadUtil = DownloadUtil.f68079a;
        Intrinsics.m97799e(downloadBean);
        downloadUtil.m89355B(downloadBean);
        DownloadBean downloadBean2 = this.downloadBean;
        Intrinsics.m97799e(downloadBean2);
        m74198w3(downloadBean2, true);
    }

    /* JADX INFO: renamed from: F2 */
    private final void m74065F2() {
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "---------initSeries", false, 4, null);
        m74142h2().m73111h(LayerFlag.SERIES_EVENT, new C17017d());
    }

    /* JADX INFO: renamed from: G2 */
    private final void m74068G2() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        VideoSubtitleControl videoSubtitleControl = new VideoSubtitleControl(fragmentActivityRequireActivity, "local_video_detail", C14453d.f50863a.m65162d(), m74136f2(), new Function1() { // from class: com.transsion.postdetail.ui.fragment.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocalVideoDetailFragment.m74071H2(this.f57479a, ((Boolean) obj).booleanValue());
            }
        }, new Function2() { // from class: com.transsion.postdetail.ui.fragment.x
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LocalVideoDetailFragment.m74074I2(this.f57486a, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        }, new Function3() { // from class: com.transsion.postdetail.ui.fragment.y
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return LocalVideoDetailFragment.m74077J2(this.f57496a, (String) obj, (String) obj2, ((Integer) obj3).intValue());
            }
        }, new Function1() { // from class: com.transsion.postdetail.ui.fragment.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocalVideoDetailFragment.m74080K2((DubsInfo) obj);
            }
        }, new Function1() { // from class: com.transsion.postdetail.ui.fragment.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocalVideoDetailFragment.m74083L2((List) obj);
            }
        }, null, new Function2() { // from class: com.transsion.postdetail.ui.fragment.c0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LocalVideoDetailFragment.m74086M2(this.f57299a, (String) obj, (String) obj2);
            }
        }, 512, null);
        m74142h2().m73111h(LayerFlag.SUBTITLE_CONTROL, videoSubtitleControl);
        this.subtitleControl = videoSubtitleControl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public static final Unit m74071H2(LocalVideoDetailFragment localVideoDetailFragment, boolean z11) {
        localVideoDetailFragment.m74142h2().m73110g(z11 ? LayerFlag.LOADING_BEGIN : LayerFlag.LOADING_END, new Object[0]);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public static final Unit m74074I2(LocalVideoDetailFragment localVideoDetailFragment, boolean z11, boolean z12) {
        if (z11) {
            localVideoDetailFragment.m74142h2().m73111h(LayerFlag.BOTTOM_CONTROL, Boolean.TRUE, Boolean.valueOf(z12));
        } else {
            localVideoDetailFragment.m74142h2().m73111h(LayerFlag.BOTTOM_CONTROL, Boolean.FALSE, Boolean.TRUE);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J2 */
    public static final Unit m74077J2(LocalVideoDetailFragment localVideoDetailFragment, String lanName, String lan, int i11) {
        Intrinsics.m97802h(lanName, "lanName");
        Intrinsics.m97802h(lan, "lan");
        C16791c0 c16791c0 = localVideoDetailFragment.localVideoDot;
        if (c16791c0 != null) {
            c16791c0.m73446s(lanName, lan, i11);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public static final Unit m74080K2(DubsInfo it) {
        Intrinsics.m97802h(it, "it");
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public static final Unit m74083L2(List it) {
        Intrinsics.m97802h(it, "it");
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public static final Unit m74086M2(LocalVideoDetailFragment localVideoDetailFragment, String str, String str2) {
        C16791c0 c16791c0 = localVideoDetailFragment.localVideoDot;
        if (c16791c0 == null) {
            return null;
        }
        c16791c0.m73447t(str, str2);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: N2 */
    private final void m74089N2(DownloadBean bean) {
        if (bean != null) {
            String path = this.localPath;
            if (path.length() == 0 && (path = bean.getPath()) == null) {
                path = "";
            }
            this.localPath = path;
            String url = this.url;
            if (url.length() == 0) {
                url = bean.getUrl();
            }
            this.url = url;
            String subjectId = this.subjectId;
            if (subjectId.length() == 0 && (subjectId = bean.getSubjectId()) == null) {
                subjectId = "";
            }
            this.subjectId = subjectId;
            String name = this.name;
            if (name.length() == 0 && (name = bean.getName()) == null) {
                name = "";
            }
            this.name = name;
            String str = this.postId;
            if (str.length() == 0) {
                String postId = bean.getPostId();
                str = postId != null ? postId : "";
            }
            this.postId = str;
            this.completed = bean.getStatus() == 5 || !bean.isInnerRes();
            this.isSeries = bean.isSeries();
            this.videoHeight = bean.getVideoHeight();
            this.videoWidth = bean.getVideoWidth();
            boolean z11 = this.completed;
            this.isDownloadingPlay = !z11;
            if (!z11 && this.proxyUrl.length() == 0 && !this.isBgPlaying) {
                this.proxyUrl = m74134e2().mo88676h(bean);
            }
        }
        m74112V2(this.localPath);
        m74142h2().m73111h(LayerFlag.INIT_DATA, this.resourceId, this.subjectId, this.postId, Boolean.valueOf(this.isDownloadingPlay), Boolean.valueOf(this.isSeries));
        m74142h2().m73111h(LayerFlag.LOCAL_UI_CHANGED, LocalUiType.MIDDLE);
        m74061E2();
        this.isNextPlayTipsShow = false;
        VideoSubtitleControl videoSubtitleControl = this.subtitleControl;
        if (videoSubtitleControl != null) {
            videoSubtitleControl.m81890g0(new C17018e());
        }
    }

    /* JADX INFO: renamed from: O2 */
    private final void m74092O2() {
        ConstraintLayout constraintLayoutM109328b;
        C28158k mViewBinding = getMViewBinding();
        if (mViewBinding == null || (constraintLayoutM109328b = mViewBinding.getRoot()) == null) {
            return;
        }
        constraintLayoutM109328b.post(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.r
            @Override // java.lang.Runnable
            public final void run() {
                LocalVideoDetailFragment.m74095P2(this.f57444a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P2 */
    public static final void m74095P2(LocalVideoDetailFragment localVideoDetailFragment) {
        FragmentActivity activity = localVideoDetailFragment.getActivity();
        if (activity != null) {
            InterfaceC27135b interfaceC27135bM105597c = InterfaceC27135b.f82245a.m105597c();
            String str = localVideoDetailFragment.subjectId;
            DownloadBean downloadBean = localVideoDetailFragment.downloadBean;
            interfaceC27135bM105597c.mo86624e(activity, str, null, "local_video_detail", downloadBean != null ? downloadBean.getOps() : null);
        }
    }

    /* JADX INFO: renamed from: Q2 */
    private final void m74098Q2() {
        String url;
        boolean z11;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        this.orPlayerView = new ORPlayerView(fragmentActivityRequireActivity, RenderType.SURFACE_VIEW);
        C22094h.f68115a.m89453d("1");
        String str = this.isDownloadingPlay ? this.proxyUrl : this.localPath;
        C21106a0 c21106a0 = C21106a0.f66016a;
        LocalFloatManager localFloatManager = LocalFloatManager.f57803b;
        DownloadBean downloadBean = this.downloadBean;
        if (downloadBean == null || (url = downloadBean.getResourceId()) == null) {
            DownloadBean downloadBean2 = this.downloadBean;
            url = downloadBean2 != null ? downloadBean2.getUrl() : ImagesContract.LOCAL;
        }
        InterfaceC16634g interfaceC16634gM86578b = c21106a0.m86578b(localFloatManager.m74879h(url));
        String strValueOf = String.valueOf(str.hashCode());
        C26053g0 c26053g0 = C26053g0.f79567a;
        InterfaceC16634g interfaceC16634gM102141f = c26053g0.m102141f(strValueOf);
        boolean z12 = interfaceC16634gM102141f == null && interfaceC16634gM86578b == null;
        this.isNewPlayer = z12;
        C26866a.a aVar = C26866a.f81698a;
        aVar.m104912c(this.TAG, "initVideoPlayer, subjectId:" + this.subjectId + ", isNewPlayer:" + z12 + ", id:" + strValueOf, true);
        if (interfaceC16634gM86578b != null) {
            m74142h2().m73111h(LayerFlag.PLAYER_FOREGROUND, Boolean.FALSE);
            C26866a.a.m104898f(aVar, this.TAG, "initVideoPlayer, float player复用", false, 4, null);
            z11 = true;
        } else if (interfaceC16634gM102141f != null) {
            m74142h2().m73111h(LayerFlag.PLAYER_FOREGROUND, Boolean.FALSE);
            C26866a.a.m104898f(aVar, this.TAG, "initVideoPlayer, music player复用", false, 4, null);
            z11 = true;
            interfaceC16634gM86578b = interfaceC16634gM102141f;
        } else {
            interfaceC16634gM86578b = c26053g0.m102149s();
            z11 = false;
        }
        this.orPlayer = interfaceC16634gM86578b;
        InterfaceC27135b.b.m105599a(InterfaceC27135b.f82245a.m105597c(), false, 1, null);
        m74057D2(z11);
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            ORPlayerView oRPlayerView = this.orPlayerView;
            interfaceC16634g.setSurfaceView(oRPlayerView != null ? oRPlayerView.getSurface() : null);
            interfaceC16634g.setLooping(false);
            interfaceC16634g.addPlayerListener(this.playerListener);
            C14453d c14453d = C14453d.f50863a;
            interfaceC16634g.setSpeed(c14453d.m65162d());
            interfaceC16634g.setScaleMode(c14453d.m65161c());
            C16791c0 c16791c0 = this.localVideoDot;
            if (c16791c0 != null) {
                c16791c0.m73421I(interfaceC16634g);
            }
        }
        m74142h2().m73109e(LayerFlag.SET_PLAYER, this.orPlayer, this.orPlayerView);
        m74171p2().m73969b().m14851j(this, new C17020g(new Function1() { // from class: com.transsion.postdetail.ui.fragment.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocalVideoDetailFragment.m74101R2(this.f57465a, (Float) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public static final Unit m74101R2(LocalVideoDetailFragment localVideoDetailFragment, Float f11) {
        InterfaceC16634g interfaceC16634g = localVideoDetailFragment.orPlayer;
        if (interfaceC16634g != null) {
            Intrinsics.m97799e(f11);
            interfaceC16634g.setSpeed(f11.floatValue());
        }
        localVideoDetailFragment.m74142h2().m73111h(LayerFlag.UPDATE_SPEED, f11);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public final boolean m74106T2() {
        return InterfaceC27138e.f82251a.m105606b().mo86576k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public static final InterfaceC23410a m74108U1() {
        return (InterfaceC23410a) TheRouter.m61774d(InterfaceC23410a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public static final C16780a m74109U2() {
        return new C16780a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public final void m74111V1(boolean isPortrait) {
        LocalUiType localUiType = this.curUiRotation;
        boolean zIsResumed = isResumed();
        LocalUiType localUiType2 = this.mUiType;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("竖屏: ");
        sb2.append(isPortrait);
        sb2.append("，curUiRation: ");
        sb2.append(localUiType);
        sb2.append(", isResumed");
        sb2.append(zIsResumed);
        sb2.append(", ui:");
        sb2.append(localUiType2);
        C16791c0 c16791c0 = this.localVideoDot;
        if (c16791c0 == null || !c16791c0.m73432d()) {
            if (isPortrait) {
                m74172p3();
            }
            LocalUiType localUiType3 = isPortrait ? LocalUiType.MIDDLE : LocalUiType.LAND;
            if (!isResumed() || this.curUiRotation == localUiType3 || localUiType3 == this.mUiType) {
                this.curUiRotation = localUiType3;
                return;
            }
            this.curUiRotation = localUiType3;
            C24662i.f75350a.m96885t("auto_screen", MapsKt.m97551f(new Pair("orientation", localUiType3 == LocalUiType.LAND ? "land" : "port")));
            m74142h2().m73111h(LayerFlag.SCREEN_ORIENTATION_CHANGED, localUiType3);
        }
    }

    /* JADX INFO: renamed from: V2 */
    private final void m74112V2(String path) {
        int i11;
        int i12 = this.videoHeight;
        if (i12 <= 0 || (i11 = this.videoWidth) <= 0) {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new LocalVideoDetailFragment$localVideoPrepare$1(path, this, null), 3, null);
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "play path = " + path, false, 4, null);
            return;
        }
        C26866a.a.m104908v(C26866a.f81698a, this.TAG, "localVideoPrepare, videoWidth  = " + i11 + ",videoHeight = " + i12, false, 4, null);
        m74126b3(this.videoWidth, this.videoHeight, path);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public static final InterfaceC21842g m74115X1() {
        return C21851p.f67672a.m88759a(Utils.m27275a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X2 */
    public static final void m74116X2(LocalVideoDetailFragment localVideoDetailFragment) {
        C26866a.a.m104898f(C26866a.f81698a, localVideoDetailFragment.TAG, "---------no net， show error", false, 4, null);
        localVideoDetailFragment.m74142h2().m73111h(LayerFlag.NETWORK_CHANGE, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public final void m74118Y1() {
        if (C27287m.f83003a.m106330e()) {
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "---------has net， delay show toast", false, 4, null);
            getHandler().postDelayed(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.f0
                @Override // java.lang.Runnable
                public final void run() {
                    LocalVideoDetailFragment.m74121Z1(this.f57326a);
                }
            }, 10000L);
        } else {
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "---------no net， show error", false, 4, null);
            m74142h2().m73111h(LayerFlag.NETWORK_CHANGE, Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public final void m74119Y2(DownloadBean bean) {
        this.lastReloadTime = SystemClock.elapsedRealtime();
        if (!this.isDownloadingPlayStart && bean.getProgress() >= C26238b.f79970a.m102719d()) {
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "1------ onDownloading, start video", false, 4, null);
            m74123a2();
            return;
        }
        if (bean.getProgress() < 10485760 || this.isPrepare || SystemClock.elapsedRealtime() - this.lastReloadTime <= this.sDownloadIngAndPlayTimeout) {
            return;
        }
        C26866a.f81698a.m104921x("long_video_play", "video error，reload~~ from onDownloading progress=" + bean.getProgress() + ",isPrepare=" + this.isPrepare + ",waitTime=" + (System.currentTimeMillis() - this.lastReloadTime), true);
        this.lastReloadTime = SystemClock.elapsedRealtime();
        m74168o3(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public static final void m74121Z1(LocalVideoDetailFragment localVideoDetailFragment) {
        localVideoDetailFragment.m74142h2().m73111h(LayerFlag.SHOW_TOAST, Utils.m27275a().getString(R$string.downloading_play_wait_msg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public final void m74123a2() {
        this.isPrepare = false;
        this.isDownloadingPlayStart = true;
        C16791c0 c16791c0 = this.localVideoDot;
        if (c16791c0 != null) {
            c16791c0.m73430a();
        }
        C22094h.f68115a.m89451b("2");
        m74150j3(this.proxyUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public final void m74124a3() {
        m74142h2().m73110g(LayerFlag.COMPLETION, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b3 */
    public final void m74126b3(int videoWidth, int videoHeight, String path) {
        m74142h2().m73111h(LayerFlag.ADD_SURFACE, Integer.valueOf(videoWidth), Integer.valueOf(videoHeight));
        if (!this.isDownloadingPlay) {
            this.isPrepare = false;
            C22094h.f68115a.m89451b("2");
            C16791c0 c16791c0 = this.localVideoDot;
            if (c16791c0 != null) {
                c16791c0.m73430a();
            }
            m74150j3(path);
            return;
        }
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null && !interfaceC16634g.isPlaying()) {
            m74142h2().m73110g(LayerFlag.LOADING_BEGIN, new Object[0]);
        }
        DownloadBean downloadBean = this.downloadBean;
        if ((downloadBean != null ? downloadBean.getProgress() : 0L) >= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED || C27287m.f83003a.m106330e()) {
            return;
        }
        m74142h2().m73111h(LayerFlag.NETWORK_CHANGE, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public final InterfaceC23410a m74128c2() {
        return (InterfaceC23410a) this.audioApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c3 */
    public static final C17444n m74129c3(final LocalVideoDetailFragment localVideoDetailFragment) {
        FragmentActivity activity = localVideoDetailFragment.getActivity();
        if (activity != null) {
            return new C17444n(activity, new Function1() { // from class: com.transsion.postdetail.ui.fragment.e0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LocalVideoDetailFragment.m74132d3(this.f57319a, ((Integer) obj).intValue());
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: d2 */
    private final Intent m74131d2() {
        Intent intent = new Intent();
        intent.putExtra("path", "/video/detail");
        intent.putExtra("id", this.subjectId);
        DownloadBean downloadBean = this.downloadBean;
        intent.putExtra("extra_resource_id", downloadBean != null ? downloadBean.getResourceId() : null);
        DownloadBean downloadBean2 = this.downloadBean;
        intent.putExtra("extra_local_path", downloadBean2 != null ? downloadBean2.getPath() : null);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d3 */
    public static final Unit m74132d3(LocalVideoDetailFragment localVideoDetailFragment, int i11) {
        if (i11 == 1 || i11 == 3) {
            localVideoDetailFragment.m74142h2().m73111h(LayerFlag.UPDATE_ROTATION, Integer.valueOf(i11));
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public final InterfaceC21842g m74134e2() {
        return (InterfaceC21842g) this.downloadManager.getValue();
    }

    /* JADX INFO: renamed from: f2 */
    private final List m74136f2() {
        DownloadBean downloadBean = this.downloadBean;
        String currentDubLanName = downloadBean != null ? downloadBean.getCurrentDubLanName() : null;
        if (currentDubLanName == null || currentDubLanName.length() == 0) {
            return CollectionsKt.m97506l();
        }
        String str = this.subjectId;
        DownloadBean downloadBean2 = this.downloadBean;
        String currentDubLanName2 = downloadBean2 != null ? downloadBean2.getCurrentDubLanName() : null;
        DownloadBean downloadBean3 = this.downloadBean;
        DubsInfo dubsInfo = new DubsInfo(str, currentDubLanName2, downloadBean3 != null ? downloadBean3.getCurrentDubLanCode() : null, false, 8, null);
        dubsInfo.setSelected(true);
        return CollectionsKt.m97499e(dubsInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f3 */
    public static final long m74137f3() {
        Long lX;
        ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("sb_lv_play_timeout_dp", true);
        String value = configBeanM110360c != null ? configBeanM110360c.getValue() : null;
        if (value == null || value.length() == 0 || (lX = StringsKt.m98218x(value)) == null) {
            return 12000L;
        }
        return lX.longValue();
    }

    /* JADX INFO: renamed from: g2 */
    private final Intent m74139g2(String pageName) {
        InterfaceC27316b interfaceC27316b = (InterfaceC27316b) TheRouter.m61774d(InterfaceC27316b.class, new Object[0]);
        DownloadBean downloadBean = this.downloadBean;
        boolean zIsCompleted = downloadBean != null ? downloadBean.isCompleted() : false;
        StringBuilder sb2 = new StringBuilder("oneroom://com.community.oneroom?type=");
        sb2.append("/video/detail");
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("extra_resource_id");
        sb2.append(UrlUtils.EQUAL_MARK);
        DownloadBean downloadBean2 = this.downloadBean;
        sb2.append(downloadBean2 != null ? downloadBean2.getResourceId() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("extra_local_path");
        sb2.append(UrlUtils.EQUAL_MARK);
        DownloadBean downloadBean3 = this.downloadBean;
        sb2.append(downloadBean3 != null ? downloadBean3.getPath() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("extra_url");
        sb2.append(UrlUtils.EQUAL_MARK);
        DownloadBean downloadBean4 = this.downloadBean;
        sb2.append(downloadBean4 != null ? downloadBean4.getUrl() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("extra_page_from");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(pageName);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("extra_completed");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(zIsCompleted);
        if (interfaceC27316b == null) {
            return null;
        }
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        Intent intentMo94643a = interfaceC27316b.mo94643a(applicationM27275a);
        if (intentMo94643a == null) {
            return null;
        }
        intentMo94643a.addFlags(603979776);
        intentMo94643a.setData(Uri.parse(sb2.toString()));
        return intentMo94643a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g3 */
    public static final void m74140g3(LocalVideoDetailFragment localVideoDetailFragment) {
        String str = localVideoDetailFragment.curTimeoutPlayPath;
        if (str != null) {
            InterfaceC16634g interfaceC16634g = localVideoDetailFragment.orPlayer;
            if (interfaceC16634g != null) {
                interfaceC16634g.reset();
            }
            InterfaceC16634g interfaceC16634g2 = localVideoDetailFragment.orPlayer;
            if (interfaceC16634g2 != null) {
                interfaceC16634g2.stop();
            }
            C16791c0 c16791c0 = localVideoDetailFragment.localVideoDot;
            if (c16791c0 != null) {
                c16791c0.m73425M(true);
            }
            String strValueOf = String.valueOf(str.hashCode());
            C26866a.f81698a.m104912c("long_video_play", "playerTimeout,change 2 software decoder, id:" + strValueOf + ", path = " + str, true);
            InterfaceC16634g interfaceC16634g3 = localVideoDetailFragment.orPlayer;
            if (interfaceC16634g3 != null) {
                interfaceC16634g3.enableHardwareDecoder(false);
            }
            InterfaceC16634g interfaceC16634g4 = localVideoDetailFragment.orPlayer;
            if (interfaceC16634g4 != null) {
                C23403e c23403e = new C23403e(strValueOf, str, 0, null, localVideoDetailFragment.m74145i2(), 12, null);
                MusicFloatManager.C14535a c14535a = MusicFloatManager.f51050h;
                c14535a.m65598b().m65583C(c23403e.m92929e());
                c14535a.m65598b().m65582B(c23403e.m92933i());
                interfaceC16634g4.setDataSource(c23403e);
            }
            InterfaceC16634g interfaceC16634g5 = localVideoDetailFragment.orPlayer;
            if (interfaceC16634g5 != null) {
                interfaceC16634g5.prepare();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler getHandler() {
        return (Handler) this.handler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public final C16780a m74142h2() {
        return (C16780a) this.layerManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h3 */
    public static final long m74143h3() {
        Long lX;
        ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("sb_lv_play_timeout", true);
        String value = configBeanM110360c != null ? configBeanM110360c.getValue() : null;
        if (value == null || value.length() == 0 || (lX = StringsKt.m98218x(value)) == null) {
            return 8000L;
        }
        return lX.longValue();
    }

    /* JADX INFO: renamed from: i2 */
    private final MediaItem m74145i2() {
        DownloadBean downloadBean = this.downloadBean;
        String totalTitleName = downloadBean != null ? downloadBean.getTotalTitleName() : null;
        String str = this.subjectId;
        DownloadBean downloadBean2 = this.downloadBean;
        String cover = downloadBean2 != null ? downloadBean2.getCover() : null;
        String strM65591t = MusicFloatManager.f51050h.m65598b().m65591t(this.subjectId);
        PendingIntent pendingIntentM74149j2 = m74149j2();
        Intent intentM74131d2 = m74131d2();
        DownloadBean downloadBean3 = this.downloadBean;
        boolean z11 = false;
        if (downloadBean3 != null && downloadBean3.getType() == 6) {
            z11 = true;
        }
        boolean z12 = z11;
        DownloadBean downloadBean4 = this.downloadBean;
        return new MediaItem(totalTitleName, "", cover, null, null, null, pendingIntentM74149j2, intentM74131d2, str, strM65591t, Boolean.valueOf(z12), "local_detail", null, downloadBean4 != null ? downloadBean4.getOps() : null, 4152, null);
    }

    /* JADX INFO: renamed from: i3 */
    private final void m74146i3(long progress) {
        if (this.isBgPlaying || !this.isNewPlayer) {
            return;
        }
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.seekTo(progress);
        }
        InterfaceC16634g interfaceC16634g2 = this.orPlayer;
        if (interfaceC16634g2 != null) {
            interfaceC16634g2.play();
        }
        if (this.unplaySeekTargetPercent <= 0.0f && progress >= 1000 && !this.isReload) {
            m74142h2().m73111h(LayerFlag.SHOW_TOAST, Utils.m27275a().getString(R$string.last_played_time) + " " + AbstractC17443m.m74969d(progress));
        }
        if (!this.isDownloadingPlay || this.isReload) {
            return;
        }
        C16780a c16780aM74142h2 = m74142h2();
        LayerFlag layerFlag = LayerFlag.SHOW_TOAST;
        String string = Utils.m27275a().getString(R$string.analysing_from);
        String[] stringArray = Utils.m27275a().getResources().getStringArray(R$array.analysing_array);
        Intrinsics.m97801g(stringArray, "getStringArray(...)");
        c16780aM74142h2.m73111h(layerFlag, string + " [" + ArraysKt.m97489v0(stringArray, Random.INSTANCE) + "]");
    }

    private final void initAd() {
        AppCompatImageView appCompatImageView;
        LocalVideoAdHelper localVideoAdHelper = this.localVideoAdHelper;
        C28158k mViewBinding = getMViewBinding();
        DownloadBean downloadBean = this.downloadBean;
        localVideoAdHelper.m74896v2(mViewBinding, downloadBean != null ? downloadBean.getGenre() : null, new Function1() { // from class: com.transsion.postdetail.ui.fragment.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocalVideoDetailFragment.m74190u2(this.f57451a, ((Boolean) obj).booleanValue());
            }
        });
        C28158k mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (appCompatImageView = mViewBinding2.f86507n) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.fragment.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalVideoDetailFragment.m74194v2(this.f57458a, view);
            }
        });
    }

    private final void initAudioListener() {
        InterfaceC23410a interfaceC23410aM74128c2 = m74128c2();
        if (interfaceC23410aM74128c2 != null) {
            interfaceC23410aM74128c2.addPlayerListener(this);
        }
        InterfaceC23410a interfaceC23410aM74128c3 = m74128c2();
        if (interfaceC23410aM74128c3 != null) {
            interfaceC23410aM74128c3.pause();
        }
    }

    private final void initView() {
        C28181z c28181z;
        C28179x c28179x;
        C28141b0 c28141b0;
        ConstraintLayout constraintLayoutM109328b;
        C28158k mViewBinding = getMViewBinding();
        if (mViewBinding != null && (constraintLayoutM109328b = mViewBinding.getRoot()) != null) {
            constraintLayoutM109328b.setKeepScreenOn(true);
        }
        C28158k mViewBinding2 = getMViewBinding();
        ConstraintLayout constraintLayout = null;
        ConstraintLayout constraintLayout2 = (mViewBinding2 == null || (c28141b0 = mViewBinding2.f86506m) == null) ? null : c28141b0.f86366i;
        if (constraintLayout2 != null) {
            m74142h2().m73111h(LayerFlag.INIT_VIEW_TYPE, constraintLayout2, LocalUiType.PORTRAIT);
        }
        C28158k mViewBinding3 = getMViewBinding();
        ConstraintLayout constraintLayout3 = (mViewBinding3 == null || (c28179x = mViewBinding3.f86504k) == null) ? null : c28179x.f86731l;
        if (constraintLayout3 != null) {
            m74142h2().m73111h(LayerFlag.INIT_VIEW_TYPE, constraintLayout3, LocalUiType.LAND);
        }
        C28158k mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (c28181z = mViewBinding4.f86505l) != null) {
            constraintLayout = c28181z.f86791r;
        }
        if (constraintLayout != null) {
            m74142h2().m73111h(LayerFlag.INIT_VIEW_TYPE, constraintLayout, LocalUiType.MIDDLE);
        }
        m74054C3(LocalUiType.PORTRAIT);
        m74197w2();
        Context context = getContext();
        if (context == null || AbstractC14556b.m65670a(context)) {
            return;
        }
        m74167o2().m65135h();
    }

    /* JADX INFO: renamed from: j2 */
    private final PendingIntent m74149j2() {
        return PendingIntent.getActivity(Utils.m27275a(), 0, m74139g2("media_notification"), m74157l2());
    }

    /* JADX INFO: renamed from: j3 */
    private final void m74150j3(String path) {
        VideoSubtitleControl videoSubtitleControl;
        C26866a.a aVar = C26866a.f81698a;
        boolean z11 = this.isBgPlaying;
        DownloadBean downloadBean = this.downloadBean;
        String subjectId = downloadBean != null ? downloadBean.getSubjectId() : null;
        DownloadBean downloadBean2 = this.downloadBean;
        String totalTitleName = downloadBean2 != null ? downloadBean2.getTotalTitleName() : null;
        DownloadBean downloadBean3 = this.downloadBean;
        String resourceId = downloadBean3 != null ? downloadBean3.getResourceId() : null;
        DownloadBean downloadBean4 = this.downloadBean;
        String createAtFormat = downloadBean4 != null ? downloadBean4.getCreateAtFormat() : null;
        aVar.m104912c("long_video_play", "playerSetDataSource, isBgPlaying = " + z11 + ", subjectId = " + subjectId + ", name:" + totalTitleName + "resourceId = " + resourceId + ", downloadTime:" + createAtFormat + "， orPlayer:" + this.orPlayer + ", path = " + path, true);
        if (!this.isNewPlayer && (videoSubtitleControl = this.subtitleControl) != null) {
            videoSubtitleControl.m81887b0(true);
        }
        if (this.isBgPlaying || !this.isNewPlayer) {
            this.isNewPlayer = true;
            return;
        }
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.clearScreen();
        }
        DownloadBean downloadBean5 = this.downloadBean;
        if (downloadBean5 != null) {
            downloadBean5.setPlayingUrl(path);
        }
        InterfaceC16634g interfaceC16634g2 = this.orPlayer;
        if (interfaceC16634g2 != null) {
            C23403e c23403e = new C23403e(String.valueOf(path.hashCode()), path, 0, null, m74145i2(), 12, null);
            MusicFloatManager.C14535a c14535a = MusicFloatManager.f51050h;
            c14535a.m65598b().m65583C(c23403e.m92929e());
            c14535a.m65598b().m65582B(c23403e.m92933i());
            interfaceC16634g2.setDataSource(c23403e);
        }
        InterfaceC16634g interfaceC16634g3 = this.orPlayer;
        if (interfaceC16634g3 != null) {
            interfaceC16634g3.prepare();
        }
        m74176q3();
        this.curTimeoutPlayPath = path;
        this.playTimeoutHandler.postDelayed(this.playTimeoutRunnable, this.isDownloadingPlay ? m74164n2() : m74161m2());
    }

    /* JADX INFO: renamed from: k2 */
    private final C17444n m74153k2() {
        return (C17444n) this.orientationEventListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k3 */
    public final void m74154k3(DownloadBean downloadBean) {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        long duration = interfaceC16634g != null ? interfaceC16634g.getDuration() : 0L;
        this.duration = duration;
        this.localVideoAdHelper.m72730L1(duration);
        C26866a.f81698a.m104912c("long_video_play", "onPrepare history progress " + (downloadBean != null ? Long.valueOf(downloadBean.getReadProgress()) : null) + "， duration = " + this.duration + ", unplaySeekProgress = " + this.unplaySeekTargetPercent + ", id =" + (downloadBean != null ? downloadBean.getResourceId() : null) + ", epse = " + (downloadBean != null ? Integer.valueOf(downloadBean.getEpse()) : null), true);
        final Ref.LongRef longRef = new Ref.LongRef();
        long readProgress = downloadBean != null ? downloadBean.getReadProgress() : 0L;
        longRef.element = readProgress;
        if (Math.abs(readProgress - this.duration) < 100) {
            longRef.element = 0L;
        }
        float f11 = this.unplaySeekTargetPercent;
        if (f11 > 0.0f) {
            longRef.element = (long) (f11 * this.duration);
        }
        if (this.subtitleList.isEmpty()) {
            m74146i3(longRef.element);
            return;
        }
        ORPlayerView oRPlayerView = this.orPlayerView;
        if (oRPlayerView != null) {
            oRPlayerView.postDelayed(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.g0
                @Override // java.lang.Runnable
                public final void run() {
                    LocalVideoDetailFragment.m74158l3(this.f57350a, longRef);
                }
            }, 200L);
        }
    }

    /* JADX INFO: renamed from: l2 */
    private final int m74157l2() {
        if (Build.VERSION.SDK_INT >= 31) {
            return 67108864;
        }
        return ASTNode.NOJIT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l3 */
    public static final void m74158l3(LocalVideoDetailFragment localVideoDetailFragment, Ref.LongRef longRef) {
        localVideoDetailFragment.m74146i3(longRef.element);
    }

    /* JADX INFO: renamed from: m2 */
    private final long m74161m2() {
        return ((Number) this.playTimeout.getValue()).longValue();
    }

    /* JADX INFO: renamed from: n2 */
    private final long m74164n2() {
        return ((Number) this.playTimeoutDp.getValue()).longValue();
    }

    /* JADX INFO: renamed from: o2 */
    private final ScreenRotationHelper m74167o2() {
        return (ScreenRotationHelper) this.screenHelper.getValue();
    }

    /* JADX INFO: renamed from: o3 */
    public static /* synthetic */ void m74168o3(LocalVideoDetailFragment localVideoDetailFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        localVideoDetailFragment.m74216n3(z11);
    }

    /* JADX INFO: renamed from: p2 */
    private final C17006o m74171p2() {
        return (C17006o) this.speedViewModel.getValue();
    }

    /* JADX INFO: renamed from: p3 */
    private final void m74172p3() {
        if (!isAdded() || isDetached() || isRemoving()) {
            return;
        }
        List<Fragment> listM14574y0 = getParentFragmentManager().m14574y0();
        Intrinsics.m97801g(listM14574y0, "getFragments(...)");
        for (Fragment fragment : listM14574y0) {
            if (fragment instanceof BaseDialog) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    ((BaseDialog) fragment).dismissAllowingStateLoss();
                    Result.m112707constructorimpl(Unit.f75682a);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m112707constructorimpl(ResultKt.m97106a(th2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: q2 */
    private final VideoDetailPlayDao m74175q2() {
        return (VideoDetailPlayDao) this.videoDetailPlayDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q3 */
    public final void m74176q3() {
        this.curTimeoutPlayPath = null;
        C16791c0 c16791c0 = this.localVideoDot;
        if (c16791c0 != null) {
            c16791c0.m73425M(false);
        }
        this.playTimeoutHandler.removeCallbacks(this.playTimeoutRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r3 */
    public final void m74179r3(DownloadBean cvideoBean, long playProgress, boolean completed) {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new LocalVideoDetailFragment$save$1(completed, this, playProgress, cvideoBean, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public static final Handler m74182s2() {
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.m97799e(looperMyLooper);
        return new Handler(looperMyLooper);
    }

    /* JADX INFO: renamed from: s3 */
    static /* synthetic */ void m74183s3(LocalVideoDetailFragment localVideoDetailFragment, DownloadBean downloadBean, long j11, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        localVideoDetailFragment.m74179r3(downloadBean, j11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2 */
    public final void m74186t2() {
        VideoSubtitleControl videoSubtitleControl;
        if (!isAdded() || isDetached() || isRemoving() || this.isMusic) {
            return;
        }
        C26866a.a.m104905r(C26866a.f81698a, "ORSubtitle", new String[]{"没字幕准备提示用户"}, false, 4, null);
        if (!C14496b.f50966a.m65344b().getBoolean("no_subtitle_tip_again", true) || (videoSubtitleControl = this.subtitleControl) == null) {
            return;
        }
        VideoSubtitleControl.m81854k0(videoSubtitleControl, true, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t3 */
    public final Object m74187t3(DownloadBean downloadBean, Continuation continuation) {
        String subjectId = downloadBean.getSubjectId();
        String str = subjectId == null ? "" : subjectId;
        String resourceId = downloadBean.getResourceId();
        String str2 = resourceId == null ? "" : resourceId;
        int ep2 = downloadBean.getEp();
        int se2 = downloadBean.getSe();
        long readProgress = downloadBean.getReadProgress();
        Long duration = downloadBean.getDuration();
        String subjectName = downloadBean.getSubjectName();
        if (subjectName == null) {
            subjectName = downloadBean.getFileName();
        }
        String str3 = subjectName;
        String url = downloadBean.getUrl();
        long lastPlayTimeStamp = downloadBean.getLastPlayTimeStamp();
        String cover = downloadBean.getCover();
        String thumbnail = downloadBean.getThumbnail();
        String averageHueLight = downloadBean.getAverageHueLight();
        Integer subjectDurationSeconds = downloadBean.getSubjectDurationSeconds();
        Long lM97635e = subjectDurationSeconds != null ? Boxing.m97635e(subjectDurationSeconds.intValue()) : null;
        int subjectType = downloadBean.getSubjectType();
        String value = PlayMode.DOWNLOAD.getValue();
        String url2 = downloadBean.getUrl();
        String path = downloadBean.getPath();
        Long size = downloadBean.getSize();
        long jLongValue = size != null ? size.longValue() : 0L;
        String ops = downloadBean.getOps();
        Object objMo65007p = m74175q2().mo65007p(new VideoDetailPlayBean(str, str2, ep2, se2, readProgress, str3, cover, thumbnail, url, lastPlayTimeStamp, null, duration, lM97635e, averageHueLight, Boxing.m97634d(subjectType), false, value, url2, path, jLongValue, null, null, null, false, false, false, ops == null ? "" : ops, 66061312, null), continuation);
        return objMo65007p == IntrinsicsKt.m97630f() ? objMo65007p : Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public static final Unit m74190u2(LocalVideoDetailFragment localVideoDetailFragment, boolean z11) {
        InterfaceC16634g interfaceC16634g;
        InterfaceC16634g interfaceC16634g2;
        localVideoDetailFragment.isAdShowing = z11;
        if (z11 && (interfaceC16634g = localVideoDetailFragment.orPlayer) != null && interfaceC16634g.isPlaying() && (interfaceC16634g2 = localVideoDetailFragment.orPlayer) != null) {
            interfaceC16634g2.pause();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u3 */
    public static final ScreenRotationHelper m74191u3(LocalVideoDetailFragment localVideoDetailFragment) {
        Context contextRequireContext = localVideoDetailFragment.requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        return new ScreenRotationHelper(contextRequireContext, new LocalVideoDetailFragment$screenHelper$2$1(localVideoDetailFragment), new LocalVideoDetailFragment$screenHelper$2$2(localVideoDetailFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public static final void m74194v2(LocalVideoDetailFragment localVideoDetailFragment, View view) {
        LocalUiType localUiType = localVideoDetailFragment.mUiType;
        LocalUiType localUiType2 = LocalUiType.LAND;
        if (localUiType == localUiType2) {
            localUiType2 = LocalUiType.MIDDLE;
        }
        localVideoDetailFragment.m74142h2().m73111h(LayerFlag.SCREEN_ORIENTATION_CHANGED, localUiType2);
    }

    /* JADX INFO: renamed from: w2 */
    private final void m74197w2() {
        C14492k.f50955a.m65317g(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w3 */
    public final void m74198w3(DownloadBean bean, boolean isStart) {
        int iLongValue;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j11 = this.duration;
        long j12 = 0;
        long j13 = 10000;
        int i11 = j11 > 0 ? (int) ((this.playProgress / j11) * 10000) : 0;
        boolean z11 = false;
        boolean z12 = false;
        for (DownloadRange downloadRange : bean.getDownloadRanges()) {
            float start = downloadRange.getStart();
            Long size = bean.getSize();
            Intrinsics.m97799e(size);
            float fLongValue = start / size.longValue();
            float f11 = j13;
            int i12 = (int) (fLongValue * f11);
            if (downloadRange.getProgress() == j12) {
                iLongValue = 0;
            } else {
                float f12 = downloadRange.totalProgress();
                Long size2 = bean.getSize();
                Intrinsics.m97799e(size2);
                iLongValue = (int) ((f12 / size2.longValue()) * f11);
            }
            if (z11) {
                z12 = true;
                if (i11 < i12) {
                    if (iLongValue < i11) {
                        iLongValue = i11;
                        i12 = iLongValue;
                    } else {
                        i12 = i11;
                    }
                }
                z11 = false;
            }
            if (i11 > 0 && !z12 && i11 > iLongValue) {
                z11 = true;
            }
            linkedHashMap.put(Integer.valueOf(i12), Integer.valueOf(iLongValue));
            j12 = 0;
            j13 = 10000;
        }
        if (!isStart) {
            this.playingDownloadHandler.removeCallbacksAndMessages(null);
            m74142h2().m73111h(LayerFlag.DOWNLOAD_PROGRESS, linkedHashMap);
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "start setDownloadedProgress, progressList = " + linkedHashMap, false, 4, null);
        this.playingDownloadHandler.postDelayed(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.d0
            @Override // java.lang.Runnable
            public final void run() {
                LocalVideoDetailFragment.m74202x3(this.f57309a, linkedHashMap);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: x2 */
    private final void m74201x2() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("extra_local_path");
            if (string == null) {
                string = "";
            }
            this.localPath = string;
            String string2 = arguments.getString("extra_url");
            if (string2 == null) {
                string2 = "";
            }
            this.url = string2;
            String string3 = arguments.getString("extra_proxy_url");
            if (string3 == null) {
                string3 = "";
            }
            this.proxyUrl = string3;
            String string4 = arguments.getString("extra_resource_id");
            if (string4 == null) {
                string4 = "";
            }
            this.resourceId = string4;
            String string5 = arguments.getString("extra_subject_id");
            if (string5 == null) {
                string5 = "";
            }
            this.subjectId = string5;
            String string6 = arguments.getString("extra_name");
            if (string6 == null) {
                string6 = "";
            }
            this.name = string6;
            String string7 = arguments.getString("extra_post_id");
            if (string7 == null) {
                string7 = "";
            }
            this.postId = string7;
            this.completed = arguments.getBoolean("extra_completed");
            this.isSeries = arguments.getBoolean("extra_is_series");
            String string8 = arguments.getString("extra_page_from");
            this.pageFrom = string8 != null ? string8 : "";
            this.videoHeight = arguments.getInt("extra_height");
            this.videoWidth = arguments.getInt("extra_width");
            this.parentPosition = arguments.getInt("extra_parent_position", -1);
            this.position = arguments.getInt("extra_position", -1);
            this.isDownloadingPlay = !this.completed;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public static final void m74202x3(LocalVideoDetailFragment localVideoDetailFragment, Map map) {
        localVideoDetailFragment.m74142h2().m73111h(LayerFlag.DOWNLOAD_PROGRESS, map);
    }

    /* JADX INFO: renamed from: y2 */
    private final void m74205y2() {
        m74201x2();
        m74208z2();
        m74068G2();
        m74045A2(true);
        m74098Q2();
        initAudioListener();
        m74089N2(this.downloadBean);
        m74049B2();
        initAd();
        m74092O2();
        MediaItem mediaItemM65588q = MusicFloatManager.f51050h.m65598b().m65588q();
        if (mediaItemM65588q != null) {
            mediaItemM65588q.setPageName("local_detail");
        }
    }

    /* JADX INFO: renamed from: z2 */
    private final void m74208z2() {
        C16791c0 c16791c0 = new C16791c0();
        this.localVideoDot = c16791c0;
        c16791c0.m73434g();
        C16791c0 c16791c1 = this.localVideoDot;
        if (c16791c1 != null) {
            c16791c1.m73415C(this.position);
        }
        C16791c0 c16791c2 = this.localVideoDot;
        if (c16791c2 != null) {
            c16791c2.m73414B(this.parentPosition);
        }
        m74142h2().m73111h(LayerFlag.LAYER_EVENT, new C17016c());
    }

    /* JADX INFO: renamed from: S2, reason: from getter */
    public final boolean getIsAdShowing() {
        return this.isAdShowing;
    }

    /* JADX INFO: renamed from: W1 */
    public final void m74210W1(String subjectId, String resourceId) {
        m74142h2().m73111h(LayerFlag.SERIES_PLAY, subjectId, resourceId);
    }

    /* JADX INFO: renamed from: W2 */
    public final void m74211W2(boolean isLock) {
        C16791c0 c16791c0 = this.localVideoDot;
        if (c16791c0 != null) {
            c16791c0.m73418F(isLock);
        }
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m74212Z2() {
        this.localVideoAdHelper.m74895u2();
    }

    /* JADX INFO: renamed from: b2 */
    public final void m74213b2() {
        C16791c0 c16791c0 = this.localVideoDot;
        if (c16791c0 != null) {
            c16791c0.m73444q();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d c26907d) {
        InterfaceC16633f.a.m72423a(this, z11, i11, i12, c26907d);
    }

    /* JADX INFO: renamed from: e3 */
    public final void m74214e3() {
        InterfaceC16634g interfaceC16634g;
        InterfaceC16634g interfaceC16634g2 = this.orPlayer;
        if (interfaceC16634g2 == null || interfaceC16634g2.isPlaying() || this.isAdShowing || (interfaceC16634g = this.orPlayer) == null) {
            return;
        }
        interfaceC16634g.play();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void initPlayer() {
        InterfaceC16633f.a.m72424b(this);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        HashMap mapM96844g;
        MusicFloatManager.f51050h.m65598b().m65592u();
        initView();
        m74205y2();
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
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isRegisteDeviceKeyMonitor() {
        return true;
    }

    /* JADX INFO: renamed from: m3 */
    public final void m74215m3() {
        if (!this.isMusic) {
            m74142h2().m73111h(LayerFlag.RELEASE_PLAYER, new Object[0]);
        }
        m74176q3();
    }

    /* JADX INFO: renamed from: n3 */
    public final void m74216n3(boolean fromClicked) {
        if (this.isBgPlaying || !this.isNewPlayer) {
            return;
        }
        if (fromClicked) {
            this.playErrorCount.set(0);
        }
        if (this.playErrorCount.get() > 2) {
            return;
        }
        this.errorInfo = null;
        this.playErrorCount.getAndAdd(1);
        C26866a.f81698a.m104921x("long_video_play", "video error，reload~~", true);
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.stop();
        }
        InterfaceC16634g interfaceC16634g2 = this.orPlayer;
        if (interfaceC16634g2 != null) {
            interfaceC16634g2.reset();
        }
        this.isPrepare = false;
        this.isReload = true;
        m74142h2().m73110g(LayerFlag.LOADING_BEGIN, new Object[0]);
        m74150j3(!this.isDownloadingPlay ? this.localPath : this.proxyUrl);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("local_video_detail", false, 2, null);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onAliyunDecodeErrorChangeSoftwareDecoder(C23403e c23403e) {
        InterfaceC16633f.a.m72425c(this, c23403e);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.m97802h(context, "context");
        super.onAttach(context);
        m74142h2().m73108d(new C16804g1(this));
        m74142h2().m73108d(new C16842u0(this));
        m74142h2().m73108d(new LocalVideoMiddleLayer(this));
        m74142h2().m73109e(LayerFlag.SET_MANAGER, m74142h2());
        requireActivity().getOnBackPressedDispatcher().m942i(this, new C17019f());
    }

    @Override // com.transsion.baselib.report.C14492k.a
    public void onBackgroundStatusChange(boolean isBackground) {
        C16791c0 c16791c0;
        if (!isBackground || (c16791c0 = this.localVideoDot) == null) {
            return;
        }
        c16791c0.m73431b(true);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onBufferedPosition(long j11, C23403e c23403e) {
        InterfaceC16633f.a.m72426d(this, j11, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onCompletion(C23403e c23403e) {
        InterfaceC16633f.a.m72427e(this, c23403e);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        InterfaceC23411b interfaceC23411b;
        Intrinsics.m97802h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onConfigurationChanged " + newConfig.orientation, false, 4, null);
        int i11 = newConfig.orientation;
        if (i11 == 2) {
            InterfaceC23410a interfaceC23410aM74128c2 = m74128c2();
            if (interfaceC23410aM74128c2 != null) {
                interfaceC23410aM74128c2.pause();
                return;
            }
            return;
        }
        if (i11 != 1 || (interfaceC23411b = (InterfaceC23411b) TheRouter.m61774d(InterfaceC23411b.class, new Object[0])) == null) {
            return;
        }
        interfaceC23411b.show();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, p743rh.InterfaceC27288n
    public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
        InterfaceC16634g interfaceC16634g;
        Intrinsics.m97802h(network, "network");
        Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
        DownloadBean downloadBean = this.downloadBean;
        if (downloadBean != null) {
            C26866a.f81698a.m104912c(C14482a.f50937a.m65273a(), "网络连接成功开始检测字幕,name:" + downloadBean.getTotalTitleName() + ", subtitleResId:" + downloadBean.getSubtitleResId(), true);
            InterfaceC19714h.b.m82149a(InterfaceC19714h.f62935a.m82148b(), downloadBean, null, 2, null);
        }
        if (this.isDownloadingPlay && isResumed()) {
            DownloadBean downloadBean2 = this.downloadBean;
            if (downloadBean2 != null) {
                m74134e2().mo88679k(downloadBean2);
            }
            C26866a.a.m104908v(C26866a.f81698a, this.TAG, "onNetworkConnected", false, 4, null);
            InterfaceC16634g interfaceC16634g2 = this.orPlayer;
            if ((interfaceC16634g2 != null && !interfaceC16634g2.isPlaying()) || ((interfaceC16634g = this.orPlayer) != null && interfaceC16634g.isLoading())) {
                m74142h2().m73110g(LayerFlag.LOADING_BEGIN, new Object[0]);
                m74118Y1();
                if (this.errorInfo != null || this.isAdShowing) {
                    m74216n3(false);
                } else {
                    InterfaceC16634g interfaceC16634g3 = this.orPlayer;
                    if (interfaceC16634g3 != null) {
                        interfaceC16634g3.play();
                    }
                }
            }
            m74142h2().m73111h(LayerFlag.NETWORK_CHANGE, Boolean.TRUE);
            if (this.isPlayerNetTimeout) {
                m74142h2().m73111h(LayerFlag.PLAYER_TIMEOUT_TIPS, new Object[0]);
            }
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        ConstraintLayout constraintLayoutM109328b;
        super.onDestroy();
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onDestroy", false, 4, null);
        DownloadBean downloadBean = this.downloadBean;
        if (downloadBean != null) {
            downloadBean.setQuitDPRestart(true);
            downloadBean.setDownloadingPlay(false);
        }
        C14492k.f50955a.m65326t(this);
        if (this.isDownloadingPlay) {
            m74134e2().mo88673d();
        }
        m74050B3();
        C16791c0 c16791c0 = this.localVideoDot;
        if (c16791c0 != null) {
            C16791c0.m73410c(c16791c0, false, 1, null);
        }
        C28158k mViewBinding = getMViewBinding();
        if (mViewBinding != null && (constraintLayoutM109328b = mViewBinding.getRoot()) != null) {
            constraintLayoutM109328b.setKeepScreenOn(false);
        }
        VideoSubtitleControl videoSubtitleControl = this.subtitleControl;
        if (videoSubtitleControl != null) {
            videoSubtitleControl.m81878M();
        }
        m74142h2().m73111h(LayerFlag.FRAGMENT_DESTROY, new Object[0]);
        InterfaceC23410a interfaceC23410aM74128c2 = m74128c2();
        if (interfaceC23410aM74128c2 != null) {
            interfaceC23410aM74128c2.removePlayerListener(this);
        }
        m74134e2().mo88682n();
        m74134e2().mo88686q(this.downloadListener);
        this.localVideoAdHelper.m74894t2();
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.removePlayerListener(this.playerListener);
        }
        this.playTimeoutHandler.removeCallbacks(this.playTimeoutRunnable);
        Context context = getContext();
        if (context != null && !AbstractC14556b.m65670a(context)) {
            m74167o2().m65136l();
        }
        setMViewBinding(null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, p743rh.InterfaceC27288n
    public void onDisconnected() {
        if (this.isDownloadingPlay) {
            C26866a.a aVar = C26866a.f81698a;
            InterfaceC16634g interfaceC16634g = this.orPlayer;
            Boolean boolValueOf = interfaceC16634g != null ? Boolean.valueOf(interfaceC16634g.isLoading()) : null;
            aVar.m104912c("long_video_play", "onNetworkDisconnected  isLoading= " + boolValueOf + ", isPrepare = " + this.isPrepare + ", isDownloadingPlayStart =" + this.isDownloadingPlayStart, true);
            InterfaceC16634g interfaceC16634g2 = this.orPlayer;
            if ((interfaceC16634g2 == null || !interfaceC16634g2.isLoading()) && this.isDownloadingPlayStart && this.isPrepare) {
                return;
            }
            m74142h2().m73111h(LayerFlag.NETWORK_CHANGE, Boolean.FALSE);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onFocusChange(boolean z11) {
        InterfaceC16633f.a.m72429g(this, z11);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, com.transsion.baselib.utils.DeviceKeyMonitor.InterfaceC14502b
    public void onHomeClick() {
        super.onHomeClick();
        C26866a.f81698a.m104912c("VideoFloat", "local onHomeClick", true);
        m74142h2().m73111h(LayerFlag.SHOW_FLOAT_2_WINDOW, FloatActionType.HOME);
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
    public void onMediaItemTransition(String str) {
        InterfaceC16633f.a.m72438p(this, str);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.isMusic) {
            return;
        }
        m74142h2().m73111h(LayerFlag.FRAGMENT_PAUSE, new Object[0]);
        C17444n c17444nM74153k2 = m74153k2();
        if (c17444nM74153k2 != null) {
            c17444nM74153k2.disable();
        }
        this.localVideoAdHelper.m74891B2();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
        m74142h2().m73111h(LayerFlag.INTO_PIP, Boolean.valueOf(isInPictureInPictureMode));
        InterfaceC27138e.f82251a.m105606b().onPipModeChanged(isInPictureInPictureMode);
        C16791c0 c16791c0 = this.localVideoDot;
        if (c16791c0 != null) {
            c16791c0.m73416D(isInPictureInPictureMode);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayError(PlayError playError, C23403e c23403e) {
        InterfaceC16633f.a.m72439q(this, playError, c23403e);
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

    @Override // com.transsion.baseui.fragment.PageStatusFragment, com.transsion.baselib.utils.DeviceKeyMonitor.InterfaceC14502b
    public void onRecentClick() {
        super.onRecentClick();
        C26866a.f81698a.m104912c("VideoFloat", "local onRecentClick", true);
        m74142h2().m73111h(LayerFlag.SHOW_FLOAT_2_WINDOW, FloatActionType.HOME);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onRenderFirstFrame() {
        InterfaceC16633f.a.m72412A(this);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.isMusic) {
            return;
        }
        m74142h2().m73111h(LayerFlag.FRAGMENT_RESUME, new Object[0]);
        C17444n c17444nM74153k2 = m74153k2();
        if (c17444nM74153k2 != null) {
            c17444nM74153k2.enable();
        }
        this.localVideoAdHelper.m74892C2();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onSetDataSource() {
        InterfaceC16633f.a.m72413B(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        m74183s3(this, this.downloadBean, this.playProgress, false, 4, null);
        if (!this.isMusic) {
            m74142h2().m73111h(LayerFlag.FRAGMENT_STOP, new Object[0]);
        }
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
    public void onVideoPause(C23403e c23403e) {
        InterfaceC16633f.a.m72417F(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoSizeChanged(int i11, int i12) {
        InterfaceC16633f.a.m72419H(this, i11, i12);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoStart(C23403e mediaSource) {
        InterfaceC16633f.a.m72420I(this, mediaSource);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: r2, reason: merged with bridge method [inline-methods] */
    public C28158k getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28158k c28158kM109326c = C28158k.m109326c(inflater);
        Intrinsics.m97801g(c28158kM109326c, "inflate(...)");
        return c28158kM109326c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void setOnSeekCompleteListener() {
        InterfaceC16633f.a.m72422K(this);
    }

    /* JADX INFO: renamed from: v3 */
    public final void m74218v3(long progress, float targetPercent) {
        C16791c0 c16791c0 = this.localVideoDot;
        if (c16791c0 != null) {
            c16791c0.m73444q();
        }
        if (!this.isPrepare) {
            this.unplaySeekTargetPercent = targetPercent;
        }
        this.playProgress = progress;
    }

    /* JADX INFO: renamed from: y3 */
    public final void m74219y3(LocalUiType localUiType) {
        this.mUiType = localUiType;
    }

    /* JADX INFO: renamed from: z3 */
    public final void m74220z3(boolean z11) {
        this.isPauseState = z11;
    }
}
