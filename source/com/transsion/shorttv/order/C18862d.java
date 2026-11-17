package com.transsion.shorttv.order;

import android.content.Context;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.p282tn.tranpay.BillingParams;
import com.p282tn.tranpay.C13809a;
import com.p282tn.tranpay.C13815b;
import com.p282tn.tranpay.C13825c;
import com.p282tn.tranpay.InterfaceC13826d;
import com.p282tn.tranpay.TranPayClient;
import com.transsion.shorttv.order.bean.CenterCreateTradingOrderRespEntity;
import com.transsion.shorttv.order.bean.CreatePaynicornOrderReqBean;
import com.transsion.shorttv.order.bean.PrePayInfoBean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.shorttv.order.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C18862d {

    /* JADX INFO: renamed from: a */
    public static final C18862d f60875a = new C18862d();

    /* JADX INFO: renamed from: com.transsion.shorttv.order.d$a */
    public static final class a implements InterfaceC13826d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function2 f60876a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function0 f60877b;

        a(Function2 function2, Function0 function0) {
            this.f60876a = function2;
            this.f60877b = function0;
        }

        @Override // com.p282tn.tranpay.InterfaceC13826d
        /* JADX INFO: renamed from: a */
        public void mo62378a(C13815b result, C13825c c13825c) {
            Intrinsics.m97802h(result, "result");
            C18861c c18861c = C18861c.f60874a;
            C18862d c18862d = C18862d.f60875a;
            c18861c.m79435a(c18862d.m79438b() + " --> onPurchasesUpdated() --> result = " + result + " -- purchase = " + c13825c);
            if (C13809a.f49041a.m62370a(result.m62385b()) && c13825c != null) {
                c18861c.m79435a(c18862d.m79438b() + " --> onPurchasesUpdated() --> paynicorn result --> 轮询Paynicorn支付结果 ....");
                this.f60877b.invoke();
                return;
            }
            c18861c.m79436b(c18862d.m79438b() + " --> onPurchasesUpdated() --> paynicorn result is cancel");
            int iM62385b = result.m62385b();
            if (iM62385b == 1) {
                this.f60876a.invoke(1002, "onPurchasesUpdated() --> 取消支付");
                return;
            }
            if (iM62385b != 4) {
                this.f60876a.invoke(1004, "onPurchasesUpdated() --> 支付失败");
                return;
            }
            c18861c.m79435a(c18862d.m79438b() + " --> onPurchasesUpdated() --> processing--> paynicorn result --> 轮询Paynicorn支付结果 ....");
            this.f60876a.invoke(1003, "onPurchasesUpdated() --> 支付进行中");
        }
    }

    private C18862d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final String m79438b() {
        String simpleName = C18862d.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: renamed from: c */
    public final void m79439c(Context context, CenterCreateTradingOrderRespEntity centerCreateTradingOrderRespEntity, Function2 payFail, Function0 orderCheck4Paynicorn) {
        String string;
        Boolean payByLocalCurrency;
        String txnId;
        String description;
        String orderId;
        Double price;
        Intrinsics.m97802h(payFail, "payFail");
        Intrinsics.m97802h(orderCheck4Paynicorn, "orderCheck4Paynicorn");
        PrePayInfoBean prePayInfo = centerCreateTradingOrderRespEntity != null ? centerCreateTradingOrderRespEntity.getPrePayInfo() : null;
        if (prePayInfo == null || (price = prePayInfo.getPrice()) == null || (string = price.toString()) == null) {
            string = "0";
        }
        BillingParams billingParams = new BillingParams((centerCreateTradingOrderRespEntity == null || (txnId = centerCreateTradingOrderRespEntity.getTxnId()) == null) ? "" : txnId, string, (prePayInfo == null || (orderId = prePayInfo.getOrderId()) == null) ? "" : orderId, (prePayInfo == null || (description = prePayInfo.getDescription()) == null) ? "" : description, prePayInfo != null ? prePayInfo.getCurrency() : null, prePayInfo != null ? prePayInfo.getReferenceNo() : null, prePayInfo != null ? prePayInfo.getMemo() : null, null, null, false, (prePayInfo == null || (payByLocalCurrency = prePayInfo.getPayByLocalCurrency()) == null) ? false : payByLocalCurrency.booleanValue(), 384, null);
        if (context != null) {
            TranPayClient.f49024a.m62337b(context, billingParams, new a(payFail, orderCheck4Paynicorn));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m79440d(Context context, CreatePaynicornOrderReqBean createPaynicornOrderReqBean, InterfaceC18853b interfaceC18853b) {
        C18861c.f60874a.m79435a(m79438b() + " -->  --> purchase() --> 开始购买流程");
        if (context != null && createPaynicornOrderReqBean != null) {
            new PurchaseDialog().m79417F0(createPaynicornOrderReqBean).m79383p0(interfaceC18853b).mo79034i0(context, "PurchaseDialog");
        } else if (interfaceC18853b != null) {
            interfaceC18853b.mo79400a(TmcConstants.COLD_OPEN_TYPE, "context == null || orderReq == null");
        }
    }
}
