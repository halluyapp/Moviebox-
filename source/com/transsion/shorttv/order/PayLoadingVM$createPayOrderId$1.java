package com.transsion.shorttv.order;

import com.cloud.tmc.kernel.constants.TmcConstants;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.shorttv.order.bean.CreatePaynicornOrderReqBean;
import com.transsion.shorttv.order.bean.HttpErrorBodyBean;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.order.PayLoadingVM$createPayOrderId$1", m97637f = "PayLoadingVM.kt", m97638l = {Sdk$SDKMetric.SDKMetricType.AD_REWARD_USER_VALUE}, m97639m = "invokeSuspend")
final class PayLoadingVM$createPayOrderId$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ CreatePaynicornOrderReqBean $orderReq;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PayLoadingVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayLoadingVM$createPayOrderId$1(CreatePaynicornOrderReqBean createPaynicornOrderReqBean, PayLoadingVM payLoadingVM, Continuation<? super PayLoadingVM$createPayOrderId$1> continuation) {
        super(2, continuation);
        this.$orderReq = createPaynicornOrderReqBean;
        this.this$0 = payLoadingVM;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PayLoadingVM$createPayOrderId$1 payLoadingVM$createPayOrderId$1 = new PayLoadingVM$createPayOrderId$1(this.$orderReq, this.this$0, continuation);
        payLoadingVM$createPayOrderId$1.L$0 = obj;
        return payLoadingVM$createPayOrderId$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((PayLoadingVM$createPayOrderId$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        HttpErrorBodyBean httpErrorBodyBean;
        PayLoadingVM payLoadingVM;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                CreatePaynicornOrderReqBean createPaynicornOrderReqBean = this.$orderReq;
                PayLoadingVM payLoadingVM2 = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                C18865g c18865g = C18865g.f60879a;
                this.L$0 = payLoadingVM2;
                this.label = 1;
                obj = c18865g.m79445b(createPaynicornOrderReqBean, this);
                if (obj == objF) {
                    return objF;
                }
                payLoadingVM = payLoadingVM2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                payLoadingVM = (PayLoadingVM) this.L$0;
                ResultKt.m97107b(obj);
            }
            payLoadingVM.f60868d.mo14855n(((BaseDto) obj).getData());
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        PayLoadingVM payLoadingVM3 = this.this$0;
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            if (thM112710exceptionOrNullimpl instanceof HttpException) {
                httpErrorBodyBean = HttpErrorBodyBean.INSTANCE.m79430a((HttpException) thM112710exceptionOrNullimpl);
            } else {
                String message = thM112710exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "";
                }
                httpErrorBodyBean = new HttpErrorBodyBean(message, TmcConstants.COLD_OPEN_TYPE, "");
            }
            payLoadingVM3.f60870f.mo14855n(httpErrorBodyBean);
        }
        return Unit.f75682a;
    }
}
