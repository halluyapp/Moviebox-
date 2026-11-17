package com.transsion.publish.adapter;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.transsion.publish.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.publish.adapter.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17573n0 extends RecyclerView.AbstractC4203b0 {

    /* JADX INFO: renamed from: a */
    private ShapeableImageView f58078a;

    /* JADX INFO: renamed from: b */
    private AppCompatTextView f58079b;

    /* JADX INFO: renamed from: c */
    private AppCompatTextView f58080c;

    /* JADX INFO: renamed from: d */
    private AppCompatImageView f58081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17573n0(View itemView) {
        super(itemView);
        Intrinsics.m97802h(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.ivCover);
        Intrinsics.m97801g(viewFindViewById, "findViewById(...)");
        this.f58078a = (ShapeableImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.tvSubjectTitle);
        Intrinsics.m97801g(viewFindViewById2, "findViewById(...)");
        this.f58079b = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.tvSubjectYear);
        Intrinsics.m97801g(viewFindViewById3, "findViewById(...)");
        this.f58080c = (AppCompatTextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.iv_publish_subject_delete);
        Intrinsics.m97801g(viewFindViewById4, "findViewById(...)");
        this.f58081d = (AppCompatImageView) viewFindViewById4;
    }

    /* JADX INFO: renamed from: f */
    public final ShapeableImageView m75283f() {
        return this.f58078a;
    }

    /* JADX INFO: renamed from: g */
    public final AppCompatImageView m75284g() {
        return this.f58081d;
    }

    /* JADX INFO: renamed from: h */
    public final AppCompatTextView m75285h() {
        return this.f58080c;
    }

    /* JADX INFO: renamed from: i */
    public final AppCompatTextView m75286i() {
        return this.f58079b;
    }
}
