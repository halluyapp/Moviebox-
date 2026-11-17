package com.transsion.ugcvideodetail.hepler;

import com.blankj.utilcode.util.Utils;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.ugcvideodetail.api.bean.UGCVideoPlayInfo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoPlayStream;
import com.transsnet.downloader.manager.C21851p;
import com.transsnet.downloader.manager.InterfaceC21842g;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p922xv.InterfaceC28667a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.ugcvideodetail.hepler.UGCVideoFloatManager$getPlayInfo$1", m97637f = "UGCVideoFloatManager.kt", m97638l = {Sdk$SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, Sdk$SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk$SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m97639m = "invokeSuspend")
final class UGCVideoFloatManager$getPlayInfo$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<UGCVideoPlayInfo, Unit> $callback;
    final /* synthetic */ String $ugcVideoId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UGCVideoFloatManager$getPlayInfo$1(String str, Function1<? super UGCVideoPlayInfo, Unit> function1, Continuation<? super UGCVideoFloatManager$getPlayInfo$1> continuation) {
        super(2, continuation);
        this.$ugcVideoId = str;
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UGCVideoFloatManager$getPlayInfo$1 uGCVideoFloatManager$getPlayInfo$1 = new UGCVideoFloatManager$getPlayInfo$1(this.$ugcVideoId, this.$callback, continuation);
        uGCVideoFloatManager$getPlayInfo$1.L$0 = obj;
        return uGCVideoFloatManager$getPlayInfo$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UGCVideoFloatManager$getPlayInfo$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:49:0x0103  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        Function1<UGCVideoPlayInfo, Unit> function1;
        UGCVideoPlayStream uGCVideoPlayStream;
        BaseDto baseDto;
        Object obj2;
        UGCVideoPlayStream uGCVideoPlayStream2;
        DownloadBean downloadBean;
        AbstractC24917a2 abstractC24917a2M99269c;
        UGCVideoFloatManager$getPlayInfo$1$2$1$2 uGCVideoFloatManager$getPlayInfo$1$2$1$2;
        Object obj3;
        String path;
        Function1<UGCVideoPlayInfo, Unit> function2;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.m97107b(obj);
                } else if (i11 == 2) {
                    uGCVideoPlayStream2 = (UGCVideoPlayStream) this.L$3;
                    baseDto = (BaseDto) this.L$2;
                    function1 = (Function1) this.L$1;
                    obj2 = this.L$0;
                    ResultKt.m97107b(obj);
                    downloadBean = (DownloadBean) obj;
                    if (downloadBean != null && (path = downloadBean.getPath()) != null && Intrinsics.m97797c(uGCVideoPlayStream2.getFormat(), "DEFAULT") && Intrinsics.m97797c(uGCVideoPlayStream2.getResolutions(), String.valueOf(downloadBean.getResolution()))) {
                        uGCVideoPlayStream2.setUrl(path);
                        C26866a.f81698a.m104912c("VideoFloat", "getVideoPlayInfo 有下载地址，直接用下载地址", true);
                    }
                    abstractC24917a2M99269c = C25220y0.m99269c();
                    uGCVideoFloatManager$getPlayInfo$1$2$1$2 = new UGCVideoFloatManager$getPlayInfo$1$2$1$2(function1, baseDto, null);
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 3;
                    if (AbstractC25088i.m98910g(abstractC24917a2M99269c, uGCVideoFloatManager$getPlayInfo$1$2$1$2, this) == objF) {
                        return objF;
                    }
                    obj3 = obj2;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj3 = this.L$0;
                    ResultKt.m97107b(obj);
                }
                objM112707constructorimpl = obj3;
                function2 = this.$callback;
                if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null) {
                    function2.invoke(null);
                }
                return Unit.f75682a;
            }
            ResultKt.m97107b(obj);
            String str = this.$ugcVideoId;
            Result.Companion companion = Result.INSTANCE;
            InterfaceC28667a interfaceC28667aM84034l = UGCVideoFloatManager.f64340b.m84034l();
            this.label = 1;
            obj = InterfaceC28667a.a.m110476i(interfaceC28667aM84034l, str, null, this, 2, null);
            if (obj == objF) {
                return objF;
            }
            objM112707constructorimpl = Result.m112707constructorimpl((BaseDto) obj);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        String str2 = this.$ugcVideoId;
        function1 = this.$callback;
        if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
            BaseDto baseDto2 = (BaseDto) objM112707constructorimpl;
            UGCVideoPlayInfo uGCVideoPlayInfo = (UGCVideoPlayInfo) baseDto2.getData();
            if (uGCVideoPlayInfo != null && (uGCVideoPlayStream = (UGCVideoPlayStream) CollectionsKt.m97361k0(uGCVideoPlayInfo.getResources())) != null) {
                InterfaceC21842g interfaceC21842gM88759a = C21851p.f67672a.m88759a(Utils.m27275a());
                this.L$0 = objM112707constructorimpl;
                this.L$1 = function1;
                this.L$2 = baseDto2;
                this.L$3 = uGCVideoPlayStream;
                this.label = 2;
                Object objMo88678j = interfaceC21842gM88759a.mo88678j(str2, this);
                if (objMo88678j == objF) {
                    return objF;
                }
                baseDto = baseDto2;
                obj2 = objM112707constructorimpl;
                obj = objMo88678j;
                uGCVideoPlayStream2 = uGCVideoPlayStream;
                downloadBean = (DownloadBean) obj;
                if (downloadBean != null) {
                    uGCVideoPlayStream2.setUrl(path);
                    C26866a.f81698a.m104912c("VideoFloat", "getVideoPlayInfo 有下载地址，直接用下载地址", true);
                }
                abstractC24917a2M99269c = C25220y0.m99269c();
                uGCVideoFloatManager$getPlayInfo$1$2$1$2 = new UGCVideoFloatManager$getPlayInfo$1$2$1$2(function1, baseDto, null);
                this.L$0 = obj2;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
                if (AbstractC25088i.m98910g(abstractC24917a2M99269c, uGCVideoFloatManager$getPlayInfo$1$2$1$2, this) == objF) {
                    return objF;
                }
                obj3 = obj2;
                objM112707constructorimpl = obj3;
            }
        }
        function2 = this.$callback;
        if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null) {
            function2.invoke(null);
        }
        return Unit.f75682a;
    }
}
