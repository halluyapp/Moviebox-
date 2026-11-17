package com.transsion.ugcvideodetail.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.noober.background.view.BLConstraintLayout;
import com.p282tn.lib.view.SwitchButton;
import com.p282tn.lib.widget.R$color;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.baseui.widget.GradientTextView;
import com.transsion.ugcvideodetail.adapter.C20146d;
import com.transsion.ugcvideodetail.api.bean.UGCImmVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoPlayInfo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoPlayStream;
import com.transsion.ugcvideodetail.dialog.UGCImmVideoSettingDialog;
import com.transsion.ugcvideodetail.hepler.subtitle.C20324a;
import com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mg.C25826c;
import ng.AbstractC26006c;
import p550kj.C24662i;
import p765s6.InterfaceC27566d;
import p885wv.C28447g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u0004R\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010,R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010,R\u0016\u00106\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R0\u0010B\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0005\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR0\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR*\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR*\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010I\u001a\u0004\bP\u0010K\"\u0004\bQ\u0010MR0\u0010W\u001a\u0010\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020\u0005\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010=\u001a\u0004\bU\u0010?\"\u0004\bV\u0010A¨\u0006X"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/fragment/UGCImmVideoSettingFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lwv/g;", "<init>", "()V", "", "u0", "", "index", "J0", "(I)V", "D0", "s0", "B0", "q0", "o0", "k0", "Landroid/view/LayoutInflater;", "inflater", "m0", "(Landroid/view/LayoutInflater;)Lwv/g;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "initData", "initListener", "lazyLoadData", "Lcom/transsion/ugcvideodetail/viewmodel/UGCImmVideoDetailViewModel;", "a", "Lkotlin/Lazy;", "n0", "()Lcom/transsion/ugcvideodetail/viewmodel/UGCImmVideoDetailViewModel;", "viewModel", "Lcom/transsion/ugcvideodetail/hepler/subtitle/a;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "l0", "()Lcom/transsion/ugcvideodetail/hepler/subtitle/a;", "subtitleViewModel", "", "", "c", "Ljava/util/List;", "speedOptions", "", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "qualityOptions", "e", "qualityOptionsOrigin", "f", "I", "selectedQualityIndex", "Lcom/transsion/ugcvideodetail/adapter/d;", "g", "Lcom/transsion/ugcvideodetail/adapter/d;", "qualityAdapter", "Lkotlin/Function1;", "h", "Lkotlin/jvm/functions/Function1;", "getOnSpeedSelected", "()Lkotlin/jvm/functions/Function1;", "H0", "(Lkotlin/jvm/functions/Function1;)V", "onSpeedSelected", "i", "getOnQualitySelected", "G0", "onQualitySelected", "Lkotlin/Function0;", "j", "Lkotlin/jvm/functions/Function0;", "getOnSubtitleClick", "()Lkotlin/jvm/functions/Function0;", "I0", "(Lkotlin/jvm/functions/Function0;)V", "onSubtitleClick", CampaignEx.JSON_KEY_AD_K, "getOnCleanModeClick", "F0", "onCleanModeClick", "", "l", "getOnAutoplayChanged", "E0", "onAutoplayChanged", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCImmVideoSettingFragment extends BaseFragment<C28447g> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy viewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(UGCImmVideoDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.ugcvideodetail.fragment.UGCImmVideoSettingFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.ugcvideodetail.fragment.UGCImmVideoSettingFragment$special$$inlined$activityViewModels$default$2
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
    private final Lazy subtitleViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(C20324a.class), new Function0<C3231x0>() { // from class: com.transsion.ugcvideodetail.fragment.UGCImmVideoSettingFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.ugcvideodetail.fragment.UGCImmVideoSettingFragment$special$$inlined$activityViewModels$default$4
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
    private final List speedOptions = CollectionsKt.m97509o(Float.valueOf(0.5f), Float.valueOf(0.75f), Float.valueOf(1.0f), Float.valueOf(1.25f), Float.valueOf(1.5f), Float.valueOf(2.0f));

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private List qualityOptions = new ArrayList();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private List qualityOptionsOrigin = new ArrayList();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int selectedQualityIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C20146d qualityAdapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Function1 onSpeedSelected;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private Function1 onQualitySelected;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private Function0 onSubtitleClick;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private Function0 onCleanModeClick;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private Function1 onAutoplayChanged;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final void m83758A0(UGCImmVideoSettingFragment uGCImmVideoSettingFragment, View view) {
        uGCImmVideoSettingFragment.m83761D0(5);
    }

    /* JADX INFO: renamed from: B0 */
    private final void m83759B0() {
        BLConstraintLayout bLConstraintLayout;
        C28447g mViewBinding = getMViewBinding();
        if (mViewBinding == null || (bLConstraintLayout = mViewBinding.f87296f) == null) {
            return;
        }
        bLConstraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.fragment.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCImmVideoSettingFragment.m83760C0(this.f64257a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final void m83760C0(UGCImmVideoSettingFragment uGCImmVideoSettingFragment, View view) {
        C24662i.f75350a.m96881p("/ugc_video/immersive_detail", MapsKt.m97577l(TuplesKt.m97108a("dialog_name", "half_screen"), TuplesKt.m97108a("module_name", "subtitle")));
        Fragment parentFragment = uGCImmVideoSettingFragment.getParentFragment();
        UGCImmVideoSettingDialog uGCImmVideoSettingDialog = parentFragment instanceof UGCImmVideoSettingDialog ? (UGCImmVideoSettingDialog) parentFragment : null;
        if (uGCImmVideoSettingDialog != null) {
            uGCImmVideoSettingDialog.m83675x0();
        }
        Function0 function0 = uGCImmVideoSettingFragment.onSubtitleClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: D0 */
    private final void m83761D0(int index) {
        m83762J0(index);
        float fFloatValue = ((Number) this.speedOptions.get(index)).floatValue();
        C24662i.f75350a.m96881p("/ugc_video/immersive_detail", MapsKt.m97577l(TuplesKt.m97108a("dialog_name", "half_screen"), TuplesKt.m97108a("module_name", "speed"), TuplesKt.m97108a(NativeComponentConstants.KEY_COMPONENT_TYPE, String.valueOf(fFloatValue))));
        C14496b.f50966a.m65344b().putFloat("KEY_UGC_IMM_VIDEO_SPEED", fFloatValue);
        Function1 function1 = this.onSpeedSelected;
        if (function1 != null) {
            function1.invoke(this.speedOptions.get(index));
        }
        m83773k0();
    }

    /* JADX INFO: renamed from: J0 */
    private final void m83762J0(int index) {
        int i11 = 0;
        if (index < 0 || index >= this.speedOptions.size()) {
            return;
        }
        C28447g mViewBinding = getMViewBinding();
        GradientTextView gradientTextView = mViewBinding != null ? mViewBinding.f87309s : null;
        C28447g mViewBinding2 = getMViewBinding();
        GradientTextView gradientTextView2 = mViewBinding2 != null ? mViewBinding2.f87310t : null;
        C28447g mViewBinding3 = getMViewBinding();
        GradientTextView gradientTextView3 = mViewBinding3 != null ? mViewBinding3.f87311u : null;
        C28447g mViewBinding4 = getMViewBinding();
        GradientTextView gradientTextView4 = mViewBinding4 != null ? mViewBinding4.f87312v : null;
        C28447g mViewBinding5 = getMViewBinding();
        GradientTextView gradientTextView5 = mViewBinding5 != null ? mViewBinding5.f87313w : null;
        C28447g mViewBinding6 = getMViewBinding();
        List listO = CollectionsKt.m97509o(gradientTextView, gradientTextView2, gradientTextView3, gradientTextView4, gradientTextView5, mViewBinding6 != null ? mViewBinding6.f87314x : null);
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        int color = AbstractC2397b.getColor(contextRequireContext, R$color.brand_new_gradient_start);
        int color2 = AbstractC2397b.getColor(contextRequireContext, R$color.brand_new_gradient_center);
        int color3 = AbstractC2397b.getColor(contextRequireContext, R$color.brand_new_gradient_end);
        int color4 = AbstractC2397b.getColor(contextRequireContext, R$color.text_03);
        for (Object obj : listO) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            GradientTextView gradientTextView6 = (GradientTextView) obj;
            if (i11 == index) {
                if (gradientTextView6 != null) {
                    gradientTextView6.setGradientColors(color, color2, color3);
                }
            } else if (gradientTextView6 != null) {
                gradientTextView6.setGradientColors(color4, color4, color4);
            }
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: k0 */
    private final void m83773k0() {
        Fragment parentFragment = getParentFragment();
        UGCImmVideoSettingDialog uGCImmVideoSettingDialog = parentFragment instanceof UGCImmVideoSettingDialog ? (UGCImmVideoSettingDialog) parentFragment : null;
        if (uGCImmVideoSettingDialog != null) {
            uGCImmVideoSettingDialog.dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: l0 */
    private final C20324a m83774l0() {
        return (C20324a) this.subtitleViewModel.getValue();
    }

    /* JADX INFO: renamed from: n0 */
    private final UGCImmVideoDetailViewModel m83775n0() {
        return (UGCImmVideoDetailViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: o0 */
    private final void m83776o0() {
        SwitchButton switchButton;
        C28447g mViewBinding = getMViewBinding();
        if (mViewBinding == null || (switchButton = mViewBinding.f87305o) == null) {
            return;
        }
        switchButton.setChecked(C14496b.f50966a.m65344b().getBoolean("KEY_UGC_IMM_VIDEO_AUTO_PLAY", false));
        switchButton.setOnCheckedChangeListener(new SwitchButton.InterfaceC13732d() { // from class: com.transsion.ugcvideodetail.fragment.w
            @Override // com.p282tn.lib.view.SwitchButton.InterfaceC13732d
            /* JADX INFO: renamed from: a */
            public final void mo62077a(SwitchButton switchButton2, boolean z11) {
                UGCImmVideoSettingFragment.m83777p0(this.f64328a, switchButton2, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final void m83777p0(UGCImmVideoSettingFragment uGCImmVideoSettingFragment, SwitchButton switchButton, boolean z11) {
        C24662i.f75350a.m96881p("/ugc_video/immersive_detail", MapsKt.m97577l(TuplesKt.m97108a("dialog_name", "half_screen"), TuplesKt.m97108a("module_name", "auto_play")));
        C14496b.f50966a.m65344b().putBoolean("KEY_UGC_IMM_VIDEO_AUTO_PLAY", z11);
        Function1 function1 = uGCImmVideoSettingFragment.onAutoplayChanged;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z11));
        }
    }

    /* JADX INFO: renamed from: q0 */
    private final void m83778q0() {
        BLConstraintLayout bLConstraintLayout;
        C28447g mViewBinding = getMViewBinding();
        if (mViewBinding == null || (bLConstraintLayout = mViewBinding.f87293c) == null) {
            return;
        }
        bLConstraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.fragment.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCImmVideoSettingFragment.m83779r0(this.f64324a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final void m83779r0(UGCImmVideoSettingFragment uGCImmVideoSettingFragment, View view) {
        C24662i.f75350a.m96881p("/ugc_video/immersive_detail", MapsKt.m97577l(TuplesKt.m97108a("dialog_name", "half_screen"), TuplesKt.m97108a("module_name", "clean_mode")));
        uGCImmVideoSettingFragment.m83773k0();
        Function0 function0 = uGCImmVideoSettingFragment.onCleanModeClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: s0 */
    private final void m83780s0() {
        UGCVideoPlayInfo playInfo;
        List<UGCVideoPlayStream> resources;
        Integer num;
        RecyclerView recyclerView;
        BLConstraintLayout bLConstraintLayout;
        RecyclerView recyclerView2;
        C28447g mViewBinding = getMViewBinding();
        int iIntValue = 0;
        if (mViewBinding != null && (recyclerView2 = mViewBinding.f87304n) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 0, false));
            recyclerView2.addItemDecoration(new C25826c(AbstractC23384a.m92908b(28), 0));
        }
        UGCImmVideo uGCImmVideo = (UGCImmVideo) m83775n0().m84191L0().m14847f();
        if (uGCImmVideo == null || (playInfo = uGCImmVideo.getPlayInfo()) == null || (resources = playInfo.getResources()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = resources.iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                break;
            }
            Integer numV = StringsKt.m98216v(((UGCVideoPlayStream) it.next()).getResolutions());
            if (numV != null && numV.intValue() > 0) {
                num = numV;
            }
            if (num != null) {
                arrayList.add(num);
            }
        }
        List listH0 = CollectionsKt.m97330H0(CollectionsKt.m97353c0(arrayList));
        if (listH0.isEmpty()) {
            C28447g mViewBinding2 = getMViewBinding();
            if (mViewBinding2 == null || (bLConstraintLayout = mViewBinding2.f87294d) == null) {
                return;
            }
            AbstractC26006c.m102054g(bLConstraintLayout);
            return;
        }
        this.qualityOptions.clear();
        this.qualityOptionsOrigin.clear();
        List list = this.qualityOptions;
        List list2 = listH0;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m97516v(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Number) it2.next()).intValue() + "P");
        }
        list.addAll(arrayList2);
        this.qualityOptionsOrigin.addAll(listH0);
        String str = (String) m83775n0().m84192M0().m14847f();
        Integer numV2 = str != null ? StringsKt.m98216v(str) : null;
        if (numV2 != null) {
            Integer numValueOf = Integer.valueOf(listH0.indexOf(numV2));
            num = numValueOf.intValue() >= 0 ? numValueOf : null;
            if (num != null) {
                iIntValue = num.intValue();
            }
        }
        this.selectedQualityIndex = iIntValue;
        C20146d c20146d = new C20146d(CollectionsKt.m97343U0(this.qualityOptions));
        c20146d.m83604D1(this.selectedQualityIndex);
        c20146d.m36227w1(new InterfaceC27566d() { // from class: com.transsion.ugcvideodetail.fragment.u
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                UGCImmVideoSettingFragment.m83781t0(this.f64318a, baseQuickAdapter, view, i11);
            }
        });
        this.qualityAdapter = c20146d;
        C28447g mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (recyclerView = mViewBinding3.f87304n) == null) {
            return;
        }
        recyclerView.setAdapter(this.qualityAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final void m83781t0(UGCImmVideoSettingFragment uGCImmVideoSettingFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        C20146d c20146d = adapter instanceof C20146d ? (C20146d) adapter : null;
        if (c20146d != null) {
            c20146d.m83604D1(i11);
        }
        uGCImmVideoSettingFragment.selectedQualityIndex = i11;
        int iIntValue = ((Number) uGCImmVideoSettingFragment.qualityOptionsOrigin.get(i11)).intValue();
        uGCImmVideoSettingFragment.m83775n0().m84192M0().mo14858q(String.valueOf(((Number) uGCImmVideoSettingFragment.qualityOptionsOrigin.get(i11)).intValue()));
        C24662i.f75350a.m96881p("/ugc_video/immersive_detail", MapsKt.m97577l(TuplesKt.m97108a("dialog_name", "half_screen"), TuplesKt.m97108a("module_name", "quality"), TuplesKt.m97108a(NativeComponentConstants.KEY_COMPONENT_TYPE, String.valueOf(iIntValue))));
        Function1 function1 = uGCImmVideoSettingFragment.onQualitySelected;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(iIntValue));
        }
    }

    /* JADX INFO: renamed from: u0 */
    private final void m83782u0() {
        GradientTextView gradientTextView;
        GradientTextView gradientTextView2;
        GradientTextView gradientTextView3;
        GradientTextView gradientTextView4;
        GradientTextView gradientTextView5;
        GradientTextView gradientTextView6;
        C28447g mViewBinding = getMViewBinding();
        if (mViewBinding != null && (gradientTextView6 = mViewBinding.f87309s) != null) {
            gradientTextView6.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.fragment.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UGCImmVideoSettingFragment.m83783v0(this.f64331a, view);
                }
            });
        }
        C28447g mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (gradientTextView5 = mViewBinding2.f87310t) != null) {
            gradientTextView5.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.fragment.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UGCImmVideoSettingFragment.m83784w0(this.f64333a, view);
                }
            });
        }
        C28447g mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (gradientTextView4 = mViewBinding3.f87311u) != null) {
            gradientTextView4.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.fragment.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UGCImmVideoSettingFragment.m83785x0(this.f64335a, view);
                }
            });
        }
        C28447g mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (gradientTextView3 = mViewBinding4.f87312v) != null) {
            gradientTextView3.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.fragment.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UGCImmVideoSettingFragment.m83786y0(this.f64248a, view);
                }
            });
        }
        C28447g mViewBinding5 = getMViewBinding();
        if (mViewBinding5 != null && (gradientTextView2 = mViewBinding5.f87313w) != null) {
            gradientTextView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.fragment.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UGCImmVideoSettingFragment.m83787z0(this.f64251a, view);
                }
            });
        }
        C28447g mViewBinding6 = getMViewBinding();
        if (mViewBinding6 != null && (gradientTextView = mViewBinding6.f87314x) != null) {
            gradientTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.fragment.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UGCImmVideoSettingFragment.m83758A0(this.f64254a, view);
                }
            });
        }
        float f11 = C14496b.f50966a.m65344b().getFloat("KEY_UGC_IMM_VIDEO_SPEED", 1.0f);
        Iterator it = this.speedOptions.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (((Number) it.next()).floatValue() == f11) {
                m83762J0(i11);
            }
            i11++;
        }
        i11 = -1;
        m83762J0(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m83783v0(UGCImmVideoSettingFragment uGCImmVideoSettingFragment, View view) {
        uGCImmVideoSettingFragment.m83761D0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m83784w0(UGCImmVideoSettingFragment uGCImmVideoSettingFragment, View view) {
        uGCImmVideoSettingFragment.m83761D0(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m83785x0(UGCImmVideoSettingFragment uGCImmVideoSettingFragment, View view) {
        uGCImmVideoSettingFragment.m83761D0(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m83786y0(UGCImmVideoSettingFragment uGCImmVideoSettingFragment, View view) {
        uGCImmVideoSettingFragment.m83761D0(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m83787z0(UGCImmVideoSettingFragment uGCImmVideoSettingFragment, View view) {
        uGCImmVideoSettingFragment.m83761D0(4);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m83788E0(Function1 function1) {
        this.onAutoplayChanged = function1;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m83789F0(Function0 function0) {
        this.onCleanModeClick = function0;
    }

    /* JADX INFO: renamed from: G0 */
    public final void m83790G0(Function1 function1) {
        this.onQualitySelected = function1;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m83791H0(Function1 function1) {
        this.onSpeedSelected = function1;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m83792I0(Function0 function0) {
        this.onSubtitleClick = function0;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initData(View view, Bundle savedInstanceState) {
        BLConstraintLayout bLConstraintLayout;
        BLConstraintLayout bLConstraintLayout2;
        Intrinsics.m97802h(view, "view");
        Collection collection = (Collection) m83774l0().m84138d().m14847f();
        if (collection == null || collection.isEmpty()) {
            C28447g mViewBinding = getMViewBinding();
            if (mViewBinding == null || (bLConstraintLayout = mViewBinding.f87296f) == null) {
                return;
            }
            AbstractC26006c.m102054g(bLConstraintLayout);
            return;
        }
        C28447g mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (bLConstraintLayout2 = mViewBinding2.f87296f) == null) {
            return;
        }
        AbstractC26006c.m102058k(bLConstraintLayout2);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initListener() {
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        m83782u0();
        m83780s0();
        m83759B0();
        m83778q0();
        m83776o0();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public C28447g getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28447g c28447gM109899c = C28447g.m109899c(inflater);
        Intrinsics.m97801g(c28447gM109899c, "inflate(...)");
        return c28447gM109899c;
    }
}
