package com.transsion.home.fragment.hashtag;

import androidx.p1004lifecycle.InterfaceC3189c0;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import p579ll.C25646b;

/* JADX INFO: renamed from: com.transsion.home.fragment.hashtag.m */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15224m {

    /* JADX INFO: renamed from: a */
    private static C25646b f52917a;

    /* JADX INFO: renamed from: com.transsion.home.fragment.hashtag.m$a */
    static final class a implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f52918a;

        a(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f52918a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f52918a;
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
            this.f52918a.invoke(obj);
        }
    }
}
