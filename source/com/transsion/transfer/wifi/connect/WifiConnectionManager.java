package com.transsion.transfer.wifi.connect;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.transsion.transfer.R$string;
import com.transsion.transfer.wifi.connect.adapter.AddNetWorkConnectAdapter;
import com.transsion.transfer.wifi.connect.adapter.BaseWifiConnectAdapter;
import com.transsion.transfer.wifi.connect.adapter.DirectConnectAdapter;
import com.transsion.transfer.wifi.connect.adapter.WifiNetworkSpecifierAdapter;
import com.transsion.transfer.wifi.util.C20135f;
import com.transsion.transfer.wifi.util.C20136g;
import com.transsion.transfer.wifi.util.WifiUtils;
import java.net.InetAddress;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p721qv.C27132c;
import p754rv.C27385a;

/* JADX INFO: loaded from: classes6.dex */
public final class WifiConnectionManager implements InterfaceC20072b {

    /* JADX INFO: renamed from: a */
    public static final WifiConnectionManager f63861a = new WifiConnectionManager();

    /* JADX INFO: renamed from: b */
    private static AppCompatActivity f63862b;

    /* JADX INFO: renamed from: c */
    private static InterfaceC25149n0 f63863c;

    /* JADX INFO: renamed from: d */
    private static C27385a f63864d;

    /* JADX INFO: renamed from: e */
    private static InterfaceC20072b f63865e;

    /* JADX INFO: renamed from: f */
    private static DirectConnectAdapter f63866f;

    /* JADX INFO: renamed from: g */
    private static WifiNetworkSpecifierAdapter f63867g;

    /* JADX INFO: renamed from: h */
    private static AddNetWorkConnectAdapter f63868h;

    /* JADX INFO: renamed from: i */
    private static long f63869i;

    /* JADX INFO: renamed from: j */
    private static volatile boolean f63870j;

    private WifiConnectionManager() {
    }

