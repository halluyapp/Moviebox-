package com.transsion.shorttv.p315ui.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.p315ui.fragment.ShortTvDetailListFragment;
import com.transsion.shorttv.p315ui.widget.InterfaceC19112d;
import com.transsion.shorttv.p315ui.widget.ShortTvVideoItemView;
import com.transsion.shorttv.utils.C19162e;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p659os.AbstractC26725k;
import p659os.C26719e;

/* JADX INFO: renamed from: com.transsion.shorttv.ui.adapter.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C18911j extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final ShortTvDetailListFragment f60984e;

    /* JADX INFO: renamed from: f */
    private boolean f60985f;

    /* JADX INFO: renamed from: g */
    private final String f60986g;

    /* JADX INFO: renamed from: h */
    private final String f60987h;

    /* JADX INFO: renamed from: i */
    private final boolean f60988i;

    /* JADX INFO: renamed from: j */
    private final int f60989j;

    /* JADX INFO: renamed from: k */
    private final int f60990k;

    public C18911j(ShortTvDetailListFragment fragment, boolean z11, String str, String str2, boolean z12) {
        Intrinsics.m97802h(fragment, "fragment");
        this.f60984e = fragment;
        this.f60985f = z11;
        this.f60986g = str;
        this.f60987h = str2;
        this.f60988i = z12;
        this.f60989j = 1;
        this.f60990k = R$layout.short_tv_item_video;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return this.f60989j;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return this.f60990k;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: r */
    public BaseViewHolder mo36342r(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        C19162e.a aVar = C19162e.f61571c;
        if (!aVar.m80235a().m80233d().isEmpty()) {
            View view = (View) aVar.m80235a().m80233d().remove(0);
            if (view.getParent() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return new BaseViewHolder(view);
            }
        }
        return super.mo36342r(parent, i11);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder holder, AbstractC26725k item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        if (item instanceof C26719e) {
            ShortTvVideoItemView shortTvVideoItemView = (ShortTvVideoItemView) holder.getView(R$id.view_video_item);
            C26719e c26719e = (C26719e) item;
            ShortTvDetailListFragment shortTvDetailListFragment = this.f60984e;
            BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
            InterfaceC19112d.a.m80217a(shortTvVideoItemView, c26719e, shortTvDetailListFragment, baseProviderMultiAdapterM36335g != null ? Integer.valueOf(baseProviderMultiAdapterM36335g.m36184g0(item)) : null, this.f60985f, this.f60986g, this.f60987h, false, this.f60988i, 64, null);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo36334f(BaseViewHolder helper, AbstractC26725k item, List payloads) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(payloads, "payloads");
        super.mo36334f(helper, item, payloads);
        if (item instanceof C26719e) {
            Object objK0 = CollectionsKt.m97361k0(payloads);
            ShortTvVideoItemView shortTvVideoItemView = (ShortTvVideoItemView) helper.getView(R$id.view_video_item);
            if (!(objK0 instanceof Integer)) {
                if (objK0 instanceof Boolean) {
                    shortTvVideoItemView.updateLockState((C26719e) item);
                }
            } else {
                C26719e c26719e = (C26719e) item;
                ShortTvDetailListFragment shortTvDetailListFragment = this.f60984e;
                BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
                shortTvVideoItemView.setData(c26719e, shortTvDetailListFragment, baseProviderMultiAdapterM36335g != null ? Integer.valueOf(baseProviderMultiAdapterM36335g.m36184g0(item)) : null, this.f60985f, this.f60986g, this.f60987h, true, this.f60988i);
            }
        }
    }
}
