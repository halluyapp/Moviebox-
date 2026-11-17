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
import com.transsion.home.adapter.operateUGC.adapter.MovieRankUGCAdapter;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.moviedetailapi.bean.PostItemType;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mg.C25829f;
import ml.AbstractC25888b;
import ng.AbstractC26006c;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.provider.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C14897p extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final int f52067e;

    /* JADX INFO: renamed from: f */
    private final boolean f52068f;

    /* JADX INFO: renamed from: g */
    private final Lazy f52069g = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.adapter.operateUGC.provider.m
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C14897p.m66856E();
        }
    });

    /* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.provider.p$a */
    public static final class a extends RecyclerView.C4220s {
        a() {
            m20854m(0, 16);
        }
    }

    public C14897p(int i11, boolean z11) {
        this.f52067e = i11;
        this.f52068f = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m66854C(C14897p c14897p, OperateItem operateItem, View view) {
        c14897p.m66858G(operateItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m66855D(C14897p c14897p, OperateItem operateItem, View view) {
        c14897p.m66858G(operateItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final a m66856E() {
        return new a();
    }

    /* JADX INFO: renamed from: F */
    private final a m66857F() {
        return (a) this.f52069g.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final void m66858G(OperateItem operateItem) {
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
        map.put("tabId", String.valueOf(this.f52067e));
        AbstractC25888b.m101678a(operateItem, map);
        C24662i.f75350a.m96881p(SubTabFragment.INSTANCE.m68282a(this.f52067e), map);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
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
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.operateUGC.provider.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C14897p.m66854C(this.f52063a, item, view);
                }
            });
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.operateUGC.provider.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C14897p.m66855D(this.f52065a, item, view);
                }
            });
        }
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.provider_ugc_common_recycler);
        MovieRankUGCAdapter movieRankUGCAdapter = new MovieRankUGCAdapter(0, item, this.f52067e, this.f52068f, 1, null);
        recyclerView.setAdapter(movieRankUGCAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m36338k(), 0, false);
        linearLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        Intrinsics.m97797c(recyclerView.getRecycledViewPool(), m66857F());
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C25829f(8.0f, 0.0f, 12.0f, 2, null));
        }
        movieRankUGCAdapter.mo36201n1(item.getContentList());
        HashMap map = new HashMap();
        map.put("module_name", IntegrationConstants.NAVIGATION_BAR_ALL_ACTION);
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        map.put(RequestParameters.POSITION, String.valueOf((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? null : Integer.valueOf(data.indexOf(item))));
        String title = item.getTitle();
        if (title == null) {
            title = "";
        }
        map.put(CampaignEx.JSON_KEY_TITLE, title);
        map.put("tabId", String.valueOf(this.f52067e));
        AbstractC25888b.m101678a(item, map);
        C24662i.f75350a.m96872D(SubTabFragment.INSTANCE.m68282a(this.f52067e), map);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.UGC_MOVIE_RANK.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.provider_ugc_op_common;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: u */
    public void mo36345u(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.mo36345u(holder);
    }
}
