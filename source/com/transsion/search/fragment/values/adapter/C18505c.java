package com.transsion.search.fragment.values.adapter;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.moviedetailapi.R$mipmap;
import com.transsion.moviedetailapi.bean.Staff;
import com.transsion.moviedetailapi.bean.StaffType;
import com.transsion.search.R$drawable;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search.R$string;
import com.transsion.search.bean.SearchValuesRelatedCollectionEntity;
import com.transsion.search.fragment.values.SearchValuesFragment;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p462hj.C23860f;

/* JADX INFO: renamed from: com.transsion.search.fragment.values.adapter.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C18505c extends BaseItemProvider {
    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 2;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_search_values_staff_layout;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, SearchValuesRelatedCollectionEntity item) {
        String avatarUrl;
        List<StaffType> staffTypes;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        C23860f.b bVarM94457m = C23860f.f72909a.m94457m(m36338k());
        Staff staff = item.getStaff();
        if (staff == null || (avatarUrl = staff.getAvatarUrl()) == null) {
            avatarUrl = "";
        }
        bVarM94457m.m94468g(avatarUrl).m94470i(R$mipmap.movie_staff_default_avatar).m94465d((ImageView) helper.getView(R$id.ivCover));
        int i11 = R$id.tvTitle;
        Staff staff2 = item.getStaff();
        helper.setText(i11, staff2 != null ? staff2.getName() : null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) helper.getViewOrNull(R$id.tvDes);
        if (appCompatTextView != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Staff staff3 = item.getStaff();
            if (staff3 != null && (staffTypes = staff3.getStaffTypes()) != null) {
                int i12 = 0;
                for (Object obj : staffTypes) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        CollectionsKt.m97515u();
                    }
                    spannableStringBuilder.append((CharSequence) String.valueOf(((StaffType) obj).getName()));
                    if (i12 < staffTypes.size() - 1) {
                        spannableStringBuilder.append((CharSequence) " · ");
                    }
                    i12 = i13;
                }
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "  ");
            spannableStringBuilder2.append((CharSequence) spannableStringBuilder.toString());
            int i14 = R$drawable.search_suggest_staff;
            spannableStringBuilder2.setSpan(Build.VERSION.SDK_INT >= 29 ? new ImageSpan(appCompatTextView.getContext(), i14, 2) : new ImageSpan(appCompatTextView.getContext(), i14, 1), 0, 1, 34);
            appCompatTextView.setText(spannableStringBuilder2);
        }
        int i15 = R$id.tvWorks;
        Staff staff4 = item.getStaff();
        Integer subjectNum = staff4 != null ? staff4.getSubjectNum() : null;
        helper.setText(i15, subjectNum + " " + m36338k().getString(R$string.search_works));
        SearchValuesFragment.Companion companion = SearchValuesFragment.INSTANCE;
        Staff staff5 = item.getStaff();
        companion.m77957d("", "", staff5 != null ? staff5.getStaffId() : null, "", helper.getBindingAdapterPosition(), 2);
    }
}
