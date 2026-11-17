package com.transsion.member.history;

import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p017an.InterfaceC0127a;
import p349dh.C22982c;

/* JADX INFO: loaded from: classes6.dex */
public final class PointsHistoryViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: a */
    private final Lazy f54336a = LazyKt.m97097b(new Function0() { // from class: com.transsion.member.history.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PointsHistoryViewModel.m70082g();
        }
    });

    /* JADX INFO: renamed from: b */
    private final C3187b0 f54337b = new C3187b0();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final InterfaceC0127a m70081f() {
        return (InterfaceC0127a) this.f54336a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC0127a m70082g() {
        return (InterfaceC0127a) C22982c.f70163e.m91553a().m91552h(InterfaceC0127a.class);
    }

    /* JADX INFO: renamed from: d */
    public final void m70083d(String page) {
        Intrinsics.m97802h(page, "page");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new PointsHistoryViewModel$fetchHistory$1(this, page, null), 2, null);
    }

    /* JADX INFO: renamed from: e */
    public final C3187b0 m70084e() {
        return this.f54337b;
    }
}
