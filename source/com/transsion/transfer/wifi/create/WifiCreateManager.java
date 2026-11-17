package com.transsion.transfer.wifi.create;

import android.provider.Settings;
import com.blankj.utilcode.util.Utils;
import com.transsion.transfer.wifi.create.adapter.AbstractC20078b;
import com.transsion.transfer.wifi.create.adapter.C20077a;
import com.transsion.transfer.wifi.create.adapter.C20079c;
import com.transsion.transfer.wifi.create.adapter.P2PWifiAdapter;
import com.transsion.transfer.wifi.util.C20135f;
import com.transsion.transfer.wifi.util.C20136g;
import com.transsion.transfer.wifi.util.WifiUtils;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.InterfaceC25149n0;
import p721qv.C27130a;
import p721qv.C27132c;
import p754rv.C27385a;

/* JADX INFO: loaded from: classes6.dex */
public final class WifiCreateManager implements InterfaceC20073a {

    /* JADX INFO: renamed from: a */
    public static final WifiCreateManager f63911a = new WifiCreateManager();

    /* JADX INFO: renamed from: b */
    private static InterfaceC20073a f63912b;

    /* JADX INFO: renamed from: c */
    private static AbstractC20078b f63913c;

    /* JADX INFO: renamed from: d */
    private static long f63914d;

    private WifiCreateManager() {
    }

    /* JADX INFO: renamed from: h */
    private final String m83371h() {
        String simpleName = WifiCreateManager.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final AbstractC20078b m83372i() {
        if (WifiUtils.f63989a.m83541q()) {
            C20136g.m83566b(C20136g.f63999a, m83371h() + " --> initWifiAdapterWithAndroidVersion() --> wifiManager.isP2pSupported -> P2pWifiAdapter()", false, 2, null);
            return new P2PWifiAdapter();
        }
        if (Settings.System.canWrite(Utils.m27275a().getApplicationContext())) {
            C20136g.m83566b(C20136g.f63999a, m83371h() + " --> initWifiAdapterWithAndroidVersion() --> checkCanWriteSetting(TransBaseApplication.CONTEXT) -> ApWifiAdapter()", false, 2, null);
            return new C20077a();
        }
        C20136g.m83566b(C20136g.f63999a, m83371h() + " --> initWifiAdapterWithAndroidVersion() --> else -> LocalHostWifiAdapter()", false, 2, null);
        return new C20079c();
    }

    @Override // com.transsion.transfer.wifi.create.InterfaceC20073a
    /* JADX INFO: renamed from: a */
    public void mo83373a(C27385a c27385a, long j11) {
        InterfaceC20073a interfaceC20073a = f63912b;
        if (interfaceC20073a != null) {
            interfaceC20073a.mo83373a(c27385a, System.currentTimeMillis() - f63914d);
        }
    }

    @Override // com.transsion.transfer.wifi.create.InterfaceC20073a
    /* JADX INFO: renamed from: b */
    public void mo83374b(int i11, long j11) {
        InterfaceC20073a interfaceC20073a = f63912b;
        if (interfaceC20073a != null) {
            interfaceC20073a.mo83374b(i11, System.currentTimeMillis() - f63914d);
        }
        m83376j();
    }

    /* JADX INFO: renamed from: g */
    public final void m83375g(C27385a wifiInfoModel, InterfaceC25149n0 scope, InterfaceC20073a listener) {
        Intrinsics.m97802h(wifiInfoModel, "wifiInfoModel");
        Intrinsics.m97802h(scope, "scope");
        Intrinsics.m97802h(listener, "listener");
        AbstractC25136k.m99058d(scope, null, null, new WifiCreateManager$createWifi$1(listener, wifiInfoModel, scope, null), 3, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m83376j() {
        Object objM112707constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            f63912b = null;
            C20136g c20136g = C20136g.f63999a;
            WifiCreateManager wifiCreateManager = f63911a;
            C20136g.m83569h(c20136g, wifiCreateManager.m83371h() + " --> releaseWifi() --> 发送端开始释放资源", false, 2, null);
            WifiUtils.f63989a.m83547x();
            C27130a.f82239a.m105556b();
            C20135f.f63996a.m83565c();
            AbstractC20078b abstractC20078b = f63913c;
            if (abstractC20078b != null) {
                abstractC20078b.mo83401f();
            } else {
                C20136g.m83566b(c20136g, wifiCreateManager.m83371h() + " --> releaseWifi() --> wifiAdapter == null", false, 2, null);
            }
            f63913c = null;
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl == null) {
            return;
        }
        C20136g.m83567d(C20136g.f63999a, f63911a.m83371h() + " --> releaseWifi() --> exception = " + thM112710exceptionOrNullimpl, false, 2, null);
    }

    @Override // com.transsion.transfer.wifi.create.InterfaceC20073a
    public void onStart() {
        f63914d = System.currentTimeMillis();
        C27132c.f82242a.m105589k();
        InterfaceC20073a interfaceC20073a = f63912b;
        if (interfaceC20073a != null) {
            interfaceC20073a.onStart();
        }
    }
}
