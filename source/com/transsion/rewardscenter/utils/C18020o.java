package com.transsion.rewardscenter.utils;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.rewardscenter.utils.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C18020o {

    /* JADX INFO: renamed from: b */
    private static Context f58999b;

    /* JADX INFO: renamed from: a */
    public static final C18020o f58998a = new C18020o();

    /* JADX INFO: renamed from: c */
    public static final int f59000c = 8;

    private C18020o() {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m76641a(Context context, String packageName) {
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(packageName, "packageName");
        if (f58999b == null) {
            m76642b(context);
        }
        try {
            Context context2 = f58999b;
            if (context2 == null) {
                Intrinsics.m97819y("applicationContext");
                context2 = null;
            }
            return context2.getPackageManager().getApplicationInfo(packageName, 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m76642b(Context context) {
        Intrinsics.m97802h(context, "context");
        f58999b = context.getApplicationContext();
    }
}
