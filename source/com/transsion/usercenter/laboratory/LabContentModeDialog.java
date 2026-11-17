package com.transsion.usercenter.laboratory;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import ck.C5110g;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.R$style;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p585lw.C25730r;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, m97100d2 = {"Lcom/transsion/usercenter/laboratory/LabContentModeDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Llw/r;", "c", "Llw/r;", "viewBinding", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Z", "isUGCMode", "e", "isResetMode", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class LabContentModeDialog extends BaseDialog {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C25730r viewBinding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isUGCMode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isResetMode;

    public LabContentModeDialog() {
        super(R$layout.dialog_lab_content_mode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m84791q0(LabContentModeDialog labContentModeDialog, View view) {
        labContentModeDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final void m84792r0(LabContentModeDialog labContentModeDialog, View view) {
        if (labContentModeDialog.isResetMode) {
            C28951b.f88586a.m111455e("当前媒体播放模式已使用线上配置");
            C14496b.f50966a.m65344b().remove("key_or_content_mode_local");
        } else {
            C28951b.f88586a.m111455e("当前媒体播放模式是 playMode = " + (labContentModeDialog.isUGCMode ? "UGCVideo" : "Subject"));
            C5110g.f17601a.m23912e(labContentModeDialog.isUGCMode);
            C14496b.f50966a.m65344b().putInt("key_or_content_mode_local", labContentModeDialog.isUGCMode ? 1 : 0);
        }
        labContentModeDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m84793s0(LabContentModeDialog labContentModeDialog, RadioGroup radioGroup, int i11) {
        if (i11 == R$id.radioButtonSubject) {
            labContentModeDialog.isUGCMode = false;
            labContentModeDialog.isResetMode = false;
        } else if (i11 == R$id.radioButtonUGCVideo) {
            labContentModeDialog.isUGCMode = true;
            labContentModeDialog.isResetMode = false;
        } else if (i11 == R$id.radioButtonReset) {
            labContentModeDialog.isUGCMode = false;
            labContentModeDialog.isResetMode = true;
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
        RadioGroup radioGroup2;
        RadioGroup radioGroup3;
        Button button;
        Button button2;
        RadioGroup radioGroup4;
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.viewBinding = C25730r.m101211a(view);
        if (C14496b.f50966a.m65344b().getInt("key_or_content_mode_local", -1) == -1) {
            C25730r c25730r = this.viewBinding;
            if (c25730r != null && (radioGroup4 = c25730r.f78365g) != null) {
                radioGroup4.check(R$id.radioButtonReset);
            }
            this.isResetMode = true;
            this.isUGCMode = false;
        } else if (C5110g.f17601a.m23911b()) {
            C25730r c25730r2 = this.viewBinding;
            if (c25730r2 != null && (radioGroup2 = c25730r2.f78365g) != null) {
                radioGroup2.check(R$id.radioButtonUGCVideo);
            }
            this.isUGCMode = true;
            this.isResetMode = false;
        } else {
            C25730r c25730r3 = this.viewBinding;
            if (c25730r3 != null && (radioGroup = c25730r3.f78365g) != null) {
                radioGroup.check(R$id.radioButtonSubject);
            }
            this.isUGCMode = false;
            this.isResetMode = false;
        }
        C25730r c25730r4 = this.viewBinding;
        if (c25730r4 != null && (button2 = c25730r4.f78360b) != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LabContentModeDialog.m84791q0(this.f64901a, view2);
                }
            });
        }
        C25730r c25730r5 = this.viewBinding;
        if (c25730r5 != null && (button = c25730r5.f78361c) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LabContentModeDialog.m84792r0(this.f64906a, view2);
                }
            });
        }
        C25730r c25730r6 = this.viewBinding;
        if (c25730r6 == null || (radioGroup3 = c25730r6.f78365g) == null) {
            return;
        }
        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.transsion.usercenter.laboratory.f
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup5, int i11) {
                LabContentModeDialog.m84793s0(this.f64909a, radioGroup5, i11);
            }
        });
    }
}
