package com.transsion.usercenter.profile.viewmodel;

import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.therouter.TheRouter;
import com.transsion.usercenter.profile.InterfaceC20647b;
import com.transsion.usercenter.profile.InterfaceC20650c;
import com.transsnet.loginapi.bean.UserInfo;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import p349dh.C22982c;
import p441gz.InterfaceC23704a;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
public final class UserProfileViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: l */
    public static final C20767a f65378l = new C20767a(null);

    /* JADX INFO: renamed from: a */
    private final Lazy f65379a = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.profile.viewmodel.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UserProfileViewModel.m85567r();
        }
    });

    /* JADX INFO: renamed from: b */
    private final Lazy f65380b = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.profile.viewmodel.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UserProfileViewModel.m85569t();
        }
    });

    /* JADX INFO: renamed from: c */
    private final Lazy f65381c = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.profile.viewmodel.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UserProfileViewModel.m85568s();
        }
    });

    /* JADX INFO: renamed from: d */
    private final C3187b0 f65382d;

    /* JADX INFO: renamed from: e */
    private final LiveData f65383e;

    /* JADX INFO: renamed from: f */
    private final C3187b0 f65384f;

    /* JADX INFO: renamed from: g */
    private final LiveData f65385g;

    /* JADX INFO: renamed from: h */
    private final C3187b0 f65386h;

    /* JADX INFO: renamed from: i */
    private final LiveData f65387i;

    /* JADX INFO: renamed from: j */
    private final C3187b0 f65388j;

    /* JADX INFO: renamed from: k */
    private final LiveData f65389k;

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.viewmodel.UserProfileViewModel$a */
    public static final class C20767a {
        private C20767a() {
        }

        public /* synthetic */ C20767a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UserProfileViewModel() {
        C3187b0 c3187b0 = new C3187b0();
        this.f65382d = c3187b0;
        this.f65383e = c3187b0;
        C3187b0 c3187b1 = new C3187b0(Boolean.FALSE);
        this.f65384f = c3187b1;
        this.f65385g = c3187b1;
        C3187b0 c3187b2 = new C3187b0();
        this.f65386h = c3187b2;
        this.f65387i = c3187b2;
        C3187b0 c3187b3 = new C3187b0();
        this.f65388j = c3187b3;
        this.f65389k = c3187b3;
    }

    /* JADX INFO: renamed from: k */
    private final InterfaceC23704a m85564k() {
        return (InterfaceC23704a) this.f65379a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC20647b m85565l() {
        return (InterfaceC20647b) this.f65381c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final InterfaceC20650c m85566m() {
        return (InterfaceC20650c) this.f65380b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final InterfaceC23704a m85567r() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final InterfaceC20647b m85568s() {
        return (InterfaceC20647b) C22982c.f70163e.m91553a().m91552h(InterfaceC20647b.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final InterfaceC20650c m85569t() {
        return (InterfaceC20650c) C22982c.f70163e.m91553a().m91552h(InterfaceC20650c.class);
    }

    /* JADX INFO: renamed from: i */
    public final void m85570i(String targetUID) {
        Intrinsics.m97802h(targetUID, "targetUID");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new UserProfileViewModel$fetchSubscriptionStatus$1(this, targetUID, null), 3, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m85571j(String str) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new UserProfileViewModel$fetchUserProfileV3$1(this, str, null), 3, null);
    }

    /* JADX INFO: renamed from: n */
    public final LiveData m85572n() {
        return this.f65387i;
    }

    /* JADX INFO: renamed from: o */
    public final LiveData m85573o() {
        return this.f65389k;
    }

    /* JADX INFO: renamed from: p */
    public final void m85574p(String str) {
        UserInfo userInfoMo90386h;
        String userId;
        this.f65382d.mo14858q(str);
        InterfaceC23704a interfaceC23704aM85564k = m85564k();
        String string = (interfaceC23704aM85564k == null || (userInfoMo90386h = interfaceC23704aM85564k.mo90386h()) == null || (userId = userInfoMo90386h.getUserId()) == null) ? null : userId.toString();
        boolean z11 = str == null || StringsKt.m98160q0(str) || Intrinsics.m97797c(str, string);
        C26866a.f81698a.m104912c("UserProfileVM", "initProfile target=" + str + ", current=" + string + ", isSelf=" + z11, false);
        this.f65384f.mo14858q(Boolean.valueOf(z11));
        m85571j(str);
        if (z11 || str == null || StringsKt.m98160q0(str)) {
            this.f65386h.mo14858q(null);
        } else {
            m85570i(str);
        }
    }

    /* JADX INFO: renamed from: q */
    public final LiveData m85575q() {
        return this.f65385g;
    }

    /* JADX INFO: renamed from: u */
    public final void m85576u(String targetUID, boolean z11) {
        Intrinsics.m97802h(targetUID, "targetUID");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new UserProfileViewModel$toggleSubscription$1(targetUID, z11, this, null), 3, null);
    }
}
