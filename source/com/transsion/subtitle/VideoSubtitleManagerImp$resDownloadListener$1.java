package com.transsion.subtitle;

import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.report.C14482a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p528ju.C24469a;
import p648oj.InterfaceC26281s0;
import pg.C26866a;

/* JADX INFO: loaded from: classes.dex */
public final class VideoSubtitleManagerImp$resDownloadListener$1 implements InterfaceC26281s0 {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ VideoSubtitleManagerImp f62782a;

    VideoSubtitleManagerImp$resDownloadListener$1(VideoSubtitleManagerImp videoSubtitleManagerImp) {
        this.f62782a = videoSubtitleManagerImp;
    }

    /* JADX INFO: renamed from: e */
    private final void m81950e(DownloadBean downloadBean, boolean z11) {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99267a()), null, null, new VideoSubtitleManagerImp$resDownloadListener$1$downloadCheck$1(this.f62782a, downloadBean, z11, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final boolean m81951f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C24469a c24469a = (C24469a) it.next();
            if (c24469a.m96013d() && c24469a.m96011b().getStatus() == 6) {
                return true;
            }
        }
        return false;
    }

    @Override // p648oj.InterfaceC26281s0
    /* JADX INFO: renamed from: a */
    public void mo73648a(String subtitleResId) {
        Intrinsics.m97802h(subtitleResId, "subtitleResId");
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99267a()), null, null, new VideoSubtitleManagerImp$resDownloadListener$1$deleteSubtitle$1(subtitleResId, null), 3, null);
    }

    @Override // p648oj.InterfaceC26281s0
    /* JADX INFO: renamed from: b */
    public void mo73649b(DownloadBean bean) {
        Intrinsics.m97802h(bean, "bean");
        m81950e(bean, true);
    }

    @Override // p648oj.InterfaceC26281s0
    /* JADX INFO: renamed from: c */
    public void mo73650c(DownloadBean bean, boolean z11) {
        Intrinsics.m97802h(bean, "bean");
        C26866a.f81698a.m104912c(C14482a.f50937a.m65273a(), this.f62782a.f62779d + " 开始下载，检测字幕 firstDownload:" + z11 + "，titleName:" + bean.getTitleName() + ", ep:" + bean.getEp() + " se:" + bean.getSe(), true);
        if (z11) {
            VideoSubtitleManagerImp.m81932t(this.f62782a, bean, null, 2, null);
        } else {
            m81950e(bean, false);
        }
    }
}
