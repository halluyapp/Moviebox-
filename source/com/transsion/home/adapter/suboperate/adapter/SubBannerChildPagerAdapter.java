package com.transsion.home.adapter.suboperate.adapter;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import ck.C5123t;
import com.blankj.utilcode.util.Utils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.hisavana.common.bean.TAdNativeInfo;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$mipmap;
import com.p282tn.lib.widget.R$string;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baselib.helper.C14451b;
import com.transsion.home.R$drawable;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.trending.BannerADDataHelper;
import com.transsion.home.bean.BannerData;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.moviedetailapi.AbstractC16247h;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Image;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.monopoly.model.AdMaterialList;
import com.transsion.p285ad.monopoly.model.AdPlans;
import com.transsion.p285ad.monopoly.model.MbAdImage;
import com.transsion.p285ad.monopoly.plan.C14033c;
import com.transsion.p285ad.strategy.C14057b;
import com.transsnet.downloader.DownloadManagerApi;
import fk.AbstractC23384a;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import ml.AbstractC25888b;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p576lg.C25633a;
import p743rh.C27287m;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes5.dex */
public final class SubBannerChildPagerAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    private List f52142a;

    /* JADX INFO: renamed from: b */
    private final int f52143b;

    /* JADX INFO: renamed from: c */
    private final OperateItem f52144c;

    /* JADX INFO: renamed from: d */
    private final int f52145d;

    /* JADX INFO: renamed from: e */
    private final int f52146e;

    public static final class SubViewPagerViewHolder extends RecyclerView.AbstractC4203b0 {

        /* JADX INFO: renamed from: a */
        private final int f52147a;

        /* JADX INFO: renamed from: b */
        private final OperateItem f52148b;

        /* JADX INFO: renamed from: c */
        private final ImageView f52149c;

        /* JADX INFO: renamed from: d */
        private final ImageView f52150d;

        /* JADX INFO: renamed from: e */
        private final TextView f52151e;

        /* JADX INFO: renamed from: f */
        private final TextView f52152f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubViewPagerViewHolder(View itemView, int i11, OperateItem operateItem) {
            super(itemView);
            Intrinsics.m97802h(itemView, "itemView");
            Intrinsics.m97802h(operateItem, "operateItem");
            this.f52147a = i11;
            this.f52148b = operateItem;
            View viewFindViewById = itemView.findViewById(R$id.contentIV);
            Intrinsics.m97801g(viewFindViewById, "findViewById(...)");
            this.f52149c = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.playIV);
            Intrinsics.m97801g(viewFindViewById2, "findViewById(...)");
            this.f52150d = (ImageView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.titleTV);
            Intrinsics.m97801g(viewFindViewById3, "findViewById(...)");
            this.f52151e = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(R$id.desTV);
            Intrinsics.m97801g(viewFindViewById4, "findViewById(...)");
            this.f52152f = (TextView) viewFindViewById4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final Unit m66915h(BannerData bannerData, SubViewPagerViewHolder subViewPagerViewHolder, int i11, View it) {
            Intrinsics.m97802h(it, "it");
            String deepLink = bannerData.getDeepLink();
            if (deepLink != null) {
                if (!C27287m.f83003a.m106330e()) {
                    C28951b.f88586a.m111454d(R$string.no_network_toast);
                    return Unit.f75682a;
                }
                Uri uriM65157g = C14451b.f50862a.m65157g(Uri.parse(deepLink + "&module_name=opt_banner_free&autoPlay=true&ops=" + bannerData.getOps()));
                if (uriM65157g != null) {
                    AbstractC5114k.m23932o(uriM65157g);
                }
                subViewPagerViewHolder.m66917j(bannerData, i11, DownloadManagerApi.m87075x0(DownloadManagerApi.f66480j.m87093a(), bannerData.getSubjectId(), null, false, false, 12, null) ? "play_subject" : "download_subject");
            }
            return Unit.f75682a;
        }

        /* JADX INFO: renamed from: i */
        private final SpannableString m66916i(Subject subject) {
            int iIndexOf;
            List listR0;
            StringBuilder sb2 = new StringBuilder();
            String releaseDate = subject.getReleaseDate();
            String genre = subject.getGenre();
            String str = (genre == null || (listR0 = StringsKt.m98116R0(genre, new char[]{','}, false, 0, 6, null)) == null) ? null : (String) CollectionsKt.m97361k0(listR0);
            if (releaseDate != null && releaseDate.length() != 0) {
                sb2.append(" | ");
                sb2.append(releaseDate);
            }
            if (str != null) {
                sb2.append(" | ");
                sb2.append(str);
            }
            SpannableString spannableString = new SpannableString(sb2);
            if (releaseDate != null && releaseDate.length() != 0) {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Utils.m27275a().getResources().getColor(R$color.white_20));
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(Utils.m27275a().getResources().getColor(R$color.white_60));
                spannableString.setSpan(foregroundColorSpan, 0, 3, 17);
                spannableString.setSpan(foregroundColorSpan2, 3, releaseDate.length() + 3, 17);
            }
            if (str != null && (iIndexOf = sb2.indexOf(str)) >= 3) {
                ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(Utils.m27275a().getResources().getColor(R$color.white_20));
                ForegroundColorSpan foregroundColorSpan4 = new ForegroundColorSpan(Utils.m27275a().getResources().getColor(R$color.white_60));
                spannableString.setSpan(foregroundColorSpan3, iIndexOf - 3, iIndexOf, 17);
                spannableString.setSpan(foregroundColorSpan4, iIndexOf, sb2.length(), 17);
            }
            return spannableString;
        }

        /* JADX INFO: renamed from: j */
        private final void m66917j(BannerData bannerData, int i11, String str) {
            HashMap map = new HashMap();
            map.put("event_type", "click_banner_poster");
            map.put("sequence", String.valueOf(i11));
            map.put("module_name", str);
            map.put("tabId", String.valueOf(this.f52147a));
            if (bannerData != null) {
                AbstractC25888b.m101680c(bannerData, map);
            }
            AbstractC25888b.m101678a(this.f52148b, map);
            C14450a.f50860a.m65143f(SubTabFragment.INSTANCE.m68282a(this.f52147a), map);
        }

        /* JADX INFO: renamed from: k */
        private final void m66918k(BannerData bannerData, ImageView imageView) {
            if (!(bannerData != null ? Intrinsics.m97797c(bannerData.getHasResource(), Boolean.TRUE) : false)) {
                imageView.setImageResource(R$drawable.ic_trending_arrow);
            } else if (!C5123t.f17614a.m23960b() || bannerData.getSubjectType() == SubjectType.SHORT_TV.getValue()) {
                imageView.setImageResource(R$drawable.ic_trending_download);
            } else {
                imageView.setImageResource(R$drawable.ic_trending_play);
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m66919g(final BannerData bannerData, final int i11) {
            String url;
            String thumbnail;
            Cover cover;
            Cover cover2;
            Intrinsics.m97802h(bannerData, "bannerData");
            Subject subject = bannerData.getSubject();
            if (subject == null || (cover2 = subject.getCover()) == null || (url = cover2.getUrl()) == null) {
                Image image = bannerData.getImage();
                url = image != null ? image.getUrl() : null;
            }
            Subject subject2 = bannerData.getSubject();
            if (subject2 == null || (cover = subject2.getCover()) == null || (thumbnail = cover.getThumbnail()) == null) {
                Image image2 = bannerData.getImage();
                thumbnail = image2 != null ? image2.getThumbnail() : null;
            }
            if (bannerData.getBuiltIn()) {
                AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new SubBannerChildPagerAdapter$SubViewPagerViewHolder$bindData$1(url, this, null), 3, null);
            } else {
                C23860f.a aVar = C23860f.f72909a;
                Context context = this.f52149c.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94457m = aVar.m94457m(context);
                if (url == null) {
                    url = "";
                }
                C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
                if (thumbnail == null) {
                    thumbnail = "";
                }
                bVarM94468g.m94473l(thumbnail).m94470i(R$mipmap.ic_img_placeholder).m94474m(AbstractC23384a.m92908b(40)).m94464c(AbstractC23384a.m92908b(56)).m94465d(this.f52149c);
            }
            this.itemView.setClickable(false);
            Subject subject3 = bannerData.getSubject();
            if (subject3 != null) {
                TextView textView = this.f52151e;
                String title = subject3.getTitle();
                textView.setText(title != null ? title : "");
                SpannableString spannableStringM66916i = m66916i(subject3);
                if (spannableStringM66916i.length() > 0) {
                    this.f52152f.setText(spannableStringM66916i);
                    this.f52152f.setCompoundDrawablesWithIntrinsicBounds(AbstractC16247h.m71009a(subject3.getSubjectType()), 0, 0, 0);
                }
            }
            if (bannerData.getSubject() == null) {
                this.f52151e.setText(bannerData.getContent());
                this.f52152f.setText((CharSequence) null);
            }
            CharSequence text = this.f52152f.getText();
            if (text == null || text.length() == 0) {
                this.f52152f.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            TextView textView2 = this.f52152f;
            CharSequence text2 = textView2.getText();
            textView2.setVisibility(text2 == null || text2.length() == 0 ? 8 : 0);
            View itemView = this.itemView;
            Intrinsics.m97801g(itemView, "itemView");
            AbstractC26006c.m102050c(itemView, 0L, new Function1() { // from class: com.transsion.home.adapter.suboperate.adapter.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SubBannerChildPagerAdapter.SubViewPagerViewHolder.m66915h(bannerData, this, i11, (View) obj);
                }
            }, 1, null);
            m66918k(bannerData, this.f52150d);
        }

        public final ImageView getImageView() {
            return this.f52149c;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.adapter.SubBannerChildPagerAdapter$a */
    public static final class C14922a extends RecyclerView.AbstractC4203b0 {

        /* JADX INFO: renamed from: a */
        private final ImageView f52153a;

        /* JADX INFO: renamed from: b */
        private final ImageView f52154b;

        /* JADX INFO: renamed from: c */
        private final ImageView f52155c;

        /* JADX INFO: renamed from: d */
        private final TextView f52156d;

        /* JADX INFO: renamed from: e */
        private final TextView f52157e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14922a(View itemView) {
            super(itemView);
            Intrinsics.m97802h(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.iconBg);
            Intrinsics.m97801g(viewFindViewById, "findViewById(...)");
            this.f52153a = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.contentIV);
            Intrinsics.m97801g(viewFindViewById2, "findViewById(...)");
            this.f52154b = (ImageView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.playIV);
            Intrinsics.m97801g(viewFindViewById3, "findViewById(...)");
            this.f52155c = (ImageView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(R$id.titleTV);
            Intrinsics.m97801g(viewFindViewById4, "findViewById(...)");
            this.f52156d = (TextView) viewFindViewById4;
            View viewFindViewById5 = itemView.findViewById(R$id.desTV);
            Intrinsics.m97801g(viewFindViewById5, "findViewById(...)");
            this.f52157e = (TextView) viewFindViewById5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final Unit m66922i(View it) {
            Intrinsics.m97802h(it, "it");
            BannerADDataHelper.f52406a.m67192l();
            return Unit.f75682a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final Unit m66923j(AdMaterialList adMaterialList, AdPlans adPlans, View it) {
            Intrinsics.m97802h(it, "it");
            C14057b.f49739a.m63673a(adMaterialList != null ? adMaterialList.getDeeplink() : null, adMaterialList != null ? adMaterialList.getH5Link() : null, adPlans);
            return Unit.f75682a;
        }

        /* JADX INFO: renamed from: h */
        public final void m66924h(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
            final AdPlans plans;
            String url;
            String thumbnail;
            if (biddingIntermediateMaterialBean == null || (plans = biddingIntermediateMaterialBean.getPlans()) == null) {
                return;
            }
            TAdNativeInfo nativeInfo = biddingIntermediateMaterialBean.getNativeInfo();
            if (nativeInfo != null) {
                this.f52156d.setText(nativeInfo.getTitle());
                this.f52157e.setText(nativeInfo.getDescription());
                RequestManager requestManagerWith = Glide.with(this.f52153a.getContext());
                TAdNativeInfo.Image icon = nativeInfo.getIcon();
                requestManagerWith.load2(icon != null ? icon.getUrl() : null).transform(new C25633a(50, 8, true)).into(this.f52153a);
                this.f52154b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                RequestManager requestManagerWith2 = Glide.with(this.f52154b.getContext());
                TAdNativeInfo.Image icon2 = nativeInfo.getIcon();
                requestManagerWith2.load2(icon2 != null ? icon2.getUrl() : null).placeholder(R$mipmap.ic_img_placeholder).into(this.f52154b);
                this.f52155c.setImageResource(R$drawable.ic_trending_arrow);
                View itemView = this.itemView;
                Intrinsics.m97801g(itemView, "itemView");
                AbstractC26006c.m102050c(itemView, 0L, new Function1() { // from class: com.transsion.home.adapter.suboperate.adapter.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SubBannerChildPagerAdapter.C14922a.m66922i((View) obj);
                    }
                }, 1, null);
                return;
            }
            C14033c c14033c = C14033c.f49684a;
            AdMaterialList adMaterialListM63467c = c14033c.m63467c(plans);
            MbAdImage mbAdImageM63465a = c14033c.m63465a(plans);
            this.f52154b.setImageResource(R$mipmap.ic_img_placeholder);
            C23860f.a aVar = C23860f.f72909a;
            Context context = this.f52154b.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(context);
            String str = "";
            if (mbAdImageM63465a == null || (url = mbAdImageM63465a.getUrl()) == null) {
                url = "";
            }
            C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
            if (mbAdImageM63465a != null && (thumbnail = mbAdImageM63465a.getThumbnail()) != null) {
                str = thumbnail;
            }
            bVarM94468g.m94473l(str).m94470i(R$mipmap.ic_img_placeholder).m94474m(AbstractC23384a.m92908b(40)).m94464c(AbstractC23384a.m92908b(56)).m94465d(this.f52154b);
            this.f52154b.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f52156d.setText(adMaterialListM63467c != null ? adMaterialListM63467c.getTitle() : null);
            this.f52157e.setText(adMaterialListM63467c != null ? adMaterialListM63467c.getDesc() : null);
            this.f52157e.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f52155c.setImageResource(R$drawable.ic_trending_arrow);
            final AdMaterialList adMaterialListM63467c2 = c14033c.m63467c(plans);
            View itemView2 = this.itemView;
            Intrinsics.m97801g(itemView2, "itemView");
            AbstractC26006c.m102050c(itemView2, 0L, new Function1() { // from class: com.transsion.home.adapter.suboperate.adapter.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SubBannerChildPagerAdapter.C14922a.m66923j(adMaterialListM63467c2, plans, (View) obj);
                }
            }, 1, null);
        }
    }

    public SubBannerChildPagerAdapter(List banners, int i11, OperateItem operateItem) {
        Intrinsics.m97802h(banners, "banners");
        Intrinsics.m97802h(operateItem, "operateItem");
        this.f52142a = banners;
        this.f52143b = i11;
        this.f52144c = operateItem;
        this.f52146e = 1;
    }

    /* JADX INFO: renamed from: g */
    private final BannerData m66912g(int i11) {
        int size;
        if (!this.f52142a.isEmpty() && (size = i11 % this.f52142a.size()) >= 0 && size < this.f52142a.size()) {
            return (BannerData) this.f52142a.get(size);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i11) {
        BannerData bannerDataM66912g = m66912g(i11);
        return (bannerDataM66912g != null ? bannerDataM66912g.getBiddingAdData() : null) != null ? this.f52146e : this.f52145d;
    }

    /* JADX INFO: renamed from: h */
    public final void m66913h(List list) {
        Intrinsics.m97802h(list, "<set-?>");
        this.f52142a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC4203b0 holder, int i11) {
        Intrinsics.m97802h(holder, "holder");
        if (this.f52142a.isEmpty()) {
            return;
        }
        int size = i11 % this.f52142a.size();
        BannerData bannerData = (BannerData) this.f52142a.get(size);
        if (bannerData == null) {
            return;
        }
        if (holder instanceof C14922a) {
            ((C14922a) holder).m66924h(bannerData.getBiddingAdData());
        } else if (holder instanceof SubViewPagerViewHolder) {
            ((SubViewPagerViewHolder) holder).m66919g(bannerData, size);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.AbstractC4203b0 onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.item_sub_top_banner_card, parent, false);
        if (i11 == this.f52146e) {
            Intrinsics.m97799e(viewInflate);
            return new C14922a(viewInflate);
        }
        Intrinsics.m97799e(viewInflate);
        return new SubViewPagerViewHolder(viewInflate, this.f52143b, this.f52144c);
    }
}
