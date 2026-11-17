package com.transsion.shorttv.order;

import android.os.Bundle;
import android.view.View;
import androidx.p1004lifecycle.InterfaceC3189c0;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.shorttv.order.bean.CenterCreateTradingOrderRespEntity;
import com.transsion.shorttv.order.bean.CreatePaynicornOrderReqBean;
import com.transsion.shorttv.order.bean.GetPaynicornOrderStatusRespEntity;
import com.transsion.shorttv.order.bean.HttpErrorBodyBean;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m97100d2 = {"Lcom/transsion/shorttv/order/PurchaseDialog;", "Lcom/transsion/shorttv/order/BasePayLoadingDialog;", "<init>", "()V", "Lcom/transsion/shorttv/order/bean/HttpErrorBodyBean;", "it", "", "D0", "(Lcom/transsion/shorttv/order/bean/HttpErrorBodyBean;)V", "x0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/transsion/shorttv/order/bean/CreatePaynicornOrderReqBean;", "orderReq", "F0", "(Lcom/transsion/shorttv/order/bean/CreatePaynicornOrderReqBean;)Lcom/transsion/shorttv/order/PurchaseDialog;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/shorttv/order/bean/CreatePaynicornOrderReqBean;", "Lcom/transsion/shorttv/order/PayLoadingVM;", "e", "Lkotlin/Lazy;", "w0", "()Lcom/transsion/shorttv/order/PayLoadingVM;", "payVM", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class PurchaseDialog extends BasePayLoadingDialog {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private CreatePaynicornOrderReqBean orderReq;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Lazy payVM = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.order.l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PurchaseDialog.m79406E0();
        }
    });

    /* JADX INFO: renamed from: com.transsion.shorttv.order.PurchaseDialog$a */
    static final class C18851a implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f60873a;

        C18851a(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f60873a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f60873a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3189c0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.m97797c(mo6065a(), ((FunctionAdapter) obj).mo6065a());
            }
            return false;
        }

        public final int hashCode() {
            return mo6065a().hashCode();
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f60873a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final Unit m79402A0(PurchaseDialog purchaseDialog, int i11, String msg) {
        Intrinsics.m97802h(msg, "msg");
        purchaseDialog.m79405D0(new HttpErrorBodyBean(msg, String.valueOf(i11), null, 4, null));
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final Unit m79403B0(PurchaseDialog purchaseDialog, CenterCreateTradingOrderRespEntity centerCreateTradingOrderRespEntity) {
        PayLoadingVM payLoadingVMM79413w0 = purchaseDialog.m79413w0();
        String tradingOrderId = centerCreateTradingOrderRespEntity != null ? centerCreateTradingOrderRespEntity.getTradingOrderId() : null;
        CreatePaynicornOrderReqBean createPaynicornOrderReqBean = purchaseDialog.orderReq;
        String projectName = createPaynicornOrderReqBean != null ? createPaynicornOrderReqBean.getProjectName() : null;
        CreatePaynicornOrderReqBean createPaynicornOrderReqBean2 = purchaseDialog.orderReq;
        payLoadingVMM79413w0.m79393i(tradingOrderId, projectName, createPaynicornOrderReqBean2 != null ? createPaynicornOrderReqBean2.isDebug() : false);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final Unit m79404C0(PurchaseDialog purchaseDialog, GetPaynicornOrderStatusRespEntity getPaynicornOrderStatusRespEntity) {
        InterfaceC18853b callback = purchaseDialog.getCallback();
        if (callback != null) {
            callback.mo79401b(getPaynicornOrderStatusRespEntity);
        }
        if (purchaseDialog.isAdded()) {
            purchaseDialog.dismissAllowingStateLoss();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: D0 */
    private final void m79405D0(HttpErrorBodyBean it) {
        C18861c.f60874a.m79435a(getClassTag() + " --> initVM() --> code = " + it.getCode() + " -- message = " + it.getMessage());
        InterfaceC18853b callback = getCallback();
        if (callback != null) {
            callback.mo79400a(it.getCode(), it.getMessage());
        }
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final PayLoadingVM m79406E0() {
        return new PayLoadingVM();
    }

    /* JADX INFO: renamed from: w0 */
    private final PayLoadingVM m79413w0() {
        return (PayLoadingVM) this.payVM.getValue();
    }

    /* JADX INFO: renamed from: x0 */
    private final void m79414x0() {
        m79413w0().m79397n().m14851j(this, new C18851a(new Function1() { // from class: com.transsion.shorttv.order.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PurchaseDialog.m79415y0(this.f60882a, (HttpErrorBodyBean) obj);
            }
        }));
        m79413w0().m79395l().m14851j(this, new C18851a(new Function1() { // from class: com.transsion.shorttv.order.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PurchaseDialog.m79416z0(this.f60883a, (CenterCreateTradingOrderRespEntity) obj);
            }
        }));
        m79413w0().m79396m().m14851j(this, new C18851a(new Function1() { // from class: com.transsion.shorttv.order.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PurchaseDialog.m79404C0(this.f60884a, (GetPaynicornOrderStatusRespEntity) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final Unit m79415y0(PurchaseDialog purchaseDialog, HttpErrorBodyBean httpErrorBodyBean) {
        Intrinsics.m97799e(httpErrorBodyBean);
        purchaseDialog.m79405D0(httpErrorBodyBean);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final Unit m79416z0(final PurchaseDialog purchaseDialog, final CenterCreateTradingOrderRespEntity centerCreateTradingOrderRespEntity) {
        C18861c.f60874a.m79435a(purchaseDialog.getClassTag() + " --> initVM() --> 创建支付订单成功 --> tradingOrderId = " + (centerCreateTradingOrderRespEntity != null ? centerCreateTradingOrderRespEntity.getTradingOrderId() : null));
        C18862d.f60875a.m79439c(purchaseDialog.getContext(), centerCreateTradingOrderRespEntity, new Function2() { // from class: com.transsion.shorttv.order.m
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PurchaseDialog.m79402A0(this.f60885a, ((Integer) obj).intValue(), (String) obj2);
            }
        }, new Function0() { // from class: com.transsion.shorttv.order.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PurchaseDialog.m79403B0(this.f60886a, centerCreateTradingOrderRespEntity);
            }
        });
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: F0 */
    public final PurchaseDialog m79417F0(CreatePaynicornOrderReqBean orderReq) {
        this.orderReq = orderReq;
        return this;
    }

    @Override // com.transsion.shorttv.order.BasePayLoadingDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m79414x0();
    }

    @Override // com.transsion.shorttv.order.BasePayLoadingDialog, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m79381n0(true);
        m79413w0().m79394j(this.orderReq);
    }
}
