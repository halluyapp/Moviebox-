package com.transsion.search_pugc.fragment.group.adapter;

import android.content.Context;
import android.widget.ImageView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.p282tn.lib.widget.R$color;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.util.C14562h;
import com.transsion.publish.api.GroupBean;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p462hj.C23860f;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: renamed from: com.transsion.search_pugc.fragment.group.adapter.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0019"}, m97100d2 = {"Lcom/transsion/search_pugc/fragment/group/adapter/a;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/publish/api/GroupBean;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "", "layoutResId", "<init>", "(I)V", WebConstants.FIELD_ITEM, "sequence", "", "E1", "(Lcom/transsion/publish/api/GroupBean;I)V", "holder", "B1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/publish/api/GroupBean;)V", "F", "I", "D1", "()I", "width", "G", "C1", "height", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C18589a extends BaseQuickAdapter implements InterfaceC27944i {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final int height;

    public C18589a() {
        this(0, 1, null);
    }

    public C18589a(int i11) {
        super(i11, null, 2, null);
        this.width = AbstractC5776a0.m27313a(48.0f);
        this.height = AbstractC5776a0.m27313a(48.0f);
    }

    public /* synthetic */ C18589a(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? R$layout.item_search_group : i11);
    }

    /* JADX INFO: renamed from: E1 */
    private final void m78296E1(GroupBean item, int sequence) {
        HashMap map = new HashMap();
        String groupId = item.getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        map.put("group_id", groupId);
        map.put("sequence", String.valueOf(sequence));
        String ops = item.getOps();
        map.put("ops", ops != null ? ops : "");
        C14450a.f50860a.m65138a("searchresult", map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, GroupBean item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        holder.setText(R$id.tv_name, item.getName());
        holder.setText(R$id.tv_des, C14562h.f51111a.m65678a(item.getUserCount()) + " checkin");
        holder.setVisible(R$id.iv_select, item.getSelect());
        Context context = holder.itemView.getContext();
        ImageView imageView = (ImageView) holder.itemView.findViewById(R$id.iv_avatar);
        String avatar = item.getAvatar();
        if (avatar != null) {
            C23860f.a aVar = C23860f.f72909a;
            Intrinsics.m97799e(context);
            C23860f.b bVarM94464c = aVar.m94457m(context).m94468g(avatar).m94470i(R$color.cl34_ff).m94474m(this.width).m94464c(this.height);
            Intrinsics.m97799e(imageView);
            bVarM94464c.m94465d(imageView);
        }
        m78296E1(item, m36184g0(item));
    }

    /* JADX INFO: renamed from: C1, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: D1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
