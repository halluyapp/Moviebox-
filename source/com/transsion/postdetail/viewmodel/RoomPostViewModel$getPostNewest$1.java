package com.transsion.postdetail.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.moviedetailapi.bean.PostSubjectBean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC24995a;
import kotlinx.coroutines.flow.InterfaceC24998b;
import p978zg.C29182a;
import p985zo.InterfaceC29210c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.viewmodel.RoomPostViewModel$getPostNewest$1", m97637f = "RoomPostViewModel.kt", m97638l = {543}, m97639m = "invokeSuspend")
final class RoomPostViewModel$getPostNewest$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $groupId;
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ String $page;
    final /* synthetic */ int $perPage;
    final /* synthetic */ String $sortType;
    final /* synthetic */ boolean $with;
    int label;
    final /* synthetic */ RoomPostViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.postdetail.viewmodel.RoomPostViewModel$getPostNewest$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/moviedetailapi/bean/PostSubjectBean;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.viewmodel.RoomPostViewModel$getPostNewest$1$1", m97637f = "RoomPostViewModel.kt", m97638l = {530, 538}, m97639m = "invokeSuspend")
    static final class C174931 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $page;
        final /* synthetic */ int $perPage;
        final /* synthetic */ String $sortType;
        final /* synthetic */ boolean $with;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RoomPostViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C174931(RoomPostViewModel roomPostViewModel, String str, String str2, int i11, String str3, boolean z11, Continuation<? super C174931> continuation) {
            super(2, continuation);
            this.this$0 = roomPostViewModel;
            this.$groupId = str;
            this.$page = str2;
            this.$perPage = i11;
            this.$sortType = str3;
            this.$with = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C174931 c174931 = new C174931(this.this$0, this.$groupId, this.$page, this.$perPage, this.$sortType, this.$with, continuation);
            c174931.L$0 = obj;
            return c174931;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C174931) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC24998b interfaceC24998b;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    interfaceC24998b = (InterfaceC24998b) this.L$0;
                    ResultKt.m97107b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(obj);
                }
                return Unit.f75682a;
            }
            ResultKt.m97107b(obj);
            interfaceC24998b = (InterfaceC24998b) this.L$0;
            InterfaceC29210c interfaceC29210cM75074S = this.this$0.m75074S();
            String strM111992a = C29182a.f89053a.m111992a();
            String str = this.$groupId;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            String str3 = this.$page;
            if (str3 == null) {
                str3 = "0";
            }
            int i12 = this.$perPage;
            String str4 = this.$sortType;
            boolean z11 = this.$with;
            this.L$0 = interfaceC24998b;
            this.label = 1;
            obj = interfaceC29210cM75074S.m112070g(strM111992a, str2, str3, i12, str4, z11, this);
            if (obj == objF) {
                return objF;
            }
            Object data = ((BaseDto) obj).getData();
            this.L$0 = null;
            this.label = 2;
            if (interfaceC24998b.emit(data, this) == objF) {
                return objF;
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.viewmodel.RoomPostViewModel$getPostNewest$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/moviedetailapi/bean/PostSubjectBean;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.viewmodel.RoomPostViewModel$getPostNewest$1$2", m97637f = "RoomPostViewModel.kt", m97638l = {541}, m97639m = "invokeSuspend")
    static final class C174942 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C174942(Continuation<? super C174942> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C174942 c174942 = new C174942(continuation);
            c174942.L$0 = interfaceC24998b;
            return c174942.invokeSuspend(Unit.f75682a);
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

    /* JADX INFO: renamed from: com.transsion.postdetail.viewmodel.RoomPostViewModel$getPostNewest$1$a */
    static final class C17495a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f57916a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ RoomPostViewModel f57917b;

        C17495a(boolean z11, RoomPostViewModel roomPostViewModel) {
            this.f57916a = z11;
            this.f57917b = roomPostViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(PostSubjectBean postSubjectBean, Continuation continuation) {
            if (postSubjectBean != null) {
                postSubjectBean.setRefresh(this.f57916a);
            }
            this.f57917b.f57899i.mo14855n(postSubjectBean);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoomPostViewModel$getPostNewest$1(RoomPostViewModel roomPostViewModel, String str, String str2, int i11, String str3, boolean z11, boolean z12, Continuation<? super RoomPostViewModel$getPostNewest$1> continuation) {
        super(2, continuation);
        this.this$0 = roomPostViewModel;
        this.$groupId = str;
        this.$page = str2;
        this.$perPage = i11;
        this.$sortType = str3;
        this.$with = z11;
        this.$isRefresh = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RoomPostViewModel$getPostNewest$1(this.this$0, this.$groupId, this.$page, this.$perPage, this.$sortType, this.$with, this.$isRefresh, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((RoomPostViewModel$getPostNewest$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C174931(this.this$0, this.$groupId, this.$page, this.$perPage, this.$sortType, this.$with, null)), C25220y0.m99268b()), new C174942(null));
            C17495a c17495a = new C17495a(this.$isRefresh, this.this$0);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c17495a, this) == objF) {
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
