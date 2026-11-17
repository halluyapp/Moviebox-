package com.transsion.rewardscenter.utils;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.rewardscenter.utils.q */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC18022q {
    /* JADX INFO: renamed from: a */
    public static final void m76644a(String module, Map map) {
        Intrinsics.m97802h(module, "module");
        HashMap map2 = new HashMap();
        map2.put("module_name", module);
        if (map != null) {
            map2.putAll(map);
        }
        C24662i.f75350a.m96881p("rewards_center", map2);
    }

    /* JADX INFO: renamed from: b */
    public static final void m76645b(String module, Map map) {
        Intrinsics.m97802h(module, "module");
        HashMap map2 = new HashMap();
        map2.put("module_name", module);
        if (map != null) {
            map2.putAll(map);
        }
        C24662i.f75350a.m96872D("rewards_center", map2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m76646c(String str, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        m76645b(str, map);
    }
}
