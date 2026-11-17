package com.transsion.usercenter.profile;

import af.C0091c;
import af.C0099k;
import af.InterfaceC0089a;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.InterfaceC0248a;
import androidx.core.content.AbstractC2397b;
import ck.AbstractC5114k;
import com.cloud.tmc.kernel.utils.UrlUtils;
import com.google.zxing.BarcodeFormat;
import com.gyf.immersionbar.ImmersionBar;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.utils.ActivityPermissionUtil;
import com.transsion.baseui.activity.BaseNewActivity;
import com.transsion.usercenter.profile.dialog.ProfileCameraPermissionDialog;
import com.transsion.web.api.WebPageIdentity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import p393f.C23283i;
import p585lw.C25718l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\u001aJ\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010\u0004R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, m97100d2 = {"Lcom/transsion/usercenter/profile/ProfileQRCodeActivity;", "Lcom/transsion/baseui/activity/BaseNewActivity;", "Llw/l;", "<init>", "()V", "", "H0", "O0", "", "openSetting", "Q0", "(Z)V", "M0", "", "scannedText", "L0", "(Ljava/lang/String;)V", "url", "K0", "(Ljava/lang/String;)Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "n0", "()Z", "onPause", "onDestroy", "I0", "()Llw/l;", "f0", "()Ljava/lang/String;", "setImmersionStatusBar", "l0", "m0", "k0", "p0", "q0", "retryLoadData", "Landroidx/activity/result/b;", "i", "Landroidx/activity/result/b;", "requestCameraPermissionLauncher", "Laf/a;", "j", "Laf/a;", "callback", CampaignEx.JSON_KEY_AD_K, "a", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ProfileQRCodeActivity extends BaseNewActivity<C25718l> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final AbstractC0249b requestCameraPermissionLauncher = registerForActivityResult(new C23283i(), new InterfaceC0248a() { // from class: com.transsion.usercenter.profile.g0
        @Override // androidx.activity.result.InterfaceC0248a
        /* JADX INFO: renamed from: a */
        public final void mo998a(Object obj) {
            ProfileQRCodeActivity.m85226P0(this.f65283a, ((Boolean) obj).booleanValue());
        }
    });

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC0089a callback = new C20635b();

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.ProfileQRCodeActivity$b */
    public static final class C20635b implements InterfaceC0089a {
        C20635b() {
        }

        @Override // af.InterfaceC0089a
        /* JADX INFO: renamed from: a */
        public void mo459a(List resultPoints) {
            Intrinsics.m97802h(resultPoints, "resultPoints");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // af.InterfaceC0089a
        /* JADX INFO: renamed from: b */
        public void mo460b(C0091c result) {
            Intrinsics.m97802h(result, "result");
            if (result.m468e() != null) {
                ((C25718l) ProfileQRCodeActivity.this.getMViewBinding()).f78289e.pause();
                String strM468e = result.m468e();
                ProfileQRCodeActivity profileQRCodeActivity = ProfileQRCodeActivity.this;
                Intrinsics.m97799e(strM468e);
                profileQRCodeActivity.m85222L0(strM468e);
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    private final void m85219H0() {
        if (AbstractC2397b.checkSelfPermission(this, "android.permission.CAMERA") == 0) {
            return;
        }
        m85225O0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final void m85220J0(ProfileQRCodeActivity profileQRCodeActivity, View view) {
        profileQRCodeActivity.finish();
    }

    /* JADX INFO: renamed from: K0 */
    private final boolean m85221K0(String url) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("oneroom://com.community.oneroom");
        arrayList.add("oneroom://com.community.moviebox");
        arrayList.add("https://v.aoneroom.com");
        arrayList.add("https://h5.aoneroom.com");
        arrayList.add("https://m.mvbrowse.com");
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (StringsKt.m98242W(url, (String) it.next(), false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public final void m85222L0(String scannedText) {
        if (m85221K0(scannedText)) {
            AbstractC5114k.m23925h(scannedText, null, 1, null);
        } else {
            String str = UrlUtils.QUESTION_MARK;
            if (StringsKt.m98132c0(scannedText, UrlUtils.QUESTION_MARK, false, 2, null)) {
                str = UrlUtils.AND_MARK;
            }
            Navigator.m61845x(TheRouter.m61773c(WebPageIdentity.WEB_VIEW).m61857K("url", scannedText + str + "web_unlock_key=web_unlock_value"), this, null, 2, null);
        }
        finish();
    }

    /* JADX INFO: renamed from: M0 */
    private final void m85223M0() {
        ActivityPermissionUtil.f50969a.m65348c("android.settings.APPLICATION_DETAILS_SETTINGS", 1023, new Function0() { // from class: com.transsion.usercenter.profile.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileQRCodeActivity.m85224N0(this.f65289a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final Unit m85224N0(ProfileQRCodeActivity profileQRCodeActivity) {
        if (AbstractC2397b.checkSelfPermission(profileQRCodeActivity, "android.permission.CAMERA") == 0) {
            return Unit.f75682a;
        }
        profileQRCodeActivity.m85227Q0(true);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: O0 */
    private final void m85225O0() {
        this.requestCameraPermissionLauncher.m999a("android.permission.CAMERA");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P0 */
    public static final void m85226P0(ProfileQRCodeActivity profileQRCodeActivity, boolean z11) {
        if (z11) {
            ((C25718l) profileQRCodeActivity.getMViewBinding()).f78289e.resume();
        } else if (profileQRCodeActivity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
            profileQRCodeActivity.m85227Q0(false);
        } else {
            profileQRCodeActivity.m85227Q0(true);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m85227Q0(final boolean openSetting) {
        ProfileCameraPermissionDialog profileCameraPermissionDialog = new ProfileCameraPermissionDialog();
        profileCameraPermissionDialog.m85327u0(new Function1() { // from class: com.transsion.usercenter.profile.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileQRCodeActivity.m85228R0(openSetting, this, ((Boolean) obj).booleanValue());
            }
        });
        profileCameraPermissionDialog.m65436k0(this, "ProfileCameraPermissionDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final Unit m85228R0(boolean z11, ProfileQRCodeActivity profileQRCodeActivity, boolean z12) {
        if (!z12) {
            profileQRCodeActivity.finish();
        } else if (z11) {
            profileQRCodeActivity.m85223M0();
        } else {
            profileQRCodeActivity.m85225O0();
        }
        return Unit.f75682a;
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public C25718l getViewBinding() {
        C25718l c25718lM101171c = C25718l.m101171c(getLayoutInflater());
        Intrinsics.m97801g(c25718lM101171c, "inflate(...)");
        return c25718lM101171c;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: f0 */
    public String mo65386f0() {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: k0 */
    public void mo65389k0() {
        ((C25718l) getMViewBinding()).f78286b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.profile.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileQRCodeActivity.m85220J0(this.f65200a, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: l0 */
    public void mo65390l0() {
        ((C25718l) getMViewBinding()).f78289e.setDecoderFactory(new C0099k(CollectionsKt.m97509o(BarcodeFormat.QR_CODE, BarcodeFormat.CODE_39)));
        ((C25718l) getMViewBinding()).f78289e.initializeFromIntent(getIntent());
        ((C25718l) getMViewBinding()).f78289e.decodeContinuous(this.callback);
        ImageView vStatusSpace = ((C25718l) getMViewBinding()).f78288d;
        Intrinsics.m97801g(vStatusSpace, "vStatusSpace");
        AbstractC26006c.m102052e(vStatusSpace);
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: m0 */
    public void mo65391m0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: n0 */
    public boolean mo65392n0() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(128);
        ImmersionBar.with(this).transparentBar().init();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((C25718l) getMViewBinding()).f78289e.pause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseMusicFloatActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((C25718l) getMViewBinding()).f78289e.resume();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: p0 */
    public void mo65394p0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: q0 */
    public void mo65395q0() {
        super.mo65395q0();
        m85219H0();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void retryLoadData() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean setImmersionStatusBar() {
        return false;
    }
}
