package com.transsion.moviedetail.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsnet.downloader.bean.DownloadListBean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC24995a;
import kotlinx.coroutines.flow.InterfaceC24998b;
import p978zg.C29182a;
import sy.InterfaceC27663a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.moviedetail.viewmodel.MovieDetailViewModel$getDownloadList$1", m97637f = "MovieDetailViewModel.kt", m97638l = {166}, m97639m = "invokeSuspend")
final class MovieDetailViewModel$getDownloadList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $epFrom;
    final /* synthetic */ int $epTo;
    final /* synthetic */ int $resolution;
    final /* synthetic */ int $se;
    final /* synthetic */ String $subjectId;
    int label;
    final /* synthetic */ MovieDetailViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.moviedetail.viewmodel.MovieDetailViewModel$getDownloadList$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsnet/downloader/bean/DownloadListBean;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.moviedetail.viewmodel.MovieDetailViewModel$getDownloadList$1$1", m97637f = "MovieDetailViewModel.kt", m97638l = {149, 160, 162}, m97639m = "invokeSuspend")
    static final class C161861 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $epFrom;
        final /* synthetic */ int $epTo;
        final /* synthetic */ int $resolution;
        final /* synthetic */ int $se;
        final /* synthetic */ String $subjectId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MovieDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C161861(MovieDetailViewModel movieDetailViewModel, String str, int i11, int i12, int i13, int i14, Continuation<? super C161861> continuation) {
            super(2, continuation);
            this.this$0 = movieDetailViewModel;
            this.$subjectId = str;
            this.$resolution = i11;
            this.$se = i12;
            this.$epFrom = i13;
            this.$epTo = i14;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C161861 c161861 = new C161861(this.this$0, this.$subjectId, this.$resolution, this.$se, this.$epFrom, this.$epTo, continuation);
            c161861.L$0 = obj;
            return c161861;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C161861) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM107622c;
            Object obj2;
            InterfaceC24998b interfaceC24998b;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    InterfaceC24998b interfaceC24998b2 = (InterfaceC24998b) this.L$0;
                    ResultKt.m97107b(obj);
                    interfaceC24998b = interfaceC24998b2;
                    obj2 = objF;
                    objM107622c = obj;
                } else {
                    if (i11 != 2 && i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(obj);
                }
                return Unit.f75682a;
            }
            ResultKt.m97107b(obj);
            InterfaceC24998b interfaceC24998b3 = (InterfaceC24998b) this.L$0;
            InterfaceC27663a interfaceC27663aM70878O = this.this$0.m70878O();
            String strM111992a = C29182a.f89053a.m111992a();
            String str = this.$subjectId;
            Integer numM97634d = Boxing.m97634d(this.$resolution);
            int i12 = this.$se;
            int i13 = this.$epFrom;
            int i14 = this.$epTo;
            this.L$0 = interfaceC24998b3;
            this.label = 1;
            objM107622c = InterfaceC27663a.a.m107622c(interfaceC27663aM70878O, strM111992a, str, null, 0, 0, 0, 0, 2, numM97634d, i12, i13, i14, this, 120, null);
            obj2 = objF;
            if (objM107622c == obj2) {
                return obj2;
            }
            interfaceC24998b = interfaceC24998b3;
            BaseDto baseDto = (BaseDto) objM107622c;
            if (Intrinsics.m97797c(baseDto.getCode(), "0")) {
                Object data = baseDto.getData();
                this.L$0 = null;
                this.label = 3;
                if (interfaceC24998b.emit(data, this) == obj2) {
                    return obj2;
                }
            } else {
                this.L$0 = null;
                this.label = 2;
                if (interfaceC24998b.emit(null, this) == obj2) {
                    return obj2;
                }
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.viewmodel.MovieDetailViewModel$getDownloadList$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsnet/downloader/bean/DownloadListBean;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.moviedetail.viewmodel.MovieDetailViewModel$getDownloadList$1$2", m97637f = "MovieDetailViewModel.kt", m97638l = {165}, m97639m = "invokeSuspend")
    static final class C161872 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C161872(Continuation<? super C161872> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C161872 c161872 = new C161872(continuation);
            c161872.L$0 = interfaceC24998b;
            return c161872.invokeSuspend(Unit.f75682a);
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

    /* JADX INFO: renamed from: com.transsion.moviedetail.viewmodel.MovieDetailViewModel$getDownloadList$1$a */
    static final class C16188a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MovieDetailViewModel f54987a;

        C16188a(MovieDetailViewModel movieDetailViewModel) {
            this.f54987a = movieDetailViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(DownloadListBean downloadListBean, Continuation continuation) {
            this.f54987a.m70924w().mo14855n(downloadListBean);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MovieDetailViewModel$getDownloadList$1(MovieDetailViewModel movieDetailViewModel, String str, int i11, int i12, int i13, int i14, Continuation<? super MovieDetailViewModel$getDownloadList$1> continuation) {
        super(2, continuation);
        this.this$0 = movieDetailViewModel;
        this.$subjectId = str;
        this.$resolution = i11;
        this.$se = i12;
        this.$epFrom = i13;
        this.$epTo = i14;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MovieDetailViewModel$getDownloadList$1(this.this$0, this.$subjectId, this.$resolution, this.$se, this.$epFrom, this.$epTo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((MovieDetailViewModel$getDownloadList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98799r(new C161861(this.this$0, this.$subjectId, this.$resolution, this.$se, this.$epFrom, this.$epTo, null)), new C161872(null));
            C16188a c16188a = new C16188a(this.this$0);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c16188a, this) == objF) {
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
