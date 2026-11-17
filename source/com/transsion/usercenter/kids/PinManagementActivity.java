package com.transsion.usercenter.kids;

import android.os.Bundle;
import android.view.View;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.kids.PinManagementActivity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p585lw.C25710h;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m97100d2 = {"Lcom/transsion/usercenter/kids/PinManagementActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Llw/h;", "<init>", "()V", "c0", "()Llw/h;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "isStatusDark", "()Z", "a", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class PinManagementActivity extends BaseActivity<C25710h> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final void m84766d0(PinManagementActivity pinManagementActivity, View view) {
        pinManagementActivity.finish();
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public C25710h getViewBinding() {
        C25710h c25710hM101139c = C25710h.m101139c(getLayoutInflater());
        Intrinsics.m97801g(c25710hM101139c, "inflate(...)");
        return c25710hM101139c;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C26866a.a.m104898f(C26866a.f81698a, "PinManagementActivity", "enter PIN management.", false, 4, null);
        String stringExtra = getIntent().getStringExtra("arg_kids_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        ((C25710h) getMViewBinding()).f78190d.setOnClickListener(new View.OnClickListener() { // from class: rw.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PinManagementActivity.m84766d0(this.f83456a, view);
            }
        });
        if (savedInstanceState == null) {
            getSupportFragmentManager().m14557p().m14813s(R$id.flContainer, PinManagementFragment.INSTANCE.m84781a(stringExtra)).mo14670i();
        }
    }
}
