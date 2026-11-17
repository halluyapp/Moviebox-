package com.transsion.postdetail.helper;

import com.blankj.utilcode.util.AbstractC5796o;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.ShortTVItem;
import com.transsion.moviedetailapi.bean.Subject;
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
@DebugMetadata(m97636c = "com.transsion.postdetail.helper.ShortTvImmVideoHelper$saveCache$1", m97637f = "ShortTvImmVideoHelper.kt", m97638l = {}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class ShortTvImmVideoHelper$saveCache$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Subject> $videoList;
    int label;
    final /* synthetic */ ShortTvImmVideoHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ShortTvImmVideoHelper$saveCache$1(List<? extends Subject> list, ShortTvImmVideoHelper shortTvImmVideoHelper, Continuation<? super ShortTvImmVideoHelper$saveCache$1> continuation) {
        super(2, continuation);
        this.$videoList = list;
        this.this$0 = shortTvImmVideoHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTvImmVideoHelper$saveCache$1(this.$videoList, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTvImmVideoHelper$saveCache$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Media video;
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        try {
            List<Subject> list = this.$videoList;
            List<Subject> listSubList = list.subList(list.size() - 1, this.$videoList.size());
            ShortTvImmVideoHelper shortTvImmVideoHelper = this.this$0;
            for (Subject subject : listSubList) {
                if (subject.getIsCache()) {
                    return Unit.f75682a;
                }
                subject.setCache(true);
                C26866a.a.m104898f(C26866a.f81698a, "shorttv_detail_video", "save cache", false, 4, null);
                ShortTVItem shortTVFirstEp = subject.getShortTVFirstEp();
                shortTvImmVideoHelper.m73037u((shortTVFirstEp == null || (video = shortTVFirstEp.getVideo()) == null) ? null : video.getVideoAddress());
            }
            C14496b.f50966a.m65344b().putString("k_save_video", AbstractC5796o.m27447j(listSubList));
        } catch (Exception unused) {
        }
        return Unit.f75682a;
    }
}
