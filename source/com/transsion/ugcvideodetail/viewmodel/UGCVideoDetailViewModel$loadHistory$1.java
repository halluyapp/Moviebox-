package com.transsion.ugcvideodetail.viewmodel;

import com.transsion.baselib.p291db.video.UGCCollectionVideoGroupDao;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayBean;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayDao;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC24995a;
import kotlinx.coroutines.flow.InterfaceC24998b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$loadHistory$1", m97637f = "UGCVideoDetailViewModel.kt", m97638l = {177}, m97639m = "invokeSuspend")
final class UGCVideoDetailViewModel$loadHistory$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $ugcVideoId;
    int label;
    final /* synthetic */ UGCVideoDetailViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$loadHistory$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/baselib/db/video/UGCVideoDetailPlayBean;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$loadHistory$1$1", m97637f = "UGCVideoDetailViewModel.kt", m97638l = {159, 161, 162, 164, 166, 169, 172}, m97639m = "invokeSuspend")
    static final class C203711 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $ugcVideoId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UGCVideoDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203711(UGCVideoDetailViewModel uGCVideoDetailViewModel, String str, Continuation<? super C203711> continuation) {
            super(2, continuation);
            this.this$0 = uGCVideoDetailViewModel;
            this.$ugcVideoId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C203711 c203711 = new C203711(this.this$0, this.$ugcVideoId, continuation);
            c203711.L$0 = obj;
            return c203711;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C203711) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0053  */
        /* JADX WARN: Code duplicated, block: B:18:0x0066 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x006b  */
        /* JADX WARN: Code duplicated, block: B:23:0x007c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x0081  */
        /* JADX WARN: Code duplicated, block: B:28:0x008c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x008d  */
        /* JADX WARN: Code duplicated, block: B:31:0x0098 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:32:0x0099  */
        /* JADX WARN: Code duplicated, block: B:34:0x00a4 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:37:0x00b0 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC24998b interfaceC24998b;
            UGCVideoDetailPlayBean uGCVideoDetailPlayBean;
            String str;
            UGCVideoDetailPlayBean uGCVideoDetailPlayBean2;
            Object objF = IntrinsicsKt.m97630f();
            switch (this.label) {
                case 0:
                    ResultKt.m97107b(obj);
                    interfaceC24998b = (InterfaceC24998b) this.L$0;
                    UGCVideoDetailPlayDao uGCVideoDetailPlayDaoM84265K = this.this$0.m84265K();
                    String str2 = this.$ugcVideoId;
                    this.L$0 = interfaceC24998b;
                    this.label = 1;
                    obj = uGCVideoDetailPlayDaoM84265K.mo64981r(str2, this);
                    if (obj == objF) {
                        return objF;
                    }
                    uGCVideoDetailPlayBean = (UGCVideoDetailPlayBean) obj;
                    if (uGCVideoDetailPlayBean == null) {
                        UGCCollectionVideoGroupDao uGCCollectionVideoGroupDaoM84292z = this.this$0.m84292z();
                        String str3 = this.$ugcVideoId;
                        this.L$0 = interfaceC24998b;
                        this.label = 2;
                        obj = uGCCollectionVideoGroupDaoM84292z.mo64959c(str3, this);
                        if (obj == objF) {
                            return objF;
                        }
                        str = (String) obj;
                        if (str != null) {
                            UGCVideoDetailPlayDao uGCVideoDetailPlayDaoM84265K2 = this.this$0.m84265K();
                            this.L$0 = interfaceC24998b;
                            this.label = 3;
                            obj = uGCVideoDetailPlayDaoM84265K2.mo64966c(str, this);
                            if (obj == objF) {
                                return objF;
                            }
                            uGCVideoDetailPlayBean2 = (UGCVideoDetailPlayBean) obj;
                            if (uGCVideoDetailPlayBean2 == null) {
                                this.L$0 = interfaceC24998b;
                                this.label = 4;
                                if (interfaceC24998b.emit(null, this) == objF) {
                                    return objF;
                                }
                            } else {
                                this.L$0 = interfaceC24998b;
                                this.label = 5;
                                if (interfaceC24998b.emit(uGCVideoDetailPlayBean2, this) == objF) {
                                    return objF;
                                }
                            }
                        } else {
                            this.L$0 = null;
                            this.label = 6;
                            if (interfaceC24998b.emit(null, this) == objF) {
                                return objF;
                            }
                        }
                    } else {
                        this.L$0 = null;
                        this.label = 7;
                        if (interfaceC24998b.emit(uGCVideoDetailPlayBean, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f75682a;
                case 1:
                    interfaceC24998b = (InterfaceC24998b) this.L$0;
                    ResultKt.m97107b(obj);
                    uGCVideoDetailPlayBean = (UGCVideoDetailPlayBean) obj;
                    if (uGCVideoDetailPlayBean == null) {
                        UGCCollectionVideoGroupDao uGCCollectionVideoGroupDaoM84292z2 = this.this$0.m84292z();
                        String str4 = this.$ugcVideoId;
                        this.L$0 = interfaceC24998b;
                        this.label = 2;
                        obj = uGCCollectionVideoGroupDaoM84292z2.mo64959c(str4, this);
                        if (obj == objF) {
                            return objF;
                        }
                        str = (String) obj;
                        if (str != null) {
                            UGCVideoDetailPlayDao uGCVideoDetailPlayDaoM84265K3 = this.this$0.m84265K();
                            this.L$0 = interfaceC24998b;
                            this.label = 3;
                            obj = uGCVideoDetailPlayDaoM84265K3.mo64966c(str, this);
                            if (obj == objF) {
                                return objF;
                            }
                            uGCVideoDetailPlayBean2 = (UGCVideoDetailPlayBean) obj;
                            if (uGCVideoDetailPlayBean2 == null) {
                                this.L$0 = interfaceC24998b;
                                this.label = 4;
                                if (interfaceC24998b.emit(null, this) == objF) {
                                    return objF;
                                }
                            } else {
                                this.L$0 = interfaceC24998b;
                                this.label = 5;
                                if (interfaceC24998b.emit(uGCVideoDetailPlayBean2, this) == objF) {
                                    return objF;
                                }
                            }
                        } else {
                            this.L$0 = null;
                            this.label = 6;
                            if (interfaceC24998b.emit(null, this) == objF) {
                                return objF;
                            }
                        }
                    } else {
                        this.L$0 = null;
                        this.label = 7;
                        if (interfaceC24998b.emit(uGCVideoDetailPlayBean, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f75682a;
                case 2:
                    interfaceC24998b = (InterfaceC24998b) this.L$0;
                    ResultKt.m97107b(obj);
                    str = (String) obj;
                    if (str != null) {
                        UGCVideoDetailPlayDao uGCVideoDetailPlayDaoM84265K4 = this.this$0.m84265K();
                        this.L$0 = interfaceC24998b;
                        this.label = 3;
                        obj = uGCVideoDetailPlayDaoM84265K4.mo64966c(str, this);
                        if (obj == objF) {
                            return objF;
                        }
                        uGCVideoDetailPlayBean2 = (UGCVideoDetailPlayBean) obj;
                        if (uGCVideoDetailPlayBean2 == null) {
                            this.L$0 = interfaceC24998b;
                            this.label = 4;
                            if (interfaceC24998b.emit(null, this) == objF) {
                                return objF;
                            }
                        } else {
                            this.L$0 = interfaceC24998b;
                            this.label = 5;
                            if (interfaceC24998b.emit(uGCVideoDetailPlayBean2, this) == objF) {
                                return objF;
                            }
                        }
                    } else {
                        this.L$0 = null;
                        this.label = 6;
                        if (interfaceC24998b.emit(null, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f75682a;
                case 3:
                    interfaceC24998b = (InterfaceC24998b) this.L$0;
                    ResultKt.m97107b(obj);
                    uGCVideoDetailPlayBean2 = (UGCVideoDetailPlayBean) obj;
                    if (uGCVideoDetailPlayBean2 == null) {
                        this.L$0 = interfaceC24998b;
                        this.label = 4;
                        if (interfaceC24998b.emit(null, this) == objF) {
                            return objF;
                        }
                    } else {
                        this.L$0 = interfaceC24998b;
                        this.label = 5;
                        if (interfaceC24998b.emit(uGCVideoDetailPlayBean2, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f75682a;
                case 4:
                case 5:
                case 6:
                case 7:
                    ResultKt.m97107b(obj);
                    return Unit.f75682a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$loadHistory$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/baselib/db/video/UGCVideoDetailPlayBean;", "", "e", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$loadHistory$1$2", m97637f = "UGCVideoDetailViewModel.kt", m97638l = {176}, m97639m = "invokeSuspend")
    static final class C203722 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C203722(Continuation<? super C203722> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C203722 c203722 = new C203722(continuation);
            c203722.L$0 = interfaceC24998b;
            return c203722.invokeSuspend(Unit.f75682a);
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

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$loadHistory$1$a */
    static final class C20373a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ UGCVideoDetailViewModel f64549a;

        C20373a(UGCVideoDetailViewModel uGCVideoDetailViewModel) {
            this.f64549a = uGCVideoDetailViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(UGCVideoDetailPlayBean uGCVideoDetailPlayBean, Continuation continuation) {
            this.f64549a.m84277Y().mo14858q(uGCVideoDetailPlayBean);
            this.f64549a.m84262H().mo14858q(uGCVideoDetailPlayBean);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UGCVideoDetailViewModel$loadHistory$1(UGCVideoDetailViewModel uGCVideoDetailViewModel, String str, Continuation<? super UGCVideoDetailViewModel$loadHistory$1> continuation) {
        super(2, continuation);
        this.this$0 = uGCVideoDetailViewModel;
        this.$ugcVideoId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCVideoDetailViewModel$loadHistory$1(this.this$0, this.$ugcVideoId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UGCVideoDetailViewModel$loadHistory$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C203711(this.this$0, this.$ugcVideoId, null)), C25220y0.m99268b()), new C203722(null));
            C20373a c20373a = new C20373a(this.this$0);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c20373a, this) == objF) {
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
