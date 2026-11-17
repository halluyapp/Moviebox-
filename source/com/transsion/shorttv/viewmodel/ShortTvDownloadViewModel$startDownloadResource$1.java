package com.transsion.shorttv.viewmodel;

import com.blankj.utilcode.util.AbstractC5796o;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.shorttv.bean.DownloadItem;
import com.transsion.shorttv.bean.StartDownloadBean;
import com.transsion.shorttv.bean.StartDownloadResponseBean;
import com.transsion.shorttv.bean.StartRequestBean;
import java.util.ArrayList;
import java.util.List;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC24995a;
import kotlinx.coroutines.flow.InterfaceC24998b;
import okhttp3.RequestBody;
import p411fh.C23367b;
import p790ts.InterfaceC27847a;
import p978zg.C29182a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvDownloadViewModel$startDownloadResource$1", m97637f = "ShortTvDownloadViewModel.kt", m97638l = {237}, m97639m = "invokeSuspend")
final class ShortTvDownloadViewModel$startDownloadResource$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<DownloadItem> $beanList;
    final /* synthetic */ String $subjectId;
    int label;
    final /* synthetic */ ShortTvDownloadViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.shorttv.viewmodel.ShortTvDownloadViewModel$startDownloadResource$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/shorttv/bean/StartDownloadResponseBean;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvDownloadViewModel$startDownloadResource$1$1", m97637f = "ShortTvDownloadViewModel.kt", m97638l = {234, 235}, m97639m = "invokeSuspend")
    @SourceDebugExtension
    static final class C191731 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<DownloadItem> $beanList;
        final /* synthetic */ String $subjectId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ShortTvDownloadViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C191731(List<DownloadItem> list, ShortTvDownloadViewModel shortTvDownloadViewModel, String str, Continuation<? super C191731> continuation) {
            super(2, continuation);
            this.$beanList = list;
            this.this$0 = shortTvDownloadViewModel;
            this.$subjectId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C191731 c191731 = new C191731(this.$beanList, this.this$0, this.$subjectId, continuation);
            c191731.L$0 = obj;
            return c191731;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C191731) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
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
            ArrayList arrayList = new ArrayList();
            List<DownloadItem> list = this.$beanList;
            String str = this.$subjectId;
            for (DownloadItem downloadItem : list) {
                arrayList.add(new StartDownloadBean(str, downloadItem.getResourceId(), downloadItem.getEpse()));
            }
            InterfaceC27847a interfaceC27847aM80262k = this.this$0.m80262k();
            String strM111992a = C29182a.f89053a.m111992a();
            C23367b.a aVar = C23367b.f71265a;
            String strM27447j = AbstractC5796o.m27447j(new StartRequestBean(arrayList));
            Intrinsics.m97801g(strM27447j, "toJson(...)");
            RequestBody requestBodyM92796a = aVar.m92796a(strM27447j);
            this.L$0 = interfaceC24998b;
            this.label = 1;
            obj = interfaceC27847aM80262k.m108236b(strM111992a, requestBodyM92796a, this);
            if (obj == objF) {
                return objF;
            }
            Object data = ((BaseDto) obj).getData();
            this.L$0 = null;
            this.label = 2;
            if (interfaceC24998b.emit(data, this) == objF) {
                return objF;
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.viewmodel.ShortTvDownloadViewModel$startDownloadResource$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/shorttv/bean/StartDownloadResponseBean;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvDownloadViewModel$startDownloadResource$1$2", m97637f = "ShortTvDownloadViewModel.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C191742 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        int label;

        C191742(Continuation<? super C191742> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            return new C191742(continuation).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.viewmodel.ShortTvDownloadViewModel$startDownloadResource$1$a */
    static final class C19175a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        public static final C19175a f61596a = new C19175a();

        C19175a() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(StartDownloadResponseBean startDownloadResponseBean, Continuation continuation) {
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvDownloadViewModel$startDownloadResource$1(List<DownloadItem> list, ShortTvDownloadViewModel shortTvDownloadViewModel, String str, Continuation<? super ShortTvDownloadViewModel$startDownloadResource$1> continuation) {
        super(2, continuation);
        this.$beanList = list;
        this.this$0 = shortTvDownloadViewModel;
        this.$subjectId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTvDownloadViewModel$startDownloadResource$1(this.$beanList, this.this$0, this.$subjectId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTvDownloadViewModel$startDownloadResource$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98799r(new C191731(this.$beanList, this.this$0, this.$subjectId, null)), new C191742(null));
            C19175a c19175a = C19175a.f61596a;
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c19175a, this) == objF) {
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
