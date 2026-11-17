package com.transsion.home.adapter.operateUGC.provider;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.tmc.integration.constants.IntegrationConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.operateUGC.adapter.UGCOptFeedsListAdapter;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.moviedetailapi.bean.PostItemType;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ml.AbstractC25888b;
import ng.AbstractC26006c;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.provider.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14883f0 extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final int f52037e;

    public C14883f0(int i11) {
        this.f52037e = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final void m66824B(C14883f0 c14883f0, OperateItem operateItem, View view) {
        c14883f0.m66826D(operateItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m66825C(C14883f0 c14883f0, OperateItem operateItem, View view) {
        c14883f0.m66826D(operateItem);
    }

    /* JADX INFO: renamed from: D */
    private final void m66826D(OperateItem operateItem) {
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
        map.put("module_name", IntegrationConstants.NAVIGATION_BAR_ALL_ACTION);
        map.put(RequestParameters.POSITION, String.valueOf(numValueOf));
        String title = operateItem.getTitle();
        if (title == null) {
            title = "";
        }
        map.put(CampaignEx.JSON_KEY_TITLE, title);
        map.put("tabId", String.valueOf(this.f52037e));
        AbstractC25888b.m101678a(operateItem, map);
        C24662i.f75350a.m96881p(SubTabFragment.INSTANCE.m68282a(this.f52037e), map);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final OperateItem item) {
        List<Object> data;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        TextView textView = (TextView) helper.getView(R$id.provider_ugc_common_title);
        textView.setText(item.getTitle());
        TextView textView2 = (TextView) helper.getView(R$id.provider_ugc_common_more_text);
        String deepLink = item.getDeepLink();
        if (deepLink == null || deepLink.length() == 0) {
            AbstractC26006c.m102055h(textView2);
        } else {
            AbstractC26006c.m102058k(textView2);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.operateUGC.provider.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C14883f0.m66824B(this.f52031a, item, view);
                }
            });
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.operateUGC.provider.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C14883f0.m66825C(this.f52034a, item, view);
                }
            });
        }
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.provider_ugc_common_recycler);
        UGCOptFeedsListAdapter uGCOptFeedsListAdapter = new UGCOptFeedsListAdapter(item, this.f52037e);
        recyclerView.setAdapter(uGCOptFeedsListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(m36338k(), 1, false));
        recyclerView.setNestedScrollingEnabled(false);
        uGCOptFeedsListAdapter.mo36201n1(item.getContentList());
        HashMap map = new HashMap();
        map.put("module_name", IntegrationConstants.NAVIGATION_BAR_ALL_ACTION);
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        map.put(RequestParameters.POSITION, String.valueOf((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? null : Integer.valueOf(data.indexOf(item))));
        String title = item.getTitle();
        if (title == null) {
            title = "";
        }
        map.put(CampaignEx.JSON_KEY_TITLE, title);
        map.put("tabId", String.valueOf(this.f52037e));
        AbstractC25888b.m101678a(item, map);
        C24662i.f75350a.m96872D(SubTabFragment.INSTANCE.m68282a(this.f52037e), map);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.UGC_VERTICAL_OPT_LIST.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.provider_ugc_op_common;
    }
}
