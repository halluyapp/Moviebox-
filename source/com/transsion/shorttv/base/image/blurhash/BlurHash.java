package com.transsion.shorttv.base.image.blurhash;

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
    private Context f60606a;

    /* JADX INFO: renamed from: b */
    private float f60607b;

    /* JADX INFO: renamed from: c */
    private LruCache f60608c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC25149n0 f60609d;

    public BlurHash(Context context, int i11, float f11) {
        Intrinsics.m97802h(context, "context");
        this.f60606a = context;
        this.f60607b = f11;
        this.f60608c = new LruCache(i11);
        this.f60609d = AbstractC25153o0.m99079a(C25220y0.m99269c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final void m79078e(String str, BitmapDrawable bitmapDrawable) {
        this.f60608c.put(str, bitmapDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final BitmapDrawable m79079g(String str) {
        return (BitmapDrawable) this.f60608c.get(str);
    }

    /* JADX INFO: renamed from: f */
    public final void m79080f(String blurString, int i11, int i12, Function1 response) {
        Intrinsics.m97802h(blurString, "blurString");
        Intrinsics.m97802h(response, "response");
        AbstractC25136k.m99058d(this.f60609d, null, null, new BlurHash$execute$1(this, blurString, response, i11, i12, null), 3, null);
    }
}
