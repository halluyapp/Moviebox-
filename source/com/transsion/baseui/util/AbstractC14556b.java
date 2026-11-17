package com.transsion.baseui.util;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.baseui.util.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14556b {
    /* JADX INFO: renamed from: a */
    public static final boolean m65670a(Context context) {
        Intrinsics.m97802h(context, "<this>");
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }
}
