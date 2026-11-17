package com.transsion.home.adapter.suboperate.provider;

import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.p1004lifecycle.AbstractC3192e;
import androidx.p1004lifecycle.InterfaceC3194f;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.widget.OperateScrollableHost;
import com.transsion.gslb.Utils;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.suboperate.adapter.SubHorizontalViewPagerAdapter;
import com.transsion.home.bean.BannerBean;
import com.transsion.home.bean.BannerData;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.BaseHomeSubFragment;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.moviedetailapi.bean.Image;
import com.transsion.moviedetailapi.bean.PostItemType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25204t1;
import ml.AbstractC25887a;
import ml.AbstractC25888b;

/* JADX INFO: loaded from: classes5.dex */
public final class SubHorizontalBannerProvider extends BaseItemProvider implements InterfaceC3194f {

    /* JADX INFO: renamed from: e */
    private final int f52270e;

    /* JADX INFO: renamed from: f */
    private final BaseHomeSubFragment f52271f;

    /* JADX INFO: renamed from: g */
    private final Set f52272g;

    /* JADX INFO: renamed from: h */
    private Handler f52273h;

    /* JADX INFO: renamed from: i */
    private ViewPager2 f52274i;

    /* JADX INFO: renamed from: j */
    private int f52275j;

    /* JADX INFO: renamed from: k */
    private long f52276k;

    /* JADX INFO: renamed from: l */
    private View f52277l;

    /* JADX INFO: renamed from: m */
    private boolean f52278m;

    /* JADX INFO: renamed from: n */
    private InterfaceC25204t1 f52279n;

    /* JADX INFO: renamed from: o */
    private OperateItem f52280o;

    /* JADX INFO: renamed from: p */
    private SubHorizontalViewPagerAdapter f52281p;

    /* JADX INFO: renamed from: q */
    private final Runnable f52282q;

    /* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.provider.SubHorizontalBannerProvider$a */
    public static final class C14947a extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ OperateItem f52283a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SubHorizontalBannerProvider f52284b;

