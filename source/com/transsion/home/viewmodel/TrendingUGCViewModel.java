package com.transsion.home.viewmodel;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import ch.C5096b;
import com.blankj.utilcode.util.AbstractC5796o;
import com.google.gson.Gson;
import com.transsion.baselib.net.LaunchWithErrorHandlerKt;
import com.transsion.baselib.report.C14489h;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.home.adapter.operateUGC.C14863b;
import com.transsion.home.adapter.trending.adapter.SportLiveAdapter;
import com.transsion.home.bean.BannerBean;
import com.transsion.home.bean.BannerData;
import com.transsion.home.bean.DisplayMeta;
import com.transsion.home.bean.FeedsLayoutType;
import com.transsion.home.bean.LiveListItem;
import com.transsion.home.bean.MainOperateData;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.bean.RoomEntranceResponse;
import com.transsion.home.bean.TrendingRequestEntity;
import com.transsion.home.bean.TrendingRespItem;
import com.transsion.home.viewmodel.preload.C15568a;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.ugcvideodetail.api.bean.UGCContent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import p415fq.C23420k;
import p743rh.C27287m;
import p842vl.C28123e;
import p946yj.C28958a;
import p946yj.C28959b;
import pg.C26866a;
import sl.InterfaceC27631e;

/* JADX INFO: loaded from: classes5.dex */
public final class TrendingUGCViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: l */
    public static final C15543a f53672l = new C15543a(null);

    /* JADX INFO: renamed from: m */
    public static final int f53673m = 8;

    /* JADX INFO: renamed from: n */
    private static TrendingUGCViewModel f53674n;

    /* JADX INFO: renamed from: b */
    private String f53675b;

    /* JADX INFO: renamed from: c */
    private int f53676c;

    /* JADX INFO: renamed from: d */
    private boolean f53677d;

    /* JADX INFO: renamed from: e */
    private List f53678e;

    /* JADX INFO: renamed from: f */
    private final Lazy f53679f;

    /* JADX INFO: renamed from: g */
    private final Lazy f53680g;

    /* JADX INFO: renamed from: h */
    private final Lazy f53681h;

    /* JADX INFO: renamed from: i */
    private final Lazy f53682i;

    /* JADX INFO: renamed from: j */
    private final Lazy f53683j;

    /* JADX INFO: renamed from: k */
    private final Lazy f53684k;

    /* JADX INFO: renamed from: com.transsion.home.viewmodel.TrendingUGCViewModel$a */
    public static final class C15543a {
        private C15543a() {
        }

        public /* synthetic */ C15543a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final TrendingUGCViewModel m69046a(Application application) {
            Intrinsics.m97802h(application, "application");
            if (TrendingUGCViewModel.f53674n == null) {
                TrendingUGCViewModel.f53674n = (TrendingUGCViewModel) C3227v0.a.f10070e.m14975a(application).create(TrendingUGCViewModel.class);
            }
            return TrendingUGCViewModel.f53674n;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrendingUGCViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f53675b = "1";
        this.f53676c = 14;
        this.f53679f = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrendingUGCViewModel.m69009H();
            }
        });
        this.f53680g = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrendingUGCViewModel.m69008G();
            }
        });
        this.f53681h = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrendingUGCViewModel.m69014P();
            }
        });
        this.f53682i = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrendingUGCViewModel.m69013O();
            }
        });
        this.f53683j = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrendingUGCViewModel.m69011L();
            }
        });
        this.f53684k = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrendingUGCViewModel.m69031s();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final InterfaceC27631e m69006C() {
        return (InterfaceC27631e) this.f53682i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:116:0x02e0  */
    /* JADX INFO: renamed from: F */
    public final void m69007F(MainOperateData mainOperateData) {
        List<OperateItem> items;
        ArrayList arrayList;
        List<BannerData> banners;
        List<BannerData> banners2;
        List listI0;
        if (mainOperateData == null || (items = mainOperateData.getItems()) == null) {
            return;
        }
        List<OperateItem> items2 = mainOperateData.getItems();
        mainOperateData.setItems((items2 == null || (listI0 = CollectionsKt.m97331I0(items2, new Comparator() { // from class: com.transsion.home.viewmodel.TrendingUGCViewModel$handlerOperateData$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return ComparisonsKt.m97603d(((OperateItem) t11).getPosition(), ((OperateItem) t12).getPosition());
            }
        })) == null) ? null : CollectionsKt.m97343U0(listI0));
        ArrayList<OperateItem> arrayList2 = new ArrayList();
        for (OperateItem operateItem : items) {
            if (Intrinsics.m97797c(operateItem.getType(), PostItemType.SPORT_LIVE.getValue())) {
                List<LiveListItem> liveList = operateItem.getLiveList();
                if (liveList != null) {
                    arrayList = new ArrayList();
                    for (Object obj : liveList) {
                        if (!Intrinsics.m97797c(((LiveListItem) obj).getStatus(), SportLiveAdapter.f52431P)) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    arrayList2.add(operateItem);
                }
            } else if (Intrinsics.m97797c(operateItem.getType(), PostItemType.UGC_MOVIE_RANK.getValue())) {
                List<UGCContent> contentList = operateItem.getContentList();
                if ((contentList != null ? contentList.size() : 0) >= 3) {
                    arrayList2.add(operateItem);
                }
            } else if (Intrinsics.m97797c(operateItem.getType(), PostItemType.CUSTOM_DATA.getValue())) {
                BannerBean banner = operateItem.getBanner();
                if (((banner == null || (banners = banner.getBanners()) == null) ? 0 : banners.size()) >= 3) {
                    arrayList2.add(operateItem);
                }
            } else {
                if (Intrinsics.m97797c(operateItem.getType(), PostItemType.UGC_BANNER.getValue())) {
                    BannerBean banner2 = operateItem.getBanner();
                    if (((banner2 == null || (banners2 = banner2.getBanners()) == null) ? 0 : banners2.size()) != 0) {
                    }
                }
                arrayList2.add(operateItem);
            }
        }
        Integer groupPos = mainOperateData.getGroupPos();
        if ((groupPos != null ? groupPos.intValue() : 0) > 0) {
            C23420k.f71413a.m92983m(true);
            Integer groupPos2 = mainOperateData.getGroupPos();
            int iIntValue = groupPos2 != null ? groupPos2.intValue() : 0;
            if (iIntValue >= items.size()) {
                arrayList2.add(new OperateItem(null, PostItemType.ROOM.getValue(), null, null, "TrendingRoom", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741805, null));
            } else {
                arrayList2.add(iIntValue, new OperateItem(null, PostItemType.ROOM.getValue(), null, null, "TrendingRoom", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741805, null));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (OperateItem operateItem2 : arrayList2) {
            String type = operateItem2.getType();
            PostItemType postItemType = PostItemType.UGC_SUBJECT_LIST;
            if (Intrinsics.m97797c(type, postItemType.getValue()) && Intrinsics.m97797c(operateItem2.getStyleTemplate(), C14863b.f51976M)) {
                List<UGCContent> contentList2 = operateItem2.getContentList();
                boolean z11 = (contentList2 != null ? contentList2.size() : 0) % 2 == 0;
                String title = operateItem2.getTitle();
                if (!(title == null || title.length() == 0)) {
                    arrayList3.add(new OperateItem(operateItem2.getTitle(), PostItemType.FEEDS_TITLE.getValue(), null, operateItem2.getDeepLink(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741812, null));
                }
                List<UGCContent> contentList3 = operateItem2.getContentList();
                if (contentList3 != null) {
                    int i11 = 0;
                    for (Object obj2 : contentList3) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.m97515u();
                        }
                        UGCContent uGCContent = (UGCContent) obj2;
                        if (i11 == 0) {
                            arrayList3.add(new OperateItem(null, PostItemType.TRENDING_FEES_BIG.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, uGCContent.getVideo(), null, null, null, null, null, null, operateItem2, null, null, 938475517, null));
                        } else if (z11) {
                            List<UGCContent> contentList4 = operateItem2.getContentList();
                            if (!(contentList4 != null && i11 == contentList4.size() - 1)) {
                                arrayList3.add(new OperateItem(null, PostItemType.TRENDING_FEES_GRID.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, uGCContent.getVideo(), null, null, null, null, null, null, operateItem2, null, null, 938475517, null));
                            }
                        } else {
                            arrayList3.add(new OperateItem(null, PostItemType.TRENDING_FEES_GRID.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, uGCContent.getVideo(), null, null, null, null, null, null, operateItem2, null, null, 938475517, null));
                        }
                        i11 = i12;
                    }
                }
                arrayList3.add(new OperateItem(null, PostItemType.TRENDING_MARGIN.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741821, null));
            } else {
                if (Intrinsics.m97797c(operateItem2.getType(), postItemType.getValue()) && Intrinsics.m97797c(operateItem2.getStyleTemplate(), C14863b.f51977N)) {
                    operateItem2.setType(PostItemType.UGC_PORTRAIT_GRID.getValue());
                }
                arrayList3.add(operateItem2);
            }
        }
        if (m69044y().m14847f() == null && !C27287m.f83003a.m106330e()) {
            int iM69043x = m69043x(arrayList3);
            if (iM69043x >= 0 && iM69043x < arrayList3.size()) {
                arrayList3.add(iM69043x, new OperateItem(null, PostItemType.NO_NETWORK.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741821, null));
            }
        }
        if (mainOperateData.getTrendingTitle() != null) {
            arrayList3.add(new OperateItem(mainOperateData.getTrendingTitle(), PostItemType.FEEDS_TITLE.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741820, null));
        }
        mainOperateData.setItems(arrayList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C3187b0 m69008G() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C3187b0 m69009H() {
        return new C3187b0();
    }

    /* JADX INFO: renamed from: K */
    private final void m69010K() {
        LaunchWithErrorHandlerKt.m65254b(this, new TrendingUGCViewModel$requestOperateData$1(this, null), new TrendingUGCViewModel$requestOperateData$2(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C3187b0 m69011L() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final void m69012M(MainOperateData mainOperateData) {
        List<OperateItem> items;
        if (mainOperateData == null || (items = mainOperateData.getItems()) == null || !(!items.isEmpty())) {
            return;
        }
        String json = new Gson().toJson(mainOperateData);
        C14496b c14496b = C14496b.f50966a;
        c14496b.m65344b().putString("trending_operating_version", mainOperateData.getVersion());
        c14496b.m65344b().putString("trending_operating_data", json);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final InterfaceC27631e m69013O() {
        return (InterfaceC27631e) C22982c.f70163e.m91553a().m91552h(InterfaceC27631e.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C3187b0 m69014P() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C15568a m69031s() {
        return new C15568a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final List m69032t(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TrendingRespItem trendingRespItem = (TrendingRespItem) it.next();
            UGCContent content = trendingRespItem.getContent();
            if ((content != null ? content.getVideo() : null) != null) {
                DisplayMeta displayMeta = trendingRespItem.getDisplayMeta();
                if (Intrinsics.m97797c(displayMeta != null ? displayMeta.getLayoutType() : null, FeedsLayoutType.FULL.getValue())) {
                    String value = PostItemType.TRENDING_FEES_BIG.getValue();
                    UGCContent content2 = trendingRespItem.getContent();
                    arrayList.add(new OperateItem(null, value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, content2 != null ? content2.getVideo() : null, null, null, null, null, null, null, null, null, null, 1072693245, null));
                } else {
                    DisplayMeta displayMeta2 = trendingRespItem.getDisplayMeta();
                    if (Intrinsics.m97797c(displayMeta2 != null ? displayMeta2.getLayoutType() : null, FeedsLayoutType.HALF.getValue())) {
                        String value2 = PostItemType.TRENDING_FEES_GRID.getValue();
                        UGCContent content3 = trendingRespItem.getContent();
                        arrayList.add(new OperateItem(null, value2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, content3 != null ? content3.getVideo() : null, null, null, null, null, null, null, null, null, null, 1072693245, null));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final Unit m69033v(TrendingUGCViewModel trendingUGCViewModel) {
        String string = C28123e.f86305a.m109233b().getString("trending_room_entrance_cache_v2", "");
        if (string == null || string.length() == 0) {
            C26866a.f81698a.m104912c("TrendingUGCFragment", "fetchGroupInfo failed without cache", true);
        } else {
            trendingUGCViewModel.m69036B().mo14855n((RoomEntranceResponse) AbstractC5796o.m27441d(string, RoomEntranceResponse.class));
            C26866a.f81698a.m104912c("TrendingUGCFragment", "fetchGroupInfo use cache", true);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: w */
    private final C15568a m69034w() {
        return (C15568a) this.f53684k.getValue();
    }

    /* JADX INFO: renamed from: A */
    public final void m69035A(Context context) {
        Intrinsics.m97802h(context, "context");
        String string = C14496b.f50966a.m65344b().getString("trending_operating_data", "");
        if (string == null || string.length() == 0) {
            string = m69034w().m69169e(context);
        }
        if (string != null) {
            try {
                if (string.length() == 0) {
                    C26866a.f81698a.m104912c("PreloadTrending", "preloadOperatingCache json is null", true);
                } else {
                    MainOperateData mainOperateData = (MainOperateData) AbstractC5796o.m27441d(string, MainOperateData.class);
                    if (mainOperateData != null) {
                        C26866a.a aVar = C26866a.f81698a;
                        List<OperateItem> items = mainOperateData.getItems();
                        aVar.m104912c("PreloadTrending", "load operating cache size=" + (items != null ? Integer.valueOf(items.size()) : null) + "}", true);
                        m69007F(mainOperateData);
                        m69044y().mo14855n(mainOperateData);
                    }
                }
            } catch (Exception e11) {
                C26866a.f81698a.m104912c("PreloadTrending", "exception when from json " + e11.getMessage(), true);
            }
        } else {
            C26866a.f81698a.m104912c("PreloadTrending", "preloadOperatingCache json is null", true);
        }
        m69010K();
    }

    /* JADX INFO: renamed from: B */
    public final C3187b0 m69036B() {
        return (C3187b0) this.f53683j.getValue();
    }

    /* JADX INFO: renamed from: D */
    public final List m69037D() {
        return this.f53678e;
    }

    /* JADX INFO: renamed from: E */
    public final C3187b0 m69038E() {
        return (C3187b0) this.f53681h.getValue();
    }

    /* JADX INFO: renamed from: I */
    public final void m69039I() {
        this.f53675b = "1";
        this.f53676c = 14;
        m69010K();
    }

    /* JADX INFO: renamed from: J */
    public final void m69040J() {
        String string;
        if (this.f53677d) {
            return;
        }
        this.f53677d = true;
        TrendingRequestEntity trendingRequestEntity = new TrendingRequestEntity();
        trendingRequestEntity.setPage(this.f53675b);
        trendingRequestEntity.setPerPage(this.f53676c);
        trendingRequestEntity.setSessionId(C5096b.f17579a.m23868h());
        Uri uriM65300c = C14489h.f50945a.m65300c();
        if (uriM65300c == null || (string = uriM65300c.toString()) == null) {
            string = "";
        }
        trendingRequestEntity.setDeepLink(string);
        trendingRequestEntity.setLatest_events(new C28958a(C28959b.f88597a.m111468e()));
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new TrendingUGCViewModel$requestFeedsList$1(trendingRequestEntity, this, null), 2, null);
    }

    /* JADX INFO: renamed from: N */
    public final void m69041N(List list) {
        this.f53678e = list;
    }

    /* JADX INFO: renamed from: u */
    public final void m69042u(boolean z11) {
        Function0 function0 = new Function0() { // from class: com.transsion.home.viewmodel.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrendingUGCViewModel.m69033v(this.f53734a);
            }
        };
        if (z11) {
            function0.invoke();
        } else {
            AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new TrendingUGCViewModel$fetchGroupInfo$1(this, function0, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: x */
    public final int m69043x(List operateItems) {
        Intrinsics.m97802h(operateItems, "operateItems");
        OperateItem operateItem = (OperateItem) CollectionsKt.m97362l0(operateItems, 0);
        return Intrinsics.m97797c(operateItem != null ? operateItem.getType() : null, PostItemType.TRENDING_FEES_GRID.getValue()) ? 2 : 1;
    }

    /* JADX INFO: renamed from: y */
    public final C3187b0 m69044y() {
        return (C3187b0) this.f53680g.getValue();
    }

    /* JADX INFO: renamed from: z */
    public final C3187b0 m69045z() {
        return (C3187b0) this.f53679f.getValue();
    }
}
