package com.transsion.subtitle;

import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.avery.subtitle.widget.SimpleSubtitleView;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.integration.constants.IntegrationConstants;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.subtitle_download.InterfaceC19743a;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p528ju.C24469a;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoSubtitleControl$downloadListener$1 implements InterfaceC19743a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ VideoSubtitleControl f62775a;

    VideoSubtitleControl$downloadListener$1(VideoSubtitleControl videoSubtitleControl) {
        this.f62775a = videoSubtitleControl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final void m81915e(C24469a c24469a) {
        String str;
        SimpleSubtitleView simpleSubtitleView;
        Iterator it = this.f62775a.f62757l.iterator();
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            str = "1st";
            if (!it.hasNext()) {
                break;
            }
            C24469a c24469a2 = (C24469a) it.next();
            if (TextUtils.equals(c24469a2.m96010a(), "1st")) {
                z12 = true;
            }
            if (TextUtils.equals(c24469a2.m96010a(), "2nd")) {
                z13 = true;
            }
        }
        if (z12) {
            if (z13) {
                str = "";
                if (z13) {
                    List<C24469a> list = this.f62775a.f62757l;
                    VideoSubtitleControl videoSubtitleControl = this.f62775a;
                    for (C24469a c24469a3 : list) {
                        if (c24469a3.m96015f() && TextUtils.equals(c24469a3.m96010a(), "2nd")) {
                            c24469a3.m96021l(false);
                            c24469a3.m96016g("");
                            videoSubtitleControl.f62742F.remove(c24469a3);
                        }
                    }
                    C19655a.f62783a.m81952a(this.f62775a.getClass().getSimpleName() + " --> subtitleSelectFromSearch() --> 有第二个 --> 替换");
                    simpleSubtitleView = (SimpleSubtitleView) this.f62775a.f62765t.get(IntegrationConstants.TAB_BAR_POSITION_DEFAULT);
                } else {
                    simpleSubtitleView = null;
                }
            } else {
                C19655a.f62783a.m81952a(this.f62775a.getClass().getSimpleName() + " --> subtitleSelectFromSearch() --> 没有第二个 --> 直接添加到第二个");
                simpleSubtitleView = (SimpleSubtitleView) this.f62775a.f62765t.get(IntegrationConstants.TAB_BAR_POSITION_DEFAULT);
            }
            str = "2nd";
        } else {
            C19655a.f62783a.m81952a(this.f62775a.getClass().getSimpleName() + " --> subtitleSelectFromSearch() --> 一个都没有 --> 直接添加到第一个");
            this.f62775a.f62742F.clear();
            simpleSubtitleView = (SimpleSubtitleView) this.f62775a.f62765t.get(IntegrationConstants.TAB_BAR_POSITION_TOP);
            z11 = true;
        }
        c24469a.m96021l(true);
        c24469a.m96016g(str);
        this.f62775a.f62742F.add(c24469a);
        List<C24469a> list2 = this.f62775a.f62757l;
        VideoSubtitleControl videoSubtitleControl2 = this.f62775a;
        for (C24469a c24469a4 : list2) {
            if (TextUtils.equals(c24469a4.m96011b().getId(), c24469a.m96011b().getId())) {
                c24469a4.m96021l(true);
                c24469a4.m96011b().setStatus(c24469a.m96011b().getStatus());
                c24469a4.m96016g(c24469a.m96010a());
                C19655a.f62783a.m81952a(videoSubtitleControl2.getClass().getSimpleName() + " --> handleSetImmediately() --> 双语字幕模式 --> 列表字幕下载处理 -- 下载状态处理");
            }
        }
        this.f62775a.m81845d0(c24469a, simpleSubtitleView, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m81916f(SubtitleDownloadTable subtitleDownloadTable, VideoSubtitleControl videoSubtitleControl) {
        Function1 function1;
        if (subtitleDownloadTable.getIsSetImmediately()) {
            DownloadBean downloadBean = videoSubtitleControl.f62761p;
            if (!TextUtils.equals(downloadBean != null ? downloadBean.getResourceId() : null, subtitleDownloadTable.getResourceId()) || (function1 = videoSubtitleControl.f62755j) == null) {
                return;
            }
            function1.invoke(Utils.m27275a().getString(R$string.subtitle_download_failed));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final void m81917g() {
        String lan = "";
        String lan2 = lan;
        for (C24469a c24469a : this.f62775a.f62742F) {
            if (TextUtils.equals(c24469a.m96010a(), "1st")) {
                lan = c24469a.m96011b().getLan();
                if (lan == null) {
                    lan = "";
                }
            } else if (TextUtils.equals(c24469a.m96010a(), "2nd") && (lan2 = c24469a.m96011b().getLan()) == null) {
                lan2 = "";
            }
        }
        this.f62775a.f62756k.invoke(lan, lan2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final void m81918h(C24469a c24469a) {
        List<C24469a> list = this.f62775a.f62757l;
        VideoSubtitleControl videoSubtitleControl = this.f62775a;
        for (C24469a c24469a2 : list) {
            c24469a2.m96021l(false);
            if (TextUtils.equals(c24469a2.m96011b().getId(), c24469a.m96011b().getId())) {
                c24469a2.m96021l(true);
                c24469a2.m96011b().setStatus(5);
                C19655a.f62783a.m81952a(videoSubtitleControl.getClass().getSimpleName() + " --> handleSetImmediately() --> 单字幕模式 --> 如果是单语字幕仅需要将之前设置的全部置空 当前设置选中");
            }
        }
        this.f62775a.f62742F.clear();
        this.f62775a.f62742F.add(c24469a);
        VideoSubtitleControl videoSubtitleControl2 = this.f62775a;
        videoSubtitleControl2.m81845d0(c24469a, (SimpleSubtitleView) videoSubtitleControl2.f62765t.get(IntegrationConstants.TAB_BAR_POSITION_TOP), true);
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onComplete(SubtitleDownloadTable stDownloadTable) {
        Intrinsics.m97802h(stDownloadTable, "stDownloadTable");
        AbstractC25136k.m99058d(this.f62775a.f62764s, null, null, new VideoSubtitleControl$downloadListener$1$onComplete$1(stDownloadTable, this.f62775a, this, null), 3, null);
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onDownloading(int i11, SubtitleDownloadTable stDownloadTable) {
        Intrinsics.m97802h(stDownloadTable, "stDownloadTable");
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onFail(Exception e11, final SubtitleDownloadTable dbBean) {
        Intrinsics.m97802h(e11, "e");
        Intrinsics.m97802h(dbBean, "dbBean");
        FragmentActivity fragmentActivity = this.f62775a.f62746a;
        final VideoSubtitleControl videoSubtitleControl = this.f62775a;
        fragmentActivity.runOnUiThread(new Runnable() { // from class: com.transsion.subtitle.f
            @Override // java.lang.Runnable
            public final void run() {
                VideoSubtitleControl$downloadListener$1.m81916f(dbBean, videoSubtitleControl);
            }
        });
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onSaveDownload(SubtitleDownloadTable bean) {
        Intrinsics.m97802h(bean, "bean");
        String resourceId = bean.getResourceId();
        DownloadBean downloadBean = this.f62775a.f62761p;
        if (Intrinsics.m97797c(resourceId, downloadBean != null ? downloadBean.getSubtitleResId() : null)) {
            AbstractC25136k.m99058d(this.f62775a.f62764s, null, null, new VideoSubtitleControl$downloadListener$1$onSaveDownload$1(this.f62775a, bean, null), 3, null);
            return;
        }
        C19655a.f62783a.m81952a(this.f62775a.getClass().getSimpleName() + " --> -------- onSaveDownload，不是当前视频，不做处理");
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onUnGzZip(SubtitleDownloadTable subtitleDownloadTable) {
        InterfaceC19743a.a.m82280b(this, subtitleDownloadTable);
    }
}
