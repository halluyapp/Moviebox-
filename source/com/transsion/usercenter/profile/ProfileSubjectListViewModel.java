package com.transsion.usercenter.profile;

import android.app.Application;
import android.os.Bundle;
import androidx.p1004lifecycle.AbstractC3225u0;
import com.cloud.tmc.integration.event.EventConstants;
import com.therouter.TheRouter;
import com.transsion.moviedetailapi.AbsSubjectListViewModel;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.moviedetailapi.bean.PostSubjectBean;
import com.transsion.moviedetailapi.p1002enum.PostListSource;
import com.transsion.moviedetailapi.p1002enum.ProfileSubSource;
import com.transsnet.flow.event.sync.event.PublishEvent;
import com.transsnet.loginapi.bean.UserInfo;
import io.reactivex.rxjava3.core.AbstractC24093j;
import io.reactivex.rxjava3.core.InterfaceC24096m;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p349dh.C22982c;
import p441gz.InterfaceC23704a;
import p666oz.InterfaceC26760h;
import p871wg.AbstractC28362a;
import p871wg.C28365d;

/* JADX INFO: loaded from: classes7.dex */
public final class ProfileSubjectListViewModel extends AbsSubjectListViewModel {

    /* JADX INFO: renamed from: k */
    private int f65144k;

    /* JADX INFO: renamed from: l */
    private String f65145l;

    /* JADX INFO: renamed from: m */
    private final Lazy f65146m;

    /* JADX INFO: renamed from: n */
    private final Lazy f65147n;

    /* JADX INFO: renamed from: o */
    private int f65148o;

    /* JADX INFO: renamed from: p */
    private String f65149p;

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.ProfileSubjectListViewModel$a */
    static final class C20636a implements InterfaceC26760h {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f65151b;

        C20636a(String str) {
            this.f65151b = str;
        }

