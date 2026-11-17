package com.transsion.transfer.wifi.util;

import android.net.wifi.WifiManager;
import android.os.PowerManager;
import com.blankj.utilcode.util.Utils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.transfer.wifi.util.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C20135f {

    /* JADX INFO: renamed from: a */
    public static final C20135f f63996a = new C20135f();

    /* JADX INFO: renamed from: b */
    private static WifiManager.WifiLock f63997b;

    /* JADX INFO: renamed from: c */
    private static PowerManager.WakeLock f63998c;

    private C20135f() {
    }

    /* JADX INFO: renamed from: b */
    private final String m83563b() {
        String simpleName = C20135f.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: renamed from: a */
    public final void m83564a() {
        PowerManager.WakeLock wakeLock;
        WifiManager.WifiLock wifiLock;
        try {
            if (f63997b == null) {
                Object systemService = Utils.m27275a().getApplicationContext().getSystemService("wifi");
                Intrinsics.m97800f(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                f63997b = ((WifiManager) systemService).createWifiLock(3, "MB:Wifi-Connect");
            }
            if (f63998c == null) {
                Object systemService2 = Utils.m27275a().getSystemService("power");
                Intrinsics.m97800f(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
                f63998c = ((PowerManager) systemService2).newWakeLock(1, "MB:Wifi-Connect");
            }
            WifiManager.WifiLock wifiLock2 = f63997b;
            if (wifiLock2 != null && !wifiLock2.isHeld() && (wifiLock = f63997b) != null) {
                wifiLock.acquire();
            }
            PowerManager.WakeLock wakeLock2 = f63998c;
            if (wakeLock2 == null || wakeLock2.isHeld() || (wakeLock = f63998c) == null) {
                return;
            }
            wakeLock.acquire(600000L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m83565c() {
        WifiManager.WifiLock wifiLock = f63997b;
        if (wifiLock != null && wifiLock.isHeld()) {
            WifiManager.WifiLock wifiLock2 = f63997b;
            if (wifiLock2 != null) {
                wifiLock2.release();
            }
            f63997b = null;
            C20136g.m83566b(C20136g.f63999a, m83563b() + " --> release() --> mWifiLock?.release() --> success", false, 2, null);
        }
        PowerManager.WakeLock wakeLock = f63998c;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        PowerManager.WakeLock wakeLock2 = f63998c;
        if (wakeLock2 != null) {
            wakeLock2.release();
        }
        f63998c = null;
        C20136g.m83566b(C20136g.f63999a, m83563b() + " --> release() --> mWakeLock?.release() --> success", false, 2, null);
    }
}
