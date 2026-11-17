package com.transsion.home.p294tv.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.transsion.base.report.athena.BrowseType;
import com.transsion.base.report.athena.ClickType;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.BannerData;
import com.transsion.home.bean.CustomData;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.p294tv.fragment.TVChannelHomeFragment;
import com.transsion.moviedetailapi.bean.PostItemType;
import fk.AbstractC23384a;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import mg.C25824a;
import ml.AbstractC25888b;
import p550kj.C24662i;
import p765s6.InterfaceC27566d;

/* JADX INFO: renamed from: com.transsion.home.tv.adapter.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C15457n extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final int f53438e;

    public C15457n(int i11) {
        this.f53438e = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m68599A(OperateItem operateItem, C15457n c15457n, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List<BannerData> items;
        BannerData bannerData;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        CustomData customData = operateItem.getCustomData();
        if (customData == null || (items = customData.getItems()) == null || (bannerData = (BannerData) CollectionsKt.m97362l0(items, i11)) == null) {
            return;
        }
        c15457n.m68602D(bannerData, operateItem.getOpId());
        c15457n.m68601C(bannerData, i11, operateItem);
    }

    /* JADX INFO: renamed from: B */
    private final void m68600B(OperateItem operateItem) {
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
        map.put("tabId", String.valueOf(this.f53438e));
        if (operateItem != null) {
            AbstractC25888b.m101679b(operateItem, map);
        }
        C24662i.f75350a.m96873E(TVChannelHomeFragment.INSTANCE.m68665a(this.f53438e), map, BrowseType.CONTENT);
    }

    /* JADX INFO: renamed from: C */
    private final void m68601C(BannerData bannerData, int i11, OperateItem operateItem) {
        String deepLink;
        HashMap map = new HashMap();
        map.put("event_type", "click_custom_item");
        map.put(RequestParameters.POSITION, String.valueOf(i11));
        CustomData customData = operateItem.getCustomData();
        map.put("rowCount", String.valueOf(customData != null ? Integer.valueOf(customData.getRowCount()) : null));
        map.put("tabId", String.valueOf(this.f53438e));
        if (bannerData == null || (deepLink = bannerData.getDeepLink()) == null) {
            deepLink = "";
        }
        map.put("content_id", deepLink);
        if (bannerData != null) {
            AbstractC25888b.m101684g(bannerData, map);
        }
        AbstractC25888b.m101679b(operateItem, map);
        C24662i.f75350a.m96882q(TVChannelHomeFragment.INSTANCE.m68665a(this.f53438e), map, ClickType.CONTENT);
    }

    /* JADX INFO: renamed from: D */
    private final void m68602D(BannerData bannerData, String str) {
        String deepLink = bannerData.getDeepLink();
        if (deepLink != null) {
            AbstractC5114k.m23924g(deepLink, "&module_name=opt_custom&from_opt_id=" + str + "&ops=" + bannerData.getOps() + "&tab_id=" + this.f53438e);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.MULTILINE_SUBJECTS_LIST.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_tv_multiline_subjects;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final OperateItem item) {
        Integer showLine;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        int i11 = R$id.tvMultilineTitle;
        String title = item.getTitle();
        if (title == null) {
            title = "";
        }
        helper.setText(i11, title);
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.tvMultilineRecycler);
        CustomData customData = item.getCustomData();
        int iE = RangesKt.m97935e((customData == null || (showLine = customData.getShowLine()) == null) ? 1 : showLine.intValue(), 1);
        TvMultilineSubjectsCardAdapter tvMultilineSubjectsCardAdapter = new TvMultilineSubjectsCardAdapter(item, this.f53438e);
        recyclerView.setAdapter(tvMultilineSubjectsCardAdapter);
        NpaGridLayoutManager npaGridLayoutManager = new NpaGridLayoutManager(m36338k(), iE, 0, false);
        npaGridLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(npaGridLayoutManager);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C25824a(AbstractC23384a.m92908b(8), AbstractC23384a.m92908b(8), AbstractC23384a.m92908b(12), AbstractC23384a.m92908b(12)));
        }
        CustomData customData2 = item.getCustomData();
        List<BannerData> items = customData2 != null ? customData2.getItems() : null;
        if (items == null) {
            items = CollectionsKt.m97506l();
        }
        tvMultilineSubjectsCardAdapter.mo36201n1(items);
        tvMultilineSubjectsCardAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.home.tv.adapter.m
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i12) {
                C15457n.m68599A(item, this, baseQuickAdapter, view, i12);
            }
        });
        m68600B(item);
    }
}
