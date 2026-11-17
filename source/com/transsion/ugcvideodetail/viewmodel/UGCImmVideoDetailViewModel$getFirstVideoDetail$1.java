package com.transsion.ugcvideodetail.viewmodel;

import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoPlayInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.InterfaceC25165r0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel$getFirstVideoDetail$1", m97637f = "UGCImmVideoDetailViewModel.kt", m97638l = {303}, m97639m = "invokeSuspend")
final class UGCImmVideoDetailViewModel$getFirstVideoDetail$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $collectionId;
    final /* synthetic */ String $ugcVideoId;
    int label;
    final /* synthetic */ UGCImmVideoDetailViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel$getFirstVideoDetail$1$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel$getFirstVideoDetail$1$1", m97637f = "UGCImmVideoDetailViewModel.kt", m97638l = {327, 328, 330}, m97639m = "invokeSuspend")
    static final class C203371 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $collectionId;
        final /* synthetic */ String $ugcVideoId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UGCImmVideoDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203371(UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel, String str, String str2, Continuation<? super C203371> continuation) {
            super(2, continuation);
            this.this$0 = uGCImmVideoDetailViewModel;
            this.$ugcVideoId = str;
            this.$collectionId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C203371 c203371 = new C203371(this.this$0, this.$ugcVideoId, this.$collectionId, continuation);
            c203371.L$0 = obj;
            return c203371;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C203371) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x008c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC25165r0 interfaceC25165r0;
            UGCVideo uGCVideo;
            UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    interfaceC25165r0 = (InterfaceC25165r0) this.L$0;
                    ResultKt.m97107b(obj);
                } else if (i11 == 2) {
                    uGCVideo = (UGCVideo) this.L$0;
                    ResultKt.m97107b(obj);
                    uGCImmVideoDetailViewModel = this.this$0;
                    this.L$0 = null;
                    this.label = 3;
                    if (uGCImmVideoDetailViewModel.m84171a1(uGCVideo, (UGCVideoPlayInfo) obj, this) == objF) {
                        return objF;
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
            InterfaceC25149n0 interfaceC25149n0 = (InterfaceC25149n0) this.L$0;
            InterfaceC25165r0 interfaceC25165r0M99056b = AbstractC25136k.m99056b(interfaceC25149n0, C25220y0.m99268b(), null, new C20338x6f355509(this.this$0, this.$ugcVideoId, this.$collectionId, null), 2, null);
            InterfaceC25165r0 interfaceC25165r0M99056b2 = AbstractC25136k.m99056b(interfaceC25149n0, C25220y0.m99268b(), null, new C20339x2054a27a(this.this$0, this.$ugcVideoId, null), 2, null);
            this.L$0 = interfaceC25165r0M99056b2;
            this.label = 1;
            Object objMo99104h = interfaceC25165r0M99056b.mo99104h(this);
            if (objMo99104h == objF) {
                return objF;
            }
            interfaceC25165r0 = interfaceC25165r0M99056b2;
            obj = objMo99104h;
            UGCVideo uGCVideo2 = (UGCVideo) obj;
            this.L$0 = uGCVideo2;
            this.label = 2;
            Object objMo99104h2 = interfaceC25165r0.mo99104h(this);
            if (objMo99104h2 == objF) {
                return objF;
            }
            uGCVideo = uGCVideo2;
            obj = objMo99104h2;
            uGCImmVideoDetailViewModel = this.this$0;
            this.L$0 = null;
            this.label = 3;
            if (uGCImmVideoDetailViewModel.m84171a1(uGCVideo, (UGCVideoPlayInfo) obj, this) == objF) {
                return objF;
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UGCImmVideoDetailViewModel$getFirstVideoDetail$1(UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel, String str, String str2, Continuation<? super UGCImmVideoDetailViewModel$getFirstVideoDetail$1> continuation) {
        super(2, continuation);
        this.this$0 = uGCImmVideoDetailViewModel;
        this.$ugcVideoId = str;
        this.$collectionId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCImmVideoDetailViewModel$getFirstVideoDetail$1(this.this$0, this.$ugcVideoId, this.$collectionId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UGCImmVideoDetailViewModel$getFirstVideoDetail$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            C203371 c203371 = new C203371(this.this$0, this.$ugcVideoId, this.$collectionId, null);
            this.label = 1;
            if (AbstractC25153o0.m99083e(c203371, this) == objF) {
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
