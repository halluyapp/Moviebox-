package com.transsion.usercenter.p321me;

import android.app.Application;
import android.content.res.Resources;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import ck.C5110g;
import ck.C5118o;
import com.blankj.utilcode.util.AbstractC5796o;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.p278ts.PsExtractor;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$drawable;
import com.therouter.TheRouter;
import com.transsion.baselib.kids.KidsAccountManager;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.video.ShortTVPlayDao;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayDao;
import com.transsion.baselib.p291db.video.VideoDetailPlayDao;
import com.transsion.memberapi.MemberInfo;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.push.PushConstants;
import com.transsion.usercenter.R$string;
import com.transsion.usercenter.profile.InterfaceC20647b;
import com.transsion.usercenter.profile.InterfaceC20652d;
import com.transsion.usercenter.profile.bean.BffFavoriteInfo;
import com.transsion.usercenter.profile.bean.CountInfo;
import com.transsion.usercenter.profile.bean.IconItemInfo;
import com.transsion.usercenter.profile.bean.MeHistoryInfo;
import com.transsion.usercenter.profile.bean.MeItemInfo;
import com.transsion.usercenter.profile.bean.MineNoticeConfig;
import com.transsion.usercenter.profile.bean.MineNovel;
import com.transsion.usercenter.profile.bean.MinePageInfo;
import com.transsion.usercenter.profile.bean.MyGroup;
import com.transsion.usercenter.profile.bean.MySubject;
import com.transsion.usercenter.profile.bean.SubscribeInfo;
import com.transsion.usercenter.profile.bean.ZeroConfig;
import com.transsion.usercenter.profile.bean.ZeroInfo;
import com.transsnet.loginapi.bean.UserInfo;
import fk.AbstractC23384a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25204t1;
import p349dh.C22982c;
import p441gz.InterfaceC23704a;
import p851vw.C28230b;
import p913xm.C28615f;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
public final class MeViewmodel extends AbstractC3186b {

    /* JADX INFO: renamed from: q */
    public static final C20562a f64962q = new C20562a(null);

    /* JADX INFO: renamed from: b */
    private final Lazy f64963b;

    /* JADX INFO: renamed from: c */
    private final Lazy f64964c;

    /* JADX INFO: renamed from: d */
    private final List f64965d;

    /* JADX INFO: renamed from: e */
    private ZeroConfig f64966e;

    /* JADX INFO: renamed from: f */
    private final Lazy f64967f;

    /* JADX INFO: renamed from: g */
    private MineNoticeConfig f64968g;

    /* JADX INFO: renamed from: h */
    private final int f64969h;

    /* JADX INFO: renamed from: i */
    private final C3187b0 f64970i;

    /* JADX INFO: renamed from: j */
    private volatile List f64971j;

    /* JADX INFO: renamed from: k */
    private final Lazy f64972k;

    /* JADX INFO: renamed from: l */
    private final Lazy f64973l;

    /* JADX INFO: renamed from: m */
    private final Lazy f64974m;

    /* JADX INFO: renamed from: n */
    private MinePageInfo f64975n;

    /* JADX INFO: renamed from: o */
    private final C3187b0 f64976o;

    /* JADX INFO: renamed from: p */
    private InterfaceC25204t1 f64977p;

    /* JADX INFO: renamed from: com.transsion.usercenter.me.MeViewmodel$a */
    public static final class C20562a {
        private C20562a() {
        }

