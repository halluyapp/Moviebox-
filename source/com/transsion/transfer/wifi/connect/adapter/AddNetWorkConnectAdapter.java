package com.transsion.transfer.wifi.connect.adapter;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.os.Build;
import android.text.TextUtils;
import com.blankj.utilcode.util.Utils;
import com.transsion.transfer.R$string;
import com.transsion.transfer.wifi.connect.InterfaceC20072b;
import com.transsion.transfer.wifi.util.C20130a;
import com.transsion.transfer.wifi.util.C20132c;
import com.transsion.transfer.wifi.util.C20136g;
import com.transsion.transfer.wifi.util.WifiUtils;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25207u0;
import kotlinx.coroutines.InterfaceC25149n0;
import p754rv.C27385a;

/* JADX INFO: loaded from: classes6.dex */
public final class AddNetWorkConnectAdapter extends BaseWifiConnectAdapter {

    /* JADX INFO: renamed from: f */
    private boolean f63873f;

    /* JADX INFO: renamed from: g */
    private int f63874g;

    /* JADX INFO: renamed from: h */
    private boolean f63875h;

    /* JADX INFO: renamed from: i */
    private Network f63876i;

    /* JADX INFO: renamed from: m */
    private List f63880m;

    /* JADX INFO: renamed from: e */
    private int f63872e = -1;

    /* JADX INFO: renamed from: j */
    private int f63877j = 10;

    /* JADX INFO: renamed from: k */
    private int f63878k = -1;

    /* JADX INFO: renamed from: l */
    private int f63879l = -1;

    /* JADX INFO: renamed from: n */
    private long f63881n = 1000;

    /* JADX INFO: renamed from: o */
    private final Object f63882o = new Object();

    /* JADX INFO: renamed from: p */
    private int f63883p = 5;

    /* JADX INFO: renamed from: q */
    private int f63884q = 15;

