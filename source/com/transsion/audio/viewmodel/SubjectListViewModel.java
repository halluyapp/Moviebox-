package com.transsion.audio.viewmodel;

import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p349dh.C22982c;
import sy.InterfaceC27663a;

/* JADX INFO: loaded from: classes5.dex */
public final class SubjectListViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: c */
    public static final C14273a f50545c = new C14273a(null);

    /* JADX INFO: renamed from: a */
    private final Lazy f50546a = LazyKt.m97097b(new Function0() { // from class: com.transsion.audio.viewmodel.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SubjectListViewModel.m64718j();
        }
    });

    /* JADX INFO: renamed from: b */
    private final Lazy f50547b = LazyKt.m97097b(new Function0() { // from class: com.transsion.audio.viewmodel.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SubjectListViewModel.m64715e();
        }
    });

    /* JADX INFO: renamed from: com.transsion.audio.viewmodel.SubjectListViewModel$a */
    public static final class C14273a {
        private C14273a() {
        }

        public /* synthetic */ C14273a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C3187b0 m64715e() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final InterfaceC27663a m64717i() {
        return (InterfaceC27663a) this.f50546a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC27663a m64718j() {
        return (InterfaceC27663a) C22982c.f70163e.m91553a().m91552h(InterfaceC27663a.class);
    }

    /* JADX INFO: renamed from: f */
    public final C3187b0 m64719f() {
        return (C3187b0) this.f50547b.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final void m64720g(boolean z11, String str, String nextPage, int i11, int i12, int i13, int i14) {
        Intrinsics.m97802h(nextPage, "nextPage");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new SubjectListViewModel$getDownloadList$1(this, str, nextPage, i11, i12, i13, i14, z11, null), 3, null);
    }
}
