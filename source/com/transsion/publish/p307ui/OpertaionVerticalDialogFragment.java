package com.transsion.publish.p307ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.bottomsheet.DialogC10016c;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.baseui.util.C14555a;
import com.transsion.publish.R$id;
import com.transsion.publish.R$layout;
import com.transsion.publish.R$style;
import com.transsion.publish.adapter.InterfaceC17546a;
import com.transsion.publish.view.operation.OperationBean;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p715qp.C27118i;
import p715qp.InterfaceC27111b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, m97100d2 = {"Lcom/transsion/publish/ui/OpertaionVerticalDialogFragment;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "o0", "(Landroid/view/View;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "", "Lcom/transsion/publish/view/operation/OperationBean;", "c", "Ljava/util/List;", "list", "Landroidx/recyclerview/widget/RecyclerView;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroidx/recyclerview/widget/RecyclerView;", CampaignEx.JSON_KEY_REWARD_TEMPLATE, "Lqp/i;", "e", "Lqp/i;", "adapter", "Lcom/transsion/publish/adapter/a;", "f", "Lcom/transsion/publish/adapter/a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "g", "a", "Publish_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class OpertaionVerticalDialogFragment extends BaseDialog {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private List list;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private RecyclerView rv;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private C27118i adapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private InterfaceC17546a listener;

    /* JADX INFO: renamed from: com.transsion.publish.ui.OpertaionVerticalDialogFragment$b */
    public static final class C17614b implements InterfaceC27111b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f58157b;

        C17614b(View view) {
            this.f58157b = view;
        }

        @Override // p715qp.InterfaceC27111b
        /* JADX INFO: renamed from: a */
        public void mo75459a(OperationBean item, int i11) {
            InterfaceC17546a interfaceC17546a;
            Intrinsics.m97802h(item, "item");
            int type = item.getType();
            if (type == 0) {
                InterfaceC17546a interfaceC17546a2 = OpertaionVerticalDialogFragment.this.listener;
                if (interfaceC17546a2 != null) {
                    Context context = this.f58157b.getContext();
                    Intrinsics.m97801g(context, "getContext(...)");
                    interfaceC17546a2.startPhoto(context);
                    return;
                }
                return;
            }
            if (type == 1) {
                InterfaceC17546a interfaceC17546a3 = OpertaionVerticalDialogFragment.this.listener;
                if (interfaceC17546a3 != null) {
                    Context context2 = this.f58157b.getContext();
                    Intrinsics.m97801g(context2, "getContext(...)");
                    interfaceC17546a3.startVideo(context2);
                    return;
                }
                return;
            }
            if (type == 2) {
                InterfaceC17546a interfaceC17546a4 = OpertaionVerticalDialogFragment.this.listener;
                if (interfaceC17546a4 != null) {
                    Context context3 = this.f58157b.getContext();
                    Intrinsics.m97801g(context3, "getContext(...)");
                    interfaceC17546a4.startAudio(context3);
                    return;
                }
                return;
            }
            if (type != 3) {
                if (type == 4 && (interfaceC17546a = OpertaionVerticalDialogFragment.this.listener) != null) {
                    Context context4 = this.f58157b.getContext();
                    Intrinsics.m97801g(context4, "getContext(...)");
                    interfaceC17546a.startLink(context4);
                    return;
                }
                return;
            }
            InterfaceC17546a interfaceC17546a5 = OpertaionVerticalDialogFragment.this.listener;
            if (interfaceC17546a5 != null) {
                Context context5 = this.f58157b.getContext();
                Intrinsics.m97801g(context5, "getContext(...)");
                interfaceC17546a5.startWork(context5);
            }
        }
    }

    public OpertaionVerticalDialogFragment() {
        super(R$layout.opertaion_vertical_layout);
        this.list = new ArrayList();
    }

    /* JADX INFO: renamed from: o0 */
    private final void m75458o0(View view) {
        this.rv = (RecyclerView) view.findViewById(R$id.f57972rv);
        C27118i c27118i = new C27118i();
        this.adapter = c27118i;
        c27118i.setData(this.list);
        RecyclerView recyclerView = this.rv;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
            recyclerView.setAdapter(this.adapter);
        }
        C27118i c27118i2 = this.adapter;
        if (c27118i2 != null) {
            c27118i2.m105513l(new C17614b(view));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.BottomDialogThemes);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        DialogC10016c dialogC10016c = new DialogC10016c(contextRequireContext, getTheme());
        Window window = dialogC10016c.getWindow();
        if (window != null) {
            window.setWindowAnimations(R$style.bottom_dialog_animations);
        }
        Window window2 = dialogC10016c.getWindow();
        if (window2 != null) {
            window2.setGravity(80);
            window2.setDimAmount(0.5f);
            WindowManager.LayoutParams attributes = window2.getAttributes();
            if (attributes == null) {
                attributes = new WindowManager.LayoutParams();
            }
            attributes.width = C14555a.f51098a.m65668b(contextRequireContext);
            attributes.height = -2;
            attributes.flags = 32;
            window2.setBackgroundDrawable(null);
            window2.setAttributes(attributes);
        }
        return dialogC10016c;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m75458o0(view);
    }
}
