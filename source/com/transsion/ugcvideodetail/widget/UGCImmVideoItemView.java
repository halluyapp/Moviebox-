package com.transsion.ugcvideodetail.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.AbstractC5806y;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.cloud.tmc.miniapp.utils.toast.ToastStrategy;
import com.google.android.material.imageview.ShapeableImageView;
import com.gyf.immersionbar.BarHide;
import com.gyf.immersionbar.ImmersionBar;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.pager.PagerLayoutManager;
import com.p282tn.lib.widget.R$string;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayBean;
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.baseui.util.AbstractC14567m;
import com.transsion.baseui.widget.NestedScrollableHost;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.FirstFrame;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.PlayError;
import com.transsion.player.orplayer.global.TnPlayerType;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.push.PushConstants;
import com.transsion.ugcvideodetail.R$drawable;
import com.transsion.ugcvideodetail.R$layout;
import com.transsion.ugcvideodetail.adapter.C20151i;
import com.transsion.ugcvideodetail.api.UGCVideoTypeKt;
import com.transsion.ugcvideodetail.api.bean.UGCImmVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.ugcvideodetail.api.bean.UGCVideoCreator;
import com.transsion.ugcvideodetail.api.bean.UGCVideoHashTag;
import com.transsion.ugcvideodetail.api.bean.UGCVideoInteractiveInfo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoPlayInfo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoPlayStream;
import com.transsion.ugcvideodetail.dialog.UGCImmVideoSettingDialog;
import com.transsion.ugcvideodetail.fragment.UGCImmVideoDetailFragment;
import com.transsion.ugcvideodetail.hepler.C20310a;
import com.transsion.ugcvideodetail.hepler.subtitle.C20324a;
import com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel;
import com.transsion.ugcvideodetail.widget.UGCImmVideoItemView;
import com.transsion.web.api.WebConstants;
import com.transsion.wrapperad.R$color;
import com.transsnet.downloader.ugc.viewmodel.UGCDownloadViewModel;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import fo.C23403e;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import mg.C25826c;
import ng.AbstractC26006c;
import p416fs.C23424b;
import p441gz.InterfaceC23704a;
import p462hj.C23860f;
import p528ju.C24469a;
import p654oo.InterfaceC26373f;
import p683po.C26906c;
import p683po.C26907d;
import p723qx.C27136c;
import p765s6.InterfaceC27566d;
import p822uv.C28041d;
import p850vv.C28227a;
import p885wv.C28458r;
import p944yh.C28951b;
import p992zv.C29247a;
import p992zv.C29251e;
import p992zv.C29253g;
import p992zv.C29254h;
import p992zv.C29255i;
import p992zv.C29260n;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JI\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001cH\u0014¢\u0006\u0004\b$\u0010#J\r\u0010%\u001a\u00020\u001c¢\u0006\u0004\b%\u0010#J\r\u0010&\u001a\u00020\u001c¢\u0006\u0004\b&\u0010#J\r\u0010'\u001a\u00020\u001c¢\u0006\u0004\b'\u0010#J\r\u0010(\u001a\u00020\u001c¢\u0006\u0004\b(\u0010#J+\u0010.\u001a\u00020\u001c2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010-\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b.\u0010/J!\u00104\u001a\u00020\u001c2\b\u00101\u001a\u0004\u0018\u0001002\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105J\r\u00107\u001a\u000206¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\b¢\u0006\u0004\b:\u0010!J\u0019\u0010<\u001a\u00020\u001c2\b\u0010;\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u001c¢\u0006\u0004\b>\u0010#J\u000f\u0010?\u001a\u00020\u001cH\u0016¢\u0006\u0004\b?\u0010#J\r\u0010@\u001a\u00020\u001c¢\u0006\u0004\b@\u0010#J\r\u0010A\u001a\u00020\u001c¢\u0006\u0004\bA\u0010#J\r\u0010B\u001a\u00020\u001c¢\u0006\u0004\bB\u0010#J\u0015\u0010D\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u001cH\u0016¢\u0006\u0004\bF\u0010#J\u001f\u0010I\u001a\u00020\u001c2\u0006\u0010G\u001a\u00020\b2\u0006\u0010H\u001a\u00020\bH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u001cH\u0016¢\u0006\u0004\bK\u0010#J\u0019\u0010N\u001a\u00020\u001c2\b\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bN\u0010OJ\u0019\u0010P\u001a\u00020\u001c2\b\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bP\u0010OJ\u0019\u0010Q\u001a\u00020\u001c2\b\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bQ\u0010OJ!\u0010S\u001a\u00020\u001c2\u0006\u0010R\u001a\u0002062\b\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bS\u0010TJ\u0019\u0010U\u001a\u00020\u001c2\b\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bU\u0010OJ\u0019\u0010V\u001a\u00020\u001c2\b\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bV\u0010OJ!\u0010Y\u001a\u00020\u001c2\u0006\u0010X\u001a\u00020W2\b\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u001cH\u0016¢\u0006\u0004\b[\u0010#J\u0019\u0010\\\u001a\u00020\u001c2\b\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\b\\\u0010OJ\r\u0010]\u001a\u00020\u001c¢\u0006\u0004\b]\u0010#J\u000f\u0010^\u001a\u00020\u001cH\u0002¢\u0006\u0004\b^\u0010#J\u0017\u0010_\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b_\u0010`J\u0017\u0010c\u001a\u00020\u001c2\u0006\u0010b\u001a\u00020aH\u0002¢\u0006\u0004\bc\u0010dJ\u0017\u0010e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\be\u0010!J\u0017\u0010g\u001a\u00020\u001c2\u0006\u0010f\u001a\u00020\u0010H\u0002¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020\u001c2\u0006\u0010b\u001a\u00020aH\u0002¢\u0006\u0004\bi\u0010dJ\u0017\u0010j\u001a\u00020\u001c2\u0006\u0010R\u001a\u000206H\u0002¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\u001c2\u0006\u0010l\u001a\u000206H\u0002¢\u0006\u0004\bm\u0010kJ\u0017\u0010n\u001a\u00020\u001c2\u0006\u0010f\u001a\u00020\u0010H\u0002¢\u0006\u0004\bn\u0010hJ#\u0010q\u001a\u00020\u001c2\b\u0010o\u001a\u0004\u0018\u00010\b2\b\u0010p\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020\u001cH\u0002¢\u0006\u0004\bs\u0010#J\u0017\u0010u\u001a\u00020\u001c2\u0006\u0010t\u001a\u00020\bH\u0002¢\u0006\u0004\bu\u0010!J\u000f\u0010v\u001a\u00020\u001cH\u0002¢\u0006\u0004\bv\u0010#J\u000f\u0010w\u001a\u00020\u001cH\u0002¢\u0006\u0004\bw\u0010#J\u0017\u0010x\u001a\u00020\u001c2\u0006\u0010f\u001a\u00020\u0010H\u0002¢\u0006\u0004\bx\u0010hR\u0014\u0010{\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001c\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001c\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001c\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bp\u0010\u0092\u0001R\u0017\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010zR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010zR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010zR\u001a\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001a\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001c\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R!\u0010£\u0001\u001a\u00030\u009e\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R!\u0010¨\u0001\u001a\u00030¤\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¥\u0001\u0010 \u0001\u001a\u0006\b¦\u0001\u0010§\u0001R!\u0010\u00ad\u0001\u001a\u00030©\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bª\u0001\u0010 \u0001\u001a\u0006\b«\u0001\u0010¬\u0001R!\u0010²\u0001\u001a\u00030®\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¯\u0001\u0010 \u0001\u001a\u0006\b°\u0001\u0010±\u0001R!\u0010·\u0001\u001a\u00030³\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b´\u0001\u0010 \u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R!\u0010¼\u0001\u001a\u00030¸\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¹\u0001\u0010 \u0001\u001a\u0006\bº\u0001\u0010»\u0001R\u0017\u0010¿\u0001\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u0018\u0010Á\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b;\u0010À\u0001R\u0018\u0010Â\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bo\u0010À\u0001R\u0019\u0010Ä\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010À\u0001R\u0017\u0010Æ\u0001\u001a\u00020\b8\u0002X\u0082D¢\u0006\b\n\u0006\bÅ\u0001\u0010¾\u0001R\u0017\u0010È\u0001\u001a\u00020\b8\u0002X\u0082D¢\u0006\b\n\u0006\bÇ\u0001\u0010¾\u0001R\u0017\u0010Ê\u0001\u001a\u00020\b8\u0002X\u0082D¢\u0006\b\n\u0006\bÉ\u0001\u0010¾\u0001R\u0019\u0010Ì\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010¾\u0001R\u0018\u0010Í\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bc\u0010À\u0001R\u0018\u0010Î\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b^\u0010À\u0001R\u0019\u0010Ð\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010À\u0001R\u0019\u0010Ó\u0001\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R\u0018\u0010Ô\u0001\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bu\u0010Ò\u0001R\u0018\u0010Õ\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bv\u0010À\u0001R#\u0010Ù\u0001\u001a\u0005\u0018\u00010Ö\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¾\u0001\u0010 \u0001\u001a\u0006\b×\u0001\u0010Ø\u0001R\u0019\u0010Ú\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010¾\u0001R-\u0010ß\u0001\u001a\u0018\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010Ü\u00010Û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R\u0018\u0010à\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bw\u0010À\u0001R\u0018\u0010á\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bs\u0010À\u0001R\u0019\u0010ã\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010À\u0001R\u0018\u0010ç\u0001\u001a\u00030ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001R\u0019\u0010é\u0001\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0001\u0010Ò\u0001R\u0019\u0010ë\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bê\u0001\u0010À\u0001¨\u0006ì\u0001"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/widget/UGCImmVideoItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/transsion/player/orplayer/f;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "adapterPosition", "Lcom/transsion/ugcvideodetail/fragment/UGCImmVideoDetailFragment;", "fragment", "", "trackId", "previousTrackId", "previousPageVideoId", "Lcom/transsion/ugcvideodetail/api/bean/UGCImmVideo;", "data", "", "setData", "(Ljava/lang/Integer;Lcom/transsion/ugcvideodetail/fragment/UGCImmVideoDetailFragment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/transsion/ugcvideodetail/api/bean/UGCImmVideo;)V", NotificationCompat.CATEGORY_STATUS, "setDownloadStatus", "(I)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onPagePause", "onPageResume", "onPageStop", "onPageDestroy", "Lcom/transsion/player/orplayer/g;", "orPlayer", "Lcom/transsion/player/ui/ORPlayerView;", "orPlayerView", WebConstants.FIELD_ITEM, "onPageSelected", "(Lcom/transsion/player/orplayer/g;Lcom/transsion/player/ui/ORPlayerView;Lcom/transsion/ugcvideodetail/api/bean/UGCImmVideo;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/transsion/moviedetailapi/bean/FirstFrame;", "firstImage", "addVideoView", "(Landroid/view/View;Lcom/transsion/moviedetailapi/bean/FirstFrame;)V", "", "getProgress", "()J", RequestParameters.POSITION, "onPageRelease", "v", "onClick", "(Landroid/view/View;)V", "onNetConnect", "onPlayerReset", "reset", "app2Background", "videoStartPrepare", "url", "setVideoUrl", "(Ljava/lang/String;)V", "onSetDataSource", "width", "height", "onVideoSizeChanged", "(II)V", "onRenderFirstFrame", "Lfo/e;", "mediaSource", "onPrepare", "(Lfo/e;)V", "onVideoStart", "onVideoPause", NotificationCompat.CATEGORY_PROGRESS, "onProgress", "(JLfo/e;)V", "onLoadingBegin", "onLoadingEnd", "Lcom/transsion/player/orplayer/PlayError;", "errorInfo", "onPlayError", "(Lcom/transsion/player/orplayer/PlayError;Lfo/e;)V", "onLoopingStart", "onCompletion", "onItemViewMediaItemTransition", "D", "setContent", "(Lcom/transsion/ugcvideodetail/api/bean/UGCImmVideo;)V", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "video", "C", "(Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;)V", "V", PushConstants.PUSH_SERVICE_TYPE_SHOW, "setDownloadLoadingIconVisibility", "(Z)V", "setupHashTags", "W", "(J)V", "max", "X", "setLoading", "w", "h", "Y", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "M", "resolution", "G", "H", "L", "setControlVisible", "a", "Ljava/lang/String;", "TAG", "Lwv/r;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lwv/r;", "viewBinding", "c", "Lcom/transsion/ugcvideodetail/fragment/UGCImmVideoDetailFragment;", "Lcom/transsion/ugcvideodetail/viewmodel/UGCImmVideoDetailViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/ugcvideodetail/viewmodel/UGCImmVideoDetailViewModel;", "detailViewModel", "Lcom/transsion/ugcvideodetail/hepler/subtitle/a;", "e", "Lcom/transsion/ugcvideodetail/hepler/subtitle/a;", "subtitleViewModel", "Lcom/transsnet/downloader/ugc/viewmodel/UGCDownloadViewModel;", "f", "Lcom/transsnet/downloader/ugc/viewmodel/UGCDownloadViewModel;", "downloadViewModel", "Lcom/transsion/ugcvideodetail/hepler/a;", "g", "Lcom/transsion/ugcvideodetail/hepler/a;", "dotLayer", "Lcom/transsion/ugcvideodetail/api/bean/UGCImmVideo;", "i", "j", CampaignEx.JSON_KEY_AD_K, "l", "Lcom/transsion/player/orplayer/g;", "m", "Lcom/transsion/player/ui/ORPlayerView;", "Lcom/tn/lib/pager/PagerLayoutManager;", "n", "Lcom/tn/lib/pager/PagerLayoutManager;", "pagerLayoutManager", "Lzv/i;", "o", "Lkotlin/Lazy;", "getReportDelegate", "()Lzv/i;", "reportDelegate", "Lzv/e;", TtmlNode.TAG_P, "getDownloadDelegate", "()Lzv/e;", "downloadDelegate", "Lzv/h;", CampaignEx.JSON_KEY_AD_Q, "getPlayerDelegate", "()Lzv/h;", "playerDelegate", "Lzv/a;", CampaignEx.JSON_KEY_AD_R, "getActionDelegate", "()Lzv/a;", "actionDelegate", "Lzv/n;", "s", "getSubtitleDelegate", "()Lzv/n;", "subtitleDelegate", "Lzv/g;", "t", "getGestureDelegate", "()Lzv/g;", "gestureDelegate", TmcStartParams.KEY_URL_SHORT, "I", "screenWidth", "Z", "isClickPause", "isPageHide", "x", "isDownloadImmediately", "y", "DOWNLOAD_STATUS_DOWNLOAD_NONE", "z", "DOWNLOAD_STATUS_DOWNLOADING", "A", "DOWNLOAD_STATUS_DOWNLOAD_COMPLETE", "B", "singleDownloadImmediatelyStatus", "isSearchShow", "isEpLayoutShow", "E", "isHashTagShow", "F", "J", "totalDuration", "playProgress", "isSubscriptionInitiatedByThisView", "Lgz/a;", "getLoginApi", "()Lgz/a;", "loginApi", "curStatus", "Landroidx/lifecycle/c0;", "Lkotlin/Pair;", "K", "Landroidx/lifecycle/c0;", "subscriptObserver", "isLoading", "isFirstFrame", "N", "isPrepare", "Ljava/lang/Runnable;", "O", "Ljava/lang/Runnable;", "delayToastNetErrRunnable", "P", "lastShowNetWorkErrToastTime", "Q", "isBarHide", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCImmVideoItemView extends ConstraintLayout implements InterfaceC16633f, View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final int DOWNLOAD_STATUS_DOWNLOAD_COMPLETE;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private int singleDownloadImmediatelyStatus;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean isSearchShow;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private boolean isEpLayoutShow;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean isHashTagShow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private long totalDuration;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private long playProgress;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean isSubscriptionInitiatedByThisView;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final Lazy loginApi;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private int curStatus;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC3189c0 subscriptObserver;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private boolean isLoading;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private boolean isFirstFrame;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private boolean isPrepare;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final Runnable delayToastNetErrRunnable;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private long lastShowNetWorkErrToastTime;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private boolean isBarHide;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28458r viewBinding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private UGCImmVideoDetailFragment fragment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private UGCImmVideoDetailViewModel detailViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private C20324a subtitleViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private UGCDownloadViewModel downloadViewModel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C20310a dotLayer;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private UGCImmVideo data;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String trackId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String previousTrackId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String previousPageVideoId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private InterfaceC16634g orPlayer;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private ORPlayerView orPlayerView;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private PagerLayoutManager pagerLayoutManager;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final Lazy reportDelegate;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final Lazy downloadDelegate;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final Lazy playerDelegate;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Lazy actionDelegate;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final Lazy subtitleDelegate;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final Lazy gestureDelegate;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final int screenWidth;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean isClickPause;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private boolean isPageHide;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean isDownloadImmediately;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final int DOWNLOAD_STATUS_DOWNLOAD_NONE;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final int DOWNLOAD_STATUS_DOWNLOADING;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.widget.UGCImmVideoItemView$a */
    public static final class C20388a implements C29247a.b {

        /* JADX INFO: renamed from: a */
        private final C28458r f64607a;

        C20388a() {
            this.f64607a = UGCImmVideoItemView.this.viewBinding;
        }

        @Override // p992zv.C29247a.b
        /* JADX INFO: renamed from: a */
        public C28458r mo84348a() {
            return this.f64607a;
        }

        @Override // p992zv.C29247a.b
        /* JADX INFO: renamed from: b */
        public UGCImmVideoDetailViewModel mo84349b() {
            return UGCImmVideoItemView.this.detailViewModel;
        }

        @Override // p992zv.C29247a.b
        /* JADX INFO: renamed from: c */
        public UGCImmVideoDetailFragment mo84350c() {
            return UGCImmVideoItemView.this.fragment;
        }

        @Override // p992zv.C29247a.b
        /* JADX INFO: renamed from: d */
        public String mo84351d() {
            return UGCImmVideoItemView.this.trackId;
        }

        @Override // p992zv.C29247a.b
        /* JADX INFO: renamed from: e */
        public String mo84352e() {
            return UGCImmVideoItemView.this.previousPageVideoId;
        }

        @Override // p992zv.C29247a.b
        /* JADX INFO: renamed from: f */
        public String mo84353f() {
            return UGCImmVideoItemView.this.previousTrackId;
        }

        @Override // p992zv.C29247a.b
        /* JADX INFO: renamed from: g */
        public boolean mo84354g() {
            return UGCImmVideoItemView.this.isDownloadImmediately;
        }

        @Override // p992zv.C29247a.b
        public UGCImmVideo getData() {
            return UGCImmVideoItemView.this.data;
        }

        @Override // p992zv.C29247a.b
        /* JADX INFO: renamed from: h */
        public InterfaceC23704a mo84355h() {
            return UGCImmVideoItemView.this.getLoginApi();
        }

        @Override // p992zv.C29247a.b
        /* JADX INFO: renamed from: i */
        public void mo84356i(boolean z11) {
            UGCImmVideoItemView.this.isSubscriptionInitiatedByThisView = z11;
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.widget.UGCImmVideoItemView$b */
    public static final class C20389b implements C29251e.b {
        C20389b() {
        }

        @Override // p992zv.C29251e.b
        /* JADX INFO: renamed from: a */
        public void mo84357a(boolean z11) {
            UGCImmVideoItemView.this.setDownloadLoadingIconVisibility(z11);
        }

        @Override // p992zv.C29251e.b
        /* JADX INFO: renamed from: b */
        public UGCImmVideoDetailViewModel mo84358b() {
            return UGCImmVideoItemView.this.detailViewModel;
        }

        @Override // p992zv.C29251e.b
        /* JADX INFO: renamed from: c */
        public UGCImmVideoDetailFragment mo84359c() {
            return UGCImmVideoItemView.this.fragment;
        }

        @Override // p992zv.C29251e.b
        /* JADX INFO: renamed from: d */
        public String mo84360d() {
            return UGCImmVideoItemView.this.trackId;
        }

        @Override // p992zv.C29251e.b
        /* JADX INFO: renamed from: e */
        public String mo84361e() {
            return UGCImmVideoItemView.this.previousTrackId;
        }

        @Override // p992zv.C29251e.b
        /* JADX INFO: renamed from: f */
        public UGCDownloadViewModel mo84362f() {
            return UGCImmVideoItemView.this.downloadViewModel;
        }

        @Override // p992zv.C29251e.b
        /* JADX INFO: renamed from: g */
        public String mo84363g() {
            return UGCImmVideoItemView.this.previousPageVideoId;
        }

        @Override // p992zv.C29251e.b
        public UGCImmVideo getData() {
            return UGCImmVideoItemView.this.data;
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.widget.UGCImmVideoItemView$c */
    public static final class C20390c implements C29253g.a {

        /* JADX INFO: renamed from: a */
        private final C28458r f64610a;

        /* JADX INFO: renamed from: b */
        private final int f64611b;

        C20390c() {
            this.f64610a = UGCImmVideoItemView.this.viewBinding;
            this.f64611b = UGCImmVideoItemView.this.screenWidth;
        }

        @Override // p992zv.C29253g.a
        /* JADX INFO: renamed from: a */
        public C28458r mo84364a() {
            return this.f64610a;
        }

        @Override // p992zv.C29253g.a
        /* JADX INFO: renamed from: b */
        public UGCImmVideoDetailViewModel mo84365b() {
            return UGCImmVideoItemView.this.detailViewModel;
        }

        @Override // p992zv.C29253g.a
        /* JADX INFO: renamed from: c */
        public PagerLayoutManager mo84366c() {
            return UGCImmVideoItemView.this.pagerLayoutManager;
        }

        @Override // p992zv.C29253g.a
        /* JADX INFO: renamed from: d */
        public void mo84367d() {
            UGCImmVideoItemView.this.m84316M();
        }

        @Override // p992zv.C29253g.a
        /* JADX INFO: renamed from: e */
        public void mo84368e(boolean z11) {
            UGCImmVideoItemView.this.setControlVisible(z11);
        }

        @Override // p992zv.C29253g.a
        /* JADX INFO: renamed from: f */
        public void mo84369f(long j11) {
            UGCImmVideoItemView.this.m84326W(j11);
        }

        @Override // p992zv.C29253g.a
        /* JADX INFO: renamed from: g */
        public void mo84370g() {
            UGCImmVideoItemView.this.m84311H();
        }

        @Override // p992zv.C29253g.a
        public UGCImmVideo getData() {
            return UGCImmVideoItemView.this.data;
        }

        @Override // p992zv.C29253g.a
        public String getLogTag() {
            return UGCImmVideoItemView.this.TAG;
        }

        @Override // p992zv.C29253g.a
        public InterfaceC16634g getOrPlayer() {
            return UGCImmVideoItemView.this.orPlayer;
        }

        @Override // p992zv.C29253g.a
        /* JADX INFO: renamed from: h */
        public void mo84371h(boolean z11) {
            UGCImmVideoItemView.this.isClickPause = z11;
            UGCImmVideoDetailFragment uGCImmVideoDetailFragment = UGCImmVideoItemView.this.fragment;
            if (uGCImmVideoDetailFragment != null) {
                uGCImmVideoDetailFragment.m83725b1(z11);
            }
        }

        @Override // p992zv.C29253g.a
        /* JADX INFO: renamed from: i */
        public int mo84372i() {
            return this.f64611b;
        }

        @Override // p992zv.C29253g.a
        public boolean isLoading() {
            return UGCImmVideoItemView.this.isLoading;
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.widget.UGCImmVideoItemView$d */
    public static final class C20391d implements C29254h.a {

        /* JADX INFO: renamed from: a */
        private final C28458r f64613a;

        C20391d() {
            this.f64613a = UGCImmVideoItemView.this.viewBinding;
        }

        @Override // p992zv.C29254h.a
        /* JADX INFO: renamed from: a */
        public C28458r mo84373a() {
            return this.f64613a;
        }

        @Override // p992zv.C29254h.a
        /* JADX INFO: renamed from: b */
        public UGCImmVideoDetailViewModel mo84374b() {
            return UGCImmVideoItemView.this.detailViewModel;
        }

        @Override // p992zv.C29254h.a
        /* JADX INFO: renamed from: c */
        public void mo84375c(boolean z11) {
            UGCImmVideoItemView.this.setKeepScreenOn(z11);
        }

        @Override // p992zv.C29254h.a
        /* JADX INFO: renamed from: d */
        public void mo84376d() {
            UGCImmVideoDetailFragment uGCImmVideoDetailFragment = UGCImmVideoItemView.this.fragment;
            if (uGCImmVideoDetailFragment != null) {
                uGCImmVideoDetailFragment.hideLoading();
            }
        }

        @Override // p992zv.C29254h.a
        /* JADX INFO: renamed from: e */
        public C29260n mo84377e() {
            return UGCImmVideoItemView.this.getSubtitleDelegate();
        }

        @Override // p992zv.C29254h.a
        /* JADX INFO: renamed from: f */
        public C20310a mo84378f() {
            return UGCImmVideoItemView.this.dotLayer;
        }

        @Override // p992zv.C29254h.a
        public UGCImmVideo getData() {
            return UGCImmVideoItemView.this.data;
        }

        @Override // p992zv.C29254h.a
        public String getLogTag() {
            return UGCImmVideoItemView.this.TAG;
        }

        @Override // p992zv.C29254h.a
        public InterfaceC16634g getOrPlayer() {
            return UGCImmVideoItemView.this.orPlayer;
        }

        @Override // p992zv.C29254h.a
        public void showLoading() {
            UGCImmVideoDetailFragment uGCImmVideoDetailFragment = UGCImmVideoItemView.this.fragment;
            if (uGCImmVideoDetailFragment != null) {
                uGCImmVideoDetailFragment.startLoading();
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.widget.UGCImmVideoItemView$e */
    public static final class C20392e implements C29255i.a {
        C20392e() {
        }

        @Override // p992zv.C29255i.a
        /* JADX INFO: renamed from: d */
        public String mo84379d() {
            return UGCImmVideoItemView.this.trackId;
        }

        @Override // p992zv.C29255i.a
        /* JADX INFO: renamed from: e */
        public String mo84380e() {
            return UGCImmVideoItemView.this.previousPageVideoId;
        }

        @Override // p992zv.C29255i.a
        /* JADX INFO: renamed from: f */
        public String mo84381f() {
            return UGCImmVideoItemView.this.previousTrackId;
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.widget.UGCImmVideoItemView$f */
    public static final class C20393f implements RequestListener {
        C20393f() {
        }

        @Override // com.bumptech.glide.request.RequestListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean onResourceReady(Drawable resource, Object model, Target target, DataSource dataSource, boolean z11) {
            Intrinsics.m97802h(resource, "resource");
            Intrinsics.m97802h(model, "model");
            Intrinsics.m97802h(dataSource, "dataSource");
            C26866a.a.m104898f(C26866a.f81698a, UGCImmVideoItemView.this.TAG, "onResourceReady ", false, 4, null);
            return false;
        }

        @Override // com.bumptech.glide.request.RequestListener
        public boolean onLoadFailed(GlideException glideException, Object obj, Target target, boolean z11) {
            Intrinsics.m97802h(target, "target");
            C26866a.a.m104898f(C26866a.f81698a, UGCImmVideoItemView.this.TAG, "onLoadFailed ", false, 4, null);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.widget.UGCImmVideoItemView$g */
    public static final class C20394g implements C29260n.a {

        /* JADX INFO: renamed from: a */
        private final C28458r f64617a;

        C20394g() {
            this.f64617a = UGCImmVideoItemView.this.viewBinding;
        }

        @Override // p992zv.C29260n.a
        /* JADX INFO: renamed from: a */
        public C28458r mo84383a() {
            return this.f64617a;
        }

        @Override // p992zv.C29260n.a
        /* JADX INFO: renamed from: b */
        public C20324a mo84384b() {
            return UGCImmVideoItemView.this.subtitleViewModel;
        }

        @Override // p992zv.C29260n.a
        /* JADX INFO: renamed from: c */
        public UGCImmVideoDetailFragment mo84385c() {
            return UGCImmVideoItemView.this.fragment;
        }

        @Override // p992zv.C29260n.a
        public UGCImmVideo getData() {
            return UGCImmVideoItemView.this.data;
        }

        @Override // p992zv.C29260n.a
        public String getLogTag() {
            return UGCImmVideoItemView.this.TAG;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UGCImmVideoItemView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UGCImmVideoItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCImmVideoItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.TAG = "UGCImmVideoItemView";
        String string = UUID.randomUUID().toString();
        Intrinsics.m97801g(string, "toString(...)");
        this.trackId = string;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.reportDelegate = LazyKt.m97096a(lazyThreadSafetyMode, new Function0() { // from class: yv.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UGCImmVideoItemView.m84313J(this.f88742a);
            }
        });
        this.downloadDelegate = LazyKt.m97096a(lazyThreadSafetyMode, new Function0() { // from class: yv.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UGCImmVideoItemView.m84304A(this.f88745a);
            }
        });
        this.playerDelegate = LazyKt.m97096a(lazyThreadSafetyMode, new Function0() { // from class: yv.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UGCImmVideoItemView.m84312I(this.f88748a);
            }
        });
        this.actionDelegate = LazyKt.m97096a(lazyThreadSafetyMode, new Function0() { // from class: yv.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UGCImmVideoItemView.m84346y(this.f88751a);
            }
        });
        this.subtitleDelegate = LazyKt.m97096a(lazyThreadSafetyMode, new Function0() { // from class: yv.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UGCImmVideoItemView.m84324U(this.f88709a);
            }
        });
        this.gestureDelegate = LazyKt.m97096a(lazyThreadSafetyMode, new Function0() { // from class: yv.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UGCImmVideoItemView.m84305B(this.f88713a);
            }
        });
        this.screenWidth = AbstractC5806y.m27489e();
        this.DOWNLOAD_STATUS_DOWNLOAD_NONE = 1;
        this.DOWNLOAD_STATUS_DOWNLOADING = 2;
        this.DOWNLOAD_STATUS_DOWNLOAD_COMPLETE = 3;
        this.singleDownloadImmediatelyStatus = 1;
        this.loginApi = LazyKt.m97097b(new Function0() { // from class: yv.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UGCImmVideoItemView.m84309F();
            }
        });
        View.inflate(getContext(), R$layout.view_ugc_imm_video_detail_item, this);
        C28458r c28458rM109930a = C28458r.m109930a(this);
        Intrinsics.m97801g(c28458rM109930a, "bind(...)");
        this.viewBinding = c28458rM109930a;
        c28458rM109930a.f87418D.setOnClickListener(this);
        c28458rM109930a.f87417C.setOnClickListener(this);
        c28458rM109930a.f87453z.setOnClickListener(this);
        c28458rM109930a.f87442o.setOnClickListener(this);
        c28458rM109930a.f87438k.setOnClickListener(this);
        c28458rM109930a.f87444q.setOnClickListener(this);
        c28458rM109930a.f87422H.setOnClickListener(this);
        c28458rM109930a.f87443p.setOnClickListener(this);
        c28458rM109930a.f87445r.setOnClickListener(this);
        c28458rM109930a.f87446s.setOnClickListener(this);
        FrameLayout vTopStatus = c28458rM109930a.f87424J;
        Intrinsics.m97801g(vTopStatus, "vTopStatus");
        AbstractC26006c.m102052e(vTopStatus);
        getGestureDelegate().m112191i();
        m84307D();
        this.curStatus = -1;
        this.subscriptObserver = new InterfaceC3189c0() { // from class: yv.e
            @Override // androidx.p1004lifecycle.InterfaceC3189c0
            public final void onChanged(Object obj) {
                UGCImmVideoItemView.m84323T(this.f88719a, (Pair) obj);
            }
        };
        this.delayToastNetErrRunnable = new Runnable() { // from class: yv.f
            @Override // java.lang.Runnable
            public final void run() {
                UGCImmVideoItemView.m84347z(this.f88722a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C29251e m84304A(UGCImmVideoItemView uGCImmVideoItemView) {
        return new C29251e(uGCImmVideoItemView.new C20389b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C29253g m84305B(UGCImmVideoItemView uGCImmVideoItemView) {
        return new C29253g(uGCImmVideoItemView.new C20390c(), uGCImmVideoItemView.getReportDelegate());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    /* JADX INFO: renamed from: C */
    private final void m84306C(UGCVideo video) {
        boolean z11;
        UGCVideoPlayInfo playInfo;
        List<UGCVideoPlayStream> resources;
        if (video.isCollection()) {
            z11 = false;
        } else {
            z11 = true;
            if (video.getDownloadStyle() != null) {
                Integer downloadStyle = video.getDownloadStyle();
                if (downloadStyle == null || downloadStyle.intValue() != 1) {
                    z11 = false;
                }
            } else {
                UGCImmVideo uGCImmVideo = this.data;
                if (((uGCImmVideo == null || (playInfo = uGCImmVideo.getPlayInfo()) == null || (resources = playInfo.getResources()) == null) ? 0 : resources.size()) > 1) {
                    z11 = false;
                }
            }
        }
        this.isDownloadImmediately = z11;
        if (z11) {
            UGCImmVideo uGCImmVideo2 = this.data;
            m84325V(uGCImmVideo2 != null ? uGCImmVideo2.getDownloadStatus() : 0);
        } else {
            setDownloadLoadingIconVisibility(false);
            this.viewBinding.f87438k.setImageResource(R$drawable.ugc_imm_video_ic_download);
        }
    }

    /* JADX INFO: renamed from: D */
    private final void m84307D() {
        if (Build.VERSION.SDK_INT >= 30) {
            post(new Runnable() { // from class: yv.g
                @Override // java.lang.Runnable
                public final void run() {
                    UGCImmVideoItemView.m84308E(this.f88724a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX INFO: renamed from: E */
    public static final void m84308E(UGCImmVideoItemView uGCImmVideoItemView) {
        WindowInsets rootWindowInsets;
        Insets insets;
        boolean z11;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Context context = uGCImmVideoItemView.getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type android.app.Activity");
        Window window = ((Activity) context).getWindow();
        if (window == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null || (insets = rootWindowInsets.getInsets(WindowInsets.Type.tappableElement())) == null) {
            return;
        }
        if (AbstractC5781d.m27353e(window)) {
            z11 = AbstractC5781d.m27349a() > 1;
        }
        int iM27313a = AbstractC5776a0.m27313a(24.0f);
        int iM27313a2 = Build.VERSION.SDK_INT >= 35 ? AbstractC5776a0.m27313a(20.0f) + RangesKt.m97935e(iM27313a, insets.top) : RangesKt.m97935e(iM27313a, insets.top);
        if (z11 || insets.top <= 0) {
            Space progressUgcImmGuideline = uGCImmVideoItemView.viewBinding.f87450w;
            Intrinsics.m97801g(progressUgcImmGuideline, "progressUgcImmGuideline");
            ViewGroup.LayoutParams layoutParams = progressUgcImmGuideline.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
            ViewGroup.LayoutParams layoutParams2 = uGCImmVideoItemView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i11 = marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0;
            ViewGroup.LayoutParams layoutParams3 = uGCImmVideoItemView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int i12 = marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0;
            ViewGroup.LayoutParams layoutParams4 = uGCImmVideoItemView.getLayoutParams();
            marginLayoutParams = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            c2308b.setMargins(i11, i12, marginLayoutParams != null ? marginLayoutParams.rightMargin : 0, iM27313a);
            progressUgcImmGuideline.setLayoutParams(c2308b);
            return;
        }
        Space progressUgcImmGuideline2 = uGCImmVideoItemView.viewBinding.f87450w;
        Intrinsics.m97801g(progressUgcImmGuideline2, "progressUgcImmGuideline");
        ViewGroup.LayoutParams layoutParams5 = progressUgcImmGuideline2.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.C2308b c2308b2 = (ConstraintLayout.C2308b) layoutParams5;
        ViewGroup.LayoutParams layoutParams6 = uGCImmVideoItemView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
        int i13 = marginLayoutParams4 != null ? marginLayoutParams4.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams7 = uGCImmVideoItemView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
        int i14 = marginLayoutParams5 != null ? marginLayoutParams5.topMargin : 0;
        ViewGroup.LayoutParams layoutParams8 = uGCImmVideoItemView.getLayoutParams();
        marginLayoutParams = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
        c2308b2.setMargins(i13, i14, marginLayoutParams != null ? marginLayoutParams.rightMargin : 0, iM27313a2);
        progressUgcImmGuideline2.setLayoutParams(c2308b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final InterfaceC23704a m84309F() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: renamed from: G */
    private final void m84310G(int resolution) {
        UGCVideoPlayInfo playInfo;
        Integer numValueOf;
        Object next;
        UGCVideo ugcVideo;
        Map mapMo102959a;
        UGCVideo ugcVideo2;
        UGCImmVideo uGCImmVideo = this.data;
        if (uGCImmVideo == null || (playInfo = uGCImmVideo.getPlayInfo()) == null) {
            return;
        }
        Iterator<T> it = playInfo.getResources().iterator();
        do {
            numValueOf = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.m97797c(((UGCVideoPlayStream) next).getResolutions(), String.valueOf(resolution)));
        UGCVideoPlayStream uGCVideoPlayStream = (UGCVideoPlayStream) next;
        if (uGCVideoPlayStream == null) {
            return;
        }
        String url = uGCVideoPlayStream.getUrl();
        String url2 = uGCVideoPlayStream.getUrl();
        UGCImmVideo uGCImmVideo2 = this.data;
        boolean zContainsKey = false;
        C23403e c23403e = new C23403e(url, url2, (uGCImmVideo2 == null || (ugcVideo2 = uGCImmVideo2.getUgcVideo()) == null) ? 0 : ugcVideo2.videoUGCPosition(), null, null, 24, null);
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        InterfaceC26373f interfaceC26373f = interfaceC16634g instanceof InterfaceC26373f ? (InterfaceC26373f) interfaceC16634g : null;
        if (interfaceC26373f != null && (mapMo102959a = interfaceC26373f.mo102959a()) != null) {
            zContainsKey = mapMo102959a.containsKey(c23403e.m92929e());
        }
        C26866a.a aVar = C26866a.f81698a;
        String str = this.TAG;
        UGCImmVideo uGCImmVideo3 = this.data;
        if (uGCImmVideo3 != null && (ugcVideo = uGCImmVideo3.getUgcVideo()) != null) {
            numValueOf = Integer.valueOf(ugcVideo.videoUGCPosition());
        }
        C26866a.a.m104898f(aVar, str, "resolution play, resolution:" + resolution + ", EP:" + numValueOf + ", inList:" + zContainsKey + ", url:" + uGCVideoPlayStream.getUrl(), false, 4, null);
        InterfaceC16634g interfaceC16634g2 = this.orPlayer;
        long currentPosition = interfaceC16634g2 != null ? interfaceC16634g2.getCurrentPosition() : 0L;
        if (!zContainsKey) {
            InterfaceC16634g interfaceC16634g3 = this.orPlayer;
            if (interfaceC16634g3 != null) {
                interfaceC16634g3.addDataSource(c23403e);
            }
            InterfaceC16634g interfaceC16634g4 = this.orPlayer;
            if (interfaceC16634g4 != null) {
                interfaceC16634g4.prepare();
            }
        }
        InterfaceC16634g interfaceC16634g5 = this.orPlayer;
        if (interfaceC16634g5 != null) {
            String strM92929e = c23403e.m92929e();
            if (strM92929e == null) {
                strM92929e = "";
            }
            interfaceC16634g5.seekTo(strM92929e, currentPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public final void m84311H() {
        getPlayerDelegate().m112198e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C29254h m84312I(UGCImmVideoItemView uGCImmVideoItemView) {
        return new C29254h(uGCImmVideoItemView.new C20391d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C29255i m84313J(UGCImmVideoItemView uGCImmVideoItemView) {
        return new C29255i(uGCImmVideoItemView.new C20392e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final void m84314K(UGCVideo uGCVideo, UGCImmVideoItemView uGCImmVideoItemView, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        List<UGCVideoHashTag> filteredHashTags = uGCVideo.getFilteredHashTags();
        UGCVideoHashTag uGCVideoHashTag = filteredHashTags != null ? (UGCVideoHashTag) CollectionsKt.m97362l0(filteredHashTags, i11) : null;
        C29255i reportDelegate = uGCImmVideoItemView.getReportDelegate();
        UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel = uGCImmVideoItemView.detailViewModel;
        reportDelegate.m112203a("hash_tag", uGCVideo, uGCImmVideoDetailViewModel != null ? Boolean.valueOf(uGCImmVideoDetailViewModel.m84203Y0()) : null, uGCVideoHashTag != null ? uGCVideoHashTag.getTag() : null, Integer.valueOf(i11));
        Navigator.m61845x(TheRouter.m61773c("/home/hashtag").m61855I("titleHashTag", uGCVideoHashTag).m61857K("UGCVideoId", uGCVideo.getUgcVideoId()), uGCImmVideoItemView.getContext(), null, 2, null);
    }

    /* JADX INFO: renamed from: L */
    private final void m84315L() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastShowNetWorkErrToastTime > ToastStrategy.LONG_DURATION_TIMEOUT) {
            this.lastShowNetWorkErrToastTime = jCurrentTimeMillis;
            C28951b.f88586a.m111454d(R$string.no_network_toast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final void m84316M() {
        UGCImmVideoDetailFragment uGCImmVideoDetailFragment;
        FragmentManager childFragmentManager;
        Object objM112707constructorimpl;
        UGCImmVideoDetailFragment uGCImmVideoDetailFragment2 = this.fragment;
        if (uGCImmVideoDetailFragment2 == null || !uGCImmVideoDetailFragment2.isAdded() || (uGCImmVideoDetailFragment = this.fragment) == null || (childFragmentManager = uGCImmVideoDetailFragment.getChildFragmentManager()) == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            UGCImmVideoSettingDialog uGCImmVideoSettingDialogM83676a = UGCImmVideoSettingDialog.INSTANCE.m83676a();
            uGCImmVideoSettingDialogM83676a.m83672u0(new Function1() { // from class: yv.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UGCImmVideoItemView.m84317N(this.f88705a, ((Float) obj).floatValue());
                }
            });
            uGCImmVideoSettingDialogM83676a.m83671t0(new Function1() { // from class: yv.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UGCImmVideoItemView.m84318O(this.f88728a, ((Integer) obj).intValue());
                }
            });
            uGCImmVideoSettingDialogM83676a.m83673v0(new Function1() { // from class: yv.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UGCImmVideoItemView.m84319P(this.f88729a, (C24469a) obj);
                }
            });
            uGCImmVideoSettingDialogM83676a.m83670s0(new Function0() { // from class: yv.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UGCImmVideoItemView.m84320Q(this.f88732a);
                }
            });
            uGCImmVideoSettingDialogM83676a.m83669r0(new Function1() { // from class: yv.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UGCImmVideoItemView.m84322S(this.f88735a, ((Boolean) obj).booleanValue());
                }
            });
            uGCImmVideoSettingDialogM83676a.show(childFragmentManager, "UGCImmVideoSettingDialog");
            objM112707constructorimpl = Result.m112707constructorimpl(uGCImmVideoSettingDialogM83676a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Result.m112706boximpl(objM112707constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final Unit m84317N(UGCImmVideoItemView uGCImmVideoItemView, float f11) {
        UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel = uGCImmVideoItemView.detailViewModel;
        if (uGCImmVideoDetailViewModel != null) {
            uGCImmVideoDetailViewModel.m84208e1(f11);
        }
        InterfaceC16634g interfaceC16634g = uGCImmVideoItemView.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.setSpeed(f11);
        }
        C26866a.a.m104898f(C26866a.f81698a, uGCImmVideoItemView.TAG, "setSpeed speed:" + f11, false, 4, null);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final Unit m84318O(UGCImmVideoItemView uGCImmVideoItemView, int i11) {
        C26866a.a.m104898f(C26866a.f81698a, uGCImmVideoItemView.TAG, "resolution change:" + i11, false, 4, null);
        uGCImmVideoItemView.m84310G(i11);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final Unit m84319P(UGCImmVideoItemView uGCImmVideoItemView, C24469a subtitle) {
        Intrinsics.m97802h(subtitle, "subtitle");
        C26866a.a.m104898f(C26866a.f81698a, uGCImmVideoItemView.TAG, "subtitle change:" + subtitle, false, 4, null);
        uGCImmVideoItemView.getSubtitleDelegate().m112218o(subtitle);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final Unit m84320Q(final UGCImmVideoItemView uGCImmVideoItemView) {
        uGCImmVideoItemView.isBarHide = true;
        uGCImmVideoItemView.post(new Runnable() { // from class: yv.h
            @Override // java.lang.Runnable
            public final void run() {
                UGCImmVideoItemView.m84321R(this.f88726a);
            }
        });
        uGCImmVideoItemView.setControlVisible(false);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final void m84321R(UGCImmVideoItemView uGCImmVideoItemView) {
        UGCImmVideoDetailFragment uGCImmVideoDetailFragment = uGCImmVideoItemView.fragment;
        if (uGCImmVideoDetailFragment != null) {
            ImmersionBar.with(uGCImmVideoDetailFragment).hideBar(BarHide.FLAG_HIDE_BAR).init();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final Unit m84322S(UGCImmVideoItemView uGCImmVideoItemView, boolean z11) {
        InterfaceC16634g interfaceC16634g = uGCImmVideoItemView.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.setLooping(!z11);
        }
        C26866a.a.m104898f(C26866a.f81698a, uGCImmVideoItemView.TAG, "autoplay change:" + z11, false, 4, null);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final void m84323T(UGCImmVideoItemView uGCImmVideoItemView, Pair pair) {
        UGCVideo ugcVideo;
        UGCVideoCreator creator;
        String uid;
        UGCVideo ugcVideo2;
        UGCVideoCreator creator2;
        UGCVideo ugcVideo3;
        UGCVideoCreator creator3;
        String uid2 = null;
        String str = pair != null ? (String) pair.getFirst() : null;
        UGCImmVideo uGCImmVideo = uGCImmVideoItemView.data;
        if (uGCImmVideo != null && (ugcVideo3 = uGCImmVideo.getUgcVideo()) != null && (creator3 = ugcVideo3.getCreator()) != null) {
            uid2 = creator3.getUid();
        }
        if (Intrinsics.m97797c(str, uid2)) {
            boolean z11 = uGCImmVideoItemView.isSubscriptionInitiatedByThisView;
            if (z11) {
                uGCImmVideoItemView.isSubscriptionInitiatedByThisView = false;
                ProgressBar pbUgcImmSubscribeLoading = uGCImmVideoItemView.viewBinding.f87448u;
                Intrinsics.m97801g(pbUgcImmSubscribeLoading, "pbUgcImmSubscribeLoading");
                AbstractC26006c.m102054g(pbUgcImmSubscribeLoading);
            }
            if (pair == null) {
                if (z11) {
                    AppCompatImageView ivUgcImmSubscribe = uGCImmVideoItemView.viewBinding.f87443p;
                    Intrinsics.m97801g(ivUgcImmSubscribe, "ivUgcImmSubscribe");
                    AbstractC26006c.m102058k(ivUgcImmSubscribe);
                    return;
                }
                return;
            }
            if (((Boolean) pair.getSecond()).booleanValue()) {
                AppCompatImageView ivUgcImmSubscribe2 = uGCImmVideoItemView.viewBinding.f87443p;
                Intrinsics.m97801g(ivUgcImmSubscribe2, "ivUgcImmSubscribe");
                AbstractC26006c.m102054g(ivUgcImmSubscribe2);
            }
            UGCImmVideo uGCImmVideo2 = uGCImmVideoItemView.data;
            if (uGCImmVideo2 != null && (ugcVideo2 = uGCImmVideo2.getUgcVideo()) != null && (creator2 = ugcVideo2.getCreator()) != null) {
                creator2.setHasSubscribe((Boolean) pair.getSecond());
            }
            if (z11) {
                AbstractC14567m.m65696c(((Boolean) pair.getSecond()).booleanValue() ? com.transsion.baseui.R$string.ugc_video_detail_followed : com.transsion.baseui.R$string.ugc_video_detail_unfollowed);
                UGCImmVideo uGCImmVideo3 = uGCImmVideoItemView.data;
                if (uGCImmVideo3 == null || (ugcVideo = uGCImmVideo3.getUgcVideo()) == null || (creator = ugcVideo.getCreator()) == null || (uid = creator.getUid()) == null) {
                    return;
                }
                C28041d c28041d = new C28041d(uid, ((Boolean) pair.getSecond()).booleanValue());
                FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
                String name = C28041d.class.getName();
                Intrinsics.m97801g(name, "getName(...)");
                flowEventBus.postEvent(name, c28041d, 0L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C29260n m84324U(UGCImmVideoItemView uGCImmVideoItemView) {
        return new C29260n(uGCImmVideoItemView.new C20394g());
    }

    /* JADX INFO: renamed from: V */
    private final void m84325V(int status) {
        switch (status) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
                this.singleDownloadImmediatelyStatus = this.DOWNLOAD_STATUS_DOWNLOADING;
                setDownloadLoadingIconVisibility(true);
                break;
            case 5:
                this.singleDownloadImmediatelyStatus = this.DOWNLOAD_STATUS_DOWNLOAD_COMPLETE;
                setDownloadLoadingIconVisibility(false);
                this.viewBinding.f87438k.setImageResource(R$drawable.ugc_imm_video_ic_downloaded);
                break;
            default:
                this.singleDownloadImmediatelyStatus = this.DOWNLOAD_STATUS_DOWNLOAD_NONE;
                setDownloadLoadingIconVisibility(false);
                this.viewBinding.f87438k.setImageResource(R$drawable.ugc_imm_video_ic_download);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public final void m84326W(long progress) {
        getPlayerDelegate().m112200g(progress);
    }

    /* JADX INFO: renamed from: X */
    private final void m84327X(long max) {
        getPlayerDelegate().m112201h(max);
    }

    /* JADX INFO: renamed from: Y */
    private final void m84328Y(Integer w11, Integer h11) {
        if (w11 == null || h11 == null || w11.intValue() == 0) {
            return;
        }
        int i11 = this.screenWidth;
        int iM27487c = w11.intValue() > h11.intValue() ? (int) (AbstractC5806y.m27487c() * 0.14f) : 0;
        FrameLayout flUgcImmContainer = this.viewBinding.f87431d;
        Intrinsics.m97801g(flUgcImmContainer, "flUgcImmContainer");
        ViewGroup.LayoutParams layoutParams = flUgcImmContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
        int iIntValue = (h11.intValue() * this.screenWidth) / w11.intValue();
        if (i11 != ((ViewGroup.MarginLayoutParams) c2308b).width || iIntValue != ((ViewGroup.MarginLayoutParams) c2308b).height) {
            ((ViewGroup.MarginLayoutParams) c2308b).width = i11;
            ((ViewGroup.MarginLayoutParams) c2308b).height = iIntValue;
            C26866a.a.m104908v(C26866a.f81698a, this.TAG, "=====> updateSurface, w:" + i11 + ", h:" + iIntValue, false, 4, null);
        }
        ((ViewGroup.MarginLayoutParams) c2308b).bottomMargin = iM27487c;
        flUgcImmContainer.setLayoutParams(c2308b);
        AppCompatImageView ivUgcImmCover = this.viewBinding.f87437j;
        Intrinsics.m97801g(ivUgcImmCover, "ivUgcImmCover");
        ViewGroup.LayoutParams layoutParams2 = ivUgcImmCover.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.C2308b c2308b2 = (ConstraintLayout.C2308b) layoutParams2;
        ((ViewGroup.MarginLayoutParams) c2308b2).bottomMargin = iM27487c;
        ivUgcImmCover.setLayoutParams(c2308b2);
    }

    private final C29247a getActionDelegate() {
        return (C29247a) this.actionDelegate.getValue();
    }

    private final C29251e getDownloadDelegate() {
        return (C29251e) this.downloadDelegate.getValue();
    }

    private final C29253g getGestureDelegate() {
        return (C29253g) this.gestureDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC23704a getLoginApi() {
        return (InterfaceC23704a) this.loginApi.getValue();
    }

    private final C29254h getPlayerDelegate() {
        return (C29254h) this.playerDelegate.getValue();
    }

    private final C29255i getReportDelegate() {
        return (C29255i) this.reportDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C29260n getSubtitleDelegate() {
        return (C29260n) this.subtitleDelegate.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:115:0x02b6 A[PHI: r5
      0x02b6: PHI (r5v38 java.lang.String) = (r5v26 java.lang.String), (r5v28 java.lang.String), (r5v40 java.lang.String) binds: [B:120:0x02c4, B:123:0x02cc, B:113:0x02b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    private final void setContent(UGCImmVideo data) {
        boolean zM97797c;
        String url;
        String str;
        Object objM112707constructorimpl;
        FragmentActivity activity;
        int i11;
        Integer width;
        Integer height;
        Integer width2;
        Integer height2;
        FirstFrame firstImage;
        Integer width3;
        FirstFrame firstImage2;
        Integer height3;
        FirstFrame firstImage3;
        String str2;
        String description;
        UGCVideo ugcVideo;
        UGCVideoCreator creator;
        LiveData liveDataM84188I0;
        int iIntValue = 1;
        UGCVideo ugcVideo2 = data.getUgcVideo();
        if (ugcVideo2 == null) {
            return;
        }
        UGCVideoCreator creator2 = ugcVideo2.getCreator();
        String string = "";
        if (creator2 != null) {
            C23860f.a aVar = C23860f.f72909a;
            Context context = getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(context);
            String avatar = creator2.getAvatar();
            if (avatar == null) {
                avatar = "";
            }
            C23860f.b bVarM94470i = bVarM94457m.m94468g(avatar).m94470i(R$color.white_20);
            ShapeableImageView ivUgcImmUserCover = this.viewBinding.f87444q;
            Intrinsics.m97801g(ivUgcImmUserCover, "ivUgcImmUserCover");
            bVarM94470i.m94465d(ivUgcImmUserCover);
            this.viewBinding.f87422H.setText(creator2.getNickname());
        }
        UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel = this.detailViewModel;
        if (uGCImmVideoDetailViewModel == null || !uGCImmVideoDetailViewModel.m84203Y0()) {
            UGCVideoCreator creator3 = ugcVideo2.getCreator();
            if (creator3 != null) {
                zM97797c = Intrinsics.m97797c(creator3.getHasSubscribe(), Boolean.TRUE);
            } else {
                zM97797c = false;
            }
        } else {
            UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel2 = this.detailViewModel;
            UGCImmVideo uGCImmVideo = (uGCImmVideoDetailViewModel2 == null || (liveDataM84188I0 = uGCImmVideoDetailViewModel2.m84188I0()) == null) ? null : (UGCImmVideo) liveDataM84188I0.m14847f();
            if (uGCImmVideo == null || (ugcVideo = uGCImmVideo.getUgcVideo()) == null || (creator = ugcVideo.getCreator()) == null) {
                zM97797c = false;
            } else {
                zM97797c = Intrinsics.m97797c(creator.getHasSubscribe(), Boolean.TRUE);
            }
        }
        AppCompatImageView ivUgcImmSubscribe = this.viewBinding.f87443p;
        Intrinsics.m97801g(ivUgcImmSubscribe, "ivUgcImmSubscribe");
        ivUgcImmSubscribe.setVisibility(!zM97797c ? 0 : 8);
        this.viewBinding.f87422H.setMaxWidth(this.screenWidth - AbstractC23384a.m92908b(zM97797c ? Sdk$SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE : 142));
        String description2 = ugcVideo2.getDescription();
        if (description2 == null || description2.length() == 0) {
            NestedScrollableHost nsUgcImmPostDes = this.viewBinding.f87447t;
            Intrinsics.m97801g(nsUgcImmPostDes, "nsUgcImmPostDes");
            AbstractC26006c.m102054g(nsUgcImmPostDes);
        } else {
            this.viewBinding.f87430c.setText(ugcVideo2.getDescription());
            if (ugcVideo2.videoUGCPosition() > 0) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
                description = String.format("EP%s | %s", Arrays.copyOf(new Object[]{Integer.valueOf(ugcVideo2.videoUGCPosition()), ugcVideo2.getDescription()}, 2));
                Intrinsics.m97801g(description, "format(...)");
            } else {
                description = ugcVideo2.getDescription();
            }
            this.viewBinding.f87430c.m84507l(description);
            NestedScrollableHost nsUgcImmPostDes2 = this.viewBinding.f87447t;
            Intrinsics.m97801g(nsUgcImmPostDes2, "nsUgcImmPostDes");
            AbstractC26006c.m102058k(nsUgcImmPostDes2);
        }
        RecyclerView recyclerView = this.viewBinding.f87451x;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        if (this.viewBinding.f87451x.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C25826c(AbstractC23384a.m92908b(12), AbstractC23384a.m92908b(8)));
        }
        setupHashTags(ugcVideo2);
        UGCVideoInteractiveInfo interactiveInfo = ugcVideo2.getInteractiveInfo();
        if (interactiveInfo != null) {
            AppCompatTextView appCompatTextView = this.viewBinding.f87418D;
            String likeNum = interactiveInfo.getLikeNum();
            if (likeNum == null) {
                likeNum = "0";
            }
            Long lX = StringsKt.m98218x(likeNum);
            appCompatTextView.setText(AbstractC14564j.m65680a(lX != null ? lX.longValue() : 0L));
            AppCompatTextView appCompatTextView2 = this.viewBinding.f87418D;
            Boolean hasLike = interactiveInfo.getHasLike();
            Boolean bool = Boolean.TRUE;
            appCompatTextView2.setSelected(Intrinsics.m97797c(hasLike, bool));
            AppCompatTextView appCompatTextView3 = this.viewBinding.f87417C;
            String favoriteNum = interactiveInfo.getFavoriteNum();
            if (favoriteNum == null) {
                favoriteNum = "0";
            }
            Long lX2 = StringsKt.m98218x(favoriteNum);
            appCompatTextView3.setText(AbstractC14564j.m65680a(lX2 != null ? lX2.longValue() : 0L));
            this.viewBinding.f87417C.setSelected(Intrinsics.m97797c(interactiveInfo.getHasFavorite(), bool));
            AppCompatTextView appCompatTextView4 = this.viewBinding.f87453z;
            String commentNum = interactiveInfo.getCommentNum();
            Long lX3 = StringsKt.m98218x(commentNum != null ? commentNum : "0");
            appCompatTextView4.setText(AbstractC14564j.m65680a(lX3 != null ? lX3.longValue() : 0L));
        }
        String str3 = " ";
        if (ugcVideo2.isCollection()) {
            this.isEpLayoutShow = true;
            ConstraintLayout layoutUgcImmTvEpisode = this.viewBinding.f87445r;
            Intrinsics.m97801g(layoutUgcImmTvEpisode, "layoutUgcImmTvEpisode");
            AbstractC26006c.m102058k(layoutUgcImmTvEpisode);
            AppCompatTextView appCompatTextView5 = this.viewBinding.f87416B;
            if (ugcVideo2.isShortTv()) {
                Context context2 = getContext();
                int i12 = com.transsion.ugcvideodetail.R$string.ugc_video_detail_short_tv_prefix;
                String title = ugcVideo2.getTitle();
                if (title == null) {
                    title = " ";
                }
                string = context2.getString(i12, title);
            } else {
                String title2 = ugcVideo2.getTitle();
                if (title2 != null) {
                    string = title2;
                }
            }
            appCompatTextView5.setText(string);
            int iVideoUGCPosition = ugcVideo2.videoUGCPosition();
            if (iVideoUGCPosition > 0) {
                this.viewBinding.f87415A.setText("/EP" + iVideoUGCPosition);
            }
            AppCompatImageView ivUgcImmEpTitleIc = this.viewBinding.f87440m;
            Intrinsics.m97801g(ivUgcImmEpTitleIc, "ivUgcImmEpTitleIc");
            UGCVideoTypeKt.m83627h(ivUgcImmEpTitleIc, ugcVideo2, Integer.valueOf(AbstractC23384a.m92908b(16)));
        } else {
            this.isEpLayoutShow = false;
            ConstraintLayout layoutUgcImmTvEpisode2 = this.viewBinding.f87445r;
            Intrinsics.m97801g(layoutUgcImmTvEpisode2, "layoutUgcImmTvEpisode");
            AbstractC26006c.m102054g(layoutUgcImmTvEpisode2);
        }
        List<String> searchWord = ugcVideo2.getSearchWord();
        if (searchWord == null || searchWord.isEmpty()) {
            this.isSearchShow = false;
            FrameLayout layoutUgcImmTvSearch = this.viewBinding.f87446s;
            Intrinsics.m97801g(layoutUgcImmTvSearch, "layoutUgcImmTvSearch");
            AbstractC26006c.m102054g(layoutUgcImmTvSearch);
        } else {
            this.isSearchShow = true;
            FrameLayout layoutUgcImmTvSearch2 = this.viewBinding.f87446s;
            Intrinsics.m97801g(layoutUgcImmTvSearch2, "layoutUgcImmTvSearch");
            AbstractC26006c.m102058k(layoutUgcImmTvSearch2);
            TextView textView = this.viewBinding.f87421G;
            Context context3 = getContext();
            int i13 = com.transsion.ugcvideodetail.R$string.ugc_video_detail_search_prefix;
            List<String> searchWord2 = ugcVideo2.getSearchWord();
            if (searchWord2 != null && (str2 = (String) CollectionsKt.m97361k0(searchWord2)) != null) {
                str3 = str2;
            }
            textView.setText(context3.getString(i13, str3));
        }
        UGCVideoPlayInfo playInfo = data.getPlayInfo();
        if (playInfo == null || (firstImage3 = playInfo.getFirstImage()) == null || (url = firstImage3.getUrl()) == null) {
            Cover coverVertical = ugcVideo2.getCoverVertical();
            url = coverVertical != null ? coverVertical.getUrl() : null;
            if (url != null) {
                str = url;
            } else {
                Cover cover = ugcVideo2.getCover();
                if (cover != null) {
                    url = cover.getUrl();
                    str = url;
                } else {
                    str = null;
                }
            }
        } else {
            str = url;
        }
        int i14 = this.screenWidth / 2;
        try {
            Result.Companion companion = Result.INSTANCE;
            UGCVideoPlayInfo playInfo2 = data.getPlayInfo();
            if ((playInfo2 != null ? playInfo2.getFirstImage() : null) != null) {
                UGCVideoPlayInfo playInfo3 = data.getPlayInfo();
                int iIntValue2 = ((playInfo3 == null || (firstImage2 = playInfo3.getFirstImage()) == null || (height3 = firstImage2.getHeight()) == null) ? 0 : height3.intValue()) * i14;
                UGCVideoPlayInfo playInfo4 = data.getPlayInfo();
                if (playInfo4 != null && (firstImage = playInfo4.getFirstImage()) != null && (width3 = firstImage.getWidth()) != null) {
                    iIntValue = width3.intValue();
                }
                i11 = iIntValue2 / iIntValue;
            } else if (ugcVideo2.getCoverVertical() != null) {
                Cover coverVertical2 = ugcVideo2.getCoverVertical();
                int iIntValue3 = ((coverVertical2 == null || (height2 = coverVertical2.getHeight()) == null) ? 0 : height2.intValue()) * i14;
                Cover coverVertical3 = ugcVideo2.getCoverVertical();
                if (coverVertical3 != null && (width2 = coverVertical3.getWidth()) != null) {
                    iIntValue = width2.intValue();
                }
                i11 = iIntValue3 / iIntValue;
            } else {
                Cover cover2 = ugcVideo2.getCover();
                int iIntValue4 = ((cover2 == null || (height = cover2.getHeight()) == null) ? 0 : height.intValue()) * i14;
                Cover cover3 = ugcVideo2.getCover();
                if (cover3 != null && (width = cover3.getWidth()) != null) {
                    iIntValue = width.intValue();
                }
                i11 = iIntValue4 / iIntValue;
            }
            objM112707constructorimpl = Result.m112707constructorimpl(Integer.valueOf(i11));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Integer num = (Integer) (Result.m112713isFailureimpl(objM112707constructorimpl) ? null : objM112707constructorimpl);
        int iIntValue5 = num != null ? num.intValue() : 0;
        if (str != null) {
            String strM93008d = C23424b.f71424a.m93008d(str, (120 & 2) != 0 ? 0 : i14, (120 & 4) != 0 ? 0 : iIntValue5, (120 & 8) != 0, (120 & 16) != 0 ? false : false, (120 & 32) == 0 ? false : false, (120 & 64) != 0 ? 25 : 0);
            if (Intrinsics.m97797c(strM93008d, this.viewBinding.f87437j.getTag())) {
                return;
            }
            UGCImmVideoDetailFragment uGCImmVideoDetailFragment = this.fragment;
            if (uGCImmVideoDetailFragment != null && (activity = uGCImmVideoDetailFragment.getActivity()) != null) {
                this.viewBinding.f87437j.setTag(strM93008d);
                Glide.with(activity).load2(strM93008d).addListener(new C20393f()).into(this.viewBinding.f87437j);
            }
        }
        m84306C(ugcVideo2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setControlVisible(boolean show) {
        AppCompatImageView appCompatImageViewM83723L0;
        UGCImmVideoDetailFragment uGCImmVideoDetailFragment;
        if (show && this.isBarHide && (uGCImmVideoDetailFragment = this.fragment) != null) {
            this.isBarHide = false;
            ImmersionBar.with(uGCImmVideoDetailFragment).hideBar(BarHide.FLAG_SHOW_BAR).init();
        }
        UGCImmVideoDetailFragment uGCImmVideoDetailFragment2 = this.fragment;
        if (uGCImmVideoDetailFragment2 != null && (appCompatImageViewM83723L0 = uGCImmVideoDetailFragment2.m83723L0()) != null) {
            appCompatImageViewM83723L0.setVisibility(show ? 0 : 8);
        }
        Group groupUgcImmControl = this.viewBinding.f87436i;
        Intrinsics.m97801g(groupUgcImmControl, "groupUgcImmControl");
        groupUgcImmControl.setVisibility(show ? 0 : 8);
        FrameLayout layoutUgcImmTvSearch = this.viewBinding.f87446s;
        Intrinsics.m97801g(layoutUgcImmTvSearch, "layoutUgcImmTvSearch");
        layoutUgcImmTvSearch.setVisibility(show && this.isSearchShow ? 0 : 8);
        ConstraintLayout layoutUgcImmTvEpisode = this.viewBinding.f87445r;
        Intrinsics.m97801g(layoutUgcImmTvEpisode, "layoutUgcImmTvEpisode");
        layoutUgcImmTvEpisode.setVisibility(show && this.isEpLayoutShow ? 0 : 8);
        RecyclerView rvUgcImmTags = this.viewBinding.f87451x;
        Intrinsics.m97801g(rvUgcImmTags, "rvUgcImmTags");
        rvUgcImmTags.setVisibility(show && this.isHashTagShow ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDownloadLoadingIconVisibility(boolean show) {
        if (show) {
            AppCompatImageView ivUgcImmDownload = this.viewBinding.f87438k;
            Intrinsics.m97801g(ivUgcImmDownload, "ivUgcImmDownload");
            AbstractC26006c.m102055h(ivUgcImmDownload);
            UGCImmRingLoadingView vUgcImmDownloadLoading = this.viewBinding.f87425K;
            Intrinsics.m97801g(vUgcImmDownloadLoading, "vUgcImmDownloadLoading");
            AbstractC26006c.m102058k(vUgcImmDownloadLoading);
            return;
        }
        AppCompatImageView ivUgcImmDownload2 = this.viewBinding.f87438k;
        Intrinsics.m97801g(ivUgcImmDownload2, "ivUgcImmDownload");
        AbstractC26006c.m102058k(ivUgcImmDownload2);
        UGCImmRingLoadingView vUgcImmDownloadLoading2 = this.viewBinding.f87425K;
        Intrinsics.m97801g(vUgcImmDownloadLoading2, "vUgcImmDownloadLoading");
        AbstractC26006c.m102054g(vUgcImmDownloadLoading2);
    }

    private final void setLoading(boolean show) {
        this.isLoading = show;
        getPlayerDelegate().m112199f(show);
    }

    private final void setupHashTags(final UGCVideo video) {
        List<UGCVideoHashTag> filteredHashTags = video.getFilteredHashTags();
        if (filteredHashTags == null || filteredHashTags.isEmpty()) {
            this.isHashTagShow = false;
            RecyclerView rvUgcImmTags = this.viewBinding.f87451x;
            Intrinsics.m97801g(rvUgcImmTags, "rvUgcImmTags");
            AbstractC26006c.m102054g(rvUgcImmTags);
            return;
        }
        this.isHashTagShow = true;
        RecyclerView rvUgcImmTags2 = this.viewBinding.f87451x;
        Intrinsics.m97801g(rvUgcImmTags2, "rvUgcImmTags");
        AbstractC26006c.m102058k(rvUgcImmTags2);
        List<UGCVideoHashTag> filteredHashTags2 = video.getFilteredHashTags();
        Intrinsics.m97799e(filteredHashTags2);
        C20151i c20151i = new C20151i(filteredHashTags2, true);
        this.viewBinding.f87451x.setAdapter(c20151i);
        c20151i.m36227w1(new InterfaceC27566d() { // from class: yv.m
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                UGCImmVideoItemView.m84314K(video, this, baseQuickAdapter, view, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C29247a m84346y(UGCImmVideoItemView uGCImmVideoItemView) {
        return new C29247a(uGCImmVideoItemView.new C20388a(), uGCImmVideoItemView.getReportDelegate(), uGCImmVideoItemView.getDownloadDelegate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final void m84347z(UGCImmVideoItemView uGCImmVideoItemView) {
        uGCImmVideoItemView.m84315L();
    }

    public final void addVideoView(View view, FirstFrame firstImage) {
        ORPlayerView oRPlayerView = this.orPlayerView;
        if ((oRPlayerView != null ? oRPlayerView.getParent() : null) != null) {
            ORPlayerView oRPlayerView2 = this.orPlayerView;
            ViewParent parent = oRPlayerView2 != null ? oRPlayerView2.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.orPlayerView);
            }
        }
        this.viewBinding.f87431d.addView(view, new FrameLayout.LayoutParams(-1, -1));
        if (firstImage != null) {
            m84328Y(firstImage.getWidth(), firstImage.getHeight());
        }
    }

    public final void app2Background() {
        UGCImmVideo uGCImmVideo = this.data;
        boolean zIsFree = uGCImmVideo != null ? uGCImmVideo.isFree() : false;
        C20310a c20310a = this.dotLayer;
        if (c20310a != null) {
            c20310a.m84052c(zIsFree, true);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d c26907d) {
        InterfaceC16633f.a.m72423a(this, z11, i11, i12, c26907d);
    }

    public final long getProgress() {
        return this.viewBinding.f87452y.getCurrentProgress();
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
        LiveData liveDataM84272R;
        super.onAttachedToWindow();
        UGCImmVideoDetailFragment uGCImmVideoDetailFragment = this.fragment;
        if (uGCImmVideoDetailFragment != null && (viewLifecycleOwner = uGCImmVideoDetailFragment.getViewLifecycleOwner()) != null) {
            UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel = this.detailViewModel;
            if (uGCImmVideoDetailViewModel != null && (liveDataM84272R = uGCImmVideoDetailViewModel.m84272R()) != null) {
                liveDataM84272R.m14851j(viewLifecycleOwner, this.subscriptObserver);
            }
            getDownloadDelegate().m112177j(viewLifecycleOwner);
        }
        getSubtitleDelegate().m112213e();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onBufferedPosition(long j11, C23403e c23403e) {
        InterfaceC16633f.a.m72426d(this, j11, c23403e);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        getActionDelegate().m112165a(v11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onCompletion(C23403e mediaSource) {
        C26866a.a.m104905r(C26866a.f81698a, this.TAG, new String[]{"onCompletion， play next"}, false, 4, null);
        C20310a c20310a = this.dotLayer;
        if (c20310a != null) {
            c20310a.m84054g();
        }
        m84326W(0L);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        InterfaceC3224u viewLifecycleOwner;
        LiveData liveDataM84272R;
        super.onDetachedFromWindow();
        UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel = this.detailViewModel;
        if (uGCImmVideoDetailViewModel != null && (liveDataM84272R = uGCImmVideoDetailViewModel.m84272R()) != null) {
            liveDataM84272R.mo14856o(this.subscriptObserver);
        }
        UGCImmVideoDetailFragment uGCImmVideoDetailFragment = this.fragment;
        if (uGCImmVideoDetailFragment != null && (viewLifecycleOwner = uGCImmVideoDetailFragment.getViewLifecycleOwner()) != null) {
            getDownloadDelegate().m112178k(viewLifecycleOwner);
        }
        getSubtitleDelegate().m112215g();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onFocusChange(boolean z11) {
        InterfaceC16633f.a.m72429g(this, z11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onIsPlayingChanged(boolean z11) {
        InterfaceC16633f.a.m72430h(this, z11);
    }

    public final void onItemViewMediaItemTransition() {
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onMediaItemTransition: " + this.viewBinding.f87452y.getMaxProgress() + "  : " + this, false, 4, null);
        C20310a c20310a = this.dotLayer;
        if (c20310a != null) {
            c20310a.m84054g();
        }
        reset();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingBegin(C23403e mediaSource) {
        C20310a c20310a = this.dotLayer;
        if (c20310a != null) {
            c20310a.m84055h();
        }
        setLoading(true);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingEnd(C23403e mediaSource) {
        C20310a c20310a = this.dotLayer;
        if (c20310a != null) {
            c20310a.m84056i();
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
        C26866a.a.m104905r(C26866a.f81698a, this.TAG, new String[]{"onLoopingStart"}, false, 4, null);
        C20310a c20310a = this.dotLayer;
        if (c20310a != null) {
            c20310a.m84057j();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onMediaItemTransition(String str) {
        InterfaceC16633f.a.m72438p(this, str);
    }

    public final void onNetConnect() {
        C26866a.a.m104898f(C26866a.f81698a, "ORSubtitle_v", "onNetConnect, 网络恢复，检测字幕", false, 4, null);
        getSubtitleDelegate().m112214f();
    }

    public final void onPageDestroy() {
        C20310a c20310a = this.dotLayer;
        if (c20310a != null) {
            c20310a.m84063p();
        }
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.removePlayerListener(this);
        }
    }

    public final void onPagePause() {
        InterfaceC16634g interfaceC16634g;
        this.isPageHide = true;
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "player- onPause", false, 4, null);
        if (C27136c.f82250a.m105602c(this.orPlayer) || (interfaceC16634g = this.orPlayer) == null) {
            return;
        }
        interfaceC16634g.pause();
    }

    public final void onPageRelease(int position) {
        onPlayerReset();
    }

    public final void onPageResume() {
        UGCImmVideoDetailFragment uGCImmVideoDetailFragment;
        this.isPageHide = false;
        if (this.isClickPause || (uGCImmVideoDetailFragment = this.fragment) == null || !uGCImmVideoDetailFragment.isVisible()) {
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "ON_RESUME", false, 4, null);
        m84311H();
    }

    public final void onPageSelected(InterfaceC16634g orPlayer, ORPlayerView orPlayerView, UGCImmVideo item) {
        String url;
        C3187b0 c3187b0M84192M0;
        UGCVideoPlayInfo playInfo;
        C3187b0 c3187b0M84257B;
        UGCVideo ugcVideo;
        UGCVideoBelongToCollection belongToCollection;
        C3187b0 c3187b0M84259D;
        UGCVideo ugcVideo2;
        C3187b0 c3187b0M84191L0;
        this.orPlayer = orPlayer;
        this.orPlayerView = orPlayerView;
        C20310a c20310a = this.dotLayer;
        if (c20310a != null) {
            c20310a.m84066t(orPlayer);
        }
        UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel = this.detailViewModel;
        if (uGCImmVideoDetailViewModel != null && (c3187b0M84191L0 = uGCImmVideoDetailViewModel.m84191L0()) != null) {
            c3187b0M84191L0.mo14858q(this.data);
        }
        UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel2 = this.detailViewModel;
        if (uGCImmVideoDetailViewModel2 != null && (c3187b0M84259D = uGCImmVideoDetailViewModel2.m84259D()) != null) {
            UGCImmVideo uGCImmVideo = this.data;
            c3187b0M84259D.mo14858q((uGCImmVideo == null || (ugcVideo2 = uGCImmVideo.getUgcVideo()) == null) ? null : ugcVideo2.getUgcVideoId());
        }
        UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel3 = this.detailViewModel;
        if (uGCImmVideoDetailViewModel3 != null && (c3187b0M84257B = uGCImmVideoDetailViewModel3.m84257B()) != null) {
            UGCImmVideo uGCImmVideo2 = this.data;
            c3187b0M84257B.mo14858q((uGCImmVideo2 == null || (ugcVideo = uGCImmVideo2.getUgcVideo()) == null || (belongToCollection = ugcVideo.getBelongToCollection()) == null) ? null : belongToCollection.getCollectionId());
        }
        if (orPlayer != null) {
            orPlayer.addPlayerListener(this);
        }
        FirstFrame firstImage = (item == null || (playInfo = item.getPlayInfo()) == null) ? null : playInfo.getFirstImage();
        if (orPlayerView != null) {
            addVideoView(orPlayerView, firstImage);
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "addView-----", false, 4, null);
        }
        UGCVideoPlayStream uGCVideoPlayStreamM109409a = C28227a.f86830a.m109409a(item != null ? item.getPlayInfo() : null);
        UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel4 = this.detailViewModel;
        if (uGCImmVideoDetailViewModel4 != null && (c3187b0M84192M0 = uGCImmVideoDetailViewModel4.m84192M0()) != null) {
            c3187b0M84192M0.mo14858q(uGCVideoPlayStreamM109409a != null ? uGCVideoPlayStreamM109409a.getResolutions() : null);
        }
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "play url=" + (uGCVideoPlayStreamM109409a != null ? uGCVideoPlayStreamM109409a.getUrl() : null) + " , duration: " + (uGCVideoPlayStreamM109409a != null ? uGCVideoPlayStreamM109409a.getDuration() : null) + ", resolutions:" + (uGCVideoPlayStreamM109409a != null ? uGCVideoPlayStreamM109409a.getResolutions() : null), false, 4, null);
        getSubtitleDelegate().m112216i(uGCVideoPlayStreamM109409a);
        videoStartPrepare();
        if (uGCVideoPlayStreamM109409a != null && (url = uGCVideoPlayStreamM109409a.getUrl()) != null) {
            if (orPlayer != null) {
                orPlayer.seekTo(url, 0L);
            }
            setVideoUrl(url);
        }
        if (orPlayer != null) {
            orPlayer.play();
        }
    }

    public final void onPageStop() {
        if (this.totalDuration == 0) {
            InterfaceC16634g interfaceC16634g = this.orPlayer;
            this.totalDuration = interfaceC16634g != null ? interfaceC16634g.getDuration() : 0L;
        }
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onPageStop: totalDuration:" + this.totalDuration + ",playProgress:" + this.playProgress, false, 4, null);
        getPlayerDelegate().m112194a(this.totalDuration, this.playProgress);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayError(PlayError errorInfo, C23403e mediaSource) {
        Integer errorCode;
        Intrinsics.m97802h(errorInfo, "errorInfo");
        C20310a c20310a = this.dotLayer;
        if (c20310a != null) {
            c20310a.m84058k(errorInfo);
        }
        C26866a.f81698a.m104915i("i_media", this.TAG + " --> IPlayerListener --> onPlayError()  errorCode:" + errorInfo.getErrorCode() + " errorMessage:" + errorInfo.getErrorMessage() + " url:" + (mediaSource != null ? mediaSource.m92935k() : null) + " --> 短播放失败了", true);
        setLoading(false);
        Integer errorCode2 = errorInfo.getErrorCode();
        if ((errorCode2 != null && errorCode2.intValue() == 2001) || ((errorCode = errorInfo.getErrorCode()) != null && errorCode.intValue() == 2002)) {
            m84315L();
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
        UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, this.TAG, "player- onPlayerReset data: " + this.data, false, 4, null);
        getSubtitleDelegate().m112217n();
        setKeepScreenOn(false);
        this.isClickPause = false;
        UGCImmVideoDetailFragment uGCImmVideoDetailFragment = this.fragment;
        if (uGCImmVideoDetailFragment != null) {
            uGCImmVideoDetailFragment.m83725b1(false);
        }
        this.isFirstFrame = false;
        this.isPrepare = false;
        UGCImmVideo uGCImmVideo = this.data;
        boolean zIsFree = uGCImmVideo != null ? uGCImmVideo.isFree() : false;
        C20310a c20310a = this.dotLayer;
        if (c20310a != null) {
            c20310a.m84052c(zIsFree, false);
        }
        if (zIsFree && (uGCImmVideoDetailViewModel = this.detailViewModel) != null) {
            uGCImmVideoDetailViewModel.m84209f1(this.data, this.playProgress, this.totalDuration);
        }
        AppCompatImageView ivUgcImmCover = this.viewBinding.f87437j;
        Intrinsics.m97801g(ivUgcImmCover, "ivUgcImmCover");
        AbstractC26006c.m102058k(ivUgcImmCover);
        C26866a.a.m104898f(aVar, this.TAG, "onPlayerReset   visible  " + this, false, 4, null);
        AppCompatImageView ivUgcImmPlayStatus = this.viewBinding.f87441n;
        Intrinsics.m97801g(ivUgcImmPlayStatus, "ivUgcImmPlayStatus");
        AbstractC26006c.m102054g(ivUgcImmPlayStatus);
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.removePlayerListener(this);
        }
        this.orPlayer = null;
        this.orPlayerView = null;
        this.pagerLayoutManager = null;
        m84326W(0L);
        m84327X(100L);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPrepare(C23403e mediaSource) {
        C3187b0 c3187b0M84262H;
        UGCVideoDetailPlayBean uGCVideoDetailPlayBean;
        InterfaceC16634g interfaceC16634g;
        C3187b0 c3187b0M84262H2;
        UGCVideo ugcVideo;
        if (this.isPrepare) {
            return;
        }
        this.isPrepare = true;
        InterfaceC16634g interfaceC16634g2 = this.orPlayer;
        long duration = interfaceC16634g2 != null ? interfaceC16634g2.getDuration() : 0L;
        this.totalDuration = duration;
        m84327X(duration);
        UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel = this.detailViewModel;
        if (uGCImmVideoDetailViewModel != null && (c3187b0M84262H = uGCImmVideoDetailViewModel.m84262H()) != null && (uGCVideoDetailPlayBean = (UGCVideoDetailPlayBean) c3187b0M84262H.m14847f()) != null) {
            String ugcVideoId = uGCVideoDetailPlayBean.getUgcVideoId();
            UGCImmVideo uGCImmVideo = this.data;
            if (Intrinsics.m97797c(ugcVideoId, (uGCImmVideo == null || (ugcVideo = uGCImmVideo.getUgcVideo()) == null) ? null : ugcVideo.getUgcVideoId())) {
                long progress = uGCVideoDetailPlayBean.getProgress();
                C26866a.a.m104898f(C26866a.f81698a, this.TAG, "player- onPrepare, duration = " + this.viewBinding.f87452y.getCurrentProgress() + ", progress = " + progress + "  duration = " + duration, false, 4, null);
                UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel2 = this.detailViewModel;
                if (uGCImmVideoDetailViewModel2 != null && (c3187b0M84262H2 = uGCImmVideoDetailViewModel2.m84262H()) != null) {
                    c3187b0M84262H2.mo14858q(null);
                }
                if (progress > 0 && Math.abs(duration - progress) > 2000 && (interfaceC16634g = this.orPlayer) != null) {
                    interfaceC16634g.seekTo(progress);
                }
            }
        }
        setKeepScreenOn(true);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onProgress(long progress, C23403e mediaSource) {
        this.playProgress = progress;
        getPlayerDelegate().m112195b(progress, getGestureDelegate().m112192k());
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onRenderFirstFrame() {
        C26866a.a aVar = C26866a.f81698a;
        String str = this.TAG;
        AppCompatImageView ivUgcImmCover = this.viewBinding.f87437j;
        Intrinsics.m97801g(ivUgcImmCover, "ivUgcImmCover");
        C26866a.a.m104898f(aVar, str, "player-onRenderFirstFrame   viewBinding.ivCover.isVisible:" + (ivUgcImmCover.getVisibility() == 0) + " ", false, 4, null);
        if (!this.isFirstFrame) {
            this.isFirstFrame = true;
            C20310a c20310a = this.dotLayer;
            if (c20310a != null) {
                c20310a.m84060m();
            }
        }
        setLoading(false);
        AppCompatImageView ivUgcImmCover2 = this.viewBinding.f87437j;
        Intrinsics.m97801g(ivUgcImmCover2, "ivUgcImmCover");
        AbstractC26006c.m102054g(ivUgcImmCover2);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onSetDataSource() {
        C20310a c20310a = this.dotLayer;
        if (c20310a != null) {
            c20310a.m84053f();
        }
        C20310a c20310a2 = this.dotLayer;
        if (c20310a2 != null) {
            c20310a2.m84050a();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.m97802h(event, "event");
        if (getGestureDelegate().m112193m(event)) {
            return true;
        }
        return super.onTouchEvent(event);
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
        getPlayerDelegate().m112196c();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoSizeChanged(int width, int height) {
        InterfaceC16633f.a.m72419H(this, width, height);
        m84328Y(Integer.valueOf(width), Integer.valueOf(height));
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoStart(C23403e mediaSource) {
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "player- onVideoStart", false, 4, null);
        onPrepare(mediaSource);
        getPlayerDelegate().m112197d();
    }

    public final void reset() {
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "playNewMedia data: " + this.data, false, 4, null);
        setKeepScreenOn(false);
        this.isClickPause = false;
        UGCImmVideoDetailFragment uGCImmVideoDetailFragment = this.fragment;
        if (uGCImmVideoDetailFragment != null) {
            uGCImmVideoDetailFragment.m83725b1(false);
        }
        this.isFirstFrame = false;
        UGCImmVideo uGCImmVideo = this.data;
        boolean zIsFree = uGCImmVideo != null ? uGCImmVideo.isFree() : false;
        C20310a c20310a = this.dotLayer;
        if (c20310a != null) {
            c20310a.m84052c(zIsFree, false);
        }
        AppCompatImageView ivUgcImmPlayStatus = this.viewBinding.f87441n;
        Intrinsics.m97801g(ivUgcImmPlayStatus, "ivUgcImmPlayStatus");
        AbstractC26006c.m102054g(ivUgcImmPlayStatus);
        m84326W(0L);
        m84327X(100L);
    }

    public final void setData(Integer adapterPosition, UGCImmVideoDetailFragment fragment, String trackId, String previousTrackId, String previousPageVideoId, UGCImmVideo data) {
        FragmentActivity activity;
        Intrinsics.m97802h(trackId, "trackId");
        Intrinsics.m97802h(data, "data");
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "--------------------------setData position:" + adapterPosition, false, 4, null);
        this.data = data;
        this.trackId = trackId;
        this.previousTrackId = previousTrackId;
        this.previousPageVideoId = previousPageVideoId;
        this.fragment = fragment;
        this.isSubscriptionInitiatedByThisView = false;
        C20310a c20310a = new C20310a("/ugc_video/immersive_detail", fragment != null ? fragment.getLastPageFrom() : null);
        this.dotLayer = c20310a;
        c20310a.m84065s(data.getUgcVideo());
        C20310a c20310a2 = this.dotLayer;
        if (c20310a2 != null) {
            c20310a2.m84064r(adapterPosition);
        }
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            this.detailViewModel = (UGCImmVideoDetailViewModel) new C3227v0(activity).m14969a(UGCImmVideoDetailViewModel.class);
            this.subtitleViewModel = (C20324a) new C3227v0(activity).m14969a(C20324a.class);
            this.downloadViewModel = (UGCDownloadViewModel) new C3227v0(activity).m14969a(UGCDownloadViewModel.class);
        }
        setContent(data);
    }

    public final void setDownloadStatus(int status) {
        if (this.isDownloadImmediately && status != this.curStatus) {
            this.curStatus = status;
            UGCImmVideo uGCImmVideo = this.data;
            if (uGCImmVideo != null) {
                uGCImmVideo.setDownloadStatus(status);
            }
            m84325V(status);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void setOnSeekCompleteListener() {
        InterfaceC16633f.a.m72422K(this);
    }

    public final void setVideoUrl(String url) {
        Intrinsics.m97802h(url, "url");
        C20310a c20310a = this.dotLayer;
        if (c20310a != null) {
            c20310a.m84067u(url);
        }
    }

    public final void videoStartPrepare() {
        this.isFirstFrame = false;
        C20310a c20310a = this.dotLayer;
        if (c20310a != null) {
            c20310a.m84053f();
        }
        C20310a c20310a2 = this.dotLayer;
        if (c20310a2 != null) {
            c20310a2.m84050a();
        }
        setLoading(true);
    }
}
