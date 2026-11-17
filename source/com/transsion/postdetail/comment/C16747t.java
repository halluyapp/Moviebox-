package com.transsion.postdetail.comment;

import android.content.Context;
import com.transsion.postdetail.R$string;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.postdetail.comment.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C16747t {

    /* JADX INFO: renamed from: a */
    public static final C16747t f56290a = new C16747t();

    private C16747t() {
    }

    /* JADX INFO: renamed from: b */
    private final String m72930b(Context context, long j11) {
        if (j11 == 0) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        int i11 = calendar.get(1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j11);
        boolean z11 = calendar2.get(1) == i11;
        boolean z12 = calendar2.get(6) == Calendar.getInstance().get(6);
        if (!z11 || z12) {
            String str = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date(j11));
            Intrinsics.m97801g(str, "format(...)");
            return str;
        }
        String str2 = new SimpleDateFormat("dd/MM", Locale.getDefault()).format(new Date(j11));
        Intrinsics.m97801g(str2, "format(...)");
        return str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m72931a(int i11) {
        if (i11 < 1000) {
            return String.valueOf(i11);
        }
        if (i11 < 1000000) {
            BigDecimal bigDecimalDivide = new BigDecimal(i11).divide(new BigDecimal(1000), 1, 4);
            Intrinsics.m97801g(bigDecimalDivide, "divide(...)");
            return bigDecimalDivide + " k";
        }
        BigDecimal bigDecimalDivide2 = new BigDecimal(i11).divide(new BigDecimal(1000000), 1, 4);
        Intrinsics.m97801g(bigDecimalDivide2, "divide(...)");
        return bigDecimalDivide2 + " m";
    }

    /* JADX INFO: renamed from: c */
    public final String m72932c(Context context, long j11) {
        Intrinsics.m97802h(context, "context");
        long jCurrentTimeMillis = System.currentTimeMillis() - j11;
        if (jCurrentTimeMillis < -30000) {
            return m72930b(context, j11);
        }
        if (-30000 <= jCurrentTimeMillis && jCurrentTimeMillis < 10000) {
            String string = context.getString(R$string.comment_just_now);
            Intrinsics.m97799e(string);
            return string;
        }
        if (10000 <= jCurrentTimeMillis && jCurrentTimeMillis < 60000) {
            return ((int) (jCurrentTimeMillis / 1000)) + "s";
        }
        if (60000 <= jCurrentTimeMillis && jCurrentTimeMillis < 3600000) {
            return ((int) (jCurrentTimeMillis / 60000)) + "min";
        }
        if (3600000 > jCurrentTimeMillis || jCurrentTimeMillis >= 86400000) {
            return m72930b(context, j11);
        }
        return ((int) (jCurrentTimeMillis / 3600000)) + "h";
    }
}
