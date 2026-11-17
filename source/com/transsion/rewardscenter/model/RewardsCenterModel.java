package com.transsion.rewardscenter.model;

import android.app.Application;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.cloud.tmc.integration.event.EventConstants;
import com.transsion.payment.lib.C16386f;
import com.transsion.payment.lib.InterfaceC16364b;
import com.transsion.rewardscenter.utils.AbstractC18021p;
import com.transsion.rewardscenter.utils.AbstractC18022q;
import com.transsion.rewardscenterapi.Banner;
import com.transsion.rewardscenterapi.Lottery;
import com.transsion.rewardscenterapi.SkuPoint;
import com.transsion.rewardscenterapi.User;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p349dh.C22982c;
import p952yp.InterfaceC28992a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class RewardsCenterModel extends AbstractC3186b {

    /* JADX INFO: renamed from: b */
    private final Lazy f58637b;

    /* JADX INFO: renamed from: c */
    private final C3187b0 f58638c;

    /* JADX INFO: renamed from: d */
    private final C3187b0 f58639d;

    /* JADX INFO: renamed from: e */
    private final C3187b0 f58640e;

    /* JADX INFO: renamed from: f */
    private final C3187b0 f58641f;

    /* JADX INFO: renamed from: g */
    private final C3187b0 f58642g;

    /* JADX INFO: renamed from: h */
    private final C3187b0 f58643h;

    /* JADX INFO: renamed from: i */
    private final C3187b0 f58644i;

    /* JADX INFO: renamed from: j */
    private String f58645j;

    /* JADX INFO: renamed from: k */
    private final C3187b0 f58646k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsCenterModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f58637b = LazyKt.m97097b(new Function0() { // from class: com.transsion.rewardscenter.model.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RewardsCenterModel.m76105z();
            }
        });
        this.f58638c = new C3187b0();
        this.f58639d = new C3187b0();
        this.f58640e = new C3187b0();
        this.f58641f = new C3187b0();
        this.f58642g = new C3187b0();
        this.f58643h = new C3187b0(Boolean.FALSE);
        this.f58644i = new C3187b0();
        this.f58646k = new C3187b0();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m76102h(RewardsCenterModel rewardsCenterModel, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        rewardsCenterModel.m76111g(str, z11);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m76103j(RewardsCenterModel rewardsCenterModel, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function0 = null;
        }
        rewardsCenterModel.m76112i(function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final InterfaceC28992a m76104s() {
        return (InterfaceC28992a) this.f58637b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final InterfaceC28992a m76105z() {
        return (InterfaceC28992a) C22982c.f70163e.m91553a().m91552h(InterfaceC28992a.class);
    }

    /* JADX INFO: renamed from: A */
    public final void m76106A(String str) {
        this.f58645j = str;
    }

    /* JADX INFO: renamed from: B */
    public final void m76107B(String cc2, String number, String iso) {
        Intrinsics.m97802h(cc2, "cc");
        Intrinsics.m97802h(number, "number");
        Intrinsics.m97802h(iso, "iso");
        String str = this.f58645j;
        if (str == null || str.length() == 0) {
            return;
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RewardsCenterModel$submitAndClaim$1(this, str, cc2, number, iso, null), 3, null);
    }

    /* JADX INFO: renamed from: C */
    public final void m76108C(int i11) {
        User user = (User) this.f58639d.m14847f();
        if (user == null) {
            return;
        }
        this.f58639d.mo14858q(User.copy$default(user, i11, null, null, false, 14, null));
    }

    /* JADX INFO: renamed from: e */
    public final void m76109e(String drawResultId) {
        Intrinsics.m97802h(drawResultId, "drawResultId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RewardsCenterModel$claim$1(drawResultId, this, null), 3, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m76110f(String drawResultId) {
        Intrinsics.m97802h(drawResultId, "drawResultId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RewardsCenterModel$claimVip$1(this, drawResultId, null), 3, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m76111g(String str, boolean z11) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RewardsCenterModel$drawTask$1(this, str, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m76112i(Function0 function0) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RewardsCenterModel$fetchRewardsCenterData$1(function0, this, null), 3, null);
    }

    /* JADX INFO: renamed from: k */
    public final String m76113k() {
        Lottery lottery = (Lottery) this.f58638c.m14847f();
        if (lottery != null) {
            return lottery.getActivityId();
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final SkuPoint m76114l() {
        Banner banner;
        Lottery lottery = (Lottery) this.f58638c.m14847f();
        if (lottery == null || (banner = lottery.getBanner()) == null) {
            return null;
        }
        return banner.getSku();
    }

    /* JADX INFO: renamed from: m */
    public final C3187b0 m76115m() {
        return this.f58644i;
    }

    /* JADX INFO: renamed from: n */
    public final C3187b0 m76116n() {
        return this.f58646k;
    }

    /* JADX INFO: renamed from: o */
    public final C3187b0 m76117o() {
        return this.f58643h;
    }

    /* JADX INFO: renamed from: p */
    public final C3187b0 m76118p() {
        return this.f58638c;
    }

    /* JADX INFO: renamed from: q */
    public final String m76119q() {
        return this.f58645j;
    }

    /* JADX INFO: renamed from: r */
    public final C3187b0 m76120r() {
        return this.f58640e;
    }

    /* JADX INFO: renamed from: t */
    public final C3187b0 m76121t() {
        return this.f58642g;
    }

    /* JADX INFO: renamed from: u */
    public final String m76122u() {
        Banner banner;
        Lottery lottery = (Lottery) this.f58638c.m14847f();
        if (lottery == null || (banner = lottery.getBanner()) == null) {
            return null;
        }
        return banner.getSkuId();
    }

    /* JADX INFO: renamed from: v */
    public final C3187b0 m76123v() {
        return this.f58641f;
    }

    /* JADX INFO: renamed from: w */
    public final User m76124w() {
        return (User) this.f58639d.m14847f();
    }

    /* JADX INFO: renamed from: x */
    public final C3187b0 m76125x() {
        return this.f58639d;
    }

    /* JADX INFO: renamed from: y */
    public final void m76126y(AppCompatActivity activity, String phone, int i11) {
        Intrinsics.m97802h(activity, "activity");
        Intrinsics.m97802h(phone, "phone");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("phone", phone);
        linkedHashMap.put("activity", "lottery");
        linkedHashMap.put(EventConstants.KEY_SOURCE, String.valueOf(i11));
        AbstractC18022q.m76644a("payment", linkedHashMap);
        C16386f c16386fM71513a = C16386f.f55336b.m71513a();
        String strM76122u = m76122u();
        if (strM76122u == null) {
            strM76122u = "";
        }
        c16386fM71513a.m71511e(activity, strM76122u, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? false : false, (8 & 16) != 0 ? null : linkedHashMap, new InterfaceC16364b() { // from class: com.transsion.rewardscenter.model.RewardsCenterModel$payment$1
            @Override // com.transsion.payment.lib.InterfaceC16364b
            /* JADX INFO: renamed from: a */
            public void mo66214a(Integer num, String str, boolean z11, String str2) {
                C26866a.a.m104898f(C26866a.f81698a, "RewardsCenter", "Payment failed " + str + ", " + num, false, 4, null);
                if (str == null) {
                    str = "top-up failed, Please try again.";
                }
                AbstractC18021p.m76643a(false, str);
            }

            @Override // com.transsion.payment.lib.InterfaceC16364b
            /* JADX INFO: renamed from: b */
            public void mo66215b(boolean z11) {
                C26866a.a.m104898f(C26866a.f81698a, "RewardsCenter", "onPendingTransition()", false, 4, null);
            }

            @Override // com.transsion.payment.lib.InterfaceC16364b
            /* JADX INFO: renamed from: c */
            public void mo66216c(int i12, String balance, String str) {
                Intrinsics.m97802h(balance, "balance");
                RewardsCenterModel.m76102h(this.f58647a, str, false, 2, null);
                AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this.f58647a), null, null, new RewardsCenterModel$payment$1$success$1(this.f58647a, null), 3, null);
            }
        });
    }
}
