package com.transsion.room.adapter;

import android.content.Context;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.transsion.moviedetailapi.bean.RoomItem;
import com.transsion.room.R$id;
import com.transsion.room.R$layout;
import com.transsion.room.R$string;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p462hj.C23860f;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: renamed from: com.transsion.room.adapter.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m97100d2 = {"Lcom/transsion/room/adapter/a;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/moviedetailapi/bean/RoomItem;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "", "dataList", "<init>", "(Ljava/util/List;)V", "holder", WebConstants.FIELD_ITEM, "", "B1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/moviedetailapi/bean/RoomItem;)V", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C18036a extends BaseQuickAdapter implements InterfaceC27944i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18036a(List<RoomItem> dataList) {
        super(R$layout.adapter_my_room, dataList);
        Intrinsics.m97802h(dataList, "dataList");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, RoomItem item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        ShapeableImageView shapeableImageView = (ShapeableImageView) holder.getView(R$id.iv_cover);
        holder.setText(R$id.tv_name, item.getName());
        int i11 = R$id.tv_focus_num;
        Long userCount = item.getUserCount();
        String string = userCount != null ? userCount.toString() : null;
        holder.setText(i11, string + getContext().getString(R$string.check_in));
        String avatar = item.getAvatar();
        if (avatar != null) {
            C23860f.a aVar = C23860f.f72909a;
            Context context = shapeableImageView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            aVar.m94457m(context).m94468g(avatar).m94474m(AbstractC5776a0.m27313a(48.0f)).m94464c(AbstractC5776a0.m27313a(48.0f)).m94465d(shapeableImageView);
        }
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
