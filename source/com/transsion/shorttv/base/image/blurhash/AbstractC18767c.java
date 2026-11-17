package com.transsion.shorttv.base.image.blurhash;

import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.RequestBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.shorttv.base.image.blurhash.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC18767c {
    /* JADX INFO: renamed from: b */
    public static final void m79093b(final RequestBuilder requestBuilder, String blurString, int i11, int i12, BlurHash blurHash, final Function1 response) {
        Intrinsics.m97802h(requestBuilder, "<this>");
        Intrinsics.m97802h(blurString, "blurString");
        Intrinsics.m97802h(blurHash, "blurHash");
        Intrinsics.m97802h(response, "response");
        if (i11 == 0 || i12 == 0) {
            return;
        }
        blurHash.m79080f(blurString, i11, i12, new Function1() { // from class: com.transsion.shorttv.base.image.blurhash.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC18767c.m79094c(requestBuilder, response, (BitmapDrawable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final Unit m79094c(RequestBuilder requestBuilder, Function1 function1, BitmapDrawable drawable) {
        Intrinsics.m97802h(drawable, "drawable");
        requestBuilder.placeholder(drawable);
        function1.invoke(requestBuilder);
        return Unit.f75682a;
    }
}
