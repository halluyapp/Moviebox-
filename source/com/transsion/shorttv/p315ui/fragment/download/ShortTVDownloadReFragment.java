package com.transsion.shorttv.p315ui.fragment.download;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0248a;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.foundation.AbstractC0690e;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.AbstractC2397b;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5780c0;
import com.blankj.utilcode.util.AbstractC5790i;
import com.blankj.utilcode.util.NetworkUtils;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.google.android.flexbox.C9902d;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.noober.background.view.BLFrameLayout;
import com.noober.background.view.BLImageView;
import com.noober.background.view.BLView;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.p285ad.bidding.video.BiddingVideoManager;
import com.transsion.p285ad.scene.C14050d;
import com.transsion.shorttv.R$color;
import com.transsion.shorttv.R$drawable;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.R$mipmap;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv.base.widget.DefaultView;
import com.transsion.shorttv.bean.Cover;
import com.transsion.shorttv.bean.DownloadItem;
import com.transsion.shorttv.bean.DownloadListBean;
import com.transsion.shorttv.bean.ShortTVFavInfo;
import com.transsion.shorttv.bean.ShortTVItem;
import com.transsion.shorttv.bean.ShortTvInnerPlayBean;
import com.transsion.shorttv.bean.SkuInfo;
import com.transsion.shorttv.bean.Subject;
import com.transsion.shorttv.order.C18862d;
import com.transsion.shorttv.order.InterfaceC18853b;
import com.transsion.shorttv.order.bean.CreatePaynicornOrderReqBean;
import com.transsion.shorttv.order.bean.GetPaynicornOrderStatusRespEntity;
import com.transsion.shorttv.p313ad.common.STCommonVideoAdHelper;
import com.transsion.shorttv.p315ui.adapter.C18952s;
import com.transsion.shorttv.p315ui.adapter.ShortTvDownloadEpListAdapter;
import com.transsion.shorttv.p315ui.dialog.ShortTvAlertDialog;
import com.transsion.shorttv.p315ui.widget.ShortTvDownloadInfoExtendView;
import com.transsion.shorttv.utils.C19159b;
import com.transsion.shorttv.viewmodel.ShortTvDownloadViewModel;
import com.transsion.shorttv.viewmodel.ShortTvViewModel;
import com.transsion.web.api.WebConstants;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import es.C23219b;
import is.C24223d;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p356ds.AbstractC23048b;
import p393f.C23284j;
import p416fs.C23424b;
import p550kj.C24655b;
import p550kj.C24662i;
import p557ks.C25427b;
import p659os.C26718d;
import p717qr.C27124c;
import p718qs.C27125a;
import p743rh.C27287m;
import p848vs.InterfaceC28213d;
import p848vs.InterfaceC28215f;
import p848vs.InterfaceC28217h;
import p848vs.InterfaceC28218i;
import p848vs.InterfaceC28220k;
import p919xs.C28654b;
import p925xy.C28673c;
import p988zr.C29238a;
import pg.C26866a;
import rs.C27372z;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 Ã\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002Ä\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0015H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0015H\u0002¢\u0006\u0004\b1\u0010\u0018J\u0019\u00104\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\b2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b6\u0010/J/\u0010<\u001a\u00020\b2\u000e\u00109\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001072\u0006\u0010:\u001a\u00020\u00152\u0006\u0010;\u001a\u00020\u0015H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\b2\u0006\u0010;\u001a\u00020\u0015H\u0002¢\u0006\u0004\b>\u0010\u0018J\u000f\u0010?\u001a\u00020\bH\u0002¢\u0006\u0004\b?\u0010\u0004J\u000f\u0010@\u001a\u00020\bH\u0002¢\u0006\u0004\b@\u0010\u0004J\u000f\u0010A\u001a\u00020\bH\u0002¢\u0006\u0004\bA\u0010\u0004J\u000f\u0010B\u001a\u00020\bH\u0002¢\u0006\u0004\bB\u0010\u0004J\u000f\u0010C\u001a\u00020\u000fH\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u000fH\u0002¢\u0006\u0004\bE\u0010DJ)\u0010K\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020H2\b\b\u0002\u0010J\u001a\u00020\u001bH\u0002¢\u0006\u0004\bK\u0010LJ\u0011\u0010M\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\bM\u0010DJ\u000f\u0010N\u001a\u00020\bH\u0002¢\u0006\u0004\bN\u0010\u0004J\u0017\u0010P\u001a\u00020\b2\u0006\u0010O\u001a\u00020\u001bH\u0002¢\u0006\u0004\bP\u0010\u001eJ\u0017\u0010Q\u001a\u00020\b2\u0006\u0010O\u001a\u00020\u001bH\u0002¢\u0006\u0004\bQ\u0010\u001eJ\u000f\u0010R\u001a\u00020\u001bH\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\b2\u0006\u0010T\u001a\u00020\u001bH\u0002¢\u0006\u0004\bU\u0010\u001eJ\u0017\u0010V\u001a\u00020\b2\u0006\u0010T\u001a\u00020\u001bH\u0002¢\u0006\u0004\bV\u0010\u001eJ\u0017\u0010W\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bW\u0010\"JQ\u0010_\u001a\u00020\b2\b\u0010X\u001a\u0004\u0018\u00010H2\u0006\u0010Y\u001a\u00020H2\b\u0010Z\u001a\u0004\u0018\u00010H2\b\u0010[\u001a\u0004\u0018\u00010H2\b\u0010\\\u001a\u0004\u0018\u00010H2\b\u0010]\u001a\u0004\u0018\u00010H2\u0006\u0010^\u001a\u00020HH\u0002¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\bH\u0002¢\u0006\u0004\ba\u0010\u0004J\u000f\u0010b\u001a\u00020\bH\u0002¢\u0006\u0004\bb\u0010\u0004J/\u0010g\u001a\u00020\b2\b\u0010c\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010d2\b\b\u0002\u0010f\u001a\u00020\u0015H\u0002¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\bH\u0016¢\u0006\u0004\bi\u0010\u0004J\u0019\u0010l\u001a\u00020\b2\b\u0010k\u001a\u0004\u0018\u00010jH\u0016¢\u0006\u0004\bl\u0010mJ\u0017\u0010p\u001a\u00020\u00022\u0006\u0010o\u001a\u00020nH\u0016¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020HH\u0016¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u00020\u001bH\u0016¢\u0006\u0004\bt\u0010SJ\u000f\u0010u\u001a\u00020\u001bH\u0016¢\u0006\u0004\bu\u0010SJ\u000f\u0010v\u001a\u00020\bH\u0016¢\u0006\u0004\bv\u0010\u0004J\u000f\u0010w\u001a\u00020\bH\u0016¢\u0006\u0004\bw\u0010\u0004J\u000f\u0010x\u001a\u00020\bH\u0016¢\u0006\u0004\bx\u0010\u0004J\u000f\u0010y\u001a\u00020\bH\u0016¢\u0006\u0004\by\u0010\u0004J\u000f\u0010z\u001a\u00020\bH\u0016¢\u0006\u0004\bz\u0010\u0004R\u001e\u0010}\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R&\u0010\u0083\u0001\u001a\u0011\u0012\r\u0012\u000b \u0080\u0001*\u0004\u0018\u00010\u007f0\u007f0~8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0086\u0001\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R!\u0010\u008c\u0001\u001a\u00030\u0087\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u00100\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0085\u0001R$\u0010\u0098\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002080\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R$\u0010\u009a\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002080\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0097\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0085\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0085\u0001R\u0019\u0010 \u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u0085\u0001R\u0018\u0010Y\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0019\u0010¤\u0001\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¢\u0001R\u001b\u0010§\u0001\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001a\u0010Z\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010¢\u0001R\u001a\u0010\\\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010¢\u0001R\u001b\u0010«\u0001\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010¢\u0001R\u0019\u0010\u00ad\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u008e\u0001R\u0019\u0010¯\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010\u008e\u0001R\u0019\u0010±\u0001\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010¢\u0001R\u0019\u0010´\u0001\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u001c\u0010·\u0001\u001a\u0005\u0018\u00010µ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010¶\u0001R\u0019\u0010¹\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010\u008e\u0001R \u0010»\u0001\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bº\u0001\u0010|R\u001a\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0019\u0010¿\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010\u0085\u0001R\u001b\u0010Â\u0001\u001a\u00020\u00158\u0006¢\u0006\u000f\n\u0006\bÀ\u0001\u0010\u0085\u0001\u001a\u0005\bÁ\u0001\u0010$¨\u0006Å\u0001"}, m97100d2 = {"Lcom/transsion/shorttv/ui/fragment/download/ShortTVDownloadReFragment;", "Lcom/transsion/shorttv/ui/fragment/download/ShortTvDownloadReBaseFragment;", "Lrs/z;", "<init>", "()V", "Lvs/i;", "loginProvider", "Lkotlin/Function0;", "", "onSuccess", "x1", "(Lvs/i;Lkotlin/jvm/functions/Function0;)V", "J1", "initHistory", "initView", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "F1", "(Landroid/view/View;)V", "D1", "I1", "", RequestParameters.POSITION, "E1", "(I)V", "X0", "V0", "", "onlyEpisodeList", "y1", "(Z)V", "", "totalSize", "H1", "(J)V", "Y0", "()I", "U1", "Lcom/transsion/shorttv/ui/fragment/download/ShortTVDownloadReFragment$a$a;", "L1", "()Lcom/transsion/shorttv/ui/fragment/download/ShortTVDownloadReFragment$a$a;", "state", "V1", "(Lcom/transsion/shorttv/ui/fragment/download/ShortTVDownloadReFragment$a$a;)V", "Lcom/transsion/shorttv/bean/DownloadListBean;", "listBean", "T1", "(Lcom/transsion/shorttv/bean/DownloadListBean;)V", "totalEpisode", "Q0", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "C1", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "R0", "", "Lcom/transsion/shorttv/bean/DownloadItem;", "list", "start", TtmlNode.END, "W1", "(Ljava/util/List;II)V", "W0", "showNotNetError", "S1", "showLoading", "K1", "f1", "()Landroid/view/View;", "e1", "Landroid/content/Context;", "context", "", "desText", "showRightBtn", "b1", "(Landroid/content/Context;Ljava/lang/String;Z)Landroid/view/View;", "a1", "G1", "selectAll", "M1", "O1", "w1", "()Z", "isSelected", "Q1", "P1", "A1", "pageName", "pageFrom", "subjectId", "miniId", "ops", "resourceId", "taskId", "Z0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "X1", "S0", "userId", "Lcom/transsion/shorttv/bean/Subject;", "dotSubject", "dotEp", "U0", "(Ljava/lang/String;Lcom/transsion/shorttv/bean/Subject;I)V", "initViewData", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "h1", "(Landroid/view/LayoutInflater;)Lrs/z;", "getPageStateLayoutTitle", "()Ljava/lang/String;", "isAudioShowNoNetworkLayout", "isMonitorNetworkState", "initViewModel", "initListener", "retryLoadData", TmcConstants.NAVIGATION_ON_START, "onDestroy", "m", "Lkotlin/jvm/functions/Function0;", "loginSuccessCallback", "Landroidx/activity/result/b;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "n", "Landroidx/activity/result/b;", "loginLauncher", "o", "I", "padding", "Lcom/transsion/shorttv/utils/b;", TtmlNode.TAG_P, "Lkotlin/Lazy;", "g1", "()Lcom/transsion/shorttv/utils/b;", "shortTVReporter", CampaignEx.JSON_KEY_AD_Q, "Z", "isContentDataRequested", "Lcom/transsion/shorttv/ui/adapter/ShortTvDownloadEpListAdapter;", CampaignEx.JSON_KEY_AD_R, "Lcom/transsion/shorttv/ui/adapter/ShortTvDownloadEpListAdapter;", "shortTVEpAdapter", "s", "", "t", "Ljava/util/Map;", "episodeResourceMap", TmcStartParams.KEY_URL_SHORT, "inDownloadStatusMap", "v", "startPosition", "w", "endPosition", "x", "curDownloadTabPosition", "y", "Ljava/lang/String;", "z", "lastPageFrom", "A", "Lcom/transsion/shorttv/bean/Subject;", "subject", "B", "C", "D", "moduleName", "E", "scroll2Download", "F", "isSelectAll", "G", "formatSize", "H", "Lcom/transsion/shorttv/ui/fragment/download/ShortTVDownloadReFragment$a$a;", "downloadBtnState", "Lcom/transsion/shorttv/ad/common/STCommonVideoAdHelper;", "Lcom/transsion/shorttv/ad/common/STCommonVideoAdHelper;", "downloadVideoAdHelper", "J", "isRequestingData", "K", "selectAllCallback", "L", "Lcom/transsion/shorttv/bean/DownloadListBean;", "M", "prevSelectedLockedCount", "N", "getAdUnlockEpLimitForDownload", "adUnlockEpLimitForDownload", "O", "a", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public class ShortTVDownloadReFragment extends ShortTvDownloadReBaseFragment<C27372z> {

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private Subject subject;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private String subjectId;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private String ops;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private String moduleName;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean scroll2Download;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean isSelectAll;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private String formatSize;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private Companion.a downloadBtnState;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private STCommonVideoAdHelper downloadVideoAdHelper;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private boolean isRequestingData;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private Function0 selectAllCallback;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private DownloadListBean listBean;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private int prevSelectedLockedCount;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final int adUnlockEpLimitForDownload;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private Function0 loginSuccessCallback;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final AbstractC0249b loginLauncher;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int padding;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final Lazy shortTVReporter;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean isContentDataRequested;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private ShortTvDownloadEpListAdapter shortTVEpAdapter;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private int totalEpisode;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final Map episodeResourceMap;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final Map inDownloadStatusMap;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private int startPosition;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private int endPosition;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private int curDownloadTabPosition;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private String pageFrom;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private String lastPageFrom;

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.download.ShortTVDownloadReFragment$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.download.ShortTVDownloadReFragment$a$a */
        private static abstract class a {

            /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.download.ShortTVDownloadReFragment$a$a$a, reason: collision with other inner class name */
            public static final class C29456a extends a {

                /* JADX INFO: renamed from: a */
                public static final C29456a f61241a = new C29456a();

                private C29456a() {
                    super(null);
                }
            }

            /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.download.ShortTVDownloadReFragment$a$a$b */
            public static final class b extends a {

                /* JADX INFO: renamed from: a */
                public static final b f61242a = new b();

                private b() {
                    super(null);
                }
            }

            /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.download.ShortTVDownloadReFragment$a$a$c */
            public static final class c extends a {

                /* JADX INFO: renamed from: a */
                public static final c f61243a = new c();

                private c() {
                    super(null);
                }
            }

            /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.download.ShortTVDownloadReFragment$a$a$d */
            public static final class d extends a {

                /* JADX INFO: renamed from: a */
                private final boolean f61244a;

                public d(boolean z11) {
                    super(null);
                    this.f61244a = z11;
                }

                /* JADX INFO: renamed from: a */
                public final boolean m80008a() {
                    return this.f61244a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && this.f61244a == ((d) obj).f61244a;
                }

                public int hashCode() {
                    return AbstractC0690e.m3114a(this.f61244a);
                }

                public String toString() {
                    return "WatchAd(unlockAll=" + this.f61244a + ")";
                }
            }

            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ShortTVDownloadReFragment m80007a(String str, String str2, Subject subject, String str3, String str4, boolean z11) {
            ShortTVDownloadReFragment shortTVDownloadReFragment = new ShortTVDownloadReFragment();
            shortTVDownloadReFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a(WebConstants.PAGE_FROM, str), TuplesKt.m97108a("last_page_from", str2), TuplesKt.m97108a("subject", subject), TuplesKt.m97108a("ops", str3), TuplesKt.m97108a("module_name", str4), TuplesKt.m97108a("download_scroll_to_download", Boolean.valueOf(z11))));
            return shortTVDownloadReFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.download.ShortTVDownloadReFragment$b */
    public static final class C19014b implements TabLayout.OnTabSelectedListener {
        C19014b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            ShortTVDownloadReFragment.this.m79915C1(tab);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.download.ShortTVDownloadReFragment$c */
    public static final class C19015c implements InterfaceC3189c0 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC28218i f61247b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Subject f61248c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f61249d;

        C19015c(InterfaceC28218i interfaceC28218i, Subject subject, int i11) {
            this.f61247b = interfaceC28218i;
            this.f61248c = subject;
            this.f61249d = i11;
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Unit unit) {
            C3187b0 c3187b0M80273r;
            Long l11;
            C3187b0 c3187b0M80271p;
            C3187b0 c3187b0M80267j;
            C3187b0 c3187b0M80267j2;
            ShortTVDownloadReFragment.this.m79931K1();
            ShortTvDownloadViewModel shortTvDownloadViewModelM80014h0 = ShortTVDownloadReFragment.this.getViewModel();
            if (shortTvDownloadViewModelM80014h0 != null && (c3187b0M80267j2 = shortTvDownloadViewModelM80014h0.m80267j()) != null) {
                c3187b0M80267j2.mo14856o(this);
            }
            ShortTvDownloadViewModel shortTvDownloadViewModelM80014h1 = ShortTVDownloadReFragment.this.getViewModel();
            Subject subject = null;
            if (shortTvDownloadViewModelM80014h1 != null && (c3187b0M80267j = shortTvDownloadViewModelM80014h1.m80267j()) != null) {
                c3187b0M80267j.mo14858q(null);
            }
            ShortTvDownloadViewModel shortTvDownloadViewModelM80014h2 = ShortTVDownloadReFragment.this.getViewModel();
            if (shortTvDownloadViewModelM80014h2 != null && (c3187b0M80271p = shortTvDownloadViewModelM80014h2.m80271p()) != null) {
                subject = (Subject) c3187b0M80271p.m14847f();
            }
            if (subject == null || subject.getIsPaid() != 1) {
                ShortTVDownloadReFragment.this.m79950U0(this.f61247b.getUserId(), this.f61248c, this.f61249d);
                return;
            }
            ShortTVDownloadReFragment.this.m80013g0().m80356R0(1);
            ShortTVDownloadReFragment.this.m80013g0().m80358S0();
            ShortTVDownloadReFragment.this.m79951U1();
            ShortTVDownloadReFragment shortTVDownloadReFragment = ShortTVDownloadReFragment.this;
            ShortTvDownloadViewModel shortTvDownloadViewModelM80014h3 = shortTVDownloadReFragment.getViewModel();
            shortTVDownloadReFragment.m79911A1((shortTvDownloadViewModelM80014h3 == null || (c3187b0M80273r = shortTvDownloadViewModelM80014h3.m80273r()) == null || (l11 = (Long) c3187b0M80273r.m14847f()) == null) ? 0L : l11.longValue());
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.download.ShortTVDownloadReFragment$d */
    public static final class C19016d implements InterfaceC18853b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Subject f61251b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f61252c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Context f61253d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f61254e;

        C19016d(Subject subject, int i11, Context context, String str) {
            this.f61251b = subject;
            this.f61252c = i11;
            this.f61253d = context;
            this.f61254e = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final Unit m80011d(ShortTVDownloadReFragment shortTVDownloadReFragment, String str, Subject subject, int i11) {
            shortTVDownloadReFragment.m79950U0(str, subject, i11);
            return Unit.f75682a;
        }

        @Override // com.transsion.shorttv.order.InterfaceC18853b
        /* JADX INFO: renamed from: a */
        public void mo79400a(String errorCode, String errorMsg) {
            Intrinsics.m97802h(errorCode, "errorCode");
            Intrinsics.m97802h(errorMsg, "errorMsg");
            InterfaceC18853b.a.m79422a(this, errorCode, errorMsg);
            C26866a.a aVar = C26866a.f81698a;
            String tag = ShortTVDownloadReFragment.this.getTAG();
            Intrinsics.m97801g(tag, "<get-TAG>(...)");
            C26866a.a.m104901l(aVar, tag, "callPayMethod onPayFail, errorCode=" + errorCode + ", errorMsg=" + errorMsg, false, 4, null);
            C28654b.f87887a.m110430j(this.f61251b, this.f61252c, "fail", errorMsg, errorCode, "download");
            ShortTvAlertDialog.Companion companion = ShortTvAlertDialog.INSTANCE;
            String string = this.f61253d.getString(R$string.short_tv_pay_failed_title);
            Intrinsics.m97801g(string, "getString(...)");
            String string2 = this.f61253d.getString(R$string.short_tv_pay_failed_message);
            Intrinsics.m97801g(string2, "getString(...)");
            String string3 = this.f61253d.getString(R$string.short_tv_payment_retry);
            Intrinsics.m97801g(string3, "getString(...)");
            final ShortTVDownloadReFragment shortTVDownloadReFragment = ShortTVDownloadReFragment.this;
            final String str = this.f61254e;
            final Subject subject = this.f61251b;
            final int i11 = this.f61252c;
            companion.m79676a(string, string2, string3, (32 & 8) != 0 ? null : new Function0() { // from class: com.transsion.shorttv.ui.fragment.download.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShortTVDownloadReFragment.C19016d.m80011d(shortTVDownloadReFragment, str, subject, i11);
                }
            }, (32 & 16) != 0 ? null : this.f61253d.getString(R$string.short_tv_payment_cancel), (32 & 32) != 0 ? null : null).mo79034i0(this.f61253d, "ShortTvAlertDialog");
        }

        @Override // com.transsion.shorttv.order.InterfaceC18853b
        /* JADX INFO: renamed from: b */
        public void mo79401b(GetPaynicornOrderStatusRespEntity getPaynicornOrderStatusRespEntity) {
            String description;
            String string;
            C3187b0 c3187b0M80273r;
            Long l11;
            String orderStatus;
            InterfaceC18853b.a.m79423b(this, getPaynicornOrderStatusRespEntity);
            Integer numV = (getPaynicornOrderStatusRespEntity == null || (orderStatus = getPaynicornOrderStatusRespEntity.getOrderStatus()) == null) ? null : StringsKt.m98216v(orderStatus);
            if (numV != null && numV.intValue() == 2) {
                C28654b.f87887a.m110430j(this.f61251b, this.f61252c, NativeComponentConstants.KEY_COMPONENT_RESULT_SUCCESS, "", "0", "download");
                ShortTvDownloadViewModel shortTvDownloadViewModelM80014h0 = ShortTVDownloadReFragment.this.getViewModel();
                if (shortTvDownloadViewModelM80014h0 != null) {
                    shortTvDownloadViewModelM80014h0.m80274s(1);
                }
                ShortTVDownloadReFragment.this.m80013g0().m80356R0(1);
                ShortTVDownloadReFragment.this.m80013g0().m80358S0();
                ShortTVDownloadReFragment.this.m79951U1();
                ShortTVDownloadReFragment shortTVDownloadReFragment = ShortTVDownloadReFragment.this;
                ShortTvDownloadViewModel shortTvDownloadViewModelM80014h1 = shortTVDownloadReFragment.getViewModel();
                shortTVDownloadReFragment.m79911A1((shortTvDownloadViewModelM80014h1 == null || (c3187b0M80273r = shortTvDownloadViewModelM80014h1.m80273r()) == null || (l11 = (Long) c3187b0M80273r.m14847f()) == null) ? 0L : l11.longValue());
                return;
            }
            if (numV != null && numV.intValue() == 3) {
                C28654b.f87887a.m110430j(this.f61251b, this.f61252c, "cancel", "", "0", "download");
                return;
            }
            C28654b c28654b = C28654b.f87887a;
            Subject subject = this.f61251b;
            int i11 = this.f61252c;
            if (getPaynicornOrderStatusRespEntity == null || (description = getPaynicornOrderStatusRespEntity.getDescription()) == null) {
                description = "";
            }
            String str = description;
            if (numV == null || (string = numV.toString()) == null) {
                string = TmcConstants.COLD_OPEN_TYPE;
            }
            c28654b.m110430j(subject, i11, "fail", str, string, "download");
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.download.ShortTVDownloadReFragment$e */
    public static final class C19017e extends RecyclerView.AbstractC4219r {
        C19017e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            C27372z c27372z;
            TabLayout tabLayout;
            TabLayout.Tab tabAt;
            Intrinsics.m97802h(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i11, i12);
            RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            int iFindFirstVisibleItemPosition = ((gridLayoutManager != null ? gridLayoutManager.findFirstVisibleItemPosition() : 0) + 24) / 25;
            if (iFindFirstVisibleItemPosition == ShortTVDownloadReFragment.this.curDownloadTabPosition || (c27372z = (C27372z) ShortTVDownloadReFragment.this.getMViewBinding()) == null || (tabLayout = c27372z.f83391u) == null || (tabAt = tabLayout.getTabAt(iFindFirstVisibleItemPosition)) == null) {
                return;
            }
            tabAt.select();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.download.ShortTVDownloadReFragment$f */
    static final class C19018f implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f61256a;

        C19018f(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f61256a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f61256a;
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
            this.f61256a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.download.ShortTVDownloadReFragment$initHistory$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.shorttv.ui.fragment.download.ShortTVDownloadReFragment$initHistory$1", m97637f = "ShortTVDownloadReFragment.kt", m97638l = {231, 233}, m97639m = "invokeSuspend")
    static final class C190191 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C190191(Continuation<? super C190191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ShortTVDownloadReFragment.this.new C190191(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C190191) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x005c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ShortTVDownloadReFragment shortTVDownloadReFragment;
            ShortTvInnerPlayBean shortTvInnerPlayBean;
            AbstractC24917a2 abstractC24917a2M99269c;
            ShortTVDownloadReFragment$initHistory$1$1$1 shortTVDownloadReFragment$initHistory$1$1$1;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                String str = ShortTVDownloadReFragment.this.subjectId;
                if (str != null) {
                    shortTVDownloadReFragment = ShortTVDownloadReFragment.this;
                    InterfaceC28217h interfaceC28217hM80336A0 = shortTVDownloadReFragment.m80013g0().m80336A0();
                    if (interfaceC28217hM80336A0 != null) {
                        this.L$0 = shortTVDownloadReFragment;
                        this.label = 1;
                        obj = interfaceC28217hM80336A0.mo73653c(str, this);
                        if (obj == objF) {
                            return objF;
                        }
                        shortTvInnerPlayBean = (ShortTvInnerPlayBean) obj;
                    } else {
                        shortTvInnerPlayBean = null;
                    }
                    abstractC24917a2M99269c = C25220y0.m99269c();
                    shortTVDownloadReFragment$initHistory$1$1$1 = new ShortTVDownloadReFragment$initHistory$1$1$1(shortTVDownloadReFragment, shortTvInnerPlayBean, null);
                    this.L$0 = null;
                    this.label = 2;
                    if (AbstractC25088i.m98910g(abstractC24917a2M99269c, shortTVDownloadReFragment$initHistory$1$1$1, this) == objF) {
                        return objF;
                    }
                }
            } else if (i11 == 1) {
                shortTVDownloadReFragment = (ShortTVDownloadReFragment) this.L$0;
                ResultKt.m97107b(obj);
                shortTvInnerPlayBean = (ShortTvInnerPlayBean) obj;
                abstractC24917a2M99269c = C25220y0.m99269c();
                shortTVDownloadReFragment$initHistory$1$1$1 = new ShortTVDownloadReFragment$initHistory$1$1$1(shortTVDownloadReFragment, shortTvInnerPlayBean, null);
                this.L$0 = null;
                this.label = 2;
                if (AbstractC25088i.m98910g(abstractC24917a2M99269c, shortTVDownloadReFragment$initHistory$1$1$1, this) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00de  */
    public ShortTVDownloadReFragment() {
        Object objM112707constructorimpl;
        Integer num;
        int iIntValue;
        Integer numValueOf;
        AbstractC0249b abstractC0249bRegisterForActivityResult = registerForActivityResult(new C23284j(), new InterfaceC0248a() { // from class: com.transsion.shorttv.ui.fragment.download.e
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                ShortTVDownloadReFragment.m80005z1(this.f61265a, (ActivityResult) obj);
            }
        });
        Intrinsics.m97801g(abstractC0249bRegisterForActivityResult, "registerForActivityResult(...)");
        this.loginLauncher = abstractC0249bRegisterForActivityResult;
        this.padding = AbstractC5776a0.m27313a(12.0f);
        this.shortTVReporter = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.ui.fragment.download.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTVDownloadReFragment.m79945R1();
            }
        });
        this.episodeResourceMap = new LinkedHashMap();
        this.inDownloadStatusMap = new LinkedHashMap();
        this.startPosition = 1;
        this.endPosition = 20;
        this.pageFrom = "";
        this.lastPageFrom = "";
        this.formatSize = "";
        this.downloadBtnState = Companion.a.c.f61243a;
        C29238a c29238a = C29238a.f89219a;
        try {
            Result.Companion companion = Result.INSTANCE;
            JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b("ShortTvPlayerUnlockDownloadScene");
            JsonElement jsonElement = jsonObjectM63626b != null ? jsonObjectM63626b.get("adUnlockEpLimitForDownload") : null;
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
                    num = (Integer) (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) == null ? objM112707constructorimpl : null);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 10;
                    }
                    this.adUnlockEpLimitForDownload = iIntValue;
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
        num = (Integer) (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) == null ? objM112707constructorimpl : null);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 10;
        }
        this.adUnlockEpLimitForDownload = iIntValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public final void m79911A1(long totalSize) {
        final ArrayList arrayList;
        ProgressBar progressBar;
        BLFrameLayout bLFrameLayout;
        ProgressBar progressBar2;
        AppCompatTextView appCompatTextView;
        AppCompatImageView appCompatImageView;
        View view;
        C3187b0 c3187b0M80272q;
        Map map;
        DownloadItem downloadItem;
        C3187b0 c3187b0M80271p;
        C3187b0 c3187b0M80271p2;
        Companion.a aVar = this.downloadBtnState;
        int i11 = 0;
        Subject subject = null;
        if (aVar instanceof Companion.a.d) {
            ShortTvDownloadViewModel shortTvDownloadViewModelM80014h0 = getViewModel();
            if (shortTvDownloadViewModelM80014h0 != null && (c3187b0M80271p2 = shortTvDownloadViewModelM80014h0.m80271p()) != null) {
                subject = (Subject) c3187b0M80271p2.m14847f();
            }
            Integer num = (Integer) m80013g0().m80384j0().m14847f();
            C28654b.f87887a.m110425d(subject, num != null ? num.intValue() : 0, "minitv_ad");
            m79957X1();
            return;
        }
        if (aVar instanceof Companion.a.C29456a) {
            ShortTvDownloadViewModel shortTvDownloadViewModelM80014h1 = getViewModel();
            if (shortTvDownloadViewModelM80014h1 != null && (c3187b0M80271p = shortTvDownloadViewModelM80014h1.m80271p()) != null) {
                subject = (Subject) c3187b0M80271p.m14847f();
            }
            Integer num2 = (Integer) m80013g0().m80384j0().m14847f();
            C28654b.f87887a.m110425d(subject, num2 != null ? num2.intValue() : 0, "minitv_pay");
            m79946S0();
            return;
        }
        if (aVar instanceof Companion.a.b) {
            C25427b.f76996a.m99961e(getString(R$string.short_tv_no_unlock_method_available));
            return;
        }
        if (!(aVar instanceof Companion.a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC28213d interfaceC28213dM80392s0 = m80013g0().m80392s0();
        if (interfaceC28213dM80392s0 == null || !interfaceC28213dM80392s0.mo73639e(totalSize)) {
            ArrayList arrayList2 = new ArrayList();
            ShortTvDownloadViewModel shortTvDownloadViewModelM80014h2 = getViewModel();
            if (shortTvDownloadViewModelM80014h2 != null && (c3187b0M80272q = shortTvDownloadViewModelM80014h2.m80272q()) != null && (map = (Map) c3187b0M80272q.m14847f()) != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (this.episodeResourceMap.containsKey(entry.getKey()) && (downloadItem = (DownloadItem) this.episodeResourceMap.get(entry.getKey())) != null) {
                        arrayList2.add(downloadItem);
                    }
                }
            }
            C26866a.a aVar2 = C26866a.f81698a;
            String tag = getTAG();
            Intrinsics.m97801g(tag, "<get-TAG>(...)");
            C26866a.a.m104898f(aVar2, tag, "onDownload ", false, 4, null);
            C27372z c27372z = (C27372z) getMViewBinding();
            if (c27372z != null && (view = c27372z.f83368G) != null) {
                AbstractC23048b.m91694e(view);
            }
            C27372z c27372z2 = (C27372z) getMViewBinding();
            if (c27372z2 != null && (appCompatImageView = c27372z2.f83381k) != null) {
                AbstractC23048b.m91691b(appCompatImageView);
            }
            C27372z c27372z3 = (C27372z) getMViewBinding();
            if (c27372z3 != null && (appCompatTextView = c27372z3.f83393w) != null) {
                AbstractC23048b.m91691b(appCompatTextView);
            }
            C27372z c27372z4 = (C27372z) getMViewBinding();
            if (c27372z4 != null && (progressBar2 = c27372z4.f83387q) != null) {
                AbstractC23048b.m91694e(progressBar2);
            }
            C27372z c27372z5 = (C27372z) getMViewBinding();
            if (c27372z5 != null && (bLFrameLayout = c27372z5.f83377g) != null) {
                AbstractC23048b.m91694e(bLFrameLayout);
            }
            DownloadItem downloadItem2 = null;
            for (Object obj : arrayList2) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                DownloadItem downloadItem3 = (DownloadItem) obj;
                String string = UUID.randomUUID().toString();
                Intrinsics.m97801g(string, "toString(...)");
                downloadItem3.setTaskId(string);
                DownloadItem downloadItem4 = (downloadItem2 == null || downloadItem3.getEp() < downloadItem2.getEp()) ? downloadItem3 : downloadItem2;
                m79960Z0(this.pageFrom, this.lastPageFrom, this.subjectId, downloadItem3.getResourceId(), this.ops, downloadItem3.getResourceId(), string);
                C26866a.f81698a.m104918p("Download", new String[]{"剧集多资源，下载点击，开始下载: subjectId = " + this.subjectId + ",resourceId = " + downloadItem3.getResourceId()}, true);
                i11 = i12;
                downloadItem2 = downloadItem4;
            }
            InterfaceC28213d interfaceC28213dM80392s1 = m80013g0().m80392s0();
            if (interfaceC28213dM80392s1 != null) {
                arrayList = arrayList2;
                interfaceC28213dM80392s1.mo73641g(this.listBean, this.subject, this.ops, this.pageFrom, this.lastPageFrom, arrayList);
            } else {
                arrayList = arrayList2;
            }
            ShortTvDownloadViewModel shortTvDownloadViewModelM80014h3 = getViewModel();
            if (shortTvDownloadViewModelM80014h3 != null) {
                shortTvDownloadViewModelM80014h3.m80277w(this.subjectId, arrayList);
            }
            AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new ShortTVDownloadReFragment$onDownload$3(this, null), 3, null);
            long size = ((long) ((arrayList.size() / 20) * 100)) + 300;
            C27372z c27372z6 = (C27372z) getMViewBinding();
            if (c27372z6 == null || (progressBar = c27372z6.f83387q) == null) {
                return;
            }
            progressBar.postDelayed(new Runnable() { // from class: com.transsion.shorttv.ui.fragment.download.h
                @Override // java.lang.Runnable
                public final void run() {
                    ShortTVDownloadReFragment.m79913B1(this.f61267a, arrayList);
                }
            }, size);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public static final void m79913B1(ShortTVDownloadReFragment shortTVDownloadReFragment, List list) {
        FragmentActivity activity = shortTVDownloadReFragment.getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed() || list.isEmpty()) {
            return;
        }
        InterfaceC28213d interfaceC28213dM80392s0 = shortTVDownloadReFragment.m80013g0().m80392s0();
        if (interfaceC28213dM80392s0 != null) {
            interfaceC28213dM80392s0.mo73642h(activity, (DownloadItem) CollectionsKt.m97359i0(list), list.size(), shortTVDownloadReFragment.formatSize);
        }
        shortTVDownloadReFragment.m80012f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public final void m79915C1(TabLayout.Tab tab) {
        RecyclerView recyclerView;
        if (tab == null || !tab.isSelected()) {
            return;
        }
        this.curDownloadTabPosition = tab.getPosition();
        int position = tab.getPosition() * 25;
        C27372z c27372z = (C27372z) getMViewBinding();
        RecyclerView.AbstractC4214m layoutManager = (c27372z == null || (recyclerView = c27372z.f83389s) == null) ? null : recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            gridLayoutManager.scrollToPositionWithOffset(position, 0);
        }
    }

    /* JADX INFO: renamed from: D1 */
    private final void m79917D1(View view) {
        ShortTVFavInfo shortTVFavInfo;
        if (C24223d.f73737a.m95247a(view.getId(), 500L)) {
            return;
        }
        if (!C27287m.f83003a.m106330e()) {
            C25427b.f76996a.m99960d(R$string.short_tv_no_network_toast);
            return;
        }
        C19159b c19159bM79969g1 = m79969g1();
        String str = this.subjectId;
        Subject subject = this.subject;
        c19159bM79969g1.m80226c(str, "", (subject == null || (shortTVFavInfo = subject.getShortTVFavInfo()) == null) ? false : shortTVFavInfo.getHasFavorite(), "minitv_download");
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h0 = getViewModel();
        if (shortTvDownloadViewModelM80014h0 != null) {
            shortTvDownloadViewModelM80014h0.m80265g(this.subject);
        }
    }

    /* JADX INFO: renamed from: E1 */
    private final void m79919E1(int position) {
        C3187b0 c3187b0M80273r;
        C3187b0 c3187b0M80273r2;
        C3187b0 c3187b0M80273r3;
        Long l11;
        Long size;
        ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter = this.shortTVEpAdapter;
        Intrinsics.m97799e(shortTvDownloadEpListAdapter);
        List data = shortTvDownloadEpListAdapter.getData();
        if (position >= data.size()) {
            return;
        }
        C26718d c26718d = (C26718d) data.get(position);
        if (c26718d.m104504c()) {
            return;
        }
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h0 = getViewModel();
        if (shortTvDownloadViewModelM80014h0 != null) {
            shortTvDownloadViewModelM80014h0.m80276v(c26718d);
        }
        DownloadItem downloadItem = (DownloadItem) this.episodeResourceMap.get(Integer.valueOf(position));
        long jLongValue = 0;
        long jLongValue2 = (downloadItem == null || (size = downloadItem.getSize()) == null) ? 0L : size.longValue();
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h1 = getViewModel();
        if (shortTvDownloadViewModelM80014h1 != null && (c3187b0M80273r3 = shortTvDownloadViewModelM80014h1.m80273r()) != null && (l11 = (Long) c3187b0M80273r3.m14847f()) != null) {
            jLongValue = l11.longValue();
        }
        if (c26718d.m104505d()) {
            c26718d.m104508g(false);
            ShortTvDownloadViewModel shortTvDownloadViewModelM80014h2 = getViewModel();
            if (shortTvDownloadViewModelM80014h2 != null && (c3187b0M80273r2 = shortTvDownloadViewModelM80014h2.m80273r()) != null) {
                c3187b0M80273r2.mo14858q(Long.valueOf(jLongValue - jLongValue2));
            }
        } else {
            c26718d.m104508g(true);
            ShortTvDownloadViewModel shortTvDownloadViewModelM80014h3 = getViewModel();
            if (shortTvDownloadViewModelM80014h3 != null && (c3187b0M80273r = shortTvDownloadViewModelM80014h3.m80273r()) != null) {
                c3187b0M80273r.mo14858q(Long.valueOf(jLongValue + jLongValue2));
            }
        }
        ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter2 = this.shortTVEpAdapter;
        if (shortTvDownloadEpListAdapter2 != null) {
            shortTvDownloadEpListAdapter2.notifyItemChanged(position, c26718d);
        }
    }

    /* JADX INFO: renamed from: F1 */
    private final void m79921F1(View view) {
        if (C24223d.f73737a.m95247a(view.getId(), 500L)) {
            return;
        }
        Navigator navigatorM61773c = TheRouter.m61773c(C27125a.f82236a.m105544b());
        Subject subject = this.subject;
        Navigator.m61845x(navigatorM61773c.m61857K("id", subject != null ? subject.getSubjectId() : null), getContext(), null, 2, null);
        m80012f0();
    }

    /* JADX INFO: renamed from: G1 */
    private final void m79923G1() {
        AppCompatImageView appCompatImageView;
        if (C24223d.f73737a.m95247a(-912345, 1000L)) {
            return;
        }
        if (!m79999w1()) {
            C25427b.f76996a.m99960d(R$string.short_tv_download_no_options_toast);
            return;
        }
        C27372z c27372z = (C27372z) getMViewBinding();
        if (c27372z == null || (appCompatImageView = c27372z.f83382l) == null) {
            return;
        }
        boolean z11 = !appCompatImageView.isSelected();
        this.isSelectAll = z11;
        m79935M1(z11);
    }

    /* JADX INFO: renamed from: H1 */
    private final void m79925H1(long totalSize) {
        String strM27408b;
        if (totalSize > 0) {
            C26866a.a aVar = C26866a.f81698a;
            String tag = getTAG();
            Intrinsics.m97801g(tag, "<get-TAG>(...)");
            C26866a.a.m104908v(aVar, tag, "observe totalSize:" + totalSize, false, 4, null);
            strM27408b = AbstractC5790i.m27408b(totalSize, 1);
            Intrinsics.m97799e(strM27408b);
        } else {
            strM27408b = "";
        }
        this.formatSize = strM27408b;
        m79951U1();
    }

    /* JADX INFO: renamed from: I1 */
    private final void m79927I1(View view) {
        if (C24223d.f73737a.m95247a(view.getId(), 500L)) {
            return;
        }
        C19159b.m80224e(m79969g1(), this.subjectId, null, 2, null);
        InterfaceC28220k interfaceC28220kM80338C0 = m80013g0().m80338C0();
        if (interfaceC28220kM80338C0 != null) {
            String str = this.subjectId;
            Subject subject = this.subject;
            interfaceC28220kM80338C0.mo73718a(this, str, subject != null ? subject.getTitle() : null, this.pageFrom);
        }
    }

    /* JADX INFO: renamed from: J1 */
    private final void m79929J1() {
        BiddingVideoManager.Companion.m63266b(BiddingVideoManager.f49576t, "ShortTvPlayerUnlockDownloadScene", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K1 */
    public final void m79931K1() {
        FrameLayout frameLayout;
        C27372z c27372z = (C27372z) getMViewBinding();
        if (c27372z == null || (frameLayout = c27372z.f83379i) == null) {
            return;
        }
        frameLayout.removeAllViews();
        frameLayout.setVisibility(8);
    }

    /* JADX INFO: renamed from: L1 */
    private final Companion.a m79933L1() {
        C3187b0 c3187b0M80271p;
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h0 = getViewModel();
        Subject subject = (shortTvDownloadViewModelM80014h0 == null || (c3187b0M80271p = shortTvDownloadViewModelM80014h0.m80271p()) == null) ? null : (Subject) c3187b0M80271p.m14847f();
        int iM79958Y0 = m79958Y0();
        if (iM79958Y0 == 0) {
            return Companion.a.c.f61243a;
        }
        List<Integer> unlockType = subject != null ? subject.getUnlockType() : null;
        boolean z11 = unlockType != null && unlockType.contains(1);
        boolean z12 = unlockType != null && unlockType.contains(2);
        if (subject != null && subject.getMiniTvType() == 2) {
            if (z11 || z12) {
                return z11 ? Companion.a.C29456a.f61241a : new Companion.a.d(true);
            }
            return Companion.a.b.f61242a;
        }
        if (!z11 && !z12) {
            return Companion.a.b.f61242a;
        }
        if (iM79958Y0 <= this.adUnlockEpLimitForDownload) {
            if (z12) {
                return new Companion.a.d(false);
            }
            return z11 ? Companion.a.C29456a.f61241a : Companion.a.b.f61242a;
        }
        if (z11) {
            return Companion.a.C29456a.f61241a;
        }
        return z12 ? new Companion.a.d(false) : Companion.a.b.f61242a;
    }

    /* JADX INFO: renamed from: M1 */
    private final void m79935M1(final boolean selectAll) {
        FrameLayout frameLayout;
        C26866a.a aVar = C26866a.f81698a;
        String tag = getTAG();
        Intrinsics.m97801g(tag, "<get-TAG>(...)");
        C26866a.a.m104898f(aVar, tag, "selectAll click, selectAll = " + selectAll + " ", false, 4, null);
        this.isSelectAll = selectAll;
        if (!this.isRequestingData) {
            m79939O1(selectAll);
            return;
        }
        C27372z c27372z = (C27372z) getMViewBinding();
        if (c27372z != null && (frameLayout = c27372z.f83378h) != null) {
            AbstractC23048b.m91694e(frameLayout);
        }
        this.selectAllCallback = new Function0() { // from class: com.transsion.shorttv.ui.fragment.download.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTVDownloadReFragment.m79937N1(this.f61269a, selectAll);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N1 */
    public static final Unit m79937N1(ShortTVDownloadReFragment shortTVDownloadReFragment, boolean z11) {
        shortTVDownloadReFragment.m79939O1(z11);
        shortTVDownloadReFragment.selectAllCallback = null;
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: O1 */
    private final void m79939O1(boolean selectAll) {
        List data;
        ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter = this.shortTVEpAdapter;
        if (((shortTvDownloadEpListAdapter == null || (data = shortTvDownloadEpListAdapter.getData()) == null) ? 0 : data.size()) > 30) {
            m79943Q1(selectAll);
        } else {
            m79941P1(selectAll);
        }
    }

    /* JADX INFO: renamed from: P1 */
    private final void m79941P1(boolean isSelected) {
        C3187b0 c3187b0M80273r;
        C3187b0 c3187b0M80272q;
        List data;
        C26718d c26718d;
        Long size;
        List data2;
        C3187b0 c3187b0M80272q2;
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h0 = getViewModel();
        Map linkedHashMap = (shortTvDownloadViewModelM80014h0 == null || (c3187b0M80272q2 = shortTvDownloadViewModelM80014h0.m80272q()) == null) ? null : (Map) c3187b0M80272q2.m14847f();
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.clear();
        ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter = this.shortTVEpAdapter;
        int size2 = (shortTvDownloadEpListAdapter == null || (data2 = shortTvDownloadEpListAdapter.getData()) == null) ? 0 : data2.size();
        long jLongValue = 0;
        for (int i11 = 0; i11 < size2; i11++) {
            ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter2 = this.shortTVEpAdapter;
            if (shortTvDownloadEpListAdapter2 != null && (data = shortTvDownloadEpListAdapter2.getData()) != null && (c26718d = (C26718d) CollectionsKt.m97362l0(data, i11)) != null && !c26718d.m104504c()) {
                c26718d.m104508g(isSelected);
                if (isSelected) {
                    DownloadItem downloadItem = (DownloadItem) this.episodeResourceMap.get(Integer.valueOf(i11));
                    jLongValue += (downloadItem == null || (size = downloadItem.getSize()) == null) ? 0L : size.longValue();
                    linkedHashMap.put(Integer.valueOf(i11), c26718d);
                } else {
                    linkedHashMap.remove(Integer.valueOf(i11));
                }
            }
        }
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h1 = getViewModel();
        if (shortTvDownloadViewModelM80014h1 != null && (c3187b0M80272q = shortTvDownloadViewModelM80014h1.m80272q()) != null) {
            c3187b0M80272q.mo14858q(linkedHashMap);
        }
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h2 = getViewModel();
        if (shortTvDownloadViewModelM80014h2 != null && (c3187b0M80273r = shortTvDownloadViewModelM80014h2.m80273r()) != null) {
            c3187b0M80273r.mo14858q(Long.valueOf(jLongValue));
        }
        ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter3 = this.shortTVEpAdapter;
        if (shortTvDownloadEpListAdapter3 != null) {
            shortTvDownloadEpListAdapter3.notifyItemRangeChanged(0, size2);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m79942Q0(int totalEpisode) {
        TabLayout tabLayout;
        TabLayout tabLayout2;
        TabLayout tabLayout3;
        int i11 = (totalEpisode + 24) / 25;
        if (i11 <= 1) {
            C27372z c27372z = (C27372z) getMViewBinding();
            if (c27372z == null || (tabLayout3 = c27372z.f83391u) == null) {
                return;
            }
            AbstractC23048b.m91691b(tabLayout3);
            return;
        }
        C27372z c27372z2 = (C27372z) getMViewBinding();
        if (c27372z2 != null && (tabLayout2 = c27372z2.f83391u) != null) {
            tabLayout2.removeAllTabs();
            tabLayout2.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C19014b());
        }
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 * 25;
            int i14 = i13 + 1;
            int iH = RangesKt.m97938h(i13 + 25, totalEpisode);
            C27372z c27372z3 = (C27372z) getMViewBinding();
            if (c27372z3 != null && (tabLayout = c27372z3.f83391u) != null) {
                tabLayout.addTab(tabLayout.newTab().setText(i14 + "-" + iH));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.util.LinkedHashMap] */
    /* JADX INFO: renamed from: Q1 */
    private final void m79943Q1(boolean isSelected) {
        C3187b0 c3187b0M80272q;
        FrameLayout frameLayout;
        C27372z c27372z = (C27372z) getMViewBinding();
        if (c27372z != null && (frameLayout = c27372z.f83378h) != null) {
            AbstractC23048b.m91694e(frameLayout);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h0 = getViewModel();
        T t11 = (shortTvDownloadViewModelM80014h0 == null || (c3187b0M80272q = shortTvDownloadViewModelM80014h0.m80272q()) == null) ? 0 : (Map) c3187b0M80272q.m14847f();
        objectRef.element = t11;
        if (t11 == 0) {
            objectRef.element = new LinkedHashMap();
        }
        ((Map) objectRef.element).clear();
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new ShortTVDownloadReFragment$selectAllWithSizeMoreThan30$1(this, isSelected, objectRef, null), 3, null);
    }

    /* JADX INFO: renamed from: R0 */
    private final void m79944R0(DownloadListBean listBean) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        List<String> tags = listBean.getTags();
        if (tags == null || tags.isEmpty()) {
            C27372z c27372z = (C27372z) getMViewBinding();
            if (c27372z == null || (recyclerView = c27372z.f83390t) == null) {
                return;
            }
            AbstractC23048b.m91691b(recyclerView);
            return;
        }
        List<String> tags2 = listBean.getTags();
        Intrinsics.m97799e(tags2);
        C18952s c18952s = new C18952s(tags2);
        C27372z c27372z2 = (C27372z) getMViewBinding();
        if (c27372z2 == null || (recyclerView2 = c27372z2.f83390t) == null) {
            return;
        }
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView2.getContext());
        flexboxLayoutManager.m44837c0(0);
        flexboxLayoutManager.m44838d0(1);
        flexboxLayoutManager.m44839e0(0);
        recyclerView2.setLayoutManager(flexboxLayoutManager);
        C9902d c9902d = new C9902d(recyclerView2.getContext());
        c9902d.m44968l(3);
        c9902d.m44967i(AbstractC2397b.getDrawable(Utils.m27275a(), R$drawable.short_tv_space_tag_decoration));
        recyclerView2.addItemDecoration(c9902d);
        recyclerView2.setAdapter(c18952s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R1 */
    public static final C19159b m79945R1() {
        return new C19159b();
    }

    /* JADX INFO: renamed from: S0 */
    private final void m79946S0() {
        C3187b0 c3187b0M80271p;
        final InterfaceC28218i interfaceC28218iM80337B0 = m80013g0().m80337B0();
        if (interfaceC28218iM80337B0 == null) {
            return;
        }
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h0 = getViewModel();
        final Subject subject = (shortTvDownloadViewModelM80014h0 == null || (c3187b0M80271p = shortTvDownloadViewModelM80014h0.m80271p()) == null) ? null : (Subject) c3187b0M80271p.m14847f();
        Integer num = (Integer) m80013g0().m80384j0().m14847f();
        final int iIntValue = num != null ? num.intValue() : 0;
        if (interfaceC28218iM80337B0.mo73687a()) {
            m79950U0(interfaceC28218iM80337B0.getUserId(), subject, iIntValue);
        } else {
            m80001x1(interfaceC28218iM80337B0, new Function0() { // from class: com.transsion.shorttv.ui.fragment.download.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShortTVDownloadReFragment.m79948T0(this.f61274a, interfaceC28218iM80337B0, subject, iIntValue);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S1 */
    private final void m79947S1() {
        FrameLayout frameLayout;
        C27372z c27372z = (C27372z) getMViewBinding();
        if (c27372z == null || (frameLayout = c27372z.f83379i) == null) {
            return;
        }
        frameLayout.removeAllViews();
        frameLayout.setVisibility(0);
        frameLayout.addView(m79967e1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final Unit m79948T0(ShortTVDownloadReFragment shortTVDownloadReFragment, InterfaceC28218i interfaceC28218i, Subject subject, int i11) {
        C3187b0 c3187b0M80267j;
        shortTVDownloadReFragment.isContentDataRequested = false;
        ShortTvViewModel shortTvViewModelM80013g0 = shortTVDownloadReFragment.m80013g0();
        String str = shortTVDownloadReFragment.subjectId;
        if (str == null) {
            str = "";
        }
        shortTvViewModelM80013g0.m80348M(str);
        shortTVDownloadReFragment.startPosition = 1;
        shortTVDownloadReFragment.endPosition = 20;
        C19015c c19015c = shortTVDownloadReFragment.new C19015c(interfaceC28218i, subject, i11);
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h0 = shortTVDownloadReFragment.getViewModel();
        if (shortTvDownloadViewModelM80014h0 != null && (c3187b0M80267j = shortTvDownloadViewModelM80014h0.m80267j()) != null) {
            c3187b0M80267j.m14851j(shortTVDownloadReFragment.getViewLifecycleOwner(), c19015c);
        }
        shortTVDownloadReFragment.showLoading();
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h1 = shortTVDownloadReFragment.getViewModel();
        if (shortTvDownloadViewModelM80014h1 != null) {
            String str2 = shortTVDownloadReFragment.subjectId;
            if (str2 == null) {
                str2 = "";
            }
            shortTvDownloadViewModelM80014h1.m80270n(str2, true);
        }
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h2 = shortTVDownloadReFragment.getViewModel();
        if (shortTvDownloadViewModelM80014h2 != null) {
            String str3 = shortTVDownloadReFragment.subjectId;
            shortTvDownloadViewModelM80014h2.m80266i(str3 != null ? str3 : "", shortTVDownloadReFragment.startPosition, shortTVDownloadReFragment.endPosition);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: T1 */
    private final void m79949T1(DownloadListBean listBean) {
        List data;
        String subjectId;
        ShortTvDownloadInfoExtendView shortTvDownloadInfoExtendView;
        BLImageView bLImageView;
        AppCompatTextView appCompatTextView;
        ShapeableImageView shapeableImageView;
        String thumbnail;
        String url;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        this.listBean = listBean;
        if (this.isContentDataRequested) {
            return;
        }
        Integer totalEpisode = listBean.getTotalEpisode();
        if (totalEpisode != null && totalEpisode.intValue() == 0) {
            return;
        }
        this.isContentDataRequested = true;
        C27372z c27372z = (C27372z) getMViewBinding();
        if (c27372z != null && (appCompatTextView3 = c27372z.f83366E) != null) {
            appCompatTextView3.setText(listBean.getSubjectTitle());
        }
        C27372z c27372z2 = (C27372z) getMViewBinding();
        if (c27372z2 != null && (appCompatTextView2 = c27372z2.f83365D) != null) {
            appCompatTextView2.setText(listBean.getSubjectTitle());
        }
        C27372z c27372z3 = (C27372z) getMViewBinding();
        if (c27372z3 != null && (shapeableImageView = c27372z3.f83384n) != null) {
            C23424b.a aVar = C23424b.f71424a;
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            Cover cover = listBean.getCover();
            String str = (cover == null || (url = cover.getUrl()) == null) ? "" : url;
            int i11 = R$color.short_tv_module_04;
            int width = shapeableImageView.getWidth();
            int height = shapeableImageView.getHeight();
            Cover cover2 = listBean.getCover();
            aVar.m93009i(contextRequireContext, shapeableImageView, str, (32448 & 8) != 0 ? R$color.image_skeleton : i11, (32448 & 16) != 0 ? aVar.m93007c() : width, (32448 & 32) != 0 ? aVar.m93006b() : height, (32448 & 64) != 0 ? 0 : 0, (32448 & 128) != 0, (32448 & 256) != 0 ? "" : (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) ? "" : thumbnail, (32448 & 512) != 0, (32448 & 1024) != 0, (32448 & 2048) != 0 ? false : false, (32448 & 4096) != 0 ? false : false, (32448 & 8192) != 0 ? false : false, (32448 & 16384) != 0 ? 25 : 0);
        }
        m79944R0(listBean);
        String genre = listBean.getGenre();
        if (genre != null && genre.length() != 0) {
            StringBuffer stringBuffer = new StringBuffer();
            String releaseDate = listBean.getReleaseDate();
            if (releaseDate != null && releaseDate.length() > 0) {
                Date dateM27346l = AbstractC5780c0.m27346l(listBean.getReleaseDate(), "yyyy-MM-dd");
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(dateM27346l);
                stringBuffer.append(String.valueOf(calendar.get(1)));
            }
            String genre2 = listBean.getGenre();
            if (genre2 != null && genre2.length() > 0) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append(" • ");
                }
                String genre3 = listBean.getGenre();
                stringBuffer.append(genre3 != null ? StringsKt.m98236Q(genre3, "，", " • ", false, 4, null) : null);
            }
            String countryName = listBean.getCountryName();
            if (countryName != null && countryName.length() > 0) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append(" • ");
                }
                stringBuffer.append(listBean.getCountryName());
            }
            C27372z c27372z4 = (C27372z) getMViewBinding();
            if (c27372z4 != null && (appCompatTextView = c27372z4.f83396z) != null) {
                appCompatTextView.setText(stringBuffer);
            }
        }
        C27372z c27372z5 = (C27372z) getMViewBinding();
        if (c27372z5 != null && (bLImageView = c27372z5.f83385o) != null) {
            ShortTVFavInfo shortTVFavInfo = listBean.getShortTVFavInfo();
            bLImageView.setSelected(shortTVFavInfo != null ? shortTVFavInfo.getHasFavorite() : false);
        }
        C27372z c27372z6 = (C27372z) getMViewBinding();
        if (c27372z6 != null && (shortTvDownloadInfoExtendView = c27372z6.f83380j) != null) {
            String description = listBean.getDescription();
            if (description == null) {
                description = "";
            }
            shortTvDownloadInfoExtendView.showData(description);
        }
        Subject subject = this.subject;
        int totalEpisode2 = subject != null ? subject.getTotalEpisode() : 0;
        Integer totalEpisode3 = listBean.getTotalEpisode();
        int iMax = Math.max(totalEpisode2, totalEpisode3 != null ? totalEpisode3.intValue() : 0);
        this.totalEpisode = iMax;
        if (iMax > 0) {
            m79942Q0(iMax);
            int i12 = this.totalEpisode;
            for (int i13 = 0; i13 < i12; i13++) {
                ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter = this.shortTVEpAdapter;
                if (shortTvDownloadEpListAdapter != null && (data = shortTvDownloadEpListAdapter.getData()) != null) {
                    Subject subject2 = this.subject;
                    data.add(new C26718d((subject2 == null || (subjectId = subject2.getSubjectId()) == null) ? "" : subjectId, i13, false, this.inDownloadStatusMap.containsKey(Integer.valueOf(i13)), null, 20, null));
                }
            }
            ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter2 = this.shortTVEpAdapter;
            if (shortTvDownloadEpListAdapter2 != null) {
                shortTvDownloadEpListAdapter2.notifyItemRangeChanged(0, this.totalEpisode);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public final void m79950U0(String userId, Subject dotSubject, int dotEp) {
        C3187b0 c3187b0M80271p;
        Subject subject;
        Context context;
        if (!C27287m.f83003a.m106330e()) {
            C25427b.f76996a.m99961e(Utils.m27275a().getString(R$string.short_tv_no_network_toast));
            return;
        }
        if (userId != null) {
            String str = userId.length() > 0 ? userId : null;
            if (str != null) {
                ShortTvDownloadViewModel shortTvDownloadViewModelM80014h0 = getViewModel();
                if (shortTvDownloadViewModelM80014h0 == null || (c3187b0M80271p = shortTvDownloadViewModelM80014h0.m80271p()) == null || (subject = (Subject) c3187b0M80271p.m14847f()) == null) {
                    return;
                }
                SkuInfo skuInfo = subject.getSkuInfo();
                if (skuInfo == null) {
                    C26866a.a aVar = C26866a.f81698a;
                    String tag = getTAG();
                    Intrinsics.m97801g(tag, "<get-TAG>(...)");
                    C26866a.a.m104901l(aVar, tag, "callPayMethod failed, no sku info.", false, 4, null);
                    return;
                }
                String skuId = skuInfo.getSkuId();
                if (skuId != null) {
                    String str2 = skuId.length() > 0 ? skuId : null;
                    if (str2 != null) {
                        String subjectId = subject.getSubjectId();
                        if (subjectId != null) {
                            String str3 = subjectId.length() > 0 ? subjectId : null;
                            if (str3 == null || (context = getContext()) == null) {
                                return;
                            }
                            C18862d.f60875a.m79440d(context, new CreatePaynicornOrderReqBean("MovieBox", str2, str, null, null, null, MapsKt.m97551f(TuplesKt.m97108a("subject_id", str3)), false, null, Sdk$SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE, null), new C19016d(dotSubject, dotEp, context, str));
                            return;
                        }
                        return;
                    }
                }
                C26866a.a aVar2 = C26866a.f81698a;
                String tag2 = getTAG();
                Intrinsics.m97801g(tag2, "<get-TAG>(...)");
                C26866a.a.m104901l(aVar2, tag2, "callPayMethod failed, skuId is empty.", false, 4, null);
                return;
            }
        }
        C26866a.a aVar3 = C26866a.f81698a;
        String tag3 = getTAG();
        Intrinsics.m97801g(tag3, "<get-TAG>(...)");
        C26866a.a.m104901l(aVar3, tag3, "callPayMethod failed, userId is empty.", false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public final void m79951U1() {
        Companion.a aVarM79933L1 = m79933L1();
        this.downloadBtnState = aVarM79933L1;
        m79953V1(aVarM79933L1);
    }

    /* JADX INFO: renamed from: V0 */
    private final void m79952V0() {
        C3187b0 c3187b0M80271p;
        Subject subject;
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h0 = getViewModel();
        if (shortTvDownloadViewModelM80014h0 == null || (c3187b0M80271p = shortTvDownloadViewModelM80014h0.m80271p()) == null || (subject = (Subject) c3187b0M80271p.m14847f()) == null) {
            return;
        }
        if (!subject.getUnlockType().contains(1)) {
            this.prevSelectedLockedCount = m79958Y0();
            return;
        }
        int iM79958Y0 = m79958Y0();
        if (iM79958Y0 > this.adUnlockEpLimitForDownload && iM79958Y0 > this.prevSelectedLockedCount) {
            C25427b.f76996a.m99961e(getString(R$string.short_tv_download_ad_unlock_limit_reached));
        }
        this.prevSelectedLockedCount = iM79958Y0;
    }

    /* JADX INFO: renamed from: V1 */
    private final void m79953V1(Companion.a state) {
        LinearLayoutCompat linearLayoutCompat;
        AppCompatTextView appCompatTextView;
        AppCompatImageView appCompatImageView;
        AppCompatTextView appCompatTextView2;
        AppCompatImageView appCompatImageView2;
        AppCompatTextView appCompatTextView3;
        AppCompatImageView appCompatImageView3;
        String string;
        AppCompatTextView appCompatTextView4;
        AppCompatImageView appCompatImageView4;
        C27372z c27372z = (C27372z) getMViewBinding();
        if (c27372z == null || (linearLayoutCompat = c27372z.f83374d) == null) {
            return;
        }
        if (state instanceof Companion.a.c) {
            linearLayoutCompat.setBackgroundResource(R$drawable.short_tv_btn_normal);
            C27372z c27372z2 = (C27372z) getMViewBinding();
            if (c27372z2 != null && (appCompatImageView4 = c27372z2.f83381k) != null) {
                appCompatImageView4.setVisibility(8);
            }
            if (this.formatSize.length() > 0) {
                string = getString(R$string.short_tv_download) + " · " + this.formatSize;
            } else {
                string = getString(R$string.short_tv_download);
                Intrinsics.m97799e(string);
            }
            C27372z c27372z3 = (C27372z) getMViewBinding();
            if (c27372z3 == null || (appCompatTextView4 = c27372z3.f83393w) == null) {
                return;
            }
            appCompatTextView4.setText(string);
            return;
        }
        if (state instanceof Companion.a.b) {
            linearLayoutCompat.setBackgroundResource(R$drawable.short_tv_locked_btn_buy_bg);
            C27372z c27372z4 = (C27372z) getMViewBinding();
            if (c27372z4 != null && (appCompatImageView3 = c27372z4.f83381k) != null) {
                appCompatImageView3.setVisibility(8);
            }
            C27372z c27372z5 = (C27372z) getMViewBinding();
            if (c27372z5 == null || (appCompatTextView3 = c27372z5.f83393w) == null) {
                return;
            }
            appCompatTextView3.setText(getString(R$string.short_tv_download));
            return;
        }
        if (state instanceof Companion.a.d) {
            linearLayoutCompat.setBackgroundResource(R$drawable.short_tv_locked_btn_buy_bg);
            C27372z c27372z6 = (C27372z) getMViewBinding();
            if (c27372z6 != null && (appCompatImageView2 = c27372z6.f83381k) != null) {
                appCompatImageView2.setImageResource(R$mipmap.short_tv_ic_lock_watch_ad);
                appCompatImageView2.setVisibility(0);
            }
            C27372z c27372z7 = (C27372z) getMViewBinding();
            if (c27372z7 == null || (appCompatTextView2 = c27372z7.f83393w) == null) {
                return;
            }
            appCompatTextView2.setText(getString(R$string.short_tv_download_watch_ad_to_download));
            return;
        }
        if (!(state instanceof Companion.a.C29456a)) {
            throw new NoWhenBranchMatchedException();
        }
        linearLayoutCompat.setBackgroundResource(R$drawable.short_tv_locked_btn_buy_bg);
        C27372z c27372z8 = (C27372z) getMViewBinding();
        if (c27372z8 != null && (appCompatImageView = c27372z8.f83381k) != null) {
            appCompatImageView.setVisibility(8);
        }
        C27372z c27372z9 = (C27372z) getMViewBinding();
        if (c27372z9 == null || (appCompatTextView = c27372z9.f83393w) == null) {
            return;
        }
        appCompatTextView.setText(getString(R$string.short_tv_download_buy_full_series_to_download));
    }

    /* JADX INFO: renamed from: W0 */
    private final void m79954W0(int end) {
        int i11 = this.totalEpisode;
        if (end >= i11) {
            this.isRequestingData = false;
            Function0 function0 = this.selectAllCallback;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        int i12 = i11 - end;
        if (i12 > 20) {
            this.startPosition = end + 1;
            this.endPosition = end + 20;
        } else {
            int i13 = end + 1;
            this.startPosition = i13;
            this.endPosition = (i13 + i12) - 1;
        }
        m80003y1(true);
    }

    /* JADX INFO: renamed from: W1 */
    private final void m79955W1(List list, int start, int end) {
        HashMap mapM96844g;
        C3187b0 c3187b0M80273r;
        DownloadItem downloadItemMo73640f;
        List data;
        List data2;
        List data3;
        C26718d c26718d;
        C3187b0 c3187b0M80273r2;
        Long l11;
        C26866a.a aVar = C26866a.f81698a;
        String tag = getTAG();
        Intrinsics.m97801g(tag, "<get-TAG>(...)");
        C26866a.a.m104898f(aVar, tag, "updateList ,  size = " + (list != null ? Integer.valueOf(list.size()) : null), false, 4, null);
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            this.isRequestingData = false;
            Function0 function0 = this.selectAllCallback;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h0 = getViewModel();
        long jLongValue = (shortTvDownloadViewModelM80014h0 == null || (c3187b0M80273r2 = shortTvDownloadViewModelM80014h0.m80273r()) == null || (l11 = (Long) c3187b0M80273r2.m14847f()) == null) ? 0L : l11.longValue();
        String tag2 = getTAG();
        Intrinsics.m97801g(tag2, "<get-TAG>(...)");
        C26866a.a.m104898f(aVar, tag2, "before curTotalSize:" + jLongValue, false, 4, null);
        int size = list2.size();
        long jLongValue2 = jLongValue;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = (start + i12) - 1;
            DownloadItem downloadItem = (DownloadItem) list.get(i12);
            InterfaceC28213d interfaceC28213dM80392s0 = m80013g0().m80392s0();
            if (interfaceC28213dM80392s0 != null) {
                String resourceId = downloadItem.getResourceId();
                if (resourceId == null) {
                    resourceId = downloadItem.getUrl();
                }
                downloadItemMo73640f = interfaceC28213dM80392s0.mo73640f(resourceId);
            } else {
                downloadItemMo73640f = null;
            }
            if (this.isSelectAll) {
                if (downloadItemMo73640f != null) {
                    downloadItemMo73640f.setCheck(true);
                }
                downloadItem.setCheck(true);
                Long size2 = downloadItem.getSize();
                jLongValue2 += size2 != null ? size2.longValue() : 0L;
            }
            if (downloadItemMo73640f != null) {
                downloadItemMo73640f.setUploadBy(downloadItem.getUploadBy());
                i11++;
                downloadItemMo73640f.setPosition(i13);
                this.episodeResourceMap.put(Integer.valueOf(i13), downloadItemMo73640f);
                C26866a.a aVar2 = C26866a.f81698a;
                String tag3 = getTAG();
                Intrinsics.m97801g(tag3, "<get-TAG>(...)");
                C26866a.a.m104898f(aVar2, tag3, "in download ep:" + downloadItemMo73640f.getEp() + ", status:" + downloadItemMo73640f.getStatus(), false, 4, null);
            } else {
                downloadItem.setPosition(i13);
                i11++;
                this.episodeResourceMap.put(Integer.valueOf(i13), downloadItem);
            }
            ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter = this.shortTVEpAdapter;
            if (shortTvDownloadEpListAdapter != null && (data3 = shortTvDownloadEpListAdapter.getData()) != null && (c26718d = (C26718d) CollectionsKt.m97362l0(data3, i13)) != null) {
                c26718d.m104507f(downloadItem.getEpisodeItem());
            }
            if (downloadItemMo73640f != null && downloadItemMo73640f.isAvailable()) {
                this.inDownloadStatusMap.put(Integer.valueOf(i13), downloadItemMo73640f);
                C26866a.a aVar3 = C26866a.f81698a;
                String tag4 = getTAG();
                Intrinsics.m97801g(tag4, "<get-TAG>(...)");
                C26866a.a.m104908v(aVar3, tag4, "unable index:" + i13, false, 4, null);
                ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter2 = this.shortTVEpAdapter;
                if (i13 < ((shortTvDownloadEpListAdapter2 == null || (data2 = shortTvDownloadEpListAdapter2.getData()) == null) ? 0 : data2.size())) {
                    ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter3 = this.shortTVEpAdapter;
                    C26718d c26718d2 = (shortTvDownloadEpListAdapter3 == null || (data = shortTvDownloadEpListAdapter3.getData()) == null) ? null : (C26718d) CollectionsKt.m97362l0(data, i13);
                    if (c26718d2 != null) {
                        c26718d2.m104506e(true);
                    }
                }
            }
        }
        ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter4 = this.shortTVEpAdapter;
        if (shortTvDownloadEpListAdapter4 != null) {
            shortTvDownloadEpListAdapter4.notifyItemRangeChanged(start - 1, list.size());
        }
        C26866a.a aVar4 = C26866a.f81698a;
        String tag5 = getTAG();
        Intrinsics.m97801g(tag5, "<get-TAG>(...)");
        C26866a.a.m104908v(aVar4, tag5, "update data curTotalSize:" + jLongValue2, false, 4, null);
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h1 = getViewModel();
        if (shortTvDownloadViewModelM80014h1 != null && (c3187b0M80273r = shortTvDownloadViewModelM80014h1.m80273r()) != null) {
            c3187b0M80273r.mo14858q(Long.valueOf(jLongValue2));
        }
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 != null && (mapM96844g = logViewConfig2.m96844g()) != null) {
            mapM96844g.put("size", String.valueOf(i11));
        }
        m79954W0(end);
    }

    /* JADX INFO: renamed from: X0 */
    private final void m79956X0() {
        AppCompatTextView appCompatTextView;
        AppCompatImageView appCompatImageView;
        List data;
        C3187b0 c3187b0M80272q;
        Map map;
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h0 = getViewModel();
        int size = (shortTvDownloadViewModelM80014h0 == null || (c3187b0M80272q = shortTvDownloadViewModelM80014h0.m80272q()) == null || (map = (Map) c3187b0M80272q.m14847f()) == null) ? 0 : map.size();
        ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter = this.shortTVEpAdapter;
        int size2 = ((shortTvDownloadEpListAdapter == null || (data = shortTvDownloadEpListAdapter.getData()) == null) ? 0 : data.size()) - this.inDownloadStatusMap.size();
        C26866a.a aVar = C26866a.f81698a;
        String tag = getTAG();
        Intrinsics.m97801g(tag, "<get-TAG>(...)");
        C26866a.a.m104898f(aVar, tag, "checkSelectAll, selectedCount: " + size + ", totalSelectable:" + size2, false, 4, null);
        this.isSelectAll = size == size2;
        C27372z c27372z = (C27372z) getMViewBinding();
        if (c27372z != null && (appCompatImageView = c27372z.f83382l) != null) {
            appCompatImageView.setSelected(this.isSelectAll);
        }
        C27372z c27372z2 = (C27372z) getMViewBinding();
        if (c27372z2 == null || (appCompatTextView = c27372z2.f83394x) == null) {
            return;
        }
        appCompatTextView.setVisibility(size > 0 ? 0 : 8);
        appCompatTextView.setText(Utils.m27275a().getString(R$string.short_tv_download_ep_selected_count, String.valueOf(size)));
    }

    /* JADX INFO: renamed from: X1 */
    private final void m79957X1() {
        C3187b0 c3187b0M80271p;
        if (!C27287m.f83003a.m106330e()) {
            C25427b.f76996a.m99961e(Utils.m27275a().getString(R$string.short_tv_no_network_toast));
            return;
        }
        final FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        C27372z c27372z = (C27372z) getMViewBinding();
        Subject subject = null;
        final LinearLayoutCompat linearLayoutCompat = c27372z != null ? c27372z.f83374d : null;
        if (linearLayoutCompat != null) {
            linearLayoutCompat.setEnabled(false);
        }
        STCommonVideoAdHelper sTCommonVideoAdHelper = this.downloadVideoAdHelper;
        if (sTCommonVideoAdHelper != null) {
            STCommonVideoAdHelper.m78937q(sTCommonVideoAdHelper, 0, 1, null);
        }
        this.downloadVideoAdHelper = new STCommonVideoAdHelper("ShortTvPlayerUnlockDownloadScene", AbstractC3226v.m14968a(this));
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h0 = getViewModel();
        if (shortTvDownloadViewModelM80014h0 != null && (c3187b0M80271p = shortTvDownloadViewModelM80014h0.m80271p()) != null) {
            subject = (Subject) c3187b0M80271p.m14847f();
        }
        final Subject subject2 = subject;
        Integer num = (Integer) m80013g0().m80384j0().m14847f();
        final int iIntValue = num != null ? num.intValue() : 0;
        STCommonVideoAdHelper sTCommonVideoAdHelper2 = this.downloadVideoAdHelper;
        if (sTCommonVideoAdHelper2 != null) {
            sTCommonVideoAdHelper2.m78941t(new Function3() { // from class: com.transsion.shorttv.ui.fragment.download.n
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ShortTVDownloadReFragment.m79959Y1(this.f61278a, activity, subject2, iIntValue, linearLayoutCompat, ((Boolean) obj).booleanValue(), (String) obj2, (String) obj3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y0 */
    private final int m79958Y0() {
        C3187b0 c3187b0M80272q;
        Map map;
        C3187b0 c3187b0M80271p;
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h0 = getViewModel();
        Subject subject = (shortTvDownloadViewModelM80014h0 == null || (c3187b0M80271p = shortTvDownloadViewModelM80014h0.m80271p()) == null) ? null : (Subject) c3187b0M80271p.m14847f();
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h1 = getViewModel();
        int i11 = 0;
        if (shortTvDownloadViewModelM80014h1 != null && (c3187b0M80272q = shortTvDownloadViewModelM80014h1.m80272q()) != null && (map = (Map) c3187b0M80272q.m14847f()) != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (C23219b.f70761a.m92280c(subject, ((C26718d) ((Map.Entry) it.next()).getValue()).m104502a())) {
                    i11++;
                }
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public static final Unit m79959Y1(final ShortTVDownloadReFragment shortTVDownloadReFragment, FragmentActivity fragmentActivity, final Subject subject, final int i11, final LinearLayoutCompat linearLayoutCompat, boolean z11, String errorCode, String errorMessage) {
        Intrinsics.m97802h(errorCode, "errorCode");
        Intrinsics.m97802h(errorMessage, "errorMessage");
        if (z11) {
            STCommonVideoAdHelper sTCommonVideoAdHelper = shortTVDownloadReFragment.downloadVideoAdHelper;
            if (sTCommonVideoAdHelper != null) {
                sTCommonVideoAdHelper.m78942u(fragmentActivity, new Function0() { // from class: com.transsion.shorttv.ui.fragment.download.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ShortTVDownloadReFragment.m79961Z1(this.f61283a);
                    }
                }, new Function1() { // from class: com.transsion.shorttv.ui.fragment.download.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTVDownloadReFragment.m79963a2(this.f61284a, linearLayoutCompat, subject, i11, ((Boolean) obj).booleanValue());
                    }
                });
            }
        } else {
            C28654b.f87887a.m110432l(subject, i11, "fail", errorMessage, errorCode, "download");
            C25427b.f76996a.m99960d(R$string.short_tv_ad_unlocked_get_ad_failed);
            shortTVDownloadReFragment.downloadVideoAdHelper = null;
            if (linearLayoutCompat != null) {
                linearLayoutCompat.setEnabled(true);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m79960Z0(String pageName, String pageFrom, String subjectId, String miniId, String ops, String resourceId, String taskId) {
        HashMap map = new HashMap();
        map.put(WebConstants.PAGE_FROM, pageFrom);
        map.put("subject_id", subjectId);
        map.put("mini_id", miniId);
        map.put("ops", ops);
        map.put("resource_id", resourceId);
        map.put("task_id", taskId);
        map.put("module_name", this.moduleName);
        map.put("is_select_all", this.isSelectAll ? "1" : "0");
        C24662i c24662i = C24662i.f75350a;
        if (pageName == null) {
            pageName = "download_click";
        }
        c24662i.m96884s(pageName, "download_click", map);
        Bundle bundle = new Bundle();
        bundle.putString("resource_id", resourceId);
        bundle.putString("subject_id", subjectId);
        InterfaceC28215f interfaceC28215fM80399y0 = m80013g0().m80399y0();
        if (interfaceC28215fM80399y0 != null) {
            interfaceC28215fM80399y0.mo73674b("download_click", bundle, getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public static final Unit m79961Z1(ShortTVDownloadReFragment shortTVDownloadReFragment) {
        C3187b0 c3187b0M80271p;
        Subject subject;
        C3187b0 c3187b0M80272q;
        Map map;
        Collection collectionValues;
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h0;
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h1 = shortTVDownloadReFragment.getViewModel();
        if (shortTvDownloadViewModelM80014h1 == null || (c3187b0M80271p = shortTvDownloadViewModelM80014h1.m80271p()) == null || (subject = (Subject) c3187b0M80271p.m14847f()) == null) {
            return Unit.f75682a;
        }
        Companion.a aVar = shortTVDownloadReFragment.downloadBtnState;
        Companion.a.d dVar = aVar instanceof Companion.a.d ? (Companion.a.d) aVar : null;
        if (dVar != null ? dVar.m80008a() : false) {
            C23219b.f70761a.m92283f(subject);
        } else {
            ShortTvDownloadViewModel shortTvDownloadViewModelM80014h2 = shortTVDownloadReFragment.getViewModel();
            if (shortTvDownloadViewModelM80014h2 != null && (c3187b0M80272q = shortTvDownloadViewModelM80014h2.m80272q()) != null && (map = (Map) c3187b0M80272q.m14847f()) != null && (collectionValues = map.values()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    if (C23219b.f70761a.m92280c(subject, ((C26718d) obj).m104502a())) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ShortTVItem shortTVItemM104502a = ((C26718d) it.next()).m104502a();
                    if (shortTVItemM104502a != null) {
                        arrayList2.add(shortTVItemM104502a);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C23219b.f70761a.m92284g(subject, (ShortTVItem) it2.next(), 1);
                }
            }
        }
        shortTVDownloadReFragment.m80013g0().m80355Q0(subject.getAdUnlockedEps());
        String subjectId = subject.getSubjectId();
        if (subjectId != null && (shortTvDownloadViewModelM80014h0 = shortTVDownloadReFragment.getViewModel()) != null) {
            shortTvDownloadViewModelM80014h0.m80275t(subjectId);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: a1 */
    private final View m79962a1() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(requireContext());
        int i11 = R$layout.short_tv_layout_download_loading;
        C27372z c27372z = (C27372z) getMViewBinding();
        return layoutInflaterFrom.inflate(i11, (ViewGroup) (c27372z != null ? c27372z.f83379i : null), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public static final Unit m79963a2(ShortTVDownloadReFragment shortTVDownloadReFragment, LinearLayoutCompat linearLayoutCompat, Subject subject, int i11, boolean z11) {
        C3187b0 c3187b0M80273r;
        Long l11;
        shortTVDownloadReFragment.downloadVideoAdHelper = null;
        if (linearLayoutCompat != null) {
            linearLayoutCompat.setEnabled(true);
        }
        if (z11) {
            C28654b.f87887a.m110432l(subject, i11, NativeComponentConstants.KEY_COMPONENT_RESULT_SUCCESS, "", "0", "download");
            shortTVDownloadReFragment.m80013g0().m80358S0();
            shortTVDownloadReFragment.m79951U1();
            ShortTvDownloadViewModel shortTvDownloadViewModelM80014h0 = shortTVDownloadReFragment.getViewModel();
            shortTVDownloadReFragment.m79911A1((shortTvDownloadViewModelM80014h0 == null || (c3187b0M80273r = shortTvDownloadViewModelM80014h0.m80273r()) == null || (l11 = (Long) c3187b0M80273r.m14847f()) == null) ? 0L : l11.longValue());
            C25427b.f76996a.m99960d(R$string.short_tv_locked_episode_unlocked);
        } else {
            C28654b.f87887a.m110432l(subject, i11, "cancel", "", "0", "download");
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: b1 */
    private final View m79964b1(Context context, String desText, boolean showRightBtn) {
        final DefaultView defaultView = new DefaultView(context, DefaultView.ModelStyle.MODEL_STYLE_NIGHT);
        defaultView.setStyle(DefaultView.DefaultViewStyle.STYLE_DES_BTN);
        defaultView.setDescText(desText);
        defaultView.setDescTextColor(-1);
        defaultView.setStyle(DefaultView.DefaultViewStyle.STYLE_NO_IMAGE);
        defaultView.setBtnVisibility(showRightBtn ? 0 : 8);
        String string = context.getString(R$string.short_tv_go_to_setting);
        Intrinsics.m97801g(string, "getString(...)");
        defaultView.setBtnText(string);
        defaultView.setTipOperationVisibility(8);
        defaultView.setBtnBg(AbstractC2397b.getDrawable(Utils.m27275a(), R$drawable.short_tv_download_empty_btn_bg));
        defaultView.setBtnTextColor(-1);
        defaultView.setBackgroundColor(0);
        defaultView.setBtnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.fragment.download.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTVDownloadReFragment.m79965c1(view);
            }
        });
        defaultView.setLeftBtnVisibility(0);
        String string2 = context.getString(R$string.short_tv_Retry);
        Intrinsics.m97801g(string2, "getString(...)");
        defaultView.setLeftBtnText(string2);
        defaultView.setLeftBtnBg(AbstractC2397b.getDrawable(Utils.m27275a(), R$drawable.short_tv_download_empty_btn_bg));
        defaultView.setLeftBtnTextColor(-1);
        defaultView.setLeftBtnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.fragment.download.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTVDownloadReFragment.m79966d1(this.f61271a, defaultView, view);
            }
        });
        defaultView.setTitleViewVisibility(8);
        int iM27313a = AbstractC5776a0.m27313a(16.0f);
        defaultView.setPadding(iM27313a, AbstractC5776a0.m27313a(110.0f), iM27313a, 0);
        defaultView.setVisibility(0);
        return defaultView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final void m79965c1(View view) {
        NetworkUtils.m27175v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final void m79966d1(ShortTVDownloadReFragment shortTVDownloadReFragment, DefaultView defaultView, View view) {
        shortTVDownloadReFragment.showLoading();
        if (shortTVDownloadReFragment.startPosition == 1) {
            shortTVDownloadReFragment.m80003y1(false);
        } else {
            shortTVDownloadReFragment.m80003y1(true);
        }
        defaultView.setVisibility(8);
    }

    /* JADX INFO: renamed from: e1 */
    private final View m79967e1() {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        String string = Utils.m27275a().getString(R$string.short_tv_error_load_failed);
        Intrinsics.m97801g(string, "getString(...)");
        return m79964b1(contextRequireContext, string, false);
    }

    /* JADX INFO: renamed from: f1 */
    private final View m79968f1() {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        String string = Utils.m27275a().getString(R$string.short_tv_no_network_title);
        Intrinsics.m97801g(string, "getString(...)");
        return m79964b1(contextRequireContext, string, true);
    }

    /* JADX INFO: renamed from: g1 */
    private final C19159b m79969g1() {
        return (C19159b) this.shortTVReporter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final void m79971i1(ShortTVDownloadReFragment shortTVDownloadReFragment, View view) {
        shortTVDownloadReFragment.m80012f0();
    }

    private final void initHistory() {
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new C190191(null), 3, null);
    }

    private final void initView() {
        C27372z c27372z;
        Group group;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        AppBarLayout appBarLayout;
        AppBarLayout appBarLayout2;
        AppCompatTextView appCompatTextView;
        C27372z c27372z2 = (C27372z) getMViewBinding();
        if (c27372z2 != null && (appCompatTextView = c27372z2.f83365D) != null) {
            Subject subject = this.subject;
            appCompatTextView.setText(subject != null ? subject.getTitle() : null);
        }
        C27372z c27372z3 = (C27372z) getMViewBinding();
        if (c27372z3 != null && (appBarLayout2 = c27372z3.f83372b) != null) {
            appBarLayout2.setExpanded(!this.scroll2Download);
        }
        C27372z c27372z4 = (C27372z) getMViewBinding();
        ViewGroup.LayoutParams layoutParams = (c27372z4 == null || (appBarLayout = c27372z4.f83372b) == null) ? null : appBarLayout.getLayoutParams();
        CoordinatorLayout.C2322f c2322f = layoutParams instanceof CoordinatorLayout.C2322f ? (CoordinatorLayout.C2322f) layoutParams : null;
        AppBarLayout.Behavior behavior = new AppBarLayout.Behavior() { // from class: com.transsion.shorttv.ui.fragment.download.ShortTVDownloadReFragment$initView$behavior$1

            /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.download.ShortTVDownloadReFragment$initView$behavior$1$a */
            public static final class C19020a extends AppBarLayout.Behavior.AbstractC9949a {
                C19020a() {
                }

                @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.AbstractC9948c
                /* JADX INFO: renamed from: a */
                public boolean mo45088a(AppBarLayout appBarLayout) {
                    Intrinsics.m97802h(appBarLayout, "appBarLayout");
                    return true;
                }
            }

            {
                mo45083u0(new C19020a());
            }

            @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2319c
            /* JADX INFO: renamed from: m0 */
            public void mo11396q(CoordinatorLayout coordinatorLayout, AppBarLayout child, View target, int dx2, int dy2, int[] consumed, int type) {
                Intrinsics.m97802h(coordinatorLayout, "coordinatorLayout");
                Intrinsics.m97802h(child, "child");
                Intrinsics.m97802h(target, "target");
                Intrinsics.m97802h(consumed, "consumed");
                if (target instanceof RecyclerView) {
                    if (dy2 > 0 && target.canScrollVertically(1)) {
                        return;
                    }
                    if (dy2 < 0 && target.canScrollVertically(-1)) {
                        return;
                    }
                }
                super.mo11396q(coordinatorLayout, child, target, dx2, dy2, consumed, type);
            }
        };
        if (c2322f != null) {
            c2322f.m11422o(behavior);
        }
        C27372z c27372z5 = (C27372z) getMViewBinding();
        if (c27372z5 != null && (recyclerView2 = c27372z5.f83389s) != null) {
            int i11 = this.padding;
            recyclerView2.setPadding(i11, 0, i11, 0);
            recyclerView2.setLayoutManager(new GridLayoutManager(recyclerView2.getContext(), 5, 1, false));
            recyclerView2.addOnScrollListener(new C19017e());
        }
        ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter = new ShortTvDownloadEpListAdapter();
        shortTvDownloadEpListAdapter.m79539l(new Function1() { // from class: com.transsion.shorttv.ui.fragment.download.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTVDownloadReFragment.m79985p1(this.f61266a, ((Integer) obj).intValue());
            }
        });
        this.shortTVEpAdapter = shortTvDownloadEpListAdapter;
        C27372z c27372z6 = (C27372z) getMViewBinding();
        if (c27372z6 != null && (recyclerView = c27372z6.f83389s) != null) {
            recyclerView.setAdapter(this.shortTVEpAdapter);
        }
        if (!C27124c.f82233a.m105540b().m105524d().mo105532b() || (c27372z = (C27372z) getMViewBinding()) == null || (group = c27372z.f83375e) == null) {
            return;
        }
        AbstractC23048b.m91691b(group);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final void m79973j1(ShortTVDownloadReFragment shortTVDownloadReFragment, View view) {
        Intrinsics.m97799e(view);
        shortTVDownloadReFragment.m79921F1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final void m79975k1(ShortTVDownloadReFragment shortTVDownloadReFragment, View view) {
        Intrinsics.m97799e(view);
        shortTVDownloadReFragment.m79917D1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final void m79977l1(ShortTVDownloadReFragment shortTVDownloadReFragment, View view) {
        Intrinsics.m97799e(view);
        shortTVDownloadReFragment.m79927I1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final void m79979m1(ShortTVDownloadReFragment shortTVDownloadReFragment, View view) {
        shortTVDownloadReFragment.m79923G1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final void m79981n1(ShortTVDownloadReFragment shortTVDownloadReFragment, View view) {
        shortTVDownloadReFragment.m79923G1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final void m79983o1(ShortTVDownloadReFragment shortTVDownloadReFragment, View view) {
        C3187b0 c3187b0M80273r;
        Long l11;
        C3187b0 c3187b0M80272q;
        FrameLayout frameLayout;
        if (C24223d.f73737a.m95247a(view.getId(), 500L)) {
            return;
        }
        if (!C27287m.f83003a.m106330e()) {
            C25427b.f76996a.m99960d(R$string.short_tv_no_network_toast);
            return;
        }
        C27372z c27372z = (C27372z) shortTVDownloadReFragment.getMViewBinding();
        if (c27372z != null && (frameLayout = c27372z.f83378h) != null && frameLayout.getVisibility() == 0) {
            C26866a.f81698a.m104918p("Download", new String[]{"DownloadReDetectorGroupMainFragment --> onDownload() --> 当前正在全选中"}, true);
            return;
        }
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h0 = shortTVDownloadReFragment.getViewModel();
        Map map = (shortTvDownloadViewModelM80014h0 == null || (c3187b0M80272q = shortTvDownloadViewModelM80014h0.m80272q()) == null) ? null : (Map) c3187b0M80272q.m14847f();
        if (map == null || map.isEmpty()) {
            C25427b.f76996a.m99961e(Utils.m27275a().getString(R$string.download_short_tv_unselected_toast));
        } else {
            ShortTvDownloadViewModel shortTvDownloadViewModelM80014h1 = shortTVDownloadReFragment.getViewModel();
            shortTVDownloadReFragment.m79911A1((shortTvDownloadViewModelM80014h1 == null || (c3187b0M80273r = shortTvDownloadViewModelM80014h1.m80273r()) == null || (l11 = (Long) c3187b0M80273r.m14847f()) == null) ? 0L : l11.longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final Unit m79985p1(ShortTVDownloadReFragment shortTVDownloadReFragment, int i11) {
        shortTVDownloadReFragment.m79919E1(i11);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final Unit m79987q1(ShortTVDownloadReFragment shortTVDownloadReFragment, DownloadListBean downloadListBean) {
        List data;
        shortTVDownloadReFragment.m79931K1();
        if (downloadListBean == null) {
            ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter = shortTVDownloadReFragment.shortTVEpAdapter;
            if (shortTvDownloadEpListAdapter != null && (data = shortTvDownloadEpListAdapter.getData()) != null && data.size() == 0) {
                shortTVDownloadReFragment.m79947S1();
            }
            return Unit.f75682a;
        }
        C26866a.a aVar = C26866a.f81698a;
        String tag = shortTVDownloadReFragment.getTAG();
        Intrinsics.m97801g(tag, "<get-TAG>(...)");
        List<DownloadItem> items = downloadListBean.getItems();
        C26866a.a.m104898f(aVar, tag, "get data from  net, size = " + (items != null ? Integer.valueOf(items.size()) : null), false, 4, null);
        Integer totalEpisode = downloadListBean.getTotalEpisode();
        if (totalEpisode != null && totalEpisode.intValue() == 0) {
            Subject subject = shortTVDownloadReFragment.subject;
            downloadListBean.setTotalEpisode(Integer.valueOf(subject != null ? subject.getTotalEpisode() : 0));
        }
        shortTVDownloadReFragment.m79949T1(downloadListBean);
        shortTVDownloadReFragment.m79955W1(downloadListBean.getItems(), downloadListBean.getStartPosition(), downloadListBean.getEndPosition());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public static final Unit m79989r1(ShortTVDownloadReFragment shortTVDownloadReFragment, Subject subject) {
        if (subject != null) {
            shortTVDownloadReFragment.subject = subject;
            ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter = shortTVDownloadReFragment.shortTVEpAdapter;
            if (shortTvDownloadEpListAdapter != null) {
                shortTvDownloadEpListAdapter.m79540m(subject);
            }
            shortTVDownloadReFragment.m79951U1();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final Unit m79991s1(ShortTVDownloadReFragment shortTVDownloadReFragment, Map map) {
        shortTVDownloadReFragment.m79956X0();
        shortTVDownloadReFragment.m79952V0();
        return Unit.f75682a;
    }

    private final void showLoading() {
        FrameLayout frameLayout;
        C27372z c27372z = (C27372z) getMViewBinding();
        if (c27372z == null || (frameLayout = c27372z.f83379i) == null) {
            return;
        }
        frameLayout.removeAllViews();
        frameLayout.setVisibility(0);
        frameLayout.addView(m79962a1());
    }

    private final void showNotNetError() {
        FrameLayout frameLayout;
        C27372z c27372z = (C27372z) getMViewBinding();
        if (c27372z == null || (frameLayout = c27372z.f83379i) == null) {
            return;
        }
        frameLayout.removeAllViews();
        frameLayout.setVisibility(0);
        frameLayout.addView(m79968f1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final Unit m79993t1(ShortTVDownloadReFragment shortTVDownloadReFragment, Long l11) {
        Intrinsics.m97799e(l11);
        shortTVDownloadReFragment.m79925H1(l11.longValue());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public static final Unit m79995u1(Integer num) {
        int i11;
        if (num != null && num.intValue() == 0) {
            i11 = R$string.short_tv_error_load_failed;
        } else {
            i11 = (num != null && num.intValue() == 2) ? R$string.short_tv_favorite_remove_toast : R$string.short_tv_favorite_toast;
        }
        C25427b.f76996a.m99960d(i11);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public static final Unit m79997v1(ShortTVDownloadReFragment shortTVDownloadReFragment, C28673c value) {
        BLImageView bLImageView;
        ShortTVFavInfo shortTVFavInfo;
        Intrinsics.m97802h(value, "value");
        try {
            if (!TextUtils.equals(value.m110505c(), shortTVDownloadReFragment.subjectId)) {
                return Unit.f75682a;
            }
            Subject subject = shortTVDownloadReFragment.subject;
            if (subject != null && (shortTVFavInfo = subject.getShortTVFavInfo()) != null) {
                shortTVFavInfo.setFavoriteNum(value.m110504b());
                shortTVFavInfo.setHasFavorite(value.m110503a());
            }
            C27372z c27372z = (C27372z) shortTVDownloadReFragment.getMViewBinding();
            if (c27372z != null && (bLImageView = c27372z.f83385o) != null) {
                bLImageView.setSelected(value.m110503a());
            }
            return Unit.f75682a;
        } catch (Exception unused) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail", false, 2, null);
        }
    }

    /* JADX INFO: renamed from: w1 */
    private final boolean m79999w1() {
        List data;
        int size = this.inDownloadStatusMap.size();
        ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter = this.shortTVEpAdapter;
        return size < ((shortTvDownloadEpListAdapter == null || (data = shortTvDownloadEpListAdapter.getData()) == null) ? 0 : data.size());
    }

    /* JADX INFO: renamed from: x1 */
    private final void m80001x1(InterfaceC28218i loginProvider, Function0 onSuccess) {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        Intent intentMo73688b = loginProvider.mo73688b(contextRequireContext);
        if (intentMo73688b == null) {
            return;
        }
        this.loginSuccessCallback = onSuccess;
        this.loginLauncher.m999a(intentMo73688b);
    }

    /* JADX INFO: renamed from: y1 */
    private final void m80003y1(boolean onlyEpisodeList) {
        if (!C27287m.f83003a.m106330e()) {
            showNotNetError();
            return;
        }
        C26866a.a aVar = C26866a.f81698a;
        String tag = getTAG();
        Intrinsics.m97801g(tag, "<get-TAG>(...)");
        C26866a.a.m104898f(aVar, tag, "loadData ,  startPosition:" + this.startPosition + ", endPosition:" + this.endPosition, false, 4, null);
        this.isRequestingData = true;
        if (onlyEpisodeList) {
            ShortTvDownloadViewModel shortTvDownloadViewModelM80014h0 = getViewModel();
            if (shortTvDownloadViewModelM80014h0 != null) {
                String str = this.subjectId;
                shortTvDownloadViewModelM80014h0.m80266i(str != null ? str : "", this.startPosition, this.endPosition);
                return;
            }
            return;
        }
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h1 = getViewModel();
        if (shortTvDownloadViewModelM80014h1 != null) {
            String str2 = this.subjectId;
            if (str2 == null) {
                str2 = "";
            }
            ShortTvDownloadViewModel.m80263o(shortTvDownloadViewModelM80014h1, str2, false, 2, null);
        }
        ShortTvDownloadViewModel shortTvDownloadViewModelM80014h2 = getViewModel();
        if (shortTvDownloadViewModelM80014h2 != null) {
            String str3 = this.subjectId;
            shortTvDownloadViewModelM80014h2.m80266i(str3 != null ? str3 : "", this.startPosition, this.endPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public static final void m80005z1(ShortTVDownloadReFragment shortTVDownloadReFragment, ActivityResult activityResult) {
        Function0 function0;
        if (activityResult.getResultCode() == -1 && (function0 = shortTVDownloadReFragment.loginSuccessCallback) != null) {
            function0.invoke();
        }
        shortTVDownloadReFragment.loginSuccessCallback = null;
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public C27372z getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C27372z c27372zM106530c = C27372z.m106530c(inflater);
        Intrinsics.m97801g(c27372zM106530c, "inflate(...)");
        return c27372zM106530c;
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initListener() {
        LinearLayoutCompat linearLayoutCompat;
        AppCompatImageView appCompatImageView;
        AppCompatTextView appCompatTextView;
        BLImageView bLImageView;
        BLImageView bLImageView2;
        BLView bLView;
        ImageView imageView;
        C27372z c27372z = (C27372z) getMViewBinding();
        if (c27372z != null && (imageView = c27372z.f83383m) != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.fragment.download.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShortTVDownloadReFragment.m79971i1(this.f61261a, view);
                }
            });
        }
        C27372z c27372z2 = (C27372z) getMViewBinding();
        if (c27372z2 != null && (bLView = c27372z2.f83369H) != null) {
            bLView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.fragment.download.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShortTVDownloadReFragment.m79973j1(this.f61273a, view);
                }
            });
        }
        C27372z c27372z3 = (C27372z) getMViewBinding();
        if (c27372z3 != null && (bLImageView2 = c27372z3.f83385o) != null) {
            bLImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.fragment.download.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShortTVDownloadReFragment.m79975k1(this.f61288a, view);
                }
            });
        }
        C27372z c27372z4 = (C27372z) getMViewBinding();
        if (c27372z4 != null && (bLImageView = c27372z4.f83386p) != null) {
            bLImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.fragment.download.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShortTVDownloadReFragment.m79977l1(this.f61289a, view);
                }
            });
        }
        C27372z c27372z5 = (C27372z) getMViewBinding();
        if (c27372z5 != null && (appCompatTextView = c27372z5.f83363B) != null) {
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.fragment.download.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShortTVDownloadReFragment.m79979m1(this.f61290a, view);
                }
            });
        }
        C27372z c27372z6 = (C27372z) getMViewBinding();
        if (c27372z6 != null && (appCompatImageView = c27372z6.f83382l) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.fragment.download.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShortTVDownloadReFragment.m79981n1(this.f61291a, view);
                }
            });
        }
        C27372z c27372z7 = (C27372z) getMViewBinding();
        if (c27372z7 == null || (linearLayoutCompat = c27372z7.f83374d) == null) {
            return;
        }
        linearLayoutCompat.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.fragment.download.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTVDownloadReFragment.m79983o1(this.f61292a, view);
            }
        });
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initViewData() {
        initView();
        m79929J1();
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initViewModel() {
        C3187b0 c3187b0M80271p;
        C3187b0 c3187b0M80268l;
        C3187b0 c3187b0M80269m;
        C3187b0 c3187b0M80273r;
        C3187b0 c3187b0M80272q;
        String str = this.subjectId;
        if (str == null || str.length() == 0) {
            C26866a.a aVar = C26866a.f81698a;
            String tag = getTAG();
            Intrinsics.m97801g(tag, "<get-TAG>(...)");
            C26866a.a.m104901l(aVar, tag, "subjectId is null", false, 4, null);
            return;
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            ShortTvDownloadViewModel shortTvDownloadViewModelM80014h0 = getViewModel();
            if (shortTvDownloadViewModelM80014h0 != null && (c3187b0M80272q = shortTvDownloadViewModelM80014h0.m80272q()) != null) {
                c3187b0M80272q.m14851j(parentFragment, new C19018f(new Function1() { // from class: com.transsion.shorttv.ui.fragment.download.v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTVDownloadReFragment.m79991s1(this.f61293a, (Map) obj);
                    }
                }));
            }
            ShortTvDownloadViewModel shortTvDownloadViewModelM80014h1 = getViewModel();
            if (shortTvDownloadViewModelM80014h1 != null && (c3187b0M80273r = shortTvDownloadViewModelM80014h1.m80273r()) != null) {
                c3187b0M80273r.m14851j(parentFragment, new C19018f(new Function1() { // from class: com.transsion.shorttv.ui.fragment.download.w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTVDownloadReFragment.m79993t1(this.f61294a, (Long) obj);
                    }
                }));
            }
            ShortTvDownloadViewModel shortTvDownloadViewModelM80014h2 = getViewModel();
            if (shortTvDownloadViewModelM80014h2 != null && (c3187b0M80269m = shortTvDownloadViewModelM80014h2.m80269m()) != null) {
                c3187b0M80269m.m14851j(parentFragment, new C19018f(new Function1() { // from class: com.transsion.shorttv.ui.fragment.download.x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTVDownloadReFragment.m79995u1((Integer) obj);
                    }
                }));
            }
        }
        InterfaceC3224u viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.m97801g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        Function1 function1 = new Function1() { // from class: com.transsion.shorttv.ui.fragment.download.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTVDownloadReFragment.m79997v1(this.f61262a, (C28673c) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C28673c.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(viewLifecycleOwner, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
        Fragment parentFragment2 = getParentFragment();
        if (parentFragment2 != null && getViewModel() != null) {
            ShortTvDownloadViewModel shortTvDownloadViewModelM80014h3 = getViewModel();
            if (shortTvDownloadViewModelM80014h3 != null && (c3187b0M80268l = shortTvDownloadViewModelM80014h3.m80268l()) != null) {
                c3187b0M80268l.m14851j(parentFragment2, new C19018f(new Function1() { // from class: com.transsion.shorttv.ui.fragment.download.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTVDownloadReFragment.m79987q1(this.f61263a, (DownloadListBean) obj);
                    }
                }));
            }
            ShortTvDownloadViewModel shortTvDownloadViewModelM80014h4 = getViewModel();
            if (shortTvDownloadViewModelM80014h4 != null && (c3187b0M80271p = shortTvDownloadViewModelM80014h4.m80271p()) != null) {
                c3187b0M80271p.m14851j(parentFragment2, new C19018f(new Function1() { // from class: com.transsion.shorttv.ui.fragment.download.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTVDownloadReFragment.m79989r1(this.f61264a, (Subject) obj);
                    }
                }));
            }
        }
        C26866a.a aVar2 = C26866a.f81698a;
        String tag2 = getTAG();
        Intrinsics.m97801g(tag2, "<get-TAG>(...)");
        C26866a.a.m104898f(aVar2, tag2, "initViewModel ,loadData", false, 4, null);
        showLoading();
        m80003y1(false);
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public boolean isMonitorNetworkState() {
        return true;
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        String string;
        String string2;
        String string3;
        HashMap mapM96844g;
        HashMap mapM96844g2;
        HashMap mapM96844g3;
        HashMap mapM96844g4;
        HashMap mapM96844g5;
        String string4;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString(WebConstants.PAGE_FROM)) == null) {
            string = "";
        }
        this.pageFrom = string;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("last_page_from")) == null) {
            string2 = "";
        }
        this.lastPageFrom = string2;
        Bundle arguments3 = getArguments();
        this.subject = (Subject) (arguments3 != null ? arguments3.getSerializable("subject") : null);
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (string3 = arguments4.getString("ops")) == null) {
            string3 = "";
        }
        this.ops = string3;
        Bundle arguments5 = getArguments();
        if (arguments5 != null && (string4 = arguments5.getString("module_name")) != null) {
            str = string4;
        }
        this.moduleName = str;
        Bundle arguments6 = getArguments();
        this.scroll2Download = arguments6 != null ? arguments6.getBoolean("download_scroll_to_download") : false;
        Subject subject = this.subject;
        this.subjectId = subject != null ? subject.getSubjectId() : null;
        C26866a.a aVar = C26866a.f81698a;
        String tag = getTAG();
        Intrinsics.m97801g(tag, "<get-TAG>(...)");
        C26866a.a.m104898f(aVar, tag, "ShortTv download init subjectId:" + this.subjectId, false, 4, null);
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (mapM96844g5 = logViewConfig.m96844g()) != null) {
            mapM96844g5.put(WebConstants.PAGE_FROM, this.pageFrom);
        }
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 != null && (mapM96844g4 = logViewConfig2.m96844g()) != null) {
            mapM96844g4.put("last_page_from", this.lastPageFrom);
        }
        C24655b logViewConfig3 = getLogViewConfig();
        if (logViewConfig3 != null && (mapM96844g3 = logViewConfig3.m96844g()) != null) {
            Subject subject2 = this.subject;
            mapM96844g3.put("subject_id", subject2 != null ? subject2.getSubjectId() : null);
        }
        C24655b logViewConfig4 = getLogViewConfig();
        if (logViewConfig4 != null && (mapM96844g2 = logViewConfig4.m96844g()) != null) {
            mapM96844g2.put("ops", this.ops);
        }
        C24655b logViewConfig5 = getLogViewConfig();
        if (logViewConfig5 != null && (mapM96844g = logViewConfig5.m96844g()) != null) {
            mapM96844g.put(NativeComponentConstants.KEY_COMPONENT_TYPE, "2");
        }
        C19159b.m80223b(m79969g1(), this.subjectId, "dialog_minitv_download", null, 4, null);
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        STCommonVideoAdHelper sTCommonVideoAdHelper = this.downloadVideoAdHelper;
        if (sTCommonVideoAdHelper != null) {
            STCommonVideoAdHelper.m78937q(sTCommonVideoAdHelper, 0, 1, null);
        }
        this.downloadVideoAdHelper = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        initHistory();
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void retryLoadData() {
        List data;
        ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter = this.shortTVEpAdapter;
        if (shortTvDownloadEpListAdapter == null || (data = shortTvDownloadEpListAdapter.getData()) == null || data.size() != 0) {
            return;
        }
        showLoading();
        m80003y1(false);
    }
}
