package com.transsion.videodetail;

import com.transsion.baselib.p291db.video.VideoDetailPlayBean;
import com.transsion.baselib.p291db.video.VideoDetailPlayDao;
import com.transsion.videodetail.util.StreamFloatManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.videodetail.VideoDetailViewModel$fetchHistory$1", m97637f = "VideoDetailViewModel.kt", m97638l = {120}, m97639m = "invokeSuspend")
final class VideoDetailViewModel$fetchHistory$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $subjectId;
    int label;
    final /* synthetic */ VideoDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoDetailViewModel$fetchHistory$1(VideoDetailViewModel videoDetailViewModel, String str, Continuation<? super VideoDetailViewModel$fetchHistory$1> continuation) {
        super(2, continuation);
        this.this$0 = videoDetailViewModel;
        this.$subjectId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoDetailViewModel$fetchHistory$1(this.this$0, this.$subjectId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((VideoDetailViewModel$fetchHistory$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            VideoDetailPlayDao videoDetailPlayDaoM86101A = this.this$0.m86101A();
            String str = this.$subjectId;
            this.label = 1;
            obj = videoDetailPlayDaoM86101A.mo64994c(str, this);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        VideoDetailPlayBean videoDetailPlayBean = (VideoDetailPlayBean) obj;
        if (videoDetailPlayBean != null) {
            String str2 = this.$subjectId + "+" + videoDetailPlayBean.getSe() + "+" + videoDetailPlayBean.getEp();
            C26866a.a aVar = C26866a.f81698a;
            C26866a.a.m104898f(aVar, "VideoDetail", "fetchHistory--key:" + str2, false, 4, null);
            Long lM86493g = StreamFloatManager.f65956b.m86493g(str2);
            if (lM86493g != null) {
                long jLongValue = lM86493g.longValue();
                C26866a.a.m104905r(aVar, "VideoDetail", new String[]{"update--key:" + str2 + ", value:" + jLongValue + ",last:" + videoDetailPlayBean.getProgress()}, false, 4, null);
                if (jLongValue > 0 && jLongValue != videoDetailPlayBean.getProgress()) {
                    videoDetailPlayBean.setProgress(jLongValue);
                }
            }
        }
        C26866a.a.m104905r(C26866a.f81698a, "VideoDetail", new String[]{"fetchHistory  subjectId:" + this.$subjectId + ",history:" + videoDetailPlayBean}, false, 4, null);
        this.this$0.f65712g.mo14858q(videoDetailPlayBean);
        return Unit.f75682a;
    }
}
