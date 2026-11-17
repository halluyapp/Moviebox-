package com.transsion.baseui.util;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.baseui.util.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14558d {

    /* JADX INFO: renamed from: a */
    private static long f51104a;

    /* JADX INFO: renamed from: a */
    public static final void m65672a(long j11, Function0 clickInvoke) {
        Intrinsics.m97802h(clickInvoke, "clickInvoke");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f51104a > j11) {
            f51104a = jElapsedRealtime;
            clickInvoke.invoke();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m65673b(long j11, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 600;
        }
        m65672a(j11, function0);
    }
}
