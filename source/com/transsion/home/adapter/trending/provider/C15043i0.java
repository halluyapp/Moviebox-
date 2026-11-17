package com.transsion.home.adapter.trending.provider;

import android.util.LruCache;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import com.blankj.utilcode.util.AbstractC5779c;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.tmc.integration.constants.IntegrationConstants;
import com.therouter.TheRouter;
import com.transsion.baselib.exposure.ExposureType;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.suboperate.adapter.C14925a;
import com.transsion.home.adapter.suboperate.adapter.NewStyleRankContentAdapter;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.bean.RankingListData;
import com.transsion.home.bean.RankingListItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.ninegridview.preview.GifImagePreviewActivity;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import mg.C25829f;
import ng.AbstractC26006c;
import p550kj.C24662i;
import p765s6.InterfaceC27566d;
import p840vj.C28117b;
import p840vj.InterfaceC28116a;
import p842vl.AbstractC28126h;
import p842vl.C28128j;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.i0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15043i0 extends BaseItemProvider {

    /* JADX INFO: renamed from: i */
    public static final a f52552i = new a(null);

    /* JADX INFO: renamed from: j */
    public static final int f52553j = 8;

    /* JADX INFO: renamed from: e */
    private final int f52554e;

    /* JADX INFO: renamed from: f */
    private final boolean f52555f;

    /* JADX INFO: renamed from: g */
    private C28117b f52556g;

    /* JADX INFO: renamed from: h */
    private final e f52557h = new e();

    /* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.i0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.i0$b */
    public static final class b implements InterfaceC28116a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ NewStyleRankContentAdapter f52558a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C15043i0 f52559b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ OperateItem f52560c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C28128j f52561d;

        b(NewStyleRankContentAdapter newStyleRankContentAdapter, C15043i0 c15043i0, OperateItem operateItem, C28128j c28128j) {
            this.f52558a = newStyleRankContentAdapter;
            this.f52559b = c15043i0;
            this.f52560c = operateItem;
            this.f52561d = c28128j;
        }

        @Override // p840vj.InterfaceC28116a
        /* JADX INFO: renamed from: a */
        public void mo65894a(int i11, long j11, View view) {
            String string;
            NewStyleRankContentAdapter newStyleRankContentAdapter = this.f52558a;
            C15043i0 c15043i0 = this.f52559b;
            OperateItem operateItem = this.f52560c;
            C28128j c28128j = this.f52561d;
            try {
                Result.Companion companion = Result.INSTANCE;
                C26866a.a.m104905r(C26866a.f81698a, "StateAwareRankListProvider", new String[]{"content item exposure, position:" + i11 + ", duration:" + j11}, false, 4, null);
                Subject subject = (Subject) newStyleRankContentAdapter.m36182f0(i11);
                if (subject != null) {
                    HashMap mapM67318I = c15043i0.m67318I(operateItem);
                    if (newStyleRankContentAdapter.getItemViewType(i11) == 100) {
                        mapM67318I.put("sequence", String.valueOf(i11));
                        mapM67318I.put("deepkLink", c15043i0.m67319J(operateItem, c28128j));
                        mapM67318I.put("module_name", "more");
                    } else {
                        String subjectId = subject.getSubjectId();
                        String str = "";
                        if (subjectId == null) {
                            subjectId = "";
                        }
                        mapM67318I.put("subject_id", subjectId);
                        mapM67318I.put("sequence", String.valueOf(i11));
                        Integer subjectType = subject.getSubjectType();
                        if (subjectType != null && (string = subjectType.toString()) != null) {
                            str = string;
                        }
                        mapM67318I.put("subject_type", str);
                        mapM67318I.put("has_resource", String.valueOf(subject.getHasResource()));
                    }
                    C24662i.f75350a.m96872D(SubTabFragment.INSTANCE.m68282a(c15043i0.f52554e), mapM67318I);
                }
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.i0$c */
    public static final class c extends RecyclerView.AbstractC4219r {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C28128j f52562a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ RecyclerView f52563b;

        c(C28128j c28128j, RecyclerView recyclerView) {
            this.f52562a = c28128j;
            this.f52563b = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            if (i11 == 0) {
                C28128j c28128j = this.f52562a;
                c28128j.m109249d(c28128j.m109246a(), this.f52563b);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.i0$d */
    public static final class d extends RecyclerView.AbstractC4219r {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C28128j f52564a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ RecyclerView f52565b;

        d(C28128j c28128j, RecyclerView recyclerView) {
            this.f52564a = c28128j;
            this.f52565b = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            if (i11 == 0) {
                this.f52564a.m109250e(this.f52565b);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.i0$e */
    public static final class e extends LruCache {
        e() {
            super(20);
        }
    }

    public C15043i0(int i11, boolean z11) {
        this.f52554e = i11;
        this.f52555f = z11;
    }

    /* JADX INFO: renamed from: E */
    private final String m67315E(String str, String str2) {
        if (str == null) {
            str = "";
        }
        String strM61865p = TheRouter.m61773c("/rank/all").m61857K("category", str).m61852F("tabId", this.f52554e).m61857K("defaultCategory", str).m61857K("rankingListId", str2).m61865p();
        String strM27328e = AbstractC5779c.m27328e();
        Intrinsics.m97801g(strM27328e, "getAppPackageName(...)");
        return GifImagePreviewActivity.PICTURE_SAVE + "://" + strM27328e + "?type=" + strM61865p;
    }

    /* JADX INFO: renamed from: F */
    private final String m67316F(int i11, String str, int i12) {
        if (str == null) {
            str = "pos_" + i12;
        }
        return "rank_" + i11 + "_" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m67317H(C15043i0 c15043i0, OperateItem operateItem, View view) {
        c15043i0.m67331M(operateItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final HashMap m67318I(OperateItem operateItem) {
        String opId = operateItem.getOpId();
        if (opId == null) {
            opId = "";
        }
        Pair pairM97108a = TuplesKt.m97108a("opt_id", opId);
        String type = operateItem.getType();
        return MapsKt.m97575j(pairM97108a, TuplesKt.m97108a("opt_type", type != null ? type : ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public final String m67319J(OperateItem operateItem, C28128j c28128j) {
        List<RankingListItem> listL;
        RankingListData rankingListData = operateItem.getRankingListData();
        if (rankingListData == null || (listL = rankingListData.getItems()) == null) {
            listL = CollectionsKt.m97506l();
        }
        RankingListData rankingListData2 = operateItem.getRankingListData();
        String rankingListId = rankingListData2 != null ? rankingListData2.getRankingListId() : null;
        int iM109246a = c28128j.m109246a();
        if (listL.isEmpty() || iM109246a < 0 || iM109246a >= listL.size()) {
            iM109246a = 0;
        }
        return (iM109246a < 0 || iM109246a >= listL.size()) ? "" : m67315E(listL.get(iM109246a).getCategoryId(), rankingListId);
    }

    /* JADX INFO: renamed from: K */
    private final C28128j m67320K(OperateItem operateItem, BaseViewHolder baseViewHolder) {
        String strM67316F = m67316F(this.f52554e, operateItem.getOpId(), baseViewHolder.getBindingAdapterPosition());
        C28128j c28128j = (C28128j) this.f52557h.get(strM67316F);
        if (c28128j != null) {
            return c28128j;
        }
        C28128j c28128j2 = new C28128j();
        this.f52557h.put(strM67316F, c28128j2);
        return c28128j2;
    }

    /* JADX INFO: renamed from: L */
    private final void m67321L(RecyclerView recyclerView, NewStyleRankContentAdapter newStyleRankContentAdapter, OperateItem operateItem, C28128j c28128j) {
        C28117b c28117b = new C28117b(0.6f, new b(newStyleRankContentAdapter, this, operateItem, c28128j), false, 4, null);
        c28117b.m109199n(1);
        c28117b.m109200o(ExposureType.NEST_HORIZONTAL);
        recyclerView.addOnScrollListener(c28117b);
        this.f52556g = c28117b;
    }

    /* JADX INFO: renamed from: N */
    private final void m67322N(C28128j c28128j, OperateItem operateItem) {
        List<RankingListItem> listL;
        RankingListData rankingListData = operateItem.getRankingListData();
        if (rankingListData == null || (listL = rankingListData.getItems()) == null) {
            listL = CollectionsKt.m97506l();
        }
        RankingListData rankingListData2 = operateItem.getRankingListData();
        String rankingListId = rankingListData2 != null ? rankingListData2.getRankingListId() : null;
        int iM109246a = c28128j.m109246a();
        if (listL.isEmpty() || iM109246a < 0 || iM109246a >= listL.size()) {
            iM109246a = 0;
        }
        if (iM109246a < 0 || iM109246a >= listL.size()) {
            return;
        }
        String categoryId = listL.get(iM109246a).getCategoryId();
        AbstractC5114k.m23933p(TheRouter.m61773c("/rank/all").m61857K("category", categoryId).m61852F("tabId", this.f52554e).m61857K("defaultCategory", categoryId).m61857K("rankingListId", rankingListId));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, com.transsion.home.adapter.suboperate.adapter.NewStyleRankContentAdapter] */
    /* JADX INFO: renamed from: O */
    private final void m67323O(RecyclerView recyclerView, final OperateItem operateItem, final C28128j c28128j) {
        List<RankingListItem> listL;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m36338k(), 0, false);
        linearLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C25829f(8.0f, 0.0f, 0.0f, 6, null));
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        T t11 = adapter instanceof NewStyleRankContentAdapter ? (NewStyleRankContentAdapter) adapter : 0;
        objectRef.element = t11;
        final boolean z11 = false;
        if (t11 == 0) {
            ?? newStyleRankContentAdapter = new NewStyleRankContentAdapter(0, operateItem, this.f52554e, z11, this.f52555f, 1, null);
            objectRef.element = newStyleRankContentAdapter;
            recyclerView.setAdapter((RecyclerView.Adapter) newStyleRankContentAdapter);
        }
        ((NewStyleRankContentAdapter) objectRef.element).m36227w1(new InterfaceC27566d() { // from class: com.transsion.home.adapter.trending.provider.h0
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                C15043i0.m67324P(objectRef, this, operateItem, c28128j, z11, baseQuickAdapter, view, i11);
            }
        });
        int iM109246a = c28128j.m109246a();
        RankingListData rankingListData = operateItem.getRankingListData();
        if (rankingListData == null || (listL = rankingListData.getItems()) == null) {
            listL = CollectionsKt.m97506l();
        }
        List<RankingListItem> list = listL;
        if (!list.isEmpty() && iM109246a >= 0 && iM109246a < list.size()) {
            List<Subject> subjects = listL.get(iM109246a).getSubjects();
            if (subjects == null) {
                subjects = CollectionsKt.m97506l();
            }
            ((NewStyleRankContentAdapter) objectRef.element).mo36201n1(subjects);
            c28128j.m109247b(iM109246a, recyclerView);
        }
        recyclerView.clearOnScrollListeners();
        recyclerView.addOnScrollListener(new c(c28128j, recyclerView));
        m67321L(recyclerView, (NewStyleRankContentAdapter) objectRef.element, operateItem, c28128j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public static final void m67324P(Ref.ObjectRef objectRef, C15043i0 c15043i0, OperateItem operateItem, C28128j c28128j, boolean z11, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Subject subject;
        String string;
        List<Object> data;
        List<Object> data2;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        List<Object> data3 = ((NewStyleRankContentAdapter) objectRef.element).getData();
        if (data3 == null || i11 >= data3.size() || (subject = (Subject) CollectionsKt.m97362l0(data3, i11)) == null) {
            return;
        }
        HashMap mapM67318I = c15043i0.m67318I(operateItem);
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = c15043i0.m36335g();
        Integer numValueOf = null;
        mapM67318I.put("sequence", String.valueOf((baseProviderMultiAdapterM36335g == null || (data2 = baseProviderMultiAdapterM36335g.getData()) == null) ? null : Integer.valueOf(data2.indexOf(operateItem))));
        String strM67319J = c15043i0.m67319J(operateItem, c28128j);
        if (((NewStyleRankContentAdapter) objectRef.element).getItemViewType(i11) == 100) {
            mapM67318I.put("deepkLink", strM67319J);
            mapM67318I.put("module_name", "more");
            C24662i.f75350a.m96881p(SubTabFragment.INSTANCE.m68282a(c15043i0.f52554e), mapM67318I);
            c15043i0.m67322N(c28128j, operateItem);
        } else {
            String subjectId = subject.getSubjectId();
            if (subjectId == null) {
                subjectId = "";
            }
            mapM67318I.put("subject_id", subjectId);
            mapM67318I.put("sequence", String.valueOf(i11));
            Integer subjectType = subject.getSubjectType();
            if (subjectType == null || (string = subjectType.toString()) == null) {
                string = "";
            }
            mapM67318I.put("subject_type", string);
            mapM67318I.put("has_resource", String.valueOf(subject.getHasResource()));
            C24662i.f75350a.m96881p(SubTabFragment.INSTANCE.m68282a(c15043i0.f52554e), mapM67318I);
            c15043i0.m67327S(subject, i11, operateItem, z11);
        }
        HashMap mapM67318I2 = c15043i0.m67318I(operateItem);
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g2 = c15043i0.m36335g();
        if (baseProviderMultiAdapterM36335g2 != null && (data = baseProviderMultiAdapterM36335g2.getData()) != null) {
            numValueOf = Integer.valueOf(data.indexOf(operateItem));
        }
        mapM67318I2.put("sequence", String.valueOf(numValueOf));
        if (((NewStyleRankContentAdapter) objectRef.element).getItemViewType(i11) == 100 && (strM67319J = (String) mapM67318I.get("deepkLink")) == null) {
            strM67319J = "";
        }
        mapM67318I2.put("deepkLink", strM67319J);
        C24662i.f75350a.m96881p(SubTabFragment.INSTANCE.m68282a(c15043i0.f52554e), mapM67318I2);
    }

    /* JADX INFO: renamed from: Q */
    private final void m67325Q(final RecyclerView recyclerView, final RecyclerView recyclerView2, final OperateItem operateItem, final C28128j c28128j) {
        List<RankingListItem> listL;
        List<Object> data;
        int i11 = 0;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m36338k(), 0, false);
        linearLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        C14925a c14925a = adapter instanceof C14925a ? (C14925a) adapter : null;
        if (c14925a == null) {
            c14925a = new C14925a(this.f52554e);
            recyclerView.setAdapter(c14925a);
        }
        C14925a c14925a2 = c14925a;
        RankingListData rankingListData = operateItem.getRankingListData();
        if (rankingListData == null || (listL = rankingListData.getItems()) == null) {
            listL = CollectionsKt.m97506l();
        }
        final List<RankingListItem> list = listL;
        int iM109246a = c28128j.m109246a();
        if (list.isEmpty() || iM109246a < 0 || iM109246a >= list.size()) {
            c28128j.m109251f(0);
        } else {
            i11 = iM109246a;
        }
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        final String strValueOf = String.valueOf((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? null : Integer.valueOf(data.indexOf(operateItem)));
        RankingListData rankingListData2 = operateItem.getRankingListData();
        String rankingListId = rankingListData2 != null ? rankingListData2.getRankingListId() : null;
        for (RankingListItem rankingListItem : list) {
            String categoryId = rankingListItem.getCategoryId();
            HashMap mapM67318I = m67318I(operateItem);
            mapM67318I.put("sequence", strValueOf);
            mapM67318I.put("deepkLink", m67315E(categoryId, rankingListId));
            String title = rankingListItem.getTitle();
            if (title == null) {
                title = "";
            }
            mapM67318I.put("module_name", title);
            mapM67318I.put("tabId", String.valueOf(this.f52554e));
            C24662i.f75350a.m96872D(SubTabFragment.INSTANCE.m68282a(this.f52554e), mapM67318I);
        }
        c14925a2.mo36201n1(list);
        c14925a2.m66955D1(i11);
        final String str = rankingListId;
        c14925a2.m36227w1(new InterfaceC27566d() { // from class: com.transsion.home.adapter.trending.provider.g0
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i12) {
                C15043i0.m67326R(recyclerView, list, this, str, operateItem, c28128j, recyclerView2, strValueOf, baseQuickAdapter, view, i12);
            }
        });
        c28128j.m109248c(recyclerView);
        recyclerView.clearOnScrollListeners();
        recyclerView.addOnScrollListener(new d(c28128j, recyclerView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final void m67326R(RecyclerView recyclerView, List list, C15043i0 c15043i0, String str, OperateItem operateItem, C28128j c28128j, RecyclerView recyclerView2, String str2, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        C14925a c14925a = adapter instanceof C14925a ? (C14925a) adapter : null;
        if (c14925a == null) {
            return;
        }
        int currentSelectIndex = c14925a.getCurrentSelectIndex();
        if (i11 >= 0 && i11 < list.size()) {
            RankingListItem rankingListItem = (RankingListItem) list.get(i11);
            String strM67315E = c15043i0.m67315E(rankingListItem.getCategoryId(), str);
            HashMap mapM67318I = c15043i0.m67318I(operateItem);
            mapM67318I.put("sequence", str2);
            mapM67318I.put("deepkLink", strM67315E);
            String title = rankingListItem.getTitle();
            if (title == null) {
                title = "";
            }
            mapM67318I.put("module_name", title);
            mapM67318I.put("tabId", String.valueOf(c15043i0.f52554e));
            C24662i c24662i = C24662i.f75350a;
            SubTabFragment.Companion companion = SubTabFragment.INSTANCE;
            c24662i.m96881p(companion.m68282a(c15043i0.f52554e), mapM67318I);
            HashMap mapM67318I2 = c15043i0.m67318I(operateItem);
            mapM67318I2.put("sequence", str2);
            mapM67318I2.put("deepkLink", strM67315E);
            c24662i.m96881p(companion.m68282a(c15043i0.f52554e), mapM67318I2);
        }
        if (i11 == currentSelectIndex) {
            return;
        }
        c28128j.m109249d(currentSelectIndex, recyclerView2);
        c28128j.m109251f(i11);
        c14925a.m66955D1(i11);
        if (i11 < 0 || i11 >= list.size()) {
            return;
        }
        List<Subject> subjects = ((RankingListItem) list.get(i11)).getSubjects();
        if (subjects == null) {
            subjects = CollectionsKt.m97506l();
        }
        RecyclerView.Adapter adapter2 = recyclerView2.getAdapter();
        NewStyleRankContentAdapter newStyleRankContentAdapter = adapter2 instanceof NewStyleRankContentAdapter ? (NewStyleRankContentAdapter) adapter2 : null;
        if (newStyleRankContentAdapter != null) {
            newStyleRankContentAdapter.mo36201n1(subjects);
        }
        c28128j.m109247b(i11, recyclerView2);
    }

    /* JADX INFO: renamed from: S */
    private final void m67327S(Subject subject, int i11, OperateItem operateItem, boolean z11) {
        AbstractC28126h.m109239f(subject, "ranking_list_multi_tab");
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final OperateItem item) {
        List<Object> data;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        TextView textView = (TextView) helper.getView(R$id.tvModuleTitle);
        textView.setText(item.getTitle());
        TextView textView2 = (TextView) helper.getView(R$id.tvRankMore);
        String deepLink = item.getDeepLink();
        if (deepLink == null || deepLink.length() == 0) {
            AbstractC26006c.m102055h(textView2);
        } else {
            AbstractC26006c.m102058k(textView2);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.transsion.home.adapter.trending.provider.f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C15043i0.m67317H(this.f52536a, item, view);
                }
            };
            textView.setOnClickListener(onClickListener);
            textView2.setOnClickListener(onClickListener);
        }
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.rvTabList);
        RecyclerView recyclerView2 = (RecyclerView) helper.getView(R$id.rvContentList);
        C28128j c28128jM67320K = m67320K(item, helper);
        m67325Q(recyclerView, recyclerView2, item, c28128jM67320K);
        m67323O(recyclerView2, item, c28128jM67320K);
        HashMap mapM67318I = m67318I(item);
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        mapM67318I.put("sequence", String.valueOf((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? null : Integer.valueOf(data.indexOf(item))));
        String deepLink2 = item.getDeepLink();
        if (deepLink2 == null) {
            deepLink2 = "";
        }
        mapM67318I.put("deepkLink", deepLink2);
        C24662i.f75350a.m96872D(SubTabFragment.INSTANCE.m68282a(this.f52554e), mapM67318I);
    }

    /* JADX INFO: renamed from: M */
    public final void m67331M(OperateItem item) {
        List<Object> data;
        Intrinsics.m97802h(item, "item");
        String deepLink = item.getDeepLink();
        Integer numValueOf = null;
        if (deepLink != null) {
            AbstractC5114k.m23925h(deepLink, null, 1, null);
        }
        HashMap mapM67318I = m67318I(item);
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        if (baseProviderMultiAdapterM36335g != null && (data = baseProviderMultiAdapterM36335g.getData()) != null) {
            numValueOf = Integer.valueOf(data.indexOf(item));
        }
        mapM67318I.put("sequence", String.valueOf(numValueOf));
        String deepLink2 = item.getDeepLink();
        if (deepLink2 == null) {
            deepLink2 = "";
        }
        mapM67318I.put("deepkLink", deepLink2);
        mapM67318I.put("module_name", IntegrationConstants.NAVIGATION_BAR_ALL_ACTION);
        C24662i c24662i = C24662i.f75350a;
        SubTabFragment.Companion companion = SubTabFragment.INSTANCE;
        c24662i.m96881p(companion.m68282a(this.f52554e), mapM67318I);
        mapM67318I.remove("module_name");
        c24662i.m96881p(companion.m68282a(this.f52554e), mapM67318I);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.RANKING_LIST_MULTI_TAB.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.home_item_new_style_ranking;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: t */
    public void mo36344t(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.mo36344t(holder);
        C26866a.a.m104908v(C26866a.f81698a, "StateAwareRankListProvider", "onViewAttachedToWindow", false, 4, null);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: u */
    public void mo36345u(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.mo36345u(holder);
        C26866a.a.m104908v(C26866a.f81698a, "StateAwareRankListProvider", "onViewDetachedFromWindow", false, 4, null);
        C28117b c28117b = this.f52556g;
        if (c28117b != null) {
            c28117b.m109195f();
        }
    }
}
