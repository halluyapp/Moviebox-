package com.transsion.publish.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsion.publish.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.publish.adapter.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C17550c extends RecyclerView.AbstractC4203b0 {

    /* JADX INFO: renamed from: a */
    private ImageView f57990a;

    /* JADX INFO: renamed from: b */
    private View f57991b;

    /* JADX INFO: renamed from: c */
    private View f57992c;

    /* JADX INFO: renamed from: d */
    private TextView f57993d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17550c(View view) {
        super(view);
        Intrinsics.m97799e(view);
        this.f57990a = (ImageView) view.findViewById(R$id.iv_photo);
        this.f57991b = view.findViewById(R$id.iv_clear);
        this.f57992c = view.findViewById(R$id.rl_add);
        this.f57993d = (TextView) view.findViewById(R$id.tv_number);
    }

    /* JADX INFO: renamed from: f */
    public final View m75205f() {
        return this.f57992c;
    }

    /* JADX INFO: renamed from: g */
    public final View m75206g() {
        return this.f57991b;
    }

    /* JADX INFO: renamed from: h */
    public final ImageView m75207h() {
        return this.f57990a;
    }

    /* JADX INFO: renamed from: i */
    public final TextView m75208i() {
        return this.f57993d;
    }
}
