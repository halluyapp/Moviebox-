package com.transsion.shorttv.viewmodel;

import com.blankj.utilcode.util.AbstractC5796o;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.shorttv.bean.ImmVideoRequestEntity;
import com.transsion.shorttv.bean.ShortTVRespData;
import com.transsion.shorttv.bean.Subject;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC24995a;
import kotlinx.coroutines.flow.InterfaceC24998b;
import okhttp3.RequestBody;
import p411fh.C23367b;
import p790ts.InterfaceC27847a;
import p978zg.C29182a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvViewModel$getShortTVTrending$1", m97637f = "ShortTvViewModel.kt", m97638l = {1028}, m97639m = "invokeSuspend")
final class ShortTvViewModel$getShortTVTrending$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ ImmVideoRequestEntity $requestEntity;
    int label;
    final /* synthetic */ ShortTvViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.shorttv.viewmodel.ShortTvViewModel$getShortTVTrending$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/shorttv/bean/ShortTVRespData;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvViewModel$getShortTVTrending$1$1", m97637f = "ShortTvViewModel.kt", m97638l = {1023, 1024}, m97639m = "invokeSuspend")
    static final class C191871 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ ImmVideoRequestEntity $requestEntity;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ShortTvViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C191871(ImmVideoRequestEntity immVideoRequestEntity, ShortTvViewModel shortTvViewModel, Continuation<? super C191871> continuation) {
            super(2, continuation);
            this.$requestEntity = immVideoRequestEntity;
            this.this$0 = shortTvViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C191871 c191871 = new C191871(this.$requestEntity, this.this$0, continuation);
            c191871.L$0 = obj;
            return c191871;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C191871) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x008a A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC24998b interfaceC24998b;
            Object data;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                interfaceC24998b = (InterfaceC24998b) this.L$0;
                C23367b.a aVar = C23367b.f71265a;
                String strM27447j = AbstractC5796o.m27447j(this.$requestEntity);
                Intrinsics.m97801g(strM27447j, "toJson(...)");
                RequestBody requestBodyM92796a = aVar.m92796a(strM27447j);
                if (requestBodyM92796a != null) {
                    ShortTvViewModel shortTvViewModel = this.this$0;
                    C26866a.a aVar2 = C26866a.f81698a;
                    C29182a.a aVar3 = C29182a.f89053a;
                    C26866a.a.m104898f(aVar2, "ShortTvViewModel", "Trending  host:" + aVar3.m111992a() + "/wefeed-mobile-bff/shorts/most-trending", false, 4, null);
                    InterfaceC27847a interfaceC27847a = shortTvViewModel.f61624a;
                    String strM111992a = aVar3.m111992a();
                    this.L$0 = interfaceC24998b;
                    this.label = 1;
                    obj = interfaceC27847a.m108241g(strM111992a, requestBodyM92796a, this);
                    if (obj == objF) {
                        return objF;
                    }
                    data = ((BaseDto) obj).getData();
                    this.L$0 = null;
                    this.label = 2;
                    if (interfaceC24998b.emit(data, this) == objF) {
                        return objF;
                    }
                }
            } else if (i11 == 1) {
                interfaceC24998b = (InterfaceC24998b) this.L$0;
                ResultKt.m97107b(obj);
                data = ((BaseDto) obj).getData();
                this.L$0 = null;
                this.label = 2;
                if (interfaceC24998b.emit(data, this) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.viewmodel.ShortTvViewModel$getShortTVTrending$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/shorttv/bean/ShortTVRespData;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvViewModel$getShortTVTrending$1$2", m97637f = "ShortTvViewModel.kt", m97638l = {1027}, m97639m = "invokeSuspend")
    static final class C191882 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C191882(Continuation<? super C191882> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C191882 c191882 = new C191882(continuation);
            c191882.L$0 = interfaceC24998b;
            return c191882.invokeSuspend(Unit.f75682a);
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

    /* JADX INFO: renamed from: com.transsion.shorttv.viewmodel.ShortTvViewModel$getShortTVTrending$1$a */
    static final class C19189a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ShortTvViewModel f61658a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f61659b;

        C19189a(ShortTvViewModel shortTvViewModel, boolean z11) {
            this.f61658a = shortTvViewModel;
            this.f61659b = z11;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(ShortTVRespData shortTVRespData, Continuation continuation) {
            List<Subject> items;
            C26866a.a aVar = C26866a.f81698a;
            C26866a.a.m104898f(aVar, "ShortTvViewModel", "Trending 接口返回 " + shortTVRespData, false, 4, null);
            if (shortTVRespData != null && (items = shortTVRespData.getItems()) != null && !items.isEmpty()) {
                this.f61658a.f61628c.set(true);
            }
            if (shortTVRespData != null) {
                shortTVRespData.setRefresh(this.f61659b);
            }
            C26866a.a.m104898f(aVar, "ShortTvViewModel", "设置 TrendingLiveData, " + this.f61658a.m80346K0(), false, 4, null);
            this.f61658a.m80346K0().mo14858q(shortTVRespData);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvViewModel$getShortTVTrending$1(ImmVideoRequestEntity immVideoRequestEntity, ShortTvViewModel shortTvViewModel, boolean z11, Continuation<? super ShortTvViewModel$getShortTVTrending$1> continuation) {
        super(2, continuation);
        this.$requestEntity = immVideoRequestEntity;
        this.this$0 = shortTvViewModel;
        this.$isRefresh = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTvViewModel$getShortTVTrending$1(this.$requestEntity, this.this$0, this.$isRefresh, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTvViewModel$getShortTVTrending$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C191871(this.$requestEntity, this.this$0, null)), C25220y0.m99268b()), new C191882(null));
            C19189a c19189a = new C19189a(this.this$0, this.$isRefresh);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c19189a, this) == objF) {
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
