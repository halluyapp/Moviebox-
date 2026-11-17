package com.transsion.rewardscenter;

import android.content.Context;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3197g0;
import androidx.p1004lifecycle.LiveData;
import com.transsion.rewardscenter.task.p308ad.C17899g0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.InterfaceC25149n0;
import p329cq.InterfaceC22763a;
import p349dh.C22982c;
import p952yp.InterfaceC28992a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class RewardsCenterProvider implements InterfaceC22763a {

    /* JADX INFO: renamed from: a */
    private final Lazy f58631a = LazyKt.m97097b(new Function0() { // from class: com.transsion.rewardscenter.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RewardsCenterProvider.m76080g();
        }
    });

    /* JADX INFO: renamed from: b */
    private final C3187b0 f58632b = new C3187b0(0);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC28992a m76080g() {
        return (InterfaceC28992a) C22982c.f70163e.m91553a().m91552h(InterfaceC28992a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final InterfaceC28992a m76081h() {
        return (InterfaceC28992a) this.f58631a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final Unit m76082i(C17899g0 c17899g0) {
        c17899g0.m76214r();
        return Unit.f75682a;
    }

    @Override // p329cq.InterfaceC22763a
    /* JADX INFO: renamed from: a */
    public void mo76083a(Context context, InterfaceC25149n0 interfaceC25149n0) {
        Intrinsics.m97802h(context, "context");
        C26866a.a.m104898f(C26866a.f81698a, "RewardsCenter", "preloadTaskAd", false, 4, null);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.m97801g(applicationContext, "getApplicationContext(...)");
        final C17899g0 c17899g0 = new C17899g0(applicationContext, interfaceC25149n0);
        c17899g0.m76202f(new Function0() { // from class: com.transsion.rewardscenter.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RewardsCenterProvider.m76082i(c17899g0);
            }
        });
    }

    @Override // p329cq.InterfaceC22763a
    /* JADX INFO: renamed from: b */
    public LiveData mo76084b() {
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(C3197g0.f10010i.m14915a()), null, null, new RewardsCenterProvider$fetchUnclaimRewardCount$1(this, null), 3, null);
        return this.f58632b;
    }
}
