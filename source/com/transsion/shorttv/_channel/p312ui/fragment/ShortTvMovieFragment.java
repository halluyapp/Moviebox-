package com.transsion.shorttv._channel.p312ui.fragment;

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
import com.blankj.utilcode.util.AbstractC5781d;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.cloud.tmc.miniapp.prepare.steps.PrepareException;
import com.google.android.material.tabs.TabLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.push.PushConstants;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv._channel.model.ShortTvChannel;
import com.transsion.shorttv._channel.model.ShortTvFilterItems;
import com.transsion.shorttv._channel.model.ShortTvItem;
import com.transsion.shorttv._channel.model.ShortTvLayoutStyle;
import com.transsion.shorttv._channel.model.ShortTvMovieBean;
import com.transsion.shorttv._channel.model.ShortTvMovieItem;
import com.transsion.shorttv._channel.model.ShortTvRefreshBaseDto;
import com.transsion.shorttv._channel.p312ui.ShortTvOffsetGridLayoutManager;
import com.transsion.shorttv._channel.p312ui.adapter.C18713c;
import com.transsion.shorttv._channel.p312ui.fragment.ShortTvMovieFragment;
import com.transsion.shorttv._channel.p312ui.viewmodel.ShortTvMovieViewModel;
import com.transsion.shorttv._channel.p312ui.widget.ShortTvPopupFilterView;
import com.transsion.shorttv.base.activity.AbstractC18754g;
import com.transsion.shorttv.base.fragment.PageStatusFragment;
import com.transsion.shorttv.bean.Pager;
import com.transsion.shorttv.bean.Subject;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import is.AbstractC24220a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
import p330cs.C22776b;
import p330cs.InterfaceC22775a;
import p356ds.AbstractC23048b;
import p550kj.C24655b;
import p550kj.C24662i;
import p557ks.C25427b;
import p743rh.C27287m;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p954yr.AbstractC29002b;
import pg.C26866a;
import rs.C27329a0;
import rs.C27335d0;
import tr.C27846b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 £\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002¤\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0004J!\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010\u0004J7\u0010#\u001a\u00020\t2&\u0010\"\u001a\"\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010 j\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u0001`!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\b'\u0010\u0004J\u0019\u0010(\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b(\u0010)J#\u0010,\u001a\u00020\t2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0*H\u0002¢\u0006\u0004\b,\u0010-J7\u00100\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010*2\u0006\u0010/\u001a\u00020\u001cH\u0002¢\u0006\u0004\b0\u00101J!\u00104\u001a\u00020\t2\b\u00103\u001a\u0004\u0018\u0001022\u0006\u0010/\u001a\u00020\u001cH\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\tH\u0002¢\u0006\u0004\b6\u0010\u0004J\u000f\u00107\u001a\u00020\tH\u0002¢\u0006\u0004\b7\u0010\u0004J\u000f\u00108\u001a\u00020\tH\u0002¢\u0006\u0004\b8\u0010\u0004J\u000f\u00109\u001a\u00020\tH\u0002¢\u0006\u0004\b9\u0010\u0004J\u0019\u0010;\u001a\u00020\t2\b\u0010:\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b;\u0010)J\u0019\u0010<\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b<\u0010)J\u000f\u0010=\u001a\u00020\tH\u0002¢\u0006\u0004\b=\u0010\u0004J\u000f\u0010>\u001a\u00020\u0018H\u0002¢\u0006\u0004\b>\u0010?J\u001b\u0010A\u001a\u0004\u0018\u00010@2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0018H\u0002¢\u0006\u0004\bC\u0010?J\u0017\u0010E\u001a\u00020\t2\u0006\u0010D\u001a\u00020\u001cH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\tH\u0002¢\u0006\u0004\bG\u0010\u0004J\u000f\u0010H\u001a\u00020\u000fH\u0002¢\u0006\u0004\bH\u0010\u0011J\u000f\u0010I\u001a\u00020\tH\u0002¢\u0006\u0004\bI\u0010\u0004J\u0017\u0010L\u001a\u00020\u00022\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u000fH\u0016¢\u0006\u0004\bN\u0010\u0011J\u000f\u0010O\u001a\u00020\tH\u0016¢\u0006\u0004\bO\u0010\u0004J\u0019\u0010P\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\bP\u0010QJ!\u0010R\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\bR\u0010\u000bJ\u001f\u0010W\u001a\u00020\t2\u0006\u0010T\u001a\u00020S2\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020\t2\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\u0019\u0010_\u001a\u00020\t*\u00020]2\u0006\u0010^\u001a\u00020\u001c¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\tH\u0016¢\u0006\u0004\ba\u0010\u0004J\u000f\u0010b\u001a\u00020\tH\u0016¢\u0006\u0004\bb\u0010\u0004J\u000f\u0010c\u001a\u00020\tH\u0016¢\u0006\u0004\bc\u0010\u0004J\u000f\u0010d\u001a\u00020\u001cH\u0016¢\u0006\u0004\bd\u0010\u001eJ\u000f\u0010e\u001a\u00020\tH\u0016¢\u0006\u0004\be\u0010\u0004J\u0017\u0010g\u001a\u00020\t2\u0006\u0010f\u001a\u00020\u001cH\u0016¢\u0006\u0004\bg\u0010FJ\u000f\u0010h\u001a\u00020\tH\u0016¢\u0006\u0004\bh\u0010\u0004J\u000f\u0010j\u001a\u00020iH\u0016¢\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00020\tH\u0016¢\u0006\u0004\bl\u0010\u0004J\r\u0010m\u001a\u00020\u000f¢\u0006\u0004\bm\u0010\u0011R\u0018\u0010q\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010u\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010x\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010{\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010\u007f\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0081\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0081\u0001R\u0018\u0010\u0088\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010zRq\u0010\u008b\u0001\u001aZ\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0 j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`!0 j,\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0 j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`!`!8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001a\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0019\u0010\u0095\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0081\u0001R\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R'\u0010\u009c\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001a\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010wR\u001a\u0010 \u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009f\u0001\u0010wR\u001a\u0010¢\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¡\u0001\u0010w¨\u0006¥\u0001"}, m97100d2 = {"Lcom/transsion/shorttv/_channel/ui/fragment/ShortTvMovieFragment;", "Lcom/transsion/shorttv/base/fragment/PageStatusFragment;", "Lrs/a0;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "initScrollListener", "T0", "U0", "", "H0", "()Ljava/lang/String;", "R0", TmcStartParams.KEY_CHANNEL_ID, "", "Lcom/transsion/shorttv/_channel/model/ShortTvItem;", "G0", "(Ljava/lang/String;)Ljava/util/List;", "", RequestParameters.POSITION, "C0", "(I)V", "", "O0", "()Z", "h1", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "selectItems", "p1", "(Ljava/util/HashMap;)V", "loadData", "k1", "loadMore", "f1", "(Ljava/lang/String;)V", "", "selectedMap", "e1", "(Ljava/util/Map;)V", "selectedItems", "isRefresh", "E0", "(Ljava/lang/String;Ljava/util/Map;Z)V", "Lcom/transsion/shorttv/_channel/model/ShortTvMovieBean;", "movieBean", "n1", "(Lcom/transsion/shorttv/_channel/model/ShortTvMovieBean;Z)V", "startLoading", "hideLoading", "j1", "P0", "string", "l1", "D0", "Q0", "L0", "()I", "Lcom/transsion/shorttv/_channel/model/ShortTvLayoutStyle;", "I0", "(Ljava/lang/String;)Lcom/transsion/shorttv/_channel/model/ShortTvLayoutStyle;", "J0", PushConstants.PUSH_SERVICE_TYPE_SHOW, "g1", "(Z)V", "S0", "K0", "F0", "Landroid/view/LayoutInflater;", "inflater", "N0", "(Landroid/view/LayoutInflater;)Lrs/a0;", "getPageStateLayoutTitle", "initViewData", "onCreate", "(Landroid/os/Bundle;)V", "onViewCreated", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onConnected", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/google/android/material/tabs/TabLayout$Tab;", "selected", "i1", "(Lcom/google/android/material/tabs/TabLayout$Tab;Z)V", "initViewModel", "initListener", "retryLoadData", "isShowPageStateLayoutTitle", "onResume", "hidden", "onHiddenChanged", "onPause", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "onDestroyView", "M0", "Lcom/transsion/shorttv/_channel/ui/adapter/c;", "i", "Lcom/transsion/shorttv/_channel/ui/adapter/c;", "mAdapter", "Lcom/transsion/shorttv/_channel/ui/viewmodel/ShortTvMovieViewModel;", "j", "Lcom/transsion/shorttv/_channel/ui/viewmodel/ShortTvMovieViewModel;", "mMovieModel", CampaignEx.JSON_KEY_AD_K, "Landroid/view/View;", "header", "l", "I", "mPage", "Lcom/transsion/shorttv/_channel/model/ShortTvFilterItems;", "m", "Lcom/transsion/shorttv/_channel/model/ShortTvFilterItems;", "mFilterItems", "n", "Ljava/lang/String;", "mChannelId", "o", "mDeeplinkChannelId", TtmlNode.TAG_P, "mFilterJson", CampaignEx.JSON_KEY_AD_Q, "mPerPage", CampaignEx.JSON_KEY_AD_R, "Ljava/util/HashMap;", "mSubjectTypeMap", "Lcom/transsion/shorttv/_channel/ui/widget/ShortTvPopupFilterView;", "s", "Lcom/transsion/shorttv/_channel/ui/widget/ShortTvPopupFilterView;", "mFilterView", "", "t", "J", "startShowTime", TmcStartParams.KEY_URL_SHORT, "mPageFrom", "Lcs/b;", "v", "Lcs/b;", "mExposureHelper", "w", "Ljava/util/Map;", "mLatestSelectItems", "x", "mNoNetworkView", "y", "mLoadingView", "z", "mNoResultView", "A", "a", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTvMovieFragment extends PageStatusFragment<C27329a0> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private C18713c mAdapter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private ShortTvMovieViewModel mMovieModel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private View header;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private ShortTvFilterItems mFilterItems;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private String mChannelId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private String mDeeplinkChannelId;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private String mFilterJson;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private ShortTvPopupFilterView mFilterView;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private long startShowTime;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private C22776b mExposureHelper;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private Map mLatestSelectItems;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private View mNoNetworkView;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private View mLoadingView;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private View mNoResultView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int mPage = 1;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int mPerPage = 12;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private HashMap mSubjectTypeMap = new HashMap();

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private String mPageFrom = C24662i.f75350a.m96877i();

    /* JADX INFO: renamed from: com.transsion.shorttv._channel.ui.fragment.ShortTvMovieFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ShortTvMovieFragment m78774a(boolean z11, String str) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("hide_header_bg", z11);
            bundle.putString("filter_json", str);
            ShortTvMovieFragment shortTvMovieFragment = new ShortTvMovieFragment();
            shortTvMovieFragment.setArguments(bundle);
            return shortTvMovieFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv._channel.ui.fragment.ShortTvMovieFragment$b */
    public static final class C18717b implements TabLayout.OnTabSelectedListener {
        C18717b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            C26866a.a.m104898f(C26866a.f81698a, "MovieFragment", "release tab " + (tab != null ? Integer.valueOf(tab.getPosition()) : null), false, 4, null);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            RecyclerView recyclerView;
            C26866a.a.m104898f(C26866a.f81698a, "MovieFragment", "selected tab " + (tab != null ? Integer.valueOf(tab.getPosition()) : null), false, 4, null);
            if (tab != null) {
                ShortTvMovieFragment.this.m78773i1(tab, true);
            }
            ShortTvMovieFragment.this.startShowTime = SystemClock.elapsedRealtime();
            ShortTvMovieFragment shortTvMovieFragment = ShortTvMovieFragment.this;
            shortTvMovieFragment.mPageFrom = shortTvMovieFragment.m78771M0();
            if (tab == null) {
                return;
            }
            ShortTvMovieFragment.this.m78713C0(tab.getPosition());
            AbstractC29002b.m111540e(ShortTvMovieFragment.this.mPageFrom, ShortTvMovieFragment.this.mPageFrom, null, null, null, null, 60, null);
            C22776b c22776b = ShortTvMovieFragment.this.mExposureHelper;
            if (c22776b != null) {
                c22776b.m90702e();
            }
            ShortTvMovieFragment shortTvMovieFragment2 = ShortTvMovieFragment.this;
            shortTvMovieFragment2.m78741f1(shortTvMovieFragment2.mChannelId);
            ShortTvMovieFragment shortTvMovieFragment3 = ShortTvMovieFragment.this;
            shortTvMovieFragment3.m78760p1((HashMap) shortTvMovieFragment3.mSubjectTypeMap.get(ShortTvMovieFragment.this.mChannelId));
            C27329a0 c27329a0 = (C27329a0) ShortTvMovieFragment.this.getMViewBinding();
            if (c27329a0 == null || (recyclerView = c27329a0.f83069c) == null) {
                return;
            }
            recyclerView.scrollToPosition(0);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            if (tab != null) {
                ShortTvMovieFragment.this.m78773i1(tab, false);
            }
            AbstractC29002b.m111541f(ShortTvMovieFragment.this.m78771M0(), ShortTvMovieFragment.this.mPageFrom, String.valueOf(SystemClock.elapsedRealtime() - ShortTvMovieFragment.this.startShowTime));
            C26866a.a.m104898f(C26866a.f81698a, "MovieFragment", "unselected tab " + (tab != null ? Integer.valueOf(tab.getPosition()) : null), false, 4, null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv._channel.ui.fragment.ShortTvMovieFragment$c */
    public static final class C18718c implements InterfaceC22775a {
        C18718c() {
        }

        @Override // p330cs.InterfaceC22775a
        /* JADX INFO: renamed from: a */
        public void mo78681a(int i11, long j11, View view) {
            List<Object> data;
            String subjectId;
            String ops;
            C18713c c18713c = ShortTvMovieFragment.this.mAdapter;
            if (c18713c == null || (data = c18713c.getData()) == null) {
                return;
            }
            int size = data.size();
            ShortTvMovieFragment shortTvMovieFragment = ShortTvMovieFragment.this;
            if (i11 >= size) {
                return;
            }
            C18713c c18713c2 = shortTvMovieFragment.mAdapter;
            ShortTvMovieItem shortTvMovieItem = c18713c2 != null ? (ShortTvMovieItem) c18713c2.getItem(i11) : null;
            HashMap map = new HashMap();
            String str = "";
            if (shortTvMovieItem == null || (subjectId = shortTvMovieItem.getSubjectId()) == null) {
                subjectId = "";
            }
            map.put("subject_id", subjectId);
            map.put("has_resource", String.valueOf(shortTvMovieItem != null ? shortTvMovieItem.getHasResource() : null));
            map.put("sequence", String.valueOf(i11));
            if (shortTvMovieItem != null && (ops = shortTvMovieItem.getOps()) != null) {
                str = ops;
            }
            map.put("ops", str);
            map.put("filter_name", shortTvMovieFragment.m78718H0());
            map.put("browse_duration", String.valueOf(j11));
            C24662i.f75350a.m96872D(shortTvMovieFragment.m78771M0(), map);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv._channel.ui.fragment.ShortTvMovieFragment$d */
    public static final class C18719d extends DiffUtil.AbstractC4174e {
        C18719d() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(ShortTvMovieItem oldItem, ShortTvMovieItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getSubjectId(), newItem.getSubjectId());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(ShortTvMovieItem oldItem, ShortTvMovieItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getSubjectType(), newItem.getSubjectType());
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv._channel.ui.fragment.ShortTvMovieFragment$e */
    public static final class C18720e extends RecyclerView.AbstractC4219r {

        /* JADX INFO: renamed from: a */
        private int[] f60440a;

        /* JADX INFO: renamed from: b */
        private int f60441b;

        C18720e() {
        }

        /* JADX INFO: renamed from: d */
        private final void m78777d(RecyclerView recyclerView) {
            RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                if (this.f60440a == null) {
                    this.f60440a = new int[((StaggeredGridLayoutManager) layoutManager).m20978Q()];
                }
                ((StaggeredGridLayoutManager) layoutManager).m20974E(this.f60440a);
                this.f60441b = m78778e(this.f60440a);
                return;
            }
            if (layoutManager instanceof GridLayoutManager) {
                this.f60441b = ((GridLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
            } else {
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    throw new RuntimeException("Unsupported layoutManager.");
                }
                this.f60441b = ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
            }
        }

        /* JADX INFO: renamed from: e */
        private final int m78778e(int[] iArr) {
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
            C18713c c18713c;
            C27941f c27941fM36186h0;
            C27941f c27941fM36186h1;
            Intrinsics.m97802h(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i11);
            RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
            int childCount = layoutManager != null ? layoutManager.getChildCount() : 0;
            int itemCount = layoutManager != null ? layoutManager.getItemCount() : 0;
            if (i11 != 0 || childCount <= 0 || this.f60441b < itemCount - 1) {
                return;
            }
            C18713c c18713c2 = ShortTvMovieFragment.this.mAdapter;
            if (((c18713c2 == null || (c27941fM36186h1 = c18713c2.m36186h0()) == null) ? null : c27941fM36186h1.m108661i()) != LoadMoreStatus.Fail || (c18713c = ShortTvMovieFragment.this.mAdapter) == null || (c27941fM36186h0 = c18713c.m36186h0()) == null) {
                return;
            }
            c27941fM36186h0.m108670w();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            m78777d(recyclerView);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv._channel.ui.fragment.ShortTvMovieFragment$f */
    static final class C18721f implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f60443a;

        C18721f(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f60443a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f60443a;
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
            this.f60443a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public final void m78713C0(int position) {
        String channelId;
        List<ShortTvChannel> typeList;
        ShortTvChannel shortTvChannel;
        RecyclerView recyclerView;
        List<ShortTvChannel> typeList2;
        ShortTvFilterItems shortTvFilterItems = this.mFilterItems;
        int size = (shortTvFilterItems == null || (typeList2 = shortTvFilterItems.getTypeList()) == null) ? -1 : typeList2.size();
        if (position < 0 || position >= size) {
            return;
        }
        RecyclerView.AbstractC4214m layoutManager = null;
        if (m78723O0()) {
            channelId = this.mDeeplinkChannelId;
        } else {
            ShortTvFilterItems shortTvFilterItems2 = this.mFilterItems;
            channelId = (shortTvFilterItems2 == null || (typeList = shortTvFilterItems2.getTypeList()) == null || (shortTvChannel = typeList.get(position)) == null) ? null : shortTvChannel.getChannelId();
        }
        this.mChannelId = channelId;
        this.mDeeplinkChannelId = null;
        View view = this.header;
        if (view != null) {
            C27329a0 c27329a0 = (C27329a0) getMViewBinding();
            if (c27329a0 != null && (recyclerView = c27329a0.f83069c) != null) {
                layoutManager = recyclerView.getLayoutManager();
            }
            if (layoutManager instanceof ShortTvOffsetGridLayoutManager) {
                ShortTvOffsetGridLayoutManager shortTvOffsetGridLayoutManager = (ShortTvOffsetGridLayoutManager) layoutManager;
                if (shortTvOffsetGridLayoutManager.m20737U() == m78722L0()) {
                    C26866a.a.m104898f(C26866a.f81698a, "MovieFragment", "span count is same " + shortTvOffsetGridLayoutManager.m20737U(), false, 4, null);
                    return;
                }
            }
            m78729U0();
            ViewParent parent = view.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(view);
            }
            C18713c c18713c = this.mAdapter;
            if (c18713c != null) {
                BaseQuickAdapter.m36130y(c18713c, view, 0, 0, 6, null);
            }
            m78748j1();
        }
    }

    /* JADX INFO: renamed from: D0 */
    private final void m78714D0(String channelId) {
        HashMap map = (HashMap) this.mSubjectTypeMap.get(channelId);
        if (map != null) {
            map.clear();
        }
    }

    /* JADX INFO: renamed from: E0 */
    private final void m78715E0(String channelId, Map selectedItems, boolean isRefresh) {
        ShortTvMovieViewModel shortTvMovieViewModel = this.mMovieModel;
        if (shortTvMovieViewModel != null) {
            int i11 = this.mPage;
            this.mPage = i11 + 1;
            shortTvMovieViewModel.m78846k(i11, this.mPerPage, channelId, selectedItems, isRefresh);
        }
        this.mLatestSelectItems = selectedItems;
    }

    /* JADX INFO: renamed from: F0 */
    private final void m78716F0() {
        this.mPage = 1;
        String str = this.mChannelId;
        m78715E0(str, (Map) this.mSubjectTypeMap.get(str), true);
        C22776b c22776b = this.mExposureHelper;
        if (c22776b != null) {
            c22776b.m90702e();
        }
    }

    /* JADX INFO: renamed from: G0 */
    private final List m78717G0(String channelId) {
        List<ShortTvChannel> typeList;
        ShortTvFilterItems shortTvFilterItems = this.mFilterItems;
        if (shortTvFilterItems == null || (typeList = shortTvFilterItems.getTypeList()) == null) {
            return null;
        }
        for (ShortTvChannel shortTvChannel : typeList) {
            if (Intrinsics.m97797c(shortTvChannel.getChannelId(), channelId)) {
                return shortTvChannel.getItems();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public final String m78718H0() {
        String str;
        HashMap map = (HashMap) this.mSubjectTypeMap.get(this.mChannelId);
        if (map == null || (str = (String) map.get("sort")) == null) {
            str = "";
        }
        return "filter_" + str;
    }

    /* JADX INFO: renamed from: I0 */
    private final ShortTvLayoutStyle m78719I0(String channelId) {
        List<ShortTvChannel> typeList;
        ShortTvFilterItems shortTvFilterItems = this.mFilterItems;
        if (shortTvFilterItems == null || (typeList = shortTvFilterItems.getTypeList()) == null) {
            return null;
        }
        for (ShortTvChannel shortTvChannel : typeList) {
            if (Intrinsics.m97797c(shortTvChannel.getChannelId(), channelId)) {
                return shortTvChannel.getStyle();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: J0 */
    private final int m78720J0() {
        return R$layout.short_tv_home_empty_view_loading;
    }

    /* JADX INFO: renamed from: K0 */
    private final String m78721K0() {
        return "movie_filter_page";
    }

    /* JADX INFO: renamed from: L0 */
    private final int m78722L0() {
        ShortTvLayoutStyle shortTvLayoutStyleM78719I0 = m78719I0(this.mChannelId);
        if (shortTvLayoutStyleM78719I0 != null) {
            int colNum = shortTvLayoutStyleM78719I0.getColNum();
            FragmentActivity activity = getActivity();
            return colNum + ((activity == null || !AbstractC24220a.m95235a(activity)) ? 0 : 1);
        }
        if (Intrinsics.m97797c(this.mChannelId, "5") || Intrinsics.m97797c(this.mChannelId, PrepareException.ERROR_NO_URL) || Intrinsics.m97797c(this.mChannelId, "1003") || Intrinsics.m97797c(this.mChannelId, "1004")) {
            return 2;
        }
        FragmentActivity activity2 = getActivity();
        return (activity2 == null || !AbstractC24220a.m95235a(activity2)) ? 3 : 4;
    }

    /* JADX INFO: renamed from: O0 */
    private final boolean m78723O0() {
        ShortTvFilterItems shortTvFilterItems;
        List<ShortTvChannel> typeList;
        String str = this.mDeeplinkChannelId;
        if (str != null && str.length() != 0 && (shortTvFilterItems = this.mFilterItems) != null && (typeList = shortTvFilterItems.getTypeList()) != null) {
            Iterator<T> it = typeList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.m97797c(((ShortTvChannel) it.next()).getChannelId(), this.mDeeplinkChannelId)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: P0 */
    private final void m78724P0() {
        View view = this.mLoadingView;
        if (view != null) {
            AbstractC23048b.m91691b(view);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m78725Q0() {
        View view = this.mNoResultView;
        if (view != null) {
            AbstractC23048b.m91691b(view);
        }
    }

    /* JADX INFO: renamed from: R0 */
    private final void m78726R0() {
        List<ShortTvChannel> typeList;
        C27335d0 c27335d0;
        C27335d0 c27335d1;
        List<ShortTvChannel> typeList2;
        ShortTvFilterItems shortTvFilterItems = this.mFilterItems;
        int i11 = 0;
        int size = (shortTvFilterItems == null || (typeList2 = shortTvFilterItems.getTypeList()) == null) ? 0 : typeList2.size();
        if (size <= 0) {
            return;
        }
        C27329a0 c27329a0 = (C27329a0) getMViewBinding();
        ConstraintLayout constraintLayout = null;
        TabLayout tabLayout = (c27329a0 == null || (c27335d1 = c27329a0.f83068b) == null) ? null : c27335d1.f83135d;
        C27329a0 c27329a1 = (C27329a0) getMViewBinding();
        if (c27329a1 != null && (c27335d0 = c27329a1.f83068b) != null) {
            constraintLayout = c27335d0.f83134c;
        }
        if (size == 1) {
            if (constraintLayout != null) {
                AbstractC23048b.m91691b(constraintLayout);
            }
            m78741f1(this.mChannelId);
            m78760p1((HashMap) this.mSubjectTypeMap.get(this.mChannelId));
            return;
        }
        if (constraintLayout != null) {
            AbstractC23048b.m91694e(constraintLayout);
        }
        if (tabLayout != null) {
            tabLayout.removeAllTabs();
        }
        if (tabLayout != null) {
            tabLayout.clearOnTabSelectedListeners();
        }
        if (tabLayout != null) {
            tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C18717b());
        }
        ShortTvFilterItems shortTvFilterItems2 = this.mFilterItems;
        if (shortTvFilterItems2 == null || (typeList = shortTvFilterItems2.getTypeList()) == null) {
            return;
        }
        for (Object obj : typeList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            ShortTvChannel shortTvChannel = (ShortTvChannel) obj;
            if (tabLayout != null) {
                tabLayout.addTab(tabLayout.newTab().setText(shortTvChannel.getChannelName()), Intrinsics.m97797c(shortTvChannel.getChannelId(), this.mChannelId));
            }
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: S0 */
    private final void m78727S0() {
        RecyclerView recyclerView;
        if (this.mExposureHelper == null) {
            C22776b c22776b = new C22776b(0.6f, new C18718c(), false, 4, null);
            C27329a0 c27329a0 = (C27329a0) getMViewBinding();
            if (c27329a0 != null && (recyclerView = c27329a0.f83069c) != null) {
                recyclerView.addOnScrollListener(c22776b);
            }
            this.mExposureHelper = c22776b;
        }
    }

    /* JADX INFO: renamed from: T0 */
    private final void m78728T0() {
        List<ShortTvChannel> typeList;
        this.mSubjectTypeMap.clear();
        ShortTvFilterItems shortTvFilterItems = this.mFilterItems;
        if (shortTvFilterItems == null || (typeList = shortTvFilterItems.getTypeList()) == null) {
            return;
        }
        Iterator<T> it = typeList.iterator();
        while (it.hasNext()) {
            this.mSubjectTypeMap.put(((ShortTvChannel) it.next()).getChannelId(), new HashMap());
        }
    }

    /* JADX INFO: renamed from: U0 */
    private final void m78729U0() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C27329a0 c27329a0;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        int iM78722L0 = m78722L0();
        ShortTvOffsetGridLayoutManager shortTvOffsetGridLayoutManager = new ShortTvOffsetGridLayoutManager(getContext(), iM78722L0, 1, false);
        C27329a0 c27329a1 = (C27329a0) getMViewBinding();
        if (c27329a1 != null && (recyclerView4 = c27329a1.f83069c) != null) {
            recyclerView4.setLayoutManager(shortTvOffsetGridLayoutManager);
        }
        C18713c c18713c = new C18713c(new ArrayList(), this.mExposureHelper, m78719I0(this.mChannelId), iM78722L0);
        c18713c.m36186h0().m108673z(true);
        c18713c.m36186h0().m108672y(true);
        c18713c.m36186h0().m108656D(new InterfaceC27568f() { // from class: vr.j
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                ShortTvMovieFragment.m78731W0(this.f86813a);
            }
        });
        c18713c.m36158R0(new C18719d());
        c18713c.m36227w1(new InterfaceC27566d() { // from class: vr.k
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ShortTvMovieFragment.m78730V0(this.f86814a, baseQuickAdapter, view, i11);
            }
        });
        this.mAdapter = c18713c;
        C27329a0 c27329a2 = (C27329a0) getMViewBinding();
        if (c27329a2 != null && (recyclerView2 = c27329a2.f83069c) != null && recyclerView2.getItemDecorationCount() < 2 && (c27329a0 = (C27329a0) getMViewBinding()) != null && (recyclerView3 = c27329a0.f83069c) != null) {
            recyclerView3.addItemDecoration(new C27846b(AbstractC5776a0.m27313a(4.0f), AbstractC5776a0.m27313a(4.0f), AbstractC5776a0.m27313a(16.0f), AbstractC5776a0.m27313a(16.0f)));
        }
        C27329a0 c27329a3 = (C27329a0) getMViewBinding();
        if (c27329a3 == null || (recyclerView = c27329a3.f83069c) == null) {
            return;
        }
        recyclerView.setAdapter(this.mAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final void m78730V0(ShortTvMovieFragment shortTvMovieFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        if (item instanceof ShortTvMovieItem) {
            ShortTvMovieItem shortTvMovieItem = (ShortTvMovieItem) item;
            String subjectId = shortTvMovieItem.getSubjectId();
            if (subjectId != null) {
                AbstractC29002b.m111538c(new Subject(subjectId, shortTvMovieItem.getSubjectType(), shortTvMovieItem.getTitle(), null, null, null, shortTvMovieItem.getDescription(), null, null, shortTvMovieItem.getGenre(), null, null, null, null, null, null, null, null, null, shortTvMovieItem.getOps(), null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, false, null, shortTvMovieItem.getPlayUrl(), 0, 0, null, 0, null, 0, null, -524872, 1069547519, null));
            }
            HashMap map = new HashMap();
            String subjectId2 = shortTvMovieItem.getSubjectId();
            if (subjectId2 == null) {
                subjectId2 = "";
            }
            map.put("subject_id", subjectId2);
            map.put("sequence", String.valueOf(i11));
            String ops = shortTvMovieItem.getOps();
            map.put("ops", ops != null ? ops : "");
            map.put("filter_name", shortTvMovieFragment.m78718H0());
            C24662i.f75350a.m96881p(shortTvMovieFragment.m78771M0(), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final void m78731W0(final ShortTvMovieFragment shortTvMovieFragment) {
        RecyclerView recyclerView;
        if (C27287m.f83003a.m106330e()) {
            shortTvMovieFragment.loadMore();
            return;
        }
        C25427b.f76996a.m99960d(R$string.short_tv_no_network_toast);
        C27329a0 c27329a0 = (C27329a0) shortTvMovieFragment.getMViewBinding();
        if (c27329a0 == null || (recyclerView = c27329a0.f83069c) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: vr.b
            @Override // java.lang.Runnable
            public final void run() {
                ShortTvMovieFragment.m78732X0(this.f86804a);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final void m78732X0(ShortTvMovieFragment shortTvMovieFragment) {
        C27941f c27941fM36186h0;
        C18713c c18713c = shortTvMovieFragment.mAdapter;
        if (c18713c == null || (c27941fM36186h0 = c18713c.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final void m78733Y0(ShortTvMovieFragment shortTvMovieFragment) {
        shortTvMovieFragment.m78716F0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final void m78734Z0(ShortTvMovieFragment shortTvMovieFragment) {
        shortTvMovieFragment.loadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final Unit m78735a1(final ShortTvMovieFragment shortTvMovieFragment, BaseDto baseDto) {
        SwipeRefreshLayout swipeRefreshLayout;
        if (baseDto == null) {
            return Unit.f75682a;
        }
        if (!Intrinsics.m97797c(baseDto.getCode(), "0")) {
            C27329a0 c27329a0 = (C27329a0) shortTvMovieFragment.getMViewBinding();
            if (c27329a0 != null && (swipeRefreshLayout = c27329a0.f83073g) != null) {
                swipeRefreshLayout.postDelayed(new Runnable() { // from class: vr.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ShortTvMovieFragment.m78736b1(this.f86811a);
                    }
                }, 200L);
            }
            return Unit.f75682a;
        }
        shortTvMovieFragment.mFilterItems = (ShortTvFilterItems) baseDto.getData();
        shortTvMovieFragment.m78713C0(0);
        shortTvMovieFragment.m78728T0();
        shortTvMovieFragment.m78726R0();
        C18713c c18713c = shortTvMovieFragment.mAdapter;
        if (c18713c != null) {
            c18713c.m78706F1(shortTvMovieFragment.m78719I0(shortTvMovieFragment.mChannelId));
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final void m78736b1(ShortTvMovieFragment shortTvMovieFragment) {
        shortTvMovieFragment.hideLoading();
        shortTvMovieFragment.m78750k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c1 */
    public static final Unit m78737c1(ShortTvMovieFragment shortTvMovieFragment, ShortTvRefreshBaseDto shortTvRefreshBaseDto) {
        C27941f c27941fM36186h0;
        C18713c c18713c;
        C27941f c27941fM36186h1;
        List<Object> data;
        SwipeRefreshLayout swipeRefreshLayout;
        C27329a0 c27329a0;
        SwipeRefreshLayout swipeRefreshLayout2;
        SwipeRefreshLayout swipeRefreshLayout3;
        if (shortTvRefreshBaseDto == null) {
            return Unit.f75682a;
        }
        C27329a0 c27329a1 = (C27329a0) shortTvMovieFragment.getMViewBinding();
        if (c27329a1 != null && (swipeRefreshLayout3 = c27329a1.f83073g) != null) {
            swipeRefreshLayout3.setEnabled(true);
        }
        if (Intrinsics.m97797c(shortTvRefreshBaseDto.getCode(), "0")) {
            C24655b logViewConfig = shortTvMovieFragment.getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96848k(true);
            }
            ShortTvMovieBean shortTvMovieBean = (ShortTvMovieBean) shortTvRefreshBaseDto.getData();
            if (shortTvMovieBean != null) {
                shortTvMovieFragment.m78756n1(shortTvMovieBean, shortTvRefreshBaseDto.getIsRefresh());
                View view = shortTvMovieFragment.mNoNetworkView;
                if (view != null) {
                    AbstractC23048b.m91691b(view);
                }
            }
            shortTvMovieFragment.hideLoading();
            return Unit.f75682a;
        }
        if (shortTvRefreshBaseDto.getIsRefresh()) {
            C27329a0 c27329a2 = (C27329a0) shortTvMovieFragment.getMViewBinding();
            if (c27329a2 != null && (swipeRefreshLayout = c27329a2.f83073g) != null && swipeRefreshLayout.isRefreshing() && (c27329a0 = (C27329a0) shortTvMovieFragment.getMViewBinding()) != null && (swipeRefreshLayout2 = c27329a0.f83073g) != null) {
                swipeRefreshLayout2.setRefreshing(false);
            }
        } else {
            C18713c c18713c2 = shortTvMovieFragment.mAdapter;
            if (c18713c2 != null && (c27941fM36186h0 = c18713c2.m36186h0()) != null && c27941fM36186h0.m108666r() && (c18713c = shortTvMovieFragment.mAdapter) != null && (c27941fM36186h1 = c18713c.m36186h0()) != null) {
                c27941fM36186h1.m108669v();
            }
        }
        C18713c c18713c3 = shortTvMovieFragment.mAdapter;
        if (c18713c3 == null || (data = c18713c3.getData()) == null || data.size() != 0) {
            if (C27287m.f83003a.m106330e()) {
                C25427b.f76996a.m99960d(R$string.short_tv_str_ad_video_error_tips);
            } else {
                C25427b.f76996a.m99960d(R$string.short_tv_no_network_toast);
            }
            shortTvMovieFragment.m78724P0();
            return Unit.f75682a;
        }
        if (C27287m.f83003a.m106330e()) {
            shortTvMovieFragment.m78752l1(shortTvMovieFragment.getString(R$string.short_tv_no_network));
        } else {
            shortTvMovieFragment.m78750k1();
        }
        shortTvMovieFragment.m78724P0();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final Unit m78738d1(ShortTvMovieFragment shortTvMovieFragment, Map it) {
        Intrinsics.m97802h(it, "it");
        shortTvMovieFragment.m78739e1(it);
        AbstractC29002b.m111540e(shortTvMovieFragment.m78771M0(), it.toString(), null, null, null, null, 60, null);
        C22776b c22776b = shortTvMovieFragment.mExposureHelper;
        if (c22776b != null) {
            c22776b.m90702e();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: e1 */
    private final void m78739e1(Map selectedMap) {
        this.mPage = 1;
        HashMap map = (HashMap) this.mSubjectTypeMap.get(this.mChannelId);
        if (map != null) {
            map.clear();
        }
        if (map != null) {
            map.putAll(selectedMap);
        }
        m78715E0(this.mChannelId, map, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public final void m78741f1(String channelId) {
        List<ShortTvChannel> typeList;
        this.mPage = 1;
        ShortTvFilterItems shortTvFilterItems = this.mFilterItems;
        if (shortTvFilterItems == null || (typeList = shortTvFilterItems.getTypeList()) == null) {
            return;
        }
        for (ShortTvChannel shortTvChannel : typeList) {
            if (Intrinsics.m97797c(shortTvChannel.getChannelId(), channelId)) {
                HashMap map = (HashMap) this.mSubjectTypeMap.get(channelId);
                String str = this.mFilterJson;
                if (str == null || str.length() <= 0) {
                    List<ShortTvItem> items = shortTvChannel.getItems();
                    if (items != null) {
                        for (ShortTvItem shortTvItem : items) {
                            if ((map != null ? (String) map.get(shortTvItem.getFilterType()) : null) == null) {
                                if (shortTvItem.getRangeVals() != null) {
                                    String strM78872a = ShortTvPopupFilterView.INSTANCE.m78872a(shortTvItem.getRangeVals().getMinVal(), shortTvItem.getRangeVals().getMaxVal());
                                    if (map != null) {
                                        map.put(shortTvItem.getFilterType(), strM78872a);
                                    }
                                } else if (!shortTvItem.getFilterValsV2().isEmpty() && map != null) {
                                    map.put(shortTvItem.getFilterType(), shortTvItem.getFilterValsV2().get(0).getId());
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
                        List<ShortTvItem> items2 = shortTvChannel.getItems();
                        if (items2 != null) {
                            for (ShortTvItem shortTvItem2 : items2) {
                                if ((map != null ? (String) map.get(shortTvItem2.getFilterType()) : null) == null && map != null) {
                                    map.put(shortTvItem2.getFilterType(), shortTvItem2.getFilterValsV2().get(0).getId());
                                }
                            }
                            Unit unit2 = Unit.f75682a;
                        }
                    }
                }
                this.mFilterJson = null;
                m78715E0(channelId, map, true);
            }
        }
    }

    /* JADX INFO: renamed from: g1 */
    private final void m78743g1(boolean show) {
    }

    /* JADX INFO: renamed from: h1 */
    private final void m78745h1() {
        ShortTvPopupFilterView shortTvPopupFilterView = this.mFilterView;
        if (shortTvPopupFilterView != null) {
            ShortTvPopupFilterView.initSelectData$default(shortTvPopupFilterView, m78717G0(this.mChannelId), null, 2, null);
        }
    }

    private final void hideLoading() {
        m78724P0();
    }

    private final void initScrollListener() {
        RecyclerView recyclerView;
        SwipeRefreshLayout swipeRefreshLayout;
        SwipeRefreshLayout swipeRefreshLayout2;
        C27329a0 c27329a0 = (C27329a0) getMViewBinding();
        if (c27329a0 != null && (swipeRefreshLayout2 = c27329a0.f83073g) != null) {
            swipeRefreshLayout2.setEnabled(false);
        }
        C27329a0 c27329a1 = (C27329a0) getMViewBinding();
        if (c27329a1 != null && (swipeRefreshLayout = c27329a1.f83073g) != null) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: vr.i
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
                /* JADX INFO: renamed from: a */
                public final void mo21823a() {
                    ShortTvMovieFragment.m78733Y0(this.f86812a);
                }
            });
        }
        C27329a0 c27329a2 = (C27329a0) getMViewBinding();
        if (c27329a2 == null || (recyclerView = c27329a2.f83069c) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new C18720e());
    }

    private final void initView(View view, Bundle savedInstanceState) {
        C27329a0 c27329a0;
        View view2;
        View view3;
        C27329a0 c27329a1 = (C27329a0) getMViewBinding();
        if (c27329a1 != null && (view3 = c27329a1.f83072f) != null) {
            view3.getLayoutParams().height = AbstractC5781d.m27351c();
        }
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("hide_header_bg", false) && (c27329a0 = (C27329a0) getMViewBinding()) != null && (view2 = c27329a0.f83072f) != null) {
            AbstractC23048b.m91691b(view2);
        }
        this.mMovieModel = (ShortTvMovieViewModel) new C3227v0(this).m14969a(ShortTvMovieViewModel.class);
        C27329a0 c27329a2 = (C27329a0) getMViewBinding();
        this.mFilterView = c27329a2 != null ? c27329a2.f83070d : null;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.short_tv_header_movie, (ViewGroup) null);
        this.header = viewInflate;
        if (viewInflate != null) {
            m78727S0();
            m78729U0();
            initScrollListener();
            C18713c c18713c = this.mAdapter;
            if (c18713c != null) {
                BaseQuickAdapter.m36130y(c18713c, viewInflate, 0, 0, 6, null);
            }
            initViewModel();
            viewInflate.post(new Runnable() { // from class: vr.e
                @Override // java.lang.Runnable
                public final void run() {
                    ShortTvMovieFragment.m78734Z0(this.f86807a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j1 */
    private final void m78748j1() {
        View view = this.header;
        if (view != null) {
            ViewStub viewStub = (ViewStub) view.findViewById(R$id.loading_stub);
            if (viewStub != null) {
                viewStub.setLayoutResource(m78720J0());
            }
            if (this.mLoadingView == null) {
                this.mLoadingView = viewStub.inflate();
            }
            View view2 = this.mLoadingView;
            if (view2 != null) {
                AbstractC23048b.m91694e(view2);
            }
        }
    }

    /* JADX INFO: renamed from: k1 */
    private final void m78750k1() {
        showNoNetworkView(false);
    }

    /* JADX INFO: renamed from: l1 */
    private final void m78752l1(String string) {
        View view = this.header;
        if (view != null) {
            ViewStub viewStub = (ViewStub) view.findViewById(R$id.no_result_stub);
            if (this.mNoResultView == null) {
                this.mNoResultView = viewStub.inflate();
            }
            final View view2 = this.mNoResultView;
            if (view2 != null) {
                AbstractC23048b.m91694e(view2);
                TextView textView = (TextView) view2.findViewById(R$id.tv_no_result);
                if (textView != null) {
                    textView.setText(string);
                }
                View viewFindViewById = view2.findViewById(R$id.tv_reset);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: vr.g
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            ShortTvMovieFragment.m78754m1(this.f86809a, view2, view3);
                        }
                    });
                }
            }
        }
    }

    private final void loadData() {
        startLoading();
        ShortTvMovieViewModel shortTvMovieViewModel = this.mMovieModel;
        if (shortTvMovieViewModel != null) {
            shortTvMovieViewModel.m78843h("v3");
        }
    }

    private final void loadMore() {
        String str = this.mChannelId;
        m78715E0(str, (Map) this.mSubjectTypeMap.get(str), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final void m78754m1(ShortTvMovieFragment shortTvMovieFragment, View view, View view2) {
        shortTvMovieFragment.m78714D0(shortTvMovieFragment.mChannelId);
        shortTvMovieFragment.m78741f1(shortTvMovieFragment.mChannelId);
        AbstractC23048b.m91691b(view);
        shortTvMovieFragment.startLoading();
        shortTvMovieFragment.m78745h1();
    }

    /* JADX INFO: renamed from: n1 */
    private final void m78756n1(ShortTvMovieBean movieBean, boolean isRefresh) {
        C27941f c27941fM36186h0;
        C27329a0 c27329a0;
        LinearLayout linearLayoutM106420b;
        C27941f c27941fM36186h1;
        C18713c c18713c;
        C27941f c27941fM36186h2;
        SwipeRefreshLayout swipeRefreshLayout;
        C27329a0 c27329a1;
        SwipeRefreshLayout swipeRefreshLayout2;
        Integer perPage;
        if (movieBean != null) {
            Pager pager = movieBean.getPager();
            this.mPerPage = (pager == null || (perPage = pager.getPerPage()) == null) ? 10 : perPage.intValue();
            if (isRefresh) {
                C27329a0 c27329a2 = (C27329a0) getMViewBinding();
                if (c27329a2 != null && (swipeRefreshLayout = c27329a2.f83073g) != null && swipeRefreshLayout.isRefreshing() && (c27329a1 = (C27329a0) getMViewBinding()) != null && (swipeRefreshLayout2 = c27329a1.f83073g) != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
                C18713c c18713c2 = this.mAdapter;
                if (c18713c2 != null) {
                    c18713c2.mo36201n1(movieBean.getItems());
                }
                List<ShortTvMovieItem> items = movieBean.getItems();
                if (items == null || !items.isEmpty()) {
                    m78725Q0();
                } else {
                    m78752l1(getString(R$string.short_tv_no_filter_result));
                }
            } else {
                C18713c c18713c3 = this.mAdapter;
                List<Object> data = c18713c3 != null ? c18713c3.getData() : null;
                ArrayList arrayList = new ArrayList();
                List<ShortTvMovieItem> items2 = movieBean.getItems();
                if (items2 == null) {
                    items2 = CollectionsKt.m97506l();
                }
                if (data == null || !(!data.isEmpty())) {
                    arrayList.addAll(items2);
                } else {
                    for (ShortTvMovieItem shortTvMovieItem : items2) {
                        if (!data.contains(shortTvMovieItem)) {
                            arrayList.add(shortTvMovieItem);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    C18713c c18713c4 = this.mAdapter;
                    if (c18713c4 == null || (c27941fM36186h1 = c18713c4.m36186h0()) == null) {
                        return;
                    }
                    C27941f.m108652u(c27941fM36186h1, false, 1, null);
                    return;
                }
                C18713c c18713c5 = this.mAdapter;
                if (c18713c5 != null) {
                    c18713c5.mo36208q(arrayList);
                }
                C18713c c18713c6 = this.mAdapter;
                if (c18713c6 != null && (c27941fM36186h0 = c18713c6.m36186h0()) != null && c27941fM36186h0.m108666r() && (c27329a0 = (C27329a0) getMViewBinding()) != null && (linearLayoutM106420b = c27329a0.getRoot()) != null) {
                    linearLayoutM106420b.postDelayed(new Runnable() { // from class: vr.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            ShortTvMovieFragment.m78758o1(this.f86808a);
                        }
                    }, 300L);
                }
            }
            Pager pager2 = movieBean.getPager();
            if (!(pager2 != null ? Intrinsics.m97797c(pager2.getHasMore(), Boolean.FALSE) : false) || (c18713c = this.mAdapter) == null || (c27941fM36186h2 = c18713c.m36186h0()) == null) {
                return;
            }
            C27941f.m108652u(c27941fM36186h2, false, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final void m78758o1(ShortTvMovieFragment shortTvMovieFragment) {
        C27941f c27941fM36186h0;
        C18713c c18713c = shortTvMovieFragment.mAdapter;
        if (c18713c == null || (c27941fM36186h0 = c18713c.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108667s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public final void m78760p1(HashMap selectItems) {
        ShortTvPopupFilterView shortTvPopupFilterView = this.mFilterView;
        if (shortTvPopupFilterView != null) {
            shortTvPopupFilterView.initSelectData(m78717G0(this.mChannelId), selectItems);
        }
    }

    private final void startLoading() {
        m78748j1();
    }

    /* JADX INFO: renamed from: M0 */
    public final String m78771M0() {
        return "movie_filter_page";
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public C27329a0 getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C27329a0 c27329a0M106418c = C27329a0.m106418c(inflater);
        Intrinsics.m97801g(c27329a0M106418c, "inflate(...)");
        return c27329a0M106418c;
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    /* JADX INFO: renamed from: i1 */
    public final void m78773i1(TabLayout.Tab tab, boolean z11) {
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

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initListener() {
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initViewData() {
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initViewModel() {
        ShortTvMovieViewModel shortTvMovieViewModel = this.mMovieModel;
        if (shortTvMovieViewModel != null) {
            shortTvMovieViewModel.m78844i().m14851j(this, new C18721f(new Function1() { // from class: vr.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShortTvMovieFragment.m78735a1(this.f86803a, (BaseDto) obj);
                }
            }));
            shortTvMovieViewModel.m78847l().m14851j(this, new C18721f(new Function1() { // from class: vr.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShortTvMovieFragment.m78737c1(this.f86805a, (ShortTvRefreshBaseDto) obj);
                }
            }));
            ShortTvPopupFilterView shortTvPopupFilterView = this.mFilterView;
            if (shortTvPopupFilterView != null) {
                shortTvPopupFilterView.setOnFilterListener(new Function1() { // from class: vr.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTvMovieFragment.m78738d1(this.f86806a, (Map) obj);
                    }
                });
            }
        }
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public boolean isShowPageStateLayoutTitle() {
        return false;
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b(m78721K0(), false, 2, null);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.m97802h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        C18713c c18713c = this.mAdapter;
        if (c18713c != null) {
            c18713c.notifyDataSetChanged();
        }
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, p743rh.InterfaceC27288n
    public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
        C27941f c27941fM36186h0;
        List<Object> data;
        List<Object> data2;
        List<Object> data3;
        Intrinsics.m97802h(network, "network");
        Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
        super.onConnected(network, networkCapabilities);
        if (isResumed()) {
            C18713c c18713c = this.mAdapter;
            if (c18713c != null && (data3 = c18713c.getData()) != null && data3.isEmpty()) {
                View view = this.mNoNetworkView;
                if (view != null) {
                    AbstractC23048b.m91691b(view);
                }
                loadData();
                return;
            }
            C18713c c18713c2 = this.mAdapter;
            int size = (c18713c2 == null || (data2 = c18713c2.getData()) == null) ? 0 : data2.size();
            if (size <= 0) {
                m78715E0(this.mChannelId, this.mLatestSelectItems, true);
                return;
            }
            C18713c c18713c3 = this.mAdapter;
            ShortTvMovieItem shortTvMovieItem = (c18713c3 == null || (data = c18713c3.getData()) == null) ? null : (ShortTvMovieItem) data.get(size - 1);
            if (Intrinsics.m97797c(this.mChannelId, shortTvMovieItem != null ? shortTvMovieItem.getChannelId() : null)) {
                if (Intrinsics.m97797c(this.mLatestSelectItems, shortTvMovieItem != null ? shortTvMovieItem.getSelectItems() : null)) {
                    C18713c c18713c4 = this.mAdapter;
                    if (c18713c4 == null || (c27941fM36186h0 = c18713c4.m36186h0()) == null) {
                        return;
                    }
                    c27941fM36186h0.m108670w();
                    return;
                }
            }
            m78715E0(this.mChannelId, this.mLatestSelectItems, true);
        }
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.mFilterJson = arguments != null ? arguments.getString("filter_json") : null;
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C3187b0 c3187b0M78848m;
        C3187b0 c3187b0M78845j;
        this.mPage = 1;
        ShortTvMovieViewModel shortTvMovieViewModel = this.mMovieModel;
        if (shortTvMovieViewModel != null && (c3187b0M78845j = shortTvMovieViewModel.m78845j()) != null) {
            c3187b0M78845j.mo14858q(null);
        }
        ShortTvMovieViewModel shortTvMovieViewModel2 = this.mMovieModel;
        if (shortTvMovieViewModel2 != null && (c3187b0M78848m = shortTvMovieViewModel2.m78848m()) != null) {
            c3187b0M78848m.mo14858q(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        AbstractC18754g.m79006d(null, this, hidden, "", 1, null);
        if (isResumed()) {
            if (!hidden) {
                logResume();
                m78743g1(true);
            } else {
                m78743g1(false);
                logPause();
                this.startShowTime = SystemClock.elapsedRealtime();
            }
        }
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C22776b c22776b = this.mExposureHelper;
        if (c22776b != null) {
            c22776b.m90702e();
        }
        AbstractC18754g.m79010h(null, this, "", 1, null);
        m78743g1(false);
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        C18713c c18713c;
        List<Object> data;
        super.onResume();
        this.startShowTime = SystemClock.elapsedRealtime();
        View view = this.mNoNetworkView;
        if (view != null && AbstractC23048b.m91693d(view) && C27287m.f83003a.m106330e() && (c18713c = this.mAdapter) != null && (data = c18713c.getData()) != null && data.isEmpty()) {
            View view2 = this.mNoNetworkView;
            if (view2 != null) {
                AbstractC23048b.m91691b(view2);
            }
            loadData();
        }
        AbstractC18754g.m79014l(null, this, "visible=" + isVisible(), 1, null);
        m78743g1(true);
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView(view, savedInstanceState);
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void retryLoadData() {
    }
}
