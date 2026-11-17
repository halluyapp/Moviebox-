package com.transsion.search_pugc;

import android.text.TextUtils;
import ck.C5118o;
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
    public static final C18542a f60047f = new C18542a(null);

    /* JADX INFO: renamed from: g */
    private static final Lazy f60048g = LazyKt.m97096a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: com.transsion.search_pugc.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchManager.m78149e();
        }
    });

    /* JADX INFO: renamed from: d */
    private int f60052d;

    /* JADX INFO: renamed from: b */
    private final String f60050b = "kv_search_group";

    /* JADX INFO: renamed from: c */
    private final String f60051c = "kv_search_work";

    /* JADX INFO: renamed from: e */
    private List f60053e = new ArrayList();

    /* JADX INFO: renamed from: a */
    private MMKV f60049a = MMKV.m61551I("kv_search_list");

    /* JADX INFO: renamed from: com.transsion.search_pugc.SearchManager$a */
    public static final class C18542a {
        private C18542a() {
        }

        public /* synthetic */ C18542a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SearchManager m78162a() {
            return (SearchManager) SearchManager.f60048g.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final SearchManager m78149e() {
        return new SearchManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m78151h(SearchManager searchManager) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(searchManager.f60053e);
        C26866a.a.m104898f(C26866a.f81698a, "VS_SM", "add" + arrayList, false, 4, null);
        int i11 = searchManager.f60052d;
        if (i11 != 1) {
            if (i11 == 2) {
                MMKV mmkv = searchManager.f60049a;
                if (mmkv != null) {
                    mmkv.putString(searchManager.m78155n(), AbstractC5796o.m27447j(arrayList));
                    return;
                }
                return;
            }
            if (i11 != 3) {
                return;
            }
        }
        MMKV mmkv2 = searchManager.f60049a;
        if (mmkv2 != null) {
            mmkv2.putString(searchManager.m78156o(), AbstractC5796o.m27447j(arrayList));
        }
    }

    /* JADX INFO: renamed from: i */
    private final void m78152i(Runnable runnable) {
        C18673j.f60293b.m78528a().m78527d(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m78153k(SearchManager searchManager) {
        searchManager.f60053e.clear();
        int i11 = searchManager.f60052d;
        if (i11 != 1) {
            if (i11 == 2) {
                MMKV mmkv = searchManager.f60049a;
                if (mmkv != null) {
                    mmkv.putString(searchManager.m78155n(), "");
                    return;
                }
                return;
            }
            if (i11 != 3) {
                return;
            }
        }
        MMKV mmkv2 = searchManager.f60049a;
        if (mmkv2 != null) {
            mmkv2.putString(searchManager.m78156o(), "");
        }
    }

    /* JADX INFO: renamed from: m */
    private final String m78154m() {
        String strM23944d = C5118o.f17608a.m23944d();
        return strM23944d == null ? "" : strM23944d;
    }

    /* JADX INFO: renamed from: n */
    private final String m78155n() {
        return m78154m().length() == 0 ? this.f60050b : "kv_kids_search_group";
    }

    /* JADX INFO: renamed from: o */
    private final String m78156o() {
        return m78154m().length() == 0 ? this.f60051c : "kv_kids_search_work";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m78157q(SearchManager searchManager, InterfaceC18543a interfaceC18543a) {
        interfaceC18543a.mo78163a(searchManager.m78160l());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX INFO: renamed from: g */
    public final void m78158g(String keyword) {
        Intrinsics.m97802h(keyword, "keyword");
        if (this.f60053e.contains(keyword)) {
            this.f60053e.remove(keyword);
            this.f60053e.add(keyword);
        } else {
            int i11 = this.f60052d;
            if (i11 == 1) {
                if (this.f60053e.size() >= 30) {
                    this.f60053e.remove(0);
                }
            } else if (i11 != 2) {
                if (i11 == 3) {
                    if (this.f60053e.size() >= 30) {
                        this.f60053e.remove(0);
                    }
                }
            } else if (this.f60053e.size() >= 30) {
                this.f60053e.remove(0);
            }
            this.f60053e.add(keyword);
        }
        if (this.f60053e.isEmpty()) {
            return;
        }
        m78152i(new Runnable() { // from class: com.transsion.search_pugc.c
            @Override // java.lang.Runnable
            public final void run() {
                SearchManager.m78151h(this.f60090a);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m78159j() {
        m78152i(new Runnable() { // from class: com.transsion.search_pugc.e
            @Override // java.lang.Runnable
            public final void run() {
                SearchManager.m78153k(this.f60097a);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final List m78160l() {
        List arrayList;
        String string = null;
        if (this.f60052d == 2) {
            MMKV mmkv = this.f60049a;
            if (mmkv != null) {
                string = mmkv.getString(m78155n(), "");
            }
        } else {
            MMKV mmkv2 = this.f60049a;
            if (mmkv2 != null) {
                string = mmkv2.getString(m78156o(), "");
            }
        }
        C26866a.a.m104898f(C26866a.f81698a, "VS_SM", "findSearch" + string, false, 4, null);
        if (TextUtils.isEmpty(string) || TextUtils.equals(string, "{}")) {
            arrayList = new ArrayList();
        } else {
            Object objM27442e = AbstractC5796o.m27442e(string, new TypeToken<List<String>>() { // from class: com.transsion.search_pugc.SearchManager$findSearch$list$type$1
            }.getType());
            Intrinsics.m97799e(objM27442e);
            arrayList = (List) objM27442e;
        }
        arrayList.isEmpty();
        this.f60053e = arrayList;
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public final void m78161p(int i11, final InterfaceC18543a callback) {
        Intrinsics.m97802h(callback, "callback");
        this.f60052d = i11;
        m78152i(new Runnable() { // from class: com.transsion.search_pugc.b
            @Override // java.lang.Runnable
            public final void run() {
                SearchManager.m78157q(this.f60086a, callback);
            }
        });
    }
}
