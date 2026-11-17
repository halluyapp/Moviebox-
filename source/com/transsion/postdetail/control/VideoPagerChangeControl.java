package com.transsion.postdetail.control;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.p1004lifecycle.InterfaceC3218r;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.Lifecycle;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.transsion.baselib.report.C14492k;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.FirstFrame;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.Video;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.ORPlayerPreloadManager;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.postdetail.helper.ImmVideoHelper;
import com.transsion.postdetail.p306ui.adapter.C16978e;
import com.transsion.postdetail.p306ui.view.ImmVideoItemView;
import com.transsion.postdetail.util.AbstractC17450t;
import com.transsion.shorttv.base.pager.PagerLayoutManager;
import com.transsnet.downloader.manager.DownloadEsHelper;
import fo.C23403e;
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
import p462hj.C23860f;
import p467hs.AbstractC23893a;
import p620nn.C26035b;
import p743rh.C27287m;
import p801u6.C27941f;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public abstract class VideoPagerChangeControl extends AbstractC23893a implements InterfaceC3218r, C14492k.a {

    /* JADX INFO: renamed from: o */
    public static final C16762a f56334o = new C16762a(null);

    /* JADX INFO: renamed from: a */
    private final Fragment f56335a;

    /* JADX INFO: renamed from: b */
    private boolean f56336b;

    /* JADX INFO: renamed from: c */
    private final C16978e f56337c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC16634g f56338d;

    /* JADX INFO: renamed from: e */
    private final ORPlayerView f56339e;

    /* JADX INFO: renamed from: f */
    private PagerLayoutManager f56340f;

    /* JADX INFO: renamed from: g */
    private String f56341g;

    /* JADX INFO: renamed from: h */
    private final int f56342h;

    /* JADX INFO: renamed from: i */
    private final long f56343i;

    /* JADX INFO: renamed from: j */
    private int f56344j;

    /* JADX INFO: renamed from: k */
    private boolean f56345k;

    /* JADX INFO: renamed from: l */
    private boolean f56346l;

    /* JADX INFO: renamed from: m */
    private View f56347m;

    /* JADX INFO: renamed from: n */
    private boolean f56348n;

    /* JADX INFO: renamed from: com.transsion.postdetail.control.VideoPagerChangeControl$a */
    public static final class C16762a {
        private C16762a() {
        }

        public /* synthetic */ C16762a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.control.VideoPagerChangeControl$b */
    public /* synthetic */ class C16763b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56349a;

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
            f56349a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.control.VideoPagerChangeControl$onStateChanged$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.control.VideoPagerChangeControl$onStateChanged$1", m97637f = "VideoPagerChangeControl.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C167641 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        int label;

        C167641(Continuation<? super C167641> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C167641(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C167641) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
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

    public VideoPagerChangeControl(Fragment fragment, boolean z11, C16978e c16978e, InterfaceC16634g interfaceC16634g, ORPlayerView oRPlayerView, PagerLayoutManager pagerLayoutManager, String str) {
        Intrinsics.m97802h(fragment, "fragment");
        this.f56335a = fragment;
        this.f56336b = z11;
        this.f56337c = c16978e;
        this.f56338d = interfaceC16634g;
        this.f56339e = oRPlayerView;
        this.f56340f = pagerLayoutManager;
        this.f56341g = str;
        this.f56342h = 3;
        this.f56343i = 3000L;
        this.f56345k = true;
        fragment.getLifecycle().mo14832a(this);
        m72977i();
    }

    /* JADX INFO: renamed from: g */
    private final void m72976g() {
        C27941f c27941fM36186h0;
        C16978e c16978e = this.f56337c;
        if (((c16978e == null || (c27941fM36186h0 = c16978e.m36186h0()) == null) ? null : c27941fM36186h0.m108661i()) == LoadMoreStatus.Fail && C27287m.f83003a.m106330e()) {
            C26866a.a.m104898f(C26866a.f81698a, "ImmVideoPlayer", "current is fail, try load more", false, 4, null);
            this.f56337c.m36186h0().m108670w();
        }
    }

    /* JADX INFO: renamed from: i */
    private final void m72977i() {
        C14492k.f50955a.m65317g(this);
    }

    /* JADX INFO: renamed from: j */
    private final void m72978j(int i11) {
        PostSubjectItem postSubjectItem;
        C16978e c16978e = this.f56337c;
        if (c16978e == null || (postSubjectItem = (PostSubjectItem) c16978e.m36182f0(i11 + this.f56342h)) == null) {
            return;
        }
        Media media = postSubjectItem.getMedia();
        Video videoM74975a = AbstractC17450t.m74975a(media != null ? media.getVideo() : null);
        if (videoM74975a == null) {
            return;
        }
        m72981p(postSubjectItem, videoM74975a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    private final void m72979m(int i11, View view) {
        ORPlayerView oRPlayerView;
        this.f56347m = view;
        C26866a.a.m104898f(C26866a.f81698a, "ImmVideoPlayer", "on page select position = " + i11, false, 4, null);
        InterfaceC16634g interfaceC16634g = this.f56338d;
        if (interfaceC16634g != null) {
            interfaceC16634g.reset();
        }
        if (i11 >= 0) {
            C16978e c16978e = this.f56337c;
            if ((c16978e != null ? c16978e.getItemCount() : 0) > i11 && (view instanceof ImmVideoItemView)) {
                ImmVideoItemView immVideoItemView = (ImmVideoItemView) view;
                immVideoItemView.setPosition(Integer.valueOf(i11));
                InterfaceC16634g interfaceC16634g2 = this.f56338d;
                if (interfaceC16634g2 != null && (oRPlayerView = this.f56339e) != null) {
                    immVideoItemView.setPlayer(interfaceC16634g2, oRPlayerView);
                }
                PagerLayoutManager pagerLayoutManager = this.f56340f;
                if (pagerLayoutManager != null) {
                    immVideoItemView.setPagerLayoutManager(pagerLayoutManager);
                }
                InterfaceC16634g interfaceC16634g3 = this.f56338d;
                if (interfaceC16634g3 != null) {
                    interfaceC16634g3.setPlayerListener((InterfaceC16633f) view);
                }
                C16978e c16978e2 = this.f56337c;
                PostSubjectItem postSubjectItem = c16978e2 != null ? (PostSubjectItem) c16978e2.getItem(i11) : null;
                ORPlayerView oRPlayerView2 = this.f56339e;
                ViewParent parent = oRPlayerView2 != null ? oRPlayerView2.getParent() : null;
                if (parent instanceof FrameLayout) {
                    ((FrameLayout) parent).removeView(this.f56339e);
                }
                immVideoItemView.getPlayerContainer().addView(this.f56339e, new FrameLayout.LayoutParams(-1, -1));
                if (this.f56336b) {
                    this.f56336b = false;
                    immVideoItemView.showCommentDialog();
                }
                immVideoItemView.videoStartPrepare(this.f56341g);
                m72986q(immVideoItemView, postSubjectItem);
                m72980o(i11);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private final void m72980o(int i11) {
        int i12 = this.f56342h;
        if (i12 > 0 && this.f56337c != null) {
            boolean z11 = false;
            if (1 <= i12) {
                int i13 = 1;
                while (true) {
                    int i14 = i11 + i13;
                    if (i14 >= 0 && this.f56337c.getItemCount() > i14) {
                        PostSubjectItem postSubjectItem = (PostSubjectItem) this.f56337c.m36182f0(i14);
                        if (postSubjectItem != null && !postSubjectItem.getBuiltIn()) {
                            Media media = postSubjectItem.getMedia();
                            Video videoM74975a = AbstractC17450t.m74975a(media != null ? media.getVideo() : null);
                            if (videoM74975a != null) {
                                C26866a.a.m104908v(C26866a.f81698a, "ImmVideoPlayer", "try preload position = " + i14 + ", duration = " + videoM74975a.getDuration() + ", url = " + videoM74975a.getUrl(), false, 4, null);
                                m72981p(postSubjectItem, videoM74975a);
                            } else if (i14 == (this.f56342h + i11) - 1) {
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
                m72978j(i11);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m72981p(PostSubjectItem postSubjectItem, Video video) {
        FirstFrame firstFrame;
        String url;
        String url2 = video.getUrl();
        if (url2 != null) {
            ORPlayerPreloadManager.f55908i.m72403a().m72401j(url2, this.f56343i);
        }
        Media media = postSubjectItem.getMedia();
        if (media == null || (firstFrame = media.getFirstFrame()) == null || (url = firstFrame.getUrl()) == null) {
            return;
        }
        C23860f.a aVar = C23860f.f72909a;
        C26035b.a aVar2 = C26035b.f79529e;
        C23860f.a.m94451j(aVar, C23860f.a.m94447e(aVar, url, aVar2.m102098a(), false, true, 4, null), url, aVar2.m102098a(), null, 8, null);
    }

    @Override // p467hs.AbstractC23893a
    /* JADX INFO: renamed from: d */
    public void mo72958d(View view) {
        PagerLayoutManager pagerLayoutManager = this.f56340f;
        if (pagerLayoutManager != null) {
            int iFindFirstVisibleItemPosition = pagerLayoutManager.findFirstVisibleItemPosition();
            C26866a.a.m104908v(C26866a.f81698a, "ImmVideoPlayer", "onInitComplete, position = " + iFindFirstVisibleItemPosition + ", ----- currentPosition = " + this.f56344j, false, 4, null);
            if (this.f56344j == iFindFirstVisibleItemPosition) {
                return;
            }
            if (iFindFirstVisibleItemPosition != -1) {
                this.f56344j = iFindFirstVisibleItemPosition;
            }
            m72979m(this.f56344j, view);
        }
    }

    @Override // p467hs.AbstractC23893a
    /* JADX INFO: renamed from: e */
    public void mo72959e(boolean z11, int i11, View view) {
        C26866a.a.m104908v(C26866a.f81698a, "ImmVideoPlayer", "onPageRelease, position = " + i11 + ", ----- currentPosition = " + this.f56344j, false, 4, null);
        if (i11 == this.f56344j) {
            InterfaceC16634g interfaceC16634g = this.f56338d;
            if (interfaceC16634g != null) {
                interfaceC16634g.stop();
            }
            InterfaceC16634g interfaceC16634g2 = this.f56338d;
            if (interfaceC16634g2 != null) {
                interfaceC16634g2.reset();
            }
            ORPlayerView oRPlayerView = this.f56339e;
            ViewParent parent = oRPlayerView != null ? oRPlayerView.getParent() : null;
            if (parent instanceof FrameLayout) {
                ((FrameLayout) parent).removeView(this.f56339e);
            }
        }
    }

    @Override // p467hs.AbstractC23893a
    /* JADX INFO: renamed from: f */
    public void mo72960f(int i11, boolean z11, View view) {
        m72976g();
        C26866a.a.m104898f(C26866a.f81698a, "ImmVideoPlayer", "onPageSelected, position = " + i11 + ", ----- currentPosition = " + this.f56344j, false, 4, null);
        if (this.f56344j != i11 || this.f56346l) {
            this.f56346l = false;
            this.f56344j = i11;
            ImmVideoHelper.C16766a c16766a = ImmVideoHelper.f56352h;
            if (c16766a.m73010a().m73003n()) {
                c16766a.m73010a().m73008t();
            }
            m72979m(i11, view);
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m72982h() {
        return this.f56344j;
    }

    /* JADX INFO: renamed from: k */
    public final void m72983k() {
        if (this.f56345k) {
            this.f56345k = false;
            m72980o(this.f56344j);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m72984l(boolean z11) {
        this.f56348n = z11;
        if (z11) {
            View view = this.f56347m;
            ImmVideoItemView immVideoItemView = view instanceof ImmVideoItemView ? (ImmVideoItemView) view : null;
            if (immVideoItemView != null) {
                immVideoItemView.app2Background();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m72985n() {
        this.f56346l = true;
    }

    @Override // com.transsion.baselib.report.C14492k.a
    public void onBackgroundStatusChange(boolean z11) {
        if (z11 && !this.f56348n) {
            View view = this.f56347m;
            ImmVideoItemView immVideoItemView = view instanceof ImmVideoItemView ? (ImmVideoItemView) view : null;
            if (immVideoItemView != null) {
                immVideoItemView.app2Background();
            }
        }
    }

    @Override // androidx.p1004lifecycle.InterfaceC3218r
    public void onStateChanged(InterfaceC3224u source, Lifecycle.Event event) {
        Intrinsics.m97802h(source, "source");
        Intrinsics.m97802h(event, "event");
        int i11 = C16763b.f56349a[event.ordinal()];
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
            this.f56347m = null;
            this.f56335a.getLifecycle().mo14835d(this);
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new C167641(null), 3, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX INFO: renamed from: q */
    protected final void m72986q(ImmVideoItemView view, PostSubjectItem postSubjectItem) {
        String url;
        String url2;
        String str;
        boolean z11;
        Subject subject;
        Media media;
        Intrinsics.m97802h(view, "view");
        Video videoM74975a = AbstractC17450t.m74975a((postSubjectItem == null || (media = postSubjectItem.getMedia()) == null) ? null : media.getVideo());
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "ImmVideoPlayer", "play url=" + (videoM74975a != null ? videoM74975a.getUrl() : null) + "  width:" + (videoM74975a != null ? videoM74975a.getWidth() : null) + ",height:" + (videoM74975a != null ? videoM74975a.getHeight() : null) + ", duration: " + (videoM74975a != null ? videoM74975a.getDuration() : null) + ", builtIn = " + (postSubjectItem != null ? Boolean.valueOf(postSubjectItem.getBuiltIn()) : null), false, 4, null);
        InterfaceC16634g interfaceC16634g = this.f56338d;
        if (interfaceC16634g != null) {
            if (postSubjectItem == null || (subject = postSubjectItem.getSubject()) == null) {
                z11 = false;
            } else {
                Integer subjectType = subject.getSubjectType();
                int value = SubjectType.SHORT_TV.getValue();
                if (subjectType != null && subjectType.intValue() == value) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            interfaceC16634g.setLooping(!z11);
        }
        if (postSubjectItem == null || !postSubjectItem.getBuiltIn()) {
            if (videoM74975a == null || (url = videoM74975a.getUrl()) == null) {
                return;
            }
            InterfaceC16634g interfaceC16634g2 = this.f56338d;
            if (interfaceC16634g2 != null) {
                interfaceC16634g2.setDataSource(new C23403e(url, url, 0, null, null, 28, null));
            }
            InterfaceC16634g interfaceC16634g3 = this.f56338d;
            if (interfaceC16634g3 != null) {
                interfaceC16634g3.prepare();
            }
            view.setVideoUrl(url);
            ORPlayerPreloadManager.f55908i.m72403a().m72398g(url);
            return;
        }
        if (videoM74975a == null || (url2 = videoM74975a.getUrl()) == null) {
            return;
        }
        if (StringsKt.m98242W(url2, "main/", false, 2, null)) {
            String absolutePath = DownloadEsHelper.f67591m.m88598a().m88578g().getAbsolutePath();
            String title = postSubjectItem.getTitle();
            if (title == null) {
                Subject subject2 = postSubjectItem.getSubject();
                String title2 = subject2 != null ? subject2.getTitle() : null;
                title = title2 == null ? "" : title2;
            }
            String str2 = absolutePath + "/" + (title + ".mp4");
            videoM74975a.setUrl(str2);
            str = str2;
        } else {
            str = url2;
        }
        C26866a.a.m104898f(aVar, "ImmVideoPlayer", "play url= " + str, false, 4, null);
        InterfaceC16634g interfaceC16634g4 = this.f56338d;
        if (interfaceC16634g4 != null) {
            interfaceC16634g4.setDataSource(new C23403e(str, str, 0, null, null, 28, null));
        }
        InterfaceC16634g interfaceC16634g5 = this.f56338d;
        if (interfaceC16634g5 != null) {
            interfaceC16634g5.prepare();
        }
        view.setVideoUrl(url2);
    }
}
