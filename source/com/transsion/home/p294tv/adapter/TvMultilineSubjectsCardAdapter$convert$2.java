package com.transsion.home.p294tv.adapter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.transsion.home.bean.BannerData;
import com.transsion.moviedetailapi.bean.Image;
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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.tv.adapter.TvMultilineSubjectsCardAdapter$convert$2", m97637f = "TvMultilineSubjectsCardAdapter.kt", m97638l = {Sdk$SDKMetric.SDKMetricType.AD_VISIBILITY_VALUE}, m97639m = "invokeSuspend")
final class TvMultilineSubjectsCardAdapter$convert$2 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ImageView $imageView;
    final /* synthetic */ BannerData $item;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TvMultilineSubjectsCardAdapter$convert$2(BannerData bannerData, ImageView imageView, Continuation<? super TvMultilineSubjectsCardAdapter$convert$2> continuation) {
        super(2, continuation);
        this.$item = bannerData;
        this.$imageView = imageView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TvMultilineSubjectsCardAdapter$convert$2(this.$item, this.$imageView, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((TvMultilineSubjectsCardAdapter$convert$2) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String url;
        AssetManager assets;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            Image image = this.$item.getImage();
            if (image != null && (url = image.getUrl()) != null) {
                ImageView imageView = this.$imageView;
                Context context = imageView.getContext();
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream((context == null || (assets = context.getAssets()) == null) ? null : assets.open(url));
                AbstractC24917a2 abstractC24917a2M99269c = C25220y0.m99269c();
                TvMultilineSubjectsCardAdapter$convert$2$1$1 tvMultilineSubjectsCardAdapter$convert$2$1$1 = new TvMultilineSubjectsCardAdapter$convert$2$1$1(imageView, bitmapDecodeStream, null);
                this.label = 1;
                if (AbstractC25088i.m98910g(abstractC24917a2M99269c, tvMultilineSubjectsCardAdapter$convert$2$1$1, this) == objF) {
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
