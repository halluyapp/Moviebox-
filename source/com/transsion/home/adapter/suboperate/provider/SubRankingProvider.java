package com.transsion.home.adapter.suboperate.provider;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.transsion.baselib.helper.C14450a;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.suboperate.adapter.C14944t;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.bean.RankingData;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.home.view.RankingAdapter;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.moviedetailapi.bean.Subject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25204t1;
import ml.AbstractC25888b;
import p765s6.InterfaceC27566d;
import p842vl.AbstractC28126h;

/* JADX INFO: loaded from: classes5.dex */
public final class SubRankingProvider extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final int f52301e;

    /* JADX INFO: renamed from: f */
    private InterfaceC25204t1 f52302f;

    /* JADX INFO: renamed from: g */
    private OperateItem f52303g;

    /* JADX INFO: renamed from: h */
    private BaseQuickAdapter f52304h;

    /* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.provider.SubRankingProvider$a */
    public static final class C14953a extends RecyclerView.AbstractC4213l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f52305a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f52306b;

        C14953a(int i11, int i12) {
            this.f52305a = i11;
            this.f52306b = i12;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(outRect, "outRect");
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            int i11 = this.f52305a;
            outRect.left = i11;
            outRect.right = i11;
            outRect.top = this.f52306b;
        }
    }

    public SubRankingProvider(int i11) {
        this.f52301e = i11;
    }

    /* JADX INFO: renamed from: D */
    private final void m67090D() {
        if (HomeTabId.INSTANCE.m67539h(Integer.valueOf(this.f52301e), true)) {
            this.f52302f = AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new SubRankingProvider$registerCourse$1(this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: E */
    private final void m67091E(Subject subject, int i11, OperateItem operateItem) {
        HashMap map = new HashMap();
        map.put("event_type", "browse_ranking");
        map.put("sequence", String.valueOf(i11));
        map.put("tabId", String.valueOf(this.f52301e));
        if (subject != null) {
            AbstractC25888b.m101682e(subject, map);
        }
        AbstractC25888b.m101678a(operateItem, map);
        C14450a.f50860a.m65138a(SubTabFragment.INSTANCE.m68282a(this.f52301e), map);
    }

    /* JADX INFO: renamed from: F */
    private final void m67092F(Subject subject, int i11, OperateItem operateItem) {
        HashMap map = new HashMap();
        map.put("event_type", "click_ranking");
        map.put("sequence", String.valueOf(i11));
        map.put("tabId", String.valueOf(this.f52301e));
        if (subject != null) {
            AbstractC25888b.m101682e(subject, map);
        }
        AbstractC25888b.m101678a(operateItem, map);
        C14450a.f50860a.m65143f(SubTabFragment.INSTANCE.m68282a(this.f52301e), map);
    }

    /* JADX INFO: renamed from: G */
    private final void m67093G(BaseQuickAdapter baseQuickAdapter, final OperateItem operateItem) {
        baseQuickAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.home.adapter.suboperate.provider.n0
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter2, View view, int i11) {
                SubRankingProvider.m67094H(operateItem, this, baseQuickAdapter2, view, i11);
            }
        });
        if (baseQuickAdapter instanceof C14944t) {
            ((C14944t) baseQuickAdapter).m66998F1(new Function2() { // from class: com.transsion.home.adapter.suboperate.provider.o0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SubRankingProvider.m67095I(this.f52384a, operateItem, ((Integer) obj).intValue(), (Subject) obj2);
                }
            });
        }
        this.f52304h = baseQuickAdapter;
        this.f52303g = operateItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m67094H(OperateItem operateItem, SubRankingProvider subRankingProvider, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        List<Subject> rankings = operateItem.getRankings();
        Subject subject = rankings != null ? rankings.get(i11) : null;
        AbstractC28126h.m109239f(subject, "op_ranking");
        subRankingProvider.m67092F(subject, i11, operateItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final Unit m67095I(SubRankingProvider subRankingProvider, OperateItem operateItem, int i11, Subject subject) {
        Intrinsics.m97802h(subject, "subject");
        subRankingProvider.m67091E(subject, i11, operateItem);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: J */
    private final void m67096J() {
        InterfaceC25204t1 interfaceC25204t1 = this.f52302f;
        if (interfaceC25204t1 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
        }
        this.f52302f = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, OperateItem item) {
        BaseQuickAdapter rankingAdapter;
        List arrayList;
        RankingData rankingData;
        Integer perRow;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        helper.setText(R$id.sub_operation_ranking_title, item.getTitle());
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.sub_operation_ranking_recycler);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C14953a(AbstractC5776a0.m27313a(4.0f), AbstractC5776a0.m27313a(12.0f)));
        }
        List<Subject> rankings = item.getRankings();
        int i11 = 0;
        int size = rankings != null ? rankings.size() : 0;
        int i12 = 1;
        ?? SubList = 0;
        if (!HomeTabId.INSTANCE.m67539h(Integer.valueOf(this.f52301e), true) || (rankingData = item.getRankingData()) == null || (perRow = rankingData.getPerRow()) == null || perRow.intValue() != 2) {
            recyclerView.setLayoutManager(new NpaGridLayoutManager(m36338k(), 3));
            List<Subject> rankings2 = item.getRankings();
            SubList = rankings2 != null ? rankings2.subList(0, size - (size % 3)) : 0;
            if (SubList == 0 || (arrayList = CollectionsKt.m97343U0((Collection) SubList)) == null) {
                arrayList = new ArrayList();
            }
            rankingAdapter = new RankingAdapter(arrayList);
        } else {
            recyclerView.setLayoutManager(new NpaGridLayoutManager(m36338k(), 2));
            rankingAdapter = new C14944t(i11, this.f52301e, i12, SubList);
            List<Subject> rankings3 = item.getRankings();
            rankingAdapter.mo36201n1(rankings3 != null ? rankings3.subList(0, size - (size % 2)) : null);
        }
        m67093G(rankingAdapter, item);
        recyclerView.setAdapter(rankingAdapter);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.OP_RANKING.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_sub_operation_ranking;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: t */
    public void mo36344t(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.mo36344t(holder);
        m67090D();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: u */
    public void mo36345u(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.mo36345u(holder);
        m67096J();
    }
}
