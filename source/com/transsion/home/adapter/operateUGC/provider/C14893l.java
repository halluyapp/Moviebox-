package com.transsion.home.adapter.operateUGC.provider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ck.AbstractC5114k;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.FlowLayout;
import com.transsion.baseui.widget.GradientTextView;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.ugcvideodetail.api.bean.UGCVideoHashTag;
import com.transsion.web.api.WebConstants;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ml.AbstractC25888b;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.provider.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C14893l extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final Integer f52062e;

    public C14893l(Integer num) {
        this.f52062e = num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m66848A(C14893l c14893l, UGCVideoHashTag uGCVideoHashTag, OperateItem operateItem, FlowLayout flowLayout, View view, View view2) {
        c14893l.m66850C(uGCVideoHashTag, operateItem, flowLayout.indexOfChild(view));
        String deepLink = uGCVideoHashTag.getDeepLink();
        if (deepLink != null) {
            AbstractC5114k.m23924g(deepLink, "&tabId=" + c14893l.f52062e);
        }
    }

    /* JADX INFO: renamed from: B */
    private final void m66849B(UGCVideoHashTag uGCVideoHashTag, OperateItem operateItem, int i11) {
        String title;
        HashMap map = new HashMap();
        map.put("module_name", WebConstants.FIELD_ITEM);
        if (uGCVideoHashTag == null || (title = uGCVideoHashTag.getTitle()) == null) {
            title = "";
        }
        map.put(CampaignEx.JSON_KEY_TITLE, title);
        map.put(RequestParameters.POSITION, String.valueOf(i11));
        AbstractC25888b.m101678a(operateItem, map);
        C24662i c24662i = C24662i.f75350a;
        SubTabFragment.Companion companion = SubTabFragment.INSTANCE;
        Integer num = this.f52062e;
        c24662i.m96872D(companion.m68282a(num != null ? num.intValue() : 1), map);
    }

    /* JADX INFO: renamed from: C */
    private final void m66850C(UGCVideoHashTag uGCVideoHashTag, OperateItem operateItem, int i11) {
        String title;
        HashMap map = new HashMap();
        map.put("module_name", WebConstants.FIELD_ITEM);
        if (uGCVideoHashTag == null || (title = uGCVideoHashTag.getTitle()) == null) {
            title = "";
        }
        map.put(CampaignEx.JSON_KEY_TITLE, title);
        map.put(RequestParameters.POSITION, String.valueOf(i11));
        AbstractC25888b.m101678a(operateItem, map);
        C24662i c24662i = C24662i.f75350a;
        SubTabFragment.Companion companion = SubTabFragment.INSTANCE;
        Integer num = this.f52062e;
        c24662i.m96881p(companion.m68282a(num != null ? num.intValue() : 1), map);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.HASH_TAG.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.provider_ugc_op_hashtag;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final OperateItem item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        int i11 = R$id.tv_op_ugc_hashtag_title;
        String title = item.getTitle();
        if (title == null) {
            title = "";
        }
        helper.setText(i11, title);
        final FlowLayout flowLayout = (FlowLayout) helper.getView(R$id.fl_op_ugc_hashtag_layout);
        flowLayout.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(m36338k());
        List<UGCVideoHashTag> hashtagList = item.getHashtagList();
        if (hashtagList == null) {
            hashtagList = CollectionsKt.m97506l();
        }
        for (final UGCVideoHashTag uGCVideoHashTag : hashtagList) {
            final View viewInflate = layoutInflaterFrom.inflate(R$layout.item_hashtag_chip, (ViewGroup) flowLayout, false);
            GradientTextView gradientTextView = (GradientTextView) viewInflate.findViewById(R$id.hashtag_chip_text);
            String title2 = uGCVideoHashTag.getTitle();
            if (title2 == null) {
                title2 = uGCVideoHashTag.getTag();
            }
            gradientTextView.setText(title2);
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.operateUGC.provider.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C14893l.m66848A(this.f52057a, uGCVideoHashTag, item, flowLayout, viewInflate, view);
                }
            });
            flowLayout.addView(viewInflate);
            m66849B(uGCVideoHashTag, item, flowLayout.indexOfChild(viewInflate));
        }
    }
}
