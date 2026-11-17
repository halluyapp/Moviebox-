package com.transsion.home.fragment.filter;

import androidx.p1004lifecycle.InterfaceC3189c0;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.home.fragment.filter.c0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class C15175c0 implements InterfaceC3189c0, FunctionAdapter {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ Function1 f52835a;

    C15175c0(Function1 function) {
        Intrinsics.m97802h(function, "function");
        this.f52835a = function;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    /* JADX INFO: renamed from: a */
    public final Function mo6065a() {
        return this.f52835a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC3189c0) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.m97797c(mo6065a(), ((FunctionAdapter) obj).mo6065a());
        }
        return false;
    }

    public final int hashCode() {
        return mo6065a().hashCode();
    }

    @Override // androidx.p1004lifecycle.InterfaceC3189c0
    public final /* synthetic */ void onChanged(Object obj) {
        this.f52835a.invoke(obj);
    }
}
