package com.transsion.transfer.wifi.util;

import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import com.cloud.tmc.kernel.constants.TmcConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.transfer.wifi.util.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C20138i {

    /* JADX INFO: renamed from: a */
    public static final C20138i f64000a = new C20138i();

    /* JADX INFO: renamed from: com.transsion.transfer.wifi.util.i$a */
    public static final class a implements WifiP2pManager.ActionListener {
        a() {
        }

        @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
        public void onFailure(int i11) {
            C20136g c20136g = C20136g.f63999a;
            C20138i c20138i = C20138i.f64000a;
            C20136g.m83566b(c20136g, c20138i.m83576c() + " --> release() --> clearLocalServices() --> onFailure() --> reason = " + c20138i.m83578b(i11), false, 2, null);
        }

        @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
        public void onSuccess() {
            C20136g.m83566b(C20136g.f63999a, C20138i.f64000a.m83576c() + " --> release() --> clearLocalServices() --> onSuccess()", false, 2, null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.wifi.util.i$b */
    public static final class b implements WifiP2pManager.ActionListener {
        b() {
        }

        @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
        public void onFailure(int i11) {
            C20136g c20136g = C20136g.f63999a;
            C20138i c20138i = C20138i.f64000a;
            C20136g.m83566b(c20136g, c20138i.m83576c() + " --> release() --> removeGroup() --> onFailure() --> reason = " + c20138i.m83578b(i11), false, 2, null);
        }

        @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
        public void onSuccess() {
            C20136g.m83566b(C20136g.f63999a, C20138i.f64000a.m83576c() + " --> release() --> removeGroup() --> onSuccess()", false, 2, null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.wifi.util.i$c */
    public static final class c implements WifiP2pManager.ActionListener {
        c() {
        }

        @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
        public void onFailure(int i11) {
            C20136g c20136g = C20136g.f63999a;
            C20138i c20138i = C20138i.f64000a;
            C20136g.m83566b(c20136g, c20138i.m83576c() + " --> release() --> cancelConnect() --> onFailure() --> reason = " + c20138i.m83578b(i11), false, 2, null);
        }

        @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
        public void onSuccess() {
            C20136g.m83566b(C20136g.f63999a, C20138i.f64000a.m83576c() + " --> release() --> cancelConnect() --> onSuccess()", false, 2, null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.wifi.util.i$d */
    public static final class d implements WifiP2pManager.ActionListener {
        d() {
        }

        @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
        public void onFailure(int i11) {
            C20136g c20136g = C20136g.f63999a;
            C20138i c20138i = C20138i.f64000a;
            C20136g.m83566b(c20136g, c20138i.m83576c() + " --> release() --> stopPeerDiscovery() --> onFailure() --> reason = " + c20138i.m83578b(i11), false, 2, null);
        }

        @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
        public void onSuccess() {
            C20136g.m83566b(C20136g.f63999a, C20138i.f64000a.m83576c() + " --> release() --> stopPeerDiscovery() --> onSuccess()", false, 2, null);
        }
    }

    private C20138i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final String m83576c() {
        String simpleName = C20138i.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: renamed from: b */
    public final String m83578b(int i11) {
        if (i11 == 0) {
            return "0 -- 表示操作由于内部错误而失败。";
        }
        if (i11 == 1) {
            return "1 -- 表示操作失败，因为设备不支持 p2p。";
        }
        if (i11 != 2) {
            return i11 != 3 ? TmcConstants.ROUTE_UNKNOWN : "3 -- 表示 {@link discoveryServices} 失败，因为没有添加服务请求。使用 {@link addServiceRequest} 添加服务请求。";
        }
        return "2 -- 表示操作失败，因为框架正忙，无法处理请求";
    }

    /* JADX INFO: renamed from: d */
    public final void m83579d(WifiP2pManager wifiP2pManager, WifiP2pManager.Channel channel, boolean z11, boolean z12, boolean z13, boolean z14) {
        if (channel != null) {
            if (Build.VERSION.SDK_INT > 26) {
                channel.close();
                C20136g.m83566b(C20136g.f63999a, f64000a.m83576c() + " --> release() --> WifiP2pManager.close() --> API27才有这个方法 --> 成功", false, 2, null);
            }
            if (z14 && wifiP2pManager != null) {
                wifiP2pManager.clearLocalServices(channel, new a());
            }
            if (z11 && wifiP2pManager != null) {
                wifiP2pManager.removeGroup(channel, new b());
            }
            if (z12 && wifiP2pManager != null) {
                wifiP2pManager.cancelConnect(channel, new c());
            }
            if (!z13 || wifiP2pManager == null) {
                return;
            }
            wifiP2pManager.stopPeerDiscovery(channel, new d());
        }
    }
}
