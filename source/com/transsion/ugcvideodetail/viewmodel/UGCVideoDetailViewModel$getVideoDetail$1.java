package com.transsion.ugcvideodetail.viewmodel;

import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
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
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$getVideoDetail$1", m97637f = "UGCVideoDetailViewModel.kt", m97638l = {264}, m97639m = "invokeSuspend")
final class UGCVideoDetailViewModel$getVideoDetail$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $collectionId;
    final /* synthetic */ String $ugcVideoId;
    int label;
    final /* synthetic */ UGCVideoDetailViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$getVideoDetail$1$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$getVideoDetail$1$1", m97637f = "UGCVideoDetailViewModel.kt", m97638l = {288, 289}, m97639m = "invokeSuspend")
    static final class C203671 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $collectionId;
        final /* synthetic */ String $ugcVideoId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UGCVideoDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203671(UGCVideoDetailViewModel uGCVideoDetailViewModel, String str, String str2, Continuation<? super C203671> continuation) {
            super(2, continuation);
            this.this$0 = uGCVideoDetailViewModel;
            this.$ugcVideoId = str;
            this.$collectionId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C203671 c203671 = new C203671(this.this$0, this.$ugcVideoId, this.$collectionId, continuation);
            c203671.L$0 = obj;
            return c203671;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C203671) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00a6 A[PHI: r1
          0x00a6: PHI (r1v14 java.lang.String) = (r1v13 java.lang.String), (r1v16 java.lang.String) binds: [B:23:0x009d, B:25:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:29:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
        /* JADX WARN: Instruction removed from duplicated block: B:34:0x00c4, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC25165r0 interfaceC25165r0;
            UGCVideo uGCVideo;
            UGCVideoBelongToCollection belongToCollection;
            UGCVideoDetailViewModel uGCVideoDetailViewModel;
            String collectionId;
            Integer position;
            int iIntValue;
            int iMax;
            int i11;
            Object objF = IntrinsicsKt.m97630f();
            int i12 = this.label;
            if (i12 != 0) {
                if (i12 == 1) {
                    interfaceC25165r0 = (InterfaceC25165r0) this.L$0;
                    ResultKt.m97107b(obj);
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uGCVideo = (UGCVideo) this.L$0;
                    ResultKt.m97107b(obj);
                }
                this.this$0.f64528n.mo14858q(uGCVideo);
                this.this$0.f64530p.mo14858q((UGCVideoPlayInfo) obj);
                if (uGCVideo != null && (belongToCollection = uGCVideo.getBelongToCollection()) != null) {
                    uGCVideoDetailViewModel = this.this$0;
                    collectionId = (String) uGCVideoDetailViewModel.m84257B().m14847f();
                    if (collectionId == null || (collectionId = belongToCollection.getCollectionId()) != null) {
                        position = belongToCollection.getPosition();
                        if (position != null) {
                            iIntValue = position.intValue();
                        } else {
                            iIntValue = 1;
                        }
                        iMax = Math.max(iIntValue - 4, 1);
                        i11 = iMax + 7;
                        if (uGCVideoDetailViewModel.m84242k0(collectionId, iMax, i11)) {
                            uGCVideoDetailViewModel.m84276X(collectionId, iMax, i11, true);
                        } else {
                            C26866a.a.m104898f(C26866a.f81698a, "UGCVideoDetailViewModel", "Skip duplicate playList request: collectionId=" + collectionId + ", start=" + iMax + ", end=" + i11, false, 4, null);
                        }
                    }
                }
                return Unit.f75682a;
            }
            ResultKt.m97107b(obj);
            InterfaceC25149n0 interfaceC25149n0 = (InterfaceC25149n0) this.L$0;
            InterfaceC25165r0 interfaceC25165r0M99056b = AbstractC25136k.m99056b(interfaceC25149n0, C25220y0.m99268b(), null, new UGCVideoDetailViewModel$getVideoDetail$1$1$detailDeferred$1(this.this$0, this.$ugcVideoId, this.$collectionId, null), 2, null);
            InterfaceC25165r0 interfaceC25165r0M99056b2 = AbstractC25136k.m99056b(interfaceC25149n0, C25220y0.m99268b(), null, new UGCVideoDetailViewModel$getVideoDetail$1$1$playInfoDeferred$1(this.this$0, this.$ugcVideoId, null), 2, null);
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
            this.this$0.f64528n.mo14858q(uGCVideo);
            this.this$0.f64530p.mo14858q((UGCVideoPlayInfo) obj);
            if (uGCVideo != null) {
                uGCVideoDetailViewModel = this.this$0;
                collectionId = (String) uGCVideoDetailViewModel.m84257B().m14847f();
                if (collectionId == null) {
                    position = belongToCollection.getPosition();
                    if (position != null) {
                        iIntValue = position.intValue();
                    } else {
                        iIntValue = 1;
                    }
                    iMax = Math.max(iIntValue - 4, 1);
                    i11 = iMax + 7;
                    if (uGCVideoDetailViewModel.m84242k0(collectionId, iMax, i11)) {
                        uGCVideoDetailViewModel.m84276X(collectionId, iMax, i11, true);
                    } else {
                        C26866a.a.m104898f(C26866a.f81698a, "UGCVideoDetailViewModel", "Skip duplicate playList request: collectionId=" + collectionId + ", start=" + iMax + ", end=" + i11, false, 4, null);
                    }
                } else {
                    position = belongToCollection.getPosition();
                    if (position != null) {
                        iIntValue = position.intValue();
                    } else {
                        iIntValue = 1;
                    }
                    iMax = Math.max(iIntValue - 4, 1);
                    i11 = iMax + 7;
                    if (uGCVideoDetailViewModel.m84242k0(collectionId, iMax, i11)) {
                        uGCVideoDetailViewModel.m84276X(collectionId, iMax, i11, true);
                    } else {
                        C26866a.a.m104898f(C26866a.f81698a, "UGCVideoDetailViewModel", "Skip duplicate playList request: collectionId=" + collectionId + ", start=" + iMax + ", end=" + i11, false, 4, null);
                    }
                }
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UGCVideoDetailViewModel$getVideoDetail$1(UGCVideoDetailViewModel uGCVideoDetailViewModel, String str, String str2, Continuation<? super UGCVideoDetailViewModel$getVideoDetail$1> continuation) {
        super(2, continuation);
        this.this$0 = uGCVideoDetailViewModel;
        this.$ugcVideoId = str;
        this.$collectionId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCVideoDetailViewModel$getVideoDetail$1(this.this$0, this.$ugcVideoId, this.$collectionId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UGCVideoDetailViewModel$getVideoDetail$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            C203671 c203671 = new C203671(this.this$0, this.$ugcVideoId, this.$collectionId, null);
            this.label = 1;
            if (AbstractC25153o0.m99083e(c203671, this) == objF) {
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
