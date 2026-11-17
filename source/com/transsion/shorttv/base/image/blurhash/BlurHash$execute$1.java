package com.transsion.shorttv.base.image.blurhash;

import android.graphics.drawable.BitmapDrawable;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.AbstractC25089i0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.base.image.blurhash.BlurHash$execute$1", m97637f = "BlurHash.kt", m97638l = {Sdk$SDKMetric.SDKMetricType.TEMPLATE_HTML_SIZE_VALUE}, m97639m = "invokeSuspend")
final class BlurHash$execute$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $blurString;
    final /* synthetic */ int $height;
    final /* synthetic */ Function1<BitmapDrawable, Unit> $response;
    final /* synthetic */ int $width;
    Object L$0;
    int label;
    final /* synthetic */ BlurHash this$0;

    /* JADX INFO: renamed from: com.transsion.shorttv.base.image.blurhash.BlurHash$execute$1$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)Ljava/lang/Object;"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.shorttv.base.image.blurhash.BlurHash$execute$1$1", m97637f = "BlurHash.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C187641 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Object>, Object> {
        final /* synthetic */ Ref.ObjectRef<BitmapDrawable> $blurBitmap;
        final /* synthetic */ String $blurString;
        final /* synthetic */ int $height;
        final /* synthetic */ int $width;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BlurHash this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C187641(Ref.ObjectRef<BitmapDrawable> objectRef, String str, int i11, int i12, BlurHash blurHash, Continuation<? super C187641> continuation) {
            super(2, continuation);
            this.$blurBitmap = objectRef;
            this.$blurString = str;
            this.$width = i11;
            this.$height = i12;
            this.this$0 = blurHash;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C187641 c187641 = new C187641(this.$blurBitmap, this.$blurString, this.$width, this.$height, this.this$0, continuation);
            c187641.L$0 = obj;
            return c187641;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<Object> continuation) {
            return ((C187641) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, android.graphics.drawable.BitmapDrawable, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            Ref.ObjectRef<BitmapDrawable> objectRef = this.$blurBitmap;
            BitmapDrawable bitmapDrawable = objectRef.element;
            if (bitmapDrawable != null) {
                return bitmapDrawable;
            }
            String str = this.$blurString;
            int i11 = this.$width;
            int i12 = this.$height;
            BlurHash blurHash = this.this$0;
            ?? bitmapDrawable2 = new BitmapDrawable(blurHash.f60606a.getResources(), C18765a.f60610a.m79091b(str, i11, i12, blurHash.f60607b, false));
            objectRef.element = bitmapDrawable2;
            Intrinsics.m97799e(bitmapDrawable2);
            blurHash.m79078e(str, bitmapDrawable2);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BlurHash$execute$1(BlurHash blurHash, String str, Function1<? super BitmapDrawable, Unit> function1, int i11, int i12, Continuation<? super BlurHash$execute$1> continuation) {
        super(2, continuation);
        this.this$0 = blurHash;
        this.$blurString = str;
        this.$response = function1;
        this.$width = i11;
        this.$height = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BlurHash$execute$1(this.this$0, this.$blurString, this.$response, this.$width, this.$height, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((BlurHash$execute$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, android.graphics.drawable.BitmapDrawable] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = this.this$0.m79079g(this.$blurString);
            AbstractC25089i0 abstractC25089i0M99268b = C25220y0.m99268b();
            C187641 c187641 = new C187641(objectRef2, this.$blurString, this.$width, this.$height, this.this$0, null);
            this.L$0 = objectRef2;
            this.label = 1;
            if (AbstractC25088i.m98910g(abstractC25089i0M99268b, c187641, this) == objF) {
                return objF;
            }
            objectRef = objectRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            ResultKt.m97107b(obj);
        }
        Function1<BitmapDrawable, Unit> function1 = this.$response;
        T t11 = objectRef.element;
        Intrinsics.m97799e(t11);
        function1.invoke(t11);
        return Unit.f75682a;
    }
}
