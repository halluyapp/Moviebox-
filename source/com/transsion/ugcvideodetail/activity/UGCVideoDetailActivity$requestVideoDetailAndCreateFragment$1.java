package com.transsion.ugcvideodetail.activity;

import android.widget.ProgressBar;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.p278ts.PsExtractor;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.baselib.report.C14492k;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.fragment.UGCImmVideoDetailFragment;
import com.transsion.ugcvideodetail.fragment.UGCVideoDetailFragment;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;
import ng.AbstractC26006c;
import p885wv.C28441a;
import p922xv.InterfaceC28667a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity$requestVideoDetailAndCreateFragment$1", m97637f = "UGCVideoDetailActivity.kt", m97638l = {PsExtractor.AUDIO_STREAM, 198}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class UGCVideoDetailActivity$requestVideoDetailAndCreateFragment$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UGCVideoDetailActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UGCVideoDetailActivity$requestVideoDetailAndCreateFragment$1(UGCVideoDetailActivity uGCVideoDetailActivity, Continuation<? super UGCVideoDetailActivity$requestVideoDetailAndCreateFragment$1> continuation) {
        super(2, continuation);
        this.this$0 = uGCVideoDetailActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UGCVideoDetailActivity$requestVideoDetailAndCreateFragment$1 uGCVideoDetailActivity$requestVideoDetailAndCreateFragment$1 = new UGCVideoDetailActivity$requestVideoDetailAndCreateFragment$1(this.this$0, continuation);
        uGCVideoDetailActivity$requestVideoDetailAndCreateFragment$1.L$0 = obj;
        return uGCVideoDetailActivity$requestVideoDetailAndCreateFragment$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UGCVideoDetailActivity$requestVideoDetailAndCreateFragment$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007c A[Catch: all -> 0x0021, TryCatch #1 {all -> 0x0021, blocks: (B:7:0x001a, B:36:0x00b0, B:38:0x00bc, B:41:0x00d2, B:46:0x010b, B:45:0x0102, B:48:0x010e, B:50:0x0116, B:52:0x0134, B:56:0x014d, B:51:0x0129, B:14:0x0030, B:25:0x0070, B:27:0x007c, B:17:0x003d, B:19:0x0043, B:22:0x004a, B:28:0x0084, B:30:0x008a, B:33:0x0091, B:39:0x00c4, B:42:0x00eb, B:53:0x0136), top: B:67:0x0010, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc A[Catch: all -> 0x0021, TryCatch #1 {all -> 0x0021, blocks: (B:7:0x001a, B:36:0x00b0, B:38:0x00bc, B:41:0x00d2, B:46:0x010b, B:45:0x0102, B:48:0x010e, B:50:0x0116, B:52:0x0134, B:56:0x014d, B:51:0x0129, B:14:0x0030, B:25:0x0070, B:27:0x007c, B:17:0x003d, B:19:0x0043, B:22:0x004a, B:28:0x0084, B:30:0x008a, B:33:0x0091, B:39:0x00c4, B:42:0x00eb, B:53:0x0136), top: B:67:0x0010, inners: #0, #3 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM110472e;
        Object objM110471d;
        BaseDto baseDto;
        BaseDto baseDto2;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        UGCVideo uGCVideo = null;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC25149n0 interfaceC25149n0 = (InterfaceC25149n0) this.L$0;
                String str = this.this$0.videoId;
                if (str == null || str.length() == 0) {
                    String str2 = this.this$0.subjectId;
                    if (str2 == null || str2.length() == 0) {
                        C26866a.a.m104901l(C26866a.f81698a, "UGCVideoDetailActivity", "requestVideoDetailAndCreateFragment: videoId and subjectId are both null", false, 4, null);
                    } else {
                        InterfaceC28667a interfaceC28667aM83589I0 = this.this$0.m83589I0();
                        String str3 = this.this$0.subjectId;
                        Intrinsics.m97799e(str3);
                        this.L$0 = interfaceC25149n0;
                        this.label = 2;
                        objM110472e = InterfaceC28667a.a.m110472e(interfaceC28667aM83589I0, str3, null, this, 2, null);
                        if (objM110472e == objF) {
                            return objF;
                        }
                        baseDto2 = (BaseDto) objM110472e;
                        if (Intrinsics.m97797c(baseDto2.getCode(), "0")) {
                            uGCVideo = (UGCVideo) baseDto2.getData();
                        }
                    }
                } else {
                    InterfaceC28667a interfaceC28667aM83589I1 = this.this$0.m83589I0();
                    String str4 = this.this$0.videoId;
                    Intrinsics.m97799e(str4);
                    String str5 = this.this$0.collectionId;
                    this.L$0 = interfaceC25149n0;
                    this.label = 1;
                    objM110471d = InterfaceC28667a.a.m110471d(interfaceC28667aM83589I1, str4, str5, null, this, 4, null);
                    if (objM110471d == objF) {
                        return objF;
                    }
                    baseDto = (BaseDto) objM110471d;
                    if (Intrinsics.m97797c(baseDto.getCode(), "0")) {
                        uGCVideo = (UGCVideo) baseDto.getData();
                    }
                }
            } else if (i11 == 1) {
                ResultKt.m97107b(obj);
                objM110471d = obj;
                baseDto = (BaseDto) objM110471d;
                if (Intrinsics.m97797c(baseDto.getCode(), "0")) {
                    uGCVideo = (UGCVideo) baseDto.getData();
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
                objM110472e = obj;
                baseDto2 = (BaseDto) objM110472e;
                if (Intrinsics.m97797c(baseDto2.getCode(), "0")) {
                    uGCVideo = (UGCVideo) baseDto2.getData();
                }
            }
            try {
                if (uGCVideo == null) {
                    C26866a.a.m104910z(C26866a.f81698a, "UGCVideoDetailActivity", "requestVideoDetailAndCreateFragment: video is null, use default UGCVideoDetailFragment", false, 4, null);
                    this.this$0.m83587G0(UGCVideoDetailFragment.INSTANCE.m83930a(), "VideoDetailFragment");
                    UGCVideoDetailActivity uGCVideoDetailActivity = this.this$0;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        ProgressBar ugcPbLoading = ((C28441a) uGCVideoDetailActivity.getMViewBinding()).f87264c;
                        Intrinsics.m97801g(ugcPbLoading, "ugcPbLoading");
                        AbstractC26006c.m102054g(ugcPbLoading);
                        Result.m112707constructorimpl(Unit.f75682a);
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m112707constructorimpl(ResultKt.m97106a(th2));
                    }
                    return Unit.f75682a;
                }
                if (this.this$0.m83591M0(uGCVideo)) {
                    C14492k.f50955a.m65329w(2, this.this$0);
                    this.this$0.m83587G0(UGCImmVideoDetailFragment.INSTANCE.m83727a(), "VideoDetailFragment");
                } else {
                    this.this$0.m83587G0(UGCVideoDetailFragment.INSTANCE.m83930a(), "VideoDetailFragment");
                }
                UGCVideoDetailActivity uGCVideoDetailActivity2 = this.this$0;
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    ProgressBar ugcPbLoading2 = ((C28441a) uGCVideoDetailActivity2.getMViewBinding()).f87264c;
                    Intrinsics.m97801g(ugcPbLoading2, "ugcPbLoading");
                    AbstractC26006c.m102054g(ugcPbLoading2);
                    Result.m112707constructorimpl(Unit.f75682a);
                } catch (Throwable th3) {
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.m112707constructorimpl(ResultKt.m97106a(th3));
                }
                return Unit.f75682a;
                Result.Companion companion5 = Result.INSTANCE;
                ProgressBar ugcPbLoading3 = ((C28441a) uGCVideoDetailActivity.getMViewBinding()).f87264c;
                Intrinsics.m97801g(ugcPbLoading3, "ugcPbLoading");
                AbstractC26006c.m102054g(ugcPbLoading3);
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th4));
            }
        } catch (Throwable th5) {
            C26866a.a.m104901l(C26866a.f81698a, "UGCVideoDetailActivity", "requestVideoDetailAndCreateFragment error: " + th5, false, 4, null);
            this.this$0.m83587G0(UGCVideoDetailFragment.INSTANCE.m83930a(), "VideoDetailFragment");
            UGCVideoDetailActivity uGCVideoDetailActivity3 = this.this$0;
            Result.Companion companion7 = Result.INSTANCE;
            ProgressBar ugcPbLoading4 = ((C28441a) uGCVideoDetailActivity3.getMViewBinding()).f87264c;
            Intrinsics.m97801g(ugcPbLoading4, "ugcPbLoading");
            AbstractC26006c.m102054g(ugcPbLoading4);
            Result.m112707constructorimpl(Unit.f75682a);
        }
        C26866a.a.m104901l(C26866a.f81698a, "UGCVideoDetailActivity", "requestVideoDetailAndCreateFragment error: " + th5, false, 4, null);
        this.this$0.m83587G0(UGCVideoDetailFragment.INSTANCE.m83930a(), "VideoDetailFragment");
        UGCVideoDetailActivity uGCVideoDetailActivity4 = this.this$0;
        return Unit.f75682a;
    }
}
