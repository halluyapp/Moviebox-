package com.transsion.postdetail.p306ui.fragment;

import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.postdetail.layer.listener.LayerFlag;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment$playerListener$1$onPrepare$1", m97637f = "LocalVideoDetailFragment.kt", m97638l = {457, 458}, m97639m = "invokeSuspend")
final class LocalVideoDetailFragment$playerListener$1$onPrepare$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ LocalVideoDetailFragment this$0;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment$playerListener$1$onPrepare$1$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment$playerListener$1$onPrepare$1$1", m97637f = "LocalVideoDetailFragment.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C170241 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ LocalVideoDetailFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C170241(LocalVideoDetailFragment localVideoDetailFragment, Continuation<? super C170241> continuation) {
            super(2, continuation);
            this.this$0 = localVideoDetailFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C170241(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C170241) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            this.this$0.m74142h2().m73110g(LayerFlag.INIT_PLAY, new Object[0]);
            LocalVideoDetailFragment localVideoDetailFragment = this.this$0;
            localVideoDetailFragment.m74154k3(localVideoDetailFragment.downloadBean);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocalVideoDetailFragment$playerListener$1$onPrepare$1(LocalVideoDetailFragment localVideoDetailFragment, Continuation<? super LocalVideoDetailFragment$playerListener$1$onPrepare$1> continuation) {
        super(2, continuation);
        this.this$0 = localVideoDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalVideoDetailFragment$playerListener$1$onPrepare$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((LocalVideoDetailFragment$playerListener$1$onPrepare$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LocalVideoDetailFragment localVideoDetailFragment;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                localVideoDetailFragment = (LocalVideoDetailFragment) this.L$0;
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
        localVideoDetailFragment = this.this$0;
        DownloadEsHelper downloadEsHelperM88598a = DownloadEsHelper.f67591m.m88598a();
        String str = this.this$0.resourceId;
        this.L$0 = localVideoDetailFragment;
        this.label = 1;
        obj = downloadEsHelperM88598a.m88588p(str, this);
        if (obj == objF) {
            return objF;
        }
        localVideoDetailFragment.downloadBean = (DownloadBean) obj;
        AbstractC24917a2 abstractC24917a2M99269c = C25220y0.m99269c();
        C170241 c170241 = new C170241(this.this$0, null);
        this.L$0 = null;
        this.label = 2;
        if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c170241, this) == objF) {
            return objF;
        }
        return Unit.f75682a;
    }
}
