package com.transsion.transfer.wifi.util;

import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.transsion.transfer.wifi.util.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C20130a {

    /* JADX INFO: renamed from: a */
    public static final C20130a f63991a = new C20130a();

    private C20130a() {
    }

    /* JADX INFO: renamed from: a */
    public final int m83548a(WifiConfiguration wifiConfig) {
        Intrinsics.m97802h(wifiConfig, "wifiConfig");
        try {
            return wifiConfig.getClass().getDeclaredField("numAssociation").getInt(wifiConfig);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m83549b(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            return "OPEN";
        }
        String str2 = "WEP";
        if (!StringsKt.m98132c0(str, "WEP", false, 2, null)) {
            str2 = "PSK";
            if (!StringsKt.m98132c0(str, "PSK", false, 2, null) && !StringsKt.m98132c0(str, "WPA", false, 2, null)) {
                str2 = "EAP";
                if (!StringsKt.m98132c0(str, "EAP", false, 2, null)) {
                    str2 = "OTHER";
                    if (!StringsKt.m98132c0(str, "OTHER", false, 2, null)) {
                        return "OPEN";
                    }
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m83550c(String str) {
        int length = str != null ? str.length() : 0;
        if (length != 10 && length != 26 && length != 58) {
            return false;
        }
        Intrinsics.m97799e(str);
        return new Regex("[0-9A-Fa-f]*").matches(str);
    }

    /* JADX INFO: renamed from: d */
    public final void m83551d(WifiConfiguration wifiConfig) {
        Intrinsics.m97802h(wifiConfig, "wifiConfig");
        try {
            Field declaredField = wifiConfig.getClass().getDeclaredField("numNoInternetAccessReports");
            declaredField.setAccessible(true);
            declaredField.setInt(wifiConfig, 1);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m83552e(WifiManager wifiManager, WifiConfiguration wifiConfig) {
        Intrinsics.m97802h(wifiManager, "wifiManager");
        Intrinsics.m97802h(wifiConfig, "wifiConfig");
        try {
            int i11 = 0;
            for (WifiConfiguration wifiConfiguration : wifiManager.getConfiguredNetworks()) {
                C20130a c20130a = f63991a;
                Intrinsics.m97799e(wifiConfiguration);
                int iM83548a = c20130a.m83548a(wifiConfiguration);
                if (iM83548a > i11) {
                    i11 = iM83548a;
                }
            }
            Field declaredField = wifiConfig.getClass().getDeclaredField("numAssociation");
            declaredField.setAccessible(true);
            declaredField.setInt(wifiConfig, i11);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x00dc  */
    /* JADX INFO: renamed from: f */
    public final void m83553f(WifiConfiguration config, String str, String str2) {
        Intrinsics.m97802h(config, "config");
        config.allowedAuthAlgorithms.clear();
        config.allowedGroupCiphers.clear();
        config.allowedKeyManagement.clear();
        config.allowedPairwiseCiphers.clear();
        config.allowedProtocols.clear();
        switch (m83549b(str)) {
            case "EAP":
                config.allowedProtocols.set(1);
                config.allowedProtocols.set(0);
                config.allowedGroupCiphers.set(0);
                config.allowedGroupCiphers.set(1);
                config.allowedGroupCiphers.set(2);
                config.allowedGroupCiphers.set(3);
                config.allowedPairwiseCiphers.set(1);
                config.allowedPairwiseCiphers.set(2);
                config.allowedKeyManagement.set(2);
                config.allowedKeyManagement.set(3);
                WifiUtils wifiUtils = WifiUtils.f63989a;
                Intrinsics.m97799e(str2);
                config.preSharedKey = wifiUtils.m83531d(str2);
                break;
            case "PSK":
                config.hiddenSSID = true;
                config.allowedAuthAlgorithms.set(0);
                config.allowedProtocols.set(1);
                config.allowedProtocols.set(0);
                config.allowedKeyManagement.set(1);
                config.allowedPairwiseCiphers.set(2);
                config.allowedPairwiseCiphers.set(1);
                config.allowedGroupCiphers.set(0);
                config.allowedGroupCiphers.set(1);
                config.allowedGroupCiphers.set(3);
                config.allowedGroupCiphers.set(2);
                WifiUtils wifiUtils2 = WifiUtils.f63989a;
                Intrinsics.m97799e(str2);
                config.preSharedKey = wifiUtils2.m83531d(str2);
                config.status = 2;
                break;
            case "WEP":
                config.hiddenSSID = true;
                config.wepTxKeyIndex = 0;
                config.allowedKeyManagement.set(0);
                config.allowedAuthAlgorithms.set(1);
                config.allowedPairwiseCiphers.set(2);
                config.allowedPairwiseCiphers.set(1);
                config.allowedGroupCiphers.set(0);
                config.allowedGroupCiphers.set(1);
                config.status = 2;
                if (!f63991a.m83550c(str2)) {
                    String[] strArr = config.wepKeys;
                    WifiUtils wifiUtils3 = WifiUtils.f63989a;
                    Intrinsics.m97799e(str2);
                    strArr[0] = wifiUtils3.m83531d(str2);
                } else {
                    config.wepKeys[0] = str2;
                }
                break;
            case "OPEN":
                config.allowedKeyManagement.set(0);
                break;
            default:
                StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
                String str3 = String.format("\"%s\"", Arrays.copyOf(new Object[]{str2}, 1));
                Intrinsics.m97801g(str3, "format(...)");
                config.preSharedKey = str3;
                break;
        }
        config.status = 2;
    }

    /* JADX INFO: renamed from: g */
    public final int m83554g(WifiManager wifiManager, WifiConfiguration config) {
        Intrinsics.m97802h(wifiManager, "wifiManager");
        Intrinsics.m97802h(config, "config");
        C20130a c20130a = f63991a;
        c20130a.m83552e(wifiManager, config);
        c20130a.m83551d(config);
        return wifiManager.updateNetwork(config);
    }
}
