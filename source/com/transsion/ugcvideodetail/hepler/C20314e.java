package com.transsion.ugcvideodetail.hepler;

import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.Fragment;
import androidx.p1004lifecycle.Lifecycle;
import androidx.p1005savedstate.InterfaceC4393e;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.blankj.utilcode.util.AbstractC5790i;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.R$string;
import com.transsion.baseui.util.C14557c;
import com.transsion.baseui.widget.magicindicator.ORCommonNavigator;
import com.transsion.play.detail.widget.PlayDetailResTabTitleView;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.ugcvideodetail.api.bean.UGCVideoDetailParams;
import com.transsion.ugcvideodetail.api.bean.UGCVideoInteractiveInfo;
import com.transsion.ugcvideodetail.fragment.UGCVideoDetailCommentFragment;
import com.transsion.ugcvideodetail.fragment.UGCVideoDetailForYouFragment;
import com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel;
import com.transsion.user.action.sync.event.CommentEvent;
import com.transsion.web.api.WebConstants;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import fk.AbstractC23384a;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C25220y0;
import m00.InterfaceC25777c;
import m00.InterfaceC25778d;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import p551kk.AbstractC24664a;
import p561kx.InterfaceC25451b;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.ugcvideodetail.hepler.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C20314e {

    /* JADX INFO: renamed from: r */
    public static final a f64382r = new a(null);

    /* JADX INFO: renamed from: a */
    private final Fragment f64383a;

    /* JADX INFO: renamed from: b */
    private final UGCVideoDetailViewModel f64384b;

    /* JADX INFO: renamed from: c */
    private final UGCVideo f64385c;

    /* JADX INFO: renamed from: d */
    private final DownloadBean f64386d;

    /* JADX INFO: renamed from: e */
    private final MagicIndicator f64387e;

    /* JADX INFO: renamed from: f */
    private final ViewPager2 f64388f;

    /* JADX INFO: renamed from: g */
    private final String f64389g;

    /* JADX INFO: renamed from: h */
    private final UGCVideoPlayFrom f64390h;

    /* JADX INFO: renamed from: i */
    private final String f64391i;

    /* JADX INFO: renamed from: j */
    private final int f64392j;

    /* JADX INFO: renamed from: k */
    private final AppBarLayout f64393k;

    /* JADX INFO: renamed from: l */
    private ORCommonNavigator f64394l;

    /* JADX INFO: renamed from: m */
    private b f64395m;

    /* JADX INFO: renamed from: n */
    private FragmentStateAdapter f64396n;

    /* JADX INFO: renamed from: o */
    private int f64397o;

    /* JADX INFO: renamed from: p */
    private boolean f64398p;

    /* JADX INFO: renamed from: q */
    private final List f64399q;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.hepler.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.hepler.e$b */
    public final class b extends AbstractC24664a {

        /* JADX INFO: renamed from: b */
        private final ViewPager2 f64400b;

        /* JADX INFO: renamed from: c */
        private final List f64401c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C20314e f64402d;

        public b(C20314e c20314e, ViewPager2 viewPager2, List tabList) {
            Intrinsics.m97802h(tabList, "tabList");
            this.f64402d = c20314e;
            this.f64400b = viewPager2;
            this.f64401c = tabList;
        }

        /* JADX INFO: renamed from: j */
        private final LinearLayout.LayoutParams m84096j() {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            layoutParams.setMarginStart(AbstractC23384a.m92908b(6));
            layoutParams.setMarginEnd(AbstractC23384a.m92908b(2));
            return layoutParams;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public static final void m84097k(int i11, C20314e c20314e, PlayDetailResTabTitleView playDetailResTabTitleView, b bVar, View view) {
            if (i11 == 1 && c20314e.f64398p) {
                c20314e.f64398p = false;
                playDetailResTabTitleView.setDotVisibility(false);
                C14496b.f50966a.m65344b().putBoolean("key_subj_comment_dot", false);
            }
            ViewPager2 viewPager2 = bVar.f64400b;
            if (viewPager2 != null) {
                viewPager2.setCurrentItem(i11, true);
            }
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: a */
        public int mo64490a() {
            return this.f64402d.f64390h == UGCVideoPlayFrom.LOCAL_VIDEO ? this.f64402d.f64399q.size() - 1 : this.f64402d.f64399q.size();
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: b */
        public InterfaceC25777c mo64491b(Context context) {
            Intrinsics.m97802h(context, "context");
            if (this.f64402d.f64390h == UGCVideoPlayFrom.LOCAL_VIDEO) {
                LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context);
                linePagerIndicator.setColors(0);
                return linePagerIndicator;
            }
            LinePagerIndicator linePagerIndicator2 = new LinePagerIndicator(context);
            linePagerIndicator2.setMode(1);
            linePagerIndicator2.setLineHeight(AbstractC5790i.m27411e(3.0f));
            linePagerIndicator2.setStartInterpolator(new AccelerateInterpolator());
            linePagerIndicator2.setEndInterpolator(new DecelerateInterpolator(2.0f));
            linePagerIndicator2.setColors(-1, -1, -1);
            return linePagerIndicator2;
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: c */
        public InterfaceC25778d mo64492c(Context context, final int i11) {
            String strValueOf;
            UGCVideoInteractiveInfo interactiveInfo;
            String commentNum;
            Integer numV;
            Intrinsics.m97802h(context, "context");
            final PlayDetailResTabTitleView playDetailResTabTitleView = new PlayDetailResTabTitleView(context);
            final C20314e c20314e = this.f64402d;
            if (i11 == 1) {
                playDetailResTabTitleView.setDotVisibility(c20314e.f64398p);
                UGCVideo uGCVideo = c20314e.f64385c;
                int iIntValue = (uGCVideo == null || (interactiveInfo = uGCVideo.getInteractiveInfo()) == null || (commentNum = interactiveInfo.getCommentNum()) == null || (numV = StringsKt.m98216v(commentNum)) == null) ? 0 : numV.intValue();
                String str = "";
                if (iIntValue > 99) {
                    strValueOf = "99+";
                } else {
                    strValueOf = iIntValue <= 0 ? "" : String.valueOf(iIntValue);
                }
                Object obj = this.f64401c.get(i11);
                if (strValueOf.length() != 0) {
                    str = "(" + strValueOf + ")";
                }
                playDetailResTabTitleView.setTitle(obj + str);
            } else {
                playDetailResTabTitleView.setTitle((String) this.f64401c.get(i11));
            }
            playDetailResTabTitleView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.hepler.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C20314e.b.m84097k(i11, c20314e, playDetailResTabTitleView, this, view);
                }
            });
            return playDetailResTabTitleView;
        }

        @Override // p551kk.AbstractC24664a
        /* JADX INFO: renamed from: h */
        public LinearLayout.LayoutParams mo76788h(Context context, int i11) {
            Intrinsics.m97802h(context, "context");
            return m84096j();
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.hepler.e$c */
    public static final class c extends ViewPager2.OnPageChangeCallback {
        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i11) {
            super.onPageScrollStateChanged(i11);
            MagicIndicator magicIndicator = C20314e.this.f64387e;
            if (magicIndicator != null) {
                magicIndicator.onPageScrollStateChanged(i11);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            super.onPageScrolled(i11, f11, i12);
            MagicIndicator magicIndicator = C20314e.this.f64387e;
            if (magicIndicator != null) {
                magicIndicator.onPageScrolled(i11, f11, i12);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            super.onPageSelected(i11);
            MagicIndicator magicIndicator = C20314e.this.f64387e;
            if (magicIndicator != null) {
                magicIndicator.onPageSelected(i11);
            }
            C20314e.this.f64397o = i11;
            if (i11 == 1) {
                C20314e.this.m84093t();
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.hepler.e$d */
    public static final class d extends FragmentStateAdapter {
        d(Fragment fragment) {
            super(fragment);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment createFragment(int i11) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            DownloadBean downloadBean;
            UGCVideoBelongToCollection belongToCollection;
            UGCVideo uGCVideo = C20314e.this.f64385c;
            String name = null;
            if (uGCVideo == null || (ops = uGCVideo.getOps()) == null) {
                DownloadBean downloadBean2 = C20314e.this.f64386d;
                if (downloadBean2 != null) {
                    String ops = downloadBean2.getOps();
                    str = ops;
                } else {
                    str = null;
                }
            } else {
                str = ops;
            }
            UGCVideo uGCVideo2 = C20314e.this.f64385c;
            if (uGCVideo2 == null || (ugcVideoId = uGCVideo2.getUgcVideoId()) == null) {
                DownloadBean downloadBean3 = C20314e.this.f64386d;
                if (downloadBean3 != null) {
                    String ugcVideoId = downloadBean3.getUgcVideoId();
                    str2 = ugcVideoId;
                } else {
                    str2 = null;
                }
            } else {
                str2 = ugcVideoId;
            }
            UGCVideo uGCVideo3 = C20314e.this.f64385c;
            String collectionId = (uGCVideo3 == null || (belongToCollection = uGCVideo3.getBelongToCollection()) == null) ? null : belongToCollection.getCollectionId();
            UGCVideo uGCVideo4 = C20314e.this.f64385c;
            if (uGCVideo4 == null || (subjectId = uGCVideo4.getSubjectId()) == null) {
                DownloadBean downloadBean4 = C20314e.this.f64386d;
                if (downloadBean4 != null) {
                    String subjectId = downloadBean4.getSubjectId();
                    str3 = subjectId;
                } else {
                    str3 = null;
                }
            } else {
                str3 = subjectId;
            }
            UGCVideo uGCVideo5 = C20314e.this.f64385c;
            if (uGCVideo5 == null || (ugcVideoType = uGCVideo5.getCategory()) == null) {
                DownloadBean downloadBean5 = C20314e.this.f64386d;
                if (downloadBean5 != null) {
                    String ugcVideoType = downloadBean5.getUgcVideoType();
                    str4 = ugcVideoType;
                } else {
                    str4 = null;
                }
            } else {
                str4 = ugcVideoType;
            }
            UGCVideoDetailParams uGCVideoDetailParams = new UGCVideoDetailParams(str, str2, collectionId, str3, str4);
            if (C20314e.this.f64390h == UGCVideoPlayFrom.ON_LINE_VIDEO) {
                str5 = "TYPE_ONLINE";
            } else {
                DownloadBean downloadBean6 = C20314e.this.f64386d;
                str5 = (downloadBean6 == null || !downloadBean6.isInnerRes()) ? "TYPE_LOCAL_OUT" : "TYPE_LOCAL_INNER";
            }
            if (i11 != 0) {
                UGCVideoDetailCommentFragment uGCVideoDetailCommentFragmentM83870a = UGCVideoDetailCommentFragment.INSTANCE.m83870a();
                C20314e c20314e = C20314e.this;
                uGCVideoDetailCommentFragmentM83870a.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("page_name", c20314e.f64389g), TuplesKt.m97108a("video_params", uGCVideoDetailParams), TuplesKt.m97108a(WebConstants.PAGE_FROM, c20314e.f64389g), TuplesKt.m97108a("from_opt_id", c20314e.f64391i)));
                return uGCVideoDetailCommentFragmentM83870a;
            }
            UGCVideoDetailForYouFragment uGCVideoDetailForYouFragmentM83894a = UGCVideoDetailForYouFragment.INSTANCE.m83894a();
            C20314e c20314e2 = C20314e.this;
            Pair pairM97108a = TuplesKt.m97108a("page_name", c20314e2.f64389g);
            Pair pairM97108a2 = TuplesKt.m97108a("video_params", uGCVideoDetailParams);
            Pair pairM97108a3 = TuplesKt.m97108a(NativeComponentConstants.KEY_COMPONENT_TYPE, str5);
            if (Intrinsics.m97797c(str5, "TYPE_LOCAL_OUT") && (downloadBean = c20314e2.f64386d) != null) {
                name = downloadBean.getName();
            }
            uGCVideoDetailForYouFragmentM83894a.setArguments(AbstractC2411d.m11891b(pairM97108a, pairM97108a2, pairM97108a3, TuplesKt.m97108a("content_name", name), TuplesKt.m97108a("from_opt_id", c20314e2.f64391i)));
            return uGCVideoDetailForYouFragmentM83894a;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return C20314e.this.f64390h == UGCVideoPlayFrom.LOCAL_VIDEO ? C20314e.this.f64399q.size() - 1 : C20314e.this.f64399q.size();
        }
    }

    public C20314e(Fragment fragment, UGCVideoDetailViewModel uGCVideoDetailViewModel, UGCVideo uGCVideo, DownloadBean downloadBean, MagicIndicator magicIndicator, ViewPager2 viewPager2, String str, UGCVideoPlayFrom playFrom, String str2, int i11, AppBarLayout appBarLayout) {
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(playFrom, "playFrom");
        this.f64383a = fragment;
        this.f64384b = uGCVideoDetailViewModel;
        this.f64385c = uGCVideo;
        this.f64386d = downloadBean;
        this.f64387e = magicIndicator;
        this.f64388f = viewPager2;
        this.f64389g = str;
        this.f64390h = playFrom;
        this.f64391i = str2;
        this.f64392j = i11;
        this.f64393k = appBarLayout;
        this.f64397o = RangesKt.m97942l(i11, 0, playFrom == UGCVideoPlayFrom.LOCAL_VIDEO ? 0 : 1);
        this.f64399q = CollectionsKt.m97509o(Utils.m27275a().getString(R$string.for_you), Utils.m27275a().getString(R$string.name_comments));
        m84088n();
        m84091q();
        m84090p();
        m84089o();
    }

    /* JADX INFO: renamed from: m */
    private final void m84087m() {
        ViewPager2 viewPager2 = this.f64388f;
        if (viewPager2 != null) {
            viewPager2.registerOnPageChangeCallback(new c());
        }
        ViewPager2 viewPager3 = this.f64388f;
        if (viewPager3 != null) {
            viewPager3.setCurrentItem(this.f64397o, false);
        }
    }

    /* JADX INFO: renamed from: n */
    private final void m84088n() {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: o */
    private final void m84089o() {
        ORCommonNavigator oRCommonNavigator = new ORCommonNavigator(this.f64383a.requireContext());
        oRCommonNavigator.setFollowTouch(true);
        b bVar = new b(this, this.f64388f, this.f64399q);
        this.f64395m = bVar;
        oRCommonNavigator.setAdapter(bVar);
        this.f64394l = oRCommonNavigator;
        MagicIndicator magicIndicator = this.f64387e;
        if (magicIndicator != null) {
            magicIndicator.setNavigator(oRCommonNavigator);
        }
        MagicIndicator magicIndicator2 = this.f64387e;
        if (magicIndicator2 != null) {
            magicIndicator2.onPageSelected(this.f64397o);
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m84090p() {
        d dVar = new d(this.f64383a);
        this.f64396n = dVar;
        ViewPager2 viewPager2 = this.f64388f;
        if (viewPager2 != null) {
            viewPager2.setAdapter(dVar);
        }
        ViewPager2 viewPager3 = this.f64388f;
        if (viewPager3 != null) {
            viewPager3.setUserInputEnabled(false);
        }
        m84087m();
    }

    /* JADX INFO: renamed from: q */
    private final void m84091q() {
        Fragment fragment = this.f64383a;
        Function1 function1 = new Function1() { // from class: com.transsion.ugcvideodetail.hepler.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C20314e.m84092r(this.f64381a, (CommentEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = CommentEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(fragment, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Unit m84092r(C20314e c20314e, CommentEvent value) {
        String strValueOf;
        UGCVideoInteractiveInfo interactiveInfo;
        String commentNum;
        Integer numV;
        Intrinsics.m97802h(value, "value");
        try {
            UGCVideo uGCVideo = c20314e.f64385c;
            if (Intrinsics.m97797c(uGCVideo != null ? uGCVideo.getUgcVideoId() : null, value.getSubjectId())) {
                UGCVideo uGCVideo2 = c20314e.f64385c;
                int iIntValue = ((uGCVideo2 == null || (interactiveInfo = uGCVideo2.getInteractiveInfo()) == null || (commentNum = interactiveInfo.getCommentNum()) == null || (numV = StringsKt.m98216v(commentNum)) == null) ? 0 : numV.intValue()) + 1;
                String str = "";
                if (iIntValue > 99) {
                    strValueOf = "99+";
                } else {
                    strValueOf = iIntValue <= 0 ? "" : String.valueOf(iIntValue);
                }
                Object obj = c20314e.f64399q.get(1);
                if (strValueOf.length() != 0) {
                    str = "(" + strValueOf + ")";
                }
                String str2 = obj + str;
                ORCommonNavigator oRCommonNavigator = c20314e.f64394l;
                InterfaceC25778d pagerTitleView = oRCommonNavigator != null ? oRCommonNavigator.getPagerTitleView(1) : null;
                PlayDetailResTabTitleView playDetailResTabTitleView = pagerTitleView instanceof PlayDetailResTabTitleView ? (PlayDetailResTabTitleView) pagerTitleView : null;
                if (playDetailResTabTitleView != null) {
                    playDetailResTabTitleView.setTitle(str2);
                }
            }
        } catch (Exception e11) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail " + e11.getMessage(), false, 2, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final void m84093t() {
        AppBarLayout appBarLayout = this.f64393k;
        if (appBarLayout != null) {
            appBarLayout.setExpanded(false, true);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m84094s(boolean z11) {
        if (C14557c.f51100a.m65671a(90991, 500L) || !this.f64383a.isAdded() || this.f64383a.isDetached() || this.f64383a.isRemoving()) {
            return;
        }
        List<InterfaceC4393e> listM14574y0 = this.f64383a.getChildFragmentManager().m14574y0();
        Intrinsics.m97801g(listM14574y0, "getFragments(...)");
        for (InterfaceC4393e interfaceC4393e : listM14574y0) {
            if (interfaceC4393e instanceof InterfaceC25451b) {
                ((InterfaceC25451b) interfaceC4393e).onScreenChange(z11);
            }
        }
    }
}
