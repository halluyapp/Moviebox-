package com.transsion.home.adapter.trending.provider;

import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.p282tn.lib.view.AbstractC13772o;
import com.p282tn.lib.view.NoNetworkSmallView;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.trending.C15007b;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.moviedetailapi.bean.PostItemType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C15040h extends BaseItemProvider {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final Unit m67305B(C15040h c15040h) {
        Function0<Unit> function0M67212R1;
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = c15040h.m36335g();
        if ((baseProviderMultiAdapterM36335g instanceof C15007b) && (function0M67212R1 = ((C15007b) baseProviderMultiAdapterM36335g).m67212R1()) != null) {
            function0M67212R1.invoke();
        }
        AbstractC13772o.m62234b(SubTabFragment.INSTANCE.m68282a(HomeTabId.INSTANCE.m67538g()));
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final Unit m67306C() {
        AbstractC13772o.m62235c(SubTabFragment.INSTANCE.m68282a(HomeTabId.INSTANCE.m67538g()));
        return Unit.f75682a;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, OperateItem item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        NoNetworkSmallView noNetworkSmallView = (NoNetworkSmallView) helper.getViewOrNull(R$id.no_network);
        if (noNetworkSmallView != null) {
            noNetworkSmallView.retry(new Function0() { // from class: com.transsion.home.adapter.trending.provider.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C15040h.m67305B(this.f52535a);
                }
            });
            noNetworkSmallView.goToSetting(new Function0() { // from class: com.transsion.home.adapter.trending.provider.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C15040h.m67306C();
                }
            });
        }
        AbstractC13772o.m62233a(SubTabFragment.INSTANCE.m68282a(HomeTabId.INSTANCE.m67538g()));
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.NO_NETWORK.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_no_network;
    }
}
