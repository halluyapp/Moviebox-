package com.transsion.rewardscenter.task.p308ad;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.AbstractC2397b;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.widget.R$color;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import com.transsion.push.PushConstants;
import com.transsion.rewardscenterapi.MemberTaskItem;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import ng.AbstractC26006c;
import p986zp.C29223l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J!\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001e\u0010\u0010J0\u0010#\u001a\u00020\n2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\n0\u001f¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020%¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\n¢\u0006\u0004\b+\u0010\fR\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R3\u00104\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\n\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010<\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001b\u0010?\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010;R\u001b\u0010B\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u00109\u001a\u0004\bA\u0010;¨\u0006C"}, m97100d2 = {"Lcom/transsion/rewardscenter/task/ad/StageTaskAdView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "x", "()V", "Lcom/transsion/rewardscenter/task/ad/v$c;", WebConstants.FIELD_ITEM, "n", "(Lcom/transsion/rewardscenter/task/ad/v$c;)V", "setProgress", "setBtnAction", CampaignEx.JSON_KEY_AD_R, TmcStartParams.KEY_URL_SHORT, "Lcom/transsion/rewardscenter/task/ad/AdTaskState;", "adTaskState", "v", "(Lcom/transsion/rewardscenter/task/ad/v$c;Lcom/transsion/rewardscenter/task/ad/AdTaskState;)V", "Lcom/transsion/rewardscenter/task/ad/BaseStageTaskAdHelper;", "helper", "setAdHelper", "(Lcom/transsion/rewardscenter/task/ad/BaseStageTaskAdHelper;)V", "stageItem", "setData", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "callback", "setClickCallback", "(Lkotlin/jvm/functions/Function1;)V", "", "skipAd", "updateUI", "(Z)V", "isBind", "()Z", PushConstants.PROVIDER_FIELD_DESTROY, "Lzp/l;", "a", "Lzp/l;", "binding", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/rewardscenter/task/ad/v$c;", "c", "Lkotlin/jvm/functions/Function1;", "clickCallback", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/rewardscenter/task/ad/BaseStageTaskAdHelper;", "adHelper", "e", "Lkotlin/Lazy;", "getColorNormal", "()I", "colorNormal", "f", "getColorDownloading", "colorDownloading", "g", "getColorCompleted", "colorCompleted", "RewardsCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class StageTaskAdView extends ConstraintLayout {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C29223l binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private AbstractC17914v.c stageItem;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Function1 clickCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private BaseStageTaskAdHelper adHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Lazy colorNormal;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Lazy colorDownloading;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy colorCompleted;

    /* JADX INFO: renamed from: com.transsion.rewardscenter.task.ad.StageTaskAdView$a */
    public /* synthetic */ class C17885a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f58755a;

        static {
            int[] iArr = new int[AdTaskState.values().length];
            try {
                iArr[AdTaskState.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdTaskState.DOWNLOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdTaskState.INSTALLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdTaskState.CLAIMED_STAGE1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdTaskState.PLAYING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdTaskState.PLAYED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AdTaskState.COMPLETED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f58755a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StageTaskAdView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StageTaskAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StageTaskAdView(final Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.colorNormal = LazyKt.m97097b(new Function0() { // from class: com.transsion.rewardscenter.task.ad.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(StageTaskAdView.m76287q(context));
            }
        });
        this.colorDownloading = LazyKt.m97097b(new Function0() { // from class: com.transsion.rewardscenter.task.ad.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(StageTaskAdView.m76286p(context));
            }
        });
        this.colorCompleted = LazyKt.m97097b(new Function0() { // from class: com.transsion.rewardscenter.task.ad.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(StageTaskAdView.m76285o(context));
            }
        });
        this.binding = C29223l.m112112c(LayoutInflater.from(context), this, true);
        m76294x();
    }

    public /* synthetic */ StageTaskAdView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
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

    /* JADX INFO: renamed from: n */
    private final void m76284n(AbstractC17914v.c item) {
        BaseStageTaskAdHelper baseStageTaskAdHelper = this.adHelper;
        if (baseStageTaskAdHelper != null) {
            baseStageTaskAdHelper.mo76199c(item);
        }
        NativeWrapperAdView nativeWrapperAdViewM76378h = item.m76378h();
        if (nativeWrapperAdViewM76378h != null) {
            ViewParent parent = nativeWrapperAdViewM76378h.getParent();
            C29223l c29223l = null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(nativeWrapperAdViewM76378h);
            }
            C29223l c29223l2 = this.binding;
            if (c29223l2 == null) {
                Intrinsics.m97819y("binding");
                c29223l2 = null;
            }
            c29223l2.f89195b.removeAllViews();
            C29223l c29223l3 = this.binding;
            if (c29223l3 == null) {
                Intrinsics.m97819y("binding");
            } else {
                c29223l = c29223l3;
            }
            c29223l.f89195b.addView(nativeWrapperAdViewM76378h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final int m76285o(Context context) {
        return AbstractC2397b.getColor(context, R$color.white_30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final int m76286p(Context context) {
        return AbstractC2397b.getColor(context, R$color.white_50);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final int m76287q(Context context) {
        return AbstractC2397b.getColor(context, R$color.white);
    }

    /* JADX INFO: renamed from: r */
    private final void m76288r(final AbstractC17914v.c item) {
        Function1 function1 = this.clickCallback;
        if (function1 != null) {
            function1.invoke(item);
        }
        switch (C17885a.f58755a[item.m76375e().ordinal()]) {
            case 1:
                item.m76383m(AdTaskState.DOWNLOADING);
                item.m76385o(System.currentTimeMillis());
                m76291u(item);
                updateUI(true);
                m76293w(this, item, null, 2, null);
                return;
            case 2:
            case 7:
                return;
            case 3:
                BaseStageTaskAdHelper baseStageTaskAdHelper = this.adHelper;
                if (baseStageTaskAdHelper != null) {
                    baseStageTaskAdHelper.m76222z(item, new Function0() { // from class: com.transsion.rewardscenter.task.ad.b0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return StageTaskAdView.m76289s(item, this);
                        }
                    });
                    return;
                }
                return;
            case 4:
                item.m76383m(AdTaskState.PLAYING);
                m76291u(item);
                updateUI(true);
                m76293w(this, item, null, 2, null);
                return;
            case 5:
                m76291u(item);
                return;
            case 6:
                BaseStageTaskAdHelper baseStageTaskAdHelper2 = this.adHelper;
                if (baseStageTaskAdHelper2 != null) {
                    baseStageTaskAdHelper2.m76222z(item, new Function0() { // from class: com.transsion.rewardscenter.task.ad.c0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return StageTaskAdView.m76290t(item, this);
                        }
                    });
                    return;
                }
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final Unit m76289s(AbstractC17914v.c cVar, StageTaskAdView stageTaskAdView) {
        cVar.m76383m(AdTaskState.CLAIMED_STAGE1);
        stageTaskAdView.updateUI(true);
        m76293w(stageTaskAdView, cVar, null, 2, null);
        return Unit.f75682a;
    }

    private final void setBtnAction(AbstractC17914v.c item) {
        C29223l c29223l = this.binding;
        if (c29223l == null) {
            Intrinsics.m97819y("binding");
            c29223l = null;
        }
        AppCompatTextView appCompatTextView = c29223l.f89197d;
        int i11 = C17885a.f58755a[item.m76375e().ordinal()];
        if (i11 == 2) {
            appCompatTextView.setText("Downloading...");
            appCompatTextView.setTextColor(getColorDownloading());
            return;
        }
        if (i11 == 3 || i11 == 6) {
            appCompatTextView.setText("Claim");
            appCompatTextView.setTextColor(getColorNormal());
        } else if (i11 != 7) {
            appCompatTextView.setText("Get Now");
            appCompatTextView.setTextColor(getColorNormal());
        } else {
            appCompatTextView.setText("Completed");
            appCompatTextView.setTextColor(getColorCompleted());
        }
    }

    private final void setProgress(AbstractC17914v.c item) {
        long jM76201e;
        C29223l c29223l = this.binding;
        if (c29223l == null) {
            Intrinsics.m97819y("binding");
            c29223l = null;
        }
        StageTaskProgressLayout stageTaskProgressLayout = c29223l.f89198e;
        switch (C17885a.f58755a[item.m76375e().ordinal()]) {
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
                if (item.m76380j() > 0) {
                    BaseStageTaskAdHelper baseStageTaskAdHelper = this.adHelper;
                    jM76201e = baseStageTaskAdHelper != null ? baseStageTaskAdHelper.m76201e(item.m76373c().getSceneId()) : 30000L;
                    stageTaskProgressLayout.setSecondStageProgress((int) ((item.m76380j() < jM76201e ? RangesKt.m97941k(item.m76380j() / jM76201e, 0.0f, 1.0f) : 1.0f) * 100));
                } else {
                    stageTaskProgressLayout.setSecondStageProgress(0);
                }
                StageTaskProgressLayout.setFirstStagePointIcon$default(stageTaskProgressLayout, false, 1, null);
                break;
            case 5:
                stageTaskProgressLayout.setFirstStageProgress(100);
                StageTaskProgressLayout.setFirstStagePointIcon$default(stageTaskProgressLayout, false, 1, null);
                BaseStageTaskAdHelper baseStageTaskAdHelper2 = this.adHelper;
                jM76201e = baseStageTaskAdHelper2 != null ? baseStageTaskAdHelper2.m76201e(item.m76373c().getSceneId()) : 30000L;
                stageTaskProgressLayout.setSecondStageProgress((int) ((item.m76380j() < jM76201e ? RangesKt.m97941k(item.m76380j() / jM76201e, 0.0f, 1.0f) : 1.0f) * 100));
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
        C17913u c17913u = C17913u.f58813a;
        MemberTaskItem memberTaskItemM76342j = c17913u.m76342j();
        stageTaskProgressLayout.setFirstStagePoints("+" + (memberTaskItemM76342j != null ? memberTaskItemM76342j.getRewardAmount() : null));
        MemberTaskItem memberTaskItemM76343k = c17913u.m76343k();
        stageTaskProgressLayout.setSecondStagePoints("+" + (memberTaskItemM76343k != null ? memberTaskItemM76343k.getRewardAmount() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final Unit m76290t(AbstractC17914v.c cVar, StageTaskAdView stageTaskAdView) {
        cVar.m76383m(AdTaskState.COMPLETED);
        stageTaskAdView.updateUI(true);
        m76293w(stageTaskAdView, cVar, null, 2, null);
        BaseStageTaskAdHelper baseStageTaskAdHelper = stageTaskAdView.adHelper;
        if (baseStageTaskAdHelper != null) {
            String strM76379i = cVar.m76379i();
            BaseStageTaskAdHelper baseStageTaskAdHelper2 = stageTaskAdView.adHelper;
            baseStageTaskAdHelper.m76221y(strM76379i, baseStageTaskAdHelper2 != null ? Integer.valueOf(baseStageTaskAdHelper2.m76213q(cVar.m76373c().getSceneId())) : null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: u */
    private final void m76291u(AbstractC17914v.c item) {
        NativeWrapperAdView nativeWrapperAdViewM76378h = item.m76378h();
        if (nativeWrapperAdViewM76378h != null) {
            nativeWrapperAdViewM76378h.simulatingClick(item.m76373c(), item.m76374d(), item.m76381k());
        }
    }

    public static /* synthetic */ void updateUI$default(StageTaskAdView stageTaskAdView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        stageTaskAdView.updateUI(z11);
    }

    /* JADX INFO: renamed from: v */
    private final void m76292v(AbstractC17914v.c item, AdTaskState adTaskState) {
        C17913u.f58813a.m76353v(item.m76379i(), adTaskState);
    }

    /* JADX INFO: renamed from: w */
    static /* synthetic */ void m76293w(StageTaskAdView stageTaskAdView, AbstractC17914v.c cVar, AdTaskState adTaskState, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            adTaskState = cVar.m76375e();
        }
        stageTaskAdView.m76292v(cVar, adTaskState);
    }

    /* JADX INFO: renamed from: x */
    private final void m76294x() {
        C29223l c29223l = this.binding;
        if (c29223l == null) {
            Intrinsics.m97819y("binding");
            c29223l = null;
        }
        AppCompatTextView btnAction = c29223l.f89197d;
        Intrinsics.m97801g(btnAction, "btnAction");
        AbstractC26006c.m102050c(btnAction, 0L, new Function1() { // from class: com.transsion.rewardscenter.task.ad.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StageTaskAdView.m76295y(this.f58764a, (View) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final Unit m76295y(StageTaskAdView stageTaskAdView, View it) {
        Intrinsics.m97802h(it, "it");
        AbstractC17914v.c cVar = stageTaskAdView.stageItem;
        if (cVar != null) {
            stageTaskAdView.m76288r(cVar);
        }
        return Unit.f75682a;
    }

    public final void destroy() {
        C29223l c29223l = this.binding;
        if (c29223l == null) {
            Intrinsics.m97819y("binding");
            c29223l = null;
        }
        c29223l.f89198e.stopFirstStageAnimation();
        this.stageItem = null;
        this.adHelper = null;
    }

    public final boolean isBind() {
        return this.stageItem != null;
    }

    public final void setAdHelper(BaseStageTaskAdHelper helper) {
        this.adHelper = helper;
    }

    public final void setClickCallback(Function1<? super AbstractC17914v.c, Unit> callback) {
        Intrinsics.m97802h(callback, "callback");
        this.clickCallback = callback;
    }

    public final void setData(AbstractC17914v.c stageItem) {
        this.stageItem = stageItem;
        if (stageItem != null) {
            updateUI$default(this, false, 1, null);
        }
    }

    public final void updateUI(boolean skipAd) {
        AbstractC17914v.c cVar = this.stageItem;
        if (cVar != null) {
            if (!skipAd) {
                m76284n(cVar);
            }
            setProgress(cVar);
            setBtnAction(cVar);
        }
    }
}
