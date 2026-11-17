package com.transsion.shorttv_pugc.p317ui.fragment;

import com.transsion.shorttv_pugc.ShorttvModel;
import com.transsion.shorttv_pugc.viewmodel.ShortTvViewModel;
import fo.C23403e;
import java.util.Iterator;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;
import p654oo.InterfaceC26373f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv_pugc.ui.fragment.ShortTvDetailListFragment$downloadListener$1$onDownloadSuccess$1", m97637f = "ShortTvDetailListFragment.kt", m97638l = {670}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class ShortTvDetailListFragment$downloadListener$1$onDownloadSuccess$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $ugcVideoId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ShortTvDetailListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvDetailListFragment$downloadListener$1$onDownloadSuccess$1(ShortTvDetailListFragment shortTvDetailListFragment, String str, Continuation<? super ShortTvDetailListFragment$downloadListener$1$onDownloadSuccess$1> continuation) {
        super(2, continuation);
        this.this$0 = shortTvDetailListFragment;
        this.$ugcVideoId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTvDetailListFragment$downloadListener$1$onDownloadSuccess$1(this.this$0, this.$ugcVideoId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTvDetailListFragment$downloadListener$1$onDownloadSuccess$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        ShortTvDetailListFragment shortTvDetailListFragment;
        ShorttvModel.UGCVideo uGCVideo;
        String playUrl;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            List listM81437z = this.this$0.m81041z0().m81437z();
            String str = this.$ugcVideoId;
            Iterator it = listM81437z.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.m97797c(((ShorttvModel.UGCVideo) next).getUgcVideoId(), str));
            ShorttvModel.UGCVideo uGCVideo2 = (ShorttvModel.UGCVideo) next;
            if (uGCVideo2 != null) {
                shortTvDetailListFragment = this.this$0;
                String str2 = this.$ugcVideoId;
                ShortTvViewModel shortTvViewModelM81041z0 = shortTvDetailListFragment.m81041z0();
                this.L$0 = shortTvDetailListFragment;
                this.L$1 = uGCVideo2;
                this.label = 1;
                Object objM81434w = shortTvViewModelM81041z0.m81434w(str2, this);
                if (objM81434w == objF) {
                    return objF;
                }
                uGCVideo = uGCVideo2;
                obj = objM81434w;
            }
            return Unit.f75682a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        uGCVideo = (ShorttvModel.UGCVideo) this.L$1;
        shortTvDetailListFragment = (ShortTvDetailListFragment) this.L$0;
        ResultKt.m97107b(obj);
        ShorttvModel.UGCVideo uGCVideo3 = (ShorttvModel.UGCVideo) obj;
        if (uGCVideo3 != null && (playUrl = uGCVideo3.getPlayUrl()) != null) {
            InterfaceC26373f interfaceC26373f = shortTvDetailListFragment.mOrPlayer;
            if (interfaceC26373f != null) {
                C23403e c23403e = new C23403e(playUrl, playUrl, uGCVideo.getEp(), null, null, 24, null);
                c23403e.m92943t(playUrl);
                Boxing.m97631a(interfaceC26373f.mo102960b(c23403e));
            }
            uGCVideo.setPlayUrl(playUrl);
        }
        return Unit.f75682a;
    }
}
