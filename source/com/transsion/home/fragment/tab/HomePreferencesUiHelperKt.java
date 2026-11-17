package com.transsion.home.fragment.tab;

import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.transsion.home.adapter.trending.provider.C15034e;
import com.transsion.home.bean.HomePreferencesConfig;
import com.transsion.home.bean.HomePreferencesRefreshType;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.dialog.HomePreferencesDialog;
import com.transsion.home.viewmodel.HomePreferencesViewModel;
import com.transsion.moviedetailapi.bean.PostItemType;
import il.C24040a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Function;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import p842vl.C28121c;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class HomePreferencesUiHelperKt {

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.HomePreferencesUiHelperKt$a */
    public static final class C15295a extends RecyclerView.AbstractC4219r {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Ref.BooleanRef f53088a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ RecyclerView.AbstractC4214m f53089b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Ref.ObjectRef f53090c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ BaseHomeSubFragment f53091d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ HomePreferencesViewModel f53092e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Ref.IntRef f53093f;

        C15295a(Ref.BooleanRef booleanRef, RecyclerView.AbstractC4214m abstractC4214m, Ref.ObjectRef objectRef, BaseHomeSubFragment baseHomeSubFragment, HomePreferencesViewModel homePreferencesViewModel, Ref.IntRef intRef) {
            this.f53088a = booleanRef;
            this.f53089b = abstractC4214m;
            this.f53090c = objectRef;
            this.f53091d = baseHomeSubFragment;
            this.f53092e = homePreferencesViewModel;
            this.f53093f = intRef;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final Unit m68129f(HomePreferencesViewModel homePreferencesViewModel, HomePreferencesConfig homePreferencesConfig, BaseHomeSubFragment baseHomeSubFragment, List selected) {
            Intrinsics.m97802h(selected, "selected");
            homePreferencesViewModel.m68936B(homePreferencesConfig);
            homePreferencesViewModel.m68941L(homePreferencesConfig, selected);
            C28121c c28121c = C28121c.f86299a;
            int mTabId = baseHomeSubFragment.getMTabId();
            String mTabCode = baseHomeSubFragment.getMTabCode();
            if (mTabCode == null) {
                mTabCode = "";
            }
            c28121c.m109221k(mTabId, mTabCode, homePreferencesConfig, selected);
            return Unit.f75682a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static final Unit m68130g(HomePreferencesViewModel homePreferencesViewModel, HomePreferencesConfig homePreferencesConfig, BaseHomeSubFragment baseHomeSubFragment) {
            homePreferencesViewModel.m68937C(homePreferencesConfig);
            C28121c c28121c = C28121c.f86299a;
            int mTabId = baseHomeSubFragment.getMTabId();
            String mTabCode = baseHomeSubFragment.getMTabCode();
            if (mTabCode == null) {
                mTabCode = "";
            }
            c28121c.m109220j(mTabId, mTabCode, homePreferencesConfig);
            return Unit.f75682a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView rv2, int i11, int i12) {
            int iR;
            Intrinsics.m97802h(rv2, "rv");
            super.onScrolled(rv2, i11, i12);
            if (this.f53088a.element || i12 <= 0) {
                return;
            }
            RecyclerView.AbstractC4214m abstractC4214m = this.f53089b;
            if (abstractC4214m instanceof LinearLayoutManager) {
                iR = ((LinearLayoutManager) abstractC4214m).findFirstVisibleItemPosition();
            } else if (abstractC4214m instanceof StaggeredGridLayoutManager) {
                int[] iArrM20973D = ((StaggeredGridLayoutManager) abstractC4214m).m20973D(null);
                Intrinsics.m97801g(iArrM20973D, "findFirstVisibleItemPositions(...)");
                iR = ArraysKt.m97459R(iArrM20973D);
            } else {
                iR = 0;
            }
            if (this.f53090c.element == 0) {
                String mTabCode = this.f53091d.getMTabCode();
                if (mTabCode == null) {
                    return;
                } else {
                    this.f53092e.m68940J(mTabCode);
                }
            }
            final HomePreferencesConfig homePreferencesConfig = (HomePreferencesConfig) this.f53090c.element;
            if (homePreferencesConfig != null && iR > this.f53093f.element) {
                this.f53088a.element = true;
                HomePreferencesDialog homePreferencesDialogM67609a = HomePreferencesDialog.INSTANCE.m67609a();
                homePreferencesDialogM67609a.m67608z0(homePreferencesConfig);
                C28121c c28121c = C28121c.f86299a;
                int mTabId = this.f53091d.getMTabId();
                String mTabCode2 = this.f53091d.getMTabCode();
                if (mTabCode2 == null) {
                    mTabCode2 = "";
                }
                c28121c.m109222l(mTabId, mTabCode2, homePreferencesConfig);
                final HomePreferencesViewModel homePreferencesViewModel = this.f53092e;
                final BaseHomeSubFragment baseHomeSubFragment = this.f53091d;
                homePreferencesDialogM67609a.m67607B0(new Function1() { // from class: com.transsion.home.fragment.tab.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomePreferencesUiHelperKt.C15295a.m68129f(homePreferencesViewModel, homePreferencesConfig, baseHomeSubFragment, (List) obj);
                    }
                });
                final HomePreferencesViewModel homePreferencesViewModel2 = this.f53092e;
                final BaseHomeSubFragment baseHomeSubFragment2 = this.f53091d;
                homePreferencesDialogM67609a.m67606A0(new Function0() { // from class: com.transsion.home.fragment.tab.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomePreferencesUiHelperKt.C15295a.m68130g(homePreferencesViewModel2, homePreferencesConfig, baseHomeSubFragment2);
                    }
                });
                this.f53092e.m68938D(homePreferencesConfig);
                homePreferencesDialogM67609a.m65437l0(this.f53091d, "HomePreferencesDialog");
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.HomePreferencesUiHelperKt$b */
    static final class C15298b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f53094a;

        C15298b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f53094a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f53094a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3189c0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.m97797c(mo6065a(), ((FunctionAdapter) obj).mo6065a());
            }
            return false;
        }

        public final int hashCode() {
            return mo6065a().hashCode();
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53094a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m68116f(String str, HomePreferencesViewModel viewModel, List baseList) {
        Intrinsics.m97802h(viewModel, "viewModel");
        Intrinsics.m97802h(baseList, "baseList");
        if (str == null || baseList.isEmpty()) {
            return;
        }
        viewModel.m68939E(str, baseList);
        List listM68944t = viewModel.m68944t(str, baseList);
        if (listM68944t.isEmpty()) {
            return;
        }
        for (C24040a c24040a : CollectionsKt.m97331I0(listM68944t, new Comparator() { // from class: com.transsion.home.fragment.tab.HomePreferencesUiHelperKt$applyHomePreferencesInsertToList$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return ComparisonsKt.m97603d(Integer.valueOf(((C24040a) t11).m94942b()), Integer.valueOf(((C24040a) t12).m94942b()));
            }
        })) {
            int iL = RangesKt.m97942l(c24040a.m94942b(), 0, baseList.size());
            OperateItem operateItem = new OperateItem(null, PostItemType.PREFERENCES.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741821, null);
            operateItem.setHomePreferencesConfig(c24040a.m94941a());
            Unit unit = Unit.f75682a;
            baseList.add(iL, operateItem);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m68117g(List data, List blockList, List instructions) {
        int iIndexOf;
        HomePreferencesConfig homePreferencesConfig;
        String labelId;
        Intrinsics.m97802h(data, "data");
        Intrinsics.m97802h(blockList, "blockList");
        Intrinsics.m97802h(instructions, "instructions");
        if (data.isEmpty() || blockList.isEmpty() || instructions.isEmpty()) {
            return;
        }
        List listU0 = CollectionsKt.m97343U0(data);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = data.iterator();
        while (it.hasNext()) {
            OperateItem operateItem = (OperateItem) it.next();
            if (Intrinsics.m97797c(operateItem.getType(), PostItemType.PREFERENCES.getValue()) && (homePreferencesConfig = operateItem.getHomePreferencesConfig()) != null && (labelId = homePreferencesConfig.getLabelId()) != null) {
                linkedHashSet.add(labelId);
            }
        }
        for (C24040a c24040a : CollectionsKt.m97331I0(instructions, new Comparator() { // from class: com.transsion.home.fragment.tab.HomePreferencesUiHelperKt$applyPreferencesInsertWithBlocksForUgc$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return ComparisonsKt.m97603d(Integer.valueOf(((C24040a) t11).m94942b()), Integer.valueOf(((C24040a) t12).m94942b()));
            }
        })) {
            int iL = RangesKt.m97942l(c24040a.m94942b(), 2, blockList.size());
            HomePreferencesConfig homePreferencesConfigM94941a = c24040a.m94941a();
            if (!linkedHashSet.contains(homePreferencesConfigM94941a.getLabelId())) {
                if (iL >= blockList.size()) {
                    iIndexOf = listU0.size();
                } else {
                    OperateItem operateItem2 = (OperateItem) blockList.get(iL);
                    if (Intrinsics.m97797c(operateItem2.getType(), PostItemType.UGC_PORTRAIT_GRID.getValue())) {
                        Iterator it2 = listU0.iterator();
                        int i11 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                iIndexOf = -1;
                                break;
                            } else {
                                if (((OperateItem) it2.next()) == operateItem2) {
                                    iIndexOf = i11;
                                    break;
                                }
                                i11++;
                            }
                        }
                        if (iIndexOf < 0) {
                            iIndexOf = listU0.size();
                        }
                    } else {
                        OperateItem originalOperateItem = operateItem2.getOriginalOperateItem();
                        if (Intrinsics.m97797c(operateItem2.getType(), PostItemType.FEEDS_TITLE.getValue()) || originalOperateItem == null) {
                            iIndexOf = listU0.indexOf(operateItem2);
                        } else {
                            Iterator it3 = listU0.iterator();
                            int i12 = 0;
                            while (true) {
                                if (!it3.hasNext()) {
                                    iIndexOf = -1;
                                    break;
                                } else {
                                    if (((OperateItem) it3.next()).getOriginalOperateItem() == originalOperateItem) {
                                        iIndexOf = i12;
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        }
                        if (iIndexOf < 0) {
                            iIndexOf = listU0.size();
                        }
                    }
                }
                int i13 = iIndexOf - 1;
                int i14 = i13 >= 0 ? i13 : 0;
                C26866a.a.m104898f(C26866a.f81698a, "HomePreferences", "applyPreferencesInsertWithBlocksForUgc, 插入运营位 targetPos:" + i14, false, 4, null);
                OperateItem operateItem3 = new OperateItem(null, PostItemType.PREFERENCES.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741821, null);
                operateItem3.setHomePreferencesConfig(c24040a.m94941a());
                Unit unit = Unit.f75682a;
                listU0.add(i14, operateItem3);
                linkedHashSet.add(homePreferencesConfigM94941a.getLabelId());
            }
        }
        data.clear();
        data.addAll(listU0);
    }

    /* JADX INFO: renamed from: h */
    public static final void m68118h(final BaseHomeSubFragment baseHomeSubFragment, RecyclerView recyclerView, RecyclerView.AbstractC4214m layoutManager, HomePreferencesViewModel viewModel, final Function0 currentListSize) {
        Intrinsics.m97802h(baseHomeSubFragment, "<this>");
        Intrinsics.m97802h(recyclerView, "recyclerView");
        Intrinsics.m97802h(layoutManager, "layoutManager");
        Intrinsics.m97802h(viewModel, "viewModel");
        Intrinsics.m97802h(currentListSize, "currentListSize");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = Integer.MAX_VALUE;
        viewModel.m68946v().m14851j(baseHomeSubFragment.getViewLifecycleOwner(), new C15298b(new Function1() { // from class: com.transsion.home.fragment.tab.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomePreferencesUiHelperKt.m68119i(baseHomeSubFragment, booleanRef, objectRef, intRef, currentListSize, (Pair) obj);
            }
        }));
        recyclerView.addOnScrollListener(new C15295a(booleanRef, layoutManager, objectRef, baseHomeSubFragment, viewModel, intRef));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, com.transsion.home.bean.HomePreferencesConfig] */
    /* JADX INFO: renamed from: i */
    public static final Unit m68119i(BaseHomeSubFragment baseHomeSubFragment, Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, Ref.IntRef intRef, Function0 function0, Pair pair) {
        String str = (String) pair.component1();
        ?? r11 = (HomePreferencesConfig) pair.component2();
        if (!Intrinsics.m97797c(str, baseHomeSubFragment.getMTabCode())) {
            return Unit.f75682a;
        }
        if (booleanRef.element || objectRef.element != 0) {
            return Unit.f75682a;
        }
        if (Intrinsics.m97797c(r11.getRefreshType(), HomePreferencesRefreshType.NO_REFRESH.getValue())) {
            objectRef.element = r11;
            Integer pos = r11.getPos();
            intRef.element = RangesKt.m97942l(pos != null ? pos.intValue() : ((Number) function0.invoke()).intValue(), 0, ((Number) function0.invoke()).intValue());
            return Unit.f75682a;
        }
        objectRef.element = r11;
        Integer pos2 = r11.getPos();
        intRef.element = RangesKt.m97942l(pos2 != null ? pos2.intValue() : ((Number) function0.invoke()).intValue(), 0, ((Number) function0.invoke()).intValue());
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: j */
    public static final void m68120j(C15034e provider, final HomePreferencesViewModel viewModel, final BaseProviderMultiAdapter adapter, final int i11, final String tabCode) {
        Intrinsics.m97802h(provider, "provider");
        Intrinsics.m97802h(viewModel, "viewModel");
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(tabCode, "tabCode");
        provider.m67288L(new Function3() { // from class: com.transsion.home.fragment.tab.b
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HomePreferencesUiHelperKt.m68121k(viewModel, i11, tabCode, (HomePreferencesConfig) obj, (List) obj2, (String) obj3);
            }
        });
        provider.m67286J(new Function1() { // from class: com.transsion.home.fragment.tab.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomePreferencesUiHelperKt.m68122l(viewModel, i11, tabCode, adapter, (HomePreferencesConfig) obj);
            }
        });
        provider.m67287K(new Function1() { // from class: com.transsion.home.fragment.tab.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomePreferencesUiHelperKt.m68123m(viewModel, i11, tabCode, (HomePreferencesConfig) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final Unit m68121k(HomePreferencesViewModel homePreferencesViewModel, int i11, String str, HomePreferencesConfig config, List selectOptions, String scene) {
        Intrinsics.m97802h(config, "config");
        Intrinsics.m97802h(selectOptions, "selectOptions");
        Intrinsics.m97802h(scene, "scene");
        homePreferencesViewModel.m68942M(config, selectOptions, scene);
        C28121c.f86299a.m109228r(i11, str, config, selectOptions);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Unit m68122l(HomePreferencesViewModel homePreferencesViewModel, int i11, String str, BaseProviderMultiAdapter baseProviderMultiAdapter, HomePreferencesConfig config) {
        Intrinsics.m97802h(config, "config");
        homePreferencesViewModel.m68937C(config);
        C28121c.f86299a.m109226p(i11, str, config);
        Iterator<Object> it = baseProviderMultiAdapter.getData().iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            OperateItem operateItem = (OperateItem) it.next();
            if (Intrinsics.m97797c(operateItem.getType(), PostItemType.PREFERENCES.getValue())) {
                HomePreferencesConfig homePreferencesConfig = operateItem.getHomePreferencesConfig();
                if (Intrinsics.m97797c(homePreferencesConfig != null ? homePreferencesConfig.getLabelId() : null, config.getLabelId())) {
                    break;
                }
            }
            i12++;
        }
        if (i12 >= 0) {
            baseProviderMultiAdapter.m36133C0(i12);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final Unit m68123m(HomePreferencesViewModel homePreferencesViewModel, int i11, String str, HomePreferencesConfig config) {
        Intrinsics.m97802h(config, "config");
        homePreferencesViewModel.m68938D(config);
        C28121c.f86299a.m109227q(i11, str, config);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: n */
    public static final List m68124n(List flatList) {
        Object next;
        Intrinsics.m97802h(flatList, "flatList");
        if (flatList.isEmpty()) {
            return CollectionsKt.m97506l();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < flatList.size()) {
            OperateItem operateItem = (OperateItem) flatList.get(i11);
            if (!Intrinsics.m97797c(operateItem.getType(), PostItemType.TRENDING_MARGIN.getValue())) {
                if (Intrinsics.m97797c(operateItem.getType(), PostItemType.FEEDS_TITLE.getValue())) {
                    int i12 = i11 + 1;
                    Iterator it = flatList.subList(i12, flatList.size()).iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((OperateItem) next).getOriginalOperateItem() == null);
                    OperateItem operateItem2 = (OperateItem) next;
                    OperateItem originalOperateItem = operateItem2 != null ? operateItem2.getOriginalOperateItem() : null;
                    if (originalOperateItem != null) {
                        if (linkedHashSet.add(originalOperateItem)) {
                            arrayList.add(operateItem);
                        }
                        i11 = i12;
                    }
                }
                OperateItem originalOperateItem2 = operateItem.getOriginalOperateItem();
                if (originalOperateItem2 == null) {
                    originalOperateItem2 = operateItem;
                }
                if (linkedHashSet.add(originalOperateItem2)) {
                    arrayList.add(operateItem);
                }
            }
            i11++;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static final void m68125o(final BaseHomeSubFragment fragment, HomePreferencesViewModel viewModel, final BaseProviderMultiAdapter adapter) {
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(viewModel, "viewModel");
        Intrinsics.m97802h(adapter, "adapter");
        viewModel.m68945u().m14851j(fragment.getViewLifecycleOwner(), new C15298b(new Function1() { // from class: com.transsion.home.fragment.tab.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomePreferencesUiHelperKt.m68126p(fragment, adapter, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final Unit m68126p(BaseHomeSubFragment baseHomeSubFragment, BaseProviderMultiAdapter baseProviderMultiAdapter, Pair pair) {
        List list;
        String str = (String) pair.component1();
        List list2 = (List) pair.component2();
        if (!Intrinsics.m97797c(str, baseHomeSubFragment.getMTabCode()) || (list = list2) == null || list.isEmpty()) {
            return Unit.f75682a;
        }
        List<Object> data = baseProviderMultiAdapter.getData();
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (Intrinsics.m97797c(((OperateItem) obj).getType(), PostItemType.PREFERENCES.getValue())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            HomePreferencesConfig homePreferencesConfig = ((OperateItem) it.next()).getHomePreferencesConfig();
            String labelId = homePreferencesConfig != null ? homePreferencesConfig.getLabelId() : null;
            if (labelId != null) {
                arrayList2.add(labelId);
            }
        }
        HashSet hashSetP0 = CollectionsKt.m97338P0(arrayList2);
        int i11 = 0;
        for (C24040a c24040a : CollectionsKt.m97331I0(list2, new Comparator() { // from class: com.transsion.home.fragment.tab.HomePreferencesUiHelperKt$observeHomePreferencesInsertInstructions$lambda$12$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return ComparisonsKt.m97603d(Integer.valueOf(((C24040a) t11).m94942b()), Integer.valueOf(((C24040a) t12).m94942b()));
            }
        })) {
            String labelId2 = c24040a.m94941a().getLabelId();
            if (!hashSetP0.contains(labelId2)) {
                hashSetP0.add(labelId2);
                int iL = RangesKt.m97942l((c24040a.m94942b() - 1) + i11, 4, baseProviderMultiAdapter.getData().size());
                OperateItem operateItem = new OperateItem(null, PostItemType.PREFERENCES.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741821, null);
                operateItem.setHomePreferencesConfig(c24040a.m94941a());
                Unit unit = Unit.f75682a;
                baseProviderMultiAdapter.mo36199n(iL, operateItem);
                i11++;
            }
        }
        return Unit.f75682a;
    }
}
