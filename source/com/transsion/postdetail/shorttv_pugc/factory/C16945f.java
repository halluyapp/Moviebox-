package com.transsion.postdetail.shorttv_pugc.factory;

import android.os.Build;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.postdetail.util.UGCShortTVFloatManager;
import com.transsion.shorttv_pugc.ShorttvModel;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.videofloat.bean.FloatActionType;
import com.transsion.videofloat.bean.FloatPlayType;
import com.transsion.videofloat.manager.C21106a0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p723qx.C27136c;
import p723qx.InterfaceC27135b;
import p723qx.InterfaceC27138e;
import p755rx.C27425a;
import p824ux.InterfaceC28047a;
import p920xt.InterfaceC28660e;
import pg.C26866a;
import tt.C27851d;

/* JADX INFO: renamed from: com.transsion.postdetail.shorttv_pugc.factory.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C16945f implements InterfaceC28660e {

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv_pugc.factory.f$a */
    public static final class a implements InterfaceC28047a {
        a() {
        }

        @Override // p824ux.InterfaceC28047a
        /* JADX INFO: renamed from: a */
        public boolean mo70368a(C27425a c27425a) {
            return UGCShortTVFloatManager.f57816b.m74947m(c27425a);
        }

        @Override // p824ux.InterfaceC28047a
        /* JADX INFO: renamed from: b */
        public void mo70369b(C27425a c27425a) {
            UGCShortTVFloatManager uGCShortTVFloatManager = UGCShortTVFloatManager.f57816b;
            uGCShortTVFloatManager.m74945j();
            uGCShortTVFloatManager.m74948n(c27425a);
        }

        @Override // p824ux.InterfaceC28047a
        /* JADX INFO: renamed from: c */
        public void mo70370c(C27425a c27425a) {
            InterfaceC28047a.a.m109026a(this, c27425a);
            UGCShortTVFloatManager.f57816b.m74946k(c27425a);
        }
    }

    /* JADX INFO: renamed from: j */
    private final C27425a m73800j(C27851d c27851d) {
        ShorttvModel.UGCVideoCollection belongToCollection;
        ShorttvModel.UGCVideoCollection belongToCollection2;
        ShorttvModel.UGCVideoCollection belongToCollection3;
        ShorttvModel.UGCVideoCollection belongToCollection4;
        C27425a c27425a = new C27425a(c27851d.m108259g(), c27851d.m108255c(), null, FloatPlayType.SHORT_TV, "", -1, c27851d.m108253a(), "", c27851d.m108257e());
        c27425a.m106615J(Integer.valueOf(SubjectType.SHORT_TV.getValue()));
        c27425a.m106606A(c27851d.m108254b());
        c27425a.m106607B(c27851d.m108256d());
        ShorttvModel.UGCVideo uGCVideoM108260h = c27851d.m108260h();
        String collectionId = (uGCVideoM108260h == null || (belongToCollection4 = uGCVideoM108260h.getBelongToCollection()) == null) ? null : belongToCollection4.getCollectionId();
        ShorttvModel.UGCVideo uGCVideoM108260h2 = c27851d.m108260h();
        String collectionName = (uGCVideoM108260h2 == null || (belongToCollection3 = uGCVideoM108260h2.getBelongToCollection()) == null) ? null : belongToCollection3.getCollectionName();
        ShorttvModel.UGCVideo uGCVideoM108260h3 = c27851d.m108260h();
        Integer videoNum = (uGCVideoM108260h3 == null || (belongToCollection2 = uGCVideoM108260h3.getBelongToCollection()) == null) ? null : belongToCollection2.getVideoNum();
        ShorttvModel.UGCVideo uGCVideoM108260h4 = c27851d.m108260h();
        UGCVideoBelongToCollection uGCVideoBelongToCollection = new UGCVideoBelongToCollection(collectionId, collectionName, videoNum, (uGCVideoM108260h4 == null || (belongToCollection = uGCVideoM108260h4.getBelongToCollection()) == null) ? null : belongToCollection.getPosition(), null, 16, null);
        ShorttvModel.UGCVideo uGCVideoM108260h5 = c27851d.m108260h();
        String ugcVideoId = uGCVideoM108260h5 != null ? uGCVideoM108260h5.getUgcVideoId() : null;
        ShorttvModel.UGCVideo uGCVideoM108260h6 = c27851d.m108260h();
        String title = uGCVideoM108260h6 != null ? uGCVideoM108260h6.getTitle() : null;
        ShorttvModel.UGCVideo uGCVideoM108260h7 = c27851d.m108260h();
        String description = uGCVideoM108260h7 != null ? uGCVideoM108260h7.getDescription() : null;
        ShorttvModel.UGCVideo uGCVideoM108260h8 = c27851d.m108260h();
        String corner = uGCVideoM108260h8 != null ? uGCVideoM108260h8.getCorner() : null;
        ShorttvModel.UGCVideo uGCVideoM108260h9 = c27851d.m108260h();
        Long duration = uGCVideoM108260h9 != null ? uGCVideoM108260h9.getDuration() : null;
        ShorttvModel.UGCVideo uGCVideoM108260h10 = c27851d.m108260h();
        String watchNum = uGCVideoM108260h10 != null ? uGCVideoM108260h10.getWatchNum() : null;
        ShorttvModel.UGCVideo uGCVideoM108260h11 = c27851d.m108260h();
        String releaseDate = uGCVideoM108260h11 != null ? uGCVideoM108260h11.getReleaseDate() : null;
        ShorttvModel.UGCVideo uGCVideoM108260h12 = c27851d.m108260h();
        Long publishTime = uGCVideoM108260h12 != null ? uGCVideoM108260h12.getPublishTime() : null;
        ShorttvModel.UGCVideo uGCVideoM108260h13 = c27851d.m108260h();
        String category = uGCVideoM108260h13 != null ? uGCVideoM108260h13.getCategory() : null;
        ShorttvModel.UGCVideo uGCVideoM108260h14 = c27851d.m108260h();
        String ops = uGCVideoM108260h14 != null ? uGCVideoM108260h14.getOps() : null;
        ShorttvModel.UGCVideo uGCVideoM108260h15 = c27851d.m108260h();
        String subjectId = uGCVideoM108260h15 != null ? uGCVideoM108260h15.getSubjectId() : null;
        ShorttvModel.UGCVideo uGCVideoM108260h16 = c27851d.m108260h();
        List<String> country = uGCVideoM108260h16 != null ? uGCVideoM108260h16.getCountry() : null;
        ShorttvModel.UGCVideo uGCVideoM108260h17 = c27851d.m108260h();
        c27425a.m106617L(new UGCVideo(ugcVideoId, title, description, null, null, null, corner, duration, watchNum, releaseDate, publishTime, category, null, null, uGCVideoBelongToCollection, ops, subjectId, country, null, null, null, null, null, uGCVideoM108260h17 != null ? uGCVideoM108260h17.getRestrictKid() : 0, false, null, null, null, null, 528232504, null));
        return c27425a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final Unit m73801k(FragmentActivity fragmentActivity, boolean z11) {
        if (z11) {
            fragmentActivity.finish();
        }
        return Unit.f75682a;
    }

    @Override // p920xt.InterfaceC28660e
    /* JADX INFO: renamed from: a */
    public void mo73802a(FragmentActivity activity, boolean z11, boolean z12, ViewGroup viewGroup) {
        Intrinsics.m97802h(activity, "activity");
        InterfaceC27138e.a aVar = InterfaceC27138e.f82251a;
        if (aVar.m105606b().mo86568c() && C14496b.f50966a.m65344b().getBoolean("k_pip_enable", true)) {
            aVar.m105606b().mo86566a(activity, true, z12, viewGroup);
        }
    }

    @Override // p920xt.InterfaceC28660e
    /* JADX INFO: renamed from: b */
    public void mo73803b(FragmentActivity activity, String ugcVideoId, String pageName, String str) {
        Intrinsics.m97802h(activity, "activity");
        Intrinsics.m97802h(ugcVideoId, "ugcVideoId");
        Intrinsics.m97802h(pageName, "pageName");
        InterfaceC27135b.f82245a.m105597c().mo86624e(activity, null, ugcVideoId, pageName, str);
    }

    @Override // p920xt.InterfaceC28660e
    /* JADX INFO: renamed from: c */
    public void mo73804c() {
        InterfaceC27135b.b.m105599a(InterfaceC27135b.f82245a.m105597c(), false, 1, null);
    }

    @Override // p920xt.InterfaceC28660e
    /* JADX INFO: renamed from: d */
    public InterfaceC16634g mo73805d(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return C21106a0.f66016a.m86578b(UGCShortTVFloatManager.f57816b.m74944h(str));
    }

    @Override // p920xt.InterfaceC28660e
    /* JADX INFO: renamed from: e */
    public boolean mo73806e(InterfaceC16634g interfaceC16634g) {
        return C21106a0.f66016a.m86579c(interfaceC16634g);
    }

    @Override // p920xt.InterfaceC28660e
    /* JADX INFO: renamed from: f */
    public boolean mo73807f(InterfaceC16634g interfaceC16634g) {
        return C27136c.f82250a.m105602c(interfaceC16634g);
    }

    @Override // p920xt.InterfaceC28660e
    /* JADX INFO: renamed from: g */
    public void mo73808g(final FragmentActivity activity, C27851d bean) {
        Intrinsics.m97802h(activity, "activity");
        Intrinsics.m97802h(bean, "bean");
        C27425a c27425aM73800j = m73800j(bean);
        if (!C14496b.f50966a.m65344b().getBoolean("k_pip_enable", true)) {
            C26866a.f81698a.m104912c("VideoFloat", "shottv 设置页pip开关被关闭了", true);
            return;
        }
        InterfaceC27138e.a aVar = InterfaceC27138e.f82251a;
        if (aVar.m105606b().mo86568c()) {
            C26866a.f81698a.m104912c("VideoFloat-pip", "shottv 当前可用画中画，使用画中画播放", true);
            aVar.m105606b().mo86574i(activity, c27425aM73800j, FloatActionType.HOME, false);
        } else {
            UGCShortTVFloatManager.f57816b.m74949q(bean.m108258f());
            InterfaceC27135b.f82245a.m105597c().mo86626g(activity, c27425aM73800j, false, false, new Function1() { // from class: com.transsion.postdetail.shorttv_pugc.factory.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C16945f.m73801k(activity, ((Boolean) obj).booleanValue());
                }
            }, new a());
        }
    }

    @Override // p920xt.InterfaceC28660e
    /* JADX INFO: renamed from: h */
    public void mo73809h(boolean z11, FragmentActivity fragmentActivity, C27851d bean) {
        Intrinsics.m97802h(bean, "bean");
        if (z11) {
            if (fragmentActivity == null || fragmentActivity.isDestroyed() || fragmentActivity.isFinishing()) {
                return;
            }
            C27425a c27425aM73800j = m73800j(bean);
            if (Build.VERSION.SDK_INT >= 31) {
                InterfaceC27138e.f82251a.m105606b().mo86572g(fragmentActivity, c27425aM73800j);
            }
        }
        InterfaceC27138e.f82251a.m105606b().onPipModeChanged(z11);
    }
}
