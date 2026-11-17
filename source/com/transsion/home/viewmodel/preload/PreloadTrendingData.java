package com.transsion.home.viewmodel.preload;

import android.app.Application;
import android.content.Context;
import androidx.p1004lifecycle.C3187b0;
import com.blankj.utilcode.util.AbstractC5796o;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.p282tn.lib.net.bean.BaseDto;
import com.therouter.TheRouter;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.home.bean.AppTab;
import com.transsion.home.bean.BottomTabItem;
import com.transsion.home.bean.HomeTabItem;
import com.transsion.home.bean.HotSubjectEntity;
import com.transsion.home.bean.MainOperateData;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.p1000enum.BottomTabType;
import com.transsion.home.p1000enum.HomeTabType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25133j0;
import p349dh.C22982c;
import p352dn.InterfaceC22998b;
import p415fq.C23420k;
import pg.C26866a;
import sl.InterfaceC27631e;

/* JADX INFO: loaded from: classes.dex */
public final class PreloadTrendingData {

    /* JADX INFO: renamed from: n */
    public static final C15566a f53717n = new C15566a(null);

    /* JADX INFO: renamed from: o */
    public static final int f53718o = 8;

    /* JADX INFO: renamed from: p */
    private static final Lazy f53719p = LazyKt.m97096a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: com.transsion.home.viewmodel.preload.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PreloadTrendingData.m69115P();
        }
    });

    /* JADX INFO: renamed from: b */
    private volatile boolean f53721b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f53722c;

    /* JADX INFO: renamed from: k */
    private AppTab f53730k;

    /* JADX INFO: renamed from: l */
    private List f53731l;

    /* JADX INFO: renamed from: a */
    private int f53720a = 1;

    /* JADX INFO: renamed from: d */
    private final InterfaceC27631e f53723d = (InterfaceC27631e) C22982c.f70163e.m91553a().m91552h(InterfaceC27631e.class);

    /* JADX INFO: renamed from: e */
    private final Lazy f53724e = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.preload.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PreloadTrendingData.m69146w();
        }
    });

    /* JADX INFO: renamed from: f */
    private final Lazy f53725f = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.preload.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PreloadTrendingData.m69117S();
        }
    });

    /* JADX INFO: renamed from: g */
    private final Lazy f53726g = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.preload.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PreloadTrendingData.m69116R();
        }
    });

    /* JADX INFO: renamed from: h */
    private final Lazy f53727h = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.preload.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PreloadTrendingData.m69145v();
        }
    });

    /* JADX INFO: renamed from: i */
    private final Lazy f53728i = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.preload.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PreloadTrendingData.m69144u();
        }
    });

    /* JADX INFO: renamed from: j */
    private final Lazy f53729j = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.preload.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PreloadTrendingData.m69113N();
        }
    });

    /* JADX INFO: renamed from: m */
    private final InterfaceC25133j0 f53732m = new C15567b(InterfaceC25133j0.f76511k1);

    /* JADX INFO: renamed from: com.transsion.home.viewmodel.preload.PreloadTrendingData$a */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class C15566a {
        private C15566a() {
        }

        public /* synthetic */ C15566a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final PreloadTrendingData m69164a() {
            return (PreloadTrendingData) PreloadTrendingData.f53719p.getValue();
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.viewmodel.preload.PreloadTrendingData$b */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class C15567b extends AbstractCoroutineContextElement implements InterfaceC25133j0 {
        public C15567b(InterfaceC25133j0.a aVar) {
            super(aVar);
        }

        @Override // kotlinx.coroutines.InterfaceC25133j0
        /* JADX INFO: renamed from: m */
        public void mo9519m(CoroutineContext coroutineContext, Throwable th2) {
            C26866a.f81698a.m104915i("PreloadTrending", "coroutineExceptionHandler " + th2.getMessage(), true);
            th2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final AppTab m69110B() {
        try {
            String strM69121Y = m69121Y("app_tab");
            if (strM69121Y == null || strM69121Y.length() == 0) {
                C15568a c15568aM69111E = m69111E();
                Application applicationM27275a = Utils.m27275a();
                Intrinsics.m97801g(applicationM27275a, "getApp(...)");
                strM69121Y = c15568aM69111E.m69166b(applicationM27275a);
                if (strM69121Y == null) {
                    strM69121Y = "";
                }
            }
            if (strM69121Y.length() > 0) {
                return (AppTab) AbstractC5796o.m27441d(strM69121Y, AppTab.class);
            }
            return null;
        } catch (Throwable th2) {
            C26866a.f81698a.m104915i("PreloadTrending", "getAppTabCache error: " + th2.getMessage(), true);
            C14496b.f50966a.m65344b().m61563M("app_tab");
            th2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final C15568a m69111E() {
        return (C15568a) this.f53724e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final HotSubjectEntity m69112I() {
        String string = C14496b.f50966a.m65344b().getString("hot_search_words", null);
        if (string != null) {
            return (HotSubjectEntity) AbstractC5796o.m27441d(string, HotSubjectEntity.class);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C3187b0 m69113N() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public final void m69114O(AppTab appTab) {
        BottomTabItem bottomTabItem;
        BottomTabItem bottomTabItem2;
        List<BottomTabItem> bottomTabs;
        Object next;
        List<BottomTabItem> bottomTabs2;
        Object next2;
        Object obj = null;
        if (appTab == null || (bottomTabs2 = appTab.getBottomTabs()) == null) {
            bottomTabItem = null;
        } else {
            Iterator<T> it = bottomTabs2.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!Intrinsics.m97797c(((BottomTabItem) next2).getBtTabCode(), BottomTabType.TAB_CODE_COMMUNITY));
            bottomTabItem = (BottomTabItem) next2;
        }
        if (bottomTabItem != null) {
            C26866a.a.m104898f(C26866a.f81698a, "PreloadTrending", "has bottom room tab", false, 4, null);
            C23420k.f71413a.m92982l(true);
            return;
        }
        if (appTab == null || (bottomTabs = appTab.getBottomTabs()) == null) {
            bottomTabItem2 = null;
        } else {
            Iterator<T> it2 = bottomTabs.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.m97797c(((BottomTabItem) next).getBtTabCode(), BottomTabType.TAB_CODE_HOME));
            bottomTabItem2 = (BottomTabItem) next;
        }
        if (bottomTabItem2 == null) {
            C26866a.a.m104898f(C26866a.f81698a, "PreloadTrending", "has no room tab", false, 4, null);
            C23420k.f71413a.m92982l(false);
            return;
        }
        List<HomeTabItem> subTabs = bottomTabItem2.getSubTabs();
        if (subTabs != null) {
            for (Object obj2 : subTabs) {
                HomeTabItem homeTabItem = (HomeTabItem) obj2;
                if (Intrinsics.m97797c(homeTabItem != null ? homeTabItem.getTabCode() : null, "Community")) {
                    obj = obj2;
                    break;
                }
            }
            obj = (HomeTabItem) obj;
        }
        C26866a.a.m104898f(C26866a.f81698a, "PreloadTrending", "has top room tab:" + (obj != null), false, 4, null);
        C23420k.f71413a.m92982l(obj != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final PreloadTrendingData m69115P() {
        return new PreloadTrendingData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C3187b0 m69116R() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C3187b0 m69117S() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: T */
    public final Object m69118T(String str, Continuation continuation) throws Throwable {
        PreloadTrendingData$preloadMainOperation$1 preloadTrendingData$preloadMainOperation$1;
        List<OperateItem> items;
        List<OperateItem> items2;
        if (continuation instanceof PreloadTrendingData$preloadMainOperation$1) {
            preloadTrendingData$preloadMainOperation$1 = (PreloadTrendingData$preloadMainOperation$1) continuation;
            int i11 = preloadTrendingData$preloadMainOperation$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                preloadTrendingData$preloadMainOperation$1.label = i11 - Integer.MIN_VALUE;
            } else {
                preloadTrendingData$preloadMainOperation$1 = new PreloadTrendingData$preloadMainOperation$1(this, continuation);
            }
        } else {
            preloadTrendingData$preloadMainOperation$1 = new PreloadTrendingData$preloadMainOperation$1(this, continuation);
        }
        PreloadTrendingData$preloadMainOperation$1 preloadTrendingData$preloadMainOperation$2 = preloadTrendingData$preloadMainOperation$1;
        Object objM107495b = preloadTrendingData$preloadMainOperation$2.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = preloadTrendingData$preloadMainOperation$2.label;
        try {
            if (i12 == 0) {
                ResultKt.m97107b(objM107495b);
                InterfaceC27631e interfaceC27631e = this.f53723d;
                int i13 = this.f53720a;
                preloadTrendingData$preloadMainOperation$2.L$0 = str;
                preloadTrendingData$preloadMainOperation$2.label = 1;
                objM107495b = InterfaceC27631e.a.m107495b(interfaceC27631e, null, i13, 0, str, preloadTrendingData$preloadMainOperation$2, 5, null);
                if (objM107495b == objF) {
                    return objF;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) preloadTrendingData$preloadMainOperation$2.L$0;
                ResultKt.m97107b(objM107495b);
            }
            BaseDto baseDto = (BaseDto) objM107495b;
            C26866a.a aVar = C26866a.f81698a;
            MainOperateData mainOperateData = (MainOperateData) baseDto.getData();
            aVar.m104912c("PreloadTrending", "get operating data from net size = " + ((mainOperateData == null || (items2 = mainOperateData.getItems()) == null) ? null : Boxing.m97634d(items2.size())), true);
            if (!Intrinsics.m97797c(baseDto.getCode(), "0") || baseDto.getData() == null) {
                m69156K().mo14855n(null);
            } else {
                MainOperateData mainOperateData2 = (MainOperateData) baseDto.getData();
                if (mainOperateData2 != null) {
                    mainOperateData2.setSourceFrom("from_net");
                    m69156K().mo14855n(mainOperateData2);
                    if (mainOperateData2.getVersion() != null && !Intrinsics.m97797c(mainOperateData2.getVersion(), str) && (items = mainOperateData2.getItems()) != null && !items.isEmpty()) {
                        m69122Z(mainOperateData2);
                    }
                }
                int i14 = this.f53720a;
                this.f53720a = i14 + 1;
                Boxing.m97634d(i14);
            }
        } catch (Exception e11) {
            C26866a.f81698a.m104915i("PreloadTrending", "get Operating List msg=" + e11.getMessage() + " cause=" + e11.getCause(), true);
            m69156K().mo14855n(null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: V */
    private final void m69119V(Context context) {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new PreloadTrendingData$preloadSkuDataCache$1(context, null), 3, null);
    }

    /* JADX INFO: renamed from: W */
    private final void m69120W(Context context) {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new PreloadTrendingData$preloadVideoCache$1(this, context, null), 3, null);
    }

    /* JADX INFO: renamed from: Y */
    private final String m69121Y(String str) {
        try {
            byte[] bArrM61567e = C14496b.f50966a.m65344b().m61567e(str);
            if (bArrM61567e == null) {
                return null;
            }
            if (bArrM61567e.length == 0) {
                return null;
            }
            return new String(bArrM61567e, Charsets.UTF_8);
        } catch (Throwable th2) {
            C26866a.f81698a.m104915i("PreloadTrending", "safeGetMmkvString failed for key: " + str + ", " + th2.getMessage(), true);
            return null;
        }
    }

    /* JADX INFO: renamed from: Z */
    private final void m69122Z(MainOperateData mainOperateData) {
        List<OperateItem> items = mainOperateData.getItems();
        if (items == null || !(!items.isEmpty())) {
            return;
        }
        C14496b.f50966a.m65344b().putString("main_operating_data", new Gson().toJson(mainOperateData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public final void m69124a0(AppTab appTab) {
        List<BottomTabItem> bottomTabs = appTab != null ? appTab.getBottomTabs() : null;
        if (bottomTabs == null || bottomTabs.isEmpty()) {
            return;
        }
        C14496b.f50966a.m65344b().putString("app_tab", AbstractC5796o.m27447j(appTab));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C3187b0 m69144u() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C3187b0 m69145v() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C15568a m69146w() {
        return new C15568a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final List m69147x(AppTab appTab) {
        List<BottomTabItem> bottomTabs;
        ArrayList arrayList = new ArrayList();
        for (BottomTabType bottomTabType : BottomTabType.values()) {
            CollectionsKt.m97521B(arrayList, CollectionsKt.m97499e(bottomTabType.getValue()));
        }
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        boolean zMo69843B = interfaceC22998b != null ? interfaceC22998b.mo69843B() : false;
        if (!zMo69843B) {
            C26866a.a.m104898f(C26866a.f81698a, "co_mem", "MainActivity --> getTabEntities() --> 当前没有开启会员功能 --> 不展示会员Tab", false, 4, null);
        }
        if (appTab == null || (bottomTabs = appTab.getBottomTabs()) == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : bottomTabs) {
            BottomTabItem bottomTabItem = (BottomTabItem) obj;
            if (Intrinsics.m97797c(bottomTabItem.getBtTabType(), BottomTabType.PREMIUM.getValue()) ? CollectionsKt.m97352b0(arrayList, bottomTabItem.getBtTabType()) && zMo69843B : CollectionsKt.m97352b0(arrayList, bottomTabItem.getBtTabType())) {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt.m97343U0(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final List m69148y(List list) {
        ArrayList arrayList = new ArrayList();
        for (HomeTabType homeTabType : HomeTabType.values()) {
            CollectionsKt.m97521B(arrayList, CollectionsKt.m97499e(homeTabType.getValue()));
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            HomeTabItem homeTabItem = (HomeTabItem) obj;
            if (homeTabItem != null && CollectionsKt.m97352b0(arrayList, homeTabItem.getType())) {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt.m97343U0(arrayList2);
    }

    /* JADX INFO: renamed from: A */
    public final AppTab m69149A(Context context) {
        Intrinsics.m97802h(context, "context");
        try {
            String strM69166b = m69111E().m69166b(context);
            if (strM69166b != null && strM69166b.length() != 0) {
                return (AppTab) AbstractC5796o.m27441d(strM69166b, AppTab.class);
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: C */
    public final C3187b0 m69150C() {
        return (C3187b0) this.f53728i.getValue();
    }

    /* JADX INFO: renamed from: D */
    public final C3187b0 m69151D() {
        return (C3187b0) this.f53727h.getValue();
    }

    /* JADX INFO: renamed from: F */
    public final AppTab m69152F() {
        return this.f53730k;
    }

    /* JADX INFO: renamed from: G */
    public final void m69153G() {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new PreloadTrendingData$getHotSearch$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: H */
    public final C3187b0 m69154H() {
        return (C3187b0) this.f53729j.getValue();
    }

    /* JADX INFO: renamed from: J */
    public final C3187b0 m69155J() {
        return (C3187b0) this.f53726g.getValue();
    }

    /* JADX INFO: renamed from: K */
    public final C3187b0 m69156K() {
        return (C3187b0) this.f53725f.getValue();
    }

    /* JADX INFO: renamed from: L */
    public final List m69157L() {
        List list = this.f53731l;
        this.f53731l = null;
        return list;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m69158M() {
        return this.f53722c;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m69159Q(String version) {
        Intrinsics.m97802h(version, "version");
        if (this.f53721b) {
            return false;
        }
        this.f53721b = true;
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), this.f53732m, null, new PreloadTrendingData$loadOperatingDataFromNet$1(this, version, null), 2, null);
        return true;
    }

    /* JADX INFO: renamed from: U */
    public final void m69160U(Context context) {
        Intrinsics.m97802h(context, "context");
        C26866a.f81698a.m104912c("PreloadTrending", "preloadOperatingCache() called", true);
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new PreloadTrendingData$preloadOperating$1(this, context, null), 3, null);
        m69120W(context);
        m69119V(context);
    }

    /* JADX INFO: renamed from: X */
    public final boolean m69161X(Context context, String operationVersion) {
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(operationVersion, "operationVersion");
        if (m69155J().m14847f() != null) {
            return m69159Q(operationVersion);
        }
        m69160U(context);
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m69162b0(List list) {
        Intrinsics.m97802h(list, "list");
        this.f53731l = list;
    }

    /* JADX INFO: renamed from: z */
    public final void m69163z() {
        this.f53722c = true;
        C26866a.f81698a.m104912c("PreloadTrending", "getAppTab() called", true);
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new PreloadTrendingData$getAppTab$1(this, null), 3, null);
    }
}
