package com.transsion.search.viewmodel;

import android.app.Application;
import android.text.TextUtils;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.mbridge.msdk.MBridgeConstans;
import com.p282tn.lib.net.bean.BaseDto;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.search.activity.SearchManagerActivity;
import com.transsion.search.bean.HotSubjectEntity;
import com.transsion.search.bean.JoinGroupEntity;
import com.transsion.search.bean.SearchSuggestEntity;
import com.transsion.search.bean.SuggestEntity;
import com.transsion.search.fragment.BaseSearchMainFragment;
import com.transsion.search.net.RequestJoinGroupEntity;
import com.transsion.search.net.RequestSearchEntity;
import com.transsion.search.widget.BoundaryLinkedHashMap;
import io.reactivex.rxjava3.disposables.InterfaceC24104c;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import p355dr.C23046j;
import p550kj.C24662i;
import p666oz.InterfaceC26758f;
import p871wg.AbstractC28362a;
import p913xm.C28615f;
import tz.AbstractC27875a;

/* JADX INFO: loaded from: classes6.dex */
public final class SearchViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: b */
    private final C3187b0 f60002b;

    /* JADX INFO: renamed from: c */
    private final C3187b0 f60003c;

    /* JADX INFO: renamed from: d */
    private final C3187b0 f60004d;

    /* JADX INFO: renamed from: e */
    private final C3187b0 f60005e;

    /* JADX INFO: renamed from: f */
    private final C3187b0 f60006f;

    /* JADX INFO: renamed from: g */
    private final C3187b0 f60007g;

    /* JADX INFO: renamed from: h */
    private final Lazy f60008h;

    /* JADX INFO: renamed from: i */
    private InterfaceC24104c f60009i;

    /* JADX INFO: renamed from: j */
    private final BoundaryLinkedHashMap f60010j;

    /* JADX INFO: renamed from: k */
    private final BoundaryLinkedHashMap f60011k;

    /* JADX INFO: renamed from: l */
    private final C3187b0 f60012l;

    /* JADX INFO: renamed from: m */
    private final Lazy f60013m;

    /* JADX INFO: renamed from: com.transsion.search.viewmodel.SearchViewModel$a */
    public static final class C18529a extends AbstractC28362a {
        C18529a() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            SearchViewModel.this.m78078l().mo14855n(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(HotSubjectEntity hotSubjectEntity) {
            SearchViewModel.this.m78078l().mo14855n(hotSubjectEntity);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.viewmodel.SearchViewModel$b */
    public static final class C18530b extends AbstractC28362a {
        C18530b() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            if (str2 != null) {
                C13806h.f49015a.m62325l(str2);
            }
            SearchViewModel.this.f60005e.mo14855n("");
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: d */
        public void mo66580d(BaseDto baseDto) {
            Intrinsics.m97802h(baseDto, "baseDto");
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(JoinGroupEntity joinGroupEntity) {
            if (TextUtils.isEmpty(joinGroupEntity != null ? joinGroupEntity.getM() : null)) {
                SearchViewModel.this.f60005e.mo14855n("succeed");
            } else {
                SearchViewModel.this.f60005e.mo14855n(joinGroupEntity != null ? joinGroupEntity.getM() : null);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.viewmodel.SearchViewModel$c */
    static final class C18531c implements InterfaceC26758f {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f60017b;

        C18531c(String str) {
            this.f60017b = str;
        }

        @Override // p666oz.InterfaceC26758f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(SearchSuggestEntity data) {
            Intrinsics.m97802h(data, "data");
            SearchViewModel.this.m78071v(this.f60017b, data);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.viewmodel.SearchViewModel$d */
    static final class C18532d implements InterfaceC26758f {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f60019b;

        C18532d(String str) {
            this.f60019b = str;
        }

        @Override // p666oz.InterfaceC26758f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            Intrinsics.m97802h(it, "it");
            SearchViewModel.this.m78085t().mo14855n(this.f60019b);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.viewmodel.SearchViewModel$e */
    public static final class C18533e extends AbstractC28362a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f60021e;

        C18533e(String str) {
            this.f60021e = str;
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            SearchViewModel.this.m78085t().mo14855n(this.f60021e);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(SearchSuggestEntity searchSuggestEntity) {
            SearchViewModel.this.m78071v(this.f60021e, searchSuggestEntity);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.viewmodel.SearchViewModel$f */
    public static final class C18534f extends AbstractC28362a {
        C18534f() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            if (str2 != null) {
                C13806h.f49015a.m62325l(str2);
            }
            SearchViewModel.this.f60002b.mo14855n(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: d */
        public void mo66580d(BaseDto baseDto) {
            Intrinsics.m97802h(baseDto, "baseDto");
            SearchViewModel.this.f60002b.mo14855n(baseDto.getData());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f60002b = new C3187b0();
        this.f60003c = new C3187b0();
        this.f60004d = new C3187b0();
        this.f60005e = new C3187b0();
        this.f60006f = new C3187b0();
        this.f60007g = new C3187b0();
        this.f60008h = LazyKt.m97097b(new Function0() { // from class: com.transsion.search.viewmodel.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchViewModel.m78060B();
            }
        });
        this.f60010j = new BoundaryLinkedHashMap();
        this.f60011k = new BoundaryLinkedHashMap();
        this.f60012l = new C3187b0();
        this.f60013m = LazyKt.m97097b(new Function0() { // from class: com.transsion.search.viewmodel.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(SearchViewModel.m78072x());
            }
        });
    }

    /* JADX INFO: renamed from: A */
    private final void m78059A(String str) {
        m78070n().m91684e(str).m95073E(AbstractC27875a.m108402c()).subscribe(new C18533e(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23046j m78060B() {
        return new C23046j();
    }

    /* JADX INFO: renamed from: F */
    private final boolean m78061F() {
        return m78087w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final C23046j m78070n() {
        return (C23046j) this.f60008h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0012  */
    /* JADX INFO: renamed from: v */
    public final void m78071v(String str, SearchSuggestEntity searchSuggestEntity) {
        if (searchSuggestEntity == null) {
            return;
        }
        String keyword = searchSuggestEntity.getKeyword();
        if (keyword == null) {
            keyword = str;
        } else {
            if (StringsKt.m98160q0(keyword)) {
                keyword = str;
            }
            if (keyword == null) {
                keyword = str;
            }
        }
        this.f60010j.put(str, searchSuggestEntity);
        if (!Intrinsics.m97797c(keyword, str)) {
            this.f60010j.put(keyword, searchSuggestEntity);
        }
        this.f60012l.mo14855n(str);
        List<SuggestEntity> items = searchSuggestEntity.getItems();
        if (items == null || !items.isEmpty() || keyword.length() < 2 || this.f60011k.containsKey(keyword)) {
            return;
        }
        this.f60011k.put(keyword, null);
        SearchManagerActivity.INSTANCE.m77609a("no associative word results when the user enters query longer than 2 characters");
        HashMap map = new HashMap();
        map.put(MBridgeConstans.KEY_WORD, keyword);
        String ops = searchSuggestEntity.getOps();
        if (ops == null) {
            ops = "";
        }
        map.put("ops", ops);
        map.put("sug_source", m78084s());
        map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
        C24662i.f75350a.m96872D("search_suggest", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final boolean m78072x() {
        String value;
        ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("sa_search_suggest_use_google", true);
        if (configBeanM110360c == null || (value = configBeanM110360c.getValue()) == null) {
            return false;
        }
        return Intrinsics.m97797c(StringsKt.m98153m1(value), Boolean.TRUE);
    }

    /* JADX INFO: renamed from: z */
    private final void m78073z(String str) {
        m78070n().m91682b(str).m95073E(AbstractC27875a.m108402c()).m95070B(new C18531c(str), new C18532d(str));
    }

    /* JADX INFO: renamed from: C */
    public final void m78074C(int i11, int i12, String keyword) {
        Intrinsics.m97802h(keyword, "keyword");
        m78070n().m91686h(new RequestSearchEntity(i11, i12, keyword)).m95073E(AbstractC27875a.m108402c()).subscribe(new C18534f());
    }

    /* JADX INFO: renamed from: D */
    public final void m78075D(int i11, int i12, String keyword) {
        Intrinsics.m97802h(keyword, "keyword");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new SearchViewModel$searchWork$1(this, new RequestSearchEntity(i11, i12, keyword), null), 3, null);
    }

    /* JADX INFO: renamed from: E */
    public final void m78076E(int i11, int i12, String keyword, int i13) {
        Intrinsics.m97802h(keyword, "keyword");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new SearchViewModel$searchWorkV2$1(this, new RequestSearchEntity(i11, i12, keyword, i13), null), 3, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m78077k() {
        m78070n().m91683d().m95073E(AbstractC27875a.m108402c()).subscribe(new C18529a());
    }

    /* JADX INFO: renamed from: l */
    public final C3187b0 m78078l() {
        return this.f60007g;
    }

    /* JADX INFO: renamed from: m */
    public final C3187b0 m78079m() {
        return this.f60005e;
    }

    /* JADX INFO: renamed from: o */
    public final C3187b0 m78080o() {
        return this.f60002b;
    }

    @Override // androidx.p1004lifecycle.AbstractC3223t0
    protected void onCleared() {
        InterfaceC24104c interfaceC24104c;
        super.onCleared();
        InterfaceC24104c interfaceC24104c2 = this.f60009i;
        if (interfaceC24104c2 == null || interfaceC24104c2.isDisposed() || (interfaceC24104c = this.f60009i) == null) {
            return;
        }
        interfaceC24104c.dispose();
    }

    /* JADX INFO: renamed from: p */
    public final void m78081p(String keyword) {
        Intrinsics.m97802h(keyword, "keyword");
        if (m78061F()) {
            m78073z(keyword);
        } else {
            m78059A(keyword);
        }
    }

    /* JADX INFO: renamed from: q */
    public final C3187b0 m78082q() {
        return this.f60003c;
    }

    /* JADX INFO: renamed from: r */
    public final C3187b0 m78083r() {
        return this.f60004d;
    }

    /* JADX INFO: renamed from: s */
    public final String m78084s() {
        return m78087w() ? "gp_sug" : "mb_sug";
    }

    /* JADX INFO: renamed from: t */
    public final C3187b0 m78085t() {
        return this.f60012l;
    }

    /* JADX INFO: renamed from: u */
    public final BoundaryLinkedHashMap m78086u() {
        return this.f60010j;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m78087w() {
        return ((Boolean) this.f60013m.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: y */
    public final void m78088y(String groupId) {
        Intrinsics.m97802h(groupId, "groupId");
        m78070n().m91685g(new RequestJoinGroupEntity(groupId)).m95073E(AbstractC27875a.m108402c()).subscribe(new C18530b());
    }
}
