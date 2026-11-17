package com.transsion.postdetail.p304ad;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.LifecycleCoroutineScope;
import com.blankj.utilcode.util.AbstractC5775a;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.cloud.hisavana.sdk.common.util.C8113l0;
import com.google.android.material.card.MaterialCardView;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.hisavana.common.bean.TAdErrorCode;
import com.hisavana.mediation.p276ad.TAdChoicesView;
import com.hisavana.mediation.p276ad.TMediaView;
import com.p282tn.lib.view.bubbleview.BubbleTextView;
import com.therouter.TheRouter;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.R$mipmap;
import com.transsion.gslb.GslbSdk;
import com.transsion.memberapi.MemberSource;
import com.transsion.p285ad.bidding.base.AbsAdBidding;
import com.transsion.p285ad.bidding.base.AbstractC13924r;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.bidding.icon.BiddingIconAdManager;
import com.transsion.p285ad.bidding.interstitial.BiddingInterstitialManager;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.p285ad.scene.C14048b;
import com.transsion.p285ad.scene.C14049c;
import com.transsion.p285ad.scene.C14050d;
import com.transsion.p285ad.strategy.C14058c;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.postdetail.p306ui.view.AdCountDownView;
import com.transsion.wrapperad.R$id;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.AbstractC25136k;
import ng.AbstractC26006c;
import p352dn.InterfaceC22998b;
import p352dn.InterfaceC22999c;
import p391ey.C23245b;
import p429g4.InterfaceC23498a;
import p461hi.AbstractC23854a;
import p710qk.InterfaceC27085d;
import p723qx.InterfaceC27138e;
import p844vo.C28146e;
import p844vo.C28167o0;
import p913xm.C28615f;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseVideoAdHelper {

    /* JADX INFO: renamed from: R */
    public static final C16679a f56086R = new C16679a(null);

    /* JADX INFO: renamed from: C */
    private BubbleTextView f56089C;

    /* JADX INFO: renamed from: D */
    private AnimatorSet f56090D;

    /* JADX INFO: renamed from: E */
    private int f56091E;

    /* JADX INFO: renamed from: F */
    private int f56092F;

    /* JADX INFO: renamed from: L */
    private int f56098L;

    /* JADX INFO: renamed from: N */
    private InterfaceC23498a f56100N;

    /* JADX INFO: renamed from: O */
    private VideoFloatingView f56101O;

    /* JADX INFO: renamed from: Q */
    private boolean f56103Q;

    /* JADX INFO: renamed from: a */
    private LifecycleCoroutineScope f56104a;

    /* JADX INFO: renamed from: b */
    private String f56105b;

    /* JADX INFO: renamed from: c */
    private Function1 f56106c;

    /* JADX INFO: renamed from: d */
    private Function0 f56107d;

    /* JADX INFO: renamed from: e */
    private BiddingNativeManager f56108e;

    /* JADX INFO: renamed from: f */
    private BiddingInterstitialManager f56109f;

    /* JADX INFO: renamed from: h */
    private boolean f56111h;

    /* JADX INFO: renamed from: i */
    private boolean f56112i;

    /* JADX INFO: renamed from: j */
    private boolean f56113j;

    /* JADX INFO: renamed from: k */
    private boolean f56114k;

    /* JADX INFO: renamed from: l */
    private long f56115l;

    /* JADX INFO: renamed from: m */
    private boolean f56116m;

    /* JADX INFO: renamed from: n */
    private int f56117n;

    /* JADX INFO: renamed from: o */
    private boolean f56118o;

    /* JADX INFO: renamed from: p */
    private int f56119p;

    /* JADX INFO: renamed from: q */
    private boolean f56120q;

    /* JADX INFO: renamed from: r */
    private boolean f56121r;

    /* JADX INFO: renamed from: s */
    private boolean f56122s;

    /* JADX INFO: renamed from: t */
    private CountDownTimer f56123t;

    /* JADX INFO: renamed from: u */
    private CountDownTimer f56124u;

    /* JADX INFO: renamed from: v */
    private long f56125v;

    /* JADX INFO: renamed from: w */
    private long f56126w;

    /* JADX INFO: renamed from: x */
    private long f56127x;

    /* JADX INFO: renamed from: y */
    private long f56128y;

    /* JADX INFO: renamed from: g */
    private String f56110g = "";

    /* JADX INFO: renamed from: z */
    private final String f56129z = "bubble_tip_video_start";

    /* JADX INFO: renamed from: A */
    private final String f56087A = "bubble_tip_interpolate";

    /* JADX INFO: renamed from: B */
    private final String f56088B = "floating_show_time";

    /* JADX INFO: renamed from: G */
    private final Lazy f56093G = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ad.q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(BaseVideoAdHelper.m72639K(this.f56171a));
        }
    });

    /* JADX INFO: renamed from: H */
    private final Lazy f56094H = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ad.r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(BaseVideoAdHelper.m72637J(this.f56172a));
        }
    });

    /* JADX INFO: renamed from: I */
    private final Lazy f56095I = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ad.s
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(BaseVideoAdHelper.m72641L0(this.f56173a));
        }
    });

    /* JADX INFO: renamed from: J */
    private final Lazy f56096J = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ad.t
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(BaseVideoAdHelper.m72638J0(this.f56174a));
        }
    });

    /* JADX INFO: renamed from: K */
    private final Lazy f56097K = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ad.u
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(BaseVideoAdHelper.m72640K0(this.f56175a));
        }
    });

    /* JADX INFO: renamed from: M */
    private final Lazy f56099M = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ad.v
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(BaseVideoAdHelper.m72648S());
        }
    });

    /* JADX INFO: renamed from: P */
    private String f56102P = "";

    /* JADX INFO: renamed from: com.transsion.postdetail.ad.BaseVideoAdHelper$a */
    public static final class C16679a {
        private C16679a() {
        }

        public /* synthetic */ C16679a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m72784a() {
            String value;
            ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("stream_reward_intercept", true);
            return (configBeanM110360c == null || (value = configBeanM110360c.getValue()) == null) ? "" : value;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ad.BaseVideoAdHelper$b */
    public static final class CountDownTimerC16680b extends CountDownTimer {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Ref.IntRef f56131b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f56132c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CountDownTimerC16680b(Ref.IntRef intRef, String str, long j11) {
            super(j11, 1000L);
            this.f56131b = intRef;
            this.f56132c = str;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            if (Intrinsics.m97797c(this.f56132c, "VideoStartBidScene")) {
                BaseVideoAdHelper.this.mo72318n2();
            }
            BaseVideoAdHelper.this.m72722F1(0);
            BaseVideoAdHelper.this.m72737P();
            BaseVideoAdHelper.this.m72739Q();
            BaseVideoAdHelper.this.m72680h2(this.f56132c);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j11) {
            BaseVideoAdHelper baseVideoAdHelper = BaseVideoAdHelper.this;
            Ref.IntRef intRef = this.f56131b;
            int i11 = intRef.element;
            intRef.element = i11 - 1;
            baseVideoAdHelper.m72722F1(i11);
            AdCountDownView adCountDownViewMo72308W = BaseVideoAdHelper.this.mo72308W();
            if (adCountDownViewMo72308W != null) {
                adCountDownViewMo72308W.refreshCountDown(BaseVideoAdHelper.this.m72782y0());
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ad.BaseVideoAdHelper$c */
    public static final class C16681c implements InterfaceC22999c {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function0 f56134b;

        C16681c(Function0 function0) {
            this.f56134b = function0;
        }

        @Override // p352dn.InterfaceC22999c
        /* JADX INFO: renamed from: a */
        public void mo66056a() {
        }

        @Override // p352dn.InterfaceC22999c
        public void onSuccess() {
            BaseVideoAdHelper.this.m72737P();
            Function0 function0 = this.f56134b;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ad.BaseVideoAdHelper$d */
    public static final class CountDownTimerC16682d extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ BaseVideoAdHelper f56135a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Ref.LongRef f56136b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CountDownTimerC16682d(long j11, BaseVideoAdHelper baseVideoAdHelper, Ref.LongRef longRef) {
            super(j11, 1000L);
            this.f56135a = baseVideoAdHelper;
            this.f56136b = longRef;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.f56135a.m72741R();
            if (this.f56135a.m72746V0()) {
                return;
            }
            this.f56135a.m72776u1(this.f56135a.m72774s0() + 1);
            BaseVideoAdHelper baseVideoAdHelper = this.f56135a;
            BiddingNativeManager biddingNativeManagerM72775u0 = baseVideoAdHelper.m72775u0();
            baseVideoAdHelper.m72653U1("VideoInterpolateBidScene", biddingNativeManagerM72775u0 != null ? biddingNativeManagerM72775u0.m62848k0() : null);
            this.f56135a.m72734N1("VideoInterpolateBidScene");
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j11) {
            C28146e bind;
            TextView textView;
            AdInterceptTimerView adInterceptTimerViewMo72311e0 = this.f56135a.mo72311e0();
            if (adInterceptTimerViewMo72311e0 == null || (bind = adInterceptTimerViewMo72311e0.getBind()) == null || (textView = bind.f86412d) == null) {
                return;
            }
            BaseVideoAdHelper baseVideoAdHelper = this.f56135a;
            Ref.LongRef longRef = this.f56136b;
            long j12 = longRef.element;
            longRef.element = (-1) + j12;
            textView.setText(baseVideoAdHelper.m72662a0(j12));
        }
    }

    /* JADX INFO: renamed from: A0 */
    private final int m72626A0() {
        JsonElement jsonElement;
        JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b("VideoStartBidScene");
        return ((jsonObjectM63626b == null || (jsonElement = jsonObjectM63626b.get("interval")) == null) ? 1440 : jsonElement.getAsInt()) * 60000;
    }

    /* JADX INFO: renamed from: C1 */
    private final void m72629C1() {
        ViewGroup viewGroupMo72315h0 = mo72315h0();
        if (viewGroupMo72315h0 != null) {
            ViewGroup.LayoutParams layoutParams = viewGroupMo72315h0.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = AbstractC5776a0.m27313a(this.f56111h ? 426.0f : 219.0f);
                layoutParams.height = AbstractC5776a0.m27313a(this.f56111h ? 240.0f : 123.0f);
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) viewGroupMo72315h0.findViewById(R$id.native_ad_action);
            if (appCompatTextView != null) {
                ViewGroup.LayoutParams layoutParams2 = appCompatTextView.getLayoutParams();
                ConstraintLayout.C2308b c2308b = layoutParams2 instanceof ConstraintLayout.C2308b ? (ConstraintLayout.C2308b) layoutParams2 : null;
                if (c2308b != null) {
                    ((ViewGroup.MarginLayoutParams) c2308b).height = AbstractC5776a0.m27313a(this.f56111h ? 32.0f : 20.0f);
                    int iM27313a = AbstractC5776a0.m27313a(8.0f);
                    ((ViewGroup.MarginLayoutParams) c2308b).rightMargin = iM27313a;
                    ((ViewGroup.MarginLayoutParams) c2308b).bottomMargin = iM27313a;
                }
                appCompatTextView.setTextSize(this.f56111h ? 14.0f : 12.0f);
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    private final void m72634H0() {
        AdCountDownView adCountDownViewMo72308W = mo72308W();
        if (adCountDownViewMo72308W != null) {
            adCountDownViewMo72308W.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ad.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseVideoAdHelper.m72636I0(this.f56157a, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: H1 */
    private final void m72635H1() {
        ImageView imageViewMo72325z0 = mo72325z0();
        if (imageViewMo72325z0 != null) {
            ViewGroup.LayoutParams layoutParams = imageViewMo72325z0.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                int iM27313a = AbstractC5776a0.m27313a(this.f56111h ? 44.0f : 28.0f);
                layoutParams2.width = iM27313a;
                layoutParams2.height = iM27313a;
                layoutParams2.rightMargin = AbstractC5776a0.m27313a(this.f56111h ? 16.0f : 12.0f);
                layoutParams2.bottomMargin = AbstractC5776a0.m27313a(this.f56111h ? 16.0f : 10.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final void m72636I0(BaseVideoAdHelper baseVideoAdHelper, View view) {
        m72642M(baseVideoAdHelper, false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final int m72637J(BaseVideoAdHelper baseVideoAdHelper) {
        return baseVideoAdHelper.m72655X("VideoInterpolateBidScene");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final int m72638J0(BaseVideoAdHelper baseVideoAdHelper) {
        return baseVideoAdHelper.m72764l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final int m72639K(BaseVideoAdHelper baseVideoAdHelper) {
        return baseVideoAdHelper.m72655X("VideoStartBidScene");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final int m72640K0(BaseVideoAdHelper baseVideoAdHelper) {
        return baseVideoAdHelper.m72765m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final int m72641L0(BaseVideoAdHelper baseVideoAdHelper) {
        return baseVideoAdHelper.m72767n0();
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m72642M(BaseVideoAdHelper baseVideoAdHelper, boolean z11, Function0 function0, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkMember");
        }
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        baseVideoAdHelper.m72729L(z11, function0);
    }

    /* JADX INFO: renamed from: M1 */
    private final void m72643M1(ViewGroup viewGroup, boolean z11) {
        ImageView imageView = viewGroup != null ? (ImageView) viewGroup.findViewWithTag("adVolumeImage") : null;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_BOTTOM_START;
                if (!z11) {
                    layoutParams2.leftMargin = AbstractC5776a0.m27313a(this.f56111h ? 16.0f : 12.0f);
                    layoutParams2.bottomMargin = AbstractC5776a0.m27313a(this.f56111h ? 16.0f : 10.0f);
                    int iM27313a = AbstractC5776a0.m27313a(this.f56111h ? 44.0f : 28.0f);
                    layoutParams2.width = iM27313a;
                    layoutParams2.height = iM27313a;
                    return;
                }
                int iM27313a2 = AbstractC5776a0.m27313a(8.0f);
                layoutParams2.leftMargin = iM27313a2;
                layoutParams2.bottomMargin = iM27313a2;
                int iM27313a3 = AbstractC5776a0.m27313a(20.0f);
                layoutParams2.width = iM27313a3;
                layoutParams2.height = iM27313a3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public static final void m72644O1(BaseVideoAdHelper baseVideoAdHelper) {
        baseVideoAdHelper.m72685j2();
        baseVideoAdHelper.f56091E++;
        C14496b.f50966a.m65344b().putInt(baseVideoAdHelper.f56129z, baseVideoAdHelper.f56091E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P1 */
    public static final void m72645P1(BaseVideoAdHelper baseVideoAdHelper) {
        baseVideoAdHelper.m72685j2();
        baseVideoAdHelper.f56092F++;
        C14496b.f50966a.m65344b().putInt(baseVideoAdHelper.f56087A, baseVideoAdHelper.f56092F);
    }

    /* JADX INFO: renamed from: Q1 */
    private final void m72646Q1() {
        if (this.f56118o || this.f56122s || !m72743T0()) {
            return;
        }
        this.f56118o = true;
        m72659Z0(new Function0() { // from class: com.transsion.postdetail.ad.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseVideoAdHelper.m72647R1(this.f56160a);
            }
        }, new Function0() { // from class: com.transsion.postdetail.ad.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseVideoAdHelper.m72650S1(this.f56161a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R1 */
    public static final Unit m72647R1(BaseVideoAdHelper baseVideoAdHelper) {
        baseVideoAdHelper.m72687k2();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final int m72648S() {
        JsonElement jsonElement;
        JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b("VideoFloatingNativeScene");
        if (jsonObjectM63626b == null || (jsonElement = jsonObjectM63626b.get("showMax")) == null) {
            return 10;
        }
        return jsonElement.getAsInt();
    }

    /* JADX INFO: renamed from: S0 */
    private final boolean m72649S0(int i11, long j11) {
        return Math.abs(System.currentTimeMillis() - j11) > ((long) i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S1 */
    public static final Unit m72650S1(BaseVideoAdHelper baseVideoAdHelper) {
        baseVideoAdHelper.f56118o = false;
        baseVideoAdHelper.f56125v = 0L;
        baseVideoAdHelper.f56126w = System.currentTimeMillis();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: T */
    private final int m72651T(String str) {
        JsonElement jsonElement;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        int iHashCode = str.hashCode();
        if (iHashCode != -172473003) {
            if (iHashCode != -73588874) {
                if (iHashCode == 2049503279 && str.equals("VideoEndBidScene")) {
                    JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b("VideoEndBidScene");
                    if (jsonObjectM63626b == null || (jsonElement3 = jsonObjectM63626b.get("videoEndAdCountdownTime")) == null) {
                        return 10;
                    }
                    return jsonElement3.getAsInt();
                }
            } else if (str.equals("VideoStartBidScene")) {
                JsonObject jsonObjectM63626b2 = C14050d.f49719a.m63626b("VideoStartBidScene");
                if (jsonObjectM63626b2 == null || (jsonElement2 = jsonObjectM63626b2.get("videoStartAdCountdownTime")) == null) {
                    return 10;
                }
                return jsonElement2.getAsInt();
            }
        } else if (str.equals("VideoInterpolateBidScene")) {
            JsonObject jsonObjectM63626b3 = C14050d.f49719a.m63626b("VideoInterpolateBidScene");
            if (jsonObjectM63626b3 == null || (jsonElement = jsonObjectM63626b3.get("videoInterpolateAdCountdownTime")) == null) {
                return 10;
            }
            return jsonElement.getAsInt();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T1 */
    public final void m72652T1(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
        Context context;
        BiddingInterstitialManager biddingInterstitialManager;
        if (!this.f56111h || this.f56120q) {
            return;
        }
        mo72300H(true);
        this.f56114k = true;
        this.f56121r = true;
        ViewGroup viewGroupMo72313g0 = mo72313g0();
        if (viewGroupMo72313g0 != null && (context = viewGroupMo72313g0.getContext()) != null && (biddingInterstitialManager = this.f56109f) != null) {
            AbsAdBidding.m62802O0(biddingInterstitialManager, (AppCompatActivity) context, biddingIntermediateMaterialBean, false, 4, null);
        }
        m72741R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public final void m72653U1(String str, BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
        Context context;
        this.f56102P = str;
        mo72300H(true);
        this.f56116m = true;
        this.f56115l = System.currentTimeMillis();
        ViewGroup viewGroupMo72313g0 = mo72313g0();
        if (viewGroupMo72313g0 != null && (context = viewGroupMo72313g0.getContext()) != null) {
            C23245b c23245b = C23245b.f70802a;
            BiddingNativeManager biddingNativeManager = this.f56108e;
            AbstractC13924r abstractC13924rM92309a = c23245b.m92309a(context, biddingNativeManager != null ? biddingNativeManager.getMSceneId() : null);
            NativeWrapperAdView nativeWrapperAdViewMo72312f0 = mo72312f0();
            if (nativeWrapperAdViewMo72312f0 != null) {
                nativeWrapperAdViewMo72312f0.bindNativeView(this.f56108e, abstractC13924rM92309a, biddingIntermediateMaterialBean);
            }
        }
        m72766m1(false);
        ViewGroup viewGroupMo72313g1 = mo72313g0();
        if (viewGroupMo72313g1 != null) {
            viewGroupMo72313g1.setVisibility(0);
        }
        m72725I(str);
        m72748W0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W1 */
    public static final Unit m72654W1(BaseVideoAdHelper baseVideoAdHelper) {
        baseVideoAdHelper.mo72300H(false);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: X */
    private final int m72655X(String str) {
        JsonElement jsonElement;
        JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b(str);
        if (jsonObjectM63626b == null || (jsonElement = jsonObjectM63626b.get("bubbleFrequency")) == null) {
            return 3;
        }
        return jsonElement.getAsInt();
    }

    /* JADX INFO: renamed from: X0 */
    private final boolean m72656X0() {
        return this.f56117n < m72772q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public static final Unit m72657X1(BaseVideoAdHelper baseVideoAdHelper) {
        baseVideoAdHelper.mo72300H(false);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: Y1 */
    private final void m72658Y1(String str, Function0 function0, Function0 function1) {
        LifecycleCoroutineScope lifecycleCoroutineScope = this.f56104a;
        if (lifecycleCoroutineScope != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScope, null, null, new BaseVideoAdHelper$showSceneAd$1(str, this, function0, function1, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m72659Z0(final Function0 function0, final Function0 function1) {
        m72658Y1("VideoInterpolateBidScene", new Function0() { // from class: com.transsion.postdetail.ad.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseVideoAdHelper.m72663a1(function0);
            }
        }, new Function0() { // from class: com.transsion.postdetail.ad.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseVideoAdHelper.m72665b1(this.f56166a, function1);
            }
        });
    }

    /* JADX INFO: renamed from: Z1 */
    static /* synthetic */ void m72660Z1(BaseVideoAdHelper baseVideoAdHelper, String str, Function0 function0, Function0 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSceneAd");
        }
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        baseVideoAdHelper.m72658Y1(str, function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public final String m72662a0(long j11) {
        return j11 + "s";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final Unit m72663a1(Function0 function0) {
        function0.invoke();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final Unit m72665b1(BaseVideoAdHelper baseVideoAdHelper, Function0 function0) {
        baseVideoAdHelper.mo72300H(false);
        function0.invoke();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public static final Unit m72666b2() {
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public static final Unit m72668c2(BaseVideoAdHelper baseVideoAdHelper) {
        Function1 function1 = baseVideoAdHelper.f56106c;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        baseVideoAdHelper.m72676g1();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public final void m72670d2(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
        Context context;
        if (this.f56111h) {
            return;
        }
        mo72300H(true);
        this.f56114k = true;
        NativeWrapperAdView nativeWrapperAdViewMo72312f0 = mo72312f0();
        if (nativeWrapperAdViewMo72312f0 != null && (context = nativeWrapperAdViewMo72312f0.getContext()) != null) {
            C23245b c23245b = C23245b.f70802a;
            BiddingNativeManager biddingNativeManager = this.f56108e;
            AbstractC13924r abstractC13924rM92309a = c23245b.m92309a(context, biddingNativeManager != null ? biddingNativeManager.getMSceneId() : null);
            NativeWrapperAdView nativeWrapperAdViewMo72307V = mo72307V();
            if (nativeWrapperAdViewMo72307V != null) {
                nativeWrapperAdViewMo72307V.bindNativeView(this.f56108e, abstractC13924rM92309a, biddingIntermediateMaterialBean);
            }
        }
        m72766m1(true);
        ViewGroup viewGroupMo72315h0 = mo72315h0();
        if (viewGroupMo72315h0 != null) {
            viewGroupMo72315h0.setVisibility(0);
        }
        ImageView imageViewMo72320t0 = mo72320t0();
        if (imageViewMo72320t0 != null) {
            imageViewMo72320t0.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ad.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseVideoAdHelper.m72673e2(this.f56158a, view);
                }
            });
        }
        m72741R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public final void m72672e1(String str, BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
        this.f56110g = str;
        LifecycleCoroutineScope lifecycleCoroutineScope = this.f56104a;
        if (lifecycleCoroutineScope != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScope, null, null, new BaseVideoAdHelper$onAdLoad$1(str, this, biddingIntermediateMaterialBean, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public static final void m72673e2(BaseVideoAdHelper baseVideoAdHelper, View view) {
        baseVideoAdHelper.m72735O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public final void m72676g1() {
        Function0 function0 = this.f56107d;
        if (function0 != null) {
            function0.invoke();
        }
        this.f56107d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public static final Unit m72677g2(BaseVideoAdHelper baseVideoAdHelper) {
        baseVideoAdHelper.mo72300H(false);
        baseVideoAdHelper.m72676g1();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public final void m72679h1() {
        this.f56125v = 0L;
        this.f56126w = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h2 */
    public final void m72680h2(String str) {
        Object objM112707constructorimpl;
        if (str == null || !this.f56111h) {
            return;
        }
        if ((Intrinsics.m97797c(str, "VideoStartBidScene") || Intrinsics.m97797c(str, "VideoInterpolateBidScene")) && this.f56098L < m72760i0()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                InterfaceC23498a interfaceC23498a = this.f56100N;
                Unit unit = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (interfaceC23498a != null) {
                    View root = interfaceC23498a.getRoot();
                    ConstraintLayout constraintLayout = root instanceof ConstraintLayout ? (ConstraintLayout) root : null;
                    if (constraintLayout == null) {
                        return;
                    }
                    Context context = GslbSdk.context;
                    Intrinsics.m97801g(context, "context");
                    VideoFloatingView videoFloatingView = new VideoFloatingView(context, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
                    this.f56101O = videoFloatingView;
                    videoFloatingView.show(this.f56104a, constraintLayout, new Function0() { // from class: com.transsion.postdetail.ad.p
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BaseVideoAdHelper.m72682i2(this.f56170a);
                        }
                    });
                    unit = Unit.f75682a;
                }
                objM112707constructorimpl = Result.m112707constructorimpl(unit);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            Result.m112706boximpl(objM112707constructorimpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public static final Unit m72682i2(BaseVideoAdHelper baseVideoAdHelper) {
        baseVideoAdHelper.f56098L++;
        C14496b.f50966a.m65344b().putInt(baseVideoAdHelper.f56088B, baseVideoAdHelper.f56098L);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: j1 */
    private final void m72684j1() {
        NativeWrapperAdView nativeWrapperAdViewMo72312f0 = mo72312f0();
        CardView cardView = nativeWrapperAdViewMo72312f0 != null ? (CardView) nativeWrapperAdViewMo72312f0.findViewById(R$id.adChoicesViewCard) : null;
        if (cardView != null) {
            ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
            ConstraintLayout.C2308b c2308b = layoutParams instanceof ConstraintLayout.C2308b ? (ConstraintLayout.C2308b) layoutParams : null;
            if (c2308b != null) {
                int iM27313a = AbstractC5776a0.m27313a(this.f56111h ? 16.0f : 12.0f);
                ((ViewGroup.MarginLayoutParams) c2308b).leftMargin = iM27313a;
                ((ViewGroup.MarginLayoutParams) c2308b).topMargin = iM27313a;
            }
            View childAt = cardView.getChildAt(0);
            TAdChoicesView tAdChoicesView = childAt instanceof TAdChoicesView ? (TAdChoicesView) childAt : null;
            View childAt2 = tAdChoicesView != null ? tAdChoicesView.getChildAt(0) : null;
            if (childAt2 == null) {
                m72689l1();
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            int iM27313a2 = AbstractC5776a0.m27313a(this.f56111h ? 26.0f : 22.0f);
            layoutParams2.width = iM27313a2;
            layoutParams2.height = iM27313a2;
            ImageView imageView = childAt2 instanceof ImageView ? (ImageView) childAt2 : null;
            if (imageView != null) {
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            m72689l1();
        }
    }

    /* JADX INFO: renamed from: j2 */
    private final void m72685j2() {
        NativeWrapperAdView nativeWrapperAdViewMo72312f0 = mo72312f0();
        BubbleTextView bubbleTextView = nativeWrapperAdViewMo72312f0 != null ? (BubbleTextView) nativeWrapperAdViewMo72312f0.findViewById(R$id.bubble_tip) : null;
        this.f56089C = bubbleTextView;
        if (bubbleTextView != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(bubbleTextView, "translationY", -35.0f, 15.0f, -35.0f);
            objectAnimatorOfFloat.setDuration(900L);
            objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.setRepeatMode(1);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat);
            animatorSet.start();
            AbstractC26006c.m102058k(bubbleTextView);
            this.f56090D = animatorSet;
        }
    }

    /* JADX INFO: renamed from: k2 */
    private final void m72687k2() {
        C28146e bind;
        TextView textView;
        C28146e bind2;
        TextView textView2;
        if (this.f56122s) {
            this.f56118o = false;
            return;
        }
        m72741R();
        long jM72770p0 = m72770p0();
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = jM72770p0 / ((long) 1000);
        AdInterceptTimerView adInterceptTimerViewMo72311e0 = mo72311e0();
        if (adInterceptTimerViewMo72311e0 != null) {
            AbstractC26006c.m102058k(adInterceptTimerViewMo72311e0);
        }
        AdInterceptTimerView adInterceptTimerViewMo72311e1 = mo72311e0();
        if (adInterceptTimerViewMo72311e1 != null && (bind2 = adInterceptTimerViewMo72311e1.getBind()) != null && (textView2 = bind2.f86412d) != null) {
            textView2.setText(m72662a0(longRef.element));
        }
        AdInterceptTimerView adInterceptTimerViewMo72311e2 = mo72311e0();
        if (adInterceptTimerViewMo72311e2 != null && (bind = adInterceptTimerViewMo72311e2.getBind()) != null && (textView = bind.f86414f) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ad.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseVideoAdHelper.m72690l2(this.f56163a, view);
                }
            });
        }
        CountDownTimerC16682d countDownTimerC16682d = new CountDownTimerC16682d(jM72770p0, this, longRef);
        this.f56124u = countDownTimerC16682d;
        countDownTimerC16682d.start();
    }

    /* JADX INFO: renamed from: l1 */
    private final void m72689l1() {
        ImageView imageView;
        TextView textView;
        TextView textView2;
        AdCountDownView adCountDownViewMo72308W = mo72308W();
        if (adCountDownViewMo72308W != null) {
            ViewGroup.LayoutParams layoutParams = adCountDownViewMo72308W.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                int iM27313a = AbstractC5776a0.m27313a(this.f56111h ? 16.0f : 12.0f);
                layoutParams2.topMargin = iM27313a;
                layoutParams2.rightMargin = iM27313a;
            }
            float f11 = this.f56111h ? 14.0f : 12.0f;
            C28167o0 bind = adCountDownViewMo72308W.getBind();
            if (bind != null && (textView2 = bind.f86578d) != null) {
                textView2.getLayoutParams().height = AbstractC5776a0.m27313a(this.f56111h ? 28.0f : 24.0f);
                textView2.setTextSize(f11);
            }
            C28167o0 bind2 = adCountDownViewMo72308W.getBind();
            if (bind2 != null && (textView = bind2.f86579e) != null) {
                textView.setTextSize(f11);
            }
            C28167o0 bind3 = adCountDownViewMo72308W.getBind();
            if (bind3 == null || (imageView = bind3.f86576b) == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            int iM27313a2 = AbstractC5776a0.m27313a(this.f56111h ? 18.0f : 15.0f);
            layoutParams3.width = iM27313a2;
            layoutParams3.height = iM27313a2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public static final void m72690l2(BaseVideoAdHelper baseVideoAdHelper, View view) {
        m72642M(baseVideoAdHelper, false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public final void m72692m2() {
        AnimatorSet animatorSet = this.f56090D;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.cancel();
        }
        BubbleTextView bubbleTextView = this.f56089C;
        if (bubbleTextView != null) {
            AbstractC26006c.m102054g(bubbleTextView);
        }
        this.f56090D = null;
    }

    /* JADX INFO: renamed from: n1 */
    private final void m72694n1() {
        NativeWrapperAdView nativeWrapperAdViewMo72312f0 = mo72312f0();
        BubbleTextView bubbleTextView = nativeWrapperAdViewMo72312f0 != null ? (BubbleTextView) nativeWrapperAdViewMo72312f0.findViewById(R$id.bubble_tip) : null;
        this.f56089C = bubbleTextView;
        if (bubbleTextView != null) {
            bubbleTextView.setTextSize(this.f56111h ? 16.0f : 12.0f);
            bubbleTextView.setArrowPosition(AbstractC5776a0.m27313a(this.f56111h ? 110.0f : 90.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.transsion.postdetail.ad.BaseVideoAdHelper$wrapperAdListener$1] */
    /* JADX INFO: renamed from: o2 */
    public final BaseVideoAdHelper$wrapperAdListener$1 m72696o2(final String str, final Function0 function0, final Function0 function1) {
        return new AbstractC23854a() { // from class: com.transsion.postdetail.ad.BaseVideoAdHelper$wrapperAdListener$1
            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: i */
            public void mo62846i(TAdErrorCode tAdErrorCode) {
                LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = this.f56137d.m72779w0();
                if (lifecycleCoroutineScopeM72779w0 != null) {
                    AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new BaseVideoAdHelper$wrapperAdListener$1$onBiddingError$1(function1, null), 3, null);
                }
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: j */
            public void mo62778j(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = this.f56137d.m72779w0();
                if (lifecycleCoroutineScopeM72779w0 != null) {
                    AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new BaseVideoAdHelper$wrapperAdListener$1$onBiddingLoad$1(function0, this.f56137d, str, biddingIntermediateMaterialBean, null), 3, null);
                }
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: l */
            public void mo62849l(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                super.mo62849l(biddingIntermediateMaterialBean);
                this.f56137d.m72737P();
                BaseVideoAdHelper baseVideoAdHelper = this.f56137d;
                baseVideoAdHelper.m72680h2(baseVideoAdHelper.f56102P);
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: m */
            public void mo62851m(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = this.f56137d.m72779w0();
                if (lifecycleCoroutineScopeM72779w0 != null) {
                    AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new BaseVideoAdHelper$wrapperAdListener$1$onBiddingWrapperAdClose$1(this.f56137d, null), 3, null);
                }
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: p */
            public void mo62855p(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                super.mo62855p(biddingIntermediateMaterialBean);
                LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = this.f56137d.m72779w0();
                if (lifecycleCoroutineScopeM72779w0 != null) {
                    AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new C16683xa0e8fc28(function1, null), 3, null);
                }
            }
        };
    }

    /* JADX INFO: renamed from: q1 */
    private final void m72699q1() {
        AdInterceptTimerView adInterceptTimerViewMo72311e0 = mo72311e0();
        if (adInterceptTimerViewMo72311e0 != null) {
            ViewGroup.LayoutParams layoutParams = adInterceptTimerViewMo72311e0.getLayoutParams();
            ConstraintLayout.C2308b c2308b = layoutParams instanceof ConstraintLayout.C2308b ? (ConstraintLayout.C2308b) layoutParams : null;
            if (c2308b != null) {
                ((ViewGroup.MarginLayoutParams) c2308b).topMargin = AbstractC5776a0.m27313a(this.f56111h ? 16.0f : 12.0f);
            }
            int childCount = adInterceptTimerViewMo72311e0.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = adInterceptTimerViewMo72311e0.getChildAt(i11);
                if (childAt instanceof AppCompatTextView) {
                    ((AppCompatTextView) childAt).setTextSize(this.f56111h ? 14.0f : 12.0f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: r1 */
    private final void m72701r1() {
        View viewMo72316k0 = mo72316k0();
        if (viewMo72316k0 != null) {
            ViewGroup.LayoutParams layoutParams = viewMo72316k0.getLayoutParams();
            ConstraintLayout.C2308b c2308b = layoutParams instanceof ConstraintLayout.C2308b ? (ConstraintLayout.C2308b) layoutParams : null;
            if (c2308b != null) {
                int height = -1;
                ((ViewGroup.MarginLayoutParams) c2308b).width = -1;
                if (!this.f56111h) {
                    ViewGroup viewGroupMo72297C0 = mo72297C0();
                    height = viewGroupMo72297C0 != null ? viewGroupMo72297C0.getHeight() : (int) ((((double) ((ViewGroup.MarginLayoutParams) c2308b).width) * 9.0d) / ((double) 16));
                }
                ((ViewGroup.MarginLayoutParams) c2308b).height = height;
            }
        }
    }

    /* JADX INFO: renamed from: s1 */
    private final void m72703s1() {
        BiddingNativeManager biddingNativeManager = this.f56108e;
        if (biddingNativeManager == null || biddingNativeManager.m63195R0()) {
            NativeWrapperAdView nativeWrapperAdViewMo72312f0 = mo72312f0();
            final TMediaView tMediaView = nativeWrapperAdViewMo72312f0 != null ? (TMediaView) nativeWrapperAdViewMo72312f0.findViewById(R$id.native_ad_media) : null;
            if (tMediaView != null) {
                tMediaView.post(new Runnable() { // from class: com.transsion.postdetail.ad.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseVideoAdHelper.m72705t1(tMediaView, this);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final void m72705t1(TMediaView tMediaView, BaseVideoAdHelper baseVideoAdHelper) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = tMediaView.getLayoutParams();
        ConstraintLayout.C2308b c2308b = layoutParams2 instanceof ConstraintLayout.C2308b ? (ConstraintLayout.C2308b) layoutParams2 : null;
        if (c2308b != null) {
            if (baseVideoAdHelper.f56111h) {
                ((ViewGroup.MarginLayoutParams) c2308b).height = -1;
                c2308b.f7934I = null;
            } else {
                ((ViewGroup.MarginLayoutParams) c2308b).height = 0;
                c2308b.f7934I = "H,16:9";
            }
        }
        View mediaView = tMediaView.getMediaView();
        if (mediaView != null) {
            mediaView.getLayoutParams().height = -1;
            mediaView.requestLayout();
            if (mediaView instanceof ViewGroup) {
                View childAt = ((ViewGroup) mediaView).getChildAt(0);
                if (childAt != null && (layoutParams = childAt.getLayoutParams()) != null) {
                    layoutParams.height = -1;
                }
                if (childAt != null) {
                    childAt.requestLayout();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private final void m72710x1() {
        ViewGroup viewGroupMo72313g0 = mo72313g0();
        if (viewGroupMo72313g0 != null) {
            ViewGroup.LayoutParams layoutParams = viewGroupMo72313g0.getLayoutParams();
            int height = -1;
            layoutParams.width = -1;
            if (!this.f56111h) {
                ViewGroup viewGroupMo72297C0 = mo72297C0();
                height = viewGroupMo72297C0 != null ? viewGroupMo72297C0.getHeight() : (int) ((((double) layoutParams.width) * 9.0d) / ((double) 16));
            }
            layoutParams.height = height;
        }
    }

    /* JADX INFO: renamed from: y1 */
    private final void m72712y1() {
        NativeWrapperAdView nativeWrapperAdViewMo72312f0 = mo72312f0();
        AppCompatTextView appCompatTextView = nativeWrapperAdViewMo72312f0 != null ? (AppCompatTextView) nativeWrapperAdViewMo72312f0.findViewById(R$id.native_ad_action) : null;
        if (appCompatTextView != null) {
            ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
            ConstraintLayout.C2308b c2308b = layoutParams instanceof ConstraintLayout.C2308b ? (ConstraintLayout.C2308b) layoutParams : null;
            if (c2308b != null) {
                ((ViewGroup.MarginLayoutParams) c2308b).height = AbstractC5776a0.m27313a(this.f56111h ? 44.0f : 28.0f);
                ((ViewGroup.MarginLayoutParams) c2308b).rightMargin = AbstractC5776a0.m27313a(this.f56111h ? 73.0f : 52.0f);
                ((ViewGroup.MarginLayoutParams) c2308b).bottomMargin = AbstractC5776a0.m27313a(this.f56111h ? 16.0f : 10.0f);
            }
            appCompatTextView.setTextSize(this.f56111h ? 16.0f : 12.0f);
            int iM27313a = AbstractC5776a0.m27313a(this.f56111h ? 16.0f : 6.0f);
            appCompatTextView.setPadding(iM27313a, 3, iM27313a, 4);
        }
    }

    /* JADX INFO: renamed from: A1 */
    protected final void m72714A1(boolean z11) {
        this.f56121r = z11;
    }

    /* JADX INFO: renamed from: B0 */
    protected final long m72715B0() {
        return this.f56126w;
    }

    /* JADX INFO: renamed from: B1 */
    protected final void m72716B1(boolean z11) {
        this.f56111h = z11;
    }

    /* JADX INFO: renamed from: C0 */
    protected abstract ViewGroup mo72297C0();

    /* JADX INFO: renamed from: D0 */
    protected final long m72717D0() {
        return this.f56128y;
    }

    /* JADX INFO: renamed from: D1 */
    protected final void m72718D1(boolean z11) {
        this.f56114k = z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: E0 */
    public final void m72719E0(long j11, long j12) {
        this.f56112i = m72649S0(m72626A0(), j11);
        this.f56113j = m72649S0(m72754c0(), j12);
    }

    /* JADX INFO: renamed from: E1 */
    protected final void m72720E1(long j11) {
        this.f56125v = j11;
    }

    /* JADX INFO: renamed from: F0 */
    protected final void m72721F0(InterfaceC23498a interfaceC23498a, String str, Function1 function1) {
        View root;
        this.f56100N = interfaceC23498a;
        Context context = (interfaceC23498a == null || (root = interfaceC23498a.getRoot()) == null) ? null : root.getContext();
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        this.f56104a = appCompatActivity != null ? AbstractC3226v.m14968a(appCompatActivity) : null;
        this.f56105b = str;
        this.f56106c = function1;
        m72634H0();
        BiddingIconAdManager.f49464s.m63075a("VerticalPauseScene", C14058c.f49742a.m63681a(str));
    }

    /* JADX INFO: renamed from: F1 */
    protected final void m72722F1(int i11) {
        this.f56119p = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: G0 */
    public final void m72723G0(String scene) {
        Intrinsics.m97802h(scene, "scene");
        if (!m72750Y0(scene, true)) {
            C14496b c14496b = C14496b.f50966a;
            this.f56092F = c14496b.m65344b().getInt(this.f56087A, 0);
            this.f56091E = c14496b.m65344b().getInt(this.f56129z, 0);
            this.f56098L = c14496b.m65344b().getInt(this.f56088B, 0);
            return;
        }
        this.f56092F = 0;
        C14496b c14496b2 = C14496b.f50966a;
        c14496b2.m65344b().putInt(this.f56087A, 0);
        this.f56091E = 0;
        c14496b2.m65344b().putInt(this.f56129z, 0);
        this.f56098L = 0;
        c14496b2.m65344b().putInt(this.f56088B, 0);
    }

    /* JADX INFO: renamed from: G1 */
    protected final void m72724G1(boolean z11) {
        this.f56122s = z11;
    }

    /* JADX INFO: renamed from: H */
    public void mo72300H(boolean z11) {
        Function1 function1 = this.f56106c;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z11));
        }
        this.f56120q = z11;
    }

    /* JADX INFO: renamed from: I */
    protected final void m72725I(String sceneId) {
        Intrinsics.m97802h(sceneId, "sceneId");
        Ref.IntRef intRef = new Ref.IntRef();
        int iM72651T = this.f56119p;
        if (iM72651T == 0) {
            iM72651T = m72651T(sceneId);
        }
        intRef.element = iM72651T;
        AdCountDownView adCountDownViewMo72308W = mo72308W();
        if (adCountDownViewMo72308W != null) {
            adCountDownViewMo72308W.refreshCountDown(intRef.element);
        }
        m72739Q();
        CountDownTimerC16680b countDownTimerC16680b = new CountDownTimerC16680b(intRef, sceneId, ((long) intRef.element) * 1000);
        this.f56123t = countDownTimerC16680b;
        countDownTimerC16680b.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: I1 */
    public final void m72726I1(boolean z11) {
        this.f56113j = z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: J1 */
    public final void m72727J1(boolean z11) {
        this.f56112i = z11;
    }

    /* JADX INFO: renamed from: K1 */
    protected final void m72728K1(long j11) {
        this.f56126w = j11;
    }

    /* JADX INFO: renamed from: L */
    protected final void m72729L(boolean z11, Function0 function0) {
        InterfaceC27085d interfaceC27085d;
        if (!z11 && (interfaceC27085d = (InterfaceC27085d) TheRouter.m61774d(InterfaceC27085d.class, new Object[0])) != null) {
            interfaceC27085d.mo100936h();
        }
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b != null) {
            InterfaceC22998b.a.m91587c(interfaceC22998b, AbstractC5775a.m27311b(), MemberSource.SOURCE_LANDSCAPE_PLAY, new C16681c(function0), false, null, 24, null);
        }
    }

    /* JADX INFO: renamed from: L1 */
    public final void m72730L1(long j11) {
        this.f56128y = j11;
    }

    /* JADX INFO: renamed from: M0 */
    public final String m72731M0(String str) {
        if (TextUtils.isEmpty(str)) {
            return "sceneId is empty";
        }
        C14049c c14049c = C14049c.f49718a;
        if (c14049c.m63624g(str)) {
            return "当前是会员,不展示广告";
        }
        if (!C14048b.f49717a.m63614k()) {
            return "全局场景关闭";
        }
        if (C14049c.m63620f(c14049c, str, false, 2, null)) {
            return "场景关闭";
        }
        return C14050d.f49719a.m63626b(str) == null ? "场景配置为空" : "";
    }

    /* JADX INFO: renamed from: N */
    public final void m72732N(long j11, Function0 callback) {
        Intrinsics.m97802h(callback, "callback");
        if (!this.f56103Q && this.f56113j && this.f56128y - j11 <= 30000) {
            this.f56103Q = true;
            BiddingNativeManager.f49542v.m63198a("VideoEndBidScene", C14058c.f49742a.m63681a(this.f56105b));
        }
        if (this.f56127x == 0) {
            this.f56127x = j11;
            return;
        }
        if (this.f56122s || this.f56120q || !m72656X0()) {
            return;
        }
        if (Math.abs(j11 - this.f56127x) > 5000) {
            this.f56127x = j11;
            this.f56125v += System.currentTimeMillis() - this.f56126w;
            this.f56126w = System.currentTimeMillis();
        }
        if (this.f56125v >= m72768o0()) {
            this.f56107d = callback;
            m72646Q1();
        }
    }

    /* JADX INFO: renamed from: N0 */
    protected final boolean m72733N0() {
        return this.f56120q;
    }

    /* JADX INFO: renamed from: N1 */
    protected final void m72734N1(String str) {
        NativeWrapperAdView nativeWrapperAdViewMo72312f0;
        NativeWrapperAdView nativeWrapperAdViewMo72312f1;
        if (Intrinsics.m97797c(str, "VideoStartBidScene")) {
            if (this.f56091E < m72751Z() && (nativeWrapperAdViewMo72312f1 = mo72312f0()) != null) {
                nativeWrapperAdViewMo72312f1.postDelayed(new Runnable() { // from class: com.transsion.postdetail.ad.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseVideoAdHelper.m72644O1(this.f56155a);
                    }
                }, 2000L);
                return;
            }
            return;
        }
        if (!Intrinsics.m97797c(str, "VideoInterpolateBidScene") || this.f56092F >= m72749Y() || (nativeWrapperAdViewMo72312f0 = mo72312f0()) == null) {
            return;
        }
        nativeWrapperAdViewMo72312f0.postDelayed(new Runnable() { // from class: com.transsion.postdetail.ad.c
            @Override // java.lang.Runnable
            public final void run() {
                BaseVideoAdHelper.m72645P1(this.f56156a);
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: O */
    protected final void m72735O() {
        if (TextUtils.equals(this.f56110g, "LandscapePauseSceneNew") || TextUtils.equals(this.f56110g, "VerticalPauseScene")) {
            m72737P();
        }
    }

    /* JADX INFO: renamed from: O0 */
    protected final boolean m72736O0() {
        return this.f56118o;
    }

    /* JADX INFO: renamed from: P */
    protected final void m72737P() {
        LifecycleCoroutineScope lifecycleCoroutineScope = this.f56104a;
        if (lifecycleCoroutineScope != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScope, null, null, new BaseVideoAdHelper$closeSceneAd$1(this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: P0 */
    protected final boolean m72738P0() {
        return this.f56116m;
    }

    /* JADX INFO: renamed from: Q */
    protected final void m72739Q() {
        CountDownTimer countDownTimer = this.f56123t;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f56123t = null;
    }

    /* JADX INFO: renamed from: Q0 */
    protected final boolean m72740Q0() {
        return this.f56121r;
    }

    /* JADX INFO: renamed from: R */
    protected final void m72741R() {
        CountDownTimer countDownTimer = this.f56124u;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f56124u = null;
        AdInterceptTimerView adInterceptTimerViewMo72311e0 = mo72311e0();
        if (adInterceptTimerViewMo72311e0 != null) {
            AbstractC26006c.m102054g(adInterceptTimerViewMo72311e0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: R0 */
    public final boolean m72742R0() {
        return this.f56111h;
    }

    /* JADX INFO: renamed from: T0 */
    public final boolean m72743T0() {
        return !InterfaceC27138e.f82251a.m105606b().mo86576k();
    }

    /* JADX INFO: renamed from: U */
    protected final int m72744U() {
        JsonElement jsonElement;
        JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b("VideoEndBidScene");
        return ((jsonObjectM63626b == null || (jsonElement = jsonObjectM63626b.get("threshold")) == null) ? 5 : jsonElement.getAsInt()) * 60000;
    }

    /* JADX INFO: renamed from: U0 */
    protected final boolean m72745U0() {
        return this.f56114k;
    }

    /* JADX INFO: renamed from: V */
    protected abstract NativeWrapperAdView mo72307V();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: V0 */
    public final boolean m72746V0() {
        return this.f56122s;
    }

    /* JADX INFO: renamed from: V1 */
    protected final void m72747V1() {
        if (this.f56111h) {
            m72660Z1(this, "LandscapePauseSceneNew", null, new Function0() { // from class: com.transsion.postdetail.ad.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseVideoAdHelper.m72657X1(this.f56154a);
                }
            }, 2, null);
        } else {
            m72660Z1(this, "VerticalPauseScene", null, new Function0() { // from class: com.transsion.postdetail.ad.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseVideoAdHelper.m72654W1(this.f56164a);
                }
            }, 2, null);
        }
    }

    /* JADX INFO: renamed from: W */
    protected abstract AdCountDownView mo72308W();

    /* JADX INFO: renamed from: W0 */
    protected final void m72748W0() {
        if (this.f56111h) {
            ImageView imageViewMo72325z0 = mo72325z0();
            if (imageViewMo72325z0 != null) {
                imageViewMo72325z0.setImageResource(R$mipmap.ad_rotate);
                return;
            }
            return;
        }
        ImageView imageViewMo72325z1 = mo72325z0();
        if (imageViewMo72325z1 != null) {
            imageViewMo72325z1.setImageResource(R$mipmap.ad_fullscreen);
        }
    }

    /* JADX INFO: renamed from: Y */
    protected final int m72749Y() {
        return ((Number) this.f56094H.getValue()).intValue();
    }

    /* JADX INFO: renamed from: Y0 */
    public final boolean m72750Y0(String scene, boolean z11) {
        Intrinsics.m97802h(scene, "scene");
        String str = "zero_clock_timestamp_" + scene;
        C14496b c14496b = C14496b.f50966a;
        long j11 = c14496b.m65344b().getLong(str, 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z12 = jCurrentTimeMillis - j11 >= 86400000;
        if (z11 && z12) {
            c14496b.m65344b().putLong(str, C8113l0.m37947c(jCurrentTimeMillis));
        }
        return z12;
    }

    /* JADX INFO: renamed from: Z */
    protected final int m72751Z() {
        return ((Number) this.f56093G.getValue()).intValue();
    }

    /* JADX INFO: renamed from: a2 */
    public final void m72752a2(Function0 callback) {
        Intrinsics.m97802h(callback, "callback");
        this.f56107d = callback;
        if (this.f56112i && m72743T0()) {
            m72658Y1("VideoStartBidScene", new Function0() { // from class: com.transsion.postdetail.ad.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseVideoAdHelper.m72666b2();
                }
            }, new Function0() { // from class: com.transsion.postdetail.ad.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseVideoAdHelper.m72668c2(this.f56162a);
                }
            });
        } else {
            m72676g1();
        }
    }

    /* JADX INFO: renamed from: b0 */
    protected final String m72753b0() {
        return this.f56110g;
    }

    /* JADX INFO: renamed from: c0 */
    protected final int m72754c0() {
        JsonElement jsonElement;
        JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b("VideoEndBidScene");
        return ((jsonObjectM63626b == null || (jsonElement = jsonObjectM63626b.get("interval")) == null) ? 1440 : jsonElement.getAsInt()) * 60000;
    }

    /* JADX INFO: renamed from: c1 */
    protected final void m72755c1(String sceneId, Function0 function0, Function0 function1) {
        Context context;
        Intrinsics.m97802h(sceneId, "sceneId");
        ViewGroup viewGroupMo72315h0 = mo72315h0();
        if (viewGroupMo72315h0 == null || (context = viewGroupMo72315h0.getContext()) == null) {
            return;
        }
        BiddingInterstitialManager biddingInterstitialManager = this.f56109f;
        if (biddingInterstitialManager != null) {
            biddingInterstitialManager.mo62775U();
        }
        this.f56109f = null;
        LifecycleCoroutineScope lifecycleCoroutineScope = this.f56104a;
        if (lifecycleCoroutineScope != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScope, null, null, new BaseVideoAdHelper$loadLandPauseAd$1(context, this, sceneId, function0, function1, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: d0 */
    protected final CountDownTimer m72756d0() {
        return this.f56124u;
    }

    /* JADX INFO: renamed from: d1 */
    protected final void m72757d1(String sceneId, Function0 function0, Function0 function1) {
        Context context;
        Intrinsics.m97802h(sceneId, "sceneId");
        ViewGroup viewGroupMo72313g0 = mo72313g0();
        if (viewGroupMo72313g0 == null || (context = viewGroupMo72313g0.getContext()) == null) {
            return;
        }
        BiddingNativeManager biddingNativeManager = this.f56108e;
        if (biddingNativeManager != null) {
            biddingNativeManager.mo62775U();
        }
        this.f56108e = null;
        LifecycleCoroutineScope lifecycleCoroutineScope = this.f56104a;
        if (lifecycleCoroutineScope != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScope, null, null, new BaseVideoAdHelper$loadNativeAd$1(context, this, sceneId, function0, function1, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: e0 */
    protected abstract AdInterceptTimerView mo72311e0();

    /* JADX INFO: renamed from: f0 */
    protected abstract NativeWrapperAdView mo72312f0();

    /* JADX INFO: renamed from: f1 */
    public final void m72758f1() {
        if (this.f56111h) {
            BiddingInterstitialManager.f49491t.m63106a("LandscapePauseSceneNew", C14058c.f49742a.m63681a(this.f56105b));
            return;
        }
        VideoFloatingView videoFloatingView = this.f56101O;
        if (videoFloatingView != null) {
            videoFloatingView.hide();
        }
    }

    /* JADX INFO: renamed from: f2 */
    protected final void m72759f2(Function0 callback) {
        Intrinsics.m97802h(callback, "callback");
        boolean z11 = System.currentTimeMillis() - this.f56115l > ((long) m72744U());
        if (this.f56113j && z11 && m72743T0()) {
            m72658Y1("VideoEndBidScene", callback, new Function0() { // from class: com.transsion.postdetail.ad.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseVideoAdHelper.m72677g2(this.f56159a);
                }
            });
        } else {
            m72676g1();
        }
    }

    /* JADX INFO: renamed from: g0 */
    protected abstract ViewGroup mo72313g0();

    /* JADX INFO: renamed from: h0 */
    protected abstract ViewGroup mo72315h0();

    /* JADX INFO: renamed from: i0 */
    protected final int m72760i0() {
        return ((Number) this.f56099M.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: i1 */
    public final void m72761i1() {
        this.f56127x = 0L;
        this.f56115l = 0L;
        this.f56125v = 0L;
        this.f56117n = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: j0 */
    public final String m72762j0() {
        return this.f56105b;
    }

    /* JADX INFO: renamed from: k0 */
    protected abstract View mo72316k0();

    /* JADX INFO: renamed from: k1 */
    protected final void m72763k1(Function0 function0) {
        this.f56107d = function0;
    }

    /* JADX INFO: renamed from: l0 */
    protected final int m72764l0() {
        JsonElement jsonElement;
        JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b("VideoInterpolateBidScene");
        return ((jsonObjectM63626b == null || (jsonElement = jsonObjectM63626b.get("enterCountdown")) == null) ? 10 : jsonElement.getAsInt()) * 1000;
    }

    /* JADX INFO: renamed from: m0 */
    protected final int m72765m0() {
        JsonElement jsonElement;
        JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b("VideoInterpolateBidScene");
        if (jsonObjectM63626b == null || (jsonElement = jsonObjectM63626b.get("frequency")) == null) {
            return 2;
        }
        return jsonElement.getAsInt();
    }

    /* JADX INFO: renamed from: m1 */
    protected final void m72766m1(boolean z11) {
        try {
            Result.Companion companion = Result.INSTANCE;
            if (z11) {
                m72701r1();
                m72629C1();
                m72643M1(mo72307V(), true);
            } else {
                m72710x1();
                m72703s1();
                m72699q1();
                m72712y1();
                m72635H1();
                m72643M1(mo72312f0(), false);
                m72684j1();
                m72694n1();
            }
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: n0 */
    protected final int m72767n0() {
        JsonElement jsonElement;
        JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b("VideoInterpolateBidScene");
        return ((jsonObjectM63626b == null || (jsonElement = jsonObjectM63626b.get("interval")) == null) ? 15 : jsonElement.getAsInt()) * 60000;
    }

    /* JADX INFO: renamed from: n2 */
    public abstract void mo72318n2();

    /* JADX INFO: renamed from: o0 */
    public final int m72768o0() {
        return m72773r0() - m72770p0();
    }

    /* JADX INFO: renamed from: o1 */
    protected final void m72769o1(CountDownTimer countDownTimer) {
        this.f56124u = countDownTimer;
    }

    /* JADX INFO: renamed from: p0 */
    protected final int m72770p0() {
        return ((Number) this.f56096J.getValue()).intValue();
    }

    /* JADX INFO: renamed from: p1 */
    protected final void m72771p1(boolean z11) {
        this.f56118o = z11;
    }

    /* JADX INFO: renamed from: q0 */
    protected final int m72772q0() {
        return ((Number) this.f56097K.getValue()).intValue();
    }

    /* JADX INFO: renamed from: r0 */
    protected final int m72773r0() {
        return ((Number) this.f56095I.getValue()).intValue();
    }

    /* JADX INFO: renamed from: s0 */
    protected final int m72774s0() {
        return this.f56117n;
    }

    /* JADX INFO: renamed from: t0 */
    protected abstract ImageView mo72320t0();

    /* JADX INFO: renamed from: u0 */
    protected final BiddingNativeManager m72775u0() {
        return this.f56108e;
    }

    /* JADX INFO: renamed from: u1 */
    protected final void m72776u1(int i11) {
        this.f56117n = i11;
    }

    /* JADX INFO: renamed from: v0 */
    protected final BiddingInterstitialManager m72777v0() {
        return this.f56109f;
    }

    /* JADX INFO: renamed from: v1 */
    protected final void m72778v1(BiddingNativeManager biddingNativeManager) {
        this.f56108e = biddingNativeManager;
    }

    /* JADX INFO: renamed from: w0 */
    protected final LifecycleCoroutineScope m72779w0() {
        return this.f56104a;
    }

    /* JADX INFO: renamed from: w1 */
    protected final void m72780w1(boolean z11) {
        this.f56116m = z11;
    }

    /* JADX INFO: renamed from: x0 */
    protected final long m72781x0() {
        return this.f56125v;
    }

    /* JADX INFO: renamed from: y0 */
    protected final int m72782y0() {
        return this.f56119p;
    }

    /* JADX INFO: renamed from: z0 */
    protected abstract ImageView mo72325z0();

    /* JADX INFO: renamed from: z1 */
    protected final void m72783z1(BiddingInterstitialManager biddingInterstitialManager) {
        this.f56109f = biddingInterstitialManager;
    }
}
