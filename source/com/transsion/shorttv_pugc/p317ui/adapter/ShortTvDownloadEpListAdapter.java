package com.transsion.shorttv_pugc.p317ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mbridge.msdk.MBridgeConstans;
import com.transsion.shorttv_pugc.p317ui.widget.ShortTvDownloadEpItemView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tt.C27850c;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTvDownloadEpListAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    private final List f61964a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private Function1 f61965b;

    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/ui/adapter/ShortTvDownloadEpListAdapter$EpisodeViewHolder;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lcom/transsion/shorttv_pugc/ui/widget/ShortTvDownloadEpItemView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "<init>", "(Lcom/transsion/shorttv_pugc/ui/widget/ShortTvDownloadEpItemView;)V", "a", "Lcom/transsion/shorttv_pugc/ui/widget/ShortTvDownloadEpItemView;", "f", "()Lcom/transsion/shorttv_pugc/ui/widget/ShortTvDownloadEpItemView;", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    public static final class EpisodeViewHolder extends BaseViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ShortTvDownloadEpItemView view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EpisodeViewHolder(ShortTvDownloadEpItemView view) {
            super(view);
            Intrinsics.m97802h(view, "view");
            this.view = view;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ShortTvDownloadEpItemView getView() {
            return this.view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m80790j(ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter, C27850c c27850c, View view) {
        Function1 function1 = shortTvDownloadEpListAdapter.f61965b;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(c27850c.m108247a()));
        }
    }

    public final List getData() {
        return this.f61964a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f61964a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(EpisodeViewHolder holder, int i11) {
        Intrinsics.m97802h(holder, "holder");
        final C27850c c27850c = (C27850c) this.f61964a.get(i11);
        holder.getView().showIndex(c27850c.m108247a() + 1);
        holder.getView().showDownloadLockImg(!c27850c.m108249c());
        if (c27850c.m108249c()) {
            holder.getView().setSelect(c27850c.m108250d());
            holder.getView().showDownloadImg(c27850c.m108248b());
        }
        holder.getView().setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.ui.adapter.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTvDownloadEpListAdapter.m80790j(this.f61996a, c27850c, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(EpisodeViewHolder holder, int i11, List payloads) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(payloads, "payloads");
        super.onBindViewHolder(holder, i11, payloads);
        if (payloads.isEmpty()) {
            return;
        }
        Object obj = payloads.get(0);
        if (obj instanceof C27850c) {
            C27850c c27850c = (C27850c) obj;
            holder.getView().showDownloadLockImg(!c27850c.m108249c());
            if (c27850c.m108249c()) {
                holder.getView().setSelect(c27850c.m108250d());
                holder.getView().showDownloadImg(c27850c.m108248b());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public EpisodeViewHolder onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        ShortTvDownloadEpItemView shortTvDownloadEpItemView = new ShortTvDownloadEpItemView(context);
        shortTvDownloadEpItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new EpisodeViewHolder(shortTvDownloadEpItemView);
    }

    /* JADX INFO: renamed from: l */
    public final void m80794l(Function1 function1) {
        this.f61965b = function1;
    }
}
