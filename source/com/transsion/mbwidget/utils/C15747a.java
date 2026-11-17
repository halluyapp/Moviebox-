package com.transsion.mbwidget.utils;

import android.content.Intent;
import com.cloud.tmc.integration.event.EventConstants;
import com.transsion.mbwidget.data.WidgetDataManager;
import com.transsion.moviedetailapi.bean.Subject;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.mbwidget.utils.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C15747a {

    /* JADX INFO: renamed from: a */
    public static final C15747a f54125a = new C15747a();

    private C15747a() {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m69742e(C15747a c15747a, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        c15747a.m69748d(str, str2);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m69743j(C15747a c15747a, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        c15747a.m69752i(str, str2, str3);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m69744l(C15747a c15747a, String str, boolean z11, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        c15747a.m69753k(str, z11, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m69745a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EventConstants.KEY_ACTION, "exposure");
        C24662i.f75350a.m96872D("add_widget_dialog", linkedHashMap);
    }

    /* JADX INFO: renamed from: b */
    public final void m69746b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EventConstants.KEY_ACTION, "click");
        C24662i.f75350a.m96881p("add_widget_dialog", linkedHashMap);
    }

    /* JADX INFO: renamed from: c */
    public final void m69747c(Intent intent) {
        Intrinsics.m97802h(intent, "intent");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String stringExtra = intent.getStringExtra("key_subject_id_widget");
        String stringExtra2 = intent.getStringExtra("key_module_name");
        linkedHashMap.put("widget_name", "history_desk_widget");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        linkedHashMap.put("module_name", stringExtra2);
        if (stringExtra == null) {
            stringExtra = "";
        }
        linkedHashMap.put("subject_id", stringExtra);
        linkedHashMap.put(EventConstants.KEY_ACTION, "click");
        C24662i.f75350a.m96884s("history_desk_widget", "desk_widget", linkedHashMap);
    }

    /* JADX INFO: renamed from: d */
    public final void m69748d(String moduleName, String str) {
        Intrinsics.m97802h(moduleName, "moduleName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("widget_name", "history_desk_widget");
        linkedHashMap.put("module_name", moduleName);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("subject_id", str);
        linkedHashMap.put(EventConstants.KEY_ACTION, "exposure");
        C24662i.f75350a.m96884s("history_desk_widget", "desk_widget", linkedHashMap);
    }

    /* JADX INFO: renamed from: f */
    public final void m69749f(Intent intent) {
        Intrinsics.m97802h(intent, "intent");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("widget_name", "sport_desk_widget");
        String stringExtra = intent.getStringExtra("key_module_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        linkedHashMap.put("module_name", stringExtra);
        String stringExtra2 = intent.getStringExtra("key_match_id_widget");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        linkedHashMap.put("id", stringExtra2);
        String stringExtra3 = intent.getStringExtra("key_deeplink_widget");
        linkedHashMap.put("deeplink", stringExtra3 != null ? stringExtra3 : "");
        linkedHashMap.put(EventConstants.KEY_ACTION, "click");
        C24662i.f75350a.m96884s("sport_desk_widget", "desk_widget", linkedHashMap);
    }

    /* JADX INFO: renamed from: g */
    public final void m69750g(String moduleName, String str, String str2) {
        Intrinsics.m97802h(moduleName, "moduleName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("widget_name", "sport_desk_widget");
        linkedHashMap.put("module_name", moduleName);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("id", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("deeplink", str2);
        linkedHashMap.put(EventConstants.KEY_ACTION, "exposure");
        C24662i.f75350a.m96884s("sport_desk_widget", "desk_widget", linkedHashMap);
    }

    /* JADX INFO: renamed from: h */
    public final void m69751h(Intent intent) {
        String ops;
        Intrinsics.m97802h(intent, "intent");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String stringExtra = intent.getStringExtra("key_subject_id_widget");
        String stringExtra2 = intent.getStringExtra("key_module_name");
        Subject subjectM69681h = WidgetDataManager.f54097a.m69681h(stringExtra);
        linkedHashMap.put("widget_name", "hot_desk_widget");
        String str = "";
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        linkedHashMap.put("module_name", stringExtra2);
        if (stringExtra == null) {
            stringExtra = "";
        }
        linkedHashMap.put("subject_id", stringExtra);
        if (subjectM69681h != null && (ops = subjectM69681h.getOps()) != null) {
            str = ops;
        }
        linkedHashMap.put("ops", str);
        linkedHashMap.put(EventConstants.KEY_ACTION, "click");
        C24662i.f75350a.m96884s("hot_desk_widget", "desk_widget", linkedHashMap);
    }

    /* JADX INFO: renamed from: i */
    public final void m69752i(String moduleName, String str, String str2) {
        Intrinsics.m97802h(moduleName, "moduleName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("widget_name", "hot_desk_widget");
        linkedHashMap.put("module_name", moduleName);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("subject_id", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("ops", str2);
        linkedHashMap.put(EventConstants.KEY_ACTION, "exposure");
        C24662i.f75350a.m96884s("hot_desk_widget", "desk_widget", linkedHashMap);
    }

    /* JADX INFO: renamed from: k */
    public final void m69753k(String widgetName, boolean z11, String str) {
        Intrinsics.m97802h(widgetName, "widgetName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("widget_name", widgetName);
        if (str == null) {
            str = z11 ? "add" : "remove";
        }
        linkedHashMap.put(EventConstants.KEY_ACTION, str);
        C24662i.f75350a.m96884s(widgetName, "desk_widget", linkedHashMap);
    }
}
