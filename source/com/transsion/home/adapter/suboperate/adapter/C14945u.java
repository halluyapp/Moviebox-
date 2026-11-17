package com.transsion.home.adapter.suboperate.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.suboperate.provider.C14971i;
import com.transsion.home.bean.BannerData;
import com.transsion.home.bean.OperateItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.adapter.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C14945u extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    private List f52254a;

    /* JADX INFO: renamed from: b */
    private final int f52255b;

    /* JADX INFO: renamed from: c */
    private final C14971i f52256c;

    /* JADX INFO: renamed from: d */
    private final OperateItem f52257d;

    /* JADX INFO: renamed from: e */
    private final int f52258e;

    /* JADX INFO: renamed from: f */
    private final int f52259f;

    public C14945u(List banners, int i11, C14971i bannerProvider, OperateItem operateItem) {
        Intrinsics.m97802h(banners, "banners");
        Intrinsics.m97802h(bannerProvider, "bannerProvider");
        Intrinsics.m97802h(operateItem, "operateItem");
        this.f52254a = banners;
        this.f52255b = i11;
        this.f52256c = bannerProvider;
        this.f52257d = operateItem;
        this.f52259f = 1;
    }

    /* JADX INFO: renamed from: h */
    private final BannerData m66999h(int i11) {
        int size;
        if (!this.f52254a.isEmpty() && (size = i11 % this.f52254a.size()) >= 0 && size < this.f52254a.size()) {
            return (BannerData) this.f52254a.get(size);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final List m67000g() {
        return this.f52254a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i11) {
        BannerData bannerDataM66999h = m66999h(i11);
        return (bannerDataM66999h != null ? bannerDataM66999h.getBiddingAdData() : null) != null ? this.f52259f : this.f52258e;
    }

    /* JADX INFO: renamed from: i */
    public final void m67001i(List list) {
        Intrinsics.m97802h(list, "<set-?>");
        this.f52254a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC4203b0 holder, int i11) {
        Intrinsics.m97802h(holder, "holder");
        if (this.f52254a.isEmpty()) {
            return;
        }
        int size = i11 % this.f52254a.size();
        if (getItemViewType(i11) == this.f52259f) {
            SubBannerADViewHolder subBannerADViewHolder = holder instanceof SubBannerADViewHolder ? (SubBannerADViewHolder) holder : null;
            if (subBannerADViewHolder != null) {
                subBannerADViewHolder.m66910i(m66999h(i11));
                return;
            }
            return;
        }
        SubBannerViewHolder subBannerViewHolder = holder instanceof SubBannerViewHolder ? (SubBannerViewHolder) holder : null;
        if (subBannerViewHolder != null) {
            subBannerViewHolder.m66930g(m66999h(i11), size);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.AbstractC4203b0 onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        if (i11 == this.f52259f) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.item_sub_banner_ad, parent, false);
            Intrinsics.m97799e(viewInflate);
            return new SubBannerADViewHolder(viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(R$layout.item_sub_view_pager, parent, false);
        Intrinsics.m97799e(viewInflate2);
        return new SubBannerViewHolder(viewInflate2, this.f52255b, this.f52256c, this.f52257d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.AbstractC4203b0 holder) {
        Intrinsics.m97802h(holder, "holder");
        super.onViewRecycled(holder);
        boolean z11 = holder instanceof SubBannerADViewHolder;
        if ((z11 ? (SubBannerADViewHolder) holder : null) != null) {
            SubBannerADViewHolder subBannerADViewHolder = z11 ? (SubBannerADViewHolder) holder : null;
            if (subBannerADViewHolder != null) {
                subBannerADViewHolder.m66911k();
            }
        }
    }
}
