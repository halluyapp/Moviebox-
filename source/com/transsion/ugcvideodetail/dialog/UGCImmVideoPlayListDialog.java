package com.transsion.ugcvideodetail.dialog;

import android.app.Dialog;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baseui.dialog.BaseViewBindingDialog;
import com.transsion.baseui.util.C14557c;
import com.transsion.ugcvideodetail.R$id;
import com.transsion.ugcvideodetail.adapter.C20150h;
import com.transsion.ugcvideodetail.api.bean.UGCImmVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.ugcvideodetail.fragment.UGCImmVideoDialogPlayListFragment;
import com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel;
import com.transsnet.downloader.R$style;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u0019\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u000b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010'R\"\u00103\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010+\u001a\u0004\b3\u00104\"\u0004\b5\u00106R.\u0010<\u001a\u001c\u0012\u0004\u0012\u000208\u0012\u0006\u0012\u0004\u0018\u000109\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006?"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/dialog/UGCImmVideoPlayListDialog;", "Lcom/transsion/baseui/dialog/BaseViewBindingDialog;", "Lwv/k;", "<init>", "()V", "", "u0", "()I", "", "w0", "initViewData", "totalCount", "B0", "(I)V", "tabIndex", "z0", "v0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/transsion/ugcvideodetail/viewmodel/UGCImmVideoDetailViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lkotlin/Lazy;", "t0", "()Lcom/transsion/ugcvideodetail/viewmodel/UGCImmVideoDetailViewModel;", "detailViewModel", "Lcom/transsion/ugcvideodetail/adapter/h;", "e", "Lcom/transsion/ugcvideodetail/adapter/h;", "tabAdapter", "f", "I", "selectedTabIndex", "", "g", "Z", "isTabsInitialized", "Lcom/transsion/ugcvideodetail/api/bean/UGCImmVideo;", "h", "Lcom/transsion/ugcvideodetail/api/bean/UGCImmVideo;", "currentVideo", "i", "j", "isCollectionList", "()Z", "setCollectionList", "(Z)V", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "n0", "()Lkotlin/jvm/functions/Function3;", "bindingInflater", CampaignEx.JSON_KEY_AD_K, "a", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCImmVideoPlayListDialog extends BaseViewBindingDialog<C28451k> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private C20150h tabAdapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int selectedTabIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean isTabsInitialized;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private UGCImmVideo currentVideo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int totalCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy detailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(UGCImmVideoDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.ugcvideodetail.dialog.UGCImmVideoPlayListDialog$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.ugcvideodetail.dialog.UGCImmVideoPlayListDialog$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isCollectionList = true;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.dialog.UGCImmVideoPlayListDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final UGCImmVideoPlayListDialog m83665a(boolean z11) {
            UGCImmVideoPlayListDialog uGCImmVideoPlayListDialog = new UGCImmVideoPlayListDialog();
            uGCImmVideoPlayListDialog.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("ISC_COLLECTION_LIST", Boolean.valueOf(z11))));
            return uGCImmVideoPlayListDialog;
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.dialog.UGCImmVideoPlayListDialog$b */
    public static final class C20161b extends RecyclerView.AbstractC4213l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f64063a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f64064b;

        C20161b(int i11, int i12) {
            this.f64063a = i11;
            this.f64064b = i12;
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
                outRect.left = this.f64063a;
                outRect.right = this.f64064b;
            } else if (childAdapterPosition == itemCount) {
                outRect.left = this.f64064b;
                outRect.right = this.f64063a;
            } else {
                int i11 = this.f64064b;
                outRect.left = i11;
                outRect.right = i11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A0 */
    public static final void m83651A0(Ref.ObjectRef objectRef) {
        ((UGCImmVideoDialogPlayListFragment) objectRef.element).m83755r0();
        ((UGCImmVideoDialogPlayListFragment) objectRef.element).m83754G0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v29, types: [T, com.transsion.ugcvideodetail.fragment.UGCImmVideoDialogPlayListFragment] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, androidx.fragment.app.Fragment] */
    /* JADX INFO: renamed from: B0 */
    private final void m83652B0(int totalCount) {
        int iM84273S;
        UGCVideo ugcVideo;
        RecyclerView recyclerView;
        View view;
        RecyclerView recyclerView2;
        if (totalCount <= 0) {
            return;
        }
        if (totalCount <= 50) {
            C28451k c28451k = (C28451k) getViewBinding();
            if (c28451k != null && (recyclerView2 = c28451k.f87353e) != null) {
                AbstractC26006c.m102054g(recyclerView2);
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? M14547k0 = getChildFragmentManager().m14547k0("UGCImmPlayListTabFragment_0");
            objectRef.element = M14547k0;
            if (M14547k0 == 0) {
                objectRef.element = UGCImmVideoDialogPlayListFragment.INSTANCE.m83757a(this.isCollectionList, 0, 1, totalCount);
            }
            if (((Fragment) objectRef.element).isAdded()) {
                getChildFragmentManager().m14557p().mo14681y((Fragment) objectRef.element).mo14673l();
            } else {
                getChildFragmentManager().m14557p().m14806c(R$id.fragmentContainer, (Fragment) objectRef.element, "UGCImmPlayListTabFragment_0").mo14673l();
            }
            if (!(objectRef.element instanceof UGCImmVideoDialogPlayListFragment) || (view = getView()) == null) {
                return;
            }
            view.post(new Runnable() { // from class: com.transsion.ugcvideodetail.dialog.g
                @Override // java.lang.Runnable
                public final void run() {
                    UGCImmVideoPlayListDialog.m83653C0(objectRef);
                }
            });
            return;
        }
        C28451k c28451k2 = (C28451k) getViewBinding();
        if (c28451k2 != null && (recyclerView = c28451k2.f87353e) != null) {
            AbstractC26006c.m102058k(recyclerView);
        }
        IntRange intRangeS = RangesKt.m97949s(0, (totalCount + 49) / 50);
        ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(intRangeS, 10));
        Iterator<Integer> it = intRangeS.iterator();
        while (it.hasNext()) {
            int iMo12071a = ((IntIterator) it).mo12071a();
            int i11 = (iMo12071a * 50) + 1;
            int iMin = Math.min((iMo12071a + 1) * 50, totalCount);
            StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
            String str = String.format(Locale.US, "%d-%d", Arrays.copyOf(new Object[]{Integer.valueOf(i11), Integer.valueOf(iMin)}, 2));
            Intrinsics.m97801g(str, "format(...)");
            arrayList.add(str);
        }
        C20150h c20150h = this.tabAdapter;
        if (c20150h != null) {
            c20150h.mo36201n1(CollectionsKt.m97343U0(arrayList));
        }
        if (this.isTabsInitialized) {
            int size = arrayList.size();
            int i12 = this.selectedTabIndex;
            if (i12 >= 0 && i12 < size) {
                C20150h c20150h2 = this.tabAdapter;
                if (c20150h2 != null) {
                    c20150h2.m83618D1(i12);
                    return;
                }
                return;
            }
        }
        UGCImmVideo uGCImmVideo = this.currentVideo;
        int iVideoUGCPosition = (uGCImmVideo == null || (ugcVideo = uGCImmVideo.getUgcVideo()) == null) ? -1 : ugcVideo.videoUGCPosition();
        if (iVideoUGCPosition > 0) {
            iM84273S = m83658t0().m84273S(iVideoUGCPosition);
        } else {
            int size2 = arrayList.size();
            int i13 = this.selectedTabIndex;
            iM84273S = (i13 < 0 || i13 >= size2) ? 0 : i13;
        }
        int iL = RangesKt.m97942l(iM84273S, 0, arrayList.size() - 1);
        this.selectedTabIndex = iL;
        C20150h c20150h3 = this.tabAdapter;
        if (c20150h3 != null) {
            c20150h3.m83618D1(iL);
        }
        this.isTabsInitialized = true;
        m83664z0(this.selectedTabIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C0 */
    public static final void m83653C0(Ref.ObjectRef objectRef) {
        ((UGCImmVideoDialogPlayListFragment) objectRef.element).m83755r0();
        ((UGCImmVideoDialogPlayListFragment) objectRef.element).m83754G0();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    private final void initViewData() {
        int iIntValue;
        UGCVideo ugcVideo;
        UGCVideo ugcVideo2;
        UGCVideoBelongToCollection belongToCollection;
        this.currentVideo = (UGCImmVideo) m83658t0().m84191L0().m14847f();
        Map map = (Map) m83658t0().m84193N0().m14847f();
        Integer numValueOf = null;
        if (map == null) {
            iIntValue = 0;
        } else {
            UGCImmVideo uGCImmVideo = this.currentVideo;
            Integer num = (Integer) map.get((uGCImmVideo == null || (ugcVideo2 = uGCImmVideo.getUgcVideo()) == null || (belongToCollection = ugcVideo2.getBelongToCollection()) == null) ? null : belongToCollection.getCollectionId());
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
        }
        this.totalCount = iIntValue;
        C26866a.a aVar = C26866a.f81698a;
        UGCImmVideo uGCImmVideo2 = this.currentVideo;
        if (uGCImmVideo2 != null && (ugcVideo = uGCImmVideo2.getUgcVideo()) != null) {
            numValueOf = Integer.valueOf(ugcVideo.videoUGCPosition());
        }
        C26866a.a.m104898f(aVar, "UGCImmVideoPlayListDialog", "initViewData, " + numValueOf + ", totalCount:" + this.totalCount, false, 4, null);
        m83652B0(this.totalCount);
    }

    /* JADX INFO: renamed from: t0 */
    private final UGCImmVideoDetailViewModel m83658t0() {
        return (UGCImmVideoDetailViewModel) this.detailViewModel.getValue();
    }

    /* JADX INFO: renamed from: u0 */
    private final int m83659u0() {
        return (AbstractC5806y.m27487c() * 7) / 10;
    }

    /* JADX INFO: renamed from: v0 */
    private final void m83660v0() {
        List<Fragment> listM14574y0 = getChildFragmentManager().m14574y0();
        Intrinsics.m97801g(listM14574y0, "getFragments(...)");
        for (Fragment fragment : listM14574y0) {
            if (fragment instanceof UGCImmVideoDialogPlayListFragment) {
                getChildFragmentManager().m14557p().mo14676p(fragment).mo14673l();
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    private final void m83661w0() {
        RecyclerView recyclerView;
        C20150h c20150h = new C20150h(null, 1, null);
        c20150h.m36227w1(new InterfaceC27566d() { // from class: com.transsion.ugcvideodetail.dialog.f
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                UGCImmVideoPlayListDialog.m83662x0(this.f64081a, baseQuickAdapter, view, i11);
            }
        });
        this.tabAdapter = c20150h;
        C28451k c28451k = (C28451k) getViewBinding();
        if (c28451k == null || (recyclerView = c28451k.f87353e) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(this.tabAdapter);
        recyclerView.addItemDecoration(new C20161b(AbstractC23384a.m92908b(12), AbstractC23384a.m92908b(8)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m83662x0(UGCImmVideoPlayListDialog uGCImmVideoPlayListDialog, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 2000L)) {
            return;
        }
        uGCImmVideoPlayListDialog.selectedTabIndex = i11;
        C20150h c20150h = uGCImmVideoPlayListDialog.tabAdapter;
        if (c20150h != null) {
            c20150h.m83618D1(i11);
        }
        uGCImmVideoPlayListDialog.m83664z0(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m83663y0(UGCImmVideoPlayListDialog uGCImmVideoPlayListDialog, View view) {
        uGCImmVideoPlayListDialog.dismissAllowingStateLoss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r7v13, types: [T, com.transsion.ugcvideodetail.fragment.UGCImmVideoDialogPlayListFragment] */
    /* JADX INFO: renamed from: z0 */
    private final void m83664z0(int tabIndex) {
        View view;
        String str = "UGCImmPlayListTabFragment_" + tabIndex;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? M14547k0 = getChildFragmentManager().m14547k0(str);
        objectRef.element = M14547k0;
        if (M14547k0 == 0) {
            objectRef.element = UGCImmVideoDialogPlayListFragment.INSTANCE.m83757a(this.isCollectionList, tabIndex, (tabIndex * 50) + 1, Math.min((tabIndex + 1) * 50, this.totalCount));
        }
        m83660v0();
        if (((Fragment) objectRef.element).isAdded()) {
            getChildFragmentManager().m14557p().mo14681y((Fragment) objectRef.element).mo14673l();
        } else {
            getChildFragmentManager().m14557p().m14806c(R$id.fragmentContainer, (Fragment) objectRef.element, str).mo14673l();
        }
        if (!(objectRef.element instanceof UGCImmVideoDialogPlayListFragment) || (view = getView()) == null) {
            return;
        }
        view.post(new Runnable() { // from class: com.transsion.ugcvideodetail.dialog.h
            @Override // java.lang.Runnable
            public final void run() {
                UGCImmVideoPlayListDialog.m83651A0(objectRef);
            }
        });
    }

    @Override // com.transsion.baseui.dialog.BaseViewBindingDialog
    /* JADX INFO: renamed from: n0 */
    public Function3 mo65514n0() {
        return UGCImmVideoPlayListDialog$bindingInflater$1.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.DownloadBottomDialogTheme);
        Bundle arguments = getArguments();
        this.isCollectionList = arguments != null ? arguments.getBoolean("ISC_COLLECTION_LIST", true) : true;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.m97801g(dialogOnCreateDialog, "onCreateDialog(...)");
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setWindowAnimations(com.transsion.baseui.R$style.BaseBottomDialogAnimation);
            window.setGravity(80);
            window.setDimAmount(0.5f);
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes == null) {
                attributes = new WindowManager.LayoutParams();
            }
            attributes.width = -1;
            window.setBackgroundDrawable(null);
            window.setAttributes(attributes);
        }
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AppCompatImageView appCompatImageView;
        ConstraintLayout constraintLayout;
        ViewGroup.LayoutParams layoutParams;
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C28451k c28451k = (C28451k) getViewBinding();
        if (c28451k != null && (constraintLayout = c28451k.f87350b) != null && (layoutParams = constraintLayout.getLayoutParams()) != null) {
            layoutParams.height = m83659u0();
        }
        C28451k c28451k2 = (C28451k) getViewBinding();
        if (c28451k2 != null && (appCompatImageView = c28451k2.f87352d) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.dialog.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    UGCImmVideoPlayListDialog.m83663y0(this.f64080a, view2);
                }
            });
        }
        m83661w0();
        initViewData();
    }
}
