package com.transsion.ugcvideodetail.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3233y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.therouter.router.Navigator;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.ugcvideodetail.adapter.C20144b;
import com.transsion.ugcvideodetail.api.UGCPageStyle;
import com.transsion.ugcvideodetail.api.bean.UGCImmVideo;
import com.transsion.ugcvideodetail.api.bean.UGCImmVideoContent;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.ugcvideodetail.hepler.C20316g;
import com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel;
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
import ng.AbstractC26006c;
import p743rh.C27287m;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p765s6.InterfaceC27569g;
import p801u6.C27941f;
import p801u6.C27942g;
import p840vj.C28117b;
import p850vv.AbstractC28228b;
import p885wv.C28452l;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 W2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J%\u0010\u000b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0018\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0015H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\u0004J\r\u0010%\u001a\u00020\u0005¢\u0006\u0004\b%\u0010\u0004J\r\u0010&\u001a\u00020\u0005¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010)\u001a\u00020\u0005H\u0016¢\u0006\u0004\b)\u0010\u0004J\u000f\u0010*\u001a\u00020\u0005H\u0016¢\u0006\u0004\b*\u0010\u0004J\u0017\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0015H\u0016¢\u0006\u0004\b,\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00106\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010JR\u0016\u0010O\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010JR\u0014\u0010Q\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010JR\u001c\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006X"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/fragment/UGCImmVideoDialogPlayListFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lwv/l;", "<init>", "()V", "", "showLoading", "hideLoading", "", "videoId", "previousVideoId", "I0", "(Ljava/lang/String;Ljava/lang/String;)V", "E0", "H0", "ugcVideoId", "C0", "(Ljava/lang/String;)V", "", "Lcom/transsion/ugcvideodetail/api/bean/UGCImmVideo;", "newList", "", "isLoadDown", "hasMore", "B0", "(Ljava/util/List;ZZ)V", "initExposureHelper", "Landroid/view/LayoutInflater;", "inflater", "t0", "(Landroid/view/LayoutInflater;)Lwv/l;", "getPageStateLayoutTitle", "()Ljava/lang/String;", "isAudioShowNoNetworkLayout", "()Z", "receiveArguments", "initViewData", "r0", "G0", "initViewModel", "initListener", "retryLoadData", "onPause", "hidden", "onHiddenChanged", "(Z)V", "Lcom/transsion/ugcvideodetail/viewmodel/UGCImmVideoDetailViewModel;", "a", "Lkotlin/Lazy;", "u0", "()Lcom/transsion/ugcvideodetail/viewmodel/UGCImmVideoDetailViewModel;", "viewModel", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "s0", "recVideoViewModel", "Lcom/transsion/ugcvideodetail/adapter/b;", "c", "Lcom/transsion/ugcvideodetail/adapter/b;", "playListAdapter", "Lvj/b;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lvj/b;", "exposureHelper", "e", "Ljava/lang/String;", "currentPlayingId", "f", "Z", "isCollectionList", "g", "Lcom/transsion/ugcvideodetail/api/bean/UGCImmVideo;", "curVideo", "", "h", "I", "tabIndex", "i", "tabStartPosition", "j", "tabEndPosition", CampaignEx.JSON_KEY_AD_K, "scrollOffset", "Landroidx/lifecycle/c0;", "Lcom/transsion/ugcvideodetail/api/bean/UGCImmVideoContent;", "l", "Landroidx/lifecycle/c0;", "playListObserver", "m", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCImmVideoDialogPlayListFragment extends PageStatusFragment<C28452l> {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy viewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(UGCImmVideoDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.ugcvideodetail.fragment.UGCImmVideoDialogPlayListFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.ugcvideodetail.fragment.UGCImmVideoDialogPlayListFragment$special$$inlined$activityViewModels$default$2
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
    private final Lazy recVideoViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C20144b playListAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C28117b exposureHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String currentPlayingId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isCollectionList;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private UGCImmVideo curVideo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int tabIndex;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int tabStartPosition;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int tabEndPosition;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int scrollOffset;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC3189c0 playListObserver;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCImmVideoDialogPlayListFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final UGCImmVideoDialogPlayListFragment m83757a(boolean z11, int i11, int i12, int i13) {
            UGCImmVideoDialogPlayListFragment uGCImmVideoDialogPlayListFragment = new UGCImmVideoDialogPlayListFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("ISC_COLLECTION_LIST", z11);
            bundle.putInt("tab_index", i11);
            bundle.putInt("tab_start_position", i12);
            bundle.putInt("tab_end_position", i13);
            uGCImmVideoDialogPlayListFragment.setArguments(bundle);
            return uGCImmVideoDialogPlayListFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCImmVideoDialogPlayListFragment$b */
    static final class C20181b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f64137a;

        C20181b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f64137a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f64137a;
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
            this.f64137a.invoke(obj);
        }
    }

    public UGCImmVideoDialogPlayListFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.ugcvideodetail.fragment.UGCImmVideoDialogPlayListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.recVideoViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(UGCImmVideoDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.ugcvideodetail.fragment.UGCImmVideoDialogPlayListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.ugcvideodetail.fragment.UGCImmVideoDialogPlayListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                Object objInvoke = function0.invoke();
                InterfaceC3208m interfaceC3208m = objInvoke instanceof InterfaceC3208m ? (InterfaceC3208m) objInvoke : null;
                C3227v0.c defaultViewModelProviderFactory = interfaceC3208m != null ? interfaceC3208m.getDefaultViewModelProviderFactory() : null;
                if (defaultViewModelProviderFactory == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.m97801g(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.isCollectionList = true;
        this.tabStartPosition = 1;
        this.tabEndPosition = 50;
        this.scrollOffset = (AbstractC5806y.m27489e() / 2) - AbstractC23384a.m92908b(80);
        this.playListObserver = new InterfaceC3189c0() { // from class: com.transsion.ugcvideodetail.fragment.m
            @Override // androidx.p1004lifecycle.InterfaceC3189c0
            public final void onChanged(Object obj) {
                UGCImmVideoDialogPlayListFragment.m83735F0(this.f64291a, (UGCImmVideoContent) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final Unit m83730A0(UGCImmVideoDialogPlayListFragment uGCImmVideoDialogPlayListFragment, String str) {
        if (str != null && str.length() != 0) {
            m83738J0(uGCImmVideoDialogPlayListFragment, str, null, 2, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: B0 */
    private final void m83731B0(List newList, boolean isLoadDown, boolean hasMore) {
        int iVideoUGCPosition;
        UGCVideo ugcVideo;
        C20144b c20144b = this.playListAdapter;
        if (c20144b == null) {
            return;
        }
        List<Object> data = c20144b.getData();
        if (data.isEmpty()) {
            c20144b.mo36201n1(CollectionsKt.m97343U0(newList));
            if (!isLoadDown) {
                c20144b.m36203o0().m108678e(false);
                return;
            } else if (hasMore) {
                c20144b.m36186h0().m108667s();
                return;
            } else {
                C27941f.m108652u(c20144b.m36186h0(), false, 1, null);
                c20144b.m36186h0().m108673z(false);
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            UGCVideo ugcVideo2 = ((UGCImmVideo) it.next()).getUgcVideo();
            Integer numValueOf = ugcVideo2 != null ? Integer.valueOf(ugcVideo2.videoUGCPosition()) : null;
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
        }
        Set setW0 = CollectionsKt.m97345W0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = newList.iterator();
        while (true) {
            iVideoUGCPosition = -1;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            UGCVideo ugcVideo3 = ((UGCImmVideo) next).getUgcVideo();
            iVideoUGCPosition = ugcVideo3 != null ? ugcVideo3.videoUGCPosition() : -1;
            if (iVideoUGCPosition > 0 && !setW0.contains(Integer.valueOf(iVideoUGCPosition))) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            if (!isLoadDown) {
                c20144b.m36203o0().m108678e(false);
                return;
            } else if (hasMore) {
                c20144b.m36186h0().m108667s();
                return;
            } else {
                C27941f.m108652u(c20144b.m36186h0(), false, 1, null);
                c20144b.m36186h0().m108673z(false);
                return;
            }
        }
        if (isLoadDown) {
            c20144b.mo36208q(arrayList2);
        } else {
            c20144b.mo36202o(0, arrayList2);
        }
        if (!isLoadDown) {
            c20144b.m36203o0().m108678e(false);
        } else if (hasMore) {
            c20144b.m36186h0().m108667s();
        } else {
            C27941f.m108652u(c20144b.m36186h0(), false, 1, null);
            c20144b.m36186h0().m108673z(false);
        }
        UGCImmVideo uGCImmVideo = (UGCImmVideo) CollectionsKt.m97361k0(c20144b.getData());
        if (uGCImmVideo != null && (ugcVideo = uGCImmVideo.getUgcVideo()) != null) {
            iVideoUGCPosition = ugcVideo.videoUGCPosition();
        }
        if (iVideoUGCPosition > 1) {
            c20144b.m36203o0().m108677d(true);
        }
        C26866a.a.m104898f(C26866a.f81698a, "UGCImmVideoDialogPlayListFragment", "insertCollectionList: isLoadDown=" + isLoadDown + ", inserted=" + arrayList2.size() + ", adapterSize=" + c20144b.getData().size() + ", firstPosition=" + iVideoUGCPosition, false, 4, null);
    }

    /* JADX INFO: renamed from: C0 */
    private final void m83732C0(final String ugcVideoId) {
        C28452l mViewBinding;
        RecyclerView recyclerView;
        if (ugcVideoId == null || ugcVideoId.length() == 0 || getMViewBinding() == null || this.playListAdapter == null || (mViewBinding = getMViewBinding()) == null || (recyclerView = mViewBinding.f87358c) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: com.transsion.ugcvideodetail.fragment.t
            @Override // java.lang.Runnable
            public final void run() {
                UGCImmVideoDialogPlayListFragment.m83733D0(this.f64314a, ugcVideoId);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final void m83733D0(UGCImmVideoDialogPlayListFragment uGCImmVideoDialogPlayListFragment, String str) {
        RecyclerView recyclerView;
        List<Object> data;
        List<Object> data2;
        C20144b c20144b = uGCImmVideoDialogPlayListFragment.playListAdapter;
        int i11 = -1;
        Unit unit = null;
        if (c20144b != null && (data2 = c20144b.getData()) != null) {
            Iterator<Object> it = data2.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                UGCVideo ugcVideo = ((UGCImmVideo) it.next()).getUgcVideo();
                if (Intrinsics.m97797c(ugcVideo != null ? ugcVideo.videoUGCId() : null, str)) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
        }
        C26866a.a aVar = C26866a.f81698a;
        C20144b c20144b2 = uGCImmVideoDialogPlayListFragment.playListAdapter;
        C26866a.a.m104898f(aVar, "UGCImmVideoDialogPlayListFragment", "listScrollToPosition id:" + str + ", position:" + i11 + ", dataSize:" + ((c20144b2 == null || (data = c20144b2.getData()) == null) ? 0 : data.size()), false, 4, null);
        if (i11 < 0) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            C28452l mViewBinding = uGCImmVideoDialogPlayListFragment.getMViewBinding();
            RecyclerView.AbstractC4214m layoutManager = (mViewBinding == null || (recyclerView = mViewBinding.f87358c) == null) ? null : recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                int i13 = uGCImmVideoDialogPlayListFragment.scrollOffset;
                linearLayoutManager.scrollToPositionWithOffset(i11, i13 > 0 ? i13 : 0);
                unit = Unit.f75682a;
            }
            Result.m112707constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: E0 */
    private final void m83734E0() {
        UGCVideo ugcVideo;
        UGCVideoBelongToCollection belongToCollection;
        String collectionId;
        List<Object> listL;
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        UGCVideo ugcVideo2;
        UGCImmVideo uGCImmVideo = this.curVideo;
        if (uGCImmVideo == null || (ugcVideo = uGCImmVideo.getUgcVideo()) == null || (belongToCollection = ugcVideo.getBelongToCollection()) == null || (collectionId = belongToCollection.getCollectionId()) == null) {
            return;
        }
        C20144b c20144b = this.playListAdapter;
        if (c20144b == null || (listL = c20144b.getData()) == null) {
            listL = CollectionsKt.m97506l();
        }
        UGCImmVideo uGCImmVideo2 = (UGCImmVideo) CollectionsKt.m97372v0(listL);
        int iVideoUGCPosition = (uGCImmVideo2 == null || (ugcVideo2 = uGCImmVideo2.getUgcVideo()) == null) ? this.tabStartPosition - 1 : ugcVideo2.videoUGCPosition();
        int i11 = this.tabEndPosition;
        if (iVideoUGCPosition >= i11) {
            C20144b c20144b2 = this.playListAdapter;
            if (c20144b2 != null && (c27941fM36186h1 = c20144b2.m36186h0()) != null) {
                C27941f.m108652u(c27941fM36186h1, false, 1, null);
            }
            C20144b c20144b3 = this.playListAdapter;
            if (c20144b3 != null && (c27941fM36186h0 = c20144b3.m36186h0()) != null) {
                c27941fM36186h0.m108673z(false);
            }
            C26866a.a.m104898f(C26866a.f81698a, "UGCImmVideoDialogPlayListFragment", "loadMoreData: reached tab end position " + this.tabEndPosition + ", stop loading", false, 4, null);
            return;
        }
        int i12 = iVideoUGCPosition + 1;
        int iMin = Math.min(iVideoUGCPosition + 9, i11);
        C26866a.a.m104898f(C26866a.f81698a, "UGCImmVideoDialogPlayListFragment", "loadMoreData: tabIndex=" + this.tabIndex + ", startPosition=" + i12 + ", endPosition=" + iMin + ", tabRange=[" + this.tabStartPosition + "-" + this.tabEndPosition + "]", false, 4, null);
        if (this.isCollectionList) {
            UGCImmVideoDetailViewModel.m84170Q0(m83748u0(), collectionId, this.tabStartPosition, iMin, true, false, 16, null);
        } else {
            m83747s0().m84195P0(collectionId, this.tabStartPosition, iMin, true, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX INFO: renamed from: F0 */
    public static final void m83735F0(UGCImmVideoDialogPlayListFragment uGCImmVideoDialogPlayListFragment, UGCImmVideoContent uGCImmVideoContent) {
        boolean z11;
        UGCVideo ugcVideo;
        uGCImmVideoDialogPlayListFragment.hideLoading();
        List<UGCImmVideo> list = uGCImmVideoContent != null ? uGCImmVideoContent.getList() : null;
        List<UGCImmVideo> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        UGCImmVideo uGCImmVideo = (UGCImmVideo) CollectionsKt.m97361k0(list);
        if (uGCImmVideo == null || !uGCImmVideo.getIsCollectionList()) {
            UGCImmVideo uGCImmVideo2 = (UGCImmVideo) CollectionsKt.m97361k0(list);
            if (((uGCImmVideo2 == null || (ugcVideo = uGCImmVideo2.getUgcVideo()) == null) ? -1 : ugcVideo.videoUGCPosition()) != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = true;
        }
        if (z11) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                UGCVideo ugcVideo2 = ((UGCImmVideo) obj).getUgcVideo();
                int iVideoUGCPosition = ugcVideo2 != null ? ugcVideo2.videoUGCPosition() : -1;
                if (iVideoUGCPosition <= uGCImmVideoDialogPlayListFragment.tabEndPosition && uGCImmVideoDialogPlayListFragment.tabStartPosition <= iVideoUGCPosition) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean zIsLoadDown = uGCImmVideoContent.isLoadDown();
            Pager pager = uGCImmVideoContent.getPager();
            uGCImmVideoDialogPlayListFragment.m83731B0(arrayList, zIsLoadDown, pager != null ? Intrinsics.m97797c(pager.getHasMore(), Boolean.TRUE) : false);
        }
    }

    /* JADX INFO: renamed from: H0 */
    private final void m83736H0() {
        UGCVideo ugcVideo;
        UGCVideoBelongToCollection belongToCollection;
        String collectionId;
        List<Object> listL;
        C27942g c27942gM36203o0;
        C27942g c27942gM36203o1;
        C27942g c27942gM36203o2;
        UGCVideo ugcVideo2;
        UGCImmVideo uGCImmVideo = this.curVideo;
        if (uGCImmVideo == null || (ugcVideo = uGCImmVideo.getUgcVideo()) == null || (belongToCollection = ugcVideo.getBelongToCollection()) == null || (collectionId = belongToCollection.getCollectionId()) == null) {
            return;
        }
        C20144b c20144b = this.playListAdapter;
        if (c20144b == null || (listL = c20144b.getData()) == null) {
            listL = CollectionsKt.m97506l();
        }
        UGCImmVideo uGCImmVideo2 = (UGCImmVideo) CollectionsKt.m97361k0(listL);
        int iVideoUGCPosition = (uGCImmVideo2 == null || (ugcVideo2 = uGCImmVideo2.getUgcVideo()) == null) ? this.tabStartPosition : ugcVideo2.videoUGCPosition();
        if (iVideoUGCPosition <= this.tabStartPosition) {
            C20144b c20144b2 = this.playListAdapter;
            if (c20144b2 != null && (c27942gM36203o2 = c20144b2.m36203o0()) != null) {
                c27942gM36203o2.m108677d(false);
            }
            C26866a.a.m104898f(C26866a.f81698a, "UGCImmVideoDialogPlayListFragment", "upFetchData: reached tab start position " + this.tabStartPosition + ", stop loading", false, 4, null);
            return;
        }
        if (iVideoUGCPosition <= 1) {
            C20144b c20144b3 = this.playListAdapter;
            if (c20144b3 == null || (c27942gM36203o1 = c20144b3.m36203o0()) == null) {
                return;
            }
            c27942gM36203o1.m108677d(false);
            return;
        }
        C20144b c20144b4 = this.playListAdapter;
        if (c20144b4 != null && (c27942gM36203o0 = c20144b4.m36203o0()) != null) {
            c27942gM36203o0.m108678e(true);
        }
        int i11 = iVideoUGCPosition - 1;
        int iMax = Math.max(iVideoUGCPosition - 9, this.tabStartPosition);
        C26866a.a.m104898f(C26866a.f81698a, "UGCImmVideoDialogPlayListFragment", "upFetchData: tabIndex=" + this.tabIndex + ", startPosition=" + iMax + ", endPosition=" + i11 + ", tabRange=[" + this.tabStartPosition + "-" + this.tabEndPosition + "]", false, 4, null);
        if (this.isCollectionList) {
            UGCImmVideoDetailViewModel.m84170Q0(m83748u0(), collectionId, this.tabStartPosition, i11, true, false, 16, null);
        } else {
            m83747s0().m84195P0(collectionId, this.tabStartPosition, i11, true, true);
        }
    }

    /* JADX INFO: renamed from: I0 */
    private final void m83737I0(String videoId, String previousVideoId) {
        this.currentPlayingId = videoId;
        C20144b c20144b = this.playListAdapter;
        if (c20144b != null) {
            if (previousVideoId == null) {
                previousVideoId = videoId;
            }
            c20144b.m83598E1(videoId, previousVideoId);
        }
    }

    /* JADX INFO: renamed from: J0 */
    static /* synthetic */ void m83738J0(UGCImmVideoDialogPlayListFragment uGCImmVideoDialogPlayListFragment, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        uGCImmVideoDialogPlayListFragment.m83737I0(str, str2);
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
        C20316g c20316g = C20316g.f64409a;
        C28452l mViewBinding = getMViewBinding();
        Intrinsics.m97799e(mViewBinding);
        RecyclerView recyclerView = mViewBinding.f87358c;
        Intrinsics.m97801g(recyclerView, "recyclerView");
        this.exposureHelper = c20316g.m84099a(recyclerView, m83748u0(), "/ugc_video/immersive_detail", new Function1() { // from class: com.transsion.ugcvideodetail.fragment.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UGCImmVideoDialogPlayListFragment.m83749v0(this.f64308a, ((Integer) obj).intValue());
            }
        }, m83748u0().m84274T(), m83748u0().m84270P(), m83748u0().m84269O(), Boolean.valueOf(m83748u0().m84203Y0()));
    }

    /* JADX INFO: renamed from: s0 */
    private final UGCImmVideoDetailViewModel m83747s0() {
        return (UGCImmVideoDetailViewModel) this.recVideoViewModel.getValue();
    }

    private final void showLoading() {
        ProgressBar progressBar;
        C28452l mViewBinding = getMViewBinding();
        if (mViewBinding == null || (progressBar = mViewBinding.f87357b) == null) {
            return;
        }
        AbstractC26006c.m102058k(progressBar);
    }

    /* JADX INFO: renamed from: u0 */
    private final UGCImmVideoDetailViewModel m83748u0() {
        return (UGCImmVideoDetailViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final UGCVideo m83749v0(UGCImmVideoDialogPlayListFragment uGCImmVideoDialogPlayListFragment, int i11) {
        List<Object> data;
        UGCImmVideo uGCImmVideo;
        C20144b c20144b = uGCImmVideoDialogPlayListFragment.playListAdapter;
        if (c20144b == null || (data = c20144b.getData()) == null || (uGCImmVideo = (UGCImmVideo) CollectionsKt.m97362l0(data, i11)) == null) {
            return null;
        }
        return uGCImmVideo.getUgcVideo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m83750w0(final UGCImmVideoDialogPlayListFragment uGCImmVideoDialogPlayListFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        C20144b c20144b;
        List<Object> data;
        UGCImmVideo uGCImmVideo;
        UGCVideo ugcVideo;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 2000L) || (c20144b = uGCImmVideoDialogPlayListFragment.playListAdapter) == null || (data = c20144b.getData()) == null || (uGCImmVideo = (UGCImmVideo) CollectionsKt.m97362l0(data, i11)) == null) {
            return;
        }
        UGCVideo ugcVideo2 = uGCImmVideo.getUgcVideo();
        String strVideoUGCId = ugcVideo2 != null ? ugcVideo2.videoUGCId() : null;
        UGCImmVideo uGCImmVideo2 = uGCImmVideoDialogPlayListFragment.curVideo;
        if (!Intrinsics.m97797c(strVideoUGCId, (uGCImmVideo2 == null || (ugcVideo = uGCImmVideo2.getUgcVideo()) == null) ? null : ugcVideo.getUgcVideoId()) || strVideoUGCId == null || strVideoUGCId.length() == 0) {
            UGCVideo ugcVideo3 = uGCImmVideo.getUgcVideo();
            if (ugcVideo3 != null) {
                C20316g.f64409a.m84100c(ugcVideo3, i11, "/ugc_video/immersive_detail", uGCImmVideoDialogPlayListFragment.m83748u0().m84274T(), uGCImmVideoDialogPlayListFragment.m83748u0().m84270P(), uGCImmVideoDialogPlayListFragment.m83748u0().m84269O());
            }
            if (uGCImmVideoDialogPlayListFragment.isCollectionList) {
                C3187b0 c3187b0M84194O0 = uGCImmVideoDialogPlayListFragment.m83748u0().m84194O0();
                UGCVideo ugcVideo4 = uGCImmVideo.getUgcVideo();
                c3187b0M84194O0.mo14858q(ugcVideo4 != null ? Integer.valueOf(ugcVideo4.videoUGCPosition()) : null);
            } else {
                UGCVideo ugcVideo5 = uGCImmVideo.getUgcVideo();
                if (ugcVideo5 != null) {
                    AbstractC28228b.m109412a(ugcVideo5, new Function1() { // from class: com.transsion.ugcvideodetail.fragment.s
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return UGCImmVideoDialogPlayListFragment.m83751x0(this.f64311a, (Navigator) obj);
                        }
                    });
                }
            }
            if (strVideoUGCId != null) {
                uGCImmVideoDialogPlayListFragment.m83732C0(strVideoUGCId);
            }
            Fragment parentFragment = uGCImmVideoDialogPlayListFragment.getParentFragment();
            BaseDialog baseDialog = parentFragment instanceof BaseDialog ? (BaseDialog) parentFragment : null;
            if (baseDialog != null) {
                baseDialog.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final Navigator m83751x0(UGCImmVideoDialogPlayListFragment uGCImmVideoDialogPlayListFragment, Navigator navigator) {
        Intrinsics.m97802h(navigator, "navigator");
        return navigator.m61857K("parent_video_id", (String) uGCImmVideoDialogPlayListFragment.m83748u0().m84259D().m14847f()).m61857K("parent_track_id", uGCImmVideoDialogPlayListFragment.m83748u0().m84274T()).m61857K("videoStyle", UGCPageStyle.UGC_PAGE_STYLE_IMM_VERTICAL_VIDEO.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m83752y0(UGCImmVideoDialogPlayListFragment uGCImmVideoDialogPlayListFragment) {
        uGCImmVideoDialogPlayListFragment.m83734E0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m83753z0(UGCImmVideoDialogPlayListFragment uGCImmVideoDialogPlayListFragment) {
        if (C27287m.f83003a.m106330e()) {
            uGCImmVideoDialogPlayListFragment.m83736H0();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m83754G0() {
        UGCVideo ugcVideo;
        String ugcVideoId;
        List<Object> listL;
        UGCImmVideo uGCImmVideo = this.curVideo;
        if (uGCImmVideo == null || (ugcVideo = uGCImmVideo.getUgcVideo()) == null || (ugcVideoId = ugcVideo.getUgcVideoId()) == null) {
            return;
        }
        C20144b c20144b = this.playListAdapter;
        if (c20144b == null || (listL = c20144b.getData()) == null) {
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
            UGCVideo ugcVideo2 = ((UGCImmVideo) it.next()).getUgcVideo();
            if (Intrinsics.m97797c(ugcVideo2 != null ? ugcVideo2.videoUGCId() : null, ugcVideoId)) {
                m83738J0(this, ugcVideoId, null, 2, null);
                m83732C0(ugcVideoId);
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
        this.curVideo = (UGCImmVideo) m83748u0().m84191L0().m14847f();
        C20144b c20144b = new C20144b(true);
        c20144b.m36227w1(new InterfaceC27566d() { // from class: com.transsion.ugcvideodetail.fragment.n
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                UGCImmVideoDialogPlayListFragment.m83750w0(this.f64294a, baseQuickAdapter, view, i11);
            }
        });
        c20144b.m36186h0().m108673z(true);
        c20144b.m36186h0().m108672y(true);
        c20144b.m36186h0().m108657E(3);
        c20144b.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.ugcvideodetail.fragment.o
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                UGCImmVideoDialogPlayListFragment.m83752y0(this.f64297a);
            }
        });
        c20144b.m36203o0().m108677d(true);
        c20144b.m36203o0().m108676c(2);
        c20144b.m36203o0().m108675b(new InterfaceC27569g() { // from class: com.transsion.ugcvideodetail.fragment.p
            @Override // p765s6.InterfaceC27569g
            /* JADX INFO: renamed from: a */
            public final void mo81168a() {
                UGCImmVideoDialogPlayListFragment.m83753z0(this.f64301a);
            }
        });
        this.playListAdapter = c20144b;
        C28452l mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView = mViewBinding.f87358c) != null) {
            recyclerView.setLayoutManager(new NpaLinearLayoutManager(requireContext()));
            recyclerView.setAdapter(this.playListAdapter);
        }
        initExposureHelper();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        if (!this.isCollectionList) {
            m83747s0().m84196R0().m14851j(this, this.playListObserver);
            return;
        }
        List list = (List) m83748u0().m84187H0().m14847f();
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                UGCVideo ugcVideo = ((UGCImmVideo) obj).getUgcVideo();
                int iVideoUGCPosition = ugcVideo != null ? ugcVideo.videoUGCPosition() : -1;
                int i11 = this.tabStartPosition;
                if (iVideoUGCPosition <= this.tabEndPosition && i11 <= iVideoUGCPosition) {
                    arrayList.add(obj);
                }
            }
            C20144b c20144b = this.playListAdapter;
            List<Object> data = c20144b != null ? c20144b.getData() : null;
            if ((data == null || data.isEmpty()) && !arrayList.isEmpty()) {
                C20144b c20144b2 = this.playListAdapter;
                if (c20144b2 != null) {
                    c20144b2.mo36201n1(CollectionsKt.m97343U0(arrayList));
                }
                String str = (String) m83748u0().m84259D().m14847f();
                if (str != null) {
                    m83738J0(this, str, null, 2, null);
                    m83732C0(str);
                }
                hideLoading();
            }
        }
        m83748u0().m84196R0().m14851j(this, this.playListObserver);
        m83748u0().m84259D().m14851j(this, new C20181b(new Function1() { // from class: com.transsion.ugcvideodetail.fragment.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return UGCImmVideoDialogPlayListFragment.m83730A0(this.f64304a, (String) obj2);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
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

    /* JADX INFO: renamed from: r0 */
    public final void m83755r0() {
        List<Object> listL;
        UGCVideo ugcVideo;
        UGCVideoBelongToCollection belongToCollection;
        String collectionId;
        C20144b c20144b = this.playListAdapter;
        if (c20144b == null || (listL = c20144b.getData()) == null) {
            listL = CollectionsKt.m97506l();
        }
        if (!listL.isEmpty()) {
            hideLoading();
            return;
        }
        if (this.isCollectionList) {
            List listL2 = (List) m83748u0().m84187H0().m14847f();
            if (listL2 == null) {
                listL2 = CollectionsKt.m97506l();
            }
            List list = listL2;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    UGCVideo ugcVideo2 = ((UGCImmVideo) it.next()).getUgcVideo();
                    int iVideoUGCPosition = ugcVideo2 != null ? ugcVideo2.videoUGCPosition() : -1;
                    int i11 = this.tabStartPosition;
                    if (iVideoUGCPosition <= this.tabEndPosition && i11 <= iVideoUGCPosition) {
                        hideLoading();
                        return;
                    }
                }
            }
        }
        showLoading();
        UGCImmVideo uGCImmVideo = this.curVideo;
        if (uGCImmVideo == null || (ugcVideo = uGCImmVideo.getUgcVideo()) == null || (belongToCollection = ugcVideo.getBelongToCollection()) == null || (collectionId = belongToCollection.getCollectionId()) == null) {
            return;
        }
        int iMin = Math.min(this.tabStartPosition + 8, this.tabEndPosition);
        C26866a.a.m104898f(C26866a.f81698a, "UGCImmVideoDialogPlayListFragment", "checkAndLoadDataIfNeeded: tabIndex=" + this.tabIndex + ", requesting data range=[" + this.tabStartPosition + "-" + iMin + "]", false, 4, null);
        if (this.isCollectionList) {
            UGCImmVideoDetailViewModel.m84170Q0(m83748u0(), collectionId, this.tabStartPosition, iMin, true, false, 16, null);
        } else {
            m83747s0().m84195P0(collectionId, this.tabStartPosition, iMin, true, true);
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        super.receiveArguments();
        Bundle arguments = getArguments();
        this.isCollectionList = arguments != null ? arguments.getBoolean("ISC_COLLECTION_LIST", true) : true;
        Bundle arguments2 = getArguments();
        this.tabIndex = arguments2 != null ? arguments2.getInt("tab_index", 0) : 0;
        Bundle arguments3 = getArguments();
        this.tabStartPosition = arguments3 != null ? arguments3.getInt("tab_start_position", 1) : 1;
        Bundle arguments4 = getArguments();
        this.tabEndPosition = arguments4 != null ? arguments4.getInt("tab_end_position", 50) : 50;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public C28452l getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28452l c28452lM109919c = C28452l.m109919c(inflater);
        Intrinsics.m97801g(c28452lM109919c, "inflate(...)");
        return c28452lM109919c;
    }
}
