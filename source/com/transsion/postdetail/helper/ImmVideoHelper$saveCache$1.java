package com.transsion.postdetail.helper;

import com.blankj.utilcode.util.AbstractC5796o;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.postdetail.p306ui.fragment.VideoFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.helper.ImmVideoHelper$saveCache$1", m97637f = "ImmVideoHelper.kt", m97638l = {}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class ImmVideoHelper$saveCache$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<PostSubjectItem> $videoList;
    int label;
    final /* synthetic */ ImmVideoHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImmVideoHelper$saveCache$1(List<PostSubjectItem> list, ImmVideoHelper immVideoHelper, Continuation<? super ImmVideoHelper$saveCache$1> continuation) {
        super(2, continuation);
        this.$videoList = list;
        this.this$0 = immVideoHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImmVideoHelper$saveCache$1(this.$videoList, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ImmVideoHelper$saveCache$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        try {
            List<PostSubjectItem> list = this.$videoList;
            List<PostSubjectItem> listSubList = list.subList(list.size() - 1, this.$videoList.size());
            ImmVideoHelper immVideoHelper = this.this$0;
            for (PostSubjectItem postSubjectItem : listSubList) {
                if (postSubjectItem.isCache()) {
                    return Unit.f75682a;
                }
                postSubjectItem.setCache(true);
                C26866a.a.m104898f(C26866a.f81698a, VideoFragment.PAGE_NAME, "save cache " + postSubjectItem.getTitle(), false, 4, null);
                Media media = postSubjectItem.getMedia();
                immVideoHelper.m72995q(media != null ? media.getVideo() : null);
            }
            C14496b.f50966a.m65344b().putString("k_save_video", AbstractC5796o.m27447j(listSubList));
        } catch (Exception unused) {
        }
        return Unit.f75682a;
    }
}
