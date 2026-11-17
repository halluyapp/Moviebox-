package com.transsion.rewardscenter.p309ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.AbstractC0256u;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.cloud.tmc.integration.event.EventConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baseui.activity.BaseNewActivity;
import com.transsion.rewardscenter.R$id;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p986zp.C29213b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\b\u0005*\u0001\u001d\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0004R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m97100d2 = {"Lcom/transsion/rewardscenter/ui/RewardsCenterActivity;", "Lcom/transsion/baseui/activity/BaseNewActivity;", "Lzp/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "C0", "()Lzp/b;", "", "f0", "()Ljava/lang/String;", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "l0", "m0", "k0", "p0", "retryLoadData", "i", "Ljava/lang/String;", EventConstants.KEY_SOURCE, "j", "sceneId", "com/transsion/rewardscenter/ui/RewardsCenterActivity$a", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/rewardscenter/ui/RewardsCenterActivity$a;", "onBackPress", "RewardsCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class RewardsCenterActivity extends BaseNewActivity<C29213b> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String source;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String sceneId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C17958a onBackPress = new C17958a();

    /* JADX INFO: renamed from: com.transsion.rewardscenter.ui.RewardsCenterActivity$a */
    public static final class C17958a extends AbstractC0256u {
        C17958a() {
            super(true);
        }

        @Override // androidx.activity.AbstractC0256u
        public void handleOnBackPressed() {
            RewardsCenterActivity.this.finish();
        }
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public C29213b getViewBinding() {
        C29213b c29213bM112079c = C29213b.m112079c(getLayoutInflater());
        Intrinsics.m97801g(c29213bM112079c, "inflate(...)");
        return c29213bM112079c;
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
        String stringExtra = getIntent().getStringExtra(EventConstants.KEY_SOURCE);
        String queryParameter = null;
        if (stringExtra == null) {
            Uri data = getIntent().getData();
            stringExtra = data != null ? data.getQueryParameter(EventConstants.KEY_SOURCE) : null;
        }
        this.source = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("scene_id");
        if (stringExtra2 == null) {
            Uri data2 = getIntent().getData();
            if (data2 != null) {
                queryParameter = data2.getQueryParameter("sceneId");
            }
        } else {
            queryParameter = stringExtra2;
        }
        this.sceneId = queryParameter;
        Uri data3 = getIntent().getData();
        boolean z11 = false;
        if (data3 != null && Intrinsics.m97797c(data3.getHost(), "member") && Intrinsics.m97797c(data3.getPath(), "/adtask")) {
            z11 = true;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
        AbstractC3168w abstractC3168wM14557p = supportFragmentManager.m14557p();
        Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
        RewardsCenterFragment rewardsCenterFragment = new RewardsCenterFragment();
        Bundle bundle = new Bundle();
        bundle.putString(EventConstants.KEY_SOURCE, this.source);
        bundle.putString("scene_id", this.sceneId);
        bundle.putBoolean("is_from_ad_task", z11);
        rewardsCenterFragment.setArguments(bundle);
        abstractC3168wM14557p.m14814t(R$id.fl_content, rewardsCenterFragment, "RewardsCenter");
        abstractC3168wM14557p.mo14671j();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: m0 */
    public void mo65391m0() {
        getOnBackPressedDispatcher().m942i(this, this.onBackPress);
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C26866a.a.m104898f(C26866a.f81698a, "RewardsCenter", "RewardsCenterActivity --> onCreate() --> source: " + this.source + ", sceneId: " + this.sceneId, false, 4, null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.m97802h(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        Fragment fragmentM14547k0 = getSupportFragmentManager().m14547k0("RewardsCenter");
        RewardsCenterFragment rewardsCenterFragment = fragmentM14547k0 instanceof RewardsCenterFragment ? (RewardsCenterFragment) fragmentM14547k0 : null;
        if (rewardsCenterFragment != null) {
            rewardsCenterFragment.m76597q1();
        }
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: p0 */
    public void mo65394p0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void retryLoadData() {
    }
}
