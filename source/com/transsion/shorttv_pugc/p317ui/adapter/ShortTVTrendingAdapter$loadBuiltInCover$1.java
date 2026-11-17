package com.transsion.shorttv_pugc.p317ui.adapter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.appcompat.widget.AppCompatImageView;
import com.transsion.shorttv_pugc.bean.Cover;
import com.transsion.shorttv_pugc.bean.Subject;
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
@DebugMetadata(m97636c = "com.transsion.shorttv_pugc.ui.adapter.ShortTVTrendingAdapter$loadBuiltInCover$1", m97637f = "ShortTVTrendingAdapter.kt", m97638l = {164}, m97639m = "invokeSuspend")
final class ShortTVTrendingAdapter$loadBuiltInCover$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Subject $item;
    final /* synthetic */ AppCompatImageView $this_loadBuiltInCover;
    int label;

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.adapter.ShortTVTrendingAdapter$loadBuiltInCover$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.shorttv_pugc.ui.adapter.ShortTVTrendingAdapter$loadBuiltInCover$1$1", m97637f = "ShortTVTrendingAdapter.kt", m97638l = {161}, m97639m = "invokeSuspend")
    static final class C193121 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ Subject $item;
        final /* synthetic */ AppCompatImageView $this_loadBuiltInCover;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C193121(Subject subject, AppCompatImageView appCompatImageView, Continuation<? super C193121> continuation) {
            super(2, continuation);
            this.$item = subject;
            this.$this_loadBuiltInCover = appCompatImageView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C193121 c193121 = new C193121(this.$item, this.$this_loadBuiltInCover, continuation);
            c193121.L$0 = obj;
            return c193121;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C193121) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String url;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC24998b interfaceC24998b = (InterfaceC24998b) this.L$0;
                Cover cover = this.$item.getCover();
                if (cover != null && (url = cover.getUrl()) != null) {
                    InputStream inputStreamOpen = this.$this_loadBuiltInCover.getContext().getAssets().open(url);
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

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.adapter.ShortTVTrendingAdapter$loadBuiltInCover$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.shorttv_pugc.ui.adapter.ShortTVTrendingAdapter$loadBuiltInCover$1$2", m97637f = "ShortTVTrendingAdapter.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C193132 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        int label;

        C193132(Continuation<? super C193132> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            return new C193132(continuation).invokeSuspend(Unit.f75682a);
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

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.adapter.ShortTVTrendingAdapter$loadBuiltInCover$1$a */
    static final class C19314a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AppCompatImageView f61963a;

        C19314a(AppCompatImageView appCompatImageView) {
            this.f61963a = appCompatImageView;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Bitmap bitmap, Continuation continuation) {
            this.f61963a.setImageBitmap(bitmap);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTVTrendingAdapter$loadBuiltInCover$1(Subject subject, AppCompatImageView appCompatImageView, Continuation<? super ShortTVTrendingAdapter$loadBuiltInCover$1> continuation) {
        super(2, continuation);
        this.$item = subject;
        this.$this_loadBuiltInCover = appCompatImageView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTVTrendingAdapter$loadBuiltInCover$1(this.$item, this.$this_loadBuiltInCover, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTVTrendingAdapter$loadBuiltInCover$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C193121(this.$item, this.$this_loadBuiltInCover, null)), C25220y0.m99268b()), new C193132(null));
            C19314a c19314a = new C19314a(this.$this_loadBuiltInCover);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c19314a, this) == objF) {
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
