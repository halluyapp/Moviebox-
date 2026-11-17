package com.transsion.rewardscenter.task.dada;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.rewardscenter.task.dada.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C17937r {

    /* JADX INFO: renamed from: a */
    private DadaTaskState f58879a;

    /* JADX WARN: Multi-variable type inference failed */
    public C17937r() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C17937r(DadaTaskState taskState) {
        Intrinsics.m97802h(taskState, "taskState");
        this.f58879a = taskState;
    }

    public /* synthetic */ C17937r(DadaTaskState dadaTaskState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? DadaTaskState.NORMAL : dadaTaskState);
    }

    /* JADX INFO: renamed from: a */
    public final DadaTaskState m76440a() {
        return this.f58879a;
    }

    /* JADX INFO: renamed from: b */
    public final void m76441b(DadaTaskState dadaTaskState) {
        Intrinsics.m97802h(dadaTaskState, "<set-?>");
        this.f58879a = dadaTaskState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17937r) && this.f58879a == ((C17937r) obj).f58879a;
    }

    public int hashCode() {
        return this.f58879a.hashCode();
    }

    public String toString() {
        return "DadaTaskItem(taskState=" + this.f58879a + ")";
    }
}
