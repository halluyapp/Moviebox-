package com.transsion.search_pugc;

import android.content.Context;
import androidx.p1004lifecycle.AbstractC3192e;
import androidx.p1004lifecycle.C3228w;
import androidx.p1004lifecycle.InterfaceC3194f;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.Lifecycle;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baselib.helper.C14450a;
import com.transsion.search_pugc.bean.SearchResultItem;
import com.transsion.search_pugc.bean.SearchSuggestItem;
import com.transsion.search_pugc.bean.SearchTab;
import com.transsion.search_pugc.bean.SecondTab;
import com.transsion.search_pugc.fragment.hot.SearchHotFragment;
import com.transsion.ugcvideodetail.api.bean.UGCCollection;
import com.transsion.ugcvideodetail.api.bean.UGCVerticalRank;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.ugcvideodetail.api.bean.UGCVideoHashTag;
import com.transsion.web.api.WebConstants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24655b;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.search_pugc.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C18670g {

    /* JADX INFO: renamed from: h */
    public static final b f60281h = new b(null);

    /* JADX INFO: renamed from: i */
    private static final Map f60282i = new LinkedHashMap();

    /* JADX INFO: renamed from: j */
    private static final Lazy f60283j = LazyKt.m97097b(new Function0() { // from class: com.transsion.search_pugc.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C18670g.m78490d();
        }
    });

    /* JADX INFO: renamed from: a */
    private final InterfaceC3224u f60284a;

    /* JADX INFO: renamed from: b */
    private final Map f60285b;

    /* JADX INFO: renamed from: c */
    private final String f60286c;

    /* JADX INFO: renamed from: d */
    private String f60287d;

    /* JADX INFO: renamed from: e */
    private final String f60288e;

    /* JADX INFO: renamed from: f */
    private String f60289f;

    /* JADX INFO: renamed from: g */
    private String f60290g;

    /* JADX INFO: renamed from: com.transsion.search_pugc.g$a */
    private static final class a implements InterfaceC3224u {

        /* JADX INFO: renamed from: a */
        public static final a f60291a;

        /* JADX INFO: renamed from: b */
        private static final C3228w f60292b;

        static {
            a aVar = new a();
            f60291a = aVar;
            f60292b = new C3228w(aVar);
        }

        private a() {
        }

        @Override // androidx.p1004lifecycle.InterfaceC3224u
        public Lifecycle getLifecycle() {
            return f60292b;
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.g$b */
    public static final class b {

        /* JADX INFO: renamed from: com.transsion.search_pugc.g$b$a */
        public static final class a implements InterfaceC3194f {
            a() {
            }

            @Override // androidx.p1004lifecycle.InterfaceC3194f
            public /* synthetic */ void onCreate(InterfaceC3224u interfaceC3224u) {
                AbstractC3192e.m14896a(this, interfaceC3224u);
            }

            @Override // androidx.p1004lifecycle.InterfaceC3194f
            public void onDestroy(InterfaceC3224u owner) {
                Intrinsics.m97802h(owner, "owner");
                C18670g.f60282i.remove(owner);
            }

            @Override // androidx.p1004lifecycle.InterfaceC3194f
            public /* synthetic */ void onPause(InterfaceC3224u interfaceC3224u) {
                AbstractC3192e.m14898c(this, interfaceC3224u);
            }

            @Override // androidx.p1004lifecycle.InterfaceC3194f
            public /* synthetic */ void onResume(InterfaceC3224u interfaceC3224u) {
                AbstractC3192e.m14899d(this, interfaceC3224u);
            }

            @Override // androidx.p1004lifecycle.InterfaceC3194f
            public /* synthetic */ void onStart(InterfaceC3224u interfaceC3224u) {
                AbstractC3192e.m14900e(this, interfaceC3224u);
            }

            @Override // androidx.p1004lifecycle.InterfaceC3194f
            public /* synthetic */ void onStop(InterfaceC3224u interfaceC3224u) {
                AbstractC3192e.m14901f(this, interfaceC3224u);
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        private final C18670g m78519c() {
            return (C18670g) C18670g.f60283j.getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final C18670g m78520a(Context context) {
            if (context != 0) {
                C18670g c18670gM78521b = context instanceof InterfaceC3224u ? C18670g.f60281h.m78521b((InterfaceC3224u) context) : C18670g.f60281h.m78519c();
                if (c18670gM78521b != null) {
                    return c18670gM78521b;
                }
            }
            return m78519c();
        }

        /* JADX INFO: renamed from: b */
        public final C18670g m78521b(InterfaceC3224u interfaceC3224u) {
            C18670g c18670g = (C18670g) C18670g.f60282i.get(interfaceC3224u);
            return c18670g == null ? m78519c() : c18670g;
        }

        /* JADX INFO: renamed from: d */
        public final C18670g m78522d(InterfaceC3224u lifecycleOwner) {
            Intrinsics.m97802h(lifecycleOwner, "lifecycleOwner");
            Map map = C18670g.f60282i;
            Object c18670g = map.get(lifecycleOwner);
            if (c18670g == null) {
                c18670g = new C18670g(lifecycleOwner, null);
                lifecycleOwner.getLifecycle().mo14832a(new a());
                map.put(lifecycleOwner, c18670g);
            }
            return (C18670g) c18670g;
        }
    }

    private C18670g(InterfaceC3224u interfaceC3224u) {
        this.f60284a = interfaceC3224u;
        this.f60285b = new LinkedHashMap();
        this.f60286c = C24662i.f75350a.m96877i();
        this.f60287d = "mb_sug";
        String string = UUID.randomUUID().toString();
        Intrinsics.m97801g(string, "toString(...)");
        this.f60288e = string;
    }

    public /* synthetic */ C18670g(InterfaceC3224u interfaceC3224u, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3224u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C18670g m78490d() {
        return new C18670g(a.f60291a);
    }

    /* JADX INFO: renamed from: h */
    private final HashMap m78491h() {
        HashMap map = new HashMap();
        map.put("search_id", this.f60288e);
        map.put("sug_source", this.f60287d);
        return map;
    }

    /* JADX INFO: renamed from: A */
    public final void m78492A(SearchSuggestItem searchSuggestItem, Integer num, String keyWord, String str) {
        String word;
        Intrinsics.m97802h(keyWord, "keyWord");
        HashMap mapM78491h = m78491h();
        mapM78491h.put("keyword", keyWord);
        if (searchSuggestItem == null || (word = searchSuggestItem.getWord()) == null) {
            word = "";
        }
        mapM78491h.put(CampaignEx.JSON_KEY_TITLE, word);
        mapM78491h.put(RequestParameters.POSITION, String.valueOf(num));
        if (str == null) {
            str = "";
        }
        mapM78491h.put("ops", str);
        C24662i.f75350a.m96872D("/ugc_search/search_suggest", mapM78491h);
    }

    /* JADX INFO: renamed from: B */
    public final void m78493B(SearchSuggestItem searchSuggestItem, int i11, String keyWord, String str) {
        String word;
        Intrinsics.m97802h(keyWord, "keyWord");
        HashMap mapM78491h = m78491h();
        mapM78491h.put("keyword", keyWord);
        if (searchSuggestItem == null || (word = searchSuggestItem.getWord()) == null) {
            word = "";
        }
        mapM78491h.put(CampaignEx.JSON_KEY_TITLE, word);
        mapM78491h.put(RequestParameters.POSITION, String.valueOf(i11));
        if (str == null) {
            str = "";
        }
        mapM78491h.put("ops", str);
        C24662i.f75350a.m96881p("/ugc_search/search_suggest", mapM78491h);
    }

    /* JADX INFO: renamed from: C */
    public final void m78494C(String str, SearchTab searchTab, String str2) {
        String name;
        HashMap mapM78491h = m78491h();
        if (str == null) {
            str = "";
        }
        mapM78491h.put("keyword", str);
        if (searchTab == null || (name = searchTab.getName()) == null) {
            name = "";
        }
        mapM78491h.put("page_tab_name", name);
        mapM78491h.put("module_name", "result_tab_click");
        mapM78491h.put("search_from", String.valueOf(this.f60289f));
        mapM78491h.put("content_type", "ugc_video");
        if (str2 == null) {
            str2 = "";
        }
        mapM78491h.put("ops", str2);
        C14450a.f50860a.m65143f("/ugc_search/search_result", mapM78491h);
    }

    /* JADX INFO: renamed from: D */
    public final void m78495D(C24655b c24655b) {
        if (c24655b != null) {
            c24655b.m96844g().put("search_from", this.f60289f);
            c24655b.m96844g().put("keyword", this.f60290g);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m78496E(String searchFrom, String keyword) {
        Intrinsics.m97802h(searchFrom, "searchFrom");
        Intrinsics.m97802h(keyword, "keyword");
        this.f60289f = searchFrom;
        this.f60290g = keyword;
    }

    /* JADX INFO: renamed from: F */
    public final void m78497F(String str) {
        Intrinsics.m97802h(str, "<set-?>");
        this.f60287d = str;
    }

    /* JADX INFO: renamed from: e */
    public final String m78498e() {
        return this.f60290g;
    }

    /* JADX INFO: renamed from: f */
    public final String m78499f() {
        return this.f60286c;
    }

    /* JADX INFO: renamed from: g */
    public final C24655b m78500g(String pageName) {
        Intrinsics.m97802h(pageName, "pageName");
        C24655b c24655b = new C24655b(pageName, false, 2, null);
        c24655b.m96844g().put("search_id", this.f60288e);
        c24655b.m96844g().put("sug_source", this.f60287d);
        return c24655b;
    }

    /* JADX INFO: renamed from: i */
    public final void m78501i(C24655b c24655b) {
        Long l11;
        if (c24655b == null || (l11 = (Long) this.f60285b.remove(c24655b)) == null) {
            return;
        }
        c24655b.m96844g().put("load_duration", String.valueOf(System.currentTimeMillis() - l11.longValue()));
    }

    /* JADX INFO: renamed from: j */
    public final void m78502j(C24655b c24655b) {
        if (c24655b != null) {
            Map map = this.f60285b;
            Object objValueOf = map.get(c24655b);
            if (objValueOf == null) {
                objValueOf = Long.valueOf(System.currentTimeMillis());
                map.put(c24655b, objValueOf);
            }
            ((Number) objValueOf).longValue();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m78503k(UGCVideo uGCVideo, int i11, String str, SearchTab tab, SecondTab secondTab) {
        String ugcVideoId;
        String subjectId;
        String collectionId;
        String ops;
        UGCVideoBelongToCollection belongToCollection;
        Intrinsics.m97802h(tab, "tab");
        HashMap mapM78491h = m78491h();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        mapM78491h.put("keyword", str);
        mapM78491h.put(RequestParameters.POSITION, String.valueOf(i11));
        String strValueOf = String.valueOf(tab.getName());
        if (secondTab != null) {
            strValueOf = ((Object) strValueOf) + "/" + secondTab.getTagValue();
        }
        mapM78491h.put("page_tab_name", strValueOf);
        mapM78491h.put("content_type", "ugc_video");
        mapM78491h.put("search_from", String.valueOf(this.f60289f));
        mapM78491h.put("module_name", WebConstants.FIELD_ITEM);
        if (uGCVideo == null || (ugcVideoId = uGCVideo.getUgcVideoId()) == null) {
            ugcVideoId = "";
        }
        mapM78491h.put("content_id", ugcVideoId);
        if (uGCVideo == null || (subjectId = uGCVideo.getSubjectId()) == null) {
            subjectId = "";
        }
        mapM78491h.put("refer_subject_id", subjectId);
        if (uGCVideo == null || (belongToCollection = uGCVideo.getBelongToCollection()) == null || (collectionId = belongToCollection.getCollectionId()) == null) {
            collectionId = "";
        }
        mapM78491h.put("belong_to_collection_id", collectionId);
        if (uGCVideo != null && (ops = uGCVideo.getOps()) != null) {
            str2 = ops;
        }
        mapM78491h.put("ops", str2);
        C14450a.f50860a.m65142e("/ugc_search/search_result", mapM78491h);
    }

    /* JADX INFO: renamed from: l */
    public final void m78504l(UGCVideo uGCVideo, int i11, String str, SearchTab tab, SecondTab secondTab) {
        String ugcVideoId;
        String subjectId;
        String collectionId;
        String ops;
        UGCVideoBelongToCollection belongToCollection;
        Intrinsics.m97802h(tab, "tab");
        HashMap mapM78491h = m78491h();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        mapM78491h.put("keyword", str);
        mapM78491h.put(RequestParameters.POSITION, String.valueOf(i11));
        String strValueOf = String.valueOf(tab.getName());
        if (secondTab != null) {
            strValueOf = ((Object) strValueOf) + "/" + secondTab.getTagValue();
        }
        mapM78491h.put("page_tab_name", strValueOf);
        mapM78491h.put("content_type", "ugc_video");
        mapM78491h.put("search_from", String.valueOf(this.f60289f));
        mapM78491h.put("module_name", WebConstants.FIELD_ITEM);
        if (uGCVideo == null || (ugcVideoId = uGCVideo.getUgcVideoId()) == null) {
            ugcVideoId = "";
        }
        mapM78491h.put("content_id", ugcVideoId);
        if (uGCVideo == null || (subjectId = uGCVideo.getSubjectId()) == null) {
            subjectId = "";
        }
        mapM78491h.put("refer_subject_id", subjectId);
        if (uGCVideo == null || (belongToCollection = uGCVideo.getBelongToCollection()) == null || (collectionId = belongToCollection.getCollectionId()) == null) {
            collectionId = "";
        }
        mapM78491h.put("belong_to_collection_id", collectionId);
        if (uGCVideo != null && (ops = uGCVideo.getOps()) != null) {
            str2 = ops;
        }
        mapM78491h.put("ops", str2);
        C14450a.f50860a.m65143f("/ugc_search/search_result", mapM78491h);
    }

    /* JADX INFO: renamed from: m */
    public final void m78505m() {
        HashMap mapM78491h = m78491h();
        mapM78491h.put("module_name", "history_delete");
        C14450a.f50860a.m65143f(SearchHotFragment.PAGE_NAME, mapM78491h);
    }

    /* JADX INFO: renamed from: n */
    public final void m78506n(boolean z11) {
        HashMap mapM78491h = m78491h();
        mapM78491h.put("isExpand", String.valueOf(z11));
        mapM78491h.put("module_name", "history_expand");
        C14450a.f50860a.m65143f(SearchHotFragment.PAGE_NAME, mapM78491h);
    }

    /* JADX INFO: renamed from: o */
    public final void m78507o(String str, int i11) {
        HashMap mapM78491h = m78491h();
        if (str == null) {
            str = "";
        }
        mapM78491h.put("keyword", str);
        mapM78491h.put(RequestParameters.POSITION, String.valueOf(i11));
        mapM78491h.put("module_name", "history_browse");
        mapM78491h.put("content_type", "ugc_video");
        C14450a.f50860a.m65138a(SearchHotFragment.PAGE_NAME, mapM78491h);
    }

    /* JADX INFO: renamed from: p */
    public final void m78508p(String keyWord, int i11) {
        Intrinsics.m97802h(keyWord, "keyWord");
        HashMap mapM78491h = m78491h();
        mapM78491h.put("keyword", keyWord);
        mapM78491h.put(RequestParameters.POSITION, String.valueOf(i11));
        mapM78491h.put("module_name", "history_click");
        mapM78491h.put("content_type", "ugc_video");
        C14450a.f50860a.m65143f(SearchHotFragment.PAGE_NAME, mapM78491h);
    }

    /* JADX INFO: renamed from: q */
    public final void m78509q(String str, int i11) {
        HashMap mapM78491h = m78491h();
        if (str == null) {
            str = "";
        }
        mapM78491h.put("keyword", str);
        mapM78491h.put(RequestParameters.POSITION, String.valueOf(i11));
        mapM78491h.put("module_name", "hot_word_browse");
        mapM78491h.put("content_type", "ugc_video");
        C14450a.f50860a.m65142e(SearchHotFragment.PAGE_NAME, mapM78491h);
    }

    /* JADX INFO: renamed from: r */
    public final void m78510r(String keyword, int i11) {
        Intrinsics.m97802h(keyword, "keyword");
        HashMap mapM78491h = m78491h();
        mapM78491h.put("keyword", keyword);
        mapM78491h.put(RequestParameters.POSITION, String.valueOf(i11));
        mapM78491h.put("module_name", "hot_word_click");
        mapM78491h.put("content_type", "ugc_video");
        C14450a.f50860a.m65143f(SearchHotFragment.PAGE_NAME, mapM78491h);
    }

    /* JADX INFO: renamed from: s */
    public final void m78511s(UGCVideo ugcVideo, int i11, String tabName, int i12) {
        String collectionId;
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        Intrinsics.m97802h(tabName, "tabName");
        HashMap mapM78491h = m78491h();
        mapM78491h.put("module_name", "hot_rank_browse");
        String ugcVideoId = ugcVideo.getUgcVideoId();
        if (ugcVideoId == null) {
            ugcVideoId = "";
        }
        mapM78491h.put("content_id", ugcVideoId);
        mapM78491h.put(RequestParameters.POSITION, String.valueOf(i11));
        String subjectId = ugcVideo.getSubjectId();
        if (subjectId == null) {
            subjectId = "";
        }
        mapM78491h.put("refer_subject_id", subjectId);
        UGCVideoBelongToCollection belongToCollection = ugcVideo.getBelongToCollection();
        if (belongToCollection == null || (collectionId = belongToCollection.getCollectionId()) == null) {
            collectionId = "";
        }
        mapM78491h.put("belong_to_collection_id", collectionId);
        mapM78491h.put("content_type", "ugc_video");
        mapM78491h.put("page_tab_name", tabName);
        String ops = ugcVideo.getOps();
        mapM78491h.put("ops", ops != null ? ops : "");
        C14450a.f50860a.m65138a(SearchHotFragment.PAGE_NAME, mapM78491h);
    }

    /* JADX INFO: renamed from: t */
    public final void m78512t(UGCVideo ugcVideo, int i11, String tabName, int i12) {
        String collectionId;
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        Intrinsics.m97802h(tabName, "tabName");
        HashMap mapM78491h = m78491h();
        mapM78491h.put("module_name", "hot_rank_click");
        String ugcVideoId = ugcVideo.getUgcVideoId();
        if (ugcVideoId == null) {
            ugcVideoId = "";
        }
        mapM78491h.put("content_id", ugcVideoId);
        mapM78491h.put(RequestParameters.POSITION, String.valueOf(i11));
        String subjectId = ugcVideo.getSubjectId();
        if (subjectId == null) {
            subjectId = "";
        }
        mapM78491h.put("refer_subject_id", subjectId);
        UGCVideoBelongToCollection belongToCollection = ugcVideo.getBelongToCollection();
        if (belongToCollection == null || (collectionId = belongToCollection.getCollectionId()) == null) {
            collectionId = "";
        }
        mapM78491h.put("belong_to_collection_id", collectionId);
        mapM78491h.put("content_type", "ugc_video");
        mapM78491h.put("page_tab_name", tabName);
        String ops = ugcVideo.getOps();
        mapM78491h.put("ops", ops != null ? ops : "");
        C14450a.f50860a.m65143f(SearchHotFragment.PAGE_NAME, mapM78491h);
    }

    /* JADX INFO: renamed from: u */
    public final void m78513u(UGCVideo ugcVideo, int i11, String str, SearchTab tab, SecondTab secondTab) {
        String collectionId;
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        Intrinsics.m97802h(tab, "tab");
        HashMap mapM78491h = m78491h();
        if (str == null) {
            str = "";
        }
        mapM78491h.put("keyword", str);
        mapM78491h.put(RequestParameters.POSITION, String.valueOf(i11));
        mapM78491h.put("content_type", "ugc_video");
        mapM78491h.put("module_name", WebConstants.FIELD_ITEM);
        String ugcVideoId = ugcVideo.getUgcVideoId();
        if (ugcVideoId == null) {
            ugcVideoId = "";
        }
        mapM78491h.put("content_id", ugcVideoId);
        String subjectId = ugcVideo.getSubjectId();
        if (subjectId == null) {
            subjectId = "";
        }
        mapM78491h.put("refer_subject_id", subjectId);
        UGCVideoBelongToCollection belongToCollection = ugcVideo.getBelongToCollection();
        if (belongToCollection == null || (collectionId = belongToCollection.getCollectionId()) == null) {
            collectionId = "";
        }
        mapM78491h.put("belong_to_collection_id", collectionId);
        String strValueOf = String.valueOf(tab.getName());
        if (secondTab != null) {
            strValueOf = ((Object) strValueOf) + "/" + secondTab.getTagValue();
        }
        mapM78491h.put("page_tab_name", strValueOf);
        mapM78491h.put("search_from", String.valueOf(this.f60289f));
        String ops = ugcVideo.getOps();
        mapM78491h.put("ops", ops != null ? ops : "");
        C14450a.f50860a.m65143f("/ugc_search/search_result", mapM78491h);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: v */
    public final void m78514v(SearchResultItem item, int i11, long j11, String str, SearchTab searchTab, SecondTab secondTab) {
        String ugcVideoId;
        String subjectId;
        String collectionId;
        String ops;
        UGCVideoBelongToCollection belongToCollection;
        String collectionId2;
        String referId;
        String title;
        String id2;
        Intrinsics.m97802h(item, "item");
        HashMap mapM78491h = m78491h();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        mapM78491h.put("keyword", str);
        mapM78491h.put(RequestParameters.POSITION, String.valueOf(i11));
        String strValueOf = String.valueOf(searchTab != null ? searchTab.getName() : null);
        if (secondTab != null) {
            strValueOf = ((Object) strValueOf) + "/" + secondTab.getTagValue();
        }
        mapM78491h.put("page_tab_name", strValueOf);
        mapM78491h.put("search_from", String.valueOf(this.f60289f));
        String topicType = item.getTopicType();
        if (topicType != null) {
            switch (topicType.hashCode()) {
                case -1989652851:
                    if (topicType.equals("UGC_VIDEO")) {
                        mapM78491h.put("module_name", WebConstants.FIELD_ITEM);
                        mapM78491h.put("content_type", "ugc_video");
                        UGCVideo video = item.getVideo();
                        if (video == null || (ugcVideoId = video.getUgcVideoId()) == null) {
                            ugcVideoId = "";
                        }
                        mapM78491h.put("content_id", ugcVideoId);
                        UGCVideo video2 = item.getVideo();
                        if (video2 == null || (subjectId = video2.getSubjectId()) == null) {
                            subjectId = "";
                        }
                        mapM78491h.put("refer_subject_id", subjectId);
                        UGCVideo video3 = item.getVideo();
                        if (video3 == null || (belongToCollection = video3.getBelongToCollection()) == null || (collectionId = belongToCollection.getCollectionId()) == null) {
                            collectionId = "";
                        }
                        mapM78491h.put("belong_to_collection_id", collectionId);
                        UGCVideo video4 = item.getVideo();
                        if (video4 != null && (ops = video4.getOps()) != null) {
                            str2 = ops;
                        }
                        mapM78491h.put("ops", str2);
                    }
                    break;
                case 511113132:
                    if (topicType.equals("UGC_COLLECTION")) {
                        mapM78491h.put("module_name", "collection");
                        mapM78491h.put("content_type", "collection");
                        UGCCollection collection = item.getCollection();
                        if (collection != null && (collectionId2 = collection.getCollectionId()) != null) {
                            str2 = collectionId2;
                        }
                        mapM78491h.put("content_id", str2);
                        mapM78491h.put("ops", item.getOps());
                    }
                    break;
                case 932115657:
                    if (topicType.equals("HASH_TAG")) {
                        mapM78491h.put("module_name", "hashtag");
                        mapM78491h.put("content_type", "hashtag");
                        UGCVideoHashTag hashTag = item.getHashTag();
                        if (hashTag == null || (referId = hashTag.getReferId()) == null) {
                            referId = "";
                        }
                        mapM78491h.put("content_id", referId);
                        UGCVideoHashTag hashTag2 = item.getHashTag();
                        if (hashTag2 != null && (title = hashTag2.getTitle()) != null) {
                            str2 = title;
                        }
                        mapM78491h.put(CampaignEx.JSON_KEY_TITLE, str2);
                    }
                    break;
                case 2033770325:
                    if (topicType.equals("VERTICAL_RANK")) {
                        mapM78491h.put("module_name", "verticalRank");
                        mapM78491h.put("content_type", "vertical_rank");
                        UGCVerticalRank verticalRank = item.getVerticalRank();
                        if (verticalRank != null && (id2 = verticalRank.getId()) != null) {
                            str2 = id2;
                        }
                        mapM78491h.put("content_id", str2);
                        mapM78491h.put("ops", item.getOps());
                    }
                    break;
            }
        }
        C14450a.f50860a.m65142e("/ugc_search/search_result", mapM78491h);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: w */
    public final void m78515w(SearchResultItem item, int i11, String str, SearchTab tab, SecondTab secondTab) {
        String ugcVideoId;
        String subjectId;
        String collectionId;
        String ops;
        UGCVideoBelongToCollection belongToCollection;
        String collectionId2;
        String referId;
        String title;
        String id2;
        String ops2;
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(tab, "tab");
        HashMap mapM78491h = m78491h();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        mapM78491h.put("keyword", str);
        mapM78491h.put(RequestParameters.POSITION, String.valueOf(i11));
        String strValueOf = String.valueOf(tab.getName());
        if (secondTab != null) {
            strValueOf = ((Object) strValueOf) + "/" + secondTab.getTagValue();
        }
        mapM78491h.put("page_tab_name", strValueOf);
        mapM78491h.put("content_type", "ugc_video");
        mapM78491h.put("search_from", String.valueOf(this.f60289f));
        String topicType = item.getTopicType();
        if (topicType != null) {
            switch (topicType.hashCode()) {
                case -1989652851:
                    if (topicType.equals("UGC_VIDEO")) {
                        mapM78491h.put("module_name", WebConstants.FIELD_ITEM);
                        UGCVideo video = item.getVideo();
                        if (video == null || (ugcVideoId = video.getUgcVideoId()) == null) {
                            ugcVideoId = "";
                        }
                        mapM78491h.put("content_id", ugcVideoId);
                        UGCVideo video2 = item.getVideo();
                        if (video2 == null || (subjectId = video2.getSubjectId()) == null) {
                            subjectId = "";
                        }
                        mapM78491h.put("refer_subject_id", subjectId);
                        UGCVideo video3 = item.getVideo();
                        if (video3 == null || (belongToCollection = video3.getBelongToCollection()) == null || (collectionId = belongToCollection.getCollectionId()) == null) {
                            collectionId = "";
                        }
                        mapM78491h.put("belong_to_collection_id", collectionId);
                        UGCVideo video4 = item.getVideo();
                        if (video4 != null && (ops = video4.getOps()) != null) {
                            str2 = ops;
                        }
                        mapM78491h.put("ops", str2);
                    }
                    break;
                case 511113132:
                    if (topicType.equals("UGC_COLLECTION")) {
                        mapM78491h.put("module_name", "collection");
                        UGCCollection collection = item.getCollection();
                        if (collection != null && (collectionId2 = collection.getCollectionId()) != null) {
                            str2 = collectionId2;
                        }
                        mapM78491h.put("content_id", str2);
                        mapM78491h.put("ops", item.getOps());
                    }
                    break;
                case 932115657:
                    if (topicType.equals("HASH_TAG")) {
                        mapM78491h.put("module_name", "hashtag");
                        UGCVideoHashTag hashTag = item.getHashTag();
                        if (hashTag == null || (referId = hashTag.getReferId()) == null) {
                            referId = "";
                        }
                        mapM78491h.put("content_id", referId);
                        UGCVideoHashTag hashTag2 = item.getHashTag();
                        if (hashTag2 != null && (title = hashTag2.getTitle()) != null) {
                            str2 = title;
                        }
                        mapM78491h.put(CampaignEx.JSON_KEY_TITLE, str2);
                        mapM78491h.put("ops", item.getOps());
                    }
                    break;
                case 2033770325:
                    if (topicType.equals("VERTICAL_RANK")) {
                        mapM78491h.put("module_name", "verticalRank");
                        UGCVerticalRank verticalRank = item.getVerticalRank();
                        if (verticalRank == null || (id2 = verticalRank.getId()) == null) {
                            id2 = "";
                        }
                        mapM78491h.put("content_id", id2);
                        UGCVideo video5 = item.getVideo();
                        if (video5 != null && (ops2 = video5.getOps()) != null) {
                            str2 = ops2;
                        }
                        mapM78491h.put("ops", str2);
                        mapM78491h.put("ops", item.getOps());
                    }
                    break;
            }
        }
        C14450a.f50860a.m65143f("/ugc_search/search_result", mapM78491h);
    }

    /* JADX INFO: renamed from: x */
    public final void m78516x(String searchResult, String str) {
        Intrinsics.m97802h(searchResult, "searchResult");
        HashMap mapM78491h = m78491h();
        mapM78491h.put("keyword", String.valueOf(this.f60290g));
        mapM78491h.put("search_from", String.valueOf(this.f60289f));
        mapM78491h.put("search_result", searchResult);
        if (str != null) {
            mapM78491h.put("ops", str);
        }
        C24662i.f75350a.m96874F(SearchHotFragment.PAGE_NAME, "search", mapM78491h);
    }

    /* JADX INFO: renamed from: y */
    public final void m78517y(UGCVideo ugcVideo, int i11, String str, SearchTab tab, SecondTab secondTab) {
        String collectionId;
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        Intrinsics.m97802h(tab, "tab");
        HashMap mapM78491h = m78491h();
        if (str == null) {
            str = "";
        }
        mapM78491h.put("keyword", str);
        mapM78491h.put(RequestParameters.POSITION, String.valueOf(i11));
        mapM78491h.put("content_type", "ugc_video");
        mapM78491h.put("module_name", WebConstants.FIELD_ITEM);
        String ugcVideoId = ugcVideo.getUgcVideoId();
        if (ugcVideoId == null) {
            ugcVideoId = "";
        }
        mapM78491h.put("content_id", ugcVideoId);
        String subjectId = ugcVideo.getSubjectId();
        if (subjectId == null) {
            subjectId = "";
        }
        mapM78491h.put("refer_subject_id", subjectId);
        UGCVideoBelongToCollection belongToCollection = ugcVideo.getBelongToCollection();
        if (belongToCollection == null || (collectionId = belongToCollection.getCollectionId()) == null) {
            collectionId = "";
        }
        mapM78491h.put("belong_to_collection_id", collectionId);
        String strValueOf = String.valueOf(tab.getName());
        if (secondTab != null) {
            strValueOf = ((Object) strValueOf) + "/" + secondTab.getTagValue();
        }
        mapM78491h.put("page_tab_name", strValueOf);
        mapM78491h.put("search_from", String.valueOf(this.f60289f));
        String ops = ugcVideo.getOps();
        mapM78491h.put("ops", ops != null ? ops : "");
        C14450a.f50860a.m65143f("/ugc_search/search_result", mapM78491h);
    }

    /* JADX INFO: renamed from: z */
    public final void m78518z(String str, SearchTab searchTab, SecondTab secondTab, String str2) {
        HashMap mapM78491h = m78491h();
        if (str == null) {
            str = "";
        }
        mapM78491h.put("keyword", str);
        String strValueOf = String.valueOf(searchTab != null ? searchTab.getName() : null);
        if (secondTab != null) {
            strValueOf = ((Object) strValueOf) + "/" + secondTab.getTagValue();
        }
        mapM78491h.put("page_tab_name", strValueOf);
        mapM78491h.put("module_name", "result_second_tab_click");
        mapM78491h.put("search_from", String.valueOf(this.f60289f));
        mapM78491h.put("content_type", "ugc_video");
        if (str2 == null) {
            str2 = "";
        }
        mapM78491h.put("ops", str2);
        C14450a.f50860a.m65143f("/ugc_search/search_result", mapM78491h);
    }
}
