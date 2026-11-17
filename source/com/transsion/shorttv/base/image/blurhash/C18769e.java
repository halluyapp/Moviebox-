package com.transsion.shorttv.base.image.blurhash;

import android.app.Application;
import com.blankj.utilcode.util.Utils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.shorttv.base.image.blurhash.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C18769e {

    /* JADX INFO: renamed from: a */
    public static final C18769e f60616a = new C18769e();

    /* JADX INFO: renamed from: b */
    private static final Lazy f60617b = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.base.image.blurhash.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C18769e.m79096b();
        }
    });

    private C18769e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final BlurHash m79096b() {
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return new BlurHash(applicationM27275a, 10, 0.6f);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m79097d(C18769e c18769e, String str, int i11, int i12, Function1 function1, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 20;
        }
        if ((i13 & 4) != 0) {
            i12 = 20;
        }
        c18769e.m79099c(str, i11, i12, function1);
    }

    /* JADX INFO: renamed from: e */
    private final BlurHash m79098e() {
        return (BlurHash) f60617b.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m79099c(String blurString, int i11, int i12, Function1 response) {
        Intrinsics.m97802h(blurString, "blurString");
        Intrinsics.m97802h(response, "response");
        m79098e().m79080f(blurString, i11, i12, response);
    }
}
