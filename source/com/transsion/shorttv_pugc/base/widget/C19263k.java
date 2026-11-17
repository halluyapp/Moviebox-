package com.transsion.shorttv_pugc.base.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.core.text.AbstractC2469v;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C19263k extends RecyclerView.AbstractC4213l {

    /* JADX INFO: renamed from: a */
    private final float f61853a;

    /* JADX INFO: renamed from: b */
    private final float f61854b;

    /* JADX INFO: renamed from: c */
    private final float f61855c;

    public C19263k() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public C19263k(float f11, float f12, float f13) {
        this.f61853a = f11;
        this.f61854b = f12;
        this.f61855c = f13;
    }

    public /* synthetic */ C19263k(float f11, float f12, float f13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
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
            float f11 = this.f61853a;
            if (f11 > 0.0f) {
                outRect.left = AbstractC5776a0.m27313a(f11);
            }
            float f12 = this.f61854b;
            if (f12 > 0.0f) {
                outRect.top = AbstractC5776a0.m27313a(f12);
            }
        }
        int iM20926b = state.m20926b() - 1;
        float f13 = this.f61855c;
        if (f13 > 0.0f && this.f61853a > 0.0f) {
            if (childAdapterPosition == 0) {
                outRect.left = AbstractC5776a0.m27313a(f13);
            }
            if (childAdapterPosition == iM20926b) {
                outRect.right = AbstractC5776a0.m27313a(this.f61855c);
            }
        }
        float f14 = this.f61855c;
        if (f14 > 0.0f && this.f61854b > 0.0f) {
            if (childAdapterPosition == 0) {
                outRect.top = AbstractC5776a0.m27313a(f14);
            }
            if (childAdapterPosition == iM20926b) {
                outRect.bottom = AbstractC5776a0.m27313a(this.f61855c);
            }
        }
        if (AbstractC2469v.m12048a(Locale.getDefault()) == 1) {
            int i11 = outRect.left;
            outRect.left = outRect.right;
            outRect.right = i11;
        }
    }
}
