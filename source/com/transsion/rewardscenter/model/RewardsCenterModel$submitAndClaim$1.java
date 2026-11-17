package com.transsion.rewardscenter.model;

import com.transsion.rewardscenter.utils.RewardsCenterApiHelper;
import com.transsion.rewardscenterapi.ClaimReceiverRequest;
import com.transsion.rewardscenterapi.ClaimReceiverResponse;
import com.transsion.rewardscenterapi.PhoneInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.rewardscenter.model.RewardsCenterModel$submitAndClaim$1", m97637f = "RewardsCenterModel.kt", m97638l = {185}, m97639m = "invokeSuspend")
final class RewardsCenterModel$submitAndClaim$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cc;
    final /* synthetic */ String $drawResultId;
    final /* synthetic */ String $iso;
    final /* synthetic */ String $number;
    int label;
    final /* synthetic */ RewardsCenterModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardsCenterModel$submitAndClaim$1(RewardsCenterModel rewardsCenterModel, String str, String str2, String str3, String str4, Continuation<? super RewardsCenterModel$submitAndClaim$1> continuation) {
        super(2, continuation);
        this.this$0 = rewardsCenterModel;
        this.$drawResultId = str;
        this.$cc = str2;
        this.$number = str3;
        this.$iso = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Unit m76137g(RewardsCenterModel rewardsCenterModel, String str, String str2) {
        rewardsCenterModel.m76117o().mo14855n(Boolean.FALSE);
        rewardsCenterModel.m76106A(null);
        rewardsCenterModel.m76115m().mo14855n(new Pair(str, str2));
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Unit m76138h(RewardsCenterModel rewardsCenterModel, String str, ClaimReceiverResponse claimReceiverResponse) {
        rewardsCenterModel.m76109e(str);
        return Unit.f75682a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RewardsCenterModel$submitAndClaim$1(this.this$0, this.$drawResultId, this.$cc, this.$number, this.$iso, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((RewardsCenterModel$submitAndClaim$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            String str = this.$cc;
            String str2 = this.$number;
            String str3 = this.$iso;
            List listC = CollectionsKt.m97497c();
            listC.add(new PhoneInfo(str, str2, str3));
            List listA = CollectionsKt.m97495a(listC);
            this.this$0.m76117o().mo14858q(Boxing.m97631a(true));
            RewardsCenterApiHelper rewardsCenterApiHelper = RewardsCenterApiHelper.f58979a;
            ClaimReceiverRequest claimReceiverRequest = new ClaimReceiverRequest(this.$drawResultId, null, listA, null, null, null, 58, null);
            final RewardsCenterModel rewardsCenterModel = this.this$0;
            Function2 function2 = new Function2() { // from class: com.transsion.rewardscenter.model.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return RewardsCenterModel$submitAndClaim$1.m76137g(rewardsCenterModel, (String) obj2, (String) obj3);
                }
            };
            final RewardsCenterModel rewardsCenterModel2 = this.this$0;
            final String str4 = this.$drawResultId;
            Function1 function1 = new Function1() { // from class: com.transsion.rewardscenter.model.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return RewardsCenterModel$submitAndClaim$1.m76138h(rewardsCenterModel2, str4, (ClaimReceiverResponse) obj2);
                }
            };
            this.label = 1;
            if (rewardsCenterApiHelper.m76625w(claimReceiverRequest, function2, function1, this) == objF) {
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
