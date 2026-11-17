package com.transsion.usercenter.laboratory;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import androidx.fragment.app.FragmentActivity;
import ch.C5096b;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.R$style;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p585lw.C25728q;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m97100d2 = {"Lcom/transsion/usercenter/laboratory/LabChannelDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Llw/q;", "c", "Llw/q;", "viewBinding", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/String;", "channelTag", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class LabChannelDialog extends BaseDialog {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C25728q viewBinding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String channelTag;

    public LabChannelDialog() {
        super(R$layout.dialog_lab_channel_layout);
        this.channelTag = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m84785q0(LabChannelDialog labChannelDialog, View view) {
        labChannelDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final void m84786r0(LabChannelDialog labChannelDialog, View view) {
        if (!TextUtils.isEmpty(labChannelDialog.channelTag)) {
            C5096b.f17579a.m23870k(labChannelDialog.channelTag);
            C28951b.f88586a.m111455e("自定义成功 -- channel = " + labChannelDialog.channelTag);
        }
        labChannelDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m84787s0(LabChannelDialog labChannelDialog, RadioGroup radioGroup, int i11) {
        if (i11 == R$id.radioButtonGP) {
            C28951b.f88586a.m111455e("gp");
            labChannelDialog.channelTag = "gp";
        } else if (i11 == R$id.radioButtonPS) {
            C28951b.f88586a.m111455e("ps");
            labChannelDialog.channelTag = "ps";
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
        RadioGroup radioGroup4;
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.viewBinding = C25728q.m101205a(view);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String strM23865e = C5096b.f17579a.m23865e(activity);
            if (TextUtils.equals("ps", strM23865e)) {
                C25728q c25728q = this.viewBinding;
                if (c25728q != null && (radioGroup4 = c25728q.f78356f) != null) {
                    radioGroup4.check(R$id.radioButtonPS);
                }
            } else if (TextUtils.equals("gp", strM23865e)) {
                C25728q c25728q2 = this.viewBinding;
                if (c25728q2 != null && (radioGroup3 = c25728q2.f78356f) != null) {
                    radioGroup3.check(R$id.radioButtonGP);
                }
            } else {
                C25728q c25728q3 = this.viewBinding;
                if (c25728q3 != null && (radioGroup2 = c25728q3.f78356f) != null) {
                    radioGroup2.clearCheck();
                }
            }
        }
        C25728q c25728q4 = this.viewBinding;
        if (c25728q4 != null && (button2 = c25728q4.f78352b) != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LabChannelDialog.m84785q0(this.f64892a, view2);
                }
            });
        }
        C25728q c25728q5 = this.viewBinding;
        if (c25728q5 != null && (button = c25728q5.f78353c) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LabChannelDialog.m84786r0(this.f64895a, view2);
                }
            });
        }
        C25728q c25728q6 = this.viewBinding;
        if (c25728q6 == null || (radioGroup = c25728q6.f78356f) == null) {
            return;
        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.transsion.usercenter.laboratory.c
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup5, int i11) {
                LabChannelDialog.m84787s0(this.f64898a, radioGroup5, i11);
            }
        });
    }
}
