package com.transsion.usercenter.p321me;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.InterfaceC3233y0;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.kids.KidsAccountManager;
import com.transsion.baselib.report.C14486e;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.usercenter.p321me.adapter.C20585o;
import com.transsion.usercenter.profile.bean.MeHistoryInfo;
import com.transsion.usercenter.profile.bean.MeItemInfo;
import com.transsion.web.api.WebConstants;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C25220y0;
import ng.AbstractC26006c;
import p329cq.InterfaceC22763a;
import p352dn.InterfaceC22998b;
import p441gz.InterfaceC23704a;
import p441gz.InterfaceC23705b;
import p550kj.C24655b;
import p585lw.C25711h0;
import p665oy.C26749d;
import p665oy.C26750e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u001f\u0010\u0011\u001a\u00020\u00062\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0005J\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0005J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010\u0005J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\u0005J\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\u0005J\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\u0005J\u000f\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010\u0005J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001d\u0010;\u001a\u0004\u0018\u0001078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010B\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006L"}, m97100d2 = {"Lcom/transsion/usercenter/me/MeFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Llw/h0;", "Lgz/b;", "<init>", "()V", "", "s0", "Lcom/transsion/usercenter/profile/bean/MeItemInfo;", WebConstants.FIELD_ITEM, "x0", "(Lcom/transsion/usercenter/profile/bean/MeItemInfo;)V", "n0", "q0", "", "", "historyList", "y0", "(Ljava/util/List;)V", "w0", "Landroid/view/LayoutInflater;", "inflater", "k0", "(Landroid/view/LayoutInflater;)Llw/h0;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "initData", "lazyLoadData", "onResume", "Lcom/transsnet/loginapi/bean/UserInfo;", "user", "onLogin", "(Lcom/transsnet/loginapi/bean/UserInfo;)V", "onLogout", "", "hidden", "onHiddenChanged", "(Z)V", "logResume", "logPause", "onPause", "onDestroy", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Lcom/transsion/usercenter/me/MeViewmodel;", "a", "Lkotlin/Lazy;", "j0", "()Lcom/transsion/usercenter/me/MeViewmodel;", "mViewModel", "Lgz/a;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "getMLoginApi", "()Lgz/a;", "mLoginApi", "Lcom/transsion/usercenter/me/adapter/o;", "c", "Lcom/transsion/usercenter/me/adapter/o;", "mAdapter", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Z", "needResumeRefreshData", "", "e", "J", "getResumeTimeStamp", "()J", "setResumeTimeStamp", "(J)V", "resumeTimeStamp", "f", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class MeFragment extends BaseFragment<C25711h0> implements InterfaceC23705b {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mLoginApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C20585o mAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean needResumeRefreshData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long resumeTimeStamp;

    /* JADX INFO: renamed from: com.transsion.usercenter.me.MeFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final MeFragment m84957a() {
            return new MeFragment();
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.me.MeFragment$b */
    static final class C20561b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f64961a;

        C20561b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f64961a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f64961a;
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
            this.f64961a.invoke(obj);
        }
    }

    public MeFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.usercenter.me.MeFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.mViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(MeViewmodel.class), new Function0<C3231x0>() { // from class: com.transsion.usercenter.me.MeFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.usercenter.me.MeFragment$special$$inlined$viewModels$default$3
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
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.m97801g(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.mLoginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.me.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MeFragment.mLoginApi_delegate$lambda$0();
            }
        });
    }

    private final InterfaceC23704a getMLoginApi() {
        return (InterfaceC23704a) this.mLoginApi.getValue();
    }

    /* JADX INFO: renamed from: j0 */
    private final MeViewmodel m84941j0() {
        return (MeViewmodel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final Unit m84942l0(MeFragment meFragment, List list) {
        C24655b logViewConfig = meFragment.getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        C20585o c20585o = meFragment.mAdapter;
        if (c20585o != null) {
            c20585o.mo36201n1(list);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final Unit m84943m0(MeFragment meFragment, List list) {
        meFragment.m84955y0(list);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23704a mLoginApi_delegate$lambda$0() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: renamed from: n0 */
    private final void m84944n0() {
        Function1 function1 = new Function1() { // from class: com.transsion.usercenter.me.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MeFragment.m84945o0(this.f65057a, (C26750e) obj);
            }
        };
        AppScopeVMlProvider appScopeVMlProvider = AppScopeVMlProvider.INSTANCE;
        FlowEventBus flowEventBus = (FlowEventBus) appScopeVMlProvider.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C26750e.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        Lifecycle.State state = Lifecycle.State.CREATED;
        flowEventBus.observeEvent(this, name, state, C25220y0.m99269c().mo98454r(), false, function1);
        Function1 function2 = new Function1() { // from class: com.transsion.usercenter.me.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MeFragment.m84946p0(this.f65058a, (C26749d) obj);
            }
        };
        FlowEventBus flowEventBus2 = (FlowEventBus) appScopeVMlProvider.getApplicationScopeViewModel(FlowEventBus.class);
        String name2 = C26749d.class.getName();
        Intrinsics.m97801g(name2, "getName(...)");
        flowEventBus2.observeEvent(this, name2, state, C25220y0.m99269c().mo98454r(), false, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final Unit m84945o0(MeFragment meFragment, C26750e value) {
        Intrinsics.m97802h(value, "value");
        meFragment.m84941j0().m84996w();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final Unit m84946p0(MeFragment meFragment, C26749d value) {
        Intrinsics.m97802h(value, "value");
        meFragment.m84941j0().m84996w();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: q0 */
    private final void m84947q0() {
        Function1 function1 = new Function1() { // from class: com.transsion.usercenter.me.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MeFragment.m84948r0(this.f65056a, (KidsAccountManager.C14462a) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = KidsAccountManager.C14462a.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final Unit m84948r0(MeFragment meFragment, KidsAccountManager.C14462a value) {
        Intrinsics.m97802h(value, "value");
        meFragment.lazyLoadData();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: s0 */
    private final void m84949s0() {
        C25711h0 mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            ConstraintLayout root = mViewBinding.getRoot();
            Intrinsics.m97801g(root, "getRoot(...)");
            AbstractC26006c.m102052e(root);
            AppCompatImageView ivQrCode = mViewBinding.f78193c;
            Intrinsics.m97801g(ivQrCode, "ivQrCode");
            AbstractC26006c.m102050c(ivQrCode, 0L, new Function1() { // from class: com.transsion.usercenter.me.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MeFragment.m84950t0(this.f65053a, (View) obj);
                }
            }, 1, null);
            C20585o c20585o = new C20585o(null, new Function1() { // from class: com.transsion.usercenter.me.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MeFragment.m84951u0(this.f65054a, (MeItemInfo) obj);
                }
            }, new Function1() { // from class: com.transsion.usercenter.me.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MeFragment.m84952v0(this.f65055a, (MeItemInfo) obj);
                }
            }, 1, null);
            this.mAdapter = c20585o;
            mViewBinding.f78192b.setAdapter(c20585o);
            mViewBinding.f78192b.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final Unit m84950t0(MeFragment meFragment, View it) {
        Intrinsics.m97802h(it, "it");
        Navigator.m61845x(TheRouter.m61773c("/profile/qr_code"), meFragment.requireContext(), null, 2, null);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final Unit m84951u0(MeFragment meFragment, MeItemInfo item) {
        Intrinsics.m97802h(item, "item");
        meFragment.m84954x0(item);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final Unit m84952v0(MeFragment meFragment, MeItemInfo item) {
        Intrinsics.m97802h(item, "item");
        meFragment.needResumeRefreshData = true;
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: w0 */
    private final void m84953w0() {
        InterfaceC22763a interfaceC22763a = (InterfaceC22763a) TheRouter.m61774d(InterfaceC22763a.class, new Object[0]);
        if (interfaceC22763a != null) {
            Context applicationContext = requireContext().getApplicationContext();
            Intrinsics.m97801g(applicationContext, "getApplicationContext(...)");
            InterfaceC3224u viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.m97801g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            interfaceC22763a.mo76083a(applicationContext, AbstractC3226v.m14968a(viewLifecycleOwner));
        }
    }

    /* JADX INFO: renamed from: x0 */
    private final void m84954x0(MeItemInfo item) {
        if (item.getType() == 5 || item.getType() == 1) {
            this.needResumeRefreshData = true;
        }
    }

    /* JADX INFO: renamed from: y0 */
    private final void m84955y0(List historyList) {
        C20585o c20585o = this.mAdapter;
        if (c20585o == null) {
            return;
        }
        int i11 = 0;
        for (Object obj : c20585o.getData()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            MeItemInfo meItemInfo = (MeItemInfo) obj;
            if (meItemInfo.getType() == 4) {
                Object data = meItemInfo.getData();
                MeHistoryInfo meHistoryInfo = data instanceof MeHistoryInfo ? (MeHistoryInfo) data : null;
                if (meHistoryInfo != null) {
                    meHistoryInfo.setList(historyList);
                } else {
                    meItemInfo.setData(new MeHistoryInfo(historyList));
                }
                c20585o.notifyItemChanged(i11);
                return;
            }
            i11 = i12;
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initData(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.initData(view, savedInstanceState);
        m84941j0().m84995E().m14851j(this, new C20561b(new Function1() { // from class: com.transsion.usercenter.me.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MeFragment.m84942l0(this.f65051a, (List) obj);
            }
        }));
        m84941j0().m84994A().m14851j(this, new C20561b(new Function1() { // from class: com.transsion.usercenter.me.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MeFragment.m84943m0(this.f65052a, (List) obj);
            }
        }));
        m84944n0();
        m84947q0();
        InterfaceC23704a mLoginApi = getMLoginApi();
        if (mLoginApi != null) {
            mLoginApi.mo90392n(this);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        m84949s0();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public C25711h0 getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25711h0 c25711h0M101143c = C25711h0.m101143c(inflater);
        Intrinsics.m97801g(c25711h0M101143c, "inflate(...)");
        return c25711h0M101143c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        m84941j0().m84997x();
        m84941j0().m84998y();
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b != null) {
            interfaceC22998b.mo69865s();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void logPause() {
        super.logPause();
        if (this.resumeTimeStamp != 0) {
            C14486e.f50941a.m65288n("profiledetail", Long.valueOf(SystemClock.elapsedRealtime() - this.resumeTimeStamp), getContext());
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void logResume() {
        super.logResume();
        this.resumeTimeStamp = SystemClock.elapsedRealtime();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        UserInfo userInfoMo90386h;
        String userId = null;
        C24655b c24655b = new C24655b("profiledetail", false, 2, null);
        c24655b.m96844g().put("user_status", "me");
        HashMap mapM96844g = c24655b.m96844g();
        InterfaceC23704a mLoginApi = getMLoginApi();
        if (mLoginApi != null && (userInfoMo90386h = mLoginApi.mo90386h()) != null) {
            userId = userInfoMo90386h.getUserId();
        }
        mapM96844g.put("user_id", String.valueOf(userId));
        return c24655b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC23704a mLoginApi = getMLoginApi();
        if (mLoginApi != null) {
            mLoginApi.mo90391m(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed()) {
            if (hidden) {
                logPause();
            } else {
                lazyLoadData();
                logResume();
            }
        }
        AbstractC14517k.m65410h(null, this, hidden, null, 9, null);
    }

    @Override // p441gz.InterfaceC23705b
    public void onLogin(UserInfo user) {
        Intrinsics.m97802h(user, "user");
        InterfaceC23705b.a.m93655a(this, user);
        lazyLoadData();
    }

    @Override // p441gz.InterfaceC23705b
    public void onLogout() {
        InterfaceC23705b.a.m93656b(this);
        lazyLoadData();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AbstractC14517k.m65414l(null, this, null, 5, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.needResumeRefreshData) {
            this.needResumeRefreshData = false;
            lazyLoadData();
        }
        AbstractC14517k.m65418p(null, this, "visible=" + isVisible(), 1, null);
        m84953w0();
    }

    @Override // p441gz.InterfaceC23705b
    public void onUpdateUserInfo(UserInfo userInfo) {
        InterfaceC23705b.a.m93657c(this, userInfo);
    }
}
