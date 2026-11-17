package com.transsion.postdetail.p306ui.view;

import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsnet.downloader.manager.DownloadEsHelper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.ui.view.ImmVideoItemView$saveBuiltInVideo$1", m97637f = "ImmVideoItemView.kt", m97638l = {1569, 1570}, m97639m = "invokeSuspend")
final class ImmVideoItemView$saveBuiltInVideo$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ DownloadBean $download;
    int label;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.ImmVideoItemView$saveBuiltInVideo$1$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.ui.view.ImmVideoItemView$saveBuiltInVideo$1$1", m97637f = "ImmVideoItemView.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C173171 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        int label;

        C173171(Continuation<? super C173171> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C173171(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C173171) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            C28951b.f88586a.m111455e("download success~");
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImmVideoItemView$saveBuiltInVideo$1(DownloadBean downloadBean, Continuation<? super ImmVideoItemView$saveBuiltInVideo$1> continuation) {
        super(2, continuation);
        this.$download = downloadBean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImmVideoItemView$saveBuiltInVideo$1(this.$download, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ImmVideoItemView$saveBuiltInVideo$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
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
        DownloadBean downloadBean = this.$download;
        downloadBean.setPath(downloadBean.getUrl());
        this.$download.setStatus(5);
        DownloadEsHelper downloadEsHelperM88598a = DownloadEsHelper.f67591m.m88598a();
        DownloadBean downloadBean2 = this.$download;
        this.label = 1;
        if (downloadEsHelperM88598a.m88569T(downloadBean2, this) == objF) {
            return objF;
        }
        AbstractC24917a2 abstractC24917a2M99269c = C25220y0.m99269c();
        C173171 c173171 = new C173171(null);
        this.label = 2;
        if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c173171, this) == objF) {
            return objF;
        }
        return Unit.f75682a;
    }
}
