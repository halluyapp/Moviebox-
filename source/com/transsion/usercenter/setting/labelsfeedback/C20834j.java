package com.transsion.usercenter.setting.labelsfeedback;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import p585lw.C25707f0;

/* JADX INFO: renamed from: com.transsion.usercenter.setting.labelsfeedback.j */
/* JADX INFO: loaded from: classes7.dex */
public final class C20834j extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: com.transsion.usercenter.setting.labelsfeedback.j$a */
    public final class a extends RecyclerView.AbstractC4203b0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C20834j f65523a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C20834j c20834j, C25707f0 binding) {
            super(binding.getRoot());
            Intrinsics.m97802h(binding, "binding");
            this.f65523a = c20834j;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i11) {
        Intrinsics.m97802h(holder, "holder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        C25707f0 c25707f0M101128c = C25707f0.m101128c(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.m97801g(c25707f0M101128c, "inflate(...)");
        return new a(this, c25707f0M101128c);
    }
}
