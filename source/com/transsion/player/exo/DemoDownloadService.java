package com.transsion.player.exo;

import android.app.Notification;
import androidx.media3.common.util.AbstractC3336a1;
import androidx.media3.exoplayer.offline.DownloadManager;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.exoplayer.scheduler.PlatformScheduler;
import com.transsion.player.R$mipmap;
import com.transsion.player.R$string;
import java.util.List;
import p396f2.InterfaceC23298f;
import p464ho.AbstractC23874a;

/* JADX INFO: loaded from: classes6.dex */
public class DemoDownloadService extends DownloadService {
    public DemoDownloadService() {
        super(0, 1000L, "download_channel", R$string.exo_download_notification_channel_name, 0);
    }

    @Override // androidx.media3.exoplayer.offline.DownloadService
    /* JADX INFO: renamed from: m */
    protected DownloadManager mo18363m() {
        DownloadManager downloadManagerM94501h = AbstractC23874a.m94501h(this);
        AbstractC23874a.m94502i(this);
        return downloadManagerM94501h;
    }

    @Override // androidx.media3.exoplayer.offline.DownloadService
    /* JADX INFO: renamed from: n */
    protected Notification mo18364n(List list, int i11) {
        return AbstractC23874a.m94502i(this).m18429b(this, R$mipmap.player_ic_download, null, null, list, i11);
    }

    @Override // androidx.media3.exoplayer.offline.DownloadService
    /* JADX INFO: renamed from: q */
    protected InterfaceC23298f mo18365q() {
        if (AbstractC3336a1.f10844a >= 21) {
            return new PlatformScheduler(this, 1);
        }
        return null;
    }
}
