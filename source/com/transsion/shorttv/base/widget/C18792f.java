package com.transsion.shorttv.base.widget;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.shorttv.base.widget.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C18792f extends RecyclerView.AbstractC4213l {

    /* JADX INFO: renamed from: a */
    private final int f60740a;

    public C18792f(int i11) {
        this.f60740a = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
        Intrinsics.m97802h(outRect, "outRect");
        Intrinsics.m97802h(view, "view");
        Intrinsics.m97802h(parent, "parent");
        Intrinsics.m97802h(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
            if (childAdapterPosition == 0) {
                outRect.left = 0;
                return;
            } else {
                outRect.left = this.f60740a;
                return;
            }
        }
        RecyclerView.Adapter adapter = parent.getAdapter();
        if (childAdapterPosition == (adapter != null ? adapter.getItemCount() : 0) - 1) {
            outRect.left = 0;
        } else {
            outRect.left = this.f60740a;
        }
    }
}
