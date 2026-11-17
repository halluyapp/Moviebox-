package com.transsion.home.adapter.operateUGC.provider;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.FilterItem;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import mg.C25825b;
import ml.AbstractC25888b;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.provider.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C14890j extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final Integer f52048e;

    /* JADX INFO: renamed from: f */
    private final boolean f52049f;

    /* JADX INFO: renamed from: g */
    private final Lazy f52050g = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.adapter.operateUGC.provider.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C14890j.m66830A();
        }
    });

    /* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.provider.j$a */
    @Metadata(m97099d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m97100d2 = {"Lcom/transsion/home/adapter/operateUGC/provider/j$a;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/home/bean/FilterItem;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "tabId", "Lcom/transsion/home/bean/OperateItem;", "operateItem", "<init>", "(Ljava/lang/Integer;Lcom/transsion/home/bean/OperateItem;)V", WebConstants.FIELD_ITEM, RequestParameters.POSITION, "", "F1", "(Lcom/transsion/home/bean/FilterItem;I)V", "E1", "holder", "C1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/home/bean/FilterItem;)V", "F", "Ljava/lang/Integer;", "G", "Lcom/transsion/home/bean/OperateItem;", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    public static final class a extends BaseQuickAdapter {

        /* JADX INFO: renamed from: H */
        public static final int f52051H = 8;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        private final Integer tabId;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        private final OperateItem operateItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num, OperateItem operateItem) {
            super(R$layout.item_ugc_education_filter, null, 2, null);
            Intrinsics.m97802h(operateItem, "operateItem");
            this.tabId = num;
            this.operateItem = operateItem;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: D1 */
        public static final void m66835D1(FilterItem filterItem, a aVar, BaseViewHolder baseViewHolder, View view) {
            String deepLink = filterItem.getDeepLink();
            if (deepLink != null) {
                AbstractC5114k.m23925h(deepLink, null, 1, null);
            }
            aVar.m66837F1(filterItem, baseViewHolder.getLayoutPosition());
        }

        /* JADX INFO: renamed from: E1 */
        private final void m66836E1(FilterItem item, int position) {
            String title;
            HashMap map = new HashMap();
            map.put("module_name", WebConstants.FIELD_ITEM);
            if (item == null || (title = item.getTitle()) == null) {
                title = "";
            }
            map.put(CampaignEx.JSON_KEY_TITLE, title);
            map.put(RequestParameters.POSITION, String.valueOf(position));
            AbstractC25888b.m101678a(this.operateItem, map);
            C24662i c24662i = C24662i.f75350a;
            SubTabFragment.Companion companion = SubTabFragment.INSTANCE;
            Integer num = this.tabId;
            c24662i.m96872D(companion.m68282a(num != null ? num.intValue() : 1), map);
        }

        /* JADX INFO: renamed from: F1 */
        private final void m66837F1(FilterItem item, int position) {
            String title;
            HashMap map = new HashMap();
            map.put("module_name", WebConstants.FIELD_ITEM);
            if (item == null || (title = item.getTitle()) == null) {
                title = "";
            }
            map.put(CampaignEx.JSON_KEY_TITLE, title);
            map.put(RequestParameters.POSITION, String.valueOf(position));
            AbstractC25888b.m101678a(this.operateItem, map);
            C24662i c24662i = C24662i.f75350a;
            SubTabFragment.Companion companion = SubTabFragment.INSTANCE;
            Integer num = this.tabId;
            c24662i.m96881p(companion.m68282a(num != null ? num.intValue() : 1), map);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
        public void mo36106F(final BaseViewHolder holder, final FilterItem item) {
            String url;
            String thumbnail;
            Intrinsics.m97802h(holder, "holder");
            Intrinsics.m97802h(item, "item");
            holder.setText(R$id.tv_op_ugc_item_filter, item.getTitle());
            C23860f.b bVarM94457m = C23860f.f72909a.m94457m(getContext());
            Cover image = item.getImage();
            String str = "";
            if (image == null || (url = image.getUrl()) == null) {
                url = "";
            }
            C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
            Cover image2 = item.getImage();
            if (image2 != null && (thumbnail = image2.getThumbnail()) != null) {
                str = thumbnail;
            }
            bVarM94468g.m94473l(str).m94474m(AbstractC5776a0.m27313a(32.0f)).m94465d((ImageView) holder.getView(R$id.iv_op_ugc_item_filter));
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.operateUGC.provider.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C14890j.a.m66835D1(item, this, holder, view);
                }
            });
            m66836E1(item, holder.getLayoutPosition());
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.provider.j$b */
    public static final class b extends RecyclerView.C4220s {
        b() {
            m20854m(0, 4);
        }
    }

    public C14890j(Integer num, boolean z11) {
        this.f52048e = num;
        this.f52049f = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final b m66830A() {
        return new b();
    }

    /* JADX INFO: renamed from: B */
    private final b m66831B() {
        return (b) this.f52050g.getValue();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.UGC_FILTER.ordinal();
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
        String string = title != null ? StringsKt.m98155n1(title).toString() : null;
        if (string == null || string.length() == 0) {
            AbstractC26006c.m102054g(textView);
        } else {
            textView.setText(item.getTitle());
            AbstractC26006c.m102058k(textView);
        }
        RecyclerView recyclerView = (RecyclerView) helper.itemView.findViewById(R$id.sub_operation_filter_recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(m36338k(), 5));
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C25825b(AbstractC5776a0.m27313a(12.0f), AbstractC5776a0.m27313a(4.0f), AbstractC5776a0.m27313a(8.0f), AbstractC5776a0.m27313a(8.0f)));
        }
        if (!Intrinsics.m97797c(recyclerView.getRecycledViewPool(), m66831B())) {
            recyclerView.setRecycledViewPool(m66831B());
        }
        a aVar = new a(this.f52048e, item);
        aVar.mo36201n1(filters);
        recyclerView.setAdapter(aVar);
    }
}
