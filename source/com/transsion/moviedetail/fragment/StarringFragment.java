package com.transsion.moviedetail.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.moviedetail.activity.MovieDetailActivity;
import com.transsion.moviedetail.adapter.C15920a;
import com.transsion.moviedetail.viewmodel.MovieDetailViewModel;
import com.transsion.moviedetailapi.bean.Staff;
import com.transsion.moviedetailapi.bean.Subject;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gn.C23606n;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import mg.C25825b;
import p765s6.InterfaceC27566d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0004R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m97100d2 = {"Lcom/transsion/moviedetail/fragment/StarringFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lgn/n;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "d0", "(Landroid/view/LayoutInflater;)Lgn/n;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "a", "Lkotlin/Lazy;", "c0", "()Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "movieDetailViewModel", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class StarringFragment extends BaseFragment<C23606n> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy movieDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(MovieDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.moviedetail.fragment.StarringFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.moviedetail.fragment.StarringFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3227v0.c invoke() {
            C3227v0.c defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.m97801g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.StarringFragment$a */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC15972a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC15972a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            RecyclerView recyclerView;
            ViewParent parent;
            RecyclerView recyclerView2;
            ViewTreeObserver viewTreeObserver;
            C23606n mViewBinding = StarringFragment.this.getMViewBinding();
            if (mViewBinding != null && (recyclerView2 = mViewBinding.f72009b) != null && (viewTreeObserver = recyclerView2.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            C23606n mViewBinding2 = StarringFragment.this.getMViewBinding();
            if (mViewBinding2 == null || (recyclerView = mViewBinding2.f72009b) == null || (parent = recyclerView.getParent()) == null) {
                return;
            }
            parent.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.StarringFragment$b */
    static final class C15973b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f54612a;

        C15973b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f54612a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f54612a;
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
            this.f54612a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: c0 */
    private final MovieDetailViewModel m70474c0() {
        return (MovieDetailViewModel) this.movieDetailViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final Unit m70475e0(Fragment fragment, StarringFragment starringFragment, Pair pair) {
        RecyclerView recyclerView;
        ViewTreeObserver viewTreeObserver;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        AppCompatTextView appCompatTextView;
        Subject subject;
        MovieDetailActivity.INSTANCE.m70152a("movie_detail get movie detail data --> it = " + fragment);
        List<Staff> staffList = (pair == null || (subject = (Subject) pair.getSecond()) == null) ? null : subject.getStaffList();
        List<Staff> list = staffList;
        if (list == null || list.isEmpty()) {
            return Unit.f75682a;
        }
        C23606n mViewBinding = starringFragment.getMViewBinding();
        if (mViewBinding != null && (appCompatTextView = mViewBinding.f72010c) != null) {
            appCompatTextView.setText("(" + staffList.size() + ")");
        }
        C23606n mViewBinding2 = starringFragment.getMViewBinding();
        if (mViewBinding2 != null && (recyclerView4 = mViewBinding2.f72009b) != null) {
            recyclerView4.setLayoutManager(new NpaGridLayoutManager(starringFragment.getContext(), 4));
        }
        C23606n mViewBinding3 = starringFragment.getMViewBinding();
        if (mViewBinding3 != null && (recyclerView3 = mViewBinding3.f72009b) != null) {
            recyclerView3.addItemDecoration(new C25825b(AbstractC5776a0.m27313a(4.0f), AbstractC5776a0.m27313a(4.0f), AbstractC5776a0.m27313a(12.0f), AbstractC5776a0.m27313a(12.0f)));
        }
        C15920a c15920a = new C15920a(staffList);
        c15920a.m36227w1(new InterfaceC27566d() { // from class: com.transsion.moviedetail.fragment.i1
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                StarringFragment.m70476f0(baseQuickAdapter, view, i11);
            }
        });
        C23606n mViewBinding4 = starringFragment.getMViewBinding();
        if (mViewBinding4 != null && (recyclerView2 = mViewBinding4.f72009b) != null) {
            recyclerView2.setAdapter(c15920a);
        }
        C23606n mViewBinding5 = starringFragment.getMViewBinding();
        if (mViewBinding5 != null && (recyclerView = mViewBinding5.f72009b) != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(starringFragment.new ViewTreeObserverOnGlobalLayoutListenerC15972a());
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final void m70476f0(BaseQuickAdapter adapter, View v11, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(v11, "v");
        Navigator navigatorM61773c = TheRouter.m61773c("/movie/staff");
        Object item = adapter.getItem(i11);
        Intrinsics.m97800f(item, "null cannot be cast to non-null type com.transsion.moviedetailapi.bean.Staff");
        Navigator.m61845x(navigatorM61773c.m61856J("staff", (Staff) item), v11.getContext(), null, 2, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public C23606n getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23606n c23606nM93398c = C23606n.m93398c(inflater);
        Intrinsics.m97801g(c23606nM93398c, "inflate(...)");
        return c23606nM93398c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        final Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            m70474c0().m70910F().m14851j(this, new C15973b(new Function1() { // from class: com.transsion.moviedetail.fragment.h1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return StarringFragment.m70475e0(parentFragment, this, (Pair) obj);
                }
            }));
        }
    }
}
