package com.transsion.ugcvideodetail.viewmodel;

import com.transsion.ugcvideodetail.api.bean.UGCVideoPlayInfo;
import com.vungle.ads.internal.protos.Sdk$SDKError;
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

/* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel$getFirstVideoDetail$1$1$playInfoDeferred$1 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideoPlayInfo;", "<anonymous>", "(Lkotlinx/coroutines/n0;)Lcom/transsion/ugcvideodetail/api/bean/UGCVideoPlayInfo;"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel$getFirstVideoDetail$1$1$playInfoDeferred$1", m97637f = "UGCImmVideoDetailViewModel.kt", m97638l = {Sdk$SDKError.Reason.WEBVIEW_ERROR_VALUE}, m97639m = "invokeSuspend")
final class C20339x2054a27a extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super UGCVideoPlayInfo>, Object> {
    final /* synthetic */ String $ugcVideoId;
    int label;
    final /* synthetic */ UGCImmVideoDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C20339x2054a27a(UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel, String str, Continuation<? super C20339x2054a27a> continuation) {
        super(2, continuation);
        this.this$0 = uGCImmVideoDetailViewModel;
        this.$ugcVideoId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C20339x2054a27a(this.this$0, this.$ugcVideoId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super UGCVideoPlayInfo> continuation) {
        return ((C20339x2054a27a) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel = this.this$0;
                String str = this.$ugcVideoId;
                this.label = 1;
                obj = uGCImmVideoDetailViewModel.m84183y(str, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            return (UGCVideoPlayInfo) obj;
        } catch (Throwable th2) {
            C26866a.a.m104901l(C26866a.f81698a, "UGCImmVideoDetailViewModel", "getVideoPlayInfo error:" + th2, false, 4, null);
            return null;
        }
    }
}
