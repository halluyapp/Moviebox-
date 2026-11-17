package com.transsion.baseui.util;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.transsion.baseui.util.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C14557c {

    /* JADX INFO: renamed from: b */
    private static long f51101b;

    /* JADX INFO: renamed from: c */
    private static int f51102c;

    /* JADX INFO: renamed from: a */
    public static final C14557c f51100a = new C14557c();

    /* JADX INFO: renamed from: d */
    public static final int f51103d = 8;

    private C14557c() {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m65671a(int i11, long j11) {
        if (f51102c != i11) {
            f51102c = i11;
            f51101b = SystemClock.elapsedRealtime();
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f51101b <= j11) {
            return true;
        }
        f51102c = i11;
        f51101b = jElapsedRealtime;
        return false;
    }
}
