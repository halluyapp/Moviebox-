package com.transsion.rewardscenter.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class AppInstallBroadcastHelper {

    /* JADX INFO: renamed from: b */
    private static BroadcastReceiver f58976b;

    /* JADX INFO: renamed from: a */
    public static final AppInstallBroadcastHelper f58975a = new AppInstallBroadcastHelper();

    /* JADX INFO: renamed from: c */
    public static final int f58977c = 8;

    private AppInstallBroadcastHelper() {
    }

    /* JADX INFO: renamed from: a */
    public final void m76600a(Context context, final Function1 callback) {
        Object objM112707constructorimpl;
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(callback, "callback");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        BroadcastReceiver broadcastReceiver = f58976b;
        if (broadcastReceiver != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                context.unregisterReceiver(broadcastReceiver);
                objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            Result.m112706boximpl(objM112707constructorimpl);
        }
        f58976b = null;
        try {
            Result.Companion companion3 = Result.INSTANCE;
            BroadcastReceiver broadcastReceiver2 = new BroadcastReceiver() { // from class: com.transsion.rewardscenter.utils.AppInstallBroadcastHelper$registerAppInstallReceiver$2$receiver$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    Intrinsics.m97802h(context2, "context");
                    Intrinsics.m97802h(intent, "intent");
                    if (Intrinsics.m97797c(intent.getAction(), "android.intent.action.PACKAGE_ADDED") || Intrinsics.m97797c(intent.getAction(), "android.intent.action.PACKAGE_REPLACED")) {
                        Uri data = intent.getData();
                        String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
                        if (schemeSpecificPart != null) {
                            callback.invoke(schemeSpecificPart);
                        }
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter.addDataScheme("package");
            context.registerReceiver(broadcastReceiver2, intentFilter);
            f58976b = broadcastReceiver2;
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th3));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m76601b(Context context) {
        Intrinsics.m97802h(context, "context");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        BroadcastReceiver broadcastReceiver = f58976b;
        if (broadcastReceiver != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                context.unregisterReceiver(broadcastReceiver);
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            f58976b = null;
        }
    }
}
