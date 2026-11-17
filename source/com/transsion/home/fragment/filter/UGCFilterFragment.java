package com.transsion.home.fragment.filter;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.google.android.material.tabs.TabLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.net.bean.BaseDto;
import com.p282tn.lib.view.AbstractC13772o;
import com.p282tn.lib.view.NoNetworkBigView;
import com.p282tn.lib.widget.R$color;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.baseui.util.AbstractC14556b;
import com.transsion.home.R$drawable;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.R$string;
import com.transsion.home.adapter.filter.C14841a;
import com.transsion.home.bean.RefreshBaseDto;
import com.transsion.home.bean.UGCFilterVideoItem;
import com.transsion.home.bean.ugc.UGCFilterGrade;
import com.transsion.home.bean.ugc.UGCFilterItem;
import com.transsion.home.bean.ugc.UGCFilterResponse;
import com.transsion.home.fragment.tab.BaseHomeSubFragment;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.home.view.filter.expand.UGCFilterExpandView;
import com.transsion.home.view.layoutmanager.OffsetGridLayoutManager;
import com.transsion.home.viewmodel.UGCFilterViewModel;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.ugcvideodetail.api.UGCVideoType;
import com.transsion.ugcvideodetail.api.bean.UGCContent;
import com.transsion.ugcvideodetail.api.bean.UGCContentList;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mg.C25825b;
import ng.AbstractC26004a;
import ng.AbstractC26006c;
import org.json.JSONException;
import org.json.JSONObject;
import p550kj.C24655b;
import p550kj.C24662i;
import p552kl.C24676f0;
import p552kl.C24692n0;
import p552kl.C24693o;
import p579ll.C25646b;
import p579ll.InterfaceC25645a;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p822uv.AbstractC28040c;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0010\b\u0007\u0018\u0000 ±\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004²\u0001³\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001b\u0010\u000f\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0004J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010\u0004J!\u0010&\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\rH\u0002¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120(H\u0002¢\u0006\u0004\b)\u0010*J+\u0010-\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120+j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012`,H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0007H\u0002¢\u0006\u0004\b/\u0010\u0004J\u0017\u00101\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0018H\u0002¢\u0006\u0004\b1\u0010\u001bJ\u0017\u00102\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\rH\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0007H\u0002¢\u0006\u0004\b4\u0010\u0004J\u0019\u00106\u001a\u0004\u0018\u00010\u00122\u0006\u00105\u001a\u00020\u0012H\u0002¢\u0006\u0004\b6\u00107J\u0019\u00109\u001a\u0004\u0018\u00010\u00122\u0006\u00108\u001a\u00020\u0012H\u0002¢\u0006\u0004\b9\u00107J\u000f\u0010:\u001a\u00020\u0007H\u0002¢\u0006\u0004\b:\u0010\u0004J\u000f\u0010;\u001a\u00020\u0007H\u0002¢\u0006\u0004\b;\u0010\u0004J\u0019\u0010=\u001a\u00020\u00072\b\u0010<\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0007H\u0002¢\u0006\u0004\b?\u0010\u0004J\u000f\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020@H\u0002¢\u0006\u0004\bC\u0010BJ\u000f\u0010D\u001a\u00020\u0007H\u0002¢\u0006\u0004\bD\u0010\u0004J+\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120(2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010E\u001a\u00020\u0012H\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u00022\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u0019\u0010N\u001a\u00020\u00072\b\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bN\u0010OJ!\u0010Q\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\u00052\b\u0010M\u001a\u0004\u0018\u00010LH\u0017¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0007H\u0016¢\u0006\u0004\bS\u0010\u0004J\u000f\u0010T\u001a\u00020\u0007H\u0016¢\u0006\u0004\bT\u0010\u0004J\u000f\u0010U\u001a\u00020\u0007H\u0016¢\u0006\u0004\bU\u0010\u0004J\u000f\u0010V\u001a\u00020\u0007H\u0016¢\u0006\u0004\bV\u0010\u0004J\u0017\u0010X\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\rH\u0016¢\u0006\u0004\bX\u00103J\u000f\u0010Y\u001a\u00020\u0007H\u0016¢\u0006\u0004\bY\u0010\u0004J\u000f\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u0007H\u0016¢\u0006\u0004\b]\u0010\u0004J\u000f\u0010^\u001a\u00020\u0012H\u0016¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u0007H\u0016¢\u0006\u0004\b`\u0010\u0004J\u0011\u0010b\u001a\u0004\u0018\u00010aH\u0016¢\u0006\u0004\bb\u0010cJ\u001f\u0010g\u001a\u00020\u00072\u0006\u0010d\u001a\u00020@2\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bg\u0010hR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010p\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010v\u001a\u00020s8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010z\u001a\u00020w8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010}\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010\u0081\u0001\u001a\u00020~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0019\u0010\u0084\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0083\u0001R\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0083\u0001R\u001c\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R+\u0010\u0091\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00180\u008e\u00010\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001b\u0010\u0094\u0001\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001b\u0010\u0096\u0001\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0093\u0001R\u001b\u0010\u0098\u0001\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0093\u0001R\u001b\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0083\u0001R\u0018\u0010\u009c\u0001\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010|R\u001c\u0010 \u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R9\u0010£\u0001\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010+j\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u0001`,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001a\u0010§\u0001\u001a\u00030¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010ª\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u001a\u0010¬\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b«\u0001\u0010rR\u001a\u0010®\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u00ad\u0001\u0010rR\u001a\u0010°\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¯\u0001\u0010r¨\u0006´\u0001"}, m97100d2 = {"Lcom/transsion/home/fragment/filter/UGCFilterFragment;", "Lcom/transsion/home/fragment/tab/BaseHomeSubFragment;", "Lkl/o;", "<init>", "()V", "Landroid/view/View;", "header", "", "t1", "(Landroid/view/View;)V", "headerView", "s1", "Lcom/google/android/material/tabs/TabLayout$Tab;", "", "selected", "X0", "(Lcom/google/android/material/tabs/TabLayout$Tab;Z)V", "tab", "", CampaignEx.JSON_KEY_TITLE, "D1", "(Lcom/google/android/material/tabs/TabLayout$Tab;Ljava/lang/String;Z)V", "n1", "l1", "Lcom/transsion/home/bean/ugc/UGCFilterItem;", WebConstants.FIELD_ITEM, "C1", "(Lcom/transsion/home/bean/ugc/UGCFilterItem;)V", "o1", "i1", "Z0", "initViewModel", "loadData", "E1", "loadMore", "Lcom/transsion/ugcvideodetail/api/bean/UGCContentList;", "contentList", "isRefresh", "K1", "(Lcom/transsion/ugcvideodetail/api/bean/UGCContentList;Z)V", "", "Y0", "()Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "j1", "()Ljava/util/HashMap;", "J1", "ugcFilterItem", "B1", "A1", "(Z)V", "M1", "categoryId", "a1", "(Ljava/lang/String;)Ljava/lang/String;", "gradeCode", "b1", "showLoadingView", "g1", "string", "H1", "(Ljava/lang/String;)V", "h1", "", "e1", "()I", "d1", "k1", "key", "c1", "(Lcom/transsion/home/bean/ugc/UGCFilterItem;Ljava/lang/String;)Ljava/util/Map;", "Landroid/view/LayoutInflater;", "inflater", "f1", "(Landroid/view/LayoutInflater;)Lkl/o;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "startLoading", "hideLoading", "onResume", "hidden", "onHiddenChanged", "onPause", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "onDestroyView", "g0", "()Ljava/lang/String;", "c0", "Landroidx/recyclerview/widget/RecyclerView;", "f0", "()Landroidx/recyclerview/widget/RecyclerView;", "lastAdPosition", "Lcom/transsion/ad/bidding/nativead/BiddingNativeManager;", "wrapperNativeManager", "l0", "(ILcom/transsion/ad/bidding/nativead/BiddingNativeManager;)V", "Lcom/transsion/home/adapter/filter/a;", "g", "Lcom/transsion/home/adapter/filter/a;", "mAdapter", "Lcom/transsion/home/viewmodel/UGCFilterViewModel;", "h", "Lcom/transsion/home/viewmodel/UGCFilterViewModel;", "mMovieModel", "i", "Landroid/view/View;", "Lkl/n0;", "j", "Lkl/n0;", "headerBinding", "Lcom/transsion/home/view/filter/expand/UGCFilterExpandView;", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/home/view/filter/expand/UGCFilterExpandView;", "filterView", "l", "I", "mPage", "Lcom/transsion/home/fragment/filter/UGCFilterFragment$TabType;", "m", "Lcom/transsion/home/fragment/filter/UGCFilterFragment$TabType;", "mCurrentTab", "n", "Ljava/lang/String;", "mCategory", "o", "mFilterJson", TtmlNode.TAG_P, "fromOptId", "Lcom/transsion/home/bean/ugc/UGCFilterResponse;", CampaignEx.JSON_KEY_AD_Q, "Lcom/transsion/home/bean/ugc/UGCFilterResponse;", "mFilterResponse", "", "", CampaignEx.JSON_KEY_AD_R, "Ljava/util/Map;", "categoryChildrenByParentIdMap", "s", "Ljava/lang/Integer;", "mSelectedLevel2", "t", "mSelectedLevel3", TmcStartParams.KEY_URL_SHORT, "mSelectedLevel4", "v", "mSelectedGrade", "w", "mPerPage", "Lll/b;", "x", "Lll/b;", "mExposureHelper", "y", "Ljava/util/HashMap;", "mLatestSelectItems", "", "z", "J", "firstLoadStartTimeMillis", "A", "Z", "hasRecordedFirstLoadDuration", "B", "mNoNetworkView", "C", "mLoadingView", "D", "mNoResultView", "E", "a", "TabType", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCFilterFragment extends BaseHomeSubFragment<C24693o> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: F */
    public static final int f52797F = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean hasRecordedFirstLoadDuration;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private View mNoNetworkView;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private View mLoadingView;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private View mNoResultView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C14841a mAdapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private UGCFilterViewModel mMovieModel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private View header;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private C24692n0 headerBinding;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private UGCFilterExpandView filterView;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private volatile String mFilterJson;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private String fromOptId;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private UGCFilterResponse mFilterResponse;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private Integer mSelectedLevel2;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private Integer mSelectedLevel3;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private Integer mSelectedLevel4;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private String mSelectedGrade;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private C25646b mExposureHelper;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private HashMap mLatestSelectItems;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private long firstLoadStartTimeMillis;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int mPage = 1;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private TabType mCurrentTab = TabType.FOR_U;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private String mCategory = "Education";

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Map categoryChildrenByParentIdMap = new LinkedHashMap();

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private int mPerPage = 12;

    @Metadata(m97099d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m97100d2 = {"Lcom/transsion/home/fragment/filter/UGCFilterFragment$TabType;", "", "apiValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getApiValue", "()Ljava/lang/String;", "FOR_U", "LATEST", "HOTTEST", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    private enum TabType {
        FOR_U("ForYou"),
        LATEST("Latest"),
        HOTTEST("New");

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m97650a(values());
        private final String apiValue;

        TabType(String str) {
            this.apiValue = str;
        }

        public static EnumEntries<TabType> getEntries() {
            return $ENTRIES;
        }

        public final String getApiValue() {
            return this.apiValue;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.filter.UGCFilterFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final UGCFilterFragment m67804a(int i11, String str, String category, String str2, String fromOptId) {
            Intrinsics.m97802h(category, "category");
            Intrinsics.m97802h(fromOptId, "fromOptId");
            Bundle bundle = new Bundle();
            bundle.putInt("tab_id", i11);
            bundle.putString(WebConstants.TAB_CODE, str);
            bundle.putString("category", category);
            bundle.putString("filter_json", str2);
            bundle.putString("fromOptId", fromOptId);
            UGCFilterFragment uGCFilterFragment = new UGCFilterFragment();
            uGCFilterFragment.setArguments(bundle);
            return uGCFilterFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.filter.UGCFilterFragment$b */
    public /* synthetic */ class C15164b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52822a;

        static {
            int[] iArr = new int[TabType.values().length];
            try {
                iArr[TabType.FOR_U.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TabType.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TabType.HOTTEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f52822a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.filter.UGCFilterFragment$c */
    public static final class C15165c implements InterfaceC25645a {
        C15165c() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0011  */
        @Override // p579ll.InterfaceC25645a
        /* JADX INFO: renamed from: a */
        public void mo67486a(int i11, long j11, View view) throws JSONException {
            int i12;
            String name;
            String name2;
            String name3;
            String collectionId;
            String videoId;
            String subjectId;
            UGCContent content;
            UGCVideo video;
            String ops;
            UGCContent content2;
            UGCVideo video2;
            UGCContent content3;
            UGCVideo video3;
            UGCContent content4;
            UGCVideo video4;
            UGCVideoBelongToCollection belongToCollection;
            List<UGCFilterItem> items;
            List<Object> data;
            C14841a c14841a = UGCFilterFragment.this.mAdapter;
            int size = 0;
            if (c14841a != null) {
                i12 = !c14841a.m36215s0() ? 0 : 1;
            }
            int i13 = i11 - i12;
            C14841a c14841a2 = UGCFilterFragment.this.mAdapter;
            if (c14841a2 != null && (data = c14841a2.getData()) != null) {
                size = data.size();
            }
            if (i13 < 0 || i13 >= size) {
                return;
            }
            C14841a c14841a3 = UGCFilterFragment.this.mAdapter;
            UGCFilterVideoItem uGCFilterVideoItem = c14841a3 != null ? (UGCFilterVideoItem) c14841a3.getItem(i13) : null;
            HashMap map = new HashMap();
            map.put("browse_duration", String.valueOf(j11));
            map.put("module_name", WebConstants.FIELD_ITEM);
            UGCFilterResponse uGCFilterResponse = UGCFilterFragment.this.mFilterResponse;
            String str = "";
            if (uGCFilterResponse == null || (items = uGCFilterResponse.getItems()) == null) {
                name = "";
                name2 = name;
                name3 = name2;
            } else {
                UGCFilterFragment uGCFilterFragment = UGCFilterFragment.this;
                name = "";
                name2 = name;
                name3 = name2;
                for (UGCFilterItem uGCFilterItem : items) {
                    String categoryId = uGCFilterItem.getCategoryId();
                    Integer num = uGCFilterFragment.mSelectedLevel2;
                    if (Intrinsics.m97797c(categoryId, num != null ? num.toString() : null) && (name = uGCFilterItem.getName()) == null) {
                        name = "";
                    }
                    String categoryId2 = uGCFilterItem.getCategoryId();
                    Integer num2 = uGCFilterFragment.mSelectedLevel2;
                    if (Intrinsics.m97797c(categoryId2, num2 != null ? num2.toString() : null)) {
                        name = uGCFilterItem.getName();
                        if (name == null) {
                            name = "";
                        }
                    } else {
                        Integer num3 = uGCFilterFragment.mSelectedLevel3;
                        if (Intrinsics.m97797c(categoryId2, num3 != null ? num3.toString() : null)) {
                            name2 = uGCFilterItem.getName();
                            if (name2 == null) {
                                name2 = "";
                            }
                        } else {
                            Integer num4 = uGCFilterFragment.mSelectedLevel4;
                            if (Intrinsics.m97797c(categoryId2, num4 != null ? num4.toString() : null) && (name3 = uGCFilterItem.getName()) == null) {
                                name3 = "";
                            }
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            UGCFilterFragment uGCFilterFragment2 = UGCFilterFragment.this;
            jSONObject.put("categoryLve2", name);
            jSONObject.put("categoryLve3", name2);
            jSONObject.put("categoryLve4", name3);
            String str2 = uGCFilterFragment2.mSelectedGrade;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("grade", str2);
            jSONObject.put("sort", uGCFilterFragment2.mCurrentTab.getApiValue());
            map.put("rank_category", jSONObject.toString());
            String str3 = UGCFilterFragment.this.fromOptId;
            if (str3 == null) {
                str3 = "";
            }
            map.put("from_opt_id", str3);
            map.put(CampaignEx.JSON_KEY_TITLE, UGCFilterFragment.this.getString(R$string.filter));
            if (uGCFilterVideoItem == null || (content4 = uGCFilterVideoItem.getContent()) == null || (video4 = content4.getVideo()) == null || (belongToCollection = video4.getBelongToCollection()) == null || (collectionId = belongToCollection.getCollectionId()) == null) {
                collectionId = "";
            }
            map.put("belong_to_collection_id", collectionId);
            if ((uGCFilterVideoItem == null || (content3 = uGCFilterVideoItem.getContent()) == null || (video3 = content3.getVideo()) == null || (videoId = video3.getUgcVideoId()) == null) && (uGCFilterVideoItem == null || (videoId = uGCFilterVideoItem.getVideoId()) == null)) {
                videoId = "";
            }
            map.put("content_id", videoId);
            if (uGCFilterVideoItem == null || (content2 = uGCFilterVideoItem.getContent()) == null || (video2 = content2.getVideo()) == null || (subjectId = video2.getSubjectId()) == null) {
                subjectId = "";
            }
            map.put("refer_subject_id", subjectId);
            map.put("content_type", "ugc_video");
            map.put(RequestParameters.POSITION, String.valueOf(i13));
            if ((uGCFilterVideoItem != null && (ops = uGCFilterVideoItem.getOps()) != null) || (uGCFilterVideoItem != null && (content = uGCFilterVideoItem.getContent()) != null && (video = content.getVideo()) != null && (ops = video.getOps()) != null)) {
                str = ops;
            }
            map.put("ops", str);
            C14450a.f50860a.m65142e("/home/ugc_filter", map);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.filter.UGCFilterFragment$d */
    public static final class C15166d extends DiffUtil.AbstractC4174e {
        C15166d() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(UGCFilterVideoItem oldItem, UGCFilterVideoItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getVideoId(), newItem.getVideoId()) && Intrinsics.m97797c(oldItem.getTitle(), newItem.getTitle());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(UGCFilterVideoItem oldItem, UGCFilterVideoItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getVideoId(), newItem.getVideoId());
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.filter.UGCFilterFragment$e */
    public static final class C15167e implements TabLayout.OnTabSelectedListener {
        C15167e() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            TabType tabType;
            UGCFilterFragment uGCFilterFragment = UGCFilterFragment.this;
            int position = tab != null ? tab.getPosition() : 0;
            if (position != 0) {
                tabType = position != 1 ? TabType.HOTTEST : TabType.LATEST;
            } else {
                tabType = TabType.FOR_U;
            }
            uGCFilterFragment.mCurrentTab = tabType;
            if (tab != null) {
                UGCFilterFragment.this.m67766X0(tab, true);
            }
            C25646b c25646b = UGCFilterFragment.this.mExposureHelper;
            if (c25646b != null) {
                c25646b.m100943e();
            }
            UGCFilterFragment.this.mPage = 1;
            UGCFilterFragment.this.m67731A1(true);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            if (tab != null) {
                UGCFilterFragment.this.m67766X0(tab, false);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.filter.UGCFilterFragment$f */
    public static final class C15168f extends RecyclerView.AbstractC4219r {

        /* JADX INFO: renamed from: a */
        private int f52825a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ View f52827c;

        C15168f(View view) {
            this.f52827c = view;
        }

        /* JADX INFO: renamed from: d */
        private final void m67807d(RecyclerView recyclerView) {
            RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
            Intrinsics.m97800f(layoutManager, "null cannot be cast to non-null type com.transsion.home.view.layoutmanager.OffsetGridLayoutManager");
            this.f52825a = ((OffsetGridLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            C14841a c14841a;
            C27941f c27941fM36186h0;
            C27941f c27941fM36186h1;
            Intrinsics.m97802h(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i11);
            RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
            int childCount = layoutManager != null ? layoutManager.getChildCount() : 0;
            int itemCount = layoutManager != null ? layoutManager.getItemCount() : 0;
            if (i11 != 0 || childCount <= 0 || this.f52825a < itemCount - 1) {
                return;
            }
            C14841a c14841a2 = UGCFilterFragment.this.mAdapter;
            if (((c14841a2 == null || (c27941fM36186h1 = c14841a2.m36186h0()) == null) ? null : c27941fM36186h1.m108661i()) != LoadMoreStatus.Fail || (c14841a = UGCFilterFragment.this.mAdapter) == null || (c27941fM36186h0 = c14841a.m36186h0()) == null) {
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
            if (recyclerView.computeVerticalScrollOffset() > this.f52827c.getMeasuredHeight()) {
                C24693o c24693o = (C24693o) UGCFilterFragment.this.getMViewBinding();
                if (c24693o != null && (c24676f2 = c24693o.f75530b) != null && (constraintLayout2 = c24676f2.f75425c) != null) {
                    AbstractC26006c.m102058k(constraintLayout2);
                }
                C24693o c24693o2 = (C24693o) UGCFilterFragment.this.getMViewBinding();
                if (c24693o2 != null && (c24676f1 = c24693o2.f75530b) != null) {
                    UGCFilterFragment uGCFilterFragment = UGCFilterFragment.this;
                    ConstraintLayout llTabFilter = c24676f1.f75425c;
                    Intrinsics.m97801g(llTabFilter, "llTabFilter");
                    AbstractC26006c.m102058k(llTabFilter);
                    uGCFilterFragment.m67755M1();
                }
            } else {
                C24693o c24693o3 = (C24693o) UGCFilterFragment.this.getMViewBinding();
                if (c24693o3 != null && (c24676f0 = c24693o3.f75530b) != null && (constraintLayout = c24676f0.f75425c) != null) {
                    AbstractC26006c.m102054g(constraintLayout);
                }
            }
            m67807d(recyclerView);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.filter.UGCFilterFragment$g */
    public static final class C15169g implements InterfaceC27288n {
        C15169g() {
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected() {
            InterfaceC27288n.a.m106338a(this);
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
            boolean zM97797c;
            C27941f c27941fM36186h0;
            Intrinsics.m97802h(network, "network");
            Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
            if (UGCFilterFragment.this.isResumed()) {
                View view = UGCFilterFragment.this.mNoNetworkView;
                if (view != null) {
                    AbstractC26006c.m102054g(view);
                }
                C14841a c14841a = UGCFilterFragment.this.mAdapter;
                List<Object> data = c14841a != null ? c14841a.getData() : null;
                List<Object> list = data;
                if (list == null || list.isEmpty()) {
                    UGCFilterFragment.this.loadData();
                    return;
                }
                UGCFilterVideoItem uGCFilterVideoItem = (UGCFilterVideoItem) CollectionsKt.m97372v0(data);
                boolean zM97797c2 = Intrinsics.m97797c(uGCFilterVideoItem != null ? uGCFilterVideoItem.getChannelId() : null, UGCFilterFragment.this.mCategory);
                HashMap map = UGCFilterFragment.this.mLatestSelectItems;
                if (map != null) {
                    zM97797c = Intrinsics.m97797c(uGCFilterVideoItem != null ? uGCFilterVideoItem.getSelectItems() : null, map);
                } else {
                    zM97797c = false;
                }
                if (!zM97797c2 || !zM97797c) {
                    UGCFilterFragment.this.m67731A1(true);
                    return;
                }
                C14841a c14841a2 = UGCFilterFragment.this.mAdapter;
                if (c14841a2 == null || (c27941fM36186h0 = c14841a2.m36186h0()) == null) {
                    return;
                }
                c27941fM36186h0.m108670w();
            }
        }

        @Override // p743rh.InterfaceC27288n
        public void onDisconnected() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public final void m67731A1(boolean isRefresh) {
        C26866a.f81698a.m104912c("UGCFilterFragment", "loadDataWithCurrentFilter: page=" + this.mPage + ", level2=" + this.mSelectedLevel2 + ", level3=" + this.mSelectedLevel3 + ", level4=" + this.mSelectedLevel4 + ", sort=" + this.mCurrentTab.getApiValue() + ", isRefresh=" + isRefresh, false);
        this.mLatestSelectItems = new HashMap(m67767Y0());
        if (isRefresh && !this.hasRecordedFirstLoadDuration && this.firstLoadStartTimeMillis == 0) {
            this.firstLoadStartTimeMillis = System.currentTimeMillis();
        }
        UGCFilterViewModel uGCFilterViewModel = this.mMovieModel;
        if (uGCFilterViewModel != null) {
            uGCFilterViewModel.m69092m(this.mCategory, this.mPage, this.mPerPage, this.mCurrentTab.getApiValue(), this.mSelectedLevel2, this.mSelectedLevel3, this.mSelectedLevel4, this.mSelectedGrade, isRefresh);
        }
        if (isRefresh) {
            this.mPage = 2;
        } else {
            this.mPage++;
        }
    }

    /* JADX INFO: renamed from: B1 */
    private final void m67733B1(UGCFilterItem ugcFilterItem) {
        C26866a.f81698a.m104912c("UGCFilterFragment", "onUGCFilterItemSelected: id=" + ugcFilterItem.getCategoryId() + ", name=" + ugcFilterItem.getName() + ", parentId=" + ugcFilterItem.getParentId(), false);
        m67735C1(ugcFilterItem);
    }

    /* JADX INFO: renamed from: C1 */
    private final void m67735C1(UGCFilterItem item) {
        C14450a.f50860a.m65146i("/home/ugc_filter", m67771c1(item, "click_filter"));
    }

    /* JADX INFO: renamed from: D1 */
    private final void m67737D1(TabLayout.Tab tab, String title, boolean selected) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(requireContext());
        int i11 = R$layout.item_home_filter_tab;
        C24692n0 c24692n0 = this.headerBinding;
        if (c24692n0 == null) {
            Intrinsics.m97819y("headerBinding");
            c24692n0 = null;
        }
        View viewInflate = layoutInflaterFrom.inflate(i11, (ViewGroup) c24692n0.f75524c, false);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_tab_title);
        textView.setText(title);
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        Typeface typefaceM102046c = selected ? AbstractC26004a.m102046c(contextRequireContext) : AbstractC26004a.m102047d(contextRequireContext);
        if (typefaceM102046c != null) {
            textView.setTypeface(typefaceM102046c);
        }
        textView.setTextColor(AbstractC2397b.getColor(requireContext(), selected ? R$color.text_01 : R$color.text_02));
        if (selected) {
            viewInflate.setBackgroundResource(R$drawable.bg_item_filter_tab);
        } else {
            viewInflate.setBackgroundColor(0);
        }
        viewInflate.setSelected(selected);
        tab.setCustomView(viewInflate);
    }

    /* JADX INFO: renamed from: E1 */
    private final void m67739E1() {
        if (this.mNoNetworkView == null) {
            C24692n0 c24692n0 = this.headerBinding;
            if (c24692n0 == null) {
                Intrinsics.m97819y("headerBinding");
                c24692n0 = null;
            }
            this.mNoNetworkView = c24692n0.f75526e.inflate();
        }
        View view = this.mNoNetworkView;
        if (view != null) {
            AbstractC26006c.m102058k(view);
            final NoNetworkBigView noNetworkBigView = (NoNetworkBigView) view.findViewById(R$id.state_view);
            if (noNetworkBigView != null) {
                NoNetworkBigView.showTitle$default(noNetworkBigView, false, null, 2, null);
                noNetworkBigView.retry(new Function0() { // from class: com.transsion.home.fragment.filter.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UGCFilterFragment.m67741F1(noNetworkBigView, this);
                    }
                });
                noNetworkBigView.goToSetting(new Function0() { // from class: com.transsion.home.fragment.filter.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UGCFilterFragment.m67743G1();
                    }
                });
            }
            AbstractC13772o.m62233a("/home/ugc_filter");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public static final Unit m67741F1(NoNetworkBigView noNetworkBigView, UGCFilterFragment uGCFilterFragment) {
        AbstractC26006c.m102054g(noNetworkBigView);
        uGCFilterFragment.loadData();
        AbstractC13772o.m62234b("/home/ugc_filter");
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public static final Unit m67743G1() {
        AbstractC13772o.m62235c("/home/ugc_filter");
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: H1 */
    private final void m67745H1(String string) {
        if (this.mNoResultView == null) {
            C24692n0 c24692n0 = this.headerBinding;
            if (c24692n0 == null) {
                Intrinsics.m97819y("headerBinding");
                c24692n0 = null;
            }
            this.mNoResultView = c24692n0.f75527f.inflate();
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
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.fragment.filter.s
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        UGCFilterFragment.m67747I1(this.f52853a, view, view2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public static final void m67747I1(UGCFilterFragment uGCFilterFragment, View view, View view2) {
        uGCFilterFragment.mSelectedLevel2 = null;
        uGCFilterFragment.mSelectedLevel3 = null;
        uGCFilterFragment.mSelectedLevel4 = null;
        uGCFilterFragment.mFilterJson = "";
        AbstractC26006c.m102054g(view);
        uGCFilterFragment.loadData();
    }

    /* JADX INFO: renamed from: J1 */
    private final void m67749J1() {
        List<UGCFilterItem> listL;
        List<UGCFilterGrade> listL2;
        UGCFilterResponse uGCFilterResponse = this.mFilterResponse;
        if (uGCFilterResponse == null || (listL = uGCFilterResponse.getItems()) == null) {
            listL = CollectionsKt.m97506l();
        }
        UGCFilterExpandView uGCFilterExpandView = null;
        if (listL.isEmpty()) {
            UGCFilterExpandView uGCFilterExpandView2 = this.filterView;
            if (uGCFilterExpandView2 == null) {
                Intrinsics.m97819y("filterView");
            } else {
                uGCFilterExpandView = uGCFilterExpandView2;
            }
            AbstractC26006c.m102054g(uGCFilterExpandView);
            C26866a.f81698a.m104921x("UGCFilterFragment", "updateFilterViewData: no filter items", false);
            return;
        }
        Map mapC = MapsKt.m97548c();
        Integer num = this.mSelectedLevel2;
        if (num != null) {
        }
        Integer num2 = this.mSelectedLevel3;
        if (num2 != null) {
        }
        Integer num3 = this.mSelectedLevel4;
        if (num3 != null) {
        }
        String str = this.mSelectedGrade;
        if (str != null) {
            mapC.put("grade", str);
        }
        Map<String, String> mapB = MapsKt.m97547b(mapC);
        C26866a.f81698a.m104912c("UGCFilterFragment", "updateFilterViewData: items size=" + listL.size() + ", selected=" + mapB, false);
        UGCFilterExpandView uGCFilterExpandView3 = this.filterView;
        if (uGCFilterExpandView3 == null) {
            Intrinsics.m97819y("filterView");
            uGCFilterExpandView3 = null;
        }
        AbstractC26006c.m102058k(uGCFilterExpandView3);
        UGCFilterExpandView uGCFilterExpandView4 = this.filterView;
        if (uGCFilterExpandView4 == null) {
            Intrinsics.m97819y("filterView");
        } else {
            uGCFilterExpandView = uGCFilterExpandView4;
        }
        UGCFilterResponse uGCFilterResponse2 = this.mFilterResponse;
        if (uGCFilterResponse2 == null || (listL2 = uGCFilterResponse2.getGrades()) == null) {
            listL2 = CollectionsKt.m97506l();
        }
        uGCFilterExpandView.updateList(listL, "4", mapB, listL2);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K1 */
    private final void m67751K1(UGCContentList contentList, boolean isRefresh) {
        List<UGCFilterVideoItem> listL;
        C24693o c24693o;
        LinearLayout root;
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        List<Object> data;
        C14841a c14841a;
        C27941f c27941fM36186h2;
        boolean z11;
        UGCFilterVideoItem uGCFilterVideoItem;
        UGCContent content;
        UGCVideo video;
        SwipeRefreshLayout swipeRefreshLayout;
        C24693o c24693o2;
        SwipeRefreshLayout swipeRefreshLayout2;
        Integer perPage;
        List<UGCContent> items;
        C26866a.f81698a.m104912c("UGCFilterFragment", "updateMovieList: isRefresh=" + isRefresh + ", size=" + ((contentList == null || (items = contentList.getItems()) == null) ? 0 : items.size()), false);
        if (contentList != null) {
            Pager pager = contentList.getPager();
            this.mPerPage = (pager == null || (perPage = pager.getPerPage()) == null) ? 12 : perPage.intValue();
            List<UGCContent> items2 = contentList.getItems();
            if (items2 != null) {
                List<UGCContent> list = items2;
                ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(UGCFilterVideoItem.INSTANCE.m67419b((UGCContent) it.next(), this.mCategory, m67767Y0()));
                }
                listL = CollectionsKt.m97343U0(arrayList);
            } else {
                listL = null;
            }
            if (isRefresh) {
                C24693o c24693o3 = (C24693o) getMViewBinding();
                if (c24693o3 != null && (swipeRefreshLayout = c24693o3.f75532d) != null && swipeRefreshLayout.isRefreshing() && (c24693o2 = (C24693o) getMViewBinding()) != null && (swipeRefreshLayout2 = c24693o2.f75532d) != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
                if (Intrinsics.m97797c((listL == null || (uGCFilterVideoItem = (UGCFilterVideoItem) CollectionsKt.m97361k0(listL)) == null || (content = uGCFilterVideoItem.getContent()) == null || (video = content.getVideo()) == null) ? null : video.getCategory(), UGCVideoType.EDUCATION.getValue())) {
                    z11 = true;
                } else {
                    C14841a c14841a2 = this.mAdapter;
                    if (c14841a2 != null ? c14841a2.getIsEducationList() : false) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                C14841a c14841a3 = this.mAdapter;
                if (c14841a3 != null) {
                    c14841a3.m66732U1(z11);
                }
                C14841a c14841a4 = this.mAdapter;
                if (c14841a4 != null) {
                    c14841a4.mo36201n1(listL);
                }
                if (listL != null && listL.isEmpty()) {
                    m67745H1(getString(R$string.no_filter_result));
                } else {
                    m67775h1();
                }
            } else {
                C14841a c14841a5 = this.mAdapter;
                List<Object> data2 = c14841a5 != null ? c14841a5.getData() : null;
                ArrayList arrayList2 = new ArrayList();
                if (listL == null) {
                    listL = CollectionsKt.m97506l();
                }
                if (data2 != null && (data2.isEmpty() ^ true)) {
                    for (UGCFilterVideoItem uGCFilterVideoItem2 : listL) {
                        if (!data2.contains(uGCFilterVideoItem2)) {
                            arrayList2.add(uGCFilterVideoItem2);
                        }
                    }
                } else {
                    arrayList2.addAll(listL);
                }
                if (arrayList2.isEmpty()) {
                    C14841a c14841a6 = this.mAdapter;
                    if (c14841a6 != null && (c27941fM36186h1 = c14841a6.m36186h0()) != null) {
                        C27941f.m108652u(c27941fM36186h1, false, 1, null);
                    }
                    C26866a.f81698a.m104912c("UGCFilterFragment", "updateMovieList: all items are duplicated", false);
                    return;
                }
                C14841a c14841a7 = this.mAdapter;
                if (c14841a7 != null) {
                    c14841a7.mo36208q(arrayList2);
                }
                C14841a c14841a8 = this.mAdapter;
                if (((c14841a8 == null || (c27941fM36186h0 = c14841a8.m36186h0()) == null || !c27941fM36186h0.m108666r()) ? false : true) && (c24693o = (C24693o) getMViewBinding()) != null && (root = c24693o.getRoot()) != null) {
                    root.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.filter.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            UGCFilterFragment.m67753L1(this.f52852a);
                        }
                    }, 300L);
                }
            }
            Pager pager2 = contentList.getPager();
            if ((pager2 != null ? Intrinsics.m97797c(pager2.getHasMore(), Boolean.FALSE) : false) && (c14841a = this.mAdapter) != null && (c27941fM36186h2 = c14841a.m36186h0()) != null) {
                C27941f.m108652u(c27941fM36186h2, false, 1, null);
            }
            C26866a.a aVar = C26866a.f81698a;
            C14841a c14841a9 = this.mAdapter;
            aVar.m104912c("UGCFilterFragment", "updateMovieList: final adapter size=" + ((c14841a9 == null || (data = c14841a9.getData()) == null) ? 0 : data.size()), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public static final void m67753L1(UGCFilterFragment uGCFilterFragment) {
        C27941f c27941fM36186h0;
        C14841a c14841a = uGCFilterFragment.mAdapter;
        if (c14841a == null || (c27941fM36186h0 = c14841a.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108667s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M1 */
    public final void m67755M1() {
        C24676f0 c24676f0;
        AppCompatTextView appCompatTextView;
        String strM67770b1;
        String strM67769a1;
        String strM67769a2;
        String strM67769a3;
        StringBuilder sb2 = new StringBuilder();
        Integer num = this.mSelectedLevel2;
        if (num != null && (strM67769a3 = m67769a1(String.valueOf(num.intValue()))) != null && !Intrinsics.m97797c(strM67769a3, getString(com.p282tn.lib.widget.R$string.all))) {
            sb2.append(strM67769a3);
            sb2.append(" • ");
        }
        Integer num2 = this.mSelectedLevel3;
        if (num2 != null && (strM67769a2 = m67769a1(String.valueOf(num2.intValue()))) != null && !Intrinsics.m97797c(strM67769a2, getString(com.p282tn.lib.widget.R$string.all))) {
            sb2.append(strM67769a2);
            sb2.append(" • ");
        }
        Integer num3 = this.mSelectedLevel4;
        if (num3 != null && (strM67769a1 = m67769a1(String.valueOf(num3.intValue()))) != null && !Intrinsics.m97797c(strM67769a1, getString(com.p282tn.lib.widget.R$string.all))) {
            sb2.append(strM67769a1);
            sb2.append(" • ");
        }
        String str = this.mSelectedGrade;
        if (str != null && (strM67770b1 = m67770b1(str)) != null && !Intrinsics.m97797c(strM67770b1, getString(com.p282tn.lib.widget.R$string.all))) {
            sb2.append(strM67770b1);
            sb2.append(" • ");
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public final void m67766X0(TabLayout.Tab tab, boolean z11) {
        View customView = tab.getCustomView();
        if (customView == null) {
            return;
        }
        customView.setSelected(z11);
        TextView textView = (TextView) customView.findViewById(R$id.tv_tab_title);
        if (textView != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            Typeface typefaceM102046c = z11 ? AbstractC26004a.m102046c(contextRequireContext) : AbstractC26004a.m102047d(contextRequireContext);
            if (typefaceM102046c != null) {
                textView.setTypeface(typefaceM102046c);
            }
            textView.setTextColor(AbstractC2397b.getColor(requireContext(), z11 ? R$color.text_01 : R$color.text_02));
            if (z11) {
                customView.setBackgroundResource(R$drawable.bg_item_filter_tab);
            } else {
                customView.setBackgroundColor(0);
            }
        }
    }

    /* JADX INFO: renamed from: Y0 */
    private final Map m67767Y0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer num = this.mSelectedLevel2;
        if (num != null) {
        }
        Integer num2 = this.mSelectedLevel3;
        if (num2 != null) {
        }
        Integer num3 = this.mSelectedLevel4;
        if (num3 != null) {
        }
        String str = this.mSelectedGrade;
        if (str != null) {
            linkedHashMap.put("grade", str);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m67768Z0() {
        Object objL = this.categoryChildrenByParentIdMap.get("4");
        if (objL == null) {
            objL = CollectionsKt.m97506l();
        }
        if (((List) objL).isEmpty()) {
            return;
        }
        HashMap mapM67777j1 = m67777j1();
        if (this.mCurrentTab != TabType.FOR_U) {
            C24692n0 c24692n0 = this.headerBinding;
            if (c24692n0 == null) {
                Intrinsics.m97819y("headerBinding");
                c24692n0 = null;
            }
            TabLayout tabLayout = c24692n0.f75528g;
            if (tabLayout != null) {
                C24692n0 c24692n1 = this.headerBinding;
                if (c24692n1 == null) {
                    Intrinsics.m97819y("headerBinding");
                    c24692n1 = null;
                }
                TabLayout tabLayout2 = c24692n1.f75528g;
                tabLayout.selectTab(tabLayout2 != null ? tabLayout2.getTabAt(this.mCurrentTab.ordinal()) : null);
            }
        }
        if (!mapM67777j1.isEmpty()) {
            this.mFilterJson = "";
        }
        C26866a.f81698a.m104912c("UGCFilterFragment", "buildFilterView: level2=" + this.mSelectedLevel2 + ", level3=" + this.mSelectedLevel3 + ", level4=" + this.mSelectedLevel4, false);
        m67749J1();
    }

    /* JADX INFO: renamed from: a1 */
    private final String m67769a1(String categoryId) {
        List<UGCFilterItem> items;
        Object next;
        UGCFilterResponse uGCFilterResponse = this.mFilterResponse;
        if (uGCFilterResponse != null && (items = uGCFilterResponse.getItems()) != null) {
            Iterator<T> it = items.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.m97797c(((UGCFilterItem) next).getCategoryId(), categoryId));
            UGCFilterItem uGCFilterItem = (UGCFilterItem) next;
            if (uGCFilterItem != null) {
                return uGCFilterItem.getName();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b1 */
    private final String m67770b1(String gradeCode) {
        List<UGCFilterGrade> grades;
        Object next;
        UGCFilterResponse uGCFilterResponse = this.mFilterResponse;
        if (uGCFilterResponse != null && (grades = uGCFilterResponse.getGrades()) != null) {
            Iterator<T> it = grades.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.m97797c(((UGCFilterGrade) next).getGrade(), gradeCode));
            UGCFilterGrade uGCFilterGrade = (UGCFilterGrade) next;
            if (uGCFilterGrade != null) {
                return uGCFilterGrade.getDescName();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c1 */
    private final Map m67771c1(UGCFilterItem item, String key) {
        List<Object> data;
        UGCFilterVideoItem uGCFilterVideoItem;
        String ops;
        HashMap map = new HashMap();
        map.put("event_type", key);
        String name = item.getName();
        String str = "";
        if (name == null) {
            name = "";
        }
        map.put(CampaignEx.JSON_KEY_TITLE, name);
        String categoryId = item.getCategoryId();
        if (categoryId == null) {
            categoryId = "";
        }
        map.put("category_id", categoryId);
        map.put("tab_id", String.valueOf(getMTabId()));
        map.put("rank_category", "btn");
        String str2 = this.fromOptId;
        if (str2 == null) {
            str2 = "";
        }
        map.put("from_opt_id", str2);
        C14841a c14841a = this.mAdapter;
        if (c14841a != null && (data = c14841a.getData()) != null && (uGCFilterVideoItem = (UGCFilterVideoItem) CollectionsKt.m97361k0(data)) != null && (ops = uGCFilterVideoItem.getOps()) != null) {
            str = ops;
        }
        map.put("ops", str);
        return map;
    }

    /* JADX INFO: renamed from: d1 */
    private final int m67772d1() {
        return R$layout.home_empty_view_loading;
    }

    /* JADX INFO: renamed from: e1 */
    private final int m67773e1() {
        FragmentActivity activity = getActivity();
        return (activity == null || !AbstractC14556b.m65670a(activity)) ? 2 : 3;
    }

    /* JADX INFO: renamed from: g1 */
    private final void m67774g1() {
        View view = this.mLoadingView;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
    }

    /* JADX INFO: renamed from: h1 */
    private final void m67775h1() {
        View view = this.mNoResultView;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
    }

    /* JADX INFO: renamed from: i1 */
    private final void m67776i1() {
        Object objL = this.categoryChildrenByParentIdMap.get("4");
        if (objL == null) {
            objL = CollectionsKt.m97506l();
        }
        List list = (List) objL;
        C26866a.f81698a.m104912c("UGCFilterFragment", "initChannelView: root categories size=" + list.size(), false);
        if (!list.isEmpty()) {
            m67768Z0();
            m67731A1(true);
            return;
        }
        UGCFilterExpandView uGCFilterExpandView = this.filterView;
        if (uGCFilterExpandView == null) {
            Intrinsics.m97819y("filterView");
            uGCFilterExpandView = null;
        }
        AbstractC26006c.m102054g(uGCFilterExpandView);
    }

    private final void initViewModel() {
        UGCFilterViewModel uGCFilterViewModel = this.mMovieModel;
        if (uGCFilterViewModel != null) {
            uGCFilterViewModel.m69089j().m14851j(this, new C15175c0(new Function1() { // from class: com.transsion.home.fragment.filter.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UGCFilterFragment.m67796w1(this.f52849a, (BaseDto) obj);
                }
            }));
            uGCFilterViewModel.m69093n().m14851j(this, new C15175c0(new Function1() { // from class: com.transsion.home.fragment.filter.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UGCFilterFragment.m67800y1(this.f52855a, (RefreshBaseDto) obj);
                }
            }));
            uGCFilterViewModel.m69091l().m14851j(this, new C15175c0(new Function1() { // from class: com.transsion.home.fragment.filter.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UGCFilterFragment.m67802z1(this.f52856a, (UGCFilterItem) obj);
                }
            }));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: j1 */
    private final HashMap m67777j1() {
        HashMap map = new HashMap();
        String str = this.mFilterJson;
        if (str != null && str.length() != 0) {
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
                    if (next != null) {
                        int iHashCode = next.hashCode();
                        if (iHashCode != 3536286) {
                            if (iHashCode != 98615255) {
                                switch (iHashCode) {
                                    case 426008981:
                                        if (next.equals("categoryLve2")) {
                                            Intrinsics.m97799e(string);
                                            this.mSelectedLevel2 = StringsKt.m98216v(string);
                                        }
                                        break;
                                    case 426008982:
                                        if (next.equals("categoryLve3")) {
                                            Intrinsics.m97799e(string);
                                            this.mSelectedLevel3 = StringsKt.m98216v(string);
                                        }
                                        break;
                                    case 426008983:
                                        if (next.equals("categoryLve4")) {
                                            Intrinsics.m97799e(string);
                                            this.mSelectedLevel4 = StringsKt.m98216v(string);
                                        }
                                        break;
                                }
                            } else if (next.equals("grade")) {
                                this.mSelectedGrade = string;
                            }
                        } else if (next.equals("sort")) {
                            this.mCurrentTab = Intrinsics.m97797c(string, "Latest") ? TabType.LATEST : Intrinsics.m97797c(string, "New") ? TabType.HOTTEST : TabType.FOR_U;
                        }
                    }
                    map.put(next, string);
                }
                C26866a.f81698a.m104912c("UGCFilterFragment", "initDefaultSelect: filterMap=" + map, false);
            } catch (Exception e11) {
                C26866a.f81698a.m104915i("UGCFilterFragment", "initDefaultSelect: parse filterJson failed: " + e11.getMessage(), true);
            }
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k1 */
    private final void m67778k1() {
        RecyclerView recyclerView;
        if (this.mExposureHelper == null) {
            C25646b c25646b = new C25646b(0.6f, new C15165c(), false, 4, null);
            c25646b.m100946l(2);
            C24693o c24693o = (C24693o) getMViewBinding();
            if (c24693o != null && (recyclerView = c24693o.f75531c) != null) {
                recyclerView.addOnScrollListener(c25646b);
            }
            this.mExposureHelper = c25646b;
        }
    }

    /* JADX INFO: renamed from: l1 */
    private final void m67779l1() {
        UGCFilterExpandView uGCFilterExpandView = this.filterView;
        UGCFilterExpandView uGCFilterExpandView2 = null;
        if (uGCFilterExpandView == null) {
            Intrinsics.m97819y("filterView");
            uGCFilterExpandView = null;
        }
        uGCFilterExpandView.setFilterViewModel(this.mMovieModel);
        UGCFilterExpandView uGCFilterExpandView3 = this.filterView;
        if (uGCFilterExpandView3 == null) {
            Intrinsics.m97819y("filterView");
        } else {
            uGCFilterExpandView2 = uGCFilterExpandView3;
        }
        uGCFilterExpandView2.setOnSelectionChanged(new Function4() { // from class: com.transsion.home.fragment.filter.v
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return UGCFilterFragment.m67780m1(this.f52857a, (String) obj, (String) obj2, (String) obj3, (String) obj4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData() {
        startLoading();
        C26866a.f81698a.m104912c("UGCFilterFragment", "loadData: category=" + this.mCategory, false);
        UGCFilterViewModel uGCFilterViewModel = this.mMovieModel;
        if (uGCFilterViewModel != null) {
            uGCFilterViewModel.m69088i(this.mCategory);
        }
    }

    private final void loadMore() {
        m67731A1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m1 */
    public static final Unit m67780m1(UGCFilterFragment uGCFilterFragment, String str, String str2, String str3, String str4) {
        RecyclerView recyclerView;
        C26866a.a aVar = C26866a.f81698a;
        UGCFilterViewModel uGCFilterViewModel = uGCFilterFragment.mMovieModel;
        UGCFilterExpandView uGCFilterExpandView = null;
        UGCFilterItem uGCFilterItemM69087h = uGCFilterViewModel != null ? uGCFilterViewModel.m69087h(str) : null;
        UGCFilterViewModel uGCFilterViewModel2 = uGCFilterFragment.mMovieModel;
        UGCFilterItem uGCFilterItemM69087h2 = uGCFilterViewModel2 != null ? uGCFilterViewModel2.m69087h(str2) : null;
        UGCFilterViewModel uGCFilterViewModel3 = uGCFilterFragment.mMovieModel;
        aVar.m104912c("UGCFilterFragment", "filter selection changed: lv2=" + str + " data=" + uGCFilterItemM69087h + ", lv3=" + str2 + "  data=" + uGCFilterItemM69087h2 + ", lv4=" + str3 + " selectedGradeId=" + str4 + " data=" + (uGCFilterViewModel3 != null ? uGCFilterViewModel3.m69087h(str3) : null), false);
        uGCFilterFragment.mSelectedLevel2 = str != null ? StringsKt.m98216v(str) : null;
        uGCFilterFragment.mSelectedLevel3 = str2 != null ? StringsKt.m98216v(str2) : null;
        uGCFilterFragment.mSelectedLevel4 = str3 != null ? StringsKt.m98216v(str3) : null;
        uGCFilterFragment.mSelectedGrade = str4;
        UGCFilterExpandView uGCFilterExpandView2 = uGCFilterFragment.filterView;
        if (uGCFilterExpandView2 == null) {
            Intrinsics.m97819y("filterView");
            uGCFilterExpandView2 = null;
        }
        uGCFilterFragment.mSelectedGrade = uGCFilterExpandView2.getSelectedIds().get("grade");
        UGCFilterExpandView uGCFilterExpandView3 = uGCFilterFragment.filterView;
        if (uGCFilterExpandView3 == null) {
            Intrinsics.m97819y("filterView");
        } else {
            uGCFilterExpandView = uGCFilterExpandView3;
        }
        uGCFilterExpandView.collapseAll();
        C25646b c25646b = uGCFilterFragment.mExposureHelper;
        if (c25646b != null) {
            c25646b.m100943e();
        }
        uGCFilterFragment.mPage = 1;
        uGCFilterFragment.m67731A1(true);
        C24693o c24693o = (C24693o) uGCFilterFragment.getMViewBinding();
        if (c24693o != null && (recyclerView = c24693o.f75531c) != null) {
            recyclerView.scrollToPosition(0);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: n1 */
    private final void m67781n1() {
        List<UGCFilterItem> items;
        this.categoryChildrenByParentIdMap.clear();
        UGCFilterResponse uGCFilterResponse = this.mFilterResponse;
        if (uGCFilterResponse == null || (items = uGCFilterResponse.getItems()) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : items) {
            String parentId = ((UGCFilterItem) obj).getParentId();
            if (parentId == null) {
                parentId = "4";
            }
            Object arrayList = linkedHashMap.get(parentId);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(parentId, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.categoryChildrenByParentIdMap.putAll(linkedHashMap);
        C26866a.f81698a.m104912c("UGCFilterFragment", "initFilterMap: tree size=" + this.categoryChildrenByParentIdMap.size(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o1 */
    private final void m67782o1() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C24693o c24693o;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        int iM67773e1 = m67773e1();
        OffsetGridLayoutManager offsetGridLayoutManager = new OffsetGridLayoutManager(getContext(), iM67773e1, 1, false);
        C24693o c24693o2 = (C24693o) getMViewBinding();
        if (c24693o2 != null && (recyclerView4 = c24693o2.f75531c) != null) {
            recyclerView4.setLayoutManager(offsetGridLayoutManager);
        }
        C14841a c14841a = new C14841a(new ArrayList(), this.mExposureHelper, null, iM67773e1, HomeTabId.INSTANCE.m67539h(Integer.valueOf(getMTabId()), false) || StringsKt.m98227H(UGCVideoType.EDUCATION.getValue(), this.mCategory, true));
        c14841a.m36186h0().m108673z(true);
        c14841a.m36186h0().m108672y(true);
        c14841a.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.home.fragment.filter.w
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                UGCFilterFragment.m67783p1(this.f52858a);
            }
        });
        c14841a.m36158R0(new C15166d());
        c14841a.m36227w1(new InterfaceC27566d() { // from class: com.transsion.home.fragment.filter.x
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                UGCFilterFragment.m67786r1(this.f52859a, baseQuickAdapter, view, i11);
            }
        });
        this.mAdapter = c14841a;
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p1 */
    public static final void m67783p1(final UGCFilterFragment uGCFilterFragment) {
        RecyclerView recyclerView;
        if (C27287m.f83003a.m106330e()) {
            uGCFilterFragment.loadMore();
            return;
        }
        C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
        C24693o c24693o = (C24693o) uGCFilterFragment.getMViewBinding();
        if (c24693o == null || (recyclerView = c24693o.f75531c) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.filter.b0
            @Override // java.lang.Runnable
            public final void run() {
                UGCFilterFragment.m67784q1(this.f52832a);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final void m67784q1(UGCFilterFragment uGCFilterFragment) {
        C27941f c27941fM36186h0;
        C14841a c14841a = uGCFilterFragment.mAdapter;
        if (c14841a == null || (c27941fM36186h0 = c14841a.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public static final void m67786r1(UGCFilterFragment uGCFilterFragment, BaseQuickAdapter adapter, View view, int i11) {
        String collectionId;
        String subjectId;
        UGCVideoBelongToCollection belongToCollection;
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        if (item instanceof UGCFilterVideoItem) {
            UGCFilterVideoItem uGCFilterVideoItem = (UGCFilterVideoItem) item;
            C26866a.f81698a.m104912c("UGCFilterFragment", "click ugc video: id=" + uGCFilterVideoItem.getVideoId() + ", title=" + uGCFilterVideoItem.getTitle(), false);
            AbstractC28040c.m109009f(uGCFilterVideoItem.getContent(), null, null, 3, null);
            HashMap map = new HashMap();
            map.put("module_name", WebConstants.FIELD_ITEM);
            map.put("rank_category", WebConstants.FIELD_ITEM);
            String str = uGCFilterFragment.fromOptId;
            if (str == null) {
                str = "";
            }
            map.put("from_opt_id", str);
            UGCVideo video = uGCFilterVideoItem.getContent().getVideo();
            if (video == null || (belongToCollection = video.getBelongToCollection()) == null || (collectionId = belongToCollection.getCollectionId()) == null) {
                collectionId = "";
            }
            map.put("belong_to_collection_id", collectionId);
            String videoId = uGCFilterVideoItem.getVideoId();
            if (videoId == null) {
                videoId = "";
            }
            map.put("content_id", videoId);
            UGCVideo video2 = uGCFilterVideoItem.getContent().getVideo();
            if (video2 == null || (subjectId = video2.getSubjectId()) == null) {
                subjectId = "";
            }
            map.put("refer_subject_id", subjectId);
            map.put("content_type", "ugc_video");
            map.put(RequestParameters.POSITION, String.valueOf(i11));
            String ops = uGCFilterVideoItem.getOps();
            map.put("ops", ops != null ? ops : "");
            C14450a.f50860a.m65143f("/home/ugc_filter", map);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    /* JADX INFO: renamed from: s1 */
    private final void m67788s1(View headerView) {
        C24692n0 c24692n0 = this.headerBinding;
        C24692n0 c24692n1 = null;
        if (c24692n0 == null) {
            Intrinsics.m97819y("headerBinding");
            c24692n0 = null;
        }
        ConstraintLayout llTabMovie = c24692n0.f75524c;
        Intrinsics.m97801g(llTabMovie, "llTabMovie");
        C24692n0 c24692n2 = this.headerBinding;
        if (c24692n2 == null) {
            Intrinsics.m97819y("headerBinding");
        } else {
            c24692n1 = c24692n2;
        }
        TabLayout tabMovie = c24692n1.f75528g;
        Intrinsics.m97801g(tabMovie, "tabMovie");
        AbstractC26006c.m102058k(llTabMovie);
        tabMovie.removeAllTabs();
        int i11 = 0;
        for (Object obj : CollectionsKt.m97509o(getString(R$string.item_filter_for_u), getString(R$string.item_filter_latest), getString(R$string.item_filter_hottest))) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            String str = (String) obj;
            int i13 = C15164b.f52822a[this.mCurrentTab.ordinal()];
            boolean z11 = true;
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (i11 != 2) {
                        z11 = false;
                    }
                } else if (i11 != 1) {
                    z11 = false;
                }
            } else if (i11 != 0) {
                z11 = false;
            }
            TabLayout.Tab tabNewTab = tabMovie.newTab();
            Intrinsics.m97801g(tabNewTab, "newTab(...)");
            Intrinsics.m97799e(str);
            m67737D1(tabNewTab, str, z11);
            tabMovie.addTab(tabNewTab, z11);
            i11 = i12;
        }
        tabMovie.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C15167e());
    }

    private final void showLoadingView() {
        C24692n0 c24692n0 = this.headerBinding;
        if (c24692n0 == null) {
            Intrinsics.m97819y("headerBinding");
            c24692n0 = null;
        }
        ViewStub loadingStub = c24692n0.f75525d;
        Intrinsics.m97801g(loadingStub, "loadingStub");
        loadingStub.setLayoutResource(m67772d1());
        if (this.mLoadingView == null) {
            this.mLoadingView = loadingStub.inflate();
        }
        View view = this.mLoadingView;
        if (view != null) {
            AbstractC26006c.m102058k(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t1 */
    private final void m67790t1(View header) {
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
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: com.transsion.home.fragment.filter.y
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
                /* JADX INFO: renamed from: a */
                public final void mo21823a() {
                    UGCFilterFragment.m67792u1(this.f52860a);
                }
            });
        }
        C24693o c24693o3 = (C24693o) getMViewBinding();
        if (c24693o3 != null && (recyclerView = c24693o3.f75531c) != null) {
            recyclerView.addOnScrollListener(new C15168f(header));
        }
        C24693o c24693o4 = (C24693o) getMViewBinding();
        if (c24693o4 == null || (c24676f0 = c24693o4.f75530b) == null || (constraintLayout = c24676f0.f75425c) == null) {
            return;
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.fragment.filter.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCFilterFragment.m67794v1(this.f52861a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public static final void m67792u1(UGCFilterFragment uGCFilterFragment) {
        uGCFilterFragment.mo67722c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v1 */
    public static final void m67794v1(UGCFilterFragment uGCFilterFragment, View view) {
        RecyclerView recyclerView;
        C24693o c24693o = (C24693o) uGCFilterFragment.getMViewBinding();
        if (c24693o == null || (recyclerView = c24693o.f75531c) == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w1 */
    public static final Unit m67796w1(final UGCFilterFragment uGCFilterFragment, BaseDto baseDto) {
        SwipeRefreshLayout swipeRefreshLayout;
        List<UGCFilterItem> items;
        if (baseDto == null || !Intrinsics.m97797c(baseDto.getCode(), "0")) {
            C24693o c24693o = (C24693o) uGCFilterFragment.getMViewBinding();
            if (c24693o != null && (swipeRefreshLayout = c24693o.f75532d) != null) {
                swipeRefreshLayout.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.filter.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        UGCFilterFragment.m67798x1(this.f52830a);
                    }
                }, 200L);
            }
            C26866a.f81698a.m104915i("UGCFilterFragment", "getFilterItems failed: code=" + (baseDto != null ? baseDto.getCode() : null) + ", msg=" + (baseDto != null ? baseDto.getMsg() : null), true);
            return Unit.f75682a;
        }
        C26866a.a aVar = C26866a.f81698a;
        UGCFilterResponse uGCFilterResponse = (UGCFilterResponse) baseDto.getData();
        aVar.m104912c("UGCFilterFragment", "getFilterItems success: items size=" + ((uGCFilterResponse == null || (items = uGCFilterResponse.getItems()) == null) ? 0 : items.size()), false);
        UGCFilterResponse uGCFilterResponse2 = (UGCFilterResponse) baseDto.getData();
        if (uGCFilterResponse2 != null) {
            uGCFilterFragment.hideLoading();
            uGCFilterFragment.mFilterResponse = uGCFilterResponse2;
            uGCFilterFragment.m67781n1();
            uGCFilterFragment.m67776i1();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static final void m67798x1(UGCFilterFragment uGCFilterFragment) {
        if (!uGCFilterFragment.isAdded() || uGCFilterFragment.isDetached() || uGCFilterFragment.isRemoving()) {
            return;
        }
        uGCFilterFragment.hideLoading();
        uGCFilterFragment.m67745H1(uGCFilterFragment.getString(com.transsnet.downloader.R$string.str_ad_video_error_tips));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y1 */
    public static final Unit m67800y1(UGCFilterFragment uGCFilterFragment, RefreshBaseDto refreshBaseDto) {
        C27941f c27941fM36186h0;
        C14841a c14841a;
        C27941f c27941fM36186h1;
        List<Object> data;
        SwipeRefreshLayout swipeRefreshLayout;
        SwipeRefreshLayout swipeRefreshLayout2;
        HashMap mapM96844g;
        List<UGCContent> items;
        UGCContent uGCContent;
        UGCVideo video;
        List<Object> data2;
        HashMap mapM96844g2;
        List<UGCContent> items2;
        UGCContent uGCContent2;
        UGCVideo video2;
        SwipeRefreshLayout swipeRefreshLayout3;
        C24693o c24693o = (C24693o) uGCFilterFragment.getMViewBinding();
        if (c24693o != null && (swipeRefreshLayout3 = c24693o.f75532d) != null) {
            swipeRefreshLayout3.setEnabled(true);
        }
        String ops = null;
        if (refreshBaseDto == null || !Intrinsics.m97797c(refreshBaseDto.getCode(), "0")) {
            if (refreshBaseDto == null || !refreshBaseDto.getIsRefresh()) {
                C14841a c14841a2 = uGCFilterFragment.mAdapter;
                if (c14841a2 != null && (c27941fM36186h0 = c14841a2.m36186h0()) != null && c27941fM36186h0.m108666r() && (c14841a = uGCFilterFragment.mAdapter) != null && (c27941fM36186h1 = c14841a.m36186h0()) != null) {
                    c27941fM36186h1.m108669v();
                }
            } else {
                C24693o c24693o2 = (C24693o) uGCFilterFragment.getMViewBinding();
                if (c24693o2 != null && (swipeRefreshLayout = c24693o2.f75532d) != null && swipeRefreshLayout.isRefreshing()) {
                    C24693o c24693o3 = (C24693o) uGCFilterFragment.getMViewBinding();
                    if (c24693o3 != null && (swipeRefreshLayout2 = c24693o3.f75532d) != null) {
                        swipeRefreshLayout2.setRefreshing(false);
                    }
                    uGCFilterFragment.m68106n0();
                }
            }
            C14841a c14841a3 = uGCFilterFragment.mAdapter;
            if (c14841a3 != null && (data = c14841a3.getData()) != null && data.size() == 0) {
                if (C27287m.f83003a.m106330e()) {
                    uGCFilterFragment.m67745H1(uGCFilterFragment.getString(com.transsnet.downloader.R$string.str_ad_video_error_tips));
                } else {
                    uGCFilterFragment.m67739E1();
                }
                return Unit.f75682a;
            }
            if (C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(com.transsnet.downloader.R$string.str_ad_video_error_tips);
            } else {
                C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
            }
            C26866a.f81698a.m104915i("UGCFilterFragment", "getUGCContentList failed: code=" + (refreshBaseDto != null ? refreshBaseDto.getCode() : null) + ", msg=" + (refreshBaseDto != null ? refreshBaseDto.getMsg() : null), true);
            return Unit.f75682a;
        }
        C24655b logViewConfig = uGCFilterFragment.getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        C14841a c14841a4 = uGCFilterFragment.mAdapter;
        if (c14841a4 == null || (data2 = c14841a4.getData()) == null || !data2.isEmpty() || uGCFilterFragment.hasRecordedFirstLoadDuration || uGCFilterFragment.firstLoadStartTimeMillis <= 0) {
            C24655b logViewConfig2 = uGCFilterFragment.getLogViewConfig();
            if (logViewConfig2 != null && (mapM96844g = logViewConfig2.m96844g()) != null) {
                UGCContentList uGCContentList = (UGCContentList) refreshBaseDto.getData();
                if (uGCContentList != null && (items = uGCContentList.getItems()) != null && (uGCContent = (UGCContent) CollectionsKt.m97361k0(items)) != null && (video = uGCContent.getVideo()) != null) {
                    ops = video.getOps();
                }
                mapM96844g.put("ops", ops);
            }
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis() - uGCFilterFragment.firstLoadStartTimeMillis;
            C24655b logViewConfig3 = uGCFilterFragment.getLogViewConfig();
            if (logViewConfig3 != null && (mapM96844g2 = logViewConfig3.m96844g()) != null) {
                mapM96844g2.put("load_duration", String.valueOf(jCurrentTimeMillis));
                UGCContentList uGCContentList2 = (UGCContentList) refreshBaseDto.getData();
                if (uGCContentList2 != null && (items2 = uGCContentList2.getItems()) != null && (uGCContent2 = (UGCContent) CollectionsKt.m97361k0(items2)) != null && (video2 = uGCContent2.getVideo()) != null) {
                    ops = video2.getOps();
                }
                mapM96844g2.put("ops", ops);
            }
            uGCFilterFragment.hasRecordedFirstLoadDuration = true;
        }
        UGCContentList uGCContentList3 = (UGCContentList) refreshBaseDto.getData();
        if (uGCContentList3 != null) {
            uGCFilterFragment.m67751K1(uGCContentList3, refreshBaseDto.getIsRefresh());
            View view = uGCFilterFragment.mNoNetworkView;
            if (view != null) {
                AbstractC26006c.m102054g(view);
            }
        }
        uGCFilterFragment.hideLoading();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public static final Unit m67802z1(UGCFilterFragment uGCFilterFragment, UGCFilterItem uGCFilterItem) {
        if (uGCFilterItem != null) {
            C26866a.f81698a.m104912c("UGCFilterFragment", "selectFilterItemLiveData changed: id=" + uGCFilterItem.getCategoryId() + ", name=" + uGCFilterItem.getName(), false);
            uGCFilterFragment.m67733B1(uGCFilterItem);
            C25646b c25646b = uGCFilterFragment.mExposureHelper;
            if (c25646b != null) {
                c25646b.m100943e();
            }
        }
        return Unit.f75682a;
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: c0 */
    public void mo67722c0() {
        super.mo67722c0();
        this.mPage = 1;
        m67731A1(true);
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

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public C24693o getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C24693o c24693oM96985c = C24693o.m96985c(inflater);
        Intrinsics.m97801g(c24693oM96985c, "inflate(...)");
        return c24693oM96985c;
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: g0 */
    public String mo67724g0() {
        int iM67773e1 = m67773e1();
        if (iM67773e1 != 2) {
            return iM67773e1 != 3 ? "HomeFragmentListLinearTemplateAd" : "HomeFragmentListGrid3TemplateAd";
        }
        return "HomeFragmentListGrid2TemplateAd";
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void hideLoading() {
        m67774g1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment, com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        C24676f0 c24676f0;
        ConstraintLayout constraintLayout;
        Intrinsics.m97802h(view, "view");
        super.initView(view, savedInstanceState);
        this.mMovieModel = (UGCFilterViewModel) new C3227v0(this).m14969a(UGCFilterViewModel.class);
        C24692n0 c24692n0 = null;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.ugc_header_filter, (ViewGroup) null);
        C24692n0 c24692n0M96982a = C24692n0.m96982a(viewInflate);
        this.headerBinding = c24692n0M96982a;
        if (c24692n0M96982a == null) {
            Intrinsics.m97819y("headerBinding");
        } else {
            c24692n0 = c24692n0M96982a;
        }
        this.filterView = c24692n0.f75523b;
        m67779l1();
        Intrinsics.m97799e(viewInflate);
        m67788s1(viewInflate);
        m67778k1();
        m67782o1();
        m67790t1(viewInflate);
        C14841a c14841a = this.mAdapter;
        if (c14841a != null) {
            BaseQuickAdapter.m36130y(c14841a, viewInflate, 0, 0, 6, null);
        }
        initViewModel();
        setNetListener(new C15169g());
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
        List<Object> data2;
        Intrinsics.m97802h(wrapperNativeManager, "wrapperNativeManager");
        if (wrapperNativeManager != null) {
            UGCFilterVideoItem uGCFilterVideoItemM67418a = UGCFilterVideoItem.INSTANCE.m67418a(wrapperNativeManager, this.mCategory, m67767Y0());
            C14841a c14841a = this.mAdapter;
            int size = (c14841a == null || (data2 = c14841a.getData()) == null) ? 0 : data2.size();
            if (lastAdPosition < 0 || lastAdPosition > size) {
                C14841a c14841a2 = this.mAdapter;
                if (c14841a2 != null) {
                    c14841a2.mo36205p(uGCFilterVideoItemM67418a);
                }
            } else {
                C14841a c14841a3 = this.mAdapter;
                if (c14841a3 != null) {
                    c14841a3.mo36199n(lastAdPosition, uGCFilterVideoItemM67418a);
                }
            }
            C26866a.a aVar = C26866a.f81698a;
            C14841a c14841a4 = this.mAdapter;
            aVar.m104912c("UGCFilterFragment", "onAdCallback: insert ad at position=" + lastAdPosition + ", total size=" + ((c14841a4 == null || (data = c14841a4.getData()) == null) ? null : Integer.valueOf(data.size())), false);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        loadData();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        return new C24655b("/home/ugc_filter", false, 2, null);
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment, com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        String string;
        String string2;
        HashMap mapM96844g;
        String string3;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("category")) == null) {
            string = "Education";
        }
        this.mCategory = string;
        if (string.length() == 0) {
            this.mCategory = "Education";
        }
        Bundle arguments2 = getArguments();
        String str = "";
        if (arguments2 == null || (string2 = arguments2.getString("filter_json")) == null) {
            string2 = "";
        }
        this.mFilterJson = string2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string3 = arguments3.getString("fromOptId")) != null) {
            str = string3;
        }
        this.fromOptId = str;
        C26866a.f81698a.m104912c("UGCFilterFragment", "onCreate: category=" + this.mCategory + ", filterJson=" + this.mFilterJson, false);
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig == null || (mapM96844g = logViewConfig.m96844g()) == null) {
            return;
        }
        mapM96844g.put(WebConstants.PAGE_FROM, C24662i.f75350a.m96877i());
        mapM96844g.put("from_opt_id", this.fromOptId);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C3187b0 c3187b0M69094o;
        C3187b0 c3187b0M69090k;
        this.mPage = 1;
        UGCFilterViewModel uGCFilterViewModel = this.mMovieModel;
        if (uGCFilterViewModel != null && (c3187b0M69090k = uGCFilterViewModel.m69090k()) != null) {
            c3187b0M69090k.mo14858q(null);
        }
        UGCFilterViewModel uGCFilterViewModel2 = this.mMovieModel;
        if (uGCFilterViewModel2 != null && (c3187b0M69094o = uGCFilterViewModel2.m69094o()) != null) {
            c3187b0M69094o.mo14858q(null);
        }
        C26866a.f81698a.m104912c("UGCFilterFragment", "onDestroyView: clear data", false);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        AbstractC14517k.m65410h(null, this, hidden, "tabId=" + getMTabId(), 1, null);
        if (isResumed()) {
            if (hidden) {
                logPause();
            } else {
                logResume();
            }
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C25646b c25646b = this.mExposureHelper;
        if (c25646b != null) {
            c25646b.m100943e();
        }
        AbstractC14517k.m65414l(null, this, "tabId=" + getMTabId(), 1, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        C14841a c14841a;
        List<Object> data;
        super.onResume();
        View view = this.mNoNetworkView;
        if (view != null && AbstractC26006c.m102056i(view) && C27287m.f83003a.m106330e() && (c14841a = this.mAdapter) != null && (data = c14841a.getData()) != null && data.isEmpty()) {
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
