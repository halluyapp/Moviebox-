package com.transsion.shorttv_pugc.p317ui.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.push.PushConstants;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.R$style;
import com.transsion.shorttv_pugc.base.dialog.BaseDialog;
import com.transsion.shorttv_pugc.bean.Subject;
import com.transsion.shorttv_pugc.p317ui.fragment.download.ShortTVDownloadReFragment;
import com.transsion.shorttv_pugc.p317ui.fragment.download.ShortTVDownloadReWatchADFragment;
import com.transsion.shorttv_pugc.viewmodel.ShortTvDownloadViewModel;
import com.transsion.web.api.WebConstants;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.DownloadDialogShowEvent;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p550kj.C24655b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 B2\u00020\u0001:\u0001CB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010#\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010*R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010*R\u0018\u00107\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010*R\u0018\u00109\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010*R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006D"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/ui/dialog/ShortTvDownloadResDialog;", "Lcom/transsion/shorttv_pugc/base/dialog/BaseDialog;", "<init>", "()V", "", "initViewModel", "", "fragmentTag", "o0", "(Ljava/lang/String;)V", "l0", NativeComponentConstants.KEY_COMPONENT_TYPE, "Landroidx/fragment/app/Fragment;", "k0", "(Ljava/lang/String;)Landroidx/fragment/app/Fragment;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onDestroy", "outState", "onSaveInstanceState", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Landroidx/fragment/app/FragmentManager;", "manager", "tag", PushConstants.PUSH_SERVICE_TYPE_SHOW, "(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "basePageType", "c", "curPageType", "Lcom/transsion/shorttv_pugc/bean/Subject;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/shorttv_pugc/bean/Subject;", "subject", "e", "pageFrom", "f", "lastPageFrom", "g", "ops", "h", "moduleName", "", "i", "Z", "scroll2Download", "Lcom/transsion/shorttv_pugc/viewmodel/ShortTvDownloadViewModel;", "j", "Lcom/transsion/shorttv_pugc/viewmodel/ShortTvDownloadViewModel;", "viewModel", CampaignEx.JSON_KEY_AD_K, "a", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTvDownloadResDialog extends BaseDialog {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String basePageType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String curPageType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Subject subject;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String pageFrom;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String lastPageFrom;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String ops;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String moduleName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean scroll2Download;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private ShortTvDownloadViewModel viewModel;

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.dialog.ShortTvDownloadResDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ShortTvDownloadResDialog m80915a(String str, String str2, Subject subject, String str3, String str4, boolean z11) {
            ShortTvDownloadResDialog shortTvDownloadResDialog = new ShortTvDownloadResDialog();
            shortTvDownloadResDialog.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("download_page_type", "download_short_tv"), TuplesKt.m97108a(WebConstants.PAGE_FROM, str), TuplesKt.m97108a("last_page_from", str2), TuplesKt.m97108a("subject", subject), TuplesKt.m97108a("ops", str3), TuplesKt.m97108a("module_name", str4), TuplesKt.m97108a("download_scroll_to_download", Boolean.valueOf(z11))));
            return shortTvDownloadResDialog;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.dialog.ShortTvDownloadResDialog$b */
    static final class C19360b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f62087a;

        C19360b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f62087a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f62087a;
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
            this.f62087a.invoke(obj);
        }
    }

    public ShortTvDownloadResDialog() {
        super(R$layout.short_tv_dialog_download_res_main);
        this.basePageType = "download_short_tv";
        this.curPageType = "download_short_tv";
        this.pageFrom = "";
        this.lastPageFrom = "";
    }

    private final void initViewModel() {
        ShortTvDownloadViewModel shortTvDownloadViewModel = (ShortTvDownloadViewModel) new C3227v0(this).m14969a(ShortTvDownloadViewModel.class);
        shortTvDownloadViewModel.m81359e().m14851j(this, new C19360b(new Function1() { // from class: com.transsion.shorttv_pugc.ui.dialog.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvDownloadResDialog.m80912m0(this.f62098a, (String) obj);
            }
        }));
        this.viewModel = shortTvDownloadViewModel;
    }

    /* JADX INFO: renamed from: k0 */
    private final Fragment m80910k0(String type) {
        return Intrinsics.m97797c(type, "download_short_tv_ad") ? ShortTVDownloadReWatchADFragment.INSTANCE.m81164a() : ShortTVDownloadReFragment.INSTANCE.m81153a(this.pageFrom, this.lastPageFrom, this.subject, this.ops, this.moduleName, this.scroll2Download);
    }

    /* JADX INFO: renamed from: l0 */
    private final void m80911l0() {
        List listM14574y0 = getChildFragmentManager().m14574y0();
        Intrinsics.m97801g(listM14574y0, "getFragments(...)");
        Iterator it = listM14574y0.iterator();
        while (it.hasNext()) {
            getChildFragmentManager().m14557p().mo14676p((Fragment) it.next()).mo14673l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final Unit m80912m0(ShortTvDownloadResDialog shortTvDownloadResDialog, String str) {
        Intrinsics.m97799e(str);
        shortTvDownloadResDialog.m80914o0(str);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final boolean m80913n0(ShortTvDownloadResDialog shortTvDownloadResDialog, DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
        if (i11 != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        if (Intrinsics.m97797c(shortTvDownloadResDialog.curPageType, shortTvDownloadResDialog.basePageType)) {
            C26866a.a.m104898f(C26866a.f81698a, "DownloadReDetectorMainDialog", "back click~ dismiss", false, 4, null);
            shortTvDownloadResDialog.dismissAllowingStateLoss();
        } else {
            C26866a.a.m104898f(C26866a.f81698a, "DownloadReDetectorMainDialog", "back click~ show base", false, 4, null);
            shortTvDownloadResDialog.m80914o0(shortTvDownloadResDialog.basePageType);
        }
        return true;
    }

    /* JADX INFO: renamed from: o0 */
    private final void m80914o0(String fragmentTag) {
        C26866a.a.m104898f(C26866a.f81698a, "DownloadReDetectorMainDialog", "showFragment tag = " + fragmentTag, false, 4, null);
        this.curPageType = fragmentTag;
        setCancelable(Intrinsics.m97797c(fragmentTag, "download_short_tv_ad") ^ true);
        m80911l0();
        Fragment fragmentM14547k0 = getChildFragmentManager().m14547k0(fragmentTag);
        if (fragmentM14547k0 == null) {
            fragmentM14547k0 = m80910k0(fragmentTag);
        }
        if (fragmentM14547k0.isAdded()) {
            getChildFragmentManager().m14557p().mo14681y(fragmentM14547k0).mo14673l();
        } else {
            getChildFragmentManager().m14557p().m14806c(R$id.fl_container, fragmentM14547k0, fragmentTag).mo14673l();
        }
    }

    @Override // com.transsion.shorttv_pugc.base.dialog.BaseDialog
    public C24655b newLogViewConfig() {
        return new C24655b("download_main_dialog", false);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.m97802h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null ? savedInstanceState.getBoolean("key_download_save_instance") : false) {
            dismissAllowingStateLoss();
            return;
        }
        setStyle(0, R$style.ShortTvBottomDialogTheme);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("download_page_type")) == null) {
            string = "download_short_tv";
        }
        this.basePageType = string;
        Bundle arguments2 = getArguments();
        String str = "";
        if (arguments2 == null || (string2 = arguments2.getString(WebConstants.PAGE_FROM)) == null) {
            string2 = "";
        }
        this.pageFrom = string2;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string3 = arguments3.getString("last_page_from")) == null) {
            string3 = "";
        }
        this.lastPageFrom = string3;
        Bundle arguments4 = getArguments();
        Serializable serializable = arguments4 != null ? arguments4.getSerializable("subject") : null;
        this.subject = serializable instanceof Subject ? (Subject) serializable : null;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (string4 = arguments5.getString("ops")) == null) {
            string4 = "";
        }
        this.ops = string4;
        Bundle arguments6 = getArguments();
        if (arguments6 != null && (string5 = arguments6.getString("module_name")) != null) {
            str = string5;
        }
        this.moduleName = str;
        Bundle arguments7 = getArguments();
        this.scroll2Download = arguments7 != null ? arguments7.getBoolean("download_scroll_to_download", false) : false;
        initViewModel();
        m80914o0(this.basePageType);
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
        dialogOnCreateDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.transsion.shorttv_pugc.ui.dialog.a
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
                return ShortTvDownloadResDialog.m80913n0(this.f62097a, dialogInterface, i11, keyEvent);
            }
        });
        return dialogOnCreateDialog;
    }

    @Override // com.transsion.shorttv_pugc.base.dialog.BaseDialog, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.m97802h(dialog, "dialog");
        super.onDismiss(dialog);
        DownloadDialogShowEvent downloadDialogShowEvent = new DownloadDialogShowEvent(false);
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = DownloadDialogShowEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, downloadDialogShowEvent, 0L);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.m97802h(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("key_download_save_instance", true);
    }

    @Override // com.transsion.shorttv_pugc.base.dialog.BaseDialog, androidx.fragment.app.DialogFragment
    public void show(FragmentManager manager, String tag) {
        Intrinsics.m97802h(manager, "manager");
        super.show(manager, tag);
        DownloadDialogShowEvent downloadDialogShowEvent = new DownloadDialogShowEvent(true);
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = DownloadDialogShowEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, downloadDialogShowEvent, 0L);
    }
}
