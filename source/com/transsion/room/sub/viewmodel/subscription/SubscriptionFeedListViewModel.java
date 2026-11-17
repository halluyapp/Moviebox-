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
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class SubscriptionFeedListViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: f */
    public static final C18267a f59507f = new C18267a(null);

    /* JADX INFO: renamed from: g */
    private static int f59508g = 8;

    /* JADX INFO: renamed from: b */
    private String f59509b;

    /* JADX INFO: renamed from: c */
    private boolean f59510c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC27119a f59511d;

    /* JADX INFO: renamed from: e */
    private final C3187b0 f59512e;

    /* JADX INFO: renamed from: com.transsion.room.sub.viewmodel.subscription.SubscriptionFeedListViewModel$a */
    public static final class C18267a {
        private C18267a() {
        }

        public /* synthetic */ C18267a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionFeedListViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f59511d = (InterfaceC27119a) C22982c.f70163e.m91553a().m91552h(InterfaceC27119a.class);
        this.f59512e = new C3187b0();
    }

    /* JADX INFO: renamed from: e */
    public final C3187b0 m77352e() {
        return this.f59512e;
    }

    /* JADX INFO: renamed from: f */
    public final void m77353f(String str) {
        this.f59509b = str;
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new SubscriptionFeedListViewModel$getSubscriptionFeedData$1(this, str, null), 2, null);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m77354g() {
        return this.f59510c;
    }

    /* JADX INFO: renamed from: h */
    public final void m77355h(String str) {
        this.f59510c = false;
        if (str == null || str.length() == 0) {
            C26866a.f81698a.m104921x("SubscriptionFeedListViewModel", "loadMore: nextCursor is null or empty, cannot load more", true);
            this.f59512e.mo14855n(null);
            return;
        }
        C26866a.f81698a.m104912c("SubscriptionFeedListViewModel", "loadMore: load nextCursor=" + str, true);
        m77353f(str);
    }

    /* JADX INFO: renamed from: i */
    public final void m77356i() {
        C26866a.f81698a.m104912c("SubscriptionFeedListViewModel", "refresh: reset page to 1 and load first page", true);
        this.f59510c = true;
        m77353f("");
    }
}
