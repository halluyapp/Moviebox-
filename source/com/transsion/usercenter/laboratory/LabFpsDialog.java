package com.transsion.usercenter.laboratory;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import com.mbridge.msdk.MBridgeConstans;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.R$style;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p585lw.C25734t;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m97100d2 = {"Lcom/transsion/usercenter/laboratory/LabFpsDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Llw/t;", "c", "Llw/t;", "viewBinding", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class LabFpsDialog extends BaseDialog {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C25734t viewBinding;

    public LabFpsDialog() {
        super(R$layout.dialog_lab_fps_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m84814q0(LabFpsDialog labFpsDialog, View view) {
        labFpsDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final void m84815r0(LabFpsDialog labFpsDialog, View view) {
        labFpsDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m84816s0(RadioGroup radioGroup, int i11) {
        if (i11 == R$id.radioButtonFpsOpen) {
            C28951b.f88586a.m111455e("show fps");
            C14496b.f50966a.m65344b().putString("debug_fps", MRAIDPresenter.OPEN);
        } else if (i11 == R$id.radioButtonFpsClose) {
            C28951b.f88586a.m111455e("dismiss fps");
            C14496b.f50966a.m65344b().putString("debug_fps", "close");
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.BaseDialogStyle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        RadioGroup radioGroup;
        Button button;
        Button button2;
        RadioGroup radioGroup2;
        RadioGroup radioGroup3;
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.viewBinding = C25734t.m101221a(view);
        if (getActivity() != null) {
            if (Intrinsics.m97797c(C14496b.f50966a.m65344b().getString("debug_fps", ""), MRAIDPresenter.OPEN)) {
                C25734t c25734t = this.viewBinding;
                if (c25734t != null && (radioGroup3 = c25734t.f78387f) != null) {
                    radioGroup3.check(R$id.radioButtonFpsOpen);
                }
            } else {
                C25734t c25734t2 = this.viewBinding;
                if (c25734t2 != null && (radioGroup2 = c25734t2.f78387f) != null) {
                    radioGroup2.check(R$id.radioButtonFpsClose);
                }
            }
        }
        C25734t c25734t3 = this.viewBinding;
        if (c25734t3 != null && (button2 = c25734t3.f78383b) != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LabFpsDialog.m84814q0(this.f64926a, view2);
                }
            });
        }
        C25734t c25734t4 = this.viewBinding;
        if (c25734t4 != null && (button = c25734t4.f78384c) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LabFpsDialog.m84815r0(this.f64928a, view2);
                }
            });
        }
        C25734t c25734t5 = this.viewBinding;
        if (c25734t5 == null || (radioGroup = c25734t5.f78387f) == null) {
            return;
        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.transsion.usercenter.laboratory.o
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup4, int i11) {
                LabFpsDialog.m84816s0(radioGroup4, i11);
            }
        });
    }
}
