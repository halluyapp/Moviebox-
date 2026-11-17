package com.transsion.transfer.wifi.connect.adapter;

import com.transsion.transfer.wifi.connect.InterfaceC20072b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.AbstractC25089i0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.transfer.wifi.connect.adapter.AddNetWorkConnectAdapter$doConnect$1", m97637f = "AddNetWorkConnectAdapter.kt", m97638l = {75}, m97639m = "invokeSuspend")
final class AddNetWorkConnectAdapter$doConnect$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AddNetWorkConnectAdapter this$0;

    /* JADX INFO: renamed from: com.transsion.transfer.wifi.connect.adapter.AddNetWorkConnectAdapter$doConnect$1$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.transfer.wifi.connect.adapter.AddNetWorkConnectAdapter$doConnect$1$1", m97637f = "AddNetWorkConnectAdapter.kt", m97638l = {77}, m97639m = "invokeSuspend")
    static final class C200611 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AddNetWorkConnectAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C200611(AddNetWorkConnectAdapter addNetWorkConnectAdapter, Continuation<? super C200611> continuation) {
            super(2, continuation);
            this.this$0 = addNetWorkConnectAdapter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C200611(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C200611) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM112707constructorimpl;
            InterfaceC20072b interfaceC20072bM83325h;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            try {
                if (i11 == 0) {
                    ResultKt.m97107b(obj);
                    AddNetWorkConnectAdapter addNetWorkConnectAdapter = this.this$0;
                    Result.Companion companion = Result.INSTANCE;
                    this.label = 1;
                    if (addNetWorkConnectAdapter.m83307n(this) == objF) {
                        return objF;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(obj);
                }
                objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            AddNetWorkConnectAdapter addNetWorkConnectAdapter2 = this.this$0;
            if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null && (interfaceC20072bM83325h = addNetWorkConnectAdapter2.m83325h()) != null) {
                interfaceC20072bM83325h.mo83299b(2030);
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddNetWorkConnectAdapter$doConnect$1(AddNetWorkConnectAdapter addNetWorkConnectAdapter, Continuation<? super AddNetWorkConnectAdapter$doConnect$1> continuation) {
        super(2, continuation);
        this.this$0 = addNetWorkConnectAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddNetWorkConnectAdapter$doConnect$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((AddNetWorkConnectAdapter$doConnect$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            AbstractC25089i0 abstractC25089i0M99268b = C25220y0.m99268b();
            C200611 c200611 = new C200611(this.this$0, null);
            this.label = 1;
            if (AbstractC25088i.m98910g(abstractC25089i0M99268b, c200611, this) == objF) {
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
