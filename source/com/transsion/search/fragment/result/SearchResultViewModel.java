package com.transsion.search.fragment.result;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.google.gson.JsonObject;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.Staff;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.publish.model.PostEntity;
import com.transsion.search.bean.SearchList;
import com.transsion.search.bean.VerticalRank;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p349dh.C22982c;
import p355dr.InterfaceC23043g;
import p871wg.AbstractC28362a;
import p978zg.C29182a;
import pg.C26866a;
import tz.AbstractC27875a;

/* JADX INFO: loaded from: classes6.dex */
public final class SearchResultViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: b */
    private final Lazy f59873b;

    /* JADX INFO: renamed from: c */
    private final C3187b0 f59874c;

    /* JADX INFO: renamed from: d */
    private final C3187b0 f59875d;

    /* JADX INFO: renamed from: e */
    private final C3187b0 f59876e;

    /* JADX INFO: renamed from: f */
    private int f59877f;

    /* JADX INFO: renamed from: com.transsion.search.fragment.result.SearchResultViewModel$a */
    public static final class C18469a extends AbstractC28362a {
        C18469a() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C26866a.a.m104901l(C26866a.f81698a, "search", "SearchValuesFragment --> postRequestResource --> failed to post request resources " + str2, false, 4, null);
            SearchResultViewModel.this.m77903i().mo14855n(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(PostEntity postEntity) {
            if (postEntity != null) {
                SearchResultViewModel.this.m77903i().mo14855n(postEntity);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f59873b = LazyKt.m97097b(new Function0() { // from class: com.transsion.search.fragment.result.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultViewModel.m77902q();
            }
        });
        this.f59874c = new C3187b0();
        this.f59875d = new C3187b0();
        this.f59876e = new C3187b0();
        this.f59877f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final List m77898h(List list) {
        ArrayList arrayList = new ArrayList();
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SearchList searchList = (SearchList) it.next();
                String title = searchList.getTitle();
                if (title != null && title.length() != 0) {
                    arrayList.add(new ResultWrapData(ResultType.TITLE, null, null, null, null, searchList.getTitle(), null, 94, null));
                }
                List<Subject> subjects = searchList.getSubjects();
                if (subjects != null) {
                    Iterator<T> it2 = subjects.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new ResultWrapData(ResultType.SUBJECT, (Subject) it2.next(), null, null, null, null, null, Sdk$SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
                    }
                }
                List<Staff> staffs = searchList.getStaffs();
                if (staffs != null) {
                    Iterator<T> it3 = staffs.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(new ResultWrapData(ResultType.STAFF, null, (Staff) it3.next(), null, null, null, null, Sdk$SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, null));
                    }
                }
                List<Group> groups = searchList.getGroups();
                if (groups != null) {
                    Iterator<T> it4 = groups.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(new ResultWrapData(ResultType.GROUP, null, null, (Group) it4.next(), null, null, null, Sdk$SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, null));
                    }
                }
                List<VerticalRank> verticalRanks = searchList.getVerticalRanks();
                if (verticalRanks != null) {
                    Iterator<T> it5 = verticalRanks.iterator();
                    while (it5.hasNext()) {
                        arrayList.add(new ResultWrapData(ResultType.VERTICAL_RANK, null, null, null, (VerticalRank) it5.next(), null, null, 110, null));
                    }
                }
                if (Intrinsics.m97797c(searchList.getShowMore(), Boolean.TRUE)) {
                    arrayList.add(new ResultWrapData(ResultType.MORE, null, null, null, null, null, searchList.getMoreTabId(), 62, null));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC23043g m77899l() {
        return (InterfaceC23043g) this.f59873b.getValue();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m77900n(SearchResultViewModel searchResultViewModel, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        searchResultViewModel.m77906m(str, z11);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m77901p(SearchResultViewModel searchResultViewModel, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        searchResultViewModel.m77907o(str, str2, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final InterfaceC23043g m77902q() {
        return (InterfaceC23043g) C22982c.f70163e.m91553a().m91552h(InterfaceC23043g.class);
    }

    /* JADX INFO: renamed from: i */
    public final C3187b0 m77903i() {
        return this.f59876e;
    }

    /* JADX INFO: renamed from: j */
    public final C3187b0 m77904j() {
        return this.f59875d;
    }

    /* JADX INFO: renamed from: k */
    public final C3187b0 m77905k() {
        return this.f59874c;
    }

    /* JADX INFO: renamed from: m */
    public final void m77906m(String keyword, boolean z11) {
        Intrinsics.m97802h(keyword, "keyword");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(CampaignEx.JSON_KEY_AD_Q, keyword);
        jsonObject.addProperty("before", Boolean.valueOf(z11));
        RequestBody.Companion companion = RequestBody.INSTANCE;
        String string = jsonObject.toString();
        Intrinsics.m97801g(string, "toString(...)");
        m77899l().m91670f(C29182a.f89053a.m111992a(), companion.create(string, MediaType.INSTANCE.parse("application/json"))).m95073E(AbstractC27875a.m108402c()).subscribe(new C18469a());
    }

    /* JADX INFO: renamed from: o */
    public final void m77907o(String keyword, String str, boolean z11) {
        Intrinsics.m97802h(keyword, "keyword");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new SearchResultViewModel$requestSearchResult$1(this, keyword, str, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m77908r(int i11) {
        this.f59877f = i11;
    }
}
