package com.transsion.subtitle;

import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.report.C14482a;
import java.util.List;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.subtitle.VideoSubtitleManagerImp$resDownloadListener$1$downloadCheck$1", m97637f = "VideoSubtitleManagerImp.kt", m97638l = {MBSupportMuteAdType.REWARD_VIDEO}, m97639m = "invokeSuspend")
final class VideoSubtitleManagerImp$resDownloadListener$1$downloadCheck$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ DownloadBean $bean;
    final /* synthetic */ boolean $isSuccess;
    int label;
    final /* synthetic */ VideoSubtitleManagerImp this$0;
    final /* synthetic */ VideoSubtitleManagerImp$resDownloadListener$1 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoSubtitleManagerImp$resDownloadListener$1$downloadCheck$1(VideoSubtitleManagerImp videoSubtitleManagerImp, DownloadBean downloadBean, boolean z11, VideoSubtitleManagerImp$resDownloadListener$1 videoSubtitleManagerImp$resDownloadListener$1, Continuation<? super VideoSubtitleManagerImp$resDownloadListener$1$downloadCheck$1> continuation) {
        super(2, continuation);
        this.this$0 = videoSubtitleManagerImp;
        this.$bean = downloadBean;
        this.$isSuccess = z11;
        this.this$1 = videoSubtitleManagerImp$resDownloadListener$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoSubtitleManagerImp$resDownloadListener$1$downloadCheck$1(this.this$0, this.$bean, this.$isSuccess, this.this$1, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((VideoSubtitleManagerImp$resDownloadListener$1$downloadCheck$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            VideoSubtitleManagerImp videoSubtitleManagerImp = this.this$0;
            String subtitleResId = this.$bean.getSubtitleResId();
            this.label = 1;
            obj = videoSubtitleManagerImp.mo81939a(subtitleResId, this);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        List list = (List) obj;
        String str = this.$isSuccess ? "下载完成" : "资源继续下载";
        if (list.isEmpty()) {
            C26866a.f81698a.m104919u(C14482a.f50937a.m65273a(), this.this$0.f62779d + " " + str + "，数据库为空，执行检测 titleName:" + this.$bean.getTitleName() + ", ep:" + this.$bean.getEp() + " se:" + this.$bean.getSe(), true);
            VideoSubtitleManagerImp.m81932t(this.this$0, this.$bean, null, 2, null);
        } else if (this.this$1.m81951f(list)) {
            C26866a.f81698a.m104919u(C14482a.f50937a.m65273a(), this.this$0.f62779d + " " + str + "，有失败，执行检测 titleName:" + this.$bean.getTitleName() + ", ep:" + this.$bean.getEp() + " se:" + this.$bean.getSe(), true);
            VideoSubtitleManagerImp.m81932t(this.this$0, this.$bean, null, 2, null);
        } else {
            C26866a.f81698a.m104919u(C14482a.f50937a.m65273a(), this.this$0.f62779d + " " + str + "，有字幕无需检测 titleName:" + this.$bean.getTitleName() + ", ep:" + this.$bean.getEp() + " se:" + this.$bean.getSe(), true);
        }
        return Unit.f75682a;
    }
}
