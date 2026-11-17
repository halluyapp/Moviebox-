package com.transsion.rewardscenter.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import aq.C4698a;
import com.cloud.config.utils.XLogUtil;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.push.PushConstants;
import com.transsion.rewardscenter.model.RewardsCenterModel;
import com.transsion.rewardscenter.p309ui.RewardsCenterFragment;
import com.transsion.rewardscenter.task.dada.DadaActivateView;
import com.transsion.rewardscenter.task.member.MemberTaskView;
import com.transsion.rewardscenter.task.p308ad.BaseStageTaskAdHelper;
import com.transsion.rewardscenter.task.p308ad.C17913u;
import com.transsion.rewardscenter.task.p308ad.MemberTaskAdView;
import com.transsion.rewardscenter.view.RewardsCenterTaskView;
import com.transsion.rewardscenterapi.MemberTaskItem;
import com.transsion.rewardscenterapi.Task;
import com.transsion.rewardscenterapi.TaskGroup;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p986zp.C29220i;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001;\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010&R\u0018\u0010.\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, m97100d2 = {"Lcom/transsion/rewardscenter/view/RewardsCenterTaskView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Laq/a;", XLogUtil.TAG, "", "setCtxConfig", "(Laq/a;)V", "Lcom/transsion/rewardscenterapi/Task;", "data", "setTaskData", "(Lcom/transsion/rewardscenterapi/Task;)V", "scrollToSelf", "()V", "onResume", "onPause", PushConstants.PROVIDER_FIELD_DESTROY, "", "pkgName", "onPackageInstall", "(Ljava/lang/String;)V", "Lzp/i;", "a", "Lzp/i;", "binding", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/rewardscenterapi/Task;", "taskData", "", "Lcom/transsion/rewardscenterapi/MemberTaskItem;", "c", "Ljava/util/List;", "dadaTask", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "adTask", "e", "memberTask", "f", "Laq/a;", "ctxConfig", "Lcom/transsion/rewardscenter/task/dada/DadaActivateView;", "g", "Lcom/transsion/rewardscenter/task/dada/DadaActivateView;", "dadaView", "Lcom/transsion/rewardscenter/task/ad/MemberTaskAdView;", "h", "Lcom/transsion/rewardscenter/task/ad/MemberTaskAdView;", "adTaskView", "Lcom/transsion/rewardscenter/task/member/MemberTaskView;", "i", "Lcom/transsion/rewardscenter/task/member/MemberTaskView;", "memberTaskView", "com/transsion/rewardscenter/view/RewardsCenterTaskView$a", "j", "Lcom/transsion/rewardscenter/view/RewardsCenterTaskView$a;", "claimListener", "RewardsCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class RewardsCenterTaskView extends ConstraintLayout {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C29220i binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Task taskData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private List dadaTask;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private List adTask;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private List memberTask;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private C4698a ctxConfig;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private DadaActivateView dadaView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private MemberTaskAdView adTaskView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private MemberTaskView memberTaskView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C18024a claimListener;

    /* JADX INFO: renamed from: com.transsion.rewardscenter.view.RewardsCenterTaskView$a */
    public static final class C18024a implements BaseStageTaskAdHelper.InterfaceC17880a {
        C18024a() {
        }

        @Override // com.transsion.rewardscenter.task.p308ad.BaseStageTaskAdHelper.InterfaceC17880a
        /* JADX INFO: renamed from: a */
        public void mo76223a(Integer num) {
            WeakReference weakReferenceM22754a;
            RewardsCenterFragment rewardsCenterFragment;
            RewardsCenterModel rewardsCenterModelM22756c;
            if (num != null) {
                RewardsCenterTaskView rewardsCenterTaskView = RewardsCenterTaskView.this;
                int iIntValue = num.intValue();
                C4698a c4698a = rewardsCenterTaskView.ctxConfig;
                if (c4698a != null && (rewardsCenterModelM22756c = c4698a.m22756c()) != null) {
                    rewardsCenterModelM22756c.m76108C(iIntValue);
                }
            }
            C4698a c4698a2 = RewardsCenterTaskView.this.ctxConfig;
            if (c4698a2 == null || (weakReferenceM22754a = c4698a2.m22754a()) == null || (rewardsCenterFragment = (RewardsCenterFragment) weakReferenceM22754a.get()) == null) {
                return;
            }
            rewardsCenterFragment.m76594P0();
        }

        @Override // com.transsion.rewardscenter.task.p308ad.BaseStageTaskAdHelper.InterfaceC17880a
        /* JADX INFO: renamed from: b */
        public void mo76224b() {
            WeakReference weakReferenceM22754a;
            RewardsCenterFragment rewardsCenterFragment;
            C4698a c4698a = RewardsCenterTaskView.this.ctxConfig;
            if (c4698a == null || (weakReferenceM22754a = c4698a.m22754a()) == null || (rewardsCenterFragment = (RewardsCenterFragment) weakReferenceM22754a.get()) == null) {
                return;
            }
            rewardsCenterFragment.m76594P0();
        }

        @Override // com.transsion.rewardscenter.task.p308ad.BaseStageTaskAdHelper.InterfaceC17880a
        public void start() {
            WeakReference weakReferenceM22754a;
            RewardsCenterFragment rewardsCenterFragment;
            C4698a c4698a = RewardsCenterTaskView.this.ctxConfig;
            if (c4698a == null || (weakReferenceM22754a = c4698a.m22754a()) == null || (rewardsCenterFragment = (RewardsCenterFragment) weakReferenceM22754a.get()) == null) {
                return;
            }
            rewardsCenterFragment.showLoading();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RewardsCenterTaskView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RewardsCenterTaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RewardsCenterTaskView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.binding = C29220i.m112103c(LayoutInflater.from(context), this, true);
        this.adTaskView = new MemberTaskAdView(context, null, 0, 6, null);
        this.memberTaskView = new MemberTaskView(context, null, 0, 6, null);
        this.claimListener = new C18024a();
    }

    public /* synthetic */ RewardsCenterTaskView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m76660i(RewardsCenterTaskView rewardsCenterTaskView) {
        Object parent = rewardsCenterTaskView.getParent();
        while (parent != null) {
            if (parent instanceof NestedScrollView) {
                Rect rect = new Rect();
                rewardsCenterTaskView.getDrawingRect(rect);
                NestedScrollView nestedScrollView = (NestedScrollView) parent;
                nestedScrollView.offsetDescendantRectToMyCoords(rewardsCenterTaskView, rect);
                nestedScrollView.smoothScrollTo(0, Math.max(0, rect.top - ((int) (8 * rewardsCenterTaskView.getResources().getDisplayMetrics().density))));
                return;
            }
            View view = parent instanceof View ? (View) parent : null;
            parent = view != null ? view.getParent() : null;
        }
    }

    public final void destroy() {
        DadaActivateView dadaActivateView = this.dadaView;
        if (dadaActivateView != null) {
            dadaActivateView.destroy();
        }
        MemberTaskAdView memberTaskAdView = this.adTaskView;
        if (memberTaskAdView != null) {
            memberTaskAdView.setClaimListener(null);
        }
        MemberTaskAdView memberTaskAdView2 = this.adTaskView;
        if (memberTaskAdView2 != null) {
            memberTaskAdView2.destroy();
        }
        MemberTaskView memberTaskView = this.memberTaskView;
        if (memberTaskView != null) {
            memberTaskView.destroy();
        }
        this.ctxConfig = null;
    }

    public final void onPackageInstall(String pkgName) {
        if (pkgName != null) {
            DadaActivateView dadaActivateView = this.dadaView;
            if (dadaActivateView != null) {
                dadaActivateView.onPackageInstall(pkgName);
            }
            MemberTaskAdView memberTaskAdView = this.adTaskView;
            if (memberTaskAdView != null) {
                memberTaskAdView.onPackageInstall(pkgName);
            }
        }
    }

    public final void onPause() {
        MemberTaskAdView memberTaskAdView = this.adTaskView;
        if (memberTaskAdView != null) {
            memberTaskAdView.onPause();
        }
    }

    public final void onResume() {
        DadaActivateView dadaActivateView = this.dadaView;
        if (dadaActivateView != null) {
            dadaActivateView.onResume();
        }
        MemberTaskAdView memberTaskAdView = this.adTaskView;
        if (memberTaskAdView != null) {
            memberTaskAdView.onResume();
        }
        MemberTaskView memberTaskView = this.memberTaskView;
        if (memberTaskView != null) {
            memberTaskView.onResume();
        }
    }

    public final void scrollToSelf() {
        post(new Runnable() { // from class: bq.d
            @Override // java.lang.Runnable
            public final void run() {
                RewardsCenterTaskView.m76660i(this.f17260a);
            }
        });
    }

    public final void setCtxConfig(C4698a config) {
        Intrinsics.m97802h(config, "config");
        this.ctxConfig = config;
        if (config != null) {
            MemberTaskAdView memberTaskAdView = this.adTaskView;
            if (memberTaskAdView != null) {
                memberTaskAdView.setCtxConfig(config);
            }
            MemberTaskView memberTaskView = this.memberTaskView;
            if (memberTaskView != null) {
                memberTaskView.setCtxConfig(config);
            }
        }
    }

    public final void setTaskData(Task data) {
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        List<TaskGroup> taskGroups;
        LinearLayoutCompat linearLayoutCompat3;
        this.taskData = data;
        C29220i c29220i = this.binding;
        if (c29220i != null && (linearLayoutCompat3 = c29220i.f89178c) != null) {
            linearLayoutCompat3.removeAllViews();
        }
        this.dadaView = null;
        ArrayList arrayList = new ArrayList();
        if (data != null && (taskGroups = data.getTaskGroups()) != null) {
            for (TaskGroup taskGroup : taskGroups) {
                String groupType = taskGroup.getGroupType();
                if (groupType != null) {
                    int iHashCode = groupType.hashCode();
                    if (iHashCode != 116765) {
                        if (iHashCode != 3075514) {
                            if (iHashCode == 106845584 && groupType.equals("point")) {
                                List<MemberTaskItem> tasks = taskGroup.getTasks();
                                this.adTask = tasks;
                                if (tasks != null) {
                                    C17913u.f58813a.m76349r(tasks);
                                    MemberTaskAdView memberTaskAdView = this.adTaskView;
                                    if (memberTaskAdView != null) {
                                        memberTaskAdView.setClaimListener(this.claimListener);
                                    }
                                    MemberTaskAdView memberTaskAdView2 = this.adTaskView;
                                    if (memberTaskAdView2 != null) {
                                        arrayList.add(memberTaskAdView2);
                                    }
                                }
                            }
                        } else if (groupType.equals("dada")) {
                            List<MemberTaskItem> tasks2 = taskGroup.getTasks();
                            this.dadaTask = tasks2;
                            if (tasks2 != null && !tasks2.isEmpty()) {
                                Context context = getContext();
                                Intrinsics.m97801g(context, "getContext(...)");
                                DadaActivateView dadaActivateView = new DadaActivateView(context, null, 0, 6, null);
                                dadaActivateView.setCtxConfig(this.ctxConfig, tasks2);
                                this.dadaView = dadaActivateView;
                                if (dadaActivateView.isCompleted()) {
                                    C26866a.a.m104898f(C26866a.f81698a, "RewardsCenter", "---> dada task completed", false, 4, null);
                                } else {
                                    DadaActivateView dadaActivateView2 = this.dadaView;
                                    if (dadaActivateView2 != null) {
                                        arrayList.add(dadaActivateView2);
                                    }
                                }
                            }
                        }
                    } else if (groupType.equals("vip")) {
                        List<MemberTaskItem> tasks3 = taskGroup.getTasks();
                        this.memberTask = tasks3;
                        if (tasks3 != null) {
                            MemberTaskView memberTaskView = this.memberTaskView;
                            if (memberTaskView != null) {
                                memberTaskView.setTaskData(tasks3);
                            }
                            MemberTaskView memberTaskView2 = this.memberTaskView;
                            if (memberTaskView2 != null) {
                                arrayList.add(memberTaskView2);
                            }
                        }
                    }
                }
            }
        }
        int i11 = 0;
        for (Object obj : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            View view = (View) obj;
            C29220i c29220i2 = this.binding;
            if (c29220i2 != null && (linearLayoutCompat2 = c29220i2.f89178c) != null) {
                linearLayoutCompat2.addView(view);
            }
            if (i11 < arrayList.size() - 1) {
                View view2 = new View(getContext());
                view2.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
                view2.setBackgroundColor(Color.parseColor("#0F000000"));
                C29220i c29220i3 = this.binding;
                if (c29220i3 != null && (linearLayoutCompat = c29220i3.f89178c) != null) {
                    linearLayoutCompat.addView(view2);
                }
            }
            i11 = i12;
        }
    }
}
