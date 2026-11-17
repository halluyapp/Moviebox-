package com.transsion.home.adapter.trending.provider;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baselib.helper.C14450a;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.trending.adapter.OpMovieRankAdapter;
import com.transsion.home.bean.AppointSubject;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.bean.RankingData;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.home.preload.InterfaceC15428b;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.moviedetailapi.bean.Subject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mg.C25829f;
import ml.AbstractC25888b;
import ng.AbstractC26006c;
import p765s6.InterfaceC27566d;
import p842vl.AbstractC28126h;
import p842vl.C28121c;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C15050m extends BaseItemProvider {

    /* JADX INFO: renamed from: i */
    public static final a f52580i = new a(null);

    /* JADX INFO: renamed from: j */
    public static final int f52581j = 8;

    /* JADX INFO: renamed from: e */
    private final int f52582e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC15428b f52583f;

    /* JADX INFO: renamed from: g */
    private final boolean f52584g;

    /* JADX INFO: renamed from: h */
    private final boolean f52585h;

    /* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.m$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C15050m(int i11, InterfaceC15428b interfaceC15428b, boolean z11, boolean z12) {
        this.f52582e = i11;
        this.f52583f = interfaceC15428b;
        this.f52584g = z11;
        this.f52585h = z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m67333C(C15050m c15050m, OperateItem operateItem, boolean z11, View view) {
        c15050m.m67336F(operateItem, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m67334D(C15050m c15050m, OperateItem operateItem, boolean z11, View view) {
        c15050m.m67336F(operateItem, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m67335E(OperateItem operateItem, OpMovieRankAdapter opMovieRankAdapter, C15050m c15050m, boolean z11, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List<AppointSubject> subjects;
        AppointSubject appointSubject;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        List<AppointSubject> subjects2 = operateItem.getSubjects();
        if (i11 >= (subjects2 != null ? subjects2.size() : 0) || (subjects = operateItem.getSubjects()) == null || (appointSubject = subjects.get(i11)) == null) {
            return;
        }
        if (opMovieRankAdapter.getItemViewType(i11) == 100) {
            c15050m.m67336F(operateItem, z11);
        } else {
            c15050m.m67337G(appointSubject, i11, operateItem, z11);
        }
    }

    /* JADX INFO: renamed from: F */
    private final void m67336F(OperateItem operateItem, boolean z11) {
        List<Object> data;
        String deepLink = operateItem.getDeepLink();
        Integer numValueOf = null;
        if (deepLink != null) {
            AbstractC5114k.m23925h(deepLink, null, 1, null);
        }
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        if (baseProviderMultiAdapterM36335g != null && (data = baseProviderMultiAdapterM36335g.getData()) != null) {
            numValueOf = Integer.valueOf(data.indexOf(operateItem));
        }
        if (!this.f52584g) {
            C28121c.f86299a.m109219i(operateItem, numValueOf);
            return;
        }
        HashMap map = new HashMap();
        map.put("event_type", z11 ? "click_rank_horiz_more" : "click_rank_more");
        map.put("sequence", String.valueOf(numValueOf));
        String deepLink2 = operateItem.getDeepLink();
        if (deepLink2 == null) {
            deepLink2 = "";
        }
        map.put("deepLink", deepLink2);
        String title = operateItem.getTitle();
        map.put(CampaignEx.JSON_KEY_TITLE, title != null ? title : "");
        map.put("tabId", String.valueOf(this.f52582e));
        AbstractC25888b.m101678a(operateItem, map);
        map.put("opt_type", operateItem.getType() + "_RANK_MORE");
        C14450a.f50860a.m65143f(SubTabFragment.INSTANCE.m68282a(this.f52582e), map);
    }

    /* JADX INFO: renamed from: G */
    private final void m67337G(Subject subject, int i11, OperateItem operateItem, boolean z11) {
        AbstractC28126h.m109239f(subject, "opt_movie_rank");
        if (!this.f52584g) {
            C28121c.f86299a.m109218h(subject, i11, operateItem);
            return;
        }
        HashMap map = new HashMap();
        map.put("event_type", z11 ? "click_rank_horiz_item" : "click_rank_item");
        map.put("sequence", String.valueOf(i11));
        map.put("tabId", String.valueOf(this.f52582e));
        if (operateItem != null) {
            AbstractC25888b.m101678a(operateItem, map);
        }
        AbstractC25888b.m101682e(subject, map);
        C14450a.f50860a.m65143f(SubTabFragment.INSTANCE.m68282a(this.f52582e), map);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final OperateItem item) {
        List<Object> data;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        RankingData rankingData = item.getRankingData();
        final boolean z11 = rankingData != null && rankingData.getRankingHorizontal();
        TextView textView = (TextView) helper.getView(R$id.main_operation_movie_rank_title);
        textView.setText(item.getTitle());
        TextView textView2 = (TextView) helper.getView(R$id.main_operation_movie_more_text);
        String deepLink = item.getDeepLink();
        if (deepLink == null || deepLink.length() == 0) {
            AbstractC26006c.m102055h(textView2);
        } else {
            AbstractC26006c.m102058k(textView2);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.trending.provider.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C15050m.m67333C(this.f52566a, item, z11, view);
                }
            });
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.trending.provider.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C15050m.m67334D(this.f52570a, item, z11, view);
                }
            });
        }
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.main_operation_movie_rank_recycler);
        final OpMovieRankAdapter opMovieRankAdapter = new OpMovieRankAdapter(0, item, this.f52584g, this.f52582e, z11, this.f52585h, 1, null);
        recyclerView.setAdapter(opMovieRankAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m36338k(), 0, false);
        linearLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C25829f(8.0f, 0.0f, 12.0f, 2, null));
        }
        List<AppointSubject> subjects = item.getSubjects();
        if (subjects == null) {
            subjects = new ArrayList<>();
        }
        if (subjects.size() > 30) {
            subjects = subjects.subList(0, 31);
        }
        opMovieRankAdapter.mo36201n1(subjects);
        opMovieRankAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.home.adapter.trending.provider.l
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                C15050m.m67335E(item, opMovieRankAdapter, this, z11, baseQuickAdapter, view, i11);
            }
        });
        if (this.f52584g) {
            HashMap map = new HashMap();
            map.put("event_type", z11 ? "browse_rank_horiz_more" : "browse_rank_more");
            BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
            map.put("sequence", String.valueOf((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? null : Integer.valueOf(data.indexOf(item))));
            String deepLink2 = item.getDeepLink();
            if (deepLink2 == null) {
                deepLink2 = "";
            }
            map.put("deepLink", deepLink2);
            String title = item.getTitle();
            map.put(CampaignEx.JSON_KEY_TITLE, title != null ? title : "");
            map.put("tabId", String.valueOf(this.f52582e));
            AbstractC25888b.m101678a(item, map);
            map.put("opt_type", item.getType() + "_RANK_MORE");
            C14450a.f50860a.m65142e(SubTabFragment.INSTANCE.m68282a(this.f52582e), map);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.OP_SUBJECTS_MOVIE.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.post_list_item_op_movie_rank;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: r */
    public BaseViewHolder mo36342r(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        InterfaceC15428b interfaceC15428b = this.f52583f;
        if (interfaceC15428b == null || interfaceC15428b.mo68498a() || this.f52583f.mo68500c() == null) {
            return super.mo36342r(parent, i11);
        }
        C26866a.a.m104898f(C26866a.f81698a, "MainXMLPreload", "subjectOpView", false, 4, null);
        View viewMo68500c = this.f52583f.mo68500c();
        if (viewMo68500c == null) {
            return super.mo36342r(parent, i11);
        }
        viewMo68500c.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return new BaseViewHolder(viewMo68500c);
    }
}
