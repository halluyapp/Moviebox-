package com.transsion.ugcvideodetail.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.ugcvideodetail.api.bean.UGCVideoFavoriteResponse;
import com.transsion.ugcvideodetail.api.bean.UGCVideoInteractiveEntity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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
import p922xv.InterfaceC28667a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$toggleFavorite$1", m97637f = "UGCVideoDetailViewModel.kt", m97638l = {554}, m97639m = "invokeSuspend")
final class UGCVideoDetailViewModel$toggleFavorite$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFavorite;
    final /* synthetic */ String $ugcVideoId;
    int label;
    final /* synthetic */ UGCVideoDetailViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$toggleFavorite$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$toggleFavorite$1$1", m97637f = "UGCVideoDetailViewModel.kt", m97638l = {544, 547, 549}, m97639m = "invokeSuspend")
    static final class C203741 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isFavorite;
        final /* synthetic */ String $ugcVideoId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UGCVideoDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203741(UGCVideoDetailViewModel uGCVideoDetailViewModel, String str, boolean z11, Continuation<? super C203741> continuation) {
            super(2, continuation);
            this.this$0 = uGCVideoDetailViewModel;
            this.$ugcVideoId = str;
            this.$isFavorite = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C203741 c203741 = new C203741(this.this$0, this.$ugcVideoId, this.$isFavorite, continuation);
            c203741.L$0 = obj;
            return c203741;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C203741) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC24998b interfaceC24998b;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    interfaceC24998b = (InterfaceC24998b) this.L$0;
                    ResultKt.m97107b(obj);
                } else {
                    if (i11 != 2 && i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(obj);
                }
                return Unit.f75682a;
            }
            ResultKt.m97107b(obj);
            interfaceC24998b = (InterfaceC24998b) this.L$0;
            UGCVideoInteractiveEntity uGCVideoInteractiveEntity = new UGCVideoInteractiveEntity();
            String str = this.$ugcVideoId;
            boolean z11 = this.$isFavorite;
            uGCVideoInteractiveEntity.setUgcVideoId(str);
            uGCVideoInteractiveEntity.setReqType(z11 ? 1 : 0);
            InterfaceC28667a interfaceC28667aM84228F = this.this$0.m84228F();
            this.L$0 = interfaceC24998b;
            this.label = 1;
            obj = InterfaceC28667a.a.m110473f(interfaceC28667aM84228F, uGCVideoInteractiveEntity, null, this, 2, null);
            if (obj == objF) {
                return objF;
            }
            BaseDto baseDto = (BaseDto) obj;
            if (!Intrinsics.m97797c(baseDto.getCode(), "0") || baseDto.getData() == null) {
                this.L$0 = null;
                this.label = 3;
                if (interfaceC24998b.emit(null, this) == objF) {
                    return objF;
                }
            } else {
                Object data = baseDto.getData();
                Intrinsics.m97800f(data, "null cannot be cast to non-null type com.transsion.ugcvideodetail.api.bean.UGCVideoFavoriteResponse");
                Boolean boolM97631a = Boxing.m97631a(((UGCVideoFavoriteResponse) data).isAffected());
                this.L$0 = null;
                this.label = 2;
                if (interfaceC24998b.emit(boolM97631a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$toggleFavorite$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "", "", "e", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$toggleFavorite$1$2", m97637f = "UGCVideoDetailViewModel.kt", m97638l = {553}, m97639m = "invokeSuspend")
    static final class C203752 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C203752(Continuation<? super C203752> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C203752 c203752 = new C203752(continuation);
            c203752.L$0 = interfaceC24998b;
            return c203752.invokeSuspend(Unit.f75682a);
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

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$toggleFavorite$1$a */
    static final class C20376a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        public static final C20376a f64550a = new C20376a();

        C20376a() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Boolean bool, Continuation continuation) {
            if (bool != null) {
                Intrinsics.m97797c(bool, Boxing.m97631a(false));
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UGCVideoDetailViewModel$toggleFavorite$1(UGCVideoDetailViewModel uGCVideoDetailViewModel, String str, boolean z11, Continuation<? super UGCVideoDetailViewModel$toggleFavorite$1> continuation) {
        super(2, continuation);
        this.this$0 = uGCVideoDetailViewModel;
        this.$ugcVideoId = str;
        this.$isFavorite = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCVideoDetailViewModel$toggleFavorite$1(this.this$0, this.$ugcVideoId, this.$isFavorite, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UGCVideoDetailViewModel$toggleFavorite$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C203741(this.this$0, this.$ugcVideoId, this.$isFavorite, null)), C25220y0.m99268b()), new C203752(null));
            C20376a c20376a = C20376a.f64550a;
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c20376a, this) == objF) {
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
