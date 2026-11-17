package com.transsion.player.mediasession;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import no.C26053g0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m97100d2 = {"Lcom/transsion/player/mediasession/MusicIntentReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "", "a", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "LibPlayer_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class MusicIntentReceiver extends BroadcastReceiver {
    /* JADX INFO: renamed from: a */
    private final String m72364a() {
        String simpleName = MusicIntentReceiver.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Object objM112707constructorimpl;
        Unit unit;
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(intent, "intent");
        try {
            Result.Companion companion = Result.INSTANCE;
            String action = intent.getAction();
            if (action != null && action.hashCode() == 1997055314 && action.equals("android.intent.action.MEDIA_BUTTON")) {
                Bundle extras = intent.getExtras();
                unit = null;
                Object obj = extras != null ? extras.get("android.intent.extra.KEY_EVENT") : null;
                KeyEvent keyEvent = obj instanceof KeyEvent ? (KeyEvent) obj : null;
                if (keyEvent != null) {
                    C16625i.f55907a.m72389a(m72364a() + " --> onReceive --> 接收到通知点击事件, = " + keyEvent + ", " + keyEvent.getKeyCode());
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 126) {
                        InterfaceC16634g interfaceC16634gM102142h = C26053g0.f79567a.m102142h();
                        if (interfaceC16634gM102142h != null) {
                            interfaceC16634gM102142h.play();
                            unit = Unit.f75682a;
                        }
                    } else if (keyCode != 127) {
                        switch (keyCode) {
                            case 86:
                                InterfaceC16634g interfaceC16634gM102142h2 = C26053g0.f79567a.m102142h();
                                if (interfaceC16634gM102142h2 != null) {
                                    interfaceC16634gM102142h2.stop();
                                    unit = Unit.f75682a;
                                }
                                break;
                            case 87:
                                MediaBrowserCompatHelper.f55880h.m72359a().m72357x();
                                unit = Unit.f75682a;
                                break;
                            case 88:
                                MediaBrowserCompatHelper.f55880h.m72359a().m72358z();
                                unit = Unit.f75682a;
                                break;
                            default:
                                unit = Unit.f75682a;
                                break;
                        }
                    } else {
                        InterfaceC16634g interfaceC16634gM102142h3 = C26053g0.f79567a.m102142h();
                        if (interfaceC16634gM102142h3 != null) {
                            interfaceC16634gM102142h3.pause();
                            unit = Unit.f75682a;
                        }
                    }
                }
            } else {
                unit = Unit.f75682a;
            }
            objM112707constructorimpl = Result.m112707constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl == null) {
            return;
        }
        C16625i.f55907a.m72389a(m72364a() + " --> onReceive --> 接收到通知点击事件 --- it = " + thM112710exceptionOrNullimpl);
    }
}
