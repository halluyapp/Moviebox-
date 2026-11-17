package com.transsion.shorttv.subtitle;

import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import at.InterfaceC4708a;
import bt.C4880a;
import com.avery.subtitle.widget.SimpleSubtitleView;
import com.blankj.utilcode.util.Utils;
import com.transsion.shorttv.R$color;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv.bean.ShortTVItem;
import com.transsion.shorttv.subtitle.manager.InterfaceC18884b;
import com.transsion.shorttv.utils.C19165h;
import com.transsion.shorttv.viewmodel.ShortTvViewModel;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.transsion.subtitle_download.utils.C19773d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p356ds.AbstractC23047a;
import p356ds.AbstractC23048b;
import p550kj.C24662i;
import p557ks.C25427b;
import p568l5.InterfaceC25556a;
import p568l5.InterfaceC25557b;
import p659os.C26719e;
import p717qr.C27122a;
import p955ys.C29007b;
import p989zs.AbstractC29242a;
import pg.C26866a;
import rs.C27349k0;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTVSubtitleControlImp implements InterfaceC18876a, InterfaceC4708a {

    /* JADX INFO: renamed from: b */
    private final FragmentActivity f60888b;

    /* JADX INFO: renamed from: c */
    private final C27349k0 f60889c;

    /* JADX INFO: renamed from: d */
    private final ShortTvViewModel f60890d;

    /* JADX INFO: renamed from: e */
    private final C26719e f60891e;

    /* JADX INFO: renamed from: f */
    private final String f60892f;

    /* JADX INFO: renamed from: g */
    private final String f60893g;

    /* JADX INFO: renamed from: h */
    private final C4880a f60894h;

    /* JADX INFO: renamed from: i */
    private Function1 f60895i;

    /* JADX INFO: renamed from: j */
    private Function1 f60896j;

    /* JADX INFO: renamed from: k */
    private boolean f60897k;

    /* JADX INFO: renamed from: l */
    private long f60898l;

    /* JADX INFO: renamed from: m */
    private float f60899m;

    /* JADX INFO: renamed from: n */
    private final ShortTVSubtitleControlImp$downloadListener$1 f60900n;

    /* JADX INFO: renamed from: com.transsion.shorttv.subtitle.ShortTVSubtitleControlImp$a */
    public static final class C18873a implements InterfaceC25556a {
        C18873a() {
        }

        @Override // p568l5.InterfaceC25556a
        public long getCurrentPosition() {
            return ShortTVSubtitleControlImp.this.f60898l;
        }

        @Override // p568l5.InterfaceC25556a
        public Float getSpeed() {
            return Float.valueOf(ShortTVSubtitleControlImp.this.f60899m);
        }

        @Override // p568l5.InterfaceC25556a
        public boolean isPlaying() {
            return ShortTVSubtitleControlImp.this.f60897k;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.subtitle.ShortTVSubtitleControlImp$b */
    static final class C18874b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f60902a;

        C18874b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f60902a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f60902a;
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
            this.f60902a.invoke(obj);
        }
    }

    public ShortTVSubtitleControlImp(FragmentActivity activity, C27349k0 viewBinding, ShortTvViewModel shortTvViewModel, C26719e epItem, String str) {
        Intrinsics.m97802h(activity, "activity");
        Intrinsics.m97802h(viewBinding, "viewBinding");
        Intrinsics.m97802h(epItem, "epItem");
        this.f60888b = activity;
        this.f60889c = viewBinding;
        this.f60890d = shortTvViewModel;
        this.f60891e = epItem;
        this.f60892f = str;
        this.f60893g = "ShortTVSubtitleCtr";
        C4880a c4880a = (C4880a) new C3227v0(activity).m14969a(C4880a.class);
        this.f60894h = c4880a;
        this.f60897k = true;
        this.f60899m = 1.0f;
        ShortTVSubtitleControlImp$downloadListener$1 shortTVSubtitleControlImp$downloadListener$1 = new ShortTVSubtitleControlImp$downloadListener$1(this);
        this.f60900n = shortTVSubtitleControlImp$downloadListener$1;
        c4880a.m23388b();
        c4880a.m23391e().m14851j(activity, new C18874b(new Function1() { // from class: com.transsion.shorttv.subtitle.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTVSubtitleControlImp.m79454k(this.f60906a, (C29007b) obj);
            }
        }));
        InterfaceC18884b.a aVar = InterfaceC18884b.f60919a;
        aVar.m79507b().mo79493b(shortTVSubtitleControlImp$downloadListener$1);
        aVar.m79507b().mo79496e(this);
        m79469z(viewBinding.f83234K);
    }

    /* JADX INFO: renamed from: A */
    private final void m79447A(boolean z11) {
        C26866a.a.m104899g(C26866a.f81698a, this.f60893g + " --> onSubtitleSwitchClick() --> turnOn = " + z11 + " --> 字幕开关状态变化", false, 2, null);
        if (z11) {
            m79451E();
        } else {
            m79467x();
        }
        this.f60894h.m23392f().mo14858q(Boolean.valueOf(!z11));
    }

    /* JADX INFO: renamed from: B */
    private final void m79448B(C29007b c29007b) {
        String id2;
        String videoId;
        HashMap map = new HashMap();
        map.put("subject_id", this.f60891e.m104513e());
        ShortTVItem shortTVItemM104512d = this.f60891e.m104512d();
        if (shortTVItemM104512d == null || (id2 = shortTVItemM104512d.getId()) == null) {
            id2 = "";
        }
        map.put("mini_id", id2);
        ShortTVItem shortTVItemM104512d2 = this.f60891e.m104512d();
        map.put("se", String.valueOf(shortTVItemM104512d2 != null ? Integer.valueOf(shortTVItemM104512d2.getSe()) : null));
        map.put("ep", String.valueOf(this.f60891e.m104511c()));
        ShortTVItem shortTVItemM104512d3 = this.f60891e.m104512d();
        if (shortTVItemM104512d3 == null || (videoId = shortTVItemM104512d3.getVideoId()) == null) {
            videoId = "";
        }
        map.put("video_id", videoId);
        map.put("opt_type", "subtitle_select");
        String ops = c29007b.m111561a().getOps();
        if (ops != null) {
            map.put("ops", ops);
        }
        map.put("name", c29007b.m111561a().getName());
        String lan = c29007b.m111561a().getLan();
        if (lan == null) {
            lan = "";
        }
        map.put("lan", lan);
        String lanName = c29007b.m111561a().getLanName();
        map.put("lan_name", lanName != null ? lanName : "");
        C24662i.f75350a.m96881p("minitv_play", map);
    }

    /* JADX INFO: renamed from: C */
    private final void m79449C() {
        this.f60894h.m23390d().mo14858q(null);
        this.f60894h.m23391e().mo14858q(null);
        this.f60889c.f83234K.reset();
        C26866a.a.m104899g(C26866a.f81698a, this.f60893g + " --> reset() --> 重置资源", false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m79450D(boolean z11) {
    }

    /* JADX INFO: renamed from: E */
    private final void m79451E() {
        this.f60889c.f83234K.turnOff(false);
        FrameLayout flSubtitle = this.f60889c.f83242f;
        Intrinsics.m97801g(flSubtitle, "flSubtitle");
        AbstractC23048b.m91694e(flSubtitle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final Unit m79454k(ShortTVSubtitleControlImp shortTVSubtitleControlImp, C29007b c29007b) {
        if (c29007b == null) {
            return Unit.f75682a;
        }
        if (c29007b.m111563c()) {
            C25427b.f76996a.m99960d(R$string.short_tv_subtitle_turn_off_toast);
        }
        shortTVSubtitleControlImp.m79447A(!c29007b.m111563c());
        if (!c29007b.m111563c()) {
            shortTVSubtitleControlImp.mo79476h(c29007b);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: x */
    private final void m79467x() {
        this.f60889c.f83234K.turnOff(true);
        FrameLayout flSubtitle = this.f60889c.f83242f;
        Intrinsics.m97801g(flSubtitle, "flSubtitle");
        AbstractC23048b.m91691b(flSubtitle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x018c  */
    /* JADX WARN: Code duplicated, block: B:60:0x020d  */
    /* JADX INFO: renamed from: y */
    public final void m79468y(List list, String str) {
        Object next;
        Locale localeM112122a = AbstractC29242a.m112122a();
        C26866a.a aVar = C26866a.f81698a;
        Object obj = null;
        C26866a.a.m104899g(aVar, this.f60893g + " --> initDefaultSubtitle() --> cur language = " + localeM112122a.getLanguage() + " -- country = " + localeM112122a.getCountry(), false, 2, null);
        String id2 = "";
        String string = C19165h.f61575a.m80241d().getString("k_subtitle_language", "");
        C19773d.f63089a.m82370b().getString("k_subtitle_select_lan", "");
        if (Intrinsics.m97797c(string, "off")) {
            Function1 function1 = this.f60895i;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
            this.f60894h.m23392f().mo14858q(Boolean.TRUE);
            this.f60894h.m23393g("OFF");
            return;
        }
        C26866a.a.m104899g(aVar, this.f60893g + " --> initDefaultSubtitle() --> savedDiffId = " + str + " -- savedLan = " + string + ", subListSize:" + list.size(), false, 2, null);
        Iterator it = list.iterator();
        C29007b c29007b = null;
        C29007b c29007b2 = null;
        C29007b c29007b3 = null;
        C29007b c29007b4 = null;
        while (it.hasNext()) {
            C29007b c29007b5 = (C29007b) it.next();
            if (c29007b == null && string != null && string.length() != 0 && Intrinsics.m97797c(c29007b5.m111561a().getLanName(), string)) {
                c29007b = c29007b5;
            }
            if (c29007b2 == null && Intrinsics.m97797c(c29007b5.m111561a().getLanAbbr(), localeM112122a.getLanguage())) {
                c29007b2 = c29007b5;
            }
            if (c29007b5.m111562b()) {
                if (Intrinsics.m97797c(c29007b5.m111561a().getLan(), "en")) {
                    c29007b3 = c29007b5;
                }
                if (Intrinsics.m97797c(c29007b5.m111561a().getId(), str)) {
                    id2 = c29007b5.m111561a().getId();
                    C26866a.a.m104899g(C26866a.f81698a, this.f60893g + " --> initDefaultSubtitle() --> 使用之前选择的字幕 saved flag = " + id2, false, 2, null);
                    c29007b4 = c29007b5;
                }
            }
        }
        if (id2.length() != 0) {
            c29007b = c29007b4;
        } else if (c29007b != null) {
            id2 = c29007b.m111561a().getId();
            C26866a.a.m104899g(C26866a.f81698a, this.f60893g + " --> initDefaultSubtitle() --> 使用之前选择的语言 local set savedLan = " + string, false, 2, null);
        } else if (c29007b2 != null) {
            id2 = c29007b2.m111561a().getId();
            C26866a.a.m104899g(C26866a.f81698a, this.f60893g + " --> initDefaultSubtitle() --> 没有自己选择的默认语言，使用手机语言 -- phone set def language = " + id2, false, 2, null);
            c29007b = c29007b2;
        } else {
            c29007b = c29007b4;
        }
        if (id2.length() != 0) {
            c29007b3 = c29007b;
        } else if (c29007b3 != null && c29007b3.m111562b()) {
            String id3 = c29007b3.m111561a().getId();
            C26866a.a.m104899g(C26866a.f81698a, this.f60893g + " --> initDefaultSubtitle() --> 没有设置默认语言 --> english set def language = " + id3, false, 2, null);
        } else if (list.isEmpty()) {
            c29007b3 = c29007b;
        } else {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c29007b3 = c29007b;
                    break;
                }
                C29007b c29007b6 = (C29007b) it2.next();
                if (c29007b6.m111562b()) {
                    id2 = c29007b6.m111561a().getId();
                    c29007b3 = c29007b6;
                    break;
                }
            }
            if (id2.length() == 0) {
                C26866a.a.m104899g(C26866a.f81698a, this.f60893g + " --> initDefaultSubtitle() --> 可能外部只读取到了数据库前面没下载的字幕 --> 没有对应的语言，不设置，需要用户手动设置或当前下载后自动设置上", false, 2, null);
                return;
            }
        }
        List<C29007b> list2 = list;
        for (C29007b c29007b7 : list2) {
            this.f60889c.f83234K.setSubtitlePath(c29007b7.m111561a().getPath(), AbstractC29242a.m112123b(c29007b7));
        }
        if (c29007b3 == null || c29007b3.m111562b()) {
            mo79476h(c29007b3);
            if (c29007b3 != null) {
                c29007b3.m111566f(true);
            }
            this.f60894h.m23392f().mo14858q(Boolean.FALSE);
            if (c29007b3 != null) {
                this.f60894h.m23393g(c29007b3.m111561a().getId());
                return;
            } else {
                this.f60894h.m23393g("OFF");
                return;
            }
        }
        c29007b3.m111561a().setAutoDownload(false);
        c29007b3.m111561a().setSetImmediately(true);
        InterfaceC18884b.f60919a.m79507b().mo79497f(c29007b3);
        Iterator it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            C29007b c29007b8 = (C29007b) next;
            if (c29007b8.m111562b() && Intrinsics.m97797c(c29007b8.m111561a().getLan(), "en")) {
                break;
            }
        }
        C29007b c29007b9 = (C29007b) next;
        if (c29007b9 == null) {
            for (Object obj2 : list2) {
                if (((C29007b) obj2).m111562b()) {
                    obj = obj2;
                    break;
                }
            }
            c29007b9 = (C29007b) obj;
        }
        if (c29007b9 != null) {
            mo79476h(c29007b9);
            c29007b9.m111566f(true);
            this.f60894h.m23392f().mo14858q(Boolean.FALSE);
            if (c29007b9.m111561a().getId().length() > 0) {
                this.f60894h.m23393g(c29007b9.m111561a().getId());
            }
        }
    }

    /* JADX INFO: renamed from: z */
    private final void m79469z(SimpleSubtitleView simpleSubtitleView) {
        if (simpleSubtitleView != null) {
            simpleSubtitleView.setBgColor(Utils.m27275a().getResources().getColor(R$color.short_tv_black_80));
        }
        if (simpleSubtitleView != null) {
            simpleSubtitleView.setBgdRadius(AbstractC23047a.m91689a(8));
        }
        if (simpleSubtitleView != null) {
            simpleSubtitleView.initSubtitle(new C18873a(), false);
            return;
        }
        C26866a.a.m104899g(C26866a.f81698a, this.f60893g + " --> vdSubtitle --> initSubtitle() --> null", false, 2, null);
    }

    @Override // com.transsion.shorttv.subtitle.InterfaceC18876a
    /* JADX INFO: renamed from: a */
    public void mo79470a(Function1 function1) {
        this.f60895i = function1;
    }

    @Override // com.transsion.shorttv.subtitle.InterfaceC18876a
    /* JADX INFO: renamed from: b */
    public void mo79471b(Function1 function1) {
        this.f60896j = function1;
    }

    @Override // com.transsion.shorttv.subtitle.InterfaceC18876a
    /* JADX INFO: renamed from: c */
    public void mo79472c(boolean z11) {
        this.f60897k = z11;
        if (z11) {
            this.f60889c.f83234K.resume();
        } else {
            this.f60889c.f83234K.pause();
        }
    }

    @Override // com.transsion.shorttv.subtitle.InterfaceC18876a
    /* JADX INFO: renamed from: d */
    public void mo79473d(long j11) {
        this.f60898l = j11;
    }

    @Override // com.transsion.shorttv.subtitle.InterfaceC18876a
    /* JADX INFO: renamed from: e */
    public void mo79474e() {
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this.f60888b), null, null, new ShortTVSubtitleControlImp$checkSubtitle$1(this, null), 3, null);
    }

    @Override // com.transsion.shorttv.subtitle.InterfaceC18876a
    /* JADX INFO: renamed from: f */
    public void mo79475f() {
        m79467x();
        List list = (List) this.f60894h.m23390d().m14847f();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C29007b) it.next()).m111566f(false);
            }
        }
        this.f60894h.m23392f().mo14858q(Boolean.TRUE);
        C19165h.f61575a.m80241d().putString("k_subtitle_language", "off");
        C19773d.f63089a.m82370b().putString("k_subtitle_select_lan", "off");
        if (C27122a.f82222a.m105520c()) {
            return;
        }
        C25427b.f76996a.m99961e(Utils.m27275a().getString(R$string.short_tv_subtitles_off));
    }

    @Override // at.InterfaceC4708a
    /* JADX INFO: renamed from: g */
    public void mo22777g(boolean z11) {
        C26866a.a.m104899g(C26866a.f81698a, this.f60893g + " --> checkResult --> " + z11, false, 2, null);
        Function1 function1 = this.f60895i;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z11));
        }
    }

    @Override // com.transsion.shorttv.subtitle.InterfaceC18876a
    /* JADX INFO: renamed from: h */
    public void mo79476h(C29007b c29007b) {
        SubtitleDownloadTable subtitleDownloadTableM111561a;
        SubtitleDownloadTable subtitleDownloadTableM111561a2;
        Long delay;
        SubtitleDownloadTable subtitleDownloadTableM111561a3;
        SubtitleDownloadTable subtitleDownloadTableM111561a4;
        SubtitleDownloadTable subtitleDownloadTableM111561a5;
        SubtitleDownloadTable subtitleDownloadTableM111561a6;
        String path;
        SubtitleDownloadTable subtitleDownloadTableM111561a7;
        List<C29007b> list = (List) this.f60894h.m23390d().m14847f();
        if (list != null) {
            for (C29007b c29007b2 : list) {
                c29007b2.m111566f(Intrinsics.m97797c(c29007b2.m111561a().getId(), (c29007b == null || (subtitleDownloadTableM111561a7 = c29007b.m111561a()) == null) ? null : subtitleDownloadTableM111561a7.getId()));
            }
        }
        Function1 function1 = this.f60896j;
        if (function1 != null) {
            function1.invoke(c29007b);
        }
        if (c29007b != null && (subtitleDownloadTableM111561a6 = c29007b.m111561a()) != null && (path = subtitleDownloadTableM111561a6.getPath()) != null) {
            m79451E();
            this.f60889c.f83234K.selectSubtitle(path, AbstractC29242a.m112123b(c29007b), new InterfaceC25557b() { // from class: com.transsion.shorttv.subtitle.c
                @Override // p568l5.InterfaceC25557b
                /* JADX INFO: renamed from: a */
                public final void mo79480a(boolean z11) {
                    ShortTVSubtitleControlImp.m79450D(z11);
                }
            });
        }
        C26866a.f81698a.m104912c("short_tv_subtitle", "selectSubtitle delayDuration:" + ((c29007b == null || (subtitleDownloadTableM111561a5 = c29007b.m111561a()) == null) ? null : subtitleDownloadTableM111561a5.getDelay()) + ", name:" + ((c29007b == null || (subtitleDownloadTableM111561a4 = c29007b.m111561a()) == null) ? null : subtitleDownloadTableM111561a4.getLanName()) + ", isAutoDownload:" + ((c29007b == null || (subtitleDownloadTableM111561a3 = c29007b.m111561a()) == null) ? null : Boolean.valueOf(subtitleDownloadTableM111561a3.getIsAutoDownload())), true);
        if (c29007b != null && (subtitleDownloadTableM111561a2 = c29007b.m111561a()) != null && (delay = subtitleDownloadTableM111561a2.getDelay()) != null) {
            this.f60889c.f83234K.subtitleDelay(delay.longValue());
        }
        if (c29007b != null && (subtitleDownloadTableM111561a = c29007b.m111561a()) != null) {
            if (!subtitleDownloadTableM111561a.getIsAutoDownload()) {
                C19165h.f61575a.m80241d().putString("k_subtitle_language", subtitleDownloadTableM111561a.getLanName());
                C19773d.f63089a.m82370b().putString("k_subtitle_select_lan", subtitleDownloadTableM111561a.getLan());
            }
            if (!C27122a.f82222a.m105520c()) {
                C25427b.f76996a.m99961e(Utils.m27275a().getString(R$string.short_tv_subtitle_enable_toast, subtitleDownloadTableM111561a.getName()));
            }
        }
        if (c29007b != null) {
            m79448B(c29007b);
        }
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this.f60888b), null, null, new ShortTVSubtitleControlImp$selectSubtitle$6(c29007b, this, null), 3, null);
    }

    @Override // com.transsion.shorttv.subtitle.InterfaceC18876a
    public void onDestroy() {
        m79449C();
        FrameLayout flSubtitle = this.f60889c.f83242f;
        Intrinsics.m97801g(flSubtitle, "flSubtitle");
        AbstractC23048b.m91691b(flSubtitle);
        this.f60889c.f83234K.stop();
        this.f60889c.f83234K.destroy();
        InterfaceC18884b.a aVar = InterfaceC18884b.f60919a;
        aVar.m79507b().mo79498g(this);
        aVar.m79507b().mo79494c(this.f60900n);
        C26866a.a.m104899g(C26866a.f81698a, this.f60893g + " --> onDestroy()", false, 2, null);
    }
}
