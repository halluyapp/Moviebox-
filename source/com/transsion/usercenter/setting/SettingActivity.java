package com.transsion.usercenter.setting;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.core.view.PointerIconCompat;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.Lifecycle;
import androidx.p1004lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.C5110g;
import ck.C5123t;
import ck.C5127x;
import com.blankj.utilcode.util.AbstractC5779c;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cloud.hisavana.sdk.data.bean.response.ccofig.ClientABTestDTOKt;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.util.networkinfo.NetworkType;
import com.p282tn.lib.view.TitleLayout;
import com.p282tn.lib.widget.R$color;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.R$drawable;
import com.transsion.baseui.R$string;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.transfer.wifi.util.C20132c;
import com.transsion.usercenter.laboratory.LaboratoryActivity;
import com.transsion.usercenter.profile.ProfileViewModel;
import com.transsion.usercenter.profile.bean.FissionState;
import com.transsion.usercenter.profile.bean.ProfileInfo;
import com.transsion.usercenter.setting.adapter.C20792d;
import com.transsion.usercenter.setting.bean.UserSettingType;
import com.transsion.usercenter.setting.dialog.LocaleLanguageListDialog;
import com.transsion.usercenterapi.UpdateResultEvent;
import com.transsion.version.update.UpdateManager;
import com.transsion.web.api.WebConstants;
import com.transsion.web.api.WebPageIdentity;
import com.transsnet.downloader.dialog.DownloadConfirmDialog;
import com.transsnet.downloader.util.C22090d;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25204t1;
import ng.AbstractC26006c;
import org.mvel2.ast.ASTNode;
import p381ek.DialogC23167h;
import p390ex.C23242b;
import p441gz.InterfaceC23704a;
import p441gz.InterfaceC23705b;
import p550kj.C24662i;
import p585lw.C25741w0;
import p669p1.AbstractC26781a;
import p743rh.C27287m;
import p765s6.InterfaceC27566d;
import p923xw.C28669b;
import p925xy.C28671a;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 \u0084\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001CB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0005J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u0005J\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u0005J\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u0005J\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\u0005J\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\u0005J\u000f\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\u0005J\u000f\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\u0005J\u000f\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010)H\u0014¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0006¢\u0006\u0004\b-\u0010\u0005J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020.H\u0016¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u00020\u0006H\u0014¢\u0006\u0004\b2\u0010\u0005J\u0017\u00104\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0014H\u0016¢\u0006\u0004\b4\u0010\u0017J\u000f\u00105\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010\u0005J\u000f\u00106\u001a\u00020\u0002H\u0016¢\u0006\u0004\b6\u00107J)\u0010=\u001a\u00020\u00062\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u0002082\b\u0010<\u001a\u0004\u0018\u00010;H\u0014¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0006H\u0016¢\u0006\u0004\b?\u0010\u0005J\u000f\u0010@\u001a\u00020\rH\u0016¢\u0006\u0004\b@\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001b0J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010T\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u001b\u0010Z\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0016\u0010\\\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010SR\u0016\u0010^\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010SR\u001d\u0010c\u001a\u0004\u0018\u00010_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010W\u001a\u0004\ba\u0010bR\u001b\u0010g\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010W\u001a\u0004\be\u0010fR\u001b\u0010j\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010W\u001a\u0004\bi\u0010fR\u001b\u0010m\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010W\u001a\u0004\bl\u0010fR\u001b\u0010r\u001a\u00020n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010W\u001a\u0004\bp\u0010qR\u0016\u0010t\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010SR\u001b\u0010w\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010W\u001a\u0004\bv\u0010fR\u0014\u0010z\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u001b\u0010}\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010W\u001a\u0004\b|\u0010fR\u001c\u0010\u0080\u0001\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b~\u0010W\u001a\u0004\b\u007f\u0010fR\u001e\u0010\u0083\u0001\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010W\u001a\u0005\b\u0082\u0001\u0010f¨\u0006\u0085\u0001"}, m97100d2 = {"Lcom/transsion/usercenter/setting/SettingActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Llw/w0;", "Lgz/b;", "<init>", "()V", "", "e1", "Y0", "z0", "initData", "", "size", "", "K0", "(J)Ljava/lang/String;", "o1", "n1", "showLoading", "E0", "Lcom/transsnet/loginapi/bean/UserInfo;", "userInfo", "y0", "(Lcom/transsnet/loginapi/bean/UserInfo;)V", "X0", "B0", "x0", "Lxw/b;", WebConstants.FIELD_ITEM, "q1", "(Lxw/b;)V", "W0", "A0", "a1", "D0", "U0", "T0", "Z0", "Lkotlinx/coroutines/t1;", "C0", "()Lkotlinx/coroutines/t1;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "initView", "", "isStatusDark", "()Z", "isTranslucent", "onDestroy", "user", "onLogin", "onLogout", "S0", "()Llw/w0;", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onResume", "getPageName", "()Ljava/lang/String;", "Lcom/transsion/usercenter/setting/adapter/d;", "a", "Lcom/transsion/usercenter/setting/adapter/d;", "mAdapter", "Lcom/transsion/usercenter/setting/b0;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/usercenter/setting/b0;", "mUserSettingViewModel", "", "c", "Ljava/util/List;", "mDataList", "Lek/h;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lek/h;", "mBaseLoadingDialog", "e", "Z", "darkModeFollowSys", "Lcom/transsion/usercenter/profile/ProfileViewModel;", "f", "Lkotlin/Lazy;", "O0", "()Lcom/transsion/usercenter/profile/ProfileViewModel;", "mProfileViewModel", "g", "isRequestBatteryPermission", "h", "isOpenPip", "Lgz/a;", "i", "M0", "()Lgz/a;", "loginApi", "j", "N0", "()Lxw/b;", "logoutEntity", CampaignEx.JSON_KEY_AD_K, "R0", "userAgreement", "l", "J0", "fissionStateEntity", "Lcom/transsnet/downloader/dialog/DownloadConfirmDialog;", "m", "P0", "()Lcom/transsnet/downloader/dialog/DownloadConfirmDialog;", "mUserSettingLogoutDialog", "n", "haveBatteryPermission", "o", "I0", "familyModeItem", TtmlNode.TAG_P, "Lxw/b;", "downItem", CampaignEx.JSON_KEY_AD_Q, "H0", "autoplayItem", CampaignEx.JSON_KEY_AD_R, "Q0", "pipItem", "s", "L0", "idleDataShareItem", "t", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SettingActivity extends BaseActivity<C25741w0> implements InterfaceC23705b {

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C20792d mAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C20798b0 mUserSettingViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private DialogC23167h mBaseLoadingDialog;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean darkModeFollowSys;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Lazy mProfileViewModel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean isRequestBatteryPermission;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean haveBatteryPermission;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private List mDataList = new ArrayList();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isOpenPip = true;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Lazy loginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.setting.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SettingActivity.m85629j1();
        }
    });

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Lazy logoutEntity = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.setting.m
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SettingActivity.m85631k1();
        }
    });

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Lazy userAgreement = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.setting.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SettingActivity.m85645r1();
        }
    });

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final Lazy fissionStateEntity = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.setting.o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SettingActivity.m85592G0();
        }
    });

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Lazy mUserSettingLogoutDialog = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.setting.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SettingActivity.m85633l1(this.f65542a);
        }
    });

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final Lazy familyModeItem = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.setting.q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SettingActivity.m85591F0(this.f65543a);
        }
    });

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C28669b downItem = new C28669b(R$string.download_in_background, UserSettingType.DOWNLOAD_SWITCH, null, Integer.valueOf(R$color.white_6), 3, null, false, false, false, false, 996, null);

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final Lazy autoplayItem = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.setting.r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SettingActivity.m85650w0(this.f65544a);
        }
    });

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Lazy pipItem = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.setting.s
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SettingActivity.m85635m1(this.f65545a);
        }
    });

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final Lazy idleDataShareItem = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.setting.t
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SettingActivity.m85606V0();
        }
    });

    /* JADX INFO: renamed from: com.transsion.usercenter.setting.SettingActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m85655a(Context context, FissionState fissionState) {
            Intrinsics.m97802h(context, "context");
            Intent intent = new Intent(context, (Class<?>) SettingActivity.class);
            intent.setFlags(ASTNode.DEOP);
            intent.putExtra("fissionState", fissionState);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.setting.SettingActivity$b */
    public /* synthetic */ class C20783b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65424a;

        static {
            int[] iArr = new int[UserSettingType.values().length];
            try {
                iArr[UserSettingType.UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserSettingType.ABOUT_US.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserSettingType.PRIVACY_POLICY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UserSettingType.USER_AGREEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UserSettingType.LOGOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UserSettingType.LANGUAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UserSettingType.INVITATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[UserSettingType.DEBUG.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[UserSettingType.NOTIFICATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[UserSettingType.FAMILY_MODE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[UserSettingType.DOWNLOAD_SWITCH.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[UserSettingType.PIP_SWITCH.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[UserSettingType.AUTOPLAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[UserSettingType.WATCH_OPTION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[UserSettingType.PRIVACY_DATA_SETTING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f65424a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.setting.SettingActivity$c */
    static final class C20784c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65425a;

        C20784c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65425a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65425a;
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
            this.f65425a.invoke(obj);
        }
    }

    public SettingActivity() {
        final Function0 function0 = null;
        this.mProfileViewModel = new ViewModelLazy(Reflection.m97823b(ProfileViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.usercenter.setting.SettingActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.usercenter.setting.SettingActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<AbstractC26781a>() { // from class: com.transsion.usercenter.setting.SettingActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: A0 */
    private final void m85586A0() {
        C14496b c14496b = C14496b.f50966a;
        boolean z11 = !c14496b.m65344b().getBoolean("k_UGC_VIDEO_AUTO_PLAY", false);
        m85593H0().m110498p(z11);
        c14496b.m65344b().putBoolean("k_UGC_VIDEO_AUTO_PLAY", z11);
        m85643q1(m85593H0());
    }

    /* JADX INFO: renamed from: B0 */
    private final void m85587B0() {
        this.isRequestBatteryPermission = true;
        if (this.haveBatteryPermission) {
            C22090d.f68111a.m89448k(this);
        } else {
            C22090d.m89442m(C22090d.f68111a, this, getPageName(), null, 4, null);
        }
    }

    /* JADX INFO: renamed from: C0 */
    private final InterfaceC25204t1 m85588C0() {
        return AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new SettingActivity$clickFamilyMode$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: D0 */
    private final void m85589D0() {
        this.isOpenPip = !this.isOpenPip;
        m85602Q0().m110498p(this.isOpenPip);
        C14496b.f50966a.m65344b().putBoolean("k_pip_enable", this.isOpenPip);
        m85643q1(m85602Q0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public final void m85590E0() {
        DialogC23167h dialogC23167h;
        try {
            DialogC23167h dialogC23167h2 = this.mBaseLoadingDialog;
            if (dialogC23167h2 == null || !dialogC23167h2.isShowing() || (dialogC23167h = this.mBaseLoadingDialog) == null) {
                return;
            }
            dialogC23167h.dismiss();
        } catch (Exception e11) {
            Log.e("error", "e " + e11.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C28669b m85591F0(SettingActivity settingActivity) {
        return new C28669b(R$string.family_mode, UserSettingType.FAMILY_MODE, settingActivity.getString(R$string.family_mode_tips), Integer.valueOf(R$color.white_6), 3, null, false, false, false, false, 992, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final C28669b m85592G0() {
        return new C28669b(com.transsion.usercenter.R$string.user_setting_invitation_code, UserSettingType.INVITATION, null, Integer.valueOf(R$color.white_6), 0, null, false, false, false, false, 1012, null);
    }

    /* JADX INFO: renamed from: H0 */
    private final C28669b m85593H0() {
        return (C28669b) this.autoplayItem.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public final C28669b m85594I0() {
        return (C28669b) this.familyModeItem.getValue();
    }

    /* JADX INFO: renamed from: J0 */
    private final C28669b m85595J0() {
        return (C28669b) this.fissionStateEntity.getValue();
    }

    /* JADX INFO: renamed from: K0 */
    private final String m85596K0(long size) {
        double d11 = size / 1024.0d;
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        String[] strArr = {" KB", " MB", " GB"};
        for (int i11 = 0; i11 < 3; i11++) {
            String str = strArr[i11];
            Intrinsics.m97799e(str);
            if (d11 < 1024.0d) {
                return MathKt.m97882c(d11) + str;
            }
            d11 /= 1024.0d;
        }
        return MathKt.m97882c(d11) + " GB";
    }

    /* JADX INFO: renamed from: L0 */
    private final C28669b m85597L0() {
        return (C28669b) this.idleDataShareItem.getValue();
    }

    /* JADX INFO: renamed from: M0 */
    private final InterfaceC23704a m85598M0() {
        return (InterfaceC23704a) this.loginApi.getValue();
    }

    /* JADX INFO: renamed from: N0 */
    private final C28669b m85599N0() {
        return (C28669b) this.logoutEntity.getValue();
    }

    /* JADX INFO: renamed from: O0 */
    private final ProfileViewModel m85600O0() {
        return (ProfileViewModel) this.mProfileViewModel.getValue();
    }

    /* JADX INFO: renamed from: P0 */
    private final DownloadConfirmDialog m85601P0() {
        return (DownloadConfirmDialog) this.mUserSettingLogoutDialog.getValue();
    }

    /* JADX INFO: renamed from: Q0 */
    private final C28669b m85602Q0() {
        return (C28669b) this.pipItem.getValue();
    }

    /* JADX INFO: renamed from: R0 */
    private final C28669b m85603R0() {
        return (C28669b) this.userAgreement.getValue();
    }

    /* JADX INFO: renamed from: T0 */
    private final void m85604T0() {
        Navigator.m61845x(TheRouter.m61773c("/profile/setting_privacy_data"), this, null, 2, null);
    }

    /* JADX INFO: renamed from: U0 */
    private final void m85605U0() {
        Navigator.m61845x(TheRouter.m61773c("/profile/watch_option"), this, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final C28669b m85606V0() {
        return new C28669b(com.transsion.usercenter.R$string.privacy_settings, UserSettingType.PRIVACY_DATA_SETTING, null, Integer.valueOf(R$drawable.bg_radius_bottom_6_color_white_6p), 0, null, false, false, false, false, 1012, null);
    }

    /* JADX INFO: renamed from: W0 */
    private final void m85607W0() {
        m85593H0().m110498p(C14496b.f50966a.m65344b().getBoolean("k_UGC_VIDEO_AUTO_PLAY", false));
    }

    /* JADX INFO: renamed from: X0 */
    private final void m85608X0() {
        boolean zM89447j = C22090d.f68111a.m89447j(this);
        this.haveBatteryPermission = zM89447j;
        this.downItem.m110498p(zM89447j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y0 */
    private final void m85609Y0() {
        UserInfo userInfoMo90386h;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC5779c.m27331h() + "-" + AbstractC5779c.m27329f());
        InterfaceC23704a interfaceC23704aM85598M0 = m85598M0();
        sb2.append(" | " + ((interfaceC23704aM85598M0 == null || (userInfoMo90386h = interfaceC23704aM85598M0.mo90386h()) == null) ? null : userInfoMo90386h.getUserId()));
        sb2.append(" | " + Build.VERSION.RELEASE);
        sb2.append(" | " + Build.MODEL);
        NetworkType networkTypeM106328c = C27287m.f83003a.m106328c();
        sb2.append(" | " + (networkTypeM106328c != null ? networkTypeM106328c.name() : null));
        C20132c c20132c = C20132c.f63993a;
        sb2.append(" | " + c20132c.m83558c(this));
        sb2.append(" | " + c20132c.m83557b());
        ((C25741w0) getMViewBinding()).f78432c.setText(sb2.toString());
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m85610Z0() {
        C14496b c14496b = C14496b.f50966a;
        boolean z11 = c14496b.m65344b().getBoolean("k_is_family_mode_badge", true);
        m85594I0().m110497o(z11);
        if (z11) {
            c14496b.m65344b().putBoolean("k_is_family_mode_badge", false);
            C23242b c23242b = new C23242b();
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = C23242b.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.postEvent(name, c23242b, 0L);
        }
        m85594I0().m110498p(c14496b.m65344b().getBoolean("k_is_family_mode", false));
        C24662i.f75350a.m96872D(getPageName(), MapsKt.m97551f(TuplesKt.m97108a("opt_type", "family_mode_switch")));
    }

    /* JADX INFO: renamed from: a1 */
    private final void m85611a1() {
        this.isOpenPip = C14496b.f50966a.m65344b().getBoolean("k_pip_enable", true);
        m85602Q0().m110498p(this.isOpenPip);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final void m85613b1(SettingActivity settingActivity, View view) {
        InterfaceC23704a interfaceC23704aM85598M0 = settingActivity.m85598M0();
        if (interfaceC23704aM85598M0 != null) {
            interfaceC23704aM85598M0.mo90387i(settingActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final Unit m85615c1(SettingActivity settingActivity, UpdateResultEvent it) {
        Object next;
        Intrinsics.m97802h(it, "it");
        if (it.getHasUpdate()) {
            Iterator it2 = settingActivity.mDataList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((C28669b) next).m110492j() != UserSettingType.UPDATE);
            C28669b c28669b = (C28669b) next;
            if (c28669b != null) {
                c28669b.m110499q(settingActivity.getString(com.transsion.usercenter.R$string.text_diff_new_version_ready));
            }
            C20792d c20792d = settingActivity.mAdapter;
            if (c20792d != null) {
                c20792d.notifyItemChanged(0);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final void m85617d1(SettingActivity settingActivity, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        if (item instanceof C28669b) {
            UserSettingType userSettingTypeM110492j = ((C28669b) item).m110492j();
            switch (userSettingTypeM110492j == null ? -1 : C20783b.f65424a[userSettingTypeM110492j.ordinal()]) {
                case 1:
                    if (!C27287m.f83003a.m106330e()) {
                        C28951b.f88586a.m111454d(com.transsion.usercenter.R$string.base_net_err);
                    } else {
                        settingActivity.showLoading();
                        settingActivity.m85653z0();
                    }
                    break;
                case 2:
                    settingActivity.startActivity(new Intent(settingActivity, (Class<?>) SettingAboutUsActivity.class));
                    break;
                case 3:
                    Navigator.m61845x(TheRouter.m61773c(WebPageIdentity.WEB_VIEW).m61857K("url", "https://h5-static.aoneroom.com/spa/html/moviebox-privacy-policy.html"), settingActivity, null, 2, null);
                    break;
                case 4:
                    Navigator.m61845x(TheRouter.m61773c(WebPageIdentity.WEB_VIEW).m61857K("url", "https://h5-static.aoneroom.com/spa/html/moviebox-terms-of-use.html"), settingActivity, null, 2, null);
                    break;
                case 5:
                    settingActivity.m85639o1();
                    break;
                case 6:
                    settingActivity.m85637n1();
                    break;
                case 7:
                    Navigator.m61844w(TheRouter.m61773c("/fission/invitation_code").m61857K("url", "https://h5-static.aoneroom.com/spa/html/moviebox-privacy-policy.html"), settingActivity, 4097, null, 4, null);
                    break;
                case 8:
                    settingActivity.startActivity(new Intent(settingActivity, (Class<?>) LaboratoryActivity.class));
                    break;
                case 9:
                    Navigator.m61845x(TheRouter.m61773c("/profile/setting_notice"), settingActivity, null, 2, null);
                    break;
                case 10:
                    settingActivity.m85588C0();
                    break;
                case 11:
                    settingActivity.m85587B0();
                    break;
                case 12:
                    settingActivity.m85589D0();
                    break;
                case 13:
                    settingActivity.m85586A0();
                    break;
                case 14:
                    settingActivity.m85605U0();
                    break;
                case 15:
                    settingActivity.m85604T0();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: e1 */
    private final void m85619e1() {
        C20798b0 c20798b0 = (C20798b0) new C3227v0(this).m14969a(C20798b0.class);
        c20798b0.m85686f().m14851j(this, new C20784c(new Function1() { // from class: com.transsion.usercenter.setting.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingActivity.m85621f1(this.f65546a, (Long) obj);
            }
        }));
        c20798b0.m85687g().m14851j(this, new C20784c(new Function1() { // from class: com.transsion.usercenter.setting.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingActivity.m85623g1(this.f65471a, (String) obj);
            }
        }));
        c20798b0.m85688h().m14851j(this, new C20784c(new Function1() { // from class: com.transsion.usercenter.setting.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingActivity.m85625h1((Boolean) obj);
            }
        }));
        this.mUserSettingViewModel = c20798b0;
        m85600O0().m85267p().m14851j(this, new C20784c(new Function1() { // from class: com.transsion.usercenter.setting.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingActivity.m85627i1(this.f65482a, (ProfileInfo) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final Unit m85621f1(SettingActivity settingActivity, Long l11) {
        C28669b c28669b = (C28669b) settingActivity.mDataList.get(1);
        Intrinsics.m97799e(l11);
        c28669b.m110495m(settingActivity.m85596K0(l11.longValue()));
        c28669b.m110496n(false);
        C20792d c20792d = settingActivity.mAdapter;
        if (c20792d != null) {
            c20792d.notifyItemChanged(1);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final Unit m85623g1(SettingActivity settingActivity, String str) {
        settingActivity.m85590E0();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final Unit m85625h1(Boolean bool) {
        C28951b.f88586a.m111454d(com.transsion.usercenter.R$string.user_setting_clear_cache_success);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final Unit m85627i1(SettingActivity settingActivity, ProfileInfo profileInfo) {
        String boundInviteCode;
        FissionState fissionState = profileInfo != null ? profileInfo.getFissionState() : null;
        InterfaceC23704a interfaceC23704aM85598M0 = settingActivity.m85598M0();
        if (interfaceC23704aM85598M0 != null && interfaceC23704aM85598M0.mo90379a() && fissionState != null && fissionState.isNew() && (((boundInviteCode = fissionState.getBoundInviteCode()) == null || boundInviteCode.length() == 0) && settingActivity.mDataList.size() > 1 && !Intrinsics.m97797c(settingActivity.mDataList.get(1), settingActivity.m85595J0()))) {
            settingActivity.mDataList.add(1, settingActivity.m85595J0());
            C20792d c20792d = settingActivity.mAdapter;
            if (c20792d != null) {
                c20792d.notifyItemInserted(1);
            }
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x017e  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        boolean z11;
        String boundInviteCode;
        this.mDataList.add(new C28669b(com.transsion.usercenter.R$string.user_setting_title_app, null, null, null, 2, null, false, false, false, false, PointerIconCompat.TYPE_CELL, null));
        this.mDataList.add(new C28669b(com.transsion.usercenter.R$string.notifications, UserSettingType.NOTIFICATION, null, Integer.valueOf(R$drawable.bg_radius_top_6_color_white_6p), 0, null, false, false, false, false, 756, null));
        this.mDataList.add(new C28669b(com.transsion.usercenter.R$string.language, UserSettingType.LANGUAGE, null, Integer.valueOf(R$color.white_6), 0, null, false, false, false, false, 1012, null));
        C5110g c5110g = C5110g.f17601a;
        if (c5110g.m23911b()) {
            this.mDataList.add(m85593H0());
        }
        if (!c5110g.m23911b()) {
            this.mDataList.add(new C28669b(R$string.watch_options, UserSettingType.WATCH_OPTION, null, Integer.valueOf(R$color.white_6), 0, C5123t.f17614a.m23960b() ? getString(R$string.streaming_txt) : getString(com.transsion.usercenter.R$string.feedback_download), false, false, false, false, 980, null));
        }
        this.mDataList.add(m85594I0());
        this.mDataList.add(this.downItem);
        this.mDataList.add(m85602Q0());
        this.mDataList.add(m85597L0());
        this.mDataList.add(new C28669b(com.transsion.usercenter.R$string.user_setting_title_more, null, null, null, 2, null, false, false, false, false, PointerIconCompat.TYPE_CELL, null));
        this.mDataList.add(new C28669b(com.transsion.usercenter.R$string.user_setting_update, UserSettingType.UPDATE, null, Integer.valueOf(R$drawable.bg_radius_top_6_color_white_6p), 0, UpdateManager.f65568f.m85865a().m85862g() ? getString(com.transsion.usercenter.R$string.text_diff_new_version_ready) : "", true, false, false, false, 660, null));
        FissionState fissionState = (FissionState) getIntent().getSerializableExtra("fissionState");
        if (fissionState != null && fissionState.isNew() && ((boundInviteCode = fissionState.getBoundInviteCode()) == null || boundInviteCode.length() == 0)) {
            this.mDataList.add(m85595J0());
        }
        this.mDataList.add(new C28669b(com.transsion.usercenter.R$string.user_setting_About_us, UserSettingType.ABOUT_US, null, Integer.valueOf(R$color.white_6), 0, null, false, false, false, false, 1012, null));
        this.mDataList.add(new C28669b(com.transsion.usercenter.R$string.login_privacy, UserSettingType.PRIVACY_POLICY, null, Integer.valueOf(R$color.white_6), 0, null, false, false, false, false, 1012, null));
        InterfaceC23704a interfaceC23704aM85598M0 = m85598M0();
        if (interfaceC23704aM85598M0 != null) {
            z11 = interfaceC23704aM85598M0.mo90379a();
        }
        this.mDataList.add(m85603R0());
        InterfaceC23704a interfaceC23704aM85598M1 = m85598M0();
        if (interfaceC23704aM85598M1 != null) {
            interfaceC23704aM85598M1.mo90392n(this);
        }
        if (z11) {
            m85603R0().m110494l(Integer.valueOf(R$color.white_6));
            ((C25741w0) getMViewBinding()).f78431b.setVisibility(8);
            this.mDataList.add(m85599N0());
        } else {
            m85603R0().m110494l(Integer.valueOf(R$drawable.bg_radius_bottom_6_color_white_6p));
            ((C25741w0) getMViewBinding()).f78431b.setVisibility(0);
        }
        C20792d c20792d = this.mAdapter;
        if (c20792d != null) {
            c20792d.mo36210q1(this.mDataList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final InterfaceC23704a m85629j1() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final C28669b m85631k1() {
        return new C28669b(com.transsion.usercenter.R$string.logout, UserSettingType.LOGOUT, null, Integer.valueOf(R$drawable.bg_radius_bottom_6_color_white_6p), 0, null, false, false, false, false, 1012, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final DownloadConfirmDialog m85633l1(SettingActivity settingActivity) {
        return DownloadConfirmDialog.Companion.m87440b(DownloadConfirmDialog.INSTANCE, null, null, settingActivity.getString(com.transsion.usercenter.R$string.logout_tips), null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final C28669b m85635m1(SettingActivity settingActivity) {
        return new C28669b(com.transsion.usercenter.R$string.auto_activate_miniplayer, UserSettingType.PIP_SWITCH, settingActivity.getString(com.transsion.usercenter.R$string.auto_activate_miniplayer_tips), Integer.valueOf(R$color.white_6), 3, null, false, false, false, false, 992, null);
    }

    /* JADX INFO: renamed from: n1 */
    private final void m85637n1() {
        new LocaleLanguageListDialog().m65436k0(this, "LocaleLanguageListDialog");
    }

    /* JADX INFO: renamed from: o1 */
    private final void m85639o1() {
        m85601P0().m87439s0(new Function1() { // from class: com.transsion.usercenter.setting.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingActivity.m85641p1(this.f65486a, ((Boolean) obj).booleanValue());
            }
        });
        m85601P0().m65436k0(this, "LogoutDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final Unit m85641p1(SettingActivity settingActivity, boolean z11) {
        InterfaceC23704a interfaceC23704aM85598M0;
        if (z11 && (interfaceC23704aM85598M0 = settingActivity.m85598M0()) != null) {
            interfaceC23704aM85598M0.mo90382d();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public final void m85643q1(C28669b item) {
        C20792d c20792d;
        int iIndexOf = this.mDataList.indexOf(item);
        if (iIndexOf == -1 || (c20792d = this.mAdapter) == null) {
            return;
        }
        c20792d.notifyItemChanged(iIndexOf, ClientABTestDTOKt.SWITCH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public static final C28669b m85645r1() {
        return new C28669b(com.transsion.usercenter.R$string.login_user_agreement, UserSettingType.USER_AGREEMENT, null, Integer.valueOf(R$drawable.bg_radius_bottom_6_color_white_6p), 0, null, false, false, false, false, 1012, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoading() {
        if (this.mBaseLoadingDialog == null) {
            this.mBaseLoadingDialog = new DialogC23167h(this);
        }
        DialogC23167h dialogC23167h = this.mBaseLoadingDialog;
        if (dialogC23167h != null) {
            dialogC23167h.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C28669b m85650w0(SettingActivity settingActivity) {
        return new C28669b(com.transsion.usercenter.R$string.autoplay, UserSettingType.AUTOPLAY, settingActivity.getString(com.transsion.usercenter.R$string.autoplay_tips), Integer.valueOf(R$color.white_6), 3, null, false, false, false, false, 992, null);
    }

    /* JADX INFO: renamed from: x0 */
    private final void m85651x0() {
        if (this.isRequestBatteryPermission) {
            this.isRequestBatteryPermission = false;
            boolean zM89447j = C22090d.f68111a.m89447j(this);
            this.haveBatteryPermission = zM89447j;
            this.downItem.m110498p(zM89447j);
            m85643q1(this.downItem);
            C28671a c28671a = new C28671a();
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = C28671a.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.postEvent(name, c28671a, 0L);
        }
    }

    /* JADX INFO: renamed from: y0 */
    private final void m85652y0(UserInfo userInfo) {
        m85600O0().m85264k(userInfo != null ? userInfo.getUserId() : null);
    }

    /* JADX INFO: renamed from: z0 */
    private final void m85653z0() {
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new SettingActivity$checkUpdateByUser$1(this, null), 3, null);
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public C25741w0 getViewBinding() {
        C25741w0 c25741w0M101242c = C25741w0.m101242c(getLayoutInflater());
        Intrinsics.m97801g(c25741w0M101242c, "inflate(...)");
        return c25741w0M101242c;
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public String getPageName() {
        return "setting";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initView() {
        TitleLayout toolBar = ((C25741w0) getMViewBinding()).f78434e;
        Intrinsics.m97801g(toolBar, "toolBar");
        AbstractC26006c.m102052e(toolBar);
        m85609Y0();
        C20792d c20792d = new C20792d(null, 1, null);
        c20792d.m36227w1(new InterfaceC27566d() { // from class: com.transsion.usercenter.setting.i
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                SettingActivity.m85617d1(this.f65483a, baseQuickAdapter, view, i11);
            }
        });
        this.mAdapter = c20792d;
        RecyclerView recyclerView = ((C25741w0) getMViewBinding()).f78433d;
        recyclerView.setAdapter(this.mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        ((C25741w0) getMViewBinding()).f78434e.setTitleText(com.transsion.usercenter.R$string.user_setting);
        ((C25741w0) getMViewBinding()).f78431b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.setting.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.m85613b1(this.f65484a, view);
            }
        });
        Function1 function1 = new Function1() { // from class: com.transsion.usercenter.setting.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingActivity.m85615c1(this.f65485a, (UpdateResultEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = UpdateResultEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
        m85608X0();
        m85611a1();
        m85610Z0();
        if (C5110g.f17601a.m23911b()) {
            m85607W0();
        }
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return this.darkModeFollowSys && !C5127x.f17620a.m23969a();
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 4097 && resultCode == -1) {
            int iIndexOf = this.mDataList.indexOf(m85595J0());
            if (iIndexOf >= 0) {
                this.mDataList.remove(iIndexOf);
            }
            C20792d c20792d = this.mAdapter;
            if (c20792d != null) {
                c20792d.notifyItemRemoved(iIndexOf);
            }
        }
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();
        m85619e1();
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        InterfaceC23704a interfaceC23704aM85598M0 = m85598M0();
        if (interfaceC23704aM85598M0 != null) {
            interfaceC23704aM85598M0.mo90391m(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p441gz.InterfaceC23705b
    public void onLogin(UserInfo user) {
        Intrinsics.m97802h(user, "user");
        ((C25741w0) getMViewBinding()).f78431b.setVisibility(8);
        C20792d c20792d = this.mAdapter;
        if (c20792d != null) {
            c20792d.mo36205p(m85599N0());
        }
        m85652y0(user);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p441gz.InterfaceC23705b
    public void onLogout() {
        ((C25741w0) getMViewBinding()).f78431b.setVisibility(0);
        this.mDataList.remove(m85599N0());
        this.mDataList.remove(m85595J0());
        C20792d c20792d = this.mAdapter;
        if (c20792d != null) {
            c20792d.notifyDataSetChanged();
        }
        onBackPressed();
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseMusicFloatActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m85651x0();
    }

    @Override // p441gz.InterfaceC23705b
    public void onUpdateUserInfo(UserInfo userInfo) {
        InterfaceC23705b.a.m93657c(this, userInfo);
    }
}
