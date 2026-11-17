package com.transsion.transfer.wifi.connect;

import android.text.TextUtils;
import com.transsion.transfer.wifi.util.C20136g;
import com.transsion.transfer.wifi.util.WifiUtils;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.transfer.wifi.connect.WifiConnectionManager$resolveIP$1", m97637f = "WifiConnectionManager.kt", m97638l = {Sdk$SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE}, m97639m = "invokeSuspend")
final class WifiConnectionManager$resolveIP$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;

    WifiConnectionManager$resolveIP$1(Continuation<? super WifiConnectionManager$resolveIP$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WifiConnectionManager$resolveIP$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((WifiConnectionManager$resolveIP$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            C20136g.m83566b(C20136g.f63999a, WifiConnectionManager.f63861a.m83290o() + " --> resolveIP(address: InetAddress?) --> P2P连接成功但ip为空，尝试轮询获取正确ip ....", false, 2, null);
            WifiUtils wifiUtils = WifiUtils.f63989a;
            this.label = 1;
            obj = wifiUtils.m83534h(this);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            long jCurrentTimeMillis = System.currentTimeMillis() - WifiConnectionManager.f63869i;
            C20136g c20136g = C20136g.f63999a;
            WifiConnectionManager wifiConnectionManager = WifiConnectionManager.f63861a;
            C20136g.m83566b(c20136g, wifiConnectionManager.m83290o() + " --> resolveIP(address: InetAddress?) --> 连接P2P失败, 耗时 = " + jCurrentTimeMillis + " -- 原因 = P2P地址获取异常，重试后仍然异常", false, 2, null);
            wifiConnectionManager.mo83299b(2002);
        } else {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - WifiConnectionManager.f63869i;
            C20136g c20136g2 = C20136g.f63999a;
            WifiConnectionManager wifiConnectionManager2 = WifiConnectionManager.f63861a;
            C20136g.m83566b(c20136g2, wifiConnectionManager2.m83290o() + " --> resolveIP(address: InetAddress?) --> P2P连接成功轮询后成功连接耗时 = " + jCurrentTimeMillis2 + " -- P2P连接成功轮询后ip = " + str, false, 2, null);
            wifiConnectionManager2.mo83302e(str);
        }
        return Unit.f75682a;
    }
}
