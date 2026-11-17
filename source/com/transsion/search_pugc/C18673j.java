package com.transsion.search_pugc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.search_pugc.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C18673j {

    /* JADX INFO: renamed from: b */
    public static final a f60293b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final Lazy f60294c = LazyKt.m97096a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: com.transsion.search_pugc.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C18673j.m78525b();
        }
    });

    /* JADX INFO: renamed from: a */
    private ExecutorService f60295a = Executors.newFixedThreadPool(3);

    /* JADX INFO: renamed from: com.transsion.search_pugc.j$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C18673j m78528a() {
            return (C18673j) C18673j.f60294c.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C18673j m78525b() {
        return new C18673j();
    }

    /* JADX INFO: renamed from: d */
    public final void m78527d(Runnable runnable) {
        Intrinsics.m97802h(runnable, "runnable");
        ExecutorService executorService = this.f60295a;
        if (executorService != null) {
            executorService.submit(runnable);
        }
    }
}
