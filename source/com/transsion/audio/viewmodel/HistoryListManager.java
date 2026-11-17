package com.transsion.audio.viewmodel;

import android.app.Application;
import androidx.p1004lifecycle.C3187b0;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.audio.AudioBean;
import fj.InterfaceC23383a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25132j;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import p602mj.InterfaceC25866a;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
public final class HistoryListManager {

    /* JADX INFO: renamed from: e */
    public static final C14268a f50535e = new C14268a(null);

    /* JADX INFO: renamed from: f */
    private static final Lazy f50536f = LazyKt.m97096a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: com.transsion.audio.viewmodel.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HistoryListManager.m64697x();
        }
    });

    /* JADX INFO: renamed from: g */
    private static boolean f50537g;

    /* JADX INFO: renamed from: a */
    private final Lazy f50538a = LazyKt.m97097b(new Function0() { // from class: com.transsion.audio.viewmodel.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HistoryListManager.m64693m();
        }
    });

    /* JADX INFO: renamed from: b */
    private final Lazy f50539b = LazyKt.m97097b(new Function0() { // from class: com.transsion.audio.viewmodel.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HistoryListManager.m64698y();
        }
    });

    /* JADX INFO: renamed from: c */
    private final Lazy f50540c = LazyKt.m97097b(new Function0() { // from class: com.transsion.audio.viewmodel.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HistoryListManager.m64692l();
        }
    });

    /* JADX INFO: renamed from: d */
    private final Lazy f50541d = LazyKt.m97097b(new Function0() { // from class: com.transsion.audio.viewmodel.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HistoryListManager.m64699z();
        }
    });

    /* JADX INFO: renamed from: com.transsion.audio.viewmodel.HistoryListManager$a */
    public static final class C14268a {
        private C14268a() {
        }

        public /* synthetic */ C14268a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m64708a() {
            return HistoryListManager.f50537g;
        }

        /* JADX INFO: renamed from: b */
        public final HistoryListManager m64709b() {
            return (HistoryListManager) HistoryListManager.f50536f.getValue();
        }

        /* JADX INFO: renamed from: c */
        public final void m64710c(boolean z11) {
            HistoryListManager.f50537g = z11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C3187b0 m64692l() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC25866a m64693m() {
        Application applicationM27275a = Utils.m27275a();
        if (applicationM27275a != null) {
            return AppDatabase.INSTANCE.m64881b(applicationM27275a).mo64867n1();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final InterfaceC25866a m64694q() {
        return (InterfaceC25866a) this.f50538a.getValue();
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m64695t(HistoryListManager historyListManager, String str, String str2, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 10;
        }
        historyListManager.m64705s(str, str2, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final InterfaceC23383a m64696u() {
        return (InterfaceC23383a) this.f50539b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final HistoryListManager m64697x() {
        return new HistoryListManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final InterfaceC23383a m64698y() {
        return (InterfaceC23383a) C22982c.f70163e.m91553a().m91552h(InterfaceC23383a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C3187b0 m64699z() {
        return new C3187b0();
    }

    /* JADX INFO: renamed from: k */
    public final void m64700k(AudioBean audioBean) {
        Intrinsics.m97802h(audioBean, "audioBean");
        C26866a.a.m104899g(C26866a.f81698a, "audio insert name " + audioBean.getTitle(), false, 2, null);
        AbstractC25132j.m99054b(null, new HistoryListManager$addToList$1(audioBean, this, null), 1, null);
    }

    /* JADX INFO: renamed from: n */
    public final void m64701n() {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new HistoryListManager$deleteAll$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m64702o(AudioBean audioItem) {
        Intrinsics.m97802h(audioItem, "audioItem");
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new HistoryListManager$deleteItem$1(this, audioItem, null), 3, null);
    }

    /* JADX INFO: renamed from: p */
    public final C3187b0 m64703p() {
        return (C3187b0) this.f50540c.getValue();
    }

    /* JADX INFO: renamed from: r */
    public final void m64704r() {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new HistoryListManager$getAudioList$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: s */
    public final void m64705s(String subjectId, String postId, int i11) {
        Intrinsics.m97802h(subjectId, "subjectId");
        Intrinsics.m97802h(postId, "postId");
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new HistoryListManager$getResourcePosition$1(this, subjectId, postId, i11, null), 3, null);
    }

    /* JADX INFO: renamed from: v */
    public final C3187b0 m64706v() {
        return (C3187b0) this.f50541d.getValue();
    }

    /* JADX INFO: renamed from: w */
    public final void m64707w(AudioBean audioBean) {
        Intrinsics.m97802h(audioBean, "audioBean");
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new HistoryListManager$insert$1(audioBean, this, null), 3, null);
    }
}
