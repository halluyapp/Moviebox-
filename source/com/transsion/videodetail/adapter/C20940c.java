package com.transsion.videodetail.adapter;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.transsion.videodetail.adapter.c */
/* JADX INFO: loaded from: classes7.dex */
public final class C20940c extends RecyclerView.AbstractC4213l {

    /* JADX INFO: renamed from: a */
    private final int f65747a;

    public C20940c(int i11) {
        this.f65747a = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
        Intrinsics.m97802h(outRect, "outRect");
        Intrinsics.m97802h(view, "view");
        Intrinsics.m97802h(parent, "parent");
        Intrinsics.m97802h(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = parent.getAdapter();
        Intrinsics.m97800f(adapter, "null cannot be cast to non-null type com.transsion.videodetail.adapter.VideoDetailEpisodeAdapter");
        int size = ((C20939b) adapter).getData().size();
        RecyclerView.AbstractC4214m layoutManager = parent.getLayoutManager();
        Intrinsics.m97800f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        int iM20737U = size % ((GridLayoutManager) layoutManager).m20737U();
        if (iM20737U == 0) {
            iM20737U = 3;
        }
        if (childAdapterPosition >= RangesKt.m97935e(size - iM20737U, 0)) {
            outRect.bottom = this.f65747a;
        } else {
            outRect.bottom = 0;
        }
    }
}
