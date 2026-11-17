package com.transsion.usercenter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.transsion.baseui.activity.BaseActivity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p585lw.C25720m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m97100d2 = {"Lcom/transsion/usercenter/UserCenterActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Llw/m;", "<init>", "()V", "", "f0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "e0", "()Llw/m;", "", "isTranslucent", "()Z", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class UserCenterActivity extends BaseActivity<C25720m> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    private final void m84597f0() {
        ((C25720m) getMViewBinding()).f78315b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCenterActivity.m84598g0(this.f65555a, view);
            }
        });
        ((C25720m) getMViewBinding()).f78317d.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCenterActivity.m84599h0(this.f65556a, view);
            }
        });
        ((C25720m) getMViewBinding()).f78316c.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCenterActivity.m84600i0(this.f65557a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final void m84598g0(UserCenterActivity userCenterActivity, View view) {
        userCenterActivity.startActivity(new Intent(userCenterActivity, (Class<?>) ProfileEditActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final void m84599h0(UserCenterActivity userCenterActivity, View view) {
        Intent intent = new Intent(userCenterActivity, (Class<?>) FollowActivity.class);
        intent.putExtra("follow_type_key", 1);
        userCenterActivity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final void m84600i0(UserCenterActivity userCenterActivity, View view) {
        Intent intent = new Intent(userCenterActivity, (Class<?>) FollowActivity.class);
        intent.putExtra("follow_type_key", 2);
        userCenterActivity.startActivity(intent);
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public C25720m getViewBinding() {
        C25720m c25720mM101179c = C25720m.m101179c(getLayoutInflater());
        Intrinsics.m97801g(c25720mM101179c, "inflate(...)");
        return c25720mM101179c;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayoutCompat root = ((C25720m) getMViewBinding()).getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        AbstractC26006c.m102052e(root);
        m84597f0();
    }
}
