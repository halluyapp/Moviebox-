package com.transsion.subtitle.viewmodel;

import com.transsion.subtitle.bean.OpenSubtitleDownloadInfo;
import com.transsion.subtitle.helper.C19717b;
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
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC24995a;
import kotlinx.coroutines.flow.InterfaceC24998b;
import p528ju.C24469a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel$getOpenSubNewApiDownloadInfo$1", m97637f = "SubtitleDownloadViewModel.kt", m97638l = {163}, m97639m = "invokeSuspend")
final class SubtitleDownloadViewModel$getOpenSubNewApiDownloadInfo$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C24469a $item;
    int label;
    final /* synthetic */ SubtitleDownloadViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel$getOpenSubNewApiDownloadInfo$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/subtitle/bean/OpenSubtitleDownloadInfo;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel$getOpenSubNewApiDownloadInfo$1$1", m97637f = "SubtitleDownloadViewModel.kt", m97638l = {160, 160}, m97639m = "invokeSuspend")
    static final class C197331 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ C24469a $item;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C197331(C24469a c24469a, Continuation<? super C197331> continuation) {
            super(2, continuation);
            this.$item = c24469a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C197331 c197331 = new C197331(this.$item, continuation);
            c197331.L$0 = obj;
            return c197331;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C197331) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
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
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(obj);
                }
                return Unit.f75682a;
            }
            ResultKt.m97107b(obj);
            interfaceC24998b = (InterfaceC24998b) this.L$0;
            C19717b c19717b = C19717b.f62943a;
            String strM96012c = this.$item.m96012c();
            Intrinsics.m97799e(strM96012c);
            this.L$0 = interfaceC24998b;
            this.label = 1;
            obj = c19717b.m82164d(strM96012c, this);
            if (obj == objF) {
                return objF;
            }
            this.L$0 = null;
            this.label = 2;
            if (interfaceC24998b.emit(obj, this) == objF) {
                return objF;
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel$getOpenSubNewApiDownloadInfo$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/subtitle/bean/OpenSubtitleDownloadInfo;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel$getOpenSubNewApiDownloadInfo$1$2", m97637f = "SubtitleDownloadViewModel.kt", m97638l = {162}, m97639m = "invokeSuspend")
    static final class C197342 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C197342(Continuation<? super C197342> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C197342 c197342 = new C197342(continuation);
            c197342.L$0 = interfaceC24998b;
            return c197342.invokeSuspend(Unit.f75682a);
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

    /* JADX INFO: renamed from: com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel$getOpenSubNewApiDownloadInfo$1$a */
    static final class C19735a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C24469a f63022a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SubtitleDownloadViewModel f63023b;

        C19735a(C24469a c24469a, SubtitleDownloadViewModel subtitleDownloadViewModel) {
            this.f63022a = c24469a;
            this.f63023b = subtitleDownloadViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(OpenSubtitleDownloadInfo openSubtitleDownloadInfo, Continuation continuation) {
            if (openSubtitleDownloadInfo != null && openSubtitleDownloadInfo.getLink().length() > 0) {
                this.f63022a.m96011b().setUrl(openSubtitleDownloadInfo.getLink());
                this.f63023b.m82253l().mo14855n(this.f63022a);
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubtitleDownloadViewModel$getOpenSubNewApiDownloadInfo$1(C24469a c24469a, SubtitleDownloadViewModel subtitleDownloadViewModel, Continuation<? super SubtitleDownloadViewModel$getOpenSubNewApiDownloadInfo$1> continuation) {
        super(2, continuation);
        this.$item = c24469a;
        this.this$0 = subtitleDownloadViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubtitleDownloadViewModel$getOpenSubNewApiDownloadInfo$1(this.$item, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SubtitleDownloadViewModel$getOpenSubNewApiDownloadInfo$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98799r(new C197331(this.$item, null)), new C197342(null));
            C19735a c19735a = new C19735a(this.$item, this.this$0);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c19735a, this) == objF) {
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
