package com.transsion.transfer.wifi.connect.adapter;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.wifi.WifiNetworkSpecifier;
import android.text.TextUtils;
import androidx.p1004lifecycle.AbstractC3192e;
import androidx.p1004lifecycle.InterfaceC3194f;
import androidx.p1004lifecycle.InterfaceC3224u;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.integration.bridge.AbstractC8517w;
import com.cloud.tmc.integration.bridge.AbstractC8519y;
import com.transsion.transfer.wifi.connect.InterfaceC20072b;
import com.transsion.transfer.wifi.util.C20136g;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.InterfaceC25149n0;
import p754rv.C27385a;

/* JADX INFO: loaded from: classes6.dex */
public final class WifiNetworkSpecifierAdapter extends BaseWifiConnectAdapter {

    /* JADX INFO: renamed from: g */
    private boolean f63904g;

    /* JADX INFO: renamed from: e */
    private final Lazy f63902e = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.wifi.connect.adapter.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WifiNetworkSpecifierAdapter.m83361r();
        }
    });

    /* JADX INFO: renamed from: f */
    private ConnectivityManager.NetworkCallback f63903f = new C20063a();

    /* JADX INFO: renamed from: h */
    private final C20064b f63905h = new C20064b();

    /* JADX INFO: renamed from: com.transsion.transfer.wifi.connect.adapter.WifiNetworkSpecifierAdapter$a */
    public static final class C20063a extends ConnectivityManager.NetworkCallback {
        C20063a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Object objM112707constructorimpl;
            Unit unit;
            Intrinsics.m97802h(network, "network");
            super.onAvailable(network);
            C20136g.m83566b(C20136g.f63999a, WifiNetworkSpecifierAdapter.this.m83322e() + " --> connect() --> onAvailable() --> WifiNetworkSpecifier connect success", false, 2, null);
            WifiNetworkSpecifierAdapter wifiNetworkSpecifierAdapter = WifiNetworkSpecifierAdapter.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                wifiNetworkSpecifierAdapter.m83360q().bindProcessToNetwork(network);
                InterfaceC20072b interfaceC20072bM83325h = wifiNetworkSpecifierAdapter.m83325h();
                if (interfaceC20072bM83325h != null) {
                    interfaceC20072bM83325h.mo83300c(null);
                    unit = Unit.f75682a;
                } else {
                    unit = null;
                }
                objM112707constructorimpl = Result.m112707constructorimpl(unit);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            WifiNetworkSpecifierAdapter wifiNetworkSpecifierAdapter2 = WifiNetworkSpecifierAdapter.this;
            Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
            if (thM112710exceptionOrNullimpl == null) {
                return;
            }
            C20136g.m83567d(C20136g.f63999a, wifiNetworkSpecifierAdapter2.m83322e() + " --> connect() --> onAvailable() --> it = " + thM112710exceptionOrNullimpl, false, 2, null);
            InterfaceC20072b interfaceC20072bM83325h2 = wifiNetworkSpecifierAdapter2.m83325h();
            if (interfaceC20072bM83325h2 != null) {
                interfaceC20072bM83325h2.mo83299b(Sdk$SDKMetric.SDKMetricType.AD_WILL_CLOSE_VALUE);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Object objM112707constructorimpl;
            Intrinsics.m97802h(network, "network");
            super.onLost(network);
            WifiNetworkSpecifierAdapter wifiNetworkSpecifierAdapter = WifiNetworkSpecifierAdapter.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                wifiNetworkSpecifierAdapter.m83360q().bindProcessToNetwork(null);
                C20136g.m83566b(C20136g.f63999a, wifiNetworkSpecifierAdapter.m83322e() + " --> connect() --> onLost() --> bindProcessToNetwork(null) --> success", false, 2, null);
                objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            WifiNetworkSpecifierAdapter wifiNetworkSpecifierAdapter2 = WifiNetworkSpecifierAdapter.this;
            Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
            if (thM112710exceptionOrNullimpl != null) {
                C20136g.m83566b(C20136g.f63999a, wifiNetworkSpecifierAdapter2.m83322e() + " --> connect() --> onLost() --> bindProcessToNetwork() --> 发生异常 --> it = " + thM112710exceptionOrNullimpl, false, 2, null);
            }
            InterfaceC20072b interfaceC20072bM83325h = WifiNetworkSpecifierAdapter.this.m83325h();
            if (interfaceC20072bM83325h != null) {
                interfaceC20072bM83325h.mo83298a(network);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            C20136g.m83566b(C20136g.f63999a, WifiNetworkSpecifierAdapter.this.m83322e() + " --> connect() --> onUnavailable() --> 如果在指定的超时时间内没有找到网络，则调用,用户主动取消也调用这个。", false, 2, null);
            InterfaceC20072b interfaceC20072bM83325h = WifiNetworkSpecifierAdapter.this.m83325h();
            if (interfaceC20072bM83325h != null) {
                interfaceC20072bM83325h.mo83299b(Sdk$SDKMetric.SDKMetricType.APP_TERM_DURING_AD_BEFORE_IMPRESSION_VALUE);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.wifi.connect.adapter.WifiNetworkSpecifierAdapter$b */
    public static final class C20064b implements InterfaceC3194f {
        C20064b() {
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public /* synthetic */ void onCreate(InterfaceC3224u interfaceC3224u) {
            AbstractC3192e.m14896a(this, interfaceC3224u);
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public /* synthetic */ void onDestroy(InterfaceC3224u interfaceC3224u) {
            AbstractC3192e.m14897b(this, interfaceC3224u);
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public /* synthetic */ void onPause(InterfaceC3224u interfaceC3224u) {
            AbstractC3192e.m14898c(this, interfaceC3224u);
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public void onResume(InterfaceC3224u owner) {
            InterfaceC20072b interfaceC20072bM83325h;
            Intrinsics.m97802h(owner, "owner");
            AbstractC3192e.m14899d(this, owner);
            if (!WifiNetworkSpecifierAdapter.this.f63904g || (interfaceC20072bM83325h = WifiNetworkSpecifierAdapter.this.m83325h()) == null) {
                return;
            }
            interfaceC20072bM83325h.mo83299b(2012);
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public /* synthetic */ void onStart(InterfaceC3224u interfaceC3224u) {
            AbstractC3192e.m14900e(this, interfaceC3224u);
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public void onStop(InterfaceC3224u owner) {
            Intrinsics.m97802h(owner, "owner");
            AbstractC3192e.m14901f(this, owner);
            WifiNetworkSpecifierAdapter.this.f63904g = true;
            C20136g.m83569h(C20136g.f63999a, WifiNetworkSpecifierAdapter.this.m83322e() + " --> observer --> onStop() -- isStop = " + WifiNetworkSpecifierAdapter.this.f63904g, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final ConnectivityManager m83360q() {
        return (ConnectivityManager) this.f63902e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final ConnectivityManager m83361r() {
        Object systemService = Utils.m27275a().getSystemService("connectivity");
        Intrinsics.m97800f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }

    @Override // com.transsion.transfer.wifi.connect.adapter.BaseWifiConnectAdapter
    /* JADX INFO: renamed from: c */
    public void mo83317c() {
        Object objM112707constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            InterfaceC25149n0 interfaceC25149n0M83324g = m83324g();
            if (interfaceC25149n0M83324g != null) {
                AbstractC25136k.m99058d(interfaceC25149n0M83324g, null, null, new WifiNetworkSpecifierAdapter$doClose$1$1(this, null), 3, null);
            }
            m83360q().unregisterNetworkCallback(this.f63903f);
            m83360q().bindProcessToNetwork(null);
            C20136g.m83569h(C20136g.f63999a, m83322e() + " --> close() --> end", false, 2, null);
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl == null) {
            return;
        }
        C20136g.m83567d(C20136g.f63999a, m83322e() + " --> close() --> 发生异常 --> it = " + thM112710exceptionOrNullimpl, false, 2, null);
    }

    @Override // com.transsion.transfer.wifi.connect.adapter.BaseWifiConnectAdapter
    /* JADX INFO: renamed from: d */
    public void mo83318d() {
        String strM106591p;
        String strM106590o;
        C20136g.m83566b(C20136g.f63999a, m83322e() + " --> connect() --> start connect with WifiNetworkSpecifier --> start ....", false, 2, null);
        InterfaceC25149n0 interfaceC25149n0M83324g = m83324g();
        if (interfaceC25149n0M83324g != null) {
            AbstractC25136k.m99058d(interfaceC25149n0M83324g, null, null, new WifiNetworkSpecifierAdapter$doConnect$1(this, null), 3, null);
        }
        WifiNetworkSpecifier.Builder builderM39476a = AbstractC8519y.m39476a();
        C27385a c27385aM83326i = m83326i();
        String str = "";
        if (c27385aM83326i == null || (strM106591p = c27385aM83326i.m106591p()) == null) {
            strM106591p = "";
        }
        WifiNetworkSpecifier.Builder ssid = builderM39476a.setSsid(strM106591p);
        Intrinsics.m97801g(ssid, "setSsid(...)");
        C27385a c27385aM83326i2 = m83326i();
        if (!TextUtils.isEmpty(c27385aM83326i2 != null ? c27385aM83326i2.m106590o() : null)) {
            C27385a c27385aM83326i3 = m83326i();
            if (c27385aM83326i3 != null && (strM106590o = c27385aM83326i3.m106590o()) != null) {
                str = strM106590o;
            }
            ssid.setWpa2Passphrase(str);
        }
        m83360q().requestNetwork(new NetworkRequest.Builder().addTransportType(1).removeCapability(12).setNetworkSpecifier(AbstractC8517w.m39474a(ssid.build())).build(), this.f63903f);
    }
}
