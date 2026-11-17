package com.transsion.player.longvideo.p302ui;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Html;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC3165t;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.LifecycleCoroutineScope;
import androidx.p1004lifecycle.LiveData;
import ck.AbstractC5112i;
import ck.AbstractC5114k;
import ck.AbstractC5119p;
import ck.C5110g;
import ck.C5118o;
import com.avery.subtitle.widget.SimpleSubtitleView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5779c;
import com.blankj.utilcode.util.AbstractC5806y;
import com.blankj.utilcode.util.NetworkUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.cloud.config.utils.XLogUtil;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.cloud.tmc.kernel.utils.UrlUtils;
import com.cloud.tmc.miniapp.prepare.steps.PrepareException;
import com.google.common.collect.ImmutableList;
import com.gyf.immersionbar.BarHide;
import com.gyf.immersionbar.ImmersionBar;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.view.InterfaceC13776s;
import com.p282tn.lib.view.SecondariesSeekBar;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14453d;
import com.transsion.baselib.helper.ScreenRotationHelper;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayDao;
import com.transsion.baselib.p291db.video.VideoDetailPlayBean;
import com.transsion.baselib.p291db.video.VideoDetailPlayDao;
import com.transsion.baselib.report.C14492k;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baselib.utils.PlayMode;
import com.transsion.baseui.R$drawable;
import com.transsion.baseui.R$mipmap;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.baseui.music.MusicFloatManager;
import com.transsion.baseui.util.AbstractC14556b;
import com.transsion.baseui.util.C14557c;
import com.transsion.mbwidget.C15716d;
import com.transsion.mbwidget.guide.InterfaceC15742a;
import com.transsion.memberapi.MemberCheckResult;
import com.transsion.memberapi.MemberSceneType;
import com.transsion.memberapi.MemberSource;
import com.transsion.moviedetailapi.bean.DubsInfo;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.p285ad.monopoly.model.AdPlans;
import com.transsion.p285ad.p288ps.activate.PSActivateManager;
import com.transsion.p285ad.strategy.C14057b;
import com.transsion.p285ad.view.CustomRoundCornerLayout;
import com.transsion.p289al.p290ka.KaManager;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.player.config.RenderType;
import com.transsion.player.longvideo.R$array;
import com.transsion.player.longvideo.R$id;
import com.transsion.player.longvideo.R$string;
import com.transsion.player.longvideo.constants.LongVodContentType;
import com.transsion.player.longvideo.constants.LongVodPageType;
import com.transsion.player.longvideo.constants.LongVodPlayerConfigType;
import com.transsion.player.longvideo.helper.C16441c;
import com.transsion.player.longvideo.helper.C16449g;
import com.transsion.player.longvideo.helper.C16453i;
import com.transsion.player.longvideo.helper.C16455j;
import com.transsion.player.longvideo.helper.C16471u;
import com.transsion.player.longvideo.helper.InterfaceC16473w;
import com.transsion.player.longvideo.helper.LongVodResolutionHelper;
import com.transsion.player.longvideo.helper.LongVodSubtitleHelper;
import com.transsion.player.longvideo.member.C16496k;
import com.transsion.player.longvideo.member.C16503r;
import com.transsion.player.longvideo.member.ResolutionMemberManager;
import com.transsion.player.longvideo.member.ResolutionUnlockFragment;
import com.transsion.player.longvideo.p302ui.dialog.C16543a;
import com.transsion.player.longvideo.p302ui.dialog.LongVdPlayerConfigDialog;
import com.transsion.player.longvideo.p302ui.dialog.LongVodPlayerViewAdHelper;
import com.transsion.player.longvideo.p302ui.dialog.PlayerSettingDialog;
import com.transsion.player.mediasession.MediaItem;
import com.transsion.player.orplayer.InterfaceC16632e;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.PlayError;
import com.transsion.player.p1003enum.PlayMimeType;
import com.transsion.player.p1003enum.ScaleMode;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.player.p303ui.longvideo.InterfaceC16676a;
import com.transsion.player.p303ui.longvideo.ORLongVodPlayerView;
import com.transsion.postdetail.layer.local.C16791c0;
import com.transsion.postdetail.layer.local.C16813j1;
import com.transsion.postdetail.layer.local.C16834q1;
import com.transsion.postdetail.layer.local.LocalUiType;
import com.transsion.postdetail.p306ui.dialog.C17006o;
import com.transsion.postdetail.p306ui.view.ImmScaleView;
import com.transsion.postdetail.p306ui.view.ImmSpeedView;
import com.transsion.postdetail.util.AbstractC17443m;
import com.transsion.postdetail.util.C17444n;
import com.transsion.push.PushConstants;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.videofloat.bean.FloatActionType;
import com.transsion.videofloat.manager.C21106a0;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import cy.InterfaceC22789e;
import fk.AbstractC23384a;
import fo.C23403e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jo.InterfaceC24450a;
import kotlin.Deprecated;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.AbstractC25207u0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import mo.C25894a;
import ng.AbstractC26006c;
import no.C26041a0;
import no.C26053g0;
import okhttp3.internal.http2.Settings;
import org.mvel2.ast.ASTNode;
import p025ay.C4718a;
import p352dn.InterfaceC22997a;
import p352dn.InterfaceC22998b;
import p352dn.InterfaceC22999c;
import p438go.C23619a;
import p438go.C23621c;
import p438go.C23622d;
import p462hj.C23860f;
import p550kj.C24662i;
import p553ko.C24715a;
import p553ko.C24716b;
import p553ko.C24717c;
import p582lo.C25654c;
import p582lo.C25661j;
import p665oy.C26750e;
import p683po.C26905b;
import p683po.C26906c;
import p683po.C26907d;
import p710qk.C27089h;
import p723qx.C27136c;
import p723qx.InterfaceC27135b;
import p723qx.InterfaceC27138e;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import p750rp.InterfaceC27316b;
import p913xm.C28615f;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0080\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0006ò\u0003õ\u0003þ\u0003\u0018\u0000 \u008b\u00042\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002¡\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0007\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013JS\u0010!\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010\u0013J\u0019\u0010'\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J!\u0010,\u001a\u00020\u00112\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020)¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0011H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0011H\u0016¢\u0006\u0004\b0\u0010/J\u0017\u00102\u001a\u00020\u00112\u0006\u00101\u001a\u00020)H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00112\u0006\u00104\u001a\u00020)H\u0016¢\u0006\u0004\b5\u00103J\u000f\u00106\u001a\u00020)H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u0010/J-\u0010<\u001a\u00020\u00112\b\u00109\u001a\u0004\u0018\u00010\u000f2\b\u0010:\u001a\u0004\u0018\u00010\u000f2\b\u0010;\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020\u00112\u0006\u0010>\u001a\u00020)¢\u0006\u0004\b?\u00103J2\u0010E\u001a\u00020\u00112#\u0010D\u001a\u001f\u0012\u0013\u0012\u00110\u001d¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\u0011\u0018\u00010@¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u00112\u0006\u0010G\u001a\u00020)H\u0016¢\u0006\u0004\bH\u00103J\u0017\u0010J\u001a\u00020\u00112\u0006\u0010D\u001a\u00020IH\u0016¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020\u00112\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\u00020\u00112\u0006\u0010P\u001a\u00020)¢\u0006\u0004\bQ\u00103J\u000f\u0010R\u001a\u00020\u0011H\u0016¢\u0006\u0004\bR\u0010/J\u000f\u0010S\u001a\u00020\u0011H\u0016¢\u0006\u0004\bS\u0010/J\u000f\u0010T\u001a\u00020\u0011H\u0016¢\u0006\u0004\bT\u0010/J\u000f\u0010U\u001a\u00020\u0011H\u0016¢\u0006\u0004\bU\u0010/J\u000f\u0010V\u001a\u00020\u0011H\u0016¢\u0006\u0004\bV\u0010/J\u000f\u0010W\u001a\u00020\u0011H\u0016¢\u0006\u0004\bW\u0010/J\u000f\u0010X\u001a\u00020\u0011H\u0014¢\u0006\u0004\bX\u0010/J\u000f\u0010Y\u001a\u00020\u0011H\u0014¢\u0006\u0004\bY\u0010/J\u000f\u0010Z\u001a\u00020\u0011H\u0016¢\u0006\u0004\bZ\u0010/J\u000f\u0010[\u001a\u00020\u0011H\u0016¢\u0006\u0004\b[\u0010/J\u000f\u0010\\\u001a\u00020)H\u0016¢\u0006\u0004\b\\\u00107J\u000f\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u0011H\u0016¢\u0006\u0004\b`\u0010/J\u000f\u0010a\u001a\u00020\u0011H\u0016¢\u0006\u0004\ba\u0010/J\u0017\u0010c\u001a\u00020\u00112\u0006\u0010b\u001a\u00020)H\u0016¢\u0006\u0004\bc\u00103J\u0017\u0010f\u001a\u00020\u00112\u0006\u0010e\u001a\u00020dH\u0016¢\u0006\u0004\bf\u0010gJ\u0011\u0010i\u001a\u0004\u0018\u00010hH\u0016¢\u0006\u0004\bi\u0010jJ\u0011\u0010l\u001a\u0004\u0018\u00010kH\u0016¢\u0006\u0004\bl\u0010mJ\u0011\u0010o\u001a\u0004\u0018\u00010nH\u0016¢\u0006\u0004\bo\u0010pJ\u0011\u0010q\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\bq\u0010rJ\u0011\u0010t\u001a\u0004\u0018\u00010sH\u0016¢\u0006\u0004\bt\u0010uJ\u0017\u0010w\u001a\u00020\u00112\u0006\u0010v\u001a\u00020)H\u0016¢\u0006\u0004\bw\u00103J\u001f\u0010z\u001a\u00020\u00112\u0006\u0010x\u001a\u00020h2\u0006\u0010y\u001a\u00020kH\u0016¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020\u0011H\u0016¢\u0006\u0004\b|\u0010/J\u0018\u0010\u007f\u001a\u00020\u00112\u0006\u0010~\u001a\u00020}H\u0007¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u000f\u0010\u0081\u0001\u001a\u00020\u0011¢\u0006\u0005\b\u0081\u0001\u0010/J\u0018\u0010\u0082\u0001\u001a\u00020\u00112\u0006\u0010~\u001a\u00020}¢\u0006\u0006\b\u0082\u0001\u0010\u0080\u0001J\u000f\u0010\u0083\u0001\u001a\u00020\u0011¢\u0006\u0005\b\u0083\u0001\u0010/J$\u0010\u0086\u0001\u001a\u00020\u00112\u0006\u0010~\u001a\u00020}2\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0012\u0010\u0088\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0011\u0010\u008a\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u008a\u0001\u0010/J\u0011\u0010\u008b\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u008b\u0001\u0010/J\u0011\u0010\u008c\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u008c\u0001\u0010/J$\u0010\u008d\u0001\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001a\u0010\u0090\u0001\u001a\u00020\u00112\u0007\u0010\u008f\u0001\u001a\u00020)H\u0002¢\u0006\u0005\b\u0090\u0001\u00103J\u0011\u0010\u0091\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0091\u0001\u0010/J\u001c\u0010\u0092\u0001\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0011\u0010\u0094\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0094\u0001\u0010/J\u0011\u0010\u0095\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0095\u0001\u0010/J\u0011\u0010\u0096\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0096\u0001\u0010/J\u0011\u0010\u0097\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0097\u0001\u0010/J\u0011\u0010\u0098\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0098\u0001\u0010/J\u0011\u0010\u0099\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0099\u0001\u0010/J\u0011\u0010\u009a\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u009a\u0001\u0010/J\u001c\u0010\u009d\u0001\u001a\u00020\u00112\b\u0010\u009c\u0001\u001a\u00030\u009b\u0001H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0011\u0010\u009f\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u009f\u0001\u0010/J%\u0010£\u0001\u001a\u00020\u00112\u0007\u0010 \u0001\u001a\u00020)2\b\u0010¢\u0001\u001a\u00030¡\u0001H\u0002¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u0011\u0010¥\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b¥\u0001\u0010/J\u001a\u0010§\u0001\u001a\u00020\u00112\u0007\u0010¦\u0001\u001a\u00020)H\u0002¢\u0006\u0005\b§\u0001\u00103J\u0011\u0010¨\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b¨\u0001\u0010/J\u0011\u0010©\u0001\u001a\u00020)H\u0002¢\u0006\u0005\b©\u0001\u00107J\u0011\u0010ª\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bª\u0001\u0010/J\u0011\u0010«\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b«\u0001\u0010/J\u0011\u0010¬\u0001\u001a\u00020)H\u0002¢\u0006\u0005\b¬\u0001\u00107J\u0011\u0010\u00ad\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u00ad\u0001\u0010/J\u0011\u0010®\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b®\u0001\u0010/J#\u0010°\u0001\u001a\u00020\u00112\u0006\u0010M\u001a\u00020L2\u0007\u0010¯\u0001\u001a\u00020sH\u0002¢\u0006\u0006\b°\u0001\u0010±\u0001J+\u0010µ\u0001\u001a\u00020\u00112\f\b\u0002\u0010³\u0001\u001a\u0005\u0018\u00010²\u00012\t\b\u0002\u0010´\u0001\u001a\u00020)H\u0002¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u0011\u0010·\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b·\u0001\u0010/J\u0011\u0010¸\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b¸\u0001\u0010/J\u001b\u0010º\u0001\u001a\u00020\u00112\u0007\u0010¹\u0001\u001a\u00020}H\u0002¢\u0006\u0006\bº\u0001\u0010\u0080\u0001J\u001b\u0010»\u0001\u001a\u00020\u00112\u0007\u0010¹\u0001\u001a\u00020}H\u0002¢\u0006\u0006\b»\u0001\u0010\u0080\u0001J\u0011\u0010¼\u0001\u001a\u00020)H\u0002¢\u0006\u0005\b¼\u0001\u00107J+\u0010½\u0001\u001a\u00020\u00112\f\b\u0002\u0010³\u0001\u001a\u0005\u0018\u00010²\u00012\t\b\u0002\u0010´\u0001\u001a\u00020)H\u0002¢\u0006\u0006\b½\u0001\u0010¶\u0001J$\u0010¿\u0001\u001a\u00020\u00112\u0007\u0010¾\u0001\u001a\u00020)2\b\b\u0002\u0010v\u001a\u00020)H\u0002¢\u0006\u0005\b¿\u0001\u0010-J\u0015\u0010Á\u0001\u001a\u0005\u0018\u00010À\u0001H\u0002¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u0015\u0010Ä\u0001\u001a\u0005\u0018\u00010Ã\u0001H\u0002¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u0011\u0010Æ\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bÆ\u0001\u0010/J\u0011\u0010Ç\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bÇ\u0001\u0010/J\"\u0010É\u0001\u001a\u00020\u00112\u0006\u0010v\u001a\u00020)2\u0007\u0010È\u0001\u001a\u00020)H\u0002¢\u0006\u0005\bÉ\u0001\u0010-J\u001c\u0010Ê\u0001\u001a\u00020\u00112\t\b\u0002\u0010È\u0001\u001a\u00020)H\u0002¢\u0006\u0005\bÊ\u0001\u00103J\u001b\u0010Ë\u0001\u001a\u00020\u00112\b\b\u0002\u0010v\u001a\u00020)H\u0002¢\u0006\u0005\bË\u0001\u00103J$\u0010Î\u0001\u001a\u00020\u00112\u0007\u0010Ì\u0001\u001a\u00020)2\u0007\u0010Í\u0001\u001a\u00020]H\u0002¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J\u001a\u0010Ñ\u0001\u001a\u00020\u00112\u0007\u0010Ð\u0001\u001a\u00020)H\u0002¢\u0006\u0005\bÑ\u0001\u00103J\u001b\u0010Ò\u0001\u001a\u00020\u00112\u0007\u0010Í\u0001\u001a\u00020]H\u0002¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J\u0011\u0010Ô\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bÔ\u0001\u0010/J\u001a\u0010Ö\u0001\u001a\u00020\u00112\u0007\u0010Õ\u0001\u001a\u00020)H\u0002¢\u0006\u0005\bÖ\u0001\u00103J\u0019\u0010×\u0001\u001a\u00020\u00112\u0006\u0010v\u001a\u00020)H\u0002¢\u0006\u0005\b×\u0001\u00103J\u001a\u0010Ù\u0001\u001a\u00020\u00112\u0007\u0010Ø\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\bÙ\u0001\u0010\u0013J\u0011\u0010Ú\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bÚ\u0001\u0010/J\u0011\u0010Û\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bÛ\u0001\u0010/J\u001c\u0010Ý\u0001\u001a\u00020\u00112\t\b\u0002\u0010Ü\u0001\u001a\u00020)H\u0002¢\u0006\u0005\bÝ\u0001\u00103J\u0011\u0010Þ\u0001\u001a\u00020)H\u0002¢\u0006\u0005\bÞ\u0001\u00107J\u0011\u0010ß\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bß\u0001\u0010/J\u0011\u0010à\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bà\u0001\u0010/J\u0019\u0010á\u0001\u001a\u00020\u00112\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0005\bá\u0001\u0010OJ\u0011\u0010â\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bâ\u0001\u0010/J\u0011\u0010ã\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bã\u0001\u0010/J\u0011\u0010ä\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bä\u0001\u0010/J#\u0010å\u0001\u001a\u00020\u00112\u0006\u0010M\u001a\u00020L2\u0007\u0010¯\u0001\u001a\u00020sH\u0002¢\u0006\u0006\bå\u0001\u0010±\u0001J\u0011\u0010æ\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bæ\u0001\u0010/J\u0011\u0010ç\u0001\u001a\u00020)H\u0002¢\u0006\u0005\bç\u0001\u00107J\u0011\u0010è\u0001\u001a\u00020)H\u0002¢\u0006\u0005\bè\u0001\u00107J\u0011\u0010é\u0001\u001a\u00020)H\u0002¢\u0006\u0005\bé\u0001\u00107J\u0011\u0010ê\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bê\u0001\u0010/J\u0011\u0010ë\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bë\u0001\u0010/J\u001b\u0010ì\u0001\u001a\u00020\u00112\u0007\u0010¯\u0001\u001a\u00020sH\u0002¢\u0006\u0006\bì\u0001\u0010í\u0001J\u0011\u0010î\u0001\u001a\u00020)H\u0002¢\u0006\u0005\bî\u0001\u00107J\u0011\u0010ï\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bï\u0001\u0010/J\u0011\u0010ð\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bð\u0001\u0010/J\u001e\u0010ò\u0001\u001a\u0005\u0018\u00010ñ\u00012\u0007\u0010¯\u0001\u001a\u00020sH\u0002¢\u0006\u0006\bò\u0001\u0010ó\u0001J\u001e\u0010õ\u0001\u001a\u0005\u0018\u00010ô\u00012\u0007\u0010¯\u0001\u001a\u00020sH\u0002¢\u0006\u0006\bõ\u0001\u0010ö\u0001J$\u0010ø\u0001\u001a\u00030÷\u00012\u0007\u0010¯\u0001\u001a\u00020s2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0006\bø\u0001\u0010ù\u0001J\u0012\u0010ú\u0001\u001a\u00020\fH\u0002¢\u0006\u0006\bú\u0001\u0010û\u0001J\u0011\u0010ü\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bü\u0001\u0010/J\u0011\u0010ý\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bý\u0001\u0010/J\u0011\u0010þ\u0001\u001a\u00020)H\u0002¢\u0006\u0005\bþ\u0001\u00107J\u001a\u0010\u0080\u0002\u001a\u00020\u00112\u0007\u0010ÿ\u0001\u001a\u00020)H\u0002¢\u0006\u0005\b\u0080\u0002\u00103J\u001a\u0010\u0082\u0002\u001a\u00020\u00112\u0007\u0010\u0081\u0002\u001a\u00020\u000fH\u0002¢\u0006\u0005\b\u0082\u0002\u0010\u0013J!\u0010\u0084\u0002\u001a\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0083\u0002H\u0002¢\u0006\u0006\b\u0084\u0002\u0010\u0085\u0002J\u0011\u0010\u0086\u0002\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0086\u0002\u0010/J%\u0010\u008a\u0002\u001a\u00020\u00112\b\u0010\u0088\u0002\u001a\u00030\u0087\u00022\u0007\u0010\u0089\u0002\u001a\u00020\u000fH\u0002¢\u0006\u0006\b\u008a\u0002\u0010\u008b\u0002J\u0011\u0010\u008c\u0002\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u008c\u0002\u0010/J\u0011\u0010\u008d\u0002\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u008d\u0002\u0010/J\u0011\u0010\u008e\u0002\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u008e\u0002\u0010/J\u0011\u0010\u008f\u0002\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u008f\u0002\u0010/J\u0011\u0010\u0090\u0002\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0090\u0002\u0010/J&\u0010\u0093\u0002\u001a\u00020\u00112\u0007\u0010\u0091\u0002\u001a\u00020)2\t\u0010\u0092\u0002\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0006\b\u0093\u0002\u0010\u0094\u0002J(\u0010\u0097\u0002\u001a\u00020\u00112\u0007\u0010\u0095\u0002\u001a\u00020)2\u000b\b\u0002\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0006\b\u0097\u0002\u0010\u0098\u0002J\u001a\u0010\u0099\u0002\u001a\u00020\u00112\u0006\u0010~\u001a\u00020}H\u0002¢\u0006\u0006\b\u0099\u0002\u0010\u0080\u0001J\u0011\u0010\u009a\u0002\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u009a\u0002\u0010/J%\u0010\u009c\u0002\u001a\u00020\u00112\t\u0010\u009b\u0002\u001a\u0004\u0018\u00010\u000f2\u0006\u0010~\u001a\u00020}H\u0002¢\u0006\u0006\b\u009c\u0002\u0010\u009d\u0002J\u001a\u0010\u009e\u0002\u001a\u00020\u00112\u0006\u0010~\u001a\u00020}H\u0002¢\u0006\u0006\b\u009e\u0002\u0010\u0080\u0001J\u0011\u0010\u009f\u0002\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u009f\u0002\u0010/R\u0018\u0010£\u0002\u001a\u00030 \u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0002\u0010¢\u0002R*\u0010«\u0002\u001a\u00030¤\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¥\u0002\u0010¦\u0002\u001a\u0006\b§\u0002\u0010¨\u0002\"\u0006\b©\u0002\u0010ª\u0002R\u001c\u0010¯\u0002\u001a\u0005\u0018\u00010¬\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0002\u0010®\u0002R \u0010³\u0002\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b°\u0002\u0010±\u0002\u001a\u0006\b²\u0002\u0010û\u0001R\u0017\u0010µ\u0002\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0002R\u0017\u0010·\u0002\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0002\u0010´\u0002R\u0018\u0010»\u0002\u001a\u00030¸\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0002\u0010º\u0002R\u001b\u0010¾\u0002\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0002\u0010½\u0002R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0002\u0010À\u0002R\u001b\u0010Ã\u0002\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0002\u0010Â\u0002R\u0018\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0002\u0010Å\u0002R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0002\u0010Â\u0002R\u0019\u0010É\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0002\u0010È\u0002R\u0019\u0010Ë\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0002\u0010È\u0002R\u0019\u0010Í\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0002\u0010È\u0002R\u001a\u0010¢\u0001\u001a\u00030¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0002\u0010Ï\u0002R\u001a\u0010Ñ\u0002\u001a\u00030¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0002\u0010Ï\u0002R\u0019\u0010Ó\u0002\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0002\u0010´\u0002R\u0019\u0010Õ\u0002\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0002\u0010´\u0002R\u0019\u0010Ø\u0002\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0002\u0010×\u0002R\u0019\u0010Ú\u0002\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0002\u0010×\u0002R\u0019\u0010Ü\u0002\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0002\u0010×\u0002R\u001b\u0010Þ\u0002\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0002\u0010Â\u0002R\u0019\u0010à\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0002\u0010È\u0002R\u0019\u0010â\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0002\u0010È\u0002R\u0019\u0010ä\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bã\u0002\u0010È\u0002R\u0018\u00106\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0002\u0010È\u0002R\u0019\u0010ç\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0002\u0010È\u0002R\u0019\u0010é\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0002\u0010È\u0002R\u0019\u0010ë\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bê\u0002\u0010È\u0002R\u0019\u0010í\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bì\u0002\u0010È\u0002R\u0019\u0010ï\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0002\u0010È\u0002R\u0019\u0010ñ\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0002\u0010È\u0002R\u0019\u0010ó\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bò\u0002\u0010È\u0002R\u0019\u0010ô\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0002\u0010È\u0002R\u0019\u0010õ\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0002\u0010È\u0002R\u0019\u0010÷\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bö\u0002\u0010È\u0002R\u001a\u0010#\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0002\u0010Â\u0002R\u001b\u0010û\u0002\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bù\u0002\u0010ú\u0002R\u001b\u0010þ\u0002\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bü\u0002\u0010ý\u0002R\u001c\u0010\u0082\u0003\u001a\u0005\u0018\u00010ÿ\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0003\u0010\u0081\u0003R\u001c\u0010\u0084\u0003\u001a\u0005\u0018\u00010ÿ\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0003\u0010\u0081\u0003R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0003\u0010\u0086\u0003R\u001a\u0010\u008a\u0003\u001a\u00030\u0087\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0003\u0010\u0089\u0003R\u001c\u0010\u008d\u0003\u001a\u0005\u0018\u00010À\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0003\u0010\u008c\u0003R\u001c\u0010\u0090\u0003\u001a\u0005\u0018\u00010Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0003\u0010\u008f\u0003R\u001c\u0010\u0094\u0003\u001a\u0005\u0018\u00010\u0091\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0003\u0010\u0093\u0003R\u001c\u0010\u0096\u0003\u001a\u0005\u0018\u00010ÿ\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0003\u0010\u0081\u0003R\u001b\u0010\u0098\u0003\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0003\u0010ý\u0002R\u001b\u0010\u009b\u0003\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0003\u0010\u009a\u0003R\u001c\u0010\u009f\u0003\u001a\u0005\u0018\u00010\u009c\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0003\u0010\u009e\u0003R!\u0010¤\u0003\u001a\u00030 \u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¡\u0003\u0010±\u0002\u001a\u0006\b¢\u0003\u0010£\u0003R!\u0010©\u0003\u001a\u00030¥\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¦\u0003\u0010±\u0002\u001a\u0006\b§\u0003\u0010¨\u0003R\u001b\u0010«\u0003\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0002\u0010ª\u0003R\u001c\u0010®\u0003\u001a\u0005\u0018\u00010¬\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010\u00ad\u0003R\u001c\u0010²\u0003\u001a\u0005\u0018\u00010¯\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0003\u0010±\u0003R\u0018\u0010¶\u0003\u001a\u00030³\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0003\u0010µ\u0003R\u001c\u0010º\u0003\u001a\u0005\u0018\u00010·\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0003\u0010¹\u0003R\u001c\u0010¾\u0003\u001a\u0005\u0018\u00010»\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0003\u0010½\u0003R\u001c\u0010Â\u0003\u001a\u0005\u0018\u00010¿\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0003\u0010Á\u0003R\u0019\u0010Ã\u0003\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010È\u0002R\u0019\u0010Å\u0003\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0003\u0010î\u0002R!\u0010É\u0003\u001a\u00030Æ\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0090\u0002\u0010±\u0002\u001a\u0006\bÇ\u0003\u0010È\u0003R!\u0010Í\u0003\u001a\u00030Ê\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010±\u0002\u001a\u0006\bË\u0003\u0010Ì\u0003R\u001c\u0010Ð\u0003\u001a\u0005\u0018\u00010Î\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010Ï\u0003R\u001c\u0010Ô\u0003\u001a\u0005\u0018\u00010Ñ\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0003\u0010Ó\u0003R\u0019\u0010Õ\u0003\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010È\u0002R \u0010Ø\u0003\u001a\t\u0012\u0004\u0012\u00020}0Ö\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0001\u0010×\u0003R\u0019\u0010Ù\u0003\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bò\u0001\u0010È\u0002R\u0018\u0010Ú\u0003\u001a\u00030\u0087\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bõ\u0001\u0010\u0089\u0003R\u001c\u0010Ý\u0003\u001a\u0005\u0018\u00010Û\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010Ü\u0003R\u001f\u0010ß\u0003\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÆ\u0001\u0010±\u0002\u001a\u0005\bÞ\u0003\u0010_R\u001f\u0010á\u0003\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b½\u0001\u0010±\u0002\u001a\u0005\bà\u0003\u00107R\u0018\u0010ä\u0003\u001a\u00030â\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ã\u0003R6\u0010ç\u0003\u001a\u001f\u0012\u0013\u0012\u00110\u001d¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\u0011\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0003\u0010æ\u0003R\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bë\u0001\u0010×\u0003R\u0019\u0010è\u0003\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0002\u0010È\u0002R\u0019\u0010ê\u0003\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0003\u0010È\u0002R\u0019\u0010ë\u0003\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010È\u0002R\u0019\u0010ì\u0003\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010È\u0002R!\u0010ð\u0003\u001a\u00030í\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010±\u0002\u001a\u0006\bî\u0003\u0010ï\u0003R\u0019\u0010ñ\u0003\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010È\u0002R\u0018\u0010ô\u0003\u001a\u00030ò\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010ó\u0003R\u0018\u0010ø\u0003\u001a\u00030õ\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bö\u0003\u0010÷\u0003R\u0019\u0010ù\u0003\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010×\u0002R\u0018\u0010ý\u0003\u001a\u00030ú\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bû\u0003\u0010ü\u0003R\u0018\u0010\u0081\u0004\u001a\u00030þ\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÿ\u0003\u0010\u0080\u0004R\u0018\u0010\u0083\u0004\u001a\u00030ú\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0004\u0010ü\u0003R\u0019\u0010\u0085\u0004\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0004\u0010È\u0002R#\u0010\u008a\u0004\u001a\u0005\u0018\u00010\u0086\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0087\u0004\u0010±\u0002\u001a\u0006\b\u0088\u0004\u0010\u0089\u0004¨\u0006\u008c\u0004"}, m97100d2 = {"Lcom/transsion/player/longvideo/ui/LongVodPlayerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Ljo/a;", "Lcom/transsion/baselib/report/k$a;", "Lcom/transsion/ad/strategy/b$a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "genre", "", "initAdHelper", "(Ljava/lang/String;)V", "pageName", "Lcom/transsion/player/longvideo/constants/LongVodPageType;", "pageType", "tag", "Landroid/widget/FrameLayout;", "fullscreenContainer", "Landroid/view/ViewGroup;", "subtitleSyncView", "", "Lcom/transsion/moviedetailapi/bean/DubsInfo;", "dubs", "Lcom/transsion/player/longvideo/constants/LongVodContentType;", "contentType", "init", "(Ljava/lang/String;Lcom/transsion/player/longvideo/constants/LongVodPageType;Ljava/lang/String;Landroid/widget/FrameLayout;Landroid/view/ViewGroup;Ljava/util/List;Lcom/transsion/player/longvideo/constants/LongVodContentType;)V", "fragmentId", "setFragmentId", "Lcom/transsion/ad/monopoly/model/AdPlans;", "adPlan", "onAdClick", "(Lcom/transsion/ad/monopoly/model/AdPlans;)V", "", "needFinish", "showBackAd", "backClick", "(ZZ)V", "replay", "()V", "showReplay", "fastHide", "hideBottomController", "(Z)V", "isInPipMode", "onPipModeChanged", "isPressedPause", "()Z", "ugcAutoPause2PlayVideo", "parentVideoId", "trackId", "previousTrackId", "updateReportId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "visible", "setFeedBackVisible", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "info", "callback", "setAudioSelectCallback", "(Lkotlin/jvm/functions/Function1;)V", "isBackground", "onBackgroundStatusChange", "Ljo/a$b;", "setCallback", "(Ljo/a$b;)V", "Lko/a;", "bean", "setDataSource", "(Lko/a;)V", "from", "setMusicLikedFragment", "onViewResume", "onViewPause", "onHandlePause", "onHandlePlay", "onSaveHistory", "release", "onAttachedToWindow", "onDetachedFromWindow", "onPageDestroy", "reset", "onBackPressed", "", "currentPosition", "()J", "showNoNetError", "removeNoNetError", "hasNext", "hasNextEpisode", "", "speed", "setSpeed", "(F)V", "Lcom/transsion/player/orplayer/g;", "getPlayer", "()Lcom/transsion/player/orplayer/g;", "Lcom/transsion/player/ui/ORPlayerView;", "getPlayerView", "()Lcom/transsion/player/ui/ORPlayerView;", "Lcom/avery/subtitle/widget/SimpleSubtitleView;", "getSubtitleView", "()Lcom/avery/subtitle/widget/SimpleSubtitleView;", "getSubtitleViewGroup", "()Landroid/view/ViewGroup;", "Lko/c;", "getPlayingStream", "()Lko/c;", PushConstants.PUSH_SERVICE_TYPE_SHOW, "setFloatIsShow", "orPlayer", "playerView", "floatBack2ExitPage", "(Lcom/transsion/player/orplayer/g;Lcom/transsion/player/ui/ORPlayerView;)V", "exitFullScreen", "Lko/b;", XLogUtil.TAG, "onResolutionTipFailedFromDialog", "(Lko/b;)V", "onResolutionTipFailedFromMemberTipView", "showResolutionIntercept", "openResolutionPanel", "Lcom/transsion/memberapi/MemberCheckResult;", "memberCheckResult", "closeResolutionPanel", "(Lko/b;Lcom/transsion/memberapi/MemberCheckResult;)V", "getClassTag", "()Ljava/lang/String;", "l0", "F0", "j1", "c1", "(Ljava/lang/String;Lko/a;)V", "videoPlaying", "G2", "H0", "g1", "(Landroid/view/ViewGroup;)V", "I2", "G0", "J0", "E1", "w1", "o0", "d1", "Lcom/tn/lib/view/SecondariesSeekBar;", "seekBarView", "e1", "(Lcom/tn/lib/view/SecondariesSeekBar;)V", "r0", KaManager.NOTIFICATION_GROUP_FULLSCREEN, "Lcom/transsion/player/longvideo/ui/LongVodUiType;", "curUiType", "g2", "(ZLcom/transsion/player/longvideo/ui/LongVodUiType;)V", "U1", "keepScreenOn", "u1", "y1", "y0", "C2", "E0", "s1", "v0", "f1", "playStream", "b1", "(Lko/a;Lko/c;)V", "Landroid/view/MotionEvent;", "e", "isDoubleClick", "M2", "(Landroid/view/MotionEvent;Z)V", "G1", "b2", "selectedBean", "z1", "F1", "o1", "x0", ToolBar.FORWARD, "p0", "Lcom/transsion/player/longvideo/helper/i;", "getLocalVideoLandForwardViewControl", "()Lcom/transsion/player/longvideo/helper/i;", "Lcom/transsion/postdetail/layer/local/q1;", "getLocalVideoMiddleForwardViewControl", "()Lcom/transsion/postdetail/layer/local/q1;", "w0", "O2", "autoHide", "f0", "k2", "v2", "isSeek", NotificationCompat.CATEGORY_PROGRESS, "H2", "(ZJ)V", "vis", "v1", "J2", "(J)V", "D0", "playing", "setPauseViewStatus", "A2", "content", "z2", "i1", "V1", "isNoNet", "n2", "p1", "T1", "R1", "K2", "i2", "P1", "F2", "Y1", "h2", "t1", "q1", "r1", "m2", "A0", "setPlayerDataSourceAdPrepare", "(Lko/c;)V", "t2", "O1", "Z1", "Lcom/transsion/player/mediasession/MediaItem;", "t0", "(Lko/c;)Lcom/transsion/player/mediasession/MediaItem;", "Landroid/app/PendingIntent;", "u0", "(Lko/c;)Landroid/app/PendingIntent;", "Landroid/content/Intent;", "s0", "(Lko/c;Ljava/lang/String;)Landroid/content/Intent;", "getPendingIntentFlag", "()I", "e2", "a2", "n1", "isPortrait", "e0", NativeComponentConstants.KEY_COMPONENT_TYPE, "X1", "", "getReportNextMap", "()Ljava/util/Map;", "W1", "Lcom/transsion/player/enum/ScaleMode;", "scaleMode", "scaleModeName", "P2", "(Lcom/transsion/player/enum/ScaleMode;Ljava/lang/String;)V", "S1", "Q1", "C1", "D1", "n0", "hasAtLeast720P", "target", "y2", "(ZLjava/lang/Integer;)V", "isShow", NotificationCompat.CATEGORY_MESSAGE, "u2", "(ZLjava/lang/String;)V", "E2", "B0", "skuId", "K1", "(Ljava/lang/String;Lko/b;)V", "s2", "j2", "Llo/j;", "a", "Llo/j;", "viewBinding", "Lcom/transsion/player/longvideo/ui/dialog/LongVodPlayerViewAdHelper;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/player/longvideo/ui/dialog/LongVodPlayerViewAdHelper;", "getLongVodPlayerViewAdHelper", "()Lcom/transsion/player/longvideo/ui/dialog/LongVodPlayerViewAdHelper;", "setLongVodPlayerViewAdHelper", "(Lcom/transsion/player/longvideo/ui/dialog/LongVodPlayerViewAdHelper;)V", "longVodPlayerViewAdHelper", "Landroid/animation/ValueAnimator;", "c", "Landroid/animation/ValueAnimator;", "resolutionPanelAnimator", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lkotlin/Lazy;", "getResolutionPanelTargetWidth", "resolutionPanelTargetWidth", "I", "screenWidth", "f", "screenHeight", "Lcom/transsion/player/ui/longvideo/a;", "g", "Lcom/transsion/player/ui/longvideo/a;", "playerControl", "h", "Landroid/view/ViewGroup;", "playerViewParent", "i", "Lcom/transsion/player/longvideo/constants/LongVodPageType;", "j", "Ljava/lang/String;", "playerTag", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/player/longvideo/constants/LongVodContentType;", "l", "m", "Z", "isFloatPlaying", "n", "isUGCPlay", "o", "isUGCPauseShowing", TtmlNode.TAG_P, "Lcom/transsion/player/longvideo/ui/LongVodUiType;", CampaignEx.JSON_KEY_AD_Q, "curUiRotation", CampaignEx.JSON_KEY_AD_R, "videoHeight", "s", "videoWidth", "t", "J", "totalDuration", TmcStartParams.KEY_URL_SHORT, "playProgress", "v", "pressSeekProgress", "w", "subSelectId", "x", "showToolbarAlways", "y", "isShowLoading", "z", "isSeeking", "A", "B", "formUserSeek", "C", "isReload", "D", "isMobilePaused", "E", "isPageResumed", "F", "isHasNext", "G", "isMultipleResChangeResolution", "H", "isNewPlayer", "isFloatShow", "isMultiplePlayer", "K", "isPrepared", "L", "M", "Lko/a;", "curBean", "N", "Lko/c;", "curPlayStream", "Landroid/view/View;", "O", "Landroid/view/View;", "errorLayout", "P", "replayLayout", "Q", "Landroid/widget/FrameLayout;", "Landroid/os/Handler;", "R", "Landroid/os/Handler;", "handler", "S", "Lcom/transsion/player/longvideo/helper/i;", "localVideoLandForwardViewControl", "T", "Lcom/transsion/postdetail/layer/local/q1;", "localVideoMiddleForwardViewControl", "Lcom/transsion/postdetail/layer/local/j1;", "U", "Lcom/transsion/postdetail/layer/local/j1;", "localToastControl", "V", "toastLayout", "W", "playingStream", "a0", "Lcom/transsion/player/ui/ORPlayerView;", "orPlayerView", "Lcom/transsion/postdetail/layer/local/c0;", "b0", "Lcom/transsion/postdetail/layer/local/c0;", "videoDot", "Lcom/transsion/baselib/db/video/VideoDetailPlayDao;", "c0", "getVideoDetailPlayDao", "()Lcom/transsion/baselib/db/video/VideoDetailPlayDao;", "videoDetailPlayDao", "Lcom/transsion/baselib/db/video/UGCVideoDetailPlayDao;", "d0", "getUgcVideoDetailPlayDao", "()Lcom/transsion/baselib/db/video/UGCVideoDetailPlayDao;", "ugcVideoDetailPlayDao", "Ljo/a$b;", "playerCallback", "Lcom/transsion/player/longvideo/helper/LongVodSubtitleHelper;", "Lcom/transsion/player/longvideo/helper/LongVodSubtitleHelper;", "subtitleHelper", "Lcom/transsion/player/longvideo/helper/j;", "g0", "Lcom/transsion/player/longvideo/helper/j;", "spaceHelper", "Lcom/transsion/player/longvideo/helper/LongVodResolutionHelper;", "h0", "Lcom/transsion/player/longvideo/helper/LongVodResolutionHelper;", "resolutionHelper", "Lcom/transsion/player/longvideo/helper/g;", "i0", "Lcom/transsion/player/longvideo/helper/g;", "gameResHelper", "Lcom/transsion/player/longvideo/helper/u;", "j0", "Lcom/transsion/player/longvideo/helper/u;", "mobileDataHelper", "Lcom/transsion/player/longvideo/helper/c;", "k0", "Lcom/transsion/player/longvideo/helper/c;", "adHelper", "isCompletionBlock", "m0", "resumeSpeed", "Lcom/transsion/player/longvideo/ui/dialog/a;", "getConfigViewModel", "()Lcom/transsion/player/longvideo/ui/dialog/a;", "configViewModel", "Lcom/transsion/postdetail/ui/dialog/o;", "getSpeedViewModel", "()Lcom/transsion/postdetail/ui/dialog/o;", "speedViewModel", "Lpo/d;", "Lpo/d;", "dashVideoTracksGroup", "Lpo/b;", "q0", "Lpo/b;", "curVideoFormat", "isFirstSetTracks", "", "Ljava/util/List;", "resolutionList", "hideFloat", "playTimeoutHandler", "Lfo/e;", "Lfo/e;", "curTimeoutMediaSource", "getPlayTimeoutStream", "playTimeoutStream", "getPkStyle", "pkStyle", "Lkotlinx/coroutines/n0;", "Lkotlinx/coroutines/n0;", "coroutineScopeIO", "z0", "Lkotlin/jvm/functions/Function1;", "audioSelectCallback", "isAdShowing", "C0", "isRewardUnlock", "isRewardInterceptShowing", "canNonSubscriberPlay", "Lcom/transsion/baselib/helper/ScreenRotationHelper;", "getScreenHelper", "()Lcom/transsion/baselib/helper/ScreenRotationHelper;", "screenHelper", "isPreparedInterceptPlay", "com/transsion/player/longvideo/ui/LongVodPlayerView$c", "Lcom/transsion/player/longvideo/ui/LongVodPlayerView$c;", "bandwidthRedundancyListener", "com/transsion/player/longvideo/ui/LongVodPlayerView$l", "I0", "Lcom/transsion/player/longvideo/ui/LongVodPlayerView$l;", "playerListener", "pressTime", "Ljava/lang/Runnable;", "K0", "Ljava/lang/Runnable;", "runnable", "com/transsion/player/longvideo/ui/LongVodPlayerView$i", "L0", "Lcom/transsion/player/longvideo/ui/LongVodPlayerView$i;", "netListener", "M0", "playTimeoutRunnable", "N0", "isMusicLikedFragment", "Lcom/transsion/postdetail/util/n;", "O0", "getOrientationEventListener", "()Lcom/transsion/postdetail/util/n;", "orientationEventListener", "Companion", "LongVideo_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class LongVodPlayerView extends ConstraintLayout implements InterfaceC24450a, C14492k.a, C14057b.a {
    public static final String PK_NEW_PLAYER_UI_KEY = "pk_player_ui_key";
    public static final String TAG = "LongVodPlayerView";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean isPressedPause;

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    private List dubs;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean formUserSeek;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    private boolean isAdShowing;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean isReload;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    private boolean isRewardUnlock;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private boolean isMobilePaused;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    private boolean isRewardInterceptShowing;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean isPageResumed;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    private boolean canNonSubscriberPlay;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean isHasNext;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private final Lazy screenHelper;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private boolean isMultipleResChangeResolution;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private boolean isPreparedInterceptPlay;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean isNewPlayer;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private final C16506c bandwidthRedundancyListener;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean isFloatShow;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private final C16515l playerListener;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private boolean isMultiplePlayer;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private long pressTime;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private boolean isPrepared;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private final Runnable runnable;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private String fragmentId;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private final C16512i netListener;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private C24715a curBean;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private final Runnable playTimeoutRunnable;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private C24717c curPlayStream;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    private boolean isMusicLikedFragment;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private View errorLayout;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    private final Lazy orientationEventListener;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private View replayLayout;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private FrameLayout fullscreenContainer;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private Handler handler;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private C16453i localVideoLandForwardViewControl;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private C16834q1 localVideoMiddleForwardViewControl;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private C16813j1 localToastControl;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private View toastLayout;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private C24717c playingStream;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C25661j viewBinding;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private ORPlayerView orPlayerView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private LongVodPlayerViewAdHelper longVodPlayerViewAdHelper;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private C16791c0 videoDot;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private ValueAnimator resolutionPanelAnimator;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private final Lazy videoDetailPlayDao;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy resolutionPanelTargetWidth;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private final Lazy ugcVideoDetailPlayDao;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int screenWidth;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    private InterfaceC24450a.b playerCallback;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int screenHeight;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    private LongVodSubtitleHelper subtitleHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC16676a playerControl;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    private C16455j spaceHelper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private ViewGroup playerViewParent;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    private final LongVodResolutionHelper resolutionHelper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private LongVodPageType pageType;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    private C16449g gameResHelper;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String playerTag;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    private C16471u mobileDataHelper;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private LongVodContentType contentType;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    private C16441c adHelper;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String pageName;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    private boolean isCompletionBlock;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean isFloatPlaying;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    private float resumeSpeed;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isUGCPlay;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    private final Lazy configViewModel;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean isUGCPauseShowing;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    private final Lazy speedViewModel;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private LongVodUiType curUiType;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    private C26907d dashVideoTracksGroup;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private LongVodUiType curUiRotation;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    private C26905b curVideoFormat;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private int videoHeight;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    private boolean isFirstSetTracks;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private int videoWidth;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    private List resolutionList;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private long totalDuration;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    private boolean hideFloat;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private long playProgress;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    private final Handler playTimeoutHandler;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private long pressSeekProgress;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    private C23403e curTimeoutMediaSource;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private String subSelectId;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    private final Lazy playTimeoutStream;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean showToolbarAlways;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    private final Lazy pkStyle;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean isShowLoading;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    private final InterfaceC25149n0 coroutineScopeIO;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private boolean isSeeking;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    private Function1 audioSelectCallback;

    /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.LongVodPlayerView$b */
    public /* synthetic */ class C16505b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55725a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f55726b;

        static {
            int[] iArr = new int[LongVodPlayerConfigType.values().length];
            try {
                iArr[LongVodPlayerConfigType.BITRATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LongVodPlayerConfigType.SPEED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f55725a = iArr;
            int[] iArr2 = new int[LongVodContentType.values().length];
            try {
                iArr2[LongVodContentType.SUBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[LongVodContentType.UGC_VIDEO_LOCAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[LongVodContentType.UGC_VIDEO_ONLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f55726b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.LongVodPlayerView$c */
    public static final class C16506c implements InterfaceC16632e {
        C16506c() {
        }

        @Override // com.transsion.player.orplayer.InterfaceC16632e
        /* JADX INFO: renamed from: a */
        public void mo72132a(Double d11, long j11, long j12, Double d12) {
            boolean zM102143i = C26053g0.f79567a.m102143i();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onBandwidthRedundancyRate LongVodView:isBandwidthRedundancyRateOn:");
            sb2.append(zM102143i);
            if (zM102143i) {
                C16791c0 c16791c0 = LongVodPlayerView.this.videoDot;
                if (c16791c0 != null) {
                    c16791c0.m73435h(d11, j11, j12, d12);
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("onBandwidthRedundancyRate LongVodView: redundancyRate:");
                sb3.append(d11);
                sb3.append("，totalDownloadBytesAll : ");
                sb3.append(j11);
                sb3.append("，consumed:");
                sb3.append(j12);
                sb3.append(",poolPercent:");
                sb3.append(d12);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.LongVodPlayerView$d */
    public static final class C16507d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CustomRoundCornerLayout f55728a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ LongVodPlayerView f55729b;

        C16507d(CustomRoundCornerLayout customRoundCornerLayout, LongVodPlayerView longVodPlayerView) {
            this.f55728a = customRoundCornerLayout;
            this.f55729b = longVodPlayerView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.m97802h(animation, "animation");
            this.f55728a.setVisibility(8);
            this.f55728a.getLayoutParams().width = this.f55729b.getResolutionPanelTargetWidth();
            this.f55728a.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.LongVodPlayerView$e */
    public static final class C16508e implements InterfaceC15742a {
        C16508e() {
        }

        @Override // com.transsion.mbwidget.guide.InterfaceC15742a
        /* JADX INFO: renamed from: a */
        public void mo69734a() {
            C26866a.a.m104898f(C26866a.f81698a, "VideoFloat-pip", "DeskWidget，show stop auto pip", false, 4, null);
            LongVodPlayerView.this.m71968G2(false);
        }

        @Override // com.transsion.mbwidget.guide.InterfaceC15742a
        public void onDismiss() {
            LongVodPlayerView longVodPlayerView = LongVodPlayerView.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                if (longVodPlayerView.playerControl.isPlaying()) {
                    C26866a.a.m104898f(C26866a.f81698a, "VideoFloat-pip", "DeskWidget，dismiss resume auto pip", false, 4, null);
                    longVodPlayerView.m71968G2(true);
                }
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.LongVodPlayerView$f */
    public static final class C16509f implements InterfaceC16676a.b {

        /* JADX INFO: renamed from: a */
        private long f55731a;

        /* JADX INFO: renamed from: b */
        private float f55732b;

        /* JADX INFO: renamed from: c */
        private boolean f55733c;

        /* JADX INFO: renamed from: d */
        private long f55734d;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ boolean f55736f;

        C16509f(boolean z11) {
            this.f55736f = z11;
        }

        @Override // com.transsion.player.p303ui.longvideo.InterfaceC16676a.b
        /* JADX INFO: renamed from: a */
        public void mo72133a() {
            LongVodPlayerView.this.m71959E1();
        }

        @Override // com.transsion.player.p303ui.longvideo.InterfaceC16676a.b
        /* JADX INFO: renamed from: b */
        public void mo72134b(float f11, float f12) {
            if (!this.f55733c) {
                this.f55734d = LongVodPlayerView.this.viewBinding.f77908o.f77946t.getCurrentProgress();
                LongVodPlayerView.this.m72071k2(false);
            }
            LongVodPlayerView.this.formUserSeek = true;
            this.f55733c = true;
            LongVodPlayerView.this.handler.removeCallbacks(LongVodPlayerView.this.runnable);
            long j11 = (long) (this.f55734d + (((this.f55736f ? f11 - f12 : f12 - f11) * LongVodPlayerView.this.totalDuration) / ((LongVodPlayerView.this.curUiType == LongVodUiType.LAND ? LongVodPlayerView.this.screenHeight : LongVodPlayerView.this.screenWidth) * 4)));
            if (j11 < 0) {
                j11 = 0;
            } else if (j11 > LongVodPlayerView.this.totalDuration) {
                j11 = LongVodPlayerView.this.totalDuration;
            }
            LongVodPlayerView.this.viewBinding.f77908o.f77946t.setProgress(j11);
            LongVodPlayerView.this.viewBinding.f77909p.f77966n.setProgress(j11);
            this.f55732b = (j11 * 1.0f) / LongVodPlayerView.this.totalDuration;
            long j12 = (long) (LongVodPlayerView.this.totalDuration * this.f55732b);
            this.f55731a = j12;
            LongVodPlayerView.this.m71972H2(true, j12);
        }

        @Override // com.transsion.player.p303ui.longvideo.InterfaceC16676a.b
        /* JADX INFO: renamed from: c */
        public void mo72135c() {
            if (this.f55733c) {
                LongVodPlayerView.this.playerControl.seekTo(this.f55731a);
                if (!LongVodPlayerView.this.playerControl.isPlaying() && !LongVodPlayerView.this.m72090p1()) {
                    if (LongVodPlayerView.this.m72102s1()) {
                        LongVodPlayerView.this.m71952C2();
                    } else {
                        LongVodPlayerView.this.playerControl.play();
                    }
                }
                C16791c0 c16791c0 = LongVodPlayerView.this.videoDot;
                if (c16791c0 != null) {
                    c16791c0.m73444q();
                }
                LongVodPlayerView.this.m71972H2(false, 0L);
                LongVodPlayerView.this.hideBottomController(false);
            }
            LongVodPlayerView.this.formUserSeek = false;
            this.f55733c = false;
            LongVodPlayerView.this.m72085o0();
        }

        @Override // com.transsion.player.p303ui.longvideo.InterfaceC16676a.b
        public void onDoubleTap(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            if (LongVodPlayerView.this.viewBinding.f77908o.f77938l.isSelected()) {
                return;
            }
            C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "onDoubleTap ", false, 4, null);
            LongVodPlayerView.this.m71992M2(e11, true);
        }

        @Override // com.transsion.player.p303ui.longvideo.InterfaceC16676a.b
        public void onLongPress(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            LongVodPlayerView.this.m72118w1();
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.LongVodPlayerView$g */
    public static final class C16510g implements InterfaceC13776s {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Ref.LongRef f55738b;

        C16510g(Ref.LongRef longRef) {
            this.f55738b = longRef;
        }

        @Override // com.p282tn.lib.view.InterfaceC13776s
        /* JADX INFO: renamed from: a */
        public void mo62236a(SecondariesSeekBar seekBar) {
            Intrinsics.m97802h(seekBar, "seekBar");
            C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "onStopTrackingTouch targetProgress:" + this.f55738b.element + " ", false, 4, null);
            LongVodPlayerView.this.formUserSeek = false;
            LongVodPlayerView.this.playerControl.seekTo(this.f55738b.element);
            if (!LongVodPlayerView.this.playerControl.isPlaying() && !LongVodPlayerView.this.m72090p1()) {
                LongVodPlayerView.this.playerControl.play();
            }
            C16791c0 c16791c0 = LongVodPlayerView.this.videoDot;
            if (c16791c0 != null) {
                c16791c0.m73444q();
            }
            LongVodPlayerView.this.m71972H2(false, 0L);
            LongVodPlayerView.this.hideBottomController(false);
        }

        @Override // com.p282tn.lib.view.InterfaceC13776s
        /* JADX INFO: renamed from: b */
        public void mo62237b(SecondariesSeekBar seekBar, long j11, boolean z11) {
            View view;
            Intrinsics.m97802h(seekBar, "seekBar");
            if (z11) {
                View view2 = LongVodPlayerView.this.replayLayout;
                if (view2 != null && AbstractC26006c.m102056i(view2) && (view = LongVodPlayerView.this.replayLayout) != null) {
                    AbstractC26006c.m102054g(view);
                }
                if (LongVodPlayerView.this.m72102s1()) {
                    LongVodPlayerView.this.m71952C2();
                }
                LongVodPlayerView.this.formUserSeek = true;
                LongVodPlayerView.this.handler.removeCallbacks(LongVodPlayerView.this.runnable);
                if (LongVodPlayerView.this.totalDuration > 0) {
                    this.f55738b.element = (long) (LongVodPlayerView.this.totalDuration * (j11 / LongVodPlayerView.this.totalDuration));
                }
                LongVodPlayerView.this.m71972H2(true, this.f55738b.element);
            }
        }

        @Override // com.p282tn.lib.view.InterfaceC13776s
        /* JADX INFO: renamed from: c */
        public void mo62238c(SecondariesSeekBar seekBar) {
            Intrinsics.m97802h(seekBar, "seekBar");
            C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "onStartTrackingTouch ", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.LongVodPlayerView$h */
    public static final class C16511h implements InterfaceC16473w {
        C16511h() {
        }

        @Override // com.transsion.player.longvideo.helper.InterfaceC16473w
        /* JADX INFO: renamed from: b */
        public void mo71857b(boolean z11, boolean z12) {
            LongVodPlayerView.this.m72050f0(z11, z12);
        }

        @Override // com.transsion.player.longvideo.helper.InterfaceC16473w
        /* JADX INFO: renamed from: c */
        public void mo71858c(String text) {
            Intrinsics.m97802h(text, "text");
            LongVodPlayerView.this.m72131z2(text);
        }

        @Override // com.transsion.player.longvideo.helper.InterfaceC16473w
        /* JADX INFO: renamed from: d */
        public void mo71859d(String str, String str2) {
            C16791c0 c16791c0 = LongVodPlayerView.this.videoDot;
            if (c16791c0 != null) {
                c16791c0.m73447t(str, str2);
            }
        }

        @Override // com.transsion.player.longvideo.helper.InterfaceC16473w
        /* JADX INFO: renamed from: e */
        public void mo71860e(List list) {
            Intrinsics.m97802h(list, "list");
            C16791c0 c16791c0 = LongVodPlayerView.this.videoDot;
            if (c16791c0 != null) {
                c16791c0.m73445r(list);
            }
        }

        @Override // com.transsion.player.longvideo.helper.InterfaceC16473w
        /* JADX INFO: renamed from: f */
        public void mo71861f(String str) {
            LongVodPlayerView.this.subSelectId = str;
            C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "onSetSelectId, selectId:" + str + " ", false, 4, null);
        }

        @Override // com.transsion.player.longvideo.helper.InterfaceC16473w
        /* JADX INFO: renamed from: g */
        public void mo71862g(String name, String lan, int i11) {
            Intrinsics.m97802h(name, "name");
            Intrinsics.m97802h(lan, "lan");
            C16791c0 c16791c0 = LongVodPlayerView.this.videoDot;
            if (c16791c0 != null) {
                c16791c0.m73446s(name, lan, i11);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.LongVodPlayerView$i */
    public static final class C16512i implements InterfaceC27288n {
        C16512i() {
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected() {
            InterfaceC27288n.a.m106338a(this);
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
            Intrinsics.m97802h(network, "network");
            Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
            LongVodPlayerView.this.m72016T1();
            C26866a.a aVar = C26866a.f81698a;
            C26866a.a.m104898f(aVar, LongVodPlayerView.TAG, "onConnected ", false, 4, null);
            if (!LongVodPlayerView.this.isPressedPause && C27287m.f83003a.m106330e() && LongVodPlayerView.this.isPageResumed) {
                aVar.m104912c(LongVodPlayerView.TAG, "onConnected, isPrepared:" + LongVodPlayerView.this.isPrepared + " ", true);
                if (LongVodPlayerView.this.isPrepared) {
                    aVar.m104912c(LongVodPlayerView.TAG, "onConnected play", true);
                    LongVodPlayerView.this.playerControl.play();
                } else {
                    C24717c c24717c = LongVodPlayerView.this.curPlayStream;
                    if (c24717c != null) {
                        LongVodPlayerView longVodPlayerView = LongVodPlayerView.this;
                        aVar.m104912c(LongVodPlayerView.TAG, "onConnected setPlayerDataSourceAdPrepare", true);
                        longVodPlayerView.setPlayerDataSourceAdPrepare(c24717c);
                    }
                }
            }
            LongVodSubtitleHelper longVodSubtitleHelper = LongVodPlayerView.this.subtitleHelper;
            if (longVodSubtitleHelper != null) {
                longVodSubtitleHelper.m71774S();
            }
        }

        @Override // p743rh.InterfaceC27288n
        public void onDisconnected() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.LongVodPlayerView$j */
    public static final class C16513j implements InterfaceC22789e {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C24716b f55742b;

        C16513j(C24716b c24716b) {
            this.f55742b = c24716b;
        }

        @Override // cy.InterfaceC22789e
        /* JADX INFO: renamed from: a */
        public void mo71869a(boolean z11) {
            if (z11) {
                LongVodPlayerView.this.getConfigViewModel().m72330c(this.f55742b);
            }
            LongVodPlayerView.this.playerControl.play();
            C27089h.f82174a.m105449a(LongVodPlayerView.this.getClassTag() + " --> onResolutionTipFailedFromDialog() --> 继续播放");
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.LongVodPlayerView$k */
    public static final class C16514k implements InterfaceC22789e {
        C16514k() {
        }

        @Override // cy.InterfaceC22789e
        /* JADX INFO: renamed from: a */
        public void mo71869a(boolean z11) {
            if (z11) {
                LongVodPlayerView.this.viewBinding.f77908o.f77944r.onShowComplete();
                C24716b c24716bM71932h = C16503r.f55634a.m71932h(LongVodPlayerView.this.resolutionList);
                if (c24716bM71932h != null) {
                    LongVodPlayerView.this.getConfigViewModel().m72330c(c24716bM71932h);
                    C27089h.f82174a.m105449a(LongVodPlayerView.this.getClassTag() + " --> onResolutionTipFailedFromMemberTipView() --> 自动播放最高分辨率 --> maxResolution = " + c24716bM71932h.m97074d());
                }
            }
            LongVodPlayerView.this.playerControl.play();
            C27089h.f82174a.m105449a(LongVodPlayerView.this.getClassTag() + " --> onResolutionTipFailedFromMemberTipView() --> 继续播放");
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.LongVodPlayerView$l */
    public static final class C16515l implements InterfaceC16633f {
        C16515l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static final Unit m72142g(LongVodPlayerView longVodPlayerView) {
            InterfaceC24450a.b bVar = longVodPlayerView.playerCallback;
            if (bVar != null) {
                bVar.onCompletion();
            }
            if (longVodPlayerView.pageType == LongVodPageType.TRAILER) {
                longVodPlayerView.m72079m2();
                longVodPlayerView.showReplay();
            }
            return Unit.f75682a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final Unit m72143h(LongVodPlayerView longVodPlayerView) {
            longVodPlayerView.playerControl.play();
            return Unit.f75682a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final Unit m72144i(final LongVodPlayerView longVodPlayerView) {
            String strM97077a;
            C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "---> showStartAd end", false, 4, null);
            if (longVodPlayerView.contentType == LongVodContentType.UGC_VIDEO_LOCAL) {
                longVodPlayerView.m72126y1();
                return Unit.f75682a;
            }
            if (longVodPlayerView.totalDuration == 0) {
                C24717c c24717c = longVodPlayerView.playingStream;
                if (c24717c != null && (strM97077a = c24717c.m97077a()) != null) {
                    Long.parseLong(strM97077a);
                }
            } else {
                long unused = longVodPlayerView.totalDuration;
            }
            longVodPlayerView.getLongVodPlayerViewAdHelper().m72299F3(new Function0() { // from class: com.transsion.player.longvideo.ui.a1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LongVodPlayerView.C16515l.m72145j(longVodPlayerView);
                }
            }, new Function0() { // from class: com.transsion.player.longvideo.ui.b1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LongVodPlayerView.C16515l.m72146k(longVodPlayerView);
                }
            }, new Function1() { // from class: com.transsion.player.longvideo.ui.c1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LongVodPlayerView.C16515l.m72147l(longVodPlayerView, ((Boolean) obj).booleanValue());
                }
            });
            return Unit.f75682a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final Unit m72145j(LongVodPlayerView longVodPlayerView) {
            C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "-----> checkShowRewardIntercept end", false, 4, null);
            longVodPlayerView.m72126y1();
            return Unit.f75682a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public static final Unit m72146k(LongVodPlayerView longVodPlayerView) {
            View orLongVodPlayerBg = longVodPlayerView.viewBinding.f77913t;
            Intrinsics.m97801g(orLongVodPlayerBg, "orLongVodPlayerBg");
            AbstractC26006c.m102054g(orLongVodPlayerBg);
            longVodPlayerView.m71951C1();
            return Unit.f75682a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: l */
        public static final Unit m72147l(LongVodPlayerView longVodPlayerView, boolean z11) {
            C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "-----> checkShowInterpolateAd --> onRewardUnlock prepareIntercept:" + z11, false, 4, null);
            longVodPlayerView.m71955D1();
            longVodPlayerView.m72126y1();
            return Unit.f75682a;
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d dashVideoTracksGroup) {
            Intrinsics.m97802h(dashVideoTracksGroup, "dashVideoTracksGroup");
            InterfaceC16633f.a.m72423a(this, z11, i11, i12, dashVideoTracksGroup);
            C27089h.f82174a.m105449a(LongVodPlayerView.this.getClassTag() + " --> canNonSubscriberPlay() -->  非会员可以播放 = " + z11 + " --> canNonSubscriberPlay = " + z11 + "可以播放的分辨率是 = " + i11 + "可以播放的index是 = " + i12 + "可以播放的group是 = " + dashVideoTracksGroup);
            LongVodPlayerView.this.canNonSubscriberPlay = z11;
            LongVodPlayerView.this.m72111u2(z11 ^ true, "canNonSubscriberPlay(播放器回调)");
            if (i12 >= 0) {
                LongVodPlayerView.this.playerControl.changeTrackSelection(dashVideoTracksGroup, i12);
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void initPlayer() {
            InterfaceC16633f.a.m72424b(this);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onAliyunDecodeErrorChangeSoftwareDecoder(C23403e c23403e) {
            C16791c0 c16791c0 = LongVodPlayerView.this.videoDot;
            if (c16791c0 != null) {
                c16791c0.m73452z(true);
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onBufferedPosition(long j11, C23403e c23403e) {
            InterfaceC16633f.a.m72426d(this, j11, c23403e);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onCompletion(C23403e c23403e) {
            LongVodPlayerView.this.m71968G2(false);
            LongVodPlayerView.this.m71944A2(false);
            LongVodPlayerView.this.setPauseViewStatus(false);
            InterfaceC16633f.a.m72448z(this, LongVodPlayerView.this.totalDuration, null, 2, null);
            C16791c0 c16791c0 = LongVodPlayerView.this.videoDot;
            if (c16791c0 != null) {
                c16791c0.m73436i();
            }
            C26866a.f81698a.m104912c(LongVodPlayerView.TAG, "onCompletion", true);
            LongVodPlayerViewAdHelper longVodPlayerViewAdHelper = LongVodPlayerView.this.getLongVodPlayerViewAdHelper();
            final LongVodPlayerView longVodPlayerView = LongVodPlayerView.this;
            longVodPlayerViewAdHelper.m72317l4(new Function0() { // from class: com.transsion.player.longvideo.ui.x0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LongVodPlayerView.C16515l.m72142g(longVodPlayerView);
                }
            });
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onFocusChange(boolean z11) {
            InterfaceC16633f.a.m72429g(this, z11);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onIsPlayingChanged(boolean z11) {
            LongVodSubtitleHelper longVodSubtitleHelper = LongVodPlayerView.this.subtitleHelper;
            if (longVodSubtitleHelper != null) {
                longVodSubtitleHelper.m71780e0(z11);
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onLoadingBegin(C23403e c23403e) {
            C24717c c24717c;
            LongVodPlayerView.this.showToolbarAlways = false;
            C16791c0 c16791c0 = LongVodPlayerView.this.videoDot;
            if (c16791c0 != null) {
                c16791c0.m73437j();
            }
            if (C27287m.f83003a.m106330e() || (c24717c = LongVodPlayerView.this.curPlayStream) == null || !c24717c.m97086j()) {
                LongVodPlayerView.this.m72016T1();
                LongVodPlayerView.this.m71944A2(true);
            } else {
                C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "onLoadingBegin， not net----", false, 4, null);
                LongVodPlayerView.m72087o2(LongVodPlayerView.this, false, 1, null);
            }
            C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "onLoadingBegin", false, 4, null);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onLoadingEnd(C23403e c23403e) {
            LongVodPlayerView.this.showToolbarAlways = false;
            LongVodPlayerView.this.m72016T1();
            LongVodPlayerView.this.m71944A2(false);
            C16791c0 c16791c0 = LongVodPlayerView.this.videoDot;
            if (c16791c0 != null) {
                c16791c0.m73438k();
            }
            C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "onLoadingEnd", false, 4, null);
            LongVodPlayerView.this.handler.removeCallbacksAndMessages(null);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onLoadingProgress(int i11, float f11, C23403e c23403e) {
            InterfaceC16633f.a.m72435m(this, i11, f11, c23403e);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onLoopingStart() {
            C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "onLoopingStart", false, 4, null);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onMediaItemTransition(String str) {
            InterfaceC16633f.a.m72438p(this, str);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onPlayError(PlayError errorInfo, C23403e c23403e) {
            Intrinsics.m97802h(errorInfo, "errorInfo");
            LongVodPlayerView.this.m72034Z1();
            C16791c0 c16791c0 = LongVodPlayerView.this.videoDot;
            if (c16791c0 != null) {
                c16791c0.m73440m(errorInfo);
            }
            boolean zM106330e = C27287m.f83003a.m106330e();
            C26866a.f81698a.m104912c(LongVodPlayerView.TAG, "onPlayError， hasNet:" + zM106330e + ", code:" + errorInfo.getErrorCode() + ", msg:" + errorInfo.getErrorMessage(), true);
            LongVodPlayerView.this.m72083n2(zM106330e ^ true);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onPlayerRelease(C23403e c23403e) {
            InterfaceC16633f.a.m72442t(this, c23403e);
            if (LongVodPlayerView.this.m72094q1()) {
                Context context = LongVodPlayerView.this.getContext();
                AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity != null) {
                    appCompatActivity.finish();
                }
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onPlayerReset() {
            C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "onPlayerReset", false, 4, null);
            LongVodPlayerView.this.showToolbarAlways = false;
            LongVodPlayerView.this.totalDuration = 0L;
            LongVodPlayerView.this.playProgress = 0L;
            LongVodPlayerView.this.getLongVodPlayerViewAdHelper().m72319n4();
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onPrepare(C23403e c23403e) {
            LongVodPlayerView.this.m72034Z1();
            LongVodPlayerView.this.isPrepared = true;
            LongVodPlayerView longVodPlayerView = LongVodPlayerView.this;
            longVodPlayerView.totalDuration = longVodPlayerView.playerControl.getDuration();
            LongVodPlayerView.this.m72067j2();
            C26866a.f81698a.m104912c(LongVodPlayerView.TAG, "onPrepare， totalDuration:" + LongVodPlayerView.this.totalDuration, true);
            LongVodPlayerView.this.viewBinding.f77909p.f77966n.setMax(LongVodPlayerView.this.totalDuration);
            LongVodPlayerView.this.viewBinding.f77908o.f77946t.setMax(LongVodPlayerView.this.totalDuration);
            if (LongVodPlayerView.this.isPreparedInterceptPlay) {
                LongVodPlayerView.this.isPreparedInterceptPlay = false;
            } else if (!LongVodPlayerView.this.isMobilePaused && !LongVodPlayerView.this.isUGCPauseShowing) {
                LongVodPlayerView.this.playerControl.play();
            }
            LongVodPlayerView.this.m72051f1();
            LongVodPlayerView.this.isMultipleResChangeResolution = false;
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onProgress(long j11, C23403e c23403e) {
            if (LongVodPlayerView.this.isMultipleResChangeResolution && j11 == 0 && LongVodPlayerView.this.playProgress > 0) {
                C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "onProgress, 正在切换分辨率，progress重置，不做处理", false, 4, null);
            } else {
                LongVodPlayerView.this.m71980J2(j11);
            }
            C16791c0 c16791c0 = LongVodPlayerView.this.videoDot;
            if (c16791c0 != null) {
                c16791c0.m73441n(j11);
            }
            LongVodPlayerView.this.playProgress = j11;
            LongVodPlayerView.this.pressSeekProgress = j11;
            C16441c c16441c = LongVodPlayerView.this.adHelper;
            if (c16441c != null) {
                c16441c.m71801e(j11, LongVodPlayerView.this.totalDuration);
            }
            LongVodSubtitleHelper longVodSubtitleHelper = LongVodPlayerView.this.subtitleHelper;
            if (longVodSubtitleHelper != null) {
                longVodSubtitleHelper.m71777X(j11);
            }
            LongVodPlayerView.this.viewBinding.f77909p.f77966n.setMax(LongVodPlayerView.this.totalDuration);
            LongVodPlayerView.this.viewBinding.f77908o.f77946t.setMax(LongVodPlayerView.this.totalDuration);
            if (!C5118o.f17608a.m23948i() && !C5110g.f17601a.m23911b()) {
                LongVodPlayerViewAdHelper longVodPlayerViewAdHelper = LongVodPlayerView.this.getLongVodPlayerViewAdHelper();
                final LongVodPlayerView longVodPlayerView = LongVodPlayerView.this;
                longVodPlayerViewAdHelper.m72732N(j11, new Function0() { // from class: com.transsion.player.longvideo.ui.z0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LongVodPlayerView.C16515l.m72143h(longVodPlayerView);
                    }
                });
            }
            LongVodPlayerView.this.getLongVodPlayerViewAdHelper().m72298C3(j11);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onRenderFirstFrame() {
            C26866a.f81698a.m104912c(LongVodPlayerView.TAG, "onRenderFirstFrame", true);
            if (!LongVodPlayerView.this.isPrepared) {
                LongVodPlayerView.this.isPreparedInterceptPlay = true;
            }
            C16791c0 c16791c0 = LongVodPlayerView.this.videoDot;
            if (c16791c0 != null) {
                c16791c0.m73442o();
            }
            LongVodPlayerView.this.playerControl.pause();
            InterfaceC16634g orPlayer = LongVodPlayerView.this.playerControl.getOrPlayer();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("player is :");
            sb2.append(orPlayer);
            if (orPlayer instanceof C26041a0) {
                ((C26041a0) orPlayer).m102120g(LongVodPlayerView.this.bandwidthRedundancyListener);
            }
            if (LongVodPlayerView.this.canNonSubscriberPlay) {
                LongVodPlayerViewAdHelper longVodPlayerViewAdHelper = LongVodPlayerView.this.getLongVodPlayerViewAdHelper();
                final LongVodPlayerView longVodPlayerView = LongVodPlayerView.this;
                longVodPlayerViewAdHelper.m72752a2(new Function0() { // from class: com.transsion.player.longvideo.ui.y0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LongVodPlayerView.C16515l.m72144i(longVodPlayerView);
                    }
                });
            } else {
                C16496k.f55626a.m71921a(LongVodPlayerView.this.getClassTag() + " --> onRenderFirstFrame() --> 当前无法播放，vip分辨率");
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onSetDataSource() {
            InterfaceC16633f.a.m72413B(this);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onTracksAudioBitrateChange(int i11) {
            C16791c0 c16791c0 = LongVodPlayerView.this.videoDot;
            if (c16791c0 != null) {
                c16791c0.m73448u(i11);
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onTracksChange(C26906c tracks) {
            ImmutableList immutableListM105022a;
            C16791c0 c16791c0;
            Intrinsics.m97802h(tracks, "tracks");
            InterfaceC16633f.a.m72415D(this, tracks);
            C24715a c24715a = LongVodPlayerView.this.curBean;
            if ((c24715a == null || !c24715a.m97067w()) && (immutableListM105022a = tracks.m105022a()) != null && !immutableListM105022a.isEmpty() && LongVodPlayerView.this.isFirstSetTracks) {
                LongVodPlayerView.this.isFirstSetTracks = false;
                LongVodPlayerView.this.resolutionList.clear();
                C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "onTracksChange, tracks =\n " + tracks, false, 4, null);
                ImmutableList<C26907d> immutableListM105022a2 = tracks.m105022a();
                LongVodPlayerView longVodPlayerView = LongVodPlayerView.this;
                for (C26907d c26907d : immutableListM105022a2) {
                    if (c26907d.m105027e() == 2) {
                        longVodPlayerView.dashVideoTracksGroup = c26907d;
                        for (C26905b c26905b : c26907d.m105024b()) {
                            longVodPlayerView.resolutionList.add(new C24716b(false, c26905b.m105018c() + "P", LongVodPlayerConfigType.BITRATE));
                        }
                    }
                }
                C24715a c24715a2 = LongVodPlayerView.this.curBean;
                if ((c24715a2 != null ? c24715a2.m97066v() : null) != PlayMimeType.HLS || (c16791c0 = LongVodPlayerView.this.videoDot) == null) {
                    return;
                }
                c16791c0.m73423K(LongVodPlayerView.this.resolutionList.size() > 1 ? PrepareException.ERROR_NO_URL : "5");
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onTracksVideoBitrateChange(int i11) {
            C16791c0 c16791c0 = LongVodPlayerView.this.videoDot;
            if (c16791c0 != null) {
                c16791c0.m73449v(i11);
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onVideoPause(C23403e c23403e) {
            LongVodPlayerView.this.m71968G2(false);
            C16791c0 c16791c0 = LongVodPlayerView.this.videoDot;
            if (c16791c0 != null) {
                c16791c0.m73450w();
            }
            C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "onVideoPause", false, 4, null);
            LongVodPlayerView.this.m72110u1(false);
            C16441c c16441c = LongVodPlayerView.this.adHelper;
            if (c16441c != null) {
                c16441c.m71800d();
            }
            LongVodPlayerView.this.setPauseViewStatus(false);
            if (LongVodPlayerView.this.isAdShowing || LongVodPlayerView.this.isRewardInterceptShowing) {
                return;
            }
            LongVodPlayerView.m72075l2(LongVodPlayerView.this, false, 1, null);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onVideoSizeChanged(int i11, int i12) {
            LongVodPlayerView.this.videoWidth = i11;
            LongVodPlayerView.this.videoHeight = i12;
            C16455j c16455j = LongVodPlayerView.this.spaceHelper;
            if (c16455j != null) {
                c16455j.m71817b(i11, i12);
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onVideoStart(C23403e c23403e) {
            C16471u c16471u;
            if (LongVodPlayerView.this.isRewardInterceptShowing) {
                LongVodPlayerView.this.playerControl.pause();
                return;
            }
            LongVodPlayerView.this.isUGCPauseShowing = false;
            FrameLayout flUGCAutoPlayGroup = LongVodPlayerView.this.viewBinding.f77909p.f77954b;
            Intrinsics.m97801g(flUGCAutoPlayGroup, "flUGCAutoPlayGroup");
            AbstractC26006c.m102054g(flUGCAutoPlayGroup);
            LongVodPlayerView.this.m71968G2(true);
            C16471u c16471u2 = LongVodPlayerView.this.mobileDataHelper;
            if (c16471u2 != null) {
                c16471u2.m71853E();
            }
            LongVodPlayerView.this.isPressedPause = false;
            LongVodPlayerView.this.m71942A0();
            LongVodPlayerView.this.m72034Z1();
            C16791c0 c16791c0 = LongVodPlayerView.this.videoDot;
            if (c16791c0 != null) {
                c16791c0.m73451x();
            }
            C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "onVideoStart", false, 4, null);
            LongVodPlayerView.this.hideBottomController(false);
            LongVodPlayerView.this.setPauseViewStatus(true);
            LongVodPlayerView.this.m72110u1(true);
            LongVodPlayerView.this.m72016T1();
            LongVodPlayerView.this.m71944A2(false);
            C16441c c16441c = LongVodPlayerView.this.adHelper;
            if (c16441c != null) {
                c16441c.m71802f();
            }
            if (LongVodPlayerView.this.isMobilePaused) {
                LongVodPlayerView.this.isMobilePaused = false;
                LongVodPlayerView longVodPlayerView = LongVodPlayerView.this;
                String string = Utils.m27275a().getString(R$string.long_vod_load_us_cellular);
                Intrinsics.m97801g(string, "getString(...)");
                longVodPlayerView.m72131z2(string);
            }
            if (LongVodPlayerView.this.m72107t2() && (c16471u = LongVodPlayerView.this.mobileDataHelper) != null) {
                c16471u.m71852D();
            }
            LongVodPlayerView.this.getLongVodPlayerViewAdHelper().m72322w4();
            MusicFloatManager.f51050h.m65598b().m65582B(c23403e != null ? c23403e.m92933i() : null);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void setOnSeekCompleteListener() {
            InterfaceC16633f.a.m72422K(this);
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.LongVodPlayerView$m */
    static final class C16516m implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f55745a;

        C16516m(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f55745a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f55745a;
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
            this.f55745a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.LongVodPlayerView$n */
    public static final class C16517n implements InterfaceC22999c {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C24716b f55747b;

        C16517n(C24716b c24716b) {
            this.f55747b = c24716b;
        }

        @Override // p352dn.InterfaceC22999c
        /* JADX INFO: renamed from: a */
        public void mo66056a() {
            C27089h.f82174a.m105449a("LongVdPlayerConfigDialog --> MemberGuideCallback{} --> onFailed(开通会员失败，提示做任务)");
        }

        @Override // p352dn.InterfaceC22999c
        public void onSuccess() {
            C27089h.f82174a.m105449a("LongVdPlayerConfigDialog --> MemberGuideCallback{} --> onSuccess()");
            LongVodPlayerView.this.getConfigViewModel().m72330c(this.f55747b);
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.LongVodPlayerView$o */
    public static final class C16518o implements InterfaceC22999c {
        C16518o() {
        }

        @Override // p352dn.InterfaceC22999c
        /* JADX INFO: renamed from: a */
        public void mo66056a() {
        }

        @Override // p352dn.InterfaceC22999c
        public void onSuccess() {
            C24715a c24715a = LongVodPlayerView.this.curBean;
            if (c24715a != null) {
                LongVodPlayerView.this.setDataSource(c24715a);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.LongVodPlayerView$onSaveHistory$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.player.longvideo.ui.LongVodPlayerView$onSaveHistory$1", m97637f = "LongVodPlayerView.kt", m97638l = {2689, 2726}, m97639m = "invokeSuspend")
    @SourceDebugExtension
    static final class C165191 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ C24715a $bean;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ LongVodPlayerView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C165191(C24715a c24715a, LongVodPlayerView longVodPlayerView, Continuation<? super C165191> continuation) {
            super(2, continuation);
            this.$bean = c24715a;
            this.this$0 = longVodPlayerView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C165191(this.$bean, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C165191) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        /* JADX WARN: Code duplicated, block: B:60:0x0169  */
        /* JADX WARN: Code duplicated, block: B:63:0x0182 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C24715a c24715a;
            LongVodPlayerView longVodPlayerView;
            ArrayList arrayList;
            Object objMo65003l;
            String str;
            String ops;
            VideoDetailPlayBean videoDetailPlayBean;
            VideoDetailPlayDao videoDetailPlayDao;
            Long lastAdEndTimeStamp;
            Long lastAdStartTimeStamp;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    arrayList = (ArrayList) this.L$2;
                    c24715a = (C24715a) this.L$1;
                    longVodPlayerView = (LongVodPlayerView) this.L$0;
                    ResultKt.m97107b(obj);
                    objMo65003l = obj;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(obj);
                }
                C26750e c26750e = new C26750e(true, false);
                FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
                String name = C26750e.class.getName();
                Intrinsics.m97801g(name, "getName(...)");
                flowEventBus.postEvent(name, c26750e, 0L);
                return Unit.f75682a;
            }
            ResultKt.m97107b(obj);
            c24715a = this.$bean;
            if (c24715a != null) {
                longVodPlayerView = this.this$0;
                arrayList = new ArrayList();
                Iterator it = c24715a.m97045a().iterator();
                while (it.hasNext()) {
                    String subjectId = ((DubsInfo) it.next()).getSubjectId();
                    if (subjectId != null) {
                        arrayList.add(subjectId);
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(c24715a.m97059o());
                }
                VideoDetailPlayDao videoDetailPlayDao2 = longVodPlayerView.getVideoDetailPlayDao();
                String strM97059o = c24715a.m97059o();
                int iM97056l = c24715a.m97056l();
                int iM97049e = c24715a.m97049e();
                this.L$0 = longVodPlayerView;
                this.L$1 = c24715a;
                this.L$2 = arrayList;
                this.label = 1;
                objMo65003l = videoDetailPlayDao2.mo65003l(strM97059o, iM97056l, iM97049e, this);
                if (objMo65003l == objF) {
                    return objF;
                }
            }
            return Unit.f75682a;
            ArrayList arrayList2 = arrayList;
            VideoDetailPlayBean videoDetailPlayBean2 = (VideoDetailPlayBean) objMo65003l;
            boolean rewardPlayed = videoDetailPlayBean2 != null ? videoDetailPlayBean2.getRewardPlayed() : false;
            boolean rewardFree = videoDetailPlayBean2 != null ? videoDetailPlayBean2.getRewardFree() : false;
            longVodPlayerView.isRewardUnlock = videoDetailPlayBean2 != null ? videoDetailPlayBean2.getRewardUnlock() : false;
            C24717c c24717c = longVodPlayerView.curPlayStream;
            if (c24717c != null) {
                String strM97059o2 = c24715a.m97059o();
                String strM97079c = c24717c.m97079c();
                int iM97049e2 = c24715a.m97049e();
                int iM97056l2 = c24715a.m97056l();
                long j11 = longVodPlayerView.playProgress;
                long j12 = longVodPlayerView.totalDuration;
                long jM97058n = c24715a.m97058n();
                String strM97060p = c24715a.m97060p();
                String strM97084h = c24717c.m97084h();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strM97047c = c24715a.m97047c();
                String strM97063s = c24715a.m97063s();
                String strM97046b = c24715a.m97046b();
                Integer numM97062r = c24715a.m97062r();
                boolean zM97051g = c24715a.m97051g();
                String value = PlayMode.STREAM.getValue();
                long jLongValue = (videoDetailPlayBean2 == null || (lastAdStartTimeStamp = videoDetailPlayBean2.getLastAdStartTimeStamp()) == null) ? 0L : lastAdStartTimeStamp.longValue();
                long jLongValue2 = (videoDetailPlayBean2 == null || (lastAdEndTimeStamp = videoDetailPlayBean2.getLastAdEndTimeStamp()) == null) ? 0L : lastAdEndTimeStamp.longValue();
                boolean z11 = longVodPlayerView.isRewardUnlock;
                String strM97061q = c24715a.m97061q();
                if (strM97061q == null || strM97061q.length() == 0) {
                    if (videoDetailPlayBean2 != null) {
                        ops = videoDetailPlayBean2.getOps();
                    } else {
                        str = null;
                    }
                    videoDetailPlayBean = new VideoDetailPlayBean(strM97059o2, strM97079c, iM97049e2, iM97056l2, j11, strM97060p, strM97047c, strM97063s, strM97084h, jCurrentTimeMillis, null, Boxing.m97635e(j12), Boxing.m97635e(jM97058n), strM97046b, numM97062r, zM97051g, value, null, null, 0L, arrayList2, Boxing.m97635e(jLongValue), Boxing.m97635e(jLongValue2), rewardPlayed, z11, rewardFree, str, 525312, null);
                    if (longVodPlayerView.subSelectId != null) {
                        videoDetailPlayBean.setSubtitleSelectId(longVodPlayerView.subSelectId);
                    }
                    videoDetailPlayDao = longVodPlayerView.getVideoDetailPlayDao();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    if (videoDetailPlayDao.mo65007p(videoDetailPlayBean, this) == objF) {
                        return objF;
                    }
                    C26750e c26750e2 = new C26750e(true, false);
                    FlowEventBus flowEventBus2 = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
                    String name2 = C26750e.class.getName();
                    Intrinsics.m97801g(name2, "getName(...)");
                    flowEventBus2.postEvent(name2, c26750e2, 0L);
                } else {
                    ops = c24715a.m97061q();
                }
                str = ops;
                videoDetailPlayBean = new VideoDetailPlayBean(strM97059o2, strM97079c, iM97049e2, iM97056l2, j11, strM97060p, strM97047c, strM97063s, strM97084h, jCurrentTimeMillis, null, Boxing.m97635e(j12), Boxing.m97635e(jM97058n), strM97046b, numM97062r, zM97051g, value, null, null, 0L, arrayList2, Boxing.m97635e(jLongValue), Boxing.m97635e(jLongValue2), rewardPlayed, z11, rewardFree, str, 525312, null);
                if (longVodPlayerView.subSelectId != null) {
                    videoDetailPlayBean.setSubtitleSelectId(longVodPlayerView.subSelectId);
                }
                videoDetailPlayDao = longVodPlayerView.getVideoDetailPlayDao();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                if (videoDetailPlayDao.mo65007p(videoDetailPlayBean, this) == objF) {
                    return objF;
                }
                C26750e c26750e3 = new C26750e(true, false);
                FlowEventBus flowEventBus3 = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
                String name3 = C26750e.class.getName();
                Intrinsics.m97801g(name3, "getName(...)");
                flowEventBus3.postEvent(name3, c26750e3, 0L);
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.LongVodPlayerView$setDataSource$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.player.longvideo.ui.LongVodPlayerView$setDataSource$1", m97637f = "LongVodPlayerView.kt", m97638l = {2341}, m97639m = "invokeSuspend")
    static final class C165211 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ C24715a $bean;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C165211(C24715a c24715a, Continuation<? super C165211> continuation) {
            super(2, continuation);
            this.$bean = c24715a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C165211 c165211 = LongVodPlayerView.this.new C165211(this.$bean, continuation);
            c165211.L$0 = obj;
            return c165211;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C165211) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC25149n0 interfaceC25149n0 = (InterfaceC25149n0) this.L$0;
                LongVodResolutionHelper longVodResolutionHelper = LongVodPlayerView.this.resolutionHelper;
                C24715a c24715a = this.$bean;
                this.L$0 = interfaceC25149n0;
                this.label = 1;
                obj = longVodResolutionHelper.m71718b(c24715a, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            C24717c c24717c = (C24717c) obj;
            if (c24717c != null) {
                LongVodPlayerView longVodPlayerView = LongVodPlayerView.this;
                C24715a c24715a2 = this.$bean;
                longVodPlayerView.m71944A2(longVodPlayerView.isNewPlayer);
                LongVodSubtitleHelper longVodSubtitleHelper = longVodPlayerView.subtitleHelper;
                if (longVodSubtitleHelper != null) {
                    longVodSubtitleHelper.m71775T(c24715a2, c24717c);
                }
                if (c24715a2.m97067w()) {
                    longVodPlayerView.m72039b1(c24715a2, c24717c);
                }
                longVodPlayerView.curPlayStream = c24717c;
                longVodPlayerView.m72031Y1(c24715a2, c24717c);
                if (longVodPlayerView.isNewPlayer) {
                    longVodPlayerView.setPlayerDataSourceAdPrepare(c24717c);
                } else {
                    longVodPlayerView.setPauseViewStatus(true);
                    longVodPlayerView.playerControl.play();
                    LongVodSubtitleHelper longVodSubtitleHelper2 = longVodPlayerView.subtitleHelper;
                    if (longVodSubtitleHelper2 != null) {
                        longVodSubtitleHelper2.m71780e0(true);
                    }
                }
                longVodPlayerView.m72111u2(false, "getDefaultPlayStream() --> 获取到可用分辨率，隐藏提示");
                C26866a.a.m104908v(C26866a.f81698a, LongVodPlayerView.TAG, "setDataSource, reset isNewPlayer", false, 4, null);
                longVodPlayerView.isNewPlayer = true;
            } else {
                LongVodPlayerView longVodPlayerView2 = LongVodPlayerView.this;
                longVodPlayerView2.canNonSubscriberPlay = false;
                longVodPlayerView2.m72111u2(true, "getDefaultPlayStream() --> 没有获取到可用分辨率，显示提示");
            }
            MediaItem mediaItemM65588q = MusicFloatManager.f51050h.m65598b().m65588q();
            if (mediaItemM65588q != null) {
                mediaItemM65588q.setPageName(LongVodPlayerView.this.pageName);
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.LongVodPlayerView$setPlayerDataSourceAdPrepare$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.player.longvideo.ui.LongVodPlayerView$setPlayerDataSourceAdPrepare$1", m97637f = "LongVodPlayerView.kt", m97638l = {2433}, m97639m = "invokeSuspend")
    static final class C165221 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        int label;

        C165221(Continuation<? super C165221> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LongVodPlayerView.this.new C165221(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C165221) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            boolean zBooleanValue = true;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                if (!C5118o.f17608a.m23947g() && !C5110g.f17601a.m23911b()) {
                    ResolutionMemberManager resolutionMemberManager = ResolutionMemberManager.f55604a;
                    C24715a c24715a = LongVodPlayerView.this.curBean;
                    this.label = 1;
                    obj = resolutionMemberManager.m71893f(c24715a, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                int iM71933i = C16503r.f55634a.m71933i();
                LongVodPlayerView.this.playerControl.setVipResolution(zBooleanValue, iM71933i);
                C27089h.f82174a.m105449a(LongVodPlayerView.this.getClassTag() + " --> setPlayerDataSourceAdPrepare() --> isVipSubscriber = " + zBooleanValue + " --> vipResolution = " + iM71933i);
                LongVodPlayerView.this.playerControl.prepare();
                LongVodPlayerView.this.playTimeoutHandler.postDelayed(LongVodPlayerView.this.playTimeoutRunnable, LongVodPlayerView.this.getPlayTimeoutStream());
                if (LongVodPlayerView.this.m72107t2() && !C25894a.f79115a.m101695b()) {
                    LongVodPlayerView.this.m72113v0();
                }
                return Unit.f75682a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
            int iM71933i2 = C16503r.f55634a.m71933i();
            LongVodPlayerView.this.playerControl.setVipResolution(zBooleanValue, iM71933i2);
            C27089h.f82174a.m105449a(LongVodPlayerView.this.getClassTag() + " --> setPlayerDataSourceAdPrepare() --> isVipSubscriber = " + zBooleanValue + " --> vipResolution = " + iM71933i2);
            LongVodPlayerView.this.playerControl.prepare();
            LongVodPlayerView.this.playTimeoutHandler.postDelayed(LongVodPlayerView.this.playTimeoutRunnable, LongVodPlayerView.this.getPlayTimeoutStream());
            if (LongVodPlayerView.this.m72107t2()) {
                LongVodPlayerView.this.m72113v0();
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.LongVodPlayerView$showResolutionIntercept$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.player.longvideo.ui.LongVodPlayerView$showResolutionIntercept$1", m97637f = "LongVodPlayerView.kt", m97638l = {3285}, m97639m = "invokeSuspend")
    static final class C165231 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ C24716b $config;
        int label;
        final /* synthetic */ LongVodPlayerView this$0;

        /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.LongVodPlayerView$showResolutionIntercept$1$a */
        public static final class a implements InterfaceC22997a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ LongVodPlayerView f55753a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C24716b f55754b;

            /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.LongVodPlayerView$showResolutionIntercept$1$a$a, reason: collision with other inner class name */
            public static final class C29455a implements InterfaceC22999c {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ LongVodPlayerView f55755a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ C24716b f55756b;

                C29455a(LongVodPlayerView longVodPlayerView, C24716b c24716b) {
                    this.f55755a = longVodPlayerView;
                    this.f55756b = c24716b;
                }

                @Override // p352dn.InterfaceC22999c
                /* JADX INFO: renamed from: a */
                public void mo66056a() {
                    C16496k.f55626a.m71921a("LongVdPlayerConfigDialog --> MemberGuideCallback{} --> onFailed(开通会员失败，提示做任务)");
                    this.f55755a.onResolutionTipFailedFromDialog(this.f55756b);
                }

                @Override // p352dn.InterfaceC22999c
                public void onSuccess() {
                    C16496k.f55626a.m71921a("LongVdPlayerConfigDialog --> MemberGuideCallback{} --> onSuccess()");
                    this.f55755a.m71960E2(this.f55756b);
                }
            }

            a(LongVodPlayerView longVodPlayerView, C24716b c24716b) {
                this.f55753a = longVodPlayerView;
                this.f55754b = c24716b;
            }

            @Override // p352dn.InterfaceC22997a
            /* JADX INFO: renamed from: a */
            public void mo66165a(MemberCheckResult memberCheckResult) {
                Context context = this.f55753a.getContext();
                AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity != null) {
                    LongVodPlayerView longVodPlayerView = this.f55753a;
                    C24716b c24716b = this.f55754b;
                    InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
                    if (interfaceC22998b != null) {
                        InterfaceC22998b.a.m91587c(interfaceC22998b, appCompatActivity, MemberSource.SOURCE_STREAM_RESOLUTION_DIALOG, new C29455a(longVodPlayerView, c24716b), false, null, 24, null);
                    }
                }
            }

            @Override // p352dn.InterfaceC22997a
            /* JADX INFO: renamed from: b */
            public void mo66166b(MemberCheckResult memberCheckResult) {
            }

            @Override // p352dn.InterfaceC22997a
            /* JADX INFO: renamed from: c */
            public void mo66167c(MemberCheckResult memberCheckResult) {
                InterfaceC22997a.a.m91584g(this, memberCheckResult);
                C27089h.f82174a.m105449a(this.f55753a.getClassTag() + " --> memberCheckResult = " + memberCheckResult);
                this.f55753a.closeResolutionPanel(this.f55754b, memberCheckResult);
            }

            @Override // p352dn.InterfaceC22997a
            /* JADX INFO: renamed from: d */
            public void mo66168d(MemberCheckResult memberCheckResult) {
            }

            @Override // p352dn.InterfaceC22997a
            /* JADX INFO: renamed from: e */
            public void mo66169e() {
                C27089h.f82174a.m105449a(this.f55753a.getClassTag() + " --> onPassed() --> 会员权益验证通过 -- 切换分辨率播放");
                this.f55753a.m71960E2(this.f55754b);
            }

            @Override // p352dn.InterfaceC22997a
            /* JADX INFO: renamed from: f */
            public void mo66170f(MemberCheckResult memberCheckResult) {
                InterfaceC22997a.a.m91578a(this, memberCheckResult);
                C27089h.f82174a.m105449a(this.f55753a.getClassTag() + " --> notImplement() --> 当前类型没有实现");
            }

            @Override // p352dn.InterfaceC22997a
            public void onFail(String errorMsg) {
                Intrinsics.m97802h(errorMsg, "errorMsg");
                InterfaceC22997a.a.m91579b(this, errorMsg);
                C27089h.f82174a.m105449a(this.f55753a.getClassTag() + " --> onFail() --> 加载失败");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C165231(C24716b c24716b, LongVodPlayerView longVodPlayerView, Continuation<? super C165231> continuation) {
            super(2, continuation);
            this.$config = c24716b;
            this.this$0 = longVodPlayerView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C165231(this.$config, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C165231) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                this.label = 1;
                if (AbstractC25207u0.m99223a(500L, this) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
            if (interfaceC22998b != null) {
                MemberSceneType memberSceneType = MemberSceneType.SCENE_PREDL;
                C16503r c16503r = C16503r.f55634a;
                C24716b c24716b = this.$config;
                interfaceC22998b.mo69871y(memberSceneType, Boxing.m97634d(c16503r.m71939r(c24716b != null ? c24716b.m97074d() : null)), new a(this.this$0, this.$config));
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LongVodPlayerView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LongVodPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongVodPlayerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.longVodPlayerViewAdHelper = new LongVodPlayerViewAdHelper();
        this.resolutionPanelTargetWidth = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.ui.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(LongVodPlayerView.m72043c2());
            }
        });
        this.screenWidth = AbstractC5806y.m27489e();
        this.screenHeight = AbstractC5806y.m27487c();
        this.contentType = LongVodContentType.SUBJECT;
        LongVodUiType longVodUiType = LongVodUiType.MIDDLE;
        this.curUiType = longVodUiType;
        this.curUiRotation = longVodUiType;
        this.isPageResumed = true;
        this.isNewPlayer = true;
        this.isMultiplePlayer = true;
        this.handler = new Handler(Looper.getMainLooper());
        this.videoDetailPlayDao = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.ui.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LongVodPlayerView.m71988L2();
            }
        });
        this.ugcVideoDetailPlayDao = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.ui.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LongVodPlayerView.m71956D2();
            }
        });
        this.configViewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.ui.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LongVodPlayerView.m72069k0(this.f55841a);
            }
        });
        this.speedViewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.ui.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LongVodPlayerView.m71948B2(this.f55843a);
            }
        });
        this.isFirstSetTracks = true;
        this.resolutionList = new ArrayList();
        this.playTimeoutHandler = new Handler(Looper.getMainLooper());
        this.playTimeoutStream = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.ui.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(LongVodPlayerView.m71995N1());
            }
        });
        this.pkStyle = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.ui.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(LongVodPlayerView.m71987L1());
            }
        });
        this.coroutineScopeIO = AbstractC25153o0.m99079a(C25220y0.m99268b());
        this.canNonSubscriberPlay = true;
        C25661j c25661jM100997b = C25661j.m100997b(LayoutInflater.from(getContext()), this);
        Intrinsics.m97801g(c25661jM100997b, "inflate(...)");
        this.viewBinding = c25661jM100997b;
        ORLongVodPlayerView orLongVodView = c25661jM100997b.f77914u;
        Intrinsics.m97801g(orLongVodView, "orLongVodView");
        this.playerControl = orLongVodView;
        this.resolutionHelper = new LongVodResolutionHelper();
        setClickable(true);
        m72073l0();
        this.screenHelper = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.ui.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LongVodPlayerView.m72052f2(this.f55849a);
            }
        });
        this.bandwidthRedundancyListener = new C16506c();
        this.playerListener = new C16515l();
        this.runnable = new Runnable() { // from class: com.transsion.player.longvideo.ui.o
            @Override // java.lang.Runnable
            public final void run() {
                LongVodPlayerView.m72046d2(this.f55851a);
            }
        };
        this.netListener = new C16512i();
        this.playTimeoutRunnable = new Runnable() { // from class: com.transsion.player.longvideo.ui.p
            @Override // java.lang.Runnable
            public final void run() {
                LongVodPlayerView.m71991M1(this.f55853a);
            }
        };
        this.orientationEventListener = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.ui.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LongVodPlayerView.m71975I1(this.f55837a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public final void m71942A0() {
        List listM97054j;
        C24717c c24717c;
        C24715a c24715a = this.curBean;
        if ((c24715a == null || (listM97054j = c24715a.m97054j()) == null || (c24717c = (C24717c) CollectionsKt.m97361k0(listM97054j)) == null) ? false : c24717c.m97085i()) {
            return;
        }
        AppCompatImageView orLongVodIvBg = this.viewBinding.f77912s;
        Intrinsics.m97801g(orLongVodIvBg, "orLongVodIvBg");
        AbstractC26006c.m102054g(orLongVodIvBg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public static final void m71943A1(LongVodPlayerView longVodPlayerView, C24716b c24716b) {
        C27089h.f82174a.m105449a(longVodPlayerView.getClassTag() + " --> onResolutionTipFailedFromDialog() --> 分辨率面板开通会员失败，继续激励场景 --> config = " + c24716b);
        Context context = longVodPlayerView.getContext();
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            longVodPlayerView.m72117w0();
            ResolutionMemberManager resolutionMemberManager = ResolutionMemberManager.f55604a;
            FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
            Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
            resolutionMemberManager.m71895i(supportFragmentManager, MemberSource.SOURCE_STREAM_RESOLUTION_DIALOG, longVodPlayerView.curBean, longVodPlayerView.pageName, longVodPlayerView.new C16513j(c24716b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public final void m71944A2(boolean show) {
        if (this.isShowLoading == show) {
            return;
        }
        this.isShowLoading = show;
        if (!show) {
            C26866a.a.m104898f(C26866a.f81698a, TAG, "showVideoLoading gone", false, 4, null);
            m72114v1(false);
        } else {
            if (this.isSeeking) {
                return;
            }
            m72016T1();
            m72114v1(true);
            C26866a.a.m104898f(C26866a.f81698a, TAG, "showVideoLoading visible", false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public final void m71946B0() {
        final CustomRoundCornerLayout flResolution = this.viewBinding.f77903j;
        Intrinsics.m97801g(flResolution, "flResolution");
        ValueAnimator valueAnimator = this.resolutionPanelAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(flResolution.getWidth(), 0);
        valueAnimatorOfInt.setDuration(500L);
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.transsion.player.longvideo.ui.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                LongVodPlayerView.m71950C0(flResolution, valueAnimator2);
            }
        });
        valueAnimatorOfInt.addListener(new C16507d(flResolution, this));
        valueAnimatorOfInt.start();
        this.resolutionPanelAnimator = valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public static final void m71947B1(LongVodPlayerView longVodPlayerView) {
        C27089h.f82174a.m105449a(longVodPlayerView.getClassTag() + " --> onResolutionTipFailedFromMemberTipView() --> 右下角提示开通会员失败，继续激励场景");
        Context context = longVodPlayerView.getContext();
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            longVodPlayerView.m72117w0();
            ResolutionMemberManager resolutionMemberManager = ResolutionMemberManager.f55604a;
            FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
            Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
            resolutionMemberManager.m71895i(supportFragmentManager, MemberSource.SOURCE_STREAM_RESOLUTION_DIALOG, longVodPlayerView.curBean, longVodPlayerView.pageName, longVodPlayerView.new C16514k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public static final C17006o m71948B2(LongVodPlayerView longVodPlayerView) {
        Context context = longVodPlayerView.getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (C17006o) new C3227v0((FragmentActivity) context).m14969a(C17006o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final void m71950C0(CustomRoundCornerLayout customRoundCornerLayout, ValueAnimator animator) {
        Intrinsics.m97802h(animator, "animator");
        ViewGroup.LayoutParams layoutParams = customRoundCornerLayout.getLayoutParams();
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.m97800f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.width = ((Integer) animatedValue).intValue();
        customRoundCornerLayout.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public final void m71951C1() {
        C26866a.a.m104898f(C26866a.f81698a, TAG, " ---> onRewardInterceptShow", false, 4, null);
        this.isRewardInterceptShowing = true;
        this.showToolbarAlways = true;
        hideBottomController(true);
        LinearLayout root = this.viewBinding.f77909p.f77960h.getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        AbstractC26006c.m102054g(root);
        ConstraintLayout root2 = this.viewBinding.f77910q.getRoot();
        Intrinsics.m97801g(root2, "getRoot(...)");
        AbstractC26006c.m102058k(root2);
        m72063i2();
        if (this.playerControl.isPlaying()) {
            this.playerControl.pause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C2 */
    public final void m71952C2() {
        m71958E0();
        m72126y1();
    }

    /* JADX INFO: renamed from: D0 */
    private final void m71954D0() {
        if (!this.showToolbarAlways) {
            ConstraintLayout root = this.viewBinding.f77910q.getRoot();
            Intrinsics.m97801g(root, "getRoot(...)");
            root.setVisibility(8);
        }
        InterfaceC24450a.b bVar = this.playerCallback;
        if (bVar != null) {
            bVar.mo70376f(false);
        }
        AppCompatTextView ivLock = this.viewBinding.f77908o.f77938l;
        Intrinsics.m97801g(ivLock, "ivLock");
        ivLock.setVisibility(8);
        ConstraintLayout clBottomControl = this.viewBinding.f77908o.f77930d;
        Intrinsics.m97801g(clBottomControl, "clBottomControl");
        clBottomControl.setVisibility(8);
        ConstraintLayout root2 = this.viewBinding.f77908o.f77929c.getRoot();
        Intrinsics.m97801g(root2, "getRoot(...)");
        root2.setVisibility(8);
        Group groupControlPk = this.viewBinding.f77908o.f77934h;
        Intrinsics.m97801g(groupControlPk, "groupControlPk");
        groupControlPk.setVisibility(8);
        AppCompatTextView tvPlayNext = this.viewBinding.f77908o.f77951y;
        Intrinsics.m97801g(tvPlayNext, "tvPlayNext");
        tvPlayNext.setVisibility(8);
        View landGradientTop = this.viewBinding.f77908o.f77942p;
        Intrinsics.m97801g(landGradientTop, "landGradientTop");
        landGradientTop.setVisibility(8);
        View landGradientBottom = this.viewBinding.f77908o.f77941o;
        Intrinsics.m97801g(landGradientBottom, "landGradientBottom");
        landGradientBottom.setVisibility(8);
        View middleGradientTop = this.viewBinding.f77909p.f77963k;
        Intrinsics.m97801g(middleGradientTop, "middleGradientTop");
        middleGradientTop.setVisibility(8);
        View middleGradientBottom = this.viewBinding.f77909p.f77962j;
        Intrinsics.m97801g(middleGradientBottom, "middleGradientBottom");
        middleGradientBottom.setVisibility(8);
        LinearLayout llMiddleBottomController = this.viewBinding.f77909p.f77961i;
        Intrinsics.m97801g(llMiddleBottomController, "llMiddleBottomController");
        llMiddleBottomController.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public final void m71955D1() {
        C26866a.a.m104898f(C26866a.f81698a, TAG, " ---> onRewardUnlock", false, 4, null);
        this.isRewardUnlock = true;
        this.isRewardInterceptShowing = false;
        this.showToolbarAlways = false;
        m72063i2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D2 */
    public static final UGCVideoDetailPlayDao m71956D2() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64864A1();
    }

    /* JADX INFO: renamed from: E0 */
    private final void m71958E0() {
        this.isUGCPlay = true;
        this.isUGCPauseShowing = false;
        FrameLayout flUGCAutoPlayGroup = this.viewBinding.f77909p.f77954b;
        Intrinsics.m97801g(flUGCAutoPlayGroup, "flUGCAutoPlayGroup");
        AbstractC26006c.m102054g(flUGCAutoPlayGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public final void m71959E1() {
        ConstraintLayout root = this.viewBinding.f77910q.getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        if (root.getVisibility() == 0) {
            C26866a.a.m104898f(C26866a.f81698a, TAG, "onSingleTap hideBottomController ", false, 4, null);
            hideBottomController(true);
        } else {
            C26866a.a.m104898f(C26866a.f81698a, TAG, "onSingleTap showBottomController ", false, 4, null);
            m72075l2(this, false, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E2 */
    public final void m71960E2(C24716b config) {
        LifecycleCoroutineScope lifecycleCoroutineScopeM14968a;
        getConfigViewModel().m72330c(C24716b.m97071b(config, false, config.m97074d(), null, 5, null));
        Context context = getContext();
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity == null || (lifecycleCoroutineScopeM14968a = AbstractC3226v.m14968a(appCompatActivity)) == null) {
            return;
        }
        AbstractC25136k.m99058d(lifecycleCoroutineScopeM14968a, null, null, new LongVodPlayerView$unLockResolution$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: F0 */
    private final void m71962F0() {
        if (!getPkStyle()) {
            this.viewBinding.f77908o.f77938l.setText((CharSequence) null);
            this.viewBinding.f77908o.f77950x.setText((CharSequence) null);
            TextView tvPlayScale = this.viewBinding.f77908o.f77952z;
            Intrinsics.m97801g(tvPlayScale, "tvPlayScale");
            AbstractC26006c.m102054g(tvPlayScale);
        }
        this.viewBinding.f77908o.f77920A.updateSpeed(C14453d.f50863a.m65162d(), true);
    }

    /* JADX INFO: renamed from: F1 */
    private final void m71963F1(C24716b selectedBean) {
        Float fT = StringsKt.m98214t(selectedBean.m97074d());
        if (fT != null) {
            this.playerControl.setSpeed(fT.floatValue());
        }
    }

    /* JADX INFO: renamed from: F2 */
    private final void m71964F2() {
        C14492k.f50955a.m65326t(this);
        C27287m.f83003a.m106337m(this.netListener);
    }

    /* JADX INFO: renamed from: G0 */
    private final void m71966G0() {
    }

    /* JADX INFO: renamed from: G1 */
    private final void m71967G1() {
        InterfaceC24450a.b bVar = this.playerCallback;
        if (bVar != null) {
            bVar.mo70377g(this.curBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G2 */
    public final void m71968G2(boolean videoPlaying) {
        if (m72094q1()) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Context context = getContext();
            FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
            if (fragmentActivity != null && !fragmentActivity.isDestroyed() && !fragmentActivity.isFinishing()) {
                InterfaceC27138e.a aVar = InterfaceC27138e.f82251a;
                if (aVar.m105606b().mo86568c() && C14496b.f50966a.m65344b().getBoolean("k_pip_enable", true)) {
                    InterfaceC27138e interfaceC27138eM105606b = aVar.m105606b();
                    ViewParent parent = getParent();
                    Result.m112707constructorimpl(interfaceC27138eM105606b.mo86566a(fragmentActivity, false, videoPlaying, parent instanceof ViewGroup ? (ViewGroup) parent : null));
                }
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: H0 */
    private final void m71970H0() {
        if (m72106t1()) {
            C16441c c16441c = new C16441c(this.viewBinding);
            c16441c.m71797a();
            this.adHelper = c16441c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H1 */
    public static final void m71971H1(CustomRoundCornerLayout customRoundCornerLayout, ValueAnimator animator) {
        Intrinsics.m97802h(animator, "animator");
        ViewGroup.LayoutParams layoutParams = customRoundCornerLayout.getLayoutParams();
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.m97800f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.width = ((Integer) animatedValue).intValue();
        customRoundCornerLayout.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public final void m71972H2(boolean isSeek, long progress) {
        this.isSeeking = isSeek;
        if (m72090p1()) {
            AppCompatTextView tvCenterProgress = this.viewBinding.f77917x;
            Intrinsics.m97801g(tvCenterProgress, "tvCenterProgress");
            AbstractC26006c.m102054g(tvCenterProgress);
            return;
        }
        if (isSeek) {
            this.viewBinding.f77917x.setVisibility(0);
            this.viewBinding.f77917x.setText(Html.fromHtml(Utils.m27275a().getString(R$string.long_vod_progress_tx_style, AbstractC17443m.m74969d(progress), AbstractC17443m.m74969d(this.totalDuration))));
            LongVodSubtitleHelper longVodSubtitleHelper = this.subtitleHelper;
            if (longVodSubtitleHelper != null) {
                longVodSubtitleHelper.m71783i0(progress);
            }
            m72114v1(false);
            C26866a.a.m104898f(C26866a.f81698a, TAG, "updateSeekbar loading gone", false, 4, null);
            return;
        }
        LongVodSubtitleHelper longVodSubtitleHelper2 = this.subtitleHelper;
        if (longVodSubtitleHelper2 != null) {
            longVodSubtitleHelper2.m71778Y();
        }
        AppCompatTextView tvCenterProgress2 = this.viewBinding.f77917x;
        Intrinsics.m97801g(tvCenterProgress2, "tvCenterProgress");
        AbstractC26006c.m102054g(tvCenterProgress2);
        C26866a.a.m104898f(C26866a.f81698a, TAG, "updateSeekbar loading " + this.isShowLoading, false, 4, null);
        m72114v1(this.isShowLoading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final Unit m71974I0(LongVodPlayerView longVodPlayerView, boolean z11) {
        longVodPlayerView.isAdShowing = z11;
        if (z11) {
            longVodPlayerView.hideBottomController(true);
            if (longVodPlayerView.playerControl.isPlaying()) {
                longVodPlayerView.playerControl.pause();
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public static final C17444n m71975I1(final LongVodPlayerView longVodPlayerView) {
        Context context = longVodPlayerView.getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type android.app.Activity");
        return new C17444n((Activity) context, new Function1() { // from class: com.transsion.player.longvideo.ui.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LongVodPlayerView.m71979J1(this.f55845a, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: I2 */
    private final void m71976I2() {
        LongVodSubtitleHelper longVodSubtitleHelper = this.subtitleHelper;
        if (longVodSubtitleHelper != null) {
            List list = this.dubs;
            if (list == null) {
                Intrinsics.m97819y("dubs");
                list = null;
            }
            longVodSubtitleHelper.m71782h0(list);
        }
    }

    /* JADX INFO: renamed from: J0 */
    private final void m71978J0() {
        C16834q1.f56668b.m73509f(this.viewBinding);
        this.viewBinding.f77909p.f77958f.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LongVodPlayerView.m71982K0(this.f55857a, view);
            }
        });
        this.viewBinding.f77916w.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LongVodPlayerView.m71986L0(this.f55761a, view);
            }
        });
        this.viewBinding.f77910q.f77880b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LongVodPlayerView.m71990M0(this.f55764a, view);
            }
        });
        this.viewBinding.f77909p.f77957e.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LongVodPlayerView.m71994N0(this.f55767a, view);
            }
        });
        this.viewBinding.f77908o.f77937k.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LongVodPlayerView.m71998O0(this.f55770a, view);
            }
        });
        this.viewBinding.f77910q.f77883e.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LongVodPlayerView.m72002P0(this.f55836a, view);
            }
        });
        this.viewBinding.f77910q.f77884f.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LongVodPlayerView.m72006Q0(this.f55838a, view);
            }
        });
        this.viewBinding.f77908o.f77947u.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LongVodPlayerView.m72009R0(this.f55839a, view);
            }
        });
        this.viewBinding.f77908o.f77951y.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LongVodPlayerView.m72012S0(this.f55842a, view);
            }
        });
        this.viewBinding.f77908o.f77929c.f70196d.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LongVodPlayerView.m72015T0(this.f55844a, view);
            }
        });
        this.viewBinding.f77908o.f77929c.f70197e.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LongVodPlayerView.m72018U0(this.f55859a, view);
            }
        });
        this.viewBinding.f77908o.f77929c.f70195c.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LongVodPlayerView.m72021V0(this.f55862a, view);
            }
        });
        this.viewBinding.f77908o.f77940n.setOnModelChangeListener(new ImmScaleView.InterfaceC17306a() { // from class: com.transsion.player.longvideo.ui.u
            @Override // com.transsion.postdetail.p306ui.view.ImmScaleView.InterfaceC17306a
            /* JADX INFO: renamed from: a */
            public final void mo72331a(ScaleMode scaleMode, String str) {
                LongVodPlayerView.m72024W0(this.f55865a, scaleMode, str);
            }
        });
        this.viewBinding.f77908o.f77943q.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LongVodPlayerView.m72027X0(this.f55867a, view);
            }
        });
        this.viewBinding.f77910q.f77882d.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LongVodPlayerView.m72030Y0(this.f55873a, view);
            }
        });
        this.viewBinding.f77908o.f77938l.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LongVodPlayerView.m72033Z0(this.f55875a, view);
            }
        });
        this.playerControl.setGestureListener(new C16509f(AbstractC26006c.m102053f()));
        AppCompatImageView ivFloat = this.viewBinding.f77909p.f77956d;
        Intrinsics.m97801g(ivFloat, "ivFloat");
        ivFloat.setVisibility(m72098r1() ? 0 : 8);
        this.viewBinding.f77909p.f77956d.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LongVodPlayerView.m72036a1(this.f55877a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J1 */
    public static final Unit m71979J1(LongVodPlayerView longVodPlayerView, int i11) {
        C16455j c16455j;
        if ((i11 == 0 || i11 == 1 || i11 == 3) && (c16455j = longVodPlayerView.spaceHelper) != null) {
            c16455j.m71819d(longVodPlayerView.curUiType, i11);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J2 */
    public final void m71980J2(long progress) {
        LongVodSubtitleHelper longVodSubtitleHelper = this.subtitleHelper;
        if (longVodSubtitleHelper != null) {
            longVodSubtitleHelper.m71783i0(progress);
        }
        if (this.totalDuration <= 0) {
            this.totalDuration = this.playerControl.getDuration();
        }
        if (!this.formUserSeek) {
            long j11 = this.totalDuration;
            if (j11 > 0) {
                int i11 = (int) ((progress / j11) * j11);
                if (!this.isSeeking) {
                    long j12 = i11;
                    this.viewBinding.f77908o.f77946t.setProgress(j12);
                    this.viewBinding.f77909p.f77966n.setProgress(j12);
                }
            }
        }
        if (this.totalDuration >= 0) {
            String strM74969d = AbstractC17443m.m74969d(progress);
            String strM74969d2 = AbstractC17443m.m74969d(this.totalDuration);
            this.viewBinding.f77908o.f77948v.setText(strM74969d);
            this.viewBinding.f77908o.f77949w.setText(strM74969d2);
            this.viewBinding.f77909p.f77967o.setText(strM74969d + "/" + strM74969d2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final void m71982K0(LongVodPlayerView longVodPlayerView, View view) {
        if (longVodPlayerView.canNonSubscriberPlay) {
            longVodPlayerView.m72097r0();
        } else {
            C27089h.f82174a.m105449a("click{ivMiddleScreenChange 横竖屏切换按钮} --> 会员分辨率拦截");
        }
    }

    /* JADX INFO: renamed from: K1 */
    private final void m71983K1(String skuId, C24716b config) {
        C27089h.f82174a.m105449a(getClassTag() + " --> pay() --> 切换竖屏，支付逻辑 --> skuId = " + skuId + " -- config = " + config);
        Context context = getContext();
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            AbstractC25136k.m99058d(AbstractC3226v.m14968a(appCompatActivity), null, null, new LongVodPlayerView$pay$1$1(this, appCompatActivity, skuId, config, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: K2 */
    private final void m71984K2(C24715a bean) {
        String strM97060p;
        if (bean.m97049e() > 0) {
            strM97060p = bean.m97060p() + " " + AbstractC5112i.m23915b(bean.m97049e(), bean.m97056l(), bean.m97062r()) + AbstractC5112i.m23917d(bean.m97050f());
        } else {
            strM97060p = bean.m97060p();
        }
        this.viewBinding.f77910q.f77887i.setText(strM97060p);
        m72063i2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final void m71986L0(LongVodPlayerView longVodPlayerView, View view) {
        if (longVodPlayerView.curUiType == LongVodUiType.LAND) {
            backClick$default(longVodPlayerView, false, false, 3, null);
        } else {
            longVodPlayerView.m72097r0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public static final boolean m71987L1() {
        ConfigBean configBeanM110355d = C28615f.m110355d(C28615f.f87796c.m110363a(), PK_NEW_PLAYER_UI_KEY, false, 2, null);
        String value = configBeanM110355d != null ? configBeanM110355d.getValue() : null;
        return value == null || value.length() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public static final VideoDetailPlayDao m71988L2() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64865B1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final void m71990M0(LongVodPlayerView longVodPlayerView, View view) {
        backClick$default(longVodPlayerView, false, true, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public static final void m71991M1(LongVodPlayerView longVodPlayerView) {
        C23403e c23403e = longVodPlayerView.curTimeoutMediaSource;
        if (c23403e != null) {
            longVodPlayerView.playerControl.reset();
            longVodPlayerView.playerControl.stop();
            C16791c0 c16791c0 = longVodPlayerView.videoDot;
            if (c16791c0 != null) {
                c16791c0.m73425M(true);
            }
            C26866a.f81698a.m104912c(TAG, "playerTimeout,change 2 software decoder, path = " + c23403e.m92935k(), true);
            longVodPlayerView.playerControl.enableHardwareDecoder(false);
            longVodPlayerView.playerControl.setDataSource(c23403e);
            longVodPlayerView.playerControl.prepare();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public final void m71992M2(MotionEvent e11, boolean isDoubleClick) {
        if (C14557c.f51100a.m65671a(this.viewBinding.f77909p.f77957e.getId(), 500L)) {
            return;
        }
        C26866a.f81698a.m104912c(TAG, "videoPause click", true);
        if (m72090p1()) {
            if (C27287m.f83003a.m106330e()) {
                return;
            }
            ToastUtils.m27257r(com.transsion.baseui.R$string.base_network_fail);
            return;
        }
        View orLongVodPlayerBg = this.viewBinding.f77913t;
        Intrinsics.m97801g(orLongVodPlayerBg, "orLongVodPlayerBg");
        AbstractC26006c.m102054g(orLongVodPlayerBg);
        C16471u c16471u = this.mobileDataHelper;
        if (c16471u != null) {
            c16471u.m71853E();
        }
        if (this.playerControl.isComplete()) {
            if (m72086o1()) {
                return;
            }
            m72000O2();
        } else {
            if (this.playerControl.isPlaying()) {
                m72121x0(e11, isDoubleClick);
                return;
            }
            C16441c c16441c = this.adHelper;
            if (c16441c == null || !c16441c.m71798b()) {
                if (m72102s1()) {
                    m71952C2();
                } else {
                    this.playerControl.play();
                }
                this.isPressedPause = false;
                setPauseViewStatus(true);
                C27136c.f82250a.m105600a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final void m71994N0(LongVodPlayerView longVodPlayerView, View view) {
        m71996N2(longVodPlayerView, null, false, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N1 */
    public static final long m71995N1() {
        Long lX;
        ConfigBean configBeanM110355d = C28615f.m110355d(C28615f.f87796c.m110363a(), "sb_lv_play_timeout_dp", false, 2, null);
        String value = configBeanM110355d != null ? configBeanM110355d.getValue() : null;
        if (value == null || value.length() == 0 || (lX = StringsKt.m98218x(value)) == null) {
            return 12000L;
        }
        return lX.longValue();
    }

    /* JADX INFO: renamed from: N2 */
    static /* synthetic */ void m71996N2(LongVodPlayerView longVodPlayerView, MotionEvent motionEvent, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            motionEvent = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        longVodPlayerView.m71992M2(motionEvent, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final void m71998O0(LongVodPlayerView longVodPlayerView, View view) {
        C23621c c23621c = C23621c.f72132a;
        String str = longVodPlayerView.pageName;
        String str2 = longVodPlayerView.subSelectId;
        C24715a c24715a = longVodPlayerView.curBean;
        c23621c.m93451a(str, str2, c24715a != null ? c24715a.m97061q() : null, false);
        m71996N2(longVodPlayerView, null, false, 3, null);
    }

    /* JADX INFO: renamed from: O1 */
    private final void m71999O1() {
        long jM97055k = this.playProgress;
        long j11 = 0;
        if (jM97055k <= 2000) {
            C24715a c24715a = this.curBean;
            jM97055k = c24715a != null ? c24715a.m97055k() : 0L;
        }
        long j12 = this.totalDuration;
        if (jM97055k >= j12 - ((long) 5000)) {
            C26866a.a.m104908v(C26866a.f81698a, TAG, "prepareSeekTo,记录时长已经是播放完成,重置播放 " + jM97055k + ",<-> " + j12, false, 4, null);
        } else {
            j11 = jM97055k;
        }
        C26866a.a aVar = C26866a.f81698a;
        C24715a c24715a2 = this.curBean;
        C26866a.a.m104908v(aVar, TAG, "prepareSeekTo,progress:" + j11 + ", historyProgress:" + (c24715a2 != null ? Long.valueOf(c24715a2.m97055k()) : null), false, 4, null);
        if (j11 < 1000 || m72094q1()) {
            return;
        }
        aVar.m104912c(TAG, "prepareSeekTo,progress = " + j11, true);
        this.playerControl.seekTo(j11);
        m71980J2(j11);
        if (this.isReload || this.isMultipleResChangeResolution) {
            return;
        }
        m72131z2(Utils.m27275a().getString(R$string.long_vod_last_played_time) + " " + AbstractC17443m.m74969d(j11));
    }

    /* JADX INFO: renamed from: O2 */
    private final void m72000O2() {
        C16791c0 c16791c0 = this.videoDot;
        if (c16791c0 != null) {
            c16791c0.m73443p();
        }
        View view = this.replayLayout;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
        this.playerControl.seekTo(0L);
        this.playerControl.play();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final void m72002P0(LongVodPlayerView longVodPlayerView, View view) {
        longVodPlayerView.m71967G1();
    }

    /* JADX INFO: renamed from: P1 */
    private final void m72003P1() {
        C14492k.f50955a.m65317g(this);
        C27287m.f83003a.m106336l(this.netListener);
    }

    /* JADX INFO: renamed from: P2 */
    private final void m72004P2(ScaleMode scaleMode, String scaleModeName) {
        this.playerControl.setScaleMode(scaleMode);
        this.viewBinding.f77908o.f77952z.setText(scaleModeName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final void m72006Q0(LongVodPlayerView longVodPlayerView, View view) {
        Integer numM97062r;
        Context context = longVodPlayerView.getContext();
        String string = null;
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            PlayerSettingDialog playerSettingDialog = new PlayerSettingDialog();
            FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
            Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
            playerSettingDialog.show(supportFragmentManager, "PlayerSettingDialog");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C24715a c24715a = longVodPlayerView.curBean;
        linkedHashMap.put("subject_id", c24715a != null ? c24715a.m97059o() : null);
        C24715a c24715a2 = longVodPlayerView.curBean;
        linkedHashMap.put("subject_ops", c24715a2 != null ? c24715a2.m97061q() : null);
        C24715a c24715a3 = longVodPlayerView.curBean;
        linkedHashMap.put("ops", c24715a3 != null ? c24715a3.m97061q() : null);
        C24715a c24715a4 = longVodPlayerView.curBean;
        linkedHashMap.put("subject_name", c24715a4 != null ? c24715a4.m97060p() : null);
        C24715a c24715a5 = longVodPlayerView.curBean;
        linkedHashMap.put("title_name", c24715a5 != null ? c24715a5.m97064t() : null);
        C24715a c24715a6 = longVodPlayerView.curBean;
        if (c24715a6 != null && (numM97062r = c24715a6.m97062r()) != null) {
            string = numM97062r.toString();
        }
        linkedHashMap.put("subject_type", string);
        linkedHashMap.put("module_name", "video_setting");
        String str = longVodPlayerView.pageName;
        if (str != null) {
            C24662i.f75350a.m96881p(str, linkedHashMap);
        }
    }

    /* JADX INFO: renamed from: Q1 */
    private final void m72007Q1() {
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            C17444n orientationEventListener = getOrientationEventListener();
            if (orientationEventListener != null) {
                orientationEventListener.disable();
                unit = Unit.f75682a;
            } else {
                unit = null;
            }
            Result.m112707constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final void m72009R0(LongVodPlayerView longVodPlayerView, View view) {
        longVodPlayerView.m72040b2();
    }

    /* JADX INFO: renamed from: R1 */
    private final void m72010R1() {
        this.isReload = true;
        C24715a c24715a = this.curBean;
        if (c24715a != null) {
            m72016T1();
            this.playerControl.stop();
            setDataSource(c24715a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final void m72012S0(LongVodPlayerView longVodPlayerView, View view) {
        C24662i c24662i = C24662i.f75350a;
        String str = longVodPlayerView.pageName;
        if (str == null) {
            str = "";
        }
        c24662i.m96881p(str, longVodPlayerView.getReportNextMap());
        InterfaceC24450a.b bVar = longVodPlayerView.playerCallback;
        if (bVar != null) {
            bVar.mo70371a();
        }
    }

    /* JADX INFO: renamed from: S1 */
    private final void m72013S1() {
        Context context = getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        List<Fragment> listM14574y0 = ((FragmentActivity) context).getSupportFragmentManager().m14574y0();
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final void m72015T0(LongVodPlayerView longVodPlayerView, View view) {
        C23621c c23621c = C23621c.f72132a;
        String str = longVodPlayerView.pageName;
        String str2 = longVodPlayerView.subSelectId;
        C24715a c24715a = longVodPlayerView.curBean;
        c23621c.m93451a(str, str2, c24715a != null ? c24715a.m97061q() : null, true);
        m71996N2(longVodPlayerView, null, false, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T1 */
    public final void m72016T1() {
        View view = this.errorLayout;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final void m72018U0(LongVodPlayerView longVodPlayerView, View view) {
        longVodPlayerView.m72028X1(ToolBar.FORWARD);
        longVodPlayerView.m72089p0(true, false);
        longVodPlayerView.hideBottomController(false);
    }

    /* JADX INFO: renamed from: U1 */
    private final void m72019U1() {
        if (getParent() != null) {
            ViewParent parent = getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final void m72021V0(LongVodPlayerView longVodPlayerView, View view) {
        longVodPlayerView.m72028X1(ToolBar.BACKWARD);
        longVodPlayerView.hideBottomController(false);
        longVodPlayerView.m72089p0(false, false);
    }

    /* JADX INFO: renamed from: V1 */
    private final void m72022V1() {
        C16813j1 c16813j1 = this.localToastControl;
        if (c16813j1 != null) {
            c16813j1.m73487d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final void m72024W0(LongVodPlayerView longVodPlayerView, ScaleMode scaleMode, String scaleModeName) {
        Intrinsics.m97802h(scaleMode, "scaleMode");
        Intrinsics.m97802h(scaleModeName, "scaleModeName");
        longVodPlayerView.m72004P2(scaleMode, scaleModeName);
    }

    /* JADX INFO: renamed from: W1 */
    private final void m72025W1() {
        C25661j c25661j = this.viewBinding;
        AppCompatTextView tvPlayNext = c25661j.f77908o.f77951y;
        Intrinsics.m97801g(tvPlayNext, "tvPlayNext");
        if (tvPlayNext.getVisibility() == 0) {
            ConstraintLayout root = c25661j.f77908o.getRoot();
            Intrinsics.m97801g(root, "getRoot(...)");
            if (root.getVisibility() == 0) {
                C24662i c24662i = C24662i.f75350a;
                String str = this.pageName;
                if (str == null) {
                    str = "";
                }
                c24662i.m96872D(str, getReportNextMap());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final void m72027X0(LongVodPlayerView longVodPlayerView, View view) {
        longVodPlayerView.viewBinding.f77908o.f77940n.performClick();
    }

    /* JADX INFO: renamed from: X1 */
    private final void m72028X1(String type) {
        List listM97054j;
        C24717c c24717c;
        C24662i c24662i = C24662i.f75350a;
        String str = this.pageName;
        if (str == null) {
            str = "";
        }
        Pair pair = new Pair("module_name", type);
        C24715a c24715a = this.curBean;
        String strM97079c = null;
        Pair pair2 = new Pair("subject_id", c24715a != null ? c24715a.m97059o() : null);
        C24715a c24715a2 = this.curBean;
        Pair pairM97108a = TuplesKt.m97108a("ops", c24715a2 != null ? c24715a2.m97061q() : null);
        C24715a c24715a3 = this.curBean;
        if (c24715a3 != null && (listM97054j = c24715a3.m97054j()) != null && (c24717c = (C24717c) CollectionsKt.m97361k0(listM97054j)) != null) {
            strM97079c = c24717c.m97079c();
        }
        c24662i.m96881p(str, MapsKt.m97577l(pair, pair2, pairM97108a, new Pair("resource_id", strM97079c)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final void m72030Y0(LongVodPlayerView longVodPlayerView, View view) {
        longVodPlayerView.m72081n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public final void m72031Y1(C24715a bean, C24717c playStream) {
        DownloadBean downloadBean;
        UGCVideoBelongToCollection belongToCollection;
        UGCVideoBelongToCollection belongToCollection2;
        UGCVideoBelongToCollection belongToCollection3;
        if (bean.m97048d() != null) {
            downloadBean = bean.m97048d();
        } else {
            downloadBean = new DownloadBean(playStream.m97084h(), playStream.m97079c(), bean.m97060p(), "", StringsKt.m98218x(playStream.m97083g()), "", null, null, null, null, 0L, 0, 0, 0, 0L, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, 0L, 0, 0, null, null, 0L, null, null, 0L, 0, 0L, null, 0, null, null, false, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -64, -1, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
            UGCVideo uGCVideoM97065u = bean.m97065u();
            downloadBean.setUgcVideoId(uGCVideoM97065u != null ? uGCVideoM97065u.getUgcVideoId() : null);
            UGCVideo uGCVideoM97065u2 = bean.m97065u();
            downloadBean.setUgcVideoCollectionId((uGCVideoM97065u2 == null || (belongToCollection3 = uGCVideoM97065u2.getBelongToCollection()) == null) ? null : belongToCollection3.getCollectionId());
            UGCVideo uGCVideoM97065u3 = bean.m97065u();
            downloadBean.setUgcVideoName(uGCVideoM97065u3 != null ? uGCVideoM97065u3.getTitle() : null);
            UGCVideo uGCVideoM97065u4 = bean.m97065u();
            downloadBean.setUgcVideoCollectionName((uGCVideoM97065u4 == null || (belongToCollection2 = uGCVideoM97065u4.getBelongToCollection()) == null) ? null : belongToCollection2.getCollectionName());
            UGCVideo uGCVideoM97065u5 = bean.m97065u();
            downloadBean.setUgcVideoPosition((uGCVideoM97065u5 == null || (belongToCollection = uGCVideoM97065u5.getBelongToCollection()) == null) ? null : belongToCollection.getPosition());
            UGCVideo uGCVideoM97065u6 = bean.m97065u();
            downloadBean.setUgcVideoType(uGCVideoM97065u6 != null ? uGCVideoM97065u6.getCategory() : null);
            downloadBean.setSubjectId(bean.m97059o());
            downloadBean.setEp(bean.m97049e());
            downloadBean.setSe(bean.m97056l());
            downloadBean.setOps(bean.m97061q());
            downloadBean.setSubtitleIdType(playStream.m97080d());
        }
        C16791c0 c16791c0 = this.videoDot;
        if (c16791c0 != null) {
            c16791c0.m73430a();
        }
        C16791c0 c16791c1 = this.videoDot;
        if (c16791c1 != null) {
            c16791c1.m73413A(downloadBean, bean.m97052h());
        }
        C16791c0 c16791c2 = this.videoDot;
        if (c16791c2 != null) {
            c16791c2.m73429Q(bean.m97065u());
        }
        if (bean.m97066v() == PlayMimeType.DASH) {
            C16791c0 c16791c3 = this.videoDot;
            if (c16791c3 != null) {
                c16791c3.m73423K("3");
                return;
            }
            return;
        }
        if (bean.m97066v() == PlayMimeType.HLS) {
            C16791c0 c16791c4 = this.videoDot;
            if (c16791c4 != null) {
                c16791c4.m73423K(bean.m97067w() ? "5" : PrepareException.ERROR_NO_URL);
                return;
            }
            return;
        }
        if (playStream.m97086j()) {
            C16791c0 c16791c5 = this.videoDot;
            if (c16791c5 != null) {
                c16791c5.m73423K("4");
                return;
            }
            return;
        }
        C16791c0 c16791c6 = this.videoDot;
        if (c16791c6 != null) {
            c16791c6.m73423K("0");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final void m72033Z0(LongVodPlayerView longVodPlayerView, View view) {
        String strM97059o;
        view.setSelected(!view.isSelected());
        if (view.isSelected()) {
            Context context = longVodPlayerView.getContext();
            Intrinsics.m97800f(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).setRequestedOrientation(11);
            longVodPlayerView.hideBottomController(true);
            Intrinsics.m97799e(view);
            AbstractC26006c.m102058k(view);
        } else {
            Context context2 = longVodPlayerView.getContext();
            Intrinsics.m97800f(context2, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context2).setRequestedOrientation(6);
            longVodPlayerView.m72071k2(true);
        }
        C24662i c24662i = C24662i.f75350a;
        String str = longVodPlayerView.pageName;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Pair pair = new Pair("module_name", "lock");
        C24715a c24715a = longVodPlayerView.curBean;
        Pair pair2 = new Pair("ops", c24715a != null ? c24715a.m97061q() : null);
        C24715a c24715a2 = longVodPlayerView.curBean;
        if (c24715a2 != null && (strM97059o = c24715a2.m97059o()) != null) {
            str2 = strM97059o;
        }
        c24662i.m96881p(str, MapsKt.m97578m(pair, pair2, new Pair("subject_id", str2), new Pair(NativeComponentConstants.KEY_COMPONENT_TYPE, view.isSelected() ? "1" : "0")));
        C16791c0 c16791c0 = longVodPlayerView.videoDot;
        if (c16791c0 != null) {
            c16791c0.m73418F(view.isSelected());
        }
        longVodPlayerView.playerControl.enableGesture(true ^ view.isSelected());
        if (longVodPlayerView.getPkStyle()) {
            longVodPlayerView.viewBinding.f77908o.f77938l.setText(view.isSelected() ? longVodPlayerView.getContext().getString(com.transsion.baseui.R$string.play_tap_unlock) : longVodPlayerView.getContext().getString(com.transsion.baseui.R$string.play_tap_lock));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public final void m72034Z1() {
        this.curTimeoutMediaSource = null;
        C16791c0 c16791c0 = this.videoDot;
        if (c16791c0 != null) {
            c16791c0.m73425M(false);
        }
        this.playTimeoutHandler.removeCallbacks(this.playTimeoutRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final void m72036a1(LongVodPlayerView longVodPlayerView, View view) {
        InterfaceC24450a.b bVar = longVodPlayerView.playerCallback;
        if (bVar != null) {
            bVar.mo70373c(FloatActionType.ICON);
        }
    }

    /* JADX INFO: renamed from: a2 */
    private final void m72037a2() {
        if (this.isNewPlayer) {
            C26866a.f81698a.m104912c(TAG, "player resetPlayer", true);
            this.isReload = false;
            this.isFirstSetTracks = true;
            C16455j c16455j = this.spaceHelper;
            if (c16455j != null) {
                c16455j.m71818c();
            }
            this.playerControl.reset();
            setPauseViewStatus(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public final void m72039b1(C24715a bean, C24717c playStream) {
        if (playStream.m97081e().length() == 0) {
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, TAG, "initMp4Resolution, resolution = " + playStream.m97081e(), false, 4, null);
        C16791c0 c16791c0 = this.videoDot;
        if (c16791c0 != null) {
            c16791c0.m73424L(playStream.m97081e() + "P");
        }
        this.viewBinding.f77908o.f77947u.setText(playStream.m97081e() + "P");
        C16503r c16503r = C16503r.f55634a;
        m72127y2(C16503r.m71926l(c16503r, bean.m97054j(), 0, 2, null), C16503r.m71923c(c16503r, bean.m97054j(), 0, 2, null));
        this.resolutionList.clear();
        this.resolutionList.addAll(this.resolutionHelper.m71720f(playStream, bean.m97054j()));
    }

    /* JADX INFO: renamed from: b2 */
    private final void m72040b2() {
        LongVdPlayerConfigDialog longVdPlayerConfigDialog = new LongVdPlayerConfigDialog();
        longVdPlayerConfigDialog.m72167B0(this.pageName, LongVodPlayerConfigType.BITRATE, this.resolutionList, this.curBean, this);
        longVdPlayerConfigDialog.m65436k0(getContext(), "LongVdPlayerConfigDialog");
    }

    public static /* synthetic */ void backClick$default(LongVodPlayerView longVodPlayerView, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        longVodPlayerView.backClick(z11, z12);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0121  */
    /* JADX INFO: renamed from: c1 */
    private final void m72042c1(String tag, C24715a bean) {
        InterfaceC16634g interfaceC16634gM65590s;
        boolean z11;
        String strM97084h;
        if (this.orPlayerView != null) {
            return;
        }
        C23622d c23622d = new C23622d(null, false, 0, 0, 0, 0, 0, 0, 0L, 512, 0, false, false, false, false, false, null, 130559, null);
        C14453d c14453d = C14453d.f50863a;
        C23619a c23619a = new C23619a(c23622d, null, false, false, c14453d.m65162d(), c14453d.m65161c(), 10, null);
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        this.orPlayerView = new ORPlayerView(context, c23619a.m93445c() ? RenderType.SURFACE_VIEW : RenderType.TEXTURE_VIEW);
        C24717c c24717c = (C24717c) CollectionsKt.m97361k0(bean.m97054j());
        if (c24717c == null || (strM97084h = c24717c.m97084h()) == null) {
            interfaceC16634gM65590s = null;
            z11 = true;
        } else {
            C26866a.a aVar = C26866a.f81698a;
            C26866a.a.m104898f(aVar, TAG, "initPayer, id：" + AbstractC5114k.m23928k(strM97084h).hashCode() + ",", false, 4, null);
            if (m72094q1()) {
                MusicFloatManager.C14535a c14535a = MusicFloatManager.f51050h;
                interfaceC16634gM65590s = c14535a.m65598b().m65590s();
                String str = this.fragmentId;
                if (str != null) {
                    c14535a.m65598b().m65594w().add(str);
                }
                C26866a.a.m104898f(aVar, TAG, "music  mediaSourceId:" + c14535a.m65598b().m65589r(), false, 4, null);
                if (Intrinsics.m97797c(c14535a.m65598b().m65589r(), String.valueOf(AbstractC5114k.m23928k(strM97084h).hashCode()))) {
                    C26866a.a.m104898f(aVar, TAG, "music 是同一个音乐", false, 4, null);
                    z11 = false;
                } else {
                    C26866a.a.m104898f(aVar, TAG, "music 是不同的音乐", false, 4, null);
                    if (interfaceC16634gM65590s != null) {
                        interfaceC16634gM65590s.stop();
                    }
                    if (interfaceC16634gM65590s != null) {
                        interfaceC16634gM65590s.reset();
                    }
                    this.playProgress = 0L;
                }
            } else {
                interfaceC16634gM65590s = null;
            }
            z11 = true;
        }
        InterfaceC16634g interfaceC16634gM86578b = C21106a0.f66016a.m86578b(tag == null ? "" : tag);
        boolean z12 = interfaceC16634gM86578b == null && z11;
        this.isNewPlayer = z12;
        C26866a.a aVar2 = C26866a.f81698a;
        aVar2.m104912c(TAG, "initPayer, tag:" + tag + ", isNewPlayer:" + z12, true);
        if (interfaceC16634gM65590s != null) {
            C26866a.a.m104898f(aVar2, TAG, "initPayer, 音乐播放器复用", false, 4, null);
            InterfaceC16676a interfaceC16676a = this.playerControl;
            ORPlayerView oRPlayerView = this.orPlayerView;
            Intrinsics.m97799e(oRPlayerView);
            interfaceC16676a.setExistPlayer(c23619a, interfaceC16634gM65590s, oRPlayerView);
            View orLongVodPlayerBg = this.viewBinding.f77913t;
            Intrinsics.m97801g(orLongVodPlayerBg, "orLongVodPlayerBg");
            AbstractC26006c.m102054g(orLongVodPlayerBg);
            this.playerControl.play();
        } else if (interfaceC16634gM86578b != null) {
            C26866a.a.m104905r(aVar2, TAG, new String[]{"initPayer, float播放器复用"}, false, 4, null);
            View orLongVodPlayerBg2 = this.viewBinding.f77913t;
            Intrinsics.m97801g(orLongVodPlayerBg2, "orLongVodPlayerBg");
            AbstractC26006c.m102054g(orLongVodPlayerBg2);
            this.isFloatPlaying = true;
            InterfaceC16676a interfaceC16676a2 = this.playerControl;
            ORPlayerView oRPlayerView2 = this.orPlayerView;
            Intrinsics.m97799e(oRPlayerView2);
            interfaceC16676a2.setExistPlayer(c23619a, interfaceC16634gM86578b, oRPlayerView2);
        } else {
            InterfaceC16676a interfaceC16676a3 = this.playerControl;
            ORPlayerView oRPlayerView3 = this.orPlayerView;
            Intrinsics.m97799e(oRPlayerView3);
            interfaceC16676a3.initLongVodPlayer(c23619a, oRPlayerView3);
        }
        InterfaceC27135b.b.m105599a(InterfaceC27135b.f82245a.m105597c(), false, 1, null);
        this.playerControl.addPlayerListener(this.playerListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public static final int m72043c2() {
        return AbstractC5776a0.m27313a(298.0f);
    }

    /* JADX INFO: renamed from: d1 */
    private final void m72045d1() {
        SecondariesSeekBar seekBarLand = this.viewBinding.f77908o.f77946t;
        Intrinsics.m97801g(seekBarLand, "seekBarLand");
        m72048e1(seekBarLand);
        SecondariesSeekBar seekBarMiddle = this.viewBinding.f77909p.f77966n;
        Intrinsics.m97801g(seekBarMiddle, "seekBarMiddle");
        m72048e1(seekBarMiddle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public static final void m72046d2(LongVodPlayerView longVodPlayerView) {
        longVodPlayerView.m71954D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public final void m72047e0(boolean isPortrait) {
        LongVodUiType longVodUiType = this.curUiType;
        LongVodUiType longVodUiType2 = this.curUiRotation;
        boolean z11 = this.isPageResumed;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("旋转to竖屏: ");
        sb2.append(isPortrait);
        sb2.append("，curUiType：");
        sb2.append(longVodUiType);
        sb2.append("，curUiRation: ");
        sb2.append(longVodUiType2);
        sb2.append(", resume:");
        sb2.append(z11);
        if (this.viewBinding.f77908o.f77938l.isSelected()) {
            return;
        }
        LongVodUiType longVodUiType3 = isPortrait ? LongVodUiType.MIDDLE : LongVodUiType.LAND;
        if (!this.isPageResumed || this.curUiRotation == longVodUiType3 || longVodUiType3 == this.curUiType) {
            this.curUiRotation = longVodUiType3;
            return;
        }
        this.curUiRotation = longVodUiType3;
        C24662i.f75350a.m96885t("auto_screen", MapsKt.m97551f(new Pair("orientation", longVodUiType3 == LongVodUiType.LAND ? "land" : "port")));
        if (!isPortrait) {
            m72097r0();
        } else {
            m72013S1();
            backClick$default(this, false, false, 2, null);
        }
    }

    /* JADX INFO: renamed from: e1 */
    private final void m72048e1(SecondariesSeekBar seekBarView) {
        seekBarView.setOnSeekBarChangeListener(new C16510g(new Ref.LongRef()));
    }

    /* JADX INFO: renamed from: e2 */
    private final void m72049e2() {
        AbstractC25136k.m99058d(this.coroutineScopeIO, null, null, new LongVodPlayerView$saveUGCVideoHistory$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public final void m72050f0(boolean show, boolean autoHide) {
        if (show) {
            m72071k2(autoHide);
        } else {
            hideBottomController(autoHide);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public final void m72051f1() {
        C24715a c24715a = this.curBean;
        if (c24715a == null || !c24715a.m97067w()) {
            C26905b currentVideoFormat = this.playerControl.getCurrentVideoFormat();
            this.curVideoFormat = currentVideoFormat;
            if (currentVideoFormat != null && currentVideoFormat.m105018c() > 0) {
                this.resolutionHelper.m71721g(String.valueOf(currentVideoFormat.m105018c()));
            }
            C26866a.a.m104898f(C26866a.f81698a, TAG, "onPrepareInitBitrate, curVideoFormat = " + this.curVideoFormat, false, 4, null);
            if (this.curVideoFormat != null && !this.resolutionList.isEmpty()) {
                C26907d c26907d = this.dashVideoTracksGroup;
                if (c26907d != null) {
                    for (C26905b c26905b : c26907d.m105024b()) {
                        C26905b c26905b2 = this.curVideoFormat;
                        if (Intrinsics.m97797c(c26905b2 != null ? c26905b2.m105019d() : null, c26905b.m105019d())) {
                            this.viewBinding.f77908o.f77947u.setText(c26905b.m105018c() + "P");
                            C16503r c16503r = C16503r.f55634a;
                            m72127y2(C16503r.m71928o(c16503r, c26907d.m105024b(), 0, 2, null), C16503r.m71924e(c16503r, c26907d.m105024b(), 0, 2, null));
                            C16791c0 c16791c0 = this.videoDot;
                            if (c16791c0 == null) {
                                break;
                            }
                            c16791c0.m73424L(c26905b.m105018c() + "P");
                            break;
                        }
                    }
                }
                for (C24716b c24716b : this.resolutionList) {
                    String strM97074d = c24716b.m97074d();
                    C26905b c26905b3 = this.curVideoFormat;
                    Intrinsics.m97799e(c26905b3);
                    if (Intrinsics.m97797c(strM97074d, c26905b3.m105018c() + "P")) {
                        c24716b.m97076f(true);
                    }
                }
            }
            C27089h c27089h = C27089h.f82174a;
            String classTag = getClassTag();
            C26905b c26905b4 = this.curVideoFormat;
            c27089h.m105449a(classTag + " --> initStreamResolution() --> 流媒体开始播放 --> curVideoFormat.height = " + (c26905b4 != null ? Integer.valueOf(c26905b4.m105018c()) : null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2 */
    public static final ScreenRotationHelper m72052f2(LongVodPlayerView longVodPlayerView) {
        Context context = longVodPlayerView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        return new ScreenRotationHelper(context, new LongVodPlayerView$screenHelper$2$1(longVodPlayerView), new LongVodPlayerView$screenHelper$2$2(longVodPlayerView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final void m72053g0(LongVodPlayerView longVodPlayerView, C24716b c24716b, String str, Bundle result) {
        LifecycleCoroutineScope lifecycleCoroutineScopeM14968a;
        Intrinsics.m97802h(str, "<unused var>");
        Intrinsics.m97802h(result, "result");
        String string = result.getString("config_content");
        longVodPlayerView.m71946B0();
        if (string != null) {
            longVodPlayerView.getConfigViewModel().m72330c(C24716b.m97071b(c24716b, false, string, null, 5, null));
            Context context = longVodPlayerView.getContext();
            AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
            if (appCompatActivity == null || (lifecycleCoroutineScopeM14968a = AbstractC3226v.m14968a(appCompatActivity)) == null) {
                return;
            }
            AbstractC25136k.m99058d(lifecycleCoroutineScopeM14968a, null, null, new LongVodPlayerView$closeResolutionPanel$1$1(longVodPlayerView, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: g1 */
    private final void m72054g1(ViewGroup subtitleSyncView) {
        if (!m72106t1()) {
            Group groupControlPk = this.viewBinding.f77908o.f77934h;
            Intrinsics.m97801g(groupControlPk, "groupControlPk");
            AbstractC26006c.m102054g(groupControlPk);
            return;
        }
        C25661j c25661j = this.viewBinding;
        String str = this.pageName;
        List list = this.dubs;
        if (list == null) {
            Intrinsics.m97819y("dubs");
            list = null;
        }
        LongVodSubtitleHelper longVodSubtitleHelper = new LongVodSubtitleHelper(c25661j, str, list, new C16511h(), new Function1() { // from class: com.transsion.player.longvideo.ui.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LongVodPlayerView.m72058h1(this.f55854a, (DubsInfo) obj);
            }
        }, false, 32, null);
        longVodSubtitleHelper.m71784j0(C14453d.f50863a.m65162d());
        longVodSubtitleHelper.m71781f0(subtitleSyncView);
        this.subtitleHelper = longVodSubtitleHelper;
    }

    /* JADX INFO: renamed from: g2 */
    private final void m72055g2(boolean fullScreen, LongVodUiType curUiType) {
        C16471u c16471u;
        this.longVodPlayerViewAdHelper.m72321v4(curUiType);
        if (curUiType == LongVodUiType.LAND) {
            this.viewBinding.f77910q.f77884f.setVisibility(0);
        } else {
            this.viewBinding.f77910q.f77884f.setVisibility(8);
        }
        if (m72094q1()) {
            this.viewBinding.f77910q.f77884f.setVisibility(8);
        }
        m72062i1();
        C16449g c16449g = this.gameResHelper;
        if (c16449g != null) {
            c16449g.m71811h(curUiType);
        }
        LongVodSubtitleHelper longVodSubtitleHelper = this.subtitleHelper;
        if (longVodSubtitleHelper != null) {
            longVodSubtitleHelper.m71776W(curUiType);
        }
        C16441c c16441c = this.adHelper;
        if (c16441c != null) {
            c16441c.m71799c(curUiType);
        }
        m72063i2();
        C16791c0 c16791c0 = this.videoDot;
        if (c16791c0 != null) {
            c16791c0.m73439l(curUiType == LongVodUiType.MIDDLE ? LocalUiType.MIDDLE : LocalUiType.LAND);
        }
        ViewGroup.LayoutParams layoutParams = this.viewBinding.f77906m.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
        C17444n orientationEventListener = getOrientationEventListener();
        if (orientationEventListener != null) {
            Context context = getContext();
            Intrinsics.m97800f(context, "null cannot be cast to non-null type android.app.Activity");
            int iM74971b = orientationEventListener.m74971b((Activity) context);
            if (orientationEventListener.m74970a() != iM74971b) {
                orientationEventListener.m74972c(iM74971b);
            }
        }
        ViewGroup.LayoutParams layoutParams2 = this.viewBinding.f77917x.getLayoutParams();
        Intrinsics.m97800f(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b2 = (ConstraintLayout.C2308b) layoutParams2;
        if (fullScreen) {
            c2308b.f7974l = 0;
            c2308b.f7934I = "0";
            c2308b2.f7968i = -1;
            ((ViewGroup.MarginLayoutParams) c2308b2).bottomMargin = AbstractC23384a.m92908b(80);
        } else {
            c2308b.f7934I = "h,16:9";
            c2308b.f7974l = -1;
            c2308b2.f7968i = this.viewBinding.f77906m.getId();
            ((ViewGroup.MarginLayoutParams) c2308b2).bottomMargin = 0;
            this.viewBinding.f77908o.f77938l.setSelected(false);
        }
        ConstraintLayout root = this.viewBinding.f77908o.getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        root.setVisibility(fullScreen ? 0 : 8);
        ConstraintLayout root2 = this.viewBinding.f77909p.getRoot();
        Intrinsics.m97801g(root2, "getRoot(...)");
        root2.setVisibility(fullScreen ? 8 : 0);
        Log.e(TAG, "screenUIChange  fullScreen:" + fullScreen + "  rotation:" + getRotation());
        if (fullScreen) {
            if (this.playerViewParent == null) {
                ViewParent parent = getParent();
                this.playerViewParent = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            }
            ViewGroup viewGroup = this.fullscreenContainer;
            if (viewGroup != null) {
                Intrinsics.m97799e(viewGroup);
            } else {
                Context context2 = getContext();
                Intrinsics.m97800f(context2, "null cannot be cast to non-null type android.app.Activity");
                viewGroup = (ViewGroup) ((Activity) context2).findViewById(R.id.content);
            }
            m72019U1();
            viewGroup.addView(this, new FrameLayout.LayoutParams(-1, -1));
        } else {
            ViewGroup viewGroup2 = this.playerViewParent;
            if (viewGroup2 != null) {
                m72019U1();
                viewGroup2.addView(this);
            }
        }
        if (m72107t2() && (c16471u = this.mobileDataHelper) != null) {
            c16471u.m71851C(fullScreen);
        }
        this.viewBinding.f77903j.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getClassTag() {
        String simpleName = LongVodPlayerView.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16543a getConfigViewModel() {
        return (C16543a) this.configViewModel.getValue();
    }

    private final C16453i getLocalVideoLandForwardViewControl() {
        View viewInflate;
        if (this.localVideoLandForwardViewControl == null && (viewInflate = this.viewBinding.f77908o.f77925F.inflate()) != null) {
            C25654c c25654cM100982a = C25654c.m100982a(viewInflate);
            Intrinsics.m97801g(c25654cM100982a, "bind(...)");
            this.localVideoLandForwardViewControl = new C16453i(c25654cM100982a);
        }
        return this.localVideoLandForwardViewControl;
    }

    private final C16834q1 getLocalVideoMiddleForwardViewControl() {
        View viewInflate;
        if (this.localVideoMiddleForwardViewControl == null && (viewInflate = this.viewBinding.f77909p.f77969q.inflate()) != null) {
            C25654c c25654cM100982a = C25654c.m100982a(viewInflate);
            Intrinsics.m97801g(c25654cM100982a, "bind(...)");
            this.localVideoMiddleForwardViewControl = new C16834q1(c25654cM100982a);
        }
        return this.localVideoMiddleForwardViewControl;
    }

    private final C17444n getOrientationEventListener() {
        return (C17444n) this.orientationEventListener.getValue();
    }

    private final int getPendingIntentFlag() {
        if (Build.VERSION.SDK_INT >= 31) {
            return 67108864;
        }
        return ASTNode.NOJIT;
    }

    private final boolean getPkStyle() {
        return ((Boolean) this.pkStyle.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getPlayTimeoutStream() {
        return ((Number) this.playTimeoutStream.getValue()).longValue();
    }

    private final Map<String, String> getReportNextMap() {
        Pair pair = new Pair("module_name", "play_next");
        C24715a c24715a = this.curBean;
        Pair pair2 = new Pair("subject_id", c24715a != null ? c24715a.m97059o() : null);
        C24715a c24715a2 = this.curBean;
        return MapsKt.m97577l(pair, pair2, TuplesKt.m97108a("ops", c24715a2 != null ? c24715a2.m97061q() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getResolutionPanelTargetWidth() {
        return ((Number) this.resolutionPanelTargetWidth.getValue()).intValue();
    }

    private final ScreenRotationHelper getScreenHelper() {
        return (ScreenRotationHelper) this.screenHelper.getValue();
    }

    private final C17006o getSpeedViewModel() {
        return (C17006o) this.speedViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UGCVideoDetailPlayDao getUgcVideoDetailPlayDao() {
        return (UGCVideoDetailPlayDao) this.ugcVideoDetailPlayDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VideoDetailPlayDao getVideoDetailPlayDao() {
        return (VideoDetailPlayDao) this.videoDetailPlayDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final void m72057h0(LongVodPlayerView longVodPlayerView, String str, Bundle bundle) {
        Intrinsics.m97802h(str, "<unused var>");
        Intrinsics.m97802h(bundle, "<unused var>");
        longVodPlayerView.m71946B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final Unit m72058h1(LongVodPlayerView longVodPlayerView, DubsInfo it) {
        Intrinsics.m97802h(it, "it");
        Function1 function1 = longVodPlayerView.audioSelectCallback;
        if (function1 != null) {
            function1.invoke(it);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: h2 */
    private final void m72059h2() {
        Map mapM73433e;
        Map mapM73433e2;
        LongVodSubtitleHelper longVodSubtitleHelper = this.subtitleHelper;
        if (longVodSubtitleHelper != null) {
            C16791c0 c16791c0 = this.videoDot;
            if (c16791c0 != null && (mapM73433e2 = c16791c0.m73433e()) != null) {
                mapM73433e2.clear();
            }
            C16791c0 c16791c1 = this.videoDot;
            if (c16791c1 == null || (mapM73433e = c16791c1.m73433e()) == null) {
                return;
            }
            mapM73433e.putAll(longVodSubtitleHelper.m71772M());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final void m72061i0(LongVodPlayerView longVodPlayerView, C24716b c24716b, String str, Bundle result) {
        Intrinsics.m97802h(str, "<unused var>");
        Intrinsics.m97802h(result, "result");
        String string = result.getString("sku_id");
        String string2 = result.getString("config_content");
        if (string2 == null) {
            string2 = "";
        }
        longVodPlayerView.m71983K1(string, C24716b.m97071b(c24716b, false, string2, null, 5, null));
    }

    /* JADX INFO: renamed from: i1 */
    private final void m72062i1() {
        C16455j c16455j;
        View view = this.toastLayout;
        if (view == null) {
            return;
        }
        Intrinsics.m97799e(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
        LongVodUiType longVodUiType = this.curUiType;
        LongVodUiType longVodUiType2 = LongVodUiType.LAND;
        int iM71816a = 0;
        ((ViewGroup.MarginLayoutParams) c2308b).bottomMargin = longVodUiType == longVodUiType2 ? AbstractC5776a0.m27313a(72.0f) : 0;
        if (this.curUiType == longVodUiType2 && (c16455j = this.spaceHelper) != null) {
            iM71816a = c16455j.m71816a();
        }
        c2308b.setMarginStart(iM71816a);
        View view2 = this.toastLayout;
        Intrinsics.m97799e(view2);
        view2.setLayoutParams(c2308b);
    }

    /* JADX INFO: renamed from: i2 */
    private final void m72063i2() {
        AppCompatTextView vdTitle = this.viewBinding.f77910q.f77887i;
        Intrinsics.m97801g(vdTitle, "vdTitle");
        LongVodUiType longVodUiType = this.curUiType;
        LongVodUiType longVodUiType2 = LongVodUiType.MIDDLE;
        vdTitle.setVisibility(longVodUiType != longVodUiType2 ? 0 : 8);
        if (this.curUiType != longVodUiType2 || this.isRewardInterceptShowing) {
            AppCompatImageView ivBack = this.viewBinding.f77910q.f77880b;
            Intrinsics.m97801g(ivBack, "ivBack");
            AbstractC26006c.m102058k(ivBack);
        } else {
            AppCompatImageView ivBack2 = this.viewBinding.f77910q.f77880b;
            Intrinsics.m97801g(ivBack2, "ivBack");
            AbstractC26006c.m102055h(ivBack2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final void m72065j0(LongVodPlayerView longVodPlayerView, C24716b c24716b, String str, Bundle result) {
        Intrinsics.m97802h(str, "<unused var>");
        Intrinsics.m97802h(result, "result");
        String string = result.getString("config_content");
        if (string == null) {
            string = "";
        }
        longVodPlayerView.m72103s2(C24716b.m97071b(c24716b, false, string, null, 5, null));
    }

    /* JADX INFO: renamed from: j1 */
    private final void m72066j1() {
        C16791c0 c16791c0;
        ConstraintLayout root = this.viewBinding.f77908o.getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        AbstractC26006c.m102054g(root);
        if (this.contentType != LongVodContentType.SUBJECT) {
            AppCompatTextView tvDownloadView = this.viewBinding.f77910q.f77882d;
            Intrinsics.m97801g(tvDownloadView, "tvDownloadView");
            AbstractC26006c.m102058k(tvDownloadView);
        }
        this.spaceHelper = new C16455j(this.viewBinding);
        LiveData liveDataM72329b = getConfigViewModel().m72329b();
        Context context = getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        liveDataM72329b.m14851j((FragmentActivity) context, new C16516m(new Function1() { // from class: com.transsion.player.longvideo.ui.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LongVodPlayerView.m72070k1(this.f55847a, (C24716b) obj);
            }
        }));
        LiveData liveDataM73969b = getSpeedViewModel().m73969b();
        Context context2 = getContext();
        Intrinsics.m97800f(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        liveDataM73969b.m14851j((FragmentActivity) context2, new C16516m(new Function1() { // from class: com.transsion.player.longvideo.ui.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LongVodPlayerView.m72074l1(this.f55848a, (Float) obj);
            }
        }));
        post(new Runnable() { // from class: com.transsion.player.longvideo.ui.n0
            @Override // java.lang.Runnable
            public final void run() {
                LongVodPlayerView.m72078m1(this.f55850a);
            }
        });
        if (m72106t1() || m72094q1()) {
            this.videoDot = new C16791c0();
            if (m72094q1() && (c16791c0 = this.videoDot) != null) {
                c16791c0.m73417E("music_play");
            }
        }
        C16791c0 c16791c1 = this.videoDot;
        if (c16791c1 != null) {
            c16791c1.m73434g();
        }
        C16791c0 c16791c2 = this.videoDot;
        if (c16791c2 != null) {
            c16791c2.m73421I(this.playerControl);
        }
        if (m72094q1()) {
            this.viewBinding.f77910q.f77884f.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public final void m72067j2() {
        String strM97077a;
        long j11 = this.totalDuration;
        if (j11 == 0) {
            C24717c c24717c = this.playingStream;
            j11 = (c24717c == null || (strM97077a = c24717c.m97077a()) == null) ? 0L : Long.parseLong(strM97077a) * ((long) 1000);
        }
        this.longVodPlayerViewAdHelper.m72730L1(j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C16543a m72069k0(LongVodPlayerView longVodPlayerView) {
        Context context = longVodPlayerView.getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (C16543a) new C3227v0((FragmentActivity) context).m14969a(C16543a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final Unit m72070k1(LongVodPlayerView longVodPlayerView, C24716b c24716b) {
        int i11 = C16505b.f55725a[c24716b.m97073c().ordinal()];
        if (i11 == 1) {
            Intrinsics.m97799e(c24716b);
            longVodPlayerView.m72130z1(c24716b);
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.m97799e(c24716b);
            longVodPlayerView.m71963F1(c24716b);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public final void m72071k2(boolean autoHide) {
        if (!this.showToolbarAlways && AbstractC5779c.m27333j()) {
            if (this.viewBinding.f77908o.f77938l.isSelected()) {
                AppCompatTextView ivLock = this.viewBinding.f77908o.f77938l;
                Intrinsics.m97801g(ivLock, "ivLock");
                AppCompatTextView ivLock2 = this.viewBinding.f77908o.f77938l;
                Intrinsics.m97801g(ivLock2, "ivLock");
                ivLock.setVisibility(ivLock2.getVisibility() == 0 ? 8 : 0);
                return;
            }
            AppCompatTextView ivLock3 = this.viewBinding.f77908o.f77938l;
            Intrinsics.m97801g(ivLock3, "ivLock");
            ivLock3.setVisibility(0);
            if (autoHide) {
                hideBottomController(false);
            } else {
                this.handler.removeCallbacks(this.runnable);
            }
            ConstraintLayout clBottomControl = this.viewBinding.f77908o.f77930d;
            Intrinsics.m97801g(clBottomControl, "clBottomControl");
            clBottomControl.setVisibility(0);
            ConstraintLayout root = this.viewBinding.f77908o.f77929c.getRoot();
            Intrinsics.m97801g(root, "getRoot(...)");
            root.setVisibility(0);
            if (getPkStyle() && m72106t1()) {
                Group groupControlPk = this.viewBinding.f77908o.f77934h;
                Intrinsics.m97801g(groupControlPk, "groupControlPk");
                groupControlPk.setVisibility(0);
            }
            ConstraintLayout root2 = this.viewBinding.f77910q.getRoot();
            Intrinsics.m97801g(root2, "getRoot(...)");
            root2.setVisibility(0);
            InterfaceC24450a.b bVar = this.playerCallback;
            if (bVar != null) {
                bVar.mo70376f(true);
            }
            View landGradientTop = this.viewBinding.f77908o.f77942p;
            Intrinsics.m97801g(landGradientTop, "landGradientTop");
            landGradientTop.setVisibility(0);
            View landGradientBottom = this.viewBinding.f77908o.f77941o;
            Intrinsics.m97801g(landGradientBottom, "landGradientBottom");
            landGradientBottom.setVisibility(0);
            AppCompatTextView tvPlayNext = this.viewBinding.f77908o.f77951y;
            Intrinsics.m97801g(tvPlayNext, "tvPlayNext");
            tvPlayNext.setVisibility(this.isHasNext ? 0 : 8);
            View middleGradientTop = this.viewBinding.f77909p.f77963k;
            Intrinsics.m97801g(middleGradientTop, "middleGradientTop");
            middleGradientTop.setVisibility(0);
            LinearLayout llMiddleBottomController = this.viewBinding.f77909p.f77961i;
            Intrinsics.m97801g(llMiddleBottomController, "llMiddleBottomController");
            llMiddleBottomController.setVisibility(0);
            View middleGradientBottom = this.viewBinding.f77909p.f77962j;
            Intrinsics.m97801g(middleGradientBottom, "middleGradientBottom");
            middleGradientBottom.setVisibility(0);
            m72025W1();
            View viewFindViewById = findViewById(R.id.message);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    private final void m72073l0() {
        C16449g c16449g = new C16449g();
        c16449g.mo71805c(this.pageName, this.viewBinding);
        this.gameResHelper = c16449g;
        this.mobileDataHelper = new C16471u(this.viewBinding, new Function0() { // from class: com.transsion.player.longvideo.ui.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LongVodPlayerView.m72077m0(this.f55856a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final Unit m72074l1(LongVodPlayerView longVodPlayerView, Float f11) {
        Intrinsics.m97799e(f11);
        longVodPlayerView.setSpeed(f11.floatValue());
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: l2 */
    static /* synthetic */ void m72075l2(LongVodPlayerView longVodPlayerView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        longVodPlayerView.m72071k2(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final Unit m72077m0(LongVodPlayerView longVodPlayerView) {
        Context context = longVodPlayerView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        if (!AbstractC14556b.m65670a(context)) {
            longVodPlayerView.getScreenHelper().m65135h();
        }
        longVodPlayerView.m71958E0();
        m71996N2(longVodPlayerView, null, false, 3, null);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final void m72078m1(LongVodPlayerView longVodPlayerView) {
        longVodPlayerView.m72003P1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public final void m72079m2() {
        C24715a c24715a = this.curBean;
        if (c24715a == null || c24715a.m97047c().length() == 0) {
            return;
        }
        C24717c c24717c = (C24717c) CollectionsKt.m97361k0(c24715a.m97054j());
        boolean zM97085i = c24717c != null ? c24717c.m97085i() : false;
        C26866a.f81698a.m104912c(TAG, "showCoverBg, isMp3:" + zM97085i, true);
        if (this.pageType != LongVodPageType.TRAILER && !zM97085i) {
            AppCompatImageView orLongVodIvBg = this.viewBinding.f77912s;
            Intrinsics.m97801g(orLongVodIvBg, "orLongVodIvBg");
            AbstractC26006c.m102054g(orLongVodIvBg);
            return;
        }
        AppCompatImageView orLongVodIvBg2 = this.viewBinding.f77912s;
        Intrinsics.m97801g(orLongVodIvBg2, "orLongVodIvBg");
        AbstractC26006c.m102058k(orLongVodIvBg2);
        C23860f.a aVar = C23860f.f72909a;
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        C23860f.b bVarM94473l = aVar.m94457m(context).m94468g(c24715a.m97047c()).m94473l(c24715a.m97063s());
        AppCompatImageView orLongVodIvBg3 = this.viewBinding.f77912s;
        Intrinsics.m97801g(orLongVodIvBg3, "orLongVodIvBg");
        bVarM94473l.m94465d(orLongVodIvBg3);
    }

    /* JADX INFO: renamed from: n0 */
    private final void m72081n0() {
        Navigator.m61845x(TheRouter.m61773c("/download/ugc_my_downloads"), getContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public final boolean m72082n1() {
        return InterfaceC27138e.f82251a.m105606b().mo86576k() || m72102s1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public final void m72083n2(boolean isNoNet) {
        TextView textView;
        if (this.errorLayout == null) {
            View viewInflate = this.viewBinding.f77890C.inflate();
            this.errorLayout = viewInflate;
            if (viewInflate != null) {
                final TextView textView2 = (TextView) viewInflate.findViewById(R$id.tv_fail_left_btn);
                Intrinsics.m97799e(textView2);
                textView2.setVisibility(isNoNet ? 0 : 8);
                textView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LongVodPlayerView.m72091p2(textView2, view);
                    }
                });
                ((TextView) viewInflate.findViewById(R$id.tv_fail_right_btn)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LongVodPlayerView.m72095q2(this.f55846a, view);
                    }
                });
                ((ImageView) viewInflate.findViewById(R$id.iv_fail_back)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.w
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LongVodPlayerView.m72099r2(this.f55870a, view);
                    }
                });
            }
        }
        View view = this.errorLayout;
        if (view != null && (textView = (TextView) view.findViewById(R$id.tv_fail_title)) != null) {
            textView.setText(Utils.m27275a().getString(isNoNet ? R$string.long_vod_load_failed : com.p282tn.lib.widget.R$string.error_load_failed));
        }
        m71944A2(false);
        View view2 = this.replayLayout;
        if (view2 != null) {
            AbstractC26006c.m102054g(view2);
        }
        if (this.curUiType == LongVodUiType.MIDDLE) {
            setPauseViewStatus(false);
        }
        this.playerControl.pause();
        View view3 = this.errorLayout;
        if (view3 != null) {
            AbstractC26006c.m102058k(view3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public final void m72085o0() {
        if (this.resumeSpeed > 0.0f) {
            m72115v2(false);
            setSpeed(this.resumeSpeed);
            String str = this.pageName;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.pressTime;
            C24715a c24715a = this.curBean;
            String strM97059o = c24715a != null ? c24715a.m97059o() : null;
            C24715a c24715a2 = this.curBean;
            AbstractC5119p.m23954b(str, jElapsedRealtime, strM97059o, c24715a2 != null ? c24715a2.m97061q() : null, Float.valueOf(this.resumeSpeed));
            this.resumeSpeed = 0.0f;
        }
    }

    /* JADX INFO: renamed from: o1 */
    private final boolean m72086o1() {
        boolean z11 = this.curUiType == LongVodUiType.LAND && this.viewBinding.f77908o.f77931e.getVisibility() == 0;
        this.isCompletionBlock = z11;
        return z11;
    }

    /* JADX INFO: renamed from: o2 */
    static /* synthetic */ void m72087o2(LongVodPlayerView longVodPlayerView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        longVodPlayerView.m72083n2(z11);
    }

    /* JADX INFO: renamed from: p0 */
    private final void m72089p0(boolean forward, boolean show) {
        C16791c0 c16791c0 = this.videoDot;
        if (c16791c0 != null) {
            c16791c0.m73444q();
        }
        if (show) {
            if (this.curUiType == LongVodUiType.MIDDLE) {
                C16834q1 localVideoMiddleForwardViewControl = getLocalVideoMiddleForwardViewControl();
                if (localVideoMiddleForwardViewControl != null) {
                    localVideoMiddleForwardViewControl.m73497e(forward);
                }
            } else {
                C16453i localVideoLandForwardViewControl = getLocalVideoLandForwardViewControl();
                if (localVideoLandForwardViewControl != null) {
                    localVideoLandForwardViewControl.m71815d(forward);
                }
            }
        }
        long jI = forward ? RangesKt.m97939i(this.pressSeekProgress + ((long) 10000), this.totalDuration) : RangesKt.m97936f(this.pressSeekProgress - ((long) 10000), 0L);
        this.pressSeekProgress = jI;
        this.playerControl.seekTo(jI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public final boolean m72090p1() {
        View view = this.errorLayout;
        return (view == null || view == null || view.getVisibility() != 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public static final void m72091p2(TextView textView, View view) {
        try {
            Result.Companion companion = Result.INSTANCE;
            NetworkUtils.m27175v();
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: q0 */
    static /* synthetic */ void m72093q0(LongVodPlayerView longVodPlayerView, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        longVodPlayerView.m72089p0(z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public final boolean m72094q1() {
        return this.pageType == LongVodPageType.MUSIC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public static final void m72095q2(LongVodPlayerView longVodPlayerView, View view) {
        InterfaceC24450a.b bVar = longVodPlayerView.playerCallback;
        if ((bVar == null || !bVar.mo70372b()) && C27287m.f83003a.m106330e()) {
            longVodPlayerView.m72010R1();
        }
    }

    /* JADX INFO: renamed from: r0 */
    private final void m72097r0() {
        View view;
        if (!this.playerControl.isPlaying() && !this.playerControl.isComplete() && !m72090p1() && !this.isAdShowing && !this.isRewardInterceptShowing) {
            if (m72102s1()) {
                m71952C2();
            } else {
                this.playerControl.play();
            }
            View view2 = this.replayLayout;
            if (view2 != null) {
                Intrinsics.m97799e(view2);
                if (AbstractC26006c.m102056i(view2) && (view = this.replayLayout) != null) {
                    AbstractC26006c.m102054g(view);
                }
            }
        }
        C27136c.f82250a.m105600a();
        this.curUiType = LongVodUiType.LAND;
        Context context = getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        ImmersionBar.with(fragmentActivity).hideBar(BarHide.FLAG_HIDE_BAR).init();
        fragmentActivity.setRequestedOrientation(6);
        this.viewBinding.f77889B.setPadding(0, 0, 0, 0);
        m72055g2(true, this.curUiType);
    }

    /* JADX INFO: renamed from: r1 */
    private final boolean m72098r1() {
        return (!this.isMultiplePlayer || m72094q1() || this.hideFloat) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public static final void m72099r2(LongVodPlayerView longVodPlayerView, View view) {
        backClick$default(longVodPlayerView, false, true, 1, null);
    }

    /* JADX INFO: renamed from: s0 */
    private final Intent m72101s0(C24717c playStream, String pageName) {
        DownloadBean downloadBeanM97048d;
        DownloadBean downloadBeanM97048d2;
        UGCVideo uGCVideoM97065u;
        UGCVideoBelongToCollection belongToCollection;
        UGCVideo uGCVideoM97065u2;
        Intent intent = new Intent();
        int i11 = C16505b.f55726b[this.contentType.ordinal()];
        String ugcVideoId = null;
        if (i11 == 1) {
            intent.putExtra("path", "/playvideo/music_detail");
            C24715a c24715a = this.curBean;
            intent.putExtra("id", c24715a != null ? c24715a.m97059o() : null);
            intent.putExtra("isMusicLikedFragment", this.isMusicLikedFragment);
        } else if (i11 == 2) {
            intent.putExtra("path", "/ugc_video/local_detail");
            C24715a c24715a2 = this.curBean;
            intent.putExtra("resource_id", (c24715a2 == null || (downloadBeanM97048d2 = c24715a2.m97048d()) == null) ? null : downloadBeanM97048d2.getResourceId());
            C24715a c24715a3 = this.curBean;
            if (c24715a3 != null && (downloadBeanM97048d = c24715a3.m97048d()) != null) {
                ugcVideoId = downloadBeanM97048d.getUgcVideoId();
            }
            intent.putExtra("id", ugcVideoId);
            intent.putExtra("isMusicLikedFragment", this.isMusicLikedFragment);
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            intent.putExtra("path", "/ugc_video/detail");
            C24715a c24715a4 = this.curBean;
            intent.putExtra("id", (c24715a4 == null || (uGCVideoM97065u2 = c24715a4.m97065u()) == null) ? null : uGCVideoM97065u2.getUgcVideoId());
            C24715a c24715a5 = this.curBean;
            if (c24715a5 != null && (uGCVideoM97065u = c24715a5.m97065u()) != null && (belongToCollection = uGCVideoM97065u.getBelongToCollection()) != null) {
                ugcVideoId = belongToCollection.getCollectionId();
            }
            intent.putExtra("collection_id", ugcVideoId);
            intent.putExtra("isMusicLikedFragment", this.isMusicLikedFragment);
        }
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public final boolean m72102s1() {
        FrameLayout flUGCAutoPlayGroup = this.viewBinding.f77909p.f77954b;
        Intrinsics.m97801g(flUGCAutoPlayGroup, "flUGCAutoPlayGroup");
        return flUGCAutoPlayGroup.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: s2 */
    private final void m72103s2(C24716b config) {
        InterfaceC22998b interfaceC22998b;
        Context context = getContext();
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity == null || (interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0])) == null) {
            return;
        }
        InterfaceC22998b.a.m91587c(interfaceC22998b, appCompatActivity, MemberSource.SOURCE_STREAM_RESOLUTION_DIALOG, new C16517n(config), false, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPauseViewStatus(boolean playing) {
        this.viewBinding.f77908o.f77937k.setTag(Boolean.valueOf(playing));
        this.viewBinding.f77909p.f77957e.setTag(Boolean.valueOf(playing));
        C26866a.a.m104898f(C26866a.f81698a, TAG, "setPauseViewStatus playing = " + playing, false, 4, null);
        if (playing) {
            this.viewBinding.f77908o.f77937k.setImageResource(R$mipmap.icon_player_pause);
            this.viewBinding.f77908o.f77929c.f70196d.setImageResource(R$drawable.ic_player_pause);
            this.viewBinding.f77909p.f77957e.setImageResource(R$mipmap.icon_player_pause);
        } else {
            this.viewBinding.f77908o.f77937k.setImageResource(R$mipmap.icon_player_play);
            this.viewBinding.f77908o.f77929c.f70196d.setImageResource(R$drawable.ic_player_play);
            this.viewBinding.f77909p.f77957e.setImageResource(R$mipmap.icon_player_play);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPlayerDataSourceAdPrepare(C24717c playStream) {
        LinkedHashMap linkedHashMap;
        LifecycleCoroutineScope lifecycleCoroutineScopeM14968a;
        this.playingStream = playStream;
        if (playStream.m97082f().length() > 0) {
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("cookie", playStream.m97082f());
        } else {
            linkedHashMap = null;
        }
        C23403e c23403e = new C23403e(String.valueOf(AbstractC5114k.m23928k(playStream.m97084h()).hashCode()), playStream.m97084h(), 0, playStream.m97078b(), m72105t0(playStream), 4, null);
        MusicFloatManager.C14535a c14535a = MusicFloatManager.f51050h;
        c14535a.m65598b().m65583C(c23403e.m92929e());
        c14535a.m65598b().m65582B(c23403e.m92933i());
        c23403e.m92940q(linkedHashMap);
        C26866a.a aVar = C26866a.f81698a;
        C24715a c24715a = this.curBean;
        Integer numValueOf = c24715a != null ? Integer.valueOf(c24715a.m97056l()) : null;
        C24715a c24715a2 = this.curBean;
        Integer numValueOf2 = c24715a2 != null ? Integer.valueOf(c24715a2.m97049e()) : null;
        aVar.m104912c(TAG, "setPlayerDataSourceAdPrepare,  se:" + numValueOf + " ep:" + numValueOf2 + ", resolution:" + playStream.m97081e() + "，id：" + c23403e.m92929e() + ",url:" + playStream.m97084h(), true);
        m72034Z1();
        this.curTimeoutMediaSource = c23403e;
        this.playerControl.clearScreen();
        this.playerControl.setDataSource(c23403e);
        Context context = getContext();
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity == null || (lifecycleCoroutineScopeM14968a = AbstractC3226v.m14968a(appCompatActivity)) == null) {
            return;
        }
        AbstractC25136k.m99058d(lifecycleCoroutineScopeM14968a, null, null, new C165221(null), 3, null);
    }

    /* JADX INFO: renamed from: t0 */
    private final MediaItem m72105t0(C24717c playStream) {
        LongVodPageType longVodPageType = this.pageType;
        LongVodPageType longVodPageType2 = LongVodPageType.MUSIC;
        if (longVodPageType != longVodPageType2) {
            return null;
        }
        C24715a c24715a = this.curBean;
        String strM97064t = c24715a != null ? c24715a.m97064t() : null;
        C24715a c24715a2 = this.curBean;
        String strM97059o = c24715a2 != null ? c24715a2.m97059o() : null;
        C24715a c24715a3 = this.curBean;
        String strM97047c = c24715a3 != null ? c24715a3.m97047c() : null;
        PendingIntent pendingIntentM72109u0 = m72109u0(playStream);
        Intent intentM72101s0 = m72101s0(playStream, "media_music_float_notification");
        MusicFloatManager musicFloatManagerM65598b = MusicFloatManager.f51050h.m65598b();
        C24715a c24715a4 = this.curBean;
        String strM65591t = musicFloatManagerM65598b.m65591t(c24715a4 != null ? c24715a4.m97059o() : null);
        boolean z11 = this.pageType == longVodPageType2;
        String str = this.pageName;
        C24715a c24715a5 = this.curBean;
        return new MediaItem(strM97064t, "", strM97047c, null, null, null, pendingIntentM72109u0, intentM72101s0, strM97059o, strM65591t, Boolean.valueOf(z11), str, null, c24715a5 != null ? c24715a5.m97061q() : null, 4152, null);
    }

    /* JADX INFO: renamed from: t1 */
    private final boolean m72106t1() {
        LongVodPageType longVodPageType = this.pageType;
        return longVodPageType == LongVodPageType.STREAM || longVodPageType == LongVodPageType.LOCAL_VIDEO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2 */
    public final boolean m72107t2() {
        C24717c c24717c;
        C16471u c16471u;
        C27287m c27287m = C27287m.f83003a;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        boolean z11 = c27287m.m106332h(applicationM27275a) && (c24717c = this.curPlayStream) != null && c24717c.m97086j() && (c16471u = this.mobileDataHelper) != null && c16471u.m71855v();
        return (z11 && this.contentType == LongVodContentType.UGC_VIDEO_ONLINE) ? !C14496b.f50966a.m65344b().getBoolean("k_UGC_VIDEO_AUTO_PLAY", false) : z11;
    }

    /* JADX INFO: renamed from: u0 */
    private final PendingIntent m72109u0(C24717c playStream) {
        DownloadBean downloadBeanM97048d;
        DownloadBean downloadBeanM97048d2;
        DownloadBean downloadBeanM97048d3;
        UGCVideo uGCVideoM97065u;
        UGCVideoBelongToCollection belongToCollection;
        UGCVideo uGCVideoM97065u2;
        UGCVideo uGCVideoM97065u3;
        InterfaceC27316b interfaceC27316b = (InterfaceC27316b) TheRouter.m61774d(InterfaceC27316b.class, new Object[0]);
        StringBuilder sb2 = new StringBuilder("oneroom://com.community.oneroom?type=");
        int i11 = C16505b.f55726b[this.contentType.ordinal()];
        Intent intent = null;
        if (i11 == 1) {
            sb2.append(m72094q1() ? "/playvideo/music_detail" : "/movie/detail");
            sb2.append(UrlUtils.AND_MARK);
            sb2.append("extra_resource_id");
            sb2.append(UrlUtils.EQUAL_MARK);
            sb2.append(playStream.m97079c());
            sb2.append(UrlUtils.AND_MARK);
            sb2.append("subject_type");
            sb2.append(UrlUtils.EQUAL_MARK);
            C24715a c24715a = this.curBean;
            sb2.append(c24715a != null ? c24715a.m97062r() : null);
            sb2.append(UrlUtils.AND_MARK);
            sb2.append(UrlUtils.AND_MARK);
            sb2.append("season");
            sb2.append(UrlUtils.EQUAL_MARK);
            C24715a c24715a2 = this.curBean;
            sb2.append(c24715a2 != null ? c24715a2.m97056l() : 0);
            sb2.append(UrlUtils.AND_MARK);
            sb2.append(UrlUtils.AND_MARK);
            sb2.append("episode");
            sb2.append(UrlUtils.EQUAL_MARK);
            C24715a c24715a3 = this.curBean;
            sb2.append(c24715a3 != null ? c24715a3.m97049e() : 0);
            sb2.append(UrlUtils.AND_MARK);
            sb2.append(UrlUtils.AND_MARK);
            sb2.append("id");
            sb2.append(UrlUtils.EQUAL_MARK);
            C24715a c24715a4 = this.curBean;
            sb2.append(c24715a4 != null ? c24715a4.m97059o() : null);
            sb2.append(UrlUtils.AND_MARK);
            sb2.append(UrlUtils.AND_MARK);
            sb2.append("ops");
            sb2.append(UrlUtils.EQUAL_MARK);
            C24715a c24715a5 = this.curBean;
            sb2.append(c24715a5 != null ? c24715a5.m97061q() : null);
            sb2.append(UrlUtils.AND_MARK);
        } else if (i11 == 2) {
            sb2.append("/ugc_video/local_detail");
            sb2.append("&resource_id=");
            C24715a c24715a6 = this.curBean;
            sb2.append((c24715a6 == null || (downloadBeanM97048d3 = c24715a6.m97048d()) == null) ? null : downloadBeanM97048d3.getResourceId());
            sb2.append("&id=");
            C24715a c24715a7 = this.curBean;
            sb2.append((c24715a7 == null || (downloadBeanM97048d2 = c24715a7.m97048d()) == null) ? null : downloadBeanM97048d2.getUgcVideoId());
            sb2.append("&collection_id=");
            C24715a c24715a8 = this.curBean;
            sb2.append((c24715a8 == null || (downloadBeanM97048d = c24715a8.m97048d()) == null) ? null : downloadBeanM97048d.getUgcVideoCollectionId());
            sb2.append(UrlUtils.AND_MARK);
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            sb2.append("/ugc_video/detail");
            sb2.append("&id=");
            C24715a c24715a9 = this.curBean;
            sb2.append((c24715a9 == null || (uGCVideoM97065u3 = c24715a9.m97065u()) == null) ? null : uGCVideoM97065u3.getUgcVideoId());
            sb2.append("&collection_id=");
            C24715a c24715a10 = this.curBean;
            sb2.append((c24715a10 == null || (uGCVideoM97065u2 = c24715a10.m97065u()) == null) ? null : uGCVideoM97065u2.getUgcVideoId());
            sb2.append(UrlUtils.AND_MARK);
            sb2.append("collection_id");
            sb2.append(UrlUtils.EQUAL_MARK);
            C24715a c24715a11 = this.curBean;
            sb2.append((c24715a11 == null || (uGCVideoM97065u = c24715a11.m97065u()) == null || (belongToCollection = uGCVideoM97065u.getBelongToCollection()) == null) ? null : belongToCollection.getCollectionId());
            sb2.append(UrlUtils.AND_MARK);
        }
        sb2.append("extra_page_from");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(this.pageName);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("is_music_liked_fragment");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(this.isMusicLikedFragment);
        sb2.append(UrlUtils.AND_MARK);
        if (interfaceC27316b != null) {
            Application applicationM27275a = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a, "getApp(...)");
            Intent intentMo94643a = interfaceC27316b.mo94643a(applicationM27275a);
            if (intentMo94643a != null) {
                intentMo94643a.addFlags(603979776);
                intentMo94643a.setData(Uri.parse(sb2.toString()));
                intent = intentMo94643a;
            }
        }
        return PendingIntent.getActivity(Utils.m27275a(), 0, intent, getPendingIntentFlag());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public final void m72110u1(boolean keepScreenOn) {
        this.viewBinding.getRoot().setKeepScreenOn(keepScreenOn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public final void m72111u2(boolean isShow, String msg) {
        C16496k.f55626a.m71921a(getClassTag() + " --> showNoResolutionTip() --> isShow = " + isShow + " --> msg = " + msg);
        if (!isShow) {
            this.viewBinding.f77911r.setVisibility(8);
            return;
        }
        this.playerControl.pause();
        this.viewBinding.f77911r.showCover(this.curBean, this.pageName);
        this.viewBinding.f77911r.setListener(new C16518o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public final void m72113v0() {
        C26866a.f81698a.m104912c(TAG, "onPrepare2PlayVideo, is mobile , pause video", true);
        this.isMobilePaused = true;
        m72117w0();
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        if (!AbstractC14556b.m65670a(context)) {
            getScreenHelper().m65136l();
        }
        C16471u c16471u = this.mobileDataHelper;
        if (c16471u != null) {
            c16471u.m71854q();
        }
    }

    /* JADX INFO: renamed from: v1 */
    private final void m72114v1(boolean vis) {
        ProgressBar progressBar = this.viewBinding.f77908o.f77929c.f70198f;
        Intrinsics.m97801g(progressBar, "progressBar");
        progressBar.setVisibility(vis ? 0 : 8);
        AppCompatImageView ivCenterPause = this.viewBinding.f77908o.f77929c.f70196d;
        Intrinsics.m97801g(ivCenterPause, "ivCenterPause");
        ivCenterPause.setVisibility(!vis ? 0 : 8);
        LinearLayout root = this.viewBinding.f77909p.f77960h.getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        root.setVisibility(vis ? 0 : 8);
        if (vis) {
            AppCompatImageView ivCenterPause2 = this.viewBinding.f77908o.f77929c.f70196d;
            Intrinsics.m97801g(ivCenterPause2, "ivCenterPause");
            AbstractC26006c.m102055h(ivCenterPause2);
        }
    }

    /* JADX INFO: renamed from: v2 */
    private final void m72115v2(boolean show) {
        if (!show) {
            AppCompatTextView tvPressSpeed = this.viewBinding.f77918y;
            Intrinsics.m97801g(tvPressSpeed, "tvPressSpeed");
            tvPressSpeed.setVisibility(8);
        } else {
            hideBottomController(true);
            m71954D0();
            AppCompatTextView tvPressSpeed2 = this.viewBinding.f77918y;
            Intrinsics.m97801g(tvPressSpeed2, "tvPressSpeed");
            tvPressSpeed2.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: w0 */
    private final void m72117w0() {
        this.isPressedPause = true;
        C26866a.f81698a.m104912c(TAG, "----handlePause, pause video", true);
        setPauseViewStatus(false);
        this.playerControl.pause();
        m71944A2(false);
        this.longVodPlayerViewAdHelper.m72309c4(true ^ this.isMobilePaused);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public final void m72118w1() {
        if (!this.playerControl.isPlaying() || this.viewBinding.f77908o.f77938l.isSelected()) {
            return;
        }
        float fM65162d = C14453d.f50863a.m65162d();
        this.resumeSpeed = fM65162d;
        this.playerControl.setSpeed(fM65162d * 2);
        m72119w2(this, false, 1, null);
        this.pressTime = SystemClock.elapsedRealtime();
        String str = this.pageName;
        C24715a c24715a = this.curBean;
        String strM97059o = c24715a != null ? c24715a.m97059o() : null;
        C24715a c24715a2 = this.curBean;
        AbstractC5119p.m23953a(str, strM97059o, c24715a2 != null ? c24715a2.m97061q() : null, Float.valueOf(this.resumeSpeed));
    }

    /* JADX INFO: renamed from: w2 */
    static /* synthetic */ void m72119w2(LongVodPlayerView longVodPlayerView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        longVodPlayerView.m72115v2(z11);
    }

    /* JADX INFO: renamed from: x0 */
    private final void m72121x0(MotionEvent e11, boolean isDoubleClick) {
        LongVodUiType longVodUiType = this.curUiType;
        if ((longVodUiType != LongVodUiType.LAND && longVodUiType != LongVodUiType.MIDDLE) || !isDoubleClick || e11 == null) {
            m72117w0();
            return;
        }
        int iM27489e = AbstractC5806y.m27489e() / 3;
        int rawX = (int) e11.getRawX();
        boolean zM102053f = AbstractC26006c.m102053f();
        if (rawX >= 0 && rawX <= iM27489e) {
            m72093q0(this, zM102053f, false, 2, null);
        } else if (rawX > iM27489e * 2) {
            m72093q0(this, !zM102053f, false, 2, null);
        } else {
            m72117w0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static final void m72122x1(LongVodPlayerView longVodPlayerView) {
        try {
            Result.Companion companion = Result.INSTANCE;
            if (longVodPlayerView.playerControl.isPlaying()) {
                C26866a.a.m104898f(C26866a.f81698a, "VideoFloat-pip", "onAdClick resume auto pip", false, 4, null);
                longVodPlayerView.m71968G2(true);
            }
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x2 */
    public static final void m72123x2(LongVodPlayerView longVodPlayerView, View view) {
        longVodPlayerView.m72000O2();
    }

    /* JADX INFO: renamed from: y0 */
    private final boolean m72125y0() {
        if (this.contentType != LongVodContentType.UGC_VIDEO_ONLINE) {
            this.isUGCPauseShowing = false;
            FrameLayout flUGCAutoPlayGroup = this.viewBinding.f77909p.f77954b;
            Intrinsics.m97801g(flUGCAutoPlayGroup, "flUGCAutoPlayGroup");
            AbstractC26006c.m102054g(flUGCAutoPlayGroup);
            return false;
        }
        if (this.isUGCPlay || this.isFloatPlaying || C14496b.f50966a.m65344b().getBoolean("k_UGC_VIDEO_AUTO_PLAY", false) || C5118o.f17608a.m23948i()) {
            this.isUGCPauseShowing = false;
            FrameLayout flUGCAutoPlayGroup2 = this.viewBinding.f77909p.f77954b;
            Intrinsics.m97801g(flUGCAutoPlayGroup2, "flUGCAutoPlayGroup");
            AbstractC26006c.m102054g(flUGCAutoPlayGroup2);
            return false;
        }
        this.isUGCPauseShowing = true;
        this.longVodPlayerViewAdHelper.m72305O4(false);
        m72071k2(false);
        FrameLayout flUGCAutoPlayGroup3 = this.viewBinding.f77909p.f77954b;
        Intrinsics.m97801g(flUGCAutoPlayGroup3, "flUGCAutoPlayGroup");
        AbstractC26006c.m102058k(flUGCAutoPlayGroup3);
        this.viewBinding.f77909p.f77959g.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LongVodPlayerView.m72129z0(this.f55852a, view);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public final void m72126y1() {
        View orLongVodPlayerBg = this.viewBinding.f77913t;
        Intrinsics.m97801g(orLongVodPlayerBg, "orLongVodPlayerBg");
        AbstractC26006c.m102054g(orLongVodPlayerBg);
        if (m72125y0()) {
            return;
        }
        if (!this.isReload && !this.isMultipleResChangeResolution) {
            String string = Utils.m27275a().getString(R$string.long_vod_analysing_from);
            String[] stringArray = Utils.m27275a().getResources().getStringArray(R$array.long_vod_analysing_array);
            Intrinsics.m97801g(stringArray, "getStringArray(...)");
            m72131z2(string + " [" + ArraysKt.m97489v0(stringArray, Random.INSTANCE) + "]");
        }
        m71980J2(0L);
        m71999O1();
        if (!this.isPageResumed) {
            C26866a.f81698a.m104912c(TAG, "----onPrepare2PlayVideo, pause video", true);
            this.playerControl.pause();
            m71944A2(false);
        } else {
            if (m72107t2() && this.isMobilePaused) {
                C26866a.f81698a.m104912c(TAG, "----onPrepare2PlayVideo, showMobileDataTips pause", true);
                return;
            }
            m71942A0();
            C26866a.f81698a.m104912c(TAG, "onPrepare2PlayVideo, play", true);
            this.playerControl.play();
        }
    }

    /* JADX INFO: renamed from: y2 */
    private final void m72127y2(boolean hasAtLeast720P, Integer target) {
        Object objM112707constructorimpl;
        if (!C16503r.f55634a.m71937p()) {
            C27089h.f82174a.m105449a(getClassTag() + " --> showResolutionTip() --> 分辨率提示 开通会员看高清 --> 开关关闭，不展示");
            return;
        }
        if (C5118o.f17608a.m23947g() || C5110g.f17601a.m23911b()) {
            C27089h.f82174a.m105449a(getClassTag() + " --> showResolutionTip() --> 儿童/UGC模式，不展示分辨率会员提示");
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            this.viewBinding.f77908o.f77944r.showResolutionTip(hasAtLeast720P, this.curBean, this.pageName, this, target);
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) == null) {
            return;
        }
        C27089h.f82174a.m105449a(getClassTag() + " --> showResolutionTip() --> 出现异常");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m72129z0(LongVodPlayerView longVodPlayerView, View view) {
        longVodPlayerView.m71952C2();
    }

    /* JADX INFO: renamed from: z1 */
    private final void m72130z1(C24716b selectedBean) {
        int i11;
        Iterator it = this.resolutionList.iterator();
        while (true) {
            i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            C24716b c24716b = (C24716b) it.next();
            if (c24716b.m97075e()) {
                c24716b.m97076f(false);
                break;
            }
        }
        int i12 = 0;
        for (C24716b c24716b2 : this.resolutionList) {
            int i13 = i12 + 1;
            if (Intrinsics.m97797c(selectedBean.m97074d(), c24716b2.m97074d())) {
                c24716b2.m97076f(true);
                this.viewBinding.f77908o.f77947u.setText(c24716b2.m97074d());
                i11 = i12;
                break;
            }
            i12 = i13;
        }
        C26866a.f81698a.m104912c(TAG, "onResolutionChange, content = " + selectedBean.m97074d() + ", selectedIndex = " + i11, true);
        C24715a c24715a = this.curBean;
        if (c24715a != null) {
            C16791c0 c16791c0 = this.videoDot;
            if (c16791c0 != null) {
                c16791c0.m73424L(selectedBean.m97074d());
            }
            if (!c24715a.m97067w()) {
                C26907d c26907d = this.dashVideoTracksGroup;
                if (c26907d != null) {
                    this.playerControl.changeTrackSelection(c26907d, i11);
                    return;
                }
                return;
            }
            C24717c c24717cM71719e = this.resolutionHelper.m71719e(c24715a, selectedBean);
            if (c24717cM71719e != null) {
                this.resolutionHelper.m71721g(c24717cM71719e.m97081e());
                C24715a c24715a2 = this.curBean;
                if (c24715a2 != null) {
                    c24715a2.m97069y(this.playerControl.getCurrentPosition());
                }
                this.isMultipleResChangeResolution = true;
                m72037a2();
                setPlayerDataSourceAdPrepare(c24717cM71719e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public final void m72131z2(String content) {
        if (this.toastLayout == null) {
            this.toastLayout = this.viewBinding.f77893F.inflate();
            m72062i1();
            View view = this.toastLayout;
            Intrinsics.m97799e(view);
            TextView textView = (TextView) view.findViewById(R$id.tv_toast_1);
            View view2 = this.toastLayout;
            Intrinsics.m97799e(view2);
            this.localToastControl = new C16813j1(textView, (TextView) view2.findViewById(R$id.tv_toast_2));
        }
        C16813j1 c16813j1 = this.localToastControl;
        if (c16813j1 != null) {
            C16813j1.m73486i(c16813j1, content, 0L, 2, null);
        }
    }

    public final void backClick(boolean needFinish, boolean showBackAd) {
        LongVodUiType longVodUiType = this.curUiType;
        LongVodUiType longVodUiType2 = LongVodUiType.MIDDLE;
        if (longVodUiType != longVodUiType2) {
            if (longVodUiType == LongVodUiType.LAND) {
                Context context = getContext();
                Intrinsics.m97800f(context, "null cannot be cast to non-null type android.app.Activity");
                Activity activity = (Activity) context;
                ImmersionBar.with(activity).hideBar(BarHide.FLAG_SHOW_BAR).init();
                activity.setRequestedOrientation(1);
            }
            this.viewBinding.f77889B.setPadding(0, 0, 0, 0);
            this.curUiType = longVodUiType2;
            m72055g2(false, longVodUiType2);
            return;
        }
        if (needFinish) {
            if (showBackAd && this.longVodPlayerViewAdHelper.m72306Q4()) {
                return;
            }
            InterfaceC24450a.b bVar = this.playerCallback;
            if (bVar != null ? bVar.mo70373c(FloatActionType.BACK) : false) {
                return;
            }
            Context context2 = getContext();
            Intrinsics.m97800f(context2, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context2).finish();
        }
    }

    public final void closeResolutionPanel(final C24716b config, MemberCheckResult memberCheckResult) {
        Subject subjectM97057m;
        Intrinsics.m97802h(config, "config");
        Context context = getContext();
        String genre = null;
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity == null) {
            return;
        }
        CustomRoundCornerLayout flResolution = this.viewBinding.f77903j;
        Intrinsics.m97801g(flResolution, "flResolution");
        openResolutionPanel();
        fragmentActivity.getSupportFragmentManager().m14497G1("resolution_unlock_success", fragmentActivity, new InterfaceC3165t() { // from class: com.transsion.player.longvideo.ui.t0
            @Override // androidx.fragment.app.InterfaceC3165t
            /* JADX INFO: renamed from: a */
            public final void mo14589a(String str, Bundle bundle) {
                LongVodPlayerView.m72053g0(this.f55863a, config, str, bundle);
            }
        });
        fragmentActivity.getSupportFragmentManager().m14497G1("resolution_unlock_dismiss", fragmentActivity, new InterfaceC3165t() { // from class: com.transsion.player.longvideo.ui.u0
            @Override // androidx.fragment.app.InterfaceC3165t
            /* JADX INFO: renamed from: a */
            public final void mo14589a(String str, Bundle bundle) {
                LongVodPlayerView.m72057h0(this.f55866a, str, bundle);
            }
        });
        fragmentActivity.getSupportFragmentManager().m14497G1("resolution_pay", fragmentActivity, new InterfaceC3165t() { // from class: com.transsion.player.longvideo.ui.v0
            @Override // androidx.fragment.app.InterfaceC3165t
            /* JADX INFO: renamed from: a */
            public final void mo14589a(String str, Bundle bundle) {
                LongVodPlayerView.m72061i0(this.f55868a, config, str, bundle);
            }
        });
        fragmentActivity.getSupportFragmentManager().m14497G1("resolution_member", fragmentActivity, new InterfaceC3165t() { // from class: com.transsion.player.longvideo.ui.w0
            @Override // androidx.fragment.app.InterfaceC3165t
            /* JADX INFO: renamed from: a */
            public final void mo14589a(String str, Bundle bundle) {
                LongVodPlayerView.m72065j0(this.f55871a, config, str, bundle);
            }
        });
        ResolutionUnlockFragment resolutionUnlockFragmentM71920a = ResolutionUnlockFragment.INSTANCE.m71920a(config);
        C24715a c24715a = this.curBean;
        String str = this.pageName;
        if (c24715a != null && (subjectM97057m = c24715a.m97057m()) != null) {
            genre = subjectM97057m.getGenre();
        }
        resolutionUnlockFragmentM71920a.m71919m0(c24715a, str, genre, memberCheckResult);
        fragmentActivity.getSupportFragmentManager().m14557p().m14814t(flResolution.getId(), resolutionUnlockFragmentM71920a, "ResolutionUnlockFragment").mo14671j();
    }

    @Override // jo.InterfaceC24450a
    public long currentPosition() {
        return this.playerControl.getCurrentPosition();
    }

    @Override // jo.InterfaceC24450a
    public void exitFullScreen() {
        if (this.curUiType != LongVodUiType.MIDDLE) {
            if (this.viewBinding.f77908o.f77938l.isSelected()) {
                this.viewBinding.f77908o.f77938l.performClick();
            }
            backClick$default(this, false, false, 2, null);
        }
    }

    public void floatBack2ExitPage(InterfaceC16634g orPlayer, ORPlayerView playerView) {
        Intrinsics.m97802h(orPlayer, "orPlayer");
        Intrinsics.m97802h(playerView, "playerView");
    }

    public final LongVodPlayerViewAdHelper getLongVodPlayerViewAdHelper() {
        return this.longVodPlayerViewAdHelper;
    }

    @Override // jo.InterfaceC24450a
    public InterfaceC16634g getPlayer() {
        return this.playerControl.getOrPlayer();
    }

    @Override // jo.InterfaceC24450a
    /* JADX INFO: renamed from: getPlayerView, reason: from getter */
    public ORPlayerView getOrPlayerView() {
        return this.orPlayerView;
    }

    @Override // jo.InterfaceC24450a
    public C24717c getPlayingStream() {
        return this.playingStream;
    }

    @Override // jo.InterfaceC24450a
    public SimpleSubtitleView getSubtitleView() {
        return this.viewBinding.f77888A;
    }

    @Override // jo.InterfaceC24450a
    public ViewGroup getSubtitleViewGroup() {
        return this.viewBinding.f77905l;
    }

    @Override // jo.InterfaceC24450a
    public void hasNextEpisode(boolean hasNext) {
        this.isHasNext = hasNext;
        ConstraintLayout clBottomControl = this.viewBinding.f77908o.f77930d;
        Intrinsics.m97801g(clBottomControl, "clBottomControl");
        if (clBottomControl.getVisibility() == 0) {
            AppCompatTextView tvPlayNext = this.viewBinding.f77908o.f77951y;
            Intrinsics.m97801g(tvPlayNext, "tvPlayNext");
            tvPlayNext.setVisibility(this.isHasNext ? 0 : 8);
            m72025W1();
        }
    }

    @Override // jo.InterfaceC24450a
    public void hideBottomController(boolean fastHide) {
        if (AbstractC5779c.m27333j()) {
            if (fastHide) {
                m71954D0();
            } else if (this.playerControl.isPlaying()) {
                this.handler.removeCallbacks(this.runnable);
                this.handler.postDelayed(this.runnable, 3000L);
            }
        }
    }

    @Override // jo.InterfaceC24450a
    public void init(String pageName, LongVodPageType pageType, String tag, FrameLayout fullscreenContainer, ViewGroup subtitleSyncView, List<DubsInfo> dubs, LongVodContentType contentType) {
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(pageType, "pageType");
        Intrinsics.m97802h(dubs, "dubs");
        Intrinsics.m97802h(contentType, "contentType");
        Function0 function0M102147p = C26053g0.f79567a.m102147p();
        boolean z11 = false;
        if (function0M102147p != null && ((Boolean) function0M102147p.invoke()).booleanValue()) {
            z11 = true;
        }
        this.isMultiplePlayer = z11;
        this.contentType = contentType;
        this.pageName = pageName;
        this.pageType = pageType;
        this.fullscreenContainer = fullscreenContainer;
        this.dubs = dubs;
        this.playerTag = tag;
        C26866a.a.m104898f(C26866a.f81698a, TAG, "init,pageName:" + pageName + ", pageType:" + pageType + " ", false, 4, null);
        m72066j1();
        m71962F0();
        m72045d1();
        m71970H0();
        m72054g1(subtitleSyncView);
        m71978J0();
        C17444n orientationEventListener = getOrientationEventListener();
        if (orientationEventListener != null) {
            orientationEventListener.enable();
        }
        m71966G0();
        C14057b.f49739a.m63674c(this);
        C15716d.f54081a.m69639q(new C16508e());
    }

    public final void initAdHelper(String genre) {
        this.longVodPlayerViewAdHelper.m72310d4(this.pageName, this.pageType, this.viewBinding, genre, new Function1() { // from class: com.transsion.player.longvideo.ui.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LongVodPlayerView.m71974I0(this.f55769a, ((Boolean) obj).booleanValue());
            }
        });
        this.longVodPlayerViewAdHelper.m72304M4(this);
    }

    /* JADX INFO: renamed from: isPressedPause, reason: from getter */
    public boolean getIsPressedPause() {
        return this.isPressedPause;
    }

    @Override // com.transsion.p285ad.strategy.C14057b.a
    public void onAdClick(AdPlans adPlan) {
        C26866a.a.m104898f(C26866a.f81698a, "VideoFloat-pip", "onAdClick stop auto pip", false, 4, null);
        m71968G2(false);
        postDelayed(new Runnable() { // from class: com.transsion.player.longvideo.ui.h0
            @Override // java.lang.Runnable
            public final void run() {
                LongVodPlayerView.m72122x1(this.f55840a);
            }
        }, 3000L);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        if (AbstractC14556b.m65670a(context)) {
            return;
        }
        getScreenHelper().m65135h();
    }

    @Override // jo.InterfaceC24450a
    public boolean onBackPressed() {
        if (this.curUiType != LongVodUiType.MIDDLE) {
            backClick$default(this, false, false, 3, null);
            return true;
        }
        backClick$default(this, false, true, 1, null);
        return false;
    }

    @Override // com.transsion.baselib.report.C14492k.a
    public void onBackgroundStatusChange(boolean isBackground) {
        if (isBackground) {
            C26866a.f81698a.m104912c(TAG, "app退至后台 上报埋点", true);
            if (this.playerControl.isPlaying()) {
                this.isPageResumed = false;
                if (!m72094q1()) {
                    this.playerControl.pause();
                }
                m72007Q1();
            }
            m72059h2();
            C16791c0 c16791c0 = this.videoDot;
            if (c16791c0 != null) {
                c16791c0.m73431b(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        if (AbstractC14556b.m65670a(context)) {
            return;
        }
        getScreenHelper().m65136l();
    }

    @Override // jo.InterfaceC24450a
    public void onHandlePause() {
        C26866a.f81698a.m104912c(TAG, "onHandlePause", true);
        this.isPageResumed = false;
        this.isPressedPause = true;
        if (!m72094q1()) {
            this.playerControl.pause();
        }
        m72007Q1();
    }

    @Override // jo.InterfaceC24450a
    public void onHandlePlay() {
        C26866a.f81698a.m104912c(TAG, "onHandlePlay", true);
        this.isPageResumed = true;
        if (this.isMobilePaused) {
            return;
        }
        m71996N2(this, null, false, 3, null);
    }

    @Override // jo.InterfaceC24450a
    public void onPageDestroy() {
        this.isFirstSetTracks = true;
        m72059h2();
        C26866a.f81698a.m104912c(TAG, "页面关闭 上报埋点", true);
        C16791c0 c16791c0 = this.videoDot;
        if (c16791c0 != null) {
            C16791c0.m73410c(c16791c0, false, 1, null);
        }
        this.playerControl.removePlayerListener(this.playerListener);
        LongVodSubtitleHelper longVodSubtitleHelper = this.subtitleHelper;
        if (longVodSubtitleHelper != null) {
            longVodSubtitleHelper.m71773R();
        }
        m71964F2();
        m72034Z1();
        C14057b.f49739a.m63679m(this);
        C15716d.f54081a.m69639q(null);
        this.longVodPlayerViewAdHelper.m72301I3();
        this.viewBinding.f77908o.f77944r.destroy();
    }

    @Override // jo.InterfaceC24450a
    public void onPipModeChanged(boolean isInPipMode) {
        C16791c0 c16791c0 = this.videoDot;
        if (c16791c0 != null) {
            c16791c0.m73416D(isInPipMode);
        }
    }

    @Deprecated
    public final void onResolutionTipFailedFromDialog(final C24716b config) {
        Intrinsics.m97802h(config, "config");
        if (C5118o.f17608a.m23947g() || C5110g.f17601a.m23911b()) {
            return;
        }
        if (!PSActivateManager.f49686a.m63475d()) {
            C26866a.a.m104899g(C26866a.f81698a, getClassTag() + " --> onResolutionTipFailedFromDialog() --> 分辨率面板 开通会员失败 后续逻辑 --> 没有激活广告，直接返回", false, 2, null);
            return;
        }
        if (!C4718a.f16780a.m22805k(MemberSource.SOURCE_STREAM_RESOLUTION_DIALOG)) {
            backClick$default(this, false, false, 3, null);
            C27089h.f82174a.m105449a("LongVdPlayerConfigDialog --> 横竖屏切换完成");
            postDelayed(new Runnable() { // from class: com.transsion.player.longvideo.ui.s0
                @Override // java.lang.Runnable
                public final void run() {
                    LongVodPlayerView.m71943A1(this.f55860a, config);
                }
            }, 500L);
        } else {
            C26866a.a.m104899g(C26866a.f81698a, getClassTag() + " --> onResolutionTipFailedFromDialog() --> 分辨率 --> 没有开启，直接返回", false, 2, null);
        }
    }

    public final void onResolutionTipFailedFromMemberTipView() {
        if (C5118o.f17608a.m23947g() || C5110g.f17601a.m23911b()) {
            return;
        }
        if (!PSActivateManager.f49686a.m63475d()) {
            C26866a.a.m104899g(C26866a.f81698a, getClassTag() + " --> onResolutionTipFailedFromDialog() --> 分辨率面板 开通会员失败 后续逻辑 --> 没有激活广告，直接返回", false, 2, null);
            return;
        }
        if (!C4718a.f16780a.m22805k(MemberSource.SOURCE_STREAM_RESOLUTION_TIP)) {
            backClick$default(this, false, false, 3, null);
            C27089h.f82174a.m105449a("LongVdPlayerConfigDialog --> 横竖屏切换完成");
            postDelayed(new Runnable() { // from class: com.transsion.player.longvideo.ui.r0
                @Override // java.lang.Runnable
                public final void run() {
                    LongVodPlayerView.m71947B1(this.f55858a);
                }
            }, 500L);
        } else {
            C26866a.a.m104899g(C26866a.f81698a, getClassTag() + " --> onResolutionTipFailedFromDialog() --> 右下角 --> 没有开启，直接返回", false, 2, null);
        }
    }

    @Override // jo.InterfaceC24450a
    public void onSaveHistory() {
        if (this.pageType != LongVodPageType.TRAILER && this.playProgress > 0) {
            C24715a c24715a = this.curBean;
            LongVodContentType longVodContentType = this.contentType;
            if (longVodContentType == LongVodContentType.UGC_VIDEO_ONLINE || longVodContentType == LongVodContentType.UGC_VIDEO_LOCAL) {
                m72049e2();
            } else {
                AbstractC25136k.m99058d(this.coroutineScopeIO, null, null, new C165191(c24715a, this, null), 3, null);
            }
        }
    }

    @Override // jo.InterfaceC24450a
    public void onViewPause() {
        C26866a.f81698a.m104912c(TAG, "onViewPause", true);
        this.isPageResumed = false;
        if (!m72094q1()) {
            this.playerControl.pause();
        }
        m72007Q1();
        this.longVodPlayerViewAdHelper.m72323x4();
    }

    @Override // jo.InterfaceC24450a
    public void onViewResume() {
        if (!this.canNonSubscriberPlay) {
            C27089h.f82174a.m105449a(getClassTag() + " --> onViewResume() --> 会员分辨率需求拦截播放");
            return;
        }
        C26866a.f81698a.m104912c(TAG, "onViewResume", true);
        this.isPageResumed = true;
        C17444n orientationEventListener = getOrientationEventListener();
        if (orientationEventListener != null) {
            orientationEventListener.enable();
        }
        if (!this.isPressedPause && C27287m.f83003a.m106330e() && !C27136c.f82250a.m105603d() && !this.isAdShowing && !this.isRewardInterceptShowing) {
            FrameLayout flUGCAutoPlayGroup = this.viewBinding.f77909p.f77954b;
            Intrinsics.m97801g(flUGCAutoPlayGroup, "flUGCAutoPlayGroup");
            if (flUGCAutoPlayGroup.getVisibility() != 0) {
                this.playerControl.play();
            }
        }
        this.longVodPlayerViewAdHelper.m72324y4();
    }

    public final void openResolutionPanel() {
        final CustomRoundCornerLayout flResolution = this.viewBinding.f77903j;
        Intrinsics.m97801g(flResolution, "flResolution");
        ValueAnimator valueAnimator = this.resolutionPanelAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        flResolution.getLayoutParams().width = 0;
        flResolution.requestLayout();
        flResolution.setVisibility(0);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, getResolutionPanelTargetWidth());
        valueAnimatorOfInt.setDuration(500L);
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.transsion.player.longvideo.ui.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                LongVodPlayerView.m71971H1(flResolution, valueAnimator2);
            }
        });
        valueAnimatorOfInt.start();
        this.resolutionPanelAnimator = valueAnimatorOfInt;
    }

    @Override // jo.InterfaceC24450a
    public void release() {
        this.isPrepared = false;
        if (m72094q1()) {
            C26866a.f81698a.m104912c(TAG, "music release clearSurfaceOnly", true);
            this.playerControl.clearSurfaceOnly();
            return;
        }
        C26866a.a aVar = C26866a.f81698a;
        aVar.m104912c(TAG, "release player", true);
        if (C21106a0.f66016a.m86579c(getPlayer())) {
            aVar.m104912c(TAG, "播放器在缓存中，后续要用到，不能release", true);
            return;
        }
        InterfaceC16676a interfaceC16676a = this.playerControl;
        C24717c c24717c = this.playingStream;
        String strM97084h = c24717c != null ? c24717c.m97084h() : null;
        interfaceC16676a.release(String.valueOf(strM97084h != null ? strM97084h.hashCode() : 0));
    }

    @Override // jo.InterfaceC24450a
    public void removeNoNetError() {
        m72016T1();
    }

    @Override // jo.InterfaceC24450a
    public void replay() {
        m72000O2();
    }

    @Override // jo.InterfaceC24450a
    public void reset() {
        if (this.isNewPlayer) {
            C26866a.f81698a.m104912c(TAG, "player reset", true);
            this.isReload = false;
            this.isPrepared = false;
            this.isFirstSetTracks = true;
            LongVodSubtitleHelper longVodSubtitleHelper = this.subtitleHelper;
            if (longVodSubtitleHelper != null) {
                longVodSubtitleHelper.m71779Z();
            }
            C16455j c16455j = this.spaceHelper;
            if (c16455j != null) {
                c16455j.m71818c();
            }
            this.playerControl.reset();
            m72034Z1();
            m71980J2(0L);
            setPauseViewStatus(false);
        }
    }

    public final void setAudioSelectCallback(Function1<? super DubsInfo, Unit> callback) {
        this.audioSelectCallback = callback;
    }

    @Override // jo.InterfaceC24450a
    public void setCallback(InterfaceC24450a.b callback) {
        Intrinsics.m97802h(callback, "callback");
        this.playerCallback = callback;
        C16449g c16449g = this.gameResHelper;
        if (c16449g != null) {
            c16449g.m71806d(callback);
        }
    }

    @Override // jo.InterfaceC24450a
    public void setDataSource(C24715a bean) {
        String strM97059o;
        LifecycleCoroutineScope lifecycleCoroutineScopeM14968a;
        String strM97059o2;
        Intrinsics.m97802h(bean, "bean");
        this.isMobilePaused = false;
        this.isPrepared = false;
        this.playProgress = 0L;
        C16471u c16471u = this.mobileDataHelper;
        if (c16471u != null) {
            c16471u.m71853E();
        }
        this.isRewardInterceptShowing = false;
        this.longVodPlayerViewAdHelper.m72303L4(this.contentType, bean);
        m71980J2(0L);
        this.canNonSubscriberPlay = true;
        C27089h.f82174a.m105449a(getClassTag() + " --> setDataSource() --> 初始化数据 --> 默认所有的视频都可以看 --> canNonSubscriberPlay = true");
        m72042c1(this.playerTag, bean);
        this.dubs = bean.m97045a();
        m71976I2();
        C26866a.a.m104898f(C26866a.f81698a, TAG, "setDataSource,  isNewPlayer：" + this.isNewPlayer, false, 4, null);
        onSaveHistory();
        if (this.curBean != null) {
            m72059h2();
            C16791c0 c16791c0 = this.videoDot;
            if (c16791c0 != null) {
                C16791c0.m73410c(c16791c0, false, 1, null);
            }
            C16791c0 c16791c1 = this.videoDot;
            if (c16791c1 != null) {
                c16791c1.m73434g();
            }
        }
        this.isFirstSetTracks = true;
        this.curBean = bean;
        C16791c0 c16791c2 = this.videoDot;
        if (c16791c2 != null) {
            c16791c2.m73422J(bean.m97053i());
        }
        C16791c0 c16791c3 = this.videoDot;
        if (c16791c3 != null) {
            c16791c3.m73419G(this.isMusicLikedFragment);
        }
        String strM97053i = bean.m97053i();
        this.pageName = strM97053i;
        ImmScaleView immScaleView = this.viewBinding.f77908o.f77940n;
        C24715a c24715a = this.curBean;
        String str = "";
        if (c24715a == null || (strM97059o = c24715a.m97059o()) == null) {
            strM97059o = "";
        }
        immScaleView.setPageParams(strM97053i, strM97059o);
        ImmSpeedView immSpeedView = this.viewBinding.f77908o.f77920A;
        String str2 = this.pageName;
        C24715a c24715a2 = this.curBean;
        if (c24715a2 != null && (strM97059o2 = c24715a2.m97059o()) != null) {
            str = strM97059o2;
        }
        immSpeedView.setPageParams(str2, str);
        ImmScaleView immScaleView2 = this.viewBinding.f77908o.f77940n;
        C24715a c24715a3 = this.curBean;
        immScaleView2.setOps(c24715a3 != null ? c24715a3.m97061q() : null);
        ImmSpeedView immSpeedView2 = this.viewBinding.f77908o.f77920A;
        C24715a c24715a4 = this.curBean;
        immSpeedView2.setOps(c24715a4 != null ? c24715a4.m97061q() : null);
        m71984K2(bean);
        if (this.isNewPlayer) {
            m72079m2();
        }
        Context context = getContext();
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity == null || (lifecycleCoroutineScopeM14968a = AbstractC3226v.m14968a(appCompatActivity)) == null) {
            return;
        }
        AbstractC25136k.m99058d(lifecycleCoroutineScopeM14968a, null, null, new C165211(bean, null), 3, null);
    }

    public final void setFeedBackVisible(boolean visible) {
        AppCompatTextView tvFeedback = this.viewBinding.f77910q.f77883e;
        Intrinsics.m97801g(tvFeedback, "tvFeedback");
        AbstractC26006c.m102057j(tvFeedback, visible);
    }

    @Override // jo.InterfaceC24450a
    public void setFloatIsShow(boolean show) {
        this.isFloatShow = show;
    }

    public void setFragmentId(String fragmentId) {
        Intrinsics.m97802h(fragmentId, "fragmentId");
        this.fragmentId = fragmentId;
    }

    public final void setLongVodPlayerViewAdHelper(LongVodPlayerViewAdHelper longVodPlayerViewAdHelper) {
        Intrinsics.m97802h(longVodPlayerViewAdHelper, "<set-?>");
        this.longVodPlayerViewAdHelper = longVodPlayerViewAdHelper;
    }

    public final void setMusicLikedFragment(boolean from) {
        this.isMusicLikedFragment = from;
    }

    public void setSpeed(float speed) {
        this.playerControl.setSpeed(speed);
        ImmSpeedView.updateSpeed$default(this.viewBinding.f77908o.f77920A, speed, false, 2, null);
        LongVodSubtitleHelper longVodSubtitleHelper = this.subtitleHelper;
        if (longVodSubtitleHelper != null) {
            longVodSubtitleHelper.m71784j0(speed);
        }
    }

    @Override // jo.InterfaceC24450a
    public void showNoNetError() {
        m72087o2(this, false, 1, null);
    }

    @Override // jo.InterfaceC24450a
    public void showReplay() {
        if (m72090p1()) {
            return;
        }
        if (this.curUiType == LongVodUiType.MIDDLE) {
            hideBottomController(true);
        } else {
            m72071k2(false);
        }
        setPauseViewStatus(false);
        m72022V1();
        if (this.replayLayout == null) {
            this.replayLayout = this.viewBinding.f77892E.inflate();
        }
        View view = this.replayLayout;
        if (view != null) {
            AbstractC26006c.m102058k(view);
        }
        View view2 = this.replayLayout;
        if (view2 != null) {
            if (this.curUiType == LongVodUiType.LAND) {
                this.isCompletionBlock = false;
            }
            ((TextView) view2.findViewById(R$id.tv_replay)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    LongVodPlayerView.m72123x2(this.f55855a, view3);
                }
            });
        }
    }

    public final void showResolutionIntercept(C24716b config) {
        LifecycleCoroutineScope lifecycleCoroutineScopeM14968a;
        Intrinsics.m97802h(config, "config");
        Context context = getContext();
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity == null || (lifecycleCoroutineScopeM14968a = AbstractC3226v.m14968a(appCompatActivity)) == null) {
            return;
        }
        AbstractC25136k.m99058d(lifecycleCoroutineScopeM14968a, null, null, new C165231(config, this, null), 3, null);
    }

    @Override // jo.InterfaceC24450a
    public void ugcAutoPause2PlayVideo() {
        FrameLayout flUGCAutoPlayGroup = this.viewBinding.f77909p.f77954b;
        Intrinsics.m97801g(flUGCAutoPlayGroup, "flUGCAutoPlayGroup");
        if (flUGCAutoPlayGroup.getVisibility() == 0) {
            FrameLayout flUGCAutoPlayGroup2 = this.viewBinding.f77909p.f77954b;
            Intrinsics.m97801g(flUGCAutoPlayGroup2, "flUGCAutoPlayGroup");
            AbstractC26006c.m102054g(flUGCAutoPlayGroup2);
            this.playerControl.play();
        }
    }

    @Override // jo.InterfaceC24450a
    public void updateReportId(String parentVideoId, String trackId, String previousTrackId) {
        C16791c0 c16791c0 = this.videoDot;
        if (c16791c0 != null) {
            c16791c0.m73426N(parentVideoId);
        }
        C16791c0 c16791c1 = this.videoDot;
        if (c16791c1 != null) {
            c16791c1.m73428P(trackId);
        }
        C16791c0 c16791c2 = this.videoDot;
        if (c16791c2 != null) {
            c16791c2.m73427O(previousTrackId);
        }
    }
}
