package com.transsion.rewardscenter.utils;

import com.therouter.TheRouter;
import com.transsnet.loginapi.bean.Country;
import com.transsnet.loginapi.bean.UserInfo;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import p441gz.InterfaceC23704a;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.rewardscenter.utils.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C18008c {

    /* JADX INFO: renamed from: a */
    public static final C18008c f58985a = new C18008c();

    /* JADX INFO: renamed from: b */
    private static final Regex f58986b = new Regex("^\\d{7,15}$");

    /* JADX INFO: renamed from: c */
    public static final int f58987c = 8;

    private C18008c() {
    }

    /* JADX INFO: renamed from: a */
    public final Triple m76633a() {
        C18007b c18007b = C18007b.f58982a;
        String strM76629c = c18007b.m76629c();
        String strM76630d = c18007b.m76630d();
        String strM76631e = c18007b.m76631e();
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "RewardsCenter", "getPhoneInfo mmkv: " + ((Object) strM76629c) + ", " + ((Object) strM76630d) + ", " + ((Object) strM76631e), false, 4, null);
        InterfaceC23704a interfaceC23704a = (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
        if (interfaceC23704a != null) {
            if (StringsKt.m98160q0(strM76631e)) {
                UserInfo userInfoMo90386h = interfaceC23704a.mo90386h();
                String phone = userInfoMo90386h != null ? userInfoMo90386h.getPhone() : null;
                if (phone == null) {
                    phone = "";
                }
                if (StringsKt.m98160q0(strM76629c)) {
                    String cc2 = userInfoMo90386h != null ? userInfoMo90386h.getCc() : null;
                    strM76629c = cc2 == null ? "" : cc2;
                }
                strM76631e = phone;
            }
            C26866a.a.m104898f(aVar, "RewardsCenter", "getPhoneInfo userInfo: " + ((Object) strM76629c) + ", " + ((Object) strM76630d) + ", " + ((Object) strM76631e), false, 4, null);
            if (StringsKt.m98160q0(strM76629c) || StringsKt.m98160q0(strM76630d)) {
                Country countryMo90383e = interfaceC23704a.mo90383e();
                C26866a.a.m104898f(aVar, "RewardsCenter", "getPhoneInfo --> country: " + countryMo90383e, false, 4, null);
                if (StringsKt.m98160q0(strM76629c)) {
                    strM76629c = countryMo90383e != null ? countryMo90383e.getCode() : null;
                    if (strM76629c == null) {
                        strM76629c = "";
                    }
                }
                if (StringsKt.m98160q0(strM76630d)) {
                    String code = countryMo90383e != null ? countryMo90383e.getCode() : null;
                    if (code == null) {
                        code = "";
                    }
                    if (Intrinsics.m97797c(strM76629c, code)) {
                        String country_s = countryMo90383e != null ? countryMo90383e.getCountry_s() : null;
                        strM76630d = country_s == null ? "" : country_s;
                    }
                }
            }
            C26866a.a.m104898f(aVar, "RewardsCenter", "getPhoneInfo result: " + ((Object) strM76629c) + ", " + ((Object) strM76630d) + ", " + ((Object) strM76631e), false, 4, null);
        }
        return new Triple(strM76629c, strM76630d, strM76631e);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m76634b(String number) {
        Intrinsics.m97802h(number, "number");
        return f58986b.matches(number);
    }
}
