package com.transsion.member.dialog;

import com.therouter.TheRouter;
import com.transsion.memberapi.MemberCheckResult;
import com.transsion.memberapi.MemberSceneType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p352dn.InterfaceC22998b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.member.dialog.CheckMemberRightsLoadingDialog$checkMember$1", m97637f = "CheckMemberRightsLoadingDialog.kt", m97638l = {80}, m97639m = "invokeSuspend")
final class CheckMemberRightsLoadingDialog$checkMember$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CheckMemberRightsLoadingDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckMemberRightsLoadingDialog$checkMember$1(CheckMemberRightsLoadingDialog checkMemberRightsLoadingDialog, Continuation<? super CheckMemberRightsLoadingDialog$checkMember$1> continuation) {
        super(2, continuation);
        this.this$0 = checkMemberRightsLoadingDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Unit m69988d(CheckMemberRightsLoadingDialog checkMemberRightsLoadingDialog, MemberCheckResult memberCheckResult) {
        if (checkMemberRightsLoadingDialog.isDetached() || !checkMemberRightsLoadingDialog.isAdded()) {
            return Unit.f75682a;
        }
        checkMemberRightsLoadingDialog.m69983s0(memberCheckResult);
        return Unit.f75682a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheckMemberRightsLoadingDialog$checkMember$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((CheckMemberRightsLoadingDialog$checkMember$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
            if (interfaceC22998b != null) {
                MemberSceneType memberSceneType = this.this$0.mSceneType;
                Integer num = this.this$0.mResolution;
                final CheckMemberRightsLoadingDialog checkMemberRightsLoadingDialog = this.this$0;
                Function1 function1 = new Function1() { // from class: com.transsion.member.dialog.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CheckMemberRightsLoadingDialog$checkMember$1.m69988d(checkMemberRightsLoadingDialog, (MemberCheckResult) obj2);
                    }
                };
                this.label = 1;
                if (interfaceC22998b.mo69848b(memberSceneType, num, function1, this) == objF) {
                    return objF;
                }
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
