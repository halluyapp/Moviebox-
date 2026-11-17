package com.transsion.player.longvideo.helper;

import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.helper.C14453d;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayDao;
import com.transsion.baselib.p291db.video.VideoDetailPlayDao;
import com.transsion.baselib.report.C14482a;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.moviedetailapi.bean.DubsInfo;
import com.transsion.player.longvideo.p302ui.LongVodUiType;
import com.transsion.subtitle.InterfaceC19714h;
import com.transsion.subtitle.R$string;
import com.transsion.subtitle.VideoSubtitleControl;
import com.transsion.subtitle.helper.LocalVideoUiType;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import mu.InterfaceC25909a;
import ng.AbstractC26006c;
import okhttp3.internal.http2.Settings;
import p528ju.C24469a;
import p553ko.C24715a;
import p553ko.C24717c;
import p582lo.C25661j;
import p582lo.C25662k;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class LongVodSubtitleHelper {

    /* JADX INFO: renamed from: a */
    private final C25661j f55481a;

    /* JADX INFO: renamed from: b */
    private final String f55482b;

    /* JADX INFO: renamed from: c */
    private List f55483c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC16473w f55484d;

    /* JADX INFO: renamed from: e */
    private final Function1 f55485e;

    /* JADX INFO: renamed from: f */
    private boolean f55486f;

    /* JADX INFO: renamed from: g */
    private List f55487g;

    /* JADX INFO: renamed from: h */
    private final VideoSubtitleControl f55488h;

    /* JADX INFO: renamed from: i */
    private boolean f55489i;

    /* JADX INFO: renamed from: j */
    private DownloadBean f55490j;

    /* JADX INFO: renamed from: k */
    private C24715a f55491k;

    /* JADX INFO: renamed from: l */
    private boolean f55492l;

    /* JADX INFO: renamed from: m */
    private View f55493m;

    /* JADX INFO: renamed from: n */
    private ViewGroup f55494n;

    /* JADX INFO: renamed from: o */
    private final C16464n0 f55495o;

    /* JADX INFO: renamed from: p */
    private final InterfaceC25149n0 f55496p;

    /* JADX INFO: renamed from: q */
    private final Lazy f55497q;

    /* JADX INFO: renamed from: r */
    private final Lazy f55498r;

    /* JADX INFO: renamed from: com.transsion.player.longvideo.helper.LongVodSubtitleHelper$a */
    public static final class C16433a implements InterfaceC25909a {
        C16433a() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.helper.LongVodSubtitleHelper$b */
    public /* synthetic */ class C16434b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55500a;

        static {
            int[] iArr = new int[LongVodUiType.values().length];
            try {
                iArr[LongVodUiType.LAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LongVodUiType.PORTRAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f55500a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.helper.LongVodSubtitleHelper$c */
    static final class C16435c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f55501a;

        C16435c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f55501a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f55501a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3189c0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.m97797c(mo6065a(), ((FunctionAdapter) obj).mo6065a());
            }
            return false;
        }

        public final int hashCode() {
            return mo6065a().hashCode();
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f55501a.invoke(obj);
        }
    }

    public LongVodSubtitleHelper(C25661j viewBinding, String str, List dubs, InterfaceC16473w callback, Function1 function1, boolean z11) {
        Intrinsics.m97802h(viewBinding, "viewBinding");
        Intrinsics.m97802h(dubs, "dubs");
        Intrinsics.m97802h(callback, "callback");
        this.f55481a = viewBinding;
        this.f55482b = str;
        this.f55483c = dubs;
        this.f55484d = callback;
        this.f55485e = function1;
        this.f55486f = z11;
        this.f55487g = new ArrayList();
        this.f55492l = true;
        this.f55496p = AbstractC25153o0.m99079a(C25220y0.m99268b());
        this.f55497q = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.helper.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LongVodSubtitleHelper.m71755k0();
            }
        });
        this.f55498r = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.helper.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LongVodSubtitleHelper.m71750g0();
            }
        });
        Context context = viewBinding.getRoot().getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C16464n0 c16464n0 = (C16464n0) new C3227v0((FragmentActivity) context).m14969a(C16464n0.class);
        this.f55495o = c16464n0;
        this.f55492l = C14496b.f50966a.m65344b().getBoolean("subtitle_land_guide", true);
        Context context2 = viewBinding.getRoot().getContext();
        Intrinsics.m97800f(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        VideoSubtitleControl videoSubtitleControl = new VideoSubtitleControl((FragmentActivity) context2, str, C14453d.f50863a.m65162d(), this.f55483c, new Function1() { // from class: com.transsion.player.longvideo.helper.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LongVodSubtitleHelper.m71762r(((Boolean) obj).booleanValue());
            }
        }, new Function2() { // from class: com.transsion.player.longvideo.helper.k0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LongVodSubtitleHelper.m71763s(this.f55545a, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        }, new Function3() { // from class: com.transsion.player.longvideo.helper.l0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return LongVodSubtitleHelper.m71764t(this.f55547a, (String) obj, (String) obj2, ((Integer) obj3).intValue());
            }
        }, new Function1() { // from class: com.transsion.player.longvideo.helper.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LongVodSubtitleHelper.m71765u(this.f55549a, (DubsInfo) obj);
            }
        }, new Function1() { // from class: com.transsion.player.longvideo.helper.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LongVodSubtitleHelper.m71766v(this.f55573a, (List) obj);
            }
        }, new Function1() { // from class: com.transsion.player.longvideo.helper.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LongVodSubtitleHelper.m71767w(this.f55574a, (String) obj);
            }
        }, new Function2() { // from class: com.transsion.player.longvideo.helper.a0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LongVodSubtitleHelper.m71768x(this.f55502a, (String) obj, (String) obj2);
            }
        });
        videoSubtitleControl.m81880O(LocalVideoUiType.MIDDLE);
        videoSubtitleControl.m81890g0(new C16433a());
        videoSubtitleControl.m81888c0(new Function1() { // from class: com.transsion.player.longvideo.helper.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LongVodSubtitleHelper.m71735P(this.f55515a, (String) obj);
            }
        });
        this.f55488h = videoSubtitleControl;
        if (this.f55486f) {
            this.f55492l = false;
        }
        C3187b0 c3187b0M71820b = c16464n0.m71820b();
        Context context3 = viewBinding.getRoot().getContext();
        Intrinsics.m97800f(context3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        c3187b0M71820b.m14851j((FragmentActivity) context3, new C16435c(new Function1() { // from class: com.transsion.player.longvideo.helper.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LongVodSubtitleHelper.m71761q(this.f55535a, (C24469a) obj);
            }
        }));
    }

    public /* synthetic */ LongVodSubtitleHelper(C25661j c25661j, String str, List list, InterfaceC16473w interfaceC16473w, Function1 function1, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(c25661j, str, list, interfaceC16473w, function1, (i11 & 32) != 0 ? true : z11);
    }

    /* JADX INFO: renamed from: E */
    private final void m71726E() {
        if (this.f55487g.isEmpty() && this.f55492l) {
            C14496b c14496b = C14496b.f50966a;
            if (c14496b.m65344b().getBoolean("subtitle_is_search_downloaded", false)) {
                this.f55492l = false;
                c14496b.m65344b().putBoolean("subtitle_land_guide", false);
            } else {
                this.f55492l = false;
                c14496b.m65344b().putBoolean("subtitle_land_guide", false);
                this.f55484d.mo71857b(true, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final void m71727F(DownloadBean downloadBean) {
        this.f55489i = true;
        C26866a.f81698a.m104912c(C14482a.f50937a.m65273a(), "流媒体，开始播放检测字幕，name:" + downloadBean.getTotalTitleName() + " subjectId:" + downloadBean.getSubjectId() + " subtitleResId:" + downloadBean.getSubtitleResId(), true);
        InterfaceC19714h.f62935a.m82148b().mo81942d(downloadBean, new Function1() { // from class: com.transsion.player.longvideo.helper.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LongVodSubtitleHelper.m71728G(this.f55525a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final Unit m71728G(LongVodSubtitleHelper longVodSubtitleHelper, boolean z11) {
        if (!z11 && longVodSubtitleHelper.f55487g.isEmpty()) {
            longVodSubtitleHelper.f55481a.getRoot().post(new Runnable() { // from class: com.transsion.player.longvideo.helper.d0
                @Override // java.lang.Runnable
                public final void run() {
                    LongVodSubtitleHelper.m71729H();
                }
            });
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m71729H() {
    }

    /* JADX INFO: renamed from: J */
    private final ImageView m71730J() {
        return null;
    }

    /* JADX INFO: renamed from: K */
    private final TextView m71731K() {
        if (this.f55486f) {
            return this.f55481a.f77908o.f77950x;
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    private final TextView m71732L() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public final UGCVideoDetailPlayDao m71733N() {
        return (UGCVideoDetailPlayDao) this.f55498r.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public final VideoDetailPlayDao m71734O() {
        return (VideoDetailPlayDao) this.f55497q.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final Unit m71735P(LongVodSubtitleHelper longVodSubtitleHelper, String str) {
        longVodSubtitleHelper.f55484d.mo71861f(str);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: Q */
    private final void m71736Q(DownloadBean downloadBean) {
        AbstractC25136k.m99058d(this.f55496p, null, null, new LongVodSubtitleHelper$loadFromDB$1(downloadBean, this, null), 3, null);
    }

    /* JADX INFO: renamed from: U */
    private final void m71737U(View view) {
        C25662k c25662k = this.f55481a.f77908o;
        View view2 = this.f55493m;
        if (view2 != null) {
            AbstractC26006c.m102054g(view2);
        }
    }

    /* JADX INFO: renamed from: V */
    private final void m71738V(View view, boolean z11) {
        this.f55484d.mo71857b(true, true);
        InterfaceC16473w interfaceC16473w = this.f55484d;
        String string = Utils.m27275a().getString(z11 ? R$string.subtitle_turn_on_toast : R$string.subtitle_turn_off_toast);
        Intrinsics.m97801g(string, "getString(...)");
        interfaceC16473w.mo71858c(string);
    }

    /* JADX INFO: renamed from: a0 */
    private final void m71740a0(VideoSubtitleControl videoSubtitleControl) {
        LocalVideoUiType localVideoUiType = LocalVideoUiType.MIDDLE;
        TextView textViewM71731K = m71731K();
        C25661j c25661j = this.f55481a;
        videoSubtitleControl.m81886Z(localVideoUiType, textViewM71731K, c25661j.f77888A, c25661j.f77919z, c25661j.f77904k, false);
        videoSubtitleControl.m81892i0(new Function1() { // from class: com.transsion.player.longvideo.helper.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LongVodSubtitleHelper.m71742b0(this.f55572a, ((Boolean) obj).booleanValue());
            }
        });
        videoSubtitleControl.m81875E(localVideoUiType, new Function2() { // from class: com.transsion.player.longvideo.helper.e0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LongVodSubtitleHelper.m71744c0(this.f55530a, (View) obj, ((Boolean) obj2).booleanValue());
            }
        }, new Function1() { // from class: com.transsion.player.longvideo.helper.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LongVodSubtitleHelper.m71746d0(this.f55533a, (View) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final Unit m71742b0(LongVodSubtitleHelper longVodSubtitleHelper, boolean z11) {
        View viewM71771I = longVodSubtitleHelper.m71771I();
        if (viewM71771I != null) {
            viewM71771I.setVisibility(z11 ? 0 : 8);
        }
        ImageView imageViewM71730J = longVodSubtitleHelper.m71730J();
        if (imageViewM71730J != null) {
            imageViewM71730J.setVisibility(z11 ? 8 : 0);
        }
        TextView textViewM71732L = longVodSubtitleHelper.m71732L();
        if (textViewM71732L != null) {
            textViewM71732L.setText(Utils.m27275a().getString(z11 ? com.transsion.postdetail.R$string.play_loading : com.transsion.postdetail.R$string.turn_on_short));
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final Unit m71744c0(LongVodSubtitleHelper longVodSubtitleHelper, View switchView, boolean z11) {
        Intrinsics.m97802h(switchView, "switchView");
        longVodSubtitleHelper.m71738V(switchView, z11);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final Unit m71746d0(LongVodSubtitleHelper longVodSubtitleHelper, View settingView) {
        Intrinsics.m97802h(settingView, "settingView");
        longVodSubtitleHelper.m71737U(settingView);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final UGCVideoDetailPlayDao m71750g0() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64864A1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final VideoDetailPlayDao m71755k0() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64865B1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final Unit m71761q(LongVodSubtitleHelper longVodSubtitleHelper, C24469a c24469a) {
        VideoSubtitleControl videoSubtitleControl = longVodSubtitleHelper.f55488h;
        Intrinsics.m97799e(c24469a);
        videoSubtitleControl.m81879N(c24469a);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Unit m71762r(boolean z11) {
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final Unit m71763s(LongVodSubtitleHelper longVodSubtitleHelper, boolean z11, boolean z12) {
        if (z11) {
            longVodSubtitleHelper.f55484d.mo71857b(true, z12);
        } else {
            longVodSubtitleHelper.f55484d.mo71857b(false, true);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final Unit m71764t(LongVodSubtitleHelper longVodSubtitleHelper, String lanName, String lan, int i11) {
        Intrinsics.m97802h(lanName, "lanName");
        Intrinsics.m97802h(lan, "lan");
        longVodSubtitleHelper.f55495o.m71822d().mo14855n(new Pair(lanName, lan));
        longVodSubtitleHelper.f55484d.mo71862g(lanName, lan, i11);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final Unit m71765u(LongVodSubtitleHelper longVodSubtitleHelper, DubsInfo it) {
        Intrinsics.m97802h(it, "it");
        Function1 function1 = longVodSubtitleHelper.f55485e;
        if (function1 != null) {
            function1.invoke(it);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final Unit m71766v(LongVodSubtitleHelper longVodSubtitleHelper, List list) {
        Intrinsics.m97802h(list, "list");
        longVodSubtitleHelper.f55495o.m71821c().mo14855n(list);
        longVodSubtitleHelper.f55484d.mo71860e(list);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final Unit m71767w(LongVodSubtitleHelper longVodSubtitleHelper, String str) {
        InterfaceC16473w interfaceC16473w = longVodSubtitleHelper.f55484d;
        if (str == null) {
            str = "";
        }
        interfaceC16473w.mo71858c(str);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final Unit m71768x(LongVodSubtitleHelper longVodSubtitleHelper, String str, String str2) {
        longVodSubtitleHelper.f55484d.mo71859d(str, str2);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: I */
    public final View m71771I() {
        return null;
    }

    /* JADX INFO: renamed from: M */
    public final Map m71772M() {
        return this.f55488h.m81876F();
    }

    /* JADX INFO: renamed from: R */
    public final void m71773R() {
        this.f55488h.m81878M();
    }

    /* JADX INFO: renamed from: S */
    public final void m71774S() {
        DownloadBean downloadBean;
        if (this.f55489i || (downloadBean = this.f55490j) == null) {
            return;
        }
        this.f55489i = true;
        C26866a.f81698a.m104912c(C14482a.f50937a.m65273a(), "流媒体，网络连接成功开始检测字幕，name:" + downloadBean.getTotalTitleName() + " subjectId:" + downloadBean.getSubjectId() + " subtitleResId:" + downloadBean.getSubtitleResId(), true);
        InterfaceC19714h.b.m82149a(InterfaceC19714h.f62935a.m82148b(), downloadBean, null, 2, null);
    }

    /* JADX INFO: renamed from: T */
    public final void m71775T(C24715a bean, C24717c playStream) {
        UGCVideoBelongToCollection belongToCollection;
        UGCVideoBelongToCollection belongToCollection2;
        UGCVideoBelongToCollection belongToCollection3;
        Intrinsics.m97802h(bean, "bean");
        Intrinsics.m97802h(playStream, "playStream");
        this.f55489i = false;
        this.f55491k = bean;
        if (bean.m97048d() != null) {
            this.f55490j = bean.m97048d();
        } else {
            DownloadBean downloadBean = new DownloadBean(playStream.m97084h(), playStream.m97079c(), bean.m97060p(), "", StringsKt.m98218x(playStream.m97083g()), null, null, null, null, null, 0L, 0, 0, 0, 0L, 0L, 0, 0, bean.m97049e(), bean.m97056l(), 0, 0, 0, 0, 0, 0, 0, bean.m97059o(), this.f55482b, null, bean.m97060p(), 0L, 0, 0, null, null, 0L, null, null, 0L, 0, 0L, null, 0, null, null, false, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -1477181472, -1, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
            downloadBean.setStream(playStream.m97087k());
            downloadBean.setStreamVideoDetail(true);
            UGCVideo uGCVideoM97065u = bean.m97065u();
            downloadBean.setUgcVideoId(uGCVideoM97065u != null ? uGCVideoM97065u.getUgcVideoId() : null);
            UGCVideo uGCVideoM97065u2 = bean.m97065u();
            downloadBean.setUgcVideoCollectionId((uGCVideoM97065u2 == null || (belongToCollection3 = uGCVideoM97065u2.getBelongToCollection()) == null) ? null : belongToCollection3.getCollectionId());
            UGCVideo uGCVideoM97065u3 = bean.m97065u();
            downloadBean.setUgcVideoName(uGCVideoM97065u3 != null ? uGCVideoM97065u3.getTitle() : null);
            UGCVideo uGCVideoM97065u4 = bean.m97065u();
            downloadBean.setUgcVideoCollectionName((uGCVideoM97065u4 == null || (belongToCollection2 = uGCVideoM97065u4.getBelongToCollection()) == null) ? null : belongToCollection2.getCollectionName());
            UGCVideo uGCVideoM97065u5 = bean.m97065u();
            downloadBean.setUgcVideoPosition((uGCVideoM97065u5 == null || (belongToCollection = uGCVideoM97065u5.getBelongToCollection()) == null) ? null : belongToCollection.getPosition());
            UGCVideo uGCVideoM97065u6 = bean.m97065u();
            downloadBean.setUgcVideoType(uGCVideoM97065u6 != null ? uGCVideoM97065u6.getCategory() : null);
            downloadBean.setOps(bean.m97061q());
            downloadBean.setSubtitleIdType(playStream.m97080d());
            this.f55490j = downloadBean;
        }
        C26866a.a aVar = C26866a.f81698a;
        String strM65273a = C14482a.f50937a.m65273a();
        DownloadBean downloadBean2 = this.f55490j;
        String ugcVideoId = downloadBean2 != null ? downloadBean2.getUgcVideoId() : null;
        DownloadBean downloadBean3 = this.f55490j;
        aVar.m104912c(strM65273a, "subtitle onSetNewDataSource，ugcVideoId:" + ugcVideoId + " CollectionId:" + (downloadBean3 != null ? downloadBean3.getUgcVideoCollectionId() : null), true);
        this.f55488h.m81891h0(this.f55490j);
        DownloadBean downloadBean4 = this.f55490j;
        Intrinsics.m97799e(downloadBean4);
        m71736Q(downloadBean4);
    }

    /* JADX INFO: renamed from: W */
    public final void m71776W(LongVodUiType uiType) {
        LocalVideoUiType localVideoUiType;
        Intrinsics.m97802h(uiType, "uiType");
        if (uiType == LongVodUiType.LAND) {
            m71726E();
        }
        int i11 = C16434b.f55500a[uiType.ordinal()];
        if (i11 != 1) {
            localVideoUiType = i11 != 2 ? LocalVideoUiType.MIDDLE : LocalVideoUiType.PORTRAIT;
        } else {
            localVideoUiType = LocalVideoUiType.LAND;
        }
        this.f55488h.m81880O(localVideoUiType);
    }

    /* JADX INFO: renamed from: X */
    public final void m71777X(long j11) {
        this.f55488h.m81882R(j11);
    }

    /* JADX INFO: renamed from: Y */
    public final void m71778Y() {
        this.f55488h.m81884T();
    }

    /* JADX INFO: renamed from: Z */
    public final void m71779Z() {
        VideoSubtitleControl videoSubtitleControl = this.f55488h;
        if (videoSubtitleControl != null) {
            videoSubtitleControl.m81885X();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m71780e0(boolean z11) {
        this.f55488h.m81887b0(z11);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m71781f0(ViewGroup viewGroup) {
        this.f55494n = viewGroup;
        m71740a0(this.f55488h);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m71782h0(List dubs) {
        Intrinsics.m97802h(dubs, "dubs");
        this.f55483c = dubs;
        this.f55488h.m81894p0(dubs);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m71783i0(long j11) {
        this.f55488h.m81895q0(j11);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m71784j0(float f11) {
        this.f55488h.m81896r0(f11);
    }
}
