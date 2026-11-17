package com.transsion.search.fragment.values.adapter;

import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Staff;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search.bean.SearchValuesRelatedCollectionEntity;
import com.transsion.search.bean.VerticalRank;
import com.transsion.search.fragment.suggest.C18496d;
import com.transsion.search.fragment.values.SearchValuesFragment;
import kotlin.jvm.internal.Intrinsics;
import p462hj.C23860f;

/* JADX INFO: renamed from: com.transsion.search.fragment.values.adapter.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C18507e extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final int f59952e = AbstractC5776a0.m27313a(72.0f);

    /* JADX INFO: renamed from: f */
    private final int f59953f = AbstractC5776a0.m27313a(96.0f);

    /* JADX INFO: renamed from: z */
    private final String m77989z() {
        String mKeyWord;
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        C18504b c18504b = baseProviderMultiAdapterM36335g instanceof C18504b ? (C18504b) baseProviderMultiAdapterM36335g : null;
        return (c18504b == null || (mKeyWord = c18504b.getMKeyWord()) == null) ? "" : mKeyWord;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 1;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_search_values_vertical_rank_layout;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, SearchValuesRelatedCollectionEntity item) {
        String url;
        Cover cover;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        int i11 = R$id.tvTitle;
        C18496d.Companion companion = C18496d.INSTANCE;
        String strM77989z = m77989z();
        VerticalRank verticalRank = item.getVerticalRank();
        helper.setText(i11, companion.m77937a(strM77989z, verticalRank != null ? verticalRank.getTitle() : null));
        int i12 = R$id.tvSubTitle;
        VerticalRank verticalRank2 = item.getVerticalRank();
        helper.setText(i12, verticalRank2 != null ? verticalRank2.getDescription() : null);
        ShapeableImageView shapeableImageView = (ShapeableImageView) helper.getView(R$id.ivCover);
        C23860f.a aVar = C23860f.f72909a;
        VerticalRank verticalRank3 = item.getVerticalRank();
        if (verticalRank3 == null || (cover = verticalRank3.getCover()) == null || (url = cover.getUrl()) == null) {
            url = "";
        }
        aVar.m94457m(m36338k()).m94468g(C23860f.a.m94447e(aVar, url, this.f59952e, false, false, 12, null)).m94465d(shapeableImageView);
        SearchValuesFragment.Companion companion2 = SearchValuesFragment.INSTANCE;
        Staff staff = item.getStaff();
        companion2.m77957d("", "", staff != null ? staff.getStaffId() : null, "", helper.getBindingAdapterPosition(), 1);
    }
}
