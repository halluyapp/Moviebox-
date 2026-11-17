package com.transsion.transfer.wifi.p320ui;

import af.C0091c;
import af.C0099k;
import af.InterfaceC0089a;
import android.app.Activity;
import android.content.Intent;
import android.net.Network;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0248a;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import com.blankj.utilcode.util.AbstractC5779c;
import com.cloud.tmc.kernel.utils.NetworkUtil;
import com.google.zxing.BarcodeFormat;
import com.gyf.immersionbar.ImmersionBar;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.baseui.activity.BaseNewActivity;
import com.transsion.transfer.R$string;
import com.transsion.transfer.impl.ClientViewModel;
import com.transsion.transfer.impl.TransferStatusActivity;
import com.transsion.transfer.impl.client.TransferClient;
import com.transsion.transfer.wifi.connect.InterfaceC20072b;
import com.transsion.transfer.wifi.connect.TransferWifiConnectDialog;
import com.transsion.transfer.wifi.connect.WifiConnectionManager;
import com.transsion.transfer.wifi.permission.C20096d;
import com.transsion.transfer.wifi.permission.PermissionsActivity;
import com.transsion.transfer.wifi.qrcode.QrCodeUtil;
import com.transsion.transfer.wifi.util.C20136g;
import com.transsion.transfer.wifi.util.WifiUtils;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.net.InetAddress;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import lv.C25687c;
import p393f.C23284j;
import p419fv.C23437c;
import p550kj.C24655b;
import p624nv.C26114h;
import p721qv.C27131b;
import p754rv.C27385a;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 J\u000f\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010)\u001a\u00020\u0005H\u0016¢\u0006\u0004\b)\u0010\u0004J\u000f\u0010*\u001a\u00020\u0005H\u0016¢\u0006\u0004\b*\u0010\u0004J\u000f\u0010+\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010\u0004J\u000f\u0010,\u001a\u00020\u0005H\u0016¢\u0006\u0004\b,\u0010\u0004J\u000f\u0010-\u001a\u00020\u0005H\u0016¢\u0006\u0004\b-\u0010\u0004J\r\u0010.\u001a\u00020\u0005¢\u0006\u0004\b.\u0010\u0004R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00109R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00020J0I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010S\u001a\u00020N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R¨\u0006T"}, m97100d2 = {"Lcom/transsion/transfer/wifi/ui/WifiConnectActivity;", "Lcom/transsion/baseui/activity/BaseNewActivity;", "Llv/c;", "<init>", "()V", "", "a1", "Lrv/a;", "wifiInfoModel", "m1", "(Lrv/a;)V", "", "scannedText", "g1", "(Ljava/lang/String;)V", "U0", "ip", "W0", "o1", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "marginTop", "l1", "(Landroid/view/View;I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "", "n0", "()Z", "onPause", "onDestroy", "c1", "()Llv/c;", "f0", "()Ljava/lang/String;", "setImmersionStatusBar", "l0", "m0", "k0", "p0", "q0", "retryLoadData", "V0", "Lcom/transsion/transfer/impl/ClientViewModel;", "i", "Lkotlin/Lazy;", "b1", "()Lcom/transsion/transfer/impl/ClientViewModel;", "clientViewModel", "j", "Ljava/lang/String;", "serverIp", CampaignEx.JSON_KEY_AD_K, "Z", "clientReleaseTag", "", "l", "J", "onScanNotSupportTime", "m", "transferLaunched", "Lcom/transsion/transfer/wifi/connect/TransferWifiConnectDialog;", "n", "Lcom/transsion/transfer/wifi/connect/TransferWifiConnectDialog;", "loadingDialog", "Laf/a;", "o", "Laf/a;", "callback", "Landroidx/activity/result/b;", "Landroid/content/Intent;", TtmlNode.TAG_P, "Landroidx/activity/result/b;", "permissionResult", "Lkj/b;", CampaignEx.JSON_KEY_AD_Q, "Lkj/b;", "getLogViewConfig", "()Lkj/b;", "logViewConfig", "Transfer_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class WifiConnectActivity extends BaseNewActivity<C25687c> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String serverIp;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean clientReleaseTag;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean transferLaunched;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private TransferWifiConnectDialog loadingDialog;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Lazy clientViewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.wifi.ui.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WifiConnectActivity.m83471T0(this.f63968a);
        }
    });

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private long onScanNotSupportTime = System.currentTimeMillis();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final InterfaceC0089a callback = new C20099a();

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private AbstractC0249b permissionResult = registerForActivityResult(new C23284j(), new InterfaceC0248a() { // from class: com.transsion.transfer.wifi.ui.h
        @Override // androidx.activity.result.InterfaceC0248a
        /* JADX INFO: renamed from: a */
        public final void mo998a(Object obj) {
            WifiConnectActivity.m83486k1(this.f63969a, (ActivityResult) obj);
        }
    });

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final C24655b logViewConfig = new C24655b("wifi_connect_page", false, 2, null);

    /* JADX INFO: renamed from: com.transsion.transfer.wifi.ui.WifiConnectActivity$a */
    public static final class C20099a implements InterfaceC0089a {
        C20099a() {
        }

        @Override // af.InterfaceC0089a
        /* JADX INFO: renamed from: a */
        public void mo459a(List resultPoints) {
            Intrinsics.m97802h(resultPoints, "resultPoints");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // af.InterfaceC0089a
        /* JADX INFO: renamed from: b */
        public void mo460b(C0091c result) {
            Intrinsics.m97802h(result, "result");
            if (result.m468e() != null) {
                ((C25687c) WifiConnectActivity.this.getMViewBinding()).f78043d.pause();
                String strM468e = result.m468e();
                WifiConnectActivity wifiConnectActivity = WifiConnectActivity.this;
                Intrinsics.m97799e(strM468e);
                wifiConnectActivity.m83482g1(strM468e);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.wifi.ui.WifiConnectActivity$b */
    public static final class C20100b implements InterfaceC20072b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C27385a f63951b;

        C20100b(C27385a c27385a) {
            this.f63951b = c27385a;
        }

        @Override // com.transsion.transfer.wifi.connect.InterfaceC20072b
        /* JADX INFO: renamed from: a */
        public void mo83298a(Network network) {
            InterfaceC20072b.a.m83363b(this, network);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.transsion.transfer.wifi.connect.InterfaceC20072b
        /* JADX INFO: renamed from: b */
        public void mo83299b(int i11) {
            C20136g.m83569h(C20136g.f63999a, WifiConnectActivity.this.getClassTag() + " --> connectWifi() --> onFail() --> code = " + i11, false, 2, null);
            ((C25687c) WifiConnectActivity.this.getMViewBinding()).f78043d.resume();
            WifiConnectActivity.this.m83491V0();
            C28951b.f88586a.m111455e(WifiConnectActivity.this.getResources().getString(R$string.transfer_wifi_connect_dialog_failed));
        }

        @Override // com.transsion.transfer.wifi.connect.InterfaceC20072b
        /* JADX INFO: renamed from: c */
        public void mo83300c(InetAddress inetAddress) {
            InterfaceC20072b.a.m83366e(this, inetAddress);
        }

        @Override // com.transsion.transfer.wifi.connect.InterfaceC20072b
        /* JADX INFO: renamed from: d */
        public void mo83301d(int i11) {
            InterfaceC20072b.a.m83362a(this, i11);
        }

        @Override // com.transsion.transfer.wifi.connect.InterfaceC20072b
        /* JADX INFO: renamed from: e */
        public void mo83302e(String ip2) {
            Intrinsics.m97802h(ip2, "ip");
            InterfaceC20072b.a.m83364c(this, ip2);
            String strM83538l = WifiUtils.f63989a.m83538l();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onParsingSuccess: ip:");
            sb2.append(ip2);
            sb2.append(", WifiUtils.getLocalIP():");
            sb2.append(strM83538l);
            if (WifiConnectActivity.this.clientReleaseTag) {
                WifiConnectActivity.this.m83473W0(ip2);
            } else {
                WifiConnectActivity.this.serverIp = ip2;
            }
        }

        @Override // com.transsion.transfer.wifi.connect.InterfaceC20072b
        public void onStart() {
            InterfaceC20072b.a.m83365d(this);
            WifiConnectActivity.this.m83488m1(this.f63951b);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.wifi.ui.WifiConnectActivity$c */
    static final class C20101c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f63952a;

        C20101c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f63952a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f63952a;
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
            this.f63952a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final ClientViewModel m83471T0(WifiConnectActivity wifiConnectActivity) {
        return (ClientViewModel) new C3227v0(wifiConnectActivity).m14969a(ClientViewModel.class);
    }

    /* JADX INFO: renamed from: U0 */
    private final void m83472U0(C27385a wifiInfoModel) {
        WifiConnectionManager.f63861a.m83303n(this, wifiInfoModel, AbstractC3226v.m14968a(this), new C20100b(wifiInfoModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public final void m83473W0(String ip2) {
        TransferClient.C19983a c19983a = TransferClient.f63694t;
        TransferClient.C19983a.m83164m(c19983a, ip2, WifiUtils.f63989a.m83538l(), null, new Function0() { // from class: com.transsion.transfer.wifi.ui.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WifiConnectActivity.m83474X0(this.f63972a);
            }
        }, 4, null);
        C27131b.f82241a.m105571n(c19983a.m83172k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final Unit m83474X0(final WifiConnectActivity wifiConnectActivity) {
        wifiConnectActivity.m83478b1().m82929k(new Function2() { // from class: com.transsion.transfer.wifi.ui.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return WifiConnectActivity.m83475Y0(this.f63976a, ((Boolean) obj).booleanValue(), (String) obj2);
            }
        });
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final Unit m83475Y0(final WifiConnectActivity wifiConnectActivity, boolean z11, String error) {
        Intrinsics.m97802h(error, "error");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("connectWifi connect res:");
        sb2.append(z11);
        if (z11) {
            C27131b.f82241a.m105562e(TransferClient.f63694t.m83172k());
        } else {
            wifiConnectActivity.m83478b1().m82929k(new Function2() { // from class: com.transsion.transfer.wifi.ui.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WifiConnectActivity.m83476Z0(this.f63967a, ((Boolean) obj).booleanValue(), (String) obj2);
                }
            });
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final Unit m83476Z0(WifiConnectActivity wifiConnectActivity, boolean z11, String autoError) {
        Intrinsics.m97802h(autoError, "autoError");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("connectWifi auto retry connect res:");
        sb2.append(z11);
        sb2.append(", autoError:");
        sb2.append(autoError);
        if (z11) {
            C27131b.f82241a.m105562e(TransferClient.f63694t.m83172k());
        } else {
            C27131b.f82241a.m105561d(autoError, TransferClient.f63694t.m83172k());
            wifiConnectActivity.m83491V0();
            WifiConnectionManager.f63861a.m83304s();
            AbstractC25136k.m99058d(AbstractC3226v.m14968a(wifiConnectActivity), C25220y0.m99269c(), null, new WifiConnectActivity$doConnect$1$1$1$1(wifiConnectActivity, null), 2, null);
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a1 */
    private final void m83477a1() {
        ((C25687c) getMViewBinding()).f78043d.setDecoderFactory(new C0099k(CollectionsKt.m97509o(BarcodeFormat.QR_CODE, BarcodeFormat.CODE_39)));
        ((C25687c) getMViewBinding()).f78043d.initializeFromIntent(getIntent());
        ((C25687c) getMViewBinding()).f78043d.decodeContinuous(this.callback);
    }

    /* JADX INFO: renamed from: b1 */
    private final ClientViewModel m83478b1() {
        return (ClientViewModel) this.clientViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final void m83479d1(WifiConnectActivity wifiConnectActivity, View view) {
        wifiConnectActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final Unit m83480e1(WifiConnectActivity wifiConnectActivity, Boolean bool) {
        if (bool.booleanValue() && !wifiConnectActivity.transferLaunched) {
            C27131b.f82241a.m105562e(TransferClient.f63694t.m83172k());
            wifiConnectActivity.transferLaunched = true;
            wifiConnectActivity.m83490o1();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final Unit m83481f1(WifiConnectActivity wifiConnectActivity) {
        wifiConnectActivity.clientReleaseTag = true;
        String str = wifiConnectActivity.serverIp;
        if (str != null) {
            wifiConnectActivity.m83473W0(str);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public final void m83482g1(String scannedText) {
        C20136g.m83566b(C20136g.f63999a, getClassTag() + " --> onScanSuccess() --> scannedText = " + scannedText + " --> 扫码成功 开始解析 建立连接", false, 2, null);
        QrCodeUtil.f63936a.m83441e(scannedText, new Function1() { // from class: com.transsion.transfer.wifi.ui.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WifiConnectActivity.m83483h1(this.f63973a, (C27385a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h1 */
    public static final Unit m83483h1(final WifiConnectActivity wifiConnectActivity, final C27385a c27385a) {
        if (c27385a == null) {
            C28951b.f88586a.m111455e(wifiConnectActivity.getResources().getString(R$string.transfer_wifi_connect_error_tip_no_mb_qr_code, AbstractC5779c.m27326c()));
            ((C25687c) wifiConnectActivity.getMViewBinding()).f78043d.resume();
        } else if (!TextUtils.equals(NetworkUtil.NETWORK_TYPE_5G, c27385a.m106588m()) || WifiUtils.f63989a.m83540n()) {
            C20136g.m83566b(C20136g.f63999a, wifiConnectActivity.getClassTag() + " --> onScanSuccess() --> 预期使用" + c27385a.m106588m() + "通道，且设备支持 -- 开始连接....", false, 2, null);
            C23437c c23437c = C23437c.f71467a;
            if (c23437c.m93044c() && c23437c.m93042a()) {
                c23437c.m93048g(new Function0() { // from class: com.transsion.transfer.wifi.ui.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WifiConnectActivity.m83484i1(this.f63974a, c27385a);
                    }
                });
            } else {
                wifiConnectActivity.m83472U0(c27385a);
            }
        } else {
            if (System.currentTimeMillis() - wifiConnectActivity.onScanNotSupportTime > 1000) {
                C28951b.f88586a.m111455e(wifiConnectActivity.getResources().getString(R$string.transfer_wifi_connect_error_tip_no_support));
            }
            ((C25687c) wifiConnectActivity.getMViewBinding()).f78043d.resume();
            C20136g.m83567d(C20136g.f63999a, wifiConnectActivity.getClassTag() + " --> onScanSuccess() --> 预期使用5G通道，但是设备不支持", false, 2, null);
            wifiConnectActivity.onScanNotSupportTime = System.currentTimeMillis();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i1 */
    public static final Unit m83484i1(final WifiConnectActivity wifiConnectActivity, final C27385a c27385a) {
        ((C25687c) wifiConnectActivity.getMViewBinding()).getRoot().post(new Runnable() { // from class: com.transsion.transfer.wifi.ui.o
            @Override // java.lang.Runnable
            public final void run() {
                WifiConnectActivity.m83485j1(this.f63977a, c27385a);
            }
        });
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final void m83485j1(WifiConnectActivity wifiConnectActivity, C27385a c27385a) {
        wifiConnectActivity.m83472U0(c27385a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final void m83486k1(WifiConnectActivity wifiConnectActivity, ActivityResult result) {
        Intrinsics.m97802h(result, "result");
        if (result.getResultCode() != -1) {
            wifiConnectActivity.finish();
        }
    }

    /* JADX INFO: renamed from: l1 */
    private final void m83487l1(View view, int marginTop) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
        ((ViewGroup.MarginLayoutParams) c2308b).topMargin = marginTop;
        view.setLayoutParams(c2308b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public final void m83488m1(C27385a wifiInfoModel) {
        TransferWifiConnectDialog transferWifiConnectDialog = new TransferWifiConnectDialog();
        transferWifiConnectDialog.m83280p0(new Function0() { // from class: com.transsion.transfer.wifi.ui.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WifiConnectActivity.m83489n1();
            }
        });
        transferWifiConnectDialog.m83281q0(wifiInfoModel);
        this.loadingDialog = transferWifiConnectDialog;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
        transferWifiConnectDialog.show(supportFragmentManager, "TransferWifiConnectDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final Unit m83489n1() {
        WifiConnectionManager.f63861a.mo83299b(2001);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: o1 */
    private final void m83490o1() {
        finish();
        TransferStatusActivity.INSTANCE.m83075b(this);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m83491V0() {
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            TransferWifiConnectDialog transferWifiConnectDialog = this.loadingDialog;
            if (transferWifiConnectDialog != null) {
                transferWifiConnectDialog.dismissAllowingStateLoss();
                unit = Unit.f75682a;
            } else {
                unit = null;
            }
            Result.m112707constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        this.loadingDialog = null;
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public C25687c getViewBinding() {
        C25687c c25687cM101063c = C25687c.m101063c(getLayoutInflater());
        Intrinsics.m97801g(c25687cM101063c, "inflate(...)");
        return c25687cM101063c;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: f0 */
    public String mo65386f0() {
        return "";
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baselib.report.InterfaceC14488g
    public C24655b getLogViewConfig() {
        return this.logViewConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: k0 */
    public void mo65389k0() {
        ((C25687c) getMViewBinding()).f78041b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.transfer.wifi.ui.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiConnectActivity.m83479d1(this.f63966a, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: l0 */
    public void mo65390l0() {
        m83477a1();
        m83478b1().m82931o().m14851j(this, new C20101c(new Function1() { // from class: com.transsion.transfer.wifi.ui.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WifiConnectActivity.m83480e1(this.f63970a, (Boolean) obj);
            }
        }));
        int statusBarHeight = ImmersionBar.getStatusBarHeight((Activity) this);
        AppCompatImageView ivClose = ((C25687c) getMViewBinding()).f78041b;
        Intrinsics.m97801g(ivClose, "ivClose");
        m83487l1(ivClose, statusBarHeight);
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: m0 */
    public void mo65391m0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: n0 */
    public boolean mo65392n0() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        TransferClient.f63694t.m83168e(new Function0() { // from class: com.transsion.transfer.wifi.ui.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WifiConnectActivity.m83481f1(this.f63971a);
            }
        });
        C26114h.f79688s.m102277a();
        super.onCreate(savedInstanceState);
        getWindow().addFlags(128);
        ImmersionBar.with(this).transparentBar().init();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((C25687c) getMViewBinding()).f78043d.pause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseMusicFloatActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((C25687c) getMViewBinding()).f78043d.resume();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: p0 */
    public void mo65394p0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: q0 */
    public void mo65395q0() {
        super.mo65395q0();
        C20096d c20096d = C20096d.f63935a;
        if (c20096d.m83433g(c20096d.m83430c())) {
            return;
        }
        Intent intent = new Intent(this, (Class<?>) PermissionsActivity.class);
        intent.setAction("com.transsion.transfer.wifi.util.receive");
        this.permissionResult.m999a(intent);
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void retryLoadData() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean setImmersionStatusBar() {
        return false;
    }
}
