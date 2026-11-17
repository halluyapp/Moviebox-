package com.transsion.ugcvideodetail.viewmodel;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.baselib.p291db.video.UGCCollectionVideoGroupDao;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.ugcvideodetail.api.bean.UGCImmVideo;
import com.transsion.ugcvideodetail.api.bean.UGCImmVideoContent;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.ugcvideodetail.api.bean.UGCVideoList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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
import p822uv.AbstractC28042e;
import p922xv.InterfaceC28667a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel$getImmVideoList$1", m97637f = "UGCImmVideoDetailViewModel.kt", m97638l = {424}, m97639m = "invokeSuspend")
final class UGCImmVideoDetailViewModel$getImmVideoList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $collectionId;
    final /* synthetic */ int $endPosition;
    final /* synthetic */ boolean $isLoadDown;
    final /* synthetic */ int $startPosition;
    final /* synthetic */ boolean $withoutPlayInfo;
    int label;
    final /* synthetic */ UGCImmVideoDetailViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel$getImmVideoList$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideoList;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel$getImmVideoList$1$1", m97637f = "UGCImmVideoDetailViewModel.kt", m97638l = {TTAdConstant.DOWNLOAD_APP_INFO_CODE, TTAdConstant.IMAGE_LIST_CODE, TTAdConstant.VIDEO_COVER_URL_CODE, 419}, m97639m = "invokeSuspend")
    @SourceDebugExtension
    static final class C203401 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $collectionId;
        final /* synthetic */ int $endPosition;
        final /* synthetic */ int $startPosition;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ UGCImmVideoDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203401(UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel, String str, int i11, int i12, Continuation<? super C203401> continuation) {
            super(2, continuation);
            this.this$0 = uGCImmVideoDetailViewModel;
            this.$collectionId = str;
            this.$startPosition = i11;
            this.$endPosition = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C203401 c203401 = new C203401(this.this$0, this.$collectionId, this.$startPosition, this.$endPosition, continuation);
            c203401.L$0 = obj;
            return c203401;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C203401) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:52:0x0103 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM110477j;
            InterfaceC24998b interfaceC24998b;
            BaseDto baseDto;
            List arrayList;
            List<UGCVideo> items;
            Object data;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            baseDto = (BaseDto) this.L$1;
                            interfaceC24998b = (InterfaceC24998b) this.L$0;
                            ResultKt.m97107b(obj);
                            data = baseDto.getData();
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 4;
                            if (interfaceC24998b.emit(data, this) == objF) {
                                return objF;
                            }
                        } else if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    ResultKt.m97107b(obj);
                } else {
                    InterfaceC24998b interfaceC24998b2 = (InterfaceC24998b) this.L$0;
                    ResultKt.m97107b(obj);
                    interfaceC24998b = interfaceC24998b2;
                    objM110477j = obj;
                }
                return Unit.f75682a;
            }
            ResultKt.m97107b(obj);
            InterfaceC24998b interfaceC24998b3 = (InterfaceC24998b) this.L$0;
            InterfaceC28667a interfaceC28667aM84167F = this.this$0.m84167F();
            String str = this.$collectionId;
            int i12 = this.$startPosition;
            int i13 = this.$endPosition;
            this.L$0 = interfaceC24998b3;
            this.label = 1;
            objM110477j = InterfaceC28667a.a.m110477j(interfaceC28667aM84167F, str, i12, i13, 0, null, this, 24, null);
            if (objM110477j == objF) {
                return objF;
            }
            interfaceC24998b = interfaceC24998b3;
            baseDto = (BaseDto) objM110477j;
            if (Intrinsics.m97797c(baseDto.getCode(), "0")) {
                UGCVideoList uGCVideoList = (UGCVideoList) baseDto.getData();
                List<UGCVideo> items2 = uGCVideoList != null ? uGCVideoList.getItems() : null;
                if (items2 != null && !items2.isEmpty()) {
                    UGCVideoList uGCVideoList2 = (UGCVideoList) baseDto.getData();
                    if (uGCVideoList2 == null || (items = uGCVideoList2.getItems()) == null) {
                        arrayList = new ArrayList();
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<T> it = items.iterator();
                        while (it.hasNext()) {
                            String ugcVideoId = ((UGCVideo) it.next()).getUgcVideoId();
                            if (ugcVideoId != null) {
                                arrayList2.add(ugcVideoId);
                            }
                        }
                        arrayList = CollectionsKt.m97343U0(arrayList2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        UGCCollectionVideoGroupDao uGCCollectionVideoGroupDaoM84292z = this.this$0.m84292z();
                        String str2 = this.$collectionId;
                        this.L$0 = interfaceC24998b;
                        this.L$1 = baseDto;
                        this.label = 3;
                        if (uGCCollectionVideoGroupDaoM84292z.mo64957a(str2, arrayList, this) == objF) {
                            return objF;
                        }
                    }
                }
                data = baseDto.getData();
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
                if (interfaceC24998b.emit(data, this) == objF) {
                    return objF;
                }
            } else {
                this.L$0 = null;
                this.label = 2;
                if (interfaceC24998b.emit(null, this) == objF) {
                    return objF;
                }
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel$getImmVideoList$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideoList;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel$getImmVideoList$1$2", m97637f = "UGCImmVideoDetailViewModel.kt", m97638l = {423}, m97639m = "invokeSuspend")
    static final class C203412 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C203412(Continuation<? super C203412> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C203412 c203412 = new C203412(continuation);
            c203412.L$0 = interfaceC24998b;
            return c203412.invokeSuspend(Unit.f75682a);
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

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel$getImmVideoList$1$a */
    static final class C20342a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f64487a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f64488b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ UGCImmVideoDetailViewModel f64489c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f64490d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f64491e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ boolean f64492f;

        C20342a(boolean z11, int i11, UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel, String str, int i12, boolean z12) {
            this.f64487a = z11;
            this.f64488b = i11;
            this.f64489c = uGCImmVideoDetailViewModel;
            this.f64490d = str;
            this.f64491e = i12;
            this.f64492f = z12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(UGCVideoList uGCVideoList, Continuation continuation) {
            Pager pager;
            Integer totalCount;
            List<UGCVideo> items;
            List<UGCVideo> items2;
            UGCVideoBelongToCollection belongToCollection;
            UGCVideo ugcVideo;
            UGCVideoBelongToCollection belongToCollection2;
            if (uGCVideoList != null) {
                uGCVideoList.setLoadDown(this.f64487a);
            }
            int i11 = this.f64488b;
            if (uGCVideoList != null && (items2 = uGCVideoList.getItems()) != null) {
                UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel = this.f64489c;
                String str = this.f64490d;
                for (UGCVideo uGCVideo : items2) {
                    uGCVideo.setPlayListPosition(i11);
                    String ops = uGCVideo.getOps();
                    if (ops == null || ops.length() == 0) {
                        uGCVideo.setOps(uGCImmVideoDetailViewModel.m84201W0());
                    }
                    UGCImmVideo uGCImmVideo = (UGCImmVideo) uGCImmVideoDetailViewModel.f64479b0.m14847f();
                    if (uGCVideo.getBelongToCollection() == null) {
                        if (Intrinsics.m97797c((uGCImmVideo == null || (ugcVideo = uGCImmVideo.getUgcVideo()) == null || (belongToCollection2 = ugcVideo.getBelongToCollection()) == null) ? null : belongToCollection2.getCollectionId(), str)) {
                            UGCVideo ugcVideo2 = uGCImmVideo.getUgcVideo();
                            UGCVideoBelongToCollection uGCVideoBelongToCollectionM109016a = (ugcVideo2 == null || (belongToCollection = ugcVideo2.getBelongToCollection()) == null) ? null : AbstractC28042e.m109016a(belongToCollection);
                            if (uGCVideoBelongToCollectionM109016a != null) {
                                uGCVideoBelongToCollectionM109016a.setPosition(Boxing.m97634d(i11));
                            }
                            uGCVideo.setBelongToCollection(uGCVideoBelongToCollectionM109016a);
                        }
                    }
                    i11++;
                }
            }
            if (uGCVideoList != null && (items = uGCVideoList.getItems()) != null && !items.isEmpty()) {
                this.f64489c.f64464M = this.f64490d;
                if (this.f64489c.f64465N == 0 || this.f64489c.f64466O == 0) {
                    this.f64489c.f64465N = this.f64488b;
                    this.f64489c.f64466O = this.f64491e;
                } else {
                    UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel2 = this.f64489c;
                    uGCImmVideoDetailViewModel2.f64465N = Math.min(uGCImmVideoDetailViewModel2.f64465N, this.f64488b);
                    UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel3 = this.f64489c;
                    uGCImmVideoDetailViewModel3.f64466O = Math.max(uGCImmVideoDetailViewModel3.f64466O, this.f64491e);
                }
                C26866a.a.m104898f(C26866a.f81698a, "UGCImmVideoDetailViewModel", "Updated loaded playList range: collectionId=" + this.f64490d + ", range[" + this.f64489c.f64465N + "-" + this.f64489c.f64466O + "]", false, 4, null);
            }
            if (uGCVideoList != null && (pager = uGCVideoList.getPager()) != null && (totalCount = pager.getTotalCount()) != null) {
                this.f64489c.f64474W.mo14858q(MapsKt.m97578m(TuplesKt.m97108a(this.f64490d, Boxing.m97634d(totalCount.intValue()))));
            }
            if (this.f64492f) {
                ArrayList arrayList = new ArrayList();
                List<UGCVideo> items3 = uGCVideoList != null ? uGCVideoList.getItems() : null;
                List<UGCVideo> list = items3;
                if (list != null && !list.isEmpty()) {
                    Iterator<T> it = items3.iterator();
                    while (it.hasNext()) {
                        UGCImmVideo uGCImmVideo2 = new UGCImmVideo((UGCVideo) it.next(), null);
                        uGCImmVideo2.setCollectionList(true);
                        uGCImmVideo2.getIsCollectionList();
                        arrayList.add(uGCImmVideo2);
                    }
                }
                this.f64489c.f64476Y.mo14858q(arrayList.isEmpty() ? null : new UGCImmVideoContent(arrayList, this.f64487a, uGCVideoList != null ? uGCVideoList.getPager() : null));
            } else {
                this.f64489c.m84168F0(true, uGCVideoList, this.f64488b, this.f64487a, uGCVideoList != null ? uGCVideoList.getPager() : null);
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UGCImmVideoDetailViewModel$getImmVideoList$1(UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel, String str, int i11, int i12, boolean z11, boolean z12, Continuation<? super UGCImmVideoDetailViewModel$getImmVideoList$1> continuation) {
        super(2, continuation);
        this.this$0 = uGCImmVideoDetailViewModel;
        this.$collectionId = str;
        this.$startPosition = i11;
        this.$endPosition = i12;
        this.$isLoadDown = z11;
        this.$withoutPlayInfo = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCImmVideoDetailViewModel$getImmVideoList$1(this.this$0, this.$collectionId, this.$startPosition, this.$endPosition, this.$isLoadDown, this.$withoutPlayInfo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UGCImmVideoDetailViewModel$getImmVideoList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C203401(this.this$0, this.$collectionId, this.$startPosition, this.$endPosition, null)), C25220y0.m99268b()), new C203412(null));
            C20342a c20342a = new C20342a(this.$isLoadDown, this.$startPosition, this.this$0, this.$collectionId, this.$endPosition, this.$withoutPlayInfo);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c20342a, this) == objF) {
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
