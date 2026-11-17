package com.transsion.mbwidget.data;

import com.transsion.moviedetailapi.bean.Subject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.mbwidget.data.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C15725b {

    /* JADX INFO: renamed from: a */
    private final int f54108a;

    /* JADX INFO: renamed from: b */
    private final Subject f54109b;

    public C15725b(int i11, Subject subject) {
        Intrinsics.m97802h(subject, "subject");
        this.f54108a = i11;
        this.f54109b = subject;
    }

    /* JADX INFO: renamed from: a */
    public final int m69697a() {
        return this.f54108a;
    }

    /* JADX INFO: renamed from: b */
    public final Subject m69698b() {
        return this.f54109b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15725b)) {
            return false;
        }
        C15725b c15725b = (C15725b) obj;
        return this.f54108a == c15725b.f54108a && Intrinsics.m97797c(this.f54109b, c15725b.f54109b);
    }

    public int hashCode() {
        return (this.f54108a * 31) + this.f54109b.hashCode();
    }

    public String toString() {
        return "ShowItem(position=" + this.f54108a + ", subject=" + this.f54109b + ")";
    }
}
