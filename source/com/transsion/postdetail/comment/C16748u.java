package com.transsion.postdetail.comment;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.core.content.AbstractC2397b;
import androidx.recyclerview.widget.RecyclerView;
import com.p282tn.lib.widget.R$color;
import fk.AbstractC23384a;
import kotlin.jvm.internal.Intrinsics;
import p697q6.InterfaceC27022a;

/* JADX INFO: renamed from: com.transsion.postdetail.comment.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C16748u extends RecyclerView.AbstractC4213l {

    /* JADX INFO: renamed from: a */
    private final int f56291a = AbstractC23384a.m92908b(1);

    /* JADX INFO: renamed from: b */
    private final int f56292b = AbstractC23384a.m92908b(52);

    /* JADX INFO: renamed from: c */
    private Paint f56293c;

    /* JADX INFO: renamed from: d */
    private final Paint m72933d(Context context) {
        if (this.f56293c == null) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(AbstractC2397b.getColor(context, R$color.line_01));
            this.f56293c = paint;
        }
        Paint paint2 = this.f56293c;
        Intrinsics.m97799e(paint2);
        return paint2;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m72934e(InterfaceC27022a interfaceC27022a, InterfaceC27022a interfaceC27022a2) {
        int itemType = interfaceC27022a.getItemType();
        if (interfaceC27022a2.getItemType() != 0) {
            return false;
        }
        return itemType == 0 || itemType == 1 || itemType == 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
        InterfaceC27022a interfaceC27022a;
        Intrinsics.m97802h(outRect, "outRect");
        Intrinsics.m97802h(view, "view");
        Intrinsics.m97802h(parent, "parent");
        Intrinsics.m97802h(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        RecyclerView.Adapter adapter = parent.getAdapter();
        C16741n c16741n = adapter instanceof C16741n ? (C16741n) adapter : null;
        if (c16741n == null) {
            return;
        }
        try {
            InterfaceC27022a interfaceC27022a2 = (InterfaceC27022a) c16741n.getItem(childAdapterPosition);
            if (interfaceC27022a2 != null && interfaceC27022a2.getItemType() == 0 && childAdapterPosition > 0 && (interfaceC27022a = (InterfaceC27022a) c16741n.getItem(childAdapterPosition - 1)) != null && m72934e(interfaceC27022a, interfaceC27022a2)) {
                outRect.top = this.f56291a;
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
    public void onDraw(Canvas c11, RecyclerView parent, RecyclerView.C4226y state) {
        InterfaceC27022a interfaceC27022a;
        Intrinsics.m97802h(c11, "c");
        Intrinsics.m97802h(parent, "parent");
        Intrinsics.m97802h(state, "state");
        RecyclerView.Adapter adapter = parent.getAdapter();
        C16741n c16741n = adapter instanceof C16741n ? (C16741n) adapter : null;
        if (c16741n == null) {
            return;
        }
        int childCount = parent.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = parent.getChildAt(i11);
            int childAdapterPosition = parent.getChildAdapterPosition(childAt);
            if (childAdapterPosition != -1 && childAdapterPosition != 0) {
                try {
                    InterfaceC27022a interfaceC27022a2 = (InterfaceC27022a) c16741n.getItem(childAdapterPosition);
                    if (interfaceC27022a2 != null && interfaceC27022a2.getItemType() == 0 && (interfaceC27022a = (InterfaceC27022a) c16741n.getItem(childAdapterPosition - 1)) != null && m72934e(interfaceC27022a, interfaceC27022a2)) {
                        int i12 = this.f56292b;
                        int width = parent.getWidth();
                        float top = childAt.getTop();
                        float f11 = top + this.f56291a;
                        Context context = parent.getContext();
                        Intrinsics.m97801g(context, "getContext(...)");
                        c11.drawRect(i12, top, width, f11, m72933d(context));
                    }
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
    }
}
