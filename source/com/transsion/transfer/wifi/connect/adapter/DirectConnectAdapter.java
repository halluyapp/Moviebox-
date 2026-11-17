package com.transsion.transfer.wifi.connect.adapter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pInfo;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Handler;
import android.os.Looper;
import com.blankj.utilcode.util.Utils;
import com.transsion.transfer.wifi.connect.InterfaceC20072b;
import com.transsion.transfer.wifi.util.C20136g;
import com.transsion.transfer.wifi.util.C20138i;
import com.transsion.transfer.wifi.util.WifiUtils;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.net.InetAddress;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
public final class DirectConnectAdapter extends BaseWifiConnectAdapter {

    /* JADX INFO: renamed from: f */
    private WifiP2PReceive f63890f;

    /* JADX INFO: renamed from: g */
    private WifiP2pManager.Channel f63891g;

    /* JADX INFO: renamed from: h */
    private WifiP2pDevice f63892h;

    /* JADX INFO: renamed from: i */
    private InetAddress f63893i;

    /* JADX INFO: renamed from: j */
    private boolean f63894j;

    /* JADX INFO: renamed from: k */
    private int f63895k;

    /* JADX INFO: renamed from: o */
    private boolean f63899o;

    /* JADX INFO: renamed from: e */
    private final Lazy f63889e = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.wifi.connect.adapter.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DirectConnectAdapter.m83353z();
        }
    });

    /* JADX INFO: renamed from: l */
    private int f63896l = 10;

    /* JADX INFO: renamed from: m */
    private final Handler f63897m = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: n */
    private Runnable f63898n = new Runnable() { // from class: com.transsion.transfer.wifi.connect.adapter.c
        @Override // java.lang.Runnable
        public final void run() {
            DirectConnectAdapter.m83337I(this.f63909a);
        }
    };

    @Metadata(m97099d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\r\u001a\u00020\u000b2<\u0010\f\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010RN\u0010\u0012\u001a:\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0013"}, m97100d2 = {"Lcom/transsion/transfer/wifi/connect/adapter/DirectConnectAdapter$WifiP2PReceive;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Lkotlin/Function2;", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", "context", "Landroid/content/Intent;", "intent", "", "callback", "a", "(Lkotlin/jvm/functions/Function2;)V", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lkotlin/jvm/functions/Function2;", "mCallback", "Transfer_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    public static final class WifiP2PReceive extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private Function2 mCallback;

        /* JADX INFO: renamed from: a */
        public final void m83354a(Function2 callback) {
            Intrinsics.m97802h(callback, "callback");
            this.mCallback = callback;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Function2 function2 = this.mCallback;
            if (function2 != null) {
            }
        }
    }

    public DirectConnectAdapter() {
        WifiP2pManager wifiP2pManagerM83352y = m83352y();
        this.f63891g = wifiP2pManagerM83352y != null ? wifiP2pManagerM83352y.initialize(Utils.m27275a(), Looper.getMainLooper(), null) : null;
    }

    /* JADX INFO: renamed from: A */
    private final void m83329A(int i11) {
        C20136g.m83567d(C20136g.f63999a, m83322e() + " --> onFail() --> reason = " + i11, false, 2, null);
        this.f63897m.removeCallbacks(this.f63898n);
        InterfaceC20072b interfaceC20072bM83325h = m83325h();
        if (interfaceC20072bM83325h != null) {
            interfaceC20072bM83325h.mo83299b(i11);
        }
    }

    /* JADX INFO: renamed from: B */
    private final void m83330B() {
        C20136g.m83566b(C20136g.f63999a, m83322e() + " --> onSuccess() --> mAddress = " + this.f63893i, false, 2, null);
        this.f63899o = true;
        this.f63897m.removeCallbacks(this.f63898n);
        InterfaceC20072b interfaceC20072bM83325h = m83325h();
        if (interfaceC20072bM83325h != null) {
            interfaceC20072bM83325h.mo83300c(this.f63893i);
        }
    }

    /* JADX INFO: renamed from: C */
    private final void m83331C(Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            switch (action.hashCode()) {
                case -1772632330:
                    if (action.equals("android.net.wifi.p2p.CONNECTION_STATE_CHANGE")) {
                        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                        C20136g c20136g = C20136g.f63999a;
                        C20136g.m83566b(c20136g, m83322e() + " --> registerReceiver() --> onReceive() --> networkInfo = " + networkInfo, false, 2, null);
                        if (networkInfo != null && networkInfo.isConnected()) {
                            C20136g.m83566b(c20136g, m83322e() + " --> registerReceiver() --> onReceive() --> 已连接到对等设备 --> requestConnectionInfo()", false, 2, null);
                            WifiP2pGroup wifiP2pGroup = (WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo");
                            if (wifiP2pGroup != null) {
                                this.f63892h = wifiP2pGroup.getOwner();
                            }
                            WifiP2pInfo wifiP2pInfo = (WifiP2pInfo) intent.getParcelableExtra("wifiP2pInfo");
                            if (wifiP2pInfo != null && wifiP2pInfo.groupFormed) {
                                this.f63893i = wifiP2pInfo.groupOwnerAddress;
                                m83330B();
                            } else {
                                m83335G();
                            }
                        } else if ((networkInfo != null ? networkInfo.getState() : null) == NetworkInfo.State.DISCONNECTED) {
                            this.f63894j = false;
                            m83334F();
                        }
                        break;
                    }
                    break;
                case -1566767901:
                    if (action.equals("android.net.wifi.p2p.THIS_DEVICE_CHANGED")) {
                        WifiP2pDevice wifiP2pDevice = (WifiP2pDevice) intent.getParcelableExtra("wifiP2pDevice");
                        C20136g.m83566b(C20136g.f63999a, m83322e() + " --> registerReceiver() --> onReceive() --> 本设备的 Wi-Fi 状态已更改 --> CONNECTED = 0｜INVITED = 1｜FAILED = 2｜AVAILABLE = 3｜UNAVAILABLE = 4 --> " + (wifiP2pDevice != null ? Integer.valueOf(wifiP2pDevice.status) : null) + " ", false, 2, null);
                        break;
                    }
                    break;
                case -1394739139:
                    action.equals("android.net.wifi.p2p.PEERS_CHANGED");
                    break;
                case 1695662461:
                    if (action.equals("android.net.wifi.p2p.STATE_CHANGED")) {
                        if (intent.getIntExtra("wifi_p2p_state", -1) != 2) {
                            C20136g.m83566b(C20136g.f63999a, m83322e() + " --> registerReceiver() --> onReceive() --> Wi-Fi P2P 未启用 -- Wi-Fi P2P is not enabled.", false, 2, null);
                        } else {
                            C20136g.m83566b(C20136g.f63999a, m83322e() + " --> registerReceiver() --> onReceive() --> Wi-Fi P2P 已启用 -- Wi-Fi P2P is enabled.", false, 2, null);
                        }
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    private final void m83332D() {
        if (this.f63890f == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.p2p.STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.p2p.PEERS_CHANGED");
            intentFilter.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
            intentFilter.addAction("android.net.wifi.p2p.THIS_DEVICE_CHANGED");
            WifiP2PReceive wifiP2PReceive = new WifiP2PReceive();
            this.f63890f = wifiP2PReceive;
            wifiP2PReceive.m83354a(new Function2() { // from class: com.transsion.transfer.wifi.connect.adapter.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DirectConnectAdapter.m83333E(this.f63910a, (Context) obj, (Intent) obj2);
                }
            });
            Utils.m27275a().registerReceiver(this.f63890f, intentFilter);
            C20136g.m83566b(C20136g.f63999a, m83322e() + " --> registerReceiver() --> 广播注册成功", false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final Unit m83333E(DirectConnectAdapter directConnectAdapter, Context context, Intent intent) {
        if (directConnectAdapter.f63899o) {
            C20136g.m83566b(C20136g.f63999a, directConnectAdapter.m83322e() + " --> isSuccess = " + directConnectAdapter.f63899o + " --> 如果已经连接成功了，后续的广播就不再处理了， 这一个操作是为了兼容业务 --> 这里将导致断开重连功能失效", false, 2, null);
        } else {
            directConnectAdapter.m83331C(intent);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final void m83334F() {
        if (this.f63894j) {
            C20136g.m83567d(C20136g.f63999a, m83322e() + " --> requestConnect() --> mConnecting = " + this.f63894j, false, 2, null);
            return;
        }
        int i11 = this.f63895k;
        if (i11 >= this.f63896l) {
            C20136g.m83566b(C20136g.f63999a, m83322e() + " --> requestConnect() --> connectRetry = " + this.f63895k + " --> retryCount = " + this.f63896l + " --> 重试次数用完了,请求失败", false, 2, null);
            m83329A(2020);
            return;
        }
        int i12 = i11 + 1;
        this.f63895k = i12;
        if (i12 == 5) {
            InterfaceC25149n0 interfaceC25149n0M83324g = m83324g();
            if (interfaceC25149n0M83324g != null) {
                AbstractC25136k.m99058d(interfaceC25149n0M83324g, null, null, new DirectConnectAdapter$requestConnect$1(this, null), 3, null);
                return;
            }
            return;
        }
        C20136g.m83566b(C20136g.f63999a, m83322e() + " --> requestConnect() --> connectRetry = " + this.f63895k + " --> retryCount = " + this.f63896l, false, 2, null);
        m83351x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final void m83335G() {
        Unit unit = null;
        C20136g.m83566b(C20136g.f63999a, m83322e() + " --> requestConnectionInfo() --> start...", false, 2, null);
        WifiP2pManager.Channel channel = this.f63891g;
        if (channel != null) {
            WifiP2pManager wifiP2pManagerM83352y = m83352y();
            if (wifiP2pManagerM83352y != null) {
                wifiP2pManagerM83352y.requestConnectionInfo(channel, new WifiP2pManager.ConnectionInfoListener() { // from class: com.transsion.transfer.wifi.connect.adapter.a
                    @Override // android.net.wifi.p2p.WifiP2pManager.ConnectionInfoListener
                    public final void onConnectionInfoAvailable(WifiP2pInfo wifiP2pInfo) {
                        DirectConnectAdapter.m83336H(this.f63908a, wifiP2pInfo);
                    }
                });
                unit = Unit.f75682a;
            }
            if (unit != null) {
                return;
            }
        }
        m83329A(2023);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m83336H(DirectConnectAdapter directConnectAdapter, WifiP2pInfo wifiP2pInfo) {
        C20136g c20136g = C20136g.f63999a;
        C20136g.m83566b(c20136g, directConnectAdapter.m83322e() + " --> requestConnectionInfo() --> start --> info = " + wifiP2pInfo, false, 2, null);
        if (wifiP2pInfo == null) {
            InterfaceC25149n0 interfaceC25149n0M83324g = directConnectAdapter.m83324g();
            if (interfaceC25149n0M83324g != null) {
                AbstractC25136k.m99058d(interfaceC25149n0M83324g, null, null, new DirectConnectAdapter$requestConnectionInfo$1$1$2(directConnectAdapter, null), 3, null);
                return;
            }
            return;
        }
        if (!wifiP2pInfo.groupFormed) {
            InterfaceC25149n0 interfaceC25149n0M83324g2 = directConnectAdapter.m83324g();
            if (interfaceC25149n0M83324g2 != null) {
                AbstractC25136k.m99058d(interfaceC25149n0M83324g2, null, null, new DirectConnectAdapter$requestConnectionInfo$1$1$1(directConnectAdapter, null), 3, null);
                return;
            }
            return;
        }
        directConnectAdapter.f63893i = wifiP2pInfo.groupOwnerAddress;
        C20136g.m83566b(c20136g, directConnectAdapter.m83322e() + " --> requestConnectionInfo() --> start --> 11111", false, 2, null);
        directConnectAdapter.m83330B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final void m83337I(DirectConnectAdapter directConnectAdapter) {
        directConnectAdapter.m83329A(2022);
    }

    /* JADX INFO: renamed from: J */
    private final void m83338J() {
        WifiP2PReceive wifiP2PReceive = this.f63890f;
        if (wifiP2PReceive != null) {
            Utils.m27275a().unregisterReceiver(wifiP2PReceive);
            C20136g.m83566b(C20136g.f63999a, m83322e() + " --> unregisterReceiver() --> success", false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final void m83351x() {
        this.f63894j = true;
        WifiP2pManager.Channel channel = this.f63891g;
        if (channel != null) {
            WifiP2pManager wifiP2pManagerM83352y = m83352y();
            Unit unit = null;
            if (wifiP2pManagerM83352y != null) {
                wifiP2pManagerM83352y.cancelConnect(channel, null);
            }
            WifiP2pConfig wifiP2pConfigM83532f = WifiUtils.f63989a.m83532f(m83326i(), this.f63892h);
            if (wifiP2pConfigM83532f == null) {
                m83329A(2021);
                return;
            }
            C20136g.m83566b(C20136g.f63999a, m83322e() + " --> connectP2P() --> 开始连接 --> mWifiP2pManager.connect()", false, 2, null);
            WifiP2pManager wifiP2pManagerM83352y2 = m83352y();
            if (wifiP2pManagerM83352y2 != null) {
                wifiP2pManagerM83352y2.connect(channel, wifiP2pConfigM83532f, new WifiP2pManager.ActionListener() { // from class: com.transsion.transfer.wifi.connect.adapter.DirectConnectAdapter$connectP2P$1$1
                    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
                    public void onFailure(int i11) {
                        C20136g.m83567d(C20136g.f63999a, this.f63901a.m83322e() + " --> connectP2P() --> onFailure() --> reason = " + i11 + " --> 重试", false, 2, null);
                        this.f63901a.f63894j = false;
                        InterfaceC25149n0 interfaceC25149n0M83324g = this.f63901a.m83324g();
                        if (interfaceC25149n0M83324g != null) {
                            AbstractC25136k.m99058d(interfaceC25149n0M83324g, null, null, new DirectConnectAdapter$connectP2P$1$1$onFailure$1(this.f63901a, null), 3, null);
                        }
                    }

                    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
                    public void onSuccess() {
                        C20136g.m83566b(C20136g.f63999a, this.f63901a.m83322e() + " --> connectP2P() --> onSuccess() --> 等待广播通知", false, 2, null);
                    }
                });
                unit = Unit.f75682a;
            }
            if (unit != null) {
                return;
            }
        }
        m83329A(2023);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final WifiP2pManager m83352y() {
        return (WifiP2pManager) this.f63889e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final WifiP2pManager m83353z() {
        Object systemService = Utils.m27275a().getApplicationContext().getSystemService("wifip2p");
        if (systemService instanceof WifiP2pManager) {
            return (WifiP2pManager) systemService;
        }
        return null;
    }

    @Override // com.transsion.transfer.wifi.connect.adapter.BaseWifiConnectAdapter
    /* JADX INFO: renamed from: c */
    public void mo83317c() {
        Object objM112707constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            this.f63897m.removeCallbacksAndMessages(null);
            this.f63892h = null;
            this.f63893i = null;
            this.f63895k = 0;
            this.f63894j = false;
            C20138i.f64000a.m83579d(m83352y(), this.f63891g, (60 & 4) != 0, (60 & 8) != 0, (60 & 16) != 0, (60 & 32) != 0);
            this.f63891g = null;
            m83338J();
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl == null) {
            return;
        }
        C20136g.m83567d(C20136g.f63999a, m83322e() + " --> stop() --> p2p stop Exception = " + thM112710exceptionOrNullimpl, false, 2, null);
    }

    @Override // com.transsion.transfer.wifi.connect.adapter.BaseWifiConnectAdapter
    /* JADX INFO: renamed from: d */
    public void mo83318d() {
        C20136g.m83566b(C20136g.f63999a, m83322e() + " --> start() --> 开启直连....", false, 2, null);
        m83332D();
        m83334F();
        this.f63897m.postDelayed(this.f63898n, 90000L);
    }
}
