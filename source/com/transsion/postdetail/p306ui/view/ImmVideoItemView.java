package com.transsion.postdetail.p306ui.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3218r;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.InterfaceC3233y0;
import androidx.p1004lifecycle.Lifecycle;
import ck.C5110g;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5780c0;
import com.blankj.utilcode.util.AbstractC5790i;
import com.blankj.utilcode.util.AbstractC5806y;
import com.blankj.utilcode.util.Utils;
import com.bumptech.glide.Glide;
import com.cloud.tmc.integration.event.EventConstants;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.noober.background.view.BLConstraintLayout;
import com.noober.background.view.BLLinearLayout;
import com.noober.background.view.BLTextView;
import com.p282tn.lib.view.expand.ExpandView;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.download.DownloadException;
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.baseui.util.AbstractC14566l;
import com.transsion.baseui.util.AbstractC14567m;
import com.transsion.baseui.util.C14557c;
import com.transsion.baseui.util.InterfaceC14561g;
import com.transsion.baseui.util.UrlContent;
import com.transsion.baseui.widget.C14582f;
import com.transsion.baseui.widget.NestedScrollableHost;
import com.transsion.baseui.widget.jumpingbeans.C14587a;
import com.transsion.moviedetailapi.AbstractC16247h;
import com.transsion.moviedetailapi.InterfaceC16246g;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.CommentBean;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.FirstFrame;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.MediaType;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.ResourceDetectors;
import com.transsion.moviedetailapi.bean.ShortTVFavInfo;
import com.transsion.moviedetailapi.bean.ShortTVItem;
import com.transsion.moviedetailapi.bean.Stat;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.User;
import com.transsion.moviedetailapi.bean.Video;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.PlayError;
import com.transsion.player.orplayer.global.TnPlayerType;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.postdetail.R$drawable;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.R$layout;
import com.transsion.postdetail.R$mipmap;
import com.transsion.postdetail.R$string;
import com.transsion.postdetail.bean.CommentLikeBody;
import com.transsion.postdetail.helper.C16768a;
import com.transsion.postdetail.helper.ImmVideoHelper;
import com.transsion.postdetail.layer.C16781b;
import com.transsion.postdetail.p306ui.dialog.ImmVideoCommentDialog;
import com.transsion.postdetail.p306ui.dialog.PostConfirmDialog;
import com.transsion.postdetail.p306ui.fragment.CommentFragment;
import com.transsion.postdetail.p306ui.fragment.VideoFragment;
import com.transsion.postdetail.shorttv.C16904k;
import com.transsion.postdetail.shorttv.ShortTvPlayListViewModel;
import com.transsion.postdetail.util.AbstractC17443m;
import com.transsion.postdetail.util.AbstractC17450t;
import com.transsion.postdetail.util.C17449s;
import com.transsion.postdetail.viewmodel.CommentViewModel;
import com.transsion.postdetail.viewmodel.PostDetailViewModel;
import com.transsion.push.PushConstants;
import com.transsion.share.bean.PostType;
import com.transsion.share.share.InterfaceC18701a;
import com.transsion.share.share.ShareDialogFragment;
import com.transsion.shorttv.base.pager.PagerLayoutManager;
import com.transsion.usercenterapi.ReportType;
import com.transsion.web.api.WebConstants;
import com.transsion.web.api.WebPageIdentity;
import com.transsnet.downloader.DownloadManagerApi;
import com.transsnet.downloader.manager.C21851p;
import com.transsnet.downloader.manager.DownloadEsHelper;
import com.transsnet.downloader.manager.InterfaceC21842g;
import com.transsnet.downloader.util.DownloadUtil;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.AddToDownloadEvent;
import com.transsnet.flow.event.sync.event.LikeEvent;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import fo.C23403e;
import gp.C23626d;
import gp.C23628f;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import mn.C25891b;
import ng.AbstractC26006c;
import okhttp3.internal.http2.Settings;
import p415fq.InterfaceC23410a;
import p415fq.InterfaceC23415f;
import p441gz.InterfaceC23704a;
import p462hj.C23860f;
import p550kj.C24662i;
import p577lh.C25636b;
import p620nn.C26035b;
import p648oj.InterfaceC26269m0;
import p683po.C26906c;
import p683po.C26907d;
import p718qs.C27125a;
import p743rh.C27287m;
import p844vo.C28178w;
import p925xy.C28673c;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002õ\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B!\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011Jk\u0010!\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001a2\b\b\u0002\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u0018¢\u0006\u0004\b!\u0010\"J\u001d\u0010'\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00182\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00107\u001a\u00020\u000f2\u0006\u00105\u001a\u0002042\u0006\u00101\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u000fH\u0016¢\u0006\u0004\b9\u0010\u0011J\u0019\u0010<\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u000f¢\u0006\u0004\b>\u0010\u0011J\u0017\u0010?\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u001a¢\u0006\u0004\bB\u0010@J\u000f\u0010C\u001a\u00020\u000fH\u0016¢\u0006\u0004\bC\u0010\u0011J\u000f\u0010D\u001a\u00020\u000fH\u0016¢\u0006\u0004\bD\u0010\u0011J\u0019\u0010E\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bE\u0010=J\u0019\u0010F\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bF\u0010=J\u0019\u0010G\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bG\u0010=J!\u0010J\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020H2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bJ\u0010KJ\u0019\u0010L\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bL\u0010=J\u0019\u0010M\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bM\u0010=J!\u0010P\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020N2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u000fH\u0016¢\u0006\u0004\bR\u0010\u0011J\u0019\u0010S\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bS\u0010=J\u000f\u0010T\u001a\u00020\u000fH\u0016¢\u0006\u0004\bT\u0010\u0011J\u0019\u0010W\u001a\u00020\u000f2\b\u0010V\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\bW\u0010XJ\r\u0010Y\u001a\u00020\u000f¢\u0006\u0004\bY\u0010\u0011J\u0019\u0010[\u001a\u00020\u000f2\b\u0010Z\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b[\u0010@J\u0017\u0010\\\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\\\u0010\rJ\u0017\u0010]\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b]\u0010^J\u0017\u0010_\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b_\u0010^J\u0017\u0010a\u001a\u00020\u000f2\u0006\u0010`\u001a\u00020HH\u0002¢\u0006\u0004\ba\u0010bJ\u0017\u0010d\u001a\u00020\u000f2\u0006\u0010c\u001a\u00020HH\u0002¢\u0006\u0004\bd\u0010bJ\u0017\u0010e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\be\u0010^J\u0017\u0010f\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bf\u0010^J\u0017\u0010g\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bg\u0010^J\u001f\u0010j\u001a\u00020\u000f2\u0006\u0010h\u001a\u00020\u00182\u0006\u0010i\u001a\u00020\u0018H\u0002¢\u0006\u0004\bj\u0010kJ\u0017\u0010l\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bl\u0010^J\u001f\u0010o\u001a\u00020\u000f2\u0006\u0010n\u001a\u00020m2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bq\u0010^J\u001f\u0010s\u001a\u00020\u000f2\u0006\u0010r\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bs\u0010tJ\u000f\u0010u\u001a\u00020\u000fH\u0002¢\u0006\u0004\bu\u0010\u0011J\u000f\u0010v\u001a\u00020\u000fH\u0002¢\u0006\u0004\bv\u0010\u0011J\u000f\u0010w\u001a\u00020\u000fH\u0002¢\u0006\u0004\bw\u0010\u0011J\u000f\u0010x\u001a\u00020\u000fH\u0002¢\u0006\u0004\bx\u0010\u0011J\u0017\u0010z\u001a\u00020\u000f2\u0006\u0010y\u001a\u00020\u0018H\u0002¢\u0006\u0004\bz\u0010{J\u0017\u0010|\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\b|\u0010bJ\u0017\u0010~\u001a\u00020\u000f2\u0006\u0010}\u001a\u00020UH\u0002¢\u0006\u0004\b~\u0010XJ\u000f\u0010\u007f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u007f\u0010\u0011J\u0019\u0010\u0080\u0001\u001a\u00020\u000f2\u0006\u0010}\u001a\u00020UH\u0002¢\u0006\u0005\b\u0080\u0001\u0010XJ\u0019\u0010\u0081\u0001\u001a\u00020\u000f2\u0006\u0010}\u001a\u00020UH\u0002¢\u0006\u0005\b\u0081\u0001\u0010XJ\u0019\u0010\u0082\u0001\u001a\u00020\u000f2\u0006\u0010}\u001a\u00020UH\u0002¢\u0006\u0005\b\u0082\u0001\u0010XJ\u001c\u0010\u0085\u0001\u001a\u00020\u000f2\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001c\u0010\u0088\u0001\u001a\u00020\u000f2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0005\b\u0088\u0001\u0010@J\u0019\u0010\u0089\u0001\u001a\u00020\u000f2\u0006\u0010}\u001a\u00020UH\u0002¢\u0006\u0005\b\u0089\u0001\u0010XJ\u0019\u0010\u008a\u0001\u001a\u00020\u000f2\u0006\u0010}\u001a\u00020UH\u0002¢\u0006\u0005\b\u008a\u0001\u0010XJ\u0019\u0010\u008b\u0001\u001a\u00020\u000f2\u0006\u0010}\u001a\u00020UH\u0002¢\u0006\u0005\b\u008b\u0001\u0010XJ\u0011\u0010\u008c\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b\u008c\u0001\u0010\u0011J\u001a\u0010\u008e\u0001\u001a\u00020\u000f2\u0007\u0010\u008d\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b\u008e\u0001\u0010{J\u0019\u0010\u008f\u0001\u001a\u00020\u000f2\u0006\u0010}\u001a\u00020UH\u0002¢\u0006\u0005\b\u008f\u0001\u0010XJ\u0019\u0010\u0090\u0001\u001a\u00020\u000f2\u0006\u0010}\u001a\u00020UH\u0002¢\u0006\u0005\b\u0090\u0001\u0010XR\u0017\u0010\u0093\u0001\u001a\u00020\u001a8\u0002X\u0082D¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001c\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001c\u0010£\u0001\u001a\u0005\u0018\u00010 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001c\u0010§\u0001\u001a\u0005\u0018\u00010¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001b\u0010ª\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R*\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010\u0092\u0001R\u0018\u0010\u001e\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010\u0092\u0001R\u001a\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u001a\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u001a\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u001c\u0010À\u0001\u001a\u0005\u0018\u00010½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u001c\u0010Ä\u0001\u001a\u0005\u0018\u00010Á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u001c\u0010È\u0001\u001a\u0005\u0018\u00010Å\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R#\u0010Î\u0001\u001a\u0005\u0018\u00010É\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001R\u001c\u0010Ò\u0001\u001a\u0005\u0018\u00010Ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u001c\u0010Ö\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u0018\u0010Ø\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bV\u0010×\u0001R\u0019\u0010Ú\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010×\u0001R\u0019\u0010Ü\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010×\u0001R\u0018\u0010Ý\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b[\u0010×\u0001R\u0019\u0010Þ\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010×\u0001R\u0018\u0010à\u0001\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bo\u0010ß\u0001R\u0015\u0010á\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010vR\u0016\u0010â\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010vR\u0016\u0010ä\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bã\u0001\u0010vR\u0016\u0010æ\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bå\u0001\u0010vR\u0016\u0010ç\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010vR\u0016\u0010è\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010vR\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0092\u0001R\u0017\u0010ë\u0001\u001a\u00030é\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bv\u0010ê\u0001R\u0019\u0010ì\u0001\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010ß\u0001R\u0018\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0001\u0010×\u0001R\u0018\u0010î\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bw\u0010×\u0001R\u0019\u0010ð\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0001\u0010×\u0001R\u0016\u0010ñ\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010vR\u0018\u0010 \u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010×\u0001R\u001b\u0010ô\u0001\u001a\u0005\u0018\u00010ò\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b|\u0010ó\u0001R\u0018\u0010ø\u0001\u001a\u00030õ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bö\u0001\u0010÷\u0001R!\u0010ý\u0001\u001a\u00030ù\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bú\u0001\u0010Ë\u0001\u001a\u0006\bû\u0001\u0010ü\u0001R\u001f\u0010\u0080\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001a0þ\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b~\u0010ÿ\u0001¨\u0006\u0082\u0002²\u0006\u000e\u0010\u009b\u0001\u001a\u00030\u0098\u00018\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u009f\u0001\u001a\u00030\u009c\u00018\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0081\u0002\u001a\u00030 \u00018\nX\u008a\u0084\u0002"}, m97100d2 = {"Lcom/transsion/postdetail/ui/view/ImmVideoItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/transsion/player/orplayer/f;", "Landroid/view/View$OnClickListener;", "Landroidx/lifecycle/r;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", WebConstants.FIELD_ITEM, "Landroidx/fragment/app/Fragment;", "fragment", RequestParameters.POSITION, "", "videoLoadMore", "", "basePostId", "baseItemType", "attachToMain", "commentId", "pageFrom", "isFromDownloaded", "setData", "(Lcom/transsion/moviedetailapi/bean/PostSubjectItem;Landroidx/fragment/app/Fragment;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V", "Lcom/transsion/player/orplayer/g;", "orPlayer", "Lcom/transsion/player/ui/ORPlayerView;", "orPlayerView", "setPlayer", "(Lcom/transsion/player/orplayer/g;Lcom/transsion/player/ui/ORPlayerView;)V", "Lcom/transsion/shorttv/base/pager/PagerLayoutManager;", "pagerLayoutManager", "setPagerLayoutManager", "(Lcom/transsion/shorttv/base/pager/PagerLayoutManager;)V", "Landroid/widget/FrameLayout;", "getPlayerContainer", "()Landroid/widget/FrameLayout;", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroidx/lifecycle/u;", EventConstants.KEY_SOURCE, "Landroidx/lifecycle/Lifecycle$Event;", "onStateChanged", "(Landroidx/lifecycle/u;Landroidx/lifecycle/Lifecycle$Event;)V", "onPlayerReset", "Lfo/e;", "mediaSource", "onPlayerRelease", "(Lfo/e;)V", "app2Background", "videoStartPrepare", "(Ljava/lang/String;)V", "url", "setVideoUrl", "onSetDataSource", "onRenderFirstFrame", "onVideoStart", "onPrepare", "onVideoPause", "", NotificationCompat.CATEGORY_PROGRESS, "onProgress", "(JLfo/e;)V", "onLoadingBegin", "onLoadingEnd", "Lcom/transsion/player/orplayer/PlayError;", "errorInfo", "onPlayError", "(Lcom/transsion/player/orplayer/PlayError;Lfo/e;)V", "onLoopingStart", "onCompletion", "setOnSeekCompleteListener", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "showCommentDialog", NativeComponentConstants.KEY_COMPONENT_TYPE, "y", "B", "p0", "(Lcom/transsion/moviedetailapi/bean/PostSubjectItem;)V", "i0", "comment", "e0", "(J)V", "share", "l0", "o0", "setBottomSubjectModuleData", "setBottomRoomModuleData", "isShowSubject", "isShowRoom", "setBottomSubjectAndRoomVisibility", "(ZZ)V", "f0", "Lcom/transsion/moviedetailapi/bean/CommentBean;", "hotComment", "A", "(Lcom/transsion/moviedetailapi/bean/CommentBean;Lcom/transsion/moviedetailapi/bean/PostSubjectItem;)V", "W", "moduleName", "X", "(Ljava/lang/String;Lcom/transsion/moviedetailapi/bean/PostSubjectItem;)V", "m0", "I", "L", "U", PushConstants.PUSH_SERVICE_TYPE_SHOW, "setLoading", "(Z)V", "P", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "S", "j0", "O", "N", "T", "Lcom/transsion/baselib/db/download/DownloadBean;", "download", "Y", "(Lcom/transsion/baselib/db/download/DownloadBean;)V", "id", "z", "F", "H", "G", "C", "visible", "setContentVisibility", "c0", "d0", "a", "Ljava/lang/String;", "TAG", "Lvo/w;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lvo/w;", "viewBinding", "Lcom/transsion/postdetail/viewmodel/PostDetailViewModel;", "c", "Lcom/transsion/postdetail/viewmodel/PostDetailViewModel;", "videoDetailModel", "Lcom/transsion/postdetail/shorttv/ShortTvPlayListViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/postdetail/shorttv/ShortTvPlayListViewModel;", "shortTvPlayListViewModel", "Lcom/transsion/postdetail/viewmodel/CommentViewModel;", "e", "Lcom/transsion/postdetail/viewmodel/CommentViewModel;", "mCommentViewModel", "Lcom/transsion/share/share/ShareDialogFragment;", "f", "Lcom/transsion/share/share/ShareDialogFragment;", "mShareDialog", "g", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "data", "h", "Landroidx/fragment/app/Fragment;", "i", "Ljava/lang/Boolean;", "j", "Ljava/lang/Integer;", "getPosition", "()Ljava/lang/Integer;", "setPosition", "(Ljava/lang/Integer;)V", CampaignEx.JSON_KEY_AD_K, "l", "m", "Lcom/transsion/player/orplayer/g;", "n", "Lcom/transsion/player/ui/ORPlayerView;", "o", "Lcom/transsion/shorttv/base/pager/PagerLayoutManager;", "Lfq/a;", TtmlNode.TAG_P, "Lfq/a;", "audioApi", "Lcom/transsion/postdetail/ui/view/ImmVideoGuideView;", CampaignEx.JSON_KEY_AD_Q, "Lcom/transsion/postdetail/ui/view/ImmVideoGuideView;", "guideView", "Landroid/view/GestureDetector;", CampaignEx.JSON_KEY_AD_R, "Landroid/view/GestureDetector;", "gestureDetector", "Lgz/a;", "s", "Lkotlin/Lazy;", "getLoginApi", "()Lgz/a;", "loginApi", "Lcom/transsion/postdetail/layer/b;", "t", "Lcom/transsion/postdetail/layer/b;", "dotLayer", "Lcom/transsion/postdetail/ui/dialog/ImmVideoCommentDialog;", TmcStartParams.KEY_URL_SHORT, "Lcom/transsion/postdetail/ui/dialog/ImmVideoCommentDialog;", "commentDialog", "Z", "isClickPause", "w", "isHorizontalDragging", "x", "isPageHide", "isShowHotComment", "isFavoriteShow", "J", "currentSaveProgress", "resImgLargeWidth", "resImgLargeHeight", "D", "resImgSmallWidth", "E", "resImgSmallHeight", "screenHeight", "dp170", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isSeekToFinish", "nextSeekTo", "K", "isPageRelease", "M", "isLongPressTriggered", "screenWidth", "Landroid/animation/ObjectAnimator;", "Landroid/animation/ObjectAnimator;", "rotateAnimator", "com/transsion/postdetail/ui/view/ImmVideoItemView$b", "Q", "Lcom/transsion/postdetail/ui/view/ImmVideoItemView$b;", "downloadListener", "Lcom/transsnet/downloader/manager/g;", "R", "getDownloadManager", "()Lcom/transsnet/downloader/manager/g;", "downloadManager", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/c0;", "favoriteResultObserver", "commentViewModel", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ImmVideoItemView extends ConstraintLayout implements InterfaceC16633f, View.OnClickListener, InterfaceC3218r {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private long currentSaveProgress;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final int resImgLargeWidth;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final int resImgLargeHeight;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final int resImgSmallWidth;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final int resImgSmallHeight;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final int screenHeight;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final int dp170;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private String pageFrom;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final AtomicBoolean isSeekToFinish;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private long nextSeekTo;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private boolean attachToMain;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private boolean isPageRelease;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private boolean isLongPressTriggered;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final int screenWidth;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private boolean isFromDownloaded;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private ObjectAnimator rotateAnimator;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final C17310b downloadListener;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final Lazy downloadManager;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final InterfaceC3189c0 favoriteResultObserver;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28178w viewBinding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private PostDetailViewModel videoDetailModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private ShortTvPlayListViewModel shortTvPlayListViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private CommentViewModel mCommentViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private ShareDialogFragment mShareDialog;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private PostSubjectItem data;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Fragment fragment;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private Boolean videoLoadMore;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private Integer position;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String basePostId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String commentId;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private InterfaceC16634g orPlayer;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private ORPlayerView orPlayerView;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private PagerLayoutManager pagerLayoutManager;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private InterfaceC23410a audioApi;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private ImmVideoGuideView guideView;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private GestureDetector gestureDetector;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final Lazy loginApi;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private C16781b dotLayer;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private ImmVideoCommentDialog commentDialog;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean isClickPause;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private boolean isHorizontalDragging;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean isPageHide;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean isShowHotComment;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private boolean isFavoriteShow;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.ImmVideoItemView$a */
    public /* synthetic */ class C17309a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f57573a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f57573a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.ImmVideoItemView$b */
    public static final class C17310b implements InterfaceC26269m0 {
        C17310b() {
        }

        /* JADX INFO: renamed from: i */
        private final void m74669i(DownloadBean downloadBean) {
            String postId = downloadBean.getPostId();
            PostSubjectItem postSubjectItem = ImmVideoItemView.this.data;
            if (!Intrinsics.m97797c(postId, postSubjectItem != null ? postSubjectItem.getPostId() : null)) {
                String resourceId = downloadBean.getResourceId();
                PostSubjectItem postSubjectItem2 = ImmVideoItemView.this.data;
                if (!Intrinsics.m97797c(resourceId, postSubjectItem2 != null ? postSubjectItem2.getPostId() : null)) {
                    return;
                }
            }
            final ImmVideoItemView immVideoItemView = ImmVideoItemView.this;
            immVideoItemView.post(new Runnable() { // from class: com.transsion.postdetail.ui.view.r
                @Override // java.lang.Runnable
                public final void run() {
                    ImmVideoItemView.C17310b.m74670j(immVideoItemView);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final void m74670j(ImmVideoItemView immVideoItemView) {
            immVideoItemView.m74644j0();
        }

        @Override // p648oj.InterfaceC26269m0
        /* JADX INFO: renamed from: a */
        public void mo24046a(DownloadBean bean, DownloadException downloadException) {
            Intrinsics.m97802h(bean, "bean");
            m74669i(bean);
        }

        @Override // p648oj.InterfaceC26269m0
        /* JADX INFO: renamed from: b */
        public void mo24047b(DownloadBean bean) {
            Intrinsics.m97802h(bean, "bean");
            m74669i(bean);
        }

        @Override // p648oj.InterfaceC26269m0
        /* JADX INFO: renamed from: c */
        public void mo24048c(DownloadBean bean, long j11, long j12) {
            Intrinsics.m97802h(bean, "bean");
            m74669i(bean);
        }

        @Override // p648oj.InterfaceC26269m0
        /* JADX INFO: renamed from: d */
        public void mo24049d(DownloadBean bean) {
            Intrinsics.m97802h(bean, "bean");
            m74669i(bean);
        }

        @Override // p648oj.InterfaceC26269m0
        /* JADX INFO: renamed from: e */
        public void mo24050e(DownloadBean bean, String str) {
            Intrinsics.m97802h(bean, "bean");
            m74669i(bean);
        }

        @Override // p648oj.InterfaceC26269m0
        /* JADX INFO: renamed from: f */
        public void mo24051f(DownloadBean bean) {
            Intrinsics.m97802h(bean, "bean");
            m74669i(bean);
        }

        @Override // p648oj.InterfaceC26269m0
        /* JADX INFO: renamed from: g */
        public void mo24052g(DownloadBean bean) {
            Intrinsics.m97802h(bean, "bean");
            m74669i(bean);
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.ImmVideoItemView$c */
    public static final class C17311c extends GestureDetector.SimpleOnGestureListener {
        C17311c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            return super.onDoubleTap(e11);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            super.onLongPress(e11);
            int i11 = ImmVideoItemView.this.screenWidth / 3;
            int x11 = (int) e11.getX();
            ImmVideoItemView.this.isLongPressTriggered = true;
            if (x11 >= 0 && x11 <= i11) {
                C26866a.a.m104898f(C26866a.f81698a, ImmVideoItemView.this.TAG, "左边长按，clickX=" + x11 + ", cut=" + i11, false, 4, null);
                return;
            }
            if (x11 > i11 * 2) {
                C26866a.a.m104898f(C26866a.f81698a, ImmVideoItemView.this.TAG, "右边长按，clickX=" + x11 + ", cut=" + i11, false, 4, null);
                return;
            }
            C26866a.a.m104898f(C26866a.f81698a, ImmVideoItemView.this.TAG, "中间长按，clickX=" + x11 + ", cut=" + i11, false, 4, null);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            ImmVideoItemView.this.m74626U();
            return super.onSingleTapUp(e11);
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.ImmVideoItemView$d */
    public static final class C17312d implements C14582f.a {

        /* JADX INFO: renamed from: a */
        private int f57576a;

        /* JADX INFO: renamed from: b */
        private int f57577b;

        /* JADX INFO: renamed from: c */
        private int f57578c;

        /* JADX INFO: renamed from: d */
        private String f57579d = "";

        /* JADX INFO: renamed from: e */
        private int f57580e = AbstractC5776a0.m27313a(1.5f);

        C17312d() {
        }

        @Override // com.transsion.baseui.widget.C14582f.a
        /* JADX INFO: renamed from: a */
        public void mo65769a() {
        }

        @Override // com.transsion.baseui.widget.C14582f.a
        /* JADX INFO: renamed from: b */
        public void mo65770b(float f11, float f12) {
            int i11 = 0;
            if (!ImmVideoItemView.this.isHorizontalDragging) {
                PagerLayoutManager pagerLayoutManager = ImmVideoItemView.this.pagerLayoutManager;
                if (pagerLayoutManager != null) {
                    pagerLayoutManager.m79146W(false);
                }
                this.f57576a = ImmVideoItemView.this.viewBinding.f86692u.getProgress();
                ImmVideoItemView.this.setContentVisibility(false);
                AppCompatTextView tvProgressDes = ImmVideoItemView.this.viewBinding.f86665D;
                Intrinsics.m97801g(tvProgressDes, "tvProgressDes");
                AbstractC26006c.m102058k(tvProgressDes);
                AppCompatSeekBar seekBar = ImmVideoItemView.this.viewBinding.f86694w;
                Intrinsics.m97801g(seekBar, "seekBar");
                AbstractC26006c.m102058k(seekBar);
                ProgressBar progressBar = ImmVideoItemView.this.viewBinding.f86692u;
                Intrinsics.m97801g(progressBar, "progressBar");
                AbstractC26006c.m102054g(progressBar);
                this.f57578c = ImmVideoItemView.this.viewBinding.f86692u.getWidth();
                int max = ImmVideoItemView.this.viewBinding.f86692u.getMax();
                this.f57577b = max;
                this.f57579d = AbstractC17443m.m74968c(max);
            }
            ImmVideoItemView.this.isHorizontalDragging = true;
            float f13 = f12 - f11;
            int i12 = this.f57577b;
            int i13 = (int) (this.f57576a + ((f13 * i12) / this.f57578c));
            if (i13 >= 0) {
                i11 = i13 > i12 ? i12 : i13;
            }
            ImmVideoItemView.this.viewBinding.f86665D.setText(AbstractC17443m.m74968c(i11) + " / " + this.f57579d);
            ImmVideoItemView.this.viewBinding.f86692u.setProgress(i11);
            ImmVideoItemView.this.viewBinding.f86694w.setProgress(i11);
        }

        @Override // com.transsion.baseui.widget.C14582f.a
        /* JADX INFO: renamed from: c */
        public void mo65771c(float f11, float f12) {
        }

        @Override // com.transsion.baseui.widget.C14582f.a
        /* JADX INFO: renamed from: d */
        public void mo65772d(float f11, float f12) {
        }

        @Override // com.transsion.baseui.widget.C14582f.a
        /* JADX INFO: renamed from: e */
        public void mo65773e() {
            InterfaceC16634g interfaceC16634g;
            PagerLayoutManager pagerLayoutManager = ImmVideoItemView.this.pagerLayoutManager;
            if (pagerLayoutManager != null) {
                pagerLayoutManager.m79146W(true);
            }
            if (ImmVideoItemView.this.isHorizontalDragging) {
                ImmVideoItemView.this.isHorizontalDragging = false;
                ImmVideoItemView.this.setContentVisibility(true);
                AppCompatTextView tvProgressDes = ImmVideoItemView.this.viewBinding.f86665D;
                Intrinsics.m97801g(tvProgressDes, "tvProgressDes");
                AbstractC26006c.m102054g(tvProgressDes);
                AppCompatSeekBar seekBar = ImmVideoItemView.this.viewBinding.f86694w;
                Intrinsics.m97801g(seekBar, "seekBar");
                AbstractC26006c.m102054g(seekBar);
                ProgressBar progressBar = ImmVideoItemView.this.viewBinding.f86692u;
                Intrinsics.m97801g(progressBar, "progressBar");
                AbstractC26006c.m102058k(progressBar);
                long progress = ImmVideoItemView.this.viewBinding.f86692u.getProgress();
                ImmVideoItemView immVideoItemView = ImmVideoItemView.this;
                if (immVideoItemView.isSeekToFinish.compareAndSet(true, false)) {
                    InterfaceC16634g interfaceC16634g2 = ImmVideoItemView.this.orPlayer;
                    if (interfaceC16634g2 != null) {
                        interfaceC16634g2.seekTo(progress);
                    }
                    progress = 0;
                }
                immVideoItemView.nextSeekTo = progress;
                InterfaceC16634g interfaceC16634g3 = ImmVideoItemView.this.orPlayer;
                if (interfaceC16634g3 == null || interfaceC16634g3.isPlaying() || (interfaceC16634g = ImmVideoItemView.this.orPlayer) == null) {
                    return;
                }
                interfaceC16634g.play();
            }
        }

        @Override // com.transsion.baseui.widget.C14582f.a
        public void onDoubleTap(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
        }

        @Override // com.transsion.baseui.widget.C14582f.a
        public void onLongPress(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.ImmVideoItemView$e */
    public static final class C17313e implements InterfaceC18701a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f57582a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ImmVideoItemView f57583b;

        /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.ImmVideoItemView$e$a */
        public static final class a implements PostConfirmDialog.InterfaceC16991a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ ImmVideoItemView f57584a;

            a(ImmVideoItemView immVideoItemView) {
                this.f57584a = immVideoItemView;
            }

            @Override // com.transsion.postdetail.p306ui.dialog.PostConfirmDialog.InterfaceC16991a
            /* JADX INFO: renamed from: a */
            public void mo73953a() {
                String postId;
                PostDetailViewModel postDetailViewModel;
                PostSubjectItem postSubjectItem = this.f57584a.data;
                if (postSubjectItem == null || (postId = postSubjectItem.getPostId()) == null || (postDetailViewModel = this.f57584a.videoDetailModel) == null) {
                    return;
                }
                postDetailViewModel.m75053r(postId);
            }
        }

        C17313e(View view, ImmVideoItemView immVideoItemView) {
            this.f57582a = view;
            this.f57583b = immVideoItemView;
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: a */
        public void mo70521a(String id2, PostType postType) {
            Fragment fragment;
            FragmentManager childFragmentManager;
            Intrinsics.m97802h(id2, "id");
            PostConfirmDialog postConfirmDialog = new PostConfirmDialog();
            postConfirmDialog.m73952r0(new a(this.f57583b));
            Fragment fragment2 = this.f57583b.fragment;
            if (fragment2 == null || !fragment2.isAdded() || (fragment = this.f57583b.fragment) == null || (childFragmentManager = fragment.getChildFragmentManager()) == null) {
                return;
            }
            childFragmentManager.m14537g0();
            if (postConfirmDialog.isAdded() || childFragmentManager.m14547k0("PostConfirmDialog") != null) {
                return;
            }
            postConfirmDialog.show(childFragmentManager, "PostConfirmDialog");
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: b */
        public void mo70522b(String str) {
            this.f57583b.m74667z(str);
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: c */
        public void mo70523c(String url, String fileName, String fileSize, String fileImage) {
            Subject subject;
            ResourceDetectors resourceDetector;
            String resourceLink;
            Media media;
            Cover cover;
            Integer size;
            Media media2;
            Cover cover2;
            String url2;
            String url3;
            String url4;
            Media media3;
            Intrinsics.m97802h(url, "url");
            Intrinsics.m97802h(fileName, "fileName");
            Intrinsics.m97802h(fileSize, "fileSize");
            Intrinsics.m97802h(fileImage, "fileImage");
            if (C14557c.f51100a.m65671a(this.f57582a.getId(), 500L)) {
                return;
            }
            PostSubjectItem postSubjectItem = this.f57583b.data;
            Video videoM74975a = AbstractC17450t.m74975a((postSubjectItem == null || (media3 = postSubjectItem.getMedia()) == null) ? null : media3.getVideo());
            PostSubjectItem postSubjectItem2 = this.f57583b.data;
            String title = postSubjectItem2 != null ? postSubjectItem2.getTitle() : null;
            if (TextUtils.isEmpty(title)) {
                PostSubjectItem postSubjectItem3 = this.f57583b.data;
                title = postSubjectItem3 != null ? postSubjectItem3.getContent() : null;
            }
            String str = title;
            String str2 = (videoM74975a == null || (url4 = videoM74975a.getUrl()) == null) ? "" : url4;
            String str3 = (videoM74975a == null || (url3 = videoM74975a.getUrl()) == null) ? "" : url3;
            PostSubjectItem postSubjectItem4 = this.f57583b.data;
            String str4 = (postSubjectItem4 == null || (media2 = postSubjectItem4.getMedia()) == null || (cover2 = media2.getCover()) == null || (url2 = cover2.getUrl()) == null) ? "" : url2;
            Long lValueOf = (videoM74975a == null || (size = videoM74975a.getSize()) == null) ? null : Long.valueOf(size.intValue());
            PostSubjectItem postSubjectItem5 = this.f57583b.data;
            String postId = postSubjectItem5 != null ? postSubjectItem5.getPostId() : null;
            PostSubjectItem postSubjectItem6 = this.f57583b.data;
            DownloadBean downloadBean = new DownloadBean(str2, str3, str, str4, lValueOf, postSubjectItem6 != null ? postSubjectItem6.getPostId() : null, null, null, null, null, 0L, 0, 0, 0, 0L, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, postId, null, null, null, 0L, 0, 0, null, null, 0L, null, null, 0L, 0, 0L, null, 0, null, null, false, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -134217792, -1, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
            PostSubjectItem postSubjectItem7 = this.f57583b.data;
            downloadBean.setThumbnail((postSubjectItem7 == null || (media = postSubjectItem7.getMedia()) == null || (cover = media.getCover()) == null) ? null : cover.getThumbnail());
            PostSubjectItem postSubjectItem8 = this.f57583b.data;
            if (postSubjectItem8 == null || !postSubjectItem8.getBuiltIn()) {
                DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
                Context context = this.f57583b.getContext();
                Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                PostSubjectItem postSubjectItem9 = this.f57583b.data;
                String ops = postSubjectItem9 != null ? postSubjectItem9.getOps() : null;
                PostSubjectItem postSubjectItem10 = this.f57583b.data;
                downloadManagerApiM87093a.m87082O(fragmentActivity, downloadBean, VideoFragment.PAGE_NAME, ops, (postSubjectItem10 == null || (subject = postSubjectItem10.getSubject()) == null || (resourceDetector = subject.getResourceDetector()) == null || (resourceLink = resourceDetector.getResourceLink()) == null) ? "" : resourceLink, (64 & 32) != 0 ? null : null, (64 & 64) != 0 ? null : null);
            } else {
                this.f57583b.m74630Y(downloadBean);
            }
            C16768a.f56378a.m73074i(this.f57583b.data, VideoFragment.PAGE_NAME, this.f57583b.pageFrom);
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: d */
        public void mo70524d(String id2) {
            Intrinsics.m97802h(id2, "id");
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: e */
        public void mo70525e(String str) {
            InterfaceC18701a.a.m78649c(this, str);
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.ImmVideoItemView$f */
    public static final class C17314f implements CommentFragment.InterfaceC17008b {
        C17314f() {
        }

        @Override // com.transsion.postdetail.p306ui.fragment.CommentFragment.InterfaceC17008b
        /* JADX INFO: renamed from: a */
        public void mo74040a(long j11) {
            Stat stat;
            PostSubjectItem postSubjectItem = ImmVideoItemView.this.data;
            if (postSubjectItem != null && (stat = postSubjectItem.getStat()) != null) {
                stat.setCommentCount(Long.valueOf(j11));
            }
            ImmVideoItemView.this.m74636e0(j11);
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.ImmVideoItemView$g */
    public static final class C17315g implements ExpandView.InterfaceC13757c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Ref.BooleanRef f57586a;

        C17315g(Ref.BooleanRef booleanRef) {
            this.f57586a = booleanRef;
        }

        @Override // com.p282tn.lib.view.expand.ExpandView.InterfaceC13757c
        /* JADX INFO: renamed from: a */
        public void mo62199a(ExpandView expandView) {
            this.f57586a.element = true;
        }

        @Override // com.p282tn.lib.view.expand.ExpandView.InterfaceC13757c
        /* JADX INFO: renamed from: b */
        public void mo62200b(ExpandView expandView) {
            this.f57586a.element = false;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.ImmVideoItemView$h */
    public static final class C17316h implements InterfaceC14561g {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Ref.ObjectRef f57587a;

        C17316h(Ref.ObjectRef objectRef) {
            this.f57587a = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.transsion.baseui.util.InterfaceC14561g
        /* JADX INFO: renamed from: a */
        public void mo65676a(List list) {
            Intrinsics.m97802h(list, "list");
            this.f57587a.element = list;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImmVideoItemView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImmVideoItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImmVideoItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.TAG = "ImmVideoPlayer";
        this.commentId = "";
        this.loginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.view.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImmVideoItemView.m74610E();
            }
        });
        this.screenHeight = AbstractC5806y.m27487c();
        this.dp170 = AbstractC5776a0.m27313a(170.0f);
        this.isSeekToFinish = new AtomicBoolean(true);
        this.attachToMain = true;
        this.screenWidth = AbstractC5806y.m27489e();
        this.downloadListener = new C17310b();
        this.downloadManager = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.view.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImmVideoItemView.m74664w();
            }
        });
        this.favoriteResultObserver = new InterfaceC3189c0() { // from class: com.transsion.postdetail.ui.view.j
            @Override // androidx.p1004lifecycle.InterfaceC3189c0
            public final void onChanged(Object obj) {
                ImmVideoItemView.m74665x(this.f57740a, (String) obj);
            }
        };
        View.inflate(getContext(), R$layout.layout_immersion_video_item_view, this);
        C28178w c28178wM109385a = C28178w.m109385a(this);
        Intrinsics.m97801g(c28178wM109385a, "bind(...)");
        this.viewBinding = c28178wM109385a;
        c28178wM109385a.f86664C.setOnClickListener(this);
        c28178wM109385a.f86695x.setOnClickListener(this);
        c28178wM109385a.f86666E.setOnClickListener(this);
        c28178wM109385a.f86686o.setOnClickListener(this);
        c28178wM109385a.f86688q.setOnClickListener(this);
        c28178wM109385a.f86689r.f86387b.setOnClickListener(this);
        c28178wM109385a.f86689r.f86391f.setOnClickListener(this);
        c28178wM109385a.f86667F.setOnClickListener(this);
        c28178wM109385a.f86681j.setOnClickListener(this);
        c28178wM109385a.f86687p.setOnClickListener(this);
        c28178wM109385a.f86668G.setOnClickListener(this);
        c28178wM109385a.f86675d.setOnClickListener(this);
        this.resImgLargeWidth = AbstractC5776a0.m27313a(48.0f);
        this.resImgLargeHeight = AbstractC5776a0.m27313a(64.0f);
        this.resImgSmallWidth = AbstractC5776a0.m27313a(24.0f);
        this.resImgSmallHeight = AbstractC5776a0.m27313a(32.0f);
        m74607B(context);
        if (ImmVideoHelper.f56352h.m73010a().m72999h() > 0) {
            ViewGroup.LayoutParams layoutParams = c28178wM109385a.f86693v.getLayoutParams();
            Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
            if (((ViewGroup.MarginLayoutParams) c2308b).bottomMargin < AbstractC5776a0.m27313a(35.0f)) {
                ((ViewGroup.MarginLayoutParams) c2308b).bottomMargin += AbstractC5776a0.m27313a(10.0f);
                c28178wM109385a.f86693v.setLayoutParams(c2308b);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    private final void m74606A(CommentBean hotComment, PostSubjectItem item) {
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.base_net_err);
            return;
        }
        Boolean likeStatu = hotComment.getLikeStatu();
        Boolean bool = Boolean.TRUE;
        boolean zM97797c = Intrinsics.m97797c(likeStatu, bool);
        AppCompatImageView appCompatImageView = this.viewBinding.f86684m;
        if (appCompatImageView != null) {
            if (appCompatImageView.isEnabled()) {
                appCompatImageView.setEnabled(false);
                hotComment.setLikeStatu(Boolean.FALSE);
                if (hotComment.getLikeCnt() > 0) {
                    hotComment.setLikeCnt(hotComment.getLikeCnt() - 1);
                }
            } else {
                appCompatImageView.setEnabled(true);
                hotComment.setLikeStatu(bool);
                hotComment.setLikeCnt(hotComment.getLikeCnt() + 1);
            }
        }
        this.viewBinding.f86663B.setText(hotComment.getLikeCnt() == 0 ? "" : AbstractC14564j.m65680a(hotComment.getLikeCnt()));
        String commentId = hotComment.getCommentId();
        if (commentId != null) {
            m74629X(zM97797c ? "dislike_hot_comment" : "like_hot_comment", item);
            CommentLikeBody commentLikeBody = new CommentLikeBody(commentId, Integer.valueOf(zM97797c ? 1 : 0));
            CommentViewModel commentViewModel = this.mCommentViewModel;
            if (commentViewModel != null) {
                commentViewModel.m74996q(commentLikeBody);
            }
            C25891b c25891b = new C25891b(!zM97797c, commentId, hotComment.getLikeCnt());
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = C25891b.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.postEvent(name, c25891b, 0L);
        }
    }

    /* JADX INFO: renamed from: B */
    private final void m74607B(Context context) {
        this.gestureDetector = new GestureDetector(context, new C17311c());
        m74617L();
        m74614I();
        m74608C();
    }

    /* JADX INFO: renamed from: C */
    private final void m74608C() {
        new C14582f(getContext(), this.viewBinding.f86671J).m65768s(new C17312d());
        this.viewBinding.f86694w.setOnTouchListener(new View.OnTouchListener() { // from class: com.transsion.postdetail.ui.view.g
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ImmVideoItemView.m74609D(view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final boolean m74609D(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final InterfaceC23704a m74610E() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: renamed from: F */
    private final void m74611F(View view) {
        if (C14557c.f51100a.m65671a(view.getId(), 500L)) {
            return;
        }
        UserInfo userInfo = new UserInfo();
        PostSubjectItem postSubjectItem = this.data;
        User user = postSubjectItem != null ? postSubjectItem.getUser() : null;
        userInfo.setUserId(user != null ? user.getUserId() : null);
        userInfo.setNickname(user != null ? user.getNickname() : null);
        userInfo.setUsername(user != null ? user.getUsername() : null);
        userInfo.setAvatar(user != null ? user.getAvatar() : null);
        Navigator.m61845x(TheRouter.m61773c("/profile/user_profile").m61857K("userId", userInfo.getUserId()), getContext(), null, 2, null);
        C16768a.f56378a.m73070c(this.data, VideoFragment.PAGE_NAME, this.pageFrom);
    }

    /* JADX INFO: renamed from: G */
    private final void m74612G(View view) {
        Group group;
        Integer num;
        FragmentActivity fragmentActivityRequireActivity;
        if (C14557c.f51100a.m65671a(view.getId(), 500L)) {
            return;
        }
        String strM100903c = C25636b.f77779b.m100905a().m100903c();
        InterfaceC23415f interfaceC23415f = (InterfaceC23415f) TheRouter.m61774d(InterfaceC23415f.class, new Object[0]);
        if (!TextUtils.equals(strM100903c, interfaceC23415f != null ? interfaceC23415f.mo92966d() : null) || (num = this.position) == null || num.intValue() != 0) {
            Navigator navigatorM61773c = TheRouter.m61773c("/room/detail");
            PostSubjectItem postSubjectItem = this.data;
            Navigator.m61845x(navigatorM61773c.m61857K("id", (postSubjectItem == null || (group = postSubjectItem.getGroup()) == null) ? null : group.getGroupId()), getContext(), null, 2, null);
            C16768a.f56378a.m73077m(this.data, VideoFragment.PAGE_NAME, this.pageFrom);
            return;
        }
        Fragment fragment = this.fragment;
        if (fragment == null || (fragmentActivityRequireActivity = fragment.requireActivity()) == null) {
            return;
        }
        fragmentActivityRequireActivity.finish();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ec  */
    /* JADX INFO: renamed from: H */
    private final void m74613H(View view) {
        PostSubjectItem postSubjectItem;
        int value;
        PostSubjectItem postSubjectItem2;
        String subjectId;
        PostSubjectItem postSubjectItem3;
        String ops;
        Subject subject;
        Subject subject2;
        Integer subjectType;
        Subject subject3;
        Subject subject4;
        Integer num;
        FragmentActivity fragmentActivityRequireActivity;
        if (C14557c.f51100a.m65671a(view.getId(), 500L)) {
            return;
        }
        String strM100903c = C25636b.f77779b.m100905a().m100903c();
        InterfaceC16246g interfaceC16246g = (InterfaceC16246g) TheRouter.m61774d(InterfaceC16246g.class, new Object[0]);
        if (TextUtils.equals(strM100903c, interfaceC16246g != null ? interfaceC16246g.mo71007d() : null) && (num = this.position) != null && num.intValue() == 0) {
            Fragment fragment = this.fragment;
            if (fragment == null || (fragmentActivityRequireActivity = fragment.requireActivity()) == null) {
                return;
            }
            fragmentActivityRequireActivity.finish();
            return;
        }
        PostSubjectItem postSubjectItem4 = this.data;
        if (postSubjectItem4 == null || (subject3 = postSubjectItem4.getSubject()) == null) {
            Navigator navigatorM61773c = TheRouter.m61773c("/movie/detail");
            postSubjectItem = this.data;
            if (postSubjectItem != null || (subject2 = postSubjectItem.getSubject()) == null || (subjectType = subject2.getSubjectType()) == null) {
                value = SubjectType.MOVIE.getValue();
            } else {
                value = subjectType.intValue();
            }
            Navigator navigatorM61852F = navigatorM61773c.m61852F("subject_type", value);
            postSubjectItem2 = this.data;
            if (postSubjectItem2 != null || (subject = postSubjectItem2.getSubject()) == null) {
                subjectId = null;
            } else {
                subjectId = subject.getSubjectId();
            }
            Navigator navigatorM61857K = navigatorM61852F.m61857K("id", subjectId);
            postSubjectItem3 = this.data;
            if (postSubjectItem3 != null) {
                ops = postSubjectItem3.getOps();
            } else {
                ops = null;
            }
            Navigator.m61845x(navigatorM61857K.m61857K("ops", ops), getContext(), null, 2, null);
        } else {
            Integer subjectType2 = subject3.getSubjectType();
            int value2 = SubjectType.SHORT_TV.getValue();
            if (subjectType2 != null && subjectType2.intValue() == value2) {
                DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
                Context context = getContext();
                Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                PostSubjectItem postSubjectItem5 = this.data;
                String ops2 = (postSubjectItem5 == null || (subject4 = postSubjectItem5.getSubject()) == null) ? null : subject4.getOps();
                PostSubjectItem postSubjectItem6 = this.data;
                downloadManagerApiM87093a.m87086d0(fragmentActivity, VideoFragment.PAGE_NAME, (384 & 4) != 0 ? "" : "", ops2, (384 & 16) != 0 ? null : "download_subject", (384 & 32) != 0 ? false : false, (384 & 64) != 0 ? null : postSubjectItem6 != null ? postSubjectItem6.getSubject() : null, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? Boolean.FALSE : null);
            } else {
                Navigator navigatorM61773c2 = TheRouter.m61773c("/movie/detail");
                postSubjectItem = this.data;
                if (postSubjectItem != null) {
                    value = SubjectType.MOVIE.getValue();
                } else {
                    value = SubjectType.MOVIE.getValue();
                }
                Navigator navigatorM61852F2 = navigatorM61773c2.m61852F("subject_type", value);
                postSubjectItem2 = this.data;
                if (postSubjectItem2 != null) {
                    subjectId = null;
                } else {
                    subjectId = null;
                }
                Navigator navigatorM61857K2 = navigatorM61852F2.m61857K("id", subjectId);
                postSubjectItem3 = this.data;
                if (postSubjectItem3 != null) {
                    ops = postSubjectItem3.getOps();
                } else {
                    ops = null;
                }
                Navigator.m61845x(navigatorM61857K2.m61857K("ops", ops), getContext(), null, 2, null);
            }
        }
        C16768a.f56378a.m73068C(this.data, VideoFragment.PAGE_NAME, this.pageFrom);
    }

    /* JADX INFO: renamed from: I */
    private final void m74614I() {
        Context context = getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AppCompatActivity appCompatActivity = (AppCompatActivity) context;
        Function1 function1 = new Function1() { // from class: com.transsion.postdetail.ui.view.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImmVideoItemView.m74615J(this.f57734a, (AddToDownloadEvent) obj);
            }
        };
        AppScopeVMlProvider appScopeVMlProvider = AppScopeVMlProvider.INSTANCE;
        FlowEventBus flowEventBus = (FlowEventBus) appScopeVMlProvider.getApplicationScopeViewModel(FlowEventBus.class);
        String name = AddToDownloadEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        Lifecycle.State state = Lifecycle.State.CREATED;
        flowEventBus.observeEvent(appCompatActivity, name, state, C25220y0.m99269c().mo98454r(), false, function1);
        Context context2 = getContext();
        Intrinsics.m97800f(context2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        Function1 function2 = new Function1() { // from class: com.transsion.postdetail.ui.view.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImmVideoItemView.m74616K(this.f57736a, (C28673c) obj);
            }
        };
        FlowEventBus flowEventBus2 = (FlowEventBus) appScopeVMlProvider.getApplicationScopeViewModel(FlowEventBus.class);
        String name2 = C28673c.class.getName();
        Intrinsics.m97801g(name2, "getName(...)");
        flowEventBus2.observeEvent((AppCompatActivity) context2, name2, state, C25220y0.m99269c().mo98454r(), false, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final Unit m74615J(ImmVideoItemView immVideoItemView, AddToDownloadEvent value) {
        Subject subject;
        Intrinsics.m97802h(value, "value");
        try {
            String subjectId = value.getSubjectId();
            PostSubjectItem postSubjectItem = immVideoItemView.data;
            if (!TextUtils.equals(subjectId, (postSubjectItem == null || (subject = postSubjectItem.getSubject()) == null) ? null : subject.getSubjectId())) {
                return Unit.f75682a;
            }
        } catch (Exception unused) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail", false, 2, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final Unit m74616K(ImmVideoItemView immVideoItemView, C28673c value) {
        Subject subject;
        ShortTVFavInfo shortTVFavInfo;
        Subject subject2;
        Intrinsics.m97802h(value, "value");
        try {
            String strM110505c = value.m110505c();
            PostSubjectItem postSubjectItem = immVideoItemView.data;
            if (!TextUtils.equals(strM110505c, (postSubjectItem == null || (subject2 = postSubjectItem.getSubject()) == null) ? null : subject2.getSubjectId())) {
                return Unit.f75682a;
            }
            PostSubjectItem postSubjectItem2 = immVideoItemView.data;
            if (postSubjectItem2 != null && (subject = postSubjectItem2.getSubject()) != null && (shortTVFavInfo = subject.getShortTVFavInfo()) != null) {
                shortTVFavInfo.setFavoriteNum(value.m110504b());
                shortTVFavInfo.setHasFavorite(value.m110503a());
            }
            immVideoItemView.viewBinding.f86696y.setSelected(value.m110503a());
            AppCompatTextView appCompatTextView = immVideoItemView.viewBinding.f86696y;
            String strM110504b = value.m110504b();
            appCompatTextView.setText(AbstractC14564j.m65680a(strM110504b != null ? Long.parseLong(strM110504b) : 0L));
            return Unit.f75682a;
        } catch (Exception unused) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail", false, 2, null);
        }
    }

    /* JADX INFO: renamed from: L */
    private final void m74617L() {
        Context context = getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        Function1 function1 = new Function1() { // from class: com.transsion.postdetail.ui.view.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImmVideoItemView.m74618M(this.f57737a, (LikeEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = LikeEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent((AppCompatActivity) context, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final Unit m74618M(ImmVideoItemView immVideoItemView, LikeEvent value) {
        Stat stat;
        Stat stat2;
        Long likeCount;
        Stat stat3;
        Stat stat4;
        Long likeCount2;
        Intrinsics.m97802h(value, "value");
        try {
            String subjectId = value.getSubjectId();
            PostSubjectItem postSubjectItem = immVideoItemView.data;
            if (!TextUtils.equals(subjectId, postSubjectItem != null ? postSubjectItem.getPostId() : null)) {
                return Unit.f75682a;
            }
            PostSubjectItem postSubjectItem2 = immVideoItemView.data;
            if (postSubjectItem2 != null) {
                postSubjectItem2.setHasLike(Boolean.valueOf(value.getLike()));
            }
            if (value.getLike()) {
                PostSubjectItem postSubjectItem3 = immVideoItemView.data;
                if (postSubjectItem3 != null && (stat3 = postSubjectItem3.getStat()) != null) {
                    PostSubjectItem postSubjectItem4 = immVideoItemView.data;
                    stat3.setLikeCount((postSubjectItem4 == null || (stat4 = postSubjectItem4.getStat()) == null || (likeCount2 = stat4.getLikeCount()) == null) ? null : Long.valueOf(likeCount2.longValue() + 1));
                }
            } else {
                PostSubjectItem postSubjectItem5 = immVideoItemView.data;
                if (postSubjectItem5 != null && (stat = postSubjectItem5.getStat()) != null) {
                    PostSubjectItem postSubjectItem6 = immVideoItemView.data;
                    stat.setLikeCount((postSubjectItem6 == null || (stat2 = postSubjectItem6.getStat()) == null || (likeCount = stat2.getLikeCount()) == null) ? null : Long.valueOf(likeCount.longValue() - 1));
                }
            }
            PostSubjectItem postSubjectItem7 = immVideoItemView.data;
            if (postSubjectItem7 != null) {
                immVideoItemView.m74642i0(postSubjectItem7);
            }
            return Unit.f75682a;
        } catch (Exception unused) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail", false, 2, null);
        }
    }

    /* JADX INFO: renamed from: N */
    private final void m74619N(View view) {
        if (C14557c.f51100a.m65671a(view.getId(), 500L)) {
            return;
        }
        showCommentDialog();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.transsion.postdetail.viewmodel.PostDetailViewModel] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: O */
    private final void m74620O(View view) {
        if (C14557c.f51100a.m65671a(view.getId(), 500L)) {
            return;
        }
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_tips);
            return;
        }
        PostSubjectItem postSubjectItem = this.data;
        ?? M97797c = postSubjectItem != null ? Intrinsics.m97797c(postSubjectItem.getHasLike(), Boolean.TRUE) : 0;
        ?? r11 = this.videoDetailModel;
        if (r11 != 0) {
            PostSubjectItem postSubjectItem2 = this.data;
            r11.m75052G(postSubjectItem2 != null ? postSubjectItem2.getPostId() : null, M97797c);
        }
        C16768a c16768a = C16768a.f56378a;
        PostSubjectItem postSubjectItem3 = this.data;
        c16768a.m73079p(postSubjectItem3, postSubjectItem3 != null ? Intrinsics.m97797c(postSubjectItem3.getHasLike(), Boolean.TRUE) : false, VideoFragment.PAGE_NAME, this.pageFrom);
    }

    /* JADX INFO: renamed from: P */
    private final void m74621P(long progress) {
        Boolean bool = this.videoLoadMore;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.m97797c(bool, bool2)) {
            ImmVideoHelper.C16766a c16766a = ImmVideoHelper.f56352h;
            if (c16766a.m73010a().m73003n() && progress >= 1000) {
                c16766a.m73010a().m73008t();
                ImmVideoGuideView immVideoGuideViewM74605a = ImmVideoGuideView.INSTANCE.m74605a(this);
                immVideoGuideViewM74605a.postDelayed(new Runnable() { // from class: com.transsion.postdetail.ui.view.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImmVideoItemView.m74622Q(this.f57765a);
                    }
                }, 5000L);
                this.guideView = immVideoGuideViewM74605a;
                return;
            }
        }
        if (Intrinsics.m97797c(this.videoLoadMore, bool2) && Intrinsics.m97797c(this.pageFrom, "Trending")) {
            ImmVideoHelper.C16766a c16766a2 = ImmVideoHelper.f56352h;
            if (!c16766a2.m73010a().m73004o() || progress < 1000) {
                return;
            }
            c16766a2.m73010a().m73009u();
            ImmVideoGuideView immVideoGuideViewM74605a2 = ImmVideoGuideView.INSTANCE.m74605a(this);
            immVideoGuideViewM74605a2.postDelayed(new Runnable() { // from class: com.transsion.postdetail.ui.view.q
                @Override // java.lang.Runnable
                public final void run() {
                    ImmVideoItemView.m74623R(this.f57768a);
                }
            }, 5000L);
            this.guideView = immVideoGuideViewM74605a2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final void m74622Q(ImmVideoItemView immVideoItemView) {
        ImmVideoGuideView immVideoGuideView = immVideoItemView.guideView;
        if (immVideoGuideView != null) {
            immVideoGuideView.removeGuide();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final void m74623R(ImmVideoItemView immVideoItemView) {
        ImmVideoGuideView immVideoGuideView = immVideoItemView.guideView;
        if (immVideoGuideView != null) {
            immVideoGuideView.removeGuide();
        }
    }

    /* JADX INFO: renamed from: S */
    private final void m74624S(View view) {
        PostSubjectItem postSubjectItem;
        DownloadBean downloadBeanM89360G;
        if (C14557c.f51100a.m65671a(view.getId(), 500L) || (postSubjectItem = this.data) == null || (downloadBeanM89360G = DownloadUtil.f68079a.m89360G(postSubjectItem)) == null) {
            return;
        }
        DownloadEsHelper downloadEsHelperM88598a = DownloadEsHelper.f67591m.m88598a();
        String resourceId = downloadBeanM89360G.getResourceId();
        if (resourceId == null) {
            resourceId = "";
        }
        DownloadBean downloadBeanM88589q = downloadEsHelperM88598a.m88589q(resourceId);
        if (downloadBeanM88589q == null || downloadBeanM88589q.getStatus() != 5) {
            AbstractC14567m.m65696c(R$string.shorts_click_download);
            C16768a.f56378a.m73074i(this.data, VideoFragment.PAGE_NAME, this.pageFrom);
            getDownloadManager().mo88683o(downloadBeanM89360G);
            m74644j0();
        }
    }

    /* JADX INFO: renamed from: T */
    private final void m74625T(View view) {
        Fragment fragment;
        FragmentManager childFragmentManager;
        ShareDialogFragment shareDialogFragment;
        Integer subjectRate;
        User user;
        User user2;
        if (C14557c.f51100a.m65671a(view.getId(), 500L)) {
            return;
        }
        C16768a.f56378a.m73067A(this.data, VideoFragment.PAGE_NAME, this.pageFrom);
        if (this.mShareDialog == null) {
            InterfaceC23704a loginApi = getLoginApi();
            UserInfo userInfoMo90386h = loginApi != null ? loginApi.mo90386h() : null;
            PostSubjectItem postSubjectItem = this.data;
            boolean zEquals = TextUtils.equals((postSubjectItem == null || (user2 = postSubjectItem.getUser()) == null) ? null : user2.getUserId(), userInfoMo90386h != null ? userInfoMo90386h.getUserId() : null);
            ShareDialogFragment.Companion companion = ShareDialogFragment.INSTANCE;
            PostType postType = PostType.POST_TYPE;
            PostSubjectItem postSubjectItem2 = this.data;
            String postId = postSubjectItem2 != null ? postSubjectItem2.getPostId() : null;
            PostSubjectItem postSubjectItem3 = this.data;
            String userId = (postSubjectItem3 == null || (user = postSubjectItem3.getUser()) == null) ? null : user.getUserId();
            String value = ReportType.POST.getValue();
            PostSubjectItem postSubjectItem4 = this.data;
            String title = postSubjectItem4 != null ? postSubjectItem4.getTitle() : null;
            PostSubjectItem postSubjectItem5 = this.data;
            String string = (postSubjectItem5 == null || (subjectRate = postSubjectItem5.getSubjectRate()) == null) ? null : subjectRate.toString();
            PostSubjectItem postSubjectItem6 = this.data;
            ShareDialogFragment shareDialogFragmentM78645a = companion.m78645a(postType, postId, userId, value, title, string, false, zEquals, false, "postdetail", postSubjectItem6 != null ? postSubjectItem6.getOps() : null, view.getContext().getString(R$string.save_video));
            this.mShareDialog = shareDialogFragmentM78645a;
            if (shareDialogFragmentM78645a != null) {
                shareDialogFragmentM78645a.m78642G0(new C17313e(view, this));
            }
        }
        try {
            Fragment fragment2 = this.fragment;
            if (fragment2 == null || !fragment2.isAdded() || (fragment = this.fragment) == null || (childFragmentManager = fragment.getChildFragmentManager()) == null) {
                return;
            }
            childFragmentManager.m14537g0();
            ShareDialogFragment shareDialogFragment2 = this.mShareDialog;
            if ((shareDialogFragment2 == null || !shareDialogFragment2.isAdded()) && childFragmentManager.m14547k0("share") == null && (shareDialogFragment = this.mShareDialog) != null) {
                shareDialogFragment.show(childFragmentManager, "share");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public final void m74626U() {
        ClipLoading clLoading = this.viewBinding.f86676e;
        Intrinsics.m97801g(clLoading, "clLoading");
        if (clLoading.getVisibility() == 0) {
            return;
        }
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g == null || !interfaceC16634g.isPlaying()) {
            C16781b c16781b = this.dotLayer;
            if (c16781b != null) {
                c16781b.m73123c();
            }
            InterfaceC16634g interfaceC16634g2 = this.orPlayer;
            if (interfaceC16634g2 != null) {
                interfaceC16634g2.play();
            }
            this.isClickPause = false;
            return;
        }
        C16781b c16781b2 = this.dotLayer;
        if (c16781b2 != null) {
            c16781b2.m73122b();
        }
        InterfaceC16634g interfaceC16634g3 = this.orPlayer;
        if (interfaceC16634g3 != null) {
            interfaceC16634g3.pause();
        }
        this.isClickPause = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final void m74627V(ImmVideoItemView immVideoItemView) {
        InterfaceC16634g interfaceC16634g;
        Fragment fragment = immVideoItemView.fragment;
        if (fragment == null || !fragment.isVisible() || (interfaceC16634g = immVideoItemView.orPlayer) == null) {
            return;
        }
        interfaceC16634g.play();
    }

    /* JADX INFO: renamed from: W */
    private final void m74628W(PostSubjectItem item) {
        String userId;
        String groupId;
        String subjectId;
        String string;
        String value;
        Integer subjectType;
        String postId = item.getPostId();
        if (postId == null) {
            postId = "";
        }
        Pair pairM97108a = TuplesKt.m97108a("post_id", postId);
        Pair pairM97108a2 = TuplesKt.m97108a(WebConstants.PAGE_FROM, this.pageFrom);
        Pair pairM97108a3 = TuplesKt.m97108a("module_name", "hot_comment");
        Pair pairM97108a4 = TuplesKt.m97108a("is_cache_post", String.valueOf(item.isRoomCache()));
        User user = item.getUser();
        if (user == null || (userId = user.getUserId()) == null) {
            userId = "";
        }
        Pair pairM97108a5 = TuplesKt.m97108a("user_id", userId);
        Group group = item.getGroup();
        if (group == null || (groupId = group.getGroupId()) == null) {
            groupId = "";
        }
        Pair pairM97108a6 = TuplesKt.m97108a("group_id", groupId);
        Subject subject = item.getSubject();
        if (subject == null || (subjectId = subject.getSubjectId()) == null) {
            subjectId = "";
        }
        Pair pairM97108a7 = TuplesKt.m97108a("subject_id", subjectId);
        Subject subject2 = item.getSubject();
        if (subject2 == null || (subjectType = subject2.getSubjectType()) == null || (string = subjectType.toString()) == null) {
            string = "";
        }
        Pair pairM97108a8 = TuplesKt.m97108a("subject_type", string);
        Pair pairM97108a9 = TuplesKt.m97108a("builtin", item.getBuiltIn() ? "1" : "0");
        Media media = item.getMedia();
        if (media == null || (value = media.getMediaType()) == null) {
            value = MediaType.TEXT.getValue();
        }
        Pair pairM97108a10 = TuplesKt.m97108a("post_media_type", value);
        String ops = item.getOps();
        C24662i.f75350a.m96872D(VideoFragment.PAGE_NAME, MapsKt.m97578m(pairM97108a, pairM97108a2, pairM97108a3, pairM97108a4, pairM97108a5, pairM97108a6, pairM97108a7, pairM97108a8, pairM97108a9, pairM97108a10, TuplesKt.m97108a("ops", ops != null ? ops : "")));
    }

    /* JADX INFO: renamed from: X */
    private final void m74629X(String moduleName, PostSubjectItem item) {
        String commentId;
        String value;
        String groupId;
        HashMap map = new HashMap();
        map.put("module_name", moduleName);
        CommentBean hotComment = item.getHotComment();
        String str = "";
        if (hotComment == null || (commentId = hotComment.getCommentId()) == null) {
            commentId = "";
        }
        map.put("comment_id", commentId);
        String postId = item.getPostId();
        if (postId == null) {
            postId = "";
        }
        map.put("post_id", postId);
        String ops = item.getOps();
        if (ops == null) {
            ops = "";
        }
        map.put("ops", ops);
        Group group = item.getGroup();
        if (group != null && (groupId = group.getGroupId()) != null) {
            str = groupId;
        }
        map.put("group_id", str);
        Media media = item.getMedia();
        if (media == null || (value = media.getMediaType()) == null) {
            value = MediaType.TEXT.getValue();
        }
        map.put("post_media_type", value);
        String str2 = this.pageFrom;
        if (str2 != null && str2.length() != 0) {
            String str3 = this.pageFrom;
            Intrinsics.m97799e(str3);
            map.put(WebConstants.PAGE_FROM, str3);
        }
        C14450a.f50860a.m65146i(VideoFragment.PAGE_NAME, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public final void m74630Y(DownloadBean download) {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new ImmVideoItemView$saveBuiltInVideo$1(download, null), 3, null);
    }

    /* JADX INFO: renamed from: Z */
    private static final PostDetailViewModel m74631Z(Lazy lazy) {
        return (PostDetailViewModel) lazy.getValue();
    }

    /* JADX INFO: renamed from: a0 */
    private static final ShortTvPlayListViewModel m74632a0(Lazy lazy) {
        return (ShortTvPlayListViewModel) lazy.getValue();
    }

    /* JADX INFO: renamed from: b0 */
    private static final CommentViewModel m74633b0(Lazy lazy) {
        return (CommentViewModel) lazy.getValue();
    }

    /* JADX INFO: renamed from: c0 */
    private final void m74634c0(View view) {
        ObjectAnimator objectAnimator = this.rotateAnimator;
        if (objectAnimator != null) {
            Intrinsics.m97799e(objectAnimator);
            if (objectAnimator.isRunning()) {
                return;
            }
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "rotation", 0.0f, 360.0f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.start();
        this.rotateAnimator = objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: d0 */
    private final void m74635d0(View view) {
        ObjectAnimator objectAnimator = this.rotateAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.rotateAnimator = null;
        view.setRotation(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public final void m74636e0(long comment) {
        this.viewBinding.f86695x.setText(AbstractC14564j.m65680a(comment));
    }

    /* JADX INFO: renamed from: f0 */
    private final void m74637f0(final PostSubjectItem item) {
        String url;
        Subject subject;
        PostSubjectItem postSubjectItem = this.data;
        if (postSubjectItem != null && (subject = postSubjectItem.getSubject()) != null) {
            Integer subjectType = subject.getSubjectType();
            int value = SubjectType.SHORT_TV.getValue();
            if (subjectType != null && subjectType.intValue() == value) {
                BLConstraintLayout clHotComment = this.viewBinding.f86675d;
                Intrinsics.m97801g(clHotComment, "clHotComment");
                AbstractC26006c.m102054g(clHotComment);
                return;
            }
        }
        final CommentBean hotComment = item.getHotComment();
        String content = hotComment != null ? hotComment.getContent() : null;
        if (content == null || content.length() == 0) {
            BLConstraintLayout clHotComment2 = this.viewBinding.f86675d;
            Intrinsics.m97801g(clHotComment2, "clHotComment");
            AbstractC26006c.m102054g(clHotComment2);
            NestedScrollableHost nsPostDes = this.viewBinding.f86691t;
            Intrinsics.m97801g(nsPostDes, "nsPostDes");
            AbstractC26006c.m102058k(nsPostDes);
            return;
        }
        m74628W(item);
        BLConstraintLayout clHotComment3 = this.viewBinding.f86675d;
        Intrinsics.m97801g(clHotComment3, "clHotComment");
        AbstractC26006c.m102058k(clHotComment3);
        NestedScrollableHost nsPostDes2 = this.viewBinding.f86691t;
        Intrinsics.m97801g(nsPostDes2, "nsPostDes");
        AbstractC26006c.m102054g(nsPostDes2);
        this.viewBinding.f86697z.setText(content);
        String avatarUrl = hotComment.getAvatarUrl();
        String str = "";
        if (avatarUrl == null) {
            avatarUrl = "";
        }
        if (avatarUrl.length() > 0) {
            C23860f.a aVar = C23860f.f72909a;
            Context context = getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94464c = aVar.m94457m(context).m94468g(avatarUrl).m94474m(AbstractC23384a.m92908b(20)).m94464c(AbstractC23384a.m92908b(20));
            ShapeableImageView ivHotCommentAvatar = this.viewBinding.f86682k;
            Intrinsics.m97801g(ivHotCommentAvatar, "ivHotCommentAvatar");
            bVarM94464c.m94465d(ivHotCommentAvatar);
        }
        this.viewBinding.f86663B.setText(hotComment.getLikeCnt() == 0 ? "" : AbstractC14564j.m65680a(hotComment.getLikeCnt()));
        this.viewBinding.f86684m.setEnabled(Intrinsics.m97797c(hotComment.getLikeStatu(), Boolean.TRUE));
        List<Cover> imageList = hotComment.getImageList();
        if (imageList == null || imageList.isEmpty()) {
            ShapeableImageView commentCover = this.viewBinding.f86677f;
            Intrinsics.m97801g(commentCover, "commentCover");
            AbstractC26006c.m102054g(commentCover);
        } else {
            ShapeableImageView shapeableImageView = this.viewBinding.f86677f;
            shapeableImageView.setVisibility(0);
            C23860f.a aVar2 = C23860f.f72909a;
            Context context2 = shapeableImageView.getContext();
            Intrinsics.m97801g(context2, "getContext(...)");
            C23860f.b bVarM94457m = aVar2.m94457m(context2);
            List<Cover> imageList2 = hotComment.getImageList();
            Intrinsics.m97799e(imageList2);
            Cover cover = imageList2.get(0);
            if (cover != null && (url = cover.getUrl()) != null) {
                str = url;
            }
            C23860f.b bVarM94468g = bVarM94457m.m94468g(str);
            Intrinsics.m97799e(shapeableImageView);
            bVarM94468g.m94465d(shapeableImageView);
            Intrinsics.m97799e(shapeableImageView);
        }
        this.viewBinding.f86670I.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImmVideoItemView.m74638g0(this.f57748a, hotComment, item, view);
            }
        });
        Context context3 = getContext();
        Intrinsics.m97800f(context3, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        Function1 function1 = new Function1() { // from class: com.transsion.postdetail.ui.view.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImmVideoItemView.m74640h0(hotComment, this, (C25891b) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C25891b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent((AppCompatActivity) context3, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final void m74638g0(ImmVideoItemView immVideoItemView, CommentBean commentBean, PostSubjectItem postSubjectItem, View view) {
        immVideoItemView.m74606A(commentBean, postSubjectItem);
    }

    private final InterfaceC21842g getDownloadManager() {
        return (InterfaceC21842g) this.downloadManager.getValue();
    }

    private final InterfaceC23704a getLoginApi() {
        return (InterfaceC23704a) this.loginApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final Unit m74640h0(CommentBean commentBean, ImmVideoItemView immVideoItemView, C25891b value) {
        Intrinsics.m97802h(value, "value");
        if (Intrinsics.m97797c(value.m101689a(), commentBean.getCommentId())) {
            commentBean.setLikeStatu(Boolean.valueOf(value.m101691c()));
            commentBean.setLikeCnt(value.m101690b());
            immVideoItemView.viewBinding.f86663B.setText(value.m101690b() == 0 ? "" : AbstractC14564j.m65680a(value.m101690b()));
            immVideoItemView.viewBinding.f86684m.setEnabled(value.m101691c());
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: i0 */
    private final void m74642i0(PostSubjectItem item) {
        Long likeCount;
        AppCompatTextView appCompatTextView = this.viewBinding.f86664C;
        Boolean hasLike = item.getHasLike();
        appCompatTextView.setSelected(hasLike != null ? hasLike.booleanValue() : false);
        Stat stat = item.getStat();
        String strM65680a = AbstractC14564j.m65680a((stat == null || (likeCount = stat.getLikeCount()) == null) ? 0L : likeCount.longValue());
        if (Intrinsics.m97797c(strM65680a, "0")) {
            strM65680a = "";
        }
        appCompatTextView.setText(strM65680a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public final void m74644j0() {
        final String postId;
        AppCompatImageView appCompatImageView;
        PostSubjectItem postSubjectItem = this.data;
        if (postSubjectItem == null || (postId = postSubjectItem.getPostId()) == null || (appCompatImageView = this.viewBinding.f86686o) == null) {
            return;
        }
        DownloadBean downloadBeanM88589q = DownloadEsHelper.f67591m.m88598a().m88589q(postId);
        if (downloadBeanM88589q == null) {
            m74635d0(appCompatImageView);
            appCompatImageView.setImageResource(R$mipmap.post_detail_ic_video_download_new);
            appCompatImageView.setEnabled(true);
            appCompatImageView.setOnClickListener(this);
            return;
        }
        int status = downloadBeanM88589q.getStatus();
        if (status == 1 || status == 2 || status == 3) {
            appCompatImageView.setImageResource(R$drawable.post_detail_ic_video_downloading);
            appCompatImageView.setEnabled(false);
            m74634c0(appCompatImageView);
        } else {
            if (status != 5) {
                m74635d0(appCompatImageView);
                appCompatImageView.setImageResource(R$mipmap.post_detail_ic_video_download_new);
                appCompatImageView.setEnabled(true);
                appCompatImageView.setOnClickListener(this);
                return;
            }
            m74635d0(appCompatImageView);
            appCompatImageView.setImageResource(R$drawable.post_detail_ic_video_downloaded);
            appCompatImageView.setEnabled(true);
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ImmVideoItemView.m74646k0(this.f57758a, postId, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final void m74646k0(ImmVideoItemView immVideoItemView, String str, View view) {
        C16768a.f56378a.m73075k(immVideoItemView.data, VideoFragment.PAGE_NAME, immVideoItemView.pageFrom);
        Navigator.m61845x(TheRouter.m61773c("/download/panel_activity").m61852F("extra_page_index", 0).m61857K("extra_target_resource_id", str), immVideoItemView.getContext(), null, 2, null);
    }

    /* JADX INFO: renamed from: l0 */
    private final void m74648l0(long share) {
        this.viewBinding.f86666E.setText(AbstractC14564j.m65680a(share));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v47, types: [T, com.transsion.moviedetailapi.bean.ShortTVFavInfo] */
    /* JADX INFO: renamed from: m0 */
    private final void m74650m0() {
        Subject subject;
        Subject subject2;
        Cover cover;
        String url;
        String thumbnail;
        Subject subject3;
        Cover cover2;
        Subject subject4;
        Subject subject5;
        Subject subject6;
        Subject subject7;
        ShortTVItem shortTVFirstEp;
        Subject subject8;
        PostSubjectItem postSubjectItem = this.data;
        if (postSubjectItem != null && (subject = postSubjectItem.getSubject()) != null) {
            Integer subjectType = subject.getSubjectType();
            int value = SubjectType.SHORT_TV.getValue();
            if (subjectType != null && subjectType.intValue() == value) {
                BLLinearLayout root = this.viewBinding.f86689r.getRoot();
                Intrinsics.m97801g(root, "getRoot(...)");
                AbstractC26006c.m102054g(root);
                ShapeableImageView ivVideoAvatar = this.viewBinding.f86688q;
                Intrinsics.m97801g(ivVideoAvatar, "ivVideoAvatar");
                AbstractC26006c.m102054g(ivVideoAvatar);
                AppCompatImageView ivDownload = this.viewBinding.f86681j;
                Intrinsics.m97801g(ivDownload, "ivDownload");
                AbstractC26006c.m102058k(ivDownload);
                AppCompatTextView tvTitle = this.viewBinding.f86668G;
                Intrinsics.m97801g(tvTitle, "tvTitle");
                AbstractC26006c.m102058k(tvTitle);
                BLTextView tvShortTvEp = this.viewBinding.f86667F;
                Intrinsics.m97801g(tvShortTvEp, "tvShortTvEp");
                AbstractC26006c.m102058k(tvShortTvEp);
                ShapeableImageView ivShortCover = this.viewBinding.f86687p;
                Intrinsics.m97801g(ivShortCover, "ivShortCover");
                AbstractC26006c.m102058k(ivShortCover);
                AppCompatTextView appCompatTextView = this.viewBinding.f86668G;
                PostSubjectItem postSubjectItem2 = this.data;
                T shortTVFavInfo = 0;
                shortTVFavInfo = 0;
                appCompatTextView.setText((postSubjectItem2 == null || (subject8 = postSubjectItem2.getSubject()) == null) ? null : subject8.getTitle());
                C17449s c17449s = C17449s.f57841a;
                PostSubjectItem postSubjectItem3 = this.data;
                c17449s.m74973a(Integer.valueOf((postSubjectItem3 == null || (subject7 = postSubjectItem3.getSubject()) == null || (shortTVFirstEp = subject7.getShortTVFirstEp()) == null) ? 1 : shortTVFirstEp.getEp()));
                PostSubjectItem postSubjectItem4 = this.data;
                this.viewBinding.f86667F.setText(getContext().getString(R$string.short_tv_play_all, c17449s.m74973a(Integer.valueOf((postSubjectItem4 == null || (subject6 = postSubjectItem4.getSubject()) == null) ? 0 : subject6.getTotalEpisode()))));
                C14587a.m65779a(this.viewBinding.f86667F).m65784e(0, this.viewBinding.f86667F.getText().toString().length()).m65786g(true).m65788i(100).m65785f(0.05f).m65787h(10000).m65783a();
                ShapeableImageView shapeableImageView = this.viewBinding.f86687p;
                PostSubjectItem postSubjectItem5 = this.data;
                if (postSubjectItem5 == null || !postSubjectItem5.getBuiltIn()) {
                    PostSubjectItem postSubjectItem6 = this.data;
                    if (postSubjectItem6 != null && (subject2 = postSubjectItem6.getSubject()) != null && (cover = subject2.getCover()) != null && (url = cover.getUrl()) != null) {
                        C23860f.a aVar = C23860f.f72909a;
                        Context context = getContext();
                        Intrinsics.m97801g(context, "getContext(...)");
                        C23860f.b bVarM94464c = aVar.m94457m(context).m94468g(url).m94474m(AbstractC5790i.m27411e(21.0f)).m94464c(AbstractC5790i.m27411e(30.0f));
                        PostSubjectItem postSubjectItem7 = this.data;
                        if (postSubjectItem7 == null || (subject3 = postSubjectItem7.getSubject()) == null || (cover2 = subject3.getCover()) == null || (thumbnail = cover2.getThumbnail()) == null) {
                            thumbnail = "";
                        }
                        C23860f.b bVarM94469h = bVarM94464c.m94473l(thumbnail).m94469h(true);
                        ShapeableImageView ivShortCover2 = this.viewBinding.f86687p;
                        Intrinsics.m97801g(ivShortCover2, "ivShortCover");
                        bVarM94469h.m94465d(ivShortCover2);
                    }
                } else {
                    AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new ImmVideoItemView$updateShortTVInfo$1(this, null), 3, null);
                }
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                PostSubjectItem postSubjectItem8 = this.data;
                if (postSubjectItem8 != null && (subject5 = postSubjectItem8.getSubject()) != null) {
                    shortTVFavInfo = subject5.getShortTVFavInfo();
                }
                objectRef.element = shortTVFavInfo;
                if (shortTVFavInfo == 0) {
                    ?? shortTVFavInfo2 = new ShortTVFavInfo(null, false, null, 7, null);
                    shortTVFavInfo2.setFavoriteNum("0");
                    objectRef.element = shortTVFavInfo2;
                    PostSubjectItem postSubjectItem9 = this.data;
                    if (postSubjectItem9 != null && (subject4 = postSubjectItem9.getSubject()) != null) {
                        subject4.setShortTVFavInfo((ShortTVFavInfo) objectRef.element);
                    }
                }
                AppCompatTextView tvFavorite = this.viewBinding.f86696y;
                Intrinsics.m97801g(tvFavorite, "tvFavorite");
                AbstractC26006c.m102058k(tvFavorite);
                this.viewBinding.f86696y.setSelected(((ShortTVFavInfo) objectRef.element).getHasFavorite());
                AppCompatTextView appCompatTextView2 = this.viewBinding.f86696y;
                String favoriteNum = ((ShortTVFavInfo) objectRef.element).getFavoriteNum();
                appCompatTextView2.setText(AbstractC14564j.m65680a(Long.parseLong(favoriteNum != null ? favoriteNum : "0")));
                this.viewBinding.f86696y.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.o
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ImmVideoItemView.m74652n0(this.f57762a, objectRef, view);
                    }
                });
                return;
            }
        }
        AppCompatTextView tvTitle2 = this.viewBinding.f86668G;
        Intrinsics.m97801g(tvTitle2, "tvTitle");
        AbstractC26006c.m102054g(tvTitle2);
        BLTextView tvShortTvEp2 = this.viewBinding.f86667F;
        Intrinsics.m97801g(tvShortTvEp2, "tvShortTvEp");
        AbstractC26006c.m102054g(tvShortTvEp2);
        ShapeableImageView ivShortCover3 = this.viewBinding.f86687p;
        Intrinsics.m97801g(ivShortCover3, "ivShortCover");
        AbstractC26006c.m102054g(ivShortCover3);
        AppCompatImageView ivDownload2 = this.viewBinding.f86681j;
        Intrinsics.m97801g(ivDownload2, "ivDownload");
        AbstractC26006c.m102054g(ivDownload2);
        ShapeableImageView ivVideoAvatar2 = this.viewBinding.f86688q;
        Intrinsics.m97801g(ivVideoAvatar2, "ivVideoAvatar");
        AbstractC26006c.m102058k(ivVideoAvatar2);
        AppCompatTextView tvFavorite2 = this.viewBinding.f86696y;
        Intrinsics.m97801g(tvFavorite2, "tvFavorite");
        AbstractC26006c.m102054g(tvFavorite2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public static final void m74652n0(ImmVideoItemView immVideoItemView, Ref.ObjectRef objectRef, View view) {
        Subject subject;
        Subject subject2;
        C16904k c16904k = C16904k.f56790a;
        PostSubjectItem postSubjectItem = immVideoItemView.data;
        String subjectId = (postSubjectItem == null || (subject2 = postSubjectItem.getSubject()) == null) ? null : subject2.getSubjectId();
        PostSubjectItem postSubjectItem2 = immVideoItemView.data;
        c16904k.m73730c(subjectId, (postSubjectItem2 == null || (subject = postSubjectItem2.getSubject()) == null) ? null : subject.getOps(), "", ((ShortTVFavInfo) objectRef.element).getHasFavorite(), VideoFragment.PAGE_NAME, immVideoItemView.pageFrom);
        ShortTvPlayListViewModel shortTvPlayListViewModel = immVideoItemView.shortTvPlayListViewModel;
        if (shortTvPlayListViewModel != null) {
            PostSubjectItem postSubjectItem3 = immVideoItemView.data;
            shortTvPlayListViewModel.m73589d(postSubjectItem3 != null ? postSubjectItem3.getSubject() : null);
        }
    }

    /* JADX INFO: renamed from: o0 */
    private final void m74654o0(PostSubjectItem item) {
        setBottomSubjectAndRoomVisibility(item.getSubject() != null, item.getGroup() != null);
        if (item.getSubject() != null) {
            setBottomSubjectModuleData(item);
        }
        if (item.getGroup() != null) {
            Group group = item.getGroup();
            String name = group != null ? group.getName() : null;
            if (name == null || name.length() == 0) {
                return;
            }
            setBottomRoomModuleData(item);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0176  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ed  */
    /* JADX INFO: renamed from: p0 */
    private final void m74656p0(final PostSubjectItem item) {
        String avatar;
        FirstFrame firstFrame;
        String url;
        String string;
        Subject subject;
        Subject subject2;
        FirstFrame firstFrame2;
        String description = null;
        if (item.getBuiltIn()) {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new ImmVideoItemView$updateVideoInfo$1(item, this, null), 3, null);
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new ImmVideoItemView$updateVideoInfo$2(item, this, null), 3, null);
            C26866a.a aVar = C26866a.f81698a;
            String str = this.TAG;
            Media media = item.getMedia();
            String url2 = (media == null || (firstFrame2 = media.getFirstFrame()) == null) ? null : firstFrame2.getUrl();
            User user = item.getUser();
            C26866a.a.m104898f(aVar, str, "set info - firstFrame = " + url2 + ", avatar = " + (user != null ? user.getAvatar() : null), false, 4, null);
        } else {
            Media media2 = item.getMedia();
            if (media2 != null && (firstFrame = media2.getFirstFrame()) != null && (url = firstFrame.getUrl()) != null) {
                Glide.with(getContext()).load2(C23860f.a.m94447e(C23860f.f72909a, url, C26035b.f79529e.m102098a(), false, false, 12, null)).into(this.viewBinding.f86680i);
            }
            C23860f.a aVar2 = C23860f.f72909a;
            Context context = getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94457m = aVar2.m94457m(context);
            User user2 = item.getUser();
            if (user2 == null || (avatar = user2.getAvatar()) == null) {
                avatar = "";
            }
            C23860f.b bVarM94464c = bVarM94457m.m94468g(avatar).m94474m(this.viewBinding.f86688q.getWidth()).m94464c(this.viewBinding.f86688q.getHeight());
            ShapeableImageView ivVideoAvatar = this.viewBinding.f86688q;
            Intrinsics.m97801g(ivVideoAvatar, "ivVideoAvatar");
            bVarM94464c.m94465d(ivVideoAvatar);
        }
        PostSubjectItem postSubjectItem = this.data;
        if (postSubjectItem != null && (subject2 = postSubjectItem.getSubject()) != null) {
            Integer subjectType = subject2.getSubjectType();
            int value = SubjectType.SHORT_TV.getValue();
            if (subjectType != null && subjectType.intValue() == value) {
                this.viewBinding.f86668G.setTextSize(18.0f);
                NestedScrollableHost nsPostDes = this.viewBinding.f86691t;
                Intrinsics.m97801g(nsPostDes, "nsPostDes");
                AbstractC26006c.m102054g(nsPostDes);
                AppCompatImageView ivSave = this.viewBinding.f86686o;
                Intrinsics.m97801g(ivSave, "ivSave");
                AbstractC26006c.m102054g(ivSave);
                return;
            }
        }
        NestedScrollableHost nsPostDes2 = this.viewBinding.f86691t;
        Intrinsics.m97801g(nsPostDes2, "nsPostDes");
        AbstractC26006c.m102058k(nsPostDes2);
        AppCompatImageView ivSave2 = this.viewBinding.f86686o;
        Intrinsics.m97801g(ivSave2, "ivSave");
        AbstractC26006c.m102058k(ivSave2);
        m74644j0();
        this.viewBinding.f86668G.setTextSize(16.0f);
        final ExpandView expandView = this.viewBinding.f86678g;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        expandView.setExpandListener(new C17315g(booleanRef));
        if (TextUtils.isEmpty(item.getTitle())) {
            String content = item.getContent();
            if (content != null) {
                string = StringsKt.m98155n1(content).toString();
            } else {
                string = null;
            }
        } else if (TextUtils.isEmpty(item.getContent())) {
            String title = item.getTitle();
            if (title != null) {
                string = StringsKt.m98155n1(title).toString();
            } else {
                string = null;
            }
        } else {
            String title2 = item.getTitle();
            String string2 = title2 != null ? StringsKt.m98155n1(title2).toString() : null;
            String content2 = item.getContent();
            string = string2 + "\n" + (content2 != null ? StringsKt.m98155n1(content2).toString() : null);
        }
        PostSubjectItem postSubjectItem2 = this.data;
        if (postSubjectItem2 == null || (subject = postSubjectItem2.getSubject()) == null) {
            description = string;
        } else {
            Integer subjectType2 = subject.getSubjectType();
            int value2 = SubjectType.SHORT_TV.getValue();
            if (subjectType2 != null && subjectType2.intValue() == value2) {
                Subject subject3 = item.getSubject();
                if (subject3 != null) {
                    description = subject3.getDescription();
                }
            } else {
                description = string;
            }
        }
        if (TextUtils.isEmpty(description)) {
            Intrinsics.m97799e(expandView);
            AbstractC26006c.m102054g(expandView);
        } else {
            Intrinsics.m97799e(expandView);
            AbstractC26006c.m102058k(expandView);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            expandView.m62195m(AbstractC14566l.m65687b(expandView, description, false, new C17316h(objectRef), new Function2() { // from class: com.transsion.postdetail.ui.view.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ImmVideoItemView.m74658q0(expandView, booleanRef, objectRef, item, this, (View) obj, (String) obj2);
                }
            }));
        }
        Intrinsics.m97799e(expandView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX INFO: renamed from: q0 */
    public static final Unit m74658q0(ExpandView expandView, Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, PostSubjectItem postSubjectItem, ImmVideoItemView immVideoItemView, View view, String str) {
        boolean z11;
        boolean z12;
        String resourceLink;
        ResourceDetectors resourceDetector;
        String subjectId;
        List<UrlContent> list;
        int length = expandView.getText().length();
        if (!booleanRef.element || (list = (List) objectRef.element) == null) {
            z11 = false;
        } else {
            z11 = false;
            for (UrlContent urlContent : list) {
                int indexOfUrl = urlContent.getIndexOfUrl();
                int indexOfUrl2 = urlContent.getIndexOfUrl() + urlContent.getUrl().length();
                if (indexOfUrl <= length && indexOfUrl2 >= length && indexOfUrl <= length && length < indexOfUrl2 + 1) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            expandView.performClick();
        } else {
            Subject subject = postSubjectItem.getSubject();
            if (subject != null && (subjectId = subject.getSubjectId()) != null) {
                z12 = subjectId.length() > 0;
            }
            if (z12) {
                DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
                Context context = expandView.getContext();
                Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                Subject subject2 = postSubjectItem.getSubject();
                Intrinsics.m97799e(str);
                PostSubjectItem postSubjectItem2 = immVideoItemView.data;
                String ops = postSubjectItem2 != null ? postSubjectItem2.getOps() : null;
                Subject subject3 = postSubjectItem.getSubject();
                if (subject3 == null || (resourceDetector = subject3.getResourceDetector()) == null || (resourceLink = resourceDetector.getResourceLink()) == null) {
                    resourceLink = "";
                }
                String str2 = resourceLink;
                User user = postSubjectItem.getUser();
                downloadManagerApiM87093a.m87084U(fragmentActivity, subject2, str, "post_video_detail", ops, str2, user != null ? user.getNickname() : null);
            } else {
                Navigator.m61845x(TheRouter.m61773c(WebPageIdentity.WEB_VIEW).m61857K("url", str), expandView.getContext(), null, 2, null);
            }
        }
        return Unit.f75682a;
    }

    private final void setBottomRoomModuleData(PostSubjectItem item) {
        String avatar;
        Cover cover;
        AppCompatTextView appCompatTextView = this.viewBinding.f86689r.f86392g;
        Group group = item.getGroup();
        String url = null;
        appCompatTextView.setText(group != null ? group.getName() : null);
        C23860f.a aVar = C23860f.f72909a;
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        C23860f.b bVarM94457m = aVar.m94457m(context);
        Group group2 = item.getGroup();
        if (group2 == null || (avatar = group2.getAvatar()) == null) {
            Group group3 = item.getGroup();
            if (group3 != null && (cover = group3.getCover()) != null) {
                url = cover.getUrl();
            }
            avatar = url == null ? "" : url;
        }
        C23860f.b bVarM94464c = bVarM94457m.m94468g(avatar).m94474m(AbstractC23384a.m92908b(32)).m94464c(AbstractC23384a.m92908b(32));
        ShapeableImageView ivRoomCover = this.viewBinding.f86689r.f86388c;
        Intrinsics.m97801g(ivRoomCover, "ivRoomCover");
        bVarM94464c.m94465d(ivRoomCover);
    }

    private final void setBottomSubjectAndRoomVisibility(boolean isShowSubject, boolean isShowRoom) {
        if (C5110g.f17601a.m23911b()) {
            BLLinearLayout root = this.viewBinding.f86689r.getRoot();
            Intrinsics.m97801g(root, "getRoot(...)");
            root.setVisibility(isShowRoom ? 0 : 8);
            ConstraintLayout clSubjectContent = this.viewBinding.f86689r.f86387b;
            Intrinsics.m97801g(clSubjectContent, "clSubjectContent");
            AbstractC26006c.m102054g(clSubjectContent);
            View vSubjectRoomLine = this.viewBinding.f86689r.f86398m;
            Intrinsics.m97801g(vSubjectRoomLine, "vSubjectRoomLine");
            AbstractC26006c.m102054g(vSubjectRoomLine);
            LinearLayout llRoomTag = this.viewBinding.f86689r.f86391f;
            Intrinsics.m97801g(llRoomTag, "llRoomTag");
            llRoomTag.setVisibility(isShowRoom ? 0 : 8);
            return;
        }
        if (isShowSubject) {
            BLLinearLayout root2 = this.viewBinding.f86689r.getRoot();
            Intrinsics.m97801g(root2, "getRoot(...)");
            AbstractC26006c.m102058k(root2);
            ConstraintLayout clSubjectContent2 = this.viewBinding.f86689r.f86387b;
            Intrinsics.m97801g(clSubjectContent2, "clSubjectContent");
            AbstractC26006c.m102058k(clSubjectContent2);
            View vSubjectRoomLine2 = this.viewBinding.f86689r.f86398m;
            Intrinsics.m97801g(vSubjectRoomLine2, "vSubjectRoomLine");
            vSubjectRoomLine2.setVisibility(isShowRoom ? 0 : 8);
            LinearLayout llRoomTag2 = this.viewBinding.f86689r.f86391f;
            Intrinsics.m97801g(llRoomTag2, "llRoomTag");
            llRoomTag2.setVisibility(isShowRoom ? 0 : 8);
            return;
        }
        BLLinearLayout root3 = this.viewBinding.f86689r.getRoot();
        Intrinsics.m97801g(root3, "getRoot(...)");
        root3.setVisibility(isShowRoom ? 0 : 8);
        ConstraintLayout clSubjectContent3 = this.viewBinding.f86689r.f86387b;
        Intrinsics.m97801g(clSubjectContent3, "clSubjectContent");
        AbstractC26006c.m102054g(clSubjectContent3);
        View vSubjectRoomLine3 = this.viewBinding.f86689r.f86398m;
        Intrinsics.m97801g(vSubjectRoomLine3, "vSubjectRoomLine");
        AbstractC26006c.m102054g(vSubjectRoomLine3);
        LinearLayout llRoomTag3 = this.viewBinding.f86689r.f86391f;
        Intrinsics.m97801g(llRoomTag3, "llRoomTag");
        llRoomTag3.setVisibility(isShowRoom ? 0 : 8);
    }

    private final void setBottomSubjectModuleData(PostSubjectItem item) {
        String url;
        String thumbnail;
        String title;
        Subject subject;
        String genre;
        List listS0;
        String str;
        Cover cover;
        Cover cover2;
        C23860f.a aVar = C23860f.f72909a;
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        C23860f.b bVarM94457m = aVar.m94457m(context);
        Subject subject2 = item.getSubject();
        String str2 = "";
        if (subject2 == null || (cover2 = subject2.getCover()) == null || (url = cover2.getUrl()) == null) {
            url = "";
        }
        C23860f.b bVarM94464c = bVarM94457m.m94468g(url).m94474m(AbstractC23384a.m92908b(32)).m94464c(AbstractC23384a.m92908b(32));
        Subject subject3 = item.getSubject();
        if (subject3 == null || (cover = subject3.getCover()) == null || (thumbnail = cover.getThumbnail()) == null) {
            thumbnail = "";
        }
        C23860f.b bVarM94473l = bVarM94464c.m94473l(thumbnail);
        ShapeableImageView ivSubjectCover = this.viewBinding.f86689r.f86389d;
        Intrinsics.m97801g(ivSubjectCover, "ivSubjectCover");
        bVarM94473l.m94465d(ivSubjectCover);
        AppCompatTextView appCompatTextView = this.viewBinding.f86689r.f86395j;
        Subject subject4 = item.getSubject();
        if (subject4 == null || (title = subject4.getTitle()) == null) {
            title = "";
        }
        appCompatTextView.setText(title);
        Subject subject5 = item.getSubject();
        this.viewBinding.f86689r.f86390e.setImageResource(AbstractC16247h.m71009a(subject5 != null ? subject5.getSubjectType() : null));
        Subject subject6 = item.getSubject();
        Date dateM27346l = AbstractC5780c0.m27346l(subject6 != null ? subject6.getReleaseDate() : null, "yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateM27346l);
        this.viewBinding.f86689r.f86393h.setText(String.valueOf(calendar.get(1)));
        Subject subject7 = item.getSubject();
        String genre2 = subject7 != null ? subject7.getGenre() : null;
        if (genre2 != null && genre2.length() != 0 && (subject = item.getSubject()) != null && (genre = subject.getGenre()) != null && (listS0 = StringsKt.m98117S0(genre, new String[]{", "}, false, 0, 6, null)) != null && (str = (String) CollectionsKt.m97361k0(listS0)) != null) {
            str2 = str;
        }
        AppCompatTextView tvSubjectGenre = this.viewBinding.f86689r.f86394i;
        Intrinsics.m97801g(tvSubjectGenre, "tvSubjectGenre");
        tvSubjectGenre.setVisibility(str2.length() > 0 ? 0 : 8);
        AppCompatTextView tvSubjectGenre2 = this.viewBinding.f86689r.f86394i;
        Intrinsics.m97801g(tvSubjectGenre2, "tvSubjectGenre");
        tvSubjectGenre2.setVisibility(str2.length() > 0 ? 0 : 8);
        this.viewBinding.f86689r.f86394i.setText(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:21:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:22:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:40:0x0166  */
    public final void setContentVisibility(boolean visible) {
        Subject subject;
        String str;
        String str2;
        Subject subject2;
        if (!visible) {
            BLConstraintLayout clHotComment = this.viewBinding.f86675d;
            Intrinsics.m97801g(clHotComment, "clHotComment");
            if (clHotComment.getVisibility() == 0) {
                this.isShowHotComment = true;
                BLConstraintLayout clHotComment2 = this.viewBinding.f86675d;
                Intrinsics.m97801g(clHotComment2, "clHotComment");
                AbstractC26006c.m102055h(clHotComment2);
            }
            AppCompatTextView tvFavorite = this.viewBinding.f86696y;
            Intrinsics.m97801g(tvFavorite, "tvFavorite");
            if (tvFavorite.getVisibility() == 0) {
                this.isFavoriteShow = true;
                AppCompatTextView tvFavorite2 = this.viewBinding.f86696y;
                Intrinsics.m97801g(tvFavorite2, "tvFavorite");
                AbstractC26006c.m102055h(tvFavorite2);
            }
            PostSubjectItem postSubjectItem = this.data;
            if (postSubjectItem == null || (subject = postSubjectItem.getSubject()) == null) {
                ShapeableImageView ivVideoAvatar = this.viewBinding.f86688q;
                Intrinsics.m97801g(ivVideoAvatar, "ivVideoAvatar");
                AbstractC26006c.m102055h(ivVideoAvatar);
                BLLinearLayout root = this.viewBinding.f86689r.getRoot();
                Intrinsics.m97801g(root, "getRoot(...)");
                AbstractC26006c.m102055h(root);
                NestedScrollableHost nsPostDes = this.viewBinding.f86691t;
                Intrinsics.m97801g(nsPostDes, "nsPostDes");
                AbstractC26006c.m102055h(nsPostDes);
                AppCompatImageView ivSave = this.viewBinding.f86686o;
                Intrinsics.m97801g(ivSave, "ivSave");
                AbstractC26006c.m102055h(ivSave);
            } else {
                Integer subjectType = subject.getSubjectType();
                int value = SubjectType.SHORT_TV.getValue();
                if (subjectType != null && subjectType.intValue() == value) {
                    BLTextView tvShortTvEp = this.viewBinding.f86667F;
                    Intrinsics.m97801g(tvShortTvEp, "tvShortTvEp");
                    AbstractC26006c.m102055h(tvShortTvEp);
                    AppCompatTextView tvTitle = this.viewBinding.f86668G;
                    Intrinsics.m97801g(tvTitle, "tvTitle");
                    AbstractC26006c.m102055h(tvTitle);
                    AppCompatImageView ivDownload = this.viewBinding.f86681j;
                    Intrinsics.m97801g(ivDownload, "ivDownload");
                    AbstractC26006c.m102055h(ivDownload);
                    ShapeableImageView ivShortCover = this.viewBinding.f86687p;
                    Intrinsics.m97801g(ivShortCover, "ivShortCover");
                    AbstractC26006c.m102055h(ivShortCover);
                } else {
                    ShapeableImageView ivVideoAvatar2 = this.viewBinding.f86688q;
                    Intrinsics.m97801g(ivVideoAvatar2, "ivVideoAvatar");
                    AbstractC26006c.m102055h(ivVideoAvatar2);
                    BLLinearLayout root2 = this.viewBinding.f86689r.getRoot();
                    Intrinsics.m97801g(root2, "getRoot(...)");
                    AbstractC26006c.m102055h(root2);
                    NestedScrollableHost nsPostDes2 = this.viewBinding.f86691t;
                    Intrinsics.m97801g(nsPostDes2, "nsPostDes");
                    AbstractC26006c.m102055h(nsPostDes2);
                    AppCompatImageView ivSave2 = this.viewBinding.f86686o;
                    Intrinsics.m97801g(ivSave2, "ivSave");
                    AbstractC26006c.m102055h(ivSave2);
                }
            }
            ProgressBar progressBar = this.viewBinding.f86692u;
            Intrinsics.m97801g(progressBar, "progressBar");
            AbstractC26006c.m102055h(progressBar);
            AppCompatTextView tvLike = this.viewBinding.f86664C;
            Intrinsics.m97801g(tvLike, "tvLike");
            AbstractC26006c.m102055h(tvLike);
            AppCompatTextView tvShare = this.viewBinding.f86666E;
            Intrinsics.m97801g(tvShare, "tvShare");
            AbstractC26006c.m102055h(tvShare);
            AppCompatImageView ivSave3 = this.viewBinding.f86686o;
            Intrinsics.m97801g(ivSave3, "ivSave");
            AbstractC26006c.m102055h(ivSave3);
            AppCompatTextView tvComment = this.viewBinding.f86695x;
            Intrinsics.m97801g(tvComment, "tvComment");
            AbstractC26006c.m102055h(tvComment);
            return;
        }
        PostSubjectItem postSubjectItem2 = this.data;
        if (postSubjectItem2 != null && (subject2 = postSubjectItem2.getSubject()) != null) {
            Integer subjectType2 = subject2.getSubjectType();
            str = "tvFavorite";
            int value2 = SubjectType.SHORT_TV.getValue();
            if (subjectType2 != null && subjectType2.intValue() == value2) {
                BLTextView tvShortTvEp2 = this.viewBinding.f86667F;
                Intrinsics.m97801g(tvShortTvEp2, "tvShortTvEp");
                AbstractC26006c.m102058k(tvShortTvEp2);
                AppCompatTextView tvTitle2 = this.viewBinding.f86668G;
                Intrinsics.m97801g(tvTitle2, "tvTitle");
                AbstractC26006c.m102058k(tvTitle2);
                AppCompatImageView ivDownload2 = this.viewBinding.f86681j;
                Intrinsics.m97801g(ivDownload2, "ivDownload");
                AbstractC26006c.m102058k(ivDownload2);
                ShapeableImageView ivShortCover2 = this.viewBinding.f86687p;
                Intrinsics.m97801g(ivShortCover2, "ivShortCover");
                AbstractC26006c.m102058k(ivShortCover2);
            }
            ProgressBar progressBar2 = this.viewBinding.f86692u;
            Intrinsics.m97801g(progressBar2, "progressBar");
            AbstractC26006c.m102058k(progressBar2);
            AppCompatTextView tvLike2 = this.viewBinding.f86664C;
            Intrinsics.m97801g(tvLike2, "tvLike");
            AbstractC26006c.m102058k(tvLike2);
            AppCompatTextView tvShare2 = this.viewBinding.f86666E;
            Intrinsics.m97801g(tvShare2, "tvShare");
            AbstractC26006c.m102058k(tvShare2);
            AppCompatTextView tvComment2 = this.viewBinding.f86695x;
            Intrinsics.m97801g(tvComment2, "tvComment");
            AbstractC26006c.m102058k(tvComment2);
            if (this.isShowHotComment) {
                BLConstraintLayout clHotComment3 = this.viewBinding.f86675d;
                Intrinsics.m97801g(clHotComment3, "clHotComment");
                AbstractC26006c.m102058k(clHotComment3);
            }
            if (this.isFavoriteShow) {
                AppCompatTextView appCompatTextView = this.viewBinding.f86696y;
                str2 = str;
                Intrinsics.m97801g(appCompatTextView, str2);
                AbstractC26006c.m102058k(appCompatTextView);
            } else {
                str2 = str;
            }
            AppCompatTextView appCompatTextView2 = this.viewBinding.f86696y;
            Intrinsics.m97801g(appCompatTextView2, str2);
            AbstractC26006c.m102058k(appCompatTextView2);
        }
        str = "tvFavorite";
        ShapeableImageView ivVideoAvatar3 = this.viewBinding.f86688q;
        Intrinsics.m97801g(ivVideoAvatar3, "ivVideoAvatar");
        AbstractC26006c.m102058k(ivVideoAvatar3);
        BLLinearLayout root3 = this.viewBinding.f86689r.getRoot();
        Intrinsics.m97801g(root3, "getRoot(...)");
        AbstractC26006c.m102058k(root3);
        NestedScrollableHost nsPostDes3 = this.viewBinding.f86691t;
        Intrinsics.m97801g(nsPostDes3, "nsPostDes");
        AbstractC26006c.m102058k(nsPostDes3);
        AppCompatImageView ivSave4 = this.viewBinding.f86686o;
        Intrinsics.m97801g(ivSave4, "ivSave");
        AbstractC26006c.m102058k(ivSave4);
        ProgressBar progressBar3 = this.viewBinding.f86692u;
        Intrinsics.m97801g(progressBar3, "progressBar");
        AbstractC26006c.m102058k(progressBar3);
        AppCompatTextView tvLike3 = this.viewBinding.f86664C;
        Intrinsics.m97801g(tvLike3, "tvLike");
        AbstractC26006c.m102058k(tvLike3);
        AppCompatTextView tvShare3 = this.viewBinding.f86666E;
        Intrinsics.m97801g(tvShare3, "tvShare");
        AbstractC26006c.m102058k(tvShare3);
        AppCompatTextView tvComment3 = this.viewBinding.f86695x;
        Intrinsics.m97801g(tvComment3, "tvComment");
        AbstractC26006c.m102058k(tvComment3);
        if (this.isShowHotComment) {
            BLConstraintLayout clHotComment4 = this.viewBinding.f86675d;
            Intrinsics.m97801g(clHotComment4, "clHotComment");
            AbstractC26006c.m102058k(clHotComment4);
        }
        if (this.isFavoriteShow) {
            AppCompatTextView appCompatTextView3 = this.viewBinding.f86696y;
            str2 = str;
            Intrinsics.m97801g(appCompatTextView3, str2);
            AbstractC26006c.m102058k(appCompatTextView3);
        } else {
            str2 = str;
        }
        AppCompatTextView appCompatTextView4 = this.viewBinding.f86696y;
        Intrinsics.m97801g(appCompatTextView4, str2);
        AbstractC26006c.m102058k(appCompatTextView4);
    }

    private final void setLoading(boolean show) {
        if (show) {
            ClipLoading clLoading = this.viewBinding.f86676e;
            Intrinsics.m97801g(clLoading, "clLoading");
            AbstractC26006c.m102058k(clLoading);
            ProgressBar progressBar = this.viewBinding.f86692u;
            Intrinsics.m97801g(progressBar, "progressBar");
            AbstractC26006c.m102054g(progressBar);
            this.viewBinding.f86676e.start();
            return;
        }
        ProgressBar progressBar2 = this.viewBinding.f86692u;
        Intrinsics.m97801g(progressBar2, "progressBar");
        AbstractC26006c.m102058k(progressBar2);
        ClipLoading clLoading2 = this.viewBinding.f86676e;
        Intrinsics.m97801g(clLoading2, "clLoading");
        AbstractC26006c.m102054g(clLoading2);
        this.viewBinding.f86676e.stop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final InterfaceC21842g m74664w() {
        return C21851p.f67672a.m88759a(Utils.m27275a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m74665x(ImmVideoItemView immVideoItemView, String str) {
        immVideoItemView.m74666y(str);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX INFO: renamed from: y */
    private final void m74666y(String type) {
        Integer numValueOf;
        if (type == null) {
            numValueOf = null;
        } else {
            int iHashCode = type.hashCode();
            if (iHashCode != -1550083459) {
                if (iHashCode != -877500447) {
                    if (iHashCode == 525878142 && type.equals("favorite_add")) {
                        numValueOf = Integer.valueOf(com.transsnet.downloader.R$string.short_tv_favorite_toast);
                    } else {
                        numValueOf = null;
                    }
                } else if (type.equals("favorite_fail")) {
                    numValueOf = Integer.valueOf(com.p282tn.lib.widget.R$string.failed_toast);
                } else {
                    numValueOf = null;
                }
            } else if (type.equals("favorite_cancel")) {
                numValueOf = Integer.valueOf(com.transsnet.downloader.R$string.short_tv_favorite_remove_toast);
            } else {
                numValueOf = null;
            }
        }
        if (numValueOf != null) {
            C28951b.f88586a.m111454d(numValueOf.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final void m74667z(String id2) {
        C3187b0 c3187b0M75050C;
        C26866a.a.m104905r(C26866a.f81698a, this.TAG, new String[]{"finishAfterReport, position = " + this.position}, false, 4, null);
        PostDetailViewModel postDetailViewModel = this.videoDetailModel;
        if (postDetailViewModel == null || (c3187b0M75050C = postDetailViewModel.m75050C()) == null) {
            return;
        }
        c3187b0M75050C.mo14858q(this.position);
    }

    public final void app2Background() {
        C16781b c16781b = this.dotLayer;
        if (c16781b != null) {
            c16781b.m73124d(true);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d c26907d) {
        InterfaceC16633f.a.m72423a(this, z11, i11, i12, c26907d);
    }

    public final FrameLayout getPlayerContainer() {
        FrameLayout flContainer = this.viewBinding.f86679h;
        Intrinsics.m97801g(flContainer, "flContainer");
        return flContainer;
    }

    public final Integer getPosition() {
        return this.position;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void initPlayer() {
        InterfaceC16633f.a.m72424b(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onAliyunDecodeErrorChangeSoftwareDecoder(C23403e c23403e) {
        InterfaceC16633f.a.m72425c(this, c23403e);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        InterfaceC3224u viewLifecycleOwner;
        ShortTvPlayListViewModel shortTvPlayListViewModel;
        C3187b0 c3187b0M73591f;
        super.onAttachedToWindow();
        Fragment fragment = this.fragment;
        if (fragment != null && (viewLifecycleOwner = fragment.getViewLifecycleOwner()) != null && (shortTvPlayListViewModel = this.shortTvPlayListViewModel) != null && (c3187b0M73591f = shortTvPlayListViewModel.m73591f()) != null) {
            c3187b0M73591f.m14851j(viewLifecycleOwner, this.favoriteResultObserver);
        }
        getDownloadManager().mo88675g(this.downloadListener);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onBufferedPosition(long j11, C23403e c23403e) {
        InterfaceC16633f.a.m72426d(this, j11, c23403e);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        Subject subject;
        Context context;
        PostSubjectItem postSubjectItem;
        Subject subject2;
        Integer numValueOf = v11 != null ? Integer.valueOf(v11.getId()) : null;
        int i11 = R$id.tv_like;
        if (numValueOf != null && numValueOf.intValue() == i11) {
            m74620O(v11);
            return;
        }
        int i12 = R$id.tv_comment;
        if (numValueOf == null || numValueOf.intValue() != i12) {
            int i13 = R$id.clHotComment;
            if (numValueOf == null || numValueOf.intValue() != i13) {
                int i14 = R$id.tv_share;
                if (numValueOf != null && numValueOf.intValue() == i14) {
                    m74625T(v11);
                    return;
                }
                int i15 = R$id.iv_save;
                if (numValueOf != null && numValueOf.intValue() == i15) {
                    m74624S(v11);
                    return;
                }
                int i16 = R$id.iv_video_avatar;
                if (numValueOf != null && numValueOf.intValue() == i16) {
                    m74611F(v11);
                    return;
                }
                int i17 = R$id.ev_post_des;
                if (numValueOf != null && numValueOf.intValue() == i17) {
                    return;
                }
                int i18 = R$id.cl_subject_content;
                if (numValueOf != null && numValueOf.intValue() == i18) {
                    m74613H(v11);
                    return;
                }
                int i19 = R$id.ll_room_tag;
                if (numValueOf != null && numValueOf.intValue() == i19) {
                    m74612G(v11);
                    return;
                }
                int i20 = R$id.tvShortTvEp;
                if (numValueOf != null && numValueOf.intValue() == i20) {
                    Fragment fragment = this.fragment;
                    if (fragment == null || (context = fragment.getContext()) == null || (postSubjectItem = this.data) == null || (subject2 = postSubjectItem.getSubject()) == null) {
                        return;
                    }
                    PostSubjectItem postSubjectItem2 = this.data;
                    subject2.setOps(postSubjectItem2 != null ? postSubjectItem2.getOps() : null);
                    Navigator navigatorM61852F = TheRouter.m61773c(C27125a.f82236a.m105544b()).m61857K("id", subject2.getSubjectId()).m61852F("ep", 1);
                    PostSubjectItem postSubjectItem3 = this.data;
                    Navigator.m61845x(navigatorM61852F.m61857K("ops", postSubjectItem3 != null ? postSubjectItem3.getOps() : null), context, null, 2, null);
                    return;
                }
                int i21 = R$id.iv_download;
                if (numValueOf == null || numValueOf.intValue() != i21) {
                    int i22 = R$id.iv_short_cover;
                    if (numValueOf == null || numValueOf.intValue() != i22) {
                        int i23 = R$id.tv_title;
                        if (numValueOf == null || numValueOf.intValue() != i23) {
                            return;
                        }
                    }
                }
                DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
                Context context2 = getContext();
                Intrinsics.m97800f(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                FragmentActivity fragmentActivity = (FragmentActivity) context2;
                PostSubjectItem postSubjectItem4 = this.data;
                String ops = (postSubjectItem4 == null || (subject = postSubjectItem4.getSubject()) == null) ? null : subject.getOps();
                boolean z11 = v11.getId() == R$id.iv_download;
                PostSubjectItem postSubjectItem5 = this.data;
                downloadManagerApiM87093a.m87086d0(fragmentActivity, VideoFragment.PAGE_NAME, (384 & 4) != 0 ? "" : "", ops, (384 & 16) != 0 ? null : "download_subject", (384 & 32) != 0 ? false : z11, (384 & 64) != 0 ? null : postSubjectItem5 != null ? postSubjectItem5.getSubject() : null, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? Boolean.FALSE : null);
                return;
            }
        }
        m74619N(v11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onCompletion(C23403e mediaSource) {
        Subject subject;
        Fragment fragment;
        Context context;
        PostSubjectItem postSubjectItem;
        Subject subject2;
        C26866a.a.m104905r(C26866a.f81698a, this.TAG, new String[]{"player- onCompletion"}, false, 4, null);
        PostSubjectItem postSubjectItem2 = this.data;
        if (postSubjectItem2 == null || (subject = postSubjectItem2.getSubject()) == null) {
            return;
        }
        Integer subjectType = subject.getSubjectType();
        int value = SubjectType.SHORT_TV.getValue();
        if (subjectType == null || subjectType.intValue() != value || (fragment = this.fragment) == null || (context = fragment.getContext()) == null || (postSubjectItem = this.data) == null || (subject2 = postSubjectItem.getSubject()) == null) {
            return;
        }
        PostSubjectItem postSubjectItem3 = this.data;
        subject2.setOps(postSubjectItem3 != null ? postSubjectItem3.getOps() : null);
        Navigator navigatorM61852F = TheRouter.m61773c(C27125a.f82236a.m105544b()).m61857K("id", subject2.getSubjectId()).m61852F("ep", 1);
        PostSubjectItem postSubjectItem4 = this.data;
        Navigator.m61845x(navigatorM61852F.m61857K("ops", postSubjectItem4 != null ? postSubjectItem4.getOps() : null), context, null, 2, null);
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.seekTo(0L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        C3187b0 c3187b0M73591f;
        C3187b0 c3187b0M73591f2;
        super.onDetachedFromWindow();
        ShortTvPlayListViewModel shortTvPlayListViewModel = this.shortTvPlayListViewModel;
        if (shortTvPlayListViewModel != null && (c3187b0M73591f2 = shortTvPlayListViewModel.m73591f()) != null) {
            c3187b0M73591f2.mo14858q(null);
        }
        ShortTvPlayListViewModel shortTvPlayListViewModel2 = this.shortTvPlayListViewModel;
        if (shortTvPlayListViewModel2 != null && (c3187b0M73591f = shortTvPlayListViewModel2.m73591f()) != null) {
            c3187b0M73591f.mo14856o(this.favoriteResultObserver);
        }
        getDownloadManager().mo88686q(this.downloadListener);
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
    public void onLoadingBegin(C23403e mediaSource) {
        C16781b c16781b = this.dotLayer;
        if (c16781b != null) {
            c16781b.m73126h();
        }
        setLoading(true);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingEnd(C23403e mediaSource) {
        C16781b c16781b = this.dotLayer;
        if (c16781b != null) {
            c16781b.m73127i();
        }
        setLoading(false);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingProgress(int i11, float f11, C23403e c23403e) {
        InterfaceC16633f.a.m72435m(this, i11, f11, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoopingStart() {
        C16781b c16781b = this.dotLayer;
        if (c16781b != null) {
            c16781b.m73128j();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onMediaItemTransition(String str) {
        InterfaceC16633f.a.m72438p(this, str);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayError(PlayError errorInfo, C23403e mediaSource) {
        Intrinsics.m97802h(errorInfo, "errorInfo");
        this.isSeekToFinish.set(true);
        this.nextSeekTo = 0L;
        C16781b c16781b = this.dotLayer;
        if (c16781b != null) {
            c16781b.m73129k(errorInfo);
        }
        C26866a.f81698a.m104915i("i_media", this.TAG + " --> IPlayerListener --> onPlayError()  errorCode:" + errorInfo.getErrorCode() + " errorMessage:" + errorInfo.getErrorMessage() + " url:" + (mediaSource != null ? mediaSource.m92935k() : null) + " --> 短播放失败了", true);
    }

    public void onPlayErrorChangePayer(TnPlayerType tnPlayerType, C23403e c23403e) {
        InterfaceC16633f.a.m72441s(this, tnPlayerType, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayerRelease(C23403e mediaSource) {
        this.isSeekToFinish.set(true);
        this.nextSeekTo = 0L;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayerReset() {
        String postId;
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "player- onPlayerReset", false, 4, null);
        this.isPageRelease = true;
        this.isSeekToFinish.set(true);
        this.nextSeekTo = 0L;
        setKeepScreenOn(false);
        this.isClickPause = false;
        C16781b c16781b = this.dotLayer;
        if (c16781b != null) {
            C16781b.m73117e(c16781b, false, 1, null);
        }
        PostSubjectItem postSubjectItem = this.data;
        if (postSubjectItem != null && (postId = postSubjectItem.getPostId()) != null) {
        }
        AppCompatImageView ivCover = this.viewBinding.f86680i;
        Intrinsics.m97801g(ivCover, "ivCover");
        AbstractC26006c.m102058k(ivCover);
        AppCompatImageView ivPause = this.viewBinding.f86685n;
        Intrinsics.m97801g(ivPause, "ivPause");
        AbstractC26006c.m102054g(ivPause);
        AppCompatSeekBar seekBar = this.viewBinding.f86694w;
        Intrinsics.m97801g(seekBar, "seekBar");
        AbstractC26006c.m102054g(seekBar);
        this.viewBinding.f86678g.reset();
        ImmVideoGuideView immVideoGuideView = this.guideView;
        if (immVideoGuideView != null) {
            immVideoGuideView.removeGuide();
        }
        this.orPlayer = null;
        this.orPlayerView = null;
        this.pagerLayoutManager = null;
        this.currentSaveProgress = 0L;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPrepare(C23403e mediaSource) {
        Fragment fragment;
        String postId;
        long jLongValue;
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        boolean z11 = false;
        int duration = interfaceC16634g != null ? (int) interfaceC16634g.getDuration() : 0;
        this.viewBinding.f86692u.setMax(duration);
        this.viewBinding.f86694w.setMax(duration);
        PostSubjectItem postSubjectItem = this.data;
        if (postSubjectItem != null && (postId = postSubjectItem.getPostId()) != null) {
            if (this.isFromDownloaded) {
                jLongValue = C23628f.f72152a.m93490c(postId);
            } else {
                Long lM93485b = C23626d.f72150a.m93485b(postId);
                jLongValue = lM93485b != null ? lM93485b.longValue() : 0L;
            }
            Long lValueOf = Long.valueOf(jLongValue);
            if (lValueOf.longValue() <= 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                long jLongValue2 = lValueOf.longValue();
                C26866a.a.m104908v(C26866a.f81698a, "PostFeedVideo", "immvideo seek:" + jLongValue2, false, 4, null);
                InterfaceC16634g interfaceC16634g2 = this.orPlayer;
                if (interfaceC16634g2 != null) {
                    interfaceC16634g2.seekTo(jLongValue2);
                }
                z11 = true;
            }
            Long l11 = (Long) ImmVideoHelper.f56352h.m73010a().m73001j().get(postId);
            long jLongValue3 = l11 != null ? l11.longValue() : 0L;
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "player- onPrepare, duration = " + this.viewBinding.f86692u.getMax() + ", progress = " + jLongValue3, false, 4, null);
            if (jLongValue3 > 0 && !z11) {
                this.currentSaveProgress = jLongValue3;
                int i11 = (int) jLongValue3;
                this.viewBinding.f86692u.setProgress(i11);
                this.viewBinding.f86694w.setProgress(i11);
                InterfaceC16634g interfaceC16634g3 = this.orPlayer;
                if (interfaceC16634g3 != null) {
                    interfaceC16634g3.seekTo(jLongValue3);
                }
            }
        }
        if (!this.isClickPause && !this.isPageHide && (fragment = this.fragment) != null && fragment.isVisible()) {
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "player- onPrepare， play~", false, 4, null);
            InterfaceC16634g interfaceC16634g4 = this.orPlayer;
            if (interfaceC16634g4 != null) {
                interfaceC16634g4.play();
            }
        }
        setKeepScreenOn(true);
        m74644j0();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onProgress(long progress, C23403e mediaSource) {
        if (this.isSeekToFinish.get() && !this.isHorizontalDragging) {
            C16781b c16781b = this.dotLayer;
            if (c16781b != null) {
                c16781b.m73130l(progress);
            }
            int i11 = (int) progress;
            this.viewBinding.f86692u.setProgress(i11);
            this.viewBinding.f86694w.setProgress(i11);
            m74621P(progress);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onRenderFirstFrame() {
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "player- onRenderFirstFrame", false, 4, null);
        AppCompatImageView ivCover = this.viewBinding.f86680i;
        Intrinsics.m97801g(ivCover, "ivCover");
        AbstractC26006c.m102054g(ivCover);
        C16781b c16781b = this.dotLayer;
        if (c16781b != null) {
            c16781b.m73131m();
        }
        setLoading(false);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onSetDataSource() {
        this.isPageRelease = false;
        this.isSeekToFinish.set(true);
        this.nextSeekTo = 0L;
        setLoading(true);
    }

    @Override // androidx.p1004lifecycle.InterfaceC3218r
    public void onStateChanged(InterfaceC3224u source, Lifecycle.Event event) {
        String postId;
        String postId2;
        Lifecycle lifecycle;
        Intrinsics.m97802h(source, "source");
        Intrinsics.m97802h(event, "event");
        int i11 = C17309a.f57573a[event.ordinal()];
        if (i11 == 1) {
            this.isPageHide = true;
            C26866a.a aVar = C26866a.f81698a;
            C26866a.a.m104898f(aVar, this.TAG, "player- onPause", false, 4, null);
            InterfaceC16634g interfaceC16634g = this.orPlayer;
            if (interfaceC16634g != null) {
                interfaceC16634g.pause();
            }
            PostSubjectItem postSubjectItem = this.data;
            if (postSubjectItem == null || (postId = postSubjectItem.getPostId()) == null) {
                return;
            }
            C26866a.a.m104908v(aVar, "PostFeedVideo", "immvideo savePlayProgress:" + this.viewBinding.f86692u.getProgress(), false, 4, null);
            if (this.isFromDownloaded) {
                C23628f.f72152a.m93491e(postId, this.viewBinding.f86692u.getProgress());
                return;
            } else {
                C23626d.f72150a.m93486c(postId, this.viewBinding.f86692u.getProgress());
                return;
            }
        }
        if (i11 == 2) {
            this.isPageHide = false;
            if (this.isClickPause) {
                return;
            }
            Fragment fragment = this.fragment;
            if (fragment != null && !fragment.isVisible()) {
                post(new Runnable() { // from class: com.transsion.postdetail.ui.view.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImmVideoItemView.m74627V(this.f57732a);
                    }
                });
                return;
            }
            InterfaceC16634g interfaceC16634g2 = this.orPlayer;
            if (interfaceC16634g2 != null) {
                interfaceC16634g2.play();
                return;
            }
            return;
        }
        if (i11 == 3) {
            PostSubjectItem postSubjectItem2 = this.data;
            if (postSubjectItem2 == null || (postId2 = postSubjectItem2.getPostId()) == null) {
                return;
            }
            return;
        }
        if (i11 != 5) {
            return;
        }
        Fragment fragment2 = this.fragment;
        if (fragment2 != null && (lifecycle = fragment2.getLifecycle()) != null) {
            lifecycle.mo14835d(this);
        }
        C16781b c16781b = this.dotLayer;
        if (c16781b != null) {
            c16781b.m73134p();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.m97802h(event, "event");
        GestureDetector gestureDetector = this.gestureDetector;
        if (gestureDetector == null || !gestureDetector.onTouchEvent(event)) {
            return super.onTouchEvent(event);
        }
        return true;
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
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "player- onVideoPause", false, 4, null);
        AppCompatImageView ivPause = this.viewBinding.f86685n;
        Intrinsics.m97801g(ivPause, "ivPause");
        AbstractC26006c.m102058k(ivPause);
        AppCompatSeekBar seekBar = this.viewBinding.f86694w;
        Intrinsics.m97801g(seekBar, "seekBar");
        AbstractC26006c.m102058k(seekBar);
        ProgressBar progressBar = this.viewBinding.f86692u;
        Intrinsics.m97801g(progressBar, "progressBar");
        AbstractC26006c.m102054g(progressBar);
        C16781b c16781b = this.dotLayer;
        if (c16781b != null) {
            c16781b.m73132n();
        }
        setKeepScreenOn(false);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoSizeChanged(int i11, int i12) {
        InterfaceC16633f.a.m72419H(this, i11, i12);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoStart(C23403e mediaSource) {
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "player- onVideoStart", false, 4, null);
        C16781b c16781b = this.dotLayer;
        if (c16781b != null) {
            c16781b.m73133o();
        }
        AppCompatImageView ivPause = this.viewBinding.f86685n;
        Intrinsics.m97801g(ivPause, "ivPause");
        AbstractC26006c.m102054g(ivPause);
        AppCompatSeekBar seekBar = this.viewBinding.f86694w;
        Intrinsics.m97801g(seekBar, "seekBar");
        AbstractC26006c.m102054g(seekBar);
        setLoading(false);
        setKeepScreenOn(true);
        InterfaceC23410a interfaceC23410a = this.audioApi;
        if (interfaceC23410a != null) {
            interfaceC23410a.pause();
        }
    }

    public final void setData(PostSubjectItem item, final Fragment fragment, Integer position, boolean videoLoadMore, String basePostId, String baseItemType, boolean attachToMain, String commentId, String pageFrom, boolean isFromDownloaded) {
        Long shareCount;
        Long commentCount;
        Integer subjectType;
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(commentId, "commentId");
        Intrinsics.m97802h(pageFrom, "pageFrom");
        C16781b c16781b = new C16781b();
        this.dotLayer = c16781b;
        c16781b.m73136s(basePostId);
        C16781b c16781b2 = this.dotLayer;
        if (c16781b2 != null) {
            c16781b2.m73135r(baseItemType);
        }
        C16781b c16781b3 = this.dotLayer;
        if (c16781b3 != null) {
            String postId = item.getPostId();
            if (postId == null) {
                postId = "";
            }
            c16781b3.m73141x(postId, item);
        }
        C16781b c16781b4 = this.dotLayer;
        if (c16781b4 != null) {
            Subject subject = item.getSubject();
            c16781b4.m73142y((subject == null || (subjectType = subject.getSubjectType()) == null) ? 0 : subjectType.intValue());
        }
        this.fragment = fragment;
        this.videoLoadMore = Boolean.valueOf(videoLoadMore);
        this.basePostId = basePostId;
        this.position = position;
        this.attachToMain = attachToMain;
        this.commentId = commentId;
        this.pageFrom = pageFrom;
        this.isFromDownloaded = isFromDownloaded;
        fragment.getLifecycle().mo14832a(this);
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.postdetail.ui.view.ImmVideoItemView$setData$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return fragment;
            }
        };
        this.videoDetailModel = m74631Z(FragmentViewModelLazyKt.m14626a(fragment, Reflection.m97823b(PostDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.postdetail.ui.view.ImmVideoItemView$setData$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.postdetail.ui.view.ImmVideoItemView$setData$$inlined$viewModels$default$3
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
                    defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.m97801g(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }));
        final Function0<Fragment> function1 = new Function0<Fragment>() { // from class: com.transsion.postdetail.ui.view.ImmVideoItemView$setData$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return fragment;
            }
        };
        this.shortTvPlayListViewModel = m74632a0(FragmentViewModelLazyKt.m14626a(fragment, Reflection.m97823b(ShortTvPlayListViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.postdetail.ui.view.ImmVideoItemView$setData$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function1.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.postdetail.ui.view.ImmVideoItemView$setData$$inlined$viewModels$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                Object objInvoke = function1.invoke();
                InterfaceC3208m interfaceC3208m = objInvoke instanceof InterfaceC3208m ? (InterfaceC3208m) objInvoke : null;
                C3227v0.c defaultViewModelProviderFactory = interfaceC3208m != null ? interfaceC3208m.getDefaultViewModelProviderFactory() : null;
                if (defaultViewModelProviderFactory == null) {
                    defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.m97801g(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }));
        final Function0<Fragment> function2 = new Function0<Fragment>() { // from class: com.transsion.postdetail.ui.view.ImmVideoItemView$setData$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return fragment;
            }
        };
        this.mCommentViewModel = m74633b0(FragmentViewModelLazyKt.m14626a(fragment, Reflection.m97823b(CommentViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.postdetail.ui.view.ImmVideoItemView$setData$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function2.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.postdetail.ui.view.ImmVideoItemView$setData$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                Object objInvoke = function2.invoke();
                InterfaceC3208m interfaceC3208m = objInvoke instanceof InterfaceC3208m ? (InterfaceC3208m) objInvoke : null;
                C3227v0.c defaultViewModelProviderFactory = interfaceC3208m != null ? interfaceC3208m.getDefaultViewModelProviderFactory() : null;
                if (defaultViewModelProviderFactory == null) {
                    defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.m97801g(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }));
        this.data = item;
        m74656p0(item);
        m74642i0(item);
        Stat stat = item.getStat();
        long jLongValue = 0;
        m74636e0((stat == null || (commentCount = stat.getCommentCount()) == null) ? 0L : commentCount.longValue());
        Stat stat2 = item.getStat();
        if (stat2 != null && (shareCount = stat2.getShareCount()) != null) {
            jLongValue = shareCount.longValue();
        }
        m74648l0(jLongValue);
        m74654o0(item);
        m74637f0(item);
        if (attachToMain) {
            ViewGroup.LayoutParams layoutParams = this.viewBinding.f86693v.getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.C2308b) {
                ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.C2308b) layoutParams)).bottomMargin = AbstractC5776a0.m27313a(16.0f);
            }
        }
        m74650m0();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void setOnSeekCompleteListener() {
        InterfaceC16633f.a.m72422K(this);
        this.isSeekToFinish.set(true);
        long j11 = this.nextSeekTo;
        if (j11 > 0) {
            C26866a.a.m104905r(C26866a.f81698a, this.TAG, new String[]{"seek OnSeekComplete，nextSeekTo:" + j11}, false, 4, null);
            InterfaceC16634g interfaceC16634g = this.orPlayer;
            if (interfaceC16634g != null) {
                interfaceC16634g.seekTo(this.nextSeekTo);
            }
            this.nextSeekTo = 0L;
        }
    }

    public final void setPagerLayoutManager(PagerLayoutManager pagerLayoutManager) {
        Intrinsics.m97802h(pagerLayoutManager, "pagerLayoutManager");
        this.pagerLayoutManager = pagerLayoutManager;
    }

    public final void setPlayer(InterfaceC16634g orPlayer, ORPlayerView orPlayerView) {
        Intrinsics.m97802h(orPlayer, "orPlayer");
        Intrinsics.m97802h(orPlayerView, "orPlayerView");
        this.orPlayer = orPlayer;
        this.orPlayerView = orPlayerView;
        C16781b c16781b = this.dotLayer;
        if (c16781b != null) {
            c16781b.m73139v(orPlayer);
        }
    }

    public final void setPosition(Integer num) {
        this.position = num;
    }

    public final void setVideoUrl(String url) {
        Intrinsics.m97802h(url, "url");
        C16781b c16781b = this.dotLayer;
        if (c16781b != null) {
            c16781b.m73120A(url);
        }
    }

    public final void showCommentDialog() {
        FragmentManager childFragmentManager;
        Fragment fragment = this.fragment;
        if (fragment != null && (childFragmentManager = fragment.getChildFragmentManager()) != null) {
            ImmVideoCommentDialog immVideoCommentDialogM73940b = ImmVideoCommentDialog.Companion.m73940b(ImmVideoCommentDialog.INSTANCE, this.data, this.commentId, VideoFragment.PAGE_NAME, null, 8, null);
            this.commentDialog = immVideoCommentDialogM73940b;
            if (immVideoCommentDialogM73940b != null) {
                immVideoCommentDialogM73940b.show(childFragmentManager, "immComment");
            }
        }
        ImmVideoCommentDialog immVideoCommentDialog = this.commentDialog;
        if (immVideoCommentDialog != null) {
            immVideoCommentDialog.m73935A0(new C17314f());
        }
        C16768a.f56378a.m73071e(this.data, VideoFragment.PAGE_NAME, this.pageFrom);
    }

    public final void videoStartPrepare(String pageFrom) {
        C16781b c16781b;
        this.pageFrom = pageFrom;
        if (pageFrom != null && (c16781b = this.dotLayer) != null) {
            c16781b.m73137t(pageFrom);
        }
        C16781b c16781b2 = this.dotLayer;
        if (c16781b2 != null) {
            c16781b2.m73125g();
        }
        C16781b c16781b3 = this.dotLayer;
        if (c16781b3 != null) {
            c16781b3.m73121a(0, 0);
        }
        C16781b c16781b4 = this.dotLayer;
        if (c16781b4 != null) {
            c16781b4.m73140w(this.position);
        }
    }
}
