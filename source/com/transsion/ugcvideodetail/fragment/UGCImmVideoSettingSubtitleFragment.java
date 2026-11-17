package com.transsion.ugcvideodetail.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.transsion.ugcvideodetail.adapter.C20147e;
import com.transsion.ugcvideodetail.hepler.subtitle.C20324a;
import com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p528ju.C24469a;
import p550kj.C24662i;
import p765s6.InterfaceC27566d;
import p885wv.C28448h;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0004R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R0\u0010+\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0005\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u00103\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00064"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/fragment/UGCImmVideoSettingSubtitleFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lwv/h;", "<init>", "()V", "", "d0", "Landroid/view/LayoutInflater;", "inflater", "c0", "(Landroid/view/LayoutInflater;)Lwv/h;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "initData", "initListener", "lazyLoadData", "Lcom/transsion/ugcvideodetail/viewmodel/UGCImmVideoDetailViewModel;", "a", "Lkotlin/Lazy;", "getViewModel", "()Lcom/transsion/ugcvideodetail/viewmodel/UGCImmVideoDetailViewModel;", "viewModel", "Lcom/transsion/ugcvideodetail/hepler/subtitle/a;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "b0", "()Lcom/transsion/ugcvideodetail/hepler/subtitle/a;", "subtitleViewModel", "Lcom/transsion/ugcvideodetail/adapter/e;", "c", "Lcom/transsion/ugcvideodetail/adapter/e;", "subtitleAdapter", "Lkotlin/Function1;", "Lju/a;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lkotlin/jvm/functions/Function1;", "getOnSubtitleSelected", "()Lkotlin/jvm/functions/Function1;", "g0", "(Lkotlin/jvm/functions/Function1;)V", "onSubtitleSelected", "Lkotlin/Function0;", "e", "Lkotlin/jvm/functions/Function0;", "getOnBackClick", "()Lkotlin/jvm/functions/Function0;", "f0", "(Lkotlin/jvm/functions/Function0;)V", "onBackClick", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCImmVideoSettingSubtitleFragment extends BaseFragment<C28448h> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy viewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(UGCImmVideoDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.ugcvideodetail.fragment.UGCImmVideoSettingSubtitleFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.ugcvideodetail.fragment.UGCImmVideoSettingSubtitleFragment$special$$inlined$activityViewModels$default$2
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
    private final Lazy subtitleViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(C20324a.class), new Function0<C3231x0>() { // from class: com.transsion.ugcvideodetail.fragment.UGCImmVideoSettingSubtitleFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.ugcvideodetail.fragment.UGCImmVideoSettingSubtitleFragment$special$$inlined$activityViewModels$default$4
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
    private C20147e subtitleAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Function1 onSubtitleSelected;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Function0 onBackClick;

    /* JADX INFO: renamed from: b0 */
    private final C20324a m83795b0() {
        return (C20324a) this.subtitleViewModel.getValue();
    }

    /* JADX INFO: renamed from: d0 */
    private final void m83796d0() {
        RecyclerView recyclerView;
        SubtitleDownloadTable subtitleDownloadTableM96011b;
        RecyclerView recyclerView2;
        final List list = (List) m83795b0().m84138d().m14847f();
        if (list == null) {
            return;
        }
        C28448h mViewBinding = getMViewBinding();
        int i11 = 0;
        if (mViewBinding != null && (recyclerView2 = mViewBinding.f87318b) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 1, false));
        }
        C24469a c24469a = (C24469a) m83795b0().m84137c().m14847f();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else {
                if (Intrinsics.m97797c(((C24469a) it.next()).m96011b().getId(), (c24469a == null || (subtitleDownloadTableM96011b = c24469a.m96011b()) == null) ? null : subtitleDownloadTableM96011b.getId())) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        C20147e c20147e = new C20147e(list);
        if (i11 >= 0) {
            c20147e.m83607D1(i11);
        }
        c20147e.m36227w1(new InterfaceC27566d() { // from class: com.transsion.ugcvideodetail.fragment.e0
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i12) {
                UGCImmVideoSettingSubtitleFragment.m83797e0(list, this, baseQuickAdapter, view, i12);
            }
        });
        this.subtitleAdapter = c20147e;
        C28448h mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (recyclerView = mViewBinding2.f87318b) == null) {
            return;
        }
        recyclerView.setAdapter(this.subtitleAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final void m83797e0(List list, UGCImmVideoSettingSubtitleFragment uGCImmVideoSettingSubtitleFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        C20147e c20147e = adapter instanceof C20147e ? (C20147e) adapter : null;
        if (c20147e != null) {
            c20147e.m83607D1(i11);
        }
        C24469a c24469a = (C24469a) list.get(i11);
        C24662i.f75350a.m96881p("/ugc_video/immersive_detail", MapsKt.m97577l(TuplesKt.m97108a("dialog_name", "half_screen"), TuplesKt.m97108a("module_name", "subtitle"), TuplesKt.m97108a(NativeComponentConstants.KEY_COMPONENT_TYPE, c24469a.m96011b().getLanName())));
        Function1 function1 = uGCImmVideoSettingSubtitleFragment.onSubtitleSelected;
        if (function1 != null) {
            function1.invoke(c24469a);
        }
        Function0 function0 = uGCImmVideoSettingSubtitleFragment.onBackClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public C28448h getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28448h c28448hM109903c = C28448h.m109903c(inflater);
        Intrinsics.m97801g(c28448hM109903c, "inflate(...)");
        return c28448hM109903c;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m83799f0(Function0 function0) {
        this.onBackClick = function0;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m83800g0(Function1 function1) {
        this.onSubtitleSelected = function1;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initData(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initListener() {
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        m83796d0();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }
}
