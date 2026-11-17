package com.transsion.home.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import ck.C5127x;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.GradientLinePagerIndicator;
import com.p282tn.lib.view.TitleLayout;
import com.p282tn.lib.widget.R$color;
import com.therouter.TheRouter;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baselib.report.InterfaceC14488g;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.baseui.util.AbstractViewOnClickListenerC14560f;
import com.transsion.baseui.widget.CustomPagerTitleView;
import com.transsion.home.R$mipmap;
import com.transsion.home.R$string;
import com.transsion.home.activity.MovieFilterActivity;
import com.transsion.home.bean.AppTab;
import com.transsion.home.bean.HomeTabItem;
import com.transsion.home.fragment.tab.MovieFragment;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.home.p1000enum.HomeTabType;
import com.transsion.home.viewmodel.preload.PreloadTrendingData;
import com.transsion.usercenter.setting.labelsfeedback.AbstractC20825a;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m00.AbstractC25775a;
import m00.InterfaceC25777c;
import m00.InterfaceC25778d;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import ng.AbstractC26006c;
import p016ak.C0117a;
import p016ak.InterfaceC0118b;
import p550kj.C24655b;
import p552kl.C24669c;
import sh.C27621h;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0005J\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020 8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, m97100d2 = {"Lcom/transsion/home/activity/MovieFilterActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Lkl/c;", "Lcom/transsion/baselib/report/g;", "<init>", "()V", "", "g0", "", "tabId", "", "l0", "(Ljava/lang/Integer;)Z", "j0", "k0", "o0", "(I)V", "e0", "(I)I", "n0", "m0", "isTranslucent", "()Z", "isStatusDark", "f0", "()Lkl/c;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "initView", "retryLoadData", "", "getPageName", "()Ljava/lang/String;", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "a", "I", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Z", "showViewPager", "c", "Ljava/lang/String;", "tabCode", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "mFilterJson", "", "Lcom/transsion/home/bean/HomeTabItem;", "e", "Ljava/util/List;", "tabItems", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class MovieFilterActivity extends BaseActivity<C24669c> implements InterfaceC14488g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int tabId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public String mFilterJson;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean showViewPager = true;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public String tabCode = "";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List tabItems = new ArrayList();

    /* JADX INFO: renamed from: com.transsion.home.activity.MovieFilterActivity$a */
    public static final class C14832a extends FragmentStateAdapter {
        C14832a() {
            super(MovieFilterActivity.this);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment createFragment(int i11) {
            MovieFilterActivity movieFilterActivity = MovieFilterActivity.this;
            int i12 = movieFilterActivity.tabId;
            Integer tabId = ((HomeTabItem) movieFilterActivity.tabItems.get(i11)).getTabId();
            String str = (tabId != null && i12 == tabId.intValue()) ? MovieFilterActivity.this.mFilterJson : null;
            MovieFragment.Companion companion = MovieFragment.INSTANCE;
            Integer tabId2 = ((HomeTabItem) MovieFilterActivity.this.tabItems.get(i11)).getTabId();
            return companion.m68203a(tabId2 != null ? tabId2.intValue() : 2, true, str, ((HomeTabItem) MovieFilterActivity.this.tabItems.get(i11)).getTabCode());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return MovieFilterActivity.this.tabItems.size();
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.activity.MovieFilterActivity$b */
    public static final class C14833b extends ViewPager2.OnPageChangeCallback {
        C14833b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i11) {
            super.onPageScrollStateChanged(i11);
            ((C24669c) MovieFilterActivity.this.getMViewBinding()).f75376b.onPageScrollStateChanged(i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            super.onPageScrolled(i11, f11, i12);
            ((C24669c) MovieFilterActivity.this.getMViewBinding()).f75376b.onPageScrolled(i11, f11, i12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            super.onPageSelected(i11);
            ((C24669c) MovieFilterActivity.this.getMViewBinding()).f75376b.onPageSelected(i11);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.activity.MovieFilterActivity$c */
    public static final class C14834c extends AbstractC25775a {

        /* JADX INFO: renamed from: com.transsion.home.activity.MovieFilterActivity$c$a */
        public static final class a extends AbstractViewOnClickListenerC14560f {

            /* JADX INFO: renamed from: e */
            final /* synthetic */ MovieFilterActivity f51855e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ int f51856f;

            a(MovieFilterActivity movieFilterActivity, int i11) {
                this.f51855e = movieFilterActivity;
                this.f51856f = i11;
            }

            @Override // com.transsion.baseui.util.AbstractViewOnClickListenerC14560f
            /* JADX INFO: renamed from: c */
            public void mo64493c(View view) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.transsion.baseui.util.AbstractViewOnClickListenerC14560f
            /* JADX INFO: renamed from: d */
            public void mo64494d(View view) {
                ((C24669c) this.f51855e.getMViewBinding()).f75378d.setCurrentItem(this.f51856f, false);
                ((C24669c) this.f51855e.getMViewBinding()).f75376b.onPageScrolled(this.f51856f, 0.0f, 0);
            }
        }

        C14834c() {
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: a */
        public int mo64490a() {
            return MovieFilterActivity.this.tabItems.size();
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: b */
        public InterfaceC25777c mo64491b(Context context) {
            GradientLinePagerIndicator gradientLinePagerIndicator = new GradientLinePagerIndicator(MovieFilterActivity.this);
            MovieFilterActivity movieFilterActivity = MovieFilterActivity.this;
            gradientLinePagerIndicator.setMode(2);
            gradientLinePagerIndicator.setLineHeight(AbstractC20825a.m85772b(3));
            gradientLinePagerIndicator.setLineWidth(AbstractC20825a.m85772b(24));
            gradientLinePagerIndicator.setRoundRadius(AbstractC20825a.m85771a(1.5f));
            gradientLinePagerIndicator.setStartInterpolator(new AccelerateInterpolator());
            gradientLinePagerIndicator.setEndInterpolator(new DecelerateInterpolator(2.0f));
            int color = AbstractC2397b.getColor(movieFilterActivity, R$color.white);
            gradientLinePagerIndicator.setColors(color, color, color);
            return gradientLinePagerIndicator;
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: c */
        public InterfaceC25778d mo64492c(Context context, int i11) {
            CustomPagerTitleView customPagerTitleView = new CustomPagerTitleView(MovieFilterActivity.this, 17, AbstractC20825a.m85772b(12));
            MovieFilterActivity movieFilterActivity = MovieFilterActivity.this;
            customPagerTitleView.setText(((HomeTabItem) movieFilterActivity.tabItems.get(i11)).getName());
            customPagerTitleView.setOnClickListener(new a(movieFilterActivity, i11));
            return customPagerTitleView;
        }
    }

    /* JADX INFO: renamed from: e0 */
    private final int m66675e0(int tabId) {
        int size = this.tabItems.size();
        for (int i11 = 0; i11 < size; i11++) {
            Integer tabId2 = ((HomeTabItem) this.tabItems.get(i11)).getTabId();
            if (tabId2 != null && tabId2.intValue() == tabId) {
                return i11;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0 */
    private final void m66676g0() {
        List<HomeTabItem> homeTabs;
        PreloadTrendingData.C15566a c15566a = PreloadTrendingData.f53717n;
        AppTab appTab = (AppTab) c15566a.m69164a().m69151D().m14847f();
        if (appTab == null) {
            appTab = (AppTab) c15566a.m69164a().m69150C().m14847f();
        }
        this.tabItems.clear();
        if (!this.showViewPager || !m66681l0(Integer.valueOf(this.tabId))) {
            this.tabItems.add(new HomeTabItem("", Integer.valueOf(this.tabId), "", "", this.tabCode, null, null, null, null, 480, null));
            MagicIndicator magicIndicator = ((C24669c) getMViewBinding()).f75376b;
            Intrinsics.m97801g(magicIndicator, "magicIndicator");
            AbstractC26006c.m102054g(magicIndicator);
            return;
        }
        if (appTab == null || (homeTabs = appTab.getHomeTabs()) == null) {
            return;
        }
        for (HomeTabItem homeTabItem : homeTabs) {
            if (Intrinsics.m97797c(homeTabItem != null ? homeTabItem.getType() : null, HomeTabType.SUB_OPERATION.getValue()) && m66681l0(homeTabItem.getTabId())) {
                this.tabItems.add(homeTabItem);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final void m66677h0(MovieFilterActivity movieFilterActivity, View view) {
        InterfaceC0118b interfaceC0118b = (InterfaceC0118b) C0117a.f402a.m550a(InterfaceC0118b.class);
        if (interfaceC0118b != null) {
            interfaceC0118b.mo553c("", movieFilterActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final void m66678i0(MovieFilterActivity movieFilterActivity, View view) {
        movieFilterActivity.m66683n0();
        movieFilterActivity.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    private final void m66679j0() {
        ((C24669c) getMViewBinding()).f75378d.setAdapter(new C14832a());
        ((C24669c) getMViewBinding()).f75378d.registerOnPageChangeCallback(new C14833b());
        m66684o0(this.tabId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    private final void m66680k0() {
        MagicIndicator magicIndicator = ((C24669c) getMViewBinding()).f75376b;
        CommonNavigator commonNavigator = new CommonNavigator(this);
        commonNavigator.setAdapter(new C14834c());
        magicIndicator.setNavigator(commonNavigator);
    }

    /* JADX INFO: renamed from: l0 */
    private final boolean m66681l0(Integer tabId) {
        HomeTabId.Companion companion = HomeTabId.INSTANCE;
        int iM67535d = companion.m67535d();
        if (tabId == null || tabId.intValue() != iM67535d) {
            int iM67537f = companion.m67537f();
            if (tabId == null || tabId.intValue() != iM67537f) {
                int iM67534b = companion.m67534b();
                if (tabId == null || tabId.intValue() != iM67534b) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m0 */
    private final void m66682m0() {
        HashMap map = new HashMap();
        map.put("event_type", "back_browse");
        map.put("tabId", String.valueOf(this.tabId));
        C14450a.f50860a.m65142e(getPageName(), map);
    }

    /* JADX INFO: renamed from: n0 */
    private final void m66683n0() {
        HashMap map = new HashMap();
        map.put("event_type", "back_click");
        map.put("tabId", String.valueOf(this.tabId));
        C14450a.f50860a.m65143f(getPageName(), map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    private final void m66684o0(int tabId) {
        ((C24669c) getMViewBinding()).f75378d.setCurrentItem(m66675e0(tabId), false);
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public C24669c getViewBinding() {
        C24669c c24669cM96906c = C24669c.m96906c(getLayoutInflater());
        Intrinsics.m97801g(c24669cM96906c, "inflate(...)");
        return c24669cM96906c;
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public String getPageName() {
        return "movie_filter_page";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity
    public void initView(Bundle savedInstanceState) {
        TitleLayout titleLayout = ((C24669c) getMViewBinding()).f75377c;
        titleLayout.setRightView(R$mipmap.ic_search_movie, new View.OnClickListener() { // from class: fl.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MovieFilterActivity.m66677h0(this.f71354a, view);
            }
        });
        titleLayout.setLeftOnclick(new View.OnClickListener() { // from class: fl.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MovieFilterActivity.m66678i0(this.f71355a, view);
            }
        });
        m66682m0();
        String string = getString(R$string.filter);
        Intrinsics.m97801g(string, "getString(...)");
        titleLayout.setTitleText(string);
        C27621h c27621h = C27621h.f84745a;
        Context context = titleLayout.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        titleLayout.setPadding(0, c27621h.m107454d(context), 0, 0);
        m66676g0();
        m66680k0();
        m66679j0();
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return !C5127x.f17620a.m23969a();
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public C24655b newLogViewConfig() {
        C24655b c24655b = new C24655b(getPageName(), false, 2, null);
        c24655b.m96849l(true);
        return c24655b;
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InvocationTargetException {
        TheRouter.m61781l(this);
        super.onCreate(savedInstanceState);
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public void retryLoadData() {
    }
}
