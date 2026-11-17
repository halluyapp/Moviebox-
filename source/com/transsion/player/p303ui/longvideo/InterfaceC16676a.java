package com.transsion.player.p303ui.longvideo;

import android.view.MotionEvent;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.p1003enum.ScaleMode;
import com.transsion.player.p303ui.ORPlayerView;
import fo.C23403e;
import kotlin.jvm.internal.Intrinsics;
import no.InterfaceC26075z;
import p438go.C23619a;
import p438go.C23622d;

/* JADX INFO: renamed from: com.transsion.player.ui.longvideo.a */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC16676a extends InterfaceC16634g {

    /* JADX INFO: renamed from: com.transsion.player.ui.longvideo.a$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static boolean m72610a(InterfaceC16676a interfaceC16676a, C23403e mediaSource) {
            Intrinsics.m97802h(mediaSource, "mediaSource");
            return InterfaceC16634g.b.m72451a(interfaceC16676a, mediaSource);
        }

        /* JADX INFO: renamed from: b */
        public static void m72611b(InterfaceC16676a interfaceC16676a) {
            InterfaceC16634g.b.m72454d(interfaceC16676a);
        }

        /* JADX INFO: renamed from: c */
        public static C23403e m72612c(InterfaceC16676a interfaceC16676a) {
            return InterfaceC16634g.b.m72456f(interfaceC16676a);
        }

        /* JADX INFO: renamed from: d */
        public static int m72613d(InterfaceC16676a interfaceC16676a) {
            return InterfaceC16634g.b.m72461k(interfaceC16676a);
        }

        /* JADX INFO: renamed from: e */
        public static int m72614e(InterfaceC16676a interfaceC16676a) {
            return InterfaceC16634g.b.m72462l(interfaceC16676a);
        }

        /* JADX INFO: renamed from: f */
        public static boolean m72615f(InterfaceC16676a interfaceC16676a) {
            return InterfaceC16634g.b.m72463m(interfaceC16676a);
        }

        /* JADX INFO: renamed from: g */
        public static boolean m72616g(InterfaceC16676a interfaceC16676a) {
            return InterfaceC16634g.b.m72464n(interfaceC16676a);
        }

        /* JADX INFO: renamed from: h */
        public static void m72617h(InterfaceC16676a interfaceC16676a, String str) {
            InterfaceC16634g.b.m72465o(interfaceC16676a, str);
        }

        /* JADX INFO: renamed from: i */
        public static boolean m72618i(InterfaceC16676a interfaceC16676a, C23403e mediaSource) {
            Intrinsics.m97802h(mediaSource, "mediaSource");
            return InterfaceC16634g.b.m72466p(interfaceC16676a, mediaSource);
        }

        /* JADX INFO: renamed from: j */
        public static void m72619j(InterfaceC16676a interfaceC16676a, String uuid, long j11) {
            Intrinsics.m97802h(uuid, "uuid");
            InterfaceC16634g.b.m72469s(interfaceC16676a, uuid, j11);
        }

        /* JADX INFO: renamed from: k */
        public static void m72620k(InterfaceC16676a interfaceC16676a) {
            InterfaceC16634g.b.m72470t(interfaceC16676a);
        }

        /* JADX INFO: renamed from: l */
        public static void m72621l(InterfaceC16676a interfaceC16676a, InterfaceC26075z listener) {
            Intrinsics.m97802h(listener, "listener");
            InterfaceC16634g.b.m72471u(interfaceC16676a, listener);
        }

        /* JADX INFO: renamed from: m */
        public static void m72622m(InterfaceC16676a interfaceC16676a, boolean z11) {
            InterfaceC16634g.b.m72472v(interfaceC16676a, z11);
        }

        /* JADX INFO: renamed from: n */
        public static void m72623n(InterfaceC16676a interfaceC16676a, C23622d vodConfig) {
            Intrinsics.m97802h(vodConfig, "vodConfig");
            InterfaceC16634g.b.m72473w(interfaceC16676a, vodConfig);
        }

        /* JADX INFO: renamed from: o */
        public static void m72624o(InterfaceC16676a interfaceC16676a, ScaleMode scaleMode) {
            Intrinsics.m97802h(scaleMode, "scaleMode");
            InterfaceC16634g.b.m72474x(interfaceC16676a, scaleMode);
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.ui.longvideo.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo72133a();

        /* JADX INFO: renamed from: b */
        void mo72134b(float f11, float f12);

        /* JADX INFO: renamed from: c */
        void mo72135c();

        void onDoubleTap(MotionEvent motionEvent);

        void onLongPress(MotionEvent motionEvent);
    }

    void enableGesture(boolean z11);

    InterfaceC16634g getOrPlayer();

    void initLongVodPlayer(C23619a c23619a, ORPlayerView oRPlayerView);

    void setExistPlayer(C23619a c23619a, InterfaceC16634g interfaceC16634g, ORPlayerView oRPlayerView);

    void setGestureListener(b bVar);
}
