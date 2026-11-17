package com.transsion.search.speech;

import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.AbstractC5792k;
import com.cloud.tmc.integration.event.EventConstants;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.hisavana.common.tracking.TrackingKey;
import com.transsion.baselib.helper.C14450a;
import java.util.LinkedHashMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.search.speech.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C18528q {

    /* JADX INFO: renamed from: a */
    public static final C18528q f60000a = new C18528q();

    /* JADX INFO: renamed from: b */
    private static String f60001b;

    private C18528q() {
    }

    /* JADX INFO: renamed from: a */
    public final void m78053a() {
        C14450a.f50860a.m65139b("sr_dialog_cancel_btn", MapsKt.m97573h());
    }

    /* JADX INFO: renamed from: b */
    public final void m78054b() {
        C14450a.f50860a.m65139b("sr_mic_btn", MapsKt.m97573h());
    }

    /* JADX INFO: renamed from: c */
    public final void m78055c(String msg, int i11) {
        Intrinsics.m97802h(msg, "msg");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EventConstants.KEY_ACTION, "fail");
        linkedHashMap.put(NotificationCompat.CATEGORY_MESSAGE, msg);
        linkedHashMap.put("code", String.valueOf(i11));
        linkedHashMap.put(TrackingKey.TRIGGER_ID, String.valueOf(f60001b));
        C14450a.f50860a.m65138a("sr_dialog_sr", linkedHashMap);
        f60001b = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m78056d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EventConstants.KEY_ACTION, "trigger");
        String strM78048a = C18515d.f59985a.m78048a(10);
        f60001b = strM78048a;
        linkedHashMap.put(TrackingKey.TRIGGER_ID, String.valueOf(strM78048a));
        C14450a.f50860a.m65138a("sr_dialog_sr", linkedHashMap);
    }

    /* JADX INFO: renamed from: e */
    public final void m78057e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EventConstants.KEY_ACTION, NativeComponentConstants.KEY_COMPONENT_RESULT_SUCCESS);
        linkedHashMap.put(TrackingKey.TRIGGER_ID, String.valueOf(f60001b));
        C14450a.f50860a.m65138a("sr_dialog_sr", linkedHashMap);
        f60001b = null;
    }

    /* JADX INFO: renamed from: f */
    public final void m78058f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EventConstants.KEY_ACTION, "strategy");
        linkedHashMap.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, "two");
        linkedHashMap.put("model", AbstractC5792k.m27416a());
        C14450a.f50860a.m65139b("sr_dialog_sr", MapsKt.m97573h());
    }
}
