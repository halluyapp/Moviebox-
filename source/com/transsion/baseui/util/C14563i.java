package com.transsion.baseui.util;

import sh.AbstractC27615b;

/* JADX INFO: renamed from: com.transsion.baseui.util.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C14563i {

    /* JADX INFO: renamed from: b */
    private static long f51113b;

    /* JADX INFO: renamed from: c */
    private static long f51114c;

    /* JADX INFO: renamed from: a */
    public static final C14563i f51112a = new C14563i();

    /* JADX INFO: renamed from: d */
    public static final int f51115d = 8;

    private C14563i() {
    }

    /* JADX INFO: renamed from: a */
    public final String m65679a(long j11) {
        long jCurrentTimeMillis = (System.currentTimeMillis() - f51114c) / ((long) 1000);
        if (jCurrentTimeMillis <= 0) {
            jCurrentTimeMillis = 1;
        }
        f51114c = System.currentTimeMillis();
        long j12 = (j11 - f51113b) / jCurrentTimeMillis;
        f51113b = j11;
        if (j12 <= 0) {
            return "0KB/s";
        }
        return AbstractC27615b.m107445a(j12, 1) + "/s";
    }
}
