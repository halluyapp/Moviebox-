package com.transsion.home.adapter.operateUGC.provider;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.tmc.integration.constants.IntegrationConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.operateUGC.adapter.C14858d;
import com.transsion.home.adapter.operateUGC.adapter.C14859e;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.bean.RankingListData;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.home.view.C15522d;
import com.transsion.moviedetailapi.bean.PostItemType;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mg.C25829f;
import ml.AbstractC25888b;
import p550kj.C24662i;
import p765s6.InterfaceC27566d;

/* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.provider.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C14904w extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final int f52090e;

    /* JADX INFO: renamed from: f */
    private OperateItem f52091f;

    /* JADX INFO: renamed from: g */
    private C14858d f52092g;

    /* JADX INFO: renamed from: h */
    private C14859e f52093h;

    /* JADX INFO: renamed from: i */
    private int f52094i;

    /* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.provider.w$a */
    public static final class a extends RecyclerView.AbstractC4219r {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C15522d f52095a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C14904w f52096b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ RecyclerView f52097c;

        a(C15522d c15522d, C14904w c14904w, RecyclerView recyclerView) {
            this.f52095a = c15522d;
            this.f52096b = c14904w;
            this.f52097c = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            View viewFindSnapView;
            List<Object> data;
            Intrinsics.m97802h(recyclerView, "recyclerView");
            if (i11 != 0 || (viewFindSnapView = this.f52095a.findSnapView(recyclerView.getLayoutManager())) == null) {
                return;
            }
            RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
            int position = layoutManager != null ? layoutManager.getPosition(viewFindSnapView) : 0;
            C14859e c14859e = this.f52096b.f52093h;
            if (c14859e != null) {
                c14859e.m66771C1(position);
            }
            this.f52096b.f52094i = position;
            if (position != 0) {
                C14859e c14859e2 = this.f52096b.f52093h;
                if (position != ((c14859e2 == null || (data = c14859e2.getData()) == null) ? -1 : data.size()) - 1) {
                    this.f52096b.m66885K(this.f52097c, position);
                    return;
                }
            }
            this.f52097c.scrollToPosition(position);
        }
    }

    public C14904w(int i11) {
        this.f52090e = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m66879E(OperateItem operateItem, C14904w c14904w, View view) {
        String deepLink = operateItem.getDeepLink();
        if (deepLink != null) {
            AbstractC5114k.m23925h(deepLink, null, 1, null);
        }
        c14904w.m66884J(operateItem);
    }

    /* JADX INFO: renamed from: F */
    private final void m66880F(RecyclerView recyclerView, RecyclerView recyclerView2, OperateItem operateItem) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m36338k(), 0, false);
        linearLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C25829f(8.0f, 0.0f, 12.0f, 2, null));
        }
        C14858d c14858d = new C14858d(0, operateItem, this.f52090e, 1, null);
        this.f52092g = c14858d;
        RankingListData rankingListData = operateItem.getRankingListData();
        c14858d.mo36201n1(rankingListData != null ? rankingListData.getItems() : null);
        recyclerView.setAdapter(this.f52092g);
        recyclerView.scrollToPosition(this.f52094i);
        recyclerView.setOnFlingListener(null);
        C15522d c15522d = new C15522d(AbstractC5776a0.m27313a(12.0f));
        c15522d.attachToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(new a(c15522d, this, recyclerView2));
    }

    /* JADX INFO: renamed from: G */
    private final void m66881G(final RecyclerView recyclerView, final RecyclerView recyclerView2, OperateItem operateItem) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m36338k(), 0, false);
        linearLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C25829f(8.0f, 0.0f, 12.0f, 2, null));
        }
        C14859e c14859e = new C14859e(0, 1, null);
        this.f52093h = c14859e;
        c14859e.m66771C1(this.f52094i);
        C14859e c14859e2 = this.f52093h;
        if (c14859e2 != null) {
            RankingListData rankingListData = operateItem.getRankingListData();
            c14859e2.mo36201n1(rankingListData != null ? rankingListData.getItems() : null);
        }
        C14859e c14859e3 = this.f52093h;
        if (c14859e3 != null) {
            c14859e3.m36227w1(new InterfaceC27566d() { // from class: com.transsion.home.adapter.operateUGC.provider.v
                @Override // p765s6.InterfaceC27566d
                /* JADX INFO: renamed from: a */
                public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                    C14904w.m66882H(this.f52087a, recyclerView2, recyclerView, baseQuickAdapter, view, i11);
                }
            });
        }
        recyclerView.setAdapter(this.f52093h);
        recyclerView.scrollToPosition(this.f52094i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX INFO: renamed from: H */
    public static final void m66882H(C14904w c14904w, RecyclerView recyclerView, RecyclerView recyclerView2, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List<Object> data;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        c14904w.f52094i = i11;
        if (i11 == 0) {
            recyclerView.scrollToPosition(i11);
        } else {
            C14858d c14858d = c14904w.f52092g;
            if (i11 == ((c14858d == null || (data = c14858d.getData()) == null) ? -1 : data.size()) - 1) {
                recyclerView.scrollToPosition(i11);
            } else {
                c14904w.m66885K(recyclerView, i11);
            }
        }
        C14859e c14859e = c14904w.f52093h;
        if (c14859e != null) {
            c14859e.m66771C1(c14904w.f52094i);
        }
        recyclerView2.scrollToPosition(i11);
    }

    /* JADX INFO: renamed from: I */
    private final void m66883I(OperateItem operateItem) {
        List<Object> data;
        HashMap map = new HashMap();
        map.put("module_name", IntegrationConstants.NAVIGATION_BAR_ALL_ACTION);
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        map.put(RequestParameters.POSITION, String.valueOf((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? null : Integer.valueOf(data.indexOf(operateItem))));
        String title = operateItem.getTitle();
        if (title == null) {
            title = "";
        }
        map.put(CampaignEx.JSON_KEY_TITLE, title);
        map.put("tabId", String.valueOf(this.f52090e));
        AbstractC25888b.m101678a(operateItem, map);
        C24662i.f75350a.m96872D(SubTabFragment.INSTANCE.m68282a(this.f52090e), map);
    }

    /* JADX INFO: renamed from: J */
    private final void m66884J(OperateItem operateItem) {
        List<Object> data;
        HashMap map = new HashMap();
        map.put("module_name", IntegrationConstants.NAVIGATION_BAR_ALL_ACTION);
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        map.put(RequestParameters.POSITION, String.valueOf((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? null : Integer.valueOf(data.indexOf(operateItem))));
        String title = operateItem.getTitle();
        if (title == null) {
            title = "";
        }
        map.put(CampaignEx.JSON_KEY_TITLE, title);
        map.put("tabId", String.valueOf(this.f52090e));
        AbstractC25888b.m101678a(operateItem, map);
        C24662i.f75350a.m96881p(SubTabFragment.INSTANCE.m68282a(this.f52090e), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final void m66885K(RecyclerView recyclerView, int i11) {
        RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
        View viewFindViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(i11) : null;
        if (viewFindViewByPosition == null) {
            recyclerView.scrollToPosition(i11);
        } else {
            recyclerView.scrollBy(viewFindViewByPosition.getLeft() - ((recyclerView.getWidth() / 2) - (viewFindViewByPosition.getWidth() / 2)), 0);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final OperateItem item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        this.f52091f = item;
        helper.setText(R$id.sub_operation_ranklist_title_text, item.getTitle());
        helper.getView(R$id.sub_operation_ranklist_title_linear).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.operateUGC.provider.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C14904w.m66879E(item, this, view);
            }
        });
        View view = helper.getView(R$id.sub_operation_ranklist_all);
        String deepLink = item.getDeepLink();
        view.setVisibility((deepLink == null || deepLink.length() == 0) ? 4 : 0);
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.sub_operation_ranklist_recycler);
        RecyclerView recyclerView2 = (RecyclerView) helper.getView(R$id.sub_operation_ranklist_title_tab_recycler);
        m66880F(recyclerView, recyclerView2, item);
        m66881G(recyclerView2, recyclerView, item);
        m66883I(item);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.UGC_RANKING_LIST.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_sub_operation_rank_list;
    }
}
