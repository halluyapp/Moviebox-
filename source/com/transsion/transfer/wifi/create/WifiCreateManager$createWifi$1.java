package com.transsion.transfer.wifi.create;

import com.transsion.transfer.wifi.create.adapter.AbstractC20078b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p754rv.C27385a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.transfer.wifi.create.WifiCreateManager$createWifi$1", m97637f = "WifiCreateManager.kt", m97638l = {84}, m97639m = "invokeSuspend")
final class WifiCreateManager$createWifi$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC20073a $listener;
    final /* synthetic */ InterfaceC25149n0 $scope;
    final /* synthetic */ C27385a $wifiInfoModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WifiCreateManager$createWifi$1(InterfaceC20073a interfaceC20073a, C27385a c27385a, InterfaceC25149n0 interfaceC25149n0, Continuation<? super WifiCreateManager$createWifi$1> continuation) {
        super(2, continuation);
        this.$listener = interfaceC20073a;
        this.$wifiInfoModel = c27385a;
        this.$scope = interfaceC25149n0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WifiCreateManager$createWifi$1(this.$listener, this.$wifiInfoModel, this.$scope, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((WifiCreateManager$createWifi$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            WifiCreateManager wifiCreateManager = WifiCreateManager.f63911a;
            WifiCreateManager.f63912b = this.$listener;
            WifiCreateManager wifiCreateManager2 = WifiCreateManager.f63911a;
            wifiCreateManager2.onStart();
            if (WifiCreateManager.f63913c == null) {
                WifiCreateManager.f63913c = wifiCreateManager2.m83372i();
            }
            AbstractC20078b abstractC20078b = WifiCreateManager.f63913c;
            if (abstractC20078b != null) {
                C27385a c27385a = this.$wifiInfoModel;
                InterfaceC25149n0 interfaceC25149n0 = this.$scope;
                this.label = 1;
                if (abstractC20078b.m83409i(c27385a, wifiCreateManager2, interfaceC25149n0, this) == objF) {
                    return objF;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        return Unit.f75682a;
    }
}
