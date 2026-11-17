package com.transsion.home.adapter.suboperate.provider;

import com.cloud.tmc.kernel.constants.TmcConstants;
import com.transsion.edcation.CourseManager;
import com.transsion.edcation.bean.CourseBean;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC25075x0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.adapter.suboperate.provider.SubMyCourseProvider$registerCourse$1", m97637f = "SubMyCourseProvider.kt", m97638l = {TmcConstants.NOTIFY_ADDHOME_GUIDE_BACK_SHOW}, m97639m = "invokeSuspend")
final class SubMyCourseProvider$registerCourse$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SubMyCourseProvider this$0;

    /* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.provider.SubMyCourseProvider$registerCourse$1$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m97100d2 = {"<anonymous>", "", "it", "Lcom/transsion/edcation/bean/CourseBean;"}, m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @DebugMetadata(m97636c = "com.transsion.home.adapter.suboperate.provider.SubMyCourseProvider$registerCourse$1$1", m97637f = "SubMyCourseProvider.kt", m97638l = {85}, m97639m = "invokeSuspend")
    static final class C149491 extends SuspendLambda implements Function2<CourseBean, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SubMyCourseProvider this$0;

        /* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.provider.SubMyCourseProvider$registerCourse$1$1$1, reason: invalid class name */
        @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
        @DebugMetadata(m97636c = "com.transsion.home.adapter.suboperate.provider.SubMyCourseProvider$registerCourse$1$1$1", m97637f = "SubMyCourseProvider.kt", m97638l = {}, m97639m = "invokeSuspend")
        static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SubMyCourseProvider this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SubMyCourseProvider subMyCourseProvider, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = subMyCourseProvider;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt.m97630f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
                this.this$0.m67068W();
                return Unit.f75682a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C149491(SubMyCourseProvider subMyCourseProvider, Continuation<? super C149491> continuation) {
            super(2, continuation);
            this.this$0 = subMyCourseProvider;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C149491 c149491 = new C149491(this.this$0, continuation);
            c149491.L$0 = obj;
            return c149491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CourseBean courseBean, Continuation<? super Unit> continuation) {
            return ((C149491) create(courseBean, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                this.this$0.f52289h = (CourseBean) this.L$0;
                AbstractC24917a2 abstractC24917a2M99269c = C25220y0.m99269c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (AbstractC25088i.m98910g(abstractC24917a2M99269c, anonymousClass1, this) == objF) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubMyCourseProvider$registerCourse$1(SubMyCourseProvider subMyCourseProvider, Continuation<? super SubMyCourseProvider$registerCourse$1> continuation) {
        super(2, continuation);
        this.this$0 = subMyCourseProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubMyCourseProvider$registerCourse$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SubMyCourseProvider$registerCourse$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC25075x0 interfaceC25075x0M66451l = CourseManager.f51684a.m66451l();
            C149491 c149491 = new C149491(this.this$0, null);
            this.label = 1;
            if (AbstractC25001c.m98789h(interfaceC25075x0M66451l, c149491, this) == objF) {
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
