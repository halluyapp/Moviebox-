package com.transsion.baseui.util;

import java.text.DecimalFormat;

/* JADX INFO: renamed from: com.transsion.baseui.util.n */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14568n {
    /* JADX INFO: renamed from: a */
    public static final String m65700a(int i11) {
        return "S" + new DecimalFormat("00").format(Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: b */
    public static final String m65701b(int i11, int i12, boolean z11) {
        DecimalFormat decimalFormat = new DecimalFormat("00");
        if (i12 <= 0) {
            return (z11 ? "EP" : "Ch") + decimalFormat.format(Integer.valueOf(i11));
        }
        return "S" + decimalFormat.format(Integer.valueOf(i12)) + (z11 ? " EP" : " Ch") + decimalFormat.format(Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: c */
    public static final String m65702c(int i11, boolean z11) {
        DecimalFormat decimalFormat = new DecimalFormat("00");
        if (i11 < 100) {
            return (z11 ? "EP" : "Ch") + decimalFormat.format(Integer.valueOf(i11));
        }
        int i12 = i11 / 100;
        int i13 = i11 % 100;
        return "S" + decimalFormat.format(Integer.valueOf(i12)) + (z11 ? " EP" : " Ch") + decimalFormat.format(Integer.valueOf(i13));
    }
}
