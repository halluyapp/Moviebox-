package com.transsion.shorttv.base.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.core.text.AbstractC2469v;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.shorttv.base.widget.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C18799m extends RecyclerView.AbstractC4213l {

    /* JADX INFO: renamed from: a */
    private final float f60748a;

    /* JADX INFO: renamed from: b */
    private final float f60749b;

    /* JADX INFO: renamed from: c */
    private final float f60750c;

    public C18799m() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public C18799m(float f11, float f12, float f13) {
        this.f60748a = f11;
        this.f60749b = f12;
        this.f60750c = f13;
    }

    public /* synthetic */ C18799m(float f11, float f12, float f13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0f : f11, (i11 & 2) != 0 ? 0.0f : f12, (i11 & 4) != 0 ? 0.0f : f13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
        Intrinsics.m97802h(outRect, "outRect");
        Intrinsics.m97802h(view, "view");
        Intrinsics.m97802h(parent, "parent");
        Intrinsics.m97802h(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition != 0) {
            float f11 = this.f60748a;
            if (f11 > 0.0f) {
                outRect.left = AbstractC5776a0.m27313a(f11);
            }
            float f12 = this.f60749b;
            if (f12 > 0.0f) {
                outRect.top = AbstractC5776a0.m27313a(f12);
            }
        }
        int iM20926b = state.m20926b() - 1;
        float f13 = this.f60750c;
        if (f13 > 0.0f && this.f60748a > 0.0f) {
            if (childAdapterPosition == 0) {
                outRect.left = AbstractC5776a0.m27313a(f13);
            }
            if (childAdapterPosition == iM20926b) {
                outRect.right = AbstractC5776a0.m27313a(this.f60750c);
            }
        }
        float f14 = this.f60750c;
        if (f14 > 0.0f && this.f60749b > 0.0f) {
            if (childAdapterPosition == 0) {
                outRect.top = AbstractC5776a0.m27313a(f14);
            }
            if (childAdapterPosition == iM20926b) {
                outRect.bottom = AbstractC5776a0.m27313a(this.f60750c);
            }
        }
        if (AbstractC2469v.m12048a(Locale.getDefault()) == 1) {
            int i11 = outRect.left;
            outRect.left = outRect.right;
            outRect.right = i11;
        }
    }
}
