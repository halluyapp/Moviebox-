package com.transsion.play.detail.viewmodel;

import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import ao.InterfaceC4696a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p349dh.C22982c;

/* JADX INFO: loaded from: classes6.dex */
public final class PlayDetailViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: a */
    private final Lazy f55456a = LazyKt.m97096a(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.transsion.play.detail.viewmodel.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PlayDetailViewModel.m71702h();
        }
    });

    /* JADX INFO: renamed from: b */
    private final C3187b0 f55457b = new C3187b0();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final InterfaceC4696a m71701e() {
        return (InterfaceC4696a) this.f55456a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC4696a m71702h() {
        return (InterfaceC4696a) C22982c.f70163e.m91553a().m91552h(InterfaceC4696a.class);
    }

    /* JADX INFO: renamed from: f */
    public final void m71703f(String subjectId) {
        Intrinsics.m97802h(subjectId, "subjectId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new PlayDetailViewModel$getSubjectPostCount$1(this, subjectId, null), 3, null);
    }

    /* JADX INFO: renamed from: g */
    public final C3187b0 m71704g() {
        return this.f55457b;
    }
}
