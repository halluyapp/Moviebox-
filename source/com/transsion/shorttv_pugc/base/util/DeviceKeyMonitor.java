package com.transsion.shorttv_pugc.base.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class DeviceKeyMonitor {

    /* JADX INFO: renamed from: e */
    public static final C19244a f61759e = new C19244a(null);

    /* JADX INFO: renamed from: a */
    private final Context f61760a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC19245b f61761b;

    /* JADX INFO: renamed from: c */
    private final String f61762c;

    /* JADX INFO: renamed from: d */
    private BroadcastReceiver f61763d;

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.util.DeviceKeyMonitor$a */
    public static final class C19244a {
        private C19244a() {
        }

        public /* synthetic */ C19244a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.util.DeviceKeyMonitor$b */
    public interface InterfaceC19245b {
        void onHomeClick();

        void onRecentClick();
    }

    public DeviceKeyMonitor(Context context, InterfaceC19245b listener) {
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(listener, "listener");
        this.f61760a = context;
        this.f61761b = listener;
        this.f61762c = "DeviceKeyMonitor";
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.transsion.shorttv_pugc.base.util.DeviceKeyMonitor.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                Intrinsics.m97802h(context2, "context");
                Intrinsics.m97802h(intent, "intent");
                if (Intrinsics.m97797c(intent.getAction(), "android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
                    String stringExtra = intent.getStringExtra("reason");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    int iHashCode = stringExtra.hashCode();
                    if (iHashCode != -1408204183) {
                        if (iHashCode != 350448461) {
                            if (iHashCode == 1092716832 && stringExtra.equals("homekey")) {
                                DeviceKeyMonitor.this.f61761b.onHomeClick();
                                return;
                            }
                            return;
                        }
                        if (!stringExtra.equals("recentapps")) {
                            return;
                        }
                    } else if (!stringExtra.equals("assist")) {
                        return;
                    }
                    DeviceKeyMonitor.this.f61761b.onRecentClick();
                }
            }
        };
        this.f61763d = broadcastReceiver;
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m112707constructorimpl(Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"), 2) : context.registerReceiver(broadcastReceiver, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS")));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m80579b() {
        try {
            Result.Companion companion = Result.INSTANCE;
            BroadcastReceiver broadcastReceiver = this.f61763d;
            if (broadcastReceiver != null) {
                this.f61760a.unregisterReceiver(broadcastReceiver);
                this.f61763d = null;
            }
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }
}
