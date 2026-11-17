package com.transsion.shorttv_pugc.p317ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.transsion.shorttv.R$color;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv_pugc.bean.BannerData;
import com.transsion.shorttv_pugc.bean.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p558kt.C25429b;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTVBannerAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    private final List f61956a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private Function3 f61957b;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m80776i(BannerData bannerData, ShortTVBannerAdapter shortTVBannerAdapter, int i11, View view) {
        Function3 function3;
        if (bannerData == null || (function3 = shortTVBannerAdapter.f61957b) == null) {
            return;
        }
        Intrinsics.m97799e(view);
        function3.invoke(view, Integer.valueOf(i11), bannerData);
    }

    public final List getData() {
        return this.f61956a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f61956a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C19319b holder, final int i11) {
        Image image;
        String thumbnail;
        Image image2;
        String url;
        Boolean hasResource;
        Intrinsics.m97802h(holder, "holder");
        final BannerData bannerData = (BannerData) this.f61956a.get(i11);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.ui.adapter.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTVBannerAdapter.m80776i(bannerData, this, i11, view);
            }
        });
        if (bannerData == null || !bannerData.getBuiltIn()) {
            C25429b.a aVar = C25429b.f76999a;
            Context context = holder.itemView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            ShapeableImageView ivCover = holder.m80803f().f83141b;
            Intrinsics.m97801g(ivCover, "ivCover");
            aVar.m99980j(context, ivCover, (bannerData == null || (image2 = bannerData.getImage()) == null || (url = image2.getUrl()) == null) ? "" : url, (8120 & 8) != 0 ? aVar.m99977c() : R$color.short_tv_module_04, (8120 & 16) != 0 ? aVar.m99976b() : 0, (8120 & 32) != 0, (8120 & 64) != 0 ? "" : (bannerData == null || (image = bannerData.getImage()) == null || (thumbnail = image.getThumbnail()) == null) ? "" : thumbnail, (8120 & 128) != 0, (8120 & 256) != 0, (8120 & 512) != 0 ? false : false, (8120 & 1024) != 0 ? false : false, (8120 & 2048) != 0 ? false : false, (8120 & 4096) != 0 ? 25 : 0);
        } else {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new ShortTVBannerAdapter$onBindViewHolder$1$2(bannerData, holder, null), 3, null);
        }
        holder.m80803f().f83143d.setText(bannerData != null ? bannerData.getContent() : null);
        AppCompatImageView ivPlay = holder.m80803f().f83142c;
        Intrinsics.m97801g(ivPlay, "ivPlay");
        ivPlay.setVisibility((bannerData == null || (hasResource = bannerData.getHasResource()) == null) ? false : hasResource.booleanValue() ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C19319b onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.short_tv_item_banner, parent, false);
        Intrinsics.m97799e(viewInflate);
        return new C19319b(viewInflate);
    }

    /* JADX INFO: renamed from: k */
    public final void m80779k(Function3 listener) {
        Intrinsics.m97802h(listener, "listener");
        this.f61957b = listener;
    }

    public final void setData(List list) {
        Intrinsics.m97802h(list, "list");
        this.f61956a.clear();
        this.f61956a.addAll(list);
        notifyDataSetChanged();
    }
}
