package com.transsion.home.viewmodel;

import com.blankj.utilcode.util.AbstractC5796o;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.home.bean.RoomEntranceResponse;
import com.transsion.moviedetailapi.bean.RoomItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p842vl.C28123e;
import sl.InterfaceC27631e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.viewmodel.TrendingUGCViewModel$fetchGroupInfo$1", m97637f = "TrendingUGCViewModel.kt", m97638l = {368}, m97639m = "invokeSuspend")
final class TrendingUGCViewModel$fetchGroupInfo$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $useCache;
    int label;
    final /* synthetic */ TrendingUGCViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrendingUGCViewModel$fetchGroupInfo$1(TrendingUGCViewModel trendingUGCViewModel, Function0<Unit> function0, Continuation<? super TrendingUGCViewModel$fetchGroupInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = trendingUGCViewModel;
        this.$useCache = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrendingUGCViewModel$fetchGroupInfo$1(this.this$0, this.$useCache, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((TrendingUGCViewModel$fetchGroupInfo$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<RoomItem> groups;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC27631e interfaceC27631eM69006C = this.this$0.m69006C();
                this.label = 1;
                obj = InterfaceC27631e.a.m107496c(interfaceC27631eM69006C, null, 3, this, 1, null);
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
            RoomEntranceResponse roomEntranceResponse = (RoomEntranceResponse) baseDto.getData();
            if (roomEntranceResponse == null || (groups = roomEntranceResponse.getGroups()) == null || !(!groups.isEmpty())) {
                this.$useCache.invoke();
            } else {
                this.this$0.m69036B().mo14855n(baseDto.getData());
                C28123e.f86305a.m109233b().putString("trending_room_entrance_cache_v2", AbstractC5796o.m27447j(baseDto.getData()));
            }
        } catch (Exception e11) {
            this.$useCache.invoke();
            e11.printStackTrace();
        }
        return Unit.f75682a;
    }
}
