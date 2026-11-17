package com.transsion.moviedetail.fragment;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.noober.background.view.BLTextView;
import com.p282tn.lib.widget.R$string;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.util.AbstractC14556b;
import com.transsion.baseui.util.AbstractC14568n;
import com.transsion.memberapi.MemberCheckResult;
import com.transsion.moviedetail.R$id;
import com.transsion.moviedetail.activity.MovieDetailActivity;
import com.transsion.moviedetail.adapter.C15931l;
import com.transsion.moviedetail.adapter.C15933n;
import com.transsion.moviedetail.adapter.C15935p;
import com.transsion.moviedetail.view.WatchModeTipsView;
import com.transsion.moviedetail.viewmodel.MovieDetailViewModel;
import com.transsion.moviedetailapi.DownloadItem;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.DubsInfo;
import com.transsion.moviedetailapi.bean.ResourceDetectors;
import com.transsion.moviedetailapi.bean.ResourcesSeason;
import com.transsion.moviedetailapi.bean.ResourcesSeasonList;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.player.longvideo.helper.C16464n0;
import com.transsnet.downloader.DownloadManagerApi;
import com.transsnet.downloader.bean.DownloadListBean;
import com.transsnet.downloader.util.DownloadUtil;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import gn.C23605m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import mg.C25833j;
import ng.AbstractC26006c;
import okhttp3.internal.http2.Settings;
import p352dn.InterfaceC22997a;
import p352dn.InterfaceC22998b;
import p550kj.C24662i;
import p561kx.InterfaceC25450a;
import p620nn.AbstractC26039f;
import p743rh.C27287m;
import p765s6.InterfaceC27564b;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 k2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001?B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J)\u0010\u001b\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010\tJ\u000f\u0010#\u001a\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010\u0004J\u0017\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J'\u0010,\u001a\u00020\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\b\u0010+\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b,\u0010-J)\u0010.\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$2\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b.\u0010/J5\u00101\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010+\u001a\u0004\u0018\u00010$2\b\b\u0002\u00100\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0005H\u0002¢\u0006\u0004\b3\u0010\u0004J\u000f\u00104\u001a\u00020\u0005H\u0002¢\u0006\u0004\b4\u0010\u0004J\u000f\u00105\u001a\u00020\u0005H\u0002¢\u0006\u0004\b5\u0010\u0004J\u000f\u00106\u001a\u00020\u0005H\u0002¢\u0006\u0004\b6\u0010\u0004J\u001d\u00109\u001a\u00020\u00052\f\u00108\u001a\b\u0012\u0004\u0012\u0002070(H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00052\u0006\u0010;\u001a\u000207H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0005H\u0002¢\u0006\u0004\b>\u0010\u0004R\u0018\u0010A\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001b\u0010K\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0018\u0010M\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010@R\u0016\u0010P\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010R\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010@R(\u0010V\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010Z\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010]\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010_\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010\\R\u0016\u0010a\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010OR\u0016\u0010c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010OR\u001b\u0010h\u001a\u00020d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010H\u001a\u0004\bf\u0010gR\u0016\u0010j\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010O¨\u0006l"}, m97100d2 = {"Lcom/transsion/moviedetail/fragment/ResourceDetectorFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lgn/m;", "<init>", "()V", "", "receiveArguments", "", "isMonitorNetworkState", "()Z", "isAudioShowNoNetworkLayout", "Landroid/view/LayoutInflater;", "inflater", "I0", "(Landroid/view/LayoutInflater;)Lgn/m;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewData", "initViewModel", "initListener", "retryLoadData", "Lcom/transsion/moviedetailapi/bean/ResourcesSeasonList;", "seasonList", "", "Lcom/transsion/moviedetailapi/bean/ResourcesSeason;", "seasons", "e1", "(Lcom/transsion/moviedetailapi/bean/ResourcesSeasonList;Ljava/util/List;)V", CampaignEx.JSON_KEY_TITLE, "j1", "(Ljava/lang/String;)V", "V0", "k1", "c1", "J0", "", RequestParameters.POSITION, "h1", "(I)V", "", "Lcom/transsion/moviedetailapi/DownloadItem;", "downloadItem", "totalEpisode", "m1", "(Ljava/util/List;Ljava/lang/Integer;)V", "i1", "(ILcom/transsion/moviedetailapi/DownloadItem;Ljava/lang/Integer;)V", "isMultiResolution", "F0", "(Lcom/transsion/moviedetailapi/DownloadItem;Ljava/lang/Integer;II)V", "D0", "T0", "showLoading", "hideLoading", "Lcom/transsion/moviedetailapi/bean/DubsInfo;", "audioTracks", "M0", "(Ljava/util/List;)V", "info", "d1", "(Lcom/transsion/moviedetailapi/bean/DubsInfo;)V", "l1", "a", "Ljava/lang/String;", "moduleName", "Lcom/transsion/moviedetailapi/bean/Subject;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/moviedetailapi/bean/Subject;", "mMovieDetailBean", "Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "c", "Lkotlin/Lazy;", "G0", "()Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "movieDetailViewModel", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "ops", "e", "Z", "autoPlay", "f", "autoPlayResourceId", "", "g", "Ljava/util/Map;", "resMap", "Lcom/transsion/moviedetail/adapter/n;", "h", "Lcom/transsion/moviedetail/adapter/n;", "resAdapter", "i", "I", "curSeason", "j", "curResolution", CampaignEx.JSON_KEY_AD_K, "isPreloadDownloadResResponse", "l", "isSeasonResponse", "Lcom/transsion/player/longvideo/helper/n0;", "m", "H0", "()Lcom/transsion/player/longvideo/helper/n0;", "subtitleViewModel", "n", "isAudioDubs", "o", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ResourceDetectorFragment extends PageStatusFragment<C23605m> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String moduleName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Subject mMovieDetailBean;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String ops;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean autoPlay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String autoPlayResourceId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private C15933n resAdapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean isPreloadDownloadResResponse;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean isSeasonResponse;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isAudioDubs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy movieDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(MovieDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.moviedetail.fragment.ResourceDetectorFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.moviedetail.fragment.ResourceDetectorFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3227v0.c invoke() {
            C3227v0.c defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.m97801g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Map resMap = new LinkedHashMap();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int curSeason = 1;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int curResolution = 480;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Lazy subtitleViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(C16464n0.class), new Function0<C3231x0>() { // from class: com.transsion.moviedetail.fragment.ResourceDetectorFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.moviedetail.fragment.ResourceDetectorFragment$special$$inlined$activityViewModels$default$4
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3227v0.c invoke() {
            C3227v0.c defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.m97801g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.ResourceDetectorFragment$b */
    public static final class C15964b implements InterfaceC22997a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f54598b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ DownloadItem f54599c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ List f54600d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C15935p f54601e;

        C15964b(int i11, DownloadItem downloadItem, List list, C15935p c15935p) {
            this.f54598b = i11;
            this.f54599c = downloadItem;
            this.f54600d = list;
            this.f54601e = c15935p;
        }

        @Override // p352dn.InterfaceC22997a
        /* JADX INFO: renamed from: a */
        public void mo66165a(MemberCheckResult memberCheckResult) {
            InterfaceC22997a.a.m91583f(this, memberCheckResult);
        }

        @Override // p352dn.InterfaceC22997a
        /* JADX INFO: renamed from: b */
        public void mo66166b(MemberCheckResult memberCheckResult) {
            InterfaceC22997a.a.m91581d(this, memberCheckResult);
        }

        @Override // p352dn.InterfaceC22997a
        /* JADX INFO: renamed from: c */
        public void mo66167c(MemberCheckResult memberCheckResult) {
            InterfaceC22997a.a.m91584g(this, memberCheckResult);
        }

        @Override // p352dn.InterfaceC22997a
        /* JADX INFO: renamed from: d */
        public void mo66168d(MemberCheckResult memberCheckResult) {
            InterfaceC22997a.a.m91582e(this, memberCheckResult);
        }

        @Override // p352dn.InterfaceC22997a
        /* JADX INFO: renamed from: e */
        public void mo66169e() {
            InterfaceC22997a.a.m91580c(this);
            if (!ResourceDetectorFragment.this.isAdded() || ResourceDetectorFragment.this.isDetached()) {
                return;
            }
            ResourceDetectorFragment.this.m70435i1(this.f54598b, this.f54599c, ((ResourceDetectors) this.f54600d.get(0)).getTotalEpisode());
        }

        @Override // p352dn.InterfaceC22997a
        /* JADX INFO: renamed from: f */
        public void mo66170f(MemberCheckResult memberCheckResult) {
            InterfaceC22997a.a.m91578a(this, memberCheckResult);
        }

        @Override // p352dn.InterfaceC22997a
        public void onFail(String errorMsg) {
            String resourceId;
            Context context;
            Intrinsics.m97802h(errorMsg, "errorMsg");
            InterfaceC22997a.a.m91579b(this, errorMsg);
            C26866a.a.m104898f(C26866a.f81698a, "co_mem", "ResourceDetectorFragment --> immediateShowList() --> 单集多分辨率 --> " + errorMsg, false, 4, null);
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(R$string.no_network_toast);
            }
            if (!ResourceDetectorFragment.this.isAdded() || ResourceDetectorFragment.this.isDetached()) {
                return;
            }
            DownloadManagerApi.C21276a c21276a = DownloadManagerApi.f66480j;
            DownloadManagerApi downloadManagerApiM87093a = c21276a.m87093a();
            String resourceId2 = this.f54599c.getResourceId();
            Subject mMovieDetailBean = this.f54601e.getMMovieDetailBean();
            if (!DownloadManagerApi.m87075x0(downloadManagerApiM87093a, null, resourceId2, mMovieDetailBean != null ? mMovieDetailBean.isSeries() : false, false, 8, null) || (resourceId = this.f54599c.getResourceId()) == null || (context = this.f54601e.getContext()) == null) {
                return;
            }
            c21276a.m87093a().m87092y0(null, context, "subjectdetail", resourceId);
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.ResourceDetectorFragment$c */
    static final class C15965c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f54602a;

        C15965c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f54602a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f54602a;
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
            this.f54602a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.ResourceDetectorFragment$d */
    public static final class C15966d extends RecyclerView.AbstractC4213l {
        C15966d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(outRect, "outRect");
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = parent.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (childAdapterPosition == 0) {
                outRect.left = 0;
                outRect.right = AbstractC23384a.m92908b(4);
            } else if (childAdapterPosition == itemCount - 1) {
                outRect.left = AbstractC23384a.m92908b(4);
                outRect.right = 0;
            } else {
                outRect.left = AbstractC23384a.m92908b(4);
                outRect.right = AbstractC23384a.m92908b(4);
            }
        }
    }

    /* JADX INFO: renamed from: D0 */
    private final void m70405D0() {
        RecyclerView recyclerView;
        if (this.autoPlay) {
            this.autoPlay = false;
            C23605m mViewBinding = getMViewBinding();
            if (mViewBinding == null || (recyclerView = mViewBinding.f72005k) == null) {
                return;
            }
            recyclerView.post(new Runnable() { // from class: com.transsion.moviedetail.fragment.p0
                @Override // java.lang.Runnable
                public final void run() {
                    ResourceDetectorFragment.m70406E0(this.f54746a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final void m70406E0(ResourceDetectorFragment resourceDetectorFragment) {
        Context context;
        String str = resourceDetectorFragment.autoPlayResourceId;
        if (str == null || (context = resourceDetectorFragment.getContext()) == null) {
            return;
        }
        DownloadManagerApi.f66480j.m87093a().m87092y0(null, context, "subjectdetail", str);
    }

    /* JADX INFO: renamed from: F0 */
    private final void m70407F0(DownloadItem downloadItem, Integer totalEpisode, int isMultiResolution, int position) {
        String uploadBy;
        String sourceUrl;
        String str;
        String resourceId;
        List<ResourceDetectors> resourceDetectors;
        String resourceLink;
        Integer subjectType;
        Integer resolution;
        Integer epse;
        Cover cover;
        String name;
        String resourceId2;
        String url;
        try {
            Result.Companion companion = Result.INSTANCE;
            String str2 = (downloadItem == null || (url = downloadItem.getUrl()) == null) ? "" : url;
            String str3 = (downloadItem == null || (resourceId2 = downloadItem.getResourceId()) == null) ? "" : resourceId2;
            String str4 = (downloadItem == null || (name = downloadItem.getName()) == null) ? "" : name;
            Subject subject = this.mMovieDetailBean;
            DownloadBean downloadBean = new DownloadBean(str2, str3, str4, (subject == null || (cover = subject.getCover()) == null) ? null : cover.getUrl(), downloadItem != null ? downloadItem.getSize() : null, null, null, null, null, null, 0L, 0, 0, 0, 0L, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, 0L, 0, 0, null, null, 0L, null, null, 0L, 0, 0L, null, 0, null, null, false, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -32, -1, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
            if (downloadItem == null || (uploadBy = downloadItem.getUploadBy()) == null) {
                uploadBy = "";
            }
            downloadBean.setUploadBy(uploadBy);
            if (downloadItem == null || (sourceUrl = downloadItem.getSourceUrl()) == null) {
                sourceUrl = "";
            }
            downloadBean.setSourceUrl(sourceUrl);
            downloadBean.setPostId(downloadItem != null ? downloadItem.getPostId() : null);
            downloadBean.setEpse((downloadItem == null || (epse = downloadItem.getEpse()) == null) ? 0 : epse.intValue());
            downloadBean.setEp(downloadItem != null ? downloadItem.getEp() : 0);
            downloadBean.setSe(downloadItem != null ? downloadItem.getSe() : 0);
            downloadBean.setResolution((downloadItem == null || (resolution = downloadItem.getResolution()) == null) ? 0 : resolution.intValue());
            downloadBean.setRequireMemberType(downloadItem != null ? downloadItem.getRequireMemberType() : null);
            downloadBean.setMultiresolution(isMultiResolution);
            Subject subject2 = this.mMovieDetailBean;
            downloadBean.setSubjectId(subject2 != null ? subject2.getSubjectId() : null);
            Subject subject3 = this.mMovieDetailBean;
            downloadBean.setSubjectName(subject3 != null ? subject3.getTitle() : null);
            downloadBean.setResourcePosition(position + 1);
            DownloadBean.Companion companion2 = DownloadBean.INSTANCE;
            Subject subject4 = this.mMovieDetailBean;
            downloadBean.setType(companion2.m64886c(subject4 != null ? subject4.getSubjectType() : null));
            Subject subject5 = this.mMovieDetailBean;
            downloadBean.setSubjectType((subject5 == null || (subjectType = subject5.getSubjectType()) == null) ? SubjectType.MOVIE.getValue() : subjectType.intValue());
            downloadBean.setTotalEpisode(totalEpisode != null ? totalEpisode.intValue() : 1);
            Subject subject6 = this.mMovieDetailBean;
            if (subject6 == null || (resourceDetectors = subject6.getResourceDetectors()) == null) {
                str = "";
            } else {
                if (resourceDetectors.isEmpty() || (resourceLink = resourceDetectors.get(0).getResourceLink()) == null) {
                    resourceLink = "";
                }
                str = resourceLink;
            }
            DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
            DownloadManagerApi.m87025N(downloadManagerApiM87093a, fragmentActivityRequireActivity, this.mMovieDetailBean, "subjectdetail", null, this.ops, str, (downloadItem == null || (resourceId = downloadItem.getResourceId()) == null) ? "" : resourceId, this.moduleName, null, false, this.curSeason, false, 776, null);
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: G0 */
    private final MovieDetailViewModel m70408G0() {
        return (MovieDetailViewModel) this.movieDetailViewModel.getValue();
    }

    /* JADX INFO: renamed from: H0 */
    private final C16464n0 m70409H0() {
        return (C16464n0) this.subtitleViewModel.getValue();
    }

    /* JADX INFO: renamed from: J0 */
    private final void m70410J0() {
        final List<ResourceDetectors> resourceDetectors;
        C23605m mViewBinding;
        RecyclerView recyclerView;
        Subject subject = this.mMovieDetailBean;
        if (subject == null || (resourceDetectors = subject.getResourceDetectors()) == null || resourceDetectors.isEmpty() || (mViewBinding = getMViewBinding()) == null || (recyclerView = mViewBinding.f72005k) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.addItemDecoration(new C25833j(AbstractC5776a0.m27313a(8.0f)));
        if (resourceDetectors.get(0).isMultiResolution()) {
            final C15935p c15935p = new C15935p(this.mMovieDetailBean, resourceDetectors.get(0).getResolutionList());
            c15935p.m36193l(R$id.itemRoot);
            c15935p.m36216s1(new InterfaceC27564b() { // from class: com.transsion.moviedetail.fragment.q0
                @Override // p765s6.InterfaceC27564b
                /* JADX INFO: renamed from: a */
                public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                    ResourceDetectorFragment.m70411K0(c15935p, this, resourceDetectors, baseQuickAdapter, view, i11);
                }
            });
            recyclerView.setAdapter(c15935p);
            return;
        }
        C15931l c15931l = new C15931l(this.mMovieDetailBean, resourceDetectors);
        c15931l.m36193l(R$id.itemRoot);
        c15931l.m36216s1(new InterfaceC27564b() { // from class: com.transsion.moviedetail.fragment.r0
            @Override // p765s6.InterfaceC27564b
            /* JADX INFO: renamed from: a */
            public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ResourceDetectorFragment.m70412L0(this.f54757a, baseQuickAdapter, view, i11);
            }
        });
        recyclerView.setAdapter(c15931l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final void m70411K0(C15935p c15935p, ResourceDetectorFragment resourceDetectorFragment, List list, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        DownloadItem downloadItem = (DownloadItem) c15935p.getData().get(i11);
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b != null) {
            interfaceC22998b.mo69867u(downloadItem.getResolution(), resourceDetectorFragment.new C15964b(i11, downloadItem, list, c15935p));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final void m70412L0(ResourceDetectorFragment resourceDetectorFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        resourceDetectorFragment.m70434h1(i11);
    }

    /* JADX INFO: renamed from: M0 */
    private final void m70413M0(List audioTracks) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final void m70414N0(ResourceDetectorFragment resourceDetectorFragment, View view) {
        List<ResourceDetectors> resourceDetectors;
        String title;
        Subject subject = resourceDetectorFragment.mMovieDetailBean;
        if (subject == null || (resourceDetectors = subject.getResourceDetectors()) == null || resourceDetectors.isEmpty()) {
            return;
        }
        ResourceDetectors resourceDetectors2 = resourceDetectors.get(0);
        ResourceDetectorDialogFragment.Companion companion = ResourceDetectorDialogFragment.INSTANCE;
        Subject subject2 = resourceDetectorFragment.mMovieDetailBean;
        if (subject2 == null || (title = subject2.getTitle()) == null) {
            title = "";
        }
        ResourceDetectorDialogFragment resourceDetectorDialogFragmentM70385a = companion.m70385a(title, resourceDetectors2);
        FragmentManager childFragmentManager = resourceDetectorFragment.getChildFragmentManager();
        Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
        resourceDetectorDialogFragmentM70385a.show(childFragmentManager, "ResourceDetectorFragment --> ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final void m70415O0(ResourceDetectorFragment resourceDetectorFragment, View view) {
        Navigator navigatorM61857K = TheRouter.m61773c("/profile/user_center_labels_feedback").m61857K("feedback_from_page", "SUBJECT_DETAIL");
        Subject subject = resourceDetectorFragment.mMovieDetailBean;
        Navigator.m61845x(navigatorM61857K.m61857K("subject_id", subject != null ? subject.getSubjectId() : null), resourceDetectorFragment.requireContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final void m70416P0(ResourceDetectorFragment resourceDetectorFragment, View view) {
        resourceDetectorFragment.m70441l1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final void m70417Q0(final ResourceDetectorFragment resourceDetectorFragment, View view) {
        String subjectId;
        Fragment parentFragment;
        InterfaceC25450a interfaceC25450a;
        C26866a.a.m104898f(C26866a.f81698a, "VideoEpisodeFragment", "tvLanguage click then switch audio track", false, 4, null);
        Subject subject = resourceDetectorFragment.mMovieDetailBean;
        if (subject == null || (subjectId = subject.getSubjectId()) == null || (parentFragment = resourceDetectorFragment.getParentFragment()) == null || (interfaceC25450a = (InterfaceC25450a) TheRouter.m61774d(InterfaceC25450a.class, new Object[0])) == null) {
            return;
        }
        interfaceC25450a.mo100040c(parentFragment, R$id.fl_bottom_dialog_container, subjectId, new Function1() { // from class: com.transsion.moviedetail.fragment.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ResourceDetectorFragment.m70418R0(this.f54735a, (DubsInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final Unit m70418R0(ResourceDetectorFragment resourceDetectorFragment, DubsInfo info) {
        Intrinsics.m97802h(info, "info");
        resourceDetectorFragment.m70430d1(info);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final void m70419S0(ResourceDetectorFragment resourceDetectorFragment, View view) {
        Navigator navigatorM61857K = TheRouter.m61773c("/profile/user_center_labels_feedback").m61857K("feedback_from_page", "SUBJECT_DETAIL");
        Subject subject = resourceDetectorFragment.mMovieDetailBean;
        Navigator.m61845x(navigatorM61857K.m61857K("subject_id", subject != null ? subject.getSubjectId() : null), resourceDetectorFragment.requireContext(), null, 2, null);
    }

    /* JADX INFO: renamed from: T0 */
    private final void m70420T0() {
        FrameLayout frameLayout;
        C23605m mViewBinding = getMViewBinding();
        if (mViewBinding == null || (frameLayout = mViewBinding.f72001g) == null) {
            return;
        }
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResourceDetectorFragment.m70421U0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final void m70421U0(View view) {
        C28951b.f88586a.m111454d(com.transsion.moviedetail.R$string.movie_detail_res_loading);
    }

    /* JADX INFO: renamed from: V0 */
    private final void m70422V0() {
        List<ResourcesSeason> seasons;
        if (this.isSeasonResponse && this.isPreloadDownloadResResponse && this.curSeason > 1) {
            m70439k1();
            ResourcesSeasonList resourcesSeasonList = (ResourcesSeasonList) m70408G0().m70915L().m14847f();
            if (resourcesSeasonList == null || (seasons = resourcesSeasonList.getSeasons()) == null) {
                return;
            }
            int iM89371t = DownloadUtil.f68079a.m89371t(seasons, this.curSeason);
            if (iM89371t <= 0) {
                iM89371t = this.curResolution;
            }
            int i11 = iM89371t;
            C26866a.f81698a.m104912c("ResourceDetectorFragment --> ", "initOtherSe se:" + this.curSeason + " resolution:" + i11, true);
            MovieDetailViewModel movieDetailViewModelM70408G0 = m70408G0();
            Subject subject = this.mMovieDetailBean;
            movieDetailViewModelM70408G0.m70925x(subject != null ? subject.getSubjectId() : null, this.curSeason, 1, 3, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final Unit m70423W0(ResourceDetectorFragment resourceDetectorFragment, Integer num) {
        C26866a.a.m104898f(C26866a.f81698a, "ResourceDetectorFragment --> ", "seObserve:" + resourceDetectorFragment.curSeason, false, 4, null);
        resourceDetectorFragment.m70439k1();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final Unit m70424X0(ResourceDetectorFragment resourceDetectorFragment, Pair pair) {
        BLTextView bLTextView;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "ResourceDetectorFragment --> ", "字幕选择了, name:" + pair.getFirst() + ", " + pair.getSecond(), false, 4, null);
        if (resourceDetectorFragment.isAudioDubs) {
            C26866a.a.m104898f(aVar, "ResourceDetectorFragment --> ", "字幕选择了, 是多配音，不展示字幕", false, 4, null);
            return Unit.f75682a;
        }
        C23605m mViewBinding = resourceDetectorFragment.getMViewBinding();
        if (mViewBinding != null && (bLTextView = mViewBinding.f72006l) != null) {
            bLTextView.setText((CharSequence) pair.getFirst());
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final Unit m70425Y0(ResourceDetectorFragment resourceDetectorFragment, List list) {
        BLTextView bLTextView;
        BLTextView bLTextView2;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            C23605m mViewBinding = resourceDetectorFragment.getMViewBinding();
            if (mViewBinding != null && (bLTextView = mViewBinding.f72006l) != null) {
                AbstractC26006c.m102054g(bLTextView);
            }
            return Unit.f75682a;
        }
        C23605m mViewBinding2 = resourceDetectorFragment.getMViewBinding();
        if (mViewBinding2 != null && (bLTextView2 = mViewBinding2.f72006l) != null) {
            AbstractC26006c.m102058k(bLTextView2);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final Unit m70426Z0(ResourceDetectorFragment resourceDetectorFragment, ResourcesSeasonList resourcesSeasonList) {
        resourceDetectorFragment.isSeasonResponse = true;
        resourceDetectorFragment.m70431e1(resourcesSeasonList, resourcesSeasonList != null ? resourcesSeasonList.getSeasons() : null);
        C26866a.a.m104898f(C26866a.f81698a, "ResourceDetectorFragment --> ", "seasonListObserve:" + resourceDetectorFragment.curSeason, false, 4, null);
        resourceDetectorFragment.m70422V0();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final Unit m70427a1(ResourceDetectorFragment resourceDetectorFragment, DownloadListBean downloadListBean) {
        List<DownloadItem> items;
        Integer resolution;
        C26866a.a.m104898f(C26866a.f81698a, "ResourceDetectorFragment --> ", "downloadListPreload Observe:" + resourceDetectorFragment.curSeason, false, 4, null);
        resourceDetectorFragment.isPreloadDownloadResResponse = true;
        if (resourceDetectorFragment.m70429c1()) {
            resourceDetectorFragment.curResolution = (downloadListBean == null || (resolution = downloadListBean.getResolution()) == null) ? 480 : resolution.intValue();
            if (downloadListBean != null && (items = downloadListBean.getItems()) != null && !items.isEmpty()) {
                resourceDetectorFragment.resMap.put(Integer.valueOf(resourceDetectorFragment.curSeason), items);
                resourceDetectorFragment.m70443m1(items, downloadListBean.getTotalEpisode());
            }
            resourceDetectorFragment.m70422V0();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final Unit m70428b1(ResourceDetectorFragment resourceDetectorFragment, DownloadListBean downloadListBean) {
        List<DownloadItem> items;
        Integer resolution;
        resourceDetectorFragment.hideLoading();
        MovieDetailActivity.INSTANCE.m70152a("获取到数据之后展示数据");
        if (resourceDetectorFragment.m70429c1()) {
            resourceDetectorFragment.curResolution = (downloadListBean == null || (resolution = downloadListBean.getResolution()) == null) ? 480 : resolution.intValue();
            if (downloadListBean != null && (items = downloadListBean.getItems()) != null && !items.isEmpty()) {
                resourceDetectorFragment.resMap.put(Integer.valueOf(resourceDetectorFragment.curSeason), items);
                resourceDetectorFragment.m70443m1(items, downloadListBean.getTotalEpisode());
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: c1 */
    private final boolean m70429c1() {
        List<ResourceDetectors> resourceDetectors;
        Subject subject = this.mMovieDetailBean;
        if (subject == null || (resourceDetectors = subject.getResourceDetectors()) == null || resourceDetectors.isEmpty()) {
            return false;
        }
        return resourceDetectors.get(0).isCollection();
    }

    /* JADX INFO: renamed from: d1 */
    private final void m70430d1(DubsInfo info) {
        m70408G0().m70916P().mo14858q(info);
    }

    /* JADX INFO: renamed from: e1 */
    private final void m70431e1(final ResourcesSeasonList seasonList, final List seasons) {
        C23605m mViewBinding;
        BLTextView bLTextView;
        BLTextView bLTextView2;
        if ((seasons != null ? seasons.size() : 0) <= 1) {
            C23605m mViewBinding2 = getMViewBinding();
            if (mViewBinding2 == null || (bLTextView2 = mViewBinding2.f72000f) == null) {
                return;
            }
            AbstractC26006c.m102054g(bLTextView2);
            return;
        }
        if (seasons == null || (mViewBinding = getMViewBinding()) == null || (bLTextView = mViewBinding.f72000f) == null) {
            return;
        }
        AbstractC26006c.m102058k(bLTextView);
        bLTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResourceDetectorFragment.m70432f1(seasonList, this, seasons, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final void m70432f1(ResourcesSeasonList resourcesSeasonList, final ResourceDetectorFragment resourceDetectorFragment, final List list, View view) {
        VideoDetailSeasonsSelectFragment.Companion companion = VideoDetailSeasonsSelectFragment.INSTANCE;
        Subject subject = resourceDetectorFragment.mMovieDetailBean;
        VideoDetailSeasonsSelectFragment videoDetailSeasonsSelectFragmentM70605a = companion.m70605a(resourcesSeasonList, subject != null ? subject.getSubjectType() : null);
        videoDetailSeasonsSelectFragmentM70605a.m70604x0(resourceDetectorFragment.curSeason);
        Fragment parentFragment = resourceDetectorFragment.getParentFragment();
        if (parentFragment != null) {
            videoDetailSeasonsSelectFragmentM70605a.m71697n0(parentFragment, R$id.fl_bottom_dialog_container);
        }
        videoDetailSeasonsSelectFragmentM70605a.m70603w0(new Function1() { // from class: com.transsion.moviedetail.fragment.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ResourceDetectorFragment.m70433g1(list, resourceDetectorFragment, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final Unit m70433g1(List list, ResourceDetectorFragment resourceDetectorFragment, int i11) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ResourcesSeason) next).getSe() != i11);
        ResourcesSeason resourcesSeason = (ResourcesSeason) next;
        if (resourcesSeason == null) {
            return Unit.f75682a;
        }
        resourceDetectorFragment.curSeason = resourcesSeason.getSe();
        resourceDetectorFragment.m70439k1();
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "ResourceDetectorFragment --> ", "seChange:" + resourceDetectorFragment.curSeason, false, 4, null);
        resourceDetectorFragment.m70408G0().m70914K().mo14858q(Integer.valueOf(resourceDetectorFragment.curSeason));
        resourceDetectorFragment.m70437j1(AbstractC14568n.m65700a(resourcesSeason.getSe()));
        if (resourceDetectorFragment.resMap.containsKey(Integer.valueOf(resourcesSeason.getSe()))) {
            C26866a.a.m104898f(aVar, "ResourceDetectorFragment --> ", "se:" + resourceDetectorFragment.curSeason + " 已有缓存, 直接设数据", false, 4, null);
            List list2 = (List) resourceDetectorFragment.resMap.get(Integer.valueOf(resourcesSeason.getSe()));
            if (list2 != null) {
                resourceDetectorFragment.m70443m1(list2, Integer.valueOf(resourcesSeason.getMaxEp()));
            }
        } else {
            resourceDetectorFragment.showLoading();
            int iM89371t = DownloadUtil.f68079a.m89371t(list, resourceDetectorFragment.curSeason);
            if (iM89371t <= 0) {
                iM89371t = resourceDetectorFragment.curResolution;
            }
            int i12 = iM89371t;
            aVar.m104912c("ResourceDetectorFragment --> ", "se:" + resourceDetectorFragment.curSeason + " 无缓存，请求数据, resolution:" + i12, true);
            MovieDetailViewModel movieDetailViewModelM70408G0 = resourceDetectorFragment.m70408G0();
            Subject subject = resourceDetectorFragment.mMovieDetailBean;
            movieDetailViewModelM70408G0.m70925x(subject != null ? subject.getSubjectId() : null, resourcesSeason.getSe(), 1, 3, i12);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: h1 */
    private final void m70434h1(int position) {
        String str;
        boolean z11;
        List<ResourceDetectors> resourceDetectors;
        String subjectId;
        Context context;
        List<ResourceDetectors> resourceDetectors2;
        String resourceLink;
        Subject subject = this.mMovieDetailBean;
        String str2 = "";
        if (subject == null || (resourceDetectors2 = subject.getResourceDetectors()) == null) {
            str = "";
            z11 = false;
        } else {
            if (resourceDetectors2.isEmpty()) {
                resourceLink = "";
            } else {
                resourceLink = resourceDetectors2.get(0).getResourceLink();
                if (resourceLink == null) {
                    resourceLink = "";
                }
                String resourceId = resourceDetectors2.get(0).getResourceId();
                str2 = resourceId != null ? resourceId : "";
                if (resourceDetectors2.get(0).isMultiResolution()) {
                    z11 = true;
                }
                str = resourceLink;
            }
            z11 = false;
            str = resourceLink;
        }
        DownloadManagerApi.C21276a c21276a = DownloadManagerApi.f66480j;
        DownloadManagerApi downloadManagerApiM87093a = c21276a.m87093a();
        Subject subject2 = this.mMovieDetailBean;
        String subjectId2 = subject2 != null ? subject2.getSubjectId() : null;
        Subject subject3 = this.mMovieDetailBean;
        if (downloadManagerApiM87093a.m87091w0(subjectId2, str2, subject3 != null ? subject3.isSeries() : false, z11)) {
            Subject subject4 = this.mMovieDetailBean;
            if (subject4 == null || (subjectId = subject4.getSubjectId()) == null || (context = getContext()) == null) {
                return;
            }
            DownloadManagerApi.m87078z0(c21276a.m87093a(), subjectId, context, "subjectdetail", null, 8, null);
            return;
        }
        Subject subject5 = this.mMovieDetailBean;
        if (subject5 == null || (resourceDetectors = subject5.getResourceDetectors()) == null || resourceDetectors.isEmpty()) {
            return;
        }
        ResourceDetectors resourceDetectors3 = resourceDetectors.get(0);
        if (resourceDetectors3 == null || !resourceDetectors3.isMultiResolution()) {
            DownloadManagerApi downloadManagerApiM87093a2 = c21276a.m87093a();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
            DownloadManagerApi.m87025N(downloadManagerApiM87093a2, fragmentActivityRequireActivity, this.mMovieDetailBean, "subjectdetail", null, this.ops, str, null, this.moduleName, null, false, this.curSeason, false, 840, null);
            return;
        }
        List<DownloadItem> resolutionList = resourceDetectors3.getResolutionList();
        DownloadItem downloadItem = resolutionList != null ? resolutionList.get(position) : null;
        if (downloadItem != null) {
            m70407F0(downloadItem, 1, 1, position);
        }
    }

    private final void hideLoading() {
        FrameLayout frameLayout;
        C23605m mViewBinding = getMViewBinding();
        if (mViewBinding == null || (frameLayout = mViewBinding.f72001g) == null) {
            return;
        }
        AbstractC26006c.m102054g(frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public final void m70435i1(int position, DownloadItem downloadItem, Integer totalEpisode) {
        List<ResourceDetectors> resourceDetectors;
        Context context;
        DownloadManagerApi.C21276a c21276a = DownloadManagerApi.f66480j;
        DownloadManagerApi downloadManagerApiM87093a = c21276a.m87093a();
        String resourceId = downloadItem.getResourceId();
        Subject subject = this.mMovieDetailBean;
        if (DownloadManagerApi.m87075x0(downloadManagerApiM87093a, null, resourceId, subject != null ? subject.isSeries() : false, false, 8, null)) {
            String resourceId2 = downloadItem.getResourceId();
            if (resourceId2 == null || (context = getContext()) == null) {
                return;
            }
            c21276a.m87093a().m87092y0(null, context, "subjectdetail", resourceId2);
            return;
        }
        Subject subject2 = this.mMovieDetailBean;
        if (subject2 == null || (resourceDetectors = subject2.getResourceDetectors()) == null || resourceDetectors.isEmpty()) {
            return;
        }
        ResourceDetectors resourceDetectors2 = resourceDetectors.get(0);
        if (resourceDetectors2 == null || !resourceDetectors2.isMultiResolution()) {
            m70407F0(downloadItem, totalEpisode, 0, position);
            return;
        }
        List<DownloadItem> resolutionList = resourceDetectors2.getResolutionList();
        DownloadItem downloadItem2 = resolutionList != null ? resolutionList.get(position) : null;
        if (downloadItem2 != null) {
            m70407F0(downloadItem2, totalEpisode, 1, position);
        }
    }

    /* JADX INFO: renamed from: j1 */
    private final void m70437j1(String title) {
        C24662i c24662i = C24662i.f75350a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(NativeComponentConstants.KEY_COMPONENT_TYPE, "season_tab");
        linkedHashMap.put(CampaignEx.JSON_KEY_TITLE, title);
        Unit unit = Unit.f75682a;
        c24662i.m96881p("subjectdetail", linkedHashMap);
    }

    /* JADX INFO: renamed from: k1 */
    private final void m70439k1() {
        C23605m mViewBinding;
        BLTextView bLTextView;
        BLTextView bLTextView2;
        Subject subject = this.mMovieDetailBean;
        if (subject != null && subject.isTvType()) {
            C23605m mViewBinding2 = getMViewBinding();
            if (mViewBinding2 == null || (bLTextView2 = mViewBinding2.f72000f) == null) {
                return;
            }
            Context context = getContext();
            bLTextView2.setText(context != null ? context.getString(com.transsnet.downloader.R$string.download_video_detail_season_index, AbstractC26039f.m102110a(this.curSeason)) : null);
            return;
        }
        Subject subject2 = this.mMovieDetailBean;
        if (subject2 == null || !subject2.isEduType() || (mViewBinding = getMViewBinding()) == null || (bLTextView = mViewBinding.f72000f) == null) {
            return;
        }
        Context context2 = getContext();
        bLTextView.setText(context2 != null ? context2.getString(com.transsnet.downloader.R$string.download_video_detail_unit_index, AbstractC26039f.m102110a(this.curSeason)) : null);
    }

    /* JADX INFO: renamed from: l1 */
    private final void m70441l1() {
        List<ResourceDetectors> resourceDetectors;
        String resourceLink;
        Subject subject = this.mMovieDetailBean;
        String str = "";
        if (subject != null && (resourceDetectors = subject.getResourceDetectors()) != null && !resourceDetectors.isEmpty() && (resourceLink = resourceDetectors.get(0).getResourceLink()) != null) {
            str = resourceLink;
        }
        DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        DownloadManagerApi.m87025N(downloadManagerApiM87093a, fragmentActivityRequireActivity, this.mMovieDetailBean, "subjectdetail", null, this.ops, str, null, this.moduleName, null, false, this.curSeason, false, 840, null);
    }

    /* JADX INFO: renamed from: m1 */
    private final void m70443m1(List downloadItem, final Integer totalEpisode) {
        RecyclerView recyclerView;
        String title;
        RecyclerView recyclerView2;
        BLTextView bLTextView;
        List arrayList = new ArrayList();
        Context context = getContext();
        int i11 = (context == null || !AbstractC14556b.m65670a(context)) ? 3 : 6;
        if (downloadItem.size() > i11) {
            arrayList = downloadItem.subList(0, i11);
            C23605m mViewBinding = getMViewBinding();
            if (mViewBinding != null && (bLTextView = mViewBinding.f72007m) != null) {
                AbstractC26006c.m102058k(bLTextView);
            }
        } else {
            arrayList.addAll(downloadItem);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            C15933n c15933n = this.resAdapter;
            if (c15933n != null) {
                if (c15933n != null) {
                    c15933n.mo36201n1(arrayList);
                    return;
                }
                return;
            }
            C23605m mViewBinding2 = getMViewBinding();
            RecyclerView recyclerView3 = null;
            if (mViewBinding2 != null && (recyclerView = mViewBinding2.f72005k) != null) {
                recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), i11));
                recyclerView.addItemDecoration(new C15966d());
                Subject subject = this.mMovieDetailBean;
                if (subject == null || (title = subject.getTitle()) == null) {
                    title = "";
                }
                Subject subject2 = this.mMovieDetailBean;
                String str = (subject2 != null ? subject2.getDuration() : null);
                Subject subject3 = this.mMovieDetailBean;
                C15933n c15933n2 = new C15933n(title, str, arrayList, subject3 != null ? subject3.getSubjectType() : null);
                this.resAdapter = c15933n2;
                c15933n2.m36193l(R$id.itemRoot);
                c15933n2.m36216s1(new InterfaceC27564b() { // from class: com.transsion.moviedetail.fragment.o0
                    @Override // p765s6.InterfaceC27564b
                    /* JADX INFO: renamed from: a */
                    public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i12) {
                        ResourceDetectorFragment.m70445n1(this.f54740a, totalEpisode, baseQuickAdapter, view, i12);
                    }
                });
                recyclerView.setAdapter(c15933n2);
                C23605m mViewBinding3 = getMViewBinding();
                if (mViewBinding3 != null && (recyclerView2 = mViewBinding3.f72005k) != null) {
                    recyclerView2.setItemAnimator(null);
                }
                recyclerView3 = recyclerView;
            }
            Result.m112707constructorimpl(recyclerView3);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final void m70445n1(ResourceDetectorFragment resourceDetectorFragment, Integer num, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (adapter.getItemCount() > i11) {
            Object objM36182f0 = adapter.m36182f0(i11);
            DownloadItem downloadItem = objM36182f0 instanceof DownloadItem ? (DownloadItem) objM36182f0 : null;
            if (downloadItem == null) {
                return;
            }
            resourceDetectorFragment.m70435i1(i11, downloadItem, num);
        }
    }

    private final void showLoading() {
        FrameLayout frameLayout;
        C23605m mViewBinding = getMViewBinding();
        if (mViewBinding == null || (frameLayout = mViewBinding.f72001g) == null) {
            return;
        }
        AbstractC26006c.m102058k(frameLayout);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public C23605m getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23605m c23605mM93394c = C23605m.m93394c(inflater);
        Intrinsics.m97801g(c23605mM93394c, "inflate(...)");
        return c23605mM93394c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        AppCompatImageView appCompatImageView;
        BLTextView bLTextView;
        BLTextView bLTextView2;
        AppCompatImageView appCompatImageView2;
        AppCompatTextView appCompatTextView;
        C23605m mViewBinding = getMViewBinding();
        if (mViewBinding != null && (appCompatTextView = mViewBinding.f71997c) != null) {
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ResourceDetectorFragment.m70414N0(this.f54723a, view);
                }
            });
        }
        C23605m mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (appCompatImageView2 = mViewBinding2.f71996b) != null) {
            appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.u0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ResourceDetectorFragment.m70415O0(this.f54772a, view);
                }
            });
        }
        C23605m mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (bLTextView2 = mViewBinding3.f72007m) != null) {
            bLTextView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.v0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ResourceDetectorFragment.m70416P0(this.f54774a, view);
                }
            });
        }
        C23605m mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (bLTextView = mViewBinding4.f72006l) != null) {
            bLTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.w0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ResourceDetectorFragment.m70417Q0(this.f54777a, view);
                }
            });
        }
        C23605m mViewBinding5 = getMViewBinding();
        if (mViewBinding5 == null || (appCompatImageView = mViewBinding5.f71996b) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResourceDetectorFragment.m70419S0(this.f54781a, view);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        WatchModeTipsView watchModeTipsView;
        ResourceDetectors resourceDetectors;
        C23605m mViewBinding;
        AppCompatTextView appCompatTextView;
        BLTextView bLTextView;
        List<DubsInfo> dubs;
        Object obj = null;
        if (m70429c1()) {
            MovieDetailViewModel movieDetailViewModelM70408G0 = m70408G0();
            Subject subject = this.mMovieDetailBean;
            movieDetailViewModelM70408G0.m70927z(subject != null ? subject.getSubjectId() : null);
        } else {
            m70410J0();
        }
        m70405D0();
        m70420T0();
        Subject subject2 = this.mMovieDetailBean;
        if (subject2 != null && (dubs = subject2.getDubs()) != null) {
            m70413M0(dubs);
        }
        Subject subject3 = this.mMovieDetailBean;
        if (subject3 != null) {
            String subjectId = subject3.getSubjectId();
            List<DubsInfo> dubs2 = subject3.getDubs();
            this.isAudioDubs = dubs2 != null && (dubs2.isEmpty() ^ true) && dubs2.size() > 1;
            C26866a.a.m104898f(C26866a.f81698a, "ResourceDetectorFragment --> ", "video res-dubs size: " + (dubs2 != null ? Integer.valueOf(dubs2.size()) : null), false, 4, null);
            if (this.isAudioDubs && dubs2 != null) {
                for (Object obj2 : dubs2) {
                    if (Intrinsics.m97797c(((DubsInfo) obj2).getSubjectId(), subjectId)) {
                        obj = obj2;
                        break;
                    }
                }
                DubsInfo dubsInfo = (DubsInfo) obj;
                if (dubsInfo != null) {
                    dubsInfo.setSelected(true);
                    C23605m mViewBinding2 = getMViewBinding();
                    if (mViewBinding2 != null && (bLTextView = mViewBinding2.f72006l) != null) {
                        bLTextView.setText(dubsInfo.getLanName());
                    }
                }
            }
            List<ResourceDetectors> resourceDetectors2 = subject3.getResourceDetectors();
            if (resourceDetectors2 != null && (resourceDetectors = (ResourceDetectors) CollectionsKt.m97361k0(resourceDetectors2)) != null && (mViewBinding = getMViewBinding()) != null && (appCompatTextView = mViewBinding.f71998d) != null) {
                appCompatTextView.setText(resourceDetectors.getUploadBy());
            }
        }
        C23605m mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (watchModeTipsView = mViewBinding3.f72004j) == null) {
            return;
        }
        watchModeTipsView.checkShow();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        Subject subject;
        BLTextView bLTextView;
        BLTextView bLTextView2;
        m70408G0().m70915L().m14851j(this, new C15965c(new Function1() { // from class: com.transsion.moviedetail.fragment.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ResourceDetectorFragment.m70426Z0(this.f54785a, (ResourcesSeasonList) obj);
            }
        }));
        m70408G0().m70926y().m14851j(this, new C15965c(new Function1() { // from class: com.transsion.moviedetail.fragment.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ResourceDetectorFragment.m70427a1(this.f54789a, (DownloadListBean) obj);
            }
        }));
        m70408G0().m70924w().m14851j(this, new C15965c(new Function1() { // from class: com.transsion.moviedetail.fragment.a1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ResourceDetectorFragment.m70428b1(this.f54684a, (DownloadListBean) obj);
            }
        }));
        m70408G0().m70914K().m14851j(this, new C15965c(new Function1() { // from class: com.transsion.moviedetail.fragment.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ResourceDetectorFragment.m70423W0(this.f54689a, (Integer) obj);
            }
        }));
        m70408G0().m70914K().mo14858q(Integer.valueOf(this.curSeason));
        Subject subject2 = this.mMovieDetailBean;
        if ((subject2 == null || !subject2.isMovieType()) && ((subject = this.mMovieDetailBean) == null || !subject.isTvType())) {
            C23605m mViewBinding = getMViewBinding();
            if (mViewBinding != null && (bLTextView = mViewBinding.f72006l) != null) {
                AbstractC26006c.m102054g(bLTextView);
            }
        } else {
            C23605m mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (bLTextView2 = mViewBinding2.f72006l) != null) {
                bLTextView2.setVisibility(this.isAudioDubs ? 0 : 8);
            }
        }
        m70409H0().m71822d().m14851j(this, new C15965c(new Function1() { // from class: com.transsion.moviedetail.fragment.c1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ResourceDetectorFragment.m70424X0(this.f54694a, (Pair) obj);
            }
        }));
        m70409H0().m71821c().m14851j(this, new C15965c(new Function1() { // from class: com.transsion.moviedetail.fragment.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ResourceDetectorFragment.m70425Y0(this.f54728a, (List) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isMonitorNetworkState() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("data_key_resource_detectors") : null;
        this.mMovieDetailBean = serializable instanceof Subject ? (Subject) serializable : null;
        Bundle arguments2 = getArguments();
        this.ops = arguments2 != null ? arguments2.getString("ops") : null;
        Bundle arguments3 = getArguments();
        this.autoPlay = arguments3 != null ? arguments3.getBoolean("auto_play") : false;
        Bundle arguments4 = getArguments();
        this.autoPlayResourceId = arguments4 != null ? arguments4.getString("auto_play_resource_id") : null;
        Bundle arguments5 = getArguments();
        this.moduleName = arguments5 != null ? arguments5.getString("module_name") : null;
        Bundle arguments6 = getArguments();
        int i11 = arguments6 != null ? arguments6.getInt("season") : 1;
        this.curSeason = i11;
        if (i11 <= 0) {
            this.curSeason = 1;
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }
}
