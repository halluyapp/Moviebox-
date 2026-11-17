package com.transsion.postdetail.p306ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
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
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5790i;
import com.blankj.utilcode.util.AbstractC5806y;
import com.bumptech.glide.Glide;
import com.cloud.tmc.integration.event.EventConstants;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.noober.background.view.BLTextView;
import com.therouter.TheRouter;
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.baseui.util.C14557c;
import com.transsion.baseui.widget.C14582f;
import com.transsion.baseui.widget.jumpingbeans.C14587a;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.ShortTVFavInfo;
import com.transsion.moviedetailapi.bean.ShortTVItem;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.Trailer;
import com.transsion.moviedetailapi.bean.Video;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.PlayError;
import com.transsion.player.orplayer.global.TnPlayerType;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.R$layout;
import com.transsion.postdetail.R$string;
import com.transsion.postdetail.control.C16765a;
import com.transsion.postdetail.helper.ShortTvImmVideoHelper;
import com.transsion.postdetail.layer.C16781b;
import com.transsion.postdetail.shorttv.C16904k;
import com.transsion.postdetail.shorttv.ShortTvPlayListViewModel;
import com.transsion.postdetail.util.AbstractC17443m;
import com.transsion.postdetail.util.C17449s;
import com.transsion.postdetail.viewmodel.C17535x;
import com.transsion.push.PushConstants;
import com.transsion.share.bean.PostType;
import com.transsion.share.share.InterfaceC18701a;
import com.transsion.share.share.ShareDialogFragment;
import com.transsion.shorttv.base.pager.PagerLayoutManager;
import com.transsion.usercenterapi.ReportType;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.DownloadManagerApi;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fo.C23403e;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import ng.AbstractC26006c;
import p328cp.C22762b;
import p441gz.InterfaceC23704a;
import p462hj.C23860f;
import p620nn.C26035b;
import p683po.C26906c;
import p683po.C26907d;
import p844vo.C28157j0;
import p925xy.C28673c;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0007*\u0002Ä\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B!\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011JE\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010#\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J)\u0010.\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010-\u001a\u00020\t¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u001b2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00107\u001a\u00020\u000f2\u0006\u00105\u001a\u0002042\u0006\u00101\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u000fH\u0016¢\u0006\u0004\b9\u0010\u0011J\u0019\u0010<\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u000f¢\u0006\u0004\b>\u0010\u0011J\u0015\u0010@\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\u0018¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u0018¢\u0006\u0004\bC\u0010AJ\u000f\u0010D\u001a\u00020\u000fH\u0016¢\u0006\u0004\bD\u0010\u0011J\u001f\u0010G\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\t2\u0006\u0010F\u001a\u00020\tH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u000fH\u0016¢\u0006\u0004\bI\u0010\u0011J\u0019\u0010J\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bJ\u0010=J\u0019\u0010K\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bK\u0010=J\u0019\u0010L\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bL\u0010=J!\u0010O\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020M2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bO\u0010PJ\u0019\u0010Q\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bQ\u0010=J\u0019\u0010R\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bR\u0010=J!\u0010U\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020S2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u000fH\u0016¢\u0006\u0004\bW\u0010\u0011J\u0019\u0010X\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bX\u0010=J\u0019\u0010Z\u001a\u00020\u000f2\b\u0010Y\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bZ\u0010AJ\u000f\u0010[\u001a\u00020\u000fH\u0016¢\u0006\u0004\b[\u0010\u0011J\u0019\u0010]\u001a\u00020\u000f2\b\u0010\\\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b]\u0010^J\u0019\u0010`\u001a\u00020\u000f2\b\u0010_\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b`\u0010AJ\u0017\u0010a\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\ba\u0010\rJ\u0017\u0010b\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\u000fH\u0002¢\u0006\u0004\bd\u0010\u0011J\u000f\u0010e\u001a\u00020\u000fH\u0002¢\u0006\u0004\be\u0010\u0011J/\u0010h\u001a\u00020\u000f2\b\u0010e\u001a\u0004\u0018\u00010\t2\b\u0010f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bh\u0010iJ\u0017\u0010k\u001a\u00020\u000f2\u0006\u0010j\u001a\u00020\u001bH\u0002¢\u0006\u0004\bk\u0010lJ\u0017\u0010m\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bm\u0010nJ\u0017\u0010\\\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b\\\u0010^J\u0019\u0010p\u001a\u00020\u000f2\b\u0010o\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\bp\u0010AJ\u000f\u0010q\u001a\u00020\u000fH\u0002¢\u0006\u0004\bq\u0010\u0011J\u0017\u0010s\u001a\u00020\u000f2\u0006\u0010r\u001a\u00020\u001bH\u0002¢\u0006\u0004\bs\u0010lR\u0014\u0010v\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010~\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001a\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bf\u0010\u008c\u0001R*\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010uR\u001a\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001a\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001b\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b`\u0010\u009c\u0001R\u001b\u0010 \u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bp\u0010\u009f\u0001R\"\u0010¥\u0001\u001a\u0005\u0018\u00010¡\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\ba\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R\u001b\u0010¨\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bq\u0010§\u0001R\u0019\u0010«\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0019\u0010\u00ad\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010ª\u0001R\u0018\u0010®\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bm\u0010ª\u0001R\u0019\u0010±\u0001\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0016\u0010³\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\\\u0010²\u0001R\u0016\u0010´\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\be\u0010²\u0001R\u0017\u0010¶\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010²\u0001R\u0017\u0010¸\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010²\u0001R\u0017\u0010º\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010²\u0001R\u0016\u0010»\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bd\u0010²\u0001R\u0017\u0010?\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¼\u0001\u0010uR\u0018\u0010À\u0001\u001a\u00030½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0018\u0010Á\u0001\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bh\u0010°\u0001R\u0018\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010ª\u0001R\u0018\u0010Ã\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bb\u0010ª\u0001R\u0018\u0010Ç\u0001\u001a\u00030Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u0019\u0010É\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010ª\u0001¨\u0006Ê\u0001²\u0006\f\u0010~\u001a\u00020{8\nX\u008a\u0084\u0002²\u0006\r\u0010\u0082\u0001\u001a\u00020\u007f8\nX\u008a\u0084\u0002"}, m97100d2 = {"Lcom/transsion/postdetail/ui/view/ShortTvImmVideoItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/transsion/player/orplayer/f;", "Landroid/view/View$OnClickListener;", "Landroidx/lifecycle/r;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/transsion/moviedetailapi/bean/Subject;", WebConstants.FIELD_ITEM, "Landroidx/fragment/app/Fragment;", "fragment", RequestParameters.POSITION, "", "basePostId", "baseItemType", "", "attachToMain", "setData", "(Lcom/transsion/moviedetailapi/bean/Subject;Landroidx/fragment/app/Fragment;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/transsion/player/orplayer/g;", "orPlayer", "Lcom/transsion/player/ui/ORPlayerView;", "orPlayerView", "setPlayer", "(Lcom/transsion/player/orplayer/g;Lcom/transsion/player/ui/ORPlayerView;)V", "Lcom/transsion/shorttv/base/pager/PagerLayoutManager;", "pagerLayoutManager", "setPagerLayoutManager", "(Lcom/transsion/shorttv/base/pager/PagerLayoutManager;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/transsion/moviedetailapi/bean/Video;", "video", "maxHeight", "addVideoView", "(Landroid/view/View;Lcom/transsion/moviedetailapi/bean/Video;I)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroidx/lifecycle/u;", EventConstants.KEY_SOURCE, "Landroidx/lifecycle/Lifecycle$Event;", "onStateChanged", "(Landroidx/lifecycle/u;Landroidx/lifecycle/Lifecycle$Event;)V", "onPlayerReset", "Lfo/e;", "mediaSource", "onPlayerRelease", "(Lfo/e;)V", "app2Background", "pageFrom", "videoStartPrepare", "(Ljava/lang/String;)V", "url", "setVideoUrl", "onSetDataSource", "width", "height", "onVideoSizeChanged", "(II)V", "onRenderFirstFrame", "onVideoStart", "onPrepare", "onVideoPause", "", NotificationCompat.CATEGORY_PROGRESS, "onProgress", "(JLfo/e;)V", "onLoadingBegin", "onLoadingEnd", "Lcom/transsion/player/orplayer/PlayError;", "errorInfo", "onPlayError", "(Lcom/transsion/player/orplayer/PlayError;Lfo/e;)V", "onLoopingStart", "onCompletion", "uuid", "onMediaItemTransition", "setOnSeekCompleteListener", "v", "onClick", "(Landroid/view/View;)V", NativeComponentConstants.KEY_COMPONENT_TYPE, "n", TtmlNode.TAG_P, "F", "(Lcom/transsion/moviedetailapi/bean/Subject;)V", "A", "w", "h", "rootHeight", "D", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", PushConstants.PUSH_SERVICE_TYPE_SHOW, "setLoading", "(Z)V", "t", "(J)V", "id", "o", CampaignEx.JSON_KEY_AD_Q, "visible", "setContentVisibility", "a", "Ljava/lang/String;", "TAG", "Lvo/j0;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lvo/j0;", "viewBinding", "Lcom/transsion/postdetail/viewmodel/x;", "c", "Lcom/transsion/postdetail/viewmodel/x;", "videoDetailModel", "Lcom/transsion/postdetail/shorttv/ShortTvPlayListViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/postdetail/shorttv/ShortTvPlayListViewModel;", "shortTvPlayListViewModel", "Lcom/transsion/share/share/ShareDialogFragment;", "e", "Lcom/transsion/share/share/ShareDialogFragment;", "mShareDialog", "f", "Lcom/transsion/moviedetailapi/bean/Subject;", "data", "g", "Landroidx/fragment/app/Fragment;", "Ljava/lang/Boolean;", "videoLoadMore", "i", "Ljava/lang/Integer;", "getPosition", "()Ljava/lang/Integer;", "setPosition", "(Ljava/lang/Integer;)V", "j", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/player/orplayer/g;", "l", "Lcom/transsion/player/ui/ORPlayerView;", "m", "Lcom/transsion/shorttv/base/pager/PagerLayoutManager;", "Lcom/transsion/postdetail/ui/view/ImmVideoGuideView;", "Lcom/transsion/postdetail/ui/view/ImmVideoGuideView;", "guideView", "Landroid/view/GestureDetector;", "Landroid/view/GestureDetector;", "gestureDetector", "Lgz/a;", "Lkotlin/Lazy;", "getLoginApi", "()Lgz/a;", "loginApi", "Lcom/transsion/postdetail/layer/b;", "Lcom/transsion/postdetail/layer/b;", "dotLayer", CampaignEx.JSON_KEY_AD_R, "Z", "isClickPause", "s", "isHorizontalDragging", "isPageHide", TmcStartParams.KEY_URL_SHORT, "J", "currentSaveProgress", "I", "resImgLargeWidth", "resImgLargeHeight", "x", "resImgSmallWidth", "y", "resImgSmallHeight", "z", "screenHeight", "dp170", "B", "Ljava/util/concurrent/atomic/AtomicBoolean;", "C", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isSeekToFinish", "nextSeekTo", "E", "isPageRelease", "com/transsion/postdetail/ui/view/ShortTvImmVideoItemView$b", "G", "Lcom/transsion/postdetail/ui/view/ShortTvImmVideoItemView$b;", "favoriteResultObserver", "H", "isPrepare", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTvImmVideoItemView extends ConstraintLayout implements InterfaceC16633f, View.OnClickListener, InterfaceC3218r {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final int dp170;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private String pageFrom;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final AtomicBoolean isSeekToFinish;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private long nextSeekTo;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean attachToMain;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean isPageRelease;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C17337b favoriteResultObserver;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean isPrepare;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28157j0 viewBinding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C17535x videoDetailModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private ShortTvPlayListViewModel shortTvPlayListViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private ShareDialogFragment mShareDialog;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Subject data;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Fragment fragment;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Boolean videoLoadMore;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private Integer position;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String basePostId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private InterfaceC16634g orPlayer;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private ORPlayerView orPlayerView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private PagerLayoutManager pagerLayoutManager;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private ImmVideoGuideView guideView;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private GestureDetector gestureDetector;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final Lazy loginApi;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private C16781b dotLayer;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean isClickPause;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean isHorizontalDragging;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean isPageHide;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private long currentSaveProgress;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final int resImgLargeWidth;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int resImgLargeHeight;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final int resImgSmallWidth;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final int resImgSmallHeight;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final int screenHeight;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.ShortTvImmVideoItemView$a */
    public /* synthetic */ class C17336a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f57704a;

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
            f57704a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.ShortTvImmVideoItemView$b */
    public static final class C17337b implements InterfaceC3189c0 {

        /* JADX INFO: renamed from: a */
        private String f57705a;

        C17337b() {
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(String str) {
            if (Intrinsics.m97797c(this.f57705a, str)) {
                return;
            }
            ShortTvImmVideoItemView.this.m74848n(str);
        }

        /* JADX INFO: renamed from: b */
        public final void m74862b(String str) {
            this.f57705a = str;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.ShortTvImmVideoItemView$c */
    public static final class C17338c extends GestureDetector.SimpleOnGestureListener {
        C17338c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            return super.onDoubleTap(e11);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            ShortTvImmVideoItemView.this.m74857w();
            return super.onSingleTapUp(e11);
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.ShortTvImmVideoItemView$d */
    public static final class C17339d implements C14582f.a {

        /* JADX INFO: renamed from: a */
        private int f57708a;

        /* JADX INFO: renamed from: b */
        private int f57709b;

        /* JADX INFO: renamed from: c */
        private int f57710c;

        /* JADX INFO: renamed from: d */
        private String f57711d = "";

        /* JADX INFO: renamed from: e */
        private int f57712e = AbstractC5776a0.m27313a(1.5f);

        C17339d() {
        }

        @Override // com.transsion.baseui.widget.C14582f.a
        /* JADX INFO: renamed from: a */
        public void mo65769a() {
        }

        @Override // com.transsion.baseui.widget.C14582f.a
        /* JADX INFO: renamed from: b */
        public void mo65770b(float f11, float f12) {
            int i11 = 0;
            if (!ShortTvImmVideoItemView.this.isHorizontalDragging) {
                PagerLayoutManager pagerLayoutManager = ShortTvImmVideoItemView.this.pagerLayoutManager;
                if (pagerLayoutManager != null) {
                    pagerLayoutManager.m79146W(false);
                }
                this.f57708a = ShortTvImmVideoItemView.this.viewBinding.f86482m.getProgress();
                ShortTvImmVideoItemView.this.setContentVisibility(false);
                AppCompatTextView tvProgressDes = ShortTvImmVideoItemView.this.viewBinding.f86489t;
                Intrinsics.m97801g(tvProgressDes, "tvProgressDes");
                AbstractC26006c.m102058k(tvProgressDes);
                AppCompatSeekBar seekBar = ShortTvImmVideoItemView.this.viewBinding.f86484o;
                Intrinsics.m97801g(seekBar, "seekBar");
                AbstractC26006c.m102058k(seekBar);
                ProgressBar progressBar = ShortTvImmVideoItemView.this.viewBinding.f86482m;
                Intrinsics.m97801g(progressBar, "progressBar");
                AbstractC26006c.m102054g(progressBar);
                this.f57710c = ShortTvImmVideoItemView.this.viewBinding.f86482m.getWidth();
                int max = ShortTvImmVideoItemView.this.viewBinding.f86482m.getMax();
                this.f57709b = max;
                this.f57711d = AbstractC17443m.m74968c(max);
            }
            ShortTvImmVideoItemView.this.isHorizontalDragging = true;
            float f13 = f12 - f11;
            int i12 = this.f57709b;
            int i13 = (int) (this.f57708a + ((f13 * i12) / this.f57710c));
            if (i13 >= 0) {
                i11 = i13 > i12 ? i12 : i13;
            }
            ShortTvImmVideoItemView.this.viewBinding.f86489t.setText(AbstractC17443m.m74968c(i11) + " / " + this.f57711d);
            ShortTvImmVideoItemView.this.viewBinding.f86482m.setProgress(i11);
            ShortTvImmVideoItemView.this.viewBinding.f86484o.setProgress(i11);
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
            PagerLayoutManager pagerLayoutManager = ShortTvImmVideoItemView.this.pagerLayoutManager;
            if (pagerLayoutManager != null) {
                pagerLayoutManager.m79146W(true);
            }
            if (ShortTvImmVideoItemView.this.isHorizontalDragging) {
                ShortTvImmVideoItemView.this.isHorizontalDragging = false;
                ShortTvImmVideoItemView.this.setContentVisibility(true);
                AppCompatTextView tvProgressDes = ShortTvImmVideoItemView.this.viewBinding.f86489t;
                Intrinsics.m97801g(tvProgressDes, "tvProgressDes");
                AbstractC26006c.m102054g(tvProgressDes);
                AppCompatSeekBar seekBar = ShortTvImmVideoItemView.this.viewBinding.f86484o;
                Intrinsics.m97801g(seekBar, "seekBar");
                AbstractC26006c.m102054g(seekBar);
                ProgressBar progressBar = ShortTvImmVideoItemView.this.viewBinding.f86482m;
                Intrinsics.m97801g(progressBar, "progressBar");
                AbstractC26006c.m102058k(progressBar);
                long progress = ShortTvImmVideoItemView.this.viewBinding.f86482m.getProgress();
                ShortTvImmVideoItemView shortTvImmVideoItemView = ShortTvImmVideoItemView.this;
                if (shortTvImmVideoItemView.isSeekToFinish.compareAndSet(true, false)) {
                    InterfaceC16634g interfaceC16634g2 = ShortTvImmVideoItemView.this.orPlayer;
                    if (interfaceC16634g2 != null) {
                        interfaceC16634g2.seekTo(progress);
                    }
                    progress = 0;
                }
                shortTvImmVideoItemView.nextSeekTo = progress;
                InterfaceC16634g interfaceC16634g3 = ShortTvImmVideoItemView.this.orPlayer;
                if (interfaceC16634g3 == null || interfaceC16634g3.isPlaying() || (interfaceC16634g = ShortTvImmVideoItemView.this.orPlayer) == null) {
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

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.ShortTvImmVideoItemView$e */
    public static final class C17340e implements InterfaceC18701a {
        C17340e() {
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: a */
        public void mo70521a(String id2, PostType postType) {
            Intrinsics.m97802h(id2, "id");
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: b */
        public void mo70522b(String str) {
            ShortTvImmVideoItemView.this.m74849o(str);
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: c */
        public void mo70523c(String url, String fileName, String fileSize, String fileImage) {
            Intrinsics.m97802h(url, "url");
            Intrinsics.m97802h(fileName, "fileName");
            Intrinsics.m97802h(fileSize, "fileSize");
            Intrinsics.m97802h(fileImage, "fileImage");
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortTvImmVideoItemView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortTvImmVideoItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTvImmVideoItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.TAG = "ImmVideoPlayer";
        this.loginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.view.b2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvImmVideoItemView.m74853s();
            }
        });
        this.screenHeight = AbstractC5806y.m27487c();
        this.dp170 = AbstractC5776a0.m27313a(170.0f);
        this.pageFrom = "";
        this.isSeekToFinish = new AtomicBoolean(true);
        this.attachToMain = true;
        this.favoriteResultObserver = new C17337b();
        View.inflate(getContext(), R$layout.layout_short_tv_immersion_video_item_view, this);
        C28157j0 c28157j0M109324a = C28157j0.m109324a(this);
        Intrinsics.m97801g(c28157j0M109324a, "bind(...)");
        this.viewBinding = c28157j0M109324a;
        c28157j0M109324a.f86488s.setOnClickListener(this);
        c28157j0M109324a.f86478i.setOnClickListener(this);
        c28157j0M109324a.f86480k.setOnClickListener(this);
        c28157j0M109324a.f86490u.setOnClickListener(this);
        c28157j0M109324a.f86476g.setOnClickListener(this);
        c28157j0M109324a.f86479j.setOnClickListener(this);
        c28157j0M109324a.f86491v.setOnClickListener(this);
        c28157j0M109324a.f86486q.setOnClickListener(this);
        this.resImgLargeWidth = AbstractC5776a0.m27313a(48.0f);
        this.resImgLargeHeight = AbstractC5776a0.m27313a(64.0f);
        this.resImgSmallWidth = AbstractC5776a0.m27313a(24.0f);
        this.resImgSmallHeight = AbstractC5776a0.m27313a(32.0f);
        m74850p(context);
        if (ShortTvImmVideoHelper.f56366k.m73053a().m73044m() > 0) {
            ViewGroup.LayoutParams layoutParams = c28157j0M109324a.f86483n.getLayoutParams();
            Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
            if (((ViewGroup.MarginLayoutParams) c2308b).bottomMargin < AbstractC5776a0.m27313a(35.0f)) {
                ((ViewGroup.MarginLayoutParams) c2308b).bottomMargin += AbstractC5776a0.m27313a(10.0f);
                c28157j0M109324a.f86483n.setLayoutParams(c2308b);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v43, types: [T, com.transsion.moviedetailapi.bean.ShortTVFavInfo] */
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
    /* JADX INFO: renamed from: A */
    private final void m74836A() {
        Cover cover;
        String url;
        Fragment fragment;
        FragmentActivity activity;
        String thumbnail;
        Cover cover2;
        ShortTVItem shortTVFirstEp;
        Media video;
        Video videoAddress;
        ShapeableImageView ivVideoAvatar = this.viewBinding.f86480k;
        Intrinsics.m97801g(ivVideoAvatar, "ivVideoAvatar");
        AbstractC26006c.m102054g(ivVideoAvatar);
        AppCompatImageView ivDownload = this.viewBinding.f86476g;
        Intrinsics.m97801g(ivDownload, "ivDownload");
        AbstractC26006c.m102058k(ivDownload);
        AppCompatTextView tvTitle = this.viewBinding.f86491v;
        Intrinsics.m97801g(tvTitle, "tvTitle");
        AbstractC26006c.m102058k(tvTitle);
        BLTextView tvShortTvEp = this.viewBinding.f86490u;
        Intrinsics.m97801g(tvShortTvEp, "tvShortTvEp");
        AbstractC26006c.m102058k(tvShortTvEp);
        ShapeableImageView ivShortCover = this.viewBinding.f86479j;
        Intrinsics.m97801g(ivShortCover, "ivShortCover");
        AbstractC26006c.m102058k(ivShortCover);
        AppCompatTextView appCompatTextView = this.viewBinding.f86491v;
        Subject subject = this.data;
        appCompatTextView.setText(subject != null ? subject.getTitle() : null);
        C17449s c17449s = C17449s.f57841a;
        Subject subject2 = this.data;
        String strM74973a = c17449s.m74973a(Integer.valueOf(subject2 != null ? subject2.getTotalEpisode() : 0));
        AppCompatTextView appCompatTextView2 = this.viewBinding.f86486q;
        Subject subject3 = this.data;
        appCompatTextView2.setText(subject3 != null ? subject3.getDescription() : null);
        this.viewBinding.f86490u.setText(getContext().getString(R$string.short_tv_play_all, strM74973a));
        C14587a.m65779a(this.viewBinding.f86490u).m65784e(0, this.viewBinding.f86490u.getText().toString().length()).m65786g(true).m65788i(100).m65785f(0.05f).m65787h(10000).m65783a();
        ShapeableImageView shapeableImageView = this.viewBinding.f86479j;
        Subject subject4 = this.data;
        if (subject4 == null || !subject4.getBuiltIn()) {
            Subject subject5 = this.data;
            if (subject5 != null && (cover = subject5.getCover()) != null && (url = cover.getUrl()) != null && (fragment = this.fragment) != null && (activity = fragment.getActivity()) != null && !activity.isFinishing()) {
                C23860f.b bVarM94464c = C23860f.f72909a.m94457m(activity).m94468g(url).m94474m(AbstractC5790i.m27411e(21.0f)).m94464c(AbstractC5790i.m27411e(30.0f));
                Subject subject6 = this.data;
                if (subject6 == null || (cover2 = subject6.getCover()) == null || (thumbnail = cover2.getThumbnail()) == null) {
                    thumbnail = "";
                }
                C23860f.b bVarM94469h = bVarM94464c.m94473l(thumbnail).m94469h(true);
                ShapeableImageView ivShortCover2 = this.viewBinding.f86479j;
                Intrinsics.m97801g(ivShortCover2, "ivShortCover");
                bVarM94469h.m94465d(ivShortCover2);
            }
        } else {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new ShortTvImmVideoItemView$updateShortTVInfo$1(this, null), 3, null);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Subject subject7 = this.data;
        T shortTVFavInfo = subject7 != null ? subject7.getShortTVFavInfo() : 0;
        objectRef.element = shortTVFavInfo;
        if (shortTVFavInfo == 0) {
            ?? shortTVFavInfo2 = new ShortTVFavInfo(null, false, null, 7, null);
            shortTVFavInfo2.setFavoriteNum("0");
            objectRef.element = shortTVFavInfo2;
            Subject subject8 = this.data;
            if (subject8 != 0) {
                subject8.setShortTVFavInfo(shortTVFavInfo2);
            }
        }
        AppCompatTextView tvFavorite = this.viewBinding.f86487r;
        Intrinsics.m97801g(tvFavorite, "tvFavorite");
        AbstractC26006c.m102058k(tvFavorite);
        this.viewBinding.f86487r.setSelected(((ShortTVFavInfo) objectRef.element).getHasFavorite());
        AppCompatTextView appCompatTextView3 = this.viewBinding.f86487r;
        String favoriteNum = ((ShortTVFavInfo) objectRef.element).getFavoriteNum();
        appCompatTextView3.setText(AbstractC14564j.m65680a(Long.parseLong(favoriteNum != null ? favoriteNum : "0")));
        this.viewBinding.f86487r.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTvImmVideoItemView.m74837B(this.f57798a, objectRef, view);
            }
        });
        Context context = getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        Function1 function1 = new Function1() { // from class: com.transsion.postdetail.ui.view.z1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvImmVideoItemView.m74838C(this.f57802a, (C28673c) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C28673c.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent((AppCompatActivity) context, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
        Subject subject9 = this.data;
        if (subject9 == null || (shortTVFirstEp = subject9.getShortTVFirstEp()) == null || (video = shortTVFirstEp.getVideo()) == null || (videoAddress = video.getVideoAddress()) == null) {
            return;
        }
        m74840E(this, videoAddress.getWidth(), videoAddress.getHeight(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public static final void m74837B(ShortTvImmVideoItemView shortTvImmVideoItemView, Ref.ObjectRef objectRef, View view) {
        ShortTvPlayListViewModel shortTvPlayListViewModel;
        C16904k c16904k = C16904k.f56790a;
        Subject subject = shortTvImmVideoItemView.data;
        String subjectId = subject != null ? subject.getSubjectId() : null;
        Subject subject2 = shortTvImmVideoItemView.data;
        C16904k.m73728d(c16904k, subjectId, subject2 != null ? subject2.getOps() : null, "", ((ShortTVFavInfo) objectRef.element).getHasFavorite(), "shorttv_detail_video", null, 32, null);
        Subject subject3 = shortTvImmVideoItemView.data;
        if (subject3 == null || (shortTvPlayListViewModel = shortTvImmVideoItemView.shortTvPlayListViewModel) == null) {
            return;
        }
        shortTvPlayListViewModel.m73589d(subject3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final Unit m74838C(ShortTvImmVideoItemView shortTvImmVideoItemView, C28673c value) {
        String favoriteNum;
        ShortTVFavInfo shortTVFavInfo;
        ShortTVFavInfo shortTVFavInfo2;
        Intrinsics.m97802h(value, "value");
        try {
            String strM110505c = value.m110505c();
            Subject subject = shortTvImmVideoItemView.data;
            if (!Intrinsics.m97797c(strM110505c, subject != null ? subject.getSubjectId() : null)) {
                return Unit.f75682a;
            }
            Subject subject2 = shortTvImmVideoItemView.data;
            if (subject2 != null && (shortTVFavInfo2 = subject2.getShortTVFavInfo()) != null) {
                shortTVFavInfo2.update(value);
            }
            AppCompatTextView appCompatTextView = shortTvImmVideoItemView.viewBinding.f86487r;
            Subject subject3 = shortTvImmVideoItemView.data;
            if (subject3 == null || (shortTVFavInfo = subject3.getShortTVFavInfo()) == null || (favoriteNum = shortTVFavInfo.getFavoriteNum()) == null) {
                favoriteNum = "0";
            }
            appCompatTextView.setText(AbstractC14564j.m65680a(Long.parseLong(favoriteNum)));
            shortTvImmVideoItemView.viewBinding.f86487r.setSelected(value.m110503a());
            return Unit.f75682a;
        } catch (Exception unused) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail", false, 2, null);
        }
    }

    /* JADX INFO: renamed from: D */
    private final void m74839D(Integer w11, Integer h11, Integer rootHeight) {
        int iM27489e;
        if (w11 == null || rootHeight == null || h11 == null || w11.intValue() == 0) {
            return;
        }
        FrameLayout flContainer = this.viewBinding.f86473d;
        Intrinsics.m97801g(flContainer, "flContainer");
        ViewGroup.LayoutParams layoutParams = flContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
        int iIntValue = (h11.intValue() * AbstractC5806y.m27489e()) / w11.intValue();
        if (RangesKt.m97949s(1, iIntValue).m97911o(rootHeight.intValue())) {
            iM27489e = (rootHeight.intValue() * w11.intValue()) / h11.intValue();
            iIntValue = rootHeight.intValue();
        } else {
            iM27489e = AbstractC5806y.m27489e();
        }
        if (iM27489e != ((ViewGroup.MarginLayoutParams) c2308b).width || iIntValue != ((ViewGroup.MarginLayoutParams) c2308b).height) {
            ((ViewGroup.MarginLayoutParams) c2308b).width = iM27489e;
            ((ViewGroup.MarginLayoutParams) c2308b).height = iIntValue;
        }
        flContainer.setLayoutParams(c2308b);
    }

    /* JADX INFO: renamed from: E */
    static /* synthetic */ void m74840E(ShortTvImmVideoItemView shortTvImmVideoItemView, Integer num, Integer num2, Integer num3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            ViewGroup viewGroup = (ViewGroup) shortTvImmVideoItemView.viewBinding.getRoot().getParent();
            num3 = viewGroup != null ? Integer.valueOf(viewGroup.getHeight()) : null;
        }
        shortTvImmVideoItemView.m74839D(num, num2, num3);
    }

    /* JADX INFO: renamed from: F */
    private final void m74841F(Subject item) {
        Media video;
        Cover cover;
        String url;
        Fragment fragment;
        FragmentActivity activity;
        Media video2;
        Cover cover2;
        if (!item.getBuiltIn()) {
            ShortTVItem shortTVFirstEp = item.getShortTVFirstEp();
            if (shortTVFirstEp == null || (video = shortTVFirstEp.getVideo()) == null || (cover = video.getCover()) == null || (url = cover.getUrl()) == null || (fragment = this.fragment) == null || (activity = fragment.getActivity()) == null || activity.isFinishing()) {
                return;
            }
            Glide.with(activity).load2(C23860f.a.m94447e(C23860f.f72909a, url, C26035b.f79529e.m102098a(), false, false, 12, null)).into(this.viewBinding.f86475f);
            return;
        }
        String url2 = null;
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new ShortTvImmVideoItemView$updateVideoInfo$1(item, this, null), 3, null);
        C26866a.a aVar = C26866a.f81698a;
        String str = this.TAG;
        ShortTVItem shortTVFirstEp2 = item.getShortTVFirstEp();
        if (shortTVFirstEp2 != null && (video2 = shortTVFirstEp2.getVideo()) != null && (cover2 = video2.getCover()) != null) {
            url2 = cover2.getUrl();
        }
        C26866a.a.m104898f(aVar, str, "set info - cover = " + url2, false, 4, null);
    }

    private final InterfaceC23704a getLoginApi() {
        return (InterfaceC23704a) this.loginApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX INFO: renamed from: n */
    public final void m74848n(String type) {
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
    /* JADX INFO: renamed from: o */
    public final void m74849o(String id2) {
        C3187b0 c3187b0M75168o;
        C26866a.a.m104905r(C26866a.f81698a, this.TAG, new String[]{"finishAfterReport, position = " + this.position}, false, 4, null);
        C17535x c17535x = this.videoDetailModel;
        if (c17535x == null || (c3187b0M75168o = c17535x.m75168o()) == null) {
            return;
        }
        c3187b0M75168o.mo14858q(this.position);
    }

    /* JADX INFO: renamed from: p */
    private final void m74850p(Context context) {
        this.gestureDetector = new GestureDetector(context, new C17338c());
        m74851q();
    }

    /* JADX INFO: renamed from: q */
    private final void m74851q() {
        new C14582f(getContext(), this.viewBinding.f86493x).m65768s(new C17339d());
        this.viewBinding.f86484o.setOnTouchListener(new View.OnTouchListener() { // from class: com.transsion.postdetail.ui.view.d2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ShortTvImmVideoItemView.m74852r(view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final boolean m74852r(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final InterfaceC23704a m74853s() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setContentVisibility(boolean visible) {
        Group groupContent = this.viewBinding.f86474e;
        Intrinsics.m97801g(groupContent, "groupContent");
        groupContent.setVisibility(visible ? 0 : 8);
    }

    public static /* synthetic */ void setData$default(ShortTvImmVideoItemView shortTvImmVideoItemView, Subject subject, Fragment fragment, Integer num, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            z11 = false;
        }
        shortTvImmVideoItemView.setData(subject, fragment, num, str, str2, z11);
    }

    private final void setLoading(boolean show) {
        C26866a.a.m104901l(C26866a.f81698a, "yy", "setLoading:" + show + "  " + this, false, 4, null);
        if (show) {
            ClipLoading clLoading = this.viewBinding.f86472c;
            Intrinsics.m97801g(clLoading, "clLoading");
            AbstractC26006c.m102058k(clLoading);
            ProgressBar progressBar = this.viewBinding.f86482m;
            Intrinsics.m97801g(progressBar, "progressBar");
            AbstractC26006c.m102054g(progressBar);
            this.viewBinding.f86472c.start();
            return;
        }
        ProgressBar progressBar2 = this.viewBinding.f86482m;
        Intrinsics.m97801g(progressBar2, "progressBar");
        AbstractC26006c.m102058k(progressBar2);
        ClipLoading clLoading2 = this.viewBinding.f86472c;
        Intrinsics.m97801g(clLoading2, "clLoading");
        AbstractC26006c.m102054g(clLoading2);
        this.viewBinding.f86472c.stop();
    }

    /* JADX INFO: renamed from: t */
    private final void m74854t(long progress) {
        if (Intrinsics.m97797c(this.videoLoadMore, Boolean.TRUE)) {
            ShortTvImmVideoHelper.C16767a c16767a = ShortTvImmVideoHelper.f56366k;
            if (!c16767a.m73053a().m73048s() || progress < 1000) {
                return;
            }
            c16767a.m73053a().m73040A();
            ImmVideoGuideView immVideoGuideViewM74605a = ImmVideoGuideView.INSTANCE.m74605a(this);
            immVideoGuideViewM74605a.postDelayed(new Runnable() { // from class: com.transsion.postdetail.ui.view.c2
                @Override // java.lang.Runnable
                public final void run() {
                    ShortTvImmVideoItemView.m74855u(this.f57731a);
                }
            }, 5000L);
            this.guideView = immVideoGuideViewM74605a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m74855u(ShortTvImmVideoItemView shortTvImmVideoItemView) {
        ImmVideoGuideView immVideoGuideView = shortTvImmVideoItemView.guideView;
        if (immVideoGuideView != null) {
            immVideoGuideView.removeGuide();
        }
    }

    /* JADX INFO: renamed from: v */
    private final void m74856v(View view) {
        Fragment fragment;
        FragmentManager childFragmentManager;
        ShareDialogFragment shareDialogFragment;
        if (C14557c.f51100a.m65671a(view.getId(), 500L)) {
            return;
        }
        if (this.mShareDialog == null) {
            InterfaceC23704a loginApi = getLoginApi();
            if (loginApi != null) {
                loginApi.mo90386h();
            }
            ShareDialogFragment.Companion companion = ShareDialogFragment.INSTANCE;
            PostType postType = PostType.SHORT_TV_TYPE;
            Subject subject = this.data;
            String subjectId = subject != null ? subject.getSubjectId() : null;
            String value = ReportType.SUBJECT.getValue();
            Subject subject2 = this.data;
            String title = subject2 != null ? subject2.getTitle() : null;
            Subject subject3 = this.data;
            ShareDialogFragment shareDialogFragmentM78645a = companion.m78645a(postType, subjectId, "", value, title, "", false, false, false, "postdetail", subject3 != null ? subject3.getOps() : null, view.getContext().getString(R$string.save_video));
            this.mShareDialog = shareDialogFragmentM78645a;
            if (shareDialogFragmentM78645a != null) {
                shareDialogFragmentM78645a.m78642G0(new C17340e());
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
    /* JADX INFO: renamed from: w */
    public final void m74857w() {
        ClipLoading clLoading = this.viewBinding.f86472c;
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
    /* JADX INFO: renamed from: x */
    public static final void m74858x(ShortTvImmVideoItemView shortTvImmVideoItemView) {
        InterfaceC16634g interfaceC16634g;
        Fragment fragment = shortTvImmVideoItemView.fragment;
        if (fragment == null || !fragment.isVisible() || (interfaceC16634g = shortTvImmVideoItemView.orPlayer) == null) {
            return;
        }
        interfaceC16634g.play();
    }

    /* JADX INFO: renamed from: y */
    private static final C17535x m74859y(Lazy lazy) {
        return (C17535x) lazy.getValue();
    }

    /* JADX INFO: renamed from: z */
    private static final ShortTvPlayListViewModel m74860z(Lazy lazy) {
        return (ShortTvPlayListViewModel) lazy.getValue();
    }

    public final void addVideoView(View view, Video video, int maxHeight) {
        if (view == null) {
            return;
        }
        this.viewBinding.f86473d.addView(view, new FrameLayout.LayoutParams(-1, -1));
        if (video != null) {
            m74839D(video.getWidth(), video.getHeight(), Integer.valueOf(maxHeight));
        }
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
        C3187b0 c3187b0M73591f;
        C3187b0 c3187b0M73591f2;
        super.onAttachedToWindow();
        Fragment fragment = this.fragment;
        if (fragment == null || (viewLifecycleOwner = fragment.getViewLifecycleOwner()) == null) {
            return;
        }
        C17337b c17337b = this.favoriteResultObserver;
        ShortTvPlayListViewModel shortTvPlayListViewModel = this.shortTvPlayListViewModel;
        c17337b.m74862b((shortTvPlayListViewModel == null || (c3187b0M73591f2 = shortTvPlayListViewModel.m73591f()) == null) ? null : (String) c3187b0M73591f2.m14847f());
        ShortTvPlayListViewModel shortTvPlayListViewModel2 = this.shortTvPlayListViewModel;
        if (shortTvPlayListViewModel2 == null || (c3187b0M73591f = shortTvPlayListViewModel2.m73591f()) == null) {
            return;
        }
        c3187b0M73591f.m14851j(viewLifecycleOwner, this.favoriteResultObserver);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onBufferedPosition(long j11, C23403e c23403e) {
        InterfaceC16633f.a.m72426d(this, j11, c23403e);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        Integer numValueOf = v11 != null ? Integer.valueOf(v11.getId()) : null;
        int i11 = R$id.iv_share;
        if (numValueOf != null && numValueOf.intValue() == i11) {
            m74856v(v11);
            return;
        }
        int i12 = R$id.tv_short_tv_ep;
        if (numValueOf != null && numValueOf.intValue() == i12) {
            Fragment fragment = this.fragment;
            if (fragment != null) {
                fragment.getContext();
                return;
            }
            return;
        }
        int i13 = R$id.iv_download;
        if (numValueOf == null || numValueOf.intValue() != i13) {
            int i14 = R$id.iv_short_cover;
            if (numValueOf == null || numValueOf.intValue() != i14) {
                int i15 = R$id.tv_title;
                if (numValueOf == null || numValueOf.intValue() != i15) {
                    int i16 = R$id.tv_desc;
                    if (numValueOf == null || numValueOf.intValue() != i16) {
                        return;
                    }
                }
            }
        }
        DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
        Context context = getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        Subject subject = this.data;
        downloadManagerApiM87093a.m87086d0(fragmentActivity, "shorttv_detail_video", (384 & 4) != 0 ? "" : "", subject != null ? subject.getOps() : null, (384 & 16) != 0 ? null : "download_subject", (384 & 32) != 0 ? false : v11.getId() == R$id.iv_download, (384 & 64) != 0 ? null : this.data, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? Boolean.FALSE : Boolean.valueOf(v11.getId() != R$id.iv_download));
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onCompletion(C23403e mediaSource) {
        Fragment fragment;
        Subject subject;
        ShortTVItem shortTVFirstEp;
        C26866a.a.m104905r(C26866a.f81698a, this.TAG, new String[]{"player- onCompletion"}, false, 4, null);
        Subject subject2 = this.data;
        if (subject2 != null) {
            Integer subjectType = subject2.getSubjectType();
            int value = SubjectType.SHORT_TV.getValue();
            if (subjectType == null || subjectType.intValue() != value || (fragment = this.fragment) == null || fragment.getContext() == null || (subject = this.data) == null || subject.getDeleted()) {
                return;
            }
            C16781b c16781b = this.dotLayer;
            if (c16781b != null) {
                c16781b.m73124d(false);
            }
            Trailer trailer = subject.getTrailer();
            if ((trailer != null ? trailer.getVideoAddress() : null) == null && (shortTVFirstEp = subject.getShortTVFirstEp()) != null) {
                shortTVFirstEp.getEp();
            }
            InterfaceC16634g interfaceC16634g = this.orPlayer;
            if (interfaceC16634g != null) {
                interfaceC16634g.seekTo(0L);
            }
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
        if (shortTvPlayListViewModel2 == null || (c3187b0M73591f = shortTvPlayListViewModel2.m73591f()) == null) {
            return;
        }
        c3187b0M73591f.mo14856o(this.favoriteResultObserver);
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
    public void onMediaItemTransition(String uuid) {
        Fragment fragment;
        Subject subject;
        ShortTVItem shortTVFirstEp;
        InterfaceC16633f.a.m72438p(this, uuid);
        Subject subject2 = this.data;
        if (subject2 != null) {
            Integer subjectType = subject2.getSubjectType();
            int value = SubjectType.SHORT_TV.getValue();
            if (subjectType == null || subjectType.intValue() != value || (fragment = this.fragment) == null || fragment.getContext() == null || (subject = this.data) == null) {
                return;
            }
            C16781b c16781b = this.dotLayer;
            if (c16781b != null) {
                c16781b.m73124d(false);
            }
            Trailer trailer = subject.getTrailer();
            if ((trailer != null ? trailer.getVideoAddress() : null) == null && (shortTVFirstEp = subject.getShortTVFirstEp()) != null) {
                shortTVFirstEp.getEp();
            }
            InterfaceC16634g interfaceC16634g = this.orPlayer;
            if (interfaceC16634g != null) {
                interfaceC16634g.pause();
            }
        }
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
        String strM72987a;
        InterfaceC16634g interfaceC16634g;
        ShortTVItem shortTVFirstEp;
        Media video;
        Video videoAddress;
        String url;
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "player- onPlayerReset", false, 4, null);
        this.isPrepare = false;
        this.isPageRelease = true;
        this.isSeekToFinish.set(true);
        this.nextSeekTo = 0L;
        setKeepScreenOn(false);
        this.isClickPause = false;
        C16781b c16781b = this.dotLayer;
        if (c16781b != null) {
            C16781b.m73117e(c16781b, false, 1, null);
        }
        Subject subject = this.data;
        if (subject != null && (shortTVFirstEp = subject.getShortTVFirstEp()) != null && (video = shortTVFirstEp.getVideo()) != null && (videoAddress = video.getVideoAddress()) != null && (url = videoAddress.getUrl()) != null) {
        }
        InterfaceC16634g interfaceC16634g2 = this.orPlayer;
        if (interfaceC16634g2 != null) {
            interfaceC16634g2.removePlayerListener(this);
        }
        Subject subject2 = this.data;
        if (subject2 != null && subject2.getDeleted() && (strM72987a = C16765a.f56350o.m72987a(subject2)) != null && (interfaceC16634g = this.orPlayer) != null) {
            ShortTVItem shortTVFirstEp2 = subject2.getShortTVFirstEp();
            interfaceC16634g.removeDataSource(new C23403e(shortTVFirstEp2 != null ? shortTVFirstEp2.getId() : null, strM72987a, 0, null, null, 24, null));
        }
        AppCompatImageView ivCover = this.viewBinding.f86475f;
        Intrinsics.m97801g(ivCover, "ivCover");
        AbstractC26006c.m102058k(ivCover);
        AppCompatImageView ivPause = this.viewBinding.f86477h;
        Intrinsics.m97801g(ivPause, "ivPause");
        AbstractC26006c.m102054g(ivPause);
        AppCompatSeekBar seekBar = this.viewBinding.f86484o;
        Intrinsics.m97801g(seekBar, "seekBar");
        AbstractC26006c.m102054g(seekBar);
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
        ShortTVItem shortTVFirstEp;
        Media video;
        Video videoAddress;
        String url;
        if (this.isPrepare) {
            return;
        }
        this.isPrepare = true;
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        int duration = interfaceC16634g != null ? (int) interfaceC16634g.getDuration() : 0;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104899g(aVar, "shorttv.here.duration: " + duration, false, 2, null);
        this.viewBinding.f86482m.setMax(duration);
        this.viewBinding.f86484o.setMax(duration);
        Subject subject = this.data;
        if (subject != null && (shortTVFirstEp = subject.getShortTVFirstEp()) != null && (video = shortTVFirstEp.getVideo()) != null && (videoAddress = video.getVideoAddress()) != null && (url = videoAddress.getUrl()) != null) {
            Long l11 = (Long) ShortTvImmVideoHelper.f56366k.m73053a().m73046o().get(url);
            long jLongValue = l11 != null ? l11.longValue() : 0L;
            C26866a.a.m104898f(aVar, this.TAG, "player- onPrepare, duration = " + this.viewBinding.f86482m.getMax() + ", progress = " + jLongValue, false, 4, null);
            if (jLongValue >= 0) {
                this.currentSaveProgress = jLongValue;
                int i11 = (int) jLongValue;
                this.viewBinding.f86482m.setProgress(i11);
                this.viewBinding.f86484o.setProgress(i11);
                InterfaceC16634g interfaceC16634g2 = this.orPlayer;
                if (interfaceC16634g2 != null) {
                    interfaceC16634g2.seekTo(jLongValue);
                }
            }
        }
        if (!this.isClickPause && !this.isPageHide && (fragment = this.fragment) != null && fragment.isVisible()) {
            C26866a.a.m104898f(aVar, this.TAG, "player- onPrepare， play~", false, 4, null);
            InterfaceC16634g interfaceC16634g3 = this.orPlayer;
            if (interfaceC16634g3 != null) {
                interfaceC16634g3.play();
            }
        }
        setKeepScreenOn(true);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onProgress(long progress, C23403e mediaSource) {
        ShortTVItem shortTVFirstEp;
        if (this.isSeekToFinish.get() && !this.isHorizontalDragging) {
            if (C22762b.f69089a.m90696b() && mediaSource != null) {
                String strM92929e = mediaSource.m92929e();
                Subject subject = this.data;
                if (!Intrinsics.m97797c(strM92929e, (subject == null || (shortTVFirstEp = subject.getShortTVFirstEp()) == null) ? null : shortTVFirstEp.getId())) {
                    C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onProgress- vid 不同, return", false, 4, null);
                    return;
                }
            }
            C16781b c16781b = this.dotLayer;
            if (c16781b != null) {
                c16781b.m73130l(progress);
            }
            int i11 = (int) progress;
            this.viewBinding.f86482m.setProgress(i11);
            this.viewBinding.f86484o.setProgress(i11);
            m74854t(progress);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onRenderFirstFrame() {
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "player- onRenderFirstFrame", false, 4, null);
        AppCompatImageView ivCover = this.viewBinding.f86475f;
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
        ShortTVItem shortTVFirstEp;
        Media video;
        Video videoAddress;
        String url;
        Lifecycle lifecycle;
        Intrinsics.m97802h(source, "source");
        Intrinsics.m97802h(event, "event");
        int i11 = C17336a.f57704a[event.ordinal()];
        if (i11 == 1) {
            this.isPageHide = true;
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "player- onPause", false, 4, null);
            InterfaceC16634g interfaceC16634g = this.orPlayer;
            if (interfaceC16634g != null) {
                interfaceC16634g.pause();
                return;
            }
            return;
        }
        if (i11 == 2) {
            this.isPageHide = false;
            if (this.isClickPause) {
                return;
            }
            Fragment fragment = this.fragment;
            if (fragment != null && !fragment.isVisible()) {
                post(new Runnable() { // from class: com.transsion.postdetail.ui.view.a2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ShortTvImmVideoItemView.m74858x(this.f57725a);
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
            Subject subject = this.data;
            if (subject == null || (shortTVFirstEp = subject.getShortTVFirstEp()) == null || (video = shortTVFirstEp.getVideo()) == null || (videoAddress = video.getVideoAddress()) == null || (url = videoAddress.getUrl()) == null) {
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
        AppCompatImageView ivPause = this.viewBinding.f86477h;
        Intrinsics.m97801g(ivPause, "ivPause");
        AbstractC26006c.m102058k(ivPause);
        AppCompatSeekBar seekBar = this.viewBinding.f86484o;
        Intrinsics.m97801g(seekBar, "seekBar");
        AbstractC26006c.m102058k(seekBar);
        ProgressBar progressBar = this.viewBinding.f86482m;
        Intrinsics.m97801g(progressBar, "progressBar");
        AbstractC26006c.m102054g(progressBar);
        C16781b c16781b = this.dotLayer;
        if (c16781b != null) {
            c16781b.m73132n();
        }
        setKeepScreenOn(false);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoSizeChanged(int width, int height) {
        InterfaceC16633f.a.m72419H(this, width, height);
        m74840E(this, Integer.valueOf(width), Integer.valueOf(height), null, 4, null);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoStart(C23403e mediaSource) {
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "player- onVideoStart", false, 4, null);
        C16781b c16781b = this.dotLayer;
        if (c16781b != null) {
            c16781b.m73133o();
        }
        AppCompatImageView ivPause = this.viewBinding.f86477h;
        Intrinsics.m97801g(ivPause, "ivPause");
        AbstractC26006c.m102054g(ivPause);
        AppCompatSeekBar seekBar = this.viewBinding.f86484o;
        Intrinsics.m97801g(seekBar, "seekBar");
        AbstractC26006c.m102054g(seekBar);
        setLoading(false);
        setKeepScreenOn(true);
    }

    public final void setData(Subject item, final Fragment fragment, Integer position, String basePostId, String baseItemType, boolean attachToMain) {
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(fragment, "fragment");
        C16781b c16781b = new C16781b();
        this.dotLayer = c16781b;
        c16781b.m73136s(basePostId);
        C16781b c16781b2 = this.dotLayer;
        if (c16781b2 != null) {
            c16781b2.m73135r(baseItemType);
        }
        C16781b c16781b3 = this.dotLayer;
        if (c16781b3 != null) {
            c16781b3.m73142y(SubjectType.SHORT_TV.getValue());
        }
        PostSubjectItem postSubjectItem = new PostSubjectItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, false, false, false, null, -1, 1, null);
        postSubjectItem.setSubject(item);
        postSubjectItem.setOps(item.getOps());
        postSubjectItem.setItemType("7");
        C16781b c16781b4 = this.dotLayer;
        if (c16781b4 != null) {
            c16781b4.m73141x("", postSubjectItem);
        }
        this.fragment = fragment;
        this.videoLoadMore = this.videoLoadMore;
        this.basePostId = basePostId;
        this.position = position;
        this.attachToMain = attachToMain;
        fragment.getLifecycle().mo14832a(this);
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.postdetail.ui.view.ShortTvImmVideoItemView$setData$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return fragment;
            }
        };
        this.videoDetailModel = m74859y(FragmentViewModelLazyKt.m14626a(fragment, Reflection.m97823b(C17535x.class), new Function0<C3231x0>() { // from class: com.transsion.postdetail.ui.view.ShortTvImmVideoItemView$setData$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.postdetail.ui.view.ShortTvImmVideoItemView$setData$$inlined$viewModels$default$3
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
        final Function0<Fragment> function1 = new Function0<Fragment>() { // from class: com.transsion.postdetail.ui.view.ShortTvImmVideoItemView$setData$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return fragment;
            }
        };
        this.shortTvPlayListViewModel = m74860z(FragmentViewModelLazyKt.m14626a(fragment, Reflection.m97823b(ShortTvPlayListViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.postdetail.ui.view.ShortTvImmVideoItemView$setData$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function1.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.postdetail.ui.view.ShortTvImmVideoItemView$setData$$inlined$viewModels$default$6
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
        this.data = item;
        m74841F(item);
        if (attachToMain) {
            ViewGroup.LayoutParams layoutParams = this.viewBinding.f86483n.getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.C2308b) {
                ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.C2308b) layoutParams)).bottomMargin = AbstractC5776a0.m27313a(16.0f);
            }
        }
        m74836A();
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

    public final void videoStartPrepare(String pageFrom) {
        Intrinsics.m97802h(pageFrom, "pageFrom");
        this.pageFrom = pageFrom;
        C16781b c16781b = this.dotLayer;
        if (c16781b != null) {
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
