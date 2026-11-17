package com.transsion.shorttv_pugc.p317ui.activity;

import android.widget.FrameLayout;
import androidx.activity.AbstractC0256u;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.FragmentManager;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv_pugc.base.activity.BaseNewActivity;
import com.transsion.shorttv_pugc.p317ui.fragment.ShortTVFavoriteFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import ht.AbstractC23896b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pg.C26866a;
import rs.C27350l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\b\u0005*\u0001\u0015\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/ui/activity/ShortTVFavoriteActivity;", "Lcom/transsion/shorttv_pugc/base/activity/BaseNewActivity;", "Lrs/l;", "<init>", "()V", "l0", "()Lrs/l;", "", "V", "()Ljava/lang/String;", "", "b0", "g0", "", "isTranslucent", "()Z", "isStatusDark", "c0", "a0", "f0", "retryLoadData", "com/transsion/shorttv_pugc/ui/activity/ShortTVFavoriteActivity$a", "j", "Lcom/transsion/shorttv_pugc/ui/activity/ShortTVFavoriteActivity$a;", "onBackPress", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTVFavoriteActivity extends BaseNewActivity<C27350l> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C19304a onBackPress = new C19304a();

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.activity.ShortTVFavoriteActivity$a */
    public static final class C19304a extends AbstractC0256u {
        C19304a() {
            super(true);
        }

        @Override // androidx.activity.AbstractC0256u
        public void handleOnBackPressed() {
            C26866a.a.m104899g(C26866a.f81698a, "ShortTVFavoriteActivity --> onBackPress --> handleOnBackPressed() --> setResult(RESULT_OK)", false, 2, null);
            ShortTVFavoriteActivity.this.finish();
        }
    }

    @Override // com.transsion.shorttv_pugc.base.activity.BaseNewActivity
    /* JADX INFO: renamed from: V */
    public String mo80434V() {
        return "";
    }

    @Override // com.transsion.shorttv_pugc.base.activity.BaseNewActivity
    /* JADX INFO: renamed from: a0 */
    public void mo80437a0() {
    }

    @Override // com.transsion.shorttv_pugc.base.activity.BaseNewActivity
    /* JADX INFO: renamed from: b0 */
    public void mo80438b0() {
        FrameLayout root = ((C27350l) getMViewBinding()).getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        AbstractC23896b.m94639a(root);
        m80444i0();
    }

    @Override // com.transsion.shorttv_pugc.base.activity.BaseNewActivity
    /* JADX INFO: renamed from: c0 */
    public void mo80439c0() {
        getOnBackPressedDispatcher().m942i(this, this.onBackPress);
    }

    @Override // com.transsion.shorttv_pugc.base.activity.BaseNewActivity
    /* JADX INFO: renamed from: f0 */
    public void mo80442f0() {
    }

    @Override // com.transsion.shorttv_pugc.base.activity.BaseNewActivity
    /* JADX INFO: renamed from: g0 */
    public void mo80443g0() {
        super.mo80443g0();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
        AbstractC3168w abstractC3168wM14557p = supportFragmentManager.m14557p();
        Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
        abstractC3168wM14557p.m14814t(R$id.flContent, ShortTVFavoriteFragment.INSTANCE.m81006a(), "ShortTVFavoriteFragment");
        abstractC3168wM14557p.mo14671j();
    }

    @Override // com.transsion.shorttv_pugc.base.activity.BaseNewActivity
    public boolean isStatusDark() {
        return false;
    }

    @Override // com.transsion.shorttv_pugc.base.activity.BaseNewActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.shorttv_pugc.base.activity.BaseCommonActivity
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public C27350l getViewBinding() {
        C27350l c27350lM106466c = C27350l.m106466c(getLayoutInflater());
        Intrinsics.m97801g(c27350lM106466c, "inflate(...)");
        return c27350lM106466c;
    }

    @Override // com.transsion.shorttv_pugc.base.activity.BaseNewActivity
    public void retryLoadData() {
    }
}
