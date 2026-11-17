package com.transsion.shorttv_pugc.base.activity;

import android.app.Activity;
import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.core.app.NotificationCompat;
import androidx.p1004lifecycle.AbstractC3226v;
import com.gyf.immersionbar.ImmersionBar;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.shorttv.R$color;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv_pugc.base.locale.C19239d;
import com.transsion.shorttv_pugc.base.widget.AbstractC19262j;
import com.transsion.shorttv_pugc.base.widget.NoNetworkBigView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import ht.AbstractC23896b;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import p429g4.InterfaceC23498a;
import p550kj.C24655b;
import p623nt.InterfaceC26103d;
import p743rh.C27287m;
import p920xt.InterfaceC28662g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0006J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\u0006J\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010\u0006J\u001f\u0010*\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0017H\u0016¢\u0006\u0004\b,\u0010 J\u000f\u0010-\u001a\u00020\u0017H\u0016¢\u0006\u0004\b-\u0010 J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0017H\u0016¢\u0006\u0004\b1\u0010 J\u000f\u00102\u001a\u00020\u0017H\u0016¢\u0006\u0004\b2\u0010 J\u000f\u00103\u001a\u00020\u0017H\u0016¢\u0006\u0004\b3\u0010 J\u000f\u00104\u001a\u00020\u0017H\u0016¢\u0006\u0004\b4\u0010 J\u000f\u00105\u001a\u00020\u0007H\u0016¢\u0006\u0004\b5\u0010\u0006J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u0007¢\u0006\u0004\b9\u0010\u0006J\r\u0010:\u001a\u00020\u0007¢\u0006\u0004\b:\u0010\u0006J\u000f\u0010<\u001a\u00020;H&¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0007H&¢\u0006\u0004\b>\u0010\u0006J\u000f\u0010?\u001a\u00020\u0007H&¢\u0006\u0004\b?\u0010\u0006J\u000f\u0010@\u001a\u00020\u0007H&¢\u0006\u0004\b@\u0010\u0006J\u000f\u0010A\u001a\u00020\u0007H&¢\u0006\u0004\bA\u0010\u0006J\u000f\u0010B\u001a\u00020\u0007H&¢\u0006\u0004\bB\u0010\u0006R$\u0010J\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010N\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010E\u001a\u0004\bL\u0010G\"\u0004\bM\u0010IR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010UR\u001d\u0010^\u001a\u0004\u0018\u00010Y8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]¨\u0006_"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/base/activity/BaseNewActivity;", "Lg4/a;", "T", "Lcom/transsion/shorttv_pugc/base/activity/BaseMusicFloatActivity;", "Lnt/d;", "<init>", "()V", "", "setStatusBar", "Landroid/content/Context;", "newBase", "attachBaseContext", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "onStop", "onDestroy", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "setView", "Lcom/gyf/immersionbar/ImmersionBar;", "with", "k0", "(Lcom/gyf/immersionbar/ImmersionBar;)V", "setImmersionStatusBar", "()Z", "Landroid/app/Activity;", "context", "Z", "(Landroid/app/Activity;)V", "onDisconnected", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onConnected", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "d0", "isChangeStatusBar", "", "statusColor", "()I", "isStatusDark", "isTranslucent", "e0", "isAttach", "g0", "Landroid/view/View;", "W", "()Landroid/view/View;", "i0", "j0", "", "V", "()Ljava/lang/String;", "b0", "c0", "a0", "f0", "retryLoadData", "Landroid/widget/FrameLayout;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroid/widget/FrameLayout;", "getLlRootView", "()Landroid/widget/FrameLayout;", "setLlRootView", "(Landroid/widget/FrameLayout;)V", "llRootView", "e", "getFlStateView", "setFlStateView", "flStateView", "Landroid/widget/ProgressBar;", "f", "Landroid/widget/ProgressBar;", "progressBar", "", "g", "F", "downY", "h", "moveY", "Lkj/b;", "i", "Lkotlin/Lazy;", "getLogViewConfig", "()Lkj/b;", "logViewConfig", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public abstract class BaseNewActivity<T extends InterfaceC23498a> extends BaseMusicFloatActivity<T> implements InterfaceC26103d {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private FrameLayout llRootView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private FrameLayout flStateView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private ProgressBar progressBar;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float downY;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float moveY;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Lazy logViewConfig = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.base.activity.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseNewActivity.m80433h0(this.f61688a);
        }
    });

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.activity.BaseNewActivity$onConnected$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.shorttv_pugc.base.activity.BaseNewActivity$onConnected$1", m97637f = "BaseNewActivity.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C192171 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BaseNewActivity<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C192171(BaseNewActivity<T> baseNewActivity, Continuation<? super C192171> continuation) {
            super(2, continuation);
            this.this$0 = baseNewActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C192171(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C192171) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            this.this$0.m80445j0();
            BaseNewActivity<T> baseNewActivity = this.this$0;
            try {
                Result.Companion companion = Result.INSTANCE;
                baseNewActivity.retryLoadData();
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final Unit m80431X(BaseNewActivity baseNewActivity) {
        baseNewActivity.retryLoadData();
        AbstractC19262j.m80650b(baseNewActivity.getPageName());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final Unit m80432Y(BaseNewActivity baseNewActivity) {
        AbstractC19262j.m80651c(baseNewActivity.getPageName());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C24655b m80433h0(BaseNewActivity baseNewActivity) {
        return baseNewActivity.newLogViewConfig();
    }

    private final void setStatusBar() {
        if (setImmersionStatusBar()) {
            ImmersionBar immersionBarWith = ImmersionBar.with(this);
            if (isChangeStatusBar()) {
                immersionBarWith.statusBarColor(statusColor());
            }
            if (isTranslucent()) {
                immersionBarWith.statusBarAlpha(0.0f);
            } else {
                immersionBarWith.statusBarAlpha(1.0f);
            }
            if (isStatusDark()) {
                immersionBarWith.statusBarDarkFont(true);
            } else {
                immersionBarWith.statusBarDarkFont(false);
            }
            immersionBarWith.fitsSystemWindows(m80441e0());
            Intrinsics.m97799e(immersionBarWith);
            m80446k0(immersionBarWith);
            immersionBarWith.init();
        }
    }

    /* JADX INFO: renamed from: V */
    public abstract String mo80434V();

    /* JADX INFO: renamed from: W */
    public View m80435W() {
        NoNetworkBigView noNetworkBigView = new NoNetworkBigView(this);
        noNetworkBigView.showTitle(true, mo80434V());
        noNetworkBigView.retry(new Function0() { // from class: com.transsion.shorttv_pugc.base.activity.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseNewActivity.m80431X(this.f61689a);
            }
        });
        noNetworkBigView.goToSetting(new Function0() { // from class: com.transsion.shorttv_pugc.base.activity.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseNewActivity.m80432Y(this.f61690a);
            }
        });
        AbstractC19262j.m80649a(getPageName());
        return noNetworkBigView;
    }

    /* JADX INFO: renamed from: Z */
    public void m80436Z(Activity context) {
        try {
            Result.Companion companion = Result.INSTANCE;
            Object systemService = context != null ? context.getSystemService("input_method") : null;
            Intrinsics.m97800f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            Result.m112707constructorimpl(Boolean.valueOf(((InputMethodManager) systemService).hideSoftInputFromWindow(context.getWindow().getDecorView().getWindowToken(), 0)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public abstract void mo80437a0();

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context newBase) {
        if (newBase == null) {
            super.attachBaseContext(newBase);
        } else {
            C19239d.b bVar = C19239d.f61730f;
            super.attachBaseContext(bVar.m80553i(newBase, bVar.m80552e().m80541h()));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public abstract void mo80438b0();

    /* JADX INFO: renamed from: c0 */
    public abstract void mo80439c0();

    /* JADX INFO: renamed from: d0 */
    public boolean m80440d0() {
        return true;
    }

    @Override // com.transsion.shorttv_pugc.base.activity.BaseMusicFloatActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent event) {
        Integer numValueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.downY = event.getRawY();
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            float rawY = event.getRawY();
            this.moveY = rawY;
            if (Math.abs(rawY - this.downY) > 50.0f) {
                InterfaceC28662g interfaceC28662gM80427P = m80427P();
                if (interfaceC28662gM80427P != null) {
                    interfaceC28662gM80427P.mo73811b();
                }
                m80436Z(this);
            }
        }
        return super.dispatchTouchEvent(event);
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m80441e0() {
        return true;
    }

    /* JADX INFO: renamed from: f0 */
    public abstract void mo80442f0();

    /* JADX INFO: renamed from: g0 */
    public void mo80443g0() {
    }

    @Override // p623nt.InterfaceC26103d
    public C24655b getLogViewConfig() {
        return (C24655b) this.logViewConfig.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m80444i0() {
        FrameLayout frameLayout = this.flStateView;
        if (frameLayout != null) {
            AbstractC23896b.m94639a(frameLayout);
        }
    }

    public boolean isAttach() {
        return true;
    }

    public boolean isChangeStatusBar() {
        return false;
    }

    public boolean isStatusDark() {
        return true;
    }

    public boolean isTranslucent() {
        return false;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m80445j0() {
        FrameLayout frameLayout = this.flStateView;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m80446k0(ImmersionBar with) {
        Intrinsics.m97802h(with, "with");
    }

    public C24655b newLogViewConfig() {
        return InterfaceC26103d.a.m102237a(this);
    }

    @Override // com.transsion.shorttv_pugc.base.activity.BaseCommonActivity, p743rh.InterfaceC27288n
    public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.m97802h(network, "network");
        Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
        super.onConnected(network, networkCapabilities);
        AbstractC3226v.m14968a(this).m14841b(new C192171(this, null));
    }

    @Override // com.transsion.shorttv_pugc.base.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStatusBar();
        mo80438b0();
        mo80439c0();
        mo80437a0();
        if (C27287m.f83003a.m106330e()) {
            mo80442f0();
        }
        mo80443g0();
    }

    @Override // com.transsion.shorttv_pugc.base.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override // com.transsion.shorttv_pugc.base.activity.BaseCommonActivity, p743rh.InterfaceC27288n
    public void onDisconnected() {
        super.onDisconnected();
    }

    @Override // com.transsion.shorttv_pugc.base.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        InterfaceC26103d.a.m102238b(this);
    }

    @Override // com.transsion.shorttv_pugc.base.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        InterfaceC28662g interfaceC28662gM80427P;
        super.onResume();
        InterfaceC26103d.a.m102239c(this);
        if (!isAttach() || (interfaceC28662gM80427P = m80427P()) == null) {
            return;
        }
        interfaceC28662gM80427P.mo73810a(new WeakReference(this));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        InterfaceC28662g interfaceC28662gM80427P;
        super.onStop();
        if (!isAttach() || (interfaceC28662gM80427P = m80427P()) == null) {
            return;
        }
        interfaceC28662gM80427P.mo73814e(new WeakReference(this));
    }

    public abstract void retryLoadData();

    public boolean setImmersionStatusBar() {
        return true;
    }

    @Override // com.transsion.shorttv_pugc.base.activity.BaseCommonActivity
    protected void setView() {
        setContentView(R$layout.short_tv_default_base_layout);
        this.llRootView = (FrameLayout) findViewById(R$id.llRootView);
        FrameLayout frameLayout = (FrameLayout) findViewById(R$id.flContent);
        if (frameLayout != null) {
            frameLayout.addView(getMViewBinding().getRoot());
        }
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R$id.flStateView);
        if (frameLayout2 == null) {
            frameLayout2 = null;
        } else if (m80440d0() && !C27287m.f83003a.m106330e()) {
            frameLayout2.setVisibility(0);
            frameLayout2.addView(m80435W());
        }
        this.flStateView = frameLayout2;
        this.progressBar = (ProgressBar) findViewById(R$id.progressBar);
    }

    public int statusColor() {
        return R$color.image_skeleton;
    }
}
