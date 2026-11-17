package com.transsion.publish.adapter;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsion.publish.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.publish.adapter.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C17548b extends RecyclerView.AbstractC4203b0 {

    /* JADX INFO: renamed from: a */
    private TextView f57981a;

    /* JADX INFO: renamed from: b */
    private TextView f57982b;

    /* JADX INFO: renamed from: c */
    private FrameLayout f57983c;

    /* JADX INFO: renamed from: d */
    private ImageView f57984d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17548b(View itemView) {
        super(itemView);
        Intrinsics.m97802h(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.tv_title);
        Intrinsics.m97801g(viewFindViewById, "findViewById(...)");
        this.f57981a = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.tv_desc);
        Intrinsics.m97801g(viewFindViewById2, "findViewById(...)");
        this.f57982b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.rl_close);
        Intrinsics.m97801g(viewFindViewById3, "findViewById(...)");
        this.f57983c = (FrameLayout) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.iv_play);
        Intrinsics.m97801g(viewFindViewById4, "findViewById(...)");
        this.f57984d = (ImageView) viewFindViewById4;
    }

    /* JADX INFO: renamed from: f */
    public final ImageView m75191f() {
        return this.f57984d;
    }

    /* JADX INFO: renamed from: g */
    public final FrameLayout m75192g() {
        return this.f57983c;
    }

    /* JADX INFO: renamed from: h */
    public final TextView m75193h() {
        return this.f57982b;
    }

    /* JADX INFO: renamed from: i */
    public final TextView m75194i() {
        return this.f57981a;
    }
}
