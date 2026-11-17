package com.transsion.rewardscenter.task.p308ad;

import com.transsion.rewardscenter.R$string;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.rewardscenter.task.ad.BaseStageTaskAdHelper$startClaim$1$1", m97637f = "BaseStageTaskAdHelper.kt", m97638l = {268}, m97639m = "invokeSuspend")
final class BaseStageTaskAdHelper$startClaim$1$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $callback;
    final /* synthetic */ MemberTaskItem $it;
    final /* synthetic */ AbstractC17914v $item;
    int label;
    final /* synthetic */ BaseStageTaskAdHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseStageTaskAdHelper$startClaim$1$1(MemberTaskItem memberTaskItem, BaseStageTaskAdHelper baseStageTaskAdHelper, AbstractC17914v abstractC17914v, Function0<Unit> function0, Continuation<? super BaseStageTaskAdHelper$startClaim$1$1> continuation) {
        super(2, continuation);
        this.$it = memberTaskItem;
        this.this$0 = baseStageTaskAdHelper;
        this.$item = abstractC17914v;
        this.$callback = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Unit m76229g(BaseStageTaskAdHelper baseStageTaskAdHelper, String str, String str2) {
        BaseStageTaskAdHelper.InterfaceC17880a interfaceC17880a = baseStageTaskAdHelper.f58726d;
        if (interfaceC17880a != null) {
            interfaceC17880a.mo76224b();
        }
        if (str2 == null) {
            str2 = baseStageTaskAdHelper.f58723a.getString(R$string.claim_failed);
            Intrinsics.m97801g(str2, "getString(...)");
        }
        AbstractC18021p.m76643a(false, str2);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Unit m76230h(AbstractC17914v abstractC17914v, BaseStageTaskAdHelper baseStageTaskAdHelper, Function0 function0, TaskRewards taskRewards) {
        if (taskRewards != null) {
            String tips = taskRewards.getTips();
            if (tips != null) {
                AbstractC18021p.m76643a(true, tips);
            }
            C26866a.a.m104898f(C26866a.f81698a, "StageTaskAd", "----> claimMemberShipReward: " + taskRewards.getTaskInfo() + ", " + taskRewards.getCurrentPoint(), false, 4, null);
            C17913u.f58813a.m76335b(abstractC17914v, taskRewards.getTaskInfo());
            BaseStageTaskAdHelper.InterfaceC17880a interfaceC17880a = baseStageTaskAdHelper.f58726d;
            if (interfaceC17880a != null) {
                interfaceC17880a.mo76223a(taskRewards.getCurrentPoint());
            }
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.f75682a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseStageTaskAdHelper$startClaim$1$1(this.$it, this.this$0, this.$item, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((BaseStageTaskAdHelper$startClaim$1$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            RewardsCenterApiHelper rewardsCenterApiHelper = RewardsCenterApiHelper.f58979a;
            String taskId = this.$it.getTaskId();
            final BaseStageTaskAdHelper baseStageTaskAdHelper = this.this$0;
            Function2 function2 = new Function2() { // from class: com.transsion.rewardscenter.task.ad.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return BaseStageTaskAdHelper$startClaim$1$1.m76229g(baseStageTaskAdHelper, (String) obj2, (String) obj3);
                }
            };
            final AbstractC17914v abstractC17914v = this.$item;
            final BaseStageTaskAdHelper baseStageTaskAdHelper2 = this.this$0;
            final Function0<Unit> function0 = this.$callback;
            Function1 function1 = new Function1() { // from class: com.transsion.rewardscenter.task.ad.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BaseStageTaskAdHelper$startClaim$1$1.m76230h(abstractC17914v, baseStageTaskAdHelper2, function0, (TaskRewards) obj2);
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
