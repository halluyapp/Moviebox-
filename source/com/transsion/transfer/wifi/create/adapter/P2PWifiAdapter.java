package com.transsion.transfer.wifi.create.adapter;

import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pInfo;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.kernel.utils.NetworkUtil;
import com.transsion.transfer.wifi.util.C20131b;
import com.transsion.transfer.wifi.util.C20136g;
import com.transsion.transfer.wifi.util.C20138i;
import com.transsion.transfer.wifi.util.WifiUtils;
import java.lang.reflect.Method;
import java.net.InetAddress;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25207u0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p754rv.C27385a;

/* JADX INFO: loaded from: classes6.dex */
public final class P2PWifiAdapter extends AbstractC20078b {

    /* JADX INFO: renamed from: e */
    private int f63916e;

    /* JADX INFO: renamed from: f */
    private int f63917f;

    /* JADX INFO: renamed from: h */
    private WifiP2pManager.Channel f63919h;

    /* JADX INFO: renamed from: d */
    private final int f63915d = 10;

    /* JADX INFO: renamed from: g */
    private final Lazy f63918g = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.wifi.create.adapter.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return P2PWifiAdapter.m83383G();
        }
    });

    /* JADX INFO: renamed from: com.transsion.transfer.wifi.create.adapter.P2PWifiAdapter$a */
    public static final class C20074a implements WifiP2pManager.ActionListener {
        C20074a() {
        }

        @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
        public void onFailure(int i11) {
            C20136g.m83566b(C20136g.f63999a, P2PWifiAdapter.this.m83403b() + " --> setDeviceName() --> 反射创建 --> onFailure() --> reason = " + C20138i.f64000a.m83578b(i11) + " --> 失败重试", false, 2, null);
            P2PWifiAdapter.this.m83381E();
        }

        @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
        public void onSuccess() {
            String string = Settings.Global.getString(Utils.m27275a().getApplicationContext().getContentResolver(), "wifi_p2p_device_name");
            C20136g.m83566b(C20136g.f63999a, P2PWifiAdapter.this.m83403b() + " --> setDeviceName() --> 反射创建 --> onSuccess() --> deviceName = " + string, false, 2, null);
            P2PWifiAdapter.this.m83393s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m83377A(P2PWifiAdapter p2PWifiAdapter, WifiP2pGroup wifiP2pGroup, WifiP2pInfo wifiP2pInfo) {
        if (wifiP2pInfo == null) {
            C20136g.m83566b(C20136g.f63999a, p2PWifiAdapter.m83403b() + " --> requestConnectionInfo() --> 获取可连接信息失败 (p2pInfo == null)", false, 2, null);
            p2PWifiAdapter.m83380D();
            return;
        }
        InetAddress inetAddress = wifiP2pInfo.groupOwnerAddress;
        C20136g c20136g = C20136g.f63999a;
        C20136g.m83566b(c20136g, p2PWifiAdapter.m83403b() + " --> requestConnectionInfo() --> Group Owner Address = " + inetAddress, false, 2, null);
        String strM83396v = p2PWifiAdapter.m83396v(inetAddress);
        if (TextUtils.isEmpty(strM83396v)) {
            C20136g.m83566b(c20136g, p2PWifiAdapter.m83403b() + " --> requestConnectionInfo() --> 获取可连接Ip失败 --> correctIp 为空", false, 2, null);
            p2PWifiAdapter.m83380D();
            return;
        }
        C27385a c27385aM83406e = p2PWifiAdapter.m83406e();
        if (c27385aM83406e != null) {
            c27385aM83406e.m106575H(wifiP2pGroup.getNetworkName());
        }
        C27385a c27385aM83406e2 = p2PWifiAdapter.m83406e();
        if (c27385aM83406e2 != null) {
            c27385aM83406e2.m106574G(wifiP2pGroup.getPassphrase());
        }
        C27385a c27385aM83406e3 = p2PWifiAdapter.m83406e();
        if (c27385aM83406e3 != null) {
            c27385aM83406e3.m106573F(strM83396v);
        }
        C20136g.m83566b(c20136g, p2PWifiAdapter.m83403b() + " --> requestConnectionInfo() --> 最终ip为 correctIp = " + strM83396v, false, 2, null);
        InterfaceC25149n0 interfaceC25149n0M83404c = p2PWifiAdapter.m83404c();
        if (interfaceC25149n0M83404c != null) {
            AbstractC25136k.m99058d(interfaceC25149n0M83404c, null, null, new P2PWifiAdapter$requestConnectionInfo$1$1$1(p2PWifiAdapter, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x008e, please report this as an issue */
    /* JADX INFO: renamed from: B */
    public final Object m83378B(Continuation continuation) throws Throwable {
        P2PWifiAdapter$requestGroupInfo$1 p2PWifiAdapter$requestGroupInfo$1;
        Unit unit;
        if (continuation instanceof P2PWifiAdapter$requestGroupInfo$1) {
            p2PWifiAdapter$requestGroupInfo$1 = (P2PWifiAdapter$requestGroupInfo$1) continuation;
            int i11 = p2PWifiAdapter$requestGroupInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                p2PWifiAdapter$requestGroupInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                p2PWifiAdapter$requestGroupInfo$1 = new P2PWifiAdapter$requestGroupInfo$1(this, continuation);
            }
        } else {
            p2PWifiAdapter$requestGroupInfo$1 = new P2PWifiAdapter$requestGroupInfo$1(this, continuation);
        }
        Object obj = p2PWifiAdapter$requestGroupInfo$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = p2PWifiAdapter$requestGroupInfo$1.label;
        if (i12 == 0) {
            ResultKt.m97107b(obj);
            if (this.f63917f >= this.f63915d) {
                m83398x(101);
                return Unit.f75682a;
            }
            C20136g.m83566b(C20136g.f63999a, m83403b() + " --> requestGroupInfo() --> Wi-Fi P2P 创建成功之后，将自己添加到群组 --> 第" + this.f63917f + " 次获取热点相关信息", false, 2, null);
            p2PWifiAdapter$requestGroupInfo$1.label = 1;
            if (AbstractC25207u0.m99223a(300L, p2PWifiAdapter$requestGroupInfo$1) == objF) {
                return objF;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        if (this.f63919h == null) {
            C20136g.m83566b(C20136g.f63999a, m83403b() + " --> requestGroupInfo() --> p2pChannel == null --> 失败重试 --> retryCreate()", false, 2, null);
            m83381E();
        } else {
            WifiP2pManager wifiP2pManagerM83397w = m83397w();
            if (wifiP2pManagerM83397w != null) {
                wifiP2pManagerM83397w.requestGroupInfo(this.f63919h, new WifiP2pManager.GroupInfoListener() { // from class: com.transsion.transfer.wifi.create.adapter.k
                    @Override // android.net.wifi.p2p.WifiP2pManager.GroupInfoListener
                    public final void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
                        P2PWifiAdapter.m83379C(this.f63926a, wifiP2pGroup);
                    }
                });
                unit = Unit.f75682a;
            } else {
                unit = null;
            }
            if (unit == null) {
                C20136g.m83566b(C20136g.f63999a, m83403b() + " --> requestGroupInfo() --> p2pChannel == null --> 失败重试 --> retryCreate()", false, 2, null);
                m83381E();
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m83379C(P2PWifiAdapter p2PWifiAdapter, WifiP2pGroup wifiP2pGroup) {
        if (wifiP2pGroup != null) {
            C20136g.m83566b(C20136g.f63999a, p2PWifiAdapter.m83403b() + " --> requestGroupInfo() --> requestGroupInfo() --> 获取Group信息成功,开始获取连接信息", false, 2, null);
            p2PWifiAdapter.m83399z(wifiP2pGroup);
            return;
        }
        C20136g.m83566b(C20136g.f63999a, p2PWifiAdapter.m83403b() + " --> requestGroupInfo() --> 获取Group信息失败 --> wifiP2pGroup == null", false, 2, null);
        p2PWifiAdapter.m83380D();
    }

    /* JADX INFO: renamed from: D */
    private final void m83380D() {
        InterfaceC25149n0 interfaceC25149n0M83404c = m83404c();
        if (interfaceC25149n0M83404c != null) {
            AbstractC25136k.m99058d(interfaceC25149n0M83404c, null, null, new P2PWifiAdapter$retry$1(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final void m83381E() {
        int i11 = this.f63916e + 1;
        this.f63916e = i11;
        if (i11 > this.f63915d) {
            C20136g.m83566b(C20136g.f63999a, m83403b() + " --> retryCreate() --> 重试次数 = " + this.f63916e + "，判定创建热点失败", false, 2, null);
            m83398x(102);
            return;
        }
        C20136g.m83566b(C20136g.f63999a, m83403b() + " --> retryCreate() --> 重新创建热点 -- 失败次数 = " + this.f63916e, false, 2, null);
        int i12 = this.f63916e;
        if (i12 <= 1 || i12 == 5) {
            m83392r();
            return;
        }
        InterfaceC25149n0 interfaceC25149n0M83404c = m83404c();
        if (interfaceC25149n0M83404c != null) {
            AbstractC25136k.m99058d(interfaceC25149n0M83404c, null, null, new P2PWifiAdapter$retryCreate$1(this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: F */
    private final void m83382F() {
        Object objM112707constructorimpl;
        C20074a c20074a = new C20074a();
        try {
            Result.Companion companion = Result.INSTANCE;
            WifiP2pManager wifiP2pManagerM83397w = m83397w();
            if (wifiP2pManagerM83397w != null) {
                Method declaredMethod = wifiP2pManagerM83397w.getClass().getDeclaredMethod("setDeviceName", WifiP2pManager.Channel.class, String.class, WifiP2pManager.ActionListener.class);
                C20136g c20136g = C20136g.f63999a;
                String strM83403b = m83403b();
                int i11 = Build.VERSION.SDK_INT;
                C27385a c27385aM83406e = m83406e();
                String strM106591p = c27385aM83406e != null ? c27385aM83406e.m106591p() : null;
                C27385a c27385aM83406e2 = m83406e();
                C20136g.m83566b(c20136g, strM83403b + " --> setDeviceName() --> API < 29 -- Android" + i11 + "设备(Q以上下) 创建 --> WIFI名称 = " + strM106591p + " -- WIFI频段 = " + (c27385aM83406e2 != null ? c27385aM83406e2.m106588m() : null), false, 2, null);
                WifiP2pManager wifiP2pManagerM83397w2 = m83397w();
                WifiP2pManager.Channel channel = this.f63919h;
                C27385a c27385aM83406e3 = m83406e();
                declaredMethod.invoke(wifiP2pManagerM83397w2, channel, c27385aM83406e3 != null ? c27385aM83406e3.m106591p() : null, c20074a);
            }
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl == null) {
            return;
        }
        C20136g.m83567d(C20136g.f63999a, m83403b() + " --> setDeviceName() --> Build.VERSION.SDK_INT < Q --> 反射创建失败 -->exception = " + thM112710exceptionOrNullimpl + " --> 失败重试", false, 2, null);
        m83381E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final WifiP2pManager m83383G() {
        Object systemService = Utils.m27275a().getApplicationContext().getSystemService("wifip2p");
        if (systemService instanceof WifiP2pManager) {
            return (WifiP2pManager) systemService;
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    private final void m83392r() {
        Ref.IntRef intRef = new Ref.IntRef();
        InterfaceC25149n0 interfaceC25149n0M83404c = m83404c();
        if (interfaceC25149n0M83404c != null) {
            AbstractC25136k.m99058d(interfaceC25149n0M83404c, C25220y0.m99268b(), null, new P2PWifiAdapter$closeWifiAndReCreateHot$1(intRef, this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final void m83393s() {
        Unit unit;
        WifiP2pManager.Channel channel = this.f63919h;
        if (channel != null) {
            WifiP2pManager wifiP2pManagerM83397w = m83397w();
            if (wifiP2pManagerM83397w != null) {
                wifiP2pManagerM83397w.createGroup(channel, new WifiP2pManager.ActionListener() { // from class: com.transsion.transfer.wifi.create.adapter.P2PWifiAdapter$createGroup$1$1
                    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
                    public void onFailure(int i11) {
                        C20136g.m83566b(C20136g.f63999a, this.f63921a.m83403b() + " --> setDeviceName() --> createGroup() --> onFailure() --> reason = " + C20138i.f64000a.m83578b(i11) + " --> 失败重试", false, 2, null);
                        this.f63921a.m83381E();
                    }

                    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
                    public void onSuccess() {
                        C20136g.m83566b(C20136g.f63999a, this.f63921a.m83403b() + " --> setDeviceName() --> createGroup() --> onSuccess()", false, 2, null);
                        InterfaceC25149n0 interfaceC25149n0M83404c = this.f63921a.m83404c();
                        if (interfaceC25149n0M83404c != null) {
                            AbstractC25136k.m99058d(interfaceC25149n0M83404c, null, null, new P2PWifiAdapter$createGroup$1$1$onSuccess$1(this.f63921a, null), 3, null);
                        }
                    }
                });
                unit = Unit.f75682a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        C20136g.m83566b(C20136g.f63999a, m83403b() + " --> createGroup() --> p2pChannel == null --> 失败重试", false, 2, null);
        m83381E();
    }

    /* JADX INFO: renamed from: t */
    private final void m83394t(WifiP2pConfig.Builder builder) {
        Unit unit;
        WifiP2pManager.Channel channel = this.f63919h;
        if (channel != null) {
            WifiP2pManager wifiP2pManagerM83397w = m83397w();
            if (wifiP2pManagerM83397w != null) {
                wifiP2pManagerM83397w.createGroup(channel, builder.build(), new WifiP2pManager.ActionListener() { // from class: com.transsion.transfer.wifi.create.adapter.P2PWifiAdapter$createGroupQ$1$1
                    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
                    public void onFailure(int i11) {
                        C20136g.m83567d(C20136g.f63999a, this.f63922a.m83403b() + " --> createWifiP2pGroup() --> createGroup() --> 创建群组失败 -- reason = " + C20138i.f64000a.m83578b(i11) + " --> 失败重试", false, 2, null);
                        this.f63922a.m83381E();
                    }

                    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
                    public void onSuccess() {
                        C20136g.m83566b(C20136g.f63999a, this.f63922a.m83403b() + " --> createWifiP2pGroup() --> createGroup() --> onSuccess() --> 创建群组成功", false, 2, null);
                        InterfaceC25149n0 interfaceC25149n0M83404c = this.f63922a.m83404c();
                        if (interfaceC25149n0M83404c != null) {
                            AbstractC25136k.m99058d(interfaceC25149n0M83404c, null, null, new P2PWifiAdapter$createGroupQ$1$1$onSuccess$1(this.f63922a, null), 3, null);
                        }
                    }
                });
                unit = Unit.f75682a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        C20136g.m83566b(C20136g.f63999a, m83403b() + " --> createGroupQ() --> p2pChannel == null --> 失败重试", false, 2, null);
        m83381E();
    }

    /* JADX INFO: renamed from: u */
    private final void m83395u() {
        String strM106591p;
        Object objM112707constructorimpl;
        String str;
        C27385a c27385aM83406e = m83406e();
        if (c27385aM83406e == null || (strM106591p = c27385aM83406e.m106591p()) == null) {
            strM106591p = "";
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            String strSubstring = C20131b.f63992a.m83555a(strM106591p).substring(0, 8);
            Intrinsics.m97801g(strSubstring, "substring(...)");
            objM112707constructorimpl = Result.m112707constructorimpl(strSubstring);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        String str2 = (String) (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) == null ? objM112707constructorimpl : "");
        WifiP2pConfig.Builder passphrase = AbstractC20080d.m83410a().setNetworkName(strM106591p).setPassphrase(str2);
        Intrinsics.m97801g(passphrase, "setPassphrase(...)");
        C27385a c27385aM83406e2 = m83406e();
        if (c27385aM83406e2 == null || !c27385aM83406e2.m106576a()) {
            passphrase.setGroupOperatingBand(1);
            str = "2.4G";
        } else {
            passphrase.setGroupOperatingBand(2);
            str = NetworkUtil.NETWORK_TYPE_5G;
        }
        C20136g.m83566b(C20136g.f63999a, m83403b() + " --> createWifiP2pGroup() --> API >= 29 -- Android" + Build.VERSION.SDK_INT + "设备(Q及其以上) 创建 --> WIFI名称 = " + strM106591p + " -- 密码 = " + str2 + " -- WIFI频段 = " + str, false, 2, null);
        m83394t(passphrase);
    }

    /* JADX INFO: renamed from: v */
    private final String m83396v(InetAddress inetAddress) {
        WifiUtils wifiUtils = WifiUtils.f63989a;
        String strM83533g = wifiUtils.m83533g(inetAddress);
        if (!TextUtils.isEmpty(strM83533g)) {
            C20136g.m83566b(C20136g.f63999a, m83403b() + " --> getCorrectIp() --> ip --> getCorrectOwnerAddress() = " + strM83533g, false, 2, null);
            return strM83533g;
        }
        String strM83538l = wifiUtils.m83538l();
        C20136g.m83566b(C20136g.f63999a, m83403b() + " --> getCorrectIp() --> ip --> localIP() = " + strM83538l, false, 2, null);
        return strM83538l;
    }

    /* JADX INFO: renamed from: w */
    private final WifiP2pManager m83397w() {
        return (WifiP2pManager) this.f63918g.getValue();
    }

    /* JADX INFO: renamed from: x */
    private final void m83398x(int i11) {
        InterfaceC25149n0 interfaceC25149n0M83404c = m83404c();
        if (interfaceC25149n0M83404c != null) {
            AbstractC25136k.m99058d(interfaceC25149n0M83404c, null, null, new P2PWifiAdapter$onFail$1(this, i11, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: z */
    private final void m83399z(final WifiP2pGroup wifiP2pGroup) {
        Unit unit;
        WifiP2pManager.Channel channel = this.f63919h;
        if (channel != null) {
            WifiP2pManager wifiP2pManagerM83397w = m83397w();
            if (wifiP2pManagerM83397w != null) {
                wifiP2pManagerM83397w.requestConnectionInfo(channel, new WifiP2pManager.ConnectionInfoListener() { // from class: com.transsion.transfer.wifi.create.adapter.l
                    @Override // android.net.wifi.p2p.WifiP2pManager.ConnectionInfoListener
                    public final void onConnectionInfoAvailable(WifiP2pInfo wifiP2pInfo) {
                        P2PWifiAdapter.m83377A(this.f63927a, wifiP2pGroup, wifiP2pInfo);
                    }
                });
                unit = Unit.f75682a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        C20136g.m83566b(C20136g.f63999a, m83403b() + " --> requestConnectionInfo() --> p2pChannel == null --> 失败重试 --> retryCreate()", false, 2, null);
        m83381E();
    }

    @Override // com.transsion.transfer.wifi.create.adapter.AbstractC20078b
    /* JADX INFO: renamed from: a */
    public Object mo83400a(Continuation continuation) {
        C20136g c20136g = C20136g.f63999a;
        C20136g.m83566b(c20136g, m83403b() + " --> createWifiHot() --> start", false, 2, null);
        WifiP2pManager wifiP2pManagerM83397w = m83397w();
        this.f63919h = wifiP2pManagerM83397w != null ? wifiP2pManagerM83397w.initialize(Utils.m27275a().getApplicationContext(), Looper.getMainLooper(), null) : null;
        int i11 = Build.VERSION.SDK_INT;
        if (WifiUtils.f63989a.m83543s()) {
            C20136g.m83566b(c20136g, m83403b() + " --> createWifiHot() --> Android" + i11 + "设备(Q以下) 开始创建P2P WIFI热点", false, 2, null);
            m83382F();
        } else {
            C20136g.m83566b(c20136g, m83403b() + " --> createWifiHot() --> Android" + i11 + "设备(Q及其以上) 开始创建P2P WIFI热点", false, 2, null);
            m83395u();
        }
        return Unit.f75682a;
    }

    @Override // com.transsion.transfer.wifi.create.adapter.AbstractC20078b
    /* JADX INFO: renamed from: f */
    public void mo83401f() {
        m83402y();
        m83407g(null);
        m83408h(null);
        this.f63919h = null;
    }

    /* JADX INFO: renamed from: y */
    public void m83402y() {
        Object objM112707constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            C20138i.f64000a.m83579d(m83397w(), this.f63919h, true, false, false, true);
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl == null) {
            return;
        }
        C20136g.m83567d(C20136g.f63999a, m83403b() + " --> releaseWifiP2P() --> 关闭P2P频段异常 -- it = " + thM112710exceptionOrNullimpl, false, 2, null);
    }
}
