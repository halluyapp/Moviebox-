package com.transsion.home.fragment.home;

import android.content.Context;
import android.content.Intent;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.Lifecycle;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.AbstractC5790i;
import com.p282tn.lib.view.GradientLinePagerIndicator;
import com.p282tn.lib.widget.R$color;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.util.AbstractViewOnClickListenerC14560f;
import com.transsion.baseui.widget.CustomPagerTitleView;
import com.transsion.home.R$layout;
import com.transsion.home.bean.AppTab;
import com.transsion.home.bean.HomeTabItem;
import com.transsion.home.bean.HotSearchKeyWord;
import com.transsion.home.bean.HotSubjectEntity;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.home.view.C15537g;
import com.transsion.home.view.CustomTabAdView;
import com.transsion.home.viewmodel.preload.PreloadTrendingData;
import com.transsion.usercenterapi.UpdateResultEvent;
import com.transsion.version.update.UpdateManager;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import m00.AbstractC25775a;
import m00.InterfaceC25777c;
import m00.InterfaceC25778d;
import net.lucode.hackware.magicindicator.R$id;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import p016ak.C0117a;
import p016ak.InterfaceC0118b;
import p552kl.C24696r;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
public final class HomeSearchViewManager {

    /* JADX INFO: renamed from: a */
    private final C24696r f52945a;

    /* JADX INFO: renamed from: b */
    private final HomeFragment f52946b;

    /* JADX INFO: renamed from: c */
    private C15258t f52947c;

    /* JADX INFO: renamed from: d */
    private Context f52948d;

    /* JADX INFO: renamed from: e */
    private final ArrayList f52949e;

    /* JADX INFO: renamed from: f */
    private int f52950f;

    /* JADX INFO: renamed from: g */
    private String f52951g;

    /* JADX INFO: renamed from: h */
    private CommonNavigator f52952h;

    /* JADX INFO: renamed from: i */
    private C15232a f52953i;

    /* JADX INFO: renamed from: j */
    private boolean f52954j;

    /* JADX INFO: renamed from: k */
    private ConstraintLayout.C2308b f52955k;

    /* JADX INFO: renamed from: l */
    private InterfaceC25149n0 f52956l;

    /* JADX INFO: renamed from: m */
    private final Handler f52957m;

    /* JADX INFO: renamed from: com.transsion.home.fragment.home.HomeSearchViewManager$a */
    private final class C15232a extends AbstractC25775a {

        /* JADX INFO: renamed from: b */
        private AppTab f52958b;

        /* JADX INFO: renamed from: com.transsion.home.fragment.home.HomeSearchViewManager$a$a */
        public static final class a extends AbstractViewOnClickListenerC14560f {

            /* JADX INFO: renamed from: e */
            final /* synthetic */ HomeSearchViewManager f52960e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ int f52961f;

            a(HomeSearchViewManager homeSearchViewManager, int i11) {
                this.f52960e = homeSearchViewManager;
                this.f52961f = i11;
            }

            @Override // com.transsion.baseui.util.AbstractViewOnClickListenerC14560f
            /* JADX INFO: renamed from: c */
            public void mo64493c(View view) {
            }

            @Override // com.transsion.baseui.util.AbstractViewOnClickListenerC14560f
            /* JADX INFO: renamed from: d */
            public void mo64494d(View view) {
                this.f52960e.f52945a.f75562s.setCurrentItem(this.f52961f, false);
                this.f52960e.f52945a.f75554k.onPageScrolled(this.f52961f, 0.0f, 0);
            }
        }

        /* JADX INFO: renamed from: com.transsion.home.fragment.home.HomeSearchViewManager$a$b */
        public static final class b extends AbstractViewOnClickListenerC14560f {

            /* JADX INFO: renamed from: e */
            final /* synthetic */ HomeSearchViewManager f52962e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ int f52963f;

            b(HomeSearchViewManager homeSearchViewManager, int i11) {
                this.f52962e = homeSearchViewManager;
                this.f52963f = i11;
            }

            @Override // com.transsion.baseui.util.AbstractViewOnClickListenerC14560f
            /* JADX INFO: renamed from: c */
            public void mo64493c(View view) {
            }

            @Override // com.transsion.baseui.util.AbstractViewOnClickListenerC14560f
            /* JADX INFO: renamed from: d */
            public void mo64494d(View view) {
                this.f52962e.f52945a.f75562s.setCurrentItem(this.f52963f, false);
                this.f52962e.f52945a.f75554k.onPageScrolled(this.f52963f, 0.0f, 0);
            }
        }

