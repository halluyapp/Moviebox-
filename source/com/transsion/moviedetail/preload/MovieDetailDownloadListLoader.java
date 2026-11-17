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
public final class MovieDetailDownloadListLoader extends AbstractC28132b {

    /* JADX INFO: renamed from: f */
    private String f54812f;

    /* JADX INFO: renamed from: g */
    private final Lazy f54813g;

    public MovieDetailDownloadListLoader(String subjectId) {
        Intrinsics.m97802h(subjectId, "subjectId");
        this.f54812f = subjectId;
        this.f54813g = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.preload.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MovieDetailDownloadListLoader.m70646o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final InterfaceC27663a m70645m() {
        return (InterfaceC27663a) this.f54813g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final InterfaceC27663a m70646o() {
        return (InterfaceC27663a) C22982c.f70163e.m91553a().m91552h(InterfaceC27663a.class);
    }

    @Override // p843vm.AbstractC28132b
    /* JADX INFO: renamed from: h */
    public void mo70647h(C3187b0 c3187b0) {
        m109264j(AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new MovieDetailDownloadListLoader$loadDataFromService$1(this, null), 3, null));
    }

    /* JADX INFO: renamed from: n */
    public final String m70648n() {
        return this.f54812f;
    }

    /* JADX INFO: renamed from: p */
    public final void m70649p(String str) {
        Intrinsics.m97802h(str, "<set-?>");
        this.f54812f = str;
    }
}
