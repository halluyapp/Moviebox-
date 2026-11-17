package com.transsion.ugcvideodetail.hepler.subtitle;

import android.app.Application;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayDao;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.transsion.ugcvideodetail.api.bean.UGCImmVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
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
import p528ju.C24469a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.ugcvideodetail.hepler.subtitle.UGCImmVideoSubtitleControlImp$selectSubtitle$6", m97637f = "UGCImmVideoSubtitleControlImp.kt", m97638l = {401}, m97639m = "invokeSuspend")
final class UGCImmVideoSubtitleControlImp$selectSubtitle$6 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C24469a $bean;
    int label;
    final /* synthetic */ UGCImmVideoSubtitleControlImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UGCImmVideoSubtitleControlImp$selectSubtitle$6(C24469a c24469a, UGCImmVideoSubtitleControlImp uGCImmVideoSubtitleControlImp, Continuation<? super UGCImmVideoSubtitleControlImp$selectSubtitle$6> continuation) {
        super(2, continuation);
        this.$bean = c24469a;
        this.this$0 = uGCImmVideoSubtitleControlImp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCImmVideoSubtitleControlImp$selectSubtitle$6(this.$bean, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UGCImmVideoSubtitleControlImp$selectSubtitle$6) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SubtitleDownloadTable subtitleDownloadTableM96011b;
        String id2;
        UGCImmVideo uGCImmVideo;
        UGCVideo ugcVideo;
        String ugcVideoId;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            C24469a c24469a = this.$bean;
            if (c24469a != null && (subtitleDownloadTableM96011b = c24469a.m96011b()) != null && (id2 = subtitleDownloadTableM96011b.getId()) != null && (uGCImmVideo = this.this$0.f64426f) != null && (ugcVideo = uGCImmVideo.getUgcVideo()) != null && (ugcVideoId = ugcVideo.getUgcVideoId()) != null) {
                AppDatabase.Companion companion = AppDatabase.INSTANCE;
                Application applicationM27275a = Utils.m27275a();
                Intrinsics.m97801g(applicationM27275a, "getApp(...)");
                UGCVideoDetailPlayDao uGCVideoDetailPlayDaoMo64864A1 = companion.m64881b(applicationM27275a).mo64864A1();
                this.label = 1;
                if (uGCVideoDetailPlayDaoMo64864A1.mo64965b(ugcVideoId, id2, this) == objF) {
                    return objF;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        return Unit.f75682a;
    }
}
