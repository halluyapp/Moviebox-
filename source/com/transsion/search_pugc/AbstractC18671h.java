package com.transsion.search_pugc;

import android.content.Context;
import android.os.Build;
import android.text.style.ImageSpan;
import com.transsion.search.R$drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.search_pugc.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC18671h {
    /* JADX INFO: renamed from: a */
    public static final ImageSpan m78523a(Context context) {
        Intrinsics.m97802h(context, "context");
        int i11 = R$drawable.ic_search_result_split;
        return Build.VERSION.SDK_INT >= 29 ? new ImageSpan(context, i11, 2) : new ImageSpan(context, i11, 1);
    }
}
