package com.transsion.home.fragment.tab;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.InterfaceC0248a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.view.AbstractC13772o;
import com.p282tn.lib.view.DefaultView;
import com.p282tn.lib.view.NoNetworkBigView;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.p282tn.lib.widget.R$mipmap;
import com.therouter.TheRouter;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.baseui.util.AbstractC14556b;
import com.transsion.baseui.util.C14557c;
import com.transsion.home.R$id;
import com.transsion.home.adapter.trending.BannerADDataHelper;
import com.transsion.home.adapter.trending.C15007b;
import com.transsion.home.adapter.trending.adapter.SportLiveAdapter;
import com.transsion.home.adapter.trending.provider.C15034e;
import com.transsion.home.bean.AppointSubject;
import com.transsion.home.bean.BannerBean;
import com.transsion.home.bean.BannerData;
import com.transsion.home.bean.CustomData;
import com.transsion.home.bean.LiveListItem;
import com.transsion.home.bean.MainOperateData;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.bean.TrendingRespData;
import com.transsion.home.bean.TrendingRespItem;
import com.transsion.home.bean.TrendingRespItemType;
import com.transsion.home.fragment.home.HomeFragment;
import com.transsion.home.preload.AbstractC15429c;
import com.transsion.home.preload.InterfaceC15427a;
import com.transsion.home.preload.InterfaceC15428b;
import com.transsion.home.viewmodel.HomePreferencesViewModel;
import com.transsion.home.viewmodel.TrendingViewModel;
import com.transsion.home.viewmodel.preload.PreloadTrendingData;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.p285ad.bidding.nativead.BiddingListManager;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.postdetail.R$string;
import com.transsion.startup.pref.consume.AppStartDotState;
import com.transsion.startup.pref.consume.AppStartReport;
import com.transsion.startup.pref.consume.C19582c;
import com.transsion.web.api.WebConstants;
import com.transsion.wrapperad.view.BiddingFloatingIrregularView;
import com.transsion.wrapperad.view.secondfloor.CustomSwipeRefreshLayout;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import hk.C23862a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC25018h1;
import mg.C25831h;
import ng.AbstractC26006c;
import p352dn.InterfaceC22998b;
import p352dn.InterfaceC23002f;
import p362dy.C23057a;
import p382el.InterfaceC23181a;
import p393f.C23282h;
import p415fq.C23420k;
import p550kj.C24655b;
import p552kl.C24690m0;
import p552kl.C24704z;
import p579ll.C25646b;
import p579ll.C25647c;
import p579ll.InterfaceC25645a;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import p765s6.InterfaceC27564b;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p842vl.AbstractC28126h;
import p842vl.C28121c;
import p877wm.C28406e;
import pg.C26866a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m97099d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0016\b\u0007\u0018\u0000 Ê\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002Ë\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u0019\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0005J!\u0010\u001b\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b!\u0010\"J%\u0010&\u001a\u00020\u00062\f\u0010$\u001a\b\u0012\u0004\u0012\u00020 0#2\u0006\u0010%\u001a\u00020\u001eH\u0002¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\u00062\f\u0010(\u001a\b\u0012\u0004\u0012\u00020 0#H\u0002¢\u0006\u0004\b)\u0010*J!\u0010-\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010#2\u0006\u0010+\u001a\u00020 H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u0010\u0005J\u000f\u00103\u001a\u00020/H\u0002¢\u0006\u0004\b3\u00101J\u000f\u00104\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u0010\u0005J\u0017\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0006H\u0002¢\u0006\u0004\b9\u0010\u0005J#\u0010<\u001a\u00020\u00062\b\b\u0002\u0010:\u001a\u00020\n2\b\b\u0002\u0010;\u001a\u000205H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020>H\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\nH\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010G\u001a\u00020\n2\u000e\u0010F\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001dH\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010\u0005J\u000f\u0010J\u001a\u00020\nH\u0002¢\u0006\u0004\bJ\u0010EJ\u000f\u0010K\u001a\u000205H\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0006H\u0002¢\u0006\u0004\bM\u0010\u0005J\u001d\u0010N\u001a\u0002052\f\u0010(\u001a\b\u0012\u0004\u0012\u00020 0\u001dH\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020/H\u0002¢\u0006\u0004\bP\u00101J\u000f\u0010Q\u001a\u00020\u0006H\u0002¢\u0006\u0004\bQ\u0010\u0005J\u000f\u0010R\u001a\u00020\u0006H\u0002¢\u0006\u0004\bR\u0010\u0005J\u000f\u0010S\u001a\u00020\u0006H\u0002¢\u0006\u0004\bS\u0010\u0005J\u000f\u0010T\u001a\u00020\u0006H\u0002¢\u0006\u0004\bT\u0010\u0005J\u000f\u0010U\u001a\u00020\u0006H\u0002¢\u0006\u0004\bU\u0010\u0005J\u0019\u0010X\u001a\u00020\u00062\b\u0010W\u001a\u0004\u0018\u00010VH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\u00022\u0006\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b\\\u0010]J\u0017\u0010`\u001a\u00020\u00062\u0006\u0010_\u001a\u00020^H\u0016¢\u0006\u0004\b`\u0010aJ!\u0010c\u001a\u00020\u00062\u0006\u0010b\u001a\u00020\u00122\b\u0010W\u001a\u0004\u0018\u00010VH\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\u00062\u0006\u0010e\u001a\u00020VH\u0016¢\u0006\u0004\bf\u0010YJ!\u0010g\u001a\u00020\u00062\u0006\u0010b\u001a\u00020\u00122\b\u0010W\u001a\u0004\u0018\u00010VH\u0016¢\u0006\u0004\bg\u0010dJ\u0017\u0010i\u001a\u00020\u00062\u0006\u0010h\u001a\u00020\nH\u0016¢\u0006\u0004\bi\u0010\rJ\u000f\u0010j\u001a\u00020\u0006H\u0016¢\u0006\u0004\bj\u0010\u0005J\u000f\u0010k\u001a\u00020\u0006H\u0016¢\u0006\u0004\bk\u0010\u0005J\r\u0010l\u001a\u00020\u0006¢\u0006\u0004\bl\u0010\u0005J\u000f\u0010m\u001a\u00020\u0006H\u0016¢\u0006\u0004\bm\u0010\u0005J\u000f\u0010n\u001a\u00020\u0006H\u0016¢\u0006\u0004\bn\u0010\u0005J\u000f\u0010o\u001a\u00020\u0006H\u0016¢\u0006\u0004\bo\u0010\u0005J\u000f\u0010q\u001a\u00020pH\u0016¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020\u0006H\u0016¢\u0006\u0004\bs\u0010\u0005J\u000f\u0010t\u001a\u00020\u0006H\u0016¢\u0006\u0004\bt\u0010\u0005J\u000f\u0010u\u001a\u00020/H\u0016¢\u0006\u0004\bu\u00101J\u0011\u0010w\u001a\u0004\u0018\u00010vH\u0016¢\u0006\u0004\bw\u0010xJ\u001f\u0010|\u001a\u00020\u00062\u0006\u0010y\u001a\u0002052\u0006\u0010{\u001a\u00020zH\u0016¢\u0006\u0004\b|\u0010}J\u000f\u0010~\u001a\u00020\u0006H\u0016¢\u0006\u0004\b~\u0010\u0005J\r\u0010\u007f\u001a\u00020\u0006¢\u0006\u0004\b\u007f\u0010\u0005R\u001c\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0019\u0010\u0086\u0001\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0089\u0001\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001a\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R,\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0019\u0010\u009f\u0001\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u0088\u0001R\u001c\u0010£\u0001\u001a\u0005\u0018\u00010 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001b\u0010¥\u0001\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010\u0085\u0001R#\u0010«\u0001\u001a\u0005\u0018\u00010¦\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R!\u0010°\u0001\u001a\u00030¬\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010¨\u0001\u001a\u0006\b®\u0001\u0010¯\u0001R(\u0010´\u0001\u001a\u0011\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010±\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R)\u0010¹\u0001\u001a\u0012\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020/0¶\u0001\u0018\u00010µ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R1\u0010»\u0001\u001a\u001c\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060±\u0001\u0012\u0004\u0012\u00020\u00060±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010³\u0001R\u001b\u0010¾\u0001\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0019\u0010À\u0001\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010\u0088\u0001R\u0019\u0010Â\u0001\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010\u0088\u0001R\u0019\u0010Å\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u0019\u0010Ç\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Ä\u0001R\u0018\u0010É\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010\u009c\u0001¨\u0006Ì\u0001"}, m97100d2 = {"Lcom/transsion/home/fragment/tab/TrendingFragment;", "Lcom/transsion/home/fragment/tab/BaseHomeSubFragment;", "Lkl/z;", "Ldn/f;", "<init>", "()V", "", "M1", "initViewModel", "i1", "", "showProgress", "X1", "(Z)V", "o2", "showEmpty", "Landroid/content/Context;", "context", "Landroid/view/View;", "getEmptyView", "(Landroid/content/Context;)Landroid/view/View;", "t1", "hideProgress", "a2", "Lcom/transsion/home/bean/TrendingRespData;", "baseBean", "isRefresh", "q2", "(Lcom/transsion/home/bean/TrendingRespData;Z)V", "", "Lcom/transsion/home/bean/TrendingRespItem;", "feedsList", "Lcom/transsion/home/bean/OperateItem;", "j2", "(Ljava/util/List;)Ljava/util/List;", "", "newList", WebConstants.FIELD_ITEM, "f1", "(Ljava/util/List;Lcom/transsion/home/bean/TrendingRespItem;)V", "opreateItems", "F1", "(Ljava/util/List;)V", "it", "Lcom/transsion/home/bean/BannerData;", "G1", "(Lcom/transsion/home/bean/OperateItem;)Ljava/util/List;", "", "C1", "()Ljava/lang/String;", "initExposureHelper", "getPageName", "n1", "", RequestParameters.POSITION, "k2", "(I)V", "g1", "hasTopBanner", "retryCount", "p1", "(ZI)V", "", "alpha", "n2", "(F)V", "y1", "()F", "I1", "()Z", "items", "J1", "(Ljava/util/List;)Z", "W1", "H1", "B1", "()I", "i2", "A1", "(Ljava/util/List;)I", "w1", "initAd", "b2", "Z1", "f2", "h1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "E1", "(Landroid/view/LayoutInflater;)Lkl/z;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onViewCreated", "hidden", "onHiddenChanged", "logResume", "p0", "g2", "lazyLoadData", "onDestroyView", "onDestroy", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "onResume", "onPause", "g0", "Landroidx/recyclerview/widget/RecyclerView;", "f0", "()Landroidx/recyclerview/widget/RecyclerView;", "lastAdPosition", "Lcom/transsion/ad/bidding/nativead/BiddingNativeManager;", "wrapperNativeManager", "l0", "(ILcom/transsion/ad/bidding/nativead/BiddingNativeManager;)V", "c0", "l2", "Lll/b;", "g", "Lll/b;", "exposureHelper", "h", "Ljava/lang/String;", "nextPage", "i", "I", "mPerPage", "Lcom/transsion/home/viewmodel/TrendingViewModel;", "j", "Lcom/transsion/home/viewmodel/TrendingViewModel;", "mPostListModel", "Lcom/transsion/home/adapter/trending/b;", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/home/adapter/trending/b;", "mAdapter", "Lll/c;", "l", "Lll/c;", "D1", "()Lll/c;", "setPostListReport", "(Lll/c;)V", "postListReport", "Landroid/os/Handler;", "m", "Landroid/os/Handler;", "mHandler", "n", "mHeaderBgHeight", "Lcom/transsion/home/bean/MainOperateData;", "o", "Lcom/transsion/home/bean/MainOperateData;", "operatingResp", TtmlNode.TAG_P, "mPageName", "Lel/a;", CampaignEx.JSON_KEY_AD_Q, "Lkotlin/Lazy;", "x1", "()Lel/a;", "fissionProvider", "Lcom/transsion/home/viewmodel/HomePreferencesViewModel;", CampaignEx.JSON_KEY_AD_R, "z1", "()Lcom/transsion/home/viewmodel/HomePreferencesViewModel;", "homePreferencesViewModel", "Lkotlin/Function1;", "s", "Lkotlin/jvm/functions/Function1;", "mPermissionCallback", "Landroidx/activity/result/b;", "", "t", "Landroidx/activity/result/b;", "mLauncher", TmcStartParams.KEY_URL_SHORT, "mOnAppointmentClick", "v", "Landroid/view/View;", "mNoNetworkView", "w", "mProgressViewStartOffset", "x", "mProgressViewEndOffset", "y", "Z", "hasAd", "z", "isAdLoadDisabled", "A", "adHandler", "B", "a", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class TrendingFragment extends BaseHomeSubFragment<C24704z> implements InterfaceC23002f {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: C */
    public static final int f53156C = 8;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C25646b exposureHelper;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private TrendingViewModel mPostListModel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private C15007b mAdapter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private C25647c postListReport;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int mHeaderBgHeight;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private volatile MainOperateData operatingResp;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private String mPageName;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private Function1 mPermissionCallback;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private AbstractC0249b mLauncher;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private View mNoNetworkView;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private int mProgressViewStartOffset;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private int mProgressViewEndOffset;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean hasAd;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private boolean isAdLoadDisabled;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String nextPage = "1";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int mPerPage = 12;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final Lazy fissionProvider = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.fragment.tab.d1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TrendingFragment.m68363o1();
        }
    });

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Lazy homePreferencesViewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.fragment.tab.m1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TrendingFragment.m68306K1(this.f53287a);
        }
    });

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final Function1 mOnAppointmentClick = new Function1() { // from class: com.transsion.home.fragment.tab.n1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return TrendingFragment.m68344d2(this.f53291a, (Function1) obj);
        }
    };

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final Handler adHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.TrendingFragment$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final TrendingFragment m68393a(int i11, String str) {
            Bundle bundle = new Bundle();
            bundle.putInt("tab_id", i11);
            bundle.putString(WebConstants.TAB_CODE, str);
            C26866a.f81698a.m104912c("TrendingFragment", "create trending fragment", true);
            TrendingFragment trendingFragment = new TrendingFragment();
            trendingFragment.setArguments(bundle);
            return trendingFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.TrendingFragment$b */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class C15316b extends RecyclerView.AbstractC4219r {
        C15316b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            if (TrendingFragment.this.m68302I1()) {
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                TrendingFragment trendingFragment = TrendingFragment.this;
                trendingFragment.m68362n2(RangesKt.m97937g((iComputeVerticalScrollOffset * 1.0f) / trendingFragment.mHeaderBgHeight, 1.0f));
                if (!TrendingFragment.this.getMIsWhite() && TrendingFragment.this.m68386y1() < 0.7f) {
                    TrendingFragment.this.m68100b0(true);
                } else {
                    if (!TrendingFragment.this.getMIsWhite() || TrendingFragment.this.m68386y1() < 0.7f) {
                        return;
                    }
                    TrendingFragment.this.m68100b0(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.TrendingFragment$c */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class ViewTreeObserverOnPreDrawListenerC15317c implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC15317c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            RecyclerView recyclerView;
            ViewTreeObserver viewTreeObserver;
            C24704z c24704z = (C24704z) TrendingFragment.this.getMViewBinding();
            if (c24704z != null && (recyclerView = c24704z.f75602d) != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            C19582c.f62562a.m81570o(TrendingFragment.this.getActivity());
            return true;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.TrendingFragment$d */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class C15318d implements CustomSwipeRefreshLayout.InterfaceC21262b {
        C15318d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final void m68396d(TrendingFragment trendingFragment) {
            trendingFragment.mo67722c0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public static final void m68397e(TrendingFragment trendingFragment) {
            trendingFragment.mo67722c0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.transsion.wrapperad.view.secondfloor.CustomSwipeRefreshLayout.InterfaceC21262b
        /* JADX INFO: renamed from: a */
        public void mo68398a(String action, float f11, float f12) {
            CustomSwipeRefreshLayout customSwipeRefreshLayout;
            CustomSwipeRefreshLayout customSwipeRefreshLayout2;
            C24704z c24704z;
            CustomSwipeRefreshLayout customSwipeRefreshLayout3;
            CustomSwipeRefreshLayout customSwipeRefreshLayout4;
            CustomSwipeRefreshLayout customSwipeRefreshLayout5;
            CustomSwipeRefreshLayout customSwipeRefreshLayout6;
            C24704z c24704z2;
            CustomSwipeRefreshLayout customSwipeRefreshLayout7;
            Intrinsics.m97802h(action, "action");
            if (Intrinsics.m97797c(action, CustomSwipeRefreshLayout.DOWN)) {
                TrendingFragment trendingFragment = TrendingFragment.this;
                FragmentActivity activity = trendingFragment.getActivity();
                BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
                trendingFragment.hasAd = baseActivity != null ? baseActivity.hasAd() : false;
            }
            if (!TrendingFragment.this.hasAd) {
                if (Intrinsics.m97797c(action, CustomSwipeRefreshLayout.DOWN) && (c24704z2 = (C24704z) TrendingFragment.this.getMViewBinding()) != null && (customSwipeRefreshLayout7 = c24704z2.f75603e) != null) {
                    customSwipeRefreshLayout7.setProgressViewOffset(false, TrendingFragment.this.mHeaderBgHeight, TrendingFragment.this.mHeaderBgHeight + AbstractC5776a0.m27313a(50.0f));
                }
                C24704z c24704z3 = (C24704z) TrendingFragment.this.getMViewBinding();
                if (c24704z3 == null || (customSwipeRefreshLayout6 = c24704z3.f75603e) == null) {
                    return;
                }
                customSwipeRefreshLayout6.setCurrentState(CustomSwipeRefreshLayout.IDLE);
                return;
            }
            FragmentActivity activity2 = TrendingFragment.this.getActivity();
            BaseActivity baseActivity2 = activity2 instanceof BaseActivity ? (BaseActivity) activity2 : null;
            if (baseActivity2 != null) {
                baseActivity2.onAction(action, f11, f12);
            }
            int iHashCode = action.hashCode();
            if (iHashCode == -1435393951) {
                if (action.equals(CustomSwipeRefreshLayout.SECOND_FLOOR)) {
                    C24704z c24704z4 = (C24704z) TrendingFragment.this.getMViewBinding();
                    if (c24704z4 != null && (customSwipeRefreshLayout2 = c24704z4.f75603e) != null) {
                        customSwipeRefreshLayout2.setRefreshing(true);
                    }
                    C24704z c24704z5 = (C24704z) TrendingFragment.this.getMViewBinding();
                    if (c24704z5 == null || (customSwipeRefreshLayout = c24704z5.f75603e) == null) {
                        return;
                    }
                    final TrendingFragment trendingFragment2 = TrendingFragment.this;
                    customSwipeRefreshLayout.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.tab.v1
                        @Override // java.lang.Runnable
                        public final void run() {
                            TrendingFragment.C15318d.m68397e(trendingFragment2);
                        }
                    }, 300L);
                    return;
                }
                return;
            }
            if (iHashCode == 2715) {
                action.equals(CustomSwipeRefreshLayout.f66441UP);
                return;
            }
            if (iHashCode == 2104482) {
                if (!action.equals(CustomSwipeRefreshLayout.DOWN) || (c24704z = (C24704z) TrendingFragment.this.getMViewBinding()) == null || (customSwipeRefreshLayout3 = c24704z.f75603e) == null) {
                    return;
                }
                customSwipeRefreshLayout3.setProgressViewOffset(false, -600, -600);
                return;
            }
            if (iHashCode == 1803427515 && action.equals(CustomSwipeRefreshLayout.REFRESH)) {
                C24704z c24704z6 = (C24704z) TrendingFragment.this.getMViewBinding();
                if (c24704z6 != null && (customSwipeRefreshLayout5 = c24704z6.f75603e) != null) {
                    customSwipeRefreshLayout5.setRefreshing(true);
                }
                C24704z c24704z7 = (C24704z) TrendingFragment.this.getMViewBinding();
                if (c24704z7 == null || (customSwipeRefreshLayout4 = c24704z7.f75603e) == null) {
                    return;
                }
                final TrendingFragment trendingFragment3 = TrendingFragment.this;
                customSwipeRefreshLayout4.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.tab.u1
                    @Override // java.lang.Runnable
                    public final void run() {
                        TrendingFragment.C15318d.m68396d(trendingFragment3);
                    }
                }, 300L);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.TrendingFragment$e */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class C15319e implements InterfaceC25645a {
        C15319e() {
        }

        @Override // p579ll.InterfaceC25645a
        /* JADX INFO: renamed from: a */
        public void mo67486a(int i11, long j11, View view) {
            List<BannerData> banners;
            C3187b0 c3187b0M69061W;
            List<BannerData> items;
            try {
                C15007b c15007b = TrendingFragment.this.mAdapter;
                C15007b c15007b2 = null;
                if (c15007b == null) {
                    Intrinsics.m97819y("mAdapter");
                    c15007b = null;
                }
                OperateItem operateItem = (OperateItem) c15007b.getData().get(i11);
                TrendingFragment.this.m68357k2(i11);
                String type = operateItem.getType();
                if (Intrinsics.m97797c(type, PostItemType.OP_SUBJECTS_MOVIE.getValue())) {
                    List<AppointSubject> subjects = operateItem.getSubjects();
                    if (subjects != null) {
                        C28121c.f86299a.m109229s(operateItem, operateItem.getType() + "_Full", subjects, j11, i11);
                        return;
                    }
                    return;
                }
                if (Intrinsics.m97797c(type, PostItemType.CUSTOM_DATA.getValue())) {
                    CustomData customData = operateItem.getCustomData();
                    if (customData == null || (items = customData.getItems()) == null) {
                        return;
                    }
                    C28121c.f86299a.m109213b(operateItem, operateItem.getType() + "_Full", items, j11, i11);
                    return;
                }
                if (!Intrinsics.m97797c(type, PostItemType.HORIZONTAL_BANNER.getValue()) && !Intrinsics.m97797c(type, PostItemType.BANNER.getValue())) {
                    if (Intrinsics.m97797c(type, PostItemType.SPORT_LIVE.getValue())) {
                        List<LiveListItem> liveList = operateItem.getLiveList();
                        if (liveList != null) {
                            C28121c.f86299a.m109230t(operateItem, operateItem.getType() + "_Full", liveList, j11, i11);
                            return;
                        }
                        return;
                    }
                    if (Intrinsics.m97797c(type, PostItemType.ROOM.getValue())) {
                        TrendingViewModel trendingViewModel = TrendingFragment.this.mPostListModel;
                        if (trendingViewModel == null || (c3187b0M69061W = trendingViewModel.m69061W()) == null) {
                            return;
                        }
                        return;
                    }
                    if (Intrinsics.m97797c(type, PostItemType.SINGLE_IMAGE.getValue())) {
                        C28121c.f86299a.m109215e(i11, j11, operateItem);
                        return;
                    }
                    C25647c postListReport = TrendingFragment.this.getPostListReport();
                    if (postListReport != null) {
                        C15007b c15007b3 = TrendingFragment.this.mAdapter;
                        if (c15007b3 == null) {
                            Intrinsics.m97819y("mAdapter");
                        } else {
                            c15007b2 = c15007b3;
                        }
                        postListReport.m100947a(c15007b2, i11, j11);
                        return;
                    }
                    return;
                }
                BannerBean banner = operateItem.getBanner();
                if (banner == null || (banners = banner.getBanners()) == null) {
                    return;
                }
                C28121c.f86299a.m109213b(operateItem, operateItem.getType() + "_Full", banners, j11, i11);
            } catch (Exception e11) {
                String message = e11.getMessage();
                if (message != null) {
                    C26866a.a.m104898f(C26866a.f81698a, "reportExposure", message, false, 4, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.TrendingFragment$f */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class C15320f extends DiffUtil.AbstractC4174e {
        C15320f() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(OperateItem oldItem, OperateItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            Subject feedsSubject = oldItem.getFeedsSubject();
            String strValueOf = String.valueOf(feedsSubject != null ? feedsSubject.getSubjectId() : null);
            Subject feedsSubject2 = newItem.getFeedsSubject();
            return Intrinsics.m97797c(strValueOf, String.valueOf(feedsSubject2 != null ? feedsSubject2.getSubjectId() : null));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(OperateItem oldItem, OperateItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getType(), newItem.getType());
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.TrendingFragment$g */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class C15321g extends GridLayoutManager.AbstractC4187c {

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f53183f;

        C15321g(int i11) {
            this.f53183f = i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC4187c
        /* JADX INFO: renamed from: f */
        public int mo20742f(int i11) {
            C15007b c15007b = TrendingFragment.this.mAdapter;
            C15007b c15007b2 = null;
            if (c15007b == null) {
                Intrinsics.m97819y("mAdapter");
                c15007b = null;
            }
            if (!c15007b.getIsGridTrendingAdapter()) {
                return this.f53183f;
            }
            C15007b c15007b3 = TrendingFragment.this.mAdapter;
            if (c15007b3 == null) {
                Intrinsics.m97819y("mAdapter");
            } else {
                c15007b2 = c15007b3;
            }
            if (Intrinsics.m97797c(((OperateItem) c15007b2.getItem(i11)).getType(), PostItemType.SUBJECT.getValue())) {
                return 1;
            }
            return this.f53183f;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.TrendingFragment$h */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class C15322h implements InterfaceC27288n {
        C15322h() {
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected() {
            InterfaceC27288n.a.m106338a(this);
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
            Intrinsics.m97802h(network, "network");
            Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
            TrendingFragment.this.m68353i2();
            if (TrendingFragment.this.isResumed()) {
                C15007b c15007b = TrendingFragment.this.mAdapter;
                if (c15007b == null) {
                    Intrinsics.m97819y("mAdapter");
                    c15007b = null;
                }
                if (c15007b.getData().isEmpty() || PreloadTrendingData.f53717n.m69164a().m69156K().m14847f() == null) {
                    C26866a.a.m104898f(C26866a.f81698a, "TrendingFragment", "onConnected", false, 4, null);
                    TrendingFragment.this.m68332X1(false);
                }
            }
        }

        @Override // p743rh.InterfaceC27288n
        public void onDisconnected() {
            TrendingFragment.this.m68330W1();
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.TrendingFragment$i */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class ViewTreeObserverOnPreDrawListenerC15323i implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC15323i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            RecyclerView recyclerView;
            ViewTreeObserver viewTreeObserver;
            Unit unit;
            TrendingFragment trendingFragment = TrendingFragment.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                FragmentActivity activity = trendingFragment.getActivity();
                if (activity != null) {
                    activity.reportFullyDrawn();
                    unit = Unit.f75682a;
                } else {
                    unit = null;
                }
                Result.m112707constructorimpl(unit);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            C24704z c24704z = (C24704z) TrendingFragment.this.getMViewBinding();
            if (c24704z == null || (recyclerView = c24704z.f75602d) == null || (viewTreeObserver = recyclerView.getViewTreeObserver()) == null) {
                return true;
            }
            viewTreeObserver.removeOnPreDrawListener(this);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.TrendingFragment$initViewModel$2 */
    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.home.fragment.tab.TrendingFragment$initViewModel$2", m97637f = "TrendingFragment.kt", m97638l = {453}, m97639m = "invokeSuspend")
    static final class C153242 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.transsion.home.fragment.tab.TrendingFragment$initViewModel$2$1, reason: invalid class name */
        @Metadata(m97099d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m97100d2 = {"<anonymous>", "", "it", ""}, m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        @DebugMetadata(m97636c = "com.transsion.home.fragment.tab.TrendingFragment$initViewModel$2$1", m97637f = "TrendingFragment.kt", m97638l = {}, m97639m = "invokeSuspend")
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ TrendingFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TrendingFragment trendingFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = trendingFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.f75682a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C3187b0 c3187b0M69060V;
                IntrinsicsKt.m97630f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
                boolean z11 = this.Z$0;
                TrendingViewModel trendingViewModel = this.this$0.mPostListModel;
                if (trendingViewModel != null && (c3187b0M69060V = trendingViewModel.m69060V()) != null) {
                    c3187b0M69060V.mo14855n(Boxing.m97631a(z11));
                }
                return Unit.f75682a;
            }
        }

        C153242(Continuation<? super C153242> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TrendingFragment.this.new C153242(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C153242) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC25018h1 interfaceC25018h1Mo69847a;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
                if (interfaceC22998b != null && (interfaceC25018h1Mo69847a = interfaceC22998b.mo69847a()) != null) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(TrendingFragment.this, null);
                    this.label = 1;
                    if (AbstractC25001c.m98789h(interfaceC25018h1Mo69847a, anonymousClass1, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.TrendingFragment$j */
    /* JADX INFO: loaded from: classes5.dex */
    static final class C15325j implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f53186a;

        C15325j(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f53186a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f53186a;
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
            this.f53186a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: A1 */
    private final int m68288A1(List opreateItems) {
        int i11 = 0;
        for (Object obj : opreateItems) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            if (Intrinsics.m97797c(((OperateItem) obj).getType(), PostItemType.BANNER.getValue())) {
                return i12;
            }
            i11 = i12;
        }
        return 0;
    }

    /* JADX INFO: renamed from: B1 */
    private final int m68290B1() {
        C15007b c15007b = this.mAdapter;
        if (c15007b == null) {
            Intrinsics.m97819y("mAdapter");
            c15007b = null;
        }
        int i11 = 0;
        for (Object obj : c15007b.getData()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            if (Intrinsics.m97797c(((OperateItem) obj).getType(), PostItemType.NO_NETWORK.getValue())) {
                return i11;
            }
            i11 = i12;
        }
        return -1;
    }

    /* JADX INFO: renamed from: C1 */
    private final String m68292C1() {
        String str;
        if (this.mPageName == null) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment instanceof HomeFragment) {
                this.mPageName = ((HomeFragment) parentFragment).m67935J0();
            }
        }
        return (TextUtils.isEmpty(this.mPageName) || (str = this.mPageName) == null) ? "Trending" : str;
    }

    /* JADX INFO: renamed from: F1 */
    private final void m68296F1(List opreateItems) {
        Integer groupPos;
        Integer groupPos2;
        Integer groupPos3;
        int iM68288A1;
        HashMap mapM96844g;
        List<OperateItem> items;
        List<OperateItem> listI0;
        ArrayList arrayList;
        MainOperateData mainOperateData = this.operatingResp;
        if (mainOperateData != null && (items = mainOperateData.getItems()) != null && (listI0 = CollectionsKt.m97331I0(items, new Comparator() { // from class: com.transsion.home.fragment.tab.TrendingFragment$handleOpList$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return ComparisonsKt.m97603d(((OperateItem) t11).getPosition(), ((OperateItem) t12).getPosition());
            }
        })) != null) {
            for (OperateItem operateItem : listI0) {
                String type = operateItem.getType();
                if (Intrinsics.m97797c(type, PostItemType.BANNER.getValue())) {
                    BannerBean banner = operateItem.getBanner();
                    List<BannerData> banners = banner != null ? banner.getBanners() : null;
                    if (banners != null && !banners.isEmpty()) {
                        BannerBean banner2 = operateItem.getBanner();
                        if (banner2 != null) {
                            banner2.setBanners(m68298G1(operateItem));
                        }
                    }
                }
                if (Intrinsics.m97797c(type, PostItemType.SPORT_LIVE.getValue())) {
                    List<LiveListItem> liveList = operateItem.getLiveList();
                    if (liveList != null) {
                        arrayList = new ArrayList();
                        for (Object obj : liveList) {
                            if (!Intrinsics.m97797c(((LiveListItem) obj).getStatus(), SportLiveAdapter.f52431P)) {
                                arrayList.add(obj);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                    }
                }
                C15007b c15007b = this.mAdapter;
                if (c15007b == null) {
                    Intrinsics.m97819y("mAdapter");
                    c15007b = null;
                }
                Set<String> setKeySet = c15007b.m67213S1().keySet();
                Intrinsics.m97801g(setKeySet, "<get-keys>(...)");
                if (CollectionsKt.m97352b0(setKeySet, type)) {
                    List<AppointSubject> subjects = operateItem.getSubjects();
                    if (subjects != null) {
                        int size = subjects.size();
                        if (!Intrinsics.m97797c(type, PostItemType.OP_SUBJECTS_MOVIE.getValue()) || size >= 3) {
                        }
                    }
                    opreateItems.add(operateItem);
                }
            }
        }
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
            MainOperateData mainOperateData2 = this.operatingResp;
        }
        if (!C27287m.f83003a.m106330e() && (iM68288A1 = m68288A1(opreateItems)) >= 0 && iM68288A1 < opreateItems.size()) {
            opreateItems.add(iM68288A1, new OperateItem(null, PostItemType.NO_NETWORK.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741821, null));
        }
        opreateItems.add(new OperateItem(getString(R$string.short_tv_most_trending), PostItemType.FEEDS_TITLE.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741820, null));
        MainOperateData mainOperateData3 = this.operatingResp;
        if (((mainOperateData3 == null || (groupPos3 = mainOperateData3.getGroupPos()) == null) ? 0 : groupPos3.intValue()) > 0) {
            C23420k.f71413a.m92983m(true);
            MainOperateData mainOperateData4 = this.operatingResp;
            int iIntValue = (mainOperateData4 == null || (groupPos2 = mainOperateData4.getGroupPos()) == null) ? 0 : groupPos2.intValue();
            if (iIntValue >= opreateItems.size()) {
                opreateItems.add(new OperateItem(null, PostItemType.ROOM.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741821, null));
            } else {
                opreateItems.add(iIntValue, new OperateItem(null, PostItemType.ROOM.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741821, null));
            }
        }
        C23420k c23420k = C23420k.f71413a;
        MainOperateData mainOperateData5 = this.operatingResp;
        c23420k.m92983m(((mainOperateData5 == null || (groupPos = mainOperateData5.getGroupPos()) == null) ? 0 : groupPos.intValue()) > 0);
        HomePreferencesUiHelperKt.m68116f(getMTabCode(), m68388z1(), opreateItems);
    }

    /* JADX INFO: renamed from: G1 */
    private final List m68298G1(OperateItem it) {
        List<BannerData> banners;
        BannerBean banner = it.getBanner();
        if (banner != null) {
            banner.setRefreshAd(true);
        }
        BannerBean banner2 = it.getBanner();
        if (banner2 == null || (banners = banner2.getBanners()) == null) {
            return null;
        }
        return CollectionsKt.m97343U0(banners);
    }

    /* JADX INFO: renamed from: H1 */
    private final boolean m68300H1() {
        C15007b c15007b = this.mAdapter;
        if (c15007b == null) {
            Intrinsics.m97819y("mAdapter");
            c15007b = null;
        }
        Iterator<T> it = c15007b.getData().iterator();
        while (it.hasNext()) {
            if (Intrinsics.m97797c(((OperateItem) it.next()).getType(), PostItemType.NO_NETWORK.getValue())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public final boolean m68302I1() {
        C15007b c15007b = this.mAdapter;
        C15007b c15007b2 = null;
        if (c15007b == null) {
            Intrinsics.m97819y("mAdapter");
            c15007b = null;
        }
        if (c15007b.getData().size() <= 0) {
            return false;
        }
        C15007b c15007b3 = this.mAdapter;
        if (c15007b3 == null) {
            Intrinsics.m97819y("mAdapter");
        } else {
            c15007b2 = c15007b3;
        }
        return Intrinsics.m97797c(((OperateItem) c15007b2.getData().get(0)).getType(), PostItemType.BANNER.getValue());
    }

    /* JADX INFO: renamed from: J1 */
    private final boolean m68304J1(List items) {
        OperateItem operateItem;
        return Intrinsics.m97797c((items == null || (operateItem = (OperateItem) CollectionsKt.m97361k0(items)) == null) ? null : operateItem.getType(), PostItemType.BANNER.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K1 */
    public static final HomePreferencesViewModel m68306K1(TrendingFragment trendingFragment) {
        Fragment fragmentRequireParentFragment = trendingFragment.requireParentFragment();
        Intrinsics.m97801g(fragmentRequireParentFragment, "requireParentFragment(...)");
        return (HomePreferencesViewModel) new C3227v0(fragmentRequireParentFragment).m14969a(HomePreferencesViewModel.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L1 */
    public static final void m68308L1(TrendingFragment trendingFragment) {
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        CustomSwipeRefreshLayout customSwipeRefreshLayout2;
        C24704z c24704z = (C24704z) trendingFragment.getMViewBinding();
        int progressViewEndOffset = 0;
        trendingFragment.mProgressViewStartOffset = (c24704z == null || (customSwipeRefreshLayout2 = c24704z.f75603e) == null) ? 0 : customSwipeRefreshLayout2.getProgressViewStartOffset();
        C24704z c24704z2 = (C24704z) trendingFragment.getMViewBinding();
        if (c24704z2 != null && (customSwipeRefreshLayout = c24704z2.f75603e) != null) {
            progressViewEndOffset = customSwipeRefreshLayout.getProgressViewEndOffset();
        }
        trendingFragment.mProgressViewEndOffset = progressViewEndOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M1 */
    private final void m68310M1() {
        int i11;
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        Context context = getContext();
        if (context == null || !AbstractC14556b.m65670a(context)) {
            i11 = 3;
        } else {
            i11 = AbstractC5806y.m27489e() > AbstractC5806y.m27487c() ? 5 : 4;
        }
        C25646b c25646b = this.exposureHelper;
        KeyEventDispatcher.Component activity = getActivity();
        Intrinsics.m97800f(activity, "null cannot be cast to non-null type com.transsion.home.preload.MainXMLPreload");
        InterfaceC15428b interfaceC15428bMo66689d = ((InterfaceC15427a) activity).mo66689d();
        TrendingViewModel trendingViewModel = this.mPostListModel;
        Function1 function1 = this.mOnAppointmentClick;
        Context context2 = getContext();
        final C15007b c15007b = new C15007b(c25646b, interfaceC15428bMo66689d, this, trendingViewModel, function1, context2 != null && AbstractC14556b.m65670a(context2), i11);
        c15007b.m36186h0().m108673z(true);
        c15007b.m36186h0().m108672y(true);
        c15007b.m36186h0().m108657E(4);
        c15007b.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.home.fragment.tab.t1
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                TrendingFragment.m68314O1(this.f53312a);
            }
        });
        c15007b.m36158R0(new C15320f());
        c15007b.m36227w1(new InterfaceC27566d() { // from class: com.transsion.home.fragment.tab.t0
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i12) {
                TrendingFragment.m68316P1(this.f53311a, baseQuickAdapter, view, i12);
            }
        });
        c15007b.m36193l(R$id.ll_download);
        c15007b.m36216s1(new InterfaceC27564b() { // from class: com.transsion.home.fragment.tab.u0
            @Override // p765s6.InterfaceC27564b
            /* JADX INFO: renamed from: a */
            public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i12) {
                TrendingFragment.m68318Q1(this.f53314a, c15007b, baseQuickAdapter, view, i12);
            }
        });
        c15007b.m67215U1(new Function0() { // from class: com.transsion.home.fragment.tab.v0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrendingFragment.m68312N1(this.f53317a);
            }
        });
        this.mAdapter = c15007b;
        BaseItemProvider baseItemProvider = c15007b.m67213S1().get(PostItemType.PREFERENCES.getValue());
        C15007b c15007b2 = null;
        C15034e c15034e = baseItemProvider instanceof C15034e ? (C15034e) baseItemProvider : null;
        if (c15034e != null) {
            HomePreferencesViewModel homePreferencesViewModelM68388z1 = m68388z1();
            C15007b c15007b3 = this.mAdapter;
            if (c15007b3 == null) {
                Intrinsics.m97819y("mAdapter");
                c15007b3 = null;
            }
            int mTabId = getMTabId();
            String mTabCode = getMTabCode();
            if (mTabCode == null) {
                mTabCode = "";
            }
            HomePreferencesUiHelperKt.m68120j(c15034e, homePreferencesViewModelM68388z1, c15007b3, mTabId, mTabCode);
        }
        NpaGridLayoutManager npaGridLayoutManager = new NpaGridLayoutManager(requireContext(), i11);
        C15321g c15321g = new C15321g(i11);
        c15321g.m20751i(true);
        npaGridLayoutManager.m20740d0(c15321g);
        initExposureHelper();
        C24704z c24704z = (C24704z) getMViewBinding();
        RecyclerView recyclerView = c24704z != null ? c24704z.f75602d : null;
        C25646b c25646b2 = this.exposureHelper;
        if (c25646b2 != null && recyclerView != null) {
            recyclerView.addOnScrollListener(c25646b2);
        }
        if (recyclerView != null) {
            recyclerView.setLayoutManager(npaGridLayoutManager);
            npaGridLayoutManager.setInitialPrefetchItemCount(6);
            C25831h c25831h = new C25831h(AbstractC5776a0.m27313a(12.0f), i11);
            c25831h.m101484d(AbstractC5776a0.m27313a(6.0f));
            recyclerView.addItemDecoration(c25831h);
            recyclerView.setItemAnimator(null);
            C15007b c15007b4 = this.mAdapter;
            if (c15007b4 == null) {
                Intrinsics.m97819y("mAdapter");
                c15007b4 = null;
            }
            recyclerView.setAdapter(c15007b4);
            C15007b c15007b5 = this.mAdapter;
            if (c15007b5 == null) {
                Intrinsics.m97819y("mAdapter");
            } else {
                c15007b2 = c15007b5;
            }
            recyclerView.addOnScrollListener(new C23862a(c15007b2.m36186h0()));
        }
        if (recyclerView != null) {
            HomePreferencesUiHelperKt.m68118h(this, recyclerView, npaGridLayoutManager, m68388z1(), new Function0() { // from class: com.transsion.home.fragment.tab.w0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(TrendingFragment.m68320R1(this.f53319a));
                }
            });
        }
        C24704z c24704z2 = (C24704z) getMViewBinding();
        if (c24704z2 == null || (customSwipeRefreshLayout = c24704z2.f75603e) == null) {
            return;
        }
        customSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: com.transsion.home.fragment.tab.x0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
            /* JADX INFO: renamed from: a */
            public final void mo21823a() {
                TrendingFragment.m68322S1(this.f53322a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N1 */
    public static final Unit m68312N1(TrendingFragment trendingFragment) {
        if (C27287m.f83003a.m106330e()) {
            trendingFragment.m68353i2();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public static final void m68314O1(TrendingFragment trendingFragment) {
        trendingFragment.m68338a2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P1 */
    public static final void m68316P1(TrendingFragment trendingFragment, BaseQuickAdapter adapter, View view, int i11) {
        OperateItem operateItem;
        Subject feedsSubject;
        String subjectId;
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        if (!(item instanceof OperateItem) || (feedsSubject = (operateItem = (OperateItem) item).getFeedsSubject()) == null || (subjectId = feedsSubject.getSubjectId()) == null || subjectId.length() <= 0) {
            return;
        }
        Subject feedsSubject2 = operateItem.getFeedsSubject();
        Intrinsics.m97799e(feedsSubject2);
        AbstractC28126h.m109239f(feedsSubject2, "opt_feeds");
        C25647c c25647c = trendingFragment.postListReport;
        if (c25647c != null) {
            Subject feedsSubject3 = operateItem.getFeedsSubject();
            Intrinsics.m97799e(feedsSubject3);
            c25647c.m100948b(i11, feedsSubject3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: Q1 */
    public static final void m68318Q1(TrendingFragment trendingFragment, C15007b c15007b, BaseQuickAdapter adapter, View view, int i11) {
        Subject feedsSubject;
        TrendingViewModel trendingViewModel;
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 2000L)) {
            return;
        }
        Object item = adapter.getItem(i11);
        String strM109240g = null;
        OperateItem operateItem = item instanceof OperateItem ? (OperateItem) item : null;
        if (view.getId() == R$id.ll_download) {
            strM109240g = AbstractC28126h.m109240g(operateItem != null ? operateItem.getFeedsSubject() : null, trendingFragment.getPageName(), c15007b.getContext(), "opt_feeds");
        }
        if (operateItem == null || (feedsSubject = operateItem.getFeedsSubject()) == null || (trendingViewModel = trendingFragment.mPostListModel) == null) {
            return;
        }
        if (strM109240g == null) {
            strM109240g = "";
        }
        trendingViewModel.m69064a0(feedsSubject, i11, strM109240g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R1 */
    public static final int m68320R1(TrendingFragment trendingFragment) {
        C15007b c15007b = trendingFragment.mAdapter;
        if (c15007b == null) {
            Intrinsics.m97819y("mAdapter");
            c15007b = null;
        }
        return c15007b.getData().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S1 */
    public static final void m68322S1(TrendingFragment trendingFragment) {
        trendingFragment.mo67722c0();
        trendingFragment.m68340b2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T1 */
    public static final void m68324T1(final TrendingFragment trendingFragment, Map permissions) {
        RecyclerView recyclerView;
        Intrinsics.m97802h(permissions, "permissions");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        Iterator it = permissions.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                booleanRef.element = false;
            }
        }
        C24704z c24704z = (C24704z) trendingFragment.getMViewBinding();
        if (c24704z == null || (recyclerView = c24704z.f75602d) == null) {
            return;
        }
        recyclerView.post(new Runnable() { // from class: com.transsion.home.fragment.tab.q1
            @Override // java.lang.Runnable
            public final void run() {
                TrendingFragment.m68326U1(this.f53299a, booleanRef);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public static final void m68326U1(TrendingFragment trendingFragment, Ref.BooleanRef booleanRef) {
        Function1 function1 = trendingFragment.mPermissionCallback;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(booleanRef.element));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public static final Unit m68328V1(TrendingFragment trendingFragment, TrendingRespData trendingRespData) {
        List<OperateItem> items;
        MainOperateData mainOperateData = trendingFragment.operatingResp;
        boolean z11 = false;
        boolean z12 = ((mainOperateData == null || (items = mainOperateData.getItems()) == null) ? 0 : items.size()) > 0;
        if (!z12) {
            C15007b c15007b = trendingFragment.mAdapter;
            if (c15007b == null) {
                Intrinsics.m97819y("mAdapter");
                c15007b = null;
            }
            if (c15007b.getData().size() > 0 && Intrinsics.m97797c(trendingFragment.nextPage, "1")) {
                z11 = true;
            }
        }
        C26866a.a.m104898f(C26866a.f81698a, "PreloadTrending", "load feeds isFresh " + z11 + " hasOperating " + z12, false, 4, null);
        trendingFragment.m68368q2(trendingRespData, z11);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W1 */
    public final void m68330W1() {
        if (m68300H1()) {
            return;
        }
        C15007b c15007b = this.mAdapter;
        if (c15007b == null) {
            Intrinsics.m97819y("mAdapter");
            c15007b = null;
        }
        int iM68288A1 = m68288A1(c15007b.getData());
        if (iM68288A1 >= 0) {
            C15007b c15007b2 = this.mAdapter;
            if (c15007b2 == null) {
                Intrinsics.m97819y("mAdapter");
                c15007b2 = null;
            }
            if (iM68288A1 < c15007b2.getData().size()) {
                C15007b c15007b3 = this.mAdapter;
                if (c15007b3 == null) {
                    Intrinsics.m97819y("mAdapter");
                    c15007b3 = null;
                }
                c15007b3.getData().add(iM68288A1, new OperateItem(null, PostItemType.NO_NETWORK.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741821, null));
                C15007b c15007b4 = this.mAdapter;
                if (c15007b4 == null) {
                    Intrinsics.m97819y("mAdapter");
                    c15007b4 = null;
                }
                c15007b4.notifyItemInserted(iM68288A1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public final void m68332X1(boolean showProgress) {
        if (showProgress) {
            C15007b c15007b = this.mAdapter;
            if (c15007b == null) {
                Intrinsics.m97819y("mAdapter");
                c15007b = null;
            }
            if (c15007b.getData().size() <= 2) {
                showProgress();
            }
        }
        PreloadTrendingData preloadTrendingDataM69164a = PreloadTrendingData.f53717n.m69164a();
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        preloadTrendingDataM69164a.m69160U(contextRequireContext);
    }

    /* JADX INFO: renamed from: Y1 */
    static /* synthetic */ void m68334Y1(TrendingFragment trendingFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        trendingFragment.m68332X1(z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z1 */
    private final void m68336Z1() {
        BiddingFloatingIrregularView biddingFloatingIrregularView;
        C24704z c24704z = (C24704z) getMViewBinding();
        if (c24704z == null || (biddingFloatingIrregularView = c24704z.f75600b) == null) {
            return;
        }
        biddingFloatingIrregularView.loadAd();
    }

    /* JADX INFO: renamed from: a2 */
    private final void m68338a2() {
        int i11 = this.mPerPage;
        if (i11 <= 0) {
            i11 = 12;
        }
        TrendingViewModel trendingViewModel = this.mPostListModel;
        if (trendingViewModel != null) {
            String str = this.nextPage;
            C15007b c15007b = this.mAdapter;
            if (c15007b == null) {
                Intrinsics.m97819y("mAdapter");
                c15007b = null;
            }
            trendingViewModel.m69063Y(str, i11, c15007b.getIsGridTrendingAdapter());
        }
    }

    /* JADX INFO: renamed from: b2 */
    private final void m68340b2() {
        this.adHandler.removeCallbacksAndMessages(null);
        if (this.hasAd) {
            return;
        }
        this.adHandler.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.tab.s1
            @Override // java.lang.Runnable
            public final void run() {
                TrendingFragment.m68342c2(this.f53309a);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public static final void m68342c2(TrendingFragment trendingFragment) {
        FragmentActivity activity = trendingFragment.getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        if (baseActivity != null) {
            baseActivity.loadTwoLevelAd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public static final Unit m68344d2(TrendingFragment trendingFragment, Function1 callback) {
        Intrinsics.m97802h(callback, "callback");
        trendingFragment.mPermissionCallback = callback;
        AbstractC0249b abstractC0249b = trendingFragment.mLauncher;
        if (abstractC0249b != null) {
            abstractC0249b.m999a(new String[]{"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"});
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public static final void m68346e2(int i11, int i12, TrendingFragment trendingFragment, OperateItem operateItem) {
        C15007b c15007b = null;
        if (i11 < 0 || i11 > i12) {
            C15007b c15007b2 = trendingFragment.mAdapter;
            if (c15007b2 == null) {
                Intrinsics.m97819y("mAdapter");
            } else {
                c15007b = c15007b2;
            }
            c15007b.mo36205p(operateItem);
            return;
        }
        C15007b c15007b3 = trendingFragment.mAdapter;
        if (c15007b3 == null) {
            Intrinsics.m97819y("mAdapter");
        } else {
            c15007b = c15007b3;
        }
        c15007b.mo36199n(i11, operateItem);
    }

    /* JADX INFO: renamed from: f1 */
    private final void m68347f1(List newList, TrendingRespItem item) {
        Integer type = item.getType();
        int value = TrendingRespItemType.SUBJECT.getValue();
        if (type == null || type.intValue() != value || item.getSubject() == null) {
            return;
        }
        newList.add(new OperateItem(null, PostItemType.SUBJECT.getValue(), null, null, null, null, null, null, null, null, null, null, item.getSubject(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073737725, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f2 */
    private final void m68348f2() {
        BaseActivity baseActivity;
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        if (this.hasAd) {
            C24704z c24704z = (C24704z) getMViewBinding();
            String currentState = (c24704z == null || (customSwipeRefreshLayout = c24704z.f75603e) == null) ? null : customSwipeRefreshLayout.getCurrentState();
            if (currentState != null) {
                int iHashCode = currentState.hashCode();
                String str = CustomSwipeRefreshLayout.IDLE;
                if (iHashCode != -1435393951) {
                    if (iHashCode != 2242516) {
                        if (iHashCode == 1803427515 && currentState.equals(CustomSwipeRefreshLayout.REFRESH)) {
                            String str2 = CustomSwipeRefreshLayout.INSTANCE.m86999b() ? CustomSwipeRefreshLayout.HOVER_FULL : CustomSwipeRefreshLayout.HOVER_HALF;
                            if (isVisible()) {
                                str = str2;
                            }
                            FragmentActivity activity = getActivity();
                            baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
                            if (baseActivity != null) {
                                baseActivity.onAction(str, 0.0f, 0.0f);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!currentState.equals(CustomSwipeRefreshLayout.IDLE)) {
                        return;
                    }
                } else if (!currentState.equals(CustomSwipeRefreshLayout.SECOND_FLOOR)) {
                    return;
                }
                FragmentActivity activity2 = getActivity();
                baseActivity = activity2 instanceof BaseActivity ? (BaseActivity) activity2 : null;
                if (baseActivity != null) {
                    baseActivity.onAction(CustomSwipeRefreshLayout.IDLE, 0.0f, 0.0f);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g1 */
    private final void m68349g1() {
        RecyclerView recyclerView;
        C24704z c24704z = (C24704z) getMViewBinding();
        if (c24704z == null || (recyclerView = c24704z.f75602d) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new C15316b());
    }

    private final View getEmptyView(Context context) {
        final DefaultView defaultView = new DefaultView(context);
        defaultView.setDefaultImageViewVisibility(0);
        defaultView.setDefaultImage(R$mipmap.ic_no_content);
        String string = context.getString(com.p282tn.lib.widget.R$string.no_content);
        Intrinsics.m97801g(string, "getString(...)");
        defaultView.setDescText(string);
        defaultView.setStyle(DefaultView.DefaultViewStyle.STYLE_IMAGE_DESC_BTN);
        defaultView.setBtnVisibility(0);
        String string2 = context.getString(com.transsion.baseui.R$string.retry_text);
        Intrinsics.m97801g(string2, "getString(...)");
        defaultView.setBtnText(string2);
        defaultView.setBtnClickListener(new View.OnClickListener() { // from class: com.transsion.home.fragment.tab.j1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrendingFragment.m68373s1(this.f53272a, defaultView, view);
            }
        });
        defaultView.setVisibility(0);
        return defaultView;
    }

    private final String getPageName() {
        return m68292C1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h1 */
    private final void m68350h1() {
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        C24704z c24704z = (C24704z) getMViewBinding();
        if (c24704z != null && (customSwipeRefreshLayout = c24704z.f75603e) != null) {
            customSwipeRefreshLayout.setCurrentState(CustomSwipeRefreshLayout.IDLE);
        }
        FragmentActivity activity = getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        if (baseActivity != null) {
            baseActivity.onAction(CustomSwipeRefreshLayout.IDLE, 0.0f, 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h2 */
    public static final void m68351h2(TrendingFragment trendingFragment) {
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        C24704z c24704z = (C24704z) trendingFragment.getMViewBinding();
        if (c24704z != null && (customSwipeRefreshLayout = c24704z.f75603e) != null) {
            customSwipeRefreshLayout.setRefreshing(true);
        }
        trendingFragment.mo67722c0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void hideProgress() {
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        CustomSwipeRefreshLayout customSwipeRefreshLayout2;
        CustomSwipeRefreshLayout customSwipeRefreshLayout3;
        C24690m0 c24690m0;
        ConstraintLayout constraintLayout;
        C24704z c24704z = (C24704z) getMViewBinding();
        if (c24704z != null && (c24690m0 = c24704z.f75601c) != null && (constraintLayout = c24690m0.f75513h) != null) {
            AbstractC26006c.m102054g(constraintLayout);
        }
        C24704z c24704z2 = (C24704z) getMViewBinding();
        if (c24704z2 != null && (customSwipeRefreshLayout3 = c24704z2.f75603e) != null) {
            customSwipeRefreshLayout3.setEnabled(true);
        }
        C24704z c24704z3 = (C24704z) getMViewBinding();
        if (c24704z3 == null || (customSwipeRefreshLayout = c24704z3.f75603e) == null || !customSwipeRefreshLayout.isRefreshing()) {
            return;
        }
        C24704z c24704z4 = (C24704z) getMViewBinding();
        if (c24704z4 != null && (customSwipeRefreshLayout2 = c24704z4.f75603e) != null) {
            customSwipeRefreshLayout2.setRefreshing(false);
        }
        m68348f2();
    }

    /* JADX INFO: renamed from: i1 */
    private final void m68352i1() {
        final Function1 function1 = new Function1() { // from class: com.transsion.home.fragment.tab.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrendingFragment.m68354j1(this.f53217a, ((Boolean) obj).booleanValue());
            }
        };
        C26866a.a aVar = C26866a.f81698a;
        PreloadTrendingData.C15566a c15566a = PreloadTrendingData.f53717n;
        C26866a.a.m104898f(aVar, "lgx", "preObserve fragment:" + this + " " + c15566a.m69164a().m69155J() + "  " + c15566a.m69164a().m69156K(), false, 4, null);
        c15566a.m69164a().m69155J().m14851j(this, new C15325j(new Function1() { // from class: com.transsion.home.fragment.tab.c1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrendingFragment.m68358l1(this.f53224a, function1, (MainOperateData) obj);
            }
        }));
        c15566a.m69164a().m69156K().m14851j(this, new C15325j(new Function1() { // from class: com.transsion.home.fragment.tab.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrendingFragment.m68359m1(this.f53235a, function1, (MainOperateData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public final void m68353i2() {
        int iM68290B1 = m68290B1();
        if (iM68290B1 >= 0) {
            C15007b c15007b = this.mAdapter;
            C15007b c15007b2 = null;
            if (c15007b == null) {
                Intrinsics.m97819y("mAdapter");
                c15007b = null;
            }
            if (iM68290B1 < c15007b.getData().size()) {
                C15007b c15007b3 = this.mAdapter;
                if (c15007b3 == null) {
                    Intrinsics.m97819y("mAdapter");
                    c15007b3 = null;
                }
                c15007b3.getData().remove(iM68290B1);
                C15007b c15007b4 = this.mAdapter;
                if (c15007b4 == null) {
                    Intrinsics.m97819y("mAdapter");
                } else {
                    c15007b2 = c15007b4;
                }
                c15007b2.notifyItemRemoved(iM68290B1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initAd() {
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        CustomSwipeRefreshLayout customSwipeRefreshLayout2;
        C24704z c24704z = (C24704z) getMViewBinding();
        if (c24704z != null && (customSwipeRefreshLayout2 = c24704z.f75603e) != null) {
            customSwipeRefreshLayout2.post(new Runnable() { // from class: com.transsion.home.fragment.tab.a1
                @Override // java.lang.Runnable
                public final void run() {
                    TrendingFragment.m68308L1(this.f53211a);
                }
            });
        }
        C24704z c24704z2 = (C24704z) getMViewBinding();
        if (c24704z2 == null || (customSwipeRefreshLayout = c24704z2.f75603e) == null) {
            return;
        }
        customSwipeRefreshLayout.setOnSwipeActionListener(new C15318d());
    }

    private final void initExposureHelper() {
        this.postListReport = new C25647c(getPageName());
        C25646b c25646b = new C25646b(0.6f, new C15319e(), false, 4, null);
        this.exposureHelper = c25646b;
        c25646b.m100946l(2);
    }

    private final void initViewModel() {
        TrendingViewModel trendingViewModel = this.mPostListModel;
        if (trendingViewModel != null) {
            trendingViewModel.m69062X().m14851j(this, new C15325j(new Function1() { // from class: com.transsion.home.fragment.tab.y0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TrendingFragment.m68328V1(this.f53325a, (TrendingRespData) obj);
                }
            }));
        }
        C15007b c15007b = null;
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new C153242(null), 3, null);
        m68352i1();
        HomePreferencesViewModel homePreferencesViewModelM68388z1 = m68388z1();
        C15007b c15007b2 = this.mAdapter;
        if (c15007b2 == null) {
            Intrinsics.m97819y("mAdapter");
        } else {
            c15007b = c15007b2;
        }
        HomePreferencesUiHelperKt.m68125o(this, homePreferencesViewModelM68388z1, c15007b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j1 */
    public static final Unit m68354j1(final TrendingFragment trendingFragment, boolean z11) {
        C24704z c24704z;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        ViewTreeObserver viewTreeObserver;
        RecyclerView recyclerView4;
        TrendingViewModel trendingViewModel;
        Integer groupPos;
        C24655b logViewConfig = trendingFragment.getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        MainOperateData mainOperateData = trendingFragment.operatingResp;
        if (((mainOperateData == null || (groupPos = mainOperateData.getGroupPos()) == null) ? 0 : groupPos.intValue()) > 0 && (trendingViewModel = trendingFragment.mPostListModel) != null) {
            trendingViewModel.m69059T(z11);
        }
        final ArrayList arrayList = new ArrayList();
        trendingFragment.m68296F1(arrayList);
        String mTabCode = trendingFragment.getMTabCode();
        if (mTabCode != null) {
            trendingFragment.m68388z1().m68939E(mTabCode, arrayList);
        }
        MainOperateData mainOperateData2 = trendingFragment.operatingResp;
        AbstractC28126h.m109236c(arrayList, mainOperateData2 != null ? mainOperateData2.getOps() : null);
        final boolean zM68304J1 = trendingFragment.m68304J1(arrayList);
        C24704z c24704z2 = (C24704z) trendingFragment.getMViewBinding();
        if (c24704z2 != null && (recyclerView4 = c24704z2.f75602d) != null) {
            recyclerView4.post(new Runnable() { // from class: com.transsion.home.fragment.tab.h1
                @Override // java.lang.Runnable
                public final void run() {
                    TrendingFragment.m68356k1(this.f53261a, arrayList, zM68304J1);
                }
            });
        }
        C24704z c24704z3 = (C24704z) trendingFragment.getMViewBinding();
        if (c24704z3 != null && (recyclerView3 = c24704z3.f75602d) != null && (viewTreeObserver = recyclerView3.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(trendingFragment.new ViewTreeObserverOnPreDrawListenerC15317c());
        }
        C26866a.a.m104898f(C26866a.f81698a, "lgx", "hide1 fragment:" + trendingFragment, false, 4, null);
        trendingFragment.hideProgress();
        C24704z c24704z4 = (C24704z) trendingFragment.getMViewBinding();
        if (((c24704z4 == null || (recyclerView2 = c24704z4.f75602d) == null) ? 0 : recyclerView2.computeVerticalScrollOffset()) > 10 && (c24704z = (C24704z) trendingFragment.getMViewBinding()) != null && (recyclerView = c24704z.f75602d) != null) {
            recyclerView.scrollBy(0, 1);
        }
        if (!z11) {
            AbstractC15429c.m68505b(arrayList);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: j2 */
    private final List m68355j2(List feedsList) {
        ArrayList arrayList = new ArrayList();
        C15007b c15007b = this.mAdapter;
        if (c15007b == null) {
            Intrinsics.m97819y("mAdapter");
            c15007b = null;
        }
        List<Object> data = c15007b.getData();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : data) {
            if (((OperateItem) obj).getFeedsSubject() != null) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.m97516v(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Subject feedsSubject = ((OperateItem) it.next()).getFeedsSubject();
            arrayList3.add(feedsSubject != null ? feedsSubject.getSubjectId() : null);
        }
        Iterator it2 = feedsList.iterator();
        while (it2.hasNext()) {
            TrendingRespItem trendingRespItem = (TrendingRespItem) it2.next();
            if (trendingRespItem.getSubject() != null) {
                Subject subject = trendingRespItem.getSubject();
                if (arrayList3.contains(subject != null ? subject.getSubjectId() : null)) {
                    C26866a.a aVar = C26866a.f81698a;
                    Subject subject2 = trendingRespItem.getSubject();
                    String title = subject2 != null ? subject2.getTitle() : null;
                    Subject subject3 = trendingRespItem.getSubject();
                    C26866a.a.m104898f(aVar, "Trending", "find same item title..." + title + " id  " + (subject3 != null ? subject3.getSubjectId() : null), false, 4, null);
                }
            }
            m68347f1(arrayList, trendingRespItem);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final void m68356k1(TrendingFragment trendingFragment, List list, boolean z11) {
        C15007b c15007b = trendingFragment.mAdapter;
        if (c15007b == null) {
            Intrinsics.m97819y("mAdapter");
            c15007b = null;
        }
        c15007b.mo36201n1(list);
        m68367q1(trendingFragment, z11, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public final void m68357k2(int position) {
        HashMap mapM96844g;
        HashMap mapM96844g2;
        String str;
        Integer numV;
        C24655b logViewConfig = getLogViewConfig();
        int iIntValue = (logViewConfig == null || (mapM96844g2 = logViewConfig.m96844g()) == null || (str = (String) mapM96844g2.get("scrollPosition")) == null || (numV = StringsKt.m98216v(str)) == null) ? 0 : numV.intValue();
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 == null || (mapM96844g = logViewConfig2.m96844g()) == null) {
            return;
        }
        mapM96844g.put("scrollPosition", String.valueOf(RangesKt.m97935e(iIntValue, position)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final Unit m68358l1(TrendingFragment trendingFragment, Function1 function1, MainOperateData mainOperateData) {
        HashMap mapM96844g;
        List<OperateItem> items;
        C26866a.a.m104898f(C26866a.f81698a, "lgx", "observe1 fragment:" + trendingFragment, false, 4, null);
        C24655b logViewConfig = trendingFragment.getLogViewConfig();
        if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
            mapM96844g.put("enterCache", String.valueOf((mainOperateData == null || (items = mainOperateData.getItems()) == null) ? null : Integer.valueOf(items.size())));
        }
        C15007b c15007b = trendingFragment.mAdapter;
        if (c15007b == null) {
            Intrinsics.m97819y("mAdapter");
            c15007b = null;
        }
        if (c15007b.getData().size() == 0) {
            List<OperateItem> items2 = mainOperateData != null ? mainOperateData.getItems() : null;
            if (items2 != null && !items2.isEmpty()) {
                trendingFragment.operatingResp = mainOperateData;
                function1.invoke(Boolean.TRUE);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m1 */
    public static final Unit m68359m1(TrendingFragment trendingFragment, Function1 function1, MainOperateData mainOperateData) {
        List<OperateItem> items;
        C24704z c24704z;
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        HashMap mapM96844g;
        List<OperateItem> items2;
        List<OperateItem> items3;
        List<OperateItem> items4;
        List<OperateItem> items5;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "lgx", "observe2 fragment:" + trendingFragment, false, 4, null);
        MainOperateData mainOperateData2 = (MainOperateData) PreloadTrendingData.f53717n.m69164a().m69155J().m14847f();
        aVar.m104912c("PreloadTrending", "operating preload cache " + ((mainOperateData2 == null || (items5 = mainOperateData2.getItems()) == null) ? null : Integer.valueOf(items5.size())) + "  net:" + ((mainOperateData == null || (items4 = mainOperateData.getItems()) == null) ? null : Integer.valueOf(items4.size())), true);
        C24655b logViewConfig = trendingFragment.getLogViewConfig();
        if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
            mapM96844g.put("enterNet", "cache:" + ((mainOperateData2 == null || (items3 = mainOperateData2.getItems()) == null) ? null : Integer.valueOf(items3.size())) + " net:" + ((mainOperateData == null || (items2 = mainOperateData.getItems()) == null) ? null : Integer.valueOf(items2.size())));
        }
        List<OperateItem> items6 = mainOperateData != null ? mainOperateData.getItems() : null;
        if (items6 != null && !items6.isEmpty()) {
            trendingFragment.operatingResp = mainOperateData;
        } else if (trendingFragment.operatingResp == null) {
            trendingFragment.operatingResp = mainOperateData2;
        }
        C15007b c15007b = trendingFragment.mAdapter;
        if (c15007b == null) {
            Intrinsics.m97819y("mAdapter");
            c15007b = null;
        }
        if (c15007b.getData().size() > 0 && ((c24704z = (C24704z) trendingFragment.getMViewBinding()) == null || (customSwipeRefreshLayout = c24704z.f75603e) == null || !customSwipeRefreshLayout.isRefreshing())) {
            List<OperateItem> items7 = mainOperateData != null ? mainOperateData.getItems() : null;
            if (items7 == null || items7.isEmpty()) {
                return Unit.f75682a;
            }
        }
        MainOperateData mainOperateData3 = trendingFragment.operatingResp;
        if (mainOperateData3 == null || (items = mainOperateData3.getItems()) == null || !(!items.isEmpty())) {
            trendingFragment.m68338a2();
            m68367q1(trendingFragment, false, 0, 3, null);
        } else {
            function1.invoke(Boolean.FALSE);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m2 */
    public static final Unit m68360m2(TrendingFragment trendingFragment, String state) {
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        Intrinsics.m97802h(state, "state");
        C24704z c24704z = (C24704z) trendingFragment.getMViewBinding();
        if (c24704z != null && (customSwipeRefreshLayout = c24704z.f75603e) != null) {
            customSwipeRefreshLayout.setCurrentState(state);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: n1 */
    private final void m68361n1() {
        C25646b c25646b = this.exposureHelper;
        if (c25646b != null) {
            c25646b.m100943e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n2 */
    public final void m68362n2(float alpha) {
        View view;
        C24704z c24704z = (C24704z) getMViewBinding();
        if (c24704z == null || (view = c24704z.f75604f) == null) {
            return;
        }
        view.setAlpha(alpha);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final InterfaceC23181a m68363o1() {
        return (InterfaceC23181a) TheRouter.m61774d(InterfaceC23181a.class, new Object[0]);
    }

    /* JADX INFO: renamed from: o2 */
    private final void m68364o2() {
        this.mHandler.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.tab.i1
            @Override // java.lang.Runnable
            public final void run() {
                TrendingFragment.m68366p2(this.f53267a);
            }
        }, 200L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p1 */
    private final void m68365p1(final boolean hasTopBanner, final int retryCount) {
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        CustomSwipeRefreshLayout customSwipeRefreshLayout2;
        View view;
        CustomSwipeRefreshLayout customSwipeRefreshLayout3;
        C24704z c24704z = (C24704z) getMViewBinding();
        if (c24704z == null || (customSwipeRefreshLayout = c24704z.f75603e) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = customSwipeRefreshLayout.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            if (retryCount < 2) {
                customSwipeRefreshLayout.post(new Runnable() { // from class: com.transsion.home.fragment.tab.r1
                    @Override // java.lang.Runnable
                    public final void run() {
                        TrendingFragment.m68370r1(this.f53303a, hasTopBanner, retryCount);
                    }
                });
                return;
            }
            return;
        }
        if (hasTopBanner) {
            layoutParams2.topMargin = 0;
            C24704z c24704z2 = (C24704z) getMViewBinding();
            if (c24704z2 != null && (customSwipeRefreshLayout3 = c24704z2.f75603e) != null) {
                int i11 = this.mHeaderBgHeight;
                customSwipeRefreshLayout3.setProgressViewOffset(false, i11, AbstractC5776a0.m27313a(50.0f) + i11);
            }
            m68362n2(0.0f);
            m68100b0(true);
            return;
        }
        C24704z c24704z3 = (C24704z) getMViewBinding();
        int height = (c24704z3 == null || (view = c24704z3.f75604f) == null) ? 0 : view.getHeight();
        if (height <= 0) {
            height = this.mHeaderBgHeight;
        }
        layoutParams2.topMargin = height;
        C24704z c24704z4 = (C24704z) getMViewBinding();
        if (c24704z4 != null && (customSwipeRefreshLayout2 = c24704z4.f75603e) != null) {
            customSwipeRefreshLayout2.setProgressViewOffset(false, 0, AbstractC5776a0.m27313a(50.0f));
        }
        m68362n2(1.0f);
        m68100b0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public static final void m68366p2(TrendingFragment trendingFragment) {
        if (trendingFragment.isDetached() || !trendingFragment.isAdded() || trendingFragment.getContext() == null) {
            return;
        }
        trendingFragment.hideProgress();
        Context contextRequireContext = trendingFragment.requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        View viewM68376t1 = trendingFragment.m68376t1(contextRequireContext);
        C15007b c15007b = trendingFragment.mAdapter;
        if (c15007b == null) {
            Intrinsics.m97819y("mAdapter");
            c15007b = null;
        }
        c15007b.m36171Y0(viewM68376t1);
    }

    /* JADX INFO: renamed from: q1 */
    static /* synthetic */ void m68367q1(TrendingFragment trendingFragment, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = trendingFragment.m68302I1();
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        trendingFragment.m68365p1(z11, i11);
    }

    /* JADX INFO: renamed from: q2 */
    private final void m68368q2(TrendingRespData baseBean, boolean isRefresh) {
        String nextPage;
        List<TrendingRespItem> list;
        List<TrendingRespItem> list2;
        Integer perPage;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "PreloadTrending", "updateTrendingList baseBean.data=" + baseBean, false, 4, null);
        C15007b c15007b = null;
        if (baseBean == null) {
            MainOperateData mainOperateData = this.operatingResp;
            List<OperateItem> items = mainOperateData != null ? mainOperateData.getItems() : null;
            if (items == null || items.isEmpty()) {
                m68364o2();
            }
            C15007b c15007b2 = this.mAdapter;
            if (c15007b2 == null) {
                Intrinsics.m97819y("mAdapter");
                c15007b2 = null;
            }
            if (c15007b2.m36186h0().m108666r()) {
                C15007b c15007b3 = this.mAdapter;
                if (c15007b3 == null) {
                    Intrinsics.m97819y("mAdapter");
                } else {
                    c15007b = c15007b3;
                }
                c15007b.m36186h0().m108669v();
                return;
            }
            return;
        }
        hideProgress();
        List<TrendingRespItem> items2 = baseBean.getItems();
        C26866a.a.m104898f(aVar, "TrendingFragment", "updateTrendingList subjectBean " + (items2 != null ? Integer.valueOf(items2.size()) : null), false, 4, null);
        Pager pager = baseBean.getPager();
        this.mPerPage = (pager == null || (perPage = pager.getPerPage()) == null) ? this.mPerPage : perPage.intValue();
        Pager pager2 = baseBean.getPager();
        if (pager2 == null || (nextPage = pager2.getNextPage()) == null) {
            nextPage = "1";
        }
        this.nextPage = nextPage;
        List<TrendingRespItem> items3 = baseBean.getItems();
        if (isRefresh && (list2 = items3) != null && !list2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<TrendingRespItem> it = items3.iterator();
            while (it.hasNext()) {
                m68347f1(arrayList, it.next());
            }
            C15007b c15007b4 = this.mAdapter;
            if (c15007b4 == null) {
                Intrinsics.m97819y("mAdapter");
            } else {
                c15007b = c15007b4;
            }
            c15007b.mo36201n1(arrayList);
            return;
        }
        C15007b c15007b5 = this.mAdapter;
        if (c15007b5 == null) {
            Intrinsics.m97819y("mAdapter");
        } else {
            c15007b = c15007b5;
        }
        if (c15007b.getData().size() == 0 && ((list = items3) == null || list.isEmpty())) {
            showEmpty();
        } else {
            if (items3 == null) {
                this.mHandler.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.tab.f1
                    @Override // java.lang.Runnable
                    public final void run() {
                        TrendingFragment.m68371r2(this.f53245a);
                    }
                }, 200L);
                return;
            }
            final List listM68355j2 = m68355j2(items3);
            AbstractC15429c.m68504a(getContext(), listM68355j2);
            this.mHandler.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.tab.g1
                @Override // java.lang.Runnable
                public final void run() {
                    TrendingFragment.m68374s2(this.f53252a, listM68355j2);
                }
            }, 200L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public static final void m68370r1(TrendingFragment trendingFragment, boolean z11, int i11) {
        if (trendingFragment.isAdded()) {
            trendingFragment.m68365p1(z11, i11 + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public static final void m68371r2(TrendingFragment trendingFragment) {
        C15007b c15007b = trendingFragment.mAdapter;
        if (c15007b == null) {
            Intrinsics.m97819y("mAdapter");
            c15007b = null;
        }
        c15007b.m36186h0().m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final void m68373s1(TrendingFragment trendingFragment, DefaultView defaultView, View view) {
        m68334Y1(trendingFragment, false, 1, null);
        defaultView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public static final void m68374s2(TrendingFragment trendingFragment, List list) {
        if (trendingFragment.getContext() == null) {
            return;
        }
        C15007b c15007b = null;
        if (list.isEmpty()) {
            C15007b c15007b2 = trendingFragment.mAdapter;
            if (c15007b2 == null) {
                Intrinsics.m97819y("mAdapter");
                c15007b2 = null;
            }
            C27941f.m108652u(c15007b2.m36186h0(), false, 1, null);
            return;
        }
        C15007b c15007b3 = trendingFragment.mAdapter;
        if (c15007b3 == null) {
            Intrinsics.m97819y("mAdapter");
            c15007b3 = null;
        }
        c15007b3.mo36208q(list);
        C15007b c15007b4 = trendingFragment.mAdapter;
        if (c15007b4 == null) {
            Intrinsics.m97819y("mAdapter");
            c15007b4 = null;
        }
        if (c15007b4.m36186h0().m108666r()) {
            C15007b c15007b5 = trendingFragment.mAdapter;
            if (c15007b5 == null) {
                Intrinsics.m97819y("mAdapter");
            } else {
                c15007b = c15007b5;
            }
            c15007b.m36186h0().m108667s();
        }
    }

    private final void showEmpty() {
        hideProgress();
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        View emptyView = getEmptyView(contextRequireContext);
        C15007b c15007b = this.mAdapter;
        if (c15007b == null) {
            Intrinsics.m97819y("mAdapter");
            c15007b = null;
        }
        c15007b.m36171Y0(emptyView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showProgress() {
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        C24690m0 c24690m0;
        ConstraintLayout constraintLayout;
        C24704z c24704z = (C24704z) getMViewBinding();
        if (c24704z != null && (c24690m0 = c24704z.f75601c) != null && (constraintLayout = c24690m0.f75513h) != null) {
            AbstractC26006c.m102058k(constraintLayout);
        }
        C24704z c24704z2 = (C24704z) getMViewBinding();
        if (c24704z2 == null || (customSwipeRefreshLayout = c24704z2.f75603e) == null) {
            return;
        }
        customSwipeRefreshLayout.setEnabled(false);
    }

    /* JADX INFO: renamed from: t1 */
    private final View m68376t1(Context context) {
        NoNetworkBigView noNetworkBigView = new NoNetworkBigView(context);
        this.mNoNetworkView = noNetworkBigView;
        noNetworkBigView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        NoNetworkBigView.showTitle$default(noNetworkBigView, false, null, 2, null);
        noNetworkBigView.retry(new Function0() { // from class: com.transsion.home.fragment.tab.k1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrendingFragment.m68378u1(this.f53279a);
            }
        });
        noNetworkBigView.goToSetting(new Function0() { // from class: com.transsion.home.fragment.tab.l1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrendingFragment.m68380v1(this.f53283a);
            }
        });
        AbstractC13772o.m62233a(getPageName());
        return noNetworkBigView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public static final Unit m68378u1(TrendingFragment trendingFragment) {
        m68334Y1(trendingFragment, false, 1, null);
        AbstractC13772o.m62234b(trendingFragment.getPageName());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public static final Unit m68380v1(TrendingFragment trendingFragment) {
        AbstractC13772o.m62235c(trendingFragment.getPageName());
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: w1 */
    private final String m68382w1() {
        return C23057a.f70290a.m91717b();
    }

    /* JADX INFO: renamed from: x1 */
    private final InterfaceC23181a m68384x1() {
        return (InterfaceC23181a) this.fissionProvider.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y1 */
    public final float m68386y1() {
        View view;
        C24704z c24704z = (C24704z) getMViewBinding();
        if (c24704z == null || (view = c24704z.f75604f) == null) {
            return 0.0f;
        }
        return view.getAlpha();
    }

    /* JADX INFO: renamed from: z1 */
    private final HomePreferencesViewModel m68388z1() {
        return (HomePreferencesViewModel) this.homePreferencesViewModel.getValue();
    }

    /* JADX INFO: renamed from: D1, reason: from getter */
    public final C25647c getPostListReport() {
        return this.postListReport;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: E1, reason: merged with bridge method [inline-methods] */
    public C24704z getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        KeyEventDispatcher.Component activity = getActivity();
        Intrinsics.m97800f(activity, "null cannot be cast to non-null type com.transsion.home.preload.MainXMLPreload");
        InterfaceC15428b interfaceC15428bMo66689d = ((InterfaceC15427a) activity).mo66689d();
        Boolean boolValueOf = interfaceC15428bMo66689d != null ? Boolean.valueOf(interfaceC15428bMo66689d.mo68502e()) : null;
        View viewMo68503f = interfaceC15428bMo66689d != null ? interfaceC15428bMo66689d.mo68503f() : null;
        if (viewMo68503f == null || !Intrinsics.m97797c(boolValueOf, Boolean.FALSE)) {
            C24704z c24704zM97029c = C24704z.m97029c(inflater);
            Intrinsics.m97801g(c24704zM97029c, "inflate(...)");
            return c24704zM97029c;
        }
        C26866a.a.m104898f(C26866a.f81698a, "MainXMLPreload", "postlist root ", false, 4, null);
        C24704z c24704zM97028a = C24704z.m97028a(viewMo68503f);
        Intrinsics.m97801g(c24704zM97028a, "bind(...)");
        return c24704zM97028a;
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: c0 */
    public void mo67722c0() {
        String version;
        super.mo67722c0();
        BiddingListManager v3ListManager = getV3ListManager();
        if (v3ListManager != null) {
            v3ListManager.m63181C(true);
        }
        this.nextPage = "1";
        Context context = getContext();
        if (context != null) {
            PreloadTrendingData preloadTrendingDataM69164a = PreloadTrendingData.f53717n.m69164a();
            MainOperateData mainOperateData = this.operatingResp;
            if (mainOperateData == null || (version = mainOperateData.getVersion()) == null) {
                version = "";
            }
            if (preloadTrendingDataM69164a.m69161X(context, version)) {
                return;
            }
            hideProgress();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: f0 */
    public RecyclerView mo67723f0() {
        C24704z c24704z = (C24704z) getMViewBinding();
        if (c24704z != null) {
            return c24704z.f75602d;
        }
        return null;
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: g0 */
    public String mo67724g0() {
        return m68382w1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g2 */
    public final void m68391g2() {
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        RecyclerView recyclerView;
        if (isAdded()) {
            C24704z c24704z = (C24704z) getMViewBinding();
            if (c24704z != null && (recyclerView = c24704z.f75602d) != null) {
                recyclerView.scrollToPosition(0);
            }
            C24704z c24704z2 = (C24704z) getMViewBinding();
            if (c24704z2 == null || (customSwipeRefreshLayout = c24704z2.f75603e) == null) {
                return;
            }
            customSwipeRefreshLayout.post(new Runnable() { // from class: com.transsion.home.fragment.tab.p1
                @Override // java.lang.Runnable
                public final void run() {
                    TrendingFragment.m68351h2(this.f53296a);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment, com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        CustomSwipeRefreshLayout customSwipeRefreshLayout2;
        View view2;
        ViewGroup.LayoutParams layoutParams;
        RecyclerView recyclerView;
        ViewTreeObserver viewTreeObserver;
        Intrinsics.m97802h(view, "view");
        super.initView(view, savedInstanceState);
        TrendingViewModel trendingViewModel = this.mPostListModel;
        if (trendingViewModel != null) {
            trendingViewModel.m70952N(getPageName());
        }
        m68310M1();
        AppStartReport appStartReport = AppStartReport.f62550a;
        appStartReport.m81548l("trending_list");
        initViewModel();
        appStartReport.m81548l("trending_vm");
        setNetListener(new C15322h());
        C24704z c24704z = (C24704z) getMViewBinding();
        if (c24704z != null && (recyclerView = c24704z.f75602d) != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC15323i());
        }
        this.mLauncher = registerForActivityResult(new C23282h(), new InterfaceC0248a() { // from class: com.transsion.home.fragment.tab.s0
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                TrendingFragment.m68324T1(this.f53308a, (Map) obj);
            }
        });
        m68349g1();
        this.mHeaderBgHeight = m68103h0();
        C24704z c24704z2 = (C24704z) getMViewBinding();
        if (c24704z2 != null && (view2 = c24704z2.f75604f) != null && (layoutParams = view2.getLayoutParams()) != null) {
            layoutParams.height = this.mHeaderBgHeight;
        }
        C24704z c24704z3 = (C24704z) getMViewBinding();
        ViewGroup.LayoutParams layoutParams2 = (c24704z3 == null || (customSwipeRefreshLayout2 = c24704z3.f75603e) == null) ? null : customSwipeRefreshLayout2.getLayoutParams();
        FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            layoutParams3.topMargin = this.mHeaderBgHeight;
            C24704z c24704z4 = (C24704z) getMViewBinding();
            if (c24704z4 != null && (customSwipeRefreshLayout = c24704z4.f75603e) != null) {
                customSwipeRefreshLayout.setLayoutParams(layoutParams3);
            }
        }
        if (savedInstanceState != null && savedInstanceState.getBoolean("operate_items", false)) {
            C26866a.a.m104898f(C26866a.f81698a, "lgx", "get save instance", false, 4, null);
            List listM69157L = PreloadTrendingData.f53717n.m69164a().m69157L();
            C15007b c15007b = this.mAdapter;
            if (c15007b == null) {
                Intrinsics.m97819y("mAdapter");
                c15007b = null;
            }
            c15007b.mo36201n1(listM69157L);
            m68367q1(this, m68304J1(listM69157L), 0, 2, null);
        }
        initAd();
        appStartReport.m81548l("trending_view_init");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: l0 */
    public void mo67725l0(final int lastAdPosition, BiddingNativeManager wrapperNativeManager) {
        String value;
        RecyclerView recyclerView;
        Intrinsics.m97802h(wrapperNativeManager, "wrapperNativeManager");
        if (wrapperNativeManager != null) {
            final OperateItem operateItem = new OperateItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823, null);
            operateItem.setNonAdDelegate(wrapperNativeManager);
            C15007b c15007b = this.mAdapter;
            C15007b c15007b2 = null;
            if (c15007b == null) {
                Intrinsics.m97819y("mAdapter");
                c15007b = null;
            }
            final int size = c15007b.getData().size();
            C15007b c15007b3 = this.mAdapter;
            if (c15007b3 == null) {
                Intrinsics.m97819y("mAdapter");
                c15007b3 = null;
            }
            if (!c15007b3.getIsGridTrendingAdapter()) {
                value = PostItemType.TRENDING_NATIVE_AD.getValue();
            } else if (1 > lastAdPosition || lastAdPosition >= size) {
                value = PostItemType.SUBJECT.getValue();
            } else {
                C15007b c15007b4 = this.mAdapter;
                if (c15007b4 == null) {
                    Intrinsics.m97819y("mAdapter");
                } else {
                    c15007b2 = c15007b4;
                }
                if (Intrinsics.m97797c(((OperateItem) c15007b2.getData().get(lastAdPosition)).getType(), PostItemType.SUBJECT.getValue())) {
                    value = PostItemType.SUBJECT.getValue();
                } else {
                    value = PostItemType.TRENDING_NATIVE_AD.getValue();
                }
            }
            operateItem.setType(value);
            if (Intrinsics.m97797c(operateItem.getType(), PostItemType.SUBJECT.getValue())) {
                BiddingListManager v3ListManager = getV3ListManager();
                if (v3ListManager != null) {
                    v3ListManager.m63181C(false);
                    return;
                }
                return;
            }
            C24704z c24704z = (C24704z) getMViewBinding();
            if (c24704z == null || (recyclerView = c24704z.f75602d) == null) {
                return;
            }
            recyclerView.post(new Runnable() { // from class: com.transsion.home.fragment.tab.z0
                @Override // java.lang.Runnable
                public final void run() {
                    TrendingFragment.m68346e2(lastAdPosition, size, this, operateItem);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l2 */
    public final void m68392l2() {
        FragmentActivity activity = getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        if (baseActivity != null) {
            baseActivity.setStateCallback(new Function1() { // from class: com.transsion.home.fragment.tab.o1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TrendingFragment.m68360m2(this.f53294a, (String) obj);
                }
            });
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        List<OperateItem> items;
        MainOperateData mainOperateData = this.operatingResp;
        if (mainOperateData == null || (items = mainOperateData.getItems()) == null || !(!items.isEmpty())) {
            C26866a.a aVar = C26866a.f81698a;
            boolean z11 = this.operatingResp == null;
            C15007b c15007b = this.mAdapter;
            if (c15007b == null) {
                Intrinsics.m97819y("mAdapter");
                c15007b = null;
            }
            aVar.m104912c("PreloadTrending", "lazyLoadData " + z11 + " " + c15007b.getData().size(), true);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("load1 fragment:");
            sb2.append(this);
            C26866a.a.m104898f(aVar, "lgx", sb2.toString(), false, 4, null);
            m68334Y1(this, false, 1, null);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void logResume() {
        super.logResume();
        InterfaceC23181a interfaceC23181aM68384x1 = m68384x1();
        if (interfaceC23181aM68384x1 != null) {
            InterfaceC23181a.a.m92220a(interfaceC23181aM68384x1, false, 1, null);
        }
        InterfaceC23181a interfaceC23181aM68384x2 = m68384x1();
        if (interfaceC23181aM68384x2 != null) {
            interfaceC23181aM68384x2.mo66557c(false);
        }
        C28406e.f87111a.m109772h();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        return new C24655b(getPageName(), false, 2, null);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.m97802h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        C15007b c15007b = this.mAdapter;
        C15007b c15007b2 = null;
        if (c15007b == null) {
            Intrinsics.m97819y("mAdapter");
            c15007b = null;
        }
        if (c15007b.getIsGridTrendingAdapter()) {
            C15007b c15007b3 = this.mAdapter;
            if (c15007b3 == null) {
                Intrinsics.m97819y("mAdapter");
            } else {
                c15007b2 = c15007b3;
            }
            c15007b2.notifyDataSetChanged();
        }
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment, com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        HashMap mapM96844g;
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
            mapM96844g.put("onCreate", "true");
        }
        AppStartReport.f62550a.m81545f(new AppStartDotState(AppStartDotState.TRENDING_CREATE, 0L, 2, null));
        super.onCreate(savedInstanceState);
        this.mPostListModel = (TrendingViewModel) new C3227v0(this).m14969a(TrendingViewModel.class);
        m68392l2();
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mHandler.removeCallbacksAndMessages(null);
        C28121c.f86299a.m109212a();
        BannerADDataHelper.f52406a.m67190j();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden) {
            m68350h1();
        }
        if (isResumed()) {
            if (hidden) {
                logPause();
                m68361n1();
            } else {
                logResume();
                m68336Z1();
            }
        }
        AbstractC14517k.m65410h(null, this, hidden, null, 9, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        m68361n1();
        AbstractC14517k.m65414l(null, this, null, 5, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        HashMap mapM96844g;
        super.onResume();
        C26866a.a aVar = C26866a.f81698a;
        View view = this.mNoNetworkView;
        C26866a.a.m104898f(aVar, "TrendingFragment", "visible = " + (view != null ? Integer.valueOf(view.getVisibility()) : null) + "  " + this, false, 4, null);
        View view2 = this.mNoNetworkView;
        if (view2 != null && view2.getVisibility() == 0 && C27287m.f83003a.m106330e()) {
            C15007b c15007b = this.mAdapter;
            if (c15007b == null) {
                Intrinsics.m97819y("mAdapter");
                c15007b = null;
            }
            if (c15007b.getData().size() < 2) {
                m68334Y1(this, false, 1, null);
            }
        }
        AbstractC14517k.m65418p(null, this, "visible=" + isVisible(), 1, null);
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
            mapM96844g.put("scrollPosition", "0");
        }
        if (this.isAdLoadDisabled) {
            return;
        }
        m68340b2();
        m68336Z1();
        this.isAdLoadDisabled = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.m97802h(outState, "outState");
        super.onSaveInstanceState(outState);
        C15007b c15007b = this.mAdapter;
        C15007b c15007b2 = null;
        if (c15007b == null) {
            Intrinsics.m97819y("mAdapter");
            c15007b = null;
        }
        if (c15007b.getData().size() > 0) {
            PreloadTrendingData preloadTrendingDataM69164a = PreloadTrendingData.f53717n.m69164a();
            C15007b c15007b3 = this.mAdapter;
            if (c15007b3 == null) {
                Intrinsics.m97819y("mAdapter");
            } else {
                c15007b2 = c15007b3;
            }
            preloadTrendingDataM69164a.m69162b0(c15007b2.getData());
            outState.putBoolean("operate_items", true);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AppStartReport.f62550a.m81545f(new AppStartDotState(AppStartDotState.TRENDING_RENDER, 0L, 2, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: p0 */
    public void mo68108p0() {
        RecyclerView recyclerView;
        C24704z c24704z = (C24704z) getMViewBinding();
        if (c24704z == null || (recyclerView = c24704z.f75602d) == null) {
            return;
        }
        recyclerView.smoothScrollToPosition(0);
    }
}
