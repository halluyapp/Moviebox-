package com.transsion.player.longvideo.helper;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.tools.zip.UnixStat;

/* JADX INFO: renamed from: com.transsion.player.longvideo.helper.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C16439b {

    /* JADX INFO: renamed from: a */
    private final String f55503a;

    /* JADX INFO: renamed from: b */
    private final String f55504b;

    /* JADX INFO: renamed from: c */
    private final String f55505c;

    /* JADX INFO: renamed from: d */
    private final String f55506d;

    /* JADX INFO: renamed from: e */
    private final String f55507e;

    /* JADX INFO: renamed from: f */
    private final String f55508f;

    /* JADX INFO: renamed from: g */
    private final String f55509g;

    /* JADX INFO: renamed from: h */
    private final String f55510h;

    /* JADX INFO: renamed from: i */
    private final int f55511i;

    /* JADX INFO: renamed from: j */
    private final int f55512j;

    /* JADX INFO: renamed from: k */
    private final int f55513k;

    /* JADX INFO: renamed from: l */
    private final int f55514l;

    public C16439b() {
        this(null, null, null, null, null, null, null, null, 0, 0, 0, 0, UnixStat.PERM_MASK, null);
    }

    public C16439b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, int i12, int i13, int i14) {
        this.f55503a = str;
        this.f55504b = str2;
        this.f55505c = str3;
        this.f55506d = str4;
        this.f55507e = str5;
        this.f55508f = str6;
        this.f55509g = str7;
        this.f55510h = str8;
        this.f55511i = i11;
        this.f55512j = i12;
        this.f55513k = i13;
        this.f55514l = i14;
    }

    public /* synthetic */ C16439b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : str3, (i15 & 8) != 0 ? null : str4, (i15 & 16) != 0 ? null : str5, (i15 & 32) != 0 ? null : str6, (i15 & 64) != 0 ? null : str7, (i15 & 128) == 0 ? str8 : null, (i15 & 256) != 0 ? 3 : i11, (i15 & 512) == 0 ? i12 : 3, (i15 & 1024) != 0 ? 24 : i13, (i15 & 2048) != 0 ? 10 : i14);
    }

    /* JADX INFO: renamed from: a */
    public final String m71785a() {
        return this.f55508f;
    }

    /* JADX INFO: renamed from: b */
    public final String m71786b() {
        return this.f55509g;
    }

    /* JADX INFO: renamed from: c */
    public final int m71787c() {
        return this.f55513k;
    }

    /* JADX INFO: renamed from: d */
    public final int m71788d() {
        return this.f55512j;
    }

    /* JADX INFO: renamed from: e */
    public final String m71789e() {
        return this.f55505c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16439b)) {
            return false;
        }
        C16439b c16439b = (C16439b) obj;
        return Intrinsics.m97797c(this.f55503a, c16439b.f55503a) && Intrinsics.m97797c(this.f55504b, c16439b.f55504b) && Intrinsics.m97797c(this.f55505c, c16439b.f55505c) && Intrinsics.m97797c(this.f55506d, c16439b.f55506d) && Intrinsics.m97797c(this.f55507e, c16439b.f55507e) && Intrinsics.m97797c(this.f55508f, c16439b.f55508f) && Intrinsics.m97797c(this.f55509g, c16439b.f55509g) && Intrinsics.m97797c(this.f55510h, c16439b.f55510h) && this.f55511i == c16439b.f55511i && this.f55512j == c16439b.f55512j && this.f55513k == c16439b.f55513k && this.f55514l == c16439b.f55514l;
    }

    /* JADX INFO: renamed from: f */
    public final String m71790f() {
        return this.f55504b;
    }

    /* JADX INFO: renamed from: g */
    public final String m71791g() {
        return this.f55503a;
    }

    /* JADX INFO: renamed from: h */
    public final String m71792h() {
        return this.f55510h;
    }

    public int hashCode() {
        String str = this.f55503a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f55504b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f55505c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f55506d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f55507e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f55508f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f55509g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f55510h;
        return ((((((((iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.f55511i) * 31) + this.f55512j) * 31) + this.f55513k) * 31) + this.f55514l;
    }

    /* JADX INFO: renamed from: i */
    public final int m71793i() {
        return this.f55511i;
    }

    /* JADX INFO: renamed from: j */
    public final int m71794j() {
        return this.f55514l;
    }

    /* JADX INFO: renamed from: k */
    public final String m71795k() {
        return this.f55507e;
    }

    /* JADX INFO: renamed from: l */
    public final String m71796l() {
        return this.f55506d;
    }

    public String toString() {
        return "DataOperator(layoutTitle=" + this.f55503a + ", layoutTips=" + this.f55504b + ", layoutButton=" + this.f55505c + ", title=" + this.f55506d + ", tips=" + this.f55507e + ", button=" + this.f55508f + ", buttonIcon=" + this.f55509g + ", link=" + this.f55510h + ", normalDelay=" + this.f55511i + ", fullscreenDelay=" + this.f55512j + ", displayInterval=" + this.f55513k + ", showDuration=" + this.f55514l + ")";
    }
}
