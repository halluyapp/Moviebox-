package com.transsion.home.view;

import com.transsion.baselib.report.launch.C14496b;
import java.util.HashMap;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.home.view.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C15537g {

    /* JADX INFO: renamed from: b */
    private static boolean f53622b;

    /* JADX INFO: renamed from: a */
    public static final C15537g f53621a = new C15537g();

    /* JADX INFO: renamed from: c */
    public static final int f53623c = 8;

    private C15537g() {
    }

    /* JADX INFO: renamed from: c */
    private final void m68891c() {
        HashMap map = new HashMap();
        map.put("click", "search");
        C24662i.f75350a.m96881p("guide", map);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m68892a() {
        return f53622b;
    }

    /* JADX INFO: renamed from: b */
    public final void m68893b(boolean z11) {
        C14496b.f50966a.m65344b().putBoolean("search_guide", true);
        if (z11) {
            m68891c();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m68894d() {
        f53622b = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m68895e(boolean z11) {
        f53622b = z11;
    }
}
