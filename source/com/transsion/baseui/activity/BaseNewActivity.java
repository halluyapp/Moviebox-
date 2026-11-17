package com.transsion.baseui.activity;

import android.app.Activity;
import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.app.NotificationCompat;
import androidx.p1004lifecycle.AbstractC3226v;
import com.gyf.immersionbar.ImmersionBar;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.AbstractC13772o;
import com.p282tn.lib.view.NoNetworkBigView;
import com.p282tn.lib.view.StateView;
import com.p282tn.lib.widget.R$color;
import com.therouter.TheRouter;
import com.transsion.baselib.locale.C14468d;
import com.transsion.baselib.report.InterfaceC14488g;
import com.transsion.baseui.R$id;
import com.transsion.baseui.R$layout;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
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
import ng.AbstractC26006c;
import p415fq.InterfaceC23411b;
import p429g4.InterfaceC23498a;
import p550kj.C24655b;
import p743rh.C27287m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m97099d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0006J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\u0006J\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010\u0006J\u001f\u0010+\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0017H\u0016¢\u0006\u0004\b-\u0010!J\u000f\u0010.\u001a\u00020\u0017H\u0016¢\u0006\u0004\b.\u0010!J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0017H\u0016¢\u0006\u0004\b2\u0010!J\u000f\u00103\u001a\u00020\u0017H\u0016¢\u0006\u0004\b3\u0010!J\u000f\u00104\u001a\u00020\u0017H\u0016¢\u0006\u0004\b4\u0010!J\u000f\u00105\u001a\u00020\u0017H\u0016¢\u0006\u0004\b5\u0010!J\u000f\u00106\u001a\u00020\u0017H\u0016¢\u0006\u0004\b6\u0010!J\u000f\u00107\u001a\u00020\u0007H\u0016¢\u0006\u0004\b7\u0010\u0006J\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u0011\u0010<\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020;H\u0016¢\u0006\u0004\b>\u0010=J\u0011\u0010?\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b?\u0010=J\r\u0010@\u001a\u00020\u0007¢\u0006\u0004\b@\u0010\u0006J\r\u0010A\u001a\u00020\u0007¢\u0006\u0004\bA\u0010\u0006J\r\u0010B\u001a\u00020\u0007¢\u0006\u0004\bB\u0010\u0006J\r\u0010C\u001a\u00020\u0007¢\u0006\u0004\bC\u0010\u0006J\r\u0010D\u001a\u00020\u0007¢\u0006\u0004\bD\u0010\u0006J\r\u0010E\u001a\u00020\u0007¢\u0006\u0004\bE\u0010\u0006J\u000f\u0010F\u001a\u000208H&¢\u0006\u0004\bF\u0010:J\u000f\u0010G\u001a\u00020\u0007H&¢\u0006\u0004\bG\u0010\u0006J\u000f\u0010H\u001a\u00020\u0007H&¢\u0006\u0004\bH\u0010\u0006J\u000f\u0010I\u001a\u00020\u0007H&¢\u0006\u0004\bI\u0010\u0006J\u000f\u0010J\u001a\u00020\u0007H&¢\u0006\u0004\bJ\u0010\u0006J\u000f\u0010K\u001a\u00020\u0007H&¢\u0006\u0004\bK\u0010\u0006R$\u0010S\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010W\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010N\u001a\u0004\bU\u0010P\"\u0004\bV\u0010RR\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010^\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010b\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010aR\u001d\u0010j\u001a\u0004\u0018\u00010e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i¨\u0006k"}, m97100d2 = {"Lcom/transsion/baseui/activity/BaseNewActivity;", "Lg4/a;", "T", "Lcom/transsion/baseui/activity/BaseMusicFloatActivity;", "Lcom/transsion/baselib/report/g;", "<init>", "()V", "", "setStatusBar", "Landroid/content/Context;", "newBase", "attachBaseContext", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "onStop", "onDestroy", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "setView", "Lcom/gyf/immersionbar/ImmersionBar;", "with", "B0", "(Lcom/gyf/immersionbar/ImmersionBar;)V", "t0", "setImmersionStatusBar", "()Z", "Landroid/app/Activity;", "context", "j0", "(Landroid/app/Activity;)V", "onDisconnected", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onConnected", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "n0", "isChangeStatusBar", "", "statusColor", "()I", "isStatusDark", "isTranslucent", "o0", "isAttach", "A0", "q0", "", "a0", "()Ljava/lang/String;", "Landroid/view/View;", "b0", "()Landroid/view/View;", "g0", "d0", "s0", "u0", "v0", "w0", "x0", "y0", "f0", "l0", "m0", "k0", "p0", "retryLoadData", "Landroid/widget/FrameLayout;", "a", "Landroid/widget/FrameLayout;", "c0", "()Landroid/widget/FrameLayout;", "setLlRootView", "(Landroid/widget/FrameLayout;)V", "llRootView", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "getFlStateView", "setFlStateView", "flStateView", "Landroid/widget/ProgressBar;", "c", "Landroid/widget/ProgressBar;", "progressBar", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroid/view/View;", "loadingView", "", "e", "F", "downY", "f", "moveY", "Lkj/b;", "g", "Lkotlin/Lazy;", "getLogViewConfig", "()Lkj/b;", "logViewConfig", "BaseUI_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public abstract class BaseNewActivity<T extends InterfaceC23498a> extends BaseMusicFloatActivity<T> implements InterfaceC14488g {

    /* JADX INFO: renamed from: h */
    public static final int f50985h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private FrameLayout llRootView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private FrameLayout flStateView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private ProgressBar progressBar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private View loadingView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float downY;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float moveY;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy logViewConfig = LazyKt.m97097b(new Function0() { // from class: com.transsion.baseui.activity.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseNewActivity.m65378r0(this.f51003a);
        }
    });

    /* JADX INFO: renamed from: com.transsion.baseui.activity.BaseNewActivity$onConnected$1 */
    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.baseui.activity.BaseNewActivity$onConnected$1", m97637f = "BaseNewActivity.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C145061 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BaseNewActivity<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C145061(BaseNewActivity<T> baseNewActivity, Continuation<? super C145061> continuation) {
            super(2, continuation);
            this.this$0 = baseNewActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C145061(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C145061) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            this.this$0.m65398u0();
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
    /* JADX INFO: renamed from: e0 */
    public static final void m65375e0(BaseNewActivity baseNewActivity, View view) {
        baseNewActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final Unit m65376h0(BaseNewActivity baseNewActivity) {
        baseNewActivity.retryLoadData();
        AbstractC13772o.m62234b(baseNewActivity.getPageName());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final Unit m65377i0(BaseNewActivity baseNewActivity) {
        AbstractC13772o.m62235c(baseNewActivity.getPageName());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C24655b m65378r0(BaseNewActivity baseNewActivity) {
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
            immersionBarWith.fitsSystemWindows(mo65393o0());
            Intrinsics.m97799e(immersionBarWith);
            m65381B0(immersionBarWith);
            immersionBarWith.init();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m65379z0(BaseNewActivity baseNewActivity) {
        baseNewActivity.m65401x0();
    }

    /* JADX INFO: renamed from: A0 */
    public boolean mo65380A0() {
        return false;
    }

    /* JADX INFO: renamed from: B0 */
    public void m65381B0(ImmersionBar with) {
        Intrinsics.m97802h(with, "with");
    }

    /* JADX INFO: renamed from: a0 */
    public String getEmptyDesc() {
        return "";
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context newBase) {
        if (newBase == null) {
            super.attachBaseContext(newBase);
        } else {
            C14468d.b bVar = C14468d.f50894f;
            super.attachBaseContext(bVar.m65227k(newBase, bVar.m65224e().m65210j()));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public View m65383b0() {
        StateView stateView = new StateView(this);
        if (mo65380A0()) {
            stateView.setFitsSystemWindows(true);
        }
        stateView.showData(2, 1, true, mo65386f0(), getEmptyDesc());
        return stateView;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final FrameLayout getLlRootView() {
        return this.llRootView;
    }

    /* JADX INFO: renamed from: d0 */
    public View m65385d0() {
        if (this.loadingView == null) {
            View viewInflate = LayoutInflater.from(this).inflate(R$layout.default_base_loading_layout, (ViewGroup) this.flStateView, false);
            ((AppCompatImageView) viewInflate.findViewById(R$id.ivBack)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.baseui.activity.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseNewActivity.m65375e0(this.f51005a, view);
                }
            });
            this.loadingView = viewInflate;
        }
        return this.loadingView;
    }

    @Override // com.transsion.baseui.activity.BaseMusicFloatActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent event) {
        Integer numValueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.downY = event.getRawY();
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            float rawY = event.getRawY();
            this.moveY = rawY;
            if (Math.abs(rawY - this.downY) > 50.0f) {
                InterfaceC23411b interfaceC23411b = (InterfaceC23411b) TheRouter.m61774d(InterfaceC23411b.class, new Object[0]);
                if (interfaceC23411b != null) {
                    interfaceC23411b.mo23886c();
                }
                m65388j0(this);
            }
        }
        return super.dispatchTouchEvent(event);
    }

    /* JADX INFO: renamed from: f0 */
    public abstract String mo65386f0();

    /* JADX INFO: renamed from: g0 */
    public View mo65387g0() {
        NoNetworkBigView noNetworkBigView = new NoNetworkBigView(this);
        noNetworkBigView.showTitle(true, mo65386f0());
        noNetworkBigView.retry(new Function0() { // from class: com.transsion.baseui.activity.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseNewActivity.m65376h0(this.f51001a);
            }
        });
        noNetworkBigView.goToSetting(new Function0() { // from class: com.transsion.baseui.activity.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseNewActivity.m65377i0(this.f51002a);
            }
        });
        AbstractC13772o.m62233a(getPageName());
        return noNetworkBigView;
    }

    @Override // com.transsion.baselib.report.InterfaceC14488g
    public C24655b getLogViewConfig() {
        return (C24655b) this.logViewConfig.getValue();
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
    public void m65388j0(Activity context) {
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

    /* JADX INFO: renamed from: k0 */
    public abstract void mo65389k0();

    /* JADX INFO: renamed from: l0 */
    public abstract void mo65390l0();

    /* JADX INFO: renamed from: m0 */
    public abstract void mo65391m0();

    /* JADX INFO: renamed from: n0 */
    public boolean mo65392n0() {
        return true;
    }

    public C24655b newLogViewConfig() {
        return InterfaceC14488g.a.m65291a(this);
    }

    /* JADX INFO: renamed from: o0 */
    public boolean mo65393o0() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity, p743rh.InterfaceC27288n
    public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.m97802h(network, "network");
        Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
        super.onConnected(network, networkCapabilities);
        AbstractC3226v.m14968a(this).m14841b(new C145061(this, null));
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStatusBar();
        mo65390l0();
        mo65391m0();
        mo65389k0();
        if (C27287m.f83003a.m106330e()) {
            mo65394p0();
        }
        mo65395q0();
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity, p743rh.InterfaceC27288n
    public void onDisconnected() {
        super.onDisconnected();
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        InterfaceC14488g.a.m65292b(this);
    }

    @Override // com.transsion.baseui.activity.BaseMusicFloatActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        InterfaceC23411b interfaceC23411b;
        super.onResume();
        InterfaceC14488g.a.m65293c(this);
        if (!isAttach() || (interfaceC23411b = (InterfaceC23411b) TheRouter.m61774d(InterfaceC23411b.class, new Object[0])) == null) {
            return;
        }
        interfaceC23411b.mo23890g(new WeakReference(this));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        InterfaceC23411b interfaceC23411b;
        super.onStop();
        if (!isAttach() || (interfaceC23411b = (InterfaceC23411b) TheRouter.m61774d(InterfaceC23411b.class, new Object[0])) == null) {
            return;
        }
        interfaceC23411b.mo23892i(new WeakReference(this));
    }

    /* JADX INFO: renamed from: p0 */
    public abstract void mo65394p0();

    /* JADX INFO: renamed from: q0 */
    public void mo65395q0() {
    }

    public abstract void retryLoadData();

    /* JADX INFO: renamed from: s0 */
    public final void m65396s0() {
        FrameLayout frameLayout = this.flStateView;
        if (frameLayout != null) {
            AbstractC26006c.m102052e(frameLayout);
        }
    }

    public boolean setImmersionStatusBar() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    protected void setView() {
        setContentView(R$layout.default_base_layout);
        this.llRootView = (FrameLayout) findViewById(R$id.llRootView);
        FrameLayout frameLayout = (FrameLayout) findViewById(R$id.flContent);
        if (frameLayout != null) {
            frameLayout.addView(getMViewBinding().getRoot());
        }
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R$id.flStateView);
        if (frameLayout2 == null) {
            frameLayout2 = null;
        } else if (mo65392n0() && !C27287m.f83003a.m106330e()) {
            frameLayout2.setVisibility(0);
            frameLayout2.addView(mo65387g0());
        }
        this.flStateView = frameLayout2;
        this.progressBar = (ProgressBar) findViewById(R$id.progressBar);
    }

    public int statusColor() {
        return R$color.bg_01;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m65397t0() {
        setStatusBar();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m65398u0() {
        FrameLayout frameLayout = this.flStateView;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m65399v0() {
        FrameLayout frameLayout = this.flStateView;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            frameLayout.setVisibility(0);
            frameLayout.addView(m65383b0());
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m65400w0() {
        FrameLayout frameLayout = this.flStateView;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            frameLayout.setVisibility(0);
            frameLayout.addView(m65385d0());
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m65401x0() {
        FrameLayout frameLayout = this.flStateView;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            frameLayout.setVisibility(0);
            frameLayout.addView(mo65387g0());
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m65402y0() {
        getMViewBinding().getRoot().postDelayed(new Runnable() { // from class: com.transsion.baseui.activity.i
            @Override // java.lang.Runnable
            public final void run() {
                BaseNewActivity.m65379z0(this.f51004a);
            }
        }, 200L);
    }
}
