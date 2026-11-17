package com.transsion.player.longvideo.member;

import android.widget.ImageView;
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
import ng.AbstractC26006c;
import p553ko.C24715a;
import p553ko.C24716b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.player.longvideo.member.LongVodResolutionMemberView$setConfig$1$1", m97637f = "LongVodResolutionMemberView.kt", m97638l = {67, 71}, m97639m = "invokeSuspend")
final class LongVodResolutionMemberView$setConfig$1$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C24716b $config;
    final /* synthetic */ C24715a $longVdPlayerBean;
    int label;
    final /* synthetic */ LongVodResolutionMemberView this$0;

    /* JADX INFO: renamed from: com.transsion.player.longvideo.member.LongVodResolutionMemberView$setConfig$1$1$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.player.longvideo.member.LongVodResolutionMemberView$setConfig$1$1$1", m97637f = "LongVodResolutionMemberView.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C164801 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isShow;
        int label;
        final /* synthetic */ LongVodResolutionMemberView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C164801(LongVodResolutionMemberView longVodResolutionMemberView, boolean z11, Continuation<? super C164801> continuation) {
            super(2, continuation);
            this.this$0 = longVodResolutionMemberView;
            this.$isShow = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C164801(this.this$0, this.$isShow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C164801) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            ImageView imageView = this.this$0.ivMember;
            if (imageView != null) {
                AbstractC26006c.m102057j(imageView, this.$isShow);
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LongVodResolutionMemberView$setConfig$1$1(C24715a c24715a, C24716b c24716b, LongVodResolutionMemberView longVodResolutionMemberView, Continuation<? super LongVodResolutionMemberView$setConfig$1$1> continuation) {
        super(2, continuation);
        this.$longVdPlayerBean = c24715a;
        this.$config = c24716b;
        this.this$0 = longVodResolutionMemberView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LongVodResolutionMemberView$setConfig$1$1(this.$longVdPlayerBean, this.$config, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((LongVodResolutionMemberView$setConfig$1$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
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
        ResolutionMemberManager resolutionMemberManager = ResolutionMemberManager.f55604a;
        C24715a c24715a = this.$longVdPlayerBean;
        this.label = 1;
        obj = resolutionMemberManager.m71893f(c24715a, this);
        if (obj == objF) {
            return objF;
        }
        boolean z11 = !((Boolean) obj).booleanValue() && C16503r.f55634a.m71938q(this.$config.m97074d());
        AbstractC24917a2 abstractC24917a2M99269c = C25220y0.m99269c();
        C164801 c164801 = new C164801(this.this$0, z11, null);
        this.label = 2;
        if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c164801, this) == objF) {
            return objF;
        }
        return Unit.f75682a;
    }
}
