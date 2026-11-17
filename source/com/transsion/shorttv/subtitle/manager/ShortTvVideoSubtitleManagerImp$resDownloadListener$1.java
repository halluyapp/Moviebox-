package com.transsion.shorttv.subtitle.manager;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p848vs.InterfaceC28223n;
import p955ys.C29006a;
import p955ys.C29007b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTvVideoSubtitleManagerImp$resDownloadListener$1 implements InterfaceC28223n {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ShortTvVideoSubtitleManagerImp f60918a;

    ShortTvVideoSubtitleManagerImp$resDownloadListener$1(ShortTvVideoSubtitleManagerImp shortTvVideoSubtitleManagerImp) {
        this.f60918a = shortTvVideoSubtitleManagerImp;
    }

    /* JADX INFO: renamed from: e */
    private final void m79500e(C29006a c29006a, boolean z11) {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99267a()), null, null, new C18882x2ba62362(this.f60918a, c29006a, z11, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final boolean m79501f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29007b c29007b = (C29007b) it.next();
            if (c29007b.m111562b() && c29007b.m111561a().getStatus() == 6) {
                return true;
            }
        }
        return false;
    }

    @Override // p848vs.InterfaceC28223n
    /* JADX INFO: renamed from: a */
    public void mo79502a(String subtitleResId) {
        Intrinsics.m97802h(subtitleResId, "subtitleResId");
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99267a()), null, null, new C18881xaf622bdb(subtitleResId, null), 3, null);
    }

    @Override // p848vs.InterfaceC28223n
    /* JADX INFO: renamed from: b */
    public void mo79503b(C29006a bean) {
        Intrinsics.m97802h(bean, "bean");
        m79500e(bean, true);
    }

    @Override // p848vs.InterfaceC28223n
    /* JADX INFO: renamed from: c */
    public void mo79504c(C29006a bean, boolean z11) {
        Intrinsics.m97802h(bean, "bean");
        C26866a.f81698a.m104912c("short_tv_subtitle", this.f60918a.f60914c + " 开始下载，检测字幕 firstDownload:" + z11 + "，titleName:" + bean.m111560h() + ", ep:" + bean.m111553a() + " se:" + bean.m111555c(), true);
        if (z11) {
            ShortTvVideoSubtitleManagerImp.m79487n(this.f60918a, bean, null, 2, null);
        } else {
            m79500e(bean, false);
        }
    }
}
