package com.transsion.publish.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsion.publish.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.publish.adapter.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C17583w extends RecyclerView.AbstractC4203b0 {

    /* JADX INFO: renamed from: a */
    private TextView f58099a;

    /* JADX INFO: renamed from: b */
    private View f58100b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17583w(View itemView) {
        super(itemView);
        Intrinsics.m97802h(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.tvGroup);
        Intrinsics.m97801g(viewFindViewById, "findViewById(...)");
        this.f58099a = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.iv_publish_group_delete);
        Intrinsics.m97801g(viewFindViewById2, "findViewById(...)");
        this.f58100b = viewFindViewById2;
    }

    /* JADX INFO: renamed from: f */
    public final View m75340f() {
        return this.f58100b;
    }

    /* JADX INFO: renamed from: g */
    public final TextView m75341g() {
        return this.f58099a;
    }
}
