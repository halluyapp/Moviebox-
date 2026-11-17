package com.transsion.publish.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsion.publish.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.publish.adapter.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17551c0 extends RecyclerView.AbstractC4203b0 {

    /* JADX INFO: renamed from: a */
    private ImageView f57994a;

    /* JADX INFO: renamed from: b */
    private TextView f57995b;

    /* JADX INFO: renamed from: c */
    private TextView f57996c;

    /* JADX INFO: renamed from: d */
    private TextView f57997d;

    /* JADX INFO: renamed from: e */
    private ImageView f57998e;

    /* JADX INFO: renamed from: f */
    private View f57999f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17551c0(View itemView) {
        super(itemView);
        Intrinsics.m97802h(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.sv_item_cover);
        Intrinsics.m97801g(viewFindViewById, "findViewById(...)");
        this.f57994a = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.tv_title);
        Intrinsics.m97801g(viewFindViewById2, "findViewById(...)");
        this.f57995b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.tv_desc);
        Intrinsics.m97801g(viewFindViewById3, "findViewById(...)");
        this.f57996c = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.tv_select);
        Intrinsics.m97801g(viewFindViewById4, "findViewById(...)");
        this.f57997d = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.iv_play);
        Intrinsics.m97801g(viewFindViewById5, "findViewById(...)");
        this.f57998e = (ImageView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.view_masking);
        Intrinsics.m97801g(viewFindViewById6, "findViewById(...)");
        this.f57999f = viewFindViewById6;
    }

    /* JADX INFO: renamed from: f */
    public final ImageView m75209f() {
        return this.f57998e;
    }

    /* JADX INFO: renamed from: g */
    public final TextView m75210g() {
        return this.f57996c;
    }

    /* JADX INFO: renamed from: h */
    public final TextView m75211h() {
        return this.f57997d;
    }

    /* JADX INFO: renamed from: i */
    public final TextView m75212i() {
        return this.f57995b;
    }

    /* JADX INFO: renamed from: j */
    public final View m75213j() {
        return this.f57999f;
    }
}
