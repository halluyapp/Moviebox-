package com.transsion.postdetail.util;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.shorttv.bean.Media;
import com.transsion.shorttv.bean.ShortTVItem;
import com.transsion.shorttv.bean.ShortTvInfoEpisodeList;
import com.transsion.shorttv.bean.Video;
import com.transsnet.downloader.manager.InterfaceC21842g;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p790ts.InterfaceC27847a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.util.ShortTVFloatManager$getShortTvEpisodeList$1", m97637f = "ShortTVFloatManager.kt", m97638l = {Sdk$SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 129, Sdk$SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 145}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class ShortTVFloatManager$getShortTvEpisodeList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<ShortTvInfoEpisodeList, Unit> $callback;
    final /* synthetic */ int $selectEp;
    final /* synthetic */ String $subjectId;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ShortTVFloatManager$getShortTvEpisodeList$1(int i11, String str, Function1<? super ShortTvInfoEpisodeList, Unit> function1, Continuation<? super ShortTVFloatManager$getShortTvEpisodeList$1> continuation) {
        super(2, continuation);
        this.$selectEp = i11;
        this.$subjectId = str;
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTVFloatManager$getShortTvEpisodeList$1(this.$selectEp, this.$subjectId, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTVFloatManager$getShortTvEpisodeList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d0 A[Catch: all -> 0x004b, TryCatch #1 {all -> 0x004b, blocks: (B:13:0x0043, B:43:0x0109, B:45:0x010d, B:32:0x00ca, B:34:0x00d0, B:36:0x00e0, B:38:0x00e6, B:40:0x00ec, B:47:0x0112, B:18:0x0054, B:27:0x00b0, B:29:0x00bb, B:31:0x00c1), top: B:68:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0133  */
    /* JADX WARN: Code duplicated, block: B:58:0x0153 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x015c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0179 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:72:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0106 -> B:43:0x0109). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x010c -> B:45:0x010d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        Function1<ShortTvInfoEpisodeList, Unit> function1;
        AbstractC24917a2 abstractC24917a2M99269c;
        ShortTVFloatManager$getShortTvEpisodeList$1$2$1 shortTVFloatManager$getShortTvEpisodeList$1$2$1;
        Function1<ShortTvInfoEpisodeList, Unit> function2;
        AbstractC24917a2 abstractC24917a2M99269c2;
        ShortTVFloatManager$getShortTvEpisodeList$1$3$1 shortTVFloatManager$getShortTvEpisodeList$1$3$1;
        int i11;
        String str;
        Object objM108245c;
        List<ShortTVItem> items;
        Iterator it;
        Object obj2;
        String str2;
        Media video;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = this.label;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    i12 = this.I$0;
                    String str3 = (String) this.L$0;
                    ResultKt.m97107b(obj);
                    str = str3;
                    objM108245c = obj;
                } else if (i12 == 2) {
                    i12 = this.I$0;
                    Video video2 = (Video) this.L$5;
                    it = (Iterator) this.L$2;
                    obj2 = this.L$1;
                    str2 = (String) this.L$0;
                    ResultKt.m97107b(obj);
                    Video videoAddress = video2;
                    Object objMo88672a = obj;
                    String str4 = (String) objMo88672a;
                    videoAddress.setUrl(str4);
                    while (true) {
                        if (it.hasNext()) {
                            ShortTVItem shortTVItem = (ShortTVItem) it.next();
                            int ep2 = shortTVItem.getEp();
                            video = shortTVItem.getVideo();
                            if (video == null && (videoAddress = video.getVideoAddress()) != null) {
                                String url = videoAddress.getUrl();
                                if (url != null) {
                                    InterfaceC21842g interfaceC21842gM74917j = ShortTVFloatManager.f57812b.m74917j();
                                    this.L$0 = str2;
                                    this.L$1 = obj2;
                                    this.L$2 = it;
                                    this.L$3 = shortTVItem;
                                    this.L$4 = videoAddress;
                                    this.L$5 = videoAddress;
                                    this.I$0 = i12;
                                    this.label = 2;
                                    objMo88672a = interfaceC21842gM74917j.mo88672a(str2, ep2, url, this);
                                    if (objMo88672a == objF) {
                                        return objF;
                                    }
                                    String str5 = (String) objMo88672a;
                                } else {
                                    str5 = null;
                                }
                                videoAddress.setUrl(str5);
                                if (it.hasNext()) {
                                    ShortTVItem shortTVItem2 = (ShortTVItem) it.next();
                                    int ep3 = shortTVItem2.getEp();
                                    video = shortTVItem2.getVideo();
                                    if (video == null) {
                                    }
                                } else {
                                    objM108245c = obj2;
                                    objM112707constructorimpl = Result.m112707constructorimpl((BaseDto) objM108245c);
                                    function1 = this.$callback;
                                    if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
                                        abstractC24917a2M99269c = C25220y0.m99269c();
                                        shortTVFloatManager$getShortTvEpisodeList$1$2$1 = new ShortTVFloatManager$getShortTvEpisodeList$1$2$1(i12, (BaseDto) objM112707constructorimpl, function1, null);
                                        this.L$0 = objM112707constructorimpl;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.L$4 = null;
                                        this.L$5 = null;
                                        this.label = 3;
                                        if (AbstractC25088i.m98910g(abstractC24917a2M99269c, shortTVFloatManager$getShortTvEpisodeList$1$2$1, this) == objF) {
                                            return objF;
                                        }
                                    }
                                    function2 = this.$callback;
                                    if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null) {
                                        abstractC24917a2M99269c2 = C25220y0.m99269c();
                                        shortTVFloatManager$getShortTvEpisodeList$1$3$1 = new ShortTVFloatManager$getShortTvEpisodeList$1$3$1(function2, null);
                                        this.L$0 = objM112707constructorimpl;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.L$4 = null;
                                        this.L$5 = null;
                                        this.label = 4;
                                        if (AbstractC25088i.m98910g(abstractC24917a2M99269c2, shortTVFloatManager$getShortTvEpisodeList$1$3$1, this) == objF) {
                                            return objF;
                                        }
                                    }
                                }
                            }
                        } else {
                            objM108245c = obj2;
                            objM112707constructorimpl = Result.m112707constructorimpl((BaseDto) objM108245c);
                            function1 = this.$callback;
                            if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
                                abstractC24917a2M99269c = C25220y0.m99269c();
                                shortTVFloatManager$getShortTvEpisodeList$1$2$1 = new ShortTVFloatManager$getShortTvEpisodeList$1$2$1(i12, (BaseDto) objM112707constructorimpl, function1, null);
                                this.L$0 = objM112707constructorimpl;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.label = 3;
                                if (AbstractC25088i.m98910g(abstractC24917a2M99269c, shortTVFloatManager$getShortTvEpisodeList$1$2$1, this) == objF) {
                                    return objF;
                                }
                            }
                            function2 = this.$callback;
                            if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null) {
                                abstractC24917a2M99269c2 = C25220y0.m99269c();
                                shortTVFloatManager$getShortTvEpisodeList$1$3$1 = new ShortTVFloatManager$getShortTvEpisodeList$1$3$1(function2, null);
                                this.L$0 = objM112707constructorimpl;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.label = 4;
                                if (AbstractC25088i.m98910g(abstractC24917a2M99269c2, shortTVFloatManager$getShortTvEpisodeList$1$3$1, this) == objF) {
                                    return objF;
                                }
                            }
                        }
                    }
                } else if (i12 == 3) {
                    objM112707constructorimpl = this.L$0;
                    ResultKt.m97107b(obj);
                    function2 = this.$callback;
                    if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null) {
                        abstractC24917a2M99269c2 = C25220y0.m99269c();
                        shortTVFloatManager$getShortTvEpisodeList$1$3$1 = new ShortTVFloatManager$getShortTvEpisodeList$1$3$1(function2, null);
                        this.L$0 = objM112707constructorimpl;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 4;
                        if (AbstractC25088i.m98910g(abstractC24917a2M99269c2, shortTVFloatManager$getShortTvEpisodeList$1$3$1, this) == objF) {
                            return objF;
                        }
                    }
                } else {
                    if (i12 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(obj);
                }
                return Unit.f75682a;
            }
            ResultKt.m97107b(obj);
            int i13 = ((this.$selectEp - 1) / 20) * 20;
            int i14 = i13 + 1;
            C26866a.f81698a.m104912c("VideoFloat", "getShortTvEpisodes start：" + i14 + "  ", true);
            String str6 = this.$subjectId;
            try {
                Result.Companion companion = Result.INSTANCE;
                InterfaceC27847a interfaceC27847a = ShortTVFloatManager.f57813c;
                int i15 = i13 + 20;
                this.L$0 = str6;
                this.I$0 = i14;
                this.label = 1;
                str = str6;
                i11 = i14;
                try {
                    objM108245c = InterfaceC27847a.a.m108245c(interfaceC27847a, str6, i14, i15, 0, null, this, 24, null);
                    if (objM108245c == objF) {
                        return objF;
                    }
                    i12 = i11;
                } catch (Throwable th2) {
                    th = th2;
                    i12 = i11;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th));
                }
            } catch (Throwable th3) {
                th = th3;
                i11 = i14;
            }
            ShortTvInfoEpisodeList shortTvInfoEpisodeList = (ShortTvInfoEpisodeList) ((BaseDto) objM108245c).getData();
            if (shortTvInfoEpisodeList != null && (items = shortTvInfoEpisodeList.getItems()) != null) {
                it = items.iterator();
                obj2 = objM108245c;
                str2 = str;
                while (true) {
                    if (it.hasNext()) {
                        ShortTVItem shortTVItem3 = (ShortTVItem) it.next();
                        int ep4 = shortTVItem3.getEp();
                        video = shortTVItem3.getVideo();
                        if (video == null) {
                        }
                    } else {
                        objM108245c = obj2;
                    }
                }
            }
            objM112707constructorimpl = Result.m112707constructorimpl((BaseDto) objM108245c);
        } catch (Throwable th4) {
            th = th4;
        }
        function1 = this.$callback;
        if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
            abstractC24917a2M99269c = C25220y0.m99269c();
            shortTVFloatManager$getShortTvEpisodeList$1$2$1 = new ShortTVFloatManager$getShortTvEpisodeList$1$2$1(i12, (BaseDto) objM112707constructorimpl, function1, null);
            this.L$0 = objM112707constructorimpl;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 3;
            if (AbstractC25088i.m98910g(abstractC24917a2M99269c, shortTVFloatManager$getShortTvEpisodeList$1$2$1, this) == objF) {
                return objF;
            }
        }
        function2 = this.$callback;
        if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null) {
            abstractC24917a2M99269c2 = C25220y0.m99269c();
            shortTVFloatManager$getShortTvEpisodeList$1$3$1 = new ShortTVFloatManager$getShortTvEpisodeList$1$3$1(function2, null);
            this.L$0 = objM112707constructorimpl;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 4;
            if (AbstractC25088i.m98910g(abstractC24917a2M99269c2, shortTVFloatManager$getShortTvEpisodeList$1$3$1, this) == objF) {
                return objF;
            }
        }
        return Unit.f75682a;
    }
}
