package com.transsion.shorttv_pugc.p317ui.widget;

import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.shorttv_pugc.ShorttvModel;
import com.transsion.shorttv_pugc.p317ui.fragment.ShortTvDetailListFragment;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.widget.a */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC19486a extends InterfaceC16633f {

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.widget.a$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m81285a(InterfaceC19486a interfaceC19486a, ShorttvModel.UGCVideo uGCVideo, ShortTvDetailListFragment shortTvDetailListFragment, Integer num, boolean z11, String str, String str2, boolean z12, boolean z13, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setData");
            }
            interfaceC19486a.setData(uGCVideo, shortTvDetailListFragment, num, z11, str, str2, (i11 & 64) != 0 ? false : z12, (i11 & 128) != 0 ? false : z13);
        }
    }

    long getProgress();

    void onPageRelease(int i11);

    void onPageSelected(InterfaceC16634g interfaceC16634g, ORPlayerView oRPlayerView, ShorttvModel.UGCVideo uGCVideo);

    void setData(ShorttvModel.UGCVideo uGCVideo, ShortTvDetailListFragment shortTvDetailListFragment, Integer num, boolean z11, String str, String str2, boolean z12, boolean z13);
}
