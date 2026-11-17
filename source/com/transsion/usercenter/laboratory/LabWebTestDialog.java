package com.transsion.usercenter.laboratory;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;
import com.mbridge.msdk.MBridgeConstans;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.R$style;
import com.transsion.web.api.WebPageIdentity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p585lw.C25695a0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m97100d2 = {"Lcom/transsion/usercenter/laboratory/LabWebTestDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "c", "a", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class LabWebTestDialog extends BaseDialog {
    public LabWebTestDialog() {
        super(R$layout.dialog_lab_web);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final void m84867o0(C25695a0 c25695a0, LabWebTestDialog labWebTestDialog, View view) {
        Editable text = c25695a0.f78086c.getText();
        String string = text != null ? text.toString() : null;
        if (string == null || string.length() == 0) {
            Toast.makeText(labWebTestDialog.getContext(), "url is empty", 1).show();
            return;
        }
        C14496b.f50966a.m65344b().putString("key_web_test_url", string);
        Navigator.m61845x(TheRouter.m61773c(WebPageIdentity.WEB_VIEW).m61857K("url", string), labWebTestDialog.getContext(), null, 2, null);
        labWebTestDialog.dismiss();
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
        final C25695a0 c25695a0M101088a = C25695a0.m101088a(view);
        Intrinsics.m97801g(c25695a0M101088a, "bind(...)");
        String string = C14496b.f50966a.m65344b().getString("key_web_test_url", "");
        c25695a0M101088a.f78086c.setText(string != null ? string : "");
        c25695a0M101088a.f78085b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LabWebTestDialog.m84867o0(c25695a0M101088a, this, view2);
            }
        });
    }
}
