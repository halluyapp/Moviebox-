package com.transsion.transfer.wifi.create.adapter;

import com.transsion.transfer.wifi.create.InterfaceC20073a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.transfer.wifi.create.adapter.P2PWifiAdapter$onFail$1", m97637f = "P2PWifiAdapter.kt", m97638l = {441}, m97639m = "invokeSuspend")
final class P2PWifiAdapter$onFail$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $code;
    int label;
    final /* synthetic */ P2PWifiAdapter this$0;

    /* JADX INFO: renamed from: com.transsion.transfer.wifi.create.adapter.P2PWifiAdapter$onFail$1$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.transfer.wifi.create.adapter.P2PWifiAdapter$onFail$1$1", m97637f = "P2PWifiAdapter.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C200751 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $code;
        int label;
        final /* synthetic */ P2PWifiAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C200751(P2PWifiAdapter p2PWifiAdapter, int i11, Continuation<? super C200751> continuation) {
            super(2, continuation);
            this.this$0 = p2PWifiAdapter;
            this.$code = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C200751(this.this$0, this.$code, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C200751) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            InterfaceC20073a interfaceC20073aM83405d = this.this$0.m83405d();
            if (interfaceC20073aM83405d != null) {
                interfaceC20073aM83405d.mo83374b(this.$code, 0L);
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P2PWifiAdapter$onFail$1(P2PWifiAdapter p2PWifiAdapter, int i11, Continuation<? super P2PWifiAdapter$onFail$1> continuation) {
        super(2, continuation);
        this.this$0 = p2PWifiAdapter;
        this.$code = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new P2PWifiAdapter$onFail$1(this.this$0, this.$code, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((P2PWifiAdapter$onFail$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            AbstractC24917a2 abstractC24917a2M99269c = C25220y0.m99269c();
            C200751 c200751 = new C200751(this.this$0, this.$code, null);
            this.label = 1;
            if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c200751, this) == objF) {
                return objF;
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
