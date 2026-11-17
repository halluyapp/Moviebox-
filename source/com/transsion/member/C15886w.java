package com.transsion.member;

import com.tencent.mmkv.MMKV;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.transsion.member.w */
/* JADX INFO: loaded from: classes.dex */
public final class C15886w {

    /* JADX INFO: renamed from: a */
    public static final C15886w f54411a = new C15886w();

    /* JADX INFO: renamed from: b */
    private static final Lazy f54412b = LazyKt.m97097b(new Function0() { // from class: com.transsion.member.v
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C15886w.m70115c();
        }
    });

    /* JADX INFO: renamed from: c */
    public static final int f54413c = 8;

    private C15886w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final MMKV m70115c() {
        return MMKV.m61551I("member_kv");
    }

    /* JADX INFO: renamed from: b */
    public final MMKV m70116b() {
        return (MMKV) f54412b.getValue();
    }
}
