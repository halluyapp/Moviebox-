package com.transsion.ugcvideodetail.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.ugcvideodetail.api.bean.UGCContent;
import com.transsion.ugcvideodetail.api.bean.UGCContentList;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.ugcvideodetail.api.bean.UGCVideoList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC24995a;
import kotlinx.coroutines.flow.InterfaceC24998b;
import org.apache.tools.zip.UnixStat;
import p922xv.InterfaceC28667a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel$getImmVideoRecommentList$1", m97637f = "UGCImmVideoDetailViewModel.kt", m97638l = {497}, m97639m = "invokeSuspend")
final class UGCImmVideoDetailViewModel$getImmVideoRecommentList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ String $ugcVideoId;
    int label;
    final /* synthetic */ UGCImmVideoDetailViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel$getImmVideoRecommentList$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/ugcvideodetail/api/bean/UGCContentList;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel$getImmVideoRecommentList$1$1", m97637f = "UGCImmVideoDetailViewModel.kt", m97638l = {UnixStat.DEFAULT_DIR_PERM, 494}, m97639m = "invokeSuspend")
    @SourceDebugExtension
    static final class C203431 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isRefresh;
        final /* synthetic */ String $ugcVideoId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UGCImmVideoDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203431(boolean z11, UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel, String str, Continuation<? super C203431> continuation) {
            super(2, continuation);
            this.$isRefresh = z11;
            this.this$0 = uGCImmVideoDetailViewModel;
            this.$ugcVideoId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C203431 c203431 = new C203431(this.$isRefresh, this.this$0, this.$ugcVideoId, continuation);
            c203431.L$0 = obj;
            return c203431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C203431) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC24998b interfaceC24998b;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    interfaceC24998b = (InterfaceC24998b) this.L$0;
                    ResultKt.m97107b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(obj);
                }
                return Unit.f75682a;
            }
            ResultKt.m97107b(obj);
            interfaceC24998b = (InterfaceC24998b) this.L$0;
            if (this.$isRefresh) {
                this.this$0.f64460I = "";
            }
            InterfaceC28667a interfaceC28667aM84167F = this.this$0.m84167F();
            String str = this.$ugcVideoId;
            String strM84200V0 = this.this$0.m84200V0();
            String str2 = this.this$0.f64460I;
            String str3 = str2 == null ? "" : str2;
            this.L$0 = interfaceC24998b;
            this.label = 1;
            obj = InterfaceC28667a.a.m110469b(interfaceC28667aM84167F, str, strM84200V0, str3, 0, null, this, 24, null);
            if (obj == objF) {
                return objF;
            }
            BaseDto baseDto = (BaseDto) obj;
            Object data = baseDto.getData();
            if (!Intrinsics.m97797c(baseDto.getCode(), "0")) {
                data = null;
            }
            this.L$0 = null;
            this.label = 2;
            if (interfaceC24998b.emit(data, this) == objF) {
                return objF;
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel$getImmVideoRecommentList$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/ugcvideodetail/api/bean/UGCContentList;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel$getImmVideoRecommentList$1$2", m97637f = "UGCImmVideoDetailViewModel.kt", m97638l = {496}, m97639m = "invokeSuspend")
    static final class C203442 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C203442(Continuation<? super C203442> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C203442 c203442 = new C203442(continuation);
            c203442.L$0 = interfaceC24998b;
            return c203442.invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC24998b interfaceC24998b = (InterfaceC24998b) this.L$0;
                this.label = 1;
                if (interfaceC24998b.emit(null, this) == objF) {
                    return objF;
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

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel$getImmVideoRecommentList$1$a */
    static final class C20345a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ UGCImmVideoDetailViewModel f64493a;

        C20345a(UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel) {
            this.f64493a = uGCImmVideoDetailViewModel;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0081  */
        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(UGCContentList uGCContentList, Continuation continuation) {
            UGCVideoList uGCVideoList;
            List<UGCVideo> items;
            List<UGCContent> items2;
            Pager pager;
            String nextPage;
            List<UGCVideo> items3;
            UGCVideoBelongToCollection belongToCollection;
            String collectionId;
            Integer videoNum;
            UGCVideoList uGCVideoList2;
            if (uGCContentList != null) {
                UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel = this.f64493a;
                List<UGCContent> items4 = uGCContentList.getItems();
                if (items4 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : items4) {
                        if (Intrinsics.m97797c(((UGCContent) obj).getTopicType(), "UGC_VIDEO")) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        UGCVideo video = ((UGCContent) it.next()).getVideo();
                        if (video != null) {
                            String ops = video.getOps();
                            if (ops == null || ops.length() == 0) {
                                video.setOps(uGCImmVideoDetailViewModel.m84201W0());
                            }
                        } else {
                            video = null;
                        }
                        if (video != null) {
                            arrayList2.add(video);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    if (arrayList2 != null) {
                        uGCVideoList2 = new UGCVideoList(CollectionsKt.m97343U0(arrayList2), uGCContentList.getPager());
                    } else {
                        uGCVideoList2 = null;
                    }
                } else {
                    uGCVideoList2 = null;
                }
                uGCVideoList = uGCVideoList2;
            } else {
                uGCVideoList = null;
            }
            Map linkedHashMap = (Map) this.f64493a.f64474W.m14847f();
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            if (uGCVideoList != null && (items3 = uGCVideoList.getItems()) != null) {
                for (UGCVideo uGCVideo : items3) {
                    if (uGCVideo.getBelongToCollection() != null && (belongToCollection = uGCVideo.getBelongToCollection()) != null && (collectionId = belongToCollection.getCollectionId()) != null) {
                        UGCVideoBelongToCollection belongToCollection2 = uGCVideo.getBelongToCollection();
                        linkedHashMap.put(collectionId, Boxing.m97634d((belongToCollection2 == null || (videoNum = belongToCollection2.getVideoNum()) == null) ? 1 : videoNum.intValue()));
                    }
                }
            }
            this.f64493a.f64474W.mo14858q(linkedHashMap);
            if (uGCContentList != null && (pager = uGCContentList.getPager()) != null && (nextPage = pager.getNextPage()) != null) {
                this.f64493a.f64460I = nextPage;
            }
            C26866a.a.m104898f(C26866a.f81698a, "UGCImmVideoDetailViewModel", "getImmVideoRecommentList,success:" + ((uGCContentList == null || (items2 = uGCContentList.getItems()) == null) ? null : Boxing.m97634d(items2.size())) + ", videoList size:" + ((uGCVideoList == null || (items = uGCVideoList.getItems()) == null) ? null : Boxing.m97634d(items.size())) + " ", false, 4, null);
            UGCImmVideoDetailViewModel.m84169G0(this.f64493a, false, uGCVideoList, 0, false, uGCContentList != null ? uGCContentList.getPager() : null, 12, null);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UGCImmVideoDetailViewModel$getImmVideoRecommentList$1(boolean z11, UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel, String str, Continuation<? super UGCImmVideoDetailViewModel$getImmVideoRecommentList$1> continuation) {
        super(2, continuation);
        this.$isRefresh = z11;
        this.this$0 = uGCImmVideoDetailViewModel;
        this.$ugcVideoId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCImmVideoDetailViewModel$getImmVideoRecommentList$1(this.$isRefresh, this.this$0, this.$ugcVideoId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UGCImmVideoDetailViewModel$getImmVideoRecommentList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C203431(this.$isRefresh, this.this$0, this.$ugcVideoId, null)), C25220y0.m99268b()), new C203442(null));
            C20345a c20345a = new C20345a(this.this$0);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c20345a, this) == objF) {
                return objF;
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
