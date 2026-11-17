package com.transsion.moviedetail.adapter;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.baseui.util.AbstractC14556b;
import com.transsion.moviedetail.R$id;
import com.transsion.moviedetail.R$layout;
import com.transsion.moviedetailapi.bean.Staff;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p462hj.C23860f;

/* JADX INFO: renamed from: com.transsion.moviedetail.adapter.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m97100d2 = {"Lcom/transsion/moviedetail/adapter/b;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/moviedetailapi/bean/Staff;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "staffList", "<init>", "(Ljava/util/List;)V", "holder", WebConstants.FIELD_ITEM, "", "B1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/moviedetailapi/bean/Staff;)V", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class C15921b extends BaseQuickAdapter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15921b(List<? extends Staff> staffList) {
        super(R$layout.adapter_crew_related, CollectionsKt.m97343U0(staffList));
        Intrinsics.m97802h(staffList, "staffList");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, Staff item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        boolean zM65670a = AbstractC14556b.m65670a(getContext());
        TextView textView = (TextView) holder.getView(R$id.tv_staff_name);
        String name = item.getName();
        boolean z11 = true;
        textView.setVisibility(!(name == null || name.length() == 0) ? 0 : 8);
        textView.setText(item.getName());
        TextView textView2 = (TextView) holder.getView(R$id.tv_staff_job);
        String character = item.getCharacter();
        if (character != null && character.length() != 0) {
            z11 = false;
        }
        textView2.setVisibility(z11 ? 8 : 0);
        textView2.setText(item.getCharacter());
        ImageView imageView = (ImageView) holder.getView(R$id.iv_staff_avatar);
        int iM27313a = AbstractC5776a0.m27313a((zM65670a ? 2.0f : 1.0f) * 118.0f);
        int iM27313a2 = AbstractC5776a0.m27313a((zM65670a ? 2.0f : 1.0f) * 88.0f);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = iM27313a;
        layoutParams.width = iM27313a2;
        imageView.setLayoutParams(layoutParams);
        String avatarUrl = item.getAvatarUrl();
        if (avatarUrl == null || avatarUrl.length() == 0) {
            return;
        }
        C23860f.f72909a.m94457m(getContext()).m94468g(item.getAvatarUrl()).m94474m(iM27313a2).m94464c(iM27313a).m94465d(imageView);
    }
}
