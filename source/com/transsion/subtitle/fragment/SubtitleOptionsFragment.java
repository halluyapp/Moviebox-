package com.transsion.subtitle.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.AbstractC2411d;
import androidx.p1004lifecycle.C3187b0;
import com.avery.subtitle.widget.SimpleSubtitleView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.subtitle.helper.C19719d;
import com.transsion.subtitle.helper.LocalVideoUiType;
import com.transsion.subtitle.view.SubtitleOptionsView;
import com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p559ku.C25435e;
import p559ku.C25439i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JK\u0010\u0011\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J!\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, m97100d2 = {"Lcom/transsion/subtitle/fragment/SubtitleOptionsFragment;", "Lcom/transsion/subtitle/fragment/SubtitleBaseFragment;", "Lku/e;", "<init>", "()V", "Lcom/transsion/subtitle/helper/LocalVideoUiType;", "layerType", "", "playerContainerHeight", "Lcom/avery/subtitle/widget/SimpleSubtitleView;", "subtitleViewTop", "subtitleViewBottom", "Landroid/view/ViewGroup;", "subtitleViewGroup", "Lcom/transsion/subtitle/helper/d;", "optionsHelper", "", "j0", "(Lcom/transsion/subtitle/helper/LocalVideoUiType;Ljava/lang/Integer;Lcom/avery/subtitle/widget/SimpleSubtitleView;Lcom/avery/subtitle/widget/SimpleSubtitleView;Landroid/view/ViewGroup;Lcom/transsion/subtitle/helper/d;)V", "Landroid/view/LayoutInflater;", "inflater", "h0", "(Landroid/view/LayoutInflater;)Lku/e;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "initView", "d0", "g", "Lcom/transsion/subtitle/helper/LocalVideoUiType;", "h", "Ljava/lang/Integer;", "i", "Lcom/transsion/subtitle/helper/d;", "j", "Lcom/avery/subtitle/widget/SimpleSubtitleView;", CampaignEx.JSON_KEY_AD_K, "l", "Landroid/view/ViewGroup;", "m", "a", "VideoSubtitle_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class SubtitleOptionsFragment extends SubtitleBaseFragment<C25435e> {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private LocalVideoUiType layerType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Integer playerContainerHeight;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private C19719d optionsHelper;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private SimpleSubtitleView subtitleViewTop;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private SimpleSubtitleView subtitleViewBottom;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private ViewGroup subtitleViewGroup;

    /* JADX INFO: renamed from: com.transsion.subtitle.fragment.SubtitleOptionsFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SubtitleOptionsFragment m82023a(LocalVideoUiType localVideoUiType, Integer num, SimpleSubtitleView simpleSubtitleView, SimpleSubtitleView simpleSubtitleView2, ViewGroup viewGroup, C19719d c19719d, String str) {
            SubtitleOptionsFragment subtitleOptionsFragment = new SubtitleOptionsFragment();
            subtitleOptionsFragment.m82021j0(localVideoUiType, num, simpleSubtitleView, simpleSubtitleView2, viewGroup, c19719d);
            subtitleOptionsFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("KEY_PAGE_NAME", str)));
            return subtitleOptionsFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final void m82020i0(SubtitleOptionsFragment subtitleOptionsFragment, View view) {
        C3187b0 c3187b0M82249h;
        SubtitleDownloadViewModel viewModel = subtitleOptionsFragment.getViewModel();
        if (viewModel == null || (c3187b0M82249h = viewModel.m82249h()) == null) {
            return;
        }
        c3187b0M82249h.mo14858q("SELECT_SUBTITLE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public final void m82021j0(LocalVideoUiType layerType, Integer playerContainerHeight, SimpleSubtitleView subtitleViewTop, SimpleSubtitleView subtitleViewBottom, ViewGroup subtitleViewGroup, C19719d optionsHelper) {
        this.layerType = layerType;
        this.playerContainerHeight = playerContainerHeight;
        this.subtitleViewTop = subtitleViewTop;
        this.subtitleViewBottom = subtitleViewBottom;
        this.subtitleViewGroup = subtitleViewGroup;
        this.optionsHelper = optionsHelper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.subtitle.fragment.SubtitleBaseFragment
    /* JADX INFO: renamed from: d0 */
    public void mo82016d0() {
        SubtitleOptionsView subtitleOptionsView;
        C25435e c25435e = (C25435e) getMViewBinding();
        if (c25435e == null || (subtitleOptionsView = c25435e.f77040b) == null) {
            return;
        }
        subtitleOptionsView.removeSubtitleOptions();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public C25435e getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25435e c25435eM100007c = C25435e.m100007c(inflater);
        Intrinsics.m97801g(c25435eM100007c, "inflate(...)");
        return c25435eM100007c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        SubtitleOptionsView subtitleOptionsView;
        Intrinsics.m97802h(view, "view");
        C25435e c25435e = (C25435e) getMViewBinding();
        if (c25435e == null || (subtitleOptionsView = c25435e.f77040b) == null) {
            return;
        }
        subtitleOptionsView.initOptions(this.layerType, this.playerContainerHeight, this.subtitleViewTop, this.subtitleViewBottom, this.subtitleViewGroup, getPageName(), this.optionsHelper);
        C25439i.m100022a(subtitleOptionsView).f77080c.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.subtitle.fragment.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SubtitleOptionsFragment.m82020i0(this.f62905a, view2);
            }
        });
        subtitleOptionsView.addSubtitleOptions();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.subtitle.fragment.SubtitleBaseFragment, com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m82017e0("dialog_subtitle_options");
    }
}
