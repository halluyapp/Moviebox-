package com.transsion.home.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p978zg.C29182a;
import sl.InterfaceC27629c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.viewmodel.MovieViewModel$getFilterItems$1", m97637f = "MovieViewModel.kt", m97638l = {46}, m97639m = "invokeSuspend")
final class MovieViewModel$getFilterItems$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Integer $tabId;
    final /* synthetic */ String $version;
    int label;
    final /* synthetic */ MovieViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MovieViewModel$getFilterItems$1(MovieViewModel movieViewModel, Integer num, String str, Continuation<? super MovieViewModel$getFilterItems$1> continuation) {
        super(2, continuation);
        this.this$0 = movieViewModel;
        this.$tabId = num;
        this.$version = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MovieViewModel$getFilterItems$1(this.this$0, this.$tabId, this.$version, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((MovieViewModel$getFilterItems$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC27629c interfaceC27629c = this.this$0.f53652e;
                String strM111992a = C29182a.f89053a.m111992a();
                Integer num = this.$tabId;
                int iIntValue = num != null ? num.intValue() : 0;
                String str = this.$version;
                this.label = 1;
                obj = interfaceC27629c.m107477b(strM111992a, iIntValue, str, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            this.this$0.m68958j().mo14855n((BaseDto) obj);
        } catch (Exception e11) {
            e11.printStackTrace();
            this.this$0.m68958j().mo14855n(new BaseDto());
        }
        return Unit.f75682a;
    }
}
