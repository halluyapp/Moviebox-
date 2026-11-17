package com.transsion.room.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.noober.background.view.BLFrameLayout;
import com.noober.background.view.BLTextView;
import com.transsion.moviedetailapi.bean.RoomFilter;
import com.transsion.room.R$layout;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gq.C23664z;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ng.AbstractC26004a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m97100d2 = {"Lcom/transsion/room/adapter/RoomFilterTabListAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/moviedetailapi/bean/RoomFilter;", "Lcom/transsion/room/adapter/RoomFilterTabListAdapter$FilterTabListItemVH;", "<init>", "()V", "holder", "", "isSelected", "", "E1", "(Lcom/transsion/room/adapter/RoomFilterTabListAdapter$FilterTabListItemVH;Z)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "D1", "(Landroid/view/ViewGroup;I)Lcom/transsion/room/adapter/RoomFilterTabListAdapter$FilterTabListItemVH;", WebConstants.FIELD_ITEM, "B1", "(Lcom/transsion/room/adapter/RoomFilterTabListAdapter$FilterTabListItemVH;Lcom/transsion/moviedetailapi/bean/RoomFilter;)V", "", "", "payloads", "C1", "(Lcom/transsion/room/adapter/RoomFilterTabListAdapter$FilterTabListItemVH;Lcom/transsion/moviedetailapi/bean/RoomFilter;Ljava/util/List;)V", "FilterTabListItemVH", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class RoomFilterTabListAdapter extends BaseQuickAdapter {

    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m97100d2 = {"Lcom/transsion/room/adapter/RoomFilterTabListAdapter$FilterTabListItemVH;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lgq/z;", "viewBinding", "<init>", "(Lgq/z;)V", "a", "Lgq/z;", "f", "()Lgq/z;", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    public static final class FilterTabListItemVH extends BaseViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C23664z viewBinding;

        /* JADX WARN: Illegal instructions before constructor call */
        public FilterTabListItemVH(C23664z viewBinding) {
            Intrinsics.m97802h(viewBinding, "viewBinding");
            BLFrameLayout root = viewBinding.getRoot();
            Intrinsics.m97801g(root, "getRoot(...)");
            super(root);
            this.viewBinding = viewBinding;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C23664z getViewBinding() {
            return this.viewBinding;
        }
    }

    public RoomFilterTabListAdapter() {
        super(R$layout.item_room_list_tab, null, 2, null);
    }

    /* JADX INFO: renamed from: E1 */
    private final void m76720E1(FilterTabListItemVH holder, boolean isSelected) {
        Typeface typefaceM102047d;
        holder.getViewBinding().f72358b.setSelected(isSelected);
        holder.getViewBinding().f72359c.setSelected(isSelected);
        View vSelected = holder.getViewBinding().f72360d;
        Intrinsics.m97801g(vSelected, "vSelected");
        vSelected.setVisibility(isSelected ? 0 : 8);
        BLTextView bLTextView = holder.getViewBinding().f72359c;
        if (isSelected) {
            Context context = holder.itemView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            typefaceM102047d = AbstractC26004a.m102046c(context);
        } else {
            Context context2 = holder.itemView.getContext();
            Intrinsics.m97801g(context2, "getContext(...)");
            typefaceM102047d = AbstractC26004a.m102047d(context2);
        }
        bLTextView.setTypeface(typefaceM102047d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(FilterTabListItemVH holder, RoomFilter item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        holder.getViewBinding().f72359c.setText(item.getTitle());
        m76720E1(holder, item.getIsSelected());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public void mo36108G(FilterTabListItemVH holder, RoomFilter item, List<? extends Object> payloads) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(payloads, "payloads");
        super.mo36108G(holder, item, payloads);
        if (payloads.isEmpty()) {
            return;
        }
        Object objV0 = CollectionsKt.m97372v0(payloads);
        if (objV0 instanceof Boolean) {
            m76720E1(holder, ((Boolean) objV0).booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] */
    public FilterTabListItemVH mo36095y0(ViewGroup parent, int viewType) {
        Intrinsics.m97802h(parent, "parent");
        C23664z c23664zM93603c = C23664z.m93603c(LayoutInflater.from(getContext()), parent, false);
        Intrinsics.m97801g(c23664zM93603c, "inflate(...)");
        return new FilterTabListItemVH(c23664zM93603c);
    }
}
