package com.transsion.postdetail.p306ui.fragment;

import androidx.p1004lifecycle.Lifecycle;
import com.blankj.utilcode.util.AbstractC5796o;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.moviedetailapi.bean.PostSubjectBean;
import com.transsion.room.api.RoomHomeCacheEvent;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.ui.fragment.RoomPostExploreFragment$initViewModel$2$4", m97637f = "RoomPostExploreFragment.kt", m97638l = {163}, m97639m = "invokeSuspend")
final class RoomPostExploreFragment$initViewModel$2$4 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ PostSubjectBean $data;
    final /* synthetic */ Lifecycle $lifecycle;
    int label;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.RoomPostExploreFragment$initViewModel$2$4$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.ui.fragment.RoomPostExploreFragment$initViewModel$2$4$1", m97637f = "RoomPostExploreFragment.kt", m97638l = {}, m97639m = "invokeSuspend")
    @SourceDebugExtension
    static final class C170561 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Lifecycle $lifecycle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C170561(Lifecycle lifecycle, Continuation<? super C170561> continuation) {
            super(2, continuation);
            this.$lifecycle = lifecycle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C170561(this.$lifecycle, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C170561) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            if (this.$lifecycle.mo14833b().isAtLeast(Lifecycle.State.CREATED)) {
                RoomHomeCacheEvent roomHomeCacheEvent = new RoomHomeCacheEvent(true);
                FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
                String name = RoomHomeCacheEvent.class.getName();
                Intrinsics.m97801g(name, "getName(...)");
                flowEventBus.postEvent(name, roomHomeCacheEvent, 0L);
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoomPostExploreFragment$initViewModel$2$4(PostSubjectBean postSubjectBean, Lifecycle lifecycle, Continuation<? super RoomPostExploreFragment$initViewModel$2$4> continuation) {
        super(2, continuation);
        this.$data = postSubjectBean;
        this.$lifecycle = lifecycle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RoomPostExploreFragment$initViewModel$2$4(this.$data, this.$lifecycle, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((RoomPostExploreFragment$initViewModel$2$4) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            C14496b.f50966a.m65344b().putString("room_cache_data", AbstractC5796o.m27447j(this.$data));
            AbstractC24917a2 abstractC24917a2M99269c = C25220y0.m99269c();
            C170561 c170561 = new C170561(this.$lifecycle, null);
            this.label = 1;
            if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c170561, this) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        return Unit.f75682a;
    }
}
