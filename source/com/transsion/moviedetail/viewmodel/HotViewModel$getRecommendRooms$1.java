package com.transsion.moviedetail.viewmodel;

import com.blankj.utilcode.util.AbstractC5796o;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.moviedetailapi.bean.RoomBean;
import com.transsion.room.api.bean.RoomRequestEntity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC24995a;
import kotlinx.coroutines.flow.InterfaceC24998b;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p523jn.InterfaceC24449a;
import p978zg.C29182a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.moviedetail.viewmodel.HotViewModel$getRecommendRooms$1", m97637f = "HotViewModel.kt", m97638l = {173}, m97639m = "invokeSuspend")
final class HotViewModel$getRecommendRooms$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $page;
    final /* synthetic */ int $perPage;
    int label;
    final /* synthetic */ HotViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.moviedetail.viewmodel.HotViewModel$getRecommendRooms$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/moviedetailapi/bean/RoomBean;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.moviedetail.viewmodel.HotViewModel$getRecommendRooms$1$1", m97637f = "HotViewModel.kt", m97638l = {153, 164, 166, 168}, m97639m = "invokeSuspend")
    static final class C161821 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $page;
        final /* synthetic */ int $perPage;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HotViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C161821(HotViewModel hotViewModel, String str, int i11, Continuation<? super C161821> continuation) {
            super(2, continuation);
            this.this$0 = hotViewModel;
            this.$page = str;
            this.$perPage = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C161821 c161821 = new C161821(this.this$0, this.$page, this.$perPage, continuation);
            c161821.L$0 = obj;
            return c161821;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C161821) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:28:0x00ac A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:31:0x00bb A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC24998b interfaceC24998b;
            Object objM95933b;
            BaseDto baseDto;
            Object data;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                interfaceC24998b = (InterfaceC24998b) this.L$0;
                if (this.this$0.m70869f0() == null) {
                    this.label = 1;
                    if (interfaceC24998b.emit(null, this) == objF) {
                        return objF;
                    }
                    return Unit.f75682a;
                }
                RequestBody.Companion companion = RequestBody.INSTANCE;
                String strM27447j = AbstractC5796o.m27447j(new RoomRequestEntity(this.$page, this.$perPage, 0, null, null, this.this$0.m70869f0(), 24, null));
                Intrinsics.m97801g(strM27447j, "toJson(...)");
                RequestBody requestBodyCreate = companion.create(strM27447j, MediaType.INSTANCE.parse("application/json"));
                InterfaceC24449a interfaceC24449aM70859e0 = this.this$0.m70859e0();
                String strM111992a = C29182a.f89053a.m111992a();
                this.L$0 = interfaceC24998b;
                this.label = 2;
                objM95933b = interfaceC24449aM70859e0.m95933b(strM111992a, requestBodyCreate, this);
                if (objM95933b == objF) {
                    return objF;
                }
                baseDto = (BaseDto) objM95933b;
                if (Intrinsics.m97797c(baseDto.getCode(), "0")) {
                    data = baseDto.getData();
                    this.L$0 = null;
                    this.label = 4;
                    if (interfaceC24998b.emit(data, this) == objF) {
                        return objF;
                    }
                } else {
                    this.L$0 = null;
                    this.label = 3;
                    if (interfaceC24998b.emit(null, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i11 == 1) {
                    ResultKt.m97107b(obj);
                    return Unit.f75682a;
                }
                if (i11 == 2) {
                    interfaceC24998b = (InterfaceC24998b) this.L$0;
                    ResultKt.m97107b(obj);
                    objM95933b = obj;
                    baseDto = (BaseDto) objM95933b;
                    if (Intrinsics.m97797c(baseDto.getCode(), "0")) {
                        this.L$0 = null;
                        this.label = 3;
                        if (interfaceC24998b.emit(null, this) == objF) {
                            return objF;
                        }
                    } else {
                        data = baseDto.getData();
                        this.L$0 = null;
                        this.label = 4;
                        if (interfaceC24998b.emit(data, this) == objF) {
                            return objF;
                        }
                    }
                } else {
                    if (i11 != 3 && i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(obj);
                }
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.viewmodel.HotViewModel$getRecommendRooms$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/moviedetailapi/bean/RoomBean;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.moviedetail.viewmodel.HotViewModel$getRecommendRooms$1$2", m97637f = "HotViewModel.kt", m97638l = {172}, m97639m = "invokeSuspend")
    static final class C161832 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C161832(Continuation<? super C161832> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C161832 c161832 = new C161832(continuation);
            c161832.L$0 = interfaceC24998b;
            return c161832.invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC24998b interfaceC24998b = (InterfaceC24998b) this.L$0;
                this.label = 1;
                if (interfaceC24998b.emit(null, this) == objF) {
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

    /* JADX INFO: renamed from: com.transsion.moviedetail.viewmodel.HotViewModel$getRecommendRooms$1$a */
    static final class C16184a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ HotViewModel f54969a;

        C16184a(HotViewModel hotViewModel) {
            this.f54969a = hotViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(RoomBean roomBean, Continuation continuation) {
            this.f54969a.f54966p.mo14855n(roomBean);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotViewModel$getRecommendRooms$1(HotViewModel hotViewModel, String str, int i11, Continuation<? super HotViewModel$getRecommendRooms$1> continuation) {
        super(2, continuation);
        this.this$0 = hotViewModel;
        this.$page = str;
        this.$perPage = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HotViewModel$getRecommendRooms$1(this.this$0, this.$page, this.$perPage, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((HotViewModel$getRecommendRooms$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C161821(this.this$0, this.$page, this.$perPage, null)), C25220y0.m99268b()), new C161832(null));
            C16184a c16184a = new C16184a(this.this$0);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c16184a, this) == objF) {
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
