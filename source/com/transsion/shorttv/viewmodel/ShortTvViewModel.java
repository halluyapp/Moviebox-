package com.transsion.shorttv.viewmodel;

import android.app.Application;
import android.content.Context;
import android.support.v4.media.session.AbstractC0190c;
import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import ch.C5096b;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.transsion.shorttv.bean.AppointSubject;
import com.transsion.shorttv.bean.BannerBean;
import com.transsion.shorttv.bean.BannerData;
import com.transsion.shorttv.bean.Cover;
import com.transsion.shorttv.bean.CustomData;
import com.transsion.shorttv.bean.ImmVideoRequestEntity;
import com.transsion.shorttv.bean.Media;
import com.transsion.shorttv.bean.OperateItem;
import com.transsion.shorttv.bean.OperatingResp;
import com.transsion.shorttv.bean.PlayListItem;
import com.transsion.shorttv.bean.RankingListData;
import com.transsion.shorttv.bean.RankingListItem;
import com.transsion.shorttv.bean.ShortTVFavInfo;
import com.transsion.shorttv.bean.ShortTVItem;
import com.transsion.shorttv.bean.ShortTvInnerPlayBean;
import com.transsion.shorttv.bean.ShortTvItemType;
import com.transsion.shorttv.bean.Subject;
import com.transsion.shorttv.bean.Video;
import com.transsion.shorttv.constants.BannerType;
import com.transsion.shorttv.p314db.ShortTvAdUnlockDao;
import com.transsion.shorttv.p314db.ShortTvDatabase;
import com.transsion.shorttv.p314db.ShortTvFavoriteDao;
import com.transsion.shorttv.utils.C19165h;
import es.C23219b;
import fo.C23403e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25204t1;
import p349dh.C22982c;
import p654oo.InterfaceC26373f;
import p659os.AbstractC26725k;
import p659os.AbstractC26726l;
import p659os.C26719e;
import p717qr.C27124c;
import p743rh.C27287m;
import p790ts.InterfaceC27847a;
import p848vs.InterfaceC28210a;
import p848vs.InterfaceC28213d;
import p848vs.InterfaceC28214e;
import p848vs.InterfaceC28215f;
import p848vs.InterfaceC28216g;
import p848vs.InterfaceC28217h;
import p848vs.InterfaceC28218i;
import p848vs.InterfaceC28220k;
import p848vs.InterfaceC28221l;
import pg.C26866a;
import us.C28034a;
import ws.InterfaceC28435a;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTvViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: d0 */
    public static final C19176a f61597d0 = new C19176a(null);

    /* JADX INFO: renamed from: A */
    private final HashMap f61598A;

    /* JADX INFO: renamed from: B */
    private final Set f61599B;

    /* JADX INFO: renamed from: C */
    private final C3187b0 f61600C;

    /* JADX INFO: renamed from: D */
    private final C3187b0 f61601D;

    /* JADX INFO: renamed from: E */
    private final LiveData f61602E;

    /* JADX INFO: renamed from: F */
    private final C3187b0 f61603F;

    /* JADX INFO: renamed from: G */
    private final LiveData f61604G;

    /* JADX INFO: renamed from: H */
    private final C3187b0 f61605H;

    /* JADX INFO: renamed from: I */
    private final LiveData f61606I;

    /* JADX INFO: renamed from: J */
    private final C3187b0 f61607J;

    /* JADX INFO: renamed from: K */
    private final LiveData f61608K;

    /* JADX INFO: renamed from: L */
    private final C3187b0 f61609L;

    /* JADX INFO: renamed from: M */
    private LiveData f61610M;

    /* JADX INFO: renamed from: N */
    private final Lazy f61611N;

    /* JADX INFO: renamed from: O */
    private final Lazy f61612O;

    /* JADX INFO: renamed from: P */
    private final Lazy f61613P;

    /* JADX INFO: renamed from: Q */
    private final InterfaceC28435a f61614Q;

    /* JADX INFO: renamed from: R */
    private final Lazy f61615R;

    /* JADX INFO: renamed from: S */
    private final Lazy f61616S;

    /* JADX INFO: renamed from: T */
    private final Lazy f61617T;

    /* JADX INFO: renamed from: U */
    private final Lazy f61618U;

    /* JADX INFO: renamed from: V */
    private final Lazy f61619V;

    /* JADX INFO: renamed from: W */
    private final Lazy f61620W;

    /* JADX INFO: renamed from: X */
    private final Lazy f61621X;

    /* JADX INFO: renamed from: Y */
    private final Lazy f61622Y;

    /* JADX INFO: renamed from: Z */
    private final Lazy f61623Z;

    /* JADX INFO: renamed from: a0 */
    private final HashMap f61625a0;

    /* JADX INFO: renamed from: b0 */
    private InterfaceC25204t1 f61627b0;

    /* JADX INFO: renamed from: c0 */
    private final HashMap f61629c0;

    /* JADX INFO: renamed from: g */
    private final C3187b0 f61633g;

    /* JADX INFO: renamed from: h */
    private final LiveData f61634h;

    /* JADX INFO: renamed from: i */
    private String f61635i;

    /* JADX INFO: renamed from: j */
    private boolean f61636j;

    /* JADX INFO: renamed from: k */
    private volatile boolean f61637k;

    /* JADX INFO: renamed from: l */
    private final C3187b0 f61638l;

    /* JADX INFO: renamed from: m */
    private final LiveData f61639m;

    /* JADX INFO: renamed from: n */
    private final C3187b0 f61640n;

    /* JADX INFO: renamed from: o */
    private final C3187b0 f61641o;

    /* JADX INFO: renamed from: p */
    private final LiveData f61642p;

    /* JADX INFO: renamed from: q */
    private final C3187b0 f61643q;

    /* JADX INFO: renamed from: r */
    private final LiveData f61644r;

    /* JADX INFO: renamed from: s */
    private final C3187b0 f61645s;

    /* JADX INFO: renamed from: t */
    private final LiveData f61646t;

    /* JADX INFO: renamed from: u */
    private List f61647u;

    /* JADX INFO: renamed from: v */
    private ConcurrentHashMap f61648v;

    /* JADX INFO: renamed from: w */
    private final C3187b0 f61649w;

    /* JADX INFO: renamed from: x */
    private final C3187b0 f61650x;

    /* JADX INFO: renamed from: y */
    private final C3187b0 f61651y;

    /* JADX INFO: renamed from: z */
    private final C3187b0 f61652z;

    /* JADX INFO: renamed from: a */
    private final InterfaceC27847a f61624a = (InterfaceC27847a) C22982c.f70163e.m91553a().m91552h(InterfaceC27847a.class);

    /* JADX INFO: renamed from: b */
    private AtomicBoolean f61626b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    private AtomicBoolean f61628c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    private final C3187b0 f61630d = new C3187b0();

    /* JADX INFO: renamed from: e */
    private final C3187b0 f61631e = new C3187b0();

    /* JADX INFO: renamed from: f */
    private final C3187b0 f61632f = new C3187b0();

    /* JADX INFO: renamed from: com.transsion.shorttv.viewmodel.ShortTvViewModel$a */
    public static final class C19176a {
        private C19176a() {
        }

        public /* synthetic */ C19176a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ShortTvViewModel() {
        C3187b0 c3187b0 = new C3187b0();
        this.f61633g = c3187b0;
        this.f61634h = c3187b0;
        C3187b0 c3187b1 = new C3187b0();
        this.f61638l = c3187b1;
        this.f61639m = c3187b1;
        this.f61640n = new C3187b0();
        C3187b0 c3187b2 = new C3187b0();
        this.f61641o = c3187b2;
        this.f61642p = c3187b2;
        C3187b0 c3187b3 = new C3187b0();
        this.f61643q = c3187b3;
        this.f61644r = c3187b3;
        C3187b0 c3187b4 = new C3187b0();
        this.f61645s = c3187b4;
        this.f61646t = c3187b4;
        this.f61647u = new ArrayList();
        this.f61648v = new ConcurrentHashMap();
        this.f61649w = new C3187b0();
        this.f61650x = new C3187b0();
        this.f61651y = new C3187b0();
        this.f61652z = new C3187b0();
        this.f61598A = new HashMap();
        this.f61599B = new LinkedHashSet();
        this.f61600C = new C3187b0();
        C3187b0 c3187b5 = new C3187b0();
        this.f61601D = c3187b5;
        this.f61602E = c3187b5;
        C3187b0 c3187b6 = new C3187b0();
        this.f61603F = c3187b6;
        this.f61604G = c3187b6;
        C3187b0 c3187b7 = new C3187b0();
        this.f61605H = c3187b7;
        this.f61606I = c3187b7;
        C3187b0 c3187b8 = new C3187b0();
        this.f61607J = c3187b8;
        this.f61608K = c3187b8;
        C3187b0 c3187b9 = new C3187b0();
        this.f61609L = c3187b9;
        this.f61610M = c3187b9;
        this.f61611N = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.viewmodel.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvViewModel.m80295V0();
            }
        });
        this.f61612O = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.viewmodel.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvViewModel.m80292Q(this.f61665a);
            }
        });
        this.f61613P = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.viewmodel.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvViewModel.m80289J(this.f61666a);
            }
        });
        this.f61614Q = C27124c.f82233a.m105541c();
        this.f61615R = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.viewmodel.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvViewModel.m80306h1(this.f61667a);
            }
        });
        this.f61616S = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.viewmodel.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvViewModel.m80313k1(this.f61668a);
            }
        });
        this.f61617T = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.viewmodel.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvViewModel.m80310j1(this.f61669a);
            }
        });
        this.f61618U = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.viewmodel.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvViewModel.m80321o1(this.f61670a);
            }
        });
        this.f61619V = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.viewmodel.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvViewModel.m80315l1(this.f61671a);
            }
        });
        this.f61620W = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.viewmodel.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvViewModel.m80323p1(this.f61661a);
            }
        });
        this.f61621X = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.viewmodel.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvViewModel.m80319n1(this.f61662a);
            }
        });
        this.f61622Y = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.viewmodel.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ShortTvViewModel.m80304g(this.f61663a);
                return null;
            }
        });
        this.f61623Z = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.viewmodel.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvViewModel.m80317m1(this.f61664a);
            }
        });
        this.f61625a0 = new HashMap();
        this.f61629c0 = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public final Object m80288I0(String str, Subject subject, Continuation continuation) {
        return AbstractC25088i.m98910g(C25220y0.m99268b(), new ShortTvViewModel$getTrailerItem$2(subject, str, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final ShortTvAdUnlockDao m80289J(ShortTvViewModel shortTvViewModel) {
        Object objM112707constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            ShortTvDatabase.Companion c18839b = ShortTvDatabase.INSTANCE;
            Application applicationM27275a = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a, "getApp(...)");
            objM112707constructorimpl = Result.m112707constructorimpl(c18839b.m79351b(applicationM27275a).mo79348j0());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "adUnlockDao init failed: " + thM112710exceptionOrNullimpl, false, 4, null);
        }
        if (Result.m112713isFailureimpl(objM112707constructorimpl)) {
            objM112707constructorimpl = null;
        }
        return (ShortTvAdUnlockDao) objM112707constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public final boolean m80290L0(List list) {
        int size = this.f61647u.size();
        List list2 = this.f61647u;
        ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((ShortTVItem) it.next()).getEp()));
        }
        Set setV0 = CollectionsKt.m97344V0(arrayList);
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!setV0.contains(Integer.valueOf(((ShortTVItem) obj).getEp()))) {
                    arrayList2.add(obj);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                this.f61647u.add((ShortTVItem) it2.next());
            }
        }
        return this.f61647u.size() > size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public final void m80291M0(OperatingResp operatingResp) {
        List<OperateItem> items;
        List<RankingListItem> items2;
        List<BannerData> items3;
        List<BannerData> banners;
        if (operatingResp == null || (items = operatingResp.getItems()) == null) {
            return;
        }
        for (OperateItem operateItem : items) {
            operateItem.setOps(operatingResp.getOps());
            BannerBean banner = operateItem.getBanner();
            if (banner != null && (banners = banner.getBanners()) != null) {
                for (BannerData bannerData : banners) {
                    if (bannerData != null) {
                        bannerData.setOps(operatingResp.getOps());
                    }
                }
            }
            List<AppointSubject> subjects = operateItem.getSubjects();
            if (subjects != null) {
                Iterator<T> it = subjects.iterator();
                while (it.hasNext()) {
                    ((AppointSubject) it.next()).setOps(operatingResp.getOps());
                }
            }
            CustomData customData = operateItem.getCustomData();
            if (customData != null && (items3 = customData.getItems()) != null) {
                Iterator<T> it2 = items3.iterator();
                while (it2.hasNext()) {
                    ((BannerData) it2.next()).setOps(operatingResp.getOps());
                }
            }
            List<Subject> rankings = operateItem.getRankings();
            if (rankings != null) {
                Iterator<T> it3 = rankings.iterator();
                while (it3.hasNext()) {
                    ((Subject) it3.next()).setOps(operatingResp.getOps());
                }
            }
            RankingListData rankingListData = operateItem.getRankingListData();
            if (rankingListData != null && (items2 = rankingListData.getItems()) != null) {
                for (RankingListItem rankingListItem : items2) {
                    rankingListItem.setOps(operatingResp.getOps());
                    List<Subject> subjects2 = rankingListItem.getSubjects();
                    if (subjects2 != null) {
                        Iterator<T> it4 = subjects2.iterator();
                        while (it4.hasNext()) {
                            ((Subject) it4.next()).setOps(operatingResp.getOps());
                        }
                    }
                }
            }
            PlayListItem playListData = operateItem.getPlayListData();
            if (playListData != null) {
                playListData.setOps(operatingResp.getOps());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final ShortTvFavoriteDao m80292Q(ShortTvViewModel shortTvViewModel) {
        Object objM112707constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            ShortTvDatabase.Companion c18839b = ShortTvDatabase.INSTANCE;
            Application applicationM27275a = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a, "getApp(...)");
            objM112707constructorimpl = Result.m112707constructorimpl(c18839b.m79351b(applicationM27275a).mo79349k0());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "favoriteDao init failed: " + thM112710exceptionOrNullimpl, false, 4, null);
        }
        if (Result.m112713isFailureimpl(objM112707constructorimpl)) {
            objM112707constructorimpl = null;
        }
        return (ShortTvFavoriteDao) objM112707constructorimpl;
    }

    /* JADX INFO: renamed from: R */
    private final void m80293R(OperatingResp operatingResp) {
        ArrayList arrayList;
        List<BannerData> banners;
        List listU0;
        List<OperateItem> items = operatingResp.getItems();
        if (items != null) {
            for (OperateItem operateItem : items) {
                if (Intrinsics.m97797c(operateItem.getType(), ShortTvItemType.BANNER.getValue())) {
                    BannerBean banner = operateItem.getBanner();
                    if (banner == null || (banners = banner.getBanners()) == null || (listU0 = CollectionsKt.m97343U0(banners)) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        for (Object obj : listU0) {
                            BannerData bannerData = (BannerData) obj;
                            if (bannerData == null || bannerData.getType() != BannerType.GUIDE.ordinal()) {
                                if (bannerData == null || bannerData.getType() != BannerType.AD.ordinal()) {
                                    arrayList.add(obj);
                                }
                            }
                        }
                    }
                    BannerBean banner2 = operateItem.getBanner();
                    if (banner2 != null) {
                        banner2.setBanners(arrayList);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public final ShortTvAdUnlockDao m80294U() {
        return (ShortTvAdUnlockDao) this.f61613P.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final C28034a m80295V0() {
        return new C28034a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public final void m80296X0(String str, List list) {
        C3187b0 c3187b0;
        List list2;
        ShortTVItem shortTVItem;
        ShortTVItem shortTVItem2;
        ShortTVItem shortTVItem3;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "ShortTvViewModel", "--------putEpisodeMap subjectId" + str + "----ep:" + ((list == null || (shortTVItem3 = (ShortTVItem) CollectionsKt.m97361k0(list)) == null) ? null : Integer.valueOf(shortTVItem3.getEp())) + "-" + ((list == null || (shortTVItem2 = (ShortTVItem) CollectionsKt.m97372v0(list)) == null) ? null : Integer.valueOf(shortTVItem2.getEp())), false, 4, null);
        List list3 = list;
        if (list3 == null || list3.isEmpty()) {
            return;
        }
        if (this.f61648v.contains(str)) {
            c3187b0 = (C3187b0) this.f61648v.get(str);
        } else {
            C3187b0 c3187b1 = new C3187b0();
            c3187b1.mo14858q(new ArrayList());
            this.f61648v.put(str, c3187b1);
            c3187b0 = c3187b1;
        }
        List arrayList = c3187b0 != null ? (List) c3187b0.m14847f() : null;
        if (arrayList == null) {
            arrayList = new ArrayList();
            if (c3187b0 != null) {
                c3187b0.mo14858q(arrayList);
            }
        }
        int ep2 = (c3187b0 == null || (list2 = (List) c3187b0.m14847f()) == null || (shortTVItem = (ShortTVItem) CollectionsKt.m97361k0(list2)) == null) ? 0 : shortTVItem.getEp();
        ShortTVItem shortTVItem4 = (ShortTVItem) CollectionsKt.m97361k0(list);
        int ep3 = shortTVItem4 != null ? shortTVItem4.getEp() : 0;
        Boolean bool = (Boolean) this.f61650x.m14847f();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        C26866a.a.m104898f(aVar, "ShortTvViewModel", "putEpisodeMap isNeedPlayCurEp" + zBooleanValue + ",playingEp: " + this.f61649w.m14847f() + " ", false, 4, null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ShortTVItem shortTVItem5 = (ShortTVItem) it.next();
            if (zBooleanValue) {
                int ep4 = shortTVItem5.getEp();
                Integer num = (Integer) this.f61649w.m14847f();
                if (num != null && ep4 == num.intValue()) {
                    C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "AudioTrack change----play  ep:" + shortTVItem5.getEp(), false, 4, null);
                    this.f61650x.mo14858q(Boolean.FALSE);
                    this.f61651y.mo14858q(shortTVItem5);
                    break;
                }
            }
        }
        if (ep2 > ep3) {
            arrayList.addAll(0, list);
        } else {
            arrayList.addAll(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public final ShortTvFavoriteDao m80298b0() {
        return (ShortTvFavoriteDao) this.f61612O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public final void m80300c1(OperatingResp operatingResp) {
        List<OperateItem> items = operatingResp.getItems();
        if (items == null || !(!items.isEmpty())) {
            return;
        }
        C26866a.a aVar = C26866a.f81698a;
        List<BannerData> banners = operatingResp.getBanners();
        C26866a.a.m104908v(aVar, "ShortTvViewModel", "Cache--保存运营位缓存 banner:" + (banners != null ? Integer.valueOf(banners.size()) : null), false, 4, null);
        m80293R(operatingResp);
        C19165h.f61575a.m80241d().putString("short_tv_operating_data", new Gson().toJson(operatingResp));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ InterfaceC28214e m80304g(ShortTvViewModel shortTvViewModel) {
        m80308i1(shortTvViewModel);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final InterfaceC28213d m80306h1(ShortTvViewModel shortTvViewModel) {
        InterfaceC28435a interfaceC28435a = shortTvViewModel.f61614Q;
        if (interfaceC28435a != null) {
            return interfaceC28435a.mo73690b();
        }
        return null;
    }

    /* JADX INFO: renamed from: i1 */
    private static final InterfaceC28214e m80308i1(ShortTvViewModel shortTvViewModel) {
        InterfaceC28435a interfaceC28435a = shortTvViewModel.f61614Q;
        if (interfaceC28435a == null) {
            return null;
        }
        interfaceC28435a.mo73698j();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final InterfaceC28215f m80310j1(ShortTvViewModel shortTvViewModel) {
        InterfaceC28435a interfaceC28435a = shortTvViewModel.f61614Q;
        if (interfaceC28435a != null) {
            return interfaceC28435a.mo73693e();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public final C28034a m80312k0() {
        return (C28034a) this.f61611N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final InterfaceC28216g m80313k1(ShortTvViewModel shortTvViewModel) {
        InterfaceC28435a interfaceC28435a = shortTvViewModel.f61614Q;
        if (interfaceC28435a != null) {
            return interfaceC28435a.mo73694f();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final InterfaceC28217h m80315l1(ShortTvViewModel shortTvViewModel) {
        InterfaceC28435a interfaceC28435a = shortTvViewModel.f61614Q;
        if (interfaceC28435a != null) {
            return interfaceC28435a.mo73689a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final InterfaceC28218i m80317m1(ShortTvViewModel shortTvViewModel) {
        InterfaceC28435a interfaceC28435a = shortTvViewModel.f61614Q;
        if (interfaceC28435a != null) {
            return interfaceC28435a.mo73700l();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final InterfaceC28220k m80319n1(ShortTvViewModel shortTvViewModel) {
        InterfaceC28435a interfaceC28435a = shortTvViewModel.f61614Q;
        if (interfaceC28435a != null) {
            return interfaceC28435a.mo73692d();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final InterfaceC28210a m80321o1(ShortTvViewModel shortTvViewModel) {
        InterfaceC28435a interfaceC28435a = shortTvViewModel.f61614Q;
        if (interfaceC28435a != null) {
            return interfaceC28435a.mo73697i();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final InterfaceC28221l m80323p1(ShortTvViewModel shortTvViewModel) {
        InterfaceC28435a interfaceC28435a = shortTvViewModel.f61614Q;
        if (interfaceC28435a != null) {
            return interfaceC28435a.mo73691c();
        }
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m80325q0(ShortTvViewModel shortTvViewModel, String str, int i11, boolean z11, String str2, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            str2 = null;
        }
        shortTvViewModel.m80389p0(str, i11, z11, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public final void m80327r1(String str, ShortTVFavInfo shortTVFavInfo) {
        if (shortTVFavInfo == null) {
            return;
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ShortTvViewModel$updateFavorite$1(this, shortTVFavInfo, str, null), 3, null);
    }

    /* JADX INFO: renamed from: A0 */
    public final InterfaceC28217h m80336A0() {
        return (InterfaceC28217h) this.f61619V.getValue();
    }

    /* JADX INFO: renamed from: B0 */
    public final InterfaceC28218i m80337B0() {
        return (InterfaceC28218i) this.f61623Z.getValue();
    }

    /* JADX INFO: renamed from: C0 */
    public final InterfaceC28220k m80338C0() {
        return (InterfaceC28220k) this.f61621X.getValue();
    }

    /* JADX INFO: renamed from: D0 */
    public final InterfaceC28210a m80339D0() {
        return (InterfaceC28210a) this.f61618U.getValue();
    }

    /* JADX INFO: renamed from: E0 */
    public final InterfaceC28221l m80340E0() {
        return (InterfaceC28221l) this.f61620W.getValue();
    }

    /* JADX INFO: renamed from: F0 */
    public final LiveData m80341F0() {
        return this.f61644r;
    }

    /* JADX INFO: renamed from: G0 */
    public final LiveData m80342G0() {
        return this.f61606I;
    }

    /* JADX INFO: renamed from: H0 */
    public final LiveData m80343H0() {
        return this.f61634h;
    }

    /* JADX INFO: renamed from: J0 */
    public final LiveData m80344J0() {
        return this.f61610M;
    }

    /* JADX INFO: renamed from: K */
    public final void m80345K(int i11, long j11) {
        if (i11 <= 0 || this.f61599B.contains(Integer.valueOf(i11))) {
            return;
        }
        this.f61598A.put(Integer.valueOf(i11), Long.valueOf(j11));
    }

    /* JADX INFO: renamed from: K0 */
    public final C3187b0 m80346K0() {
        return this.f61631e;
    }

    /* JADX INFO: renamed from: L */
    public final void m80347L(int i11) {
        this.f61599B.remove(Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: M */
    public final void m80348M(String subjectId) {
        Intrinsics.m97802h(subjectId, "subjectId");
        Set setKeySet = this.f61629c0.keySet();
        Intrinsics.m97801g(setKeySet, "<get-keys>(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            String str = (String) obj;
            Intrinsics.m97799e(str);
            if (StringsKt.m98242W(str, subjectId, false, 2, null)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f61629c0.remove((String) it.next());
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m80349N() {
        this.f61603F.mo14858q(null);
    }

    /* JADX INFO: renamed from: N0 */
    public final boolean m80350N0() {
        return this.f61637k;
    }

    /* JADX INFO: renamed from: O */
    public final void m80351O() {
        this.f61607J.mo14858q(null);
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m80352O0() {
        return this.f61636j;
    }

    /* JADX INFO: renamed from: P */
    public final void m80353P(Subject subject) {
        ShortTVFavInfo shortTVFavInfo;
        String subjectId;
        if (subject == null || (shortTVFavInfo = subject.getShortTVFavInfo()) == null || (subjectId = subject.getSubjectId()) == null) {
            return;
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ShortTvViewModel$favorite$1(this, subject, subjectId, shortTVFavInfo.getHasFavorite(), shortTVFavInfo, null), 3, null);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m80354P0(Context context) {
        Intrinsics.m97802h(context, "context");
        C26866a.a.m104905r(C26866a.f81698a, "ShortTvViewModel", new String[]{"Cache---开始处理缓存"}, false, 4, null);
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new ShortTvViewModel$loadCache$1(this, context, null), 2, null);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m80355Q0(Set eps) {
        Subject subject;
        Set<Integer> adUnlockedEps;
        Intrinsics.m97802h(eps, "eps");
        if (eps.isEmpty() || (subject = (Subject) this.f61633g.m14847f()) == null || (adUnlockedEps = subject.getAdUnlockedEps()) == null) {
            return;
        }
        adUnlockedEps.addAll(eps);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m80356R0(int i11) {
        Subject subject = (Subject) this.f61633g.m14847f();
        if (subject != null) {
            subject.setPaid(i11);
        }
    }

    /* JADX INFO: renamed from: S */
    public final int m80357S(int i11, ShortTvInnerPlayBean shortTvInnerPlayBean, Subject subject, int i12, boolean z11) {
        int iIntValue;
        int ep2;
        C27124c c27124c = C27124c.f82233a;
        boolean zM105522b = c27124c.m105540b().m105522b();
        if (i11 >= 0) {
            if (i11 != 0 || zM105522b) {
                return i11;
            }
            return 1;
        }
        Integer numValueOf = (shortTvInnerPlayBean == null || ((ep2 = shortTvInnerPlayBean.getEp()) == 0 && !zM105522b)) ? null : Integer.valueOf(ep2);
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = ((subject != null ? subject.getTrailer() : null) == null || !c27124c.m105540b().m105522b()) ? 1 : 0;
        }
        if (i12 >= 0) {
            return (!z11 || numValueOf == null || numValueOf.intValue() == i12) ? i12 : iIntValue;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m80358S0() {
        this.f61638l.mo14858q(Unit.f75682a);
    }

    /* JADX INFO: renamed from: T */
    public final void m80359T(String subjectId, int i11) {
        Intrinsics.m97802h(subjectId, "subjectId");
        this.f61625a0.remove(subjectId + i11);
        m80348M(subjectId);
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new ShortTvViewModel$forceRefreshSubjectInfo$1(this, subjectId, null), 2, null);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m80360T0() {
        this.f61652z.mo14858q(this.f61649w.m14847f());
    }

    /* JADX INFO: renamed from: U0 */
    public final void m80361U0(String subjectId, int i11, InterfaceC26373f interfaceC26373f) {
        List<ShortTVItem> list;
        List<Video> addressList;
        Object next;
        Map mapMo102959a;
        Intrinsics.m97802h(subjectId, "subjectId");
        C3187b0 c3187b0 = (C3187b0) this.f61648v.get(subjectId);
        if (c3187b0 == null || (list = (List) c3187b0.m14847f()) == null) {
            return;
        }
        for (ShortTVItem shortTVItem : list) {
            boolean zContainsKey = false;
            int i12 = C19165h.f61575a.m80241d().getInt("k_short_tv_resolution", 0);
            Media video = shortTVItem.getVideo();
            if (video != null && (addressList = video.getAddressList()) != null) {
                Iterator<T> it = addressList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.m97797c(((Video) next).getResolution(), String.valueOf(i12)));
                Video video2 = (Video) next;
                if (video2 != null) {
                    if (interfaceC26373f != null && (mapMo102959a = interfaceC26373f.mo102959a()) != null) {
                        zContainsKey = mapMo102959a.containsKey(video2.getUrl());
                    }
                    if (!zContainsKey) {
                        int ep2 = (shortTVItem.getEp() - i11) + 1;
                        int ep3 = shortTVItem.getEp();
                        int i13 = ep2 > 0 ? (ep3 - i11) + 1 : ep3 + i11;
                        if (interfaceC26373f != null) {
                            String url = video2.getUrl();
                            String url2 = video2.getUrl();
                            if (url2 == null) {
                                url2 = "";
                            }
                            interfaceC26373f.addDataSource(new C23403e(url, url2, i13, null, null, 24, null));
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final C3187b0 m80362V() {
        return this.f61651y;
    }

    /* JADX INFO: renamed from: W */
    public final long m80363W(int i11) {
        Long l11 = (Long) this.f61598A.get(Integer.valueOf(i11));
        if (l11 != null) {
            return l11.longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: W0 */
    public final void m80364W0(String resolution, int i11, InterfaceC26373f interfaceC26373f) {
        String subjectId;
        C3187b0 c3187b0;
        List<ShortTVItem> list;
        List<Video> addressList;
        Object next;
        Map mapMo102959a;
        Intrinsics.m97802h(resolution, "resolution");
        Subject subject = (Subject) this.f61634h.m14847f();
        if (subject == null || (subjectId = subject.getSubjectId()) == null || (c3187b0 = (C3187b0) this.f61648v.get(subjectId)) == null || (list = (List) c3187b0.m14847f()) == null) {
            return;
        }
        for (ShortTVItem shortTVItem : list) {
            Media video = shortTVItem.getVideo();
            if (video != null && (addressList = video.getAddressList()) != null) {
                Iterator<T> it = addressList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.m97797c(((Video) next).getResolution(), resolution));
                Video video2 = (Video) next;
                if (video2 != null) {
                    if (!((interfaceC26373f == null || (mapMo102959a = interfaceC26373f.mo102959a()) == null) ? false : mapMo102959a.containsKey(video2.getUrl()))) {
                        int ep2 = (shortTVItem.getEp() - i11) + 1;
                        int ep3 = shortTVItem.getEp();
                        int i12 = ep2 > 0 ? (ep3 - i11) + 1 : ep3 + i11;
                        if (interfaceC26373f != null) {
                            String url = video2.getUrl();
                            String url2 = video2.getUrl();
                            if (url2 == null) {
                                url2 = "";
                            }
                            interfaceC26373f.addDataSource(new C23403e(url, url2, i12, null, null, 24, null));
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final C3187b0 m80365X() {
        return this.f61650x;
    }

    /* JADX INFO: renamed from: Y */
    public final String m80366Y() {
        return this.f61635i;
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m80367Y0() {
        InterfaceC25204t1 interfaceC25204t1 = this.f61627b0;
        if (interfaceC25204t1 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
        }
        this.f61627b0 = null;
        this.f61636j = true;
        this.f61635i = null;
        this.f61637k = false;
        this.f61626b.set(false);
        this.f61628c.set(false);
        this.f61633g.mo14858q(null);
        this.f61641o.mo14858q(null);
        this.f61643q.mo14858q(null);
        this.f61645s.mo14858q(null);
        C3187b0 c3187b0 = this.f61601D;
        Boolean bool = Boolean.FALSE;
        c3187b0.mo14858q(bool);
        this.f61603F.mo14858q(null);
        this.f61605H.mo14858q(bool);
        this.f61607J.mo14858q(null);
        this.f61609L.mo14858q(bool);
        this.f61600C.mo14858q(bool);
        this.f61650x.mo14858q(bool);
        this.f61647u.clear();
        this.f61648v.clear();
        this.f61625a0.clear();
        this.f61629c0.clear();
        this.f61598A.clear();
        this.f61599B.clear();
    }

    /* JADX INFO: renamed from: Z */
    public final LiveData m80368Z() {
        return this.f61642p;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m80369Z0(int i11) {
        this.f61598A.remove(Integer.valueOf(i11));
        this.f61599B.add(Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: a0 */
    public final C3187b0 m80370a0() {
        String subjectId;
        Subject subject = (Subject) this.f61634h.m14847f();
        if (subject == null || (subjectId = subject.getSubjectId()) == null) {
            return null;
        }
        return (C3187b0) this.f61648v.get(subjectId);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m80371a1(String subjectId) {
        Set<Integer> adUnlockedEps;
        Intrinsics.m97802h(subjectId, "subjectId");
        C26866a.a aVar = C26866a.f81698a;
        Subject subject = (Subject) this.f61634h.m14847f();
        C26866a.a.m104905r(aVar, "ShortTvViewModel", new String[]{"will saveAdUnlockedEps, eps: " + (subject != null ? subject.getAdUnlockedEps() : null)}, false, 4, null);
        Subject subject2 = (Subject) this.f61634h.m14847f();
        if (subject2 == null || (adUnlockedEps = subject2.getAdUnlockedEps()) == null || adUnlockedEps.isEmpty()) {
            return;
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ShortTvViewModel$saveAdUnlockedEps$1(subjectId, adUnlockedEps, this, null), 3, null);
    }

    /* JADX INFO: renamed from: b1 */
    public final void m80372b1(Subject subject, ShortTVItem shortTVItem, long j11) {
        if (subject == null || shortTVItem == null || C23219b.f70761a.m92280c(subject, shortTVItem)) {
            return;
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new ShortTvViewModel$saveHistory$1(this, subject, shortTVItem, j11, null), 2, null);
    }

    /* JADX INFO: renamed from: c0 */
    public final C3187b0 m80373c0() {
        return this.f61632f;
    }

    /* JADX INFO: renamed from: d0 */
    public final LiveData m80374d0() {
        return this.f61602E;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m80375d1(int i11) {
        List listL = (List) this.f61644r.m14847f();
        if (listL == null) {
            listL = CollectionsKt.m97506l();
        }
        Iterator it = listL.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            AbstractC26725k abstractC26725k = (AbstractC26725k) it.next();
            if ((abstractC26725k instanceof C26719e) && ((C26719e) abstractC26725k).m104511c() == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            Integer num = (Integer) this.f61649w.m14847f();
            if (num != null && i11 == num.intValue()) {
                return;
            }
            this.f61649w.mo14858q(Integer.valueOf(i11));
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "scrollToEp：" + i11 + " 当前不存在该集", false, 4, null);
    }

    /* JADX INFO: renamed from: e0 */
    public final LiveData m80376e0() {
        return this.f61604G;
    }

    /* JADX INFO: renamed from: e1 */
    public final void m80377e1(boolean z11) {
        this.f61637k = z11;
    }

    /* JADX INFO: renamed from: f0 */
    public final LiveData m80378f0() {
        return this.f61608K;
    }

    /* JADX INFO: renamed from: f1 */
    public final void m80379f1(String str) {
        this.f61635i = str;
    }

    /* JADX INFO: renamed from: g0 */
    public final C3187b0 m80380g0() {
        return this.f61652z;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m80381g1(boolean z11) {
        this.f61636j = z11;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m80382h0(int i11) {
        if (!C27287m.f83003a.m106330e()) {
            this.f61630d.mo14858q(null);
        } else {
            C19165h.f61575a.m80241d().getString("key_short_tv_operation_version", "");
            AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ShortTvViewModel$getOperatingList$1(this, i11, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final C3187b0 m80383i0() {
        return this.f61630d;
    }

    /* JADX INFO: renamed from: j0 */
    public final C3187b0 m80384j0() {
        return this.f61649w;
    }

    /* JADX INFO: renamed from: l0 */
    public final C3187b0 m80385l0() {
        return this.f61640n;
    }

    /* JADX INFO: renamed from: m0 */
    public final LiveData m80386m0() {
        return this.f61639m;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m80387n0(String subjectId) {
        Intrinsics.m97802h(subjectId, "subjectId");
        if (subjectId.length() == 0) {
            return;
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ShortTvViewModel$getShortTVDubInfo$1(this, subjectId, null), 3, null);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m80388o0() {
        m80325q0(this, "1", 8, false, null, 8, null);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m80389p0(String nextPage, int i11, boolean z11, String str) {
        Intrinsics.m97802h(nextPage, "nextPage");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ShortTvViewModel$getShortTVFavoriteList$1(this, nextPage, i11, z11, str, null), 3, null);
    }

    /* JADX INFO: renamed from: q1 */
    public final void m80390q1(boolean z11) {
        this.f61605H.mo14858q(Boolean.valueOf(z11));
    }

    /* JADX INFO: renamed from: r0 */
    public final void m80391r0(String nextPage, int i11, boolean z11) {
        Intrinsics.m97802h(nextPage, "nextPage");
        ImmVideoRequestEntity immVideoRequestEntity = new ImmVideoRequestEntity();
        immVideoRequestEntity.setPage(nextPage);
        immVideoRequestEntity.setPerPage(i11);
        immVideoRequestEntity.setSessionId(C5096b.f17579a.m23868h());
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ShortTvViewModel$getShortTVTrending$1(immVideoRequestEntity, this, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: s0 */
    public final InterfaceC28213d m80392s0() {
        return (InterfaceC28213d) this.f61615R.getValue();
    }

    /* JADX INFO: renamed from: s1 */
    public final void m80393s1(Subject subject, C26719e c26719e, long j11) {
        String id2;
        Media video;
        Video videoAddress;
        if (subject == null || c26719e == null) {
            return;
        }
        String strM104513e = c26719e.m104513e();
        ShortTVItem shortTVItemM104512d = c26719e.m104512d();
        if (shortTVItemM104512d == null || (id2 = shortTVItemM104512d.getId()) == null) {
            id2 = "";
        }
        String str = id2;
        int iM104511c = c26719e.m104511c();
        ShortTVItem shortTVItemM104512d2 = c26719e.m104512d();
        int se2 = shortTVItemM104512d2 != null ? shortTVItemM104512d2.getSe() : 1;
        int totalEpisode = subject.getTotalEpisode();
        String title = subject.getTitle();
        String description = subject.getDescription();
        Cover cover = subject.getCover();
        String url = cover != null ? cover.getUrl() : null;
        Cover cover2 = subject.getCover();
        String thumbnail = cover2 != null ? cover2.getThumbnail() : null;
        ShortTVItem shortTVItemM104512d3 = c26719e.m104512d();
        String videoId = shortTVItemM104512d3 != null ? shortTVItemM104512d3.getVideoId() : null;
        ShortTVItem shortTVItemM104512d4 = c26719e.m104512d();
        ShortTvInnerPlayBean shortTvInnerPlayBean = new ShortTvInnerPlayBean(strM104513e, str, iM104511c, se2, totalEpisode, j11, title, description, url, thumbnail, videoId, (shortTVItemM104512d4 == null || (video = shortTVItemM104512d4.getVideo()) == null || (videoAddress = video.getVideoAddress()) == null) ? null : videoAddress.getUrl(), System.currentTimeMillis(), null, 8192, null);
        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "updateLiveHistory:" + shortTvInnerPlayBean, false, 4, null);
        this.f61607J.mo14858q(shortTvInnerPlayBean);
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new ShortTvViewModel$updateLiveHistory$1(this, subject, c26719e, j11, null), 2, null);
    }

    /* JADX INFO: renamed from: t0 */
    public final LiveData m80394t0() {
        return this.f61646t;
    }

    /* JADX INFO: renamed from: u0 */
    public final ConcurrentHashMap m80395u0() {
        return this.f61648v;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m80396v0(String str, Subject subject, int i11, boolean z11) {
        String subjectId = str;
        Integer num = (Integer) this.f61625a0.get(subjectId + i11);
        if (num != null && num.intValue() == 2) {
            C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvEpisodes 已经显示全部数据", false, 4, null);
            return;
        }
        InterfaceC25204t1 interfaceC25204t1 = this.f61627b0;
        if (interfaceC25204t1 == null || !interfaceC25204t1.isActive()) {
            if (subjectId == null) {
                subjectId = subject != null ? subject.getSubjectId() : null;
                if (subjectId == null) {
                    return;
                }
            }
            String str2 = subjectId;
            Subject subject2 = (Subject) this.f61633g.m14847f();
            this.f61627b0 = AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ShortTvViewModel$getShortTvEpisodes$1(num, this, str2, subject2 != null ? subject2.getSubjectId() : null, subject, i11, z11, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m80397w0(String subjectId, int i11) {
        Intrinsics.m97802h(subjectId, "subjectId");
        int i12 = i11 - 1;
        int i13 = ((i12 / 20) * 20) + 1;
        Integer num = (Integer) this.f61629c0.get(subjectId + i11);
        if (num == null || num.intValue() != 0) {
            if (num != null && num.intValue() == 1) {
                C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvEpisodes start：" + i13 + "  loading", false, 4, null);
                return;
            }
            this.f61629c0.put(subjectId + i11, 1);
            AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ShortTvViewModel$getShortTvEpisodesInfo$2(i13, this, subjectId, i11, null), 3, null);
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvEpisodes start：" + i13 + " data not null", false, 4, null);
        List list = (List) this.f61644r.m14847f();
        AbstractC26725k abstractC26725k = list != null ? (AbstractC26725k) CollectionsKt.m97362l0(list, i12) : null;
        if (abstractC26725k instanceof C26719e) {
            C23219b c23219b = C23219b.f70761a;
            LiveData liveData = this.f61634h;
            C26719e c26719e = (C26719e) abstractC26725k;
            if (c23219b.m92280c(liveData != null ? (Subject) liveData.m14847f() : null, c26719e.m104512d()) || !AbstractC26726l.m104527b(c26719e)) {
                return;
            }
            AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ShortTvViewModel$getShortTvEpisodesInfo$1(i13, i11, this, subjectId, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final InterfaceC28214e m80398x0() {
        AbstractC0190c.m883a(this.f61622Y.getValue());
        return null;
    }

    /* JADX INFO: renamed from: y0 */
    public final InterfaceC28215f m80399y0() {
        return (InterfaceC28215f) this.f61617T.getValue();
    }

    /* JADX INFO: renamed from: z0 */
    public final InterfaceC28216g m80400z0() {
        return (InterfaceC28216g) this.f61616S.getValue();
    }
}
