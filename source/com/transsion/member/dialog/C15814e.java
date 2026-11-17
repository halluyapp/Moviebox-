package com.transsion.member.dialog;

import androidx.p1004lifecycle.InterfaceC3189c0;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.member.dialog.e */
/* JADX INFO: loaded from: classes6.dex */
final /* synthetic */ class C15814e implements InterfaceC3189c0, FunctionAdapter {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ Function1 f54302a;

    C15814e(Function1 function) {
        Intrinsics.m97802h(function, "function");
        this.f54302a = function;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    /* JADX INFO: renamed from: a */
    public final Function mo6065a() {
        return this.f54302a;
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
        this.f54302a.invoke(obj);
    }
}
