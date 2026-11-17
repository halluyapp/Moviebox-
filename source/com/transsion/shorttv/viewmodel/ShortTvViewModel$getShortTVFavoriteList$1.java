package com.transsion.shorttv.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.shorttv.bean.OperatingResp;
import com.transsion.shorttv.bean.ShortTVRespData;
import com.transsion.shorttv.bean.Subject;
import java.util.Iterator;
import java.util.List;
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
import p790ts.InterfaceC27847a;
import p978zg.C29182a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvViewModel$getShortTVFavoriteList$1", m97637f = "ShortTvViewModel.kt", m97638l = {951}, m97639m = "invokeSuspend")
final class ShortTvViewModel$getShortTVFavoriteList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ String $nextPage;
    final /* synthetic */ String $ops;
    final /* synthetic */ int $perPage;
    int label;
    final /* synthetic */ ShortTvViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.shorttv.viewmodel.ShortTvViewModel$getShortTVFavoriteList$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/shorttv/bean/ShortTVRespData;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvViewModel$getShortTVFavoriteList$1$1", m97637f = "ShortTvViewModel.kt", m97638l = {947, 948}, m97639m = "invokeSuspend")
    static final class C191841 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $nextPage;
        final /* synthetic */ int $perPage;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ShortTvViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C191841(ShortTvViewModel shortTvViewModel, String str, int i11, Continuation<? super C191841> continuation) {
            super(2, continuation);
            this.this$0 = shortTvViewModel;
            this.$nextPage = str;
            this.$perPage = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C191841 c191841 = new C191841(this.this$0, this.$nextPage, this.$perPage, continuation);
            c191841.L$0 = obj;
            return c191841;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C191841) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
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
            InterfaceC27847a interfaceC27847a = this.this$0.f61624a;
            String strM111992a = C29182a.f89053a.m111992a();
            String str = this.$nextPage;
            int i12 = this.$perPage;
            this.L$0 = interfaceC24998b;
            this.label = 1;
            obj = interfaceC27847a.m108237c(strM111992a, str, i12, this);
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

    /* JADX INFO: renamed from: com.transsion.shorttv.viewmodel.ShortTvViewModel$getShortTVFavoriteList$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/shorttv/bean/ShortTVRespData;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvViewModel$getShortTVFavoriteList$1$2", m97637f = "ShortTvViewModel.kt", m97638l = {950}, m97639m = "invokeSuspend")
    static final class C191852 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C191852(Continuation<? super C191852> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C191852 c191852 = new C191852(continuation);
            c191852.L$0 = interfaceC24998b;
            return c191852.invokeSuspend(Unit.f75682a);
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

    /* JADX INFO: renamed from: com.transsion.shorttv.viewmodel.ShortTvViewModel$getShortTVFavoriteList$1$a */
    static final class C19186a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f61655a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ShortTvViewModel f61656b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f61657c;

        C19186a(boolean z11, ShortTvViewModel shortTvViewModel, String str) {
            this.f61655a = z11;
            this.f61656b = shortTvViewModel;
            this.f61657c = str;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(ShortTVRespData shortTVRespData, Continuation continuation) {
            List<Subject> items;
            List<Subject> items2;
            if (shortTVRespData != null) {
                shortTVRespData.setRefresh(this.f61655a);
            }
            if (this.f61656b.m80383i0().m14847f() == null) {
                String str = this.f61657c;
                if (str != null && str.length() != 0 && shortTVRespData != null && (items = shortTVRespData.getItems()) != null) {
                    String str2 = this.f61657c;
                    Iterator<T> it = items.iterator();
                    while (it.hasNext()) {
                        ((Subject) it.next()).setOps(str2);
                    }
                }
            } else if (shortTVRespData != null && (items2 = shortTVRespData.getItems()) != null) {
                ShortTvViewModel shortTvViewModel = this.f61656b;
                for (Subject subject : items2) {
                    OperatingResp operatingResp = (OperatingResp) shortTvViewModel.m80383i0().m14847f();
                    subject.setOps(operatingResp != null ? operatingResp.getOps() : null);
                }
            }
            this.f61656b.m80373c0().mo14858q(shortTVRespData);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvViewModel$getShortTVFavoriteList$1(ShortTvViewModel shortTvViewModel, String str, int i11, boolean z11, String str2, Continuation<? super ShortTvViewModel$getShortTVFavoriteList$1> continuation) {
        super(2, continuation);
        this.this$0 = shortTvViewModel;
        this.$nextPage = str;
        this.$perPage = i11;
        this.$isRefresh = z11;
        this.$ops = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTvViewModel$getShortTVFavoriteList$1(this.this$0, this.$nextPage, this.$perPage, this.$isRefresh, this.$ops, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTvViewModel$getShortTVFavoriteList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C191841(this.this$0, this.$nextPage, this.$perPage, null)), C25220y0.m99268b()), new C191852(null));
            C19186a c19186a = new C19186a(this.$isRefresh, this.this$0, this.$ops);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c19186a, this) == objF) {
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
