package com.transsion.usercenter.profile.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.usercenter.profile.InterfaceC20650c;
import com.transsion.usercenter.profile.bean.ToggleSubscriptionResult;
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
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "Lcom/tn/lib/net/bean/BaseDto;", "Lcom/transsion/usercenter/profile/bean/ToggleSubscriptionResult;", "<anonymous>", "(Lkotlinx/coroutines/n0;)Lcom/tn/lib/net/bean/BaseDto;"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.usercenter.profile.viewmodel.UserProfileViewModel$toggleSubscription$1$dto$1", m97637f = "UserProfileViewModel.kt", m97638l = {Sdk$SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE}, m97639m = "invokeSuspend")
final class UserProfileViewModel$toggleSubscription$1$dto$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super BaseDto<ToggleSubscriptionResult>>, Object> {
    final /* synthetic */ RequestBody $body;
    int label;
    final /* synthetic */ UserProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserProfileViewModel$toggleSubscription$1$dto$1(UserProfileViewModel userProfileViewModel, RequestBody requestBody, Continuation<? super UserProfileViewModel$toggleSubscription$1$dto$1> continuation) {
        super(2, continuation);
        this.this$0 = userProfileViewModel;
        this.$body = requestBody;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserProfileViewModel$toggleSubscription$1$dto$1(this.this$0, this.$body, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super BaseDto<ToggleSubscriptionResult>> continuation) {
        return ((UserProfileViewModel$toggleSubscription$1$dto$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC20650c interfaceC20650cM85566m = this.this$0.m85566m();
            RequestBody requestBody = this.$body;
            this.label = 1;
            obj = InterfaceC20650c.a.m85305b(interfaceC20650cM85566m, null, requestBody, this, 1, null);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        return obj;
    }
}
