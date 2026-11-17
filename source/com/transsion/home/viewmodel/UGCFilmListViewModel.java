package com.transsion.home.viewmodel;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.transsion.moviedetailapi.bean.Pager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import pg.C26866a;
import sl.InterfaceC27628b;

/* JADX INFO: loaded from: classes5.dex */
public final class UGCFilmListViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: j */
    public static final C15545a f53692j = new C15545a(null);

    /* JADX INFO: renamed from: k */
    public static final int f53693k = 8;

    /* JADX INFO: renamed from: b */
    private final InterfaceC27628b f53694b;

    /* JADX INFO: renamed from: c */
    private String f53695c;

    /* JADX INFO: renamed from: d */
    private int f53696d;

    /* JADX INFO: renamed from: e */
    private Pager f53697e;

    /* JADX INFO: renamed from: f */
    private boolean f53698f;

    /* JADX INFO: renamed from: g */
    private final C3187b0 f53699g;

    /* JADX INFO: renamed from: h */
    private final C3187b0 f53700h;

    /* JADX INFO: renamed from: i */
    private boolean f53701i;

    /* JADX INFO: renamed from: com.transsion.home.viewmodel.UGCFilmListViewModel$a */
    public static final class C15545a {
        private C15545a() {
        }

        public /* synthetic */ C15545a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCFilmListViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f53694b = (InterfaceC27628b) C22982c.f70163e.m91553a().m91552h(InterfaceC27628b.class);
        this.f53695c = "";
        this.f53696d = 1;
        this.f53699g = new C3187b0();
        this.f53700h = new C3187b0();
    }

    /* JADX INFO: renamed from: i */
    private final void m69072i(int i11) {
        C26866a.a.m104898f(C26866a.f81698a, "FilmListViewModel", "getFilmList: start loading, page=" + i11 + ", filmType=" + this.f53695c, false, 4, null);
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new UGCFilmListViewModel$getFilmList$1(this, i11, null), 2, null);
    }

    /* JADX INFO: renamed from: j */
    public final C3187b0 m69073j() {
        return this.f53700h;
    }

    /* JADX INFO: renamed from: k */
    public final C3187b0 m69074k() {
        return this.f53699g;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m69075l() {
        Pager pager = this.f53697e;
        if (pager != null) {
            return Intrinsics.m97797c(pager.getHasMore(), Boolean.TRUE);
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m69076m(String filmType) {
        Intrinsics.m97802h(filmType, "filmType");
        this.f53695c = filmType;
        C26866a.a.m104898f(C26866a.f81698a, "FilmListViewModel", "init: filmType=" + filmType, false, 4, null);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m69077n() {
        return this.f53698f;
    }

    /* JADX INFO: renamed from: o */
    public final void m69078o() {
        Pager pager = this.f53697e;
        String nextPage = pager != null ? pager.getNextPage() : null;
        if (nextPage == null || nextPage.length() == 0) {
            C26866a.a.m104910z(C26866a.f81698a, "FilmListViewModel", "loadMore: nextPage is null or empty, cannot load more", false, 4, null);
            this.f53699g.mo14855n(null);
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "FilmListViewModel", "loadMore: load nextPage=" + nextPage, false, 4, null);
        this.f53698f = false;
        Integer numV = StringsKt.m98216v(nextPage);
        m69072i(numV != null ? numV.intValue() : 1);
    }

    /* JADX INFO: renamed from: p */
    public final void m69079p() {
        C26866a.a.m104898f(C26866a.f81698a, "FilmListViewModel", "refresh: reset page to 1 and load first page", false, 4, null);
        this.f53696d = 1;
        this.f53697e = null;
        this.f53698f = true;
        m69072i(1);
    }
}
