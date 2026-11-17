package com.transsion.postdetail.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.postdetailapi.CommentTopicType;
import com.vungle.ads.internal.protos.Sdk$SDKError;
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
import p978zg.C29182a;
import p985zo.InterfaceC29208a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.viewmodel.CommentViewModel$deleteComment$1", m97637f = "CommentViewModel.kt", m97638l = {144}, m97639m = "invokeSuspend")
final class CommentViewModel$deleteComment$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $commentId;
    final /* synthetic */ String $topicType;
    int label;
    final /* synthetic */ CommentViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.postdetail.viewmodel.CommentViewModel$deleteComment$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/tn/lib/net/bean/BaseDto;", "", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.viewmodel.CommentViewModel$deleteComment$1$1", m97637f = "CommentViewModel.kt", m97638l = {134, Sdk$SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 139}, m97639m = "invokeSuspend")
    static final class C174521 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $commentId;
        final /* synthetic */ String $topicType;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CommentViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C174521(String str, CommentViewModel commentViewModel, String str2, Continuation<? super C174521> continuation) {
            super(2, continuation);
            this.$topicType = str;
            this.this$0 = commentViewModel;
            this.$commentId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C174521 c174521 = new C174521(this.$topicType, this.this$0, this.$commentId, continuation);
            c174521.L$0 = obj;
            return c174521;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C174521) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x007d  */
        /* JADX WARN: Code duplicated, block: B:26:0x008d A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC24998b interfaceC24998b;
            BaseDto baseDto;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                interfaceC24998b = (InterfaceC24998b) this.L$0;
                if (Intrinsics.m97797c(this.$topicType, CommentTopicType.POST.getValue())) {
                    InterfaceC29208a interfaceC29208aM74985i = this.this$0.m74985i();
                    String strM111992a = C29182a.f89053a.m111992a();
                    String str = this.$commentId;
                    this.L$0 = interfaceC24998b;
                    this.label = 1;
                    obj = interfaceC29208aM74985i.m112048c(strM111992a, str, this);
                    if (obj == objF) {
                        return objF;
                    }
                    baseDto = (BaseDto) obj;
                    if (baseDto != null) {
                        baseDto.setData(this.$commentId);
                    }
                    this.L$0 = null;
                    this.label = 3;
                    if (interfaceC24998b.emit(baseDto, this) == objF) {
                        return objF;
                    }
                } else {
                    InterfaceC29208a interfaceC29208aM74985i2 = this.this$0.m74985i();
                    String strM111992a2 = C29182a.f89053a.m111992a();
                    String str2 = this.$commentId;
                    this.L$0 = interfaceC24998b;
                    this.label = 2;
                    obj = interfaceC29208aM74985i2.m112049d(strM111992a2, str2, this);
                    if (obj == objF) {
                        return objF;
                    }
                    baseDto = (BaseDto) obj;
                    if (baseDto != null) {
                        baseDto.setData(this.$commentId);
                    }
                    this.L$0 = null;
                    this.label = 3;
                    if (interfaceC24998b.emit(baseDto, this) == objF) {
                        return objF;
                    }
                }
            } else if (i11 == 1) {
                interfaceC24998b = (InterfaceC24998b) this.L$0;
                ResultKt.m97107b(obj);
                baseDto = (BaseDto) obj;
                if (baseDto != null) {
                    baseDto.setData(this.$commentId);
                }
                this.L$0 = null;
                this.label = 3;
                if (interfaceC24998b.emit(baseDto, this) == objF) {
                    return objF;
                }
            } else if (i11 == 2) {
                interfaceC24998b = (InterfaceC24998b) this.L$0;
                ResultKt.m97107b(obj);
                baseDto = (BaseDto) obj;
                if (baseDto != null) {
                    baseDto.setData(this.$commentId);
                }
                this.L$0 = null;
                this.label = 3;
                if (interfaceC24998b.emit(baseDto, this) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.viewmodel.CommentViewModel$deleteComment$1$2 */
    @Metadata(m97099d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/tn/lib/net/bean/BaseDto;", "", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.viewmodel.CommentViewModel$deleteComment$1$2", m97637f = "CommentViewModel.kt", m97638l = {143}, m97639m = "invokeSuspend")
    static final class C174532 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CommentViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C174532(CommentViewModel commentViewModel, Continuation<? super C174532> continuation) {
            super(3, continuation);
            this.this$0 = commentViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C174532 c174532 = new C174532(this.this$0, continuation);
            c174532.L$0 = interfaceC24998b;
            return c174532.invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC24998b interfaceC24998b = (InterfaceC24998b) this.L$0;
                this.this$0.m74986r("delete comment error");
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

    /* JADX INFO: renamed from: com.transsion.postdetail.viewmodel.CommentViewModel$deleteComment$1$a */
    static final class C17454a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CommentViewModel f57856a;

        C17454a(CommentViewModel commentViewModel) {
            this.f57856a = commentViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(BaseDto baseDto, Continuation continuation) {
            this.f57856a.m74989j().mo14858q(baseDto);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentViewModel$deleteComment$1(String str, CommentViewModel commentViewModel, String str2, Continuation<? super CommentViewModel$deleteComment$1> continuation) {
        super(2, continuation);
        this.$topicType = str;
        this.this$0 = commentViewModel;
        this.$commentId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CommentViewModel$deleteComment$1(this.$topicType, this.this$0, this.$commentId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((CommentViewModel$deleteComment$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C174521(this.$topicType, this.this$0, this.$commentId, null)), C25220y0.m99268b()), new C174532(this.this$0, null));
            C17454a c17454a = new C17454a(this.this$0);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c17454a, this) == objF) {
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
