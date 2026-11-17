package com.transsion.home.p294tv.adapter;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.noober.background.view.BLFrameLayout;
import com.noober.background.view.BLTextView;
import com.transsion.home.R$dimen;
import com.transsion.home.R$drawable;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.p294tv.bean.ImageInfo;
import com.transsion.home.p294tv.bean.TvChannelItem;
import com.transsion.moviedetailapi.bean.PostItemType;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p462hj.C23860f;

/* JADX INFO: renamed from: com.transsion.home.tv.adapter.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C15454k extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final Function2 f53432e;

    /* JADX INFO: renamed from: f */
    private final Function0 f53433f;

    public C15454k(Function2 click, Function0 firstChannelId) {
        Intrinsics.m97802h(click, "click");
        Intrinsics.m97802h(firstChannelId, "firstChannelId");
        this.f53432e = click;
        this.f53433f = firstChannelId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m68593A(C15454k c15454k, TvChannelItem tvChannelItem, BaseViewHolder baseViewHolder, View view) {
        c15454k.f53432e.invoke(tvChannelItem, Integer.valueOf(baseViewHolder.getBindingAdapterPosition()));
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.TV_CHANNEL_ITEM.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_tv_channel;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo22757b(final BaseViewHolder helper, OperateItem item) {
        Resources resources;
        int i11;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        final TvChannelItem tvChannelItem = item.getTvChannelItem();
        if (tvChannelItem == null) {
            return;
        }
        BLTextView bLTextView = (BLTextView) helper.getView(R$id.tvChannelName);
        String title = tvChannelItem.getTitle();
        if (title == null) {
            title = "";
        }
        bLTextView.setText(title);
        BLTextView bLTextView2 = (BLTextView) helper.getView(R$id.tvLanguage);
        List<String> languageCodes = tvChannelItem.getLanguageCodes();
        String str = languageCodes != null ? (String) CollectionsKt.m97361k0(languageCodes) : null;
        if (str == null) {
            str = "";
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.m97801g(upperCase, "toUpperCase(...)");
        bLTextView2.setText(upperCase);
        ShapeableImageView shapeableImageView = (ShapeableImageView) helper.getView(R$id.ivChannelFlag);
        ImageInfo countryFlagImage = tvChannelItem.getCountryFlagImage();
        String url = countryFlagImage != null ? countryFlagImage.getUrl() : null;
        String str2 = url != null ? url : "";
        if (TextUtils.isEmpty(str2)) {
            shapeableImageView.setImageResource(R$drawable.ic_tv_country_flag_default);
        } else {
            C23860f.f72909a.m94457m(m36338k()).m94468g(str2).m94473l(str2).m94470i(R$drawable.ic_tv_country_flag_default).m94465d(shapeableImageView);
        }
        BLFrameLayout bLFrameLayout = (BLFrameLayout) helper.getView(R$id.btnWatch);
        boolean z11 = tvChannelItem.getChannelId() != null && Intrinsics.m97797c(tvChannelItem.getChannelId(), this.f53433f.invoke());
        int dimensionPixelSize = m36338k().getResources().getDimensionPixelSize(z11 ? R$dimen.dp_4 : R$dimen.dp_16);
        if (z11) {
            resources = m36338k().getResources();
            i11 = R$dimen.dp_8;
        } else {
            resources = m36338k().getResources();
            i11 = R$dimen.dp_16;
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i11);
        ViewGroup.LayoutParams layoutParams = bLFrameLayout.getLayoutParams();
        ConstraintLayout.C2308b c2308b = layoutParams instanceof ConstraintLayout.C2308b ? (ConstraintLayout.C2308b) layoutParams : null;
        if (c2308b != null) {
            ((ViewGroup.MarginLayoutParams) c2308b).topMargin = dimensionPixelSize;
            ((ViewGroup.MarginLayoutParams) c2308b).bottomMargin = dimensionPixelSize2;
            bLFrameLayout.setLayoutParams(c2308b);
        }
        helper.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.tv.adapter.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C15454k.m68593A(this.f53429a, tvChannelItem, helper, view);
            }
        });
    }
}
