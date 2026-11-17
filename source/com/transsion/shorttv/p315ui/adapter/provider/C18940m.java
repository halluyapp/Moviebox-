package com.transsion.shorttv.p315ui.adapter.provider;

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
import com.transsion.shorttv.bean.BannerBean;
import com.transsion.shorttv.bean.BannerData;
import com.transsion.shorttv.bean.Image;
import com.transsion.shorttv.bean.OperateItem;
import com.transsion.shorttv.bean.ShortTvItemType;
import com.transsion.shorttv.bean.Subject;
import com.transsion.shorttv.p315ui.adapter.ShortTVBannerAdapter;
import com.transsion.shorttv.p315ui.widget.ShortTVBannerView;
import com.transsion.shorttv.utils.C19158a;
import es.C23218a;
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
import p356ds.AbstractC23047a;

/* JADX INFO: renamed from: com.transsion.shorttv.ui.adapter.provider.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C18940m extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final Fragment f61044e;

    /* JADX INFO: renamed from: f */
    private final String f61045f;

    /* JADX INFO: renamed from: g */
    private final boolean f61046g;

    /* JADX INFO: renamed from: h */
    private final boolean f61047h;

    /* JADX INFO: renamed from: i */
    private final int f61048i;

    /* JADX INFO: renamed from: j */
    private ShortTVBannerAdapter f61049j;

    /* JADX INFO: renamed from: k */
    private final Lazy f61050k;

    /* JADX INFO: renamed from: l */
    private int f61051l;

    /* JADX INFO: renamed from: m */
    private long f61052m;

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.adapter.provider.m$a */
    public static final class a extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f61054b;

        a(View view) {
            this.f61054b = view;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            C18940m c18940m = C18940m.this;
            c18940m.m79616O(this.f61054b, i11, c18940m.f61051l, f11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            if (C18940m.this.f61044e.isResumed()) {
                C18940m.this.m79614M();
                C18940m.this.f61052m = System.currentTimeMillis();
            }
            C18940m.this.f61051l = i11;
        }
    }

    public C18940m(Fragment fragment, String pageName, boolean z11, boolean z12) {
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(pageName, "pageName");
        this.f61044e = fragment;
        this.f61045f = pageName;
        this.f61046g = z11;
        this.f61047h = z12;
        this.f61048i = AbstractC5781d.m27351c();
        this.f61050k = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.ui.adapter.provider.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C18940m.m79610H(this.f61043a);
            }
        });
        this.f61051l = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C19158a m79610H(C18940m c18940m) {
        return new C19158a(c18940m.f61045f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final Unit m79611J(C18940m c18940m, View view, int i11, BannerData item) {
        Intrinsics.m97802h(view, "<unused var>");
        Intrinsics.m97802h(item, "item");
        c18940m.m79615N(i11, item);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final void m79612K(C18940m c18940m, View view) {
        c18940m.m79616O(view, 0, 0, 0.0f);
    }

    /* JADX INFO: renamed from: L */
    private final C19158a m79613L() {
        return (C19158a) this.f61050k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x006d A[PHI: r3
      0x006d: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v8 java.lang.String) binds: [B:23:0x0057, B:28:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: M */
    public final void m79614M() {
        List data;
        BannerData bannerData;
        String value;
        List data2;
        int i11 = this.f61051l;
        if (i11 >= 0) {
            ShortTVBannerAdapter shortTVBannerAdapter = this.f61049j;
            if (i11 >= ((shortTVBannerAdapter == null || (data2 = shortTVBannerAdapter.getData()) == null) ? 0 : data2.size())) {
                return;
            }
            long jCurrentTimeMillis = this.f61052m > 0 ? System.currentTimeMillis() - this.f61052m : 0L;
            ShortTVBannerAdapter shortTVBannerAdapter2 = this.f61049j;
            if (shortTVBannerAdapter2 == null || (data = shortTVBannerAdapter2.getData()) == null || (bannerData = (BannerData) data.get(this.f61051l)) == null) {
                return;
            }
            C19158a c19158aM79613L = m79613L();
            String str = this.f61045f;
            ShortTvItemType shortTvItemType = ShortTvItemType.BANNER;
            String value2 = shortTvItemType.getValue();
            String subjectId = bannerData.getSubjectId();
            String ops = bannerData.getOps();
            if (ops != null) {
                value = ops;
            } else {
                Subject subject = bannerData.getSubject();
                ops = subject != null ? subject.getOps() : null;
                if (ops == null) {
                    value = shortTvItemType.getValue();
                } else {
                    value = ops;
                }
            }
            Boolean hasResource = bannerData.getHasResource();
            String deepLink = bannerData.getDeepLink();
            Integer numValueOf = Integer.valueOf(this.f61051l);
            Image image = bannerData.getImage();
            c19158aM79613L.m80221a((4112 & 1) != 0 ? null : str, (4112 & 2) != 0 ? null : "opt", (4112 & 4) != 0 ? null : value2, (4112 & 8) != 0 ? null : subjectId, (4112 & 16) != 0 ? null : null, (4112 & 32) != 0 ? null : value, (4112 & 64) != 0 ? null : hasResource, (4112 & 128) != 0 ? null : deepLink, (4112 & 256) != 0 ? null : numValueOf, (4112 & 512) != 0 ? null : image != null ? image.getUrl() : null, (4112 & 1024) != 0 ? 0L : jCurrentTimeMillis, (4112 & 2048) != 0 ? Boolean.FALSE : Boolean.valueOf(bannerData.getBuiltIn()), (4112 & 4096) == 0 ? null : null);
        }
    }

    /* JADX INFO: renamed from: N */
    private final void m79615N(int i11, BannerData bannerData) {
        C19158a c19158aM79613L = m79613L();
        String str = this.f61045f;
        ShortTvItemType shortTvItemType = ShortTvItemType.BANNER;
        String value = shortTvItemType.getValue();
        String subjectId = bannerData.getSubjectId();
        Boolean hasResource = bannerData.getHasResource();
        String deepLink = bannerData.getDeepLink();
        Integer numValueOf = Integer.valueOf(i11);
        Image image = bannerData.getImage();
        c19158aM79613L.m80222c(str, "opt", value, (4272 & 8) != 0 ? null : subjectId, (4272 & 16) != 0 ? null : null, (4272 & 32) != 0 ? null : null, (4272 & 64) != 0 ? null : hasResource, (4272 & 128) != 0 ? null : null, (4272 & 256) != 0 ? null : deepLink, (4272 & 512) != 0 ? null : numValueOf, (4272 & 1024) != 0 ? null : image != null ? image.getUrl() : null, (4272 & 2048) != 0 ? Boolean.FALSE : Boolean.valueOf(bannerData.getBuiltIn()), (4272 & 4096) != 0 ? null : null);
        String deepLink2 = bannerData.getDeepLink();
        if (deepLink2 != null) {
            Uri uriM92277a = C23218a.f70760a.m92277a(Uri.parse(deepLink2 + "&ops=" + shortTvItemType.getValue()));
            if (uriM92277a != null) {
                AbstractC24222c.m95245j(uriM92277a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public final void m79616O(View view, int i11, int i12, float f11) {
        Image image;
        String averageHueDark;
        Image image2;
        String averageHueDark2;
        List data;
        List data2;
        ShortTVBannerAdapter shortTVBannerAdapter = this.f61049j;
        BannerData bannerData = null;
        BannerData bannerData2 = (shortTVBannerAdapter == null || (data2 = shortTVBannerAdapter.getData()) == null) ? null : (BannerData) data2.get(i11);
        ShortTVBannerAdapter shortTVBannerAdapter2 = this.f61049j;
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
        ((ViewGroup.MarginLayoutParams) c2308b).height = this.f61048i + AbstractC23047a.m91689a(this.f61047h ? 50 : 10);
        view2.setLayoutParams(c2308b);
        ShortTVBannerView shortTVBannerView = (ShortTVBannerView) helper.getView(R$id.banner);
        ShortTVBannerAdapter shortTVBannerAdapter = new ShortTVBannerAdapter();
        shortTVBannerAdapter.m79522k(new Function3() { // from class: com.transsion.shorttv.ui.adapter.provider.j
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C18940m.m79611J(this.f61040a, (View) obj, ((Integer) obj2).intValue(), (BannerData) obj3);
            }
        });
        shortTVBannerView.setAutoTurningTime(4000L);
        shortTVBannerView.setPagerScrollDuration(1000L);
        shortTVBannerView.setPageMargin(AbstractC5776a0.m27313a((this.f61046g ? 3 : 1) * 44.0f), AbstractC5776a0.m27313a(16.0f));
        shortTVBannerView.addPageTransformer(new C13890b());
        shortTVBannerView.setOuterPageChangeListener(new a(view));
        shortTVBannerView.setAdapter(shortTVBannerAdapter);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(banners);
        shortTVBannerAdapter.setData(arrayList);
        shortTVBannerView.post(new Runnable() { // from class: com.transsion.shorttv.ui.adapter.provider.k
            @Override // java.lang.Runnable
            public final void run() {
                C18940m.m79612K(this.f61041a, view);
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
        return R$layout.short_tv_view_banner;
    }
}
