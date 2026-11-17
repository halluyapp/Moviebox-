package com.transsion.usercenter.laboratory;

import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.core.content.AbstractC2397b;
import ch.C5096b;
import ck.C5107d;
import com.blankj.utilcode.util.AbstractC5779c;
import com.blankj.utilcode.util.AbstractC5787g;
import com.blankj.utilcode.util.Utils;
import com.mbridge.msdk.MBridgeConstans;
import com.p282tn.lib.widget.R$color;
import com.tencent.mmkv.MMKV;
import com.therouter.TheRouter;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.R$style;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mh.C25835b;
import p411fh.C23366a;
import p441gz.InterfaceC23704a;
import p585lw.C25738v;
import p743rh.C27287m;
import th.C27819c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m97100d2 = {"Lcom/transsion/usercenter/laboratory/LabInfoDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "", "keyColor", "valueColor", "Lth/c;", "p0", "(II)Lth/c;", "", "q0", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class LabInfoDialog extends BaseDialog {
    public LabInfoDialog() {
        super(R$layout.dialog_lab_info);
    }

    /* JADX INFO: renamed from: p0 */
    private final C27819c m84827p0(int keyColor, int valueColor) {
        UserInfo userInfoMo90386h;
        C27819c.a aVarM108151c = C27819c.m108144e().m108153e("user_id = ").m108151c(keyColor);
        InterfaceC23704a interfaceC23704a = (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
        C27819c.a aVarM108151c2 = aVarM108151c.m108153e(((interfaceC23704a == null || (userInfoMo90386h = interfaceC23704a.mo90386h()) == null) ? null : userInfoMo90386h.getUserId()) + "\n").m108151c(valueColor).m108153e("device_id = ").m108151c(keyColor);
        C25835b c25835b = C25835b.f78806a;
        C27819c.a aVarM108151c3 = aVarM108151c2.m108153e(c25835b.m101493h() + "\n").m108151c(valueColor).m108153e("version_name = ").m108151c(keyColor).m108153e(AbstractC5779c.m27331h() + "\n").m108151c(valueColor).m108153e("version_code = ").m108151c(keyColor).m108153e(AbstractC5779c.m27329f() + "\n").m108151c(valueColor).m108153e("os_version = ").m108151c(keyColor).m108153e(c25835b.m101499n() + "\n").m108151c(valueColor).m108153e("model = ").m108151c(keyColor).m108153e(c25835b.m101497l() + "\n").m108151c(valueColor).m108153e("install_ch = ").m108151c(keyColor).m108153e(C23366a.f71263a.m92788a() + "\n").m108151c(valueColor).m108153e("gaid = ").m108151c(keyColor).m108153e(c25835b.m101494i() + "\n").m108151c(valueColor).m108153e("net = ").m108151c(keyColor).m108153e(C27287m.f83003a.m106329d() + "\n").m108151c(valueColor).m108153e("region = ").m108151c(keyColor).m108153e(Locale.getDefault().getCountry() + "\n").m108151c(valueColor).m108153e("timezone = ").m108151c(keyColor).m108153e(TimeZone.getDefault().getID() + "\n").m108151c(valueColor).m108153e("sp_code = ").m108151c(keyColor).m108153e(m84828q0() + "\n").m108151c(valueColor).m108153e("channel = ").m108151c(keyColor);
        C5096b.a aVar = C5096b.f17579a;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        C27819c.a aVarM108151c4 = aVarM108151c3.m108153e(aVar.m23865e(applicationM27275a) + "\n").m108151c(valueColor).m108153e("package = ").m108151c(keyColor).m108153e(AbstractC5779c.m27328e() + "\n").m108151c(valueColor).m108153e("SignatureMD5 = ").m108151c(keyColor);
        C5107d c5107d = C5107d.f17594a;
        Application applicationM27275a2 = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a2, "getApp(...)");
        C27819c.a aVarM108151c5 = aVarM108151c4.m108153e(c5107d.m23898a(applicationM27275a2) + "\n").m108151c(valueColor).m108153e("SignatureSha1 = ").m108151c(keyColor);
        Application applicationM27275a3 = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a3, "getApp(...)");
        C27819c.a aVarM108151c6 = aVarM108151c5.m108153e(C5107d.m23895c(applicationM27275a3) + "\n").m108151c(valueColor).m108153e("SignatureSHA256 = ").m108151c(keyColor);
        Application applicationM27275a4 = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a4, "getApp(...)");
        C27819c c27819cM108150b = aVarM108151c6.m108153e(c5107d.m23899b(applicationM27275a4) + "\n").m108151c(valueColor).m108150b();
        Intrinsics.m97801g(c27819cM108150b, "build(...)");
        return c27819cM108150b;
    }

    /* JADX INFO: renamed from: q0 */
    private final String m84828q0() {
        String string;
        MMKV mmkvM92790c = C23366a.f71263a.m92790c();
        String str = "";
        if (mmkvM92790c != null && (string = mmkvM92790c.getString("sp_code", "")) != null) {
            str = string;
        }
        return TextUtils.isEmpty(str) ? C25835b.f78806a.m101500o() : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final void m84829r0(LabInfoDialog labInfoDialog, View view) {
        labInfoDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m84830s0(C25738v c25738v, LabInfoDialog labInfoDialog, View view) {
        AbstractC5787g.m27403a(c25738v.f78412d.getText().toString());
        Toast.makeText(labInfoDialog.getContext(), "copy success", 1).show();
        labInfoDialog.dismiss();
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
        final C25738v c25738vM101233a = C25738v.m101233a(view);
        Intrinsics.m97801g(c25738vM101233a, "bind(...)");
        c25738vM101233a.f78412d.setText(m84827p0(AbstractC2397b.getColor(view.getContext(), R$color.main), AbstractC2397b.getColor(view.getContext(), R$color.text_02)));
        c25738vM101233a.f78410b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LabInfoDialog.m84829r0(this.f64938a, view2);
            }
        });
        c25738vM101233a.f78411c.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LabInfoDialog.m84830s0(c25738vM101233a, this, view2);
            }
        });
    }
}
