package com.transsion.shorttv_pugc.p317ui.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.shorttv.R$style;
import com.transsion.shorttv_pugc.base.dialog.BaseViewBindingDialog;
import com.transsion.shorttv_pugc.base.widget.NpaLinearLayoutManager;
import com.transsion.shorttv_pugc.bean.DubsInfo;
import com.transsion.shorttv_pugc.p317ui.adapter.C19325h;
import com.transsion.shorttv_pugc.viewmodel.ShortTvViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import cu.C22778a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p623nt.C26102c;
import p765s6.InterfaceC27566d;
import pg.C26866a;
import rs.C27366t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0005\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R.\u00101\u001a\u001c\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/ui/dialog/ShortTvLanguageSelectDialog;", "Lcom/transsion/shorttv_pugc/base/dialog/BaseViewBindingDialog;", "Lrs/t;", "<init>", "()V", "", "initView", "m0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "c", "Ljava/lang/String;", "TAG", "Lcom/transsion/shorttv_pugc/viewmodel/ShortTvViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lkotlin/Lazy;", "getShortTvViewModel", "()Lcom/transsion/shorttv_pugc/viewmodel/ShortTvViewModel;", "shortTvViewModel", "Lcu/a;", "e", "getShortTvSubViewModel", "()Lcu/a;", "shortTvSubViewModel", "Lcom/transsion/shorttv_pugc/ui/adapter/h;", "f", "Lcom/transsion/shorttv_pugc/ui/adapter/h;", "selectAdapter", "Lkotlin/Function1;", "Lcom/transsion/shorttv_pugc/bean/DubsInfo;", "g", "Lkotlin/jvm/functions/Function1;", "callback", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "i0", "()Lkotlin/jvm/functions/Function3;", "bindingInflater", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTvLanguageSelectDialog extends BaseViewBindingDialog<C27366t> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String TAG = "ShortTvLanguageSelectDialog";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy shortTvViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(ShortTvViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.shorttv_pugc.ui.dialog.ShortTvLanguageSelectDialog$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.shorttv_pugc.ui.dialog.ShortTvLanguageSelectDialog$special$$inlined$activityViewModels$default$2
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
    private final Lazy shortTvSubViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(C22778a.class), new Function0<C3231x0>() { // from class: com.transsion.shorttv_pugc.ui.dialog.ShortTvLanguageSelectDialog$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.shorttv_pugc.ui.dialog.ShortTvLanguageSelectDialog$special$$inlined$activityViewModels$default$4
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

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private C19325h selectAdapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Function1 callback;

    private final void initView() {
        RecyclerView recyclerView;
        AppCompatImageView appCompatImageView;
        C27366t c27366t = (C27366t) getViewBinding();
        if (c27366t != null && (appCompatImageView = c27366t.f83329b) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.ui.dialog.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShortTvLanguageSelectDialog.m80925n0(this.f62105a, view);
                }
            });
        }
        C19325h c19325h = new C19325h();
        c19325h.m36227w1(new InterfaceC27566d() { // from class: com.transsion.shorttv_pugc.ui.dialog.f
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ShortTvLanguageSelectDialog.m80926o0(this.f62106a, baseQuickAdapter, view, i11);
            }
        });
        this.selectAdapter = c19325h;
        C27366t c27366t2 = (C27366t) getViewBinding();
        if (c27366t2 == null || (recyclerView = c27366t2.f83331d) == null) {
            return;
        }
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.selectAdapter);
    }

    /* JADX INFO: renamed from: m0 */
    private final void m80924m0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final void m80925n0(ShortTvLanguageSelectDialog shortTvLanguageSelectDialog, View view) {
        shortTvLanguageSelectDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final void m80926o0(ShortTvLanguageSelectDialog shortTvLanguageSelectDialog, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C26102c.f79666a.m102236a(view.getId(), 1000L)) {
            return;
        }
        Object item = adapter.getItem(i11);
        DubsInfo dubsInfo = item instanceof DubsInfo ? (DubsInfo) item : null;
        if (dubsInfo == null) {
            C26866a.a.m104898f(C26866a.f81698a, "ShortTvLan", "item为空？", false, 4, null);
            shortTvLanguageSelectDialog.dismissAllowingStateLoss();
            return;
        }
        if (dubsInfo.getIsSelected()) {
            C26866a.a.m104898f(C26866a.f81698a, "ShortTvLan", "已选中 直接关闭弹窗", false, 4, null);
            shortTvLanguageSelectDialog.dismissAllowingStateLoss();
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "ShortTvLan", "选中 :" + dubsInfo.getLanName(), false, 4, null);
        Function1 function1 = shortTvLanguageSelectDialog.callback;
        if (function1 != null) {
            function1.invoke(dubsInfo);
        }
        shortTvLanguageSelectDialog.dismissAllowingStateLoss();
    }

    @Override // com.transsion.shorttv_pugc.base.dialog.BaseViewBindingDialog
    /* JADX INFO: renamed from: i0 */
    public Function3 mo80471i0() {
        return ShortTvLanguageSelectDialog$bindingInflater$1.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.ShortTvBottomDialogTheme);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.m97801g(dialogOnCreateDialog, "onCreateDialog(...)");
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setWindowAnimations(R$style.ShortTvBottomDialogAnimation);
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
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        m80924m0();
    }
}
