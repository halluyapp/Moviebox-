package com.transsion.shorttv.p315ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mbridge.msdk.MBridgeConstans;
import com.transsion.shorttv.bean.Subject;
import com.transsion.shorttv.p315ui.widget.ShortTvDownloadEpItemView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import es.C23219b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p659os.C26718d;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTvDownloadEpListAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    private final List f60945a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private Subject f60946b;

    /* JADX INFO: renamed from: c */
    private Function1 f60947c;

    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m97100d2 = {"Lcom/transsion/shorttv/ui/adapter/ShortTvDownloadEpListAdapter$EpisodeViewHolder;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lcom/transsion/shorttv/ui/widget/ShortTvDownloadEpItemView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "<init>", "(Lcom/transsion/shorttv/ui/widget/ShortTvDownloadEpItemView;)V", "a", "Lcom/transsion/shorttv/ui/widget/ShortTvDownloadEpItemView;", "f", "()Lcom/transsion/shorttv/ui/widget/ShortTvDownloadEpItemView;", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
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
    public static final void m79535j(ShortTvDownloadEpListAdapter shortTvDownloadEpListAdapter, C26718d c26718d, View view) {
        Function1 function1 = shortTvDownloadEpListAdapter.f60947c;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(c26718d.m104503b()));
        }
    }

    public final List getData() {
        return this.f60945a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f60945a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(EpisodeViewHolder holder, int i11) {
        Intrinsics.m97802h(holder, "holder");
        final C26718d c26718d = (C26718d) this.f60945a.get(i11);
        holder.getView().showIndex(c26718d.m104503b() + 1);
        holder.getView().showLockedImg(C23219b.f70761a.m92280c(this.f60946b, c26718d.m104502a()));
        holder.getView().setSelect(c26718d.m104505d());
        holder.getView().showDownloadedImg(c26718d.m104504c());
        holder.getView().setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.adapter.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTvDownloadEpListAdapter.m79535j(this.f60982a, c26718d, view);
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
        if (obj instanceof C26718d) {
            C26718d c26718d = (C26718d) obj;
            holder.getView().showLockedImg(C23219b.f70761a.m92280c(this.f60946b, c26718d.m104502a()));
            holder.getView().setSelect(c26718d.m104505d());
            holder.getView().showDownloadedImg(c26718d.m104504c());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public EpisodeViewHolder onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        ShortTvDownloadEpItemView shortTvDownloadEpItemView = new ShortTvDownloadEpItemView(context);
        shortTvDownloadEpItemView.useForDownloadList();
        shortTvDownloadEpItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new EpisodeViewHolder(shortTvDownloadEpItemView);
    }

    /* JADX INFO: renamed from: l */
    public final void m79539l(Function1 function1) {
        this.f60947c = function1;
    }

    /* JADX INFO: renamed from: m */
    public final void m79540m(Subject subject) {
        this.f60946b = subject;
        notifyDataSetChanged();
    }
}
