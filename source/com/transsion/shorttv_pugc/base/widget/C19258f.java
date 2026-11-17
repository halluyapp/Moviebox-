package com.transsion.shorttv_pugc.base.widget;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import kotlin.jvm.internal.Intrinsics;
import p801u6.C27941f;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C19258f extends RecyclerView.AbstractC4219r {

    /* JADX INFO: renamed from: a */
    private C27941f f61847a;

    /* JADX INFO: renamed from: b */
    private int[] f61848b;

    /* JADX INFO: renamed from: c */
    private int f61849c;

    public C19258f(C27941f c27941f) {
        this.f61847a = c27941f;
    }

    /* JADX INFO: renamed from: d */
    private final void m80647d(RecyclerView recyclerView) {
        RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            if (this.f61848b == null) {
                this.f61848b = new int[((StaggeredGridLayoutManager) layoutManager).m20978Q()];
            }
            ((StaggeredGridLayoutManager) layoutManager).m20974E(this.f61848b);
            this.f61849c = m80648e(this.f61848b);
            return;
        }
        if (layoutManager instanceof GridLayoutManager) {
            this.f61849c = ((GridLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
        } else {
            if (!(layoutManager instanceof LinearLayoutManager)) {
                throw new RuntimeException("Unsupported layoutManager.");
            }
            this.f61849c = ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
        }
    }

    /* JADX INFO: renamed from: e */
    private final int m80648e(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 > i11) {
                i11 = i12;
            }
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
    public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
        C27941f c27941f;
        Intrinsics.m97802h(recyclerView, "recyclerView");
        RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
        int childCount = layoutManager != null ? layoutManager.getChildCount() : 0;
        int itemCount = layoutManager != null ? layoutManager.getItemCount() : 0;
        if (i11 != 0 || childCount <= 0 || this.f61849c < itemCount - 1) {
            return;
        }
        C27941f c27941f2 = this.f61847a;
        if ((c27941f2 != null ? c27941f2.m108661i() : null) != LoadMoreStatus.Fail || (c27941f = this.f61847a) == null) {
            return;
        }
        c27941f.m108670w();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
    public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
        Intrinsics.m97802h(recyclerView, "recyclerView");
        m80647d(recyclerView);
    }
}
