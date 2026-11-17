package com.transsion.home.adapter.trending.provider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ck.AbstractC5114k;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.transsion.baseui.adapter.BaseItemBindingProvider;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.bean.SingleImagePage;
import com.transsion.moviedetailapi.bean.Image;
import com.transsion.moviedetailapi.bean.PostItemType;
import fk.AbstractC23384a;
import kotlin.jvm.internal.Intrinsics;
import p462hj.C23860f;
import p552kl.C24684j0;
import p842vl.C28121c;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C15064y extends BaseItemBindingProvider {

    /* JADX INFO: renamed from: h */
    public static final int f52607h = BaseItemBindingProvider.f51006f;

    /* JADX INFO: renamed from: g */
    private final int f52608g = AbstractC5806y.m27489e() - AbstractC23384a.m92908b(24);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m67349C(BaseViewHolder baseViewHolder, OperateItem operateItem, View view) {
        String deepLink;
        C28121c.f86299a.m109216f(baseViewHolder.getBindingAdapterPosition(), operateItem);
        SingleImagePage page = operateItem.getPage();
        if (page == null || (deepLink = page.getDeepLink()) == null) {
            deepLink = operateItem.getDeepLink();
        }
        if (deepLink != null) {
            AbstractC5114k.m23925h(deepLink, null, 1, null);
        }
    }

    @Override // com.transsion.baseui.adapter.BaseItemBindingProvider
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo65419y(C24684j0 binding, final BaseViewHolder helper, final OperateItem item) {
        Image image;
        String url;
        String thumbnail;
        Image image2;
        Image image3;
        Image image4;
        Integer width;
        Image image5;
        Integer height;
        Intrinsics.m97802h(binding, "binding");
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        binding.f75477c.setText(item.getTitle());
        helper.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.trending.provider.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C15064y.m67349C(helper, item, view);
            }
        });
        SingleImagePage page = item.getPage();
        int iIntValue = (page == null || (image5 = page.getImage()) == null || (height = image5.getHeight()) == null) ? 0 : height.intValue();
        SingleImagePage page2 = item.getPage();
        int iIntValue2 = (page2 == null || (image4 = page2.getImage()) == null || (width = image4.getWidth()) == null) ? 1 : width.intValue();
        int i11 = this.f52608g;
        float f11 = ((i11 * iIntValue) * 1.0f) / iIntValue2;
        C26866a.a aVar = C26866a.f81698a;
        SingleImagePage page3 = item.getPage();
        C26866a.a.m104898f(aVar, "SingleImage", "imgH:" + iIntValue + ",imgW:" + iIntValue2 + " imageViewHeight:" + f11 + ", imageViewWidth:" + i11 + "， url:" + ((page3 == null || (image3 = page3.getImage()) == null) ? null : image3.getUrl()), false, 4, null);
        ViewGroup.LayoutParams layoutParams = binding.f75476b.getLayoutParams();
        layoutParams.height = (int) f11;
        binding.f75476b.setLayoutParams(layoutParams);
        SingleImagePage page4 = item.getPage();
        if (page4 == null || (image = page4.getImage()) == null || (url = image.getUrl()) == null) {
            return;
        }
        C23860f.a aVar2 = C23860f.f72909a;
        Context context = binding.f75476b.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        C23860f.b bVarM94468g = aVar2.m94457m(context).m94468g(url);
        SingleImagePage page5 = item.getPage();
        if (page5 == null || (image2 = page5.getImage()) == null || (thumbnail = image2.getThumbnail()) == null) {
            thumbnail = "";
        }
        C23860f.b bVarM94474m = bVarM94468g.m94473l(thumbnail).m94474m(this.f52608g);
        ShapeableImageView ivCover = binding.f75476b;
        Intrinsics.m97801g(ivCover, "ivCover");
        bVarM94474m.m94465d(ivCover);
    }

    @Override // com.transsion.baseui.adapter.BaseItemBindingProvider
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C24684j0 mo65420z(LayoutInflater inflater, ViewGroup parent) {
        Intrinsics.m97802h(inflater, "inflater");
        Intrinsics.m97802h(parent, "parent");
        C24684j0 c24684j0M96956c = C24684j0.m96956c(LayoutInflater.from(m36338k()), parent, false);
        Intrinsics.m97801g(c24684j0M96956c, "inflate(...)");
        return c24684j0M96956c;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.SINGLE_IMAGE.ordinal();
    }
}
