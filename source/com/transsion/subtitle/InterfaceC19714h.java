package com.transsion.subtitle;

import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.subtitle_download.InterfaceC19743a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import mu.InterfaceC25911c;
import p528ju.C24469a;

/* JADX INFO: renamed from: com.transsion.subtitle.h */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC19714h {

    /* JADX INFO: renamed from: a */
    public static final a f62935a = a.f62936a;

    /* JADX INFO: renamed from: com.transsion.subtitle.h$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ a f62936a = new a();

        /* JADX INFO: renamed from: b */
        private static final Lazy f62937b = LazyKt.m97097b(new Function0() { // from class: com.transsion.subtitle.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InterfaceC19714h.a.m82147c();
            }
        });

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final VideoSubtitleManagerImp m82147c() {
            return new VideoSubtitleManagerImp();
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC19714h m82148b() {
            return (InterfaceC19714h) f62937b.getValue();
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.h$b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class b {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m82149a(InterfaceC19714h interfaceC19714h, DownloadBean downloadBean, Function1 function1, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onVideoPageInNet2CheckSubtitle");
            }
            if ((i11 & 2) != 0) {
                function1 = null;
            }
            interfaceC19714h.mo81942d(downloadBean, function1);
        }
    }

    /* JADX INFO: renamed from: a */
    Object mo81939a(String str, Continuation continuation);

    /* JADX INFO: renamed from: b */
    void mo81940b(InterfaceC19743a interfaceC19743a);

    /* JADX INFO: renamed from: c */
    void mo81941c(InterfaceC19743a interfaceC19743a);

    /* JADX INFO: renamed from: d */
    void mo81942d(DownloadBean downloadBean, Function1 function1);

    void destroy();

    /* JADX INFO: renamed from: e */
    void mo81943e(InterfaceC25911c interfaceC25911c);

    /* JADX INFO: renamed from: f */
    void mo81944f(InterfaceC25911c interfaceC25911c);

    /* JADX INFO: renamed from: g */
    void mo81945g(C24469a c24469a);

    /* JADX INFO: renamed from: h */
    void mo81946h(C24469a c24469a);

    /* JADX INFO: renamed from: i */
    void mo81947i(DownloadBean downloadBean);

    void init();

    /* JADX INFO: renamed from: j */
    void mo81948j(C24469a c24469a);

    void reset();
}
