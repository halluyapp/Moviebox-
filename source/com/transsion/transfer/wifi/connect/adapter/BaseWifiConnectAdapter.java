package com.transsion.transfer.wifi.connect.adapter;

import androidx.appcompat.app.AppCompatActivity;
import com.transsion.transfer.wifi.connect.InterfaceC20072b;
import com.transsion.transfer.wifi.util.C20136g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.InterfaceC25149n0;
import p754rv.C27385a;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseWifiConnectAdapter {

    /* JADX INFO: renamed from: a */
    private InterfaceC25149n0 f63885a;

    /* JADX INFO: renamed from: b */
    private InterfaceC20072b f63886b;

    /* JADX INFO: renamed from: c */
    private C27385a f63887c;

    /* JADX INFO: renamed from: d */
    private AppCompatActivity f63888d;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m83320b(BaseWifiConnectAdapter baseWifiConnectAdapter, AppCompatActivity appCompatActivity, C27385a c27385a, InterfaceC25149n0 interfaceC25149n0, InterfaceC20072b interfaceC20072b, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: connect");
        }
        if ((i11 & 1) != 0) {
            appCompatActivity = null;
        }
        baseWifiConnectAdapter.m83321a(appCompatActivity, c27385a, interfaceC25149n0, interfaceC20072b);
    }

    /* JADX INFO: renamed from: a */
    public final void m83321a(AppCompatActivity appCompatActivity, C27385a c27385a, InterfaceC25149n0 interfaceC25149n0, InterfaceC20072b interfaceC20072b) {
        this.f63888d = appCompatActivity;
        this.f63887c = c27385a;
        this.f63885a = interfaceC25149n0;
        this.f63886b = interfaceC20072b;
        if (interfaceC25149n0 != null) {
            AbstractC25136k.m99058d(interfaceC25149n0, null, null, new BaseWifiConnectAdapter$connect$1(this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo83317c();

    /* JADX INFO: renamed from: d */
    public abstract void mo83318d();

    /* JADX INFO: renamed from: e */
    public final String m83322e() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: renamed from: f */
    public final AppCompatActivity m83323f() {
        return this.f63888d;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC25149n0 m83324g() {
        return this.f63885a;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC20072b m83325h() {
        return this.f63886b;
    }

    /* JADX INFO: renamed from: i */
    public final C27385a m83326i() {
        return this.f63887c;
    }

    /* JADX INFO: renamed from: j */
    public final void m83327j(String msg) {
        Intrinsics.m97802h(msg, "msg");
        C20136g.m83566b(C20136g.f63999a, m83322e() + " --> " + msg, false, 2, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m83328k() {
        mo83317c();
        this.f63885a = null;
        this.f63888d = null;
        this.f63886b = null;
        this.f63887c = null;
    }
}
