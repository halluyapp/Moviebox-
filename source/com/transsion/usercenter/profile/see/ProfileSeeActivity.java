package com.transsion.usercenter.profile.see;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.FragmentManager;
import ck.C5127x;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.therouter.TheRouter;
import com.transsion.baseui.activity.BaseNewActivity;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$string;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.lang.reflect.InvocationTargetException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p441gz.InterfaceC23704a;
import p585lw.C25729q0;
import p743rh.C27287m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0007R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010+\u001a\u0004\u0018\u00010&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, m97100d2 = {"Lcom/transsion/usercenter/profile/see/ProfileSeeActivity;", "Lcom/transsion/baseui/activity/BaseNewActivity;", "Llw/q0;", "<init>", "()V", "", "E0", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "F0", "()Llw/q0;", "f0", "l0", "m0", "k0", "retryLoadData", "p0", "onBackPressed", "", "isTranslucent", "()Z", "isChangeStatusBar", "isStatusDark", "", "count", "H0", "(I)V", "getPageName", "i", "Ljava/lang/String;", "mUserId", "j", "I", "mWant2SeeCount", "Lgz/a;", CampaignEx.JSON_KEY_AD_K, "Lkotlin/Lazy;", "D0", "()Lgz/a;", "mLoginApi", "Lcom/transsion/usercenter/profile/see/ProfileSeeListFragment;", "l", "Lcom/transsion/usercenter/profile/see/ProfileSeeListFragment;", "target", "m", "a", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ProfileSeeActivity extends BaseNewActivity<C25729q0> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public String mUserId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int mWant2SeeCount;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Lazy mLoginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.profile.see.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ProfileSeeActivity.m85488G0();
        }
    });

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private ProfileSeeListFragment target;

    /* JADX INFO: renamed from: D0 */
    private final InterfaceC23704a m85486D0() {
        return (InterfaceC23704a) this.mLoginApi.getValue();
    }

    /* JADX INFO: renamed from: E0 */
    private final String m85487E0() {
        UserInfo userInfoMo90386h;
        String str = this.mUserId;
        if (str != null && str.length() != 0) {
            String str2 = this.mUserId;
            InterfaceC23704a interfaceC23704aM85486D0 = m85486D0();
            if (!Intrinsics.m97797c(str2, (interfaceC23704aM85486D0 == null || (userInfoMo90386h = interfaceC23704aM85486D0.mo90386h()) == null) ? null : userInfoMo90386h.getUserId())) {
                String string = getString(R$string.profile_list);
                Intrinsics.m97799e(string);
                return string;
            }
        }
        String string2 = getString(R$string.profile_your_list);
        Intrinsics.m97799e(string2);
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final InterfaceC23704a m85488G0() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public C25729q0 getViewBinding() {
        C25729q0 c25729q0M101208c = C25729q0.m101208c(getLayoutInflater());
        Intrinsics.m97801g(c25729q0M101208c, "inflate(...)");
        return c25729q0M101208c;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m85490H0(int count) {
        if (this.mWant2SeeCount < 0) {
            count = 0;
        }
        this.mWant2SeeCount = count;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: f0 */
    public String mo65386f0() {
        return m85487E0();
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public String getPageName() {
        return "movie_audio_archies";
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isChangeStatusBar() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isStatusDark() {
        return !C5127x.f17620a.m23969a();
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
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: m0 */
    public void mo65391m0() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("want2SeeCount", this.mWant2SeeCount);
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InvocationTargetException {
        TheRouter.m61781l(this);
        super.onCreate(savedInstanceState);
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: p0 */
    public void mo65394p0() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
        AbstractC3168w abstractC3168wM14557p = supportFragmentManager.m14557p();
        Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
        ProfileSeeListFragment profileSeeListFragmentM85505a = ProfileSeeListFragment.INSTANCE.m85505a(1, this.mUserId, m85487E0());
        abstractC3168wM14557p.m14813s(R$id.flContent, profileSeeListFragmentM85505a);
        this.target = profileSeeListFragmentM85505a;
        abstractC3168wM14557p.mo14671j();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void retryLoadData() {
        m65400w0();
        if (!C27287m.f83003a.m106330e()) {
            m65402y0();
            return;
        }
        m65398u0();
        if (this.target == null) {
            mo65394p0();
        }
    }
}
