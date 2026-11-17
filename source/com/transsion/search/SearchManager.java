package com.transsion.search;

import android.text.TextUtils;
import com.blankj.utilcode.util.AbstractC5796o;
import com.google.gson.reflect.TypeToken;
import com.tencent.mmkv.MMKV;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class SearchManager {

    /* JADX INFO: renamed from: f */
    public static final C18353a f59668f = new C18353a(null);

    /* JADX INFO: renamed from: g */
    private static final Lazy f59669g = LazyKt.m97096a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: com.transsion.search.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchManager.m77595e();
        }
    });

    /* JADX INFO: renamed from: d */
    private int f59673d;

    /* JADX INFO: renamed from: b */
    private final String f59671b = "kv_search_group";

    /* JADX INFO: renamed from: c */
    private final String f59672c = "kv_search_work";

    /* JADX INFO: renamed from: e */
    private List f59674e = new ArrayList();

    /* JADX INFO: renamed from: a */
    private MMKV f59670a = MMKV.m61551I("kv_search_list");

    /* JADX INFO: renamed from: com.transsion.search.SearchManager$a */
    public static final class C18353a {
        private C18353a() {
        }

        public /* synthetic */ C18353a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SearchManager m77605a() {
            return (SearchManager) SearchManager.f59669g.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final SearchManager m77595e() {
        return new SearchManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m77597h(SearchManager searchManager) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(searchManager.f59674e);
        C26866a.a.m104898f(C26866a.f81698a, "VS_SM", "add" + arrayList, false, 4, null);
        int i11 = searchManager.f59673d;
        if (i11 != 1) {
            if (i11 == 2) {
                MMKV mmkv = searchManager.f59670a;
                if (mmkv != null) {
                    mmkv.putString(searchManager.f59671b, AbstractC5796o.m27447j(arrayList));
                    return;
                }
                return;
            }
            if (i11 != 3) {
                return;
            }
        }
        MMKV mmkv2 = searchManager.f59670a;
        if (mmkv2 != null) {
            mmkv2.putString(searchManager.f59672c, AbstractC5796o.m27447j(arrayList));
        }
    }

    /* JADX INFO: renamed from: i */
    private final void m77598i(Runnable runnable) {
        C18509h.f59954b.m77995a().m77994d(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m77599k(SearchManager searchManager) {
        searchManager.f59674e.clear();
        int i11 = searchManager.f59673d;
        if (i11 != 1) {
            if (i11 == 2) {
                MMKV mmkv = searchManager.f59670a;
                if (mmkv != null) {
                    mmkv.putString(searchManager.f59671b, "");
                    return;
                }
                return;
            }
            if (i11 != 3) {
                return;
            }
        }
        MMKV mmkv2 = searchManager.f59670a;
        if (mmkv2 != null) {
            mmkv2.putString(searchManager.f59672c, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m77600n(SearchManager searchManager, InterfaceC18354a interfaceC18354a) {
        interfaceC18354a.mo77606a(searchManager.m77603l());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX INFO: renamed from: g */
    public final void m77601g(String keyword) {
        Intrinsics.m97802h(keyword, "keyword");
        if (this.f59674e.contains(keyword)) {
            this.f59674e.remove(keyword);
            this.f59674e.add(keyword);
        } else {
            int i11 = this.f59673d;
            if (i11 == 1) {
                if (this.f59674e.size() >= 30) {
                    this.f59674e.remove(0);
                }
            } else if (i11 != 2) {
                if (i11 == 3) {
                    if (this.f59674e.size() >= 30) {
                        this.f59674e.remove(0);
                    }
                }
            } else if (this.f59674e.size() >= 30) {
                this.f59674e.remove(0);
            }
            this.f59674e.add(keyword);
        }
        if (this.f59674e.isEmpty()) {
            return;
        }
        m77598i(new Runnable() { // from class: com.transsion.search.b
            @Override // java.lang.Runnable
            public final void run() {
                SearchManager.m77597h(this.f59711a);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m77602j() {
        m77598i(new Runnable() { // from class: com.transsion.search.e
            @Override // java.lang.Runnable
            public final void run() {
                SearchManager.m77599k(this.f59721a);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final List m77603l() {
        List arrayList;
        String string = null;
        if (this.f59673d == 2) {
            MMKV mmkv = this.f59670a;
            if (mmkv != null) {
                string = mmkv.getString(this.f59671b, "");
            }
        } else {
            MMKV mmkv2 = this.f59670a;
            if (mmkv2 != null) {
                string = mmkv2.getString(this.f59672c, "");
            }
        }
        C26866a.a.m104898f(C26866a.f81698a, "VS_SM", "findSearch" + string, false, 4, null);
        if (TextUtils.isEmpty(string) || TextUtils.equals(string, "{}")) {
            arrayList = new ArrayList();
        } else {
            Object objM27442e = AbstractC5796o.m27442e(string, new TypeToken<List<String>>() { // from class: com.transsion.search.SearchManager$findSearch$list$type$1
            }.getType());
            Intrinsics.m97799e(objM27442e);
            arrayList = (List) objM27442e;
        }
        arrayList.isEmpty();
        this.f59674e = arrayList;
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public final void m77604m(int i11, final InterfaceC18354a callback) {
        Intrinsics.m97802h(callback, "callback");
        this.f59673d = i11;
        m77598i(new Runnable() { // from class: com.transsion.search.c
            @Override // java.lang.Runnable
            public final void run() {
                SearchManager.m77600n(this.f59714a, callback);
            }
        });
    }
}
