package com.transsion.shorttv.base.activity;

import android.view.MotionEvent;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p429g4.InterfaceC23498a;
import p717qr.C27124c;
import p848vs.InterfaceC28219j;
import ws.InterfaceC28435a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000b8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m97100d2 = {"Lcom/transsion/shorttv/base/activity/BaseMusicFloatActivity;", "Lg4/a;", "T", "Lcom/transsion/shorttv/base/activity/BaseCommonActivity;", "<init>", "()V", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lvs/j;", "c", "Lkotlin/Lazy;", "P", "()Lvs/j;", "shortMusicAudioProvider", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public abstract class BaseMusicFloatActivity<T extends InterfaceC23498a> extends BaseCommonActivity<T> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy shortMusicAudioProvider = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.base.activity.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseMusicFloatActivity.m78982Q();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final InterfaceC28219j m78982Q() {
        InterfaceC28435a interfaceC28435aM105541c = C27124c.f82233a.m105541c();
        if (interfaceC28435aM105541c != null) {
            return interfaceC28435aM105541c.mo73695g();
        }
        return null;
    }

    /* JADX INFO: renamed from: P */
    protected final InterfaceC28219j m78983P() {
        return (InterfaceC28219j) this.shortMusicAudioProvider.getValue();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent ev2) {
        InterfaceC28219j interfaceC28219jM78983P;
        Integer numValueOf = ev2 != null ? Integer.valueOf(ev2.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0 && (interfaceC28219jM78983P = m78983P()) != null) {
            interfaceC28219jM78983P.mo73714c(this, ev2);
        }
        return super.dispatchTouchEvent(ev2);
    }
}
