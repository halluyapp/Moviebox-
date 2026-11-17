package com.transsion.ugcvideodetail.hepler.subtitle;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3187b0;
import com.avery.subtitle.widget.SimpleSubtitleView;
import com.blankj.utilcode.util.Utils;
import com.p282tn.lib.widget.R$color;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.subtitle.helper.AbstractC19718c;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.transsion.subtitle_download.utils.C19773d;
import com.transsion.ugcvideodetail.R$string;
import com.transsion.ugcvideodetail.api.bean.UGCImmVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoPlayStream;
import com.transsion.ugcvideodetail.hepler.subtitle.manager.InterfaceC20331b;
import fk.AbstractC23384a;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import mu.InterfaceC25911c;
import ng.AbstractC26006c;
import p528ju.C24469a;
import p568l5.InterfaceC25556a;
import p568l5.InterfaceC25557b;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class UGCImmVideoSubtitleControlImp implements InterfaceC20325b, InterfaceC25911c {

    /* JADX INFO: renamed from: a */
    private final FragmentActivity f64421a;

    /* JADX INFO: renamed from: b */
    private final String f64422b;

    /* JADX INFO: renamed from: c */
    private final ViewGroup f64423c;

    /* JADX INFO: renamed from: d */
    private final SimpleSubtitleView f64424d;

    /* JADX INFO: renamed from: e */
    private final C20324a f64425e;

    /* JADX INFO: renamed from: f */
    private final UGCImmVideo f64426f;

    /* JADX INFO: renamed from: g */
    private final UGCVideoPlayStream f64427g;

    /* JADX INFO: renamed from: h */
    private final String f64428h;

    /* JADX INFO: renamed from: i */
    private Function1 f64429i;

    /* JADX INFO: renamed from: j */
    private Function1 f64430j;

    /* JADX INFO: renamed from: k */
    private boolean f64431k;

    /* JADX INFO: renamed from: l */
    private long f64432l;

    /* JADX INFO: renamed from: m */
    private float f64433m;

    /* JADX INFO: renamed from: n */
    private final String f64434n;

    /* JADX INFO: renamed from: o */
    private final UGCImmVideoSubtitleControlImp$downloadListener$1 f64435o;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.hepler.subtitle.UGCImmVideoSubtitleControlImp$a */
    public static final class C20321a implements InterfaceC25556a {
        C20321a() {
        }

        @Override // p568l5.InterfaceC25556a
        public long getCurrentPosition() {
            return UGCImmVideoSubtitleControlImp.this.f64432l;
        }

        @Override // p568l5.InterfaceC25556a
        public Float getSpeed() {
            return Float.valueOf(UGCImmVideoSubtitleControlImp.this.f64433m);
        }

        @Override // p568l5.InterfaceC25556a
        public boolean isPlaying() {
            return UGCImmVideoSubtitleControlImp.this.f64431k;
        }
    }

    public UGCImmVideoSubtitleControlImp(FragmentActivity activity, String pageName, ViewGroup subtitleLayout, SimpleSubtitleView subtitleView, C20324a c20324a, UGCImmVideo uGCImmVideo, UGCVideoPlayStream uGCVideoPlayStream) {
        UGCVideo ugcVideo;
        Intrinsics.m97802h(activity, "activity");
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(subtitleLayout, "subtitleLayout");
        Intrinsics.m97802h(subtitleView, "subtitleView");
        this.f64421a = activity;
        this.f64422b = pageName;
        this.f64423c = subtitleLayout;
        this.f64424d = subtitleView;
        this.f64425e = c20324a;
        this.f64426f = uGCImmVideo;
        this.f64427g = uGCVideoPlayStream;
        this.f64428h = "UGCVideoSubtitleCtr";
        this.f64431k = true;
        this.f64433m = 1.0f;
        this.f64434n = ((uGCImmVideo == null || (ugcVideo = uGCImmVideo.getUgcVideo()) == null) ? null : ugcVideo.getUgcVideoId()) + "_" + (uGCVideoPlayStream != null ? uGCVideoPlayStream.getIdType() : null);
        UGCImmVideoSubtitleControlImp$downloadListener$1 uGCImmVideoSubtitleControlImp$downloadListener$1 = new UGCImmVideoSubtitleControlImp$downloadListener$1(this);
        this.f64435o = uGCImmVideoSubtitleControlImp$downloadListener$1;
        if (c20324a != null) {
            c20324a.m84136b();
        }
        InterfaceC20331b.a aVar = InterfaceC20331b.f64452a;
        aVar.m84160b().mo84149b(uGCImmVideoSubtitleControlImp$downloadListener$1);
        aVar.m84160b().mo84153f(this);
        m84123w(subtitleView);
    }

    /* JADX INFO: renamed from: A */
    private final void m84108A() {
        this.f64424d.turnOff(false);
        AbstractC26006c.m102058k(this.f64423c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:46:0x01b9  */
    /* JADX INFO: renamed from: v */
    public final void m84122v(List list, String str) {
        C3187b0 c3187b0M84140f;
        Locale localeM82167a = AbstractC19718c.m82167a();
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, this.f64428h, " initDefaultSubtitle() --> cur language = " + localeM82167a.getLanguage() + " -- country = " + localeM82167a.getCountry(), false, 4, null);
        String id2 = "";
        String string = C14496b.f50966a.m65344b().getString("k_subtitle_language", "");
        C26866a.a.m104898f(aVar, this.f64428h, " initDefaultSubtitle() --> savedDiffId = " + str + " -- savedLan = " + string + ", subListSize:" + list.size(), false, 4, null);
        Iterator it = list.iterator();
        C24469a c24469a = null;
        C24469a c24469a2 = null;
        while (it.hasNext()) {
            C24469a c24469a3 = (C24469a) it.next();
            if (c24469a3.m96013d()) {
                if (Intrinsics.m97797c(c24469a3.m96011b().getLan(), "en")) {
                    c24469a = c24469a3;
                }
                if ((str == null || str.length() == 0) && Intrinsics.m97797c(c24469a3.m96011b().getLanName(), string)) {
                    id2 = c24469a3.m96011b().getId();
                    C26866a.a.m104898f(C26866a.f81698a, this.f64428h, " initDefaultSubtitle() --> 使用之前选择的语言 local set savedLan = " + string, false, 4, null);
                } else if ((str == null || str.length() == 0) && Intrinsics.m97797c(c24469a3.m96011b().getLanAbbr(), localeM82167a.getLanguage())) {
                    id2 = c24469a3.m96011b().getId();
                    C26866a.a.m104898f(C26866a.f81698a, this.f64428h, " initDefaultSubtitle() --> 没有自己选择的默认语言，使用手机语言 -- phone set def language = " + id2, false, 4, null);
                } else if (Intrinsics.m97797c(c24469a3.m96011b().getId(), str)) {
                    id2 = c24469a3.m96011b().getId();
                    C26866a.a.m104898f(C26866a.f81698a, this.f64428h, " initDefaultSubtitle() --> 使用之前选择的字幕 saved flag = " + id2, false, 4, null);
                }
                c24469a2 = c24469a3;
            }
        }
        if (id2.length() != 0) {
            c24469a = c24469a2;
        } else if (c24469a != null && c24469a.m96013d()) {
            String id3 = c24469a.m96011b().getId();
            C26866a.a.m104898f(C26866a.f81698a, this.f64428h, " initDefaultSubtitle() --> 没有设置默认语言 --> english set def language = " + id3, false, 4, null);
        } else if (list.isEmpty()) {
            c24469a = c24469a2;
        } else {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c24469a = c24469a2;
                    break;
                }
                C24469a c24469a4 = (C24469a) it2.next();
                if (c24469a4.m96013d()) {
                    id2 = c24469a4.m96011b().getId();
                    c24469a = c24469a4;
                    break;
                }
            }
            if (id2.length() == 0) {
                C26866a.a.m104898f(C26866a.f81698a, this.f64428h, " initDefaultSubtitle() --> 可能外部只读取到了数据库前面没下载的字幕 --> 没有对应的语言，不设置，需要用户手动设置或当前下载后自动设置上", false, 4, null);
                return;
            }
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C24469a c24469a5 = (C24469a) it3.next();
            this.f64424d.setSubtitlePath(c24469a5.m96011b().getPath(), AbstractC19718c.m82168b(c24469a5));
        }
        mo84132f(c24469a);
        if (c24469a != null) {
            c24469a.m96021l(true);
        }
        C20324a c20324a = this.f64425e;
        if (c20324a == null || (c3187b0M84140f = c20324a.m84140f()) == null) {
            return;
        }
        c3187b0M84140f.mo14858q(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: w */
    private final void m84123w(SimpleSubtitleView simpleSubtitleView) {
        if (simpleSubtitleView != null) {
            simpleSubtitleView.setBgColor(Utils.m27275a().getResources().getColor(R$color.black_80));
        }
        if (simpleSubtitleView != null) {
            simpleSubtitleView.setBgdRadius(AbstractC23384a.m92908b(8));
        }
        if (simpleSubtitleView != null) {
            simpleSubtitleView.initSubtitle(new C20321a(), false);
        } else {
            C26866a.a.m104898f(C26866a.f81698a, this.f64428h, " vdSubtitle --> initSubtitle() --> null", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: x */
    private final void m84124x(C24469a c24469a) {
    }

    /* JADX INFO: renamed from: y */
    private final void m84125y() {
        C3187b0 c3187b0M84139e;
        C3187b0 c3187b0M84138d;
        C20324a c20324a = this.f64425e;
        if (c20324a != null && (c3187b0M84138d = c20324a.m84138d()) != null) {
            c3187b0M84138d.mo14858q(null);
        }
        C20324a c20324a2 = this.f64425e;
        if (c20324a2 != null && (c3187b0M84139e = c20324a2.m84139e()) != null) {
            c3187b0M84139e.mo14858q(null);
        }
        this.f64424d.reset();
        C26866a.a.m104898f(C26866a.f81698a, this.f64428h, " reset() --> 重置资源", false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final void m84126z(boolean z11) {
    }

    @Override // mu.InterfaceC25911c
    /* JADX INFO: renamed from: K */
    public void mo81897K(boolean z11, DownloadBean bean) {
        Intrinsics.m97802h(bean, "bean");
        C26866a.a.m104898f(C26866a.f81698a, this.f64428h, " checkResult --> " + z11, false, 4, null);
        Function1 function1 = this.f64429i;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z11));
        }
    }

    @Override // com.transsion.ugcvideodetail.hepler.subtitle.InterfaceC20325b
    /* JADX INFO: renamed from: a */
    public void mo84127a(Function1 function1) {
        this.f64429i = function1;
    }

    @Override // com.transsion.ugcvideodetail.hepler.subtitle.InterfaceC20325b
    /* JADX INFO: renamed from: b */
    public void mo84128b(Function1 function1) {
        this.f64430j = function1;
    }

    @Override // com.transsion.ugcvideodetail.hepler.subtitle.InterfaceC20325b
    /* JADX INFO: renamed from: c */
    public void mo84129c(boolean z11) {
        this.f64431k = z11;
        if (z11) {
            this.f64424d.resume();
        } else {
            this.f64424d.pause();
        }
    }

    @Override // com.transsion.ugcvideodetail.hepler.subtitle.InterfaceC20325b
    /* JADX INFO: renamed from: d */
    public void mo84130d(long j11) {
        this.f64432l = j11;
    }

    @Override // com.transsion.ugcvideodetail.hepler.subtitle.InterfaceC20325b
    /* JADX INFO: renamed from: e */
    public void mo84131e() {
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this.f64421a), null, null, new UGCImmVideoSubtitleControlImp$checkSubtitle$1(this, null), 3, null);
    }

    @Override // com.transsion.ugcvideodetail.hepler.subtitle.InterfaceC20325b
    /* JADX INFO: renamed from: f */
    public void mo84132f(C24469a c24469a) {
        SubtitleDownloadTable subtitleDownloadTableM96011b;
        SubtitleDownloadTable subtitleDownloadTableM96011b2;
        Long delay;
        SubtitleDownloadTable subtitleDownloadTableM96011b3;
        SubtitleDownloadTable subtitleDownloadTableM96011b4;
        SubtitleDownloadTable subtitleDownloadTableM96011b5;
        SubtitleDownloadTable subtitleDownloadTableM96011b6;
        String path;
        C3187b0 c3187b0M84137c;
        C3187b0 c3187b0M84138d;
        List<C24469a> list;
        SubtitleDownloadTable subtitleDownloadTableM96011b7;
        C20324a c20324a = this.f64425e;
        if (c20324a != null && (c3187b0M84138d = c20324a.m84138d()) != null && (list = (List) c3187b0M84138d.m14847f()) != null) {
            for (C24469a c24469a2 : list) {
                c24469a2.m96021l(Intrinsics.m97797c(c24469a2.m96011b().getId(), (c24469a == null || (subtitleDownloadTableM96011b7 = c24469a.m96011b()) == null) ? null : subtitleDownloadTableM96011b7.getId()));
            }
        }
        Function1 function1 = this.f64430j;
        if (function1 != null) {
            function1.invoke(c24469a);
        }
        C20324a c20324a2 = this.f64425e;
        if (c20324a2 != null && (c3187b0M84137c = c20324a2.m84137c()) != null) {
            c3187b0M84137c.mo14858q(c24469a);
        }
        if (c24469a != null && (subtitleDownloadTableM96011b6 = c24469a.m96011b()) != null && (path = subtitleDownloadTableM96011b6.getPath()) != null) {
            m84108A();
            this.f64424d.selectSubtitle(path, AbstractC19718c.m82168b(c24469a), new InterfaceC25557b() { // from class: com.transsion.ugcvideodetail.hepler.subtitle.c
                @Override // p568l5.InterfaceC25557b
                /* JADX INFO: renamed from: a */
                public final void mo79480a(boolean z11) {
                    UGCImmVideoSubtitleControlImp.m84126z(z11);
                }
            });
        }
        C26866a.f81698a.m104912c(this.f64428h, "selectSubtitle delayDuration:" + ((c24469a == null || (subtitleDownloadTableM96011b5 = c24469a.m96011b()) == null) ? null : subtitleDownloadTableM96011b5.getDelay()) + ", name:" + ((c24469a == null || (subtitleDownloadTableM96011b4 = c24469a.m96011b()) == null) ? null : subtitleDownloadTableM96011b4.getLanName()) + ", isAutoDownload:" + ((c24469a == null || (subtitleDownloadTableM96011b3 = c24469a.m96011b()) == null) ? null : Boolean.valueOf(subtitleDownloadTableM96011b3.getIsAutoDownload())), true);
        if (c24469a != null && (subtitleDownloadTableM96011b2 = c24469a.m96011b()) != null && (delay = subtitleDownloadTableM96011b2.getDelay()) != null) {
            this.f64424d.subtitleDelay(delay.longValue());
        }
        if (c24469a != null && (subtitleDownloadTableM96011b = c24469a.m96011b()) != null) {
            if (!subtitleDownloadTableM96011b.getIsAutoDownload()) {
                C14496b.f50966a.m65344b().putString("k_subtitle_language", subtitleDownloadTableM96011b.getLanName());
                C19773d.f63089a.m82370b().putString("k_subtitle_select_lan", subtitleDownloadTableM96011b.getLan());
            }
            C28951b.f88586a.m111455e(Utils.m27275a().getString(R$string.ugc_imm_video_enable_toast, subtitleDownloadTableM96011b.getName()));
        }
        if (c24469a != null) {
            m84124x(c24469a);
        }
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this.f64421a), null, null, new UGCImmVideoSubtitleControlImp$selectSubtitle$6(c24469a, this, null), 3, null);
    }

    @Override // mu.InterfaceC25911c
    /* JADX INFO: renamed from: g */
    public void mo81898g(C24469a c24469a) {
        InterfaceC25911c.a.m101720b(this, c24469a);
    }

    @Override // com.transsion.ugcvideodetail.hepler.subtitle.InterfaceC20325b
    public void onDestroy() {
        m84125y();
        AbstractC26006c.m102054g(this.f64423c);
        this.f64424d.stop();
        this.f64424d.destroy();
        InterfaceC20331b.a aVar = InterfaceC20331b.f64452a;
        aVar.m84160b().mo84152e(this);
        aVar.m84160b().mo84150c(this.f64435o);
        C26866a.a.m104898f(C26866a.f81698a, this.f64428h, " onDestroy()", false, 4, null);
    }

    /* JADX INFO: renamed from: u */
    public final String m84133u() {
        return this.f64434n;
    }
}
