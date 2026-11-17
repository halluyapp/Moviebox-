package com.transsion.home.adapter.suboperate.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.AbstractC5806y;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.hisavana.common.bean.TAdNativeInfo;
import com.transsion.gslb.GslbSdk;
import com.transsion.gslb.Utils;
import com.transsion.home.R$id;
import com.transsion.home.adapter.trending.BannerADDataHelper;
import com.transsion.home.bean.BannerData;
import com.transsion.p285ad.bidding.base.AbstractC13924r;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.monopoly.model.AdPlans;
import com.transsion.p285ad.monopoly.model.MbAdImage;
import com.transsion.p285ad.monopoly.plan.C14033c;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.JobKt__JobKt;
import ng.AbstractC26006c;
import p391ey.C23245b;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
public final class SubBannerADViewHolder extends RecyclerView.AbstractC4203b0 {

    /* JADX INFO: renamed from: h */
    public static final C14919a f52128h = new C14919a(null);

    /* JADX INFO: renamed from: i */
    public static final int f52129i = 8;

    /* JADX INFO: renamed from: j */
    private static final int f52130j = Color.parseColor("#101114");

    /* JADX INFO: renamed from: k */
    private static final int f52131k = AbstractC5776a0.m27313a(237.0f);

    /* JADX INFO: renamed from: l */
    private static final int f52132l = AbstractC5776a0.m27313a(37.0f);

    /* JADX INFO: renamed from: m */
    private static final int f52133m = AbstractC5776a0.m27313a(57.0f);

    /* JADX INFO: renamed from: a */
    private final View f52134a;

    /* JADX INFO: renamed from: b */
    private final View f52135b;

    /* JADX INFO: renamed from: c */
    private final View f52136c;

    /* JADX INFO: renamed from: d */
    private final FrameLayout f52137d;

    /* JADX INFO: renamed from: e */
    private final NativeWrapperAdView f52138e;

    /* JADX INFO: renamed from: f */
    private AbstractC13924r f52139f;

    /* JADX INFO: renamed from: g */
    private InterfaceC25149n0 f52140g;

    /* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.adapter.SubBannerADViewHolder$a */
    public static final class C14919a {
        private C14919a() {
        }

