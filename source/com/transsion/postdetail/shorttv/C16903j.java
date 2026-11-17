package com.transsion.postdetail.shorttv;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.transsion.moviedetailapi.bean.Subject;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.postdetail.shorttv.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C16903j {

    /* JADX INFO: renamed from: b */
    public static final a f56788b = new a(null);

    /* JADX INFO: renamed from: a */
    private final HashSet f56789a = new HashSet();

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv.j$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m73725a(String pageName, Subject item, int i11, long j11, String optType) {
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(optType, "optType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.f56789a.contains(item.getSubjectId())) {
            return;
        }
        this.f56789a.add(item.getSubjectId());
        linkedHashMap.put(RequestParameters.POSITION, String.valueOf(i11));
        linkedHashMap.put("opt_type", optType);
        linkedHashMap.put("ops", String.valueOf(item.getOps()));
        linkedHashMap.put("subject_id", String.valueOf(item.getSubjectId()));
        linkedHashMap.put("item_type", "subject");
        linkedHashMap.put("browse_duration", String.valueOf(j11));
        C24662i.f75350a.m96872D(pageName, linkedHashMap);
    }

    /* JADX INFO: renamed from: b */
    public final void m73726b(String pageName, Subject subject, int i11, String optType) {
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(optType, "optType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(RequestParameters.POSITION, String.valueOf(i11));
        linkedHashMap.put("opt_type", optType);
        linkedHashMap.put("subject_id", String.valueOf(subject != null ? subject.getSubjectId() : null));
        linkedHashMap.put("item_type", "subject");
        linkedHashMap.put("ops", String.valueOf(subject != null ? subject.getOps() : null));
        C24662i.f75350a.m96881p(pageName, linkedHashMap);
    }
}
