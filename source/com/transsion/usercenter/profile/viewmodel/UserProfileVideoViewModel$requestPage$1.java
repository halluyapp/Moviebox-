package com.transsion.usercenter.profile.viewmodel;

import com.cloud.tmc.kernel.constants.TmcConstants;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoList;
import java.util.ArrayList;
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
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.AbstractC25089i0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.usercenter.profile.viewmodel.UserProfileVideoViewModel$requestPage$1", m97637f = "UserProfileVideoViewModel.kt", m97638l = {129}, m97639m = "invokeSuspend")
final class UserProfileVideoViewModel$requestPage$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ boolean $isSelf;
    final /* synthetic */ String $pageToken;
    final /* synthetic */ String $uid;
    int label;
    final /* synthetic */ UserProfileVideoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserProfileVideoViewModel$requestPage$1(UserProfileVideoViewModel userProfileVideoViewModel, boolean z11, boolean z12, String str, String str2, Continuation<? super UserProfileVideoViewModel$requestPage$1> continuation) {
        super(2, continuation);
        this.this$0 = userProfileVideoViewModel;
        this.$isRefresh = z11;
        this.$isSelf = z12;
        this.$pageToken = str;
        this.$uid = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserProfileVideoViewModel$requestPage$1(this.this$0, this.$isRefresh, this.$isSelf, this.$pageToken, this.$uid, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UserProfileVideoViewModel$requestPage$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<UGCVideo> arrayList;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                AbstractC25089i0 abstractC25089i0M99268b = C25220y0.m99268b();
                UserProfileVideoViewModel$requestPage$1$dto$1 userProfileVideoViewModel$requestPage$1$dto$1 = new UserProfileVideoViewModel$requestPage$1$dto$1(this.$isSelf, this.this$0, this.$pageToken, this.$uid, null);
                this.label = 1;
                obj = AbstractC25088i.m98910g(abstractC25089i0M99268b, userProfileVideoViewModel$requestPage$1$dto$1, this);
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
            if (Intrinsics.m97797c(baseDto.getCode(), "0")) {
                UGCVideoList uGCVideoList = (UGCVideoList) baseDto.getData();
                this.this$0.f65374k.mo14858q(uGCVideoList);
                if (uGCVideoList == null || (arrayList = uGCVideoList.getItems()) == null) {
                    arrayList = new ArrayList<>();
                }
                if (this.$isRefresh) {
                    this.this$0.f65370g.clear();
                }
                if (!arrayList.isEmpty()) {
                    this.this$0.f65370g.addAll(arrayList);
                }
                Pager pager = uGCVideoList != null ? uGCVideoList.getPager() : null;
                this.this$0.f65369f = pager != null ? Intrinsics.m97797c(pager.getHasMore(), Boxing.m97631a(true)) : false;
                this.this$0.f65367d = pager != null ? pager.getNextPage() : null;
                this.this$0.f65376m.mo14858q(null);
                C26866a.f81698a.m104912c("UserProfileVideoVM", "requestPage success size=" + Boxing.m97634d(arrayList.size()) + " hasMore=" + this.this$0.f65369f, false);
            } else {
                this.this$0.f65376m.mo14858q(baseDto.getCode());
                this.this$0.f65374k.mo14858q(null);
                C26866a.f81698a.m104915i("UserProfileVideoVM", "requestPage failure code=" + baseDto.getCode(), false);
            }
        } catch (Exception e11) {
            this.this$0.f65376m.mo14858q(TmcConstants.COLD_OPEN_TYPE);
            this.this$0.f65374k.mo14858q(null);
            C26866a.f81698a.m104915i("UserProfileVideoVM", "requestPage exception: " + e11.getMessage(), false);
        } finally {
            this.this$0.f65371h.mo14858q(Boxing.m97631a(false));
            this.this$0.f65373j = false;
        }
        return Unit.f75682a;
    }
}
