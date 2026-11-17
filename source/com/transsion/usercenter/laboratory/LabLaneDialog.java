package com.transsion.usercenter.laboratory;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import ch.C5096b;
import com.mbridge.msdk.MBridgeConstans;
import com.tencent.mmkv.MMKV;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.R$style;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p411fh.C23366a;
import p585lw.C25740w;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m97100d2 = {"Lcom/transsion/usercenter/laboratory/LabLaneDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "", "lane", "", "t0", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "v", "onClick", "(Landroid/view/View;)V", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class LabLaneDialog extends BaseDialog implements View.OnClickListener {
    public LabLaneDialog() {
        super(R$layout.dialog_lab_lane);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m84834q0(LabLaneDialog labLaneDialog, View view) {
        labLaneDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final void m84835r0(C25740w c25740w, LabLaneDialog labLaneDialog, View view) {
        Editable text = c25740w.f78422d.getText();
        if (text == null || text.length() == 0) {
            C28951b.f88586a.m111455e("text is null~");
        } else {
            labLaneDialog.m84837t0(text.toString());
            labLaneDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m84836s0(LabLaneDialog labLaneDialog, View view) {
        Toast.makeText(labLaneDialog.getContext(), "reset success", 1).show();
        C5096b.f17579a.m23862b("x-md-global-color", "");
        MMKV mmkvM92790c = C23366a.f71263a.m92790c();
        if (mmkvM92790c != null) {
            mmkvM92790c.putString("x-md-global-color", "");
        }
        labLaneDialog.dismiss();
    }

    /* JADX INFO: renamed from: t0 */
    private final void m84837t0(String lane) {
        Toast.makeText(getContext(), "set \"" + lane + "\" success", 1).show();
        C5096b.f17579a.m23862b("x-md-global-color", lane);
        MMKV mmkvM92790c = C23366a.f71263a.m92790c();
        if (mmkvM92790c != null) {
            mmkvM92790c.putString("x-md-global-color", lane);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        Intrinsics.m97800f(v11, "null cannot be cast to non-null type android.widget.TextView");
        m84837t0(((TextView) v11).getText().toString());
        dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.BaseDialogStyle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String string;
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C25740w c25740wM101239a = C25740w.m101239a(view);
        Intrinsics.m97801g(c25740wM101239a, "bind(...)");
        MMKV mmkvM92790c = C23366a.f71263a.m92790c();
        String str = "";
        if (mmkvM92790c != null && (string = mmkvM92790c.getString("x-md-global-color", "")) != null) {
            str = string;
        }
        c25740wM101239a.f78428j.setText(str);
        c25740wM101239a.f78420b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LabLaneDialog.m84834q0(this.f64942a, view2);
            }
        });
        c25740wM101239a.f78421c.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LabLaneDialog.m84835r0(c25740wM101239a, this, view2);
            }
        });
        c25740wM101239a.f78423e.setOnClickListener(this);
        c25740wM101239a.f78424f.setOnClickListener(this);
        c25740wM101239a.f78425g.setOnClickListener(this);
        c25740wM101239a.f78426h.setOnClickListener(this);
        c25740wM101239a.f78427i.setOnClickListener(this);
        c25740wM101239a.f78429k.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LabLaneDialog.m84836s0(this.f64946a, view2);
            }
        });
    }
}
