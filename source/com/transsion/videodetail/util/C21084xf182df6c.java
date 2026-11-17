package com.transsion.videodetail.util;

import com.transsion.videodetail.bean.VideoDetailMediaSource;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.transsion.videodetail.util.VideoDetailUtil$getCurrentSimpleSeasonList$lambda$6$$inlined$sortBy$1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class C21084xf182df6c<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t11, T t12) {
        return ComparisonsKt.m97603d(Integer.valueOf(((VideoDetailMediaSource) t11).getEp()), Integer.valueOf(((VideoDetailMediaSource) t12).getEp()));
    }
}
