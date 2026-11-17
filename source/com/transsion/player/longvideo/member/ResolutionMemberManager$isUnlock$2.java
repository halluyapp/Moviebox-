package com.transsion.player.longvideo.member;

import com.cloud.tmc.kernel.constants.TmcConstants;
import com.therouter.TheRouter;
import com.transsion.baselib.p291db.member.MemberResolutionBean;
import com.transsion.baselib.p291db.member.MemberResolutionDao;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p352dn.InterfaceC22998b;
import p553ko.C24715a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)Z"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.player.longvideo.member.ResolutionMemberManager$isUnlock$2", m97637f = "ResolutionMemberManager.kt", m97638l = {TmcConstants.NOTIFY_ADDHOME_GUIDE_BACK_SHOW}, m97639m = "invokeSuspend")
final class ResolutionMemberManager$isUnlock$2 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Boolean>, Object> {
    final /* synthetic */ C24715a $curBean;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResolutionMemberManager$isUnlock$2(C24715a c24715a, Continuation<? super ResolutionMemberManager$isUnlock$2> continuation) {
        super(2, continuation);
        this.$curBean = c24715a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResolutionMemberManager$isUnlock$2(this.$curBean, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Boolean> continuation) {
        return ((ResolutionMemberManager$isUnlock$2) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r11;
        Boolean boolIsUnlock;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        boolean z11 = true;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
            ?? Mo69863q = interfaceC22998b != null ? interfaceC22998b.mo69863q() : 0;
            MemberResolutionDao memberResolutionDaoM71891e = ResolutionMemberManager.f55604a.m71891e();
            String strM97059o = this.$curBean.m97059o();
            int iM97056l = this.$curBean.m97056l();
            int iM97049e = this.$curBean.m97049e();
            this.I$0 = Mo69863q;
            this.label = 1;
            Object objMo64895b = memberResolutionDaoM71891e.mo64895b(strM97059o, iM97056l, iM97049e, this);
            if (objMo64895b == objF) {
                return objF;
            }
            r11 = Mo69863q;
            obj = objMo64895b;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = this.I$0;
            ResultKt.m97107b(obj);
            r11 = i12;
        }
        MemberResolutionBean memberResolutionBean = (MemberResolutionBean) obj;
        boolean zBooleanValue = (memberResolutionBean == null || (boolIsUnlock = memberResolutionBean.isUnlock()) == null) ? false : boolIsUnlock.booleanValue();
        C16496k.f55626a.m71921a(ResolutionMemberManager.f55604a.m71890d() + " --> isUnlock() --> 是否已经解锁过 = " + (r11 != 0 || zBooleanValue) + " --> subjectId = " + this.$curBean.m97059o() + " ep = " + this.$curBean.m97056l() + " se = " + this.$curBean.m97049e() + " --> isUnlock = " + zBooleanValue + " --> isMember = " + (r11 != 0));
        if (r11 == 0 && !zBooleanValue) {
            z11 = false;
        }
        return Boxing.m97631a(z11);
    }
}
