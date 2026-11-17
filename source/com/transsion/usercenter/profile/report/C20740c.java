package com.transsion.usercenter.profile.report;

import androidx.compose.foundation.AbstractC0690e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.usercenter.profile.report.c */
/* JADX INFO: loaded from: classes7.dex */
public final class C20740c {

    /* JADX INFO: renamed from: a */
    private String f65315a;

    /* JADX INFO: renamed from: b */
    private boolean f65316b;

    public C20740c(String reportName, boolean z11) {
        Intrinsics.m97802h(reportName, "reportName");
        this.f65315a = reportName;
        this.f65316b = z11;
    }

    /* JADX INFO: renamed from: a */
    public final String m85482a() {
        return this.f65315a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m85483b() {
        return this.f65316b;
    }

    /* JADX INFO: renamed from: c */
    public final void m85484c(boolean z11) {
        this.f65316b = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20740c)) {
            return false;
        }
        C20740c c20740c = (C20740c) obj;
        return Intrinsics.m97797c(this.f65315a, c20740c.f65315a) && this.f65316b == c20740c.f65316b;
    }

    public int hashCode() {
        return (this.f65315a.hashCode() * 31) + AbstractC0690e.m3114a(this.f65316b);
    }

    public String toString() {
        return "ReportBean(reportName=" + this.f65315a + ", isChecked=" + this.f65316b + ")";
    }
}
