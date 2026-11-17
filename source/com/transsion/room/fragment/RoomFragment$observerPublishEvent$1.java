package com.transsion.room.fragment;

import com.transsion.moviedetailapi.bean.RoomItem;
import com.transsion.room.adapter.C18039d;
import com.transsnet.flow.event.sync.event.PublishEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.room.fragment.RoomFragment$observerPublishEvent$1", m97637f = "RoomFragment.kt", m97638l = {}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class RoomFragment$observerPublishEvent$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RoomFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoomFragment$observerPublishEvent$1(RoomFragment roomFragment, Continuation<? super RoomFragment$observerPublishEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = roomFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Unit m76918d(RoomFragment roomFragment, PublishEvent publishEvent) {
        List<Object> data;
        C18039d c18039d = roomFragment.mHotAdapter;
        if (c18039d != null && (data = c18039d.getData()) != null) {
            int i11 = 0;
            for (Object obj : data) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                RoomItem roomItem = (RoomItem) obj;
                if (Intrinsics.m97797c(publishEvent.getGroupId(), roomItem.getGroupId())) {
                    Long postCount = roomItem.getPostCount();
                    roomItem.setPostCount(postCount != null ? Long.valueOf(postCount.longValue() + 1) : null);
                    C18039d c18039d2 = roomFragment.mHotAdapter;
                    if (c18039d2 != null) {
                        c18039d2.notifyItemChanged(i11);
                    }
                    return Unit.f75682a;
                }
                i11 = i12;
            }
        }
        return Unit.f75682a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RoomFragment$observerPublishEvent$1 roomFragment$observerPublishEvent$1 = new RoomFragment$observerPublishEvent$1(this.this$0, continuation);
        roomFragment$observerPublishEvent$1.L$0 = obj;
        return roomFragment$observerPublishEvent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((RoomFragment$observerPublishEvent$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        InterfaceC25149n0 interfaceC25149n0 = (InterfaceC25149n0) this.L$0;
        final RoomFragment roomFragment = this.this$0;
        AbstractC25136k.m99058d(interfaceC25149n0, null, null, new C18073xa2d5c46b(false, new Function1() { // from class: com.transsion.room.fragment.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return RoomFragment$observerPublishEvent$1.m76918d(roomFragment, (PublishEvent) obj2);
            }
        }, null), 3, null);
        return Unit.f75682a;
    }
}
