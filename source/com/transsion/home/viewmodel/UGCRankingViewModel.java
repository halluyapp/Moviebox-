package com.transsion.home.viewmodel;

import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.transsion.home.bean.UGCRankAllData;
import com.transsion.ugcvideodetail.api.bean.UGCCollection;
import com.transsion.ugcvideodetail.api.bean.UGCContent;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import pg.C26866a;
import sl.InterfaceC27630d;

/* JADX INFO: loaded from: classes5.dex */
public final class UGCRankingViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: g */
    public static final C15547a f53708g = new C15547a(null);

    /* JADX INFO: renamed from: h */
    public static final int f53709h = 8;

    /* JADX INFO: renamed from: e */
    private String f53714e;

    /* JADX INFO: renamed from: a */
    private final C3187b0 f53710a = new C3187b0();

    /* JADX INFO: renamed from: b */
    private final C3187b0 f53711b = new C3187b0();

    /* JADX INFO: renamed from: c */
    private String f53712c = "1";

    /* JADX INFO: renamed from: d */
    private final InterfaceC27630d f53713d = (InterfaceC27630d) C22982c.f70163e.m91553a().m91552h(InterfaceC27630d.class);

    /* JADX INFO: renamed from: f */
    private String f53715f = "";

    /* JADX INFO: renamed from: com.transsion.home.viewmodel.UGCRankingViewModel$a */
    public static final class C15547a {
        private C15547a() {
        }

        public /* synthetic */ C15547a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final void m69102i(UGCRankAllData uGCRankAllData) {
        ArrayList arrayList;
        if (uGCRankAllData != null) {
            List<UGCContent> items = uGCRankAllData.getItems();
            if (items != null) {
                arrayList = new ArrayList();
                for (Object obj : items) {
                    UGCContent uGCContent = (UGCContent) obj;
                    if (Intrinsics.m97797c(uGCContent.getTopicType(), "UGC_VIDEO") && uGCContent.getVideo() != null) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            uGCRankAllData.setItems(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m69103o(UGCRankAllData uGCRankAllData) {
        List<UGCContent> items;
        String ops;
        String ops2;
        String ops3 = uGCRankAllData != null ? uGCRankAllData.getOps() : null;
        if (ops3 == null || ops3.length() == 0 || uGCRankAllData == null || (items = uGCRankAllData.getItems()) == null) {
            return;
        }
        for (UGCContent uGCContent : items) {
            UGCVideo video = uGCContent.getVideo();
            UGCCollection collection = uGCContent.getCollection();
            if (video != null && ((ops2 = video.getOps()) == null || ops2.length() == 0)) {
                video.setOps(ops3);
            }
            if (collection != null && ((ops = collection.getOps()) == null || ops.length() == 0)) {
                collection.setOps(ops3);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m69104p(boolean z11) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new UGCRankingViewModel$startRequest$1(z11, this, null), 2, null);
    }

    /* JADX INFO: renamed from: j */
    public final C3187b0 m69105j() {
        return this.f53711b;
    }

    /* JADX INFO: renamed from: k */
    public final C3187b0 m69106k() {
        return this.f53710a;
    }

    /* JADX INFO: renamed from: l */
    public final void m69107l(String str, String tabId) {
        Intrinsics.m97802h(tabId, "tabId");
        C26866a.a.m104898f(C26866a.f81698a, "UGCRankingViewModel", "getRankData: category=" + str + ", tabId=" + tabId, false, 4, null);
        this.f53714e = str;
        this.f53715f = tabId;
        this.f53712c = "1";
        m69104p(false);
    }

    /* JADX INFO: renamed from: m */
    public final void m69108m() {
        C26866a.a.m104898f(C26866a.f81698a, "UGCRankingViewModel", "loadMore: currentPage=" + this.f53712c, false, 4, null);
        m69104p(true);
    }

    /* JADX INFO: renamed from: n */
    public final void m69109n() {
        C26866a.a.m104898f(C26866a.f81698a, "UGCRankingViewModel", "refresh: category=" + this.f53714e + ", tabId=" + this.f53715f, false, 4, null);
        this.f53712c = "1";
        m69104p(false);
    }
}
