package com.transsion.home.fragment.tab;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.cloud.tmc.miniapp.prepare.steps.PrepareException;
import com.google.android.material.tabs.TabLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.net.bean.BaseDto;
import com.p282tn.lib.view.AbstractC13772o;
import com.p282tn.lib.view.NoNetworkBigView;
import com.therouter.TheRouter;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.baseui.util.AbstractC14556b;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.R$string;
import com.transsion.home.adapter.C14835a;
import com.transsion.home.bean.Channel;
import com.transsion.home.bean.FilterItems;
import com.transsion.home.bean.Item;
import com.transsion.home.bean.LayoutStyle;
import com.transsion.home.bean.MovieBean;
import com.transsion.home.bean.MovieItem;
import com.transsion.home.bean.RefreshBaseDto;
import com.transsion.home.fragment.home.HomeFragment;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.home.view.filter.popup.PopupFilterView;
import com.transsion.home.view.layoutmanager.OffsetGridLayoutManager;
import com.transsion.home.viewmodel.MovieViewModel;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.push.PushConstants;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mg.C25825b;
import ng.AbstractC26006c;
import org.json.JSONObject;
import p352dn.InterfaceC22998b;
import p550kj.C24655b;
import p550kj.C24662i;
import p552kl.C24678g0;
import p552kl.C24697s;
import p579ll.C25646b;
import p579ll.InterfaceC25645a;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p842vl.AbstractC28126h;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \u00ad\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002®\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J!\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u0004J7\u0010\u001e\u001a\u00020\u00052&\u0010\u001d\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u001bj\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u0001`\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\"\u0010\u0004J\u0019\u0010#\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u00020\u00052\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0%H\u0002¢\u0006\u0004\b'\u0010(J7\u0010+\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010%2\u0006\u0010*\u001a\u00020\u0016H\u0002¢\u0006\u0004\b+\u0010,J!\u0010/\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010*\u001a\u00020\u0016H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0005H\u0002¢\u0006\u0004\b1\u0010\u0004J\u000f\u00102\u001a\u00020\u0005H\u0002¢\u0006\u0004\b2\u0010\u0004J\u0019\u00104\u001a\u00020\u00052\b\u00103\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b4\u0010$J\u0019\u00105\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b5\u0010$J\u000f\u00106\u001a\u00020\u0005H\u0002¢\u0006\u0004\b6\u0010\u0004J\u000f\u00107\u001a\u00020\u0012H\u0002¢\u0006\u0004\b7\u00108J\u001b\u0010:\u001a\u0004\u0018\u0001092\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0012H\u0002¢\u0006\u0004\b<\u00108J\u0017\u0010>\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u0016H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0005H\u0002¢\u0006\u0004\b@\u0010\u0004J\u000f\u0010A\u001a\u00020\tH\u0002¢\u0006\u0004\bA\u0010\u000bJ\u0017\u0010D\u001a\u00020\u00022\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u0019\u0010H\u001a\u00020\u00052\b\u0010G\u001a\u0004\u0018\u00010FH\u0016¢\u0006\u0004\bH\u0010IJ!\u0010L\u001a\u00020\u00052\u0006\u0010K\u001a\u00020J2\b\u0010G\u001a\u0004\u0018\u00010FH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0005H\u0016¢\u0006\u0004\bN\u0010\u0004J\u0017\u0010Q\u001a\u00020\u00052\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RJ\u0019\u0010U\u001a\u00020\u0005*\u00020S2\u0006\u0010T\u001a\u00020\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u0005H\u0016¢\u0006\u0004\bW\u0010\u0004J\u000f\u0010X\u001a\u00020\u0005H\u0016¢\u0006\u0004\bX\u0010\u0004J\u000f\u0010Y\u001a\u00020\u0005H\u0016¢\u0006\u0004\bY\u0010\u0004J\u000f\u0010Z\u001a\u00020\u0005H\u0016¢\u0006\u0004\bZ\u0010\u0004J\u0017\u0010\\\u001a\u00020\u00052\u0006\u0010[\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\\\u0010?J\u000f\u0010]\u001a\u00020\u0005H\u0016¢\u0006\u0004\b]\u0010\u0004J\u000f\u0010_\u001a\u00020^H\u0016¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\u0005H\u0016¢\u0006\u0004\ba\u0010\u0004J\u0017\u0010d\u001a\u00020\t2\b\u0010c\u001a\u0004\u0018\u00010b¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020\tH\u0016¢\u0006\u0004\bf\u0010\u000bJ\u000f\u0010g\u001a\u00020\u0005H\u0016¢\u0006\u0004\bg\u0010\u0004J\u0011\u0010i\u001a\u0004\u0018\u00010hH\u0016¢\u0006\u0004\bi\u0010jJ\u001f\u0010n\u001a\u00020\u00052\u0006\u0010k\u001a\u00020\u00122\u0006\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bn\u0010oR\u001d\u0010u\u001a\u0004\u0018\u00010p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0018\u0010y\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010}\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0019\u0010\u0083\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0088\u0001R\u001b\u0010\u008d\u0001\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0088\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u0082\u0001Rq\u0010\u0092\u0001\u001aZ\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\u001c0\u001bj,\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\u001c`\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001a\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0088\u0001R\u001c\u0010 \u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R'\u0010£\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0019\u0010¦\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u001a\u0010¨\u0001\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b§\u0001\u0010\u007fR\u001a\u0010ª\u0001\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b©\u0001\u0010\u007fR\u001a\u0010¬\u0001\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b«\u0001\u0010\u007f¨\u0006¯\u0001"}, m97100d2 = {"Lcom/transsion/home/fragment/tab/MovieFragment;", "Lcom/transsion/home/fragment/tab/BaseHomeSubFragment;", "Lkl/s;", "<init>", "()V", "", "initScrollListener", "m1", "n1", "", "Z0", "()Ljava/lang/String;", "k1", TmcStartParams.KEY_CHANNEL_ID, "", "Lcom/transsion/home/bean/Item;", "Y0", "(Ljava/lang/String;)Ljava/util/List;", "", RequestParameters.POSITION, "V0", "(I)V", "", "h1", "()Z", "initViewModel", "A1", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "selectItems", "J1", "(Ljava/util/HashMap;)V", "loadData", "C1", "loadMore", "x1", "(Ljava/lang/String;)V", "", "selectedMap", "w1", "(Ljava/util/Map;)V", "selectedItems", "isRefresh", "X0", "(Ljava/lang/String;Ljava/util/Map;Z)V", "Lcom/transsion/home/bean/MovieBean;", "movieBean", "H1", "(Lcom/transsion/home/bean/MovieBean;Z)V", "showLoadingView", "i1", "string", "F1", "W0", "j1", "e1", "()I", "Lcom/transsion/home/bean/LayoutStyle;", "a1", "(Ljava/lang/String;)Lcom/transsion/home/bean/LayoutStyle;", "b1", PushConstants.PUSH_SERVICE_TYPE_SHOW, "z1", "(Z)V", "l1", "d1", "Landroid/view/LayoutInflater;", "inflater", "g1", "(Landroid/view/LayoutInflater;)Lkl/s;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "p0", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/google/android/material/tabs/TabLayout$Tab;", "selected", "B1", "(Lcom/google/android/material/tabs/TabLayout$Tab;Z)V", "lazyLoadData", "startLoading", "hideLoading", "onResume", "hidden", "onHiddenChanged", "onPause", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "onDestroyView", "Lcom/transsion/home/bean/FilterItems;", "filterItems", "f1", "(Lcom/transsion/home/bean/FilterItems;)Ljava/lang/String;", "g0", "c0", "Landroidx/recyclerview/widget/RecyclerView;", "f0", "()Landroidx/recyclerview/widget/RecyclerView;", "lastAdPosition", "Lcom/transsion/ad/bidding/nativead/BiddingNativeManager;", "wrapperNativeManager", "l0", "(ILcom/transsion/ad/bidding/nativead/BiddingNativeManager;)V", "Ldn/b;", "g", "Lkotlin/Lazy;", "c1", "()Ldn/b;", "memberProvider", "Lcom/transsion/home/adapter/a;", "h", "Lcom/transsion/home/adapter/a;", "mAdapter", "Lcom/transsion/home/viewmodel/MovieViewModel;", "i", "Lcom/transsion/home/viewmodel/MovieViewModel;", "mMovieModel", "j", "Landroid/view/View;", "header", CampaignEx.JSON_KEY_AD_K, "I", "mPage", "l", "Lcom/transsion/home/bean/FilterItems;", "mFilterItems", "m", "Ljava/lang/String;", "mChannelId", "n", "mDeeplinkChannelId", "o", "mFilterJson", TtmlNode.TAG_P, "mPerPage", CampaignEx.JSON_KEY_AD_Q, "Ljava/util/HashMap;", "mSubjectTypeMap", "Lcom/transsion/home/view/filter/popup/PopupFilterView;", CampaignEx.JSON_KEY_AD_R, "Lcom/transsion/home/view/filter/popup/PopupFilterView;", "mFilterView", "", "s", "J", "startShowTime", "t", "mPageFrom", "Lll/b;", TmcStartParams.KEY_URL_SHORT, "Lll/b;", "mExposureHelper", "v", "Ljava/util/Map;", "mLatestSelectItems", "w", "Z", "isViewInitialized", "x", "mNoNetworkView", "y", "mLoadingView", "z", "mNoResultView", "A", "a", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class MovieFragment extends BaseHomeSubFragment<C24697s> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: B */
    public static final int f53096B = 8;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private C14835a mAdapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private MovieViewModel mMovieModel;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private View header;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private FilterItems mFilterItems;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private String mChannelId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private String mDeeplinkChannelId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private String mFilterJson;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private PopupFilterView mFilterView;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private long startShowTime;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private C25646b mExposureHelper;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private Map mLatestSelectItems;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private boolean isViewInitialized;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private View mNoNetworkView;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private View mLoadingView;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private View mNoResultView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy memberProvider = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.fragment.tab.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MovieFragment.m68196y1();
        }
    });

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int mPage = 1;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int mPerPage = 12;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private HashMap mSubjectTypeMap = new HashMap();

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private String mPageFrom = C24662i.f75350a.m96877i();

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.MovieFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ MovieFragment m68202b(Companion companion, int i11, boolean z11, String str, String str2, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                z11 = false;
            }
            if ((i12 & 4) != 0) {
                str = null;
            }
            if ((i12 & 8) != 0) {
                str2 = "";
            }
            return companion.m68203a(i11, z11, str, str2);
        }

        /* JADX INFO: renamed from: a */
        public final MovieFragment m68203a(int i11, boolean z11, String str, String str2) {
            Bundle bundle = new Bundle();
            bundle.putInt("tab_id", i11);
            bundle.putString(WebConstants.TAB_CODE, str2);
            bundle.putBoolean("hide_header_bg", z11);
            bundle.putString("filter_json", str);
            MovieFragment movieFragment = new MovieFragment();
            movieFragment.setArguments(bundle);
            return movieFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.MovieFragment$b */
    public static final class C15301b implements TabLayout.OnTabSelectedListener {
        C15301b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            C26866a.a.m104898f(C26866a.f81698a, "MovieFragment", "release tab " + (tab != null ? Integer.valueOf(tab.getPosition()) : null), false, 4, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            RecyclerView recyclerView;
            C26866a.a.m104898f(C26866a.f81698a, "MovieFragment", "selected tab " + (tab != null ? Integer.valueOf(tab.getPosition()) : null), false, 4, null);
            if (tab != null) {
                MovieFragment.this.m68199B1(tab, true);
            }
            MovieFragment.this.startShowTime = SystemClock.elapsedRealtime();
            MovieFragment movieFragment = MovieFragment.this;
            movieFragment.mPageFrom = movieFragment.m68200f1(movieFragment.mFilterItems);
            if (tab == null) {
                return;
            }
            MovieFragment.this.m68161V0(tab.getPosition());
            C14450a.f50860a.m65145h(MovieFragment.this.mPageFrom, MovieFragment.this.mPageFrom, (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
            C25646b c25646b = MovieFragment.this.mExposureHelper;
            if (c25646b != null) {
                c25646b.m100943e();
            }
            MovieFragment movieFragment2 = MovieFragment.this;
            movieFragment2.m68194x1(movieFragment2.mChannelId);
            MovieFragment movieFragment3 = MovieFragment.this;
            movieFragment3.m68149J1((HashMap) movieFragment3.mSubjectTypeMap.get(MovieFragment.this.mChannelId));
            C24697s c24697s = (C24697s) MovieFragment.this.getMViewBinding();
            if (c24697s == null || (recyclerView = c24697s.f75565c) == null) {
                return;
            }
            recyclerView.scrollToPosition(0);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            if (tab != null) {
                MovieFragment.this.m68199B1(tab, false);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C14450a c14450a = C14450a.f50860a;
            MovieFragment movieFragment = MovieFragment.this;
            c14450a.m65147k(movieFragment.m68200f1(movieFragment.mFilterItems), MovieFragment.this.mPageFrom, String.valueOf(jElapsedRealtime - MovieFragment.this.startShowTime));
            C26866a.a.m104898f(C26866a.f81698a, "MovieFragment", "unselected tab " + (tab != null ? Integer.valueOf(tab.getPosition()) : null), false, 4, null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.MovieFragment$c */
    public static final class C15302c implements InterfaceC25645a {
        C15302c() {
        }

        @Override // p579ll.InterfaceC25645a
        /* JADX INFO: renamed from: a */
        public void mo67486a(int i11, long j11, View view) {
            List<Object> data;
            String subjectId;
            String ops;
            C14835a c14835a = MovieFragment.this.mAdapter;
            if (c14835a == null || (data = c14835a.getData()) == null) {
                return;
            }
            int size = data.size();
            MovieFragment movieFragment = MovieFragment.this;
            if (i11 >= size) {
                return;
            }
            C14835a c14835a2 = movieFragment.mAdapter;
            MovieItem movieItem = c14835a2 != null ? (MovieItem) c14835a2.getItem(i11) : null;
            HashMap map = new HashMap();
            String str = "";
            if (movieItem == null || (subjectId = movieItem.getSubjectId()) == null) {
                subjectId = "";
            }
            map.put("subject_id", subjectId);
            map.put("has_resource", String.valueOf(movieItem != null ? movieItem.getHasResource() : null));
            map.put("sequence", String.valueOf(i11));
            if (movieItem != null && (ops = movieItem.getOps()) != null) {
                str = ops;
            }
            map.put("ops", str);
            map.put("filter_name", movieFragment.m68165Z0());
            map.put("browse_duration", String.valueOf(j11));
            C14450a.f50860a.m65142e(movieFragment.m68200f1(movieFragment.mFilterItems), map);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.MovieFragment$d */
    public static final class C15303d extends DiffUtil.AbstractC4174e {
        C15303d() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(MovieItem oldItem, MovieItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getSubjectId(), newItem.getSubjectId());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(MovieItem oldItem, MovieItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getSubjectType(), newItem.getSubjectType());
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.MovieFragment$e */
    public static final class C15304e extends RecyclerView.AbstractC4219r {

        /* JADX INFO: renamed from: a */
        private int[] f53119a;

        /* JADX INFO: renamed from: b */
        private int f53120b;

        C15304e() {
        }

        /* JADX INFO: renamed from: d */
        private final void m68206d(RecyclerView recyclerView) {
            RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                if (this.f53119a == null) {
                    this.f53119a = new int[((StaggeredGridLayoutManager) layoutManager).m20978Q()];
                }
                ((StaggeredGridLayoutManager) layoutManager).m20974E(this.f53119a);
                this.f53120b = m68207e(this.f53119a);
                return;
            }
            if (layoutManager instanceof GridLayoutManager) {
                this.f53120b = ((GridLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
            } else {
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    throw new RuntimeException("Unsupported layoutManager.");
                }
                this.f53120b = ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
            }
        }

        /* JADX INFO: renamed from: e */
        private final int m68207e(int[] iArr) {
            if (iArr == null) {
                return 0;
            }
            int i11 = 0;
            for (int i12 : iArr) {
                if (i12 > i11) {
                    i11 = i12;
                }
            }
            return i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            C14835a c14835a;
            C27941f c27941fM36186h0;
            C27941f c27941fM36186h1;
            Intrinsics.m97802h(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i11);
            RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
            int childCount = layoutManager != null ? layoutManager.getChildCount() : 0;
            int itemCount = layoutManager != null ? layoutManager.getItemCount() : 0;
            if (i11 != 0 || childCount <= 0 || this.f53120b < itemCount - 1) {
                return;
            }
            C14835a c14835a2 = MovieFragment.this.mAdapter;
            if (((c14835a2 == null || (c27941fM36186h1 = c14835a2.m36186h0()) == null) ? null : c27941fM36186h1.m108661i()) != LoadMoreStatus.Fail || (c14835a = MovieFragment.this.mAdapter) == null || (c27941fM36186h0 = c14835a.m36186h0()) == null) {
                return;
            }
            c27941fM36186h0.m108670w();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            m68206d(recyclerView);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.MovieFragment$f */
    public static final class C15305f implements InterfaceC27288n {
        C15305f() {
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected() {
            InterfaceC27288n.a.m106338a(this);
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
            C27941f c27941fM36186h0;
            List<Object> data;
            List<Object> data2;
            List<Object> data3;
            Intrinsics.m97802h(network, "network");
            Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
            if (MovieFragment.this.isResumed()) {
                C14835a c14835a = MovieFragment.this.mAdapter;
                if (c14835a != null && (data3 = c14835a.getData()) != null && data3.isEmpty()) {
                    View view = MovieFragment.this.mNoNetworkView;
                    if (view != null) {
                        AbstractC26006c.m102054g(view);
                    }
                    MovieFragment.this.loadData();
                    return;
                }
                C14835a c14835a2 = MovieFragment.this.mAdapter;
                int size = (c14835a2 == null || (data2 = c14835a2.getData()) == null) ? 0 : data2.size();
                if (size <= 0) {
                    MovieFragment movieFragment = MovieFragment.this;
                    movieFragment.m68163X0(movieFragment.mChannelId, MovieFragment.this.mLatestSelectItems, true);
                    return;
                }
                C14835a c14835a3 = MovieFragment.this.mAdapter;
                MovieItem movieItem = (c14835a3 == null || (data = c14835a3.getData()) == null) ? null : (MovieItem) data.get(size - 1);
                if (Intrinsics.m97797c(MovieFragment.this.mChannelId, movieItem != null ? movieItem.getChannelId() : null)) {
                    if (Intrinsics.m97797c(MovieFragment.this.mLatestSelectItems, movieItem != null ? movieItem.getSelectItems() : null)) {
                        C14835a c14835a4 = MovieFragment.this.mAdapter;
                        if (c14835a4 == null || (c27941fM36186h0 = c14835a4.m36186h0()) == null) {
                            return;
                        }
                        c27941fM36186h0.m108670w();
                        return;
                    }
                }
                MovieFragment movieFragment2 = MovieFragment.this;
                movieFragment2.m68163X0(movieFragment2.mChannelId, MovieFragment.this.mLatestSelectItems, true);
            }
        }

        @Override // p743rh.InterfaceC27288n
        public void onDisconnected() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.MovieFragment$g */
    static final class C15306g implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f53123a;

        C15306g(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f53123a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f53123a;
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
            this.f53123a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: A1 */
    private final void m68132A1() {
        PopupFilterView popupFilterView = this.mFilterView;
        if (popupFilterView != null) {
            PopupFilterView.initSelectData$default(popupFilterView, m68164Y0(this.mChannelId), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: C1 */
    private final void m68135C1() {
        View view = this.header;
        if (view != null) {
            ViewStub viewStub = (ViewStub) view.findViewById(R$id.no_network_stub);
            if (this.mNoNetworkView == null) {
                this.mNoNetworkView = viewStub.inflate();
            }
            View view2 = this.mNoNetworkView;
            if (view2 != null) {
                AbstractC26006c.m102058k(view2);
                final NoNetworkBigView noNetworkBigView = (NoNetworkBigView) view2.findViewById(R$id.state_view);
                if (noNetworkBigView != null) {
                    NoNetworkBigView.showTitle$default(noNetworkBigView, false, null, 2, null);
                    noNetworkBigView.retry(new Function0() { // from class: com.transsion.home.fragment.tab.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MovieFragment.m68137D1(noNetworkBigView, this);
                        }
                    });
                    noNetworkBigView.goToSetting(new Function0() { // from class: com.transsion.home.fragment.tab.l
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MovieFragment.m68139E1(this.f53281a);
                        }
                    });
                }
                AbstractC13772o.m62233a(m68169d1());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public static final Unit m68137D1(NoNetworkBigView noNetworkBigView, MovieFragment movieFragment) {
        AbstractC26006c.m102054g(noNetworkBigView);
        movieFragment.loadData();
        AbstractC13772o.m62234b(movieFragment.m68169d1());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public static final Unit m68139E1(MovieFragment movieFragment) {
        AbstractC13772o.m62235c(movieFragment.m68169d1());
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: F1 */
    private final void m68141F1(String string) {
        View view = this.header;
        if (view != null) {
            ViewStub viewStub = (ViewStub) view.findViewById(R$id.no_result_stub);
            if (this.mNoResultView == null) {
                this.mNoResultView = viewStub.inflate();
            }
            final View view2 = this.mNoResultView;
            if (view2 != null) {
                AbstractC26006c.m102058k(view2);
                TextView textView = (TextView) view2.findViewById(R$id.tv_no_result);
                if (textView != null) {
                    textView.setText(string);
                }
                View viewFindViewById = view2.findViewById(R$id.tv_reset);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.fragment.tab.s
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            MovieFragment.m68143G1(this.f53306a, view2, view3);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public static final void m68143G1(MovieFragment movieFragment, View view, View view2) {
        movieFragment.m68162W0(movieFragment.mChannelId);
        movieFragment.m68194x1(movieFragment.mChannelId);
        AbstractC26006c.m102054g(view);
        movieFragment.startLoading();
        movieFragment.m68132A1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H1 */
    private final void m68145H1(MovieBean movieBean, boolean isRefresh) {
        C27941f c27941fM36186h0;
        C24697s c24697s;
        LinearLayout linearLayoutM97003b;
        C27941f c27941fM36186h1;
        C14835a c14835a;
        C27941f c27941fM36186h2;
        SwipeRefreshLayout swipeRefreshLayout;
        C24697s c24697s2;
        SwipeRefreshLayout swipeRefreshLayout2;
        Integer perPage;
        if (movieBean != null) {
            Pager pager = movieBean.getPager();
            this.mPerPage = (pager == null || (perPage = pager.getPerPage()) == null) ? 10 : perPage.intValue();
            if (isRefresh) {
                C24697s c24697s3 = (C24697s) getMViewBinding();
                if (c24697s3 != null && (swipeRefreshLayout = c24697s3.f75569g) != null && swipeRefreshLayout.isRefreshing() && (c24697s2 = (C24697s) getMViewBinding()) != null && (swipeRefreshLayout2 = c24697s2.f75569g) != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
                C14835a c14835a2 = this.mAdapter;
                if (c14835a2 != null) {
                    c14835a2.mo36201n1(movieBean.getItems());
                }
                List<MovieItem> items = movieBean.getItems();
                if (items == null || !items.isEmpty()) {
                    m68173j1();
                } else {
                    m68141F1(getString(R$string.no_filter_result));
                }
            } else {
                C14835a c14835a3 = this.mAdapter;
                List<Object> data = c14835a3 != null ? c14835a3.getData() : null;
                ArrayList arrayList = new ArrayList();
                List<MovieItem> items2 = movieBean.getItems();
                if (items2 == null) {
                    items2 = CollectionsKt.m97506l();
                }
                if (data == null || !(!data.isEmpty())) {
                    arrayList.addAll(items2);
                } else {
                    for (MovieItem movieItem : items2) {
                        if (!data.contains(movieItem)) {
                            arrayList.add(movieItem);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    C14835a c14835a4 = this.mAdapter;
                    if (c14835a4 == null || (c27941fM36186h1 = c14835a4.m36186h0()) == null) {
                        return;
                    }
                    C27941f.m108652u(c27941fM36186h1, false, 1, null);
                    return;
                }
                C14835a c14835a5 = this.mAdapter;
                if (c14835a5 != null) {
                    c14835a5.mo36208q(arrayList);
                }
                C14835a c14835a6 = this.mAdapter;
                if (c14835a6 != null && (c27941fM36186h0 = c14835a6.m36186h0()) != null && c27941fM36186h0.m108666r() && (c24697s = (C24697s) getMViewBinding()) != null && (linearLayoutM97003b = c24697s.getRoot()) != null) {
                    linearLayoutM97003b.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.tab.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            MovieFragment.m68147I1(this.f53310a);
                        }
                    }, 300L);
                }
            }
            Pager pager2 = movieBean.getPager();
            if (!(pager2 != null ? Intrinsics.m97797c(pager2.getHasMore(), Boolean.FALSE) : false) || (c14835a = this.mAdapter) == null || (c27941fM36186h2 = c14835a.m36186h0()) == null) {
                return;
            }
            C27941f.m108652u(c27941fM36186h2, false, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public static final void m68147I1(MovieFragment movieFragment) {
        C27941f c27941fM36186h0;
        C14835a c14835a = movieFragment.mAdapter;
        if (c14835a == null || (c27941fM36186h0 = c14835a.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108667s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J1 */
    public final void m68149J1(HashMap selectItems) {
        PopupFilterView popupFilterView = this.mFilterView;
        if (popupFilterView != null) {
            popupFilterView.initSelectData(m68164Y0(this.mChannelId), selectItems);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V0 */
    public final void m68161V0(int position) {
        String channelId;
        List<Channel> typeList;
        Channel channel;
        RecyclerView recyclerView;
        List<Channel> typeList2;
        FilterItems filterItems = this.mFilterItems;
        int size = (filterItems == null || (typeList2 = filterItems.getTypeList()) == null) ? -1 : typeList2.size();
        if (position < 0 || position >= size) {
            return;
        }
        RecyclerView.AbstractC4214m layoutManager = null;
        if (m68171h1()) {
            channelId = this.mDeeplinkChannelId;
        } else {
            FilterItems filterItems2 = this.mFilterItems;
            channelId = (filterItems2 == null || (typeList = filterItems2.getTypeList()) == null || (channel = typeList.get(position)) == null) ? null : channel.getChannelId();
        }
        this.mChannelId = channelId;
        this.mDeeplinkChannelId = null;
        View view = this.header;
        if (view != null) {
            C24697s c24697s = (C24697s) getMViewBinding();
            if (c24697s != null && (recyclerView = c24697s.f75565c) != null) {
                layoutManager = recyclerView.getLayoutManager();
            }
            if (layoutManager instanceof OffsetGridLayoutManager) {
                OffsetGridLayoutManager offsetGridLayoutManager = (OffsetGridLayoutManager) layoutManager;
                if (offsetGridLayoutManager.m20737U() == m68170e1()) {
                    C26866a.a.m104898f(C26866a.f81698a, "MovieFragment", "span count is same " + offsetGridLayoutManager.m20737U(), false, 4, null);
                    return;
                }
            }
            m68177n1();
            ViewParent parent = view.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(view);
            }
            C14835a c14835a = this.mAdapter;
            if (c14835a != null) {
                BaseQuickAdapter.m36130y(c14835a, view, 0, 0, 6, null);
            }
            showLoadingView();
        }
    }

    /* JADX INFO: renamed from: W0 */
    private final void m68162W0(String channelId) {
        HashMap map = (HashMap) this.mSubjectTypeMap.get(channelId);
        if (map != null) {
            map.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public final void m68163X0(String channelId, Map selectedItems, boolean isRefresh) {
        MovieViewModel movieViewModel = this.mMovieModel;
        if (movieViewModel != null) {
            int i11 = this.mPage;
            this.mPage = i11 + 1;
            movieViewModel.m68959k(i11, this.mPerPage, channelId, selectedItems, isRefresh);
        }
        this.mLatestSelectItems = selectedItems;
        m68109q0(selectedItems);
    }

    /* JADX INFO: renamed from: Y0 */
    private final List m68164Y0(String channelId) {
        List<Channel> typeList;
        FilterItems filterItems = this.mFilterItems;
        if (filterItems == null || (typeList = filterItems.getTypeList()) == null) {
            return null;
        }
        for (Channel channel : typeList) {
            if (Intrinsics.m97797c(channel.getChannelId(), channelId)) {
                return channel.getItems();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public final String m68165Z0() {
        String str;
        HashMap map = (HashMap) this.mSubjectTypeMap.get(this.mChannelId);
        if (map == null || (str = (String) map.get("sort")) == null) {
            str = "";
        }
        return "filter_" + str;
    }

    /* JADX INFO: renamed from: a1 */
    private final LayoutStyle m68166a1(String channelId) {
        List<Channel> typeList;
        FilterItems filterItems = this.mFilterItems;
        if (filterItems == null || (typeList = filterItems.getTypeList()) == null) {
            return null;
        }
        for (Channel channel : typeList) {
            if (Intrinsics.m97797c(channel.getChannelId(), channelId)) {
                return channel.getStyle();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b1 */
    private final int m68167b1() {
        return R$layout.home_empty_view_loading;
    }

    /* JADX INFO: renamed from: c1 */
    private final InterfaceC22998b m68168c1() {
        return (InterfaceC22998b) this.memberProvider.getValue();
    }

    /* JADX INFO: renamed from: d1 */
    private final String m68169d1() {
        Fragment parentFragment = getParentFragment();
        return parentFragment instanceof HomeFragment ? ((HomeFragment) parentFragment).m67935J0() : "";
    }

    /* JADX INFO: renamed from: e1 */
    private final int m68170e1() {
        LayoutStyle layoutStyleM68166a1 = m68166a1(this.mChannelId);
        if (layoutStyleM68166a1 != null) {
            int colNum = layoutStyleM68166a1.getColNum();
            FragmentActivity activity = getActivity();
            return colNum + ((activity == null || !AbstractC14556b.m65670a(activity)) ? 0 : 1);
        }
        if (Intrinsics.m97797c(this.mChannelId, "5") || Intrinsics.m97797c(this.mChannelId, PrepareException.ERROR_NO_URL) || Intrinsics.m97797c(this.mChannelId, "1003") || Intrinsics.m97797c(this.mChannelId, "1004")) {
            return 2;
        }
        FragmentActivity activity2 = getActivity();
        return (activity2 == null || !AbstractC14556b.m65670a(activity2)) ? 3 : 4;
    }

    /* JADX INFO: renamed from: h1 */
    private final boolean m68171h1() {
        FilterItems filterItems;
        List<Channel> typeList;
        String str = this.mDeeplinkChannelId;
        if (str != null && str.length() != 0 && (filterItems = this.mFilterItems) != null && (typeList = filterItems.getTypeList()) != null) {
            Iterator<T> it = typeList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.m97797c(((Channel) it.next()).getChannelId(), this.mDeeplinkChannelId)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i1 */
    private final void m68172i1() {
        View view = this.mLoadingView;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initScrollListener() {
        RecyclerView recyclerView;
        SwipeRefreshLayout swipeRefreshLayout;
        SwipeRefreshLayout swipeRefreshLayout2;
        C24697s c24697s = (C24697s) getMViewBinding();
        if (c24697s != null && (swipeRefreshLayout2 = c24697s.f75569g) != null) {
            swipeRefreshLayout2.setEnabled(false);
        }
        C24697s c24697s2 = (C24697s) getMViewBinding();
        if (c24697s2 != null && (swipeRefreshLayout = c24697s2.f75569g) != null) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: com.transsion.home.fragment.tab.o
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
                /* JADX INFO: renamed from: a */
                public final void mo21823a() {
                    MovieFragment.m68182r1(this.f53292a);
                }
            });
        }
        C24697s c24697s3 = (C24697s) getMViewBinding();
        if (c24697s3 == null || (recyclerView = c24697s3.f75565c) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new C15304e());
    }

    private final void initViewModel() {
        MovieViewModel movieViewModel = this.mMovieModel;
        if (movieViewModel != null) {
            movieViewModel.m68957i().m14851j(this, new C15306g(new Function1() { // from class: com.transsion.home.fragment.tab.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MovieFragment.m68184s1(this.f53265a, (BaseDto) obj);
                }
            }));
            movieViewModel.m68960l().m14851j(this, new C15306g(new Function1() { // from class: com.transsion.home.fragment.tab.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MovieFragment.m68188u1(this.f53285a, (RefreshBaseDto) obj);
                }
            }));
            PopupFilterView popupFilterView = this.mFilterView;
            if (popupFilterView != null) {
                popupFilterView.setOnFilterListener(new Function1() { // from class: com.transsion.home.fragment.tab.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MovieFragment.m68190v1(this.f53289a, (Map) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: j1 */
    private final void m68173j1() {
        View view = this.mNoResultView;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k1 */
    private final void m68174k1() {
        List<Channel> typeList;
        C24697s c24697s;
        View view;
        List<Channel> typeList2;
        C24678g0 c24678g0;
        C24678g0 c24678g1;
        List<Channel> typeList3;
        FilterItems filterItems = this.mFilterItems;
        int size = 0;
        int size2 = (filterItems == null || (typeList3 = filterItems.getTypeList()) == null) ? 0 : typeList3.size();
        if (size2 <= 0) {
            return;
        }
        C24697s c24697s2 = (C24697s) getMViewBinding();
        ConstraintLayout constraintLayout = null;
        TabLayout tabLayout = (c24697s2 == null || (c24678g1 = c24697s2.f75564b) == null) ? null : c24678g1.f75435d;
        C24697s c24697s3 = (C24697s) getMViewBinding();
        if (c24697s3 != null && (c24678g0 = c24697s3.f75564b) != null) {
            constraintLayout = c24678g0.f75434c;
        }
        if (size2 == 1) {
            if (constraintLayout != null) {
                AbstractC26006c.m102054g(constraintLayout);
            }
            m68194x1(this.mChannelId);
            m68149J1((HashMap) this.mSubjectTypeMap.get(this.mChannelId));
        } else {
            if (constraintLayout != null) {
                AbstractC26006c.m102058k(constraintLayout);
            }
            if (tabLayout != null) {
                tabLayout.removeAllTabs();
            }
            if (tabLayout != null) {
                tabLayout.clearOnTabSelectedListeners();
            }
            if (tabLayout != null) {
                tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C15301b());
            }
            FilterItems filterItems2 = this.mFilterItems;
            if (filterItems2 != null && (typeList = filterItems2.getTypeList()) != null) {
                int i11 = 0;
                for (Object obj : typeList) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.m97515u();
                    }
                    Channel channel = (Channel) obj;
                    if (tabLayout != null) {
                        tabLayout.addTab(tabLayout.newTab().setText(channel.getChannelName()), Intrinsics.m97797c(channel.getChannelId(), this.mChannelId));
                    }
                    i11 = i12;
                }
            }
        }
        if (getParentFragment() instanceof HomeFragment) {
            FilterItems filterItems3 = this.mFilterItems;
            if (filterItems3 != null && (typeList2 = filterItems3.getTypeList()) != null) {
                size = typeList2.size();
            }
            if (size > 1 || (c24697s = (C24697s) getMViewBinding()) == null || (view = c24697s.f75567e) == null) {
                return;
            }
            AbstractC26006c.m102058k(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l1 */
    private final void m68175l1() {
        RecyclerView recyclerView;
        if (this.mExposureHelper == null) {
            C25646b c25646b = new C25646b(0.6f, new C15302c(), false, 4, null);
            C24697s c24697s = (C24697s) getMViewBinding();
            if (c24697s != null && (recyclerView = c24697s.f75565c) != null) {
                recyclerView.addOnScrollListener(c25646b);
            }
            this.mExposureHelper = c25646b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData() {
        startLoading();
        MovieViewModel movieViewModel = this.mMovieModel;
        if (movieViewModel != null) {
            movieViewModel.m68956h(Integer.valueOf(getMTabId()), "v3");
        }
    }

    private final void loadMore() {
        String str = this.mChannelId;
        m68163X0(str, (Map) this.mSubjectTypeMap.get(str), false);
    }

    /* JADX INFO: renamed from: m1 */
    private final void m68176m1() {
        List<Channel> typeList;
        this.mSubjectTypeMap.clear();
        FilterItems filterItems = this.mFilterItems;
        if (filterItems == null || (typeList = filterItems.getTypeList()) == null) {
            return;
        }
        Iterator<T> it = typeList.iterator();
        while (it.hasNext()) {
            this.mSubjectTypeMap.put(((Channel) it.next()).getChannelId(), new HashMap());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n1 */
    private final void m68177n1() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C24697s c24697s;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        int iM68170e1 = m68170e1();
        OffsetGridLayoutManager offsetGridLayoutManager = new OffsetGridLayoutManager(getContext(), iM68170e1, 1, false);
        C24697s c24697s2 = (C24697s) getMViewBinding();
        if (c24697s2 != null && (recyclerView4 = c24697s2.f75565c) != null) {
            recyclerView4.setLayoutManager(offsetGridLayoutManager);
        }
        C14835a c14835a = new C14835a(new ArrayList(), this.mExposureHelper, m68166a1(this.mChannelId), iM68170e1);
        c14835a.m36186h0().m108673z(true);
        c14835a.m36186h0().m108672y(true);
        c14835a.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.home.fragment.tab.q
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                MovieFragment.m68178o1(this.f53297a);
            }
        });
        c14835a.m36158R0(new C15303d());
        c14835a.m36227w1(new InterfaceC27566d() { // from class: com.transsion.home.fragment.tab.r
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                MovieFragment.m68180q1(this.f53301a, baseQuickAdapter, view, i11);
            }
        });
        this.mAdapter = c14835a;
        C24697s c24697s3 = (C24697s) getMViewBinding();
        if (c24697s3 != null && (recyclerView2 = c24697s3.f75565c) != null && recyclerView2.getItemDecorationCount() < 2 && (c24697s = (C24697s) getMViewBinding()) != null && (recyclerView3 = c24697s.f75565c) != null) {
            recyclerView3.addItemDecoration(new C25825b(AbstractC5776a0.m27313a(4.0f), AbstractC5776a0.m27313a(4.0f), AbstractC5776a0.m27313a(16.0f), AbstractC5776a0.m27313a(16.0f)));
        }
        C24697s c24697s4 = (C24697s) getMViewBinding();
        if (c24697s4 == null || (recyclerView = c24697s4.f75565c) == null) {
            return;
        }
        recyclerView.setAdapter(this.mAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o1 */
    public static final void m68178o1(final MovieFragment movieFragment) {
        RecyclerView recyclerView;
        if (C27287m.f83003a.m106330e()) {
            movieFragment.loadMore();
            return;
        }
        C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
        C24697s c24697s = (C24697s) movieFragment.getMViewBinding();
        if (c24697s == null || (recyclerView = c24697s.f75565c) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.tab.u
            @Override // java.lang.Runnable
            public final void run() {
                MovieFragment.m68179p1(this.f53313a);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final void m68179p1(MovieFragment movieFragment) {
        C27941f c27941fM36186h0;
        C14835a c14835a = movieFragment.mAdapter;
        if (c14835a == null || (c27941fM36186h0 = c14835a.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final void m68180q1(MovieFragment movieFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        if (item instanceof MovieItem) {
            MovieItem movieItem = (MovieItem) item;
            String subjectId = movieItem.getSubjectId();
            if (subjectId != null) {
                AbstractC28126h.m109239f(new Subject(subjectId, movieItem.getSubjectType(), movieItem.getTitle(), null, null, null, movieItem.getDescription(), null, null, movieItem.getGenre(), null, null, null, null, null, null, null, null, null, movieItem.getOps(), null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, 0, null, null, null, movieItem.getPlayUrl(), null, -524872, 50331647, null), movieFragment.m68165Z0());
            }
            HashMap map = new HashMap();
            String subjectId2 = movieItem.getSubjectId();
            if (subjectId2 == null) {
                subjectId2 = "";
            }
            map.put("subject_id", subjectId2);
            map.put("sequence", String.valueOf(i11));
            String ops = movieItem.getOps();
            map.put("ops", ops != null ? ops : "");
            map.put("filter_name", movieFragment.m68165Z0());
            C14450a.f50860a.m65143f(movieFragment.m68200f1(movieFragment.mFilterItems), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public static final void m68182r1(MovieFragment movieFragment) {
        movieFragment.mo67722c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s1 */
    public static final Unit m68184s1(final MovieFragment movieFragment, BaseDto baseDto) {
        SwipeRefreshLayout swipeRefreshLayout;
        if (baseDto == null) {
            return Unit.f75682a;
        }
        if (!Intrinsics.m97797c(baseDto.getCode(), "0")) {
            C24697s c24697s = (C24697s) movieFragment.getMViewBinding();
            if (c24697s != null && (swipeRefreshLayout = c24697s.f75569g) != null) {
                swipeRefreshLayout.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.tab.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        MovieFragment.m68186t1(this.f53269a);
                    }
                }, 200L);
            }
            return Unit.f75682a;
        }
        movieFragment.mFilterItems = (FilterItems) baseDto.getData();
        movieFragment.m68161V0(0);
        movieFragment.m68176m1();
        movieFragment.m68174k1();
        C14835a c14835a = movieFragment.mAdapter;
        if (c14835a != null) {
            c14835a.m66709F1(movieFragment.m68166a1(movieFragment.mChannelId));
        }
        return Unit.f75682a;
    }

    private final void showLoadingView() {
        View view = this.header;
        if (view != null) {
            ViewStub viewStub = (ViewStub) view.findViewById(R$id.loading_stub);
            if (viewStub != null) {
                viewStub.setLayoutResource(m68167b1());
            }
            if (this.mLoadingView == null) {
                this.mLoadingView = viewStub.inflate();
            }
            View view2 = this.mLoadingView;
            if (view2 != null) {
                AbstractC26006c.m102058k(view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final void m68186t1(MovieFragment movieFragment) {
        movieFragment.hideLoading();
        movieFragment.m68135C1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u1 */
    public static final Unit m68188u1(MovieFragment movieFragment, RefreshBaseDto refreshBaseDto) {
        C27941f c27941fM36186h0;
        C14835a c14835a;
        C27941f c27941fM36186h1;
        List<Object> data;
        SwipeRefreshLayout swipeRefreshLayout;
        SwipeRefreshLayout swipeRefreshLayout2;
        SwipeRefreshLayout swipeRefreshLayout3;
        if (refreshBaseDto == null) {
            return Unit.f75682a;
        }
        C24697s c24697s = (C24697s) movieFragment.getMViewBinding();
        if (c24697s != null && (swipeRefreshLayout3 = c24697s.f75569g) != null) {
            swipeRefreshLayout3.setEnabled(true);
        }
        if (Intrinsics.m97797c(refreshBaseDto.getCode(), "0")) {
            C24655b logViewConfig = movieFragment.getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96848k(true);
            }
            MovieBean movieBean = (MovieBean) refreshBaseDto.getData();
            if (movieBean != null) {
                movieFragment.m68145H1(movieBean, refreshBaseDto.getIsRefresh());
                View view = movieFragment.mNoNetworkView;
                if (view != null) {
                    AbstractC26006c.m102054g(view);
                }
            }
            movieFragment.hideLoading();
            return Unit.f75682a;
        }
        if (refreshBaseDto.getIsRefresh()) {
            C24697s c24697s2 = (C24697s) movieFragment.getMViewBinding();
            if (c24697s2 != null && (swipeRefreshLayout = c24697s2.f75569g) != null && swipeRefreshLayout.isRefreshing()) {
                C24697s c24697s3 = (C24697s) movieFragment.getMViewBinding();
                if (c24697s3 != null && (swipeRefreshLayout2 = c24697s3.f75569g) != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
                movieFragment.m68106n0();
            }
        } else {
            C14835a c14835a2 = movieFragment.mAdapter;
            if (c14835a2 != null && (c27941fM36186h0 = c14835a2.m36186h0()) != null && c27941fM36186h0.m108666r() && (c14835a = movieFragment.mAdapter) != null && (c27941fM36186h1 = c14835a.m36186h0()) != null) {
                c27941fM36186h1.m108669v();
            }
        }
        C14835a c14835a3 = movieFragment.mAdapter;
        if (c14835a3 == null || (data = c14835a3.getData()) == null || data.size() != 0) {
            if (C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(com.transsnet.downloader.R$string.str_ad_video_error_tips);
            } else {
                C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
            }
            movieFragment.m68172i1();
            return Unit.f75682a;
        }
        if (C27287m.f83003a.m106330e()) {
            movieFragment.m68141F1(movieFragment.getString(R$string.home_no_network_content));
        } else {
            movieFragment.m68135C1();
        }
        movieFragment.m68172i1();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public static final Unit m68190v1(MovieFragment movieFragment, Map it) {
        Intrinsics.m97802h(it, "it");
        movieFragment.m68192w1(it);
        C14450a.f50860a.m65145h(movieFragment.m68200f1(movieFragment.mFilterItems), it.toString(), (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
        C25646b c25646b = movieFragment.mExposureHelper;
        if (c25646b != null) {
            c25646b.m100943e();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: w1 */
    private final void m68192w1(Map selectedMap) {
        this.mPage = 1;
        HashMap map = (HashMap) this.mSubjectTypeMap.get(this.mChannelId);
        if (map != null) {
            map.clear();
        }
        if (map != null) {
            map.putAll(selectedMap);
        }
        m68163X0(this.mChannelId, map, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public final void m68194x1(String channelId) {
        List<Channel> typeList;
        this.mPage = 1;
        FilterItems filterItems = this.mFilterItems;
        if (filterItems == null || (typeList = filterItems.getTypeList()) == null) {
            return;
        }
        for (Channel channel : typeList) {
            if (Intrinsics.m97797c(channel.getChannelId(), channelId)) {
                HashMap map = (HashMap) this.mSubjectTypeMap.get(channelId);
                String str = this.mFilterJson;
                if (str == null || str.length() <= 0) {
                    List<Item> items = channel.getItems();
                    if (items != null) {
                        for (Item item : items) {
                            if ((map != null ? (String) map.get(item.getFilterType()) : null) == null) {
                                if (item.getRangeVals() != null) {
                                    String strM68848a = PopupFilterView.INSTANCE.m68848a(item.getRangeVals().getMinVal(), item.getRangeVals().getMaxVal());
                                    if (map != null) {
                                        map.put(item.getFilterType(), strM68848a);
                                    }
                                } else if (!item.getFilterValsV2().isEmpty() && map != null) {
                                    map.put(item.getFilterType(), item.getFilterValsV2().get(0).getId());
                                }
                            }
                        }
                    }
                } else {
                    try {
                        String str2 = this.mFilterJson;
                        if (str2 == null) {
                            str2 = "";
                        }
                        JSONObject jSONObject = new JSONObject(str2);
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            String string = jSONObject.getString(next);
                            if (map != null) {
                                map.put(next, string);
                            }
                        }
                        Unit unit = Unit.f75682a;
                    } catch (Exception unused) {
                        List<Item> items2 = channel.getItems();
                        if (items2 != null) {
                            for (Item item2 : items2) {
                                if ((map != null ? (String) map.get(item2.getFilterType()) : null) == null && map != null) {
                                    map.put(item2.getFilterType(), item2.getFilterValsV2().get(0).getId());
                                }
                            }
                            Unit unit2 = Unit.f75682a;
                        }
                    }
                }
                this.mFilterJson = null;
                m68163X0(channelId, map, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public static final InterfaceC22998b m68196y1() {
        return (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
    }

    /* JADX INFO: renamed from: z1 */
    private final void m68198z1(boolean show) {
        if (getMTabId() == HomeTabId.Game.getValue()) {
            if (show) {
                InterfaceC22998b interfaceC22998bM68168c1 = m68168c1();
                if (interfaceC22998bM68168c1 != null) {
                    interfaceC22998bM68168c1.mo69854h();
                    return;
                }
                return;
            }
            InterfaceC22998b interfaceC22998bM68168c2 = m68168c1();
            if (interfaceC22998bM68168c2 != null) {
                interfaceC22998bM68168c2.mo69866t();
            }
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final void m68199B1(TabLayout.Tab tab, boolean z11) {
        Intrinsics.m97802h(tab, "<this>");
        try {
            Field declaredField = tab.getClass().getDeclaredField(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(tab);
            Field declaredField2 = obj.getClass().getDeclaredField("textView");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Intrinsics.m97800f(obj2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) obj2;
            textView.setTextSize(14.0f);
            if (z11) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
            } else {
                textView.setTypeface(Typeface.defaultFromStyle(0));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: c0 */
    public void mo67722c0() {
        super.mo67722c0();
        this.mPage = 1;
        String str = this.mChannelId;
        m68163X0(str, (Map) this.mSubjectTypeMap.get(str), true);
        C25646b c25646b = this.mExposureHelper;
        if (c25646b != null) {
            c25646b.m100943e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: f0 */
    public RecyclerView mo67723f0() {
        C24697s c24697s = (C24697s) getMViewBinding();
        if (c24697s != null) {
            return c24697s.f75565c;
        }
        return null;
    }

    /* JADX INFO: renamed from: f1 */
    public final String m68200f1(FilterItems filterItems) {
        List<Channel> typeList;
        String strM68101d0 = getMTabCode();
        if (strM68101d0 != null && strM68101d0.length() != 0) {
            String strM68101d1 = getMTabCode();
            return strM68101d1 == null ? "" : strM68101d1;
        }
        if (filterItems != null && (typeList = filterItems.getTypeList()) != null) {
            for (Channel channel : typeList) {
                if (Intrinsics.m97797c(this.mChannelId, channel.getChannelId())) {
                    String channelName = channel.getChannelName();
                    return channelName == null ? m68169d1() : channelName;
                }
            }
        }
        return m68169d1();
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: g0 */
    public String mo67724g0() {
        int iM68170e1 = m68170e1();
        if (iM68170e1 != 2) {
            return iM68170e1 != 3 ? "HomeFragmentListLinearTemplateAd" : "HomeFragmentListGrid3TemplateAd";
        }
        return "HomeFragmentListGrid2TemplateAd";
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public C24697s getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C24697s c24697sM97001c = C24697s.m97001c(inflater);
        Intrinsics.m97801g(c24697sM97001c, "inflate(...)");
        return c24697sM97001c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void hideLoading() {
        m68172i1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment, com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        C24697s c24697s;
        View view2;
        View view3;
        Intrinsics.m97802h(view, "view");
        super.initView(view, savedInstanceState);
        C24697s c24697s2 = (C24697s) getMViewBinding();
        if (c24697s2 != null && (view3 = c24697s2.f75568f) != null) {
            view3.getLayoutParams().height = m68103h0();
        }
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("hide_header_bg", false) && (c24697s = (C24697s) getMViewBinding()) != null && (view2 = c24697s.f75568f) != null) {
            AbstractC26006c.m102054g(view2);
        }
        this.mMovieModel = (MovieViewModel) new C3227v0(this).m14969a(MovieViewModel.class);
        C24697s c24697s3 = (C24697s) getMViewBinding();
        this.mFilterView = c24697s3 != null ? c24697s3.f75566d : null;
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: l0 */
    public void mo67725l0(int lastAdPosition, BiddingNativeManager wrapperNativeManager) {
        List<Object> data;
        Intrinsics.m97802h(wrapperNativeManager, "wrapperNativeManager");
        Context context = getContext();
        if ((context == null || !AbstractC14556b.m65670a(context)) && wrapperNativeManager != null) {
            MovieItem movieItem = new MovieItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
            movieItem.setNonAdDelegate(wrapperNativeManager);
            C14835a c14835a = this.mAdapter;
            int size = (c14835a == null || (data = c14835a.getData()) == null) ? 0 : data.size();
            if (lastAdPosition < 0 || lastAdPosition > size) {
                C14835a c14835a2 = this.mAdapter;
                if (c14835a2 != null) {
                    c14835a2.mo36205p(movieItem);
                    return;
                }
                return;
            }
            C14835a c14835a3 = this.mAdapter;
            if (c14835a3 != null) {
                c14835a3.mo36199n(lastAdPosition, movieItem);
            }
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        if (!this.isViewInitialized) {
            this.isViewInitialized = true;
            View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.header_movie, (ViewGroup) null);
            this.header = viewInflate;
            if (viewInflate != null) {
                m68175l1();
                m68177n1();
                initScrollListener();
                C14835a c14835a = this.mAdapter;
                if (c14835a != null) {
                    BaseQuickAdapter.m36130y(c14835a, viewInflate, 0, 0, 6, null);
                }
                initViewModel();
                setNetListener(new C15305f());
            }
            C26866a.a.m104898f(C26866a.f81698a, "MovieFragment", "lazyLoadData() --> View延迟初始化完成", false, 4, null);
        }
        loadData();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        return new C24655b(m68169d1(), false, 2, null);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.m97802h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        C14835a c14835a = this.mAdapter;
        if (c14835a != null) {
            c14835a.notifyDataSetChanged();
        }
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment, com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.mFilterJson = arguments != null ? arguments.getString("filter_json") : null;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C3187b0 c3187b0M68961m;
        C3187b0 c3187b0M68958j;
        this.mPage = 1;
        MovieViewModel movieViewModel = this.mMovieModel;
        if (movieViewModel != null && (c3187b0M68958j = movieViewModel.m68958j()) != null) {
            c3187b0M68958j.mo14858q(null);
        }
        MovieViewModel movieViewModel2 = this.mMovieModel;
        if (movieViewModel2 != null && (c3187b0M68961m = movieViewModel2.m68961m()) != null) {
            c3187b0M68961m.mo14858q(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        AbstractC14517k.m65410h(null, this, hidden, "tabId=" + getMTabId(), 1, null);
        if (isResumed()) {
            if (!hidden) {
                logResume();
                m68198z1(true);
            } else {
                m68198z1(false);
                logPause();
                this.startShowTime = SystemClock.elapsedRealtime();
            }
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (getMTabId() == 2) {
            C14450a.f50860a.m65147k(m68200f1(this.mFilterItems), C24662i.f75350a.m96877i(), String.valueOf(SystemClock.elapsedRealtime() - this.startShowTime));
        }
        C25646b c25646b = this.mExposureHelper;
        if (c25646b != null) {
            c25646b.m100943e();
        }
        AbstractC14517k.m65414l(null, this, "tabId=" + getMTabId(), 1, null);
        m68198z1(false);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        C14835a c14835a;
        List<Object> data;
        super.onResume();
        this.startShowTime = SystemClock.elapsedRealtime();
        View view = this.mNoNetworkView;
        if (view != null && AbstractC26006c.m102056i(view) && C27287m.f83003a.m106330e() && (c14835a = this.mAdapter) != null && (data = c14835a.getData()) != null && data.isEmpty()) {
            View view2 = this.mNoNetworkView;
            if (view2 != null) {
                AbstractC26006c.m102054g(view2);
            }
            loadData();
        }
        AbstractC14517k.m65418p(null, this, "tabId=" + getMTabId() + " visible=" + isVisible(), 1, null);
        m68198z1(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: p0 */
    public void mo68108p0() {
        RecyclerView recyclerView;
        C24697s c24697s = (C24697s) getMViewBinding();
        if (c24697s == null || (recyclerView = c24697s.f75565c) == null) {
            return;
        }
        recyclerView.smoothScrollToPosition(0);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void startLoading() {
        showLoadingView();
    }
}
