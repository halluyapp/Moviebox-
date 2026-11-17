package com.transsion.search.fragment.hot.adapter;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.search.fragment.hot.adapter.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C18448a {

    /* JADX INFO: renamed from: a */
    private final int f59811a;

    /* JADX INFO: renamed from: b */
    private final String f59812b;

    public C18448a(int i11, String strVal) {
        Intrinsics.m97802h(strVal, "strVal");
        this.f59811a = i11;
        this.f59812b = strVal;
    }

    /* JADX INFO: renamed from: a */
    public final String m77808a() {
        return this.f59812b;
    }

    /* JADX INFO: renamed from: b */
    public final int m77809b() {
        return this.f59811a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18448a)) {
            return false;
        }
        C18448a c18448a = (C18448a) obj;
        return this.f59811a == c18448a.f59811a && Intrinsics.m97797c(this.f59812b, c18448a.f59812b);
    }

    public int hashCode() {
        return (this.f59811a * 31) + this.f59812b.hashCode();
    }

    public String toString() {
        return "HistoryVal(type=" + this.f59811a + ", strVal=" + this.f59812b + ")";
    }
}
