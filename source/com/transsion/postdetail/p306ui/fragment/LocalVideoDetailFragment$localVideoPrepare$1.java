package com.transsion.postdetail.p306ui.fragment;

import android.media.MediaMetadataRetriever;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC24995a;
import kotlinx.coroutines.flow.InterfaceC24998b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment$localVideoPrepare$1", m97637f = "LocalVideoDetailFragment.kt", m97638l = {942}, m97639m = "invokeSuspend")
final class LocalVideoDetailFragment$localVideoPrepare$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $path;
    int label;
    final /* synthetic */ LocalVideoDetailFragment this$0;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment$localVideoPrepare$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lkotlin/Triple;", "", "", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment$localVideoPrepare$1$1", m97637f = "LocalVideoDetailFragment.kt", m97638l = {939}, m97639m = "invokeSuspend")
    static final class C170211 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $path;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ LocalVideoDetailFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C170211(String str, LocalVideoDetailFragment localVideoDetailFragment, Continuation<? super C170211> continuation) {
            super(2, continuation);
            this.$path = str;
            this.this$0 = localVideoDetailFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C170211 c170211 = new C170211(this.$path, this.this$0, continuation);
            c170211.L$0 = obj;
            return c170211;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C170211) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Long lX;
            Integer numV;
            Integer numV2;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC24998b interfaceC24998b = (InterfaceC24998b) this.L$0;
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                Ref.IntRef intRef = new Ref.IntRef();
                Ref.IntRef intRef2 = new Ref.IntRef();
                Ref.LongRef longRef = new Ref.LongRef();
                try {
                    try {
                        String str = this.$path;
                        LocalVideoDetailFragment localVideoDetailFragment = this.this$0;
                        mediaMetadataRetriever.setDataSource(str);
                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                        intRef.element = (strExtractMetadata == null || (numV2 = StringsKt.m98216v(strExtractMetadata)) == null) ? 0 : numV2.intValue();
                        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                        intRef2.element = (strExtractMetadata2 == null || (numV = StringsKt.m98216v(strExtractMetadata2)) == null) ? 0 : numV.intValue();
                        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                        longRef.element = (strExtractMetadata3 == null || (lX = StringsKt.m98218x(strExtractMetadata3)) == null) ? 0L : lX.longValue();
                        C26866a.a aVar = C26866a.f81698a;
                        C26866a.a.m104898f(aVar, localVideoDetailFragment.TAG, "play width:" + intRef.element + ",height:" + intRef2.element, false, 4, null);
                        C26866a.a.m104898f(aVar, localVideoDetailFragment.TAG, "play duration:" + longRef.element, false, 4, null);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        intRef.element = 0;
                        intRef2.element = 0;
                        longRef.element = 0L;
                    }
                    mediaMetadataRetriever.release();
                    Triple triple = new Triple(Boxing.m97634d(intRef.element), Boxing.m97634d(intRef2.element), Boxing.m97635e(longRef.element));
                    this.label = 1;
                    if (interfaceC24998b.emit(triple, this) == objF) {
                        return objF;
                    }
                } catch (Throwable th2) {
                    mediaMetadataRetriever.release();
                    throw th2;
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

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment$localVideoPrepare$1$2 */
    @Metadata(m97099d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lkotlin/Triple;", "", "", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment$localVideoPrepare$1$2", m97637f = "LocalVideoDetailFragment.kt", m97638l = {941}, m97639m = "invokeSuspend")
    static final class C170222 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C170222(Continuation<? super C170222> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C170222 c170222 = new C170222(continuation);
            c170222.L$0 = interfaceC24998b;
            return c170222.invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC24998b interfaceC24998b = (InterfaceC24998b) this.L$0;
                Triple triple = new Triple(Boxing.m97634d(0), Boxing.m97634d(0), Boxing.m97635e(0L));
                this.label = 1;
                if (interfaceC24998b.emit(triple, this) == objF) {
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

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment$localVideoPrepare$1$a */
    static final class C17023a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ LocalVideoDetailFragment f57173a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f57174b;

        C17023a(LocalVideoDetailFragment localVideoDetailFragment, String str) {
            this.f57173a = localVideoDetailFragment;
            this.f57174b = str;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Triple triple, Continuation continuation) {
            C26866a.a.m104908v(C26866a.f81698a, this.f57173a.TAG, "Prepare success width = " + triple.getFirst() + "， height = " + triple.getSecond() + " ,duration = " + triple.getThird() + ",completed = " + this.f57173a.completed, false, 4, null);
            this.f57173a.duration = ((Number) triple.getThird()).longValue();
            this.f57173a.videoWidth = ((Number) triple.getFirst()).intValue();
            this.f57173a.videoHeight = ((Number) triple.getSecond()).intValue();
            this.f57173a.m74126b3(((Number) triple.getFirst()).intValue(), ((Number) triple.getSecond()).intValue(), this.f57174b);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocalVideoDetailFragment$localVideoPrepare$1(String str, LocalVideoDetailFragment localVideoDetailFragment, Continuation<? super LocalVideoDetailFragment$localVideoPrepare$1> continuation) {
        super(2, continuation);
        this.$path = str;
        this.this$0 = localVideoDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalVideoDetailFragment$localVideoPrepare$1(this.$path, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((LocalVideoDetailFragment$localVideoPrepare$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C170211(this.$path, this.this$0, null)), C25220y0.m99268b()), new C170222(null));
            C17023a c17023a = new C17023a(this.this$0, this.$path);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c17023a, this) == objF) {
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
