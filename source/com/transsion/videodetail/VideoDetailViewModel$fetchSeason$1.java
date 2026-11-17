package com.transsion.videodetail;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.moviedetailapi.bean.ResourcesSeasonList;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt;
import kotlinx.coroutines.flow.InterfaceC24995a;
import kotlinx.coroutines.flow.InterfaceC24998b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.videodetail.VideoDetailViewModel$fetchSeason$1", m97637f = "VideoDetailViewModel.kt", m97638l = {110}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class VideoDetailViewModel$fetchSeason$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $subjectId;
    int label;
    final /* synthetic */ VideoDetailViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.videodetail.VideoDetailViewModel$fetchSeason$1$2 */
    @Metadata(m97099d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/tn/lib/net/bean/BaseDto;", "Lcom/transsion/moviedetailapi/bean/ResourcesSeasonList;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.videodetail.VideoDetailViewModel$fetchSeason$1$2", m97637f = "VideoDetailViewModel.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C209242 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ VideoDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C209242(VideoDetailViewModel videoDetailViewModel, Continuation<? super C209242> continuation) {
            super(3, continuation);
            this.this$0 = videoDetailViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            return new C209242(this.this$0, continuation).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            this.this$0.f65706a.mo14858q(null);
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.videodetail.VideoDetailViewModel$fetchSeason$1$3 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m97100d2 = {"<anonymous>", "", "it", "Lcom/tn/lib/net/bean/BaseDto;", "Lcom/transsion/moviedetailapi/bean/ResourcesSeasonList;"}, m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @DebugMetadata(m97636c = "com.transsion.videodetail.VideoDetailViewModel$fetchSeason$1$3", m97637f = "VideoDetailViewModel.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C209253 extends SuspendLambda implements Function2<BaseDto<ResourcesSeasonList>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $subjectId;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ VideoDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C209253(VideoDetailViewModel videoDetailViewModel, String str, Continuation<? super C209253> continuation) {
            super(2, continuation);
            this.this$0 = videoDetailViewModel;
            this.$subjectId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C209253 c209253 = new C209253(this.this$0, this.$subjectId, continuation);
            c209253.L$0 = obj;
            return c209253;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BaseDto<ResourcesSeasonList> baseDto, Continuation<? super Unit> continuation) {
            return ((C209253) create(baseDto, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            BaseDto baseDto = (BaseDto) this.L$0;
            this.this$0.f65706a.mo14858q(baseDto.getData());
            VideoDetailViewModel videoDetailViewModel = this.this$0;
            String str = this.$subjectId;
            ResourcesSeasonList resourcesSeasonList = (ResourcesSeasonList) baseDto.getData();
            videoDetailViewModel.m86117p(str, resourcesSeasonList != null ? resourcesSeasonList.getSeasons() : null);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoDetailViewModel$fetchSeason$1(String str, VideoDetailViewModel videoDetailViewModel, Continuation<? super VideoDetailViewModel$fetchSeason$1> continuation) {
        super(2, continuation);
        this.$subjectId = str;
        this.this$0 = videoDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoDetailViewModel$fetchSeason$1(this.$subjectId, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((VideoDetailViewModel$fetchSeason$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            final InterfaceC24995a interfaceC24995aM98800s = AbstractC25001c.m98800s(this.$subjectId);
            final VideoDetailViewModel videoDetailViewModel = this.this$0;
            final String str = this.$subjectId;
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(FlowKt__ErrorsKt.m98709f(new InterfaceC24995a() { // from class: com.transsion.videodetail.VideoDetailViewModel$fetchSeason$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: com.transsion.videodetail.VideoDetailViewModel$fetchSeason$1$invokeSuspend$$inlined$map$1$2 */
                public static final class C209262 implements InterfaceC24998b {

                    /* JADX INFO: renamed from: a */
                    final /* synthetic */ InterfaceC24998b f65720a;

                    /* JADX INFO: renamed from: b */
                    final /* synthetic */ VideoDetailViewModel f65721b;

                    /* JADX INFO: renamed from: c */
                    final /* synthetic */ String f65722c;

                    /* JADX INFO: renamed from: com.transsion.videodetail.VideoDetailViewModel$fetchSeason$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
                    @DebugMetadata(m97636c = "com.transsion.videodetail.VideoDetailViewModel$fetchSeason$1$invokeSuspend$$inlined$map$1$2", m97637f = "VideoDetailViewModel.kt", m97638l = {Sdk$SDKMetric.SDKMetricType.AD_REWARD_USER_VALUE, 50}, m97639m = "emit")
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C209262.this.emit(null, this);
                        }
                    }

                    public C209262(InterfaceC24998b interfaceC24998b, VideoDetailViewModel videoDetailViewModel, String str) {
                        this.f65720a = interfaceC24998b;
                        this.f65721b = videoDetailViewModel;
                        this.f65722c = str;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.InterfaceC24998b
                    public final Object emit(Object obj, Continuation continuation) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        InterfaceC24998b interfaceC24998b;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i11 = anonymousClass1.label;
                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        Object objF = IntrinsicsKt.m97630f();
                        int i12 = anonymousClass1.label;
                        if (i12 != 0) {
                            if (i12 == 1) {
                                interfaceC24998b = (InterfaceC24998b) anonymousClass1.L$0;
                                ResultKt.m97107b(obj2);
                            } else {
                                if (i12 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.m97107b(obj2);
                            }
                            return Unit.f75682a;
                        }
                        ResultKt.m97107b(obj2);
                        InterfaceC24998b interfaceC24998b2 = this.f65720a;
                        InterfaceC20941b interfaceC20941bM86118z = this.f65721b.m86118z();
                        String str = this.f65722c;
                        anonymousClass1.L$0 = interfaceC24998b2;
                        anonymousClass1.label = 1;
                        Object objM86188b = InterfaceC20941b.a.m86188b(interfaceC20941bM86118z, str, null, anonymousClass1, 2, null);
                        if (objM86188b == objF) {
                            return objF;
                        }
                        obj2 = objM86188b;
                        interfaceC24998b = interfaceC24998b2;
                        anonymousClass1.L$0 = null;
                        anonymousClass1.label = 2;
                        if (interfaceC24998b.emit(obj2, anonymousClass1) == objF) {
                            return objF;
                        }
                        return Unit.f75682a;
                    }
                }

                @Override // kotlinx.coroutines.flow.InterfaceC24995a
                /* JADX INFO: renamed from: a */
                public Object mo12985a(InterfaceC24998b interfaceC24998b, Continuation continuation) {
                    Object objMo12985a = interfaceC24995aM98800s.mo12985a(new C209262(interfaceC24998b, videoDetailViewModel, str), continuation);
                    return objMo12985a == IntrinsicsKt.m97630f() ? objMo12985a : Unit.f75682a;
                }
            }, 1L, null, 2, null), new C209242(this.this$0, null));
            C209253 c209253 = new C209253(this.this$0, this.$subjectId, null);
            this.label = 1;
            if (AbstractC25001c.m98789h(interfaceC24995aM98786e, c209253, this) == objF) {
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
