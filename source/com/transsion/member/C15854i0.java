package com.transsion.member;

import androidx.compose.foundation.AbstractC0690e;
import com.transsion.member.bean.request.MemberPromoCodeRes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.member.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15854i0 {

    /* JADX INFO: renamed from: a */
    private final boolean f54344a;

    /* JADX INFO: renamed from: b */
    private final String f54345b;

    /* JADX INFO: renamed from: c */
    private final String f54346c;

    /* JADX INFO: renamed from: d */
    private final MemberPromoCodeRes f54347d;

    public C15854i0(boolean z11, String str, String str2, MemberPromoCodeRes memberPromoCodeRes) {
        this.f54344a = z11;
        this.f54345b = str;
        this.f54346c = str2;
        this.f54347d = memberPromoCodeRes;
    }

    /* JADX INFO: renamed from: a */
    public final String m70087a() {
        return this.f54345b;
    }

    /* JADX INFO: renamed from: b */
    public final MemberPromoCodeRes m70088b() {
        return this.f54347d;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m70089c() {
        return this.f54344a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15854i0)) {
            return false;
        }
        C15854i0 c15854i0 = (C15854i0) obj;
        return this.f54344a == c15854i0.f54344a && Intrinsics.m97797c(this.f54345b, c15854i0.f54345b) && Intrinsics.m97797c(this.f54346c, c15854i0.f54346c) && Intrinsics.m97797c(this.f54347d, c15854i0.f54347d);
    }

    public int hashCode() {
        int iM3114a = AbstractC0690e.m3114a(this.f54344a) * 31;
        String str = this.f54345b;
        int iHashCode = (iM3114a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f54346c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        MemberPromoCodeRes memberPromoCodeRes = this.f54347d;
        return iHashCode2 + (memberPromoCodeRes != null ? memberPromoCodeRes.hashCode() : 0);
    }

    public String toString() {
        return "PromoCodeRes(res=" + this.f54344a + ", code=" + this.f54345b + ", message=" + this.f54346c + ", data=" + this.f54347d + ")";
    }
}
