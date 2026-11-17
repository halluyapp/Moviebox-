package com.transsion.usercenter.edit;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.usercenter.edit.u */
/* JADX INFO: loaded from: classes7.dex */
public final class C20470u {

    /* JADX INFO: renamed from: b */
    public static final a f64806b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final Lazy f64807c = LazyKt.m97096a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: com.transsion.usercenter.edit.t
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C20470u.m84640b();
        }
    });

    /* JADX INFO: renamed from: a */
    private Bitmap f64808a;

    /* JADX INFO: renamed from: com.transsion.usercenter.edit.u$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C20470u m84645a() {
            return (C20470u) C20470u.f64807c.getValue();
        }
    }

    private C20470u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C20470u m84640b() {
        return new C20470u();
    }

    /* JADX INFO: renamed from: d */
    public final Bitmap m84642d() {
        return this.f64808a;
    }

    /* JADX INFO: renamed from: e */
    public final void m84643e(Bitmap bitmap) {
        this.f64808a = bitmap;
    }

    /* JADX INFO: renamed from: f */
    public final void m84644f(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            Intrinsics.m97801g(bitmapCreateBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
            this.f64808a = bitmapCreateBitmap;
        } catch (Exception e11) {
            e11.getMessage();
        }
    }
}
