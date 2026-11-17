package com.transsion.transfer.wifi.util;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.transfer.wifi.util.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C20134e {

    /* JADX INFO: renamed from: a */
    public static final C20134e f63995a = new C20134e();

    private C20134e() {
    }

    /* JADX INFO: renamed from: a */
    public final Map m83562a(String urlString) {
        Object objM112707constructorimpl;
        Intrinsics.m97802h(urlString, "urlString");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Result.Companion companion = Result.INSTANCE;
            Uri uri = Uri.parse(urlString);
            Intrinsics.m97801g(uri, "parse(...)");
            linkedHashMap.put("urlPath", uri.getPath());
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Intrinsics.m97801g(queryParameterNames, "getQueryParameterNames(...)");
            for (String str : queryParameterNames) {
                linkedHashMap.put(str, uri.getQueryParameter(str));
            }
            objM112707constructorimpl = Result.m112707constructorimpl(linkedHashMap);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Object obj = linkedHashMap;
        if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) == null) {
            obj = objM112707constructorimpl;
        }
        return (Map) obj;
    }
}
