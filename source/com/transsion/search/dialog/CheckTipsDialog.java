package com.transsion.search.dialog;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search.R$style;
import com.transsion.search.dialog.CheckTipsDialog;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p917xq.InterfaceC28630a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017¨\u0006\u001f"}, m97100d2 = {"Lcom/transsion/search/dialog/CheckTipsDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "p0", "(Landroid/view/View;)V", "Lxq/a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "s0", "(Lxq/a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "c", "Lxq/a;", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/String;", CampaignEx.JSON_KEY_TITLE, "e", "btnLeft", "f", "btnRight", "g", "a", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class CheckTipsDialog extends BaseDialog {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private InterfaceC28630a listener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String btnLeft;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String btnRight;

    /* JADX INFO: renamed from: com.transsion.search.dialog.CheckTipsDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final CheckTipsDialog m77671a() {
            return new CheckTipsDialog();
        }
    }

    public CheckTipsDialog() {
        super(R$layout.dialog_check);
        this.title = "";
        this.btnLeft = "";
        this.btnRight = "";
    }

    /* JADX INFO: renamed from: p0 */
    private final void m77667p0(View view) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        View viewFindViewById = view.findViewById(R$id.btn_left);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: xq.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CheckTipsDialog.m77668q0(this.f87843a, view2);
                }
            });
        }
        View viewFindViewById2 = view.findViewById(R$id.btn_yes);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: xq.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CheckTipsDialog.m77669r0(this.f87844a, view2);
                }
            });
        }
        if (!TextUtils.isEmpty(this.title) && (textView3 = (TextView) view.findViewById(R$id.tv_tips)) != null) {
            textView3.setText(this.title);
        }
        if (!TextUtils.isEmpty(this.btnLeft) && (textView2 = (TextView) view.findViewById(R$id.btn_yes)) != null) {
            textView2.setText(this.btnLeft);
        }
        if (TextUtils.isEmpty(this.btnRight) || (textView = (TextView) view.findViewById(R$id.btn_left)) == null) {
            return;
        }
        textView.setText(this.btnRight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m77668q0(CheckTipsDialog checkTipsDialog, View view) {
        InterfaceC28630a interfaceC28630a = checkTipsDialog.listener;
        if (interfaceC28630a != null) {
            interfaceC28630a.mo77739a();
        }
        checkTipsDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final void m77669r0(CheckTipsDialog checkTipsDialog, View view) {
        InterfaceC28630a interfaceC28630a = checkTipsDialog.listener;
        if (interfaceC28630a != null) {
            interfaceC28630a.mo77740b();
        }
        checkTipsDialog.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.BaseDialogStyle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m77667p0(view);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m77670s0(InterfaceC28630a listener) {
        Intrinsics.m97802h(listener, "listener");
        this.listener = listener;
    }
}
