package com.transsion.shorttv.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.shorttv.bean.BannerData;
import com.transsion.shorttv.bean.OperateItem;
import com.transsion.shorttv.bean.OperatingResp;
import com.transsion.shorttv.bean.ShortTVRespData;
import com.transsion.shorttv.bean.Subject;
import com.transsion.shorttv.utils.C19165h;
import java.util.Iterator;
import java.util.List;
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
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC24995a;
import kotlinx.coroutines.flow.InterfaceC24998b;
import p790ts.InterfaceC27847a;
import p978zg.C29182a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvViewModel$getOperatingList$1", m97637f = "ShortTvViewModel.kt", m97638l = {992}, m97639m = "invokeSuspend")
final class ShortTvViewModel$getOperatingList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $tabId;
    int label;
    final /* synthetic */ ShortTvViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.shorttv.viewmodel.ShortTvViewModel$getOperatingList$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/shorttv/bean/OperatingResp;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvViewModel$getOperatingList$1$1", m97637f = "ShortTvViewModel.kt", m97638l = {981, 989}, m97639m = "invokeSuspend")
    static final class C191781 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $tabId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ShortTvViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C191781(ShortTvViewModel shortTvViewModel, int i11, Continuation<? super C191781> continuation) {
            super(2, continuation);
            this.this$0 = shortTvViewModel;
            this.$tabId = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C191781 c191781 = new C191781(this.this$0, this.$tabId, continuation);
            c191781.L$0 = obj;
            return c191781;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C191781) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC24998b interfaceC24998b;
            OperatingResp operatingResp;
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
            int i12 = this.$tabId;
            this.L$0 = interfaceC24998b;
            this.label = 1;
            obj = interfaceC27847a.m108242h(strM111992a, i12, "", this);
            if (obj == objF) {
                return objF;
            }
            BaseDto baseDto = (BaseDto) obj;
            if (Intrinsics.m97797c(baseDto.getCode(), "0") && baseDto.getData() != null && (operatingResp = (OperatingResp) baseDto.getData()) != null) {
                ShortTvViewModel shortTvViewModel = this.this$0;
                operatingResp.setSourceFrom("from_net");
                shortTvViewModel.m80300c1(operatingResp);
            }
            Object data = baseDto.getData();
            this.L$0 = null;
            this.label = 2;
            if (interfaceC24998b.emit(data, this) == objF) {
                return objF;
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.viewmodel.ShortTvViewModel$getOperatingList$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/shorttv/bean/OperatingResp;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvViewModel$getOperatingList$1$2", m97637f = "ShortTvViewModel.kt", m97638l = {991}, m97639m = "invokeSuspend")
    static final class C191792 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C191792(Continuation<? super C191792> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C191792 c191792 = new C191792(continuation);
            c191792.L$0 = interfaceC24998b;
            return c191792.invokeSuspend(Unit.f75682a);
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

    /* JADX INFO: renamed from: com.transsion.shorttv.viewmodel.ShortTvViewModel$getOperatingList$1$a */
    static final class C19180a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ShortTvViewModel f61653a;

        C19180a(ShortTvViewModel shortTvViewModel) {
            this.f61653a = shortTvViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(OperatingResp operatingResp, Continuation continuation) {
            ShortTVRespData shortTVRespData;
            List<Subject> items;
            List<BannerData> banners;
            List<OperateItem> items2;
            C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "1---Operating 接口返回 opsSize:" + ((operatingResp == null || (items2 = operatingResp.getItems()) == null) ? null : Boxing.m97634d(items2.size())) + "，version：" + (operatingResp != null ? operatingResp.getVersion() : null) + " ", false, 4, null);
            if (operatingResp != null && (banners = operatingResp.getBanners()) != null && !banners.isEmpty()) {
                this.f61653a.f61626b.set(true);
            }
            String version = operatingResp != null ? operatingResp.getVersion() : null;
            if (version != null && version.length() != 0) {
                C19165h.f61575a.m80241d().putString("key_short_tv_operation_version", operatingResp != null ? operatingResp.getVersion() : null);
            }
            this.f61653a.m80291M0(operatingResp);
            if (this.f61653a.m80373c0().m14847f() != null && (shortTVRespData = (ShortTVRespData) this.f61653a.m80373c0().m14847f()) != null && (items = shortTVRespData.getItems()) != null) {
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    ((Subject) it.next()).setOps(operatingResp != null ? operatingResp.getOps() : null);
                }
            }
            this.f61653a.m80383i0().mo14855n(operatingResp);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvViewModel$getOperatingList$1(ShortTvViewModel shortTvViewModel, int i11, Continuation<? super ShortTvViewModel$getOperatingList$1> continuation) {
        super(2, continuation);
        this.this$0 = shortTvViewModel;
        this.$tabId = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTvViewModel$getOperatingList$1(this.this$0, this.$tabId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTvViewModel$getOperatingList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C191781(this.this$0, this.$tabId, null)), C25220y0.m99268b()), new C191792(null));
            C19180a c19180a = new C19180a(this.this$0);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c19180a, this) == objF) {
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
