package com.transsion.room.adapter;

import android.R;
import androidx.core.content.AbstractC2397b;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.util.C14555a;
import com.transsion.baseui.widget.PileLayout;
import com.transsion.moviedetailapi.bean.RoomItem;
import com.transsion.room.R$drawable;
import com.transsion.room.R$id;
import com.transsion.room.R$layout;
import com.transsion.room.R$string;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p344db.C22966n;
import p462hj.C23860f;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: renamed from: com.transsion.room.adapter.d */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m97100d2 = {"Lcom/transsion/room/adapter/d;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/moviedetailapi/bean/RoomItem;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "", "dataList", "<init>", "(Ljava/util/List;)V", "holder", WebConstants.FIELD_ITEM, "", "B1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/moviedetailapi/bean/RoomItem;)V", "", "F", "I", "C1", "()I", "sz", "Ldb/n;", "G", "Ldb/n;", "shapeModel", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C18039d extends BaseQuickAdapter implements InterfaceC27944i {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final int sz;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private C22966n shapeModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18039d(List<RoomItem> dataList) {
        super(R$layout.adapter_hot_room, dataList);
        Intrinsics.m97802h(dataList, "dataList");
        this.sz = AbstractC5776a0.m27313a(20.0f);
        C22966n c22966nM91443m = C22966n.m91391a().m91446q(0, 20.0f).m91445p(C22966n.f70075m).m91443m();
        Intrinsics.m97801g(c22966nM91443m, "build(...)");
        this.shapeModel = c22966nM91443m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, RoomItem item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        ShapeableImageView shapeableImageView = (ShapeableImageView) holder.getView(R$id.iv_cover);
        String avatar = item.getAvatar();
        if (avatar != null) {
            C23860f.f72909a.m94457m(getContext()).m94468g(avatar).m94474m(AbstractC5776a0.m27313a(48.0f)).m94464c(AbstractC5776a0.m27313a(48.0f)).m94465d(shapeableImageView);
        }
        holder.setText(R$id.tv_name, item.getName());
        holder.setText(R$id.tv_desc, item.getDescription());
        int i11 = R$id.tv_focus_num;
        Long postCount = item.getPostCount();
        String string = postCount != null ? postCount.toString() : null;
        holder.setText(i11, string + getContext().getResources().getString(R$string.str_checkin));
        PileLayout pileLayout = (PileLayout) holder.getView(R$id.pl_member_ic);
        pileLayout.removeAllViews();
        List<String> memberAvatars = item.getMemberAvatars();
        int size = memberAvatars != null ? memberAvatars.size() : 0;
        for (int i12 = 0; i12 < size; i12++) {
            List<String> memberAvatars2 = item.getMemberAvatars();
            String str = memberAvatars2 != null ? memberAvatars2.get(i12) : null;
            ShapeableImageView shapeableImageView2 = new ShapeableImageView(getContext());
            shapeableImageView2.setStrokeWidth(C14555a.f51098a.m65667a(getContext(), 1.0f));
            shapeableImageView2.setStrokeColor(AbstractC2397b.getColorStateList(getContext(), R.color.white));
            shapeableImageView2.setShapeAppearanceModel(this.shapeModel);
            if (str != null) {
                C23860f.f72909a.m94457m(getContext()).m94468g(str).m94474m(this.sz).m94464c(this.sz).m94470i(R$drawable.ic_avatar_default).m94465d(shapeableImageView2);
            }
            int i13 = this.sz;
            pileLayout.addView(shapeableImageView2, i13, i13);
        }
        HashMap map = new HashMap();
        String groupId = item.getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        map.put("group_id", groupId);
        map.put("sequence", String.valueOf(m36184g0(item)));
        C14450a.f50860a.m65138a("rooms", map);
    }

    /* JADX INFO: renamed from: C1, reason: from getter */
    public final int getSz() {
        return this.sz;
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
