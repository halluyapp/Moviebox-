package com.transsion.home.view;

import android.view.View;
import androidx.recyclerview.widget.C4247n;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.home.view.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C15522d extends C4247n {

    /* JADX INFO: renamed from: a */
    private final int f53560a;

    public C15522d(int i11) {
        this.f53560a = i11;
    }

    /* JADX INFO: renamed from: k */
    private final int m68776k(RecyclerView.AbstractC4214m abstractC4214m, View view) {
        return (view.getLeft() - abstractC4214m.getPaddingLeft()) - this.f53560a;
    }

    /* JADX INFO: renamed from: l */
    private final int m68777l(RecyclerView.AbstractC4214m abstractC4214m, View view) {
        return view.getTop() - abstractC4214m.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.C4247n, androidx.recyclerview.widget.AbstractC4251r
    public int[] calculateDistanceToFinalSnap(RecyclerView.AbstractC4214m layoutManager, View targetView) {
        Intrinsics.m97802h(layoutManager, "layoutManager");
        Intrinsics.m97802h(targetView, "targetView");
        if (layoutManager.canScrollHorizontally()) {
            return new int[]{m68776k(layoutManager, targetView), 0};
        }
        return layoutManager.canScrollVertically() ? new int[]{0, m68777l(layoutManager, targetView)} : new int[]{0, 0};
    }
}
