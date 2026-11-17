package com.transsion.postdetail.p306ui.interceptor;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import ck.AbstractC5114k;
import com.blankj.utilcode.util.Utils;
import com.therouter.TheRouter;
import com.therouter.router.RouteItem;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.report.C14492k;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.postdetail.shorttv.factory.C16886a;
import com.transsion.postdetail.shorttv.factory.C16894i;
import com.transsnet.downloader.R$string;
import com.transsnet.downloader.manager.DownloadEsHelper;
import com.transsnet.downloader.util.LocalVideoNotExistUtil;
import java.io.File;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p357dt.C23049a;
import p410fg.InterfaceC23360b;
import p536k1.AbstractC24550a;
import p717qr.C27124c;
import p718qs.C27125a;
import p723qx.InterfaceC27138e;
import p944yh.C28951b;
import p981zj.AbstractC29189b;
import pg.C26866a;
import ws.InterfaceC28435a;
import yt.InterfaceC29008a;

/* JADX INFO: loaded from: classes.dex */
public final class LocalVideoDetailInterceptor {

    /* JADX INFO: renamed from: a */
    public static final C17302a f57506a = new C17302a(null);

    /* JADX INFO: renamed from: b */
    private static final Lazy f57507b = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.interceptor.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocalVideoDetailInterceptor.m74592g();
        }
    });

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.interceptor.LocalVideoDetailInterceptor$a */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class C17302a {
        private C17302a() {
        }

        public /* synthetic */ C17302a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final LocalVideoDetailInterceptor m74597a() {
            return (LocalVideoDetailInterceptor) LocalVideoDetailInterceptor.f57507b.getValue();
        }
    }

    /* JADX INFO: renamed from: f */
    private final boolean m74591f(String str, String str2) {
        if (str == null) {
            File file = new File(str2);
            if (file.exists() && file.length() > 0) {
                return true;
            }
        } else {
            if (StringsKt.m98242W(str2, "content", false, 2, null)) {
                AbstractC24550a abstractC24550aM96258g = AbstractC24550a.m96258g(Utils.m27275a(), Uri.parse(str2));
                if (abstractC24550aM96258g != null) {
                    return abstractC24550aM96258g.mo96264e();
                }
                return true;
            }
            File file2 = new File(str2);
            if (file2.exists() && file2.length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final LocalVideoDetailInterceptor m74592g() {
        return new LocalVideoDetailInterceptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final void m74593h(RouteItem routeItem, InterfaceC23360b interfaceC23360b) {
        try {
            if (routeItem.getExtras().getInt("subject_type", -1) == SubjectType.SHORT_TV.getValue()) {
                AbstractC5114k.m23933p(AbstractC5114k.m23919b(TheRouter.m61773c(C27125a.f82236a.m105544b()), routeItem.getExtras()));
                AbstractC29189b.m112003a(interfaceC23360b);
            } else {
                C26866a.a.m104901l(C26866a.f81698a, "VideoFloat", LocalVideoDetailInterceptor.class.getSimpleName() + " open page ----2", false, 4, null);
                interfaceC23360b.mo61885a(routeItem);
            }
        } catch (Throwable unused) {
            interfaceC23360b.mo61885a(routeItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC28435a m74594j() {
        return new C16894i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final InterfaceC29008a m74595k() {
        return new C16886a();
    }

    /* JADX INFO: renamed from: i */
    public final void m74596i(RouteItem postcard, InterfaceC23360b callback) {
        String path;
        Intrinsics.m97802h(postcard, "postcard");
        Intrinsics.m97802h(callback, "callback");
        if (Intrinsics.m97797c(postcard.getPath(), "/ugc_video/detail") || Intrinsics.m97797c(postcard.getPath(), "/ugc_video/local_detail") || Intrinsics.m97797c(postcard.getPath(), "/ugc_shorts/detail")) {
            InterfaceC27138e.b.m105607a(InterfaceC27138e.f82251a.m105606b(), false, 1, null);
        }
        if (!Intrinsics.m97797c(postcard.getPath(), "/video/detail")) {
            if (!Intrinsics.m97797c(postcard.getPath(), C27125a.f82236a.m105544b())) {
                callback.mo61885a(postcard);
                return;
            }
            C27124c.f82233a.m105539a(new Function0() { // from class: com.transsion.postdetail.ui.interceptor.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LocalVideoDetailInterceptor.m74594j();
                }
            });
            C23049a.f70283a.m91695a(new Function0() { // from class: com.transsion.postdetail.ui.interceptor.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LocalVideoDetailInterceptor.m74595k();
                }
            });
            InterfaceC27138e.b.m105607a(InterfaceC27138e.f82251a.m105606b(), false, 1, null);
            Bundle extras = postcard.getExtras();
            Serializable serializable = extras.getSerializable("item_object");
            Subject subject = serializable instanceof Subject ? (Subject) serializable : null;
            String string = subject == null ? extras.getString("id") : subject.getSubjectId();
            int i11 = extras.getInt("ep");
            int i12 = extras.getInt("extra_series_position", -1);
            if (string == null) {
                callback.mo61885a(postcard);
                return;
            }
            DownloadBean downloadBeanM88595x = DownloadEsHelper.f67591m.m88598a().m88595x(string, i11);
            if ((downloadBeanM88595x != null ? downloadBeanM88595x.getPath() : null) == null || !downloadBeanM88595x.isCompleted()) {
                callback.mo61885a(postcard);
                return;
            }
            String resourceId = downloadBeanM88595x.getResourceId();
            String path2 = downloadBeanM88595x.getPath();
            Intrinsics.m97799e(path2);
            if (m74591f(resourceId, path2)) {
                callback.mo61885a(postcard);
                return;
            }
            Activity activityM65321o = C14492k.f50955a.m65321o();
            if (activityM65321o == null || activityM65321o.isDestroyed() || activityM65321o.isFinishing()) {
                return;
            }
            LocalVideoNotExistUtil.f68083a.m89402v(activityM65321o, downloadBeanM88595x, i12);
            return;
        }
        InterfaceC27138e.b.m105607a(InterfaceC27138e.f82251a.m105606b(), false, 1, null);
        Bundle extras2 = postcard.getExtras();
        String string2 = extras2.getString("extra_url");
        String string3 = extras2.getString("extra_subject_id");
        if (string3 == null) {
            string3 = "";
        }
        String string4 = extras2.getString("extra_local_path");
        String string5 = extras2.getString("extra_resource_id");
        boolean z11 = extras2.getBoolean("extra_is_series");
        int i13 = extras2.getInt("extra_series_position", -1);
        boolean z12 = extras2.getBoolean("extra_completed", true);
        if (extras2.getBoolean("extra_from_deeplink", false)) {
            callback.mo61885a(postcard);
            return;
        }
        if (string5 != null) {
            DownloadBean downloadBeanM88589q = DownloadEsHelper.f67591m.m88598a().m88589q(string5);
            if (downloadBeanM88589q != null && (path = downloadBeanM88589q.getPath()) != null) {
                string4 = path;
            }
            extras2.putString("extra_local_path", string4);
        }
        C26866a.a aVar = C26866a.f81698a;
        aVar.m104912c("Download_LocalVideoDetailInterceptor", "isDownloadCompleted  = " + z12 + "， path = " + string4, true);
        boolean z13 = (string2 == null || StringsKt.m98242W(string2, "http", false, 2, null) || string3.length() != 0) ? false : true;
        if (string4 == null || string4.length() <= 0) {
            C26866a.a.m104898f(aVar, "Download_LocalVideoDetailInterceptor", "file is error, show error dialog, ", false, 4, null);
            Activity activityM65321o2 = C14492k.f50955a.m65321o();
            if (activityM65321o2 == null || activityM65321o2.isDestroyed() || activityM65321o2.isFinishing()) {
                return;
            }
            LocalVideoNotExistUtil localVideoNotExistUtil = LocalVideoNotExistUtil.f68083a;
            Intrinsics.m97799e(string5);
            localVideoNotExistUtil.m89403w(activityM65321o2, string5, string4, z11, i13);
            return;
        }
        boolean zM74591f = m74591f(string5, string4);
        if (!z12) {
            C26866a.a.m104898f(aVar, "Download_LocalVideoDetailInterceptor", "downloading play, open page", false, 4, null);
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new LocalVideoDetailInterceptor$process$1(string5, this, postcard, callback, string3, null), 3, null);
            return;
        }
        if (zM74591f) {
            C26866a.a.m104898f(aVar, "Download_LocalVideoDetailInterceptor", "open page", false, 4, null);
            m74593h(postcard, callback);
            return;
        }
        C26866a.a.m104898f(aVar, "Download_LocalVideoDetailInterceptor", "file is error, show error dialog, c, isOutside = " + z13, false, 4, null);
        if (z13) {
            C28951b.f88586a.m111454d(R$string.download_no_local_file_tips);
            return;
        }
        Activity activityM65321o3 = C14492k.f50955a.m65321o();
        if (activityM65321o3 == null || activityM65321o3.isDestroyed() || activityM65321o3.isFinishing()) {
            return;
        }
        LocalVideoNotExistUtil localVideoNotExistUtil2 = LocalVideoNotExistUtil.f68083a;
        Intrinsics.m97799e(string5);
        localVideoNotExistUtil2.m89403w(activityM65321o3, string5, string4, z11, i13);
    }
}
