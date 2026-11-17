package com.transsion.publish.viewmodel;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.C3187b0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mp.C25896b;

/* JADX INFO: renamed from: com.transsion.publish.viewmodel.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C17722d extends AbstractC3186b {

    /* JADX INFO: renamed from: b */
    private final Lazy f58438b;

    /* JADX INFO: renamed from: c */
    private C3187b0 f58439c;

    /* JADX INFO: renamed from: d */
    private final C3187b0 f58440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17722d(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f58438b = LazyKt.m97097b(new Function0() { // from class: com.transsion.publish.viewmodel.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C17722d.m75711d();
            }
        });
        this.f58439c = new C3187b0();
        this.f58440d = new C3187b0(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C25896b m75711d() {
        return new C25896b();
    }
}
