package com.transsion.member.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import bn.C4855d;
import com.google.android.material.bottomsheet.DialogC10016c;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baseui.R$style;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.baseui.util.C14555a;
import com.transsion.member.C15777a;
import com.transsion.member.R$layout;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p352dn.InterfaceC23006j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0002\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001c\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, m97100d2 = {"Lcom/transsion/member/dialog/PurchaseSucceedDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "", CampaignEx.JSON_KEY_TITLE, "buttonTitle", "Ldn/j;", "callback", "(Ljava/lang/String;Ljava/lang/String;Ldn/j;)V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "s0", "(Ldn/j;)V", "t0", "(Ljava/lang/String;)V", "r0", "Lbn/d;", "c", "Lbn/d;", "bind", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/String;", "e", "f", "Ldn/j;", "mCallback", "g", "a", "Member_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class PurchaseSucceedDialog extends BaseDialog {

    /* JADX INFO: renamed from: h */
    public static final int f54289h = 8;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C4855d bind;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String buttonTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private InterfaceC23006j mCallback;

    public PurchaseSucceedDialog() {
        super(R$layout.dialog_fragment_purchase_succeed);
    }

    public PurchaseSucceedDialog(String str, String str2, InterfaceC23006j interfaceC23006j) {
        this();
        this.title = str;
        this.buttonTitle = str2;
        this.mCallback = interfaceC23006j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final void m70057p0(PurchaseSucceedDialog purchaseSucceedDialog, View view) {
        purchaseSucceedDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m70058q0(PurchaseSucceedDialog purchaseSucceedDialog, View view) {
        purchaseSucceedDialog.dismissAllowingStateLoss();
        InterfaceC23006j interfaceC23006j = purchaseSucceedDialog.mCallback;
        if (interfaceC23006j != null) {
            interfaceC23006j.mo69823a();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.BottomDialogTheme);
        C15777a.f54210a.m69947a(getClassTag() + " --> onCreate()");
        if (savedInstanceState != null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        DialogC10016c dialogC10016c = new DialogC10016c(contextRequireContext, getTheme());
        Window window = dialogC10016c.getWindow();
        if (window != null) {
            window.setWindowAnimations(R$style.BaseBottomDialogAnimation);
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
            window2.setBackgroundDrawable(null);
            window2.setAttributes(attributes);
        }
        return dialogC10016c;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.m97802h(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString(CampaignEx.JSON_KEY_TITLE, this.title);
        outState.putString("buttonTitle", this.buttonTitle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        LinearLayoutCompat linearLayoutCompat;
        AppCompatTextView appCompatTextView;
        TextView textView;
        ImageView imageView;
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(true);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
        C4855d c4855dM23359a = C4855d.m23359a(view);
        this.bind = c4855dM23359a;
        if (c4855dM23359a != null && (imageView = c4855dM23359a.f17189e) != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.member.dialog.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PurchaseSucceedDialog.m70057p0(this.f54319a, view2);
                }
            });
        }
        C4855d c4855d = this.bind;
        if (c4855d != null && (textView = c4855d.f17192h) != null) {
            textView.setText(this.title);
        }
        C4855d c4855d2 = this.bind;
        if (c4855d2 != null && (appCompatTextView = c4855d2.f17188d) != null) {
            appCompatTextView.setText(this.buttonTitle);
        }
        C4855d c4855d3 = this.bind;
        if (c4855d3 == null || (linearLayoutCompat = c4855d3.f17187c) == null) {
            return;
        }
        linearLayoutCompat.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.member.dialog.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PurchaseSucceedDialog.m70058q0(this.f54320a, view2);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final void m70059r0(String buttonTitle) {
        this.buttonTitle = buttonTitle;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m70060s0(InterfaceC23006j callback) {
        this.mCallback = callback;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m70061t0(String title) {
        this.title = title;
    }
}
