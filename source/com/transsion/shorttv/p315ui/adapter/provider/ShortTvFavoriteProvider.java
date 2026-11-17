package com.transsion.shorttv.p315ui.adapter.provider;

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
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv.base.widget.NpaLinearLayoutManager;
import com.transsion.shorttv.bean.OperateItem;
import com.transsion.shorttv.bean.Pager;
import com.transsion.shorttv.bean.ShortTVRespData;
import com.transsion.shorttv.bean.ShortTvItemType;
import com.transsion.shorttv.bean.Subject;
import com.transsion.shorttv.p315ui.adapter.ShortTVHeaderViewAdapter;
import com.transsion.shorttv.viewmodel.ShortTvViewModel;
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
import p330cs.C22776b;
import p330cs.InterfaceC22775a;
import p718qs.C27125a;
import p765s6.InterfaceC27566d;
import p919xs.C28653a;
import pg.C26866a;
import ss.C27644a;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTvFavoriteProvider extends BaseItemProvider {

    /* JADX INFO: renamed from: m */
    public static final C18918a f61012m = new C18918a(null);

    /* JADX INFO: renamed from: e */
    private final Fragment f61013e;

    /* JADX INFO: renamed from: f */
    private final Lazy f61014f;

    /* JADX INFO: renamed from: g */
    private final Lazy f61015g;

    /* JADX INFO: renamed from: h */
    private String f61016h;

    /* JADX INFO: renamed from: i */
    private final boolean f61017i;

    /* JADX INFO: renamed from: j */
    private final int f61018j;

    /* JADX INFO: renamed from: k */
    private ShortTVHeaderViewAdapter f61019k;

    /* JADX INFO: renamed from: l */
    private C22776b f61020l;

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.adapter.provider.ShortTvFavoriteProvider$a */
    public static final class C18918a {
        private C18918a() {
        }

        public /* synthetic */ C18918a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.adapter.provider.ShortTvFavoriteProvider$b */
    public static final class C18919b implements InterfaceC22775a {
        C18919b() {
        }

        @Override // p330cs.InterfaceC22775a
        /* JADX INFO: renamed from: a */
        public void mo78681a(int i11, long j11, View view) {
            List<Object> data;
            List<Object> data2;
            ShortTVHeaderViewAdapter shortTVHeaderViewAdapter = ShortTvFavoriteProvider.this.f61019k;
            if (((shortTVHeaderViewAdapter == null || (data2 = shortTVHeaderViewAdapter.getData()) == null) ? 0 : data2.size()) <= i11) {
                return;
            }
            ShortTVHeaderViewAdapter shortTVHeaderViewAdapter2 = ShortTvFavoriteProvider.this.f61019k;
            Subject subject = (shortTVHeaderViewAdapter2 == null || (data = shortTVHeaderViewAdapter2.getData()) == null) ? null : (Subject) data.get(i11);
            if (subject != null) {
                ShortTvFavoriteProvider.this.m79576M().m110418a("minitv_explore", subject, i11, Long.valueOf(j11), ShortTvFavoriteProvider.this.m79575L());
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.adapter.provider.ShortTvFavoriteProvider$c */
    public static final class C18920c extends RecyclerView.AbstractC4213l {
        C18920c() {
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
                    if (ShortTvFavoriteProvider.this.f61017i) {
                        outRect.right = ShortTvFavoriteProvider.this.f61018j * 2;
                        return;
                    } else {
                        outRect.left = ShortTvFavoriteProvider.this.f61018j * 2;
                        return;
                    }
                }
                if (childAdapterPosition == adapter.getItemCount() - 1) {
                    outRect.right = ShortTvFavoriteProvider.this.f61018j;
                    outRect.left = ShortTvFavoriteProvider.this.f61018j;
                } else if (ShortTvFavoriteProvider.this.f61017i) {
                    outRect.right = ShortTvFavoriteProvider.this.f61018j;
                } else {
                    outRect.left = ShortTvFavoriteProvider.this.f61018j;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.adapter.provider.ShortTvFavoriteProvider$d */
    static final class C18921d implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f61023a;

        C18921d(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f61023a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f61023a;
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
            this.f61023a.invoke(obj);
        }
    }

    public ShortTvFavoriteProvider(final Fragment fragment) {
        Intrinsics.m97802h(fragment, "fragment");
        this.f61013e = fragment;
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.shorttv.ui.adapter.provider.ShortTvFavoriteProvider$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return fragment;
            }
        };
        this.f61014f = FragmentViewModelLazyKt.m14626a(fragment, Reflection.m97823b(ShortTvViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.shorttv.ui.adapter.provider.ShortTvFavoriteProvider$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.shorttv.ui.adapter.provider.ShortTvFavoriteProvider$special$$inlined$viewModels$default$3
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
        this.f61015g = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.ui.adapter.provider.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvFavoriteProvider.m79579P();
            }
        });
        this.f61016h = "0";
        this.f61017i = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        this.f61018j = AbstractC5776a0.m27313a(8.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final Unit m79572I(ShortTvFavoriteProvider shortTvFavoriteProvider, ShortTVRespData shortTVRespData) {
        String nextPage;
        if (shortTVRespData == null) {
            return Unit.f75682a;
        }
        Pager pager = shortTVRespData.getPager();
        if (pager == null || (nextPage = pager.getNextPage()) == null) {
            nextPage = "0";
        }
        shortTvFavoriteProvider.f61016h = nextPage;
        shortTvFavoriteProvider.m79580Q(shortTVRespData.getItems());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final void m79573J(ShortTvFavoriteProvider shortTvFavoriteProvider, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        if (item instanceof Subject) {
            Subject subject = (Subject) item;
            shortTvFavoriteProvider.m79576M().m110419c("minitv_explore", subject, i11, shortTvFavoriteProvider.m79575L());
            shortTvFavoriteProvider.m79578O(subject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final void m79574K(BaseViewHolder baseViewHolder, View view) {
        C26866a.a.m104899g(C26866a.f81698a, "Click view all", false, 2, null);
        Navigator.m61845x(TheRouter.m61773c(C27125a.f82236a.m105545c()), baseViewHolder.itemView.getContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public final String m79575L() {
        return "collection";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final C28653a m79576M() {
        return (C28653a) this.f61015g.getValue();
    }

    /* JADX INFO: renamed from: N */
    private final ShortTvViewModel m79577N() {
        return (ShortTvViewModel) this.f61014f.getValue();
    }

    /* JADX INFO: renamed from: O */
    private final void m79578O(Subject subject) {
        C27644a c27644a = C27644a.f84793a;
        Context contextM36338k = m36338k();
        Intrinsics.m97800f(contextM36338k, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        c27644a.m107539a((FragmentActivity) contextM36338k, "minitv_explore", subject.getOps(), (64 & 8) != 0 ? null : "download_subject", (64 & 16) != 0 ? false : false, (64 & 32) != 0 ? null : subject, (64 & 64) != 0 ? null : null, (64 & 128) != 0 ? Boolean.FALSE : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C28653a m79579P() {
        return new C28653a();
    }

    /* JADX INFO: renamed from: Q */
    private final void m79580Q(List list) {
        ShortTVHeaderViewAdapter shortTVHeaderViewAdapter;
        C26866a.a.m104898f(C26866a.f81698a, "ShortTvFavorite", "updateList, size:" + (list != null ? Integer.valueOf(list.size()) : null), false, 4, null);
        List list2 = list;
        if (list2 == null || list2.isEmpty() || (shortTVHeaderViewAdapter = this.f61019k) == null) {
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
        m79577N().m80373c0().m14851j(this.f61013e, new C18921d(new Function1() { // from class: com.transsion.shorttv.ui.adapter.provider.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvFavoriteProvider.m79572I(this.f61032a, (ShortTVRespData) obj);
            }
        }));
        this.f61020l = new C22776b(0.6f, new C18919b(), false, 4, null);
        ShortTVHeaderViewAdapter shortTVHeaderViewAdapter = new ShortTVHeaderViewAdapter(null, 1, null);
        shortTVHeaderViewAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.shorttv.ui.adapter.provider.e
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ShortTvFavoriteProvider.m79573J(this.f61033a, baseQuickAdapter, view, i11);
            }
        });
        this.f61019k = shortTVHeaderViewAdapter;
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.recycler_view);
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(new C18920c());
        recyclerView.setAdapter(this.f61019k);
        C22776b c22776b = this.f61020l;
        Intrinsics.m97799e(c22776b);
        recyclerView.addOnScrollListener(c22776b);
        ((TextView) helper.getView(R$id.tv_view_all)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.adapter.provider.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTvFavoriteProvider.m79574K(helper, view);
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
        return R$layout.short_tv_layout_favorite;
    }
}
