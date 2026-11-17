package com.transsion.home.adapter.suboperate.provider;

import android.view.View;
import androidx.recyclerview.widget.C4247n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.suboperate.adapter.C14941q;
import com.transsion.home.adapter.suboperate.adapter.C14942r;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.bean.RankingListData;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.moviedetailapi.bean.PostItemType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25204t1;
import mg.C25829f;
import p765s6.InterfaceC27566d;

/* JADX INFO: loaded from: classes5.dex */
public final class SubRankListProvider extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final int f52291e;

    /* JADX INFO: renamed from: f */
    private InterfaceC25204t1 f52292f;

    /* JADX INFO: renamed from: g */
    private OperateItem f52293g;

    /* JADX INFO: renamed from: h */
    private C14941q f52294h;

    /* JADX INFO: renamed from: i */
    private C14942r f52295i;

    /* JADX INFO: renamed from: j */
    private int f52296j;

    /* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.provider.SubRankListProvider$a */
    public static final class C14951a extends RecyclerView.AbstractC4219r {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C4247n f52297a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SubRankListProvider f52298b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ RecyclerView f52299c;

        C14951a(C4247n c4247n, SubRankListProvider subRankListProvider, RecyclerView recyclerView) {
            this.f52297a = c4247n;
            this.f52298b = subRankListProvider;
            this.f52299c = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            View viewFindSnapView;
            List<Object> data;
            Intrinsics.m97802h(recyclerView, "recyclerView");
            if (i11 != 0 || (viewFindSnapView = this.f52297a.findSnapView(recyclerView.getLayoutManager())) == null) {
                return;
            }
            RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
            int position = layoutManager != null ? layoutManager.getPosition(viewFindSnapView) : 0;
            C14942r c14942r = this.f52298b.f52295i;
            if (c14942r != null) {
                c14942r.m66992C1(position);
            }
            this.f52298b.f52296j = position;
            if (position != 0) {
                C14942r c14942r2 = this.f52298b.f52295i;
                if (position != ((c14942r2 == null || (data = c14942r2.getData()) == null) ? -1 : data.size()) - 1) {
                    this.f52298b.m67082L(this.f52299c, position);
                    return;
                }
            }
            this.f52299c.scrollToPosition(position);
        }
    }

    public SubRankListProvider(int i11) {
        this.f52291e = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final void m67077G(OperateItem operateItem, View view) {
        String deepLink = operateItem.getDeepLink();
        if (deepLink != null) {
            AbstractC5114k.m23925h(deepLink, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: H */
    private final void m67078H(RecyclerView recyclerView, RecyclerView recyclerView2, OperateItem operateItem) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m36338k(), 0, false);
        linearLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C25829f(8.0f, 0.0f, 12.0f, 2, null));
        }
        C14941q c14941q = new C14941q(0, operateItem, this.f52291e, 1, null);
        this.f52294h = c14941q;
        RankingListData rankingListData = operateItem.getRankingListData();
        c14941q.mo36201n1(rankingListData != null ? rankingListData.getItems() : null);
        recyclerView.setAdapter(this.f52294h);
        recyclerView.scrollToPosition(this.f52296j);
        recyclerView.setOnFlingListener(null);
        C4247n c4247n = new C4247n();
        c4247n.attachToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(new C14951a(c4247n, this, recyclerView2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    private final void m67079I(final RecyclerView recyclerView, final RecyclerView recyclerView2, OperateItem operateItem) {
        int i11 = 0;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m36338k(), 0, false);
        int i12 = 1;
        linearLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C25829f(8.0f, 0.0f, 12.0f, 2, null));
        }
        C14942r c14942r = new C14942r(i11, i12, 0 == true ? 1 : 0);
        this.f52295i = c14942r;
        c14942r.m66992C1(this.f52296j);
        C14942r c14942r2 = this.f52295i;
        if (c14942r2 != null) {
            RankingListData rankingListData = operateItem.getRankingListData();
            c14942r2.mo36201n1(rankingListData != null ? rankingListData.getItems() : null);
        }
        C14942r c14942r3 = this.f52295i;
        if (c14942r3 != null) {
            c14942r3.m36227w1(new InterfaceC27566d() { // from class: com.transsion.home.adapter.suboperate.provider.m0
                @Override // p765s6.InterfaceC27566d
                /* JADX INFO: renamed from: a */
                public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i13) {
                    SubRankListProvider.m67080J(this.f52374a, recyclerView2, recyclerView, baseQuickAdapter, view, i13);
                }
            });
        }
        recyclerView.setAdapter(this.f52295i);
        recyclerView.scrollToPosition(this.f52296j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX INFO: renamed from: J */
    public static final void m67080J(SubRankListProvider subRankListProvider, RecyclerView recyclerView, RecyclerView recyclerView2, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List<Object> data;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        subRankListProvider.f52296j = i11;
        if (i11 == 0) {
            recyclerView.scrollToPosition(i11);
        } else {
            C14941q c14941q = subRankListProvider.f52294h;
            if (i11 == ((c14941q == null || (data = c14941q.getData()) == null) ? -1 : data.size()) - 1) {
                recyclerView.scrollToPosition(i11);
            } else {
                subRankListProvider.m67082L(recyclerView, i11);
            }
        }
        C14942r c14942r = subRankListProvider.f52295i;
        if (c14942r != null) {
            c14942r.m66992C1(subRankListProvider.f52296j);
        }
        recyclerView2.scrollToPosition(i11);
    }

    /* JADX INFO: renamed from: K */
    private final void m67081K() {
        if (HomeTabId.INSTANCE.m67539h(Integer.valueOf(this.f52291e), true)) {
            this.f52292f = AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new SubRankListProvider$registerCourse$1(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public final void m67082L(RecyclerView recyclerView, int i11) {
        RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
        View viewFindViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(i11) : null;
        if (viewFindViewByPosition == null) {
            recyclerView.scrollToPosition(i11);
        } else {
            recyclerView.scrollBy(viewFindViewByPosition.getLeft() - ((recyclerView.getWidth() / 2) - (viewFindViewByPosition.getWidth() / 2)), 0);
        }
    }

    /* JADX INFO: renamed from: M */
    private final void m67083M() {
        InterfaceC25204t1 interfaceC25204t1 = this.f52292f;
        if (interfaceC25204t1 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
        }
        this.f52292f = null;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final OperateItem item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        this.f52293g = item;
        helper.setText(R$id.sub_operation_ranklist_title_text, item.getTitle());
        helper.getView(R$id.sub_operation_ranklist_title_linear).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.suboperate.provider.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubRankListProvider.m67077G(item, view);
            }
        });
        View view = helper.getView(R$id.sub_operation_ranklist_all);
        String deepLink = item.getDeepLink();
        view.setVisibility((deepLink == null || deepLink.length() == 0) ? 4 : 0);
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.sub_operation_ranklist_recycler);
        RecyclerView recyclerView2 = (RecyclerView) helper.getView(R$id.sub_operation_ranklist_title_tab_recycler);
        m67078H(recyclerView, recyclerView2, item);
        m67079I(recyclerView2, recyclerView, item);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.RANKING_LIST.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_sub_operation_rank_list;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: t */
    public void mo36344t(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.mo36344t(holder);
        m67081K();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: u */
    public void mo36345u(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.mo36345u(holder);
        m67083M();
    }
}
