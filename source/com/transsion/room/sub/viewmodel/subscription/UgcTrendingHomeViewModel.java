package com.transsion.room.sub.viewmodel.subscription;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.transsion.room.sub.fragment.subscription.SubscriptionFragment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import p716qq.InterfaceC27121c;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class UgcTrendingHomeViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: i */
    public static final C18269a f59523i = new C18269a(null);

    /* JADX INFO: renamed from: b */
    private Integer f59524b;

    /* JADX INFO: renamed from: c */
    private Integer f59525c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC27121c f59526d;

    /* JADX INFO: renamed from: e */
    private String f59527e;

    /* JADX INFO: renamed from: f */
    private SubscriptionFragment.TabType f59528f;

    /* JADX INFO: renamed from: g */
    private boolean f59529g;

    /* JADX INFO: renamed from: h */
    private final C3187b0 f59530h;

    /* JADX INFO: renamed from: com.transsion.room.sub.viewmodel.subscription.UgcTrendingHomeViewModel$a */
    public static final class C18269a {
        private C18269a() {
        }

        public /* synthetic */ C18269a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcTrendingHomeViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f59524b = 1;
        this.f59525c = 8;
        this.f59526d = (InterfaceC27121c) C22982c.f70163e.m91553a().m91552h(InterfaceC27121c.class);
        this.f59527e = "";
        this.f59528f = SubscriptionFragment.TabType.HOTTEST;
        this.f59530h = new C3187b0();
    }

    /* JADX INFO: renamed from: e */
    public final void m77362e(Integer num, String str) {
        this.f59527e = str;
        this.f59524b = num;
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new UgcTrendingHomeViewModel$getUgcHomeTrendingData$1(num, this, str, null), 2, null);
    }

    /* JADX INFO: renamed from: f */
    public final C3187b0 m77363f() {
        return this.f59530h;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m77364g() {
        return this.f59529g;
    }

    /* JADX INFO: renamed from: h */
    public final void m77365h(Integer num) {
        this.f59529g = false;
        if (num != null && num.intValue() <= 0) {
            C26866a.f81698a.m104921x("UgcTrendingHomeViewModel", "loadMore: nextPage is null or empty, cannot load more", true);
            this.f59530h.mo14855n(null);
            return;
        }
        C26866a.f81698a.m104912c("UgcTrendingHomeViewModel", "loadMore: load nextPage=" + num, true);
        m77362e(num, this.f59527e);
    }

    /* JADX INFO: renamed from: i */
    public final void m77366i() {
        C26866a.f81698a.m104912c("UgcTrendingHomeViewModel", "refresh: reset page to 1 and load first page", true);
        this.f59524b = 1;
        String apiValue = this.f59528f.getApiValue();
        this.f59527e = apiValue;
        this.f59529g = true;
        m77362e(this.f59524b, apiValue);
    }
}
