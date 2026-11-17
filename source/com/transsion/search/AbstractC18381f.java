package com.transsion.search;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.style.ImageSpan;
import androidx.fragment.app.FragmentActivity;
import ck.AbstractC5114k;
import ck.C5123t;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.PlayUrl;
import com.transsion.moviedetailapi.bean.ResourceDetectors;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsnet.downloader.DownloadManagerApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.search.f */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC18381f {
    /* JADX INFO: renamed from: a */
    public static final ImageSpan m77672a(Context context, int i11) {
        Intrinsics.m97802h(context, "context");
        return Build.VERSION.SDK_INT >= 29 ? new ImageSpan(context, i11, 2) : new ImageSpan(context, i11, 1);
    }

    /* JADX INFO: renamed from: b */
    public static final ImageSpan m77673b(Context context) {
        Intrinsics.m97802h(context, "context");
        int i11 = R$drawable.ic_search_result_split;
        return Build.VERSION.SDK_INT >= 29 ? new ImageSpan(context, i11, 2) : new ImageSpan(context, i11, 1);
    }

    /* JADX INFO: renamed from: c */
    public static final void m77674c(Subject subject, String playModule) {
        String playUrl;
        String playUrl2;
        Intrinsics.m97802h(playModule, "playModule");
        if (subject == null) {
            return;
        }
        if (subject.isJumpBrowser()) {
            PlayUrl playUrl3 = subject.getPlayUrl();
            if (playUrl3 == null || (playUrl2 = playUrl3.getPlayUrl()) == null) {
                return;
            }
            AbstractC5114k.m23926i(playUrl2);
            return;
        }
        if (!subject.isJumpWebview()) {
            Navigator navigatorM61773c = TheRouter.m61773c("/movie/detail");
            Integer subjectType = subject.getSubjectType();
            AbstractC5114k.m23933p(navigatorM61773c.m61852F("subject_type", subjectType != null ? subjectType.intValue() : SubjectType.MOVIE.getValue()).m61857K("id", subject.getSubjectId()).m61857K("module_name", playModule).m61852F("season", subject.getSeason()).m61872z("autoPlay", true).m61857K("ops", subject.getOps()));
        } else {
            PlayUrl playUrl4 = subject.getPlayUrl();
            if (playUrl4 == null || (playUrl = playUrl4.getPlayUrl()) == null) {
                return;
            }
            AbstractC5114k.m23925h(playUrl, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final String m77675d(Subject subject, String pageName, Context context, String playModule) {
        String resourceLink;
        ResourceDetectors resourceDetector;
        String subjectId;
        ResourceDetectors resourceDetector2;
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(playModule, "playModule");
        if (subject != null) {
            Integer subjectType = subject.getSubjectType();
            int value = SubjectType.SHORT_TV.getValue();
            if (subjectType != null && subjectType.intValue() == value) {
                DownloadManagerApi.f66480j.m87093a().m87086d0((FragmentActivity) context, pageName, (384 & 4) != 0 ? "" : "", subject.getOps(), (384 & 16) != 0 ? null : "download_subject", (384 & 32) != 0 ? false : true, (384 & 64) != 0 ? null : subject, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? Boolean.FALSE : null);
                return "download_subject";
            }
        }
        if (C5123t.f17614a.m23960b()) {
            m77674c(subject, playModule);
        } else {
            DownloadManagerApi.C21276a c21276a = DownloadManagerApi.f66480j;
            if (!DownloadManagerApi.m87075x0(c21276a.m87093a(), subject != null ? subject.getSubjectId() : null, (subject == null || (resourceDetector2 = subject.getResourceDetector()) == null) ? null : resourceDetector2.getResourceId(), subject != null && subject.isSeries(), false, 8, null)) {
                DownloadManagerApi downloadManagerApiM87093a = c21276a.m87093a();
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                String ops = subject != null ? subject.getOps() : null;
                if (subject == null || (resourceDetector = subject.getResourceDetector()) == null || (resourceLink = resourceDetector.getResourceLink()) == null) {
                    resourceLink = "";
                }
                downloadManagerApiM87093a.m87080K(fragmentActivity, subject, pageName, (960 & 8) != 0 ? "" : null, ops, resourceLink, (960 & 64) != 0 ? "" : null, (960 & 128) != 0 ? null : null, (960 & 256) != 0 ? null : null, (960 & 512) != 0 ? false : false);
                return "download_subject";
            }
            if (subject != null && (subjectId = subject.getSubjectId()) != null) {
                DownloadManagerApi.m87078z0(c21276a.m87093a(), subjectId, context, pageName, null, 8, null);
            }
        }
        return "play_subject";
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m77676e(Resources resources) {
        Intrinsics.m97802h(resources, "resources");
        return (resources.getConfiguration().screenLayout & 15) >= 3;
    }
}
