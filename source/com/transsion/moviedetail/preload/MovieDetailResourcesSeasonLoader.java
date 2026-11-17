package com.transsion.moviedetail.preload;

import androidx.p1004lifecycle.C3187b0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import p843vm.AbstractC28132b;
import sy.InterfaceC27663a;

/* JADX INFO: loaded from: classes6.dex */
public final class MovieDetailResourcesSeasonLoader extends AbstractC28132b {

    /* JADX INFO: renamed from: f */
    private String f54815f;

    /* JADX INFO: renamed from: g */
    private final Lazy f54816g;

    public MovieDetailResourcesSeasonLoader(String subjectId) {
        Intrinsics.m97802h(subjectId, "subjectId");
        this.f54815f = subjectId;
        this.f54816g = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.preload.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MovieDetailResourcesSeasonLoader.m70654o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final InterfaceC27663a m70653m() {
        return (InterfaceC27663a) this.f54816g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final InterfaceC27663a m70654o() {
        return (InterfaceC27663a) C22982c.f70163e.m91553a().m91552h(InterfaceC27663a.class);
    }

    @Override // p843vm.AbstractC28132b
    /* JADX INFO: renamed from: h */
    public void mo70647h(C3187b0 c3187b0) {
        m109264j(AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new MovieDetailResourcesSeasonLoader$loadDataFromService$1(this, null), 3, null));
    }

    /* JADX INFO: renamed from: n */
    public final String m70655n() {
        return this.f54815f;
    }

    /* JADX INFO: renamed from: p */
    public final void m70656p(String str) {
        Intrinsics.m97802h(str, "<set-?>");
        this.f54815f = str;
    }
}
