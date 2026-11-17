package com.transsion.subtitle.fragment;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.subtitle.fragment.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C19695i {

    /* JADX INFO: renamed from: a */
    private final String f62911a;

    /* JADX INFO: renamed from: b */
    private final int f62912b;

    /* JADX INFO: renamed from: c */
    private final int f62913c;

    public C19695i(String name, int i11, int i12) {
        Intrinsics.m97802h(name, "name");
        this.f62911a = name;
        this.f62912b = i11;
        this.f62913c = i12;
    }

    /* JADX INFO: renamed from: a */
    public final int m82143a() {
        return this.f62913c;
    }

    /* JADX INFO: renamed from: b */
    public final String m82144b() {
        return this.f62911a;
    }

    /* JADX INFO: renamed from: c */
    public final int m82145c() {
        return this.f62912b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19695i)) {
            return false;
        }
        C19695i c19695i = (C19695i) obj;
        return Intrinsics.m97797c(this.f62911a, c19695i.f62911a) && this.f62912b == c19695i.f62912b && this.f62913c == c19695i.f62913c;
    }

    public int hashCode() {
        return (((this.f62911a.hashCode() * 31) + this.f62912b) * 31) + this.f62913c;
    }

    public String toString() {
        return "SubtitleSearchKeyword(name=" + this.f62911a + ", season=" + this.f62912b + ", episode=" + this.f62913c + ")";
    }
}
