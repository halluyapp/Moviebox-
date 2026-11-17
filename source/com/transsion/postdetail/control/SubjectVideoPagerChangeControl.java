package com.transsion.postdetail.control;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.p1004lifecycle.InterfaceC3218r;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.transsion.baselib.report.C14492k;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.PreVideoAddress;
import com.transsion.moviedetailapi.bean.ShortTVItem;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.Trailer;
import com.transsion.moviedetailapi.bean.Video;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.ORPlayerPreloadManager;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.postdetail.helper.ImmVideoHelper;
import com.transsion.postdetail.p306ui.adapter.C16988l;
import com.transsion.postdetail.p306ui.view.ShortTvImmVideoItemView;
import com.transsion.shorttv.base.pager.PagerLayoutManager;
import com.transsnet.downloader.manager.DownloadEsHelper;
import fo.C23403e;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import mn.AbstractC25893d;
import p462hj.C23860f;
import p467hs.AbstractC23893a;
import p550kj.C24662i;
import p620nn.C26035b;
import p743rh.C27287m;
import p801u6.C27941f;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public class SubjectVideoPagerChangeControl extends AbstractC23893a implements InterfaceC3218r, C14492k.a {

    /* JADX INFO: renamed from: n */
    public static final C16759a f56319n = new C16759a(null);

    /* JADX INFO: renamed from: a */
    private final Fragment f56320a;

    /* JADX INFO: renamed from: b */
    private final C16988l f56321b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC16634g f56322c;

    /* JADX INFO: renamed from: d */
    private final ORPlayerView f56323d;

    /* JADX INFO: renamed from: e */
    private PagerLayoutManager f56324e;

    /* JADX INFO: renamed from: f */
    private final int f56325f;

    /* JADX INFO: renamed from: g */
    private final long f56326g;

    /* JADX INFO: renamed from: h */
    private int f56327h;

    /* JADX INFO: renamed from: i */
    private boolean f56328i;

    /* JADX INFO: renamed from: j */
    private boolean f56329j;

    /* JADX INFO: renamed from: k */
    private View f56330k;

    /* JADX INFO: renamed from: l */
    private final String f56331l;

    /* JADX INFO: renamed from: m */
    private boolean f56332m;

    /* JADX INFO: renamed from: com.transsion.postdetail.control.SubjectVideoPagerChangeControl$a */
    public static final class C16759a {
        private C16759a() {
        }

        public /* synthetic */ C16759a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.control.SubjectVideoPagerChangeControl$b */
    public /* synthetic */ class C16760b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56333a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f56333a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.control.SubjectVideoPagerChangeControl$onStateChanged$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.control.SubjectVideoPagerChangeControl$onStateChanged$1", m97637f = "SubjectVideoPagerChangeControl.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C167611 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        int label;

        C167611(Continuation<? super C167611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C167611(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C167611) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            ORPlayerPreloadManager.f55908i.m72403a().m72395c();
            return Unit.f75682a;
        }
    }

    public SubjectVideoPagerChangeControl(Fragment fragment, C16988l c16988l, InterfaceC16634g interfaceC16634g, ORPlayerView oRPlayerView, PagerLayoutManager pagerLayoutManager) {
        Intrinsics.m97802h(fragment, "fragment");
        this.f56320a = fragment;
        this.f56321b = c16988l;
        this.f56322c = interfaceC16634g;
        this.f56323d = oRPlayerView;
        this.f56324e = pagerLayoutManager;
        this.f56325f = 3;
        this.f56326g = 3000L;
        this.f56328i = true;
        fragment.getLifecycle().mo14832a(this);
        m72957m();
        this.f56331l = C24662i.f75350a.m96877i();
    }

    /* JADX INFO: renamed from: h */
    private final void m72955h() {
        C27941f c27941fM36186h0;
        C16988l c16988l = this.f56321b;
        if (((c16988l == null || (c27941fM36186h0 = c16988l.m36186h0()) == null) ? null : c27941fM36186h0.m108661i()) == LoadMoreStatus.Fail && C27287m.f83003a.m106330e()) {
            C26866a.a.m104898f(C26866a.f81698a, "ShortTvImmVideoPlayer", "current is fail, try load more", false, 4, null);
            this.f56321b.m36186h0().m108670w();
        }
    }

    /* JADX INFO: renamed from: l */
    private final Video m72956l(Subject subject) {
        Media video;
        PreVideoAddress videoAddress;
        if (subject == null) {
            return null;
        }
        Trailer trailer = subject.getTrailer();
        if ((trailer != null ? trailer.getVideoAddress() : null) != null) {
            Trailer trailer2 = subject.getTrailer();
            if (trailer2 == null || (videoAddress = trailer2.getVideoAddress()) == null) {
                return null;
            }
            return AbstractC25893d.m101693a(videoAddress);
        }
        ShortTVItem shortTVFirstEp = subject.getShortTVFirstEp();
        if (shortTVFirstEp == null || (video = shortTVFirstEp.getVideo()) == null) {
            return null;
        }
        return video.getVideoAddress();
    }

    /* JADX INFO: renamed from: m */
    private final void m72957m() {
        C14492k.f50955a.m65317g(this);
    }

    @Override // p467hs.AbstractC23893a
    /* JADX INFO: renamed from: d */
    public void mo72958d(View view) {
        PagerLayoutManager pagerLayoutManager = this.f56324e;
        if (pagerLayoutManager != null) {
            int iFindFirstVisibleItemPosition = pagerLayoutManager.findFirstVisibleItemPosition();
            C26866a.a.m104908v(C26866a.f81698a, "ShortTvImmVideoPlayer", "onInitComplete, position = " + iFindFirstVisibleItemPosition + ", ----- currentPosition = " + this.f56327h, false, 4, null);
            if (this.f56327h == iFindFirstVisibleItemPosition) {
                return;
            }
            if (iFindFirstVisibleItemPosition != -1) {
                this.f56327h = iFindFirstVisibleItemPosition;
            }
            mo72968q(this.f56327h, view);
        }
    }

    @Override // p467hs.AbstractC23893a
    /* JADX INFO: renamed from: e */
    public void mo72959e(boolean z11, int i11, View view) {
        C26866a.a.m104908v(C26866a.f81698a, "ShortTvImmVideoPlayer", "onPageRelease, position = " + i11 + ", ----- currentPosition = " + this.f56327h, false, 4, null);
        if (i11 == this.f56327h) {
            mo72974w();
            ORPlayerView oRPlayerView = this.f56323d;
            ViewParent parent = oRPlayerView != null ? oRPlayerView.getParent() : null;
            if (parent instanceof FrameLayout) {
                ((FrameLayout) parent).removeView(this.f56323d);
            }
        }
    }

    @Override // p467hs.AbstractC23893a
    /* JADX INFO: renamed from: f */
    public void mo72960f(int i11, boolean z11, View view) {
        m72955h();
        C26866a.a.m104898f(C26866a.f81698a, "ShortTvImmVideoPlayer", "onPageSelected, position = " + i11 + ", ----- currentPosition = " + this.f56327h, false, 4, null);
        if (this.f56327h != i11 || this.f56329j) {
            this.f56329j = false;
            this.f56327h = i11;
            ImmVideoHelper.C16766a c16766a = ImmVideoHelper.f56352h;
            if (c16766a.m73010a().m73003n()) {
                c16766a.m73010a().m73008t();
            }
            mo72968q(i11, view);
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo72961g(List data) {
        Intrinsics.m97802h(data, "data");
        C16988l c16988l = this.f56321b;
        if (c16988l != null) {
            c16988l.mo36208q(data);
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m72962i() {
        return this.f56327h;
    }

    /* JADX INFO: renamed from: j */
    protected final Fragment m72963j() {
        return this.f56320a;
    }

    /* JADX INFO: renamed from: k */
    protected final InterfaceC16634g m72964k() {
        return this.f56322c;
    }

    /* JADX INFO: renamed from: n */
    public void mo72965n(int i11) {
        Subject subject;
        Video videoM72956l;
        C16988l c16988l = this.f56321b;
        if (c16988l == null || (subject = (Subject) c16988l.m36182f0(i11 + this.f56325f)) == null || (videoM72956l = m72956l(subject)) == null) {
            return;
        }
        mo72971t(subject, videoM72956l);
    }

    /* JADX INFO: renamed from: o */
    public final void m72966o() {
        if (this.f56328i) {
            this.f56328i = false;
            mo72970s(this.f56327h);
        }
    }

    @Override // com.transsion.baselib.report.C14492k.a
    public void onBackgroundStatusChange(boolean z11) {
        if (z11 && !this.f56332m) {
            View view = this.f56330k;
            ShortTvImmVideoItemView shortTvImmVideoItemView = view instanceof ShortTvImmVideoItemView ? (ShortTvImmVideoItemView) view : null;
            if (shortTvImmVideoItemView != null) {
                shortTvImmVideoItemView.app2Background();
            }
        }
    }

    @Override // androidx.p1004lifecycle.InterfaceC3218r
    public void onStateChanged(InterfaceC3224u source, Lifecycle.Event event) {
        Intrinsics.m97802h(source, "source");
        Intrinsics.m97802h(event, "event");
        int i11 = C16760b.f56333a[event.ordinal()];
        if (i11 == 1) {
            ORPlayerPreloadManager.f55908i.m72403a().m72399h();
            return;
        }
        if (i11 == 2) {
            ORPlayerPreloadManager.f55908i.m72403a().m72402k();
        } else {
            if (i11 != 3) {
                return;
            }
            C14492k.f50955a.m65326t(this);
            this.f56330k = null;
            this.f56320a.getLifecycle().mo14835d(this);
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new C167611(null), 3, null);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m72967p(boolean z11) {
        this.f56332m = z11;
        if (z11) {
            View view = this.f56330k;
            ShortTvImmVideoItemView shortTvImmVideoItemView = view instanceof ShortTvImmVideoItemView ? (ShortTvImmVideoItemView) view : null;
            if (shortTvImmVideoItemView != null) {
                shortTvImmVideoItemView.app2Background();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    protected void mo72968q(int i11, View view) {
        RecyclerView recyclerView;
        ORPlayerView oRPlayerView;
        this.f56330k = view;
        C26866a.a.m104898f(C26866a.f81698a, "ImmVideoPlayer", "on page select position = " + i11, false, 4, null);
        mo72972u();
        if (i11 >= 0) {
            C16988l c16988l = this.f56321b;
            int height = 0;
            if ((c16988l != null ? c16988l.getItemCount() : 0) > i11 && (view instanceof ShortTvImmVideoItemView)) {
                ShortTvImmVideoItemView shortTvImmVideoItemView = (ShortTvImmVideoItemView) view;
                shortTvImmVideoItemView.setPosition(Integer.valueOf(i11));
                InterfaceC16634g interfaceC16634g = this.f56322c;
                if (interfaceC16634g != null && (oRPlayerView = this.f56323d) != null) {
                    shortTvImmVideoItemView.setPlayer(interfaceC16634g, oRPlayerView);
                }
                PagerLayoutManager pagerLayoutManager = this.f56324e;
                if (pagerLayoutManager != null) {
                    shortTvImmVideoItemView.setPagerLayoutManager(pagerLayoutManager);
                }
                InterfaceC16634g interfaceC16634g2 = this.f56322c;
                if (interfaceC16634g2 != null) {
                    interfaceC16634g2.setPlayerListener((InterfaceC16633f) view);
                }
                C16988l c16988l2 = this.f56321b;
                Subject subject = c16988l2 != null ? (Subject) c16988l2.getItem(i11) : null;
                ORPlayerView oRPlayerView2 = this.f56323d;
                ViewParent parent = oRPlayerView2 != null ? oRPlayerView2.getParent() : null;
                if (parent instanceof FrameLayout) {
                    ((FrameLayout) parent).removeView(this.f56323d);
                }
                ORPlayerView oRPlayerView3 = this.f56323d;
                Video videoM72956l = m72956l(subject);
                C16988l c16988l3 = this.f56321b;
                if (c16988l3 != null && (recyclerView = c16988l3.getRecyclerView()) != null) {
                    height = recyclerView.getHeight();
                }
                shortTvImmVideoItemView.addVideoView(oRPlayerView3, videoM72956l, height);
                shortTvImmVideoItemView.videoStartPrepare(this.f56331l);
                mo72975x(shortTvImmVideoItemView, subject);
                mo72970s(i11);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m72969r() {
        this.f56329j = true;
    }

    /* JADX INFO: renamed from: s */
    public void mo72970s(int i11) {
        int i12 = this.f56325f;
        if (i12 > 0 && this.f56321b != null) {
            boolean z11 = false;
            if (1 <= i12) {
                int i13 = 1;
                while (true) {
                    int i14 = i11 + i13;
                    if (i14 >= 0 && this.f56321b.getItemCount() > i14) {
                        Subject subject = (Subject) this.f56321b.m36182f0(i14);
                        if (subject != null && !subject.getBuiltIn()) {
                            Video videoM72956l = m72956l(subject);
                            if (videoM72956l != null) {
                                C26866a.a.m104908v(C26866a.f81698a, "ShortTvImmVideoPlayer", "try preload position = " + i14 + ", duration = " + videoM72956l.getDuration() + ", url = " + videoM72956l.getUrl(), false, 4, null);
                                mo72971t(subject, videoM72956l);
                            } else if (i14 == (this.f56325f + i11) - 1) {
                                z11 = true;
                            }
                        }
                        if (i13 == i12) {
                            break;
                        } else {
                            i13++;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z11) {
                mo72965n(i11);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void mo72971t(Subject item, Video video) {
        Media video2;
        Cover cover;
        String url;
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(video, "video");
        String url2 = video.getUrl();
        if (url2 != null) {
            ORPlayerPreloadManager.f55908i.m72403a().m72401j(url2, this.f56326g);
        }
        ShortTVItem shortTVFirstEp = item.getShortTVFirstEp();
        if (shortTVFirstEp == null || (video2 = shortTVFirstEp.getVideo()) == null || (cover = video2.getCover()) == null || (url = cover.getUrl()) == null) {
            return;
        }
        C23860f.a aVar = C23860f.f72909a;
        C26035b.a aVar2 = C26035b.f79529e;
        C23860f.a.m94451j(aVar, C23860f.a.m94447e(aVar, url, aVar2.m102098a(), false, true, 4, null), url, aVar2.m102098a(), null, 8, null);
    }

    /* JADX INFO: renamed from: u */
    protected void mo72972u() {
        InterfaceC16634g interfaceC16634g = this.f56322c;
        if (interfaceC16634g != null) {
            interfaceC16634g.reset();
        }
    }

    /* JADX INFO: renamed from: v */
    protected final void m72973v(View view) {
        this.f56330k = view;
    }

    /* JADX INFO: renamed from: w */
    protected void mo72974w() {
        InterfaceC16634g interfaceC16634g = this.f56322c;
        if (interfaceC16634g != null) {
            interfaceC16634g.stop();
        }
        InterfaceC16634g interfaceC16634g2 = this.f56322c;
        if (interfaceC16634g2 != null) {
            interfaceC16634g2.reset();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX INFO: renamed from: x */
    protected void mo72975x(ShortTvImmVideoItemView view, Subject subject) {
        String url;
        String url2;
        String str;
        boolean z11;
        Intrinsics.m97802h(view, "view");
        Video videoM72956l = m72956l(subject);
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "ImmVideoPlayer", "play url=" + (videoM72956l != null ? videoM72956l.getUrl() : null) + "  width:" + (videoM72956l != null ? videoM72956l.getWidth() : null) + ",height:" + (videoM72956l != null ? videoM72956l.getHeight() : null) + ", duration: " + (videoM72956l != null ? videoM72956l.getDuration() : null) + ", builtIn = " + (subject != null ? Boolean.valueOf(subject.getBuiltIn()) : null), false, 4, null);
        InterfaceC16634g interfaceC16634g = this.f56322c;
        if (interfaceC16634g != null) {
            if (subject != null) {
                Integer subjectType = subject.getSubjectType();
                int value = SubjectType.SHORT_TV.getValue();
                if (subjectType != null && subjectType.intValue() == value) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            interfaceC16634g.setLooping(!z11);
        }
        if (subject == null || !subject.getBuiltIn()) {
            if (videoM72956l == null || (url = videoM72956l.getUrl()) == null) {
                return;
            }
            InterfaceC16634g interfaceC16634g2 = this.f56322c;
            if (interfaceC16634g2 != null) {
                interfaceC16634g2.setDataSource(new C23403e(url, url, 0, null, null, 28, null));
            }
            InterfaceC16634g interfaceC16634g3 = this.f56322c;
            if (interfaceC16634g3 != null) {
                interfaceC16634g3.prepare();
            }
            view.setVideoUrl(url);
            ORPlayerPreloadManager.f55908i.m72403a().m72398g(url);
            return;
        }
        if (videoM72956l == null || (url2 = videoM72956l.getUrl()) == null) {
            return;
        }
        if (StringsKt.m98242W(url2, "main/", false, 2, null)) {
            String absolutePath = DownloadEsHelper.f67591m.m88598a().m88578g().getAbsolutePath();
            String title = subject.getTitle();
            if (title == null) {
                title = "";
            }
            String str2 = absolutePath + "/" + (title + ".mp4");
            videoM72956l.setUrl(str2);
            str = str2;
        } else {
            str = url2;
        }
        C26866a.a.m104898f(aVar, "ImmVideoPlayer", "play url= " + str, false, 4, null);
        InterfaceC16634g interfaceC16634g4 = this.f56322c;
        if (interfaceC16634g4 != null) {
            interfaceC16634g4.setDataSource(new C23403e(str, str, 0, null, null, 28, null));
        }
        InterfaceC16634g interfaceC16634g5 = this.f56322c;
        if (interfaceC16634g5 != null) {
            interfaceC16634g5.prepare();
        }
        view.setVideoUrl(url2);
    }
}
