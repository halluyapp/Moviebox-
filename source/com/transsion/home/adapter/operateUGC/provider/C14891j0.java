package com.transsion.home.adapter.operateUGC.provider;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.tmc.integration.constants.IntegrationConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.operateUGC.adapter.VerticalContentUGCAdapter;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.ugcvideodetail.api.bean.UGCContent;
import fk.AbstractC23384a;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mg.C25824a;
import ml.AbstractC25888b;
import ng.AbstractC26006c;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.provider.j0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14891j0 extends BaseItemProvider {

    /* JADX INFO: renamed from: f */
    public static final a f52054f = new a(null);

    /* JADX INFO: renamed from: g */
    public static final int f52055g = 8;

    /* JADX INFO: renamed from: e */
    private final int f52056e;

    /* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.provider.j0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14891j0(int i11) {
        this.f52056e = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final Unit m66840C(OperateItem operateItem, C14891j0 c14891j0) {
        String deepLink = operateItem.getDeepLink();
        if (deepLink != null && deepLink.length() != 0) {
            c14891j0.m66844G(operateItem);
            String deepLink2 = operateItem.getDeepLink();
            if (deepLink2 != null) {
                AbstractC5114k.m23925h(deepLink2, null, 1, null);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m66841D(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m66842E(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: F */
    private final void m66843F(OperateItem operateItem) {
        List<Object> data;
        Pair pairM97108a = TuplesKt.m97108a("module_name", IntegrationConstants.NAVIGATION_BAR_ALL_ACTION);
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        Pair pairM97108a2 = TuplesKt.m97108a(RequestParameters.POSITION, String.valueOf((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? null : Integer.valueOf(data.indexOf(operateItem))));
        String title = operateItem.getTitle();
        if (title == null) {
            title = "";
        }
        Map mapM = MapsKt.m97578m(pairM97108a, pairM97108a2, TuplesKt.m97108a(CampaignEx.JSON_KEY_TITLE, title), TuplesKt.m97108a("tabId", String.valueOf(this.f52056e)));
        AbstractC25888b.m101678a(operateItem, mapM);
        C24662i.f75350a.m96872D(SubTabFragment.INSTANCE.m68282a(this.f52056e), mapM);
    }

    /* JADX INFO: renamed from: G */
    private final void m66844G(OperateItem operateItem) {
        List<Object> data;
        Pair pairM97108a = TuplesKt.m97108a("module_name", IntegrationConstants.NAVIGATION_BAR_ALL_ACTION);
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        Pair pairM97108a2 = TuplesKt.m97108a(RequestParameters.POSITION, String.valueOf((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? null : Integer.valueOf(data.indexOf(operateItem))));
        String title = operateItem.getTitle();
        if (title == null) {
            title = "";
        }
        Map mapM = MapsKt.m97578m(pairM97108a, pairM97108a2, TuplesKt.m97108a(CampaignEx.JSON_KEY_TITLE, title), TuplesKt.m97108a("tabId", String.valueOf(this.f52056e)));
        AbstractC25888b.m101678a(operateItem, mapM);
        C24662i.f75350a.m96881p(SubTabFragment.INSTANCE.m68282a(this.f52056e), mapM);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00af  */
    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final OperateItem item) {
        List listL;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        final Function0 function0 = new Function0() { // from class: com.transsion.home.adapter.operateUGC.provider.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C14891j0.m66840C(item, this);
            }
        };
        ((TextView) helper.getView(R$id.tvProviderVerticalTitle)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.operateUGC.provider.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C14891j0.m66841D(function0, view);
            }
        });
        TextView textView = (TextView) helper.getView(R$id.tvProviderVerticalMore);
        String deepLink = item.getDeepLink();
        if (deepLink == null || deepLink.length() == 0) {
            AbstractC26006c.m102054g(textView);
        } else {
            AbstractC26006c.m102058k(textView);
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.operateUGC.provider.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C14891j0.m66842E(function0, view);
            }
        });
        m66843F(item);
        String title = item.getTitle();
        if (title != null && title.length() != 0) {
            ((TextView) helper.getView(R$id.tvProviderVerticalTitle)).setText(item.getTitle());
        }
        VerticalContentUGCAdapter verticalContentUGCAdapter = new VerticalContentUGCAdapter(item, this.f52056e, 0, 4, null);
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.rvProviderVerticalPost);
        recyclerView.setLayoutManager(new NpaGridLayoutManager(recyclerView.getContext(), 3));
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C25824a(AbstractC23384a.m92908b(8), 0, 0, 0));
        }
        recyclerView.setAdapter(verticalContentUGCAdapter);
        List<UGCContent> contentList = item.getContentList();
        if (contentList != null) {
            listL = CollectionsKt.m97333K0(contentList, (contentList.size() / 3) * 3);
            if (listL == null) {
                listL = CollectionsKt.m97506l();
            }
        } else {
            listL = CollectionsKt.m97506l();
        }
        verticalContentUGCAdapter.mo36201n1(listL);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.UGC_PORTRAIT_GRID.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.provider_ugc_vertical_content;
    }
}
