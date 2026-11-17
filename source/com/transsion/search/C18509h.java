package com.transsion.search;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.search.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C18509h {

    /* JADX INFO: renamed from: b */
    public static final a f59954b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final Lazy f59955c = LazyKt.m97096a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: com.transsion.search.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C18509h.m77992b();
        }
    });

    /* JADX INFO: renamed from: a */
    private ExecutorService f59956a = Executors.newFixedThreadPool(3);

    /* JADX INFO: renamed from: com.transsion.search.h$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C18509h m77995a() {
            return (C18509h) C18509h.f59955c.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C18509h m77992b() {
        return new C18509h();
    }

    /* JADX INFO: renamed from: d */
    public final void m77994d(Runnable runnable) {
        Intrinsics.m97802h(runnable, "runnable");
        ExecutorService executorService = this.f59956a;
        if (executorService != null) {
            executorService.submit(runnable);
        }
    }
}
