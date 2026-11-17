package com.transsion.postdetail.layer.local;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3192e;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.InterfaceC3194f;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.viewpager2.widget.ViewPager2;
import bo.AbstractC4864a;
import com.avery.subtitle.widget.SimpleSubtitleView;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.AbstractC5806y;
import com.p282tn.lib.view.SecondariesSeekBar;
import com.p282tn.lib.widget.R$mipmap;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.R$string;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.p285ad.scene.C14047a;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.p1003enum.ScaleMode;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.p306ui.fragment.LocalVideoMiddleSeriesListFragment;
import com.transsion.postdetail.p306ui.view.LocalVideoMiddleHeaderView;
import com.transsion.publish.view.PublishStateView;
import com.transsion.videofloat.bean.FloatActionType;
import com.transsnet.downloader.manager.DownloadEsHelper;
import fo.C23403e;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import li.C25639b;
import net.lucode.hackware.magicindicator.MagicIndicator;
import ng.AbstractC26006c;
import p743rh.C27287m;
import p844vo.C28180y;
import p844vo.C28181z;
import p914xn.C28623e;
import p914xn.C28625g;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class LocalVideoMiddleLayer extends AbstractC16785a0 {

    /* JADX INFO: renamed from: k0 */
    public static final C16782a f56460k0 = new C16782a(null);

    /* JADX INFO: renamed from: b0 */
    private final Fragment f56461b0;

    /* JADX INFO: renamed from: c0 */
    private C28181z f56462c0;

    /* JADX INFO: renamed from: d0 */
    private C16846w0 f56463d0;

    /* JADX INFO: renamed from: e0 */
    private long f56464e0;

    /* JADX INFO: renamed from: f0 */
    private LocalVideoMiddleSeriesListFragment f56465f0;

    /* JADX INFO: renamed from: g0 */
    private C28623e f56466g0;

    /* JADX INFO: renamed from: h0 */
    private boolean f56467h0;

    /* JADX INFO: renamed from: i0 */
    private boolean f56468i0;

    /* JADX INFO: renamed from: j0 */
    private LocalBackAdHelper f56469j0;

    /* JADX INFO: renamed from: com.transsion.postdetail.layer.local.LocalVideoMiddleLayer$a */
    public static final class C16782a {
        private C16782a() {
        }

        public /* synthetic */ C16782a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.layer.local.LocalVideoMiddleLayer$b */
    public static final class C16783b implements InterfaceC3194f {
        C16783b() {
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public /* synthetic */ void onCreate(InterfaceC3224u interfaceC3224u) {
            AbstractC3192e.m14896a(this, interfaceC3224u);
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public void onDestroy(InterfaceC3224u owner) {
            LocalVideoMiddleHeaderView localVideoMiddleHeaderView;
            Intrinsics.m97802h(owner, "owner");
            AbstractC3192e.m14897b(this, owner);
            LocalBackAdHelper localBackAdHelper = LocalVideoMiddleLayer.this.f56469j0;
            if (localBackAdHelper != null) {
                localBackAdHelper.m73160o();
            }
            C28181z c28181z = LocalVideoMiddleLayer.this.f56462c0;
            if (c28181z == null || (localVideoMiddleHeaderView = c28181z.f86794u) == null) {
                return;
            }
            localVideoMiddleHeaderView.destroy();
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public /* synthetic */ void onPause(InterfaceC3224u interfaceC3224u) {
            AbstractC3192e.m14898c(this, interfaceC3224u);
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public /* synthetic */ void onResume(InterfaceC3224u interfaceC3224u) {
            AbstractC3192e.m14899d(this, interfaceC3224u);
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public /* synthetic */ void onStart(InterfaceC3224u interfaceC3224u) {
            AbstractC3192e.m14900e(this, interfaceC3224u);
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public /* synthetic */ void onStop(InterfaceC3224u interfaceC3224u) {
            AbstractC3192e.m14901f(this, interfaceC3224u);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalVideoMiddleLayer(Fragment fragment) {
        super(fragment);
        Intrinsics.m97802h(fragment, "fragment");
        this.f56461b0 = fragment;
    }

    /* JADX INFO: renamed from: A3 */
    private final C16846w0 m73163A3() {
        C28181z c28181z;
        ViewStub viewStub;
        View viewInflate;
        if (this.f56463d0 == null && (c28181z = this.f56462c0) != null && (viewStub = c28181z.f86771T) != null && (viewInflate = viewStub.inflate()) != null) {
            C28180y c28180yM109388a = C28180y.m109388a(viewInflate);
            Intrinsics.m97801g(c28180yM109388a, "bind(...)");
            this.f56463d0 = new C16846w0(c28180yM109388a);
        }
        return this.f56463d0;
    }

    /* JADX INFO: renamed from: B3 */
    private final LocalBackAdHelper m73164B3() {
        LocalBackAdHelper localBackAdHelper = this.f56469j0;
        if (localBackAdHelper != null) {
            return localBackAdHelper;
        }
        LocalBackAdHelper localBackAdHelper2 = new LocalBackAdHelper("LocalVideoBackInterstitialV2Scene", AbstractC3226v.m14968a(this.f56461b0), new Function0() { // from class: com.transsion.postdetail.layer.local.b1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalVideoMiddleLayer.m73165C3(this.f56535a);
            }
        }, new Function0() { // from class: com.transsion.postdetail.layer.local.c1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalVideoMiddleLayer.m73166D3(this.f56596a);
            }
        }, false, 16, null);
        this.f56469j0 = localBackAdHelper2;
        return localBackAdHelper2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C3 */
    public static final Activity m73165C3(LocalVideoMiddleLayer localVideoMiddleLayer) {
        FragmentActivity activity = localVideoMiddleLayer.f56461b0.getActivity();
        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            return null;
        }
        return activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D3 */
    public static final Unit m73166D3(final LocalVideoMiddleLayer localVideoMiddleLayer) {
        ConstraintLayout root;
        C28181z c28181z = localVideoMiddleLayer.f56462c0;
        if (c28181z != null && (root = c28181z.getRoot()) != null) {
            root.postDelayed(new Runnable() { // from class: com.transsion.postdetail.layer.local.d1
                @Override // java.lang.Runnable
                public final void run() {
                    LocalVideoMiddleLayer.m73167E3(this.f56597a);
                }
            }, 200L);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E3 */
    public static final void m73167E3(LocalVideoMiddleLayer localVideoMiddleLayer) {
        m73172J3(localVideoMiddleLayer, false, 1, null);
    }

    /* JADX INFO: renamed from: F3 */
    private final void m73168F3() {
        TextView textView;
        C28181z c28181z = this.f56462c0;
        if (c28181z == null || (textView = c28181z.f86797x) == null) {
            return;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.layer.local.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalVideoMiddleLayer.m73169G3(this.f56709a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G3 */
    public static final void m73169G3(LocalVideoMiddleLayer localVideoMiddleLayer, View view) {
        if (view.isSelected()) {
            view.setSelected(false);
            localVideoMiddleLayer.m73175M3(false);
            DownloadBean downloadBeanM73361S0 = localVideoMiddleLayer.m73361S0();
            if (downloadBeanM73361S0 != null) {
                localVideoMiddleLayer.m73362T0().mo88670G(downloadBeanM73361S0);
                return;
            }
            return;
        }
        if (!C27287m.f83003a.m106330e()) {
            C13806h.f49015a.m62324k(R$string.base_network_fail);
            return;
        }
        view.setSelected(true);
        localVideoMiddleLayer.m73175M3(true);
        DownloadBean downloadBeanM73361S1 = localVideoMiddleLayer.m73361S0();
        if (downloadBeanM73361S1 != null) {
            localVideoMiddleLayer.m73362T0().mo88679k(downloadBeanM73361S1);
        }
    }

    /* JADX INFO: renamed from: H3 */
    private final void m73170H3() {
        Fragment fragmentM14547k0 = this.f56461b0.getChildFragmentManager().m14547k0("LocalVideoMiddleSeriesList");
        if (fragmentM14547k0 instanceof LocalVideoMiddleSeriesListFragment) {
            ((LocalVideoMiddleSeriesListFragment) fragmentM14547k0).m74261n0(true);
        }
    }

    /* JADX INFO: renamed from: I3 */
    private final void m73171I3(boolean z11) {
        LocalVideoMiddleHeaderView localVideoMiddleHeaderView;
        FragmentActivity activity;
        try {
            Result.Companion companion = Result.INSTANCE;
            this.f56461b0.getLifecycle().mo14832a(new C16783b());
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (z11) {
            if (mo73376e(FloatActionType.BACK) || (activity = this.f56461b0.getActivity()) == null) {
                return;
            }
            activity.finish();
            return;
        }
        C28181z c28181z = this.f56462c0;
        if (c28181z == null || (localVideoMiddleHeaderView = c28181z.f86794u) == null) {
            return;
        }
        localVideoMiddleHeaderView.destroy();
    }

    /* JADX INFO: renamed from: J3 */
    static /* synthetic */ void m73172J3(LocalVideoMiddleLayer localVideoMiddleLayer, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        localVideoMiddleLayer.m73171I3(z11);
    }

    /* JADX INFO: renamed from: K3 */
    private final void m73173K3() {
        LocalBackAdHelper localBackAdHelperM73164B3 = m73164B3();
        DownloadBean downloadBeanM73361S0 = m73361S0();
        localBackAdHelperM73164B3.m73161q(downloadBeanM73361S0 != null ? downloadBeanM73361S0.getGenre() : null);
    }

    /* JADX INFO: renamed from: L3 */
    private final void m73174L3(DownloadBean downloadBean) {
        if (downloadBean == null) {
            return;
        }
        DownloadEsHelper downloadEsHelperM88598a = DownloadEsHelper.f67591m.m88598a();
        String resourceId = downloadBean.getResourceId();
        if (resourceId == null) {
            resourceId = downloadBean.getUrl();
        }
        DownloadBean downloadBeanM88589q = downloadEsHelperM88598a.m88589q(resourceId);
        if (downloadBeanM88589q != null) {
            downloadBean = downloadBeanM88589q;
        }
        m73395r2(downloadBean, true);
    }

    /* JADX INFO: renamed from: M3 */
    private final void m73175M3(boolean z11) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        if (z11) {
            C28181z c28181z = this.f56462c0;
            if (c28181z != null && (textView4 = c28181z.f86798y) != null) {
                textView4.setText(this.f56461b0.getString(com.transsion.postdetail.R$string.download_playing_downloading_tips));
            }
            C28181z c28181z2 = this.f56462c0;
            if (c28181z2 == null || (textView3 = c28181z2.f86797x) == null) {
                return;
            }
            textView3.setText(this.f56461b0.getString(com.transsion.postdetail.R$string.download_playing_pause));
            return;
        }
        C28181z c28181z3 = this.f56462c0;
        if (c28181z3 != null && (textView2 = c28181z3.f86798y) != null) {
            textView2.setText(this.f56461b0.getString(com.transsion.postdetail.R$string.download_playing_pause_tips));
        }
        C28181z c28181z4 = this.f56462c0;
        if (c28181z4 == null || (textView = c28181z4.f86797x) == null) {
            return;
        }
        textView.setText(this.f56461b0.getString(com.transsion.postdetail.R$string.download_playing_resume));
    }

    /* JADX INFO: renamed from: N3 */
    private final void m73176N3() {
        C28181z c28181z;
        PublishStateView publishStateView;
        DownloadBean downloadBeanM73361S0 = m73361S0();
        if (downloadBeanM73361S0 == null || (c28181z = this.f56462c0) == null || (publishStateView = c28181z.f86785l) == null) {
            return;
        }
        String groupId = downloadBeanM73361S0.getGroupId();
        String str = groupId == null ? "" : groupId;
        String cover = downloadBeanM73361S0.getCover();
        String str2 = cover == null ? "" : cover;
        String name = downloadBeanM73361S0.getName();
        publishStateView.publishSource(4, (30 & 2) != 0 ? "" : null, (30 & 4) != 0 ? "" : null, (30 & 8) != 0 ? "" : null, (30 & 16) != 0 ? "" : null, (30 & 32) != 0 ? "" : str, (30 & 64) != 0 ? "" : name == null ? "" : name, (30 & 128) == 0 ? str2 : "", (30 & 256) != 0 ? false : true);
    }

    /* JADX INFO: renamed from: O3 */
    private final void m73177O3(String str) {
        ConstraintLayout root;
        if (System.currentTimeMillis() - C14496b.f50966a.m65344b().getLong("show_LocalVideoBackInterstitialV2Scene_timestamp", 0L) >= C14047a.f49716a.m63593k("LocalVideoBackInterstitialV2Scene") * 60000) {
            m73180R3();
            return;
        }
        C25639b.m100912d(C25639b.f77786a, "LocalVideoBackInterstitialV2Scene", false, 2, null);
        C28181z c28181z = this.f56462c0;
        if (c28181z == null || (root = c28181z.getRoot()) == null) {
            return;
        }
        root.postDelayed(new Runnable() { // from class: com.transsion.postdetail.layer.local.a1
            @Override // java.lang.Runnable
            public final void run() {
                LocalVideoMiddleLayer.m73178P3(this.f56533a);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public static final void m73178P3(LocalVideoMiddleLayer localVideoMiddleLayer) {
        m73172J3(localVideoMiddleLayer, false, 1, null);
    }

    /* JADX INFO: renamed from: Q3 */
    private final void m73179Q3(boolean z11) {
        FrameLayout frameLayout;
        C28181z c28181z = this.f56462c0;
        if (c28181z == null || (frameLayout = c28181z.f86777d) == null) {
            return;
        }
        frameLayout.setVisibility(z11 ? 0 : 8);
    }

    /* JADX INFO: renamed from: R3 */
    private final void m73180R3() {
        LocalBackAdHelper localBackAdHelperM73164B3 = m73164B3();
        DownloadBean downloadBeanM73361S0 = m73361S0();
        localBackAdHelperM73164B3.m73162r(downloadBeanM73361S0 != null ? downloadBeanM73361S0.getGenre() : null);
    }

    /* JADX INFO: renamed from: S3 */
    private final void m73181S3() {
        LocalVideoMiddleSeriesListFragment localVideoMiddleSeriesListFragmentM74265a = LocalVideoMiddleSeriesListFragment.INSTANCE.m74265a();
        localVideoMiddleSeriesListFragmentM74265a.m74262r0(m73361S0(), m73377e1());
        localVideoMiddleSeriesListFragmentM74265a.m74263s0(new Function2() { // from class: com.transsion.postdetail.layer.local.e1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LocalVideoMiddleLayer.m73182T3(this.f56601a, (DownloadBean) obj, ((Integer) obj2).intValue());
            }
        });
        localVideoMiddleSeriesListFragmentM74265a.m74264t0(this.f56461b0, R$id.fl_series_list_container);
        this.f56465f0 = localVideoMiddleSeriesListFragmentM74265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public static final Unit m73182T3(LocalVideoMiddleLayer localVideoMiddleLayer, DownloadBean bean, int i11) {
        Intrinsics.m97802h(bean, "bean");
        localVideoMiddleLayer.m73174L3(bean);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public static final Unit m73183U3(LocalVideoMiddleLayer localVideoMiddleLayer, DownloadBean downloadBean) {
        localVideoMiddleLayer.m73174L3(downloadBean);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public static final Unit m73184V3(LocalVideoMiddleLayer localVideoMiddleLayer) {
        localVideoMiddleLayer.m73181S3();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: y3 */
    private final void m73195y3(boolean z11, boolean z12) {
        C16846w0 c16846w0M73163A3;
        if (z12 && (c16846w0M73163A3 = m73163A3()) != null) {
            c16846w0M73163A3.m73545d(z11);
        }
        long jI = z11 ? RangesKt.m97939i(this.f56464e0 + ((long) 10000), m73388n1()) : RangesKt.m97936f(this.f56464e0 - ((long) 10000), 0L);
        this.f56464e0 = jI;
        InterfaceC16634g interfaceC16634gM73086H = m73086H();
        if (interfaceC16634gM73086H != null) {
            interfaceC16634gM73086H.seekTo(jI);
        }
    }

    /* JADX INFO: renamed from: z3 */
    static /* synthetic */ void m73196z3(LocalVideoMiddleLayer localVideoMiddleLayer, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        localVideoMiddleLayer.m73195y3(z11, z12);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: A0 */
    public View mo73197A0() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86762K;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: B0 */
    protected void mo73198B0(Subject subject) {
        super.mo73198B0(subject);
        if (this.f56467h0) {
            return;
        }
        this.f56467h0 = true;
        if (subject != null) {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new LocalVideoMiddleLayer$bindMovieDetail$1(this, subject, null), 3, null);
            String ops = subject.getOps();
            if (ops == null || ops.length() == 0) {
                DownloadBean downloadBeanM73361S0 = m73361S0();
                subject.setOps(downloadBeanM73361S0 != null ? downloadBeanM73361S0.getOps() : null);
            }
        }
        if (subject == null) {
            subject = AbstractC4864a.m23379a(m73361S0());
        }
        C26866a.a aVar = C26866a.f81698a;
        String strM73387m1 = m73387m1();
        Intrinsics.m97801g(strM73387m1, "<get-TAG>(...)");
        DownloadBean downloadBeanM73361S1 = m73361S0();
        C26866a.a.m104898f(aVar, strM73387m1, "bindMovieDetail, isInnerVideo:" + (downloadBeanM73361S1 != null ? Boolean.valueOf(downloadBeanM73361S1.isInnerSubjectRes()) : null), false, 4, null);
        Fragment fragment = this.f56461b0;
        C28181z c28181z = this.f56462c0;
        MagicIndicator magicIndicator = c28181z != null ? c28181z.f86790q : null;
        ViewPager2 viewPager2 = c28181z != null ? c28181z.f86793t : null;
        DownloadBean downloadBeanM73361S2 = m73361S0();
        this.f56466g0 = new C28623e(fragment, subject, magicIndicator, viewPager2, "local_video_detail", true, !(downloadBeanM73361S2 != null ? downloadBeanM73361S2.isInnerSubjectRes() : true), null, 128, null);
        Fragment fragment2 = this.f56461b0;
        int i11 = R$id.subjectDetailLayout;
        DownloadBean downloadBeanM73361S3 = m73361S0();
        new C28625g(fragment2, i11, subject, "local_video_detail", "download_subject", true, !(downloadBeanM73361S3 != null ? downloadBeanM73361S3.isInnerSubjectRes() : true));
        m73179Q3(false);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: C0 */
    public boolean mo73199C0() {
        return false;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: D */
    public void mo73200D(DownloadBean bean) {
        C28181z c28181z;
        TextView textView;
        TextView textView2;
        C28181z c28181z2;
        FrameLayout frameLayout;
        Intrinsics.m97802h(bean, "bean");
        super.mo73200D(bean);
        int status = bean.getStatus();
        if (status != 1 && status != 2 && status != 3) {
            if (status != 5) {
                return;
            }
            C26866a.a aVar = C26866a.f81698a;
            String strM73387m1 = m73387m1();
            Intrinsics.m97801g(strM73387m1, "<get-TAG>(...)");
            String resourceId = bean.getResourceId();
            DownloadBean downloadBeanM73361S0 = m73361S0();
            C26866a.a.m104908v(aVar, strM73387m1, "onDownloadCallback, success  resourceId = " + resourceId + ", cur resourceId = " + (downloadBeanM73361S0 != null ? downloadBeanM73361S0.getResourceId() : null), false, 4, null);
            String resourceId2 = bean.getResourceId();
            DownloadBean downloadBeanM73361S1 = m73361S0();
            if (!Intrinsics.m97797c(resourceId2, downloadBeanM73361S1 != null ? downloadBeanM73361S1.getResourceId() : null) || (c28181z2 = this.f56462c0) == null || (frameLayout = c28181z2.f86778e) == null) {
                return;
            }
            AbstractC26006c.m102054g(frameLayout);
            return;
        }
        if (!this.f56468i0) {
            DownloadBean downloadBeanM73361S2 = m73361S0();
            if (Intrinsics.m97797c(downloadBeanM73361S2 != null ? downloadBeanM73361S2.getSubjectId() : null, bean.getSubjectId())) {
                C26866a.a aVar2 = C26866a.f81698a;
                String strM73387m2 = m73387m1();
                Intrinsics.m97801g(strM73387m2, "<get-TAG>(...)");
                C26866a.a.m104908v(aVar2, strM73387m2, "onDownloadCallback, refresh  epse = " + bean.getEpse(), false, 4, null);
                this.f56468i0 = true;
                m73390o1().m75012h(m73361S0());
            }
        }
        String resourceId3 = bean.getResourceId();
        DownloadBean downloadBeanM73361S3 = m73361S0();
        if (!Intrinsics.m97797c(resourceId3, downloadBeanM73361S3 != null ? downloadBeanM73361S3.getResourceId() : null) || (c28181z = this.f56462c0) == null || (textView = c28181z.f86797x) == null || textView.isSelected()) {
            return;
        }
        C28181z c28181z3 = this.f56462c0;
        if (c28181z3 != null && (textView2 = c28181z3.f86797x) != null) {
            textView2.setSelected(true);
        }
        m73175M3(true);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: D0 */
    public ViewGroup mo73201D0() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86760I;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: E0 */
    public ViewGroup mo73202E0() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: F0 */
    public View mo73203F0() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86767P;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: G0 */
    public TextView mo73204G0() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86754C;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: H0 */
    public TextView mo73205H0() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86752A;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: I0 */
    public TextView mo73206I0() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86761J;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: N2 */
    public ViewGroup mo73207N2() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86779f;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: O0 */
    public ImageView mo73208O0() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86783j;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: O2 */
    public ImageView mo73209O2() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: P1 */
    public View mo73210P1() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86784k;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: P2 */
    public ProgressBar mo73211P2() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: Q0 */
    public View mo73212Q0() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86757F;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: Q2 */
    public TextView mo73213Q2() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: R2 */
    public TextView mo73214R2() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: S2 */
    public SimpleSubtitleView mo73215S2() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: T2 */
    public SimpleSubtitleView mo73216T2() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86758G;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: U2 */
    public ViewGroup mo73217U2() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86781h;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: V1 */
    public void mo73218V1() {
        m73177O3("onBackClick");
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: V2 */
    public SimpleSubtitleView mo73219V2() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86759H;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: W2 */
    public TextView mo73220W2() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: X2 */
    public TextView mo73221X2() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86755D;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: Y2 */
    public TextView mo73222Y2() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86756E;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: Z2 */
    public Group mo73223Z2() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86763L;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: a */
    public void mo73224a(LocalUiType uiType) {
        Window window;
        Intrinsics.m97802h(uiType, "uiType");
        mo73234j(false);
        C28623e c28623e = this.f56466g0;
        if (c28623e != null) {
            c28623e.m110393x(uiType != LocalUiType.MIDDLE);
        }
        LocalUiType localUiType = LocalUiType.MIDDLE;
        if (uiType == localUiType) {
            C26866a.a aVar = C26866a.f81698a;
            String strM73387m1 = m73387m1();
            Intrinsics.m97801g(strM73387m1, "<get-TAG>(...)");
            C26866a.a.m104898f(aVar, strM73387m1, "onLocalUiChanged 2 middle", false, 4, null);
            InterfaceC16634g interfaceC16634gM73086H = m73086H();
            if (interfaceC16634gM73086H != null) {
                interfaceC16634gM73086H.setScaleMode(ScaleMode.SCALE_ASPECT_FIT);
            }
            FragmentActivity activity = this.f56461b0.getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
                Intrinsics.m97801g(insetsController, "getInsetsController(...)");
                insetsController.show(WindowInsetsCompat.Type.navigationBars());
            }
            m73406z0();
        }
        C26866a.f81698a.m104912c("long_video_play", "middle, onLocalUiChanged uiType = " + uiType, true);
        m73363T1(uiType == localUiType);
        super.mo73224a(uiType);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: a3 */
    public LocalUiType mo73225a3() {
        return LocalUiType.MIDDLE;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: c */
    public void mo73226c() {
        super.mo73226c();
        m73171I3(false);
        this.f56462c0 = null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: f */
    public void mo73227f(boolean z11, String requestKey) {
        Intrinsics.m97802h(requestKey, "requestKey");
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: f2 */
    public ImageView mo73228f2() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86764M;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: g2 */
    public ViewGroup mo73229g2() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: h */
    public void mo73230h(String subjectId, String resourceId) {
        Intrinsics.m97802h(subjectId, "subjectId");
        Intrinsics.m97802h(resourceId, "resourceId");
        super.mo73230h(subjectId, resourceId);
        C26866a.a aVar = C26866a.f81698a;
        String strM73387m1 = m73387m1();
        Intrinsics.m97801g(strM73387m1, "<get-TAG>(...)");
        C26866a.a.m104908v(aVar, strM73387m1, "initSeries", false, 4, null);
        m73390o1().m75012h(m73361S0());
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: h2 */
    public TextView mo73231h2() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: h3 */
    public TextView mo73232h3() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: i2 */
    public View mo73233i2() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    public boolean isVisible() {
        ConstraintLayout constraintLayout;
        C28181z c28181z = this.f56462c0;
        return (c28181z == null || (constraintLayout = c28181z.f86791r) == null || constraintLayout.getVisibility() != 0) ? false : true;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: j */
    public void mo73234j(boolean z11) {
        View view;
        C28181z c28181z = this.f56462c0;
        if (c28181z == null || (view = c28181z.f86770S) == null) {
            return;
        }
        view.setVisibility(z11 ? 0 : 8);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: j1 */
    public View mo73235j1() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: j3 */
    public FrameLayout mo73236j3() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86769R;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: k */
    public void mo73237k(DownloadBean downloadBean, String pageFrom, boolean z11) {
        TextView textView;
        FrameLayout frameLayout;
        C28181z c28181z;
        LocalVideoMiddleHeaderView localVideoMiddleHeaderView;
        LocalVideoMiddleHeaderView localVideoMiddleHeaderView2;
        String path;
        FrameLayout frameLayout2;
        Intrinsics.m97802h(pageFrom, "pageFrom");
        super.mo73237k(downloadBean, pageFrom, z11);
        if ((downloadBean == null || downloadBean.getStatus() != 5) && downloadBean != null && downloadBean.isInnerRes()) {
            C28181z c28181z2 = this.f56462c0;
            if (c28181z2 != null && (frameLayout = c28181z2.f86778e) != null) {
                AbstractC26006c.m102058k(frameLayout);
            }
            boolean zMo88665B = m73362T0().mo88665B(downloadBean);
            C28181z c28181z3 = this.f56462c0;
            if (c28181z3 != null && (textView = c28181z3.f86797x) != null) {
                textView.setSelected(zMo88665B);
            }
            m73175M3(zMo88665B);
        } else {
            C28181z c28181z4 = this.f56462c0;
            if (c28181z4 != null && (frameLayout2 = c28181z4.f86778e) != null) {
                AbstractC26006c.m102054g(frameLayout2);
            }
        }
        if (downloadBean != null && downloadBean.getType() == 6 && (path = downloadBean.getPath()) != null && StringsKt.m98132c0(path, ".mp3", false, 2, null)) {
            m73396s2(downloadBean.getCover());
        }
        m73176N3();
        C28181z c28181z5 = this.f56462c0;
        if (c28181z5 != null && (localVideoMiddleHeaderView2 = c28181z5.f86794u) != null) {
            localVideoMiddleHeaderView2.updateDownloadBean(downloadBean);
        }
        m73390o1().m75008d(downloadBean != null ? downloadBean.getSubjectId() : null);
        if (!z11 || (c28181z = this.f56462c0) == null || (localVideoMiddleHeaderView = c28181z.f86794u) == null) {
            return;
        }
        localVideoMiddleHeaderView.init(downloadBean, c28181z != null ? c28181z.f86792s : null, AbstractC3226v.m14968a(this.f56461b0));
        localVideoMiddleHeaderView.setItemClickCallback(new Function1() { // from class: com.transsion.postdetail.layer.local.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocalVideoMiddleLayer.m73183U3(this.f56710a, (DownloadBean) obj);
            }
        });
        localVideoMiddleHeaderView.setAllListClickCallback(new Function0() { // from class: com.transsion.postdetail.layer.local.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalVideoMiddleLayer.m73184V3(this.f56711a);
            }
        });
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: k2 */
    public View mo73238k2() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86753B;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: k3 */
    public TextView mo73239k3() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86768Q;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: m3 */
    public ViewStub mo73240m3() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86772U;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: n */
    public void mo73241n(LocalUiType newConfig) {
        Intrinsics.m97802h(newConfig, "newConfig");
        super.mo73241n(newConfig);
        if (newConfig == LocalUiType.LAND) {
            mo73367Y1();
        }
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: n2 */
    public ConstraintLayout mo73242n2() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86791r;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: n3 */
    public ViewStub mo73243n3() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86773V;
        }
        return null;
    }

    @Override // p951yo.InterfaceC28991d
    public void onBackPressed() {
        C26866a.a aVar = C26866a.f81698a;
        String strM73387m1 = m73387m1();
        Intrinsics.m97801g(strM73387m1, "<get-TAG>(...)");
        C26866a.a.m104898f(aVar, strM73387m1, "middle onBackPressed", false, 4, null);
        LocalVideoMiddleSeriesListFragment localVideoMiddleSeriesListFragment = this.f56465f0;
        if (localVideoMiddleSeriesListFragment == null || localVideoMiddleSeriesListFragment.getIsRemoved()) {
            m73177O3("onBackPressed");
            return;
        }
        LocalVideoMiddleSeriesListFragment localVideoMiddleSeriesListFragment2 = this.f56465f0;
        if (localVideoMiddleSeriesListFragment2 != null) {
            LocalVideoMiddleSeriesListFragment.m74255o0(localVideoMiddleSeriesListFragment2, false, 1, null);
        }
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, com.transsion.player.orplayer.InterfaceC16633f
    public void onProgress(long j11, C23403e c23403e) {
        super.onProgress(j11, c23403e);
        if (isVisible()) {
            this.f56464e0 = j11;
            C16809i0.f56610v.m73479a().m73477t(j11, m73388n1());
        }
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: p2 */
    public View mo73244p2() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86765N;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: q1 */
    public View mo73245q1() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86787n;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: q2 */
    public SecondariesSeekBar mo73246q2() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86766O;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: r1 */
    public View mo73247r1() {
        C28181z c28181z = this.f56462c0;
        if (c28181z != null) {
            return c28181z.f86786m;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: s */
    public void mo73248s(View rootView, LocalUiType uiType) {
        PublishStateView publishStateView;
        View view;
        Intrinsics.m97802h(rootView, "rootView");
        Intrinsics.m97802h(uiType, "uiType");
        if (uiType != LocalUiType.MIDDLE) {
            return;
        }
        this.f56462c0 = C28181z.m109390a(rootView);
        super.mo73248s(rootView, uiType);
        C28181z c28181z = this.f56462c0;
        ViewGroup.LayoutParams layoutParams = (c28181z == null || (view = c28181z.f86782i) == null) ? null : view.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.C2308b) layoutParams)).topMargin = AbstractC5781d.m27351c();
        m73179Q3(true);
        m73168F3();
        m73170H3();
        m73173K3();
        C28181z c28181z2 = this.f56462c0;
        if (c28181z2 != null && (publishStateView = c28181z2.f86785l) != null) {
            publishStateView.setImageResource(R$mipmap.libui_ic_base_whit_publish);
        }
        m73373b3(false);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: s1 */
    public void mo73249s1(MotionEvent motionEvent, boolean z11) {
        View view;
        C28181z c28181z = this.f56462c0;
        if (c28181z != null && (view = c28181z.f86770S) != null) {
            AbstractC26006c.m102054g(view);
        }
        if (!z11 || motionEvent == null) {
            super.mo73249s1(motionEvent, false);
            return;
        }
        int iM27489e = AbstractC5806y.m27489e() / 3;
        int rawX = (int) motionEvent.getRawX();
        if (rawX >= 0 && rawX <= iM27489e) {
            m73196z3(this, false, false, 2, null);
        } else if (rawX > iM27489e * 2) {
            m73196z3(this, true, false, 2, null);
        } else {
            super.mo73249s1(motionEvent, false);
        }
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: v */
    public void mo73250v(String subjectId, String resourceId) {
        LocalVideoMiddleHeaderView localVideoMiddleHeaderView;
        DownloadBean downloadBean;
        Intrinsics.m97802h(subjectId, "subjectId");
        Intrinsics.m97802h(resourceId, "resourceId");
        C28181z c28181z = this.f56462c0;
        if (c28181z == null || (localVideoMiddleHeaderView = c28181z.f86794u) == null || (downloadBean = localVideoMiddleHeaderView.getDownloadBean(resourceId)) == null) {
            return;
        }
        m73395r2(downloadBean, true);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: w */
    public void mo73251w(boolean z11) {
        super.mo73251w(z11);
    }
}
