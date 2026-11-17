package com.transsion.mbwidget.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.blankj.utilcode.util.AbstractC5806y;
import com.blankj.utilcode.util.Utils;
import com.transsion.mbwidget.R$mipmap;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.AbstractC25089i0;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25165r0;
import p462hj.C23861g;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
public final class BitmapUtils {

    /* JADX INFO: renamed from: a */
    public static final BitmapUtils f54124a = new BitmapUtils();

    private BitmapUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(3:33|22|(1:24)) */
    /* JADX WARN: Code duplicated, block: B:24:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r7 = r0;
        r0 = r12;
        r12 = r2;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006b -> B:16:0x0039). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m69737e(Context context, String str, int i11, Continuation continuation) throws Throwable {
        BitmapUtils$loadImageWithRetry$1 bitmapUtils$loadImageWithRetry$1;
        Context context2;
        int i12;
        int i13;
        String str2;
        if (continuation instanceof BitmapUtils$loadImageWithRetry$1) {
            bitmapUtils$loadImageWithRetry$1 = (BitmapUtils$loadImageWithRetry$1) continuation;
            int i14 = bitmapUtils$loadImageWithRetry$1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bitmapUtils$loadImageWithRetry$1.label = i14 - Integer.MIN_VALUE;
            } else {
                bitmapUtils$loadImageWithRetry$1 = new BitmapUtils$loadImageWithRetry$1(this, continuation);
            }
        } else {
            bitmapUtils$loadImageWithRetry$1 = new BitmapUtils$loadImageWithRetry$1(this, continuation);
        }
        Object objM98910g = bitmapUtils$loadImageWithRetry$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i15 = bitmapUtils$loadImageWithRetry$1.label;
        if (i15 == 0) {
            ResultKt.m97107b(objM98910g);
            context2 = context;
            i12 = 0;
            i13 = i11;
            str2 = str;
            if (i12 < i13) {
                return null;
            }
            AbstractC25089i0 abstractC25089i0M99268b = C25220y0.m99268b();
            BitmapUtils$loadImageWithRetry$2 bitmapUtils$loadImageWithRetry$2 = new BitmapUtils$loadImageWithRetry$2(context2, str2, null);
            bitmapUtils$loadImageWithRetry$1.L$0 = context2;
            bitmapUtils$loadImageWithRetry$1.L$1 = str2;
            bitmapUtils$loadImageWithRetry$1.I$0 = i13;
            bitmapUtils$loadImageWithRetry$1.I$1 = i12;
            bitmapUtils$loadImageWithRetry$1.label = 1;
            objM98910g = AbstractC25088i.m98910g(abstractC25089i0M99268b, bitmapUtils$loadImageWithRetry$2, bitmapUtils$loadImageWithRetry$1);
            if (objM98910g == objF) {
                return objF;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = bitmapUtils$loadImageWithRetry$1.I$1;
            int i16 = bitmapUtils$loadImageWithRetry$1.I$0;
            str2 = (String) bitmapUtils$loadImageWithRetry$1.L$1;
            Context context3 = (Context) bitmapUtils$loadImageWithRetry$1.L$0;
            try {
                ResultKt.m97107b(objM98910g);
            } catch (Exception e11) {
                Exception e12 = e11;
                BitmapUtils$loadImageWithRetry$1 bitmapUtils$loadImageWithRetry$3 = bitmapUtils$loadImageWithRetry$1;
                int i17 = i16;
                context2 = context3;
                BitmapUtils$loadImageWithRetry$1 bitmapUtils$loadImageWithRetry$4 = bitmapUtils$loadImageWithRetry$3;
                i12++;
                C26866a.f81698a.m104912c("DeskWidget_", "load Bitmap Failed-attempt-" + i12 + " :" + str2, true);
                if (i12 == i17) {
                    e12.printStackTrace();
                }
                i13 = i17;
                bitmapUtils$loadImageWithRetry$1 = bitmapUtils$loadImageWithRetry$4;
                if (i12 < i13) {
                    return null;
                }
                AbstractC25089i0 abstractC25089i0M99268b2 = C25220y0.m99268b();
                BitmapUtils$loadImageWithRetry$2 bitmapUtils$loadImageWithRetry$5 = new BitmapUtils$loadImageWithRetry$2(context2, str2, null);
                bitmapUtils$loadImageWithRetry$1.L$0 = context2;
                bitmapUtils$loadImageWithRetry$1.L$1 = str2;
                bitmapUtils$loadImageWithRetry$1.I$0 = i13;
                bitmapUtils$loadImageWithRetry$1.I$1 = i12;
                bitmapUtils$loadImageWithRetry$1.label = 1;
                objM98910g = AbstractC25088i.m98910g(abstractC25089i0M99268b2, bitmapUtils$loadImageWithRetry$5, bitmapUtils$loadImageWithRetry$1);
                if (objM98910g == objF) {
                    return objF;
                }
            }
        }
        return objM98910g;
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ Object m69738f(BitmapUtils bitmapUtils, Context context, String str, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 2;
        }
        return bitmapUtils.m69737e(context, str, i11, continuation);
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m69739b(int i11) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(Utils.m27275a().getResources(), i11);
        Intrinsics.m97801g(bitmapDecodeResource, "decodeResource(...)");
        return bitmapDecodeResource;
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m69740c() {
        return m69739b(R$mipmap.ic_default_cover);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: d */
    public final Object m69741d(Context context, String str, int i11, Continuation continuation) throws Throwable {
        BitmapUtils$loadBitmap$1 bitmapUtils$loadBitmap$1;
        Bitmap.Config config;
        if (continuation instanceof BitmapUtils$loadBitmap$1) {
            bitmapUtils$loadBitmap$1 = (BitmapUtils$loadBitmap$1) continuation;
            int i12 = bitmapUtils$loadBitmap$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bitmapUtils$loadBitmap$1.label = i12 - Integer.MIN_VALUE;
            } else {
                bitmapUtils$loadBitmap$1 = new BitmapUtils$loadBitmap$1(this, continuation);
            }
        } else {
            bitmapUtils$loadBitmap$1 = new BitmapUtils$loadBitmap$1(this, continuation);
        }
        Object objMo99104h = bitmapUtils$loadBitmap$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i13 = bitmapUtils$loadBitmap$1.label;
        if (i13 == 0) {
            ResultKt.m97107b(objMo99104h);
            if (str == null || str.length() == 0) {
                return null;
            }
            InterfaceC25165r0 interfaceC25165r0M99056b = AbstractC25136k.m99056b(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new BitmapUtils$loadBitmap$bitmap$1(context, C23861g.f72941a.m94479a(str, i11 <= 0 ? AbstractC5806y.m27489e() : RangesKt.m97938h(i11, AbstractC5806y.m27489e()), (120 & 4) != 0, (120 & 8) != 0, (120 & 16) != 0 ? 0 : 0, (120 & 32) != 0 ? false : false, (120 & 64) != 0 ? 0 : 0), null), 3, null);
            bitmapUtils$loadBitmap$1.label = 1;
            objMo99104h = interfaceC25165r0M99056b.mo99104h(bitmapUtils$loadBitmap$1);
            if (objMo99104h == objF) {
                return objF;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(objMo99104h);
        }
        Bitmap bitmap = (Bitmap) objMo99104h;
        if (bitmap == null || bitmap.isRecycled() || (config = bitmap.getConfig()) == null) {
            return null;
        }
        return bitmap.copy(config, true);
    }
}
