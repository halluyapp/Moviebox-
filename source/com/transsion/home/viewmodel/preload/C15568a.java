package com.transsion.home.viewmodel.preload;

import android.content.Context;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okio.Okio;

/* JADX INFO: renamed from: com.transsion.home.viewmodel.preload.a */
/* JADX INFO: loaded from: classes.dex */
public final class C15568a {

    /* JADX INFO: renamed from: a */
    private final String f53733a = "appTab.json";

    /* JADX INFO: renamed from: a */
    public final void m69165a(List list) {
        Intrinsics.m97802h(list, "list");
    }

    /* JADX INFO: renamed from: b */
    public final String m69166b(Context context) {
        Intrinsics.m97802h(context, "context");
        try {
            InputStream inputStreamOpen = context.getAssets().open(this.f53733a);
            Intrinsics.m97799e(inputStreamOpen);
            return Okio.buffer(Okio.source(inputStreamOpen)).readUtf8();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m69167c(Context context) {
        Intrinsics.m97802h(context, "context");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final String m69168d(Context context) {
        Intrinsics.m97802h(context, "context");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final String m69169e(Context context) {
        Intrinsics.m97802h(context, "context");
        return null;
    }
}
