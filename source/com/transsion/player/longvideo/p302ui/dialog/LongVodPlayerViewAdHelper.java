package com.transsion.player.longvideo.p302ui.dialog;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;
import androidx.p1004lifecycle.LifecycleCoroutineScope;
import ck.C5110g;
import ck.C5118o;
import com.blankj.utilcode.util.Utils;
import com.cloud.hisavana.sdk.common.util.C8113l0;
import com.cloud.tmc.integration.event.EventConstants;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.hisavana.common.bean.TAdErrorCode;
import com.noober.background.view.BLTextView;
import com.tencent.mmkv.MMKV;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.video.VideoDetailPlayBean;
import com.transsion.baselib.p291db.video.VideoDetailPlayDao;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.bidding.icon.BiddingIconAdManager;
import com.transsion.p285ad.bidding.interstitial.BiddingInterstitialManager;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.p285ad.bidding.video.BiddingVideoManager;
import com.transsion.p285ad.scene.C14047a;
import com.transsion.p285ad.scene.C14050d;
import com.transsion.p285ad.strategy.C14058c;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import com.transsion.player.longvideo.R$string;
import com.transsion.player.longvideo.constants.LongVodContentType;
import com.transsion.player.longvideo.constants.LongVodPageType;
import com.transsion.player.longvideo.p302ui.LongVodPlayerView;
import com.transsion.player.longvideo.p302ui.LongVodUiType;
import com.transsion.player.longvideo.view.LongVodRewardInterceptView;
import com.transsion.player.p303ui.longvideo.ORLongVodPlayerView;
import com.transsion.postdetail.layer.local.LocalBackAdHelper;
import com.transsion.postdetail.p304ad.AdInterceptTimerView;
import com.transsion.postdetail.p304ad.BaseVideoAdHelper;
import com.transsion.postdetail.p306ui.view.AdCountDownView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.InterfaceC25204t1;
import li.C25639b;
import ng.AbstractC26006c;
import p461hi.AbstractC23854a;
import p550kj.C24662i;
import p553ko.C24715a;
import p582lo.C25658g;
import p582lo.C25660i;
import p582lo.C25661j;
import p710qk.C27089h;
import p844vo.C28146e;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class LongVodPlayerViewAdHelper extends BaseVideoAdHelper {

    /* JADX INFO: renamed from: T */
    private C25661j f55783T;

    /* JADX INFO: renamed from: U */
    private C24715a f55784U;

    /* JADX INFO: renamed from: V */
    private VideoDetailPlayBean f55785V;

    /* JADX INFO: renamed from: W */
    private String f55786W;

    /* JADX INFO: renamed from: X */
    private LongVodPageType f55787X;

    /* JADX INFO: renamed from: Z */
    private BiddingVideoManager f55789Z;

    /* JADX INFO: renamed from: a0 */
    private BiddingInterstitialManager f55790a0;

    /* JADX INFO: renamed from: b0 */
    private boolean f55791b0;

    /* JADX INFO: renamed from: c0 */
    private boolean f55792c0;

    /* JADX INFO: renamed from: d0 */
    private boolean f55793d0;

    /* JADX INFO: renamed from: e0 */
    private boolean f55794e0;

    /* JADX INFO: renamed from: f0 */
    private boolean f55795f0;

    /* JADX INFO: renamed from: g0 */
    private boolean f55796g0;

    /* JADX INFO: renamed from: h0 */
    private long f55797h0;

    /* JADX INFO: renamed from: i0 */
    private long f55798i0;

    /* JADX INFO: renamed from: j0 */
    private long f55799j0;

    /* JADX INFO: renamed from: k0 */
    private int f55800k0;

    /* JADX INFO: renamed from: m0 */
    private Function0 f55802m0;

    /* JADX INFO: renamed from: n0 */
    private Function1 f55803n0;

    /* JADX INFO: renamed from: u0 */
    private InterfaceC25204t1 f55810u0;

    /* JADX INFO: renamed from: v0 */
    private int f55811v0;

    /* JADX INFO: renamed from: x0 */
    private LongVodPlayerView f55813x0;

    /* JADX INFO: renamed from: y0 */
    private LocalBackAdHelper f55814y0;

    /* JADX INFO: renamed from: S */
    private final String f55782S = "streamVideo";

    /* JADX INFO: renamed from: Y */
    private final Lazy f55788Y = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.ui.dialog.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LongVodPlayerViewAdHelper.m72246d5();
        }
    });

    /* JADX INFO: renamed from: l0 */
    private String f55801l0 = "";

    /* JADX INFO: renamed from: o0 */
    private final Lazy f55804o0 = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.ui.dialog.o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(LongVodPlayerViewAdHelper.m72195K4(this.f55829a));
        }
    });

    /* JADX INFO: renamed from: p0 */
    private final Lazy f55805p0 = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.ui.dialog.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(LongVodPlayerViewAdHelper.m72170A4(this.f55830a));
        }
    });

    /* JADX INFO: renamed from: q0 */
    private final Lazy f55806q0 = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.ui.dialog.q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(LongVodPlayerViewAdHelper.m72190I4(this.f55831a));
        }
    });

    /* JADX INFO: renamed from: r0 */
    private final Lazy f55807r0 = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.ui.dialog.r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(LongVodPlayerViewAdHelper.m72192J4(this.f55832a));
        }
    });

    /* JADX INFO: renamed from: s0 */
    private final Lazy f55808s0 = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.ui.dialog.s
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(LongVodPlayerViewAdHelper.m72256i4(this.f55833a));
        }
    });

    /* JADX INFO: renamed from: t0 */
    private final Lazy f55809t0 = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.ui.dialog.t
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(LongVodPlayerViewAdHelper.m72249e5());
        }
    });

    /* JADX INFO: renamed from: w0 */
    private final C16541a f55812w0 = new C16541a();

    /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.dialog.LongVodPlayerViewAdHelper$a */
    public static final class C16541a extends AbstractC23854a {
        C16541a() {
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: i */
        public void mo62846i(TAdErrorCode tAdErrorCode) {
            C26866a.a.m104899g(C26866a.f81698a, LongVodPlayerViewAdHelper.this.m72201N3() + " --> rewardInterceptListener --> onError() --> 广告加载失败", false, 2, null);
            LongVodPlayerViewAdHelper.this.m72269p4();
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: j */
        public void mo62778j(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
            C26866a.a.m104899g(C26866a.f81698a, LongVodPlayerViewAdHelper.this.m72201N3() + " --> rewardInterceptListener --> onLoad() --> 广告加载", false, 2, null);
            LongVodPlayerViewAdHelper.this.m72272q4(biddingIntermediateMaterialBean);
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: m */
        public void mo62851m(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
            C26866a.a.m104899g(C26866a.f81698a, LongVodPlayerViewAdHelper.this.m72201N3() + " --> rewardInterceptListener --> onClosed() --> 广告关闭", false, 2, null);
            LongVodPlayerViewAdHelper.this.m72266o4();
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: n */
        public void mo62853n(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
            C26866a.a.m104899g(C26866a.f81698a, LongVodPlayerViewAdHelper.this.m72201N3() + " --> rewardInterceptListener --> onShow() --> Hi广告展示", false, 2, null);
            LongVodPlayerViewAdHelper.this.m72278s4();
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: o */
        public void mo62854o(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
            C26866a.a.m104899g(C26866a.f81698a, LongVodPlayerViewAdHelper.this.m72201N3() + " --> rewardInterceptListener --> onRewarded() --> 广告奖励", false, 2, null);
            LongVodPlayerViewAdHelper.this.m72275r4();
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: p */
        public void mo62855p(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
            C26866a.a.m104899g(C26866a.f81698a, LongVodPlayerViewAdHelper.this.m72201N3() + " --> rewardInterceptListener --> onError() --> 广告展示失败", false, 2, null);
            LongVodPlayerViewAdHelper.this.m72281t4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public static final int m72170A4(LongVodPlayerViewAdHelper longVodPlayerViewAdHelper) {
        return longVodPlayerViewAdHelper.m72217T3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public final void m72174C4() {
        this.f55801l0 = "StreamVideoInterceptInterstitial";
        BiddingInterstitialManager.f49491t.m63106a("StreamVideoInterceptInterstitial", C14058c.f49742a.m63681a(m72762j0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D3 */
    public final void m72176D3() {
        Function1 function1 = this.f55803n0;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(this.f55794e0));
        }
        if (this.f55794e0) {
            m72728K1(System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: D4 */
    private final void m72177D4() {
        if (m72254h4()) {
            return;
        }
        this.f55801l0 = "StreamVideoInterceptRewarded";
        BiddingVideoManager.f49576t.m63267a("StreamVideoInterceptRewarded", C14058c.f49742a.m63681a(m72762j0()));
    }

    /* JADX INFO: renamed from: E3 */
    private final void m72179E3() {
        LongVodRewardInterceptView longVodRewardInterceptView;
        C25658g bind;
        BLTextView bLTextView;
        View root;
        Context context;
        InterfaceC25204t1 interfaceC25204t1 = this.f55810u0;
        String string = null;
        if (interfaceC25204t1 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
        }
        this.f55810u0 = null;
        this.f55811v0 = 0;
        C25661j c25661j = this.f55783T;
        if (c25661j == null || (longVodRewardInterceptView = c25661j.f77915v) == null || (bind = longVodRewardInterceptView.getBind()) == null || (bLTextView = bind.f77869h) == null) {
            return;
        }
        C25661j c25661j2 = this.f55783T;
        if (c25661j2 != null && (root = c25661j2.getRoot()) != null && (context = root.getContext()) != null) {
            string = context.getString(R$string.long_vod_reward_intercept_watch_ad);
        }
        bLTextView.setText(string);
    }

    /* JADX INFO: renamed from: E4 */
    private final void m72180E4(String str, Map map) {
        if (Intrinsics.m97797c(str, "browse")) {
            C24662i c24662i = C24662i.f75350a;
            String str2 = this.f55786W;
            c24662i.m96884s(str2 != null ? str2 : "LongVodPlayer", str, map);
        } else if (Intrinsics.m97797c(str, "click")) {
            C24662i c24662i2 = C24662i.f75350a;
            String str3 = this.f55786W;
            c24662i2.m96884s(str3 != null ? str3 : "LongVodPlayer", str, map);
        }
    }

    /* JADX INFO: renamed from: F4 */
    private final void m72182F4(String str) {
        if (this.f55795f0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("scene_id", "StreamVideoInterceptRewarded");
            linkedHashMap.put("module_name", "stream_rewarded_countdown_timer");
            if (Intrinsics.m97797c(str, "browse")) {
                linkedHashMap.put(EventConstants.KEY_ACTION, "show_view");
            } else if (Intrinsics.m97797c(str, "click")) {
                linkedHashMap.put(EventConstants.KEY_ACTION, "click_member");
            }
            m72180E4(str, linkedHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G3 */
    public static final void m72184G3(final LongVodPlayerViewAdHelper longVodPlayerViewAdHelper, View view) {
        longVodPlayerViewAdHelper.m72729L(true, new Function0() { // from class: com.transsion.player.longvideo.ui.dialog.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LongVodPlayerViewAdHelper.m72187H3(this.f55827a);
            }
        });
        longVodPlayerViewAdHelper.m72182F4("click");
    }

    /* JADX INFO: renamed from: G4 */
    private final void m72185G4(String str, boolean z11) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("scene_id", "StreamVideoInterceptRewarded");
        linkedHashMap.put("module_name", "stream_rewarded_intercept_view");
        if (Intrinsics.m97797c(str, "browse")) {
            linkedHashMap.put(EventConstants.KEY_ACTION, "show_view");
        } else if (Intrinsics.m97797c(str, "click")) {
            linkedHashMap.put(EventConstants.KEY_ACTION, z11 ? "click_ad" : "click_member");
        }
        m72180E4(str, linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H3 */
    public static final Unit m72187H3(LongVodPlayerViewAdHelper longVodPlayerViewAdHelper) {
        longVodPlayerViewAdHelper.m72207P4();
        longVodPlayerViewAdHelper.m72176D3();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: H4 */
    private final void m72188H4() {
        if (!m72746V0() || this.f55811v0 <= 0) {
            return;
        }
        InterfaceC25204t1 interfaceC25204t1 = this.f55810u0;
        if (interfaceC25204t1 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
        }
        LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = m72779w0();
        this.f55810u0 = lifecycleCoroutineScopeM72779w0 != null ? AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new LongVodPlayerViewAdHelper$resumeWatchAdCountdown$1(this, null), 3, null) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I4 */
    public static final int m72190I4(LongVodPlayerViewAdHelper longVodPlayerViewAdHelper) {
        return longVodPlayerViewAdHelper.m72223V3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J4 */
    public static final int m72192J4(LongVodPlayerViewAdHelper longVodPlayerViewAdHelper) {
        return longVodPlayerViewAdHelper.m72229X3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public final void m72194K3() {
        BiddingInterstitialManager biddingInterstitialManager = this.f55790a0;
        if (biddingInterstitialManager != null) {
            biddingInterstitialManager.mo62775U();
        }
        this.f55790a0 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K4 */
    public static final int m72195K4(LongVodPlayerViewAdHelper longVodPlayerViewAdHelper) {
        return longVodPlayerViewAdHelper.m72204O3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L3 */
    public final void m72197L3() {
        BiddingVideoManager biddingVideoManager = this.f55789Z;
        if (biddingVideoManager != null) {
            biddingVideoManager.mo62775U();
        }
        this.f55789Z = null;
    }

    /* JADX INFO: renamed from: M3 */
    private final String m72199M3(long j11) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(j11);
        long seconds = timeUnit.toSeconds(j11) % ((long) 60);
        StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
        String str = String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes), Long.valueOf(seconds)}, 2));
        Intrinsics.m97801g(str, "format(...)");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public final String m72201N3() {
        String simpleName = LongVodPlayerViewAdHelper.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: renamed from: N4 */
    private final void m72202N4() {
        C25660i c25660i;
        AdInterceptTimerView adInterceptTimerView;
        C28146e bind;
        TextView textView;
        if (!this.f55795f0 || m72746V0()) {
            m72305O4(false);
            return;
        }
        long jM72226W3 = ((long) m72226W3()) - this.f55798i0;
        if (jM72226W3 <= 0) {
            m72218T4();
            return;
        }
        C25661j c25661j = this.f55783T;
        if (c25661j != null && (c25660i = c25661j.f77910q) != null && (adInterceptTimerView = c25660i.f77881c) != null && (bind = adInterceptTimerView.getBind()) != null && (textView = bind.f86412d) != null) {
            textView.setText(m72199M3(jM72226W3));
        }
        m72305O4(true);
    }

    /* JADX INFO: renamed from: O3 */
    private final int m72204O3() {
        JsonElement jsonElement;
        Subject subjectM97057m;
        C24715a c24715a = this.f55784U;
        if (!((c24715a == null || (subjectM97057m = c24715a.m97057m()) == null) ? false : Intrinsics.m97797c(subjectM97057m.getIsCam(), Boolean.TRUE))) {
            JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b("StreamVideoInterceptRewarded");
            if (jsonObjectM63626b == null || (jsonElement = jsonObjectM63626b.get("freeTimes")) == null) {
                return 1;
            }
            return jsonElement.getAsInt();
        }
        C27089h.f82174a.m105449a(m72201N3() + " --> getFreeTimesConfig() --> 枪版没有免费费次数");
        return 0;
    }

    /* JADX INFO: renamed from: P3 */
    private final LocalBackAdHelper m72206P3() {
        LocalBackAdHelper localBackAdHelper = this.f55814y0;
        if (localBackAdHelper != null) {
            return localBackAdHelper;
        }
        LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = m72779w0();
        Intrinsics.m97799e(lifecycleCoroutineScopeM72779w0);
        LocalBackAdHelper localBackAdHelper2 = new LocalBackAdHelper("StreamVideoBackInterstitialScene", lifecycleCoroutineScopeM72779w0, new Function0() { // from class: com.transsion.player.longvideo.ui.dialog.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LongVodPlayerViewAdHelper.m72209Q3(this.f55820a);
            }
        }, new Function0() { // from class: com.transsion.player.longvideo.ui.dialog.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LongVodPlayerViewAdHelper.m72211R3(this.f55828a);
            }
        }, true);
        this.f55814y0 = localBackAdHelper2;
        return localBackAdHelper2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public final void m72207P4() {
        LongVodRewardInterceptView longVodRewardInterceptView;
        m72724G1(false);
        this.f55795f0 = false;
        this.f55791b0 = true;
        C25661j c25661j = this.f55783T;
        if (c25661j != null && (longVodRewardInterceptView = c25661j.f77915v) != null) {
            AbstractC26006c.m102054g(longVodRewardInterceptView);
        }
        m72305O4(false);
        m72179E3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q3 */
    public static final Activity m72209Q3(LongVodPlayerViewAdHelper longVodPlayerViewAdHelper) {
        View root;
        C25661j c25661j = longVodPlayerViewAdHelper.f55783T;
        Context context = (c25661j == null || (root = c25661j.getRoot()) == null) ? null : root.getContext();
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity == null || appCompatActivity.isDestroyed() || appCompatActivity.isFinishing()) {
            return null;
        }
        return appCompatActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public static final Unit m72211R3(LongVodPlayerViewAdHelper longVodPlayerViewAdHelper) {
        LongVodPlayerView longVodPlayerView = longVodPlayerViewAdHelper.f55813x0;
        if (longVodPlayerView != null) {
            LongVodPlayerView.backClick$default(longVodPlayerView, false, false, 3, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public final void m72212R4() {
        String str = this.f55801l0;
        if (Intrinsics.m97797c(str, "StreamVideoInterceptRewarded")) {
            m72260k4();
        } else if (Intrinsics.m97797c(str, "StreamVideoInterceptInterstitial")) {
            m72258j4();
        }
    }

    /* JADX INFO: renamed from: S3 */
    private final int m72214S3() {
        return ((Number) this.f55805p0.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public final void m72215S4(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
        View root;
        Context context;
        C25661j c25661j = this.f55783T;
        if (c25661j == null || (root = c25661j.getRoot()) == null || (context = root.getContext()) == null) {
            return;
        }
        this.f55801l0 = "StreamVideoInterceptInterstitial";
        LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = m72779w0();
        if (lifecycleCoroutineScopeM72779w0 != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new LongVodPlayerViewAdHelper$showInterstitialAd$1$1(this, context, biddingIntermediateMaterialBean, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: T3 */
    private final int m72217T3() {
        JsonElement jsonElement;
        JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b("StreamVideoInterceptRewarded");
        if (jsonObjectM63626b == null || (jsonElement = jsonObjectM63626b.get("playedPercent")) == null) {
            return 10;
        }
        return jsonElement.getAsInt();
    }

    /* JADX INFO: renamed from: T4 */
    private final void m72218T4() {
        LongVodRewardInterceptView longVodRewardInterceptView;
        LongVodRewardInterceptView longVodRewardInterceptView2;
        C25658g bind;
        LinearLayout linearLayout;
        LongVodRewardInterceptView longVodRewardInterceptView3;
        C25658g bind2;
        Group group;
        LongVodRewardInterceptView longVodRewardInterceptView4;
        C25658g bind3;
        Group group2;
        BLTextView bLTextView;
        LongVodRewardInterceptView longVodRewardInterceptView5;
        C25658g bind4;
        Group group3;
        LongVodRewardInterceptView longVodRewardInterceptView6;
        C25658g bind5;
        Group group4;
        BLTextView bLTextView2;
        BLTextView bLTextView3;
        Subject subjectM97057m;
        Subject subjectM97057m2;
        LongVodRewardInterceptView longVodRewardInterceptView7;
        if (!this.f55795f0 || this.f55798i0 < m72226W3()) {
            return;
        }
        m72724G1(true);
        Function0 function0 = this.f55802m0;
        if (function0 != null) {
            function0.invoke();
        }
        C25661j c25661j = this.f55783T;
        if (c25661j != null && (longVodRewardInterceptView7 = c25661j.f77915v) != null) {
            AbstractC26006c.m102058k(longVodRewardInterceptView7);
        }
        m72305O4(false);
        m72177D4();
        C25661j c25661j2 = this.f55783T;
        if (c25661j2 != null && (longVodRewardInterceptView = c25661j2.f77915v) != null) {
            C27089h c27089h = C27089h.f82174a;
            String strM72201N3 = m72201N3();
            C24715a c24715a = this.f55784U;
            c27089h.m105449a(strM72201N3 + " --> showRewardInterceptView() --> mBean?.subject?.isCam = " + ((c24715a == null || (subjectM97057m2 = c24715a.m97057m()) == null) ? null : subjectM97057m2.getIsCam()));
            C24715a c24715a2 = this.f55784U;
            if ((c24715a2 == null || (subjectM97057m = c24715a2.m97057m()) == null) ? false : Intrinsics.m97797c(subjectM97057m.getIsCam(), Boolean.FALSE)) {
                if (m72241b4() > 0) {
                    C25658g bind6 = longVodRewardInterceptView.getBind();
                    if (bind6 != null && (bLTextView3 = bind6.f77869h) != null) {
                        bLTextView3.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.dialog.u
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                LongVodPlayerViewAdHelper.m72221U4(this.f55834a, view);
                            }
                        });
                    }
                    m72239a5();
                } else {
                    C25658g bind7 = longVodRewardInterceptView.getBind();
                    if (bind7 != null && (bLTextView = bind7.f77869h) != null) {
                        bLTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.dialog.f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                LongVodPlayerViewAdHelper.m72224V4(this.f55821a, view);
                            }
                        });
                    }
                }
                C25658g bind8 = longVodRewardInterceptView.getBind();
                if (bind8 != null && (bLTextView2 = bind8.f77865d) != null) {
                    bLTextView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.dialog.g
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LongVodPlayerViewAdHelper.m72227W4(this.f55822a, view);
                        }
                    });
                }
                C25661j c25661j3 = this.f55783T;
                if (c25661j3 != null && (longVodRewardInterceptView6 = c25661j3.f77915v) != null && (bind5 = longVodRewardInterceptView6.getBind()) != null && (group4 = bind5.f77863b) != null) {
                    group4.setVisibility(0);
                }
                C25661j c25661j4 = this.f55783T;
                if (c25661j4 != null && (longVodRewardInterceptView5 = c25661j4.f77915v) != null && (bind4 = longVodRewardInterceptView5.getBind()) != null && (group3 = bind4.f77864c) != null) {
                    group3.setVisibility(8);
                }
            } else {
                C25661j c25661j5 = this.f55783T;
                if (c25661j5 != null && (longVodRewardInterceptView4 = c25661j5.f77915v) != null && (bind3 = longVodRewardInterceptView4.getBind()) != null && (group2 = bind3.f77863b) != null) {
                    group2.setVisibility(8);
                }
                C25661j c25661j6 = this.f55783T;
                if (c25661j6 != null && (longVodRewardInterceptView3 = c25661j6.f77915v) != null && (bind2 = longVodRewardInterceptView3.getBind()) != null && (group = bind2.f77864c) != null) {
                    group.setVisibility(0);
                }
                C25661j c25661j7 = this.f55783T;
                if (c25661j7 != null && (longVodRewardInterceptView2 = c25661j7.f77915v) != null && (bind = longVodRewardInterceptView2.getBind()) != null && (linearLayout = bind.f77870i) != null) {
                    linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.dialog.h
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LongVodPlayerViewAdHelper.m72233Y4(this.f55823a, view);
                        }
                    });
                }
            }
        }
        m72185G4("browse", true);
    }

    /* JADX INFO: renamed from: U3 */
    private final int m72220U3() {
        return ((Number) this.f55806q0.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public static final void m72221U4(LongVodPlayerViewAdHelper longVodPlayerViewAdHelper, View view) {
        longVodPlayerViewAdHelper.m72179E3();
        longVodPlayerViewAdHelper.m72212R4();
        longVodPlayerViewAdHelper.m72185G4("click", true);
    }

    /* JADX INFO: renamed from: V3 */
    private final int m72223V3() {
        JsonElement jsonElement;
        JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b("StreamVideoInterceptRewarded");
        return ((jsonObjectM63626b == null || (jsonElement = jsonObjectM63626b.get("interceptDuration")) == null) ? 10 : jsonElement.getAsInt()) * 60000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public static final void m72224V4(LongVodPlayerViewAdHelper longVodPlayerViewAdHelper, View view) {
        longVodPlayerViewAdHelper.m72212R4();
        longVodPlayerViewAdHelper.m72185G4("click", true);
    }

    /* JADX INFO: renamed from: W3 */
    private final int m72226W3() {
        return ((Number) this.f55807r0.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public static final void m72227W4(final LongVodPlayerViewAdHelper longVodPlayerViewAdHelper, View view) {
        longVodPlayerViewAdHelper.m72729L(true, new Function0() { // from class: com.transsion.player.longvideo.ui.dialog.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LongVodPlayerViewAdHelper.m72230X4(this.f55824a);
            }
        });
        longVodPlayerViewAdHelper.m72185G4("click", false);
    }

    /* JADX INFO: renamed from: X3 */
    private final int m72229X3() {
        JsonElement jsonElement;
        JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b("StreamVideoInterceptRewarded");
        return ((jsonObjectM63626b == null || (jsonElement = jsonObjectM63626b.get("interceptProgress")) == null) ? 5 : jsonElement.getAsInt()) * 60000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public static final Unit m72230X4(LongVodPlayerViewAdHelper longVodPlayerViewAdHelper) {
        longVodPlayerViewAdHelper.m72207P4();
        longVodPlayerViewAdHelper.m72176D3();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: Y3 */
    private final int m72232Y3() {
        return ((Number) this.f55804o0.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y4 */
    public static final void m72233Y4(LongVodPlayerViewAdHelper longVodPlayerViewAdHelper, View view) {
        LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = longVodPlayerViewAdHelper.m72779w0();
        if (lifecycleCoroutineScopeM72779w0 != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new LongVodPlayerViewAdHelper$showRewardInterceptView$1$4$1(longVodPlayerViewAdHelper, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: Z3 */
    public final Object m72235Z3(Continuation continuation) throws Throwable {
        LongVodPlayerViewAdHelper$getVideoDetailPlayBean$1 longVodPlayerViewAdHelper$getVideoDetailPlayBean$1;
        LongVodPlayerViewAdHelper longVodPlayerViewAdHelper;
        C24715a c24715a;
        if (continuation instanceof LongVodPlayerViewAdHelper$getVideoDetailPlayBean$1) {
            longVodPlayerViewAdHelper$getVideoDetailPlayBean$1 = (LongVodPlayerViewAdHelper$getVideoDetailPlayBean$1) continuation;
            int i11 = longVodPlayerViewAdHelper$getVideoDetailPlayBean$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                longVodPlayerViewAdHelper$getVideoDetailPlayBean$1.label = i11 - Integer.MIN_VALUE;
            } else {
                longVodPlayerViewAdHelper$getVideoDetailPlayBean$1 = new LongVodPlayerViewAdHelper$getVideoDetailPlayBean$1(this, continuation);
            }
        } else {
            longVodPlayerViewAdHelper$getVideoDetailPlayBean$1 = new LongVodPlayerViewAdHelper$getVideoDetailPlayBean$1(this, continuation);
        }
        Object objMo65003l = longVodPlayerViewAdHelper$getVideoDetailPlayBean$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = longVodPlayerViewAdHelper$getVideoDetailPlayBean$1.label;
        if (i12 == 0) {
            ResultKt.m97107b(objMo65003l);
            VideoDetailPlayBean videoDetailPlayBean = this.f55785V;
            if (videoDetailPlayBean != null) {
                return videoDetailPlayBean;
            }
            C24715a c24715a2 = this.f55784U;
            if (c24715a2 != null) {
                VideoDetailPlayDao videoDetailPlayDaoM72238a4 = m72238a4();
                String strM97059o = c24715a2.m97059o();
                int iM97056l = c24715a2.m97056l();
                int iM97049e = c24715a2.m97049e();
                longVodPlayerViewAdHelper$getVideoDetailPlayBean$1.L$0 = this;
                longVodPlayerViewAdHelper$getVideoDetailPlayBean$1.label = 1;
                objMo65003l = videoDetailPlayDaoM72238a4.mo65003l(strM97059o, iM97056l, iM97049e, longVodPlayerViewAdHelper$getVideoDetailPlayBean$1);
                if (objMo65003l == objF) {
                    return objF;
                }
                longVodPlayerViewAdHelper = this;
            }
            if (this.f55785V == null && (c24715a = this.f55784U) != null) {
                this.f55785V = new VideoDetailPlayBean(c24715a.m97059o(), "", c24715a.m97049e(), c24715a.m97056l(), 0L, null, null, null, null, 0L, null, null, null, null, null, false, null, null, null, 0L, null, null, null, false, false, false, null, 134217712, null);
            }
            return this.f55785V;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        longVodPlayerViewAdHelper = (LongVodPlayerViewAdHelper) longVodPlayerViewAdHelper$getVideoDetailPlayBean$1.L$0;
        ResultKt.m97107b(objMo65003l);
        longVodPlayerViewAdHelper.f55785V = (VideoDetailPlayBean) objMo65003l;
        if (this.f55785V == null) {
            this.f55785V = new VideoDetailPlayBean(c24715a.m97059o(), "", c24715a.m97049e(), c24715a.m97056l(), 0L, null, null, null, null, 0L, null, null, null, null, null, false, null, null, null, 0L, null, null, null, false, false, false, null, 134217712, null);
        }
        return this.f55785V;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public final void m72236Z4(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
        View root;
        Context context;
        C25661j c25661j = this.f55783T;
        if (c25661j == null || (root = c25661j.getRoot()) == null || (context = root.getContext()) == null) {
            return;
        }
        this.f55801l0 = "StreamVideoInterceptRewarded";
        LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = m72779w0();
        if (lifecycleCoroutineScopeM72779w0 != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new LongVodPlayerViewAdHelper$showRewardedAd$1$1(this, context, biddingIntermediateMaterialBean, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public final VideoDetailPlayDao m72238a4() {
        return (VideoDetailPlayDao) this.f55788Y.getValue();
    }

    /* JADX INFO: renamed from: a5 */
    private final void m72239a5() {
        InterfaceC25204t1 interfaceC25204t1 = this.f55810u0;
        if (interfaceC25204t1 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
        }
        this.f55811v0 = m72241b4();
        m72242b5();
        LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = m72779w0();
        this.f55810u0 = lifecycleCoroutineScopeM72779w0 != null ? AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new LongVodPlayerViewAdHelper$startWatchAdCountdown$1(this, null), 3, null) : null;
    }

    /* JADX INFO: renamed from: b4 */
    private final int m72241b4() {
        return ((Number) this.f55809t0.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b5 */
    public final void m72242b5() {
        LongVodRewardInterceptView longVodRewardInterceptView;
        C25658g bind;
        BLTextView bLTextView;
        View root;
        Context context;
        C25661j c25661j = this.f55783T;
        if (c25661j == null || (longVodRewardInterceptView = c25661j.f77915v) == null || (bind = longVodRewardInterceptView.getBind()) == null || (bLTextView = bind.f77869h) == null) {
            return;
        }
        C25661j c25661j2 = this.f55783T;
        bLTextView.setText((c25661j2 == null || (root = c25661j2.getRoot()) == null || (context = root.getContext()) == null) ? null : context.getString(R$string.long_vod_reward_intercept_watch_ad_countdown, Integer.valueOf(this.f55811v0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c5 */
    public final void m72244c5() {
        LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = m72779w0();
        if (lifecycleCoroutineScopeM72779w0 != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new LongVodPlayerViewAdHelper$updateRewardState$1(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public static final VideoDetailPlayDao m72246d5() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64865B1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public final void m72248e4(C24715a c24715a) {
        LongVodRewardInterceptView longVodRewardInterceptView;
        m72724G1(false);
        this.f55796g0 = false;
        C25661j c25661j = this.f55783T;
        if (c25661j != null && (longVodRewardInterceptView = c25661j.f77915v) != null) {
            AbstractC26006c.m102054g(longVodRewardInterceptView);
        }
        if (m72254h4()) {
            this.f55795f0 = false;
            return;
        }
        if (C5118o.f17608a.m23947g() || C5110g.f17601a.m23911b()) {
            this.f55795f0 = false;
            return;
        }
        this.f55797h0 = c24715a.m97055k();
        this.f55798i0 = c24715a.m97055k();
        VideoDetailPlayBean videoDetailPlayBean = this.f55785V;
        this.f55791b0 = videoDetailPlayBean != null ? videoDetailPlayBean.getRewardUnlock() : false;
        VideoDetailPlayBean videoDetailPlayBean2 = this.f55785V;
        this.f55792c0 = videoDetailPlayBean2 != null ? videoDetailPlayBean2.getRewardPlayed() : false;
        VideoDetailPlayBean videoDetailPlayBean3 = this.f55785V;
        this.f55793d0 = videoDetailPlayBean3 != null ? videoDetailPlayBean3.getRewardFree() : false;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "VideoAdHelper", "---> initRewardInterceptVariables --> startPlayProgress:" + this.f55797h0 + "，isRewardUnlock:" + this.f55791b0 + ", rewardUnlockFreeTimes:" + m72232Y3(), false, 4, null);
        C14496b c14496b = C14496b.f50966a;
        MMKV mmkvM65344b = c14496b.m65344b();
        String str = this.f55782S;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("zero_clock_timestamp_");
        sb2.append(str);
        long j11 = mmkvM65344b.getLong(sb2.toString(), 0L);
        if (m72750Y0(this.f55782S, false)) {
            this.f55800k0 = 0;
            boolean z11 = m72232Y3() == 0 && !this.f55791b0;
            this.f55795f0 = z11;
            this.f55792c0 = z11;
            this.f55793d0 = !z11;
            C26866a.a.m104898f(aVar, "VideoAdHelper", "---> FreeTimes Reset", false, 4, null);
            c14496b.m65344b().putInt("video_played_count_per_day", 0);
        } else {
            int i11 = c14496b.m65344b().getInt("video_played_count_per_day", 0);
            this.f55800k0 = i11;
            if (i11 >= m72232Y3()) {
                this.f55795f0 = !this.f55791b0;
            }
            VideoDetailPlayBean videoDetailPlayBean4 = this.f55785V;
            if (Math.abs(C8113l0.m37947c(videoDetailPlayBean4 != null ? videoDetailPlayBean4.getTimeStamp() : 0L) - j11) >= 86400000) {
                boolean z12 = this.f55795f0;
                this.f55792c0 = z12;
                this.f55793d0 = !z12;
            } else if (this.f55793d0) {
                this.f55795f0 = false;
            }
            C26866a.a.m104898f(aVar, "VideoAdHelper", "---> videoPlayedTimesPerDay:" + this.f55800k0 + ", isRewardPlayed:" + this.f55792c0 + ", isRewardFree:" + this.f55793d0, false, 4, null);
        }
        VideoDetailPlayBean videoDetailPlayBean5 = this.f55785V;
        if (videoDetailPlayBean5 == null || videoDetailPlayBean5.getRewardFree() != this.f55793d0) {
            m72244c5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e5 */
    public static final int m72249e5() {
        JsonElement jsonElement;
        JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b("StreamVideoInterceptRewarded");
        if (jsonObjectM63626b == null || (jsonElement = jsonObjectM63626b.get("countdown")) == null) {
            return 5;
        }
        return jsonElement.getAsInt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public final void m72251f4() {
        View root;
        Context context;
        m72284u4();
        m72194K3();
        C28951b.a aVar = C28951b.f88586a;
        C25661j c25661j = this.f55783T;
        aVar.m111455e((c25661j == null || (root = c25661j.getRoot()) == null || (context = root.getContext()) == null) ? null : context.getString(R$string.long_vod_reward_intercept_skip));
    }

    /* JADX INFO: renamed from: h4 */
    private final boolean m72254h4() {
        return ((Boolean) this.f55808s0.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4 */
    public static final boolean m72256i4(LongVodPlayerViewAdHelper longVodPlayerViewAdHelper) {
        return longVodPlayerViewAdHelper.m72731M0("StreamVideoInterceptRewarded").length() > 0 || longVodPlayerViewAdHelper.m72314g4(BaseVideoAdHelper.f56086R.m72784a(), longVodPlayerViewAdHelper.m72762j0());
    }

    /* JADX INFO: renamed from: j4 */
    private final void m72258j4() {
        View root;
        Context context;
        C25661j c25661j = this.f55783T;
        if (c25661j == null || (root = c25661j.getRoot()) == null || (context = root.getContext()) == null) {
            return;
        }
        this.f55801l0 = "StreamVideoInterceptInterstitial";
        BiddingInterstitialManager biddingInterstitialManager = this.f55790a0;
        if (biddingInterstitialManager != null) {
            biddingInterstitialManager.mo62775U();
        }
        this.f55790a0 = null;
        LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = m72779w0();
        if (lifecycleCoroutineScopeM72779w0 != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new LongVodPlayerViewAdHelper$loadInterstitialAd$1(context, this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private final void m72260k4() {
        C25661j c25661j;
        View root;
        Context context;
        if (m72254h4() || (c25661j = this.f55783T) == null || (root = c25661j.getRoot()) == null || (context = root.getContext()) == null) {
            return;
        }
        this.f55801l0 = "StreamVideoInterceptRewarded";
        BiddingVideoManager biddingVideoManager = this.f55789Z;
        if (biddingVideoManager != null) {
            biddingVideoManager.mo62775U();
        }
        this.f55789Z = null;
        LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = m72779w0();
        if (lifecycleCoroutineScopeM72779w0 != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new LongVodPlayerViewAdHelper$loadRewardedAd$1(context, this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public static final Unit m72263m4(LongVodPlayerViewAdHelper longVodPlayerViewAdHelper) {
        LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = longVodPlayerViewAdHelper.m72779w0();
        if (lifecycleCoroutineScopeM72779w0 != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new LongVodPlayerViewAdHelper$onCompletion$1$1(longVodPlayerViewAdHelper, null), 3, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public final void m72266o4() {
        mo72300H(false);
        LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = m72779w0();
        if (lifecycleCoroutineScopeM72779w0 != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new LongVodPlayerViewAdHelper$onRewardInterceptAdClose$1(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public final void m72269p4() {
        LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = m72779w0();
        if (lifecycleCoroutineScopeM72779w0 != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new LongVodPlayerViewAdHelper$onRewardInterceptAdError$1(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public final void m72272q4(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
        LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = m72779w0();
        if (lifecycleCoroutineScopeM72779w0 != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new LongVodPlayerViewAdHelper$onRewardInterceptAdLoad$1(this, biddingIntermediateMaterialBean, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public final void m72275r4() {
        LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = m72779w0();
        if (lifecycleCoroutineScopeM72779w0 != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new LongVodPlayerViewAdHelper$onRewardInterceptAdRewarded$1(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public final void m72278s4() {
        LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = m72779w0();
        if (lifecycleCoroutineScopeM72779w0 != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new LongVodPlayerViewAdHelper$onRewardInterceptAdShow$1(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public final void m72281t4() {
        LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = m72779w0();
        if (lifecycleCoroutineScopeM72779w0 != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new LongVodPlayerViewAdHelper$onRewardInterceptAdShowError$1(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public final void m72284u4() {
        m72207P4();
        m72244c5();
        mo72300H(false);
        m72176D3();
    }

    /* JADX INFO: renamed from: z4 */
    private final void m72295z4() {
        InterfaceC25204t1 interfaceC25204t1 = this.f55810u0;
        if (interfaceC25204t1 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
        }
        this.f55810u0 = null;
    }

    /* JADX INFO: renamed from: B4 */
    public final void m72296B4() {
        if (this.f55787X != LongVodPageType.STREAM) {
            return;
        }
        m72206P3().m73161q(m72762j0());
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: C0 */
    protected ViewGroup mo72297C0() {
        return null;
    }

    /* JADX INFO: renamed from: C3 */
    public final void m72298C3(long j11) {
        this.f55798i0 = j11;
        if (m72254h4()) {
            return;
        }
        m72202N4();
        if (m72746V0() || this.f55795f0 || this.f55792c0 || Math.abs(j11 - this.f55797h0) < this.f55799j0) {
            return;
        }
        this.f55792c0 = true;
        this.f55800k0++;
        C14496b.f50966a.m65344b().putInt("video_played_count_per_day", this.f55800k0);
        C26866a.a.m104898f(C26866a.f81698a, "VideoAdHelper", "--> calculatePlayedTimes --> videoPlayedTimesPerDay:" + this.f55800k0, false, 4, null);
        m72244c5();
    }

    /* JADX INFO: renamed from: F3 */
    public final void m72299F3(Function0 callback, Function0 interceptCallback, Function1 unlockCallback) {
        C25660i c25660i;
        AdInterceptTimerView adInterceptTimerView;
        C28146e bind;
        TextView textView;
        Intrinsics.m97802h(callback, "callback");
        Intrinsics.m97802h(interceptCallback, "interceptCallback");
        Intrinsics.m97802h(unlockCallback, "unlockCallback");
        if (m72254h4()) {
            callback.invoke();
            return;
        }
        this.f55802m0 = interceptCallback;
        this.f55803n0 = unlockCallback;
        this.f55799j0 = (long) ((m72717D0() * ((long) m72214S3())) / 100.0f);
        boolean z11 = m72717D0() >= ((long) m72220U3());
        this.f55795f0 = this.f55795f0 && z11;
        C26866a.a.m104898f(C26866a.f81698a, "VideoAdHelper", "---> checkShowRewardIntercept --> totalDuration:" + m72717D0() + ", playedThreshold:" + this.f55799j0 + ", isTotalDurationFit:" + z11 + ", rewardInterceptProgress:" + m72226W3() + ", isRewardInterceptEnable:" + this.f55795f0, false, 4, null);
        if (this.f55791b0 || m72717D0() < m72220U3()) {
            m72728K1(System.currentTimeMillis());
            this.f55796g0 = true;
            callback.invoke();
            return;
        }
        if (this.f55797h0 >= m72226W3() && this.f55795f0) {
            this.f55794e0 = true;
            m72218T4();
            return;
        }
        this.f55794e0 = false;
        m72202N4();
        m72182F4("browse");
        C25661j c25661j = this.f55783T;
        if (c25661j != null && (c25660i = c25661j.f77910q) != null && (adInterceptTimerView = c25660i.f77881c) != null && (bind = adInterceptTimerView.getBind()) != null && (textView = bind.f86414f) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.dialog.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LongVodPlayerViewAdHelper.m72184G3(this.f55826a, view);
                }
            });
        }
        this.f55796g0 = true;
        callback.invoke();
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: H */
    public void mo72300H(boolean z11) {
        super.mo72300H(z11);
        if (m72733N0()) {
            m72305O4(false);
        } else {
            m72305O4(this.f55796g0);
        }
    }

    /* JADX INFO: renamed from: I3 */
    public final void m72301I3() {
        BiddingNativeManager biddingNativeManagerM72775u0 = m72775u0();
        if (biddingNativeManagerM72775u0 != null) {
            biddingNativeManagerM72775u0.mo62775U();
        }
        this.f55783T = null;
        BiddingInterstitialManager biddingInterstitialManagerM72777v0 = m72777v0();
        if (biddingInterstitialManagerM72777v0 != null) {
            biddingInterstitialManagerM72777v0.mo62775U();
        }
        m72783z1(null);
        BiddingVideoManager biddingVideoManager = this.f55789Z;
        if (biddingVideoManager != null) {
            biddingVideoManager.mo62775U();
        }
        this.f55789Z = null;
        BiddingInterstitialManager biddingInterstitialManager = this.f55790a0;
        if (biddingInterstitialManager != null) {
            biddingInterstitialManager.mo62775U();
        }
        this.f55790a0 = null;
        m72739Q();
        CountDownTimer countDownTimerM72756d0 = m72756d0();
        if (countDownTimerM72756d0 != null) {
            countDownTimerM72756d0.cancel();
        }
        m72769o1(null);
        m72179E3();
        m72302J3();
    }

    /* JADX INFO: renamed from: J3 */
    public final void m72302J3() {
        LocalBackAdHelper localBackAdHelper = this.f55814y0;
        if (localBackAdHelper != null) {
            localBackAdHelper.m73160o();
        }
        this.f55814y0 = null;
    }

    /* JADX INFO: renamed from: L4 */
    public final void m72303L4(LongVodContentType contextType, C24715a bean) {
        Intrinsics.m97802h(contextType, "contextType");
        Intrinsics.m97802h(bean, "bean");
        LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = m72779w0();
        if (lifecycleCoroutineScopeM72779w0 != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new LongVodPlayerViewAdHelper$setLongVdPlayerBean$1(this, bean, contextType, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: M4 */
    public final void m72304M4(LongVodPlayerView view) {
        Intrinsics.m97802h(view, "view");
        this.f55813x0 = view;
    }

    /* JADX INFO: renamed from: O4 */
    public final void m72305O4(boolean z11) {
        C25660i c25660i;
        AdInterceptTimerView adInterceptTimerView;
        AdInterceptTimerView adInterceptTimerViewMo72311e0;
        C25660i c25660i2;
        AdInterceptTimerView adInterceptTimerView2;
        if (z11 && this.f55795f0 && !m72746V0() && (adInterceptTimerViewMo72311e0 = mo72311e0()) != null && adInterceptTimerViewMo72311e0.getVisibility() == 8) {
            C25661j c25661j = this.f55783T;
            if (c25661j == null || (c25660i2 = c25661j.f77910q) == null || (adInterceptTimerView2 = c25660i2.f77881c) == null) {
                return;
            }
            AbstractC26006c.m102058k(adInterceptTimerView2);
            return;
        }
        C25661j c25661j2 = this.f55783T;
        if (c25661j2 == null || (c25660i = c25661j2.f77910q) == null || (adInterceptTimerView = c25660i.f77881c) == null) {
            return;
        }
        AbstractC26006c.m102054g(adInterceptTimerView);
    }

    /* JADX INFO: renamed from: Q4 */
    public final boolean m72306Q4() {
        if (this.f55787X != LongVodPageType.STREAM) {
            return false;
        }
        int iM63593k = C14047a.f49716a.m63593k("StreamVideoBackInterstitialScene");
        if (System.currentTimeMillis() - C14496b.f50966a.m65344b().getLong("show_StreamVideoBackInterstitialScene_timestamp", 0L) < ((long) (iM63593k * 60)) * 1000) {
            C25639b.m100912d(C25639b.f77786a, "StreamVideoBackInterstitialScene", false, 2, null);
            return false;
        }
        m72206P3().m73162r(m72762j0());
        return true;
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: V */
    protected NativeWrapperAdView mo72307V() {
        C25661j c25661j = this.f55783T;
        if (c25661j != null) {
            return c25661j.f77896c;
        }
        return null;
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: W */
    protected AdCountDownView mo72308W() {
        C25661j c25661j = this.f55783T;
        if (c25661j != null) {
            return c25661j.f77897d;
        }
        return null;
    }

    /* JADX INFO: renamed from: c4 */
    public final void m72309c4(boolean z11) {
        m72720E1(m72781x0() + ((System.currentTimeMillis() - m72715B0()) / ((long) 1000)));
        m72728K1(System.currentTimeMillis());
        if (z11) {
            m72718D1(true);
            if (!C5118o.f17608a.m23947g() && !C5110g.f17601a.m23911b()) {
                m72747V1();
            }
            m72305O4(false);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final void m72310d4(String str, LongVodPageType longVodPageType, C25661j viewBinding, String str2, Function1 adShowCallback) {
        Intrinsics.m97802h(viewBinding, "viewBinding");
        Intrinsics.m97802h(adShowCallback, "adShowCallback");
        this.f55786W = str;
        this.f55787X = longVodPageType;
        this.f55783T = viewBinding;
        m72721F0(viewBinding, str2, adShowCallback);
        BiddingIconAdManager.f49464s.m63075a("DownloadMovieAppDistributionScene", C14058c.f49742a.m63681a(str2));
        m72296B4();
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: e0 */
    protected AdInterceptTimerView mo72311e0() {
        C25661j c25661j = this.f55783T;
        if (c25661j != null) {
            return c25661j.f77899f;
        }
        return null;
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: f0 */
    protected NativeWrapperAdView mo72312f0() {
        C25661j c25661j = this.f55783T;
        if (c25661j != null) {
            return c25661j.f77900g;
        }
        return null;
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: g0 */
    protected ViewGroup mo72313g0() {
        C25661j c25661j = this.f55783T;
        if (c25661j != null) {
            return c25661j.f77901h;
        }
        return null;
    }

    /* JADX INFO: renamed from: g4 */
    public final boolean m72314g4(String str, String str2) {
        boolean z11 = false;
        if (str != null && !StringsKt.m98160q0(str) && str2 != null && !StringsKt.m98160q0(str2)) {
            List listS0 = StringsKt.m98117S0(str, new String[]{","}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(listS0, 10));
            Iterator it = listS0.iterator();
            while (it.hasNext()) {
                arrayList.add(StringsKt.m98155n1((String) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            Set setW0 = CollectionsKt.m97345W0(arrayList2);
            if (setW0.isEmpty()) {
                return false;
            }
            List listS1 = StringsKt.m98117S0(str2, new String[]{","}, false, 0, 6, null);
            ArrayList arrayList3 = new ArrayList(CollectionsKt.m97516v(listS1, 10));
            Iterator it2 = listS1.iterator();
            while (it2.hasNext()) {
                arrayList3.add(StringsKt.m98155n1((String) it2.next()).toString());
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                if (((String) obj2).length() > 0) {
                    arrayList4.add(obj2);
                }
            }
            if (!arrayList4.isEmpty()) {
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    if (setW0.contains((String) it3.next())) {
                        z11 = true;
                        break;
                    }
                }
            }
            C26866a.a.m104898f(C26866a.f81698a, "VideoAdHelper", m72201N3() + " --> isCtxMatch: " + z11 + " ---> configStr: " + str + "， targetStr: " + str2, false, 4, null);
        }
        return z11;
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: h0 */
    protected ViewGroup mo72315h0() {
        C25661j c25661j = this.f55783T;
        if (c25661j != null) {
            return c25661j.f77902i;
        }
        return null;
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: k0 */
    protected View mo72316k0() {
        return null;
    }

    /* JADX INFO: renamed from: l4 */
    public final void m72317l4(Function0 callback) {
        Intrinsics.m97802h(callback, "callback");
        m72720E1(0L);
        m72728K1(0L);
        m72763k1(callback);
        m72741R();
        m72759f2(new Function0() { // from class: com.transsion.player.longvideo.ui.dialog.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LongVodPlayerViewAdHelper.m72263m4(this.f55825a);
            }
        });
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: n2 */
    public void mo72318n2() {
        LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = m72779w0();
        if (lifecycleCoroutineScopeM72779w0 != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new LongVodPlayerViewAdHelper$updateAdStartLastShowTime$1(this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: n4 */
    public final void m72319n4() {
        m72763k1(null);
        m72737P();
        m72722F1(0);
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: t0 */
    protected ImageView mo72320t0() {
        C25661j c25661j = this.f55783T;
        if (c25661j != null) {
            return c25661j.f77907n;
        }
        return null;
    }

    /* JADX INFO: renamed from: v4 */
    public final void m72321v4(LongVodUiType curUiType) {
        ORLongVodPlayerView oRLongVodPlayerView;
        C25661j c25661j;
        ORLongVodPlayerView oRLongVodPlayerView2;
        Intrinsics.m97802h(curUiType, "curUiType");
        m72716B1(curUiType == LongVodUiType.LAND);
        m72758f1();
        if (m72740Q0()) {
            return;
        }
        m72735O();
        C25661j c25661j2 = this.f55783T;
        if (c25661j2 != null && (oRLongVodPlayerView = c25661j2.f77914u) != null && !oRLongVodPlayerView.isPlaying() && (c25661j = this.f55783T) != null && (oRLongVodPlayerView2 = c25661j.f77914u) != null && !oRLongVodPlayerView2.isComplete() && m72745U0()) {
            m72747V1();
        }
        if (m72738P0()) {
            m72748W0();
            m72766m1(false);
        }
    }

    /* JADX INFO: renamed from: w4 */
    public final void m72322w4() {
        m72728K1(System.currentTimeMillis());
        m72202N4();
        m72718D1(false);
        m72735O();
    }

    /* JADX INFO: renamed from: x4 */
    public final void m72323x4() {
        m72739Q();
        m72741R();
        m72305O4(false);
        m72295z4();
    }

    /* JADX INFO: renamed from: y4 */
    public final void m72324y4() {
        ORLongVodPlayerView oRLongVodPlayerView;
        ORLongVodPlayerView oRLongVodPlayerView2;
        if (m72738P0()) {
            m72725I(m72753b0());
        }
        C26866a.a aVar = C26866a.f81698a;
        C25661j c25661j = this.f55783T;
        C26866a.a.m104898f(aVar, "VideoAdHelper", "onViewResume --> isPlaying:" + ((c25661j == null || (oRLongVodPlayerView2 = c25661j.f77914u) == null) ? null : Boolean.valueOf(oRLongVodPlayerView2.isPlaying())), false, 4, null);
        C25661j c25661j2 = this.f55783T;
        m72305O4(!((c25661j2 == null || (oRLongVodPlayerView = c25661j2.f77914u) == null) ? false : oRLongVodPlayerView.isPlaying()));
        m72188H4();
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: z0 */
    protected ImageView mo72325z0() {
        C25661j c25661j = this.f55783T;
        if (c25661j != null) {
            return c25661j.f77916w;
        }
        return null;
    }
}
