package com.transsion.home.adapter.suboperate.provider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C4247n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baselib.helper.C14450a;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.AppointSubject;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import ml.AbstractC25888b;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p842vl.AbstractC28126h;

/* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.provider.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14958b0 extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final int f52311e;

    /* JADX INFO: renamed from: f */
    private final boolean f52312f;

    /* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.provider.b0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private Integer f52313a;

        /* JADX INFO: renamed from: b */
        private List f52314b;

        public a(Integer num, List subjects) {
            Intrinsics.m97802h(subjects, "subjects");
            this.f52313a = num;
            this.f52314b = subjects;
        }

        /* JADX INFO: renamed from: a */
        public final Integer m67111a() {
            return this.f52313a;
        }

        /* JADX INFO: renamed from: b */
        public final List m67112b() {
            return this.f52314b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.m97797c(this.f52313a, aVar.f52313a) && Intrinsics.m97797c(this.f52314b, aVar.f52314b);
        }

        public int hashCode() {
            Integer num = this.f52313a;
            return ((num == null ? 0 : num.hashCode()) * 31) + this.f52314b.hashCode();
        }

        public String toString() {
            return "MusicRankData(index=" + this.f52313a + ", subjects=" + this.f52314b + ")";
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.provider.b0$b */
    @Metadata(m97099d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010 \u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, m97100d2 = {"Lcom/transsion/home/adapter/suboperate/provider/b0$b;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/home/adapter/suboperate/provider/b0$a;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "layoutResId", "Lcom/transsion/home/bean/OperateItem;", "operateItem", "tabId", "", "isTablet", "<init>", "(ILcom/transsion/home/bean/OperateItem;IZ)V", "F1", "()I", "Landroid/content/Context;", "context", "Lcom/transsion/moviedetailapi/bean/Subject;", "subject", "Landroid/view/ViewGroup;", "parent", RequestParameters.POSITION, "Landroid/view/View;", "E1", "(Landroid/content/Context;Lcom/transsion/moviedetailapi/bean/Subject;Landroid/view/ViewGroup;I)Landroid/view/View;", "rankListItem", "", "G1", "(Lcom/transsion/home/adapter/suboperate/provider/b0$a;I)V", "H1", "holder", WebConstants.FIELD_ITEM, "C1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/home/adapter/suboperate/provider/b0$a;)V", "F", "Lcom/transsion/home/bean/OperateItem;", "G", "I", "H", "Z", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @SourceDebugExtension
    public static final class b extends BaseQuickAdapter {

        /* JADX INFO: renamed from: I */
        public static final int f52315I = 8;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        private final OperateItem operateItem;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        private final int tabId;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        private final boolean isTablet;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11, OperateItem operateItem, int i12, boolean z11) {
            super(i11, null, 2, null);
            Intrinsics.m97802h(operateItem, "operateItem");
            this.operateItem = operateItem;
            this.tabId = i12;
            this.isTablet = z11;
        }

        public /* synthetic */ b(int i11, OperateItem operateItem, int i12, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? R$layout.item_provider_ranklist : i11, operateItem, i12, z11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: D1 */
        public static final void m67114D1(Subject subject, b bVar, a aVar, int i11, View view) {
            AbstractC28126h.m109239f(subject, "opt_ranking_list");
            bVar.m67118H1(aVar, i11);
        }

        /* JADX INFO: renamed from: E1 */
        private final View m67115E1(Context context, Subject subject, ViewGroup parent, int position) {
            String url;
            View viewInflate = LayoutInflater.from(context).inflate(R$layout.item_provider_music_rank_item, parent, false);
            View viewFindViewById = viewInflate.findViewById(R$id.ivCover);
            Intrinsics.m97801g(viewFindViewById, "findViewById(...)");
            ShapeableImageView shapeableImageView = (ShapeableImageView) viewFindViewById;
            C23860f.b bVarM94457m = C23860f.f72909a.m94457m(context);
            Cover cover = subject.getCover();
            if (cover == null || (url = cover.getUrl()) == null) {
                url = "";
            }
            bVarM94457m.m94468g(url).m94465d(shapeableImageView);
            ((TextView) viewInflate.findViewById(R$id.tvTitle)).setText(subject.getTitle());
            ((TextView) viewInflate.findViewById(R$id.tvRankNum)).setText(String.valueOf(position + 1));
            Intrinsics.m97799e(viewInflate);
            return viewInflate;
        }

        /* JADX INFO: renamed from: F1 */
        private final int m67116F1() {
            return (AbstractC5806y.m27489e() - AbstractC23384a.m92908b(68)) / (this.isTablet ? 2 : 1);
        }

        /* JADX INFO: renamed from: G1 */
        private final void m67117G1(a rankListItem, int position) {
            Subject subject = (Subject) rankListItem.m67112b().get(position);
            HashMap map = new HashMap();
            map.put("event_type", "browse_music_rank_list_item");
            map.put("sequence", String.valueOf(position));
            map.put("tabId", String.valueOf(this.tabId));
            AbstractC25888b.m101678a(this.operateItem, map);
            AbstractC25888b.m101682e(subject, map);
            C14450a.f50860a.m65142e(SubTabFragment.INSTANCE.m68282a(this.tabId), map);
        }

        /* JADX INFO: renamed from: H1 */
        private final void m67118H1(a rankListItem, int position) {
            Subject subject = (Subject) rankListItem.m67112b().get(position);
            HashMap map = new HashMap();
            map.put("event_type", "click_music_rank_list_item");
            map.put("sequence", String.valueOf(position));
            map.put("tabId", String.valueOf(this.tabId));
            AbstractC25888b.m101678a(this.operateItem, map);
            AbstractC25888b.m101682e(subject, map);
            C14450a.f50860a.m65143f(SubTabFragment.INSTANCE.m68282a(this.tabId), map);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
        public void mo36106F(BaseViewHolder holder, final a item) {
            Intrinsics.m97802h(holder, "holder");
            Intrinsics.m97802h(item, "item");
            ViewGroup viewGroup = (LinearLayout) holder.getView(R$id.sub_operation_rankinglist_root);
            viewGroup.removeAllViews();
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = m67116F1();
            marginLayoutParams.rightMargin = AbstractC23384a.m92908b(8);
            viewGroup.setLayoutParams(marginLayoutParams);
            viewGroup.setBackground(null);
            Integer numM67111a = item.m67111a();
            final int i11 = 0;
            int iIntValue = numM67111a != null ? numM67111a.intValue() : 0;
            for (Object obj : item.m67112b()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                final Subject subject = (Subject) obj;
                View viewM67115E1 = m67115E1(getContext(), subject, viewGroup, (iIntValue * 3) + i11);
                viewGroup.addView(viewM67115E1);
                viewM67115E1.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.suboperate.provider.c0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C14958b0.b.m67114D1(subject, this, item, i11, view);
                    }
                });
                m67117G1(item, i11);
                i11 = i12;
            }
        }
    }

    public C14958b0(int i11, boolean z11) {
        this.f52311e = i11;
        this.f52312f = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final Unit m67103C(OperateItem operateItem, C14958b0 c14958b0) {
        String deepLink = operateItem.getDeepLink();
        if (deepLink == null || !StringsKt.m98132c0(deepLink, "&showType=", false, 2, null)) {
            String deepLink2 = operateItem.getDeepLink();
            if (deepLink2 != null) {
                AbstractC5114k.m23924g(deepLink2, "&showType=2");
            }
        } else {
            String deepLink3 = operateItem.getDeepLink();
            if (deepLink3 != null) {
                AbstractC5114k.m23925h(deepLink3, null, 1, null);
            }
        }
        c14958b0.m67107G(operateItem);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m67104D(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m67105E(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: F */
    private final void m67106F(OperateItem operateItem) {
        List<Object> data;
        HashMap map = new HashMap();
        map.put("event_type", "browse_music_rank_more");
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        map.put("sequence", String.valueOf((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? null : Integer.valueOf(data.indexOf(operateItem))));
        String deepLink = operateItem.getDeepLink();
        if (deepLink == null) {
            deepLink = "";
        }
        map.put("deepLink", deepLink);
        String title = operateItem.getTitle();
        map.put(CampaignEx.JSON_KEY_TITLE, title != null ? title : "");
        map.put("tabId", String.valueOf(this.f52311e));
        AbstractC25888b.m101678a(operateItem, map);
        map.put("opt_type", PostItemType.RANKING_LIST_MUSIC.getValue() + "_MORE");
        C14450a.f50860a.m65142e(SubTabFragment.INSTANCE.m68282a(this.f52311e), map);
    }

    /* JADX INFO: renamed from: G */
    private final void m67107G(OperateItem operateItem) {
        List<Object> data;
        HashMap map = new HashMap();
        map.put("event_type", "click_music_rank_more");
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        map.put("sequence", String.valueOf((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? null : Integer.valueOf(data.indexOf(operateItem))));
        String deepLink = operateItem.getDeepLink();
        if (deepLink == null) {
            deepLink = "";
        }
        map.put("deepLink", deepLink);
        String title = operateItem.getTitle();
        map.put(CampaignEx.JSON_KEY_TITLE, title != null ? title : "");
        map.put("tabId", String.valueOf(this.f52311e));
        AbstractC25888b.m101678a(operateItem, map);
        map.put("opt_type", PostItemType.RANKING_LIST_MUSIC.getValue() + "_MORE");
        C14450a.f50860a.m65143f(SubTabFragment.INSTANCE.m68282a(this.f52311e), map);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final OperateItem item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        TextView textView = (TextView) helper.getView(R$id.main_operation_movie_rank_title);
        textView.setText(item.getTitle());
        TextView textView2 = (TextView) helper.getView(R$id.main_operation_movie_more_text);
        String deepLink = item.getDeepLink();
        if (deepLink == null || deepLink.length() == 0) {
            AbstractC26006c.m102055h(textView2);
        } else {
            final Function0 function0 = new Function0() { // from class: com.transsion.home.adapter.suboperate.provider.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C14958b0.m67103C(item, this);
                }
            };
            AbstractC26006c.m102058k(textView2);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.suboperate.provider.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C14958b0.m67104D(function0, view);
                }
            });
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.suboperate.provider.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C14958b0.m67105E(function0, view);
                }
            });
            m67106F(item);
        }
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.main_operation_movie_rank_recycler);
        b bVar = new b(0, item, this.f52311e, this.f52312f, 1, null);
        recyclerView.setAdapter(bVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m36338k(), 0, false);
        linearLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (!this.f52312f) {
            recyclerView.setOnFlingListener(null);
            new C4247n().attachToRecyclerView(recyclerView);
        }
        ArrayList arrayList = new ArrayList();
        List<AppointSubject> subjects = item.getSubjects();
        if (subjects != null) {
            int iH = RangesKt.m97938h(subjects.size(), 9);
            a aVar = null;
            for (int i11 = 0; i11 < iH; i11++) {
                if (aVar == null) {
                    aVar = new a(Integer.valueOf(i11 / 3), new ArrayList());
                }
                aVar.m67112b().add(subjects.get(i11));
                if (aVar.m67112b().size() == 3) {
                    arrayList.add(aVar);
                    aVar = null;
                }
            }
            bVar.mo36201n1(arrayList);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.RANKING_LIST_MUSIC.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.post_list_item_op_movie_rank;
    }
}
