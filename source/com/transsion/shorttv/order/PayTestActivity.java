package com.transsion.shorttv.order;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.order.bean.CreatePaynicornOrderReqBean;
import com.transsion.shorttv.order.bean.GetPaynicornOrderStatusRespEntity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, m97100d2 = {"Lcom/transsion/shorttv/order/PayTestActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class PayTestActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: com.transsion.shorttv.order.PayTestActivity$a */
    public static final class C18850a implements InterfaceC18853b {
        C18850a() {
        }

        @Override // com.transsion.shorttv.order.InterfaceC18853b
        /* JADX INFO: renamed from: a */
        public void mo79400a(String errorCode, String errorMsg) {
            Intrinsics.m97802h(errorCode, "errorCode");
            Intrinsics.m97802h(errorMsg, "errorMsg");
            InterfaceC18853b.a.m79422a(this, errorCode, errorMsg);
            C18861c.f60874a.m79436b("PayTestActivity --> onPayFail() --> errorCode = " + errorCode + " --> errorMsg = " + errorMsg);
        }

        @Override // com.transsion.shorttv.order.InterfaceC18853b
        /* JADX INFO: renamed from: b */
        public void mo79401b(GetPaynicornOrderStatusRespEntity getPaynicornOrderStatusRespEntity) {
            InterfaceC18853b.a.m79423b(this, getPaynicornOrderStatusRespEntity);
            C18861c.f60874a.m79436b("PayTestActivity --> onPurchase() --> orderStatus = " + (getPaynicornOrderStatusRespEntity != null ? getPaynicornOrderStatusRespEntity.getOrderStatus() : null) + " --> description = " + (getPaynicornOrderStatusRespEntity != null ? getPaynicornOrderStatusRespEntity.getDescription() : null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final void m79399P(PayTestActivity payTestActivity, View view) {
        C18862d.f60875a.m79440d(payTestActivity, new CreatePaynicornOrderReqBean("MovieBox", "3180939149599363896", "7260396449953797608", null, null, null, null, true, null, 376, null), new C18850a());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.activity_test_pay_layout);
        Button button = (Button) findViewById(R$id.btnPay);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.order.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PayTestActivity.m79399P(this.f60881a, view);
                }
            });
        }
    }
}
