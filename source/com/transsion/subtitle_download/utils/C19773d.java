package com.transsion.subtitle_download.utils;

import com.tencent.mmkv.MMKV;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.subtitle_download.utils.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C19773d {

    /* JADX INFO: renamed from: a */
    public static final C19773d f63089a = new C19773d();

    /* JADX INFO: renamed from: b */
    private static final Lazy f63090b = LazyKt.m97097b(new Function0() { // from class: com.transsion.subtitle_download.utils.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C19773d.m82369c();
        }
    });

    private C19773d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final MMKV m82369c() {
        MMKV mmkvM61551I = MMKV.m61551I("kv_subtitle");
        Intrinsics.m97801g(mmkvM61551I, "mmkvWithID(...)");
        return mmkvM61551I;
    }

    /* JADX INFO: renamed from: b */
    public final MMKV m82370b() {
        return (MMKV) f63090b.getValue();
    }
}
