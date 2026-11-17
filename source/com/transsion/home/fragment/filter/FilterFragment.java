package com.transsion.home.fragment.filter;

import android.content.Context;
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
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.cloud.tmc.miniapp.prepare.steps.PrepareException;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.net.bean.BaseDto;
import com.p282tn.lib.view.AbstractC13772o;
import com.p282tn.lib.view.NoNetworkBigView;
import com.p282tn.lib.widget.R$color;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
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
import com.transsion.home.fragment.tab.BaseHomeSubFragment;
import com.transsion.home.view.filter.expand.FilterExpandView;
import com.transsion.home.view.filter.expand.TabExpandView;
import com.transsion.home.view.layoutmanager.OffsetGridLayoutManager;
import com.transsion.home.viewmodel.MovieViewModel;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.p285ad.bidding.nativead.BiddingListManager;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.DownloadManagerApi;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mg.C25825b;
import ng.AbstractC26006c;
import org.json.JSONObject;
import p550kj.C24655b;
import p550kj.C24662i;
import p552kl.C24674e0;
import p552kl.C24676f0;
import p552kl.C24693o;
import p579ll.C25646b;
import p579ll.InterfaceC25645a;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p912xl.C28609a;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 ²\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002³\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J;\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015j\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016`\u00172\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\u0007H\u0002¢\u0006\u0004\b(\u0010\u0004J7\u0010*\u001a\u00020\u00072&\u0010)\u001a\"\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0017H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0007H\u0002¢\u0006\u0004\b,\u0010\u0004J\u000f\u0010-\u001a\u00020\u0007H\u0002¢\u0006\u0004\b-\u0010\u0004J\u000f\u0010.\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010\u0004J\u001f\u00101\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0016H\u0002¢\u0006\u0004\b1\u00102JI\u00106\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u00162&\u00103\u001a\"\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u00172\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J!\u0010:\u001a\u00020\u00072\b\u00109\u001a\u0004\u0018\u0001082\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0007H\u0002¢\u0006\u0004\b<\u0010\u0004J\u000f\u0010=\u001a\u00020\u0007H\u0002¢\u0006\u0004\b=\u0010\u0004J\u000f\u0010>\u001a\u00020\u0007H\u0002¢\u0006\u0004\b>\u0010\u0004J\u0019\u0010@\u001a\u00020\u00072\b\u0010?\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b@\u0010AJC\u0010C\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u00162(\b\u0002\u0010B\u001a\"\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0017H\u0002¢\u0006\u0004\bC\u0010DJ\u0019\u0010E\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\bE\u0010AJ\u000f\u0010F\u001a\u00020\u0007H\u0002¢\u0006\u0004\bF\u0010\u0004J\u000f\u0010G\u001a\u00020#H\u0002¢\u0006\u0004\bG\u0010HJ\u001b\u0010J\u001a\u0004\u0018\u00010I2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020#H\u0002¢\u0006\u0004\bL\u0010HJ\u000f\u0010M\u001a\u00020\u0007H\u0002¢\u0006\u0004\bM\u0010\u0004J\u000f\u0010N\u001a\u00020\u0016H\u0002¢\u0006\u0004\bN\u0010OJ+\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160Q2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010P\u001a\u00020\u0016H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\u00020\u00022\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ\u0019\u0010Z\u001a\u00020\u00072\b\u0010Y\u001a\u0004\u0018\u00010XH\u0016¢\u0006\u0004\bZ\u0010[J!\u0010]\u001a\u00020\u00072\u0006\u0010\\\u001a\u00020\u00052\b\u0010Y\u001a\u0004\u0018\u00010XH\u0017¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0007H\u0016¢\u0006\u0004\b_\u0010\u0004J\u000f\u0010`\u001a\u00020\u0007H\u0016¢\u0006\u0004\b`\u0010\u0004J\u000f\u0010a\u001a\u00020\u0007H\u0016¢\u0006\u0004\ba\u0010\u0004J\u000f\u0010b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bb\u0010\u0004J\u0017\u0010d\u001a\u00020\u00072\u0006\u0010c\u001a\u000204H\u0016¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020\u0007H\u0016¢\u0006\u0004\bf\u0010\u0004J\u000f\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020\u0007H\u0016¢\u0006\u0004\bj\u0010\u0004J!\u0010m\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u00162\b\u0010l\u001a\u0004\u0018\u00010k¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\u0016H\u0016¢\u0006\u0004\bo\u0010OJ\u000f\u0010p\u001a\u00020\u0007H\u0016¢\u0006\u0004\bp\u0010\u0004J\u0011\u0010r\u001a\u0004\u0018\u00010qH\u0016¢\u0006\u0004\br\u0010sJ\u001f\u0010w\u001a\u00020\u00072\u0006\u0010t\u001a\u00020#2\u0006\u0010v\u001a\u00020uH\u0016¢\u0006\u0004\bw\u0010xR\u0018\u0010|\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010\u0086\u0001\u001a\u00030\u0083\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001a\u0010\u008e\u0001\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0019\u0010\u0091\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001b\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001b\u0010\u0097\u0001\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001b\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0093\u0001R\u0019\u0010\u009b\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0090\u0001R\u0019\u0010\u009e\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001Rq\u0010¡\u0001\u001aZ\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015j\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016`\u00170\u0015j,\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015j\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016`\u0017`\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001a\u0010¥\u0001\u001a\u00030¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001c\u0010©\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R9\u0010«\u0001\u001a\"\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010 \u0001R\u001b\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u0082\u0001R\u001b\u0010¯\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010\u0082\u0001R\u001b\u0010±\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010\u0082\u0001¨\u0006´\u0001"}, m97100d2 = {"Lcom/transsion/home/fragment/filter/FilterFragment;", "Lcom/transsion/home/fragment/tab/BaseHomeSubFragment;", "Lkl/o;", "<init>", "()V", "Landroid/view/View;", "header", "", "m1", "(Landroid/view/View;)V", "h1", "g1", "Lxl/a;", WebConstants.FIELD_ITEM, "y1", "(Lxl/a;)V", "i1", "d1", "", "Lcom/transsion/home/bean/Channel;", "list", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "e1", "(Ljava/util/List;)Ljava/util/HashMap;", "", "x1", "(Ljava/util/List;)V", "T0", "()Ljava/util/List;", TmcStartParams.KEY_CHANNEL_ID, "Lcom/transsion/home/bean/Item;", "S0", "(Ljava/lang/String;)Ljava/util/List;", "", RequestParameters.POSITION, "P0", "(I)V", "initViewModel", "E1", "selectItems", "I1", "(Ljava/util/HashMap;)V", "loadData", "z1", "loadMore", "filterType", "filterValue", "u1", "(Ljava/lang/String;Ljava/lang/String;)V", "selectedItems", "", "isRefresh", "R0", "(Ljava/lang/String;Ljava/util/HashMap;Z)V", "Lcom/transsion/home/bean/MovieBean;", "movieBean", "F1", "(Lcom/transsion/home/bean/MovieBean;Z)V", "H1", "showLoadingView", "b1", "string", "C1", "(Ljava/lang/String;)V", "selectMap", "v1", "(Ljava/lang/String;Ljava/util/HashMap;)V", "Q0", "c1", "Y0", "()I", "Lcom/transsion/home/bean/LayoutStyle;", "V0", "(Ljava/lang/String;)Lcom/transsion/home/bean/LayoutStyle;", "W0", "f1", "X0", "()Ljava/lang/String;", "key", "", "U0", "(Lxl/a;Ljava/lang/String;)Ljava/util/Map;", "Landroid/view/LayoutInflater;", "inflater", "a1", "(Landroid/view/LayoutInflater;)Lkl/o;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "startLoading", "hideLoading", "onResume", "hidden", "onHiddenChanged", "(Z)V", "onPause", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "onDestroyView", "Lcom/transsion/home/bean/FilterItems;", "filterItems", "Z0", "(Ljava/lang/String;Lcom/transsion/home/bean/FilterItems;)Ljava/lang/String;", "g0", "c0", "Landroidx/recyclerview/widget/RecyclerView;", "f0", "()Landroidx/recyclerview/widget/RecyclerView;", "lastAdPosition", "Lcom/transsion/ad/bidding/nativead/BiddingNativeManager;", "wrapperNativeManager", "l0", "(ILcom/transsion/ad/bidding/nativead/BiddingNativeManager;)V", "Lcom/transsion/home/adapter/a;", "g", "Lcom/transsion/home/adapter/a;", "mAdapter", "Lcom/transsion/home/viewmodel/MovieViewModel;", "h", "Lcom/transsion/home/viewmodel/MovieViewModel;", "mMovieModel", "i", "Landroid/view/View;", "Lkl/e0;", "j", "Lkl/e0;", "headerBinding", "Lcom/transsion/home/view/filter/expand/TabExpandView;", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/home/view/filter/expand/TabExpandView;", "channelView", "Lcom/transsion/home/view/filter/expand/FilterExpandView;", "l", "Lcom/transsion/home/view/filter/expand/FilterExpandView;", "filterView", "m", "I", "mPage", "n", "Ljava/lang/String;", "mFilterJson", "o", "Lcom/transsion/home/bean/FilterItems;", "mFilterItems", TtmlNode.TAG_P, "mChannelId", CampaignEx.JSON_KEY_AD_Q, "mPerPage", CampaignEx.JSON_KEY_AD_R, "Z", "mUpdateFilterItems", "s", "Ljava/util/HashMap;", "mSubjectTypeMap", "", "t", "J", "startShowTime", "Lll/b;", TmcStartParams.KEY_URL_SHORT, "Lll/b;", "mExposureHelper", "v", "mLatestSelectItems", "w", "mNoNetworkView", "x", "mLoadingView", "y", "mNoResultView", "z", "a", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class FilterFragment extends BaseHomeSubFragment<C24693o> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C14835a mAdapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private MovieViewModel mMovieModel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private View header;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private C24674e0 headerBinding;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private TabExpandView channelView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private FilterExpandView filterView;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private volatile String mFilterJson;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private FilterItems mFilterItems;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private String mChannelId;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private C25646b mExposureHelper;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private HashMap mLatestSelectItems;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private View mNoNetworkView;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private View mLoadingView;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private View mNoResultView;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A */
    public static final int f52769A = 8;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int mPage = 1;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int mPerPage = 12;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean mUpdateFilterItems = true;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private HashMap mSubjectTypeMap = new HashMap();

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private long startShowTime = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: com.transsion.home.fragment.filter.FilterFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final FilterFragment m67726a(int i11, String str, String str2) {
            Bundle bundle = new Bundle();
            bundle.putInt("tab_id", i11);
            bundle.putString(WebConstants.TAB_CODE, str);
            bundle.putString("filter_json", str2);
            FilterFragment filterFragment = new FilterFragment();
            filterFragment.setArguments(bundle);
            return filterFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.filter.FilterFragment$b */
    public static final class C15158b implements InterfaceC25645a {
        C15158b() {
        }

        @Override // p579ll.InterfaceC25645a
        /* JADX INFO: renamed from: a */
        public void mo67486a(int i11, long j11, View view) {
            List<Object> data;
            String subjectId;
            String ops;
            C14835a c14835a = FilterFragment.this.mAdapter;
            if (c14835a != null) {
                c14835a.m36215s0();
            }
            C14835a c14835a2 = FilterFragment.this.mAdapter;
            if (c14835a2 == null || (data = c14835a2.getData()) == null) {
                return;
            }
            int size = data.size();
            FilterFragment filterFragment = FilterFragment.this;
            if (i11 >= size) {
                return;
            }
            C14835a c14835a3 = filterFragment.mAdapter;
            MovieItem movieItem = c14835a3 != null ? (MovieItem) c14835a3.getItem(i11) : null;
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
            C14450a.f50860a.m65142e(filterFragment.m67720Z0(filterFragment.mChannelId, filterFragment.mFilterItems), map);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.filter.FilterFragment$c */
    public static final class C15159c extends DiffUtil.AbstractC4174e {
        C15159c() {
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

    /* JADX INFO: renamed from: com.transsion.home.fragment.filter.FilterFragment$d */
    public static final class C15160d extends RecyclerView.AbstractC4219r {

        /* JADX INFO: renamed from: a */
        private int f52791a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ View f52793c;

        C15160d(View view) {
            this.f52793c = view;
        }

        /* JADX INFO: renamed from: d */
        private final void m67729d(RecyclerView recyclerView) {
            RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
            Intrinsics.m97800f(layoutManager, "null cannot be cast to non-null type com.transsion.home.view.layoutmanager.OffsetGridLayoutManager");
            this.f52791a = ((OffsetGridLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
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
            if (i11 != 0 || childCount <= 0 || this.f52791a < itemCount - 1) {
                return;
            }
            C14835a c14835a2 = FilterFragment.this.mAdapter;
            if (((c14835a2 == null || (c27941fM36186h1 = c14835a2.m36186h0()) == null) ? null : c27941fM36186h1.m108661i()) != LoadMoreStatus.Fail || (c14835a = FilterFragment.this.mAdapter) == null || (c27941fM36186h0 = c14835a.m36186h0()) == null) {
                return;
            }
            c27941fM36186h0.m108670w();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            C24676f0 c24676f0;
            ConstraintLayout constraintLayout;
            C24676f0 c24676f1;
            C24676f0 c24676f2;
            ConstraintLayout constraintLayout2;
            Intrinsics.m97802h(recyclerView, "recyclerView");
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int measuredHeight = this.f52793c.getMeasuredHeight();
            TabExpandView tabExpandView = FilterFragment.this.channelView;
            if (tabExpandView == null) {
                Intrinsics.m97819y("channelView");
                tabExpandView = null;
            }
            if (iComputeVerticalScrollOffset > measuredHeight - tabExpandView.getMeasuredHeight()) {
                C24693o c24693o = (C24693o) FilterFragment.this.getMViewBinding();
                if (c24693o != null && (c24676f2 = c24693o.f75530b) != null && (constraintLayout2 = c24676f2.f75425c) != null) {
                    AbstractC26006c.m102058k(constraintLayout2);
                }
                C24693o c24693o2 = (C24693o) FilterFragment.this.getMViewBinding();
                if (c24693o2 != null && (c24676f1 = c24693o2.f75530b) != null) {
                    FilterFragment filterFragment = FilterFragment.this;
                    ConstraintLayout llTabFilter = c24676f1.f75425c;
                    Intrinsics.m97801g(llTabFilter, "llTabFilter");
                    AbstractC26006c.m102058k(llTabFilter);
                    filterFragment.m67667H1();
                }
            } else {
                C24693o c24693o3 = (C24693o) FilterFragment.this.getMViewBinding();
                if (c24693o3 != null && (c24676f0 = c24693o3.f75530b) != null && (constraintLayout = c24676f0.f75425c) != null) {
                    AbstractC26006c.m102054g(constraintLayout);
                }
            }
            m67729d(recyclerView);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.filter.FilterFragment$e */
    public static final class C15161e implements InterfaceC27288n {
        C15161e() {
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
            if (FilterFragment.this.isResumed()) {
                C14835a c14835a = FilterFragment.this.mAdapter;
                if (c14835a != null && (data3 = c14835a.getData()) != null && data3.isEmpty()) {
                    View view = FilterFragment.this.mNoNetworkView;
                    if (view != null) {
                        AbstractC26006c.m102054g(view);
                    }
                    FilterFragment.this.loadData();
                    return;
                }
                C14835a c14835a2 = FilterFragment.this.mAdapter;
                int size = (c14835a2 == null || (data2 = c14835a2.getData()) == null) ? 0 : data2.size();
                if (size <= 0) {
                    FilterFragment filterFragment = FilterFragment.this;
                    filterFragment.m67678R0(filterFragment.mChannelId, FilterFragment.this.mLatestSelectItems, true);
                    return;
                }
                C14835a c14835a3 = FilterFragment.this.mAdapter;
                MovieItem movieItem = (c14835a3 == null || (data = c14835a3.getData()) == null) ? null : (MovieItem) data.get(size - 1);
                if (Intrinsics.m97797c(FilterFragment.this.mChannelId, movieItem != null ? movieItem.getChannelId() : null)) {
                    if (Intrinsics.m97797c(FilterFragment.this.mLatestSelectItems, movieItem != null ? movieItem.getSelectItems() : null)) {
                        C14835a c14835a4 = FilterFragment.this.mAdapter;
                        if (c14835a4 == null || (c27941fM36186h0 = c14835a4.m36186h0()) == null) {
                            return;
                        }
                        c27941fM36186h0.m108670w();
                        return;
                    }
                }
                FilterFragment filterFragment2 = FilterFragment.this;
                filterFragment2.m67678R0(filterFragment2.mChannelId, FilterFragment.this.mLatestSelectItems, true);
            }
        }

        @Override // p743rh.InterfaceC27288n
        public void onDisconnected() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.filter.FilterFragment$f */
    static final class C15162f implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f52795a;

        C15162f(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f52795a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f52795a;
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
            this.f52795a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public static final Unit m67653A1(NoNetworkBigView noNetworkBigView, FilterFragment filterFragment) {
        AbstractC26006c.m102054g(noNetworkBigView);
        filterFragment.loadData();
        AbstractC13772o.m62234b(filterFragment.m67684X0());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public static final Unit m67655B1(FilterFragment filterFragment) {
        AbstractC13772o.m62235c(filterFragment.m67684X0());
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: C1 */
    private final void m67657C1(String string) {
        if (this.mNoResultView == null) {
            C24674e0 c24674e0 = this.headerBinding;
            if (c24674e0 == null) {
                Intrinsics.m97819y("headerBinding");
                c24674e0 = null;
            }
            this.mNoResultView = c24674e0.f75419g.inflate();
        }
        final View view = this.mNoResultView;
        if (view != null) {
            AbstractC26006c.m102058k(view);
            TextView textView = (TextView) view.findViewById(R$id.tv_no_result);
            if (textView != null) {
                textView.setText(string);
            }
            View viewFindViewById = view.findViewById(R$id.tv_reset);
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.fragment.filter.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        FilterFragment.m67659D1(this.f52846a, view, view2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public static final void m67659D1(FilterFragment filterFragment, View view, View view2) {
        filterFragment.m67677Q0(filterFragment.mChannelId);
        filterFragment.mFilterJson = null;
        AbstractC26006c.m102054g(view);
        filterFragment.mUpdateFilterItems = true;
        filterFragment.loadData();
    }

    /* JADX INFO: renamed from: E1 */
    private final void m67661E1() {
        List listM67679S0;
        if (this.mUpdateFilterItems && (listM67679S0 = m67679S0(this.mChannelId)) != null) {
            FilterExpandView filterExpandView = this.filterView;
            FilterExpandView filterExpandView2 = null;
            if (filterExpandView == null) {
                Intrinsics.m97819y("filterView");
                filterExpandView = null;
            }
            if (filterExpandView.getHasInit()) {
                FilterExpandView filterExpandView3 = this.filterView;
                if (filterExpandView3 == null) {
                    Intrinsics.m97819y("filterView");
                    filterExpandView3 = null;
                }
                FilterExpandView.updateList$default(filterExpandView3, listM67679S0, null, 2, null);
            } else {
                FilterExpandView filterExpandView4 = this.filterView;
                if (filterExpandView4 == null) {
                    Intrinsics.m97819y("filterView");
                    filterExpandView4 = null;
                }
                FilterExpandView.updateList$default(filterExpandView4, listM67679S0, null, 2, null);
            }
            FilterExpandView filterExpandView5 = this.filterView;
            if (filterExpandView5 == null) {
                Intrinsics.m97819y("filterView");
            } else {
                filterExpandView2 = filterExpandView5;
            }
            filterExpandView2.setMovieModel(this.mMovieModel);
            this.mUpdateFilterItems = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F1 */
    private final void m67663F1(MovieBean movieBean, boolean isRefresh) {
        C27941f c27941fM36186h0;
        C24693o c24693o;
        LinearLayout root;
        C27941f c27941fM36186h1;
        C14835a c14835a;
        C27941f c27941fM36186h2;
        SwipeRefreshLayout swipeRefreshLayout;
        C24693o c24693o2;
        SwipeRefreshLayout swipeRefreshLayout2;
        Integer perPage;
        if (movieBean != null) {
            Pager pager = movieBean.getPager();
            this.mPerPage = (pager == null || (perPage = pager.getPerPage()) == null) ? 10 : perPage.intValue();
            if (isRefresh) {
                C24693o c24693o3 = (C24693o) getMViewBinding();
                if (c24693o3 != null && (swipeRefreshLayout = c24693o3.f75532d) != null && swipeRefreshLayout.isRefreshing() && (c24693o2 = (C24693o) getMViewBinding()) != null && (swipeRefreshLayout2 = c24693o2.f75532d) != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
                C14835a c14835a2 = this.mAdapter;
                if (c14835a2 != null) {
                    c14835a2.mo36201n1(movieBean.getItems());
                }
                List<MovieItem> items = movieBean.getItems();
                if (items == null || !items.isEmpty()) {
                    m67687c1();
                } else {
                    m67657C1(getString(R$string.no_filter_result));
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
                if (c14835a6 != null && (c27941fM36186h0 = c14835a6.m36186h0()) != null && c27941fM36186h0.m108666r() && (c24693o = (C24693o) getMViewBinding()) != null && (root = c24693o.getRoot()) != null) {
                    root.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.filter.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            FilterFragment.m67665G1(this.f52837a);
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
    /* JADX INFO: renamed from: G1 */
    public static final void m67665G1(FilterFragment filterFragment) {
        C27941f c27941fM36186h0;
        C14835a c14835a = filterFragment.mAdapter;
        if (c14835a == null || (c27941fM36186h0 = c14835a.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108667s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H1 */
    public final void m67667H1() {
        C24676f0 c24676f0;
        AppCompatTextView appCompatTextView;
        StringBuilder sb2 = new StringBuilder();
        HashMap map = (HashMap) this.mSubjectTypeMap.get(this.mChannelId);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (!Intrinsics.m97797c(entry.getValue(), getString(com.p282tn.lib.widget.R$string.all))) {
                    sb2.append((String) entry.getValue());
                    sb2.append(" • ");
                }
            }
        }
        boolean zC0 = StringsKt.m98132c0(sb2, " • ", false, 2, null);
        StringBuilder sbSubstring = sb2;
        if (zC0) {
            sbSubstring = sb2.substring(0, sb2.length() - 2);
        }
        int length = sbSubstring.length();
        CharSequence string = sbSubstring;
        if (length == 0) {
            string = getString(com.p282tn.lib.widget.R$string.all);
        }
        C24693o c24693o = (C24693o) getMViewBinding();
        if (c24693o == null || (c24676f0 = c24693o.f75530b) == null || (appCompatTextView = c24676f0.f75424b) == null) {
            return;
        }
        appCompatTextView.setText(string);
        AbstractC26006c.m102058k(appCompatTextView);
    }

    /* JADX INFO: renamed from: I1 */
    private final void m67669I1(HashMap selectItems) {
        this.mUpdateFilterItems = false;
        FilterExpandView filterExpandView = this.filterView;
        FilterExpandView filterExpandView2 = null;
        if (filterExpandView == null) {
            Intrinsics.m97819y("filterView");
            filterExpandView = null;
        }
        if (filterExpandView.getMovieModel() == null) {
            FilterExpandView filterExpandView3 = this.filterView;
            if (filterExpandView3 == null) {
                Intrinsics.m97819y("filterView");
                filterExpandView3 = null;
            }
            filterExpandView3.setMovieModel(this.mMovieModel);
        }
        List<Item> listM67679S0 = m67679S0(this.mChannelId);
        if (listM67679S0 != null) {
            FilterExpandView filterExpandView4 = this.filterView;
            if (filterExpandView4 == null) {
                Intrinsics.m97819y("filterView");
            } else {
                filterExpandView2 = filterExpandView4;
            }
            filterExpandView2.updateList(listM67679S0, selectItems);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P0 */
    private final void m67676P0(int position) {
        View view;
        RecyclerView recyclerView;
        List<Channel> typeList;
        Channel channel;
        List<Channel> typeList2;
        FilterItems filterItems = this.mFilterItems;
        int size = (filterItems == null || (typeList2 = filterItems.getTypeList()) == null) ? -1 : typeList2.size();
        if (position < 0 || position >= size) {
            return;
        }
        FilterItems filterItems2 = this.mFilterItems;
        this.mChannelId = (filterItems2 == null || (typeList = filterItems2.getTypeList()) == null || (channel = typeList.get(position)) == null) ? null : channel.getChannelId();
        C24693o c24693o = (C24693o) getMViewBinding();
        RecyclerView.AbstractC4214m layoutManager = (c24693o == null || (recyclerView = c24693o.f75531c) == null) ? null : recyclerView.getLayoutManager();
        if (layoutManager instanceof OffsetGridLayoutManager) {
            OffsetGridLayoutManager offsetGridLayoutManager = (OffsetGridLayoutManager) layoutManager;
            if (offsetGridLayoutManager.m20737U() == m67685Y0()) {
                C26866a.a.m104898f(C26866a.f81698a, "MovieFragment", "span count is same " + offsetGridLayoutManager.m20737U(), false, 4, null);
                return;
            }
        }
        m67693i1();
        View view2 = this.header;
        if (view2 == null) {
            Intrinsics.m97819y("header");
            view2 = null;
        }
        ViewParent parent = view2.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            View view3 = this.header;
            if (view3 == null) {
                Intrinsics.m97819y("header");
                view3 = null;
            }
            viewGroup.removeView(view3);
        }
        C14835a c14835a = this.mAdapter;
        if (c14835a != null) {
            View view4 = this.header;
            if (view4 == null) {
                Intrinsics.m97819y("header");
                view = null;
            } else {
                view = view4;
            }
            BaseQuickAdapter.m36130y(c14835a, view, 0, 0, 6, null);
        }
        showLoadingView();
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m67677Q0(String channelId) {
        HashMap map = (HashMap) this.mSubjectTypeMap.get(channelId);
        if (map != null) {
            map.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public final void m67678R0(String channelId, HashMap selectedItems, boolean isRefresh) {
        MovieViewModel movieViewModel = this.mMovieModel;
        if (movieViewModel != null) {
            int i11 = this.mPage;
            this.mPage = i11 + 1;
            movieViewModel.m68959k(i11, this.mPerPage, channelId, selectedItems, isRefresh);
        }
        this.mLatestSelectItems = selectedItems;
    }

    /* JADX INFO: renamed from: S0 */
    private final List m67679S0(String channelId) {
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

    /* JADX INFO: renamed from: T0 */
    private final List m67680T0() {
        List<Channel> typeList;
        ArrayList arrayList = new ArrayList();
        FilterItems filterItems = this.mFilterItems;
        if (filterItems != null && (typeList = filterItems.getTypeList()) != null) {
            for (Channel channel : typeList) {
                arrayList.add(new C28609a(String.valueOf(channel.getChannelId()), String.valueOf(channel.getChannelName()), String.valueOf(channel.getSubjectType()), Intrinsics.m97797c(channel.getChannelId(), this.mChannelId), null, 16, null));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: U0 */
    private final Map m67681U0(C28609a item, String key) {
        HashMap map = new HashMap();
        map.put("event_type", key);
        map.put(CampaignEx.JSON_KEY_TITLE, item.m110339a());
        map.put(NativeComponentConstants.KEY_COMPONENT_TYPE, item.m110340b());
        map.put("tabId", String.valueOf(getMTabId()));
        return map;
    }

    /* JADX INFO: renamed from: V0 */
    private final LayoutStyle m67682V0(String channelId) {
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

    /* JADX INFO: renamed from: W0 */
    private final int m67683W0() {
        return R$layout.home_empty_view_loading;
    }

    /* JADX INFO: renamed from: X0 */
    private final String m67684X0() {
        Fragment parentFragment = getParentFragment();
        return parentFragment instanceof HomeFragment ? ((HomeFragment) parentFragment).m67935J0() : "";
    }

    /* JADX INFO: renamed from: Y0 */
    private final int m67685Y0() {
        LayoutStyle layoutStyleM67682V0 = m67682V0(this.mChannelId);
        if (layoutStyleM67682V0 != null) {
            int colNum = layoutStyleM67682V0.getColNum();
            FragmentActivity activity = getActivity();
            return colNum + ((activity == null || !AbstractC14556b.m65670a(activity)) ? 0 : 1);
        }
        if (Intrinsics.m97797c(this.mChannelId, "5") || Intrinsics.m97797c(this.mChannelId, PrepareException.ERROR_NO_URL) || Intrinsics.m97797c(this.mChannelId, "1003") || Intrinsics.m97797c(this.mChannelId, "1004")) {
            return 2;
        }
        FragmentActivity activity2 = getActivity();
        return (activity2 == null || !AbstractC14556b.m65670a(activity2)) ? 3 : 4;
    }

    /* JADX INFO: renamed from: b1 */
    private final void m67686b1() {
        View view = this.mLoadingView;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
    }

    /* JADX INFO: renamed from: c1 */
    private final void m67687c1() {
        View view = this.mNoResultView;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
    }

    /* JADX INFO: renamed from: d1 */
    private final void m67688d1() {
        List<Channel> typeList;
        FilterItems filterItems = this.mFilterItems;
        TabExpandView tabExpandView = null;
        FilterExpandView filterExpandView = null;
        HashMap mapM67689e1 = m67689e1(filterItems != null ? filterItems.getTypeList() : null);
        FilterItems filterItems2 = this.mFilterItems;
        int size = (filterItems2 == null || (typeList = filterItems2.getTypeList()) == null) ? 0 : typeList.size();
        if (size <= 0) {
            return;
        }
        if (size == 1) {
            TabExpandView tabExpandView2 = this.channelView;
            if (tabExpandView2 == null) {
                Intrinsics.m97819y("channelView");
                tabExpandView2 = null;
            }
            AbstractC26006c.m102054g(tabExpandView2);
        } else {
            TabExpandView tabExpandView3 = this.channelView;
            if (tabExpandView3 == null) {
                Intrinsics.m97819y("channelView");
                tabExpandView3 = null;
            }
            AbstractC26006c.m102058k(tabExpandView3);
            List<C28609a> listM67680T0 = m67680T0();
            TabExpandView tabExpandView4 = this.channelView;
            if (tabExpandView4 == null) {
                Intrinsics.m97819y("channelView");
                tabExpandView4 = null;
            }
            tabExpandView4.updateData(listM67680T0);
            m67715x1(listM67680T0);
        }
        m67711v1(this.mChannelId, mapM67689e1);
        m67669I1((HashMap) this.mSubjectTypeMap.get(this.mChannelId));
        if (mapM67689e1.isEmpty()) {
            TabExpandView tabExpandView5 = this.channelView;
            if (tabExpandView5 == null) {
                Intrinsics.m97819y("channelView");
            } else {
                tabExpandView = tabExpandView5;
            }
            tabExpandView.expand();
            return;
        }
        TabExpandView tabExpandView6 = this.channelView;
        if (tabExpandView6 == null) {
            Intrinsics.m97819y("channelView");
            tabExpandView6 = null;
        }
        tabExpandView6.collapse();
        FilterExpandView filterExpandView2 = this.filterView;
        if (filterExpandView2 == null) {
            Intrinsics.m97819y("filterView");
        } else {
            filterExpandView = filterExpandView2;
        }
        filterExpandView.expandFilter(mapM67689e1.size() - 1);
    }

    /* JADX INFO: renamed from: e1 */
    private final HashMap m67689e1(List list) {
        Object next;
        if (list == null) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        String str = this.mFilterJson;
        if (str != null && str.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(this.mFilterJson);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next2 = itKeys.next();
                    String string = jSONObject.getString(next2);
                    if (Intrinsics.m97797c(next2, TmcStartParams.KEY_CHANNEL_ID)) {
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.m97797c(((Channel) next).getChannelId(), string));
                        if (((Channel) next) == null) {
                            return new HashMap();
                        }
                        this.mChannelId = string;
                    } else {
                        map.put(next2, string);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f1 */
    private final void m67690f1() {
        RecyclerView recyclerView;
        if (this.mExposureHelper == null) {
            C25646b c25646b = new C25646b(0.6f, new C15158b(), false, 4, null);
            C24693o c24693o = (C24693o) getMViewBinding();
            if (c24693o != null && (recyclerView = c24693o.f75531c) != null) {
                recyclerView.addOnScrollListener(c25646b);
            }
            this.mExposureHelper = c25646b;
        }
    }

    /* JADX INFO: renamed from: g1 */
    private final void m67691g1() {
        FilterExpandView filterExpandView = this.filterView;
        if (filterExpandView == null) {
            Intrinsics.m97819y("filterView");
            filterExpandView = null;
        }
        filterExpandView.setReportEvent(new FilterFragment$initFilter$1(this));
    }

    /* JADX INFO: renamed from: h1 */
    private final void m67692h1() {
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
    /* JADX INFO: renamed from: i1 */
    private final void m67693i1() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C24693o c24693o;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        int iM67685Y0 = m67685Y0();
        OffsetGridLayoutManager offsetGridLayoutManager = new OffsetGridLayoutManager(getContext(), iM67685Y0, 1, false);
        C24693o c24693o2 = (C24693o) getMViewBinding();
        if (c24693o2 != null && (recyclerView4 = c24693o2.f75531c) != null) {
            recyclerView4.setLayoutManager(offsetGridLayoutManager);
        }
        final C14835a c14835a = new C14835a(new ArrayList(), this.mExposureHelper, m67682V0(this.mChannelId), iM67685Y0);
        c14835a.m36186h0().m108673z(true);
        c14835a.m36186h0().m108672y(true);
        c14835a.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.home.fragment.filter.k
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                FilterFragment.m67695k1(this.f52843a);
            }
        });
        c14835a.m36158R0(new C15159c());
        c14835a.m36227w1(new InterfaceC27566d() { // from class: com.transsion.home.fragment.filter.l
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                FilterFragment.m67694j1(this.f52844a, c14835a, baseQuickAdapter, view, i11);
            }
        });
        this.mAdapter = c14835a;
        C24693o c24693o3 = (C24693o) getMViewBinding();
        if (c24693o3 != null && (recyclerView2 = c24693o3.f75531c) != null && recyclerView2.getItemDecorationCount() < 1 && (c24693o = (C24693o) getMViewBinding()) != null && (recyclerView3 = c24693o.f75531c) != null) {
            recyclerView3.addItemDecoration(new C25825b(AbstractC5776a0.m27313a(4.0f), AbstractC5776a0.m27313a(4.0f), AbstractC5776a0.m27313a(16.0f), AbstractC5776a0.m27313a(16.0f)));
        }
        C24693o c24693o4 = (C24693o) getMViewBinding();
        if (c24693o4 == null || (recyclerView = c24693o4.f75531c) == null) {
            return;
        }
        recyclerView.setAdapter(this.mAdapter);
    }

    private final void initViewModel() {
        MovieViewModel movieViewModel = this.mMovieModel;
        if (movieViewModel != null) {
            movieViewModel.m68957i().m14851j(this, new C15162f(new Function1() { // from class: com.transsion.home.fragment.filter.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FilterFragment.m67701q1(this.f52840a, (BaseDto) obj);
                }
            }));
            movieViewModel.m68960l().m14851j(this, new C15162f(new Function1() { // from class: com.transsion.home.fragment.filter.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FilterFragment.m67705s1(this.f52841a, (RefreshBaseDto) obj);
                }
            }));
            movieViewModel.m68962n().m14851j(this, new C15162f(new Function1() { // from class: com.transsion.home.fragment.filter.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FilterFragment.m67707t1(this.f52842a, (C28609a) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final void m67694j1(FilterFragment filterFragment, C14835a c14835a, BaseQuickAdapter adapter, View view, int i11) {
        String str;
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        if (item instanceof MovieItem) {
            String strM67720Z0 = filterFragment.m67720Z0(filterFragment.mChannelId, filterFragment.mFilterItems);
            MovieItem movieItem = (MovieItem) item;
            String subjectId = movieItem.getSubjectId();
            if (subjectId != null) {
                Integer subjectType = movieItem.getSubjectType();
                int value = SubjectType.SHORT_TV.getValue();
                if (subjectType != null && subjectType.intValue() == value) {
                    DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
                    Context context = c14835a.getContext();
                    Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    downloadManagerApiM87093a.m87086d0((FragmentActivity) context, filterFragment.m67720Z0(filterFragment.mChannelId, filterFragment.mFilterItems), (384 & 4) != 0 ? "" : "", movieItem.getOps(), (384 & 16) != 0 ? null : "download_subject", (384 & 32) != 0 ? false : false, (384 & 64) != 0 ? null : new Subject(subjectId, movieItem.getSubjectType(), movieItem.getTitle(), null, null, null, movieItem.getDescription(), null, null, movieItem.getGenre(), null, null, null, null, null, null, null, null, null, movieItem.getOps(), null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, 0, null, null, null, null, null, -524872, 67108863, null), (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? Boolean.FALSE : null);
                    str = "ops";
                } else {
                    Navigator navigatorM61773c = TheRouter.m61773c("/movie/detail");
                    Integer subjectType2 = movieItem.getSubjectType();
                    str = "ops";
                    Navigator.m61845x(navigatorM61773c.m61852F("subject_type", subjectType2 != null ? subjectType2.intValue() : SubjectType.MOVIE.getValue()).m61857K("id", subjectId).m61857K(str, movieItem.getOps()), c14835a.getContext(), null, 2, null);
                }
            } else {
                str = "ops";
            }
            HashMap map = new HashMap();
            String subjectId2 = movieItem.getSubjectId();
            if (subjectId2 == null) {
                subjectId2 = "";
            }
            map.put("subject_id", subjectId2);
            map.put("sequence", String.valueOf(i11));
            String ops = movieItem.getOps();
            map.put(str, ops != null ? ops : "");
            C14450a.f50860a.m65143f(strM67720Z0, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k1 */
    public static final void m67695k1(final FilterFragment filterFragment) {
        RecyclerView recyclerView;
        if (C27287m.f83003a.m106330e()) {
            filterFragment.loadMore();
            return;
        }
        C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
        C24693o c24693o = (C24693o) filterFragment.getMViewBinding();
        if (c24693o == null || (recyclerView = c24693o.f75531c) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.filter.n
            @Override // java.lang.Runnable
            public final void run() {
                FilterFragment.m67696l1(this.f52848a);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final void m67696l1(FilterFragment filterFragment) {
        C27941f c27941fM36186h0;
        C14835a c14835a = filterFragment.mAdapter;
        if (c14835a == null || (c27941fM36186h0 = c14835a.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData() {
        startLoading();
        MovieViewModel movieViewModel = this.mMovieModel;
        if (movieViewModel != null) {
            movieViewModel.m68956h(Integer.valueOf(getMTabId()), "v2");
        }
    }

    private final void loadMore() {
        String str = this.mChannelId;
        m67678R0(str, (HashMap) this.mSubjectTypeMap.get(str), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m1 */
    private final void m67697m1(View header) {
        C24676f0 c24676f0;
        ConstraintLayout constraintLayout;
        RecyclerView recyclerView;
        SwipeRefreshLayout swipeRefreshLayout;
        SwipeRefreshLayout swipeRefreshLayout2;
        C24693o c24693o = (C24693o) getMViewBinding();
        if (c24693o != null && (swipeRefreshLayout2 = c24693o.f75532d) != null) {
            swipeRefreshLayout2.setEnabled(false);
        }
        C24693o c24693o2 = (C24693o) getMViewBinding();
        if (c24693o2 != null && (swipeRefreshLayout = c24693o2.f75532d) != null) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: com.transsion.home.fragment.filter.f
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
                /* JADX INFO: renamed from: a */
                public final void mo21823a() {
                    FilterFragment.m67698n1(this.f52838a);
                }
            });
        }
        C24693o c24693o3 = (C24693o) getMViewBinding();
        if (c24693o3 != null && (recyclerView = c24693o3.f75531c) != null) {
            recyclerView.addOnScrollListener(new C15160d(header));
        }
        C24693o c24693o4 = (C24693o) getMViewBinding();
        if (c24693o4 == null || (c24676f0 = c24693o4.f75530b) == null || (constraintLayout = c24676f0.f75425c) == null) {
            return;
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.fragment.filter.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterFragment.m67699o1(this.f52839a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final void m67698n1(FilterFragment filterFragment) {
        filterFragment.mo67722c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o1 */
    public static final void m67699o1(FilterFragment filterFragment, View view) {
        RecyclerView recyclerView;
        C24693o c24693o = (C24693o) filterFragment.getMViewBinding();
        if (c24693o == null || (recyclerView = c24693o.f75531c) == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p1 */
    public static final Unit m67700p1(FilterFragment filterFragment, C28609a data) {
        RecyclerView recyclerView;
        List<Channel> typeList;
        Intrinsics.m97802h(data, "data");
        C26866a.a.m104898f(C26866a.f81698a, "MovieFragment", "selected tab " + data.m110341c(), false, 4, null);
        FilterItems filterItems = filterFragment.mFilterItems;
        if (filterItems != null && (typeList = filterItems.getTypeList()) != null) {
            int i11 = 0;
            for (Object obj : typeList) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                if (Intrinsics.m97797c(((Channel) obj).getChannelId(), data.m110341c())) {
                    filterFragment.m67676P0(i11);
                }
                i11 = i12;
            }
        }
        filterFragment.m67717y1(data);
        C25646b c25646b = filterFragment.mExposureHelper;
        if (c25646b != null) {
            c25646b.m100943e();
        }
        FilterExpandView filterExpandView = null;
        m67713w1(filterFragment, filterFragment.mChannelId, null, 2, null);
        filterFragment.m67669I1((HashMap) filterFragment.mSubjectTypeMap.get(filterFragment.mChannelId));
        C24693o c24693o = (C24693o) filterFragment.getMViewBinding();
        if (c24693o != null && (recyclerView = c24693o.f75531c) != null) {
            recyclerView.scrollToPosition(0);
        }
        TabExpandView tabExpandView = filterFragment.channelView;
        if (tabExpandView == null) {
            Intrinsics.m97819y("channelView");
            tabExpandView = null;
        }
        tabExpandView.collapse();
        FilterExpandView filterExpandView2 = filterFragment.filterView;
        if (filterExpandView2 == null) {
            Intrinsics.m97819y("filterView");
        } else {
            filterExpandView = filterExpandView2;
        }
        filterExpandView.expandFilter(0);
        if (filterFragment.m67685Y0() > 2) {
            BiddingListManager biddingListManagerM68104i0 = filterFragment.getV3ListManager();
            if (biddingListManagerM68104i0 != null) {
                biddingListManagerM68104i0.m63181C(false);
            }
        } else {
            BiddingListManager biddingListManagerM68104i1 = filterFragment.getV3ListManager();
            if (biddingListManagerM68104i1 != null) {
                biddingListManagerM68104i1.m63181C(true);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q1 */
    public static final Unit m67701q1(final FilterFragment filterFragment, BaseDto baseDto) {
        SwipeRefreshLayout swipeRefreshLayout;
        if (baseDto == null) {
            return Unit.f75682a;
        }
        if (!Intrinsics.m97797c(baseDto.getCode(), "0")) {
            C24693o c24693o = (C24693o) filterFragment.getMViewBinding();
            if (c24693o != null && (swipeRefreshLayout = c24693o.f75532d) != null) {
                swipeRefreshLayout.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.filter.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        FilterFragment.m67703r1(this.f52831a);
                    }
                }, 200L);
            }
            return Unit.f75682a;
        }
        filterFragment.mFilterItems = (FilterItems) baseDto.getData();
        filterFragment.m67676P0(0);
        filterFragment.m67692h1();
        filterFragment.m67688d1();
        C14835a c14835a = filterFragment.mAdapter;
        if (c14835a != null) {
            c14835a.m66709F1(filterFragment.m67682V0(filterFragment.mChannelId));
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public static final void m67703r1(FilterFragment filterFragment) {
        filterFragment.hideLoading();
        filterFragment.m67719z1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s1 */
    public static final Unit m67705s1(FilterFragment filterFragment, RefreshBaseDto refreshBaseDto) {
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
        C24693o c24693o = (C24693o) filterFragment.getMViewBinding();
        if (c24693o != null && (swipeRefreshLayout3 = c24693o.f75532d) != null) {
            swipeRefreshLayout3.setEnabled(true);
        }
        if (Intrinsics.m97797c(refreshBaseDto.getCode(), "0")) {
            C24655b logViewConfig = filterFragment.getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96848k(true);
            }
            MovieBean movieBean = (MovieBean) refreshBaseDto.getData();
            if (movieBean != null) {
                filterFragment.m67663F1(movieBean, refreshBaseDto.getIsRefresh());
                filterFragment.m67661E1();
                View view = filterFragment.mNoNetworkView;
                if (view != null) {
                    AbstractC26006c.m102054g(view);
                }
            }
            filterFragment.hideLoading();
            return Unit.f75682a;
        }
        if (refreshBaseDto.getIsRefresh()) {
            C24693o c24693o2 = (C24693o) filterFragment.getMViewBinding();
            if (c24693o2 != null && (swipeRefreshLayout = c24693o2.f75532d) != null && swipeRefreshLayout.isRefreshing()) {
                C24693o c24693o3 = (C24693o) filterFragment.getMViewBinding();
                if (c24693o3 != null && (swipeRefreshLayout2 = c24693o3.f75532d) != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
                filterFragment.m68106n0();
            }
        } else {
            C14835a c14835a2 = filterFragment.mAdapter;
            if (c14835a2 != null && (c27941fM36186h0 = c14835a2.m36186h0()) != null && c27941fM36186h0.m108666r() && (c14835a = filterFragment.mAdapter) != null && (c27941fM36186h1 = c14835a.m36186h0()) != null) {
                c27941fM36186h1.m108669v();
            }
        }
        C14835a c14835a3 = filterFragment.mAdapter;
        if (c14835a3 == null || (data = c14835a3.getData()) == null || data.size() != 0) {
            if (C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(com.transsnet.downloader.R$string.str_ad_video_error_tips);
            } else {
                C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
            }
            return Unit.f75682a;
        }
        if (C27287m.f83003a.m106330e()) {
            filterFragment.m67657C1(filterFragment.getString(R$string.home_no_network_content));
        } else {
            filterFragment.m67719z1();
        }
        return Unit.f75682a;
    }

    private final void showLoadingView() {
        C24674e0 c24674e0 = this.headerBinding;
        if (c24674e0 == null) {
            Intrinsics.m97819y("headerBinding");
            c24674e0 = null;
        }
        ViewStub loadingStub = c24674e0.f75417e;
        Intrinsics.m97801g(loadingStub, "loadingStub");
        loadingStub.setLayoutResource(m67683W0());
        if (this.mLoadingView == null) {
            this.mLoadingView = loadingStub.inflate();
        }
        View view = this.mLoadingView;
        if (view != null) {
            AbstractC26006c.m102058k(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final Unit m67707t1(FilterFragment filterFragment, C28609a c28609a) {
        if (c28609a != null) {
            filterFragment.m67709u1(c28609a.m110340b(), c28609a.m110341c());
            C14450a.f50860a.m65145h(filterFragment.m67720Z0(filterFragment.mChannelId, filterFragment.mFilterItems), c28609a.m110339a(), (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
            C25646b c25646b = filterFragment.mExposureHelper;
            if (c25646b != null) {
                c25646b.m100943e();
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: u1 */
    private final void m67709u1(String filterType, String filterValue) {
        this.mPage = 1;
        HashMap map = (HashMap) this.mSubjectTypeMap.get(this.mChannelId);
        if (map != null) {
            map.put(filterType, filterValue);
        }
        m67678R0(this.mChannelId, map, true);
    }

    /* JADX INFO: renamed from: v1 */
    private final void m67711v1(String channelId, HashMap selectMap) {
        List<Channel> typeList;
        this.mPage = 1;
        FilterItems filterItems = this.mFilterItems;
        if (filterItems == null || (typeList = filterItems.getTypeList()) == null) {
            return;
        }
        for (Channel channel : typeList) {
            if (Intrinsics.m97797c(channel.getChannelId(), channelId)) {
                if (selectMap == null || selectMap.isEmpty()) {
                    selectMap = (HashMap) this.mSubjectTypeMap.get(channelId);
                    List<Item> items = channel.getItems();
                    if (items != null) {
                        for (Item item : items) {
                            if ((selectMap != null ? (String) selectMap.get(item.getFilterType()) : null) == null && selectMap != null) {
                                selectMap.put(item.getFilterType(), item.getFilterValsV2().get(0).getName());
                            }
                        }
                    }
                } else {
                    this.mSubjectTypeMap.put(channelId, selectMap);
                }
                m67678R0(channelId, selectMap, true);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: w1 */
    static /* synthetic */ void m67713w1(FilterFragment filterFragment, String str, HashMap map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        filterFragment.m67711v1(str, map);
    }

    /* JADX INFO: renamed from: x1 */
    private final void m67715x1(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C14450a.f50860a.m65138a("home_filter_page", m67681U0((C28609a) it.next(), "browse_filter"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public final void m67717y1(C28609a item) {
        C14450a.f50860a.m65146i("home_filter_page", m67681U0(item, "click_filter"));
    }

    /* JADX INFO: renamed from: z1 */
    private final void m67719z1() {
        if (this.mNoNetworkView == null) {
            C24674e0 c24674e0 = this.headerBinding;
            if (c24674e0 == null) {
                Intrinsics.m97819y("headerBinding");
                c24674e0 = null;
            }
            this.mNoNetworkView = c24674e0.f75418f.inflate();
        }
        View view = this.mNoNetworkView;
        if (view != null) {
            AbstractC26006c.m102058k(view);
            final NoNetworkBigView noNetworkBigView = (NoNetworkBigView) view.findViewById(R$id.state_view);
            if (noNetworkBigView != null) {
                NoNetworkBigView.showTitle$default(noNetworkBigView, false, null, 2, null);
                noNetworkBigView.retry(new Function0() { // from class: com.transsion.home.fragment.filter.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FilterFragment.m67653A1(noNetworkBigView, this);
                    }
                });
                noNetworkBigView.goToSetting(new Function0() { // from class: com.transsion.home.fragment.filter.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FilterFragment.m67655B1(this.f52836a);
                    }
                });
            }
            AbstractC13772o.m62233a(m67684X0());
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final String m67720Z0(String channelId, FilterItems filterItems) {
        List<Channel> typeList;
        String strM68101d0 = getMTabCode();
        if (strM68101d0 != null && strM68101d0.length() != 0) {
            String strM68101d1 = getMTabCode();
            return strM68101d1 == null ? "" : strM68101d1;
        }
        if (filterItems != null && (typeList = filterItems.getTypeList()) != null) {
            for (Channel channel : typeList) {
                if (Intrinsics.m97797c(channelId, channel.getChannelId())) {
                    String channelName = channel.getChannelName();
                    return channelName == null ? m67684X0() : channelName;
                }
            }
        }
        return m67684X0();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C24693o getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C24693o c24693oM96985c = C24693o.m96985c(inflater);
        Intrinsics.m97801g(c24693oM96985c, "inflate(...)");
        return c24693oM96985c;
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: c0 */
    public void mo67722c0() {
        super.mo67722c0();
        this.mPage = 1;
        String str = this.mChannelId;
        m67678R0(str, (HashMap) this.mSubjectTypeMap.get(str), true);
        C25646b c25646b = this.mExposureHelper;
        if (c25646b != null) {
            c25646b.m100943e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: f0 */
    public RecyclerView mo67723f0() {
        C24693o c24693o = (C24693o) getMViewBinding();
        if (c24693o != null) {
            return c24693o.f75531c;
        }
        return null;
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: g0 */
    public String mo67724g0() {
        int iM67685Y0 = m67685Y0();
        if (iM67685Y0 != 2) {
            return iM67685Y0 != 3 ? "HomeFragmentListLinearTemplateAd" : "HomeFragmentListGrid3TemplateAd";
        }
        return "HomeFragmentListGrid2TemplateAd";
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void hideLoading() {
        m67686b1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment, com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        C24676f0 c24676f0;
        ConstraintLayout constraintLayout;
        Intrinsics.m97802h(view, "view");
        super.initView(view, savedInstanceState);
        this.mMovieModel = (MovieViewModel) new C3227v0(this).m14969a(MovieViewModel.class);
        TabExpandView tabExpandView = null;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.header_filter, (ViewGroup) null);
        C24674e0 c24674e0M96925a = C24674e0.m96925a(viewInflate);
        this.headerBinding = c24674e0M96925a;
        if (c24674e0M96925a == null) {
            Intrinsics.m97819y("headerBinding");
            c24674e0M96925a = null;
        }
        this.channelView = c24674e0M96925a.f75414b;
        C24674e0 c24674e0 = this.headerBinding;
        if (c24674e0 == null) {
            Intrinsics.m97819y("headerBinding");
            c24674e0 = null;
        }
        this.filterView = c24674e0.f75415c;
        m67691g1();
        m67690f1();
        m67693i1();
        Intrinsics.m97799e(viewInflate);
        m67697m1(viewInflate);
        C14835a c14835a = this.mAdapter;
        if (c14835a != null) {
            BaseQuickAdapter.m36130y(c14835a, viewInflate, 0, 0, 6, null);
        }
        initViewModel();
        setNetListener(new C15161e());
        TabExpandView tabExpandView2 = this.channelView;
        if (tabExpandView2 == null) {
            Intrinsics.m97819y("channelView");
        } else {
            tabExpandView = tabExpandView2;
        }
        tabExpandView.setOnItemClickListener(new Function1() { // from class: com.transsion.home.fragment.filter.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FilterFragment.m67700p1(this.f52829a, (C28609a) obj);
            }
        });
        this.header = viewInflate;
        int color = AbstractC2397b.getColor(requireContext(), R$color.module_01);
        C24693o c24693o = (C24693o) getMViewBinding();
        if (c24693o == null || (c24676f0 = c24693o.f75530b) == null || (constraintLayout = c24676f0.f75425c) == null) {
            return;
        }
        constraintLayout.setBackgroundColor(color);
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: l0 */
    public void mo67725l0(int lastAdPosition, BiddingNativeManager wrapperNativeManager) {
        List<Object> data;
        Intrinsics.m97802h(wrapperNativeManager, "wrapperNativeManager");
        if (wrapperNativeManager != null) {
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
        loadData();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        return new C24655b(m67684X0(), false, 2, null);
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
            } else {
                logPause();
                this.startShowTime = SystemClock.elapsedRealtime();
            }
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C14450a.f50860a.m65147k(m67720Z0(this.mChannelId, this.mFilterItems), C24662i.f75350a.m96877i(), String.valueOf(SystemClock.elapsedRealtime() - this.startShowTime));
        C25646b c25646b = this.mExposureHelper;
        if (c25646b != null) {
            c25646b.m100943e();
        }
        AbstractC14517k.m65414l(null, this, "tabId=" + getMTabId(), 1, null);
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
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void startLoading() {
        showLoadingView();
    }
}
