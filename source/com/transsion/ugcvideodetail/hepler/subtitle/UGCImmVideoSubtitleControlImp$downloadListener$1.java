package com.transsion.ugcvideodetail.hepler.subtitle;

import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import com.transsion.subtitle.R$string;
import com.transsion.subtitle_download.InterfaceC19743a;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class UGCImmVideoSubtitleControlImp$downloadListener$1 implements InterfaceC19743a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ UGCImmVideoSubtitleControlImp f64437a;

    UGCImmVideoSubtitleControlImp$downloadListener$1(UGCImmVideoSubtitleControlImp uGCImmVideoSubtitleControlImp) {
        this.f64437a = uGCImmVideoSubtitleControlImp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m84135b(SubtitleDownloadTable subtitleDownloadTable, UGCImmVideoSubtitleControlImp uGCImmVideoSubtitleControlImp) {
        if (subtitleDownloadTable.getIsSetImmediately() && Intrinsics.m97797c(uGCImmVideoSubtitleControlImp.m84133u(), subtitleDownloadTable.getResourceId())) {
            C28951b.f88586a.m111454d(R$string.subtitle_download_failed);
        }
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onComplete(SubtitleDownloadTable stDownloadTable) {
        Intrinsics.m97802h(stDownloadTable, "stDownloadTable");
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this.f64437a.f64421a), null, null, new UGCImmVideoSubtitleControlImp$downloadListener$1$onComplete$1(this.f64437a, stDownloadTable, null), 3, null);
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onDownloading(int i11, SubtitleDownloadTable stDownloadTable) {
        Intrinsics.m97802h(stDownloadTable, "stDownloadTable");
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onFail(Exception e11, final SubtitleDownloadTable dbBean) {
        Intrinsics.m97802h(e11, "e");
        Intrinsics.m97802h(dbBean, "dbBean");
        FragmentActivity fragmentActivity = this.f64437a.f64421a;
        final UGCImmVideoSubtitleControlImp uGCImmVideoSubtitleControlImp = this.f64437a;
        fragmentActivity.runOnUiThread(new Runnable() { // from class: com.transsion.ugcvideodetail.hepler.subtitle.d
            @Override // java.lang.Runnable
            public final void run() {
                UGCImmVideoSubtitleControlImp$downloadListener$1.m84135b(dbBean, uGCImmVideoSubtitleControlImp);
            }
        });
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onSaveDownload(SubtitleDownloadTable bean) {
        Intrinsics.m97802h(bean, "bean");
        if (Intrinsics.m97797c(bean.getResourceId(), this.f64437a.m84133u())) {
            AbstractC25136k.m99058d(AbstractC3226v.m14968a(this.f64437a.f64421a), null, null, new C20323x48f612f2(this.f64437a, bean, null), 3, null);
        } else {
            C26866a.a.m104898f(C26866a.f81698a, this.f64437a.f64428h, " -------- onSaveDownload，不是当前视频，不做处理", false, 4, null);
        }
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onUnGzZip(SubtitleDownloadTable subtitleDownloadTable) {
        InterfaceC19743a.a.m82280b(this, subtitleDownloadTable);
    }
}
