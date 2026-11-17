package com.transsion.search_pugc.fragment.result.provider;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5790i;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.search.R$layout;
import com.transsion.search_pugc.constant.ResultCollectItemWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.search_pugc.fragment.result.provider.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C18640a extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final int f60227e = ResultCollectItemWrapper.Type.FOOTER.ordinal();

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return this.f60227e;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.search_collection_footer;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, ResultCollectItemWrapper item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        ViewGroup.LayoutParams layoutParams = helper.itemView.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.C4215n c4215n = (RecyclerView.C4215n) layoutParams;
        ((ViewGroup.MarginLayoutParams) c4215n).width = AbstractC5790i.m27411e(26.0f);
        ((ViewGroup.MarginLayoutParams) c4215n).height = AbstractC5790i.m27411e(102.0f);
        helper.itemView.setLayoutParams(c4215n);
    }
}
