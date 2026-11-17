package com.transsion.shorttv.utils;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.transsion.shorttv.bean.ShortTvItemType;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24662i;
import ps.C26948b;

/* JADX INFO: renamed from: com.transsion.shorttv.utils.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C19158a {

    /* JADX INFO: renamed from: e */
    public static final a f61564e = new a(null);

    /* JADX INFO: renamed from: a */
    private final String f61565a;

    /* JADX INFO: renamed from: b */
    private final HashSet f61566b;

    /* JADX INFO: renamed from: c */
    private final HashSet f61567c;

    /* JADX INFO: renamed from: d */
    private final HashSet f61568d;

    /* JADX INFO: renamed from: com.transsion.shorttv.utils.a$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C19158a(String pageName) {
        Intrinsics.m97802h(pageName, "pageName");
        this.f61565a = pageName;
        this.f61566b = new HashSet();
        this.f61567c = new HashSet();
        this.f61568d = new HashSet();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX INFO: renamed from: a */
    public final void m80221a(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, Integer num, String str8, long j11, Boolean bool2, String str9) {
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
                zContains = this.f61566b.contains(str4);
                this.f61566b.add(str4);
            } else {
                zContains = false;
            }
        } else if (Intrinsics.m97797c(str3, ShortTvItemType.BANNER.getValue())) {
            if (num != null) {
                zContains = this.f61567c.contains(num);
                this.f61567c.add(num);
            } else {
                zContains = false;
            }
        } else if (!Intrinsics.m97797c(str3, ShortTvItemType.OP_RANKING.getValue()) || str10 == null) {
            zContains = false;
        } else {
            zContains = this.f61568d.contains(str4);
            this.f61568d.add(str4);
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
        C26948b.f81854a.m105081a();
        C24662i.f75350a.m96872D(str, linkedHashMap);
    }

    /* JADX INFO: renamed from: c */
    public final void m80222c(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, Integer num, String str8, Boolean bool3, String str9) {
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
        C26948b.f81854a.m105081a();
        C24662i.f75350a.m96881p(str, linkedHashMap);
    }
}
