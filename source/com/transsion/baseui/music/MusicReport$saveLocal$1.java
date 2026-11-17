package com.transsion.baseui.music;

import android.text.TextUtils;
import com.blankj.utilcode.util.AbstractC5796o;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.player.mediasession.C16625i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.baseui.music.MusicReport$saveLocal$1", m97637f = "MusicReport.kt", m97638l = {}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class MusicReport$saveLocal$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C14553n $musicPlayDurationBean;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MusicReport$saveLocal$1(C14553n c14553n, Continuation<? super MusicReport$saveLocal$1> continuation) {
        super(2, continuation);
        this.$musicPlayDurationBean = c14553n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MusicReport$saveLocal$1(this.$musicPlayDurationBean, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((MusicReport$saveLocal$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        C14553n c14553n = this.$musicPlayDurationBean;
        try {
            Result.Companion companion = Result.INSTANCE;
            List<C14553n> listM65626b = MusicReport.f51069a.m65626b();
            for (C14553n c14553n2 : listM65626b) {
                if (TextUtils.equals(c14553n2.m65632d(), c14553n.m65632d())) {
                    c14553n2.m65641m(c14553n2.m65631c() + c14553n.m65631c());
                    c14553n2.m65640l(c14553n2.m65630b() + c14553n.m65630b());
                    c14553n2.m65643o(c14553n2.m65634f() + c14553n.m65634f());
                }
            }
            if (listM65626b.isEmpty()) {
                listM65626b.add(c14553n);
            }
            C14496b.f50966a.m65344b().putString("music_play_duration", AbstractC5796o.m27447j(listM65626b));
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C16625i.f55907a.m72390b("MusicReport --> saveLocal() --> it = " + thM112710exceptionOrNullimpl);
        }
        return Unit.f75682a;
    }
}
