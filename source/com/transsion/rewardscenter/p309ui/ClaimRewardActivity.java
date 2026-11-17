package com.transsion.rewardscenter.p309ui;

import androidx.activity.AbstractC0256u;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.FragmentManager;
import com.transsion.baseui.activity.BaseNewActivity;
import com.transsion.rewardscenter.R$id;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p986zp.C29212a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0004¨\u0006\u0013"}, m97100d2 = {"Lcom/transsion/rewardscenter/ui/ClaimRewardActivity;", "Lcom/transsion/baseui/activity/BaseNewActivity;", "Lzp/a;", "<init>", "()V", "C0", "()Lzp/a;", "", "f0", "()Ljava/lang/String;", "", "l0", "m0", "k0", "p0", "retryLoadData", "D0", "i", "a", "RewardsCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ClaimRewardActivity extends BaseNewActivity<C29212a> {

    /* JADX INFO: renamed from: j */
    public static final int f58897j = BaseNewActivity.f50985h;

    /* JADX INFO: renamed from: com.transsion.rewardscenter.ui.ClaimRewardActivity$b */
    public static final class C17950b extends AbstractC0256u {
        C17950b() {
            super(true);
        }

        @Override // androidx.activity.AbstractC0256u
        public void handleOnBackPressed() {
            ClaimRewardActivity.this.finish();
        }
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public C29212a getViewBinding() {
        C29212a c29212aM112075c = C29212a.m112075c(getLayoutInflater());
        Intrinsics.m97801g(c29212aM112075c, "inflate(...)");
        return c29212aM112075c;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m76461D0() {
        setResult(-1);
        finish();
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

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: l0 */
    public void mo65390l0() {
        String stringExtra = getIntent().getStringExtra("prize_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
        AbstractC3168w abstractC3168wM14557p = supportFragmentManager.m14557p();
        Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
        abstractC3168wM14557p.m14814t(R$id.fl_content, ClaimRewardFragment.INSTANCE.m76505a(stringExtra), "ClaimRewardFragment");
        abstractC3168wM14557p.mo14671j();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: m0 */
    public void mo65391m0() {
        getOnBackPressedDispatcher().m942i(this, new C17950b());
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: p0 */
    public void mo65394p0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void retryLoadData() {
    }
}
