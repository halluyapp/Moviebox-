package com.transsion.rewardscenter.task.member;

import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.transsion.rewardscenter.R$layout;
import com.transsion.rewardscenter.R$string;
import com.transsion.rewardscenter.utils.AbstractC18021p;
import com.transsion.rewardscenter.utils.RewardsCenterApiHelper;
import com.transsion.rewardscenterapi.MemberTaskItem;
import com.transsion.rewardscenterapi.TaskRewards;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.rewardscenter.task.member.BaseTaskCommonProvider$startClaim$1", m97637f = "BaseTaskCommonProvider.kt", m97638l = {Sdk$SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class BaseTaskCommonProvider$startClaim$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ MemberTaskItem $item;
    int label;
    final /* synthetic */ BaseTaskCommonProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseTaskCommonProvider$startClaim$1(MemberTaskItem memberTaskItem, BaseTaskCommonProvider baseTaskCommonProvider, Continuation<? super BaseTaskCommonProvider$startClaim$1> continuation) {
        super(2, continuation);
        this.$item = memberTaskItem;
        this.this$0 = baseTaskCommonProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Unit m76457g(BaseTaskCommonProvider baseTaskCommonProvider, String str, String str2) {
        baseTaskCommonProvider.m76448B().m22756c().m76117o().mo14855n(Boolean.FALSE);
        String string = baseTaskCommonProvider.m36338k().getString(R$string.claim_points_failed_tips);
        Intrinsics.m97801g(string, "getString(...)");
        AbstractC18021p.m76643a(false, string);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Unit m76458h(BaseTaskCommonProvider baseTaskCommonProvider, TaskRewards taskRewards) {
        List<Object> data;
        MemberTaskItem memberTaskItem;
        Integer rewardAmount;
        Integer currentPoint;
        List<Object> data2;
        List<Object> data3;
        MemberTaskItem memberTaskItem2;
        MemberTaskItem taskInfo;
        baseTaskCommonProvider.m76448B().m22756c().m76117o().mo14855n(Boolean.FALSE);
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = baseTaskCommonProvider.m36335g();
        int i11 = -1;
        if (baseProviderMultiAdapterM36335g != null && (data2 = baseProviderMultiAdapterM36335g.getData()) != null) {
            int i12 = 0;
            for (Object obj : data2) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.m97515u();
                }
                MemberTaskItem memberTaskItem3 = (MemberTaskItem) obj;
                if (Intrinsics.m97797c(memberTaskItem3.getTaskId(), (taskRewards == null || (taskInfo = taskRewards.getTaskInfo()) == null) ? null : taskInfo.getTaskId()) && memberTaskItem3.getTaskId() != null) {
                    MemberTaskItem taskInfo2 = taskRewards != null ? taskRewards.getTaskInfo() : null;
                    BaseProviderMultiAdapter baseProviderMultiAdapterM36335g2 = baseTaskCommonProvider.m36335g();
                    if (baseProviderMultiAdapterM36335g2 != null && (data3 = baseProviderMultiAdapterM36335g2.getData()) != null && (memberTaskItem2 = (MemberTaskItem) data3.get(i12)) != null) {
                        memberTaskItem2.setStatus(taskInfo2 != null ? taskInfo2.getStatus() : null);
                        memberTaskItem2.setProgress(taskInfo2 != null ? taskInfo2.getProgress() : null);
                        memberTaskItem2.setTotalProgress(taskInfo2 != null ? taskInfo2.getTotalProgress() : null);
                    }
                    i11 = i12;
                }
                i12 = i13;
            }
        }
        if (taskRewards != null && (currentPoint = taskRewards.getCurrentPoint()) != null) {
            baseTaskCommonProvider.m76448B().m22756c().m76108C(currentPoint.intValue());
        }
        if (i11 < 0) {
            return Unit.f75682a;
        }
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g3 = baseTaskCommonProvider.m36335g();
        int iIntValue = (baseProviderMultiAdapterM36335g3 == null || (data = baseProviderMultiAdapterM36335g3.getData()) == null || (memberTaskItem = (MemberTaskItem) data.get(i11)) == null || (rewardAmount = memberTaskItem.getRewardAmount()) == null) ? 0 : rewardAmount.intValue();
        C28951b.a aVar = C28951b.f88586a;
        int i14 = R$layout.claim_succeed_layout;
        String string = baseTaskCommonProvider.m36338k().getString(R$string.claim_points_receive_tips, Integer.valueOf(iIntValue));
        Intrinsics.m97801g(string, "getString(...)");
        aVar.m111457g(i14, string, (24 & 4) != 0 ? 0 : 80, (24 & 8) != 0 ? 0 : 0, (24 & 16) != 0 ? 0 : AbstractC5776a0.m27313a(66.0f));
        baseTaskCommonProvider.mo76452G();
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g4 = baseTaskCommonProvider.m36335g();
        if (baseProviderMultiAdapterM36335g4 != null) {
            baseProviderMultiAdapterM36335g4.notifyItemChanged(i11);
        }
        return Unit.f75682a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseTaskCommonProvider$startClaim$1(this.$item, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((BaseTaskCommonProvider$startClaim$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            RewardsCenterApiHelper rewardsCenterApiHelper = RewardsCenterApiHelper.f58979a;
            String taskId = this.$item.getTaskId();
            final BaseTaskCommonProvider baseTaskCommonProvider = this.this$0;
            Function2 function2 = new Function2() { // from class: com.transsion.rewardscenter.task.member.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return BaseTaskCommonProvider$startClaim$1.m76457g(baseTaskCommonProvider, (String) obj2, (String) obj3);
                }
            };
            final BaseTaskCommonProvider baseTaskCommonProvider2 = this.this$0;
            Function1 function1 = new Function1() { // from class: com.transsion.rewardscenter.task.member.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BaseTaskCommonProvider$startClaim$1.m76458h(baseTaskCommonProvider2, (TaskRewards) obj2);
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
