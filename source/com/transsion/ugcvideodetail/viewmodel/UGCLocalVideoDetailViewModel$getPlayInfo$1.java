package com.transsion.ugcvideodetail.viewmodel;

import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayBean;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayDao;
import com.transsnet.downloader.manager.DownloadEsHelper;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
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
@DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCLocalVideoDetailViewModel$getPlayInfo$1", m97637f = "UGCLocalVideoDetailViewModel.kt", m97638l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m97639m = "invokeSuspend")
final class UGCLocalVideoDetailViewModel$getPlayInfo$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $resourceId;
    int label;
    final /* synthetic */ UGCLocalVideoDetailViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCLocalVideoDetailViewModel$getPlayInfo$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/baselib/db/download/DownloadBean;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCLocalVideoDetailViewModel$getPlayInfo$1$1", m97637f = "UGCLocalVideoDetailViewModel.kt", m97638l = {Sdk$SDKMetric.SDKMetricType.AD_BACKGROUND_BEFORE_IMPRESSION_VALUE, Sdk$SDKMetric.SDKMetricType.AD_VISIBILITY_VALUE, 61}, m97639m = "invokeSuspend")
    static final class C203561 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $resourceId;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ UGCLocalVideoDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203561(String str, UGCLocalVideoDetailViewModel uGCLocalVideoDetailViewModel, Continuation<? super C203561> continuation) {
            super(2, continuation);
            this.$resourceId = str;
            this.this$0 = uGCLocalVideoDetailViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C203561 c203561 = new C203561(this.$resourceId, this.this$0, continuation);
            c203561.L$0 = obj;
            return c203561;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C203561) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0074  */
        /* JADX WARN: Code duplicated, block: B:30:0x008a A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC24998b interfaceC24998b;
            DownloadBean downloadBean;
            String ugcVideoId;
            DownloadBean downloadBean2;
            InterfaceC24998b interfaceC24998b2;
            UGCVideoDetailPlayBean uGCVideoDetailPlayBean;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    interfaceC24998b = (InterfaceC24998b) this.L$0;
                    ResultKt.m97107b(obj);
                } else if (i11 == 2) {
                    downloadBean2 = (DownloadBean) this.L$1;
                    interfaceC24998b2 = (InterfaceC24998b) this.L$0;
                    ResultKt.m97107b(obj);
                    uGCVideoDetailPlayBean = (UGCVideoDetailPlayBean) obj;
                    if (uGCVideoDetailPlayBean != null) {
                        downloadBean2.setReadProgress(uGCVideoDetailPlayBean.getProgress());
                    }
                    downloadBean = downloadBean2;
                    interfaceC24998b = interfaceC24998b2;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    if (interfaceC24998b.emit(downloadBean, this) == objF) {
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
            InterfaceC24998b interfaceC24998b3 = (InterfaceC24998b) this.L$0;
            DownloadEsHelper downloadEsHelperM88598a = DownloadEsHelper.f67591m.m88598a();
            String str = this.$resourceId;
            this.L$0 = interfaceC24998b3;
            this.label = 1;
            Object objM88588p = downloadEsHelperM88598a.m88588p(str, this);
            if (objM88588p == objF) {
                return objF;
            }
            interfaceC24998b = interfaceC24998b3;
            obj = objM88588p;
            downloadBean = (DownloadBean) obj;
            if (downloadBean != null && (ugcVideoId = downloadBean.getUgcVideoId()) != null) {
                UGCVideoDetailPlayDao uGCVideoDetailPlayDaoM84218g = this.this$0.m84218g();
                this.L$0 = interfaceC24998b;
                this.L$1 = downloadBean;
                this.label = 2;
                Object objMo64981r = uGCVideoDetailPlayDaoM84218g.mo64981r(ugcVideoId, this);
                if (objMo64981r == objF) {
                    return objF;
                }
                InterfaceC24998b interfaceC24998b4 = interfaceC24998b;
                downloadBean2 = downloadBean;
                obj = objMo64981r;
                interfaceC24998b2 = interfaceC24998b4;
                uGCVideoDetailPlayBean = (UGCVideoDetailPlayBean) obj;
                if (uGCVideoDetailPlayBean != null) {
                    downloadBean2.setReadProgress(uGCVideoDetailPlayBean.getProgress());
                }
                downloadBean = downloadBean2;
                interfaceC24998b = interfaceC24998b2;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            if (interfaceC24998b.emit(downloadBean, this) == objF) {
                return objF;
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCLocalVideoDetailViewModel$getPlayInfo$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/baselib/db/download/DownloadBean;", "", "e", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCLocalVideoDetailViewModel$getPlayInfo$1$2", m97637f = "UGCLocalVideoDetailViewModel.kt", m97638l = {64}, m97639m = "invokeSuspend")
    static final class C203572 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C203572(Continuation<? super C203572> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C203572 c203572 = new C203572(continuation);
            c203572.L$0 = interfaceC24998b;
            return c203572.invokeSuspend(Unit.f75682a);
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

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCLocalVideoDetailViewModel$getPlayInfo$1$a */
    static final class C20358a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ UGCLocalVideoDetailViewModel f64505a;

        C20358a(UGCLocalVideoDetailViewModel uGCLocalVideoDetailViewModel) {
            this.f64505a = uGCLocalVideoDetailViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(DownloadBean downloadBean, Continuation continuation) {
            this.f64505a.m84223i().mo14858q(downloadBean);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UGCLocalVideoDetailViewModel$getPlayInfo$1(String str, UGCLocalVideoDetailViewModel uGCLocalVideoDetailViewModel, Continuation<? super UGCLocalVideoDetailViewModel$getPlayInfo$1> continuation) {
        super(2, continuation);
        this.$resourceId = str;
        this.this$0 = uGCLocalVideoDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCLocalVideoDetailViewModel$getPlayInfo$1(this.$resourceId, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UGCLocalVideoDetailViewModel$getPlayInfo$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C203561(this.$resourceId, this.this$0, null)), C25220y0.m99268b()), new C203572(null));
            C20358a c20358a = new C20358a(this.this$0);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c20358a, this) == objF) {
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
