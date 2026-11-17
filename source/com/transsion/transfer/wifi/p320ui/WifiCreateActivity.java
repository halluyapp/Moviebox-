package com.transsion.transfer.wifi.p320ui;

import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0248a;
import androidx.fragment.app.FragmentManager;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.ViewModelLazy;
import ck.C5127x;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.view.SwitchButton;
import com.p282tn.lib.view.TitleLayout;
import com.transsion.baseui.activity.BaseNewActivity;
import com.transsion.transfer.R$string;
import com.transsion.transfer.impl.C20022k;
import com.transsion.transfer.impl.C20024l;
import com.transsion.transfer.impl.TransferStatusActivity;
import com.transsion.transfer.impl.client.TransferClient;
import com.transsion.transfer.wifi.create.InterfaceC20073a;
import com.transsion.transfer.wifi.create.WifiCreateManager;
import com.transsion.transfer.wifi.permission.C20096d;
import com.transsion.transfer.wifi.permission.PermissionsActivity;
import com.transsion.transfer.wifi.util.C20136g;
import com.transsion.transfer.wifi.util.WifiUtils;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import lv.C25688d;
import p393f.C23284j;
import p419fv.C23437c;
import p550kj.C24655b;
import p624nv.C26114h;
import p669p1.AbstractC26781a;
import p721qv.C27131b;
import p721qv.C27132c;
import p754rv.C27385a;
import sv.C27657b;
import tv.C27858c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J!\u0010\u000b\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u0019\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\u0005H\u0014¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010\u0004R\u0018\u0010*\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00108\u001a\b\u0012\u0004\u0012\u000205048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00102R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00102R\u001a\u0010F\u001a\u00020A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006G"}, m97100d2 = {"Lcom/transsion/transfer/wifi/ui/WifiCreateActivity;", "Lcom/transsion/baseui/activity/BaseNewActivity;", "Llv/d;", "<init>", "()V", "", "Q0", "Lrv/a;", "wifiInfoModel", "", "duration", "P0", "(Lrv/a;J)V", "", "code", "O0", "(IJ)V", "c1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "S0", "()Llv/d;", "", "f0", "()Ljava/lang/String;", "", "n0", "()Z", "isTranslucent", "isStatusDark", "l0", "m0", "k0", "p0", "q0", "retryLoadData", "onDestroy", "finish", "i", "Lrv/a;", "mWifiInfoModel", "Lcom/transsion/transfer/impl/k;", "j", "Lkotlin/Lazy;", "R0", "()Lcom/transsion/transfer/impl/k;", "serverViewModel", CampaignEx.JSON_KEY_AD_K, "Z", "p2pInUseTag", "Landroidx/activity/result/b;", "Landroid/content/Intent;", "l", "Landroidx/activity/result/b;", "permissionResult", "m", "isCanceled", "Ltv/c;", "n", "Ltv/c;", "shareManager", "o", "is5GChannel", "Lkj/b;", TtmlNode.TAG_P, "Lkj/b;", "getLogViewConfig", "()Lkj/b;", "logViewConfig", "Transfer_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class WifiCreateActivity extends BaseNewActivity<C25688d> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private C27385a mWifiInfoModel;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Lazy serverViewModel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean p2pInUseTag;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean is5GChannel;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private AbstractC0249b permissionResult = registerForActivityResult(new C23284j(), new InterfaceC0248a() { // from class: com.transsion.transfer.wifi.ui.w
        @Override // androidx.activity.result.InterfaceC0248a
        /* JADX INFO: renamed from: a */
        public final void mo998a(Object obj) {
            WifiCreateActivity.m83517b1(this.f63985a, (ActivityResult) obj);
        }
    });

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean isCanceled = true;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C27858c shareManager = new C27858c();

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C24655b logViewConfig = new C24655b("wifi_create_page", false, 2, null);

    /* JADX INFO: renamed from: com.transsion.transfer.wifi.ui.WifiCreateActivity$a */
    public static final class C20102a implements InterfaceC20073a {
        C20102a() {
        }

        @Override // com.transsion.transfer.wifi.create.InterfaceC20073a
        /* JADX INFO: renamed from: a */
        public void mo83373a(C27385a c27385a, long j11) {
            WifiCreateActivity.this.m83506P0(c27385a, j11);
        }

        @Override // com.transsion.transfer.wifi.create.InterfaceC20073a
        /* JADX INFO: renamed from: b */
        public void mo83374b(int i11, long j11) {
            WifiCreateActivity.this.m83505O0(i11, j11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.transsion.transfer.wifi.create.InterfaceC20073a
        public void onStart() {
            C20136g.m83566b(C20136g.f63999a, WifiCreateActivity.this.getClassTag() + " --> createWifi() --> start .... --> WifiCreateActivity.hashCode() = " + WifiCreateActivity.this.hashCode(), false, 2, null);
            ((C25688d) WifiCreateActivity.this.getMViewBinding()).f78051h.setVisibility(0);
            ((C25688d) WifiCreateActivity.this.getMViewBinding()).f78048e.setImageBitmap(null);
            ((C25688d) WifiCreateActivity.this.getMViewBinding()).f78045b.setVisibility(8);
            ((C25688d) WifiCreateActivity.this.getMViewBinding()).f78046c.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.wifi.ui.WifiCreateActivity$b */
    static final class C20103b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f63962a;

        C20103b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f63962a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f63962a;
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
            this.f63962a.invoke(obj);
        }
    }

    public WifiCreateActivity() {
        final Function0 function0 = null;
        this.serverViewModel = new ViewModelLazy(Reflection.m97823b(C20022k.class), new Function0<C3231x0>() { // from class: com.transsion.transfer.wifi.ui.WifiCreateActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.transfer.wifi.ui.WifiCreateActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<AbstractC26781a>() { // from class: com.transsion.transfer.wifi.ui.WifiCreateActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final AbstractC26781a invoke() {
                AbstractC26781a abstractC26781a;
                Function0 function1 = function0;
                return (function1 == null || (abstractC26781a = (AbstractC26781a) function1.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : abstractC26781a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O0 */
    public final void m83505O0(int code, long duration) {
        C20136g.m83569h(C20136g.f63999a, getClassTag() + " --> createWifi() --> 热点创建 失败 --> code = " + code, false, 2, null);
        ((C25688d) getMViewBinding()).f78051h.setVisibility(8);
        ((C25688d) getMViewBinding()).f78046c.setVisibility(8);
        ((C25688d) getMViewBinding()).f78045b.setVisibility(0);
        this.isCanceled = false;
        C27132c.f82242a.m105587i(code);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P0 */
    public final void m83506P0(C27385a wifiInfoModel, long duration) {
        C20136g.m83566b(C20136g.f63999a, getClassTag() + " --> createWifi() --> successFun() --> Wi-Fi创建成功 -- 刷新UI --> 展示二维码等信息", false, 2, null);
        this.mWifiInfoModel = wifiInfoModel;
        m83508R0().m83241A();
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new WifiCreateActivity$createSuccess$1(wifiInfoModel, this, duration, null), 3, null);
        ((C25688d) getMViewBinding()).f78060q.setText(wifiInfoModel != null ? wifiInfoModel.m106591p() : null);
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m83507Q0() {
        C20024l.f63798a.m83262b(this.is5GChannel ? "5g" : "2.4g");
        WifiCreateManager.f63911a.m83375g(C27385a.f83423r.m106604c(this.is5GChannel), AbstractC3226v.m14968a(this), new C20102a());
    }

    /* JADX INFO: renamed from: R0 */
    private final C20022k m83508R0() {
        return (C20022k) this.serverViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final void m83509T0(WifiCreateActivity wifiCreateActivity, View view) {
        ShareMbApkDialog shareMbApkDialog = new ShareMbApkDialog();
        shareMbApkDialog.m83448r0(wifiCreateActivity.mWifiInfoModel);
        FragmentManager supportFragmentManager = wifiCreateActivity.getSupportFragmentManager();
        Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
        shareMbApkDialog.show(supportFragmentManager, "ShareMbApkDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final void m83510U0(WifiCreateActivity wifiCreateActivity, View view) {
        wifiCreateActivity.shareManager.m108382i(wifiCreateActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final void m83511V0(WifiCreateActivity wifiCreateActivity, View view) {
        Object systemService = wifiCreateActivity.getSystemService(RequestParameters.SUBRESOURCE_LOCATION);
        Intrinsics.m97800f(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        if (((LocationManager) systemService).isProviderEnabled("gps")) {
            wifiCreateActivity.mo65395q0();
        } else {
            Toast.makeText(wifiCreateActivity, wifiCreateActivity.getResources().getString(R$string.transfer_wifi_positioning_tip), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final void m83512W0(WifiCreateActivity wifiCreateActivity, SwitchButton switchButton, boolean z11) {
        wifiCreateActivity.is5GChannel = z11;
        wifiCreateActivity.mo65395q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X0 */
    public static final Unit m83513X0(final WifiCreateActivity wifiCreateActivity) {
        ((C25688d) wifiCreateActivity.getMViewBinding()).getRoot().post(new Runnable() { // from class: com.transsion.transfer.wifi.ui.x
            @Override // java.lang.Runnable
            public final void run() {
                WifiCreateActivity.m83514Y0(this.f63986a);
            }
        });
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final void m83514Y0(WifiCreateActivity wifiCreateActivity) {
        wifiCreateActivity.m83507Q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final Unit m83515Z0() {
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final Unit m83516a1(WifiCreateActivity wifiCreateActivity, Pair pair) {
        if (((Boolean) pair.getSecond()).booleanValue()) {
            C27131b.f82241a.m105572o(wifiCreateActivity.m83508R0().m83253t());
            wifiCreateActivity.m83518c1();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final void m83517b1(WifiCreateActivity wifiCreateActivity, ActivityResult result) {
        Intrinsics.m97802h(result, "result");
        if (result.getResultCode() == -1) {
            wifiCreateActivity.mo65395q0();
        } else {
            wifiCreateActivity.finish();
        }
    }

    /* JADX INFO: renamed from: c1 */
    private final void m83518c1() {
        if (C27657b.f84826a.m107599i()) {
            C20136g.m83569h(C20136g.f63999a, getClassTag() + " -->startServerSendData  没有数据，连接成功关闭页面", false, 2, null);
        } else {
            C20136g.m83569h(C20136g.f63999a, getClassTag() + " -->startServerSendData  有数据，发送数据", false, 2, null);
        }
        this.p2pInUseTag = true;
        TransferStatusActivity.INSTANCE.m83076c(this);
        finish();
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public C25688d getViewBinding() {
        C25688d c25688dM101067c = C25688d.m101067c(getLayoutInflater());
        Intrinsics.m97801g(c25688dM101067c, "inflate(...)");
        return c25688dM101067c;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: f0 */
    public String mo65386f0() {
        return "";
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.p2pInUseTag) {
            return;
        }
        WifiCreateManager.f63911a.m83376j();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baselib.report.InterfaceC14488g
    public C24655b getLogViewConfig() {
        return this.logViewConfig;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isStatusDark() {
        return !C5127x.f17620a.m23969a();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isTranslucent() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: k0 */
    public void mo65389k0() {
        ((C25688d) getMViewBinding()).f78058o.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.transfer.wifi.ui.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiCreateActivity.m83509T0(this.f63980a, view);
            }
        });
        ((C25688d) getMViewBinding()).f78057n.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.transfer.wifi.ui.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiCreateActivity.m83510U0(this.f63981a, view);
            }
        });
        ((C25688d) getMViewBinding()).f78055l.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.transfer.wifi.ui.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiCreateActivity.m83511V0(this.f63982a, view);
            }
        });
        ((C25688d) getMViewBinding()).f78052i.setChecked(this.is5GChannel);
        ((C25688d) getMViewBinding()).f78052i.setOnCheckedChangeListener(new SwitchButton.InterfaceC13732d() { // from class: com.transsion.transfer.wifi.ui.t
            @Override // com.p282tn.lib.view.SwitchButton.InterfaceC13732d
            /* JADX INFO: renamed from: a */
            public final void mo62077a(SwitchButton switchButton, boolean z11) {
                WifiCreateActivity.m83512W0(this.f63983a, switchButton, z11);
            }
        });
        if (WifiUtils.f63989a.m83540n()) {
            return;
        }
        ((C25688d) getMViewBinding()).f78052i.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: l0 */
    public void mo65390l0() {
        TitleLayout titleLayout = ((C25688d) getMViewBinding()).f78053j;
        String string = getResources().getString(R$string.transfer_wifi_create_connect_device);
        Intrinsics.m97801g(string, "getString(...)");
        titleLayout.setTitleText(string);
        this.shareManager.m108381g(this);
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
        TransferClient.f63694t.m83168e(new Function0() { // from class: com.transsion.transfer.wifi.ui.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WifiCreateActivity.m83515Z0();
            }
        });
        C26114h.f79688s.m102277a();
        super.onCreate(savedInstanceState);
        getWindow().addFlags(128);
        C20022k c20022kM83508R0 = m83508R0();
        Function4 function4M83251r = m83508R0().m83251r();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("loadDefaultData: serverViewModel.getConnectEventSource().observe:");
        sb2.append(c20022kM83508R0);
        sb2.append(",");
        sb2.append(function4M83251r);
        m83508R0().m83257x();
        m83508R0().m83249o().m14851j(this, new C20103b(new Function1() { // from class: com.transsion.transfer.wifi.ui.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WifiCreateActivity.m83516a1(this.f63984a, (Pair) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.isCanceled) {
            C20096d c20096d = C20096d.f63935a;
            if (c20096d.m83433g(c20096d.m83431e())) {
                C27132c.f82242a.m105586h();
            }
        }
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
        if (!c20096d.m83433g(c20096d.m83431e())) {
            Intent intent = new Intent(this, (Class<?>) PermissionsActivity.class);
            intent.setAction("com.transsion.transfer.wifi.util.send");
            this.permissionResult.m999a(intent);
        } else {
            if (m83508R0().m83258y() && m83508R0().m83244j()) {
                m83518c1();
                return;
            }
            C23437c c23437c = C23437c.f71467a;
            if (c23437c.m93045d() && c23437c.m93043b()) {
                c23437c.m93049h(new Function0() { // from class: com.transsion.transfer.wifi.ui.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WifiCreateActivity.m83513X0(this.f63979a);
                    }
                });
            } else {
                m83507Q0();
            }
        }
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void retryLoadData() {
    }
}
