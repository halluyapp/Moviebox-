package com.transsion.mbwidget.data;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.mbwidget.data.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C15727d {

    /* JADX INFO: renamed from: a */
    public static final C15727d f54110a = new C15727d();

    private C15727d() {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m69701a(SportMatch match) {
        Intrinsics.m97802h(match, "match");
        return match.getStatus() == MatchStatus.UNKNOWN || match.getStatus() == MatchStatus.ENDED;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m69702b(SportMatch match) {
        Intrinsics.m97802h(match, "match");
        if (match.getStatus() != MatchStatus.UNKNOWN) {
            return match.getStatus() == MatchStatus.ING;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis >= match.getMatchTime() && jCurrentTimeMillis <= match.getMatchTime() + 7200000;
    }
}
