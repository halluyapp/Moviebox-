package com.transsion.player.mediasession;

import android.app.Application;
import android.content.ComponentName;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.player.mediasession.MediaBrowserCompatHelper$init$1$2$2", m97637f = "MediaBrowserCompatHelper.kt", m97638l = {}, m97639m = "invokeSuspend")
final class MediaBrowserCompatHelper$init$1$2$2 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<MediaControllerCompat.AbstractC0166e, Unit> $callback;
    final /* synthetic */ Application $it;
    final /* synthetic */ MediaBrowserCompatHelper $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MediaBrowserCompatHelper$init$1$2$2(Function1<? super MediaControllerCompat.AbstractC0166e, Unit> function1, MediaBrowserCompatHelper mediaBrowserCompatHelper, Application application, Continuation<? super MediaBrowserCompatHelper$init$1$2$2> continuation) {
        super(2, continuation);
        this.$callback = function1;
        this.$this_runCatching = mediaBrowserCompatHelper;
        this.$it = application;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaBrowserCompatHelper$init$1$2$2(this.$callback, this.$this_runCatching, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((MediaBrowserCompatHelper$init$1$2$2) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        Function1<MediaControllerCompat.AbstractC0166e, Unit> function1 = this.$callback;
        if (function1 != null) {
            Boxing.m97631a(this.$this_runCatching.f55887f.add(function1));
        }
        this.$this_runCatching.f55885d = new MediaBrowserCompat(this.$it, new ComponentName(this.$it, (Class<?>) MediaService.class), this.$this_runCatching.f55884c, null);
        MediaBrowserCompat mediaBrowserCompat = this.$this_runCatching.f55885d;
        if (mediaBrowserCompat != null) {
            mediaBrowserCompat.m592a();
        }
        return Unit.f75682a;
    }
}
