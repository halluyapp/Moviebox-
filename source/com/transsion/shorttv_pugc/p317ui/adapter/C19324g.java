package com.transsion.shorttv_pugc.p317ui.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv_pugc.ShorttvModel;
import com.transsion.shorttv_pugc.p317ui.fragment.ShortTvDetailListFragment;
import com.transsion.shorttv_pugc.p317ui.widget.InterfaceC19486a;
import com.transsion.shorttv_pugc.p317ui.widget.ShortTvVideoItemView;
import com.transsion.shorttv_pugc.utils.C19526e;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.adapter.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C19324g extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final ShortTvDetailListFragment f61998e;

    /* JADX INFO: renamed from: f */
    private boolean f61999f;

    /* JADX INFO: renamed from: g */
    private final String f62000g;

    /* JADX INFO: renamed from: h */
    private final String f62001h;

    /* JADX INFO: renamed from: i */
    private final boolean f62002i;

    /* JADX INFO: renamed from: j */
    private final int f62003j;

    /* JADX INFO: renamed from: k */
    private final int f62004k;

    public C19324g(ShortTvDetailListFragment fragment, boolean z11, String str, String str2, boolean z12) {
        Intrinsics.m97802h(fragment, "fragment");
        this.f61998e = fragment;
        this.f61999f = z11;
        this.f62000g = str;
        this.f62001h = str2;
        this.f62002i = z12;
        this.f62003j = 1;
        this.f62004k = R$layout.pugc_short_tv_item_video;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return this.f62003j;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return this.f62004k;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: r */
    public BaseViewHolder mo36342r(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        C19526e.a aVar = C19526e.f62461c;
        if (!aVar.m81339a().m81337d().isEmpty()) {
            View view = (View) aVar.m81339a().m81337d().remove(0);
            if (view.getParent() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return new BaseViewHolder(view);
            }
        }
        return super.mo36342r(parent, i11);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder holder, ShorttvModel.UGCVideo item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        ShortTvVideoItemView shortTvVideoItemView = (ShortTvVideoItemView) holder.getView(R$id.view_video_item);
        ShortTvDetailListFragment shortTvDetailListFragment = this.f61998e;
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        InterfaceC19486a.a.m81285a(shortTvVideoItemView, item, shortTvDetailListFragment, baseProviderMultiAdapterM36335g != null ? Integer.valueOf(baseProviderMultiAdapterM36335g.m36184g0(item)) : null, this.f61999f, this.f62000g, this.f62001h, false, this.f62002i, 64, null);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo36334f(BaseViewHolder helper, ShorttvModel.UGCVideo item, List payloads) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(payloads, "payloads");
        super.mo36334f(helper, item, payloads);
        Object objK0 = CollectionsKt.m97361k0(payloads);
        ShortTvVideoItemView shortTvVideoItemView = (ShortTvVideoItemView) helper.getView(R$id.view_video_item);
        if (objK0 instanceof Integer) {
            ShortTvDetailListFragment shortTvDetailListFragment = this.f61998e;
            BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
            shortTvVideoItemView.setData(item, shortTvDetailListFragment, baseProviderMultiAdapterM36335g != null ? Integer.valueOf(baseProviderMultiAdapterM36335g.m36184g0(item)) : null, this.f61999f, this.f62000g, this.f62001h, true, this.f62002i);
        } else if (objK0 instanceof Boolean) {
            shortTvVideoItemView.updateLockState(item);
        }
    }
}
