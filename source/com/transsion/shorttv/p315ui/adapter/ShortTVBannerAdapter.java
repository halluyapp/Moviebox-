package com.transsion.shorttv.p315ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.transsion.shorttv.R$color;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.bean.BannerData;
import com.transsion.shorttv.bean.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p416fs.C23424b;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTVBannerAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    private final List f60936a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private Function3 f60937b;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m79519i(BannerData bannerData, ShortTVBannerAdapter shortTVBannerAdapter, int i11, View view) {
        Function3 function3;
        if (bannerData == null || (function3 = shortTVBannerAdapter.f60937b) == null) {
            return;
        }
        Intrinsics.m97799e(view);
        function3.invoke(view, Integer.valueOf(i11), bannerData);
    }

    public final List getData() {
        return this.f60936a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f60936a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C18903b holder, final int i11) {
        Image image;
        String thumbnail;
        Image image2;
        String url;
        Boolean hasResource;
        Intrinsics.m97802h(holder, "holder");
        final BannerData bannerData = (BannerData) this.f60936a.get(i11);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.adapter.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTVBannerAdapter.m79519i(bannerData, this, i11, view);
            }
        });
        if (bannerData == null || !bannerData.getBuiltIn()) {
            C23424b.a aVar = C23424b.f71424a;
            Context context = holder.itemView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            ShapeableImageView ivCover = holder.m79549f().f83141b;
            Intrinsics.m97801g(ivCover, "ivCover");
            aVar.m93010j(context, ivCover, (bannerData == null || (image2 = bannerData.getImage()) == null || (url = image2.getUrl()) == null) ? "" : url, (8096 & 8) != 0 ? aVar.m93007c() : R$color.short_tv_module_04, (8096 & 16) != 0 ? aVar.m93006b() : 0, (8096 & 32) != 0, (8096 & 64) != 0 ? "" : (bannerData == null || (image = bannerData.getImage()) == null || (thumbnail = image.getThumbnail()) == null) ? "" : thumbnail, (8096 & 128) != 0, (8096 & 256) != 0, (8096 & 512) != 0 ? false : false, (8096 & 1024) != 0 ? false : false, (8096 & 2048) != 0 ? false : false, (8096 & 4096) != 0 ? 25 : 0);
        } else {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new ShortTVBannerAdapter$onBindViewHolder$1$2(bannerData, holder, null), 3, null);
        }
        holder.m79549f().f83143d.setText(bannerData != null ? bannerData.getContent() : null);
        AppCompatImageView ivPlay = holder.m79549f().f83142c;
        Intrinsics.m97801g(ivPlay, "ivPlay");
        ivPlay.setVisibility((bannerData == null || (hasResource = bannerData.getHasResource()) == null) ? false : hasResource.booleanValue() ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C18903b onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.short_tv_item_banner, parent, false);
        Intrinsics.m97799e(viewInflate);
        return new C18903b(viewInflate);
    }

    /* JADX INFO: renamed from: k */
    public final void m79522k(Function3 listener) {
        Intrinsics.m97802h(listener, "listener");
        this.f60937b = listener;
    }

    public final void setData(List list) {
        Intrinsics.m97802h(list, "list");
        this.f60936a.clear();
        this.f60936a.addAll(list);
        notifyDataSetChanged();
    }
}
