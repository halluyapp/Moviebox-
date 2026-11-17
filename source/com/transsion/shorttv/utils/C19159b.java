package com.transsion.shorttv.utils;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.shorttv.utils.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C19159b {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m80223b(C19159b c19159b, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = "minitv_download";
        }
        c19159b.m80225a(str, str2, str3);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m80224e(C19159b c19159b, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "minitv_download";
        }
        c19159b.m80227d(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m80225a(String str, String dialogName, String pageName) {
        Intrinsics.m97802h(dialogName, "dialogName");
        Intrinsics.m97802h(pageName, "pageName");
        HashMap map = new HashMap();
        if (str == null) {
            str = "";
        }
        map.put("subject_id", str);
        map.put("dialog_name", dialogName);
        C24662i.f75350a.m96884s(pageName, "dialog_show", map);
    }

    /* JADX INFO: renamed from: c */
    public final void m80226c(String str, String optType, boolean z11, String pageName) {
        Intrinsics.m97802h(optType, "optType");
        Intrinsics.m97802h(pageName, "pageName");
        HashMap map = new HashMap();
        map.put("module_name", "favorite");
        if (str == null) {
            str = "";
        }
        map.put("subject_id", str);
        map.put("opt_type", optType);
        map.put("favorite", String.valueOf(!z11));
        C24662i.f75350a.m96881p(pageName, map);
    }

    /* JADX INFO: renamed from: d */
    public final void m80227d(String str, String pageName) {
        Intrinsics.m97802h(pageName, "pageName");
        HashMap map = new HashMap();
        map.put("module_name", "share");
        if (str == null) {
            str = "";
        }
        map.put("subject_id", str);
        C24662i.f75350a.m96881p(pageName, map);
    }
}
