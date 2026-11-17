package com.transsion.home.viewmodel;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.home.bean.HomePreferencesConfig;
import com.transsion.home.bean.HomePreferencesShowStyle;
import com.transsion.home.bean.HomePreferencesState;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.repository.HomePreferencesRepository;
import com.transsion.moviedetailapi.bean.PostItemType;
import il.C24040a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import pg.C26866a;
import sl.InterfaceC27628b;

/* JADX INFO: loaded from: classes5.dex */
public final class HomePreferencesViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: q */
    public static final C15538a f53629q = new C15538a(null);

    /* JADX INFO: renamed from: r */
    public static final int f53630r = 8;

    /* JADX INFO: renamed from: h */
    private HomePreferencesState f53638h;

    /* JADX INFO: renamed from: p */
    private boolean f53646p;

    /* JADX INFO: renamed from: a */
    private final Lazy f53631a = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomePreferencesViewModel.m68928n();
        }
    });

    /* JADX INFO: renamed from: b */
    private final Lazy f53632b = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomePreferencesViewModel.m68912I(this.f53716a);
        }
    });

    /* JADX INFO: renamed from: c */
    private final Lazy f53633c = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomePreferencesViewModel.m68910G();
        }
    });

    /* JADX INFO: renamed from: d */
    private final Lazy f53634d = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomePreferencesViewModel.m68934z();
        }
    });

    /* JADX INFO: renamed from: e */
    private final Lazy f53635e = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomePreferencesViewModel.m68909F();
        }
    });

    /* JADX INFO: renamed from: f */
    private final Lazy f53636f = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomePreferencesViewModel.m68911H();
        }
    });

    /* JADX INFO: renamed from: g */
    private final Lazy f53637g = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomePreferencesViewModel.m68931q();
        }
    });

    /* JADX INFO: renamed from: i */
    private final Map f53639i = new LinkedHashMap();

    /* JADX INFO: renamed from: j */
    private final Set f53640j = new LinkedHashSet();

    /* JADX INFO: renamed from: k */
    private final Set f53641k = new LinkedHashSet();

    /* JADX INFO: renamed from: l */
    private final Set f53642l = new LinkedHashSet();

    /* JADX INFO: renamed from: m */
    private final Set f53643m = new LinkedHashSet();

    /* JADX INFO: renamed from: n */
    private final Map f53644n = new LinkedHashMap();

    /* JADX INFO: renamed from: o */
    private final Map f53645o = new LinkedHashMap();

    /* JADX INFO: renamed from: com.transsion.home.viewmodel.HomePreferencesViewModel$a */
    public static final class C15538a {
        private C15538a() {
        }

        public /* synthetic */ C15538a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C3187b0 m68909F() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C3187b0 m68910G() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C3187b0 m68911H() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final HomePreferencesRepository m68912I(HomePreferencesViewModel homePreferencesViewModel) {
        Application applicationM27275a = Utils.m27275a();
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Intrinsics.m97799e(applicationM27275a);
        return new HomePreferencesRepository(homePreferencesViewModel.m68932r(), companion.m64881b(applicationM27275a));
    }

    /* JADX INFO: renamed from: K */
    private final void m68913K(HomePreferencesConfig homePreferencesConfig, List list, String str, boolean z11) {
        String labelId = homePreferencesConfig.getLabelId();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!StringsKt.m98160q0((String) obj)) {
                arrayList.add(obj);
            }
        }
        List listH0 = CollectionsKt.m97330H0(CollectionsKt.m97353c0(arrayList));
        if (listH0.isEmpty()) {
            C26866a.a.m104898f(C26866a.f81698a, "HomePreferencesViewModel", "submitPreferences skip: empty selection, labelId=" + labelId + ", scene=" + str, false, 4, null);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        List list2 = (List) this.f53644n.get(labelId);
        Long l11 = (Long) this.f53645o.get(labelId);
        long jLongValue = l11 != null ? l11.longValue() : 0L;
        if (!z11) {
            if (list2 != null && list2.size() == listH0.size() && Intrinsics.m97797c(CollectionsKt.m97345W0(list2), CollectionsKt.m97345W0(listH0))) {
                C26866a.a.m104898f(C26866a.f81698a, "HomePreferencesViewModel", "submitPreferences skip: same as last, labelId=" + labelId + ", scene=" + str, false, 4, null);
                return;
            }
            if (jCurrentTimeMillis - jLongValue < 5000) {
                C26866a.a.m104898f(C26866a.f81698a, "HomePreferencesViewModel", "submitPreferences skip: interval < 5000ms, labelId=" + labelId + ", scene=" + str, false, 4, null);
                return;
            }
        }
        this.f53644n.put(labelId, listH0);
        this.f53645o.put(labelId, Long.valueOf(jCurrentTimeMillis));
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new HomePreferencesViewModel$submitPreferencesInternal$1(this, labelId, listH0, z11, homePreferencesConfig, str, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public final void m68914N(HomePreferencesState homePreferencesState) {
        Object next;
        if (this.f53646p) {
            return;
        }
        Iterator<T> it = homePreferencesState.getEnterPopConfigs().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            HomePreferencesConfig homePreferencesConfig = (HomePreferencesConfig) next;
            if (!this.f53641k.contains(homePreferencesConfig.getLabelId()) && !this.f53642l.contains(homePreferencesConfig.getLabelId()) && !this.f53643m.contains(homePreferencesConfig.getLabelId())) {
                break;
            }
        }
        HomePreferencesConfig homePreferencesConfig2 = (HomePreferencesConfig) next;
        if (homePreferencesConfig2 == null) {
            return;
        }
        this.f53646p = true;
        m68943s().mo14855n(homePreferencesConfig2);
    }

    /* JADX INFO: renamed from: O */
    private final void m68915O(String str) {
        HomePreferencesState homePreferencesState;
        Object next;
        if (this.f53640j.contains(str) || (homePreferencesState = this.f53638h) == null) {
            return;
        }
        List<HomePreferencesConfig> allConfigs = homePreferencesState.getAllConfigs();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allConfigs) {
            if (StringsKt.m98227H(((HomePreferencesConfig) obj).getTabCode(), str, true)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            HomePreferencesConfig homePreferencesConfig = (HomePreferencesConfig) next;
            if (Intrinsics.m97797c(homePreferencesConfig.getShowStyle(), HomePreferencesShowStyle.POPUP.getValue()) && !this.f53641k.contains(homePreferencesConfig.getLabelId()) && !this.f53642l.contains(homePreferencesConfig.getLabelId()) && !this.f53643m.contains(homePreferencesConfig.getLabelId())) {
                break;
            }
        }
        HomePreferencesConfig homePreferencesConfig2 = (HomePreferencesConfig) next;
        if (homePreferencesConfig2 != null && Intrinsics.m97797c(homePreferencesConfig2.getShowStyle(), HomePreferencesShowStyle.POPUP.getValue())) {
            this.f53640j.add(str);
            m68946v().mo14855n(TuplesKt.m97108a(str, homePreferencesConfig2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC27628b m68928n() {
        return (InterfaceC27628b) C22982c.f70163e.m91553a().m91552h(InterfaceC27628b.class);
    }

    /* JADX INFO: renamed from: o */
    private final List m68929o(String str, List list, HomePreferencesState homePreferencesState) {
        List<HomePreferencesConfig> allConfigs = homePreferencesState.getAllConfigs();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allConfigs) {
            if (StringsKt.m98227H(((HomePreferencesConfig) obj).getTabCode(), str, true)) {
                arrayList.add(obj);
            }
        }
        ArrayList<HomePreferencesConfig> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            HomePreferencesConfig homePreferencesConfig = (HomePreferencesConfig) obj2;
            if (Intrinsics.m97797c(homePreferencesConfig.getShowStyle(), HomePreferencesShowStyle.OPT_INSERT.getValue()) && !this.f53641k.contains(homePreferencesConfig.getLabelId()) && !this.f53642l.contains(homePreferencesConfig.getLabelId()) && !this.f53643m.contains(homePreferencesConfig.getLabelId())) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            return CollectionsKt.m97506l();
        }
        ArrayList arrayList3 = new ArrayList();
        for (HomePreferencesConfig homePreferencesConfig2 : arrayList2) {
            Integer pos = homePreferencesConfig2.getPos();
            Integer numValueOf = Integer.valueOf(pos != null ? pos.intValue() : -1);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            boolean z11 = false;
            int iL = RangesKt.m97942l(numValueOf != null ? numValueOf.intValue() : list.size(), 0, list.size());
            List<OperateItem> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (OperateItem operateItem : list2) {
                    if (Intrinsics.m97797c(operateItem.getType(), PostItemType.PREFERENCES.getValue())) {
                        HomePreferencesConfig homePreferencesConfig3 = operateItem.getHomePreferencesConfig();
                        if (Intrinsics.m97797c(homePreferencesConfig3 != null ? homePreferencesConfig3.getLabelId() : null, homePreferencesConfig2.getLabelId())) {
                            z11 = true;
                            break;
                        }
                    }
                }
            }
            C26866a.a.m104898f(C26866a.f81698a, "HomePreferencesViewModel", "运营位插入 有配置, tabCode:" + str + ", pos:" + homePreferencesConfig2.getPos() + "， alreadyExists：" + z11, false, 4, null);
            if (!z11) {
                arrayList3.add(new C24040a(iL, homePreferencesConfig2));
            }
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final void m68930p(String str) {
        List list = (List) this.f53639i.get(str);
        if (list == null) {
            return;
        }
        HomePreferencesState homePreferencesState = this.f53638h;
        if (homePreferencesState == null) {
            m68945u().mo14855n(TuplesKt.m97108a(str, CollectionsKt.m97506l()));
            return;
        }
        List listM68929o = m68929o(str, list, homePreferencesState);
        C26866a.a.m104898f(C26866a.f81698a, "HomePreferencesViewModel", "computeInsertForTab, tabCode:" + str + ", size:" + listM68929o.size(), false, 4, null);
        m68945u().mo14855n(TuplesKt.m97108a(str, listM68929o));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C3187b0 m68931q() {
        return new C3187b0();
    }

    /* JADX INFO: renamed from: r */
    private final InterfaceC27628b m68932r() {
        return (InterfaceC27628b) this.f53631a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final HomePreferencesRepository m68933y() {
        return (HomePreferencesRepository) this.f53632b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C3187b0 m68934z() {
        return new C3187b0();
    }

    /* JADX INFO: renamed from: A */
    public final void m68935A() {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new HomePreferencesViewModel$loadHomePreferencesConfig$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: B */
    public final void m68936B(HomePreferencesConfig config) {
        Intrinsics.m97802h(config, "config");
        this.f53643m.add(config.getLabelId());
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new HomePreferencesViewModel$markChosen$1(this, config, null), 2, null);
    }

    /* JADX INFO: renamed from: C */
    public final void m68937C(HomePreferencesConfig config) {
        Intrinsics.m97802h(config, "config");
        this.f53642l.add(config.getLabelId());
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new HomePreferencesViewModel$markClosed$1(this, config, null), 2, null);
    }

    /* JADX INFO: renamed from: D */
    public final void m68938D(HomePreferencesConfig config) {
        Intrinsics.m97802h(config, "config");
        String labelId = config.getLabelId();
        if (!this.f53641k.contains(labelId)) {
            this.f53641k.add(labelId);
            AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new HomePreferencesViewModel$markShown$1(this, config, null), 2, null);
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "HomePreferencesViewModel", "markShown skip, already marked, labelId=" + labelId, false, 4, null);
    }

    /* JADX INFO: renamed from: E */
    public final void m68939E(String tabCode, List list) {
        Intrinsics.m97802h(tabCode, "tabCode");
        Intrinsics.m97802h(list, "list");
        this.f53639i.put(tabCode, list);
        m68930p(tabCode);
    }

    /* JADX INFO: renamed from: J */
    public final void m68940J(String tabCode) {
        Intrinsics.m97802h(tabCode, "tabCode");
        m68915O(tabCode);
    }

    /* JADX INFO: renamed from: L */
    public final void m68941L(HomePreferencesConfig config, List selectOptions) {
        Intrinsics.m97802h(config, "config");
        Intrinsics.m97802h(selectOptions, "selectOptions");
        m68913K(config, selectOptions, "popup_confirm", true);
    }

    /* JADX INFO: renamed from: M */
    public final void m68942M(HomePreferencesConfig config, List selectOptions, String scene) {
        Intrinsics.m97802h(config, "config");
        Intrinsics.m97802h(selectOptions, "selectOptions");
        Intrinsics.m97802h(scene, "scene");
        m68913K(config, selectOptions, scene, false);
    }

    /* JADX INFO: renamed from: s */
    public final C3187b0 m68943s() {
        return (C3187b0) this.f53637g.getValue();
    }

    /* JADX INFO: renamed from: t */
    public final List m68944t(String tabCode, List list) {
        Intrinsics.m97802h(tabCode, "tabCode");
        Intrinsics.m97802h(list, "list");
        HomePreferencesState homePreferencesState = this.f53638h;
        return homePreferencesState == null ? CollectionsKt.m97506l() : m68929o(tabCode, list, homePreferencesState);
    }

    /* JADX INFO: renamed from: u */
    public final C3187b0 m68945u() {
        return (C3187b0) this.f53634d.getValue();
    }

    /* JADX INFO: renamed from: v */
    public final C3187b0 m68946v() {
        return (C3187b0) this.f53635e.getValue();
    }

    /* JADX INFO: renamed from: w */
    public final C3187b0 m68947w() {
        return (C3187b0) this.f53633c.getValue();
    }

    /* JADX INFO: renamed from: x */
    public final C3187b0 m68948x() {
        return (C3187b0) this.f53636f.getValue();
    }
}
