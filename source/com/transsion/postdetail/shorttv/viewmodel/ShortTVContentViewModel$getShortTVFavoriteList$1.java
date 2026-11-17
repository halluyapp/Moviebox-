package com.transsion.postdetail.shorttv.viewmodel;

import com.cloud.tmc.offline.download.model.TaskResultKt;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.moviedetailapi.bean.ShortTVRespData;
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
import p985zo.InterfaceC29209b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.shorttv.viewmodel.ShortTVContentViewModel$getShortTVFavoriteList$1", m97637f = "ShortTVContentViewModel.kt", m97638l = {112}, m97639m = "invokeSuspend")
final class ShortTVContentViewModel$getShortTVFavoriteList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ String $nextPage;
    final /* synthetic */ int $perPage;
    int label;
    final /* synthetic */ ShortTVContentViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv.viewmodel.ShortTVContentViewModel$getShortTVFavoriteList$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/moviedetailapi/bean/ShortTVRespData;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.shorttv.viewmodel.ShortTVContentViewModel$getShortTVFavoriteList$1$1", m97637f = "ShortTVContentViewModel.kt", m97638l = {TaskResultKt.ERROR_LOAD_RESPONSE_STR_EMPTY, 109}, m97639m = "invokeSuspend")
    static final class C169071 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $nextPage;
        final /* synthetic */ int $perPage;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ShortTVContentViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C169071(ShortTVContentViewModel shortTVContentViewModel, String str, int i11, Continuation<? super C169071> continuation) {
            super(2, continuation);
            this.this$0 = shortTVContentViewModel;
            this.$nextPage = str;
            this.$perPage = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C169071 c169071 = new C169071(this.this$0, this.$nextPage, this.$perPage, continuation);
            c169071.L$0 = obj;
            return c169071;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C169071) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
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
            InterfaceC29209b interfaceC29209bM73736k = this.this$0.m73736k();
            String strM111992a = C29182a.f89053a.m111992a();
            String str = this.$nextPage;
            int i12 = this.$perPage;
            this.L$0 = interfaceC24998b;
            this.label = 1;
            obj = interfaceC29209bM73736k.m112056c(strM111992a, str, i12, this);
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

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv.viewmodel.ShortTVContentViewModel$getShortTVFavoriteList$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/moviedetailapi/bean/ShortTVRespData;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.shorttv.viewmodel.ShortTVContentViewModel$getShortTVFavoriteList$1$2", m97637f = "ShortTVContentViewModel.kt", m97638l = {111}, m97639m = "invokeSuspend")
    static final class C169082 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C169082(Continuation<? super C169082> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C169082 c169082 = new C169082(continuation);
            c169082.L$0 = interfaceC24998b;
            return c169082.invokeSuspend(Unit.f75682a);
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

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv.viewmodel.ShortTVContentViewModel$getShortTVFavoriteList$1$a */
    static final class C16909a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f56802a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ShortTVContentViewModel f56803b;

        C16909a(boolean z11, ShortTVContentViewModel shortTVContentViewModel) {
            this.f56802a = z11;
            this.f56803b = shortTVContentViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(ShortTVRespData shortTVRespData, Continuation continuation) {
            if (shortTVRespData != null) {
                shortTVRespData.setRefresh(this.f56802a);
            }
            this.f56803b.m73739h().mo14858q(shortTVRespData);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTVContentViewModel$getShortTVFavoriteList$1(ShortTVContentViewModel shortTVContentViewModel, String str, int i11, boolean z11, Continuation<? super ShortTVContentViewModel$getShortTVFavoriteList$1> continuation) {
        super(2, continuation);
        this.this$0 = shortTVContentViewModel;
        this.$nextPage = str;
        this.$perPage = i11;
        this.$isRefresh = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTVContentViewModel$getShortTVFavoriteList$1(this.this$0, this.$nextPage, this.$perPage, this.$isRefresh, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTVContentViewModel$getShortTVFavoriteList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C169071(this.this$0, this.$nextPage, this.$perPage, null)), C25220y0.m99268b()), new C169082(null));
            C16909a c16909a = new C16909a(this.$isRefresh, this.this$0);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c16909a, this) == objF) {
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
