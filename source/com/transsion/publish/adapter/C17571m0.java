package com.transsion.publish.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsion.publish.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.publish.adapter.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17571m0 extends RecyclerView.AbstractC4203b0 {

    /* JADX INFO: renamed from: a */
    private ImageView f58071a;

    /* JADX INFO: renamed from: b */
    private View f58072b;

    /* JADX INFO: renamed from: c */
    private TextView f58073c;

    /* JADX INFO: renamed from: d */
    private TextView f58074d;

    /* JADX INFO: renamed from: e */
    private View f58075e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17571m0(View itemView) {
        super(itemView);
        Intrinsics.m97802h(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.sv_item_cover);
        Intrinsics.m97801g(viewFindViewById, "findViewById(...)");
        this.f58071a = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.sv_item_layer);
        Intrinsics.m97801g(viewFindViewById2, "findViewById(...)");
        this.f58072b = viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.sv_item_duration);
        Intrinsics.m97801g(viewFindViewById3, "findViewById(...)");
        this.f58073c = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.tv_select);
        Intrinsics.m97801g(viewFindViewById4, "findViewById(...)");
        this.f58074d = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.rl_select);
        Intrinsics.m97801g(viewFindViewById5, "findViewById(...)");
        this.f58075e = viewFindViewById5;
    }

    /* JADX INFO: renamed from: f */
    public final ImageView m75278f() {
        return this.f58071a;
    }

    /* JADX INFO: renamed from: g */
    public final View m75279g() {
        return this.f58072b;
    }

    /* JADX INFO: renamed from: h */
    public final View m75280h() {
        return this.f58075e;
    }

    /* JADX INFO: renamed from: i */
    public final TextView m75281i() {
        return this.f58073c;
    }

    /* JADX INFO: renamed from: j */
    public final TextView m75282j() {
        return this.f58074d;
    }
}
