package com.transsion.postdetail.p306ui.view;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Subject;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC24995a;
import kotlinx.coroutines.flow.InterfaceC24998b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.ui.view.ShortTvImmVideoItemView$updateShortTVInfo$1", m97637f = "ShortTvImmVideoItemView.kt", m97638l = {341}, m97639m = "invokeSuspend")
final class ShortTvImmVideoItemView$updateShortTVInfo$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ShortTvImmVideoItemView this$0;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.ShortTvImmVideoItemView$updateShortTVInfo$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.ui.view.ShortTvImmVideoItemView$updateShortTVInfo$1$1", m97637f = "ShortTvImmVideoItemView.kt", m97638l = {338}, m97639m = "invokeSuspend")
    static final class C173411 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ShortTvImmVideoItemView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C173411(ShortTvImmVideoItemView shortTvImmVideoItemView, Continuation<? super C173411> continuation) {
            super(2, continuation);
            this.this$0 = shortTvImmVideoItemView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C173411 c173411 = new C173411(this.this$0, continuation);
            c173411.L$0 = obj;
            return c173411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C173411) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Cover cover;
            String url;
            AssetManager assets;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC24998b interfaceC24998b = (InterfaceC24998b) this.L$0;
                Subject subject = this.this$0.data;
                if (subject != null && (cover = subject.getCover()) != null && (url = cover.getUrl()) != null) {
                    Context context = this.this$0.viewBinding.f86475f.getContext();
                    InputStream inputStreamOpen = (context == null || (assets = context.getAssets()) == null) ? null : assets.open(url);
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                    this.L$0 = inputStreamOpen;
                    this.label = 1;
                    if (interfaceC24998b.emit(bitmapDecodeStream, this) == objF) {
                        return objF;
                    }
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

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.ShortTvImmVideoItemView$updateShortTVInfo$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.ui.view.ShortTvImmVideoItemView$updateShortTVInfo$1$2", m97637f = "ShortTvImmVideoItemView.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C173422 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        int label;

        C173422(Continuation<? super C173422> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            return new C173422(continuation).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.ShortTvImmVideoItemView$updateShortTVInfo$1$a */
    static final class C17343a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ShortTvImmVideoItemView f57715a;

        C17343a(ShortTvImmVideoItemView shortTvImmVideoItemView) {
            this.f57715a = shortTvImmVideoItemView;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Bitmap bitmap, Continuation continuation) {
            this.f57715a.viewBinding.f86479j.setImageBitmap(bitmap);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvImmVideoItemView$updateShortTVInfo$1(ShortTvImmVideoItemView shortTvImmVideoItemView, Continuation<? super ShortTvImmVideoItemView$updateShortTVInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = shortTvImmVideoItemView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTvImmVideoItemView$updateShortTVInfo$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTvImmVideoItemView$updateShortTVInfo$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C173411(this.this$0, null)), C25220y0.m99268b()), new C173422(null));
            C17343a c17343a = new C17343a(this.this$0);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c17343a, this) == objF) {
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
