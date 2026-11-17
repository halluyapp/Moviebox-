package com.transsion.transfer.wifi.p320ui;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import com.therouter.TheRouter;
import com.transsion.transfer.R$id;
import com.transsion.transfer.R$layout;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import p687pv.InterfaceC26952a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, m97100d2 = {"Lcom/transsion/transfer/wifi/ui/WifiP2PTestActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Transfer_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class WifiP2PTestActivity extends AppCompatActivity {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final void m83522Q(WifiP2PTestActivity wifiP2PTestActivity, View view) {
        InterfaceC26952a interfaceC26952a = (InterfaceC26952a) TheRouter.m61774d(InterfaceC26952a.class, new Object[0]);
        if (interfaceC26952a != null) {
            interfaceC26952a.mo93039a(wifiP2PTestActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final void m83523R(WifiP2PTestActivity wifiP2PTestActivity, View view) {
        InterfaceC26952a interfaceC26952a = (InterfaceC26952a) TheRouter.m61774d(InterfaceC26952a.class, new Object[0]);
        if (interfaceC26952a != null) {
            interfaceC26952a.mo93040b(wifiP2PTestActivity);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.activity_wifi_p2p_test);
        ((AppCompatButton) findViewById(R$id.btnWifiCreate)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.transfer.wifi.ui.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiP2PTestActivity.m83522Q(this.f63987a, view);
            }
        });
        ((AppCompatButton) findViewById(R$id.btnWifiConnect)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.transfer.wifi.ui.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiP2PTestActivity.m83523R(this.f63988a, view);
            }
        });
    }
}