    /* JADX INFO: renamed from: m */
    private final int m83306m(int i11, String str, String str2) {
        C20136g.m83566b(C20136g.f63999a, m83322e() + " --> blindConnect() --> Connect Step 4 No Need Scan Result,Force Connect ", false, 2, null);
        if (i11 != -1) {
            return i11;
        }
        String string = Utils.m27275a().getApplicationContext().getString(R$string.wifi_direct_prefix);
        Intrinsics.m97801g(string, "getString(...)");
        if (StringsKt.m98242W(str, string, false, 2, null)) {
            int iM83314v = m83314v(str, str2, "PSK");
            if (iM83314v == -1) {
                iM83314v = m83314v(str, str2, "EAP");
            }
            return iM83314v == -1 ? m83314v(str, str2, "WEP") : iM83314v;
        }
        if (TextUtils.isEmpty(str2)) {
            return m83314v(str, str2, "OPEN");
        }
        int iM83314v2 = m83314v(str, str2, "PSK");
        if (iM83314v2 == -1) {
            iM83314v2 = m83314v(str, str2, "EAP");
        }
        return iM83314v2 == -1 ? m83314v(str, str2, "WEP") : iM83314v2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m83307n(Continuation continuation) throws Throwable {
        AddNetWorkConnectAdapter$connectNetWork$1 addNetWorkConnectAdapter$connectNetWork$1;
        Object objM112707constructorimpl;
        Object objM112707constructorimpl2;
        if (continuation instanceof AddNetWorkConnectAdapter$connectNetWork$1) {
            addNetWorkConnectAdapter$connectNetWork$1 = (AddNetWorkConnectAdapter$connectNetWork$1) continuation;
            int i11 = addNetWorkConnectAdapter$connectNetWork$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                addNetWorkConnectAdapter$connectNetWork$1.label = i11 - Integer.MIN_VALUE;
            } else {
                addNetWorkConnectAdapter$connectNetWork$1 = new AddNetWorkConnectAdapter$connectNetWork$1(this, continuation);
            }
        } else {
            addNetWorkConnectAdapter$connectNetWork$1 = new AddNetWorkConnectAdapter$connectNetWork$1(this, continuation);
        }
        Object obj = addNetWorkConnectAdapter$connectNetWork$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = addNetWorkConnectAdapter$connectNetWork$1.label;
        if (i12 == 0) {
            ResultKt.m97107b(obj);
            addNetWorkConnectAdapter$connectNetWork$1.label = 1;
            if (AbstractC25207u0.m99223a(500L, addNetWorkConnectAdapter$connectNetWork$1) == objF) {
                return objF;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        m83311s();
        try {
            Result.Companion companion = Result.INSTANCE;
            Ref.IntRef intRef = new Ref.IntRef();
            this.f63872e = -1;
            this.f63873f = false;
            C20136g c20136g = C20136g.f63999a;
            String strM83322e = m83322e();
            C27385a c27385aM83326i = m83326i();
            C20136g.m83566b(c20136g, strM83322e + " --> connectNetWork() --> 连接网络 --> Connect Step 1 START_CONNECT --> Target SSID = " + (c27385aM83326i != null ? c27385aM83326i.m106591p() : null), false, 2, null);
            while (true) {
                WifiUtils wifiUtils = WifiUtils.f63989a;
                if (wifiUtils.m83539m().getWifiState() == 3 || intRef.element >= this.f63877j * 2 || this.f63875h) {
                    break;
                }
                try {
                    Result.Companion companion2 = Result.INSTANCE;
                    C20136g.m83566b(C20136g.f63999a, m83322e() + " --> connectNetWork() --> wait wifi open, time = " + intRef.element, false, 2, null);
                    wifiUtils.m83539m().setWifiEnabled(true);
                    Thread.sleep(350L);
                    objM112707constructorimpl2 = Result.m112707constructorimpl(Unit.f75682a);
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM112707constructorimpl2 = Result.m112707constructorimpl(ResultKt.m97106a(th2));
                }
                if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl2) != null) {
                    return Unit.f75682a;
                }
                intRef.element++;
            }
            m83312t();
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th3));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C20136g.m83567d(C20136g.f63999a, m83322e() + " --> connectNetWork() --> it = " + thM112710exceptionOrNullimpl, false, 2, null);
            InterfaceC20072b interfaceC20072bM83325h = m83325h();
            if (interfaceC20072bM83325h != null) {
                interfaceC20072bM83325h.mo83299b(2030);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: o */
    private final int m83308o(String str, String str2, String str3) throws Throwable {
        int i11 = -1;
        try {
            synchronized (this.f63882o) {
                try {
                    WifiUtils wifiUtils = WifiUtils.f63989a;
                    if (wifiUtils.m83536j().equals(str)) {
                        C20136g.m83566b(C20136g.f63999a, "Current MB SSID had Connected. current SSID = " + wifiUtils.m83536j(), false, 2, null);
                        return 0;
                    }
                    this.f63879l = this.f63878k;
                    WifiConfiguration wifiConfiguration = new WifiConfiguration();
                    StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
                    String str4 = String.format("\"%s\"", Arrays.copyOf(new Object[]{str}, 1));
                    Intrinsics.m97801g(str4, "format(...)");
                    wifiConfiguration.SSID = str4;
                    wifiConfiguration.priority = 1000000;
                    C20130a.f63991a.m83553f(wifiConfiguration, str3, str2);
                    int i12 = 0;
                    int iAddNetwork = -1;
                    while (i12 < this.f63883p && !this.f63875h && (iAddNetwork = WifiUtils.f63989a.m83539m().addNetwork(wifiConfiguration)) == -1) {
                        try {
                            i12++;
                            try {
                                Thread.sleep(350L);
                            } catch (InterruptedException e11) {
                                C20136g.m83567d(C20136g.f63999a, m83322e() + " --> connectToWifi() --> addNetwork Interrupt = " + e11, false, 2, null);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    C20136g c20136g = C20136g.f63999a;
                    C20136g.m83569h(c20136g, m83322e() + " --> connectToWifi() --> new network id:" + iAddNetwork, false, 2, null);
                    try {
                        if (iAddNetwork == -1) {
                            C20136g.m83569h(c20136g, m83322e() + " --> connectToWifi() --> add ssid to network failure!", false, 2, null);
                            return iAddNetwork;
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            C20130a.f63991a.m83554g(WifiUtils.f63989a.m83539m(), wifiConfiguration);
                        }
                        WifiUtils wifiUtils2 = WifiUtils.f63989a;
                        if (wifiUtils2.m83539m() != null) {
                            wifiUtils2.m83539m().disconnect();
                        }
                        this.f63878k = iAddNetwork;
                        int i13 = this.f63879l;
                        if (i13 != -1 && i13 != iAddNetwork) {
                            wifiUtils2.m83539m().disableNetwork(this.f63879l);
                        }
                        if (!(wifiUtils2.m83539m() != null ? wifiUtils2.m83539m().enableNetwork(iAddNetwork, true) : false)) {
                            wifiUtils2.m83539m().reassociate();
                        }
                        m83316x();
                        Unit unit = Unit.f75682a;
                        return iAddNetwork;
                    } catch (Exception e12) {
                        e = e12;
                        i11 = iAddNetwork;
                        e.printStackTrace();
                        return i11;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Exception e13) {
            e = e13;
        }
    }

    /* JADX INFO: renamed from: p */
    private final Method m83309p(int i11) {
        Class<?>[] parameterTypes;
        WifiUtils wifiUtils = WifiUtils.f63989a;
        if (wifiUtils.m83539m() == null) {
            return null;
        }
        Iterator itM97771a = ArrayIteratorKt.m97771a(wifiUtils.m83539m().getClass().getDeclaredMethods());
        Method method = null;
        while (itM97771a.hasNext()) {
            Method method2 = (Method) itM97771a.next();
            if (StringsKt.m98227H("connect", method2.getName(), true) && (parameterTypes = method2.getParameterTypes()) != null && parameterTypes.length > 0 && StringsKt.m98227H("int", parameterTypes[0].getName(), true)) {
                method = method2;
            }
        }
        if (method != null) {
            try {
                method.invoke(WifiUtils.f63989a.m83539m(), Integer.valueOf(i11), null);
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
        return method;
    }

    /* JADX INFO: renamed from: q */
    private final void m83310q() {
        String strM106591p;
        boolean zM97797c;
        String strM106590o;
        int i11 = this.f63872e;
        C27385a c27385aM83326i = m83326i();
        String str = "";
        if (c27385aM83326i == null || (strM106591p = c27385aM83326i.m106591p()) == null) {
            strM106591p = "";
        }
        C27385a c27385aM83326i2 = m83326i();
        if (c27385aM83326i2 != null && (strM106590o = c27385aM83326i2.m106590o()) != null) {
            str = strM106590o;
        }
        this.f63872e = m83306m(i11, strM106591p, str);
        C20136g c20136g = C20136g.f63999a;
        C20136g.m83566b(c20136g, m83322e() + " --> doBlindConnect() --> Connect Step 5 No Need Scan Result,Force Connect Result=" + this.f63872e, false, 2, null);
        if (this.f63872e != -1) {
            String strM83536j = WifiUtils.f63989a.m83536j();
            C27385a c27385aM83326i3 = m83326i();
            if (Intrinsics.m97797c(strM83536j, c27385aM83326i3 != null ? c27385aM83326i3.m106591p() : null)) {
                String strM83322e = m83322e();
                C27385a c27385aM83326i4 = m83326i();
                String strM106591p2 = c27385aM83326i4 != null ? c27385aM83326i4.m106591p() : null;
                C20136g.m83566b(c20136g, strM83322e + " --> doBlindConnect() --> Connect Step 6.0 connected wifi = " + strM106591p2 + " -- netId = " + this.f63872e + "  --  isOkRetryConnect:", false, 2, null);
            } else {
                try {
                    Thread.sleep(350L);
                    String strM83322e2 = m83322e();
                    C27385a c27385aM83326i5 = m83326i();
                    String strM106591p3 = c27385aM83326i5 != null ? c27385aM83326i5.m106591p() : null;
                    C20136g.m83566b(c20136g, strM83322e2 + " --> doBlindConnect() --> Connect Step 6.1 didn't connect wifi，reEnableNetWork ssid: " + strM106591p3 + " -- netId = " + this.f63872e + " ", false, 2, null);
                    m83315w(this.f63872e);
                } catch (InterruptedException e11) {
                    e11.printStackTrace();
                    return;
                }
            }
        } else {
            this.f63880m = null;
        }
        NetworkInfo.DetailedState detailedStateM83319r = m83319r();
        boolean z11 = detailedStateM83319r == null || detailedStateM83319r == NetworkInfo.DetailedState.CONNECTING || detailedStateM83319r == NetworkInfo.DetailedState.AUTHENTICATING;
        for (int i12 = 0; z11 && i12 < this.f63884q && !this.f63875h; i12++) {
            try {
                Thread.sleep(350L);
                NetworkInfo.DetailedState detailedStateM83319r2 = m83319r();
                if (detailedStateM83319r2 != null) {
                    z11 = detailedStateM83319r2 == NetworkInfo.DetailedState.CONNECTING || detailedStateM83319r2 == NetworkInfo.DetailedState.AUTHENTICATING;
                }
            } catch (InterruptedException e12) {
                e12.printStackTrace();
            }
        }
        WifiUtils wifiUtils = WifiUtils.f63989a;
        String strM83536j2 = wifiUtils.m83536j();
        if (TextUtils.isEmpty(strM83536j2)) {
            zM97797c = false;
        } else {
            C27385a c27385aM83326i6 = m83326i();
            zM97797c = Intrinsics.m97797c(strM83536j2, c27385aM83326i6 != null ? c27385aM83326i6.m106591p() : null);
        }
        if (zM97797c) {
            if (this.f63872e != -1) {
                C20136g.m83566b(C20136g.f63999a, m83322e() + " --> doBlindConnect() --> Connect Step 9 addNetSucceed", false, 2, null);
                InterfaceC20072b interfaceC20072bM83325h = m83325h();
                if (interfaceC20072bM83325h != null) {
                    interfaceC20072bM83325h.mo83301d(this.f63872e);
                    return;
                }
                return;
            }
            C20136g.m83566b(C20136g.f63999a, m83322e() + " --> doBlindConnect() --> Connect Step 9 SHOW_RETRY", false, 2, null);
            InterfaceC20072b interfaceC20072bM83325h2 = m83325h();
            if (interfaceC20072bM83325h2 != null) {
                interfaceC20072bM83325h2.mo83299b(2033);
                return;
            }
            return;
        }
        C20136g c20136g2 = C20136g.f63999a;
        C20136g.m83566b(c20136g2, m83322e() + " --> doBlindConnect() --> Connect Step 9.1 blindConnectCounts：" + this.f63874g, false, 2, null);
        if (this.f63874g >= this.f63883p) {
            C20136g.m83567d(c20136g2, m83322e() + " --> doBlindConnect() --> Connect Step 9.1 SHOW_RETRY", false, 2, null);
            InterfaceC20072b interfaceC20072bM83325h3 = m83325h();
            if (interfaceC20072bM83325h3 != null) {
                interfaceC20072bM83325h3.mo83299b(2033);
                return;
            }
            return;
        }
        wifiUtils.m83539m().startScan();
        try {
            Thread.sleep(this.f63881n);
        } catch (InterruptedException e13) {
            C20136g.m83566b(C20136g.f63999a, m83322e() + " --> doBlindConnect() --> blindConnectCounts InterruptedException: " + e13, false, 2, null);
        }
        this.f63872e = -1;
        this.f63873f = false;
        this.f63874g++;
        m83312t();
    }

    /* JADX INFO: renamed from: s */
    private final void m83311s() {
        C20132c c20132c = C20132c.f63993a;
        if (c20132c.m83560e()) {
            Context applicationContext = Utils.m27275a().getApplicationContext();
            Intrinsics.m97801g(applicationContext, "getApplicationContext(...)");
            if (c20132c.m83559d(applicationContext) < 2097152) {
                C20136g.m83566b(C20136g.f63999a, m83322e() + " --> initParameter() --> Transsion Phone lowMemLimit", false, 2, null);
                this.f63881n = 1500L;
                this.f63884q = 30;
                this.f63877j = 20;
                this.f63883p = 8;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    private final void m83312t() {
        Object objM112707constructorimpl;
        C20136g c20136g = C20136g.f63999a;
        String strM83322e = m83322e();
        C27385a c27385aM83326i = m83326i();
        C20136g.m83566b(c20136g, strM83322e + " --> processWifiConnect() --> Connect Step 2 CONNECTION_INITIALIZED --> ssid = " + (c27385aM83326i != null ? c27385aM83326i.m106591p() : null) + " --> startScan()", false, 2, null);
        WifiUtils wifiUtils = WifiUtils.f63989a;
        wifiUtils.m83539m().startScan();
        int networkId = wifiUtils.m83539m().getConnectionInfo().getNetworkId();
        List<WifiConfiguration> configuredNetworks = wifiUtils.m83539m().getConfiguredNetworks();
        Intrinsics.m97801g(configuredNetworks, "getConfiguredNetworks(...)");
        C20136g.m83566b(c20136g, m83322e() + " --> processWifiConnect() --> Connect Step 2.1  --> currentConnectId = " + networkId + " --> existingConfigs.size = " + configuredNetworks.size(), false, 2, null);
        for (WifiConfiguration wifiConfiguration : configuredNetworks) {
            String SSID = wifiConfiguration.SSID;
            Intrinsics.m97801g(SSID, "SSID");
            String strQ = StringsKt.m98236Q(SSID, "\"", "", false, 4, null);
            String str = wifiConfiguration.preSharedKey;
            if (!TextUtils.isEmpty(strQ)) {
                C27385a c27385aM83326i2 = m83326i();
                if (StringsKt.m98228I(c27385aM83326i2 != null ? c27385aM83326i2.m106591p() : null, strQ, false, 2, null)) {
                    this.f63872e = wifiConfiguration.networkId;
                    C20136g c20136g2 = C20136g.f63999a;
                    C20136g.m83566b(c20136g2, m83322e() + " --> processWifiConnect() --> Connect Step 2.2  currentConnectId = " + networkId + " -- netId = " + this.f63872e + " -- pwd = " + str, false, 2, null);
                    String string = Utils.m27275a().getApplicationContext().getString(R$string.wifi_direct_prefix);
                    Intrinsics.m97801g(string, "getString(...)");
                    if (!StringsKt.m98242W(strQ, string, false, 2, null) || !TextUtils.isEmpty(str)) {
                        C20136g.m83566b(c20136g2, m83322e() + " --> processWifiConnect() --> Connect Step 2.4  reEnableNetWork WifiConfiguration SSID = " + strQ + ", netId = " + this.f63872e, false, 2, null);
                        this.f63879l = networkId;
                        WifiUtils.f63989a.m83539m().disconnect();
                        m83315w(this.f63872e);
                        this.f63873f = true;
                        break;
                    }
                    C20136g.m83566b(c20136g2, m83322e() + " --> processWifiConnect() --> Connect Step 2.3  error pwd type save WifiConfiguration SSID = " + strQ + ", netId = " + this.f63872e, false, 2, null);
                    this.f63872e = -1;
                    this.f63873f = false;
                    break;
                }
            }
        }
        C20136g.m83566b(C20136g.f63999a, m83322e() + " --> processWifiConnect() --> Connect Step 2.4-1  列表遍历结束 --> netId = " + this.f63872e + " -- findOldConfig = " + this.f63873f, false, 2, null);
        if (!this.f63873f) {
            int i11 = this.f63877j;
            for (int i12 = 0; i12 < i11; i12++) {
                List<ScanResult> scanResults = WifiUtils.f63989a.m83539m().getScanResults();
                this.f63880m = scanResults;
                if (scanResults != null) {
                    C20136g c20136g3 = C20136g.f63999a;
                    String strM83322e2 = m83322e();
                    List list = this.f63880m;
                    C20136g.m83566b(c20136g3, strM83322e2 + " --> processWifiConnect() --> Connect Step 2.5  Start WifiScan Retry counts:+ i +, ScanResultList Size: " + (list != null ? Integer.valueOf(list.size()) : null), false, 2, null);
                    for (ScanResult scanResult : scanResults) {
                        C27385a c27385aM83326i3 = m83326i();
                        if (StringsKt.m98228I(c27385aM83326i3 != null ? c27385aM83326i3.m106591p() : null, scanResult.SSID, false, 2, null)) {
                            C20136g c20136g4 = C20136g.f63999a;
                            C20136g.m83566b(c20136g4, m83322e() + " --> processWifiConnect() --> Connect Step 3 Find XShare HotSpot , Start Connect to Target WIFI , SSID = " + scanResult.SSID + " +  capabilities =  " + scanResult.capabilities, false, 2, null);
                            C27385a c27385aM83326i4 = m83326i();
                            String strM106591p = c27385aM83326i4 != null ? c27385aM83326i4.m106591p() : null;
                            C27385a c27385aM83326i5 = m83326i();
                            this.f63872e = m83308o(strM106591p, c27385aM83326i5 != null ? c27385aM83326i5.m106590o() : null, scanResult.capabilities);
                            C20136g.m83567d(c20136g4, m83322e() + " --> processWifiConnect() --> Connect Step 3.1 Connect to Target WIFI Finished -- netId = " + this.f63872e, false, 2, null);
                            if (this.f63872e != -1) {
                                break;
                            }
                        }
                    }
                }
                if (this.f63872e != -1) {
                    break;
                }
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Thread.sleep(this.f63881n);
                    if (i12 % 3 == 0) {
                        WifiUtils.f63989a.m83539m().startScan();
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
                }
                Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                if (thM112710exceptionOrNullimpl != null) {
                    C20136g.m83567d(C20136g.f63999a, m83322e() + " --> processWifiConnect() --> CONFIGURED_WIFI InterruptedException --> it = " + thM112710exceptionOrNullimpl, false, 2, null);
                    InterfaceC20072b interfaceC20072bM83325h = m83325h();
                    if (interfaceC20072bM83325h != null) {
                        interfaceC20072bM83325h.mo83299b(2031);
                        return;
                    }
                    return;
                }
            }
        }
        m83313u();
    }

    /* JADX INFO: renamed from: u */
    private final void m83313u() {
        boolean zM97797c;
        C20136g.m83566b(C20136g.f63999a, m83322e() + " --> processWifiScanResult() --> Connect Step 4 processWifiScanResult findOldConfig = " + this.f63873f, false, 2, null);
        if (!this.f63873f) {
            m83310q();
            return;
        }
        NetworkInfo.DetailedState detailedStateM83319r = m83319r();
        boolean z11 = detailedStateM83319r == null || detailedStateM83319r == NetworkInfo.DetailedState.CONNECTING || detailedStateM83319r == NetworkInfo.DetailedState.AUTHENTICATING;
        for (int i11 = 0; z11 && i11 < this.f63884q && !this.f63875h; i11++) {
            try {
                Thread.sleep(350L);
                NetworkInfo.DetailedState detailedStateM83319r2 = m83319r();
                if (detailedStateM83319r2 != null) {
                    z11 = detailedStateM83319r2 == NetworkInfo.DetailedState.CONNECTING || detailedStateM83319r2 == NetworkInfo.DetailedState.AUTHENTICATING;
                }
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }
        WifiUtils wifiUtils = WifiUtils.f63989a;
        String strM83536j = wifiUtils.m83536j();
        if (TextUtils.isEmpty(strM83536j)) {
            zM97797c = false;
        } else {
            C27385a c27385aM83326i = m83326i();
            zM97797c = Intrinsics.m97797c(strM83536j, c27385aM83326i != null ? c27385aM83326i.m106591p() : null);
        }
        if (zM97797c) {
            if (this.f63872e != -1) {
                C20136g.m83566b(C20136g.f63999a, m83322e() + " --> processWifiScanResult() --> Connect Step 7 addNetSucceed", false, 2, null);
                InterfaceC20072b interfaceC20072bM83325h = m83325h();
                if (interfaceC20072bM83325h != null) {
                    interfaceC20072bM83325h.mo83301d(this.f63872e);
                    return;
                }
                return;
            }
            C20136g.m83566b(C20136g.f63999a, m83322e() + " --> processWifiScanResult() --> Connect Step 7 SHOW_RETRY", false, 2, null);
            InterfaceC20072b interfaceC20072bM83325h2 = m83325h();
            if (interfaceC20072bM83325h2 != null) {
                interfaceC20072bM83325h2.mo83299b(2032);
                return;
            }
            return;
        }
        C20136g c20136g = C20136g.f63999a;
        C20136g.m83566b(c20136g, m83322e() + " --> processWifiScanResult() --> Connect Step 7.1 blindConnectCounts = " + this.f63874g, false, 2, null);
        if (this.f63874g >= this.f63883p) {
            C20136g.m83567d(c20136g, m83322e() + " --> processWifiScanResult() --> Connect Step 7.1 SHOW_RETRY", false, 2, null);
            InterfaceC20072b interfaceC20072bM83325h3 = m83325h();
            if (interfaceC20072bM83325h3 != null) {
                interfaceC20072bM83325h3.mo83299b(2032);
                return;
            }
            return;
        }
        wifiUtils.m83539m().startScan();
        try {
            Thread.sleep(this.f63881n);
        } catch (InterruptedException e12) {
            C20136g.m83567d(C20136g.f63999a, m83322e() + " --> processWifiScanResult() --> blindConnectCounts InterruptedException: " + e12, false, 2, null);
        }
        this.f63872e = -1;
        this.f63873f = false;
        this.f63874g++;
        m83310q();
    }

    /* JADX INFO: renamed from: v */
    private final int m83314v(String str, String str2, String str3) {
        try {
            C20136g.m83566b(C20136g.f63999a, m83322e() + " --> reConnect() --> ssid:" + str + ", pass:" + str2 + ", type:" + str3, false, 2, null);
            Thread.sleep(300L);
            return m83308o(str, str2, str3);
        } catch (InterruptedException e11) {
            C20136g.m83567d(C20136g.f63999a, m83322e() + " --> reConnect() --> reConnect InterruptedException: " + e11, false, 2, null);
            return -1;
        }
    }

    /* JADX INFO: renamed from: w */
    private final void m83315w(int i11) {
        try {
            this.f63878k = i11;
            m83327j("reEnableNetWork() --> set network id = " + i11);
            int i12 = this.f63879l;
            if (i12 != -1 && i12 != this.f63878k) {
                WifiUtils.f63989a.m83539m().disableNetwork(this.f63879l);
            }
            boolean zEnableNetwork = (Build.VERSION.SDK_INT > 23 || m83309p(i11) == null) ? WifiUtils.f63989a.m83539m().enableNetwork(i11, true) : false;
            if (!zEnableNetwork) {
                WifiUtils.f63989a.m83539m().reassociate();
            }
            m83316x();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: x */
    private final void m83316x() {
        synchronized (this.f63882o) {
            m83327j("removeOldNetwork() --> removeOldNetwork mLastNetworkId = " + this.f63879l + " --> mCurrentNetworkId = " + this.f63878k);
            int i11 = this.f63879l;
            if (i11 != -1 && i11 != this.f63878k) {
                m83327j("removeOldNetwork() --> remove network id:" + i11);
                boolean zRemoveNetwork = false;
                for (int i12 = 0; i12 < 10 && !zRemoveNetwork; i12++) {
                    try {
                        zRemoveNetwork = WifiUtils.f63989a.m83539m().removeNetwork(this.f63879l);
                        m83327j("removeOldNetwork() --> removeNetwork Result = " + zRemoveNetwork);
                    } catch (Exception unused) {
                    }
                }
                WifiUtils.f63989a.m83539m().saveConfiguration();
            }
            Unit unit = Unit.f75682a;
        }
    }

    @Override // com.transsion.transfer.wifi.connect.adapter.BaseWifiConnectAdapter
    /* JADX INFO: renamed from: c */
    public void mo83317c() {
        Object objM112707constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (this.f63876i != null) {
                this.f63876i = null;
            }
            Object systemService = Utils.m27275a().getApplicationContext().getSystemService("connectivity");
            Intrinsics.m97800f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ((ConnectivityManager) systemService).bindProcessToNetwork(null);
            C20136g.m83566b(C20136g.f63999a, m83322e() + " --> releaseDefaultNetwork() --> end", false, 2, null);
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl == null) {
            return;
        }
        C20136g.m83567d(C20136g.f63999a, m83322e() + " --> releaseDefaultNetwork() --> it = " + thM112710exceptionOrNullimpl, false, 2, null);
    }

    @Override // com.transsion.transfer.wifi.connect.adapter.BaseWifiConnectAdapter
    /* JADX INFO: renamed from: d */
    public void mo83318d() {
        this.f63874g = 0;
        this.f63875h = false;
        C20136g.m83566b(C20136g.f63999a, m83322e() + " --> connect() --> 系统级接入方开始添加网络 = " + m83326i(), false, 2, null);
        InterfaceC25149n0 interfaceC25149n0M83324g = m83324g();
        if (interfaceC25149n0M83324g != null) {
            AbstractC25136k.m99058d(interfaceC25149n0M83324g, null, null, new AddNetWorkConnectAdapter$doConnect$1(this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: r */
    public final NetworkInfo.DetailedState m83319r() {
        Object systemService = Utils.m27275a().getApplicationContext().getSystemService("connectivity");
        Intrinsics.m97800f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.getDetailedState();
        }
        return null;
    }
}
