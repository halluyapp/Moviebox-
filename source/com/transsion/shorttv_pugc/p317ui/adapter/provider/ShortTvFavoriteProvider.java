package com.transsion.shorttv_pugc.p317ui.adapter.provider;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3233y0;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.p278ts.PsExtractor;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv_pugc.base.widget.NpaLinearLayoutManager;
import com.transsion.shorttv_pugc.bean.OperateItem;
import com.transsion.shorttv_pugc.bean.Pager;
import com.transsion.shorttv_pugc.bean.ShortTVRespData;
import com.transsion.shorttv_pugc.bean.ShortTvItemType;
import com.transsion.shorttv_pugc.bean.Subject;
import com.transsion.shorttv_pugc.p317ui.adapter.ShortTVHeaderViewAdapter;
import com.transsion.shorttv_pugc.viewmodel.ShortTvViewModel;
import gt.C23673b;
import gt.InterfaceC23672a;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import p718qs.C27125a;
import p765s6.InterfaceC27566d;
import p849vt.C28224a;
import p990zt.C29244b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTvFavoriteProvider extends BaseItemProvider {

    /* JADX INFO: renamed from: m */
    public static final C19334a f62031m = new C19334a(null);

    /* JADX INFO: renamed from: e */
    private final Fragment f62032e;

    /* JADX INFO: renamed from: f */
    private final Lazy f62033f;

    /* JADX INFO: renamed from: g */
    private final Lazy f62034g;

    /* JADX INFO: renamed from: h */
    private String f62035h;

    /* JADX INFO: renamed from: i */
    private final boolean f62036i;

    /* JADX INFO: renamed from: j */
    private final int f62037j;

    /* JADX INFO: renamed from: k */
    private ShortTVHeaderViewAdapter f62038k;

    /* JADX INFO: renamed from: l */
    private C23673b f62039l;

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.adapter.provider.ShortTvFavoriteProvider$a */
    public static final class C19334a {
        private C19334a() {
        }

        public /* synthetic */ C19334a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.adapter.provider.ShortTvFavoriteProvider$b */
    public static final class C19335b implements InterfaceC23672a {
        C19335b() {
        }

        @Override // gt.InterfaceC23672a
        /* JADX INFO: renamed from: a */
        public void mo80863a(int i11, long j11, View view) {
            List<Object> data;
            List<Object> data2;
            ShortTVHeaderViewAdapter shortTVHeaderViewAdapter = ShortTvFavoriteProvider.this.f62038k;
            if (((shortTVHeaderViewAdapter == null || (data2 = shortTVHeaderViewAdapter.getData()) == null) ? 0 : data2.size()) <= i11) {
                return;
            }
            ShortTVHeaderViewAdapter shortTVHeaderViewAdapter2 = ShortTvFavoriteProvider.this.f62038k;
            Subject subject = (shortTVHeaderViewAdapter2 == null || (data = shortTVHeaderViewAdapter2.getData()) == null) ? null : (Subject) data.get(i11);
            if (subject != null) {
                ShortTvFavoriteProvider.this.m80855M().m112128a("minitv_explore", subject, i11, j11, ShortTvFavoriteProvider.this.m80854L());
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.adapter.provider.ShortTvFavoriteProvider$c */
    public static final class C19336c extends RecyclerView.AbstractC4213l {
        C19336c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(outRect, "outRect");
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = parent.getAdapter();
            if (adapter != null) {
                if (childAdapterPosition == 0) {
                    if (ShortTvFavoriteProvider.this.f62036i) {
                        outRect.right = ShortTvFavoriteProvider.this.f62037j * 2;
                        return;
                    } else {
                        outRect.left = ShortTvFavoriteProvider.this.f62037j * 2;
                        return;
                    }
                }
                if (childAdapterPosition == adapter.getItemCount() - 1) {
                    outRect.right = ShortTvFavoriteProvider.this.f62037j;
                    outRect.left = ShortTvFavoriteProvider.this.f62037j;
                } else if (ShortTvFavoriteProvider.this.f62036i) {
                    outRect.right = ShortTvFavoriteProvider.this.f62037j;
                } else {
                    outRect.left = ShortTvFavoriteProvider.this.f62037j;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.adapter.provider.ShortTvFavoriteProvider$d */
    static final class C19337d implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f62042a;

        C19337d(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f62042a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f62042a;
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
            this.f62042a.invoke(obj);
        }
    }

    public ShortTvFavoriteProvider(final Fragment fragment) {
        Intrinsics.m97802h(fragment, "fragment");
        this.f62032e = fragment;
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.shorttv_pugc.ui.adapter.provider.ShortTvFavoriteProvider$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return fragment;
            }
        };
        this.f62033f = FragmentViewModelLazyKt.m14626a(fragment, Reflection.m97823b(ShortTvViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.shorttv_pugc.ui.adapter.provider.ShortTvFavoriteProvider$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.shorttv_pugc.ui.adapter.provider.ShortTvFavoriteProvider$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                Object objInvoke = function0.invoke();
                InterfaceC3208m interfaceC3208m = objInvoke instanceof InterfaceC3208m ? (InterfaceC3208m) objInvoke : null;
                C3227v0.c defaultViewModelProviderFactory = interfaceC3208m != null ? interfaceC3208m.getDefaultViewModelProviderFactory() : null;
                if (defaultViewModelProviderFactory == null) {
                    defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.m97801g(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.f62034g = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.ui.adapter.provider.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvFavoriteProvider.m80858P();
            }
        });
        this.f62035h = "0";
        this.f62036i = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        this.f62037j = AbstractC5776a0.m27313a(8.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final Unit m80851I(ShortTvFavoriteProvider shortTvFavoriteProvider, ShortTVRespData shortTVRespData) {
        String nextPage;
        if (shortTVRespData == null) {
            return Unit.f75682a;
        }
        Pager pager = shortTVRespData.getPager();
        if (pager == null || (nextPage = pager.getNextPage()) == null) {
            nextPage = "0";
        }
        shortTvFavoriteProvider.f62035h = nextPage;
        shortTvFavoriteProvider.m80859Q(shortTVRespData.getItems());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final void m80852J(ShortTvFavoriteProvider shortTvFavoriteProvider, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        if (item instanceof Subject) {
            Subject subject = (Subject) item;
            shortTvFavoriteProvider.m80855M().m112129b("minitv_explore", subject, i11, shortTvFavoriteProvider.m80854L());
            shortTvFavoriteProvider.m80857O(subject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final void m80853K(BaseViewHolder baseViewHolder, View view) {
        C26866a.a.m104899g(C26866a.f81698a, "Click view all", false, 2, null);
        Navigator.m61845x(TheRouter.m61773c(C27125a.f82236a.m105545c()), baseViewHolder.itemView.getContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public final String m80854L() {
        return "collection";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final C29244b m80855M() {
        return (C29244b) this.f62034g.getValue();
    }

    /* JADX INFO: renamed from: N */
    private final ShortTvViewModel m80856N() {
        return (ShortTvViewModel) this.f62033f.getValue();
    }

    /* JADX INFO: renamed from: O */
    private final void m80857O(Subject subject) {
        C28224a c28224a = C28224a.f86828a;
        Context contextM36338k = m36338k();
        Intrinsics.m97800f(contextM36338k, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        c28224a.m109403a((FragmentActivity) contextM36338k, "minitv_explore", subject.getOps(), (PsExtractor.AUDIO_STREAM & 8) != 0 ? null : "download_subject", (PsExtractor.AUDIO_STREAM & 16) != 0 ? false : false, (PsExtractor.AUDIO_STREAM & 32) != 0 ? null : subject, (PsExtractor.AUDIO_STREAM & 64) != 0 ? null : null, (PsExtractor.AUDIO_STREAM & 128) != 0 ? Boolean.FALSE : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C29244b m80858P() {
        return new C29244b();
    }

    /* JADX INFO: renamed from: Q */
    private final void m80859Q(List list) {
        ShortTVHeaderViewAdapter shortTVHeaderViewAdapter;
        C26866a.a.m104898f(C26866a.f81698a, "ShortTvFavorite", "updateList, size:" + (list != null ? Integer.valueOf(list.size()) : null), false, 4, null);
        List list2 = list;
        if (list2 == null || list2.isEmpty() || (shortTVHeaderViewAdapter = this.f62038k) == null) {
            return;
        }
        shortTVHeaderViewAdapter.mo36201n1(list2);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo22757b(final BaseViewHolder helper, OperateItem item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        ((TextView) helper.getView(R$id.tv_title)).setText(Utils.m27275a().getString(R$string.short_tv_my_list));
        m80856N().m81435x().m14851j(this.f62032e, new C19337d(new Function1() { // from class: com.transsion.shorttv_pugc.ui.adapter.provider.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvFavoriteProvider.m80851I(this.f62043a, (ShortTVRespData) obj);
            }
        }));
        this.f62039l = new C23673b(0.6f, new C19335b(), false, 4, null);
        ShortTVHeaderViewAdapter shortTVHeaderViewAdapter = new ShortTVHeaderViewAdapter(null, 1, null);
        shortTVHeaderViewAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.shorttv_pugc.ui.adapter.provider.b
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ShortTvFavoriteProvider.m80852J(this.f62044a, baseQuickAdapter, view, i11);
            }
        });
        this.f62038k = shortTVHeaderViewAdapter;
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.recycler_view);
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(new C19336c());
        recyclerView.setAdapter(this.f62038k);
        C23673b c23673b = this.f62039l;
        Intrinsics.m97799e(c23673b);
        recyclerView.addOnScrollListener(c23673b);
        ((TextView) helper.getView(R$id.tv_view_all)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.ui.adapter.provider.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTvFavoriteProvider.m80853K(helper, view);
            }
        });
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return ShortTvItemType.FAVORITE.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.pugc_short_tv_layout_favorite;
    }
}
