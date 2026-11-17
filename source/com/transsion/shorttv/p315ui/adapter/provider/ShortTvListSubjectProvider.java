package com.transsion.shorttv.p315ui.adapter.provider;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5780c0;
import com.blankj.utilcode.util.AbstractC5802u;
import com.blankj.utilcode.util.AbstractC5806y;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.transsion.p285ad.bidding.base.AbstractC13924r;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import com.transsion.shorttv.R$color;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.R$mipmap;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv.base.widget.C18792f;
import com.transsion.shorttv.bean.Cover;
import com.transsion.shorttv.bean.Subject;
import com.transsion.shorttv.p315ui.adapter.C18952s;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p331ct.C22777a;
import p356ds.AbstractC23048b;
import p416fs.C23424b;
import p765s6.InterfaceC27566d;
import p988zr.C29239b;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTvListSubjectProvider extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final String f61024e;

    /* JADX INFO: renamed from: f */
    private final boolean f61025f;

    public ShortTvListSubjectProvider(String pageName, boolean z11) {
        Intrinsics.m97802h(pageName, "pageName");
        this.f61024e = pageName;
        this.f61025f = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m79584A(BaseViewHolder baseViewHolder, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        baseViewHolder.itemView.performClick();
    }

    /* JADX INFO: renamed from: B */
    private final void m79585B(AppCompatImageView appCompatImageView, Subject subject) {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new ShortTvListSubjectProvider$loadBuiltInCover$1(subject, appCompatImageView, null), 3, null);
    }

    /* JADX INFO: renamed from: C */
    private final void m79586C(AppCompatImageView appCompatImageView, Subject subject) {
        String thumbnail;
        String url;
        C23424b.a aVar = C23424b.f71424a;
        Context context = appCompatImageView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        Cover cover = subject.getCover();
        String str = (cover == null || (url = cover.getUrl()) == null) ? "" : url;
        int i11 = R$color.short_tv_module_04;
        Cover cover2 = subject.getCover();
        aVar.m93010j(context, appCompatImageView, str, (8096 & 8) != 0 ? aVar.m93007c() : i11, (8096 & 16) != 0 ? aVar.m93006b() : 0, (8096 & 32) != 0, (8096 & 64) != 0 ? "" : (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) ? "" : thumbnail, (8096 & 128) != 0, (8096 & 256) != 0, (8096 & 512) != 0 ? false : false, (8096 & 1024) != 0 ? false : false, (8096 & 2048) != 0 ? false : false, (8096 & 4096) != 0 ? 25 : 0);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 1;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.short_tv_item_trending;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo22757b(final BaseViewHolder holder, C22777a data) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(data, "data");
        Subject subjectM90707b = data.m90707b();
        if (subjectM90707b == null) {
            return;
        }
        holder.getView(R$id.tv_title_trending).setVisibility(subjectM90707b.getShowTitle() ? 0 : 8);
        if (subjectM90707b.getNonAdDelegate() != null) {
            ((FrameLayout) holder.getView(R$id.flAdContainer)).setVisibility(0);
            ((Group) holder.getView(R$id.group)).setVisibility(8);
            C29239b c29239b = C29239b.f89220a;
            Context contextM36338k = m36338k();
            BiddingNativeManager nonAdDelegate = subjectM90707b.getNonAdDelegate();
            AbstractC13924r abstractC13924rM112121a = c29239b.m112121a(contextM36338k, nonAdDelegate != null ? nonAdDelegate.getMSceneId() : null);
            NativeWrapperAdView nativeWrapperAdView = (NativeWrapperAdView) holder.getViewOrNull(R$id.flAdContainer);
            if (nativeWrapperAdView != null) {
                BiddingNativeManager nonAdDelegate2 = subjectM90707b.getNonAdDelegate();
                BiddingNativeManager nonAdDelegate3 = subjectM90707b.getNonAdDelegate();
                nativeWrapperAdView.bindNativeView(nonAdDelegate2, abstractC13924rM112121a, nonAdDelegate3 != null ? nonAdDelegate3.m62848k0() : null);
                return;
            }
            return;
        }
        ((FrameLayout) holder.getView(R$id.flAdContainer)).setVisibility(8);
        ((Group) holder.getView(R$id.group)).setVisibility(0);
        AppCompatImageView appCompatImageView = (AppCompatImageView) holder.getView(R$id.iv_cover);
        if (subjectM90707b.getBuiltIn()) {
            m79585B(appCompatImageView, subjectM90707b);
        } else {
            m79586C(appCompatImageView, subjectM90707b);
        }
        TextView textView = (TextView) holder.getView(R$id.tv_title);
        textView.setText(subjectM90707b.getTitle());
        boolean z11 = new StaticLayout(subjectM90707b.getTitle(), textView.getPaint(), AbstractC5806y.m27489e() - AbstractC5776a0.m27313a(139.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getLineCount() > 1;
        TextView textView2 = (TextView) holder.getView(R$id.tv_type);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String releaseDate = subjectM90707b.getReleaseDate();
        if (releaseDate != null && releaseDate.length() != 0) {
            Date dateM27346l = AbstractC5780c0.m27346l(subjectM90707b.getReleaseDate(), "yyyy-MM-dd");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateM27346l);
            spannableStringBuilder.append((CharSequence) String.valueOf(calendar.get(1)));
        }
        String[] strArrM27460a = AbstractC5802u.m27460a(subjectM90707b.getGenre(), ",");
        if (strArrM27460a != null) {
            for (String str : strArrM27460a) {
                spannableStringBuilder.append((CharSequence) " · ").append((CharSequence) str);
            }
        }
        String countryName = subjectM90707b.getCountryName();
        if (countryName != null && countryName.length() != 0) {
            spannableStringBuilder.append((CharSequence) " · ").append((CharSequence) subjectM90707b.getCountryName());
        }
        textView2.setText(spannableStringBuilder);
        List<String> tags = subjectM90707b.getTags();
        if (tags == null) {
            tags = new ArrayList<>();
        }
        RecyclerView recyclerView = (RecyclerView) holder.getView(R$id.rv_list);
        if (tags.isEmpty()) {
            AbstractC23048b.m91691b(recyclerView);
        } else {
            C18952s c18952s = new C18952s(CollectionsKt.m97343U0(tags));
            c18952s.m36227w1(new InterfaceC27566d() { // from class: com.transsion.shorttv.ui.adapter.provider.g
                @Override // p765s6.InterfaceC27566d
                /* JADX INFO: renamed from: a */
                public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                    ShortTvListSubjectProvider.m79584A(holder, baseQuickAdapter, view, i11);
                }
            });
            FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getContext());
            flexboxLayoutManager.m44837c0(0);
            flexboxLayoutManager.m44838d0(1);
            flexboxLayoutManager.m44839e0(0);
            recyclerView.setLayoutManager(flexboxLayoutManager);
            if (recyclerView.getItemDecorationCount() <= 0) {
                recyclerView.addItemDecoration(new C18792f(AbstractC5776a0.m27313a(4.0f)));
            }
            recyclerView.setAdapter(c18952s);
            AbstractC23048b.m91694e(recyclerView);
        }
        TextView textView3 = (TextView) holder.getView(R$id.tv_desc);
        textView3.setMaxLines(z11 ? 1 : 2);
        String str2 = this.f61024e;
        if (Intrinsics.m97797c(str2, "minitv_explore")) {
            textView3.setText(subjectM90707b.getDescription());
        } else if (Intrinsics.m97797c(str2, "minitv_favorite")) {
            textView3.setText(subjectM90707b.getTotalEpisode() + " EPs");
        }
        TextView textView4 = (TextView) holder.getView(R$id.btn_download);
        textView4.setText(this.f61025f ? Utils.m27275a().getString(R$string.short_tv_download) : Utils.m27275a().getString(R$string.short_tv_play));
        textView4.setCompoundDrawablesWithIntrinsicBounds(this.f61025f ? R$mipmap.short_tv_ic_download_white : R$mipmap.short_tv_ic_play_white_trending, 0, 0, 0);
    }
}
