package com.transsion.shorttv.subtitle;

import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import com.transsion.shorttv.R$string;
import com.transsion.subtitle_download.InterfaceC19743a;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p557ks.C25427b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTVSubtitleControlImp$downloadListener$1 implements InterfaceC19743a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ShortTVSubtitleControlImp f60903a;

    ShortTVSubtitleControlImp$downloadListener$1(ShortTVSubtitleControlImp shortTVSubtitleControlImp) {
        this.f60903a = shortTVSubtitleControlImp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m79478b(SubtitleDownloadTable subtitleDownloadTable, ShortTVSubtitleControlImp shortTVSubtitleControlImp) {
        if (subtitleDownloadTable.getIsSetImmediately() && Intrinsics.m97797c(shortTVSubtitleControlImp.f60891e.m104514f(), subtitleDownloadTable.getResourceId())) {
            C25427b.f76996a.m99960d(R$string.short_tv_subtitle_download_failed);
        }
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onComplete(SubtitleDownloadTable stDownloadTable) {
        Intrinsics.m97802h(stDownloadTable, "stDownloadTable");
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this.f60903a.f60888b), null, null, new ShortTVSubtitleControlImp$downloadListener$1$onComplete$1(this.f60903a, stDownloadTable, null), 3, null);
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onDownloading(int i11, SubtitleDownloadTable stDownloadTable) {
        Intrinsics.m97802h(stDownloadTable, "stDownloadTable");
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onFail(Exception e11, final SubtitleDownloadTable dbBean) {
        Intrinsics.m97802h(e11, "e");
        Intrinsics.m97802h(dbBean, "dbBean");
        FragmentActivity fragmentActivity = this.f60903a.f60888b;
        final ShortTVSubtitleControlImp shortTVSubtitleControlImp = this.f60903a;
        fragmentActivity.runOnUiThread(new Runnable() { // from class: com.transsion.shorttv.subtitle.d
            @Override // java.lang.Runnable
            public final void run() {
                ShortTVSubtitleControlImp$downloadListener$1.m79478b(dbBean, shortTVSubtitleControlImp);
            }
        });
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onSaveDownload(SubtitleDownloadTable bean) {
        Intrinsics.m97802h(bean, "bean");
        if (Intrinsics.m97797c(bean.getResourceId(), this.f60903a.f60891e.m104514f())) {
            AbstractC25136k.m99058d(AbstractC3226v.m14968a(this.f60903a.f60888b), null, null, new ShortTVSubtitleControlImp$downloadListener$1$onSaveDownload$1(this.f60903a, bean, null), 3, null);
            return;
        }
        C26866a.a.m104899g(C26866a.f81698a, this.f60903a.f60893g + " --> -------- onSaveDownload，不是当前视频，不做处理", false, 2, null);
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onUnGzZip(SubtitleDownloadTable subtitleDownloadTable) {
        InterfaceC19743a.a.m82280b(this, subtitleDownloadTable);
    }
}
