package com.transsion.baseui.util;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.transsion.baseui.util.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C14562h {

    /* JADX INFO: renamed from: a */
    public static final a f51111a = new a(null);

    /* JADX INFO: renamed from: com.transsion.baseui.util.h$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        private final String m65677b(String str) {
            long j11 = Long.parseLong(str);
            if (j11 < 0) {
                return "-";
            }
            if (j11 < 1000) {
                return str.toString();
            }
            if (1000 <= j11 && j11 < 1000001) {
                return new BigDecimal(str).divide(new BigDecimal("1000")).setScale(1, RoundingMode.HALF_UP) + CampaignEx.JSON_KEY_AD_K;
            }
            if (j11 < 1000000) {
                return str.toString();
            }
            return new BigDecimal(str).divide(new BigDecimal("1000000")).setScale(1, RoundingMode.HALF_UP) + "m";
        }

        /* JADX INFO: renamed from: a */
        public final String m65678a(String str) {
            if (str == null) {
                return "0";
            }
            try {
                return m65677b(str);
            } catch (Exception e11) {
                e11.printStackTrace();
                return str;
            }
        }
    }
}
