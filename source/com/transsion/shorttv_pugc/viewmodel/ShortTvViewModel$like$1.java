package com.transsion.shorttv_pugc.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.shorttv_pugc.bean.InteractiveRespData;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p883wt.InterfaceC28436a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv_pugc.viewmodel.ShortTvViewModel$like$1", m97637f = "ShortTvViewModel.kt", m97638l = {339}, m97639m = "invokeSuspend")
final class ShortTvViewModel$like$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $hasLike;
    final /* synthetic */ String $ugcVideoId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ShortTvViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvViewModel$like$1(ShortTvViewModel shortTvViewModel, String str, boolean z11, Continuation<? super ShortTvViewModel$like$1> continuation) {
        super(2, continuation);
        this.this$0 = shortTvViewModel;
        this.$ugcVideoId = str;
        this.$hasLike = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShortTvViewModel$like$1 shortTvViewModel$like$1 = new ShortTvViewModel$like$1(this.this$0, this.$ugcVideoId, this.$hasLike, continuation);
        shortTvViewModel$like$1.L$0 = obj;
        return shortTvViewModel$like$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTvViewModel$like$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                ShortTvViewModel shortTvViewModel = this.this$0;
                String str = this.$ugcVideoId;
                boolean z11 = this.$hasLike;
                Result.Companion companion = Result.INSTANCE;
                InterfaceC28436a interfaceC28436a = shortTvViewModel.f62499a;
                this.label = 1;
                obj = InterfaceC28436a.a.m109875i(interfaceC28436a, null, str, z11 ? 1 : 0, this, 1, null);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            InteractiveRespData interactiveRespData = (InteractiveRespData) ((BaseDto) obj).getData();
            objM112707constructorimpl = Result.m112707constructorimpl(String.valueOf(interactiveRespData != null ? Boxing.m97634d(interactiveRespData.getLikes()) : null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
        }
        Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        return Unit.f75682a;
    }
}
