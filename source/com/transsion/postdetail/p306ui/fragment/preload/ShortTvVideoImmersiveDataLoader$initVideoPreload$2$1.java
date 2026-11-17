package com.transsion.postdetail.p306ui.fragment.preload;

import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.ShortTVItem;
import com.transsion.moviedetailapi.bean.Video;
import com.transsion.player.shorttv.preload.C16670q;
import fo.C23403e;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.ui.fragment.preload.ShortTvVideoImmersiveDataLoader$initVideoPreload$2$1", m97637f = "ShortTvVideoImmersiveDataLoader.kt", m97638l = {}, m97639m = "invokeSuspend")
final class ShortTvVideoImmersiveDataLoader$initVideoPreload$2$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ShortTVItem $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvVideoImmersiveDataLoader$initVideoPreload$2$1(ShortTVItem shortTVItem, Continuation<? super ShortTvVideoImmersiveDataLoader$initVideoPreload$2$1> continuation) {
        super(2, continuation);
        this.$it = shortTVItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTvVideoImmersiveDataLoader$initVideoPreload$2$1(this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTvVideoImmersiveDataLoader$initVideoPreload$2$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String url;
        Video videoAddress;
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        String id2 = this.$it.getId();
        Media video = this.$it.getVideo();
        if (video == null || (videoAddress = video.getVideoAddress()) == null || (url = videoAddress.getUrl()) == null) {
            url = "";
        }
        C16670q.f56031a.m72597t(new C23403e(id2, url, 0, null, null, 28, null));
        return Unit.f75682a;
    }
}
