package com.transsion.usercenter.laboratory;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.dialog.BaseViewBindingDialog;
import com.transsion.baseui.widget.EditTextWithClear;
import com.transsion.usercenter.R$style;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p585lw.C25742x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR.\u0010\u0014\u001a\u001c\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m97100d2 = {"Lcom/transsion/usercenter/laboratory/LabLocationDialog;", "Lcom/transsion/baseui/dialog/BaseViewBindingDialog;", "Llw/x;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "n0", "()Lkotlin/jvm/functions/Function3;", "bindingInflater", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "a", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class LabLocationDialog extends BaseViewBindingDialog<C25742x> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final void m84840r0(LabLocationDialog labLocationDialog, View view) {
        EditTextWithClear editTextWithClear;
        Editable text;
        EditTextWithClear editTextWithClear2;
        Editable text2;
        EditTextWithClear editTextWithClear3;
        Editable text3;
        EditTextWithClear editTextWithClear4;
        Editable text4;
        C25742x c25742x = (C25742x) labLocationDialog.getViewBinding();
        String string = null;
        String string2 = (c25742x == null || (editTextWithClear4 = c25742x.f78439e) == null || (text4 = editTextWithClear4.getText()) == null) ? null : text4.toString();
        C25742x c25742x2 = (C25742x) labLocationDialog.getViewBinding();
        String string3 = (c25742x2 == null || (editTextWithClear3 = c25742x2.f78440f) == null || (text3 = editTextWithClear3.getText()) == null) ? null : text3.toString();
        C25742x c25742x3 = (C25742x) labLocationDialog.getViewBinding();
        String string4 = (c25742x3 == null || (editTextWithClear2 = c25742x3.f78441g) == null || (text2 = editTextWithClear2.getText()) == null) ? null : text2.toString();
        C25742x c25742x4 = (C25742x) labLocationDialog.getViewBinding();
        if (c25742x4 != null && (editTextWithClear = c25742x4.f78438d) != null && (text = editTextWithClear.getText()) != null) {
            string = text.toString();
        }
        if (string2 == null || string2.length() == 0) {
            Toast.makeText(labLocationDialog.getContext(), "lat is empty", 1).show();
            return;
        }
        if (string3 == null || string3.length() == 0) {
            Toast.makeText(labLocationDialog.getContext(), "lon is empty", 1).show();
            return;
        }
        if (string4 == null || string4.length() == 0) {
            Toast.makeText(labLocationDialog.getContext(), "name is empty", 1).show();
            return;
        }
        if (string == null || string.length() == 0) {
            Toast.makeText(labLocationDialog.getContext(), "address is empty", 1).show();
            return;
        }
        C14496b.f50966a.m65344b().putString("key_lo_mock_test_lab_lat", string2 + "|" + string3 + "|" + string4 + "|" + string);
        labLocationDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m84841s0(LabLocationDialog labLocationDialog, View view) {
        EditTextWithClear editTextWithClear;
        EditTextWithClear editTextWithClear2;
        EditTextWithClear editTextWithClear3;
        EditTextWithClear editTextWithClear4;
        C14496b.f50966a.m65344b().putString("key_lo_mock_test_lab_lat", "");
        C25742x c25742x = (C25742x) labLocationDialog.getViewBinding();
        if (c25742x != null && (editTextWithClear4 = c25742x.f78439e) != null) {
            editTextWithClear4.setText("");
        }
        C25742x c25742x2 = (C25742x) labLocationDialog.getViewBinding();
        if (c25742x2 != null && (editTextWithClear3 = c25742x2.f78440f) != null) {
            editTextWithClear3.setText("");
        }
        C25742x c25742x3 = (C25742x) labLocationDialog.getViewBinding();
        if (c25742x3 != null && (editTextWithClear2 = c25742x3.f78441g) != null) {
            editTextWithClear2.setText("");
        }
        C25742x c25742x4 = (C25742x) labLocationDialog.getViewBinding();
        if (c25742x4 != null && (editTextWithClear = c25742x4.f78438d) != null) {
            editTextWithClear.setText("");
        }
        labLocationDialog.dismiss();
    }

    @Override // com.transsion.baseui.dialog.BaseViewBindingDialog
    /* JADX INFO: renamed from: n0 */
    public Function3 mo65514n0() {
        return LabLocationDialog$bindingInflater$1.INSTANCE;
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
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        String string = C14496b.f50966a.m65344b().getString("key_lo_mock_test_lab_lat", "");
        if (string != null && string.length() != 0 && StringsKt.m98132c0(string, "|", false, 2, null)) {
            List listS0 = StringsKt.m98117S0(string, new String[]{"|"}, false, 0, 6, null);
            C25742x c25742x = (C25742x) getViewBinding();
            if (c25742x != null) {
                c25742x.f78439e.setText((CharSequence) listS0.get(0));
                c25742x.f78440f.setText((CharSequence) listS0.get(1));
                c25742x.f78441g.setText((CharSequence) listS0.get(2));
                c25742x.f78438d.setText((CharSequence) listS0.get(3));
            }
        }
        C25742x c25742x2 = (C25742x) getViewBinding();
        if (c25742x2 != null && (appCompatTextView2 = c25742x2.f78436b) != null) {
            appCompatTextView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LabLocationDialog.m84840r0(this.f64948a, view2);
                }
            });
        }
        C25742x c25742x3 = (C25742x) getViewBinding();
        if (c25742x3 == null || (appCompatTextView = c25742x3.f78437c) == null) {
            return;
        }
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LabLocationDialog.m84841s0(this.f64950a, view2);
            }
        });
    }
}
