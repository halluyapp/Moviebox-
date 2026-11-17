package com.transsion.postdetail.p306ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import p844vo.C28175t;

/* JADX INFO: renamed from: com.transsion.postdetail.ui.adapter.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C16977d extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    private final String f56968a;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.adapter.d$a */
    public final class a extends RecyclerView.AbstractC4203b0 {

        /* JADX INFO: renamed from: a */
        private final C28175t f56969a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C16977d f56970b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C16977d c16977d, C28175t binding) {
            super(binding.getRoot());
            Intrinsics.m97802h(binding, "binding");
            this.f56970b = c16977d;
            this.f56969a = binding;
        }

        /* JADX INFO: renamed from: f */
        public final C28175t m73907f() {
            return this.f56969a;
        }
    }

    public C16977d(String str) {
        this.f56968a = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i11) {
        Intrinsics.m97802h(holder, "holder");
        holder.m73907f().f86622b.setText(this.f56968a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        C28175t c28175tM109379c = C28175t.m109379c(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.m97801g(c28175tM109379c, "inflate(...)");
        return new a(this, c28175tM109379c);
    }
}
