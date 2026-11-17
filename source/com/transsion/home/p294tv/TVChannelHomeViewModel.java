package com.transsion.home.p294tv;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.C3187b0;
import com.google.gson.Gson;
import com.transsion.home.R$string;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.bean.SubOperateData;
import com.transsion.home.p294tv.bean.CountryDataBean;
import com.transsion.home.p294tv.bean.CountryItem;
import com.transsion.home.p294tv.bean.Pager;
import com.transsion.home.p294tv.bean.PendingRefreshResult;
import com.transsion.home.p294tv.bean.TvChannelItem;
import com.transsion.home.p294tv.bean.TvChannelListDataBean;
import com.transsion.home.p294tv.bean.TvChannelLoadMoreResult;
import com.transsion.home.p294tv.bean.TvChannelRefreshResult;
import com.transsion.moviedetailapi.bean.PostItemType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p349dh.C22982c;
import p813ul.InterfaceC28023a;
import p842vl.AbstractC28126h;
import p842vl.C28123e;
import p871wg.AbstractC28362a;
import p871wg.C28365d;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
public final class TVChannelHomeViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: p */
    public static final C15434a f53368p = new C15434a(null);

    /* JADX INFO: renamed from: q */
    public static final int f53369q = 8;

    /* JADX INFO: renamed from: b */
    private final C3187b0 f53370b;

    /* JADX INFO: renamed from: c */
    private final C3187b0 f53371c;

    /* JADX INFO: renamed from: d */
    private final C3187b0 f53372d;

    /* JADX INFO: renamed from: e */
    private final C3187b0 f53373e;

    /* JADX INFO: renamed from: f */
    private final Lazy f53374f;

    /* JADX INFO: renamed from: g */
    private final Gson f53375g;

    /* JADX INFO: renamed from: h */
    private String f53376h;

    /* JADX INFO: renamed from: i */
    private Pager f53377i;

    /* JADX INFO: renamed from: j */
    private boolean f53378j;

    /* JADX INFO: renamed from: k */
    private long f53379k;

    /* JADX INFO: renamed from: l */
    private PendingRefreshResult f53380l;

    /* JADX INFO: renamed from: m */
    private boolean f53381m;

    /* JADX INFO: renamed from: n */
    private boolean f53382n;

    /* JADX INFO: renamed from: o */
    private final TVChannelHomeViewModel$localeChangedReceiver$1 f53383o;

    /* JADX INFO: renamed from: com.transsion.home.tv.TVChannelHomeViewModel$a */
    public static final class C15434a {
        private C15434a() {
        }

        public /* synthetic */ C15434a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.tv.TVChannelHomeViewModel$b */
    public static final class C15435b extends AbstractC28362a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ boolean f53385e;

        C15435b(boolean z11) {
            this.f53385e = z11;
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C26866a.f81698a.m104915i("TVChannelHomeViewModel", "loadCountryList failed code=" + str + " msg=" + str2, true);
            if (this.f53385e) {
                return;
            }
            TVChannelHomeViewModel.this.m68543q().mo14858q(null);
            TVChannelHomeViewModel.this.m68542p().mo14858q(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(CountryDataBean countryDataBean) {
            List<CountryItem> listL;
            String countryCode;
            if (countryDataBean == null || (listL = countryDataBean.getItems()) == null) {
                listL = CollectionsKt.m97506l();
            }
            TVChannelHomeViewModel.this.m68539m().mo14858q(listL);
            if (this.f53385e) {
                C26866a.f81698a.m104912c("TVChannelHomeViewModel", "loadCountryList success, country list updated, cache hit skip refresh", false);
                return;
            }
            CountryItem currentCountry = countryDataBean != null ? countryDataBean.getCurrentCountry() : null;
            TVChannelHomeViewModel.this.m68543q().mo14858q(currentCountry);
            C26866a.f81698a.m104912c("TVChannelHomeViewModel", "loadCountryList success, first=" + (currentCountry != null ? currentCountry.getCountryName() : null), false);
            if (currentCountry == null || (countryCode = currentCountry.getCountryCode()) == null) {
                return;
            }
            TVChannelHomeViewModel.this.m68536y(countryCode);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.tv.TVChannelHomeViewModel$c */
    public static final class C15436c extends AbstractC28362a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f53387e;

        C15436c(String str) {
            this.f53387e = str;
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            TVChannelHomeViewModel.this.f53382n = false;
            C26866a.f81698a.m104915i("TVChannelHomeViewModel", "loadMore failed code=" + str + " msg=" + str2, true);
            TVChannelHomeViewModel.this.m68541o().mo14858q(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(TvChannelListDataBean tvChannelListDataBean) {
            List<TvChannelItem> listL;
            TVChannelHomeViewModel.this.f53382n = false;
            TVChannelHomeViewModel.this.f53377i = tvChannelListDataBean != null ? tvChannelListDataBean.getPager() : null;
            TVChannelHomeViewModel tVChannelHomeViewModel = TVChannelHomeViewModel.this;
            if (tvChannelListDataBean == null || (listL = tvChannelListDataBean.getItems()) == null) {
                listL = CollectionsKt.m97506l();
            }
            List listM68531k = tVChannelHomeViewModel.m68531k(listL, false);
            C26866a.a aVar = C26866a.f81698a;
            String str = this.f53387e;
            int size = listM68531k.size();
            Pager pager = TVChannelHomeViewModel.this.f53377i;
            aVar.m104912c("TVChannelHomeViewModel", "loadMore success page=" + str + " size=" + size + " hasMore=" + (pager != null ? pager.getHasMore() : null), false);
            TVChannelHomeViewModel.this.m68541o().mo14858q(new TvChannelLoadMoreResult(listM68531k, TVChannelHomeViewModel.this.m68544s()));
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.tv.TVChannelHomeViewModel$d */
    public static final class C15438d extends AbstractC28362a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ long f53389e;

        C15438d(long j11) {
            this.f53389e = j11;
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C26866a.f81698a.m104915i("TVChannelHomeViewModel", "requestFirstPageChannels failed code=" + str + " msg=" + str2, true);
            TVChannelHomeViewModel.this.m68534v(this.f53389e, null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(TvChannelListDataBean tvChannelListDataBean) {
            TVChannelHomeViewModel.this.m68534v(this.f53389e, tvChannelListDataBean);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.tv.TVChannelHomeViewModel$e */
    public static final class C15439e extends AbstractC28362a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ long f53391e;

        C15439e(long j11) {
            this.f53391e = j11;
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C26866a.f81698a.m104915i("TVChannelHomeViewModel", "requestOperateData failed code=" + str + " msg=" + str2, true);
            TVChannelHomeViewModel.this.m68535w(this.f53391e, null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(SubOperateData subOperateData) {
            SubOperateData subOperateDataCopy$default = null;
            if (subOperateData != null) {
                List<OperateItem> items = subOperateData.getItems();
                subOperateDataCopy$default = SubOperateData.copy$default(subOperateData, items != null ? CollectionsKt.m97343U0(items) : null, null, null, null, 14, null);
            }
            TVChannelHomeViewModel.this.m68535w(this.f53391e, subOperateDataCopy$default);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.content.BroadcastReceiver, com.transsion.home.tv.TVChannelHomeViewModel$localeChangedReceiver$1] */
    public TVChannelHomeViewModel(Application app) {
        super(app);
        Intrinsics.m97802h(app, "app");
        this.f53370b = new C3187b0();
        this.f53371c = new C3187b0();
        this.f53372d = new C3187b0();
        this.f53373e = new C3187b0();
        this.f53374f = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.tv.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TVChannelHomeViewModel.m68521C();
            }
        });
        this.f53375g = new Gson();
        this.f53376h = "";
        this.f53378j = true;
        ?? r11 = new BroadcastReceiver() { // from class: com.transsion.home.tv.TVChannelHomeViewModel$localeChangedReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Intrinsics.m97802h(context, "context");
                Intrinsics.m97802h(intent, "intent");
                C28123e.f86305a.m109233b().remove("default_tv_country");
                this.f53392a.m68543q().mo14855n(null);
                C26866a.f81698a.m104912c("TVChannelHomeViewModel", "locale changed, clear cached tv country", false);
            }
        };
        this.f53383o = r11;
        IntentFilter intentFilter = new IntentFilter(m14886b().getPackageName() + "_LOCALE_CHANGED_ACTION");
        if (Build.VERSION.SDK_INT >= 33) {
            m14886b().registerReceiver(r11, intentFilter, 2);
        } else {
            m14886b().registerReceiver(r11, intentFilter);
        }
    }

    /* JADX INFO: renamed from: A */
    private final void m68520A(long j11, String str) {
        m68533r().m108957c(str).m95079f(C28365d.f87067a.m109702c()).subscribe(new C15439e(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final InterfaceC28023a m68521C() {
        return (InterfaceC28023a) C22982c.f70163e.m91553a().m91552h(InterfaceC28023a.class);
    }

    /* JADX INFO: renamed from: D */
    private final void m68522D(long j11) {
        PendingRefreshResult pendingRefreshResult;
        List<TvChannelItem> listL;
        if (j11 == this.f53379k && (pendingRefreshResult = this.f53380l) != null && pendingRefreshResult.getChannelDone() && pendingRefreshResult.getOperateDone()) {
            this.f53381m = false;
            if (pendingRefreshResult.getChannelFailed() || pendingRefreshResult.getChannelData() == null) {
                this.f53372d.mo14858q(null);
                return;
            }
            TvChannelListDataBean channelData = pendingRefreshResult.getChannelData();
            this.f53377i = channelData != null ? channelData.getPager() : null;
            List listM68532l = m68532l(pendingRefreshResult.getOperateData());
            TvChannelListDataBean channelData2 = pendingRefreshResult.getChannelData();
            if (channelData2 == null || (listL = channelData2.getItems()) == null) {
                listL = CollectionsKt.m97506l();
            }
            List listM68531k = m68531k(listL, true);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(listM68532l);
            arrayList.addAll(listM68531k);
            C26866a.a aVar = C26866a.f81698a;
            int size = listM68532l.size();
            int size2 = listM68531k.size();
            Pager pager = this.f53377i;
            aVar.m104912c("TVChannelHomeViewModel", "refresh merge success operate=" + size + " channels=" + size2 + " hasMore=" + (pager != null ? pager.getHasMore() : null), false);
            this.f53372d.mo14858q(new TvChannelRefreshResult(arrayList, m68544s()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final List m68531k(List list, boolean z11) {
        if (list.isEmpty()) {
            return CollectionsKt.m97506l();
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            String string = m14886b().getString(R$string.home_tv_all_channels);
            Intrinsics.m97801g(string, "getString(...)");
            arrayList.add(new OperateItem(string, PostItemType.TV_CHANNEL_HEADER.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741820, null));
        }
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m97516v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(new OperateItem(null, PostItemType.TV_CHANNEL_ITEM.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (TvChannelItem) it.next(), 536870909, null));
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    private final List m68532l(SubOperateData subOperateData) {
        List arrayList;
        List<OperateItem> items;
        List listI0;
        if (subOperateData == null || (items = subOperateData.getItems()) == null || (listI0 = CollectionsKt.m97331I0(items, new Comparator() { // from class: com.transsion.home.tv.TVChannelHomeViewModel$convertOperateDataToList$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return ComparisonsKt.m97603d(((OperateItem) t11).getPosition(), ((OperateItem) t12).getPosition());
            }
        })) == null || (arrayList = CollectionsKt.m97343U0(listI0)) == null) {
            arrayList = new ArrayList();
        }
        String trendingTitle = subOperateData != null ? subOperateData.getTrendingTitle() : null;
        if (trendingTitle != null && trendingTitle.length() != 0) {
            arrayList.add(new OperateItem(subOperateData != null ? subOperateData.getTrendingTitle() : null, PostItemType.FEEDS_TITLE.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741820, null));
        }
        AbstractC28126h.m109236c(arrayList, subOperateData != null ? subOperateData.getOps() : null);
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    private final InterfaceC28023a m68533r() {
        return (InterfaceC28023a) this.f53374f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final void m68534v(long j11, TvChannelListDataBean tvChannelListDataBean) {
        PendingRefreshResult pendingRefreshResult;
        if (j11 == this.f53379k && (pendingRefreshResult = this.f53380l) != null) {
            pendingRefreshResult.setChannelDone(true);
            pendingRefreshResult.setChannelData(tvChannelListDataBean);
            pendingRefreshResult.setChannelFailed(tvChannelListDataBean == null);
            m68522D(j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final void m68535w(long j11, SubOperateData subOperateData) {
        PendingRefreshResult pendingRefreshResult;
        if (j11 == this.f53379k && (pendingRefreshResult = this.f53380l) != null) {
            pendingRefreshResult.setOperateDone(true);
            pendingRefreshResult.setOperateData(subOperateData);
            m68522D(j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final void m68536y(String str) {
        if (this.f53381m) {
            return;
        }
        this.f53381m = true;
        this.f53376h = str;
        this.f53377i = null;
        this.f53378j = true;
        long j11 = this.f53379k + 1;
        this.f53379k = j11;
        this.f53380l = new PendingRefreshResult(str, false, false, false, null, null, 62, null);
        m68520A(j11, str);
        m68537z(j11, str);
    }

    /* JADX INFO: renamed from: z */
    private final void m68537z(long j11, String str) {
        m68533r().m108958d("1", 10, str).m95079f(C28365d.f87067a.m109702c()).subscribe(new C15438d(j11));
    }

    /* JADX INFO: renamed from: B */
    public final void m68538B(CountryItem country) {
        Intrinsics.m97802h(country, "country");
        this.f53370b.mo14858q(country);
        C28123e.f86305a.m109233b().putString("default_tv_country", this.f53375g.toJson(country));
        String countryCode = country.getCountryCode();
        if (countryCode != null) {
            m68536y(countryCode);
        }
    }

    /* JADX INFO: renamed from: m */
    public final C3187b0 m68539m() {
        return this.f53371c;
    }

    /* JADX INFO: renamed from: n */
    public final String m68540n() {
        TvChannelListDataBean channelData;
        List<TvChannelItem> items;
        TvChannelItem tvChannelItem;
        PendingRefreshResult pendingRefreshResult = this.f53380l;
        if (pendingRefreshResult == null || (channelData = pendingRefreshResult.getChannelData()) == null || (items = channelData.getItems()) == null || (tvChannelItem = (TvChannelItem) CollectionsKt.m97361k0(items)) == null) {
            return null;
        }
        return tvChannelItem.getChannelId();
    }

    /* JADX INFO: renamed from: o */
    public final C3187b0 m68541o() {
        return this.f53373e;
    }

    @Override // androidx.p1004lifecycle.AbstractC3223t0
    protected void onCleared() {
        super.onCleared();
        m14886b().unregisterReceiver(this.f53383o);
    }

    /* JADX INFO: renamed from: p */
    public final C3187b0 m68542p() {
        return this.f53372d;
    }

    /* JADX INFO: renamed from: q */
    public final C3187b0 m68543q() {
        return this.f53370b;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m68544s() {
        Pager pager = this.f53377i;
        if (pager != null) {
            return Intrinsics.m97797c(pager.getHasMore(), Boolean.TRUE);
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final void m68545t() {
        String string = C28123e.f86305a.m109233b().getString("default_tv_country", "");
        boolean z11 = string == null || string.length() == 0;
        boolean z12 = !z11;
        if (!z11) {
            try {
                CountryItem countryItem = (CountryItem) this.f53375g.fromJson(string, CountryItem.class);
                if (countryItem != null) {
                    this.f53370b.mo14858q(countryItem);
                    C26866a.f81698a.m104912c("TVChannelHomeViewModel", "loadCountryList use cache country=" + countryItem.getCountryName(), false);
                    String countryCode = countryItem.getCountryCode();
                    if (countryCode != null) {
                        m68536y(countryCode);
                    }
                }
            } catch (Exception e11) {
                C26866a.f81698a.m104915i("TVChannelHomeViewModel", "restore country from cache failed: " + e11.getMessage(), false);
            }
        }
        m68533r().m108955a().m95079f(C28365d.f87067a.m109702c()).subscribe(new C15435b(z12));
    }

    /* JADX INFO: renamed from: u */
    public final void m68546u() {
        if (this.f53381m || this.f53382n) {
            return;
        }
        Pager pager = this.f53377i;
        String nextPage = pager != null ? pager.getNextPage() : null;
        if (nextPage == null || nextPage.length() == 0) {
            C26866a.f81698a.m104921x("TVChannelHomeViewModel", "loadMoreChannels: nextPage is null, ignore", false);
            return;
        }
        this.f53382n = true;
        this.f53378j = false;
        m68533r().m108958d(nextPage, 10, this.f53376h).m95079f(C28365d.f87067a.m109702c()).subscribe(new C15436c(nextPage));
    }

    /* JADX INFO: renamed from: x */
    public final void m68547x() {
        if (this.f53376h.length() == 0 || this.f53381m) {
            return;
        }
        m68536y(this.f53376h);
    }
}
