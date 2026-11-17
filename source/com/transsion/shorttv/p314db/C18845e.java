package com.transsion.shorttv.p314db;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.transsion.shorttv.db.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C18845e {

    /* JADX INFO: renamed from: a */
    private String f60852a;

    /* JADX INFO: renamed from: b */
    private String f60853b;

    /* JADX WARN: Multi-variable type inference failed */
    public C18845e() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public C18845e(String subjectId, String unlockedEps) {
        Intrinsics.m97802h(subjectId, "subjectId");
        Intrinsics.m97802h(unlockedEps, "unlockedEps");
        this.f60852a = subjectId;
        this.f60853b = unlockedEps;
    }

    public /* synthetic */ C18845e(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2);
    }

    /* JADX INFO: renamed from: a */
    public final String m79369a() {
        return this.f60852a;
    }

    /* JADX INFO: renamed from: b */
    public final String m79370b() {
        return this.f60853b;
    }

    /* JADX INFO: renamed from: c */
    public final Set m79371c() {
        if (StringsKt.m98160q0(this.f60853b)) {
            return new LinkedHashSet();
        }
        List listS0 = StringsKt.m98117S0(this.f60853b, new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            Integer numV = StringsKt.m98216v(StringsKt.m98155n1((String) it.next()).toString());
            if (numV != null) {
                arrayList.add(numV);
            }
        }
        return CollectionsKt.m97344V0(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18845e)) {
            return false;
        }
        C18845e c18845e = (C18845e) obj;
        return Intrinsics.m97797c(this.f60852a, c18845e.f60852a) && Intrinsics.m97797c(this.f60853b, c18845e.f60853b);
    }

    public int hashCode() {
        return (this.f60852a.hashCode() * 31) + this.f60853b.hashCode();
    }

    public String toString() {
        return "ShortTvAdUnlockStateBean(subjectId=" + this.f60852a + ", unlockedEps=" + this.f60853b + ")";
    }
}
