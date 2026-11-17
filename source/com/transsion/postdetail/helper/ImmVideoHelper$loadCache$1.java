package com.transsion.postdetail.helper;

import com.blankj.utilcode.util.AbstractC5796o;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p421fx.C23450d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.helper.ImmVideoHelper$loadCache$1", m97637f = "ImmVideoHelper.kt", m97638l = {}, m97639m = "invokeSuspend")
final class ImmVideoHelper$loadCache$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ImmVideoHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImmVideoHelper$loadCache$1(ImmVideoHelper immVideoHelper, Continuation<? super ImmVideoHelper$loadCache$1> continuation) {
        super(2, continuation);
        this.this$0 = immVideoHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImmVideoHelper$loadCache$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ImmVideoHelper$loadCache$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        try {
            String string = C14496b.f50966a.m65344b().getString("k_save_video", "");
            List list = (string == null || string.length() <= 0) ? null : (List) AbstractC5796o.m27442e(string, AbstractC5796o.m27444g(PostSubjectItem.class));
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                list = (List) C23450d.f71492a.m93068d().m14847f();
            }
            if (list == null || !(!list.isEmpty())) {
                this.this$0.m73000i().mo14855n(null);
            } else {
                this.this$0.m73000i().mo14855n(list);
            }
        } catch (Exception unused) {
            this.this$0.m73000i().mo14855n(null);
        }
        return Unit.f75682a;
    }
}
