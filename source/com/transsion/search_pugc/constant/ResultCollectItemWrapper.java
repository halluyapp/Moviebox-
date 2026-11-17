package com.transsion.search_pugc.constant;

import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ResultCollectItemWrapper {

    /* JADX INFO: renamed from: a */
    private final UGCVideo f60091a;

    /* JADX INFO: renamed from: b */
    private final Type f60092b;

    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m97100d2 = {"Lcom/transsion/search_pugc/constant/ResultCollectItemWrapper$Type;", "", "<init>", "(Ljava/lang/String;I)V", "DATA", "FOOTER", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    public enum Type {
        DATA,
        FOOTER;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m97650a(values());

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResultCollectItemWrapper() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public ResultCollectItemWrapper(UGCVideo uGCVideo, Type type) {
        Intrinsics.m97802h(type, "type");
        this.f60091a = uGCVideo;
        this.f60092b = type;
    }

    public /* synthetic */ ResultCollectItemWrapper(UGCVideo uGCVideo, Type type, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : uGCVideo, (i11 & 2) != 0 ? Type.DATA : type);
    }

    /* JADX INFO: renamed from: a */
    public final UGCVideo m78226a() {
        return this.f60091a;
    }

    /* JADX INFO: renamed from: b */
    public final Type m78227b() {
        return this.f60092b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCollectItemWrapper)) {
            return false;
        }
        ResultCollectItemWrapper resultCollectItemWrapper = (ResultCollectItemWrapper) obj;
        return Intrinsics.m97797c(this.f60091a, resultCollectItemWrapper.f60091a) && this.f60092b == resultCollectItemWrapper.f60092b;
    }

    public int hashCode() {
        UGCVideo uGCVideo = this.f60091a;
        return ((uGCVideo == null ? 0 : uGCVideo.hashCode()) * 31) + this.f60092b.hashCode();
    }

    public String toString() {
        return "ResultCollectItemWrapper(data=" + this.f60091a + ", type=" + this.f60092b + ")";
    }
}
