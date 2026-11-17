package com.transsion.shorttv_pugc.p317ui.adapter.provider;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv_pugc.base.widget.C19263k;
import com.transsion.shorttv_pugc.bean.BannerData;
import com.transsion.shorttv_pugc.bean.CustomData;
import com.transsion.shorttv_pugc.bean.OperateItem;
import com.transsion.shorttv_pugc.bean.ShortTvItemType;
import com.transsion.shorttv_pugc.p317ui.adapter.ShortTvOpCustomAdapter;
import com.transsion.shorttv_pugc.utils.ShortTvExtKt;
import is.AbstractC24222c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p527jt.C24468a;
import p550kj.C24662i;
import p765s6.InterfaceC27566d;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.adapter.provider.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C19350m extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final String f62067e;

    /* JADX INFO: renamed from: f */
    private final boolean f62068f;

    /* JADX INFO: renamed from: g */
    private final Lazy f62069g;

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.adapter.provider.m$a */
    public static final class a extends RecyclerView.C4220s {
        a() {
            m20854m(0, 16);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.C4220s
        /* JADX INFO: renamed from: k */
        public void mo20852k(RecyclerView.AbstractC4203b0 abstractC4203b0) {
            super.mo20852k(abstractC4203b0);
        }
    }

    public C19350m(String pageName, boolean z11) {
        Intrinsics.m97802h(pageName, "pageName");
        this.f62067e = pageName;
        this.f62068f = z11;
        this.f62069g = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.ui.adapter.provider.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C19350m.m80886C();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final void m80885B(OperateItem operateItem, C19350m c19350m, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List<BannerData> items;
        BannerData bannerData;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        CustomData customData = operateItem.getCustomData();
        if (customData == null || (items = customData.getItems()) == null || (bannerData = items.get(i11)) == null) {
            return;
        }
        c19350m.m80890G(bannerData);
        c19350m.m80889F(bannerData, i11, operateItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final a m80886C() {
        return new a();
    }

    /* JADX INFO: renamed from: D */
    private final a m80887D() {
        return (a) this.f62069g.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final void m80888E(OperateItem operateItem) {
        String title;
        String opId;
        HashMap map = new HashMap();
        map.put("event_type", "browse_custom");
        String str = "";
        if (operateItem == null || (title = operateItem.getTitle()) == null) {
            title = "";
        }
        map.put(CampaignEx.JSON_KEY_TITLE, title);
        if (operateItem != null && (opId = operateItem.getOpId()) != null) {
            str = opId;
        }
        map.put("opId", str);
        if (operateItem != null) {
            ShortTvExtKt.m81298a(operateItem, map);
        }
        C24662i.f75350a.m96872D(this.f62067e, map);
    }

    /* JADX INFO: renamed from: F */
    private final void m80889F(BannerData bannerData, int i11, OperateItem operateItem) {
        HashMap map = new HashMap();
        map.put("event_type", "click_custom_item");
        map.put("sequence", String.valueOf(i11));
        CustomData customData = operateItem.getCustomData();
        map.put("rowCount", String.valueOf(customData != null ? Integer.valueOf(customData.getRowCount()) : null));
        if (bannerData != null) {
            ShortTvExtKt.m81299b(bannerData, map);
        }
        ShortTvExtKt.m81298a(operateItem, map);
        C24662i.f75350a.m96881p(this.f62067e, map);
    }

    /* JADX INFO: renamed from: G */
    private final void m80890G(BannerData bannerData) {
        String deepLink = bannerData.getDeepLink();
        if (deepLink != null) {
            Uri uriM96009a = C24468a.f74627a.m96009a(Uri.parse(deepLink + "&module_name=opt_custom&ops=" + bannerData.getOps()));
            if (uriM96009a != null) {
                AbstractC24222c.m95245j(uriM96009a);
            }
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final OperateItem item) {
        List<BannerData> items;
        List<BannerData> items2;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        ((TextView) helper.getView(R$id.sub_operation_variable_title)).setText(item.getTitle());
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.sub_operation_variable_recycle);
        String str = this.f62067e;
        CustomData customData = item.getCustomData();
        CustomData customData2 = item.getCustomData();
        ShortTvOpCustomAdapter shortTvOpCustomAdapter = new ShortTvOpCustomAdapter(0, str, customData, (customData2 == null || (items2 = customData2.getItems()) == null) ? null : items2.get(0), this.f62068f, 1, null);
        recyclerView.setAdapter(shortTvOpCustomAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(m36338k(), 0, false));
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C19263k(8.0f, 0.0f, 12.0f, 2, null));
        }
        if (!Intrinsics.m97797c(recyclerView.getRecycledViewPool(), m80887D())) {
            recyclerView.setRecycledViewPool(m80887D());
        }
        CustomData customData3 = item.getCustomData();
        shortTvOpCustomAdapter.mo36201n1((customData3 == null || (items = customData3.getItems()) == null) ? new ArrayList<>() : items);
        shortTvOpCustomAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.shorttv_pugc.ui.adapter.provider.k
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                C19350m.m80885B(item, this, baseQuickAdapter, view, i11);
            }
        });
        m80888E(item);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return ShortTvItemType.CUSTOM_DATA.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.pugc_short_tv_op_custom;
    }
}
