package com.transsion.home.adapter.trending.provider;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.baselib.helper.C14450a;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.trending.adapter.SportLiveAdapter;
import com.transsion.home.bean.LiveListItem;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.moviedetailapi.bean.PostItemType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mg.C25829f;
import ml.AbstractC25888b;
import ng.AbstractC26006c;
import p765s6.InterfaceC27566d;

/* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15035e0 extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final int f52532e;

    /* JADX INFO: renamed from: f */
    private final boolean f52533f;

    /* JADX INFO: renamed from: g */
    private final Lazy f52534g = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.adapter.trending.provider.d0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C15035e0.m67296I();
        }
    });

    /* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.e0$a */
    public static final class a extends DiffUtil.AbstractC4174e {
        a() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(LiveListItem oldItem, LiveListItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getMatchId(), newItem.getMatchId()) && Intrinsics.m97797c(oldItem.getStatus(), newItem.getStatus());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(LiveListItem oldItem, LiveListItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getMatchId(), newItem.getMatchId());
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.e0$b */
    public static final class b extends RecyclerView.C4220s {
        b() {
            m20854m(0, 8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.C4220s
        /* JADX INFO: renamed from: k */
        public void mo20852k(RecyclerView.AbstractC4203b0 abstractC4203b0) {
            super.mo20852k(abstractC4203b0);
        }
    }

    public C15035e0(int i11, boolean z11) {
        this.f52532e = i11;
        this.f52533f = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m67292E(C15035e0 c15035e0, OperateItem operateItem, View view) {
        c15035e0.m67299L(operateItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m67293F(C15035e0 c15035e0, OperateItem operateItem, View view) {
        c15035e0.m67299L(operateItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final void m67294G(SportLiveAdapter sportLiveAdapter, List list) {
        sportLiveAdapter.mo36201n1(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m67295H(List list, C15035e0 c15035e0, OperateItem operateItem, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        LiveListItem liveListItem;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        if (list == null || (liveListItem = (LiveListItem) list.get(i11)) == null) {
            return;
        }
        c15035e0.m67298K(liveListItem, operateItem, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final b m67296I() {
        return new b();
    }

    /* JADX INFO: renamed from: J */
    private final b m67297J() {
        return (b) this.f52534g.getValue();
    }

    /* JADX INFO: renamed from: K */
    private final void m67298K(LiveListItem liveListItem, OperateItem operateItem, int i11) {
        String deepLink = liveListItem.getDeepLink();
        if (deepLink != null) {
            AbstractC5114k.m23925h(deepLink, null, 1, null);
        }
        HashMap map = new HashMap();
        map.put("event_type", "click_sport_live_item");
        map.put("sequence", String.valueOf(i11));
        map.put("tabId", String.valueOf(this.f52532e));
        AbstractC25888b.m101678a(operateItem, map);
        String type = operateItem.getType();
        if (type == null) {
            type = "";
        }
        map.put("opt_type", type);
        String matchId = liveListItem.getMatchId();
        if (matchId == null) {
            matchId = "";
        }
        map.put("match_id", matchId);
        String status = liveListItem.getStatus();
        if (status == null) {
            status = "";
        }
        map.put("match_status", status);
        String ops = liveListItem.getOps();
        map.put("ops", ops != null ? ops : "");
        C14450a.f50860a.m65143f(SubTabFragment.INSTANCE.m68282a(this.f52532e), map);
    }

    /* JADX INFO: renamed from: L */
    private final void m67299L(OperateItem operateItem) {
        List<Object> data;
        String deepLink = operateItem.getDeepLink();
        Integer numValueOf = null;
        if (deepLink != null) {
            AbstractC5114k.m23925h(deepLink, null, 1, null);
        }
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        if (baseProviderMultiAdapterM36335g != null && (data = baseProviderMultiAdapterM36335g.getData()) != null) {
            numValueOf = Integer.valueOf(data.indexOf(operateItem));
        }
        HashMap map = new HashMap();
        map.put("event_type", "click_sport_live_more");
        map.put("sequence", String.valueOf(numValueOf));
        String deepLink2 = operateItem.getDeepLink();
        if (deepLink2 == null) {
            deepLink2 = "";
        }
        map.put("deepLink", deepLink2);
        map.put("tabId", String.valueOf(this.f52532e));
        AbstractC25888b.m101678a(operateItem, map);
        map.put("opt_type", operateItem.getType() + "_MORE");
        C14450a.f50860a.m65143f(SubTabFragment.INSTANCE.m68282a(this.f52532e), map);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final OperateItem item) {
        final ArrayList arrayList;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        TextView textView = (TextView) helper.getView(R$id.main_operation_sport_live_title);
        textView.setText(item.getTitle());
        TextView textView2 = (TextView) helper.getView(R$id.main_operation_sport_more_text);
        String deepLink = item.getDeepLink();
        if (deepLink == null || deepLink.length() == 0) {
            AbstractC26006c.m102055h(textView2);
        } else {
            AbstractC26006c.m102058k(textView2);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.trending.provider.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C15035e0.m67292E(this.f52609a, item, view);
                }
            });
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.trending.provider.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C15035e0.m67293F(this.f52499a, item, view);
                }
            });
        }
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.main_operation_sport_live_recycler);
        final SportLiveAdapter sportLiveAdapter = new SportLiveAdapter(0, item, this.f52532e, this.f52533f, 1, null);
        sportLiveAdapter.m36158R0(new a());
        recyclerView.setAdapter(sportLiveAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m36338k(), 0, false);
        linearLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C25829f(8.0f, 0.0f, 12.0f, 2, null));
        }
        if (!Intrinsics.m97797c(recyclerView.getRecycledViewPool(), m67297J())) {
            recyclerView.setRecycledViewPool(m67297J());
        }
        List<LiveListItem> liveList = item.getLiveList();
        if (liveList != null) {
            arrayList = new ArrayList();
            for (Object obj : liveList) {
                if (!Intrinsics.m97797c(((LiveListItem) obj).getStatus(), SportLiveAdapter.f52431P)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        recyclerView.post(new Runnable() { // from class: com.transsion.home.adapter.trending.provider.b0
            @Override // java.lang.Runnable
            public final void run() {
                C15035e0.m67294G(sportLiveAdapter, arrayList);
            }
        });
        sportLiveAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.home.adapter.trending.provider.c0
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                C15035e0.m67295H(arrayList, this, item, baseQuickAdapter, view, i11);
            }
        });
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.SPORT_LIVE.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.post_list_item_sport_live;
    }
}
