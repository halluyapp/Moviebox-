package com.transsion.home.adapter.suboperate.provider;

import android.view.View;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.util.C14557c;
import com.transsion.home.adapter.trending.provider.SubjectItemProvider;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.moviedetailapi.bean.ExplainBean;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.moviedetailapi.bean.Subject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ml.AbstractC25888b;
import p842vl.AbstractC28126h;

/* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.provider.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C14987q extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final int f52388e;

    /* JADX INFO: renamed from: f */
    private final boolean f52389f;

    /* JADX INFO: renamed from: g */
    private final SubjectItemProvider f52390g;

    public C14987q(int i11, boolean z11) {
        this.f52388e = i11;
        this.f52389f = z11;
        this.f52390g = new SubjectItemProvider(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final void m67166B(OperateItem operateItem, C14987q c14987q, View view) {
        List<Object> data;
        Subject feedsSubject = operateItem.getFeedsSubject();
        if (feedsSubject != null) {
            AbstractC28126h.m109239f(feedsSubject, "opt_sub_feeds");
            BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = c14987q.m36335g();
            c14987q.m67168D((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? -1 : data.indexOf(operateItem), feedsSubject, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m67167C(OperateItem operateItem, C14987q c14987q, View view) {
        Subject feedsSubject;
        List<Object> data;
        if (C14557c.f51100a.m65671a(view.getId(), 2000L) || (feedsSubject = operateItem.getFeedsSubject()) == null) {
            return;
        }
        AbstractC28126h.m109240g(feedsSubject, SubTabFragment.INSTANCE.m68282a(c14987q.f52388e), c14987q.m36338k(), "opt_sub_feeds");
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = c14987q.m36335g();
        c14987q.m67168D((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? -1 : data.indexOf(operateItem), feedsSubject, false);
    }

    /* JADX INFO: renamed from: D */
    private final void m67168D(int i11, Subject subject, boolean z11) {
        HashMap map = new HashMap();
        map.put("event_type", z11 ? "browse_feeds_item" : "click_feeds_item");
        map.put("sequence", String.valueOf(i11));
        map.put("item_type", "rec");
        String ops = subject.getOps();
        if (ops == null) {
            ops = "";
        }
        map.put("ops", ops);
        String subjectId = subject.getSubjectId();
        map.put("subject_id", subjectId != null ? subjectId : "");
        map.put("builtin", subject.getBuiltIn() ? "1" : "0");
        map.put("tabId", String.valueOf(this.f52388e));
        StringBuilder sb2 = new StringBuilder();
        List<ExplainBean> explains = subject.getExplains();
        if (explains != null) {
            Iterator<T> it = explains.iterator();
            while (it.hasNext()) {
                sb2.append(((ExplainBean) it.next()).getType());
                sb2.append(",");
            }
        }
        String string = sb2.toString();
        Intrinsics.m97801g(string, "toString(...)");
        map.put("rec_explain_type", StringsKt.m98163r1(string, ','));
        AbstractC25888b.m101682e(subject, map);
        if (z11) {
            C14450a.f50860a.m65142e(SubTabFragment.INSTANCE.m68282a(this.f52388e), map);
        } else {
            C14450a.f50860a.m65143f(SubTabFragment.INSTANCE.m68282a(this.f52388e), map);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final OperateItem item) {
        List<Object> data;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        Subject feedsSubject = item.getFeedsSubject();
        if (feedsSubject != null) {
            this.f52390g.mo22757b(helper, item);
            BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
            m67168D((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? -1 : data.indexOf(item), feedsSubject, true);
        }
        helper.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.suboperate.provider.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C14987q.m67166B(item, this, view);
            }
        });
        View viewM67261G = this.f52390g.m67261G();
        if (viewM67261G != null) {
            viewM67261G.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.suboperate.provider.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C14987q.m67167C(item, this, view);
                }
            });
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.SUBJECT.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return this.f52390g.mo22759m();
    }
}
