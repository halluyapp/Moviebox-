package com.transsion.postdetail.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.postdetail.bean.CommentListBean;
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
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC24995a;
import kotlinx.coroutines.flow.InterfaceC24998b;
import p978zg.C29182a;
import p985zo.InterfaceC29208a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.viewmodel.PostDetailCommentsFragmentViewModel$getCommentList$1", m97637f = "PostDetailCommentsFragmentViewModel.kt", m97638l = {Sdk$SDKMetric.SDKMetricType.AD_VALIDATION_TO_PRESENT_DURATION_MS_VALUE}, m97639m = "invokeSuspend")
final class PostDetailCommentsFragmentViewModel$getCommentList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $page;
    final /* synthetic */ int $perPage;
    final /* synthetic */ String $postId;
    final /* synthetic */ String $rootCommentId;
    int label;
    final /* synthetic */ PostDetailCommentsFragmentViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.postdetail.viewmodel.PostDetailCommentsFragmentViewModel$getCommentList$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/postdetail/bean/CommentListBean;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.viewmodel.PostDetailCommentsFragmentViewModel$getCommentList$1$1", m97637f = "PostDetailCommentsFragmentViewModel.kt", m97638l = {42, 45}, m97639m = "invokeSuspend")
    static final class C174671 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $page;
        final /* synthetic */ int $perPage;
        final /* synthetic */ String $postId;
        final /* synthetic */ String $rootCommentId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PostDetailCommentsFragmentViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C174671(PostDetailCommentsFragmentViewModel postDetailCommentsFragmentViewModel, String str, String str2, String str3, int i11, Continuation<? super C174671> continuation) {
            super(2, continuation);
            this.this$0 = postDetailCommentsFragmentViewModel;
            this.$postId = str;
            this.$rootCommentId = str2;
            this.$page = str3;
            this.$perPage = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C174671 c174671 = new C174671(this.this$0, this.$postId, this.$rootCommentId, this.$page, this.$perPage, continuation);
            c174671.L$0 = obj;
            return c174671;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C174671) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
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
            InterfaceC29208a interfaceC29208aM75018f = this.this$0.m75018f();
            String strM111992a = C29182a.f89053a.m111992a();
            String str = this.$postId;
            String str2 = this.$rootCommentId;
            String str3 = this.$page;
            int i12 = this.$perPage;
            this.L$0 = interfaceC24998b;
            this.label = 1;
            obj = interfaceC29208aM75018f.m112052g(strM111992a, str, "POST", str2, str3, "", i12, this);
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

    /* JADX INFO: renamed from: com.transsion.postdetail.viewmodel.PostDetailCommentsFragmentViewModel$getCommentList$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/postdetail/bean/CommentListBean;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.viewmodel.PostDetailCommentsFragmentViewModel$getCommentList$1$2", m97637f = "PostDetailCommentsFragmentViewModel.kt", m97638l = {Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE}, m97639m = "invokeSuspend")
    static final class C174682 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C174682(Continuation<? super C174682> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C174682 c174682 = new C174682(continuation);
            c174682.L$0 = interfaceC24998b;
            return c174682.invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC24998b interfaceC24998b = (InterfaceC24998b) this.L$0;
                C26866a.a.m104898f(C26866a.f81698a, "CommentViewModel", "getCommentList error", false, 4, null);
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

    /* JADX INFO: renamed from: com.transsion.postdetail.viewmodel.PostDetailCommentsFragmentViewModel$getCommentList$1$a */
    static final class C17469a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ PostDetailCommentsFragmentViewModel f57871a;

        C17469a(PostDetailCommentsFragmentViewModel postDetailCommentsFragmentViewModel) {
            this.f57871a = postDetailCommentsFragmentViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(CommentListBean commentListBean, Continuation continuation) {
            this.f57871a.m75020g().mo14858q(commentListBean);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostDetailCommentsFragmentViewModel$getCommentList$1(PostDetailCommentsFragmentViewModel postDetailCommentsFragmentViewModel, String str, String str2, String str3, int i11, Continuation<? super PostDetailCommentsFragmentViewModel$getCommentList$1> continuation) {
        super(2, continuation);
        this.this$0 = postDetailCommentsFragmentViewModel;
        this.$postId = str;
        this.$rootCommentId = str2;
        this.$page = str3;
        this.$perPage = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PostDetailCommentsFragmentViewModel$getCommentList$1(this.this$0, this.$postId, this.$rootCommentId, this.$page, this.$perPage, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((PostDetailCommentsFragmentViewModel$getCommentList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C174671(this.this$0, this.$postId, this.$rootCommentId, this.$page, this.$perPage, null)), C25220y0.m99268b()), new C174682(null));
            C17469a c17469a = new C17469a(this.this$0);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c17469a, this) == objF) {
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