        public /* synthetic */ C14919a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubBannerADViewHolder(View itemView) {
        super(itemView);
        Intrinsics.m97802h(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.home_sub_pager_items_status);
        Intrinsics.m97801g(viewFindViewById, "findViewById(...)");
        this.f52134a = viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.home_sub_pager_items_space);
        Intrinsics.m97801g(viewFindViewById2, "findViewById(...)");
        this.f52135b = viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.home_sub_pager_items_top_mask);
        Intrinsics.m97801g(viewFindViewById3, "findViewById(...)");
        this.f52136c = viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.home_sub_pager_items_container);
        Intrinsics.m97801g(viewFindViewById4, "findViewById(...)");
        this.f52137d = (FrameLayout) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.nativeView);
        Intrinsics.m97801g(viewFindViewById5, "findViewById(...)");
        this.f52138e = (NativeWrapperAdView) viewFindViewById5;
    }

    /* JADX INFO: renamed from: j */
    private final GradientDrawable m66906j(String str) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setColors(new int[]{Color.parseColor(StringsKt.m98236Q(str, Utils.SEPARATOR, "#ff", false, 4, null)), Color.parseColor(StringsKt.m98236Q(str, Utils.SEPARATOR, "#ff", false, 4, null)), Color.parseColor(StringsKt.m98236Q(str, Utils.SEPARATOR, "#00", false, 4, null))});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: l */
    private final void m66907l(TAdNativeInfo tAdNativeInfo) {
        TAdNativeInfo.Image image;
        ViewGroup.LayoutParams layoutParams = this.f52138e.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
        }
        List<TAdNativeInfo.Image> imageList = tAdNativeInfo.getImageList();
        String url = (imageList == null || (image = (TAdNativeInfo.Image) CollectionsKt.m97361k0(imageList)) == null) ? null : image.getUrl();
        if (url == null || StringsKt.m98160q0(url)) {
            m66908m(ViewCompat.MEASURED_STATE_MASK);
        } else {
            Glide.with(GslbSdk.context).asBitmap().load2(url).into(new CustomTarget() { // from class: com.transsion.home.adapter.suboperate.adapter.SubBannerADViewHolder$renderHiADMask$1
                @Override // com.bumptech.glide.request.target.Target
                public void onLoadCleared(Drawable drawable) {
                }

                @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
                public void onLoadFailed(Drawable drawable) {
                    C26866a.a.m104898f(C26866a.f81698a, "BannerADDataHelper", "onLoadFailed", false, 4, null);
                    this.f52141a.m66908m(ViewCompat.MEASURED_STATE_MASK);
                }

                @Override // com.bumptech.glide.request.target.Target
                public void onResourceReady(Bitmap resource, Transition transition) {
                    Intrinsics.m97802h(resource, "resource");
                    InterfaceC25149n0 interfaceC25149n0 = this.f52141a.f52140g;
                    if (interfaceC25149n0 != null) {
                        AbstractC25136k.m99058d(interfaceC25149n0, C25220y0.m99268b(), null, new SubBannerADViewHolder$renderHiADMask$1$onResourceReady$1(resource, this.f52141a, null), 2, null);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final void m66908m(int i11) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
        String str = String.format(Locale.ROOT, "#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(16777215 & i11)}, 1));
        Intrinsics.m97801g(str, "format(...)");
        this.f52134a.setBackgroundColor(i11);
        this.f52135b.setBackgroundColor(i11);
        this.f52136c.setBackground(m66906j(str));
        this.f52138e.post(new Runnable() { // from class: com.transsion.home.adapter.suboperate.adapter.f
            @Override // java.lang.Runnable
            public final void run() {
                SubBannerADViewHolder.m66909n(this.f52207a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m66909n(SubBannerADViewHolder subBannerADViewHolder) {
        int i11;
        int measuredHeight = subBannerADViewHolder.f52138e.getMeasuredHeight();
        if (measuredHeight == 0) {
            i11 = f52132l;
        } else {
            i11 = measuredHeight < 10 ? 1 : f52131k - measuredHeight;
        }
        subBannerADViewHolder.f52135b.getLayoutParams().height = RangesKt.m97942l(i11, 1, f52133m);
        C26866a.a.m104898f(C26866a.f81698a, "BannerADDataHelper", "nativeViewHeight: " + measuredHeight + ", space height: " + i11 + ", space.layoutParams.height: " + subBannerADViewHolder.f52135b.getLayoutParams().height, false, 4, null);
        subBannerADViewHolder.f52135b.requestLayout();
        AbstractC26006c.m102058k(subBannerADViewHolder.f52135b);
    }

    /* JADX INFO: renamed from: i */
    public final void m66910i(BannerData bannerData) {
        BiddingIntermediateMaterialBean biddingAdData;
        InterfaceC25149n0 interfaceC25149n0 = this.f52140g;
        if (interfaceC25149n0 == null || !AbstractC25153o0.m99085g(interfaceC25149n0)) {
            this.f52140g = AbstractC25153o0.m99079a(C25220y0.m99269c().plus(JobKt__JobKt.m98377b(null, 1, null)));
        }
        this.f52134a.getLayoutParams().height = AbstractC5781d.m27351c();
        this.f52137d.getLayoutParams().height = ((AbstractC5806y.m27489e() * 9) / 16) + AbstractC5776a0.m27313a(44.0f);
        if (this.f52139f == null) {
            C23245b c23245b = C23245b.f70802a;
            Context context = this.itemView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            this.f52139f = c23245b.m92309a(context, "TrendingNativeBannerScene");
        }
        BannerADDataHelper.f52406a.m67189i(this.f52138e, this.f52139f, bannerData != null ? bannerData.getBiddingAdData() : null);
        if (bannerData == null || (biddingAdData = bannerData.getBiddingAdData()) == null) {
            return;
        }
        this.f52135b.getLayoutParams().height = 0;
        AbstractC26006c.m102054g(this.f52135b);
        TAdNativeInfo nativeInfo = biddingAdData.getNativeInfo();
        if (nativeInfo != null) {
            m66907l(nativeInfo);
            return;
        }
        AdPlans plans = biddingAdData.getPlans();
        if (plans != null) {
            ViewGroup.LayoutParams layoutParams = this.f52138e.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -1;
            }
            MbAdImage mbAdImageM63466b = C14033c.f49684a.m63466b(plans);
            String averageHueDark = mbAdImageM63466b != null ? mbAdImageM63466b.getAverageHueDark() : null;
            if (averageHueDark != null && StringsKt.m98132c0(averageHueDark, Utils.SEPARATOR, false, 2, null)) {
                this.f52134a.setBackgroundColor(Color.parseColor(averageHueDark));
                this.f52136c.setBackground(m66906j(averageHueDark));
                return;
            }
            int i11 = f52130j;
            this.f52134a.setBackgroundColor(i11);
            View view = this.f52136c;
            StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
            String str = String.format(Locale.ROOT, "#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i11 & 16777215)}, 1));
            Intrinsics.m97801g(str, "format(...)");
            view.setBackground(m66906j(str));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m66911k() {
        BannerADDataHelper.f52406a.m67194n();
        InterfaceC25149n0 interfaceC25149n0 = this.f52140g;
        if (interfaceC25149n0 != null) {
            AbstractC25153o0.m99082d(interfaceC25149n0, null, 1, null);
        }
    }
}
