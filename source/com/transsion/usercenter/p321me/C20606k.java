package com.transsion.usercenter.p321me;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.usercenter.me.k */
/* JADX INFO: loaded from: classes7.dex */
public final class C20606k {

    /* JADX INFO: renamed from: a */
    public static final C20606k f65059a = new C20606k();

    /* JADX INFO: renamed from: b */
    private static String f65060b;

    private C20606k() {
    }

    /* JADX INFO: renamed from: a */
    public final void m85070a(String moduleName) {
        Intrinsics.m97802h(moduleName, "moduleName");
        HashMap map = new HashMap();
        String str = f65060b;
        if (str == null) {
            str = "";
        }
        map.put("user_id", str);
        map.put("user_status", "me");
        map.put("module_name", moduleName);
        C24662i.f75350a.m96872D("profiledetail", map);
    }

    /* JADX INFO: renamed from: b */
    public final void m85071b(String moduleName) {
        Intrinsics.m97802h(moduleName, "moduleName");
        HashMap map = new HashMap();
        String str = f65060b;
        if (str == null) {
            str = "";
        }
        map.put("user_id", str);
        map.put("user_status", "me");
        map.put("module_name", moduleName);
        C24662i.f75350a.m96881p("profiledetail", map);
    }

    /* JADX INFO: renamed from: c */
    public final void m85072c(String moduleName, int i11) {
        Intrinsics.m97802h(moduleName, "moduleName");
        HashMap map = new HashMap();
        String str = f65060b;
        if (str == null) {
            str = "";
        }
        map.put("user_id", str);
        map.put("user_status", "me");
        map.put("module_name", moduleName);
        map.put(RequestParameters.POSITION, String.valueOf(i11));
        C24662i.f75350a.m96881p("profiledetail", map);
    }

    /* JADX INFO: renamed from: d */
    public final void m85073d(String str) {
        f65060b = str;
    }
}
