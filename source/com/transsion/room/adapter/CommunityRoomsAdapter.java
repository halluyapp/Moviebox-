package com.transsion.room.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ck.AbstractC5114k;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.google.android.material.imageview.ShapeableImageView;
import com.p282tn.lib.view.RoomJoinStatus;
import com.p282tn.lib.widget.R$drawable;
import com.transsion.moviedetailapi.bean.RoomItem;
import com.transsion.room.R$layout;
import com.transsion.room.R$string;
import com.transsion.room.api.RoomsViewType;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import gq.C23660v;
import gq.C23661w;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p462hj.C23860f;
import sh.C27621h;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001=B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\bH\u0014¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b&\u0010'J-\u0010+\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0014¢\u0006\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0016\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00104¨\u0006>"}, m97100d2 = {"Lcom/transsion/room/adapter/CommunityRoomsAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/moviedetailapi/bean/RoomItem;", "Lcom/transsion/room/adapter/CommunityRoomsAdapter$RecommendRoomsItemVH;", "<init>", "()V", "Landroid/content/Context;", "context", "", "D1", "(Landroid/content/Context;)I", "holder", "", "hasJoin", "", "G1", "(Lcom/transsion/room/adapter/CommunityRoomsAdapter$RecommendRoomsItemVH;Z)V", WebConstants.FIELD_ITEM, "", "newCount", "H1", "(Lcom/transsion/room/adapter/CommunityRoomsAdapter$RecommendRoomsItemVH;Lcom/transsion/moviedetailapi/bean/RoomItem;J)V", "isMatchParent", "J1", "(Z)V", "Lcom/transsion/room/api/RoomsViewType;", NativeComponentConstants.KEY_COMPONENT_TYPE, "I1", "(Lcom/transsion/room/api/RoomsViewType;)V", "Landroid/view/View$OnClickListener;", "onClickListener", "E1", "(Landroid/content/Context;Landroid/view/View$OnClickListener;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "F1", "(Landroid/view/ViewGroup;I)Lcom/transsion/room/adapter/CommunityRoomsAdapter$RecommendRoomsItemVH;", "B1", "(Lcom/transsion/room/adapter/CommunityRoomsAdapter$RecommendRoomsItemVH;Lcom/transsion/moviedetailapi/bean/RoomItem;)V", "", "", "payloads", "C1", "(Lcom/transsion/room/adapter/CommunityRoomsAdapter$RecommendRoomsItemVH;Lcom/transsion/moviedetailapi/bean/RoomItem;Ljava/util/List;)V", "F", "I", "coverSize", "G", "Lcom/transsion/room/api/RoomsViewType;", "roomsViewType", "H", "Z", "Ljava/lang/Integer;", "itemWidth", "Lgq/w;", "J", "Lgq/w;", "footerBinding", "K", "initFooter", "RecommendRoomsItemVH", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class CommunityRoomsAdapter extends BaseQuickAdapter {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final int coverSize;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private RoomsViewType roomsViewType;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean isMatchParent;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private Integer itemWidth;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private C23661w footerBinding;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private boolean initFooter;

    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m97100d2 = {"Lcom/transsion/room/adapter/CommunityRoomsAdapter$RecommendRoomsItemVH;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lgq/v;", "viewBinding", "<init>", "(Lgq/v;)V", "a", "Lgq/v;", "f", "()Lgq/v;", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    public static final class RecommendRoomsItemVH extends BaseViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C23660v viewBinding;

        /* JADX WARN: Illegal instructions before constructor call */
        public RecommendRoomsItemVH(C23660v viewBinding) {
            Intrinsics.m97802h(viewBinding, "viewBinding");
            ConstraintLayout root = viewBinding.getRoot();
            Intrinsics.m97801g(root, "getRoot(...)");
            super(root);
            this.viewBinding = viewBinding;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C23660v getViewBinding() {
            return this.viewBinding;
        }
    }

    public CommunityRoomsAdapter() {
        super(R$layout.item_recommend_rooms, null, 2, null);
        this.coverSize = AbstractC5776a0.m27313a(64.0f);
        this.roomsViewType = RoomsViewType.TYPE_ROOM_HOME;
    }

    /* JADX INFO: renamed from: D1 */
    private final int m76702D1(Context context) {
        return (C27621h.f84745a.m107455e(context) - ((AbstractC23384a.m92907a(11.5f) * 4) + (AbstractC23384a.m92908b(12) * 2))) / 5;
    }

    /* JADX INFO: renamed from: G1 */
    private final void m76703G1(RecommendRoomsItemVH holder, boolean hasJoin) {
        holder.getViewBinding().f72329h.setStatus(hasJoin ? RoomJoinStatus.JOINED : RoomJoinStatus.JOIN);
    }

    /* JADX INFO: renamed from: H1 */
    private final void m76704H1(RecommendRoomsItemVH holder, RoomItem item, long newCount) {
        String strM23921d;
        if (this.roomsViewType != RoomsViewType.TYPE_ROOM_HOME) {
            Long newPostCount = item.getNewPostCount();
            if ((newPostCount != null ? newPostCount.longValue() : 0L) > 0) {
                holder.getViewBinding().f72326e.setText(Utils.m27275a().getString(R$string.x_new, newCount > 99 ? "99+" : String.valueOf(newCount)));
                holder.getViewBinding().f72326e.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                return;
            }
        }
        if (item.getUserCount() != null) {
            Long userCount = item.getUserCount();
            Intrinsics.m97799e(userCount);
            strM23921d = AbstractC5114k.m23921d(userCount.longValue());
        } else {
            strM23921d = "0";
        }
        holder.getViewBinding().f72326e.setText(strM23921d);
        holder.getViewBinding().f72326e.setCompoundDrawablesWithIntrinsicBounds(R$drawable.ic_room_home_member, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(RecommendRoomsItemVH holder, RoomItem item) {
        int iIntValue;
        List<String> tags;
        String str;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        ViewGroup.LayoutParams layoutParams = holder.getViewBinding().getRoot().getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (this.isMatchParent) {
            iIntValue = -1;
        } else {
            Integer num = this.itemWidth;
            Intrinsics.m97799e(num);
            iIntValue = num.intValue();
        }
        marginLayoutParams.width = iIntValue;
        holder.getViewBinding().getRoot().setLayoutParams(marginLayoutParams);
        if (item.getBuiltIn()) {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new CommunityRoomsAdapter$convert$1(item, holder, null), 3, null);
        } else {
            String avatar = item.getAvatar();
            if (avatar != null) {
                C23860f.b bVarM94464c = C23860f.f72909a.m94457m(getContext()).m94468g(avatar).m94474m(this.coverSize).m94464c(this.coverSize);
                ShapeableImageView ivCover = holder.getViewBinding().f72324c;
                Intrinsics.m97801g(ivCover, "ivCover");
                bVarM94464c.m94465d(ivCover);
            }
        }
        holder.getViewBinding().f72328g.setText(item.getName());
        Long newPostCount = item.getNewPostCount();
        m76704H1(holder, item, newPostCount != null ? newPostCount.longValue() : 0L);
        List<String> tags2 = item.getTags();
        if (tags2 != null && !tags2.isEmpty() && (tags = item.getTags()) != null && (str = (String) CollectionsKt.m97361k0(tags)) != null) {
            holder.getViewBinding().f72327f.setText(str);
        }
        Boolean hasJoin = item.getHasJoin();
        m76703G1(holder, hasJoin != null ? hasJoin.booleanValue() : false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public void mo36108G(RecommendRoomsItemVH holder, RoomItem item, List<? extends Object> payloads) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(payloads, "payloads");
        super.mo36108G(holder, item, payloads);
        if (payloads.isEmpty()) {
            return;
        }
        Object obj = payloads.get(payloads.size() - 1);
        if (obj instanceof Boolean) {
            m76703G1(holder, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Long) {
            m76704H1(holder, item, ((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: E1 */
    public final void m76707E1(Context context, View.OnClickListener onClickListener) {
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(onClickListener, "onClickListener");
        C23661w c23661wM93593c = C23661w.m93593c(LayoutInflater.from(context));
        this.footerBinding = c23661wM93593c;
        Intrinsics.m97799e(c23661wM93593c);
        c23661wM93593c.getRoot().setOnClickListener(onClickListener);
        C23661w c23661w = this.footerBinding;
        Intrinsics.m97799e(c23661w);
        ConstraintLayout root = c23661w.getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        m36217t(root, -1, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: F1, reason: merged with bridge method [inline-methods] */
    public RecommendRoomsItemVH mo36095y0(ViewGroup parent, int viewType) {
        Intrinsics.m97802h(parent, "parent");
        C23660v c23660vM93590c = C23660v.m93590c(LayoutInflater.from(getContext()), parent, false);
        Intrinsics.m97801g(c23660vM93590c, "inflate(...)");
        if (this.itemWidth == null) {
            this.itemWidth = Integer.valueOf(m76702D1(getContext()));
        }
        ViewGroup.LayoutParams layoutParams = c23660vM93590c.getRoot().getLayoutParams();
        Integer num = this.itemWidth;
        Intrinsics.m97799e(num);
        layoutParams.width = num.intValue();
        ViewGroup.LayoutParams layoutParams2 = c23660vM93590c.f72324c.getLayoutParams();
        Integer num2 = this.itemWidth;
        Intrinsics.m97799e(num2);
        layoutParams2.height = num2.intValue();
        ViewGroup.LayoutParams layoutParams3 = c23660vM93590c.f72325d.getLayoutParams();
        Integer num3 = this.itemWidth;
        Intrinsics.m97799e(num3);
        layoutParams3.height = num3.intValue();
        if (!this.initFooter) {
            C23661w c23661w = this.footerBinding;
            if (c23661w != null) {
                ViewGroup.LayoutParams layoutParams4 = c23661w.getRoot().getLayoutParams();
                Integer num4 = this.itemWidth;
                Intrinsics.m97799e(num4);
                layoutParams4.width = num4.intValue();
                ViewGroup.LayoutParams layoutParams5 = c23661w.f72332c.getLayoutParams();
                Integer num5 = this.itemWidth;
                Intrinsics.m97799e(num5);
                layoutParams5.height = num5.intValue();
            }
            this.initFooter = true;
        }
        return new RecommendRoomsItemVH(c23660vM93590c);
    }

    /* JADX INFO: renamed from: I1 */
    public final void m76709I1(RoomsViewType type) {
        Intrinsics.m97802h(type, "type");
        this.roomsViewType = type;
    }

    /* JADX INFO: renamed from: J1 */
    public final void m76710J1(boolean isMatchParent) {
        this.isMatchParent = isMatchParent;
    }
}