        public /* synthetic */ C20562a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeViewmodel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f64963b = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.me.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MeViewmodel.m84966K();
            }
        });
        this.f64964c = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.me.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MeViewmodel.m84965J();
            }
        });
        this.f64965d = new ArrayList();
        this.f64967f = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.me.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MeViewmodel.m84967L();
            }
        });
        this.f64969h = 10;
        this.f64970i = new C3187b0();
        this.f64971j = new ArrayList();
        this.f64972k = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.me.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MeViewmodel.m84972Q();
            }
        });
        this.f64973l = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.me.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MeViewmodel.m84970O();
            }
        });
        this.f64974m = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.me.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MeViewmodel.m84971P();
            }
        });
        this.f64976o = new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final InterfaceC23704a m84958B() {
        return (InterfaceC23704a) this.f64964c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final InterfaceC20647b m84959C() {
        return (InterfaceC20647b) this.f64963b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final InterfaceC20652d m84960D() {
        return (InterfaceC20652d) this.f64967f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final void m84961F() {
        try {
            Result.Companion companion = Result.INSTANCE;
            ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("mine_notice_config_key", true);
            this.f64968g = (MineNoticeConfig) AbstractC5796o.m27442e(configBeanM110360c != null ? configBeanM110360c.getValue() : null, AbstractC5796o.m27445h(MineNoticeConfig.class, new Type[0]));
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final ShortTVPlayDao m84962G() {
        return (ShortTVPlayDao) this.f64973l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public final UGCVideoDetailPlayDao m84963H() {
        return (UGCVideoDetailPlayDao) this.f64974m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final VideoDetailPlayDao m84964I() {
        return (VideoDetailPlayDao) this.f64972k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final InterfaceC23704a m84965J() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final InterfaceC20647b m84966K() {
        return (InterfaceC20647b) C22982c.f70163e.m91553a().m91552h(InterfaceC20647b.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final InterfaceC20652d m84967L() {
        return (InterfaceC20652d) C28230b.f86832c.m109422a().m109421e(InterfaceC20652d.class);
    }

    /* JADX INFO: renamed from: M */
    private final void m84968M() {
        UserInfo userInfoMo90386h;
        ArrayList arrayList = new ArrayList();
        Resources resources = Utils.m27275a().getResources();
        MinePageInfo minePageInfo = this.f64975n;
        if (minePageInfo == null || (userInfoMo90386h = minePageInfo.getUserInfo()) == null) {
            InterfaceC23704a interfaceC23704aM84958B = m84958B();
            userInfoMo90386h = interfaceC23704aM84958B != null ? interfaceC23704aM84958B.mo90386h() : null;
        }
        arrayList.add(new MeItemInfo(1, userInfoMo90386h));
        arrayList.add(new MeItemInfo(4, new MeHistoryInfo(this.f64971j)));
        arrayList.add(new MeItemInfo(5, new IconItemInfo(resources.getString(R$string.user_switch_profile), null, "study_mode_type", R$drawable.ic_me_switch_profile, com.transsion.baseui.R$drawable.bg_radius_bottom_6_color_white_6p, false, 0, false, "study_mode", 224, null)));
        this.f64976o.mo14855n(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public final void m84969N() {
        UserInfo userInfoMo90386h;
        String bottomContent;
        String noticeContent;
        SubscribeInfo subscribeInfo;
        Integer subscribeCount;
        CountInfo myComment;
        CountInfo myLike;
        CountInfo myPost;
        BffFavoriteInfo favoriteInfo;
        Integer favoriteCount;
        MySubject mySubject;
        MyGroup myGroup;
        C5118o c5118o = C5118o.f17608a;
        if (c5118o.m23948i()) {
            m84968M();
            return;
        }
        ArrayList arrayList = new ArrayList();
        MinePageInfo minePageInfo = this.f64975n;
        Resources resources = Utils.m27275a().getResources();
        if (minePageInfo == null || (userInfoMo90386h = minePageInfo.getUserInfo()) == null) {
            InterfaceC23704a interfaceC23704aM84958B = m84958B();
            userInfoMo90386h = interfaceC23704aM84958B != null ? interfaceC23704aM84958B.mo90386h() : null;
        }
        MemberInfo vipInfo = minePageInfo != null ? minePageInfo.getVipInfo() : null;
        MineNovel novelEntry = minePageInfo != null ? minePageInfo.getNovelEntry() : null;
        int iIntValue = 0;
        int count = (minePageInfo == null || (myGroup = minePageInfo.getMyGroup()) == null) ? 0 : myGroup.getCount();
        int wantToSeeCount = (minePageInfo == null || (mySubject = minePageInfo.getMySubject()) == null) ? 0 : mySubject.getWantToSeeCount();
        int iIntValue2 = (minePageInfo == null || (favoriteInfo = minePageInfo.getFavoriteInfo()) == null || (favoriteCount = favoriteInfo.getFavoriteCount()) == null) ? 0 : favoriteCount.intValue();
        int count2 = (minePageInfo == null || (myPost = minePageInfo.getMyPost()) == null) ? 0 : myPost.getCount();
        int count3 = (minePageInfo == null || (myLike = minePageInfo.getMyLike()) == null) ? 0 : myLike.getCount();
        int count4 = (minePageInfo == null || (myComment = minePageInfo.getMyComment()) == null) ? 0 : myComment.getCount();
        if (minePageInfo != null && (subscribeInfo = minePageInfo.getSubscribeInfo()) != null && (subscribeCount = subscribeInfo.getSubscribeCount()) != null) {
            iIntValue = subscribeCount.intValue();
        }
        arrayList.add(new MeItemInfo(1, userInfoMo90386h));
        MineNoticeConfig mineNoticeConfig = this.f64968g;
        if (mineNoticeConfig != null && mineNoticeConfig.getNoticeEnable() && (noticeContent = mineNoticeConfig.getNoticeContent()) != null && noticeContent.length() != 0) {
            arrayList.add(new MeItemInfo(8, mineNoticeConfig));
        }
        if (vipInfo != null) {
            arrayList.add(new MeItemInfo(2, vipInfo));
        }
        arrayList.add(new MeItemInfo(11, null));
        ZeroInfo zeroInfo = (ZeroInfo) CollectionsKt.m97361k0(this.f64965d);
        if (zeroInfo != null) {
            arrayList.add(new MeItemInfo(3, zeroInfo));
        }
        if (novelEntry != null) {
            arrayList.add(new MeItemInfo(7, novelEntry));
        }
        C5110g c5110g = C5110g.f17601a;
        String str = c5110g.m23911b() ? "/postdetail/favorite" : "/profile/see";
        if (c5110g.m23911b()) {
            wantToSeeCount = iIntValue2;
        }
        arrayList.add(new MeItemInfo(5, new IconItemInfo(resources.getString(R$string.profile_your_list), String.valueOf(wantToSeeCount), "oneroom://com.community.oneroom" + str, R$drawable.ic_me_my_list, com.transsion.baseui.R$drawable.bg_radius_top_6_color_white_6p, true, AbstractC23384a.m92908b(8), false, "want_to_see", 128, null)));
        arrayList.add(new MeItemInfo(5, new IconItemInfo(resources.getString(com.p282tn.lib.widget.R$string.my_likes), String.valueOf(count3), "like_list_type", R$drawable.ic_me_likes, R$color.white_6, true, 0, false, "like", PsExtractor.AUDIO_STREAM, null)));
        if (c5110g.m23911b()) {
            arrayList.add(new MeItemInfo(5, new IconItemInfo(resources.getString(R$string.profile_my_subscribers), String.valueOf(iIntValue), "subscribe_list_type", R$drawable.ic_me_subscriptions, R$color.white_6, true, 0, false, PushConstants.TOPIC_SUBSCRIBE, PsExtractor.AUDIO_STREAM, null)));
        }
        arrayList.add(new MeItemInfo(4, new MeHistoryInfo(this.f64971j)));
        arrayList.add(new MeItemInfo(6, null));
        String string = resources.getString(R$string.profile_my_room);
        String strValueOf = String.valueOf(count);
        InterfaceC23704a interfaceC23704aM84958B2 = m84958B();
        arrayList.add(new MeItemInfo(5, new IconItemInfo(string, strValueOf, (interfaceC23704aM84958B2 == null || !interfaceC23704aM84958B2.mo90379a()) ? "oneroom://com.community.oneroom/room/list?index=1" : "oneroom://com.community.oneroom/room/list", R$drawable.ic_me_room, com.transsion.baseui.R$drawable.bg_radius_top_6_color_white_6p, true, AbstractC23384a.m92908b(8), false, "myrooms")));
        if (!c5110g.m23911b()) {
            arrayList.add(new MeItemInfo(5, new IconItemInfo(resources.getString(R$string.profile_post), String.valueOf(count2), "post_list_type", R$drawable.ic_mine_post, R$color.white_6, true, 0, true, "post", 64, null)));
        }
        arrayList.add(new MeItemInfo(5, new IconItemInfo(resources.getString(com.transsion.baseui.R$string.my_comments), String.valueOf(count4), "oneroom://com.community.oneroom/post/my_comment", R$drawable.ic_me_comments, com.transsion.baseui.R$drawable.bg_radius_bottom_6_color_white_6p, false, 0, true, "comments", 96, null)));
        arrayList.add(new MeItemInfo(5, new IconItemInfo(resources.getString(R$string.user_setting), null, "oneroom://com.community.oneroom/profile/setting", R$drawable.ic_me_setting, com.transsion.baseui.R$drawable.bg_radius_top_6_color_white_6p, true, AbstractC23384a.m92908b(8), false, "setting", 128, null)));
        KidsAccountManager kidsAccountManager = KidsAccountManager.f50883a;
        String strM65180e = kidsAccountManager.m65180e();
        if (strM65180e != null && strM65180e.length() != 0 && c5118o.m23949j()) {
            arrayList.add(new MeItemInfo(5, new IconItemInfo(resources.getString(R$string.user_parental_pin), resources.getString(!kidsAccountManager.m65183i() ? R$string.user_parental_pin_hint : R$string.user_parental_pin_hint_on), "parental_pin_type", R$drawable.ic_user_kids_settings_pin, R$color.white_6, true, 0, false, "parental_pin", PsExtractor.AUDIO_STREAM, null)));
        }
        if (c5118o.m23949j()) {
            arrayList.add(new MeItemInfo(5, new IconItemInfo(resources.getString(R$string.user_safe_kids), resources.getString((strM65180e == null || strM65180e.length() == 0) ? R$string.user_create_study_profile : R$string.user_switch_profile), "study_mode_type", R$drawable.ic_me_study_mode, R$color.white_6, true, 0, false, "study_mode", PsExtractor.AUDIO_STREAM, null)));
        }
        arrayList.add(new MeItemInfo(5, new IconItemInfo(resources.getString(R$string.user_setting_feedback), null, "oneroom://com.community.oneroom/profile/user_center_labels_feedback", R$drawable.ic_me_feedback, com.transsion.baseui.R$drawable.bg_radius_bottom_6_color_white_6p, false, 0, false, TmcConstants.MENU_KEY_FEEDBACK, 224, null)));
        MineNoticeConfig mineNoticeConfig2 = this.f64968g;
        if (mineNoticeConfig2 != null && (bottomContent = mineNoticeConfig2.getBottomContent()) != null && bottomContent.length() != 0) {
            arrayList.add(new MeItemInfo(9, mineNoticeConfig2));
        }
        this.f64976o.mo14855n(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final ShortTVPlayDao m84970O() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64875v1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final UGCVideoDetailPlayDao m84971P() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64864A1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final VideoDetailPlayDao m84972Q() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64865B1();
    }

    /* JADX INFO: renamed from: z */
    private final void m84993z() {
        try {
            Result.Companion companion = Result.INSTANCE;
            ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("free_buy_config", true);
            this.f64966e = (ZeroConfig) AbstractC5796o.m27442e(configBeanM110360c != null ? configBeanM110360c.getValue() : null, AbstractC5796o.m27445h(ZeroConfig.class, new Type[0]));
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: A */
    public final C3187b0 m84994A() {
        return this.f64970i;
    }

    /* JADX INFO: renamed from: E */
    public final C3187b0 m84995E() {
        return this.f64976o;
    }

    /* JADX INFO: renamed from: w */
    public final void m84996w() {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new MeViewmodel$fetchHistory$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m84997x() {
        m84996w();
        InterfaceC25204t1 interfaceC25204t1 = this.f64977p;
        if (interfaceC25204t1 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
        }
        this.f64977p = AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new MeViewmodel$fetchProfile$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m84998y() {
        if (this.f64966e == null) {
            m84993z();
        }
        C26866a.a.m104898f(C26866a.f81698a, "MeViewmodel", "zeroConfig:" + this.f64966e, false, 4, null);
        ZeroConfig zeroConfig = this.f64966e;
        if (zeroConfig == null || !zeroConfig.getEnable()) {
            return;
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new MeViewmodel$fetchPurchase$1(this, null), 2, null);
    }
}
