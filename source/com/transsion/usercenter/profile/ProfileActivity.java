package com.transsion.usercenter.profile;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.therouter.TheRouter;
import com.transsion.baseui.activity.BaseNewActivity;
import com.transsion.usercenter.R$id;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p585lw.C25727p0;
import p743rh.C27287m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u000fR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, m97100d2 = {"Lcom/transsion/usercenter/profile/ProfileActivity;", "Lcom/transsion/baseui/activity/BaseNewActivity;", "Llw/p0;", "<init>", "()V", "", "C0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "D0", "()Llw/p0;", "", "f0", "()Ljava/lang/String;", "l0", "m0", "k0", "p0", "retryLoadData", "", "isTranslucent", "()Z", "o0", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "getPageName", "Lcom/transsnet/loginapi/bean/UserInfo;", "i", "Lcom/transsnet/loginapi/bean/UserInfo;", "userInfo", "j", "Ljava/lang/String;", "userId", "Landroidx/fragment/app/Fragment;", CampaignEx.JSON_KEY_AD_K, "Landroidx/fragment/app/Fragment;", "mFragment", "l", "a", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ProfileActivity extends BaseNewActivity<C25727p0> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public UserInfo userInfo;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public String userId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private Fragment mFragment;

    /* JADX INFO: renamed from: C0 */
    private final void m85140C0() {
        Fragment fragmentM14547k0 = getSupportFragmentManager().m14547k0("profile_fragment_tag");
        this.mFragment = fragmentM14547k0 instanceof ProfileFragment ? (ProfileFragment) fragmentM14547k0 : ProfileFragment.INSTANCE.m85209a(this.userId, this.userInfo);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
        AbstractC3168w abstractC3168wM14557p = supportFragmentManager.m14557p();
        Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
        Fragment fragment = this.mFragment;
        if (fragment != null) {
            abstractC3168wM14557p.m14814t(R$id.f64759fl, fragment, "profile_fragment_tag");
        }
        abstractC3168wM14557p.mo14671j();
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public C25727p0 getViewBinding() {
        C25727p0 c25727p0M101202c = C25727p0.m101202c(getLayoutInflater());
        Intrinsics.m97801g(c25727p0M101202c, "inflate(...)");
        return c25727p0M101202c;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: f0 */
    public String mo65386f0() {
        return "";
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public String getPageName() {
        return "profiledetail";
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: k0 */
    public void mo65389k0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: l0 */
    public void mo65390l0() {
        m65396s0();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: m0 */
    public void mo65391m0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: o0 */
    public boolean mo65393o0() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InvocationTargetException {
        TheRouter.m61781l(this);
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.m97802h(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        TheRouter.m61781l(this);
        m85140C0();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: p0 */
    public void mo65394p0() {
        m85140C0();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void retryLoadData() {
        m65400w0();
        if (!C27287m.f83003a.m106330e()) {
            m65402y0();
        } else {
            m65398u0();
            mo65394p0();
        }
    }
}
