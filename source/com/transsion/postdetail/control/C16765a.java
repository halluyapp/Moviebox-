package com.transsion.postdetail.control;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.Lifecycle;
import com.transsion.baselib.report.C14492k;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.ShortTVItem;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.Video;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.player.shorttv.preload.C16670q;
import com.transsion.postdetail.p306ui.adapter.C16988l;
import com.transsion.postdetail.p306ui.view.ShortTvImmVideoItemView;
import com.transsion.shorttv.base.pager.PagerLayoutManager;
import com.transsnet.downloader.manager.DownloadEsHelper;
import fo.C23403e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.postdetail.control.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C16765a extends SubjectVideoPagerChangeControl {

    /* JADX INFO: renamed from: o */
    public static final a f56350o = new a(null);

    /* JADX INFO: renamed from: com.transsion.postdetail.control.a$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m72987a(Subject subject) {
            String url;
            ShortTVItem shortTVFirstEp;
            Media video;
            Video videoAddress = (subject == null || (shortTVFirstEp = subject.getShortTVFirstEp()) == null || (video = shortTVFirstEp.getVideo()) == null) ? null : video.getVideoAddress();
            if (subject == null || !subject.getBuiltIn()) {
                if (videoAddress != null) {
                    return videoAddress.getUrl();
                }
                return null;
            }
            if (videoAddress == null || (url = videoAddress.getUrl()) == null) {
                return null;
            }
            if (!StringsKt.m98242W(url, "main/", false, 2, null)) {
                return url;
            }
            String absolutePath = DownloadEsHelper.f67591m.m88598a().m88578g().getAbsolutePath();
            String title = subject.getTitle();
            if (title == null) {
                title = "";
            }
            String str = absolutePath + "/" + (title + ".mp4");
            videoAddress.setUrl(str);
            return str;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.control.a$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56351a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f56351a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16765a(Fragment fragment, C16988l c16988l, InterfaceC16634g interfaceC16634g, ORPlayerView oRPlayerView, PagerLayoutManager pagerLayoutManager) {
        super(fragment, c16988l, interfaceC16634g, oRPlayerView, pagerLayoutManager);
        Intrinsics.m97802h(fragment, "fragment");
    }

    @Override // com.transsion.postdetail.control.SubjectVideoPagerChangeControl, p467hs.AbstractC23893a
    /* JADX INFO: renamed from: e */
    public void mo72959e(boolean z11, int i11, View view) {
        super.mo72959e(z11, i11, view);
        if (view instanceof ShortTvImmVideoItemView) {
            ((ShortTvImmVideoItemView) view).onPlayerReset();
        }
    }

    @Override // com.transsion.postdetail.control.SubjectVideoPagerChangeControl
    /* JADX INFO: renamed from: g */
    public void mo72961g(List datas) {
        InterfaceC16634g interfaceC16634gM72964k;
        InterfaceC16634g interfaceC16634gM72964k2;
        Media video;
        Intrinsics.m97802h(datas, "datas");
        super.mo72961g(datas);
        Iterator it = datas.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            Subject subject = (Subject) it.next();
            ShortTVItem shortTVFirstEp = subject.getShortTVFirstEp();
            Video videoAddress = (shortTVFirstEp == null || (video = shortTVFirstEp.getVideo()) == null) ? null : video.getVideoAddress();
            C26866a.a aVar = C26866a.f81698a;
            String url = videoAddress != null ? videoAddress.getUrl() : null;
            Integer width = videoAddress != null ? videoAddress.getWidth() : null;
            Integer height = videoAddress != null ? videoAddress.getHeight() : null;
            Integer duration = videoAddress != null ? videoAddress.getDuration() : null;
            C26866a.a.m104898f(aVar, "ShortTvImmVideoPlayer", "play url=" + url + "  width:" + width + ",height:" + height + ", duration: " + duration + ", builtIn = " + Boolean.valueOf(subject.getBuiltIn()), false, 4, null);
            String strM72987a = f56350o.m72987a(subject);
            if (strM72987a != null && (interfaceC16634gM72964k2 = m72964k()) != null) {
                ShortTVItem shortTVFirstEp2 = subject.getShortTVFirstEp();
                boolean zAddDataSource = interfaceC16634gM72964k2.addDataSource(new C23403e(shortTVFirstEp2 != null ? shortTVFirstEp2.getId() : null, strM72987a, 0, null, null, 28, null));
                if (!z11) {
                    z11 = zAddDataSource;
                }
            }
        }
        if (!z11 || (interfaceC16634gM72964k = m72964k()) == null) {
            return;
        }
        interfaceC16634gM72964k.prepare();
    }

    @Override // com.transsion.postdetail.control.SubjectVideoPagerChangeControl
    /* JADX INFO: renamed from: n */
    public void mo72965n(int i11) {
    }

    @Override // com.transsion.postdetail.control.SubjectVideoPagerChangeControl, androidx.p1004lifecycle.InterfaceC3218r
    public void onStateChanged(InterfaceC3224u source, Lifecycle.Event event) {
        Intrinsics.m97802h(source, "source");
        Intrinsics.m97802h(event, "event");
        if (b.f56351a[event.ordinal()] == 1) {
            C14492k.f50955a.m65326t(this);
            m72973v(null);
            m72963j().getLifecycle().mo14835d(this);
            InterfaceC16634g interfaceC16634gM72964k = m72964k();
            if (interfaceC16634gM72964k != null) {
                interfaceC16634gM72964k.release();
            }
        }
    }

    @Override // com.transsion.postdetail.control.SubjectVideoPagerChangeControl
    /* JADX INFO: renamed from: q */
    protected void mo72968q(int i11, View view) {
        super.mo72968q(i11, view);
    }

    @Override // com.transsion.postdetail.control.SubjectVideoPagerChangeControl
    /* JADX INFO: renamed from: s */
    public void mo72970s(int i11) {
    }

    @Override // com.transsion.postdetail.control.SubjectVideoPagerChangeControl
    /* JADX INFO: renamed from: t */
    public void mo72971t(Subject item, Video video) {
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(video, "video");
    }

    @Override // com.transsion.postdetail.control.SubjectVideoPagerChangeControl
    /* JADX INFO: renamed from: u */
    protected void mo72972u() {
    }

    @Override // com.transsion.postdetail.control.SubjectVideoPagerChangeControl
    /* JADX INFO: renamed from: w */
    protected void mo72974w() {
        InterfaceC16634g interfaceC16634gM72964k = m72964k();
        if (interfaceC16634gM72964k != null) {
            interfaceC16634gM72964k.pause();
        }
    }

    @Override // com.transsion.postdetail.control.SubjectVideoPagerChangeControl
    /* JADX INFO: renamed from: x */
    protected void mo72975x(ShortTvImmVideoItemView view, Subject subject) {
        ShortTVItem shortTVFirstEp;
        Media video;
        Intrinsics.m97802h(view, "view");
        Video videoAddress = (subject == null || (shortTVFirstEp = subject.getShortTVFirstEp()) == null || (video = shortTVFirstEp.getVideo()) == null) ? null : video.getVideoAddress();
        C26866a.a.m104898f(C26866a.f81698a, "ShortTvImmVideoPlayer", "play url=" + (videoAddress != null ? videoAddress.getUrl() : null) + "  width:" + (videoAddress != null ? videoAddress.getWidth() : null) + ",height:" + (videoAddress != null ? videoAddress.getHeight() : null) + ", duration: " + (videoAddress != null ? videoAddress.getDuration() : null) + ", builtIn = " + (subject != null ? Boolean.valueOf(subject.getBuiltIn()) : null), false, 4, null);
        String strM72987a = f56350o.m72987a(subject);
        if (strM72987a == null) {
            InterfaceC16634g interfaceC16634gM72964k = m72964k();
            if (interfaceC16634gM72964k != null) {
                interfaceC16634gM72964k.pause();
                return;
            }
            return;
        }
        InterfaceC16634g interfaceC16634gM72964k2 = m72964k();
        if (interfaceC16634gM72964k2 != null) {
            interfaceC16634gM72964k2.seekTo(C16670q.f56031a.m72594G(strM72987a), 0L);
        }
        InterfaceC16634g interfaceC16634gM72964k3 = m72964k();
        if (interfaceC16634gM72964k3 != null) {
            interfaceC16634gM72964k3.play();
        }
        view.setVideoUrl(strM72987a);
    }
}
