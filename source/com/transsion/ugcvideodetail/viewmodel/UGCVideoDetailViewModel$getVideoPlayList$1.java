package com.transsion.ugcvideodetail.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.baselib.p291db.video.UGCCollectionVideoGroupDao;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import p922xv.InterfaceC28667a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$getVideoPlayList$1", m97637f = "UGCVideoDetailViewModel.kt", m97638l = {393}, m97639m = "invokeSuspend")
final class UGCVideoDetailViewModel$getVideoPlayList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $collectionId;
    final /* synthetic */ int $endPosition;
    final /* synthetic */ boolean $isLoadDown;
    final /* synthetic */ int $startPosition;
    int label;
    final /* synthetic */ UGCVideoDetailViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$getVideoPlayList$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideoList;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$getVideoPlayList$1$1", m97637f = "UGCVideoDetailViewModel.kt", m97638l = {378, 380, 385, 388}, m97639m = "invokeSuspend")
    @SourceDebugExtension
    static final class C203681 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $collectionId;
        final /* synthetic */ int $endPosition;
        final /* synthetic */ int $startPosition;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ UGCVideoDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203681(UGCVideoDetailViewModel uGCVideoDetailViewModel, String str, int i11, int i12, Continuation<? super C203681> continuation) {
            super(2, continuation);
            this.this$0 = uGCVideoDetailViewModel;
            this.$collectionId = str;
            this.$startPosition = i11;
            this.$endPosition = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C203681 c203681 = new C203681(this.this$0, this.$collectionId, this.$startPosition, this.$endPosition, continuation);
            c203681.L$0 = obj;
            return c203681;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C203681) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
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
            InterfaceC28667a interfaceC28667aM84228F = this.this$0.m84228F();
            String str = this.$collectionId;
            int i12 = this.$startPosition;
            int i13 = this.$endPosition;
            this.L$0 = interfaceC24998b3;
            this.label = 1;
            objM110477j = InterfaceC28667a.a.m110477j(interfaceC28667aM84228F, str, i12, i13, 0, null, this, 24, null);
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

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$getVideoPlayList$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideoList;", "", "e", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$getVideoPlayList$1$2", m97637f = "UGCVideoDetailViewModel.kt", m97638l = {392}, m97639m = "invokeSuspend")
    static final class C203692 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C203692(Continuation<? super C203692> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C203692 c203692 = new C203692(continuation);
            c203692.L$0 = interfaceC24998b;
            return c203692.invokeSuspend(Unit.f75682a);
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

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$getVideoPlayList$1$a */
    static final class C20370a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f64544a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f64545b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ UGCVideoDetailViewModel f64546c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f64547d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f64548e;

        C20370a(boolean z11, int i11, UGCVideoDetailViewModel uGCVideoDetailViewModel, String str, int i12) {
            this.f64544a = z11;
            this.f64545b = i11;
            this.f64546c = uGCVideoDetailViewModel;
            this.f64547d = str;
            this.f64548e = i12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(UGCVideoList uGCVideoList, Continuation continuation) {
            Pager pager;
            Integer totalCount;
            List<UGCVideo> items;
            List<UGCVideo> items2;
            if (uGCVideoList != null) {
                uGCVideoList.setLoadDown(this.f64544a);
            }
            int i11 = this.f64545b;
            if (uGCVideoList != null && (items2 = uGCVideoList.getItems()) != null) {
                Iterator<T> it = items2.iterator();
                while (it.hasNext()) {
                    ((UGCVideo) it.next()).setPlayListPosition(i11);
                    i11++;
                }
            }
            if (uGCVideoList != null && (items = uGCVideoList.getItems()) != null && !items.isEmpty()) {
                this.f64546c.f64508A = this.f64547d;
                if (this.f64546c.f64509B == 0 || this.f64546c.f64510C == 0) {
                    this.f64546c.f64509B = this.f64545b;
                    this.f64546c.f64510C = this.f64548e;
                } else {
                    UGCVideoDetailViewModel uGCVideoDetailViewModel = this.f64546c;
                    uGCVideoDetailViewModel.f64509B = Math.min(uGCVideoDetailViewModel.f64509B, this.f64545b);
                    UGCVideoDetailViewModel uGCVideoDetailViewModel2 = this.f64546c;
                    uGCVideoDetailViewModel2.f64510C = Math.max(uGCVideoDetailViewModel2.f64510C, this.f64548e);
                }
                C26866a.a.m104898f(C26866a.f81698a, "UGCVideoDetailViewModel", "Updated loaded playList range: collectionId=" + this.f64547d + ", range[" + this.f64546c.f64509B + "-" + this.f64546c.f64510C + "]", false, 4, null);
            }
            if (uGCVideoList != null && (pager = uGCVideoList.getPager()) != null && (totalCount = pager.getTotalCount()) != null) {
                this.f64546c.f64535u.mo14858q(Boxing.m97634d(totalCount.intValue()));
            }
            this.f64546c.f64533s.mo14858q(uGCVideoList);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UGCVideoDetailViewModel$getVideoPlayList$1(UGCVideoDetailViewModel uGCVideoDetailViewModel, String str, int i11, int i12, boolean z11, Continuation<? super UGCVideoDetailViewModel$getVideoPlayList$1> continuation) {
        super(2, continuation);
        this.this$0 = uGCVideoDetailViewModel;
        this.$collectionId = str;
        this.$startPosition = i11;
        this.$endPosition = i12;
        this.$isLoadDown = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCVideoDetailViewModel$getVideoPlayList$1(this.this$0, this.$collectionId, this.$startPosition, this.$endPosition, this.$isLoadDown, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UGCVideoDetailViewModel$getVideoPlayList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C203681(this.this$0, this.$collectionId, this.$startPosition, this.$endPosition, null)), C25220y0.m99268b()), new C203692(null));
            C20370a c20370a = new C20370a(this.$isLoadDown, this.$startPosition, this.this$0, this.$collectionId, this.$endPosition);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c20370a, this) == objF) {
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
