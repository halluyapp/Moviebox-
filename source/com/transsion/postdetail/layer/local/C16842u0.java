package com.transsion.postdetail.layer.local;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.avery.subtitle.widget.SimpleSubtitleView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.AbstractC5806y;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.gyf.immersionbar.BarHide;
import com.gyf.immersionbar.ImmersionBar;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.p282tn.lib.view.SecondariesSeekBar;
import com.transsion.baselib.helper.C14453d;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.download.SubtitleBean;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.R$drawable;
import com.transsion.baseui.R$string;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.player.longvideo.p302ui.LongVodPlayerView;
import com.transsion.player.longvideo.p302ui.dialog.PlayerSettingDialog;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.p1003enum.ScaleMode;
import com.transsion.postdetail.layer.SystemTimeManager;
import com.transsion.postdetail.layer.listener.LayerFlag;
import com.transsion.postdetail.p306ui.fragment.LocalVideoDetailFragment;
import com.transsion.postdetail.p306ui.view.ImmScaleView;
import com.transsion.postdetail.p306ui.view.ImmSpeedView;
import dk.C22992e;
import fo.C23403e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import p438go.C23621c;
import p550kj.C24655b;
import p550kj.C24662i;
import p844vo.C28165n0;
import p844vo.C28179x;
import p844vo.C28180y;
import p913xm.C28615f;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.postdetail.layer.local.u0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16842u0 extends AbstractC16785a0 {

    /* JADX INFO: renamed from: b0 */
    private final Fragment f56678b0;

    /* JADX INFO: renamed from: c0 */
    private C28179x f56679c0;

    /* JADX INFO: renamed from: d0 */
    private int f56680d0;

    /* JADX INFO: renamed from: e0 */
    private int f56681e0;

    /* JADX INFO: renamed from: f0 */
    private final int f56682f0;

    /* JADX INFO: renamed from: g0 */
    private final int f56683g0;

    /* JADX INFO: renamed from: h0 */
    private final int f56684h0;

    /* JADX INFO: renamed from: i0 */
    private int f56685i0;

    /* JADX INFO: renamed from: j0 */
    private int f56686j0;

    /* JADX INFO: renamed from: k0 */
    private int f56687k0;

    /* JADX INFO: renamed from: l0 */
    private int f56688l0;

    /* JADX INFO: renamed from: m0 */
    private int f56689m0;

    /* JADX INFO: renamed from: n0 */
    private float f56690n0;

    /* JADX INFO: renamed from: o0 */
    private int f56691o0;

    /* JADX INFO: renamed from: p0 */
    private int f56692p0;

    /* JADX INFO: renamed from: q0 */
    private float f56693q0;

    /* JADX INFO: renamed from: r0 */
    private boolean f56694r0;

    /* JADX INFO: renamed from: s0 */
    private boolean f56695s0;

    /* JADX INFO: renamed from: t0 */
    private boolean f56696t0;

    /* JADX INFO: renamed from: u0 */
    private View f56697u0;

    /* JADX INFO: renamed from: v0 */
    private long f56698v0;

    /* JADX INFO: renamed from: w0 */
    private final Lazy f56699w0;

    /* JADX INFO: renamed from: x0 */
    private C16815k0 f56700x0;

    /* JADX INFO: renamed from: y0 */
    private int f56701y0;

    /* JADX INFO: renamed from: z0 */
    private int f56702z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16842u0(Fragment fragment) {
        super(fragment);
        Intrinsics.m97802h(fragment, "fragment");
        this.f56678b0 = fragment;
        this.f56682f0 = AbstractC5776a0.m27313a(24.0f);
        this.f56683g0 = AbstractC5776a0.m27313a(16.0f);
        this.f56684h0 = AbstractC5776a0.m27313a(20.0f);
        this.f56693q0 = 1.0f;
        this.f56696t0 = true;
        this.f56699w0 = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.layer.local.t0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C16842u0.m73529S3());
            }
        });
        this.f56701y0 = -1;
    }

    /* JADX INFO: renamed from: A3 */
    private final void m73511A3(boolean z11, boolean z12) {
        C16815k0 c16815k0M73513C3;
        Fragment fragment = this.f56678b0;
        LocalVideoDetailFragment localVideoDetailFragment = fragment instanceof LocalVideoDetailFragment ? (LocalVideoDetailFragment) fragment : null;
        if (localVideoDetailFragment != null) {
            localVideoDetailFragment.m74213b2();
        }
        if (z12 && (c16815k0M73513C3 = m73513C3()) != null) {
            c16815k0M73513C3.m73492d(z11);
        }
        long jI = z11 ? RangesKt.m97939i(this.f56698v0 + ((long) 10000), m73388n1()) : RangesKt.m97936f(this.f56698v0 - ((long) 10000), 0L);
        this.f56698v0 = jI;
        InterfaceC16634g interfaceC16634gM73086H = m73086H();
        if (interfaceC16634gM73086H != null) {
            interfaceC16634gM73086H.seekTo(jI);
        }
    }

    /* JADX INFO: renamed from: B3 */
    static /* synthetic */ void m73512B3(C16842u0 c16842u0, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        c16842u0.m73511A3(z11, z12);
    }

    /* JADX INFO: renamed from: C3 */
    private final C16815k0 m73513C3() {
        C28179x c28179x;
        ViewStub viewStub;
        View viewInflate;
        if (this.f56700x0 == null && (c28179x = this.f56679c0) != null && (viewStub = c28179x.f86716S) != null && (viewInflate = viewStub.inflate()) != null) {
            C28180y c28180yM109388a = C28180y.m109388a(viewInflate);
            Intrinsics.m97801g(c28180yM109388a, "bind(...)");
            this.f56700x0 = new C16815k0(c28180yM109388a);
        }
        return this.f56700x0;
    }

    /* JADX INFO: renamed from: D3 */
    private final boolean m73514D3() {
        return ((Boolean) this.f56699w0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: E3 */
    private final Map m73515E3(String str) {
        Pair pair = new Pair("module_name", str);
        Pair pair2 = new Pair("subject_id", m73383k1());
        DownloadBean downloadBeanM73361S0 = m73361S0();
        return MapsKt.m97577l(pair, pair2, new Pair("ops", downloadBeanM73361S0 != null ? downloadBeanM73361S0.getOps() : null), new Pair("resource_id", m73381i1()));
    }

    /* JADX INFO: renamed from: F3 */
    private final void m73516F3() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            if (!m73514D3()) {
                c28179x.f86727h.setText((CharSequence) null);
                TextView tvPlayScale = c28179x.f86741v;
                Intrinsics.m97801g(tvPlayScale, "tvPlayScale");
                AbstractC26006c.m102054g(tvPlayScale);
                c28179x.f86739t.setText((CharSequence) null);
            }
            c28179x.f86742w.updateSpeed(C14453d.f50863a.m65162d(), true);
        }
    }

    /* JADX INFO: renamed from: G3 */
    private final void m73517G3() {
        this.f56693q0 = 0.7222222f;
        int i11 = this.f56680d0;
        int i12 = (int) (i11 * 0.7222222f);
        this.f56686j0 = i12;
        this.f56685i0 = (i11 - i12) / 2;
        int i13 = this.f56682f0;
        int i14 = i12 + (i13 * 2);
        this.f56689m0 = i14;
        int i15 = (int) (((i14 * 9) * 1.0f) / 16);
        this.f56688l0 = i15;
        int i16 = this.f56681e0;
        int i17 = (int) (i16 * 0.7222222f);
        this.f56687k0 = i17;
        int i18 = (((i16 - i17) - (i13 / 3)) - i15) / 2;
        this.f56692p0 = i18;
        this.f56691o0 = (i13 / 3) + i15 + i18;
        this.f56690n0 = (((i16 - i17) * 1.0f) / 2) - i18;
        C26866a.a aVar = C26866a.f81698a;
        String strM73387m1 = m73387m1();
        Intrinsics.m97801g(strM73387m1, "<get-TAG>(...)");
        C26866a.a.m104898f(aVar, strM73387m1, "initAdHW ,playerStartSpace = " + this.f56692p0 + ", playerEndSpace = " + this.f56691o0, false, 4, null);
    }

    /* JADX INFO: renamed from: H3 */
    private final void m73518H3(int i11) {
        ViewGroup.LayoutParams c2308b;
        ViewGroup.LayoutParams c2308b2;
        View view;
        View view2;
        View view3;
        View view4;
        Log.e(m73387m1(), "initSpace rotation:" + i11);
        if (this.f56701y0 == i11) {
            return;
        }
        this.f56701y0 = i11;
        if (this.f56702z0 == 0) {
            this.f56702z0 = AbstractC5781d.m27351c();
        }
        C28179x c28179x = this.f56679c0;
        if (c28179x == null || (view4 = c28179x.f86702E) == null || (c2308b = view4.getLayoutParams()) == null) {
            c2308b = new ConstraintLayout.C2308b(-2, -2);
        }
        c2308b.width = i11 == 1 ? this.f56702z0 : 0;
        C28179x c28179x2 = this.f56679c0;
        if (c28179x2 != null && (view3 = c28179x2.f86702E) != null) {
            view3.setLayoutParams(c2308b);
        }
        C28179x c28179x3 = this.f56679c0;
        if (c28179x3 == null || (view2 = c28179x3.f86701D) == null || (c2308b2 = view2.getLayoutParams()) == null) {
            c2308b2 = new ConstraintLayout.C2308b(-2, -2);
        }
        c2308b2.width = i11 == 3 ? this.f56702z0 : 0;
        C28179x c28179x4 = this.f56679c0;
        if (c28179x4 == null || (view = c28179x4.f86701D) == null) {
            return;
        }
        view.setLayoutParams(c2308b2);
    }

    /* JADX INFO: renamed from: I3 */
    private final void m73519I3(String str, boolean z11) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J3 */
    public static final void m73520J3(C16842u0 c16842u0, String str, LocalVideoDetailFragment localVideoDetailFragment, View view) {
        C28179x c28179x;
        AppCompatTextView appCompatTextView;
        view.setSelected(!view.isSelected());
        if (view.isSelected()) {
            c16842u0.m73401v1(true);
            Intrinsics.m97799e(view);
            AbstractC26006c.m102058k(view);
            Context context = view.getContext();
            Intrinsics.m97800f(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).setRequestedOrientation(11);
        } else {
            Context context2 = view.getContext();
            Intrinsics.m97800f(context2, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context2).setRequestedOrientation(6);
            c16842u0.m73351A2(true);
        }
        C24662i c24662i = C24662i.f75350a;
        Pair pair = new Pair("module_name", "lock");
        Pair pair2 = new Pair("subject_id", c16842u0.m73383k1());
        DownloadBean downloadBeanM73361S0 = c16842u0.m73361S0();
        c24662i.m96881p(str, MapsKt.m97578m(pair, pair2, new Pair("ops", downloadBeanM73361S0 != null ? downloadBeanM73361S0.getOps() : null), new Pair(NativeComponentConstants.KEY_COMPONENT_TYPE, view.isSelected() ? "1" : "0")));
        localVideoDetailFragment.m74211W2(view.isSelected());
        c16842u0.m73364W0().m65763l(!view.isSelected());
        if (!c16842u0.m73514D3() || (c28179x = c16842u0.f56679c0) == null || (appCompatTextView = c28179x.f86727h) == null) {
            return;
        }
        appCompatTextView.setText(view.isSelected() ? c16842u0.f56678b0.getString(R$string.play_tap_unlock) : c16842u0.f56678b0.getString(R$string.play_tap_lock));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public static final void m73521K3(C16842u0 c16842u0, View view) {
        ImmScaleView immScaleView;
        C28179x c28179x = c16842u0.f56679c0;
        if (c28179x == null || (immScaleView = c28179x.f86728i) == null) {
            return;
        }
        immScaleView.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L3 */
    public static final void m73522L3(C16842u0 c16842u0, ScaleMode scaleMode, String name) {
        TextView textView;
        Intrinsics.m97802h(scaleMode, "scaleMode");
        Intrinsics.m97802h(name, "name");
        InterfaceC16634g interfaceC16634gM73086H = c16842u0.m73086H();
        if (interfaceC16634gM73086H != null) {
            interfaceC16634gM73086H.setScaleMode(scaleMode);
        }
        C28179x c28179x = c16842u0.f56679c0;
        if (c28179x != null && (textView = c28179x.f86741v) != null) {
            textView.setText(name);
        }
        AbstractC16785a0.m73254B2(c16842u0, false, 1, null);
        C26866a.a aVar = C26866a.f81698a;
        String strM73387m1 = c16842u0.m73387m1();
        Intrinsics.m97801g(strM73387m1, "<get-TAG>(...)");
        C26866a.a.m104898f(aVar, strM73387m1, "scaleMode:" + scaleMode, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M3 */
    public static final void m73523M3(C16842u0 c16842u0, View view) {
        C24662i.f75350a.m96881p("local_video_detail", c16842u0.m73515E3(ToolBar.FORWARD));
        c16842u0.m73401v1(false);
        c16842u0.m73511A3(true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public static final void m73524N3(C16842u0 c16842u0, View view) {
        C24662i.f75350a.m96881p("local_video_detail", c16842u0.m73515E3(ToolBar.BACKWARD));
        c16842u0.m73401v1(false);
        c16842u0.m73511A3(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public static final void m73525O3(C16842u0 c16842u0, View view) {
        C23621c c23621c = C23621c.f72132a;
        String strM73383k1 = c16842u0.m73383k1();
        DownloadBean downloadBeanM73361S0 = c16842u0.m73361S0();
        c23621c.m93451a("local_video_detail", strM73383k1, downloadBeanM73361S0 != null ? downloadBeanM73361S0.getOps() : null, true);
        AbstractC16785a0.m73310e2(c16842u0, null, false, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public static final void m73526P3(C16842u0 c16842u0, String str, View view) {
        new PlayerSettingDialog().m65437l0(c16842u0.f56678b0, "PlayerSettingDialog");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DownloadBean downloadBeanM73361S0 = c16842u0.m73361S0();
        linkedHashMap.put("subject_id", downloadBeanM73361S0 != null ? downloadBeanM73361S0.getSubjectId() : null);
        DownloadBean downloadBeanM73361S1 = c16842u0.m73361S0();
        linkedHashMap.put("subject_ops", downloadBeanM73361S1 != null ? downloadBeanM73361S1.getOps() : null);
        DownloadBean downloadBeanM73361S2 = c16842u0.m73361S0();
        linkedHashMap.put("ops", downloadBeanM73361S2 != null ? downloadBeanM73361S2.getOps() : null);
        DownloadBean downloadBeanM73361S3 = c16842u0.m73361S0();
        linkedHashMap.put("subject_name", downloadBeanM73361S3 != null ? downloadBeanM73361S3.getSubjectName() : null);
        DownloadBean downloadBeanM73361S4 = c16842u0.m73361S0();
        linkedHashMap.put("title_name", downloadBeanM73361S4 != null ? downloadBeanM73361S4.getTitleName() : null);
        DownloadBean downloadBeanM73361S5 = c16842u0.m73361S0();
        linkedHashMap.put("subject_type", downloadBeanM73361S5 != null ? Integer.valueOf(downloadBeanM73361S5.getSubjectType()).toString() : null);
        linkedHashMap.put("module_name", "video_setting");
        C24662i.f75350a.m96881p(str, linkedHashMap);
    }

    /* JADX INFO: renamed from: Q3 */
    private final void m73527Q3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public static final void m73528R3(C16842u0 c16842u0) {
        C26866a.a aVar = C26866a.f81698a;
        String strM73387m1 = c16842u0.m73387m1();
        Intrinsics.m97801g(strM73387m1, "<get-TAG>(...)");
        C26866a.a.m104898f(aVar, strM73387m1, "land onBackPressed", false, 4, null);
        c16842u0.m73539x3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public static final boolean m73529S3() {
        ConfigBean configBeanM110355d = C28615f.m110355d(C28615f.f87796c.m110363a(), LongVodPlayerView.PK_NEW_PLAYER_UI_KEY, false, 2, null);
        String value = configBeanM110355d != null ? configBeanM110355d.getValue() : null;
        return value == null || value.length() == 0;
    }

    /* JADX INFO: renamed from: x3 */
    private final void m73539x3() {
        FragmentActivity activity = this.f56678b0.getActivity();
        if (activity != null) {
            ImmersionBar.with(activity).hideBar(BarHide.FLAG_SHOW_BAR).init();
            activity.setRequestedOrientation(7);
        }
        m73084F(LayerFlag.LOCAL_UI_CHANGED, LocalUiType.MIDDLE);
    }

    /* JADX INFO: renamed from: y3 */
    private final void m73540y3() {
        DownloadBean downloadBeanM73361S0 = m73361S0();
        List<SubtitleBean> subtitleList = downloadBeanM73361S0 != null ? downloadBeanM73361S0.getSubtitleList() : null;
        if ((subtitleList == null || subtitleList.isEmpty()) && this.f56696t0) {
            C14496b c14496b = C14496b.f50966a;
            if (c14496b.m65344b().getBoolean("subtitle_is_search_downloaded", false)) {
                this.f56696t0 = false;
                c14496b.m65344b().putBoolean("subtitle_land_guide", false);
            } else {
                this.f56696t0 = false;
                c14496b.m65344b().putBoolean("subtitle_land_guide", false);
                m73351A2(false);
            }
        }
    }

    /* JADX INFO: renamed from: z3 */
    private final void m73541z3(int i11, int i12) {
        if ((i11 <= 0 || m73392p1() == i11) && (i12 <= 0 || m73366Y0() == i12)) {
            return;
        }
        m73407z2(i11);
        m73398t2(i12);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: A0 */
    public View mo73197A0() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86708K;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: C */
    public void mo73353C(int i11) {
        super.mo73353C(i11);
        m73518H3(i11);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: C0 */
    public boolean mo73199C0() {
        return false;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: D0 */
    public ViewGroup mo73201D0() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86706I;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: E0 */
    public ViewGroup mo73202E0() {
        C22992e c22992e;
        C28179x c28179x = this.f56679c0;
        if (c28179x == null || (c22992e = c28179x.f86721b) == null) {
            return null;
        }
        return c22992e.getRoot();
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: F0 */
    public View mo73203F0() {
        C22992e c22992e;
        C28179x c28179x = this.f56679c0;
        if (c28179x == null || (c22992e = c28179x.f86721b) == null) {
            return null;
        }
        return c22992e.f70198f;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: G0 */
    public TextView mo73204G0() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: H0 */
    public TextView mo73205H0() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: I0 */
    public TextView mo73206I0() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86707J;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: J2 */
    protected void mo73355J2(boolean z11) {
        C22992e c22992e;
        AppCompatImageView appCompatImageView;
        super.mo73355J2(z11);
        C28179x c28179x = this.f56679c0;
        if (c28179x == null || (c22992e = c28179x.f86721b) == null || (appCompatImageView = c22992e.f70196d) == null) {
            return;
        }
        View viewMo73203F0 = mo73203F0();
        appCompatImageView.setVisibility((viewMo73203F0 == null || viewMo73203F0.getVisibility() != 0) ? 0 : 4);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: M1 */
    public boolean mo73359M1() {
        return this.f56695s0;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: N2 */
    public ViewGroup mo73207N2() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86723d;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: O0 */
    public ImageView mo73208O0() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86726g;
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
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86700C;
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
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86739t;
        }
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
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86703F;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: U2 */
    public ViewGroup mo73217U2() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86723d;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: V1 */
    public void mo73218V1() {
        m73539x3();
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: V2 */
    public SimpleSubtitleView mo73219V2() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86704G;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: W1 */
    public void mo73365W1(boolean z11) {
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: W2 */
    public TextView mo73220W2() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86712O;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: X2 */
    public TextView mo73221X2() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86698A;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: Y1 */
    public void mo73367Y1() {
        mo73218V1();
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: Y2 */
    public TextView mo73222Y2() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86699B;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: Z1 */
    public void mo73368Z1() {
        super.mo73368Z1();
        this.f56695s0 = false;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: Z2 */
    public Group mo73223Z2() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86709L;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: a */
    public void mo73224a(LocalUiType uiType) {
        WindowManager windowManager;
        Display defaultDisplay;
        C28165n0 c28165n0;
        LinearLayout root;
        Intrinsics.m97802h(uiType, "uiType");
        LocalUiType localUiType = LocalUiType.LAND;
        if (uiType == localUiType) {
            this.f56694r0 = true;
            InterfaceC16634g interfaceC16634gM73086H = m73086H();
            int videoWidth = interfaceC16634gM73086H != null ? interfaceC16634gM73086H.getVideoWidth() : 0;
            InterfaceC16634g interfaceC16634gM73086H2 = m73086H();
            m73541z3(videoWidth, interfaceC16634gM73086H2 != null ? interfaceC16634gM73086H2.getVideoHeight() : 0);
            C26866a.a aVar = C26866a.f81698a;
            String strM73387m1 = m73387m1();
            Intrinsics.m97801g(strM73387m1, "<get-TAG>(...)");
            C26866a.a.m104898f(aVar, strM73387m1, "onLocalUiChanged 2 land", false, 4, null);
            FragmentActivity activity = this.f56678b0.getActivity();
            if (activity != null) {
                ImmersionBar.with(activity).hideBar(BarHide.FLAG_HIDE_BAR).init();
            }
            m73406z0();
            m73401v1(false);
            SystemTimeManager systemTimeManagerM73385l1 = m73385l1();
            if (systemTimeManagerM73385l1 != null) {
                systemTimeManagerM73385l1.m73098d();
            }
            C28179x c28179x = this.f56679c0;
            if (c28179x != null && (c28165n0 = c28179x.f86705H) != null && (root = c28165n0.getRoot()) != null) {
                AbstractC26006c.m102054g(root);
            }
            m73540y3();
            FragmentActivity activity2 = this.f56678b0.getActivity();
            if (activity2 != null && (windowManager = activity2.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                mo73353C(defaultDisplay.getRotation());
            }
        } else if (this.f56695s0) {
            m73356K0();
        }
        C26866a.f81698a.m104912c("long_video_play", "land, onLocalUiChanged uiType = " + uiType, true);
        m73363T1(uiType == localUiType);
        super.mo73224a(uiType);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: a2 */
    public void mo73369a2(View view) {
        Intrinsics.m97802h(view, "view");
        super.mo73369a2(view);
        View view2 = this.f56697u0;
        if (view2 != null) {
            AbstractC26006c.m102054g(view2);
        }
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: a3 */
    public LocalUiType mo73225a3() {
        return LocalUiType.LAND;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: b1 */
    public View mo73371b1() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86727h;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: c */
    public void mo73226c() {
        super.mo73226c();
        this.f56694r0 = false;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: f2 */
    public ImageView mo73228f2() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86710M;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: g2 */
    public ViewGroup mo73229g2() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: h2 */
    public TextView mo73231h2() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: h3 */
    public TextView mo73232h3() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86713P;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: i2 */
    public View mo73233i2() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86740u;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: i3 */
    public void mo73382i3() {
        super.mo73382i3();
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, com.transsion.player.orplayer.InterfaceC16633f
    public void initPlayer() {
        super.initPlayer();
        this.f56695s0 = false;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: j1 */
    public View mo73235j1() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86744y;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: j3 */
    public FrameLayout mo73236j3() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86715R;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: k */
    public void mo73237k(DownloadBean downloadBean, String pageFrom, boolean z11) {
        String url;
        ImmScaleView immScaleView;
        ImmSpeedView immSpeedView;
        String path;
        Intrinsics.m97802h(pageFrom, "pageFrom");
        super.mo73237k(downloadBean, pageFrom, z11);
        if (downloadBean == null || (url = downloadBean.getResourceId()) == null) {
            url = downloadBean != null ? downloadBean.getUrl() : "";
        }
        m73519I3(url, downloadBean != null ? downloadBean.isSeries() : false);
        if (downloadBean != null && downloadBean.getType() == 6 && (path = downloadBean.getPath()) != null && StringsKt.m98132c0(path, ".mp3", false, 2, null)) {
            m73396s2(downloadBean.getCover());
        }
        C28179x c28179x = this.f56679c0;
        if (c28179x != null && (immSpeedView = c28179x.f86742w) != null) {
            immSpeedView.setOps(downloadBean != null ? downloadBean.getOps() : null);
        }
        C28179x c28179x2 = this.f56679c0;
        if (c28179x2 == null || (immScaleView = c28179x2.f86728i) == null) {
            return;
        }
        immScaleView.setOps(downloadBean != null ? downloadBean.getOps() : null);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: k2 */
    public View mo73238k2() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86743x;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: k3 */
    public TextView mo73239k3() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86714Q;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: m3 */
    public ViewStub mo73240m3() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86718U;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: n */
    public void mo73241n(LocalUiType newConfig) {
        Intrinsics.m97802h(newConfig, "newConfig");
        super.mo73241n(newConfig);
        if (newConfig == LocalUiType.MIDDLE) {
            m73539x3();
        }
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: n2 */
    public ConstraintLayout mo73242n2() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86731l;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: n3 */
    public ViewStub mo73243n3() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86719V;
        }
        return null;
    }

    @Override // p951yo.InterfaceC28991d
    public void onBackPressed() {
        ConstraintLayout constraintLayout;
        C28179x c28179x = this.f56679c0;
        if (c28179x == null || (constraintLayout = c28179x.f86731l) == null) {
            return;
        }
        constraintLayout.postDelayed(new Runnable() { // from class: com.transsion.postdetail.layer.local.s0
            @Override // java.lang.Runnable
            public final void run() {
                C16842u0.m73528R3(this.f56675a);
            }
        }, 30L);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, com.transsion.player.orplayer.InterfaceC16633f
    public void onCompletion(C23403e c23403e) {
        super.onCompletion(c23403e);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, com.transsion.player.orplayer.InterfaceC16633f
    public void onProgress(long j11, C23403e c23403e) {
        super.onProgress(j11, c23403e);
        if (isVisible()) {
            this.f56698v0 = j11;
        }
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoPause(C23403e c23403e) {
        super.onVideoPause(c23403e);
        isVisible();
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoSizeChanged(int i11, int i12) {
        m73541z3(i11, i12);
        super.onVideoSizeChanged(i11, i12);
        C26866a.a aVar = C26866a.f81698a;
        String strM73387m1 = m73387m1();
        Intrinsics.m97801g(strM73387m1, "<get-TAG>(...)");
        aVar.m104912c(strM73387m1, "onVideoSizeChanged, width = " + i11 + ", height = " + i12, true);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoStart(C23403e c23403e) {
        super.onVideoStart(c23403e);
        isVisible();
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: p */
    public void mo73391p(float f11) {
        ImmSpeedView immSpeedView;
        super.mo73391p(f11);
        C28179x c28179x = this.f56679c0;
        if (c28179x == null || (immSpeedView = c28179x.f86742w) == null) {
            return;
        }
        ImmSpeedView.updateSpeed$default(immSpeedView, f11, false, 2, null);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: p2 */
    public View mo73244p2() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: q */
    public void mo73393q(String resourceId, String subjectId, String postId, boolean z11, boolean z12) {
        String strM96843f;
        ImmScaleView immScaleView;
        ImmSpeedView immSpeedView;
        Intrinsics.m97802h(resourceId, "resourceId");
        Intrinsics.m97802h(subjectId, "subjectId");
        Intrinsics.m97802h(postId, "postId");
        super.mo73393q(resourceId, subjectId, postId, z11, z12);
        m73402v2(subjectId);
        Fragment fragment = this.f56678b0;
        Intrinsics.m97800f(fragment, "null cannot be cast to non-null type com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment");
        C24655b logViewConfig = ((LocalVideoDetailFragment) fragment).getLogViewConfig();
        if (logViewConfig == null || (strM96843f = logViewConfig.m96843f()) == null) {
            strM96843f = "";
        }
        C28179x c28179x = this.f56679c0;
        if (c28179x != null && (immSpeedView = c28179x.f86742w) != null) {
            immSpeedView.setPageParams(strM96843f, subjectId);
        }
        C28179x c28179x2 = this.f56679c0;
        if (c28179x2 != null && (immScaleView = c28179x2.f86728i) != null) {
            immScaleView.setPageParams(strM96843f, subjectId);
        }
        m73519I3(resourceId, z12);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: q1 */
    public View mo73245q1() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86733n;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: q2 */
    public SecondariesSeekBar mo73246q2() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86711N;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: r */
    public void mo73394r(int i11, int i12) {
        super.mo73394r(i11, i12);
        C26866a.a aVar = C26866a.f81698a;
        String strM73387m1 = m73387m1();
        Intrinsics.m97801g(strM73387m1, "<get-TAG>(...)");
        C26866a.a.m104898f(aVar, strM73387m1, "addSurface, width = " + i11 + ", height = " + i12, false, 4, null);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: r1 */
    public View mo73247r1() {
        C28179x c28179x = this.f56679c0;
        if (c28179x != null) {
            return c28179x.f86732m;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: s */
    public void mo73248s(View rootView, LocalUiType uiType) {
        final String strM96843f;
        AppCompatTextView appCompatTextView;
        C22992e c22992e;
        ImmScaleView immScaleView;
        LinearLayout linearLayout;
        AppCompatTextView appCompatTextView2;
        Intrinsics.m97802h(rootView, "rootView");
        Intrinsics.m97802h(uiType, "uiType");
        if (uiType != LocalUiType.LAND) {
            return;
        }
        this.f56679c0 = C28179x.m109386a(rootView);
        super.mo73248s(rootView, uiType);
        this.f56680d0 = AbstractC5806y.m27487c();
        int iM27489e = AbstractC5806y.m27489e();
        this.f56681e0 = iM27489e;
        int i11 = this.f56680d0;
        if (iM27489e < i11) {
            this.f56681e0 = i11;
            this.f56680d0 = iM27489e;
        }
        int iM27349a = AbstractC5781d.m27349a();
        if (iM27349a > 10) {
            this.f56681e0 -= iM27349a;
        }
        Fragment fragment = this.f56678b0;
        Intrinsics.m97800f(fragment, "null cannot be cast to non-null type com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment");
        final LocalVideoDetailFragment localVideoDetailFragment = (LocalVideoDetailFragment) fragment;
        C24655b logViewConfig = localVideoDetailFragment.getLogViewConfig();
        if (logViewConfig == null || (strM96843f = logViewConfig.m96843f()) == null) {
            strM96843f = "";
        }
        C28179x c28179x = this.f56679c0;
        if (c28179x != null && (appCompatTextView2 = c28179x.f86727h) != null) {
            appCompatTextView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.layer.local.l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C16842u0.m73520J3(this.f56649a, strM96843f, localVideoDetailFragment, view);
                }
            });
        }
        this.f56696t0 = C14496b.f50966a.m65344b().getBoolean("subtitle_land_guide", true);
        m73517G3();
        m73527Q3();
        C28179x c28179x2 = this.f56679c0;
        if (c28179x2 != null && (linearLayout = c28179x2.f86736q) != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.layer.local.m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C16842u0.m73521K3(this.f56654a, view);
                }
            });
        }
        C28179x c28179x3 = this.f56679c0;
        if (c28179x3 != null && (immScaleView = c28179x3.f86728i) != null) {
            immScaleView.setOnModelChangeListener(new ImmScaleView.InterfaceC17306a() { // from class: com.transsion.postdetail.layer.local.n0
                @Override // com.transsion.postdetail.p306ui.view.ImmScaleView.InterfaceC17306a
                /* JADX INFO: renamed from: a */
                public final void mo72331a(ScaleMode scaleMode, String str) {
                    C16842u0.m73522L3(this.f56658a, scaleMode, str);
                }
            });
        }
        C28179x c28179x4 = this.f56679c0;
        if (c28179x4 != null && (c22992e = c28179x4.f86721b) != null) {
            c22992e.f70197e.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.layer.local.o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C16842u0.m73523M3(this.f56661a, view);
                }
            });
            c22992e.f70195c.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.layer.local.p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C16842u0.m73524N3(this.f56664a, view);
                }
            });
            c22992e.f70196d.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.layer.local.q0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C16842u0.m73525O3(this.f56667a, view);
                }
            });
        }
        C28179x c28179x5 = this.f56679c0;
        if (c28179x5 != null && (appCompatTextView = c28179x5.f86745z) != null) {
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.layer.local.r0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C16842u0.m73526P3(this.f56672a, strM96843f, view);
                }
            });
        }
        m73516F3();
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: s1 */
    public void mo73249s1(MotionEvent motionEvent, boolean z11) {
        if (!z11 || motionEvent == null) {
            super.mo73249s1(motionEvent, false);
            return;
        }
        int iM27489e = AbstractC5806y.m27489e() / 3;
        int rawX = (int) motionEvent.getRawX();
        if (rawX >= 0 && rawX <= iM27489e) {
            m73512B3(this, false, false, 2, null);
        } else if (rawX > iM27489e * 2) {
            m73512B3(this, true, false, 2, null);
        } else {
            super.mo73249s1(motionEvent, false);
        }
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: u2 */
    public void mo73400u2(boolean z11) {
        C22992e c22992e;
        AppCompatImageView appCompatImageView;
        super.mo73400u2(z11);
        C28179x c28179x = this.f56679c0;
        if (c28179x == null || (c22992e = c28179x.f86721b) == null || (appCompatImageView = c22992e.f70196d) == null) {
            return;
        }
        appCompatImageView.setImageResource(z11 ? R$drawable.ic_player_pause : R$drawable.ic_player_play);
    }
}
