package com.transsion.usercenter.laboratory;

import android.text.Editable;
import android.view.View;
import android.widget.Toast;
import ck.AbstractC5114k;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.activity.BaseNewActivity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p585lw.C25700c;
import p910xj.C28607a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0004¨\u0006\u0012"}, m97100d2 = {"Lcom/transsion/usercenter/laboratory/LabMiniAppSDKTestActivity;", "Lcom/transsion/baseui/activity/BaseNewActivity;", "Llw/c;", "<init>", "()V", "E0", "()Llw/c;", "", "f0", "()Ljava/lang/String;", "", "l0", "m0", "k0", "p0", "retryLoadData", "i", "a", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class LabMiniAppSDKTestActivity extends BaseNewActivity<C25700c> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F0 */
    public static final void m84844F0(LabMiniAppSDKTestActivity labMiniAppSDKTestActivity, View view) {
        String string;
        String string2;
        Editable text = ((C25700c) labMiniAppSDKTestActivity.getMViewBinding()).f78117c.getText();
        String str = "";
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        if (string.length() == 0) {
            Toast.makeText(labMiniAppSDKTestActivity, "appId is empty", 1).show();
            return;
        }
        C14496b c14496b = C14496b.f50966a;
        c14496b.m65344b().putString("KEY_TEST_MIN_APP_SDK_APP_ID", string);
        Editable text2 = ((C25700c) labMiniAppSDKTestActivity.getMViewBinding()).f78118d.getText();
        if (text2 != null && (string2 = text2.toString()) != null) {
            str = string2;
        }
        if (str.length() > 0) {
            c14496b.m65344b().putString("KEY_TEST_MIN_APP_SDK_SCENE_ID", string);
        }
        C28607a.f87785a.m110336c(labMiniAppSDKTestActivity, string, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    public static final void m84845G0(LabMiniAppSDKTestActivity labMiniAppSDKTestActivity, View view) {
        String string;
        Editable text = ((C25700c) labMiniAppSDKTestActivity.getMViewBinding()).f78116b.getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        if (string.length() == 0) {
            Toast.makeText(labMiniAppSDKTestActivity, "deeplink is empty", 1).show();
        } else {
            C14496b.f50966a.m65344b().putString("KEY_TEST_MIN_APP_SDK_DEEPLINK", string);
            AbstractC5114k.m23925h(string, null, 1, null);
        }
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public C25700c getViewBinding() {
        C25700c c25700cM101103c = C25700c.m101103c(getLayoutInflater());
        Intrinsics.m97801g(c25700cM101103c, "inflate(...)");
        return c25700cM101103c;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: f0 */
    public String mo65386f0() {
        return "";
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: k0 */
    public void mo65389k0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: l0 */
    public void mo65390l0() {
        C14496b c14496b = C14496b.f50966a;
        String string = c14496b.m65344b().getString("KEY_TEST_MIN_APP_SDK_APP_ID", "");
        if (string == null) {
            string = "";
        }
        if (string.length() > 0) {
            ((C25700c) getMViewBinding()).f78117c.setText(string);
        }
        String string2 = c14496b.m65344b().getString("KEY_TEST_MIN_APP_SDK_SCENE_ID", "");
        if (string2 == null) {
            string2 = "";
        }
        if (string2.length() > 0) {
            ((C25700c) getMViewBinding()).f78118d.setText(string2);
        }
        String string3 = c14496b.m65344b().getString("KEY_TEST_MIN_APP_SDK_DEEPLINK", "");
        String str = string3 != null ? string3 : "";
        if (str.length() > 0) {
            ((C25700c) getMViewBinding()).f78116b.setText(str);
        }
        ((C25700c) getMViewBinding()).f78119e.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LabMiniAppSDKTestActivity.m84844F0(this.f64952a, view);
            }
        });
        ((C25700c) getMViewBinding()).f78120f.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LabMiniAppSDKTestActivity.m84845G0(this.f64893a, view);
            }
        });
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: m0 */
    public void mo65391m0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: p0 */
    public void mo65394p0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void retryLoadData() {
    }
}
