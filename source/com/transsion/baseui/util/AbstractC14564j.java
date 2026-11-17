package com.transsion.baseui.util;

import android.content.Context;
import com.transsion.baseui.R$plurals;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.baseui.util.j */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14564j {
    /* JADX INFO: renamed from: a */
    public static final String m65680a(long j11) {
        if (j11 < 0) {
            C26866a.a.m104898f(C26866a.f81698a, "error", "formatNumber count< 0", false, 4, null);
            return "0";
        }
        if (j11 < 1000) {
            return String.valueOf(j11);
        }
        if (j11 < 1000000) {
            BigDecimal bigDecimalDivide = new BigDecimal(j11).divide(new BigDecimal(1000), 1, 4);
            Intrinsics.m97801g(bigDecimalDivide, "divide(...)");
            return bigDecimalDivide + "K";
        }
        BigDecimal bigDecimalDivide2 = new BigDecimal(j11).divide(new BigDecimal(1000000), 1, 4);
        Intrinsics.m97801g(bigDecimalDivide2, "divide(...)");
        return bigDecimalDivide2 + "M";
    }

    /* JADX INFO: renamed from: b */
    public static final String m65681b(Integer num) {
        if (num == null) {
            return "";
        }
        return (num.intValue() / 3600) + "h " + ((num.intValue() % 3600) / 60) + "m";
    }

    /* JADX INFO: renamed from: c */
    public static final String m65682c(String str, Context context) {
        Long lX;
        Intrinsics.m97802h(context, "context");
        long jLongValue = (str == null || (lX = StringsKt.m98218x(str)) == null) ? 0L : lX.longValue();
        String quantityString = context.getResources().getQuantityString(R$plurals.str_views, (int) jLongValue, m65680a(jLongValue));
        Intrinsics.m97801g(quantityString, "getQuantityString(...)");
        return quantityString;
    }
}
