package com.transsion.postdetail.util;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.postdetail.util.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C17435e {

    /* JADX INFO: renamed from: a */
    public static final C17435e f57826a = new C17435e();

    private C17435e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m74955c(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: b */
    public final void m74956b(View[] view, final Function0 click) {
        Intrinsics.m97802h(view, "view");
        Intrinsics.m97802h(click, "click");
        for (View view2 : view) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.util.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C17435e.m74955c(click, view3);
                }
            });
        }
    }
}
