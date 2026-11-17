package com.transsion.usercenter.profile.viewmodel;

import androidx.p1004lifecycle.C3187b0;
import com.blankj.utilcode.util.AbstractC5796o;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.usercenter.profile.bean.ToggleSubscriptionRequest;
import com.transsion.usercenter.profile.bean.ToggleSubscriptionResult;
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
import okhttp3.RequestBody;
import p411fh.C23367b;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.usercenter.profile.viewmodel.UserProfileViewModel$toggleSubscription$1", m97637f = "UserProfileViewModel.kt", m97638l = {130}, m97639m = "invokeSuspend")
final class UserProfileViewModel$toggleSubscription$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $subscribe;
    final /* synthetic */ String $targetUID;
    int label;
    final /* synthetic */ UserProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserProfileViewModel$toggleSubscription$1(String str, boolean z11, UserProfileViewModel userProfileViewModel, Continuation<? super UserProfileViewModel$toggleSubscription$1> continuation) {
        super(2, continuation);
        this.$targetUID = str;
        this.$subscribe = z11;
        this.this$0 = userProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserProfileViewModel$toggleSubscription$1(this.$targetUID, this.$subscribe, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UserProfileViewModel$toggleSubscription$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                String strM27447j = AbstractC5796o.m27447j(new ToggleSubscriptionRequest(this.$targetUID, this.$subscribe));
                C23367b.a aVar = C23367b.f71265a;
                Intrinsics.m97799e(strM27447j);
                RequestBody requestBodyM92796a = aVar.m92796a(strM27447j);
                AbstractC25089i0 abstractC25089i0M99268b = C25220y0.m99268b();
                UserProfileViewModel$toggleSubscription$1$dto$1 userProfileViewModel$toggleSubscription$1$dto$1 = new UserProfileViewModel$toggleSubscription$1$dto$1(this.this$0, requestBodyM92796a, null);
                this.label = 1;
                obj = AbstractC25088i.m98910g(abstractC25089i0M99268b, userProfileViewModel$toggleSubscription$1$dto$1, this);
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
                ToggleSubscriptionResult toggleSubscriptionResult = (ToggleSubscriptionResult) baseDto.getData();
                c3187b0.mo14858q(toggleSubscriptionResult != null ? Boxing.m97631a(toggleSubscriptionResult.isSubscribed()) : null);
            }
        } catch (Exception e11) {
            C26866a.f81698a.m104915i("UserProfileVM", "toggleSubscription error: " + e11.getMessage(), false);
            this.this$0.f65386h.mo14858q(null);
        }
        return Unit.f75682a;
    }
}
