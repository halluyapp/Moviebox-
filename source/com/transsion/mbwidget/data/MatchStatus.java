package com.transsion.mbwidget.data;

import com.cloud.tmc.kernel.utils.NetworkUtil;
import com.transsion.home.adapter.trending.adapter.SportLiveAdapter;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m97100d2 = {"Lcom/transsion/mbwidget/data/MatchStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "NOT_START", "ING", "ENDED", NetworkUtil.NETWORK_TYPE_UNKNOWN, "DeskWidget_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public enum MatchStatus {
    NOT_START,
    ING,
    ENDED,
    UNKNOWN;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m97650a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.transsion.mbwidget.data.MatchStatus$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final MatchStatus m69641a(String str) {
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -460443627) {
                    if (iHashCode != 361535485) {
                        if (iHashCode == 884395540 && str.equals(SportLiveAdapter.f52429N)) {
                            return MatchStatus.NOT_START;
                        }
                    } else if (str.equals(SportLiveAdapter.f52430O)) {
                        return MatchStatus.ING;
                    }
                } else if (str.equals(SportLiveAdapter.f52431P)) {
                    return MatchStatus.ENDED;
                }
            }
            return MatchStatus.UNKNOWN;
        }
    }

    public static EnumEntries<MatchStatus> getEntries() {
        return $ENTRIES;
    }
}
