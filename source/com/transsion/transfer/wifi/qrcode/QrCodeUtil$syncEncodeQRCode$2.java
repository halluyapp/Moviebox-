package com.transsion.transfer.wifi.qrcode;

import af.C0090b;
import android.graphics.Bitmap;
import com.google.zxing.BarcodeFormat;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lkotlinx/coroutines/n0;)Landroid/graphics/Bitmap;"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.transfer.wifi.qrcode.QrCodeUtil$syncEncodeQRCode$2", m97637f = "QrCodeUtil.kt", m97638l = {}, m97639m = "invokeSuspend")
final class QrCodeUtil$syncEncodeQRCode$2 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Bitmap>, Object> {
    final /* synthetic */ int $height;
    final /* synthetic */ String $text;
    final /* synthetic */ int $width;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QrCodeUtil$syncEncodeQRCode$2(String str, int i11, int i12, Continuation<? super QrCodeUtil$syncEncodeQRCode$2> continuation) {
        super(2, continuation);
        this.$text = str;
        this.$width = i11;
        this.$height = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QrCodeUtil$syncEncodeQRCode$2(this.$text, this.$width, this.$height, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Bitmap> continuation) {
        return ((QrCodeUtil$syncEncodeQRCode$2) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        String str = this.$text;
        int i11 = this.$width;
        int i12 = this.$height;
        try {
            Result.Companion companion = Result.INSTANCE;
            C0090b c0090b = new C0090b();
            objM112707constructorimpl = Result.m112707constructorimpl(c0090b.m461a(c0090b.m462b(str, BarcodeFormat.QR_CODE, i11, i12)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) == null) {
            return objM112707constructorimpl;
        }
        return null;
    }
}
