package com.transsion.usercenter.laboratory;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.webkit.WebView;
import androidx.p1004lifecycle.AbstractC3226v;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.cloud.tmc.launcherlib.LauncherMiniAppConfigHelper;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.transsion.baselib.report.C14492k;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.mbwidget.data.SportWidgetDataManager;
import com.transsion.mbwidget.data.WidgetRefreshWorker;
import com.transsion.p285ad.test.TestAdActivity;
import com.transsion.push.PushTestActivity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25207u0;
import org.mvel2.ast.ASTNode;
import p585lw.C25704e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m97100d2 = {"Lcom/transsion/usercenter/laboratory/LaboratoryActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Llw/e;", "<init>", "()V", "t0", "()Llw/e;", "", "isStatusDark", "()Z", "isTranslucent", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "M0", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class LaboratoryActivity extends BaseActivity<C25704e> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final void m84868A0(LaboratoryActivity laboratoryActivity, View view) {
        laboratoryActivity.startActivity(new Intent(laboratoryActivity, (Class<?>) LabMiniAppSDKTestActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final void m84869B0(LaboratoryActivity laboratoryActivity, View view) {
        new LabFpsDialog().m65436k0(laboratoryActivity, LauncherMiniAppConfigHelper.KEY_FPS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final void m84870C0(LaboratoryActivity laboratoryActivity, View view) {
        TestAdActivity.INSTANCE.m63747a(laboratoryActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final void m84871D0(LaboratoryActivity laboratoryActivity, View view) {
        new LabContentModeDialog().m65436k0(laboratoryActivity, "LabContentModeDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final void m84872E0(LaboratoryActivity laboratoryActivity, View view) {
        new LabPhoneBrandDialog().m65436k0(laboratoryActivity, "brand");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final void m84873F0(LaboratoryActivity laboratoryActivity, View view) {
        new LabInfoDialog().m65436k0(laboratoryActivity, "info");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final void m84874G0(LaboratoryActivity laboratoryActivity, View view) {
        laboratoryActivity.startActivity(new Intent(laboratoryActivity, (Class<?>) MccActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final void m84875H0(LaboratoryActivity laboratoryActivity, View view) {
        new LabChannelDialog().m65436k0(laboratoryActivity, "channel");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final void m84876I0(LaboratoryActivity laboratoryActivity, View view) {
        new LabStreamingDialog().m65436k0(laboratoryActivity, "stream");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final void m84877J0(LaboratoryActivity laboratoryActivity, View view) {
        new LabHttpHostDialog().m65436k0(laboratoryActivity, "host");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final void m84878K0(LaboratoryActivity laboratoryActivity, View view) {
        C13806h.f49015a.m62325l("Cold start coming");
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(laboratoryActivity), null, null, new LaboratoryActivity$onCreate$9$1(laboratoryActivity, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final void m84879L0(View view) {
        C13806h.f49015a.m62325l("js调试ON 当次进程有效");
        WebView.setWebContentsDebuggingEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m84898u0(LaboratoryActivity laboratoryActivity, View view) {
        laboratoryActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m84899v0(LaboratoryActivity laboratoryActivity, View view) {
        new LabLaneDialog().m65436k0(laboratoryActivity, "lane");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m84900w0(LaboratoryActivity laboratoryActivity, View view) {
        new LabWebTestDialog().m65436k0(laboratoryActivity, "webTest");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m84901x0(LaboratoryActivity laboratoryActivity, View view) {
        laboratoryActivity.startActivity(new Intent(laboratoryActivity, (Class<?>) PushTestActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m84902y0(View view) {
        C13806h.f49015a.m62325l("Refresh Widget + 体育Widget强制刷新");
        WidgetRefreshWorker.INSTANCE.m69692a();
        SportWidgetDataManager.f54088a.m69657h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m84903z0(LaboratoryActivity laboratoryActivity, View view) {
        new LabLocationDialog().m65436k0(laboratoryActivity, RequestParameters.SUBRESOURCE_LOCATION);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: M0 */
    public final Object m84904M0(Context context, Continuation continuation) throws Throwable {
        LaboratoryActivity$restartApp$1 laboratoryActivity$restartApp$1;
        if (continuation instanceof LaboratoryActivity$restartApp$1) {
            laboratoryActivity$restartApp$1 = (LaboratoryActivity$restartApp$1) continuation;
            int i11 = laboratoryActivity$restartApp$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                laboratoryActivity$restartApp$1.label = i11 - Integer.MIN_VALUE;
            } else {
                laboratoryActivity$restartApp$1 = new LaboratoryActivity$restartApp$1(this, continuation);
            }
        } else {
            laboratoryActivity$restartApp$1 = new LaboratoryActivity$restartApp$1(this, continuation);
        }
        Object obj = laboratoryActivity$restartApp$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = laboratoryActivity$restartApp$1.label;
        if (i12 == 0) {
            ResultKt.m97107b(obj);
            laboratoryActivity$restartApp$1.L$0 = context;
            laboratoryActivity$restartApp$1.label = 1;
            if (AbstractC25207u0.m99223a(2000L, laboratoryActivity$restartApp$1) == objF) {
                return objF;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (Context) laboratoryActivity$restartApp$1.L$0;
            ResultKt.m97107b(obj);
        }
        C14492k.f50955a.m65319l();
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        Intrinsics.m97799e(launchIntentForPackage);
        launchIntentForPackage.addFlags(ASTNode.DEOP);
        context.startActivity(launchIntentForPackage);
        Process.killProcess(Process.myPid());
        System.exit(0);
        return Unit.f75682a;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((C25704e) getMViewBinding()).f78136b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.m84898u0(this.f64924a, view);
            }
        });
        ((C25704e) getMViewBinding()).f78145k.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.m84899v0(this.f64897a, view);
            }
        });
        ((C25704e) getMViewBinding()).f78149o.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.m84872E0(this.f64925a, view);
            }
        });
        ((C25704e) getMViewBinding()).f78137c.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.m84873F0(this.f64927a, view);
            }
        });
        ((C25704e) getMViewBinding()).f78143i.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.m84874G0(this.f64929a, view);
            }
        });
        ((C25704e) getMViewBinding()).f78138d.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.m84875H0(this.f64930a, view);
            }
        });
        ((C25704e) getMViewBinding()).f78150p.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.m84876I0(this.f64932a, view);
            }
        });
        ((C25704e) getMViewBinding()).f78142h.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.m84877J0(this.f64935a, view);
            }
        });
        ((C25704e) getMViewBinding()).f78144j.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.m84878K0(this.f64937a, view);
            }
        });
        ((C25704e) getMViewBinding()).f78140f.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.m84879L0(view);
            }
        });
        ((C25704e) getMViewBinding()).f78152r.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.m84900w0(this.f64941a, view);
            }
        });
        ((C25704e) getMViewBinding()).f78148n.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.m84901x0(this.f64943a, view);
            }
        });
        ((C25704e) getMViewBinding()).f78153s.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.m84902y0(view);
            }
        });
        ((C25704e) getMViewBinding()).f78146l.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.m84903z0(this.f64947a, view);
            }
        });
        ((C25704e) getMViewBinding()).f78147m.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.m84868A0(this.f64949a, view);
            }
        });
        ((C25704e) getMViewBinding()).f78141g.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.m84869B0(this.f64951a, view);
            }
        });
        ((C25704e) getMViewBinding()).f78151q.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.m84870C0(this.f64953a, view);
            }
        });
        ((C25704e) getMViewBinding()).f78139e.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.m84871D0(this.f64894a, view);
            }
        });
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public C25704e getViewBinding() {
        C25704e c25704eM101117c = C25704e.m101117c(getLayoutInflater());
        Intrinsics.m97801g(c25704eM101117c, "inflate(...)");
        return c25704eM101117c;
    }
}
