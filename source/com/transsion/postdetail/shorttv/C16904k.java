package com.transsion.postdetail.shorttv;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.transsion.web.api.WebConstants;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.postdetail.shorttv.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C16904k {

    /* JADX INFO: renamed from: a */
    public static final C16904k f56790a = new C16904k();

    private C16904k() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m73727b(C16904k c16904k, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            str5 = "minitv_play";
        }
        c16904k.m73729a(str, str2, str3, str4, str5);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m73728d(C16904k c16904k, String str, String str2, String str3, boolean z11, String str4, String str5, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            str4 = "minitv_play";
        }
        String str6 = str4;
        if ((i11 & 32) != 0) {
            str5 = null;
        }
        c16904k.m73730c(str, str2, str3, z11, str6, str5);
    }

    /* JADX INFO: renamed from: a */
    public final void m73729a(String str, String str2, String optType, String position, String pageName) {
        Intrinsics.m97802h(optType, "optType");
        Intrinsics.m97802h(position, "position");
        Intrinsics.m97802h(pageName, "pageName");
        HashMap map = new HashMap();
        map.put("module_name", "watch_ad");
        if (str == null) {
            str = "";
        }
        map.put("subject_id", str);
        if (str2 == null) {
            str2 = "";
        }
        map.put("ops", str2);
        map.put("opt_type", optType);
        map.put(RequestParameters.POSITION, position);
        C24662i.f75350a.m96881p(pageName, map);
    }

    /* JADX INFO: renamed from: c */
    public final void m73730c(String str, String str2, String optType, boolean z11, String pageName, String str3) {
        Intrinsics.m97802h(optType, "optType");
        Intrinsics.m97802h(pageName, "pageName");
        HashMap map = new HashMap();
        map.put("module_name", "favorite");
        if (str != null && str.length() != 0) {
            map.put("subject_id", str);
        }
        if (str2 != null && str2.length() != 0) {
            map.put("ops", str2);
        }
        map.put("opt_type", optType);
        map.put("favorite", String.valueOf(!z11));
        if (str3 != null && str3.length() != 0) {
            map.put(WebConstants.PAGE_FROM, str3);
        }
        C24662i.f75350a.m96881p(pageName, map);
    }
}
