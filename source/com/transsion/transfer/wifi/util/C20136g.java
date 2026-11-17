package com.transsion.transfer.wifi.util;

import kotlin.jvm.internal.Intrinsics;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.transfer.wifi.util.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C20136g {

    /* JADX INFO: renamed from: a */
    public static final C20136g f63999a = new C20136g();

    private C20136g() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m83566b(C20136g c20136g, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        c20136g.m83570a(str, z11);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m83567d(C20136g c20136g, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        c20136g.m83571c(str, z11);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m83568f(C20136g c20136g, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        c20136g.m83572e(str, z11);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m83569h(C20136g c20136g, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        c20136g.m83573g(str, z11);
    }

    /* JADX INFO: renamed from: a */
    public final void m83570a(String msg, boolean z11) {
        Intrinsics.m97802h(msg, "msg");
        C26866a.f81698a.m104912c("mb_wifi", msg, z11);
    }

    /* JADX INFO: renamed from: c */
    public final void m83571c(String msg, boolean z11) {
        Intrinsics.m97802h(msg, "msg");
        C26866a.f81698a.m104915i("mb_wifi", msg, z11);
    }

    /* JADX INFO: renamed from: e */
    public final void m83572e(String msg, boolean z11) {
        Intrinsics.m97802h(msg, "msg");
        C26866a.f81698a.m104921x("mb_wifi_r", msg, z11);
    }

    /* JADX INFO: renamed from: g */
    public final void m83573g(String msg, boolean z11) {
        Intrinsics.m97802h(msg, "msg");
        C26866a.f81698a.m104921x("mb_wifi", msg, z11);
    }
}
