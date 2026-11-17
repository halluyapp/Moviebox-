package com.transsion.home.adapter.suboperate.provider;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.suboperate.adapter.SubFilterAdapter;
import com.transsion.home.bean.FilterItem;
import com.transsion.home.bean.OperateItem;
import com.transsion.moviedetailapi.bean.PostItemType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mg.C25829f;
import ng.AbstractC26006c;

/* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.provider.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C14995w extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final Integer f52399e;

    /* JADX INFO: renamed from: f */
    private final boolean f52400f;

    /* JADX INFO: renamed from: g */
    private final Lazy f52401g = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.adapter.suboperate.provider.v
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C14995w.m67177A();
        }
    });

    /* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.provider.w$a */
    public static final class a extends RecyclerView.C4220s {
        a() {
            m20854m(0, 4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.C4220s
        /* JADX INFO: renamed from: k */
        public void mo20852k(RecyclerView.AbstractC4203b0 abstractC4203b0) {
            super.mo20852k(abstractC4203b0);
        }
    }

    public C14995w(Integer num, boolean z11) {
        this.f52399e = num;
        this.f52400f = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final a m67177A() {
        return new a();
    }

    /* JADX INFO: renamed from: B */
    private final a m67178B() {
        return (a) this.f52401g.getValue();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.FILTER.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_sub_operation_filter;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, OperateItem item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        List<FilterItem> filters = item.getFilters();
        if (filters == null) {
            filters = new ArrayList<>();
        }
        if (filters.isEmpty()) {
            View itemView = helper.itemView;
            Intrinsics.m97801g(itemView, "itemView");
            AbstractC26006c.m102054g(itemView);
            return;
        }
        View itemView2 = helper.itemView;
        Intrinsics.m97801g(itemView2, "itemView");
        AbstractC26006c.m102058k(itemView2);
        TextView textView = (TextView) helper.getView(R$id.sub_operation_filter_title);
        String title = item.getTitle();
        if (title == null || title.length() == 0) {
            AbstractC26006c.m102054g(textView);
        } else {
            textView.setText(item.getTitle());
            AbstractC26006c.m102058k(textView);
        }
        RecyclerView recyclerView = (RecyclerView) helper.itemView.findViewById(R$id.sub_operation_filter_recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m36338k(), 0, false);
        linearLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C25829f(8.0f, 0.0f, 12.0f, 2, null));
        }
        if (!Intrinsics.m97797c(recyclerView.getRecycledViewPool(), m67178B())) {
            recyclerView.setRecycledViewPool(m67178B());
        }
        SubFilterAdapter subFilterAdapter = new SubFilterAdapter(0, this.f52399e, item, this.f52400f, 1, null);
        subFilterAdapter.mo36201n1(filters);
        recyclerView.setAdapter(subFilterAdapter);
    }
}
