package com.transsion.ugcvideodetail.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.ugcvideodetail.adapter.C20149g;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoList;
import com.transsion.ugcvideodetail.hepler.C20316g;
import com.transsion.ugcvideodetail.hepler.UGCVideoPlayFrom;
import com.transsion.ugcvideodetail.viewmodel.UGCLocalVideoDetailViewModel;
import com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import ng.AbstractC26006c;
import p648oj.InterfaceC26261i1;
import p743rh.C27287m;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p765s6.InterfaceC27569g;
import p801u6.C27941f;
import p801u6.C27942g;
import p840vj.C28117b;
import p885wv.C28452l;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 ]2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0004J\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0015H\u0002¢\u0006\u0004\b'\u0010(J1\u0010*\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0)2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b-\u0010.J%\u00101\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\fH\u0002¢\u0006\u0004\b3\u0010\u0004J\u000f\u00104\u001a\u00020\fH\u0002¢\u0006\u0004\b4\u0010\u0004J\u0019\u00106\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b6\u0010.R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010P\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010R\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010GR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010UR\u0016\u0010Z\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010UR\u0014\u0010\\\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010U¨\u0006^"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/fragment/UGCVideoDialogPlayListFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lwv/l;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "u0", "(Landroid/view/LayoutInflater;)Lwv/l;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "", "receiveArguments", "initViewData", "s0", "K0", "initViewModel", "initListener", "retryLoadData", "onPause", "", "hidden", "onHiddenChanged", "(Z)V", "showLoading", "hideLoading", "initExposureHelper", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideoList;", "playList", "x0", "(Lcom/transsion/ugcvideodetail/api/bean/UGCVideoList;)V", "", "Loj/i1;", "items", "G0", "(Ljava/util/List;)Z", "isLoadDown", "hasMore", "w0", "(ZZ)V", "", "N0", "(ZLjava/util/List;Lcom/transsion/ugcvideodetail/api/bean/UGCVideoList;)V", "clickedVideoId", "L0", "(Ljava/lang/String;)V", "videoId", "previousVideoId", "O0", "(Ljava/lang/String;Ljava/lang/String;)V", "J0", "M0", "ugcVideoId", "H0", "Lcom/transsion/ugcvideodetail/viewmodel/UGCVideoDetailViewModel;", "a", "Lkotlin/Lazy;", "v0", "()Lcom/transsion/ugcvideodetail/viewmodel/UGCVideoDetailViewModel;", "viewModel", "Lcom/transsion/ugcvideodetail/viewmodel/UGCLocalVideoDetailViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "t0", "()Lcom/transsion/ugcvideodetail/viewmodel/UGCLocalVideoDetailViewModel;", "localViewModel", "Lcom/transsion/ugcvideodetail/adapter/g;", "c", "Lcom/transsion/ugcvideodetail/adapter/g;", "playListAdapter", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/String;", "currentPlayingId", "Lcom/transsion/ugcvideodetail/hepler/UGCVideoPlayFrom;", "e", "Lcom/transsion/ugcvideodetail/hepler/UGCVideoPlayFrom;", "videoPlayFrom", "Lvj/b;", "f", "Lvj/b;", "exposureHelper", "g", "pageName", "", "h", "I", "tabIndex", "i", "tabStartPosition", "j", "tabEndPosition", CampaignEx.JSON_KEY_AD_K, "scrollOffset", "l", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCVideoDialogPlayListFragment extends PageStatusFragment<C28452l> {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C20149g playListAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String currentPlayingId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private C28117b exposureHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String pageName;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int tabIndex;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy viewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(UGCVideoDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.ugcvideodetail.fragment.UGCVideoDialogPlayListFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.ugcvideodetail.fragment.UGCVideoDialogPlayListFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy localViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(UGCLocalVideoDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.ugcvideodetail.fragment.UGCVideoDialogPlayListFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.ugcvideodetail.fragment.UGCVideoDialogPlayListFragment$special$$inlined$activityViewModels$default$4
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

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private UGCVideoPlayFrom videoPlayFrom = UGCVideoPlayFrom.ON_LINE_VIDEO;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int tabStartPosition = 1;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int tabEndPosition = 50;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int scrollOffset = (AbstractC5806y.m27489e() / 2) - AbstractC23384a.m92908b(80);

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCVideoDialogPlayListFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final UGCVideoDialogPlayListFragment m83986a(int i11, int i12, int i13, UGCVideoPlayFrom videoFrom) {
            Intrinsics.m97802h(videoFrom, "videoFrom");
            UGCVideoDialogPlayListFragment uGCVideoDialogPlayListFragment = new UGCVideoDialogPlayListFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("tab_index", i11);
            bundle.putInt("tab_start_position", i12);
            bundle.putInt("tab_end_position", i13);
            bundle.putInt("video_from", videoFrom.getValue());
            uGCVideoDialogPlayListFragment.setArguments(bundle);
            return uGCVideoDialogPlayListFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCVideoDialogPlayListFragment$b */
    public /* synthetic */ class C20221b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64233a;

        static {
            int[] iArr = new int[UGCVideoPlayFrom.values().length];
            try {
                iArr[UGCVideoPlayFrom.LOCAL_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UGCVideoPlayFrom.ON_LINE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f64233a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCVideoDialogPlayListFragment$c */
    static final class C20222c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f64234a;

        C20222c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f64234a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f64234a;
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
            this.f64234a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final void m83953A0(UGCVideoDialogPlayListFragment uGCVideoDialogPlayListFragment) {
        uGCVideoDialogPlayListFragment.m83962J0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final void m83954B0(UGCVideoDialogPlayListFragment uGCVideoDialogPlayListFragment) {
        if (C27287m.f83003a.m106330e()) {
            uGCVideoDialogPlayListFragment.m83964M0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final Unit m83955C0(UGCVideoDialogPlayListFragment uGCVideoDialogPlayListFragment, List list) {
        String ugcVideoId;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return Unit.f75682a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int playListPosition = ((UGCVideo) obj).getPlayListPosition();
            int i11 = uGCVideoDialogPlayListFragment.tabStartPosition;
            if (playListPosition <= uGCVideoDialogPlayListFragment.tabEndPosition && i11 <= playListPosition) {
                arrayList.add(obj);
            }
        }
        C20149g c20149g = uGCVideoDialogPlayListFragment.playListAdapter;
        List<Object> data = c20149g != null ? c20149g.getData() : null;
        if ((data == null || data.isEmpty()) && !arrayList.isEmpty()) {
            C20149g c20149g2 = uGCVideoDialogPlayListFragment.playListAdapter;
            if (c20149g2 != null) {
                c20149g2.mo36201n1(CollectionsKt.m97343U0(arrayList));
            }
            UGCVideo uGCVideo = (UGCVideo) uGCVideoDialogPlayListFragment.m83978v0().m84261G().m14847f();
            if (uGCVideo != null && (ugcVideoId = uGCVideo.getUgcVideoId()) != null) {
                m83967P0(uGCVideoDialogPlayListFragment, ugcVideoId, null, 2, null);
                uGCVideoDialogPlayListFragment.m83960H0(ugcVideoId);
            }
            uGCVideoDialogPlayListFragment.hideLoading();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final Unit m83956D0(UGCVideoDialogPlayListFragment uGCVideoDialogPlayListFragment, UGCVideoList uGCVideoList) {
        if (uGCVideoList != null) {
            uGCVideoDialogPlayListFragment.m83980x0(uGCVideoList);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final Unit m83957E0(UGCVideoDialogPlayListFragment uGCVideoDialogPlayListFragment, List list) {
        String ugcVideoId;
        Integer ugcVideoPosition;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                DownloadBean downloadBean = (DownloadBean) obj;
                int iIntValue = 0;
                if (downloadBean != null && (ugcVideoPosition = downloadBean.getUgcVideoPosition()) != null) {
                    iIntValue = ugcVideoPosition.intValue();
                }
                int i11 = uGCVideoDialogPlayListFragment.tabStartPosition;
                if (iIntValue <= uGCVideoDialogPlayListFragment.tabEndPosition && i11 <= iIntValue) {
                    arrayList.add(obj);
                }
            }
            C20149g c20149g = uGCVideoDialogPlayListFragment.playListAdapter;
            if (c20149g != null) {
                List listU0 = CollectionsKt.m97343U0(arrayList);
                Intrinsics.m97800f(listU0, "null cannot be cast to non-null type kotlin.collections.MutableList<com.transsion.baselib.db.download.UGCVideoPlayable>");
                c20149g.mo36201n1(TypeIntrinsics.m97852c(listU0));
            }
            DownloadBean downloadBean2 = (DownloadBean) uGCVideoDialogPlayListFragment.m83977t0().m84223i().m14847f();
            if (downloadBean2 != null && (ugcVideoId = downloadBean2.getUgcVideoId()) != null) {
                m83967P0(uGCVideoDialogPlayListFragment, ugcVideoId, null, 2, null);
                uGCVideoDialogPlayListFragment.m83960H0(ugcVideoId);
            }
            uGCVideoDialogPlayListFragment.hideLoading();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final Unit m83958F0(UGCVideoDialogPlayListFragment uGCVideoDialogPlayListFragment, DownloadBean downloadBean) {
        String ugcVideoId;
        if (downloadBean != null && (ugcVideoId = downloadBean.getUgcVideoId()) != null) {
            m83967P0(uGCVideoDialogPlayListFragment, ugcVideoId, null, 2, null);
            uGCVideoDialogPlayListFragment.m83960H0(ugcVideoId);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: G0 */
    private final boolean m83959G0(List items) {
        if (items.isEmpty()) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((InterfaceC26261i1) it.next()).videoUGCPosition()));
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        Integer num = (Integer) CollectionsKt.m97375y0(arrayList);
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = (Integer) CollectionsKt.m97373w0(arrayList);
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        int i11 = this.tabEndPosition;
        boolean z11 = iIntValue <= i11 && iIntValue2 >= this.tabStartPosition;
        C26866a.a.m104898f(C26866a.f81698a, "UGCVideoDialogPlayListFragment", "isDataForCurrentTab: data range[" + iIntValue + "-" + iIntValue2 + "], tab range[" + this.tabStartPosition + "-" + i11 + "], hasIntersection=" + z11, false, 4, null);
        return z11;
    }

    /* JADX INFO: renamed from: H0 */
    private final void m83960H0(final String ugcVideoId) {
        C28452l mViewBinding;
        RecyclerView recyclerView;
        if (ugcVideoId == null || ugcVideoId.length() == 0 || getMViewBinding() == null || this.playListAdapter == null || (mViewBinding = getMViewBinding()) == null || (recyclerView = mViewBinding.f87358c) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: com.transsion.ugcvideodetail.fragment.o1
            @Override // java.lang.Runnable
            public final void run() {
                UGCVideoDialogPlayListFragment.m83961I0(this.f64299a, ugcVideoId);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final void m83961I0(UGCVideoDialogPlayListFragment uGCVideoDialogPlayListFragment, String str) {
        RecyclerView recyclerView;
        List<Object> data;
        List<Object> data2;
        C20149g c20149g = uGCVideoDialogPlayListFragment.playListAdapter;
        int i11 = -1;
        if (c20149g != null && (data2 = c20149g.getData()) != null) {
            Iterator<Object> it = data2.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                if (Intrinsics.m97797c(((InterfaceC26261i1) it.next()).videoUGCId(), str)) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
        }
        C26866a.a aVar = C26866a.f81698a;
        C20149g c20149g2 = uGCVideoDialogPlayListFragment.playListAdapter;
        C26866a.a.m104898f(aVar, "UGCVideoDialogPlayListFragment", "listScrollToPosition id:" + str + ", position:" + i11 + ", dataSize:" + ((c20149g2 == null || (data = c20149g2.getData()) == null) ? 0 : data.size()), false, 4, null);
        if (i11 < 0) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            C28452l mViewBinding = uGCVideoDialogPlayListFragment.getMViewBinding();
            Unit unit = null;
            RecyclerView.AbstractC4214m layoutManager = (mViewBinding == null || (recyclerView = mViewBinding.f87358c) == null) ? null : recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                int i13 = uGCVideoDialogPlayListFragment.scrollOffset;
                linearLayoutManager.scrollToPositionWithOffset(i11, i13 > 0 ? i13 : 0);
                unit = Unit.f75682a;
            }
            Result.m112707constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: J0 */
    private final void m83962J0() {
        List<Object> listL;
        int playListPosition;
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        String str = (String) m83978v0().m84257B().m14847f();
        if (str == null) {
            return;
        }
        C20149g c20149g = this.playListAdapter;
        if (c20149g == null || (listL = c20149g.getData()) == null) {
            listL = CollectionsKt.m97506l();
        }
        InterfaceC26261i1 interfaceC26261i1 = (InterfaceC26261i1) CollectionsKt.m97372v0(listL);
        if (interfaceC26261i1 != null) {
            playListPosition = interfaceC26261i1 instanceof UGCVideo ? ((UGCVideo) interfaceC26261i1).getPlayListPosition() : 0;
        } else {
            playListPosition = this.tabStartPosition - 1;
        }
        int i11 = this.tabEndPosition;
        if (playListPosition >= i11) {
            C20149g c20149g2 = this.playListAdapter;
            if (c20149g2 != null && (c27941fM36186h1 = c20149g2.m36186h0()) != null) {
                C27941f.m108652u(c27941fM36186h1, false, 1, null);
            }
            C20149g c20149g3 = this.playListAdapter;
            if (c20149g3 != null && (c27941fM36186h0 = c20149g3.m36186h0()) != null) {
                c27941fM36186h0.m108673z(false);
            }
            C26866a.a.m104898f(C26866a.f81698a, "UGCVideoDialogPlayListFragment", "loadMoreData: reached tab end position " + this.tabEndPosition + ", stop loading", false, 4, null);
            return;
        }
        int i12 = playListPosition + 1;
        int iMin = Math.min(playListPosition + 9, i11);
        C26866a.a.m104898f(C26866a.f81698a, "UGCVideoDialogPlayListFragment", "loadMoreData: tabIndex=" + this.tabIndex + ", startPosition=" + i12 + ", endPosition=" + iMin + ", tabRange=[" + this.tabStartPosition + "-" + this.tabEndPosition + "]", false, 4, null);
        m83978v0().m84276X(str, i12, iMin, true);
    }

    /* JADX INFO: renamed from: L0 */
    private final void m83963L0(String clickedVideoId) {
        List<Object> listL;
        if (clickedVideoId == null || clickedVideoId.length() == 0) {
            C26866a.a.m104898f(C26866a.f81698a, "UGCVideoDialogPlayListFragment", "syncTabDataToDetailPlayList: clickedVideoId is empty, skipping sync", false, 4, null);
            return;
        }
        C20149g c20149g = this.playListAdapter;
        if (c20149g == null || (listL = c20149g.getData()) == null) {
            listL = CollectionsKt.m97506l();
        }
        if (listL.isEmpty()) {
            C26866a.a.m104898f(C26866a.f81698a, "UGCVideoDialogPlayListFragment", "syncTabDataToDetailPlayList: Tab data is empty, skipping sync", false, 4, null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listL.iterator();
        while (it.hasNext()) {
            InterfaceC26261i1 interfaceC26261i1 = (InterfaceC26261i1) it.next();
            UGCVideo uGCVideo = interfaceC26261i1 instanceof UGCVideo ? (UGCVideo) interfaceC26261i1 : null;
            if (uGCVideo != null) {
                arrayList.add(uGCVideo);
            }
        }
        if (arrayList.isEmpty()) {
            C26866a.a.m104898f(C26866a.f81698a, "UGCVideoDialogPlayListFragment", "syncTabDataToDetailPlayList: No UGCVideo items, skipping sync", false, 4, null);
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "UGCVideoDialogPlayListFragment", "syncTabDataToDetailPlayList: Syncing " + arrayList.size() + " items from tab[" + this.tabStartPosition + "-" + this.tabEndPosition + "] to detail play list via ViewModel for video " + clickedVideoId, false, 4, null);
        m83978v0().m84286i0(arrayList, clickedVideoId);
    }

    /* JADX INFO: renamed from: M0 */
    private final void m83964M0() {
        List<Object> listL;
        int playListPosition;
        C27942g c27942gM36203o0;
        C27942g c27942gM36203o1;
        C27942g c27942gM36203o2;
        String str = (String) m83978v0().m84257B().m14847f();
        if (str == null) {
            return;
        }
        C20149g c20149g = this.playListAdapter;
        if (c20149g == null || (listL = c20149g.getData()) == null) {
            listL = CollectionsKt.m97506l();
        }
        InterfaceC26261i1 interfaceC26261i1 = (InterfaceC26261i1) CollectionsKt.m97361k0(listL);
        if (interfaceC26261i1 != null) {
            playListPosition = interfaceC26261i1 instanceof UGCVideo ? ((UGCVideo) interfaceC26261i1).getPlayListPosition() : 0;
        } else {
            playListPosition = this.tabStartPosition;
        }
        if (playListPosition <= this.tabStartPosition) {
            C20149g c20149g2 = this.playListAdapter;
            if (c20149g2 != null && (c27942gM36203o2 = c20149g2.m36203o0()) != null) {
                c27942gM36203o2.m108677d(false);
            }
            C26866a.a.m104898f(C26866a.f81698a, "UGCVideoDialogPlayListFragment", "upFetchData: reached tab start position " + this.tabStartPosition + ", stop loading", false, 4, null);
            return;
        }
        if (playListPosition <= 1) {
            C20149g c20149g3 = this.playListAdapter;
            if (c20149g3 == null || (c27942gM36203o1 = c20149g3.m36203o0()) == null) {
                return;
            }
            c27942gM36203o1.m108677d(false);
            return;
        }
        C20149g c20149g4 = this.playListAdapter;
        if (c20149g4 != null && (c27942gM36203o0 = c20149g4.m36203o0()) != null) {
            c27942gM36203o0.m108678e(true);
        }
        int i11 = playListPosition - 1;
        int iMax = Math.max(playListPosition - 9, this.tabStartPosition);
        C26866a.a.m104898f(C26866a.f81698a, "UGCVideoDialogPlayListFragment", "upFetchData: tabIndex=" + this.tabIndex + ", startPosition=" + iMax + ", endPosition=" + i11 + ", tabRange=[" + this.tabStartPosition + "-" + this.tabEndPosition + "]", false, 4, null);
        m83978v0().m84276X(str, iMax, i11, false);
    }

    /* JADX INFO: renamed from: N0 */
    private final void m83965N0(boolean isLoadDown, List items, UGCVideoList playList) {
        String str;
        C27942g c27942gM36203o0;
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        C27941f c27941fM36186h2;
        Pager pager;
        C20149g c20149g = this.playListAdapter;
        List<Object> data = c20149g != null ? c20149g.getData() : null;
        if ((data == null || data.isEmpty()) && (str = this.currentPlayingId) != null) {
            m83967P0(this, str, null, 2, null);
        }
        if (isLoadDown) {
            if ((playList == null || (pager = playList.getPager()) == null) ? false : Intrinsics.m97797c(pager.getHasMore(), Boolean.TRUE)) {
                C20149g c20149g2 = this.playListAdapter;
                if (c20149g2 != null && (c27941fM36186h2 = c20149g2.m36186h0()) != null) {
                    c27941fM36186h2.m108667s();
                }
            } else {
                C20149g c20149g3 = this.playListAdapter;
                if (c20149g3 != null && (c27941fM36186h1 = c20149g3.m36186h0()) != null) {
                    C27941f.m108652u(c27941fM36186h1, false, 1, null);
                }
                C20149g c20149g4 = this.playListAdapter;
                if (c20149g4 != null && (c27941fM36186h0 = c20149g4.m36186h0()) != null) {
                    c27941fM36186h0.m108673z(false);
                }
            }
            C20149g c20149g5 = this.playListAdapter;
            if (c20149g5 != null) {
                c20149g5.mo36208q(items);
            }
        } else {
            C20149g c20149g6 = this.playListAdapter;
            if (c20149g6 != null) {
                c20149g6.mo36202o(0, items);
            }
            C20149g c20149g7 = this.playListAdapter;
            if (c20149g7 != null && (c27942gM36203o0 = c20149g7.m36203o0()) != null) {
                c27942gM36203o0.m108678e(false);
            }
        }
        if (!items.isEmpty()) {
            hideLoading();
        }
        if (this.videoPlayFrom == UGCVideoPlayFrom.ON_LINE_VIDEO) {
            ArrayList arrayList = new ArrayList();
            Iterator it = items.iterator();
            while (it.hasNext()) {
                InterfaceC26261i1 interfaceC26261i1 = (InterfaceC26261i1) it.next();
                UGCVideo uGCVideo = interfaceC26261i1 instanceof UGCVideo ? (UGCVideo) interfaceC26261i1 : null;
                if (uGCVideo != null) {
                    arrayList.add(uGCVideo);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            m83978v0().m84291u(arrayList, isLoadDown);
        }
    }

    /* JADX INFO: renamed from: O0 */
    private final void m83966O0(String videoId, String previousVideoId) {
        if (previousVideoId == null) {
            int i11 = C20221b.f64233a[this.videoPlayFrom.ordinal()];
            if (i11 == 1) {
                previousVideoId = this.currentPlayingId;
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                previousVideoId = m83978v0().m84260E();
            }
        }
        int i12 = C20221b.f64233a[this.videoPlayFrom.ordinal()];
        if (i12 == 1) {
            m83977t0().m84221f().mo14858q(videoId);
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            m83978v0().m84283f0(videoId);
        }
        this.currentPlayingId = videoId;
        C20149g c20149g = this.playListAdapter;
        if (c20149g != null) {
            c20149g.m83614E1(videoId, previousVideoId);
        }
    }

    /* JADX INFO: renamed from: P0 */
    static /* synthetic */ void m83967P0(UGCVideoDialogPlayListFragment uGCVideoDialogPlayListFragment, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        uGCVideoDialogPlayListFragment.m83966O0(str, str2);
    }

    private final void hideLoading() {
        ProgressBar progressBar;
        C28452l mViewBinding = getMViewBinding();
        if (mViewBinding == null || (progressBar = mViewBinding.f87357b) == null) {
            return;
        }
        AbstractC26006c.m102054g(progressBar);
    }

    private final void initExposureHelper() {
        if (this.videoPlayFrom != UGCVideoPlayFrom.ON_LINE_VIDEO || getMViewBinding() == null) {
            return;
        }
        Fragment parentFragment = getParentFragment();
        UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment = parentFragment instanceof UGCVideoDetailBaseFragment ? (UGCVideoDetailBaseFragment) parentFragment : null;
        C20316g c20316g = C20316g.f64409a;
        C28452l mViewBinding = getMViewBinding();
        Intrinsics.m97799e(mViewBinding);
        RecyclerView recyclerView = mViewBinding.f87358c;
        Intrinsics.m97801g(recyclerView, "recyclerView");
        this.exposureHelper = c20316g.m84099a(recyclerView, m83978v0(), this.pageName, new Function1() { // from class: com.transsion.ugcvideodetail.fragment.n1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UGCVideoDialogPlayListFragment.m83981y0(this.f64296a, ((Integer) obj).intValue());
            }
        }, (128 & 16) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null, (128 & 32) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousTrackId() : null, (128 & 64) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousPageVideoId() : null, (128 & 128) != 0 ? null : null);
    }

    private final void showLoading() {
        ProgressBar progressBar;
        C28452l mViewBinding = getMViewBinding();
        if (mViewBinding == null || (progressBar = mViewBinding.f87357b) == null) {
            return;
        }
        AbstractC26006c.m102058k(progressBar);
    }

    /* JADX INFO: renamed from: t0 */
    private final UGCLocalVideoDetailViewModel m83977t0() {
        return (UGCLocalVideoDetailViewModel) this.localViewModel.getValue();
    }

    /* JADX INFO: renamed from: v0 */
    private final UGCVideoDetailViewModel m83978v0() {
        return (UGCVideoDetailViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: w0 */
    private final void m83979w0(boolean isLoadDown, boolean hasMore) {
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        C27941f c27941fM36186h2;
        if (isLoadDown) {
            if (hasMore) {
                C20149g c20149g = this.playListAdapter;
                if (c20149g == null || (c27941fM36186h2 = c20149g.m36186h0()) == null) {
                    return;
                }
                c27941fM36186h2.m108667s();
                return;
            }
            C26866a.a.m104908v(C26866a.f81698a, "UGCVideoDialogPlayListFragment", "handleLoadMoreState false", false, 4, null);
            C20149g c20149g2 = this.playListAdapter;
            if (c20149g2 != null && (c27941fM36186h1 = c20149g2.m36186h0()) != null) {
                C27941f.m108652u(c27941fM36186h1, false, 1, null);
            }
            C20149g c20149g3 = this.playListAdapter;
            if (c20149g3 == null || (c27941fM36186h0 = c20149g3.m36186h0()) == null) {
                return;
            }
            c27941fM36186h0.m108673z(false);
        }
    }

    /* JADX INFO: renamed from: x0 */
    private final void m83980x0(UGCVideoList playList) {
        List<Object> listL;
        List<UGCVideo> items = playList.getItems();
        if (items == null) {
            return;
        }
        C20149g c20149g = this.playListAdapter;
        if (c20149g == null || (listL = c20149g.getData()) == null) {
            listL = CollectionsKt.m97506l();
        }
        if (items.isEmpty()) {
            C26866a.a aVar = C26866a.f81698a;
            C26866a.a.m104908v(aVar, "UGCVideoDialogPlayListFragment", "handlePlayListData isEmpty", false, 4, null);
            if (!m83959G0(items)) {
                C26866a.a.m104898f(aVar, "UGCVideoDialogPlayListFragment", "handlePlayListData: Empty data not for current tab, ignoring", false, 4, null);
                return;
            }
            boolean isLoadDown = playList.getIsLoadDown();
            Pager pager = playList.getPager();
            m83979w0(isLoadDown, pager != null ? Intrinsics.m97797c(pager.getHasMore(), Boolean.TRUE) : false);
            return;
        }
        if (!m83959G0(items)) {
            C26866a.a.m104898f(C26866a.f81698a, "UGCVideoDialogPlayListFragment", "handlePlayListData: Data not for current tab (tab range: " + this.tabStartPosition + "-" + this.tabEndPosition + "), ignoring", false, 4, null);
            return;
        }
        C26866a.a aVar2 = C26866a.f81698a;
        UGCVideo uGCVideo = (UGCVideo) CollectionsKt.m97361k0(items);
        C26866a.a.m104908v(aVar2, "UGCVideoDialogPlayListFragment", "handlePlayListData playListPosition:" + (uGCVideo != null ? Integer.valueOf(uGCVideo.getPlayListPosition()) : null), false, 4, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            int iVideoUGCPosition = ((UGCVideo) obj).videoUGCPosition();
            int i11 = this.tabStartPosition;
            if (iVideoUGCPosition <= this.tabEndPosition && i11 <= iVideoUGCPosition) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            C26866a.a.m104908v(C26866a.f81698a, "UGCVideoDialogPlayListFragment", "当前 tab 没有新数据，只处理 loadmore 状态", false, 4, null);
            boolean isLoadDown2 = playList.getIsLoadDown();
            Pager pager2 = playList.getPager();
            m83979w0(isLoadDown2, pager2 != null ? Intrinsics.m97797c(pager2.getHasMore(), Boolean.TRUE) : false);
            return;
        }
        if (listL.isEmpty()) {
            m83965N0(playList.getIsLoadDown(), CollectionsKt.m97343U0(arrayList), playList);
            hideLoading();
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = listL.iterator();
        while (it.hasNext()) {
            String strVideoUGCId = ((InterfaceC26261i1) it.next()).videoUGCId();
            if (strVideoUGCId != null) {
                arrayList2.add(strVideoUGCId);
            }
        }
        Set setW0 = CollectionsKt.m97345W0(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!CollectionsKt.m97352b0(setW0, ((UGCVideo) obj2).videoUGCId())) {
                arrayList3.add(obj2);
            }
        }
        if (!arrayList3.isEmpty()) {
            m83965N0(playList.getIsLoadDown(), CollectionsKt.m97343U0(arrayList3), playList);
            hideLoading();
        } else {
            boolean isLoadDown3 = playList.getIsLoadDown();
            Pager pager3 = playList.getPager();
            m83979w0(isLoadDown3, pager3 != null ? Intrinsics.m97797c(pager3.getHasMore(), Boolean.TRUE) : false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final UGCVideo m83981y0(UGCVideoDialogPlayListFragment uGCVideoDialogPlayListFragment, int i11) {
        List<Object> data;
        C20149g c20149g = uGCVideoDialogPlayListFragment.playListAdapter;
        InterfaceC26261i1 interfaceC26261i1 = (c20149g == null || (data = c20149g.getData()) == null) ? null : (InterfaceC26261i1) CollectionsKt.m97362l0(data, i11);
        if (interfaceC26261i1 instanceof UGCVideo) {
            return (UGCVideo) interfaceC26261i1;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m83982z0(UGCVideoDialogPlayListFragment uGCVideoDialogPlayListFragment, C20149g c20149g, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        C20149g c20149g2;
        List<Object> data;
        InterfaceC26261i1 interfaceC26261i1;
        String strM84260E;
        String strM84260E2;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 2000L) || (c20149g2 = uGCVideoDialogPlayListFragment.playListAdapter) == null || (data = c20149g2.getData()) == null || (interfaceC26261i1 = (InterfaceC26261i1) CollectionsKt.m97362l0(data, i11)) == null) {
            return;
        }
        String strVideoUGCId = interfaceC26261i1.videoUGCId();
        UGCVideoPlayFrom uGCVideoPlayFrom = uGCVideoDialogPlayListFragment.videoPlayFrom;
        int[] iArr = C20221b.f64233a;
        int i12 = iArr[uGCVideoPlayFrom.ordinal()];
        if (i12 == 1) {
            strM84260E = uGCVideoDialogPlayListFragment.currentPlayingId;
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strM84260E = uGCVideoDialogPlayListFragment.m83978v0().m84260E();
        }
        if (!Intrinsics.m97797c(strVideoUGCId, strM84260E) || strVideoUGCId == null || strVideoUGCId.length() == 0) {
            Fragment parentFragment = uGCVideoDialogPlayListFragment.getParentFragment();
            UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment = parentFragment instanceof UGCVideoDetailBaseFragment ? (UGCVideoDetailBaseFragment) parentFragment : null;
            if (strM84260E != null && strM84260E.length() != 0 && uGCVideoDetailBaseFragment != null) {
                uGCVideoDetailBaseFragment.m83842M0();
            }
            int i13 = iArr[uGCVideoDialogPlayListFragment.videoPlayFrom.ordinal()];
            if (i13 == 1) {
                String strVideoResourceId = interfaceC26261i1.videoResourceId();
                if (strVideoResourceId != null) {
                    uGCVideoDialogPlayListFragment.m83977t0().m84222h(strVideoResourceId);
                }
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                UGCVideoDetailViewModel uGCVideoDetailViewModelM83978v0 = uGCVideoDialogPlayListFragment.m83978v0();
                String strVideoUGCId2 = interfaceC26261i1.videoUGCId();
                if (strVideoUGCId2 == null) {
                    strVideoUGCId2 = "";
                }
                uGCVideoDetailViewModelM83978v0.m84280c0(strVideoUGCId2, (String) uGCVideoDialogPlayListFragment.m83978v0().m84257B().m14847f());
                if (interfaceC26261i1 instanceof UGCVideo) {
                    C20316g.f64409a.m84100c((UGCVideo) interfaceC26261i1, i11, uGCVideoDialogPlayListFragment.pageName, uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null, uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousTrackId() : null, uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousPageVideoId() : null);
                }
            }
            int i14 = iArr[uGCVideoDialogPlayListFragment.videoPlayFrom.ordinal()];
            if (i14 == 1) {
                strM84260E2 = uGCVideoDialogPlayListFragment.currentPlayingId;
            } else {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                strM84260E2 = uGCVideoDialogPlayListFragment.m83978v0().m84260E();
            }
            c20149g.m83614E1(interfaceC26261i1.videoUGCId(), strM84260E2);
            String strVideoUGCId3 = interfaceC26261i1.videoUGCId();
            if (strVideoUGCId3 != null) {
                uGCVideoDialogPlayListFragment.m83960H0(strVideoUGCId3);
            }
            if (uGCVideoDialogPlayListFragment.videoPlayFrom == UGCVideoPlayFrom.ON_LINE_VIDEO) {
                uGCVideoDialogPlayListFragment.m83963L0(interfaceC26261i1.videoUGCId());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX INFO: renamed from: K0 */
    public final void m83983K0() {
        String ugcVideoId;
        List<Object> listL;
        int i11 = C20221b.f64233a[this.videoPlayFrom.ordinal()];
        if (i11 == 1) {
            DownloadBean downloadBean = (DownloadBean) m83977t0().m84223i().m14847f();
            if (downloadBean != null) {
                ugcVideoId = downloadBean.getUgcVideoId();
            } else {
                ugcVideoId = null;
            }
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            UGCVideo uGCVideo = (UGCVideo) m83978v0().m84261G().m14847f();
            if (uGCVideo != null) {
                ugcVideoId = uGCVideo.getUgcVideoId();
            } else {
                ugcVideoId = null;
            }
        }
        if (ugcVideoId == null || ugcVideoId.length() == 0) {
            return;
        }
        C20149g c20149g = this.playListAdapter;
        if (c20149g == null || (listL = c20149g.getData()) == null) {
            listL = CollectionsKt.m97506l();
        }
        if (listL.isEmpty()) {
            return;
        }
        List<Object> list = listL;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.m97797c(((InterfaceC26261i1) it.next()).videoUGCId(), ugcVideoId)) {
                m83967P0(this, ugcVideoId, null, 2, null);
                m83960H0(ugcVideoId);
                return;
            }
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        RecyclerView recyclerView;
        final C20149g c20149g = new C20149g(true);
        c20149g.m36227w1(new InterfaceC27566d() { // from class: com.transsion.ugcvideodetail.fragment.k1
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                UGCVideoDialogPlayListFragment.m83982z0(this.f64285a, c20149g, baseQuickAdapter, view, i11);
            }
        });
        if (this.videoPlayFrom == UGCVideoPlayFrom.ON_LINE_VIDEO) {
            c20149g.m36186h0().m108673z(true);
            c20149g.m36186h0().m108672y(true);
            c20149g.m36186h0().m108657E(3);
            c20149g.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.ugcvideodetail.fragment.l1
                @Override // p765s6.InterfaceC27568f
                /* JADX INFO: renamed from: a */
                public final void mo63874a() {
                    UGCVideoDialogPlayListFragment.m83953A0(this.f64290a);
                }
            });
            c20149g.m36203o0().m108677d(true);
            c20149g.m36203o0().m108676c(2);
            c20149g.m36203o0().m108675b(new InterfaceC27569g() { // from class: com.transsion.ugcvideodetail.fragment.m1
                @Override // p765s6.InterfaceC27569g
                /* JADX INFO: renamed from: a */
                public final void mo81168a() {
                    UGCVideoDialogPlayListFragment.m83954B0(this.f64293a);
                }
            });
        }
        this.playListAdapter = c20149g;
        C28452l mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView = mViewBinding.f87358c) != null) {
            recyclerView.setLayoutManager(new NpaLinearLayoutManager(requireContext()));
            recyclerView.setAdapter(this.playListAdapter);
        }
        initExposureHelper();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        int i11 = C20221b.f64233a[this.videoPlayFrom.ordinal()];
        if (i11 == 1) {
            m83977t0().m84225k().m14851j(this, new C20222c(new Function1() { // from class: com.transsion.ugcvideodetail.fragment.i1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UGCVideoDialogPlayListFragment.m83957E0(this.f64279a, (List) obj);
                }
            }));
            m83977t0().m84223i().m14851j(this, new C20222c(new Function1() { // from class: com.transsion.ugcvideodetail.fragment.j1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UGCVideoDialogPlayListFragment.m83958F0(this.f64282a, (DownloadBean) obj);
                }
            }));
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            m83978v0().m84258C().m14851j(this, new C20222c(new Function1() { // from class: com.transsion.ugcvideodetail.fragment.g1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UGCVideoDialogPlayListFragment.m83955C0(this.f64272a, (List) obj);
                }
            }));
            m83978v0().m84267M().m14851j(this, new C20222c(new Function1() { // from class: com.transsion.ugcvideodetail.fragment.h1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UGCVideoDialogPlayListFragment.m83956D0(this.f64276a, (UGCVideoList) obj);
                }
            }));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        C28117b c28117b;
        super.onHiddenChanged(hidden);
        if (!hidden || (c28117b = this.exposureHelper) == null) {
            return;
        }
        c28117b.m109195f();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C28117b c28117b = this.exposureHelper;
        if (c28117b != null) {
            c28117b.m109195f();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        Fragment parentFragment;
        super.receiveArguments();
        Bundle arguments = getArguments();
        this.tabIndex = arguments != null ? arguments.getInt("tab_index", 0) : 0;
        Bundle arguments2 = getArguments();
        this.tabStartPosition = arguments2 != null ? arguments2.getInt("tab_start_position", 1) : 1;
        Bundle arguments3 = getArguments();
        this.tabEndPosition = arguments3 != null ? arguments3.getInt("tab_end_position", 50) : 50;
        Bundle arguments4 = getArguments();
        int i11 = arguments4 != null ? arguments4.getInt("video_from") : UGCVideoPlayFrom.ON_LINE_VIDEO.getValue();
        UGCVideoPlayFrom uGCVideoPlayFrom = UGCVideoPlayFrom.ON_LINE_VIDEO;
        if (i11 != uGCVideoPlayFrom.getValue()) {
            uGCVideoPlayFrom = UGCVideoPlayFrom.LOCAL_VIDEO;
        }
        this.videoPlayFrom = uGCVideoPlayFrom;
        Fragment parentFragment2 = getParentFragment();
        String page_name = null;
        if (parentFragment2 != null && (parentFragment = parentFragment2.getParentFragment()) != null && (parentFragment instanceof UGCVideoDetailBaseFragment)) {
            page_name = ((UGCVideoDetailBaseFragment) parentFragment).getPAGE_NAME();
        }
        this.pageName = page_name;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }

    /* JADX INFO: renamed from: s0 */
    public final void m83984s0() {
        List<Object> listL;
        if (this.videoPlayFrom != UGCVideoPlayFrom.ON_LINE_VIDEO) {
            return;
        }
        C20149g c20149g = this.playListAdapter;
        if (c20149g == null || (listL = c20149g.getData()) == null) {
            listL = CollectionsKt.m97506l();
        }
        if (!listL.isEmpty()) {
            hideLoading();
            return;
        }
        List listL2 = (List) m83978v0().m84258C().m14847f();
        if (listL2 == null) {
            listL2 = CollectionsKt.m97506l();
        }
        List list = listL2;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int playListPosition = ((UGCVideo) it.next()).getPlayListPosition();
                int i11 = this.tabStartPosition;
                if (playListPosition <= this.tabEndPosition && i11 <= playListPosition) {
                    hideLoading();
                    return;
                }
            }
        }
        showLoading();
        String str = (String) m83978v0().m84257B().m14847f();
        if (str == null) {
            return;
        }
        int iMin = Math.min(this.tabStartPosition + 8, this.tabEndPosition);
        C26866a.a.m104898f(C26866a.f81698a, "UGCVideoDialogPlayListFragment", "checkAndLoadDataIfNeeded: tabIndex=" + this.tabIndex + ", requesting data range=[" + this.tabStartPosition + "-" + iMin + "]", false, 4, null);
        m83978v0().m84276X(str, this.tabStartPosition, iMin, true);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public C28452l getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28452l c28452lM109919c = C28452l.m109919c(inflater);
        Intrinsics.m97801g(c28452lM109919c, "inflate(...)");
        return c28452lM109919c;
    }
}
