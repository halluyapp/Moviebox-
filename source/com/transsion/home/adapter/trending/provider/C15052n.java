package com.transsion.home.adapter.trending.provider;

import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.preload.InterfaceC15428b;
import com.transsion.home.view.OpRankingView;
import com.transsion.moviedetailapi.bean.PostItemType;
import kotlin.jvm.internal.Intrinsics;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C15052n extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final InterfaceC15428b f52588e;

    public C15052n(InterfaceC15428b interfaceC15428b) {
        this.f52588e = interfaceC15428b;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.OP_RANKING.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.post_list_item_op_ranking;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: r */
    public BaseViewHolder mo36342r(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        InterfaceC15428b interfaceC15428b = this.f52588e;
        if (interfaceC15428b == null || interfaceC15428b.mo68499b() || this.f52588e.mo68501d() == null) {
            return super.mo36342r(parent, i11);
        }
        C26866a.a.m104898f(C26866a.f81698a, "MainXMLPreload", "ranking", false, 4, null);
        View viewMo68501d = this.f52588e.mo68501d();
        if (viewMo68501d == null) {
            return super.mo36342r(parent, i11);
        }
        viewMo68501d.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new BaseViewHolder(viewMo68501d);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, OperateItem item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        OpRankingView opRankingView = (OpRankingView) helper.getViewOrNull(R$id.ranking_view);
        if (opRankingView == null || item.getRankings() == null) {
            return;
        }
        opRankingView.setDatas(item);
    }
}
