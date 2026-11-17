package com.transsion.home.adapter.suboperate.adapter;

import android.graphics.Bitmap;
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
import sh.AbstractC27614a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.adapter.suboperate.adapter.SubBannerADViewHolder$renderHiADMask$1$onResourceReady$1", m97637f = "SubBannerADViewHolder.kt", m97638l = {128}, m97639m = "invokeSuspend")
final class SubBannerADViewHolder$renderHiADMask$1$onResourceReady$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bitmap $resource;
    int label;
    final /* synthetic */ SubBannerADViewHolder this$0;

    /* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.adapter.SubBannerADViewHolder$renderHiADMask$1$onResourceReady$1$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.home.adapter.suboperate.adapter.SubBannerADViewHolder$renderHiADMask$1$onResourceReady$1$1", m97637f = "SubBannerADViewHolder.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C149201 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $averageColor;
        int label;
        final /* synthetic */ SubBannerADViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C149201(SubBannerADViewHolder subBannerADViewHolder, int i11, Continuation<? super C149201> continuation) {
            super(2, continuation);
            this.this$0 = subBannerADViewHolder;
            this.$averageColor = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C149201(this.this$0, this.$averageColor, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C149201) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            this.this$0.m66908m(this.$averageColor);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubBannerADViewHolder$renderHiADMask$1$onResourceReady$1(Bitmap bitmap, SubBannerADViewHolder subBannerADViewHolder, Continuation<? super SubBannerADViewHolder$renderHiADMask$1$onResourceReady$1> continuation) {
        super(2, continuation);
        this.$resource = bitmap;
        this.this$0 = subBannerADViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubBannerADViewHolder$renderHiADMask$1$onResourceReady$1(this.$resource, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SubBannerADViewHolder$renderHiADMask$1$onResourceReady$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            int iM107444b = AbstractC27614a.m107444b(this.$resource, 0, 0, 6, null);
            AbstractC24917a2 abstractC24917a2M99269c = C25220y0.m99269c();
            C149201 c149201 = new C149201(this.this$0, iM107444b, null);
            this.label = 1;
            if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c149201, this) == objF) {
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
