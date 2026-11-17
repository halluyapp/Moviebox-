package com.transsion.usercenter.profile.viewmodel;

import androidx.p1004lifecycle.C3187b0;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.usercenter.profile.bean.SubscriptionStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.AbstractC25089i0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.usercenter.profile.viewmodel.UserProfileViewModel$fetchSubscriptionStatus$1", m97637f = "UserProfileViewModel.kt", m97638l = {TmcConstants.NOTIFY_ADDHOME_GUIDE_BOTTOM_SHOW}, m97639m = "invokeSuspend")
final class UserProfileViewModel$fetchSubscriptionStatus$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $targetUID;
    int label;
    final /* synthetic */ UserProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserProfileViewModel$fetchSubscriptionStatus$1(UserProfileViewModel userProfileViewModel, String str, Continuation<? super UserProfileViewModel$fetchSubscriptionStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = userProfileViewModel;
        this.$targetUID = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserProfileViewModel$fetchSubscriptionStatus$1(this.this$0, this.$targetUID, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UserProfileViewModel$fetchSubscriptionStatus$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                AbstractC25089i0 abstractC25089i0M99268b = C25220y0.m99268b();
                UserProfileViewModel$fetchSubscriptionStatus$1$dto$1 userProfileViewModel$fetchSubscriptionStatus$1$dto$1 = new UserProfileViewModel$fetchSubscriptionStatus$1$dto$1(this.this$0, this.$targetUID, null);
                this.label = 1;
                obj = AbstractC25088i.m98910g(abstractC25089i0M99268b, userProfileViewModel$fetchSubscriptionStatus$1$dto$1, this);
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
            if (!Intrinsics.m97797c(baseDto.getCode(), "0") || baseDto.getData() == null) {
                this.this$0.f65386h.mo14858q(null);
            } else {
                C3187b0 c3187b0 = this.this$0.f65386h;
                SubscriptionStatus subscriptionStatus = (SubscriptionStatus) baseDto.getData();
                c3187b0.mo14858q(subscriptionStatus != null ? Boxing.m97631a(subscriptionStatus.isSubscribed()) : null);
            }
        } catch (Exception e11) {
            C26866a.f81698a.m104915i("UserProfileVM", "fetchSubscriptionStatus error: " + e11.getMessage(), false);
            this.this$0.f65386h.mo14858q(null);
        }
        return Unit.f75682a;
    }
}
