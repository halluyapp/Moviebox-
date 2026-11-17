package com.transsion.subroom.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import ck.C5110g;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.therouter.TheRouter;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.home.viewmodel.TrendingUGCViewModel;
import com.transsion.home.viewmodel.preload.PreloadTrendingData;
import com.transsion.p285ad.bidding.base.AbsAdBidding;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.bidding.splash.C13965b;
import com.transsion.p285ad.scene.C14047a;
import com.transsion.push.C17743f;
import com.transsion.startup.pref.consume.AppStartDotState;
import com.transsion.startup.pref.consume.AppStartReport;
import com.transsion.startup.pref.consume.C19582c;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p365e1.C23065a;
import p441gz.InterfaceC23704a;
import p811ui.C28012c;
import p877wm.C28406e;
import pg.C26866a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m97099d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0019\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0011J\u000f\u0010\u001a\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001c\u0010\u0003R\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\fR\u0016\u0010*\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\fR\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, m97100d2 = {"Lcom/transsion/subroom/activity/SplashActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "a0", "", "state", "Lcom/transsion/ad/bidding/base/BiddingIntermediateMaterialBean;", "maxEcpmObject", "W", "(Ljava/lang/String;Lcom/transsion/ad/bidding/base/BiddingIntermediateMaterialBean;)V", "Z", "U", "", "isSplashAdLoaded", "b0", "(Z)V", "setStatusBar", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "hasFocus", "onWindowFocusChanged", "onResume", "onPause", "onDestroy", "Lcom/transsion/ad/bidding/splash/b;", "a", "Lcom/transsion/ad/bidding/splash/b;", "splashManager", "Landroid/os/Handler;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "V", "()Landroid/os/Handler;", "mHandler", "c", "isBackups", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "isAdLoadStarted", "", "e", "J", "startTime", "f", "app_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SuppressLint({"CustomSplashScreen"})
public final class SplashActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C13965b splashManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mHandler = LazyKt.m97097b(new Function0() { // from class: com.transsion.subroom.activity.h0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SplashActivity.m81751X();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isBackups;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isAdLoadStarted;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long startTime;

    /* JADX INFO: renamed from: U */
    private final void m81748U() {
        C14496b c14496b = C14496b.f50966a;
        if (System.currentTimeMillis() - c14496b.m65344b().getLong("app_config_fetch_time", 0L) > 1800000) {
            C28406e.m109770p(C28406e.f87111a, null, null, 3, null);
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new SplashActivity$fetchAppConfig$1(null), 3, null);
            c14496b.m65344b().putLong("app_config_fetch_time", System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: V */
    private final Handler m81749V() {
        return (Handler) this.mHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public final void m81750W(String state, BiddingIntermediateMaterialBean maxEcpmObject) {
        C13965b c13965b;
        m81749V().removeCallbacksAndMessages(null);
        AppStartReport appStartReport = AppStartReport.f62550a;
        appStartReport.m81545f(new AppStartDotState(AppStartDotState.AD_RENDERING, 0L, 2, null));
        if (this.isBackups) {
            return;
        }
        this.isBackups = true;
        boolean zEquals = TextUtils.equals(NativeComponentConstants.KEY_COMPONENT_RESULT_SUCCESS, state);
        if (TextUtils.equals("time_out", state)) {
            C28012c.f86099a.m108920k("", "", 5, 105, "开屏广告加载超时", null);
        }
        if (!zEquals) {
            C13965b c13965b2 = this.splashManager;
            if (c13965b2 != null) {
                c13965b2.mo62775U();
            }
            this.splashManager = null;
        }
        if (!zEquals) {
            C19582c.f62562a.m81571q();
        }
        setStatusBar();
        m81753Z();
        m81748U();
        appStartReport.m81548l("splash_config");
        m81755b0(zEquals);
        if (getIntent().getBooleanExtra("without_ad", false)) {
            C19582c.f62562a.m81571q();
            appStartReport.m81545f(new AppStartDotState(AppStartDotState.AD_END, 0L, 2, null));
        } else {
            if (!zEquals || (c13965b = this.splashManager) == null) {
                return;
            }
            AbsAdBidding.m62802O0(c13965b, this, maxEcpmObject, false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final Handler m81751X() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final void m81752Y(SplashActivity splashActivity) {
        splashActivity.m81750W("time_out", null);
    }

    /* JADX INFO: renamed from: Z */
    private final void m81753Z() {
        PreloadTrendingData.C15566a c15566a = PreloadTrendingData.f53717n;
        c15566a.m69164a().m69163z();
        if (C5110g.f17601a.m23911b()) {
            TrendingUGCViewModel.C15543a c15543a = TrendingUGCViewModel.f53672l;
            Application application = getApplication();
            Intrinsics.m97801g(application, "getApplication(...)");
            TrendingUGCViewModel trendingUGCViewModelM69046a = c15543a.m69046a(application);
            if (trendingUGCViewModelM69046a != null) {
                trendingUGCViewModelM69046a.m69035A(this);
            }
        } else {
            c15566a.m69164a().m69160U(this);
        }
        c15566a.m69164a().m69153G();
    }

    /* JADX INFO: renamed from: a0 */
    private final void m81754a0() {
        if (this.isAdLoadStarted) {
            return;
        }
        this.isAdLoadStarted = true;
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new SplashActivity$startSplashAdLoad$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: b0 */
    private final void m81755b0(boolean isSplashAdLoaded) {
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.putExtra("isSplashAdLoaded", isSplashAdLoaded);
        startActivity(intent);
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new SplashActivity$toMain$1(this, null), 3, null);
        overridePendingTransition(0, 0);
        finish();
    }

    private final void setStatusBar() {
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(13312);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppStartReport appStartReport = AppStartReport.f62550a;
        appStartReport.m81545f(new AppStartDotState(AppStartDotState.SPLASH_START, 0L, 2, null));
        C23065a.f70299b.m91774a(this);
        appStartReport.m81548l("splash_screen");
        this.startTime = System.currentTimeMillis();
        C19582c c19582c = C19582c.f62562a;
        c19582c.m81568l(this);
        if (!isTaskRoot() && !Intrinsics.m97797c(getIntent().getStringExtra("from"), "deeplink")) {
            C26866a.a.m104898f(C26866a.f81698a, "SplashActivity", "finish from TaskRoot", false, 4, null);
            finish();
            return;
        }
        InterfaceC23704a interfaceC23704a = (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
        if (interfaceC23704a != null) {
            interfaceC23704a.mo90390l(interfaceC23704a.mo90393o() + 1);
        }
        C14496b c14496b = C14496b.f50966a;
        if (c14496b.m65344b().getBoolean("first_start_not_show_cold_ad", false)) {
            c19582c.m81569m();
            appStartReport.m81545f(new AppStartDotState(AppStartDotState.AD_LOADING, 0L, 2, null));
            appStartReport.m81548l("splash_ad_load_begin");
            m81754a0();
            m81749V().postDelayed(new Runnable() { // from class: com.transsion.subroom.activity.g0
                @Override // java.lang.Runnable
                public final void run() {
                    SplashActivity.m81752Y(this.f62678a);
                }
            }, ((long) C14047a.f49716a.m63600t("ColdStartScene")) * 1000);
        } else {
            c19582c.m81572r();
            m81750W("skip", null);
            c14496b.m65344b().putBoolean("first_start_not_show_cold_ad", true);
        }
        C17743f.f58493a.m75777d();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        AbstractC14517k.m65408f(null, this, 1, null);
        C13965b c13965b = this.splashManager;
        if (c13965b != null) {
            c13965b.m62829K0(null);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        AbstractC14517k.m65413k(null, this, 1, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        AbstractC14517k.m65417o(null, this, 1, null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        if (hasFocus) {
            AppStartReport.f62550a.m81545f(new AppStartDotState(AppStartDotState.SPLASH_RESUME, 0L, 2, null));
        }
    }
}
