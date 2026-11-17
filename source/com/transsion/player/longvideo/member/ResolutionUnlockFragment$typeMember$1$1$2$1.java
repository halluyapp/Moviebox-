package com.transsion.player.longvideo.member;

import com.therouter.TheRouter;
import com.transsion.memberapi.MemberSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p352dn.InterfaceC22998b;
import p352dn.InterfaceC22999c;
import p710qk.C27089h;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.player.longvideo.member.ResolutionUnlockFragment$typeMember$1$1$2$1", m97637f = "ResolutionUnlockFragment.kt", m97638l = {}, m97639m = "invokeSuspend")
final class ResolutionUnlockFragment$typeMember$1$1$2$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ResolutionUnlockFragment this$0;

    /* JADX INFO: renamed from: com.transsion.player.longvideo.member.ResolutionUnlockFragment$typeMember$1$1$2$1$a */
    public static final class C16485a implements InterfaceC22999c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ResolutionUnlockFragment f55615a;

        C16485a(ResolutionUnlockFragment resolutionUnlockFragment) {
            this.f55615a = resolutionUnlockFragment;
        }

        @Override // p352dn.InterfaceC22999c
        /* JADX INFO: renamed from: a */
        public void mo66056a() {
            C27089h.f82174a.m105449a(this.f55615a.getClassTag() + " --> typeMember() --> onFailed() --> 开通会员失败");
        }

        @Override // p352dn.InterfaceC22999c
        public void onSuccess() {
            this.f55615a.m71906i0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResolutionUnlockFragment$typeMember$1$1$2$1(ResolutionUnlockFragment resolutionUnlockFragment, Continuation<? super ResolutionUnlockFragment$typeMember$1$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = resolutionUnlockFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResolutionUnlockFragment$typeMember$1$1$2$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ResolutionUnlockFragment$typeMember$1$1$2$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b != null) {
            InterfaceC22998b.a.m91587c(interfaceC22998b, this.this$0.getActivity(), MemberSource.THREE_IN_ONE_POPUP, new C16485a(this.this$0), false, null, 24, null);
        }
        return Unit.f75682a;
    }
}
