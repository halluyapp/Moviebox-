package com.transsion.usercenter.profile.fragment;

import androidx.p1004lifecycle.InterfaceC3189c0;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.usercenter.profile.fragment.v */
/* JADX INFO: loaded from: classes7.dex */
final /* synthetic */ class C20702v implements InterfaceC3189c0, FunctionAdapter {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ Function1 f65277a;

    C20702v(Function1 function) {
        Intrinsics.m97802h(function, "function");
        this.f65277a = function;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    /* JADX INFO: renamed from: a */
    public final Function mo6065a() {
        return this.f65277a;
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
        this.f65277a.invoke(obj);
    }
}
