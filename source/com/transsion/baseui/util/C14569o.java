package com.transsion.baseui.util;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.baseui.util.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C14569o {

    /* JADX INFO: renamed from: a */
    public static final C14569o f51128a = new C14569o();

    private C14569o() {
    }

    /* JADX INFO: renamed from: a */
    public final void m65703a(View[] view, View.OnClickListener click) {
        Intrinsics.m97802h(view, "view");
        Intrinsics.m97802h(click, "click");
        for (View view2 : view) {
            if (view2 != null) {
                view2.setOnClickListener(click);
            }
        }
    }
}
