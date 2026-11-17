package com.transsion.home.adapter.suboperate.provider;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import androidx.p1004lifecycle.AbstractC3192e;
import androidx.p1004lifecycle.InterfaceC3194f;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.baseui.recycler.InterceptView;
import com.transsion.baseui.widget.OperateScrollableHost;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.suboperate.adapter.C14945u;
import com.transsion.home.adapter.suboperate.adapter.SubBannerChildPagerAdapter;
import com.transsion.home.adapter.trending.BannerADDataHelper;
import com.transsion.home.bean.BannerBean;
import com.transsion.home.bean.BannerData;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.BaseHomeSubFragment;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.startup.pref.consume.AppStartDotState;
import com.transsion.startup.pref.consume.AppStartReport;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.DownloadDialogShowEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C25220y0;

/* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.provider.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C14971i extends BaseItemProvider implements InterfaceC3194f {

    /* JADX INFO: renamed from: e */
    private final int f52339e;

    /* JADX INFO: renamed from: f */
    private final BaseHomeSubFragment f52340f;

    /* JADX INFO: renamed from: g */
    private final Set f52341g;

    /* JADX INFO: renamed from: h */
    private Handler f52342h;

    /* JADX INFO: renamed from: i */
    private ViewPager2 f52343i;

    /* JADX INFO: renamed from: j */
    private ViewPager2 f52344j;

    /* JADX INFO: renamed from: k */
    private InterceptView f52345k;

    /* JADX INFO: renamed from: l */
    private int f52346l;

    /* JADX INFO: renamed from: m */
    private long f52347m;

    /* JADX INFO: renamed from: n */
    private boolean f52348n;

    /* JADX INFO: renamed from: o */
    private C14945u f52349o;

    /* JADX INFO: renamed from: p */
    private SubBannerChildPagerAdapter f52350p;

    /* JADX INFO: renamed from: q */
    private C14945u f52351q;

    /* JADX INFO: renamed from: r */
    private final Runnable f52352r;

    /* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.provider.i$a */
    public static final class a extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ OperateItem f52353a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C14971i f52354b;

        a(OperateItem operateItem, C14971i c14971i) {
            this.f52353a = operateItem;
            this.f52354b = c14971i;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            BannerBean banner = this.f52353a.getBanner();
            if (banner != null ? Intrinsics.m97797c(banner.getAutoPlay(), Boolean.TRUE) : false) {
                Handler handler = this.f52354b.f52342h;
                if (handler != null) {
                    handler.removeCallbacks(this.f52354b.f52352r);
                }
                Handler handler2 = this.f52354b.f52342h;
                if (handler2 != null) {
                    handler2.postDelayed(this.f52354b.f52352r, this.f52354b.f52347m);
                }
            }
            boolean z11 = this.f52354b.f52346l != -1;
            this.f52354b.f52346l = i11;
            this.f52354b.m67148a0(i11, z11);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.provider.i$b */
    public static final class b extends ViewPager2.OnPageChangeCallback {
        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            super.onPageSelected(i11);
            int iM67139Q = C14971i.this.m67139Q();
            if (iM67139Q != -1) {
                C14971i.this.m67144W(iM67139Q);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.provider.i$c */
    public static final class c implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ BaseViewHolder f52356a;

        c(BaseViewHolder baseViewHolder) {
            this.f52356a = baseViewHolder;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = this.f52356a.itemView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            AppStartReport.f62550a.m81545f(new AppStartDotState(AppStartDotState.TRENDING_END, 0L, 2, null));
            return true;
        }
    }

    public C14971i(int i11, BaseHomeSubFragment fragment) {
        Intrinsics.m97802h(fragment, "fragment");
        this.f52339e = i11;
        this.f52340f = fragment;
        this.f52341g = new LinkedHashSet();
        this.f52346l = -1;
        this.f52347m = 5000L;
        m67142U();
        this.f52352r = new Runnable() { // from class: com.transsion.home.adapter.suboperate.provider.e
            @Override // java.lang.Runnable
            public final void run() {
                C14971i.m67147Z(this.f52328a);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, java.util.List] */
    /* JADX INFO: renamed from: L */
    private final List m67135L(List list, final Function1 function1) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = list;
        boolean zM67193m = BannerADDataHelper.f52406a.m67193m();
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            BannerData bannerData = (BannerData) next;
            if ((bannerData != null ? bannerData.getBiddingAdData() : null) != null) {
                arrayList.add(next);
            }
        }
        List listU0 = CollectionsKt.m97343U0(arrayList);
        if (zM67193m || listU0.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                BannerData bannerData2 = (BannerData) obj;
                if ((bannerData2 != null ? bannerData2.getBiddingAdData() : null) == null) {
                    arrayList2.add(obj);
                }
            }
            ?? U0 = CollectionsKt.m97343U0(arrayList2);
            objectRef.element = U0;
            if (((List) U0).isEmpty()) {
                return (List) objectRef.element;
            }
            BannerADDataHelper.f52406a.m67191k(new Function2() { // from class: com.transsion.home.adapter.suboperate.provider.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return C14971i.m67136M(objectRef, function1, (BiddingIntermediateMaterialBean) obj2, ((Integer) obj3).intValue());
                }
            });
        }
        return (List) objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final Unit m67136M(Ref.ObjectRef objectRef, Function1 function1, BiddingIntermediateMaterialBean biddingIntermediateMaterialBean, int i11) {
        if (biddingIntermediateMaterialBean == null) {
            return Unit.f75682a;
        }
        if (((List) objectRef.element).size() > i11) {
            ((List) objectRef.element).add(i11, new BannerData(null, null, null, false, null, null, null, null, 0, null, null, biddingIntermediateMaterialBean, 2047, null));
        } else {
            ((List) objectRef.element).add(new BannerData(null, null, null, false, null, null, null, null, 0, null, null, biddingIntermediateMaterialBean, 2047, null));
        }
        function1.invoke(objectRef.element);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: N */
    private final void m67137N() {
        Handler handler = this.f52342h;
        if (handler != null) {
            handler.postDelayed(this.f52352r, this.f52347m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final Unit m67138P(C14971i c14971i, List data) {
        Intrinsics.m97802h(data, "data");
        c14971i.m67149b0(data);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public final int m67139Q() {
        ViewPager2 viewPager2 = this.f52344j;
        if (viewPager2 == null) {
            Intrinsics.m97819y("cardPager");
            viewPager2 = null;
        }
        return viewPager2.getCurrentItem();
    }

    /* JADX INFO: renamed from: R */
    private final int m67140R(int i11) {
        return 1073741823 - (1073741823 % i11);
    }

    /* JADX INFO: renamed from: S */
    private final void m67141S(List list, OperateItem operateItem) {
        ViewPager2 viewPager2 = this.f52344j;
        ViewPager2 viewPager3 = null;
        if (viewPager2 == null) {
            Intrinsics.m97819y("cardPager");
            viewPager2 = null;
        }
        viewPager2.setPageTransformer(new CompositePageTransformer());
        ViewPager2 viewPager4 = this.f52344j;
        if (viewPager4 == null) {
            Intrinsics.m97819y("cardPager");
            viewPager4 = null;
        }
        viewPager4.setOffscreenPageLimit(3);
        this.f52350p = new SubBannerChildPagerAdapter(list, this.f52339e, operateItem);
        ViewPager2 viewPager5 = this.f52344j;
        if (viewPager5 == null) {
            Intrinsics.m97819y("cardPager");
            viewPager5 = null;
        }
        viewPager5.setAdapter(this.f52350p);
        ViewPager2 viewPager6 = this.f52344j;
        if (viewPager6 == null) {
            Intrinsics.m97819y("cardPager");
        } else {
            viewPager3 = viewPager6;
        }
        viewPager3.registerOnPageChangeCallback(new b());
    }

    /* JADX INFO: renamed from: U */
    private final void m67142U() {
        BaseHomeSubFragment baseHomeSubFragment = this.f52340f;
        Function1 function1 = new Function1() { // from class: com.transsion.home.adapter.suboperate.provider.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C14971i.m67143V(this.f52331a, (DownloadDialogShowEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = DownloadDialogShowEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(baseHomeSubFragment, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final Unit m67143V(C14971i c14971i, DownloadDialogShowEvent value) {
        Intrinsics.m97802h(value, "value");
        if (c14971i.f52348n) {
            if (value.getShow()) {
                Handler handler = c14971i.f52342h;
                if (handler != null) {
                    handler.removeCallbacks(c14971i.f52352r);
                }
            } else {
                Handler handler2 = c14971i.f52342h;
                if (handler2 != null) {
                    handler2.postDelayed(c14971i.f52352r, c14971i.f52347m);
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public final void m67144W(int i11) {
        ViewPager2 viewPager2 = this.f52343i;
        ViewPager2 viewPager3 = null;
        if (viewPager2 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager2 = null;
        }
        if (i11 != viewPager2.getCurrentItem()) {
            ViewPager2 viewPager4 = this.f52343i;
            if (viewPager4 == null) {
                Intrinsics.m97819y("viewPager2");
            } else {
                viewPager3 = viewPager4;
            }
            viewPager3.setCurrentItem(i11, true);
        }
    }

    /* JADX INFO: renamed from: X */
    private final void m67145X() {
        List arrayList;
        List listM67000g;
        if (this.f52340f.isAdded() && this.f52340f.isVisible()) {
            ViewPager2 viewPager2 = this.f52343i;
            if (viewPager2 == null) {
                Intrinsics.m97819y("viewPager2");
                viewPager2 = null;
            }
            if (viewPager2.isShown()) {
                C14945u c14945u = this.f52351q;
                if (c14945u == null || (listM67000g = c14945u.m67000g()) == null || (arrayList = CollectionsKt.m97343U0(listM67000g)) == null) {
                    arrayList = new ArrayList();
                }
                m67135L(arrayList, new Function1() { // from class: com.transsion.home.adapter.suboperate.provider.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C14971i.m67146Y(this.f52329a, (List) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final Unit m67146Y(C14971i c14971i, List data) {
        Intrinsics.m97802h(data, "data");
        c14971i.m67149b0(data);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final void m67147Z(C14971i c14971i) {
        if (!c14971i.f52340f.isVisible()) {
            if (c14971i.f52340f.isAdded()) {
                c14971i.m67137N();
                return;
            }
            return;
        }
        ViewPager2 viewPager2 = c14971i.f52343i;
        if (viewPager2 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager2 = null;
        }
        ViewPager2 viewPager3 = c14971i.f52343i;
        if (viewPager3 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager3 = null;
        }
        int currentItem = viewPager3.getCurrentItem() + 1;
        ViewPager2 viewPager4 = c14971i.f52343i;
        if (viewPager4 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager4 = null;
        }
        RecyclerView.Adapter adapter = viewPager4.getAdapter();
        Integer numValueOf = adapter != null ? Integer.valueOf(adapter.getItemCount()) : null;
        Intrinsics.m97799e(numValueOf);
        viewPager2.setCurrentItem(currentItem % numValueOf.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public final void m67148a0(int i11, boolean z11) {
        if (i11 != m67139Q()) {
            ViewPager2 viewPager2 = this.f52344j;
            if (viewPager2 == null) {
                Intrinsics.m97819y("cardPager");
                viewPager2 = null;
            }
            viewPager2.setCurrentItem(i11, z11);
        }
    }

    /* JADX INFO: renamed from: b0 */
    private final void m67149b0(List list) {
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            C14945u c14945u = this.f52351q;
            if (c14945u != null) {
                c14945u.m67001i(list);
            }
            C14945u c14945u2 = this.f52351q;
            if (c14945u2 != null) {
                c14945u2.notifyDataSetChanged();
            }
            SubBannerChildPagerAdapter subBannerChildPagerAdapter = this.f52350p;
            if (subBannerChildPagerAdapter != null) {
                subBannerChildPagerAdapter.m66913h(list);
            }
            SubBannerChildPagerAdapter subBannerChildPagerAdapter2 = this.f52350p;
            if (subBannerChildPagerAdapter2 != null) {
                subBannerChildPagerAdapter2.notifyDataSetChanged();
                unit = Unit.f75682a;
            } else {
                unit = null;
            }
            Result.m112707constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, OperateItem item) {
        List arrayList;
        String interval;
        Integer numV;
        List<BannerData> banners;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        this.f52343i = (ViewPager2) helper.itemView.findViewById(R$id.sub_operation_view_pager);
        this.f52344j = (ViewPager2) helper.getView(R$id.cardPager);
        InterceptView interceptView = (InterceptView) helper.getView(R$id.interestLayout);
        this.f52345k = interceptView;
        ViewPager2 viewPager2 = null;
        if (interceptView == null) {
            Intrinsics.m97819y("interestLayout");
            interceptView = null;
        }
        ViewPager2 viewPager3 = this.f52344j;
        if (viewPager3 == null) {
            Intrinsics.m97819y("cardPager");
            viewPager3 = null;
        }
        interceptView.setPostView(viewPager3);
        ((OperateScrollableHost) helper.getView(R$id.sub_operation_view_scroll_helper)).interceptAllEvent(true);
        ((OperateScrollableHost) helper.getView(R$id.sub_operation_card_helper)).interceptAllEvent(true);
        BannerBean banner = item.getBanner();
        if (banner == null || (banners = banner.getBanners()) == null || (arrayList = CollectionsKt.m97343U0(banners)) == null) {
            arrayList = new ArrayList();
        }
        List<BannerData> listM67135L = m67135L(arrayList, new Function1() { // from class: com.transsion.home.adapter.suboperate.provider.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C14971i.m67138P(this.f52326a, (List) obj);
            }
        });
        BannerBean banner2 = item.getBanner();
        if (banner2 != null) {
            banner2.setBanners(listM67135L);
        }
        if (listM67135L.isEmpty()) {
            return;
        }
        C14945u c14945u = this.f52351q;
        if (c14945u == null) {
            this.f52351q = new C14945u(listM67135L, this.f52339e, this, item);
        } else if (c14945u != null) {
            c14945u.m67001i(listM67135L);
        }
        this.f52349o = this.f52351q;
        ViewPager2 viewPager4 = this.f52343i;
        if (viewPager4 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager4 = null;
        }
        viewPager4.setAdapter(this.f52349o);
        m67141S(listM67135L, item);
        Handler handler = this.f52342h;
        if (handler != null) {
            handler.removeCallbacks(this.f52352r);
        }
        this.f52342h = new Handler(Looper.getMainLooper());
        ViewPager2 viewPager5 = this.f52343i;
        if (viewPager5 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager5 = null;
        }
        viewPager5.registerOnPageChangeCallback(new a(item, this));
        BannerBean banner3 = item.getBanner();
        long jIntValue = ((long) ((banner3 == null || (interval = banner3.getInterval()) == null || (numV = StringsKt.m98216v(interval)) == null) ? 0 : numV.intValue())) * 1000;
        if (jIntValue <= 0) {
            jIntValue = this.f52347m;
        }
        this.f52347m = jIntValue;
        int iM67140R = this.f52346l;
        if (iM67140R < 0) {
            iM67140R = m67140R(listM67135L.size());
        }
        ViewPager2 viewPager6 = this.f52343i;
        if (viewPager6 == null) {
            Intrinsics.m97819y("viewPager2");
            viewPager6 = null;
        }
        viewPager6.setCurrentItem(iM67140R, false);
        ViewPager2 viewPager7 = this.f52344j;
        if (viewPager7 == null) {
            Intrinsics.m97819y("cardPager");
        } else {
            viewPager2 = viewPager7;
        }
        viewPager2.setCurrentItem(iM67140R, false);
    }

    /* JADX INFO: renamed from: T */
    public final boolean m67153T(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return this.f52341g.add(str);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.BANNER.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_sub_operation_banner;
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
        if (!this.f52348n || (handler = this.f52342h) == null) {
            return;
        }
        handler.removeCallbacks(this.f52352r);
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public void onResume(InterfaceC3224u owner) {
        Intrinsics.m97802h(owner, "owner");
        AbstractC3192e.m14899d(this, owner);
        if (this.f52348n) {
            Handler handler = this.f52342h;
            if (handler != null) {
                handler.postDelayed(this.f52352r, this.f52347m);
            }
            m67145X();
        }
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
        this.f52348n = true;
        Handler handler = this.f52342h;
        if (handler != null) {
            handler.postDelayed(this.f52352r, this.f52347m);
        }
        holder.itemView.getViewTreeObserver().addOnPreDrawListener(new c(holder));
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: u */
    public void mo36345u(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.mo36345u(holder);
        this.f52348n = false;
        Handler handler = this.f52342h;
        if (handler != null) {
            handler.removeCallbacks(this.f52352r);
        }
    }
}
