package com.transsion.room.sub.viewmodel.subscription;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import p716qq.InterfaceC27119a;

/* JADX INFO: loaded from: classes6.dex */
public final class SubscriptionViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: k */
    public static final C18268a f59513k = new C18268a(null);

    /* JADX INFO: renamed from: b */
    private final C3187b0 f59514b;

    /* JADX INFO: renamed from: c */
    private final C3187b0 f59515c;

    /* JADX INFO: renamed from: d */
    private final C3187b0 f59516d;

    /* JADX INFO: renamed from: e */
    private final C3187b0 f59517e;

    /* JADX INFO: renamed from: f */
    private final C3187b0 f59518f;

    /* JADX INFO: renamed from: g */
    private final C3187b0 f59519g;

    /* JADX INFO: renamed from: h */
    private int f59520h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC27119a f59521i;

    /* JADX INFO: renamed from: j */
    private String f59522j;

    /* JADX INFO: renamed from: com.transsion.room.sub.viewmodel.subscription.SubscriptionViewModel$a */
    public static final class C18268a {
        private C18268a() {
        }

        public /* synthetic */ C18268a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f59514b = new C3187b0();
        this.f59515c = new C3187b0();
        this.f59516d = new C3187b0();
        this.f59517e = new C3187b0();
        this.f59518f = new C3187b0();
        this.f59519g = new C3187b0();
        this.f59520h = 1;
        this.f59521i = (InterfaceC27119a) C22982c.f70163e.m91553a().m91552h(InterfaceC27119a.class);
    }

    /* JADX INFO: renamed from: d */
    public final C3187b0 m77358d() {
        return this.f59514b;
    }

    /* JADX INFO: renamed from: e */
    public final void m77359e(String uid) {
        Intrinsics.m97802h(uid, "uid");
        this.f59522j = uid;
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new SubscriptionViewModel$getSubscriptionStatsData$1(this, uid, null), 2, null);
    }
}
