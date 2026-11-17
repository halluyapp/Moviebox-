package com.transsion.audio.viewmodel;

import com.transsion.baselib.p291db.audio.AudioBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.AbstractC25089i0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p602mj.InterfaceC25866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.audio.viewmodel.HistoryListManager$addToList$1", m97637f = "HistoryListManager.kt", m97638l = {101}, m97639m = "invokeSuspend")
final class HistoryListManager$addToList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AudioBean $audioBean;
    int label;
    final /* synthetic */ HistoryListManager this$0;

    /* JADX INFO: renamed from: com.transsion.audio.viewmodel.HistoryListManager$addToList$1$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.audio.viewmodel.HistoryListManager$addToList$1$1", m97637f = "HistoryListManager.kt", m97638l = {103, 105, 107}, m97639m = "invokeSuspend")
    static final class C142691 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ AudioBean $audioBean;
        int label;
        final /* synthetic */ HistoryListManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C142691(AudioBean audioBean, HistoryListManager historyListManager, Continuation<? super C142691> continuation) {
            super(2, continuation);
            this.$audioBean = audioBean;
            this.this$0 = historyListManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C142691(this.$audioBean, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C142691) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0082 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list;
            InterfaceC25866a interfaceC25866aM64694q;
            AudioBean audioBean;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.m97107b(obj);
                } else if (i11 == 2) {
                    ResultKt.m97107b(obj);
                    list = (List) obj;
                    if (list != null && list.size() > 30 && (interfaceC25866aM64694q = this.this$0.m64694q()) != null) {
                        audioBean = (AudioBean) list.get(list.size() - 1);
                        this.label = 3;
                        if (interfaceC25866aM64694q.mo101622b(audioBean, this) == objF) {
                            return objF;
                        }
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(obj);
                }
                return Unit.f75682a;
            }
            ResultKt.m97107b(obj);
            this.$audioBean.setUpdateTimeStamp(Boxing.m97635e(System.currentTimeMillis()));
            InterfaceC25866a interfaceC25866aM64694q2 = this.this$0.m64694q();
            if (interfaceC25866aM64694q2 != null) {
                AudioBean audioBean2 = this.$audioBean;
                this.label = 1;
                if (interfaceC25866aM64694q2.mo101628h(audioBean2, this) == objF) {
                    return objF;
                }
            }
            InterfaceC25866a interfaceC25866aM64694q3 = this.this$0.m64694q();
            if (interfaceC25866aM64694q3 != null) {
                this.label = 2;
                obj = interfaceC25866aM64694q3.mo101625e(this);
                if (obj == objF) {
                    return objF;
                }
                list = (List) obj;
            } else {
                list = null;
            }
            if (list != null) {
                audioBean = (AudioBean) list.get(list.size() - 1);
                this.label = 3;
                if (interfaceC25866aM64694q.mo101622b(audioBean, this) == objF) {
                    return objF;
                }
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryListManager$addToList$1(AudioBean audioBean, HistoryListManager historyListManager, Continuation<? super HistoryListManager$addToList$1> continuation) {
        super(2, continuation);
        this.$audioBean = audioBean;
        this.this$0 = historyListManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryListManager$addToList$1(this.$audioBean, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((HistoryListManager$addToList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            AbstractC25089i0 abstractC25089i0M99268b = C25220y0.m99268b();
            C142691 c142691 = new C142691(this.$audioBean, this.this$0, null);
            this.label = 1;
            if (AbstractC25088i.m98910g(abstractC25089i0M99268b, c142691, this) == objF) {
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
