package com.transsion.usercenter.profile;

import com.tencent.mmkv.MMKV;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.transsion.usercenter.profile.e0 */
/* JADX INFO: loaded from: classes7.dex */
public final class C20663e0 {

    /* JADX INFO: renamed from: a */
    public static final C20663e0 f65192a = new C20663e0();

    /* JADX INFO: renamed from: b */
    private static final Lazy f65193b = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.profile.d0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C20663e0.m85329c();
        }
    });

    private C20663e0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final MMKV m85329c() {
        return MMKV.m61551I("profile_kv");
    }

    /* JADX INFO: renamed from: b */
    public final MMKV m85330b() {
        return (MMKV) f65193b.getValue();
    }
}
