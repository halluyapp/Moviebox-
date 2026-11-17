package com.transsion.search_pugc.fragment.hot.adapter;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.search_pugc.fragment.hot.adapter.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C18602a {

    /* JADX INFO: renamed from: a */
    private final int f60142a;

    /* JADX INFO: renamed from: b */
    private final String f60143b;

    public C18602a(int i11, String strVal) {
        Intrinsics.m97802h(strVal, "strVal");
        this.f60142a = i11;
        this.f60143b = strVal;
    }

    /* JADX INFO: renamed from: a */
    public final String m78323a() {
        return this.f60143b;
    }

    /* JADX INFO: renamed from: b */
    public final int m78324b() {
        return this.f60142a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18602a)) {
            return false;
        }
        C18602a c18602a = (C18602a) obj;
        return this.f60142a == c18602a.f60142a && Intrinsics.m97797c(this.f60143b, c18602a.f60143b);
    }

    public int hashCode() {
        return (this.f60142a * 31) + this.f60143b.hashCode();
    }

    public String toString() {
        return "HistoryVal(type=" + this.f60142a + ", strVal=" + this.f60143b + ")";
    }
}