        C14947a(OperateItem operateItem, SubHorizontalBannerProvider subHorizontalBannerProvider) {
            this.f52283a = operateItem;
            this.f52284b = subHorizontalBannerProvider;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            List<BannerData> banners;
            BannerData bannerData;
            Image image;
            String averageHueLight;
            List<BannerData> banners2;
            BannerBean banner = this.f52283a.getBanner();
            if (banner != null ? Intrinsics.m97797c(banner.getAutoPlay(), Boolean.TRUE) : false) {
                Handler handler = this.f52284b.f52273h;
                if (handler != null) {
                    handler.removeCallbacks(this.f52284b.f52282q);
                }
                Handler handler2 = this.f52284b.f52273h;
                if (handler2 != null) {
                    handler2.postDelayed(this.f52284b.f52282q, this.f52284b.f52276k);
                }
            }
            this.f52284b.f52275j = i11;
            BannerBean banner2 = this.f52283a.getBanner();
            int size = i11 % ((banner2 == null || (banners2 = banner2.getBanners()) == null) ? 1 : banners2.size());
            BannerBean banner3 = this.f52283a.getBanner();
            if (banner3 != null && (banners = banner3.getBanners()) != null && (bannerData = banners.get(size)) != null && (image = bannerData.getImage()) != null && (averageHueLight = image.getAverageHueLight()) != null) {
                SubHorizontalBannerProvider subHorizontalBannerProvider = this.f52284b;
                View view = null;
                GradientDrawable gradientDrawableM101676c = AbstractC25887a.m101676c(StringsKt.m98236Q(averageHueLight, Utils.SEPARATOR, "#ff", false, 4, null), StringsKt.m98236Q(averageHueLight, Utils.SEPARATOR, "#00", false, 4, null), null, 4, null);
                View view2 = subHorizontalBannerProvider.f52277l;
                if (view2 == null) {
                    Intrinsics.m97819y("bgColorView");
                } else {
                    view = view2;
                }
                view.setBackground(gradientDrawableM101676c);
            }
            this.f52284b.m67040L(this.f52283a, size);
        }
    }

    public SubHorizontalBannerProvider(int i11, BaseHomeSubFragment fragment) {
        Intrinsics.m97802h(fragment, "fragment");
        this.f52270e = i11;
        this.f52271f = fragment;
        this.f52272g = new LinkedHashSet();
        this.f52275j = -1;
        this.f52276k = 5000L;
        this.f52282q = new Runnable() { // from class: com.transsion.home.adapter.suboperate.provider.x
            @Override // java.lang.Runnable
            public final void run() {
                SubHorizontalBannerProvider.m67041M(this.f52402a);
            }
        };
    }

    /* JADX INFO: renamed from: H */
    private final void m67037H() {
        Handler handler = this.f52273h;
        if (handler != null) {
            handler.postDelayed(this.f52282q, this.f52276k);
        }
    }

    /* JADX INFO: renamed from: J */
    private final boolean m67038J(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return this.f52272g.add(str);
    }

    /* JADX INFO: renamed from: K */
    private final void m67039K() {
        if (HomeTabId.INSTANCE.m67539h(Integer.valueOf(this.f52270e), true)) {
            this.f52279n = AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new SubHorizontalBannerProvider$registerCourse$1(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public final void m67040L(OperateItem operateItem, int i11) {
        List<BannerData> banners;
        BannerBean banner = operateItem.getBanner();
        BannerData bannerData = (banner == null || (banners = banner.getBanners()) == null) ? null : banners.get(i11);
        if (m67038J(bannerData != null ? bannerData.getSubjectId() : null)) {
            HashMap map = new HashMap();
            map.put("event_type", "browse_banner");
            map.put("sequence", String.valueOf(i11));
            map.put("tabId", String.valueOf(this.f52270e));
            if (bannerData != null) {
                AbstractC25888b.m101680c(bannerData, map);
            }
            AbstractC25888b.m101678a(operateItem, map);
            C14450a.f50860a.m65142e(SubTabFragment.INSTANCE.m68282a(this.f52270e), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final void m67041M(SubHorizontalBannerProvider subHorizontalBannerProvider) {
        if (!subHorizontalBannerProvider.f52271f.isVisible()) {
            if (subHorizontalBannerProvider.f52271f.isAdded()) {
                subHorizontalBannerProvider.m67037H();
                return;
            }
            return;
        }
        ViewPager2 viewPager2 = subHorizontalBannerProvider.f52274i;
        if (viewPager2 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager2 = null;
        }
        ViewPager2 viewPager3 = subHorizontalBannerProvider.f52274i;
        if (viewPager3 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager3 = null;
        }
        int currentItem = viewPager3.getCurrentItem() + 1;
        ViewPager2 viewPager4 = subHorizontalBannerProvider.f52274i;
        if (viewPager4 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager4 = null;
        }
        RecyclerView.Adapter adapter = viewPager4.getAdapter();
        Integer numValueOf = adapter != null ? Integer.valueOf(adapter.getItemCount()) : null;
        Intrinsics.m97799e(numValueOf);
        viewPager2.setCurrentItem(currentItem % numValueOf.intValue());
    }

    /* JADX INFO: renamed from: N */
    private final void m67042N() {
        InterfaceC25204t1 interfaceC25204t1 = this.f52279n;
        if (interfaceC25204t1 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
        }
        this.f52279n = null;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, OperateItem item) {
        List<BannerData> arrayList;
        String interval;
        Integer numV;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        this.f52274i = (ViewPager2) helper.getView(R$id.sub_operation_horizontal_view_pager);
        this.f52277l = helper.getView(R$id.sub_operation_banner_bg);
        int iMin = Math.min(AbstractC5806y.m27489e(), AbstractC5806y.m27487c()) - AbstractC5776a0.m27313a(112.0f);
        int i11 = (int) ((iMin * 9.0f) / 16);
        ViewPager2 viewPager2 = this.f52274i;
        ViewPager2 viewPager3 = null;
        if (viewPager2 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager2 = null;
        }
        viewPager2.getLayoutParams().height = i11;
        ((OperateScrollableHost) helper.getView(R$id.sub_operation_view_scroll_helper)).interceptAllEvent(true);
        int iM68103h0 = this.f52271f.m68103h0();
        helper.getView(R$id.sub_operation_banner_space).getLayoutParams().height = iM68103h0;
        View view = this.f52277l;
        if (view == null) {
            Intrinsics.m97819y("bgColorView");
            view = null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewPager2 viewPager4 = this.f52274i;
        if (viewPager4 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager4 = null;
        }
        layoutParams.height = iM68103h0 + viewPager4.getLayoutParams().height;
        BannerBean banner = item.getBanner();
        if (banner == null || (arrayList = banner.getBanners()) == null) {
            arrayList = new ArrayList<>();
        }
        ViewPager2 viewPager5 = this.f52274i;
        if (viewPager5 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager5 = null;
        }
        viewPager5.setPageTransformer(new CompositePageTransformer());
        ViewPager2 viewPager6 = this.f52274i;
        if (viewPager6 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager6 = null;
        }
        viewPager6.setOffscreenPageLimit(3);
        ViewPager2 viewPager7 = this.f52274i;
        if (viewPager7 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager7 = null;
        }
        viewPager7.setAdapter(new SubHorizontalViewPagerAdapter(arrayList, this.f52270e, item, iMin, i11));
        if (arrayList.isEmpty()) {
            return;
        }
        Handler handler = this.f52273h;
        if (handler != null) {
            handler.removeCallbacks(this.f52282q);
        }
        this.f52273h = new Handler(Looper.getMainLooper());
        ViewPager2 viewPager8 = this.f52274i;
        if (viewPager8 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager8 = null;
        }
        viewPager8.registerOnPageChangeCallback(new C14947a(item, this));
        BannerBean banner2 = item.getBanner();
        long jIntValue = ((long) ((banner2 == null || (interval = banner2.getInterval()) == null || (numV = StringsKt.m98216v(interval)) == null) ? 0 : numV.intValue())) * 1000;
        if (jIntValue <= 0) {
            jIntValue = this.f52276k;
        }
        this.f52276k = jIntValue;
        int size = this.f52275j;
        if (size < 0) {
            size = 1073741823 - (1073741823 % arrayList.size());
        }
        ViewPager2 viewPager9 = this.f52274i;
        if (viewPager9 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager9 = null;
        }
        viewPager9.setCurrentItem(size, false);
        ViewPager2 viewPager10 = this.f52274i;
        if (viewPager10 == null) {
            Intrinsics.m97819y("viewPager2");
        } else {
            viewPager3 = viewPager10;
        }
        RecyclerView.Adapter adapter = viewPager3.getAdapter();
        Intrinsics.m97800f(adapter, "null cannot be cast to non-null type com.transsion.home.adapter.suboperate.adapter.SubHorizontalViewPagerAdapter");
        this.f52281p = (SubHorizontalViewPagerAdapter) adapter;
        this.f52280o = item;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.HORIZONTAL_BANNER.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_sub_operation_horizontal_banner;
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public /* synthetic */ void onCreate(InterfaceC3224u interfaceC3224u) {
        AbstractC3192e.m14896a(this, interfaceC3224u);
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public /* synthetic */ void onDestroy(InterfaceC3224u interfaceC3224u) {
        AbstractC3192e.m14897b(this, interfaceC3224u);
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public void onPause(InterfaceC3224u owner) {
        Handler handler;
        Intrinsics.m97802h(owner, "owner");
        AbstractC3192e.m14898c(this, owner);
        if (!this.f52278m || (handler = this.f52273h) == null) {
            return;
        }
        handler.removeCallbacks(this.f52282q);
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public void onResume(InterfaceC3224u owner) {
        Handler handler;
        Intrinsics.m97802h(owner, "owner");
        AbstractC3192e.m14899d(this, owner);
        if (!this.f52278m || (handler = this.f52273h) == null) {
            return;
        }
        handler.postDelayed(this.f52282q, this.f52276k);
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public /* synthetic */ void onStart(InterfaceC3224u interfaceC3224u) {
        AbstractC3192e.m14900e(this, interfaceC3224u);
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public /* synthetic */ void onStop(InterfaceC3224u interfaceC3224u) {
        AbstractC3192e.m14901f(this, interfaceC3224u);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: t */
    public void mo36344t(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.mo36344t(holder);
        this.f52278m = true;
        Handler handler = this.f52273h;
        if (handler != null) {
            handler.postDelayed(this.f52282q, this.f52276k);
        }
        m67039K();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: u */
    public void mo36345u(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.mo36345u(holder);
        this.f52278m = false;
        Handler handler = this.f52273h;
        if (handler != null) {
            handler.removeCallbacks(this.f52282q);
        }
        m67042N();
    }
}
