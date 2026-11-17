package com.transsion.room.sub.viewmodel.likes;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.room.sub.bean.likes.GetUgcVideoLikesBean;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.List;
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
import kotlinx.coroutines.InterfaceC25149n0;
import p685pq.InterfaceC26930a;
import p978zg.C29182a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.room.sub.viewmodel.likes.UgcLikesViewModel$getUgcVideoLikesBean$1", m97637f = "UgcLikesViewModel.kt", m97638l = {Sdk$SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE}, m97639m = "invokeSuspend")
final class UgcLikesViewModel$getUgcVideoLikesBean$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $page;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ UgcLikesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UgcLikesViewModel$getUgcVideoLikesBean$1(String str, String str2, UgcLikesViewModel ugcLikesViewModel, Continuation<? super UgcLikesViewModel$getUgcVideoLikesBean$1> continuation) {
        super(2, continuation);
        this.$page = str;
        this.$userId = str2;
        this.this$0 = ugcLikesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcLikesViewModel$getUgcVideoLikesBean$1(this.$page, this.$userId, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UgcLikesViewModel$getUgcVideoLikesBean$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<UGCVideo> items;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                C26866a.a aVar = C26866a.f81698a;
                C26866a.a.m104898f(aVar, "UgcLikesViewModel", "Likes page:" + this.$page, false, 4, null);
                C26866a.a.m104898f(aVar, "UgcLikesViewModel", "Likes perPage:" + UgcLikesViewModel.f59493j, false, 4, null);
                C26866a.a.m104898f(aVar, "UgcLikesViewModel", "Likes userId:" + this.$userId, false, 4, null);
                InterfaceC26930a interfaceC26930a = this.this$0.f59496d;
                String strM111992a = C29182a.f89053a.m111992a();
                String str = this.$page;
                int i12 = UgcLikesViewModel.f59493j;
                String str2 = this.$userId;
                this.label = 1;
                obj = interfaceC26930a.m105059b(strM111992a, str, i12, str2, this);
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
            C26866a.a aVar2 = C26866a.f81698a;
            C26866a.a.m104898f(aVar2, "UgcLikesViewModel", "Likes getUgcVideoLikesBean " + baseDto, false, 4, null);
            GetUgcVideoLikesBean getUgcVideoLikesBean = (GetUgcVideoLikesBean) baseDto.getData();
            C26866a.a.m104898f(aVar2, "UgcLikesViewModel", "Likes getUgcVideoLikesBean size:" + ((getUgcVideoLikesBean == null || (items = getUgcVideoLikesBean.getItems()) == null) ? null : Boxing.m97634d(items.size())), false, 4, null);
            this.this$0.m77337f().mo14855n(baseDto.getData());
        } catch (Exception e11) {
            e11.printStackTrace();
            C26866a.a aVar3 = C26866a.f81698a;
            String simpleName = UgcLikesViewModel.class.getSimpleName();
            Intrinsics.m97801g(simpleName, "getSimpleName(...)");
            aVar3.m104915i(simpleName, "exceptionHandler " + e11.getMessage(), true);
        }
        return Unit.f75682a;
    }
}
