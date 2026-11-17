package com.transsion.room.sub.viewmodel.subscription;

import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.p282tn.lib.net.bean.BaseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import p716qq.InterfaceC27119a;
import p978zg.C29182a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.room.sub.viewmodel.subscription.SubscriptionViewModel$getSubscriptionStatsData$1", m97637f = "SubscriptionViewModel.kt", m97638l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m97639m = "invokeSuspend")
final class SubscriptionViewModel$getSubscriptionStatsData$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $uid;
    int label;
    final /* synthetic */ SubscriptionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionViewModel$getSubscriptionStatsData$1(SubscriptionViewModel subscriptionViewModel, String str, Continuation<? super SubscriptionViewModel$getSubscriptionStatsData$1> continuation) {
        super(2, continuation);
        this.this$0 = subscriptionViewModel;
        this.$uid = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubscriptionViewModel$getSubscriptionStatsData$1(this.this$0, this.$uid, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SubscriptionViewModel$getSubscriptionStatsData$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC27119a interfaceC27119a = this.this$0.f59521i;
                String strM111992a = C29182a.f89053a.m111992a();
                String str = this.$uid;
                this.label = 1;
                obj = interfaceC27119a.m105514a(strM111992a, str, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            this.this$0.m77358d().mo14855n(((BaseDto) obj).getData());
        } catch (Exception e11) {
            this.this$0.m77358d().mo14855n(null);
            e11.printStackTrace();
            C26866a.a aVar = C26866a.f81698a;
            String simpleName = SubscriptionViewModel.class.getSimpleName();
            Intrinsics.m97801g(simpleName, "getSimpleName(...)");
            aVar.m104915i(simpleName, "exceptionHandler " + e11.getMessage(), true);
        }
        return Unit.f75682a;
    }
}
