package com.transsion.home.adapter.suboperate.provider;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baselib.helper.C14450a;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.suboperate.adapter.C14938n;
import com.transsion.home.bean.BffCommonOpData;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.moviedetailapi.bean.PostItemType;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import mg.C25829f;
import ml.AbstractC25888b;
import p765s6.InterfaceC27566d;

/* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.provider.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14976k0 extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final int f52367e;

    /* JADX INFO: renamed from: f */
    private final boolean f52368f;

    /* JADX INFO: renamed from: g */
    private final int f52369g;

    public C14976k0(int i11, boolean z11) {
        this.f52367e = i11;
        this.f52368f = z11;
        int i12 = z11 ? 4 : 3;
        this.f52369g = ((int) (AbstractC5776a0.m27313a(((((AbstractC5776a0.m27314b(RangesKt.m97938h(AbstractC5806y.m27489e(), AbstractC5806y.m27487c())) - 12) - (i12 * 8)) - 12) * 1.0f) / i12) * 1.39f)) + AbstractC5776a0.m27313a(26.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m67160A(List list, C14976k0 c14976k0, OperateItem operateItem, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        BffCommonOpData bffCommonOpData = (BffCommonOpData) CollectionsKt.m97362l0(list, i11);
        if (bffCommonOpData == null) {
            return;
        }
        if (i11 == list.size() - 1) {
            c14976k0.m67161B(operateItem, bffCommonOpData);
            c14976k0.m67163D(bffCommonOpData, i11, operateItem);
        } else {
            c14976k0.m67161B(operateItem, bffCommonOpData);
            c14976k0.m67163D(bffCommonOpData, i11, operateItem);
        }
    }

    /* JADX INFO: renamed from: B */
    private final void m67161B(OperateItem operateItem, BffCommonOpData bffCommonOpData) {
        String deepLink = bffCommonOpData.getDeepLink();
        if (deepLink != null) {
            AbstractC5114k.m23925h(deepLink, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: C */
    private final void m67162C(OperateItem operateItem) {
        String title;
        String opId;
        HashMap map = new HashMap();
        map.put("event_type", "browse_post_list");
        String str = "";
        if (operateItem == null || (title = operateItem.getTitle()) == null) {
            title = "";
        }
        map.put(CampaignEx.JSON_KEY_TITLE, title);
        if (operateItem != null && (opId = operateItem.getOpId()) != null) {
            str = opId;
        }
        map.put("opId", str);
        map.put("tabId", String.valueOf(this.f52367e));
        if (operateItem != null) {
            AbstractC25888b.m101678a(operateItem, map);
        }
        C14450a.f50860a.m65142e(SubTabFragment.INSTANCE.m68282a(this.f52367e), map);
    }

    /* JADX INFO: renamed from: D */
    private final void m67163D(BffCommonOpData bffCommonOpData, int i11, OperateItem operateItem) {
        HashMap map = new HashMap();
        map.put("event_type", "click_post_list_item");
        map.put("sequence", String.valueOf(i11));
        map.put("tabId", String.valueOf(this.f52367e));
        AbstractC25888b.m101681d(bffCommonOpData, map);
        AbstractC25888b.m101678a(operateItem, map);
        C14450a.f50860a.m65143f(SubTabFragment.INSTANCE.m68282a(this.f52367e), map);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.POST_LIST.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_sub_operation_variable;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final OperateItem item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        List<BffCommonOpData> postData = item.getPostData();
        if (postData == null) {
            postData = CollectionsKt.m97506l();
        }
        helper.itemView.setVisibility(postData.isEmpty() ? 8 : 0);
        if (postData.isEmpty()) {
            return;
        }
        ((TextView) helper.getView(R$id.sub_operation_variable_title)).setText(item.getTitle());
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.sub_operation_variable_recycle);
        final List listK0 = CollectionsKt.m97333K0(postData, 10);
        if (this.f52369g > 0) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            layoutParams.height = this.f52369g;
            recyclerView.setLayoutParams(layoutParams);
        }
        Object tag = recyclerView.getTag();
        C14938n c14938n = tag instanceof C14938n ? (C14938n) tag : null;
        if (c14938n == null) {
            c14938n = new C14938n(0, item, this.f52367e, this.f52368f, 1, null);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m36338k(), 0, false);
            linearLayoutManager.setItemPrefetchEnabled(true);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(c14938n);
            recyclerView.setTag(c14938n);
            if (recyclerView.getItemDecorationCount() == 0) {
                recyclerView.addItemDecoration(new C25829f(8.0f, 0.0f, 12.0f, 2, null));
            }
        } else {
            c14938n.m66979E1(item);
        }
        c14938n.mo36201n1(listK0);
        c14938n.m36227w1(new InterfaceC27566d() { // from class: com.transsion.home.adapter.suboperate.provider.j0
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                C14976k0.m67160A(listK0, this, item, baseQuickAdapter, view, i11);
            }
        });
        m67162C(item);
    }
}