        public C15232a(AppTab appTab) {
            this.f52958b = appTab;
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: a */
        public int mo64490a() {
            List<HomeTabItem> homeTabs;
            AppTab appTab = this.f52958b;
            if (appTab == null || (homeTabs = appTab.getHomeTabs()) == null) {
                return 1;
            }
            return homeTabs.size();
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: b */
        public InterfaceC25777c mo64491b(Context context) {
            Intrinsics.m97802h(context, "context");
            Context context2 = HomeSearchViewManager.this.f52948d;
            if (context2 == null) {
                Intrinsics.m97819y("context");
                context2 = null;
            }
            GradientLinePagerIndicator gradientLinePagerIndicator = new GradientLinePagerIndicator(context2);
            gradientLinePagerIndicator.setMode(2);
            gradientLinePagerIndicator.setLineHeight(AbstractC5790i.m27411e(3.0f));
            gradientLinePagerIndicator.setLineWidth(AbstractC5790i.m27411e(24.0f));
            gradientLinePagerIndicator.setRoundRadius(AbstractC5790i.m27411e(1.5f));
            gradientLinePagerIndicator.setStartInterpolator(new AccelerateInterpolator());
            gradientLinePagerIndicator.setEndInterpolator(new DecelerateInterpolator(2.0f));
            int color = AbstractC2397b.getColor(context, R$color.transparent);
            gradientLinePagerIndicator.setColors(color, color, color);
            return gradientLinePagerIndicator;
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: c */
        public InterfaceC25778d mo64492c(Context context, int i11) {
            List<HomeTabItem> homeTabs;
            HomeTabItem homeTabItem;
            List<HomeTabItem> homeTabs2;
            List<HomeTabItem> homeTabs3;
            HomeTabItem homeTabItem2;
            AppTab appTab = this.f52958b;
            String name = null;
            homeTabItem = null;
            HomeTabItem homeTabItem3 = null;
            name = null;
            name = null;
            if (((appTab == null || (homeTabs3 = appTab.getHomeTabs()) == null || (homeTabItem2 = homeTabs3.get(i11)) == null) ? null : homeTabItem2.getNameImage()) != null) {
                Context context2 = HomeSearchViewManager.this.f52948d;
                if (context2 == null) {
                    Intrinsics.m97819y("context");
                    context2 = null;
                }
                CustomTabAdView customTabAdView = new CustomTabAdView(context2);
                customTabAdView.setOnClickListener(new a(HomeSearchViewManager.this, i11));
                AppTab appTab2 = this.f52958b;
                if (appTab2 != null && (homeTabs2 = appTab2.getHomeTabs()) != null) {
                    homeTabItem3 = homeTabs2.get(i11);
                }
                customTabAdView.showData(homeTabItem3);
                return customTabAdView;
            }
            int iM27313a = AbstractC5776a0.m27313a(10.0f);
            Context context3 = HomeSearchViewManager.this.f52948d;
            if (context3 == null) {
                Intrinsics.m97819y("context");
                context3 = null;
            }
            CustomPagerTitleView customPagerTitleView = new CustomPagerTitleView(context3, 17, iM27313a);
            HomeSearchViewManager homeSearchViewManager = HomeSearchViewManager.this;
            AppTab appTab3 = this.f52958b;
            if (appTab3 != null && (homeTabs = appTab3.getHomeTabs()) != null && (homeTabItem = homeTabs.get(i11)) != null) {
                name = homeTabItem.getName();
            }
            customPagerTitleView.setText(name);
            customPagerTitleView.setTextSize(16.0f);
            customPagerTitleView.setOnClickListener(new b(homeSearchViewManager, i11));
            return customPagerTitleView;
        }

        /* JADX INFO: renamed from: h */
        public final void m67986h(AppTab appTab) {
            this.f52958b = appTab;
            m101330e();
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.home.HomeSearchViewManager$b */
    static final class C15233b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f52964a;

        C15233b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f52964a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f52964a;
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
            this.f52964a.invoke(obj);
        }
    }

    public HomeSearchViewManager(C24696r mViewBinding, HomeFragment mFragment) {
        Intrinsics.m97802h(mViewBinding, "mViewBinding");
        Intrinsics.m97802h(mFragment, "mFragment");
        this.f52945a = mViewBinding;
        this.f52946b = mFragment;
        this.f52949e = new ArrayList();
        this.f52956l = AbstractC25153o0.m99079a(C25220y0.m99268b());
        this.f52957m = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.transsion.home.fragment.home.w
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return HomeSearchViewManager.m67949H(this.f53003a, message);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    private final void m67945A(List list) {
        this.f52945a.f75559p.setTextWithString("");
        this.f52949e.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HotSearchKeyWord hotSearchKeyWord = (HotSearchKeyWord) it.next();
            ArrayList arrayList = this.f52949e;
            String title = hotSearchKeyWord.getTitle();
            if (title == null) {
                title = "";
            }
            arrayList.add(title);
        }
        TextSwitcher textSwitcher = this.f52945a.f75556m;
        if (textSwitcher.getChildCount() == 0) {
            textSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: com.transsion.home.fragment.home.d0
                @Override // android.widget.ViewSwitcher.ViewFactory
                public final View makeView() {
                    return HomeSearchViewManager.m67946B(this.f52971a);
                }
            });
        }
        int i11 = this.f52950f;
        if (i11 >= 0 && i11 < this.f52949e.size()) {
            String str = (String) this.f52949e.get(this.f52950f);
            this.f52951g = str;
            textSwitcher.setText(str);
        }
        textSwitcher.setInAnimation(m67967q());
        textSwitcher.setOutAnimation(m67950J());
        m67952N(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final View m67946B(HomeSearchViewManager homeSearchViewManager) {
        return LayoutInflater.from(homeSearchViewManager.f52946b.requireContext()).inflate(R$layout.view_text, (ViewGroup) null);
    }

    /* JADX INFO: renamed from: E */
    private final void m67947E(boolean z11) {
        String str;
        C15537g.f53621a.m68893b(false);
        InterfaceC0118b interfaceC0118b = (InterfaceC0118b) C0117a.f402a.m550a(InterfaceC0118b.class);
        if (z11) {
            if (interfaceC0118b != null) {
                String str2 = this.f52951g;
                String str3 = str2 == null ? "" : str2;
                str = str2 != null ? str2 : "";
                ArrayList arrayList = this.f52949e;
                Context contextRequireContext = this.f52946b.requireContext();
                Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
                interfaceC0118b.mo551a(str3, str, arrayList, contextRequireContext);
            }
        } else if (interfaceC0118b != null) {
            String str4 = this.f52951g;
            str = str4 != null ? str4 : "";
            ArrayList arrayList2 = this.f52949e;
            Context contextRequireContext2 = this.f52946b.requireContext();
            Intrinsics.m97801g(contextRequireContext2, "requireContext(...)");
            interfaceC0118b.mo552b(str, arrayList2, contextRequireContext2);
        }
        m67951K(z11);
    }

    /* JADX INFO: renamed from: F */
    static /* synthetic */ void m67948F(HomeSearchViewManager homeSearchViewManager, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        homeSearchViewManager.m67947E(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final boolean m67949H(HomeSearchViewManager homeSearchViewManager, Message it) {
        String str;
        Intrinsics.m97802h(it, "it");
        if (it.what == 100) {
            homeSearchViewManager.f52950f++;
            if (homeSearchViewManager.f52949e.isEmpty()) {
                str = "";
            } else {
                ArrayList arrayList = homeSearchViewManager.f52949e;
                str = (String) arrayList.get(homeSearchViewManager.f52950f % arrayList.size());
            }
            homeSearchViewManager.f52951g = str;
            homeSearchViewManager.f52945a.f75556m.setText(str);
            m67952N(homeSearchViewManager, false, 1, null);
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    private final AnimationSet m67950J() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
        translateAnimation.setDuration(1000L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000L);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    /* JADX INFO: renamed from: K */
    private final void m67951K(boolean z11) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("module_name", z11 ? "search_button" : "search");
        String str = this.f52951g;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("hot_search_word", str);
        C14450a.f50860a.m65146i(SubTabFragment.INSTANCE.m68282a(HomeTabId.INSTANCE.m67538g()), linkedHashMap);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m67952N(HomeSearchViewManager homeSearchViewManager, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        homeSearchViewManager.m67982M(z11);
    }

    /* JADX INFO: renamed from: m */
    private final void m67964m(boolean z11) {
        LinearLayout linearLayout;
        CommonNavigator commonNavigator = this.f52952h;
        if (commonNavigator != null) {
            int color = AbstractC2397b.getColor(commonNavigator.getContext(), R$color.common_white);
            int color2 = AbstractC2397b.getColor(commonNavigator.getContext(), R$color.transparent);
            LinearLayout linearLayout2 = (LinearLayout) commonNavigator.findViewById(R$id.title_container);
            int childCount = linearLayout2.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = linearLayout2.getChildAt(i11);
                if (childAt instanceof CustomPagerTitleView) {
                    CustomPagerTitleView customPagerTitleView = (CustomPagerTitleView) childAt;
                    customPagerTitleView.setNormalColor(AbstractC2397b.getColor(linearLayout2.getContext(), R$color.white_60));
                    customPagerTitleView.setSelectedColor(color);
                    if (i11 == this.f52946b.getMSelectTabIndex()) {
                        customPagerTitleView.setTextColor(color);
                    } else {
                        customPagerTitleView.setTextColor(AbstractC2397b.getColor(linearLayout2.getContext(), R$color.white_60));
                    }
                    ViewGroup.LayoutParams layoutParams = customPagerTitleView.getLayoutParams();
                    Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.width = -2;
                    layoutParams2.height = -1;
                    customPagerTitleView.setLayoutParams(layoutParams2);
                } else if (childAt instanceof CustomTabAdView) {
                    CustomTabAdView customTabAdView = (CustomTabAdView) childAt;
                    customTabAdView.changeTextColor(AbstractC2397b.getColor(linearLayout2.getContext(), R$color.white_60), AbstractC2397b.getColor(linearLayout2.getContext(), R$color.common_white));
                    if (i11 == this.f52946b.getMSelectTabIndex()) {
                        customTabAdView.setTextColor(color);
                    } else {
                        customTabAdView.setTextColor(AbstractC2397b.getColor(linearLayout2.getContext(), R$color.white_60));
                    }
                }
            }
            CommonNavigator commonNavigator2 = this.f52952h;
            if (commonNavigator2 == null || (linearLayout = (LinearLayout) commonNavigator2.findViewById(R$id.indicator_container)) == null) {
                return;
            }
            int childCount2 = linearLayout.getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = linearLayout.getChildAt(i12);
                if (childAt2 instanceof GradientLinePagerIndicator) {
                    ((GradientLinePagerIndicator) childAt2).setColors(color2, color2, color2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private final void m67965o() {
        if (!UpdateManager.f65568f.m85865a().m85862g()) {
            this.f52945a.f75552i.setVisibility(8);
        } else {
            this.f52945a.f75552i.setVisibility(0);
            this.f52945a.f75552i.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.fragment.home.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeSearchViewManager.m67966p(this.f52969a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m67966p(HomeSearchViewManager homeSearchViewManager, View view) {
        AbstractC25136k.m99058d(homeSearchViewManager.f52956l, null, null, new HomeSearchViewManager$handleUpdateIcon$1$1(homeSearchViewManager, null), 3, null);
    }

    /* JADX INFO: renamed from: q */
    private final AnimationSet m67967q() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(1000L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    /* JADX INFO: renamed from: r */
    private final void m67968r() {
        Intent intent;
        this.f52945a.f75559p.setLocalChangeListener(new Function0() { // from class: com.transsion.home.fragment.home.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeSearchViewManager.m67969s();
            }
        });
        FragmentActivity activity = this.f52946b.getActivity();
        boolean booleanExtra = false;
        if (activity != null && (intent = activity.getIntent()) != null) {
            booleanExtra = intent.getBooleanExtra("extra_language_activity_restart", false);
        }
        if (booleanExtra) {
            PreloadTrendingData.f53717n.m69164a().m69163z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final Unit m67969s() {
        PreloadTrendingData.f53717n.m69164a().m69163z();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: t */
    private final void m67970t() {
        this.f52945a.f75561r.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.fragment.home.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeSearchViewManager.m67971u(this.f53004a, view);
            }
        });
        this.f52945a.f75560q.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.fragment.home.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeSearchViewManager.m67972v(this.f53005a, view);
            }
        });
        this.f52945a.f75550g.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.fragment.home.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeSearchViewManager.m67973w(view);
            }
        });
        m67968r();
        PreloadTrendingData.f53717n.m69164a().m69154H().m14851j(this.f52946b, new C15233b(new Function1() { // from class: com.transsion.home.fragment.home.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeSearchViewManager.m67974x(this.f52965a, (HotSubjectEntity) obj);
            }
        }));
        HomeFragment homeFragment = this.f52946b;
        Function1 function1 = new Function1() { // from class: com.transsion.home.fragment.home.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeSearchViewManager.m67975y(this.f52967a, (UpdateResultEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = UpdateResultEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(homeFragment, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m67971u(HomeSearchViewManager homeSearchViewManager, View view) {
        m67948F(homeSearchViewManager, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final void m67972v(HomeSearchViewManager homeSearchViewManager, View view) {
        homeSearchViewManager.m67947E(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final void m67973w(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final Unit m67974x(HomeSearchViewManager homeSearchViewManager, HotSubjectEntity hotSubjectEntity) {
        List<HotSearchKeyWord> everyoneSearch;
        if (hotSubjectEntity != null && (everyoneSearch = hotSubjectEntity.getEveryoneSearch()) != null) {
            homeSearchViewManager.m67945A(everyoneSearch);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final Unit m67975y(HomeSearchViewManager homeSearchViewManager, UpdateResultEvent it) {
        Intrinsics.m97802h(it, "it");
        homeSearchViewManager.m67965o();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: z */
    private final void m67976z(AppTab appTab) {
        Context context = this.f52948d;
        if (context == null) {
            Intrinsics.m97819y("context");
            context = null;
        }
        this.f52952h = new CommonNavigator(context);
        C15232a c15232a = new C15232a(appTab);
        this.f52953i = c15232a;
        CommonNavigator commonNavigator = this.f52952h;
        if (commonNavigator != null) {
            commonNavigator.setAdapter(c15232a);
        }
        this.f52945a.f75554k.setNavigator(this.f52952h);
    }

    /* JADX INFO: renamed from: C */
    public final void m67977C(AppTab appTab) {
        Object objM112707constructorimpl;
        this.f52948d = this.f52946b.requireContext();
        ViewGroup.LayoutParams layoutParams = this.f52945a.f75561r.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
        ((ViewGroup.MarginLayoutParams) c2308b).topMargin = AbstractC5776a0.m27313a(4.0f) + AbstractC5781d.m27351c();
        this.f52945a.f75561r.setLayoutParams(c2308b);
        this.f52955k = c2308b;
        m67965o();
        m67976z(appTab);
        m67970t();
        try {
            Result.Companion companion = Result.INSTANCE;
            C15258t c15258t = new C15258t();
            this.f52947c = c15258t;
            FrameLayout flGameCenter = this.f52945a.f75546c;
            Intrinsics.m97801g(flGameCenter, "flGameCenter");
            FrameLayout flPhoneCenter = this.f52945a.f75547d;
            Intrinsics.m97801g(flPhoneCenter, "flPhoneCenter");
            AppCompatImageView ivMbLogo = this.f52945a.f75550g;
            Intrinsics.m97801g(ivMbLogo, "ivMbLogo");
            c15258t.m67988b(flGameCenter, flPhoneCenter, ivMbLogo, AbstractC3226v.m14968a(this.f52946b));
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.a.m104901l(C26866a.f81698a, "zxb_icon", "HomeSearchViewManager --> initGameCenter() --> it --> " + thM112710exceptionOrNullimpl, false, 4, null);
        }
        AppCompatImageView ivNovelEnter = this.f52945a.f75551h;
        Intrinsics.m97801g(ivNovelEnter, "ivNovelEnter");
        new C15260v(ivNovelEnter);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m67978D() {
        return this.f52954j;
    }

    /* JADX INFO: renamed from: G */
    public final void m67979G() {
        C15258t c15258t = this.f52947c;
        if (c15258t != null) {
            c15258t.m67989c();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m67980I(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.m97802h(network, "network");
        Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
        if (this.f52949e.isEmpty()) {
            PreloadTrendingData.f53717n.m69164a().m69153G();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m67981L() {
        this.f52957m.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: M */
    public final void m67982M(boolean z11) {
        if (this.f52949e.size() <= 0) {
            return;
        }
        if (this.f52950f >= this.f52949e.size()) {
            this.f52950f %= this.f52949e.size();
        }
        if (z11) {
            m67981L();
            this.f52957m.sendEmptyMessageDelayed(100, 500L);
        } else {
            m67981L();
            this.f52957m.sendEmptyMessageDelayed(100, 5000L);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m67983O(AppTab appTab) {
        Intrinsics.m97802h(appTab, "appTab");
        C15232a c15232a = this.f52953i;
        if (c15232a != null) {
            c15232a.m67986h(appTab);
        }
        if (this.f52954j) {
            m67964m(true);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m67984l(boolean z11) {
        this.f52954j = z11;
        m67964m(z11);
    }

    /* JADX INFO: renamed from: n */
    public final void m67985n() {
        C15258t c15258t = this.f52947c;
        if (c15258t != null) {
            c15258t.m67987a();
        }
    }
}
