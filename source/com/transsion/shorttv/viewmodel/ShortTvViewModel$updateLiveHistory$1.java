package com.transsion.shorttv.viewmodel;

import com.transsion.shorttv.bean.Subject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p659os.C26719e;
import p848vs.InterfaceC28213d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvViewModel$updateLiveHistory$1", m97637f = "ShortTvViewModel.kt", m97638l = {777}, m97639m = "invokeSuspend")
final class ShortTvViewModel$updateLiveHistory$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $progress;
    final /* synthetic */ C26719e $shortTVItem;
    final /* synthetic */ Subject $subject;
    int label;
    final /* synthetic */ ShortTvViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvViewModel$updateLiveHistory$1(ShortTvViewModel shortTvViewModel, Subject subject, C26719e c26719e, long j11, Continuation<? super ShortTvViewModel$updateLiveHistory$1> continuation) {
        super(2, continuation);
        this.this$0 = shortTvViewModel;
        this.$subject = subject;
        this.$shortTVItem = c26719e;
        this.$progress = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTvViewModel$updateLiveHistory$1(this.this$0, this.$subject, this.$shortTVItem, this.$progress, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTvViewModel$updateLiveHistory$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC28213d interfaceC28213dM80392s0 = this.this$0.m80392s0();
            if (interfaceC28213dM80392s0 != null) {
                String subjectId = this.$subject.getSubjectId();
                if (subjectId == null) {
                    subjectId = "";
                }
                String str = subjectId;
                int iM104511c = this.$shortTVItem.m104511c();
                long j11 = this.$progress;
                this.label = 1;
                if (interfaceC28213dM80392s0.mo73638d(str, iM104511c, j11, this) == objF) {
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
