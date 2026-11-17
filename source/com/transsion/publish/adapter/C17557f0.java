package com.transsion.publish.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsion.publish.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.publish.adapter.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17557f0 extends RecyclerView.AbstractC4203b0 {

    /* JADX INFO: renamed from: a */
    private ImageView f58023a;

    /* JADX INFO: renamed from: b */
    private TextView f58024b;

    /* JADX INFO: renamed from: c */
    private View f58025c;

    /* JADX INFO: renamed from: d */
    private View f58026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17557f0(View itemView) {
        super(itemView);
        Intrinsics.m97802h(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.sv_item_cover);
        Intrinsics.m97801g(viewFindViewById, "findViewById(...)");
        this.f58023a = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.tv_select);
        Intrinsics.m97801g(viewFindViewById2, "findViewById(...)");
        this.f58024b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.view_masking);
        Intrinsics.m97801g(viewFindViewById3, "findViewById(...)");
        this.f58025c = viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.rl_select);
        Intrinsics.m97801g(viewFindViewById4, "findViewById(...)");
        this.f58026d = viewFindViewById4;
    }

    /* JADX INFO: renamed from: f */
    public final ImageView m75235f() {
        return this.f58023a;
    }

    /* JADX INFO: renamed from: g */
    public final View m75236g() {
        return this.f58026d;
    }

    /* JADX INFO: renamed from: h */
    public final TextView m75237h() {
        return this.f58024b;
    }

    /* JADX INFO: renamed from: i */
    public final View m75238i() {
        return this.f58025c;
    }
}
