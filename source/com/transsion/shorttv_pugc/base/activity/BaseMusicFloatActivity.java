package com.transsion.shorttv_pugc.base.activity;

import android.view.MotionEvent;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p357dt.C23049a;
import p429g4.InterfaceC23498a;
import p920xt.InterfaceC28662g;
import yt.InterfaceC29008a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000b8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/base/activity/BaseMusicFloatActivity;", "Lg4/a;", "T", "Lcom/transsion/shorttv_pugc/base/activity/BaseCommonActivity;", "<init>", "()V", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lxt/g;", "c", "Lkotlin/Lazy;", "P", "()Lxt/g;", "shortMusicAudioProvider", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public abstract class BaseMusicFloatActivity<T extends InterfaceC23498a> extends BaseCommonActivity<T> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy shortMusicAudioProvider = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.base.activity.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseMusicFloatActivity.m80426Q();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final InterfaceC28662g m80426Q() {
        InterfaceC29008a interfaceC29008aM91696b = C23049a.f70283a.m91696b();
        if (interfaceC29008aM91696b != null) {
            return interfaceC29008aM91696b.mo73660g();
        }
        return null;
    }

    /* JADX INFO: renamed from: P */
    protected final InterfaceC28662g m80427P() {
        return (InterfaceC28662g) this.shortMusicAudioProvider.getValue();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent ev2) {
        InterfaceC28662g interfaceC28662gM80427P;
        Integer numValueOf = ev2 != null ? Integer.valueOf(ev2.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0 && (interfaceC28662gM80427P = m80427P()) != null) {
            interfaceC28662gM80427P.mo73812c(this, ev2);
        }
        return super.dispatchTouchEvent(ev2);
    }
}
