package com.transsion.usercenter.profile.viewmodel;

import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.therouter.TheRouter;
import com.transsnet.loginapi.bean.UserInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import p349dh.C22982c;
import p441gz.InterfaceC23704a;
import p851vw.InterfaceC28231c;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
public final class UserProfileVideoViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: o */
    public static final C20766a f65363o = new C20766a(null);

    /* JADX INFO: renamed from: a */
    private final Lazy f65364a;

    /* JADX INFO: renamed from: b */
    private final Lazy f65365b;

    /* JADX INFO: renamed from: c */
    private String f65366c;

    /* JADX INFO: renamed from: d */
    private String f65367d;

    /* JADX INFO: renamed from: e */
    private int f65368e;

    /* JADX INFO: renamed from: f */
    private boolean f65369f;

    /* JADX INFO: renamed from: g */
    private final List f65370g;

    /* JADX INFO: renamed from: h */
    private final C3187b0 f65371h;

    /* JADX INFO: renamed from: i */
    private final LiveData f65372i;

    /* JADX INFO: renamed from: j */
    private boolean f65373j;

    /* JADX INFO: renamed from: k */
    private final C3187b0 f65374k;

    /* JADX INFO: renamed from: l */
    private final LiveData f65375l;

    /* JADX INFO: renamed from: m */
    private final C3187b0 f65376m;

    /* JADX INFO: renamed from: n */
    private final LiveData f65377n;

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.viewmodel.UserProfileVideoViewModel$a */
    public static final class C20766a {
        private C20766a() {
        }

        public /* synthetic */ C20766a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UserProfileVideoViewModel() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f65364a = LazyKt.m97096a(lazyThreadSafetyMode, new Function0() { // from class: com.transsion.usercenter.profile.viewmodel.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserProfileVideoViewModel.m85546n();
            }
        });
        this.f65365b = LazyKt.m97096a(lazyThreadSafetyMode, new Function0() { // from class: com.transsion.usercenter.profile.viewmodel.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserProfileVideoViewModel.m85549v();
            }
        });
        this.f65367d = "";
        this.f65368e = 12;
        this.f65369f = true;
        this.f65370g = new ArrayList();
        C3187b0 c3187b0 = new C3187b0(Boolean.FALSE);
        this.f65371h = c3187b0;
        this.f65372i = c3187b0;
        C3187b0 c3187b1 = new C3187b0();
        this.f65374k = c3187b1;
        this.f65375l = c3187b1;
        C3187b0 c3187b2 = new C3187b0(null);
        this.f65376m = c3187b2;
        this.f65377n = c3187b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC28231c m85546n() {
        return (InterfaceC28231c) C22982c.f70163e.m91553a().m91552h(InterfaceC28231c.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC28231c m85547o() {
        return (InterfaceC28231c) this.f65364a.getValue();
    }

    /* JADX INFO: renamed from: r */
    private final InterfaceC23704a m85548r() {
        return (InterfaceC23704a) this.f65365b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final InterfaceC23704a m85549v() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: renamed from: x */
    private final void m85550x(boolean z11) {
        String str;
        UserInfo userInfoMo90386h;
        String userId;
        UserInfo userInfoMo90386h2;
        String userId2;
        if (z11) {
            this.f65371h.mo14858q(Boolean.TRUE);
        } else {
            this.f65373j = true;
        }
        String string = this.f65366c;
        String string2 = null;
        if (string != null) {
            str = string;
        } else {
            InterfaceC23704a interfaceC23704aM85548r = m85548r();
            if (interfaceC23704aM85548r == null || (userInfoMo90386h2 = interfaceC23704aM85548r.mo90386h()) == null || (userId2 = userInfoMo90386h2.getUserId()) == null) {
                str = null;
            } else {
                string = userId2.toString();
                str = string;
            }
        }
        String str2 = z11 ? "" : this.f65367d;
        InterfaceC23704a interfaceC23704aM85548r2 = m85548r();
        if (interfaceC23704aM85548r2 != null && (userInfoMo90386h = interfaceC23704aM85548r2.mo90386h()) != null && (userId = userInfoMo90386h.getUserId()) != null) {
            string2 = userId.toString();
        }
        String str3 = this.f65366c;
        boolean z12 = (str3 == null || StringsKt.m98160q0(str3) || !Intrinsics.m97797c(this.f65366c, string2)) ? false : true;
        C26866a.f81698a.m104912c("UserProfileVideoVM", "requestPage isRefresh=" + z11 + ", isSelf=" + z12 + ", target=" + this.f65366c + ", current=" + string2, false);
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new UserProfileVideoViewModel$requestPage$1(this, z11, z12, str2, str, null), 3, null);
    }

    /* JADX INFO: renamed from: p */
    public final LiveData m85551p() {
        return this.f65377n;
    }

    /* JADX INFO: renamed from: q */
    public final LiveData m85552q() {
        return this.f65375l;
    }

    /* JADX INFO: renamed from: s */
    public final LiveData m85553s() {
        return this.f65372i;
    }

    /* JADX INFO: renamed from: t */
    public final void m85554t(String str) {
        this.f65366c = str;
    }

    /* JADX INFO: renamed from: u */
    public final void m85555u() {
        if (!this.f65369f || Intrinsics.m97797c(this.f65371h.m14847f(), Boolean.TRUE) || this.f65373j) {
            return;
        }
        C26866a.f81698a.m104912c("UserProfileVideoVM", "loadMore start nextPage=" + this.f65367d, false);
        m85550x(false);
    }

    /* JADX INFO: renamed from: w */
    public final void m85556w() {
        if (Intrinsics.m97797c(this.f65371h.m14847f(), Boolean.TRUE) || this.f65373j) {
            return;
        }
        C26866a.f81698a.m104912c("UserProfileVideoVM", "refresh start userId=" + this.f65366c, false);
        this.f65367d = "";
        this.f65369f = true;
        this.f65370g.clear();
        m85550x(true);
    }
}
