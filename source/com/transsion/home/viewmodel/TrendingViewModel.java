package com.transsion.home.viewmodel;

import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import ch.C5096b;
import com.blankj.utilcode.util.AbstractC5796o;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baselib.report.C14489h;
import com.transsion.home.bean.RoomEntranceResponse;
import com.transsion.home.bean.TrendingRequestEntity;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.moviedetailapi.AbsSubjectListViewModel;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.p1002enum.PostListSource;
import com.transsion.web.api.WebConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import p842vl.C28123e;
import p946yj.C28958a;
import p946yj.C28959b;
import pg.C26866a;
import sl.InterfaceC27631e;

/* JADX INFO: loaded from: classes.dex */
public final class TrendingViewModel extends AbsSubjectListViewModel {

    /* JADX INFO: renamed from: p */
    public static final C15544a f53685p = new C15544a(null);

    /* JADX INFO: renamed from: q */
    public static final int f53686q = 8;

    /* JADX INFO: renamed from: k */
    private final Lazy f53687k;

    /* JADX INFO: renamed from: l */
    private final Lazy f53688l;

    /* JADX INFO: renamed from: m */
    private final Lazy f53689m;

    /* JADX INFO: renamed from: n */
    private int f53690n;

    /* JADX INFO: renamed from: o */
    private final InterfaceC27631e f53691o;

    /* JADX INFO: renamed from: com.transsion.home.viewmodel.TrendingViewModel$a */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class C15544a {
        private C15544a() {
        }

        public /* synthetic */ C15544a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrendingViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f53687k = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrendingViewModel.m69055c0();
            }
        });
        this.f53688l = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrendingViewModel.m69053Z();
            }
        });
        this.f53689m = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrendingViewModel.m69054b0();
            }
        });
        this.f53690n = 12;
        this.f53691o = (InterfaceC27631e) C22982c.f70163e.m91553a().m91552h(InterfaceC27631e.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final Unit m69052U(TrendingViewModel trendingViewModel) {
        String string = C28123e.f86305a.m109233b().getString("trending_room_entrance_cache_v2", "");
        if (string == null || string.length() == 0) {
            C26866a.f81698a.m104912c("TrendingViewModel", "fetchGroupInfo failed without cache", true);
        } else {
            trendingViewModel.m69061W().mo14855n((RoomEntranceResponse) AbstractC5796o.m27441d(string, RoomEntranceResponse.class));
            C26866a.f81698a.m104912c("TrendingViewModel", "fetchGroupInfo use cache", true);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C3187b0 m69053Z() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C3187b0 m69054b0() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C3187b0 m69055c0() {
        return new C3187b0();
    }

    @Override // com.transsion.moviedetailapi.AbsSubjectListViewModel
    /* JADX INFO: renamed from: A */
    public PostListSource mo69056A() {
        return PostListSource.POSTLIST;
    }

    @Override // com.transsion.moviedetailapi.AbsSubjectListViewModel
    /* JADX INFO: renamed from: E */
    public void mo69057E(boolean z11) {
    }

    @Override // com.transsion.moviedetailapi.AbsSubjectListViewModel
    /* JADX INFO: renamed from: F */
    public void mo69058F(Bundle bundle) {
    }

    /* JADX INFO: renamed from: T */
    public final void m69059T(boolean z11) {
        Function0 function0 = new Function0() { // from class: com.transsion.home.viewmodel.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrendingViewModel.m69052U(this.f53735a);
            }
        };
        if (z11) {
            function0.invoke();
        } else {
            AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new TrendingViewModel$fetchGroupInfo$1(this, function0, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: V */
    public final C3187b0 m69060V() {
        return (C3187b0) this.f53688l.getValue();
    }

    /* JADX INFO: renamed from: W */
    public final C3187b0 m69061W() {
        return (C3187b0) this.f53689m.getValue();
    }

    /* JADX INFO: renamed from: X */
    public final C3187b0 m69062X() {
        return (C3187b0) this.f53687k.getValue();
    }

    /* JADX INFO: renamed from: Y */
    public final void m69063Y(String nextPage, int i11, boolean z11) {
        String string;
        Intrinsics.m97802h(nextPage, "nextPage");
        TrendingRequestEntity trendingRequestEntity = new TrendingRequestEntity();
        trendingRequestEntity.setPage(nextPage);
        trendingRequestEntity.setPerPage(i11);
        trendingRequestEntity.setSessionId(C5096b.f17579a.m23868h());
        Uri uriM65300c = C14489h.f50945a.m65300c();
        if (uriM65300c == null || (string = uriM65300c.toString()) == null) {
            string = "";
        }
        trendingRequestEntity.setDeepLink(string);
        trendingRequestEntity.setLatest_events(new C28958a(C28959b.f88597a.m111468e()));
        trendingRequestEntity.setTabId(String.valueOf(HomeTabId.Trending.getValue()));
        trendingRequestEntity.setDisablePlaylist(Boolean.valueOf(z11));
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new TrendingViewModel$getTrendingList$1(trendingRequestEntity, this, nextPage, null), 2, null);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m69064a0(Subject subject, int i11, String moduleName) {
        Intrinsics.m97802h(subject, "subject");
        Intrinsics.m97802h(moduleName, "moduleName");
        HashMap map = new HashMap();
        map.put("module_name", moduleName);
        String subjectId = subject.getSubjectId();
        if (subjectId == null) {
            subjectId = "";
        }
        map.put("subject_id", subjectId);
        map.put("has_resource", String.valueOf(subject.getHasResource()));
        map.put("item_type", "rec");
        String title = subject.getTitle();
        if (title == null) {
            title = "";
        }
        map.put(CampaignEx.JSON_KEY_TITLE, title);
        String ops = subject.getOps();
        if (ops == null) {
            ops = "";
        }
        map.put("ops", ops);
        map.put(WebConstants.PAGE_FROM, m70962v());
        map.put("sequence", String.valueOf(i11));
        Map mapM70961u = m70961u(m70960t().ordinal());
        if (mapM70961u != null) {
            for (Map.Entry entry : mapM70961u.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str2 == null) {
                    str2 = "";
                }
                map.put(str, str2);
            }
        }
        C14450a.f50860a.m65144g(mo69065w(m70960t().ordinal()), map);
    }

    @Override // com.transsion.moviedetailapi.AbsSubjectListViewModel
    /* JADX INFO: renamed from: w */
    public String mo69065w(int i11) {
        return "Trending";
    }
}
