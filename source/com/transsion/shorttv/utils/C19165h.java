package com.transsion.shorttv.utils;

import androidx.p1004lifecycle.C3187b0;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.tencent.mmkv.MMKV;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.shorttv.utils.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C19165h {

    /* JADX INFO: renamed from: a */
    public static final C19165h f61575a = new C19165h();

    /* JADX INFO: renamed from: b */
    private static final Lazy f61576b = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.utils.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C19165h.m80238g();
        }
    });

    /* JADX INFO: renamed from: c */
    private static final Lazy f61577c = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.utils.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C19165h.m80239h();
        }
    });

    /* JADX INFO: renamed from: d */
    private static final int f61578d = 20;

    /* JADX INFO: renamed from: e */
    private static final int f61579e = 3;

    /* JADX INFO: renamed from: f */
    private static CopyOnWriteArrayList f61580f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g */
    private static final C3187b0 f61581g = new C3187b0();

    private C19165h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final MMKV m80238g() {
        MMKV mmkvM61551I = MMKV.m61551I("short_tv");
        Intrinsics.m97801g(mmkvM61551I, "mmkvWithID(...)");
        return mmkvM61551I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final MMKV m80239h() {
        MMKV mmkvM61551I = MMKV.m61551I("kv_app");
        Intrinsics.m97801g(mmkvM61551I, "mmkvWithID(...)");
        return mmkvM61551I;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m80240c() {
        return System.currentTimeMillis() - m80241d().getLong("k_download_guide_bubble_last_show_time", 0L) >= TmcConstants.MINIAPP_TIME_DIFF;
    }

    /* JADX INFO: renamed from: d */
    public final MMKV m80241d() {
        return (MMKV) f61576b.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final MMKV m80242e() {
        return (MMKV) f61577c.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final void m80243f() {
        m80241d().putLong("k_download_guide_bubble_last_show_time", System.currentTimeMillis());
    }
}
