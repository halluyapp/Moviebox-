package com.transsion.baseui.music;

import androidx.p1004lifecycle.AbstractC3192e;
import androidx.p1004lifecycle.InterfaceC3194f;
import androidx.p1004lifecycle.InterfaceC3224u;
import com.transsion.player.mediasession.MediaItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.baseui.music.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C14540a implements InterfaceC3194f {

    /* JADX INFO: renamed from: a */
    public static final C14540a f51075a = new C14540a();

    private C14540a() {
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public /* synthetic */ void onCreate(InterfaceC3224u interfaceC3224u) {
        AbstractC3192e.m14896a(this, interfaceC3224u);
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public /* synthetic */ void onDestroy(InterfaceC3224u interfaceC3224u) {
        AbstractC3192e.m14897b(this, interfaceC3224u);
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public /* synthetic */ void onPause(InterfaceC3224u interfaceC3224u) {
        AbstractC3192e.m14898c(this, interfaceC3224u);
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public /* synthetic */ void onResume(InterfaceC3224u interfaceC3224u) {
        AbstractC3192e.m14899d(this, interfaceC3224u);
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public void onStart(InterfaceC3224u owner) {
        Intrinsics.m97802h(owner, "owner");
        AbstractC3192e.m14900e(this, owner);
        MediaItem mediaItemM65588q = MusicFloatManager.f51050h.m65598b().m65588q();
        if (mediaItemM65588q != null) {
            mediaItemM65588q.setInBackground(Boolean.FALSE);
        }
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public void onStop(InterfaceC3224u owner) {
        Intrinsics.m97802h(owner, "owner");
        AbstractC3192e.m14901f(this, owner);
        MediaItem mediaItemM65588q = MusicFloatManager.f51050h.m65598b().m65588q();
        if (mediaItemM65588q != null) {
            mediaItemM65588q.setInBackground(Boolean.TRUE);
        }
        MusicReport.f51069a.m65627c();
    }
}
