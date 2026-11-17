package com.transsion.usercenter.laboratory;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.mbridge.msdk.MBridgeConstans;
import com.p282tn.lib.net.dns.p283or.CacheIpPool;
import com.tencent.mmkv.MMKV;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.R$style;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import p411fh.C23366a;
import p585lw.C25736u;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m97100d2 = {"Lcom/transsion/usercenter/laboratory/LabHttpHostDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "", "host", "", "u0", "(Ljava/lang/String;)V", "", "q0", "(Ljava/lang/String;)Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "v", "onClick", "(Landroid/view/View;)V", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class LabHttpHostDialog extends BaseDialog implements View.OnClickListener {
    public LabHttpHostDialog() {
        super(R$layout.dialog_lab_http_host);
    }

    /* JADX INFO: renamed from: q0 */
    private final boolean m84820q0(String host) {
        return new Regex("^((?=[a-zA-Z0-9-]{1,63}\\.)(xn--)?[a-zA-Z0-9]+(-[a-zA-Z0-9]+)*\\.)+[a-zA-Z]{2,6}(:\\d{1,5})?$").matches(host);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final void m84821r0(LabHttpHostDialog labHttpHostDialog, View view) {
        labHttpHostDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m84822s0(C25736u c25736u, LabHttpHostDialog labHttpHostDialog, View view) {
        Editable text = c25736u.f78396d.getText();
        if (text == null || text.length() == 0) {
            C28951b.f88586a.m111455e("text is null~");
        } else {
            labHttpHostDialog.m84824u0(text.toString());
            labHttpHostDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final void m84823t0(LabHttpHostDialog labHttpHostDialog, View view) {
        Toast.makeText(labHttpHostDialog.getContext(), "reset success", 1).show();
        labHttpHostDialog.m84824u0("");
        labHttpHostDialog.dismiss();
    }

    /* JADX INFO: renamed from: u0 */
    private final void m84824u0(String host) {
        if (!TextUtils.isEmpty(host) && !m84820q0(host)) {
            Toast.makeText(getContext(), host + "\" invalidate,please fix", 1).show();
            return;
        }
        Toast.makeText(getContext(), "set \"" + host + "\" success", 1).show();
        MMKV mmkvM92790c = C23366a.f71263a.m92790c();
        if (mmkvM92790c != null) {
            mmkvM92790c.putString("mock_host_key", host);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        Intrinsics.m97800f(v11, "null cannot be cast to non-null type android.widget.TextView");
        m84824u0(((TextView) v11).getText().toString());
        dismiss();
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
        final C25736u c25736uM101227a = C25736u.m101227a(view);
        Intrinsics.m97801g(c25736uM101227a, "bind(...)");
        c25736uM101227a.f78405m.setText(CacheIpPool.f48367a.m61955l());
        c25736uM101227a.f78394b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LabHttpHostDialog.m84821r0(this.f64931a, view2);
            }
        });
        c25736uM101227a.f78395c.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LabHttpHostDialog.m84822s0(c25736uM101227a, this, view2);
            }
        });
        c25736uM101227a.f78397e.setOnClickListener(this);
        c25736uM101227a.f78398f.setOnClickListener(this);
        c25736uM101227a.f78399g.setOnClickListener(this);
        c25736uM101227a.f78400h.setOnClickListener(this);
        c25736uM101227a.f78401i.setOnClickListener(this);
        c25736uM101227a.f78402j.setOnClickListener(this);
        c25736uM101227a.f78403k.setOnClickListener(this);
        c25736uM101227a.f78404l.setOnClickListener(this);
        c25736uM101227a.f78406n.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LabHttpHostDialog.m84823t0(this.f64936a, view2);
            }
        });
    }
}
