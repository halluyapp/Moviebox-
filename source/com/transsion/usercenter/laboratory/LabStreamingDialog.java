package com.transsion.usercenter.laboratory;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import ck.C5123t;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.baselib.utils.PlayMode;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.R$style;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p585lw.C25746z;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m97100d2 = {"Lcom/transsion/usercenter/laboratory/LabStreamingDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Llw/z;", "c", "Llw/z;", "viewBinding", "Lcom/transsion/baselib/utils/PlayMode;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/baselib/utils/PlayMode;", "playMode", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class LabStreamingDialog extends BaseDialog {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C25746z viewBinding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private PlayMode playMode;

    public LabStreamingDialog() {
        super(R$layout.dialog_lab_streaming_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m84863q0(LabStreamingDialog labStreamingDialog, View view) {
        labStreamingDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final void m84864r0(LabStreamingDialog labStreamingDialog, View view) {
        C28951b.f88586a.m111455e("当前媒体播放模式是 playMode = " + labStreamingDialog.playMode);
        PlayMode playMode = labStreamingDialog.playMode;
        if (playMode != null) {
            C5123t.f17614a.m23961c(playMode);
        }
        labStreamingDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m84865s0(LabStreamingDialog labStreamingDialog, RadioGroup radioGroup, int i11) {
        if (i11 == R$id.radioButtonDownload) {
            C28951b.f88586a.m111455e("PlayMode.DOWNLOAD");
            labStreamingDialog.playMode = PlayMode.DOWNLOAD;
        } else if (i11 == R$id.radioButtonStream) {
            C28951b.f88586a.m111455e("PlayMode.STREAM");
            labStreamingDialog.playMode = PlayMode.STREAM;
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
        this.viewBinding = C25746z.m101258a(view);
        if (getActivity() != null) {
            if (C5123t.f17614a.m23960b()) {
                C25746z c25746z = this.viewBinding;
                if (c25746z != null && (radioGroup3 = c25746z.f78473f) != null) {
                    radioGroup3.check(R$id.radioButtonStream);
                }
                this.playMode = PlayMode.STREAM;
            } else {
                C25746z c25746z2 = this.viewBinding;
                if (c25746z2 != null && (radioGroup2 = c25746z2.f78473f) != null) {
                    radioGroup2.check(R$id.radioButtonDownload);
                }
                this.playMode = PlayMode.DOWNLOAD;
            }
        }
        C25746z c25746z3 = this.viewBinding;
        if (c25746z3 != null && (button2 = c25746z3.f78469b) != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LabStreamingDialog.m84863q0(this.f64913a, view2);
                }
            });
        }
        C25746z c25746z4 = this.viewBinding;
        if (c25746z4 != null && (button = c25746z4.f78470c) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LabStreamingDialog.m84864r0(this.f64917a, view2);
                }
            });
        }
        C25746z c25746z5 = this.viewBinding;
        if (c25746z5 == null || (radioGroup = c25746z5.f78473f) == null) {
            return;
        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.transsion.usercenter.laboratory.i0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup4, int i11) {
                LabStreamingDialog.m84865s0(this.f64919a, radioGroup4, i11);
            }
        });
    }
}
