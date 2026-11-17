package com.transsion.baseui.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.AbstractC0783a0;
import androidx.compose.foundation.layout.AbstractC0791e0;
import androidx.compose.foundation.layout.C0784b;
import androidx.compose.foundation.layout.C0789d0;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p019ui.InterfaceC1262b;
import androidx.compose.p019ui.InterfaceC1302f;
import androidx.compose.p019ui.graphics.AbstractC1552v1;
import androidx.compose.p019ui.graphics.painter.Painter;
import androidx.compose.p019ui.layout.InterfaceC1699t;
import androidx.compose.p019ui.layout.LayoutKt;
import androidx.compose.p019ui.node.ComposeUiNode;
import androidx.compose.p019ui.platform.ComposeView;
import androidx.compose.p019ui.text.font.AbstractC2046h;
import androidx.compose.p019ui.text.font.C2054p;
import androidx.compose.runtime.AbstractC1113f3;
import androidx.compose.runtime.AbstractC1114g;
import androidx.compose.runtime.AbstractC1144k;
import androidx.compose.runtime.AbstractC1241v1;
import androidx.compose.runtime.C1122h2;
import androidx.compose.runtime.InterfaceC1109f;
import androidx.compose.runtime.InterfaceC1117g2;
import androidx.compose.runtime.InterfaceC1124i;
import androidx.compose.runtime.InterfaceC1176s;
import androidx.compose.runtime.internal.AbstractC1134b;
import androidx.p1004lifecycle.ViewTreeLifecycleOwner;
import androidx.p1004lifecycle.ViewTreeViewModelStoreOwner;
import androidx.p1005savedstate.ViewTreeSavedStateRegistryOwner;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.cloud.tmc.miniapp.prepare.steps.PrepareException;
import com.google.android.material.card.MaterialCardView;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$string;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.R$mipmap;
import com.transsion.baseui.util.C14557c;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mh.C25835b;
import p429g4.InterfaceC23498a;
import p474i0.AbstractC23939b;
import p474i0.AbstractC23942e;
import p474i0.AbstractC23945h;
import p550kj.C24662i;
import p629o0.AbstractC26153x;
import p629o0.C26138i;
import p667p.AbstractC26771h;
import p667p.InterfaceC26772i;
import p690q.AbstractC26970g;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import pg.C26866a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m97099d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b'\u0018\u0000 1*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004:\u00012B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00028\u0000H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H$¢\u0006\u0004\b\u001a\u0010\u0006J\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010#\u001a\u00020\u0007H\u0014¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\u0006J\u000f\u0010%\u001a\u00020\u0007H\u0014¢\u0006\u0004\b%\u0010\u0006J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0016¢\u0006\u0004\b)\u0010\u000eJ\u000f\u0010*\u001a\u00020\u0007H\u0007¢\u0006\u0004\b*\u0010+R\"\u0010,\u001a\u00028\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u00100¨\u00063"}, m97100d2 = {"Lcom/transsion/baseui/activity/BaseCommonActivity;", "Lg4/a;", "T", "Landroidx/appcompat/app/AppCompatActivity;", "Lrh/n;", "<init>", "()V", "", "U", "Landroid/view/View;", "S", "()Landroid/view/View;", "", "getClassTag", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "bundle", "intercept", "(Landroid/content/Context;Landroid/os/Bundle;)V", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "getViewBinding", "()Lg4/a;", "setView", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onConnected", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onDisconnected", "onResume", "onPause", "finish", "onDestroy", "", "isMonitorNetworkState", "()Z", "getPageName", "EnterHomeView", "(Landroidx/compose/runtime/i;I)V", "mViewBinding", "Lg4/a;", "getMViewBinding", "setMViewBinding", "(Lg4/a;)V", "Companion", "a", "BaseUI_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public abstract class BaseCommonActivity<T extends InterfaceC23498a> extends AppCompatActivity implements InterfaceC27288n {
    public static final String EXTRA_SHOW_HOME_BUTTON = "show_enter_home";
    public static final String TAG = "BaseCommonActivity";
    public T mViewBinding;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.transsion.baseui.activity.BaseCommonActivity$b */
    /* JADX INFO: loaded from: classes5.dex */
    static final class C14505b implements Function2 {
        C14505b() {
        }

        /* JADX INFO: renamed from: a */
        public final void m65369a(InterfaceC1124i interfaceC1124i, int i11) {
            if ((i11 & 3) == 2 && interfaceC1124i.mo4471h()) {
                interfaceC1124i.mo4443G();
                return;
            }
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5039Q(-541145127, i11, -1, "com.transsion.baseui.activity.BaseCommonActivity.getEnterHomeView.<anonymous>.<anonymous> (BaseCommonActivity.kt:205)");
            }
            BaseCommonActivity.this.EnterHomeView(interfaceC1124i, 0);
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5038P();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m65369a((InterfaceC1124i) obj, ((Number) obj2).intValue());
            return Unit.f75682a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final Unit m65365Q(BaseCommonActivity baseCommonActivity) {
        if (C14557c.f51100a.m65671a(R$mipmap.ic_tab_home, 2000L)) {
            return Unit.f75682a;
        }
        Navigator.m61845x(TheRouter.m61773c("/main/tab").m61852F("tabIndex", 0), baseCommonActivity, null, 2, null);
        C24662i c24662i = C24662i.f75350a;
        String pageName = baseCommonActivity.getPageName();
        HashMap map = new HashMap();
        map.put("event_type", "deeplink_enter_home_click");
        Unit unit = Unit.f75682a;
        c24662i.m96881p(pageName, map);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final Unit m65366R(BaseCommonActivity baseCommonActivity, int i11, InterfaceC1124i interfaceC1124i, int i12) {
        baseCommonActivity.EnterHomeView(interfaceC1124i, AbstractC1241v1.m5707a(i11 | 1));
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: S */
    private final View m65367S() {
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        ViewTreeLifecycleOwner.m14880b(composeView, this);
        ViewTreeViewModelStoreOwner.m14882b(composeView, this);
        ViewTreeSavedStateRegistryOwner.m21732b(composeView, this);
        composeView.setContent(AbstractC1134b.m4967b(-541145127, true, new C14505b()));
        return composeView;
    }

    /* JADX INFO: renamed from: U */
    private final void m65368U() {
        if (getIntent().getBooleanExtra(EXTRA_SHOW_HOME_BUTTON, false)) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.height = -2;
            layoutParams.width = -2;
            layoutParams.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_BOTTOM_START;
            layoutParams.y = AbstractC5776a0.m27313a(120.0f);
            layoutParams.flags = Sdk$SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
            layoutParams.format = -3;
            getWindowManager().addView(m65367S(), layoutParams);
            C24662i c24662i = C24662i.f75350a;
            String pageName = getPageName();
            HashMap map = new HashMap();
            map.put("event_type", "deeplink_enter_home_browse");
            Unit unit = Unit.f75682a;
            c24662i.m96872D(pageName, map);
        }
    }

    public final void EnterHomeView(InterfaceC1124i interfaceC1124i, final int i11) {
        int i12;
        InterfaceC1124i interfaceC1124i2;
        InterfaceC1124i interfaceC1124iMo4469g = interfaceC1124i.mo4469g(976578532);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC1124iMo4469g.mo4433A(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && interfaceC1124iMo4469g.mo4471h()) {
            interfaceC1124iMo4469g.mo4443G();
            interfaceC1124i2 = interfaceC1124iMo4469g;
        } else {
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5039Q(976578532, i12, -1, "com.transsion.baseui.activity.BaseCommonActivity.EnterHomeView (BaseCommonActivity.kt:213)");
            }
            Painter painterM94712c = AbstractC23942e.m94712c(R$mipmap.ic_tab_home, interfaceC1124iMo4469g, 0);
            InterfaceC1262b.c cVarM5757h = InterfaceC1262b.f4036a.m5757h();
            InterfaceC1302f.a aVar = InterfaceC1302f.f4127a;
            float f11 = 0;
            float f12 = 20;
            InterfaceC1302f interfaceC1302fM3003a = BackgroundKt.m3003a(SizeKt.m3412e(aVar, C26138i.m102354g(36)), AbstractC23939b.m94702a(R$color.bg_01_70_reverse, interfaceC1124iMo4469g, 0), AbstractC26970g.m105116d(C26138i.m102354g(f11), C26138i.m102354g(f12), C26138i.m102354g(f12), C26138i.m102354g(f11)));
            interfaceC1124iMo4469g.mo4456P(1849434622);
            Object objMo4497y = interfaceC1124iMo4469g.mo4497y();
            InterfaceC1124i.a aVar2 = InterfaceC1124i.f3683a;
            if (objMo4497y == aVar2.m4902a()) {
                objMo4497y = AbstractC26771h.m104572a();
                interfaceC1124iMo4469g.mo4484p(objMo4497y);
            }
            InterfaceC26772i interfaceC26772i = (InterfaceC26772i) objMo4497y;
            interfaceC1124iMo4469g.mo4448K();
            interfaceC1124iMo4469g.mo4456P(5004770);
            boolean zMo4433A = interfaceC1124iMo4469g.mo4433A(this);
            Object objMo4497y2 = interfaceC1124iMo4469g.mo4497y();
            if (zMo4433A || objMo4497y2 == aVar2.m4902a()) {
                objMo4497y2 = new Function0() { // from class: com.transsion.baseui.activity.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseCommonActivity.m65365Q(this.f50998a);
                    }
                };
                interfaceC1124iMo4469g.mo4484p(objMo4497y2);
            }
            interfaceC1124iMo4469g.mo4448K();
            InterfaceC1302f interfaceC1302fM3042b = ClickableKt.m3042b(interfaceC1302fM3003a, interfaceC26772i, null, false, null, null, (Function0) objMo4497y2, 28, null);
            interfaceC1124iMo4469g.mo4496x(693286680);
            InterfaceC1699t interfaceC1699tM3475b = AbstractC0783a0.m3475b(C0784b.f2739a.m3478c(), cVarM5757h, interfaceC1124iMo4469g, 48);
            interfaceC1124iMo4469g.mo4496x(-1323940314);
            int iM4878a = AbstractC1114g.m4878a(interfaceC1124iMo4469g, 0);
            InterfaceC1176s interfaceC1176sMo4481n = interfaceC1124iMo4469g.mo4481n();
            ComposeUiNode.Companion companion = ComposeUiNode.f5204c1;
            Function0 function0M7740a = companion.m7740a();
            Function3 function3M7500a = LayoutKt.m7500a(interfaceC1302fM3042b);
            if (!(interfaceC1124iMo4469g.mo4472i() instanceof InterfaceC1109f)) {
                AbstractC1114g.m4879b();
            }
            interfaceC1124iMo4469g.mo4437C();
            if (interfaceC1124iMo4469g.mo4466e()) {
                interfaceC1124iMo4469g.mo4442F(function0M7740a);
            } else {
                interfaceC1124iMo4469g.mo4482o();
            }
            InterfaceC1124i interfaceC1124iM4876a = AbstractC1113f3.m4876a(interfaceC1124iMo4469g);
            AbstractC1113f3.m4877b(interfaceC1124iM4876a, interfaceC1699tM3475b, companion.m7742c());
            AbstractC1113f3.m4877b(interfaceC1124iM4876a, interfaceC1176sMo4481n, companion.m7744e());
            Function2 function2M7741b = companion.m7741b();
            if (interfaceC1124iM4876a.mo4466e() || !Intrinsics.m97797c(interfaceC1124iM4876a.mo4497y(), Integer.valueOf(iM4878a))) {
                interfaceC1124iM4876a.mo4484p(Integer.valueOf(iM4878a));
                interfaceC1124iM4876a.mo4474k(Integer.valueOf(iM4878a), function2M7741b);
            }
            function3M7500a.invoke(C1122h2.m4896a(C1122h2.m4897b(interfaceC1124iMo4469g)), interfaceC1124iMo4469g, 0);
            interfaceC1124iMo4469g.mo4496x(2058660585);
            C0789d0 c0789d0 = C0789d0.f2752a;
            AbstractC0791e0.m3499a(SizeKt.m3419l(aVar, C26138i.m102354g(8)), interfaceC1124iMo4469g, 6);
            ImageKt.m3085a(painterM94712c, null, SizeKt.m3417j(aVar, C26138i.m102354g(18)), null, null, 0.0f, AbstractC1552v1.a.m6924b(AbstractC1552v1.f4655b, AbstractC23939b.m94702a(R$color.bg_01, interfaceC1124iMo4469g, 0), 0, 2, null), interfaceC1124iMo4469g, 432, 56);
            AbstractC0791e0.m3499a(SizeKt.m3419l(aVar, C26138i.m102354g(4)), interfaceC1124iMo4469g, 6);
            TextKt.m4312a(AbstractC23945h.m94716a(R$string.tab_home, interfaceC1124iMo4469g, 0), null, AbstractC23939b.m94702a(R$color.bg_01, interfaceC1124iMo4469g, 0), AbstractC26153x.m102447c(14), null, C2054p.f6244b.m9555c(), AbstractC2046h.f6219b.m9513b(), 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1124iMo4469g, 199680, 0, 130962);
            interfaceC1124i2 = interfaceC1124iMo4469g;
            AbstractC0791e0.m3499a(SizeKt.m3419l(aVar, C26138i.m102354g(12)), interfaceC1124i2, 6);
            interfaceC1124i2.mo4454N();
            interfaceC1124i2.mo4487r();
            interfaceC1124i2.mo4454N();
            interfaceC1124i2.mo4454N();
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5038P();
            }
        }
        InterfaceC1117g2 interfaceC1117g2Mo4473j = interfaceC1124i2.mo4473j();
        if (interfaceC1117g2Mo4473j != null) {
            interfaceC1117g2Mo4473j.mo4602a(new Function2() { // from class: com.transsion.baseui.activity.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BaseCommonActivity.m65366R(this.f50999a, i11, (InterfaceC1124i) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // android.app.Activity
    public void finish() {
        if (getIntent().getBooleanExtra(EXTRA_SHOW_HOME_BUTTON, false)) {
            finishAffinity();
        }
        super.finish();
    }

    public final String getClassTag() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public final T getMViewBinding() {
        T t11 = this.mViewBinding;
        if (t11 != null) {
            return t11;
        }
        Intrinsics.m97819y("mViewBinding");
        return null;
    }

    public String getPageName() {
        return "";
    }

    public abstract InterfaceC23498a getViewBinding();

    public final void intercept(Context context, Bundle bundle) {
        Object objM112707constructorimpl;
        Set<String> setKeySet;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (bundle == null) {
                return;
            }
            String strM101499n = C25835b.f78806a.m101499n();
            boolean z11 = TextUtils.equals(strM101499n, PrepareException.ERROR_MINI_APP_CLOSE) || TextUtils.equals(strM101499n, "10");
            if (context != null && z11) {
                bundle.setClassLoader(context.getClass().getClassLoader());
                Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    for (String str : setKeySet) {
                        Object obj = bundle2.get(str);
                        Bundle bundle3 = obj instanceof Bundle ? (Bundle) obj : null;
                        ClassLoader classLoader = bundle3 != null ? bundle3.getClassLoader() : null;
                        C26866a.f81698a.m104916j("BaseCommonActivity --> intercept() --> classLoader = " + classLoader, true);
                        Object obj2 = bundle2.get(str);
                        Bundle bundle4 = obj2 instanceof Bundle ? (Bundle) obj2 : null;
                        if (bundle4 != null) {
                            bundle4.setClassLoader(context.getClass().getClassLoader());
                        }
                    }
                }
                C26866a.f81698a.m104916j("BaseCommonActivity --> intercept() --> 当前系统版本9、10 替换BootClassLoader -- ClassLoader", true);
            }
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl == null) {
            return;
        }
        C26866a.f81698a.m104916j("BaseCommonActivity --> intercept() --> it = " + thM112710exceptionOrNullimpl, true);
    }

    public boolean isMonitorNetworkState() {
        return true;
    }

    @Override // p743rh.InterfaceC27288n
    public void onConnected() {
        InterfaceC27288n.a.m106338a(this);
    }

    @Override // p743rh.InterfaceC27288n
    public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.m97802h(network, "network");
        Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        intercept(this, savedInstanceState);
        super.onCreate(savedInstanceState);
        if (isMonitorNetworkState()) {
            C27287m.f83003a.m106336l(this);
        }
        setMViewBinding(getViewBinding());
        setView();
        m65368U();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isMonitorNetworkState()) {
            C27287m.f83003a.m106337m(this);
        }
        AbstractC14517k.m65408f(null, this, 1, null);
    }

    @Override // p743rh.InterfaceC27288n
    public void onDisconnected() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        AbstractC14517k.m65413k(null, this, 1, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        Intent launchIntentForPackage;
        try {
            super.onResume();
            AbstractC14517k.m65417o(null, this, 1, null);
        } catch (IllegalArgumentException unused) {
            if (isTaskRoot()) {
                String simpleName = getClass().getSimpleName();
                Intrinsics.m97801g(simpleName, "getSimpleName(...)");
                if (StringsKt.m98132c0(simpleName, "MainActivity", false, 2, null) && (launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName())) != null) {
                    launchIntentForPackage.addFlags(268468224);
                    startActivity(launchIntentForPackage);
                }
            }
            finish();
        }
    }

    public final void setMViewBinding(T t11) {
        Intrinsics.m97802h(t11, "<set-?>");
        this.mViewBinding = t11;
    }

    protected abstract void setView();
}
