package com.transsion.shorttv_pugc.utils;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.transsion.shorttv_pugc.bean.Subject;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.utils.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C19523b {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m81323b(C19523b c19523b, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str4 = "minitv_download";
        }
        c19523b.m81327a(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m81324d(C19523b c19523b, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = "minitv_download";
        }
        c19523b.m81328c(str, str2, str3);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m81325g(C19523b c19523b, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "minitv_download";
        }
        c19523b.m81330f(str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m81326i(C19523b c19523b, Subject subject, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str3 = "minitv_download";
        }
        c19523b.m81331h(subject, str, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public final void m81327a(String str, String optType, String position, String pageName) {
        Intrinsics.m97802h(optType, "optType");
        Intrinsics.m97802h(position, "position");
        Intrinsics.m97802h(pageName, "pageName");
        HashMap map = new HashMap();
        map.put("module_name", "watch_ad");
        if (str == null) {
            str = "";
        }
        map.put("subject_id", str);
        map.put("opt_type", optType);
        map.put(RequestParameters.POSITION, position);
        C24662i.f75350a.m96881p(pageName, map);
    }

    /* JADX INFO: renamed from: c */
    public final void m81328c(String str, String dialogName, String pageName) {
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

    /* JADX INFO: renamed from: e */
    public final void m81329e(String str, String optType, boolean z11, String pageName) {
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

    /* JADX INFO: renamed from: f */
    public final void m81330f(String str, String pageName) {
        Intrinsics.m97802h(pageName, "pageName");
        HashMap map = new HashMap();
        map.put("module_name", "share");
        if (str == null) {
            str = "";
        }
        map.put("subject_id", str);
        C24662i.f75350a.m96881p(pageName, map);
    }

    /* JADX INFO: renamed from: h */
    public final void m81331h(Subject subject, String unlockType, String unlockEp, String pageName) {
        String subjectId;
        String ops;
        Intrinsics.m97802h(unlockType, "unlockType");
        Intrinsics.m97802h(unlockEp, "unlockEp");
        Intrinsics.m97802h(pageName, "pageName");
        HashMap map = new HashMap();
        if (subject == null || (subjectId = subject.getSubjectId()) == null) {
            subjectId = "";
        }
        map.put("subject_id", subjectId);
        map.put("unlock_ep", unlockEp);
        map.put("unlock_type", unlockType);
        if (subject != null && (ops = subject.getOps()) != null && ops.length() > 0) {
            String ops2 = subject.getOps();
            map.put("ops", ops2 != null ? ops2 : "");
        }
        C24662i.f75350a.m96884s(pageName, "minitv_unlock", map);
    }
}
