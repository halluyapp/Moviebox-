package com.transsion.ugcvideodetail.adapter;

import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.ugcvideodetail.R$id;
import com.transsion.ugcvideodetail.R$layout;
import com.transsion.ugcvideodetail.api.bean.UGCImmVideo;
import com.transsion.ugcvideodetail.fragment.UGCImmVideoDetailFragment;
import com.transsion.ugcvideodetail.widget.UGCImmVideoItemView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.ugcvideodetail.adapter.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C20145c extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final UGCImmVideoDetailFragment f64030e;

    /* JADX INFO: renamed from: f */
    private final String f64031f;

    /* JADX INFO: renamed from: g */
    private final String f64032g;

    /* JADX INFO: renamed from: h */
    private final String f64033h;

    /* JADX INFO: renamed from: i */
    private final int f64034i;

    /* JADX INFO: renamed from: j */
    private final int f64035j;

    public C20145c(UGCImmVideoDetailFragment fragment, String trackId, String str, String str2) {
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(trackId, "trackId");
        this.f64030e = fragment;
        this.f64031f = trackId;
        this.f64032g = str;
        this.f64033h = str2;
        this.f64034i = 1;
        this.f64035j = R$layout.item_ugc_imm_video_detail;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return this.f64034i;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return this.f64035j;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder holder, UGCImmVideo item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        UGCImmVideoItemView uGCImmVideoItemView = (UGCImmVideoItemView) holder.getView(R$id.viewImmVideoItem);
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        uGCImmVideoItemView.setData(baseProviderMultiAdapterM36335g != null ? Integer.valueOf(baseProviderMultiAdapterM36335g.m36184g0(item)) : null, this.f64030e, this.f64031f, this.f64032g, this.f64033h, item);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo36334f(BaseViewHolder helper, UGCImmVideo item, List payloads) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(payloads, "payloads");
        super.mo36334f(helper, item, payloads);
        Object objK0 = CollectionsKt.m97361k0(payloads);
        UGCImmVideoItemView uGCImmVideoItemView = (UGCImmVideoItemView) helper.getView(R$id.viewImmVideoItem);
        if (objK0 instanceof Integer) {
            uGCImmVideoItemView.setDownloadStatus(((Number) objK0).intValue());
        }
    }
}
