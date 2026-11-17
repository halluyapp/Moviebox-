package com.transsion.postdetail.layer.local;

import android.R;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Html;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import ck.AbstractC5119p;
import com.avery.subtitle.widget.SimpleSubtitleView;
import com.blankj.utilcode.util.AbstractC5779c;
import com.blankj.utilcode.util.AbstractC5806y;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.kernel.utils.UrlUtils;
import com.p282tn.lib.view.InterfaceC13776s;
import com.p282tn.lib.view.SecondariesSeekBar;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14453d;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.report.C14492k;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.R$mipmap;
import com.transsion.baseui.music.MusicFloatManager;
import com.transsion.baseui.util.AbstractC14568n;
import com.transsion.baseui.util.C14557c;
import com.transsion.baseui.widget.C14582f;
import com.transsion.core.utils.C14752e;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.p285ad.monopoly.model.AdPlans;
import com.transsion.p285ad.strategy.C14057b;
import com.transsion.player.mediasession.MediaItem;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.PlayError;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.R$string;
import com.transsion.postdetail.layer.BaseLayer;
import com.transsion.postdetail.layer.SystemTimeManager;
import com.transsion.postdetail.layer.listener.LayerFlag;
import com.transsion.postdetail.p306ui.fragment.LocalVideoDetailFragment;
import com.transsion.postdetail.util.AbstractC17443m;
import com.transsion.postdetail.util.AbstractC17450t;
import com.transsion.postdetail.util.LocalFloatManager;
import com.transsion.postdetail.viewmodel.LocalVideoDetailViewModel;
import com.transsion.subtitle.VideoSubtitleControl;
import com.transsion.usercenter.setting.labelsfeedback.model.FbTvData;
import com.transsion.videofloat.bean.FloatActionType;
import com.transsion.videofloat.bean.FloatPlayType;
import com.transsion.videofloat.manager.C21106a0;
import com.transsnet.downloader.manager.C21851p;
import com.transsnet.downloader.manager.InterfaceC21842g;
import com.transsnet.downloader.util.C22094h;
import com.transsnet.downloader.util.LocalVideoNotExistUtil;
import fo.C23403e;
import io.InterfaceC24080n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import ng.AbstractC26006c;
import no.C26053g0;
import org.mvel2.ast.ASTNode;
import p438go.C23621c;
import p462hj.AbstractC23855a;
import p462hj.C23860f;
import p550kj.C24655b;
import p550kj.C24662i;
import p683po.C26906c;
import p683po.C26907d;
import p723qx.C27136c;
import p723qx.InterfaceC27135b;
import p723qx.InterfaceC27138e;
import p743rh.C27287m;
import p750rp.InterfaceC27316b;
import p755rx.C27425a;
import p824ux.InterfaceC28047a;
import p951yo.InterfaceC28989b;
import p951yo.InterfaceC28990c;
import p951yo.InterfaceC28991d;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.postdetail.layer.local.a0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC16785a0 extends BaseLayer implements InterfaceC28991d, InterfaceC16633f, C14492k.a, C14057b.a {

    /* JADX INFO: renamed from: A */
    private boolean f56472A;

    /* JADX INFO: renamed from: B */
    private View f56473B;

    /* JADX INFO: renamed from: C */
    private View f56474C;

    /* JADX INFO: renamed from: D */
    private float f56475D;

    /* JADX INFO: renamed from: E */
    private long f56476E;

    /* JADX INFO: renamed from: F */
    private final Lazy f56477F;

    /* JADX INFO: renamed from: G */
    private final Lazy f56478G;

    /* JADX INFO: renamed from: H */
    private DownloadBean f56479H;

    /* JADX INFO: renamed from: I */
    private String f56480I;

    /* JADX INFO: renamed from: J */
    private String f56481J;

    /* JADX INFO: renamed from: K */
    private String f56482K;

    /* JADX INFO: renamed from: L */
    private boolean f56483L;

    /* JADX INFO: renamed from: M */
    private InterfaceC28990c f56484M;

    /* JADX INFO: renamed from: N */
    private boolean f56485N;

    /* JADX INFO: renamed from: O */
    private boolean f56486O;

    /* JADX INFO: renamed from: P */
    private boolean f56487P;

    /* JADX INFO: renamed from: Q */
    private int f56488Q;

    /* JADX INFO: renamed from: R */
    private int f56489R;

    /* JADX INFO: renamed from: S */
    private int f56490S;

    /* JADX INFO: renamed from: T */
    private int f56491T;

    /* JADX INFO: renamed from: U */
    private final Lazy f56492U;

    /* JADX INFO: renamed from: V */
    private final Runnable f56493V;

    /* JADX INFO: renamed from: W */
    private String[] f56494W;

    /* JADX INFO: renamed from: X */
    private int f56495X;

    /* JADX INFO: renamed from: Y */
    private final Runnable f56496Y;

    /* JADX INFO: renamed from: Z */
    private final Runnable f56497Z;

    /* JADX INFO: renamed from: a0 */
    private long f56498a0;

    /* JADX INFO: renamed from: j */
    private final String f56499j;

    /* JADX INFO: renamed from: k */
    private final Fragment f56500k;

    /* JADX INFO: renamed from: l */
    private long f56501l;

    /* JADX INFO: renamed from: m */
    private final Lazy f56502m;

    /* JADX INFO: renamed from: n */
    private final Lazy f56503n;

    /* JADX INFO: renamed from: o */
    private final Lazy f56504o;

    /* JADX INFO: renamed from: p */
    private int f56505p;

    /* JADX INFO: renamed from: q */
    private int f56506q;

    /* JADX INFO: renamed from: r */
    private boolean f56507r;

    /* JADX INFO: renamed from: s */
    private SystemTimeManager f56508s;

    /* JADX INFO: renamed from: t */
    private InterfaceC28989b f56509t;

    /* JADX INFO: renamed from: u */
    private VideoSubtitleControl f56510u;

    /* JADX INFO: renamed from: v */
    private InterfaceC24080n f56511v;

    /* JADX INFO: renamed from: w */
    private C16813j1 f56512w;

    /* JADX INFO: renamed from: x */
    private String f56513x;

    /* JADX INFO: renamed from: y */
    private boolean f56514y;

    /* JADX INFO: renamed from: z */
    private boolean f56515z;

    /* JADX INFO: renamed from: com.transsion.postdetail.layer.local.a0$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56516a;

        static {
            int[] iArr = new int[LocalUiType.values().length];
            try {
                iArr[LocalUiType.MIDDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocalUiType.LAND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocalUiType.PORTRAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f56516a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.layer.local.a0$b */
    public static final class b implements C14582f.a {

        /* JADX INFO: renamed from: a */
        private long f56517a;

        /* JADX INFO: renamed from: b */
        private float f56518b;

        /* JADX INFO: renamed from: c */
        private boolean f56519c;

        /* JADX INFO: renamed from: d */
        private boolean f56520d;

        /* JADX INFO: renamed from: e */
        private boolean f56521e;

        /* JADX INFO: renamed from: f */
        private long f56522f;

        /* JADX INFO: renamed from: g */
        private float f56523g;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ boolean f56525i;

        /* JADX INFO: renamed from: j */
        final /* synthetic */ int f56526j;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f56527k;

        b(boolean z11, int i11, int i12) {
            this.f56525i = z11;
            this.f56526j = i11;
            this.f56527k = i12;
        }

        @Override // com.transsion.baseui.widget.C14582f.a
        /* JADX INFO: renamed from: a */
        public void mo65769a() {
            Group groupMo73223Z2 = AbstractC16785a0.this.mo73223Z2();
            if (groupMo73223Z2 == null || groupMo73223Z2.getVisibility() != 8) {
                AbstractC16785a0.this.m73401v1(true);
            } else {
                AbstractC16785a0.m73254B2(AbstractC16785a0.this, false, 1, null);
            }
        }

        @Override // com.transsion.baseui.widget.C14582f.a
        /* JADX INFO: renamed from: b */
        public void mo65770b(float f11, float f12) {
            long j11 = 0;
            if (!this.f56519c) {
                SecondariesSeekBar secondariesSeekBarMo73246q2 = AbstractC16785a0.this.mo73246q2();
                this.f56522f = secondariesSeekBarMo73246q2 != null ? secondariesSeekBarMo73246q2.getCurrentProgress() : 0L;
                AbstractC16785a0.this.m73351A2(false);
            }
            AbstractC16785a0.this.f56507r = true;
            this.f56519c = true;
            AbstractC16785a0.this.m73294X0().removeCallbacks(AbstractC16785a0.this.f56493V);
            float f13 = this.f56525i ? f11 - f12 : f12 - f11;
            float f14 = 10000L;
            long j12 = (long) (this.f56522f + ((f13 * f14) / (this.f56526j * 4)));
            if (j12 >= 0) {
                j11 = j12 > 10000 ? 10000L : j12;
            }
            SecondariesSeekBar secondariesSeekBarMo73246q3 = AbstractC16785a0.this.mo73246q2();
            if (secondariesSeekBarMo73246q3 != null) {
                secondariesSeekBarMo73246q3.setProgress(j11);
            }
            this.f56518b = (j11 * 1.0f) / f14;
            long jM73388n1 = (long) (AbstractC16785a0.this.m73388n1() * this.f56518b);
            this.f56517a = jM73388n1;
            AbstractC16785a0.this.f56476E = jM73388n1;
            AbstractC16785a0.this.m73305c3(true, this.f56517a);
        }

        @Override // com.transsion.baseui.widget.C14582f.a
        /* JADX INFO: renamed from: c */
        public void mo65771c(float f11, float f12) {
            InterfaceC24080n interfaceC24080n = null;
            if (!this.f56521e) {
                InterfaceC24080n interfaceC24080n2 = AbstractC16785a0.this.f56511v;
                if (interfaceC24080n2 == null) {
                    Intrinsics.m97819y("volumeControl");
                    interfaceC24080n2 = null;
                }
                interfaceC24080n2.mo95033f(false);
                InterfaceC24080n interfaceC24080n3 = AbstractC16785a0.this.f56511v;
                if (interfaceC24080n3 == null) {
                    Intrinsics.m97819y("volumeControl");
                    interfaceC24080n3 = null;
                }
                this.f56523g = interfaceC24080n3.mo95029b();
                this.f56521e = true;
            }
            float f13 = ((f11 - f12) * 2) / this.f56527k;
            InterfaceC24080n interfaceC24080n4 = AbstractC16785a0.this.f56511v;
            if (interfaceC24080n4 == null) {
                Intrinsics.m97819y("volumeControl");
            } else {
                interfaceC24080n = interfaceC24080n4;
            }
            interfaceC24080n.mo95028a(this.f56523g, f13);
        }

        @Override // com.transsion.baseui.widget.C14582f.a
        /* JADX INFO: renamed from: d */
        public void mo65772d(float f11, float f12) {
            InterfaceC24080n interfaceC24080n = null;
            if (!this.f56520d) {
                InterfaceC24080n interfaceC24080n2 = AbstractC16785a0.this.f56511v;
                if (interfaceC24080n2 == null) {
                    Intrinsics.m97819y("volumeControl");
                    interfaceC24080n2 = null;
                }
                interfaceC24080n2.mo95033f(false);
                this.f56520d = true;
            }
            InterfaceC24080n interfaceC24080n3 = AbstractC16785a0.this.f56511v;
            if (interfaceC24080n3 == null) {
                Intrinsics.m97819y("volumeControl");
            } else {
                interfaceC24080n = interfaceC24080n3;
            }
            interfaceC24080n.mo95031d(f11, f12, this.f56527k);
        }

        @Override // com.transsion.baseui.widget.C14582f.a
        /* JADX INFO: renamed from: e */
        public void mo65773e() {
            InterfaceC16634g interfaceC16634gM73086H;
            if (this.f56519c) {
                InterfaceC16634g interfaceC16634gM73086H2 = AbstractC16785a0.this.m73086H();
                if (interfaceC16634gM73086H2 != null) {
                    interfaceC16634gM73086H2.seekTo(this.f56517a);
                }
                InterfaceC16634g interfaceC16634gM73086H3 = AbstractC16785a0.this.m73086H();
                if (interfaceC16634gM73086H3 != null && !interfaceC16634gM73086H3.isPlaying() && (interfaceC16634gM73086H = AbstractC16785a0.this.m73086H()) != null) {
                    interfaceC16634gM73086H.play();
                }
                Fragment fragment = AbstractC16785a0.this.f56500k;
                LocalVideoDetailFragment localVideoDetailFragment = fragment instanceof LocalVideoDetailFragment ? (LocalVideoDetailFragment) fragment : null;
                if (localVideoDetailFragment != null) {
                    localVideoDetailFragment.m74218v3(this.f56517a, this.f56518b);
                }
                AbstractC16785a0.this.m73305c3(false, 0L);
                AbstractC16785a0.this.m73401v1(false);
            }
            AbstractC16785a0.this.f56507r = false;
            this.f56519c = false;
            this.f56520d = false;
            this.f56521e = false;
            AbstractC16785a0.this.m73358M0();
        }

        @Override // com.transsion.baseui.widget.C14582f.a
        public void onDoubleTap(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            View viewMo73371b1 = AbstractC16785a0.this.mo73371b1();
            if (viewMo73371b1 == null || !viewMo73371b1.isSelected()) {
                AbstractC16785a0.this.m73375d2(e11, true);
            }
        }

        @Override // com.transsion.baseui.widget.C14582f.a
        public void onLongPress(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            View viewMo73371b1 = AbstractC16785a0.this.mo73371b1();
            if (viewMo73371b1 == null || !viewMo73371b1.isSelected()) {
                AbstractC16785a0.this.m73357L2();
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.layer.local.a0$c */
    public static final class c implements InterfaceC13776s {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Ref.LongRef f56529b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Ref.FloatRef f56530c;

        c(Ref.LongRef longRef, Ref.FloatRef floatRef) {
            this.f56529b = longRef;
            this.f56530c = floatRef;
        }

        @Override // com.p282tn.lib.view.InterfaceC13776s
        /* JADX INFO: renamed from: a */
        public void mo62236a(SecondariesSeekBar seekBar) {
            InterfaceC16634g interfaceC16634gM73086H;
            Intrinsics.m97802h(seekBar, "seekBar");
            C26866a.a aVar = C26866a.f81698a;
            String strM73387m1 = AbstractC16785a0.this.m73387m1();
            Intrinsics.m97801g(strM73387m1, "<get-TAG>(...)");
            C26866a.a.m104898f(aVar, strM73387m1, "onStopTrackingTouch targetProgress:" + this.f56529b.element + " ", false, 4, null);
            AbstractC16785a0.this.f56507r = false;
            InterfaceC16634g interfaceC16634gM73086H2 = AbstractC16785a0.this.m73086H();
            if (interfaceC16634gM73086H2 != null) {
                interfaceC16634gM73086H2.seekTo(this.f56529b.element);
            }
            InterfaceC16634g interfaceC16634gM73086H3 = AbstractC16785a0.this.m73086H();
            if (interfaceC16634gM73086H3 != null && !interfaceC16634gM73086H3.isPlaying() && (interfaceC16634gM73086H = AbstractC16785a0.this.m73086H()) != null) {
                interfaceC16634gM73086H.play();
            }
            Fragment fragment = AbstractC16785a0.this.f56500k;
            LocalVideoDetailFragment localVideoDetailFragment = fragment instanceof LocalVideoDetailFragment ? (LocalVideoDetailFragment) fragment : null;
            if (localVideoDetailFragment != null) {
                localVideoDetailFragment.m74218v3(this.f56529b.element, this.f56530c.element);
            }
            AbstractC16785a0.this.f56476E = seekBar.getCurrentProgress();
            AbstractC16785a0.this.m73305c3(false, 0L);
            AbstractC16785a0.this.m73401v1(false);
        }

        @Override // com.p282tn.lib.view.InterfaceC13776s
        /* JADX INFO: renamed from: b */
        public void mo62237b(SecondariesSeekBar seekBar, long j11, boolean z11) {
            View viewM73379g1;
            Intrinsics.m97802h(seekBar, "seekBar");
            if (z11) {
                View viewM73379g2 = AbstractC16785a0.this.m73379g1();
                if (viewM73379g2 != null && AbstractC26006c.m102056i(viewM73379g2) && (viewM73379g1 = AbstractC16785a0.this.m73379g1()) != null) {
                    AbstractC26006c.m102054g(viewM73379g1);
                }
                AbstractC16785a0.this.f56507r = z11;
                AbstractC16785a0.this.m73294X0().removeCallbacks(AbstractC16785a0.this.f56493V);
                float f11 = j11 / 10000;
                if (AbstractC16785a0.this.m73388n1() > 0) {
                    this.f56529b.element = (long) (AbstractC16785a0.this.m73388n1() * f11);
                } else {
                    this.f56530c.element = f11;
                }
                AbstractC16785a0.this.f56476E = this.f56529b.element;
                AbstractC16785a0.this.m73305c3(true, this.f56529b.element);
            }
        }

        @Override // com.p282tn.lib.view.InterfaceC13776s
        /* JADX INFO: renamed from: c */
        public void mo62238c(SecondariesSeekBar seekBar) {
            Intrinsics.m97802h(seekBar, "seekBar");
            C26866a.a aVar = C26866a.f81698a;
            String strM73387m1 = AbstractC16785a0.this.m73387m1();
            Intrinsics.m97801g(strM73387m1, "<get-TAG>(...)");
            C26866a.a.m104898f(aVar, strM73387m1, "onStartTrackingTouch ", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.layer.local.a0$d */
    public static final class d implements SystemTimeManager.InterfaceC16779a {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final void m73409c(AbstractC16785a0 abstractC16785a0) {
            abstractC16785a0.m73308d3();
        }

        @Override // com.transsion.postdetail.layer.SystemTimeManager.InterfaceC16779a
        /* JADX INFO: renamed from: a */
        public long mo73100a() {
            FragmentActivity activity = AbstractC16785a0.this.f56500k.getActivity();
            if (activity == null) {
                return 30000L;
            }
            final AbstractC16785a0 abstractC16785a0 = AbstractC16785a0.this;
            activity.runOnUiThread(new Runnable() { // from class: com.transsion.postdetail.layer.local.b0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC16785a0.d.m73409c(abstractC16785a0);
                }
            });
            return 30000L;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.layer.local.a0$e */
    static final class e implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f56532a;

        e(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f56532a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f56532a;
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
            this.f56532a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.layer.local.a0$f */
    public static final class f implements InterfaceC28047a {
        f() {
        }

        @Override // p824ux.InterfaceC28047a
        /* JADX INFO: renamed from: a */
        public boolean mo70368a(C27425a c27425a) {
            return LocalFloatManager.f57803b.m74882l(c27425a);
        }

        @Override // p824ux.InterfaceC28047a
        /* JADX INFO: renamed from: b */
        public void mo70369b(C27425a c27425a) {
            LocalFloatManager localFloatManager = LocalFloatManager.f57803b;
            localFloatManager.m74880i();
            localFloatManager.m74883m(c27425a);
        }

        @Override // p824ux.InterfaceC28047a
        /* JADX INFO: renamed from: c */
        public void mo70370c(C27425a c27425a) {
            LocalFloatManager.f57803b.m74881j(c27425a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC16785a0(final Fragment fragment) {
        super(fragment);
        Intrinsics.m97802h(fragment, "fragment");
        this.f56499j = getClass().getSimpleName();
        this.f56500k = fragment;
        this.f56502m = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.layer.local.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC16785a0.m73336t1();
            }
        });
        this.f56503n = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.layer.local.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC16785a0.m73283R1();
            }
        });
        this.f56504o = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.layer.local.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC16785a0.m73276N0();
            }
        });
        this.f56513x = "";
        this.f56477F = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.layer.local.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC16785a0.m73325l3(fragment);
            }
        });
        this.f56478G = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.layer.local.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC16785a0.m73273L0();
            }
        });
        this.f56480I = "";
        this.f56481J = "";
        this.f56482K = "";
        this.f56488Q = 1;
        this.f56489R = 8;
        this.f56490S = 1;
        this.f56491T = 1;
        this.f56492U = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.layer.local.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC16785a0.m73278P0(fragment, this);
            }
        });
        this.f56493V = new Runnable() { // from class: com.transsion.postdetail.layer.local.f
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC16785a0.m73330o2(this.f56602a);
            }
        };
        this.f56494W = new String[]{".", "..", "..."};
        this.f56496Y = new Runnable() { // from class: com.transsion.postdetail.layer.local.g
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC16785a0.m73285S1(this.f56604a);
            }
        };
        this.f56497Z = new Runnable() { // from class: com.transsion.postdetail.layer.local.h
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC16785a0.m73262F2(this.f56607a);
            }
        };
    }

    /* JADX INFO: renamed from: A1 */
    private final void m73252A1() {
        View viewMo73197A0 = mo73197A0();
        if (viewMo73197A0 != null) {
            viewMo73197A0.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.layer.local.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC16785a0.m73261F1(this.f56471a, view);
                }
            });
        }
        ImageView imageViewMo73228f2 = mo73228f2();
        if (imageViewMo73228f2 != null) {
            imageViewMo73228f2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.layer.local.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC16785a0.m73263G1(this.f56648a, view);
                }
            });
        }
        View viewMo73244p2 = mo73244p2();
        if (viewMo73244p2 != null) {
            viewMo73244p2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.layer.local.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC16785a0.m73265H1(this.f56674a, view);
                }
            });
        }
        ImageView imageViewMo73208O0 = mo73208O0();
        if (imageViewMo73208O0 != null) {
            imageViewMo73208O0.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.layer.local.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC16785a0.m73253B1(this.f56676a, view);
                }
            });
        }
        View viewMo73233i2 = mo73233i2();
        if (viewMo73233i2 != null) {
            viewMo73233i2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.layer.local.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC16785a0.m73255C1(this.f56677a, view);
                }
            });
        }
        View viewMo73210P1 = mo73210P1();
        if (viewMo73210P1 != null) {
            viewMo73210P1.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.layer.local.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC16785a0.m73257D1(this.f56703a, view);
                }
            });
        }
        View viewMo73235j1 = mo73235j1();
        if (viewMo73235j1 != null) {
            viewMo73235j1.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.layer.local.w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC16785a0.m73259E1(this.f56704a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public static final void m73253B1(AbstractC16785a0 abstractC16785a0, View view) {
        Navigator navigatorM61857K = TheRouter.m61773c("/profile/user_center_labels_feedback").m61857K("feedback_from_page", "SUBJECT_PLAY").m61857K("subject_id", abstractC16785a0.f56482K);
        DownloadBean downloadBean = abstractC16785a0.f56479H;
        if (downloadBean != null && downloadBean.getType() == 3) {
            navigatorM61857K.m61855I("TV_DATA", new FbTvData(abstractC16785a0.f56482K, downloadBean.getSe(), downloadBean.getEp()));
        }
        Navigator.m61845x(navigatorM61857K, abstractC16785a0.f56500k.getContext(), null, 2, null);
    }

    /* JADX INFO: renamed from: B2 */
    public static /* synthetic */ void m73254B2(AbstractC16785a0 abstractC16785a0, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showBottomController");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        abstractC16785a0.m73351A2(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public static final void m73255C1(AbstractC16785a0 abstractC16785a0, View view) {
        C24662i.f75350a.m96881p("local_video_detail", abstractC16785a0.m73318h1());
        abstractC16785a0.m73321j2();
    }

    /* JADX INFO: renamed from: C2 */
    private final void m73256C2(int i11) {
        InterfaceC16634g interfaceC16634gM73086H;
        if (this.f56473B == null) {
            ViewStub viewStubMo73240m3 = mo73240m3();
            this.f56473B = viewStubMo73240m3 != null ? viewStubMo73240m3.inflate() : null;
        }
        View view = this.f56474C;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
        if (mo73225a3() == LocalUiType.MIDDLE) {
            mo73400u2(false);
        }
        if (isVisible() && (interfaceC16634gM73086H = m73086H()) != null) {
            interfaceC16634gM73086H.pause();
        }
        View view2 = this.f56473B;
        if (view2 != null) {
            AbstractC26006c.m102058k(view2);
        }
        View view3 = this.f56473B;
        if (view3 != null) {
            view3.setTag(Integer.valueOf(i11));
        }
        View view4 = this.f56473B;
        if (view4 != null) {
            ((TextView) view4.findViewById(R$id.tv_fail_left_btn)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.layer.local.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    AbstractC16785a0.m73258D2(this.f56634a, view5);
                }
            });
            ((TextView) view4.findViewById(R$id.tv_fail_right_btn)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.layer.local.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    AbstractC16785a0.m73260E2(this.f56644a, view5);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public static final void m73257D1(AbstractC16785a0 abstractC16785a0, View view) {
        abstractC16785a0.mo73376e(FloatActionType.ICON);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D2 */
    public static final void m73258D2(AbstractC16785a0 abstractC16785a0, View view) {
        abstractC16785a0.m73304c2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public static final void m73259E1(AbstractC16785a0 abstractC16785a0, View view) {
        abstractC16785a0.mo73367Y1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E2 */
    public static final void m73260E2(AbstractC16785a0 abstractC16785a0, View view) {
        C26866a.f81698a.m104921x("long_video_play", "video error，reload~~ from errorLayout click", true);
        Fragment fragment = abstractC16785a0.f56500k;
        LocalVideoDetailFragment localVideoDetailFragment = fragment instanceof LocalVideoDetailFragment ? (LocalVideoDetailFragment) fragment : null;
        if (localVideoDetailFragment != null) {
            localVideoDetailFragment.m74216n3(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public static final void m73261F1(AbstractC16785a0 abstractC16785a0, View view) {
        abstractC16785a0.mo73218V1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public static final void m73262F2(AbstractC16785a0 abstractC16785a0) {
        abstractC16785a0.f56513x = "";
        abstractC16785a0.m73256C2(0);
        abstractC16785a0.f56514y = true;
        abstractC16785a0.m73401v1(true);
        Group groupMo73223Z2 = abstractC16785a0.mo73223Z2();
        if (groupMo73223Z2 != null) {
            groupMo73223Z2.setVisibility(0);
        }
        abstractC16785a0.m73341w1(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public static final void m73263G1(AbstractC16785a0 abstractC16785a0, View view) {
        Fragment fragment = abstractC16785a0.f56500k;
        Intrinsics.m97800f(fragment, "null cannot be cast to non-null type com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment");
        C23621c c23621c = C23621c.f72132a;
        C24655b logViewConfig = ((LocalVideoDetailFragment) fragment).getLogViewConfig();
        String strM96843f = logViewConfig != null ? logViewConfig.m96843f() : null;
        String str = abstractC16785a0.f56482K;
        DownloadBean downloadBean = abstractC16785a0.f56479H;
        c23621c.m93451a(strM96843f, str, downloadBean != null ? downloadBean.getOps() : null, false);
        m73310e2(abstractC16785a0, null, false, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G2 */
    public static final Unit m73264G2(AbstractC16785a0 abstractC16785a0, boolean z11) {
        if (z11) {
            InterfaceC28989b interfaceC28989b = abstractC16785a0.f56509t;
            if (interfaceC28989b != null) {
                interfaceC28989b.mo74225c(abstractC16785a0.f56479H);
            }
            FragmentActivity activity = abstractC16785a0.f56500k.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H1 */
    public static final void m73265H1(AbstractC16785a0 abstractC16785a0, View view) {
        abstractC16785a0.mo73367Y1();
    }

    /* JADX INFO: renamed from: H2 */
    private final void m73266H2() {
        InterfaceC28989b interfaceC28989b;
        View view = this.f56473B;
        if (view == null || view.getVisibility() != 0) {
            if (mo73225a3() == LocalUiType.MIDDLE) {
                m73401v1(true);
            } else {
                m73351A2(false);
            }
            mo73400u2(false);
            C16813j1 c16813j1 = this.f56512w;
            if (c16813j1 != null) {
                c16813j1.m73487d();
            }
            if (isVisible() && (interfaceC28989b = this.f56509t) != null) {
                interfaceC28989b.mo74226d(this.f56479H);
            }
            if (this.f56474C == null) {
                ViewStub viewStubMo73243n3 = mo73243n3();
                this.f56474C = viewStubMo73243n3 != null ? viewStubMo73243n3.inflate() : null;
            }
            View view2 = this.f56474C;
            if (view2 != null) {
                AbstractC26006c.m102058k(view2);
            }
            View view3 = this.f56474C;
            if (view3 != null) {
                mo73368Z1();
                ((TextView) view3.findViewById(R$id.tv_replay)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.layer.local.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        AbstractC16785a0.m73268I2(this.f56671a, view4);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: I1 */
    private final void m73267I1() {
        this.f56512w = new C16813j1(mo73221X2(), mo73222Y2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public static final void m73268I2(AbstractC16785a0 abstractC16785a0, View view) {
        abstractC16785a0.mo73382i3();
    }

    /* JADX INFO: renamed from: J0 */
    private final void m73269J0() {
        ViewGroup viewGroupMo73201D0;
        boolean zM73338u1 = m73338u1();
        View viewMo73233i2 = mo73233i2();
        if (viewMo73233i2 != null) {
            viewMo73233i2.setVisibility(zM73338u1 ? 0 : 8);
        }
        if (zM73338u1 && (viewGroupMo73201D0 = mo73201D0()) != null && viewGroupMo73201D0.getVisibility() == 0) {
            C24662i.f75350a.m96872D("local_video_detail", m73318h1());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("vis = ");
        sb2.append(zM73338u1);
    }

    /* JADX INFO: renamed from: J1 */
    private final void m73270J1() {
        Ref.LongRef longRef = new Ref.LongRef();
        Ref.FloatRef floatRef = new Ref.FloatRef();
        SecondariesSeekBar secondariesSeekBarMo73246q2 = mo73246q2();
        if (secondariesSeekBarMo73246q2 != null) {
            secondariesSeekBarMo73246q2.setMax(10000L);
        }
        SecondariesSeekBar secondariesSeekBarMo73246q3 = mo73246q2();
        if (secondariesSeekBarMo73246q3 != null) {
            secondariesSeekBarMo73246q3.setOnSeekBarChangeListener(new c(longRef, floatRef));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K1 */
    public static final Unit m73271K1(AbstractC16785a0 abstractC16785a0, List list) {
        if (list == null || list.isEmpty()) {
            return Unit.f75682a;
        }
        C26866a.a aVar = C26866a.f81698a;
        String TAG = abstractC16785a0.f56499j;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "2--fragment, on get series from local, size = " + list.size() + ", uiType = " + abstractC16785a0.mo73225a3(), false, 4, null);
        abstractC16785a0.m73269J0();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: K2 */
    private final void m73272K2() {
        m73275M2();
        m73300a1().post(this.f56496Y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final InterfaceC21842g m73273L0() {
        return C21851p.f67672a.m88759a(Utils.m27275a());
    }

    /* JADX INFO: renamed from: L1 */
    private final void m73274L1() {
        this.f56508s = new SystemTimeManager(new d());
    }

    /* JADX INFO: renamed from: M2 */
    private final void m73275M2() {
        m73300a1().removeCallbacks(this.f56496Y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final Handler m73276N0() {
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.m97799e(looperMyLooper);
        return new Handler(looperMyLooper);
    }

    /* JADX INFO: renamed from: N1 */
    private final boolean m73277N1() {
        Fragment fragment = this.f56500k;
        Intrinsics.m97800f(fragment, "null cannot be cast to non-null type com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment");
        return ((LocalVideoDetailFragment) fragment).getIsAdShowing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final C14582f m73278P0(Fragment fragment, AbstractC16785a0 abstractC16785a0) {
        return new C14582f(fragment.requireContext(), abstractC16785a0.mo73212Q0());
    }

    /* JADX INFO: renamed from: Q1 */
    private final void m73280Q1() {
        m73300a1().postDelayed(this.f56496Y, 1000L);
    }

    /* JADX INFO: renamed from: R0 */
    private final Intent m73282R0() {
        Intent intent = new Intent();
        intent.putExtra("path", "/video/detail");
        intent.putExtra("id", this.f56482K);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R1 */
    public static final Handler m73283R1() {
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.m97799e(looperMyLooper);
        return new Handler(looperMyLooper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S1 */
    public static final void m73285S1(AbstractC16785a0 abstractC16785a0) {
        int i11 = abstractC16785a0.f56495X;
        boolean zMo88665B = false;
        if (i11 >= 2) {
            abstractC16785a0.f56495X = 0;
        } else {
            abstractC16785a0.f56495X = i11 + 1;
        }
        TextView textViewMo73205H0 = abstractC16785a0.mo73205H0();
        if (textViewMo73205H0 != null) {
            textViewMo73205H0.setText(Utils.m27275a().getString(R$string.play_loading) + abstractC16785a0.f56494W[abstractC16785a0.f56495X]);
        }
        if (abstractC16785a0.f56479H != null) {
            InterfaceC21842g interfaceC21842gM73362T0 = abstractC16785a0.m73362T0();
            DownloadBean downloadBean = abstractC16785a0.f56479H;
            Intrinsics.m97799e(downloadBean);
            zMo88665B = interfaceC21842gM73362T0.mo88665B(downloadBean);
        }
        if (abstractC16785a0.f56513x.length() > 0 && !zMo88665B) {
            abstractC16785a0.f56513x = "";
        }
        TextView textViewMo73204G0 = abstractC16785a0.mo73204G0();
        if (textViewMo73204G0 != null) {
            String str = abstractC16785a0.f56513x;
            textViewMo73204G0.setText(str.length() != 0 ? str : "");
        }
        abstractC16785a0.m73280Q1();
    }

    /* JADX INFO: renamed from: U0 */
    private final Handler m73288U0() {
        return (Handler) this.f56504o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public static final void m73289U1(AbstractC16785a0 abstractC16785a0) {
        try {
            Result.Companion companion = Result.INSTANCE;
            InterfaceC16634g interfaceC16634gM73086H = abstractC16785a0.m73086H();
            if (interfaceC16634gM73086H != null && interfaceC16634gM73086H.isPlaying()) {
                C26866a.a.m104898f(C26866a.f81698a, "VideoFloat-pip", "onAdClick resume auto pip", false, 4, null);
                abstractC16785a0.m73373b3(true);
            }
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: V0 */
    private final C27425a m73291V0() {
        DownloadBean downloadBean = this.f56479H;
        C27425a c27425a = null;
        if (downloadBean == null) {
            return null;
        }
        if (m73087I() != null && m73086H() != null) {
            C26866a.a aVar = C26866a.f81698a;
            aVar.m104912c("VideoFloat", "local--showFloat, name:" + downloadBean.getTotalTitleName(), true);
            ArrayList arrayList = new ArrayList();
            if (downloadBean.isSeries()) {
                List arrayList2 = (List) m73390o1().m75013i().m14847f();
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                Iterator it = arrayList2.iterator();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i12 = -1;
                        break;
                    }
                    if (Intrinsics.m97797c(((DownloadBean) it.next()).getResourceId(), downloadBean.getResourceId())) {
                        break;
                    }
                    i12++;
                }
                C26866a.f81698a.m104912c("VideoFloat", "local--showFloat, 电视剧:" + i12, true);
                if (i12 >= 0) {
                    arrayList.addAll(arrayList2);
                } else {
                    List list = arrayList2;
                    int size = list.size();
                    int i13 = 0;
                    while (i11 < size && ((DownloadBean) arrayList2.get(i11)).getEp() < downloadBean.getEp()) {
                        i13 = i11 + 1;
                        i11 = i13;
                    }
                    arrayList.addAll(list);
                    if (arrayList2.size() <= i13) {
                        arrayList.add(downloadBean);
                    } else {
                        arrayList.add(i13, downloadBean);
                    }
                }
            } else {
                aVar.m104912c("VideoFloat", "local--showFloat, 电影", true);
                arrayList.add(downloadBean);
            }
            LocalFloatManager.f57803b.m74884p(arrayList);
            ORPlayerView oRPlayerViewM73087I = m73087I();
            Intrinsics.m97799e(oRPlayerViewM73087I);
            InterfaceC16634g interfaceC16634gM73086H = m73086H();
            Intrinsics.m97799e(interfaceC16634gM73086H);
            ViewGroup viewGroupMo73217U2 = mo73217U2();
            Intrinsics.m97799e(viewGroupMo73217U2);
            FloatPlayType floatPlayType = FloatPlayType.LOCAL;
            String subjectId = downloadBean.getSubjectId();
            if (subjectId == null) {
                subjectId = "";
            }
            c27425a = new C27425a(oRPlayerViewM73087I, interfaceC16634gM73086H, viewGroupMo73217U2, floatPlayType, subjectId, downloadBean.getSe(), downloadBean.getEp(), "", "local_video_detail");
            c27425a.m106612G(downloadBean.getResourceId());
            c27425a.m106615J(Integer.valueOf(downloadBean.getSubjectType()));
            c27425a.m106608C(AbstractC17450t.m74976b(c27425a.m106619b()));
            c27425a.m106606A(downloadBean.getOps());
            c27425a.m106610E(downloadBean.getPostId());
            c27425a.m106607B(downloadBean.getPageFrom());
        }
        return c27425a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public final Handler m73294X0() {
        return (Handler) this.f56502m.getValue();
    }

    /* JADX INFO: renamed from: X1 */
    private final void m73295X1(long j11) {
        List list;
        long j12 = this.f56501l;
        if (j12 <= 0 || j12 - j11 >= 5000) {
            return;
        }
        List list2 = (List) m73390o1().m75013i().m14847f();
        if (!this.f56483L || (list = list2) == null || list.isEmpty() || this.f56485N) {
            return;
        }
        this.f56485N = true;
        int size = list.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            DownloadBean downloadBean = (DownloadBean) list2.get(i11);
            String resourceId = downloadBean.getResourceId();
            DownloadBean downloadBean2 = this.f56479H;
            if (Intrinsics.m97797c(resourceId, downloadBean2 != null ? downloadBean2.getResourceId() : null)) {
                z11 = true;
            } else if (z11) {
                m73324l2(downloadBean);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: Z0 */
    private final Intent m73298Z0() {
        InterfaceC27316b interfaceC27316b = (InterfaceC27316b) TheRouter.m61774d(InterfaceC27316b.class, new Object[0]);
        DownloadBean downloadBean = this.f56479H;
        boolean zIsCompleted = downloadBean != null ? downloadBean.isCompleted() : false;
        StringBuilder sb2 = new StringBuilder("oneroom://com.community.oneroom?type=");
        sb2.append("/video/detail");
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("extra_resource_id");
        sb2.append(UrlUtils.EQUAL_MARK);
        DownloadBean downloadBean2 = this.f56479H;
        sb2.append(downloadBean2 != null ? downloadBean2.getResourceId() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("extra_local_path");
        sb2.append(UrlUtils.EQUAL_MARK);
        DownloadBean downloadBean3 = this.f56479H;
        sb2.append(downloadBean3 != null ? downloadBean3.getPath() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("extra_url");
        sb2.append(UrlUtils.EQUAL_MARK);
        DownloadBean downloadBean4 = this.f56479H;
        sb2.append(downloadBean4 != null ? downloadBean4.getUrl() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("extra_page_from");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append("media_notification");
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("extra_completed");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(zIsCompleted);
        if (interfaceC27316b == null) {
            return null;
        }
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        Intent intentMo94643a = interfaceC27316b.mo94643a(applicationM27275a);
        if (intentMo94643a == null) {
            return null;
        }
        intentMo94643a.addFlags(603979776);
        intentMo94643a.setData(Uri.parse(sb2.toString()));
        return intentMo94643a;
    }

    /* JADX INFO: renamed from: a1 */
    private final Handler m73300a1() {
        return (Handler) this.f56503n.getValue();
    }

    /* JADX INFO: renamed from: c1 */
    private final MediaItem m73303c1() {
        DownloadBean downloadBean = this.f56479H;
        String totalTitleName = downloadBean != null ? downloadBean.getTotalTitleName() : null;
        DownloadBean downloadBean2 = this.f56479H;
        String subjectId = downloadBean2 != null ? downloadBean2.getSubjectId() : null;
        DownloadBean downloadBean3 = this.f56479H;
        String cover = downloadBean3 != null ? downloadBean3.getCover() : null;
        DownloadBean downloadBean4 = this.f56479H;
        String resourceId = downloadBean4 != null ? downloadBean4.getResourceId() : null;
        PendingIntent pendingIntentM73307d1 = m73307d1();
        Intent intentM73282R0 = m73282R0();
        DownloadBean downloadBean5 = this.f56479H;
        boolean z11 = false;
        if (downloadBean5 != null && downloadBean5.getType() == 6) {
            z11 = true;
        }
        return new MediaItem(totalTitleName, "", cover, null, null, null, pendingIntentM73307d1, intentM73282R0, subjectId, resourceId, Boolean.valueOf(z11), null, null, null, 14392, null);
    }

    /* JADX INFO: renamed from: c2 */
    private final void m73304c2() {
        Utils.m27275a().startActivity(new Intent("android.settings.WIFI_SETTINGS").setFlags(ASTNode.DEOP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c3 */
    public final void m73305c3(boolean z11, long j11) {
        this.f56472A = z11;
        View view = this.f56473B;
        if (view == null || view.getVisibility() != 0) {
            if (!z11) {
                VideoSubtitleControl videoSubtitleControl = this.f56510u;
                if (videoSubtitleControl != null) {
                    videoSubtitleControl.m81884T();
                }
                TextView textViewMo73206I0 = mo73206I0();
                if (textViewMo73206I0 != null) {
                    textViewMo73206I0.setVisibility(8);
                }
                View viewMo73203F0 = mo73203F0();
                if (viewMo73203F0 != null) {
                    viewMo73203F0.setVisibility(this.f56515z ? 0 : 8);
                    return;
                }
                return;
            }
            TextView textViewMo73206I1 = mo73206I0();
            if (textViewMo73206I1 != null) {
                textViewMo73206I1.setVisibility(0);
            }
            TextView textViewMo73206I2 = mo73206I0();
            if (textViewMo73206I2 != null) {
                FragmentActivity activity = this.f56500k.getActivity();
                textViewMo73206I2.setText(Html.fromHtml(activity != null ? activity.getString(R$string.post_progress_tx_style, AbstractC17443m.m74969d(j11), AbstractC17443m.m74969d(this.f56501l)) : null));
            }
            VideoSubtitleControl videoSubtitleControl2 = this.f56510u;
            if (videoSubtitleControl2 != null) {
                videoSubtitleControl2.m81895q0(j11);
            }
            View viewMo73203F1 = mo73203F0();
            if (viewMo73203F1 != null) {
                viewMo73203F1.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: d1 */
    private final PendingIntent m73307d1() {
        return PendingIntent.getActivity(Utils.m27275a(), 0, m73298Z0(), m73313f1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d3 */
    public final void m73308d3() {
        TextView textViewMo73231h2 = mo73231h2();
        if (textViewMo73231h2 != null) {
            textViewMo73231h2.setText(AbstractC17450t.m74978d());
        }
    }

    /* JADX INFO: renamed from: e2 */
    public static /* synthetic */ void m73310e2(AbstractC16785a0 abstractC16785a0, MotionEvent motionEvent, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
        }
        if ((i11 & 1) != 0) {
            motionEvent = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        abstractC16785a0.m73375d2(motionEvent, z11);
    }

    /* JADX INFO: renamed from: e3 */
    private final void m73311e3(long j11) {
        SecondariesSeekBar secondariesSeekBarMo73246q2;
        VideoSubtitleControl videoSubtitleControl = this.f56510u;
        if (videoSubtitleControl != null) {
            videoSubtitleControl.m81895q0(j11);
        }
        if (this.f56501l <= 0) {
            InterfaceC16634g interfaceC16634gM73086H = m73086H();
            if (interfaceC16634gM73086H == null) {
                return;
            } else {
                this.f56501l = interfaceC16634gM73086H.getDuration();
            }
        }
        if (!this.f56507r) {
            long j12 = this.f56501l;
            if (j12 > 0) {
                long j13 = (int) ((j11 / j12) * 10000);
                if (j13 >= this.f56476E && (secondariesSeekBarMo73246q2 = mo73246q2()) != null) {
                    secondariesSeekBarMo73246q2.setProgress(j13);
                }
            }
        }
        m73314f3(j11, this.f56501l);
    }

    /* JADX INFO: renamed from: f1 */
    private final int m73313f1() {
        if (Build.VERSION.SDK_INT >= 31) {
            return 67108864;
        }
        return ASTNode.NOJIT;
    }

    /* JADX INFO: renamed from: f3 */
    private final void m73314f3(long j11, long j12) {
        TextView textViewMo73232h3 = mo73232h3();
        if (textViewMo73232h3 != null) {
            textViewMo73232h3.setText(AbstractC17443m.m74969d(this.f56501l));
            TextView textViewMo73239k3 = mo73239k3();
            if (textViewMo73239k3 != null) {
                textViewMo73239k3.setText(AbstractC17443m.m74969d(j11));
                return;
            }
            return;
        }
        String str = AbstractC17443m.m74969d(j11) + "/" + AbstractC17443m.m74969d(j12);
        TextView textViewMo73239k4 = mo73239k3();
        if (textViewMo73239k4 != null) {
            textViewMo73239k4.setText(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX INFO: renamed from: g3 */
    private final void m73316g3() {
        DownloadBean downloadBean;
        String name;
        String subjectName;
        DownloadBean downloadBean2;
        String subjectName2;
        DownloadBean downloadBean3 = this.f56479H;
        boolean z11 = false;
        if (downloadBean3 == null || !downloadBean3.isSeries() || (downloadBean2 = this.f56479H) == null || (subjectName2 = downloadBean2.getSubjectName()) == null || subjectName2.length() <= 0) {
            DownloadBean downloadBean4 = this.f56479H;
            if ((downloadBean4 != null ? downloadBean4.getResolution() : 0) <= 0) {
                downloadBean = this.f56479H;
                if (downloadBean != null || (name = downloadBean.getName()) == null) {
                    name = "";
                }
            } else {
                DownloadBean downloadBean5 = this.f56479H;
                if (downloadBean5 != null && (subjectName = downloadBean5.getSubjectName()) != null) {
                    if (subjectName.length() > 0) {
                        z11 = true;
                    }
                }
                if (z11) {
                    DownloadBean downloadBean6 = this.f56479H;
                    Integer numValueOf = downloadBean6 != null ? Integer.valueOf(downloadBean6.getResolution()) : null;
                    DownloadBean downloadBean7 = this.f56479H;
                    name = numValueOf + "P " + (downloadBean7 != null ? downloadBean7.getSubjectName() : null);
                } else {
                    downloadBean = this.f56479H;
                    if (downloadBean != null) {
                        name = "";
                    } else {
                        name = "";
                    }
                }
            }
        } else {
            DownloadBean downloadBean8 = this.f56479H;
            String subjectName3 = downloadBean8 != null ? downloadBean8.getSubjectName() : null;
            DownloadBean downloadBean9 = this.f56479H;
            name = subjectName3 + " " + (downloadBean9 != null ? DownloadBean.getEpTitleName$default(downloadBean9, false, 1, null) : null);
        }
        updateTitle(name);
    }

    /* JADX INFO: renamed from: h1 */
    private final Map m73318h1() {
        Pair pair = new Pair("module_name", "play_next");
        Pair pair2 = new Pair("subject_id", this.f56482K);
        DownloadBean downloadBean = this.f56479H;
        return MapsKt.m97577l(pair, pair2, new Pair("ops", downloadBean != null ? downloadBean.getOps() : null), new Pair("resource_id", this.f56481J));
    }

    /* JADX INFO: renamed from: j2 */
    private final boolean m73321j2() {
        if (this.f56486O) {
            return true;
        }
        List list = (List) m73390o1().m75013i().m14847f();
        if (list != null && this.f56483L) {
            List list2 = list;
            if (!list2.isEmpty()) {
                int size = list2.size();
                boolean z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    DownloadBean downloadBean = (DownloadBean) list.get(i11);
                    String resourceId = downloadBean.getResourceId();
                    DownloadBean downloadBean2 = this.f56479H;
                    if (Intrinsics.m97797c(resourceId, downloadBean2 != null ? downloadBean2.getResourceId() : null)) {
                        z11 = true;
                    } else if (z11 && downloadBean.getCanPlay()) {
                        if (downloadBean.isCompleted() && !downloadBean.isFileExist()) {
                            return false;
                        }
                        m73395r2(downloadBean, false);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l2 */
    private final void m73324l2(DownloadBean downloadBean) {
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.f56499j;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "onPlayProgress next tips name = " + downloadBean.getName() + ", epse = " + downloadBean.getEpse() + ", status = " + downloadBean.getStatus() + " ", false, 4, null);
        if (downloadBean.getCanPlay()) {
            DownloadBean downloadBean2 = this.f56479H;
            if (downloadBean2 != null && downloadBean2.getStatus() == 5 && downloadBean.getStatus() != 5) {
                m73362T0().mo88679k(downloadBean);
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
            String string = Utils.m27275a().getString(R$string.series_next_play_tips);
            Intrinsics.m97801g(string, "getString(...)");
            String subjectName = downloadBean.getSubjectName();
            if (subjectName == null) {
                subjectName = "";
            }
            String str = String.format(string, Arrays.copyOf(new Object[]{subjectName, downloadBean.getEp() > 0 ? AbstractC14568n.m65701b(downloadBean.getEp(), downloadBean.getSe(), true) : AbstractC14568n.m65702c(downloadBean.getEpse(), true)}, 2));
            Intrinsics.m97801g(str, "format(...)");
            mo73380i(str, 3000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l3 */
    public static final LocalVideoDetailViewModel m73325l3(Fragment fragment) {
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        return (LocalVideoDetailViewModel) new C3227v0(fragmentActivityRequireActivity, new C3227v0.d()).m14969a(LocalVideoDetailViewModel.class);
    }

    /* JADX INFO: renamed from: m2 */
    private final void m73327m2(ORPlayerView oRPlayerView) {
        ViewParent parent = oRPlayerView.getParent();
        if (parent instanceof FrameLayout) {
            ((FrameLayout) parent).removeView(oRPlayerView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public static final void m73330o2(AbstractC16785a0 abstractC16785a0) {
        abstractC16785a0.m73344x1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final Handler m73336t1() {
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.m97799e(looperMyLooper);
        return new Handler(looperMyLooper);
    }

    /* JADX INFO: renamed from: u1 */
    private final boolean m73338u1() {
        List list = (List) m73390o1().m75013i().m14847f();
        if (list != null && this.f56483L) {
            List list2 = list;
            if (!list2.isEmpty()) {
                int size = list2.size();
                boolean z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    DownloadBean downloadBean = (DownloadBean) list.get(i11);
                    String resourceId = downloadBean.getResourceId();
                    DownloadBean downloadBean2 = this.f56479H;
                    if (Intrinsics.m97797c(resourceId, downloadBean2 != null ? downloadBean2.getResourceId() : null)) {
                        z11 = true;
                    } else if (z11 && downloadBean.getCanPlay()) {
                        return !downloadBean.isCompleted() || downloadBean.isFileExist();
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w1 */
    private final void m73341w1(boolean z11) {
        if (!z11) {
            FrameLayout frameLayoutMo73236j3 = mo73236j3();
            if (frameLayoutMo73236j3 != null) {
                AbstractC26006c.m102058k(frameLayoutMo73236j3);
                return;
            }
            return;
        }
        SimpleSubtitleView simpleSubtitleViewMo73215S2 = mo73215S2();
        if (simpleSubtitleViewMo73215S2 != null) {
            AbstractC26006c.m102055h(simpleSubtitleViewMo73215S2);
        }
        FrameLayout frameLayoutMo73236j4 = mo73236j3();
        if (frameLayoutMo73236j4 != null) {
            AbstractC26006c.m102054g(frameLayoutMo73236j4);
        }
        mo73355J2(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public static final Unit m73342w2(AbstractC16785a0 abstractC16785a0, boolean z11) {
        ProgressBar progressBarMo73211P2 = abstractC16785a0.mo73211P2();
        if (progressBarMo73211P2 != null) {
            progressBarMo73211P2.setVisibility(z11 ? 0 : 8);
        }
        ImageView imageViewMo73209O2 = abstractC16785a0.mo73209O2();
        if (imageViewMo73209O2 != null) {
            imageViewMo73209O2.setVisibility(z11 ? 8 : 0);
        }
        TextView textViewMo73213Q2 = abstractC16785a0.mo73213Q2();
        if (textViewMo73213Q2 != null) {
            textViewMo73213Q2.setText(Utils.m27275a().getString(z11 ? R$string.play_loading : R$string.turn_on_short));
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: x1 */
    private final void m73344x1() {
        Group groupMo73223Z2;
        ViewGroup viewGroupMo73201D0;
        if (!mo73199C0() && (viewGroupMo73201D0 = mo73201D0()) != null) {
            viewGroupMo73201D0.setVisibility(8);
        }
        if (!this.f56514y && (groupMo73223Z2 = mo73223Z2()) != null) {
            groupMo73223Z2.setVisibility(8);
        }
        View viewMo73197A0 = mo73197A0();
        if (viewMo73197A0 != null) {
            viewMo73197A0.setVisibility(8);
        }
        ViewGroup viewGroupMo73202E0 = mo73202E0();
        if (viewGroupMo73202E0 != null) {
            viewGroupMo73202E0.setVisibility(8);
        }
        ViewGroup viewGroupMo73229g2 = mo73229g2();
        if (viewGroupMo73229g2 != null) {
            viewGroupMo73229g2.setVisibility(8);
        }
        View viewMo73247r1 = mo73247r1();
        if (viewMo73247r1 != null) {
            viewMo73247r1.setVisibility(8);
        }
        View viewMo73245q1 = mo73245q1();
        if (viewMo73245q1 != null) {
            viewMo73245q1.setVisibility(8);
        }
        View viewMo73371b1 = mo73371b1();
        if (viewMo73371b1 != null) {
            viewMo73371b1.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x2 */
    public static final Unit m73345x2(AbstractC16785a0 abstractC16785a0, View switchView, boolean z11) {
        Intrinsics.m97802h(switchView, "switchView");
        abstractC16785a0.m73372b2(switchView, z11);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public static final Unit m73347y1(AbstractC16785a0 abstractC16785a0, Subject subject) {
        abstractC16785a0.mo73198B0(subject);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public static final Unit m73348y2(AbstractC16785a0 abstractC16785a0, View settingView) {
        Intrinsics.m97802h(settingView, "settingView");
        abstractC16785a0.mo73369a2(settingView);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: z1 */
    private final void m73349z1() {
        InterfaceC24080n.a aVar = InterfaceC24080n.f73421a;
        Context contextRequireContext = this.f56500k.requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        InterfaceC24080n interfaceC24080nM95036a = aVar.m95036a(contextRequireContext, mo73242n2());
        this.f56511v = interfaceC24080nM95036a;
        if (interfaceC24080nM95036a == null) {
            Intrinsics.m97819y("volumeControl");
            interfaceC24080nM95036a = null;
        }
        interfaceC24080nM95036a.mo95034g();
        boolean zM102053f = AbstractC26006c.m102053f();
        int iM27487c = AbstractC5806y.m27487c();
        int iM27489e = AbstractC5806y.m27489e();
        int i11 = a.f56516a[mo73225a3().ordinal()];
        if (i11 != 1) {
            if (i11 == 3) {
            }
            m73364W0().m65768s(new b(zM102053f, iM27487c, iM27489e));
        }
        iM27487c = (iM27489e * 9) / 16;
        iM27489e = iM27487c;
        iM27487c = iM27489e;
        m73364W0().m65768s(new b(zM102053f, iM27487c, iM27489e));
    }

    @Override // p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: A */
    public void mo73350A() {
        String playingUrl;
        InterfaceC28991d.a.m111505e(this);
        if (C27136c.f82250a.m105602c(m73086H())) {
            return;
        }
        if (C21106a0.f66016a.m86579c(m73086H())) {
            C26866a.a aVar = C26866a.f81698a;
            String TAG = this.f56499j;
            Intrinsics.m97801g(TAG, "TAG");
            aVar.m104912c(TAG, "local 播放器在缓存中，这里不能release", true);
            return;
        }
        InterfaceC16634g interfaceC16634gM73086H = m73086H();
        if (interfaceC16634gM73086H != null) {
            DownloadBean downloadBean = this.f56479H;
            interfaceC16634gM73086H.release((downloadBean == null || (playingUrl = downloadBean.getPlayingUrl()) == null) ? null : Integer.valueOf(playingUrl.hashCode()).toString());
        }
    }

    /* JADX INFO: renamed from: A0 */
    public abstract View mo73197A0();

    /* JADX INFO: renamed from: A2 */
    public void m73351A2(boolean z11) {
        View viewFindViewById;
        if (this.f56514y || this.f56487P || !AbstractC5779c.m27333j()) {
            return;
        }
        View viewMo73371b1 = mo73371b1();
        if (viewMo73371b1 != null) {
            if (viewMo73371b1.isSelected()) {
                viewMo73371b1.setVisibility(viewMo73371b1.getVisibility() == 0 ? 8 : 0);
                return;
            }
            viewMo73371b1.setVisibility(0);
        }
        m73294X0().removeCallbacks(this.f56493V);
        if (z11) {
            m73401v1(false);
        }
        ViewGroup viewGroupMo73201D0 = mo73201D0();
        if (viewGroupMo73201D0 != null) {
            viewGroupMo73201D0.setVisibility(0);
        }
        Group groupMo73223Z2 = mo73223Z2();
        if (groupMo73223Z2 != null) {
            groupMo73223Z2.setVisibility(0);
        }
        ViewGroup viewGroupMo73229g2 = mo73229g2();
        if (viewGroupMo73229g2 != null) {
            viewGroupMo73229g2.setVisibility(0);
        }
        View viewMo73247r1 = mo73247r1();
        if (viewMo73247r1 != null) {
            viewMo73247r1.setVisibility(0);
        }
        View viewMo73197A0 = mo73197A0();
        if (viewMo73197A0 != null) {
            viewMo73197A0.setVisibility(0);
        }
        View viewMo73245q1 = mo73245q1();
        if (viewMo73245q1 != null) {
            viewMo73245q1.setVisibility(0);
        }
        ViewGroup viewGroupMo73202E0 = mo73202E0();
        if (viewGroupMo73202E0 != null) {
            viewGroupMo73202E0.setVisibility(0);
        }
        ConstraintLayout constraintLayoutMo73242n2 = mo73242n2();
        if (constraintLayoutMo73242n2 == null || (viewFindViewById = constraintLayoutMo73242n2.findViewById(R.id.message)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    @Override // p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: B */
    public void mo73352B(VideoSubtitleControl control) {
        Intrinsics.m97802h(control, "control");
        this.f56510u = control;
        control.m81886Z(AbstractC17450t.m74977c(mo73225a3()), mo73214R2(), mo73219V2(), mo73216T2(), mo73207N2(), true);
        control.m81892i0(new Function1() { // from class: com.transsion.postdetail.layer.local.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC16785a0.m73342w2(this.f56657a, ((Boolean) obj).booleanValue());
            }
        });
        control.m81875E(AbstractC17450t.m74977c(mo73225a3()), new Function2() { // from class: com.transsion.postdetail.layer.local.o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC16785a0.m73345x2(this.f56660a, (View) obj, ((Boolean) obj2).booleanValue());
            }
        }, new Function1() { // from class: com.transsion.postdetail.layer.local.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC16785a0.m73348y2(this.f56663a, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B0 */
    protected void mo73198B0(Subject subject) {
    }

    @Override // p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: C */
    public void mo73353C(int i11) {
        InterfaceC28991d.a.m111514n(this, i11);
    }

    /* JADX INFO: renamed from: C0 */
    public abstract boolean mo73199C0();

    /* JADX INFO: renamed from: D */
    public void mo73200D(DownloadBean downloadBean) {
        InterfaceC28991d.a.m111503c(this, downloadBean);
    }

    /* JADX INFO: renamed from: D0 */
    public abstract ViewGroup mo73201D0();

    @Override // p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: E */
    public void mo73354E(InterfaceC28990c event) {
        Intrinsics.m97802h(event, "event");
        this.f56484M = event;
    }

    /* JADX INFO: renamed from: E0 */
    public abstract ViewGroup mo73202E0();

    /* JADX INFO: renamed from: F0 */
    public abstract View mo73203F0();

    /* JADX INFO: renamed from: G0 */
    public abstract TextView mo73204G0();

    /* JADX INFO: renamed from: H0 */
    public abstract TextView mo73205H0();

    /* JADX INFO: renamed from: I0 */
    public abstract TextView mo73206I0();

    /* JADX INFO: renamed from: J2 */
    protected void mo73355J2(boolean z11) {
        View viewMo73203F0;
        if (this.f56515z == z11) {
            return;
        }
        this.f56515z = z11;
        if (z11) {
            if (!this.f56472A && (viewMo73203F0 = mo73203F0()) != null) {
                viewMo73203F0.setVisibility(0);
            }
            m73272K2();
            return;
        }
        m73275M2();
        View viewMo73203F1 = mo73203F0();
        if (viewMo73203F1 != null) {
            viewMo73203F1.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: K0 */
    protected final void m73356K0() {
        if (m73321j2()) {
            return;
        }
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.f56499j;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "onCompletion, showReplay", false, 4, null);
        m73266H2();
    }

    /* JADX INFO: renamed from: L2 */
    public final void m73357L2() {
        InterfaceC16634g interfaceC16634gM73086H = m73086H();
        if (interfaceC16634gM73086H == null || interfaceC16634gM73086H.isPlaying()) {
            this.f56498a0 = SystemClock.elapsedRealtime();
            this.f56475D = C14453d.f50863a.m65162d();
            InterfaceC16634g interfaceC16634gM73086H2 = m73086H();
            if (interfaceC16634gM73086H2 != null) {
                interfaceC16634gM73086H2.setSpeed(this.f56475D * 2.0f);
            }
            m73344x1();
            m73401v1(true);
            View viewMo73238k2 = mo73238k2();
            if (viewMo73238k2 != null) {
                AbstractC26006c.m102058k(viewMo73238k2);
            }
            String str = this.f56482K;
            DownloadBean downloadBean = this.f56479H;
            AbstractC5119p.m23953a("local_video_detail", str, downloadBean != null ? downloadBean.getOps() : null, Float.valueOf(this.f56475D));
        }
    }

    @Override // com.transsion.postdetail.layer.BaseLayer
    /* JADX INFO: renamed from: M */
    public void mo73091M(InterfaceC16634g orPlayer, ORPlayerView orPlayerView) {
        Intrinsics.m97802h(orPlayer, "orPlayer");
        Intrinsics.m97802h(orPlayerView, "orPlayerView");
        super.mo73091M(orPlayer, orPlayerView);
        InterfaceC24080n interfaceC24080n = this.f56511v;
        if (interfaceC24080n == null) {
            Intrinsics.m97819y("volumeControl");
            interfaceC24080n = null;
        }
        interfaceC24080n.mo95032e(orPlayer);
    }

    /* JADX INFO: renamed from: M0 */
    public final void m73358M0() {
        if (this.f56475D > 0.0f) {
            InterfaceC16634g interfaceC16634gM73086H = m73086H();
            if (interfaceC16634gM73086H != null) {
                interfaceC16634gM73086H.setSpeed(this.f56475D);
            }
            View viewMo73238k2 = mo73238k2();
            if (viewMo73238k2 != null) {
                AbstractC26006c.m102054g(viewMo73238k2);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f56498a0;
            String str = this.f56482K;
            DownloadBean downloadBean = this.f56479H;
            AbstractC5119p.m23954b("local_video_detail", jElapsedRealtime, str, downloadBean != null ? downloadBean.getOps() : null, Float.valueOf(this.f56475D));
            this.f56475D = 0.0f;
        }
    }

    /* JADX INFO: renamed from: M1 */
    public boolean mo73359M1() {
        return false;
    }

    /* JADX INFO: renamed from: N2 */
    public abstract ViewGroup mo73207N2();

    /* JADX INFO: renamed from: O0 */
    public abstract ImageView mo73208O0();

    /* JADX INFO: renamed from: O1 */
    protected final boolean m73360O1() {
        Function0 function0M102147p;
        DownloadBean downloadBean = this.f56479H;
        return (downloadBean == null || !downloadBean.isMusic()) && (function0M102147p = C26053g0.f79567a.m102147p()) != null && ((Boolean) function0M102147p.invoke()).booleanValue();
    }

    /* JADX INFO: renamed from: O2 */
    public abstract ImageView mo73209O2();

    /* JADX INFO: renamed from: P1 */
    public abstract View mo73210P1();

    /* JADX INFO: renamed from: P2 */
    public abstract ProgressBar mo73211P2();

    /* JADX INFO: renamed from: Q0 */
    public abstract View mo73212Q0();

    /* JADX INFO: renamed from: Q2 */
    public abstract TextView mo73213Q2();

    /* JADX INFO: renamed from: R2 */
    public abstract TextView mo73214R2();

    /* JADX INFO: renamed from: S0 */
    protected final DownloadBean m73361S0() {
        return this.f56479H;
    }

    /* JADX INFO: renamed from: S2 */
    public abstract SimpleSubtitleView mo73215S2();

    /* JADX INFO: renamed from: T0 */
    protected final InterfaceC21842g m73362T0() {
        return (InterfaceC21842g) this.f56478G.getValue();
    }

    /* JADX INFO: renamed from: T1 */
    protected final void m73363T1(boolean z11) {
        ConstraintLayout constraintLayoutMo73242n2;
        ConstraintLayout constraintLayoutMo73242n3 = mo73242n2();
        if (constraintLayoutMo73242n3 != null) {
            constraintLayoutMo73242n3.setVisibility(z11 ? 0 : 8);
        }
        if (!z11 || (constraintLayoutMo73242n2 = mo73242n2()) == null) {
            return;
        }
        constraintLayoutMo73242n2.setFocusableInTouchMode(true);
        constraintLayoutMo73242n2.requestFocus();
    }

    /* JADX INFO: renamed from: T2 */
    public abstract SimpleSubtitleView mo73216T2();

    /* JADX INFO: renamed from: U2 */
    public abstract ViewGroup mo73217U2();

    /* JADX INFO: renamed from: V1 */
    public abstract void mo73218V1();

    /* JADX INFO: renamed from: V2 */
    public abstract SimpleSubtitleView mo73219V2();

    /* JADX INFO: renamed from: W0 */
    protected final C14582f m73364W0() {
        return (C14582f) this.f56492U.getValue();
    }

    /* JADX INFO: renamed from: W1 */
    public void mo73365W1(boolean z11) {
    }

    /* JADX INFO: renamed from: W2 */
    public abstract TextView mo73220W2();

    /* JADX INFO: renamed from: X2 */
    public abstract TextView mo73221X2();

    /* JADX INFO: renamed from: Y0 */
    protected final int m73366Y0() {
        return this.f56506q;
    }

    /* JADX INFO: renamed from: Y1 */
    public void mo73367Y1() {
        FragmentActivity activity;
        int i11;
        InterfaceC16634g interfaceC16634gM73086H;
        View view;
        InterfaceC16634g interfaceC16634gM73086H2 = m73086H();
        if (interfaceC16634gM73086H2 != null && !interfaceC16634gM73086H2.isPlaying() && (interfaceC16634gM73086H = m73086H()) != null && !interfaceC16634gM73086H.isComplete() && !m73277N1()) {
            InterfaceC16634g interfaceC16634gM73086H3 = m73086H();
            if (interfaceC16634gM73086H3 != null) {
                interfaceC16634gM73086H3.play();
            }
            View view2 = this.f56474C;
            if (view2 != null && AbstractC26006c.m102056i(view2) && (view = this.f56474C) != null) {
                AbstractC26006c.m102054g(view);
            }
        }
        InterfaceC16634g interfaceC16634gM73086H4 = m73086H();
        if (interfaceC16634gM73086H4 != null) {
            interfaceC16634gM73086H4.setScaleMode(C14453d.f50863a.m65161c());
        }
        int i12 = this.f56505p;
        LocalUiType localUiType = (i12 <= 0 || (i11 = this.f56506q) <= 0 || i11 <= i12) ? LocalUiType.LAND : LocalUiType.PORTRAIT;
        if (localUiType == LocalUiType.LAND && (activity = this.f56500k.getActivity()) != null) {
            activity.setRequestedOrientation(6);
        }
        C27136c.f82250a.m105600a();
        m73084F(LayerFlag.LOCAL_UI_CHANGED, localUiType);
    }

    /* JADX INFO: renamed from: Y2 */
    public abstract TextView mo73222Y2();

    /* JADX INFO: renamed from: Z1 */
    public void mo73368Z1() {
    }

    /* JADX INFO: renamed from: Z2 */
    public abstract Group mo73223Z2();

    /* JADX INFO: renamed from: a */
    public void mo73224a(LocalUiType uiType) {
        InterfaceC28989b interfaceC28989b;
        Intrinsics.m97802h(uiType, "uiType");
        if (!isVisible() || (interfaceC28989b = this.f56509t) == null) {
            return;
        }
        interfaceC28989b.mo74223a(uiType);
    }

    /* JADX INFO: renamed from: a2 */
    public void mo73369a2(View view) {
        Intrinsics.m97802h(view, "view");
    }

    /* JADX INFO: renamed from: a3 */
    public abstract LocalUiType mo73225a3();

    @Override // p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: b */
    public void mo73370b(boolean z11, boolean z12) {
        if (z11) {
            m73351A2(z12);
        } else {
            m73401v1(z12);
        }
    }

    /* JADX INFO: renamed from: b1 */
    public View mo73371b1() {
        return InterfaceC28991d.a.m111501a(this);
    }

    /* JADX INFO: renamed from: b2 */
    public void m73372b2(View view, boolean z11) {
        Intrinsics.m97802h(view, "view");
        m73351A2(true);
        String string = Utils.m27275a().getString(z11 ? com.transsion.subtitle.R$string.subtitle_turn_on_toast : com.transsion.subtitle.R$string.subtitle_turn_off_toast);
        Intrinsics.m97801g(string, "getString(...)");
        InterfaceC28991d.a.m111512l(this, string, 0L, 2, null);
    }

    /* JADX INFO: renamed from: b3 */
    public void m73373b3(boolean z11) {
        try {
            Result.Companion companion = Result.INSTANCE;
            FragmentActivity activity = this.f56500k.getActivity();
            if (activity == null || activity.isDestroyed() || activity.isFinishing() || !C14496b.f50966a.m65344b().getBoolean("k_pip_enable", true)) {
                return;
            }
            InterfaceC27138e interfaceC27138eM105606b = InterfaceC27138e.f82251a.m105606b();
            ORPlayerView oRPlayerViewM73087I = m73087I();
            ViewParent parent = oRPlayerViewM73087I != null ? oRPlayerViewM73087I.getParent() : null;
            Result.m112707constructorimpl(interfaceC27138eM105606b.mo86566a(activity, false, z11, parent instanceof ViewGroup ? (ViewGroup) parent : null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo73226c() {
        DownloadBean downloadBean = this.f56479H;
        if (downloadBean != null) {
            downloadBean.setPlaying(false);
        }
        SystemTimeManager systemTimeManager = this.f56508s;
        if (systemTimeManager != null) {
            systemTimeManager.m73097c();
        }
        m73294X0().removeCallbacksAndMessages(null);
        m73300a1().removeCallbacksAndMessages(null);
        m73288U0().removeCallbacksAndMessages(null);
        C14057b.f49739a.m63679m(this);
        C14492k.f50955a.m65326t(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d c26907d) {
        InterfaceC16633f.a.m72423a(this, z11, i11, i12, c26907d);
    }

    @Override // p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: d */
    public void mo73374d() {
        InterfaceC28991d.a.m111509i(this);
    }

    /* JADX INFO: renamed from: d2 */
    protected final void m73375d2(MotionEvent motionEvent, boolean z11) {
        C14557c c14557c = C14557c.f51100a;
        ImageView imageViewMo73228f2 = mo73228f2();
        if (c14557c.m65671a(imageViewMo73228f2 != null ? imageViewMo73228f2.getId() : 9527, 500L)) {
            return;
        }
        View view = this.f56473B;
        if (view != null && view.getVisibility() == 0) {
            View view2 = this.f56473B;
            if (!(view2 != null ? Intrinsics.m97797c(view2.getTag(), 1) : false)) {
                if (C27287m.f83003a.m106330e()) {
                    return;
                }
                C13806h.f49015a.m62324k(com.transsion.baseui.R$string.base_network_fail);
                return;
            } else {
                C26866a.f81698a.m104921x("long_video_play", "video error，reload~~ from errorLayout", true);
                Fragment fragment = this.f56500k;
                LocalVideoDetailFragment localVideoDetailFragment = fragment instanceof LocalVideoDetailFragment ? (LocalVideoDetailFragment) fragment : null;
                if (localVideoDetailFragment != null) {
                    LocalVideoDetailFragment.m74168o3(localVideoDetailFragment, false, 1, null);
                    return;
                }
                return;
            }
        }
        InterfaceC16634g interfaceC16634gM73086H = m73086H();
        if (interfaceC16634gM73086H != null && interfaceC16634gM73086H.isComplete()) {
            if (mo73359M1()) {
                return;
            }
            mo73382i3();
            return;
        }
        InterfaceC16634g interfaceC16634gM73086H2 = m73086H();
        if (interfaceC16634gM73086H2 != null && interfaceC16634gM73086H2.isPlaying()) {
            mo73249s1(motionEvent, z11);
            return;
        }
        m73094P(false);
        mo73400u2(true);
        C27136c.f82250a.m105600a();
        InterfaceC16634g interfaceC16634gM73086H3 = m73086H();
        if (interfaceC16634gM73086H3 != null) {
            interfaceC16634gM73086H3.play();
        }
    }

    @Override // p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: e */
    public boolean mo73376e(FloatActionType actionType) {
        FragmentActivity activity;
        Intrinsics.m97802h(actionType, "actionType");
        DownloadBean downloadBean = this.f56479H;
        if ((downloadBean == null || !downloadBean.isMusic()) && (activity = this.f56500k.getActivity()) != null && !activity.isDestroyed() && !activity.isFinishing()) {
            FloatActionType floatActionType = FloatActionType.ICON;
            if (actionType != floatActionType && !C14496b.f50966a.m65344b().getBoolean("k_pip_enable", true)) {
                C26866a.f81698a.m104912c("VideoFloat", "local 设置页pip开关被关闭了", true);
                return false;
            }
            C27425a c27425aM73291V0 = m73291V0();
            if (c27425aM73291V0 != null) {
                if (actionType != floatActionType && !c27425aM73291V0.m106622f().isPlaying()) {
                    C26866a.f81698a.m104912c("VideoFloat-pip", "local 视频暂停，无需触发画中画", true);
                    return false;
                }
                InterfaceC27138e.a aVar = InterfaceC27138e.f82251a;
                if (aVar.m105606b().mo86568c()) {
                    m73401v1(true);
                    C26866a.a.m104898f(C26866a.f81698a, "VideoFloat-pip", "local 当前可用画中画，使用画中画播放", false, 4, null);
                    aVar.m105606b().mo86574i(activity, c27425aM73291V0, actionType, mo73225a3() == LocalUiType.LAND);
                    return true;
                }
                InterfaceC27135b.f82245a.m105597c().mo86626g(activity, c27425aM73291V0, actionType == floatActionType, mo73225a3() == LocalUiType.LAND, new Function1() { // from class: com.transsion.postdetail.layer.local.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC16785a0.m73264G2(this.f56609a, ((Boolean) obj).booleanValue());
                    }
                }, new f());
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e1 */
    protected final String m73377e1() {
        return this.f56480I;
    }

    /* JADX INFO: renamed from: f */
    public void mo73227f(boolean z11, String str) {
        InterfaceC28991d.a.m111508h(this, z11, str);
    }

    /* JADX INFO: renamed from: f2 */
    public abstract ImageView mo73228f2();

    @Override // p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: g */
    public void mo73378g() {
        mo73355J2(false);
        m73256C2(1);
        this.f56513x = "";
        this.f56514y = true;
        m73401v1(true);
        Group groupMo73223Z2 = mo73223Z2();
        if (groupMo73223Z2 != null) {
            groupMo73223Z2.setVisibility(0);
        }
        m73341w1(true);
    }

    /* JADX INFO: renamed from: g1 */
    protected final View m73379g1() {
        return this.f56474C;
    }

    /* JADX INFO: renamed from: g2 */
    public abstract ViewGroup mo73229g2();

    /* JADX INFO: renamed from: h */
    public void mo73230h(String subjectId, String resourceId) {
        Intrinsics.m97802h(subjectId, "subjectId");
        Intrinsics.m97802h(resourceId, "resourceId");
        this.f56482K = subjectId;
        this.f56483L = true;
        FragmentActivity activity = this.f56500k.getActivity();
        if (activity != null) {
            m73390o1().m75013i().m14851j(activity, new e(new Function1() { // from class: com.transsion.postdetail.layer.local.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC16785a0.m73271K1(this.f56653a, (List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h2 */
    public abstract TextView mo73231h2();

    /* JADX INFO: renamed from: h3 */
    public abstract TextView mo73232h3();

    @Override // p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: i */
    public void mo73380i(String content, long j11) {
        Intrinsics.m97802h(content, "content");
        C16813j1 c16813j1 = this.f56512w;
        if (c16813j1 != null) {
            c16813j1.m73488h(content, j11);
        }
    }

    /* JADX INFO: renamed from: i1 */
    protected final String m73381i1() {
        return this.f56481J;
    }

    /* JADX INFO: renamed from: i2 */
    public abstract View mo73233i2();

    /* JADX INFO: renamed from: i3 */
    public void mo73382i3() {
        InterfaceC28989b interfaceC28989b = this.f56509t;
        if (interfaceC28989b != null) {
            interfaceC28989b.mo74224b(this.f56479H);
        }
        View view = this.f56474C;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
        this.f56476E = 0L;
        InterfaceC16634g interfaceC16634gM73086H = m73086H();
        if (interfaceC16634gM73086H != null) {
            interfaceC16634gM73086H.seekTo(0L);
        }
        InterfaceC16634g interfaceC16634gM73086H2 = m73086H();
        if (interfaceC16634gM73086H2 != null) {
            interfaceC16634gM73086H2.play();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void initPlayer() {
        InterfaceC16634g interfaceC16634gM73086H;
        InterfaceC16633f.a.m72424b(this);
        View view = this.f56474C;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
        if (this.f56501l > 0 || (interfaceC16634gM73086H = m73086H()) == null) {
            return;
        }
        long duration = interfaceC16634gM73086H.getDuration();
        this.f56501l = duration;
        if (duration > 0) {
            m73314f3(0L, duration);
        }
    }

    public boolean isVisible() {
        ConstraintLayout constraintLayoutMo73242n2 = mo73242n2();
        return constraintLayoutMo73242n2 != null && constraintLayoutMo73242n2.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: j */
    public void mo73234j(boolean z11) {
        InterfaceC28991d.a.m111511k(this, z11);
    }

    /* JADX INFO: renamed from: j1 */
    public abstract View mo73235j1();

    /* JADX INFO: renamed from: j3 */
    public abstract FrameLayout mo73236j3();

    /* JADX INFO: renamed from: k */
    public void mo73237k(DownloadBean downloadBean, String pageFrom, boolean z11) {
        Long duration;
        Long duration2;
        Intrinsics.m97802h(pageFrom, "pageFrom");
        this.f56479H = downloadBean;
        m73390o1().m75009e().mo14858q(downloadBean);
        this.f56480I = pageFrom;
        if (((downloadBean == null || (duration2 = downloadBean.getDuration()) == null) ? 0L : duration2.longValue()) > 30000) {
            m73314f3(0L, (downloadBean == null || (duration = downloadBean.getDuration()) == null) ? 0L : duration.longValue());
        }
        View viewMo73210P1 = mo73210P1();
        if (viewMo73210P1 != null) {
            viewMo73210P1.setVisibility(m73360O1() ? 0 : 8);
        }
        if (downloadBean != null) {
            downloadBean.setPlaying(true);
        }
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.f56499j;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "updateInfo,name = " + (downloadBean != null ? downloadBean.getName() : null) + ", epse = " + (downloadBean != null ? Integer.valueOf(downloadBean.getEpse()) : null), false, 4, null);
        m73316g3();
    }

    /* JADX INFO: renamed from: k1 */
    protected final String m73383k1() {
        return this.f56482K;
    }

    /* JADX INFO: renamed from: k2 */
    public abstract View mo73238k2();

    /* JADX INFO: renamed from: k3 */
    public abstract TextView mo73239k3();

    @Override // p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: l */
    public void mo73384l(InterfaceC28989b event) {
        Intrinsics.m97802h(event, "event");
        this.f56509t = event;
    }

    /* JADX INFO: renamed from: l1 */
    protected final SystemTimeManager m73385l1() {
        return this.f56508s;
    }

    @Override // p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: m */
    public void mo73386m(Map progress) {
        Intrinsics.m97802h(progress, "progress");
        SecondariesSeekBar secondariesSeekBarMo73246q2 = mo73246q2();
        if (secondariesSeekBarMo73246q2 != null) {
            secondariesSeekBarMo73246q2.setSecondariesProgress(progress);
        }
    }

    /* JADX INFO: renamed from: m1 */
    protected final String m73387m1() {
        return this.f56499j;
    }

    /* JADX INFO: renamed from: m3 */
    public abstract ViewStub mo73240m3();

    /* JADX INFO: renamed from: n */
    public void mo73241n(LocalUiType localUiType) {
        InterfaceC28991d.a.m111506f(this, localUiType);
    }

    /* JADX INFO: renamed from: n1 */
    protected final long m73388n1() {
        return this.f56501l;
    }

    /* JADX INFO: renamed from: n2 */
    public abstract ConstraintLayout mo73242n2();

    /* JADX INFO: renamed from: n3 */
    public abstract ViewStub mo73243n3();

    @Override // p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: o */
    public void mo73389o() {
        InterfaceC16634g interfaceC16634gM73086H;
        if (C27136c.f82250a.m105602c(m73086H()) || (interfaceC16634gM73086H = m73086H()) == null) {
            return;
        }
        interfaceC16634gM73086H.pause();
    }

    /* JADX INFO: renamed from: o1 */
    protected final LocalVideoDetailViewModel m73390o1() {
        return (LocalVideoDetailViewModel) this.f56477F.getValue();
    }

    @Override // com.transsion.p285ad.strategy.C14057b.a
    public void onAdClick(AdPlans adPlans) {
        C26866a.a.m104898f(C26866a.f81698a, "VideoFloat-pip", "onAdClick stop auto pip", false, 4, null);
        m73373b3(false);
        ConstraintLayout constraintLayoutMo73242n2 = mo73242n2();
        if (constraintLayoutMo73242n2 != null) {
            constraintLayoutMo73242n2.postDelayed(new Runnable() { // from class: com.transsion.postdetail.layer.local.q
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC16785a0.m73289U1(this.f56666a);
                }
            }, 3000L);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onAliyunDecodeErrorChangeSoftwareDecoder(C23403e c23403e) {
        InterfaceC16633f.a.m72425c(this, c23403e);
    }

    @Override // com.transsion.baselib.report.C14492k.a
    public void onBackgroundStatusChange(boolean z11) {
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onBufferedPosition(long j11, C23403e c23403e) {
        InterfaceC16633f.a.m72426d(this, j11, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onCompletion(C23403e c23403e) {
        InterfaceC16633f.a.m72427e(this, c23403e);
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.f56499j;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "onCompletion, uiType = " + mo73225a3(), false, 4, null);
        if (mo73359M1()) {
            mo73400u2(false);
        } else {
            m73356K0();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onFocusChange(boolean z11) {
        InterfaceC16633f.a.m72429g(this, z11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onIsPlayingChanged(boolean z11) {
        InterfaceC16633f.a.m72430h(this, z11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingBegin(C23403e c23403e) {
        this.f56514y = false;
        mo73355J2(true);
        View view = this.f56473B;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
        m73341w1(false);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingEnd(C23403e c23403e) {
        mo73355J2(false);
        m73288U0().removeCallbacksAndMessages(null);
        this.f56514y = false;
        View view = this.f56473B;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
        m73341w1(false);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingProgress(int i11, float f11, C23403e c23403e) {
        InterfaceC16633f.a.m72435m(this, i11, f11, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoopingStart() {
        InterfaceC16633f.a.m72437o(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onMediaItemTransition(String str) {
        InterfaceC16633f.a.m72438p(this, str);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayError(PlayError errorInfo, C23403e c23403e) {
        Intrinsics.m97802h(errorInfo, "errorInfo");
        this.f56476E = 0L;
        Integer errorCode = errorInfo.getErrorCode();
        if (errorCode != null && errorCode.intValue() == 537067524) {
            C26866a.a aVar = C26866a.f81698a;
            String TAG = this.f56499j;
            Intrinsics.m97801g(TAG, "TAG");
            C26866a.a.m104898f(aVar, TAG, "--onPlayError，net time out ,", false, 4, null);
            if (C27287m.f83003a.m106330e()) {
                mo73378g();
            } else {
                m73288U0().postDelayed(this.f56497Z, 500L);
            }
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayerRelease(C23403e c23403e) {
        InterfaceC16633f.a.m72442t(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayerReset() {
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.f56499j;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "onPlayerReset", false, 4, null);
        this.f56514y = false;
        this.f56501l = 0L;
        this.f56476E = 0L;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPrepare(C23403e c23403e) {
        InterfaceC16633f.a.m72445w(this, c23403e);
        this.f56476E = 0L;
    }

    public void onProgress(long j11, C23403e c23403e) {
        m73311e3(j11);
        if (mo73225a3() == LocalUiType.MIDDLE) {
            ImageView imageViewMo73228f2 = mo73228f2();
            if (imageViewMo73228f2 != null ? Intrinsics.m97797c(imageViewMo73228f2.getTag(), Boolean.FALSE) : false) {
                mo73400u2(true);
            }
        }
        if (this.f56515z) {
            mo73355J2(false);
        }
        m73295X1(j11);
        VideoSubtitleControl videoSubtitleControl = this.f56510u;
        if (videoSubtitleControl != null) {
            videoSubtitleControl.m81882R(j11);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onRenderFirstFrame() {
        InterfaceC16633f.a.m72412A(this);
        if (mo73225a3() == LocalUiType.MIDDLE) {
            ImageView imageViewMo73228f2 = mo73228f2();
            if (imageViewMo73228f2 != null ? Intrinsics.m97797c(imageViewMo73228f2.getTag(), Boolean.FALSE) : false) {
                mo73400u2(true);
            }
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onSetDataSource() {
        InterfaceC16633f.a.m72413B(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onTracksAudioBitrateChange(int i11) {
        InterfaceC16633f.a.m72414C(this, i11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onTracksChange(C26906c c26906c) {
        InterfaceC16633f.a.m72415D(this, c26906c);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onTracksVideoBitrateChange(int i11) {
        InterfaceC16633f.a.m72416E(this, i11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoPause(C23403e c23403e) {
        m73373b3(false);
        mo73400u2(false);
        if (!m73277N1()) {
            m73254B2(this, false, 1, null);
        }
        VideoSubtitleControl videoSubtitleControl = this.f56510u;
        if (videoSubtitleControl != null) {
            videoSubtitleControl.m81881Q();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoSizeChanged(int i11, int i12) {
        InterfaceC16633f.a.m72419H(this, i11, i12);
        if ((i11 <= 0 || this.f56505p == i11) && (i12 <= 0 || this.f56506q == i12)) {
            return;
        }
        this.f56506q = i12;
        this.f56505p = i11;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoStart(C23403e c23403e) {
        m73373b3(true);
        mo73400u2(true);
        m73401v1(false);
        VideoSubtitleControl videoSubtitleControl = this.f56510u;
        if (videoSubtitleControl != null) {
            videoSubtitleControl.m81883S();
        }
        mo73355J2(false);
        this.f56486O = false;
        View view = this.f56474C;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
        m73269J0();
    }

    @Override // p951yo.InterfaceC28991d
    public void onViewPause() {
        InterfaceC28991d.a.m111507g(this);
    }

    @Override // p951yo.InterfaceC28991d
    public void onViewResume() {
        InterfaceC16634g interfaceC16634gM73086H;
        if (m73088J() || !C27287m.f83003a.m106330e() || C27136c.f82250a.m105603d() || m73277N1() || (interfaceC16634gM73086H = m73086H()) == null) {
            return;
        }
        interfaceC16634gM73086H.play();
    }

    @Override // p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: p */
    public void mo73391p(float f11) {
        InterfaceC28991d.a.m111515o(this, f11);
        VideoSubtitleControl videoSubtitleControl = this.f56510u;
        if (videoSubtitleControl != null) {
            videoSubtitleControl.m81896r0(f11);
        }
    }

    /* JADX INFO: renamed from: p1 */
    protected final int m73392p1() {
        return this.f56505p;
    }

    /* JADX INFO: renamed from: p2 */
    public abstract View mo73244p2();

    @Override // p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: q */
    public void mo73393q(String resourceId, String subjectId, String postId, boolean z11, boolean z12) {
        Intrinsics.m97802h(resourceId, "resourceId");
        Intrinsics.m97802h(subjectId, "subjectId");
        Intrinsics.m97802h(postId, "postId");
        this.f56481J = resourceId;
        this.f56482K = subjectId;
        m73093O(postId);
        FragmentActivity activity = this.f56500k.getActivity();
        if (activity != null) {
            m73390o1().m75011g().m14851j(activity, new e(new Function1() { // from class: com.transsion.postdetail.layer.local.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC16785a0.m73347y1(this.f56708a, (Subject) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q1 */
    public abstract View mo73245q1();

    /* JADX INFO: renamed from: q2 */
    public abstract SecondariesSeekBar mo73246q2();

    @Override // p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: r */
    public void mo73394r(int i11, int i12) {
        this.f56506q = i12;
        this.f56505p = i11;
    }

    /* JADX INFO: renamed from: r1 */
    public abstract View mo73247r1();

    /* JADX INFO: renamed from: r2 */
    protected final void m73395r2(DownloadBean nextVideoBean, boolean z11) {
        Intrinsics.m97802h(nextVideoBean, "nextVideoBean");
        if (z11 && nextVideoBean.isCompleted() && !nextVideoBean.isFileExist()) {
            FragmentActivity activity = this.f56500k.getActivity();
            if (activity != null) {
                LocalVideoNotExistUtil.f68083a.m89402v(activity, nextVideoBean, -1);
                return;
            }
            return;
        }
        View view = this.f56474C;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
        DownloadBean downloadBean = this.f56479H;
        if (downloadBean != null) {
            downloadBean.setPlaying(false);
        }
        m73390o1().m75010f().mo14858q(this.f56479H);
        this.f56486O = true;
        SecondariesSeekBar secondariesSeekBarMo73246q2 = mo73246q2();
        if (secondariesSeekBarMo73246q2 != null) {
            secondariesSeekBarMo73246q2.setProgress(0L);
        }
        m73311e3(0L);
        if (isVisible()) {
            InterfaceC28990c interfaceC28990c = this.f56484M;
            if (interfaceC28990c != null) {
                interfaceC28990c.mo74229a(nextVideoBean, !z11);
            }
            InterfaceC16634g interfaceC16634gM73086H = m73086H();
            if (interfaceC16634gM73086H != null) {
                interfaceC16634gM73086H.clearScreen();
            }
            InterfaceC16634g interfaceC16634gM73086H2 = m73086H();
            if (interfaceC16634gM73086H2 != null) {
                interfaceC16634gM73086H2.stop();
            }
            InterfaceC16634g interfaceC16634gM73086H3 = m73086H();
            if (interfaceC16634gM73086H3 != null) {
                interfaceC16634gM73086H3.reset();
            }
        }
        this.f56485N = false;
        mo73397t();
        String postId = nextVideoBean.getPostId();
        if (postId == null) {
            postId = "";
        }
        m73093O(postId);
        String subjectId = nextVideoBean.getSubjectId();
        if (subjectId == null) {
            subjectId = "";
        }
        this.f56482K = subjectId;
        this.f56479H = nextVideoBean;
        nextVideoBean.setPlaying(true);
        mo73386m(new LinkedHashMap());
        boolean z12 = nextVideoBean.getStatus() != 5;
        InterfaceC16633f.a.m72432j(this, null, 1, null);
        if (isVisible()) {
            C22094h.f68115a.m89453d("1");
            if (z12) {
                InterfaceC28990c interfaceC28990c2 = this.f56484M;
                if (interfaceC28990c2 != null) {
                    interfaceC28990c2.mo74230b(nextVideoBean);
                    return;
                }
                return;
            }
            C26866a.f81698a.m104912c("long_video_play", "series playerSetDataSource, subjectId = " + nextVideoBean.getSubjectId() + ",resourceId = " + nextVideoBean.getResourceId() + ", path = " + nextVideoBean.getPath(), true);
            InterfaceC16634g interfaceC16634gM73086H4 = m73086H();
            if (interfaceC16634gM73086H4 != null) {
                interfaceC16634gM73086H4.clearScreen();
            }
            InterfaceC16634g interfaceC16634gM73086H5 = m73086H();
            if (interfaceC16634gM73086H5 != null) {
                DownloadBean downloadBean2 = this.f56479H;
                String resourceId = downloadBean2 != null ? downloadBean2.getResourceId() : null;
                String path = nextVideoBean.getPath();
                C23403e c23403e = new C23403e(resourceId, path == null ? "" : path, 0, null, m73303c1(), 12, null);
                MusicFloatManager.C14535a c14535a = MusicFloatManager.f51050h;
                c14535a.m65598b().m65583C(c23403e.m92929e());
                c14535a.m65598b().m65582B(c23403e.m92933i());
                interfaceC16634gM73086H5.setDataSource(c23403e);
            }
            InterfaceC16634g interfaceC16634gM73086H6 = m73086H();
            if (interfaceC16634gM73086H6 != null) {
                interfaceC16634gM73086H6.prepare();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void mo73248s(View rootView, LocalUiType uiType) {
        Intrinsics.m97802h(rootView, "rootView");
        Intrinsics.m97802h(uiType, "uiType");
        this.f56483L = false;
        this.f56485N = false;
        m73363T1(false);
        C14492k.f50955a.m65317g(this);
        View viewMo73203F0 = mo73203F0();
        if (viewMo73203F0 != null) {
            viewMo73203F0.setVisibility(8);
        }
        m73252A1();
        m73270J1();
        m73274L1();
        m73267I1();
        m73349z1();
        C14057b.f49739a.m63674c(this);
    }

    /* JADX INFO: renamed from: s1 */
    public void mo73249s1(MotionEvent motionEvent, boolean z11) {
        this.f56487P = false;
        m73094P(true);
        mo73400u2(false);
        InterfaceC16634g interfaceC16634gM73086H = m73086H();
        if (interfaceC16634gM73086H != null) {
            interfaceC16634gM73086H.pause();
        }
        Fragment fragment = this.f56500k;
        LocalVideoDetailFragment localVideoDetailFragment = fragment instanceof LocalVideoDetailFragment ? (LocalVideoDetailFragment) fragment : null;
        if (localVideoDetailFragment != null) {
            localVideoDetailFragment.m74212Z2();
        }
        mo73355J2(false);
    }

    /* JADX INFO: renamed from: s2 */
    public final void m73396s2(String str) {
        ImageView imageView;
        FrameLayout frameLayoutMo73236j3 = mo73236j3();
        if (frameLayoutMo73236j3 == null || (imageView = (ImageView) frameLayoutMo73236j3.findViewById(R$id.id_local_video_cover)) == null) {
            imageView = new ImageView(this.f56500k.requireContext());
            FrameLayout frameLayoutMo73236j4 = mo73236j3();
            if (frameLayoutMo73236j4 != null) {
                frameLayoutMo73236j4.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            }
        }
        m73089K(imageView);
        ImageView imageViewM73085G = m73085G();
        if (imageViewM73085G != null) {
            int iM66409f = C14752e.m66409f();
            C23860f.a aVar = C23860f.f72909a;
            if (str == null) {
                str = "";
            }
            AbstractC23855a.m94309a(imageViewM73085G).load(C23860f.a.m94447e(aVar, str, iM66409f, false, false, 12, null)).into(imageViewM73085G);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void setOnSeekCompleteListener() {
        InterfaceC16633f.a.m72422K(this);
    }

    @Override // p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: t */
    public void mo73397t() {
        C16813j1 c16813j1 = this.f56512w;
        if (c16813j1 != null) {
            c16813j1.m73487d();
        }
    }

    /* JADX INFO: renamed from: t2 */
    protected final void m73398t2(int i11) {
        this.f56506q = i11;
    }

    @Override // p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: u */
    public void mo73399u(boolean z11) {
        FragmentActivity activity;
        C27425a c27425aM73291V0;
        InterfaceC28991d.a.m111504d(this, z11);
        if (!z11 || (activity = this.f56500k.getActivity()) == null || activity.isDestroyed() || activity.isFinishing() || (c27425aM73291V0 = m73291V0()) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "VideoFloat-pip", "onPictureInPictureModeChanged local--- updateData", false, 4, null);
        InterfaceC27138e.f82251a.m105606b().mo86572g(activity, c27425aM73291V0);
    }

    /* JADX INFO: renamed from: u2 */
    public void mo73400u2(boolean z11) {
        mo73365W1(z11);
        ImageView imageViewMo73228f2 = mo73228f2();
        if (imageViewMo73228f2 != null) {
            imageViewMo73228f2.setTag(Boolean.valueOf(z11));
        }
        if (z11) {
            ImageView imageViewMo73228f3 = mo73228f2();
            if (imageViewMo73228f3 != null) {
                imageViewMo73228f3.setImageResource(R$mipmap.icon_player_pause);
                return;
            }
            return;
        }
        ImageView imageViewMo73228f4 = mo73228f2();
        if (imageViewMo73228f4 != null) {
            imageViewMo73228f4.setImageResource(R$mipmap.icon_player_play);
        }
    }

    @Override // p951yo.InterfaceC28991d
    public void updateTitle(String title) {
        Intrinsics.m97802h(title, "title");
        TextView textViewMo73220W2 = mo73220W2();
        if (textViewMo73220W2 != null) {
            textViewMo73220W2.setText(title);
        }
    }

    /* JADX INFO: renamed from: v */
    public void mo73250v(String str, String str2) {
        InterfaceC28991d.a.m111510j(this, str, str2);
    }

    /* JADX INFO: renamed from: v1 */
    protected final void m73401v1(boolean z11) {
        if (AbstractC5779c.m27333j()) {
            if (z11) {
                m73344x1();
                return;
            }
            InterfaceC16634g interfaceC16634gM73086H = m73086H();
            if (interfaceC16634gM73086H == null || !interfaceC16634gM73086H.isPlaying()) {
                return;
            }
            m73294X0().removeCallbacks(this.f56493V);
            m73294X0().postDelayed(this.f56493V, 3000L);
        }
    }

    /* JADX INFO: renamed from: v2 */
    protected final void m73402v2(String str) {
        Intrinsics.m97802h(str, "<set-?>");
        this.f56482K = str;
    }

    /* JADX INFO: renamed from: w */
    public void mo73251w(boolean z11) {
        InterfaceC16634g interfaceC16634gM73086H;
        if (!z11) {
            m73288U0().postDelayed(this.f56497Z, 1000L);
            return;
        }
        m73341w1(false);
        this.f56514y = false;
        View view = this.f56473B;
        if (view != null && view.getVisibility() == 0 && !m73088J() && (interfaceC16634gM73086H = m73086H()) != null) {
            interfaceC16634gM73086H.play();
        }
        View view2 = this.f56473B;
        if (view2 != null) {
            AbstractC26006c.m102054g(view2);
        }
    }

    @Override // p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: x */
    public void mo73403x(PostSubjectItem postSubjectItem) {
        InterfaceC28991d.a.m111513m(this, postSubjectItem);
    }

    @Override // p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: y */
    public void mo73404y(String speed) {
        Intrinsics.m97802h(speed, "speed");
        this.f56513x = speed;
    }

    @Override // p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: z */
    public void mo73405z(View view, boolean z11) {
        InterfaceC28991d.a.m111502b(this, view, z11);
    }

    /* JADX INFO: renamed from: z0 */
    protected final void m73406z0() {
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.f56499j;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "addLandSurface 宽:" + this.f56505p + ",高:" + this.f56506q, false, 4, null);
        ORPlayerView oRPlayerViewM73087I = m73087I();
        if (oRPlayerViewM73087I != null) {
            m73327m2(oRPlayerViewM73087I);
        }
        FrameLayout frameLayoutMo73236j3 = mo73236j3();
        if (frameLayoutMo73236j3 != null) {
            frameLayoutMo73236j3.addView(m73087I(), 0, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* JADX INFO: renamed from: z2 */
    protected final void m73407z2(int i11) {
        this.f56505p = i11;
    }
}
