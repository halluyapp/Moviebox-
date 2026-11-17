package com.transsion.transfer.wifi.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.transsion.transfer.wifi.util.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C20132c {

    /* JADX INFO: renamed from: a */
    public static final C20132c f63993a = new C20132c();

    private C20132c() {
    }

    /* JADX INFO: renamed from: a */
    public final long m83556a() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    /* JADX INFO: renamed from: b */
    public final String m83557b() {
        return (((int) ((((m83556a() / 1024.0f) / 1024.0f) / 1024.0f) * 10)) / 10.0f) + "GB";
    }

    /* JADX INFO: renamed from: c */
    public final String m83558c(Context context) {
        Intrinsics.m97802h(context, "context");
        return (((int) (((m83559d(context) / 1024.0f) / 1024.0f) * 10)) / 10.0f) + "GB";
    }

    /* JADX INFO: renamed from: d */
    public final long m83559d(Context context) {
        Intrinsics.m97802h(context, "context");
        try {
            Object systemService = context.getSystemService("activity");
            Intrinsics.m97800f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            long j11 = memoryInfo.totalMem;
            return j11 > 0 ? j11 / ((long) 1024) : j11;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m83560e() {
        String MODEL = Build.MODEL;
        Intrinsics.m97801g(MODEL, "MODEL");
        Locale locale = Locale.getDefault();
        Intrinsics.m97801g(locale, "getDefault(...)");
        String lowerCase = MODEL.toLowerCase(locale);
        Intrinsics.m97801g(lowerCase, "toLowerCase(...)");
        return StringsKt.m98242W(lowerCase, "itel", false, 2, null) || StringsKt.m98242W(lowerCase, "tecno", false, 2, null) || StringsKt.m98242W(lowerCase, "infinix", false, 2, null) || StringsKt.m98242W(lowerCase, "spice", false, 2, null);
    }
}
