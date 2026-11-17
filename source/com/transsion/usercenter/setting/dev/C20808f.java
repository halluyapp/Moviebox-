package com.transsion.usercenter.setting.dev;

import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.C3187b0;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.usercenter.setting.dev.f */
/* JADX INFO: loaded from: classes7.dex */
public final class C20808f extends AbstractC3223t0 {

    /* JADX INFO: renamed from: a */
    private final Lazy f65465a = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.setting.dev.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C20808f.m85700c();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C3187b0 m85700c() {
        return new C3187b0();
    }

    /* JADX INFO: renamed from: d */
    public final C3187b0 m85701d() {
        return (C3187b0) this.f65465a.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m85702e(int i11, int i12, String id2) {
        Intrinsics.m97802h(id2, "id");
        ArrayList arrayList = new ArrayList();
        int i13 = 1;
        if (1 <= i12) {
            while (true) {
                arrayList.add("page = " + i11 + " --- pageSize = " + i12 + " --- id = " + id2);
                if (i13 == i12) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        m85701d().mo14855n(arrayList);
    }
}
