package com.transsion.postdetail.p306ui.fragment;

import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.report.C14482a;
import com.transsion.subtitle.InterfaceC19714h;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment$setSubtitle$1", m97637f = "LocalVideoDetailFragment.kt", m97638l = {1414, 1420}, m97639m = "invokeSuspend")
final class LocalVideoDetailFragment$setSubtitle$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ LocalVideoDetailFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocalVideoDetailFragment$setSubtitle$1(LocalVideoDetailFragment localVideoDetailFragment, Continuation<? super LocalVideoDetailFragment$setSubtitle$1> continuation) {
        super(2, continuation);
        this.this$0 = localVideoDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalVideoDetailFragment$setSubtitle$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((LocalVideoDetailFragment$setSubtitle$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a7 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        DownloadBean downloadBean;
        LocalVideoDetailFragment localVideoDetailFragment;
        List list;
        Integer numM97634d;
        AbstractC24917a2 abstractC24917a2M99269c;
        LocalVideoDetailFragment$setSubtitle$1$1$1 localVideoDetailFragment$setSubtitle$1$1$1;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            downloadBean = this.this$0.downloadBean;
            if (downloadBean != null) {
                localVideoDetailFragment = this.this$0;
                InterfaceC19714h interfaceC19714hM82148b = InterfaceC19714h.f62935a.m82148b();
                String subtitleResId = downloadBean.getSubtitleResId();
                this.L$0 = localVideoDetailFragment;
                this.L$1 = downloadBean;
                this.label = 1;
                obj = interfaceC19714hM82148b.mo81939a(subtitleResId, this);
                if (obj == objF) {
                    return objF;
                }
                list = (List) obj;
                C26866a.a aVar = C26866a.f81698a;
                String strM65273a = C14482a.f50937a.m65273a();
                String totalTitleName = downloadBean.getTotalTitleName();
                String subtitleResId2 = downloadBean.getSubtitleResId();
                if (list != null) {
                    numM97634d = Boxing.m97634d(list.size());
                } else {
                    numM97634d = null;
                }
                aVar.m104918p(strM65273a, new String[]{"----- setSubtitle, name:" + totalTitleName + ", subtitleResId:" + subtitleResId2 + ", size = " + numM97634d}, true);
                abstractC24917a2M99269c = C25220y0.m99269c();
                localVideoDetailFragment$setSubtitle$1$1$1 = new LocalVideoDetailFragment$setSubtitle$1$1$1(list, localVideoDetailFragment, downloadBean, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (AbstractC25088i.m98910g(abstractC24917a2M99269c, localVideoDetailFragment$setSubtitle$1$1$1, this) == objF) {
                    return objF;
                }
            }
        } else if (i11 == 1) {
            downloadBean = (DownloadBean) this.L$1;
            localVideoDetailFragment = (LocalVideoDetailFragment) this.L$0;
            ResultKt.m97107b(obj);
            list = (List) obj;
            C26866a.a aVar2 = C26866a.f81698a;
            String strM65273a2 = C14482a.f50937a.m65273a();
            String totalTitleName2 = downloadBean.getTotalTitleName();
            String subtitleResId3 = downloadBean.getSubtitleResId();
            if (list != null) {
                numM97634d = Boxing.m97634d(list.size());
            } else {
                numM97634d = null;
            }
            aVar2.m104918p(strM65273a2, new String[]{"----- setSubtitle, name:" + totalTitleName2 + ", subtitleResId:" + subtitleResId3 + ", size = " + numM97634d}, true);
            abstractC24917a2M99269c = C25220y0.m99269c();
            localVideoDetailFragment$setSubtitle$1$1$1 = new LocalVideoDetailFragment$setSubtitle$1$1$1(list, localVideoDetailFragment, downloadBean, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (AbstractC25088i.m98910g(abstractC24917a2M99269c, localVideoDetailFragment$setSubtitle$1$1$1, this) == objF) {
                return objF;
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        return Unit.f75682a;
    }
}
