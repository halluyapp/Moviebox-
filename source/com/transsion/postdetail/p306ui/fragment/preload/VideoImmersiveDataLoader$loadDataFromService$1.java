package com.transsion.postdetail.p306ui.fragment.preload;

import com.blankj.utilcode.util.AbstractC5796o;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.moviedetailapi.bean.PostSubjectBean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC24995a;
import kotlinx.coroutines.flow.InterfaceC24998b;
import okhttp3.RequestBody;
import p411fh.C23367b;
import p978zg.C29182a;
import p985zo.InterfaceC29209b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.ui.fragment.preload.VideoImmersiveDataLoader$loadDataFromService$1", m97637f = "VideoImmersiveDataLoader.kt", m97638l = {40}, m97639m = "invokeSuspend")
final class VideoImmersiveDataLoader$loadDataFromService$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ VideoImmersiveDataLoader this$0;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.preload.VideoImmersiveDataLoader$loadDataFromService$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/moviedetailapi/bean/PostSubjectBean;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.ui.fragment.preload.VideoImmersiveDataLoader$loadDataFromService$1$1", m97637f = "VideoImmersiveDataLoader.kt", m97638l = {28, 30, 32, 34}, m97639m = "invokeSuspend")
    static final class C172201 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ VideoImmersiveDataLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C172201(VideoImmersiveDataLoader videoImmersiveDataLoader, Continuation<? super C172201> continuation) {
            super(2, continuation);
            this.this$0 = videoImmersiveDataLoader;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C172201 c172201 = new C172201(this.this$0, continuation);
            c172201.L$0 = obj;
            return c172201;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C172201) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0072  */
        /* JADX WARN: Code duplicated, block: B:23:0x007c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x007d  */
        /* JADX WARN: Code duplicated, block: B:26:0x008b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC24998b interfaceC24998b;
            BaseDto baseDto;
            Object data;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                interfaceC24998b = (InterfaceC24998b) this.L$0;
                C23367b.a aVar = C23367b.f71265a;
                String strM27447j = AbstractC5796o.m27447j(this.this$0.m74572m());
                Intrinsics.m97801g(strM27447j, "toJson(...)");
                RequestBody requestBodyM92796a = aVar.m92796a(strM27447j);
                if (requestBodyM92796a != null) {
                    InterfaceC29209b interfaceC29209bM74570n = this.this$0.m74570n();
                    String strM111992a = C29182a.f89053a.m111992a();
                    this.L$0 = interfaceC24998b;
                    this.label = 1;
                    obj = interfaceC29209bM74570n.m112057d(strM111992a, requestBodyM92796a, this);
                    if (obj == objF) {
                        return objF;
                    }
                    baseDto = (BaseDto) obj;
                    if (Intrinsics.m97797c(baseDto.getCode(), "0")) {
                        data = baseDto.getData();
                        this.L$0 = interfaceC24998b;
                        this.label = 3;
                        if (interfaceC24998b.emit(data, this) == objF) {
                            return objF;
                        }
                    } else {
                        this.L$0 = interfaceC24998b;
                        this.label = 2;
                        if (interfaceC24998b.emit(null, this) == objF) {
                            return objF;
                        }
                    }
                } else {
                    this.L$0 = null;
                    this.label = 4;
                    if (interfaceC24998b.emit(null, this) == objF) {
                        return objF;
                    }
                }
            } else if (i11 != 1) {
                if (i11 == 2 || i11 == 3) {
                } else if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            } else {
                interfaceC24998b = (InterfaceC24998b) this.L$0;
                ResultKt.m97107b(obj);
                baseDto = (BaseDto) obj;
                if (Intrinsics.m97797c(baseDto.getCode(), "0")) {
                    this.L$0 = interfaceC24998b;
                    this.label = 2;
                    if (interfaceC24998b.emit(null, this) == objF) {
                        return objF;
                    }
                } else {
                    data = baseDto.getData();
                    this.L$0 = interfaceC24998b;
                    this.label = 3;
                    if (interfaceC24998b.emit(data, this) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.preload.VideoImmersiveDataLoader$loadDataFromService$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/moviedetailapi/bean/PostSubjectBean;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.ui.fragment.preload.VideoImmersiveDataLoader$loadDataFromService$1$2", m97637f = "VideoImmersiveDataLoader.kt", m97638l = {36}, m97639m = "invokeSuspend")
    static final class C172212 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C172212(Continuation<? super C172212> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C172212 c172212 = new C172212(continuation);
            c172212.L$0 = interfaceC24998b;
            return c172212.invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC24998b interfaceC24998b = (InterfaceC24998b) this.L$0;
                this.label = 1;
                if (interfaceC24998b.emit(null, this) == objF) {
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

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.preload.VideoImmersiveDataLoader$loadDataFromService$1$3 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/moviedetailapi/bean/PostSubjectBean;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.ui.fragment.preload.VideoImmersiveDataLoader$loadDataFromService$1$3", m97637f = "VideoImmersiveDataLoader.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C172223 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ VideoImmersiveDataLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C172223(VideoImmersiveDataLoader videoImmersiveDataLoader, Continuation<? super C172223> continuation) {
            super(3, continuation);
            this.this$0 = videoImmersiveDataLoader;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C172223 c172223 = new C172223(this.this$0, continuation);
            c172223.L$0 = th2;
            return c172223.invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            Throwable th2 = (Throwable) this.L$0;
            C26866a.a aVar = C26866a.f81698a;
            String strM109259b = this.this$0.m109259b();
            Intrinsics.m97801g(strM109259b, "<get-TAG>(...)");
            C26866a.a.m104898f(aVar, strM109259b, String.valueOf(th2.getMessage()), false, 4, null);
            this.this$0.m109260c(null);
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.preload.VideoImmersiveDataLoader$loadDataFromService$1$a */
    static final class C17223a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ VideoImmersiveDataLoader f57430a;

        C17223a(VideoImmersiveDataLoader videoImmersiveDataLoader) {
            this.f57430a = videoImmersiveDataLoader;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(PostSubjectBean postSubjectBean, Continuation continuation) {
            this.f57430a.m109261d(postSubjectBean);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoImmersiveDataLoader$loadDataFromService$1(VideoImmersiveDataLoader videoImmersiveDataLoader, Continuation<? super VideoImmersiveDataLoader$loadDataFromService$1> continuation) {
        super(2, continuation);
        this.this$0 = videoImmersiveDataLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoImmersiveDataLoader$loadDataFromService$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((VideoImmersiveDataLoader$loadDataFromService$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C172201(this.this$0, null)), C25220y0.m99268b()), new C172212(null)), new C172223(this.this$0, null));
            C17223a c17223a = new C17223a(this.this$0);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c17223a, this) == objF) {
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
