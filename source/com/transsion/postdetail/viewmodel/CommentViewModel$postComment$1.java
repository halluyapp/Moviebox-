package com.transsion.postdetail.viewmodel;

import com.blankj.utilcode.util.AbstractC5796o;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.moviedetailapi.bean.CommentBean;
import com.transsion.postdetail.bean.CommentBody;
import com.transsion.postdetailapi.CommentTopicType;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
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
import okhttp3.RequestBody;
import p411fh.C23367b;
import p978zg.C29182a;
import p985zo.InterfaceC29208a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.viewmodel.CommentViewModel$postComment$1", m97637f = "CommentViewModel.kt", m97638l = {60}, m97639m = "invokeSuspend")
final class CommentViewModel$postComment$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ CommentBody $commentBody;
    final /* synthetic */ String $topicType;
    int label;
    final /* synthetic */ CommentViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.postdetail.viewmodel.CommentViewModel$postComment$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/moviedetailapi/bean/CommentBean;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.viewmodel.CommentViewModel$postComment$1$1", m97637f = "CommentViewModel.kt", m97638l = {Sdk$SDKMetric.SDKMetricType.AD_VALIDATION_TO_PRESENT_DURATION_MS_VALUE, Sdk$SDKMetric.SDKMetricType.AD_REWARD_USER_VALUE, Sdk$SDKMetric.SDKMetricType.AD_OPTIONAL_DOWNLOAD_DURATION_MS_VALUE}, m97639m = "invokeSuspend")
    static final class C174641 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ CommentBody $commentBody;
        final /* synthetic */ String $topicType;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ CommentViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C174641(CommentBody commentBody, String str, CommentViewModel commentViewModel, Continuation<? super C174641> continuation) {
            super(2, continuation);
            this.$commentBody = commentBody;
            this.$topicType = str;
            this.this$0 = commentViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C174641 c174641 = new C174641(this.$commentBody, this.$topicType, this.this$0, continuation);
            c174641.L$0 = obj;
            return c174641;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C174641) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00af A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            RequestBody requestBodyM92796a;
            InterfaceC24998b interfaceC24998b;
            BaseDto baseDto;
            Object data;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC24998b interfaceC24998b2 = (InterfaceC24998b) this.L$0;
                C23367b.a aVar = C23367b.f71265a;
                String strM27447j = AbstractC5796o.m27447j(this.$commentBody);
                Intrinsics.m97801g(strM27447j, "toJson(...)");
                requestBodyM92796a = aVar.m92796a(strM27447j);
                if (requestBodyM92796a != null) {
                    String str = this.$topicType;
                    CommentViewModel commentViewModel = this.this$0;
                    if (Intrinsics.m97797c(str, CommentTopicType.POST.getValue())) {
                        InterfaceC29208a interfaceC29208aM74985i = commentViewModel.m74985i();
                        String strM111992a = C29182a.f89053a.m111992a();
                        this.L$0 = interfaceC24998b2;
                        this.L$1 = requestBodyM92796a;
                        this.label = 1;
                        Object objM112047b = interfaceC29208aM74985i.m112047b(strM111992a, requestBodyM92796a, this);
                        if (objM112047b == objF) {
                            return objF;
                        }
                        interfaceC24998b = interfaceC24998b2;
                        obj = objM112047b;
                        baseDto = (BaseDto) obj;
                        data = baseDto.getData();
                        this.L$0 = requestBodyM92796a;
                        this.L$1 = null;
                        this.label = 3;
                        if (interfaceC24998b.emit(data, this) == objF) {
                            return objF;
                        }
                    } else {
                        InterfaceC29208a interfaceC29208aM74985i2 = commentViewModel.m74985i();
                        String strM111992a2 = C29182a.f89053a.m111992a();
                        this.L$0 = interfaceC24998b2;
                        this.L$1 = requestBodyM92796a;
                        this.label = 2;
                        Object objM112050e = interfaceC29208aM74985i2.m112050e(strM111992a2, requestBodyM92796a, this);
                        if (objM112050e == objF) {
                            return objF;
                        }
                        interfaceC24998b = interfaceC24998b2;
                        obj = objM112050e;
                        baseDto = (BaseDto) obj;
                        data = baseDto.getData();
                        this.L$0 = requestBodyM92796a;
                        this.L$1 = null;
                        this.label = 3;
                        if (interfaceC24998b.emit(data, this) == objF) {
                            return objF;
                        }
                    }
                }
            } else if (i11 == 1) {
                requestBodyM92796a = (RequestBody) this.L$1;
                interfaceC24998b = (InterfaceC24998b) this.L$0;
                ResultKt.m97107b(obj);
                baseDto = (BaseDto) obj;
                data = baseDto.getData();
                this.L$0 = requestBodyM92796a;
                this.L$1 = null;
                this.label = 3;
                if (interfaceC24998b.emit(data, this) == objF) {
                    return objF;
                }
            } else if (i11 == 2) {
                requestBodyM92796a = (RequestBody) this.L$1;
                interfaceC24998b = (InterfaceC24998b) this.L$0;
                ResultKt.m97107b(obj);
                baseDto = (BaseDto) obj;
                data = baseDto.getData();
                this.L$0 = requestBodyM92796a;
                this.L$1 = null;
                this.label = 3;
                if (interfaceC24998b.emit(data, this) == objF) {
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

    /* JADX INFO: renamed from: com.transsion.postdetail.viewmodel.CommentViewModel$postComment$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/moviedetailapi/bean/CommentBean;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.viewmodel.CommentViewModel$postComment$1$2", m97637f = "CommentViewModel.kt", m97638l = {Sdk$SDKMetric.SDKMetricType.INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE}, m97639m = "invokeSuspend")
    static final class C174652 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C174652(Continuation<? super C174652> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C174652 c174652 = new C174652(continuation);
            c174652.L$0 = interfaceC24998b;
            return c174652.invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC24998b interfaceC24998b = (InterfaceC24998b) this.L$0;
                C26866a.a.m104898f(C26866a.f81698a, "CommentViewModel", "post comment error", false, 4, null);
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

    /* JADX INFO: renamed from: com.transsion.postdetail.viewmodel.CommentViewModel$postComment$1$a */
    static final class C17466a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CommentViewModel f57861a;

        C17466a(CommentViewModel commentViewModel) {
            this.f57861a = commentViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(CommentBean commentBean, Continuation continuation) {
            this.f57861a.m74993n().mo14858q(commentBean);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentViewModel$postComment$1(CommentBody commentBody, String str, CommentViewModel commentViewModel, Continuation<? super CommentViewModel$postComment$1> continuation) {
        super(2, continuation);
        this.$commentBody = commentBody;
        this.$topicType = str;
        this.this$0 = commentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CommentViewModel$postComment$1(this.$commentBody, this.$topicType, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((CommentViewModel$postComment$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C174641(this.$commentBody, this.$topicType, this.this$0, null)), C25220y0.m99268b()), new C174652(null));
            C17466a c17466a = new C17466a(this.this$0);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c17466a, this) == objF) {
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
