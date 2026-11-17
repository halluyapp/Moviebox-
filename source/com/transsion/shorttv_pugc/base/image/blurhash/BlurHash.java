package com.transsion.shorttv_pugc.base.image.blurhash;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.LruCache;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
public final class BlurHash {

    /* JADX INFO: renamed from: a */
    private Context f61714a;

    /* JADX INFO: renamed from: b */
    private float f61715b;

    /* JADX INFO: renamed from: c */
    private LruCache f61716c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC25149n0 f61717d;

    public BlurHash(Context context, int i11, float f11) {
        Intrinsics.m97802h(context, "context");
        this.f61714a = context;
        this.f61715b = f11;
        this.f61716c = new LruCache(i11);
        this.f61717d = AbstractC25153o0.m99079a(C25220y0.m99269c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final void m80513e(String str, BitmapDrawable bitmapDrawable) {
        this.f61716c.put(str, bitmapDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final BitmapDrawable m80514g(String str) {
        return (BitmapDrawable) this.f61716c.get(str);
    }

    /* JADX INFO: renamed from: f */
    public final void m80515f(String blurString, int i11, int i12, Function1 response) {
        Intrinsics.m97802h(blurString, "blurString");
        Intrinsics.m97802h(response, "response");
        AbstractC25136k.m99058d(this.f61717d, null, null, new BlurHash$execute$1(this, blurString, response, i11, i12, null), 3, null);
    }
}
