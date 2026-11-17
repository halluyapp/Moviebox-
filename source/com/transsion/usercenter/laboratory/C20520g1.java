package com.transsion.usercenter.laboratory;

import androidx.compose.foundation.AbstractC0690e;
import com.transsion.p285ad.p286db.mcc.LocalMcc;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.usercenter.laboratory.g1 */
/* JADX INFO: loaded from: classes7.dex */
public final class C20520g1 {

    /* JADX INFO: renamed from: a */
    private boolean f64914a;

    /* JADX INFO: renamed from: b */
    private final LocalMcc f64915b;

    public C20520g1(boolean z11, LocalMcc localMcc) {
        Intrinsics.m97802h(localMcc, "localMcc");
        this.f64914a = z11;
        this.f64915b = localMcc;
    }

    /* JADX INFO: renamed from: a */
    public final LocalMcc m84929a() {
        return this.f64915b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m84930b() {
        return this.f64914a;
    }

    /* JADX INFO: renamed from: c */
    public final void m84931c(boolean z11) {
        this.f64914a = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20520g1)) {
            return false;
        }
        C20520g1 c20520g1 = (C20520g1) obj;
        return this.f64914a == c20520g1.f64914a && Intrinsics.m97797c(this.f64915b, c20520g1.f64915b);
    }

    public int hashCode() {
        return (AbstractC0690e.m3114a(this.f64914a) * 31) + this.f64915b.hashCode();
    }

    public String toString() {
        return "NationalInformationEntity(isChecked=" + this.f64914a + ", localMcc=" + this.f64915b + ")";
    }
}
