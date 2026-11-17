package com.transsion.subroom.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.AbstractC0190c;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.ViewModelLazy;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.therouter.TheRouter;
import com.transsion.baselib.report.InterfaceC14487f;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.push.feature.toolbar.ToolbarNotificationUtils;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p669p1.AbstractC26781a;
import p750rp.InterfaceC27315a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0019\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m97100d2 = {"Lcom/transsion/subroom/deeplink/DeepLinkHandler;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/transsion/baselib/report/f;", "<init>", "()V", "Landroid/content/Intent;", "intent", "", "R", "(Landroid/content/Intent;)V", "P", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onNewIntent", "onResume", "onPause", "onDestroy", "", "a", "Ljava/lang/String;", "TAG", "Lcom/transsion/subroom/deeplink/d;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "Q", "()Lcom/transsion/subroom/deeplink/d;", "mLaunchViewModel", "app_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class DeepLinkHandler extends AppCompatActivity implements InterfaceC14487f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG = "deeplink_Handler";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mLaunchViewModel;

    public DeepLinkHandler() {
        final Function0 function0 = null;
        this.mLaunchViewModel = new ViewModelLazy(Reflection.m97823b(C19645d.class), new Function0<C3231x0>() { // from class: com.transsion.subroom.deeplink.DeepLinkHandler$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.subroom.deeplink.DeepLinkHandler$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<AbstractC26781a>() { // from class: com.transsion.subroom.deeplink.DeepLinkHandler$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final AbstractC26781a invoke() {
                AbstractC26781a abstractC26781a;
                Function0 function1 = function0;
                return (function1 == null || (abstractC26781a = (AbstractC26781a) function1.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : abstractC26781a;
            }
        });
    }

    /* JADX INFO: renamed from: P */
    private final void m81787P() {
        AbstractC0190c.m883a(TheRouter.m61774d(InterfaceC27315a.class, new Object[0]));
    }

    /* JADX INFO: renamed from: Q */
    private final C19645d m81788Q() {
        return (C19645d) this.mLaunchViewModel.getValue();
    }

    /* JADX INFO: renamed from: R */
    private final void m81789R(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "appLinkData " + data + " type=" + intent.getType(), false, 4, null);
        try {
            m81787P();
            ToolbarNotificationUtils.f58521a.m75853v(intent);
            m81788Q().m81805i(this, data, new Function0() { // from class: com.transsion.subroom.deeplink.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeepLinkHandler.m81790S(this.f62708a);
                }
            });
            if (data.getBooleanQueryParameter("withoutAd", false)) {
                return;
            }
            overridePendingTransition(0, 0);
            finish();
        } catch (Exception e11) {
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "处理 appLinkData " + data + " 异常:" + e11.getMessage(), false, 4, null);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final Unit m81790S(DeepLinkHandler deepLinkHandler) {
        deepLinkHandler.overridePendingTransition(0, 0);
        deepLinkHandler.finish();
        return Unit.f75682a;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Intrinsics.m97801g(intent, "getIntent(...)");
        m81789R(intent);
        AbstractC14517k.m65406d(null, this, 1, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        AbstractC14517k.m65408f(null, this, 1, null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.m97802h(intent, "intent");
        super.onNewIntent(intent);
        m81789R(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        AbstractC14517k.m65413k(null, this, 1, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        AbstractC14517k.m65417o(null, this, 1, null);
    }
}
