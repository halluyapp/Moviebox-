package com.transsion.home.fragment.hashtag;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.home.fragment.hashtag.a */
/* JADX INFO: loaded from: classes5.dex */
final class C15212a extends RecyclerView.AbstractC4213l {

    /* JADX INFO: renamed from: a */
    private int f52902a;

    /* JADX INFO: renamed from: b */
    private int f52903b;

    /* JADX INFO: renamed from: c */
    private int f52904c;

    /* JADX INFO: renamed from: d */
    private int f52905d;

    public C15212a(int i11, int i12, int i13, int i14) {
        this.f52902a = i11;
        this.f52903b = i12;
        this.f52904c = i13;
        this.f52905d = i14;
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
        if (!(layoutManager instanceof GridLayoutManager)) {
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) layoutManager).m20978Q();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
                int iM21014a = ((StaggeredGridLayoutManager.C4232b) layoutParams).m21014a();
                if (childAdapterPosition == 0) {
                    outRect.left = 0;
                    outRect.right = 0;
                    return;
                }
                outRect.bottom = AbstractC5776a0.m27313a(16.0f);
                if (iM21014a == 0) {
                    outRect.left = this.f52902a;
                    outRect.right = this.f52903b;
                    return;
                } else {
                    outRect.left = this.f52903b;
                    outRect.right = this.f52902a;
                    return;
                }
            }
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int iM20737U = gridLayoutManager.m20737U();
        int iMo20741e = gridLayoutManager.m20738Y().mo20741e(childAdapterPosition, iM20737U);
        boolean z11 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        if (iMo20741e == 0) {
            if (z11) {
                outRect.left = this.f52903b;
                outRect.right = this.f52902a;
            } else {
                outRect.left = this.f52902a;
                outRect.right = this.f52903b;
            }
        } else if (iMo20741e != iM20737U - 1) {
            int i11 = this.f52903b;
            outRect.left = i11;
            outRect.right = i11;
        } else if (z11) {
            outRect.left = this.f52902a;
            outRect.right = this.f52903b;
        } else {
            outRect.left = this.f52903b;
            outRect.right = this.f52902a;
        }
        RecyclerView.Adapter adapter = parent.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (adapter instanceof BaseQuickAdapter) {
            if (childAdapterPosition == 0) {
                outRect.left = 0;
                outRect.right = 0;
                outRect.top = 0;
                outRect.bottom = this.f52905d / 2;
                return;
            }
            childAdapterPosition--;
        }
        int i12 = (itemCount / iM20737U) + (itemCount % iM20737U != 0 ? 1 : 0);
        int i13 = childAdapterPosition / iM20737U;
        if (i13 == 0) {
            outRect.top = 0;
            outRect.bottom = this.f52905d / 2;
        } else if (i13 == i12 - 1) {
            outRect.top = this.f52904c / 2;
            outRect.bottom = 0;
        } else {
            outRect.top = this.f52904c / 2;
            outRect.bottom = this.f52905d / 2;
        }
    }
}
