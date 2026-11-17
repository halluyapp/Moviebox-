package com.transsion.usercenter.setting;

import android.os.Bundle;
import android.view.View;
import com.p282tn.lib.view.TitleLayout;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.push.feature.toolbar.ToolbarNotificationUtils;
import com.transsion.usercenter.R$string;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p585lw.C25745y0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m97100d2 = {"Lcom/transsion/usercenter/setting/SettingNoticeActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Llw/y0;", "<init>", "()V", "", "d0", "c0", "()Llw/y0;", "", "isStatusDark", "()Z", "isTranslucent", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/os/Bundle;)V", "a", "Z", "showNotice", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class SettingNoticeActivity extends BaseActivity<C25745y0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean showNotice = true;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    private final void m85657d0() {
        this.showNotice = C14496b.f50966a.m65344b().getBoolean("k_is_show_ongoing_tool_notice", true);
        ((C25745y0) getMViewBinding()).f78465b.setChecked(this.showNotice);
        ((C25745y0) getMViewBinding()).f78465b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.setting.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingNoticeActivity.m85658e0(this.f65547a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    public static final void m85658e0(SettingNoticeActivity settingNoticeActivity, View view) {
        if (settingNoticeActivity.showNotice) {
            ToolbarNotificationUtils.f58521a.m75854y();
            C14496b.f50966a.m65344b().putBoolean("k_is_show_ongoing_tool_notice", false);
        } else {
            C14496b.f50966a.m65344b().putBoolean("k_is_show_ongoing_tool_notice", true);
            ToolbarNotificationUtils.f58521a.m75850G();
        }
        settingNoticeActivity.showNotice = !settingNoticeActivity.showNotice;
        ((C25745y0) settingNoticeActivity.getMViewBinding()).f78465b.setChecked(settingNoticeActivity.showNotice);
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public C25745y0 getViewBinding() {
        C25745y0 c25745y0M101255c = C25745y0.m101255c(getLayoutInflater());
        Intrinsics.m97801g(c25745y0M101255c, "inflate(...)");
        return c25745y0M101255c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        TitleLayout toolBar = ((C25745y0) getMViewBinding()).f78466c;
        Intrinsics.m97801g(toolBar, "toolBar");
        AbstractC26006c.m102052e(toolBar);
        ((C25745y0) getMViewBinding()).f78466c.setTitleText(R$string.user_setting);
        m85657d0();
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }
}
