package com.transsion.rewardscenter.utils;

import com.tencent.mmkv.MMKV;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.rewardscenter.utils.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C18007b {

    /* JADX INFO: renamed from: a */
    public static final C18007b f58982a = new C18007b();

    /* JADX INFO: renamed from: b */
    private static final Lazy f58983b = LazyKt.m97097b(new Function0() { // from class: com.transsion.rewardscenter.utils.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C18007b.m76628f();
        }
    });

    /* JADX INFO: renamed from: c */
    public static final int f58984c = 8;

    private C18007b() {
    }

    /* JADX INFO: renamed from: b */
    private final MMKV m76627b() {
        return (MMKV) f58983b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final MMKV m76628f() {
        return MMKV.m61551I("RewardsCenterCache");
    }

    /* JADX INFO: renamed from: c */
    public final String m76629c() {
        String strM61573k = m76627b().m61573k("phone_cc");
        return strM61573k == null ? "" : strM61573k;
    }

    /* JADX INFO: renamed from: d */
    public final String m76630d() {
        String strM61573k = m76627b().m61573k("phone_iso");
        return strM61573k == null ? "" : strM61573k;
    }

    /* JADX INFO: renamed from: e */
    public final String m76631e() {
        String strM61573k = m76627b().m61573k("phone_number");
        return strM61573k == null ? "" : strM61573k;
    }

    /* JADX INFO: renamed from: g */
    public final void m76632g(String cc2, String iso, String number) {
        Intrinsics.m97802h(cc2, "cc");
        Intrinsics.m97802h(iso, "iso");
        Intrinsics.m97802h(number, "number");
        m76627b().putString("phone_cc", cc2);
        m76627b().putString("phone_iso", iso);
        m76627b().putString("phone_number", number);
    }
}
