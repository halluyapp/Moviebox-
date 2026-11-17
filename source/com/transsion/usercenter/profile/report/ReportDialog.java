package com.transsion.usercenter.profile.report;

import android.R;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3233y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.material.bottomsheet.DialogC10016c;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.net.bean.BaseDto;
import com.p282tn.lib.widget.R$style;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.baseui.util.C14557c;
import com.transsion.share.share.InterfaceC18701a;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.R$string;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p743rh.C27287m;
import p765s6.InterfaceC27566d;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 82\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0003J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R$\u00107\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006:"}, m97100d2 = {"Lcom/transsion/usercenter/profile/report/ReportDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "w0", "(Landroid/view/View;)V", "", "pos", "s0", "(Ljava/lang/Integer;)V", "", "u0", "()Ljava/lang/String;", "initLiveData", "", "Lcom/transsion/usercenter/profile/report/c;", "r0", "()Ljava/util/List;", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/transsion/usercenter/profile/report/ReportViewModel;", "c", "Lkotlin/Lazy;", "t0", "()Lcom/transsion/usercenter/profile/report/ReportViewModel;", "mViewModel", "Lcom/transsion/usercenter/profile/report/a;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/usercenter/profile/report/a;", "mAdapter", "e", "Ljava/lang/String;", "reportType", "f", "id", "Lcom/transsion/share/share/a;", "g", "Lcom/transsion/share/share/a;", "getShareItemCallback", "()Lcom/transsion/share/share/a;", "A0", "(Lcom/transsion/share/share/a;)V", "shareItemCallback", "h", "a", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ReportDialog extends BaseDialog {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C20738a mAdapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String reportType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String id;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private InterfaceC18701a shareItemCallback;

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.report.ReportDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ReportDialog m85461a(String str, String id2) {
            Intrinsics.m97802h(id2, "id");
            ReportDialog reportDialog = new ReportDialog();
            reportDialog.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("report_type", str), TuplesKt.m97108a("id", id2)));
            return reportDialog;
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.report.ReportDialog$b */
    static final class C20728b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65308a;

        C20728b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65308a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65308a;
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
            this.f65308a.invoke(obj);
        }
    }

    public ReportDialog() {
        super(R$layout.layout_report);
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.usercenter.profile.report.ReportDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.mViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(ReportViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.usercenter.profile.report.ReportDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.usercenter.profile.report.ReportDialog$special$$inlined$viewModels$default$3
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
    }

    private final void initLiveData() {
        m85453t0().m85472j().m14851j(getViewLifecycleOwner(), new C20728b(new Function1() { // from class: com.transsion.usercenter.profile.report.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReportDialog.m85455v0(this.f65317a, (BaseDto) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    private final List m85451r0() {
        String[] strArr = {getString(R$string.report_0), getString(R$string.report_1), getString(R$string.report_2), getString(R$string.report_3), getString(R$string.report_4), getString(R$string.report_5), getString(R$string.report_6), getString(R$string.report_7), getString(R$string.report_8)};
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 9; i11++) {
            String str = strArr[i11];
            Intrinsics.m97801g(str, "get(...)");
            arrayList.add(new C20740c(str, false));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s0 */
    private final void m85452s0(Integer pos) {
        List<Object> data;
        C20738a c20738a = this.mAdapter;
        if (c20738a != null && (data = c20738a.getData()) != null) {
            int i11 = 0;
            for (Object obj : data) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                ((C20740c) obj).m85484c(pos != null && i11 == pos.intValue());
                i11 = i12;
            }
        }
        C20738a c20738a2 = this.mAdapter;
        if (c20738a2 != null) {
            c20738a2.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: t0 */
    private final ReportViewModel m85453t0() {
        return (ReportViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: renamed from: u0 */
    private final String m85454u0() {
        List<Object> data;
        C20738a c20738a = this.mAdapter;
        if (c20738a == null || (data = c20738a.getData()) == null) {
            return null;
        }
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            C20740c c20740c = (C20740c) it.next();
            if (c20740c.m85483b()) {
                return c20740c.m85482a();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final Unit m85455v0(ReportDialog reportDialog, BaseDto baseDto) {
        C28951b.f88586a.m111454d(R$string.reported);
        reportDialog.dismissAllowingStateLoss();
        InterfaceC18701a interfaceC18701a = reportDialog.shareItemCallback;
        if (interfaceC18701a != null) {
            interfaceC18701a.mo70522b(reportDialog.id);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: w0 */
    private final void m85456w0(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R$id.report_list);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
            C20738a c20738a = new C20738a(m85451r0());
            c20738a.m36227w1(new InterfaceC27566d() { // from class: com.transsion.usercenter.profile.report.e
                @Override // p765s6.InterfaceC27566d
                /* JADX INFO: renamed from: a */
                public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                    ReportDialog.m85457x0(this.f65318a, baseQuickAdapter, view2, i11);
                }
            });
            this.mAdapter = c20738a;
            recyclerView.setAdapter(c20738a);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R$id.iv_close);
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.profile.report.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ReportDialog.m85458y0(this.f65319a, view2);
                }
            });
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R$id.btn_submit);
        if (appCompatTextView != null) {
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.profile.report.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ReportDialog.m85459z0(this.f65320a, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m85457x0(ReportDialog reportDialog, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        reportDialog.m85452s0(Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m85458y0(ReportDialog reportDialog, View view) {
        reportDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m85459z0(ReportDialog reportDialog, View view) {
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_tips);
            return;
        }
        if (C14557c.f51100a.m65671a(view.getId(), 2000L)) {
            return;
        }
        String strM85454u0 = reportDialog.m85454u0();
        if (strM85454u0 == null) {
            C28951b.f88586a.m111454d(R$string.tip_blank);
        } else {
            reportDialog.m85453t0().m85473l(reportDialog.reportType, reportDialog.id, strM85454u0);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m85460A0(InterfaceC18701a interfaceC18701a) {
        this.shareItemCallback = interfaceC18701a;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.m97802h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        DialogC10016c dialogC10016c = new DialogC10016c(requireContext(), R$style.BottomDialogTheme);
        dialogC10016c.m45494k().m45447U0(3);
        dialogC10016c.m45494k().m45446T0(true);
        return dialogC10016c;
    }

    @Override // com.transsion.baseui.dialog.BaseDialog, androidx.fragment.app.Fragment
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
        Bundle arguments = getArguments();
        this.reportType = arguments != null ? arguments.getString("report_type") : null;
        Bundle arguments2 = getArguments();
        this.id = arguments2 != null ? arguments2.getString("id") : null;
        m85456w0(view);
        initLiveData();
    }
}
