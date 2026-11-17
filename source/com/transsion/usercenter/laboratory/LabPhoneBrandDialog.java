package com.transsion.usercenter.laboratory;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.tencent.mmkv.MMKV;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.baseui.widget.EditTextWithClear;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.R$style;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p411fh.C23366a;
import p585lw.C25726p;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0019\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m97100d2 = {"Lcom/transsion/usercenter/laboratory/LabPhoneBrandDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "", MimeTypes.BASE_TYPE_TEXT, "", "q0", "(Ljava/lang/String;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "u0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "v", "onClick", "(Landroid/view/View;)V", "Llw/p;", "c", "Llw/p;", "getViewBinding", "()Llw/p;", "setViewBinding", "(Llw/p;)V", "viewBinding", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class LabPhoneBrandDialog extends BaseDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C25726p viewBinding;

    public LabPhoneBrandDialog() {
        super(R$layout.dialog_lab_brand);
    }

    /* JADX INFO: renamed from: q0 */
    private final void m84850q0(String text) {
        if (text == null || text.length() == 0) {
            C28951b.f88586a.m111455e("text is null~");
            return;
        }
        m84854u0(text);
        Toast.makeText(getContext(), "set brand:" + text + " success", 1).show();
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final void m84851r0(LabPhoneBrandDialog labPhoneBrandDialog, View view) {
        labPhoneBrandDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m84852s0(LabPhoneBrandDialog labPhoneBrandDialog, View view) {
        EditTextWithClear editTextWithClear;
        C25726p c25726p = labPhoneBrandDialog.viewBinding;
        labPhoneBrandDialog.m84850q0(String.valueOf((c25726p == null || (editTextWithClear = c25726p.f78342d) == null) ? null : editTextWithClear.getText()));
        labPhoneBrandDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final void m84853t0(LabPhoneBrandDialog labPhoneBrandDialog, View view) {
        Toast.makeText(labPhoneBrandDialog.getContext(), "reset success", 1).show();
        MMKV mmkvM92790c = C23366a.f71263a.m92790c();
        if (mmkvM92790c != null) {
            mmkvM92790c.putString("phone_brand", "");
        }
        labPhoneBrandDialog.dismiss();
    }

    /* JADX INFO: renamed from: u0 */
    private final void m84854u0(String value) {
        MMKV mmkvM92790c = C23366a.f71263a.m92790c();
        if (mmkvM92790c != null) {
            mmkvM92790c.putString("phone_brand", value);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        m84850q0(v11 instanceof TextView ? ((TextView) v11).getText().toString() : "");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.BaseDialogStyle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        AppCompatTextView appCompatTextView5;
        AppCompatTextView appCompatTextView6;
        AppCompatTextView appCompatTextView7;
        AppCompatTextView appCompatTextView8;
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.viewBinding = C25726p.m101199a(view);
        MMKV mmkvM92790c = C23366a.f71263a.m92790c();
        String string = mmkvM92790c != null ? mmkvM92790c.getString("phone_brand", "") : null;
        C25726p c25726p = this.viewBinding;
        if (c25726p != null && (appCompatTextView8 = c25726p.f78343e) != null) {
            appCompatTextView8.setText(string);
        }
        C25726p c25726p2 = this.viewBinding;
        if (c25726p2 != null && (appCompatTextView7 = c25726p2.f78340b) != null) {
            appCompatTextView7.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LabPhoneBrandDialog.m84851r0(this.f64896a, view2);
                }
            });
        }
        C25726p c25726p3 = this.viewBinding;
        if (c25726p3 != null && (appCompatTextView6 = c25726p3.f78341c) != null) {
            appCompatTextView6.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LabPhoneBrandDialog.m84852s0(this.f64899a, view2);
                }
            });
        }
        C25726p c25726p4 = this.viewBinding;
        if (c25726p4 != null && (appCompatTextView5 = c25726p4.f78347i) != null) {
            appCompatTextView5.setOnClickListener(this);
        }
        C25726p c25726p5 = this.viewBinding;
        if (c25726p5 != null && (appCompatTextView4 = c25726p5.f78344f) != null) {
            appCompatTextView4.setOnClickListener(this);
        }
        C25726p c25726p6 = this.viewBinding;
        if (c25726p6 != null && (appCompatTextView3 = c25726p6.f78345g) != null) {
            appCompatTextView3.setOnClickListener(this);
        }
        C25726p c25726p7 = this.viewBinding;
        if (c25726p7 != null && (appCompatTextView2 = c25726p7.f78346h) != null) {
            appCompatTextView2.setOnClickListener(this);
        }
        C25726p c25726p8 = this.viewBinding;
        if (c25726p8 == null || (appCompatTextView = c25726p8.f78348j) == null) {
            return;
        }
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LabPhoneBrandDialog.m84853t0(this.f64902a, view2);
            }
        });
    }
}
