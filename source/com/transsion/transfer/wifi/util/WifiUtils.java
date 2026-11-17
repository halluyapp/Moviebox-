package com.transsion.transfer.wifi.util;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.WpsInfo;
import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pDevice;
import android.os.Build;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.blankj.utilcode.util.Utils;
import com.transsion.transfer.R$string;
import com.transsion.transfer.wifi.create.adapter.AbstractC20080d;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.C25220y0;
import p754rv.C27385a;

/* JADX INFO: loaded from: classes6.dex */
public final class WifiUtils {

    /* JADX INFO: renamed from: a */
    public static final WifiUtils f63989a = new WifiUtils();

    /* JADX INFO: renamed from: b */
    private static final Lazy f63990b = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.wifi.util.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WifiUtils.m83530u();
        }
    });

    private WifiUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final String m83527e() {
        String simpleName = WifiUtils.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final boolean m83528o(String str) {
        return m83529p(Utils.m27275a(), str);
    }

    /* JADX INFO: renamed from: p */
    private final boolean m83529p(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strReplace = new Regex("\"").replace(str, "");
        if (context == null) {
            return false;
        }
        String string = context.getString(R$string.wifi_ap_prefix);
        Intrinsics.m97801g(string, "getString(...)");
        if (!StringsKt.m98242W(strReplace, string, false, 2, null)) {
            String string2 = context.getString(R$string.wifi_direct_prefix);
            Intrinsics.m97801g(string2, "getString(...)");
            if (!StringsKt.m98242W(strReplace, string2, false, 2, null)) {
                String string3 = context.getString(R$string.wifi_ap_prefix_old);
                Intrinsics.m97801g(string3, "getString(...)");
                if (!StringsKt.m98242W(strReplace, string3, false, 2, null)) {
                    String string4 = context.getString(R$string.wifi_local_ap_prefix);
                    Intrinsics.m97801g(string4, "getString(...)");
                    if (!StringsKt.m98242W(strReplace, string4, false, 2, null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final WifiManager m83530u() {
        Object systemService = Utils.m27275a().getApplicationContext().getSystemService("wifi");
        Intrinsics.m97800f(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        return (WifiManager) systemService;
    }

    /* JADX INFO: renamed from: d */
    public final String m83531d(String ssid) {
        Intrinsics.m97802h(ssid, "ssid");
        if (TextUtils.isEmpty(ssid)) {
            return "";
        }
        int length = ssid.length() - 1;
        if (length < 0) {
            return ssid;
        }
        if (ssid.charAt(0) == '\"' && ssid.charAt(length) == '\"') {
            return ssid;
        }
        return "\"" + ssid + "\"";
    }

    /* JADX INFO: renamed from: f */
    public final WifiP2pConfig m83532f(C27385a c27385a, WifiP2pDevice wifiP2pDevice) {
        String strM106591p;
        String strM106590o;
        WpsInfo wpsInfo;
        WifiP2pConfig wifiP2pConfigBuild = null;
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                AbstractC20139j.m83580a();
                WifiP2pConfig.Builder builderM83410a = AbstractC20080d.m83410a();
                String str = "";
                if (c27385a == null || (strM106591p = c27385a.m106591p()) == null) {
                    strM106591p = "";
                }
                WifiP2pConfig.Builder networkName = builderM83410a.setNetworkName(strM106591p);
                if (c27385a != null && (strM106590o = c27385a.m106590o()) != null) {
                    str = strM106590o;
                }
                wifiP2pConfigBuild = networkName.setPassphrase(str).build();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } else {
            WifiP2pConfig wifiP2pConfig = new WifiP2pConfig();
            wifiP2pConfig.deviceAddress = wifiP2pDevice != null ? wifiP2pDevice.deviceAddress : null;
            wifiP2pConfigBuild = wifiP2pConfig;
        }
        if (wifiP2pConfigBuild != null && (wpsInfo = wifiP2pConfigBuild.wps) != null) {
            wpsInfo.setup = 0;
        }
        return wifiP2pConfigBuild;
    }

    /* JADX INFO: renamed from: g */
    public final String m83533g(InetAddress inetAddress) {
        String hostAddress;
        return (inetAddress == null || inetAddress.isLoopbackAddress() || (hostAddress = inetAddress.getHostAddress()) == null || !StringsKt.m98242W(hostAddress, "192.168", false, 2, null)) ? "" : hostAddress;
    }

    /* JADX INFO: renamed from: h */
    public final Object m83534h(Continuation continuation) {
        return AbstractC25088i.m98910g(C25220y0.m99268b(), new WifiUtils$getCorrectP2pAddress$2(null), continuation);
    }

    /* JADX INFO: renamed from: i */
    public final NetworkInfo.DetailedState m83535i() {
        Object systemService = Utils.m27275a().getApplicationContext().getSystemService("connectivity");
        Intrinsics.m97800f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.getDetailedState();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized String m83536j() {
        try {
            String ssid = m83539m().getConnectionInfo().getSSID();
            if (ssid.length() < 3 || m83539m().getConnectionInfo().getSupplicantState() == SupplicantState.DISCONNECTED) {
                return "";
            }
            Intrinsics.m97799e(ssid);
            String strSubstring = ssid.substring(1, ssid.length() - 1);
            Intrinsics.m97801g(strSubstring, "substring(...)");
            if (StringsKt.m98132c0(strSubstring, "unknown ssid", false, 2, null)) {
                try {
                    Object systemService = Utils.m27275a().getSystemService("connectivity");
                    Intrinsics.m97800f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        String extraInfo = activeNetworkInfo.getExtraInfo();
                        Intrinsics.m97801g(extraInfo, "getExtraInfo(...)");
                        strSubstring = extraInfo;
                    }
                } catch (Exception unused) {
                    C20136g.m83567d(C20136g.f63999a, m83527e() + " --> getCurrentSSID() --> getCurrentSSID->Current SSID:" + strSubstring, false, 2, null);
                }
            }
            return strSubstring;
        } catch (Exception e11) {
            C20136g.m83567d(C20136g.f63999a, m83527e() + " --> getCurrentSSID() --> getCurrentSSID Exception = " + e11, false, 2, null);
            return "";
        }
    }

    /* JADX INFO: renamed from: k */
    public final long m83537k() {
        try {
            DhcpInfo dhcpInfo = m83539m().getDhcpInfo();
            Intrinsics.m97801g(dhcpInfo, "getDhcpInfo(...)");
            long j11 = dhcpInfo.gateway;
            if (j11 != 0) {
                return j11;
            }
            return 0L;
        } catch (Exception e11) {
            C20136g.m83567d(C20136g.f63999a, m83527e() + " --> getGateway() --> 获取ip异常 it = :" + e11, false, 2, null);
        }
    }

    /* JADX INFO: renamed from: l */
    public final String m83538l() {
        Object objM112707constructorimpl;
        String hostAddress;
        Object obj = "";
        try {
            Result.Companion companion = Result.INSTANCE;
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces != null && networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses != null && inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (hostAddress = inetAddressNextElement.getHostAddress()) != null && StringsKt.m98242W(hostAddress, "192.168", false, 2, null)) {
                        String hostAddress2 = inetAddressNextElement.getHostAddress();
                        return hostAddress2 == null ? "" : hostAddress2;
                    }
                }
            }
            objM112707constructorimpl = Result.m112707constructorimpl("");
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl == null) {
            obj = objM112707constructorimpl;
        } else {
            C20136g.m83567d(C20136g.f63999a, "WifiUtils --> getLocalIP() --> 获取IP异常 -- it = " + thM112710exceptionOrNullimpl, false, 2, null);
        }
        return (String) obj;
    }

    /* JADX INFO: renamed from: m */
    public final WifiManager m83539m() {
        return (WifiManager) f63990b.getValue();
    }

    /* JADX INFO: renamed from: n */
    public final boolean m83540n() {
        return m83539m().is5GHzBandSupported();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m83541q() {
        return m83539m().isP2pSupported();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m83542r(Context context) {
        Intrinsics.m97802h(context, "context");
        return Build.VERSION.SDK_INT < 29 || context.getApplicationInfo().targetSdkVersion < 29;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m83543s() {
        return Build.VERSION.SDK_INT < 29;
    }

    /* JADX INFO: renamed from: t */
    public final String m83544t(long j11) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append((int) (j11 & 255));
        stringBuffer.append('.');
        stringBuffer.append((int) ((j11 >> 8) & 255));
        stringBuffer.append('.');
        stringBuffer.append((int) ((j11 >> 16) & 255));
        stringBuffer.append('.');
        stringBuffer.append((int) ((j11 >> 24) & 255));
        String string = stringBuffer.toString();
        Intrinsics.m97801g(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: v */
    public final void m83545v(AppCompatActivity appCompatActivity) {
        Object objM112707constructorimpl;
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
            intent.setData(Uri.parse("package:" + (appCompatActivity != null ? appCompatActivity.getPackageName() : null)));
            if (appCompatActivity != null) {
                appCompatActivity.startActivity(intent);
                unit = Unit.f75682a;
            } else {
                unit = null;
            }
            objM112707constructorimpl = Result.m112707constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl == null) {
            return;
        }
        C20136g.m83567d(C20136g.f63999a, f63989a.m83527e() + " --> openManageWriteSetting() --> it = " + thM112710exceptionOrNullimpl, false, 2, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m83546w(AppCompatActivity appCompatActivity) {
        Intent intent = new Intent("android.settings.WIFI_SETTINGS");
        if (appCompatActivity != null) {
            appCompatActivity.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m83547x() {
        Object objM112707constructorimpl;
        NetworkInfo activeNetworkInfo;
        try {
            Result.Companion companion = Result.INSTANCE;
            Object systemService = Utils.m27275a().getApplicationContext().getApplicationContext().getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                WifiUtils wifiUtils = f63989a;
                WifiInfo connectionInfo = wifiUtils.m83539m().getConnectionInfo();
                Intrinsics.m97801g(connectionInfo, "getConnectionInfo(...)");
                String ssid = connectionInfo.getSSID();
                Intrinsics.m97801g(ssid, "getSSID(...)");
                if (wifiUtils.m83528o(ssid)) {
                    wifiUtils.m83539m().removeNetwork(connectionInfo.getNetworkId());
                    C20136g.m83566b(C20136g.f63999a, wifiUtils.m83527e() + " --> removeMbNet() --> success", false, 2, null);
                }
            }
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl == null) {
            return;
        }
        C20136g.m83566b(C20136g.f63999a, f63989a.m83527e() + " --> removeMbNet() --> 异常 it = " + thM112710exceptionOrNullimpl, false, 2, null);
    }
}
