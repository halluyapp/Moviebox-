package com.transsion.ugcvideodetail.fragment;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baseui.util.C14557c;
import com.transsion.play.detail.fragment.BaseBottomDialogFragment;
import com.transsion.ugcvideodetail.R$id;
import com.transsion.ugcvideodetail.adapter.C20150h;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.hepler.UGCVideoPlayFrom;
import com.transsion.ugcvideodetail.viewmodel.UGCLocalVideoDetailViewModel;
import com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import ng.AbstractC26006c;
import p765s6.InterfaceC27566d;
import p885wv.C28451k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u0004R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u000107068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006="}, m97100d2 = {"Lcom/transsion/ugcvideodetail/fragment/UGCVideoDialogPlayListTabFragment;", "Lcom/transsion/play/detail/fragment/BaseBottomDialogFragment;", "Lwv/k;", "<init>", "()V", "", "B0", "", "totalCount", "I0", "(I)V", "tabIndex", "F0", "z0", "Landroid/view/LayoutInflater;", "inflater", "x0", "(Landroid/view/LayoutInflater;)Lwv/k;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "receiveArguments", "initViewData", "initViewModel", "initListener", "retryLoadData", "Lcom/transsion/ugcvideodetail/viewmodel/UGCVideoDetailViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "y0", "()Lcom/transsion/ugcvideodetail/viewmodel/UGCVideoDetailViewModel;", "viewModel", "Lcom/transsion/ugcvideodetail/viewmodel/UGCLocalVideoDetailViewModel;", "c", "w0", "()Lcom/transsion/ugcvideodetail/viewmodel/UGCLocalVideoDetailViewModel;", "localViewModel", "Lcom/transsion/ugcvideodetail/adapter/h;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/ugcvideodetail/adapter/h;", "tabAdapter", "e", "I", "selectedTabIndex", "", "f", "Z", "isTabsInitialized", "g", "hasScrolledToCurrentVideo", "Lcom/transsion/ugcvideodetail/hepler/UGCVideoPlayFrom;", "h", "Lcom/transsion/ugcvideodetail/hepler/UGCVideoPlayFrom;", "videoPlayFrom", "", "Lcom/transsion/baselib/db/download/DownloadBean;", "i", "Ljava/util/List;", "localPlayList", "j", "a", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCVideoDialogPlayListTabFragment extends BaseBottomDialogFragment<C28451k> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C20150h tabAdapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int selectedTabIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isTabsInitialized;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean hasScrolledToCurrentVideo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy viewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(UGCVideoDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.ugcvideodetail.fragment.UGCVideoDialogPlayListTabFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.ugcvideodetail.fragment.UGCVideoDialogPlayListTabFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy localViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(UGCLocalVideoDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.ugcvideodetail.fragment.UGCVideoDialogPlayListTabFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.ugcvideodetail.fragment.UGCVideoDialogPlayListTabFragment$special$$inlined$activityViewModels$default$4
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

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private UGCVideoPlayFrom videoPlayFrom = UGCVideoPlayFrom.ON_LINE_VIDEO;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private List localPlayList = new ArrayList();

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCVideoDialogPlayListTabFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final UGCVideoDialogPlayListTabFragment m84010a() {
            return new UGCVideoDialogPlayListTabFragment();
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCVideoDialogPlayListTabFragment$b */
    public /* synthetic */ class C20228b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64244a;

        static {
            int[] iArr = new int[UGCVideoPlayFrom.values().length];
            try {
                iArr[UGCVideoPlayFrom.ON_LINE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UGCVideoPlayFrom.LOCAL_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f64244a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCVideoDialogPlayListTabFragment$c */
    public static final class C20229c extends RecyclerView.AbstractC4213l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f64245a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f64246b;

        C20229c(int i11, int i12) {
            this.f64245a = i11;
            this.f64246b = i12;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(outRect, "outRect");
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = parent.getAdapter();
            int itemCount = (adapter != null ? adapter.getItemCount() : 0) - 1;
            if (childAdapterPosition == 0) {
                outRect.left = this.f64245a;
                outRect.right = this.f64246b;
            } else if (childAdapterPosition == itemCount) {
                outRect.left = this.f64246b;
                outRect.right = this.f64245a;
            } else {
                int i11 = this.f64246b;
                outRect.left = i11;
                outRect.right = i11;
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCVideoDialogPlayListTabFragment$d */
    static final class C20230d implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f64247a;

        C20230d(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f64247a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f64247a;
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
            this.f64247a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final void m83987A0(UGCVideoDialogPlayListTabFragment uGCVideoDialogPlayListTabFragment, View view) {
        BaseBottomDialogFragment.m71695m0(uGCVideoDialogPlayListTabFragment, false, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B0 */
    private final void m83988B0() {
        RecyclerView recyclerView;
        C20150h c20150h = new C20150h(null, 1, null);
        c20150h.m36227w1(new InterfaceC27566d() { // from class: com.transsion.ugcvideodetail.fragment.q1
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                UGCVideoDialogPlayListTabFragment.m83989C0(this.f64307a, baseQuickAdapter, view, i11);
            }
        });
        this.tabAdapter = c20150h;
        C28451k c28451k = (C28451k) getMViewBinding();
        if (c28451k == null || (recyclerView = c28451k.f87353e) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(this.tabAdapter);
        recyclerView.addItemDecoration(new C20229c(AbstractC23384a.m92908b(12), AbstractC23384a.m92908b(8)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final void m83989C0(UGCVideoDialogPlayListTabFragment uGCVideoDialogPlayListTabFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 2000L)) {
            return;
        }
        uGCVideoDialogPlayListTabFragment.selectedTabIndex = i11;
        C20150h c20150h = uGCVideoDialogPlayListTabFragment.tabAdapter;
        if (c20150h != null) {
            c20150h.m83618D1(i11);
        }
        uGCVideoDialogPlayListTabFragment.m83992F0(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final Unit m83990D0(UGCVideoDialogPlayListTabFragment uGCVideoDialogPlayListTabFragment, Integer num) {
        uGCVideoDialogPlayListTabFragment.m83995I0(num != null ? num.intValue() : 0);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final Unit m83991E0(UGCVideoDialogPlayListTabFragment uGCVideoDialogPlayListTabFragment, List list) {
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            uGCVideoDialogPlayListTabFragment.localPlayList = list;
            uGCVideoDialogPlayListTabFragment.m83995I0(list.size());
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r7v17, types: [T, com.transsion.ugcvideodetail.fragment.UGCVideoDialogPlayListFragment] */
    /* JADX INFO: renamed from: F0 */
    private final void m83992F0(int tabIndex) {
        View view;
        int iIntValue;
        String str = "PlayListTabFragment_" + tabIndex;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? M14547k0 = getChildFragmentManager().m14547k0(str);
        objectRef.element = M14547k0;
        if (M14547k0 == 0) {
            int i11 = C20228b.f64244a[this.videoPlayFrom.ordinal()];
            if (i11 == 1) {
                Integer num = (Integer) m84007y0().m84268N().m14847f();
                iIntValue = num != null ? num.intValue() : 0;
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iIntValue = this.localPlayList.size();
            }
            objectRef.element = UGCVideoDialogPlayListFragment.INSTANCE.m83986a(tabIndex, (tabIndex * 50) + 1, Math.min((tabIndex + 1) * 50, iIntValue), this.videoPlayFrom);
        }
        m84008z0();
        if (((Fragment) objectRef.element).isAdded()) {
            getChildFragmentManager().m14557p().mo14681y((Fragment) objectRef.element).mo14673l();
        } else {
            getChildFragmentManager().m14557p().m14806c(R$id.fragmentContainer, (Fragment) objectRef.element, str).mo14673l();
        }
        if (this.videoPlayFrom == UGCVideoPlayFrom.ON_LINE_VIDEO && (objectRef.element instanceof UGCVideoDialogPlayListFragment)) {
            View view2 = getView();
            if (view2 != null) {
                view2.post(new Runnable() { // from class: com.transsion.ugcvideodetail.fragment.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        UGCVideoDialogPlayListTabFragment.m83993G0(objectRef);
                    }
                });
                return;
            }
            return;
        }
        if (!(objectRef.element instanceof UGCVideoDialogPlayListFragment) || (view = getView()) == null) {
            return;
        }
        view.post(new Runnable() { // from class: com.transsion.ugcvideodetail.fragment.w1
            @Override // java.lang.Runnable
            public final void run() {
                UGCVideoDialogPlayListTabFragment.m83994H0(objectRef);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    public static final void m83993G0(Ref.ObjectRef objectRef) {
        ((UGCVideoDialogPlayListFragment) objectRef.element).m83984s0();
        ((UGCVideoDialogPlayListFragment) objectRef.element).m83983K0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H0 */
    public static final void m83994H0(Ref.ObjectRef objectRef) {
        ((UGCVideoDialogPlayListFragment) objectRef.element).m83983K0();
    }

    /* JADX WARN: Code duplicated, block: B:86:0x019a A[PHI: r0
      0x019a: PHI (r0v9 int) = (r0v5 int), (r0v16 int) binds: [B:114:0x0215, B:85:0x0198] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x019d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v61, types: [T, com.transsion.ugcvideodetail.fragment.UGCVideoDialogPlayListFragment] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, androidx.fragment.app.Fragment] */
    /* JADX INFO: renamed from: I0 */
    private final void m83995I0(int totalCount) {
        UGCVideo uGCVideo;
        int i11;
        int iM84273S;
        Object next;
        Object next2;
        DownloadBean downloadBean;
        RecyclerView recyclerView;
        View view;
        RecyclerView recyclerView2;
        if (totalCount <= 0) {
            return;
        }
        if (totalCount <= 50) {
            C28451k c28451k = (C28451k) getMViewBinding();
            if (c28451k != null && (recyclerView2 = c28451k.f87353e) != null) {
                AbstractC26006c.m102054g(recyclerView2);
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? M14547k0 = getChildFragmentManager().m14547k0("PlayListTabFragment_0");
            objectRef.element = M14547k0;
            if (M14547k0 == 0) {
                objectRef.element = UGCVideoDialogPlayListFragment.INSTANCE.m83986a(0, 1, totalCount, this.videoPlayFrom);
            }
            if (((Fragment) objectRef.element).isAdded()) {
                getChildFragmentManager().m14557p().mo14681y((Fragment) objectRef.element).mo14673l();
            } else {
                getChildFragmentManager().m14557p().m14806c(R$id.fragmentContainer, (Fragment) objectRef.element, "PlayListTabFragment_0").mo14673l();
            }
            if (this.hasScrolledToCurrentVideo) {
                return;
            }
            if (this.videoPlayFrom == UGCVideoPlayFrom.ON_LINE_VIDEO && (objectRef.element instanceof UGCVideoDialogPlayListFragment)) {
                View view2 = getView();
                if (view2 != null) {
                    view2.post(new Runnable() { // from class: com.transsion.ugcvideodetail.fragment.t1
                        @Override // java.lang.Runnable
                        public final void run() {
                            UGCVideoDialogPlayListTabFragment.m83996J0(objectRef);
                        }
                    });
                }
            } else if ((objectRef.element instanceof UGCVideoDialogPlayListFragment) && (view = getView()) != null) {
                view.post(new Runnable() { // from class: com.transsion.ugcvideodetail.fragment.u1
                    @Override // java.lang.Runnable
                    public final void run() {
                        UGCVideoDialogPlayListTabFragment.m83997K0(objectRef);
                    }
                });
            }
            this.hasScrolledToCurrentVideo = true;
            return;
        }
        C28451k c28451k2 = (C28451k) getMViewBinding();
        if (c28451k2 != null && (recyclerView = c28451k2.f87353e) != null) {
            AbstractC26006c.m102058k(recyclerView);
        }
        IntRange intRangeS = RangesKt.m97949s(0, (totalCount + 49) / 50);
        ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(intRangeS, 10));
        Iterator<Integer> it = intRangeS.iterator();
        while (it.hasNext()) {
            int iMo12071a = ((IntIterator) it).mo12071a();
            int i12 = (iMo12071a * 50) + 1;
            int iMin = Math.min((iMo12071a + 1) * 50, totalCount);
            StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
            String str = String.format(Locale.US, "%d-%d", Arrays.copyOf(new Object[]{Integer.valueOf(i12), Integer.valueOf(iMin)}, 2));
            Intrinsics.m97801g(str, "format(...)");
            arrayList.add(str);
        }
        C20150h c20150h = this.tabAdapter;
        if (c20150h != null) {
            c20150h.mo36201n1(CollectionsKt.m97343U0(arrayList));
        }
        if (this.isTabsInitialized) {
            int size = arrayList.size();
            int i13 = this.selectedTabIndex;
            if (i13 >= 0 && i13 < size) {
                C20150h c20150h2 = this.tabAdapter;
                if (c20150h2 != null) {
                    c20150h2.m83618D1(i13);
                    return;
                }
                return;
            }
        }
        int i14 = C20228b.f64244a[this.videoPlayFrom.ordinal()];
        if (i14 == 1) {
            UGCVideo uGCVideo2 = (UGCVideo) m84007y0().m84261G().m14847f();
            String ugcVideoId = uGCVideo2 != null ? uGCVideo2.getUgcVideoId() : null;
            List list = (List) m84007y0().m84258C().m14847f();
            if (list != null) {
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.m97797c(((UGCVideo) next).getUgcVideoId(), ugcVideoId));
                uGCVideo = (UGCVideo) next;
            } else {
                uGCVideo = null;
            }
            if ((uGCVideo != null ? Integer.valueOf(uGCVideo.getPlayListPosition()) : null) != null) {
                iM84273S = m84007y0().m84273S(uGCVideo.getPlayListPosition());
            } else {
                int size2 = arrayList.size();
                i11 = this.selectedTabIndex;
                if (i11 >= 0 && i11 < size2) {
                    iM84273S = i11;
                } else {
                    iM84273S = 0;
                }
            }
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            DownloadBean downloadBean2 = (DownloadBean) m84006w0().m84223i().m14847f();
            String ugcVideoId2 = downloadBean2 != null ? downloadBean2.getUgcVideoId() : null;
            Iterator it3 = this.localPlayList.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it3.next();
                    downloadBean = (DownloadBean) next2;
                }
            } while (!(downloadBean != null ? Intrinsics.m97797c(downloadBean.getUgcVideoId(), ugcVideoId2) : false));
            DownloadBean downloadBean3 = next2 instanceof DownloadBean ? (DownloadBean) next2 : null;
            if ((downloadBean3 != null ? downloadBean3.getUgcVideoPosition() : null) != null) {
                Integer ugcVideoPosition = downloadBean3.getUgcVideoPosition();
                Intrinsics.m97799e(ugcVideoPosition);
                iM84273S = (ugcVideoPosition.intValue() - 1) / 50;
            } else {
                int size3 = arrayList.size();
                i11 = this.selectedTabIndex;
                if (i11 >= 0 && i11 < size3) {
                    iM84273S = i11;
                } else {
                    iM84273S = 0;
                }
            }
        }
        int iL = RangesKt.m97942l(iM84273S, 0, arrayList.size() - 1);
        this.selectedTabIndex = iL;
        C20150h c20150h3 = this.tabAdapter;
        if (c20150h3 != null) {
            c20150h3.m83618D1(iL);
        }
        this.isTabsInitialized = true;
        m83992F0(this.selectedTabIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J0 */
    public static final void m83996J0(Ref.ObjectRef objectRef) {
        ((UGCVideoDialogPlayListFragment) objectRef.element).m83984s0();
        ((UGCVideoDialogPlayListFragment) objectRef.element).m83983K0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K0 */
    public static final void m83997K0(Ref.ObjectRef objectRef) {
        ((UGCVideoDialogPlayListFragment) objectRef.element).m83983K0();
    }

    /* JADX INFO: renamed from: w0 */
    private final UGCLocalVideoDetailViewModel m84006w0() {
        return (UGCLocalVideoDetailViewModel) this.localViewModel.getValue();
    }

    /* JADX INFO: renamed from: y0 */
    private final UGCVideoDetailViewModel m84007y0() {
        return (UGCVideoDetailViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: z0 */
    private final void m84008z0() {
        List<Fragment> listM14574y0 = getChildFragmentManager().m14574y0();
        Intrinsics.m97801g(listM14574y0, "getFragments(...)");
        for (Fragment fragment : listM14574y0) {
            if (fragment instanceof UGCVideoDialogPlayListFragment) {
                getChildFragmentManager().m14557p().mo14676p(fragment).mo14673l();
            }
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        AppCompatImageView appCompatImageView;
        C28451k c28451k = (C28451k) getMViewBinding();
        if (c28451k == null || (appCompatImageView = c28451k.f87352d) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.fragment.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCVideoDialogPlayListTabFragment.m83987A0(this.f64303a, view);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        m83988B0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        int i11 = C20228b.f64244a[this.videoPlayFrom.ordinal()];
        if (i11 == 1) {
            m84007y0().m84268N().m14851j(this, new C20230d(new Function1() { // from class: com.transsion.ugcvideodetail.fragment.r1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UGCVideoDialogPlayListTabFragment.m83990D0(this.f64310a, (Integer) obj);
                }
            }));
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            m84006w0().m84225k().m14851j(this, new C20230d(new Function1() { // from class: com.transsion.ugcvideodetail.fragment.s1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UGCVideoDialogPlayListTabFragment.m83991E0(this.f64313a, (List) obj);
                }
            }));
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        super.receiveArguments();
        Bundle arguments = getArguments();
        int i11 = arguments != null ? arguments.getInt("VIDEO_FROM") : UGCVideoPlayFrom.ON_LINE_VIDEO.getValue();
        UGCVideoPlayFrom uGCVideoPlayFrom = UGCVideoPlayFrom.ON_LINE_VIDEO;
        if (i11 != uGCVideoPlayFrom.getValue()) {
            uGCVideoPlayFrom = UGCVideoPlayFrom.LOCAL_VIDEO;
        }
        this.videoPlayFrom = uGCVideoPlayFrom;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public C28451k getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28451k c28451kM109915c = C28451k.m109915c(inflater);
        Intrinsics.m97801g(c28451kM109915c, "inflate(...)");
        return c28451kM109915c;
    }
}
