package com.transsion.subroom.app;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AbstractC0305f;
import androidx.work.C4561a;
import androidx.work.WorkManager;
import bh.C4831e;
import ck.C5111h;
import com.blankj.utilcode.util.AbstractC5801t;
import com.cloud.tmc.integration.permission.PermissionConstant;
import com.p282tn.lib.net.dns.p283or.CacheIpPool;
import com.tencent.tinker.entry.DefaultApplicationLike;
import com.transsion.baselib.net.AppLifeStatusInterceptor;
import com.transsion.baselib.net.C14478f;
import com.transsion.baselib.net.C14481i;
import com.transsion.baselib.report.C14492k;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.startup.StartupManager;
import com.transsion.startup.pref.consume.AppStartDotState;
import com.transsion.startup.pref.consume.AppStartReport;
import com.transsion.startup.pref.consume.C19582c;
import com.transsion.subroom.app.SubRoomAppLike;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import eu.C23222a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import no.C26053g0;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import p791tu.C27852a;
import p913xm.C28615f;
import pg.C26866a;
import su.AbstractC27654h;
import vu.AbstractC28226b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 42\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00015B9\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0014J\u0019\u0010\u001f\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\u0014J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00102\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00066"}, m97100d2 = {"Lcom/transsion/subroom/app/SubRoomAppLike;", "Lcom/tencent/tinker/entry/DefaultApplicationLike;", "Landroid/content/ComponentCallbacks2;", "Landroidx/work/a$c;", "Lrh/n;", "Landroid/app/Application;", "app", "", "tinkerFlags", "", "tinkerLoadVerifyFlag", "", "applicationStartElapsedTime", "applicationStartMillisTime", "Landroid/content/Intent;", "tinkerResultIntent", "<init>", "(Landroid/app/Application;IZJJLandroid/content/Intent;)V", "", "applyHotfixConfig", "()V", "applyHotfixConfigInternal", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onConnected", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onDisconnected", "Landroid/content/Context;", "base", "onBaseContextAttached", "(Landroid/content/Context;)V", "onCreate", PermissionConstant.level, "onTrimMemory", "(I)V", "Landroidx/work/a;", "getWorkManagerConfiguration", "()Landroidx/work/a;", "", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hotfixConfigApplying", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hotfixConfigApplied", "Z", "isMainProcess$delegate", "Lkotlin/Lazy;", "isMainProcess", "()Z", "Companion", "a", "app_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public class SubRoomAppLike extends DefaultApplicationLike implements ComponentCallbacks2, C4561a.c, InterfaceC27288n {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String TAG;
    private volatile boolean hotfixConfigApplied;
    private final AtomicBoolean hotfixConfigApplying;

    /* JADX INFO: renamed from: isMainProcess$delegate, reason: from kotlin metadata */
    private final Lazy isMainProcess;

    /* JADX INFO: renamed from: com.transsion.subroom.app.SubRoomAppLike$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public final Function0 m81776k() {
            return new Function0() { // from class: eu.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(SubRoomAppLike.Companion.m81777l());
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: l */
        public static final boolean m81777l() {
            Boolean boolM1;
            ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("brandwidth_redundancy_on", true);
            String value = configBeanM110360c != null ? configBeanM110360c.getValue() : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getBrandWidthRedundancyOn API: ");
            sb2.append(value);
            if (value == null || value.length() == 0 || (boolM1 = StringsKt.m98153m1(value)) == null) {
                return false;
            }
            return boolM1.booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: m */
        public final Function0 m81778m() {
            return new Function0() { // from class: eu.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(SubRoomAppLike.Companion.m81779n());
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public static final int m81779n() {
            Integer numV;
            ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("sa_player_max_buffer_time", true);
            String value = configBeanM110360c != null ? configBeanM110360c.getValue() : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getPlayerBufferingTime API: ");
            sb2.append(value);
            if (value == null || value.length() == 0 || (numV = StringsKt.m98216v(value)) == null) {
                return 20000;
            }
            return numV.intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: o */
        public final Function0 m81780o() {
            return new Function0() { // from class: eu.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(SubRoomAppLike.Companion.m81781p());
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public static final boolean m81781p() {
            ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("player_async", true);
            return Intrinsics.m97797c(configBeanM110360c != null ? configBeanM110360c.getValue() : null, "false");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public final Function0 m81782q() {
            return new Function0() { // from class: eu.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(SubRoomAppLike.Companion.m81783r());
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r */
        public static final boolean m81783r() {
            return !C5111h.f17603a.m23913a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: s */
        public final Function0 m81784s() {
            return new Function0() { // from class: eu.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(SubRoomAppLike.Companion.m81785t());
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: t */
        public static final int m81785t() {
            Integer numV;
            ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("sb_player_type", true);
            String value = configBeanM110360c != null ? configBeanM110360c.getValue() : null;
            if (value == null || value.length() == 0 || (numV = StringsKt.m98216v(value)) == null) {
                return 1;
            }
            return numV.intValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubRoomAppLike(Application app, int i11, boolean z11, long j11, long j12, Intent intent) {
        super(app, i11, z11, j11, j12, intent);
        Intrinsics.m97802h(app, "app");
        this.TAG = "SubRoomAppLike";
        this.hotfixConfigApplying = new AtomicBoolean(false);
        this.isMainProcess = LazyKt.m97097b(new Function0() { // from class: eu.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(AbstractC5801t.m27459e());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyHotfixConfig() {
        if (!this.hotfixConfigApplying.compareAndSet(false, true)) {
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "applyHotfixConfig already running, skip", false, 4, null);
            return;
        }
        try {
            applyHotfixConfigInternal();
        } finally {
            this.hotfixConfigApplying.set(false);
        }
    }

    private final void applyHotfixConfigInternal() {
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "applyHotfixConfig start", false, 4, null);
        AbstractC28226b.m109404a();
        if (C27852a.m108280s().m108288I()) {
            AbstractC27654h.m107570t(getApplication(), C23222a.f70767a.m92291a());
            this.hotfixConfigApplied = true;
        }
    }

    private final boolean isMainProcess() {
        return ((Boolean) this.isMainProcess.getValue()).booleanValue();
    }

    @Override // androidx.work.C4561a.c
    public C4561a getWorkManagerConfiguration() {
        C4561a c4561aM22364a = new C4561a.b().m22365b(4).m22364a();
        Intrinsics.m97801g(c4561aM22364a, "build(...)");
        return c4561aM22364a;
    }

    @Override // com.tencent.tinker.entry.DefaultApplicationLike, com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onBaseContextAttached(Context base) {
        C27852a.m108261H(C27852a.b.m108315z(C27852a.m108280s()).m108323H("both").m108328t("official").m108327s());
        AbstractC27654h.m107561k(base, 10000L);
        AbstractC27654h.m107571u(this);
        super.onBaseContextAttached(base);
        StartupManager.f62536g.m81510a().m81502A(base);
        C19582c.f62562a.m81566j();
        C14478f.f50924a.m65261c();
    }

    @Override // p743rh.InterfaceC27288n
    public void onConnected() {
        InterfaceC27288n.a.m106338a(this);
    }

    @Override // p743rh.InterfaceC27288n
    public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.m97802h(network, "network");
        Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
        if (this.hotfixConfigApplied) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: eu.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f70771a.applyHotfixConfig();
            }
        }, 10000L);
    }

    @Override // com.tencent.tinker.entry.DefaultApplicationLike, com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onCreate() {
        super.onCreate();
        CrashGuard.f62702a.m81762b();
        WorkManager.m22334h(getApplication(), getWorkManagerConfiguration());
        if (isMainProcess()) {
            C26053g0 c26053g0 = C26053g0.f79567a;
            Companion companion = INSTANCE;
            c26053g0.m102139F(companion.m81782q());
            c26053g0.m102136C(companion.m81780o());
            c26053g0.m102140G(companion.m81784s());
            c26053g0.m102138E(companion.m81778m());
            int iM102144j = c26053g0.m102144j();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getPlayerBufferingTimeRequest: ");
            sb2.append(iM102144j);
            c26053g0.m102137D(companion.m81776k());
            boolean zM102143i = c26053g0.m102143i();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("getBrandWidthRedundancyOnRequest: ");
            sb3.append(zM102143i);
            C4831e c4831e = C4831e.f17094a;
            c4831e.m23249a(new C14481i());
            c4831e.m23249a(new AppLifeStatusInterceptor());
            CacheIpPool.f48367a.m61958o("api6.aoneroom.com");
            StartupManager startupManagerM81510a = StartupManager.f62536g.m81510a();
            Application application = getApplication();
            Intrinsics.m97801g(application, "getApplication(...)");
            startupManagerM81510a.m81504c0(application);
            AppStartReport appStartReport = AppStartReport.f62550a;
            appStartReport.m81548l("startup_mgr_init");
            C27287m c27287m = C27287m.f83003a;
            c27287m.m106336l(this);
            Application application2 = getApplication();
            Intrinsics.m97801g(application2, "getApplication(...)");
            if (c27287m.m106334j(application2)) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: eu.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f70770a.applyHotfixConfig();
                    }
                }, 10000L);
            }
            if (!C14496b.f50966a.m65344b().getBoolean("dark_mode_follow_sys", false)) {
                AbstractC0305f.m1279O(2);
            }
            getApplication().registerActivityLifecycleCallbacks(C14492k.f50955a);
            appStartReport.m81548l("app_create_init");
        } else {
            StartupManager startupManagerM81510a2 = StartupManager.f62536g.m81510a();
            Application application3 = getApplication();
            Intrinsics.m97801g(application3, "getApplication(...)");
            startupManagerM81510a2.m81503V(application3);
        }
        AppStartReport.f62550a.m81545f(new AppStartDotState(AppStartDotState.APP_END, 0L, 2, null));
        AbstractC14517k.m65404b(null, 1, null);
    }

    @Override // p743rh.InterfaceC27288n
    public void onDisconnected() {
    }

    @Override // com.tencent.tinker.entry.DefaultApplicationLike, com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onTrimMemory(int level) {
        StartupManager.f62536g.m81510a().m81506j0(level, isMainProcess());
    }
}
