package com.transsion.shorttv_pugc.utils;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.transsion.shorttv_pugc.bean.ShortTvItemType;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.utils.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C19522a {

    /* JADX INFO: renamed from: e */
    public static final a f62454e = new a(null);

    /* JADX INFO: renamed from: a */
    private final String f62455a;

    /* JADX INFO: renamed from: b */
    private final HashSet f62456b;

    /* JADX INFO: renamed from: c */
    private final HashSet f62457c;

    /* JADX INFO: renamed from: d */
    private final HashSet f62458d;

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.utils.a$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C19522a(String pageName) {
        Intrinsics.m97802h(pageName, "pageName");
        this.f62455a = pageName;
        this.f62456b = new HashSet();
        this.f62457c = new HashSet();
        this.f62458d = new HashSet();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX INFO: renamed from: a */
    public final void m81321a(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, Integer num, String str8, long j11, Boolean bool2, String str9) {
        boolean zContains;
        String str10 = str4;
        if (str == null || str.length() == 0) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("item_type", str2 == null ? "" : str2);
        linkedHashMap.put("opt_type", str3 == null ? "" : str3);
        if (Intrinsics.m97797c(str3, ShortTvItemType.OP_SUBJECTS_MOVIE.getValue())) {
            if (str10 != null) {
                zContains = this.f62456b.contains(str4);
                this.f62456b.add(str4);
            } else {
                zContains = false;
            }
        } else if (Intrinsics.m97797c(str3, ShortTvItemType.BANNER.getValue())) {
            if (num != null) {
                zContains = this.f62457c.contains(num);
                this.f62457c.add(num);
            } else {
                zContains = false;
            }
        } else if (!Intrinsics.m97797c(str3, ShortTvItemType.OP_RANKING.getValue()) || str10 == null) {
            zContains = false;
        } else {
            zContains = this.f62458d.contains(str4);
            this.f62458d.add(str4);
        }
        if (zContains) {
            return;
        }
        if (str10 == null) {
            str10 = "";
        }
        linkedHashMap.put("subject_id", str10);
        linkedHashMap.put("group_id", str5 == null ? "" : str5);
        linkedHashMap.put("ops", str6 != null ? str6 : "");
        linkedHashMap.put("has_resource", String.valueOf(bool));
        linkedHashMap.put("deeplink", str7);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(num);
        linkedHashMap.put(RequestParameters.POSITION, sb2.toString());
        linkedHashMap.put("cover", str8);
        linkedHashMap.put("browse_duration", String.valueOf(j11));
        linkedHashMap.put("builtin", Intrinsics.m97797c(bool2, Boolean.TRUE) ? "1" : "0");
        linkedHashMap.put("tag", String.valueOf(str9));
        C24662i.f75350a.m96872D(str, linkedHashMap);
    }

    /* JADX INFO: renamed from: c */
    public final void m81322c(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, Integer num, String str8, Boolean bool3, String str9) {
        if (str == null || str.length() == 0) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("item_type", str2 == null ? "" : str2);
        linkedHashMap.put("opt_type", str3 == null ? "" : str3);
        linkedHashMap.put("subject_id", str4 == null ? "" : str4);
        linkedHashMap.put("group_id", str5 == null ? "" : str5);
        linkedHashMap.put("ops", str6 != null ? str6 : "");
        linkedHashMap.put("has_resource", String.valueOf(bool));
        linkedHashMap.put("check_in", String.valueOf(bool2));
        linkedHashMap.put("deeplink", str7);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(num);
        linkedHashMap.put(RequestParameters.POSITION, sb2.toString());
        linkedHashMap.put("cover", str8);
        linkedHashMap.put("builtin", Intrinsics.m97797c(bool3, Boolean.TRUE) ? "1" : "0");
        linkedHashMap.put("tag", String.valueOf(str9));
        C24662i.f75350a.m96881p(str, linkedHashMap);
    }
}
