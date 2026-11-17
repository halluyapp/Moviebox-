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
import p716qq.InterfaceC27120b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class SubFollowingsViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: g */
    public static final C18266a f59501g = new C18266a(null);

    /* JADX INFO: renamed from: b */
    private String f59502b;

    /* JADX INFO: renamed from: c */
    private int f59503c;

    /* JADX INFO: renamed from: d */
    private boolean f59504d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC27120b f59505e;

    /* JADX INFO: renamed from: f */
    private final C3187b0 f59506f;

    /* JADX INFO: renamed from: com.transsion.room.sub.viewmodel.subscription.SubFollowingsViewModel$a */
    public static final class C18266a {
        private C18266a() {
        }

        public /* synthetic */ C18266a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubFollowingsViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f59503c = 8;
        this.f59505e = (InterfaceC27120b) C22982c.f70163e.m91553a().m91552h(InterfaceC27120b.class);
        this.f59506f = new C3187b0();
    }

    /* JADX INFO: renamed from: e */
    public final C3187b0 m77345e() {
        return this.f59506f;
    }

    /* JADX INFO: renamed from: f */
    public final void m77346f(String str) {
        this.f59502b = str;
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new SubFollowingsViewModel$getSubscriptionFollowingsData$1(this, str, null), 2, null);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m77347g() {
        return this.f59504d;
    }

    /* JADX INFO: renamed from: h */
    public final void m77348h(String str) {
        this.f59504d = false;
        if (str == null || str.length() == 0) {
            C26866a.f81698a.m104921x("SubFollowingsViewModel", "loadMore: nextPage is null or empty, cannot load more", true);
            this.f59506f.mo14855n(null);
            return;
        }
        C26866a.f81698a.m104912c("SubFollowingsViewModel", "loadMore: load nextCursor=" + str, true);
        m77346f(str);
    }

    /* JADX INFO: renamed from: i */
    public final void m77349i() {
        C26866a.f81698a.m104912c("SubFollowingsViewModel", "refresh: reset page to 1 and load first page", true);
        this.f59502b = "";
        this.f59504d = true;
        m77346f("");
    }
}
