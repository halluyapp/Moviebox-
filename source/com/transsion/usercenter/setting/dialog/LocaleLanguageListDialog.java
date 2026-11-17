package com.transsion.usercenter.setting.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.material.bottomsheet.DialogC10016c;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.transsion.baselib.locale.LocaleChangedHelper;
import com.transsion.baseui.R$style;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.setting.adapter.C20790b;
import com.transsion.usercenter.setting.dialog.LocaleLanguageListDialog;
import com.transsion.usercenter.setting.viewmodel.LocaleLanguageViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import p585lw.C25698b0;
import p765s6.InterfaceC27566d;
import p923xw.C28668a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, m97100d2 = {"Lcom/transsion/usercenter/setting/dialog/LocaleLanguageListDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "t0", "(Landroid/view/View;)V", "initAdapter", "r0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Llw/b0;", "c", "Llw/b0;", "viewBinding", "Lcom/transsion/usercenter/setting/adapter/b;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/usercenter/setting/adapter/b;", "adapter", "Lcom/transsion/usercenter/setting/viewmodel/LocaleLanguageViewModel;", "e", "Lcom/transsion/usercenter/setting/viewmodel/LocaleLanguageViewModel;", "viewModel", "f", "a", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class LocaleLanguageListDialog extends BaseDialog {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C25698b0 viewBinding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C20790b adapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private LocaleLanguageViewModel viewModel;

    /* JADX INFO: renamed from: com.transsion.usercenter.setting.dialog.LocaleLanguageListDialog$b */
    static final class C20810b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65470a;

        C20810b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65470a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65470a;
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
            this.f65470a.invoke(obj);
        }
    }

    public LocaleLanguageListDialog() {
        super(R$layout.dialog_locale_language);
    }

    private final void initAdapter() {
        RecyclerView recyclerView;
        final C20790b c20790b = new C20790b(new ArrayList());
        c20790b.m36227w1(new InterfaceC27566d() { // from class: yw.c
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                LocaleLanguageListDialog.m85706q0(c20790b, this, baseQuickAdapter, view, i11);
            }
        });
        this.adapter = c20790b;
        C25698b0 c25698b0 = this.viewBinding;
        if (c25698b0 == null || (recyclerView = c25698b0.f78103b) == null) {
            return;
        }
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(requireContext()));
        recyclerView.setAdapter(this.adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m85706q0(C20790b c20790b, LocaleLanguageListDialog localeLanguageListDialog, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        if (item instanceof C28668a) {
            LocaleChangedHelper.f50887a.m65195a(c20790b.getContext(), ((C28668a) item).m110479b());
        }
        localeLanguageListDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: r0 */
    private final void m85707r0() {
        Context context = getContext();
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            LocaleLanguageViewModel localeLanguageViewModel = (LocaleLanguageViewModel) new C3227v0(appCompatActivity).m14969a(LocaleLanguageViewModel.class);
            localeLanguageViewModel.m85832e().m14851j(appCompatActivity, new C20810b(new Function1() { // from class: yw.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LocaleLanguageListDialog.m85708s0(this.f88776a, (List) obj);
                }
            }));
            localeLanguageViewModel.m85831d();
            this.viewModel = localeLanguageViewModel;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final Unit m85708s0(LocaleLanguageListDialog localeLanguageListDialog, List list) {
        C20790b c20790b = localeLanguageListDialog.adapter;
        if (c20790b != null) {
            c20790b.mo36201n1(list);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: t0 */
    private final void m85709t0(View view) {
        AppCompatTextView appCompatTextView;
        C25698b0 c25698b0M101098a = C25698b0.m101098a(view);
        this.viewBinding = c25698b0M101098a;
        if (c25698b0M101098a == null || (appCompatTextView = c25698b0M101098a.f78104c) == null) {
            return;
        }
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: yw.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LocaleLanguageListDialog.m85710u0(this.f88777a, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m85710u0(LocaleLanguageListDialog localeLanguageListDialog, View view) {
        localeLanguageListDialog.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.BottomDialogTheme);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        DialogC10016c dialogC10016c = new DialogC10016c(contextRequireContext, getTheme());
        Window window = dialogC10016c.getWindow();
        if (window != null) {
            window.setWindowAnimations(R$style.BaseBottomDialogAnimation);
            window.setGravity(80);
            window.setDimAmount(0.5f);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes == null) {
                attributes = new WindowManager.LayoutParams();
            }
            attributes.width = AbstractC5806y.m27489e();
            window.setAttributes(attributes);
            window.setBackgroundDrawable(null);
        }
        return dialogC10016c;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m85709t0(view);
        initAdapter();
        m85707r0();
    }
}
