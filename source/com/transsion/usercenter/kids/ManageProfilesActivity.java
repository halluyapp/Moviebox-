package com.transsion.usercenter.kids;

import android.os.Bundle;
import android.view.View;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.kids.ManageProfilesActivity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p585lw.C25706f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m97100d2 = {"Lcom/transsion/usercenter/kids/ManageProfilesActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Llw/f;", "<init>", "()V", "c0", "()Llw/f;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "isStatusDark", "()Z", "a", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class ManageProfilesActivity extends BaseActivity<C25706f> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.transsion.usercenter.kids.ManageProfilesActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m84704a(String str, String str2) {
            Navigator navigatorM61773c = TheRouter.m61773c("/kids/manage_profiles");
            if (str == null) {
                str = "";
            }
            Navigator navigatorM61857K = navigatorM61773c.m61857K("arg_adult_nickname", str);
            if (str2 == null) {
                str2 = "";
            }
            Navigator.m61845x(navigatorM61857K.m61857K("arg_adult_avatar_url", str2), null, null, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final void m84702d0(ManageProfilesActivity manageProfilesActivity, View view) {
        manageProfilesActivity.finish();
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public C25706f getViewBinding() {
        C25706f c25706fM101124c = C25706f.m101124c(getLayoutInflater());
        Intrinsics.m97801g(c25706fM101124c, "inflate(...)");
        return c25706fM101124c;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((C25706f) getMViewBinding()).f78164d.setOnClickListener(new View.OnClickListener() { // from class: rw.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageProfilesActivity.m84702d0(this.f83473a, view);
            }
        });
        if (savedInstanceState == null) {
            getSupportFragmentManager().m14557p().m14813s(R$id.flContainer, ManageProfilesFragment.INSTANCE.m84716a()).mo14670i();
        }
    }
}
