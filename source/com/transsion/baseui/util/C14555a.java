package com.transsion.baseui.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.TypedValue;
import kotlin.jvm.internal.Intrinsics;
import sh.C27621h;

/* JADX INFO: renamed from: com.transsion.baseui.util.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C14555a {

    /* JADX INFO: renamed from: a */
    public static final C14555a f51098a = new C14555a();

    /* JADX INFO: renamed from: b */
    public static final int f51099b = 8;

    private C14555a() {
    }

    /* JADX INFO: renamed from: a */
    public final float m65667a(Context context, float f11) {
        Intrinsics.m97802h(context, "context");
        return TypedValue.applyDimension(1, f11, context.getApplicationContext().getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: b */
    public final int m65668b(Context context) {
        Intrinsics.m97802h(context, "context");
        return C27621h.f84745a.m107455e(context);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m65669c(Context context, String str) {
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            Intrinsics.m97799e(str);
            return packageManager.getPackageInfo(str, 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
