package com.transsion.rewardscenter.task.dada;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.content.AbstractC2397b;
import aq.C4698a;
import com.cloud.config.utils.XLogUtil;
import com.cloud.tmc.component_api_ps.ipc.constants.MiniAppIpcConfig;
import com.cloud.tmc.integration.event.EventConstants;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.widget.R$color;
import com.transsion.push.PushConstants;
import com.transsion.rewardscenter.R$string;
import com.transsion.rewardscenter.task.p308ad.StageTaskProgressLayout;
import com.transsion.rewardscenter.utils.AbstractC18021p;
import com.transsion.rewardscenter.utils.C18020o;
import com.transsion.rewardscenterapi.MemberTaskItem;
import com.transsion.rewardscenterapi.TaskType;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.InterfaceC25149n0;
import ng.AbstractC26006c;
import org.mvel2.ast.ASTNode;
import p550kj.C24662i;
import p986zp.C29218g;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\fJF\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e2!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\n0\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 Ji\u0010&\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020!2'\b\u0002\u0010$\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\n\u0018\u00010\u00192%\b\u0002\u0010%\u001a\u001f\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\n\u0018\u00010\u0019H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\nH\u0002¢\u0006\u0004\b,\u0010\fJ\u001b\u0010.\u001a\u00020\n2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\nH\u0002¢\u0006\u0004\b0\u0010\fJ%\u00106\u001a\u00020\n2\b\u00102\u001a\u0004\u0018\u0001012\f\u00105\u001a\b\u0012\u0004\u0012\u00020403¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\n2\u0006\u00108\u001a\u00020\u000e¢\u0006\u0004\b9\u0010/J\r\u0010:\u001a\u00020\n¢\u0006\u0004\b:\u0010\fJ\r\u0010;\u001a\u00020\n¢\u0006\u0004\b;\u0010\fJ\r\u0010<\u001a\u00020\u001a¢\u0006\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010C\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR$\u0010N\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010R\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010I\u001a\u0004\bP\u0010K\"\u0004\bQ\u0010MR\u001b\u0010W\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001b\u0010Z\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010T\u001a\u0004\bY\u0010VR\u001b\u0010]\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010T\u001a\u0004\b\\\u0010VR\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020\u000e038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010b\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010?R\u0016\u0010f\u001a\u00020c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010e¨\u0006g"}, m97100d2 = {"Lcom/transsion/rewardscenter/task/dada/DadaActivateView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "x", "()V", "w", "", "getInstalledDadaPkgName", "()Ljava/lang/String;", "O", "L", "K", "v", "z", "E", "url", "packageName", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", NativeComponentConstants.KEY_COMPONENT_RESULT_SUCCESS, "callback", "M", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", EventConstants.KEY_TIME, NotificationCompat.CATEGORY_MESSAGE, "onFailure", "onSuccess", CampaignEx.JSON_KEY_AD_Q, "(JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/transsion/rewardscenter/task/dada/DadaTaskState;", "state", "setTaskState", "(Lcom/transsion/rewardscenter/task/dada/DadaTaskState;)V", "J", EventConstants.KEY_SOURCE, "H", "(Ljava/lang/String;)V", "G", "Laq/a;", XLogUtil.TAG, "", "Lcom/transsion/rewardscenterapi/MemberTaskItem;", "tasks", "setCtxConfig", "(Laq/a;Ljava/util/List;)V", "pkgName", "onPackageInstall", "onResume", PushConstants.PROVIDER_FIELD_DESTROY, "isCompleted", "()Z", "a", "Ljava/lang/String;", "moduleName", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Laq/a;", "ctxConfig", "Lcom/transsion/rewardscenter/task/dada/r;", "c", "Lcom/transsion/rewardscenter/task/dada/r;", "stageItem", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/rewardscenterapi/MemberTaskItem;", "getStage1stTaskInfo", "()Lcom/transsion/rewardscenterapi/MemberTaskItem;", "setStage1stTaskInfo", "(Lcom/transsion/rewardscenterapi/MemberTaskItem;)V", "stage1stTaskInfo", "e", "getStage2ndTaskInfo", "setStage2ndTaskInfo", "stage2ndTaskInfo", "f", "Lkotlin/Lazy;", "getColorNormal", "()I", "colorNormal", "g", "getColorDownloading", "colorDownloading", "h", "getColorCompleted", "colorCompleted", "i", "Ljava/util/List;", "pkgNameList", "j", "installedPkgName", "Lzp/g;", CampaignEx.JSON_KEY_AD_K, "Lzp/g;", "binding", "RewardsCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class DadaActivateView extends ConstraintLayout {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String moduleName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C4698a ctxConfig;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C17937r stageItem;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private MemberTaskItem stage1stTaskInfo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private MemberTaskItem stage2ndTaskInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Lazy colorNormal;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy colorDownloading;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Lazy colorCompleted;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final List pkgNameList;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String installedPkgName;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private C29218g binding;

    /* JADX INFO: renamed from: com.transsion.rewardscenter.task.dada.DadaActivateView$a */
    public /* synthetic */ class C17919a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f58858a;

        static {
            int[] iArr = new int[DadaTaskState.values().length];
            try {
                iArr[DadaTaskState.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DadaTaskState.DOWNLOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DadaTaskState.INSTALLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DadaTaskState.CLAIMED_STAGE1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DadaTaskState.SETTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DadaTaskState.SET_DEFAULT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DadaTaskState.COMPLETED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f58858a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DadaActivateView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DadaActivateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DadaActivateView(final Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.moduleName = "dada_keyboard";
        this.stageItem = new C17937r(null, 1, null);
        this.colorNormal = LazyKt.m97097b(new Function0() { // from class: com.transsion.rewardscenter.task.dada.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(DadaActivateView.m76417u(context));
            }
        });
        this.colorDownloading = LazyKt.m97097b(new Function0() { // from class: com.transsion.rewardscenter.task.dada.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(DadaActivateView.m76416t(context));
            }
        });
        this.colorCompleted = LazyKt.m97097b(new Function0() { // from class: com.transsion.rewardscenter.task.dada.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(DadaActivateView.m76415s(context));
            }
        });
        this.pkgNameList = CollectionsKt.m97509o("com.dada.inputmethod", "com.dada.inputmethod.tecno", "com.dada.inputmethod.itel", "com.dada.inputmethod.infinix");
        this.installedPkgName = "";
        C29218g c29218gM112098c = C29218g.m112098c(LayoutInflater.from(context), this, true);
        Intrinsics.m97801g(c29218gM112098c, "inflate(...)");
        this.binding = c29218gM112098c;
        m76420x();
        m76419w();
    }

    public /* synthetic */ DadaActivateView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final Unit m76389A(final DadaActivateView dadaActivateView, String str, boolean z11) {
        if (z11) {
            dadaActivateView.m76396H("ps");
        } else {
            C26866a.a.m104898f(C26866a.f81698a, "RewardsCenter", "Failed to open PalmPlay.", false, 4, null);
            m76402N(dadaActivateView, str, null, new Function1() { // from class: com.transsion.rewardscenter.task.dada.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DadaActivateView.m76390B(this.f58867a, ((Boolean) obj).booleanValue());
                }
            }, 2, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final Unit m76390B(DadaActivateView dadaActivateView, boolean z11) {
        if (z11) {
            dadaActivateView.m76396H("gp");
        } else {
            dadaActivateView.m76396H("fail");
            AbstractC18021p.m76643a(false, "Failed to open app store.");
            C26866a.a.m104898f(C26866a.f81698a, "RewardsCenter", "Failed to open Google Play.", false, 4, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final Unit m76391C(DadaActivateView dadaActivateView, String str) {
        String string = dadaActivateView.getContext().getString(R$string.dada_set_default_failed_tips);
        Intrinsics.m97801g(string, "getString(...)");
        AbstractC18021p.m76643a(false, string);
        dadaActivateView.stageItem.m76441b(DadaTaskState.CLAIMED_STAGE1);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final Unit m76392D(DadaActivateView dadaActivateView, boolean z11) {
        Integer rewardAmount;
        if (!z11) {
            Context context = dadaActivateView.getContext();
            int i11 = R$string.dada_set_default_tips;
            MemberTaskItem memberTaskItem = dadaActivateView.stage2ndTaskInfo;
            String string = context.getString(i11, Integer.valueOf((memberTaskItem == null || (rewardAmount = memberTaskItem.getRewardAmount()) == null) ? 10 : rewardAmount.intValue()));
            Intrinsics.m97801g(string, "getString(...)");
            AbstractC18021p.m76643a(false, string);
            dadaActivateView.stageItem.m76441b(DadaTaskState.CLAIMED_STAGE1);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: E */
    private final void m76393E() {
        if (StringsKt.m98160q0(getInstalledDadaPkgName())) {
            m76422z();
        } else {
            m76402N(this, "push://dada.com?action=openguide&utm_source=MBPoint", null, new Function1() { // from class: com.transsion.rewardscenter.task.dada.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DadaActivateView.m76394F(((Boolean) obj).booleanValue());
                }
            }, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final Unit m76394F(boolean z11) {
        if (!z11) {
            AbstractC18021p.m76643a(false, "Failed to open app.");
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: G */
    private final void m76395G() {
        HashMap map = new HashMap();
        map.put("module_name", this.moduleName);
        map.put("is_installed", "1");
        C24662i.f75350a.m96888z("broadcast", map, "rewards_center");
    }

    /* JADX INFO: renamed from: H */
    private final void m76396H(String source) {
        HashMap map = new HashMap();
        map.put("module_name", this.moduleName);
        map.put("ad_state", this.stageItem.m76440a().name());
        if (source != null) {
            map.put(EventConstants.KEY_SOURCE, source);
        }
        C24662i.f75350a.m96881p("rewards_center", map);
    }

    /* JADX INFO: renamed from: I */
    static /* synthetic */ void m76397I(DadaActivateView dadaActivateView, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        dadaActivateView.m76396H(str);
    }

    /* JADX INFO: renamed from: J */
    private final void m76398J() {
        HashMap map = new HashMap();
        map.put("module_name", "dada_keyboard");
        map.put("is_installed", !StringsKt.m98160q0(this.installedPkgName) ? "1" : "0");
        C24662i.f75350a.m96872D("rewards_center", map);
    }

    /* JADX INFO: renamed from: K */
    private final void m76399K() {
        AppCompatTextView appCompatTextView = this.binding.f89165b;
        switch (C17919a.f58858a[this.stageItem.m76440a().ordinal()]) {
            case 2:
                appCompatTextView.setText("Downloading...");
                appCompatTextView.setTextColor(getColorDownloading());
                break;
            case 3:
            case 6:
                appCompatTextView.setText("Claim");
                appCompatTextView.setTextColor(getColorNormal());
                break;
            case 4:
            case 5:
                appCompatTextView.setText(" Go ");
                appCompatTextView.setTextColor(getColorNormal());
                break;
            case 7:
                appCompatTextView.setText("Completed");
                appCompatTextView.setTextColor(getColorCompleted());
                break;
            default:
                appCompatTextView.setText("Get Now");
                appCompatTextView.setTextColor(getColorNormal());
                break;
        }
    }

    /* JADX INFO: renamed from: L */
    private final void m76400L() {
        StageTaskProgressLayout stageTaskProgressLayout = this.binding.f89167d;
        switch (C17919a.f58858a[this.stageItem.m76440a().ordinal()]) {
            case 1:
                stageTaskProgressLayout.reset();
                break;
            case 2:
                stageTaskProgressLayout.setFirstStageProgress(0);
                stageTaskProgressLayout.startFirstStageAnimation();
                break;
            case 3:
                stageTaskProgressLayout.stopFirstStageAnimation();
                stageTaskProgressLayout.setFirstStageProgress(100);
                break;
            case 4:
                stageTaskProgressLayout.setFirstStageProgress(100);
                StageTaskProgressLayout.setFirstStagePointIcon$default(stageTaskProgressLayout, false, 1, null);
                break;
            case 5:
                stageTaskProgressLayout.setFirstStageProgress(100);
                StageTaskProgressLayout.setFirstStagePointIcon$default(stageTaskProgressLayout, false, 1, null);
                stageTaskProgressLayout.setSecondStageProgress(0);
                break;
            case 6:
                stageTaskProgressLayout.setFirstStageProgress(100);
                stageTaskProgressLayout.setSecondStageProgress(100);
                StageTaskProgressLayout.setFirstStagePointIcon$default(stageTaskProgressLayout, false, 1, null);
                break;
            case 7:
                stageTaskProgressLayout.setFirstStageProgress(100);
                stageTaskProgressLayout.setSecondStageProgress(100);
                stageTaskProgressLayout.complete();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        MemberTaskItem memberTaskItem = this.stage1stTaskInfo;
        stageTaskProgressLayout.setFirstStagePoints("+" + (memberTaskItem != null ? memberTaskItem.getRewardAmount() : null));
        MemberTaskItem memberTaskItem2 = this.stage2ndTaskInfo;
        stageTaskProgressLayout.setSecondStagePoints("+" + (memberTaskItem2 != null ? memberTaskItem2.getRewardAmount() : null));
    }

    /* JADX INFO: renamed from: M */
    private final void m76401M(String url, String packageName, Function1 callback) {
        Object objM112707constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(url));
            if (packageName != null) {
                intent.setPackage(packageName);
            }
            intent.addFlags(ASTNode.DEOP);
            getContext().startActivity(intent);
            callback.invoke(Boolean.TRUE);
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.a.m104898f(C26866a.f81698a, "RewardsCenter", "--> Failed to open: " + thM112710exceptionOrNullimpl, false, 4, null);
            callback.invoke(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: N */
    static /* synthetic */ void m76402N(DadaActivateView dadaActivateView, String str, String str2, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        dadaActivateView.m76401M(str, str2, function1);
    }

    /* JADX INFO: renamed from: O */
    private final void m76403O() {
        m76400L();
        m76399K();
    }

    private final int getColorCompleted() {
        return ((Number) this.colorCompleted.getValue()).intValue();
    }

    private final int getColorDownloading() {
        return ((Number) this.colorDownloading.getValue()).intValue();
    }

    private final int getColorNormal() {
        return ((Number) this.colorNormal.getValue()).intValue();
    }

    private final String getInstalledDadaPkgName() {
        for (String str : this.pkgNameList) {
            C18020o c18020o = C18020o.f58998a;
            Context context = getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            if (c18020o.m76641a(context, str)) {
                return str;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: q */
    private final void m76413q(long time, Function1 onFailure, Function1 onSuccess) {
        InterfaceC25149n0 interfaceC25149n0M22755b;
        C4698a c4698a = this.ctxConfig;
        if (c4698a == null || (interfaceC25149n0M22755b = c4698a.m22755b()) == null) {
            return;
        }
        AbstractC25136k.m99058d(interfaceC25149n0M22755b, null, null, new DadaActivateView$checkSetDefault$1(this, time, onFailure, onSuccess, null), 3, null);
    }

    /* JADX INFO: renamed from: r */
    static /* synthetic */ void m76414r(DadaActivateView dadaActivateView, long j11, Function1 function1, Function1 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 2000;
        }
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        if ((i11 & 4) != 0) {
            function2 = null;
        }
        dadaActivateView.m76413q(j11, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final int m76415s(Context context) {
        return AbstractC2397b.getColor(context, R$color.white_50);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTaskState(DadaTaskState state) {
        this.stageItem.m76441b(state);
        m76403O();
        C17936q.f58876a.m76439e(this.installedPkgName, this.stageItem.m76440a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final int m76416t(Context context) {
        return AbstractC2397b.getColor(context, R$color.white_50);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final int m76417u(Context context) {
        return AbstractC2397b.getColor(context, R$color.white);
    }

    /* JADX INFO: renamed from: v */
    private final void m76418v() {
        InterfaceC25149n0 interfaceC25149n0M22755b;
        InterfaceC25149n0 interfaceC25149n0M22755b2;
        if (this.stageItem.m76440a() != DadaTaskState.NORMAL) {
            m76397I(this, null, 1, null);
        }
        switch (C17919a.f58858a[this.stageItem.m76440a().ordinal()]) {
            case 1:
                m76422z();
                this.stageItem.m76441b(DadaTaskState.DOWNLOADING);
                m76403O();
                return;
            case 2:
            case 5:
            case 7:
                return;
            case 3:
                C4698a c4698a = this.ctxConfig;
                if (c4698a == null || (interfaceC25149n0M22755b = c4698a.m22755b()) == null) {
                    return;
                }
                AbstractC25136k.m99058d(interfaceC25149n0M22755b, null, null, new DadaActivateView$handleActionClick$1(this, null), 3, null);
                return;
            case 4:
                m76393E();
                this.stageItem.m76441b(DadaTaskState.SETTING);
                m76403O();
                return;
            case 6:
                C4698a c4698a2 = this.ctxConfig;
                if (c4698a2 == null || (interfaceC25149n0M22755b2 = c4698a2.m22755b()) == null) {
                    return;
                }
                AbstractC25136k.m99058d(interfaceC25149n0M22755b2, null, null, new DadaActivateView$handleActionClick$2(this, null), 3, null);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: w */
    private final void m76419w() {
        C17937r c17937r = this.stageItem;
        DadaTaskState dadaTaskStateM76438c = C17936q.f58876a.m76438c(this.pkgNameList);
        if (dadaTaskStateM76438c == null) {
            dadaTaskStateM76438c = DadaTaskState.NORMAL;
        }
        c17937r.m76441b(dadaTaskStateM76438c);
        C26866a.a.m104898f(C26866a.f81698a, "RewardsCenter", "check DaDa task state, taskState = " + this.stageItem, false, 4, null);
        this.installedPkgName = getInstalledDadaPkgName();
        if ((this.stageItem.m76440a() == DadaTaskState.NORMAL || this.stageItem.m76440a() == DadaTaskState.DOWNLOADING) && !StringsKt.m98160q0(this.installedPkgName)) {
            setTaskState(DadaTaskState.INSTALLED);
        }
        m76398J();
    }

    /* JADX INFO: renamed from: x */
    private final void m76420x() {
        StageTaskProgressLayout stageTaskProgressLayout = this.binding.f89167d;
        String string = getResources().getString(R$string.dada_first_stage);
        Intrinsics.m97801g(string, "getString(...)");
        stageTaskProgressLayout.setFirstStageText(string);
        StageTaskProgressLayout stageTaskProgressLayout2 = this.binding.f89167d;
        String string2 = getResources().getString(R$string.dada_second_stage);
        Intrinsics.m97801g(string2, "getString(...)");
        stageTaskProgressLayout2.setSecondStageText(string2);
        AppCompatTextView btnAction = this.binding.f89165b;
        Intrinsics.m97801g(btnAction, "btnAction");
        AbstractC26006c.m102050c(btnAction, 0L, new Function1() { // from class: com.transsion.rewardscenter.task.dada.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DadaActivateView.m76421y(this.f58864a, (View) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final Unit m76421y(DadaActivateView dadaActivateView, View it) {
        Intrinsics.m97802h(it, "it");
        dadaActivateView.m76418v();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: z */
    private final void m76422z() {
        final String str = "https://play.google.com/store/apps/details?id=com.dada.inputmethod&referrer=MBPoint";
        m76401M("palmplay://thirdlauncher.com/?entryType=AppDetail&packageName=com.dada.inputmethod&_source=CrossPro_MBPonit_dada&referrer=CrossPro_MBPoint_dada", MiniAppIpcConfig.PALM_STORE_PACKAGE_NAME, new Function1() { // from class: com.transsion.rewardscenter.task.dada.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DadaActivateView.m76389A(this.f58865a, str, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final void destroy() {
        this.binding.f89167d.stopFirstStageAnimation();
        this.ctxConfig = null;
    }

    public final MemberTaskItem getStage1stTaskInfo() {
        return this.stage1stTaskInfo;
    }

    public final MemberTaskItem getStage2ndTaskInfo() {
        return this.stage2ndTaskInfo;
    }

    public final boolean isCompleted() {
        return this.stageItem.m76440a() == DadaTaskState.COMPLETED;
    }

    public final void onPackageInstall(String pkgName) {
        Intrinsics.m97802h(pkgName, "pkgName");
        if (this.pkgNameList.contains(pkgName)) {
            this.installedPkgName = pkgName;
            if (this.stageItem.m76440a() == DadaTaskState.NORMAL || this.stageItem.m76440a() == DadaTaskState.DOWNLOADING) {
                setTaskState(DadaTaskState.INSTALLED);
                m76395G();
            }
        }
    }

    public final void onResume() {
        if (this.stageItem.m76440a() == DadaTaskState.SETTING) {
            m76414r(this, 0L, new Function1() { // from class: com.transsion.rewardscenter.task.dada.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DadaActivateView.m76391C(this.f58862a, (String) obj);
                }
            }, new Function1() { // from class: com.transsion.rewardscenter.task.dada.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DadaActivateView.m76392D(this.f58863a, ((Boolean) obj).booleanValue());
                }
            }, 1, null);
        }
    }

    public final void setCtxConfig(C4698a config, List<MemberTaskItem> tasks) {
        Object obj;
        Object next;
        Intrinsics.m97802h(tasks, "tasks");
        this.ctxConfig = config;
        List<MemberTaskItem> list = tasks;
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer taskSubType = ((MemberTaskItem) next).getTaskSubType();
            int value = TaskType.DADA_STAGE_1ST.getValue();
            if (taskSubType != null && taskSubType.intValue() == value) {
                break;
            }
        }
        this.stage1stTaskInfo = (MemberTaskItem) next;
        for (Object obj2 : list) {
            Integer taskSubType2 = ((MemberTaskItem) obj2).getTaskSubType();
            int value2 = TaskType.DADA_STAGE_2ND.getValue();
            if (taskSubType2 != null && taskSubType2.intValue() == value2) {
                obj = obj2;
                break;
            }
        }
        this.stage2ndTaskInfo = (MemberTaskItem) obj;
        if (this.stageItem.m76440a() == DadaTaskState.CLAIMED_STAGE1) {
            m76414r(this, 0L, null, null, 6, null);
        }
        C26866a.a.m104898f(C26866a.f81698a, "RewardsCenter", "---> setCtxConfig state:" + this.stageItem.m76440a(), false, 4, null);
        m76403O();
    }

    public final void setStage1stTaskInfo(MemberTaskItem memberTaskItem) {
        this.stage1stTaskInfo = memberTaskItem;
    }

    public final void setStage2ndTaskInfo(MemberTaskItem memberTaskItem) {
        this.stage2ndTaskInfo = memberTaskItem;
    }
}
