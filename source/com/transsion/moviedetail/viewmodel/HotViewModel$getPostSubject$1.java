package com.transsion.moviedetail.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.moviedetailapi.bean.Pager;
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
import p523jn.InterfaceC24449a;
import p978zg.C29182a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.moviedetail.viewmodel.HotViewModel$getPostSubject$1", m97637f = "HotViewModel.kt", m97638l = {106}, m97639m = "invokeSuspend")
final class HotViewModel$getPostSubject$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $page;
    final /* synthetic */ int $perPage;
    final /* synthetic */ String $sortType;
    final /* synthetic */ String $subjectId;
    final /* synthetic */ boolean $with;
    int label;
    final /* synthetic */ HotViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.moviedetail.viewmodel.HotViewModel$getPostSubject$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/moviedetailapi/bean/PostSubjectBean;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.moviedetail.viewmodel.HotViewModel$getPostSubject$1$1", m97637f = "HotViewModel.kt", m97638l = {100, 103}, m97639m = "invokeSuspend")
    static final class C161791 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $page;
        final /* synthetic */ int $perPage;
        final /* synthetic */ String $sortType;
        final /* synthetic */ String $subjectId;
        final /* synthetic */ boolean $with;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HotViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C161791(HotViewModel hotViewModel, String str, String str2, int i11, String str3, boolean z11, Continuation<? super C161791> continuation) {
            super(2, continuation);
            this.this$0 = hotViewModel;
            this.$subjectId = str;
            this.$page = str2;
            this.$perPage = i11;
            this.$sortType = str3;
            this.$with = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C161791 c161791 = new C161791(this.this$0, this.$subjectId, this.$page, this.$perPage, this.$sortType, this.$with, continuation);
            c161791.L$0 = obj;
            return c161791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C161791) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
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
            InterfaceC24449a interfaceC24449aM70859e0 = this.this$0.m70859e0();
            String strM111992a = C29182a.f89053a.m111992a();
            String str = this.$subjectId;
            if (str == null) {
                str = "";
            }
            String str2 = this.$page;
            int i12 = this.$perPage;
            String str3 = this.$sortType;
            boolean z11 = this.$with;
            this.L$0 = interfaceC24998b;
            this.label = 1;
            obj = interfaceC24449aM70859e0.m95936e(strM111992a, str, str2, i12, str3, z11, this);
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

    /* JADX INFO: renamed from: com.transsion.moviedetail.viewmodel.HotViewModel$getPostSubject$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/moviedetailapi/bean/PostSubjectBean;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.moviedetail.viewmodel.HotViewModel$getPostSubject$1$2", m97637f = "HotViewModel.kt", m97638l = {105}, m97639m = "invokeSuspend")
    static final class C161802 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C161802(Continuation<? super C161802> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C161802 c161802 = new C161802(continuation);
            c161802.L$0 = interfaceC24998b;
            return c161802.invokeSuspend(Unit.f75682a);
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

    /* JADX INFO: renamed from: com.transsion.moviedetail.viewmodel.HotViewModel$getPostSubject$1$a */
    static final class C16181a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ HotViewModel f54968a;

        C16181a(HotViewModel hotViewModel) {
            this.f54968a = hotViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(PostSubjectBean postSubjectBean, Continuation continuation) {
            String nextPage;
            Integer perPage;
            if (postSubjectBean != null) {
                HotViewModel hotViewModel = this.f54968a;
                Pager pager = postSubjectBean.getPager();
                hotViewModel.m70870k0((pager == null || (perPage = pager.getPerPage()) == null) ? 10 : perPage.intValue());
                Pager pager2 = postSubjectBean.getPager();
                if (pager2 == null || (nextPage = pager2.getNextPage()) == null) {
                    nextPage = "0";
                }
                hotViewModel.f54964n = nextPage;
            }
            this.f54968a.m70964y().mo14858q(postSubjectBean);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotViewModel$getPostSubject$1(HotViewModel hotViewModel, String str, String str2, int i11, String str3, boolean z11, Continuation<? super HotViewModel$getPostSubject$1> continuation) {
        super(2, continuation);
        this.this$0 = hotViewModel;
        this.$subjectId = str;
        this.$page = str2;
        this.$perPage = i11;
        this.$sortType = str3;
        this.$with = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HotViewModel$getPostSubject$1(this.this$0, this.$subjectId, this.$page, this.$perPage, this.$sortType, this.$with, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((HotViewModel$getPostSubject$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C161791(this.this$0, this.$subjectId, this.$page, this.$perPage, this.$sortType, this.$with, null)), C25220y0.m99268b()), new C161802(null));
            C16181a c16181a = new C16181a(this.this$0);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c16181a, this) == objF) {
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