    /* JADX INFO: renamed from: m */
    private final void m83289m() {
        C20136g.m83566b(C20136g.f63999a, m83290o() + " --> connect() --> SDK_INT或targetSdkVersion版本 < (Q = 29) Android 10", false, 2, null);
        if (f63868h == null) {
            f63868h = new AddNetWorkConnectAdapter();
        }
        AddNetWorkConnectAdapter addNetWorkConnectAdapter = f63868h;
        if (addNetWorkConnectAdapter != null) {
            BaseWifiConnectAdapter.m83320b(addNetWorkConnectAdapter, null, f63864d, f63863c, this, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final String m83290o() {
        String simpleName = WifiConnectionManager.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final Object m83291p(Continuation continuation) {
        return AbstractC25088i.m98910g(C25220y0.m99268b(), new WifiConnectionManager$getCorrectAddNetAddress$2(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX INFO: renamed from: q */
    public final void m83292q() {
        boolean z11;
        String strM106591p;
        C20136g c20136g = C20136g.f63999a;
        C20136g.m83566b(c20136g, m83290o() + " --> innerConnect() --> 建立 Wi-Fi 连接 --> start ....", false, 2, null);
        C27385a c27385a = f63864d;
        if (c27385a != null && (strM106591p = c27385a.m106591p()) != null) {
            z11 = StringsKt.m98242W(strM106591p, "DIRECT-", false, 2, null) && WifiUtils.f63989a.m83541q();
        }
        C27385a c27385a2 = f63864d;
        if (TextUtils.isEmpty(c27385a2 != null ? c27385a2.m106591p() : null)) {
            C20136g.m83567d(c20136g, m83290o() + " --> innerConnect() --> wifiInfoModel.wifiSsid is empty --> return", false, 2, null);
            mo83299b(2000);
            return;
        }
        WifiUtils wifiUtils = WifiUtils.f63989a;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        boolean zM83542r = wifiUtils.m83542r(applicationM27275a);
        if (z11 && !zM83542r) {
            m83293r();
        } else if (zM83542r) {
            m83289m();
        } else {
            m83297w();
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m83293r() {
        C20136g.m83566b(C20136g.f63999a, m83290o() + " --> connect() --> 支持(Wi-Fi P2P) 且SDK_INT或targetSdkVersion版本 >= (Q = 29) -- Android 10", false, 2, null);
        Object systemService = Utils.m27275a().getApplicationContext().getSystemService("connectivity");
        Intrinsics.m97800f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager) systemService).bindProcessToNetwork(null);
        if (f63866f == null) {
            f63866f = new DirectConnectAdapter();
        }
        DirectConnectAdapter directConnectAdapter = f63866f;
        if (directConnectAdapter != null) {
            BaseWifiConnectAdapter.m83320b(directConnectAdapter, null, f63864d, f63863c, this, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final void m83294t() {
        C20135f.f63996a.m83565c();
        WifiUtils.f63989a.m83547x();
        DirectConnectAdapter directConnectAdapter = f63866f;
        if (directConnectAdapter != null) {
            directConnectAdapter.m83328k();
        }
        f63866f = null;
        AddNetWorkConnectAdapter addNetWorkConnectAdapter = f63868h;
        if (addNetWorkConnectAdapter != null) {
            addNetWorkConnectAdapter.m83328k();
        }
        f63868h = null;
        WifiNetworkSpecifierAdapter wifiNetworkSpecifierAdapter = f63867g;
        if (wifiNetworkSpecifierAdapter != null) {
            wifiNetworkSpecifierAdapter.m83328k();
        }
        f63867g = null;
    }

    /* JADX INFO: renamed from: u */
    private final void m83295u(int i11) {
        C20136g.m83566b(C20136g.f63999a, m83290o() + " --> resolveIP(netId: Int) --> 成功建立连接 --> 开始解析IP地址 -- netId = " + i11, false, 2, null);
        InterfaceC25149n0 interfaceC25149n0 = f63863c;
        if (interfaceC25149n0 != null) {
            AbstractC25136k.m99058d(interfaceC25149n0, C25220y0.m99269c(), null, new WifiConnectionManager$resolveIP$2(null), 2, null);
        }
    }

    /* JADX INFO: renamed from: v */
    private final void m83296v(InetAddress inetAddress) {
        String hostAddress;
        C20136g c20136g = C20136g.f63999a;
        C20136g.m83566b(c20136g, m83290o() + " --> resolveIP(address: InetAddress?) --> 成功建立连接 --> 开始解析IP地址", false, 2, null);
        if (TextUtils.isEmpty(inetAddress != null ? inetAddress.getHostAddress() : null)) {
            InterfaceC25149n0 interfaceC25149n0 = f63863c;
            if (interfaceC25149n0 != null) {
                AbstractC25136k.m99058d(interfaceC25149n0, C25220y0.m99269c(), null, new WifiConnectionManager$resolveIP$1(null), 2, null);
                return;
            }
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - f63869i;
        C20136g.m83566b(c20136g, m83290o() + " --> resolveIP(address: InetAddress?) --> 非系统级应用P2P连接成功耗时 = " + jCurrentTimeMillis + " -- ip = " + (inetAddress != null ? inetAddress.getHostAddress() : null), false, 2, null);
        if (inetAddress == null || (hostAddress = inetAddress.getHostAddress()) == null) {
            hostAddress = "";
        }
        mo83302e(hostAddress);
    }

    /* JADX INFO: renamed from: w */
    private final void m83297w() {
        if (Build.VERSION.SDK_INT >= 29) {
            C20136g.m83566b(C20136g.f63999a, m83290o() + " --> connect() --> 不支持(Wi-Fi P2P) 且SDK_INT或targetSdkVersion版本 >= (Q = 29) -- Android 10", false, 2, null);
            if (f63867g == null) {
                f63867g = new WifiNetworkSpecifierAdapter();
            }
            WifiNetworkSpecifierAdapter wifiNetworkSpecifierAdapter = f63867g;
            if (wifiNetworkSpecifierAdapter != null) {
                wifiNetworkSpecifierAdapter.m83321a(f63862b, f63864d, f63863c, this);
            }
        }
    }

    @Override // com.transsion.transfer.wifi.connect.InterfaceC20072b
    /* JADX INFO: renamed from: a */
    public void mo83298a(Network network) {
        InterfaceC20072b.a.m83363b(this, network);
    }

    @Override // com.transsion.transfer.wifi.connect.InterfaceC20072b
    /* JADX INFO: renamed from: b */
    public void mo83299b(int i11) {
        C20136g.m83567d(C20136g.f63999a, m83290o() + " --> onFail() --> code = " + i11, false, 2, null);
        if (i11 == 2001 || i11 == 2012) {
            C27132c.f82242a.m105582d();
        } else {
            C27132c.f82242a.m105583e(i11);
        }
        InterfaceC25149n0 interfaceC25149n0 = f63863c;
        if (interfaceC25149n0 != null) {
            AbstractC25136k.m99058d(interfaceC25149n0, null, null, new WifiConnectionManager$onFail$1(i11, null), 3, null);
        }
    }

    @Override // com.transsion.transfer.wifi.connect.InterfaceC20072b
    /* JADX INFO: renamed from: c */
    public void mo83300c(InetAddress inetAddress) {
        m83296v(inetAddress);
    }

    @Override // com.transsion.transfer.wifi.connect.InterfaceC20072b
    /* JADX INFO: renamed from: d */
    public void mo83301d(int i11) {
        m83295u(i11);
    }

    @Override // com.transsion.transfer.wifi.connect.InterfaceC20072b
    /* JADX INFO: renamed from: e */
    public void mo83302e(String ip2) {
        Intrinsics.m97802h(ip2, "ip");
        InterfaceC20072b.a.m83364c(this, ip2);
        C27132c.f82242a.m105584f(System.currentTimeMillis() - f63869i);
        f63870j = false;
        InterfaceC20072b interfaceC20072b = f63865e;
        if (interfaceC20072b != null) {
            interfaceC20072b.mo83302e(ip2);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m83303n(AppCompatActivity appCompatActivity, C27385a c27385a, InterfaceC25149n0 interfaceC25149n0, InterfaceC20072b interfaceC20072b) {
        if (f63870j) {
            ToastUtils.m27258s(Utils.m27275a().getResources().getString(R$string.transfer_wifi_connect_error_tip), new Object[0]);
            C20136g.m83566b(C20136g.f63999a, m83290o() + " --> connectWifi() --> 已经有一个任务在连接了，请稍后", false, 2, null);
            return;
        }
        f63870j = true;
        f63869i = System.currentTimeMillis();
        f63863c = interfaceC25149n0;
        f63864d = c27385a;
        f63862b = appCompatActivity;
        f63865e = interfaceC20072b;
        onStart();
        InterfaceC25149n0 interfaceC25149n1 = f63863c;
        if (interfaceC25149n1 != null) {
            AbstractC25136k.m99058d(interfaceC25149n1, null, null, new WifiConnectionManager$connect$1(null), 3, null);
        }
    }

    @Override // com.transsion.transfer.wifi.connect.InterfaceC20072b
    public void onStart() {
        C27132c.f82242a.m105585g();
        InterfaceC20072b interfaceC20072b = f63865e;
        if (interfaceC20072b != null) {
            interfaceC20072b.onStart();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m83304s() {
        Object objM112707constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            C20136g c20136g = C20136g.f63999a;
            WifiConnectionManager wifiConnectionManager = f63861a;
            C20136g.m83569h(c20136g, wifiConnectionManager.m83290o() + " --> release() --> 接收端开始释放资源", false, 2, null);
            f63865e = null;
            f63863c = null;
            f63870j = false;
            f63869i = 0L;
            wifiConnectionManager.m83294t();
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl == null) {
            return;
        }
        C20136g.m83567d(C20136g.f63999a, f63861a.m83290o() + " --> release() --> it = " + thM112710exceptionOrNullimpl, false, 2, null);
    }
}
