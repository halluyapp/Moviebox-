package com.transsion.room.sub.viewmodel.likes;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import p685pq.InterfaceC26930a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class UgcLikesViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: i */
    public static final C18265a f59492i = new C18265a(null);

    /* JADX INFO: renamed from: j */
    private static int f59493j = 8;

    /* JADX INFO: renamed from: b */
    private final C3187b0 f59494b;

    /* JADX INFO: renamed from: c */
    private final C3187b0 f59495c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC26930a f59496d;

    /* JADX INFO: renamed from: e */
    private String f59497e;

    /* JADX INFO: renamed from: f */
    private String f59498f;

    /* JADX INFO: renamed from: g */
    private String f59499g;

    /* JADX INFO: renamed from: h */
    private boolean f59500h;

    /* JADX INFO: renamed from: com.transsion.room.sub.viewmodel.likes.UgcLikesViewModel$a */
    public static final class C18265a {
        private C18265a() {
        }

        public /* synthetic */ C18265a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcLikesViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f59494b = new C3187b0();
        this.f59495c = new C3187b0();
        this.f59496d = (InterfaceC26930a) C22982c.f70163e.m91553a().m91552h(InterfaceC26930a.class);
    }

    /* JADX INFO: renamed from: e */
    public final C3187b0 m77336e() {
        return this.f59494b;
    }

    /* JADX INFO: renamed from: f */
    public final C3187b0 m77337f() {
        return this.f59495c;
    }

    /* JADX INFO: renamed from: g */
    public final void m77338g(String page, String userId) {
        Intrinsics.m97802h(page, "page");
        Intrinsics.m97802h(userId, "userId");
        this.f59498f = page;
        this.f59499g = userId;
        C26866a.a.m104898f(C26866a.f81698a, "UgcLikesViewModel", "Likes getUgcVideoLikesBean", false, 4, null);
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new UgcLikesViewModel$getUgcVideoLikesBean$1(page, userId, this, null), 2, null);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m77339h() {
        return this.f59500h;
    }

    /* JADX INFO: renamed from: i */
    public final void m77340i(String str) {
        this.f59500h = false;
        if (str == null || str.length() == 0) {
            C26866a.f81698a.m104921x("UgcLikesViewModel", "loadMore: nextPage is null or empty, cannot load more", true);
            this.f59495c.mo14855n(null);
            return;
        }
        C26866a.f81698a.m104912c("UgcLikesViewModel", "loadMore: load nextPage=" + str, true);
        m77338g(str.toString(), String.valueOf(this.f59499g));
    }

    /* JADX INFO: renamed from: j */
    public final void m77341j(String ugcVideoId, boolean z11) {
        Intrinsics.m97802h(ugcVideoId, "ugcVideoId");
        this.f59497e = ugcVideoId;
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new UgcLikesViewModel$postLikeUgcVideo$1(ugcVideoId, z11, this, null), 2, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m77342k() {
        C26866a.f81698a.m104912c("UgcLikesViewModel", "refresh: reset page to 1 and load first page", true);
        this.f59498f = "1";
        this.f59500h = true;
        m77338g(String.valueOf("1"), String.valueOf(this.f59499g));
    }
}
