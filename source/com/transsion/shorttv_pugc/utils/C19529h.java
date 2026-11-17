package com.transsion.shorttv_pugc.utils;

import android.support.v4.media.session.AbstractC0190c;
import androidx.p1004lifecycle.C3187b0;
import com.tencent.mmkv.MMKV;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p357dt.C23049a;
import p920xt.InterfaceC28657b;
import yt.InterfaceC29008a;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.utils.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C19529h {

    /* JADX INFO: renamed from: d */
    private static int f62468d;

    /* JADX INFO: renamed from: e */
    private static int f62469e;

    /* JADX INFO: renamed from: i */
    private static InterfaceC28657b f62473i;

    /* JADX INFO: renamed from: a */
    public static final C19529h f62465a = new C19529h();

    /* JADX INFO: renamed from: b */
    private static final Lazy f62466b = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.utils.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C19529h.m81344i();
        }
    });

    /* JADX INFO: renamed from: c */
    private static final Lazy f62467c = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.utils.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C19529h.m81345j();
        }
    });

    /* JADX INFO: renamed from: f */
    private static final int f62470f = 20;

    /* JADX INFO: renamed from: g */
    private static final int f62471g = 3;

    /* JADX INFO: renamed from: h */
    private static CopyOnWriteArrayList f62472h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j */
    private static final C3187b0 f62474j = new C3187b0();

    private C19529h() {
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC28657b m81342c() {
        InterfaceC28657b interfaceC28657bMo73661h = f62473i;
        if (interfaceC28657bMo73661h == null) {
            InterfaceC29008a interfaceC29008aM91696b = C23049a.f70283a.m91696b();
            interfaceC28657bMo73661h = interfaceC29008aM91696b != null ? interfaceC29008aM91696b.mo73661h() : null;
            f62473i = interfaceC28657bMo73661h;
        }
        return interfaceC28657bMo73661h;
    }

    /* JADX INFO: renamed from: d */
    private final int m81343d() {
        int iOptInt;
        String strMo73797a;
        if (f62468d <= 0) {
            try {
                InterfaceC28657b interfaceC28657bM81342c = m81342c();
                iOptInt = (interfaceC28657bM81342c == null || (strMo73797a = interfaceC28657bM81342c.mo73797a()) == null) ? f62470f : new JSONObject(strMo73797a).optInt("maxUnlockCount");
            } catch (Exception unused) {
                iOptInt = f62470f;
            }
            f62468d = iOptInt;
        }
        return f62468d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final MMKV m81344i() {
        MMKV mmkvM61551I = MMKV.m61551I("short_tv");
        Intrinsics.m97801g(mmkvM61551I, "mmkvWithID(...)");
        return mmkvM61551I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final MMKV m81345j() {
        MMKV mmkvM61551I = MMKV.m61551I("kv_app");
        Intrinsics.m97801g(mmkvM61551I, "mmkvWithID(...)");
        return mmkvM61551I;
    }

    /* JADX INFO: renamed from: e */
    public final int m81346e(String subjectId) {
        Intrinsics.m97802h(subjectId, "subjectId");
        return m81347f().getInt(subjectId, m81343d());
    }

    /* JADX INFO: renamed from: f */
    public final MMKV m81347f() {
        return (MMKV) f62466b.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final MMKV m81348g() {
        return (MMKV) f62467c.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final int m81349h() {
        int iOptInt;
        String strMo73797a;
        if (f62469e <= 0) {
            try {
                InterfaceC28657b interfaceC28657bM81342c = m81342c();
                iOptInt = (interfaceC28657bM81342c == null || (strMo73797a = interfaceC28657bM81342c.mo73797a()) == null) ? f62471g : new JSONObject(strMo73797a).optInt("perUnlockCount");
            } catch (Exception unused) {
                iOptInt = f62471g;
            }
            f62469e = iOptInt;
        }
        return f62469e;
    }

    /* JADX INFO: renamed from: k */
    public final void m81350k(String subjectId, int i11) {
        Intrinsics.m97802h(subjectId, "subjectId");
        m81347f().putInt(subjectId, i11);
        Iterator it = f62472h.iterator();
        while (it.hasNext()) {
            AbstractC0190c.m883a(it.next());
        }
    }
}
