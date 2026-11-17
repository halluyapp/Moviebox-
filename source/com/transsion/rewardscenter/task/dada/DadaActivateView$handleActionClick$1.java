package com.transsion.rewardscenter.task.dada;

import android.content.Context;
import aq.C4698a;
import com.transsion.rewardscenter.R$string;
import com.transsion.rewardscenter.model.RewardsCenterModel;
import com.transsion.rewardscenter.utils.AbstractC18021p;
import com.transsion.rewardscenter.utils.RewardsCenterApiHelper;
import com.transsion.rewardscenterapi.MemberTaskItem;
import com.transsion.rewardscenterapi.TaskRewards;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.rewardscenter.task.dada.DadaActivateView$handleActionClick$1", m97637f = "DaDaActivateView.kt", m97638l = {251}, m97639m = "invokeSuspend")
final class DadaActivateView$handleActionClick$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ DadaActivateView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DadaActivateView$handleActionClick$1(DadaActivateView dadaActivateView, Continuation<? super DadaActivateView$handleActionClick$1> continuation) {
        super(2, continuation);
        this.this$0 = dadaActivateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Unit m76429g(DadaActivateView dadaActivateView, String str, String str2) {
        if (str2 == null) {
            str2 = dadaActivateView.getContext().getString(R$string.claim_failed);
            Intrinsics.m97801g(str2, "getString(...)");
        }
        AbstractC18021p.m76643a(false, str2);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Unit m76430h(DadaActivateView dadaActivateView, TaskRewards taskRewards) {
        Integer rewardAmount;
        Integer currentPoint;
        RewardsCenterModel rewardsCenterModelM22756c;
        dadaActivateView.setTaskState(DadaTaskState.CLAIMED_STAGE1);
        if (taskRewards != null && (currentPoint = taskRewards.getCurrentPoint()) != null) {
            int iIntValue = currentPoint.intValue();
            C4698a c4698a = dadaActivateView.ctxConfig;
            if (c4698a != null && (rewardsCenterModelM22756c = c4698a.m22756c()) != null) {
                rewardsCenterModelM22756c.m76108C(iIntValue);
            }
        }
        Context context = dadaActivateView.getContext();
        int i11 = R$string.claim_points_receive_tips;
        MemberTaskItem stage1stTaskInfo = dadaActivateView.getStage1stTaskInfo();
        String string = context.getString(i11, Integer.valueOf((stage1stTaskInfo == null || (rewardAmount = stage1stTaskInfo.getRewardAmount()) == null) ? 3 : rewardAmount.intValue()));
        Intrinsics.m97801g(string, "getString(...)");
        AbstractC18021p.m76643a(true, string);
        return Unit.f75682a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DadaActivateView$handleActionClick$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((DadaActivateView$handleActionClick$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            RewardsCenterApiHelper rewardsCenterApiHelper = RewardsCenterApiHelper.f58979a;
            MemberTaskItem stage1stTaskInfo = this.this$0.getStage1stTaskInfo();
            String taskId = stage1stTaskInfo != null ? stage1stTaskInfo.getTaskId() : null;
            final DadaActivateView dadaActivateView = this.this$0;
            Function2 function2 = new Function2() { // from class: com.transsion.rewardscenter.task.dada.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return DadaActivateView$handleActionClick$1.m76429g(dadaActivateView, (String) obj2, (String) obj3);
                }
            };
            final DadaActivateView dadaActivateView2 = this.this$0;
            Function1 function1 = new Function1() { // from class: com.transsion.rewardscenter.task.dada.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return DadaActivateView$handleActionClick$1.m76430h(dadaActivateView2, (TaskRewards) obj2);
                }
            };
            this.label = 1;
            if (rewardsCenterApiHelper.m76624u(taskId, function2, function1, this) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        return Unit.f75682a;
    }
}
