package com.transsion.shorttv_pugc.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.shorttv_pugc.ShorttvModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.InterfaceC25149n0;
import p883wt.InterfaceC28436a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "Lcom/transsion/shorttv_pugc/ShorttvModel$PlayStreamItem;", "<anonymous>", "(Lkotlinx/coroutines/n0;)Lcom/transsion/shorttv_pugc/ShorttvModel$PlayStreamItem;"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv_pugc.viewmodel.ShortTvViewModel$requestFirstVideo$1$2$1$streamDeferred$1", m97637f = "ShortTvViewModel.kt", m97638l = {168}, m97639m = "invokeSuspend")
final class ShortTvViewModel$requestFirstVideo$1$2$1$streamDeferred$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super ShorttvModel.PlayStreamItem>, Object> {
    final /* synthetic */ Ref.ObjectRef<String> $ugcVideoIdMutable;
    int label;
    final /* synthetic */ ShortTvViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvViewModel$requestFirstVideo$1$2$1$streamDeferred$1(ShortTvViewModel shortTvViewModel, Ref.ObjectRef<String> objectRef, Continuation<? super ShortTvViewModel$requestFirstVideo$1$2$1$streamDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = shortTvViewModel;
        this.$ugcVideoIdMutable = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTvViewModel$requestFirstVideo$1$2$1$streamDeferred$1(this.this$0, this.$ugcVideoIdMutable, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super ShorttvModel.PlayStreamItem> continuation) {
        return ((ShortTvViewModel$requestFirstVideo$1$2$1$streamDeferred$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC28436a interfaceC28436a = this.this$0.f62499a;
            String str = this.$ugcVideoIdMutable.element;
            this.label = 1;
            obj = InterfaceC28436a.a.m109872f(interfaceC28436a, str, null, this, 2, null);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        return ((BaseDto) obj).getData();
    }
}
