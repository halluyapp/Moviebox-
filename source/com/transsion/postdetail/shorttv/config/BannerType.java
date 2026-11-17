package com.transsion.postdetail.shorttv.config;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m97100d2 = {"Lcom/transsion/postdetail/shorttv/config/BannerType;", "", "<init>", "(Ljava/lang/String;I)V", "BANNER", "AD", "GUIDE", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public enum BannerType {
    BANNER,
    AD,
    GUIDE;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m97650a(values());

    public static EnumEntries<BannerType> getEntries() {
        return $ENTRIES;
    }
}
