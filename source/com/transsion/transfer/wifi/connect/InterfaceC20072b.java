package com.transsion.transfer.wifi.connect;

import android.net.Network;
import java.net.InetAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.transfer.wifi.connect.b */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC20072b {

    /* JADX INFO: renamed from: com.transsion.transfer.wifi.connect.b$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m83362a(InterfaceC20072b interfaceC20072b, int i11) {
        }

        /* JADX INFO: renamed from: b */
        public static void m83363b(InterfaceC20072b interfaceC20072b, Network network) {
            Intrinsics.m97802h(network, "network");
        }

        /* JADX INFO: renamed from: c */
        public static void m83364c(InterfaceC20072b interfaceC20072b, String ip2) {
            Intrinsics.m97802h(ip2, "ip");
        }

        /* JADX INFO: renamed from: d */
        public static void m83365d(InterfaceC20072b interfaceC20072b) {
        }

        /* JADX INFO: renamed from: e */
        public static void m83366e(InterfaceC20072b interfaceC20072b, InetAddress inetAddress) {
        }
    }

    /* JADX INFO: renamed from: a */
    void mo83298a(Network network);

    /* JADX INFO: renamed from: b */
    void mo83299b(int i11);

    /* JADX INFO: renamed from: c */
    void mo83300c(InetAddress inetAddress);

    /* JADX INFO: renamed from: d */
    void mo83301d(int i11);

    /* JADX INFO: renamed from: e */
    void mo83302e(String str);

    void onStart();
}
