package com.transsion.usercenter.setting;

import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.AbstractC2397b;
import ck.C5123t;
import com.p282tn.lib.view.TitleLayout;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$drawable;
import com.p282tn.lib.widget.R$string;
import com.p282tn.lib.widget.dialog.TRDialog;
import com.p282tn.lib.widget.dialog.TRDialogListener;
import com.transsion.baselib.report.C14492k;
import com.transsion.baselib.utils.PlayMode;
import com.transsion.baseui.activity.BaseActivity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import org.mvel2.ast.ASTNode;
import p585lw.C25696a1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0005R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m97100d2 = {"Lcom/transsion/usercenter/setting/SettingWatchActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Llw/a1;", "Lcom/tn/lib/widget/dialog/TRDialogListener;", "<init>", "()V", "", "isStream", "", "updateMode", "(Z)V", "restartApp", "editTipsDialog", "getViewBinding", "()Llw/a1;", "isStatusDark", "()Z", "isTranslucent", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/os/Bundle;)V", "Lcom/tn/lib/widget/dialog/TRDialog;", "dialog", "onLeftButtonClick", "(Lcom/tn/lib/widget/dialog/TRDialog;)V", "onRightButtonClick", "onBackPressed", "isStreamMode", "Z", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class SettingWatchActivity extends BaseActivity<C25696a1> implements TRDialogListener {
    private final boolean isStreamMode = C5123t.f17614a.m23960b();

    private final void editTipsDialog() {
        try {
            TRDialog.C13786a c13786a = new TRDialog.C13786a();
            String string = getString(R$string.back_edit_tips);
            Intrinsics.m97801g(string, "getString(...)");
            TRDialog.C13786a c13786aM62288g = c13786a.m62288g(string);
            String string2 = getString(com.transsion.usercenter.R$string.profile_back_edit_yes);
            Intrinsics.m97801g(string2, "getString(...)");
            TRDialog.C13786a c13786aM62286e = c13786aM62288g.m62286e(string2);
            String string3 = getString(com.transsion.usercenter.R$string.profile_back_edit_no);
            Intrinsics.m97801g(string3, "getString(...)");
            c13786aM62286e.m62291j(string3).m62285d(AbstractC2397b.getColor(this, R$color.text_01)).m62290i(AbstractC2397b.getColor(this, R$color.text_01)).m62289h(R$drawable.libui_sub_btn2_normal).m62284c(R$drawable.libui_sub_btn2_normal).m62287f(this).m62282a().m62247c0(this, "edit_tips");
        } catch (Exception unused) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0(SettingWatchActivity settingWatchActivity, View it) {
        Intrinsics.m97802h(it, "it");
        settingWatchActivity.updateMode(true);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$1(SettingWatchActivity settingWatchActivity, View it) {
        Intrinsics.m97802h(it, "it");
        settingWatchActivity.updateMode(false);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$2(SettingWatchActivity settingWatchActivity, View it) {
        Intrinsics.m97802h(it, "it");
        settingWatchActivity.restartApp();
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void restartApp() {
        C5123t.f17614a.m23961c(((C25696a1) getMViewBinding()).f78094g.isSelected() ? PlayMode.STREAM : PlayMode.DOWNLOAD);
        C14492k.f50955a.m65319l();
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(ASTNode.DEOP);
        }
        startActivity(launchIntentForPackage);
        Process.killProcess(Process.myPid());
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateMode(boolean isStream) {
        ((C25696a1) getMViewBinding()).f78093f.setAlpha(isStream == this.isStreamMode ? 0.5f : 1.0f);
        ((C25696a1) getMViewBinding()).f78093f.setEnabled(isStream != this.isStreamMode);
        ((C25696a1) getMViewBinding()).f78094g.setSelected(isStream);
        ((C25696a1) getMViewBinding()).f78090c.setSelected(!isStream);
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public C25696a1 getViewBinding() {
        C25696a1 c25696a1M101091c = C25696a1.m101091c(getLayoutInflater());
        Intrinsics.m97801g(c25696a1M101091c, "inflate(...)");
        return c25696a1M101091c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        TitleLayout titleLayout = ((C25696a1) getMViewBinding()).f78097j;
        Intrinsics.m97801g(titleLayout, "titleLayout");
        AbstractC26006c.m102052e(titleLayout);
        ((C25696a1) getMViewBinding()).f78097j.setTitleText(com.transsion.baseui.R$string.watch_options);
        AppCompatTextView streamTv = ((C25696a1) getMViewBinding()).f78096i;
        Intrinsics.m97801g(streamTv, "streamTv");
        AbstractC26006c.m102050c(streamTv, 0L, new Function1() { // from class: com.transsion.usercenter.setting.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingWatchActivity.initView$lambda$0(this.f65550a, (View) obj);
            }
        }, 1, null);
        AppCompatTextView downloadTv = ((C25696a1) getMViewBinding()).f78092e;
        Intrinsics.m97801g(downloadTv, "downloadTv");
        AbstractC26006c.m102050c(downloadTv, 0L, new Function1() { // from class: com.transsion.usercenter.setting.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingWatchActivity.initView$lambda$1(this.f65551a, (View) obj);
            }
        }, 1, null);
        AppCompatTextView restartTV = ((C25696a1) getMViewBinding()).f78093f;
        Intrinsics.m97801g(restartTV, "restartTV");
        AbstractC26006c.m102050c(restartTV, 0L, new Function1() { // from class: com.transsion.usercenter.setting.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingWatchActivity.initView$lambda$2(this.f65552a, (View) obj);
            }
        }, 1, null);
        updateMode(this.isStreamMode);
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (((C25696a1) getMViewBinding()).f78094g.isSelected() == this.isStreamMode) {
            super.onBackPressed();
        } else {
            editTipsDialog();
        }
    }

    @Override // com.p282tn.lib.widget.dialog.TRDialogListener
    public void onLeftButtonClick(TRDialog dialog) {
        Intrinsics.m97802h(dialog, "dialog");
        finish();
    }

    @Override // com.p282tn.lib.widget.dialog.TRDialogListener
    public void onRightButtonClick(TRDialog dialog) {
        Intrinsics.m97802h(dialog, "dialog");
    }
}
