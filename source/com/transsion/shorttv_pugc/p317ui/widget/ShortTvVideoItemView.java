package com.transsion.shorttv_pugc.p317ui.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3218r;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.Lifecycle;
import androidx.p1004lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.AbstractC5790i;
import com.blankj.utilcode.util.AbstractC5806y;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cloud.tmc.integration.event.EventConstants;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.PlayError;
import com.transsion.player.orplayer.global.TnPlayerType;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.push.PushConstants;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv_pugc.ShorttvModel;
import com.transsion.shorttv_pugc.base.pager.PagerLayoutManager;
import com.transsion.shorttv_pugc.base.widget.C19254e;
import com.transsion.shorttv_pugc.base.widget.C19263k;
import com.transsion.shorttv_pugc.base.widget.TnTextView;
import com.transsion.shorttv_pugc.base.widget.expand.ExpandView;
import com.transsion.shorttv_pugc.bean.Cover;
import com.transsion.shorttv_pugc.bean.ShortTvInnerPlayBean;
import com.transsion.shorttv_pugc.bean.Video;
import com.transsion.shorttv_pugc.p317ui.adapter.C19333p;
import com.transsion.shorttv_pugc.p317ui.fragment.ShortTvDetailListFragment;
import com.transsion.shorttv_pugc.utils.AbstractC19531j;
import com.transsion.shorttv_pugc.utils.ShortTvExtKt;
import com.transsion.shorttv_pugc.viewmodel.ShortTvViewModel;
import com.transsion.subtitle_download.InterfaceC19743a;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import cu.C22778a;
import fo.C23403e;
import ht.AbstractC23896b;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import p558kt.C25429b;
import p623nt.AbstractC26104e;
import p623nt.C26102c;
import p683po.C26906c;
import p683po.C26907d;
import p743rh.C27287m;
import p765s6.InterfaceC27566d;
import p920xt.InterfaceC28658c;
import p920xt.InterfaceC28660e;
import p920xt.InterfaceC28663h;
import p990zt.C29243a;
import p990zt.C29245c;
import pg.C26866a;
import rs.C27347j0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B!\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000fB\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0013JU\u0010!\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J-\u0010'\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b'\u0010(J-\u0010)\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b)\u0010(J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00112\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010<\u001a\u00020;2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010E\u001a\u00020\u00112\u0006\u0010C\u001a\u00020B2\u0006\u0010?\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0011H\u0016¢\u0006\u0004\bG\u0010\u0013J\r\u0010H\u001a\u00020\u0011¢\u0006\u0004\bH\u0010\u0013J\u000f\u0010I\u001a\u00020\u0011H\u0016¢\u0006\u0004\bI\u0010\u0013J\u0015\u0010K\u001a\u00020\u00112\u0006\u0010J\u001a\u00020\u001c¢\u0006\u0004\bK\u0010LJ\u0015\u0010N\u001a\u00020\u00112\u0006\u0010M\u001a\u00020\u001c¢\u0006\u0004\bN\u0010LJ\u000f\u0010O\u001a\u00020\u0011H\u0016¢\u0006\u0004\bO\u0010\u0013J\u000f\u0010P\u001a\u00020\u0011H\u0016¢\u0006\u0004\bP\u0010\u0013J\u0019\u0010S\u001a\u00020\u00112\b\u0010R\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bS\u0010TJ\u0019\u0010U\u001a\u00020\u00112\b\u0010R\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bU\u0010TJ\u0019\u0010V\u001a\u00020\u00112\b\u0010R\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bV\u0010TJ!\u0010Y\u001a\u00020\u00112\u0006\u0010X\u001a\u00020W2\b\u0010R\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bY\u0010ZJ\u0019\u0010[\u001a\u00020\u00112\b\u0010R\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\b[\u0010TJ\u0019\u0010\\\u001a\u00020\u00112\b\u0010R\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\b\\\u0010TJ!\u0010_\u001a\u00020\u00112\u0006\u0010^\u001a\u00020]2\b\u0010R\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\u0011H\u0016¢\u0006\u0004\ba\u0010\u0013J\u0019\u0010b\u001a\u00020\u00112\b\u0010R\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bb\u0010TJ\u0019\u0010e\u001a\u00020\u00112\b\u0010d\u001a\u0004\u0018\u00010cH\u0016¢\u0006\u0004\be\u0010fJ\r\u0010g\u001a\u00020\u0011¢\u0006\u0004\bg\u0010\u0013J\u000f\u0010h\u001a\u00020WH\u0016¢\u0006\u0004\bh\u0010iJ\r\u0010j\u001a\u00020\u0011¢\u0006\u0004\bj\u0010\u0013J\u000f\u0010k\u001a\u00020\u0011H\u0016¢\u0006\u0004\bk\u0010\u0013J\u000f\u0010l\u001a\u00020\u0011H\u0016¢\u0006\u0004\bl\u0010\u0013J\u001f\u0010o\u001a\u00020\u00112\u0006\u0010X\u001a\u00020\u000b2\u0006\u0010n\u001a\u00020mH\u0016¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020\u00112\u0006\u0010n\u001a\u00020mH\u0016¢\u0006\u0004\bq\u0010rJ#\u0010w\u001a\u00020\u00112\n\u0010u\u001a\u00060sj\u0002`t2\u0006\u0010v\u001a\u00020mH\u0016¢\u0006\u0004\bw\u0010xJ\u000f\u0010y\u001a\u00020\u0011H\u0002¢\u0006\u0004\by\u0010\u0013J\u000f\u0010z\u001a\u00020\u0011H\u0002¢\u0006\u0004\bz\u0010\u0013J\u000f\u0010{\u001a\u00020\u0011H\u0002¢\u0006\u0004\b{\u0010\u0013J\u000f\u0010|\u001a\u00020\u0011H\u0002¢\u0006\u0004\b|\u0010\u0013J\u001b\u0010~\u001a\u00020\u00112\n\b\u0002\u0010}\u001a\u0004\u0018\u00010WH\u0002¢\u0006\u0004\b~\u0010\u007fJ\u0011\u0010\u0080\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0080\u0001\u0010\u0013J\u0011\u0010\u0081\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0081\u0001\u0010\u0013J\u001b\u0010\u0083\u0001\u001a\u00020\u00112\u0007\u0010\u0082\u0001\u001a\u00020\u001aH\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0019\u0010\u0085\u0001\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0005\b\u0085\u0001\u0010\u000fJ(\u0010\u0088\u0001\u001a\u00020\u00112\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u000b2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J$\u0010\u008c\u0001\u001a\u00020\u00112\u0007\u0010\u008a\u0001\u001a\u00020\u001c2\u0007\u0010\u008b\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001b\u0010\u008e\u0001\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0005\b\u008e\u0001\u00101J\u001a\u0010\u008f\u0001\u001a\u00020\u00112\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001b\u0010\u0092\u0001\u001a\u00020\u00112\u0007\u0010\u0091\u0001\u001a\u00020WH\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0090\u0001J\u0011\u0010\u0093\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0093\u0001\u0010\u0013J\u0011\u0010\u0094\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0094\u0001\u0010\u0013J\u0011\u0010\u0095\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0095\u0001\u0010\u0013J\u0011\u0010\u0096\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0096\u0001\u0010\u0013J\u001b\u0010\u0097\u0001\u001a\u00020\u00112\u0007\u0010\u0082\u0001\u001a\u00020\u001aH\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0084\u0001J\"\u0010\u009a\u0001\u001a\u00020\u00112\u000e\u0010\u0099\u0001\u001a\t\u0012\u0004\u0012\u00020\u00110\u0098\u0001H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0011\u0010\u009c\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u009c\u0001\u0010\u0013J\u0011\u0010\u009d\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u009d\u0001\u0010\u0013J\u0011\u0010\u009e\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u009e\u0001\u0010\u0013J\u0011\u0010\u0086\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0086\u0001\u0010\u0013J\u0011\u0010\u009f\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u009f\u0001\u0010\u0013J$\u0010d\u001a\u00020\u00112\u0006\u0010&\u001a\u00020%2\n\u0010¡\u0001\u001a\u0005\u0018\u00010 \u0001H\u0002¢\u0006\u0005\bd\u0010¢\u0001J\u0011\u0010£\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b£\u0001\u0010\u0013R\u0017\u0010¦\u0001\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0017\u0010©\u0001\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010\u00ad\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001b\u0010°\u0001\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bu\u0010±\u0001R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010¥\u0001R\u001a\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u001a\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u001a\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u001c\u0010¿\u0001\u001a\u0005\u0018\u00010¼\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u001c\u0010Ã\u0001\u001a\u0005\u0018\u00010À\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u0019\u0010Å\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010\u0081\u0001R\u0019\u0010Ç\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010\u0081\u0001R\u0019\u0010É\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010\u0081\u0001R\u0019\u0010Ì\u0001\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u0017\u0010Î\u0001\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010¨\u0001R\u0017\u0010Ð\u0001\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010¨\u0001R\u0017\u0010Ò\u0001\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010¨\u0001R\u0017\u0010Ô\u0001\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÓ\u0001\u0010¨\u0001R\u0017\u0010J\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bd\u0010¥\u0001R\u001b\u0010Ö\u0001\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010Õ\u0001R\u001c\u0010Ú\u0001\u001a\u0005\u0018\u00010×\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u001e\u0010Þ\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0Û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R \u0010à\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001a0Û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bß\u0001\u0010Ý\u0001R \u0010â\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001a0Û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bá\u0001\u0010Ý\u0001R \u0010ã\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001a0Û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010Ý\u0001R \u0010ä\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0Û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010Ý\u0001R\u0019\u0010å\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0081\u0001R\u0019\u0010æ\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u0081\u0001R\u001d\u0010ë\u0001\u001a\b0ç\u0001j\u0003`è\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R\u0019\u0010ì\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0081\u0001R\u0018\u0010ð\u0001\u001a\u00030í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u001d\u0010ñ\u0001\u001a\b0ç\u0001j\u0003`è\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010ê\u0001R\u001c\u0010ô\u0001\u001a\u0005\u0018\u00010ò\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010ó\u0001¨\u0006õ\u0001"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/ui/widget/ShortTvVideoItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/transsion/player/orplayer/f;", "Landroid/view/View$OnClickListener;", "Landroidx/lifecycle/r;", "Lcom/transsion/shorttv_pugc/ui/widget/a;", "Lcom/transsion/subtitle_download/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/transsion/shorttv_pugc/ShorttvModel$UGCVideo;", WebConstants.FIELD_ITEM, "Lcom/transsion/shorttv_pugc/ui/fragment/ShortTvDetailListFragment;", "fragment", RequestParameters.POSITION, "", "videoLoadMore", "", "basePostId", "baseItemType", "isPayloads", "fromTrending", "setData", "(Lcom/transsion/shorttv_pugc/ShorttvModel$UGCVideo;Lcom/transsion/shorttv_pugc/ui/fragment/ShortTvDetailListFragment;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;ZZ)V", "Lcom/transsion/player/orplayer/g;", "orPlayer", "Lcom/transsion/player/ui/ORPlayerView;", "orPlayerView", "onPageSelected", "(Lcom/transsion/player/orplayer/g;Lcom/transsion/player/ui/ORPlayerView;Lcom/transsion/shorttv_pugc/ShorttvModel$UGCVideo;)V", "updateShortTvInfo", "onPageRelease", "(I)V", "width", "height", "onVideoSizeChanged", "(II)V", "updateLockState", "(Lcom/transsion/shorttv_pugc/ShorttvModel$UGCVideo;)V", "Lcom/transsion/shorttv_pugc/base/pager/PagerLayoutManager;", "pagerLayoutManager", "setPagerLayoutManager", "(Lcom/transsion/shorttv_pugc/base/pager/PagerLayoutManager;)V", "Landroid/widget/FrameLayout;", "getPlayerContainer", "()Landroid/widget/FrameLayout;", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/transsion/shorttv_pugc/viewmodel/ShortTvViewModel;", "getViewModel", "(Landroidx/fragment/app/FragmentActivity;)Lcom/transsion/shorttv_pugc/viewmodel/ShortTvViewModel;", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroidx/lifecycle/u;", EventConstants.KEY_SOURCE, "Landroidx/lifecycle/Lifecycle$Event;", "onStateChanged", "(Landroidx/lifecycle/u;Landroidx/lifecycle/Lifecycle$Event;)V", "onPlayerReset", "reset", "app2Background", "pageFrom", "videoStartPrepare", "(Ljava/lang/String;)V", "url", "setVideoUrl", "onSetDataSource", "onRenderFirstFrame", "Lfo/e;", "mediaSource", "onVideoStart", "(Lfo/e;)V", "onPrepare", "onVideoPause", "", NotificationCompat.CATEGORY_PROGRESS, "onProgress", "(JLfo/e;)V", "onLoadingBegin", "onLoadingEnd", "Lcom/transsion/player/orplayer/PlayError;", "errorInfo", "onPlayError", "(Lcom/transsion/player/orplayer/PlayError;Lfo/e;)V", "onLoopingStart", "onCompletion", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "showEpisodeListDialog", "getProgress", "()J", "onNetConnect", "onGetDubsInfo", "onAudioTrackChange", "Lcom/transsion/subtitle_download/db/SubtitleDownloadTable;", "stDownloadTable", "onDownloading", "(ILcom/transsion/subtitle_download/db/SubtitleDownloadTable;)V", "onComplete", "(Lcom/transsion/subtitle_download/db/SubtitleDownloadTable;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "dbBean", "onFail", "(Ljava/lang/Exception;Lcom/transsion/subtitle_download/db/SubtitleDownloadTable;)V", "a0", "c0", "b0", "f0", "count", "g0", "(Ljava/lang/Long;)V", "C", "Z", PushConstants.PUSH_SERVICE_TYPE_SHOW, "W", "(Z)V", "D", "w", "h", "h0", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "ep", "ugcVideo", "T", "(Ljava/lang/String;Lcom/transsion/shorttv_pugc/ShorttvModel$UGCVideo;)V", "i0", "d0", "(J)V", "max", "e0", "O", "U", "R", "X", "setLoading", "Lkotlin/Function0;", "block", "S", "(Lkotlin/jvm/functions/Function0;)V", "P", "G", "B", "Y", "Lcom/transsion/shorttv_pugc/bean/Video;", "video", "(Lcom/transsion/player/ui/ORPlayerView;Lcom/transsion/shorttv_pugc/bean/Video;)V", "E", "a", "Ljava/lang/String;", "TAG", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "I", "screenWidth", "Lrs/j0;", "c", "Lrs/j0;", "viewBinding", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/shorttv_pugc/ShorttvModel$UGCVideo;", "data", "Lcom/transsion/shorttv_pugc/ui/fragment/ShortTvDetailListFragment;", "f", "Ljava/lang/Boolean;", "g", "Ljava/lang/Integer;", "i", "Lcom/transsion/player/orplayer/g;", "j", "Lcom/transsion/player/ui/ORPlayerView;", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/shorttv_pugc/base/pager/PagerLayoutManager;", "Landroid/view/GestureDetector;", "l", "Landroid/view/GestureDetector;", "gestureDetector", "Lzt/c;", "m", "Lzt/c;", "dotLayer", "n", "isClickPause", "o", "isHorizontalDragging", TtmlNode.TAG_P, "isPageHide", CampaignEx.JSON_KEY_AD_Q, "J", "currentSaveProgress", CampaignEx.JSON_KEY_AD_R, "resImgLargeWidth", "s", "resImgLargeHeight", "t", "resImgSmallWidth", TmcStartParams.KEY_URL_SHORT, "resImgSmallHeight", "Lcom/transsion/shorttv_pugc/viewmodel/ShortTvViewModel;", "mShortTvViewModel", "Lcu/a;", "x", "Lcu/a;", "mShortTvSubViewModel", "Landroidx/lifecycle/c0;", "y", "Landroidx/lifecycle/c0;", "observer", "z", "favoriteObserver", "A", "likeObserver", "followObserver", "shareObserver", "isFirstFrame", "isPrepare", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "F", "Ljava/lang/Runnable;", "delayToastNetErrRunnable", "isLoading", "Landroid/os/Handler;", "H", "Landroid/os/Handler;", "autoHideRightMenuHandle", "autoHideRightMenuRunnable", "Lcom/transsion/shorttv_pugc/ui/adapter/p;", "Lcom/transsion/shorttv_pugc/ui/adapter/p;", "tagAdapter", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTvVideoItemView extends ConstraintLayout implements InterfaceC16633f, View.OnClickListener, InterfaceC3218r, InterfaceC19486a, InterfaceC19743a {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final InterfaceC3189c0 likeObserver;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final InterfaceC3189c0 followObserver;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final InterfaceC3189c0 shareObserver;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private boolean isFirstFrame;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean isPrepare;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final Runnable delayToastNetErrRunnable;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private boolean isLoading;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final Handler autoHideRightMenuHandle;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final Runnable autoHideRightMenuRunnable;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private C19333p tagAdapter;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int screenWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27347j0 viewBinding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private ShorttvModel.UGCVideo data;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private ShortTvDetailListFragment fragment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Boolean videoLoadMore;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Integer position;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String basePostId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private InterfaceC16634g orPlayer;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private ORPlayerView orPlayerView;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private PagerLayoutManager pagerLayoutManager;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private GestureDetector gestureDetector;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private C29245c dotLayer;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isClickPause;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean isHorizontalDragging;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean isPageHide;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private long currentSaveProgress;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int resImgLargeWidth;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final int resImgLargeHeight;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final int resImgSmallWidth;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final int resImgSmallHeight;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private String pageFrom;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private ShortTvViewModel mShortTvViewModel;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private C22778a mShortTvSubViewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC3189c0 observer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC3189c0 favoriteObserver;

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.widget.ShortTvVideoItemView$a */
    public /* synthetic */ class C19481a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f62389a;

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
            f62389a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.widget.ShortTvVideoItemView$b */
    public static final class C19482b extends GestureDetector.SimpleOnGestureListener {
        C19482b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            ShortTvVideoItemView.this.m81242O();
            return super.onSingleTapUp(e11);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.widget.ShortTvVideoItemView$c */
    public static final class C19483c implements C19254e.a {

        /* JADX INFO: renamed from: a */
        private int f62391a;

        /* JADX INFO: renamed from: b */
        private int f62392b;

        /* JADX INFO: renamed from: c */
        private int f62393c;

        /* JADX INFO: renamed from: d */
        private String f62394d = "";

        /* JADX INFO: renamed from: e */
        private int f62395e = AbstractC5776a0.m27313a(1.5f);

        C19483c() {
        }

        @Override // com.transsion.shorttv_pugc.base.widget.C19254e.a
        /* JADX INFO: renamed from: a */
        public void mo80627a() {
        }

        @Override // com.transsion.shorttv_pugc.base.widget.C19254e.a
        /* JADX INFO: renamed from: b */
        public void mo80628b(float f11, float f12) {
            int i11 = 0;
            if (!ShortTvVideoItemView.this.isHorizontalDragging) {
                PagerLayoutManager pagerLayoutManager = ShortTvVideoItemView.this.pagerLayoutManager;
                if (pagerLayoutManager != null) {
                    pagerLayoutManager.m80576W(false);
                }
                this.f62391a = ShortTvVideoItemView.this.viewBinding.f83208r.getProgress();
                AppCompatSeekBar seekBar = ShortTvVideoItemView.this.viewBinding.f83211u;
                Intrinsics.m97801g(seekBar, "seekBar");
                AbstractC23896b.m94642d(seekBar);
                ProgressBar progressBar = ShortTvVideoItemView.this.viewBinding.f83208r;
                Intrinsics.m97801g(progressBar, "progressBar");
                AbstractC23896b.m94640b(progressBar);
                this.f62393c = ShortTvVideoItemView.this.viewBinding.f83208r.getWidth();
                int max = ShortTvVideoItemView.this.viewBinding.f83208r.getMax();
                this.f62392b = max;
                this.f62394d = AbstractC19531j.m81353a(max);
            }
            ShortTvVideoItemView.this.isHorizontalDragging = true;
            float f13 = f12 - f11;
            int i12 = this.f62392b;
            int i13 = (int) (this.f62391a + ((f13 * i12) / this.f62393c));
            if (i13 >= 0) {
                i11 = i13 > i12 ? i12 : i13;
            }
            ShortTvVideoItemView.this.m81257d0(i11);
        }

        @Override // com.transsion.shorttv_pugc.base.widget.C19254e.a
        /* JADX INFO: renamed from: c */
        public void mo80629c(float f11, float f12) {
        }

        @Override // com.transsion.shorttv_pugc.base.widget.C19254e.a
        /* JADX INFO: renamed from: d */
        public void mo80630d(float f11, float f12) {
        }

        @Override // com.transsion.shorttv_pugc.base.widget.C19254e.a
        /* JADX INFO: renamed from: e */
        public void mo80631e() {
            InterfaceC16634g interfaceC16634g;
            PagerLayoutManager pagerLayoutManager = ShortTvVideoItemView.this.pagerLayoutManager;
            if (pagerLayoutManager != null) {
                pagerLayoutManager.m80576W(true);
            }
            if (ShortTvVideoItemView.this.isHorizontalDragging) {
                ShortTvVideoItemView.this.isHorizontalDragging = false;
                AppCompatSeekBar seekBar = ShortTvVideoItemView.this.viewBinding.f83211u;
                Intrinsics.m97801g(seekBar, "seekBar");
                AbstractC23896b.m94640b(seekBar);
                ProgressBar progressBar = ShortTvVideoItemView.this.viewBinding.f83208r;
                Intrinsics.m97801g(progressBar, "progressBar");
                AbstractC23896b.m94642d(progressBar);
                long progress = ShortTvVideoItemView.this.viewBinding.f83208r.getProgress();
                ShorttvModel.UGCVideo uGCVideo = ShortTvVideoItemView.this.data;
                if ((uGCVideo != null ? uGCVideo.getPlayUrl() : null) == null) {
                    C26866a.a.m104898f(C26866a.f81698a, ShortTvVideoItemView.this.TAG, "数据还没有拉下来，不进行seek", false, 4, null);
                    return;
                }
                InterfaceC16634g interfaceC16634g2 = ShortTvVideoItemView.this.orPlayer;
                if (interfaceC16634g2 != null) {
                    interfaceC16634g2.seekTo(progress);
                }
                InterfaceC16634g interfaceC16634g3 = ShortTvVideoItemView.this.orPlayer;
                if (interfaceC16634g3 != null && !interfaceC16634g3.isPlaying() && (interfaceC16634g = ShortTvVideoItemView.this.orPlayer) != null) {
                    interfaceC16634g.play();
                }
                C29245c c29245c = ShortTvVideoItemView.this.dotLayer;
                if (c29245c != null) {
                    c29245c.m112138h();
                }
            }
        }

        @Override // com.transsion.shorttv_pugc.base.widget.C19254e.a
        public void onDoubleTap(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
        }

        @Override // com.transsion.shorttv_pugc.base.widget.C19254e.a
        public void onLongPress(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.widget.ShortTvVideoItemView$d */
    public static final class C19484d implements ExpandView.InterfaceC19257c {
        C19484d() {
        }

        @Override // com.transsion.shorttv_pugc.base.widget.expand.ExpandView.InterfaceC19257c
        /* JADX INFO: renamed from: a */
        public void mo80645a(ExpandView expandView) {
            ShortTvVideoItemView.this.m81252Y();
        }

        @Override // com.transsion.shorttv_pugc.base.widget.expand.ExpandView.InterfaceC19257c
        /* JADX INFO: renamed from: b */
        public void mo80646b(ExpandView expandView) {
            ShortTvVideoItemView.this.m81278w();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.widget.ShortTvVideoItemView$e */
    public static final class C19485e implements RequestListener {
        C19485e() {
        }

        @Override // com.bumptech.glide.request.RequestListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean onResourceReady(Drawable resource, Object model, Target target, DataSource dataSource, boolean z11) {
            Intrinsics.m97802h(resource, "resource");
            Intrinsics.m97802h(model, "model");
            Intrinsics.m97802h(dataSource, "dataSource");
            C26866a.a.m104898f(C26866a.f81698a, ShortTvVideoItemView.this.TAG, "onResourceReady  " + ShortTvVideoItemView.this, false, 4, null);
            return false;
        }

        @Override // com.bumptech.glide.request.RequestListener
        public boolean onLoadFailed(GlideException glideException, Object obj, Target target, boolean z11) {
            Intrinsics.m97802h(target, "target");
            C26866a.a.m104898f(C26866a.f81698a, ShortTvVideoItemView.this.TAG, "onLoadFailed  " + ShortTvVideoItemView.this, false, 4, null);
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortTvVideoItemView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortTvVideoItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTvVideoItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.TAG = "ShortTvVideoItemView";
        this.screenWidth = AbstractC5806y.m27489e();
        this.pageFrom = "";
        View.inflate(getContext(), R$layout.short_tv_layout_play_detail, this);
        C27347j0 c27347j0M106461a = C27347j0.m106461a(this);
        Intrinsics.m97801g(c27347j0M106461a, "bind(...)");
        this.viewBinding = c27347j0M106461a;
        c27347j0M106461a.f83215y.setText("");
        c27347j0M106461a.f83213w.setPadding(0, AbstractC5781d.m27351c(), 0, 0);
        c27347j0M106461a.f83198h.setOnClickListener(this);
        c27347j0M106461a.f83216z.setOnClickListener(this);
        c27347j0M106461a.f83215y.setOnClickListener(this);
        c27347j0M106461a.f83202l.setOnClickListener(this);
        c27347j0M106461a.f83201k.setOnClickListener(this);
        c27347j0M106461a.f83200j.setOnClickListener(this);
        c27347j0M106461a.f83203m.setOnClickListener(this);
        c27347j0M106461a.f83181B.setOnClickListener(this);
        c27347j0M106461a.f83182C.setOnClickListener(this);
        c27347j0M106461a.f83204n.setOnClickListener(this);
        this.resImgLargeWidth = AbstractC5776a0.m27313a(48.0f);
        this.resImgLargeHeight = AbstractC5776a0.m27313a(64.0f);
        this.resImgSmallWidth = AbstractC5776a0.m27313a(24.0f);
        this.resImgSmallHeight = AbstractC5776a0.m27313a(32.0f);
        m81231D(context);
        this.observer = new InterfaceC3189c0() { // from class: com.transsion.shorttv_pugc.ui.widget.v
            @Override // androidx.p1004lifecycle.InterfaceC3189c0
            public final void onChanged(Object obj) {
                ShortTvVideoItemView.m81237J(this.f62448a, ((Boolean) obj).booleanValue());
            }
        };
        this.favoriteObserver = new InterfaceC3189c0() { // from class: com.transsion.shorttv_pugc.ui.widget.a0
            @Override // androidx.p1004lifecycle.InterfaceC3189c0
            public final void onChanged(Object obj) {
                ShortTvVideoItemView.m81281z(this.f62400a, (Boolean) obj);
            }
        };
        this.likeObserver = new InterfaceC3189c0() { // from class: com.transsion.shorttv_pugc.ui.widget.b0
            @Override // androidx.p1004lifecycle.InterfaceC3189c0
            public final void onChanged(Object obj) {
                ShortTvVideoItemView.m81236I(this.f62402a, (Boolean) obj);
            }
        };
        this.followObserver = new InterfaceC3189c0() { // from class: com.transsion.shorttv_pugc.ui.widget.c0
            @Override // androidx.p1004lifecycle.InterfaceC3189c0
            public final void onChanged(Object obj) {
                ShortTvVideoItemView.m81228A(this.f62404a, (Boolean) obj);
            }
        };
        this.shareObserver = new InterfaceC3189c0() { // from class: com.transsion.shorttv_pugc.ui.widget.d0
            @Override // androidx.p1004lifecycle.InterfaceC3189c0
            public final void onChanged(Object obj) {
                ShortTvVideoItemView.m81249V(this.f62406a, (String) obj);
            }
        };
        this.delayToastNetErrRunnable = new Runnable() { // from class: com.transsion.shorttv_pugc.ui.widget.e0
            @Override // java.lang.Runnable
            public final void run() {
                ShortTvVideoItemView.m81280y(this.f62408a);
            }
        };
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.m97799e(looperMyLooper);
        this.autoHideRightMenuHandle = new Handler(looperMyLooper);
        this.autoHideRightMenuRunnable = new Runnable() { // from class: com.transsion.shorttv_pugc.ui.widget.f0
            @Override // java.lang.Runnable
            public final void run() {
                ShortTvVideoItemView.m81279x(this.f62410a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m81228A(ShortTvVideoItemView shortTvVideoItemView, Boolean bool) {
        shortTvVideoItemView.m81255b0();
    }

    /* JADX INFO: renamed from: B */
    private final void m81229B() {
        this.autoHideRightMenuHandle.removeCallbacks(this.autoHideRightMenuRunnable);
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        if (shortTvViewModel != null) {
            shortTvViewModel.m81428q0(false);
        }
    }

    /* JADX INFO: renamed from: C */
    private final void m81230C() {
        Window window;
        View decorView;
        WindowInsetsController insetsController;
        if (Build.VERSION.SDK_INT < 30) {
            Context context = getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            window = activity != null ? activity.getWindow() : null;
            if (window == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            decorView.setSystemUiVisibility(5894);
            return;
        }
        Context context2 = getContext();
        Activity activity2 = context2 instanceof Activity ? (Activity) context2 : null;
        window = activity2 != null ? activity2.getWindow() : null;
        if (window == null || (insetsController = window.getInsetsController()) == null) {
            return;
        }
        insetsController.hide(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
        insetsController.setSystemBarsBehavior(2);
    }

    /* JADX INFO: renamed from: D */
    private final void m81231D(Context context) {
        this.gestureDetector = new GestureDetector(context, new C19482b());
        m81234G();
    }

    /* JADX INFO: renamed from: E */
    private final void m81232E() {
        final List<ShorttvModel.UGCVideoHasTag> hashTags;
        ShorttvModel.UGCVideo uGCVideo = this.data;
        if (uGCVideo != null && (hashTags = uGCVideo.getHashTags()) != null) {
            final C19333p c19333p = new C19333p(0, 1, null);
            c19333p.mo36201n1(hashTags);
            c19333p.m36227w1(new InterfaceC27566d() { // from class: com.transsion.shorttv_pugc.ui.widget.y
                @Override // p765s6.InterfaceC27566d
                /* JADX INFO: renamed from: a */
                public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                    ShortTvVideoItemView.m81233F(c19333p, hashTags, this, baseQuickAdapter, view, i11);
                }
            });
            this.tagAdapter = c19333p;
        }
        RecyclerView recyclerView = this.viewBinding.f83210t;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(new C19263k(8.0f, 0.0f, 0.0f, 6, null));
        recyclerView.setAdapter(this.tagAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m81233F(C19333p c19333p, List list, ShortTvVideoItemView shortTvVideoItemView, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        ShorttvModel.UGCVideoHasTag uGCVideoHasTag = (ShorttvModel.UGCVideoHasTag) c19333p.getData().get(i11);
        Navigator.m61845x(TheRouter.m61773c("/home/hashtag").m61857K("hashtag", ShortTvExtKt.m81312o(list, uGCVideoHasTag)), c19333p.getContext(), null, 2, null);
        C29243a c29243a = C29243a.f89221a;
        ShortTvViewModel shortTvViewModel = shortTvVideoItemView.mShortTvViewModel;
        c29243a.m112126c(uGCVideoHasTag, i11, shortTvViewModel != null ? shortTvViewModel.m81397I() : null);
    }

    /* JADX INFO: renamed from: G */
    private final void m81234G() {
        new C19254e(getContext(), this.viewBinding.f83188I).m80626r(new C19483c());
        this.viewBinding.f83211u.setOnTouchListener(new View.OnTouchListener() { // from class: com.transsion.shorttv_pugc.ui.widget.z
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ShortTvVideoItemView.m81235H(view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final boolean m81235H(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final void m81236I(ShortTvVideoItemView shortTvVideoItemView, Boolean bool) {
        shortTvVideoItemView.m81256c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final void m81237J(ShortTvVideoItemView shortTvVideoItemView, boolean z11) {
        shortTvVideoItemView.m81250W(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final Unit m81238K(ShortTvVideoItemView shortTvVideoItemView) {
        ShortTvViewModel shortTvViewModel = shortTvVideoItemView.mShortTvViewModel;
        if (shortTvViewModel != null) {
            shortTvViewModel.m81425o(shortTvVideoItemView.data);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final Unit m81239L(ShortTvVideoItemView shortTvVideoItemView) {
        ShortTvViewModel shortTvViewModel = shortTvVideoItemView.mShortTvViewModel;
        if (shortTvViewModel != null) {
            shortTvViewModel.m81410V(shortTvVideoItemView.data);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final Unit m81240M(ShortTvVideoItemView shortTvVideoItemView) {
        ShorttvModel.UGCVideo uGCVideo = shortTvVideoItemView.data;
        ShortTvViewModel shortTvViewModel = shortTvVideoItemView.mShortTvViewModel;
        if (shortTvViewModel != null) {
            shortTvViewModel.m81424n(uGCVideo);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final Unit m81241N(ShortTvVideoItemView shortTvVideoItemView) {
        ShorttvModel.UGCVideoCreator creator;
        ShorttvModel.UGCVideo uGCVideo = shortTvVideoItemView.data;
        if (uGCVideo != null && (creator = uGCVideo.getCreator()) != null) {
            Navigator.m61845x(TheRouter.m61773c("/profile/user_profile").m61857K("userId", creator.getUid()), shortTvVideoItemView.getContext(), null, 2, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public final void m81242O() {
        if (this.isLoading) {
            FrameLayout layoutTvEpisode = this.viewBinding.f83205o;
            Intrinsics.m97801g(layoutTvEpisode, "layoutTvEpisode");
            if (layoutTvEpisode.getVisibility() == 0) {
                m81229B();
                return;
            } else {
                m81252Y();
                return;
            }
        }
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g == null || !interfaceC16634g.isPlaying()) {
            FrameLayout layoutTvEpisode2 = this.viewBinding.f83205o;
            Intrinsics.m97801g(layoutTvEpisode2, "layoutTvEpisode");
            if (layoutTvEpisode2.getVisibility() != 0) {
                m81252Y();
            }
            C29245c c29245c = this.dotLayer;
            if (c29245c != null) {
                c29245c.m112134c();
            }
            m81245R();
            this.isClickPause = false;
            ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
            if (shortTvDetailListFragment != null) {
                shortTvDetailListFragment.m81045P0(false);
                return;
            }
            return;
        }
        FrameLayout layoutTvEpisode3 = this.viewBinding.f83205o;
        Intrinsics.m97801g(layoutTvEpisode3, "layoutTvEpisode");
        if (layoutTvEpisode3.getVisibility() != 0) {
            m81252Y();
            m81278w();
            return;
        }
        this.isClickPause = true;
        ShortTvDetailListFragment shortTvDetailListFragment2 = this.fragment;
        if (shortTvDetailListFragment2 != null) {
            shortTvDetailListFragment2.m81045P0(true);
        }
        C29245c c29245c2 = this.dotLayer;
        if (c29245c2 != null) {
            c29245c2.m112133b();
        }
        InterfaceC16634g interfaceC16634g2 = this.orPlayer;
        if (interfaceC16634g2 != null) {
            interfaceC16634g2.pause();
        }
        m81252Y();
    }

    /* JADX INFO: renamed from: P */
    private final void m81243P() {
        ShortTvViewModel shortTvViewModel;
        InterfaceC28663h interfaceC28663hM81404P;
        String pageName;
        if (this.data == null || (shortTvViewModel = this.mShortTvViewModel) == null || (interfaceC28663hM81404P = shortTvViewModel.m81404P()) == null) {
            return;
        }
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        ShorttvModel.UGCVideo uGCVideo = this.data;
        Intrinsics.m97799e(uGCVideo);
        String ugcVideoId = uGCVideo.getUgcVideoId();
        ShorttvModel.UGCVideo uGCVideo2 = this.data;
        Intrinsics.m97799e(uGCVideo2);
        String title = uGCVideo2.getTitle();
        ShortTvDetailListFragment shortTvDetailListFragment2 = this.fragment;
        if (shortTvDetailListFragment2 == null || (pageName = shortTvDetailListFragment2.getPageName()) == null) {
            pageName = "";
        }
        interfaceC28663hM81404P.mo73816a(shortTvDetailListFragment, ugcVideoId, title, pageName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final void m81244Q(ShortTvVideoItemView shortTvVideoItemView) {
        shortTvVideoItemView.m81245R();
    }

    /* JADX INFO: renamed from: R */
    private final void m81245R() {
        InterfaceC16634g interfaceC16634g;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, this.TAG, "playVideo   data:" + this.data + "  orPlayer:" + this.orPlayer + " ------- " + this, false, 4, null);
        ShorttvModel.UGCVideo uGCVideo = this.data;
        if (uGCVideo == null || this.orPlayer == null) {
            return;
        }
        if ((uGCVideo != null ? uGCVideo.getPlayUrl() : null) == null) {
            return;
        }
        InterfaceC16634g interfaceC16634g2 = this.orPlayer;
        if (interfaceC16634g2 != null && interfaceC16634g2.isComplete() && (interfaceC16634g = this.orPlayer) != null) {
            interfaceC16634g.seekTo(0L);
        }
        InterfaceC16634g interfaceC16634g3 = this.orPlayer;
        if (interfaceC16634g3 != null) {
            interfaceC16634g3.play();
        }
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        if (shortTvViewModel != null) {
            shortTvViewModel.m81412X();
        }
        C26866a.a.m104898f(aVar, this.TAG, "player- startplay", false, 4, null);
    }

    /* JADX INFO: renamed from: S */
    private final void m81246S(Function0 block) {
        if (C27287m.f83003a.m106330e()) {
            block.invoke();
        } else {
            m81251X();
        }
    }

    /* JADX INFO: renamed from: T */
    private final void m81247T(String ep2, ShorttvModel.UGCVideo ugcVideo) {
        String description;
        String str;
        String description2;
        ExpandView expandView = this.viewBinding.f83193c;
        expandView.setExpandListener(new C19484d());
        if (ugcVideo == null || (description2 = ugcVideo.getDescription()) == null || description2.length() <= 0) {
            description = ugcVideo.getDescription();
            if (description == null) {
                description = "";
            }
        } else {
            description = ugcVideo.getDescription();
        }
        if (description == null || description.length() == 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
            str = String.format("EP%s", Arrays.copyOf(new Object[]{ep2}, 1));
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.f75910a;
            str = String.format("EP%s | %s", Arrays.copyOf(new Object[]{ep2, description}, 2));
        }
        Intrinsics.m97801g(str, "format(...)");
        expandView.m80641l(str);
    }

    /* JADX INFO: renamed from: U */
    private final void m81248U() {
        LiveData liveDataM81407S;
        Boolean bool;
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        m81250W((shortTvViewModel == null || (liveDataM81407S = shortTvViewModel.m81407S()) == null || (bool = (Boolean) liveDataM81407S.m14847f()) == null) ? true : bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final void m81249V(ShortTvVideoItemView shortTvVideoItemView, String str) {
        shortTvVideoItemView.m81259f0();
    }

    /* JADX INFO: renamed from: W */
    private final void m81250W(boolean show) {
        ShorttvModel.UGCVideo uGCVideo;
        ShorttvModel.UGCVideoCreator creator;
        ShorttvModel.UGCVideoCreator creator2;
        if (!show) {
            m81230C();
            Group groupContent = this.viewBinding.f83196f;
            Intrinsics.m97801g(groupContent, "groupContent");
            AbstractC23896b.m94641c(groupContent);
            AppCompatImageView ivSubscribe = this.viewBinding.f83204n;
            Intrinsics.m97801g(ivSubscribe, "ivSubscribe");
            AbstractC23896b.m94641c(ivSubscribe);
            return;
        }
        m81253Z();
        ShorttvModel.UGCVideo uGCVideo2 = this.data;
        if (((uGCVideo2 == null || (creator2 = uGCVideo2.getCreator()) == null) ? null : creator2.getAvatar()) == null) {
            Group groupContent2 = this.viewBinding.f83196f;
            Intrinsics.m97801g(groupContent2, "groupContent");
            AbstractC23896b.m94641c(groupContent2);
            FrameLayout layoutTvEpisode = this.viewBinding.f83205o;
            Intrinsics.m97801g(layoutTvEpisode, "layoutTvEpisode");
            AbstractC23896b.m94642d(layoutTvEpisode);
            return;
        }
        Group groupContent3 = this.viewBinding.f83196f;
        Intrinsics.m97801g(groupContent3, "groupContent");
        AbstractC23896b.m94642d(groupContent3);
        AppCompatImageView appCompatImageView = this.viewBinding.f83204n;
        ShorttvModel.UGCVideo uGCVideo3 = this.data;
        appCompatImageView.setVisibility((uGCVideo3 == null || (creator = uGCVideo3.getCreator()) == null) ? false : Intrinsics.m97797c(creator.getHasSubscribe(), Boolean.FALSE) ? 0 : 8);
        if (this.viewBinding.f83193c.isSetTitleSuccess() || (uGCVideo = this.data) == null) {
            return;
        }
        m81247T(String.valueOf(uGCVideo.getEp()), uGCVideo);
    }

    /* JADX INFO: renamed from: X */
    private final void m81251X() {
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        if (shortTvDetailListFragment != null) {
            shortTvDetailListFragment.m81047S0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public final void m81252Y() {
        this.autoHideRightMenuHandle.removeCallbacks(this.autoHideRightMenuRunnable);
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        if (shortTvViewModel != null) {
            shortTvViewModel.m81428q0(true);
        }
    }

    /* JADX INFO: renamed from: Z */
    private final void m81253Z() {
        Window window;
        View decorView;
        WindowInsetsController insetsController;
        if (Build.VERSION.SDK_INT >= 30) {
            Context context = getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            window = activity != null ? activity.getWindow() : null;
            if (window == null || (insetsController = window.getInsetsController()) == null) {
                return;
            }
            insetsController.show(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
            return;
        }
        Context context2 = getContext();
        Activity activity2 = context2 instanceof Activity ? (Activity) context2 : null;
        window = activity2 != null ? activity2.getWindow() : null;
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setSystemUiVisibility(1792);
    }

    /* JADX INFO: renamed from: a0 */
    private final void m81254a0() {
        ShorttvModel.UGCVideoInteractiveInfo interactiveInfo;
        Boolean hasFavorite;
        ShorttvModel.UGCVideoInteractiveInfo interactiveInfo2;
        String favoriteNum;
        ShorttvModel.UGCVideo uGCVideo = this.data;
        this.viewBinding.f83216z.setText(ShortTvExtKt.m81317t(AbstractC26104e.m102240a((uGCVideo == null || (interactiveInfo2 = uGCVideo.getInteractiveInfo()) == null || (favoriteNum = interactiveInfo2.getFavoriteNum()) == null) ? 0L : Long.parseLong(favoriteNum))));
        AppCompatTextView appCompatTextView = this.viewBinding.f83216z;
        ShorttvModel.UGCVideo uGCVideo2 = this.data;
        appCompatTextView.setSelected((uGCVideo2 == null || (interactiveInfo = uGCVideo2.getInteractiveInfo()) == null || (hasFavorite = interactiveInfo.getHasFavorite()) == null) ? false : hasFavorite.booleanValue());
    }

    /* JADX INFO: renamed from: b0 */
    private final void m81255b0() {
        ShorttvModel.UGCVideoCreator creator;
        ShorttvModel.UGCVideo uGCVideo = this.data;
        boolean zM97797c = (uGCVideo == null || (creator = uGCVideo.getCreator()) == null) ? false : Intrinsics.m97797c(creator.getHasSubscribe(), Boolean.TRUE);
        C27347j0 c27347j0 = this.viewBinding;
        AppCompatImageView appCompatImageView = c27347j0.f83204n;
        if (!zM97797c) {
            Group groupContent = c27347j0.f83196f;
            Intrinsics.m97801g(groupContent, "groupContent");
            if (groupContent.getVisibility() == 0) {
                Intrinsics.m97799e(appCompatImageView);
                AbstractC23896b.m94642d(appCompatImageView);
                return;
            }
        }
        Intrinsics.m97799e(appCompatImageView);
        AbstractC23896b.m94640b(appCompatImageView);
    }

    /* JADX INFO: renamed from: c0 */
    private final void m81256c0() {
        ShorttvModel.UGCVideoInteractiveInfo interactiveInfo;
        Boolean hasLike;
        ShorttvModel.UGCVideoInteractiveInfo interactiveInfo2;
        String likeNum;
        ShorttvModel.UGCVideo uGCVideo = this.data;
        this.viewBinding.f83181B.setText(ShortTvExtKt.m81317t(AbstractC26104e.m102240a((uGCVideo == null || (interactiveInfo2 = uGCVideo.getInteractiveInfo()) == null || (likeNum = interactiveInfo2.getLikeNum()) == null) ? 0L : Long.parseLong(likeNum))));
        AppCompatTextView appCompatTextView = this.viewBinding.f83181B;
        ShorttvModel.UGCVideo uGCVideo2 = this.data;
        appCompatTextView.setSelected((uGCVideo2 == null || (interactiveInfo = uGCVideo2.getInteractiveInfo()) == null || (hasLike = interactiveInfo.getHasLike()) == null) ? false : hasLike.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public final void m81257d0(long progress) {
        int i11 = (int) progress;
        this.viewBinding.f83211u.setProgress(i11);
        this.viewBinding.f83208r.setProgress(i11);
        this.viewBinding.f83183D.setText(AbstractC19531j.m81353a(i11) + " / " + AbstractC19531j.m81353a(this.viewBinding.f83208r.getMax()));
    }

    /* JADX INFO: renamed from: e0 */
    private final void m81258e0(long max) {
        int i11 = (int) max;
        this.viewBinding.f83211u.setMax(i11);
        this.viewBinding.f83208r.setMax(i11);
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "updateProgressMax: " + max + "  : " + this, false, 4, null);
    }

    /* JADX INFO: renamed from: f0 */
    private final void m81259f0() {
        ShorttvModel.UGCVideoInteractiveInfo interactiveInfo;
        String shareNum;
        ShorttvModel.UGCVideo uGCVideo = this.data;
        AbstractC26104e.m102240a((uGCVideo == null || (interactiveInfo = uGCVideo.getInteractiveInfo()) == null || (shareNum = interactiveInfo.getShareNum()) == null) ? 0L : Long.parseLong(shareNum));
    }

    /* JADX INFO: renamed from: g0 */
    private final void m81260g0(Long count) {
        ShorttvModel.UGCVideoInteractiveInfo interactiveInfo;
        String shareNum;
        if (count == null || count.toString() == null) {
            ShorttvModel.UGCVideo uGCVideo = this.data;
            AbstractC26104e.m102240a((uGCVideo == null || (interactiveInfo = uGCVideo.getInteractiveInfo()) == null || (shareNum = interactiveInfo.getShareNum()) == null) ? 0L : Long.parseLong(shareNum));
        }
    }

    /* JADX INFO: renamed from: h0 */
    private final void m81262h0(Integer w11, Integer h11) {
        if (w11 == null || h11 == null || w11.intValue() == 0) {
            return;
        }
        FrameLayout flContainer = this.viewBinding.f83194d;
        Intrinsics.m97801g(flContainer, "flContainer");
        ViewGroup.LayoutParams layoutParams = flContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
        ((ViewGroup.MarginLayoutParams) c2308b).width = AbstractC5806y.m27489e();
        ((ViewGroup.MarginLayoutParams) c2308b).height = (h11.intValue() * ((ViewGroup.MarginLayoutParams) c2308b).width) / w11.intValue();
        flContainer.setLayoutParams(c2308b);
    }

    /* JADX INFO: renamed from: i0 */
    private final void m81264i0(ShorttvModel.UGCVideo item) {
        Cover cover;
        String url;
        ShortTvDetailListFragment shortTvDetailListFragment;
        FragmentActivity activity;
        m81257d0(0L);
        if (item != null) {
            int iVideoUGCPosition = item.videoUGCPosition();
            TnTextView tnTextView = this.viewBinding.f83186G;
            StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
            String str = String.format("EP%s", Arrays.copyOf(new Object[]{ShortTvExtKt.m81311n(Integer.valueOf(iVideoUGCPosition))}, 1));
            Intrinsics.m97801g(str, "format(...)");
            tnTextView.setText(str);
        }
        if (item == null || (cover = item.getCover()) == null || (url = cover.getUrl()) == null) {
            this.viewBinding.f83199i.setImageDrawable(null);
            return;
        }
        C25429b.a aVar = C25429b.f76999a;
        int i11 = this.screenWidth;
        String strM99978d = aVar.m99978d(url, (120 & 2) != 0 ? 0 : i11, (120 & 4) != 0 ? 0 : i11, (120 & 8) != 0, (120 & 16) != 0 ? false : false, (120 & 32) == 0 ? false : false, (120 & 64) != 0 ? 25 : 0);
        if (Intrinsics.m97797c(strM99978d, this.viewBinding.f83199i.getTag()) || (shortTvDetailListFragment = this.fragment) == null || (activity = shortTvDetailListFragment.getActivity()) == null) {
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "into  " + this, false, 4, null);
        this.viewBinding.f83199i.setTag(strM99978d);
        Glide.with(activity).load2(strM99978d).addListener(new C19485e()).into(this.viewBinding.f83199i);
    }

    private final void setLoading(boolean show) {
        this.isLoading = show;
        if (show) {
            ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
            Intrinsics.m97800f(shortTvDetailListFragment, "null cannot be cast to non-null type com.transsion.shorttv_pugc.ui.fragment.ShortTvDetailListFragment");
            shortTvDetailListFragment.startLoading();
        } else {
            ShortTvDetailListFragment shortTvDetailListFragment2 = this.fragment;
            Intrinsics.m97800f(shortTvDetailListFragment2, "null cannot be cast to non-null type com.transsion.shorttv_pugc.ui.fragment.ShortTvDetailListFragment");
            shortTvDetailListFragment2.hideLoading();
        }
    }

    /* JADX INFO: renamed from: v */
    private final void m81277v(ORPlayerView orPlayerView, Video video) {
        ViewParent parent = orPlayerView.getParent();
        if (!Intrinsics.m97797c(parent, this.viewBinding.f83194d)) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(orPlayerView);
            }
            this.viewBinding.f83194d.addView(orPlayerView, new FrameLayout.LayoutParams(-1, -1));
        }
        if (video != null) {
            m81262h0(video.getWidth(), video.getHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final void m81278w() {
        FrameLayout layoutTvEpisode = this.viewBinding.f83205o;
        Intrinsics.m97801g(layoutTvEpisode, "layoutTvEpisode");
        if (layoutTvEpisode.getVisibility() == 0) {
            this.autoHideRightMenuHandle.removeCallbacks(this.autoHideRightMenuRunnable);
            this.autoHideRightMenuHandle.postDelayed(this.autoHideRightMenuRunnable, 3000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m81279x(ShortTvVideoItemView shortTvVideoItemView) {
        shortTvVideoItemView.m81229B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m81280y(ShortTvVideoItemView shortTvVideoItemView) {
        shortTvVideoItemView.m81251X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final void m81281z(ShortTvVideoItemView shortTvVideoItemView, Boolean bool) {
        shortTvVideoItemView.m81254a0();
    }

    public void app2Background() {
        C29245c c29245c = this.dotLayer;
        if (c29245c != null) {
            c29245c.m112135d(true);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d c26907d) {
        InterfaceC16633f.a.m72423a(this, z11, i11, i12, c26907d);
    }

    public FrameLayout getPlayerContainer() {
        FrameLayout flContainer = this.viewBinding.f83194d;
        Intrinsics.m97801g(flContainer, "flContainer");
        return flContainer;
    }

    @Override // com.transsion.shorttv_pugc.p317ui.widget.InterfaceC19486a
    public long getProgress() {
        return this.viewBinding.f83211u.getProgress();
    }

    public ShortTvViewModel getViewModel(FragmentActivity activity) {
        Intrinsics.m97802h(activity, "activity");
        return (ShortTvViewModel) new C3227v0(activity).m14969a(ShortTvViewModel.class);
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
        LiveData liveDataM81398J;
        LiveData liveDataM81390B;
        LiveData liveDataM81393E;
        LiveData liveDataM81436y;
        LiveData liveDataM81407S;
        super.onAttachedToWindow();
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        if (shortTvDetailListFragment == null || (viewLifecycleOwner = shortTvDetailListFragment.getViewLifecycleOwner()) == null) {
            return;
        }
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        if (shortTvViewModel != null && (liveDataM81407S = shortTvViewModel.m81407S()) != null) {
            liveDataM81407S.m14851j(viewLifecycleOwner, this.observer);
        }
        ShortTvViewModel shortTvViewModel2 = this.mShortTvViewModel;
        if (shortTvViewModel2 != null && (liveDataM81436y = shortTvViewModel2.m81436y()) != null) {
            liveDataM81436y.m14851j(viewLifecycleOwner, this.favoriteObserver);
        }
        ShortTvViewModel shortTvViewModel3 = this.mShortTvViewModel;
        if (shortTvViewModel3 != null && (liveDataM81393E = shortTvViewModel3.m81393E()) != null) {
            liveDataM81393E.m14851j(viewLifecycleOwner, this.likeObserver);
        }
        ShortTvViewModel shortTvViewModel4 = this.mShortTvViewModel;
        if (shortTvViewModel4 != null && (liveDataM81390B = shortTvViewModel4.m81390B()) != null) {
            liveDataM81390B.m14851j(viewLifecycleOwner, this.followObserver);
        }
        ShortTvViewModel shortTvViewModel5 = this.mShortTvViewModel;
        if (shortTvViewModel5 == null || (liveDataM81398J = shortTvViewModel5.m81398J()) == null) {
            return;
        }
        liveDataM81398J.m14851j(viewLifecycleOwner, this.shareObserver);
    }

    public void onAudioTrackChange() {
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onBufferedPosition(long j11, C23403e c23403e) {
        InterfaceC16633f.a.m72426d(this, j11, c23403e);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        ShortTvDetailListFragment shortTvDetailListFragment;
        FragmentActivity activity;
        String strM81429r;
        ShortTvViewModel shortTvViewModel;
        InterfaceC28658c interfaceC28658cM81400L;
        ShorttvModel.UGCVideoCollection belongToCollection;
        ShorttvModel.UGCVideoInteractiveInfo interactiveInfo;
        String shareNum;
        if (C26102c.f79666a.m102236a(v11 != null ? v11.getId() : 0, 500L)) {
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onclick, " + v11, false, 4, null);
        Integer numValueOf = v11 != null ? Integer.valueOf(v11.getId()) : null;
        int i11 = R$id.iv_subscribe;
        if (numValueOf != null && numValueOf.intValue() == i11) {
            m81246S(new Function0() { // from class: com.transsion.shorttv_pugc.ui.widget.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShortTvVideoItemView.m81238K(this.f62412a);
                }
            });
            C29243a c29243a = C29243a.f89221a;
            ShorttvModel.UGCVideo uGCVideo = this.data;
            ShortTvViewModel shortTvViewModel2 = this.mShortTvViewModel;
            C29243a.m112124b(c29243a, PushConstants.TOPIC_SUBSCRIBE, uGCVideo, null, shortTvViewModel2 != null ? shortTvViewModel2.m81397I() : null, 4, null);
            return;
        }
        int i12 = R$id.tv_episode;
        if (numValueOf != null && numValueOf.intValue() == i12) {
            showEpisodeListDialog();
            return;
        }
        int i13 = R$id.tv_like;
        if (numValueOf != null && numValueOf.intValue() == i13) {
            m81246S(new Function0() { // from class: com.transsion.shorttv_pugc.ui.widget.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShortTvVideoItemView.m81239L(this.f62414a);
                }
            });
            C29243a c29243a2 = C29243a.f89221a;
            ShorttvModel.UGCVideo uGCVideo2 = this.data;
            ShortTvViewModel shortTvViewModel3 = this.mShortTvViewModel;
            C29243a.m112124b(c29243a2, "like", uGCVideo2, null, shortTvViewModel3 != null ? shortTvViewModel3.m81397I() : null, 4, null);
            return;
        }
        int i14 = R$id.iv_share;
        if (numValueOf != null && numValueOf.intValue() == i14) {
            ShortTvViewModel shortTvViewModel4 = this.mShortTvViewModel;
            if (shortTvViewModel4 != null) {
                shortTvViewModel4.m81422i0(this.data);
            }
            m81243P();
            ShorttvModel.UGCVideo uGCVideo3 = this.data;
            m81260g0(Long.valueOf((uGCVideo3 == null || (interactiveInfo = uGCVideo3.getInteractiveInfo()) == null || (shareNum = interactiveInfo.getShareNum()) == null) ? 1L : Long.parseLong(shareNum)));
            C29243a c29243a3 = C29243a.f89221a;
            ShorttvModel.UGCVideo uGCVideo4 = this.data;
            ShortTvViewModel shortTvViewModel5 = this.mShortTvViewModel;
            C29243a.m112124b(c29243a3, "share", uGCVideo4, null, shortTvViewModel5 != null ? shortTvViewModel5.m81397I() : null, 4, null);
            return;
        }
        int i15 = R$id.tv_favorite;
        if (numValueOf != null && numValueOf.intValue() == i15) {
            m81246S(new Function0() { // from class: com.transsion.shorttv_pugc.ui.widget.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShortTvVideoItemView.m81240M(this.f62416a);
                }
            });
            C29243a c29243a4 = C29243a.f89221a;
            ShorttvModel.UGCVideo uGCVideo5 = this.data;
            ShortTvViewModel shortTvViewModel6 = this.mShortTvViewModel;
            C29243a.m112124b(c29243a4, "favorite", uGCVideo5, null, shortTvViewModel6 != null ? shortTvViewModel6.m81397I() : null, 4, null);
            return;
        }
        int i16 = R$id.iv_play_status;
        if (numValueOf != null && numValueOf.intValue() == i16) {
            m81242O();
            return;
        }
        int i17 = R$id.iv_short_cover;
        if (numValueOf == null || numValueOf.intValue() != i17) {
            int i18 = R$id.tv_name;
            if (numValueOf == null || numValueOf.intValue() != i18) {
                int i19 = R$id.iv_download;
                if (numValueOf == null || numValueOf.intValue() != i19) {
                    int i20 = R$id.iv_back;
                    if (numValueOf == null || numValueOf.intValue() != i20 || (shortTvDetailListFragment = this.fragment) == null || (activity = shortTvDetailListFragment.getActivity()) == null) {
                        return;
                    }
                    activity.finish();
                    return;
                }
                ShortTvViewModel shortTvViewModel7 = this.mShortTvViewModel;
                if (shortTvViewModel7 != null && (strM81429r = shortTvViewModel7.m81429r()) != null && (shortTvViewModel = this.mShortTvViewModel) != null && (interfaceC28658cM81400L = shortTvViewModel.m81400L()) != null) {
                    Context context = getContext();
                    Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    FragmentActivity fragmentActivity = (FragmentActivity) context;
                    ShorttvModel.UGCVideo uGCVideo6 = this.data;
                    String collectionName = (uGCVideo6 == null || (belongToCollection = uGCVideo6.getBelongToCollection()) == null) ? null : belongToCollection.getCollectionName();
                    ShortTvViewModel shortTvViewModel8 = this.mShortTvViewModel;
                    String strM81397I = shortTvViewModel8 != null ? shortTvViewModel8.m81397I() : null;
                    ShorttvModel.UGCVideo uGCVideo7 = this.data;
                    interfaceC28658cM81400L.mo73792d(fragmentActivity, strM81429r, collectionName, "ugc_video", "/ugc_shorts/detail", strM81397I, uGCVideo7 != null ? uGCVideo7.getSubjectId() : null);
                }
                C29243a c29243a5 = C29243a.f89221a;
                ShorttvModel.UGCVideo uGCVideo8 = this.data;
                ShortTvViewModel shortTvViewModel9 = this.mShortTvViewModel;
                C29243a.m112124b(c29243a5, "saved", uGCVideo8, null, shortTvViewModel9 != null ? shortTvViewModel9.m81397I() : null, 4, null);
                return;
            }
        }
        m81246S(new Function0() { // from class: com.transsion.shorttv_pugc.ui.widget.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvVideoItemView.m81241N(this.f62449a);
            }
        });
        C29243a c29243a6 = C29243a.f89221a;
        ShorttvModel.UGCVideo uGCVideo9 = this.data;
        ShortTvViewModel shortTvViewModel10 = this.mShortTvViewModel;
        C29243a.m112124b(c29243a6, "cover", uGCVideo9, null, shortTvViewModel10 != null ? shortTvViewModel10.m81397I() : null, 4, null);
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onComplete(SubtitleDownloadTable stDownloadTable) {
        Intrinsics.m97802h(stDownloadTable, "stDownloadTable");
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onCompletion(C23403e mediaSource) {
        C26866a.a.m104905r(C26866a.f81698a, this.TAG, new String[]{"onCompletion， play next"}, false, 4, null);
        C29245c c29245c = this.dotLayer;
        if (c29245c != null) {
            InterfaceC16633f.a.m72428f(c29245c, null, 1, null);
        }
        m81257d0(0L);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        LiveData liveDataM81390B;
        LiveData liveDataM81393E;
        LiveData liveDataM81398J;
        LiveData liveDataM81436y;
        LiveData liveDataM81407S;
        super.onDetachedFromWindow();
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        if (shortTvViewModel != null && (liveDataM81407S = shortTvViewModel.m81407S()) != null) {
            liveDataM81407S.mo14856o(this.observer);
        }
        ShortTvViewModel shortTvViewModel2 = this.mShortTvViewModel;
        if (shortTvViewModel2 != null && (liveDataM81436y = shortTvViewModel2.m81436y()) != null) {
            liveDataM81436y.mo14856o(this.favoriteObserver);
        }
        ShortTvViewModel shortTvViewModel3 = this.mShortTvViewModel;
        if (shortTvViewModel3 != null && (liveDataM81398J = shortTvViewModel3.m81398J()) != null) {
            liveDataM81398J.mo14856o(this.shareObserver);
        }
        ShortTvViewModel shortTvViewModel4 = this.mShortTvViewModel;
        if (shortTvViewModel4 != null && (liveDataM81393E = shortTvViewModel4.m81393E()) != null) {
            liveDataM81393E.mo14856o(this.likeObserver);
        }
        ShortTvViewModel shortTvViewModel5 = this.mShortTvViewModel;
        if (shortTvViewModel5 != null && (liveDataM81390B = shortTvViewModel5.m81390B()) != null) {
            liveDataM81390B.mo14856o(this.followObserver);
        }
        this.autoHideRightMenuHandle.removeCallbacksAndMessages(null);
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onDownloading(int progress, SubtitleDownloadTable stDownloadTable) {
        Intrinsics.m97802h(stDownloadTable, "stDownloadTable");
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onFail(Exception e11, SubtitleDownloadTable dbBean) {
        Intrinsics.m97802h(e11, "e");
        Intrinsics.m97802h(dbBean, "dbBean");
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onFocusChange(boolean z11) {
        InterfaceC16633f.a.m72429g(this, z11);
    }

    public void onGetDubsInfo() {
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onIsPlayingChanged(boolean z11) {
        InterfaceC16633f.a.m72430h(this, z11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingBegin(C23403e mediaSource) {
        C29245c c29245c = this.dotLayer;
        if (c29245c != null) {
            InterfaceC16633f.a.m72432j(c29245c, null, 1, null);
        }
        setLoading(true);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingEnd(C23403e mediaSource) {
        C29245c c29245c = this.dotLayer;
        if (c29245c != null) {
            InterfaceC16633f.a.m72434l(c29245c, null, 1, null);
        }
        setLoading(false);
        removeCallbacks(this.delayToastNetErrRunnable);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingProgress(int i11, float f11, C23403e c23403e) {
        InterfaceC16633f.a.m72435m(this, i11, f11, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoopingStart() {
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onMediaItemTransition(String str) {
        InterfaceC16633f.a.m72438p(this, str);
    }

    public final void onNetConnect() {
        C26866a.a.m104898f(C26866a.f81698a, "ORSubtitle_v", "onNetConnect, 网络恢复，检测字幕", false, 4, null);
    }

    @Override // com.transsion.shorttv_pugc.p317ui.widget.InterfaceC19486a
    public void onPageRelease(int position) {
        onPlayerReset();
    }

    @Override // com.transsion.shorttv_pugc.p317ui.widget.InterfaceC19486a
    public void onPageSelected(InterfaceC16634g orPlayer, ORPlayerView orPlayerView, ShorttvModel.UGCVideo item) {
        ShortTvViewModel shortTvViewModel;
        this.orPlayer = orPlayer;
        this.orPlayerView = orPlayerView;
        C29245c c29245c = this.dotLayer;
        if (c29245c != null) {
            c29245c.m112145p(orPlayer);
        }
        C29245c c29245c2 = this.dotLayer;
        if (c29245c2 != null && orPlayer != null) {
            orPlayer.addPlayerListener(c29245c2);
        }
        if (item != null && (shortTvViewModel = this.mShortTvViewModel) != null) {
            shortTvViewModel.m81416c0(item.getEp());
        }
        updateShortTvInfo(orPlayer, orPlayerView, item);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayError(PlayError errorInfo, C23403e mediaSource) {
        Integer errorCode;
        Intrinsics.m97802h(errorInfo, "errorInfo");
        C29245c c29245c = this.dotLayer;
        if (c29245c != null) {
            InterfaceC16633f.a.m72440r(c29245c, errorInfo, null, 2, null);
        }
        C26866a.f81698a.m104915i("i_media", this.TAG + " --> IPlayerListener --> onPlayError()  errorCode:" + errorInfo.getErrorCode() + " errorMessage:" + errorInfo.getErrorMessage() + " url:" + (mediaSource != null ? mediaSource.m92935k() : null) + " --> 短播放失败了", true);
        setLoading(false);
        Integer errorCode2 = errorInfo.getErrorCode();
        if ((errorCode2 != null && errorCode2.intValue() == 2001) || ((errorCode = errorInfo.getErrorCode()) != null && errorCode.intValue() == 2002)) {
            m81251X();
        }
    }

    public void onPlayErrorChangePayer(TnPlayerType tnPlayerType, C23403e c23403e) {
        InterfaceC16633f.a.m72441s(this, tnPlayerType, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayerRelease(C23403e c23403e) {
        InterfaceC16633f.a.m72442t(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayerReset() {
        InterfaceC16634g interfaceC16634g;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, this.TAG, "player- onPlayerReset data: " + this.data, false, 4, null);
        setKeepScreenOn(false);
        this.isClickPause = false;
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        if (shortTvDetailListFragment != null) {
            shortTvDetailListFragment.m81045P0(false);
        }
        this.isFirstFrame = false;
        this.isPrepare = false;
        C29245c c29245c = this.dotLayer;
        if (c29245c != null) {
            c29245c.m112136e(true, false);
        }
        AppCompatImageView ivCover = this.viewBinding.f83199i;
        Intrinsics.m97801g(ivCover, "ivCover");
        AbstractC23896b.m94642d(ivCover);
        C26866a.a.m104898f(aVar, this.TAG, "onPlayerReset   visible  " + this, false, 4, null);
        AppCompatImageView ivPlayStatus = this.viewBinding.f83201k;
        Intrinsics.m97801g(ivPlayStatus, "ivPlayStatus");
        AbstractC23896b.m94640b(ivPlayStatus);
        InterfaceC16634g interfaceC16634g2 = this.orPlayer;
        if (interfaceC16634g2 != null) {
            interfaceC16634g2.removePlayerListener(this);
        }
        C29245c c29245c2 = this.dotLayer;
        if (c29245c2 != null && (interfaceC16634g = this.orPlayer) != null) {
            interfaceC16634g.removePlayerListener(c29245c2);
        }
        this.orPlayer = null;
        this.orPlayerView = null;
        this.pagerLayoutManager = null;
        this.currentSaveProgress = 0L;
        m81257d0(0L);
        m81258e0(100L);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPrepare(C23403e mediaSource) {
        LiveData liveDataM81392D;
        ShortTvInnerPlayBean shortTvInnerPlayBean;
        ShorttvModel.UGCVideo uGCVideo;
        if (this.isPrepare) {
            return;
        }
        this.isPrepare = true;
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        m81258e0(interfaceC16634g != null ? interfaceC16634g.getDuration() : 0L);
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        if (shortTvViewModel != null && (liveDataM81392D = shortTvViewModel.m81392D()) != null && (shortTvInnerPlayBean = (ShortTvInnerPlayBean) liveDataM81392D.m14847f()) != null && (uGCVideo = this.data) != null && shortTvInnerPlayBean.getPosition() == uGCVideo.getEp()) {
            long progress = shortTvInnerPlayBean.getProgress();
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "player- onPrepare, duration = " + this.viewBinding.f83211u.getProgress() + ", progress = " + progress + "  this = " + this, false, 4, null);
            if (progress > 0) {
                this.currentSaveProgress = progress;
                InterfaceC16634g interfaceC16634g2 = this.orPlayer;
                if (interfaceC16634g2 != null) {
                    interfaceC16634g2.seekTo(progress);
                }
            }
            ShortTvViewModel shortTvViewModel2 = this.mShortTvViewModel;
            if (shortTvViewModel2 != null) {
                shortTvViewModel2.m81423m();
            }
        }
        setKeepScreenOn(true);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onProgress(long progress, C23403e mediaSource) {
        InterfaceC16634g interfaceC16634g;
        InterfaceC16634g interfaceC16634g2;
        if (this.isHorizontalDragging) {
            return;
        }
        long max = this.viewBinding.f83211u.getMax();
        if (max <= 0 || max == 100 || (interfaceC16634g2 = this.orPlayer) == null || max != interfaceC16634g2.getDuration()) {
            InterfaceC16634g interfaceC16634g3 = this.orPlayer;
            long duration = interfaceC16634g3 != null ? interfaceC16634g3.getDuration() : 0L;
            if (duration <= 0) {
                C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onProgress- duration <= 0, return", false, 4, null);
                return;
            }
            m81258e0(duration);
        }
        C29245c c29245c = this.dotLayer;
        if (c29245c != null) {
            InterfaceC16633f.a.m72448z(c29245c, progress, null, 2, null);
        }
        m81257d0(progress);
        setLoading(false);
        if (progress > 0) {
            AppCompatImageView ivCover = this.viewBinding.f83199i;
            Intrinsics.m97801g(ivCover, "ivCover");
            if (ivCover.getVisibility() == 0 && (interfaceC16634g = this.orPlayer) != null && interfaceC16634g.isPlaying()) {
                C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onProgress-progress>= cover gone", false, 4, null);
                AppCompatImageView ivCover2 = this.viewBinding.f83199i;
                Intrinsics.m97801g(ivCover2, "ivCover");
                AbstractC23896b.m94640b(ivCover2);
            }
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onRenderFirstFrame() {
        C26866a.a aVar = C26866a.f81698a;
        String str = this.TAG;
        AppCompatImageView ivCover = this.viewBinding.f83199i;
        Intrinsics.m97801g(ivCover, "ivCover");
        C26866a.a.m104898f(aVar, str, "player-   viewBinding.ivCover.isVisible:" + (ivCover.getVisibility() == 0) + " onRenderFirstFrame" + this, false, 4, null);
        if (!this.isFirstFrame) {
            this.isFirstFrame = true;
            C29245c c29245c = this.dotLayer;
            if (c29245c != null) {
                c29245c.onRenderFirstFrame();
            }
        }
        setLoading(false);
        AppCompatImageView ivCover2 = this.viewBinding.f83199i;
        Intrinsics.m97801g(ivCover2, "ivCover");
        AbstractC23896b.m94640b(ivCover2);
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onSaveDownload(SubtitleDownloadTable subtitleDownloadTable) {
        InterfaceC19743a.a.m82279a(this, subtitleDownloadTable);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onSetDataSource() {
    }

    @Override // androidx.p1004lifecycle.InterfaceC3218r
    public void onStateChanged(InterfaceC3224u source, Lifecycle.Event event) {
        InterfaceC16634g interfaceC16634g;
        InterfaceC28660e interfaceC28660eM81402N;
        ShortTvDetailListFragment shortTvDetailListFragment;
        Lifecycle lifecycle;
        Intrinsics.m97802h(source, "source");
        Intrinsics.m97802h(event, "event");
        int i11 = C19481a.f62389a[event.ordinal()];
        if (i11 == 1) {
            this.isPageHide = true;
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "player- onPause", false, 4, null);
            ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
            if ((shortTvViewModel == null || (interfaceC28660eM81402N = shortTvViewModel.m81402N()) == null || !interfaceC28660eM81402N.mo73807f(this.orPlayer)) && (interfaceC16634g = this.orPlayer) != null) {
                interfaceC16634g.pause();
                return;
            }
            return;
        }
        if (i11 == 2) {
            this.isPageHide = false;
            if (!this.isClickPause && (shortTvDetailListFragment = this.fragment) != null && shortTvDetailListFragment.isVisible()) {
                C26866a.a.m104898f(C26866a.f81698a, this.TAG, "ON_RESUME", false, 4, null);
                post(new Runnable() { // from class: com.transsion.shorttv_pugc.ui.widget.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        ShortTvVideoItemView.m81244Q(this.f62450a);
                    }
                });
            }
            m81248U();
            return;
        }
        if (i11 != 5) {
            return;
        }
        ShortTvDetailListFragment shortTvDetailListFragment2 = this.fragment;
        if (shortTvDetailListFragment2 != null && (lifecycle = shortTvDetailListFragment2.getLifecycle()) != null) {
            lifecycle.mo14835d(this);
        }
        C29245c c29245c = this.dotLayer;
        if (c29245c != null) {
            c29245c.m112139i();
        }
        InterfaceC16634g interfaceC16634g2 = this.orPlayer;
        if (interfaceC16634g2 != null) {
            interfaceC16634g2.removePlayerListener(this);
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

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onUnGzZip(SubtitleDownloadTable subtitleDownloadTable) {
        InterfaceC19743a.a.m82280b(this, subtitleDownloadTable);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoPause(C23403e mediaSource) {
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "player- onVideoPause", false, 4, null);
        if (this.isClickPause) {
            AppCompatImageView ivPlayStatus = this.viewBinding.f83201k;
            Intrinsics.m97801g(ivPlayStatus, "ivPlayStatus");
            ivPlayStatus.setVisibility(0);
        }
        C29245c c29245c = this.dotLayer;
        if (c29245c != null) {
            InterfaceC16633f.a.m72418G(c29245c, null, 1, null);
        }
        setKeepScreenOn(false);
        m81252Y();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoSizeChanged(int width, int height) {
        m81262h0(Integer.valueOf(width), Integer.valueOf(height));
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onVideoSizeChanged " + this, false, 4, null);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoStart(C23403e mediaSource) {
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "player- onVideoStart", false, 4, null);
        onPrepare(mediaSource);
        C29245c c29245c = this.dotLayer;
        if (c29245c != null) {
            InterfaceC16633f.a.m72421J(c29245c, null, 1, null);
        }
        AppCompatImageView ivPlayStatus = this.viewBinding.f83201k;
        Intrinsics.m97801g(ivPlayStatus, "ivPlayStatus");
        ivPlayStatus.setVisibility(8);
        setLoading(false);
        setKeepScreenOn(true);
        m81278w();
    }

    public final void reset() {
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "playNewMedia data: " + this.data, false, 4, null);
        setKeepScreenOn(false);
        this.isClickPause = false;
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        if (shortTvDetailListFragment != null) {
            shortTvDetailListFragment.m81045P0(false);
        }
        this.isFirstFrame = false;
        C29245c c29245c = this.dotLayer;
        if (c29245c != null) {
            c29245c.m112136e(true, false);
        }
        AppCompatImageView ivPlayStatus = this.viewBinding.f83201k;
        Intrinsics.m97801g(ivPlayStatus, "ivPlayStatus");
        AbstractC23896b.m94640b(ivPlayStatus);
        this.currentSaveProgress = 0L;
        m81257d0(0L);
        m81258e0(100L);
    }

    @Override // com.transsion.shorttv_pugc.p317ui.widget.InterfaceC19486a
    public void setData(ShorttvModel.UGCVideo item, ShortTvDetailListFragment fragment, Integer position, boolean videoLoadMore, String basePostId, String baseItemType, boolean isPayloads, boolean fromTrending) {
        WindowInsets rootWindowInsets;
        Insets insets;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ShorttvModel.UGCVideoCreator creator;
        FragmentActivity activity;
        ShorttvModel.UGCVideoCollection belongToCollection;
        String strM81397I;
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(fragment, "fragment");
        C26866a.a aVar = C26866a.f81698a;
        String str = this.TAG;
        ShorttvModel.UGCVideoCollection belongToCollection2 = item.getBelongToCollection();
        C26866a.a.m104898f(aVar, str, "setData position:" + position + "  ep:" + (belongToCollection2 != null ? belongToCollection2.getPosition() : null) + " item:" + item + " " + this, false, 4, null);
        this.data = item;
        this.fragment = fragment;
        this.videoLoadMore = Boolean.valueOf(videoLoadMore);
        this.basePostId = basePostId;
        this.position = position;
        this.viewBinding.f83196f.setReferencedIds(this.viewBinding.f83196f.getReferencedIds());
        FragmentActivity activity2 = fragment.getActivity();
        if (activity2 != null) {
            this.mShortTvViewModel = getViewModel(activity2);
            this.mShortTvSubViewModel = (C22778a) new C3227v0(activity2).m14969a(C22778a.class);
        }
        fragment.getLifecycle().mo14832a(this);
        if (!isPayloads) {
            this.dotLayer = new C29245c(fragment, this.mShortTvViewModel);
        }
        C29245c c29245c = this.dotLayer;
        if (c29245c != null) {
            c29245c.m112141l(basePostId);
        }
        C29245c c29245c2 = this.dotLayer;
        if (c29245c2 != null) {
            c29245c2.m112140k(baseItemType);
        }
        C29245c c29245c3 = this.dotLayer;
        if (c29245c3 != null) {
            c29245c3.m112147r(fragment.getPageName());
        }
        ShorttvModel.UGCVideo uGCVideo = this.data;
        if (uGCVideo == null || uGCVideo.isDataNotComplete()) {
            int iVideoUGCPosition = item.videoUGCPosition();
            TnTextView tnTextView = this.viewBinding.f83186G;
            StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
            String str2 = String.format("EP%s", Arrays.copyOf(new Object[]{ShortTvExtKt.m81311n(Integer.valueOf(iVideoUGCPosition))}, 1));
            Intrinsics.m97801g(str2, "format(...)");
            tnTextView.setText(str2);
            return;
        }
        C29245c c29245c4 = this.dotLayer;
        if (c29245c4 != null) {
            c29245c4.m112148s(this.data);
        }
        C29245c c29245c5 = this.dotLayer;
        if (c29245c5 != null) {
            ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
            if (shortTvViewModel == null || (strM81397I = shortTvViewModel.m81397I()) == null) {
                strM81397I = "";
            }
            c29245c5.m112143n(strM81397I);
        }
        ShorttvModel.UGCVideo uGCVideo2 = this.data;
        String strM81311n = ShortTvExtKt.m81311n((uGCVideo2 == null || (belongToCollection = uGCVideo2.getBelongToCollection()) == null) ? null : belongToCollection.getPosition());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i11 = Build.VERSION.SDK_INT;
        spannableStringBuilder.setSpan(i11 >= 29 ? new ImageSpan(getContext(), ShorttvModel.f61672a.m80407a(), 2) : new ImageSpan(getContext(), ShorttvModel.f61672a.m80407a(), 1), 0, 0, 33);
        ShorttvModel.UGCVideo uGCVideo3 = this.data;
        String title = uGCVideo3 != null ? uGCVideo3.getTitle() : null;
        ShorttvModel.UGCVideo uGCVideo4 = this.data;
        spannableStringBuilder.append((CharSequence) ("ShortTV • " + title + " / EP" + (uGCVideo4 != null ? Integer.valueOf(uGCVideo4.videoUGCPosition()) : null)));
        AppCompatTextView appCompatTextView = this.viewBinding.f83215y;
        appCompatTextView.setText(spannableStringBuilder);
        appCompatTextView.setText(spannableStringBuilder);
        ShorttvModel.UGCVideo uGCVideo5 = this.data;
        if (uGCVideo5 != null && (creator = uGCVideo5.getCreator()) != null && (activity = fragment.getActivity()) != null) {
            C25429b.a aVar2 = C25429b.f76999a;
            ShapeableImageView ivShortCover = this.viewBinding.f83203m;
            Intrinsics.m97801g(ivShortCover, "ivShortCover");
            String avatar = creator.getAvatar();
            aVar2.m99981k(activity, ivShortCover, avatar == null ? "" : avatar, (4064 & 8) != 0 ? aVar2.m99977c() : 0, (4064 & 16) != 0 ? aVar2.m99976b() : 0, (4064 & 32) != 0, (4064 & 64) != 0, (4064 & 128) != 0, (4064 & 256) != 0 ? false : false, (4064 & 512) != 0 ? false : false, (4064 & 1024) != 0 ? false : false, (4064 & 2048) != 0 ? 25 : 0);
            this.viewBinding.f83182C.setText(creator.getNickname());
        }
        ShorttvModel.UGCVideo uGCVideo6 = this.data;
        Intrinsics.m97799e(uGCVideo6);
        m81247T(strM81311n, uGCVideo6);
        if (i11 >= 30) {
            Context context = getContext();
            Intrinsics.m97800f(context, "null cannot be cast to non-null type android.app.Activity");
            Window window = ((Activity) context).getWindow();
            if (window != null && (rootWindowInsets = window.getDecorView().getRootWindowInsets()) != null && (insets = rootWindowInsets.getInsets(WindowInsets.Type.tappableElement())) != null) {
                boolean z11 = AbstractC5781d.m27353e(window) && AbstractC5781d.m27349a() > 1;
                int iM27411e = AbstractC5790i.m27411e(16.0f);
                if (z11 || insets.top <= 0) {
                    Space progressGuideline = this.viewBinding.f83209s;
                    Intrinsics.m97801g(progressGuideline, "progressGuideline");
                    ViewGroup.LayoutParams layoutParams = progressGuideline.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
                    ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    int i12 = marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0;
                    ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    int i13 = marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0;
                    ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
                    marginLayoutParams = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    c2308b.setMargins(i12, i13, marginLayoutParams != null ? marginLayoutParams.rightMargin : 0, iM27411e);
                    progressGuideline.setLayoutParams(c2308b);
                } else {
                    Space progressGuideline2 = this.viewBinding.f83209s;
                    Intrinsics.m97801g(progressGuideline2, "progressGuideline");
                    ViewGroup.LayoutParams layoutParams5 = progressGuideline2.getLayoutParams();
                    if (layoutParams5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.C2308b c2308b2 = (ConstraintLayout.C2308b) layoutParams5;
                    ViewGroup.LayoutParams layoutParams6 = getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                    int i14 = marginLayoutParams4 != null ? marginLayoutParams4.leftMargin : 0;
                    ViewGroup.LayoutParams layoutParams7 = getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
                    int i15 = marginLayoutParams5 != null ? marginLayoutParams5.topMargin : 0;
                    ViewGroup.LayoutParams layoutParams8 = getLayoutParams();
                    marginLayoutParams = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
                    c2308b2.setMargins(i14, i15, marginLayoutParams != null ? marginLayoutParams.rightMargin : 0, RangesKt.m97935e(iM27411e, insets.top));
                    progressGuideline2.setLayoutParams(c2308b2);
                }
            }
        }
        m81264i0(item);
        m81259f0();
        m81255b0();
        m81256c0();
        m81254a0();
        m81232E();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void setOnSeekCompleteListener() {
        InterfaceC16633f.a.m72422K(this);
    }

    public void setPagerLayoutManager(PagerLayoutManager pagerLayoutManager) {
        Intrinsics.m97802h(pagerLayoutManager, "pagerLayoutManager");
        this.pagerLayoutManager = pagerLayoutManager;
    }

    public final void setVideoUrl(String url) {
        Intrinsics.m97802h(url, "url");
    }

    public final void showEpisodeListDialog() {
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        Intrinsics.m97800f(shortTvDetailListFragment, "null cannot be cast to non-null type com.transsion.shorttv_pugc.ui.fragment.ShortTvDetailListFragment");
        shortTvDetailListFragment.m81046Q0();
    }

    public void updateLockState(ShorttvModel.UGCVideo item) {
    }

    public void updateShortTvInfo(InterfaceC16634g orPlayer, ORPlayerView orPlayerView, ShorttvModel.UGCVideo item) {
        C26866a.a aVar = C26866a.f81698a;
        String str = this.TAG;
        Integer num = this.position;
        ShorttvModel.UGCVideo uGCVideo = this.data;
        aVar.m104919u(str, "updateShortTvInfo:" + num + " ugcVideoId:" + (uGCVideo != null ? uGCVideo.getUgcVideoId() : null), true);
        if ((item != null ? item.getPlayUrl() : null) == null) {
            aVar.m104912c(this.TAG, "onPageSelect position:" + this.position + " item is null ", true);
            if (orPlayer != null) {
                orPlayer.pause();
                return;
            }
            return;
        }
        if (orPlayer != null) {
            orPlayer.setPlayerListener(this);
        }
        if (orPlayerView != null) {
            m81277v(orPlayerView, null);
            C26866a.a.m104898f(aVar, this.TAG, "addView-----", false, 4, null);
        }
        videoStartPrepare(this.pageFrom);
        String playUrl = item.getPlayUrl();
        if (playUrl != null) {
            C26866a.a.m104905r(aVar, this.TAG, new String[]{"------seekTo url=" + playUrl + " "}, false, 4, null);
            if (orPlayer != null) {
                orPlayer.seekTo(playUrl, 0L);
            }
            setVideoUrl(playUrl);
        }
        if (orPlayer != null) {
            orPlayer.play();
        }
    }

    public final void videoStartPrepare(String pageFrom) {
        Intrinsics.m97802h(pageFrom, "pageFrom");
        this.isFirstFrame = false;
        this.pageFrom = pageFrom;
        C29245c c29245c = this.dotLayer;
        if (c29245c != null) {
            c29245c.m112146q(pageFrom);
        }
        C29245c c29245c2 = this.dotLayer;
        if (c29245c2 != null) {
            c29245c2.m112144o("immersive_play");
        }
        C29245c c29245c3 = this.dotLayer;
        if (c29245c3 != null) {
            ShorttvModel.UGCVideo uGCVideo = this.data;
            c29245c3.m112142m(String.valueOf(uGCVideo != null ? Integer.valueOf(uGCVideo.getEp()) : null));
        }
        C29245c c29245c4 = this.dotLayer;
        if (c29245c4 != null) {
            c29245c4.m112137g();
        }
        C29245c c29245c5 = this.dotLayer;
        if (c29245c5 != null) {
            c29245c5.m112132a();
        }
        setLoading(true);
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        if (shortTvViewModel != null) {
            shortTvViewModel.m81412X();
        }
    }
}
