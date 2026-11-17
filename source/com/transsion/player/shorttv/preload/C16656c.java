package com.transsion.player.shorttv.preload;

import androidx.collection.AbstractC0585s;
import androidx.compose.foundation.AbstractC0690e;

/* JADX INFO: renamed from: com.transsion.player.shorttv.preload.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C16656c {

    /* JADX INFO: renamed from: a */
    private final boolean f56010a;

    /* JADX INFO: renamed from: b */
    private final long f56011b;

    public C16656c(boolean z11, long j11) {
        this.f56010a = z11;
        this.f56011b = j11;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72549a() {
        return this.f56010a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16656c)) {
            return false;
        }
        C16656c c16656c = (C16656c) obj;
        return this.f56010a == c16656c.f56010a && this.f56011b == c16656c.f56011b;
    }

    public int hashCode() {
        return (AbstractC0690e.m3114a(this.f56010a) * 31) + AbstractC0585s.m2633a(this.f56011b);
    }

    public String toString() {
        return "VideoPreloadConfig(enable=" + this.f56010a + ", cacheByte=" + this.f56011b + ")";
    }
}
