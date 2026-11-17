package com.transsion.subtitle_download.utils;

import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;

/* JADX INFO: loaded from: classes.dex */
public final class ObserveNetworkState implements InterfaceC27288n {

    /* JADX INFO: renamed from: a */
    public static final ObserveNetworkState f63086a = new ObserveNetworkState();

    private ObserveNetworkState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final String m82361b() {
        String simpleName = ObserveNetworkState.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: renamed from: c */
    public final void m82362c(String str) {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new ObserveNetworkState$retryDownload$1(str, null), 3, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m82363d() {
        C27287m.f83003a.m106336l(this);
        m82362c("冷启动");
    }

    @Override // p743rh.InterfaceC27288n
    public void onConnected() {
        InterfaceC27288n.a.m106338a(this);
    }

    @Override // p743rh.InterfaceC27288n
    public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.m97802h(network, "network");
        Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
        C19771b.f63088a.m82365a(m82361b() + " --> onConnected() --> 网络重新链接的时候检查一下字幕下载 --> 延迟5秒，优化网络抖动 .....");
        m82362c("网络重新连接");
    }

    @Override // p743rh.InterfaceC27288n
    public void onDisconnected() {
    }
}
