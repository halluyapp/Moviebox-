package com.transsion.player.longvideo.member;

import com.transsion.baselib.p291db.member.MemberResolutionDao;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p553ko.C24715a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.player.longvideo.member.ResolutionMemberManager$unlock$2", m97637f = "ResolutionMemberManager.kt", m97638l = {104}, m97639m = "invokeSuspend")
final class ResolutionMemberManager$unlock$2 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C24715a $curBean;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResolutionMemberManager$unlock$2(C24715a c24715a, Continuation<? super ResolutionMemberManager$unlock$2> continuation) {
        super(2, continuation);
        this.$curBean = c24715a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResolutionMemberManager$unlock$2(this.$curBean, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ResolutionMemberManager$unlock$2) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            MemberResolutionDao memberResolutionDaoM71891e = ResolutionMemberManager.f55604a.m71891e();
            String strM97059o = this.$curBean.m97059o();
            int iM97056l = this.$curBean.m97056l();
            int iM97049e = this.$curBean.m97049e();
            this.label = 1;
            if (memberResolutionDaoM71891e.mo64899f(strM97059o, iM97056l, iM97049e, true, this) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        C16496k.f55626a.m71921a(ResolutionMemberManager.f55604a.m71890d() + " --> unlock() --> 解锁高清视频播放权限 --> subjectId = " + this.$curBean.m97059o() + " ep = " + this.$curBean.m97056l() + " se = " + this.$curBean.m97049e());
        return Unit.f75682a;
    }
}
