package com.transsion.usercenter.p321me.adapter;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.C5110g;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayBean;
import com.transsion.baselib.p291db.video.VideoDetailPlayBean;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.postdetail.shorttv.widget.ShortTVHistoryView;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.p321me.C20606k;
import com.transsion.usercenter.profile.bean.MeHistoryInfo;
import com.transsion.usercenter.profile.bean.MeItemInfo;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import ng.AbstractC26006c;
import p765s6.InterfaceC27566d;

/* JADX INFO: loaded from: classes7.dex */
public final class HistoryMineItemProvider extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final C20585o f64978e;

    /* JADX INFO: renamed from: f */
    private final Lazy f64979f;

    /* JADX WARN: Multi-variable type inference failed */
    public HistoryMineItemProvider() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public HistoryMineItemProvider(C20585o c20585o) {
        this.f64978e = c20585o;
        this.f64979f = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.me.adapter.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HistoryMineItemProvider.m85004G();
            }
        });
    }

    public /* synthetic */ HistoryMineItemProvider(C20585o c20585o, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : c20585o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final Unit m85000C(BaseViewHolder baseViewHolder, HistoryMineItemProvider historyMineItemProvider, MeItemInfo meItemInfo, View it) {
        Function1<MeItemInfo, Unit> function1M85049Q1;
        Intrinsics.m97802h(it, "it");
        C20606k.f65059a.m85071b(ShortTVHistoryView.TYPE_HISTORY);
        Navigator.m61845x(TheRouter.m61773c("/download/play_history"), baseViewHolder.itemView.getContext(), null, 2, null);
        C20585o c20585o = historyMineItemProvider.f64978e;
        if (c20585o != null && (function1M85049Q1 = c20585o.m85049Q1()) != null) {
            function1M85049Q1.invoke(meItemInfo);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m85001D(HistoryMineItemProvider historyMineItemProvider, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        Object item = historyMineItemProvider.m85002E().getItem(i11);
        if (!(item instanceof VideoDetailPlayBean)) {
            if (item instanceof UGCVideoDetailPlayBean) {
                AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new HistoryMineItemProvider$convert$2$2(item, null), 3, null);
            }
        } else if (C5110g.f17601a.m23911b()) {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new HistoryMineItemProvider$convert$2$1(item, null), 3, null);
        } else {
            VideoDetailPlayBean videoDetailPlayBean = (VideoDetailPlayBean) item;
            historyMineItemProvider.m85003F(view, videoDetailPlayBean.getSubjectType(), videoDetailPlayBean.getSubjectId(), videoDetailPlayBean.getOps());
        }
    }

    /* JADX INFO: renamed from: E */
    private final C20586p m85002E() {
        return (C20586p) this.f64979f.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final void m85003F(View view, Integer num, String str, String str2) {
        Navigator.m61845x(TheRouter.m61773c("/movie/detail").m61852F("subject_type", num != null ? num.intValue() : SubjectType.MOVIE.getValue()).m61857K("id", str).m61857K("ops", str2).m61857K("module_name", "profiledetail"), view.getContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C20586p m85004G() {
        return new C20586p();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo22757b(final BaseViewHolder helper, final MeItemInfo item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        Object data = item.getData();
        MeHistoryInfo meHistoryInfo = data instanceof MeHistoryInfo ? (MeHistoryInfo) data : null;
        if (meHistoryInfo == null) {
            return;
        }
        View itemView = helper.itemView;
        Intrinsics.m97801g(itemView, "itemView");
        AbstractC26006c.m102050c(itemView, 0L, new Function1() { // from class: com.transsion.usercenter.me.adapter.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryMineItemProvider.m85000C(helper, this, item, (View) obj);
            }
        }, 1, null);
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.historyRv);
        recyclerView.setLayoutManager(new LinearLayoutManager(m36338k(), 0, false));
        recyclerView.setAdapter(m85002E());
        m85002E().m36227w1(new InterfaceC27566d() { // from class: com.transsion.usercenter.me.adapter.d
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                HistoryMineItemProvider.m85001D(this.f64990a, baseQuickAdapter, view, i11);
            }
        });
        m85002E().mo36201n1(meHistoryInfo.getList());
        List<Object> list = meHistoryInfo.getList();
        recyclerView.setVisibility(list == null || list.isEmpty() ? 8 : 0);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 4;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.mine_item_history_layout;
    }
}
