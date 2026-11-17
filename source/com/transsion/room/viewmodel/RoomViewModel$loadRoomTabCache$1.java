package com.transsion.room.viewmodel;

import com.blankj.utilcode.util.AbstractC5796o;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.moviedetailapi.bean.RoomTabBean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.room.viewmodel.RoomViewModel$loadRoomTabCache$1", m97637f = "RoomViewModel.kt", m97638l = {}, m97639m = "invokeSuspend")
final class RoomViewModel$loadRoomTabCache$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RoomViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoomViewModel$loadRoomTabCache$1(RoomViewModel roomViewModel, Continuation<? super RoomViewModel$loadRoomTabCache$1> continuation) {
        super(2, continuation);
        this.this$0 = roomViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RoomViewModel$loadRoomTabCache$1 roomViewModel$loadRoomTabCache$1 = new RoomViewModel$loadRoomTabCache$1(this.this$0, continuation);
        roomViewModel$loadRoomTabCache$1.L$0 = obj;
        return roomViewModel$loadRoomTabCache$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((RoomViewModel$loadRoomTabCache$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        RoomViewModel roomViewModel = this.this$0;
        try {
            Result.Companion companion = Result.INSTANCE;
            RoomTabBean roomTabBean = null;
            String string = C14496b.f50966a.m65344b().getString("k_room_tab_cache", null);
            if (string == null || string.length() == 0) {
                string = roomViewModel.m77425M();
            }
            try {
                roomTabBean = (RoomTabBean) AbstractC5796o.m27441d(string, RoomTabBean.class);
            } catch (Throwable unused) {
            }
            roomViewModel.f59564d.mo14855n(roomTabBean);
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        return Unit.f75682a;
    }
}
