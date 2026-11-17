package com.transsion.room.sub.viewmodel.subscription;

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
@DebugMetadata(m97636c = "com.transsion.room.sub.viewmodel.subscription.SubscriptionFeedListViewModel$getSubscriptionFeedData$1", m97637f = "SubscriptionFeedListViewModel.kt", m97638l = {92}, m97639m = "invokeSuspend")
final class SubscriptionFeedListViewModel$getSubscriptionFeedData$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cursor;
    int label;
    final /* synthetic */ SubscriptionFeedListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionFeedListViewModel$getSubscriptionFeedData$1(SubscriptionFeedListViewModel subscriptionFeedListViewModel, String str, Continuation<? super SubscriptionFeedListViewModel$getSubscriptionFeedData$1> continuation) {
        super(2, continuation);
        this.this$0 = subscriptionFeedListViewModel;
        this.$cursor = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubscriptionFeedListViewModel$getSubscriptionFeedData$1(this.this$0, this.$cursor, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SubscriptionFeedListViewModel$getSubscriptionFeedData$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC27119a interfaceC27119a = this.this$0.f59511d;
                String strM111992a = C29182a.f89053a.m111992a();
                String strValueOf = String.valueOf(this.$cursor);
                int i12 = SubscriptionFeedListViewModel.f59508g;
                this.label = 1;
                obj = interfaceC27119a.m105515b(strM111992a, strValueOf, i12, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            BaseDto baseDto = (BaseDto) obj;
            Object data = baseDto.getData();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Feed List: ");
            sb2.append(data);
            this.this$0.m77352e().mo14855n(baseDto.getData());
        } catch (Exception e11) {
            e11.printStackTrace();
            C26866a.a aVar = C26866a.f81698a;
            String simpleName = SubscriptionFeedListViewModel.class.getSimpleName();
            Intrinsics.m97801g(simpleName, "getSimpleName(...)");
            aVar.m104915i(simpleName, "exceptionHandler " + e11.getMessage(), true);
        }
        return Unit.f75682a;
    }
}
