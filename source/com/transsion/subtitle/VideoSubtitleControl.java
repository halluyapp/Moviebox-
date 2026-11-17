package com.transsion.subtitle;

import android.app.Application;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.amazonaws.services.p059s3.model.BucketVersioningConfiguration;
import com.avery.subtitle.widget.SimpleSubtitleView;
import com.blankj.utilcode.util.AbstractC5806y;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.integration.constants.IntegrationConstants;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.video.VideoDetailPlayDao;
import com.transsion.baselib.report.C14482a;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.moviedetailapi.bean.DubsInfo;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.subtitle.dialog.SubtitleMainDialog2;
import com.transsion.subtitle.helper.AbstractC19718c;
import com.transsion.subtitle.helper.C19719d;
import com.transsion.subtitle.helper.LocalVideoUiType;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import mu.InterfaceC25909a;
import mu.InterfaceC25910b;
import mu.InterfaceC25911c;
import ng.AbstractC26006c;
import p528ju.C24469a;
import p550kj.C24662i;
import p568l5.InterfaceC25556a;
import p568l5.InterfaceC25557b;
import p743rh.C27287m;
import p913xm.C28615f;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoSubtitleControl {

    /* JADX INFO: renamed from: A */
    private final Lazy f62737A;

    /* JADX INFO: renamed from: B */
    private Map f62738B;

    /* JADX INFO: renamed from: C */
    private final C19652b f62739C;

    /* JADX INFO: renamed from: D */
    private final VideoSubtitleControl$downloadListener$1 f62740D;

    /* JADX INFO: renamed from: E */
    private long f62741E;

    /* JADX INFO: renamed from: F */
    private final Set f62742F;

    /* JADX INFO: renamed from: G */
    private boolean f62743G;

    /* JADX INFO: renamed from: H */
    private String f62744H;

    /* JADX INFO: renamed from: I */
    private final C19653c f62745I;

    /* JADX INFO: renamed from: a */
    private final FragmentActivity f62746a;

    /* JADX INFO: renamed from: b */
    private final String f62747b;

    /* JADX INFO: renamed from: c */
    private float f62748c;

    /* JADX INFO: renamed from: d */
    private List f62749d;

    /* JADX INFO: renamed from: e */
    private final Function1 f62750e;

    /* JADX INFO: renamed from: f */
    private final Function2 f62751f;

    /* JADX INFO: renamed from: g */
    private final Function3 f62752g;

    /* JADX INFO: renamed from: h */
    private final Function1 f62753h;

    /* JADX INFO: renamed from: i */
    private final Function1 f62754i;

    /* JADX INFO: renamed from: j */
    private final Function1 f62755j;

    /* JADX INFO: renamed from: k */
    private final Function2 f62756k;

    /* JADX INFO: renamed from: l */
    private List f62757l;

    /* JADX INFO: renamed from: m */
    private boolean f62758m;

    /* JADX INFO: renamed from: n */
    private long f62759n;

    /* JADX INFO: renamed from: o */
    private boolean f62760o;

    /* JADX INFO: renamed from: p */
    private DownloadBean f62761p;

    /* JADX INFO: renamed from: q */
    private C19719d f62762q;

    /* JADX INFO: renamed from: r */
    private LocalVideoUiType f62763r;

    /* JADX INFO: renamed from: s */
    private final InterfaceC25149n0 f62764s;

    /* JADX INFO: renamed from: t */
    private Map f62765t;

    /* JADX INFO: renamed from: u */
    private ViewGroup f62766u;

    /* JADX INFO: renamed from: v */
    private final Map f62767v;

    /* JADX INFO: renamed from: w */
    private final Map f62768w;

    /* JADX INFO: renamed from: x */
    private Function1 f62769x;

    /* JADX INFO: renamed from: y */
    private Map f62770y;

    /* JADX INFO: renamed from: z */
    private Map f62771z;

    /* JADX INFO: renamed from: com.transsion.subtitle.VideoSubtitleControl$a */
    public static final class C19651a implements InterfaceC25556a {
        C19651a() {
        }

        @Override // p568l5.InterfaceC25556a
        public long getCurrentPosition() {
            return VideoSubtitleControl.this.f62759n;
        }

        @Override // p568l5.InterfaceC25556a
        public Float getSpeed() {
            return Float.valueOf(VideoSubtitleControl.this.f62748c);
        }

        @Override // p568l5.InterfaceC25556a
        public boolean isPlaying() {
            return VideoSubtitleControl.this.m81877K();
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.VideoSubtitleControl$b */
    public static final class C19652b implements InterfaceC25911c {
        C19652b() {
        }

        @Override // mu.InterfaceC25911c
        /* JADX INFO: renamed from: K */
        public void mo81897K(boolean z11, DownloadBean bean) {
            Intrinsics.m97802h(bean, "bean");
            String resourceId = bean.getResourceId();
            DownloadBean downloadBean = VideoSubtitleControl.this.f62761p;
            if (Intrinsics.m97797c(resourceId, downloadBean != null ? downloadBean.getResourceId() : null) && z11 && VideoSubtitleControl.this.f62757l.isEmpty()) {
                C19655a.f62783a.m81952a(VideoSubtitleControl.this.getClass().getSimpleName() + " --> -------- 检测到有字幕但是在下载中");
            }
        }

        @Override // mu.InterfaceC25911c
        /* JADX INFO: renamed from: g */
        public void mo81898g(C24469a c24469a) {
            InterfaceC25911c.a.m101720b(this, c24469a);
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.VideoSubtitleControl$c */
    public static final class C19653c implements InterfaceC25910b {
        C19653c() {
        }

        @Override // mu.InterfaceC25910b
        /* JADX INFO: renamed from: a */
        public SimpleSubtitleView mo81899a() {
            return (SimpleSubtitleView) VideoSubtitleControl.this.f62765t.get(IntegrationConstants.TAB_BAR_POSITION_DEFAULT);
        }

        @Override // mu.InterfaceC25910b
        /* JADX INFO: renamed from: b */
        public void mo81900b(boolean z11) {
            VideoSubtitleControl.this.m81835P(z11);
            VideoSubtitleControl.this.m81837V(null, z11);
        }

        @Override // mu.InterfaceC25910b
        /* JADX INFO: renamed from: c */
        public void mo81901c(String msg) {
            Intrinsics.m97802h(msg, "msg");
            Function1 function1 = VideoSubtitleControl.this.f62755j;
            if (function1 != null) {
                function1.invoke(msg);
            }
        }

        @Override // mu.InterfaceC25910b
        /* JADX INFO: renamed from: d */
        public SimpleSubtitleView mo81902d() {
            return (SimpleSubtitleView) VideoSubtitleControl.this.f62765t.get(IntegrationConstants.TAB_BAR_POSITION_TOP);
        }

        @Override // mu.InterfaceC25910b
        /* JADX INFO: renamed from: e */
        public void mo81903e(C24469a c24469a, C24469a c24469a2, boolean z11) {
            String lanName;
            SubtitleDownloadTable subtitleDownloadTableM96011b;
            SubtitleDownloadTable subtitleDownloadTableM96011b2;
            SubtitleDownloadTable subtitleDownloadTableM96011b3;
            SubtitleDownloadTable subtitleDownloadTableM96011b4;
            String lan;
            SubtitleDownloadTable subtitleDownloadTableM96011b5;
            SubtitleDownloadTable subtitleDownloadTableM96011b6;
            SubtitleDownloadTable subtitleDownloadTableM96011b7;
            VideoSubtitleControl.this.f62743G = z11;
            String lan2 = null;
            C19655a.f62783a.m81952a(VideoSubtitleControl.this.getClass().getSimpleName() + " --> onSubtitleSelect() --> isOpenBilingual = " + z11 + " --> top = " + ((c24469a == null || (subtitleDownloadTableM96011b7 = c24469a.m96011b()) == null) ? null : subtitleDownloadTableM96011b7.getName()) + " --> bottom = " + ((c24469a2 == null || (subtitleDownloadTableM96011b6 = c24469a2.m96011b()) == null) ? null : subtitleDownloadTableM96011b6.getName()));
            Function3 function3 = VideoSubtitleControl.this.f62752g;
            String str = "";
            if (c24469a == null || (subtitleDownloadTableM96011b5 = c24469a.m96011b()) == null || (lanName = subtitleDownloadTableM96011b5.getLanName()) == null) {
                lanName = "";
            }
            if (c24469a != null && (subtitleDownloadTableM96011b4 = c24469a.m96011b()) != null && (lan = subtitleDownloadTableM96011b4.getLan()) != null) {
                str = lan;
            }
            function3.invoke(lanName, str, Integer.valueOf((c24469a == null || (subtitleDownloadTableM96011b3 = c24469a.m96011b()) == null) ? 1 : subtitleDownloadTableM96011b3.getType()));
            Function2 function2 = VideoSubtitleControl.this.f62756k;
            String lan3 = (c24469a == null || (subtitleDownloadTableM96011b2 = c24469a.m96011b()) == null) ? null : subtitleDownloadTableM96011b2.getLan();
            if (c24469a2 != null && (subtitleDownloadTableM96011b = c24469a2.m96011b()) != null) {
                lan2 = subtitleDownloadTableM96011b.getLan();
            }
            function2.invoke(lan3, lan2);
            VideoSubtitleControl videoSubtitleControl = VideoSubtitleControl.this;
            videoSubtitleControl.m81845d0(c24469a, (SimpleSubtitleView) videoSubtitleControl.f62765t.get(IntegrationConstants.TAB_BAR_POSITION_TOP), true);
            VideoSubtitleControl videoSubtitleControl2 = VideoSubtitleControl.this;
            videoSubtitleControl2.m81845d0(c24469a2, (SimpleSubtitleView) videoSubtitleControl2.f62765t.get(IntegrationConstants.TAB_BAR_POSITION_DEFAULT), false);
            VideoSubtitleControl.this.f62742F.clear();
            if (c24469a != null) {
                VideoSubtitleControl.this.f62742F.add(c24469a);
            }
            if (c24469a2 != null) {
                VideoSubtitleControl.this.f62742F.add(c24469a2);
            }
        }

        @Override // mu.InterfaceC25910b
        /* JADX INFO: renamed from: f */
        public void mo81904f(boolean z11) {
            VideoSubtitleControl.this.f62743G = z11;
            VideoSubtitleControl.this.m81836U(z11);
        }

        @Override // mu.InterfaceC25910b
        /* JADX INFO: renamed from: g */
        public boolean mo81905g() {
            return VideoSubtitleControl.this.f62743G;
        }

        @Override // mu.InterfaceC25910b
        public ViewGroup getSubtitleViewGroup() {
            return VideoSubtitleControl.this.f62766u;
        }

        @Override // mu.InterfaceC25910b
        /* JADX INFO: renamed from: h */
        public void mo81906h(DubsInfo info) {
            Intrinsics.m97802h(info, "info");
            VideoSubtitleControl.this.f62753h.invoke(info);
        }

        @Override // mu.InterfaceC25910b
        /* JADX INFO: renamed from: i */
        public C19719d mo81907i() {
            return VideoSubtitleControl.this.f62762q;
        }

        @Override // mu.InterfaceC25910b
        /* JADX INFO: renamed from: j */
        public List mo81908j() {
            return VideoSubtitleControl.this.f62757l;
        }

        @Override // mu.InterfaceC25910b
        /* JADX INFO: renamed from: k */
        public boolean mo81909k() {
            int i11 = C14496b.f50966a.m65344b().getInt("subtitle_options_position", 10);
            C19719d c19719d = VideoSubtitleControl.this.f62762q;
            if (c19719d != null) {
                c19719d.m82180j(VideoSubtitleControl.this.f62763r, VideoSubtitleControl.this.f62766u, i11);
            }
            return !Intrinsics.m97797c(VideoSubtitleControl.this.f62744H, BucketVersioningConfiguration.OFF);
        }

        @Override // mu.InterfaceC25910b
        /* JADX INFO: renamed from: l */
        public void mo81910l(C24469a c24469a, long j11) {
            if (c24469a != null) {
                VideoSubtitleControl.this.m81838W(c24469a);
            }
            String strM96010a = c24469a != null ? c24469a.m96010a() : null;
            if (strM96010a != null) {
                int iHashCode = strM96010a.hashCode();
                if (iHashCode != 0) {
                    if (iHashCode != 50770) {
                        if (iHashCode == 51560 && strM96010a.equals("2nd")) {
                            SimpleSubtitleView simpleSubtitleView = (SimpleSubtitleView) VideoSubtitleControl.this.f62765t.get(IntegrationConstants.TAB_BAR_POSITION_DEFAULT);
                            if (simpleSubtitleView != null) {
                                simpleSubtitleView.subtitleDelay(j11);
                                return;
                            }
                            return;
                        }
                    } else if (strM96010a.equals("1st")) {
                        SimpleSubtitleView simpleSubtitleView2 = (SimpleSubtitleView) VideoSubtitleControl.this.f62765t.get(IntegrationConstants.TAB_BAR_POSITION_TOP);
                        if (simpleSubtitleView2 != null) {
                            simpleSubtitleView2.subtitleDelay(j11);
                            return;
                        }
                        return;
                    }
                } else if (strM96010a.equals("")) {
                    SimpleSubtitleView simpleSubtitleView3 = (SimpleSubtitleView) VideoSubtitleControl.this.f62765t.get(IntegrationConstants.TAB_BAR_POSITION_TOP);
                    if (simpleSubtitleView3 != null) {
                        simpleSubtitleView3.subtitleDelay(j11);
                        return;
                    }
                    return;
                }
            }
            C19655a.f62783a.m81952a(VideoSubtitleControl.this.getClass().getSimpleName() + " --> onSubtitleDelay() --> 异常");
        }
    }

    public VideoSubtitleControl(FragmentActivity activity, String str, float f11, List dubs, Function1 loadingCallback, Function2 controlCallback, Function3 subtitleSelected, Function1 audioSelected, Function1 setSublistData, Function1 function1, Function2 subtitleSelectedBilingual) {
        Intrinsics.m97802h(activity, "activity");
        Intrinsics.m97802h(dubs, "dubs");
        Intrinsics.m97802h(loadingCallback, "loadingCallback");
        Intrinsics.m97802h(controlCallback, "controlCallback");
        Intrinsics.m97802h(subtitleSelected, "subtitleSelected");
        Intrinsics.m97802h(audioSelected, "audioSelected");
        Intrinsics.m97802h(setSublistData, "setSublistData");
        Intrinsics.m97802h(subtitleSelectedBilingual, "subtitleSelectedBilingual");
        this.f62746a = activity;
        this.f62747b = str;
        this.f62748c = f11;
        this.f62749d = dubs;
        this.f62750e = loadingCallback;
        this.f62751f = controlCallback;
        this.f62752g = subtitleSelected;
        this.f62753h = audioSelected;
        this.f62754i = setSublistData;
        this.f62755j = function1;
        this.f62756k = subtitleSelectedBilingual;
        this.f62757l = new ArrayList();
        this.f62763r = LocalVideoUiType.MIDDLE;
        this.f62764s = AbstractC25153o0.m99079a(C25220y0.m99269c());
        this.f62765t = new LinkedHashMap();
        this.f62767v = new LinkedHashMap();
        this.f62768w = new LinkedHashMap();
        this.f62770y = new LinkedHashMap();
        this.f62771z = new LinkedHashMap();
        this.f62737A = LazyKt.m97097b(new Function0() { // from class: com.transsion.subtitle.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VideoSubtitleControl.m81867s0();
            }
        });
        this.f62738B = new LinkedHashMap();
        C19652b c19652b = new C19652b();
        this.f62739C = c19652b;
        VideoSubtitleControl$downloadListener$1 videoSubtitleControl$downloadListener$1 = new VideoSubtitleControl$downloadListener$1(this);
        this.f62740D = videoSubtitleControl$downloadListener$1;
        this.f62762q = new C19719d(activity);
        C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> init{} --> VideoSubtitleControl --> 创建了");
        InterfaceC19714h.a aVar = InterfaceC19714h.f62935a;
        aVar.m82148b().mo81940b(videoSubtitleControl$downloadListener$1);
        aVar.m82148b().mo81944f(c19652b);
        this.f62742F = new LinkedHashSet();
        this.f62744H = "";
        this.f62745I = new C19653c();
    }

    public /* synthetic */ VideoSubtitleControl(FragmentActivity fragmentActivity, String str, float f11, List list, Function1 function1, Function2 function2, Function3 function3, Function1 function4, Function1 function5, Function1 function6, Function2 function7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, str, f11, (i11 & 8) != 0 ? CollectionsKt.m97506l() : list, function1, function2, function3, function4, function5, (i11 & 512) != 0 ? null : function6, function7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final VideoDetailPlayDao m81830G() {
        return (VideoDetailPlayDao) this.f62737A.getValue();
    }

    /* JADX INFO: renamed from: H */
    private final void m81831H() {
        for (Map.Entry entry : this.f62765t.entrySet()) {
            SimpleSubtitleView simpleSubtitleView = (SimpleSubtitleView) entry.getValue();
            if (simpleSubtitleView != null) {
                simpleSubtitleView.turnOff(true);
            }
            SimpleSubtitleView simpleSubtitleView2 = (SimpleSubtitleView) entry.getValue();
            if (simpleSubtitleView2 != null) {
                simpleSubtitleView2.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01ce  */
    /* JADX INFO: renamed from: I */
    private final void m81832I() {
        String lanName;
        SubtitleDownloadTable subtitleDownloadTableM96011b;
        Long delay;
        SubtitleDownloadTable subtitleDownloadTableM96011b2;
        String path;
        SubtitleDownloadTable subtitleDownloadTableM96011b3;
        SubtitleDownloadTable subtitleDownloadTableM96011b4;
        String lan;
        SubtitleDownloadTable subtitleDownloadTableM96011b5;
        Locale localeM82167a = AbstractC19718c.m82167a();
        C19655a c19655a = C19655a.f62783a;
        c19655a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> initDefaultSubtitle() --> cur language = " + localeM82167a.getLanguage() + " -- country = " + localeM82167a.getCountry());
        String str = "";
        String string = C14496b.f50966a.m65344b().getString("k_subtitle_language", "");
        DownloadBean downloadBean = this.f62761p;
        C24469a c24469a = null;
        String subtitleSelectId = downloadBean != null ? downloadBean.getSubtitleSelectId() : null;
        c19655a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> initDefaultSubtitle() --> savedDiffId = " + subtitleSelectId + " -- savedLan = " + string);
        String id2 = "";
        C24469a c24469a2 = null;
        for (C24469a c24469a3 : this.f62757l) {
            if (c24469a3.m96013d()) {
                if (Intrinsics.m97797c(c24469a3.m96011b().getLan(), "en")) {
                    c24469a = c24469a3;
                }
                if ((subtitleSelectId == null || subtitleSelectId.length() == 0) && Intrinsics.m97797c(c24469a3.m96011b().getLanAbbr(), localeM82167a.getLanguage())) {
                    id2 = c24469a3.m96011b().getId();
                    C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> initDefaultSubtitle() --> 没有自己选择的默认语言，使用手机语言 -- phone set def language = " + id2);
                } else if (Intrinsics.m97797c(c24469a3.m96011b().getId(), subtitleSelectId)) {
                    id2 = c24469a3.m96011b().getId();
                    C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> initDefaultSubtitle() --> 使用之前选择的字幕 saved flag = " + id2);
                } else if (subtitleSelectId == null || subtitleSelectId.length() == 0) {
                    if (Intrinsics.m97797c(c24469a3.m96011b().getLanName(), string)) {
                        id2 = c24469a3.m96011b().getId();
                        C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> initDefaultSubtitle() --> 使用之前选择的语言 local set savedLan = " + string);
                    }
                }
                c24469a2 = c24469a3;
            }
        }
        if (id2.length() != 0) {
            c24469a = c24469a2;
        } else if (c24469a != null && c24469a.m96013d()) {
            id2 = c24469a.m96011b().getId();
            C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> initDefaultSubtitle() --> 没有设置默认语言 --> english set def language = " + id2);
        } else if (this.f62757l.isEmpty()) {
            c24469a = c24469a2;
        } else {
            Iterator it = this.f62757l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c24469a = c24469a2;
                    break;
                }
                C24469a c24469a4 = (C24469a) it.next();
                if (c24469a4.m96013d()) {
                    id2 = c24469a4.m96011b().getId();
                    c24469a = c24469a4;
                    break;
                }
            }
            if (id2.length() == 0) {
                C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> initDefaultSubtitle() --> 可能外部只读取到了数据库前面没下载的字幕 --> 没有对应的语言，不设置，需要用户手动设置或当前下载后自动设置上");
                return;
            }
        }
        this.f62744H = id2;
        Function3 function3 = this.f62752g;
        if (c24469a == null || (subtitleDownloadTableM96011b5 = c24469a.m96011b()) == null || (lanName = subtitleDownloadTableM96011b5.getLanName()) == null) {
            lanName = "";
        }
        if (c24469a != null && (subtitleDownloadTableM96011b4 = c24469a.m96011b()) != null && (lan = subtitleDownloadTableM96011b4.getLan()) != null) {
            str = lan;
        }
        function3.invoke(lanName, str, Integer.valueOf((c24469a == null || (subtitleDownloadTableM96011b3 = c24469a.m96011b()) == null) ? 1 : subtitleDownloadTableM96011b3.getType()));
        if (c24469a != null && (subtitleDownloadTableM96011b2 = c24469a.m96011b()) != null && (path = subtitleDownloadTableM96011b2.getPath()) != null) {
            Iterator it2 = this.f62765t.entrySet().iterator();
            while (it2.hasNext()) {
                SimpleSubtitleView simpleSubtitleView = (SimpleSubtitleView) ((Map.Entry) it2.next()).getValue();
                if (simpleSubtitleView != null) {
                    simpleSubtitleView.setDefaultSubtitle(path);
                }
            }
        }
        if (c24469a != null) {
            c24469a.m96021l(true);
        }
        if (c24469a != null && (subtitleDownloadTableM96011b = c24469a.m96011b()) != null && (delay = subtitleDownloadTableM96011b.getDelay()) != null) {
            long jLongValue = delay.longValue();
            C26866a.f81698a.m104912c(C14482a.f50937a.m65273a(), "default delayDuration = " + jLongValue, true);
            Iterator it3 = this.f62765t.entrySet().iterator();
            while (it3.hasNext()) {
                SimpleSubtitleView simpleSubtitleView2 = (SimpleSubtitleView) ((Map.Entry) it3.next()).getValue();
                if (simpleSubtitleView2 != null) {
                    simpleSubtitleView2.subtitleDelay(jLongValue);
                }
            }
        }
        if (c24469a != null) {
            this.f62742F.add(c24469a);
        }
        m81845d0(c24469a, (SimpleSubtitleView) this.f62765t.get(IntegrationConstants.TAB_BAR_POSITION_TOP), true);
    }

    /* JADX INFO: renamed from: J */
    private final void m81833J(SimpleSubtitleView simpleSubtitleView) {
        if (simpleSubtitleView != null) {
            simpleSubtitleView.initSubtitle(new C19651a(), false);
            return;
        }
        C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> vdSubtitle --> initSubtitle() --> null");
    }

    /* JADX INFO: renamed from: L */
    private final boolean m81834L() {
        Iterator it = this.f62757l.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (!((C24469a) it.next()).m96011b().isInner()) {
                i11++;
            }
        }
        return i11 > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public final void m81835P(boolean z11) {
        C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> onSubtitleSwitchClick() --> turnOn = " + z11 + " --> 字幕开关状态变化");
        if (z11) {
            this.f62744H = "";
            m81856l0();
        } else {
            this.f62744H = BucketVersioningConfiguration.OFF;
            m81831H();
        }
        if (!z11) {
            this.f62752g.invoke(BucketVersioningConfiguration.OFF, BucketVersioningConfiguration.OFF, 0);
        } else if (!this.f62742F.isEmpty()) {
            C24469a c24469a = (C24469a) CollectionsKt.m97358h0(this.f62742F);
            Function3 function3 = this.f62752g;
            String lanName = c24469a.m96011b().getLanName();
            if (lanName == null) {
                lanName = "";
            }
            String lan = c24469a.m96011b().getLan();
            function3.invoke(lanName, lan != null ? lan : "", Integer.valueOf(c24469a.m96011b().getType()));
        }
        if (z11 && m81834L()) {
            m81858m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public final void m81836U(boolean z11) {
        String str = this.f62747b;
        if (str == null || str.length() == 0) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("bilingual", String.valueOf(z11));
        C24662i.f75350a.m96881p(this.f62747b, linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public final void m81837V(C24469a c24469a, boolean z11) {
        String subjectId;
        String resourceId;
        String lan;
        String lanName;
        SubtitleDownloadTable subtitleDownloadTableM96011b;
        SubtitleDownloadTable subtitleDownloadTableM96011b2;
        String id2;
        SubtitleDownloadTable subtitleDownloadTableM96011b3;
        SubtitleDownloadTable subtitleDownloadTableM96011b4;
        SubtitleDownloadTable subtitleDownloadTableM96011b5;
        SubtitleDownloadTable subtitleDownloadTableM96011b6;
        SubtitleDownloadTable subtitleDownloadTableM96011b7;
        SubtitleDownloadTable subtitleDownloadTableM96011b8;
        String str = this.f62747b;
        if (str == null || str.length() == 0) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DownloadBean downloadBean = this.f62761p;
        String str2 = "";
        if (downloadBean == null || (subjectId = downloadBean.getSubjectId()) == null) {
            subjectId = "";
        }
        linkedHashMap.put("subject_id", subjectId);
        DownloadBean downloadBean2 = this.f62761p;
        if (downloadBean2 == null || (resourceId = downloadBean2.getResourceId()) == null) {
            resourceId = "";
        }
        linkedHashMap.put("resource_id", resourceId);
        int se2 = 0;
        Integer numValueOf = null;
        if (((c24469a == null || (subtitleDownloadTableM96011b8 = c24469a.m96011b()) == null) ? 0 : subtitleDownloadTableM96011b8.getEp()) > 0) {
            linkedHashMap.put("ep", String.valueOf((c24469a == null || (subtitleDownloadTableM96011b7 = c24469a.m96011b()) == null) ? null : Integer.valueOf(subtitleDownloadTableM96011b7.getEp())));
        }
        if (c24469a != null && (subtitleDownloadTableM96011b6 = c24469a.m96011b()) != null) {
            se2 = subtitleDownloadTableM96011b6.getSe();
        }
        if (se2 > 0) {
            linkedHashMap.put("se", String.valueOf((c24469a == null || (subtitleDownloadTableM96011b5 = c24469a.m96011b()) == null) ? null : Integer.valueOf(subtitleDownloadTableM96011b5.getSe())));
        }
        if (c24469a == null || (subtitleDownloadTableM96011b4 = c24469a.m96011b()) == null || (lan = subtitleDownloadTableM96011b4.getLan()) == null) {
            lan = "";
        }
        linkedHashMap.put("lan", lan);
        if (c24469a == null || (subtitleDownloadTableM96011b3 = c24469a.m96011b()) == null || (lanName = subtitleDownloadTableM96011b3.getLanName()) == null) {
            lanName = "";
        }
        linkedHashMap.put("lan_name", lanName);
        if (c24469a != null && (subtitleDownloadTableM96011b2 = c24469a.m96011b()) != null && (id2 = subtitleDownloadTableM96011b2.getId()) != null) {
            str2 = id2;
        }
        linkedHashMap.put("id", str2);
        if (c24469a != null && (subtitleDownloadTableM96011b = c24469a.m96011b()) != null) {
            numValueOf = Integer.valueOf(subtitleDownloadTableM96011b.getType());
        }
        linkedHashMap.put(NativeComponentConstants.KEY_COMPONENT_TYPE, String.valueOf(numValueOf));
        linkedHashMap.put("result", z11 ? "1" : "0");
        C24662i.f75350a.m96884s(this.f62747b, "subtitle_switch", linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public final void m81838W(C24469a c24469a) {
        String str;
        String subjectId;
        String resourceId;
        if (this.f62738B.containsKey(c24469a.m96011b().getId()) || (str = this.f62747b) == null || str.length() == 0) {
            return;
        }
        this.f62738B.put(c24469a.m96011b().getId(), "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DownloadBean downloadBean = this.f62761p;
        if (downloadBean == null || (subjectId = downloadBean.getSubjectId()) == null) {
            subjectId = "";
        }
        linkedHashMap.put("subject_id", subjectId);
        DownloadBean downloadBean2 = this.f62761p;
        if (downloadBean2 == null || (resourceId = downloadBean2.getResourceId()) == null) {
            resourceId = "";
        }
        linkedHashMap.put("resource_id", resourceId);
        if (c24469a.m96011b().getEp() > 0) {
            linkedHashMap.put("ep", String.valueOf(c24469a.m96011b().getEp()));
        }
        if (c24469a.m96011b().getSe() > 0) {
            linkedHashMap.put("se", String.valueOf(c24469a.m96011b().getSe()));
        }
        String lan = c24469a.m96011b().getLan();
        if (lan == null) {
            lan = "";
        }
        linkedHashMap.put("lan", lan);
        String lanName = c24469a.m96011b().getLanName();
        linkedHashMap.put("lan_name", lanName != null ? lanName : "");
        linkedHashMap.put("id", c24469a.m96011b().getId());
        linkedHashMap.put(NativeComponentConstants.KEY_COMPONENT_TYPE, String.valueOf(c24469a.m96011b().getType()));
        C24662i.f75350a.m96884s(this.f62747b, "subtitle_sync", linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public final void m81839Y(C24469a c24469a) {
        SubtitleDownloadTable subtitleDownloadTableM96011b;
        SubtitleDownloadTable subtitleDownloadTableM96011b2;
        SubtitleDownloadTable subtitleDownloadTableM96011b3;
        SubtitleDownloadTable subtitleDownloadTableM96011b4;
        if (c24469a != null && (subtitleDownloadTableM96011b4 = c24469a.m96011b()) != null && subtitleDownloadTableM96011b4.isInner()) {
            C14496b.f50966a.m65344b().putString("k_subtitle_language", c24469a.m96011b().getLanName());
        }
        C19655a c19655a = C19655a.f62783a;
        String simpleName = VideoSubtitleControl.class.getSimpleName();
        DownloadBean downloadBean = this.f62761p;
        c19655a.m81952a(simpleName + " --> saveSelectedFlag() --> saveSelectId = " + (downloadBean != null ? downloadBean.getSubjectId() : null) + " -- id = " + ((c24469a == null || (subtitleDownloadTableM96011b3 = c24469a.m96011b()) == null) ? null : subtitleDownloadTableM96011b3.getId()));
        DownloadBean downloadBean2 = this.f62761p;
        if (downloadBean2 != null) {
            downloadBean2.setSubtitleSelectId((c24469a == null || (subtitleDownloadTableM96011b2 = c24469a.m96011b()) == null) ? null : subtitleDownloadTableM96011b2.getId());
        }
        Function1 function1 = this.f62769x;
        if (function1 != null) {
            function1.invoke((c24469a == null || (subtitleDownloadTableM96011b = c24469a.m96011b()) == null) ? null : subtitleDownloadTableM96011b.getId());
        }
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new VideoSubtitleControl$saveSelectedFlag$1(this, c24469a, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final void m81841a0(VideoSubtitleControl videoSubtitleControl, View view) {
        Iterator it = videoSubtitleControl.f62771z.entrySet().iterator();
        while (it.hasNext()) {
            Function1 function1 = (Function1) ((Map.Entry) it.next()).getValue();
            Intrinsics.m97799e(view);
            function1.invoke(view);
        }
        videoSubtitleControl.m81858m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public final void m81845d0(final C24469a c24469a, final SimpleSubtitleView simpleSubtitleView, final boolean z11) {
        String id2;
        SubtitleDownloadTable subtitleDownloadTableM96011b;
        if (c24469a == null || (subtitleDownloadTableM96011b = c24469a.m96011b()) == null || (id2 = subtitleDownloadTableM96011b.getId()) == null) {
            id2 = "";
        }
        this.f62744H = id2;
        if (c24469a == null) {
            if (simpleSubtitleView != null) {
                simpleSubtitleView.turnOff(true);
                simpleSubtitleView.setVisibility(8);
            }
            C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> setSubtitle() --> " + (z11 ? "topBean" : "bottomBean") + " == null --> isTop = " + z11 + " --> view.hashCode = " + (simpleSubtitleView != null ? simpleSubtitleView.hashCode() : 0));
            return;
        }
        if (simpleSubtitleView == null) {
            C19655a.f62783a.m81953b(VideoSubtitleControl.class.getSimpleName() + " --> setSubtitle() --> subtitleView ==null --> isTop = " + z11);
            return;
        }
        simpleSubtitleView.setVisibility(0);
        String path = c24469a.m96011b().getPath();
        if (path == null) {
            path = "";
        }
        simpleSubtitleView.setSubtitlePath(path, AbstractC19718c.m82168b(c24469a));
        String path2 = c24469a.m96011b().getPath();
        simpleSubtitleView.selectSubtitle(path2 != null ? path2 : "", AbstractC19718c.m82168b(c24469a), new InterfaceC25557b() { // from class: com.transsion.subtitle.e
            @Override // p568l5.InterfaceC25557b
            /* JADX INFO: renamed from: a */
            public final void mo79480a(boolean z12) {
                VideoSubtitleControl.m81847e0(this.f62815a, simpleSubtitleView, c24469a, z11, simpleSubtitleView, z12);
            }
        });
        Function1 function1 = this.f62769x;
        if (function1 != null) {
            function1.invoke(c24469a.m96011b().getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final void m81847e0(VideoSubtitleControl videoSubtitleControl, SimpleSubtitleView simpleSubtitleView, C24469a c24469a, boolean z11, SimpleSubtitleView simpleSubtitleView2, boolean z12) {
        videoSubtitleControl.f62750e.invoke(Boolean.FALSE);
        simpleSubtitleView.turnOff(false);
        simpleSubtitleView.refreshImmediately();
        InterfaceC19714h.f62935a.m82148b().mo81945g(c24469a);
        Long delay = c24469a.m96011b().getDelay();
        if (delay != null) {
            simpleSubtitleView.subtitleDelay(delay.longValue());
        }
        C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> setSubtitle() --> refreshImmediately() --> 展示字幕 --> bean.dbBean.name = " + c24469a.m96011b().getName() + " --> isTop = " + z11 + "  --> view.hashCode = " + simpleSubtitleView2.hashCode() + " -- path = " + c24469a.m96011b().getPath());
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m81854k0(VideoSubtitleControl videoSubtitleControl, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        videoSubtitleControl.m81893j0(z11, z12);
    }

    /* JADX INFO: renamed from: l0 */
    private final void m81856l0() {
        int i11 = 0;
        for (Object obj : this.f62742F) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            C24469a c24469a = (C24469a) obj;
            if (i11 == 0) {
                m81845d0(c24469a, (SimpleSubtitleView) this.f62765t.get(IntegrationConstants.TAB_BAR_POSITION_TOP), true);
            } else if (i11 == 1) {
                m81845d0(c24469a, (SimpleSubtitleView) this.f62765t.get(IntegrationConstants.TAB_BAR_POSITION_DEFAULT), false);
            }
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: m0 */
    private final void m81858m0() {
        if (this.f62757l.isEmpty()) {
            m81893j0(false, true);
            return;
        }
        FragmentActivity fragmentActivity = this.f62746a;
        SubtitleMainDialog2.Companion c19662a = SubtitleMainDialog2.INSTANCE;
        boolean z11 = this.f62763r == LocalVideoUiType.LAND;
        boolean zM97797c = Intrinsics.m97797c(this.f62744H, BucketVersioningConfiguration.OFF);
        List list = this.f62757l;
        List list2 = this.f62749d;
        DownloadBean downloadBean = this.f62761p;
        LocalVideoUiType localVideoUiType = this.f62763r;
        C19719d c19719d = this.f62762q;
        SubtitleMainDialog2 subtitleMainDialog2M81999b = c19662a.m81999b(z11, zM97797c, list, list2, downloadBean, localVideoUiType, Integer.valueOf(c19719d != null ? c19719d.m82178h(localVideoUiType) : AbstractC5806y.m27487c()), this.f62747b);
        subtitleMainDialog2M81999b.m81994F0(this.f62745I);
        subtitleMainDialog2M81999b.m81997J0(new Function1() { // from class: com.transsion.subtitle.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoSubtitleControl.m81860n0(this.f62791a, (C24469a) obj);
            }
        });
        subtitleMainDialog2M81999b.m65436k0(fragmentActivity, "fragment_subtitle_main_dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final Unit m81860n0(VideoSubtitleControl videoSubtitleControl, C24469a bean) {
        Intrinsics.m97802h(bean, "bean");
        videoSubtitleControl.m81862o0(bean);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: o0 */
    private final void m81862o0(C24469a c24469a) {
        String string;
        C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> subtitleSelectFromSearch() --> 搜索字幕选中 --> 直接设置使用 --> isOpenBilingual = " + this.f62743G);
        String str = "";
        if (this.f62743G) {
            for (C24469a c24469a2 : this.f62757l) {
                if (c24469a2.m96015f() && TextUtils.equals(c24469a2.m96010a(), "1st")) {
                    c24469a2.m96021l(false);
                    c24469a2.m96016g("");
                    C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> subtitleSelectFromSearch() --> 这里默认替换 1st --> it.isSelect = false");
                }
            }
            for (C24469a c24469a3 : this.f62757l) {
                if (Intrinsics.m97797c(c24469a3.m96011b().getId(), c24469a.m96011b().getId())) {
                    c24469a3.m96021l(true);
                    c24469a3.m96016g("1st");
                    C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> subtitleSelectFromSearch() --> 这里默认替换 1st --> it.isSelect = true");
                }
            }
        } else {
            for (C24469a c24469a4 : this.f62757l) {
                if (c24469a4.m96015f()) {
                    c24469a4.m96021l(false);
                }
            }
            C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> subtitleSelectFromSearch() --> 能从搜索选中回调，一定在字幕列表里面了");
            for (C24469a c24469a5 : this.f62757l) {
                if (Intrinsics.m97797c(c24469a.m96011b().getId(), c24469a5.m96011b().getId())) {
                    c24469a5.m96021l(true);
                }
            }
            C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> subtitleSelectFromSearch() --> 找到ID相同的哪个设置 选中");
        }
        m81845d0(c24469a, (SimpleSubtitleView) this.f62765t.get(IntegrationConstants.TAB_BAR_POSITION_TOP), true);
        C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> subtitleSelectFromSearch() --> 设置字幕 --> bean.id = " + c24469a.m96011b().getId());
        Function1 function1 = this.f62755j;
        if (function1 != null) {
            Application applicationM27275a = Utils.m27275a();
            if (applicationM27275a != null && (string = applicationM27275a.getString(R$string.subtitle_switch_toast)) != null) {
                str = string;
            }
            function1.invoke(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final VideoDetailPlayDao m81867s0() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64865B1();
    }

    /* JADX INFO: renamed from: E */
    public final void m81875E(LocalVideoUiType uitType, Function2 switchCallback, Function1 settingCallback) {
        Intrinsics.m97802h(uitType, "uitType");
        Intrinsics.m97802h(switchCallback, "switchCallback");
        Intrinsics.m97802h(settingCallback, "settingCallback");
        this.f62770y.put(uitType, switchCallback);
        this.f62771z.put(uitType, settingCallback);
    }

    /* JADX INFO: renamed from: F */
    public final Map m81876F() {
        return new LinkedHashMap();
    }

    /* JADX INFO: renamed from: K */
    public final boolean m81877K() {
        return this.f62760o;
    }

    /* JADX INFO: renamed from: M */
    public final void m81878M() {
        C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> onDestroy()");
        for (Map.Entry entry : this.f62765t.entrySet()) {
            SimpleSubtitleView simpleSubtitleView = (SimpleSubtitleView) entry.getValue();
            if (simpleSubtitleView != null) {
                simpleSubtitleView.stop();
            }
            SimpleSubtitleView simpleSubtitleView2 = (SimpleSubtitleView) entry.getValue();
            if (simpleSubtitleView2 != null) {
                simpleSubtitleView2.destroy();
            }
        }
        if (this.f62758m) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Iterator it = this.f62767v.entrySet().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Map) ((Map.Entry) it.next()).getValue()).entrySet().iterator();
                    while (it2.hasNext()) {
                        SimpleSubtitleView simpleSubtitleView3 = (SimpleSubtitleView) ((Map.Entry) it2.next()).getValue();
                        if (simpleSubtitleView3 != null) {
                            simpleSubtitleView3.destroy();
                        }
                    }
                }
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
        }
        this.f62765t.clear();
        this.f62770y.clear();
        this.f62771z.clear();
        InterfaceC19714h.a aVar = InterfaceC19714h.f62935a;
        aVar.m82148b().mo81941c(this.f62740D);
        aVar.m82148b().mo81943e(this.f62739C);
        aVar.m82148b().reset();
    }

    /* JADX INFO: renamed from: N */
    public final void m81879N(C24469a bean) {
        Intrinsics.m97802h(bean, "bean");
        C19655a c19655a = C19655a.f62783a;
        c19655a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> onDetailPageSubtitleSelect--> " + bean.m96011b().getLan() + ", " + bean.m96011b().getLanName() + ", " + bean.m96013d());
        if (bean.m96013d()) {
            this.f62745I.mo81903e(bean, null, false);
            return;
        }
        if (!C27287m.f83003a.m106330e()) {
            C13806h.f49015a.m62324k(com.transsion.baseui.R$string.base_network_fail);
            return;
        }
        bean.m96011b().setStatus(2);
        String simpleName = VideoSubtitleControl.class.getSimpleName();
        DownloadBean downloadBean = this.f62761p;
        String totalTitleName = downloadBean != null ? downloadBean.getTotalTitleName() : null;
        c19655a.m81952a(simpleName + " --> DetailPage downloadSubtitle() --> 内置字幕列表，下载字幕，name = " + totalTitleName + ", subtype = " + bean.m96011b().getType() + ",\"  download subtitleName = " + bean.m96011b().getSubtitleName() + ", subResourceId = " + bean.m96011b().getResourceId() + "~");
        InterfaceC19714h.f62935a.m82148b().mo81946h(bean);
    }

    /* JADX INFO: renamed from: O */
    public final void m81880O(LocalVideoUiType type) {
        SimpleSubtitleView simpleSubtitleView;
        Intrinsics.m97802h(type, "type");
        this.f62763r = type;
        if (this.f62758m) {
            Map linkedHashMap = (Map) this.f62767v.get(type);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            this.f62765t = linkedHashMap;
            this.f62766u = (ViewGroup) this.f62768w.get(this.f62763r);
            C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> onLocalUiChanged() --> currentUiType = " + this.f62763r + " --> subtitleSelectList.size = " + this.f62742F.size());
            for (C24469a c24469a : this.f62742F) {
                boolean z11 = true;
                if (this.f62743G) {
                    String strM96010a = c24469a.m96010a();
                    int iHashCode = strM96010a.hashCode();
                    if (iHashCode != 0) {
                        if (iHashCode != 50770) {
                            simpleSubtitleView = (iHashCode == 51560 && strM96010a.equals("2nd")) ? (SimpleSubtitleView) this.f62765t.get(IntegrationConstants.TAB_BAR_POSITION_DEFAULT) : null;
                            z11 = false;
                        } else if (strM96010a.equals("1st")) {
                            simpleSubtitleView = (SimpleSubtitleView) this.f62765t.get(IntegrationConstants.TAB_BAR_POSITION_TOP);
                        }
                        z11 = false;
                    } else if (strM96010a.equals("")) {
                        simpleSubtitleView = (SimpleSubtitleView) this.f62765t.get(IntegrationConstants.TAB_BAR_POSITION_TOP);
                    } else {
                        z11 = false;
                    }
                    m81845d0(c24469a, simpleSubtitleView, z11);
                } else {
                    m81845d0(c24469a, (SimpleSubtitleView) this.f62765t.get(IntegrationConstants.TAB_BAR_POSITION_TOP), true);
                }
            }
        }
        C19719d c19719d = this.f62762q;
        if (c19719d != null) {
            c19719d.m82179i((SimpleSubtitleView) this.f62765t.get(IntegrationConstants.TAB_BAR_POSITION_TOP), (SimpleSubtitleView) this.f62765t.get(IntegrationConstants.TAB_BAR_POSITION_DEFAULT), type, this.f62766u);
        }
        C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> onLocalUiChanged() --> 页面切换刷新字幕位置信息");
    }

    /* JADX INFO: renamed from: Q */
    public final void m81881Q() {
        Iterator it = this.f62765t.entrySet().iterator();
        while (it.hasNext()) {
            SimpleSubtitleView simpleSubtitleView = (SimpleSubtitleView) ((Map.Entry) it.next()).getValue();
            if (simpleSubtitleView != null) {
                simpleSubtitleView.pause();
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m81882R(long j11) {
        this.f62741E = j11;
    }

    /* JADX INFO: renamed from: S */
    public final void m81883S() {
        Iterator it = this.f62765t.entrySet().iterator();
        while (it.hasNext()) {
            SimpleSubtitleView simpleSubtitleView = (SimpleSubtitleView) ((Map.Entry) it.next()).getValue();
            if (simpleSubtitleView != null) {
                simpleSubtitleView.resume();
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m81884T() {
    }

    /* JADX INFO: renamed from: X */
    public final void m81885X() {
        this.f62744H = "";
        this.f62757l.clear();
        for (Map.Entry entry : this.f62765t.entrySet()) {
            SimpleSubtitleView simpleSubtitleView = (SimpleSubtitleView) entry.getValue();
            if (simpleSubtitleView != null) {
                simpleSubtitleView.reset();
            }
            SimpleSubtitleView simpleSubtitleView2 = (SimpleSubtitleView) entry.getValue();
            if (simpleSubtitleView2 != null) {
                AbstractC26006c.m102054g(simpleSubtitleView2);
            }
        }
        C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> reset() --> 重置资源");
        InterfaceC19714h.f62935a.m82148b().reset();
    }

    /* JADX INFO: renamed from: Z */
    public final void m81886Z(LocalVideoUiType uiType, TextView textView, SimpleSubtitleView simpleSubtitleView, SimpleSubtitleView simpleSubtitleView2, ViewGroup viewGroup, boolean z11) {
        Intrinsics.m97802h(uiType, "uiType");
        this.f62758m = z11;
        this.f62766u = viewGroup;
        this.f62765t.put(IntegrationConstants.TAB_BAR_POSITION_TOP, simpleSubtitleView);
        this.f62765t.put(IntegrationConstants.TAB_BAR_POSITION_DEFAULT, simpleSubtitleView2);
        if (z11) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(IntegrationConstants.TAB_BAR_POSITION_TOP, simpleSubtitleView);
            linkedHashMap.put(IntegrationConstants.TAB_BAR_POSITION_DEFAULT, simpleSubtitleView2);
            this.f62767v.put(uiType, linkedHashMap);
            this.f62768w.put(uiType, this.f62766u);
        }
        InterfaceC19714h.f62935a.m82148b().reset();
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.subtitle.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VideoSubtitleControl.m81841a0(this.f62790a, view);
                }
            });
        }
        if (simpleSubtitleView != null) {
            m81833J(simpleSubtitleView);
        }
        if (simpleSubtitleView2 != null) {
            m81833J(simpleSubtitleView2);
        }
        C19719d c19719d = this.f62762q;
        if (c19719d != null) {
            c19719d.m82179i(simpleSubtitleView, simpleSubtitleView2, uiType, viewGroup);
        }
        C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> setData() --> uiType = " + uiType + " --> END");
    }

    /* JADX INFO: renamed from: b0 */
    public final void m81887b0(boolean z11) {
        this.f62760o = z11;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m81888c0(Function1 function1) {
        this.f62769x = function1;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m81889f0(List list) {
        m81885X();
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            if (this.f62757l.isEmpty()) {
                C19655a c19655a = C19655a.f62783a;
                String simpleName = VideoSubtitleControl.class.getSimpleName();
                DownloadBean downloadBean = this.f62761p;
                c19655a.m81952a(simpleName + " --> setSubtitleDataList() --> 无字幕 --> subtitleResId:" + (downloadBean != null ? downloadBean.getSubtitleResId() : null));
                return;
            }
            return;
        }
        C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> setSubtitleDataList() --> 当前可用字幕数量 -- size = " + list.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            C24469a c24469a = (C24469a) listIterator.next();
            c24469a.m96021l(false);
            if (linkedHashMap.containsKey(c24469a.m96011b().getId()) && linkedHashMap.containsValue(c24469a.m96011b().getName())) {
                C19655a.f62783a.m81952a(VideoSubtitleControl.class.getSimpleName() + " --> setSubtitleDataList() --> Repeated，remove~  name = " + c24469a.m96011b().getName());
                listIterator.remove();
            } else {
                linkedHashMap.put(c24469a.m96011b().getId(), c24469a.m96011b().getName());
            }
        }
        if (list.size() > 1) {
            CollectionsKt.m97519A(list, new Comparator() { // from class: com.transsion.subtitle.VideoSubtitleControl$setSubtitleDataList$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t11, T t12) {
                    return ComparisonsKt.m97603d(Integer.valueOf(((C24469a) t11).m96011b().getType()), Integer.valueOf(((C24469a) t12).m96011b().getType()));
                }
            });
        }
        this.f62757l.clear();
        this.f62757l.addAll(list);
        this.f62754i.invoke(this.f62757l);
        m81832I();
    }

    /* JADX INFO: renamed from: g0 */
    public final void m81890g0(InterfaceC25909a callback) {
        Intrinsics.m97802h(callback, "callback");
    }

    /* JADX INFO: renamed from: h0 */
    public final void m81891h0(DownloadBean downloadBean) {
        this.f62761p = downloadBean;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m81892i0(Function1 callback) {
        Intrinsics.m97802h(callback, "callback");
    }

    /* JADX INFO: renamed from: j0 */
    public final void m81893j0(boolean z11, boolean z12) {
        String value;
        Boolean boolM1;
        ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("sa_show_no_subtitle_tips", true);
        if ((!((configBeanM110360c == null || (value = configBeanM110360c.getValue()) == null || (boolM1 = StringsKt.m98153m1(value)) == null) ? false : boolM1.booleanValue()) && !z12) || this.f62746a.isDestroyed() || this.f62746a.isFinishing()) {
            return;
        }
        FragmentActivity fragmentActivity = this.f62746a;
        SubtitleMainDialog2 subtitleMainDialog2M81998a = SubtitleMainDialog2.INSTANCE.m81998a(this.f62763r == LocalVideoUiType.LAND, z11, this.f62749d, this.f62761p, this.f62747b);
        subtitleMainDialog2M81998a.m65436k0(fragmentActivity, "fragment_subtitle_main_dialog");
        subtitleMainDialog2M81998a.m81994F0(this.f62745I);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m81894p0(List dubs) {
        Intrinsics.m97802h(dubs, "dubs");
        this.f62749d = dubs;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m81895q0(long j11) {
        this.f62759n = j11;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m81896r0(float f11) {
        this.f62748c = f11;
    }
}
