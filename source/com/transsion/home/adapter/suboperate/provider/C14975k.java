package com.transsion.home.adapter.suboperate.provider;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import ck.C5110g;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.tmc.integration.constants.IntegrationConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baselib.helper.C14450a;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.suboperate.adapter.SubCustomAdapter;
import com.transsion.home.bean.BannerData;
import com.transsion.home.bean.CustomData;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.moviedetailapi.bean.PostItemType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import mg.C25829f;
import ml.AbstractC25888b;
import p550kj.C24662i;
import p579ll.C25648d;
import p765s6.InterfaceC27566d;

/* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.provider.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C14975k extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final int f52365e;

    /* JADX INFO: renamed from: f */
    private final boolean f52366f;

    public C14975k(int i11, boolean z11) {
        this.f52365e = i11;
        this.f52366f = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m67154A(OperateItem operateItem, C14975k c14975k, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List<BannerData> items;
        BannerData bannerData;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        CustomData customData = operateItem.getCustomData();
        if (customData == null || (items = customData.getItems()) == null || (bannerData = items.get(i11)) == null) {
            return;
        }
        c14975k.m67157D(bannerData, operateItem.getOpId());
        c14975k.m67156C(bannerData, i11, operateItem);
    }

    /* JADX INFO: renamed from: B */
    private final void m67155B(OperateItem operateItem) {
        String title;
        String opId;
        String title2;
        List<Object> data;
        String str = "";
        if (C5110g.f17601a.m23911b()) {
            HashMap map = new HashMap();
            map.put("module_name", IntegrationConstants.NAVIGATION_BAR_ALL_ACTION);
            BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
            map.put(RequestParameters.POSITION, String.valueOf((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? null : Integer.valueOf(CollectionsKt.m97364n0(data, operateItem))));
            if (operateItem != null && (title2 = operateItem.getTitle()) != null) {
                str = title2;
            }
            map.put(CampaignEx.JSON_KEY_TITLE, str);
            map.put("tabId", String.valueOf(this.f52365e));
            if (operateItem != null) {
                AbstractC25888b.m101678a(operateItem, map);
            }
            C24662i.f75350a.m96872D(SubTabFragment.INSTANCE.m68282a(this.f52365e), map);
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("event_type", "browse_custom");
        if (operateItem == null || (title = operateItem.getTitle()) == null) {
            title = "";
        }
        map2.put(CampaignEx.JSON_KEY_TITLE, title);
        if (operateItem != null && (opId = operateItem.getOpId()) != null) {
            str = opId;
        }
        map2.put("opId", str);
        map2.put("tabId", String.valueOf(this.f52365e));
        if (operateItem != null) {
            AbstractC25888b.m101678a(operateItem, map2);
        }
        C14450a.f50860a.m65142e(SubTabFragment.INSTANCE.m68282a(this.f52365e), map2);
    }

    /* JADX INFO: renamed from: C */
    private final void m67156C(BannerData bannerData, int i11, OperateItem operateItem) {
        if (C5110g.f17601a.m23911b()) {
            C25648d.f77807c.m100953b(this.f52365e, i11, operateItem, bannerData);
            return;
        }
        HashMap map = new HashMap();
        map.put("event_type", "click_custom_item");
        map.put("sequence", String.valueOf(i11));
        CustomData customData = operateItem.getCustomData();
        map.put("rowCount", String.valueOf(customData != null ? Integer.valueOf(customData.getRowCount()) : null));
        map.put("tabId", String.valueOf(this.f52365e));
        if (bannerData != null) {
            AbstractC25888b.m101680c(bannerData, map);
        }
        AbstractC25888b.m101678a(operateItem, map);
        C14450a.f50860a.m65143f(SubTabFragment.INSTANCE.m68282a(this.f52365e), map);
    }

    /* JADX INFO: renamed from: D */
    private final void m67157D(BannerData bannerData, String str) {
        String deepLink = bannerData.getDeepLink();
        if (deepLink != null) {
            AbstractC5114k.m23924g(deepLink, "&module_name=opt_custom&from_opt_id=" + str + "&ops=" + bannerData.getOps() + "&tab_id=" + this.f52365e);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.CUSTOM_DATA.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_sub_operation_variable;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final OperateItem item) {
        List<BannerData> items;
        List<BannerData> items2;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        ((TextView) helper.getView(R$id.sub_operation_variable_title)).setText(item.getTitle());
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.sub_operation_variable_recycle);
        CustomData customData = item.getCustomData();
        CustomData customData2 = item.getCustomData();
        SubCustomAdapter subCustomAdapter = new SubCustomAdapter(0, item, customData, (customData2 == null || (items2 = customData2.getItems()) == null) ? null : items2.get(0), this.f52365e, this.f52366f, 1, null);
        recyclerView.setAdapter(subCustomAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m36338k(), 0, false);
        linearLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C25829f(8.0f, 0.0f, 12.0f, 2, null));
        }
        CustomData customData3 = item.getCustomData();
        subCustomAdapter.mo36201n1((customData3 == null || (items = customData3.getItems()) == null) ? new ArrayList<>() : items);
        subCustomAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.home.adapter.suboperate.provider.j
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                C14975k.m67154A(item, this, baseQuickAdapter, view, i11);
            }
        });
        m67155B(item);
    }
}
