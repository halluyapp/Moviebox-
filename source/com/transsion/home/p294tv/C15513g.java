package com.transsion.home.p294tv;

import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.C3187b0;
import com.transsion.home.p294tv.bean.Pager;
import com.transsion.home.p294tv.bean.StreamItem;
import com.transsion.home.p294tv.bean.TvChannelItem;
import com.transsion.home.p294tv.bean.TvChannelListDataBean;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p349dh.C22982c;
import p813ul.InterfaceC28023a;
import p871wg.AbstractC28362a;
import p871wg.C28365d;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.home.tv.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C15513g extends AbstractC3223t0 {

    /* JADX INFO: renamed from: f */
    public static final a f53521f = new a(null);

    /* JADX INFO: renamed from: g */
    public static final int f53522g = 8;

    /* JADX INFO: renamed from: d */
    private String f53526d;

    /* JADX INFO: renamed from: a */
    private final C3187b0 f53523a = new C3187b0();

    /* JADX INFO: renamed from: b */
    private final C3187b0 f53524b = new C3187b0();

    /* JADX INFO: renamed from: c */
    private boolean f53525c = true;

    /* JADX INFO: renamed from: e */
    private final Lazy f53527e = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.tv.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C15513g.m68750m();
        }
    });

    /* JADX INFO: renamed from: com.transsion.home.tv.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.tv.g$b */
    public static final class b extends AbstractC28362a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f53529e;

        b(String str) {
            this.f53529e = str;
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C26866a.f81698a.m104915i("TvLiveDetailViewModel", "fetchChannelList failed code=" + str + " msg=" + str2, true);
            C15513g.this.m68752f().mo14858q(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(TvChannelListDataBean tvChannelListDataBean) {
            Pager pager;
            List<TvChannelItem> items;
            Pager pager2;
            Pager pager3;
            Boolean hasMore = null;
            C15513g.this.f53526d = (!((tvChannelListDataBean == null || (pager3 = tvChannelListDataBean.getPager()) == null) ? false : Intrinsics.m97797c(pager3.getHasMore(), Boolean.TRUE)) || (pager2 = tvChannelListDataBean.getPager()) == null) ? null : pager2.getNextPage();
            C26866a.a aVar = C26866a.f81698a;
            String str = this.f53529e;
            Integer numValueOf = (tvChannelListDataBean == null || (items = tvChannelListDataBean.getItems()) == null) ? null : Integer.valueOf(items.size());
            if (tvChannelListDataBean != null && (pager = tvChannelListDataBean.getPager()) != null) {
                hasMore = pager.getHasMore();
            }
            aVar.m104912c("TvLiveDetailViewModel", "fetchChannelList success page=" + str + " size=" + numValueOf + " hasMore=" + hasMore, false);
            C15513g.this.m68752f().mo14858q(tvChannelListDataBean);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.tv.g$c */
    public static final class c extends AbstractC28362a {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f53530d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C15513g f53531e;

        c(String str, C15513g c15513g) {
            this.f53530d = str;
            this.f53531e = c15513g;
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C26866a.f81698a.m104915i("TvLiveDetailViewModel", "loadChannelDetail failed code=" + str + " msg=" + str2, true);
            this.f53531e.m68751e().mo14858q(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(TvChannelItem tvChannelItem) {
            List<StreamItem> streams;
            StreamItem streamItem;
            C26866a.f81698a.m104912c("TvLiveDetailViewModel", "loadChannelDetail success channelId=" + this.f53530d + " url=" + ((tvChannelItem == null || (streams = tvChannelItem.getStreams()) == null || (streamItem = (StreamItem) CollectionsKt.m97361k0(streams)) == null) ? null : streamItem.getUrl()), false);
            this.f53531e.m68751e().mo14858q(tvChannelItem);
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m68748d(String str, String str2) {
        m68749g().m108958d(str2, 20, str).m95079f(C28365d.f87067a.m109702c()).subscribe(new b(str2));
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC28023a m68749g() {
        return (InterfaceC28023a) this.f53527e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC28023a m68750m() {
        return (InterfaceC28023a) C22982c.f70163e.m91553a().m91552h(InterfaceC28023a.class);
    }

    /* JADX INFO: renamed from: e */
    public final C3187b0 m68751e() {
        return this.f53523a;
    }

    /* JADX INFO: renamed from: f */
    public final C3187b0 m68752f() {
        return this.f53524b;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m68753h() {
        String str = this.f53526d;
        return !(str == null || str.length() == 0);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m68754i() {
        return this.f53525c;
    }

    /* JADX INFO: renamed from: j */
    public final void m68755j(String channelId) {
        Intrinsics.m97802h(channelId, "channelId");
        m68749g().m108956b(channelId).m95079f(C28365d.f87067a.m109702c()).subscribe(new c(channelId, this));
    }

    /* JADX INFO: renamed from: k */
    public final void m68756k(String countryCode) {
        Intrinsics.m97802h(countryCode, "countryCode");
        String str = this.f53526d;
        if (str == null || str.length() == 0) {
            C26866a.f81698a.m104921x("TvLiveDetailViewModel", "loadMoreChannelList: nextPage is null, stop", false);
        } else {
            this.f53525c = false;
            m68748d(countryCode, str);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m68757l(String countryCode) {
        Intrinsics.m97802h(countryCode, "countryCode");
        this.f53525c = true;
        this.f53526d = null;
        m68748d(countryCode, "1");
    }
}
