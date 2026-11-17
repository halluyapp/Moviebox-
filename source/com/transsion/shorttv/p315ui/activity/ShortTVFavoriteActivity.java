package com.transsion.shorttv.p315ui.activity;

import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.activity.AbstractC0256u;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.FragmentManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.therouter.TheRouter;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.base.activity.BaseNewActivity;
import com.transsion.shorttv.p315ui.fragment.ShortTVFavoriteFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p356ds.AbstractC23048b;
import pg.C26866a;
import rs.C27350l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\b\u0005*\u0001\u001c\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0004R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, m97100d2 = {"Lcom/transsion/shorttv/ui/activity/ShortTVFavoriteActivity;", "Lcom/transsion/shorttv/base/activity/BaseNewActivity;", "Lrs/l;", "<init>", "()V", "l0", "()Lrs/l;", "", "V", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "b0", "g0", "", "isTranslucent", "()Z", "isStatusDark", "c0", "a0", "f0", "retryLoadData", "j", "Ljava/lang/String;", "ops", "com/transsion/shorttv/ui/activity/ShortTVFavoriteActivity$a", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/shorttv/ui/activity/ShortTVFavoriteActivity$a;", "onBackPress", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTVFavoriteActivity extends BaseNewActivity<C27350l> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public String ops;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C18888a onBackPress = new C18888a();

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.activity.ShortTVFavoriteActivity$a */
    public static final class C18888a extends AbstractC0256u {
        C18888a() {
            super(true);
        }

        @Override // androidx.activity.AbstractC0256u
        public void handleOnBackPressed() {
            C26866a.a.m104899g(C26866a.f81698a, "ShortTVFavoriteActivity --> onBackPress --> handleOnBackPressed() --> setResult(RESULT_OK)", false, 2, null);
            ShortTVFavoriteActivity.this.finish();
        }
    }

    @Override // com.transsion.shorttv.base.activity.BaseNewActivity
    /* JADX INFO: renamed from: V */
    public String mo78990V() {
        return "";
    }

    @Override // com.transsion.shorttv.base.activity.BaseNewActivity
    /* JADX INFO: renamed from: a0 */
    public void mo78993a0() {
    }

    @Override // com.transsion.shorttv.base.activity.BaseNewActivity
    /* JADX INFO: renamed from: b0 */
    public void mo78994b0() {
        FrameLayout root = ((C27350l) getMViewBinding()).getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        AbstractC23048b.m91690a(root);
        m79000i0();
    }

    @Override // com.transsion.shorttv.base.activity.BaseNewActivity
    /* JADX INFO: renamed from: c0 */
    public void mo78995c0() {
        getOnBackPressedDispatcher().m942i(this, this.onBackPress);
    }

    @Override // com.transsion.shorttv.base.activity.BaseNewActivity
    /* JADX INFO: renamed from: f0 */
    public void mo78998f0() {
    }

    @Override // com.transsion.shorttv.base.activity.BaseNewActivity
    /* JADX INFO: renamed from: g0 */
    public void mo78999g0() {
        super.mo78999g0();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
        AbstractC3168w abstractC3168wM14557p = supportFragmentManager.m14557p();
        Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
        ShortTVFavoriteFragment shortTVFavoriteFragmentM79838a = ShortTVFavoriteFragment.INSTANCE.m79838a();
        shortTVFavoriteFragmentM79838a.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("ops", this.ops)));
        abstractC3168wM14557p.m14814t(R$id.flContent, shortTVFavoriteFragmentM79838a, "ShortTVFavoriteFragment");
        abstractC3168wM14557p.mo14671j();
    }

    @Override // com.transsion.shorttv.base.activity.BaseNewActivity
    public boolean isStatusDark() {
        return false;
    }

    @Override // com.transsion.shorttv.base.activity.BaseNewActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.shorttv.base.activity.BaseCommonActivity
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public C27350l getViewBinding() {
        C27350l c27350lM106466c = C27350l.m106466c(getLayoutInflater());
        Intrinsics.m97801g(c27350lM106466c, "inflate(...)");
        return c27350lM106466c;
    }

    @Override // com.transsion.shorttv.base.activity.BaseNewActivity, com.transsion.shorttv.base.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InvocationTargetException {
        TheRouter.m61781l(this);
        super.onCreate(savedInstanceState);
    }

    @Override // com.transsion.shorttv.base.activity.BaseNewActivity
    public void retryLoadData() {
    }
}
