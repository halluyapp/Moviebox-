package com.transsion.home.category.adapter;

import android.content.Context;
import android.view.View;
import androidx.core.content.AbstractC2397b;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.p282tn.lib.widget.R$color;
import com.transsion.home.R$drawable;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.R$string;
import com.transsion.moviedetailapi.R$mipmap;
import com.transsion.moviedetailapi.bean.Staff;
import com.transsion.moviedetailapi.bean.StaffType;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import p462hj.C23860f;

/* JADX INFO: renamed from: com.transsion.home.category.adapter.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C15110c extends BaseItemProvider {
    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 1;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_cast;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, Staff item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        ShapeableImageView shapeableImageView = (ShapeableImageView) helper.getViewOrNull(R$id.iv_cover);
        if (shapeableImageView != null) {
            int i11 = R$mipmap.movie_staff_default_avatar;
            String avatarUrl = item.getAvatarUrl();
            if (avatarUrl == null || avatarUrl.length() == 0) {
                shapeableImageView.setImageResource(i11);
            } else {
                C23860f.a aVar = C23860f.f72909a;
                Context context = shapeableImageView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94457m = aVar.m94457m(context);
                String avatarUrl2 = item.getAvatarUrl();
                if (avatarUrl2 == null) {
                    avatarUrl2 = "";
                }
                bVarM94457m.m94468g(avatarUrl2).m94470i(i11).m94465d(shapeableImageView);
            }
        }
        helper.setText(R$id.tv_title, item.getName());
        int i12 = R$id.tv_subject_num;
        StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
        String string = m36338k().getString(R$string.subject_num);
        Intrinsics.m97801g(string, "getString(...)");
        String str = String.format(string, Arrays.copyOf(new Object[]{item.getSubjectNum()}, 1));
        Intrinsics.m97801g(str, "format(...)");
        helper.setText(i12, str);
        StringBuilder sb2 = new StringBuilder();
        List<StaffType> staffTypes = item.getStaffTypes();
        if (staffTypes != null) {
            Iterator<T> it = staffTypes.iterator();
            while (it.hasNext()) {
                sb2.append(((StaffType) it.next()).getName());
                sb2.append("•");
            }
        }
        helper.setText(R$id.tv_desc, StringsKt.m98161q1(sb2, 8226));
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        Integer numValueOf = baseProviderMultiAdapterM36335g != null ? Integer.valueOf(baseProviderMultiAdapterM36335g.m36184g0(item)) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            View viewOrNull = helper.getViewOrNull(R$id.divider);
            if (viewOrNull != null) {
                AbstractC26006c.m102058k(viewOrNull);
            }
            View viewOrNull2 = helper.getViewOrNull(R$id.bg_gradient);
            if (viewOrNull2 != null) {
                AbstractC26006c.m102058k(viewOrNull2);
            }
            View viewOrNull3 = helper.getViewOrNull(R$id.item_root);
            if (viewOrNull3 != null) {
                viewOrNull3.setBackgroundResource(R$drawable.bg_category_first_item);
                return;
            }
            return;
        }
        View viewOrNull4 = helper.getViewOrNull(R$id.divider);
        if (viewOrNull4 != null) {
            AbstractC26006c.m102054g(viewOrNull4);
        }
        View viewOrNull5 = helper.getViewOrNull(R$id.bg_gradient);
        if (viewOrNull5 != null) {
            AbstractC26006c.m102054g(viewOrNull5);
        }
        View viewOrNull6 = helper.getViewOrNull(R$id.item_root);
        if (viewOrNull6 != null) {
            viewOrNull6.setBackgroundColor(AbstractC2397b.getColor(m36338k(), R$color.bg_01));
        }
    }
}
