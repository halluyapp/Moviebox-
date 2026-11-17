package com.transsion.publish.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsion.publish.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.publish.adapter.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17569l0 extends RecyclerView.AbstractC4203b0 {

    /* JADX INFO: renamed from: a */
    private ImageView f58066a;

    /* JADX INFO: renamed from: b */
    private View f58067b;

    /* JADX INFO: renamed from: c */
    private View f58068c;

    /* JADX INFO: renamed from: d */
    private TextView f58069d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17569l0(View view) {
        super(view);
        Intrinsics.m97799e(view);
        this.f58066a = (ImageView) view.findViewById(R$id.iv_photo);
        this.f58067b = view.findViewById(R$id.iv_clear);
        this.f58068c = view.findViewById(R$id.rl_add);
        this.f58069d = (TextView) view.findViewById(R$id.tv_number);
    }

    /* JADX INFO: renamed from: f */
    public final View m75274f() {
        return this.f58068c;
    }

    /* JADX INFO: renamed from: g */
    public final View m75275g() {
        return this.f58067b;
    }

    /* JADX INFO: renamed from: h */
    public final ImageView m75276h() {
        return this.f58066a;
    }

    /* JADX INFO: renamed from: i */
    public final TextView m75277i() {
        return this.f58069d;
    }
}
