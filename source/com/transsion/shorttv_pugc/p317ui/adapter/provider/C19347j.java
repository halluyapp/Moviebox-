package com.transsion.shorttv_pugc.p317ui.adapter.provider;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.p284to.aboomy.pager2banner.C13890b;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv_pugc.bean.BannerBean;
import com.transsion.shorttv_pugc.bean.BannerData;
import com.transsion.shorttv_pugc.bean.Image;
import com.transsion.shorttv_pugc.bean.OperateItem;
import com.transsion.shorttv_pugc.bean.ShortTvItemType;
import com.transsion.shorttv_pugc.p317ui.adapter.ShortTVBannerAdapter;
import com.transsion.shorttv_pugc.p317ui.widget.ShortTVBannerView;
import com.transsion.shorttv_pugc.utils.C19522a;
import ht.AbstractC23895a;
import is.AbstractC24222c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import l00.C25472a;
import p527jt.C24468a;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.adapter.provider.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C19347j extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final Fragment f62054e;

    /* JADX INFO: renamed from: f */
    private final String f62055f;

    /* JADX INFO: renamed from: g */
    private final boolean f62056g;

    /* JADX INFO: renamed from: h */
    private final boolean f62057h;

    /* JADX INFO: renamed from: i */
    private final int f62058i;

    /* JADX INFO: renamed from: j */
    private ShortTVBannerAdapter f62059j;

    /* JADX INFO: renamed from: k */
    private final Lazy f62060k;

    /* JADX INFO: renamed from: l */
    private int f62061l;

    /* JADX INFO: renamed from: m */
    private long f62062m;

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.adapter.provider.j$a */
    public static final class a extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f62064b;

        a(View view) {
            this.f62064b = view;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            C19347j c19347j = C19347j.this;
            c19347j.m80881O(this.f62064b, i11, c19347j.f62061l, f11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            if (C19347j.this.f62054e.isResumed()) {
                C19347j.this.m80879M();
                C19347j.this.f62062m = System.currentTimeMillis();
            }
            C19347j.this.f62061l = i11;
        }
    }

    public C19347j(Fragment fragment, String pageName, boolean z11, boolean z12) {
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(pageName, "pageName");
        this.f62054e = fragment;
        this.f62055f = pageName;
        this.f62056g = z11;
        this.f62057h = z12;
        this.f62058i = AbstractC5781d.m27351c();
        this.f62060k = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.ui.adapter.provider.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C19347j.m80875H(this.f62050a);
            }
        });
        this.f62061l = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C19522a m80875H(C19347j c19347j) {
        return new C19522a(c19347j.f62055f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final Unit m80876J(C19347j c19347j, View view, int i11, BannerData item) {
        Intrinsics.m97802h(view, "<unused var>");
        Intrinsics.m97802h(item, "item");
        c19347j.m80880N(i11, item);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final void m80877K(C19347j c19347j, View view) {
        c19347j.m80881O(view, 0, 0, 0.0f);
    }

    /* JADX INFO: renamed from: L */
    private final C19522a m80878L() {
        return (C19522a) this.f62060k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final void m80879M() {
        List data;
        BannerData bannerData;
        List data2;
        int i11 = this.f62061l;
        if (i11 >= 0) {
            ShortTVBannerAdapter shortTVBannerAdapter = this.f62059j;
            if (i11 >= ((shortTVBannerAdapter == null || (data2 = shortTVBannerAdapter.getData()) == null) ? 0 : data2.size())) {
                return;
            }
            long jCurrentTimeMillis = this.f62062m > 0 ? System.currentTimeMillis() - this.f62062m : 0L;
            ShortTVBannerAdapter shortTVBannerAdapter2 = this.f62059j;
            if (shortTVBannerAdapter2 == null || (data = shortTVBannerAdapter2.getData()) == null || (bannerData = (BannerData) data.get(this.f62061l)) == null) {
                return;
            }
            C19522a c19522aM80878L = m80878L();
            String str = this.f62055f;
            String value = ShortTvItemType.BANNER.getValue();
            String subjectId = bannerData.getSubjectId();
            Boolean hasResource = bannerData.getHasResource();
            String deepLink = bannerData.getDeepLink();
            Integer numValueOf = Integer.valueOf(this.f62061l);
            Image image = bannerData.getImage();
            c19522aM80878L.m81321a((4144 & 1) != 0 ? null : str, (4144 & 2) != 0 ? null : "opt", (4144 & 4) != 0 ? null : value, (4144 & 8) != 0 ? null : subjectId, (4144 & 16) != 0 ? null : null, (4144 & 32) != 0 ? null : null, (4144 & 64) != 0 ? null : hasResource, (4144 & 128) != 0 ? null : deepLink, (4144 & 256) != 0 ? null : numValueOf, (4144 & 512) != 0 ? null : image != null ? image.getUrl() : null, (4144 & 1024) != 0 ? 0L : jCurrentTimeMillis, (4144 & 2048) != 0 ? Boolean.FALSE : Boolean.valueOf(bannerData.getBuiltIn()), (4144 & 4096) == 0 ? null : null);
        }
    }

    /* JADX INFO: renamed from: N */
    private final void m80880N(int i11, BannerData bannerData) {
        C19522a c19522aM80878L = m80878L();
        String str = this.f62055f;
        ShortTvItemType shortTvItemType = ShortTvItemType.BANNER;
        String value = shortTvItemType.getValue();
        String subjectId = bannerData.getSubjectId();
        Boolean hasResource = bannerData.getHasResource();
        String deepLink = bannerData.getDeepLink();
        Integer numValueOf = Integer.valueOf(i11);
        Image image = bannerData.getImage();
        c19522aM80878L.m81322c(str, "opt", value, (4272 & 8) != 0 ? null : subjectId, (4272 & 16) != 0 ? null : null, (4272 & 32) != 0 ? null : null, (4272 & 64) != 0 ? null : hasResource, (4272 & 128) != 0 ? null : null, (4272 & 256) != 0 ? null : deepLink, (4272 & 512) != 0 ? null : numValueOf, (4272 & 1024) != 0 ? null : image != null ? image.getUrl() : null, (4272 & 2048) != 0 ? Boolean.FALSE : Boolean.valueOf(bannerData.getBuiltIn()), (4272 & 4096) != 0 ? null : null);
        String deepLink2 = bannerData.getDeepLink();
        if (deepLink2 != null) {
            Uri uriM96009a = C24468a.f74627a.m96009a(Uri.parse(deepLink2 + "&ops=" + shortTvItemType.getValue()));
            if (uriM96009a != null) {
                AbstractC24222c.m95245j(uriM96009a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public final void m80881O(View view, int i11, int i12, float f11) {
        Image image;
        String averageHueDark;
        Image image2;
        String averageHueDark2;
        List data;
        List data2;
        ShortTVBannerAdapter shortTVBannerAdapter = this.f62059j;
        BannerData bannerData = null;
        BannerData bannerData2 = (shortTVBannerAdapter == null || (data2 = shortTVBannerAdapter.getData()) == null) ? null : (BannerData) data2.get(i11);
        ShortTVBannerAdapter shortTVBannerAdapter2 = this.f62059j;
        if (shortTVBannerAdapter2 != null && (data = shortTVBannerAdapter2.getData()) != null) {
            bannerData = (BannerData) data.get(i12);
        }
        if (bannerData2 == null || (image = bannerData2.getImage()) == null || (averageHueDark = image.getAverageHueDark()) == null || bannerData == null || (image2 = bannerData.getImage()) == null || (averageHueDark2 = image2.getAverageHueDark()) == null) {
            return;
        }
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i11 == i12 ? Color.parseColor(averageHueDark) : C25472a.m100075a(f11, Color.parseColor(averageHueDark), Color.parseColor(averageHueDark2)), 0}));
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, OperateItem item) {
        List<BannerData> banners;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        BannerBean banner = item.getBanner();
        if (banner == null || (banners = banner.getBanners()) == null) {
            return;
        }
        final View view = helper.getView(R$id.v_banner_bg);
        helper.getView(R$id.v_top_space);
        View view2 = helper.getView(R$id.v_bar_space);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
        ((ViewGroup.MarginLayoutParams) c2308b).height = this.f62058i + AbstractC23895a.m94638a(this.f62057h ? 50 : 10);
        view2.setLayoutParams(c2308b);
        ShortTVBannerView shortTVBannerView = (ShortTVBannerView) helper.getView(R$id.banner);
        ShortTVBannerAdapter shortTVBannerAdapter = new ShortTVBannerAdapter();
        shortTVBannerAdapter.m80779k(new Function3() { // from class: com.transsion.shorttv_pugc.ui.adapter.provider.h
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C19347j.m80876J(this.f62051a, (View) obj, ((Integer) obj2).intValue(), (BannerData) obj3);
            }
        });
        shortTVBannerView.setAutoTurningTime(4000L);
        shortTVBannerView.setPagerScrollDuration(1000L);
        shortTVBannerView.setPageMargin(AbstractC5776a0.m27313a((this.f62056g ? 3 : 1) * 44.0f), AbstractC5776a0.m27313a(16.0f));
        shortTVBannerView.addPageTransformer(new C13890b());
        shortTVBannerView.setOuterPageChangeListener(new a(view));
        shortTVBannerView.setAdapter(shortTVBannerAdapter);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(banners);
        shortTVBannerAdapter.setData(arrayList);
        shortTVBannerView.post(new Runnable() { // from class: com.transsion.shorttv_pugc.ui.adapter.provider.i
            @Override // java.lang.Runnable
            public final void run() {
                C19347j.m80877K(this.f62052a, view);
            }
        });
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return ShortTvItemType.BANNER.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.pugc_short_tv_view_banner;
    }
}
