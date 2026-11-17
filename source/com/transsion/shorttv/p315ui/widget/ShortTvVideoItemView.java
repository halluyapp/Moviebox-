package com.transsion.shorttv.p315ui.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Insets;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
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
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.app.NotificationCompat;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3218r;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.Lifecycle;
import androidx.p1004lifecycle.LifecycleCoroutineScope;
import androidx.p1004lifecycle.LiveData;
import bt.C4880a;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.avery.subtitle.widget.SimpleSubtitleView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.AbstractC5790i;
import com.blankj.utilcode.util.AbstractC5806y;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.Utils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.cloud.tmc.integration.event.EventConstants;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.noober.background.view.BLTextView;
import com.transsion.p285ad.scene.C14050d;
import com.transsion.player.mediasession.MediaItem;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.PlayError;
import com.transsion.player.orplayer.global.TnPlayerType;
import com.transsion.player.p1003enum.ScaleMode;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.push.PushConstants;
import com.transsion.shorttv.R$color;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv.base.image.blurhash.C18769e;
import com.transsion.shorttv.base.pager.PagerLayoutManager;
import com.transsion.shorttv.base.widget.C18788e;
import com.transsion.shorttv.base.widget.TnTextView;
import com.transsion.shorttv.base.widget.expand.ExpandView;
import com.transsion.shorttv.bean.Cover;
import com.transsion.shorttv.bean.DubsInfo;
import com.transsion.shorttv.bean.DubsInfoData;
import com.transsion.shorttv.bean.FirstFrame;
import com.transsion.shorttv.bean.Media;
import com.transsion.shorttv.bean.ShortTVFavInfo;
import com.transsion.shorttv.bean.ShortTVItem;
import com.transsion.shorttv.bean.ShortTvInnerPlayBean;
import com.transsion.shorttv.bean.SkuInfo;
import com.transsion.shorttv.bean.Subject;
import com.transsion.shorttv.bean.SubjectType;
import com.transsion.shorttv.bean.Video;
import com.transsion.shorttv.order.C18862d;
import com.transsion.shorttv.order.InterfaceC18853b;
import com.transsion.shorttv.order.bean.CreatePaynicornOrderReqBean;
import com.transsion.shorttv.order.bean.GetPaynicornOrderStatusRespEntity;
import com.transsion.shorttv.p313ad.AdLoadState;
import com.transsion.shorttv.p313ad.common.STCommonVideoAdHelper;
import com.transsion.shorttv.p313ad.playeroverlayad.C18740a;
import com.transsion.shorttv.p313ad.playeroverlayad.C18744e;
import com.transsion.shorttv.p313ad.playeroverlayad.ShortTvPlayerOverlayAdContainer;
import com.transsion.shorttv.p313ad.playeroverlayad.ShortTvPlayerOverlayAdManager;
import com.transsion.shorttv.p315ui.dialog.ShortTvAlertDialog;
import com.transsion.shorttv.p315ui.dialog.ShortTvLanguageSelectDialog;
import com.transsion.shorttv.p315ui.fragment.ShortTvDetailListFragment;
import com.transsion.shorttv.subtitle.InterfaceC18876a;
import com.transsion.shorttv.subtitle.manager.InterfaceC18884b;
import com.transsion.shorttv.utils.AbstractC19166i;
import com.transsion.shorttv.utils.AbstractC19169l;
import com.transsion.shorttv.utils.AbstractC19170m;
import com.transsion.shorttv.utils.C19165h;
import com.transsion.shorttv.utils.ShortTvVideoCtrBean;
import com.transsion.shorttv.viewmodel.ShortTvViewModel;
import com.transsion.subtitle_download.InterfaceC19743a;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.transsion.subtitle_download.utils.C19773d;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import es.C23219b;
import fo.C23403e;
import is.AbstractC24225f;
import is.C24223d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import p356ds.AbstractC23048b;
import p416fs.C23424b;
import p557ks.C25427b;
import p654oo.InterfaceC26373f;
import p659os.AbstractC26720f;
import p659os.AbstractC26726l;
import p659os.C26719e;
import p659os.C26721g;
import p659os.C26722h;
import p659os.C26723i;
import p683po.C26906c;
import p683po.C26907d;
import p717qr.C27122a;
import p717qr.C27124c;
import p743rh.C27287m;
import p848vs.InterfaceC28213d;
import p848vs.InterfaceC28216g;
import p848vs.InterfaceC28218i;
import p848vs.InterfaceC28220k;
import p919xs.C28654b;
import p919xs.C28655c;
import p955ys.C29007b;
import p988zr.C29238a;
import pg.C26866a;
import rs.C27349k0;
import ss.C27644a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000ì\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n*\u0002¨\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B!\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000fB\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0013JU\u0010!\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J-\u0010'\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b'\u0010(J-\u0010)\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b)\u0010(J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00112\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010<\u001a\u00020;2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u001aH\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010H\u001a\u00020\u00112\u0006\u0010F\u001a\u00020E2\u0006\u0010B\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0011H\u0016¢\u0006\u0004\bJ\u0010\u0013J\r\u0010K\u001a\u00020\u0011¢\u0006\u0004\bK\u0010\u0013J\r\u0010L\u001a\u00020\u0011¢\u0006\u0004\bL\u0010\u0013J\u000f\u0010M\u001a\u00020\u0011H\u0016¢\u0006\u0004\bM\u0010\u0013J\u0015\u0010O\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\u001c¢\u0006\u0004\bO\u0010PJ\u0015\u0010R\u001a\u00020\u00112\u0006\u0010Q\u001a\u00020\u001c¢\u0006\u0004\bR\u0010PJ\u000f\u0010S\u001a\u00020\u0011H\u0016¢\u0006\u0004\bS\u0010\u0013J\u000f\u0010T\u001a\u00020\u0011H\u0016¢\u0006\u0004\bT\u0010\u0013J\u0019\u0010W\u001a\u00020\u00112\b\u0010V\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\bW\u0010XJ\u0019\u0010Y\u001a\u00020\u00112\b\u0010V\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\bY\u0010XJ\u0019\u0010Z\u001a\u00020\u00112\b\u0010V\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\bZ\u0010XJ!\u0010]\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020[2\b\u0010V\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\b]\u0010^J\u0019\u0010_\u001a\u00020\u00112\b\u0010V\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\b_\u0010XJ\u0019\u0010`\u001a\u00020\u00112\b\u0010V\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\b`\u0010XJ!\u0010c\u001a\u00020\u00112\u0006\u0010b\u001a\u00020a2\b\u0010V\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\u0011H\u0016¢\u0006\u0004\be\u0010\u0013J\u0019\u0010f\u001a\u00020\u00112\b\u0010V\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\bf\u0010XJ\u0019\u0010i\u001a\u00020\u00112\b\u0010h\u001a\u0004\u0018\u00010gH\u0016¢\u0006\u0004\bi\u0010jJ\r\u0010k\u001a\u00020\u0011¢\u0006\u0004\bk\u0010\u0013J\u000f\u0010l\u001a\u00020[H\u0016¢\u0006\u0004\bl\u0010mJ\u0019\u0010q\u001a\u00020\u00112\b\u0010n\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\bo\u0010pJ\u0019\u0010t\u001a\u00020\u00112\b\b\u0002\u0010r\u001a\u00020\u001aH\u0000¢\u0006\u0004\bs\u0010@J\r\u0010u\u001a\u00020\u0011¢\u0006\u0004\bu\u0010\u0013J\u000f\u0010v\u001a\u00020\u0011H\u0016¢\u0006\u0004\bv\u0010\u0013J\u000f\u0010w\u001a\u00020\u0011H\u0016¢\u0006\u0004\bw\u0010\u0013J\u001f\u0010z\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020\u000b2\u0006\u0010y\u001a\u00020xH\u0016¢\u0006\u0004\bz\u0010{J\u0017\u0010|\u001a\u00020\u00112\u0006\u0010y\u001a\u00020xH\u0016¢\u0006\u0004\b|\u0010}J(\u0010\u0082\u0001\u001a\u00020\u00112\u000b\u0010\u0080\u0001\u001a\u00060~j\u0002`\u007f2\u0007\u0010\u0081\u0001\u001a\u00020xH\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0011\u0010\u0084\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0084\u0001\u0010\u0013J\u001e\u0010\u0087\u0001\u001a\u00020\u00112\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u0001H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0019\u0010\u0089\u0001\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0005\b\u0089\u0001\u0010\u000fJ\u0011\u0010\u008a\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u008a\u0001\u0010\u0013J\u0011\u0010\u008b\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u008b\u0001\u0010\u0013J\u001a\u0010\u008d\u0001\u001a\u00020\u00112\u0007\u0010\u008c\u0001\u001a\u00020\u001aH\u0002¢\u0006\u0005\b\u008d\u0001\u0010@J(\u0010\u0090\u0001\u001a\u00020\u00112\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u000b2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J:\u0010\u0096\u0001\u001a\u00020\u00112\u0007\u0010\u0092\u0001\u001a\u00020\u001c2\b\u0010\u0094\u0001\u001a\u00030\u0093\u00012\t\u0010\u0016\u001a\u0005\u0018\u00010\u0095\u00012\b\b\u0002\u0010 \u001a\u00020\u001aH\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001b\u0010\u0098\u0001\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0005\b\u0098\u0001\u00101J\u001a\u0010\u0099\u0001\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020[H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001b\u0010\u009c\u0001\u001a\u00020\u00112\u0007\u0010\u009b\u0001\u001a\u00020[H\u0002¢\u0006\u0006\b\u009c\u0001\u0010\u009a\u0001J\u0011\u0010\u009d\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u009d\u0001\u0010\u0013J\u0011\u0010\u009e\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u009e\u0001\u0010\u0013J\u0011\u0010\u009f\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u009f\u0001\u0010\u0013J\u0011\u0010 \u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b \u0001\u0010\u0013J\u001a\u0010¢\u0001\u001a\u00020\u00112\u0007\u0010¡\u0001\u001a\u00020\u001aH\u0002¢\u0006\u0005\b¢\u0001\u0010@J\u001a\u0010¤\u0001\u001a\u00020\u00112\u0007\u0010£\u0001\u001a\u00020gH\u0002¢\u0006\u0005\b¤\u0001\u0010jJ\u0011\u0010¥\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b¥\u0001\u0010\u0013J\u0011\u0010¦\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b¦\u0001\u0010\u0013J\u0011\u0010§\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b§\u0001\u0010\u0013J\u0011\u0010¨\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b¨\u0001\u0010\u0013J&\u0010«\u0001\u001a\u00020\u00112\u0006\u0010&\u001a\u00020%2\n\u0010ª\u0001\u001a\u0005\u0018\u00010©\u0001H\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0011\u0010\u00ad\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u00ad\u0001\u0010\u0013J\u0011\u0010®\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b®\u0001\u0010\u0013J\u001b\u0010¯\u0001\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0005\b¯\u0001\u00101J\u0011\u0010°\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b°\u0001\u0010\u0013J)\u0010±\u0001\u001a\u00020\u00112\t\u0010£\u0001\u001a\u0004\u0018\u00010g2\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u0001H\u0002¢\u0006\u0006\b±\u0001\u0010²\u0001J)\u0010³\u0001\u001a\u00020\u00112\t\u0010£\u0001\u001a\u0004\u0018\u00010g2\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u0001H\u0002¢\u0006\u0006\b³\u0001\u0010²\u0001J\u0011\u0010´\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b´\u0001\u0010\u0013J\u0011\u0010µ\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bµ\u0001\u0010\u0013J\u001c\u0010¸\u0001\u001a\u00030·\u00012\u0007\u0010¶\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u001b\u0010»\u0001\u001a\u00020\u00112\u0007\u0010º\u0001\u001a\u00020[H\u0002¢\u0006\u0006\b»\u0001\u0010\u009a\u0001J\u0011\u0010¼\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b¼\u0001\u0010\u0013J\u001c\u0010¾\u0001\u001a\u00020\u00112\t\u0010½\u0001\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0005\b¾\u0001\u0010PJ\u0011\u0010¿\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b¿\u0001\u0010\u0013J\u0011\u0010À\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bÀ\u0001\u0010\u0013J\u0011\u0010Á\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bÁ\u0001\u0010\u0013J\u0011\u0010Â\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bÂ\u0001\u0010\u0013J\u0011\u0010Ã\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bÃ\u0001\u0010\u0013J\u0011\u0010Ä\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bÄ\u0001\u0010\u0013J\u0011\u0010Å\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bÅ\u0001\u0010\u0013J\u0011\u0010Æ\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bÆ\u0001\u0010\u0013J\u001b\u0010È\u0001\u001a\u00020\u00112\u0007\u0010\u0016\u001a\u00030Ç\u0001H\u0002¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u001c\u0010Ì\u0001\u001a\u00020\u00112\b\u0010Ë\u0001\u001a\u00030Ê\u0001H\u0002¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J\u001b\u0010Î\u0001\u001a\u00020\u00112\u0007\u0010\u0016\u001a\u00030Ç\u0001H\u0002¢\u0006\u0006\bÎ\u0001\u0010É\u0001J\u0012\u0010Ï\u0001\u001a\u00020\u001aH\u0002¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J\u0012\u0010Ñ\u0001\u001a\u00020\u001aH\u0002¢\u0006\u0006\bÑ\u0001\u0010Ð\u0001J\u0019\u0010Ò\u0001\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0005\bÒ\u0001\u00101J\u0019\u0010Ó\u0001\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0005\bÓ\u0001\u00101R\u0017\u0010Ö\u0001\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u0017\u0010Ø\u0001\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0001\u0010«\u0001R\u0018\u0010Ü\u0001\u001a\u00030Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u001b\u0010ß\u0001\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R\u001c\u0010á\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010à\u0001R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010æ\u0001R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bç\u0001\u0010Õ\u0001R\u001a\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001R\u001a\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bê\u0001\u0010ë\u0001R\u001a\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R\u001c\u0010ñ\u0001\u001a\u0005\u0018\u00010î\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R\u001c\u0010õ\u0001\u001a\u0005\u0018\u00010ò\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bó\u0001\u0010ô\u0001R\u0019\u0010÷\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bö\u0001\u0010\u0089\u0001R\u0019\u0010ù\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0001\u0010\u0089\u0001R\u0019\u0010û\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0001\u0010\u0089\u0001R\u0019\u0010ý\u0001\u001a\u00020[8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bü\u0001\u0010±\u0001R(\u0010ÿ\u0001\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bþ\u0001\u0010\u0089\u0001\u001a\u0006\bÿ\u0001\u0010Ð\u0001\"\u0005\b\u0080\u0002\u0010@R\u001c\u0010\u0084\u0002\u001a\u0005\u0018\u00010\u0081\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R\u0017\u0010\u0086\u0002\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0002\u0010«\u0001R\u0016\u0010\u0087\u0002\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bh\u0010«\u0001R\u0017\u0010\u0088\u0002\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010«\u0001R\u0017\u0010\u008a\u0002\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0002\u0010«\u0001R\u0018\u0010N\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0002\u0010Õ\u0001R\u001b\u0010\u008e\u0002\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u008d\u0002R\u001c\u0010\u0092\u0002\u001a\u0005\u0018\u00010\u008f\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u0091\u0002R\u0019\u0010\u0094\u0002\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0002\u0010«\u0001R\u0019\u0010\u0096\u0002\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0002\u0010«\u0001R\u001c\u0010\u009a\u0002\u001a\u0005\u0018\u00010\u0097\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0002\u0010\u0099\u0002R\u001a\u0010\u009e\u0002\u001a\u00030\u009b\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0002\u0010\u009d\u0002R\u0017\u0010 \u0002\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0002\u0010\u0089\u0001R\u0019\u0010¢\u0002\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0002\u0010\u0089\u0001R\u001e\u0010¦\u0002\u001a\t\u0012\u0004\u0012\u00020\u001a0£\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0002\u0010¥\u0002R \u0010§\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001a0£\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¥\u0002R\u0018\u0010ª\u0002\u001a\u00030¨\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010©\u0002R\u0019\u0010«\u0002\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010\u0089\u0001R\u0019\u0010¬\u0002\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010\u0089\u0001R\u001d\u0010±\u0002\u001a\b0\u00ad\u0002j\u0003`®\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0002\u0010°\u0002R\u0019\u0010²\u0002\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010\u0089\u0001R\u0018\u0010µ\u0002\u001a\u00030³\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010´\u0002R\u001d\u0010·\u0002\u001a\b0\u00ad\u0002j\u0003`®\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0002\u0010°\u0002R\u001b\u0010¸\u0002\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010æ\u0001R\u001b\u0010»\u0002\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0002\u0010º\u0002R\u0019\u0010¼\u0002\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010\u0089\u0001R\u001c\u0010À\u0002\u001a\u0005\u0018\u00010½\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0002\u0010¿\u0002R\u0019\u0010Á\u0002\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0089\u0001R,\u0010È\u0002\u001a\u0005\u0018\u00010Â\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bµ\u0001\u0010Ã\u0002\u001a\u0006\bÄ\u0002\u0010Å\u0002\"\u0006\bÆ\u0002\u0010Ç\u0002R\u001c\u0010Ê\u0002\u001a\u0005\u0018\u00010Ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010É\u0002R\u0019\u0010Ë\u0002\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u0089\u0001¨\u0006Ì\u0002"}, m97100d2 = {"Lcom/transsion/shorttv/ui/widget/ShortTvVideoItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/transsion/player/orplayer/f;", "Landroid/view/View$OnClickListener;", "Landroidx/lifecycle/r;", "Lcom/transsion/shorttv/ui/widget/d;", "Lcom/transsion/subtitle_download/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Los/e;", WebConstants.FIELD_ITEM, "Lcom/transsion/shorttv/ui/fragment/ShortTvDetailListFragment;", "fragment", RequestParameters.POSITION, "", "videoLoadMore", "", "basePostId", "baseItemType", "isPayloads", "fromTrending", "setData", "(Los/e;Lcom/transsion/shorttv/ui/fragment/ShortTvDetailListFragment;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;ZZ)V", "Lcom/transsion/player/orplayer/g;", "orPlayer", "Lcom/transsion/player/ui/ORPlayerView;", "orPlayerView", "onPageSelected", "(Lcom/transsion/player/orplayer/g;Lcom/transsion/player/ui/ORPlayerView;Los/e;)V", "updateShortTvInfo", "onPageRelease", "(I)V", "width", "height", "onVideoSizeChanged", "(II)V", "updateLockState", "(Los/e;)V", "Lcom/transsion/shorttv/base/pager/PagerLayoutManager;", "pagerLayoutManager", "setPagerLayoutManager", "(Lcom/transsion/shorttv/base/pager/PagerLayoutManager;)V", "Landroid/widget/FrameLayout;", "getPlayerContainer", "()Landroid/widget/FrameLayout;", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/transsion/shorttv/viewmodel/ShortTvViewModel;", "getViewModel", "(Landroidx/fragment/app/FragmentActivity;)Lcom/transsion/shorttv/viewmodel/ShortTvViewModel;", "hasWindowFocus", "onWindowFocusChanged", "(Z)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroidx/lifecycle/u;", EventConstants.KEY_SOURCE, "Landroidx/lifecycle/Lifecycle$Event;", "onStateChanged", "(Landroidx/lifecycle/u;Landroidx/lifecycle/Lifecycle$Event;)V", "onPlayerReset", "onMediaItemTransition", "reset", "app2Background", "pageFrom", "videoStartPrepare", "(Ljava/lang/String;)V", "url", "setVideoUrl", "onSetDataSource", "onRenderFirstFrame", "Lfo/e;", "mediaSource", "onVideoStart", "(Lfo/e;)V", "onPrepare", "onVideoPause", "", NotificationCompat.CATEGORY_PROGRESS, "onProgress", "(JLfo/e;)V", "onLoadingBegin", "onLoadingEnd", "Lcom/transsion/player/orplayer/PlayError;", "errorInfo", "onPlayError", "(Lcom/transsion/player/orplayer/PlayError;Lfo/e;)V", "onLoopingStart", "onCompletion", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "showEpisodeListDialog", "getProgress", "()J", "remaining", "updateUnlockCountdownText$shortTvLib_release", "(Ljava/lang/Integer;)V", "updateUnlockCountdownText", "isAuto", "watchAdToUnlock$shortTvLib_release", "watchAdToUnlock", "onNetConnect", "onGetDubsInfo", "onAudioTrackChange", "Lcom/transsion/subtitle_download/db/SubtitleDownloadTable;", "stDownloadTable", "onDownloading", "(ILcom/transsion/subtitle_download/db/SubtitleDownloadTable;)V", "onComplete", "(Lcom/transsion/subtitle_download/db/SubtitleDownloadTable;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "dbBean", "onFail", "(Ljava/lang/Exception;Lcom/transsion/subtitle_download/db/SubtitleDownloadTable;)V", "T0", "Los/f;", "result", "U", "(Los/f;)V", "Z", "Y", "Q0", "isImmersive", "Y0", "w", "h", "Z0", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "ep", "Lcom/transsion/shorttv/bean/Subject;", "subject", "Lcom/transsion/shorttv/bean/ShortTVItem;", "I0", "(Ljava/lang/String;Lcom/transsion/shorttv/bean/Subject;Lcom/transsion/shorttv/bean/ShortTVItem;Z)V", "b1", "V0", "(J)V", "max", "W0", "v0", "H0", "O0", "a0", PushConstants.PUSH_SERVICE_TYPE_SHOW, "setLoading", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "B0", "e0", "X", "L", "P0", "Lcom/transsion/shorttv/bean/Video;", "video", "I", "(Lcom/transsion/player/ui/ORPlayerView;Lcom/transsion/shorttv/bean/Video;)V", "R0", "S0", "K0", "W", "J", "(Landroid/view/View;Lcom/transsion/shorttv/bean/Subject;)V", "K", "J0", "V", EventConstants.KEY_TIME, "Landroid/text/SpannableString;", "N", "(Ljava/lang/String;)Landroid/text/SpannableString;", "remainingMs", "U0", "O", "userId", "Q", "h0", "C0", "g0", "z0", "b0", "x0", "q0", "E0", "Lys/b;", "G0", "(Lys/b;)V", "Lcom/transsion/shorttv/bean/DubsInfo;", "info", "s0", "(Lcom/transsion/shorttv/bean/DubsInfo;)V", "S", "j0", "()Z", "i0", "o0", "k0", "a", "Ljava/lang/String;", "TAG", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "screenWidth", "Lrs/k0;", "c", "Lrs/k0;", "viewBinding", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Los/e;", "data", "Lcom/transsion/shorttv/bean/Subject;", "shortTvInfo", "f", "Lcom/transsion/shorttv/ui/fragment/ShortTvDetailListFragment;", "g", "Ljava/lang/Boolean;", "Ljava/lang/Integer;", "i", "j", "Lcom/transsion/player/orplayer/g;", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/player/ui/ORPlayerView;", "l", "Lcom/transsion/shorttv/base/pager/PagerLayoutManager;", "Landroid/view/GestureDetector;", "m", "Landroid/view/GestureDetector;", "gestureDetector", "Lxs/c;", "n", "Lxs/c;", "dotLayer", "o", "isClickPause", TtmlNode.TAG_P, "isHorizontalDragging", CampaignEx.JSON_KEY_AD_Q, "isPageHide", CampaignEx.JSON_KEY_AD_R, "currentSaveProgress", "s", "isFirstPlayInSession", "setFirstPlayInSession", "Lcom/transsion/shorttv/ui/widget/c;", "t", "Lcom/transsion/shorttv/ui/widget/c;", "downloadGuideBubbleController", TmcStartParams.KEY_URL_SHORT, "resImgLargeWidth", "resImgLargeHeight", "resImgSmallWidth", "x", "resImgSmallHeight", "y", "z", "Lcom/transsion/shorttv/viewmodel/ShortTvViewModel;", "mShortTvViewModel", "Lbt/a;", "A", "Lbt/a;", "mShortTvSubViewModel", "B", "videoWidth", "C", "videoHeight", "Lcom/transsion/shorttv/subtitle/a;", "D", "Lcom/transsion/shorttv/subtitle/a;", "subtitleControl", "Landroidx/constraintlayout/widget/Group;", "E", "Landroidx/constraintlayout/widget/Group;", "groupContent", "F", "isOptimizeEnable", "G", "hasAd", "Landroidx/lifecycle/c0;", "H", "Landroidx/lifecycle/c0;", "observer", "favoriteObserver", "com/transsion/shorttv/ui/widget/ShortTvVideoItemView$d", "Lcom/transsion/shorttv/ui/widget/ShortTvVideoItemView$d;", "favoriteResultObserver", "isFirstFrame", "isPrepare", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "M", "Ljava/lang/Runnable;", "delayToastNetErrRunnable", "isLoading", "Landroid/os/Handler;", "Landroid/os/Handler;", "autoHideRightMenuHandle", "P", "autoHideRightMenuRunnable", "watchAdUnlockSeconds", "R", "Landroid/view/View;", "lockedView", "isEpisodeLocked", "Lcom/transsion/shorttv/ad/common/STCommonVideoAdHelper;", "T", "Lcom/transsion/shorttv/ad/common/STCommonVideoAdHelper;", "videoAdHelper", "isFreePreviewMode", "Lcom/transsion/shorttv/ui/widget/a1;", "Lcom/transsion/shorttv/ui/widget/a1;", "getCountdownController", "()Lcom/transsion/shorttv/ui/widget/a1;", "setCountdownController", "(Lcom/transsion/shorttv/ui/widget/a1;)V", "countdownController", "Lys/b;", "subDownloadBean", "hasSubDownloading", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTvVideoItemView extends ConstraintLayout implements InterfaceC16633f, View.OnClickListener, InterfaceC3218r, InterfaceC19112d, InterfaceC19743a {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private C4880a mShortTvSubViewModel;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private int videoWidth;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private int videoHeight;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private InterfaceC18876a subtitleControl;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private Group groupContent;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final boolean isOptimizeEnable;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private boolean hasAd;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC3189c0 observer;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC3189c0 favoriteObserver;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C19099d favoriteResultObserver;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private boolean isFirstFrame;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private boolean isPrepare;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final Runnable delayToastNetErrRunnable;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private boolean isLoading;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final Handler autoHideRightMenuHandle;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final Runnable autoHideRightMenuRunnable;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private Integer watchAdUnlockSeconds;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private View lockedView;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private boolean isEpisodeLocked;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private STCommonVideoAdHelper videoAdHelper;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private boolean isFreePreviewMode;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private InterfaceC19107a1 countdownController;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private C29007b subDownloadBean;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private boolean hasSubDownloading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int screenWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27349k0 viewBinding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C26719e data;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Subject shortTvInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private ShortTvDetailListFragment fragment;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Boolean videoLoadMore;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Integer position;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String basePostId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private InterfaceC16634g orPlayer;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private ORPlayerView orPlayerView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private PagerLayoutManager pagerLayoutManager;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private GestureDetector gestureDetector;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private C28655c dotLayer;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean isClickPause;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean isHorizontalDragging;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean isPageHide;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private long currentSaveProgress;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean isFirstPlayInSession;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private C19110c downloadGuideBubbleController;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final int resImgLargeWidth;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final int resImgLargeHeight;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int resImgSmallWidth;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final int resImgSmallHeight;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private String pageFrom;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private ShortTvViewModel mShortTvViewModel;

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.widget.ShortTvVideoItemView$a */
    public /* synthetic */ class C19096a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f61460a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f61461b;

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
            f61460a = iArr;
            int[] iArr2 = new int[AdLoadState.values().length];
            try {
                iArr2[AdLoadState.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AdLoadState.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AdLoadState.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[AdLoadState.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[AdLoadState.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[AdLoadState.SUCCEED.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            f61461b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.widget.ShortTvVideoItemView$b */
    public static final class C19097b implements InterfaceC3189c0 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC28218i f61463b;

        C19097b(InterfaceC28218i interfaceC28218i) {
            this.f61463b = interfaceC28218i;
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Unit unit) {
            LiveData liveDataM80343H0;
            C3187b0 c3187b0M80385l0;
            C3187b0 c3187b0M80385l1;
            ShortTvVideoItemView.this.setLoading(false);
            ShortTvViewModel shortTvViewModel = ShortTvVideoItemView.this.mShortTvViewModel;
            if (shortTvViewModel != null && (c3187b0M80385l1 = shortTvViewModel.m80385l0()) != null) {
                c3187b0M80385l1.mo14856o(this);
            }
            ShortTvViewModel shortTvViewModel2 = ShortTvVideoItemView.this.mShortTvViewModel;
            Subject subject = null;
            if (shortTvViewModel2 != null && (c3187b0M80385l0 = shortTvViewModel2.m80385l0()) != null) {
                c3187b0M80385l0.mo14858q(null);
            }
            ShortTvViewModel shortTvViewModel3 = ShortTvVideoItemView.this.mShortTvViewModel;
            if (shortTvViewModel3 != null && (liveDataM80343H0 = shortTvViewModel3.m80343H0()) != null) {
                subject = (Subject) liveDataM80343H0.m14847f();
            }
            if (subject == null || subject.getIsPaid() != 1) {
                ShortTvVideoItemView.this.m80123Q(this.f61463b.getUserId());
            } else {
                ShortTvVideoItemView shortTvVideoItemView = ShortTvVideoItemView.this;
                shortTvVideoItemView.updateShortTvInfo(shortTvVideoItemView.orPlayer, ShortTvVideoItemView.this.orPlayerView, ShortTvVideoItemView.this.data);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.widget.ShortTvVideoItemView$c */
    public static final class C19098c implements InterfaceC18853b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Subject f61465b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f61466c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f61467d;

        C19098c(Subject subject, int i11, String str) {
            this.f61465b = subject;
            this.f61466c = i11;
            this.f61467d = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final Unit m80195d(ShortTvVideoItemView shortTvVideoItemView, String str) {
            shortTvVideoItemView.m80123Q(str);
            return Unit.f75682a;
        }

        @Override // com.transsion.shorttv.order.InterfaceC18853b
        /* JADX INFO: renamed from: a */
        public void mo79400a(String errorCode, String errorMsg) {
            Intrinsics.m97802h(errorCode, "errorCode");
            Intrinsics.m97802h(errorMsg, "errorMsg");
            InterfaceC18853b.a.m79422a(this, errorCode, errorMsg);
            C26866a.a.m104901l(C26866a.f81698a, ShortTvVideoItemView.this.TAG, "callPayMethod onPayFail, errorCode=" + errorCode + ", errorMsg=" + errorMsg, false, 4, null);
            C28654b.f87887a.m110430j(this.f61465b, this.f61466c, "fail", errorMsg, errorCode, MediaItem.MUSIC_FLOAT_STATE_PLAY);
            ShortTvAlertDialog.Companion companion = ShortTvAlertDialog.INSTANCE;
            String string = ShortTvVideoItemView.this.getContext().getString(R$string.short_tv_pay_failed_title);
            Intrinsics.m97801g(string, "getString(...)");
            String string2 = ShortTvVideoItemView.this.getContext().getString(R$string.short_tv_pay_failed_message);
            Intrinsics.m97801g(string2, "getString(...)");
            String string3 = ShortTvVideoItemView.this.getContext().getString(R$string.short_tv_payment_retry);
            Intrinsics.m97801g(string3, "getString(...)");
            final ShortTvVideoItemView shortTvVideoItemView = ShortTvVideoItemView.this;
            final String str = this.f61467d;
            companion.m79676a(string, string2, string3, (32 & 8) != 0 ? null : new Function0() { // from class: com.transsion.shorttv.ui.widget.y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShortTvVideoItemView.C19098c.m80195d(shortTvVideoItemView, str);
                }
            }, (32 & 16) != 0 ? null : ShortTvVideoItemView.this.getContext().getString(R$string.short_tv_payment_cancel), (32 & 32) != 0 ? null : null).mo79034i0(ShortTvVideoItemView.this.getContext(), "ShortTvAlertDialog");
        }

        @Override // com.transsion.shorttv.order.InterfaceC18853b
        /* JADX INFO: renamed from: b */
        public void mo79401b(GetPaynicornOrderStatusRespEntity getPaynicornOrderStatusRespEntity) {
            String description;
            String string;
            String orderStatus;
            InterfaceC18853b.a.m79423b(this, getPaynicornOrderStatusRespEntity);
            C26866a.a.m104905r(C26866a.f81698a, ShortTvVideoItemView.this.TAG, new String[]{"callPayMethod onPurchase, orderStatus=" + getPaynicornOrderStatusRespEntity}, false, 4, null);
            C25427b.f76996a.m99961e(ShortTvVideoItemView.this.getContext().getString(R$string.short_tv_pay_series_successfully));
            Integer numV = (getPaynicornOrderStatusRespEntity == null || (orderStatus = getPaynicornOrderStatusRespEntity.getOrderStatus()) == null) ? null : StringsKt.m98216v(orderStatus);
            if (numV != null && numV.intValue() == 2) {
                C28654b.f87887a.m110430j(this.f61465b, this.f61466c, NativeComponentConstants.KEY_COMPONENT_RESULT_SUCCESS, "", "0", MediaItem.MUSIC_FLOAT_STATE_PLAY);
                ShortTvViewModel shortTvViewModel = ShortTvVideoItemView.this.mShortTvViewModel;
                if (shortTvViewModel != null) {
                    shortTvViewModel.m80356R0(1);
                }
                ShortTvVideoItemView shortTvVideoItemView = ShortTvVideoItemView.this;
                shortTvVideoItemView.updateShortTvInfo(shortTvVideoItemView.orPlayer, ShortTvVideoItemView.this.orPlayerView, ShortTvVideoItemView.this.data);
                return;
            }
            if (numV != null && numV.intValue() == 3) {
                C28654b.f87887a.m110430j(this.f61465b, this.f61466c, "cancel", "", "0", MediaItem.MUSIC_FLOAT_STATE_PLAY);
                return;
            }
            C28654b c28654b = C28654b.f87887a;
            Subject subject = this.f61465b;
            int i11 = this.f61466c;
            if (getPaynicornOrderStatusRespEntity == null || (description = getPaynicornOrderStatusRespEntity.getDescription()) == null) {
                description = "";
            }
            String str = description;
            if (numV == null || (string = numV.toString()) == null) {
                string = TmcConstants.COLD_OPEN_TYPE;
            }
            c28654b.m110430j(subject, i11, "fail", str, string, MediaItem.MUSIC_FLOAT_STATE_PLAY);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.widget.ShortTvVideoItemView$d */
    public static final class C19099d implements InterfaceC3189c0 {

        /* JADX INFO: renamed from: a */
        private AbstractC26720f f61468a;

        C19099d() {
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(AbstractC26720f abstractC26720f) {
            if (Intrinsics.m97797c(this.f61468a, abstractC26720f)) {
                return;
            }
            ShortTvVideoItemView.this.m80131U(abstractC26720f);
        }

        /* JADX INFO: renamed from: b */
        public final void m80197b(AbstractC26720f abstractC26720f) {
            this.f61468a = abstractC26720f;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.widget.ShortTvVideoItemView$e */
    public static final class C19100e extends GestureDetector.SimpleOnGestureListener {
        C19100e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            ShortTvVideoItemView.this.m80184v0();
            return super.onSingleTapUp(e11);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.widget.ShortTvVideoItemView$f */
    public static final class C19101f implements C19110c.b {
        C19101f() {
        }

        @Override // com.transsion.shorttv.p315ui.widget.C19110c.b
        /* JADX INFO: renamed from: a */
        public InterfaceC28213d mo80198a() {
            ShortTvViewModel shortTvViewModel = ShortTvVideoItemView.this.mShortTvViewModel;
            if (shortTvViewModel != null) {
                return shortTvViewModel.m80392s0();
            }
            return null;
        }

        @Override // com.transsion.shorttv.p315ui.widget.C19110c.b
        /* JADX INFO: renamed from: b */
        public String mo80199b() {
            ShortTVItem shortTVItemM104512d;
            Media video;
            Video video2;
            C26719e c26719e = ShortTvVideoItemView.this.data;
            if (c26719e == null || (shortTVItemM104512d = c26719e.m104512d()) == null || (video = shortTVItemM104512d.getVideo()) == null || (video2 = video.getVideo()) == null) {
                return null;
            }
            return video2.getUrl();
        }

        @Override // com.transsion.shorttv.p315ui.widget.C19110c.b
        /* JADX INFO: renamed from: c */
        public boolean mo80200c() {
            return ShortTvVideoItemView.this.isLoading;
        }

        @Override // com.transsion.shorttv.p315ui.widget.C19110c.b
        /* JADX INFO: renamed from: d */
        public void mo80201d() {
            ShortTvVideoItemView.this.m80122P0();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.widget.ShortTvVideoItemView$g */
    public static final class C19102g implements C18788e.a {

        /* JADX INFO: renamed from: a */
        private int f61472a;

        /* JADX INFO: renamed from: b */
        private int f61473b;

        /* JADX INFO: renamed from: c */
        private int f61474c;

        /* JADX INFO: renamed from: d */
        private String f61475d = "";

        /* JADX INFO: renamed from: e */
        private int f61476e = AbstractC5776a0.m27313a(1.5f);

        C19102g() {
        }

        @Override // com.transsion.shorttv.base.widget.C18788e.a
        /* JADX INFO: renamed from: a */
        public void mo79199a() {
        }

        @Override // com.transsion.shorttv.base.widget.C18788e.a
        /* JADX INFO: renamed from: b */
        public void mo79200b(float f11, float f12) {
            int i11 = 0;
            if (!ShortTvVideoItemView.this.isHorizontalDragging) {
                PagerLayoutManager pagerLayoutManager = ShortTvVideoItemView.this.pagerLayoutManager;
                if (pagerLayoutManager != null) {
                    pagerLayoutManager.m79146W(false);
                }
                this.f61472a = ShortTvVideoItemView.this.viewBinding.f83255s.getProgress();
                AppCompatTextView tvProgressDes = ShortTvVideoItemView.this.viewBinding.f83226C;
                Intrinsics.m97801g(tvProgressDes, "tvProgressDes");
                AbstractC23048b.m91694e(tvProgressDes);
                AppCompatSeekBar seekBar = ShortTvVideoItemView.this.viewBinding.f83257u;
                Intrinsics.m97801g(seekBar, "seekBar");
                AbstractC23048b.m91694e(seekBar);
                ProgressBar progressBar = ShortTvVideoItemView.this.viewBinding.f83255s;
                Intrinsics.m97801g(progressBar, "progressBar");
                AbstractC23048b.m91691b(progressBar);
                this.f61474c = ShortTvVideoItemView.this.viewBinding.f83255s.getWidth();
                int max = ShortTvVideoItemView.this.viewBinding.f83255s.getMax();
                this.f61473b = max;
                this.f61475d = AbstractC19170m.m80255a(max);
            }
            ShortTvVideoItemView.this.isHorizontalDragging = true;
            float f13 = f12 - f11;
            int i12 = this.f61473b;
            int i13 = (int) (this.f61472a + ((f13 * i12) / this.f61474c));
            if (i13 >= 0) {
                i11 = i13 > i12 ? i12 : i13;
            }
            ShortTvVideoItemView.this.viewBinding.f83226C.setText(AbstractC19170m.m80255a(i11) + " / " + this.f61475d);
            ShortTvVideoItemView.this.m80134V0((long) i11);
        }

        @Override // com.transsion.shorttv.base.widget.C18788e.a
        /* JADX INFO: renamed from: c */
        public void mo79201c(float f11, float f12) {
        }

        @Override // com.transsion.shorttv.base.widget.C18788e.a
        /* JADX INFO: renamed from: d */
        public void mo79202d(float f11, float f12) {
        }

        @Override // com.transsion.shorttv.base.widget.C18788e.a
        /* JADX INFO: renamed from: e */
        public void mo79203e() {
            PagerLayoutManager pagerLayoutManager = ShortTvVideoItemView.this.pagerLayoutManager;
            if (pagerLayoutManager != null) {
                pagerLayoutManager.m79146W(true);
            }
            if (ShortTvVideoItemView.this.isHorizontalDragging) {
                ShortTvVideoItemView.this.isHorizontalDragging = false;
                AppCompatTextView tvProgressDes = ShortTvVideoItemView.this.viewBinding.f83226C;
                Intrinsics.m97801g(tvProgressDes, "tvProgressDes");
                AbstractC23048b.m91691b(tvProgressDes);
                AppCompatSeekBar seekBar = ShortTvVideoItemView.this.viewBinding.f83257u;
                Intrinsics.m97801g(seekBar, "seekBar");
                AbstractC23048b.m91691b(seekBar);
                ProgressBar progressBar = ShortTvVideoItemView.this.viewBinding.f83255s;
                Intrinsics.m97801g(progressBar, "progressBar");
                AbstractC23048b.m91694e(progressBar);
                long progress = ShortTvVideoItemView.this.viewBinding.f83255s.getProgress();
                C26719e c26719e = ShortTvVideoItemView.this.data;
                if (c26719e == null || !AbstractC26726l.m104526a(c26719e)) {
                    C26866a.a.m104898f(C26866a.f81698a, ShortTvVideoItemView.this.TAG, "数据还没有拉下来，不进行seek", false, 4, null);
                    return;
                }
                InterfaceC16634g interfaceC16634g = ShortTvVideoItemView.this.orPlayer;
                if (interfaceC16634g != null) {
                    interfaceC16634g.seekTo(progress);
                }
                InterfaceC16634g interfaceC16634g2 = ShortTvVideoItemView.this.orPlayer;
                if (interfaceC16634g2 == null || interfaceC16634g2.isPlaying()) {
                    return;
                }
                ShortTvVideoItemView.this.m80106H0();
            }
        }

        @Override // com.transsion.shorttv.base.widget.C18788e.a
        public void onDoubleTap(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
        }

        @Override // com.transsion.shorttv.base.widget.C18788e.a
        public void onLongPress(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.widget.ShortTvVideoItemView$h */
    public static final class C19103h implements ExpandView.InterfaceC18791c {
        C19103h() {
        }

        @Override // com.transsion.shorttv.base.widget.expand.ExpandView.InterfaceC18791c
        /* JADX INFO: renamed from: a */
        public void mo79218a(ExpandView expandView) {
            ShortTvVideoItemView.this.m80122P0();
        }

        @Override // com.transsion.shorttv.base.widget.expand.ExpandView.InterfaceC18791c
        /* JADX INFO: renamed from: b */
        public void mo79219b(ExpandView expandView) {
            ShortTvVideoItemView.this.m80113L();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.widget.ShortTvVideoItemView$i */
    public static final class C19104i implements RequestListener {
        C19104i() {
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
    /* JADX WARN: Code duplicated, block: B:41:0x01ad  */
    public ShortTvVideoItemView(Context context, AttributeSet attributeSet, int i11) {
        Group group;
        Object objM112707constructorimpl;
        Integer numValueOf;
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.TAG = "ShortTv-Imm";
        this.screenWidth = AbstractC5806y.m27489e();
        this.pageFrom = "";
        this.isOptimizeEnable = C27122a.f82222a.m105520c();
        View.inflate(getContext(), R$layout.short_tv_layout_video_item_view, this);
        C27349k0 c27349k0M106464a = C27349k0.m106464a(this);
        Intrinsics.m97801g(c27349k0M106464a, "bind(...)");
        this.viewBinding = c27349k0M106464a;
        c27349k0M106464a.f83261y.setText("");
        int iM27351c = AbstractC5781d.m27351c();
        c27349k0M106464a.f83258v.setPadding(0, iM27351c, 0, 0);
        BLTextView tvWatchFreeCountdown = c27349k0M106464a.f83231H;
        Intrinsics.m97801g(tvWatchFreeCountdown, "tvWatchFreeCountdown");
        ViewGroup.LayoutParams layoutParams = tvWatchFreeCountdown.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
        ((ViewGroup.MarginLayoutParams) c2308b).topMargin = iM27351c + AbstractC5776a0.m27313a(10.0f);
        tvWatchFreeCountdown.setLayoutParams(c2308b);
        c27349k0M106464a.f83246j.setOnClickListener(this);
        c27349k0M106464a.f83262z.setOnClickListener(this);
        c27349k0M106464a.f83261y.setOnClickListener(this);
        c27349k0M106464a.f83250n.setOnClickListener(this);
        c27349k0M106464a.f83249m.setOnClickListener(this);
        c27349k0M106464a.f83248l.setOnClickListener(this);
        c27349k0M106464a.f83251o.setOnClickListener(this);
        c27349k0M106464a.f83225B.setOnClickListener(this);
        c27349k0M106464a.f83228E.setOnClickListener(this);
        c27349k0M106464a.f83224A.setOnClickListener(this);
        c27349k0M106464a.f83259w.setOnClickListener(this);
        c27349k0M106464a.f83229F.setOnClickListener(this);
        c27349k0M106464a.f83227D.setOnClickListener(this);
        this.resImgLargeWidth = AbstractC5776a0.m27313a(48.0f);
        this.resImgLargeHeight = AbstractC5776a0.m27313a(64.0f);
        this.resImgSmallWidth = AbstractC5776a0.m27313a(24.0f);
        this.resImgSmallHeight = AbstractC5776a0.m27313a(32.0f);
        if (C27124c.f82233a.m105540b().m105524d().mo105533c()) {
            AppCompatImageView ivShare = c27349k0M106464a.f83250n;
            Intrinsics.m97801g(ivShare, "ivShare");
            AbstractC23048b.m91691b(ivShare);
            AppCompatTextView tvFavorite = c27349k0M106464a.f83262z;
            Intrinsics.m97801g(tvFavorite, "tvFavorite");
            AbstractC23048b.m91691b(tvFavorite);
            group = c27349k0M106464a.f83243g;
            Intrinsics.m97799e(group);
        } else {
            group = c27349k0M106464a.f83244h;
            Intrinsics.m97799e(group);
        }
        this.groupContent = group;
        m80141Z(context);
        m80143a0();
        this.observer = new InterfaceC3189c0() { // from class: com.transsion.shorttv.ui.widget.q0
            @Override // androidx.p1004lifecycle.InterfaceC3189c0
            public final void onChanged(Object obj) {
                ShortTvVideoItemView.m80172p0(this.f61529a, ((Boolean) obj).booleanValue());
            }
        };
        this.favoriteObserver = new InterfaceC3189c0() { // from class: com.transsion.shorttv.ui.widget.r0
            @Override // androidx.p1004lifecycle.InterfaceC3189c0
            public final void onChanged(Object obj) {
                ShortTvVideoItemView.m80129T(this.f61530a, (Boolean) obj);
            }
        };
        this.favoriteResultObserver = new C19099d();
        this.delayToastNetErrRunnable = new Runnable() { // from class: com.transsion.shorttv.ui.widget.s0
            @Override // java.lang.Runnable
            public final void run() {
                ShortTvVideoItemView.m80125R(this.f61533a);
            }
        };
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.m97799e(looperMyLooper);
        this.autoHideRightMenuHandle = new Handler(looperMyLooper);
        this.autoHideRightMenuRunnable = new Runnable() { // from class: com.transsion.shorttv.ui.widget.t0
            @Override // java.lang.Runnable
            public final void run() {
                ShortTvVideoItemView.m80115M(this.f61536a);
            }
        };
        C29238a c29238a = C29238a.f89219a;
        try {
            Result.Companion companion = Result.INSTANCE;
            JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b("ShortTvPlayerUnlockPlayScene");
            JsonElement jsonElement = jsonObjectM63626b != null ? jsonObjectM63626b.get("autoWatchAdCountDown") : null;
            KClass kClassM97823b = Reflection.m97823b(Integer.class);
            if (Intrinsics.m97797c(kClassM97823b, Reflection.m97823b(String.class))) {
                if (jsonElement != null) {
                    jsonElement.getAsString();
                }
            } else {
                if (Intrinsics.m97797c(kClassM97823b, Reflection.m97823b(Integer.TYPE))) {
                    numValueOf = jsonElement != null ? Integer.valueOf(jsonElement.getAsInt()) : null;
                    if (!(numValueOf instanceof Integer)) {
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl(numValueOf);
                    this.watchAdUnlockSeconds = (Integer) (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) == null ? objM112707constructorimpl : null);
                }
                if (Intrinsics.m97797c(kClassM97823b, Reflection.m97823b(Long.TYPE))) {
                    if (jsonElement != null) {
                        jsonElement.getAsLong();
                    }
                } else if (Intrinsics.m97797c(kClassM97823b, Reflection.m97823b(Boolean.TYPE)) && jsonElement != null) {
                    jsonElement.getAsBoolean();
                }
            }
            numValueOf = null;
            objM112707constructorimpl = Result.m112707constructorimpl(numValueOf);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        this.watchAdUnlockSeconds = (Integer) (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) == null ? objM112707constructorimpl : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final Unit m80092A0(ShortTvVideoItemView shortTvVideoItemView, Ref.IntRef intRef, ShortTVItem shortTVItem, ShortTvVideoCtrBean clickItem) {
        ShortTVItem shortTVItemM104512d;
        List<Video> addressList;
        Object next;
        ShortTVItem shortTVItemM104512d2;
        Map mapMo102959a;
        ShortTVItem shortTVItemM104512d3;
        String resolution;
        Integer numV;
        Intrinsics.m97802h(clickItem, "clickItem");
        shortTvVideoItemView.m80113L();
        float content = clickItem.getContent();
        if (intRef.element == content) {
            return Unit.f75682a;
        }
        C19165h.f61575a.m80241d().putInt("k_short_tv_resolution", (int) clickItem.getContent());
        shortTvVideoItemView.viewBinding.f83227D.setText(((int) content) + "P");
        Media video = shortTVItem.getVideo();
        int ep2 = 0;
        if (video != null && (addressList = video.getAddressList()) != null) {
            Iterator<T> it = addressList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                resolution = ((Video) next).getResolution();
            } while (((resolution == null || (numV = StringsKt.m98216v(resolution)) == null) ? 0 : numV.intValue()) != ((int) clickItem.getContent()));
            Video video2 = (Video) next;
            if (video2 != null) {
                String url = video2.getUrl();
                String url2 = video2.getUrl();
                String str = url2 == null ? "" : url2;
                C26719e c26719e = shortTvVideoItemView.data;
                C23403e c23403e = new C23403e(url, str, (c26719e == null || (shortTVItemM104512d3 = c26719e.m104512d()) == null) ? 0 : shortTVItemM104512d3.getEp(), null, null, 24, null);
                InterfaceC16634g interfaceC16634g = shortTvVideoItemView.orPlayer;
                InterfaceC26373f interfaceC26373f = interfaceC16634g instanceof InterfaceC26373f ? (InterfaceC26373f) interfaceC16634g : null;
                boolean zContainsKey = (interfaceC26373f == null || (mapMo102959a = interfaceC26373f.mo102959a()) == null) ? false : mapMo102959a.containsKey(c23403e.m92929e());
                C26866a.a aVar = C26866a.f81698a;
                String str2 = shortTvVideoItemView.TAG;
                float content2 = clickItem.getContent();
                C26719e c26719e2 = shortTvVideoItemView.data;
                Integer numValueOf = (c26719e2 == null || (shortTVItemM104512d2 = c26719e2.m104512d()) == null) ? null : Integer.valueOf(shortTVItemM104512d2.getEp());
                C26866a.a.m104898f(aVar, str2, "resolution play, res:" + content2 + ", EP:" + numValueOf + ", inList:" + zContainsKey + ", url:" + video2.getUrl(), false, 4, null);
                InterfaceC16634g interfaceC16634g2 = shortTvVideoItemView.orPlayer;
                long currentPosition = interfaceC16634g2 != null ? interfaceC16634g2.getCurrentPosition() : 0L;
                if (!zContainsKey) {
                    InterfaceC16634g interfaceC16634g3 = shortTvVideoItemView.orPlayer;
                    if (interfaceC16634g3 != null) {
                        interfaceC16634g3.addDataSource(c23403e);
                    }
                    InterfaceC16634g interfaceC16634g4 = shortTvVideoItemView.orPlayer;
                    if (interfaceC16634g4 != null) {
                        interfaceC16634g4.prepare();
                    }
                }
                InterfaceC16634g interfaceC16634g5 = shortTvVideoItemView.orPlayer;
                if (interfaceC16634g5 != null) {
                    String strM92929e = c23403e.m92929e();
                    interfaceC16634g5.seekTo(strM92929e != null ? strM92929e : "", currentPosition);
                }
            }
        }
        ShortTvViewModel shortTvViewModel = shortTvVideoItemView.mShortTvViewModel;
        if (shortTvViewModel != null) {
            String strValueOf = String.valueOf(content);
            C26719e c26719e3 = shortTvVideoItemView.data;
            if (c26719e3 != null && (shortTVItemM104512d = c26719e3.m104512d()) != null) {
                ep2 = shortTVItemM104512d.getEp();
            }
            InterfaceC16634g interfaceC16634g6 = shortTvVideoItemView.orPlayer;
            shortTvViewModel.m80364W0(strValueOf, ep2, interfaceC16634g6 instanceof InterfaceC26373f ? (InterfaceC26373f) interfaceC16634g6 : null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: B0 */
    private final void m80094B0(View view) {
        LiveData liveDataM80343H0;
        Subject subject;
        InterfaceC28220k interfaceC28220kM80338C0;
        String pageName;
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        if (shortTvViewModel == null || (liveDataM80343H0 = shortTvViewModel.m80343H0()) == null || (subject = (Subject) liveDataM80343H0.m14847f()) == null) {
            return;
        }
        C28654b c28654b = C28654b.f87887a;
        String subjectId = subject.getSubjectId();
        String ops = subject.getOps();
        C26719e c26719e = this.data;
        C28654b.m110422n(c28654b, subjectId, ops, c26719e != null ? Integer.valueOf(c26719e.m104511c()) : null, null, 8, null);
        ShortTvViewModel shortTvViewModel2 = this.mShortTvViewModel;
        if (shortTvViewModel2 == null || (interfaceC28220kM80338C0 = shortTvViewModel2.m80338C0()) == null) {
            return;
        }
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        String subjectId2 = subject.getSubjectId();
        Subject subject2 = this.shortTvInfo;
        String title = subject2 != null ? subject2.getTitle() : null;
        ShortTvDetailListFragment shortTvDetailListFragment2 = this.fragment;
        if (shortTvDetailListFragment2 == null || (pageName = shortTvDetailListFragment2.getPageName()) == null) {
            pageName = "";
        }
        interfaceC28220kM80338C0.mo73718a(shortTvDetailListFragment, subjectId2, title, pageName);
    }

    /* JADX INFO: renamed from: C0 */
    private final void m80096C0() {
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "VideoSpeed, click", false, 4, null);
        m80122P0();
        final float f11 = C19165h.f61575a.m80241d().getFloat("k_short_tv_speed", 1.0f);
        for (ShortTvVideoCtrBean shortTvVideoCtrBean : AbstractC19169l.m80252b()) {
            shortTvVideoCtrBean.setSelect(shortTvVideoCtrBean.getContent() == f11);
        }
        AppCompatTextView tvSpeed = this.viewBinding.f83228E;
        Intrinsics.m97801g(tvSpeed, "tvSpeed");
        AbstractC19169l.m80253c(tvSpeed, AbstractC19169l.m80252b(), new Function1() { // from class: com.transsion.shorttv.ui.widget.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvVideoItemView.m80098D0(this.f61515a, f11, (ShortTvVideoCtrBean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final Unit m80098D0(ShortTvVideoItemView shortTvVideoItemView, float f11, ShortTvVideoCtrBean clickItem) {
        Intrinsics.m97802h(clickItem, "clickItem");
        shortTvVideoItemView.m80113L();
        float content = clickItem.getContent();
        if (f11 == content) {
            return Unit.f75682a;
        }
        C19165h.f61575a.m80241d().putFloat("k_short_tv_speed", content);
        int i11 = (int) content;
        String strValueOf = ((float) i11) == content ? String.valueOf(i11) : String.valueOf(content);
        shortTvVideoItemView.viewBinding.f83228E.setText(strValueOf + "x");
        InterfaceC16634g interfaceC16634g = shortTvVideoItemView.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.setSpeed(content);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: E0 */
    private final void m80100E0() {
        C3187b0 c3187b0M23390d;
        if (!C27287m.f83003a.m106330e()) {
            C25427b.f76996a.m99961e(Utils.m27275a().getString(R$string.short_tv_no_network_toast));
            return;
        }
        C4880a c4880a = this.mShortTvSubViewModel;
        List list = (c4880a == null || (c3187b0M23390d = c4880a.m23390d()) == null) ? null : (List) c3187b0M23390d.m14847f();
        if (list == null || list.isEmpty()) {
            C25427b.f76996a.m99961e(Utils.m27275a().getString(R$string.short_tv_no_error_content));
            return;
        }
        ShortTvLanguageSelectDialog shortTvLanguageSelectDialog = new ShortTvLanguageSelectDialog();
        shortTvLanguageSelectDialog.m79730D0(2);
        shortTvLanguageSelectDialog.m79729C0(new Function1() { // from class: com.transsion.shorttv.ui.widget.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvVideoItemView.m80102F0(this.f61492a, (DubsInfo) obj);
            }
        });
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        if (shortTvDetailListFragment != null) {
            shortTvLanguageSelectDialog.m79035j0(shortTvDetailListFragment, "ShortTvLanguageSelectDialog_Subtitle");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final Unit m80102F0(ShortTvVideoItemView shortTvVideoItemView, DubsInfo item) {
        Intrinsics.m97802h(item, "item");
        if (Intrinsics.m97797c(item.getLanCode(), "off")) {
            InterfaceC18876a interfaceC18876a = shortTvVideoItemView.subtitleControl;
            if (interfaceC18876a != null) {
                interfaceC18876a.mo79475f();
            }
        } else {
            C29007b subInfo = item.getSubInfo();
            if (subInfo != null) {
                shortTvVideoItemView.m80104G0(subInfo);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: G0 */
    private final void m80104G0(C29007b item) {
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onSubtitleSelect", false, 4, null);
        C19165h.f61575a.m80241d().putString("k_subtitle_language", item.m111561a().getLanName());
        C19773d.f63089a.m82370b().putString("k_subtitle_select_lan", item.m111561a().getLan());
        if (!item.m111562b()) {
            m80127S(item);
            return;
        }
        InterfaceC18876a interfaceC18876a = this.subtitleControl;
        if (interfaceC18876a != null) {
            interfaceC18876a.mo79476h(item);
        }
        this.subDownloadBean = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public final void m80106H0() {
        InterfaceC16634g interfaceC16634g;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, this.TAG, "playVideo   data:" + this.data + "  orPlayer:" + this.orPlayer, false, 4, null);
        if (this.orPlayer == null || AbstractC26726l.m104527b(this.data) || this.orPlayer == null || AbstractC26726l.m104527b(this.data)) {
            return;
        }
        if (!m80158i0() && !this.isFreePreviewMode) {
            C26866a.a.m104898f(aVar, this.TAG, "player- no free now, show pay dialog", false, 4, null);
            setLoading(false);
            InterfaceC16634g interfaceC16634g2 = this.orPlayer;
            if (interfaceC16634g2 != null) {
                interfaceC16634g2.pause();
                return;
            }
            return;
        }
        InterfaceC16634g interfaceC16634g3 = this.orPlayer;
        if (interfaceC16634g3 != null && interfaceC16634g3.isComplete() && (interfaceC16634g = this.orPlayer) != null) {
            interfaceC16634g.seekTo(0L);
        }
        InterfaceC16634g interfaceC16634g4 = this.orPlayer;
        if (interfaceC16634g4 != null) {
            interfaceC16634g4.play();
        }
        C26866a.a.m104898f(aVar, this.TAG, "player- startplay    ", false, 4, null);
    }

    /* JADX INFO: renamed from: I */
    private final void m80107I(ORPlayerView orPlayerView, Video video) {
        ViewParent parent = orPlayerView.getParent();
        if (!Intrinsics.m97797c(parent, this.viewBinding.f83241e)) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(orPlayerView);
            }
            this.viewBinding.f83241e.addView(orPlayerView, new FrameLayout.LayoutParams(-1, -1));
        }
        if (video != null) {
            m80142Z0(video.getWidth(), video.getHeight());
        }
    }

    /* JADX INFO: renamed from: I0 */
    private final void m80108I0(String ep2, Subject subject, ShortTVItem item, boolean fromTrending) {
        String description;
        String str;
        String description2;
        ExpandView expandView = this.viewBinding.f83240d;
        expandView.setExpandListener(new C19103h());
        if (item == null || (description2 = item.getDescription()) == null || description2.length() <= 0) {
            description = subject.getDescription();
            if (description == null) {
                description = "";
            }
        } else {
            description = item.getDescription();
        }
        if (description == null || description.length() == 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
            str = String.format("EP%s", Arrays.copyOf(new Object[]{ep2}, 1));
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.f75910a;
            str = String.format("EP%s | %s", Arrays.copyOf(new Object[]{ep2, description}, 2));
        }
        Intrinsics.m97801g(str, "format(...)");
        expandView.setTitle(str);
    }

    /* JADX INFO: renamed from: J */
    private final void m80109J(View view, Subject subject) {
        List<Integer> listL;
        if (subject == null || (listL = subject.getUnlockType()) == null) {
            listL = CollectionsKt.m97506l();
        }
        boolean zContains = listL.contains(1);
        boolean zContains2 = listL.contains(2);
        View viewFindViewById = view != null ? view.findViewById(R$id.iv_lock_icon) : null;
        View viewFindViewById2 = view != null ? view.findViewById(R$id.btn_watch_ad_unlock) : null;
        View viewFindViewById3 = view != null ? view.findViewById(R$id.tv_buy_to_continue) : null;
        View viewFindViewById4 = view != null ? view.findViewById(R$id.container_series_info) : null;
        if (zContains && zContains2) {
            if (viewFindViewById != null) {
                AbstractC23048b.m91694e(viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                AbstractC23048b.m91694e(viewFindViewById2);
            }
            if (viewFindViewById3 != null) {
                AbstractC23048b.m91691b(viewFindViewById3);
            }
            if (viewFindViewById4 != null) {
                AbstractC23048b.m91694e(viewFindViewById4);
                return;
            }
            return;
        }
        if (zContains) {
            if (viewFindViewById != null) {
                AbstractC23048b.m91694e(viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                AbstractC23048b.m91691b(viewFindViewById2);
            }
            if (viewFindViewById3 != null) {
                AbstractC23048b.m91694e(viewFindViewById3);
            }
            if (viewFindViewById4 != null) {
                AbstractC23048b.m91694e(viewFindViewById4);
                return;
            }
            return;
        }
        if (zContains2) {
            if (viewFindViewById != null) {
                AbstractC23048b.m91694e(viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                AbstractC23048b.m91694e(viewFindViewById2);
            }
            if (viewFindViewById3 != null) {
                AbstractC23048b.m91691b(viewFindViewById3);
            }
            if (viewFindViewById4 != null) {
                AbstractC23048b.m91691b(viewFindViewById4);
                return;
            }
            return;
        }
        if (viewFindViewById != null) {
            AbstractC23048b.m91691b(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            AbstractC23048b.m91691b(viewFindViewById2);
        }
        if (viewFindViewById3 != null) {
            AbstractC23048b.m91691b(viewFindViewById3);
        }
        if (viewFindViewById4 != null) {
            AbstractC23048b.m91691b(viewFindViewById4);
        }
    }

    /* JADX INFO: renamed from: J0 */
    private final void m80110J0() {
        LiveData liveDataM80343H0;
        Subject subject;
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        int unlockFrom = (shortTvViewModel == null || (liveDataM80343H0 = shortTvViewModel.m80343H0()) == null || (subject = (Subject) liveDataM80343H0.m14847f()) == null) ? 0 : subject.getUnlockFrom();
        if (unlockFrom <= 0) {
            return;
        }
        this.isFreePreviewMode = true;
        String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(unlockFrom / 60), Integer.valueOf(unlockFrom % 60)}, 2));
        Intrinsics.m97801g(str, "format(...)");
        this.viewBinding.f83231H.setText(m80117N(str));
        BLTextView tvWatchFreeCountdown = this.viewBinding.f83231H;
        Intrinsics.m97801g(tvWatchFreeCountdown, "tvWatchFreeCountdown");
        AbstractC23048b.m91694e(tvWatchFreeCountdown);
    }

    /* JADX INFO: renamed from: K */
    private final void m80111K(View view, Subject subject) {
        List<Integer> listL;
        if (subject == null || (listL = subject.getUnlockType()) == null) {
            listL = CollectionsKt.m97506l();
        }
        View viewFindViewById = view != null ? view.findViewById(R$id.iv_lock_icon) : null;
        View viewFindViewById2 = view != null ? view.findViewById(R$id.btn_watch_ad_unlock) : null;
        View viewFindViewById3 = view != null ? view.findViewById(R$id.tv_buy_to_continue) : null;
        View viewFindViewById4 = view != null ? view.findViewById(R$id.container_series_info) : null;
        if (listL.contains(1)) {
            if (viewFindViewById != null) {
                AbstractC23048b.m91694e(viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                AbstractC23048b.m91691b(viewFindViewById2);
            }
            if (viewFindViewById3 != null) {
                AbstractC23048b.m91694e(viewFindViewById3);
            }
            if (viewFindViewById4 != null) {
                AbstractC23048b.m91694e(viewFindViewById4);
                return;
            }
            return;
        }
        if (listL.contains(2)) {
            if (viewFindViewById != null) {
                AbstractC23048b.m91694e(viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                AbstractC23048b.m91694e(viewFindViewById2);
            }
            if (viewFindViewById3 != null) {
                AbstractC23048b.m91691b(viewFindViewById3);
            }
            if (viewFindViewById4 != null) {
                AbstractC23048b.m91691b(viewFindViewById4);
                return;
            }
            return;
        }
        if (viewFindViewById != null) {
            AbstractC23048b.m91691b(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            AbstractC23048b.m91691b(viewFindViewById2);
        }
        if (viewFindViewById3 != null) {
            AbstractC23048b.m91691b(viewFindViewById3);
        }
        if (viewFindViewById4 != null) {
            AbstractC23048b.m91691b(viewFindViewById4);
        }
    }

    /* JADX INFO: renamed from: K0 */
    private final void m80112K0(C26719e item) {
        FragmentActivity activity;
        List<Integer> unlockType;
        List<Integer> unlockType2;
        List<Integer> unlockType3;
        ShortTVItem shortTVItemM104512d;
        Media video;
        Cover cover;
        Cover cover2;
        AppCompatTextView appCompatTextView;
        String currencySymbol;
        SkuInfo skuInfo;
        SkuInfo skuInfo2;
        String price;
        AppCompatTextView appCompatTextView2;
        LiveData liveDataM80343H0;
        AppCompatTextView appCompatTextView3;
        View viewFindViewById;
        if (this.lockedView == null) {
            View viewInflate = this.viewBinding.f83235L.inflate();
            this.lockedView = viewInflate;
            if (viewInflate != null && (viewFindViewById = viewInflate.findViewById(R$id.btn_buy_full_series)) != null) {
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.widget.y
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ShortTvVideoItemView.m80114L0(this.f61560a, view);
                    }
                });
            }
        }
        View view = this.lockedView;
        if (view != null && (appCompatTextView3 = (AppCompatTextView) view.findViewById(R$id.btn_watch_ad_unlock)) != null) {
            appCompatTextView3.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.widget.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ShortTvVideoItemView.m80116M0(this.f61563a, view2);
                }
            });
        }
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        String url = null;
        Subject subject = (shortTvViewModel == null || (liveDataM80343H0 = shortTvViewModel.m80343H0()) == null) ? null : (Subject) liveDataM80343H0.m14847f();
        View view2 = this.lockedView;
        if (view2 != null && (appCompatTextView2 = (AppCompatTextView) view2.findViewById(R$id.tv_series_title)) != null) {
            appCompatTextView2.setText(subject != null ? subject.getTitle() : null);
        }
        View view3 = this.lockedView;
        if (view3 != null && (appCompatTextView = (AppCompatTextView) view3.findViewById(R$id.tv_series_price)) != null) {
            Float fT = (subject == null || (skuInfo2 = subject.getSkuInfo()) == null || (price = skuInfo2.getPrice()) == null) ? null : StringsKt.m98214t(price);
            if (subject == null || (skuInfo = subject.getSkuInfo()) == null || (currencySymbol = skuInfo.getCurrencySymbol()) == null) {
                currencySymbol = "$";
            }
            if (fT != null) {
                String str = String.format("From " + currencySymbol + "%.2f", Arrays.copyOf(new Object[]{fT}, 1));
                Intrinsics.m97801g(str, "format(...)");
                appCompatTextView.setText(str);
                AbstractC23048b.m91694e(appCompatTextView);
            } else {
                AbstractC23048b.m91691b(appCompatTextView);
            }
        }
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        if (shortTvDetailListFragment == null || (activity = shortTvDetailListFragment.getActivity()) == null) {
            Context context = getContext();
            activity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        }
        String url2 = (subject == null || (cover2 = subject.getCover()) == null) ? null : cover2.getUrl();
        View view4 = this.lockedView;
        AppCompatImageView appCompatImageView = view4 != null ? (AppCompatImageView) view4.findViewById(R$id.iv_series_cover) : null;
        if (appCompatImageView != null && url2 != null && url2.length() != 0 && activity != null) {
            Glide.with(activity).load2(url2).centerCrop().into(appCompatImageView);
        }
        View view5 = this.lockedView;
        final AppCompatImageView appCompatImageView2 = view5 != null ? (AppCompatImageView) view5.findViewById(R$id.iv_blur_bg) : null;
        if (item != null && (shortTVItemM104512d = item.m104512d()) != null && (video = shortTVItemM104512d.getVideo()) != null && (cover = video.getCover()) != null) {
            url = cover.getUrl();
        }
        String str2 = url;
        if (appCompatImageView2 != null && str2 != null && str2.length() != 0) {
            C18769e.m79097d(C18769e.f60616a, str2, 0, 0, new Function1() { // from class: com.transsion.shorttv.ui.widget.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShortTvVideoItemView.m80118N0(appCompatImageView2, (BitmapDrawable) obj);
                }
            }, 6, null);
        }
        if (subject == null || subject.getMiniTvType() != 2) {
            m80109J(this.lockedView, subject);
        } else {
            m80111K(this.lockedView, subject);
        }
        View view6 = this.lockedView;
        if (view6 != null) {
            AbstractC23048b.m91694e(view6);
        }
        this.isEpisodeLocked = true;
        this.autoHideRightMenuHandle.removeCallbacks(this.autoHideRightMenuRunnable);
        m80122P0();
        if (subject != null && (unlockType3 = subject.getUnlockType()) != null && unlockType3.contains(1)) {
            Group groupPayLockHide = this.viewBinding.f83245i;
            Intrinsics.m97801g(groupPayLockHide, "groupPayLockHide");
            AbstractC23048b.m91691b(groupPayLockHide);
        }
        m80133V();
        boolean z11 = subject != null && subject.getMiniTvType() == 2 && (unlockType2 = subject.getUnlockType()) != null && unlockType2.contains(1);
        if (subject != null && (unlockType = subject.getUnlockType()) != null && unlockType.contains(2) && !z11) {
            m80126R0();
        }
        C28654b c28654b = C28654b.f87887a;
        C26719e c26719e = this.data;
        c28654b.m110429i(subject, c26719e != null ? c26719e.m104511c() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public final void m80113L() {
        if (this.isEpisodeLocked) {
            return;
        }
        AppCompatImageView ivDownload = this.viewBinding.f83248l;
        Intrinsics.m97801g(ivDownload, "ivDownload");
        if (ivDownload.getVisibility() == 0) {
            this.autoHideRightMenuHandle.removeCallbacks(this.autoHideRightMenuRunnable);
            this.autoHideRightMenuHandle.postDelayed(this.autoHideRightMenuRunnable, 3000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final void m80114L0(ShortTvVideoItemView shortTvVideoItemView, View view) {
        shortTvVideoItemView.m80128S0();
        shortTvVideoItemView.m80119O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final void m80115M(ShortTvVideoItemView shortTvVideoItemView) {
        shortTvVideoItemView.m80137X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final void m80116M0(ShortTvVideoItemView shortTvVideoItemView, View view) {
        shortTvVideoItemView.m80128S0();
        watchAdToUnlock$shortTvLib_release$default(shortTvVideoItemView, false, 1, null);
    }

    /* JADX INFO: renamed from: N */
    private final SpannableString m80117N(String time) {
        String string = getContext().getString(R$string.short_tv_watch_free_countdown, time);
        Intrinsics.m97801g(string, "getString(...)");
        SpannableString spannableString = new SpannableString(string);
        int iO0 = StringsKt.m98156o0(string, time, 0, false, 6, null);
        if (iO0 < 0) {
            return spannableString;
        }
        int length = time.length() + iO0;
        int color = AbstractC2397b.getColor(getContext(), R$color.short_tv_white_60);
        int color2 = AbstractC2397b.getColor(getContext(), R$color.short_tv_white);
        if (iO0 > 0) {
            spannableString.setSpan(new ForegroundColorSpan(color), 0, iO0, 33);
        }
        spannableString.setSpan(new ForegroundColorSpan(color2), iO0, length, 33);
        if (length < string.length()) {
            spannableString.setSpan(new ForegroundColorSpan(color), length, string.length(), 33);
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final Unit m80118N0(AppCompatImageView appCompatImageView, BitmapDrawable drawable) {
        Intrinsics.m97802h(drawable, "drawable");
        appCompatImageView.setImageDrawable(drawable);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: O */
    private final void m80119O() {
        final InterfaceC28218i interfaceC28218iM80337B0;
        final ShortTvDetailListFragment shortTvDetailListFragment;
        LiveData liveDataM80343H0;
        C28654b c28654b = C28654b.f87887a;
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        Subject subject = (shortTvViewModel == null || (liveDataM80343H0 = shortTvViewModel.m80343H0()) == null) ? null : (Subject) liveDataM80343H0.m14847f();
        C26719e c26719e = this.data;
        c28654b.m110428h(subject, c26719e != null ? c26719e.m104511c() : 0, "minitv_pay", "");
        m80128S0();
        ShortTvViewModel shortTvViewModel2 = this.mShortTvViewModel;
        if (shortTvViewModel2 == null || (interfaceC28218iM80337B0 = shortTvViewModel2.m80337B0()) == null || (shortTvDetailListFragment = this.fragment) == null) {
            return;
        }
        if (interfaceC28218iM80337B0.mo73687a()) {
            m80123Q(interfaceC28218iM80337B0.getUserId());
        } else {
            shortTvDetailListFragment.m79898e1(interfaceC28218iM80337B0, new Function0() { // from class: com.transsion.shorttv.ui.widget.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShortTvVideoItemView.m80121P(this.f61494a, shortTvDetailListFragment, interfaceC28218iM80337B0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: O0 */
    private final void m80120O0() {
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        if (shortTvDetailListFragment != null) {
            shortTvDetailListFragment.m79905p1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final Unit m80121P(ShortTvVideoItemView shortTvVideoItemView, ShortTvDetailListFragment shortTvDetailListFragment, InterfaceC28218i interfaceC28218i) {
        String strM104513e;
        C3187b0 c3187b0M80385l0;
        C26719e c26719e = shortTvVideoItemView.data;
        if (c26719e == null || (strM104513e = c26719e.m104513e()) == null) {
            return Unit.f75682a;
        }
        C26719e c26719e2 = shortTvVideoItemView.data;
        if (c26719e2 == null) {
            return Unit.f75682a;
        }
        int iM104511c = c26719e2.m104511c();
        C19097b c19097b = shortTvVideoItemView.new C19097b(interfaceC28218i);
        ShortTvViewModel shortTvViewModel = shortTvVideoItemView.mShortTvViewModel;
        if (shortTvViewModel != null && (c3187b0M80385l0 = shortTvViewModel.m80385l0()) != null) {
            c3187b0M80385l0.m14851j(shortTvDetailListFragment.getViewLifecycleOwner(), c19097b);
        }
        shortTvVideoItemView.setLoading(true);
        ShortTvViewModel shortTvViewModel2 = shortTvVideoItemView.mShortTvViewModel;
        if (shortTvViewModel2 != null) {
            shortTvViewModel2.m80359T(strM104513e, iM104511c);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public final void m80122P0() {
        this.autoHideRightMenuHandle.removeCallbacks(this.autoHideRightMenuRunnable);
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        if (shortTvViewModel != null) {
            shortTvViewModel.m80390q1(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public final void m80123Q(String userId) {
        LiveData liveDataM80343H0;
        Subject subject;
        if (!C27287m.f83003a.m106330e()) {
            C25427b.f76996a.m99961e(Utils.m27275a().getString(R$string.short_tv_no_network_toast));
            return;
        }
        if (userId != null) {
            String str = userId.length() > 0 ? userId : null;
            if (str != null) {
                ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
                if (shortTvViewModel == null || (liveDataM80343H0 = shortTvViewModel.m80343H0()) == null || (subject = (Subject) liveDataM80343H0.m14847f()) == null) {
                    return;
                }
                SkuInfo skuInfo = subject.getSkuInfo();
                if (skuInfo == null) {
                    C26866a.a.m104901l(C26866a.f81698a, this.TAG, "callPayMethod failed, no sku info.", false, 4, null);
                    return;
                }
                String skuId = skuInfo.getSkuId();
                if (skuId != null) {
                    String str2 = skuId.length() > 0 ? skuId : null;
                    if (str2 != null) {
                        String subjectId = subject.getSubjectId();
                        if (subjectId != null) {
                            String str3 = subjectId.length() > 0 ? subjectId : null;
                            if (str3 == null) {
                                return;
                            }
                            C26719e c26719e = this.data;
                            C18862d.f60875a.m79440d(getContext(), new CreatePaynicornOrderReqBean("MovieBox", str2, str, null, null, null, MapsKt.m97551f(TuplesKt.m97108a("subject_id", str3)), false, null, Sdk$SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE, null), new C19098c(subject, c26719e != null ? c26719e.m104511c() : 0, str));
                            return;
                        }
                        return;
                    }
                }
                C26866a.a.m104901l(C26866a.f81698a, this.TAG, "callPayMethod failed, skuId is empty.", false, 4, null);
                return;
            }
        }
        C26866a.a.m104901l(C26866a.f81698a, this.TAG, "callPayMethod failed, userId is empty.", false, 4, null);
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m80124Q0() {
        FragmentActivity activity;
        Window window;
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        if (shortTvDetailListFragment == null || (activity = shortTvDetailListFragment.getActivity()) == null || (window = activity.getWindow()) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            window.clearFlags(1024);
            window.getDecorView().setSystemUiVisibility(256);
        } else {
            WindowInsetsController insetsController = window.getInsetsController();
            if (insetsController != null) {
                insetsController.show(WindowInsets.Type.statusBars());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final void m80125R(ShortTvVideoItemView shortTvVideoItemView) {
        shortTvVideoItemView.m80120O0();
    }

    /* JADX INFO: renamed from: R0 */
    private final void m80126R0() {
        InterfaceC19107a1 interfaceC19107a1;
        m80128S0();
        Integer num = this.watchAdUnlockSeconds;
        if (num == null || num.intValue() <= 0) {
            num = null;
        }
        updateUnlockCountdownText$shortTvLib_release(num);
        if (num == null || (interfaceC19107a1 = this.countdownController) == null) {
            return;
        }
        interfaceC19107a1.mo80078a(num.intValue());
    }

    /* JADX INFO: renamed from: S */
    private final void m80127S(C29007b item) {
        if (this.hasSubDownloading) {
            C25427b.f76996a.m99960d(R$string.short_tv_subtitle_is_downloading);
            return;
        }
        if (!C27287m.f83003a.m106330e()) {
            C25427b.f76996a.m99960d(R$string.short_tv_no_network_toast);
            return;
        }
        InterfaceC18884b.a aVar = InterfaceC18884b.f60919a;
        aVar.m79507b().mo79493b(this);
        item.m111561a().setStatus(2);
        this.hasSubDownloading = true;
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, ShortTvVideoItemView.class.getSimpleName() + " --> downloadSubtitle() --> 内置字幕列表，下载字幕，name = " + item.m111561a().getName() + ", subtype = " + item.m111561a().getType() + ",download subtitleName = " + item.m111561a().getSubtitleName() + ", subResourceId = " + item.m111561a().getResourceId() + "~", false, 4, null);
        item.m111561a().setAutoDownload(false);
        this.subDownloadBean = item;
        aVar.m79507b().mo79497f(item);
    }

    /* JADX INFO: renamed from: S0 */
    private final void m80128S0() {
        InterfaceC19107a1 interfaceC19107a1 = this.countdownController;
        if (interfaceC19107a1 != null) {
            interfaceC19107a1.mo80079b();
        }
        updateUnlockCountdownText$shortTvLib_release(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final void m80129T(ShortTvVideoItemView shortTvVideoItemView, Boolean bool) {
        shortTvVideoItemView.m80130T0();
    }

    /* JADX INFO: renamed from: T0 */
    private final void m80130T0() {
        LiveData liveDataM80343H0;
        Subject subject;
        ShortTVFavInfo shortTVFavInfo;
        LiveData liveDataM80343H1;
        Subject subject2;
        ShortTVFavInfo shortTVFavInfo2;
        String favoriteNum;
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        this.viewBinding.f83262z.setText(AbstractC24225f.m95251a((shortTvViewModel == null || (liveDataM80343H1 = shortTvViewModel.m80343H0()) == null || (subject2 = (Subject) liveDataM80343H1.m14847f()) == null || (shortTVFavInfo2 = subject2.getShortTVFavInfo()) == null || (favoriteNum = shortTVFavInfo2.getFavoriteNum()) == null) ? 0L : Long.parseLong(favoriteNum)));
        AppCompatTextView appCompatTextView = this.viewBinding.f83262z;
        ShortTvViewModel shortTvViewModel2 = this.mShortTvViewModel;
        appCompatTextView.setSelected((shortTvViewModel2 == null || (liveDataM80343H0 = shortTvViewModel2.m80343H0()) == null || (subject = (Subject) liveDataM80343H0.m14847f()) == null || (shortTVFavInfo = subject.getShortTVFavInfo()) == null) ? false : shortTVFavInfo.getHasFavorite());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public final void m80131U(AbstractC26720f result) {
        Integer numValueOf;
        if (result instanceof C26723i) {
            numValueOf = Integer.valueOf(R$string.short_tv_error_load_failed);
        } else if (result instanceof C26722h) {
            numValueOf = Integer.valueOf(R$string.short_tv_favorite_remove_toast);
        } else {
            numValueOf = result instanceof C26721g ? Integer.valueOf(R$string.short_tv_favorite_toast) : null;
        }
        if (numValueOf != null) {
            C25427b.f76996a.m99960d(numValueOf.intValue());
        }
    }

    /* JADX INFO: renamed from: U0 */
    private final void m80132U0(long remainingMs) {
        long jF = RangesKt.m97936f(remainingMs / 1000, 0L);
        long j11 = 60;
        String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jF / j11), Long.valueOf(jF % j11)}, 2));
        Intrinsics.m97801g(str, "format(...)");
        this.viewBinding.f83231H.setText(m80117N(str));
    }

    /* JADX INFO: renamed from: V */
    private final void m80133V() {
        this.isFreePreviewMode = false;
        BLTextView tvWatchFreeCountdown = this.viewBinding.f83231H;
        Intrinsics.m97801g(tvWatchFreeCountdown, "tvWatchFreeCountdown");
        AbstractC23048b.m91691b(tvWatchFreeCountdown);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public final void m80134V0(long progress) {
        int i11 = (int) progress;
        this.viewBinding.f83257u.setProgress(i11);
        this.viewBinding.f83255s.setProgress(i11);
    }

    /* JADX INFO: renamed from: W */
    private final void m80135W() {
        m80128S0();
        m80133V();
        STCommonVideoAdHelper sTCommonVideoAdHelper = this.videoAdHelper;
        if (sTCommonVideoAdHelper != null) {
            STCommonVideoAdHelper.m78937q(sTCommonVideoAdHelper, 0, 1, null);
        }
        this.videoAdHelper = null;
        this.isEpisodeLocked = false;
        View view = this.lockedView;
        if (view != null) {
            AbstractC23048b.m91691b(view);
        }
        Group groupPayLockHide = this.viewBinding.f83245i;
        Intrinsics.m97801g(groupPayLockHide, "groupPayLockHide");
        AbstractC23048b.m91694e(groupPayLockHide);
        m80113L();
    }

    /* JADX INFO: renamed from: W0 */
    private final void m80136W0(long max) {
        int i11 = (int) max;
        this.viewBinding.f83257u.setMax(i11);
        this.viewBinding.f83255s.setMax(i11);
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "updateProgressMax: " + max + "  : " + this, false, 4, null);
    }

    /* JADX INFO: renamed from: X */
    private final void m80137X() {
        if (this.isEpisodeLocked) {
            return;
        }
        this.autoHideRightMenuHandle.removeCallbacks(this.autoHideRightMenuRunnable);
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        if (shortTvViewModel != null) {
            shortTvViewModel.m80390q1(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final void m80138X0(ShortTvVideoItemView shortTvVideoItemView) {
        ShortTvViewModel shortTvViewModel = shortTvVideoItemView.mShortTvViewModel;
        if (shortTvViewModel != null) {
            shortTvViewModel.m80377e1(false);
        }
    }

    /* JADX INFO: renamed from: Y */
    private final void m80139Y() {
        FragmentActivity activity;
        Window window;
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        if (shortTvDetailListFragment == null || (activity = shortTvDetailListFragment.getActivity()) == null || (window = activity.getWindow()) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            window.addFlags(1024);
            window.getDecorView().setSystemUiVisibility(1284);
            return;
        }
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController != null) {
            insetsController.hide(WindowInsets.Type.statusBars());
            insetsController.setSystemBarsBehavior(2);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    private final void m80140Y0(boolean isImmersive) {
        double d11;
        int iM27487c = AbstractC5806y.m27487c();
        if (isImmersive) {
            d11 = 0.27d;
        } else {
            d11 = this.hasAd ? 0.4d : 0.36d;
        }
        int i11 = (int) (((double) iM27487c) * d11);
        FrameLayout flSubtitle = this.viewBinding.f83242f;
        Intrinsics.m97801g(flSubtitle, "flSubtitle");
        ViewGroup.LayoutParams layoutParams = flSubtitle.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
        c2308b.f7972k = -1;
        c2308b.f7974l = 0;
        ((ViewGroup.MarginLayoutParams) c2308b).bottomMargin = i11;
        c2308b.f7992u = -1;
        c2308b.f7994v = 0;
        flSubtitle.setLayoutParams(c2308b);
    }

    /* JADX INFO: renamed from: Z */
    private final void m80141Z(Context context) {
        this.gestureDetector = new GestureDetector(context, new C19100e());
        m80151e0();
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m80142Z0(final Integer w11, final Integer h11) {
        if (w11 == null || h11 == null || w11.intValue() == 0) {
            return;
        }
        if (!this.isOptimizeEnable) {
            FrameLayout flContainer = this.viewBinding.f83241e;
            Intrinsics.m97801g(flContainer, "flContainer");
            ViewGroup.LayoutParams layoutParams = flContainer.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
            ((ViewGroup.MarginLayoutParams) c2308b).width = AbstractC5806y.m27489e();
            ((ViewGroup.MarginLayoutParams) c2308b).height = (h11.intValue() * ((ViewGroup.MarginLayoutParams) c2308b).width) / w11.intValue();
            flContainer.setLayoutParams(c2308b);
            return;
        }
        if (getWidth() <= 0 || getHeight() <= 0) {
            post(new Runnable() { // from class: com.transsion.shorttv.ui.widget.m0
                @Override // java.lang.Runnable
                public final void run() {
                    ShortTvVideoItemView.m80144a1(this.f61518a, w11, h11);
                }
            });
            return;
        }
        int width = getWidth();
        int height = getHeight();
        this.hasAd = false;
        AbstractC5776a0.m27313a(54.0f);
        int iM27313a = AbstractC5776a0.m27313a(14.0f);
        AbstractC5776a0.m27313a(4.0f);
        if (h11.intValue() <= w11.intValue()) {
            FrameLayout flContainer2 = this.viewBinding.f83241e;
            Intrinsics.m97801g(flContainer2, "flContainer");
            ViewGroup.LayoutParams layoutParams2 = flContainer2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b2 = (ConstraintLayout.C2308b) layoutParams2;
            ((ViewGroup.MarginLayoutParams) c2308b2).width = width;
            ((ViewGroup.MarginLayoutParams) c2308b2).height = (h11.intValue() * width) / w11.intValue();
            c2308b2.f7933H = 0.5f;
            flContainer2.setLayoutParams(c2308b2);
            InterfaceC16634g interfaceC16634g = this.orPlayer;
            if (interfaceC16634g != null) {
                interfaceC16634g.setScaleMode(ScaleMode.SCALE_ASPECT_FIT);
            }
            LinearLayout llCtr = this.viewBinding.f83252p;
            Intrinsics.m97801g(llCtr, "llCtr");
            ViewGroup.LayoutParams layoutParams3 = llCtr.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b3 = (ConstraintLayout.C2308b) layoutParams3;
            c2308b3.f7974l = 0;
            c2308b3.f7972k = -1;
            ((ViewGroup.MarginLayoutParams) c2308b3).bottomMargin = iM27313a;
            llCtr.setLayoutParams(c2308b3);
            return;
        }
        int iM27313a2 = AbstractC5776a0.m27313a(50.0f);
        FrameLayout flContainer3 = this.viewBinding.f83241e;
        Intrinsics.m97801g(flContainer3, "flContainer");
        ViewGroup.LayoutParams layoutParams4 = flContainer3.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.C2308b c2308b4 = (ConstraintLayout.C2308b) layoutParams4;
        ((ViewGroup.MarginLayoutParams) c2308b4).width = width;
        ((ViewGroup.MarginLayoutParams) c2308b4).height = height - iM27313a2;
        c2308b4.f7933H = 0.0f;
        flContainer3.setLayoutParams(c2308b4);
        InterfaceC16634g interfaceC16634g2 = this.orPlayer;
        if (interfaceC16634g2 != null) {
            interfaceC16634g2.setScaleMode(ScaleMode.SCALE_ASPECT_FILL);
        }
        LinearLayout llCtr2 = this.viewBinding.f83252p;
        Intrinsics.m97801g(llCtr2, "llCtr");
        ViewGroup.LayoutParams layoutParams5 = llCtr2.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.C2308b c2308b5 = (ConstraintLayout.C2308b) layoutParams5;
        c2308b5.f7974l = 0;
        c2308b5.f7972k = -1;
        ((ViewGroup.MarginLayoutParams) c2308b5).bottomMargin = iM27313a;
        llCtr2.setLayoutParams(c2308b5);
    }

    /* JADX INFO: renamed from: a0 */
    private final void m80143a0() {
        LinearLayout llDownloadGuideBubble = this.viewBinding.f83253q;
        Intrinsics.m97801g(llDownloadGuideBubble, "llDownloadGuideBubble");
        this.downloadGuideBubbleController = new C19110c(llDownloadGuideBubble, new C19101f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final void m80144a1(ShortTvVideoItemView shortTvVideoItemView, Integer num, Integer num2) {
        shortTvVideoItemView.m80142Z0(num, num2);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX INFO: renamed from: b0 */
    private final void m80145b0() {
        List<DubsInfo> dubs;
        LiveData liveDataM80343H0;
        Subject subject;
        FragmentActivity activity;
        C26719e c26719e;
        LiveData liveDataM80343H1;
        Subject subject2;
        List<DubsInfo> dubs2;
        List<DubsInfo> dubs3;
        LiveData liveDataM80368Z;
        C26866a.a aVar = C26866a.f81698a;
        boolean z11 = false;
        C26866a.a.m104898f(aVar, this.TAG, "initLanguage", false, 4, null);
        if (this.isOptimizeEnable) {
            SimpleSubtitleView simpleSubtitleView = this.viewBinding.f83234K;
            simpleSubtitleView.setTextSize(2, 24.0f);
            simpleSubtitleView.setTypeface(Typeface.create("sans-serif-medium", 0));
            simpleSubtitleView.setShadowLayer(4.0f, 0.0f, 2.0f, Color.parseColor("#CC000000"));
            simpleSubtitleView.setGravity(17);
        } else {
            SimpleSubtitleView simpleSubtitleView2 = this.viewBinding.f83234K;
            simpleSubtitleView2.setTextSize(2, 16.0f);
            simpleSubtitleView2.setTypeface(Typeface.DEFAULT);
            simpleSubtitleView2.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        String ops = null;
        DubsInfoData dubsInfoData = (shortTvViewModel == null || (liveDataM80368Z = shortTvViewModel.m80368Z()) == null) ? null : (DubsInfoData) liveDataM80368Z.m14847f();
        boolean z12 = (dubsInfoData == null || (dubs3 = dubsInfoData.getDubs()) == null || dubs3.isEmpty()) ? false : true;
        if (this.isOptimizeEnable) {
            AppCompatTextView tvLanguage = this.viewBinding.f83224A;
            Intrinsics.m97801g(tvLanguage, "tvLanguage");
            AbstractC23048b.m91691b(tvLanguage);
            if (!z12) {
                AppCompatTextView tvAudio = this.viewBinding.f83259w;
                Intrinsics.m97801g(tvAudio, "tvAudio");
                AbstractC23048b.m91691b(tvAudio);
            } else if (((dubsInfoData == null || (dubs2 = dubsInfoData.getDubs()) == null) ? 0 : dubs2.size()) > 1) {
                AppCompatTextView tvAudio2 = this.viewBinding.f83259w;
                Intrinsics.m97801g(tvAudio2, "tvAudio");
                AbstractC23048b.m91694e(tvAudio2);
            } else {
                AppCompatTextView tvAudio3 = this.viewBinding.f83259w;
                Intrinsics.m97801g(tvAudio3, "tvAudio");
                AbstractC23048b.m91691b(tvAudio3);
            }
        } else {
            AppCompatTextView tvLanguage2 = this.viewBinding.f83224A;
            Intrinsics.m97801g(tvLanguage2, "tvLanguage");
            AbstractC23048b.m91694e(tvLanguage2);
            if (z12) {
                C26866a.a.m104898f(aVar, this.TAG, "initLanguage--- hasDubs :" + (dubsInfoData != null ? dubsInfoData.getDubs() : null), false, 4, null);
                this.viewBinding.f83224A.setSelected(true);
                if (dubsInfoData == null || (dubs = dubsInfoData.getDubs()) == null) {
                    return;
                }
                for (DubsInfo dubsInfo : dubs) {
                    String subjectId = dubsInfo.getSubjectId();
                    ShortTvViewModel shortTvViewModel2 = this.mShortTvViewModel;
                    if (Intrinsics.m97797c(subjectId, (shortTvViewModel2 == null || (liveDataM80343H0 = shortTvViewModel2.m80343H0()) == null || (subject = (Subject) liveDataM80343H0.m14847f()) == null) ? null : subject.getSubjectId())) {
                        this.viewBinding.f83224A.setText(dubsInfo.getLanName());
                    }
                }
                return;
            }
        }
        C26719e c26719e2 = this.data;
        if (c26719e2 != null && c26719e2.m104511c() == 0) {
            z11 = true;
        }
        if (z11) {
            C26866a.a.m104898f(aVar, this.TAG, "预告片没有字幕，不处理", false, 4, null);
            return;
        }
        C26866a.a.m104898f(aVar, this.TAG, ">>>>>>>--------------------initLanguage subtitle, position:" + this.position, false, 4, null);
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        if (shortTvDetailListFragment == null || (activity = shortTvDetailListFragment.getActivity()) == null || activity.isDestroyed() || activity.isFinishing() || (c26719e = this.data) == null) {
            return;
        }
        InterfaceC18876a interfaceC18876a = this.subtitleControl;
        if (interfaceC18876a != null) {
            interfaceC18876a.onDestroy();
        }
        InterfaceC18876a.a aVar2 = InterfaceC18876a.f60904a;
        C27349k0 c27349k0 = this.viewBinding;
        ShortTvViewModel shortTvViewModel3 = this.mShortTvViewModel;
        if (shortTvViewModel3 != null && (liveDataM80343H1 = shortTvViewModel3.m80343H0()) != null && (subject2 = (Subject) liveDataM80343H1.m14847f()) != null) {
            ops = subject2.getOps();
        }
        InterfaceC18876a interfaceC18876aM79479a = aVar2.m79479a(activity, c27349k0, shortTvViewModel3, c26719e, ops);
        interfaceC18876aM79479a.mo79474e();
        interfaceC18876aM79479a.mo79470a(new Function1() { // from class: com.transsion.shorttv.ui.widget.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvVideoItemView.m80147c0(this.f61484a, ((Boolean) obj).booleanValue());
            }
        });
        interfaceC18876aM79479a.mo79471b(new Function1() { // from class: com.transsion.shorttv.ui.widget.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvVideoItemView.m80149d0(this.f61491a, (C29007b) obj);
            }
        });
        this.subtitleControl = interfaceC18876aM79479a;
    }

    /* JADX INFO: renamed from: b1 */
    private final void m80146b1(C26719e item) {
        ShortTVItem shortTVItemM104512d;
        Media video;
        String str;
        ShortTvDetailListFragment shortTvDetailListFragment;
        FragmentActivity activity;
        m80134V0(0L);
        if (item != null) {
            int iM104511c = item.m104511c();
            if (iM104511c == 0) {
                this.viewBinding.f83230G.setText(getContext().getString(R$string.short_tv_trailer));
            } else {
                TnTextView tnTextView = this.viewBinding.f83230G;
                StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
                String str2 = String.format("EP%s", Arrays.copyOf(new Object[]{AbstractC19166i.m80248e(Integer.valueOf(iM104511c))}, 1));
                Intrinsics.m97801g(str2, "format(...)");
                tnTextView.setText(str2);
            }
        }
        if (item != null && (shortTVItemM104512d = item.m104512d()) != null && (video = shortTVItemM104512d.getVideo()) != null) {
            FirstFrame firstFrame = video.getFirstFrame();
            if (firstFrame == null || (url = firstFrame.getUrl()) == null) {
                Cover cover = video.getCover();
                if (cover != null) {
                    String url = cover.getUrl();
                    str = url;
                } else {
                    str = null;
                }
            } else {
                str = url;
            }
            if (str != null) {
                C23424b.a aVar = C23424b.f71424a;
                int i11 = this.screenWidth;
                String strM93008d = aVar.m93008d(str, (120 & 2) != 0 ? 0 : i11, (120 & 4) != 0 ? 0 : i11, (120 & 8) != 0, (120 & 16) != 0 ? false : false, (120 & 32) == 0 ? false : false, (120 & 64) != 0 ? 25 : 0);
                if (Intrinsics.m97797c(strM93008d, this.viewBinding.f83247k.getTag()) || (shortTvDetailListFragment = this.fragment) == null || (activity = shortTvDetailListFragment.getActivity()) == null) {
                    return;
                }
                C26866a.a.m104898f(C26866a.f81698a, this.TAG, "into  " + this, false, 4, null);
                this.viewBinding.f83247k.setTag(strM93008d);
                Glide.with(activity).load2(strM93008d).addListener(new C19104i()).into(this.viewBinding.f83247k);
                return;
            }
        }
        this.viewBinding.f83247k.setImageDrawable(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final Unit m80147c0(ShortTvVideoItemView shortTvVideoItemView, boolean z11) {
        List<DubsInfo> dubs;
        LiveData liveDataM80368Z;
        if (shortTvVideoItemView.isOptimizeEnable) {
            AppCompatTextView tvSubtitles = shortTvVideoItemView.viewBinding.f83229F;
            Intrinsics.m97801g(tvSubtitles, "tvSubtitles");
            tvSubtitles.setVisibility(z11 ? 0 : 8);
        } else {
            ShortTvViewModel shortTvViewModel = shortTvVideoItemView.mShortTvViewModel;
            DubsInfoData dubsInfoData = (shortTvViewModel == null || (liveDataM80368Z = shortTvViewModel.m80368Z()) == null) ? null : (DubsInfoData) liveDataM80368Z.m14847f();
            if (dubsInfoData != null && (dubs = dubsInfoData.getDubs()) != null && !dubs.isEmpty()) {
                return Unit.f75682a;
            }
            shortTvVideoItemView.viewBinding.f83224A.setSelected(z11);
            if (!z11) {
                shortTvVideoItemView.viewBinding.f83224A.setText(Utils.m27275a().getString(R$string.short_tv_language));
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final Unit m80148c1(final ShortTvVideoItemView shortTvVideoItemView, FragmentActivity fragmentActivity, final Subject subject, final int i11, final AppCompatTextView appCompatTextView, final C26719e c26719e, boolean z11, String errorCode, String errorMessage) {
        Intrinsics.m97802h(errorCode, "errorCode");
        Intrinsics.m97802h(errorMessage, "errorMessage");
        if (z11) {
            STCommonVideoAdHelper sTCommonVideoAdHelper = shortTvVideoItemView.videoAdHelper;
            if (sTCommonVideoAdHelper != null) {
                sTCommonVideoAdHelper.m78942u(fragmentActivity, new Function0() { // from class: com.transsion.shorttv.ui.widget.j0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ShortTvVideoItemView.m80150d1(this.f61506a, c26719e);
                    }
                }, new Function1() { // from class: com.transsion.shorttv.ui.widget.k0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTvVideoItemView.m80152e1(this.f61509a, subject, i11, c26719e, appCompatTextView, ((Boolean) obj).booleanValue());
                    }
                });
            }
        } else {
            C28654b.f87887a.m110432l(subject, i11, "fail", errorMessage, errorCode, MediaItem.MUSIC_FLOAT_STATE_PLAY);
            C25427b.f76996a.m99960d(R$string.short_tv_ad_unlocked_get_ad_failed);
            shortTvVideoItemView.videoAdHelper = null;
            if (appCompatTextView != null) {
                appCompatTextView.setEnabled(true);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final Unit m80149d0(ShortTvVideoItemView shortTvVideoItemView, C29007b c29007b) {
        SubtitleDownloadTable subtitleDownloadTableM111561a;
        if (!shortTvVideoItemView.isOptimizeEnable) {
            shortTvVideoItemView.viewBinding.f83224A.setText((c29007b == null || (subtitleDownloadTableM111561a = c29007b.m111561a()) == null) ? null : subtitleDownloadTableM111561a.getLanName());
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
    /* JADX INFO: renamed from: d1 */
    public static final Unit m80150d1(ShortTvVideoItemView shortTvVideoItemView, C26719e c26719e) {
        LiveData liveDataM80343H0;
        Subject subject;
        ShortTvViewModel shortTvViewModel;
        ShortTVItem shortTVItemM104512d;
        Object objM112707constructorimpl;
        Integer num;
        int iIntValue;
        Integer numValueOf;
        ShortTvViewModel shortTvViewModel2 = shortTvVideoItemView.mShortTvViewModel;
        if (shortTvViewModel2 == null || (liveDataM80343H0 = shortTvViewModel2.m80343H0()) == null || (subject = (Subject) liveDataM80343H0.m14847f()) == null) {
            return Unit.f75682a;
        }
        if (c26719e != null && (shortTVItemM104512d = c26719e.m104512d()) != null) {
            C29238a c29238a = C29238a.f89219a;
            try {
                Result.Companion companion = Result.INSTANCE;
                JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b("ShortTvPlayerUnlockPlayScene");
                JsonElement jsonElement = jsonObjectM63626b != null ? jsonObjectM63626b.get("unlockEpCount") : null;
                KClass kClassM97823b = Reflection.m97823b(Integer.class);
                if (Intrinsics.m97797c(kClassM97823b, Reflection.m97823b(String.class))) {
                    if (jsonElement != null) {
                        jsonElement.getAsString();
                    }
                } else if (Intrinsics.m97797c(kClassM97823b, Reflection.m97823b(Integer.TYPE))) {
                    numValueOf = jsonElement != null ? Integer.valueOf(jsonElement.getAsInt()) : null;
                    if (!(numValueOf instanceof Integer)) {
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl(numValueOf);
                    num = (Integer) (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) == null ? objM112707constructorimpl : null);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 1;
                    }
                    C23219b.f70761a.m92284g(subject, shortTVItemM104512d, iIntValue);
                } else if (Intrinsics.m97797c(kClassM97823b, Reflection.m97823b(Long.TYPE))) {
                    if (jsonElement != null) {
                        jsonElement.getAsLong();
                    }
                } else if (Intrinsics.m97797c(kClassM97823b, Reflection.m97823b(Boolean.TYPE)) && jsonElement != null) {
                    jsonElement.getAsBoolean();
                }
                numValueOf = null;
                objM112707constructorimpl = Result.m112707constructorimpl(numValueOf);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            num = (Integer) (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) == null ? objM112707constructorimpl : null);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 1;
            }
            C23219b.f70761a.m92284g(subject, shortTVItemM104512d, iIntValue);
        }
        String subjectId = subject.getSubjectId();
        if (subjectId != null && (shortTvViewModel = shortTvVideoItemView.mShortTvViewModel) != null) {
            shortTvViewModel.m80371a1(subjectId);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: e0 */
    private final void m80151e0() {
        new C18788e(getContext(), this.viewBinding.f83233J).m79198r(new C19102g());
        this.viewBinding.f83257u.setOnTouchListener(new View.OnTouchListener() { // from class: com.transsion.shorttv.ui.widget.n0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ShortTvVideoItemView.m80153f0(view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final Unit m80152e1(ShortTvVideoItemView shortTvVideoItemView, Subject subject, int i11, C26719e c26719e, AppCompatTextView appCompatTextView, boolean z11) {
        shortTvVideoItemView.videoAdHelper = null;
        if (z11) {
            C28654b.f87887a.m110432l(subject, i11, NativeComponentConstants.KEY_COMPONENT_RESULT_SUCCESS, "", "0", MediaItem.MUSIC_FLOAT_STATE_PLAY);
            shortTvVideoItemView.updateShortTvInfo(shortTvVideoItemView.orPlayer, shortTvVideoItemView.orPlayerView, c26719e);
            if (c26719e != null) {
                shortTvVideoItemView.m80170o0(c26719e);
            }
            C25427b.f76996a.m99960d(R$string.short_tv_locked_episode_unlocked);
        } else {
            C28654b.f87887a.m110432l(subject, i11, "cancel", "", "0", MediaItem.MUSIC_FLOAT_STATE_PLAY);
        }
        if (appCompatTextView != null) {
            appCompatTextView.setEnabled(true);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final boolean m80153f0(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX INFO: renamed from: g0 */
    private final void m80154g0() {
        C26719e c26719e;
        ShortTVItem shortTVItemM104512d;
        Media video;
        C3187b0 c3187b0M80370a0;
        List list;
        Object next;
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        List<Video> addressList = null;
        if (shortTvViewModel == null || (c3187b0M80370a0 = shortTvViewModel.m80370a0()) == null || (list = (List) c3187b0M80370a0.m14847f()) == null) {
            c26719e = this.data;
            if (c26719e != null) {
                shortTVItemM104512d = c26719e.m104512d();
            } else {
                shortTVItemM104512d = null;
            }
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ShortTVItem shortTVItem = (ShortTVItem) next;
                C26719e c26719e2 = this.data;
                if (c26719e2 != null && shortTVItem.getEp() == c26719e2.m104511c()) {
                    break;
                }
            }
            shortTVItemM104512d = (ShortTVItem) next;
            if (shortTVItemM104512d == null) {
                c26719e = this.data;
                if (c26719e != null) {
                    shortTVItemM104512d = c26719e.m104512d();
                } else {
                    shortTVItemM104512d = null;
                }
            }
        }
        if (shortTVItemM104512d != null && (video = shortTVItemM104512d.getVideo()) != null) {
            addressList = video.getAddressList();
        }
        AppCompatTextView tvResolution = this.viewBinding.f83227D;
        Intrinsics.m97801g(tvResolution, "tvResolution");
        AbstractC23048b.m91694e(tvResolution);
        List<Video> list2 = addressList;
        if (list2 == null || list2.isEmpty()) {
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "initResolution, 分辨率列表为空", false, 4, null);
            CharSequence text = this.viewBinding.f83227D.getText();
            if (text == null || text.length() == 0) {
                int i11 = C19165h.f61575a.m80241d().getInt("k_short_tv_resolution", 0);
                if (i11 <= 0) {
                    i11 = 720;
                }
                this.viewBinding.f83227D.setText(i11 + "P");
                return;
            }
            return;
        }
        if (addressList.size() == 1) {
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "initResolution, size 1", false, 4, null);
            this.viewBinding.f83227D.setText(((Video) CollectionsKt.m97359i0(addressList)).getResolution() + "P");
            return;
        }
        int i12 = C19165h.f61575a.m80241d().getInt("k_short_tv_resolution", 0);
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, this.TAG, "initResolution, --save resolution:" + i12, false, 4, null);
        Video videoM80247d = AbstractC19166i.m80247d(addressList, i12);
        if (videoM80247d != null) {
            C26866a.a.m104898f(aVar, this.TAG, "initResolution, --target resolution:" + i12, false, 4, null);
            this.viewBinding.f83227D.setText(videoM80247d.getResolution() + "P");
        }
    }

    /* JADX INFO: renamed from: h0 */
    private final void m80156h0() {
        float f11 = C19165h.f61575a.m80241d().getFloat("k_short_tv_speed", 1.0f);
        int i11 = (int) f11;
        String strValueOf = ((float) i11) == f11 ? String.valueOf(i11) : String.valueOf(f11);
        this.viewBinding.f83228E.setText(strValueOf + "x");
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.setSpeed(f11);
        }
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "initVideoSpeed, speed:" + f11, false, 4, null);
    }

    /* JADX INFO: renamed from: i0 */
    private final boolean m80158i0() {
        return !m80160j0();
    }

    /* JADX INFO: renamed from: j0 */
    private final boolean m80160j0() {
        LiveData liveDataM80343H0;
        C23219b c23219b = C23219b.f70761a;
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        Subject subject = (shortTvViewModel == null || (liveDataM80343H0 = shortTvViewModel.m80343H0()) == null) ? null : (Subject) liveDataM80343H0.m14847f();
        C26719e c26719e = this.data;
        return c23219b.m92280c(subject, c26719e != null ? c26719e.m104512d() : null);
    }

    /* JADX INFO: renamed from: k0 */
    private final void m80162k0(C26719e item) {
        final ShortTvPlayerOverlayAdContainer adOverlayContainerView = this.viewBinding.f83238b;
        Intrinsics.m97801g(adOverlayContainerView, "adOverlayContainerView");
        adOverlayContainerView.setVisibility(8);
        if (m80160j0()) {
            C29238a.m112116e(C29238a.f89219a, "overlay", "loadAd, this video is locked, don't load", null, 4, null);
            return;
        }
        final C18740a c18740aM78950c = ShortTvPlayerOverlayAdManager.f60541a.m78950c(item.m104509a());
        if (c18740aM78950c == null) {
            return;
        }
        if (!c18740aM78950c.m78956d()) {
            C29238a.m112115c(C29238a.f89219a, "overlay", "loadAd, this video no need to load, key=" + item.m104509a(), null, 4, null);
            return;
        }
        c18740aM78950c.m78961i(true);
        C29238a c29238a = C29238a.f89219a;
        C29238a.m112117g(c29238a, "overlay", "loadAd, adLoadState=" + c18740aM78950c.m78955c(), null, 4, null);
        switch (C19096a.f61461b[c18740aM78950c.m78955c().ordinal()]) {
            case 1:
                c18740aM78950c.m78959g(AdLoadState.LOADING);
                C18744e c18744eM78954b = c18740aM78950c.m78954b();
                if (c18744eM78954b != null) {
                    c18744eM78954b.m78974i(new Function1() { // from class: com.transsion.shorttv.ui.widget.x
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ShortTvVideoItemView.m80164l0(c18740aM78950c, this, adOverlayContainerView, ((Boolean) obj).booleanValue());
                        }
                    });
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                if (m80160j0()) {
                    C29238a.m112116e(c29238a, "overlay", "show cached ad, video is locked, skip show", null, 4, null);
                    return;
                }
                C18744e c18744eM78954b2 = c18740aM78950c.m78954b();
                if (c18744eM78954b2 != null) {
                    c18744eM78954b2.m78976k(adOverlayContainerView, new Function0() { // from class: com.transsion.shorttv.ui.widget.i0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ShortTvVideoItemView.m80168n0(c18740aM78950c);
                        }
                    });
                    return;
                }
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final Unit m80164l0(final C18740a c18740a, ShortTvVideoItemView shortTvVideoItemView, ShortTvPlayerOverlayAdContainer shortTvPlayerOverlayAdContainer, boolean z11) {
        if (z11) {
            c18740a.m78959g(AdLoadState.SUCCEED);
            if (shortTvVideoItemView.m80160j0()) {
                C29238a.m112116e(C29238a.f89219a, "overlay", "loadAd callback, video is now locked, skip show", null, 4, null);
                return Unit.f75682a;
            }
            C18744e c18744eM78954b = c18740a.m78954b();
            if (c18744eM78954b != null) {
                c18744eM78954b.m78976k(shortTvPlayerOverlayAdContainer, new Function0() { // from class: com.transsion.shorttv.ui.widget.f0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ShortTvVideoItemView.m80166m0(c18740a);
                    }
                });
            }
        } else {
            c18740a.m78953a();
            c18740a.m78959g(AdLoadState.FAILED);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final Unit m80166m0(C18740a c18740a) {
        c18740a.m78953a();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final Unit m80168n0(C18740a c18740a) {
        c18740a.m78953a();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: o0 */
    private final void m80170o0(C26719e item) {
        m80162k0(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final void m80172p0(ShortTvVideoItemView shortTvVideoItemView, boolean z11) {
        ShortTvViewModel shortTvViewModel;
        LiveData liveDataM80343H0;
        Subject subject;
        List<Integer> unlockType;
        if (shortTvVideoItemView.isOptimizeEnable) {
            shortTvVideoItemView.m80140Y0(!z11);
        }
        if (!z11) {
            AbstractC23048b.m91691b(shortTvVideoItemView.groupContent);
            Group groupPayLockHide = shortTvVideoItemView.viewBinding.f83245i;
            Intrinsics.m97801g(groupPayLockHide, "groupPayLockHide");
            AbstractC23048b.m91691b(groupPayLockHide);
            LinearLayout llCtr = shortTvVideoItemView.viewBinding.f83252p;
            Intrinsics.m97801g(llCtr, "llCtr");
            AbstractC23048b.m91691b(llCtr);
            C19110c c19110c = shortTvVideoItemView.downloadGuideBubbleController;
            if (c19110c != null) {
                c19110c.m80214f();
            }
            if (shortTvVideoItemView.isOptimizeEnable) {
                ProgressBar progressBar = shortTvVideoItemView.viewBinding.f83255s;
                Intrinsics.m97801g(progressBar, "progressBar");
                AbstractC23048b.m91691b(progressBar);
            }
            shortTvVideoItemView.m80139Y();
            return;
        }
        AbstractC23048b.m91694e(shortTvVideoItemView.groupContent);
        Group groupPayLockHide2 = shortTvVideoItemView.viewBinding.f83245i;
        Intrinsics.m97801g(groupPayLockHide2, "groupPayLockHide");
        AbstractC23048b.m91694e(groupPayLockHide2);
        LinearLayout llCtr2 = shortTvVideoItemView.viewBinding.f83252p;
        Intrinsics.m97801g(llCtr2, "llCtr");
        AbstractC23048b.m91694e(llCtr2);
        if (shortTvVideoItemView.isEpisodeLocked && (shortTvViewModel = shortTvVideoItemView.mShortTvViewModel) != null && (liveDataM80343H0 = shortTvViewModel.m80343H0()) != null && (subject = (Subject) liveDataM80343H0.m14847f()) != null && (unlockType = subject.getUnlockType()) != null && unlockType.contains(1)) {
            Group groupPayLockHide3 = shortTvVideoItemView.viewBinding.f83245i;
            Intrinsics.m97801g(groupPayLockHide3, "groupPayLockHide");
            AbstractC23048b.m91691b(groupPayLockHide3);
        }
        if (shortTvVideoItemView.isOptimizeEnable) {
            ProgressBar progressBar2 = shortTvVideoItemView.viewBinding.f83255s;
            Intrinsics.m97801g(progressBar2, "progressBar");
            AbstractC23048b.m91694e(progressBar2);
        }
        shortTvVideoItemView.m80124Q0();
    }

    /* JADX INFO: renamed from: q0 */
    private final void m80174q0() {
        List<DubsInfo> dubs;
        LiveData liveDataM80368Z;
        if (!C27287m.f83003a.m106330e()) {
            C25427b.f76996a.m99961e(Utils.m27275a().getString(R$string.short_tv_no_network_toast));
            return;
        }
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        DubsInfoData dubsInfoData = (shortTvViewModel == null || (liveDataM80368Z = shortTvViewModel.m80368Z()) == null) ? null : (DubsInfoData) liveDataM80368Z.m14847f();
        if (dubsInfoData == null || (dubs = dubsInfoData.getDubs()) == null || dubs.isEmpty()) {
            C25427b.f76996a.m99961e(Utils.m27275a().getString(R$string.short_tv_no_error_content));
            return;
        }
        ShortTvLanguageSelectDialog shortTvLanguageSelectDialog = new ShortTvLanguageSelectDialog();
        shortTvLanguageSelectDialog.m79730D0(1);
        shortTvLanguageSelectDialog.m79729C0(new Function1() { // from class: com.transsion.shorttv.ui.widget.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvVideoItemView.m80176r0(this.f61502a, (DubsInfo) obj);
            }
        });
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        if (shortTvDetailListFragment != null) {
            shortTvLanguageSelectDialog.m79035j0(shortTvDetailListFragment, "ShortTvLanguageSelectDialog_Audio");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final Unit m80176r0(ShortTvVideoItemView shortTvVideoItemView, DubsInfo item) {
        Intrinsics.m97802h(item, "item");
        shortTvVideoItemView.m80178s0(item);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: s0 */
    private final void m80178s0(DubsInfo info) {
        C3187b0 c3187b0M80365X;
        ShortTvViewModel shortTvViewModel;
        ShortTVItem shortTVItem;
        Video video;
        String url;
        ShortTVItem shortTVItemM104512d;
        Map mapMo102959a;
        ShortTVItem shortTVItemM104512d2;
        C3187b0 c3187b0M80365X2;
        ConcurrentHashMap concurrentHashMapM80395u0;
        C3187b0 c3187b0;
        List list;
        Object next;
        ShortTVItem shortTVItem2;
        C26719e c26719e;
        ConcurrentHashMap concurrentHashMapM80395u1;
        LiveData liveDataM80343H0;
        Subject subject;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, this.TAG, "onAudioTrackSelect, lanName:" + info.getLanName() + ", subjectId:" + info.getSubjectId(), false, 4, null);
        ShortTvViewModel shortTvViewModel2 = this.mShortTvViewModel;
        String subjectId = (shortTvViewModel2 == null || (liveDataM80343H0 = shortTvViewModel2.m80343H0()) == null || (subject = (Subject) liveDataM80343H0.m14847f()) == null) ? null : subject.getSubjectId();
        if (subjectId != null && info.getSubjectId() != null) {
            C19165h.f61575a.m80241d().putString("k_audio_subject_" + subjectId, info.getSubjectId());
        }
        ShortTvViewModel shortTvViewModel3 = this.mShortTvViewModel;
        if (shortTvViewModel3 != null) {
            shortTvViewModel3.m80379f1(info.getSubjectId());
        }
        ShortTvViewModel shortTvViewModel4 = this.mShortTvViewModel;
        if ((shortTvViewModel4 == null || (concurrentHashMapM80395u1 = shortTvViewModel4.m80395u0()) == null) ? false : concurrentHashMapM80395u1.containsKey(info.getSubjectId())) {
            ShortTvViewModel shortTvViewModel5 = this.mShortTvViewModel;
            if (shortTvViewModel5 == null || (concurrentHashMapM80395u0 = shortTvViewModel5.m80395u0()) == null || (c3187b0 = (C3187b0) concurrentHashMapM80395u0.get(info.getSubjectId())) == null || (list = (List) c3187b0.m14847f()) == null) {
                shortTVItem = null;
            } else {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        shortTVItem2 = (ShortTVItem) next;
                        c26719e = this.data;
                    }
                } while (!(c26719e != null && shortTVItem2.getEp() == c26719e.m104511c()));
                shortTVItem = (ShortTVItem) next;
            }
            if (shortTVItem == null) {
                C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onAudioTrackSelect, 有该作品信息，没有该集信息，需要请求", false, 4, null);
                String subjectId2 = info.getSubjectId();
                if (subjectId2 != null) {
                    ShortTvViewModel shortTvViewModel6 = this.mShortTvViewModel;
                    if (shortTvViewModel6 != null && (c3187b0M80365X2 = shortTvViewModel6.m80365X()) != null) {
                        c3187b0M80365X2.mo14858q(Boolean.TRUE);
                    }
                    ShortTvViewModel shortTvViewModel7 = this.mShortTvViewModel;
                    if (shortTvViewModel7 != null) {
                        C26719e c26719e2 = this.data;
                        shortTvViewModel7.m80396v0(subjectId2, null, c26719e2 != null ? c26719e2.m104511c() : 1, false);
                    }
                    ShortTvViewModel shortTvViewModel8 = this.mShortTvViewModel;
                    if (shortTvViewModel8 != null) {
                        C26719e c26719e3 = this.data;
                        shortTvViewModel8.m80397w0(subjectId2, c26719e3 != null ? c26719e3.m104511c() : 1);
                    }
                }
            } else {
                C26866a.a aVar2 = C26866a.f81698a;
                C26866a.a.m104898f(aVar2, this.TAG, "onAudioTrackSelect, 有该作品信息，直接播放", false, 4, null);
                Media video2 = shortTVItem.getVideo();
                if (video2 != null && (video = video2.getVideo()) != null && (url = video.getUrl()) != null) {
                    C26719e c26719e4 = this.data;
                    C23403e c23403e = new C23403e(url, url, (c26719e4 == null || (shortTVItemM104512d2 = c26719e4.m104512d()) == null) ? 0 : shortTVItemM104512d2.getEp(), null, null, 24, null);
                    InterfaceC16634g interfaceC16634g = this.orPlayer;
                    InterfaceC26373f interfaceC26373f = interfaceC16634g instanceof InterfaceC26373f ? (InterfaceC26373f) interfaceC16634g : null;
                    boolean zContainsKey = (interfaceC26373f == null || (mapMo102959a = interfaceC26373f.mo102959a()) == null) ? false : mapMo102959a.containsKey(c23403e.m92929e());
                    String str = this.TAG;
                    C26719e c26719e5 = this.data;
                    C26866a.a.m104898f(aVar2, str, "onAudioTrackSelect, url:" + url + ",EP:" + ((c26719e5 == null || (shortTVItemM104512d = c26719e5.m104512d()) == null) ? null : Integer.valueOf(shortTVItemM104512d.getEp())) + ",inList:" + zContainsKey, false, 4, null);
                    if (!zContainsKey) {
                        InterfaceC16634g interfaceC16634g2 = this.orPlayer;
                        if (interfaceC16634g2 != null) {
                            interfaceC16634g2.addDataSource(c23403e);
                        }
                        InterfaceC16634g interfaceC16634g3 = this.orPlayer;
                        if (interfaceC16634g3 != null) {
                            interfaceC16634g3.prepare();
                        }
                    }
                    ShortTvViewModel shortTvViewModel9 = this.mShortTvViewModel;
                    if (shortTvViewModel9 != null) {
                        shortTvViewModel9.m80377e1(true);
                    }
                    InterfaceC16634g interfaceC16634g4 = this.orPlayer;
                    if (interfaceC16634g4 != null) {
                        String strM92929e = c23403e.m92929e();
                        if (strM92929e == null) {
                            strM92929e = "";
                        }
                        interfaceC16634g4.seekTo(strM92929e, 0L);
                    }
                    post(new Runnable() { // from class: com.transsion.shorttv.ui.widget.p0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ShortTvVideoItemView.m80180t0(this.f61527a);
                        }
                    });
                }
                onAudioTrackChange();
            }
        } else {
            C26866a.a.m104898f(aVar, this.TAG, "onAudioTrackSelect, 没有该作品信息，需要重新请求", false, 4, null);
            String subjectId3 = info.getSubjectId();
            if (subjectId3 != null) {
                ShortTvViewModel shortTvViewModel10 = this.mShortTvViewModel;
                if (shortTvViewModel10 != null && (c3187b0M80365X = shortTvViewModel10.m80365X()) != null) {
                    c3187b0M80365X.mo14858q(Boolean.TRUE);
                }
                ShortTvViewModel shortTvViewModel11 = this.mShortTvViewModel;
                if (shortTvViewModel11 != null) {
                    C26719e c26719e6 = this.data;
                    shortTvViewModel11.m80396v0(subjectId3, null, c26719e6 != null ? c26719e6.m104511c() : 1, false);
                }
                ShortTvViewModel shortTvViewModel12 = this.mShortTvViewModel;
                if (shortTvViewModel12 != null) {
                    C26719e c26719e7 = this.data;
                    shortTvViewModel12.m80397w0(subjectId3, c26719e7 != null ? c26719e7.m104511c() : 1);
                }
            }
        }
        String subjectId4 = info.getSubjectId();
        if (subjectId4 == null || (shortTvViewModel = this.mShortTvViewModel) == null) {
            return;
        }
        C26719e c26719e8 = this.data;
        int iM104511c = c26719e8 != null ? c26719e8.m104511c() : 0;
        InterfaceC16634g interfaceC16634g5 = this.orPlayer;
        shortTvViewModel.m80361U0(subjectId4, iM104511c, interfaceC16634g5 instanceof InterfaceC26373f ? (InterfaceC26373f) interfaceC16634g5 : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLoading(boolean show) {
        this.isLoading = show;
        if (show) {
            ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
            Intrinsics.m97800f(shortTvDetailListFragment, "null cannot be cast to non-null type com.transsion.shorttv.ui.fragment.ShortTvDetailListFragment");
            shortTvDetailListFragment.startLoading();
        } else {
            ShortTvDetailListFragment shortTvDetailListFragment2 = this.fragment;
            Intrinsics.m97800f(shortTvDetailListFragment2, "null cannot be cast to non-null type com.transsion.shorttv.ui.fragment.ShortTvDetailListFragment");
            shortTvDetailListFragment2.hideLoading();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final void m80180t0(ShortTvVideoItemView shortTvVideoItemView) {
        ShortTvViewModel shortTvViewModel = shortTvVideoItemView.mShortTvViewModel;
        if (shortTvViewModel != null) {
            shortTvViewModel.m80377e1(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m80182u0(ShortTvVideoItemView shortTvVideoItemView, SubtitleDownloadTable subtitleDownloadTable) {
        SubtitleDownloadTable subtitleDownloadTableM111561a;
        C29007b c29007b = shortTvVideoItemView.subDownloadBean;
        if (c29007b != null) {
            if (Intrinsics.m97797c((c29007b == null || (subtitleDownloadTableM111561a = c29007b.m111561a()) == null) ? null : subtitleDownloadTableM111561a.getLan(), subtitleDownloadTable.getLan())) {
                C26866a.a.m104898f(C26866a.f81698a, shortTvVideoItemView.TAG, "内置字幕点击下载成功，name = " + subtitleDownloadTable.getName() + ", videoResourceId = " + subtitleDownloadTable.getResourceId() + ", download subtitleName = " + subtitleDownloadTable.getName() + ", lan = " + subtitleDownloadTable.getLan() + "， status:" + subtitleDownloadTable.getStatus() + "~", false, 4, null);
                C29007b c29007b2 = shortTvVideoItemView.subDownloadBean;
                Intrinsics.m97799e(c29007b2);
                shortTvVideoItemView.m80104G0(c29007b2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public final void m80184v0() {
        if (this.isEpisodeLocked) {
            return;
        }
        if (this.isLoading) {
            AppCompatImageView ivDownload = this.viewBinding.f83248l;
            Intrinsics.m97801g(ivDownload, "ivDownload");
            if (ivDownload.getVisibility() == 0) {
                m80137X();
                return;
            } else {
                m80122P0();
                return;
            }
        }
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g == null || !interfaceC16634g.isPlaying()) {
            AppCompatImageView ivDownload2 = this.viewBinding.f83248l;
            Intrinsics.m97801g(ivDownload2, "ivDownload");
            if (ivDownload2.getVisibility() != 0) {
                m80122P0();
            }
            C28655c c28655c = this.dotLayer;
            if (c28655c != null) {
                c28655c.m110438c();
            }
            m80106H0();
            this.isClickPause = false;
            ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
            if (shortTvDetailListFragment != null) {
                shortTvDetailListFragment.m79903m1(false);
                return;
            }
            return;
        }
        AppCompatImageView ivDownload3 = this.viewBinding.f83248l;
        Intrinsics.m97801g(ivDownload3, "ivDownload");
        if (ivDownload3.getVisibility() != 0) {
            m80122P0();
            m80113L();
            return;
        }
        this.isClickPause = true;
        ShortTvDetailListFragment shortTvDetailListFragment2 = this.fragment;
        if (shortTvDetailListFragment2 != null) {
            shortTvDetailListFragment2.m79903m1(true);
        }
        C28655c c28655c2 = this.dotLayer;
        if (c28655c2 != null) {
            c28655c2.m110437b();
        }
        InterfaceC16634g interfaceC16634g2 = this.orPlayer;
        if (interfaceC16634g2 != null) {
            interfaceC16634g2.pause();
        }
        m80122P0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m80186w0(ShortTvVideoItemView shortTvVideoItemView, SubtitleDownloadTable subtitleDownloadTable) {
        C29007b c29007b = shortTvVideoItemView.subDownloadBean;
        if (c29007b != null) {
            c29007b.m111565e(subtitleDownloadTable);
        }
        C26866a.a.m104898f(C26866a.f81698a, shortTvVideoItemView.TAG, ShortTvVideoItemView.class.getSimpleName() + " --> onFail() --> 内置字幕点击下载失败TnT，name = " + subtitleDownloadTable.getName() + ", videoResourceId = " + subtitleDownloadTable.getResourceId() + ", download subtitleName = " + subtitleDownloadTable.getName() + ", lan = " + subtitleDownloadTable.getLan() + "， status:" + subtitleDownloadTable.getStatus() + "~", false, 4, null);
    }

    public static /* synthetic */ void watchAdToUnlock$shortTvLib_release$default(ShortTvVideoItemView shortTvVideoItemView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        shortTvVideoItemView.watchAdToUnlock$shortTvLib_release(z11);
    }

    /* JADX INFO: renamed from: x0 */
    private final void m80188x0() {
        List<DubsInfo> dubs;
        List list;
        C3187b0 c3187b0M23390d;
        LiveData liveDataM80368Z;
        if (!C27287m.f83003a.m106330e()) {
            C25427b.f76996a.m99961e(Utils.m27275a().getString(R$string.short_tv_no_network_toast));
            return;
        }
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        List list2 = null;
        DubsInfoData dubsInfoData = (shortTvViewModel == null || (liveDataM80368Z = shortTvViewModel.m80368Z()) == null) ? null : (DubsInfoData) liveDataM80368Z.m14847f();
        C4880a c4880a = this.mShortTvSubViewModel;
        if (c4880a != null && (c3187b0M23390d = c4880a.m23390d()) != null) {
            list2 = (List) c3187b0M23390d.m14847f();
        }
        if (dubsInfoData == null || (((dubs = dubsInfoData.getDubs()) == null || dubs.isEmpty()) && ((list = list2) == null || list.isEmpty()))) {
            C25427b.f76996a.m99961e(Utils.m27275a().getString(R$string.short_tv_no_error_content));
            return;
        }
        ShortTvLanguageSelectDialog shortTvLanguageSelectDialog = new ShortTvLanguageSelectDialog();
        shortTvLanguageSelectDialog.m79729C0(new Function1() { // from class: com.transsion.shorttv.ui.widget.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvVideoItemView.m80190y0(this.f61500a, (DubsInfo) obj);
            }
        });
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        if (shortTvDetailListFragment != null) {
            shortTvLanguageSelectDialog.m79035j0(shortTvDetailListFragment, "ShortTvLanguageSelectDialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final Unit m80190y0(ShortTvVideoItemView shortTvVideoItemView, DubsInfo item) {
        Intrinsics.m97802h(item, "item");
        if (item.getIsSubtitle()) {
            C29007b subInfo = item.getSubInfo();
            if (subInfo != null) {
                shortTvVideoItemView.viewBinding.f83224A.setText(subInfo.m111561a().getLanName());
                shortTvVideoItemView.m80104G0(subInfo);
            }
        } else {
            shortTvVideoItemView.viewBinding.f83224A.setText(item.getLanName());
            shortTvVideoItemView.m80178s0(item);
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX INFO: renamed from: z0 */
    private final void m80192z0() {
        C26719e c26719e;
        final ShortTVItem shortTVItemM104512d;
        Media video;
        List<Video> addressList;
        Integer numV;
        Float fT;
        C3187b0 c3187b0M80370a0;
        List list;
        Object next;
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        if (shortTvViewModel == null || (c3187b0M80370a0 = shortTvViewModel.m80370a0()) == null || (list = (List) c3187b0M80370a0.m14847f()) == null) {
            c26719e = this.data;
            if (c26719e != null) {
                shortTVItemM104512d = c26719e.m104512d();
            } else {
                shortTVItemM104512d = null;
            }
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ShortTVItem shortTVItem = (ShortTVItem) next;
                C26719e c26719e2 = this.data;
                if (c26719e2 != null && shortTVItem.getEp() == c26719e2.m104511c()) {
                    break;
                }
            }
            shortTVItemM104512d = (ShortTVItem) next;
            if (shortTVItemM104512d == null) {
                c26719e = this.data;
                if (c26719e != null) {
                    shortTVItemM104512d = c26719e.m104512d();
                } else {
                    shortTVItemM104512d = null;
                }
            }
        }
        if (shortTVItemM104512d == null || (video = shortTVItemM104512d.getVideo()) == null || (addressList = video.getAddressList()) == null) {
            return;
        }
        int i11 = C19165h.f61575a.m80241d().getInt("k_short_tv_resolution", 0);
        Video videoM80247d = AbstractC19166i.m80247d(addressList, i11);
        ArrayList arrayList = new ArrayList();
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i11;
        for (Video video2 : addressList) {
            String resolution = video2.getResolution();
            float fFloatValue = (resolution == null || (fT = StringsKt.m98214t(resolution)) == null) ? 0.0f : fT.floatValue();
            ShortTvVideoCtrBean shortTvVideoCtrBean = new ShortTvVideoCtrBean(fFloatValue, video2.getResolution() + "P");
            if (Intrinsics.m97797c(video2.getResolution(), videoM80247d != null ? videoM80247d.getResolution() : null)) {
                String resolution2 = video2.getResolution();
                intRef.element = (resolution2 == null || (numV = StringsKt.m98216v(resolution2)) == null) ? 0 : numV.intValue();
            }
            shortTvVideoCtrBean.setSelect(Intrinsics.m97797c(video2.getResolution(), videoM80247d != null ? videoM80247d.getResolution() : null));
            arrayList.add(shortTvVideoCtrBean);
        }
        m80122P0();
        AppCompatTextView tvResolution = this.viewBinding.f83227D;
        Intrinsics.m97801g(tvResolution, "tvResolution");
        AbstractC19169l.m80253c(tvResolution, arrayList, new Function1() { // from class: com.transsion.shorttv.ui.widget.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvVideoItemView.m80092A0(this.f61523a, intRef, shortTVItemM104512d, (ShortTvVideoCtrBean) obj);
            }
        });
    }

    public void app2Background() {
        C28655c c28655c = this.dotLayer;
        if (c28655c != null) {
            c28655c.m110440e(m80158i0(), true);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d c26907d) {
        InterfaceC16633f.a.m72423a(this, z11, i11, i12, c26907d);
    }

    public final InterfaceC19107a1 getCountdownController() {
        return this.countdownController;
    }

    public FrameLayout getPlayerContainer() {
        FrameLayout flContainer = this.viewBinding.f83241e;
        Intrinsics.m97801g(flContainer, "flContainer");
        return flContainer;
    }

    @Override // com.transsion.shorttv.p315ui.widget.InterfaceC19112d
    public long getProgress() {
        return this.viewBinding.f83257u.getProgress();
    }

    public ShortTvViewModel getViewModel(FragmentActivity activity) {
        Intrinsics.m97802h(activity, "activity");
        return (ShortTvViewModel) new C3227v0(activity).m14969a(ShortTvViewModel.class);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void initPlayer() {
        InterfaceC16633f.a.m72424b(this);
    }

    /* JADX INFO: renamed from: isFirstPlayInSession, reason: from getter */
    public final boolean getIsFirstPlayInSession() {
        return this.isFirstPlayInSession;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onAliyunDecodeErrorChangeSoftwareDecoder(C23403e c23403e) {
        InterfaceC16633f.a.m72425c(this, c23403e);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        InterfaceC3224u viewLifecycleOwner;
        LiveData liveDataM80376e0;
        LiveData liveDataM80376e1;
        LiveData liveDataM80374d0;
        super.onAttachedToWindow();
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        if (shortTvDetailListFragment == null || (viewLifecycleOwner = shortTvDetailListFragment.getViewLifecycleOwner()) == null) {
            return;
        }
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        if (shortTvViewModel != null && (liveDataM80374d0 = shortTvViewModel.m80374d0()) != null) {
            liveDataM80374d0.m14851j(viewLifecycleOwner, this.favoriteObserver);
        }
        C19099d c19099d = this.favoriteResultObserver;
        ShortTvViewModel shortTvViewModel2 = this.mShortTvViewModel;
        c19099d.m80197b((shortTvViewModel2 == null || (liveDataM80376e1 = shortTvViewModel2.m80376e0()) == null) ? null : (AbstractC26720f) liveDataM80376e1.m14847f());
        ShortTvViewModel shortTvViewModel3 = this.mShortTvViewModel;
        if (shortTvViewModel3 == null || (liveDataM80376e0 = shortTvViewModel3.m80376e0()) == null) {
            return;
        }
        liveDataM80376e0.m14851j(viewLifecycleOwner, this.favoriteResultObserver);
    }

    @Override // com.transsion.shorttv.p315ui.widget.InterfaceC19112d
    public void onAudioTrackChange() {
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onAudioTrackChange initResolution", false, 4, null);
        m80154g0();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onBufferedPosition(long j11, C23403e c23403e) {
        InterfaceC16633f.a.m72426d(this, j11, c23403e);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        FragmentActivity activity;
        LiveData liveDataM80343H0;
        Subject subject;
        ShortTvDetailListFragment shortTvDetailListFragment;
        FragmentActivity activity2;
        LiveData liveDataM80343H1;
        Subject subject2;
        String pageName;
        if (C24223d.f73737a.m95247a(v11 != null ? v11.getId() : 0, 500L)) {
            return;
        }
        if (this.isEpisodeLocked) {
            m80128S0();
        }
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onclick, " + v11, false, 4, null);
        Integer numValueOf = v11 != null ? Integer.valueOf(v11.getId()) : null;
        int i11 = R$id.tv_episode;
        if (numValueOf != null && numValueOf.intValue() == i11) {
            showEpisodeListDialog();
            return;
        }
        int i12 = R$id.tv_favorite;
        if (numValueOf != null && numValueOf.intValue() == i12) {
            ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
            if (shortTvViewModel == null || (liveDataM80343H1 = shortTvViewModel.m80343H0()) == null || (subject2 = (Subject) liveDataM80343H1.m14847f()) == null) {
                return;
            }
            if (!C27287m.f83003a.m106330e()) {
                m80120O0();
                return;
            }
            if (this.data != null) {
                C28654b c28654b = C28654b.f87887a;
                String subjectId = subject2.getSubjectId();
                String ops = subject2.getOps();
                ShortTVFavInfo shortTVFavInfo = subject2.getShortTVFavInfo();
                boolean hasFavorite = shortTVFavInfo != null ? shortTVFavInfo.getHasFavorite() : false;
                ShortTvDetailListFragment shortTvDetailListFragment2 = this.fragment;
                if (shortTvDetailListFragment2 == null || (pageName = shortTvDetailListFragment2.getPageName()) == null) {
                    pageName = "";
                }
                C28654b.m110421g(c28654b, subjectId, ops, "", hasFavorite, pageName, null, 32, null);
            }
            ShortTvViewModel shortTvViewModel2 = this.mShortTvViewModel;
            if (shortTvViewModel2 != null) {
                shortTvViewModel2.m80353P(subject2);
                return;
            }
            return;
        }
        int i13 = R$id.iv_play_status;
        if (numValueOf != null && numValueOf.intValue() == i13) {
            m80184v0();
            return;
        }
        int i14 = R$id.iv_share;
        if (numValueOf != null && numValueOf.intValue() == i14) {
            m80094B0(v11);
            return;
        }
        int i15 = R$id.iv_download;
        if (numValueOf == null || numValueOf.intValue() != i15) {
            int i16 = R$id.iv_short_cover;
            if (numValueOf == null || numValueOf.intValue() != i16) {
                int i17 = R$id.tv_name;
                if (numValueOf == null || numValueOf.intValue() != i17) {
                    int i18 = R$id.iv_back;
                    if (numValueOf != null && numValueOf.intValue() == i18) {
                        ShortTvDetailListFragment shortTvDetailListFragment3 = this.fragment;
                        if (shortTvDetailListFragment3 == null || (activity = shortTvDetailListFragment3.getActivity()) == null) {
                            return;
                        }
                        activity.finish();
                        return;
                    }
                    int i19 = R$id.tv_language;
                    if (numValueOf != null && numValueOf.intValue() == i19) {
                        if (this.viewBinding.f83224A.isSelected()) {
                            m80188x0();
                            return;
                        } else {
                            C25427b.f76996a.m99960d(R$string.short_tv_no_language_toast);
                            return;
                        }
                    }
                    int i20 = R$id.tv_audio;
                    if (numValueOf != null && numValueOf.intValue() == i20) {
                        m80174q0();
                        return;
                    }
                    int i21 = R$id.tv_subtitles;
                    if (numValueOf != null && numValueOf.intValue() == i21) {
                        m80100E0();
                        return;
                    }
                    int i22 = R$id.tv_resolution;
                    if (numValueOf != null && numValueOf.intValue() == i22) {
                        m80192z0();
                        return;
                    }
                    int i23 = R$id.tv_speed;
                    if (numValueOf != null && numValueOf.intValue() == i23) {
                        m80096C0();
                        return;
                    }
                    return;
                }
            }
        }
        C19110c c19110c = this.downloadGuideBubbleController;
        if (c19110c != null) {
            c19110c.m80214f();
        }
        ShortTvViewModel shortTvViewModel3 = this.mShortTvViewModel;
        if (shortTvViewModel3 == null || (liveDataM80343H0 = shortTvViewModel3.m80343H0()) == null || (subject = (Subject) liveDataM80343H0.m14847f()) == null || (shortTvDetailListFragment = this.fragment) == null || (activity2 = shortTvDetailListFragment.getActivity()) == null) {
            return;
        }
        C26719e c26719e = this.data;
        int iM104511c = c26719e != null ? c26719e.m104511c() : 0;
        C28654b.f87887a.m110424c(subject, iM104511c, subject.getNeedPaid() == 0, !m80160j0(), C23219b.f70761a.m92279b(subject, iM104511c));
        C27644a c27644a = C27644a.f84793a;
        ShortTvDetailListFragment shortTvDetailListFragment4 = this.fragment;
        c27644a.m107539a(activity2, shortTvDetailListFragment4 != null ? shortTvDetailListFragment4.getPageName() : null, subject.getOps(), (64 & 8) != 0 ? null : "download_subject", (64 & 16) != 0 ? false : v11.getId() == R$id.iv_download, (64 & 32) != 0 ? null : subject, (64 & 64) != 0 ? null : null, (64 & 128) != 0 ? Boolean.FALSE : Boolean.valueOf(v11.getId() != R$id.iv_download));
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onComplete(final SubtitleDownloadTable stDownloadTable) {
        Intrinsics.m97802h(stDownloadTable, "stDownloadTable");
        this.hasSubDownloading = false;
        ThreadUtils.m27236j(new Runnable() { // from class: com.transsion.shorttv.ui.widget.w0
            @Override // java.lang.Runnable
            public final void run() {
                ShortTvVideoItemView.m80182u0(this.f61553a, stDownloadTable);
            }
        });
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onCompletion(C23403e mediaSource) {
        C26866a.a.m104905r(C26866a.f81698a, this.TAG, new String[]{"onCompletion， play next"}, false, 4, null);
        C28655c c28655c = this.dotLayer;
        if (c28655c != null) {
            InterfaceC16633f.a.m72428f(c28655c, null, 1, null);
        }
        m80134V0(0L);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        LiveData liveDataM80376e0;
        LiveData liveDataM80374d0;
        super.onDetachedFromWindow();
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        if (shortTvViewModel != null && (liveDataM80374d0 = shortTvViewModel.m80374d0()) != null) {
            liveDataM80374d0.mo14856o(this.favoriteObserver);
        }
        this.autoHideRightMenuHandle.removeCallbacksAndMessages(null);
        C19110c c19110c = this.downloadGuideBubbleController;
        if (c19110c != null) {
            c19110c.m80212c();
        }
        m80128S0();
        STCommonVideoAdHelper sTCommonVideoAdHelper = this.videoAdHelper;
        if (sTCommonVideoAdHelper != null) {
            STCommonVideoAdHelper.m78937q(sTCommonVideoAdHelper, 0, 1, null);
        }
        this.videoAdHelper = null;
        m80133V();
        ShortTvViewModel shortTvViewModel2 = this.mShortTvViewModel;
        if (shortTvViewModel2 != null && (liveDataM80376e0 = shortTvViewModel2.m80376e0()) != null) {
            liveDataM80376e0.mo14856o(this.favoriteResultObserver);
        }
        ShortTvViewModel shortTvViewModel3 = this.mShortTvViewModel;
        if (shortTvViewModel3 != null) {
            shortTvViewModel3.m80349N();
        }
        InterfaceC18884b.f60919a.m79507b().mo79494c(this);
        InterfaceC18876a interfaceC18876a = this.subtitleControl;
        if (interfaceC18876a != null) {
            interfaceC18876a.onDestroy();
        }
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onDownloading(int progress, SubtitleDownloadTable stDownloadTable) {
        Intrinsics.m97802h(stDownloadTable, "stDownloadTable");
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onFail(Exception e11, final SubtitleDownloadTable dbBean) {
        Intrinsics.m97802h(e11, "e");
        Intrinsics.m97802h(dbBean, "dbBean");
        this.hasSubDownloading = false;
        ThreadUtils.m27236j(new Runnable() { // from class: com.transsion.shorttv.ui.widget.x0
            @Override // java.lang.Runnable
            public final void run() {
                ShortTvVideoItemView.m80186w0(this.f61558a, dbBean);
            }
        });
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onFocusChange(boolean z11) {
        InterfaceC16633f.a.m72429g(this, z11);
    }

    @Override // com.transsion.shorttv.p315ui.widget.InterfaceC19112d
    public void onGetDubsInfo() {
        m80145b0();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onIsPlayingChanged(boolean z11) {
        InterfaceC16633f.a.m72430h(this, z11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingBegin(C23403e mediaSource) {
        C28655c c28655c = this.dotLayer;
        if (c28655c != null) {
            InterfaceC16633f.a.m72432j(c28655c, null, 1, null);
        }
        setLoading(true);
        C19110c c19110c = this.downloadGuideBubbleController;
        if (c19110c != null) {
            c19110c.m80216i();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingEnd(C23403e mediaSource) {
        C28655c c28655c = this.dotLayer;
        if (c28655c != null) {
            InterfaceC16633f.a.m72434l(c28655c, null, 1, null);
        }
        setLoading(false);
        removeCallbacks(this.delayToastNetErrRunnable);
        C19110c c19110c = this.downloadGuideBubbleController;
        if (c19110c != null) {
            c19110c.m80215h();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingProgress(int i11, float f11, C23403e c23403e) {
        InterfaceC16633f.a.m72435m(this, i11, f11, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoopingStart() {
    }

    public final void onMediaItemTransition() {
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onMediaItemTransition: " + this.viewBinding.f83255s.getMax() + "  : " + this, false, 4, null);
        C28655c c28655c = this.dotLayer;
        if (c28655c != null) {
            InterfaceC16633f.a.m72428f(c28655c, null, 1, null);
        }
        reset();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onMediaItemTransition(String str) {
        InterfaceC16633f.a.m72438p(this, str);
    }

    public final void onNetConnect() {
        C26866a.a.m104898f(C26866a.f81698a, "ORSubtitle_v", "onNetConnect, 网络恢复，检测字幕", false, 4, null);
        InterfaceC18876a interfaceC18876a = this.subtitleControl;
        if (interfaceC18876a != null) {
            interfaceC18876a.mo79474e();
        }
    }

    @Override // com.transsion.shorttv.p315ui.widget.InterfaceC19112d
    public void onPageRelease(int position) {
        LiveData liveDataM80342G0;
        C26719e c26719e = this.data;
        if (c26719e != null) {
            int iM104511c = c26719e.m104511c();
            ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
            if (shortTvViewModel != null) {
                shortTvViewModel.m80345K(iM104511c, getProgress());
            }
        }
        m80128S0();
        this.countdownController = null;
        STCommonVideoAdHelper sTCommonVideoAdHelper = this.videoAdHelper;
        if (sTCommonVideoAdHelper != null) {
            STCommonVideoAdHelper.m78937q(sTCommonVideoAdHelper, 0, 1, null);
        }
        this.videoAdHelper = null;
        onPlayerReset();
        ShortTvViewModel shortTvViewModel2 = this.mShortTvViewModel;
        if (shortTvViewModel2 == null || (liveDataM80342G0 = shortTvViewModel2.m80342G0()) == null) {
            return;
        }
        liveDataM80342G0.mo14856o(this.observer);
    }

    @Override // com.transsion.shorttv.p315ui.widget.InterfaceC19112d
    public void onPageSelected(InterfaceC16634g orPlayer, ORPlayerView orPlayerView, C26719e item) {
        LiveData liveDataM80343H0;
        ShortTvViewModel shortTvViewModel;
        LiveData liveDataM80342G0;
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        if (shortTvDetailListFragment == null || !shortTvDetailListFragment.isAdded() || shortTvDetailListFragment.getView() == null) {
            return;
        }
        C19110c c19110c = this.downloadGuideBubbleController;
        if (c19110c != null) {
            c19110c.m80213d();
        }
        InterfaceC3224u viewLifecycleOwner = shortTvDetailListFragment.getViewLifecycleOwner();
        Intrinsics.m97801g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ShortTvViewModel shortTvViewModel2 = this.mShortTvViewModel;
        if (shortTvViewModel2 != null && (liveDataM80342G0 = shortTvViewModel2.m80342G0()) != null) {
            liveDataM80342G0.m14851j(viewLifecycleOwner, this.observer);
        }
        this.orPlayer = orPlayer;
        this.orPlayerView = orPlayerView;
        C28655c c28655c = this.dotLayer;
        if (c28655c != null) {
            c28655c.m110449p(orPlayer);
        }
        C28655c c28655c2 = this.dotLayer;
        if (c28655c2 != null && orPlayer != null) {
            orPlayer.addPlayerListener(c28655c2);
        }
        if (item != null && (shortTvViewModel = this.mShortTvViewModel) != null) {
            shortTvViewModel.m80375d1(item.m104511c());
        }
        updateShortTvInfo(orPlayer, orPlayerView, item);
        m80145b0();
        m80154g0();
        m80156h0();
        m80122P0();
        m80113L();
        if (item != null) {
            m80170o0(item);
        }
        ShortTvViewModel shortTvViewModel3 = this.mShortTvViewModel;
        Subject subject = (shortTvViewModel3 == null || (liveDataM80343H0 = shortTvViewModel3.m80343H0()) == null) ? null : (Subject) liveDataM80343H0.m14847f();
        C26719e c26719e = this.data;
        int iM104511c = c26719e != null ? c26719e.m104511c() : 0;
        C28654b.f87887a.m110431k(subject, iM104511c, subject != null && subject.getNeedPaid() == 0, !m80160j0(), C23219b.f70761a.m92279b(subject, iM104511c));
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayError(PlayError errorInfo, C23403e mediaSource) {
        Integer errorCode;
        Intrinsics.m97802h(errorInfo, "errorInfo");
        C28655c c28655c = this.dotLayer;
        if (c28655c != null) {
            InterfaceC16633f.a.m72440r(c28655c, errorInfo, null, 2, null);
        }
        C26866a.f81698a.m104915i("i_media", this.TAG + " --> IPlayerListener --> onPlayError()  errorCode:" + errorInfo.getErrorCode() + " errorMessage:" + errorInfo.getErrorMessage() + " url:" + (mediaSource != null ? mediaSource.m92935k() : null) + " --> 短播放失败了", true);
        setLoading(false);
        C19110c c19110c = this.downloadGuideBubbleController;
        if (c19110c != null) {
            c19110c.m80215h();
        }
        Integer errorCode2 = errorInfo.getErrorCode();
        if ((errorCode2 != null && errorCode2.intValue() == 2001) || ((errorCode = errorInfo.getErrorCode()) != null && errorCode.intValue() == 2002)) {
            m80120O0();
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
        ShortTvViewModel shortTvViewModel;
        LiveData liveDataM80343H0;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, this.TAG, "player- onPlayerReset data: " + this.data, false, 4, null);
        C19110c c19110c = this.downloadGuideBubbleController;
        if (c19110c != null) {
            c19110c.m80213d();
        }
        m80133V();
        InterfaceC18876a interfaceC18876a = this.subtitleControl;
        if (interfaceC18876a != null) {
            interfaceC18876a.onDestroy();
        }
        this.subtitleControl = null;
        setKeepScreenOn(false);
        this.isClickPause = false;
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        if (shortTvDetailListFragment != null) {
            shortTvDetailListFragment.m79903m1(false);
        }
        this.isFirstFrame = false;
        this.isPrepare = false;
        boolean zM80158i0 = m80158i0();
        C28655c c28655c = this.dotLayer;
        if (c28655c != null) {
            c28655c.m110440e(zM80158i0, false);
        }
        if (zM80158i0 && (shortTvViewModel = this.mShortTvViewModel) != null) {
            shortTvViewModel.m80393s1((shortTvViewModel == null || (liveDataM80343H0 = shortTvViewModel.m80343H0()) == null) ? null : (Subject) liveDataM80343H0.m14847f(), this.data, this.viewBinding.f83257u.getProgress());
        }
        AppCompatImageView ivCover = this.viewBinding.f83247k;
        Intrinsics.m97801g(ivCover, "ivCover");
        AbstractC23048b.m91694e(ivCover);
        C26866a.a.m104898f(aVar, this.TAG, "onPlayerReset   visible  " + this, false, 4, null);
        AppCompatImageView ivPlayStatus = this.viewBinding.f83249m;
        Intrinsics.m97801g(ivPlayStatus, "ivPlayStatus");
        AbstractC23048b.m91691b(ivPlayStatus);
        InterfaceC16634g interfaceC16634g2 = this.orPlayer;
        if (interfaceC16634g2 != null) {
            interfaceC16634g2.removePlayerListener(this);
        }
        C28655c c28655c2 = this.dotLayer;
        if (c28655c2 != null && (interfaceC16634g = this.orPlayer) != null) {
            interfaceC16634g.removePlayerListener(c28655c2);
        }
        this.orPlayer = null;
        this.orPlayerView = null;
        this.pagerLayoutManager = null;
        this.currentSaveProgress = 0L;
        m80134V0(0L);
        m80136W0(100L);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPrepare(C23403e mediaSource) {
        ShortTvDetailListFragment shortTvDetailListFragment;
        LiveData liveDataM80378f0;
        ShortTvInnerPlayBean shortTvInnerPlayBean;
        C26719e c26719e;
        ShortTVItem shortTVItemM104512d;
        if (this.isPrepare) {
            return;
        }
        this.isPrepare = true;
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        long duration = interfaceC16634g != null ? interfaceC16634g.getDuration() : 0L;
        m80136W0(duration);
        if (duration / ((long) 1000) >= 30) {
            ShortTvVideoProgressDragGestureView vProgressGesture = this.viewBinding.f83233J;
            Intrinsics.m97801g(vProgressGesture, "vProgressGesture");
            AbstractC23048b.m91694e(vProgressGesture);
        } else {
            ShortTvVideoProgressDragGestureView vProgressGesture2 = this.viewBinding.f83233J;
            Intrinsics.m97801g(vProgressGesture2, "vProgressGesture");
            AbstractC23048b.m91691b(vProgressGesture2);
        }
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        if (shortTvViewModel != null && (liveDataM80378f0 = shortTvViewModel.m80378f0()) != null && (shortTvInnerPlayBean = (ShortTvInnerPlayBean) liveDataM80378f0.m14847f()) != null && (c26719e = this.data) != null && (shortTVItemM104512d = c26719e.m104512d()) != null && shortTvInnerPlayBean.getEp() == shortTVItemM104512d.getEp()) {
            long progress = shortTvInnerPlayBean.getProgress();
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "player- onPrepare, duration = " + this.viewBinding.f83257u.getProgress() + ", progress = " + progress + "  this = " + this, false, 4, null);
            if (progress > 0) {
                this.currentSaveProgress = progress;
                InterfaceC16634g interfaceC16634g2 = this.orPlayer;
                if (interfaceC16634g2 != null) {
                    interfaceC16634g2.seekTo(progress);
                }
            }
            ShortTvViewModel shortTvViewModel2 = this.mShortTvViewModel;
            if (shortTvViewModel2 != null) {
                shortTvViewModel2.m80351O();
            }
        }
        if (!this.isClickPause && !this.isPageHide && (shortTvDetailListFragment = this.fragment) != null && shortTvDetailListFragment.isVisible()) {
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "player- onPrepare， play~", false, 4, null);
        }
        setKeepScreenOn(true);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onProgress(long progress, C23403e mediaSource) {
        LiveData liveDataM80343H0;
        InterfaceC16634g interfaceC16634g;
        InterfaceC16634g interfaceC16634g2;
        if (this.isHorizontalDragging) {
            return;
        }
        long max = this.viewBinding.f83257u.getMax();
        if (max <= 0 || max == 100 || (interfaceC16634g2 = this.orPlayer) == null || max != interfaceC16634g2.getDuration()) {
            InterfaceC16634g interfaceC16634g3 = this.orPlayer;
            long duration = interfaceC16634g3 != null ? interfaceC16634g3.getDuration() : 0L;
            if (duration <= 0) {
                C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onProgress- duration <= 0, return", false, 4, null);
                return;
            }
            m80136W0(duration);
        }
        C28655c c28655c = this.dotLayer;
        if (c28655c != null) {
            InterfaceC16633f.a.m72448z(c28655c, progress, null, 2, null);
        }
        InterfaceC18876a interfaceC18876a = this.subtitleControl;
        if (interfaceC18876a != null) {
            interfaceC18876a.mo79473d(progress);
        }
        m80134V0(progress);
        setLoading(false);
        if (progress > 0) {
            AppCompatImageView ivCover = this.viewBinding.f83247k;
            Intrinsics.m97801g(ivCover, "ivCover");
            if (ivCover.getVisibility() == 0 && (interfaceC16634g = this.orPlayer) != null && interfaceC16634g.isPlaying()) {
                C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onProgress-progress>= cover gone", false, 4, null);
                AppCompatImageView ivCover2 = this.viewBinding.f83247k;
                Intrinsics.m97801g(ivCover2, "ivCover");
                AbstractC23048b.m91691b(ivCover2);
            }
        }
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        Subject subject = (shortTvViewModel == null || (liveDataM80343H0 = shortTvViewModel.m80343H0()) == null) ? null : (Subject) liveDataM80343H0.m14847f();
        if (subject != null && subject.getMiniTvType() == 2 && m80160j0()) {
            long unlockFrom = ((long) subject.getUnlockFrom()) * 1000;
            if (1 > unlockFrom || unlockFrom > progress) {
                if (unlockFrom > 0) {
                    m80132U0(unlockFrom - progress);
                }
            } else {
                InterfaceC16634g interfaceC16634g4 = this.orPlayer;
                if (interfaceC16634g4 != null) {
                    interfaceC16634g4.pause();
                }
                m80133V();
                m80112K0(this.data);
            }
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onRenderFirstFrame() {
        C26866a.a aVar = C26866a.f81698a;
        String str = this.TAG;
        AppCompatImageView ivCover = this.viewBinding.f83247k;
        Intrinsics.m97801g(ivCover, "ivCover");
        C26866a.a.m104898f(aVar, str, "player-   viewBinding.ivCover.isVisible:" + (ivCover.getVisibility() == 0) + " onRenderFirstFrame" + this, false, 4, null);
        if (!this.isFirstFrame) {
            this.isFirstFrame = true;
            C28655c c28655c = this.dotLayer;
            if (c28655c != null) {
                c28655c.onRenderFirstFrame();
            }
        }
        setLoading(false);
        C19110c c19110c = this.downloadGuideBubbleController;
        if (c19110c != null) {
            c19110c.m80215h();
        }
        AppCompatImageView ivCover2 = this.viewBinding.f83247k;
        Intrinsics.m97801g(ivCover2, "ivCover");
        AbstractC23048b.m91691b(ivCover2);
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
        InterfaceC28216g interfaceC28216gM80400z0;
        ShortTvDetailListFragment shortTvDetailListFragment;
        InterfaceC16634g interfaceC16634g2;
        Lifecycle lifecycle;
        Intrinsics.m97802h(source, "source");
        Intrinsics.m97802h(event, "event");
        int i11 = C19096a.f61460a[event.ordinal()];
        if (i11 == 1) {
            this.isPageHide = true;
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "player- onPause", false, 4, null);
            ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
            if ((shortTvViewModel == null || (interfaceC28216gM80400z0 = shortTvViewModel.m80400z0()) == null || !interfaceC28216gM80400z0.mo73683f(this.orPlayer)) && (interfaceC16634g = this.orPlayer) != null) {
                interfaceC16634g.pause();
                return;
            }
            return;
        }
        if (i11 == 2) {
            this.isPageHide = false;
            if (this.isClickPause || (shortTvDetailListFragment = this.fragment) == null || !shortTvDetailListFragment.isVisible()) {
                return;
            }
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "ON_RESUME", false, 4, null);
            m80106H0();
            return;
        }
        if (i11 != 5) {
            return;
        }
        ShortTvDetailListFragment shortTvDetailListFragment2 = this.fragment;
        if (shortTvDetailListFragment2 != null && (lifecycle = shortTvDetailListFragment2.getLifecycle()) != null) {
            lifecycle.mo14835d(this);
        }
        C28655c c28655c = this.dotLayer;
        if (c28655c != null) {
            c28655c.m110442h();
        }
        InterfaceC16634g interfaceC16634g3 = this.orPlayer;
        if (interfaceC16634g3 != null) {
            interfaceC16634g3.removePlayerListener(this);
        }
        C28655c c28655c2 = this.dotLayer;
        if (c28655c2 == null || (interfaceC16634g2 = this.orPlayer) == null) {
            return;
        }
        interfaceC16634g2.removePlayerListener(c28655c2);
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
            AppCompatImageView ivPlayStatus = this.viewBinding.f83249m;
            Intrinsics.m97801g(ivPlayStatus, "ivPlayStatus");
            ivPlayStatus.setVisibility(0);
        }
        C28655c c28655c = this.dotLayer;
        if (c28655c != null) {
            InterfaceC16633f.a.m72418G(c28655c, null, 1, null);
        }
        InterfaceC18876a interfaceC18876a = this.subtitleControl;
        if (interfaceC18876a != null) {
            interfaceC18876a.mo79472c(false);
        }
        setKeepScreenOn(false);
        m80122P0();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoSizeChanged(int width, int height) {
        this.videoWidth = width;
        this.videoHeight = height;
        m80142Z0(Integer.valueOf(width), Integer.valueOf(height));
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onVideoSizeChanged " + this, false, 4, null);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoStart(C23403e mediaSource) {
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "player- onVideoStart", false, 4, null);
        onPrepare(mediaSource);
        C28655c c28655c = this.dotLayer;
        if (c28655c != null) {
            InterfaceC16633f.a.m72421J(c28655c, null, 1, null);
        }
        AppCompatImageView ivPlayStatus = this.viewBinding.f83249m;
        Intrinsics.m97801g(ivPlayStatus, "ivPlayStatus");
        ivPlayStatus.setVisibility(8);
        InterfaceC18876a interfaceC18876a = this.subtitleControl;
        if (interfaceC18876a != null) {
            interfaceC18876a.mo79472c(true);
        }
        setLoading(false);
        setKeepScreenOn(true);
        m80113L();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
    }

    public final void reset() {
        ShortTvViewModel shortTvViewModel;
        LiveData liveDataM80343H0;
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "playNewMedia data: " + this.data, false, 4, null);
        setKeepScreenOn(false);
        this.isClickPause = false;
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        if (shortTvDetailListFragment != null) {
            shortTvDetailListFragment.m79903m1(false);
        }
        this.isFirstFrame = false;
        C28655c c28655c = this.dotLayer;
        if (c28655c != null) {
            c28655c.m110440e(m80158i0(), false);
        }
        if (m80158i0() && (shortTvViewModel = this.mShortTvViewModel) != null) {
            shortTvViewModel.m80393s1((shortTvViewModel == null || (liveDataM80343H0 = shortTvViewModel.m80343H0()) == null) ? null : (Subject) liveDataM80343H0.m14847f(), this.data, this.viewBinding.f83257u.getProgress());
        }
        AppCompatImageView ivPlayStatus = this.viewBinding.f83249m;
        Intrinsics.m97801g(ivPlayStatus, "ivPlayStatus");
        AbstractC23048b.m91691b(ivPlayStatus);
        this.currentSaveProgress = 0L;
        m80134V0(0L);
        m80136W0(100L);
    }

    public final void setCountdownController(InterfaceC19107a1 interfaceC19107a1) {
        this.countdownController = interfaceC19107a1;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01fb  */
    @Override // com.transsion.shorttv.p315ui.widget.InterfaceC19112d
    public void setData(C26719e item, ShortTvDetailListFragment fragment, Integer position, boolean videoLoadMore, String basePostId, String baseItemType, boolean isPayloads, boolean fromTrending) {
        WindowInsets rootWindowInsets;
        Insets insets;
        boolean z11;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        LiveData liveDataM80343H0;
        Subject subject;
        Media video;
        Video videoAddress;
        FragmentActivity activity;
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(fragment, "fragment");
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "setData position:" + position + "  ep:" + item.m104511c() + " item:" + item + " " + this, false, 4, null);
        this.fragment = fragment;
        this.videoLoadMore = Boolean.valueOf(videoLoadMore);
        this.basePostId = basePostId;
        this.position = position;
        FragmentActivity activity2 = fragment.getActivity();
        if (activity2 != null) {
            this.mShortTvViewModel = getViewModel(activity2);
            this.mShortTvSubViewModel = (C4880a) new C3227v0(activity2).m14969a(C4880a.class);
        }
        fragment.getLifecycle().mo14832a(this);
        this.data = item;
        if (item.m104512d() != null) {
            m80154g0();
        }
        if (!isPayloads) {
            this.dotLayer = new C28655c(fragment, this.mShortTvViewModel);
        }
        C28655c c28655c = this.dotLayer;
        if (c28655c != null) {
            c28655c.m110444k(basePostId);
        }
        C28655c c28655c2 = this.dotLayer;
        if (c28655c2 != null) {
            c28655c2.m110443j(baseItemType);
        }
        C28655c c28655c3 = this.dotLayer;
        if (c28655c3 != null) {
            c28655c3.m110451r(fragment.getPageName());
        }
        C28655c c28655c4 = this.dotLayer;
        if (c28655c4 != null) {
            c28655c4.m110445l(item.m104510b());
        }
        m80130T0();
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        if (shortTvViewModel != null && (liveDataM80343H0 = shortTvViewModel.m80343H0()) != null && (subject = (Subject) liveDataM80343H0.m14847f()) != null) {
            C28655c c28655c5 = this.dotLayer;
            if (c28655c5 != null) {
                c28655c5.m110453t(subject);
            }
            this.shortTvInfo = subject;
            C26719e c26719e = this.data;
            String strM80248e = AbstractC19166i.m80248e(c26719e != null ? Integer.valueOf(c26719e.m104511c()) : null);
            Subject subject2 = this.shortTvInfo;
            String strM80248e2 = subject2 != null ? AbstractC19166i.m80248e(Integer.valueOf(subject2.getTotalEpisode())) : null;
            if (item.m104511c() == 0) {
                this.viewBinding.f83261y.setText(getContext().getString(R$string.short_tv_trailer) + " / EP" + strM80248e2);
            } else {
                this.viewBinding.f83261y.setText("EP" + strM80248e + " / EP" + strM80248e2);
            }
            Cover cover = subject.getCover();
            if (cover != null && (activity = fragment.getActivity()) != null) {
                C23424b.a aVar = C23424b.f71424a;
                ShapeableImageView ivShortCover = this.viewBinding.f83251o;
                Intrinsics.m97801g(ivShortCover, "ivShortCover");
                String url = cover.getUrl();
                if (url == null) {
                    url = "";
                }
                int iM27411e = AbstractC5790i.m27411e(21.0f);
                int iM27411e2 = AbstractC5790i.m27411e(30.0f);
                String thumbnail = cover.getThumbnail();
                aVar.m93010j(activity, ivShortCover, url, (8096 & 8) != 0 ? aVar.m93007c() : iM27411e, (8096 & 16) != 0 ? aVar.m93006b() : iM27411e2, (8096 & 32) != 0, (8096 & 64) != 0 ? "" : thumbnail == null ? "" : thumbnail, (8096 & 128) != 0, (8096 & 256) != 0, (8096 & 512) != 0 ? false : false, (8096 & 1024) != 0 ? false : false, (8096 & 2048) != 0 ? false : false, (8096 & 4096) != 0 ? 25 : 0);
            }
            ShortTVItem shortTVItemM104512d = item.m104512d();
            if (shortTVItemM104512d != null && (video = shortTVItemM104512d.getVideo()) != null && (videoAddress = video.getVideoAddress()) != null) {
                m80142Z0(videoAddress.getWidth(), videoAddress.getHeight());
            }
            this.viewBinding.f83225B.setText(subject.getTitle());
            m80108I0(strM80248e, subject, item.m104512d(), fromTrending);
        }
        if (!this.isOptimizeEnable && Build.VERSION.SDK_INT >= 30) {
            Context context = getContext();
            Intrinsics.m97800f(context, "null cannot be cast to non-null type android.app.Activity");
            Window window = ((Activity) context).getWindow();
            if (window != null && (rootWindowInsets = window.getDecorView().getRootWindowInsets()) != null && (insets = rootWindowInsets.getInsets(WindowInsets.Type.tappableElement())) != null) {
                if (AbstractC5781d.m27353e(window)) {
                    z11 = AbstractC5781d.m27349a() > 1;
                }
                int iM27411e3 = AbstractC5790i.m27411e(16.0f);
                if (z11 || insets.top <= 0) {
                    Space progressGuideline = this.viewBinding.f83256t;
                    Intrinsics.m97801g(progressGuideline, "progressGuideline");
                    ViewGroup.LayoutParams layoutParams = progressGuideline.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
                    ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    int i11 = marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0;
                    ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    int i12 = marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0;
                    ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
                    marginLayoutParams = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    c2308b.setMargins(i11, i12, marginLayoutParams != null ? marginLayoutParams.rightMargin : 0, iM27411e3);
                    progressGuideline.setLayoutParams(c2308b);
                } else {
                    Space progressGuideline2 = this.viewBinding.f83256t;
                    Intrinsics.m97801g(progressGuideline2, "progressGuideline");
                    ViewGroup.LayoutParams layoutParams5 = progressGuideline2.getLayoutParams();
                    if (layoutParams5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.C2308b c2308b2 = (ConstraintLayout.C2308b) layoutParams5;
                    ViewGroup.LayoutParams layoutParams6 = getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                    int i13 = marginLayoutParams4 != null ? marginLayoutParams4.leftMargin : 0;
                    ViewGroup.LayoutParams layoutParams7 = getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
                    int i14 = marginLayoutParams5 != null ? marginLayoutParams5.topMargin : 0;
                    ViewGroup.LayoutParams layoutParams8 = getLayoutParams();
                    marginLayoutParams = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
                    c2308b2.setMargins(i13, i14, marginLayoutParams != null ? marginLayoutParams.rightMargin : 0, RangesKt.m97935e(iM27411e3, insets.top));
                    progressGuideline2.setLayoutParams(c2308b2);
                }
            }
        }
        m80146b1(item);
        updateLockState(item);
    }

    public final void setFirstPlayInSession(boolean z11) {
        this.isFirstPlayInSession = z11;
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
        C28655c c28655c = this.dotLayer;
        if (c28655c != null) {
            c28655c.m110455v(url);
        }
    }

    public final void showEpisodeListDialog() {
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        Intrinsics.m97800f(shortTvDetailListFragment, "null cannot be cast to non-null type com.transsion.shorttv.ui.fragment.ShortTvDetailListFragment");
        shortTvDetailListFragment.m79904n1();
    }

    public void updateLockState(C26719e item) {
        LiveData liveDataM80343H0;
        if (item == null) {
            return;
        }
        if (!m80160j0()) {
            m80135W();
            m80133V();
            return;
        }
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        Subject subject = (shortTvViewModel == null || (liveDataM80343H0 = shortTvViewModel.m80343H0()) == null) ? null : (Subject) liveDataM80343H0.m14847f();
        if (subject == null || subject.getMiniTvType() != 2 || subject.getUnlockFrom() <= 0) {
            m80112K0(item);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d4  */
    public void updateShortTvInfo(InterfaceC16634g orPlayer, ORPlayerView orPlayerView, C26719e item) {
        Video video;
        long jLongValue;
        ShortTVItem shortTVItemM104512d;
        Map mapMo102959a;
        ShortTVItem shortTVItemM104512d2;
        Media video2;
        ShortTVItem shortTVItemM104512d3;
        Media video3;
        ConcurrentHashMap concurrentHashMapM80395u0;
        List list;
        Object next;
        Media video4;
        LiveData liveDataM80343H0;
        LiveData liveDataM80343H1;
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        Subject subject = (shortTvViewModel == null || (liveDataM80343H1 = shortTvViewModel.m80343H0()) == null) ? null : (Subject) liveDataM80343H1.m14847f();
        C26866a.a aVar = C26866a.f81698a;
        aVar.m104919u(this.TAG, "updateShortTvInfo:" + this.position + " subjectId:" + (subject != null ? subject.getSubjectId() : null), true);
        if (m80160j0()) {
            aVar.m104912c(this.TAG, "onPageSelect position:" + this.position + " item is locked", true);
            ShortTvViewModel shortTvViewModel2 = this.mShortTvViewModel;
            Subject subject2 = (shortTvViewModel2 == null || (liveDataM80343H0 = shortTvViewModel2.m80343H0()) == null) ? null : (Subject) liveDataM80343H0.m14847f();
            if (subject2 == null || subject2.getMiniTvType() != 2 || subject2.getUnlockFrom() <= 0) {
                if (orPlayer != null) {
                    orPlayer.pause();
                }
                m80112K0(item);
                return;
            }
            m80110J0();
        } else {
            m80135W();
            m80133V();
        }
        ShortTvViewModel shortTvViewModel3 = this.mShortTvViewModel;
        if (shortTvViewModel3 == null || (concurrentHashMapM80395u0 = shortTvViewModel3.m80395u0()) == null) {
            video = null;
        } else {
            C3187b0 c3187b0 = (C3187b0) concurrentHashMapM80395u0.get(item != null ? item.m104513e() : null);
            if (c3187b0 == null || (list = (List) c3187b0.m14847f()) == null) {
                video = null;
            } else {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    ShortTVItem shortTVItem = (ShortTVItem) next;
                    if (item != null && shortTVItem.getEp() == item.m104511c()) {
                        break;
                    }
                }
                ShortTVItem shortTVItem2 = (ShortTVItem) next;
                if (shortTVItem2 == null || (video4 = shortTVItem2.getVideo()) == null) {
                    video = null;
                } else {
                    video = video4.getVideo();
                }
            }
        }
        Video video5 = (item == null || (shortTVItemM104512d3 = item.m104512d()) == null || (video3 = shortTVItemM104512d3.getVideo()) == null) ? null : video3.getVideo();
        if (video == null) {
            if (video5 == null) {
                return;
            } else {
                video = video5;
            }
        }
        if (AbstractC26726l.m104527b(item)) {
            C26866a.f81698a.m104912c(this.TAG, "onPageSelect position:" + this.position + " item is null ", true);
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
            m80107I(orPlayerView, (item == null || (shortTVItemM104512d2 = item.m104512d()) == null || (video2 = shortTVItemM104512d2.getVideo()) == null) ? null : video2.getVideoAddress());
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "addView-----", false, 4, null);
        }
        videoStartPrepare(this.pageFrom);
        C26866a.a aVar2 = C26866a.f81698a;
        C26866a.a.m104898f(aVar2, this.TAG, "play url=" + video.getUrl() + "  width:" + video.getWidth() + ",height:" + video.getHeight() + ", duration: " + video.getDuration() + ", builtIn = false", false, 4, null);
        String url = video.getUrl();
        if (url != null) {
            if (item != null) {
                int iM104511c = item.m104511c();
                ShortTvViewModel shortTvViewModel4 = this.mShortTvViewModel;
                if (shortTvViewModel4 != null) {
                    shortTvViewModel4.m80347L(iM104511c);
                }
                ShortTvViewModel shortTvViewModel5 = this.mShortTvViewModel;
                Long lValueOf = shortTvViewModel5 != null ? Long.valueOf(shortTvViewModel5.m80363W(iM104511c)) : null;
                if (lValueOf != null) {
                    jLongValue = lValueOf.longValue();
                } else {
                    jLongValue = 0;
                }
            } else {
                jLongValue = 0;
            }
            long j11 = jLongValue;
            InterfaceC26373f interfaceC26373f = orPlayer instanceof InterfaceC26373f ? (InterfaceC26373f) orPlayer : null;
            boolean zContainsKey = (interfaceC26373f == null || (mapMo102959a = interfaceC26373f.mo102959a()) == null) ? true : mapMo102959a.containsKey(url);
            if (!zContainsKey) {
                ShortTvViewModel shortTvViewModel6 = this.mShortTvViewModel;
                if (shortTvViewModel6 != null) {
                    shortTvViewModel6.m80377e1(true);
                }
                C23403e c23403e = new C23403e(url, url, (item == null || (shortTVItemM104512d = item.m104512d()) == null) ? 0 : shortTVItemM104512d.getEp(), null, null, 24, null);
                InterfaceC26373f interfaceC26373f2 = (InterfaceC26373f) orPlayer;
                if (interfaceC26373f2 != null) {
                    interfaceC26373f2.addDataSource(c23403e);
                }
                if (interfaceC26373f2 != null) {
                    interfaceC26373f2.prepare();
                }
            }
            C26866a.a.m104905r(aVar2, this.TAG, new String[]{"------seekTo resolution:" + video.getResolution() + ",url=" + url + ", cachedProgress=" + j11}, false, 4, null);
            if (orPlayer != null) {
                orPlayer.seekTo(url, j11);
            }
            setVideoUrl(url);
            if (!zContainsKey) {
                post(new Runnable() { // from class: com.transsion.shorttv.ui.widget.v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ShortTvVideoItemView.m80138X0(this.f61549a);
                    }
                });
            }
        }
        m80106H0();
    }

    public final void updateUnlockCountdownText$shortTvLib_release(Integer remaining) {
        View view = this.lockedView;
        AppCompatTextView appCompatTextView = view != null ? (AppCompatTextView) view.findViewById(R$id.btn_watch_ad_unlock) : null;
        String string = getContext().getString(R$string.short_tv_locked_watch_ad_unlock_static);
        Intrinsics.m97801g(string, "getString(...)");
        if (remaining == null) {
            if (appCompatTextView != null) {
                appCompatTextView.setText(string);
            }
        } else if (appCompatTextView != null) {
            appCompatTextView.setText(string + " · " + remaining + "s");
        }
    }

    public final void videoStartPrepare(String pageFrom) {
        Intrinsics.m97802h(pageFrom, "pageFrom");
        this.isFirstFrame = false;
        this.pageFrom = pageFrom;
        C28655c c28655c = this.dotLayer;
        if (c28655c != null) {
            c28655c.m110450q(pageFrom);
        }
        C28655c c28655c2 = this.dotLayer;
        if (c28655c2 != null) {
            c28655c2.m110448o("immersive_play");
        }
        C28655c c28655c3 = this.dotLayer;
        if (c28655c3 != null) {
            c28655c3.m110454u(SubjectType.SHORT_TV.getValue());
        }
        C28655c c28655c4 = this.dotLayer;
        if (c28655c4 != null) {
            C26719e c26719e = this.data;
            c28655c4.m110446m(String.valueOf(c26719e != null ? c26719e.m104511c() : 0));
        }
        C28655c c28655c5 = this.dotLayer;
        if (c28655c5 != null) {
            c28655c5.m110441g(this, false);
        }
        C28655c c28655c6 = this.dotLayer;
        if (c28655c6 != null) {
            c28655c6.m110436a(0, 0);
        }
        C28655c c28655c7 = this.dotLayer;
        if (c28655c7 != null) {
            c28655c7.m110452s(this.position);
        }
        C28655c c28655c8 = this.dotLayer;
        if (c28655c8 != null) {
            c28655c8.m110447n(this.isFirstPlayInSession);
        }
        setLoading(true);
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        if (shortTvViewModel != null) {
            shortTvViewModel.m80360T0();
        }
    }

    public final void watchAdToUnlock$shortTvLib_release(boolean isAuto) {
        FragmentActivity activity;
        LiveData liveDataM80343H0;
        LiveData liveDataM80343H1;
        C28654b c28654b = C28654b.f87887a;
        ShortTvViewModel shortTvViewModel = this.mShortTvViewModel;
        Subject subject = null;
        Subject subject2 = (shortTvViewModel == null || (liveDataM80343H1 = shortTvViewModel.m80343H0()) == null) ? null : (Subject) liveDataM80343H1.m14847f();
        C26719e c26719e = this.data;
        c28654b.m110428h(subject2, c26719e != null ? c26719e.m104511c() : 0, "minitv_ad", isAuto ? "auto" : "manual");
        if (!C27287m.f83003a.m106330e()) {
            C25427b.f76996a.m99961e(Utils.m27275a().getString(R$string.short_tv_no_network_toast));
            return;
        }
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        if (shortTvDetailListFragment != null) {
            if (shortTvDetailListFragment.getView() == null) {
                shortTvDetailListFragment = null;
            }
            if (shortTvDetailListFragment == null) {
                return;
            }
            InterfaceC3224u viewLifecycleOwner = shortTvDetailListFragment.getViewLifecycleOwner();
            Intrinsics.m97801g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            LifecycleCoroutineScope lifecycleCoroutineScopeM14968a = AbstractC3226v.m14968a(viewLifecycleOwner);
            ShortTvDetailListFragment shortTvDetailListFragment2 = this.fragment;
            if (shortTvDetailListFragment2 == null || (activity = shortTvDetailListFragment2.getActivity()) == null) {
                Context context = getContext();
                activity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                if (activity == null) {
                    return;
                }
            }
            final FragmentActivity fragmentActivity = activity;
            View view = this.lockedView;
            final AppCompatTextView appCompatTextView = view != null ? (AppCompatTextView) view.findViewById(R$id.btn_watch_ad_unlock) : null;
            if (appCompatTextView != null) {
                appCompatTextView.setEnabled(false);
            }
            final C26719e c26719e2 = this.data;
            STCommonVideoAdHelper sTCommonVideoAdHelper = this.videoAdHelper;
            if (sTCommonVideoAdHelper != null) {
                STCommonVideoAdHelper.m78937q(sTCommonVideoAdHelper, 0, 1, null);
            }
            this.videoAdHelper = new STCommonVideoAdHelper("ShortTvPlayerUnlockPlayScene", lifecycleCoroutineScopeM14968a);
            ShortTvViewModel shortTvViewModel2 = this.mShortTvViewModel;
            if (shortTvViewModel2 != null && (liveDataM80343H0 = shortTvViewModel2.m80343H0()) != null) {
                subject = (Subject) liveDataM80343H0.m14847f();
            }
            final Subject subject3 = subject;
            C26719e c26719e3 = this.data;
            final int iM104511c = c26719e3 != null ? c26719e3.m104511c() : 0;
            STCommonVideoAdHelper sTCommonVideoAdHelper2 = this.videoAdHelper;
            if (sTCommonVideoAdHelper2 != null) {
                sTCommonVideoAdHelper2.m78941t(new Function3() { // from class: com.transsion.shorttv.ui.widget.u0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return ShortTvVideoItemView.m80148c1(this.f61540a, fragmentActivity, subject3, iM104511c, appCompatTextView, c26719e2, ((Boolean) obj).booleanValue(), (String) obj2, (String) obj3);
                    }
                });
            }
        }
    }
}
