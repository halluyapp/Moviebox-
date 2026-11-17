package com.transsion.postdetail.p306ui.adapter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.material.imageview.ShapeableImageView;
import com.transsion.moviedetailapi.bean.Image;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.ui.adapter.RoomPostContentImageAdapter$convert$1$1", m97637f = "RoomPostContentImageAdapter.kt", m97638l = {59}, m97639m = "invokeSuspend")
final class RoomPostContentImageAdapter$convert$1$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Image $item;
    final /* synthetic */ ShapeableImageView $ivCover;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoomPostContentImageAdapter$convert$1$1(Image image, ShapeableImageView shapeableImageView, Continuation<? super RoomPostContentImageAdapter$convert$1$1> continuation) {
        super(2, continuation);
        this.$item = image;
        this.$ivCover = shapeableImageView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RoomPostContentImageAdapter$convert$1$1(this.$item, this.$ivCover, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((RoomPostContentImageAdapter$convert$1$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AssetManager assets;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            String url = this.$item.getUrl();
            if (url != null) {
                ShapeableImageView shapeableImageView = this.$ivCover;
                Context context = shapeableImageView.getContext();
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream((context == null || (assets = context.getAssets()) == null) ? null : assets.open(url));
                AbstractC24917a2 abstractC24917a2M99269c = C25220y0.m99269c();
                RoomPostContentImageAdapter$convert$1$1$1$1 roomPostContentImageAdapter$convert$1$1$1$1 = new RoomPostContentImageAdapter$convert$1$1$1$1(shapeableImageView, bitmapDecodeStream, null);
                this.label = 1;
                if (AbstractC25088i.m98910g(abstractC24917a2M99269c, roomPostContentImageAdapter$convert$1$1$1$1, this) == objF) {
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
