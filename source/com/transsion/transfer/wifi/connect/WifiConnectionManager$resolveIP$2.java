package com.transsion.transfer.wifi.connect;

import com.transsion.transfer.wifi.util.C20136g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.transfer.wifi.connect.WifiConnectionManager$resolveIP$2", m97637f = "WifiConnectionManager.kt", m97638l = {337}, m97639m = "invokeSuspend")
final class WifiConnectionManager$resolveIP$2 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;

    WifiConnectionManager$resolveIP$2(Continuation<? super WifiConnectionManager$resolveIP$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WifiConnectionManager$resolveIP$2(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((WifiConnectionManager$resolveIP$2) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            WifiConnectionManager wifiConnectionManager = WifiConnectionManager.f63861a;
            this.label = 1;
            obj = wifiConnectionManager.m83291p(this);
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
        if (StringsKt.m98132c0(str, "192.168", false, 2, null)) {
            C20136g c20136g = C20136g.f63999a;
            WifiConnectionManager wifiConnectionManager2 = WifiConnectionManager.f63861a;
            C20136g.m83567d(c20136g, wifiConnectionManager2.m83290o() + " --> resolveIP(netId: Int) --> 统级接入方添加Net成功，跳转传输页 ip = " + str, false, 2, null);
            wifiConnectionManager2.mo83302e(str);
        } else {
            C20136g c20136g2 = C20136g.f63999a;
            WifiConnectionManager wifiConnectionManager3 = WifiConnectionManager.f63861a;
            C20136g.m83567d(c20136g2, wifiConnectionManager3.m83290o() + " --> resolveIP(netId: Int) --> result->连接P2P失败 原因 = P2P地址获取异常，重试后仍然异常 ip = " + str, false, 2, null);
            wifiConnectionManager3.mo83299b(2002);
        }
        return Unit.f75682a;
    }
}
