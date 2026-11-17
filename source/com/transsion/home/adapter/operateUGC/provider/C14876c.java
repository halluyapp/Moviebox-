package com.transsion.home.adapter.operateUGC.provider;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import androidx.core.content.AbstractC2397b;
import androidx.p1004lifecycle.AbstractC3192e;
import androidx.p1004lifecycle.InterfaceC3194f;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.p282tn.lib.view.indicator.BannerIndicator;
import com.p282tn.lib.view.indicator.C13766a;
import com.p282tn.lib.widget.R$color;
import com.transsion.baseui.widget.OperateScrollableHost;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.operateUGC.adapter.BannerUGCAdapter;
import com.transsion.home.bean.BannerBean;
import com.transsion.home.bean.BannerData;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.BaseHomeSubFragment;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.startup.pref.consume.AppStartDotState;
import com.transsion.startup.pref.consume.AppStartReport;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.provider.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C14876c extends BaseItemProvider implements InterfaceC3194f {

    /* JADX INFO: renamed from: e */
    private final int f52014e;

    /* JADX INFO: renamed from: f */
    private final BaseHomeSubFragment f52015f;

    /* JADX INFO: renamed from: g */
    private final Set f52016g;

    /* JADX INFO: renamed from: h */
    private Handler f52017h;

    /* JADX INFO: renamed from: i */
    private ViewPager2 f52018i;

    /* JADX INFO: renamed from: j */
    private BannerIndicator f52019j;

    /* JADX INFO: renamed from: k */
    private int f52020k;

    /* JADX INFO: renamed from: l */
    private long f52021l;

    /* JADX INFO: renamed from: m */
    private boolean f52022m;

    /* JADX INFO: renamed from: n */
    private final Runnable f52023n;

    /* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.provider.c$a */
    public static final class a extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ OperateItem f52024a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C14876c f52025b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ List f52026c;

        a(OperateItem operateItem, C14876c c14876c, List list) {
            this.f52024a = operateItem;
            this.f52025b = c14876c;
            this.f52026c = list;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            BannerBean banner = this.f52024a.getBanner();
            if (banner != null ? Intrinsics.m97797c(banner.getAutoPlay(), Boolean.TRUE) : false) {
                Handler handler = this.f52025b.f52017h;
                if (handler != null) {
                    handler.removeCallbacks(this.f52025b.f52023n);
                }
                Handler handler2 = this.f52025b.f52017h;
                if (handler2 != null) {
                    handler2.postDelayed(this.f52025b.f52023n, this.f52025b.f52021l);
                }
            }
            this.f52025b.f52020k = i11;
            BannerIndicator bannerIndicator = this.f52025b.f52019j;
            if (bannerIndicator == null) {
                Intrinsics.m97819y("circleIndicator");
                bannerIndicator = null;
            }
            bannerIndicator.onPageSelected(i11 % this.f52026c.size());
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.provider.c$b */
    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ BaseViewHolder f52027a;

        b(BaseViewHolder baseViewHolder) {
            this.f52027a = baseViewHolder;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = this.f52027a.itemView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            AppStartReport.f62550a.m81545f(new AppStartDotState(AppStartDotState.TRENDING_END, 0L, 2, null));
            return true;
        }
    }

    public C14876c(int i11, BaseHomeSubFragment fragment) {
        Intrinsics.m97802h(fragment, "fragment");
        this.f52014e = i11;
        this.f52015f = fragment;
        this.f52016g = new LinkedHashSet();
        this.f52020k = -1;
        this.f52021l = 5000L;
        this.f52023n = new Runnable() { // from class: com.transsion.home.adapter.operateUGC.provider.b
            @Override // java.lang.Runnable
            public final void run() {
                C14876c.m66818J(this.f52010a);
            }
        };
    }

    /* JADX INFO: renamed from: F */
    private final void m66816F() {
        Handler handler = this.f52017h;
        if (handler != null) {
            handler.postDelayed(this.f52023n, this.f52021l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m66817H(C14876c c14876c) {
        BannerIndicator bannerIndicator = c14876c.f52019j;
        if (bannerIndicator == null) {
            Intrinsics.m97819y("circleIndicator");
            bannerIndicator = null;
        }
        bannerIndicator.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final void m66818J(C14876c c14876c) {
        if (!c14876c.f52015f.isVisible()) {
            if (c14876c.f52015f.isAdded()) {
                c14876c.m66816F();
                return;
            }
            return;
        }
        ViewPager2 viewPager2 = c14876c.f52018i;
        if (viewPager2 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager2 = null;
        }
        ViewPager2 viewPager3 = c14876c.f52018i;
        if (viewPager3 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager3 = null;
        }
        int currentItem = viewPager3.getCurrentItem() + 1;
        ViewPager2 viewPager4 = c14876c.f52018i;
        if (viewPager4 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager4 = null;
        }
        RecyclerView.Adapter adapter = viewPager4.getAdapter();
        Integer numValueOf = adapter != null ? Integer.valueOf(adapter.getItemCount()) : null;
        Intrinsics.m97799e(numValueOf);
        viewPager2.setCurrentItem(currentItem % numValueOf.intValue());
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, OperateItem item) {
        List<BannerData> arrayList;
        String interval;
        Integer numV;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        this.f52018i = (ViewPager2) helper.itemView.findViewById(R$id.provider_ugc_banner_view_pager);
        ((OperateScrollableHost) helper.itemView.findViewById(R$id.provider_ugc_banner_view_scroll_helper)).interceptAllEvent(true);
        this.f52019j = (BannerIndicator) helper.itemView.findViewById(R$id.provider_ugc_banner_view_pager_indicator);
        BannerBean banner = item.getBanner();
        if (banner == null || (arrayList = banner.getBanners()) == null) {
            arrayList = new ArrayList<>();
        }
        ViewPager2 viewPager2 = this.f52018i;
        ViewPager2 viewPager3 = null;
        if (viewPager2 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager2 = null;
        }
        viewPager2.setAdapter(new BannerUGCAdapter(arrayList, this.f52014e, this, item));
        if (arrayList.isEmpty()) {
            return;
        }
        Handler handler = this.f52017h;
        if (handler != null) {
            handler.removeCallbacks(this.f52023n);
        }
        this.f52017h = new Handler(Looper.getMainLooper());
        ViewPager2 viewPager4 = this.f52018i;
        if (viewPager4 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager4 = null;
        }
        viewPager4.registerOnPageChangeCallback(new a(item, this, arrayList));
        BannerIndicator bannerIndicator = this.f52019j;
        if (bannerIndicator == null) {
            Intrinsics.m97819y("circleIndicator");
            bannerIndicator = null;
        }
        C13766a indicatorConfig = bannerIndicator.getIndicatorConfig();
        indicatorConfig.m62231s(-1);
        indicatorConfig.m62229q(AbstractC2397b.getColor(m36338k(), R$color.white_20));
        indicatorConfig.m62230r(AbstractC5776a0.m27313a(4.0f));
        indicatorConfig.m62232t(AbstractC5776a0.m27313a(8.0f));
        indicatorConfig.m62227o(AbstractC5776a0.m27313a(4.0f));
        indicatorConfig.m62226n(arrayList.size());
        BannerIndicator bannerIndicator2 = this.f52019j;
        if (bannerIndicator2 == null) {
            Intrinsics.m97819y("circleIndicator");
            bannerIndicator2 = null;
        }
        bannerIndicator2.post(new Runnable() { // from class: com.transsion.home.adapter.operateUGC.provider.a
            @Override // java.lang.Runnable
            public final void run() {
                C14876c.m66817H(this.f52005a);
            }
        });
        BannerBean banner2 = item.getBanner();
        long jIntValue = ((long) ((banner2 == null || (interval = banner2.getInterval()) == null || (numV = StringsKt.m98216v(interval)) == null) ? 0 : numV.intValue())) * 1000;
        if (jIntValue <= 0) {
            jIntValue = this.f52021l;
        }
        this.f52021l = jIntValue;
        int size = this.f52020k;
        if (size < 0) {
            size = 1073741823 - (1073741823 % arrayList.size());
        }
        ViewPager2 viewPager5 = this.f52018i;
        if (viewPager5 == null) {
            Intrinsics.m97819y("viewPager2");
        } else {
            viewPager3 = viewPager5;
        }
        viewPager3.setCurrentItem(size, false);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m66822I(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return this.f52016g.add(str);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.UGC_BANNER.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.provider_ugc_item_banner;
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
        if (!this.f52022m || (handler = this.f52017h) == null) {
            return;
        }
        handler.removeCallbacks(this.f52023n);
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public void onResume(InterfaceC3224u owner) {
        Handler handler;
        Intrinsics.m97802h(owner, "owner");
        AbstractC3192e.m14899d(this, owner);
        if (!this.f52022m || (handler = this.f52017h) == null) {
            return;
        }
        handler.postDelayed(this.f52023n, this.f52021l);
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
        this.f52022m = true;
        Handler handler = this.f52017h;
        if (handler != null) {
            handler.postDelayed(this.f52023n, this.f52021l);
        }
        holder.itemView.getViewTreeObserver().addOnPreDrawListener(new b(holder));
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: u */
    public void mo36345u(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.mo36345u(holder);
        this.f52022m = false;
        Handler handler = this.f52017h;
        if (handler != null) {
            handler.removeCallbacks(this.f52023n);
        }
    }
}
