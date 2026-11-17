package com.transsion.room.fragment;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.google.android.material.imageview.ShapeableImageView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gq.C23652n;
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
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC24995a;
import kotlinx.coroutines.flow.InterfaceC24998b;
import ng.AbstractC26006c;
import p576lg.C25634b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.room.fragment.RoomDetailFragment$showCover$2$onResourceReady$1", m97637f = "RoomDetailFragment.kt", m97638l = {599}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class RoomDetailFragment$showCover$2$onResourceReady$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bitmap $resource;
    int label;
    final /* synthetic */ RoomDetailFragment this$0;

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomDetailFragment$showCover$2$onResourceReady$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Landroid/graphics/Bitmap;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.room.fragment.RoomDetailFragment$showCover$2$onResourceReady$1$1", m97637f = "RoomDetailFragment.kt", m97638l = {594}, m97639m = "invokeSuspend")
    static final class C180551 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $resource;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C180551(Bitmap bitmap, Continuation<? super C180551> continuation) {
            super(2, continuation);
            this.$resource = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C180551 c180551 = new C180551(this.$resource, continuation);
            c180551.L$0 = obj;
            return c180551;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C180551) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC24998b interfaceC24998b = (InterfaceC24998b) this.L$0;
                Bitmap bitmap = this.$resource;
                this.label = 1;
                if (interfaceC24998b.emit(bitmap, this) == objF) {
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

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomDetailFragment$showCover$2$onResourceReady$1$3 */
    @Metadata(m97099d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.room.fragment.RoomDetailFragment$showCover$2$onResourceReady$1$3", m97637f = "RoomDetailFragment.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C180563 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        int label;

        C180563(Continuation<? super C180563> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            return new C180563(continuation).invokeSuspend(Unit.f75682a);
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

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomDetailFragment$showCover$2$onResourceReady$1$a */
    static final class C18057a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ RoomDetailFragment f59125a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Bitmap f59126b;

        C18057a(RoomDetailFragment roomDetailFragment, Bitmap bitmap) {
            this.f59125a = roomDetailFragment;
            this.f59126b = bitmap;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Bitmap bitmap, Continuation continuation) {
            ShapeableImageView shapeableImageView;
            ShapeableImageView shapeableImageView2;
            ShapeableImageView shapeableImageView3;
            if (!this.f59125a.isAdded() || this.f59125a.isRemoving() || this.f59125a.isDetached()) {
                return Unit.f75682a;
            }
            C23652n mViewBinding = this.f59125a.getMViewBinding();
            if (mViewBinding != null) {
                mViewBinding.f72245d.setBackground(new BitmapDrawable(this.f59125a.getResources(), bitmap));
                ViewGroup.LayoutParams layoutParams = mViewBinding.f72244c.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = mViewBinding.f72245d.getMeasuredHeight();
                }
                mViewBinding.f72244c.setLayoutParams(layoutParams);
            }
            if (this.f59126b.getHeight() < AbstractC5776a0.m27313a(56.0f)) {
                C23652n mViewBinding2 = this.f59125a.getMViewBinding();
                if (mViewBinding2 != null && (shapeableImageView3 = mViewBinding2.f72250i) != null) {
                    shapeableImageView3.setImageBitmap(bitmap);
                }
                C23652n mViewBinding3 = this.f59125a.getMViewBinding();
                if (mViewBinding3 != null && (shapeableImageView2 = mViewBinding3.f72250i) != null) {
                    AbstractC26006c.m102058k(shapeableImageView2);
                }
            } else {
                C23652n mViewBinding4 = this.f59125a.getMViewBinding();
                if (mViewBinding4 != null && (shapeableImageView = mViewBinding4.f72250i) != null) {
                    AbstractC26006c.m102054g(shapeableImageView);
                }
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoomDetailFragment$showCover$2$onResourceReady$1(Bitmap bitmap, RoomDetailFragment roomDetailFragment, Continuation<? super RoomDetailFragment$showCover$2$onResourceReady$1> continuation) {
        super(2, continuation);
        this.$resource = bitmap;
        this.this$0 = roomDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RoomDetailFragment$showCover$2$onResourceReady$1(this.$resource, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((RoomDetailFragment$showCover$2$onResourceReady$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            final InterfaceC24995a interfaceC24995aM98799r = AbstractC25001c.m98799r(new C180551(this.$resource, null));
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(new InterfaceC24995a() { // from class: com.transsion.room.fragment.RoomDetailFragment$showCover$2$onResourceReady$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: com.transsion.room.fragment.RoomDetailFragment$showCover$2$onResourceReady$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2 implements InterfaceC24998b {

                    /* JADX INFO: renamed from: a */
                    final /* synthetic */ InterfaceC24998b f59128a;

                    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomDetailFragment$showCover$2$onResourceReady$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
                    @DebugMetadata(m97636c = "com.transsion.room.fragment.RoomDetailFragment$showCover$2$onResourceReady$1$invokeSuspend$$inlined$map$1$2", m97637f = "RoomDetailFragment.kt", m97638l = {50}, m97639m = "emit")
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
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC24998b interfaceC24998b) {
                        this.f59128a = interfaceC24998b;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.InterfaceC24998b
                    public final Object emit(Object obj, Continuation continuation) throws Throwable {
                        AnonymousClass1 anonymousClass1;
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
                        if (i12 == 0) {
                            ResultKt.m97107b(obj2);
                            InterfaceC24998b interfaceC24998b = this.f59128a;
                            Bitmap bitmapM100899a = C25634b.m100899a((Bitmap) obj, 50, false);
                            anonymousClass1.label = 1;
                            if (interfaceC24998b.emit(bitmapM100899a, anonymousClass1) == objF) {
                                return objF;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.m97107b(obj2);
                        }
                        return Unit.f75682a;
                    }
                }

                @Override // kotlinx.coroutines.flow.InterfaceC24995a
                /* JADX INFO: renamed from: a */
                public Object mo12985a(InterfaceC24998b interfaceC24998b, Continuation continuation) {
                    Object objMo12985a = interfaceC24995aM98799r.mo12985a(new AnonymousClass2(interfaceC24998b), continuation);
                    return objMo12985a == IntrinsicsKt.m97630f() ? objMo12985a : Unit.f75682a;
                }
            }, C25220y0.m99267a()), new C180563(null));
            C18057a c18057a = new C18057a(this.this$0, this.$resource);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c18057a, this) == objF) {
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
