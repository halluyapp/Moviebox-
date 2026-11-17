package com.transsion.subtitle;

import android.text.TextUtils;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;
import p528ju.C24469a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.subtitle.VideoSubtitleControl$downloadListener$1$onComplete$1", m97637f = "VideoSubtitleControl.kt", m97638l = {}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class VideoSubtitleControl$downloadListener$1$onComplete$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ SubtitleDownloadTable $stDownloadTable;
    int label;
    final /* synthetic */ VideoSubtitleControl this$0;
    final /* synthetic */ VideoSubtitleControl$downloadListener$1 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoSubtitleControl$downloadListener$1$onComplete$1(SubtitleDownloadTable subtitleDownloadTable, VideoSubtitleControl videoSubtitleControl, VideoSubtitleControl$downloadListener$1 videoSubtitleControl$downloadListener$1, Continuation<? super VideoSubtitleControl$downloadListener$1$onComplete$1> continuation) {
        super(2, continuation);
        this.$stDownloadTable = subtitleDownloadTable;
        this.this$0 = videoSubtitleControl;
        this.this$1 = videoSubtitleControl$downloadListener$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoSubtitleControl$downloadListener$1$onComplete$1(this.$stDownloadTable, this.this$0, this.this$1, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((VideoSubtitleControl$downloadListener$1$onComplete$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        String resourceId = this.$stDownloadTable.getResourceId();
        DownloadBean downloadBean = this.this$0.f62761p;
        if (!TextUtils.equals(resourceId, downloadBean != null ? downloadBean.getSubtitleResId() : null)) {
            C19655a.f62783a.m81952a(this.this$0.getClass().getSimpleName() + " --> onComplete() --> 字幕下载成功，不是当前视频，不做处理");
            return Unit.f75682a;
        }
        Function1 function1 = this.this$0.f62755j;
        if (function1 != null) {
            function1.invoke(Utils.m27275a().getString(R$string.subtitle_downloaded_successfully));
        }
        C24469a c24469a = new C24469a(this.$stDownloadTable);
        Function3 function3 = this.this$0.f62752g;
        String lanName = this.$stDownloadTable.getLanName();
        if (lanName == null) {
            lanName = "";
        }
        String lan = this.$stDownloadTable.getLan();
        if (lan == null) {
            lan = "";
        }
        function3.invoke(lanName, lan, Boxing.m97634d(this.$stDownloadTable.getType()));
        if (this.this$0.f62743G) {
            this.this$1.m81915e(c24469a);
        } else {
            this.this$1.m81918h(c24469a);
        }
        this.this$1.m81917g();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        for (C24469a c24469a2 : this.this$0.f62757l) {
            if (Intrinsics.m97797c(c24469a2.m96011b().getId(), c24469a.m96011b().getId())) {
                booleanRef.element = false;
                c24469a2.m96017h(c24469a.m96011b());
            }
        }
        if (booleanRef.element) {
            c24469a.m96021l(true);
            c24469a.m96011b().setStatus(5);
            this.this$0.f62757l.add(c24469a);
            this.this$0.f62754i.invoke(this.this$0.f62757l);
            C19655a.f62783a.m81952a(this.this$0.getClass().getSimpleName() + " --> handleSetImmediately() --> 搜索字幕下载处理");
        }
        String string = C14496b.f50966a.m65344b().getString("k_subtitle_language", "");
        if (c24469a.m96011b().getIsSetImmediately() || string == null || string.length() == 0) {
            this.this$0.m81839Y(c24469a);
        }
        return Unit.f75682a;
    }
}
