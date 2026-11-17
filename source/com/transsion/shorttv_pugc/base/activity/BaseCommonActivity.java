package com.transsion.shorttv_pugc.base.activity;

import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.cloud.tmc.miniapp.prepare.steps.PrepareException;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mh.C25835b;
import p429g4.InterfaceC23498a;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b&\u0018\u0000 +*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004:\u0001%B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00028\u0000H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH$¢\u0006\u0004\b\u0013\u0010\u0006J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001b\u0010\u0006J\u000f\u0010\u001c\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\"\u0010*\u001a\u00028\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010)¨\u0006,"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/base/activity/BaseCommonActivity;", "Lg4/a;", "T", "Landroidx/appcompat/app/AppCompatActivity;", "Lrh/n;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "bundle", "", "intercept", "(Landroid/content/Context;Landroid/os/Bundle;)V", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "getViewBinding", "()Lg4/a;", "setView", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onConnected", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onDisconnected", "onResume", "onPause", "finish", "onDestroy", "", "isMonitorNetworkState", "()Z", "", "getPageName", "()Ljava/lang/String;", "a", "Lg4/a;", "getMViewBinding", "setMViewBinding", "(Lg4/a;)V", "mViewBinding", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public abstract class BaseCommonActivity<T extends InterfaceC23498a> extends AppCompatActivity implements InterfaceC27288n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public InterfaceC23498a mViewBinding;

    @Override // android.app.Activity
    public void finish() {
        if (getIntent().getBooleanExtra(com.transsion.baseui.activity.BaseCommonActivity.EXTRA_SHOW_HOME_BUTTON, false)) {
            finishAffinity();
        }
        super.finish();
    }

    public final InterfaceC23498a getMViewBinding() {
        InterfaceC23498a interfaceC23498a = this.mViewBinding;
        if (interfaceC23498a != null) {
            return interfaceC23498a;
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
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isMonitorNetworkState()) {
            C27287m.f83003a.m106337m(this);
        }
        AbstractC19222e.m80448b(null, this, 1, null);
    }

    @Override // p743rh.InterfaceC27288n
    public void onDisconnected() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        AbstractC19222e.m80450d(null, this, 1, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        AbstractC19222e.m80452f(null, this, 1, null);
    }

    public final void setMViewBinding(InterfaceC23498a interfaceC23498a) {
        Intrinsics.m97802h(interfaceC23498a, "<set-?>");
        this.mViewBinding = interfaceC23498a;
    }

    protected abstract void setView();
}
