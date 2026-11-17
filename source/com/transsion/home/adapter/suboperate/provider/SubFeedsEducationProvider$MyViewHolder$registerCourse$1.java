package com.transsion.home.adapter.suboperate.provider;

import com.transsion.edcation.CourseManager;
import com.transsion.edcation.bean.CourseBean;
import com.transsion.home.bean.OperateItem;
import com.transsion.moviedetailapi.bean.Subject;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.InterfaceC24998b;
import kotlinx.coroutines.flow.InterfaceC25073w0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.adapter.suboperate.provider.SubFeedsEducationProvider$MyViewHolder$registerCourse$1", m97637f = "SubFeedsEducationProvider.kt", m97638l = {168}, m97639m = "invokeSuspend")
final class SubFeedsEducationProvider$MyViewHolder$registerCourse$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SubFeedsEducationProvider.MyViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubFeedsEducationProvider$MyViewHolder$registerCourse$1(SubFeedsEducationProvider.MyViewHolder myViewHolder, Continuation<? super SubFeedsEducationProvider$MyViewHolder$registerCourse$1> continuation) {
        super(2, continuation);
        this.this$0 = myViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubFeedsEducationProvider$MyViewHolder$registerCourse$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SubFeedsEducationProvider$MyViewHolder$registerCourse$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC25073w0 interfaceC25073w0M66450j = CourseManager.f51684a.m66450j();
            final SubFeedsEducationProvider.MyViewHolder myViewHolder = this.this$0;
            InterfaceC24998b interfaceC24998b = new InterfaceC24998b() { // from class: com.transsion.home.adapter.suboperate.provider.SubFeedsEducationProvider$MyViewHolder$registerCourse$1.1

                /* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.provider.SubFeedsEducationProvider$MyViewHolder$registerCourse$1$1$1, reason: invalid class name */
                @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
                @DebugMetadata(m97636c = "com.transsion.home.adapter.suboperate.provider.SubFeedsEducationProvider$MyViewHolder$registerCourse$1$1$1", m97637f = "SubFeedsEducationProvider.kt", m97638l = {}, m97639m = "invokeSuspend")
                static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
                    int label;
                    final /* synthetic */ SubFeedsEducationProvider.MyViewHolder this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(SubFeedsEducationProvider.MyViewHolder myViewHolder, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = myViewHolder;
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
                        this.this$0.m67013k();
                        return Unit.f75682a;
                    }
                }

                @Override // kotlinx.coroutines.flow.InterfaceC24998b
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(CourseBean courseBean, Continuation continuation) {
                    Subject feedsSubject;
                    Subject feedsSubject2;
                    OperateItem operateItem = myViewHolder.mCurrentItem;
                    if (!Intrinsics.m97797c((operateItem == null || (feedsSubject2 = operateItem.getFeedsSubject()) == null) ? null : feedsSubject2.getSubjectId(), courseBean.getSubjectId())) {
                        return Unit.f75682a;
                    }
                    OperateItem operateItem2 = myViewHolder.mCurrentItem;
                    if (operateItem2 != null && (feedsSubject = operateItem2.getFeedsSubject()) != null) {
                        feedsSubject.setSeenStatus(Boxing.m97634d(courseBean.getSeenStatus()));
                    }
                    Object objM98910g = AbstractC25088i.m98910g(C25220y0.m99269c(), new AnonymousClass1(myViewHolder, null), continuation);
                    return objM98910g == IntrinsicsKt.m97630f() ? objM98910g : Unit.f75682a;
                }
            };
            this.label = 1;
            if (interfaceC25073w0M66450j.mo12985a(interfaceC24998b, this) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
