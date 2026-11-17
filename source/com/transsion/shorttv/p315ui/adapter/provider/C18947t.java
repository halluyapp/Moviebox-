package com.transsion.shorttv.p315ui.adapter.provider;

import android.view.View;
import android.widget.TextView;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.bean.OperateItem;
import com.transsion.shorttv.bean.ShortTvItemType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.shorttv.ui.adapter.provider.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C18947t extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    public static final a f61063e = new a(null);

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.adapter.provider.t$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m79630C(BaseViewHolder baseViewHolder, View view) {
        C26866a.a.m104898f(C26866a.f81698a, "ShortTVFilter", "click Latest", false, 4, null);
        Navigator.m61845x(TheRouter.m61773c("/home/playlist").m61857K("label", "fresh-releases-list").m61857K("category", "TVSHOW").m61857K("recType", "OPT").m61857K("topIds", null), baseViewHolder.itemView.getContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m79631D(BaseViewHolder baseViewHolder, View view) {
        C26866a.a.m104898f(C26866a.f81698a, "ShortTVFilter", "click Hottest", false, 4, null);
        Navigator.m61845x(TheRouter.m61773c("/home/playlist").m61857K("label", "must-watch-list").m61857K("category", "TVSHOW").m61857K("recType", "OPT").m61857K("topIds", null), baseViewHolder.itemView.getContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m79632E(BaseViewHolder baseViewHolder, View view) {
        Navigator.m61845x(TheRouter.m61773c("/home/movieFilter").m61852F("tabId", 7).m61857K("tabCode", "ShortTV").m61872z("showViewPager", false), baseViewHolder.itemView.getContext(), null, 2, null);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo22757b(final BaseViewHolder helper, OperateItem item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        ((TextView) helper.getView(R$id.iv_latest)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.adapter.provider.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C18947t.m79630C(helper, view);
            }
        });
        ((TextView) helper.getView(R$id.iv_hottest)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.adapter.provider.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C18947t.m79631D(helper, view);
            }
        });
        ((TextView) helper.getView(R$id.iv_all)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.adapter.provider.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C18947t.m79632E(helper, view);
            }
        });
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return ShortTvItemType.FILTER.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.short_tv_layout_category;
    }
}
