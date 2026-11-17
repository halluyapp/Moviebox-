package com.transsion.publish;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.publish.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C17604p {

    /* JADX INFO: renamed from: b */
    public static final a f58122b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final Lazy f58123c = LazyKt.m97096a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: com.transsion.publish.o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C17604p.m75376b();
        }
    });

    /* JADX INFO: renamed from: a */
    private ExecutorService f58124a = Executors.newFixedThreadPool(3);

    /* JADX INFO: renamed from: com.transsion.publish.p$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C17604p m75379a() {
            return (C17604p) C17604p.f58123c.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C17604p m75376b() {
        return new C17604p();
    }

    /* JADX INFO: renamed from: d */
    public final void m75378d(Runnable runnable) {
        Intrinsics.m97802h(runnable, "runnable");
        ExecutorService executorService = this.f58124a;
        if (executorService != null) {
            executorService.submit(runnable);
        }
    }
}
