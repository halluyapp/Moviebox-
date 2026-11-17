package com.transsion.search.fragment.hot.adapter;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ck.AbstractC5114k;
import ck.C5111h;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.KeyboardUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.p282tn.lib.widget.R$string;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.search.AbstractC18381f;
import com.transsion.search.R$drawable;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search.bean.GroupInfo;
import com.transsion.search.widget.C18541d;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p462hj.C23860f;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;
import sh.C27621h;

/* JADX INFO: renamed from: com.transsion.search.fragment.hot.adapter.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001a¨\u0006\u001c"}, m97100d2 = {"Lcom/transsion/search/fragment/hot/adapter/c;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/search/bean/GroupInfo;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "", "parentCategory", "", "parentIndex", "sugSource", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "groupInfo", "", "E1", "(Lcom/transsion/search/bean/GroupInfo;)V", "holder", WebConstants.FIELD_ITEM, "C1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/search/bean/GroupInfo;)V", "F", "Ljava/lang/String;", "G", "I", "H", "", "Z", "mIsLowDevice", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class C18450c extends BaseQuickAdapter implements InterfaceC27944i {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final String parentCategory;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final int parentIndex;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final String sugSource;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final boolean mIsLowDevice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18450c(String parentCategory, int i11, String sugSource) {
        super(R$layout.provider_result_group, null, 2, null);
        Intrinsics.m97802h(parentCategory, "parentCategory");
        Intrinsics.m97802h(sugSource, "sugSource");
        this.parentCategory = parentCategory;
        this.parentIndex = i11;
        this.sugSource = sugSource;
        this.mIsLowDevice = C5111h.f17603a.m23913a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public static final void m77811D1(C18450c c18450c, GroupInfo groupInfo, View view) {
        c18450c.m77812E1(groupInfo);
    }

    /* JADX INFO: renamed from: E1 */
    private final void m77812E1(GroupInfo groupInfo) {
        C18541d.f60046a.m78133m(groupInfo, m36184g0(groupInfo), this.parentCategory, this.parentIndex, this.mIsLowDevice, this.sugSource);
        if (getContext() instanceof Activity) {
            Context context = getContext();
            Intrinsics.m97800f(context, "null cannot be cast to non-null type android.app.Activity");
            if (KeyboardUtils.m27133g((Activity) context)) {
                Context context2 = getContext();
                Intrinsics.m97800f(context2, "null cannot be cast to non-null type android.app.Activity");
                KeyboardUtils.m27130d((Activity) context2);
            }
        }
        Navigator.m61845x(TheRouter.m61773c("/room/detail").m61857K("id", groupInfo.getGroupId()), getContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, final GroupInfo item) {
        int i11;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        ImageView imageView = (ShapeableImageView) holder.getView(R$id.search_result_provider_group_cover);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
        C27621h c27621h = C27621h.f84745a;
        Context context = imageView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        c2308b.setMarginStart(c27621h.m107451a(context, 12.0f));
        imageView.setLayoutParams(c2308b);
        C23860f.b bVarM94457m = C23860f.f72909a.m94457m(getContext());
        String url = item.getCover().getUrl();
        if (url == null) {
            url = "";
        }
        C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
        String thumbnail = item.getCover().getThumbnail();
        bVarM94468g.m94473l(thumbnail != null ? thumbnail : "").m94474m(AbstractC5776a0.m27313a(50.0f)).m94465d(imageView);
        int iM36184g0 = m36184g0(item);
        if (iM36184g0 == 0) {
            i11 = R$drawable.bg_hot_subject_no1;
        } else if (iM36184g0 != 1) {
            i11 = iM36184g0 != 2 ? R$drawable.bg_hot_subject_no4 : R$drawable.bg_hot_subject_no3;
        } else {
            i11 = R$drawable.bg_hot_subject_no2;
        }
        holder.setVisible(R$id.search_result_provider_group_index_text, true);
        holder.setBackgroundResource(R$id.search_result_provider_group_index_text, i11);
        holder.setText(R$id.search_result_provider_group_index_text, String.valueOf(iM36184g0 + 1));
        holder.setText(R$id.search_result_provider_group_title, item.getName());
        Long userCount = item.getUserCount();
        String strM23921d = userCount != null ? AbstractC5114k.m23921d(userCount.longValue()) : null;
        Context context2 = getContext();
        int i12 = R$string.members;
        if (strM23921d == null) {
            strM23921d = "0";
        }
        CharSequence string = context2.getString(i12, strM23921d);
        Intrinsics.m97801g(string, "getString(...)");
        holder.setText(R$id.search_result_provider_group_member, string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        List<String> tags = item.getTags();
        if (tags != null) {
            int i13 = 0;
            for (Object obj : tags) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    CollectionsKt.m97515u();
                }
                spannableStringBuilder.append((CharSequence) obj);
                List<String> tags2 = item.getTags();
                if (i13 < (tags2 != null ? tags2.size() : 0) - 1) {
                    spannableStringBuilder.append((CharSequence) "￼");
                    spannableStringBuilder.setSpan(AbstractC18381f.m77673b(getContext()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                i13 = i14;
            }
        }
        if (spannableStringBuilder.length() > 0) {
            holder.setText(R$id.search_result_provider_group_des, spannableStringBuilder);
            holder.setVisible(R$id.search_result_provider_group_des, true);
        } else {
            holder.setGone(R$id.search_result_provider_group_des, true);
        }
        holder.setVisible(R$id.search_result_provider_group_arrow, false);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search.fragment.hot.adapter.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C18450c.m77811D1(this.f59813a, item, view);
            }
        });
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
