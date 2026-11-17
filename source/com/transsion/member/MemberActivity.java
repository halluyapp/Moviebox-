package com.transsion.member;

import androidx.activity.AbstractC0256u;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.FragmentManager;
import bn.C4852a;
import com.cloud.tmc.integration.event.EventConstants;
import com.therouter.TheRouter;
import com.transsion.baseui.activity.BaseNewActivity;
import com.transsion.memberapi.MemberSource;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p352dn.InterfaceC22998b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m97099d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\b\u0005*\u0001\u0014\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m97100d2 = {"Lcom/transsion/member/MemberActivity;", "Lcom/transsion/baseui/activity/BaseNewActivity;", "Lbn/a;", "<init>", "()V", "C0", "()Lbn/a;", "", "f0", "()Ljava/lang/String;", "", "l0", "", "isTranslucent", "()Z", "o0", "m0", "k0", "p0", "retryLoadData", "com/transsion/member/MemberActivity$a", "i", "Lcom/transsion/member/MemberActivity$a;", "onBackPress", "Member_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class MemberActivity extends BaseNewActivity<C4852a> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C15749a onBackPress = new C15749a();

    /* JADX INFO: renamed from: com.transsion.member.MemberActivity$a */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class C15749a extends AbstractC0256u {
        C15749a() {
            super(true);
        }

        @Override // androidx.activity.AbstractC0256u
        public void handleOnBackPressed() {
            C15777a.f54210a.m69947a("MemberActivity --> onBackPress --> handleOnBackPressed() --> setResult(RESULT_OK)");
            InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
            if (interfaceC22998b != null ? interfaceC22998b.mo69863q() : false) {
                MemberActivity.this.setResult(-1);
            } else {
                MemberActivity.this.setResult(0);
            }
            MemberActivity.this.finish();
        }
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public C4852a getViewBinding() {
        C4852a c4852aM23350c = C4852a.m23350c(getLayoutInflater());
        Intrinsics.m97801g(c4852aM23350c, "inflate(...)");
        return c4852aM23350c;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: f0 */
    public String mo65386f0() {
        return "";
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
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
        AbstractC3168w abstractC3168wM14557p = supportFragmentManager.m14557p();
        Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
        String stringExtra = getIntent().getStringExtra(EventConstants.KEY_SOURCE);
        abstractC3168wM14557p.m14814t(R$id.flContent, MemberFragment.INSTANCE.m69821a(stringExtra != null ? MemberSource.INSTANCE.m70136a(stringExtra) : null, getIntent().getStringExtra("scene_id")), "MemberFragment");
        abstractC3168wM14557p.mo14671j();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: m0 */
    public void mo65391m0() {
        getOnBackPressedDispatcher().m942i(this, this.onBackPress);
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: o0 */
    public boolean mo65393o0() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: p0 */
    public void mo65394p0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void retryLoadData() {
    }
}
