package com.transsion.audio.player;

import android.app.Application;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.audio.AudioBean;
import com.transsion.player.orplayer.InterfaceC16634g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import p602mj.InterfaceC25866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.audio.player.AudioPlayer$initPlayer$1$onPrepare$1", m97637f = "AudioPlayer.kt", m97638l = {234}, m97639m = "invokeSuspend")
final class AudioPlayer$initPlayer$1$onPrepare$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AudioPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AudioPlayer$initPlayer$1$onPrepare$1(AudioPlayer audioPlayer, Continuation<? super AudioPlayer$initPlayer$1$onPrepare$1> continuation) {
        super(2, continuation);
        this.this$0 = audioPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioPlayer$initPlayer$1$onPrepare$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((AudioPlayer$initPlayer$1$onPrepare$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC16634g interfaceC16634gM64590v;
        Long readProcess;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            if (this.this$0.m64588t() != null) {
                AppDatabase.Companion companion = AppDatabase.INSTANCE;
                Application applicationM27275a = Utils.m27275a();
                Intrinsics.m97801g(applicationM27275a, "getApp(...)");
                InterfaceC25866a interfaceC25866aMo64867n1 = companion.m64881b(applicationM27275a).mo64867n1();
                AudioBean audioBeanM64588t = this.this$0.m64588t();
                Intrinsics.m97799e(audioBeanM64588t);
                String audioUrl = audioBeanM64588t.getAudioUrl();
                this.label = 1;
                obj = interfaceC25866aMo64867n1.mo101623c(audioUrl, this);
                if (obj == objF) {
                    return objF;
                }
            }
            return Unit.f75682a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        AudioBean audioBean = (AudioBean) obj;
        long jLongValue = (audioBean == null || (readProcess = audioBean.getReadProcess()) == null) ? 0L : readProcess.longValue();
        if ((audioBean == null || audioBean.getStatus() != 6) && jLongValue > 0 && (interfaceC16634gM64590v = this.this$0.m64590v()) != null) {
            interfaceC16634gM64590v.seekTo(jLongValue);
        }
        return Unit.f75682a;
    }
}
