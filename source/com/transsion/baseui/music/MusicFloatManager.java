package com.transsion.baseui.music;

import android.R;
import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p1004lifecycle.C3197g0;
import com.blankj.utilcode.util.AbstractC5775a;
import com.google.android.material.card.MaterialCardView;
import com.transsion.baseui.activity.BaseMusicFloatActivity;
import com.transsion.player.mediasession.C16624h;
import com.transsion.player.mediasession.C16625i;
import com.transsion.player.mediasession.MediaItem;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.PlayError;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import fk.AbstractC23384a;
import fo.C23403e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import no.C26041a0;
import p683po.C26906c;
import p683po.C26907d;

/* JADX INFO: loaded from: classes5.dex */
public final class MusicFloatManager implements InterfaceC16633f {

    /* JADX INFO: renamed from: h */
    public static final C14535a f51050h = new C14535a(null);

    /* JADX INFO: renamed from: i */
    public static final int f51051i = 8;

    /* JADX INFO: renamed from: j */
    private static final Lazy f51052j = LazyKt.m97097b(new Function0() { // from class: com.transsion.baseui.music.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MusicFloatManager.m65570c();
        }
    });

    /* JADX INFO: renamed from: b */
    private MediaItem f51054b;

    /* JADX INFO: renamed from: c */
    private String f51055c;

    /* JADX INFO: renamed from: e */
    private InterfaceC16634g f51057e;

    /* JADX INFO: renamed from: g */
    private final Map f51059g;

    /* JADX INFO: renamed from: a */
    private boolean f51053a = true;

    /* JADX INFO: renamed from: d */
    private CopyOnWriteArrayList f51056d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f */
    private List f51058f = new ArrayList();

    /* JADX INFO: renamed from: com.transsion.baseui.music.MusicFloatManager$a */
    public static final class C14535a {
        private C14535a() {
        }

        public /* synthetic */ C14535a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final MusicFloatManager m65597a() {
            return (MusicFloatManager) MusicFloatManager.f51052j.getValue();
        }

        /* JADX INFO: renamed from: b */
        public final MusicFloatManager m65598b() {
            return m65597a();
        }
    }

    /* JADX INFO: renamed from: com.transsion.baseui.music.MusicFloatManager$onPlayerRelease$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.baseui.music.MusicFloatManager$onPlayerRelease$1", m97637f = "MusicFloatManager.kt", m97638l = {}, m97639m = "invokeSuspend")
    @SourceDebugExtension
    static final class C145361 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ C23403e $mediaSource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C145361(C23403e c23403e, Continuation<? super C145361> continuation) {
            super(2, continuation);
            this.$mediaSource = c23403e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MusicFloatManager.this.new C145361(this.$mediaSource, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C145361) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            MediaItem mediaItemM92933i;
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            C16625i c16625i = C16625i.f55907a;
            String strM65579p = MusicFloatManager.this.m65579p();
            C23403e c23403e = this.$mediaSource;
            c16625i.m72389a(strM65579p + " --> onPlayerRelease() --> subjectId = " + ((c23403e == null || (mediaItemM92933i = c23403e.m92933i()) == null) ? null : mediaItemM92933i.getSubjectId()));
            InterfaceC16634g interfaceC16634g = MusicFloatManager.this.f51057e;
            if (interfaceC16634g != null) {
                interfaceC16634g.removePlayerListener(MusicFloatManager.this);
            }
            MusicFloatManager.this.f51057e = null;
            CopyOnWriteArrayList copyOnWriteArrayList = MusicFloatManager.this.f51056d;
            C23403e c23403e2 = this.$mediaSource;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC16633f) it.next()).onPlayerRelease(c23403e2);
            }
            MusicFloatManager.this.m65582B(null);
            MusicFloatManager.this.m65583C(null);
            MusicReport.f51069a.m65627c();
            return Unit.f75682a;
        }
    }

    public MusicFloatManager() {
        C3197g0.f10010i.m14915a().getLifecycle().mo14832a(C14540a.f51075a);
        MusicReport.f51069a.m65627c();
        this.f51059g = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final MusicFloatManager m65570c() {
        return new MusicFloatManager();
    }

    /* JADX INFO: renamed from: j */
    private final void m65576j(long j11, long j12, int i11, int i12, C23403e c23403e) {
        MediaItem mediaItemM92933i;
        MediaItem mediaItemM92933i2;
        MediaItem mediaItemM92933i3;
        MediaItem mediaItemM92933i4;
        MediaItem mediaItemM92933i5;
        MediaItem mediaItemM92933i6;
        MediaItem mediaItemM92933i7;
        MediaItem mediaItemM92933i8;
        MediaItem mediaItemM92933i9;
        MediaItem mediaItemM92933i10;
        MediaItem mediaItemM92933i11;
        MediaItem mediaItemM92933i12;
        MediaItem mediaItemM92933i13;
        boolean zM97797c = false;
        if ((c23403e == null || (mediaItemM92933i13 = c23403e.m92933i()) == null) ? false : Intrinsics.m97797c(mediaItemM92933i13.isMusic(), Boolean.FALSE)) {
            return;
        }
        C14553n c14553n = (C14553n) this.f51059g.get((c23403e == null || (mediaItemM92933i12 = c23403e.m92933i()) == null) ? null : mediaItemM92933i12.getMediaId());
        if (!TextUtils.equals((c23403e == null || (mediaItemM92933i11 = c23403e.m92933i()) == null) ? null : mediaItemM92933i11.getPageName(), "music_float")) {
            if (!((c23403e == null || (mediaItemM92933i10 = c23403e.m92933i()) == null) ? false : Intrinsics.m97797c(mediaItemM92933i10.getInBackground(), Boolean.TRUE))) {
                if (c14553n != null) {
                    MusicReport.f51069a.m65628d(c14553n);
                    this.f51059g.put((c23403e == null || (mediaItemM92933i9 = c23403e.m92933i()) == null) ? null : mediaItemM92933i9.getMediaId(), null);
                    return;
                }
                return;
            }
        }
        if (c14553n == null) {
            c14553n = new C14553n((c23403e == null || (mediaItemM92933i8 = c23403e.m92933i()) == null) ? null : mediaItemM92933i8.getMediaId(), (c23403e == null || (mediaItemM92933i7 = c23403e.m92933i()) == null) ? null : mediaItemM92933i7.getOps(), (c23403e == null || (mediaItemM92933i6 = c23403e.m92933i()) == null) ? null : mediaItemM92933i6.getSubjectId(), 0L, 0L, j12, 0L, 0L, i11, i12);
        }
        long jM65635g = j11 - c14553n.m65635g();
        if (!(1 <= jM65635g && jM65635g < 2000)) {
            jM65635g = 0;
        }
        if (c23403e != null && (mediaItemM92933i5 = c23403e.m92933i()) != null) {
            zM97797c = Intrinsics.m97797c(mediaItemM92933i5.getInBackground(), Boolean.TRUE);
        }
        if (zM97797c) {
            c14553n.m65641m(c14553n.m65631c() + jM65635g);
        } else {
            c14553n.m65640l(c14553n.m65630b() + jM65635g);
        }
        c14553n.m65642n((c23403e == null || (mediaItemM92933i4 = c23403e.m92933i()) == null) ? null : mediaItemM92933i4.getOps());
        c14553n.m65646r(j12);
        c14553n.m65647s(i11);
        c14553n.m65639k(i12);
        c14553n.m65645q((c23403e == null || (mediaItemM92933i3 = c23403e.m92933i()) == null) ? null : mediaItemM92933i3.getSubjectId());
        c14553n.m65644p(j11);
        c14553n.m65643o(c14553n.m65634f() + jM65635g);
        this.f51059g.put((c23403e == null || (mediaItemM92933i2 = c23403e.m92933i()) == null) ? null : mediaItemM92933i2.getMediaId(), c14553n);
        if (c14553n.m65634f() > 10000) {
            MusicReport.f51069a.m65628d(c14553n);
            this.f51059g.put((c23403e == null || (mediaItemM92933i = c23403e.m92933i()) == null) ? null : mediaItemM92933i.getMediaId(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static final boolean m65577m(MusicFloatManager musicFloatManager, Ref.ObjectRef objectRef, View view, MotionEvent motionEvent) {
        View view2 = (View) objectRef.element;
        Intrinsics.m97799e(motionEvent);
        if (!musicFloatManager.m65580y(view2, motionEvent)) {
            ((MusicFloatView) objectRef.element).setExpand(false);
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    private final FrameLayout m65578o(AppCompatActivity appCompatActivity) {
        Object objM112707constructorimpl;
        Window window;
        View decorView;
        try {
            Result.Companion companion = Result.INSTANCE;
            FrameLayout frameLayout = (appCompatActivity == null || (window = appCompatActivity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : (FrameLayout) decorView.findViewById(R.id.content);
            if (!(frameLayout instanceof FrameLayout)) {
                frameLayout = null;
            }
            objM112707constructorimpl = Result.m112707constructorimpl(frameLayout);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        return (FrameLayout) (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) == null ? objM112707constructorimpl : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final String m65579p() {
        String simpleName = MusicFloatManager.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: renamed from: y */
    private final boolean m65580y(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i11 = iArr[0];
        if (rawX <= i11 || rawX >= i11 + view.getWidth()) {
            return false;
        }
        int i12 = iArr[1];
        return rawY > ((float) i12) && rawY < ((float) (i12 + view.getHeight()));
    }

    /* JADX INFO: renamed from: A */
    public final void m65581A(boolean z11) {
        this.f51053a = z11;
    }

    /* JADX INFO: renamed from: B */
    public final void m65582B(MediaItem mediaItem) {
        C16625i.f55907a.m72389a(m65579p() + " --> setMediaItem() --> musicFloatBean = " + mediaItem);
        if (!(mediaItem != null ? Intrinsics.m97797c(mediaItem.isMusic(), Boolean.TRUE) : false)) {
            mediaItem = null;
        }
        this.f51054b = mediaItem;
    }

    /* JADX INFO: renamed from: C */
    public final void m65583C(String str) {
        this.f51055c = str;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d c26907d) {
        InterfaceC16633f.a.m72423a(this, z11, i11, i12, c26907d);
    }

    /* JADX INFO: renamed from: i */
    public final void m65584i(Activity activity, MotionEvent event) {
        Intrinsics.m97802h(activity, "activity");
        Intrinsics.m97802h(event, "event");
        MusicFloatView musicFloatView = (MusicFloatView) activity.findViewById(activity.hashCode());
        if (musicFloatView != null && musicFloatView.getVisibility() == 0 && this.f51053a && !m65580y(musicFloatView, event)) {
            musicFloatView.setExpand(false);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void initPlayer() {
        InterfaceC16633f.a.m72424b(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m65585k(InterfaceC16633f listener) {
        Intrinsics.m97802h(listener, "listener");
        if (this.f51056d.contains(listener)) {
            return;
        }
        this.f51056d.add(listener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, android.view.View, com.transsion.baseui.music.MusicFloatView] */
    /* JADX INFO: renamed from: l */
    public final void m65586l(AppCompatActivity appCompatActivity, int i11) {
        if (appCompatActivity == null) {
            C16625i.f55907a.m72389a(m65579p() + " --> attach() --> activity == null");
            return;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = appCompatActivity.findViewById(appCompatActivity.hashCode());
        if (m65588q() == null) {
            MusicFloatView musicFloatView = (MusicFloatView) objectRef.element;
            if (musicFloatView != null) {
                musicFloatView.setVisibility(8);
                return;
            }
            return;
        }
        MusicFloatView musicFloatView2 = (MusicFloatView) objectRef.element;
        if (musicFloatView2 != null) {
            musicFloatView2.setVisibility(0);
        }
        if (objectRef.element == 0) {
            ?? musicFloatView3 = new MusicFloatView(appCompatActivity);
            objectRef.element = musicFloatView3;
            musicFloatView3.setId(appCompatActivity.hashCode());
            FrameLayout frameLayoutM65578o = m65578o(appCompatActivity);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            if (frameLayoutM65578o != null) {
                frameLayoutM65578o.setOnTouchListener(new View.OnTouchListener() { // from class: com.transsion.baseui.music.b
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return MusicFloatManager.m65577m(this.f51076a, objectRef, view, motionEvent);
                    }
                });
            }
            layoutParams.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_BOTTOM_START;
            layoutParams.bottomMargin = AbstractC23384a.m92908b(Sdk$SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            if (frameLayoutM65578o != null) {
                frameLayoutM65578o.addView((View) objectRef.element, layoutParams);
            }
        }
        ((MusicFloatView) objectRef.element).refresh();
    }

    /* JADX INFO: renamed from: n */
    public final void m65587n() {
        InterfaceC16634g interfaceC16634gM65590s = m65590s();
        if (interfaceC16634gM65590s != null) {
            interfaceC16634gM65590s.stop();
        }
        if (interfaceC16634gM65590s != null) {
            interfaceC16634gM65590s.release();
        }
        f51050h.m65598b().m65582B(null);
        C16624h.f55898a.m72387p();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onAliyunDecodeErrorChangeSoftwareDecoder(C23403e c23403e) {
        InterfaceC16633f.a.m72425c(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onBufferedPosition(long j11, C23403e c23403e) {
        InterfaceC16633f.a.m72426d(this, j11, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onCompletion(C23403e c23403e) {
        InterfaceC16633f.a.m72427e(this, c23403e);
        MediaItem mediaItem = this.f51054b;
        if (mediaItem != null) {
            mediaItem.setState(MediaItem.MUSIC_FLOAT_STATE_COMPLETION);
        }
        Iterator it = this.f51056d.iterator();
        while (it.hasNext()) {
            ((InterfaceC16633f) it.next()).onCompletion(c23403e);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onFocusChange(boolean z11) {
        InterfaceC16633f.a.m72429g(this, z11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onIsPlayingChanged(boolean z11) {
        InterfaceC16633f.a.m72430h(this, z11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingBegin(C23403e c23403e) {
        InterfaceC16633f.a.m72431i(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingEnd(C23403e c23403e) {
        InterfaceC16633f.a.m72433k(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingProgress(int i11, float f11, C23403e c23403e) {
        InterfaceC16633f.a.m72435m(this, i11, f11, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoopingStart() {
        InterfaceC16633f.a.m72437o(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onMediaItemTransition(String str) {
        InterfaceC16633f.a.m72438p(this, str);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayError(PlayError errorInfo, C23403e c23403e) {
        MediaItem mediaItemM92933i;
        Intrinsics.m97802h(errorInfo, "errorInfo");
        InterfaceC16633f.a.m72439q(this, errorInfo, c23403e);
        C16625i.f55907a.m72389a(m65579p() + " --> onPlayError() --> subjectId = " + ((c23403e == null || (mediaItemM92933i = c23403e.m92933i()) == null) ? null : mediaItemM92933i.getSubjectId()));
        MediaItem mediaItem = this.f51054b;
        if (mediaItem != null) {
            mediaItem.setState("error");
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayerRelease(C23403e c23403e) {
        InterfaceC16633f.a.m72442t(this, c23403e);
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new C145361(c23403e, null), 3, null);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayerReset() {
        InterfaceC16633f.a.m72444v(this);
        C16625i.f55907a.m72389a(m65579p() + " --> onPlayerReset()");
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPrepare(C23403e c23403e) {
        InterfaceC16633f.a.m72445w(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onProgress(long j11, C23403e c23403e) {
        InterfaceC16633f.a.m72447y(this, j11, c23403e);
        Iterator it = this.f51056d.iterator();
        while (it.hasNext()) {
            ((InterfaceC16633f) it.next()).onProgress(j11, c23403e);
        }
        InterfaceC16634g interfaceC16634gM65590s = m65590s();
        long duration = interfaceC16634gM65590s != null ? interfaceC16634gM65590s.getDuration() : 0L;
        InterfaceC16634g interfaceC16634gM65590s2 = m65590s();
        Pair bitrate = interfaceC16634gM65590s2 != null ? interfaceC16634gM65590s2.getBitrate() : null;
        m65576j(j11, duration, bitrate != null ? ((Number) bitrate.getFirst()).intValue() : 0, bitrate != null ? ((Number) bitrate.getSecond()).intValue() : 0, c23403e);
        MediaItem mediaItemM65588q = m65588q();
        if (mediaItemM65588q != null) {
            mediaItemM65588q.setPosition(Long.valueOf(j11));
        }
        MediaItem mediaItemM65588q2 = m65588q();
        if (mediaItemM65588q2 != null) {
            mediaItemM65588q2.setState(MediaItem.MUSIC_FLOAT_STATE_PLAY);
        }
        MediaItem mediaItemM65588q3 = m65588q();
        if (mediaItemM65588q3 != null) {
            mediaItemM65588q3.setDuration(Long.valueOf(duration));
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onRenderFirstFrame() {
        InterfaceC16633f.a.m72412A(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onSetDataSource() {
        InterfaceC16633f.a.m72413B(this);
        C16625i.f55907a.m72389a(m65579p() + " --> onSetDataSource()");
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onTracksAudioBitrateChange(int i11) {
        InterfaceC16633f.a.m72414C(this, i11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onTracksChange(C26906c c26906c) {
        InterfaceC16633f.a.m72415D(this, c26906c);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onTracksVideoBitrateChange(int i11) {
        InterfaceC16633f.a.m72416E(this, i11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoPause(C23403e c23403e) {
        MediaItem mediaItemM92933i;
        InterfaceC16633f.a.m72417F(this, c23403e);
        C16625i.f55907a.m72389a(m65579p() + " --> onVideoPause() --> subjectId = " + ((c23403e == null || (mediaItemM92933i = c23403e.m92933i()) == null) ? null : mediaItemM92933i.getSubjectId()));
        MediaItem mediaItem = this.f51054b;
        if (mediaItem != null) {
            mediaItem.setState("pause");
        }
        Iterator it = this.f51056d.iterator();
        while (it.hasNext()) {
            ((InterfaceC16633f) it.next()).onVideoPause(c23403e);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoSizeChanged(int i11, int i12) {
        InterfaceC16633f.a.m72419H(this, i11, i12);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoStart(C23403e c23403e) {
        MediaItem mediaItemM92933i;
        InterfaceC16633f.a.m72420I(this, c23403e);
        C16625i.f55907a.m72389a(m65579p() + " --> onVideoStart() --> subjectId = " + ((c23403e == null || (mediaItemM92933i = c23403e.m92933i()) == null) ? null : mediaItemM92933i.getSubjectId()));
        MediaItem mediaItem = this.f51054b;
        if (mediaItem != null) {
            mediaItem.setState(MediaItem.MUSIC_FLOAT_STATE_PLAY);
        }
        Iterator it = this.f51056d.iterator();
        while (it.hasNext()) {
            ((InterfaceC16633f) it.next()).onVideoStart(c23403e);
        }
    }

    /* JADX INFO: renamed from: q */
    public final MediaItem m65588q() {
        return this.f51054b;
    }

    /* JADX INFO: renamed from: r */
    public final String m65589r() {
        return this.f51055c;
    }

    /* JADX INFO: renamed from: s */
    public final InterfaceC16634g m65590s() {
        if (this.f51057e == null) {
            C26041a0 c26041a0 = new C26041a0();
            c26041a0.addPlayerListener(this);
            this.f51057e = c26041a0;
        }
        return this.f51057e;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void setOnSeekCompleteListener() {
        InterfaceC16633f.a.m72422K(this);
    }

    /* JADX INFO: renamed from: t */
    public final String m65591t(String str) {
        return str + "_" + C14554o.f51096a.m65648a(6);
    }

    /* JADX INFO: renamed from: u */
    public final void m65592u() {
        f51050h.m65598b().m65582B(null);
        C16624h.f55898a.m72387p();
        List<Activity> listM27310a = AbstractC5775a.m27310a();
        if (listM27310a != null) {
            for (Activity activity : listM27310a) {
                BaseMusicFloatActivity baseMusicFloatActivity = activity instanceof BaseMusicFloatActivity ? (BaseMusicFloatActivity) activity : null;
                if (baseMusicFloatActivity != null) {
                    MusicFloatView musicFloatView = (MusicFloatView) baseMusicFloatActivity.findViewById(baseMusicFloatActivity.hashCode());
                    if (musicFloatView != null) {
                        musicFloatView.setVisibility(8);
                    }
                    baseMusicFloatActivity.onCloseMusicFloating();
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m65593v() {
        return this.f51053a;
    }

    /* JADX INFO: renamed from: w */
    public final List m65594w() {
        return this.f51058f;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m65595x(AppCompatActivity appCompatActivity) {
        MusicFloatView musicFloatView = appCompatActivity != null ? (MusicFloatView) appCompatActivity.findViewById(appCompatActivity.hashCode()) : null;
        return musicFloatView != null && musicFloatView.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: z */
    public final void m65596z(InterfaceC16633f listener) {
        Intrinsics.m97802h(listener, "listener");
        if (this.f51056d.contains(listener)) {
            this.f51056d.remove(listener);
        }
    }
}
