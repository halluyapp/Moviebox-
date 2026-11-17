package com.transsion.shorttv.viewmodel;

import com.google.gson.Gson;
import com.transsion.shorttv.bean.Media;
import com.transsion.shorttv.bean.PreVideoAddress;
import com.transsion.shorttv.bean.ShortTVItem;
import com.transsion.shorttv.bean.Subject;
import com.transsion.shorttv.bean.Trailer;
import com.transsion.shorttv.bean.Video;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import p659os.AbstractC26716b;
import p659os.C26719e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "Los/e;", "<anonymous>", "(Lkotlinx/coroutines/n0;)Los/e;"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvViewModel$getTrailerItem$2", m97637f = "ShortTvViewModel.kt", m97638l = {}, m97639m = "invokeSuspend")
final class ShortTvViewModel$getTrailerItem$2 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super C26719e>, Object> {
    final /* synthetic */ Subject $subject;
    final /* synthetic */ String $subjectId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvViewModel$getTrailerItem$2(Subject subject, String str, Continuation<? super ShortTvViewModel$getTrailerItem$2> continuation) {
        super(2, continuation);
        this.$subject = subject;
        this.$subjectId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTvViewModel$getTrailerItem$2(this.$subject, this.$subjectId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super C26719e> continuation) {
        return ((ShortTvViewModel$getTrailerItem$2) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Media video;
        Media video2;
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        Subject subject = this.$subject;
        Trailer trailer = subject != null ? subject.getTrailer() : null;
        C26719e c26719e = new C26719e(this.$subjectId, 0, null, 0, 12, null);
        Subject subject2 = this.$subject;
        c26719e.m104515g(0);
        ShortTVItem shortTVItem = (ShortTVItem) new Gson().fromJson(new Gson().toJson(subject2 != null ? subject2.getShortTVFirstEp() : null), ShortTVItem.class);
        if (shortTVItem != null) {
            shortTVItem.setId("0");
        }
        if (shortTVItem != null) {
            shortTVItem.setVideoId(null);
        }
        Intrinsics.m97799e(trailer);
        PreVideoAddress videoAddress = trailer.getVideoAddress();
        Video videoM104500a = videoAddress != null ? AbstractC26716b.m104500a(videoAddress) : null;
        if (shortTVItem != null && (video2 = shortTVItem.getVideo()) != null) {
            video2.setVideoAddress(videoM104500a);
        }
        if (shortTVItem != null && (video = shortTVItem.getVideo()) != null) {
            video.setAddressList(null);
        }
        if (shortTVItem != null) {
            shortTVItem.setEp(0);
        }
        c26719e.m104516h(shortTVItem);
        return c26719e;
    }
}
