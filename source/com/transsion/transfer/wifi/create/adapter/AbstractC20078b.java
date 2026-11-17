package com.transsion.transfer.wifi.create.adapter;

import com.transsion.transfer.wifi.create.InterfaceC20073a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import p754rv.C27385a;

/* JADX INFO: renamed from: com.transsion.transfer.wifi.create.adapter.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC20078b {

    /* JADX INFO: renamed from: a */
    private C27385a f63923a;

    /* JADX INFO: renamed from: b */
    private InterfaceC20073a f63924b;

    /* JADX INFO: renamed from: c */
    private InterfaceC25149n0 f63925c;

    /* JADX INFO: renamed from: a */
    public abstract Object mo83400a(Continuation continuation);

    /* JADX INFO: renamed from: b */
    public final String m83403b() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC25149n0 m83404c() {
        return this.f63925c;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC20073a m83405d() {
        return this.f63924b;
    }

    /* JADX INFO: renamed from: e */
    public final C27385a m83406e() {
        return this.f63923a;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo83401f();

    /* JADX INFO: renamed from: g */
    public final void m83407g(InterfaceC25149n0 interfaceC25149n0) {
        this.f63925c = interfaceC25149n0;
    }

    /* JADX INFO: renamed from: h */
    public final void m83408h(InterfaceC20073a interfaceC20073a) {
        this.f63924b = interfaceC20073a;
    }

    /* JADX INFO: renamed from: i */
    public final Object m83409i(C27385a c27385a, InterfaceC20073a interfaceC20073a, InterfaceC25149n0 interfaceC25149n0, Continuation continuation) {
        this.f63923a = c27385a;
        this.f63924b = interfaceC20073a;
        this.f63925c = interfaceC25149n0;
        Object objMo83400a = mo83400a(continuation);
        return objMo83400a == IntrinsicsKt.m97630f() ? objMo83400a : Unit.f75682a;
    }
}
