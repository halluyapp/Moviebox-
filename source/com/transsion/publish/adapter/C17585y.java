package com.transsion.publish.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsion.publish.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.publish.adapter.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C17585y extends RecyclerView.AbstractC4203b0 {

    /* JADX INFO: renamed from: a */
    private ImageView f58101a;

    /* JADX INFO: renamed from: b */
    private TextView f58102b;

    /* JADX INFO: renamed from: c */
    private View f58103c;

    /* JADX INFO: renamed from: d */
    private View f58104d;

    /* JADX INFO: renamed from: e */
    private View f58105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17585y(View itemView) {
        super(itemView);
        Intrinsics.m97802h(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.iv_cover);
        Intrinsics.m97801g(viewFindViewById, "findViewById(...)");
        this.f58101a = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.tv_title);
        Intrinsics.m97801g(viewFindViewById2, "findViewById(...)");
        this.f58102b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.tv_desc);
        Intrinsics.m97801g(viewFindViewById3, "findViewById(...)");
        this.f58103c = viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.rl_close);
        Intrinsics.m97801g(viewFindViewById4, "findViewById(...)");
        this.f58104d = viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.layout);
        Intrinsics.m97801g(viewFindViewById5, "findViewById(...)");
        this.f58105e = viewFindViewById5;
    }

    /* JADX INFO: renamed from: f */
    public final View m75343f() {
        return this.f58104d;
    }

    /* JADX INFO: renamed from: g */
    public final TextView m75344g() {
        return this.f58102b;
    }
}
