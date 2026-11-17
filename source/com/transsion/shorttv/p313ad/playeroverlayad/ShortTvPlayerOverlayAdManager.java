package com.transsion.shorttv.p313ad.playeroverlayad;

import androidx.p1004lifecycle.LifecycleCoroutineScope;
import com.transsion.p285ad.scene.C14047a;
import com.transsion.shorttv.p313ad.AdLoadState;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.InterfaceC25204t1;
import p988zr.C29238a;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTvPlayerOverlayAdManager {

    /* JADX INFO: renamed from: b */
    private static WeakReference f60542b;

    /* JADX INFO: renamed from: d */
    private static InterfaceC25204t1 f60544d;

    /* JADX INFO: renamed from: e */
    private static int f60545e;

    /* JADX INFO: renamed from: g */
    private static boolean f60547g;

    /* JADX INFO: renamed from: a */
    public static final ShortTvPlayerOverlayAdManager f60541a = new ShortTvPlayerOverlayAdManager();

    /* JADX INFO: renamed from: c */
    private static ConcurrentHashMap f60543c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    private static int f60546f = 3;

    private ShortTvPlayerOverlayAdManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final void m78944f() {
        m78948j();
    }

    /* JADX INFO: renamed from: g */
    private final boolean m78945g() {
        if (f60545e < 0 || f60546f < 0) {
            return false;
        }
        int size = f60543c.size() + 1;
        if (f60547g) {
            int i11 = f60546f;
            return i11 == 0 || (size - f60545e) % (i11 + 1) == 0;
        }
        int i12 = f60545e;
        if (i12 == 0) {
            f60547g = true;
            return f60546f == 0;
        }
        if (i12 != size) {
            return false;
        }
        f60547g = true;
        return true;
    }

    /* JADX INFO: renamed from: h */
    private final void m78946h() {
        WeakReference weakReference;
        LifecycleCoroutineScope lifecycleCoroutineScope;
        InterfaceC25204t1 interfaceC25204t1 = f60544d;
        if ((interfaceC25204t1 != null && interfaceC25204t1.isActive()) || (weakReference = f60542b) == null || (lifecycleCoroutineScope = (LifecycleCoroutineScope) weakReference.get()) == null) {
            return;
        }
        f60544d = AbstractC25136k.m99058d(lifecycleCoroutineScope, null, null, new ShortTvPlayerOverlayAdManager$startAutoDestroyTimer$1(null), 3, null);
    }

    /* JADX INFO: renamed from: i */
    private final void m78947i() {
        InterfaceC25204t1 interfaceC25204t1 = f60544d;
        if (interfaceC25204t1 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
        }
        f60544d = null;
    }

    /* JADX INFO: renamed from: j */
    private final void m78948j() {
        C18744e c18744eM78954b;
        Collection collectionValues = f60543c.values();
        Intrinsics.m97801g(collectionValues, "<get-values>(...)");
        for (C18740a c18740a : CollectionsKt.m97340R0(collectionValues)) {
            if (c18740a.m78955c() == AdLoadState.SUCCEED && !c18740a.m78957e() && (c18744eM78954b = c18740a.m78954b()) != null) {
                Long lValueOf = Long.valueOf(c18744eM78954b.m78973h());
                if (lValueOf.longValue() <= 0) {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    if (System.currentTimeMillis() - lValueOf.longValue() >= 10000) {
                        c18740a.m78953a();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m78949b() {
        C29238a.m112117g(C29238a.f89219a, "overlay", "overlay ad manager clear", null, 4, null);
        Collection collectionValues = f60543c.values();
        Intrinsics.m97801g(collectionValues, "<get-values>(...)");
        for (C18740a c18740a : CollectionsKt.m97340R0(collectionValues)) {
            C18744e c18744eM78954b = c18740a.m78954b();
            if (c18744eM78954b != null) {
                c18744eM78954b.m78972f();
            }
            c18740a.m78958f(null);
        }
        f60543c.clear();
        WeakReference weakReference = f60542b;
        if (weakReference != null) {
            weakReference.clear();
        }
        f60542b = null;
        m78947i();
        f60547g = false;
    }

    /* JADX INFO: renamed from: c */
    public final C18740a m78950c(String key) {
        LifecycleCoroutineScope lifecycleCoroutineScope;
        Intrinsics.m97802h(key, "key");
        WeakReference weakReference = f60542b;
        if (weakReference == null || (lifecycleCoroutineScope = (LifecycleCoroutineScope) weakReference.get()) == null) {
            return null;
        }
        C29238a.m112117g(C29238a.f89219a, "overlay", "getAdData, key=" + key + ", currentVideoCount=" + f60543c.size(), null, 4, null);
        C18740a c18740a = (C18740a) f60543c.get(key);
        if (c18740a == null) {
            c18740a = new C18740a();
            c18740a.m78960h(false);
            if (f60541a.m78945g()) {
                c18740a.m78958f(new C18744e("ShortTvPlayerOverlayScene", lifecycleCoroutineScope));
                c18740a.m78960h(true);
            }
            f60543c.put(key, c18740a);
        }
        return c18740a;
    }

    /* JADX INFO: renamed from: d */
    public final void m78951d(LifecycleCoroutineScope scope) {
        Intrinsics.m97802h(scope, "scope");
        f60542b = new WeakReference(scope);
        m78946h();
        C14047a c14047a = C14047a.f49716a;
        f60545e = c14047a.m63597o("ShortTvPlayerOverlayScene", 0);
        f60546f = c14047a.m63598q("ShortTvPlayerOverlayScene", 3);
    }

    /* JADX INFO: renamed from: e */
    public final void m78952e(String key) {
        C18744e c18744eM78954b;
        Intrinsics.m97802h(key, "key");
        C18740a c18740a = (C18740a) f60543c.get(key);
        if (c18740a != null && (c18744eM78954b = c18740a.m78954b()) != null) {
            c18744eM78954b.m78975j();
        }
        C18740a c18740a2 = (C18740a) f60543c.get(key);
        if (c18740a2 != null) {
            c18740a2.m78961i(false);
        }
    }
}
