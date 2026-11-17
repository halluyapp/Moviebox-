package com.transsion.shorttv.subtitle.manager;

import at.InterfaceC4708a;
import com.transsion.subtitle_download.InterfaceC19743a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p955ys.C29006a;
import p955ys.C29007b;

/* JADX INFO: renamed from: com.transsion.shorttv.subtitle.manager.b */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC18884b {

    /* JADX INFO: renamed from: a */
    public static final a f60919a = a.f60920a;

    /* JADX INFO: renamed from: com.transsion.shorttv.subtitle.manager.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ a f60920a = new a();

        /* JADX INFO: renamed from: b */
        private static final Lazy f60921b = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.subtitle.manager.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InterfaceC18884b.a.m79506c();
            }
        });

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final ShortTvVideoSubtitleManagerImp m79506c() {
            return new ShortTvVideoSubtitleManagerImp();
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC18884b m79507b() {
            return (InterfaceC18884b) f60921b.getValue();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.subtitle.manager.b$b */
    public static final class b {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m79508a(InterfaceC18884b interfaceC18884b, C29006a c29006a, Function1 function1, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onVideoPageInNet2CheckSubtitle");
            }
            if ((i11 & 2) != 0) {
                function1 = null;
            }
            interfaceC18884b.mo79495d(c29006a, function1);
        }
    }

    /* JADX INFO: renamed from: a */
    Object mo79492a(String str, Continuation continuation);

    /* JADX INFO: renamed from: b */
    void mo79493b(InterfaceC19743a interfaceC19743a);

    /* JADX INFO: renamed from: c */
    void mo79494c(InterfaceC19743a interfaceC19743a);

    /* JADX INFO: renamed from: d */
    void mo79495d(C29006a c29006a, Function1 function1);

    /* JADX INFO: renamed from: e */
    void mo79496e(InterfaceC4708a interfaceC4708a);

    /* JADX INFO: renamed from: f */
    void mo79497f(C29007b c29007b);

    /* JADX INFO: renamed from: g */
    void mo79498g(InterfaceC4708a interfaceC4708a);

    void init();
}