        @Override // p666oz.InterfaceC26760h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC24096m apply(Integer it) {
            Intrinsics.m97802h(it, "it");
            if (ProfileSubjectListViewModel.this.f65144k == 0) {
                return ProfileSubjectListViewModel.this.m85242b0() ? InterfaceC20647b.a.m85294d(ProfileSubjectListViewModel.this.m85241a0(), this.f65151b, ProfileSubjectListViewModel.this.f65149p, ProfileSubjectListViewModel.this.m85248Z(), null, null, 24, null) : InterfaceC20647b.a.m85296f(ProfileSubjectListViewModel.this.m85241a0(), this.f65151b, ProfileSubjectListViewModel.this.f65149p, ProfileSubjectListViewModel.this.m85248Z(), null, null, 24, null);
            }
            return InterfaceC20647b.a.m85292b(ProfileSubjectListViewModel.this.m85241a0(), this.f65151b, ProfileSubjectListViewModel.this.f65149p, ProfileSubjectListViewModel.this.m85248Z(), null, 8, null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.ProfileSubjectListViewModel$b */
    public static final class C20637b extends AbstractC28362a {
        C20637b() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            ProfileSubjectListViewModel.this.m70964y().mo14858q(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(PostSubjectBean postSubjectBean) {
            String nextPage;
            Integer perPage;
            super.mo66458c(postSubjectBean);
            if (postSubjectBean != null) {
                ProfileSubjectListViewModel profileSubjectListViewModel = ProfileSubjectListViewModel.this;
                try {
                    Pager pager = postSubjectBean.getPager();
                    profileSubjectListViewModel.m85249h0((pager == null || (perPage = pager.getPerPage()) == null) ? 10 : perPage.intValue());
                    Pager pager2 = postSubjectBean.getPager();
                    if (pager2 == null || (nextPage = pager2.getNextPage()) == null) {
                        nextPage = "";
                    }
                    profileSubjectListViewModel.f65149p = nextPage;
                } catch (Exception unused) {
                }
            }
            ProfileSubjectListViewModel.this.m70964y().mo14858q(postSubjectBean);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileSubjectListViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f65146m = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.profile.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileSubjectListViewModel.m85245e0();
            }
        });
        this.f65147n = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.profile.k0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileSubjectListViewModel.m85246f0();
            }
        });
        this.f65148o = 10;
        this.f65149p = "";
    }

    /* JADX INFO: renamed from: Y */
    private final InterfaceC23704a m85240Y() {
        return (InterfaceC23704a) this.f65146m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public final InterfaceC20647b m85241a0() {
        return (InterfaceC20647b) this.f65147n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public final boolean m85242b0() {
        UserInfo userInfoMo90386h;
        String str = this.f65145l;
        if (str != null && str.length() != 0) {
            String str2 = this.f65145l;
            InterfaceC23704a interfaceC23704aM85240Y = m85240Y();
            if (!Intrinsics.m97797c(str2, (interfaceC23704aM85240Y == null || (userInfoMo90386h = interfaceC23704aM85240Y.mo90386h()) == null) ? null : userInfoMo90386h.getUserId())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    private final boolean m85243c0() {
        InterfaceC23704a interfaceC23704aM85240Y;
        UserInfo userInfoMo90386h;
        UserInfo userInfoMo90386h2;
        String userId = this.f65145l;
        String userId2 = null;
        if (userId == null) {
            InterfaceC23704a interfaceC23704aM85240Y2 = m85240Y();
            userId = (interfaceC23704aM85240Y2 == null || (userInfoMo90386h2 = interfaceC23704aM85240Y2.mo90386h()) == null) ? null : userInfoMo90386h2.getUserId();
            if (userId == null) {
                userId = "";
            }
        }
        if (userId.length() == 0) {
            return true;
        }
        InterfaceC23704a interfaceC23704aM85240Y3 = m85240Y();
        if (interfaceC23704aM85240Y3 != null && (userInfoMo90386h = interfaceC23704aM85240Y3.mo90386h()) != null) {
            userId2 = userInfoMo90386h.getUserId();
        }
        return Intrinsics.m97797c(userId, userId2) && ((interfaceC23704aM85240Y = m85240Y()) == null || !interfaceC23704aM85240Y.mo90379a());
    }

    /* JADX INFO: renamed from: d0 */
    private final void m85244d0(String str) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ProfileSubjectListViewModel$loadNewSubject$1(this, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final InterfaceC23704a m85245e0() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final InterfaceC20647b m85246f0() {
        return (InterfaceC20647b) C22982c.f70163e.m91553a().m91552h(InterfaceC20647b.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final Unit m85247g0(ProfileSubjectListViewModel profileSubjectListViewModel, PublishEvent it) {
        Intrinsics.m97802h(it, "it");
        profileSubjectListViewModel.m85244d0(it.getPostId());
        return Unit.f75682a;
    }

    @Override // com.transsion.moviedetailapi.AbsSubjectListViewModel
    /* JADX INFO: renamed from: A */
    public PostListSource mo69056A() {
        return PostListSource.PROFILE;
    }

    @Override // com.transsion.moviedetailapi.AbsSubjectListViewModel
    /* JADX INFO: renamed from: B */
    public ProfileSubSource mo70864B() {
        return this.f65144k == 0 ? ProfileSubSource.POSTS : ProfileSubSource.LIKES;
    }

    @Override // com.transsion.moviedetailapi.AbsSubjectListViewModel
    /* JADX INFO: renamed from: E */
    public void mo69057E(boolean z11) {
        UserInfo userInfoMo90386h;
        String userId = this.f65145l;
        if (userId == null) {
            InterfaceC23704a interfaceC23704aM85240Y = m85240Y();
            userId = (interfaceC23704aM85240Y == null || (userInfoMo90386h = interfaceC23704aM85240Y.mo90386h()) == null) ? null : userInfoMo90386h.getUserId();
            if (userId == null) {
                userId = "";
            }
        }
        if (m85243c0() && this.f65144k == 0) {
            m70964y().mo14858q(null);
        } else {
            AbstractC24093j.m95068t(Integer.valueOf(this.f65144k)).m95082n(new C20636a(userId)).m95079f(C28365d.f87067a.m109702c()).subscribe(new C20637b());
        }
    }

    @Override // com.transsion.moviedetailapi.AbsSubjectListViewModel
    /* JADX INFO: renamed from: F */
    public void mo69058F(Bundle bundle) {
        this.f65144k = bundle != null ? bundle.getInt(EventConstants.KEY_SOURCE) : 0;
        this.f65145l = bundle != null ? bundle.getString("userId") : null;
        if (this.f65144k == 0 && m85242b0() && !m85243c0()) {
            AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ProfileSubjectListViewModel$onCreate$$inlined$observeEvent$1(false, new Function1() { // from class: com.transsion.usercenter.profile.l0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProfileSubjectListViewModel.m85247g0(this.f65294a, (PublishEvent) obj);
                }
            }, null), 3, null);
        }
        this.f65149p = "0";
    }

    /* JADX INFO: renamed from: Z */
    public int m85248Z() {
        return this.f65148o;
    }

    /* JADX INFO: renamed from: h0 */
    public void m85249h0(int i11) {
        this.f65148o = i11;
    }

    @Override // com.transsion.moviedetailapi.AbsSubjectListViewModel
    /* JADX INFO: renamed from: w */
    public String mo69065w(int i11) {
        return this.f65144k == 0 ? "profiledetail_posts" : "profiledetail_likes";
    }
}
