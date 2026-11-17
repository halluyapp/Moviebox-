package com.transsion.room.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.noober.background.view.BLTextView;
import com.transsion.moviedetailapi.bean.RoomItem;
import com.transsion.room.R$layout;
import com.transsion.room.R$string;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gq.C23630a0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p462hj.C23860f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m97100d2 = {"Lcom/transsion/room/adapter/YourRoomsAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/moviedetailapi/bean/RoomItem;", "Lcom/transsion/room/adapter/YourRoomsAdapter$YourRoomsItemVH;", "<init>", "()V", "holder", "", "newCount", "", "E1", "(Lcom/transsion/room/adapter/YourRoomsAdapter$YourRoomsItemVH;J)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "D1", "(Landroid/view/ViewGroup;I)Lcom/transsion/room/adapter/YourRoomsAdapter$YourRoomsItemVH;", WebConstants.FIELD_ITEM, "B1", "(Lcom/transsion/room/adapter/YourRoomsAdapter$YourRoomsItemVH;Lcom/transsion/moviedetailapi/bean/RoomItem;)V", "", "", "payloads", "C1", "(Lcom/transsion/room/adapter/YourRoomsAdapter$YourRoomsItemVH;Lcom/transsion/moviedetailapi/bean/RoomItem;Ljava/util/List;)V", "F", "I", "coverSize", "YourRoomsItemVH", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class YourRoomsAdapter extends BaseQuickAdapter {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final int coverSize;

    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m97100d2 = {"Lcom/transsion/room/adapter/YourRoomsAdapter$YourRoomsItemVH;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lgq/a0;", "viewBinding", "<init>", "(Lgq/a0;)V", "a", "Lgq/a0;", "f", "()Lgq/a0;", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    public static final class YourRoomsItemVH extends BaseViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C23630a0 viewBinding;

        /* JADX WARN: Illegal instructions before constructor call */
        public YourRoomsItemVH(C23630a0 viewBinding) {
            Intrinsics.m97802h(viewBinding, "viewBinding");
            ConstraintLayout root = viewBinding.getRoot();
            Intrinsics.m97801g(root, "getRoot(...)");
            super(root);
            this.viewBinding = viewBinding;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C23630a0 getViewBinding() {
            return this.viewBinding;
        }
    }

    public YourRoomsAdapter() {
        super(R$layout.item_your_rooms, null, 2, null);
        this.coverSize = AbstractC5776a0.m27313a(78.0f);
    }

    /* JADX INFO: renamed from: E1 */
    private final void m76735E1(YourRoomsItemVH holder, long newCount) {
        BLTextView tvNewCount = holder.getViewBinding().f72165d;
        Intrinsics.m97801g(tvNewCount, "tvNewCount");
        tvNewCount.setVisibility((newCount > 0L ? 1 : (newCount == 0L ? 0 : -1)) > 0 ? 0 : 8);
        holder.getViewBinding().f72165d.setText(Utils.m27275a().getString(R$string.x_new, newCount > 99 ? "99+" : String.valueOf(newCount)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(YourRoomsItemVH holder, RoomItem item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        String avatar = item.getAvatar();
        if (avatar != null) {
            C23860f.b bVarM94464c = C23860f.f72909a.m94457m(getContext()).m94468g(avatar).m94474m(this.coverSize).m94464c(this.coverSize);
            ShapeableImageView ivCover = holder.getViewBinding().f72163b;
            Intrinsics.m97801g(ivCover, "ivCover");
            bVarM94464c.m94465d(ivCover);
        }
        holder.getViewBinding().f72164c.setText(item.getName());
        Long newPostCount = item.getNewPostCount();
        m76735E1(holder, newPostCount != null ? newPostCount.longValue() : 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public void mo36108G(YourRoomsItemVH holder, RoomItem item, List<? extends Object> payloads) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(payloads, "payloads");
        super.mo36108G(holder, item, payloads);
        if (payloads.isEmpty()) {
            return;
        }
        Object objV0 = CollectionsKt.m97372v0(payloads);
        if (objV0 instanceof Long) {
            m76735E1(holder, ((Number) objV0).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] */
    public YourRoomsItemVH mo36095y0(ViewGroup parent, int viewType) {
        Intrinsics.m97802h(parent, "parent");
        C23630a0 c23630a0M93497c = C23630a0.m93497c(LayoutInflater.from(getContext()), parent, false);
        Intrinsics.m97801g(c23630a0M93497c, "inflate(...)");
        return new YourRoomsItemVH(c23630a0M93497c);
    }
}
