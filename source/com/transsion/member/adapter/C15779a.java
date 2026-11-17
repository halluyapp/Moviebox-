package com.transsion.member.adapter;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.member.adapter.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C15779a extends RecyclerView.AbstractC4213l {

    /* JADX INFO: renamed from: a */
    private final int f54212a;

    /* JADX INFO: renamed from: b */
    private final int f54213b;

    public C15779a(int i11, int i12) {
        this.f54212a = i11;
        this.f54213b = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
        Intrinsics.m97802h(outRect, "outRect");
        Intrinsics.m97802h(view, "view");
        Intrinsics.m97802h(parent, "parent");
        Intrinsics.m97802h(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i11 = this.f54212a;
        int i12 = childAdapterPosition % i11;
        int i13 = this.f54213b;
        outRect.left = ((i11 - i12) * i13) / i11;
        outRect.right = (i13 * (i12 + 1)) / i11;
    }
}
