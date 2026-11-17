package com.transsion.player.longvideo.member;

import cy.InterfaceC22789e;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC25207u0;
import kotlinx.coroutines.InterfaceC25149n0;
import p553ko.C24715a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.player.longvideo.member.ResolutionMemberManager$showRewardDialog$1$1$onActivate$1", m97637f = "ResolutionMemberManager.kt", m97638l = {156, 159}, m97639m = "invokeSuspend")
final class ResolutionMemberManager$showRewardDialog$1$1$onActivate$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isActivate;
    final /* synthetic */ InterfaceC22789e $listener;
    final /* synthetic */ C24715a $longVdPlayerBean;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResolutionMemberManager$showRewardDialog$1$1$onActivate$1(boolean z11, C24715a c24715a, InterfaceC22789e interfaceC22789e, Continuation<? super ResolutionMemberManager$showRewardDialog$1$1$onActivate$1> continuation) {
        super(2, continuation);
        this.$isActivate = z11;
        this.$longVdPlayerBean = c24715a;
        this.$listener = interfaceC22789e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResolutionMemberManager$showRewardDialog$1$1$onActivate$1(this.$isActivate, this.$longVdPlayerBean, this.$listener, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ResolutionMemberManager$showRewardDialog$1$1$onActivate$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC22789e interfaceC22789e;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.m97107b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            interfaceC22789e = this.$listener;
            if (interfaceC22789e != null) {
                interfaceC22789e.mo71869a(this.$isActivate);
            }
            return Unit.f75682a;
        }
        ResultKt.m97107b(obj);
        if (this.$isActivate) {
            ResolutionMemberManager resolutionMemberManager = ResolutionMemberManager.f55604a;
            C24715a c24715a = this.$longVdPlayerBean;
            this.label = 1;
            if (resolutionMemberManager.m71896j(c24715a, this) == objF) {
                return objF;
            }
        }
        this.label = 2;
        if (AbstractC25207u0.m99223a(500L, this) == objF) {
            return objF;
        }
        interfaceC22789e = this.$listener;
        if (interfaceC22789e != null) {
            interfaceC22789e.mo71869a(this.$isActivate);
        }
        return Unit.f75682a;
    }
}
