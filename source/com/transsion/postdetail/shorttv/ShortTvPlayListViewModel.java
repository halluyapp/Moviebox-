package com.transsion.postdetail.shorttv;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.transsion.baselib.p291db.video.ShortTvFavoriteState;
import com.transsion.moviedetailapi.bean.ShortTVFavInfo;
import com.transsion.moviedetailapi.bean.Subject;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p349dh.C22982c;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTvPlayListViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: n */
    public static final C16865a f56737n = new C16865a(null);

    /* JADX INFO: renamed from: b */
    private final InterfaceC16870a f56738b;

    /* JADX INFO: renamed from: c */
    private final C3187b0 f56739c;

    /* JADX INFO: renamed from: d */
    private final C3187b0 f56740d;

    /* JADX INFO: renamed from: e */
    private final C3187b0 f56741e;

    /* JADX INFO: renamed from: f */
    private final C3187b0 f56742f;

    /* JADX INFO: renamed from: g */
    private final C3187b0 f56743g;

    /* JADX INFO: renamed from: h */
    private final C3187b0 f56744h;

    /* JADX INFO: renamed from: i */
    private final C3187b0 f56745i;

    /* JADX INFO: renamed from: j */
    private final C3187b0 f56746j;

    /* JADX INFO: renamed from: k */
    private final C3187b0 f56747k;

    /* JADX INFO: renamed from: l */
    private final C3187b0 f56748l;

    /* JADX INFO: renamed from: m */
    private final HashMap f56749m;

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv.ShortTvPlayListViewModel$a */
    public static final class C16865a {
        private C16865a() {
        }

        public /* synthetic */ C16865a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTvPlayListViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f56738b = (InterfaceC16870a) C22982c.f70163e.m91553a().m91552h(InterfaceC16870a.class);
        this.f56739c = new C3187b0();
        this.f56740d = new C3187b0();
        this.f56741e = new C3187b0();
        this.f56742f = new C3187b0();
        this.f56743g = new C3187b0();
        this.f56744h = new C3187b0();
        this.f56745i = new C3187b0();
        this.f56746j = new C3187b0();
        this.f56747k = new C3187b0();
        this.f56748l = new C3187b0();
        this.f56749m = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final void m73588k(Subject subject) {
        ShortTVFavInfo shortTVFavInfo;
        if (subject == null || (shortTVFavInfo = subject.getShortTVFavInfo()) == null) {
            return;
        }
        ShortTvFavoriteState shortTvFavoriteState = new ShortTvFavoriteState();
        shortTvFavoriteState.setFavoriteNum(shortTVFavInfo.getFavoriteNum());
        shortTvFavoriteState.setHasFavorite(shortTVFavInfo.getHasFavorite());
        shortTvFavoriteState.setFavoriteTime(shortTVFavInfo.getFavoriteTime());
        String subjectId = subject.getSubjectId();
        if (subjectId == null) {
            subjectId = "";
        }
        shortTvFavoriteState.setSubjectId(subjectId);
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ShortTvPlayListViewModel$updateFavorite$1$1(this, shortTvFavoriteState, null), 3, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m73589d(Subject subject) {
        ShortTVFavInfo shortTVFavInfo;
        if (subject == null || (shortTVFavInfo = subject.getShortTVFavInfo()) == null) {
            return;
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ShortTvPlayListViewModel$favorite$1(subject, shortTVFavInfo.getHasFavorite(), this, shortTVFavInfo, null), 3, null);
    }

    /* JADX INFO: renamed from: e */
    public final C3187b0 m73590e() {
        return this.f56742f;
    }

    /* JADX INFO: renamed from: f */
    public final C3187b0 m73591f() {
        return this.f56743g;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC16870a m73592g() {
        return this.f56738b;
    }

    /* JADX INFO: renamed from: h */
    public final C3187b0 m73593h() {
        return this.f56739c;
    }

    /* JADX INFO: renamed from: i */
    public final void m73594i(String type) {
        Intrinsics.m97802h(type, "type");
        this.f56745i.mo14858q(type);
    }

    /* JADX INFO: renamed from: j */
    public final void m73595j() {
        this.f56745i.mo14858q("ad_cancel");
    }
}
