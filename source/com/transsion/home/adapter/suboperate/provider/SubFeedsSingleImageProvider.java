package com.transsion.home.adapter.suboperate.provider;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.util.C14557c;
import com.transsion.home.adapter.trending.provider.SubjectSingleImgItemProvider;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.moviedetailapi.bean.ExplainBean;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.videodetail.music.data.MusicLikedFragmentViewModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import ml.AbstractC25888b;
import p743rh.C27287m;
import p842vl.AbstractC28126h;

/* JADX INFO: loaded from: classes5.dex */
public class SubFeedsSingleImageProvider extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final int f52266e;

    /* JADX INFO: renamed from: f */
    private final boolean f52267f;

    /* JADX INFO: renamed from: g */
    private final SubjectSingleImgItemProvider f52268g;

    /* JADX INFO: renamed from: h */
    private final Lazy f52269h = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.adapter.suboperate.provider.r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SubFeedsSingleImageProvider.m67022G();
        }
    });

    public SubFeedsSingleImageProvider(int i11, boolean z11) {
        this.f52266e = i11;
        this.f52267f = z11;
        this.f52268g = new SubjectSingleImgItemProvider(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m67020D(OperateItem operateItem, SubFeedsSingleImageProvider subFeedsSingleImageProvider, View view) {
        List<Object> data;
        Subject feedsSubject = operateItem.getFeedsSubject();
        if (feedsSubject != null) {
            if (C27287m.f83003a.m106330e()) {
                AbstractC28126h.m109239f(feedsSubject, "opt_sub_feeds");
                BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = subFeedsSingleImageProvider.m36335g();
                subFeedsSingleImageProvider.m67023H((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? -1 : data.indexOf(operateItem), feedsSubject, false);
            } else {
                Context contextM36338k = subFeedsSingleImageProvider.m36338k();
                AppCompatActivity appCompatActivity = contextM36338k instanceof AppCompatActivity ? (AppCompatActivity) contextM36338k : null;
                if (appCompatActivity != null) {
                    AbstractC25136k.m99058d(AbstractC3226v.m14968a(appCompatActivity), null, null, new SubFeedsSingleImageProvider$convert$2$1$1$1(subFeedsSingleImageProvider, operateItem, feedsSubject, null), 3, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m67021E(OperateItem operateItem, SubFeedsSingleImageProvider subFeedsSingleImageProvider, View view) {
        Subject feedsSubject;
        List<Object> data;
        if (C14557c.f51100a.m65671a(view.getId(), 2000L) || (feedsSubject = operateItem.getFeedsSubject()) == null) {
            return;
        }
        AbstractC28126h.m109240g(feedsSubject, SubTabFragment.INSTANCE.m68282a(subFeedsSingleImageProvider.f52266e), subFeedsSingleImageProvider.m36338k(), "opt_sub_feeds");
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = subFeedsSingleImageProvider.m36335g();
        subFeedsSingleImageProvider.m67023H((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? -1 : data.indexOf(operateItem), feedsSubject, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final MusicLikedFragmentViewModel m67022G() {
        return new MusicLikedFragmentViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public final void m67023H(int i11, Subject subject, boolean z11) {
        HashMap map = new HashMap();
        map.put("event_type", z11 ? "browse_feeds_single_item" : "click_feeds_single_item");
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
        map.put("tabId", String.valueOf(this.f52266e));
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
            C14450a.f50860a.m65142e(SubTabFragment.INSTANCE.m68282a(this.f52266e), map);
        } else {
            C14450a.f50860a.m65143f(SubTabFragment.INSTANCE.m68282a(this.f52266e), map);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final OperateItem item) {
        List<Object> data;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        Subject feedsSubject = item.getFeedsSubject();
        if (feedsSubject != null) {
            this.f52268g.mo22757b(helper, item);
            BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
            m67023H((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? -1 : data.indexOf(item), feedsSubject, true);
        }
        helper.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.suboperate.provider.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubFeedsSingleImageProvider.m67020D(item, this, view);
            }
        });
        View viewM67268H = this.f52268g.m67268H();
        if (viewM67268H != null) {
            viewM67268H.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.suboperate.provider.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SubFeedsSingleImageProvider.m67021E(item, this, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: F */
    protected final MusicLikedFragmentViewModel m67027F() {
        return (MusicLikedFragmentViewModel) this.f52269h.getValue();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.SINGLE_SUBJECT.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return this.f52268g.mo22759m();
    }
}
