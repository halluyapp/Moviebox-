package com.transsion.transfer.wifi.p320ui;

import android.graphics.Bitmap;
import androidx.appcompat.widget.AppCompatImageView;
import com.transsion.transfer.R$id;
import com.transsion.transfer.wifi.qrcode.QrCodeUtil;
import com.transsion.transfer.wifi.util.C20136g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p721qv.C27132c;
import p754rv.C27385a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.transfer.wifi.ui.WifiCreateActivity$createSuccess$1", m97637f = "WifiCreateActivity.kt", m97638l = {274, 282}, m97639m = "invokeSuspend")
final class WifiCreateActivity$createSuccess$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $duration;
    final /* synthetic */ C27385a $wifiInfoModel;
    long J$0;
    int label;
    final /* synthetic */ WifiCreateActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WifiCreateActivity$createSuccess$1(C27385a c27385a, WifiCreateActivity wifiCreateActivity, long j11, Continuation<? super WifiCreateActivity$createSuccess$1> continuation) {
        super(2, continuation);
        this.$wifiInfoModel = c27385a;
        this.this$0 = wifiCreateActivity;
        this.$duration = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WifiCreateActivity$createSuccess$1(this.$wifiInfoModel, this.this$0, this.$duration, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((WifiCreateActivity$createSuccess$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j11;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                j11 = this.J$0;
                ResultKt.m97107b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            return Unit.f75682a;
        }
        ResultKt.m97107b(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        QrCodeUtil qrCodeUtil = QrCodeUtil.f63936a;
        String strM83439b = qrCodeUtil.m83439b(this.$wifiInfoModel);
        this.J$0 = jCurrentTimeMillis;
        this.label = 1;
        obj = QrCodeUtil.m83438g(qrCodeUtil, strM83439b, 0, 0, this, 6, null);
        if (obj == objF) {
            return objF;
        }
        j11 = jCurrentTimeMillis;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            WifiCreateActivity wifiCreateActivity = this.this$0;
            long j12 = this.$duration;
            ((AppCompatImageView) wifiCreateActivity.findViewById(R$id.ivTransWifiQrCode)).setImageBitmap(bitmap);
            wifiCreateActivity.isCanceled = false;
            C27132c.f82242a.m105588j(j12, System.currentTimeMillis() - j11);
            AbstractC24917a2 abstractC24917a2M99269c = C25220y0.m99269c();
            WifiCreateActivity$createSuccess$1$1$1 wifiCreateActivity$createSuccess$1$1$1 = new WifiCreateActivity$createSuccess$1$1$1(wifiCreateActivity, null);
            this.label = 2;
            if (AbstractC25088i.m98910g(abstractC24917a2M99269c, wifiCreateActivity$createSuccess$1$1$1, this) == objF) {
                return objF;
            }
        } else {
            WifiCreateActivity wifiCreateActivity2 = this.this$0;
            long j13 = this.$duration;
            C20136g.m83567d(C20136g.f63999a, wifiCreateActivity2.getClassTag() + " --> createSuccess() --> syncEncodeQRCode() --> 创建二维码失败了", false, 2, null);
            wifiCreateActivity2.m83505O0(103, j13);
        }
        return Unit.f75682a;
    }
}
