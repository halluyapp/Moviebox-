package com.transsion.publish;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.publish.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C17602n {

    /* JADX INFO: renamed from: b */
    public static final a f58119b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final Lazy f58120c = LazyKt.m97096a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: com.transsion.publish.m
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C17602n.m75369b();
        }
    });

    /* JADX INFO: renamed from: a */
    private List f58121a = new ArrayList();

    /* JADX INFO: renamed from: com.transsion.publish.n$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C17602n m75374a() {
            return (C17602n) C17602n.f58120c.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C17602n m75369b() {
        return new C17602n();
    }

    /* JADX INFO: renamed from: d */
    public final void m75371d() {
        List list = this.f58121a;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: e */
    public final List m75372e() {
        return this.f58121a;
    }

    /* JADX INFO: renamed from: f */
    public final void m75373f(List list) {
        Intrinsics.m97802h(list, "list");
        this.f58121a = list;
    }
}
