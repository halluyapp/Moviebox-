package com.transsion.transfer.wifi.qrcode;

import android.text.TextUtils;
import com.cloud.tmc.kernel.utils.UrlUtils;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.transfer.wifi.util.C20134e;
import com.transsion.transfer.wifi.util.C20136g;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.C25220y0;
import p754rv.C27385a;
import p913xm.C28615f;

/* JADX INFO: loaded from: classes6.dex */
public final class QrCodeUtil {

    /* JADX INFO: renamed from: a */
    public static final QrCodeUtil f63936a = new QrCodeUtil();

    private QrCodeUtil() {
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01a5 A[PHI: r6
      0x01a5: PHI (r6v21 rv.a) = 
      (r6v3 rv.a)
      (r6v4 rv.a)
      (r6v5 rv.a)
      (r6v6 rv.a)
      (r6v7 rv.a)
      (r6v8 rv.a)
      (r6v9 rv.a)
      (r6v10 rv.a)
      (r6v11 rv.a)
      (r6v12 rv.a)
      (r6v13 rv.a)
      (r6v14 rv.a)
      (r6v15 rv.a)
      (r6v16 rv.a)
      (r6v17 rv.a)
      (r6v22 rv.a)
     binds: [B:69:0x01a3, B:65:0x018e, B:61:0x0179, B:57:0x0163, B:53:0x014d, B:49:0x0136, B:45:0x011f, B:41:0x0108, B:37:0x00f1, B:33:0x00da, B:29:0x00c3, B:25:0x00ac, B:21:0x0095, B:17:0x007e, B:13:0x0067, B:7:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x01a5, please report this as an issue */
    /* JADX INFO: renamed from: a */
    private final C27385a m83436a(Map map) {
        C27385a c27385a;
        C27385a c27385a2 = c27385a;
        C27385a c27385a3 = new C27385a(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 131071, null);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            switch (str.hashCode()) {
                case -1627415939:
                    c27385a = c27385a2;
                    if (str.equals("mb_wifi_pwd")) {
                        c27385a.m106574G((String) entry.getValue());
                    } else {
                        C20136g.m83566b(C20136g.f63999a, f63936a.m83437c() + " --> analysis() --> 没有匹配上 --> key = " + entry.getKey() + " --> value = " + entry.getValue(), false, 2, null);
                    }
                    break;
                case -1086077885:
                    c27385a = c27385a2;
                    if (str.equals("mb_wifi_channel")) {
                        c27385a.m106572E((String) entry.getValue());
                    } else {
                        C20136g.m83566b(C20136g.f63999a, f63936a.m83437c() + " --> analysis() --> 没有匹配上 --> key = " + entry.getKey() + " --> value = " + entry.getValue(), false, 2, null);
                    }
                    break;
                case -1080938842:
                    c27385a = c27385a2;
                    if (str.equals("mb_uid")) {
                        c27385a.m106601z((String) entry.getValue());
                    } else {
                        C20136g.m83566b(C20136g.f63999a, f63936a.m83437c() + " --> analysis() --> 没有匹配上 --> key = " + entry.getKey() + " --> value = " + entry.getValue(), false, 2, null);
                    }
                    break;
                case -72536842:
                    c27385a = c27385a2;
                    if (str.equals("mb_version_release")) {
                        c27385a.m106570C((String) entry.getValue());
                    } else {
                        C20136g.m83566b(C20136g.f63999a, f63936a.m83437c() + " --> analysis() --> 没有匹配上 --> key = " + entry.getKey() + " --> value = " + entry.getValue(), false, 2, null);
                    }
                    break;
                case 103677969:
                    c27385a = c27385a2;
                    if (str.equals("mb_ip")) {
                        c27385a.m106573F((String) entry.getValue());
                    } else {
                        C20136g.m83566b(C20136g.f63999a, f63936a.m83437c() + " --> analysis() --> 没有匹配上 --> key = " + entry.getKey() + " --> value = " + entry.getValue(), false, 2, null);
                    }
                    break;
                case 103678184:
                    c27385a = c27385a2;
                    if (str.equals("mb_pn")) {
                        c27385a.m106597v((String) entry.getValue());
                    } else {
                        C20136g.m83566b(C20136g.f63999a, f63936a.m83437c() + " --> analysis() --> 没有匹配上 --> key = " + entry.getKey() + " --> value = " + entry.getValue(), false, 2, null);
                    }
                    break;
                case 103678359:
                    c27385a = c27385a2;
                    if (str.equals("mb_vc")) {
                        c27385a.m106568A((String) entry.getValue());
                    } else {
                        C20136g.m83566b(C20136g.f63999a, f63936a.m83437c() + " --> analysis() --> 没有匹配上 --> key = " + entry.getKey() + " --> value = " + entry.getValue(), false, 2, null);
                    }
                    break;
                case 103678370:
                    c27385a = c27385a2;
                    if (str.equals("mb_vn")) {
                        c27385a.m106569B((String) entry.getValue());
                    } else {
                        C20136g.m83566b(C20136g.f63999a, f63936a.m83437c() + " --> analysis() --> 没有匹配上 --> key = " + entry.getKey() + " --> value = " + entry.getValue(), false, 2, null);
                    }
                    break;
                case 426966230:
                    c27385a = c27385a2;
                    if (str.equals("mb_avatar_index")) {
                        c27385a.m106593r((String) entry.getValue());
                    } else {
                        C20136g.m83566b(C20136g.f63999a, f63936a.m83437c() + " --> analysis() --> 没有匹配上 --> key = " + entry.getKey() + " --> value = " + entry.getValue(), false, 2, null);
                    }
                    break;
                case 582580317:
                    c27385a = c27385a2;
                    if (str.equals("mb_brand")) {
                        c27385a.m106594s((String) entry.getValue());
                    } else {
                        C20136g.m83566b(C20136g.f63999a, f63936a.m83437c() + " --> analysis() --> 没有匹配上 --> key = " + entry.getKey() + " --> value = " + entry.getValue(), false, 2, null);
                    }
                    break;
                case 785242969:
                    c27385a = c27385a2;
                    if (str.equals("mb_version_sdk_int")) {
                        c27385a.m106571D((String) entry.getValue());
                    } else {
                        C20136g.m83566b(C20136g.f63999a, f63936a.m83437c() + " --> analysis() --> 没有匹配上 --> key = " + entry.getKey() + " --> value = " + entry.getValue(), false, 2, null);
                    }
                    break;
                case 925994048:
                    c27385a = c27385a2;
                    if (str.equals("mb_device")) {
                        c27385a.m106596u((String) entry.getValue());
                    } else {
                        C20136g.m83566b(C20136g.f63999a, f63936a.m83437c() + " --> analysis() --> 没有匹配上 --> key = " + entry.getKey() + " --> value = " + entry.getValue(), false, 2, null);
                    }
                    break;
                case 1066736709:
                    c27385a = c27385a2;
                    if (str.equals("mb_product")) {
                        c27385a.m106598w((String) entry.getValue());
                    } else {
                        C20136g.m83566b(C20136g.f63999a, f63936a.m83437c() + " --> analysis() --> 没有匹配上 --> key = " + entry.getKey() + " --> value = " + entry.getValue(), false, 2, null);
                    }
                    break;
                case 1089799227:
                    c27385a = c27385a2;
                    if (str.equals("mb_wifi_ssid")) {
                        c27385a.m106575H((String) entry.getValue());
                    } else {
                        C20136g.m83566b(C20136g.f63999a, f63936a.m83437c() + " --> analysis() --> 没有匹配上 --> key = " + entry.getKey() + " --> value = " + entry.getValue(), false, 2, null);
                    }
                    break;
                case 1420622267:
                    c27385a = c27385a2;
                    if (str.equals("mb_unique")) {
                        c27385a.m106600y((String) entry.getValue());
                    } else {
                        C20136g.m83566b(C20136g.f63999a, f63936a.m83437c() + " --> analysis() --> 没有匹配上 --> key = " + entry.getKey() + " --> value = " + entry.getValue(), false, 2, null);
                    }
                    break;
                case 2115161177:
                    if (str.equals("mb_channel")) {
                        c27385a = c27385a2;
                        c27385a.m106595t((String) entry.getValue());
                        break;
                    }
                default:
                    c27385a = c27385a2;
                    C20136g.m83566b(C20136g.f63999a, f63936a.m83437c() + " --> analysis() --> 没有匹配上 --> key = " + entry.getKey() + " --> value = " + entry.getValue(), false, 2, null);
                    break;
            }
            c27385a2 = c27385a;
        }
        C27385a c27385a4 = c27385a2;
        C20136g.m83566b(C20136g.f63999a, m83437c() + " --> analysis() --> wifiInfoModel = " + c27385a4, false, 2, null);
        return c27385a4;
    }

    /* JADX INFO: renamed from: c */
    private final String m83437c() {
        String simpleName = QrCodeUtil.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m83438g(QrCodeUtil qrCodeUtil, String str, int i11, int i12, Continuation continuation, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 400;
        }
        if ((i13 & 4) != 0) {
            i12 = 400;
        }
        return qrCodeUtil.m83442f(str, i11, i12, continuation);
    }

    /* JADX INFO: renamed from: b */
    public final String m83439b(C27385a c27385a) {
        C20136g c20136g = C20136g.f63999a;
        C20136g.m83566b(c20136g, m83437c() + " --> createTransferQrStr() --> wifiInfoModel = " + c27385a, false, 2, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m83440d());
        sb2.append("mb_unique");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append("mb_unique");
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("mb_device");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(c27385a != null ? c27385a.m106580e() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("mb_brand");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(c27385a != null ? c27385a.m106578c() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("mb_product");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(c27385a != null ? c27385a.m106582g() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("mb_version_release");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(c27385a != null ? c27385a.m106586k() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("mb_version_sdk_int");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(c27385a != null ? c27385a.m106587l() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("mb_vc");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(c27385a != null ? c27385a.m106584i() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("mb_vn");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(c27385a != null ? c27385a.m106585j() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("mb_pn");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(c27385a != null ? c27385a.m106581f() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("mb_uid");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(c27385a != null ? c27385a.m106583h() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("mb_avatar_index");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(c27385a != null ? c27385a.m106577b() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("mb_channel");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(c27385a != null ? c27385a.m106579d() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("mb_wifi_ssid");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(c27385a != null ? c27385a.m106591p() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("mb_wifi_pwd");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(c27385a != null ? c27385a.m106590o() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("mb_wifi_channel");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(c27385a != null ? c27385a.m106588m() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("mb_ip");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(c27385a != null ? c27385a.m106589n() : null);
        String string = sb2.toString();
        Intrinsics.m97801g(string, "toString(...)");
        C20136g.m83566b(c20136g, m83437c() + " --> createTransferQrStr() --> 二维码创建完成 --> qrCode = " + string, false, 2, null);
        return string;
    }

    /* JADX INFO: renamed from: d */
    public final String m83440d() {
        Object objM112707constructorimpl;
        String value;
        try {
            Result.Companion companion = Result.INSTANCE;
            ConfigBean configBeanM110355d = C28615f.m110355d(C28615f.f87796c.m110363a(), "transfer_share_link_url", false, 2, null);
            if (configBeanM110355d == null || (value = configBeanM110355d.getValue()) == null) {
                value = "https://h5.aoneroom.com/download?type=/transfer/wifi_connect&";
            }
            objM112707constructorimpl = Result.m112707constructorimpl(value);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        return (String) (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) == null ? objM112707constructorimpl : "https://h5.aoneroom.com/download?type=/transfer/wifi_connect&");
    }

    /* JADX INFO: renamed from: e */
    public final void m83441e(String text, Function1 function1) {
        Intrinsics.m97802h(text, "text");
        Map mapM83562a = C20134e.f63995a.m83562a(text);
        if (mapM83562a.isEmpty()) {
            if (function1 != null) {
            }
        } else if (!TextUtils.equals((CharSequence) mapM83562a.get("mb_unique"), "mb_unique")) {
            if (function1 != null) {
            }
        } else {
            C27385a c27385aM83436a = m83436a(mapM83562a);
            if (function1 != null) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final Object m83442f(String str, int i11, int i12, Continuation continuation) {
        return AbstractC25088i.m98910g(C25220y0.m99268b(), new QrCodeUtil$syncEncodeQRCode$2(str, i11, i12, null), continuation);
    }
}
