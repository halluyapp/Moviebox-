package com.transsion.videodetail;

import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5790i;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.material.bottomsheet.DialogC10016c;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.dialog.BaseDialog;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.videodetail.adapter.C20939b;
import com.transsion.videodetail.adapter.C20940c;
import com.transsion.videodetail.bean.VideoDetailMediaSource;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import ng.AbstractC26006c;
import p586lx.C25748a;
import p765s6.InterfaceC27566d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, m97100d2 = {"Lcom/transsion/videodetail/VideoDetailEpisodeSelectDialog;", "Lcom/tn/lib/dialog/BaseDialog;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Llx/a;", "a", "Llx/a;", "dramaDialogEpisodeListBinding", "Landroidx/recyclerview/widget/GridLayoutManager;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroidx/recyclerview/widget/GridLayoutManager;", "gridLayoutManager", "Lcom/transsion/videodetail/adapter/b;", "c", "Lcom/transsion/videodetail/adapter/b;", "adapter", "Lcom/transsion/videodetail/VideoDetailViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lkotlin/Lazy;", "d0", "()Lcom/transsion/videodetail/VideoDetailViewModel;", "videoDetailViewModel", "", "e", "J", "lastClickTime", "VideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class VideoDetailEpisodeSelectDialog extends BaseDialog {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C25748a dramaDialogEpisodeListBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private GridLayoutManager gridLayoutManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C20939b adapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy videoDetailViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long lastClickTime;

    /* JADX INFO: renamed from: com.transsion.videodetail.VideoDetailEpisodeSelectDialog$a */
    static final class C20921a implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65705a;

        C20921a(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65705a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65705a;
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
            this.f65705a.invoke(obj);
        }
    }

    public VideoDetailEpisodeSelectDialog() {
        super(R$layout.dialog_episode);
        this.videoDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(VideoDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.videodetail.VideoDetailEpisodeSelectDialog$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.videodetail.VideoDetailEpisodeSelectDialog$special$$inlined$activityViewModels$default$2
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
    }

    /* JADX INFO: renamed from: d0 */
    private final VideoDetailViewModel m86096d0() {
        return (VideoDetailViewModel) this.videoDetailViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final void m86097e0(VideoDetailEpisodeSelectDialog videoDetailEpisodeSelectDialog, View view) {
        videoDetailEpisodeSelectDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final void m86098f0(VideoDetailEpisodeSelectDialog videoDetailEpisodeSelectDialog, C20939b c20939b, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        if (videoDetailEpisodeSelectDialog.lastClickTime == 0 || System.currentTimeMillis() - videoDetailEpisodeSelectDialog.lastClickTime > 1000) {
            videoDetailEpisodeSelectDialog.lastClickTime = System.currentTimeMillis();
            videoDetailEpisodeSelectDialog.m86096d0().m86119B((VideoDetailMediaSource) c20939b.m36182f0(i11));
            videoDetailEpisodeSelectDialog.dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final Unit m86099g0(VideoDetailEpisodeSelectDialog videoDetailEpisodeSelectDialog, List list) {
        C25748a c25748a;
        RecyclerView recyclerView;
        ProgressBar progressBar;
        C25748a c25748a2 = videoDetailEpisodeSelectDialog.dramaDialogEpisodeListBinding;
        if (c25748a2 != null && (progressBar = c25748a2.f78480c) != null) {
            AbstractC26006c.m102054g(progressBar);
        }
        if (list == null) {
            return Unit.f75682a;
        }
        if (list.size() >= 24 && (c25748a = videoDetailEpisodeSelectDialog.dramaDialogEpisodeListBinding) != null && (recyclerView = c25748a.f78481d) != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
            ((ViewGroup.MarginLayoutParams) c2308b).height = AbstractC5790i.m27411e(430.0f);
            recyclerView.setLayoutParams(c2308b);
        }
        C20939b c20939b = videoDetailEpisodeSelectDialog.adapter;
        if (c20939b != null) {
            c20939b.mo36208q(list);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final Unit m86100h0(VideoDetailEpisodeSelectDialog videoDetailEpisodeSelectDialog, VideoDetailMediaSource videoDetailMediaSource) {
        C20939b c20939b = videoDetailEpisodeSelectDialog.adapter;
        if (c20939b != null) {
            c20939b.m86184H1(videoDetailMediaSource);
        }
        return Unit.f75682a;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, com.transsion.baseui.R$style.BottomDialogTheme);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        DialogC10016c dialogC10016c = new DialogC10016c(requireContext(), com.transsion.baseui.R$style.BottomDialogTheme);
        dialogC10016c.m45494k().m45447U0(3);
        dialogC10016c.m45494k().m45446T0(true);
        return dialogC10016c;
    }

    @Override // com.p282tn.lib.dialog.BaseDialog, androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.getAttributes().gravity = 80;
        window.getAttributes().height = -2;
        View viewFindViewById = window.findViewById(com.google.android.material.R$id.design_bottom_sheet);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(R.color.transparent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C25748a c25748aM101264a = C25748a.m101264a(view);
        c25748aM101264a.f78479b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VideoDetailEpisodeSelectDialog.m86097e0(this.f65967a, view2);
            }
        });
        ProgressBar pbLoading = c25748aM101264a.f78480c;
        Intrinsics.m97801g(pbLoading, "pbLoading");
        AbstractC26006c.m102058k(pbLoading);
        c25748aM101264a.f78481d.addItemDecoration(new C20940c(AbstractC5790i.m27411e(12.0f)));
        RecyclerView recyclerView = c25748aM101264a.f78481d;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 3);
        this.gridLayoutManager = gridLayoutManager;
        recyclerView.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView2 = c25748aM101264a.f78481d;
        final C20939b c20939b = new C20939b(SubjectType.TV.getValue(), false, R$layout.item_video_detail_sel_dialog_episode);
        this.adapter = c20939b;
        c20939b.m36227w1(new InterfaceC27566d() { // from class: com.transsion.videodetail.x0
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                VideoDetailEpisodeSelectDialog.m86098f0(this.f65969a, c20939b, baseQuickAdapter, view2, i11);
            }
        });
        recyclerView2.setAdapter(c20939b);
        this.dramaDialogEpisodeListBinding = c25748aM101264a;
        m86096d0().m86124s().m14851j(this, new C20921a(new Function1() { // from class: com.transsion.videodetail.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoDetailEpisodeSelectDialog.m86099g0(this.f65972a, (List) obj);
            }
        }));
        m86096d0().m86129x().m14851j(this, new C20921a(new Function1() { // from class: com.transsion.videodetail.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoDetailEpisodeSelectDialog.m86100h0(this.f65974a, (VideoDetailMediaSource) obj);
            }
        }));
    }
}
