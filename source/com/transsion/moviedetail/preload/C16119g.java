package com.transsion.moviedetail.preload;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p843vm.C28131a;
import p843vm.C28135e;

/* JADX INFO: renamed from: com.transsion.moviedetail.preload.g */
/* JADX INFO: loaded from: classes.dex */
public final class C16119g extends C28131a {

    /* JADX INFO: renamed from: a */
    public static final a f54823a = new a(null);

    /* JADX INFO: renamed from: b */
    private static final Lazy f54824b = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.preload.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C16119g.m70669d();
        }
    });

    /* JADX INFO: renamed from: com.transsion.moviedetail.preload.g$a */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C16119g m70670a() {
            return (C16119g) C16119g.f54824b.getValue();
        }
    }

    public C16119g() {
        C28135e.f86323a.m109270e(new C16116d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C16119g m70669d() {
        return new C16119g();
    }
}
