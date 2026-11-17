package com.transsion.mbwidget;

import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.work.C4689m;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.WorkManager;
import com.blankj.utilcode.util.AbstractC5775a;
import com.blankj.utilcode.util.Utils;
import com.tencent.mmkv.MMKV;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.gslb.GslbSdk;
import com.transsion.mbwidget.data.SportWidgetPeriodicWorker;
import com.transsion.mbwidget.data.WidgetRefreshWorker;
import com.transsion.mbwidget.guide.AddWidgetDialog;
import com.transsion.mbwidget.guide.InterfaceC15742a;
import com.transsnet.downloader.manager.C21851p;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p648oj.AbstractC26235a;

/* JADX INFO: renamed from: com.transsion.mbwidget.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C15716d extends AbstractC26235a {

    /* JADX INFO: renamed from: a */
    public static final C15716d f54081a;

    /* JADX INFO: renamed from: b */
    private static final Lazy f54082b;

    /* JADX INFO: renamed from: c */
    private static InterfaceC15742a f54083c;

    /* JADX INFO: renamed from: d */
    private static final long f54084d;

    static {
        C15716d c15716d = new C15716d();
        f54081a = c15716d;
        f54082b = LazyKt.m97097b(new Function0() { // from class: com.transsion.mbwidget.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C15716d.m69631p();
            }
        });
        f54084d = 604800000L;
        C21851p.f67672a.m88759a(Utils.m27275a()).mo88675g(c15716d);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        C4689m c4689m = (C4689m) ((C4689m.a) new C4689m.a(WidgetRefreshWorker.class, 30L, timeUnit).m22739a("desk_widget")).m22740b();
        try {
            Result.Companion companion = Result.INSTANCE;
            Context contextCreateDeviceProtectedStorageContext = Build.VERSION.SDK_INT >= 24 ? GslbSdk.context.createDeviceProtectedStorageContext() : GslbSdk.context;
            WorkManager workManagerM22333f = WorkManager.m22333f(contextCreateDeviceProtectedStorageContext);
            ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy = ExistingPeriodicWorkPolicy.KEEP;
            workManagerM22333f.mo22339e("unique_desk_widget", existingPeriodicWorkPolicy, c4689m);
            Result.m112707constructorimpl(WorkManager.m22333f(contextCreateDeviceProtectedStorageContext).mo22339e("unique_sport_widget_periodic", existingPeriodicWorkPolicy, (C4689m) ((C4689m.a) new C4689m.a(SportWidgetPeriodicWorker.class, 60L, timeUnit).m22739a("sport_widget_periodic")).m22740b()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    private C15716d() {
    }

    /* JADX WARN: Unreachable blocks removed: 8, instructions: 12 */
    /* JADX INFO: renamed from: l */
    private final boolean m69630l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final MMKV m69631p() {
        MMKV mmkvM61551I = MMKV.m61551I("desk_widget");
        Intrinsics.m97801g(mmkvM61551I, "mmkvWithID(...)");
        return mmkvM61551I;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ boolean m69632s(C15716d c15716d, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function0 = null;
        }
        return c15716d.m69640r(function0);
    }

    @Override // p648oj.AbstractC26235a, p648oj.InterfaceC26269m0
    /* JADX INFO: renamed from: e */
    public void mo24050e(DownloadBean bean, String str) {
        Intrinsics.m97802h(bean, "bean");
        Activity activityM27311b = AbstractC5775a.m27311b();
        if (Intrinsics.m97797c(activityM27311b != null ? activityM27311b.getLocalClassName() : null, "com.transsion.subroom.activity.MainActivity")) {
            m69632s(this, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m69633i(Function0 function0) {
        long j11 = m69635k().getLong("desk_widget_guide_show_first", 0L);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("firstStartShow :");
        sb2.append(j11);
        if (j11 == 0 || C14496b.f50966a.m65344b().getInt("k_open_day_count", 0) >= 3) {
            return m69640r(function0);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC15742a m69634j() {
        return f54083c;
    }

    /* JADX INFO: renamed from: k */
    public final MMKV m69635k() {
        return (MMKV) f54082b.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m69636m() {
        int[] appWidgetIds = AppWidgetManager.getInstance(GslbSdk.context).getAppWidgetIds(new ComponentName(GslbSdk.context, (Class<?>) HotSubjectWidgetProvider.class));
        if (appWidgetIds != null) {
            return !(appWidgetIds.length == 0);
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m69637n() {
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.m97801g(MANUFACTURER, "MANUFACTURER");
        String lowerCase = MANUFACTURER.toLowerCase(Locale.ROOT);
        Intrinsics.m97801g(lowerCase, "toLowerCase(...)");
        return StringsKt.m98227H(lowerCase, "xiaomi", true);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m69638o() {
        Object systemService = Utils.m27275a().getSystemService("appwidget");
        AppWidgetManager appWidgetManager = systemService instanceof AppWidgetManager ? (AppWidgetManager) systemService : null;
        if (appWidgetManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return appWidgetManager.isRequestPinAppWidgetSupported();
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m69639q(InterfaceC15742a interfaceC15742a) {
        f54083c = interfaceC15742a;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m69640r(Function0 function0) {
        boolean z11 = false;
        try {
            Result.Companion companion = Result.INSTANCE;
            long jCurrentTimeMillis = System.currentTimeMillis() - m69635k().getLong("desk_widget_guide_show_time", 0L);
            boolean zM69636m = m69636m();
            boolean zM69638o = m69638o();
            boolean zM69630l = m69630l();
            long j11 = f54084d;
            boolean z12 = jCurrentTimeMillis > j11;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("showAddDialog sup:");
            sb2.append(zM69638o);
            sb2.append("， show:");
            sb2.append(zM69636m);
            sb2.append(", over:");
            sb2.append(z12);
            sb2.append("，guideEnable:");
            sb2.append(zM69630l);
            sb2.append(" ");
            if (zM69630l && zM69638o && !zM69636m && jCurrentTimeMillis > j11) {
                Activity activityM27311b = AbstractC5775a.m27311b();
                if (!activityM27311b.isFinishing() && !activityM27311b.isDestroyed()) {
                    AddWidgetDialog addWidgetDialog = new AddWidgetDialog();
                    addWidgetDialog.m69730t0(function0);
                    addWidgetDialog.m65448g0(activityM27311b, "AddWidgetDialog");
                    z11 = true;
                }
            }
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        return z11;
    }
}
