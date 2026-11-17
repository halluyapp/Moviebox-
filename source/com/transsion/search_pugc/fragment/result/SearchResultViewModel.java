package com.transsion.search_pugc.fragment.result;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.transsion.search_pugc.bean.SecondTab;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kr.InterfaceC25423a;
import p349dh.C22982c;

/* JADX INFO: loaded from: classes6.dex */
public final class SearchResultViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: i */
    public static final C18621a f60198i = new C18621a(null);

    /* JADX INFO: renamed from: b */
    private final Lazy f60199b;

    /* JADX INFO: renamed from: c */
    private final C3187b0 f60200c;

    /* JADX INFO: renamed from: d */
    private final C3187b0 f60201d;

    /* JADX INFO: renamed from: e */
    private final C3187b0 f60202e;

    /* JADX INFO: renamed from: f */
    private String f60203f;

    /* JADX INFO: renamed from: g */
    private final C3187b0 f60204g;

    /* JADX INFO: renamed from: h */
    private int f60205h;

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.result.SearchResultViewModel$a */
    public static final class C18621a {
        private C18621a() {
        }

        public /* synthetic */ C18621a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f60199b = LazyKt.m97097b(new Function0() { // from class: com.transsion.search_pugc.fragment.result.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultViewModel.m78402o();
            }
        });
        this.f60200c = new C3187b0();
        this.f60201d = new C3187b0();
        this.f60202e = new C3187b0();
        this.f60204g = new C3187b0(Boolean.FALSE);
        this.f60205h = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final InterfaceC25423a m78400j() {
        return (InterfaceC25423a) this.f60199b.getValue();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m78401n(SearchResultViewModel searchResultViewModel, String str, String str2, String str3, boolean z11, SecondTab secondTab, int i11, Object obj) {
        String str4 = (i11 & 2) != 0 ? null : str2;
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        searchResultViewModel.m78408m(str, str4, str3, z11, (i11 & 16) != 0 ? null : secondTab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final InterfaceC25423a m78402o() {
        return (InterfaceC25423a) C22982c.f70163e.m91553a().m91552h(InterfaceC25423a.class);
    }

    /* JADX INFO: renamed from: g */
    public final String m78403g() {
        return this.f60203f;
    }

    /* JADX INFO: renamed from: h */
    public final C3187b0 m78404h() {
        return this.f60202e;
    }

    /* JADX INFO: renamed from: i */
    public final C3187b0 m78405i() {
        return this.f60204g;
    }

    /* JADX INFO: renamed from: k */
    public final C3187b0 m78406k() {
        return this.f60201d;
    }

    /* JADX INFO: renamed from: l */
    public final C3187b0 m78407l() {
        return this.f60200c;
    }

    /* JADX INFO: renamed from: m */
    public final void m78408m(String keyword, String str, String pageFrom, boolean z11, SecondTab secondTab) {
        Intrinsics.m97802h(keyword, "keyword");
        Intrinsics.m97802h(pageFrom, "pageFrom");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new SearchResultViewModel$requestUGCSearchResult$1(this, keyword, pageFrom, str, secondTab, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m78409p(String str) {
        this.f60203f = str;
    }

    /* JADX INFO: renamed from: q */
    public final void m78410q(int i11) {
        this.f60205h = i11;
    }
}
