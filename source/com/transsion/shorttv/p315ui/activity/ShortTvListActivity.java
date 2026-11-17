package com.transsion.shorttv.p315ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.Fragment;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.ViewModelLazy;
import as.C4707b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.therouter.TheRouter;
import com.transsion.p285ad.bidding.video.BiddingVideoManager;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.base.activity.BaseActivity;
import com.transsion.shorttv.p313ad.playeroverlayad.ShortTvPlayerOverlayAdManager;
import com.transsion.shorttv.p315ui.fragment.ShortTvDetailListFragment;
import com.transsion.shorttv.viewmodel.ShortTvViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.lang.reflect.InvocationTargetException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p669p1.AbstractC26781a;
import p848vs.InterfaceC28219j;
import rs.C27350l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u0004R\u0016\u0010\u001e\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u0010\nR\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\"\u00108\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\n\u001a\u0004\b6\u0010\u000e\"\u0004\b7\u0010\t¨\u0006;"}, m97100d2 = {"Lcom/transsion/shorttv/ui/activity/ShortTvListActivity;", "Lcom/transsion/shorttv/base/activity/BaseActivity;", "Lrs/l;", "<init>", "()V", "", "forceReplace", "", "a0", "(Z)V", "Z", "X", "()Lrs/l;", "isStatusDark", "()Z", "isMonitorNetworkState", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onResume", "onPause", "", "g", "I", "ep", "", "h", "J", "ms", "i", "isHistoryFirst", "", "j", "Ljava/lang/String;", "subjectId", CampaignEx.JSON_KEY_AD_K, "ops", "Lcom/transsion/shorttv/ui/fragment/ShortTvDetailListFragment;", "l", "Lcom/transsion/shorttv/ui/fragment/ShortTvDetailListFragment;", "fragment", "Lcom/transsion/shorttv/viewmodel/ShortTvViewModel;", "m", "Lkotlin/Lazy;", "W", "()Lcom/transsion/shorttv/viewmodel/ShortTvViewModel;", "shortTvViewModel", "n", "Y", "setActivityPaused", "isActivityPaused", "o", "a", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTvListActivity extends BaseActivity<C27350l> {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int ep = -1;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public long ms;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isHistoryFirst;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public String subjectId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public String ops;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private ShortTvDetailListFragment fragment;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Lazy shortTvViewModel;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isActivityPaused;

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.activity.ShortTvListActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m79517a(Context context, String subjectId, Integer num, long j11, boolean z11, String str) {
            Intrinsics.m97802h(context, "context");
            Intrinsics.m97802h(subjectId, "subjectId");
            Intent intent = new Intent(context, (Class<?>) ShortTvListActivity.class);
            Bundle bundleM11890a = AbstractC2411d.m11890a();
            bundleM11890a.putString("id", subjectId);
            bundleM11890a.putString("ops", str);
            if (num != null) {
                bundleM11890a.putInt("ep", num.intValue());
                bundleM11890a.putLong("ms", j11);
                bundleM11890a.putBoolean("historyFist", z11);
            }
            intent.putExtras(bundleM11890a);
            context.startActivity(intent);
        }
    }

    public ShortTvListActivity() {
        final Function0 function0 = null;
        this.shortTvViewModel = new ViewModelLazy(Reflection.m97823b(ShortTvViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.shorttv.ui.activity.ShortTvListActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.shorttv.ui.activity.ShortTvListActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<AbstractC26781a>() { // from class: com.transsion.shorttv.ui.activity.ShortTvListActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final AbstractC26781a invoke() {
                AbstractC26781a abstractC26781a;
                Function0 function1 = function0;
                return (function1 == null || (abstractC26781a = (AbstractC26781a) function1.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : abstractC26781a;
            }
        });
    }

    /* JADX INFO: renamed from: W */
    private final ShortTvViewModel m79510W() {
        return (ShortTvViewModel) this.shortTvViewModel.getValue();
    }

    /* JADX INFO: renamed from: Z */
    private final void m79511Z() {
        BiddingVideoManager.Companion companion = BiddingVideoManager.f49576t;
        BiddingVideoManager.Companion.m63266b(companion, "ShortTvPlayerUnlockPlayScene", null, 2, null);
        BiddingVideoManager.Companion.m63266b(companion, "ShortTvPlayerUnlockDownloadScene", null, 2, null);
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), C25220y0.m99268b(), null, new ShortTvListActivity$preloadAd$1("ShortTvPlayerOverlayScene", null), 2, null);
    }

    /* JADX INFO: renamed from: a0 */
    private final void m79512a0(boolean forceReplace) {
        Fragment fragmentM14547k0 = getSupportFragmentManager().m14547k0("ShortTvDetailListFragment");
        ShortTvDetailListFragment shortTvDetailListFragment = fragmentM14547k0 instanceof ShortTvDetailListFragment ? (ShortTvDetailListFragment) fragmentM14547k0 : null;
        this.fragment = shortTvDetailListFragment;
        if (forceReplace || shortTvDetailListFragment == null) {
            ShortTvDetailListFragment shortTvDetailListFragment2 = new ShortTvDetailListFragment();
            Bundle extras = getIntent().getExtras();
            shortTvDetailListFragment2.setArguments(extras != null ? new Bundle(extras) : null);
            this.fragment = shortTvDetailListFragment2;
            AbstractC3168w abstractC3168wM14557p = getSupportFragmentManager().m14557p();
            int i11 = R$id.flContent;
            ShortTvDetailListFragment shortTvDetailListFragment3 = this.fragment;
            Intrinsics.m97799e(shortTvDetailListFragment3);
            abstractC3168wM14557p.m14814t(i11, shortTvDetailListFragment3, "ShortTvDetailListFragment");
            abstractC3168wM14557p.mo14673l();
        }
    }

    /* JADX INFO: renamed from: b0 */
    static /* synthetic */ void m79513b0(ShortTvListActivity shortTvListActivity, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        shortTvListActivity.m79512a0(z11);
    }

    @Override // com.transsion.shorttv.base.activity.BaseCommonActivity
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public C27350l getViewBinding() {
        C27350l c27350lM106466c = C27350l.m106466c(getLayoutInflater());
        Intrinsics.m97801g(c27350lM106466c, "inflate(...)");
        return c27350lM106466c;
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final boolean getIsActivityPaused() {
        return this.isActivityPaused;
    }

    @Override // com.transsion.shorttv.base.activity.BaseCommonActivity
    public boolean isMonitorNetworkState() {
        return false;
    }

    @Override // com.transsion.shorttv.base.activity.BaseActivity
    public boolean isStatusDark() {
        return false;
    }

    @Override // com.transsion.shorttv.base.activity.BaseActivity, com.transsion.shorttv.base.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InvocationTargetException {
        super.onCreate(savedInstanceState);
        C4707b.f16754a.m22776i(1, this);
        ShortTvPlayerOverlayAdManager.f60541a.m78951d(AbstractC3226v.m14968a(this));
        m79511Z();
        TheRouter.m61781l(this);
        m79513b0(this, false, 1, null);
        InterfaceC28219j interfaceC28219jM78983P = m78983P();
        if (interfaceC28219jM78983P != null) {
            interfaceC28219jM78983P.mo73715d();
        }
    }

    @Override // com.transsion.shorttv.base.activity.BaseActivity, com.transsion.shorttv.base.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ShortTvPlayerOverlayAdManager.f60541a.m78949b();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) throws IllegalAccessException, InvocationTargetException {
        ShortTvDetailListFragment shortTvDetailListFragment;
        Intrinsics.m97802h(intent, "intent");
        super.onNewIntent(intent);
        int intExtra = intent.getIntExtra("ep", -1);
        boolean zM97797c = Intrinsics.m97797c(this.subjectId, intent.getStringExtra("id"));
        setIntent(intent);
        TheRouter.m61781l(this);
        if (zM97797c) {
            if (intExtra < 0 || (shortTvDetailListFragment = this.fragment) == null) {
                return;
            }
            shortTvDetailListFragment.m79902k1(intExtra);
            return;
        }
        ShortTvDetailListFragment shortTvDetailListFragment2 = this.fragment;
        if (shortTvDetailListFragment2 != null) {
            shortTvDetailListFragment2.m79901i1();
        }
        m79510W().m80367Y0();
        m79512a0(true);
    }

    @Override // com.transsion.shorttv.base.activity.BaseActivity, com.transsion.shorttv.base.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        ShortTvDetailListFragment shortTvDetailListFragment;
        super.onPause();
        this.isActivityPaused = true;
        ShortTvDetailListFragment shortTvDetailListFragment2 = this.fragment;
        if (shortTvDetailListFragment2 != null) {
            shortTvDetailListFragment2.m79899g1();
        }
        if (!isFinishing() || (shortTvDetailListFragment = this.fragment) == null) {
            return;
        }
        shortTvDetailListFragment.m79901i1();
    }

    @Override // com.transsion.shorttv.base.activity.BaseActivity, com.transsion.shorttv.base.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.isActivityPaused = false;
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        if (shortTvDetailListFragment != null) {
            shortTvDetailListFragment.m79900h1();
        }
    }
}
