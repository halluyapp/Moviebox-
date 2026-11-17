package com.transsion.ugcvideodetail.hepler.subtitle.manager;

import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.subtitle_download.InterfaceC19743a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import mu.InterfaceC25911c;
import p528ju.C24469a;

/* JADX INFO: renamed from: com.transsion.ugcvideodetail.hepler.subtitle.manager.b */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC20331b {

    /* JADX INFO: renamed from: a */
    public static final a f64452a = a.f64453a;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.hepler.subtitle.manager.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ a f64453a = new a();

        /* JADX INFO: renamed from: b */
        private static final String f64454b = "UGCVideoSubtitleManager";

        /* JADX INFO: renamed from: c */
        private static final Lazy f64455c = LazyKt.m97097b(new Function0() { // from class: com.transsion.ugcvideodetail.hepler.subtitle.manager.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InterfaceC20331b.a.m84159d();
            }
        });

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final UGCVideoSubtitleManagerImp m84159d() {
            return new UGCVideoSubtitleManagerImp();
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC20331b m84160b() {
            return (InterfaceC20331b) f64455c.getValue();
        }

        /* JADX INFO: renamed from: c */
        public final String m84161c() {
            return f64454b;
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.hepler.subtitle.manager.b$b */
    public static final class b {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m84162a(InterfaceC20331b interfaceC20331b, DownloadBean downloadBean, Function1 function1, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onVideoPageInNet2CheckSubtitle");
            }
            if ((i11 & 2) != 0) {
                function1 = null;
            }
            interfaceC20331b.mo84151d(downloadBean, function1);
        }
    }

    /* JADX INFO: renamed from: a */
    Object mo84148a(String str, Continuation continuation);

    /* JADX INFO: renamed from: b */
    void mo84149b(InterfaceC19743a interfaceC19743a);

    /* JADX INFO: renamed from: c */
    void mo84150c(InterfaceC19743a interfaceC19743a);

    /* JADX INFO: renamed from: d */
    void mo84151d(DownloadBean downloadBean, Function1 function1);

    /* JADX INFO: renamed from: e */
    void mo84152e(InterfaceC25911c interfaceC25911c);

    /* JADX INFO: renamed from: f */
    void mo84153f(InterfaceC25911c interfaceC25911c);

    /* JADX INFO: renamed from: h */
    void mo84154h(C24469a c24469a);
}
