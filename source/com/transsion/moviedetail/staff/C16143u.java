package com.transsion.moviedetail.staff;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.moviedetail.staff.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C16143u extends RecyclerView.AbstractC4213l {

    /* JADX INFO: renamed from: a */
    private int f54871a;

    /* JADX INFO: renamed from: b */
    private int f54872b;

    /* JADX INFO: renamed from: c */
    private int f54873c;

    /* JADX INFO: renamed from: d */
    private int f54874d;

    /* JADX INFO: renamed from: e */
    private final int f54875e;

    public C16143u(int i11, int i12, int i13, int i14, int i15) {
        this.f54871a = i11;
        this.f54872b = i12;
        this.f54873c = i13;
        this.f54874d = i14;
        this.f54875e = i15;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
        Intrinsics.m97802h(outRect, "outRect");
        Intrinsics.m97802h(view, "view");
        Intrinsics.m97802h(parent, "parent");
        Intrinsics.m97802h(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        RecyclerView.AbstractC4214m layoutManager = parent.getLayoutManager();
        boolean z11 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        if (layoutManager instanceof GridLayoutManager) {
            int i11 = this.f54875e;
            if (i11 <= 0) {
                i11 = 1;
            }
            int i12 = childAdapterPosition % i11;
            RecyclerView.Adapter adapter = parent.getAdapter();
            Intrinsics.m97800f(adapter, "null cannot be cast to non-null type com.transsion.moviedetail.staff.MovieStaffAdapter");
            int itemViewType = ((C16141s) adapter).getItemViewType(childAdapterPosition);
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    outRect.left = 0;
                    outRect.right = 0;
                } else {
                    int i13 = this.f54871a;
                    outRect.left = i13;
                    outRect.right = i13;
                }
            } else if (z11) {
                if (i12 == 0) {
                    outRect.right = this.f54871a;
                    outRect.left = this.f54872b;
                } else if (i12 == this.f54875e - 1) {
                    outRect.right = this.f54872b;
                    outRect.left = this.f54871a;
                } else {
                    int i14 = this.f54872b;
                    outRect.left = i14;
                    outRect.right = i14;
                }
            } else if (i12 == 0) {
                outRect.left = this.f54871a;
                outRect.right = this.f54872b;
            } else if (i12 == this.f54875e - 1) {
                outRect.left = this.f54872b;
                outRect.right = this.f54871a;
            } else {
                int i15 = this.f54872b;
                outRect.left = i15;
                outRect.right = i15;
            }
            outRect.bottom = this.f54874d;
        }
    }
}
