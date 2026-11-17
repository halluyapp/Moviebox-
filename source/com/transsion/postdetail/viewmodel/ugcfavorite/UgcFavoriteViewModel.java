package com.transsion.postdetail.viewmodel.ugcfavorite;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import p656oq.InterfaceC26382a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class UgcFavoriteViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: h */
    public static final C17532a f57926h = new C17532a(null);

    /* JADX INFO: renamed from: i */
    private static int f57927i = 10;

    /* JADX INFO: renamed from: b */
    private final C3187b0 f57928b;

    /* JADX INFO: renamed from: c */
    private final C3187b0 f57929c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC26382a f57930d;

    /* JADX INFO: renamed from: e */
    private String f57931e;

    /* JADX INFO: renamed from: f */
    private String f57932f;

    /* JADX INFO: renamed from: g */
    private boolean f57933g;

    /* JADX INFO: renamed from: com.transsion.postdetail.viewmodel.ugcfavorite.UgcFavoriteViewModel$a */
    public static final class C17532a {
        private C17532a() {
        }

        public /* synthetic */ C17532a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcFavoriteViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f57928b = new C3187b0();
        this.f57929c = new C3187b0();
        this.f57930d = (InterfaceC26382a) C22982c.f70163e.m91553a().m91552h(InterfaceC26382a.class);
    }

    /* JADX INFO: renamed from: e */
    public final C3187b0 m75146e() {
        return this.f57928b;
    }

    /* JADX INFO: renamed from: f */
    public final void m75147f(String page, String userId) {
        Intrinsics.m97802h(page, "page");
        Intrinsics.m97802h(userId, "userId");
        this.f57931e = page;
        this.f57932f = userId;
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new UgcFavoriteViewModel$getUgcVideoFavoriteList$1(this, page, userId, null), 2, null);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m75148g() {
        return this.f57933g;
    }

    /* JADX INFO: renamed from: h */
    public final void m75149h(String str) {
        this.f57933g = false;
        if (str == null || str.length() == 0) {
            C26866a.f81698a.m104921x("UgcFavoriteViewModel", "loadMore: nextPage is null or empty, cannot load more", true);
            this.f57928b.mo14855n(null);
            return;
        }
        C26866a.f81698a.m104912c("UgcFavoriteViewModel", "loadMore: load nextPage=" + str, true);
        m75147f(str.toString(), String.valueOf(this.f57932f));
    }

    /* JADX INFO: renamed from: i */
    public final void m75150i() {
        C26866a.f81698a.m104912c("UgcFavoriteViewModel", "refresh: reset page to 1 and load first page", true);
        this.f57931e = "1";
        this.f57933g = true;
        m75147f(String.valueOf("1"), String.valueOf(this.f57932f));
    }
}
