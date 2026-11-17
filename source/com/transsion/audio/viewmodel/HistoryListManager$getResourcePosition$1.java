package com.transsion.audio.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.baselib.p291db.audio.AudioBean;
import com.transsion.moviedetailapi.DownloadItem;
import com.transsnet.downloader.bean.DownloadListBean;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import fj.InterfaceC23383a;
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
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC24995a;
import kotlinx.coroutines.flow.InterfaceC24998b;
import p602mj.InterfaceC25866a;
import p978zg.C29182a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.audio.viewmodel.HistoryListManager$getResourcePosition$1", m97637f = "HistoryListManager.kt", m97638l = {145}, m97639m = "invokeSuspend")
final class HistoryListManager$getResourcePosition$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $postId;
    final /* synthetic */ int $resourceNum;
    final /* synthetic */ String $subjectId;
    int label;
    final /* synthetic */ HistoryListManager this$0;

    /* JADX INFO: renamed from: com.transsion.audio.viewmodel.HistoryListManager$getResourcePosition$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsnet/downloader/bean/DownloadListBean;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.audio.viewmodel.HistoryListManager$getResourcePosition$1$1", m97637f = "HistoryListManager.kt", m97638l = {Sdk$SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 139, 141}, m97639m = "invokeSuspend")
    static final class C142701 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $postId;
        final /* synthetic */ int $resourceNum;
        final /* synthetic */ String $subjectId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HistoryListManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C142701(HistoryListManager historyListManager, String str, String str2, int i11, Continuation<? super C142701> continuation) {
            super(2, continuation);
            this.this$0 = historyListManager;
            this.$subjectId = str;
            this.$postId = str2;
            this.$resourceNum = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C142701 c142701 = new C142701(this.this$0, this.$subjectId, this.$postId, this.$resourceNum, continuation);
            c142701.L$0 = obj;
            return c142701;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C142701) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC24998b interfaceC24998b;
            DownloadListBean downloadListBean;
            List<DownloadItem> items;
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
            InterfaceC23383a interfaceC23383aM64696u = this.this$0.m64696u();
            String strM111992a = C29182a.f89053a.m111992a();
            String str = this.$subjectId;
            String str2 = this.$postId;
            int i12 = this.$resourceNum;
            this.L$0 = interfaceC24998b;
            this.label = 1;
            obj = interfaceC23383aM64696u.m92906a(strM111992a, str, str2, i12, this);
            if (obj == objF) {
                return objF;
            }
            BaseDto baseDto = (BaseDto) obj;
            if (Intrinsics.m97797c(baseDto.getCode(), "0") && ((downloadListBean = (DownloadListBean) baseDto.getData()) == null || (items = downloadListBean.getItems()) == null || !items.isEmpty())) {
                Object data = baseDto.getData();
                this.L$0 = null;
                this.label = 3;
                if (interfaceC24998b.emit(data, this) == objF) {
                    return objF;
                }
            } else {
                this.L$0 = null;
                this.label = 2;
                if (interfaceC24998b.emit(null, this) == objF) {
                    return objF;
                }
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.audio.viewmodel.HistoryListManager$getResourcePosition$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsnet/downloader/bean/DownloadListBean;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.audio.viewmodel.HistoryListManager$getResourcePosition$1$2", m97637f = "HistoryListManager.kt", m97638l = {144}, m97639m = "invokeSuspend")
    static final class C142712 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C142712(Continuation<? super C142712> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C142712 c142712 = new C142712(continuation);
            c142712.L$0 = interfaceC24998b;
            return c142712.invokeSuspend(Unit.f75682a);
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

    /* JADX INFO: renamed from: com.transsion.audio.viewmodel.HistoryListManager$getResourcePosition$1$3 */
    static final class C142723 implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ HistoryListManager f50542a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f50543b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f50544c;

        C142723(HistoryListManager historyListManager, String str, String str2) {
            this.f50542a = historyListManager;
            this.f50543b = str;
            this.f50544c = str2;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0090  */
        /* JADX WARN: Code duplicated, block: B:37:0x009f  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(DownloadListBean downloadListBean, Continuation continuation) throws Throwable {
            HistoryListManager$getResourcePosition$1$3$emit$1 historyListManager$getResourcePosition$1$3$emit$1;
            AudioBean audioBean;
            InterfaceC25866a interfaceC25866aM64694q;
            List<DownloadItem> items;
            if (continuation instanceof HistoryListManager$getResourcePosition$1$3$emit$1) {
                historyListManager$getResourcePosition$1$3$emit$1 = (HistoryListManager$getResourcePosition$1$3$emit$1) continuation;
                int i11 = historyListManager$getResourcePosition$1$3$emit$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    historyListManager$getResourcePosition$1$3$emit$1.label = i11 - Integer.MIN_VALUE;
                } else {
                    historyListManager$getResourcePosition$1$3$emit$1 = new HistoryListManager$getResourcePosition$1$3$emit$1(this, continuation);
                }
            } else {
                historyListManager$getResourcePosition$1$3$emit$1 = new HistoryListManager$getResourcePosition$1$3$emit$1(this, continuation);
            }
            Object objMo101627g = historyListManager$getResourcePosition$1$3$emit$1.result;
            Object objF = IntrinsicsKt.m97630f();
            int i12 = historyListManager$getResourcePosition$1$3$emit$1.label;
            if (i12 != 0) {
                if (i12 == 1) {
                    downloadListBean = (DownloadListBean) historyListManager$getResourcePosition$1$3$emit$1.L$0;
                    ResultKt.m97107b(objMo101627g);
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(objMo101627g);
                }
                return Unit.f75682a;
            }
            ResultKt.m97107b(objMo101627g);
            HistoryListManager.C14268a c14268a = HistoryListManager.f50535e;
            if (!c14268a.m64708a()) {
                this.f50542a.m64706v().mo14855n(downloadListBean);
                c14268a.m64710c(true);
            } else if (downloadListBean != null) {
                this.f50542a.m64706v().mo14855n(downloadListBean);
            }
            InterfaceC25866a interfaceC25866aM64694q2 = this.f50542a.m64694q();
            if (interfaceC25866aM64694q2 != null) {
                String str = this.f50543b;
                String str2 = this.f50544c;
                historyListManager$getResourcePosition$1$3$emit$1.L$0 = downloadListBean;
                historyListManager$getResourcePosition$1$3$emit$1.label = 1;
                objMo101627g = interfaceC25866aM64694q2.mo101627g(str, str2, historyListManager$getResourcePosition$1$3$emit$1);
                if (objMo101627g == objF) {
                    return objF;
                }
            } else {
                audioBean = null;
            }
            if (downloadListBean != null && (items = downloadListBean.getItems()) != null && !items.isEmpty()) {
                if (audioBean != null) {
                    audioBean.setSe(items.get(0).getSe());
                }
                if (audioBean != null) {
                    audioBean.setEp(items.get(0).getEp());
                }
            }
            if (audioBean != null || (interfaceC25866aM64694q = this.f50542a.m64694q()) == null) {
                return Unit.f75682a;
            }
            historyListManager$getResourcePosition$1$3$emit$1.L$0 = null;
            historyListManager$getResourcePosition$1$3$emit$1.label = 2;
            if (interfaceC25866aM64694q.mo101626f(audioBean, historyListManager$getResourcePosition$1$3$emit$1) == objF) {
                return objF;
            }
            return Unit.f75682a;
            audioBean = (AudioBean) objMo101627g;
            if (downloadListBean != null) {
                if (audioBean != null) {
                    audioBean.setSe(items.get(0).getSe());
                }
                if (audioBean != null) {
                    audioBean.setEp(items.get(0).getEp());
                }
            }
            if (audioBean != null) {
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryListManager$getResourcePosition$1(HistoryListManager historyListManager, String str, String str2, int i11, Continuation<? super HistoryListManager$getResourcePosition$1> continuation) {
        super(2, continuation);
        this.this$0 = historyListManager;
        this.$subjectId = str;
        this.$postId = str2;
        this.$resourceNum = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryListManager$getResourcePosition$1(this.this$0, this.$subjectId, this.$postId, this.$resourceNum, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((HistoryListManager$getResourcePosition$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98799r(new C142701(this.this$0, this.$subjectId, this.$postId, this.$resourceNum, null)), new C142712(null));
            C142723 c142723 = new C142723(this.this$0, this.$subjectId, this.$postId);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c142723, this) == objF) {
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
